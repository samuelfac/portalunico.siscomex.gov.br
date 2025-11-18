package br.gov.siscomex.portalunico.dimp.api;

import br.gov.siscomex.portalunico.dimp.model.BalancaDuimpSumarioCover;
import br.gov.siscomex.portalunico.dimp.model.BalancaDuimpTotaisCover;
import br.gov.siscomex.portalunico.dimp.model.Error;
import br.gov.siscomex.portalunico.dimp.model.RespostaApiErroBalanca;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import javax.validation.constraints.NotNull;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import java.util.List;

/**
 * Declaração Única de Importação - Balança Comercial - Dados Gerais e Totalizadores
 *
 * <p><h3>Duimp - Declara&ccedil;&atilde;o &Uacute;nica de Importa&ccedil;&atilde;o - Balan&ccedil;a Comercial</h3>  <h4>Introdu&ccedil;&atilde;o</h4>  <p>Esta API da Declara&ccedil;&atilde;o &Uacute;nica de Importa&ccedil;&atilde;o (Duimp) , reunir&aacute; todas as informa&ccedil;&otilde;es necessárias para a apuração da Balança Comercial.</p>  <p>Esta API fornece os seguintes serviços     <ul>         <li>Consultar dados gerais</li>         <li>Consultar dados complementares</li>         <li>Consultar Sumários diários das operações</li>         <li>Consultar Totais gerais das operações</li>     </ul>  </p>  <h4>URLs de Acesso</h4>  <p>Para utilizar os servi&ccedil;os dispon&iacute;veis nessa API deve-se seguir o seguinte padr&atilde;o de URL:</p>  <p><em>https://{ambiente}/{Base URL}/{servi&ccedil;o}</em></p>  <p>Onde:<br> Em <strong>{ambiente}</strong> deve-se utilizar o ambiente desejado de acordo com os ambientes disponíveis na tabela abaixo.<br> Em <strong>{Base URL}</strong> deve-se utilizar o valor de 'Base URL' informado no topo desta página.<br> Em <strong>{serviço}</strong> deve-se utilizar a URI do serviço desejado.<br></p>  <style type=\"text/css\"> .tg  {border-collapse:collapse;border-color:#bbb;border-spacing:0;width: 604px;} .tg td{background-color:#E0FFEB;border-color:#bbb;border-style:solid;border-width:1px;color:#594F4F;   font-family:Arial, sans-serif;font-size:14px;overflow:hidden;padding:10px 5px;word-break:normal;} .tg th{background-color:#9DE0AD;border-color:#bbb;border-style:solid;border-width:1px;color:#493F3F;   font-family:Arial, sans-serif;font-size:14px;font-weight:normal;overflow:hidden;padding:10px 5px;word-break:normal;} .tg .tg-cabecalho{text-align:left;vertical-align:top;} .tg .tg-corpo{border-color:inherit;text-align:left;vertical-align:top;} </style>  <table class=\"tg\" style=\"width: 100%;\"> <thead>   <tr>     <th class=\"tg-cabecalho\"><span style=\"font-weight:bold\">Nome do ambiente</span></th>     <th class=\"tg-cabecalho\"><span style=\"font-weight:bold\">URL de acesso</span></th>  <th class=\"tg-cabecalho\"><span style=\"font-weight:bold\">Público alvo</span></th>   </tr> </thead> <tbody>  <tr>  <td class=\"tg-corpo\">Ambiente de Homologação</td>  <td class=\"tg-corpo\">hom.pucomex.serpro.gov.br</td>  <td class=\"tg-corpo\">Intervenientes públicos (conforme perfil de acesso)</td>  </tr>   <tr>     <td class=\"tg-corpo\">Ambiente de Validação das Empresas</td>     <td class=\"tg-corpo\">val.portalunico.siscomex.gov.br</td>  <td class=\"tg-corpo\">Intervenientes privados</td>   </tr>   <tr>     <td class=\"tg-corpo\">Ambiente de Produção</td>     <td class=\"tg-corpo\">portalunico.siscomex.gov.br</td>  <td class=\"tg-corpo\">Todos os intervenientes (públicos e privados)</td>   </tr> </tbody> </table>  <p>&nbsp;</p>  <p><b>Obs:</b> Todas as operações contam com uma descrição geral da operação abaixo da url, além da descrição resumida exibida ao seu lado.</p>  
 *
 */
@Path("/")
@Api(value = "/", description = "")
public interface DuimpTotalizadoresApi {

    /**
     * Recupera os dados do Sumário: Lista de Totalizadores agrupados por data.
     *
     */
    @GET
    @Path("/totalizadores/sumarios")
    @Produces({"application/json"})
    @ApiOperation(value = "Recupera os dados do Sumário: Lista de Totalizadores agrupados por data.", notes = "", tags = {"Duimp - Totalizadores"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = BalancaDuimpSumarioCover.class, responseContainer = "List"),
            @ApiResponse(code = 204, message = "Operação realizada com sucesso. Nenhum dado será retornado.", response = BalancaDuimpSumarioCover.class),
            @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida", response = RespostaApiErroBalanca.class),
            @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso", response = RespostaApiErroBalanca.class),
            @ApiResponse(code = 404, message = "Recurso não encontrado", response = Error.class),
            @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio", response = RespostaApiErroBalanca.class),
            @ApiResponse(code = 500, message = "Erro interno no servidor", response = RespostaApiErroBalanca.class)})
    List<BalancaDuimpSumarioCover> obterDadosSumarioUsingGET(@NotNull @ApiParam(value = "Data inicial de desembaraço a ser considerada no filtro de pesquisa. <br>Formato: 'AAAA-MM-DD'", required = true) @QueryParam("data-inicial") String dataInicial, @NotNull @ApiParam(value = "Data final de desembaraço a ser considerada no filtro de pesquisa. <br>Formato: 'AAAA-MM-DD'", required = true) @QueryParam("data-final") String dataFinal, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário.<br>Este token é recuperado no parâmetro Set-Token no response da autenticação", required = true) @HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF.<br>Este token é recuperado no parâmetro X-CSRF-Token no response da autenticação", required = true) @HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * Recupera os Totais Gerais: Recupera os totalizadores das Duimps seleciondas utilizando os mesmos parâmetros da Consulta dos Dados Gerais .
     *
     */
    @GET
    @Path("/totalizadores/quantidades-totais")
    @Produces({"application/json"})
    @ApiOperation(value = "Recupera os Totais Gerais: Recupera os totalizadores das Duimps seleciondas utilizando os mesmos parâmetros da Consulta dos Dados Gerais .", notes = "", tags = {"Duimp - Totalizadores"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = BalancaDuimpTotaisCover.class),
            @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida", response = RespostaApiErroBalanca.class),
            @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso", response = RespostaApiErroBalanca.class),
            @ApiResponse(code = 404, message = "Recurso não encontrado", response = Error.class),
            @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio", response = RespostaApiErroBalanca.class),
            @ApiResponse(code = 500, message = "Erro interno no servidor", response = RespostaApiErroBalanca.class)})
    BalancaDuimpTotaisCover obterQuantidadesTotaisUsingGET(@NotNull @ApiParam(value = "Data inicial de desembaraço a ser considerada no filtro de pesquisa. <br>Formato: 'AAAA-MM-DD'", required = true) @QueryParam("data-inicial-desembaraco") String dataInicialDesembaraco, @NotNull @ApiParam(value = "Data final de desembaraço a ser considerada no filtro de pesquisa. <br>Formato: 'AAAA-MM-DD'", required = true) @QueryParam("data-final-desembaraco") String dataFinalDesembaraco, @NotNull @ApiParam(value = "Data inicial da última atualização a ser considerada no filtro de pesquisa. <br>Formato: 'AAAA-MM-DD'", required = true) @QueryParam("data-inicial-atualizacao") String dataInicialAtualizacao, @NotNull @ApiParam(value = "Data final da última atualização a ser considerada no filtro de pesquisa. <br>Formato: 'AAAA-MM-DD'", required = true) @QueryParam("data-final-atualizacao") String dataFinalAtualizacao, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. <br>Este token é recuperado no parâmetro Set-Token no response da autenticação", required = true) @HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF.<br>Este token é recuperado no parâmetro X-CSRF-Token no response da autenticação", required = true) @HeaderParam("X-CSRF-Token") String xCSRFToken);
}

