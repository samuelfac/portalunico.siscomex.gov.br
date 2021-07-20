package br.gov.siscomex.portalunico.classif.api;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * Classificação Fiscal de Mercadoria
 *
 * <p><h3>CLSF - Classificação Fiscal de Mercadorias</h3><h4>Introdu&ccedil;&atilde;o</h4> <p>Bem-vindo à API do sistema Classificação Fiscal de Mercadorias (Classif).</p> <p>O <strong>Classificação Fiscal de Mercadorias</strong> fornece a relação dos atributos configurados pelos órgãos de governo para os códigos de mercadoria (NCM). A relação é atualizada diariamente, durante a madrugada, e pode ser consultada para a data atual.<p> <p>O serviço disponibilizado nesta API é <strong>\"nomenclatura\"</strong>, cuja especificação será descrita abaixo.</p> <h4>URLs de Acesso</h4> <p>Para utilizar o serviço, deve-se acessar uma das URLs que seguem, de acordo com o ambiente utilizado:</p> <style type=\"text/css\">  .tg  {border-collapse:collapse;border-color:#bbb;border-spacing:0;width: 604px;}  .tg td{background-color:#E0FFEB;border-color:#bbb;border-style:solid;border-width:1px;color:#594F4F;  font-family:Arial, sans-serif;font-size:14px;overflow:hidden;padding:10px 5px;word-break:normal;}  .tg th{background-color:#9DE0AD;border-color:#bbb;border-style:solid;border-width:1px;color:#493F3F;  font-family:Arial, sans-serif;font-size:14px;font-weight:normal;overflow:hidden;padding:10px 5px;word-break:normal;}  .tg  .tg-cabecalho{text-align:left;vertical-align:top}.tg  .tg-corpo{border-color:inherit;text-align:left;vertical-align:top}  </style>  <table class=\"tg\" style=\"width: 604px;\">  <thead>  <tr>  <th class=\"tg-cabecalho\"><span style=\"font-weight:bold\">Nome do Ambiente</span></th>  <th class=\"tg-cabecalho\"><span style=\"font-weight:bold\">URL de acesso</span></th> </tr>  </thead>  <tbody> <tr> <td class=\"tg-corpo\">Ambiente de Valida&#231;&#227;o das Empresas&nbsp;</td> <td class=\"tg-corpo\">https://val.portalunico.siscomex.gov.br/classif/api/atributo-ncm/download/json</td> </tr>  <tr>  <td class=\"tg-corpo\">Ambiente de Produ&#231;&#227;o&nbsp;</td> <td class=\"tg-corpo\">https://portalunico.siscomex.gov.br/classif/api/publico/nomenclatura/download/json</td> </tr>  </tbody> </table> <p>&nbsp;</p>  
 *
 */
@Path("/")
@Api(value = "/", description = "")
public interface DefaultApi  {

    /**
     * Download do Arquivo 
     *
     */
    @GET
    @Path("/publico/nomenclatura/download/json")
    @ApiOperation(value = "Download do Arquivo ", notes = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "sucesso"),
        @ApiResponse(code = 404, message = "Arquivo não encontrado") })
    public Response downloadPublico();
}

