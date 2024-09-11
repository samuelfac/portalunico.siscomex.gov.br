package br.gov.siscomex.portalunico.cct_rcar.api;

import br.gov.siscomex.portalunico.cct_rcar.model.ErroValidacao;
import br.gov.siscomex.portalunico.cct_rcar.model.ExceptionCover;
import br.gov.siscomex.portalunico.cct_rcar.model.RecepcaoNFECover;
import br.gov.siscomex.portalunico.cct_rcar.model.RetornoConsultaProtocoloVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

/**
 * CCT Exportação - Recepção de NF-e Assíncrona
 *
 * <p><h4>Introdu&ccedil;&atilde;o</h4>  <p>Bem-vindo &agrave; Application Programming Interface (API) do sistema Pucomex - Controle de Cargas e Transito Exporta&ccedil;&atilde;o.<br>Sistema desenvolvido para simplificar o controle de carga e trânsito no processo de Exportação, dando uma única solução e um único fluxo para qualquer tipo de carga e qualquer modal de transporte.  Facilita a organização e realização da recepção, consolidação, trânsito, entrega, carregamento e manifestação de cargas.</p>  <h4>URLs de Acesso</h4>  <p>Para utilizar os servi&ccedil;os dispon&iacute;veis nessa API deve-se seguir o seguinte padr&atilde;o de URL:</p>  <p><em>https://{ambiente}/<strong>cct</strong>/{servi&ccedil;o}</em></p>  <p>Onde, em <strong>{ambiente}</strong> deve-se informar o ambiente desejado dentro os ambientes dispon&iacute;veis na tabela abaixo e em <strong>{servi&ccedil;o}</strong> utilizar a URI do servi&ccedil;o desejado.</p>    <style type=\"text/css\">  .tg  {border-collapse:collapse;border-color:#bbb;border-spacing:0;width: 604px;}  .tg td{background-color:#E0FFEB;border-color:#bbb;border-style:solid;border-width:1px;color:#594F4F;    font-family:Arial, sans-serif;font-size:14px;overflow:hidden;padding:10px 5px;word-break:normal;}  .tg th{background-color:#9DE0AD;border-color:#bbb;border-style:solid;border-width:1px;color:#493F3F;    font-family:Arial, sans-serif;font-size:14px;font-weight:normal;overflow:hidden;padding:10px 5px;word-break:normal;}  .tg .tg-cabecalho{text-align:left;vertical-align:top}  .tg .tg-corpo{border-color:inherit;text-align:left;vertical-align:top}  </style>    <table class=\"tg\" style=\"width: 604px;\">  <thead>  <tr>      <th class=\"tg-cabecalho\"><span style=\"font-weight:bold\">Nome do Ambiente</span></th>      <th class=\"tg-cabecalho\"><span style=\"font-weight:bold\">URL de acesso</span></th>   </tr>  </thead>  <tbody>    <tr>      <td class=\"tg-corpo\">Ambiente de Validação da Empresas</td>      <td class=\"tg-corpo\">val.portalunico.siscomex.gov.br</td>    </tr>    <tr>      <td class=\"\\tg-corpo\">Ambiente de Produção</td>      <td class=\"\\tg-corpo\">portalunico.siscomex.gov.br</td>    </tr>  </tbody>  </table>    <p>&nbsp;</p>  <p><strong>Exemplo:</strong> Para o servi&ccedil;o \"Recepção Assíncrona de NFe\" a URI &eacute; \"api/ext/recepcao\".</p>  <p>Logo, abaixo temos um exemplo de URL completa considerando o ambiente de Valida&ccedil;&atilde;o, consumindo este servi&ccedil;o </p>  <p><em>https://val.portalunico.siscomex.gov.br/cct/api/ext/recepcao</em></p>
 */
@Path("/")
@Api(value = "/", description = "")
public interface RecepoAssncronaDeNfeApi {

    /**
     * Cria novo protocolo de recepção de NFe
     */
    @POST
    @Path("/api/ext/recepcao")
    @Consumes({"application/json"})
    @Produces({"*/*", "application/json", "text/plain"})
    @ApiOperation(value = "Cria novo protocolo de recepção de NFe", notes = "", tags = {"Recepção Assíncrona de NFe"})
    @ApiResponses(value = {
            @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio", response = ErroValidacao.class),
            @ApiResponse(code = 400, message = "JSON não atende as especificações definidas na API", response = ErroValidacao.class),
            @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = String.class),
            @ApiResponse(code = 500, message = "Erro interno no servidor", response = ExceptionCover.class)})
    Response criarProtocolo(@ApiParam(value = "", required = true) @Valid RecepcaoNFECover body);

    /**
     * Consulta o extrato do protocolo de recepção NFe
     */
    @GET
    @Path("/api/ext/recepcao/{numero}/extrato")
    @Produces({"*/*", "application/json"})
    @ApiOperation(value = "Consulta o extrato do protocolo de recepção NFe", notes = "", tags = {"Recepção Assíncrona de NFe"})
    @ApiResponses(value = {
            @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio", response = ErroValidacao.class),
            @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = RetornoConsultaProtocoloVO.class),
            @ApiResponse(code = 500, message = "Erro interno no servidor", response = ExceptionCover.class)})
    Response extrato(@ApiParam(value = "Identificador do protocolo da recepção", required = true) @PathParam("numero") String numero);

    /**
     * Consulta a situação atual do protocolo de recepção NFe
     */
    @GET
    @Path("/api/ext/recepcao/{numero}/situacao")
    @Produces({"*/*", "application/json"})
    @ApiOperation(value = "Consulta a situação atual do protocolo de recepção NFe", notes = "", tags = {"Recepção Assíncrona de NFe"})
    @ApiResponses(value = {
            @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio", response = ErroValidacao.class),
            @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = RetornoConsultaProtocoloVO.class),
            @ApiResponse(code = 500, message = "Erro interno no servidor", response = ExceptionCover.class)})
    Response situacao(@ApiParam(value = "Identificador do protocolo da recepção", required = true) @PathParam("numero") String numero);
}

