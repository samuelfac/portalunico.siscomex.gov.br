package br.gov.siscomex.portalunico.talpco.api;

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

import br.gov.siscomex.portalunico.talpco.model.AlterarLpcoRequest;
import br.gov.siscomex.portalunico.talpco.model.ConsultarLpcoResponse;
import br.gov.siscomex.portalunico.talpco.model.IncluirLpcoRequest;
import br.gov.siscomex.portalunico.talpco.model.LpcoDetalhado;
import br.gov.siscomex.portalunico.talpco.model.ResultadoServicoExternoPaginado;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * Tratamento Administrativo, Licenças, Permissões, Certificações e Outros Documentos
 *
 * <p><h3>TALPCO - Tratamento Administrativo, Licen&ccedil;as, Permiss&otilde;es, Certificados e Outros</h3><h4>Introdu&ccedil;&atilde;o</h4> <p>Bem-vindo &agrave; API do sistema Pucomex - TALPCO.</p> <p>O TALPCO &eacute; o sistema respons&aacute;vel pelo controle de documentos LPCO (Licen&ccedil;as, Permiss&otilde;es, Certificados e Outros) necess&aacute;rios para opera&ccedil;&otilde;es de com&eacute;rcio exterior. A partir deste sistema, &eacute; poss&iacute;vel gerenciar v&aacute;rias opera&ccedil;&otilde;es relativas aos LPCOs, desde a consulta de modelos de LPCO dispon&iacute;veis at&eacute; o cadastro de pedidos de LPCO e seu acompanhamento.</p> <p>As opera&ccedil;&otilde;es que podem ser gerenciadas pela API do sistema s&atilde;o:</p> <ul> <li>Consulta de modelos de LPCOs</li> <li>Cadastro de LPCOs</li> <li>Consulta de LPCOs</li> <li>Altera&ccedil;&otilde;es de situa&ccedil;&atilde;o (an&aacute;lise, deferimento, entre outros)</li> <li>Controle de exig&ecirc;ncias</li> <li>Altera&ccedil;&atilde;o e retifica&ccedil;&atilde;o de LPCOs</li> <li>Solicita&ccedil;&atilde;o de compabiliza&ccedil;&atilde;o de LPCO</li> <li>Controle de Prorroga&ccedil;&otilde;es</li> </ul> <h4>URLs de Acesso</h4> <p>Para utilizar os servi&ccedil;os dispon&iacute;veis nessa API deve-se seguir o seguinte padr&atilde;o de URL:</p> <p><em>https://{ambiente}/<strong>talpco</strong>/api/{servi&ccedil;o}</em></p> <p>Onde, em <strong>{ambiente}</strong> deve-se informar o ambiente desejado dentro os ambientes dispon&iacute;veis na tabela abaixo e em <strong>{servi&ccedil;o}</strong> utilizar a URI do servi&ccedil;o desejado.</p> <style type=\"text/css\">  .tg  {border-collapse:collapse;border-color:#bbb;border-spacing:0;width: 604px;}  .tg td{background-color:#E0FFEB;border-color:#bbb;border-style:solid;border-width:1px;color:#594F4F;  font-family:Arial, sans-serif;font-size:14px;overflow:hidden;padding:10px 5px;word-break:normal;}  .tg th{background-color:#9DE0AD;border-color:#bbb;border-style:solid;border-width:1px;color:#493F3F;  font-family:Arial, sans-serif;font-size:14px;font-weight:normal;overflow:hidden;padding:10px 5px;word-break:normal;}  .tg   .tg-cabecalho{text-align:left;vertical-align:top}.tg   .tg-corpo{border-color:inherit;text-align:left;vertical-align:top} </style> <table class=\"tg\" style=\"width: 604px;\"> <thead> <tr> <th class=\"tg-cabecalho\"><span style=\"font-weight:bold\">Nome do Ambiente</span></th> <th class=\"tg-cabecalho\"><span style=\"font-weight:bold\">URL de acesso</span></th> </tr> </thead> <tbody> <tr> <td class=\"tg-corpo\">Ambiente de Validação da Empresas</td> <td class=\"tg-corpo\">val.portalunico.siscomex.gov.br</td> </tr> <tr> <td class=\"tg-corpo\">Ambiente de Produção</td> <td class=\"tg-corpo\">portalunico.siscomex.gov.br</td> </tr> </tbody> </table> <p>&nbsp;</p> <p><strong>Exemplo:</strong> Para o servi&ccedil;o \"Detalhar LPCO\" a URI &eacute; \"/ext/lpco/{numero}\".</p> <p>Logo, abaixo temos um exemplo de URL completa considerando o ambiente de Valida&ccedil;&atilde;o, consumindo este servi&ccedil;o </p> <p><em>https://val.portalunico.siscomex.gov.br/talpco/api/ext/lpco/E2000000001</em></p> 
 *
 */
@Path("/")
@Api(value = "/", description = "")
public interface CadastroEdioEConsultasDeLpcOsApi  {

    /**
     * Alterar um pedido de LPCO.
     *
     */
    @PUT
    @Path("/ext/lpco/{numero}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Alterar um pedido de LPCO.", notes = "", tags={ "Cadastro, edição e consultas de LPCOs" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = LpcoDetalhado.class),
        @ApiResponse(code = 400, message = "Requisição mal formatada"),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
        @ApiResponse(code = 500, message = "Erro interno no servidor") })
    public Response alterar(@QueryParam("TPP-ID") String TPP_ID, @HeaderParam("abi") String abi, @ApiParam(value = "Número do pedido de LPCO a ser alterado.<br>Tamanho: 11<br>Formato: OAANNNNNNNN<br>Lei de formação: O número do LPCO é composto por:<br>* O = Operação (E para exportação, I para importação)<br>* AA = Ano do registro do LPCO<br>* NNNNNNNN = Número sequencial do LPCO no ano",required=true) @PathParam("numero") String numero, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token é recuperado no parâmetro Set-Token no response da autenticação" ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Este token é recuperado no parâmetro X-CSRF-Token no response da autenticação" ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken, @ApiParam(value = "" )@Valid AlterarLpcoRequest body);

    /**
     * Consultar LPCOs.
     *
     */
    @GET
    @Path("/ext/lpco/consulta")
    @Produces({ "application/json" })
    @ApiOperation(value = "Consultar LPCOs.", notes = "", tags={ "Cadastro, edição e consultas de LPCOs" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = ConsultarLpcoResponse.class, responseContainer = "List"),
        @ApiResponse(code = 204, message = "Operação realizada com sucesso. Nemhum conteúdo retornado"),
        @ApiResponse(code = 206, message = "Operação realizada com sucesso"),
        @ApiResponse(code = 400, message = "Requisição mal formatada"),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
        @ApiResponse(code = 500, message = "Erro interno no servidor") })
    public Response consultar(@QueryParam("TPP-ID") String TPP_ID, @HeaderParam("abi") String abi,  @NotNull @ApiParam(value = "Tipo de operação do LPCO.<br>Tamanho máximo: 20<br>Domínio:<br>EXPORTACAO<br>IMPORTACAO",required=true)  @QueryParam("tipo-operacao") String tipoOperacao, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token é recuperado no parâmetro Set-Token no response da autenticação" ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Este token é recuperado no parâmetro X-CSRF-Token no response da autenticação" ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken,  @ApiParam(value = "Índice do primeiro elemento.", defaultValue="0") @DefaultValue("0") @QueryParam("offset") Integer offset,  @ApiParam(value = "Número de um LPCO específico.<br>Tamanho: 11<br>Formato: OAANNNNNNNN<br>Lei de formação: O número do LPCO é composto por:<br>* O = Operação (E para exportação, I para importação)<br>* AA = Ano do registro do LPCO<br>* NNNNNNNN = Número sequencial do LPCO no ano")  @QueryParam("numero") String numero,  @ApiParam(value = "Código da situação em que o LPCO se encontra.<br>Tamanho mínimo: 1<br>Tamanho máximo:40<br>Domínio:<br>PARA_ANALISE<br>EM_ANALISE<br>INDEFERIDO<br>EM_EXIGENCIA<br>RESPOSTA_EXIGENCIA<br>CANCELADO<br>DEFERIDO<br>VENCIDO<br>ANULADO_REVOGADO<br>EM_VERIFICACAO<br>EM_INSPECAO")  @QueryParam("situacao") String situacao,  @ApiParam(value = "Código da situação da solicitação de prorrogação atual do LPCO, se houver.<br>Tamanho máximo: 40<br>Domínio:<br>PARA_ANALISE<br>DEFERIDO<br>INDEFERIDO")  @QueryParam("situacaoProrrogacao") String situacaoProrrogacao,  @ApiParam(value = "Código da situação da solicitação de retificação atual do LPCO, se houver.<br>Tamanho máximo: 40<br>Domínio:<br>PARA_ANALISE<br>DEFERIDO<br>INDEFERIDO")  @QueryParam("situacaoRetificacao") String situacaoRetificacao,  @ApiParam(value = "Código do modelo de formulário do LPCO.<br>Tamanho: 6<br>Formato: ONNNNN<br>Lei de formação: O número do modelo de LPCO é composto por:<br>* O = Operação (E para exportação, I para importação)<br>* NNNNN = Número sequencial do LPCO no ano")  @QueryParam("codigo-modelo") String codigoModelo,  @ApiParam(value = "Sigla do órgão anuente do LPCO.<br>Tamanho mínimo: 1<br>Tamanho máximo: 30")  @QueryParam("orgao-anuente") String orgaoAnuente,  @ApiParam(value = "Número do CPF ou CNPJ do Importador ou Exportador no LPCO.<br>Tamanho: 11 (CPF) ou 14 (CNPJ)<br>Formato: NNNNNNNNNNN (CPF) ou NNNNNNNNNNNNNN (CNPJ)")  @QueryParam("importador-exportador") String importadorExportador,  @ApiParam(value = "Data inicial de filtro sobre a data o registro do pedido de LPCO, no formato ISO, com precisão de dias.<br>Formato: yyyy-MM-dd")  @QueryParam("data-inicial-registro") String dataInicialRegistro,  @ApiParam(value = "Data final de filtro sobre a data o registro do pedido de LPCO, no formato ISO, com precisão de dias.<br>Formato: yyyy-MM-dd")  @QueryParam("data-final-registro") String dataFinalRegistro,  @ApiParam(value = "Código ISO (duas letras) do país de destino (se houver).<br>Tamanho: 2")  @QueryParam("pais-destino") String paisDestino,  @ApiParam(value = "Código ISO (duas letras) do país do importador (se houver).<br>Tamanho: 2")  @QueryParam("pais-importador") String paisImportador,  @ApiParam(value = "Código da DU-E / DUIMP à qual o LPCO está vinculado.<br>Tamanho: 14 (DUE) ou 15 (DUIMP)")  @QueryParam("due") String due,  @ApiParam(value = "Número inicial do filtro sobre NCM contida no LPCO.<br>Tamanho: 8<br>Formato: NNNNNNNN")  @QueryParam("ncm-inicial") String ncmInicial,  @ApiParam(value = "Número final do filtro sobre NCM contida no LPCO.<br>Tamanho: 8<br>Formato: NNNNNNNN")  @QueryParam("ncm-final") String ncmFinal,  @ApiParam(value = "Filtra os LPCOs com carga em despacho.")  @QueryParam("carga-despacho") Boolean cargaDespacho,  @ApiParam(value = "Número do documento LPCO em seu órgão anuente, se houver.<br>Tamanho mínimo: 1<br>Tamanho máximo: 30")  @QueryParam("numero-documento-orgao") String numeroDocumentoOrgao,  @ApiParam(value = "Filtra apenas os LPCOs vinculados a alguma DU-E, no caso da exportação.")  @QueryParam("operacao-vinculada") Boolean operacaoVinculada);

    /**
     * Consulta detalhada de LPCOs.
     *
     * &lt;p&gt; Disponível apenas para a Administração Pública.&lt;/p&gt;
     *
     */
    @GET
    @Path("/ext/lpco/consulta-completa")
    @Produces({ "application/json" })
    @ApiOperation(value = "Consulta detalhada de LPCOs.", notes = "<p> Disponível apenas para a Administração Pública.</p>", tags={ "Cadastro, edição e consultas de LPCOs" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = ResultadoServicoExternoPaginado.class),
        @ApiResponse(code = 204, message = "Operação realizada com sucesso. Nemhum conteúdo retornado"),
        @ApiResponse(code = 206, message = "Operação realizada com sucesso"),
        @ApiResponse(code = 400, message = "Requisição mal formatada"),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
        @ApiResponse(code = 500, message = "Erro interno no servidor") })
    public Response consultarCompleta(@QueryParam("TPP-ID") String TPP_ID, @HeaderParam("abi") String abi,  @NotNull @ApiParam(value = "Data inicial de registro dos LPCOs.<br>Formato: yyyy-MM-dd",required=true)  @QueryParam("data-inicial") String dataInicial,  @NotNull @ApiParam(value = "Data final de registro dos LPCOs.<br>Formato: yyyy-MM-dd",required=true)  @QueryParam("data-final") String dataFinal, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token é recuperado no parâmetro Set-Token no response da autenticação" ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Este token é recuperado no parâmetro X-CSRF-Token no response da autenticação" ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken,  @ApiParam(value = "Índice do primeiro registro a ser retornado pela consulta paginada.", defaultValue="0") @DefaultValue("0") @QueryParam("offset") Integer offset);

    /**
     * Cadastrar um pedido de LPCO.
     *
     */
    @POST
    @Path("/ext/lpco")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Cadastrar um pedido de LPCO.", notes = "", tags={ "Cadastro, edição e consultas de LPCOs" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = LpcoDetalhado.class),
        @ApiResponse(code = 400, message = "Requisição mal formatada"),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
        @ApiResponse(code = 500, message = "Erro interno no servidor") })
    public Response incluirLpco(@QueryParam("TPP-ID") String TPP_ID, @HeaderParam("abi") String abi, @ApiParam(value = "Dados do pedido de LPCO a ser cadastrado." ,required=true)@Valid IncluirLpcoRequest body, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token é recuperado no parâmetro Set-Token no response da autenticação" ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Este token é recuperado no parâmetro X-CSRF-Token no response da autenticação" ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * Detalhar LPCO.
     *
     */
    @GET
    @Path("/ext/lpco/{numero}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Detalhar LPCO.", notes = "", tags={ "Cadastro, edição e consultas de LPCOs" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = LpcoDetalhado.class),
        @ApiResponse(code = 400, message = "Requisição mal formatada"),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
        @ApiResponse(code = 500, message = "Erro interno no servidor") })
    public Response obter(@QueryParam("TPP-ID") String TPP_ID, @HeaderParam("abi") String abi, @ApiParam(value = "Número do LPCO.<br>Tamanho: 11<br>Formato: OAANNNNNNNN<br>Lei de formação: O número do LPCO é composto por:<br>* O = Operação (E para exportação, I para importação)<br>* AA = Ano do registro do LPCO<br>* NNNNNNNN = Número sequencial do LPCO no ano",required=true) @PathParam("numero") String numero, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token é recuperado no parâmetro Set-Token no response da autenticação" ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Este token é recuperado no parâmetro X-CSRF-Token no response da autenticação" ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken);
}

