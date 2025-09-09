package br.gov.siscomex.portalunico.catp.api;

import br.gov.siscomex.portalunico.catp.model.LoteValidacaoVersaoDTO;
import br.gov.siscomex.portalunico.catp.model.ProdutoIntegracaoDTO;
import br.gov.siscomex.portalunico.catp.model.ProdutoIntegracaoRequestDTO;
import br.gov.siscomex.portalunico.catp.model.ProdutoIntegracaoResponseDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import java.util.List;

/**
 * Catálogo de Produtos
 *
 * <p><h3>CATP - Cat&#225;logo de Produtos</h3><h4>Introdu&ccedil;&atilde;o</h4> <p>Bem-vindo à API do sistema Cat&#225;logo de Produtos.</p> <p>O sistema <strong>Cat&#225;logo de Produtos</strong> permite a manuten&#231;&#227;o de cat&#225;logos de produtos e operadores estrangeiros, individualizados por empresa, visando ao reuso das informa&#231;&#245;es nas opera&#231;&#245;es de com&#233;rcio exterior.<p> <p>As informa&#231;&#245;es sobre os produtos e operadores estrangeiros podem ser importadas de arquivos JSON, tanto pela interface Web, via upload de arquivo, quando pelo acionamento dos servi&#231;os descritos a seguir. A estrutura do arquivo JSON &#233; a mesma para as duas modalidades de uso.</p> <p>No arquivo com os produtos a serem importados, al&#233;m dos dados b&#225;sicos, devem ser preenchidos os atributos associados ao c&#243;digo NCM de cada produto. Os atributos preenchidos para cada produto devem respeitar os c&#243;digos do respectivo ambiente - treinamento (valida&#231;&#227;o) ou produ&#231;&#227;o. Devem  ser considerados somente os atributos que contenham o objetivo Produto.</P> <p>Nos endere&#231;os a seguir est&#227;o dispon&#237;veis as rela&#231;&#245;es de atributos por NCM para cada ambiente:</p> <ul> <li><a href=\"https://val.portalunico.siscomex.gov.br/cadatributos/api/atributo-ncm/download/json\">Ambiente de Treinamento/Valida&#231;&#227;o</a></li> <li><a href=\"https://portalunico.siscomex.gov.br/cadatributos/api/atributo-ncm/download/json\">Ambiente de Produ&#231;&#227;o</a></li> </ul> <p>As opera&ccedil;&otilde;es que podem ser gerenciadas pela API do sistema s&atilde;o:</p> <ul> <li>Consultar Produtos</li> <li>Incluir/Retificar Produtos</li> <li>Exportar Cat&#225;logo de Produtos</li> <li>Detalhar Vers&#227;o do Produto</li> <li>Incluir/Retificar Operador Estrangeiro</li> <li>Exportar Cat&#225;logo de Operadores Estrangeiros</li> <li>Vincular/Desvincular Fabricante-Produtor a Produto</li> <li>Exportar V&#237;nculos de Fabricante-Produtor a Produto</li> <li>Incluir Atos Concess&#243;rios</li> </ul> <h4>URLs de Acesso</h4> <p>Para utilizar os servi&ccedil;os dispon&iacute;veis, deve-se considerar a maneira de autentica&ccedil;&atilde;o de cada servi&ccedil;o, conforme padr&atilde;o Portal &Uacute;nico do Com&eacute;rcio Exterior para os servi&ccedil;os, com exce&ccedil;&atilde;o da Consultar LPCO por Chave de Acesso para o perfil de TERCEIROS. Segue abaixo os padr&otilde;es:</p>  <h4>Padr&atilde;o Portal &Uacute;nico do Com&eacute;rcio Exterior</h4>  <p><em>https://{ambiente}/<strong>catp</strong>/api/{servi&ccedil;o}</em></p>  <p>Onde, em <strong>{ambiente}</strong> deve-se informar o ambiente desejado dentre os ambientes dispon&iacute;veis na tabela abaixo e em <strong>{servi&ccedil;o}</strong> utilizar a URI do servi&ccedil;o desejado.</p>  <style type=\"text/css\">     .tg  {border-collapse:collapse;border-color:#bbb;border-spacing:0;width: 604px;}     .tg td{background-color:#E0FFEB;border-color:#bbb;border-style:solid;border-width:1px;color:#594F4F;  font-family:Arial, sans-serif;font-size:14px;overflow:hidden;padding:10px 5px;word-break:normal;}     .tg th{background-color:#9DE0AD;border-color:#bbb;border-style:solid;border-width:1px;color:#493F3F;  font-family:Arial, sans-serif;font-size:14px;font-weight:normal;overflow:hidden;padding:10px 5px;word-break:normal;}     .tg     .tg-cabecalho{text-align:left;vertical-align:top}.tg     .tg-corpo{border-color:inherit;text-align:left;vertical-align:top}  </style>  <table class=\"tg\" style=\"width: 100%;\">  <thead>  <tr>  <th class=\"tg-cabecalho\"><span style=\"font-weight:bold\">Nome do Ambiente</span></th>  <th class=\"tg-cabecalho\"><span style=\"font-weight:bold\">URL de acesso</span></th>  <th class=\"tg-cabecalho\"><span style=\"font-weight:bold\">Público alvo</span></th>  </tr>  </thead>  <tbody>  <tr>  <td class=\"tg-corpo\">Ambiente de Homologação</td>  <td class=\"tg-corpo\">hom.pucomex.serpro.gov.br</td>  <td class=\"tg-corpo\">Intervenientes públicos (conforme perfil de acesso)</td>  </tr>  <tr>  <td class=\"tg-corpo\">Ambiente de Validação das Empresas</td>  <td class=\"tg-corpo\">val.portalunico.siscomex.gov.br</td>  <td class=\"tg-corpo\">Intervenientes privados</td>  </tr>  <tr>  <td class=\"tg-corpo\">Ambiente de Produção</td>  <td class=\"tg-corpo\">portalunico.siscomex.gov.br</td>  <td class=\"tg-corpo\">Todos os intervenientes (públicos e privados)</td>  </tr>  </tbody>  </table>  <p>&nbsp;</p>  <p><strong>Exemplo:</strong> Para o servi&ccedil;o \"Incluir/Alterar Produtos\" a URI &eacute;  <p><em>https://val.portalunico.siscomex.gov.br/catp/api/ext/produto</em></p>
 *
 */
@Path("/")
@Api(value = "/", description = "")
public interface ProdutoApi {

    /**
     * Consultar Produtos
     *
     */
    @GET
    @Path("/ext/produto")
    @Produces({"application/json"})
    @ApiOperation(value = "Consultar Produtos", notes = "", tags = {"Produto"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = ProdutoIntegracaoDTO.class, responseContainer = "List"),
            @ApiResponse(code = 400, message = "Requisição mal formatada"),
            @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
            @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
            @ApiResponse(code = 500, message = "Erro interno no servidor"),
            @ApiResponse(code = 204, message = "Operação realizada com sucesso. Nenhum conteúdo retornado"),
            @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
            @ApiResponse(code = 404, message = "Recurso não encontrado")})
    List<ProdutoIntegracaoDTO> consultar(@NotNull @ApiParam(value = "CPF ou CNPJ raiz da empresa responsável. Informar os 8 primeiros dígitos do CNPJ, suprimindo os pontos  <br>Tamanho: 8 <br>Formato: 'NNNNNNNN' <br>Tamanho: 11 <br>Formato: 'NNNNNNNNNNN'", required = true) @QueryParam("cpfCnpjRaiz") String cpfCnpjRaiz, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token é recuperado no parâmetro Set-Token no response da autenticação", required = true) @HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Este token é recuperado no parâmetro X-CSRF-Token no response da autenticação", required = true) @HeaderParam("X-CSRF-Token") String xCSRFToken, @ApiParam(value = "Código do produto  <br>Tamanho: 10 <br>Formato: 'NNNNNNNNNN'") @QueryParam("codigo") String codigo, @ApiParam(value = "Códigos internos do produto do Exportador/Importador  <br>Tamanho: 60") @QueryParam("codigoInterno") String codigoInterno, @ApiParam(value = "Detalhamento complementar do produto <br>Tamanho: 3700") @QueryParam("descricao") String descricao, @ApiParam(value = "Denominacao do produto  <br>Tamanho: 3700") @QueryParam("denominacao") String denominacao, @ApiParam(value = "NCM do produto  <br>Tamanho: 8 <br>Formato: 'NNNNNNNN'") @QueryParam("ncm") String ncm, @ApiParam(value = "Período do registro - Data inicial <br>Tamanho: 10 <br>Formato: 'yyyy-MM-dd'") @QueryParam("periodoRegistroInicio") String periodoRegistroInicio, @ApiParam(value = "Período do registro - Data final <br>Tamanho: 10 <br>Formato: 'yyyy-MM-dd'") @QueryParam("periodoRegistroFim") String periodoRegistroFim, @ApiParam(value = "Situação do produto (0 - Ativado, 1 - Desativado, 2 - Rascunho)  <br>Tamanho: 1 <br>Formato: 'N'") @QueryParam("situacao") Integer situacao, @ApiParam(value = "Período da última alteração - Data inicial <br>Tamanho: 10 <br>Formato: 'yyyy-MM-dd'") @QueryParam("ultimaAlteracaoInicio") String ultimaAlteracaoInicio, @ApiParam(value = "Período da última alteração - Data final <br>Tamanho: 10 <br>Formato: 'yyyy-MM-dd'") @QueryParam("ultimaAlteracaoFim") String ultimaAlteracaoFim, @ApiParam(value = "Código do país de origem no formato ISO 3166  <br>Tamanho: 2 <br>Formato: 'AA'") @QueryParam("paisOrigem") String paisOrigem, @ApiParam(value = "CPF/CNPJ do fabricante nacional  <br>Tamanho: 11 <br>Formato: 'NNNNNNNNNNN' <br>Tamanho: 14 <br>Formato: 'NNNNNNNNNNNNNN'") @QueryParam("cpfCnpjFabricante") String cpfCnpjFabricante, @ApiParam(value = "Modalidade de operação   <br>Domínio: IMPORTACAO <br>EXPORTACAO <br>AMBOS", allowableValues = "AMBOS, EXPORTACAO, IMPORTACAO") @QueryParam("modalidade") String modalidade, @ApiParam(value = "Produtos no estado atual da data de referência <br>Tamanho: 10 <br>Formato: 'yyyy-MM-dd'") @QueryParam("dataReferencia") String dataReferencia, @ApiParam(value = "TIN - Trade Identification Number (Número de Identificação do Operador) <br>Tamanho: 35") @QueryParam("operadorEstrangeiroCodigo") String operadorEstrangeiroCodigo);

    /**
     * Desativar uma versão de Produto
     *
     */
    @PUT
    @Path("/ext/produto/desativar/{cpfCnpjRaiz}/{codigo}")
    @Produces({"application/json"})
    @ApiOperation(value = "Desativar uma versão de Produto", notes = "", tags = {"Produto"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = ProdutoIntegracaoResponseDTO.class),
            @ApiResponse(code = 400, message = "Requisição mal formatada"),
            @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
            @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
            @ApiResponse(code = 500, message = "Erro interno no servidor"),
            @ApiResponse(code = 204, message = "Operação realizada com sucesso. Nenhum conteúdo retornado"),
            @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
            @ApiResponse(code = 404, message = "Recurso não encontrado")})
    ProdutoIntegracaoResponseDTO desativar(@ApiParam(value = "CPF ou CNPJ raiz da empresa responsável. Informar os 8 primeiros dígitos do CNPJ, suprimindo os pontos  <br>Tamanho: 8 <br>Formato: 'NNNNNNNN' <br>Tamanho: 11 <br>Formato: 'NNNNNNNNNNN'", required = true) @PathParam("cpfCnpjRaiz") String cpfCnpjRaiz, @ApiParam(value = "Código do produto <br>Tamanho: 10 <br>Formato: 'NNNNNNNNNN'", required = true) @PathParam("codigo") Long codigo, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token é recuperado no parâmetro Set-Token no response da autenticação", required = true) @HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Este token é recuperado no parâmetro X-CSRF-Token no response da autenticação", required = true) @HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * Detalhar Versão do Produto
     *
     */
    @GET
    @Path("/ext/produto/{cpfCnpjRaiz}/{codigo}/{versao}")
    @Produces({"application/json"})
    @ApiOperation(value = "Detalhar Versão do Produto", notes = "", tags = {"Produto"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = ProdutoIntegracaoResponseDTO.class),
            @ApiResponse(code = 400, message = "Requisição mal formatada"),
            @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
            @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
            @ApiResponse(code = 500, message = "Erro interno no servidor"),
            @ApiResponse(code = 204, message = "Operação realizada com sucesso. Nenhum conteúdo retornado"),
            @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
            @ApiResponse(code = 404, message = "Recurso não encontrado")})
    ProdutoIntegracaoResponseDTO recuperar(@ApiParam(value = "CPF ou CNPJ raiz da empresa responsável. Informar os 8 primeiros dígitos do CNPJ, suprimindo os pontos  <br>Tamanho: 8 <br>Formato: 'NNNNNNNN' <br>Tamanho: 11 <br>Formato: 'NNNNNNNNNNN'", required = true) @PathParam("cpfCnpjRaiz") String cpfCnpjRaiz, @ApiParam(value = "Código do produto <br>Tamanho: 10 <br>Formato: 'NNNNNNNNNN'", required = true) @PathParam("codigo") String codigo, @ApiParam(value = "Informar a versão do produto (exemplo: '1') ou uma versão retificada do produto (exemplo: '1.1').<br>Tamanho Máximo: 8 <br>", required = true) @PathParam("versao") String versao, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token é recuperado no parâmetro Set-Token no response da autenticação", required = true) @HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Este token é recuperado no parâmetro X-CSRF-Token no response da autenticação", required = true) @HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * **(Deprecated)** Incluir/Retificar Produtos - Os novos endpoints substituirão o recurso atual, que será descontinuado/removido em 01/01/2026.
     *
     */
    @POST
    @Path("/ext/produto")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    @ApiOperation(value = "**(Deprecated)** Incluir/Retificar Produtos - Os novos endpoints substituirão o recurso atual, que será descontinuado/removido em 01/01/2026.", notes = "", tags = {"Produto"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = LoteValidacaoVersaoDTO.class, responseContainer = "List"),
            @ApiResponse(code = 400, message = "Requisição mal formatada"),
            @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
            @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
            @ApiResponse(code = 500, message = "Erro interno no servidor"),
            @ApiResponse(code = 204, message = "Operação realizada com sucesso. Nenhum conteúdo retornado"),
            @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
            @ApiResponse(code = 404, message = "Recurso não encontrado")})
    List<LoteValidacaoVersaoDTO> salvarLote(@ApiParam(value = "Lista de Produtos", required = true) @Valid List<ProdutoIntegracaoDTO> body, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token é recuperado no parâmetro Set-Token no response da autenticação", required = true) @HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Este token é recuperado no parâmetro X-CSRF-Token no response da autenticação", required = true) @HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * Incluir nova versão de Produto
     *
     */
    @PUT
    @Path("/ext/produto/{cpfCnpjRaiz}/{codigo}")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    @ApiOperation(value = "Incluir nova versão de Produto", notes = "", tags = {"Produto"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = ProdutoIntegracaoResponseDTO.class),
            @ApiResponse(code = 400, message = "Requisição mal formatada"),
            @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
            @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
            @ApiResponse(code = 500, message = "Erro interno no servidor"),
            @ApiResponse(code = 204, message = "Operação realizada com sucesso. Nenhum conteúdo retornado"),
            @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
            @ApiResponse(code = 404, message = "Recurso não encontrado")})
    ProdutoIntegracaoResponseDTO salvarNovaVersao(@ApiParam(value = "Produto", required = true) @Valid ProdutoIntegracaoRequestDTO body, @ApiParam(value = "CPF ou CNPJ raiz da empresa responsável. Informar os 8 primeiros dígitos do CNPJ, suprimindo os pontos  <br>Tamanho: 8 <br>Formato: 'NNNNNNNN' <br>Tamanho: 11 <br>Formato: 'NNNNNNNNNNN'", required = true) @PathParam("cpfCnpjRaiz") String cpfCnpjRaiz, @ApiParam(value = "Código do produto <br>Tamanho: 10 <br>Formato: 'NNNNNNNNNN'", required = true) @PathParam("codigo") Long codigo, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token é recuperado no parâmetro Set-Token no response da autenticação", required = true) @HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Este token é recuperado no parâmetro X-CSRF-Token no response da autenticação", required = true) @HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * Incluir Retificação de uma versão de Produto
     *
     */
    @PUT
    @Path("/ext/produto/{cpfCnpjRaiz}/{codigo}/{versao}")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    @ApiOperation(value = "Incluir Retificação de uma versão de Produto", notes = "", tags = {"Produto"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = ProdutoIntegracaoResponseDTO.class),
            @ApiResponse(code = 400, message = "Requisição mal formatada"),
            @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
            @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
            @ApiResponse(code = 500, message = "Erro interno no servidor"),
            @ApiResponse(code = 204, message = "Operação realizada com sucesso. Nenhum conteúdo retornado"),
            @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
            @ApiResponse(code = 404, message = "Recurso não encontrado")})
    ProdutoIntegracaoResponseDTO salvarRetificacao(@ApiParam(value = "Produto", required = true) @Valid ProdutoIntegracaoRequestDTO body, @ApiParam(value = "CPF ou CNPJ raiz da empresa responsável. Informar os 8 primeiros dígitos do CNPJ, suprimindo os pontos  <br>Tamanho: 8 <br>Formato: 'NNNNNNNN' <br>Tamanho: 11 <br>Formato: 'NNNNNNNNNNN'", required = true) @PathParam("cpfCnpjRaiz") String cpfCnpjRaiz, @ApiParam(value = "Código do produto <br>Tamanho: 10 <br>Formato: 'NNNNNNNNNN'", required = true) @PathParam("codigo") Long codigo, @ApiParam(value = "Informar a versão do produto (exemplo: '1') ou uma versão retificada do produto (exemplo: '1.1').<br>Tamanho Máximo: 8 <br>", required = true) @PathParam("versao") String versao, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token é recuperado no parâmetro Set-Token no response da autenticação", required = true) @HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Este token é recuperado no parâmetro X-CSRF-Token no response da autenticação", required = true) @HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * Incluir Produto
     *
     */
    @POST
    @Path("/ext/produto/{cpfCnpjRaiz}")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    @ApiOperation(value = "Incluir Produto", notes = "", tags = {"Produto"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = ProdutoIntegracaoResponseDTO.class),
            @ApiResponse(code = 400, message = "Requisição mal formatada"),
            @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
            @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
            @ApiResponse(code = 500, message = "Erro interno no servidor"),
            @ApiResponse(code = 204, message = "Operação realizada com sucesso. Nenhum conteúdo retornado"),
            @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
            @ApiResponse(code = 404, message = "Recurso não encontrado")})
    ProdutoIntegracaoResponseDTO salvarVersaoInicialProduto(@ApiParam(value = "Produto", required = true) @Valid ProdutoIntegracaoRequestDTO body, @ApiParam(value = "CPF ou CNPJ raiz da empresa responsável. Informar os 8 primeiros dígitos do CNPJ, suprimindo os pontos  <br>Tamanho: 8 <br>Formato: 'NNNNNNNN' <br>Tamanho: 11 <br>Formato: 'NNNNNNNNNNN'", required = true) @PathParam("cpfCnpjRaiz") String cpfCnpjRaiz, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token é recuperado no parâmetro Set-Token no response da autenticação", required = true) @HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Este token é recuperado no parâmetro X-CSRF-Token no response da autenticação", required = true) @HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * Incluir Produto retroativo na data de referência
     *
     */
    @POST
    @Path("/ext/produto/{cpfCnpjRaiz}/{dataReferencia}")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    @ApiOperation(value = "Incluir Produto retroativo na data de referência", notes = "", tags = {"Produto"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = ProdutoIntegracaoResponseDTO.class),
            @ApiResponse(code = 400, message = "Requisição mal formatada"),
            @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
            @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
            @ApiResponse(code = 500, message = "Erro interno no servidor"),
            @ApiResponse(code = 204, message = "Operação realizada com sucesso. Nenhum conteúdo retornado"),
            @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
            @ApiResponse(code = 404, message = "Recurso não encontrado")})
    ProdutoIntegracaoResponseDTO salvarVersaoInicialProduto_1(@ApiParam(value = "Produto", required = true) @Valid ProdutoIntegracaoRequestDTO body, @ApiParam(value = "CPF ou CNPJ raiz da empresa responsável. Informar os 8 primeiros dígitos do CNPJ, suprimindo os pontos  <br>Tamanho: 8 <br>Formato: 'NNNNNNNN' <br>Tamanho: 11 <br>Formato: 'NNNNNNNNNNN'", required = true) @PathParam("cpfCnpjRaiz") String cpfCnpjRaiz, @ApiParam(value = "Data de referência. <br>Tamanho: 8 <br>Formato: 'yyyy-MM-dd'", required = true) @PathParam("dataReferencia") String dataReferencia, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token é recuperado no parâmetro Set-Token no response da autenticação", required = true) @HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Este token é recuperado no parâmetro X-CSRF-Token no response da autenticação", required = true) @HeaderParam("X-CSRF-Token") String xCSRFToken);
}

