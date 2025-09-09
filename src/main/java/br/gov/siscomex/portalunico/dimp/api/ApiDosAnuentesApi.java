package br.gov.siscomex.portalunico.dimp.api;

import br.gov.siscomex.portalunico.dimp.model.DuimpConsultaCoverApiAnuente;
import br.gov.siscomex.portalunico.dimp.model.InformacoesVersaoVigenteCover;
import br.gov.siscomex.portalunico.dimp.model.ItemConsultaCoverApiAnuente;
import br.gov.siscomex.portalunico.dimp.model.RespostaApiErro;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import java.util.List;

/**
 * Declaração Única de Importação - API dos Órgãos Anuentes
 *
 * <p><h4>URLs de Acesso</h4><p>Para utilizar os servi&ccedil;os dispon&iacute;veis nessa API deve-se seguir o seguinte padr&atilde;o de URL:</p>  <p><em>https://{ambiente}/duimp-api/api/ext/{servi&ccedil;o}</em></p>  <p>Onde:<br> Em <strong>{ambiente}</strong> deve-se informar o ambiente desejado dentre os ambientes dispon&iacute;veis na tabela abaixo.<br> Em <strong>{servi&ccedil;o}</strong> utilizar a URI do servi&ccedil;o desejado.</p>  <style type=\"text/css\"> .tg  {border-collapse:collapse;border-color:#bbb;border-spacing:0;width: 604px;} .tg td{background-color:#E0FFEB;border-color:#bbb;border-style:solid;border-width:1px;color:#594F4F;   font-family:Arial, sans-serif;font-size:14px;overflow:hidden;padding:10px 5px;word-break:normal;} .tg th{background-color:#9DE0AD;border-color:#bbb;border-style:solid;border-width:1px;color:#493F3F;   font-family:Arial, sans-serif;font-size:14px;font-weight:normal;overflow:hidden;padding:10px 5px;word-break:normal;} .tg .tg-cabecalho{text-align:left;vertical-align:top;} .tg .tg-corpo{border-color:inherit;text-align:left;vertical-align:top;} </style>  <table class=\"tg\" style=\"width: 100%;\"> <thead>   <tr>     <th class=\"tg-cabecalho\"><span style=\"font-weight:bold\">Nome do ambiente</span></th>     <th class=\"tg-cabecalho\"><span style=\"font-weight:bold\">URL de acesso</span></th>   <th class=\"tg-cabecalho\"><span style=\"font-weight:bold\">Público alvo</span></th>     </tr> </thead> <tbody>   <tr>     <td class=\"tg-corpo\">Ambiente de Homologa&ccedil;&atilde;o</td>     <td class=\"tg-corpo\">hom.pucomex.serpro.gov.br</td>   <td class=\"tg-corpo\">Intervenientes p&uacute;blicos (conforme perfil de acesso)</td>     </tr><tr>     <td class=\"tg-corpo\">Ambiente de Valida&ccedil;&atilde;o das Empresas</td>     <td class=\"tg-corpo\">val.portalunico.siscomex.gov.br</td>   <td class=\"tg-corpo\">Intervenientes privados</td>     </tr>   <tr>     <td class=\"tg-corpo\">Ambiente de Produ&ccedil;&atilde;o</td>     <td class=\"tg-corpo\">portalunico.siscomex.gov.br</td>   <td class=\"tg-corpo\">Todos os intervenientes (p&uacute;blicos e privados)</td>     </tr> </tbody> </table>  <p>&nbsp;</p>  <p><strong>Exemplo:</strong> Para o servi&ccedil;o &quot;Consulta dos dados gerais da vers&atilde;o vigente de uma Duimp&quot; a URI &eacute; &quot;ext/duimp/{numero}/{versao}&quot;.</p>  <p>Logo, abaixo temos um exemplo de URL completa considerando o ambiente de Valida&ccedil;&atilde;o, consumindo este servi&ccedil;o</p>  <p><em>https://val.portalunico.siscomex.gov.br/duimp-api/api/ext/duimp/20BR00001001899/1</em></p>  <h4>As opera&ccedil;&otilde;es dispon&iacute;veis na API para os Org&atilde;os anuentes s&atilde;o:</h4>  <li>Consultar os dados gerais de uma Duimp j&aacute; registrada.</li>  <li>Consultar os dados de um item de uma Duimp j&aacute; registrada</li><li>Consultar os dados de uma faixa de itens de uma Duimp j&aacute; registrada</li>  <li>Consultar a vers&atilde;o vigente de uma Duimp j&aacute; registrada</li>  </ul>    <p><b>Obs:</b> Todas as opera&ccedil;&otilde;es contam com uma descri&ccedil;&atilde;o geral da opera&ccedil;&atilde;o abaixo da url, al&eacute;m da descri&ccedil;&atilde;o resumida exibida ao seu lado.</p>
 *
 */
@Path("/")
@Api(value = "/", description = "")
public interface ApiDosAnuentesApi {

    /**
     * Consultar os dados gerais da Duimp já registrada.
     * <p>
     * Use esta funcionalidade para recuperar os dados gerais de uma versão de Duimp que já foi registrada.
     *
     */
    @GET
    @Path("/anuentes/duimp/{numero-duimp}/{versao-duimp}")
    @Produces({"application/json"})
    @ApiOperation(value = "Consultar os dados gerais da Duimp já registrada.", notes = "Use esta funcionalidade para recuperar os dados gerais de uma versão de Duimp que já foi registrada.", tags = {"API dos Anuentes"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = DuimpConsultaCoverApiAnuente.class),
            @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio", response = RespostaApiErro.class),
            @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
            @ApiResponse(code = 500, message = "Erro interno no servidor"),
            @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
            @ApiResponse(code = 404, message = "Recurso não encontrado")})
    DuimpConsultaCoverApiAnuente consultarDuimpDadosGeraisApiAnuente(@ApiParam(value = "Número da Duimp.<br>Tamanho: 15<br>Formato: 'AABRSSSSSSSSSSD'<br>Lei de formação. O número da Duimp é composto por: <br>* AA = Corresponde ao ano do registro da Declaração. <br>* BR = Corresponde à sigla do país de emissão do documento (BR).<br>* SSSSSSSSSS = 10 caracteres numéricos. Número sequencial da Duimp dentro do ano.<br>* D = 1 caracter numérico. DV para todos os demais caracteres numéricos (Módulo 11)", required = true) @PathParam("numero-duimp") String numeroDuimp, @ApiParam(value = "Versão vigente da Duimp.<br>Valor mínimo: 1<br>Valor máximo: 9999", required = true) @PathParam("versao-duimp") Object versaoDuimp, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token é recuperado no parâmetro Set-Token no response da autenticação", required = true) @HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Este token é recuperado no parâmetro X-CSRF-Token no response da autenticação", required = true) @HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * Consultar os dados de um item da Duimp já registrada.
     * <p>
     * Use esta funcionalidade para recuperar os dados de um item específico de uma versão de Duimp que já foi registrada.
     *
     */
    @GET
    @Path("/anuentes/duimp/{numero-duimp}/{versao-duimp}/itens/{numero-item}")
    @Produces({"application/json"})
    @ApiOperation(value = "Consultar os dados de um item da Duimp já registrada.", notes = "Use esta funcionalidade para recuperar os dados de um item específico de uma versão de Duimp que já foi registrada.", tags = {"API dos Anuentes"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = ItemConsultaCoverApiAnuente.class),
            @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio", response = RespostaApiErro.class),
            @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
            @ApiResponse(code = 500, message = "Erro interno no servidor"),
            @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
            @ApiResponse(code = 404, message = "Recurso não encontrado")})
    ItemConsultaCoverApiAnuente consultarItemDuimp1(@ApiParam(value = "Número da Duimp.<br>Tamanho: 15<br>Formato: 'AABRSSSSSSSSSSD'<br>Lei de formação. O número da Duimp é composto por: <br>* AA = Corresponde ao ano do registro da Declaração. <br>* BR = Corresponde à sigla do país de emissão do documento (BR).<br>* SSSSSSSSSS = 10 caracteres numéricos. Número sequencial da Duimp dentro do ano.<br>* D = 1 caracter numérico. DV para todos os demais caracteres numéricos (Módulo 11)", required = true) @PathParam("numero-duimp") String numeroDuimp, @ApiParam(value = "Versão vigente da Duimp.<br>Valor mínimo: 1<br>Valor máximo: 9999", required = true) @PathParam("versao-duimp") Object versaoDuimp, @ApiParam(value = "Número do item da Duimp.<br>Formato: Inteiro, com até 5 dígitos", required = true) @PathParam("numero-item") Object numeroItem, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token é recuperado no parâmetro Set-Token no response da autenticação", required = true) @HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Este token é recuperado no parâmetro X-CSRF-Token no response da autenticação", required = true) @HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * Consultar os dados de uma faixa de itens da Duimp já registrada.
     * <p>
     * Use esta funcionalidade para recuperar os dados de uma faixa de itens de uma versão de Duimp que já foi registrada.&lt;br&gt;O parâmetro \&quot;inicial\&quot; é utilizado para informar o número do item inicial e o parâmetro \&quot;tamanho\&quot; para informar a quantidade máxima de itens que pode ser retornado. O valor máximo para este parâmetro é &lt;b&gt;100&lt;/b&gt;. &lt;br&gt;Se os parâmetros \&quot;inicial\&quot; e \&quot;tamanho\&quot; não forem informados, os valores 1 e 100 serão utilizados respectivamente.
     *
     */
    @GET
    @Path("/anuentes/duimp/{numero-duimp}/{versao-duimp}/itens")
    @Produces({"application/json"})
    @ApiOperation(value = "Consultar os dados de uma faixa de itens da Duimp já registrada.", notes = "Use esta funcionalidade para recuperar os dados de uma faixa de itens de uma versão de Duimp que já foi registrada.<br>O parâmetro \"inicial\" é utilizado para informar o número do item inicial e o parâmetro \"tamanho\" para informar a quantidade máxima de itens que pode ser retornado. O valor máximo para este parâmetro é <b>100</b>. <br>Se os parâmetros \"inicial\" e \"tamanho\" não forem informados, os valores 1 e 100 serão utilizados respectivamente.", tags = {"API dos Anuentes"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = ItemConsultaCoverApiAnuente.class, responseContainer = "List"),
            @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio", response = RespostaApiErro.class),
            @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
            @ApiResponse(code = 500, message = "Erro interno no servidor"),
            @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
            @ApiResponse(code = 404, message = "Recurso não encontrado")})
    List<ItemConsultaCoverApiAnuente> consultarItensDuimp1(@ApiParam(value = "Número da Duimp.<br>Tamanho: 15<br>Formato: 'AABRSSSSSSSSSSD'<br>Lei de formação. O número da Duimp é composto por: <br>* AA = Corresponde ao ano do registro da Declaração. <br>* BR = Corresponde à sigla do país de emissão do documento (BR).<br>* SSSSSSSSSS = 10 caracteres numéricos. Número sequencial da Duimp dentro do ano.<br>* D = 1 caracter numérico. DV para todos os demais caracteres numéricos (Módulo 11)", required = true) @PathParam("numero-duimp") String numeroDuimp, @ApiParam(value = "Versão vigente da Duimp.<br>Valor mínimo: 1<br>Valor máximo: 9999", required = true) @PathParam("versao-duimp") Object versaoDuimp, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token é recuperado no parâmetro Set-Token no response da autenticação", required = true) @HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Este token é recuperado no parâmetro X-CSRF-Token no response da autenticação", required = true) @HeaderParam("X-CSRF-Token") String xCSRFToken, @ApiParam(value = "Número do primeiro item da Duimp que será retornado na relação de itens.<br>Valor mínimo: 1<br>Valor máximo: 99999", defaultValue = "1") @DefaultValue("1") @QueryParam("inicial") Object inicial, @ApiParam(value = "Quantidade máxima de itens que pode ser retornada.<br>Valor mínimo: 1<br>Valor máximo: 100", defaultValue = "100") @DefaultValue("100") @QueryParam("tamanho") Object tamanho);

    /**
     * Consultar a versão vigente de uma Duimp.
     * <p>
     * Use esta funcionalidade para recuperar a versão registrada de uma Duimp que é considerada a versão vigente atualmente.&lt;br&gt; Versões de rascunho ou de retificações em elaboração não são consideradas vigentes e não são retornadas neste serviço
     *
     */
    @GET
    @Path("/anuentes/duimp/{numero-duimp}/versoes")
    @Produces({"application/json"})
    @ApiOperation(value = "Consultar a versão vigente de uma Duimp.", notes = "Use esta funcionalidade para recuperar a versão registrada de uma Duimp que é considerada a versão vigente atualmente.<br> Versões de rascunho ou de retificações em elaboração não são consideradas vigentes e não são retornadas neste serviço", tags = {"API dos Anuentes"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = InformacoesVersaoVigenteCover.class),
            @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio", response = RespostaApiErro.class),
            @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
            @ApiResponse(code = 500, message = "Erro interno no servidor"),
            @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
            @ApiResponse(code = 404, message = "Recurso não encontrado")})
    InformacoesVersaoVigenteCover recuperarVersaoDuimpVigente1(@ApiParam(value = "Número da Duimp.<br>Tamanho: 15<br>Formato: 'AABRSSSSSSSSSSD'<br>Lei de formação. O número da Duimp é composto por: <br>* AA = Corresponde ao ano do registro da Declaração. <br>* BR = Corresponde à sigla do país de emissão do documento (BR).<br>* SSSSSSSSSS = 10 caracteres numéricos. Número sequencial da Duimp dentro do ano.<br>* D = 1 caracter numérico. DV para todos os demais caracteres numéricos (Módulo 11)", required = true) @PathParam("numero-duimp") String numeroDuimp, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token é recuperado no parâmetro Set-Token no response da autenticação", required = true) @HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Este token é recuperado no parâmetro X-CSRF-Token no response da autenticação", required = true) @HeaderParam("X-CSRF-Token") String xCSRFToken);
}

