package br.gov.siscomex.portalunico.pcce.api;

import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import br.gov.siscomex.portalunico.pcce.model.SefazCreditoIcmsDto;
import br.gov.siscomex.portalunico.pcce.model.SefazDadosIcmsDto;
import br.gov.siscomex.portalunico.pcce.model.SolicitacaoCalculoIcmsDto;
import br.gov.siscomex.portalunico.pcce.model.SolicitacaoIcmsDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * Pagamento Centralizado do Comércio Exterior
 *
 * <p><!DOCTYPE html><html><h4>Introdução</h4><p>O PCCE visa facilitar a validação e o acompanhamento do cumprimento da obrigação do ICMS, via PUCOMEX, junto às Sefaz/UF e o pagamento de tributos federais relativos à Declaração Única de Importação. Futuramente também será responsável pelos pagamentos dos demais tributos e taxas vinculados ao Comércio Exterior.</p><h4>URLs de Acesso</h4><p>Para utilizar os serviços disponíveis nessa API deve-se seguir o seguinte padrão de URL:</p><p><em>https://{ambiente}/<strong>pcce</strong>/api/{serviço}</em></p><p>Onde, em <strong>{ambiente}</strong> deve-se informar o ambiente desejado dentro os ambientes disponíveis na tabela abaixo e em <strong>{serviço}</strong> utilizar a URI do serviço desejado.</p><style type=\"text/css\">.tg  {border-collapse:collapse;border-color:#bbb;border-spacing:0;width: 100%;}.tg td{background-color:#E0FFEB;border-color:#bbb;border-style:solid;border-width:1px;color:#594F4F;  font-family:Arial, sans-serif;font-size:14px;overflow:hidden;padding:10px 5px;word-break:normal;}.tg th{background-color:#9DE0AD;border-color:#bbb;border-style:solid;border-width:1px;color:#493F3F;  font-family:Arial, sans-serif;font-size:14px;font-weight:normal;overflow:hidden;padding:10px 5px;word-break:normal;}.tg .tg-cabecalho{text-align:left;vertical-align:top}.tg .tg-corpo{border-color:inherit;text-align:left;vertical-align:top}</style><table class=\"tg\" style=\"width: 100%;\"><thead><tr>    <th class=\"tg-cabecalho\"><span style=\"font-weight:bold\">Nome do Ambiente</span></th>    <th class=\"tg-cabecalho\"><span style=\"font-weight:bold\">URL de acesso</span></th>  </tr></thead><tbody><tr>    <td class=\"tg-corpo\">Ambiente de Produção</td>    <td class=\"tg-corpo\">portalunico.siscomex.gov.br</td>  </tr></tbody></table><br/><p><strong>Exemplo:</strong> Para o serviço \"Confirmar crédito de pagamento de ICMS\" a URI é \"/ext/sefaz/icms/credito\".</p><p>Logo, abaixo temos um exemplo de URL completa considerando o ambiente de Produção, consumindo este serviço:</p><p><em>https://portalunico.siscomex.gov.br/pcce/api/ext/sefaz/icms/credito</em></p></html>
 *
 */
@Path("/")
@Api(value = "/", description = "")
public interface ServiosDestinadosComunicaoComSistemasDasSefazApi  {

    /**
     * Confirmar crédito de pagamento de ICMS
     *
     * Recebe da Sefaz a confirmação de crédito de pagamento de ICMS.
     *
     */
    @POST
    @Path("/ext/sefaz/icms/credito")
    @Consumes({ "application/json" })
    @ApiOperation(value = "Confirmar crédito de pagamento de ICMS", notes = "Recebe da Sefaz a confirmação de crédito de pagamento de ICMS.", tags={ "Serviços destinados à comunicação com sistemas das Sefaz" })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Recurso criado com sucesso"),
        @ApiResponse(code = 400, message = "Requisição mal formatada"),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 404, message = "Recurso não encontrado"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
        @ApiResponse(code = 500, message = "Erro interno no servidor") })
    public Response confirmarCreditoPagamentoIcms(@ApiParam(value = "Dados da confirmação de crédito de ICMS" ,required=true)@Valid SefazCreditoIcmsDto body, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Recuperado no parâmetro Set-Token no response da autenticação." ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Recuperado no parâmetro X-CSRF-Token no response da autenticação." ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * Consulta de declarações de ICMS
     *
     * Consulta dados das declarações de ICMS no PCCE.
     *
     */
    @GET
    @Path("/ext/sefaz/icms/consulta/{numDeclaracao}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Consulta de declarações de ICMS", notes = "Consulta dados das declarações de ICMS no PCCE.", tags={ "Serviços destinados à comunicação com sistemas das Sefaz" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = SolicitacaoIcmsDto.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Requisição mal formatada"),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 404, message = "Recurso não encontrado"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
        @ApiResponse(code = 500, message = "Erro interno no servidor") })
    public Response consultarDeclaracoesIcmsSefaz(@ApiParam(value = "Número da Duimp (sem hífen e sem versão)",required=true) @PathParam("numDeclaracao") String numDeclaracao, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Recuperado no parâmetro Set-Token no response da autenticação." ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Recuperado no parâmetro X-CSRF-Token no response da autenticação." ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * Consulta de solicitação de cálculo de ICMS pendente
     *
     * Consulta de solicitação de cálculo de ICMS pendente.
     *
     */
    @GET
    @Path("/ext/sefaz/icms/consulta/calculo/{numDeclaracao}/{versaoDeclaracao}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Consulta de solicitação de cálculo de ICMS pendente", notes = "Consulta de solicitação de cálculo de ICMS pendente.", tags={ "Serviços destinados à comunicação com sistemas das Sefaz" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = SolicitacaoCalculoIcmsDto.class),
        @ApiResponse(code = 400, message = "Requisição mal formatada"),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 404, message = "Recurso não encontrado"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
        @ApiResponse(code = 500, message = "Erro interno no servidor") })
    public Response consultarSolicitacaoCalculoIcmsSefaz(@ApiParam(value = "Número da Duimp (sem hífen)",required=true) @PathParam("numDeclaracao") String numDeclaracao, @ApiParam(value = "Versão da Duimp",required=true) @PathParam("versaoDeclaracao") Integer versaoDeclaracao, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Recuperado no parâmetro Set-Token no response da autenticação." ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Recuperado no parâmetro X-CSRF-Token no response da autenticação." ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * Receber dados de declaração de ICMS da Sefaz
     *
     * Recebe da Sefaz os dados referentes ao cálculo de ICMS para criação automática da declaração de ICMS no Pucomex.
     *
     */
    @POST
    @Path("/ext/sefaz/icms")
    @Consumes({ "application/json" })
    @ApiOperation(value = "Receber dados de declaração de ICMS da Sefaz", notes = "Recebe da Sefaz os dados referentes ao cálculo de ICMS para criação automática da declaração de ICMS no Pucomex.", tags={ "Serviços destinados à comunicação com sistemas das Sefaz" })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Recurso criado com sucesso"),
        @ApiResponse(code = 400, message = "Requisição mal formatada"),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 404, message = "Recurso não encontrado"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
        @ApiResponse(code = 500, message = "Erro interno no servidor") })
    public Response receberDadosDeclaracaoIcmsSefaz(@ApiParam(value = "Dados da declaração de ICMS" ,required=true)@Valid SefazDadosIcmsDto body, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Recuperado no parâmetro Set-Token no response da autenticação." ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Recuperado no parâmetro X-CSRF-Token no response da autenticação." ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken);
}

