package br.gov.siscomex.portalunico.dimp.api;

import br.gov.siscomex.portalunico.dimp.model.DuimpUltimosEventosCover;
import br.gov.siscomex.portalunico.dimp.model.RespostaApiErroSefaz;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import javax.validation.constraints.NotNull;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
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
public interface ConsultaAListaDeDuimpComEventosDeInteresseApi {

    /**
     * Consultar a lista de Duimp registradas com eventos de interesse da Sefaz (Eventos de interesse: \&quot;desembaraço\&quot;, \&quot;entrega\&quot;, \&quot;retificação pós-desembaraço\&quot; e \&quot;cancelamento\&quot;)
     *
     * Use esta funcionalidade para recuperar a lista de Duimp que possuem eventos de interesse para a Sefaz em um período&lt;br&gt;Para recuperar os dados completos das Duimps retornadas na lista, utilize um dos serviços da seção \&quot;Consulta aos Dados da Duimp\&quot; 
     *
     */
    @GET
    @Path("/eventos")
    @Produces({"application/json"})
    @ApiOperation(value = "Consultar a lista de Duimp registradas com eventos de interesse da Sefaz (Eventos de interesse: \"desembaraço\", \"entrega\", \"retificação pós-desembaraço\" e \"cancelamento\")", notes = "Use esta funcionalidade para recuperar a lista de Duimp que possuem eventos de interesse para a Sefaz em um período<br>Para recuperar os dados completos das Duimps retornadas na lista, utilize um dos serviços da seção \"Consulta aos Dados da Duimp\" ", tags = {"Consulta a Lista de Duimp com Eventos de Interesse"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = DuimpUltimosEventosCover.class, responseContainer = "List"),
            @ApiResponse(code = 206, message = "Resultado parcial. Utilize o mecanismo de paginação para recuperar mais dados", response = DuimpUltimosEventosCover.class, responseContainer = "List"),
            @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida", response = RespostaApiErroSefaz.class),
            @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso", response = RespostaApiErroSefaz.class),
            @ApiResponse(code = 404, message = "Recurso não encontrado", response = RespostaApiErroSefaz.class),
            @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio", response = RespostaApiErroSefaz.class),
            @ApiResponse(code = 500, message = "Erro interno no servidor", response = RespostaApiErroSefaz.class),
            @ApiResponse(code = 503, message = "Resuisição levou mais tempo do que o esperado. Ocorreu um Timeout durante o acionamento de uma integração necessária para retornar os dados.", response = RespostaApiErroSefaz.class)})
    List<DuimpUltimosEventosCover> obterEventosSefazUsingGET(@NotNull @ApiParam(value = "Data inicial do intervalo de eventos pesquisado<br>Formato: 'AAAA-MM-DD'", required = true) @QueryParam("inicio") String inicio, @NotNull @ApiParam(value = "Data final do intervalo de eventos pesquisado<br>Formato: 'AAAA-MM-DD'<br>Observação: No máximo, 30 dias após data de inicio do período", required = true) @QueryParam("fim") String fim, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token é recuperado no parâmetro Set-Token no response da autenticação", required = true) @HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Este token é recuperado no parâmetro X-CSRF-Token no response da autenticação", required = true) @HeaderParam("X-CSRF-Token") String xCSRFToken, @ApiParam(value = "Código da unidade da RFB para realização do Despacho da Duimp<br>Tamanho: 7<br>Formato: 'NNNNNNN'") @QueryParam("unidade-despacho") String unidadeDespacho, @ApiParam(value = "UF da unidade da RFB para realização do Despacho da Duimp<br>Domínio:<br>AC, AL, AP, AM, BA, CE, DF<br>ES, GO, MA, MT, MS, MG, PA<br>PB, PR, PE, PI, RJ, RN, RS<br>RO, RR, SC, SP, SE, TO<br>Tamanho: 2") @QueryParam("uf-despacho") String ufDespacho, @ApiParam(value = "UF do domicílio do importador<br>Domínio:<br>AC, AL, AP, AM, BA, CE, DF<br>ES, GO, MA, MT, MS, MG, PA<br>PB, PR, PE, PI, RJ, RN, RS<br>RO, RR, SC, SP, SE, TO<br>Tamanho: 2") @QueryParam("uf-importador") String ufImportador, @ApiParam(value = "UF do domicílio do terceiro (adquirente/encomendante)<br>Domínio:<br>AC, AL, AP, AM, BA, CE, DF<br>ES, GO, MA, MT, MS, MG, PA<br>PB, PR, PE, PI, RJ, RN, RS<br>RO, RR, SC, SP, SE, TO<br>Tamanho: 2") @QueryParam("uf-terceiro") String ufTerceiro, @ApiParam(value = "Índice do primeiro elemento.<br>Formato: Inteiro, com até 10 dígitos", defaultValue = "0") @DefaultValue("0") @QueryParam("offset") Integer offset, @ApiParam(value = "Tamanho limite da quantidade de dados retornados.<br>Valor mínimo: 1<br>Valor máximo: 500", defaultValue = "500") @DefaultValue("500") @QueryParam("limit") Integer limit);
}

