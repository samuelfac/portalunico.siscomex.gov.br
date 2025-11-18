package br.gov.siscomex.portalunico.cctr.api;

import br.gov.siscomex.portalunico.cctr.model.ErroValidacao;
import br.gov.siscomex.portalunico.cctr.model.ExceptionCover;
import br.gov.siscomex.portalunico.cctr.model.RetornoConsultaProtocoloVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

/**
 * CCT Exportação - Recepção Assíncrona
 *
 * <p><h4>Introdu&ccedil;&atilde;o</h4>  <p>Bem-vindo &agrave; Application Programming Interface (API) do sistema Pucomex - Controle de Cargas e Transito Exporta&ccedil;&atilde;o.<br>Sistema desenvolvido para simplificar o controle de carga e trânsito no processo de Exportação, dando uma única solução e um único fluxo para qualquer tipo de carga e qualquer modal de transporte.  Facilita a organização e realização da recepção, consolidação, trânsito, entrega, carregamento e manifestação de cargas.</p>  <h4>URLs de Acesso</h4>  <p>Para utilizar os servi&ccedil;os dispon&iacute;veis nessa API deve-se seguir o seguinte padr&atilde;o de URL:</p>  <p><em>https://{ambiente}/<strong>cct</strong>/{servi&ccedil;o}</em></p>  <p>Onde, em <strong>{ambiente}</strong> deve-se informar o ambiente desejado dentre os ambientes dispon&iacute;veis na tabela abaixo e em <strong>{servi&ccedil;o}</strong> utilizar a URI do servi&ccedil;o desejado.</p>    <style type=\"text/css\">  .tg  {border-collapse:collapse;border-color:#bbb;border-spacing:0;width: 100%;}  .tg td{background-color:#E0FFEB;border-color:#bbb;border-style:solid;border-width:1px;color:#594F4F;    font-family:Arial, sans-serif;font-size:14px;overflow:hidden;padding:10px 5px;word-break:normal;}  .tg th{background-color:#9DE0AD;border-color:#bbb;border-style:solid;border-width:1px;color:#493F3F;    font-family:Arial, sans-serif;font-size:14px;font-weight:normal;overflow:hidden;padding:10px 5px;word-break:normal;}  .tg .tg-cabecalho{text-align:left;vertical-align:top}  .tg .tg-corpo{border-color:inherit;text-align:left;vertical-align:top}  </style>    <table class=\"tg\" style=\"width: 100%;\">  <thead>    <tr>      <th class=\"tg-cabecalho\"><span style=\"font-weight:bold\">Nome do Ambiente</span></th>      <th class=\"tg-cabecalho\"><span style=\"font-weight:bold\">URL de acesso</span></th>      <th class=\"tg-cabecalho\"><span style=\"font-weight:bold\">Público alvo</span></th>    </tr>  </thead>  <tbody>    <tr>      <td class=\"tg-corpo\">Ambiente de Homologação</td>      <td class=\"tg-corpo\">hom.pucomex.serpro.gov.br</td>      <td class=\"tg-corpo\">Intervenientes públicos (conforme perfil de acesso)</td>    </tr>    <tr>      <td class=\"tg-corpo\">Ambiente de Validação das Empresas</td>      <td class=\"tg-corpo\">val.portalunico.siscomex.gov.br</td>      <td class=\"tg-corpo\">Intervenientes privados</td>    </tr>    <tr>      <td class=\"tg-corpo\">Ambiente de Produção</td>      <td class=\"tg-corpo\">portalunico.siscomex.gov.br</td>      <td class=\"tg-corpo\">Todos os intervenientes (públicos e privados)</td>    </tr>  </tbody>  </table>    <p>&nbsp;</p>  <p><strong>Exemplo:</strong> Para o servi&ccedil;o \"Recepção de NFe Assíncrona\" a URI &eacute; \"api/ext/recepcao\".</p>  <p>Logo, abaixo temos um exemplo de URL completa considerando o ambiente de Valida&ccedil;&atilde;o, consumindo este servi&ccedil;o </p>  <p><em>https://val.portalunico.siscomex.gov.br/cct/api/ext/recepcao</em></p>
 *
 */
@Path("/")
@Api(value = "/", description = "")
public interface ConsultaSituacaoDoProtocoloDeRecepcaoApi {

    /**
     * Consulta a situação atual do protocolo de recepção
     *
     */
    @GET
    @Path("/api/ext/recepcao/{numero}/situacao")
    @Produces({"*/*", "application/json"})
    @ApiOperation(value = "Consulta a situação atual do protocolo de recepção", notes = "", tags = {"Consulta Situacao do Protocolo de Recepcao"})
    @ApiResponses(value = {
            @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio", response = ErroValidacao.class),
            @ApiResponse(code = 500, message = "Erro interno no servidor", response = ExceptionCover.class),
            @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = RetornoConsultaProtocoloVO.class)})
    RetornoConsultaProtocoloVO situacao(@ApiParam(value = "Identificador do protocolo da recepção", required = true) @PathParam("numero") String numero);
}

