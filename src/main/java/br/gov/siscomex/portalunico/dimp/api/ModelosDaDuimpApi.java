package br.gov.siscomex.portalunico.dimp.api;

import br.gov.siscomex.portalunico.dimp.model.DuimpCover;
import br.gov.siscomex.portalunico.dimp.model.ItemCover;
import br.gov.siscomex.portalunico.dimp.model.RegistroCover;
import br.gov.siscomex.portalunico.dimp.model.RespostaApiErro;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import javax.validation.constraints.NotNull;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import java.util.List;

/**
 * Declaração Única de Importação - API Receita Federal
 *
 * <p><h4>URLs de Acesso</h4><p>Para utilizar os servi&ccedil;os dispon&iacute;veis nessa API deve-se seguir o seguinte padr&atilde;o de URL:</p>  <p><em>https://{ambiente}/duimp-api/api/ext/{servi&ccedil;o}</em></p>  <p>Onde:<br> Em <strong>{ambiente}</strong> deve-se informar o ambiente desejado dentre os ambientes dispon&iacute;veis na tabela abaixo.<br> Em <strong>{servi&ccedil;o}</strong> utilizar a URI do servi&ccedil;o desejado.</p>  <style type=\"text/css\"> .tg  {border-collapse:collapse;border-color:#bbb;border-spacing:0;width: 604px;} .tg td{background-color:#E0FFEB;border-color:#bbb;border-style:solid;border-width:1px;color:#594F4F;   font-family:Arial, sans-serif;font-size:14px;overflow:hidden;padding:10px 5px;word-break:normal;} .tg th{background-color:#9DE0AD;border-color:#bbb;border-style:solid;border-width:1px;color:#493F3F;   font-family:Arial, sans-serif;font-size:14px;font-weight:normal;overflow:hidden;padding:10px 5px;word-break:normal;} .tg .tg-cabecalho{text-align:left;vertical-align:top;} .tg .tg-corpo{border-color:inherit;text-align:left;vertical-align:top;} </style>  <table class=\"tg\" style=\"width: 100%;\"> <thead>   <tr>     <th class=\"tg-cabecalho\"><span style=\"font-weight:bold\">Nome do ambiente</span></th>     <th class=\"tg-cabecalho\"><span style=\"font-weight:bold\">URL de acesso</span></th>   <th class=\"tg-cabecalho\"><span style=\"font-weight:bold\">Público alvo</span></th>     </tr> </thead> <tbody>   <tr>     <td class=\"tg-corpo\">Ambiente de Homologa&ccedil;&atilde;o</td>     <td class=\"tg-corpo\">hom.pucomex.serpro.gov.br</td>   <td class=\"tg-corpo\">Intervenientes p&uacute;blicos (conforme perfil de acesso)</td>     </tr><tr>     <td class=\"tg-corpo\">Ambiente de Valida&ccedil;&atilde;o das Empresas</td>     <td class=\"tg-corpo\">val.portalunico.siscomex.gov.br</td>   <td class=\"tg-corpo\">Intervenientes privados</td>     </tr>   <tr>     <td class=\"tg-corpo\">Ambiente de Produ&ccedil;&atilde;o</td>     <td class=\"tg-corpo\">portalunico.siscomex.gov.br</td>   <td class=\"tg-corpo\">Todos os intervenientes (p&uacute;blicos e privados)</td>     </tr> </tbody> </table>  <p>&nbsp;</p>  <p><strong>Exemplo:</strong> Para o servi&ccedil;o &quot;Consulta dos dados gerais da vers&atilde;o vigente de uma Duimp&quot; a URI &eacute; &quot;ext/duimp/{numero}/{versao}&quot;.</p>  <p>Logo, abaixo temos um exemplo de URL completa considerando o ambiente de Valida&ccedil;&atilde;o, consumindo este servi&ccedil;o</p>  <p><em>https://val.portalunico.siscomex.gov.br/duimp-api/api/ext/duimp/20BR00001001899/1</em></p>  <h4>As opera&ccedil;&otilde;es dispon&iacute;veis na API para a Receita s&atilde;o:</h4>  <li>Consultar valores calculados da Duimp</li>  <li>Consultar valores calculados dos itens da Duimp</li><li>Recuperar modelo dos dados gerais de uma Duimp em elabora&ccedil;&atilde;o</li>  <li>Recuperar modelo dos dados dos itens de uma Duimp em elabora&ccedil;&atilde;o</li>  <li>Recuperar modelo da solicita&ccedil;&atilde;o de registro de uma Duimp verificar os valores informados</li> </ul>    <p><b>Obs:</b> Todas as opera&ccedil;&otilde;es contam com uma descri&ccedil;&atilde;o geral da opera&ccedil;&atilde;o abaixo da url, al&eacute;m da descri&ccedil;&atilde;o resumida exibida ao seu lado.</p>      
 *
 */
@Path("/")
@Api(value = "/", description = "")
public interface ModelosDaDuimpApi {

    /**
     * Recuperar modelo dos dados gerais da Duimp.
     *
     * Use esta funcionalidade para gerar o JSON que servirá de modelo para a funcionalidade salvar dados gerais.
     *
     */
    @GET
    @Path("/modelo/duimp/{numero-duimp}/{versao-duimp}")
    @Produces({"application/json"})
    @ApiOperation(value = "Recuperar modelo dos dados gerais da Duimp.", notes = "Use esta funcionalidade para gerar o JSON que servirá de modelo para a funcionalidade salvar dados gerais.", tags = {"Modelos da Duimp"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = DuimpCover.class),
            @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
            @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
            @ApiResponse(code = 404, message = "Recurso não encontrado"),
            @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio", response = RespostaApiErro.class),
            @ApiResponse(code = 500, message = "Erro interno no servidor")})
    DuimpCover buscarDadosCapaDuimp(@ApiParam(value = "Número da Duimp.", required = true) @PathParam("numero-duimp") String numeroDuimp, @ApiParam(value = "Versão da Duimp.", required = true) @PathParam("versao-duimp") Object versaoDuimp, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token é recuperado no parâmetro Set-Token no response da autenticação", required = true) @HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Este token é recuperado no parâmetro X-CSRF-Token no response da autenticação", required = true) @HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * Recuperar modelo dos dados dos itens da Duimp.
     *
     * Use esta funcionalidade para gerar o JSON que servirá de modelo para a funcionalidade salvar os dados dos itens da Duimp.
     *
     */
    @GET
    @Path("/modelo/duimp/{numero-duimp}/{versao-duimp}/itens")
    @Produces({"application/json"})
    @ApiOperation(value = "Recuperar modelo dos dados dos itens da Duimp.", notes = "Use esta funcionalidade para gerar o JSON que servirá de modelo para a funcionalidade salvar os dados dos itens da Duimp.", tags = {"Modelos da Duimp"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = ItemCover.class, responseContainer = "List"),
            @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
            @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
            @ApiResponse(code = 404, message = "Recurso não encontrado"),
            @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio", response = RespostaApiErro.class),
            @ApiResponse(code = 500, message = "Erro interno no servidor")})
    List<ItemCover> buscarDadosItensDuimp(@ApiParam(value = "Número da Duimp.", required = true) @PathParam("numero-duimp") String numeroDuimp, @ApiParam(value = "Versão da Duimp.", required = true) @PathParam("versao-duimp") Object versaoDuimp, @NotNull @ApiParam(value = "Se refere ao primeiro item a ser retornado.", required = true) @QueryParam("inicial") Object inicial, @NotNull @ApiParam(value = "Se refere a quantidade de itens retornados.", required = true) @QueryParam("tamanho") Object tamanho, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token é recuperado no parâmetro Set-Token no response da autenticação", required = true) @HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Este token é recuperado no parâmetro X-CSRF-Token no response da autenticação", required = true) @HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * Recuperar modelo da solicitação de registro da Duimp.
     *
     * Use esta funcionalidade para gerar o JSON que servirá de modelo para a funcionalidade de registro da Duimp.
     *
     */
    @GET
    @Path("/modelo/duimp/{numero-duimp}/{versao-duimp}/registros")
    @Produces({"application/json"})
    @ApiOperation(value = "Recuperar modelo da solicitação de registro da Duimp.", notes = "Use esta funcionalidade para gerar o JSON que servirá de modelo para a funcionalidade de registro da Duimp.", tags = {"Modelos da Duimp"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = RegistroCover.class),
            @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
            @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
            @ApiResponse(code = 404, message = "Recurso não encontrado"),
            @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio", response = RespostaApiErro.class),
            @ApiResponse(code = 500, message = "Erro interno no servidor")})
    RegistroCover buscarModeloRegistroDuimp(@ApiParam(value = "Número da Duimp.", required = true) @PathParam("numero-duimp") String numeroDuimp, @ApiParam(value = "Versão da Duimp.", required = true) @PathParam("versao-duimp") Object versaoDuimp, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token é recuperado no parâmetro Set-Token no response da autenticação", required = true) @HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Este token é recuperado no parâmetro X-CSRF-Token no response da autenticação", required = true) @HeaderParam("X-CSRF-Token") String xCSRFToken);
}

