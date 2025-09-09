package br.gov.siscomex.portalunico.remx.api;

import br.gov.siscomex.portalunico.remx.model.ProcessamentoDaSolicitaoDeDARF;
import br.gov.siscomex.portalunico.remx.model.ProcessamentoDaSolicitaoDeDevoluo;
import br.gov.siscomex.portalunico.remx.model.ProcessamentoDeConsulta;
import br.gov.siscomex.portalunico.remx.model.ProcessamentoDeConsultaDeLotesPelaRFB;
import br.gov.siscomex.portalunico.remx.model.ProcessamentoDeConsultaDeLotesPelosDepositrios;
import br.gov.siscomex.portalunico.remx.model.ProcessamentoDeConsultaDeLotesPelosRgosAnuentes;
import br.gov.siscomex.portalunico.remx.model.ProcessamentoDeConsultaDeManifestosPelosDepositrios;
import br.gov.siscomex.portalunico.remx.model.ProcessamentoDeConsultaDeRemessasPelaRFB;
import br.gov.siscomex.portalunico.remx.model.ProcessamentoDeConsultaDeRemessasPelosDepositrios;
import br.gov.siscomex.portalunico.remx.model.ProcessamentoDeConsultaDeRemessasPelosRgosAnuentes;
import br.gov.siscomex.portalunico.remx.model.ProcessamentoDeManifestoDePresenaDeCarga;
import br.gov.siscomex.portalunico.remx.model.ProcessamentoDoCancelamentoDeDARF;
import br.gov.siscomex.portalunico.remx.model.ProcessamentoDoPedidoDeReviso;
import br.gov.siscomex.portalunico.remx.model.ProcessamentoDoRegistroOuRetificaoDeLote;
import br.gov.siscomex.portalunico.remx.model.ProcessamentoDoRegistroOuRetificaoDoManifestoDeCarga;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

/**
 * Remessas Internacionais - Consulta
 *
 * <p><h3>Introdução</h3><p>Bem-vindo à <i>Application Programming Interface (API)</i> do sistema Remessa.</p><p>O Siscomex Remessa é um sistema informatizado destinado ao controle das remessas internacionais porta a porta, transportadas por empresas de courier.</p><p>A informatização permitiu reduzir a burocracia, agilizar o fluxo de liberação das remessas e conferir maior segurança e melhor controle aduaneiro nas operações de comércio exterior efetuadas por meio de empresas de courier. E isto foi possível pelas características do sistema e do modelo de controle a ele associado, destacando-se:</p><ul><li>Eliminação de exigências burocráticas relativas à entrega de documentos impressos;</li><li>Transparência dos procedimentos aos intervenientes envolvidos no despacho aduaneiro;</li><li>Aprimoramento dos controles da RFB pela possibilidade de gestão de risco com base em informações eletrônicas, resultando em seleção mais ágil e eficiente;</li><li>Recebimento das informações eletrônicas antes da chegada da carga no país, permitindo antecipar o início dos trabalhos de fiscalização da RFB e demais órgãos fiscalizadores e reduzindo, em consequência, o tempo de passagem da carga em recinto aduaneiro;</li><li>Cooperação na melhoria da seleção de cargas para fiscalização por outros órgãos (Anvisa, VIGIAGRO), por meio de solução Single Window; e</li><li>Possibilidade de aperfeiçoamento da legislação, ampliação de mercado e eliminação de limites que dependiam da informatização do controle.</li></ul><p>As operações possíveis pela API do sistema são:</p><ul><li>O envio e validações de arquivo de Registro e Retificação de Manifesto de Carga no formato Json;</li><li>O envio e validações de arquivo de Registro e Retificação de Lote de DIR no formato Json;</li><li>O envio e validações de arquivo de Presença de Carga (PC) no formato Json;</li><li>O envio e validações de arquivo de Pedido de Revisão no formato Json;</li><li>O envio e validações de arquivo de Solicitação de Devolução no formato Json;</li><li>O envio e validações de arquivo de Consultas por Número de Remessa, Lote de DIR ou Número de Manifesto no formato Json;</li><li>A consulta aos resultados dos processamentos das funcionalidades através de um número de protocolo;</li><li>Recebimento de notificação PUSH com o resultado do término do processamento do arquivo, para os operadores cadastrados.</li></ul><h4>URLs de Acesso</h4><p>Para utilizar os servi&ccedil;os dispon&iacute;veis nessa API deve-se seguir o seguinte padr&atilde;o de URL:</p><p><i>https://{ambiente}/remessa/consulta/api/ext/{servi&ccedil;o}</i></p><p>Onde, em {ambiente} deve-se informar o ambiente desejado dentro os ambientes dispon&iacute;veis na tabela abaixo e em {servi&ccedil;o} utilizar a URI do servi&ccedil;o desejado.</p>  <style type=\"text/css\">.tg  {border-collapse:collapse;border-color:#bbb;border-spacing:0;width: 900px;}.tg td{background-color:#E0FFEB;border-color:#bbb;border-style:solid;border-width:1px;color:#594F4F;font-family:Arial, sans-serif;font-size:14px;overflow:hidden;padding:10px 5px;word-break:normal;}.tg th{background-color:#9DE0AD;border-color:#bbb;border-style:solid;border-width:1px;color:#493F3F;font-family:Arial, sans-serif;font-size:14px;fon t-weight:normal;overflow:hidden;padding:10px 5px;word-break:normal;}.tg .tg-cabecalho{text-align:left;vertical-align:top}.tg .tg-corpo{border-color:inherit;text-align:left;vertical-align:top}</style><table class=\"tg\" style=\"width: 900px;\"><thead><tr><th class=\"tg-cabecalho\"><span style=\"font-weight:bold\">Nome do Ambiente</span></th><th class=\"tg-cabecalho\"><span style=\"font-weight:bold\">URL de acesso</span></th><th class=\"tg-cabecalho\"><span style=\"font-weight:bold\">P&uacute;blico alvo</span></th></tr></thead><tbody><tr><td class=\"tg-corpo\">Ambiente de Homologa&ccedil;&atilde;o</td><td class=\"tg-corpo\">hom.pucomex.serpro.gov.br    </td><td class=\"tg-corpo\">Intervenientes p&uacute;blicos (conforme perfil de acesso)</td><tr><td class=\"tg-corpo\">Ambiente de Produção</td><td class=\"tg-corpo\">portalunico.siscomex.gov.br    </td><td class=\"tg-corpo\">Todos os intervenientes (p&uacute;blicos e privados)</td></tr></tbody></table>
 *
 */
@Path("/")
@Api(value = "/", description = "")
public interface ServicosDestinadosAConsultasDeDocumentosApi {

    /**
     * Consulta de Cancelamento de DARF
     *
     */
    @GET
    @Path("/api/ext/cancelamento-darf/{numeroProtocolo}")
    @Produces({"*/*"})
    @ApiOperation(value = "Consulta de Cancelamento de DARF", notes = "", tags = {"Servicos destinados a consultas de documentos"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = ProcessamentoDoCancelamentoDeDARF.class),
            @ApiResponse(code = 400, message = "Requisição mal formatada"),
            @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
            @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
            @ApiResponse(code = 500, message = "Erro interno no servidor"),
            @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso")})
    ProcessamentoDoCancelamentoDeDARF consultarProtocoloCancelamentoDarfUsingGET(@ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token deve ser preenchido com o conteúdo do header Set-Token, retornado no response headers da chamada ao serviço de autenticação.", required = true) @HeaderParam("Authorization") Object authorization, @ApiParam(value = "Número de protocolo recebido no retorno da consulta do cancelamento de DARF", required = true) @PathParam("numeroProtocolo") String numeroProtocolo, @ApiParam(value = "Token de prevenção contra ataques CSRF (Cross-Site Request Forgery). Este token deve ser preenchido com o conteúdo do header X-CSRF-Token, retornado no response headers da chamada ao serviço de autenticação.", required = true) @HeaderParam("X-CSRF-Token") Object xCSRFToken);

    /**
     * Consulta de Lotes pelos Órgãos Anuentes
     *
     */
    @GET
    @Path("/api/ext/consulta-lotes-anuente/{numeroProtocolo}")
    @Produces({"*/*"})
    @ApiOperation(value = "Consulta de Lotes pelos Órgãos Anuentes", notes = "", tags = {"Servicos destinados a consultas de documentos"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = ProcessamentoDeConsultaDeLotesPelosRgosAnuentes.class),
            @ApiResponse(code = 400, message = "Requisição mal formatada"),
            @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
            @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
            @ApiResponse(code = 500, message = "Erro interno no servidor"),
            @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso")})
    ProcessamentoDeConsultaDeLotesPelosRgosAnuentes consultarProtocoloConsultaLotesAnuenteUsingGET(@ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token deve ser preenchido com o conteúdo do header Set-Token, retornado no response headers da chamada ao serviço de autenticação.", required = true) @HeaderParam("Authorization") Object authorization, @ApiParam(value = "Número de protocolo recebido no retorno da consulta de lotes pelos Órgãos Anuentes", required = true) @PathParam("numeroProtocolo") String numeroProtocolo, @ApiParam(value = "Token de prevenção contra ataques CSRF (Cross-Site Request Forgery). Este token deve ser preenchido com o conteúdo do header X-CSRF-Token, retornado no response headers da chamada ao serviço de autenticação.", required = true) @HeaderParam("X-CSRF-Token") Object xCSRFToken);

    /**
     * Consulta de Lotes pelos Depositários
     *
     */
    @GET
    @Path("/api/ext/consulta-lotes-depositario/{numeroProtocolo}")
    @Produces({"*/*"})
    @ApiOperation(value = "Consulta de Lotes pelos Depositários", notes = "", tags = {"Servicos destinados a consultas de documentos"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = ProcessamentoDeConsultaDeLotesPelosDepositrios.class),
            @ApiResponse(code = 400, message = "Requisição mal formatada"),
            @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
            @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
            @ApiResponse(code = 500, message = "Erro interno no servidor"),
            @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso")})
    ProcessamentoDeConsultaDeLotesPelosDepositrios consultarProtocoloConsultaLotesDepositarioUsingGET(@ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token deve ser preenchido com o conteúdo do header Set-Token, retornado no response headers da chamada ao serviço de autenticação.", required = true) @HeaderParam("Authorization") Object authorization, @ApiParam(value = "Número de protocolo recebido no retorno da consulta de lotes pelos Depositários", required = true) @PathParam("numeroProtocolo") String numeroProtocolo, @ApiParam(value = "Token de prevenção contra ataques CSRF (Cross-Site Request Forgery). Este token deve ser preenchido com o conteúdo do header X-CSRF-Token, retornado no response headers da chamada ao serviço de autenticação.", required = true) @HeaderParam("X-CSRF-Token") Object xCSRFToken);

    /**
     * Consulta de Lotes pela RFB
     *
     */
    @GET
    @Path("/api/ext/consulta-lotes-rfb/{numeroProtocolo}")
    @Produces({"*/*"})
    @ApiOperation(value = "Consulta de Lotes pela RFB", notes = "", tags = {"Servicos destinados a consultas de documentos"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = ProcessamentoDeConsultaDeLotesPelaRFB.class),
            @ApiResponse(code = 400, message = "Requisição mal formatada"),
            @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
            @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
            @ApiResponse(code = 500, message = "Erro interno no servidor"),
            @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso")})
    ProcessamentoDeConsultaDeLotesPelaRFB consultarProtocoloConsultaLotesRFBUsingGET(@ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token deve ser preenchido com o conteúdo do header Set-Token, retornado no response headers da chamada ao serviço de autenticação.", required = true) @HeaderParam("Authorization") Object authorization, @ApiParam(value = "Número de protocolo recebido no retorno da consulta de lotes da RFB", required = true) @PathParam("numeroProtocolo") String numeroProtocolo, @ApiParam(value = "Token de prevenção contra ataques CSRF (Cross-Site Request Forgery). Este token deve ser preenchido com o conteúdo do header X-CSRF-Token, retornado no response headers da chamada ao serviço de autenticação.", required = true) @HeaderParam("X-CSRF-Token") Object xCSRFToken);

    /**
     * Consulta de Lotes pelos Órgãos Anuentes
     *
     */
    @GET
    @Path("/api/ext/consulta-manifestos-anuente/{numeroProtocolo}")
    @Produces({"*/*"})
    @ApiOperation(value = "Consulta de Lotes pelos Órgãos Anuentes", notes = "", tags = {"Servicos destinados a consultas de documentos"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = ProcessamentoDeConsultaDeLotesPelosRgosAnuentes.class),
            @ApiResponse(code = 400, message = "Requisição mal formatada"),
            @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
            @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
            @ApiResponse(code = 500, message = "Erro interno no servidor"),
            @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso")})
    ProcessamentoDeConsultaDeLotesPelosRgosAnuentes consultarProtocoloConsultaManifestosAnuenteUsingGET(@ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token deve ser preenchido com o conteúdo do header Set-Token, retornado no response headers da chamada ao serviço de autenticação.", required = true) @HeaderParam("Authorization") Object authorization, @ApiParam(value = "Número de protocolo recebido no retorno da consulta de manifestos pelos Órgãos Anuentes", required = true) @PathParam("numeroProtocolo") String numeroProtocolo, @ApiParam(value = "Token de prevenção contra ataques CSRF (Cross-Site Request Forgery). Este token deve ser preenchido com o conteúdo do header X-CSRF-Token, retornado no response headers da chamada ao serviço de autenticação.", required = true) @HeaderParam("X-CSRF-Token") Object xCSRFToken);

    /**
     * Consulta de Manifestos pelos Depositários
     *
     */
    @GET
    @Path("/api/ext/consulta-manifestos-depositario/{numeroProtocolo}")
    @Produces({"*/*"})
    @ApiOperation(value = "Consulta de Manifestos pelos Depositários", notes = "", tags = {"Servicos destinados a consultas de documentos"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = ProcessamentoDeConsultaDeManifestosPelosDepositrios.class),
            @ApiResponse(code = 400, message = "Requisição mal formatada"),
            @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
            @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
            @ApiResponse(code = 500, message = "Erro interno no servidor"),
            @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso")})
    ProcessamentoDeConsultaDeManifestosPelosDepositrios consultarProtocoloConsultaManifestosDepositarioUsingGET(@ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token deve ser preenchido com o conteúdo do header Set-Token, retornado no response headers da chamada ao serviço de autenticação.", required = true) @HeaderParam("Authorization") Object authorization, @ApiParam(value = "Número de protocolo recebido no retorno da consulta de manifestos pelos Depositários", required = true) @PathParam("numeroProtocolo") String numeroProtocolo, @ApiParam(value = "Token de prevenção contra ataques CSRF (Cross-Site Request Forgery). Este token deve ser preenchido com o conteúdo do header X-CSRF-Token, retornado no response headers da chamada ao serviço de autenticação.", required = true) @HeaderParam("X-CSRF-Token") Object xCSRFToken);

    /**
     * Consulta de Manifestos pela RFB
     *
     */
    @GET
    @Path("/api/ext/consulta-manifestos-rfb/{numeroProtocolo}")
    @Produces({"*/*"})
    @ApiOperation(value = "Consulta de Manifestos pela RFB", notes = "", tags = {"Servicos destinados a consultas de documentos"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = ProcessamentoDeConsultaDeLotesPelaRFB.class),
            @ApiResponse(code = 400, message = "Requisição mal formatada"),
            @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
            @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
            @ApiResponse(code = 500, message = "Erro interno no servidor"),
            @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso")})
    ProcessamentoDeConsultaDeLotesPelaRFB consultarProtocoloConsultaManifestosRFBUsingGET(@ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token deve ser preenchido com o conteúdo do header Set-Token, retornado no response headers da chamada ao serviço de autenticação.", required = true) @HeaderParam("Authorization") Object authorization, @ApiParam(value = "Número de protocolo recebido no retorno da consulta de manifestos da RFB", required = true) @PathParam("numeroProtocolo") String numeroProtocolo, @ApiParam(value = "Token de prevenção contra ataques CSRF (Cross-Site Request Forgery). Este token deve ser preenchido com o conteúdo do header X-CSRF-Token, retornado no response headers da chamada ao serviço de autenticação.", required = true) @HeaderParam("X-CSRF-Token") Object xCSRFToken);

    /**
     * Consulta de Remessas pelos Órgãos Anuentes
     *
     */
    @GET
    @Path("/api/ext/consulta-remessas-anuente/{numeroProtocolo}")
    @Produces({"*/*"})
    @ApiOperation(value = "Consulta de Remessas pelos Órgãos Anuentes", notes = "", tags = {"Servicos destinados a consultas de documentos"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = ProcessamentoDeConsultaDeRemessasPelosRgosAnuentes.class),
            @ApiResponse(code = 400, message = "Requisição mal formatada"),
            @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
            @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
            @ApiResponse(code = 500, message = "Erro interno no servidor"),
            @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso")})
    ProcessamentoDeConsultaDeRemessasPelosRgosAnuentes consultarProtocoloConsultaRemessasAnuenteUsingGET(@ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token deve ser preenchido com o conteúdo do header Set-Token, retornado no response headers da chamada ao serviço de autenticação.", required = true) @HeaderParam("Authorization") Object authorization, @ApiParam(value = "Número de protocolo recebido no retorno da consulta de remessas pelos Órgãos Anuentes", required = true) @PathParam("numeroProtocolo") String numeroProtocolo, @ApiParam(value = "Token de prevenção contra ataques CSRF (Cross-Site Request Forgery). Este token deve ser preenchido com o conteúdo do header X-CSRF-Token, retornado no response headers da chamada ao serviço de autenticação.", required = true) @HeaderParam("X-CSRF-Token") Object xCSRFToken);

    /**
     * Consulta de Remessas pelos Depositários
     *
     */
    @GET
    @Path("/api/ext/consulta-remessas-depositario/{numeroProtocolo}")
    @Produces({"*/*"})
    @ApiOperation(value = "Consulta de Remessas pelos Depositários", notes = "", tags = {"Servicos destinados a consultas de documentos"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = ProcessamentoDeConsultaDeRemessasPelosDepositrios.class),
            @ApiResponse(code = 400, message = "Requisição mal formatada"),
            @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
            @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
            @ApiResponse(code = 500, message = "Erro interno no servidor"),
            @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso")})
    ProcessamentoDeConsultaDeRemessasPelosDepositrios consultarProtocoloConsultaRemessasDepositarioUsingGET(@ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token deve ser preenchido com o conteúdo do header Set-Token, retornado no response headers da chamada ao serviço de autenticação.", required = true) @HeaderParam("Authorization") Object authorization, @ApiParam(value = "Número de protocolo recebido no retorno da consulta de remessas pelos Depositários", required = true) @PathParam("numeroProtocolo") String numeroProtocolo, @ApiParam(value = "Token de prevenção contra ataques CSRF (Cross-Site Request Forgery). Este token deve ser preenchido com o conteúdo do header X-CSRF-Token, retornado no response headers da chamada ao serviço de autenticação.", required = true) @HeaderParam("X-CSRF-Token") Object xCSRFToken);

    /**
     * Consulta de Remessas pela RFB
     *
     */
    @GET
    @Path("/api/ext/consulta-remessas-rfb/{numeroProtocolo}")
    @Produces({"*/*"})
    @ApiOperation(value = "Consulta de Remessas pela RFB", notes = "", tags = {"Servicos destinados a consultas de documentos"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = ProcessamentoDeConsultaDeRemessasPelaRFB.class),
            @ApiResponse(code = 400, message = "Requisição mal formatada"),
            @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
            @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
            @ApiResponse(code = 500, message = "Erro interno no servidor"),
            @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso")})
    ProcessamentoDeConsultaDeRemessasPelaRFB consultarProtocoloConsultaRemessasRFBUsingGET(@ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token deve ser preenchido com o conteúdo do header Set-Token, retornado no response headers da chamada ao serviço de autenticação.", required = true) @HeaderParam("Authorization") Object authorization, @ApiParam(value = "Número de protocolo recebido no retorno da consulta de remessas da RFB", required = true) @PathParam("numeroProtocolo") String numeroProtocolo, @ApiParam(value = "Token de prevenção contra ataques CSRF (Cross-Site Request Forgery). Este token deve ser preenchido com o conteúdo do header X-CSRF-Token, retornado no response headers da chamada ao serviço de autenticação.", required = true) @HeaderParam("X-CSRF-Token") Object xCSRFToken);

    /**
     * Consulta por Número de Lote
     *
     */
    @GET
    @Path("/api/ext/consulta-lote/{numeroProtocolo}")
    @Produces({"*/*"})
    @ApiOperation(value = "Consulta por Número de Lote", notes = "", tags = {"Servicos destinados a consultas de documentos"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = ProcessamentoDeConsulta.class),
            @ApiResponse(code = 400, message = "Requisição mal formatada"),
            @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
            @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
            @ApiResponse(code = 500, message = "Erro interno no servidor"),
            @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso")})
    ProcessamentoDeConsulta consultarProtocoloLoteUsingGET(@ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token deve ser preenchido com o conteúdo do header Set-Token, retornado no response headers da chamada ao serviço de autenticação.", required = true) @HeaderParam("Authorization") Object authorization, @ApiParam(value = "Número de protocolo recebido no retorno da consulta por número de lote", required = true) @PathParam("numeroProtocolo") String numeroProtocolo, @ApiParam(value = "Token de prevenção contra ataques CSRF (Cross-Site Request Forgery). Este token deve ser preenchido com o conteúdo do header X-CSRF-Token, retornado no response headers da chamada ao serviço de autenticação.", required = true) @HeaderParam("X-CSRF-Token") Object xCSRFToken);

    /**
     * Consulta de Manifesto de Presença de Carga
     *
     */
    @GET
    @Path("/api/ext/manifesto-presenca-carga/{numeroProtocolo}")
    @Produces({"*/*"})
    @ApiOperation(value = "Consulta de Manifesto de Presença de Carga", notes = "", tags = {"Servicos destinados a consultas de documentos"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = ProcessamentoDeManifestoDePresenaDeCarga.class),
            @ApiResponse(code = 400, message = "Requisição mal formatada"),
            @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
            @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
            @ApiResponse(code = 500, message = "Erro interno no servidor"),
            @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso")})
    ProcessamentoDeManifestoDePresenaDeCarga consultarProtocoloManifestoCargaUsingGET(@ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token deve ser preenchido com o conteúdo do header Set-Token, retornado no response headers da chamada ao serviço de autenticação.", required = true) @HeaderParam("Authorization") Object authorization, @ApiParam(value = "Número de protocolo recebido no retorno do envio de manifesto de presenta de carga", required = true) @PathParam("numeroProtocolo") String numeroProtocolo, @ApiParam(value = "Token de prevenção contra ataques CSRF (Cross-Site Request Forgery). Este token deve ser preenchido com o conteúdo do header X-CSRF-Token, retornado no response headers da chamada ao serviço de autenticação.", required = true) @HeaderParam("X-CSRF-Token") Object xCSRFToken);

    /**
     * Consulta por Número de Manifesto
     *
     */
    @GET
    @Path("/api/ext/consulta-manifesto/{numeroProtocolo}")
    @Produces({"*/*"})
    @ApiOperation(value = "Consulta por Número de Manifesto", notes = "", tags = {"Servicos destinados a consultas de documentos"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = ProcessamentoDeConsulta.class),
            @ApiResponse(code = 400, message = "Requisição mal formatada"),
            @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
            @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
            @ApiResponse(code = 500, message = "Erro interno no servidor"),
            @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso")})
    ProcessamentoDeConsulta consultarProtocoloManifestoUsingGET(@ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token deve ser preenchido com o conteúdo do header Set-Token, retornado no response headers da chamada ao serviço de autenticação.", required = true) @HeaderParam("Authorization") Object authorization, @ApiParam(value = "Número de protocolo recebido no retorno da consulta por número de manifesto", required = true) @PathParam("numeroProtocolo") String numeroProtocolo, @ApiParam(value = "Token de prevenção contra ataques CSRF (Cross-Site Request Forgery). Este token deve ser preenchido com o conteúdo do header X-CSRF-Token, retornado no response headers da chamada ao serviço de autenticação.", required = true) @HeaderParam("X-CSRF-Token") Object xCSRFToken);

    /**
     * Consulta de Pedido de Revisão
     *
     */
    @GET
    @Path("/api/ext/pedido-revisao/{numeroProtocolo}")
    @Produces({"*/*"})
    @ApiOperation(value = "Consulta de Pedido de Revisão", notes = "", tags = {"Servicos destinados a consultas de documentos"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = ProcessamentoDoPedidoDeReviso.class),
            @ApiResponse(code = 400, message = "Requisição mal formatada"),
            @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
            @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
            @ApiResponse(code = 500, message = "Erro interno no servidor"),
            @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso")})
    ProcessamentoDoPedidoDeReviso consultarProtocoloPedidoRevisaoUsingGET(@ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token deve ser preenchido com o conteúdo do header Set-Token, retornado no response headers da chamada ao serviço de autenticação.", required = true) @HeaderParam("Authorization") Object authorization, @ApiParam(value = "Número de protocolo recebido no retorno do pedido de revisão", required = true) @PathParam("numeroProtocolo") String numeroProtocolo, @ApiParam(value = "Token de prevenção contra ataques CSRF (Cross-Site Request Forgery). Este token deve ser preenchido com o conteúdo do header X-CSRF-Token, retornado no response headers da chamada ao serviço de autenticação.", required = true) @HeaderParam("X-CSRF-Token") Object xCSRFToken);

    /**
     * Consulta de Registro de Manifesto de Carga
     *
     */
    @GET
    @Path("/api/ext/registro-manifesto-carga/{numeroProtocolo}")
    @Produces({"*/*"})
    @ApiOperation(value = "Consulta de Registro de Manifesto de Carga", notes = "", tags = {"Servicos destinados a consultas de documentos"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = ProcessamentoDoRegistroOuRetificaoDoManifestoDeCarga.class),
            @ApiResponse(code = 400, message = "Requisição mal formatada"),
            @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
            @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
            @ApiResponse(code = 500, message = "Erro interno no servidor"),
            @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso")})
    ProcessamentoDoRegistroOuRetificaoDoManifestoDeCarga consultarProtocoloRegManifCargaUsingGET(@ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token deve ser preenchido com o conteúdo do header Set-Token, retornado no response headers da chamada ao serviço de autenticação.", required = true) @HeaderParam("Authorization") Object authorization, @ApiParam(value = "Número de protocolo recebido no retorno da consulta de registro de manifesto de carga", required = true) @PathParam("numeroProtocolo") String numeroProtocolo, @ApiParam(value = "Token de prevenção contra ataques CSRF (Cross-Site Request Forgery). Este token deve ser preenchido com o conteúdo do header X-CSRF-Token, retornado no response headers da chamada ao serviço de autenticação.", required = true) @HeaderParam("X-CSRF-Token") Object xCSRFToken);

    /**
     * Consulta de Registro de Lote
     *
     */
    @GET
    @Path("/api/ext/registro-lote-dir/{numeroProtocolo}")
    @Produces({"*/*"})
    @ApiOperation(value = "Consulta de Registro de Lote", notes = "", tags = {"Servicos destinados a consultas de documentos"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = ProcessamentoDoRegistroOuRetificaoDeLote.class),
            @ApiResponse(code = 400, message = "Requisição mal formatada"),
            @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
            @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
            @ApiResponse(code = 500, message = "Erro interno no servidor"),
            @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso")})
    ProcessamentoDoRegistroOuRetificaoDeLote consultarProtocoloRegistoLoteUsingGET(@ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token deve ser preenchido com o conteúdo do header Set-Token, retornado no response headers da chamada ao serviço de autenticação.", required = true) @HeaderParam("Authorization") Object authorization, @ApiParam(value = "Número de protocolo recebido no retorno do registro de lote", required = true) @PathParam("numeroProtocolo") String numeroProtocolo, @ApiParam(value = "Token de prevenção contra ataques CSRF (Cross-Site Request Forgery). Este token deve ser preenchido com o conteúdo do header X-CSRF-Token, retornado no response headers da chamada ao serviço de autenticação.", required = true) @HeaderParam("X-CSRF-Token") Object xCSRFToken);

    /**
     * Consulta por Número de Remessa
     *
     */
    @GET
    @Path("/api/ext/consulta-remessa/{numeroProtocolo}")
    @Produces({"*/*"})
    @ApiOperation(value = "Consulta por Número de Remessa", notes = "", tags = {"Servicos destinados a consultas de documentos"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = ProcessamentoDeConsulta.class),
            @ApiResponse(code = 400, message = "Requisição mal formatada"),
            @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
            @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
            @ApiResponse(code = 500, message = "Erro interno no servidor"),
            @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso")})
    ProcessamentoDeConsulta consultarProtocoloRemessaUsingGET(@ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token deve ser preenchido com o conteúdo do header Set-Token, retornado no response headers da chamada ao serviço de autenticação.", required = true) @HeaderParam("Authorization") Object authorization, @ApiParam(value = "Número de protocolo recebido no retorno da consulta por número de remessa", required = true) @PathParam("numeroProtocolo") String numeroProtocolo, @ApiParam(value = "Token de prevenção contra ataques CSRF (Cross-Site Request Forgery). Este token deve ser preenchido com o conteúdo do header X-CSRF-Token, retornado no response headers da chamada ao serviço de autenticação.", required = true) @HeaderParam("X-CSRF-Token") Object xCSRFToken);

    /**
     * Consulta de Retificação de Manifesto de Carga
     *
     */
    @GET
    @Path("/api/ext/retificacao-manifesto-carga/{numeroProtocolo}")
    @Produces({"*/*"})
    @ApiOperation(value = "Consulta de Retificação de Manifesto de Carga", notes = "", tags = {"Servicos destinados a consultas de documentos"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = ProcessamentoDoRegistroOuRetificaoDoManifestoDeCarga.class),
            @ApiResponse(code = 400, message = "Requisição mal formatada"),
            @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
            @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
            @ApiResponse(code = 500, message = "Erro interno no servidor"),
            @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso")})
    ProcessamentoDoRegistroOuRetificaoDoManifestoDeCarga consultarProtocoloRetManifCargaUsingGET(@ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token deve ser preenchido com o conteúdo do header Set-Token, retornado no response headers da chamada ao serviço de autenticação.", required = true) @HeaderParam("Authorization") Object authorization, @ApiParam(value = "Número de protocolo recebido no retorno da consulta de retificação de manifesto de carga", required = true) @PathParam("numeroProtocolo") String numeroProtocolo, @ApiParam(value = "Token de prevenção contra ataques CSRF (Cross-Site Request Forgery). Este token deve ser preenchido com o conteúdo do header X-CSRF-Token, retornado no response headers da chamada ao serviço de autenticação.", required = true) @HeaderParam("X-CSRF-Token") Object xCSRFToken);

    /**
     * Consulta de Retificação de Lote
     *
     */
    @GET
    @Path("/api/ext/retificacao-lote-dir/{numeroProtocolo}")
    @Produces({"*/*"})
    @ApiOperation(value = "Consulta de Retificação de Lote", notes = "", tags = {"Servicos destinados a consultas de documentos"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = ProcessamentoDoRegistroOuRetificaoDeLote.class),
            @ApiResponse(code = 400, message = "Requisição mal formatada"),
            @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
            @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
            @ApiResponse(code = 500, message = "Erro interno no servidor"),
            @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso")})
    ProcessamentoDoRegistroOuRetificaoDeLote consultarProtocoloRetificacaoLoteUsingGET(@ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token deve ser preenchido com o conteúdo do header Set-Token, retornado no response headers da chamada ao serviço de autenticação.", required = true) @HeaderParam("Authorization") Object authorization, @ApiParam(value = "Número de protocolo recebido no retorno da retificação de lote", required = true) @PathParam("numeroProtocolo") String numeroProtocolo, @ApiParam(value = "Token de prevenção contra ataques CSRF (Cross-Site Request Forgery). Este token deve ser preenchido com o conteúdo do header X-CSRF-Token, retornado no response headers da chamada ao serviço de autenticação.", required = true) @HeaderParam("X-CSRF-Token") Object xCSRFToken);

    /**
     * Consulta de Solicitação de DARF
     *
     */
    @GET
    @Path("/api/ext/solicitacao-darf/{numeroProtocolo}")
    @Produces({"*/*"})
    @ApiOperation(value = "Consulta de Solicitação de DARF", notes = "", tags = {"Servicos destinados a consultas de documentos"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = ProcessamentoDaSolicitaoDeDARF.class),
            @ApiResponse(code = 400, message = "Requisição mal formatada"),
            @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
            @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
            @ApiResponse(code = 500, message = "Erro interno no servidor"),
            @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso")})
    ProcessamentoDaSolicitaoDeDARF consultarProtocoloSolicitacaoDarfUsingGET(@ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token deve ser preenchido com o conteúdo do header Set-Token, retornado no response headers da chamada ao serviço de autenticação.", required = true) @HeaderParam("Authorization") Object authorization, @ApiParam(value = "Número de protocolo recebido no retorno da consulta da solicitação de DARF", required = true) @PathParam("numeroProtocolo") String numeroProtocolo, @ApiParam(value = "Token de prevenção contra ataques CSRF (Cross-Site Request Forgery). Este token deve ser preenchido com o conteúdo do header X-CSRF-Token, retornado no response headers da chamada ao serviço de autenticação.", required = true) @HeaderParam("X-CSRF-Token") Object xCSRFToken);

    /**
     * Consulta de Solicitação de Devolução
     *
     */
    @GET
    @Path("/api/ext/solicitacao-devolucao/{numeroProtocolo}")
    @Produces({"*/*"})
    @ApiOperation(value = "Consulta de Solicitação de Devolução", notes = "", tags = {"Servicos destinados a consultas de documentos"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = ProcessamentoDaSolicitaoDeDevoluo.class),
            @ApiResponse(code = 400, message = "Requisição mal formatada"),
            @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
            @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
            @ApiResponse(code = 500, message = "Erro interno no servidor"),
            @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso")})
    ProcessamentoDaSolicitaoDeDevoluo consultarProtocoloSolicitacaoDevolucaoUsingGET(@ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token deve ser preenchido com o conteúdo do header Set-Token, retornado no response headers da chamada ao serviço de autenticação.", required = true) @HeaderParam("Authorization") Object authorization, @ApiParam(value = "Número de protocolo recebido no retorno da consulta de solicitação de devolução", required = true) @PathParam("numeroProtocolo") String numeroProtocolo, @ApiParam(value = "Token de prevenção contra ataques CSRF (Cross-Site Request Forgery). Este token deve ser preenchido com o conteúdo do header X-CSRF-Token, retornado no response headers da chamada ao serviço de autenticação.", required = true) @HeaderParam("X-CSRF-Token") Object xCSRFToken);
}

