package br.gov.siscomex.portalunico.cctr.api;

import br.gov.siscomex.portalunico.cctr.model.EntregasDocumentoTransporte;
import br.gov.siscomex.portalunico.cctr.model.ListaDocumentosTransporte;
import br.gov.siscomex.portalunico.cctr.model.ManifestacoesNacionais;
import br.gov.siscomex.portalunico.cctr.model.RecepcoesDocumentoTransporte;
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

/**
 * CCT Exportação
 *
 * <p><h4>Introdu&ccedil;&atilde;o</h4>  <p>Bem-vindo &agrave; Application Programming Interface (API) do sistema Pucomex - Controle de Cargas e Transito Exporta&ccedil;&atilde;o.<br>Sistema desenvolvido para simplificar o controle de carga e trânsito no processo de Exportação, dando uma única solução e um único fluxo para qualquer tipo de carga e qualquer modal de transporte.  Facilita a organização e realização da recepção, consolidação, trânsito, entrega, carregamento e manifestação de cargas.</p>  <h4>URLs de Acesso</h4>  <p>Para utilizar os servi&ccedil;os dispon&iacute;veis nessa API deve-se seguir o seguinte padr&atilde;o de URL:</p>  <p><em>https://{ambiente}/<strong>cct</strong>/api/{servi&ccedil;o}</em></p>  <p>Onde, em <strong>{ambiente}</strong> deve-se informar o ambiente desejado dentro os ambientes dispon&iacute;veis na tabela abaixo e em <strong>{servi&ccedil;o}</strong> utilizar a URI do servi&ccedil;o desejado.</p>    <style type=\"text/css\">  .tg  {border-collapse:collapse;border-color:#bbb;border-spacing:0;width: 604px;}  .tg td{background-color:#E0FFEB;border-color:#bbb;border-style:solid;border-width:1px;color:#594F4F;    font-family:Arial, sans-serif;font-size:14px;overflow:hidden;padding:10px 5px;word-break:normal;}  .tg th{background-color:#9DE0AD;border-color:#bbb;border-style:solid;border-width:1px;color:#493F3F;    font-family:Arial, sans-serif;font-size:14px;font-weight:normal;overflow:hidden;padding:10px 5px;word-break:normal;}  .tg .tg-cabecalho{text-align:left;vertical-align:top}  .tg .tg-corpo{border-color:inherit;text-align:left;vertical-align:top}  </style>    <table class=\"tg\" style=\"width: 604px;\">  <thead>    <tr>      <th class=\"tg-cabecalho\"><span style=\"font-weight:bold\">Nome do Ambiente</span></th>      <th class=\"tg-cabecalho\"><span style=\"font-weight:bold\">URL de acesso</span></th>    </tr>  </thead>  <tbody>    <tr>      <td class=\"tg-corpo\">Ambiente de Validação da Empresas</td>      <td class=\"tg-corpo\">val.portalunico.siscomex.gov.br</td>    </tr>    <tr>      <td class=\"\\tg-corpo\">Ambiente de Produção</td>      <td class=\"\\tg-corpo\">portalunico.siscomex.gov.br</td>    </tr>  </tbody>  </table>    <p>&nbsp;</p>  <p><strong>Exemplo:</strong> Para o servi&ccedil;o \"Recepções de Nota Fiscal Eletrônica\" a URI &eacute; \"ext/carga/recepcao-nfe\".</p>  <p>Logo, abaixo temos um exemplo de URL completa considerando o ambiente de Valida&ccedil;&atilde;o, consumindo este servi&ccedil;o </p>  <p><em>https://val.portalunico.siscomex.gov.br/cct/ext/carga/recepcao-nfe</em></p>
 *
 */
@Path("/")
@Api(value = "/", description = "")
public interface DocumentoDeTransporteApi {

    /**
     * Consultar uma lista de Documento de Transporte do tipo DAT
     * <p>
     * &lt;p&gt;&lt;a rel&#x3D;\&quot;noopener noreferrer\&quot; target&#x3D;\&quot;_blank\&quot; href&#x3D;\&quot;../../pages/exemplos/cctr/consultar-dat/\&quot;&gt;Exemplos de Respostas da Consulta DAT&lt;/a&gt;&lt;/p&gt;
     *
     */
    @GET
    @Path("/ext/documento-transporte/dat")
    @Produces({"application/json"})
    @ApiOperation(value = "Consultar uma lista de Documento de Transporte do tipo DAT", notes = "<p><a rel=\"noopener noreferrer\" target=\"_blank\" href=\"../../pages/exemplos/cctr/consultar-dat/\">Exemplos de Respostas da Consulta DAT</a></p>", tags = {"Documento de Transporte"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = ListaDocumentosTransporte.class),
            @ApiResponse(code = 400, message = "XML não atende as especificações definidas no XSD (requisições com envio de arquivos xml)"),
            @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
            @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
            @ApiResponse(code = 500, message = "Erro interno no servidor"),
            @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
            @ApiResponse(code = 404, message = "Recurso não encontrado")})
    ListaDocumentosTransporte consultarDocumentoTransporteDAT(@NotNull @ApiParam(value = "Lista de DAT (número do documento) separados por |<br>Cada documento de Transporte DAT é formado pelo número do DAT<br>Tamanho 11<br>Formato: AABRNNNNNN-D<br>Descrição Formato<br>AA - Ano<br>BR - Brasil<br>NNNNN - Numeração sequencial<br>D - DV<br>ex: 20BR0061234|23BR0064567|...", required = true) @QueryParam("documentos") String documentos, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token é recuperado no parâmetro Set-Token no response da autenticação.", required = true) @HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Este token é recuperado no parâmetro X-CSRF-Token no response da autenticação.", required = true) @HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * Consultar uma lista de Documento de Transporte do tipo DTAI
     * <p>
     * &lt;p&gt;&lt;a rel&#x3D;\&quot;noopener noreferrer\&quot; target&#x3D;\&quot;_blank\&quot; href&#x3D;\&quot;../../pages/exemplos/cctr/consultar-dtai/\&quot;&gt;Exemplos de Respostas da Consulta DTAI&lt;/a&gt;&lt;/p&gt;
     *
     */
    @GET
    @Path("/ext/documento-transporte/dtai")
    @Produces({"application/json"})
    @ApiOperation(value = "Consultar uma lista de Documento de Transporte do tipo DTAI", notes = "<p><a rel=\"noopener noreferrer\" target=\"_blank\" href=\"../../pages/exemplos/cctr/consultar-dtai/\">Exemplos de Respostas da Consulta DTAI</a></p>", tags = {"Documento de Transporte"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = ListaDocumentosTransporte.class),
            @ApiResponse(code = 400, message = "XML não atende as especificações definidas no XSD (requisições com envio de arquivos xml)"),
            @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
            @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
            @ApiResponse(code = 500, message = "Erro interno no servidor"),
            @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
            @ApiResponse(code = 404, message = "Recurso não encontrado")})
    ListaDocumentosTransporte consultarDocumentoTransporteDTAI(@NotNull @ApiParam(value = "Lista de DTAI (número do documento,data de emissão) separados por |<br>Tamanho mínimo: 5<br>Tamanho Máximo: 15<br>Formato: AAAAAAAAAAAAAAA<br>ex: DTAI05ABR01,01-02-2023|3E33D3D33,10-08-2020|...", required = true) @QueryParam("documentos") String documentos, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token é recuperado no parâmetro Set-Token no response da autenticação.", required = true) @HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Este token é recuperado no parâmetro X-CSRF-Token no response da autenticação.", required = true) @HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * Consultar uma lista de Documento de Transporte do tipo MIC-DTA
     * <p>
     * &lt;p&gt;&lt;a rel&#x3D;\&quot;noopener noreferrer\&quot; target&#x3D;\&quot;_blank\&quot; href&#x3D;\&quot;../../pages/exemplos/cctr/consultar-mic/\&quot;&gt;Exemplos de Respostas da Consulta MIC&lt;/a&gt;&lt;/p&gt;
     *
     */
    @GET
    @Path("/ext/documento-transporte/mic")
    @Produces({"application/json"})
    @ApiOperation(value = "Consultar uma lista de Documento de Transporte do tipo MIC-DTA", notes = "<p><a rel=\"noopener noreferrer\" target=\"_blank\" href=\"../../pages/exemplos/cctr/consultar-mic/\">Exemplos de Respostas da Consulta MIC</a></p>", tags = {"Documento de Transporte"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = ListaDocumentosTransporte.class),
            @ApiResponse(code = 400, message = "XML não atende as especificações definidas no XSD (requisições com envio de arquivos xml)"),
            @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
            @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
            @ApiResponse(code = 500, message = "Erro interno no servidor"),
            @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
            @ApiResponse(code = 404, message = "Recurso não encontrado")})
    ListaDocumentosTransporte consultarDocumentoTransporteMIC(@NotNull @ApiParam(value = "Lista de MIC (número do documento,data de emissão) separados por |<br>Tamanho: 11<br>Formato: BRNNNNNNNNN<br>Descrição Formato<br>BR - Brasil<br>NNNNNNNNN - sequencial numérico<br>ex: BR123456788,01-01-2020|BR123456789,11-10-2022|...", required = true) @QueryParam("documentos") String documentos, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token é recuperado no parâmetro Set-Token no response da autenticação.", required = true) @HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Este token é recuperado no parâmetro X-CSRF-Token no response da autenticação.", required = true) @HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * Consultar uma lista de Documento de Transporte do tipo TIF-DTA
     * <p>
     * &lt;p&gt;&lt;a rel&#x3D;\&quot;noopener noreferrer\&quot; target&#x3D;\&quot;_blank\&quot; href&#x3D;\&quot;../../pages/exemplos/cctr/consultar-tif-dta/\&quot;&gt;Exemplos de Respostas da Consulta TIF-DTA&lt;/a&gt;&lt;/p&gt;
     *
     */
    @GET
    @Path("/ext/documento-transporte/tif")
    @Produces({"application/json"})
    @ApiOperation(value = "Consultar uma lista de Documento de Transporte do tipo TIF-DTA", notes = "<p><a rel=\"noopener noreferrer\" target=\"_blank\" href=\"../../pages/exemplos/cctr/consultar-tif-dta/\">Exemplos de Respostas da Consulta TIF-DTA</a></p>", tags = {"Documento de Transporte"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = ListaDocumentosTransporte.class),
            @ApiResponse(code = 400, message = "XML não atende as especificações definidas no XSD (requisições com envio de arquivos xml)"),
            @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
            @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
            @ApiResponse(code = 500, message = "Erro interno no servidor"),
            @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
            @ApiResponse(code = 404, message = "Recurso não encontrado")})
    ListaDocumentosTransporte consultarDocumentoTransporteTIF(@NotNull @ApiParam(value = "Lista de TIF (número do documento,data de emissão) separados por |<br>Tamanho mínimo: 5<br>Tamanho Máximo: 15<br>Formato: AAAAAAAAAAAAAAA<br>ex: 2344234324,08-06-2020|TIF22ABR01,14-05-2022|...", required = true) @QueryParam("documentos") String documentos, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token é recuperado no parâmetro Set-Token no response da autenticação.", required = true) @HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Este token é recuperado no parâmetro X-CSRF-Token no response da autenticação.", required = true) @HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * Entregar de Documento de Transporte
     * <p>
     * &lt;p&gt;&lt;a rel&#x3D;\&quot;noopener noreferrer\&quot; target&#x3D;\&quot;_blank\&quot; href&#x3D;\&quot;../../pages/exemplos/cctr/entrega-documento-transporte/\&quot;&gt;Exemplos de Entregas de Documentos de Transporte&lt;/a&gt;&lt;br&gt;&lt;br&gt;&lt;a href&#x3D;\&quot;../../pages/exemplos/cctr/xsd-cct-exp.zip\&quot;&gt;XSD para download&lt;/a&gt;&lt;/p&gt;
     *
     */
    @POST
    @Path("/ext/documento-transporte/entrega-documento-transporte")
    @Consumes({"application/xml"})
    @ApiOperation(value = "Entregar de Documento de Transporte", notes = "<p><a rel=\"noopener noreferrer\" target=\"_blank\" href=\"../../pages/exemplos/cctr/entrega-documento-transporte/\">Exemplos de Entregas de Documentos de Transporte</a><br><br><a href=\"../../pages/exemplos/cctr/xsd-cct-exp.zip\">XSD para download</a></p>", tags = {"Documento de Transporte"})
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Operação realizada com sucesso"),
            @ApiResponse(code = 400, message = "XML não atende as especificações definidas no XSD (requisições com envio de arquivos xml)"),
            @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
            @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
            @ApiResponse(code = 500, message = "Erro interno no servidor"),
            @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
            @ApiResponse(code = 404, message = "Recurso não encontrado")})
    void entregarDocumentoTransporte(@ApiParam(value = "Entregas de Documentos de Transporte", required = true) @Valid EntregasDocumentoTransporte body, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token é recuperado no parâmetro Set-Token no response da autenticação.", required = true) @HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Este token é recuperado no parâmetro X-CSRF-Token no response da autenticação.", required = true) @HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * Manifestar trânsito nacional (DAT)
     * <p>
     * &lt;p&gt;&lt;a rel&#x3D;\&quot;noopener noreferrer\&quot; target&#x3D;\&quot;_blank\&quot; href&#x3D;\&quot;../../pages/exemplos/cctr/manifestacao-dat/\&quot;&gt;Exemplos de Manifestação de DAT&lt;/a&gt;&lt;br&gt;&lt;br&gt;&lt;a href&#x3D;\&quot;../../pages/exemplos/cctr/xsd-cct-exp.zip\&quot;&gt;XSD para download&lt;/a&gt;&lt;/p&gt;
     *
     */
    @POST
    @Path("/ext/documento-transporte/manifestar-dat")
    @Consumes({"application/xml"})
    @ApiOperation(value = "Manifestar trânsito nacional (DAT)", notes = "<p><a rel=\"noopener noreferrer\" target=\"_blank\" href=\"../../pages/exemplos/cctr/manifestacao-dat/\">Exemplos de Manifestação de DAT</a><br><br><a href=\"../../pages/exemplos/cctr/xsd-cct-exp.zip\">XSD para download</a></p>", tags = {"Documento de Transporte"})
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Operação realizada com sucesso"),
            @ApiResponse(code = 400, message = "XML não atende as especificações definidas no XSD (requisições com envio de arquivos xml)"),
            @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
            @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
            @ApiResponse(code = 500, message = "Erro interno no servidor"),
            @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
            @ApiResponse(code = 404, message = "Recurso não encontrado")})
    void manifestarDAT(@ApiParam(value = "Manifestações de Documentos de Transporte", required = true) @Valid ManifestacoesNacionais body, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token é recuperado no parâmetro Set-Token no response da autenticação.", required = true) @HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Este token é recuperado no parâmetro X-CSRF-Token no response da autenticação.", required = true) @HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * Recepcionar Documento de Transporte
     * <p>
     * &lt;p&gt;&lt;a rel&#x3D;\&quot;noopener noreferrer\&quot; target&#x3D;\&quot;_blank\&quot; href&#x3D;\&quot;../../pages/exemplos/cctr/recepcao-documento-transporte/\&quot;&gt;Exemplos de Recepções de Documentos de Transporte&lt;/a&gt;&lt;br&gt;&lt;br&gt;&lt;a href&#x3D;\&quot;../../pages/exemplos/cctr/xsd-cct-exp.zip\&quot;&gt;XSD para download&lt;/a&gt;&lt;/p&gt;
     *
     */
    @POST
    @Path("/ext/documento-transporte/recepcao-documento-transporte")
    @Consumes({"application/xml"})
    @ApiOperation(value = "Recepcionar Documento de Transporte", notes = "<p><a rel=\"noopener noreferrer\" target=\"_blank\" href=\"../../pages/exemplos/cctr/recepcao-documento-transporte/\">Exemplos de Recepções de Documentos de Transporte</a><br><br><a href=\"../../pages/exemplos/cctr/xsd-cct-exp.zip\">XSD para download</a></p>", tags = {"Documento de Transporte"})
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Operação realizada com sucesso"),
            @ApiResponse(code = 400, message = "XML não atende as especificações definidas no XSD (requisições com envio de arquivos xml)"),
            @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
            @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
            @ApiResponse(code = 500, message = "Erro interno no servidor"),
            @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
            @ApiResponse(code = 404, message = "Recurso não encontrado")})
    void recepcionarDocumentoTransporte(@ApiParam(value = "Recepções de Documentos de Transporte", required = true) @Valid RecepcoesDocumentoTransporte body, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token é recuperado no parâmetro Set-Token no response da autenticação.", required = true) @HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Este token é recuperado no parâmetro X-CSRF-Token no response da autenticação.", required = true) @HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * Recepcionar Documento de Transporte
     * <p>
     * &lt;p&gt;Recomendamos a utilização da &lt;strong&gt;Recepção Assíncrona&lt;/strong&gt; para o documento MIC/DTA que possui uma quantidade elevada de itens de nota fiscal a serem processados, ou seja, com valor estimado, em testes de stress, superior a 500 itens. Isso porque o processo antigo, realizado de forma síncrona e imediata, muitas vezes impede sua conclusão. Nesse caso, sugerimos o uso deste endereço de &lt;strong&gt;&lt;em&gt;recepção em segundo plano&lt;/em&gt; (Recepção Assíncrona)&lt;/strong&gt; para garantir a conclusão bem-sucedida do processo.&lt;/p&gt;&lt;p&gt;Além disso, para minimizar impactos na utilização da &lt;strong&gt;Recepção Assíncrona por MIC/DTA&lt;/strong&gt;, optamos por manter o mesmo padrão de envio de XML utilizado na &lt;strong&gt;Recepção Síncrona&lt;/strong&gt;.&lt;/p&gt;&lt;p&gt;&lt;a rel&#x3D;\&quot;noopener noreferrer\&quot; target&#x3D;\&quot;_blank\&quot; href&#x3D;\&quot;../../pages/exemplos/cctr/recepcao-documento-transporte/\&quot;&gt;Exemplos de Recepções de Documentos de Transporte&lt;/a&gt;&lt;br&gt;&lt;br&gt;&lt;a href&#x3D;\&quot;../../pages/exemplos/cctr/xsd-cct-exp.zip\&quot;&gt;XSD para download&lt;/a&gt;&lt;/p&gt;
     *
     */
    @POST
    @Path("/ext/documento-transporte/v2/recepcao-documento-transporte")
    @Consumes({"application/xml"})
    @ApiOperation(value = "Recepcionar Documento de Transporte", notes = "<p>Recomendamos a utilização da <strong>Recepção Assíncrona</strong> para o documento MIC/DTA que possui uma quantidade elevada de itens de nota fiscal a serem processados, ou seja, com valor estimado, em testes de stress, superior a 500 itens. Isso porque o processo antigo, realizado de forma síncrona e imediata, muitas vezes impede sua conclusão. Nesse caso, sugerimos o uso deste endereço de <strong><em>recepção em segundo plano</em> (Recepção Assíncrona)</strong> para garantir a conclusão bem-sucedida do processo.</p><p>Além disso, para minimizar impactos na utilização da <strong>Recepção Assíncrona por MIC/DTA</strong>, optamos por manter o mesmo padrão de envio de XML utilizado na <strong>Recepção Síncrona</strong>.</p><p><a rel=\"noopener noreferrer\" target=\"_blank\" href=\"../../pages/exemplos/cctr/recepcao-documento-transporte/\">Exemplos de Recepções de Documentos de Transporte</a><br><br><a href=\"../../pages/exemplos/cctr/xsd-cct-exp.zip\">XSD para download</a></p>", tags = {"Documento de Transporte"})
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Operação realizada com sucesso"),
            @ApiResponse(code = 400, message = "XML não atende as especificações definidas no XSD (requisições com envio de arquivos xml)"),
            @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
            @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
            @ApiResponse(code = 500, message = "Erro interno no servidor"),
            @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
            @ApiResponse(code = 404, message = "Recurso não encontrado")})
    void recepcionarDocumentoTransporteAsync(@ApiParam(value = "Recepções de Documentos de Transporte", required = true) @Valid RecepcoesDocumentoTransporte body, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token é recuperado no parâmetro Set-Token no response da autenticação.", required = true) @HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Este token é recuperado no parâmetro X-CSRF-Token no response da autenticação.", required = true) @HeaderParam("X-CSRF-Token") String xCSRFToken);
}

