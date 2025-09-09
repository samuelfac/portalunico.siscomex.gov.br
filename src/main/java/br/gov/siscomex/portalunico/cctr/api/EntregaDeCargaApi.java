package br.gov.siscomex.portalunico.cctr.api;

import br.gov.siscomex.portalunico.cctr.model.BusinessExceptionCover;
import br.gov.siscomex.portalunico.cctr.model.EntregasDocumentoCarga;
import br.gov.siscomex.portalunico.cctr.model.RetornoXmlServico;
import br.gov.siscomex.portalunico.cctr.model.UnexpectedExceptionCover;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * Controle de Carga de Importação - Modal Aquaviário
 *
 * <p><h4>Introdu&ccedil;&atilde;o</h4>  <p>Bem-vindo &agrave; Application Programming Interface (API) do sistema Pucomex - Controle de Cargas de Importa&ccedil;&atilde;o - Modal Aquaviário.<br>Sistema desenvolvido para simplificar o controle de carga no processo de Importa&ccedil;&atilde;o, dando uma única solução e um único fluxo para qualquer tipo de carga do modal aquaviário de transporte.  Facilita a organização e realização da recep&ccedil;&atilde;o, entrega, desunitiza&ccedil;&atilde;o.</p>  <h4>URLs de Acesso</h4>  <p>Para utilizar os servi&ccedil;os dispon&iacute;veis nessa API deve-se seguir o seguinte padr&atilde;o de URL:</p>  <p><em>https://{ambiente}/<strong>cct</strong>/{servi&ccedil;o}</em></p>  <p>Onde, em <strong>{ambiente}</strong> deve-se informar o ambiente desejado dentre os ambientes dispon&iacute;veis na tabela abaixo e em <strong>{servi&ccedil;o}</strong> utilizar a URI do servi&ccedil;o desejado.</p>    <style type=\"text/css\">  .tg  {border-collapse:collapse;border-color:#bbb;border-spacing:0;width: 100%;}  .tg td{background-color:#E0FFEB;border-color:#bbb;border-style:solid;border-width:1px;color:#594F4F;    font-family:Arial, sans-serif;font-size:14px;overflow:hidden;padding:10px 5px;word-break:normal;}  .tg th{background-color:#9DE0AD;border-color:#bbb;border-style:solid;border-width:1px;color:#493F3F;    font-family:Arial, sans-serif;font-size:14px;font-weight:normal;overflow:hidden;padding:10px 5px;word-break:normal;}  .tg .tg-cabecalho{text-align:left;vertical-align:top}  .tg .tg-corpo{border-color:inherit;text-align:left;vertical-align:top}  </style>    <table class=\"tg\" style=\"width: 100%;\">  <thead>    <tr>      <th class=\"tg-cabecalho\"><span style=\"font-weight:bold\">Nome do Ambiente</span></th>      <th class=\"tg-cabecalho\"><span style=\"font-weight:bold\">URL de acesso</span></th>      <th class=\"tg-cabecalho\"><span style=\"font-weight:bold\">Público alvo</span></th>    </tr>  </thead>  <tbody>    <tr>      <td class=\"tg-corpo\">Ambiente de Homologação</td>      <td class=\"tg-corpo\">hom.pucomex.serpro.gov.br</td>      <td class=\"tg-corpo\">Intervenientes públicos (conforme perfil de acesso)</td>    </tr>    <tr>      <td class=\"tg-corpo\">Ambiente de Validação das Empresas</td>      <td class=\"tg-corpo\">val.portalunico.siscomex.gov.br</td>      <td class=\"tg-corpo\">Intervenientes privados</td>    </tr>    <tr>      <td class=\"tg-corpo\">Ambiente de Produção</td>      <td class=\"tg-corpo\">portalunico.siscomex.gov.br</td>      <td class=\"tg-corpo\">Todos os intervenientes (públicos e privados)</td>    </tr>  </tbody>  </table>    <p>&nbsp;</p>  <p><strong>Exemplo:</strong> Para o servi&ccedil;o \"Recepção de Carga\" a URL &eacute; \"api/ext/imp/carga/recepcao/duimp\".</p>  <p>Logo, abaixo temos um exemplo de URL completa considerando o ambiente de Valida&ccedil;&atilde;o, consumindo este servi&ccedil;o </p>  <p><em>https://val.portalunico.siscomex.gov.br/cct/api/ext/imp/carga/recepcao/duimp</em></p>
 *
 */
@Path("/")
@Api(value = "/", description = "")
public interface EntregaDeCargaApi {

    /**
     * Entregar Carga por Duimp
     * <p>
     * Entrega de carga através do número de uma Duimp transferindo a responsabilidade pelo estoque da carga
     *
     */
    @POST
    @Path("/api/ext/imp/carga/entrega/duimp")
    @Consumes({"application/xml"})
    @Produces({"application/xml"})
    @ApiOperation(value = "Entregar Carga por Duimp", notes = "Entrega de carga através do número de uma Duimp transferindo a responsabilidade pelo estoque da carga", tags = {"Entrega de Carga"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = RetornoXmlServico.class),
            @ApiResponse(code = 400, message = "XML não atende as especificações definidas na API", response = RetornoXmlServico.class),
            @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio", response = BusinessExceptionCover.class),
            @ApiResponse(code = 500, message = "Erro interno no servidor", response = UnexpectedExceptionCover.class),
            @ApiResponse(code = 403, message = "Acesso negado ao usuário logado", response = RetornoXmlServico.class)})
    RetornoXmlServico entregar1(@ApiParam(value = "Dados da entrega", required = true) @Valid EntregasDocumentoCarga body);
}

