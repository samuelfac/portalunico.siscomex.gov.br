package br.gov.siscomex.portalunico.dimp.api;

import br.gov.siscomex.portalunico.dimp.model.RespostaApiErroSefaz;
import br.gov.siscomex.portalunico.dimp.model.SefazDuimpDadosGeraisCover;
import br.gov.siscomex.portalunico.dimp.model.SefazDuimpHistEventoCover;
import br.gov.siscomex.portalunico.dimp.model.SefazItemCover;
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
 * Declaração Única de Importação - Nova API da Sefaz
 *
 * <p><h3>Duimp - Declara&ccedil;&atilde;o &Uacute;nica de Importa&ccedil;&atilde;o - Nova API da Sefaz</h3>  <h4>Introdu&ccedil;&atilde;o</h4>  <p>Esta API da Declara&ccedil;&atilde;o &Uacute;nica de Importa&ccedil;&atilde;o (Duimp) , reunir&aacute; os servi&ccedil;os dispon&iacute;veis para as Sefaz.</p>  <p>Atualmente, esta API fornece os seguintes servi&ccedil;os:     <ul>         <li>Consultar a lista de Duimps registradas considerando a exist&ecirc;ncia dos eventos \"desembaraço\", \"entrega\", \"retificação pós-desembaraço\" e \"cancelamento\".</li>         <li>Consultar a lista de Eventos do hist&oacute;rico de opera&ccedil;&otilde;es de uma Duimp</li>         <li>Consultar os dados gerais da vers&atilde;o vigente de uma Duimp registrada (Utilizando a mesma estrutura dos dados gerais da API legada)</li>         <li>Consultar os dados dos itens da vers&atilde;o vigente de uma Duimp registrada com pagina&ccedil;&atilde;o. (Utilizando a mesma estrutura dos dados gerais da API legada)</li>         <li>Consultar os dados gerais da vers&atilde;o especificada de uma Duimp registrada (Utilizando a mesma estrutura dos dados dos itens da API legada)</li>         <li>Consultar os dados dos itens da vers&atilde;o especificada de uma Duimp registrada com pagina&ccedil;&atilde;o. (Utilizando a mesma estrutura dos dados dos itens da API legada)</li>     </ul> </p>  <h4>URLs de Acesso</h4>  <p>Para utilizar os servi&ccedil;os dispon&iacute;veis nessa API deve-se seguir o seguinte padr&atilde;o de URL:</p>  <p><em>https://{ambiente}/{Base URL}/{servi&ccedil;o}</em></p>  <p>Onde:<br> Em <strong>{ambiente}</strong> deve-se utilizar o ambiente desejado de acordo com os ambientes disponíveis na tabela abaixo.<br> Em <strong>{Base URL}</strong> deve-se utilizar o valor de 'Base URL' informado no topo desta página.<br> Em <strong>{serviço}</strong> deve-se utilizar a URI do serviço desejado.<br> </p>  <style type=\"text/css\"> .tg  {border-collapse:collapse;border-color:#bbb;border-spacing:0;width: 604px;} .tg td{background-color:#E0FFEB;border-color:#bbb;border-style:solid;border-width:1px;color:#594F4F;   font-family:Arial, sans-serif;font-size:14px;overflow:hidden;padding:10px 5px;word-break:normal;} .tg th{background-color:#9DE0AD;border-color:#bbb;border-style:solid;border-width:1px;color:#493F3F;   font-family:Arial, sans-serif;font-size:14px;font-weight:normal;overflow:hidden;padding:10px 5px;word-break:normal;} .tg .tg-cabecalho{text-align:left;vertical-align:top;} .tg .tg-corpo{border-color:inherit;text-align:left;vertical-align:top;} </style>  <table class=\"tg\" style=\"width: 100%\"> <thead>   <tr>     <th class=\"tg-cabecalho\"><span style=\"font-weight:bold\">Nome do ambiente</span></th>     <th class=\"tg-cabecalho\"><span style=\"font-weight:bold\">URL de acesso</span></th>  <th class=\"tg-cabecalho\"><span style=\"font-weight:bold\">Público alvo</span></th>   </tr> </thead> <tbody>  <tr>  <td class=\"tg-corpo\">Ambiente de Homologação</td>  <td class=\"tg-corpo\">hom.pucomex.serpro.gov.br</td>  <td class=\"tg-corpo\">Intervenientes públicos (conforme perfil de acesso)</td>  </tr>   <tr>     <td class=\"tg-corpo\">Ambiente de Validação das Empresas</td>     <td class=\"tg-corpo\">val.portalunico.siscomex.gov.br</td>  <td class=\"tg-corpo\">Intervenientes privados</td>   </tr>   <tr>     <td class=\"tg-corpo\">Ambiente de Produção</td>     <td class=\"tg-corpo\">portalunico.siscomex.gov.br</td>  <td class=\"tg-corpo\">Todos os intervenientes (públicos e privados)</td>   </tr> </tbody> </table>  <p>&nbsp;</p>  <p><b>Obs:</b> Todas as operações contam com uma descrição geral da operação abaixo da url, além da descrição resumida exibida ao seu lado.</p>
 *
 */
@Path("/")
@Api(value = "/", description = "")
public interface ConsultaAosDadosDaDuimpApi {

    /**
     * Consultar os dados gerais da versão vigente de uma Duimp registrada.
     * <p>
     * Use esta funcionalidade para recuperar os dados gerais de uma Duimp.&lt;br&gt;Este serviço Utiliza a mesma estrutura dos dados gerais da API legada por questões de compatibilidade.&lt;br&gt;Os dados dos itens podem ser obtidos separadamente no serviço /duimp/{numeroDuimp}/itens)
     *
     */
    @GET
    @Path("/duimp/{numeroDuimp}")
    @Produces({"*/*", "application/json"})
    @ApiOperation(value = "Consultar os dados gerais da versão vigente de uma Duimp registrada.", notes = "Use esta funcionalidade para recuperar os dados gerais de uma Duimp.<br>Este serviço Utiliza a mesma estrutura dos dados gerais da API legada por questões de compatibilidade.<br>Os dados dos itens podem ser obtidos separadamente no serviço /duimp/{numeroDuimp}/itens)", tags = {"Consulta aos Dados da Duimp"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = SefazDuimpDadosGeraisCover.class),
            @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio", response = RespostaApiErroSefaz.class),
            @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida", response = RespostaApiErroSefaz.class),
            @ApiResponse(code = 500, message = "Erro interno no servidor", response = RespostaApiErroSefaz.class),
            @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso", response = RespostaApiErroSefaz.class),
            @ApiResponse(code = 206, message = "Resultado parcial. Utilize o mecanismo de paginação para recuperar mais dados", response = SefazDuimpDadosGeraisCover.class),
            @ApiResponse(code = 404, message = "Recurso não encontrado", response = RespostaApiErroSefaz.class),
            @ApiResponse(code = 503, message = "Resuisição levou mais tempo do que o esperado. Ocorreu um Timeout durante o acionamento de uma integração necessária para retornar os dados.", response = RespostaApiErroSefaz.class)})
    SefazDuimpDadosGeraisCover obter01DadosDuimpVigenteUsingGET(@ApiParam(value = "Número da Duimp<br>Tamanho: 15<br>Formato: 'NNAANNNNNNNNNNN'<br>Lei de formação. O número da Duimp é composto por: <br>* NN = Corresponde ao ano do registro da Declaração. <br>* AA = Corresponde à sigla do país de emissão do documento (BR).<br>* NNNNNNNNNN = 10 caracteres numéricos. Número sequencial da Duimp dentro do ano.<br>* N = 1 caracter numérico. DV para todos os demais caracteres numéricos (Módulo 11)", required = true) @PathParam("numeroDuimp") String numeroDuimp, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token é recuperado no parâmetro Set-Token no response da autenticação", required = true) @HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Este token é recuperado no parâmetro X-CSRF-Token no response da autenticação", required = true) @HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * Consultar os dados gerais da versão especificada de uma Duimp registrada.
     * <p>
     * Use esta funcionalidade para recuperar os dados gerais de uma versão específica de Duimp.&lt;br&gt;Este serviço Utiliza a mesma estrutura dos dados gerais da API legada por questões de compatibilidade.&lt;br&gt;Os dados dos itens podem ser obtidos separadamente no serviço /duimp/{numeroDuimp}/{versaoDuimp}/itens)
     *
     */
    @GET
    @Path("/duimp/{numeroDuimp}/{versaoDuimp}")
    @Produces({"*/*", "application/json"})
    @ApiOperation(value = "Consultar os dados gerais da versão especificada de uma Duimp registrada.", notes = "Use esta funcionalidade para recuperar os dados gerais de uma versão específica de Duimp.<br>Este serviço Utiliza a mesma estrutura dos dados gerais da API legada por questões de compatibilidade.<br>Os dados dos itens podem ser obtidos separadamente no serviço /duimp/{numeroDuimp}/{versaoDuimp}/itens)", tags = {"Consulta aos Dados da Duimp"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = SefazDuimpDadosGeraisCover.class),
            @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio", response = RespostaApiErroSefaz.class),
            @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida", response = RespostaApiErroSefaz.class),
            @ApiResponse(code = 500, message = "Erro interno no servidor", response = RespostaApiErroSefaz.class),
            @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso", response = RespostaApiErroSefaz.class),
            @ApiResponse(code = 206, message = "Resultado parcial. Utilize o mecanismo de paginação para recuperar mais dados", response = SefazDuimpDadosGeraisCover.class),
            @ApiResponse(code = 404, message = "Recurso não encontrado", response = RespostaApiErroSefaz.class),
            @ApiResponse(code = 503, message = "Resuisição levou mais tempo do que o esperado. Ocorreu um Timeout durante o acionamento de uma integração necessária para retornar os dados.", response = RespostaApiErroSefaz.class)})
    SefazDuimpDadosGeraisCover obter02DadosDuimpVersaoUsingGET(@ApiParam(value = "Número da Duimp<br>Tamanho: 15<br>Formato: 'NNAANNNNNNNNNNN'<br>Lei de formação. O número da Duimp é composto por: <br>* NN = Corresponde ao ano do registro da Declaração. <br>* AA = Corresponde à sigla do país de emissão do documento (BR).<br>* NNNNNNNNNN = 10 caracteres numéricos. Número sequencial da Duimp dentro do ano.<br>* N = 1 caracter numérico. DV para todos os demais caracteres numéricos (Módulo 11)", required = true) @PathParam("numeroDuimp") String numeroDuimp, @ApiParam(value = "Versão da Duimp<br>Tamanho: 4<br>Valor mínimo: 0001<br>Valor máximo: 9999", required = true) @PathParam("versaoDuimp") Integer versaoDuimp, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token é recuperado no parâmetro Set-Token no response da autenticação", required = true) @HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Este token é recuperado no parâmetro X-CSRF-Token no response da autenticação", required = true) @HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * Consultar os dados dos itens da versão vigente de uma Duimp registrada.
     * <p>
     * Use esta funcionalidade para recuperar os dados dos itens da versão vigente de uma Duimp.&lt;br&gt;Este serviço Utiliza a mesma estrutura dos dados do item da API legada por questões de compatibilidade.&lt;br&gt;
     *
     */
    @GET
    @Path("/duimp/{numeroDuimp}/itens")
    @Produces({"*/*", "application/json"})
    @ApiOperation(value = "Consultar os dados dos itens da versão vigente de uma Duimp registrada.", notes = "Use esta funcionalidade para recuperar os dados dos itens da versão vigente de uma Duimp.<br>Este serviço Utiliza a mesma estrutura dos dados do item da API legada por questões de compatibilidade.<br>", tags = {"Consulta aos Dados da Duimp"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = SefazItemCover.class, responseContainer = "List"),
            @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio", response = RespostaApiErroSefaz.class),
            @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida", response = RespostaApiErroSefaz.class),
            @ApiResponse(code = 500, message = "Erro interno no servidor", response = RespostaApiErroSefaz.class),
            @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso", response = RespostaApiErroSefaz.class),
            @ApiResponse(code = 206, message = "Resultado parcial. Utilize o mecanismo de paginação para recuperar mais dados", response = SefazItemCover.class, responseContainer = "List"),
            @ApiResponse(code = 404, message = "Recurso não encontrado", response = RespostaApiErroSefaz.class),
            @ApiResponse(code = 503, message = "Resuisição levou mais tempo do que o esperado. Ocorreu um Timeout durante o acionamento de uma integração necessária para retornar os dados.", response = RespostaApiErroSefaz.class)})
    List<SefazItemCover> obter03ItensDuimpUsingGET(@ApiParam(value = "Número da Duimp<br>Tamanho: 15<br>Formato: 'NNAANNNNNNNNNNN'<br>Lei de formação. O número da Duimp é composto por: <br>* NN = Corresponde ao ano do registro da Declaração. <br>* AA = Corresponde à sigla do país de emissão do documento (BR).<br>* NNNNNNNNNN = 10 caracteres numéricos. Número sequencial da Duimp dentro do ano.<br>* N = 1 caracter numérico. DV para todos os demais caracteres numéricos (Módulo 11)", required = true) @PathParam("numeroDuimp") String numeroDuimp, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token é recuperado no parâmetro Set-Token no response da autenticação", required = true) @HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Este token é recuperado no parâmetro X-CSRF-Token no response da autenticação", required = true) @HeaderParam("X-CSRF-Token") String xCSRFToken, @ApiParam(value = "Índice do primeiro elemento.<br>Formato: Inteiro, com até 10 dígitos", defaultValue = "0") @DefaultValue("0") @QueryParam("offset") Integer offset, @ApiParam(value = "Tamanho limite da quantidade de dados retornados.<br>Valor mínimo: 1<br>Valor máximo: 500", defaultValue = "100") @DefaultValue("100") @QueryParam("limit") Integer limit);

    /**
     * Consultar os dados dos itens da versão especificada de uma Duimp registrada
     * <p>
     * Use esta funcionalidade para recuperar os dados dos itens de uma versão específica de Duimp.&lt;br&gt;Este serviço Utiliza a mesma estrutura dos dados do item da API legada por questões de compatibilidade.&lt;br&gt;
     *
     */
    @GET
    @Path("/duimp/{numeroDuimp}/{versaoDuimp}/itens")
    @Produces({"*/*", "application/json"})
    @ApiOperation(value = "Consultar os dados dos itens da versão especificada de uma Duimp registrada", notes = "Use esta funcionalidade para recuperar os dados dos itens de uma versão específica de Duimp.<br>Este serviço Utiliza a mesma estrutura dos dados do item da API legada por questões de compatibilidade.<br>", tags = {"Consulta aos Dados da Duimp"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = SefazItemCover.class, responseContainer = "List"),
            @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio", response = RespostaApiErroSefaz.class),
            @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida", response = RespostaApiErroSefaz.class),
            @ApiResponse(code = 500, message = "Erro interno no servidor", response = RespostaApiErroSefaz.class),
            @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso", response = RespostaApiErroSefaz.class),
            @ApiResponse(code = 206, message = "Resultado parcial. Utilize o mecanismo de paginação para recuperar mais dados", response = SefazItemCover.class, responseContainer = "List"),
            @ApiResponse(code = 404, message = "Recurso não encontrado", response = RespostaApiErroSefaz.class),
            @ApiResponse(code = 503, message = "Resuisição levou mais tempo do que o esperado. Ocorreu um Timeout durante o acionamento de uma integração necessária para retornar os dados.", response = RespostaApiErroSefaz.class)})
    List<SefazItemCover> obter04ItensDuimpVersaoUsingGET(@ApiParam(value = "Número da Duimp<br>Tamanho: 15<br>Formato: 'NNAANNNNNNNNNNN'<br>Lei de formação. O número da Duimp é composto por: <br>* NN = Corresponde ao ano do registro da Declaração. <br>* AA = Corresponde à sigla do país de emissão do documento (BR).<br>* NNNNNNNNNN = 10 caracteres numéricos. Número sequencial da Duimp dentro do ano.<br>* N = 1 caracter numérico. DV para todos os demais caracteres numéricos (Módulo 11)", required = true) @PathParam("numeroDuimp") String numeroDuimp, @ApiParam(value = "Versão da Duimp<br>Tamanho: 4<br>Valor mínimo: 0001<br>Valor máximo: 9999", required = true) @PathParam("versaoDuimp") Integer versaoDuimp, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token é recuperado no parâmetro Set-Token no response da autenticação", required = true) @HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Este token é recuperado no parâmetro X-CSRF-Token no response da autenticação", required = true) @HeaderParam("X-CSRF-Token") String xCSRFToken, @ApiParam(value = "Índice do primeiro elemento.<br>Formato: Inteiro, com até 10 dígitos", defaultValue = "0") @DefaultValue("0") @QueryParam("offset") Integer offset, @ApiParam(value = "Tamanho limite da quantidade de dados retornados.<br>Valor mínimo: 1<br>Valor máximo: 500", defaultValue = "100") @DefaultValue("100") @QueryParam("limit") Integer limit);

    /**
     * Consultar a lista de Eventos do histórico de operações de uma Duimp registrada.
     * <p>
     * Use esta funcionalidade para recuperar apenas a lista de eventos do histórico de uma Duimp registrada.&lt;br&gt;Este serviço Utiliza a mesma estrutura dos dados do bloco &#39;itensHistorico&#39; dos dados gerais da API legada por questões de compatibilidade.&lt;br&gt;
     *
     */
    @GET
    @Path("/duimp/{numeroDuimp}/historico")
    @Produces({"*/*", "application/json"})
    @ApiOperation(value = "Consultar a lista de Eventos do histórico de operações de uma Duimp registrada.", notes = "Use esta funcionalidade para recuperar apenas a lista de eventos do histórico de uma Duimp registrada.<br>Este serviço Utiliza a mesma estrutura dos dados do bloco 'itensHistorico' dos dados gerais da API legada por questões de compatibilidade.<br>", tags = {"Consulta aos Dados da Duimp"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = SefazDuimpHistEventoCover.class, responseContainer = "List"),
            @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio", response = RespostaApiErroSefaz.class),
            @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida", response = RespostaApiErroSefaz.class),
            @ApiResponse(code = 500, message = "Erro interno no servidor", response = RespostaApiErroSefaz.class),
            @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso", response = RespostaApiErroSefaz.class),
            @ApiResponse(code = 206, message = "Resultado parcial. Utilize o mecanismo de paginação para recuperar mais dados", response = SefazDuimpHistEventoCover.class, responseContainer = "List"),
            @ApiResponse(code = 404, message = "Recurso não encontrado", response = RespostaApiErroSefaz.class),
            @ApiResponse(code = 503, message = "Resuisição levou mais tempo do que o esperado. Ocorreu um Timeout durante o acionamento de uma integração necessária para retornar os dados.", response = RespostaApiErroSefaz.class)})
    List<SefazDuimpHistEventoCover> obter05HistoricoEventosDuimpVersaoUsingGET(@ApiParam(value = "Número da Duimp<br>Tamanho: 15<br>Formato: 'NNAANNNNNNNNNNN'<br>Lei de formação. O número da Duimp é composto por: <br>* NN = Corresponde ao ano do registro da Declaração. <br>* AA = Corresponde à sigla do país de emissão do documento (BR).<br>* NNNNNNNNNN = 10 caracteres numéricos. Número sequencial da Duimp dentro do ano.<br>* N = 1 caracter numérico. DV para todos os demais caracteres numéricos (Módulo 11)", required = true) @PathParam("numeroDuimp") String numeroDuimp, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token é recuperado no parâmetro Set-Token no response da autenticação", required = true) @HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Este token é recuperado no parâmetro X-CSRF-Token no response da autenticação", required = true) @HeaderParam("X-CSRF-Token") String xCSRFToken, @ApiParam(value = "Índice do primeiro elemento.<br>Formato: Inteiro, com até 10 dígitos", defaultValue = "0") @DefaultValue("0") @QueryParam("offset") Integer offset, @ApiParam(value = "Tamanho limite da quantidade de dados retornados.<br>Valor mínimo: 1<br>Valor máximo: 500", defaultValue = "500") @DefaultValue("500") @QueryParam("limit") Integer limit);
}

