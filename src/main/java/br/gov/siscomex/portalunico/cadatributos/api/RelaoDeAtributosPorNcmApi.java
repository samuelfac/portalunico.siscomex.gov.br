package br.gov.siscomex.portalunico.cadatributos.api;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;
import java.util.List;

/**
 * Cadastro de Atributos
 *
 * <p><h3>CADA - Cadastro de Atributos</h3><h4>Introdu&ccedil;&atilde;o</h4>  <style>  ul.elementos {  list-style-type: square;  }  </style>  <p>Bem-vindo &#xE0; API do sistema Cadastro de Atributos.</p>  <p>O <strong>Cadastro de Atributos</strong> define a estrutura dos atributos configurados pelos &#xF3;rg&#xE3;os anuentes para  compor as declara&#xE7;&#xF5;es de com&#xE9;rcio exterior. Dependendo do seu objetivo, um atributo pode ser  vinculado a um dos seguintes elementos: </p>  <ul class=\"elementos\">  <li>  <strong>C&#xF3;digo NCM (Nomenclatura Comum do Mercosul):</strong> S&#xE3;o vinculados atributos com objetivo &#x201C;Produto&#x201D;, &#x201C;Tratamento Administrativo&#x201D; ou &#x201C;DUIMP&#x201D;.  </li>  <li>  <strong>Fundamento Legal:</strong> S&#xE3;o vinculados atributos com objetivo &#x201C;Fundamento Legal da DUIMP&#x201D;.  </li>  <li>  <strong>Modelo de LPCO:</strong> S&#xE3;o vinculados atributos com objetivo &#x201C;LPCO&#x201D;.  </li>  </ul>  <h4>URLs de Acesso</h4>  <p>A descri&#xE7;&#xE3;o dos servi&#xE7;os faz refer&#xEA;ncia &#xE0; vari&#xE1;vel URL_BASE, que &#xE9; definida de acordo com o ambiente destino da integra&#xE7;&#xE3;o:</p>  <style type=\"text/css\">  .tg {border-collapse:collapse;border-color:#bbb;border-spacing:0;width: 604px;}  .tg td{background-color:#E0FFEB;border-color:#bbb;border-style:solid;border-width:1px;color:#594F4F;  font-family:Arial, sans-serif;font-size:14px;overflow:hidden;padding:10px 5px;word-break:normal;}  .tg th{background-color:#9DE0AD;border-color:#bbb;border-style:solid;border-width:1px;color:#493F3F;  font-family:Arial, sans-serif;font-size:14px;font-weight:normal;overflow:hidden;padding:10px 5px;word-break:normal;}  .tg  .tg-cabecalho{text-align:left;vertical-align:top}.tg  .tg-corpo{border-color:inherit;text-align:left;vertical-align:top}  </style>  <table class=\"tg\" style=\"width: 604px;\">  <thead>   <tr>  <th class=\"tg-cabecalho\"><span style=\"font-weight:bold\">Nome do Ambiente</span></th>  <th class=\"tg-cabecalho\"><span style=\"font-weight:bold\">URL de acesso</span></th>  </tr>  </thead>  <tbody>  <tr>  <td class=\"tg-corpo\">Ambiente de Valida&#231;&#227;o das Empresas</td>  <td class=\"tg-corpo\">https://val.portalunico.siscomex.gov.br/cadatributos/api</td>  </tr>  <tr>  <td class=\"tg-corpo\">Ambiente de Produ&#231;&#227;o</td>  <td class=\"tg-corpo\">https://portalunico.siscomex.gov.br/cadatributos/api</td>  </tr>  </tbody>  </table>  <p>&nbsp;</p>  <h4>Servi&#xE7;os de Download das Rela&#xE7;&#xF5;es</h4>  <p>A seguir s&#xE3;o especificados os servi&#xE7;os para download da rela&#xE7;&#xE3;o completa de atributos, independente dos  v&#xED;nculos, e das rela&#xE7;&#xF5;es de atributos por c&#xF3;digo NCM e de atributos por Fundamento Legal. Essas rela&#xE7;&#xF5;es  s&#xE3;o atualizadas diariamente, &#xE0; meia-noite, e o download pode ser realizado para qualquer data de  refer&#xEA;ncia, seja passada, atual ou futura. </p>  <p>Os arquivos s&#xE3;o gerados na sintaxe XML ou JSON, conforme solicitado, e s&#xE3;o retornados compactados, no  formato ZIP. A vers&#xE3;o do arquivo &#xE9; indicada no campo &#x2018;versao&#x2019; e o hist&#xF3;rico das mudan&#xE7;as pode ser  consultado em formato HTML, nas URLs a seguir: </p>  <ul class=\"elementos\">  <li>  <strong>Vers&#xF5;es da rela&#xE7;&#xE3;o de atributos:</strong> URL_BASE/atributo/historico-versoes.html  </li>  <li>  <strong>Vers&#xF5;es da rela&#xE7;&#xE3;o de atributos por NCM:</strong> URL_BASE/atributo-ncm/historico-versoes.html  </li>  <li>  <strong>Vers&#xF5;es da rela&#xE7;&#xE3;o de atributos por Fundamento Legal:</strong> URL_BASE/atributo-fundamento-legal/historico-versoes.html  </li>  </ul>  <p>Para consultar os v&#xED;nculos de atributos com modelos de LPCO, deve-se utilizar a API do Tratamento Administrativo e LPCO.</p>  <h4>Servi&#xE7;os de Consulta</h4>   <p>Al&#xE9;m dos servi&#xE7;os para download, a API oferece consultas mais espec&#xED;ficas,   que retornam sempre uma estrutura em formato JSON: </p>  <ul class=\"elementos\">  <li>  Consulta de dados de atributos pelo c&#xF3;digo ou pelo nome, permitindo consultar at&#xE9; 100 atributos por chamada;  </li>  <li>  Consulta da rela&#xE7;&#xE3;o de atributos vinculados a um c&#xF3;digo NCM;  </li>  <li>  Consulta da rela&#xE7;&#xE3;o de atributos vinculados a um Fundamento Legal.  </li>  </ul>  
 *
 */
@Path("/")
@Api(value = "/", description = "")
public interface RelaoDeAtributosPorNcmApi  {

    /**
     * Consulta da relação de atributos de um código NCM
     *
     */
    @GET
    @Path("/ext/atributo-ncm/{codigo-ncm}")
    @ApiOperation(value = "Consulta da relação de atributos de um código NCM", notes = "", tags={ "Relação de Atributos por NCM" })
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "Operação realizada com sucesso"),
        @ApiResponse(code = 400, message = "Requisição inválida"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
        @ApiResponse(code = 500, message = "Erro interno no servidor"),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 404, message = "Recurso não encontrado") })
    public Response consultar(@ApiParam(value = "Código do NCM", required = true) @PathParam("codigo-ncm") String codigoNcm, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token é recuperado no parâmetro Set-Token no response da autenticação", required = true) @HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Este token é recuperado no parâmetro X-CSRF-Token no response da autenticação", required = true) @HeaderParam("X-CSRF-Token") String xCSRFToken, @ApiParam(value = "Data de referência, no formato ISO, com precisão de dias.<br>Formato: yyyy-MM-dd") @QueryParam("data") String data, @ApiParam(value = "Modalidade de operação", allowableValues = "IMPORTACAO, EXPORTACAO") @QueryParam("modalidade") String modalidade, @ApiParam(value = "Objetivos: Produto, Tratamento Administrativo, Duimp", allowableValues = "TRATAMENTO_ADMINISTRATIVO, PRODUTO, DUIMP") @QueryParam("objetivos") List<String> objetivos, @ApiParam(value = "Orgãos demandantes") @QueryParam("orgaosDemandantes") List<String> orgaosDemandantes);

    /**
     * Download do arquivo com a relação de atributos por NCM
     *
     */
    @GET
    @Path("/ext/atributo-ncm/download/{tipo}")
    @ApiOperation(value = "Download do arquivo com a relação de atributos por NCM", notes = "", tags={ "Relação de Atributos por NCM" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Operação realizada com sucesso"),
        @ApiResponse(code = 400, message = "Requisição inválida"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
        @ApiResponse(code = 500, message = "Erro interno no servidor"),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 404, message = "Recurso não encontrado") })
    public Response download(@ApiParam(value = "Tipo do arquivo a ser gerado.<br>xml<br>json",required=true, allowableValues="xml, json") @PathParam("tipo") String tipo, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token é recuperado no parâmetro Set-Token no response da autenticação" ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Este token é recuperado no parâmetro X-CSRF-Token no response da autenticação" ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken,  @ApiParam(value = "Data de referência do arquivo, no formato ISO, com precisão de dias.<br>Formato: yyyy-MM-dd")  @QueryParam("data") String data,  @ApiParam(value = "Modalidade de operação", allowableValues="IMPORTACAO, EXPORTACAO")  @QueryParam("modalidade") String modalidade,  @ApiParam(value = "Objetivos: Produto, Tratamento Administrativo, Duimp", allowableValues="TRATAMENTO_ADMINISTRATIVO, PRODUTO, DUIMP")  @QueryParam("objetivos") List<String> objetivos,  @ApiParam(value = "Orgãos demandantes")  @QueryParam("orgaosDemandantes") List<String> orgaosDemandantes,  @ApiParam(value = "Códigos NCM")  @QueryParam("codigosNCM") List<String> codigosNCM);
}

