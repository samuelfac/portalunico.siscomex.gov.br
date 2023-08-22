package br.gov.siscomex.portalunico.edocex.api;

import br.gov.siscomex.portalunico.edocex.model.ParametroAnexarDocumentoPorDossie;
import br.gov.siscomex.portalunico.edocex.model.ParametroCriarDossie;
import br.gov.siscomex.portalunico.edocex.model.ParametroVincularOperacaoAoDossie;
import br.gov.siscomex.portalunico.edocex.model.RetornoAnexarDocumento;
import br.gov.siscomex.portalunico.edocex.model.RetornoConsultarDocumentoPorDossie;
import br.gov.siscomex.portalunico.edocex.model.RetornoConsultarTiposDocumento;
import br.gov.siscomex.portalunico.edocex.model.RetornoCriarDossie;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

/**
 * Anexação Eletrônica de Documentos
 *
 * <p>O sistema <b>Anexação Eletrônica de Documentos do Comércio Exterior</b> permite a recepção, armazenamento, anexação e consulta de documentos, relativos às operações de comércio exterior, pelos intervenientes e diversos órgãos de governo envolvidos no controle das importações e exportações.<br/><br/>A primeira etapa na integração com o sistema Anexação é obter os metadados (tipo de documento e palavras-chave) que podem ser utilizadas para anexar documentos.<br/><br/>Os tipos de documentos disponíveis podem ser obtidos de duas maneiras:<br/><br/>\\* <strong><i>pelo número do dossiê</i></strong> para os tipos de operações DI, LI, RE e DT.<br/>\\* <strong><i>pelo tipo de operação</i></strong>.<br/><br/>\\* em seguida será necessário <strong><i>consultar as palavras-chave</i></strong> do tipo de documento que está sendo anexado.<br/><br/>Tendo obtido os metadados acima, será possível enviar o documento (arquivo) e a assinatura (arquivo p7s) do documento codificado em base64 utilizando um dos dois serviços disponíveis, lembrando que a palavra-chave obrigatória deve ser a primeira da lista de palavras-chave:<br/>\\* <strong><i>anexar documento ao dossiê</i></strong> para os tipos de operações DI, LI, RE e DT.<br/>\\* <strong><i>anexar documento à operação</i></strong><br/><br/>Para gerar a assinatura do documento no formato PKCS#7 sem o conteúdo anexado (CAdES detached) podem ser utilizados:<br/>\\* o <a target='_blank' href='https://www.serpro.gov.br/links-fixos-superiores/assinador-digital/assinador-serpro'>Assinador Serpro</a> de forma interativa<br/>\\* o componente Java <a target='_blank' href='https://www.frameworkdemoiselle.gov.br/v3/signer/'>Demoiselle Signer</a> item <a target='_blank' href='https://www.frameworkdemoiselle.gov.br/v3/signer/docs/policy-impl-cades-funcionalidades.html#policy-impl-cades-funcionalidades-assinar-detached'>Assinatura Digital no Formato PKCS#7/CAdES sem o conteúdo anexado (detached)</a> para implementação em sistemas próprios.<br/><br/>Para os tipos de operação DI, LI, RE e DT, caso não exista um dossiê vinculado, é possível criar e vincular o dossiê à respectiva operação. Ao criar dossiês (apenas operações do tipo DI, LI, RE e DT), será necessário indicar o id do tipo de dossiê que se deseja criar. Para consultar os ids e os tipos de dossiês disponíveis para o tipo de operação em questão, primeiro utilize o serviço <i>Consultar tipos de documentos que podem ser utilizados no tipo de operação</i>. Após a consulta, utilize os serviços abaixo:<br/><br/>\\* <strong><i>criar dossiê</i></strong> e<br/>\\* <strong><i>vincular dossiê à operação</i></strong><h4>URLs de Acesso</h4><p>Para utilizar os servi&ccedil;os dispon&iacute;veis nessa API deve-se seguir o seguinte padr&atilde;o de URL:</p><p><em>https://{ambiente}/<strong>edocex</strong>/api/{servi&ccedil;o}</em></p><p>Onde, em <strong>{ambiente}</strong> deve-se informar o ambiente desejado dentro os ambientes dispon&iacute;veis na tabela abaixo e em <strong>{servi&ccedil;o}</strong> utilizar a URL do servi&ccedil;o desejado.</p><style type=\"text/css\">.tg  {border-collapse:collapse;border-color:#bbb;border-spacing:0;width: 604px;}.tg td{background-color:#E0FFEB;border-color:#bbb;border-style:solid;border-width:1px;color:#594F4F;  font-family:Arial, sans-serif;font-size:14px;overflow:hidden;padding:10px 5px;word-break:normal;}.tg th{background-color:#9DE0AD;border-color:#bbb;border-style:solid;border-width:1px;color:#493F3F;  font-family:Arial, sans-serif;font-size:14px;font-weight:normal;overflow:hidden;padding:10px 5px;word-break:normal;}.tg .tg-cabecalho{text-align:left;vertical-align:top}.tg .tg-corpo{border-color:inherit;text-align:left;vertical-align:top}</style><table class=\"tg\" style=\"width: 604px;\"><thead><tr>    <th class=\"tg-cabecalho\"><span style=\"font-weight:bold\">Nome do Ambiente</span></th>    <th class=\"tg-cabecalho\"><span style=\"font-weight:bold\">URL de acesso</span></th></tr></thead><tbody><tr>    <td class=\"tg-corpo\">Ambiente de Validação das Empresas</td>    <td class=\"tg-corpo\">val.portalunico.siscomex.gov.br</td></tr><tr>    <td class=\"tg-corpo\">Ambiente de Produção</td>    <td class=\"tg-corpo\">portalunico.siscomex.gov.br</td></tr></tbody></table><p>&nbsp;</p><p><strong>Exemplo:</strong> Para o servi&ccedil;o \"Consultar tipos de documentos que podem ser utilizados no tipo de operação\" a URL &eacute; \"ext/tipos-documentos-operacao/{tipoOperacao}\".</p><p>Logo, abaixo temos um exemplo de URL completa considerando o ambiente de produ&ccedil;&atilde;o, consumindo este servi&ccedil;o </p><p><em>https://portalunico.siscomex.gov.br/edocex/api/ext/tipos-documentos-operacao/DI</em></p>
 *
 */
@Path("/")
@Api(value = "/", description = "")
public interface ServiosParaOperaesDiLiReDtEDirApi  {

    /**
     * Anexar documento ao dossiê.
     *
     * Esse serviço somente poderá ser utilizado para dossiês dos seguintes tipos de operações:&lt;ul&gt;&lt;li&gt;DI - Declaração de Importação&lt;br/&gt;&lt;/li&gt;&lt;li&gt;LI - Licença de Importação&lt;br/&gt;&lt;/li&gt;&lt;li&gt;RE - Registro de Exportação&lt;br/&gt;&lt;/li&gt;&lt;li&gt;DT - Declaração de Trânsito&lt;br/&gt;&lt;/li&gt;&lt;li&gt;DIR - Declaração de Importação de Remessa&lt;br/&gt;&lt;/li&gt;&lt;/ul&gt;
     *
     */
    @POST
    @Path("/ext/documentos-dossie")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Anexar documento ao dossiê.", notes = "Esse serviço somente poderá ser utilizado para dossiês dos seguintes tipos de operações:<ul><li>DI - Declaração de Importação<br/></li><li>LI - Licença de Importação<br/></li><li>RE - Registro de Exportação<br/></li><li>DT - Declaração de Trânsito<br/></li><li>DIR - Declaração de Importação de Remessa<br/></li></ul>", tags={ "Serviços para operações DI, LI, RE, DT e DIR" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = RetornoAnexarDocumento.class),
        @ApiResponse(code = 400, message = "Requisição mal formatada"),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 404, message = "Recurso não encontrado"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
        @ApiResponse(code = 500, message = "Erro interno no servidor") })
    public Response anexarDocumentoPorDossie(@ApiParam(value = "Arquivo, assinatura digital e dados do documento" ,required=true)@Valid ParametroAnexarDocumentoPorDossie body, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Recuperado no parâmetro Set-Token no response da autenticação." ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Recuperado no parâmetro X-CSRF-Token no response da autenticação." ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * Consultar documentos do dossiê.
     *
     * Esse serviço somente poderá ser utilizado para dossiês dos seguintes tipos de operações:&lt;ul&gt;&lt;li&gt;DI - Declaração de Importação&lt;br/&gt;&lt;/li&gt;&lt;li&gt;LI - Licença de Importação&lt;br/&gt;&lt;/li&gt;&lt;li&gt;RE - Registro de Exportação&lt;br/&gt;&lt;/li&gt;&lt;li&gt;DT - Declaração de Trânsito&lt;br/&gt;&lt;/li&gt;&lt;li&gt;DIR - Declaração de Importação de Remessa&lt;br/&gt;&lt;/li&gt;&lt;/ul&gt;
     *
     */
    @GET
    @Path("/ext/documentos-dossie/{numeroDossie}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Consultar documentos do dossiê.", notes = "Esse serviço somente poderá ser utilizado para dossiês dos seguintes tipos de operações:<ul><li>DI - Declaração de Importação<br/></li><li>LI - Licença de Importação<br/></li><li>RE - Registro de Exportação<br/></li><li>DT - Declaração de Trânsito<br/></li><li>DIR - Declaração de Importação de Remessa<br/></li></ul>", tags={ "Serviços para operações DI, LI, RE, DT e DIR" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = RetornoConsultarDocumentoPorDossie.class),
        @ApiResponse(code = 400, message = "Requisição mal formatada"),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 404, message = "Recurso não encontrado"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
        @ApiResponse(code = 500, message = "Erro interno no servidor") })
    public Response consultarDocumentoDossie(@ApiParam(value = "Número do dossiê.<br/>Tamanho: 15<br/>Formato: NNNNNNNNNNNNNNN",required=true) @PathParam("numeroDossie") String numeroDossie, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Recuperado no parâmetro Set-Token no response da autenticação." ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Recuperado no parâmetro X-CSRF-Token no response da autenticação." ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * Consultar tipos de documentos que podem ser utilizados no dossiê.
     *
     */
    @GET
    @Path("/ext/tipos-documentos-dossie/{numeroDossie}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Consultar tipos de documentos que podem ser utilizados no dossiê.", notes = "", tags={ "Serviços para operações DI, LI, RE, DT e DIR" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = RetornoConsultarTiposDocumento.class),
        @ApiResponse(code = 400, message = "Requisição mal formatada"),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 404, message = "Recurso não encontrado"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
        @ApiResponse(code = 500, message = "Erro interno no servidor") })
    public Response consultarTiposDocumentoPorDossie(@ApiParam(value = "Número do dossiê.<br/>Tamanho: 15<br/>Formato: NNNNNNNNNNNNNNN",required=true) @PathParam("numeroDossie") String numeroDossie, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Recuperado no parâmetro Set-Token no response da autenticação." ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Recuperado no parâmetro X-CSRF-Token no response da autenticação." ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * Criar dossiê.
     *
     */
    @POST
    @Path("/ext/dossies")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Criar dossiê.", notes = "", tags={ "Serviços para operações DI, LI, RE, DT e DIR" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = RetornoCriarDossie.class),
        @ApiResponse(code = 400, message = "Requisição mal formatada"),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 404, message = "Recurso não encontrado"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
        @ApiResponse(code = 500, message = "Erro interno no servidor") })
    public Response criarDossie(@ApiParam(value = "Dados para criar o dossiê" ,required=true)@Valid ParametroCriarDossie body, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Recuperado no parâmetro Set-Token no response da autenticação." ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Recuperado no parâmetro X-CSRF-Token no response da autenticação." ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * Vincular dossiê à operação.
     *
     * Esse serviço esta disponível apenas para os seguintes tipos de operações:&lt;ul&gt;&lt;li&gt;DI - Declaraçãoo de Importação&lt;/li&gt;&lt;li&gt;LI - Licença de Importação&lt;/li&gt;&lt;li&gt;RE - Registro de Exportação&lt;/li&gt;&lt;li&gt;DT - Declaração de Trânsito&lt;/li&gt;&lt;/ul&gt;
     *
     */
    @POST
    @Path("/ext/vinculos-dossies")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Vincular dossiê à operação.", notes = "Esse serviço esta disponível apenas para os seguintes tipos de operações:<ul><li>DI - Declaraçãoo de Importação</li><li>LI - Licença de Importação</li><li>RE - Registro de Exportação</li><li>DT - Declaração de Trânsito</li></ul>", tags={ "Serviços para operações DI, LI, RE, DT e DIR" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = Boolean.class),
        @ApiResponse(code = 400, message = "Requisição mal formatada"),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 404, message = "Recurso não encontrado"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
        @ApiResponse(code = 500, message = "Erro interno no servidor") })
    public Response vincularDossie(@ApiParam(value = "Dados para vincular o dossiê à operação" ,required=true)@Valid ParametroVincularOperacaoAoDossie body, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Recuperado no parâmetro Set-Token no response da autenticação." ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Recuperado no parâmetro X-CSRF-Token no response da autenticação." ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken);
}

