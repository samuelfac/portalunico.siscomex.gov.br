package br.gov.siscomex.portalunico.due.api;

import br.gov.siscomex.portalunico.due.model.AtoConcessorio;
import br.gov.siscomex.portalunico.due.model.DUE;
import br.gov.siscomex.portalunico.due.model.DUEResumida;
import br.gov.siscomex.portalunico.due.model.Declaration;
import br.gov.siscomex.portalunico.due.model.ExigenciaFiscalEstruturada;
import br.gov.siscomex.portalunico.due.model.Link;
import br.gov.siscomex.portalunico.due.model.PucomexReturn;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.ws.rs.Consumes;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

/**
 * Declaração Única de Exportação
 *
 * <p><p>Bem-vindo à API do sistema Pucomex - Declaração Única de Exportação.</p><p>A Declaração Única de Exportação (DU-E) reúne as informações comercias, tributárias e aduaneiras necessárias para a realização de todos os tipos de exportação. As informações prestadas pelo exportador permitem que sejam realizadas autorizações e fiscalizações por parte dos diversos órgãos competentes da administração pública brasileira na execução de suas atribuições legais.</p><p>A DU-E é elaborada a partir das informações prestadas nas notas fiscais de exportação eliminando com isso a redundância de informações a serem prestadas pelos exportadores. As informações relativas à carga, LPCO, e tributação podem ser prestadas nos momentos mais oportunos permitindo uma maior flexibilidade e agilidade no processo de exportação.</p><p>A DU-E permite que com uma consulta todo o fluxo seguido pela declaração seja visualizado tanto por parte dos operadores privados quando pelos órgãos diversos governamentais. </p><h4>URLs de Acesso</h4><p>Para utilizar os servi&ccedil;os dispon&iacute;veis nessa API deve-se seguir o seguinte padr&atilde;o de URL:</p><p><em>https://{ambiente}/<strong>due</strong>/api/{servi&ccedil;o}</em></p><p>Onde, em <strong>{ambiente}</strong> deve-se informar o ambiente desejado dentro os ambientes dispon&iacute;veis na tabela abaixo e em <strong>{servi&ccedil;o}</strong> utilizar a URI do servi&ccedil;o desejado.</p> <style type=\"text/css\">  .tg  {border-collapse:collapse;border-color:#bbb;border-spacing:0;width: 604px;}  .tg td{background-color:#E0FFEB;border-color:#bbb;border-style:solid;    border-width:1px;color:#594F4F;    font-family:Arial, sans-serif;font-size:14px;overflow:hidden;    padding:10px 5px;word-break:normal;}  .tg th{background-color:#9DE0AD;border-color:#bbb;border-style:solid;       border-width:1px;color:#493F3F;       font-family:Arial, sans-serif;font-size:14px;font-weight:normal;         overflow:hidden;padding:10px 5px;word-break:normal;}  .tg .tg-cabecalho{text-align:left;vertical-align:top}  .tg .tg-corpo{border-color:inherit;text-align:left;vertical-align:top}</style><table class=\"tg\" style=\"width: 604px;\"><thead>  <tr>    <th class=\"tg-cabecalho\">      <span style=\"font-weight:bold\">Nome do Ambiente</span>     </th>    <th class=\"tg-cabecalho\">      <span style=\"font-weight:bold\">URL de acesso</span>     </th>  </tr></thead><tbody>  <tr>    <td class=\"tg-corpo\">Ambiente de Validação da Empresas&nbsp;&nbsp;&nbsp;</td>    <td class=\"tg-corpo\">val.portalunico.siscomex.gov.br</td>  </tr>  <tr>    <td class=\"tg-corpo\">Ambiente de Produção&nbsp;&nbsp;&nbsp;</td>    <td class=\"tg-corpo\">portalunico.siscomex.gov.br</td>  </tr></tbody></table><p>&nbsp;</p><p><strong>Exemplo:</strong> Para o servi&ccedil;o \"Retorna Declaração Única de Exportação - DUE, por número\" a URI &eacute; \"due/api/ext/due/{numero}\".</p><p>Logo, abaixo temos um exemplo de URL completa considerando o ambiente de Valida&ccedil;&atilde;o, consumindo este servi&ccedil;o </p> <p><em>https://val.portalunico.siscomex.gov.br/due/api/ext/due/17BR0055562808</em></p>
 *
 */
@Path("/")
@Api(value = "/", description = "")
public interface DueApi  {

    /**
     * Altera Declaração de Documento Único de Exportação - DUE.
     *
     * &lt;p&gt;&lt;a rel&#x3D;\&quot;noopener noreferrer\&quot; href&#x3D;\&quot;../pages/exemplos/duex/registro-retificacao/\&quot;&gt;Exemplos adicionais da DUE&lt;/a&gt;&lt;br&gt;&lt;br&gt;&lt;a rel&#x3D;\&quot;noopener noreferrer\&quot; href&#x3D;\&quot;../pages/exemplos/duex/oma-xsd.zip\&quot;&gt;XSD para download&lt;/a&gt;&lt;/p&gt;
     *
     */
    @PUT
    @Path("/ext/due/{numero}")
    @Consumes({ "application/xml" })
    @Produces({ "application/xml", "application/json" })
    @ApiOperation(value = "Altera Declaração de Documento Único de Exportação - DUE.", notes = "<p><a rel=\"noopener noreferrer\" href=\"../pages/exemplos/duex/registro-retificacao/\">Exemplos adicionais da DUE</a><br><br><a rel=\"noopener noreferrer\" href=\"../pages/exemplos/duex/oma-xsd.zip\">XSD para download</a></p>", tags={ "due" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = PucomexReturn.class),
        @ApiResponse(code = 400, message = "Requisição mal formatada"),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
        @ApiResponse(code = 500, message = "Erro interno no servidor") })
    public Response alterar(@ApiParam(value = "" ,required=true)@Valid Declaration body, @ApiParam(value = "Número da DUE<br />Tamanho: 14<br />Formato: 'NNAANNNNNNNNNN'",required=true) @PathParam("numero") String numero, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token é recuperado no parâmetro Set-Token no response da autenticação" ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Este token é recuperado no parâmetro X-CSRF-Token no response da autenticação" ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * Consulta que retorna uma lista de Links para as DUEs encontradas.
     *
     */
    @GET
    @Path("/ext/due")
    @Produces({ "application/json" })
    @ApiOperation(value = "Consulta que retorna uma lista de Links para as DUEs encontradas.", notes = "", tags={ "due" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = Link.class, responseContainer = "List"),
        @ApiResponse(code = 204, message = "Operação realizada com sucesso. Nenhum conteúdo retornado"),
        @ApiResponse(code = 400, message = "Requisição mal formatada"),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 500, message = "Erro interno no servidor") })
    public Response buscar( @NotNull @ApiParam(value = "Chave de acesso da Nota Fiscal<br />Tamanho: 44<br />Formato: 'NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN'",required=true)  @QueryParam("nota-fiscal") String notaFiscal, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token é recuperado no parâmetro Set-Token no response da autenticação" ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Este token é recuperado no parâmetro X-CSRF-Token no response da autenticação" ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * Consulta DUE com dados resumidos.
     *
     */
    @GET
    @Path("/ext/due/consultarDadosResumidosDUE")
    @Produces({ "application/json" })
    @ApiOperation(value = "Consulta DUE com dados resumidos.", notes = "", tags={ "due" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = DUEResumida.class),
        @ApiResponse(code = 204, message = "Operação realizada com sucesso. Nenhum conteúdo retornado"),
        @ApiResponse(code = 400, message = "Requisição mal formatada"),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
        @ApiResponse(code = 500, message = "Erro interno no servidor") })
    public Response consultarDadosResumidosDUE( @NotNull @ApiParam(value = "Número da DUE<br />Tamanho: 14<br />Formato: 'NNAANNNNNNNNNN'<br />ou<br />RUC - Número da referência única de carga<br />Tamanho: 35<br />Formato: 'NAANNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN'",required=true)  @QueryParam("numero") String numero, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token é recuperado no parâmetro Set-Token no response da autenticação" ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Este token é recuperado no parâmetro X-CSRF-Token no response da autenticação" ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * Serviço para criação do documento único de exportação - DUE.
     *
     * &lt;p&gt;&lt;a rel&#x3D;\&quot;noopener noreferrer\&quot; href&#x3D;\&quot;../pages/exemplos/duex/registro-retificacao/\&quot;&gt;Exemplos adicionais da DUE&lt;/a&gt;&lt;br&gt;&lt;br&gt;&lt;a rel&#x3D;\&quot;noopener noreferrer\&quot; href&#x3D;\&quot;../pages/exemplos/duex/oma-xsd.zip\&quot;&gt;XSD para download&lt;/a&gt;&lt;/p&gt;
     *
     */
    @POST
    @Path("/ext/due")
    @Consumes({ "application/xml" })
    @Produces({ "application/xml", "application/json" })
    @ApiOperation(value = "Serviço para criação do documento único de exportação - DUE.", notes = "<p><a rel=\"noopener noreferrer\" href=\"../pages/exemplos/duex/registro-retificacao/\">Exemplos adicionais da DUE</a><br><br><a rel=\"noopener noreferrer\" href=\"../pages/exemplos/duex/oma-xsd.zip\">XSD para download</a></p>", tags={ "due" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = PucomexReturn.class),
        @ApiResponse(code = 400, message = "Requisição mal formatada"),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
        @ApiResponse(code = 500, message = "Erro interno no servidor") })
    public Response inserir(@ApiParam(value = "" ,required=true)@Valid Declaration body, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token é recuperado no parâmetro Set-Token no response da autenticação" ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Este token é recuperado no parâmetro X-CSRF-Token no response da autenticação" ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * Retorna lista de atos concessórios do tipo isenção
     *
     */
    @GET
    @Path("/ext/due/{numero-da-due}/drawback/isencao/atos-concessorios")
    @Produces({ "application/json" })
    @ApiOperation(value = "Retorna lista de atos concessórios do tipo isenção", notes = "", tags={ "due" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = AtoConcessorio.class, responseContainer = "List"),
        @ApiResponse(code = 204, message = "Operação realizada com sucesso. Nenhum conteúdo retornado"),
        @ApiResponse(code = 206, message = "Retorno do conteúdo particionado"),
        @ApiResponse(code = 400, message = "Requisição mal formatada"),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
        @ApiResponse(code = 500, message = "Erro interno no servidor") })
    public Response lista(@ApiParam(value = "Número da DUE<br />Tamanho: 14<br />Formato: 'NNAANNNNNNNNNN'",required=true) @PathParam("numero-da-due") String numeroDaDue, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token é recuperado no parâmetro Set-Token no response da autenticação" ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Este token é recuperado no parâmetro X-CSRF-Token no response da autenticação" ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken,  @ApiParam(value = "Número do Item de DU-E<br />Formato: Inteiro, com até 5 digitos")  @QueryParam("numero-item-de-due") String numeroItemDeDue,  @ApiParam(value = "Índice do primeiro elemento<br />Formato: Inteiro, com até 10 digitos", defaultValue="0") @DefaultValue("0") @QueryParam("offset") Integer offset,  @ApiParam(value = "Índice do último elemento<br />Formato: Inteiro, com até 10 digitos", defaultValue="49") @DefaultValue("49") @QueryParam("limit") Integer limit,  @ApiParam(value = "Número do ato concessório<br />Tamanho: 8<br />Formato: 'NNNNNNNN'")  @QueryParam("numero") String numero,  @ApiParam(value = "Item do ato concessório<br />Formato: Inteiro, com até 5 digitos")  @QueryParam("numero-do-item") String numeroDoItem,  @ApiParam(value = "CNPJ do Beneficiário<br />Tamanho: 14<br />Formato: 'NNNNNNNNNNNNNN'")  @QueryParam("cnpj-do-beneficiario") String cnpjDoBeneficiario,  @ApiParam(value = "Ordenação", allowableValues="NUMERO, ITEM, CNPJ_DO_BENEFICIARIO, NUMERO_ITEM_DUE, DATA_DE_REGISTRO")  @QueryParam("ordenacao") String ordenacao,  @ApiParam(value = "Tipo de Ordenação", allowableValues="ASC, DESC")  @QueryParam("tipoDeOrdenacao") String tipoDeOrdenacao);

    /**
     * Retorna lista de exigências fiscais de uma DUE.
     *
     */
    @GET
    @Path("/ext/due/{numero-da-due}/exigencias-fiscais")
    @Produces({ "application/json" })
    @ApiOperation(value = "Retorna lista de exigências fiscais de uma DUE.", notes = "", tags={ "due" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = ExigenciaFiscalEstruturada.class, responseContainer = "List"),
        @ApiResponse(code = 204, message = "Operação realizada com sucesso. Nenhum conteúdo retornado"),
        @ApiResponse(code = 400, message = "Requisição mal formatada"),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
        @ApiResponse(code = 500, message = "Erro interno no servidor") })
    public Response obter(@ApiParam(value = "Número da DUE<br />Tamanho: 14<br />Formato: 'NNAANNNNNNNNNN'",required=true) @PathParam("numero-da-due") String numeroDaDue, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token é recuperado no parâmetro Set-Token no response da autenticação" ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Este token é recuperado no parâmetro X-CSRF-Token no response da autenticação" ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * Retorna Declaração Única de Exportação - DUE, por número.
     *
     */
    @GET
    @Path("/ext/due/numero-da-due/{numero}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Retorna Declaração Única de Exportação - DUE, por número.", notes = "", tags={ "due" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = DUE.class),
        @ApiResponse(code = 400, message = "Requisição mal formatada"),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 404, message = "Recurso não localizado"),
        @ApiResponse(code = 500, message = "Erro interno no servidor") })
    public Response obterPorDUE(@ApiParam(value = "Número da DUE<br />Tamanho: 14<br />Formato: 'NNAANNNNNNNNNN'",required=true) @PathParam("numero") String numero, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token é recuperado no parâmetro Set-Token no response da autenticação" ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Este token é recuperado no parâmetro X-CSRF-Token no response da autenticação" ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * Retorna Declaração Única de Exportação - DUE, por número da RUC.
     *
     */
    @GET
    @Path("/ext/due/numero-da-ruc/{numero}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Retorna Declaração Única de Exportação - DUE, por número da RUC.", notes = "", tags={ "due" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = DUE.class),
        @ApiResponse(code = 400, message = "Requisição mal formatada"),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 404, message = "Recurso não localizado"),
        @ApiResponse(code = 500, message = "Erro interno no servidor") })
    public Response obterPorRUC(@ApiParam(value = "RUC - Número da referência única de carga<br />Tamanho: 35<br />Formato: 'NAANNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN'",required=true) @PathParam("numero") String numero, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token é recuperado no parâmetro Set-Token no response da autenticação" ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Este token é recuperado no parâmetro X-CSRF-Token no response da autenticação" ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * Serviço para vinculação de atos concessórios de Drawback Isenção ao documento único de exportação - DUE.
     *
     * &lt;p&gt;&lt;a rel&#x3D;\&quot;noopener noreferrer\&quot; href&#x3D;\&quot;../pages/exemplos/duex/vinculo-drawback-isencao/\&quot;&gt;Exemplos adicionais da DUE&lt;/a&gt;&lt;br&gt;&lt;br&gt;&lt;a rel&#x3D;\&quot;noopener noreferrer\&quot; href&#x3D;\&quot;../pages/exemplos/duex/oma-xsd.zip\&quot;&gt;XSD para download&lt;/a&gt;&lt;/p&gt;
     *
     */
    @PUT
    @Path("/ext/due/{numero}/ato-concessorio-isencao")
    @Consumes({ "application/xml", "application/json" })
    @ApiOperation(value = "Serviço para vinculação de atos concessórios de Drawback Isenção ao documento único de exportação - DUE.", notes = "<p><a rel=\"noopener noreferrer\" href=\"../pages/exemplos/duex/vinculo-drawback-isencao/\">Exemplos adicionais da DUE</a><br><br><a rel=\"noopener noreferrer\" href=\"../pages/exemplos/duex/oma-xsd.zip\">XSD para download</a></p>", tags={ "due" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation") })
    public Response vinculaAtosConcessorios(@ApiParam(value = "Declaration" ,required=true)@Valid Declaration body, @ApiParam(value = "Número da DUE<br />Tamanho: 14<br />Formato: 'NNAANNNNNNNNNN'",required=true) @PathParam("numero") String numero, @ApiParam(value = "Authorization token" ,required=true)@HeaderParam("javax.servlet.request.X509Certificate") String javaxServletRequestX509Certificate, @ApiParam(value = "Content-Type" ,required=true, defaultValue="application/xml")@HeaderParam("Content-Type") String contentType, @ApiParam(value = "Accept" ,required=true, defaultValue="application/xml")@HeaderParam("Accept") String accept);
}

