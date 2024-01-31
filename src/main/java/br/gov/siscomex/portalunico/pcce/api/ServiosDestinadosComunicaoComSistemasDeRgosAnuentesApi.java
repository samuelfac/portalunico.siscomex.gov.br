package br.gov.siscomex.portalunico.pcce.api;

import br.gov.siscomex.portalunico.pcce.model.DadosPagamentoTributosDTO;
import br.gov.siscomex.portalunico.pcce.model.GuiaPagamentoTributosDTO;
import br.gov.siscomex.portalunico.pcce.model.SolicitacaoPagamentoTaxaDTO;
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
import javax.ws.rs.core.Response;

/**
 * Pagamento Centralizado do Comércio Exterior
 *
 * <p><!DOCTYPE html><html><h4>Introdução</h4><p>O PCCE visa facilitar a validação e o acompanhamento do cumprimento da obrigação do ICMS, via PUCOMEX, junto às Sefaz/UF e o pagamento de tributos federais relativos à Declaração Única de Importação. Futuramente também será responsável pelos pagamentos dos demais tributos e taxas vinculados ao Comércio Exterior.</p><h4>URLs de Acesso</h4><p>Para utilizar os serviços disponíveis nessa API deve-se seguir o seguinte padrão de URL:</p><p><em>https://{ambiente}/<strong>pcce</strong>/api/{serviço}</em></p><p>Onde, em <strong>{ambiente}</strong> deve-se informar o ambiente desejado dentro os ambientes disponíveis na tabela abaixo e em <strong>{serviço}</strong> utilizar a URI do serviço desejado.</p><style type=\"text/css\">.tg  {border-collapse:collapse;border-color:#bbb;border-spacing:0;width: 100%;}.tg td{background-color:#E0FFEB;border-color:#bbb;border-style:solid;border-width:1px;color:#594F4F;  font-family:Arial, sans-serif;font-size:14px;overflow:hidden;padding:10px 5px;word-break:normal;}.tg th{background-color:#9DE0AD;border-color:#bbb;border-style:solid;border-width:1px;color:#493F3F;  font-family:Arial, sans-serif;font-size:14px;font-weight:normal;overflow:hidden;padding:10px 5px;word-break:normal;}.tg .tg-cabecalho{text-align:left;vertical-align:top}.tg .tg-corpo{border-color:inherit;text-align:left;vertical-align:top}</style><table class=\"tg\" style=\"width: 100%;\"><thead><tr>    <th class=\"tg-cabecalho\"><span style=\"font-weight:bold\">Nome do Ambiente</span></th>    <th class=\"tg-cabecalho\"><span style=\"font-weight:bold\">URL de acesso</span></th>  </tr></thead><tbody><tr>    <td class=\"tg-corpo\">Ambiente de Produção</td>    <td class=\"tg-corpo\">portalunico.siscomex.gov.br</td>  </tr></tbody></table><br/><p><strong>Exemplo:</strong> Para o serviço \"Confirmar crédito de pagamento de ICMS\" a URI é \"/ext/sefaz/icms/credito\".</p><p>Logo, abaixo temos um exemplo de URL completa considerando o ambiente de Produção, consumindo este serviço:</p><p><em>https://portalunico.siscomex.gov.br/pcce/api/ext/sefaz/icms/credito</em></p></html>
 *
 */
@Path("/")
@Api(value = "/", description = "")
public interface ServiosDestinadosComunicaoComSistemasDeRgosAnuentesApi  {

    /**
     * Confirmar pagamento de guia de tributos dos orgãos anuentes
     *
     * Recebe dos órgãos anuentes a confirmação de pagamento de uma guia.
     *
     */
    @POST
    @Path("/ext/anuentes/guia/pagamento")
    @Consumes({ "application/json" })
    @ApiOperation(value = "Confirmar pagamento de guia de tributos dos orgãos anuentes", notes = "Recebe dos órgãos anuentes a confirmação de pagamento de uma guia.", tags={ "Serviços destinados à comunicação com sistemas de órgãos anuentes" })
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "Operação realizada com sucesso"),
        @ApiResponse(code = 400, message = "Requisição mal formatada"),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 404, message = "Recurso não encontrado"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
        @ApiResponse(code = 500, message = "Erro interno no servidor") })
    public Response receberConfirmacaoPagamamentoGuia(@ApiParam(value = "Dados do pagamento da guia" ,required=true)@Valid DadosPagamentoTributosDTO body, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Recuperado no parâmetro Set-Token no response da autenticação." ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Recuperado no parâmetro X-CSRF-Token no response da autenticação." ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * Cadastrar guia de pagamento de tributos de órgãos anuentes
     *
     * Recebe dos órgãos anuentes os dados referentes a uma guia de pagamento de tributos.
     *
     */
    @POST
    @Path("/ext/anuentes/guia")
    @Consumes({ "application/json" })
    @ApiOperation(value = "Cadastrar guia de pagamento de tributos de órgãos anuentes", notes = "Recebe dos órgãos anuentes os dados referentes a uma guia de pagamento de tributos.", tags={ "Serviços destinados à comunicação com sistemas de órgãos anuentes" })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Recurso criado com sucesso"),
        @ApiResponse(code = 400, message = "Requisição mal formatada"),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 404, message = "Recurso não encontrado"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
        @ApiResponse(code = 500, message = "Erro interno no servidor") })
    public Response receberDadosGuiaPagamento(@ApiParam(value = "Dados da guia de pagamento" ,required=true)@Valid GuiaPagamentoTributosDTO body, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Recuperado no parâmetro Set-Token no response da autenticação." ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Recuperado no parâmetro X-CSRF-Token no response da autenticação." ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * Solicitar pagamento de taxa de órgãos anuentes
     *
     * Recebe dos órgãos anuentes os dados para realizar o pagamento de taxa.
     *
     */
    @POST
    @Path("/ext/anuentes/pagamento")
    @Consumes({ "application/json" })
    @ApiOperation(value = "Solicitar pagamento de taxa de órgãos anuentes", notes = "Recebe dos órgãos anuentes os dados para realizar o pagamento de taxa.", tags={ "Serviços destinados à comunicação com sistemas de órgãos anuentes" })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Recurso criado com sucesso"),
        @ApiResponse(code = 400, message = "Requisição mal formatada"),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 404, message = "Recurso não encontrado"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
        @ApiResponse(code = 500, message = "Erro interno no servidor") })
    public Response receberSolicitacaoPagamento(@ApiParam(value = "Dados da solicitação de pagamento de taxa" ,required=true)@Valid SolicitacaoPagamentoTaxaDTO body, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Recuperado no parâmetro Set-Token no response da autenticação." ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Recuperado no parâmetro X-CSRF-Token no response da autenticação." ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken);
}

