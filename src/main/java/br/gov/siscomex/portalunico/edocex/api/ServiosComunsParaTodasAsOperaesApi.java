package br.gov.siscomex.portalunico.edocex.api;

import br.gov.siscomex.portalunico.edocex.model.*;
import io.swagger.annotations.*;

import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;

/**
 * Anexação Eletrônica de Documentos
 *
 * <p>O sistema <b>Anexação Eletrônica de Documentos do Comércio Exterior</b> permite a recepção, armazenamento, anexação e consulta de documentos, relativos às operações de comércio exterior, pelos intervenientes e diversos órgãos de governo envolvidos no controle das importações e exportações.<br/><br/>A primeira etapa na integração com o sistema Anexação é obter os metadados (tipo de documento e palavras-chave) que podem ser utilizadas para anexar documentos.<br/><br/>Os tipos de documentos disponíveis podem ser obtidos de duas maneiras:<br/><br/>\\* <strong><i>pelo número do dossiê</i></strong> para os tipos de operações DI, LI, RE e DT.<br/>\\* <strong><i>pelo tipo de operação</i></strong>.<br/><br/>\\* em seguida será necessário <strong><i>consultar as palavras-chave</i></strong> do tipo de documento que está sendo anexado.<br/><br/>Tendo obtido os metadados acima, será possível enviar o documento (arquivo) e a assinatura (arquivo p7s) do documento codificado em base64 utilizando um dos dois serviços disponíveis, lembrando que a palavra-chave obrigatória deve ser a primeira da lista de palavras-chave:<br/>\\* <strong><i>anexar documento ao dossiê</i></strong> para os tipos de operações DI, LI, RE e DT.<br/>\\* <strong><i>anexar documento à operação</i></strong><br/><br/>Para gerar a assinatura do documento no formato PKCS#7 sem o conteúdo anexado (CAdES detached) podem ser utilizados:<br/>\\* o <a target='_blank' href='https://www.serpro.gov.br/links-fixos-superiores/assinador-digital/assinador-serpro'>Assinador Serpro</a> de forma interativa<br/>\\* o componente Java <a target='_blank' href='https://www.frameworkdemoiselle.gov.br/v3/signer/'>Demoiselle Signer</a> item <a target='_blank' href='https://www.frameworkdemoiselle.gov.br/v3/signer/docs/policy-impl-cades-funcionalidades.html#policy-impl-cades-funcionalidades-assinar-detached'>Assinatura Digital no Formato PKCS#7/CAdES sem o conteúdo anexado (detached)</a> para implementação em sistemas próprios.<br/><br/>Para os tipos de operação DI, LI, RE e DT, caso não exista um dossiê vinculado, é possível criar e vincular o dossiê à respectiva operação. Ao criar dossiês (apenas operações do tipo DI, LI, RE e DT), será necessário indicar o id do tipo de dossiê que se deseja criar. Para consultar os ids e os tipos de dossiês disponíveis para o tipo de operação em questão, primeiro utilize o serviço <i>Consultar tipos de documentos que podem ser utilizados no tipo de operação</i>. Após a consulta, utilize os serviços abaixo:<br/><br/>\\* <strong><i>criar dossiê</i></strong> e<br/>\\* <strong><i>vincular dossiê à operação</i></strong><h4>URLs de Acesso</h4><p>Para utilizar os servi&ccedil;os dispon&iacute;veis nessa API deve-se seguir o seguinte padr&atilde;o de URL:</p><p><em>https://{ambiente}/<strong>edocex</strong>/api/{servi&ccedil;o}</em></p><p>Onde, em <strong>{ambiente}</strong> deve-se informar o ambiente desejado dentro os ambientes dispon&iacute;veis na tabela abaixo e em <strong>{servi&ccedil;o}</strong> utilizar a URL do servi&ccedil;o desejado.</p><style type=\"text/css\">.tg  {border-collapse:collapse;border-color:#bbb;border-spacing:0;width: 604px;}.tg td{background-color:#E0FFEB;border-color:#bbb;border-style:solid;border-width:1px;color:#594F4F;  font-family:Arial, sans-serif;font-size:14px;overflow:hidden;padding:10px 5px;word-break:normal;}.tg th{background-color:#9DE0AD;border-color:#bbb;border-style:solid;border-width:1px;color:#493F3F;  font-family:Arial, sans-serif;font-size:14px;font-weight:normal;overflow:hidden;padding:10px 5px;word-break:normal;}.tg .tg-cabecalho{text-align:left;vertical-align:top}.tg .tg-corpo{border-color:inherit;text-align:left;vertical-align:top}</style><table class=\"tg\" style=\"width: 604px;\"><thead><tr>    <th class=\"tg-cabecalho\"><span style=\"font-weight:bold\">Nome do Ambiente</span></th>    <th class=\"tg-cabecalho\"><span style=\"font-weight:bold\">URL de acesso</span></th></tr></thead><tbody><tr>    <td class=\"tg-corpo\">Ambiente de Validação das Empresas</td>    <td class=\"tg-corpo\">val.portalunico.siscomex.gov.br</td></tr><tr>    <td class=\"tg-corpo\">Ambiente de Produção</td>    <td class=\"tg-corpo\">portalunico.siscomex.gov.br</td></tr></tbody></table><p>&nbsp;</p><p><strong>Exemplo:</strong> Para o servi&ccedil;o \"Consultar tipos de documentos que podem ser utilizados no tipo de operação\" a URL &eacute; \"ext/tipos-documentos-operacao/{tipoOperacao}\".</p><p>Logo, abaixo temos um exemplo de URL completa considerando o ambiente de produ&ccedil;&atilde;o, consumindo este servi&ccedil;o </p><p><em>https://portalunico.siscomex.gov.br/edocex/api/ext/tipos-documentos-operacao/DI</em></p>
 *
 */
@Path("/")
@Api(value = "/", description = "")
public interface ServiosComunsParaTodasAsOperaesApi  {

    /**
     * Anexar documento à operação.
     *
     * Esse serviço somente poderá ser utilizado quando houver apenas um dossiê vinculado à operação e para os seguintes tipos de operações:&lt;ul&gt;&lt;li&gt;DI - Declaração de Importação&lt;br/&gt;&lt;/li&gt;&lt;li&gt;LI - Licença de Importação&lt;br/&gt;&lt;/li&gt;&lt;li&gt;RE - Registro de Exportação&lt;br/&gt;&lt;/li&gt;&lt;li&gt;DT - Declaração de Trânsito&lt;br/&gt;&lt;/li&gt;&lt;li&gt;DIR - Declaração de Importação de Remessa&lt;br/&gt;&lt;/li&gt;&lt;li&gt;DUE - Declaração Única de Exportação&lt;br/&gt;&lt;/li&gt;&lt;li&gt;DUIMP - Declaração Única de Importação,&lt;br/&gt;&lt;/li&gt;&lt;li&gt;CATP - Catálogo de Produtos&lt;br/&gt;&lt;/li&gt;&lt;li&gt;LPCO - Tratamento Administrativo/LPCO&lt;br/&gt;&lt;/li&gt;&lt;/ul&gt;
     *
     */
    @POST
    @Path("/ext/documentos-operacao")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Anexar documento à operação.", notes = "Esse serviço somente poderá ser utilizado quando houver apenas um dossiê vinculado à operação e para os seguintes tipos de operações:<ul><li>DI - Declaração de Importação<br/></li><li>LI - Licença de Importação<br/></li><li>RE - Registro de Exportação<br/></li><li>DT - Declaração de Trânsito<br/></li><li>DIR - Declaração de Importação de Remessa<br/></li><li>DUE - Declaração Única de Exportação<br/></li><li>DUIMP - Declaração Única de Importação,<br/></li><li>CATP - Catálogo de Produtos<br/></li><li>LPCO - Tratamento Administrativo/LPCO<br/></li></ul>", tags={ "Serviços comuns para todas as operações" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = RetornoAnexarDocumento.class),
        @ApiResponse(code = 400, message = "Requisição mal formatada"),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 404, message = "Recurso não encontrado"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
        @ApiResponse(code = 500, message = "Erro interno no servidor") })
    public Response anexarDocumentoPorOperacao(@ApiParam(value = "Arquivo, assinatura digital e dados do documento" ,required=true)@Valid ParametroAnexarDocumentoPorOperacao body, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Recuperado no parâmetro Set-Token no response da autenticação." ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Recuperado no parâmetro X-CSRF-Token no response da autenticação." ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * Consultar documentos de uma operação.
     *
     * &lt;a rel&#x3D;\&quot;noopener noreferrer\&quot; href&#x3D;\&quot;../pages/exemplos/anex/anex-documentos-operacao-consultar/\&quot;&gt;Exemplos adicionais do sistema Anexação&lt;/a&gt;
     *
     */
    @GET
    @Path("/ext/documentos-operacao/{tipoOperacao}/{numeroOperacao}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Consultar documentos de uma operação.", notes = "<a rel=\"noopener noreferrer\" href=\"../pages/exemplos/anex/anex-documentos-operacao-consultar/\">Exemplos adicionais do sistema Anexação</a>", tags={ "Serviços comuns para todas as operações" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = RetornoConsultarDocumentoPorOperacao.class),
        @ApiResponse(code = 400, message = "Requisição mal formatada"),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 404, message = "Recurso não encontrado"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
        @ApiResponse(code = 500, message = "Erro interno no servidor") })
    public Response consultarDocumentoOperacao(@ApiParam(value = "Identifica o tipo de operação desejado:<br/>DI - Declaração de Importação<br/>LI - Licença de Importação<br/>RE - Registro de Exportação<br/>DT - Declaração de Trânsito<br/>DIR - Declaração de Importação de Remessa<br/>CATP - Catálogo de Produtos<br/>DUE - Declaração Única de Exportação<br/>DUIMP - Declaração Única de Importação,<br/>LPCO - Tratamento Administrativo/LPCO<br/>",required=true, allowableValues="DI, LI, RE, DT, DIR, CATP, DUE, DUIMP, LPCO") @PathParam("tipoOperacao") String tipoOperacao, @ApiParam(value = "Número da operação.<br/>Tamanho máximo: 255<br/>Formato: de acordo com o definido em cada sistema de origem do tipo de operação.<br/><br/>Para CATP - Catálogo de Produtos<br/>Formato: <CNPJ Raíz ou CPF>-<código do produto><br/>onde:<br/><CNPJ Raíz> = NNNNNNNN - 8 primeiros dígitos do CNPJ<br/>&lt;CPF&gt; = NNNNNNNNNNN - 11 dígitos do CPF. É utilizado quando o usuário se auto representa como importador/exportador.<br/><código do produto> = NNNNNNNNNN - 10 dígitos do código do produto gerado no CATP - Catálogo de Produtos<br/><br/>Exemplo: para CNPJ 00000000-0000001049, para CPF 01646244907-0000000001",required=true) @PathParam("numeroOperacao") String numeroOperacao, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Recuperado no parâmetro Set-Token no response da autenticação." ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Recuperado no parâmetro X-CSRF-Token no response da autenticação." ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * Consultar palavras-chaves que podem ser utilizadas no tipo de documento.
     *
     */
    @GET
    @Path("/ext/tipos-documentos/{idTipoDocumento}/palavras-chave")
    @Produces({ "application/json" })
    @ApiOperation(value = "Consultar palavras-chaves que podem ser utilizadas no tipo de documento.", notes = "", tags={ "Serviços comuns para todas as operações" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = RetornoConsultarPalavrasChave.class),
        @ApiResponse(code = 400, message = "Requisição mal formatada"),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 404, message = "Recurso não encontrado"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
        @ApiResponse(code = 500, message = "Erro interno no servidor") })
    public Response consultarMetadados(@ApiParam(value = "Id do tipo de documento.<br/>Valor mínimo: 1<br/>Valor máximo: 2147483647",required=true) @PathParam("idTipoDocumento") Integer idTipoDocumento, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Recuperado no parâmetro Set-Token no response da autenticação." ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Recuperado no parâmetro X-CSRF-Token no response da autenticação." ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * Consultar tipos de documentos que podem ser utilizados no tipo de operação.
     *
     * &lt;a rel&#x3D;\&quot;noopener noreferrer\&quot; href&#x3D;\&quot;../pages/exemplos/anex/anex-tipos-documento-operacao/\&quot;&gt;Exemplos adicionais do sistema Anexação&lt;/a&gt;
     *
     */
    @GET
    @Path("/ext/tipos-documentos-operacao/{tipoOperacao}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Consultar tipos de documentos que podem ser utilizados no tipo de operação.", notes = "<a rel=\"noopener noreferrer\" href=\"../pages/exemplos/anex/anex-tipos-documento-operacao/\">Exemplos adicionais do sistema Anexação</a>", tags={ "Serviços comuns para todas as operações" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = RetornoConsultarTiposDocumento.class),
        @ApiResponse(code = 400, message = "Requisição mal formatada"),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 404, message = "Recurso não encontrado"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
        @ApiResponse(code = 500, message = "Erro interno no servidor") })
    public Response consultarTiposDocumentoPorOperacao(@ApiParam(value = "Identifica o tipo de operação desejado:<br/>DI - Declaração de Importação<br/>LI - Licença de Importação<br/>RE - Registro de Exportação<br/>DT - Declaração de Trânsito<br/>DIR - Declaração de Importação de Remessa<br/>CATP - Catálogo de Produtos<br/>DUE - Declaração Única de Exportação<br/>DUIMP - Declaração Única de Importação,<br/>LPCO - Tratamento Administrativo/LPCO<br/>",required=true, allowableValues="DI, LI, RE, DT, DIR, CATP, DUE, DUIMP, LPCO") @PathParam("tipoOperacao") String tipoOperacao, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Recuperado no parâmetro Set-Token no response da autenticação." ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Recuperado no parâmetro X-CSRF-Token no response da autenticação." ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * Download do documento pelo seu id.
     *
     */
    @GET
    @Path("/ext/documentos/download/{idDocumento}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Download do documento pelo seu id.", notes = "", tags={ "Serviços comuns para todas as operações" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = RetornoDownloadDocumento.class),
        @ApiResponse(code = 400, message = "Requisição mal formatada"),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 404, message = "Recurso não encontrado"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
        @ApiResponse(code = 500, message = "Erro interno no servidor") })
    public Response downloadDocumentoId(@ApiParam(value = "Id do documento.<br/>Valor mínimo: 1<br/>Valor máximo: 9223372036854775807",required=true) @PathParam("idDocumento") Long idDocumento, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Recuperado no parâmetro Set-Token no response da autenticação." ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Recuperado no parâmetro X-CSRF-Token no response da autenticação." ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken);
}

