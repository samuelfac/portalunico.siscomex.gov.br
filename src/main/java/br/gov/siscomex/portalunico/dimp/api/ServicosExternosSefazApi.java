package br.gov.siscomex.portalunico.dimp.api;

import br.gov.siscomex.portalunico.dimp.model.RespostaApiErroSefaz;
import br.gov.siscomex.portalunico.dimp.model.SefazDuimpCover;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

/**
 * Declaração Única de Importação - SEFAZ (Legada)
 *
 * <p><h3>Duimp - Declara&ccedil;&atilde;o &Uacute;nica de Importa&ccedil;&atilde;o</h3><h4>Introdu&ccedil;&atilde;o</h4><p>Bem-vindo &agrave; API do sistema Pucomex - Declaração Única de Importação .</p><p>A Declara&ccedil;&atilde;o &Uacute;nica de Importa&ccedil;&atilde;o (Duimp) , reunir&aacute; todas as informa&ccedil;&otilde;es de natureza aduaneira, administrativa, comercial, financeira, tribut&aacute;ria e fiscal pertinentes ao controle das importa&ccedil;&otilde;es pelos &oacute;rg&atilde;os competentes da Administra&ccedil;&atilde;o P&uacute;blica brasileira na execu&ccedil;&atilde;o de suas atribui&ccedil;&otilde;es legais.</p><p>O processo eliminar&aacute; diversas redund&acirc;ncias presentes no fluxo atual e permitir&aacute; a visualiza&ccedil;&atilde;o da integralidade da opera&ccedil;&atilde;o tanto pelo operador privado como pelos &oacute;rg&atilde;os governamentais.</p><p>Outro importante avan&ccedil;o &eacute; a flexibiliza&ccedil;&atilde;o, em rela&ccedil;&atilde;o ao modelo atual, do momento de presta&ccedil;&atilde;o das informa&ccedil;&otilde;es pelo importador. Respeitando determinados marcos temporais, o importador ter&aacute; maior dom&iacute;nio sobre o fluxo de informa&ccedil;&otilde;es e dos procedimentos relacionados &agrave; sua opera&ccedil;&atilde;o, podendo optar pelo momento mais oportuno para prest&aacute;-las &agrave; Administra&ccedil;&atilde;o e determinando, assim, a movimenta&ccedil;&atilde;o de seu processo.</p><h4>URLs de Acesso</h4><p>Para utilizar os servi&ccedil;os dispon&iacute;veis nessa API deve-se seguir o seguinte padr&atilde;o de URL:</p><p><em>https://{ambiente}/{Base URL}/{servi&ccedil;o}</em></p><p>Onde:<br> Em <strong>{ambiente}</strong> deve-se utilizar o ambiente desejado de acordo com os ambientes dispon&iacute;veis na tabela abaixo.<br> Em <strong>{Base URL}</strong> deve-se utilizar o valor de 'Base URL' informado no topo desta página.<br> Em <strong>{servi&ccedil;o}</strong> deve-se utilizar a URI do servi&ccedil;o desejado.<br></p><style type=\"text/css\">.tg  {border-collapse:collapse;border-color:#bbb;border-spacing:0;width: 604px;}.tg td{background-color:#E0FFEB;border-color:#bbb;border-style:solid;border-width:1px;color:#594F4F;  font-family:Arial, sans-serif;font-size:14px;overflow:hidden;padding:10px 5px;word-break:normal;}.tg th{background-color:#9DE0AD;border-color:#bbb;border-style:solid;border-width:1px;color:#493F3F;  font-family:Arial, sans-serif;font-size:14px;font-weight:normal;overflow:hidden;padding:10px 5px;word-break:normal;}.tg .tg-cabecalho{text-align:left;vertical-align:top}.tg .tg-corpo{border-color:inherit;text-align:left;vertical-align:top}</style><table class=\"tg\" style=\"width: 100%;\"><thead>  <tr>    <th class=\"tg-cabecalho\"><span style=\"font-weight:bold\">Nome do ambiente</span></th>    <th class=\"tg-cabecalho\"><span style=\"font-weight:bold\">URL de acesso</span></th>    <th class=\"tg-cabecalho\"><span style=\"font-weight:bold\">Público alvo</span></th>  </tr></thead><tbody>  <tr>    <td class=\"tg-corpo\">Ambiente de Homologação</td>    <td class=\"tg-corpo\">hom.pucomex.serpro.gov.br</td>    <td class=\"tg-corpo\">Intervenientes públicos (conforme perfil de acesso)</td>  </tr>  <tr>    <td class=\"tg-corpo\">Ambiente de Validação da Empresas</td>    <td class=\"tg-corpo\">val.portalunico.siscomex.gov.br</td>    <td class=\"tg-corpo\">Intervenientes privados</td>  </tr>  <tr>    <td class=\"tg-corpo\">Ambiente de Produção</td>    <td class=\"tg-corpo\">portalunico.siscomex.gov.br</td>    <td class=\"tg-corpo\">Todos os intervenientes (públicos e privados)</td>  </tr></tbody></table><p>&nbsp;</p><p><strong>Exemplo:</strong> Para o servi&ccedil;o \"Consulta dos dados da versão vigente de uma Duimp\" a URI &eacute; \"ext/sefaz/duimp/{numero}\".</p><p>Logo, abaixo temos um exemplo de URL completa considerando o ambiente de Valida&ccedil;&atilde;o, consumindo este servi&ccedil;o </p><p><em>https://val.portalunico.siscomex.gov.br/duimp/api/ext/sefaz/duimp/20BR00001001899</em></p>
 *
 */
@Path("/")
@Api(value = "/", description = "")
public interface ServicosExternosSefazApi {

    /**
     * Consultar os dados de uma versão especificada de uma DUIMP registrada.
     *
     * Use esta funcionalidade para consultar os dados completos (dados gerais e itens) de uma versão específica de uma Duimp registrada.
     *
     */
    @GET
    @Path("/sefaz/duimp/{numeroDuimp}/{versaoDuimp}")
    @Produces({"application/json"})
    @ApiOperation(value = "Consultar os dados de uma versão especificada de uma DUIMP registrada.", notes = "Use esta funcionalidade para consultar os dados completos (dados gerais e itens) de uma versão específica de uma Duimp registrada.", tags = {"Servicos Externos  Sefaz"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = SefazDuimpCover.class),
            @ApiResponse(code = 400, message = "Requisição mal formatada."),
            @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
            @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
            @ApiResponse(code = 404, message = "Recurso não encontrado"),
            @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio", response = RespostaApiErroSefaz.class),
            @ApiResponse(code = 500, message = "Erro interno no servidor")})
    SefazDuimpCover consultarDuimp3(@ApiParam(value = "Número da Duimp<br>Tamanho: 15<br>Formato: 'NNAANNNNNNNNNNN'<br>Lei de formação. O número da Duimp é composto por: <br>* NN = Corresponde ao ano do registro da Declaração. <br>* AA = Corresponde à sigla do país de emissão do documento (BR).<br>* NNNNNNNNNN = 10 caracteres numéricos. Número sequencial da Duimp dentro do ano.<br>* N = 1 caracter numérico. DV para todos os demais caracteres numéricos (Módulo 11)", required = true) @PathParam("numeroDuimp") String numeroDuimp, @ApiParam(value = "Versão da Duimp<br>Valor mínimo: 1<br>Valor máximo: 9999", required = true) @PathParam("versaoDuimp") String versaoDuimp, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token é recuperado no parâmetro Set-Token no response da autenticação", required = true) @HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Este token é recuperado no parâmetro X-CSRF-Token no response da autenticação", required = true) @HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * Consultar os dados da versão vigente de uma DUIMP registrada.
     *
     * Use esta funcionalidade para consultar os dados completos (dados gerais e itens) da versão vigente de uma Duimp registrada.
     *
     */
    @GET
    @Path("/sefaz/duimp/{numeroDuimp}")
    @Produces({"application/json"})
    @ApiOperation(value = "Consultar os dados da versão vigente de uma DUIMP registrada.", notes = "Use esta funcionalidade para consultar os dados completos (dados gerais e itens) da versão vigente de uma Duimp registrada.", tags = {"Servicos Externos  Sefaz"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = SefazDuimpCover.class),
            @ApiResponse(code = 400, message = "Requisição mal formatada."),
            @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
            @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
            @ApiResponse(code = 404, message = "Recurso não encontrado"),
            @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio", response = RespostaApiErroSefaz.class),
            @ApiResponse(code = 500, message = "Erro interno no servidor")})
    SefazDuimpCover consultarDuimp4(@ApiParam(value = "Número da Duimp<br>Tamanho: 15<br>Formato: 'NNAANNNNNNNNNNN'<br>Lei de formação. O número da Duimp é composto por: <br>* NN = Corresponde ao ano do registro da Declaração. <br>* AA = Corresponde à sigla do país de emissão do documento (BR).<br>* NNNNNNNNNN = 10 caracteres numéricos. Número sequencial da Duimp dentro do ano.<br>* N = 1 caracter numérico. DV para todos os demais caracteres numéricos (Módulo 11)", required = true) @PathParam("numeroDuimp") String numeroDuimp, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token é recuperado no parâmetro Set-Token no response da autenticação", required = true) @HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Este token é recuperado no parâmetro X-CSRF-Token no response da autenticação", required = true) @HeaderParam("X-CSRF-Token") String xCSRFToken);
}

