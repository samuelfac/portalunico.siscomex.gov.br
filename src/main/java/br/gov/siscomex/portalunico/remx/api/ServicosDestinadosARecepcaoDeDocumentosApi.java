package br.gov.siscomex.portalunico.remx.api;

import br.gov.siscomex.portalunico.remx.model.ConsultaDeLoteDaRFB;
import br.gov.siscomex.portalunico.remx.model.ConsultaDeLoteDosDepositrios;
import br.gov.siscomex.portalunico.remx.model.ConsultaDeLoteDosRgosAnuentes;
import br.gov.siscomex.portalunico.remx.model.ConsultaDeManifestosDosDepositrios;
import br.gov.siscomex.portalunico.remx.model.ConsultaDeManifestosDosRgosAnuentes;
import br.gov.siscomex.portalunico.remx.model.ConsultaDeRemessasDaRFB;
import br.gov.siscomex.portalunico.remx.model.ConsultaDeRemessasDosDepositrios;
import br.gov.siscomex.portalunico.remx.model.ConsultaDeRemessasDosRgosAnuentes;
import br.gov.siscomex.portalunico.remx.model.ConsultaPorNmeroDeLote;
import br.gov.siscomex.portalunico.remx.model.ConsultaPorNmeroDeManifesto;
import br.gov.siscomex.portalunico.remx.model.ConsultaPorNmeroDeRemessa;
import br.gov.siscomex.portalunico.remx.model.EnvioPedidoDeReviso;
import br.gov.siscomex.portalunico.remx.model.EnvioSolicitaoDeDarf;
import br.gov.siscomex.portalunico.remx.model.EnvioSolicitaoDeDevoluo;
import br.gov.siscomex.portalunico.remx.model.ManifestoDePresenaDeCarga;
import br.gov.siscomex.portalunico.remx.model.ProtocoloDeEnvioDeDocumento;
import br.gov.siscomex.portalunico.remx.model.RegistroERetificaoDeLoteDIR;
import br.gov.siscomex.portalunico.remx.model.RegistroERetificaoDeManifesto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * Remessas Internacionais - Recepção
 *
 * <p><h3>Introdução</h3><p>Bem-vindo à <i>Application Programming Interface (API)</i> do sistema Remessa.</p><p>O Siscomex Remessa é um sistema informatizado destinado ao controle das remessas internacionais porta a porta, transportadas por empresas de courier.</p><p>A informatização permitiu reduzir a burocracia, agilizar o fluxo de liberação das remessas e conferir maior segurança e melhor controle aduaneiro nas operações de comércio exterior efetuadas por meio de empresas de courier. E isto foi possível pelas características do sistema e do modelo de controle a ele associado, destacando-se:</p><ul><li>Eliminação de exigências burocráticas relativas à entrega de documentos impressos;</li><li>Transparência dos procedimentos aos intervenientes envolvidos no despacho aduaneiro;</li><li>Aprimoramento dos controles da RFB pela possibilidade de gestão de risco com base em informações eletrônicas, resultando em seleção mais ágil e eficiente;</li><li>Recebimento das informações eletrônicas antes da chegada da carga no país, permitindo antecipar o início dos trabalhos de fiscalização da RFB e demais órgãos fiscalizadores e reduzindo, em consequência, o tempo de passagem da carga em recinto aduaneiro;</li><li>Cooperação na melhoria da seleção de cargas para fiscalização por outros órgãos (Anvisa, VIGIAGRO), por meio de solução Single Window; e</li><li>Possibilidade de aperfeiçoamento da legislação, ampliação de mercado e eliminação de limites que dependiam da informatização do controle.</li></ul><p>As operações possíveis pela API do sistema são:</p><ul><li>O envio e validações de arquivo de Registro e Retificação de Manifesto de Carga no formato Json;</li><li>O envio e validações de arquivo de Registro e Retificação de Lote de DIR no formato Json;</li><li>O envio e validações de arquivo de Presença de Carga (PC) no formato Json;</li><li>O envio e validações de arquivo de Pedido de Revisão no formato Json;</li><li>O envio e validações de arquivo de Solicitação de Devolução no formato Json;</li><li>O envio e validações de arquivo de Consultas por Número de Remessa, Lote de DIR ou Número de Manifesto no formato Json;</li><li>A consulta aos resultados dos processamentos das funcionalidades através de um número de protocolo;</li><li>Recebimento de notificação PUSH com o resultado do término do processamento do arquivo, para os operadores cadastrados.</li></ul><h4>URLs de Acesso</h4><p>Para utilizar os servi&ccedil;os dispon&iacute;veis nessa API deve-se seguir o seguinte padr&atilde;o de URL:</p><p><i>https://{ambiente}/remessa/recepcao/api/ext/{servi&ccedil;o}</i></p><p>Onde, em {ambiente} deve-se informar o ambiente desejado dentro os ambientes dispon&iacute;veis na tabela abaixo e em {servi&ccedil;o} utilizar a URI do servi&ccedil;o desejado.</p>  <style type=\"text/css\">.tg  {border-collapse:collapse;border-color:#bbb;border-spacing:0;width: 900px;}.tg td{background-color:#E0FFEB;border-color:#bbb;border-style:solid;border-width:1px;color:#594F4F;font-family:Arial, sans-serif;font-size:14px;overflow:hidden;padding:10px 5px;word-break:normal;}.tg th{background-color:#9DE0AD;border-color:#bbb;border-style:solid;border-width:1px;color:#493F3F;font-family:Arial, sans-serif;font-size:14px;fon t-weight:normal;overflow:hidden;padding:10px 5px;word-break:normal;}.tg .tg-cabecalho{text-align:left;vertical-align:top}.tg .tg-corpo{border-color:inherit;text-align:left;vertical-align:top}</style><table class=\"tg\" style=\"width: 900px;\"><thead><tr><th class=\"tg-cabecalho\"><span style=\"font-weight:bold\">Nome do Ambiente</span></th><th class=\"tg-cabecalho\"><span style=\"font-weight:bold\">URL de acesso</span></th><th class=\"tg-cabecalho\"><span style=\"font-weight:bold\">P&uacute;blico alvo</span></th></tr></thead><tbody><tr><td class=\"tg-corpo\">Ambiente de Homologa&ccedil;&atilde;o</td><td class=\"tg-corpo\">hom.pucomex.serpro.gov.br    </td><td class=\"tg-corpo\">Intervenientes p&uacute;blicos (conforme perfil de acesso)</td><tr><td class=\"tg-corpo\">Ambiente de Produção</td><td class=\"tg-corpo\">portalunico.siscomex.gov.br    </td><td class=\"tg-corpo\">Todos os intervenientes (p&uacute;blicos e privados)</td></tr></tbody></table><h4>Restrições do sistema:</h4><p>Os limites do sistema são:</p><ul><li>6MB para o envio de registro e retificação de lote e registro e retificação de manifesto</li><li>1.100 remessas para API Presença de Carga e Solicitação de DARF</li><li>1.000 remessas para as demais APIs</li><li>ou até que o limite de 4MB do requestBody seja alcançado.</li><//ul>
 *
 */
@Path("/")
@Api(value = "/", description = "")
public interface ServicosDestinadosARecepcaoDeDocumentosApi {

    /**
     * Envio de Declaração de Lote de DIR
     *
     */
    @POST
    @Path("/api/ext/registro-lote-dir")
    @Consumes({"application/json"})
    @Produces({"*/*"})
    @ApiOperation(value = "Envio de Declaração de Lote de DIR", notes = "", tags = {"Servicos destinados a recepcao de documentos"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = ProtocoloDeEnvioDeDocumento.class),
            @ApiResponse(code = 400, message = "Requisição mal formatada"),
            @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
            @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
            @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
            @ApiResponse(code = 500, message = "Erro interno no servidor")})
    ProtocoloDeEnvioDeDocumento receberRegistroLoteDIRUsingPOST(@ApiParam(value = "JSON do envio de declaração de lote", required = true) @Valid RegistroERetificaoDeLoteDIR body, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token deve ser preenchido com o conteúdo do header Set-Token, retornado no response headers da chamada ao serviço de autenticação.", required = true) @HeaderParam("Authorization") Object authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF (Cross-Site Request Forgery). Este token deve ser preenchido com o conteúdo do header X-CSRF-Token, retornado no response headers da chamada ao serviço de autenticação.", required = true) @HeaderParam("X-CSRF-Token") Object xCSRFToken);

    /**
     * Envio de Registro de Manifesto
     *
     */
    @POST
    @Path("/api/ext/registro-manifesto-carga")
    @Consumes({"application/json"})
    @Produces({"*/*"})
    @ApiOperation(value = "Envio de Registro de Manifesto", notes = "", tags = {"Servicos destinados a recepcao de documentos"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = ProtocoloDeEnvioDeDocumento.class),
            @ApiResponse(code = 400, message = "Requisição mal formatada"),
            @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
            @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
            @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
            @ApiResponse(code = 500, message = "Erro interno no servidor")})
    ProtocoloDeEnvioDeDocumento receberRegistroManifestoUsingPOST(@ApiParam(value = "JSON do envio de Registro de manifesto", required = true) @Valid RegistroERetificaoDeManifesto body, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token deve ser preenchido com o conteúdo do header Set-Token, retornado no response headers da chamada ao serviço de autenticação.", required = true) @HeaderParam("Authorization") Object authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF (Cross-Site Request Forgery). Este token deve ser preenchido com o conteúdo do header X-CSRF-Token, retornado no response headers da chamada ao serviço de autenticação.", required = true) @HeaderParam("X-CSRF-Token") Object xCSRFToken);

    /**
     * Envio de Retificação de Lote de DIR
     *
     */
    @POST
    @Path("/api/ext/retificacao-lote-dir")
    @Consumes({"application/json"})
    @Produces({"*/*"})
    @ApiOperation(value = "Envio de Retificação de Lote de DIR", notes = "", tags = {"Servicos destinados a recepcao de documentos"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = ProtocoloDeEnvioDeDocumento.class),
            @ApiResponse(code = 400, message = "Requisição mal formatada"),
            @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
            @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
            @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
            @ApiResponse(code = 500, message = "Erro interno no servidor")})
    ProtocoloDeEnvioDeDocumento receberRetificacaoLoteDIRUsingPOST(@ApiParam(value = "JSON do envio de retificação de declaração", required = true) @Valid RegistroERetificaoDeLoteDIR body, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token deve ser preenchido com o conteúdo do header Set-Token, retornado no response headers da chamada ao serviço de autenticação.", required = true) @HeaderParam("Authorization") Object authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF (Cross-Site Request Forgery). Este token deve ser preenchido com o conteúdo do header X-CSRF-Token, retornado no response headers da chamada ao serviço de autenticação.", required = true) @HeaderParam("X-CSRF-Token") Object xCSRFToken);

    /**
     * Envio de Retificação de Manifesto
     *
     */
    @POST
    @Path("/api/ext/retificacao-manifesto-carga")
    @Consumes({"application/json"})
    @Produces({"*/*"})
    @ApiOperation(value = "Envio de Retificação de Manifesto", notes = "", tags = {"Servicos destinados a recepcao de documentos"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = ProtocoloDeEnvioDeDocumento.class),
            @ApiResponse(code = 400, message = "Requisição mal formatada"),
            @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
            @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
            @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
            @ApiResponse(code = 500, message = "Erro interno no servidor")})
    ProtocoloDeEnvioDeDocumento receberRetificacaoManifestoUsingPOST(@ApiParam(value = "JSON do envio de Retificação de manifesto", required = true) @Valid RegistroERetificaoDeManifesto body, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token deve ser preenchido com o conteúdo do header Set-Token, retornado no response headers da chamada ao serviço de autenticação.", required = true) @HeaderParam("Authorization") Object authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF (Cross-Site Request Forgery). Este token deve ser preenchido com o conteúdo do header X-CSRF-Token, retornado no response headers da chamada ao serviço de autenticação.", required = true) @HeaderParam("X-CSRF-Token") Object xCSRFToken);

    /**
     * Envio de Solicitação de Devolução
     *
     */
    @POST
    @Path("/api/ext/solicitacao-devolucao")
    @Consumes({"application/json"})
    @Produces({"*/*"})
    @ApiOperation(value = "Envio de Solicitação de Devolução", notes = "", tags = {"Servicos destinados a recepcao de documentos"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = ProtocoloDeEnvioDeDocumento.class),
            @ApiResponse(code = 400, message = "Requisição mal formatada"),
            @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
            @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
            @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
            @ApiResponse(code = 500, message = "Erro interno no servidor")})
    ProtocoloDeEnvioDeDocumento receberSolicitacaoDevolucaoUsingPOST(@ApiParam(value = "JSON do envio de solicitação de devolução", required = true) @Valid EnvioSolicitaoDeDevoluo body, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token deve ser preenchido com o conteúdo do header Set-Token, retornado no response headers da chamada ao serviço de autenticação.", required = true) @HeaderParam("Authorization") Object authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF (Cross-Site Request Forgery). Este token deve ser preenchido com o conteúdo do header X-CSRF-Token, retornado no response headers da chamada ao serviço de autenticação.", required = true) @HeaderParam("X-CSRF-Token") Object xCSRFToken);

    /**
     * Envio de Cancelamento de DARF
     *
     */
    @POST
    @Path("/api/ext/cancelamento-darf")
    @Consumes({"application/json"})
    @Produces({"*/*"})
    @ApiOperation(value = "Envio de Cancelamento de DARF", notes = "", tags = {"Servicos destinados a recepcao de documentos"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = ProtocoloDeEnvioDeDocumento.class),
            @ApiResponse(code = 400, message = "Requisição mal formatada"),
            @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
            @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
            @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
            @ApiResponse(code = 500, message = "Erro interno no servidor")})
    ProtocoloDeEnvioDeDocumento receberUsingPOST(@ApiParam(value = "JSON do envio de cancelamento de DARF", required = true) @Valid EnvioPedidoDeReviso body, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token deve ser preenchido com o conteúdo do header Set-Token, retornado no response headers da chamada ao serviço de autenticação.", required = true) @HeaderParam("Authorization") Object authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF (Cross-Site Request Forgery). Este token deve ser preenchido com o conteúdo do header X-CSRF-Token, retornado no response headers da chamada ao serviço de autenticação.", required = true) @HeaderParam("X-CSRF-Token") Object xCSRFToken);

    /**
     * Consulta por Número de Lote
     *
     */
    @POST
    @Path("/api/ext/consulta-lote")
    @Consumes({"application/json"})
    @Produces({"*/*"})
    @ApiOperation(value = "Consulta por Número de Lote", notes = "", tags = {"Servicos destinados a recepcao de documentos"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = ProtocoloDeEnvioDeDocumento.class),
            @ApiResponse(code = 400, message = "Requisição mal formatada"),
            @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
            @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
            @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
            @ApiResponse(code = 500, message = "Erro interno no servidor")})
    ProtocoloDeEnvioDeDocumento receberUsingPOST1(@ApiParam(value = "JSON do envio de consulta por número de lote", required = true) @Valid ConsultaPorNmeroDeLote body, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token deve ser preenchido com o conteúdo do header Set-Token, retornado no response headers da chamada ao serviço de autenticação.", required = true) @HeaderParam("Authorization") Object authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF (Cross-Site Request Forgery). Este token deve ser preenchido com o conteúdo do header X-CSRF-Token, retornado no response headers da chamada ao serviço de autenticação.", required = true) @HeaderParam("X-CSRF-Token") Object xCSRFToken);

    /**
     * Envio de Consulta de Remessas dos órgãos anuentes
     *
     */
    @POST
    @Path("/api/ext/consulta-remessas-anuente")
    @Consumes({"application/json"})
    @Produces({"*/*"})
    @ApiOperation(value = "Envio de Consulta de Remessas dos órgãos anuentes", notes = "", tags = {"Servicos destinados a recepcao de documentos"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = ProtocoloDeEnvioDeDocumento.class),
            @ApiResponse(code = 400, message = "Requisição mal formatada"),
            @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
            @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
            @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
            @ApiResponse(code = 500, message = "Erro interno no servidor")})
    ProtocoloDeEnvioDeDocumento receberUsingPOST10(@ApiParam(value = "JSON do envio de consulta de remessas dos órgãos anuentes", required = true) @Valid ConsultaDeRemessasDosRgosAnuentes body, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token deve ser preenchido com o conteúdo do header Set-Token, retornado no response headers da chamada ao serviço de autenticação.", required = true) @HeaderParam("Authorization") Object authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF (Cross-Site Request Forgery). Este token deve ser preenchido com o conteúdo do header X-CSRF-Token, retornado no response headers da chamada ao serviço de autenticação.", required = true) @HeaderParam("X-CSRF-Token") Object xCSRFToken);

    /**
     * Envio de Consulta de Remessas dos depositários
     *
     */
    @POST
    @Path("/api/ext/consulta-remessas-depositario")
    @Consumes({"application/json"})
    @Produces({"*/*"})
    @ApiOperation(value = "Envio de Consulta de Remessas dos depositários", notes = "", tags = {"Servicos destinados a recepcao de documentos"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = ProtocoloDeEnvioDeDocumento.class),
            @ApiResponse(code = 400, message = "Requisição mal formatada"),
            @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
            @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
            @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
            @ApiResponse(code = 500, message = "Erro interno no servidor")})
    ProtocoloDeEnvioDeDocumento receberUsingPOST11(@ApiParam(value = "JSON do envio de consulta de remessas dos depositários", required = true) @Valid ConsultaDeRemessasDosDepositrios body, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token deve ser preenchido com o conteúdo do header Set-Token, retornado no response headers da chamada ao serviço de autenticação.", required = true) @HeaderParam("Authorization") Object authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF (Cross-Site Request Forgery). Este token deve ser preenchido com o conteúdo do header X-CSRF-Token, retornado no response headers da chamada ao serviço de autenticação.", required = true) @HeaderParam("X-CSRF-Token") Object xCSRFToken);

    /**
     * Envio de Consulta de Remessas da RFB
     *
     */
    @POST
    @Path("/api/ext/consulta-remessas-rfb")
    @Consumes({"application/json"})
    @Produces({"*/*"})
    @ApiOperation(value = "Envio de Consulta de Remessas da RFB", notes = "", tags = {"Servicos destinados a recepcao de documentos"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = ProtocoloDeEnvioDeDocumento.class),
            @ApiResponse(code = 400, message = "Requisição mal formatada"),
            @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
            @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
            @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
            @ApiResponse(code = 500, message = "Erro interno no servidor")})
    ProtocoloDeEnvioDeDocumento receberUsingPOST12(@ApiParam(value = "JSON do envio de consulta de remessas da RFB", required = true) @Valid ConsultaDeRemessasDaRFB body, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token deve ser preenchido com o conteúdo do header Set-Token, retornado no response headers da chamada ao serviço de autenticação.", required = true) @HeaderParam("Authorization") Object authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF (Cross-Site Request Forgery). Este token deve ser preenchido com o conteúdo do header X-CSRF-Token, retornado no response headers da chamada ao serviço de autenticação.", required = true) @HeaderParam("X-CSRF-Token") Object xCSRFToken);

    /**
     * Envio de Manifesto de Presença de Carga
     *
     */
    @POST
    @Path("/api/ext/manifesto-presenca-carga")
    @Consumes({"application/json"})
    @Produces({"*/*"})
    @ApiOperation(value = "Envio de Manifesto de Presença de Carga", notes = "", tags = {"Servicos destinados a recepcao de documentos"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = ProtocoloDeEnvioDeDocumento.class),
            @ApiResponse(code = 400, message = "Requisição mal formatada"),
            @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
            @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
            @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
            @ApiResponse(code = 500, message = "Erro interno no servidor")})
    ProtocoloDeEnvioDeDocumento receberUsingPOST13(@ApiParam(value = "JSON do envio de manifesto de presenta de carga", required = true) @Valid ManifestoDePresenaDeCarga body, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token deve ser preenchido com o conteúdo do header Set-Token, retornado no response headers da chamada ao serviço de autenticação.", required = true) @HeaderParam("Authorization") Object authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF (Cross-Site Request Forgery). Este token deve ser preenchido com o conteúdo do header X-CSRF-Token, retornado no response headers da chamada ao serviço de autenticação.", required = true) @HeaderParam("X-CSRF-Token") Object xCSRFToken);

    /**
     * Envio de Pedido de Revisão
     *
     */
    @POST
    @Path("/api/ext/pedido-revisao")
    @Consumes({"application/json"})
    @Produces({"*/*"})
    @ApiOperation(value = "Envio de Pedido de Revisão", notes = "", tags = {"Servicos destinados a recepcao de documentos"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = ProtocoloDeEnvioDeDocumento.class),
            @ApiResponse(code = 400, message = "Requisição mal formatada"),
            @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
            @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
            @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
            @ApiResponse(code = 500, message = "Erro interno no servidor")})
    ProtocoloDeEnvioDeDocumento receberUsingPOST14(@ApiParam(value = "JSON do envio de pedido de revisão", required = true) @Valid EnvioPedidoDeReviso body, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token deve ser preenchido com o conteúdo do header Set-Token, retornado no response headers da chamada ao serviço de autenticação.", required = true) @HeaderParam("Authorization") Object authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF (Cross-Site Request Forgery). Este token deve ser preenchido com o conteúdo do header X-CSRF-Token, retornado no response headers da chamada ao serviço de autenticação.", required = true) @HeaderParam("X-CSRF-Token") Object xCSRFToken);

    /**
     * Envio de Solicitação de DARF
     *
     */
    @POST
    @Path("/api/ext/solicitacao-darf")
    @Consumes({"application/json"})
    @Produces({"*/*"})
    @ApiOperation(value = "Envio de Solicitação de DARF", notes = "", tags = {"Servicos destinados a recepcao de documentos"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = ProtocoloDeEnvioDeDocumento.class),
            @ApiResponse(code = 400, message = "Requisição mal formatada"),
            @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
            @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
            @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
            @ApiResponse(code = 500, message = "Erro interno no servidor")})
    ProtocoloDeEnvioDeDocumento receberUsingPOST15(@ApiParam(value = "JSON do envio de solicitação de DARF", required = true) @Valid EnvioSolicitaoDeDarf body, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token deve ser preenchido com o conteúdo do header Set-Token, retornado no response headers da chamada ao serviço de autenticação.", required = true) @HeaderParam("Authorization") Object authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF (Cross-Site Request Forgery). Este token deve ser preenchido com o conteúdo do header X-CSRF-Token, retornado no response headers da chamada ao serviço de autenticação.", required = true) @HeaderParam("X-CSRF-Token") Object xCSRFToken);

    /**
     * Envio de Consulta de lotes dos órgãos anuentes
     *
     */
    @POST
    @Path("/api/ext/consulta-lotes-anuente")
    @Consumes({"application/json"})
    @Produces({"*/*"})
    @ApiOperation(value = "Envio de Consulta de lotes dos órgãos anuentes", notes = "", tags = {"Servicos destinados a recepcao de documentos"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = ProtocoloDeEnvioDeDocumento.class),
            @ApiResponse(code = 400, message = "Requisição mal formatada"),
            @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
            @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
            @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
            @ApiResponse(code = 500, message = "Erro interno no servidor")})
    ProtocoloDeEnvioDeDocumento receberUsingPOST2(@ApiParam(value = "JSON do envio de consulta de lotes dos órgãos anuentes", required = true) @Valid ConsultaDeLoteDosRgosAnuentes body, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token deve ser preenchido com o conteúdo do header Set-Token, retornado no response headers da chamada ao serviço de autenticação.", required = true) @HeaderParam("Authorization") Object authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF (Cross-Site Request Forgery). Este token deve ser preenchido com o conteúdo do header X-CSRF-Token, retornado no response headers da chamada ao serviço de autenticação.", required = true) @HeaderParam("X-CSRF-Token") Object xCSRFToken);

    /**
     * Envio de Consulta de lotes dos depositários
     *
     */
    @POST
    @Path("/api/ext/consulta-lotes-depositario")
    @Consumes({"application/json"})
    @Produces({"*/*"})
    @ApiOperation(value = "Envio de Consulta de lotes dos depositários", notes = "", tags = {"Servicos destinados a recepcao de documentos"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = ProtocoloDeEnvioDeDocumento.class),
            @ApiResponse(code = 400, message = "Requisição mal formatada"),
            @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
            @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
            @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
            @ApiResponse(code = 500, message = "Erro interno no servidor")})
    ProtocoloDeEnvioDeDocumento receberUsingPOST3(@ApiParam(value = "JSON do envio de consulta de lotes dos depositários", required = true) @Valid ConsultaDeLoteDosDepositrios body, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token deve ser preenchido com o conteúdo do header Set-Token, retornado no response headers da chamada ao serviço de autenticação.", required = true) @HeaderParam("Authorization") Object authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF (Cross-Site Request Forgery). Este token deve ser preenchido com o conteúdo do header X-CSRF-Token, retornado no response headers da chamada ao serviço de autenticação.", required = true) @HeaderParam("X-CSRF-Token") Object xCSRFToken);

    /**
     * Envio de Consulta de lotes da RFB
     *
     */
    @POST
    @Path("/api/ext/consulta-lotes-rfb")
    @Consumes({"application/json"})
    @Produces({"*/*"})
    @ApiOperation(value = "Envio de Consulta de lotes da RFB", notes = "", tags = {"Servicos destinados a recepcao de documentos"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = ProtocoloDeEnvioDeDocumento.class),
            @ApiResponse(code = 400, message = "Requisição mal formatada"),
            @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
            @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
            @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
            @ApiResponse(code = 500, message = "Erro interno no servidor")})
    ProtocoloDeEnvioDeDocumento receberUsingPOST4(@ApiParam(value = "JSON do envio de consulta de lotes da RFB", required = true) @Valid ConsultaDeLoteDaRFB body, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token deve ser preenchido com o conteúdo do header Set-Token, retornado no response headers da chamada ao serviço de autenticação.", required = true) @HeaderParam("Authorization") Object authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF (Cross-Site Request Forgery). Este token deve ser preenchido com o conteúdo do header X-CSRF-Token, retornado no response headers da chamada ao serviço de autenticação.", required = true) @HeaderParam("X-CSRF-Token") Object xCSRFToken);

    /**
     * Consulta por Número de Manifesto
     *
     */
    @POST
    @Path("/api/ext/consulta-manifesto")
    @Consumes({"application/json"})
    @Produces({"*/*"})
    @ApiOperation(value = "Consulta por Número de Manifesto", notes = "", tags = {"Servicos destinados a recepcao de documentos"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = ProtocoloDeEnvioDeDocumento.class),
            @ApiResponse(code = 400, message = "Requisição mal formatada"),
            @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
            @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
            @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
            @ApiResponse(code = 500, message = "Erro interno no servidor")})
    ProtocoloDeEnvioDeDocumento receberUsingPOST5(@ApiParam(value = "JSON do envio de consulta por número de manifesto", required = true) @Valid ConsultaPorNmeroDeManifesto body, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token deve ser preenchido com o conteúdo do header Set-Token, retornado no response headers da chamada ao serviço de autenticação.", required = true) @HeaderParam("Authorization") Object authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF (Cross-Site Request Forgery). Este token deve ser preenchido com o conteúdo do header X-CSRF-Token, retornado no response headers da chamada ao serviço de autenticação.", required = true) @HeaderParam("X-CSRF-Token") Object xCSRFToken);

    /**
     * Envio de Consulta de Manifestos dos órgãos anuentes
     *
     */
    @POST
    @Path("/api/ext/consulta-manifestos-anuente")
    @Consumes({"application/json"})
    @Produces({"*/*"})
    @ApiOperation(value = "Envio de Consulta de Manifestos dos órgãos anuentes", notes = "", tags = {"Servicos destinados a recepcao de documentos"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = ProtocoloDeEnvioDeDocumento.class),
            @ApiResponse(code = 400, message = "Requisição mal formatada"),
            @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
            @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
            @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
            @ApiResponse(code = 500, message = "Erro interno no servidor")})
    ProtocoloDeEnvioDeDocumento receberUsingPOST6(@ApiParam(value = "JSON do envio de consulta de manifestos dos órgãos anuentes", required = true) @Valid ConsultaDeManifestosDosRgosAnuentes body, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token deve ser preenchido com o conteúdo do header Set-Token, retornado no response headers da chamada ao serviço de autenticação.", required = true) @HeaderParam("Authorization") Object authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF (Cross-Site Request Forgery). Este token deve ser preenchido com o conteúdo do header X-CSRF-Token, retornado no response headers da chamada ao serviço de autenticação.", required = true) @HeaderParam("X-CSRF-Token") Object xCSRFToken);

    /**
     * Envio de Consulta de Manifestos dos depositários
     *
     */
    @POST
    @Path("/api/ext/consulta-manifestos-depositario")
    @Consumes({"application/json"})
    @Produces({"*/*"})
    @ApiOperation(value = "Envio de Consulta de Manifestos dos depositários", notes = "", tags = {"Servicos destinados a recepcao de documentos"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = ProtocoloDeEnvioDeDocumento.class),
            @ApiResponse(code = 400, message = "Requisição mal formatada"),
            @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
            @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
            @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
            @ApiResponse(code = 500, message = "Erro interno no servidor")})
    ProtocoloDeEnvioDeDocumento receberUsingPOST7(@ApiParam(value = "JSON do envio de consulta de manifestos dos depositários", required = true) @Valid ConsultaDeManifestosDosDepositrios body, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token deve ser preenchido com o conteúdo do header Set-Token, retornado no response headers da chamada ao serviço de autenticação.", required = true) @HeaderParam("Authorization") Object authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF (Cross-Site Request Forgery). Este token deve ser preenchido com o conteúdo do header X-CSRF-Token, retornado no response headers da chamada ao serviço de autenticação.", required = true) @HeaderParam("X-CSRF-Token") Object xCSRFToken);

    /**
     * Envio de Consulta de Manifestos da RFB
     *
     */
    @POST
    @Path("/api/ext/consulta-manifestos-rfb")
    @Consumes({"application/json"})
    @Produces({"*/*"})
    @ApiOperation(value = "Envio de Consulta de Manifestos da RFB", notes = "", tags = {"Servicos destinados a recepcao de documentos"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = ProtocoloDeEnvioDeDocumento.class),
            @ApiResponse(code = 400, message = "Requisição mal formatada"),
            @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
            @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
            @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
            @ApiResponse(code = 500, message = "Erro interno no servidor")})
    ProtocoloDeEnvioDeDocumento receberUsingPOST8(@ApiParam(value = "JSON do envio de consulta de manifestos da RFB", required = true) @Valid ConsultaDeLoteDaRFB body, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token deve ser preenchido com o conteúdo do header Set-Token, retornado no response headers da chamada ao serviço de autenticação.", required = true) @HeaderParam("Authorization") Object authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF (Cross-Site Request Forgery). Este token deve ser preenchido com o conteúdo do header X-CSRF-Token, retornado no response headers da chamada ao serviço de autenticação.", required = true) @HeaderParam("X-CSRF-Token") Object xCSRFToken);

    /**
     * Consulta por Número de Remessa
     *
     */
    @POST
    @Path("/api/ext/consulta-remessa")
    @Consumes({"application/json"})
    @Produces({"*/*"})
    @ApiOperation(value = "Consulta por Número de Remessa", notes = "", tags = {"Servicos destinados a recepcao de documentos"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = ProtocoloDeEnvioDeDocumento.class),
            @ApiResponse(code = 400, message = "Requisição mal formatada"),
            @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
            @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
            @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
            @ApiResponse(code = 500, message = "Erro interno no servidor")})
    ProtocoloDeEnvioDeDocumento receberUsingPOST9(@ApiParam(value = "JSON do envio de consulta por número de remessa", required = true) @Valid ConsultaPorNmeroDeRemessa body, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token deve ser preenchido com o conteúdo do header Set-Token, retornado no response headers da chamada ao serviço de autenticação.", required = true) @HeaderParam("Authorization") Object authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF (Cross-Site Request Forgery). Este token deve ser preenchido com o conteúdo do header X-CSRF-Token, retornado no response headers da chamada ao serviço de autenticação.", required = true) @HeaderParam("X-CSRF-Token") Object xCSRFToken);
}

