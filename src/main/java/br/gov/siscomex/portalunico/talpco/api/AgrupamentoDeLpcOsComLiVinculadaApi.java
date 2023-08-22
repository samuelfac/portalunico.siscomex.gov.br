package br.gov.siscomex.portalunico.talpco.api;

import br.gov.siscomex.portalunico.talpco.model.AgrupamentoLpco;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;
import io.swagger.jaxrs.PATCH;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Tratamento Administrativo, Licenças, Permissões, Certificações e Outros Documentos
 *
 * <p><h3>TALPCO - Tratamento Administrativo, Licen&ccedil;as, Permiss&otilde;es, Certificados e Outros</h3><h4>Introdu&ccedil;&atilde;o</h4><p>Bem-vindo &agrave; API do sistema Pucomex - TALPCO.</p><p>O TALPCO &eacute; o sistema respons&aacute;vel pelo controle de documentos LPCO (Licen&ccedil;as, Permiss&otilde;es, Certificados e Outros) necess&aacute;rios para opera&ccedil;&otilde;es de com&eacute;rcio exterior. A partir deste sistema, &eacute; poss&iacute;vel gerenciar v&aacute;rias opera&ccedil;&otilde;es relativas aos LPCOs, desde a consulta de modelos de LPCO dispon&iacute;veis at&eacute; o cadastro de pedidos de LPCO e seu acompanhamento.</p><p>As opera&ccedil;&otilde;es que podem ser gerenciadas pela API do sistema s&atilde;o:</p><ul><li>Consulta de modelos de LPCOs</li><li>Cadastro de LPCOs</li><li>Consulta de LPCOs</li><li>Altera&ccedil;&otilde;es de situa&ccedil;&atilde;o (an&aacute;lise, deferimento, entre outros)</li><li>Controle de exig&ecirc;ncias</li><li>Altera&ccedil;&atilde;o e retifica&ccedil;&atilde;o de LPCOs</li><li>Solicita&ccedil;&atilde;o de compabiliza&ccedil;&atilde;o de LPCO</li><li>Controle de Prorroga&ccedil;&otilde;es</li></ul><h4>URLs de Acesso</h4><p>Para utilizar os servi&ccedil;os dispon&iacute;veis, deve-se considerar a maneira de autentica&ccedil;&atilde;o de cada servi&ccedil;o, conforme padr&atilde;o Portal &Uacute;nico do Com&eacute;rcio Exterior para os servi&ccedil;os, com exce&ccedil;&atilde;o da Consultar LPCO por Chave de Acesso para o perfil de TERCEIROS. Segue abaixo os padr&otilde;es:</p><h4>Padr&atilde;o Portal &Uacute;nico do Com&eacute;rcio Exterior</h4><p><em>https://{ambiente}/<strong>talpco</strong>/api/{servi&ccedil;o}</em></p><p>Onde, em <strong>{ambiente}</strong> deve-se informar o ambiente desejado dentre os ambientes dispon&iacute;veis na tabela abaixo e em <strong>{servi&ccedil;o}</strong> utilizar a URI do servi&ccedil;o desejado.</p><style type=\"text/css\"> .tg  {border-collapse:collapse;border-color:#bbb;border-spacing:0;width: 604px;} .tg td{background-color:#E0FFEB;border-color:#bbb;border-style:solid;border-width:1px;color:#594F4F;  font-family:Arial, sans-serif;font-size:14px;overflow:hidden;padding:10px 5px;word-break:normal;} .tg th{background-color:#9DE0AD;border-color:#bbb;border-style:solid;border-width:1px;color:#493F3F;  font-family:Arial, sans-serif;font-size:14px;font-weight:normal;overflow:hidden;padding:10px 5px;word-break:normal;} .tg  .tg-cabecalho{text-align:left;vertical-align:top}.tg  .tg-corpo{border-color:inherit;text-align:left;vertical-align:top}</style><table class=\"tg\" style=\"width: 604px;\"><thead><tr><th class=\"tg-cabecalho\"><span style=\"font-weight:bold\">Nome do Ambiente</span></th><th class=\"tg-cabecalho\"><span style=\"font-weight:bold\">URL de acesso</span></th></tr></thead><tbody><tr><td class=\"tg-corpo\">Ambiente de Validação das Empresas</td><td class=\"tg-corpo\">val.portalunico.siscomex.gov.br</td></tr><tr><td class=\"tg-corpo\">Ambiente de Produção</td><td class=\"tg-corpo\">portalunico.siscomex.gov.br</td></tr></tbody></table><p>&nbsp;</p><p><strong>Exemplo:</strong> Para o servi&ccedil;o \"Detalhar LPCO\" a URI &eacute; \"/ext/lpco/{numero}\".&nbsp;Logo, abaixo temos um exemplo de URL completa considerando o ambiente de Valida&ccedil;&atilde;o, consumindo este servi&ccedil;o.</p><p><em>https://val.portalunico.siscomex.gov.br/talpco/api/ext/lpco/E2000000001</em></p><p>Há exemplos específicos para o serviço de \"Cadastrar um pedido de LPCO\" tanto para <a target='_blank' href='../pages/exemplos/talp/lpco-exportacao'>a exportação</a> quanto para <a target='_blank' href='../pages/exemplos/talp/lpco-importacao'>a importação</a>.</p><h4>Padr&atilde;o Integra Comex</h4><p>A Consulta LPCO por Chave de Acesso para o perfil de TERCEIROS est&aacute; integrada do barramento Integra Comex. Para maiores informa&ccedil;&otilde;es:</p><p><a href='https://doc-siscomex-sapi.estaleiro.serpro.gov.br/integracomex/documentacao/lpco/consulta-avulsa.html'>https://doc-siscomex sapi.estaleiro.serpro.gov.br/integracomex/documentacao/lpco/consulta-avulsa.html</a></p><p>Favor atentar que a documentação do Integra Comex referencia somente a autenticação e maneira de consumo do serviço.Definições de modelos ainda permanecem nesta documentação.</p><h4>Orientação Passo a Passo</h4><ul><li>Consultar o simulador para identificar os modelos LPCO aplicáveis à operação (<a target='_blank' href='https://portalunico.siscomex.gov.br/talpco/#/simular-ta?perfil=publico'>exportação</a> ou <a target='_blank' href='https://portalunico.siscomex.gov.br/talpco/#/simular-ta-importacao?perfil=publico'>importação</a>);</li><li>Consultar a estrutura base do modelo desejado nos serviço de <a target='_blank' href='./talpco.html#/Modelos%20e%20templates%20de%20LPCOs/obterTemplateFormulario'>obter template de formulário</a>;</li><li>Consultar eventuais atributos adicionais de cada NCM no serviço de <a target='_blank' href='./talpco.html#/Modelos%20e%20templates%20de%20LPCOs/obterTemplateNcm'>obter template de NCM</a>;</li><li>Consultar informações de fundamento legal no serviço do <a target='_blank' href='./ttce.html#/Serviços%20para%20o%20importador/downloadUsingGET_1'>Tratamento Tributário para o importador</a> (se aplicável);</li><li>Consultar informações do produto no Catálogo de Produtos (para os LPCO que utilizam o catálogo de produtos);</li><li>Registrar pedido de LPCO utilizando o serviço de <a target='_blank' href='./talpco.html#/Cadastro%2C%20edição%20e%20consultas%20de%20LPCOs/incluirLpco'>cadastrar pedido de LPCO</a>.</li></ul>
 *
 */
@Path("/")
@Api(value = "/", description = "")
public interface AgrupamentoDeLpcOsComLiVinculadaApi  {

    /**
     * Altera os LPCOs que fazer parte de um agrupamento.
     *
     */
    @PUT
    @Path("/ext/lpco/agrupamento/{chaveAgrupamento}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Altera os LPCOs que fazer parte de um agrupamento.", notes = "", tags={ "Agrupamento de LPCOs com LI vinculada" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = AgrupamentoLpco.class),
        @ApiResponse(code = 204, message = "Operação realizada com sucesso. Nemhum conteúdo retornado"),
        @ApiResponse(code = 400, message = "Requisição mal formatada"),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
        @ApiResponse(code = 500, message = "Erro interno no servidor") })
    public Response alterarAgrupamento(@ApiParam(value = "Lista de números de LPCO que devem fazer parte do agrupamento após a alteração.<br>" ,required=true)@Valid List<String> body, @ApiParam(value = "Chave de identificação do agrupamento.<br>Tamanho: 32<br>Formato: caracteres hexadecimais",required=true) @PathParam("chaveAgrupamento") String chaveAgrupamento, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token é recuperado no parâmetro Set-Token no response da autenticação" ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Este token é recuperado no parâmetro X-CSRF-Token no response da autenticação" ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * Cria um agrupamento de LPCOs.
     *
     */
    @POST
    @Path("/ext/lpco/agrupamento")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Cria um agrupamento de LPCOs.", notes = "", tags={ "Agrupamento de LPCOs com LI vinculada" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = AgrupamentoLpco.class),
        @ApiResponse(code = 204, message = "Operação realizada com sucesso. Nemhum conteúdo retornado"),
        @ApiResponse(code = 400, message = "Requisição mal formatada"),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
        @ApiResponse(code = 500, message = "Erro interno no servidor") })
    public Response criarAgrupamento(@ApiParam(value = "Lista de números de LPCO que devem fazer parte do agrupamento.<br>" ,required=true)@Valid List<String> body, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token é recuperado no parâmetro Set-Token no response da autenticação" ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Este token é recuperado no parâmetro X-CSRF-Token no response da autenticação" ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * Recuperar os dados de um agrupamento de LPCOs
     *
     */
    @GET
    @Path("/ext/lpco/agrupamento")
    @Produces({ "application/json" })
    @ApiOperation(value = "Recuperar os dados de um agrupamento de LPCOs", notes = "", tags={ "Agrupamento de LPCOs com LI vinculada" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = AgrupamentoLpco.class),
        @ApiResponse(code = 204, message = "Operação realizada com sucesso. Nemhum conteúdo retornado"),
        @ApiResponse(code = 400, message = "Requisição mal formatada"),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
        @ApiResponse(code = 500, message = "Erro interno no servidor") })
    public Response getDadosAgrupamento(@ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token é recuperado no parâmetro Set-Token no response da autenticação" ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Este token é recuperado no parâmetro X-CSRF-Token no response da autenticação" ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken,  @ApiParam(value = "Número de um LPCO que faz parte do agrupamento.<br>Tamanho: 11<br>Formato: OAANNNNNNNN<br>Lei de formação: O número do LPCO é composto por:<br>* O = Operação (E para exportação, I para importação)<br>* AA = Ano do registro do LPCO<br>* NNNNNNNN = Número sequencial do LPCO no ano")  @QueryParam("numeroLpco") String numeroLpco,  @ApiParam(value = "Chave de identificação do agrupamento.<br>Tamanho: 32<br>Formato: caracteres hexadecimais")  @QueryParam("chaveAgrupamento") String chaveAgrupamento);
}

