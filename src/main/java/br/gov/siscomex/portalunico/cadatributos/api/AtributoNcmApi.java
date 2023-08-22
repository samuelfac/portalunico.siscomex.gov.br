package br.gov.siscomex.portalunico.cadatributos.api;


import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;
import io.swagger.jaxrs.PATCH;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Cadastro de Atributos
 *
 * <p><h3>CADA - Cadastro de Atributos</h3><h4>Introdu&ccedil;&atilde;o</h4> <p>Bem-vindo à API do sistema Cadastro de Atributos.</p> <p>O <strong>Cadastro de Atributos</strong> fornece a relação dos atributos configurados pelos órgãos de governo para os códigos de mercadoria (NCM). A relação é atualizada diariamente, à meia-noite, e pode ser consultada para a data atual ou para outra data de referência.<p> <p>O serviço disponibilizado nesta API é <strong>\"Download do arquivo de Lista de Atributos por NCM\"</strong>, cuja especificação será descrita abaixo.</p> <h4>URLs de Acesso</h4> <p>Para utilizar o serviço, deve-se acessar uma das URLs que seguem, de acordo com o ambiente utilizado:</p> <style type=\"text/css\">  .tg  {border-collapse:collapse;border-color:#bbb;border-spacing:0;width: 604px;}  .tg td{background-color:#E0FFEB;border-color:#bbb;border-style:solid;border-width:1px;color:#594F4F;  font-family:Arial, sans-serif;font-size:14px;overflow:hidden;padding:10px 5px;word-break:normal;}  .tg th{background-color:#9DE0AD;border-color:#bbb;border-style:solid;border-width:1px;color:#493F3F;  font-family:Arial, sans-serif;font-size:14px;font-weight:normal;overflow:hidden;padding:10px 5px;word-break:normal;}  .tg  .tg-cabecalho{text-align:left;vertical-align:top}.tg  .tg-corpo{border-color:inherit;text-align:left;vertical-align:top}  </style>  <table class=\"tg\" style=\"width: 604px;\">  <thead>  <tr>  <th class=\"tg-cabecalho\"><span style=\"font-weight:bold\">Nome do Ambiente</span></th>  <th class=\"tg-cabecalho\"><span style=\"font-weight:bold\">URL de acesso</span></th> </tr>  </thead>  <tbody> <tr> <td class=\"tg-corpo\">Ambiente de Valida&#231;&#227;o das Empresas</td> <td class=\"tg-corpo\">https://val.portalunico.siscomex.gov.br/cadatributos/api/ext/atributo-ncm/download/{tipo}</td> </tr>  <tr>  <td class=\"tg-corpo\">Ambiente de Produ&#231;&#227;o</td> <td class=\"tg-corpo\">https://portalunico.siscomex.gov.br/cadatributos/api/ext/atributo-ncm/download/{tipo}</td> </tr>  </tbody> </table> <p>&nbsp;</p>  
 *
 */
@Path("/")
@Api(value = "/", description = "")
public interface AtributoNcmApi  {

    /**
     * Download do arquivo de Lista de Atributos por NCM
     *
     */
    @GET
    @Path("/ext/atributo-ncm/download/{tipo}")
    @ApiOperation(value = "Download do arquivo de Lista de Atributos por NCM", notes = "", tags={ "Atributo NCM" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Operação realizada com sucesso"),
        @ApiResponse(code = 400, message = "Requisição inválida"),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 404, message = "Recurso não encontrado"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
        @ApiResponse(code = 500, message = "Erro interno no servidor") })
    public Response download(@ApiParam(value = "Tipo do arquivo a ser gerado.<br>xml<br>json",required=true, allowableValues="xml, json") @PathParam("tipo") String tipo, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token é recuperado no parâmetro Set-Token no response da autenticação" ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Este token é recuperado no parâmetro X-CSRF-Token no response da autenticação" ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken,  @ApiParam(value = "Data de referência do arquivo, no formato ISO, com precisão de dias.<br>Formato: yyyy-MM-dd")  @QueryParam("data") String data);
}

