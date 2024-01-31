package br.gov.siscomex.portalunico.talpco.api;

import br.gov.siscomex.portalunico.talpco.model.ConsultarLpcoResponse;
import br.gov.siscomex.portalunico.talpco.model.EmbarqueCarga;
import br.gov.siscomex.portalunico.talpco.model.IncluirLpcoRequest;
import br.gov.siscomex.portalunico.talpco.model.ItemHistoricoLpcoResponse;
import br.gov.siscomex.portalunico.talpco.model.LpcoDetalhado;
import br.gov.siscomex.portalunico.talpco.model.MensagemLpcoRequest;
import br.gov.siscomex.portalunico.talpco.model.NovaTentativaPagamentoExternalDTO;
import br.gov.siscomex.portalunico.talpco.model.PagamentoTaxa;
import br.gov.siscomex.portalunico.talpco.model.PresencaCarga;
import br.gov.siscomex.portalunico.talpco.model.RetificacaoLpcoRequest;
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
 * Tratamento Administrativo, Licenças, Permissões, Certificações e Outros Documentos
 *
 * <p><h3>TALPCO - Tratamento Administrativo, Licen&ccedil;as, Permiss&otilde;es, Certificados e Outros</h3><h4>Introdu&ccedil;&atilde;o</h4><p>Bem-vindo &agrave; API do sistema Pucomex - TALPCO.</p><p>O TALPCO &eacute; o sistema respons&aacute;vel pelo controle de documentos LPCO (Licen&ccedil;as, Permiss&otilde;es, Certificados e Outros) necess&aacute;rios para opera&ccedil;&otilde;es de com&eacute;rcio exterior. A partir deste sistema, &eacute; poss&iacute;vel gerenciar v&aacute;rias opera&ccedil;&otilde;es relativas aos LPCOs, desde a consulta de modelos de LPCO dispon&iacute;veis at&eacute; o cadastro de pedidos de LPCO e seu acompanhamento.</p><p>As opera&ccedil;&otilde;es que podem ser gerenciadas pela API do sistema s&atilde;o:</p><ul><li>Consulta de modelos de LPCOs</li><li>Cadastro de LPCOs</li><li>Consulta de LPCOs</li><li>Altera&ccedil;&otilde;es de situa&ccedil;&atilde;o (an&aacute;lise, deferimento, entre outros)</li><li>Controle de exig&ecirc;ncias</li><li>Altera&ccedil;&atilde;o e retifica&ccedil;&atilde;o de LPCOs</li><li>Solicita&ccedil;&atilde;o de compabiliza&ccedil;&atilde;o de LPCO</li><li>Controle de Prorroga&ccedil;&otilde;es</li></ul><h4>URLs de Acesso</h4><p>Para utilizar os servi&ccedil;os dispon&iacute;veis, deve-se considerar a maneira de autentica&ccedil;&atilde;o de cada servi&ccedil;o, conforme padr&atilde;o Portal &Uacute;nico do Com&eacute;rcio Exterior para os servi&ccedil;os, com exce&ccedil;&atilde;o da Consultar LPCO por Chave de Acesso para o perfil de TERCEIROS. Segue abaixo os padr&otilde;es:</p><h4>Padr&atilde;o Portal &Uacute;nico do Com&eacute;rcio Exterior</h4><p><em>https://{ambiente}/<strong>talpco</strong>/api/{servi&ccedil;o}</em></p><p>Onde, em <strong>{ambiente}</strong> deve-se informar o ambiente desejado dentre os ambientes dispon&iacute;veis na tabela abaixo e em <strong>{servi&ccedil;o}</strong> utilizar a URI do servi&ccedil;o desejado.</p><style type=\"text/css\"> .tg  {border-collapse:collapse;border-color:#bbb;border-spacing:0;width: 604px;} .tg td{background-color:#E0FFEB;border-color:#bbb;border-style:solid;border-width:1px;color:#594F4F;  font-family:Arial, sans-serif;font-size:14px;overflow:hidden;padding:10px 5px;word-break:normal;} .tg th{background-color:#9DE0AD;border-color:#bbb;border-style:solid;border-width:1px;color:#493F3F;  font-family:Arial, sans-serif;font-size:14px;font-weight:normal;overflow:hidden;padding:10px 5px;word-break:normal;} .tg  .tg-cabecalho{text-align:left;vertical-align:top}.tg  .tg-corpo{border-color:inherit;text-align:left;vertical-align:top}</style><table class=\"tg\" style=\"width: 604px;\"><thead><tr><th class=\"tg-cabecalho\"><span style=\"font-weight:bold\">Nome do Ambiente</span></th><th class=\"tg-cabecalho\"><span style=\"font-weight:bold\">URL de acesso</span></th></tr></thead><tbody><tr><td class=\"tg-corpo\">Ambiente de Validação das Empresas</td><td class=\"tg-corpo\">val.portalunico.siscomex.gov.br</td></tr><tr><td class=\"tg-corpo\">Ambiente de Produção</td><td class=\"tg-corpo\">portalunico.siscomex.gov.br</td></tr></tbody></table><p>&nbsp;</p><p><strong>Exemplo:</strong> Para o servi&ccedil;o \"Detalhar LPCO\" a URI &eacute; \"/ext/lpco/{numero}\".&nbsp;Logo, abaixo temos um exemplo de URL completa considerando o ambiente de Valida&ccedil;&atilde;o, consumindo este servi&ccedil;o.</p><p><em>https://val.portalunico.siscomex.gov.br/talpco/api/ext/lpco/E2000000001</em></p><p>Há exemplos específicos para o serviço de \"Cadastrar um pedido de LPCO\" tanto para <a target='_blank' href='../pages/exemplos/talp/lpco-exportacao'>a exportação</a> quanto para <a target='_blank' href='../pages/exemplos/talp/lpco-importacao'>a importação</a>.</p><h4>Padr&atilde;o Integra Comex</h4><p>A Consulta LPCO por Chave de Acesso para o perfil de TERCEIROS est&aacute; integrada do barramento Integra Comex. Para maiores informa&ccedil;&otilde;es:</p><p><a href='https://doc-siscomex-sapi.estaleiro.serpro.gov.br/integracomex/documentacao/lpco/consulta-avulsa.html'>https://doc-siscomex sapi.estaleiro.serpro.gov.br/integracomex/documentacao/lpco/consulta-avulsa.html</a></p><p>Favor atentar que a documentação do Integra Comex referencia somente a autenticação e maneira de consumo do serviço.Definições de modelos ainda permanecem nesta documentação.</p><h4>Orientação Passo a Passo</h4><ul><li>Consultar o simulador para identificar os modelos LPCO aplicáveis à operação (<a target='_blank' href='https://portalunico.siscomex.gov.br/talpco/#/simular-ta?perfil=publico'>exportação</a> ou <a target='_blank' href='https://portalunico.siscomex.gov.br/talpco/#/simular-ta-importacao?perfil=publico'>importação</a>);</li><li>Consultar a estrutura base do modelo desejado nos serviço de <a target='_blank' href='./talpco.html#/Modelos%20e%20templates%20de%20LPCOs/obterTemplateFormulario'>obter template de formulário</a>;</li><li>Consultar eventuais atributos adicionais de cada NCM no serviço de <a target='_blank' href='./talpco.html#/Modelos%20e%20templates%20de%20LPCOs/obterTemplateNcm'>obter template de NCM</a>;</li><li>Consultar informações de fundamento legal no serviço do <a target='_blank' href='./ttce.html#/Serviços%20para%20o%20importador/downloadUsingGET_1'>Tratamento Tributário para o importador</a> (se aplicável);</li><li>Consultar informações do produto no Catálogo de Produtos (para os LPCO que utilizam o catálogo de produtos);</li><li>Registrar pedido de LPCO utilizando o serviço de <a target='_blank' href='./talpco.html#/Cadastro%2C%20edição%20e%20consultas%20de%20LPCOs/incluirLpco'>cadastrar pedido de LPCO</a>.</li></ul>
 *
 */
@Path("/")
@Api(value = "/", description = "")
public interface CadastroEdioEConsultasDeLpcosApi  {

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
    public Response alterar(@ApiParam(value = "Número do pedido de LPCO a ser alterado.<br>Tamanho: 11<br>Formato: OAANNNNNNNN<br>Lei de formação: O número do LPCO é composto por:<br>* O = Operação (E para exportação, I para importação)<br>* AA = Ano do registro do LPCO<br>* NNNNNNNN = Número sequencial do LPCO no ano",required=true) @PathParam("numero") String numero, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token é recuperado no parâmetro Set-Token no response da autenticação" ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Este token é recuperado no parâmetro X-CSRF-Token no response da autenticação" ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken, @ApiParam(value = "" )@Valid RetificacaoLpcoRequest body);

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
    public Response consultar3( @NotNull @ApiParam(value = "Tipo de operação do LPCO.<br>Tamanho máximo: 20<br>Domínio:<br>EXPORTACAO<br>IMPORTACAO",required=true)  @QueryParam("tipo-operacao") String tipoOperacao, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token é recuperado no parâmetro Set-Token no response da autenticação" ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Este token é recuperado no parâmetro X-CSRF-Token no response da autenticação" ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken,  @ApiParam(value = "Índice do primeiro elemento.", defaultValue="0") @DefaultValue("0") @QueryParam("offset") Integer offset,  @ApiParam(value = "Número de um LPCO específico.<br>Tamanho: 11<br>Formato: OAANNNNNNNN<br>Lei de formação: O número do LPCO é composto por:<br>* O = Operação (E para exportação, I para importação)<br>* AA = Ano do registro do LPCO<br>* NNNNNNNN = Número sequencial do LPCO no ano")  @QueryParam("numero") String numero,  @ApiParam(value = "Código da situação em que o LPCO se encontra.<br>Tamanho mínimo: 1<br>Tamanho máximo:40<br>Domínio:<br>PARA_ANALISE<br>EM_ANALISE<br>INDEFERIDO<br>EM_EXIGENCIA<br>RESPOSTA_EXIGENCIA<br>CANCELADO<br>DEFERIDO<br>VENCIDO<br>ANULADO_REVOGADO<br>EM_VERIFICACAO<br>EM_INSPECAO<br>AGUARDANDO_PAGAMENTO<br>AUTORIZACAO_IMPORTACAO_EMITIDA<br>PARAMETRIZADO<br>CONFERENCIA_DOCUMENTAL<br>INSPECAO_FISICA<br>RECURSO_INDEFERIMENTO<br>RECURSO_DIVERSO<br>")  @QueryParam("situacao") String situacao,  @ApiParam(value = "Código da situação da solicitação de prorrogação atual do LPCO, se houver.<br>Tamanho máximo: 40<br>Domínio:<br>PARA_ANALISE<br>AGUARDANDO_PAGAMENTO<br>DEFERIDO<br>INDEFERIDO")  @QueryParam("situacaoProrrogacao") String situacaoProrrogacao,  @ApiParam(value = "Código da situação da solicitação de retificação atual do LPCO, se houver.<br>Tamanho máximo: 40<br>Domínio:<br>PARA_ANALISE<br>AGUARDANDO_PAGAMENTO<br>DEFERIDO<br>INDEFERIDO")  @QueryParam("situacaoRetificacao") String situacaoRetificacao,  @ApiParam(value = "Código da situação da solicitação de compatibilização atual do LPCO, se houver.<br>Tamanho máximo: 40<br>Domínio:<br>PARA_ANALISE<br>AGUARDANDO_PAGAMENTO<br>DEFERIDO<br>INDEFERIDO")  @QueryParam("situacaoCompatibilizacao") String situacaoCompatibilizacao,  @ApiParam(value = "Código do modelo de formulário do LPCO.<br>Tamanho: 6<br>Formato: ONNNNN<br>Lei de formação: O número do modelo de LPCO é composto por:<br>* O = Operação (E para exportação, I para importação)<br>* NNNNN = Número sequencial do LPCO no ano")  @QueryParam("codigo-modelo") String codigoModelo,  @ApiParam(value = "Sigla do órgão anuente do LPCO.<br>Tamanho mínimo: 1<br>Tamanho máximo: 30")  @QueryParam("orgao-anuente") String orgaoAnuente,  @ApiParam(value = "Número do CPF ou CNPJ do Importador ou Exportador no LPCO.<br>Tamanho: 11 (CPF) ou 14 (CNPJ)<br>Formato: NNNNNNNNNNN (CPF) ou NNNNNNNNNNNNNN (CNPJ)")  @QueryParam("importador-exportador") String importadorExportador,  @ApiParam(value = "Data inicial de filtro sobre a data o registro do pedido de LPCO, no formato ISO, com precisão de dias.<br>Formato: yyyy-MM-dd")  @QueryParam("data-inicial-registro") String dataInicialRegistro,  @ApiParam(value = "Data final de filtro sobre a data o registro do pedido de LPCO, no formato ISO, com precisão de dias.<br>Formato: yyyy-MM-dd")  @QueryParam("data-final-registro") String dataFinalRegistro,  @ApiParam(value = "Código ISO (duas letras) do país de destino (se houver).<br>Tamanho: 2")  @QueryParam("pais-destino") String paisDestino,  @ApiParam(value = "Código ISO (duas letras) do país do importador (se houver).<br>Tamanho: 2")  @QueryParam("pais-importador") String paisImportador,  @ApiParam(value = "Código da DU-E / DUIMP à qual o LPCO está vinculado.<br>Tamanho: 14 (DUE) ou 15 (DUIMP)")  @QueryParam("due") String due,  @ApiParam(value = "Número inicial do filtro sobre NCM contida no LPCO.<br>Tamanho: 8<br>Formato: NNNNNNNN")  @QueryParam("ncm-inicial") String ncmInicial,  @ApiParam(value = "Número final do filtro sobre NCM contida no LPCO.<br>Tamanho: 8<br>Formato: NNNNNNNN")  @QueryParam("ncm-final") String ncmFinal,  @ApiParam(value = "Filtra os LPCOs com carga em despacho.")  @QueryParam("carga-despacho") Boolean cargaDespacho,  @ApiParam(value = "Número do documento LPCO em seu órgão anuente, se houver.<br>Tamanho mínimo: 1<br>Tamanho máximo: 30")  @QueryParam("numero-documento-orgao") String numeroDocumentoOrgao,  @ApiParam(value = "Filtra apenas os LPCOs vinculados a alguma DU-E, no caso da exportação.")  @QueryParam("operacao-vinculada") Boolean operacaoVinculada,  @ApiParam(value = "Número da LI a qual o LPCO está vinculado, se for o caso.<br>Tamanho: 11<br>Formato: AANNNNNNNV (apenas dígitos, sem os caracteres separadores)<br>Lei de formação: O número da LI é composto por:<br>* AA = Ano do registro da LI<br>* NNNNNNN = Número sequencial da LI no ano* V = Dígito verificador")  @QueryParam("numero-li") String numeroLi,  @ApiParam(value = "Número do conhecimento de carga do LPCO, se houver. Disponível apenas em LPCOs com LI vinculada.<br>Tamanho máximo: 20")  @QueryParam("numero-conhecimento") String numeroConhecimento,  @ApiParam(value = "Filtra os LPCOs que já têm data de embarque informada (true) ou que ainda não têm data de embarque informada (false). Utilizado apenas para LPCOs com LI vinculada).")  @QueryParam("carga-embarcada") Boolean cargaEmbarcada,  @ApiParam(value = "Filtra os LPCOs que já têm data de presença de carga informada (true) ou que ainda não têm data de presença de carga informada (false). Utilizado apenas para LPCOs com LI vinculada).")  @QueryParam("presenca-carga") Boolean presencaCarga,  @ApiParam(value = "Canal do LPCO (apenas para LPCOs com LI vinculada).<br>Tamanho máximo: 20<br>Domínio:<br>VERDE<br>AMARELO<br>VERMELHO")  @QueryParam("canal") String canal);

    /**
     * Consultar Histórico de LPCO.
     *
     */
    @GET
    @Path("/ext/lpco/{numero}/historico")
    @Produces({ "application/json" })
    @ApiOperation(value = "Consultar Histórico de LPCO.", notes = "", tags={ "Cadastro, edição e consultas de LPCOs" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = ItemHistoricoLpcoResponse.class),
        @ApiResponse(code = 204, message = "Operação realizada com sucesso. Nemhum conteúdo retornado"),
        @ApiResponse(code = 400, message = "Requisição mal formatada"),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
        @ApiResponse(code = 500, message = "Erro interno no servidor") })
    public Response consultarHistorico(@ApiParam(value = "Número do LPCO.<br>Tamanho: 11<br>Formato: OAANNNNNNNN<br>Lei de formação: O número do LPCO é composto por:<br>* O = Operação (E para exportação, I para importação)<br>* AA = Ano do registro do LPCO<br>* NNNNNNNN = Número sequencial do LPCO no ano",required=true) @PathParam("numero") String numero, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token é recuperado no parâmetro Set-Token no response da autenticação" ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Este token é recuperado no parâmetro X-CSRF-Token no response da autenticação" ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * Download de certificado.
     *
     */
    @GET
    @Path("/ext/lpco/{numeroLpco}/{numeroItem}/download-certificado")
    @ApiOperation(value = "Download de certificado.", notes = "", tags={ "Cadastro, edição e consultas de LPCOs" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Operação realizada com sucesso"),
        @ApiResponse(code = 204, message = "Operação realizada com sucesso. Nemhum conteúdo retornado"),
        @ApiResponse(code = 400, message = "Requisição mal formatada"),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
        @ApiResponse(code = 500, message = "Erro interno no servidor") })
    public Response downloadCertificado(@ApiParam(value = "Número do LPCO.<br>Tamanho: 11<br>Formato: OAANNNNNNNN<br>Lei de formação: O número do LPCO é composto por:<br>* O = Operação (E para exportação, I para importação)<br>* AA = Ano do registro do LPCO<br>* NNNNNNNN = Número sequencial do LPCO no ano",required=true) @PathParam("numeroLpco") String numeroLpco, @ApiParam(value = "Número do item do LPCO.<br>Tamanho: 4 + <br>Formato: Número inteiro sem casas decimais",required=true) @PathParam("numeroItem") Integer numeroItem, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token é recuperado no parâmetro Set-Token no response da autenticação" ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Este token é recuperado no parâmetro X-CSRF-Token no response da autenticação" ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken,  @ApiParam(value = "Chave de acesso do LPCO. Necessário apenas se o usuário não possui permissão direta de acesso aos dados do LPCO.<br>Tamanho mínimo: 1<br>Tamanho :32 caracteres hexadecimais")  @QueryParam("chaveAcesso") String chaveAcesso);

    /**
     * Download de zip com todos os ceriticados associados a um LPCO.
     *
     */
    @GET
    @Path("/ext/lpco/{numeroLpco}/download-certificados")
    @ApiOperation(value = "Download de zip com todos os ceriticados associados a um LPCO.", notes = "", tags={ "Cadastro, edição e consultas de LPCOs" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Operação realizada com sucesso"),
        @ApiResponse(code = 204, message = "Operação realizada com sucesso. Nemhum conteúdo retornado"),
        @ApiResponse(code = 400, message = "Requisição mal formatada"),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
        @ApiResponse(code = 500, message = "Erro interno no servidor") })
    public Response downloadCertificados(@ApiParam(value = "Número do LPCO.<br>Tamanho: 11<br>Formato: OAANNNNNNNN<br>Lei de formação: O número do LPCO é composto por:<br>* O = Operação (E para exportação, I para importação)<br>* AA = Ano do registro do LPCO<br>* NNNNNNNN = Número sequencial do LPCO no ano",required=true) @PathParam("numeroLpco") String numeroLpco, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token é recuperado no parâmetro Set-Token no response da autenticação" ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Este token é recuperado no parâmetro X-CSRF-Token no response da autenticação" ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken,  @ApiParam(value = "Chave de acesso do LPCO. Necessário apenas se o usuário não possui permissão direta de acesso aos dados do LPCO.<br>Tamanho mínimo: 1<br>Tamanho :32 caracteres hexadecimais")  @QueryParam("chaveAcesso") String chaveAcesso);

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
    public Response incluirLpco(@ApiParam(value = "Dados do pedido de LPCO a ser cadastrado. Confira exemplos para <a target='_blank' href='../pages/exemplos/talp/lpco-exportacao'>exportação</a> e para <a target='_blank' href='../pages/exemplos/talp/lpco-importacao'>importação</a>." ,required=true)@Valid IncluirLpcoRequest body, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token é recuperado no parâmetro Set-Token no response da autenticação" ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Este token é recuperado no parâmetro X-CSRF-Token no response da autenticação" ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * Inserir mensagem nos histórico do LPCO.
     *
     */
    @POST
    @Path("/ext/lpco/{numero}/mensagem")
    @Consumes({ "application/json" })
    @ApiOperation(value = "Inserir mensagem nos histórico do LPCO.", notes = "", tags={ "Cadastro, edição e consultas de LPCOs" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Operação realizada com sucesso"),
        @ApiResponse(code = 400, message = "Requisição mal formatada"),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
        @ApiResponse(code = 500, message = "Erro interno no servidor") })
    public Response inserirMensagem(@ApiParam(value = "Conteúdo da mensagem." ,required=true)@Valid MensagemLpcoRequest body, @ApiParam(value = "Número do LPCO onde será escrita a mensagem.<br>Tamanho: 11<br>Formato: OAANNNNNNNN<br>Lei de formação: O número do LPCO é composto por:<br>* O = Operação (E para exportação, I para importação)<br>* AA = Ano do registro do LPCO<br>* NNNNNNNN = Número sequencial do LPCO no ano",required=true) @PathParam("numero") String numero, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token é recuperado no parâmetro Set-Token no response da autenticação" ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Este token é recuperado no parâmetro X-CSRF-Token no response da autenticação" ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * Informar nova tentativa de pagamento de taxa.
     *
     */
    @POST
    @Path("/ext/lpco/{numeroLpco}/nova-tentativa-pagamento")
    @Consumes({ "application/json" })
    @ApiOperation(value = "Informar nova tentativa de pagamento de taxa.", notes = "", tags={ "Cadastro, edição e consultas de LPCOs" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Operação realizada com sucesso"),
        @ApiResponse(code = 204, message = "Operação realizada com sucesso. Nemhum conteúdo retornado"),
        @ApiResponse(code = 400, message = "Requisição mal formatada"),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
        @ApiResponse(code = 500, message = "Erro interno no servidor") })
    public Response novaTentativaPagamento1(@ApiParam(value = "Indicador de pagamento da taxa." ,required=true)@Valid NovaTentativaPagamentoExternalDTO body, @ApiParam(value = "Número do LPCO.<br>Tamanho: 11<br>Formato: OAANNNNNNNN<br>Lei de formação: O número do LPCO é composto por:<br>* O = Operação (E para exportação, I para importação)<br>* AA = Ano do registro do LPCO<br>* NNNNNNNN = Número sequencial do LPCO no ano",required=true) @PathParam("numeroLpco") String numeroLpco, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token é recuperado no parâmetro Set-Token no response da autenticação" ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Este token é recuperado no parâmetro X-CSRF-Token no response da autenticação" ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * Detalhar um pedido de LPCO.
     *
     */
    @GET
    @Path("/ext/lpco/{numero}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Detalhar um pedido de LPCO.", notes = "", tags={ "Cadastro, edição e consultas de LPCOs" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = LpcoDetalhado.class),
        @ApiResponse(code = 400, message = "Requisição mal formatada"),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
        @ApiResponse(code = 500, message = "Erro interno no servidor") })
    public Response obter(@ApiParam(value = "Número do LPCO.<br>Tamanho: 11<br>Formato: OAANNNNNNNN<br>Lei de formação: O número do LPCO é composto por:<br>* O = Operação (E para exportação, I para importação)<br>* AA = Ano do registro do LPCO<br>* NNNNNNNN = Número sequencial do LPCO no ano",required=true) @PathParam("numero") String numero, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token é recuperado no parâmetro Set-Token no response da autenticação" ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Este token é recuperado no parâmetro X-CSRF-Token no response da autenticação" ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * Informar pagamento de taxa realizado.
     *
     */
    @POST
    @Path("/ext/lpco/{numero}/pagamento-taxa")
    @Consumes({ "application/json" })
    @ApiOperation(value = "Informar pagamento de taxa realizado.", notes = "", tags={ "Cadastro, edição e consultas de LPCOs" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Operação realizada com sucesso"),
        @ApiResponse(code = 204, message = "Operação realizada com sucesso. Nemhum conteúdo retornado"),
        @ApiResponse(code = 400, message = "Requisição mal formatada"),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
        @ApiResponse(code = 500, message = "Erro interno no servidor") })
    public Response pagamentoTaxaRealizado(@ApiParam(value = "Indicador de pagamento da taxa." ,required=true)@Valid PagamentoTaxa body, @ApiParam(value = "Número do LPCO.<br>Tamanho: 11<br>Formato: OAANNNNNNNN<br>Lei de formação: O número do LPCO é composto por:<br>* O = Operação (E para exportação, I para importação)<br>* AA = Ano do registro do LPCO<br>* NNNNNNNN = Número sequencial do LPCO no ano",required=true) @PathParam("numero") String numero, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token é recuperado no parâmetro Set-Token no response da autenticação" ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Este token é recuperado no parâmetro X-CSRF-Token no response da autenticação" ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * Registrar / alterar dados de embarque de carga.
     *
     */
    @POST
    @Path("/ext/lpco/{numeroLpco}/embarque-carga")
    @Consumes({ "application/json" })
    @ApiOperation(value = "Registrar / alterar dados de embarque de carga.", notes = "", tags={ "Cadastro, edição e consultas de LPCOs" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Operação realizada com sucesso"),
        @ApiResponse(code = 204, message = "Operação realizada com sucesso. Nemhum conteúdo retornado"),
        @ApiResponse(code = 400, message = "Requisição mal formatada"),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
        @ApiResponse(code = 500, message = "Erro interno no servidor") })
    public Response registrarEmbarqueCarga1(@ApiParam(value = "Dados do embarque." ,required=true)@Valid EmbarqueCarga body, @ApiParam(value = "Número do LPCO.<br>Tamanho: 11<br>Formato: OAANNNNNNNN<br>Lei de formação: O número do LPCO é composto por:<br>* O = Operação (E para exportação, I para importação)<br>* AA = Ano do registro do LPCO<br>* NNNNNNNN = Número sequencial do LPCO no ano",required=true) @PathParam("numeroLpco") String numeroLpco, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token é recuperado no parâmetro Set-Token no response da autenticação" ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Este token é recuperado no parâmetro X-CSRF-Token no response da autenticação" ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * Registrar / alterar dados de presença de carga.
     *
     */
    @POST
    @Path("/ext/lpco/{numeroLpco}/presenca-carga")
    @Consumes({ "application/json" })
    @ApiOperation(value = "Registrar / alterar dados de presença de carga.", notes = "", tags={ "Cadastro, edição e consultas de LPCOs" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Operação realizada com sucesso"),
        @ApiResponse(code = 204, message = "Operação realizada com sucesso. Nemhum conteúdo retornado"),
        @ApiResponse(code = 400, message = "Requisição mal formatada"),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
        @ApiResponse(code = 500, message = "Erro interno no servidor") })
    public Response registrarPresencaCarga(@ApiParam(value = "Dados do presença de carga." ,required=true)@Valid PresencaCarga body, @ApiParam(value = "Número do LPCO.<br>Tamanho: 11<br>Formato: OAANNNNNNNN<br>Lei de formação: O número do LPCO é composto por:<br>* O = Operação (E para exportação, I para importação)<br>* AA = Ano do registro do LPCO<br>* NNNNNNNN = Número sequencial do LPCO no ano",required=true) @PathParam("numeroLpco") String numeroLpco, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token é recuperado no parâmetro Set-Token no response da autenticação" ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Este token é recuperado no parâmetro X-CSRF-Token no response da autenticação" ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken);
}

