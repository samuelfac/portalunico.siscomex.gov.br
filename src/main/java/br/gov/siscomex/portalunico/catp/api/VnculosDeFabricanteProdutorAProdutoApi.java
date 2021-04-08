package br.gov.siscomex.portalunico.catp.api;

import java.util.List;

import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

import br.gov.siscomex.portalunico.catp.model.FabricanteIntegracaoDTO;
import br.gov.siscomex.portalunico.catp.model.LoteValidacaoDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * Catálogo de Produtos
 *
 * <p><h3>CATP - Cat&#225;logo de Produtos</h3><h4>Introdu&ccedil;&atilde;o</h4> <p>Bem-vindo API do sistema Pucomex - CATP.</p> <p>O sistema <strong>Cat&#225;logo de Produtos</strong> permite a manuten&#231;&#227;o de cat&#225;logos de produtos e operadores estrangeiros, individualizados por empresa, visando ao reuso das informa&#231;&#245;es nas opera&#231;&#245;es de com&#233;rcio exterior.<p> <p>As informa&#231;&#245;es sobre os produtos e operadores estrangeiras podem ser importadas de arquivos JSON, tanto pela interface Web, via upload de arquivo, quando pelo acionamento dos servi&#231;os descritos a seguir. A estrutura do arquivo JSON &#233; a mesma para as duas modalidades de uso.</p> <p>No arquivo com os produtos a serem importados, al&#233;m dos dados b&#225;sicos, devem ser preenchidos os atributos associados ao c&#243;digo NCM de cada produto. Os atributos preenchidos para cada produto devem respeitar os c&#243;digos do respectivo ambiente - treinamento (valida&#231;&#227;o) ou produ&#231;&#227;o. Devem  ser considerados somente os atributos que contenham o objetivo Produto.</P> <p>Nos endere&#231;os a seguir est&#227;o dispon&#237;veis as rela&#231;&#245;es de atributos por NCM para cada ambiente:</p> <ul> <li><a href=\"https://val.portalunico.siscomex.gov.br/cadatributos/api/atributo-ncm/download/json\">Ambiente de Treinamento/Valida&#231;&#227;o</a></li> <li><a href=\"https://portalunico.siscomex.gov.br/cadatributos/api/atributo-ncm/download/json\">Ambiente de Produ&#231;&#227;o</a></li> </ul> <p>As opera&ccedil;&otilde;es que podem ser gerenciadas pela API do sistema s&atilde;o:</p> <ul> <li>Consultar Produtos</li> <li>Incluir/Retificar Produtos</li> <li>Exportar Cat&#225;logo de Produtos</li> <li>Detalhar Vers&#227;o do Produto</li> <li>Incluir/Retificar Operador Estrangeiro</li> <li>Exportar Cat&#225;logo de Operadores Estrangeiros</li> <li>Vincular/Desvincular Fabricante-Produtor a Produto</li> <li>Exportar V&#237;nculos de Fabricante-Produtor a Produto</li> </ul> <h4>URLs de Acesso</h4> <p>Para utilizar os servi&ccedil;os dispon&iacute;veis nessa API deve-se seguir o seguinte padr&atilde;o de URL:</p> <p><em>https://{ambiente}/<strong>catp</strong>/api/{servi&ccedil;o}</em></p> <p>Onde, em <strong>{ambiente}</strong> deve-se informar o ambiente desejado dentro os ambientes dispon&iacute;veis na tabela abaixo e em <strong>{servi&ccedil;o}</strong> utilizar a URI do servi&ccedil;o desejado.</p>  <style type=\"text/css\">  .tg  {border-collapse:collapse;border-color:#bbb;border-spacing:0;width: 604px;}  .tg td{background-color:#E0FFEB;border-color:#bbb;border-style:solid;border-width:1px;color:#594F4F;  font-family:Arial, sans-serif;font-size:14px;overflow:hidden;padding:10px 5px;word-break:normal;}  .tg th{background-color:#9DE0AD;border-color:#bbb;border-style:solid;border-width:1px;color:#493F3F;  font-family:Arial, sans-serif;font-size:14px;font-weight:normal;overflow:hidden;padding:10px 5px;word-break:normal;}  .tg  .tg-cabecalho{text-align:left;vertical-align:top}.tg  .tg-corpo{border-color:inherit;text-align:left;vertical-align:top}  </style>  <table class=\"tg\" style=\"width: 604px;\">  <thead>  <tr>  <th class=\"tg-cabecalho\"><span style=\"font-weight:bold\">Nome do Ambiente</span></th>  <th class=\"tg-cabecalho\"><span style=\"font-weight:bold\">URL de acesso</span></th> </tr>  </thead>  <tbody> <tr> <td class=\"tg-corpo\">Ambiente de Valida&#231;&#227;o da Empresas</td> <td class=\"tg-corpo\">val.portalunico.siscomex.gov.br</td> </tr>  <tr>  <td class=\"tg-corpo\">Ambiente de Produ&#231;&#227;o</td> <td class=\"tg-corpo\">portalunico.siscomex.gov.br</td> </tr>  </tbody> </table> <p>&nbsp;</p>  <p><strong>Exemplo:</strong> Para o servi&ccedil;o \"Incluir/Alterar Produtos\" a URI &eacute; \"/ext/produto\".</p> <p>Logo, abaixo temos um exemplo de URL completa considerando o ambiente de Valida&ccedil;&atilde;o, consumindo este servi&ccedil;o </p> <p><em>https://val.portalunico.siscomex.gov.br/catp/api/ext/produto</em></p> 
 *
 */
@Path("/")
@Api(value = "/", description = "")
public interface VnculosDeFabricanteProdutorAProdutoApi  {

    /**
     * Exportar Vínculos de Fabricante-Produtor a Produto
     *
     */
    @GET
    @Path("/ext/fabricante/exportar/{cpfCnpjRaiz}")
    @ApiOperation(value = "Exportar Vínculos de Fabricante-Produtor a Produto", notes = "", tags={ "Vínculos de Fabricante-Produtor a Produto" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Operação realizada com sucesso"),
        @ApiResponse(code = 204, message = "Operação realizada com sucesso. Nenhum conteúdo retornado"),
        @ApiResponse(code = 400, message = "Requisição mal formatada"),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 404, message = "Recurso não encontrado"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
        @ApiResponse(code = 500, message = "Erro interno no servidor") })
    public Response downloadOperadorEstrangeiro(@QueryParam("TPP-ID") String TPP_ID, @HeaderParam("abi") String abi, @ApiParam(value = "CPF ou CNPJ raiz da empresa responsável. Informar os 8 primeiros dígitos do CNPJ, suprimindo os pontos <br>Tamanho: 8 <br>Formato: 'NNNNNNNN' <br>Tamanho: 11 <br>Formato: 'NNNNNNNNNNN'",required=true) @PathParam("cpfCnpjRaiz") String cpfCnpjRaiz, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token é recuperado no parâmetro Set-Token no response da autenticação" ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Este token é recuperado no parâmetro X-CSRF-Token no response da autenticação" ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * Vincular/Desvincular Fabricante-Produtor a Produto
     *
     */
    @POST
    @Path("/ext/fabricante")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Vincular/Desvincular Fabricante-Produtor a Produto", notes = "", tags={ "Vínculos de Fabricante-Produtor a Produto" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = LoteValidacaoDTO.class, responseContainer = "List"),
        @ApiResponse(code = 204, message = "Operação realizada com sucesso. Nenhum conteúdo retornado"),
        @ApiResponse(code = 400, message = "Requisição mal formatada"),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 404, message = "Recurso não encontrado"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
        @ApiResponse(code = 500, message = "Erro interno no servidor") })
    public Response incluir(@QueryParam("TPP-ID") String TPP_ID, @HeaderParam("abi") String abi, @ApiParam(value = "Lista de Fabricantes/Produtores" ,required=true)@Valid List<FabricanteIntegracaoDTO> body, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token é recuperado no parâmetro Set-Token no response da autenticação" ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Este token é recuperado no parâmetro X-CSRF-Token no response da autenticação" ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken);
}

