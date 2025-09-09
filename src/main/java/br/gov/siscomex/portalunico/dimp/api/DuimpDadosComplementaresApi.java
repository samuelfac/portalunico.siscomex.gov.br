package br.gov.siscomex.portalunico.dimp.api;

import br.gov.siscomex.portalunico.dimp.model.DadoComplementarCargaCover;
import br.gov.siscomex.portalunico.dimp.model.Error;
import br.gov.siscomex.portalunico.dimp.model.RespostaApiErroBalanca;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import javax.ws.rs.DefaultValue;
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
public interface DuimpDadosComplementaresApi {

    /**
     * Recupera as informações dos Dados Complementares das Duimps selecionadas de acordo com os parâmetros informados.
     *
     */
    @GET
    @Path("/duimps/dados-complementares")
    @Produces({"application/json"})
    @ApiOperation(value = "Recupera as informações dos Dados Complementares das Duimps selecionadas de acordo com os parâmetros informados.", notes = "", tags = {"Duimp - Dados Complementares"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = DadoComplementarCargaCover.class, responseContainer = "List"),
            @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio", response = RespostaApiErroBalanca.class),
            @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida", response = RespostaApiErroBalanca.class),
            @ApiResponse(code = 500, message = "Erro interno no servidor", response = RespostaApiErroBalanca.class),
            @ApiResponse(code = 204, message = "Operação realizada com sucesso. Nenhum dado será retornado.", response = DadoComplementarCargaCover.class),
            @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso", response = RespostaApiErroBalanca.class),
            @ApiResponse(code = 206, message = "Resultado parcial. Utilize o mecanismo de paginação para recuperar mais dados", response = DadoComplementarCargaCover.class, responseContainer = "List"),
            @ApiResponse(code = 404, message = "Recurso não encontrado", response = Error.class)})
    List<DadoComplementarCargaCover> obterDadosComplementaresUsingGET(@ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário.<br>Este token é recuperado no parâmetro Set-Token no response da autenticação", required = true) @HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. <br>Este token é recuperado no parâmetro X-CSRF-Token no response da autenticação", required = true) @HeaderParam("X-CSRF-Token") String xCSRFToken, @ApiParam(value = "Identificador único da consulta.<br>O valor deste parâmetro é recuperado no header da primeira página de uma nova busca com filtro. <br>Este atributo é obrigatório para recuperar as próximas páginas da consulta") @QueryParam("id-consulta") String idConsulta, @ApiParam(value = "Deslocamento do primeiro elemento a ser recebido na consulta.<br>O valor padrão é zero, para indicar que se deseja receber o primeiro elemento da consulta, sem qualquer deslocamento<br>Formato: Inteiro, com até 10 dígitos", defaultValue = "0") @DefaultValue("0") @QueryParam("offset") Integer offset, @ApiParam(value = "Tamanho limite da quantidade de dados retornados em uma página.<br>Formato: Inteiro, com até 10 dígitos", defaultValue = "1000") @DefaultValue("1000") @QueryParam("limit") Integer limit);
}

