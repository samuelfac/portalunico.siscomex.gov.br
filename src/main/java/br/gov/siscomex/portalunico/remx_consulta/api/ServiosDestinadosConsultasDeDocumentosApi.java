package br.gov.siscomex.portalunico.remx_consulta.api;

import br.gov.siscomex.portalunico.remx_consulta.model.ProcessamentoDeManifestoDePresenaDeCarga;
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
import javax.ws.rs.core.Response;

/**
 * Remessas Internacionais - Consulta
 *
 * <p><h3>Introdução</h3><p>Bem-vindo à <i>Application Programming Interface (API)</i> do sistema Remessa.</p><p>O Siscomex Remessa é um sistema informatizado destinado ao controle das remessas internacionais porta a porta, transportadas por empresas de courier.</p><p>A informatização permitiu reduzir a burocracia, agilizar o fluxo de liberação das remessas e conferir maior segurança e melhor controle aduaneiro nas operações de comércio exterior efetuadas por meio de empresas de courier. E isto foi possível pelas características do sistema e do modelo de controle a ele associado, destacando-se:</p><ul><li>Eliminação de exigências burocráticas relativas à entrega de documentos impressos;</li><li>Transparência dos procedimentos aos intervenientes envolvidos no despacho aduaneiro;</li><li>Aprimoramento dos controles da RFB pela possibilidade de gestão de risco com base em informações eletrônicas, resultando em seleção mais ágil e eficiente;</li><li>Recebimento das informações eletrônicas antes da chegada da carga no país, permitindo antecipar o início dos trabalhos de fiscalização da RFB e demais órgãos fiscalizadores e reduzindo, em consequência, o tempo de passagem da carga em recinto aduaneiro;</li><li>Cooperação na melhoria da seleção de cargas para fiscalização por outros órgãos (Anvisa, VIGIAGRO), por meio de solução Single Window; e</li><li>Possibilidade de aperfeiçoamento da legislação, ampliação de mercado e eliminação de limites que dependiam da informatização do controle.</li></ul><p>As operações possíveis pela API do sistema são:</p><ul><li>O envio e validações de arquivo de Presença de Carga (PC) no formato Json;</li><li>A consulta ao resultado do processamento do arquivo de PC através de um número de protocolo;</li><li>Recebimento de notificação PUSH com o resultado do término do processamento do arquivo, para os operadores cadastrados.</li></ul><h4>URLs de Acesso</h4><p>Para utilizar os servi&ccedil;os dispon&iacute;veis nessa API deve-se usar as seguintes de URLs:</p><style type=\"text/css\">.tg  {border-collapse:collapse;border-color:#bbb;border-spacing:0;width: 900px;}.tg td{background-color:#E0FFEB;border-color:#bbb;border-style:solid;border-width:1px;color:#594F4F;font-family:Arial, sans-serif;font-size:14px;overflow:hidden;padding:10px 5px;word-break:normal;}.tg th{background-color:#9DE0AD;border-color:#bbb;border-style:solid;border-width:1px;color:#493F3F;font-family:Arial, sans-serif;font-size:14px;fon t-weight:normal;overflow:hidden;padding:10px 5px;word-break:normal;}.tg .tg-cabecalho{text-align:left;vertical-align:top}.tg .tg-corpo{border-color:inherit;text-align:left;vertical-align:top}</style><table class=\"tg\" style=\"width: 900px;\"><thead><tr><th class=\"tg-cabecalho\"><span style=\"font-weight:bold\">Nome do Ambiente</span></th><th class=\"tg-cabecalho\"><span style=\"font-weight:bold\">URL de acesso</span></th></tr></thead><tbody><tr><td class=\"tg-corpo\">Ambiente de Validação de Empresas</td><td class=\"tg-corpo\">https://val.portalunico.siscomex.gov.br/remessa/consulta/{serviço}</td></tr><tr><td class=\"tg-corpo\">Ambiente de Produção</td><td class=\"tg-corpo\">https://portalunico.siscomex.gov.br/remessa/consulta/{serviço}</td></tr></tbody></table>
 *
 */
@Path("/")
@Api(value = "/", description = "")
public interface ServiosDestinadosConsultasDeDocumentosApi  {

    /**
     * Consulta de Manifesto de Presença de Carga
     *
     */
    @GET
    @Path("/api/ext/manifesto-presenca-carga/{numeroProtocolo}")
    @Produces({ "*/*" })
    @ApiOperation(value = "Consulta de Manifesto de Presença de Carga", notes = "", tags={ "Serviços destinados à consultas de documentos" })
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = ProcessamentoDeManifestoDePresenaDeCarga.class),
        @ApiResponse(code = 400, message = "Requisição mal formatada"),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
        @ApiResponse(code = 500, message = "Erro interno no servidor") })
    public Response consultarProtocoloManifestoCargaUsingGET(@ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token deve ser preenchido com o conteúdo do header Set-Token, retornado no response headers da chamada ao serviço de autenticação." ,required=true)@HeaderParam("Authorization") Object authorization, @ApiParam(value = "Número de protocolo recebido no retorno do envio de manifesto de presenta de carga",required=true) @PathParam("numeroProtocolo") String numeroProtocolo, @ApiParam(value = "Token de prevenção contra ataques CSRF (Cross-Site Request Forgery). Este token deve ser preenchido com o conteúdo do header X-CSRF-Token, retornado no response headers da chamada ao serviço de autenticação." ,required=true)@HeaderParam("X-CSRF-Token") Object xCSRFToken);
}

