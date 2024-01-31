package br.gov.siscomex.portalunico.catp.api;

import br.gov.siscomex.portalunico.catp.model.LoteValidacaoVersaoDTO;
import br.gov.siscomex.portalunico.catp.model.OperadorEstrangeiroIntegracaoDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.ws.rs.Consumes;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;
import java.util.List;

/**
 * Catálogo de Produtos
 *
 * <p><h3>CATP - Cat&#225;logo de Produtos</h3><h4>Introdu&ccedil;&atilde;o</h4> <p>Bem-vindo à API do sistema Cat&#225;logo de Produtos.</p> <p>O sistema <strong>Cat&#225;logo de Produtos</strong> permite a manuten&#231;&#227;o de cat&#225;logos de produtos e operadores estrangeiros, individualizados por empresa, visando ao reuso das informa&#231;&#245;es nas opera&#231;&#245;es de com&#233;rcio exterior.<p> <p>As informa&#231;&#245;es sobre os produtos e operadores estrangeiros podem ser importadas de arquivos JSON, tanto pela interface Web, via upload de arquivo, quando pelo acionamento dos servi&#231;os descritos a seguir. A estrutura do arquivo JSON &#233; a mesma para as duas modalidades de uso.</p> <p>No arquivo com os produtos a serem importados, al&#233;m dos dados b&#225;sicos, devem ser preenchidos os atributos associados ao c&#243;digo NCM de cada produto. Os atributos preenchidos para cada produto devem respeitar os c&#243;digos do respectivo ambiente - treinamento (valida&#231;&#227;o) ou produ&#231;&#227;o. Devem  ser considerados somente os atributos que contenham o objetivo Produto.</P> <p>Nos endere&#231;os a seguir est&#227;o dispon&#237;veis as rela&#231;&#245;es de atributos por NCM para cada ambiente:</p> <ul> <li><a href=\"https://val.portalunico.siscomex.gov.br/cadatributos/api/atributo-ncm/download/json\">Ambiente de Treinamento/Valida&#231;&#227;o</a></li> <li><a href=\"https://portalunico.siscomex.gov.br/cadatributos/api/atributo-ncm/download/json\">Ambiente de Produ&#231;&#227;o</a></li> </ul> <p>As opera&ccedil;&otilde;es que podem ser gerenciadas pela API do sistema s&atilde;o:</p> <ul> <li>Consultar Produtos</li> <li>Incluir/Retificar Produtos</li> <li>Exportar Cat&#225;logo de Produtos</li> <li>Detalhar Vers&#227;o do Produto</li> <li>Incluir/Retificar Operador Estrangeiro</li> <li>Exportar Cat&#225;logo de Operadores Estrangeiros</li> <li>Vincular/Desvincular Fabricante-Produtor a Produto</li> <li>Exportar V&#237;nculos de Fabricante-Produtor a Produto</li> <li>Incluir Atos Concess&#243;rios</li> </ul> <h4>URLs de Acesso</h4> <p>Para utilizar os servi&ccedil;os dispon&iacute;veis nesta API, deve-se aplicar o seguinte padr&atilde;o de URL:</p> <p><em>https://{ambiente}/<strong>catp</strong>/api/{servi&ccedil;o}</em></p> <p>Onde: <strong>{ambiente}</strong> indica o ambiente desejado, de acordo com a tabela abaixo; e <strong>{servi&#231;o}</strong> indica a URI do servi&#231;o desejado.</p> <style type=\"text/css\">  .tg  {border-collapse:collapse;border-color:#bbb;border-spacing:0;width: 604px;}  .tg td{background-color:#E0FFEB;border-color:#bbb;border-style:solid;border-width:1px;color:#594F4F;  font-family:Arial, sans-serif;font-size:14px;overflow:hidden;padding:10px 5px;word-break:normal;} .tg th{background-color:#9DE0AD;border-color:#bbb;border-style:solid;border-width:1px;color:#493F3F;  font-family:Arial, sans-serif;font-size:14px;font-weight:normal;overflow:hidden;padding:10px 5px;word-reak:normal;}  .tg  .tg-cabecalho{text-align:left;vertical-align:top}.tg  .tg-corpo{border-color:inherit;text-align:left;vertical-align:top} </style>  <table class=\"tg\" style=\"width: 604px;\">  <thead>  <tr>  <th class=\"tg-cabecalho\"><span style=\"font-weight:bold\">Nome do Ambiente</span></th>  <th class=\"tg-cabecalho\"><span style=\"font-weight:bold\">URL de acesso</span></th> </tr>  </thead>  <tbody> <tr> <td class=\"tg-corpo\">Ambiente de Valida&#231;&#227;o das Empresas</td> <td class=\"tg-corpo\">val.portalunico.siscomex.gov.br</td> </tr>  <tr>  <td class=\"tg-corpo\">Ambiente de Produ&#231;&#227;o</td>  <td class=\"tg-corpo\">portalunico.siscomex.gov.br</td>  </tr>  </tbody>  </table>  <p>&nbsp;</p>  <p><strong>Exemplo:</strong> Para o servi&ccedil;o \"Incluir/Alterar Produtos\" a URI &eacute;  <p><em>https://val.portalunico.siscomex.gov.br/catp/api/ext/produto</em></p>  
 *
 */
@Path("/")
@Api(value = "/", description = "")
public interface OperadorEstrangeiroApi  {

    /**
     * Consultar Operador Estrangeiro
     *
     */
    @GET
    @Path("/ext/operador-estrangeiro")
    @Produces({ "application/json" })
    @ApiOperation(value = "Consultar Operador Estrangeiro", notes = "", tags={ "Operador Estrangeiro" })
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = OperadorEstrangeiroIntegracaoDTO.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Requisição mal formatada"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
        @ApiResponse(code = 500, message = "Erro interno no servidor"),
        @ApiResponse(code = 204, message = "Operação realizada com sucesso. Nenhum conteúdo retornado"),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 404, message = "Recurso não encontrado") })
    public Response consultar(@NotNull @ApiParam(value = "CPF ou CNPJ raiz da empresa responsável. Informar os 8 primeiros dígitos do CNPJ, suprimindo os pontos  <br>Tamanho: 8 <br>Formato: 'NNNNNNNN' <br>Tamanho: 11 <br>Formato: 'NNNNNNNNNNN'",required=true)  @QueryParam("cpfCnpjRaiz") String cpfCnpjRaiz, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token é recuperado no parâmetro Set-Token no response da autenticação" ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Este token é recuperado no parâmetro X-CSRF-Token no response da autenticação" ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken, @ApiParam(value = "TIN - Trade Identification Number (Número de Identificação do Operador) <br>Tamanho: 35")  @QueryParam("tin") String tin, @ApiParam(value = "Código <br>Tamanho: 35")  @QueryParam("codigo") String codigo, @ApiParam(value = "Códigos internos do Operador Estrangeiro do Exportador/Importador  <br>Tamanho: 35")  @QueryParam("codigoInterno") String codigoInterno, @ApiParam(value = "Nome do Operador Estrangeiro  <br>Tamanho: 70")  @QueryParam("nome") String nome, @ApiParam(value = "Código do país. Usar tabela ISO 3166 <br>Tamanho: 2 <br>Formato: 'AA' <br>")  @QueryParam("paisOrigem") String paisOrigem, @ApiParam(value = "Exibir desativados", defaultValue="false") @DefaultValue("false") @QueryParam("exibirDesativados") Boolean exibirDesativados);

    /**
     * Detalhar Versão do OperadorExtrangeiro
     *
     */
    @GET
    @Path("/ext/operador-estrangeiro/{cpfCnpjRaiz}/{codigoPais}/{codigo}/{versao}")
    @ApiOperation(value = "Detalhar Versão do OperadorExtrangeiro", notes = "", tags={ "Operador Estrangeiro" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Operação realizada com sucesso"),
        @ApiResponse(code = 400, message = "Requisição mal formatada"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
        @ApiResponse(code = 500, message = "Erro interno no servidor"),
        @ApiResponse(code = 204, message = "Operação realizada com sucesso. Nenhum conteúdo retornado"),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 404, message = "Recurso não encontrado") })
    public Response detalhar(@ApiParam(value = "CPF ou CNPJ raiz da empresa responsável. Informar os 8 primeiros dígitos do CNPJ, suprimindo os pontos  <br>Tamanho: 8 <br>Formato: 'NNNNNNNN' <br>Tamanho: 11 <br>Formato: 'NNNNNNNNNNN'",required=true) @PathParam("cpfCnpjRaiz") String cpfCnpjRaiz, @ApiParam(value = "Código do país. Usar tabela ISO 3166 <br>Tamanho: 2 <br>Formato: 'AA' <br>",required=true) @PathParam("codigoPais") String codigoPais, @ApiParam(value = "TIN - Trade Identification Number (Número de Identificação do Operador Estrangeiro) <br>Tamanho: 35 <br>",required=true) @PathParam("codigo") String codigo, @ApiParam(value = "Informar a versão do Operador Estrangeiro (exemplo: '1') ou uma versão retificada do Operador Estrangeiro (exemplo: '1.1').<br>Tamanho Máximo: 8 <br>",required=true) @PathParam("versao") String versao, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token é recuperado no parâmetro Set-Token no response da autenticação" ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Este token é recuperado no parâmetro X-CSRF-Token no response da autenticação" ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * Exportar Catálogo de Operadores Estrangeiros
     *
     */
    @GET
    @Path("/ext/operador-estrangeiro/exportar/{cpfCnpjRaiz}/{exibirDesativados}")
    @ApiOperation(value = "Exportar Catálogo de Operadores Estrangeiros", notes = "", tags={ "Operador Estrangeiro" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Operação realizada com sucesso"),
        @ApiResponse(code = 400, message = "Requisição mal formatada"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
        @ApiResponse(code = 500, message = "Erro interno no servidor"),
        @ApiResponse(code = 204, message = "Operação realizada com sucesso. Nenhum conteúdo retornado"),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 404, message = "Recurso não encontrado") })
    public Response downloadOperadorEstrangeiro(@ApiParam(value = "CPF ou CNPJ raiz da empresa responsável. Informar os 8 primeiros dígitos do CNPJ, suprimindo os pontos <br>Tamanho: 8 <br>Formato: 'NNNNNNNN' <br>Tamanho: 11 <br>Formato: 'NNNNNNNNNNN'",required=true) @PathParam("cpfCnpjRaiz") String cpfCnpjRaiz, @ApiParam(value = "Exibir desativados",required=true) @PathParam("exibirDesativados") Boolean exibirDesativados, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token é recuperado no parâmetro Set-Token no response da autenticação" ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Este token é recuperado no parâmetro X-CSRF-Token no response da autenticação" ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * Incluir/Retificar Operador Estrangeiro
     *
     */
    @POST
    @Path("/ext/operador-estrangeiro")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Incluir/Retificar Operador Estrangeiro", notes = "", tags={ "Operador Estrangeiro" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = LoteValidacaoVersaoDTO.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Requisição mal formatada"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
        @ApiResponse(code = 500, message = "Erro interno no servidor"),
        @ApiResponse(code = 204, message = "Operação realizada com sucesso. Nenhum conteúdo retornado"),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 404, message = "Recurso não encontrado") })
    public Response incluir(@ApiParam(value = "Lista de Operadores Estrangeiros" ,required=true)@Valid List<OperadorEstrangeiroIntegracaoDTO> body, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token é recuperado no parâmetro Set-Token no response da autenticação" ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Este token é recuperado no parâmetro X-CSRF-Token no response da autenticação" ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken);
}

