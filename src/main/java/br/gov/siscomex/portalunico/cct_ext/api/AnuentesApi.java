package br.gov.siscomex.portalunico.cct_ext.api;

import br.gov.siscomex.portalunico.cct_ext.model.InfoCargaTransitoDTO;

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
 * Controle de Carga e Trânsito Exportação
 *
 * <p><h4>Introdu&ccedil;&atilde;o</h4>  <p>Bem-vindo &agrave; Application Programming Interface (API) do sistema Pucomex - Controle de Cargas e Transito Exporta&ccedil;&atilde;o.<br>Sistema desenvolvido para simplificar o controle de carga e trânsito no processo de Exportação, dando uma única solução e um único fluxo para qualquer tipo de carga e qualquer modal de transporte.  Facilita a organização e realização da recepção, consolidação, trânsito, entrega, carregamento e manifestação de cargas.</p>  <h4>URLs de Acesso</h4>  <p>Para utilizar os servi&ccedil;os dispon&iacute;veis nessa API deve-se seguir o seguinte padr&atilde;o de URL:</p>  <p><em>https://{ambiente}/<strong>cct</strong>/api/{servi&ccedil;o}</em></p>  <p>Onde, em <strong>{ambiente}</strong> deve-se informar o ambiente desejado dentro os ambientes dispon&iacute;veis na tabela abaixo e em <strong>{servi&ccedil;o}</strong> utilizar a URI do servi&ccedil;o desejado.</p>    <style type=\"text/css\">  .tg  {border-collapse:collapse;border-color:#bbb;border-spacing:0;width: 604px;}  .tg td{background-color:#E0FFEB;border-color:#bbb;border-style:solid;border-width:1px;color:#594F4F;    font-family:Arial, sans-serif;font-size:14px;overflow:hidden;padding:10px 5px;word-break:normal;}  .tg th{background-color:#9DE0AD;border-color:#bbb;border-style:solid;border-width:1px;color:#493F3F;    font-family:Arial, sans-serif;font-size:14px;font-weight:normal;overflow:hidden;padding:10px 5px;word-break:normal;}  .tg .tg-cabecalho{text-align:left;vertical-align:top}  .tg .tg-corpo{border-color:inherit;text-align:left;vertical-align:top}  </style>    <table class=\"tg\" style=\"width: 604px;\">  <thead>    <tr>      <th class=\"tg-cabecalho\"><span style=\"font-weight:bold\">Nome do Ambiente</span></th>      <th class=\"tg-cabecalho\"><span style=\"font-weight:bold\">URL de acesso</span></th>    </tr>  </thead>  <tbody>    <tr>      <td class=\"tg-corpo\">Ambiente de Validação da Empresas</td>      <td class=\"tg-corpo\">val.portalunico.siscomex.gov.br</td>    </tr>    <tr>      <td class=\"\\tg-corpo\">Ambiente de Produção</td>      <td class=\"\\tg-corpo\">portalunico.siscomex.gov.br</td>    </tr>  </tbody>  </table>    <p>&nbsp;</p>  <p><strong>Exemplo:</strong> Para o servi&ccedil;o \"Recepções de Nota Fiscal Eletrônica\" a URI &eacute; \"ext/carga/recepcao-nfe\".</p>  <p>Logo, abaixo temos um exemplo de URL completa considerando o ambiente de Valida&ccedil;&atilde;o, consumindo este servi&ccedil;o </p>  <p><em>https://val.portalunico.siscomex.gov.br/cct/ext/carga/recepcao-nfe</em></p>  
 *
 */
@Path("/")
@Api(value = "/", description = "")
public interface AnuentesApi  {

    /**
     * Obter Dados da Carga e Trânsito a partir do número da DU-E
     *
     * &lt;p&gt;&lt;a rel&#x3D;\&quot;noopener noreferrer\&quot; href&#x3D;\&quot;../pages/exemplos/cctr/secex-p025/\&quot;&gt;Exemplos de Respostas&lt;/a&gt;&lt;/p&gt;
     *
     */
    @GET
    @Path("/ext/anuentes/{due}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Obter Dados da Carga e Trânsito a partir do número da DU-E", notes = "<p><a rel=\"noopener noreferrer\" href=\"../pages/exemplos/cctr/secex-p025/\">Exemplos de Respostas</a></p>", tags={ "Anuentes" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = InfoCargaTransitoDTO.class),
        @ApiResponse(code = 400, message = "XML não atende as especificações definidas no XSD (requisições com envio de arquivos xml)"),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 404, message = "Recurso não encontrado"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
        @ApiResponse(code = 500, message = "Erro interno no servidor") })
    public Response obterDadosCargaTransito(@ApiParam(value = "Número da DU-E<br>Tamanho: 14<br>Formato: AABRSSSSSSSSSD <br>Descrição Formato<br>AA - Ano<br>BR - Brasil<br>SSSSSSSSS - Numeração sequencial<br>D - DV",required=true) @PathParam("due") String due, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token é recuperado no parâmetro Set-Token no response da autenticação." ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Este token é recuperado no parâmetro X-CSRF-Token no response da autenticação." ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken);
}

