package br.gov.siscomex.portalunico.cct_ext.api;

import br.gov.siscomex.portalunico.cct_ext.model.DocumentosTransporte;
import br.gov.siscomex.portalunico.cct_ext.model.EntregasDocumentoTransporte;
import br.gov.siscomex.portalunico.cct_ext.model.RecepcoesDocumentoTransporte;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

/**
 * Controle de Carga e Trânsito Exportação
 *
 * <p><h4>Introdu&ccedil;&atilde;o</h4>  <p>Bem-vindo &agrave; Application Programming Interface (API) do sistema Pucomex - Controle de Cargas e Transito Exporta&ccedil;&atilde;o.<br>Sistema desenvolvido para simplificar o controle de carga e trânsito no processo de Exportação, dando uma única solução e um único fluxo para qualquer tipo de carga e qualquer modal de transporte.  Facilita a organização e realização da recepção, consolidação, trânsito, entrega, carregamento e manifestação de cargas.</p>  <h4>URLs de Acesso</h4>  <p>Para utilizar os servi&ccedil;os dispon&iacute;veis nessa API deve-se seguir o seguinte padr&atilde;o de URL:</p>  <p><em>https://{ambiente}/<strong>cct</strong>/api/{servi&ccedil;o}</em></p>  <p>Onde, em <strong>{ambiente}</strong> deve-se informar o ambiente desejado dentro os ambientes dispon&iacute;veis na tabela abaixo e em <strong>{servi&ccedil;o}</strong> utilizar a URI do servi&ccedil;o desejado.</p>    <style type=\"text/css\">  .tg  {border-collapse:collapse;border-color:#bbb;border-spacing:0;width: 604px;}  .tg td{background-color:#E0FFEB;border-color:#bbb;border-style:solid;border-width:1px;color:#594F4F;    font-family:Arial, sans-serif;font-size:14px;overflow:hidden;padding:10px 5px;word-break:normal;}  .tg th{background-color:#9DE0AD;border-color:#bbb;border-style:solid;border-width:1px;color:#493F3F;    font-family:Arial, sans-serif;font-size:14px;font-weight:normal;overflow:hidden;padding:10px 5px;word-break:normal;}  .tg .tg-cabecalho{text-align:left;vertical-align:top}  .tg .tg-corpo{border-color:inherit;text-align:left;vertical-align:top}  </style>    <table class=\"tg\" style=\"width: 604px;\">  <thead>    <tr>      <th class=\"tg-cabecalho\"><span style=\"font-weight:bold\">Nome do Ambiente</span></th>      <th class=\"tg-cabecalho\"><span style=\"font-weight:bold\">URL de acesso</span></th>    </tr>  </thead>  <tbody>    <tr>      <td class=\"tg-corpo\">Ambiente de Validação da Empresas</td>      <td class=\"tg-corpo\">val.portalunico.siscomex.gov.br</td>    </tr>    <tr>      <td class=\"\\tg-corpo\">Ambiente de Produção</td>      <td class=\"\\tg-corpo\">portalunico.siscomex.gov.br</td>    </tr>  </tbody>  </table>    <p>&nbsp;</p>  <p><strong>Exemplo:</strong> Para o servi&ccedil;o \"Recepções de Nota Fiscal Eletrônica\" a URI &eacute; \"ext/carga/recepcao-nfe\".</p>  <p>Logo, abaixo temos um exemplo de URL completa considerando o ambiente de Valida&ccedil;&atilde;o, consumindo este servi&ccedil;o </p>  <p><em>https://val.portalunico.siscomex.gov.br/cct/ext/carga/recepcao-nfe</em></p>  
 *
 */
@Path("/")
@Api(value = "/", description = "")
public interface DocumentoDeTransporteApi  {

    /**
     * Consultar uma lista de Documento de Transporte do tipo DAT
     *
     * &lt;p&gt;&lt;a rel&#x3D;\&quot;noopener noreferrer\&quot; href&#x3D;\&quot;../pages/exemplos/cctr/consultar-dat/\&quot;&gt;Exemplos de Respostas da Consulta DAT&lt;/a&gt;&lt;/p&gt;
     *
     */
    @GET
    @Path("/ext/documento-transporte/dat")
    @Produces({ "application/json" })
    @ApiOperation(value = "Consultar uma lista de Documento de Transporte do tipo DAT", notes = "<p><a rel=\"noopener noreferrer\" href=\"../pages/exemplos/cctr/consultar-dat/\">Exemplos de Respostas da Consulta DAT</a></p>", tags={ "Documento de Transporte" })
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = DocumentosTransporte.class),
        @ApiResponse(code = 400, message = "XML não atende as especificações definidas no XSD (requisições com envio de arquivos xml)"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
        @ApiResponse(code = 500, message = "Erro interno no servidor"),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 404, message = "Recurso não encontrado") })
    public Response consultarDocumentoTransporteDAT(@NotNull @ApiParam(value = "Lista de DAT (número do documento) separados por |<br>Cada documento de Transporte DAT é formado pelo número do DAT<br>Tamanho 11<br>Formato: AABRNNNNNN-D<br>Descrição Formato<br>AA - Ano<br>BR - Brasil<br>NNNNN - Numeração sequencial<br>D - DV<br>ex: 20BR0061234|23BR0064567|...", required = true) @QueryParam("documentos") String documentos, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token é recuperado no parâmetro Set-Token no response da autenticação.", required = true) @HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Este token é recuperado no parâmetro X-CSRF-Token no response da autenticação.", required = true) @HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * Consultar uma lista de Documento de Transporte do tipo DTAI
     *
     * &lt;p&gt;&lt;a rel&#x3D;\&quot;noopener noreferrer\&quot; href&#x3D;\&quot;../pages/exemplos/cctr/consultar-dtai/\&quot;&gt;Exemplos de Respostas da Consulta DTAI&lt;/a&gt;&lt;/p&gt;
     *
     */
    @GET
    @Path("/ext/documento-transporte/dtai")
    @Produces({ "application/json" })
    @ApiOperation(value = "Consultar uma lista de Documento de Transporte do tipo DTAI", notes = "<p><a rel=\"noopener noreferrer\" href=\"../pages/exemplos/cctr/consultar-dtai/\">Exemplos de Respostas da Consulta DTAI</a></p>", tags={ "Documento de Transporte" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = DocumentosTransporte.class),
        @ApiResponse(code = 400, message = "XML não atende as especificações definidas no XSD (requisições com envio de arquivos xml)"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
        @ApiResponse(code = 500, message = "Erro interno no servidor"),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 404, message = "Recurso não encontrado") })
    public Response consultarDocumentoTransporteDTAI( @NotNull @ApiParam(value = "Lista de DTAI (número do documento,data de emissão) separados por |<br>Tamanho mínimo: 5<br>Tamanho Máximo: 15<br>Formato: AAAAAAAAAAAAAAA<br>ex: DTAI05ABR01,01-02-2023|3E33D3D33,10-08-2020|...",required=true)  @QueryParam("documentos") String documentos, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token é recuperado no parâmetro Set-Token no response da autenticação." ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Este token é recuperado no parâmetro X-CSRF-Token no response da autenticação." ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * Consultar uma lista de Documento de Transporte do tipo MIC-DTA
     *
     * &lt;p&gt;&lt;a rel&#x3D;\&quot;noopener noreferrer\&quot; href&#x3D;\&quot;../pages/exemplos/cctr/consultar-mic/\&quot;&gt;Exemplos de Respostas da Consulta MIC&lt;/a&gt;&lt;/p&gt;
     *
     */
    @GET
    @Path("/ext/documento-transporte/mic")
    @Produces({ "application/json" })
    @ApiOperation(value = "Consultar uma lista de Documento de Transporte do tipo MIC-DTA", notes = "<p><a rel=\"noopener noreferrer\" href=\"../pages/exemplos/cctr/consultar-mic/\">Exemplos de Respostas da Consulta MIC</a></p>", tags={ "Documento de Transporte" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = DocumentosTransporte.class),
        @ApiResponse(code = 400, message = "XML não atende as especificações definidas no XSD (requisições com envio de arquivos xml)"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
        @ApiResponse(code = 500, message = "Erro interno no servidor"),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 404, message = "Recurso não encontrado") })
    public Response consultarDocumentoTransporteMIC( @NotNull @ApiParam(value = "Lista de MIC (número do documento,data de emissão) separados por |<br>Tamanho: 11<br>Formato: BRNNNNNNNNN<br>Descrição Formato<br>BR - Brasil<br>NNNNNNNNN - sequencial numérico<br>ex: BR123456788,01-01-2020|BR123456789,11-10-2022|...",required=true)  @QueryParam("documentos") String documentos, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token é recuperado no parâmetro Set-Token no response da autenticação." ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Este token é recuperado no parâmetro X-CSRF-Token no response da autenticação." ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * Consultar uma lista de Documento de Transporte do tipo TIF-DTA
     *
     * &lt;p&gt;&lt;a rel&#x3D;\&quot;noopener noreferrer\&quot; href&#x3D;\&quot;../pages/exemplos/cctr/consultar-tif-dta/\&quot;&gt;Exemplos de Respostas da Consulta TIF-DTA&lt;/a&gt;&lt;/p&gt;
     *
     */
    @GET
    @Path("/ext/documento-transporte/tif")
    @Produces({ "application/json" })
    @ApiOperation(value = "Consultar uma lista de Documento de Transporte do tipo TIF-DTA", notes = "<p><a rel=\"noopener noreferrer\" href=\"../pages/exemplos/cctr/consultar-tif-dta/\">Exemplos de Respostas da Consulta TIF-DTA</a></p>", tags={ "Documento de Transporte" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = DocumentosTransporte.class),
        @ApiResponse(code = 400, message = "XML não atende as especificações definidas no XSD (requisições com envio de arquivos xml)"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
        @ApiResponse(code = 500, message = "Erro interno no servidor"),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 404, message = "Recurso não encontrado") })
    public Response consultarDocumentoTransporteTIF( @NotNull @ApiParam(value = "Lista de TIF (número do documento,data de emissão) separados por |<br>Tamanho mínimo: 5<br>Tamanho Máximo: 15<br>Formato: AAAAAAAAAAAAAAA<br>ex: 2344234324,08-06-2020|TIF22ABR01,14-05-2022|...",required=true)  @QueryParam("documentos") String documentos, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token é recuperado no parâmetro Set-Token no response da autenticação." ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Este token é recuperado no parâmetro X-CSRF-Token no response da autenticação." ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * Entregar de Documento de Transporte
     *
     * &lt;p&gt;&lt;a rel&#x3D;\&quot;noopener noreferrer\&quot; href&#x3D;\&quot;../pages/exemplos/cctr/entrega-documento-transporte/\&quot;&gt;Exemplos de Entregas de Documentos de Transporte&lt;/a&gt;&lt;br&gt;&lt;br&gt;&lt;a href&#x3D;\&quot;../pages/exemplos/cctr/xsd-cct-exp.zip\&quot;&gt;XSD para download&lt;/a&gt;&lt;/p&gt;
     *
     */
    @POST
    @Path("/ext/documento-transporte/entrega-documento-transporte")
    @Consumes({ "application/xml" })
    @ApiOperation(value = "Entregar de Documento de Transporte", notes = "<p><a rel=\"noopener noreferrer\" href=\"../pages/exemplos/cctr/entrega-documento-transporte/\">Exemplos de Entregas de Documentos de Transporte</a><br><br><a href=\"../pages/exemplos/cctr/xsd-cct-exp.zip\">XSD para download</a></p>", tags={ "Documento de Transporte" })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Operação realizada com sucesso"),
        @ApiResponse(code = 400, message = "XML não atende as especificações definidas no XSD (requisições com envio de arquivos xml)"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
        @ApiResponse(code = 500, message = "Erro interno no servidor"),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 404, message = "Recurso não encontrado") })
    public Response entregarDocumentoTransporte(@ApiParam(value = "Entregas de Documentos de Transporte" ,required=true)@Valid EntregasDocumentoTransporte body, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token é recuperado no parâmetro Set-Token no response da autenticação." ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Este token é recuperado no parâmetro X-CSRF-Token no response da autenticação." ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * Recepcionar Documento de Transporte
     *
     * &lt;p&gt;&lt;a rel&#x3D;\&quot;noopener noreferrer\&quot; href&#x3D;\&quot;../pages/exemplos/cctr/recepcao-documento-transporte/\&quot;&gt;Exemplos de Recepções de Documentos de Transporte&lt;/a&gt;&lt;br&gt;&lt;br&gt;&lt;a href&#x3D;\&quot;../pages/exemplos/cctr/xsd-cct-exp.zip\&quot;&gt;XSD para download&lt;/a&gt;&lt;/p&gt;
     *
     */
    @POST
    @Path("/ext/documento-transporte/recepcao-documento-transporte")
    @Consumes({ "application/xml" })
    @ApiOperation(value = "Recepcionar Documento de Transporte", notes = "<p><a rel=\"noopener noreferrer\" href=\"../pages/exemplos/cctr/recepcao-documento-transporte/\">Exemplos de Recepções de Documentos de Transporte</a><br><br><a href=\"../pages/exemplos/cctr/xsd-cct-exp.zip\">XSD para download</a></p>", tags={ "Documento de Transporte" })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Operação realizada com sucesso"),
        @ApiResponse(code = 400, message = "XML não atende as especificações definidas no XSD (requisições com envio de arquivos xml)"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
        @ApiResponse(code = 500, message = "Erro interno no servidor"),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 404, message = "Recurso não encontrado") })
    public Response recepcionarDocumentoTransporte(@ApiParam(value = "Recepções de Documentos de Transporte" ,required=true)@Valid RecepcoesDocumentoTransporte body, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token é recuperado no parâmetro Set-Token no response da autenticação." ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Este token é recuperado no parâmetro X-CSRF-Token no response da autenticação." ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken);
}

