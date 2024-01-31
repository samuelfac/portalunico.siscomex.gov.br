package br.gov.siscomex.portalunico.cct_ext.api;

import br.gov.siscomex.portalunico.cct_ext.model.ConsultaConteiner;
import br.gov.siscomex.portalunico.cct_ext.model.EntregasConteineres;
import br.gov.siscomex.portalunico.cct_ext.model.EntregasDocumentoCarga;
import br.gov.siscomex.portalunico.cct_ext.model.EstoqueNFE;
import br.gov.siscomex.portalunico.cct_ext.model.ListaRegistros;
import br.gov.siscomex.portalunico.cct_ext.model.ManifestacoesExportacao;
import br.gov.siscomex.portalunico.cct_ext.model.ManifestacoesExportacaoPreACDMicDTO;
import br.gov.siscomex.portalunico.cct_ext.model.OperacaoDesunitizacao;
import br.gov.siscomex.portalunico.cct_ext.model.OperacaoUnitizacao;
import br.gov.siscomex.portalunico.cct_ext.model.OperacoesConsolidacao;
import br.gov.siscomex.portalunico.cct_ext.model.RecepcoesConteineres;
import br.gov.siscomex.portalunico.cct_ext.model.RecepcoesDocumentoCarga;
import br.gov.siscomex.portalunico.cct_ext.model.RecepcoesNFE;
import br.gov.siscomex.portalunico.cct_ext.model.RecepcoesNFF;
import br.gov.siscomex.portalunico.cct_ext.model.ResultadoConsulta;
import br.gov.siscomex.portalunico.cct_ext.model.ResultadoConsultaMRUC;
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
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;
import java.math.BigDecimal;
import java.util.List;

/**
 * Controle de Carga e Trânsito Exportação
 *
 * <p><h4>Introdu&ccedil;&atilde;o</h4>  <p>Bem-vindo &agrave; Application Programming Interface (API) do sistema Pucomex - Controle de Cargas e Transito Exporta&ccedil;&atilde;o.<br>Sistema desenvolvido para simplificar o controle de carga e trânsito no processo de Exportação, dando uma única solução e um único fluxo para qualquer tipo de carga e qualquer modal de transporte.  Facilita a organização e realização da recepção, consolidação, trânsito, entrega, carregamento e manifestação de cargas.</p>  <h4>URLs de Acesso</h4>  <p>Para utilizar os servi&ccedil;os dispon&iacute;veis nessa API deve-se seguir o seguinte padr&atilde;o de URL:</p>  <p><em>https://{ambiente}/<strong>cct</strong>/api/{servi&ccedil;o}</em></p>  <p>Onde, em <strong>{ambiente}</strong> deve-se informar o ambiente desejado dentro os ambientes dispon&iacute;veis na tabela abaixo e em <strong>{servi&ccedil;o}</strong> utilizar a URI do servi&ccedil;o desejado.</p>    <style type=\"text/css\">  .tg  {border-collapse:collapse;border-color:#bbb;border-spacing:0;width: 604px;}  .tg td{background-color:#E0FFEB;border-color:#bbb;border-style:solid;border-width:1px;color:#594F4F;    font-family:Arial, sans-serif;font-size:14px;overflow:hidden;padding:10px 5px;word-break:normal;}  .tg th{background-color:#9DE0AD;border-color:#bbb;border-style:solid;border-width:1px;color:#493F3F;    font-family:Arial, sans-serif;font-size:14px;font-weight:normal;overflow:hidden;padding:10px 5px;word-break:normal;}  .tg .tg-cabecalho{text-align:left;vertical-align:top}  .tg .tg-corpo{border-color:inherit;text-align:left;vertical-align:top}  </style>    <table class=\"tg\" style=\"width: 604px;\">  <thead>    <tr>      <th class=\"tg-cabecalho\"><span style=\"font-weight:bold\">Nome do Ambiente</span></th>      <th class=\"tg-cabecalho\"><span style=\"font-weight:bold\">URL de acesso</span></th>    </tr>  </thead>  <tbody>    <tr>      <td class=\"tg-corpo\">Ambiente de Validação da Empresas</td>      <td class=\"tg-corpo\">val.portalunico.siscomex.gov.br</td>    </tr>    <tr>      <td class=\"\\tg-corpo\">Ambiente de Produção</td>      <td class=\"\\tg-corpo\">portalunico.siscomex.gov.br</td>    </tr>  </tbody>  </table>    <p>&nbsp;</p>  <p><strong>Exemplo:</strong> Para o servi&ccedil;o \"Recepções de Nota Fiscal Eletrônica\" a URI &eacute; \"ext/carga/recepcao-nfe\".</p>  <p>Logo, abaixo temos um exemplo de URL completa considerando o ambiente de Valida&ccedil;&atilde;o, consumindo este servi&ccedil;o </p>  <p><em>https://val.portalunico.siscomex.gov.br/cct/ext/carga/recepcao-nfe</em></p>  
 *
 */
@Path("/")
@Api(value = "/", description = "")
public interface CargaApi  {

    /**
     * Consolidar Carga
     *
     * &lt;p&gt;&lt;a rel&#x3D;\&quot;noopener noreferrer\&quot; href&#x3D;\&quot;../pages/exemplos/cctr/consolidar-carga/\&quot;&gt;Exemplos de Consolidação de Carga&lt;/a&gt;&lt;br&gt;&lt;br&gt;&lt;a href&#x3D;\&quot;../pages/exemplos/cctr/xsd-cct-exp.zip\&quot;&gt;XSD para download&lt;/a&gt;&lt;/p&gt;
     *
     */
    @POST
    @Path("/ext/carga/consolidar-carga")
    @Consumes({ "application/xml" })
    @ApiOperation(value = "Consolidar Carga", notes = "<p><a rel=\"noopener noreferrer\" href=\"../pages/exemplos/cctr/consolidar-carga/\">Exemplos de Consolidação de Carga</a><br><br><a href=\"../pages/exemplos/cctr/xsd-cct-exp.zip\">XSD para download</a></p>", tags={ "Carga" })
    @ApiResponses(value = {
        @ApiResponse(code = 201, message = "Operação realizada com sucesso"),
        @ApiResponse(code = 400, message = "XML não atende as especificações definidas no XSD (requisições com envio de arquivos xml)"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
        @ApiResponse(code = 500, message = "Erro interno no servidor"),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 404, message = "Recurso não encontrado") })
    public Response consolidarCarga(@ApiParam(value = "Lista de consolidações" ,required=true)@Valid OperacoesConsolidacao body, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token é recuperado no parâmetro Set-Token no response da autenticação." ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Este token é recuperado no parâmetro X-CSRF-Token no response da autenticação." ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * Consultar Contêiner
     *
     * &lt;p&gt;&lt;a rel&#x3D;\&quot;noopener noreferrer\&quot; href&#x3D;\&quot;../pages/exemplos/cctr/consultar-conteiner/\&quot;&gt;Exemplos de Respostas da Consulta Contêiner&lt;/a&gt;&lt;/p&gt;
     *
     */
    @GET
    @Path("/ext/carga/conteiner")
    @Produces({ "application/json" })
    @ApiOperation(value = "Consultar Contêiner", notes = "<p><a rel=\"noopener noreferrer\" href=\"../pages/exemplos/cctr/consultar-conteiner/\">Exemplos de Respostas da Consulta Contêiner</a></p>", tags={ "Carga" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = ConsultaConteiner.class),
        @ApiResponse(code = 400, message = "XML não atende as especificações definidas no XSD (requisições com envio de arquivos xml)"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
        @ApiResponse(code = 500, message = "Erro interno no servidor"),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 404, message = "Recurso não encontrado") })
    public Response consultarConteiner( @NotNull @ApiParam(value = "Número do Contêiner<br>Tamanho mínimo: 1<br>Tamanho máximo: 20<br>Formato: AAAAAAAAAAAAAAAAAAAA",required=true)  @QueryParam("nrConteiner") List<String> nrConteiner, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token é recuperado no parâmetro Set-Token no response da autenticação." ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Este token é recuperado no parâmetro X-CSRF-Token no response da autenticação." ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * Consultar DU-E, RUC e RUC Master
     *
     * &lt;p&gt;&lt;a rel&#x3D;\&quot;noopener noreferrer\&quot; href&#x3D;\&quot;../pages/exemplos/cctr/consultar-due-ruc/\&quot;&gt;Exemplos de Respostas da Consulta DU-E, RUC e RUC Master&lt;/a&gt;&lt;/p&gt;
     *
     */
    @GET
    @Path("/ext/carga/due-ruc")
    @Produces({ "application/json" })
    @ApiOperation(value = "Consultar DU-E, RUC e RUC Master", notes = "<p><a rel=\"noopener noreferrer\" href=\"../pages/exemplos/cctr/consultar-due-ruc/\">Exemplos de Respostas da Consulta DU-E, RUC e RUC Master</a></p>", tags={ "Carga" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = ResultadoConsulta.class),
        @ApiResponse(code = 400, message = "XML não atende as especificações definidas no XSD (requisições com envio de arquivos xml)"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
        @ApiResponse(code = 500, message = "Erro interno no servidor"),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 404, message = "Recurso não encontrado") })
    public Response consultarDUERUC( @NotNull @ApiParam(value = "Número da DU-E, da RUC ou RUC Master (até 50 ocorrências)<br><br>Número da DU-E<br>Tamanho: 14<br>Formato: AABRSSSSSSSSSD <br>Descrição Formato<br>AA - Ano<br>BR - Brasil<br>SSSSSSSSS - Numeração sequencial<br>D - DV<br><br>Número da RUC ou RUC Master<br>Tamanho mínimo: 13<br>Tamanho máximo: 35<br>Formato: NAANNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN",required=true)  @QueryParam("nrDocumento") List<String> nrDocumento, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token é recuperado no parâmetro Set-Token no response da autenticação." ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Este token é recuperado no parâmetro X-CSRF-Token no response da autenticação." ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * Consultar Estoque Pré ACD
     *
     * &lt;p&gt;&lt;a rel&#x3D;\&quot;noopener noreferrer\&quot; href&#x3D;\&quot;../pages/exemplos/cctr/consultar-estoque-pre-acd/\&quot;&gt;Exemplos de Respostas da Consulta Estoque Pré ACD&lt;/a&gt;&lt;/p&gt;
     *
     */
    @GET
    @Path("/ext/deposito-carga/estoque-antes-acd")
    @Produces({ "application/json" })
    @ApiOperation(value = "Consultar Estoque Pré ACD", notes = "<p><a rel=\"noopener noreferrer\" href=\"../pages/exemplos/cctr/consultar-estoque-pre-acd/\">Exemplos de Respostas da Consulta Estoque Pré ACD</a></p>", tags={ "Carga" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = ListaRegistros.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "XML não atende as especificações definidas no XSD (requisições com envio de arquivos xml)"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
        @ApiResponse(code = 500, message = "Erro interno no servidor"),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 404, message = "Recurso não encontrado") })
    public Response consultarEstoqueAntesACD(@ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token é recuperado no parâmetro Set-Token no response da autenticação." ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Este token é recuperado no parâmetro X-CSRF-Token no response da autenticação." ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken,  @ApiParam(value = "CPF ou CNPJ Responsável<br>Tamanho mínimo: 11<br>Tamanho máximo: 14<br>Formato: NNNNNNNNNNNNNN")  @QueryParam("cpfOuCnpjResponsavel") String cpfOuCnpjResponsavel,  @ApiParam(value = "Código URF<br>Tamanho: 7<br>Formato: NNNNNNN")  @QueryParam("codigoURF") String codigoURF,  @ApiParam(value = "Código RA<br>Tamanho: 7<br>Formato: NNNNNNN")  @QueryParam("codigoRA") String codigoRA,  @ApiParam(value = "CPF ou CNPJ Emitente<br>Tamanho mínimo: 11<br>Tamanho máximo: 14<br>Formato: NNNNNNNNNNNNNN")  @QueryParam("cpfOuCnpjEmitente") String cpfOuCnpjEmitente,  @ApiParam(value = "CPF ou CNPJ Destinatário<br>Tamanho mínimo: 11<br>Tamanho máximo: 14<br>Formato: NNNNNNNNNNNNNN")  @QueryParam("cpfOuCnpjDestinatario") String cpfOuCnpjDestinatario,  @ApiParam(value = "Data inicial emissão<br>Formato: AAAA-MM-DD")  @QueryParam("dataEmissaoInicial") String dataEmissaoInicial,  @ApiParam(value = "Data final emissão<br>Formato: AAAA-MM-DD")  @QueryParam("dataEmissaoFinal") String dataEmissaoFinal,  @ApiParam(value = "Data inicial entrada<br>Formato: AAAA-MM-DD")  @QueryParam("dataEntradaInicial") String dataEntradaInicial,  @ApiParam(value = "Data final entrada<br>Formato: AAAA-MM-DD")  @QueryParam("dataEntradaFinal") String dataEntradaFinal,  @ApiParam(value = "Código NCM<br>Tamanho: 8<br>Formato: NNNNNNNN")  @QueryParam("codigoNCM") String codigoNCM,  @ApiParam(value = "Código Pais Destinatário<br>Tamanho: 2<br>Formato: AA")  @QueryParam("codigoPaisDestinatario") String codigoPaisDestinatario,  @ApiParam(value = "Número NF formulário<br>Tamanho: 9<br>Formato: NNNNNNNNN")  @QueryParam("numeroNFF") String numeroNFF,  @ApiParam(value = "Modelo<br>Tamanho: 2<br>Formato: AA")  @QueryParam("modelo") String modelo,  @ApiParam(value = "Série<br>Tamanho: 3<br>Formato: NNN")  @QueryParam("serie") String serie,  @ApiParam(value = "UF Emissor<br>Tamanho: 2 <br>Formato: AA")  @QueryParam("ufEmissor") String ufEmissor,  @ApiParam(value = "Ano/Mês Emissão<br>Tamanho: 4 <br>Formato: AAMM")  @QueryParam("anoMesEmissao") String anoMesEmissao,  @ApiParam(value = "Chave de Acesso da Nota Fiscal Eletrônica<br>Tamanho: 44<br>Formato: NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN")  @QueryParam("numeroNFE") String numeroNFE,  @ApiParam(value = "Número Contêiner<br>Tamanho: 20<br>Formato: AAAAAAAAAAAAAAAAAAAA")  @QueryParam("numeroConteiner") String numeroConteiner,  @ApiParam(value = "Tipo documento de transporte<br>Tamanho: 2<br>Domínio<br>01 - MIC/DTA<br>02 - TIF/DTA<br>03 - DTAI<br>04 - Outros")  @QueryParam("tipoDocumentoTransporte") Integer tipoDocumentoTransporte,  @ApiParam(value = "Número documento transporte<br>Tamanho mínimo: 5<br>Tamanho Máximo: 15<br>Formato: AAAAAAAAAAAAAAA")  @QueryParam("numeroDocumentoTransporte") String numeroDocumentoTransporte,  @ApiParam(value = "Data emissão documento transporte<br>Formato: AAAA-MM-DDTHH:MM:SSZ")  @QueryParam("dataEmissaoDocumentoTransporte") String dataEmissaoDocumentoTransporte);

    /**
     * Consultar Estoque Pós ACD
     *
     * &lt;p&gt;&lt;a rel&#x3D;\&quot;noopener noreferrer\&quot; href&#x3D;\&quot;../pages/exemplos/cctr/consultar-estoque-pos-acd/\&quot;&gt;Exemplos de Respostas da Consulta Estoque Pós ACD&lt;/a&gt;&lt;/p&gt;
     *
     */
    @GET
    @Path("/ext/deposito-carga/estoque-pos-acd")
    @Produces({ "application/json" })
    @ApiOperation(value = "Consultar Estoque Pós ACD", notes = "<p><a rel=\"noopener noreferrer\" href=\"../pages/exemplos/cctr/consultar-estoque-pos-acd/\">Exemplos de Respostas da Consulta Estoque Pós ACD</a></p>", tags={ "Carga" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = ListaRegistros.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "XML não atende as especificações definidas no XSD (requisições com envio de arquivos xml)"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
        @ApiResponse(code = 500, message = "Erro interno no servidor"),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 404, message = "Recurso não encontrado") })
    public Response consultarEstoquePosACD(@ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token é recuperado no parâmetro Set-Token no response da autenticação." ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Este token é recuperado no parâmetro X-CSRF-Token no response da autenticação." ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken,  @ApiParam(value = "Números do Documento<br><br>Número da DU-E<br>Tamanho: 14<br>Formato: AABRSSSSSSSSSD <br>Descrição Formato<br>AA - Ano<br>BR - Brasil<br>SSSSSSSSS - Numeração sequencial<br>D - DV<br><br>Número da RUC ou RUC Master<br>Tamanho mínimo: 13<br>Tamanho máximo: 35<br>Formato: NAANNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN")  @QueryParam("nrDocumento") String nrDocumento,  @ApiParam(value = "Número Contêiner<br>Tamanho mínimo: 1<br>Tamanho máximo: 11<br>Formato: AAAAAAAAAAA")  @QueryParam("numeroConteiner") String numeroConteiner,  @ApiParam(value = "Data entrada inicial<br>Formato: AAAA-MM-DD")  @QueryParam("dataEntradaInicial") String dataEntradaInicial,  @ApiParam(value = "Data entrada final<br>Formato: AAAA-MM-DD")  @QueryParam("dataEntradaFinal") String dataEntradaFinal,  @ApiParam(value = "CPF ou CNPJ Responsável<br>Tamanho mínimo: 11<br>Tamanho máximo: 14<br>Formato: NNNNNNNNNNNNNN")  @QueryParam("cpfOuCnpjResponsavel") String cpfOuCnpjResponsavel,  @ApiParam(value = "Código URF<br>Tamanho: 7<br>Formato: NNNNNNN")  @QueryParam("codigoURF") BigDecimal codigoURF,  @ApiParam(value = "Código RA<br>Tamanho: 7<br>Formato: NNNNNNN")  @QueryParam("codigoRA") BigDecimal codigoRA,  @ApiParam(value = "Código País do Importador<br>Tamanho: 2<br>Formato: AA")  @QueryParam("codigoPaisImportador") BigDecimal codigoPaisImportador,  @ApiParam(value = "Código País de Destino<br>Tamanho: 2<br>Formato: AA")  @QueryParam("codigoPaisDestino") BigDecimal codigoPaisDestino,  @ApiParam(value = "CPF ou CNPJ Consolidador<br>Tamanho mínimo: 11<br>Tamanho máximo: 14<br>Formato: NNNNNNNNNNNNNN")  @QueryParam("cpfOuCnpjConsolidador") String cpfOuCnpjConsolidador,  @ApiParam(value = "CPF ou CNPJ Exportador<br>Tamanho mínimo: 11<br>Tamanho máximo: 14<br>Formato: NNNNNNNNNNNNNN")  @QueryParam("cpfOuCnpjExportador") String cpfOuCnpjExportador,  @ApiParam(value = "Tipo Documento Transporte<br>Tamanho: 2<br>Domínio<br>01 - MIC/DTA<br>02 - TIF/DTA<br>03 - DTAI<br>04 - Outros")  @QueryParam("tipoDocumentoTransporte") Integer tipoDocumentoTransporte,  @ApiParam(value = "Número Documento Transporte<br>Tamanho mínimo: 5<br>Tamanho Máximo: 15<br>Formato: AAAAAAAAAAAAAAA")  @QueryParam("numeroDocumentoTransporte") String numeroDocumentoTransporte,  @ApiParam(value = "Data emissão documento de transporte<br>Formato: AAAA-MM-DD")  @QueryParam("dataEmissaoDocumentoTransporte") String dataEmissaoDocumentoTransporte);

    /**
     * Consultar RUC Master
     *
     * &lt;p&gt;&lt;a rel&#x3D;\&quot;noopener noreferrer\&quot; href&#x3D;\&quot;../pages/exemplos/cctr/consultar-mruc/\&quot;&gt;Exemplos de Respostas da Consulta RUC Master&lt;/a&gt;&lt;/p&gt;
     *
     */
    @GET
    @Path("/ext/carga/mruc")
    @Produces({ "application/json" })
    @ApiOperation(value = "Consultar RUC Master", notes = "<p><a rel=\"noopener noreferrer\" href=\"../pages/exemplos/cctr/consultar-mruc/\">Exemplos de Respostas da Consulta RUC Master</a></p>", tags={ "Carga" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = ResultadoConsultaMRUC.class),
        @ApiResponse(code = 400, message = "XML não atende as especificações definidas no XSD (requisições com envio de arquivos xml)"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
        @ApiResponse(code = 500, message = "Erro interno no servidor"),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 404, message = "Recurso não encontrado") })
    public Response consultarMRUC( @NotNull @ApiParam(value = "Números de RUC masters<br>Tamanho mínimo: 13<br>Tamanho máximo: 35<br>Formato: NAANNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN",required=true)  @QueryParam("nrDocumento") List<String> nrDocumento, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token é recuperado no parâmetro Set-Token no response da autenticação." ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Este token é recuperado no parâmetro X-CSRF-Token no response da autenticação." ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * Listar Notas Fiscais à partir de DANFEs separados por vírgula
     *
     */
    @GET
    @Path("/ext/deposito-carga/estoque-nota-fiscal/{listaNfe}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Listar Notas Fiscais à partir de DANFEs separados por vírgula", notes = "", tags={ "Carga" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = EstoqueNFE.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "XML não atende as especificações definidas no XSD (requisições com envio de arquivos xml)"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
        @ApiResponse(code = 500, message = "Erro interno no servidor"),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 404, message = "Recurso não encontrado") })
    public Response consultarNFe(@ApiParam(value = "Chave de Acesso da Nota Fiscal Eletrônica<br>Tamanho: 44<br>Formato: NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN",required=true) @PathParam("listaNfe") String listaNfe, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token é recuperado no parâmetro Set-Token no response da autenticação." ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Este token é recuperado no parâmetro X-CSRF-Token no response da autenticação." ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * Desunitizar Carga
     *
     * &lt;p&gt;&lt;a rel&#x3D;\&quot;noopener noreferrer\&quot; href&#x3D;\&quot;../pages/exemplos/cctr/desunitizar-carga/\&quot;&gt;Exemplos de Desunitização de Carga&lt;/a&gt;&lt;br&gt;&lt;br&gt;&lt;a href&#x3D;\&quot;../pages/exemplos/cctr/xsd-cct-exp.zip\&quot;&gt;XSD para download&lt;/a&gt;&lt;/p&gt;
     *
     */
    @POST
    @Path("/ext/unitizacao/desunitizar-carga")
    @Consumes({ "application/xml" })
    @ApiOperation(value = "Desunitizar Carga", notes = "<p><a rel=\"noopener noreferrer\" href=\"../pages/exemplos/cctr/desunitizar-carga/\">Exemplos de Desunitização de Carga</a><br><br><a href=\"../pages/exemplos/cctr/xsd-cct-exp.zip\">XSD para download</a></p>", tags={ "Carga" })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Operação realizada com sucesso"),
        @ApiResponse(code = 400, message = "XML não atende as especificações definidas no XSD (requisições com envio de arquivos xml)"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
        @ApiResponse(code = 500, message = "Erro interno no servidor"),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 404, message = "Recurso não encontrado") })
    public Response desunitizarCarga(@ApiParam(value = "Desunitização de Carga" ,required=true)@Valid OperacaoDesunitizacao body, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token é recuperado no parâmetro Set-Token no response da autenticação." ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Este token é recuperado no parâmetro X-CSRF-Token no response da autenticação." ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * Entregar por Contêiner
     *
     * &lt;p&gt;&lt;a rel&#x3D;\&quot;noopener noreferrer\&quot; href&#x3D;\&quot;../pages/exemplos/cctr/entrega-conteiner/\&quot;&gt;Exemplos de Entregas por Contêineres&lt;/a&gt;&lt;br&gt;&lt;br&gt;&lt;a href&#x3D;\&quot;../pages/exemplos/cctr/xsd-cct-exp.zip\&quot;&gt;XSD para download&lt;/a&gt;&lt;/p&gt;
     *
     */
    @POST
    @Path("/ext/carga/entrega-conteiner")
    @Consumes({ "application/xml" })
    @ApiOperation(value = "Entregar por Contêiner", notes = "<p><a rel=\"noopener noreferrer\" href=\"../pages/exemplos/cctr/entrega-conteiner/\">Exemplos de Entregas por Contêineres</a><br><br><a href=\"../pages/exemplos/cctr/xsd-cct-exp.zip\">XSD para download</a></p>", tags={ "Carga" })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Operação realizada com sucesso"),
        @ApiResponse(code = 400, message = "XML não atende as especificações definidas no XSD (requisições com envio de arquivos xml)"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
        @ApiResponse(code = 500, message = "Erro interno no servidor"),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 404, message = "Recurso não encontrado") })
    public Response entregarConteiner(@ApiParam(value = "Entregas por Contêineres" ,required=true)@Valid EntregasConteineres body, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token é recuperado no parâmetro Set-Token no response da autenticação." ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Este token é recuperado no parâmetro X-CSRF-Token no response da autenticação." ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * Entregar Carga por DU-E/RUC
     *
     * &lt;p&gt;&lt;a rel&#x3D;\&quot;noopener noreferrer\&quot; href&#x3D;\&quot;../pages/exemplos/cctr/entrega-due-ruc/\&quot;&gt;Exemplos de Entregas por DU-E/RUC&lt;/a&gt;&lt;br&gt;&lt;br&gt;&lt;a href&#x3D;\&quot;../pages/exemplos/cctr/xsd-cct-exp.zip\&quot;&gt;XSD para download&lt;/a&gt;&lt;/p&gt;
     *
     */
    @POST
    @Path("/ext/carga/entrega-due-ruc")
    @Consumes({ "application/xml" })
    @ApiOperation(value = "Entregar Carga por DU-E/RUC", notes = "<p><a rel=\"noopener noreferrer\" href=\"../pages/exemplos/cctr/entrega-due-ruc/\">Exemplos de Entregas por DU-E/RUC</a><br><br><a href=\"../pages/exemplos/cctr/xsd-cct-exp.zip\">XSD para download</a></p>", tags={ "Carga" })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Operação realizada com sucesso"),
        @ApiResponse(code = 400, message = "XML não atende as especificações definidas no XSD (requisições com envio de arquivos xml)"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
        @ApiResponse(code = 500, message = "Erro interno no servidor"),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 404, message = "Recurso não encontrado") })
    public Response entregarDocumentoCarga(@ApiParam(value = "Entrega por DU-E/RUC" ,required=true)@Valid EntregasDocumentoCarga body, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token é recuperado no parâmetro Set-Token no response da autenticação." ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Este token é recuperado no parâmetro X-CSRF-Token no response da autenticação." ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * Manifestar Dados de Embarque para Exportação
     *
     * &lt;p&gt;&lt;a rel&#x3D;\&quot;noopener noreferrer\&quot; href&#x3D;\&quot;../pages/exemplos/cctr/manifestacao-dados-embarque/\&quot;&gt;Exemplos de Manifestos de Dados de Embarque para Exportação&lt;/a&gt;&lt;br&gt;&lt;br&gt;&lt;a href&#x3D;\&quot;../pages/exemplos/cctr/xsd-cct-exp.zip\&quot;&gt;XSD para download&lt;/a&gt;&lt;/p&gt;
     *
     */
    @POST
    @Path("/ext/carga/manifestacao-dados-embarque")
    @Consumes({ "application/xml" })
    @ApiOperation(value = "Manifestar Dados de Embarque para Exportação", notes = "<p><a rel=\"noopener noreferrer\" href=\"../pages/exemplos/cctr/manifestacao-dados-embarque/\">Exemplos de Manifestos de Dados de Embarque para Exportação</a><br><br><a href=\"../pages/exemplos/cctr/xsd-cct-exp.zip\">XSD para download</a></p>", tags={ "Carga" })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Operação realizada com sucesso"),
        @ApiResponse(code = 400, message = "XML não atende as especificações definidas no XSD (requisições com envio de arquivos xml)"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
        @ApiResponse(code = 500, message = "Erro interno no servidor"),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 404, message = "Recurso não encontrado") })
    public Response manifestarCargaExportacao(@ApiParam(value = "Manifestos de Dados de Embarque para Exportação" ,required=true)@Valid ManifestacoesExportacao body, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token é recuperado no parâmetro Set-Token no response da autenticação." ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Este token é recuperado no parâmetro X-CSRF-Token no response da autenticação." ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * Manifestar Dados de Embarque para Exportação de um MIC/DTA Pré-ACD
     *
     * &lt;p&gt;&lt;a rel&#x3D;\&quot;noopener noreferrer\&quot; href&#x3D;\&quot;../pages/exemplos/cctr/manifestacao-dados-embarque-pre-acd/\&quot;&gt;Exemplos de Manifestos de Dados de Embarque para Exportação de Carga Pré ACD&lt;/a&gt;&lt;br&gt;&lt;br&gt;&lt;a href&#x3D;\&quot;../pages/exemplos/cctr/xsd-cct-exp.zip\&quot;&gt;XSD para download&lt;/a&gt;&lt;/p&gt;
     *
     */
    @POST
    @Path("/ext/carga/manifestacao-dados-embarque-pre-acd")
    @Consumes({ "application/xml" })
    @ApiOperation(value = "Manifestar Dados de Embarque para Exportação de um MIC/DTA Pré-ACD", notes = "<p><a rel=\"noopener noreferrer\" href=\"../pages/exemplos/cctr/manifestacao-dados-embarque-pre-acd/\">Exemplos de Manifestos de Dados de Embarque para Exportação de Carga Pré ACD</a><br><br><a href=\"../pages/exemplos/cctr/xsd-cct-exp.zip\">XSD para download</a></p>", tags={ "Carga" })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Operação realizada com sucesso"),
        @ApiResponse(code = 400, message = "XML não atende as especificações definidas no XSD (requisições com envio de arquivos xml)"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
        @ApiResponse(code = 500, message = "Erro interno no servidor"),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 404, message = "Recurso não encontrado") })
    public Response manifestarCargaExportacaoMicPreACD(@ApiParam(value = "Manifestos de Dados de Embarque para Exportação de Carga Pré ACD" ,required=true)@Valid ManifestacoesExportacaoPreACDMicDTO body, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token é recuperado no parâmetro Set-Token no response da autenticação." ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Este token é recuperado no parâmetro X-CSRF-Token no response da autenticação." ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * Recepcionar por Contêiner
     *
     * &lt;p&gt;&lt;a rel&#x3D;\&quot;noopener noreferrer\&quot; href&#x3D;\&quot;../pages/exemplos/cctr/recepcao-conteiner/\&quot;&gt;Exemplos de Recepções por Contêineres&lt;/a&gt;&lt;br&gt;&lt;br&gt;&lt;a href&#x3D;\&quot;../pages/exemplos/cctr/xsd-cct-exp.zip\&quot;&gt;XSD para download&lt;/a&gt;&lt;/p&gt;
     *
     */
    @POST
    @Path("/ext/carga/recepcao-conteiner")
    @Consumes({ "application/xml" })
    @ApiOperation(value = "Recepcionar por Contêiner", notes = "<p><a rel=\"noopener noreferrer\" href=\"../pages/exemplos/cctr/recepcao-conteiner/\">Exemplos de Recepções por Contêineres</a><br><br><a href=\"../pages/exemplos/cctr/xsd-cct-exp.zip\">XSD para download</a></p>", tags={ "Carga" })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Operação realizada com sucesso"),
        @ApiResponse(code = 400, message = "XML não atende as especificações definidas no XSD (requisições com envio de arquivos xml)"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
        @ApiResponse(code = 500, message = "Erro interno no servidor"),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 404, message = "Recurso não encontrado") })
    public Response recepcionarConteiner(@ApiParam(value = "Recepções por Contêineres" ,required=true)@Valid RecepcoesConteineres body, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token é recuperado no parâmetro Set-Token no response da autenticação." ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Este token é recuperado no parâmetro X-CSRF-Token no response da autenticação." ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * Recepcionar Carga por DU-E/RUC
     *
     * &lt;p&gt;&lt;a rel&#x3D;\&quot;noopener noreferrer\&quot; href&#x3D;\&quot;../pages/exemplos/cctr/recepcao-due-ruc/\&quot;&gt;Exemplos de Recepções de Carga por DU-E/RUC&lt;/a&gt;&lt;br&gt;&lt;br&gt;&lt;a href&#x3D;\&quot;../pages/exemplos/cctr/xsd-cct-exp.zip\&quot;&gt;XSD para download&lt;/a&gt;&lt;/p&gt;
     *
     */
    @POST
    @Path("/ext/carga/recepcao-due-ruc")
    @Consumes({ "application/xml" })
    @ApiOperation(value = "Recepcionar Carga por DU-E/RUC", notes = "<p><a rel=\"noopener noreferrer\" href=\"../pages/exemplos/cctr/recepcao-due-ruc/\">Exemplos de Recepções de Carga por DU-E/RUC</a><br><br><a href=\"../pages/exemplos/cctr/xsd-cct-exp.zip\">XSD para download</a></p>", tags={ "Carga" })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Operação realizada com sucesso"),
        @ApiResponse(code = 400, message = "XML não atende as especificações definidas no XSD (requisições com envio de arquivos xml)"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
        @ApiResponse(code = 500, message = "Erro interno no servidor"),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 404, message = "Recurso não encontrado") })
    public Response recepcionarDocumentoCarga(@ApiParam(value = "Recepções Carga por DU-E/RUC" ,required=true)@Valid RecepcoesDocumentoCarga body, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token é recuperado no parâmetro Set-Token no response da autenticação." ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Este token é recuperado no parâmetro X-CSRF-Token no response da autenticação." ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * Recepcionar por Nota Fiscal Eletrônica (NF-e)
     *
     * &lt;p&gt;&lt;a rel&#x3D;\&quot;noopener noreferrer\&quot; href&#x3D;\&quot;../pages/exemplos/cctr/recepcao-nfe/\&quot;&gt;Exemplos de Recepções de Nota Fiscal Eletrônica&lt;/a&gt;&lt;br&gt;&lt;br&gt;&lt;a href&#x3D;\&quot;../pages/exemplos/cctr/xsd-cct-exp.zip\&quot;&gt;XSD para download&lt;/a&gt;&lt;/p&gt;
     *
     */
    @POST
    @Path("/ext/carga/recepcao-nfe")
    @Consumes({ "application/xml" })
    @ApiOperation(value = "Recepcionar por Nota Fiscal Eletrônica (NF-e)", notes = "<p><a rel=\"noopener noreferrer\" href=\"../pages/exemplos/cctr/recepcao-nfe/\">Exemplos de Recepções de Nota Fiscal Eletrônica</a><br><br><a href=\"../pages/exemplos/cctr/xsd-cct-exp.zip\">XSD para download</a></p>", tags={ "Carga" })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Operação realizada com sucesso"),
        @ApiResponse(code = 400, message = "XML não atende as especificações definidas no XSD (requisições com envio de arquivos xml)"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
        @ApiResponse(code = 500, message = "Erro interno no servidor"),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 404, message = "Recurso não encontrado") })
    public Response recepcionarNFE(@ApiParam(value = "Recepções de Nota Fiscal Eletrônica<br>Limite de 50 notas fiscais" ,required=true)@Valid RecepcoesNFE body, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token é recuperado no parâmetro Set-Token no response da autenticação." ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Este token é recuperado no parâmetro X-CSRF-Token no response da autenticação." ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * Recepcionar por Nota Fiscal Formulário
     *
     * &lt;p&gt;&lt;a rel&#x3D;\&quot;noopener noreferrer\&quot; href&#x3D;\&quot;../pages/exemplos/cctr/recepcao-nff/\&quot;&gt;Exemplos de Recepções de Nota Fiscal Formulário&lt;/a&gt;&lt;br&gt;&lt;br&gt;&lt;a href&#x3D;\&quot;../pages/exemplos/cctr/xsd-cct-exp.zip\&quot;&gt;XSD para download&lt;/a&gt;&lt;/p&gt;
     *
     */
    @POST
    @Path("/ext/carga/recepcao-nff")
    @Consumes({ "application/xml" })
    @ApiOperation(value = "Recepcionar por Nota Fiscal Formulário", notes = "<p><a rel=\"noopener noreferrer\" href=\"../pages/exemplos/cctr/recepcao-nff/\">Exemplos de Recepções de Nota Fiscal Formulário</a><br><br><a href=\"../pages/exemplos/cctr/xsd-cct-exp.zip\">XSD para download</a></p>", tags={ "Carga" })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Operação realizada com sucesso"),
        @ApiResponse(code = 400, message = "XML não atende as especificações definidas no XSD (requisições com envio de arquivos xml)"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
        @ApiResponse(code = 500, message = "Erro interno no servidor"),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 404, message = "Recurso não encontrado") })
    public Response recepcionarNFF(@ApiParam(value = "Recepções de Nota Fiscal Formulário" ,required=true)@Valid RecepcoesNFF body, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token é recuperado no parâmetro Set-Token no response da autenticação." ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Este token é recuperado no parâmetro X-CSRF-Token no response da autenticação." ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * Unitizar Carga
     *
     * &lt;p&gt;&lt;a rel&#x3D;\&quot;noopener noreferrer\&quot; href&#x3D;\&quot;../pages/exemplos/cctr/unitizar-carga/\&quot;&gt;Exemplos de Unitização de Carga&lt;/a&gt;&lt;br&gt;&lt;br&gt;&lt;a href&#x3D;\&quot;../pages/exemplos/cctr/xsd-cct-exp.zip\&quot;&gt;XSD para download&lt;/a&gt;&lt;/p&gt;
     *
     */
    @POST
    @Path("/ext/unitizacao/unitizar-carga")
    @Consumes({ "application/xml" })
    @ApiOperation(value = "Unitizar Carga", notes = "<p><a rel=\"noopener noreferrer\" href=\"../pages/exemplos/cctr/unitizar-carga/\">Exemplos de Unitização de Carga</a><br><br><a href=\"../pages/exemplos/cctr/xsd-cct-exp.zip\">XSD para download</a></p>", tags={ "Carga" })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Operação realizada com sucesso"),
        @ApiResponse(code = 400, message = "XML não atende as especificações definidas no XSD (requisições com envio de arquivos xml)"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
        @ApiResponse(code = 500, message = "Erro interno no servidor"),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 404, message = "Recurso não encontrado") })
    public Response unitizar(@ApiParam(value = "Unitização de Carga" ,required=true)@Valid OperacaoUnitizacao body, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token é recuperado no parâmetro Set-Token no response da autenticação." ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Este token é recuperado no parâmetro X-CSRF-Token no response da autenticação." ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken);
}

