package br.gov.siscomex.portalunico.ccta.api;

import br.gov.siscomex.portalunico.ccta.model.ConhecimentoConsultaDetalhada;
import br.gov.siscomex.portalunico.ccta.model.ConhecimentoConsultaResumida;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import javax.validation.constraints.NotNull;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

/**
 * Controle de Carga e Trânsito Importação - Modal Aéreo
 *
 * <p><h4>Manual do Usuário</h4><p style=\"margin-bottom: 1em; margin-top: 1em;\">Informações detalhadas sobre serviços e funcionalidades em tela, assim como a lista de funcionalidades disponíveis para cada perfil de acesso, podem ser consultados no <a  href=\"https://www.gov.br/siscomex/pt-br/arquivos-e-imagens/manualcctimportao.pdf\">manual do usuário do CCT  Importação</a>.</p><h4>Introdução</h4><p style=\"margin-bottom: 1em; margin-top: 1em;\">Bem-vindo à Application Programming Interface (API) de interação com o  novo Sistema de Controle de Carga e Trânsito (CCT Importação - Modal Aéreo). Trata-se de um conjunto de rotinas e  padrões de programação para acesso a um aplicativo de software baseado nos padrões Web, que permitirá a manifestação e gestão do fluxo logístico de viagens e cargas dentro do Portal Único de Comércio Exterior.</p><p style=\"margin-bottom: 1em; margin-top: 1em;\">A documentação a seguir descreve os serviços da versão atual do sistema, disponível no ambiente de validação do setor privado. Não há, até o momento, versão disponível para uso em produção. O intuito da API é permitir que as empresas possam realizar testes, preparando as adaptações necessárias em seus sistemas. As informações encaminhadas para os endpoints, neste momento, não terão valor legal, nem serão reaproveitadas em produção.</p> <p style=\"margin-bottom: 1em; margin-top: 1em;\">Os perfis de acesso que podem utilizar cada serviço encontram-se listados no   manual do usuário. Os Operadores de Remessa Postal/Expressa podem atuar como transportador, agente de carga,   depositário ou importador, desde que devidamente cadastrados nestes perfis de atuação.   As ESATA (Empresas de Serviços Auxiliares ao Transporte Aéreo) podem interagir com os serviços desde que possuam   representação para atuar como transportador ou agente de carga. Para executar as ações relacionadas à recepção de carga e   à chegada de veículo terrestre (trânsito aduaneiro), os recintos aduaneiros (depositários) devem utilizar os serviços   disponibilizados pela <a   href=\"https://api-docs.portalunico.siscomex.gov.br/swagger/rcnt.html\">API Recintos Aduaneiros</a>.</p><p style=\"margin-bottom: 1em; margin-top: 1em;\">Para a utilização dos serviços do CCT Importação – Modal Aéreo, a autenticação via certificação digital por e-CPF é obrigatória. Na seção <a  href=\"https://docs.portalunico.siscomex.gov.br/introducao-api-publica/\">Introdução</a> da API do Portal Único de Comércio Exterior, podem ser encontradas as orientações gerais sobre os padrões de comunicação dos serviços, os procedimentos para autenticação e os códigos de resposta das requisições.</p><p style=\"margin-bottom: 1em; margin-top: 1em;\">Os serviços, a princípio, não estarão disponíveis no horário de 1:00h às 3:00h, em virtude de parada programada dos sistemas de comércio exterior.</p><h4>URLs de Acesso</h4><p style=\"margin-bottom: 1em; margin-top: 1em;\">Para utilizar os servi&ccedil;os dispon&iacute;veis nessa API deve-se seguir o seguinte padr&atilde;o de URL:</p><p style=\"margin-bottom: 1em; margin-top: 1em;\"><em>https://{ambiente}/<strong>ccta</strong>/{servi&ccedil;o}</em></p><p style=\"margin-bottom: 1em; margin-top: 1em;\">Onde, em <strong>{ambiente}</strong> deve-se informar o ambiente desejado dentro os ambientes dispon&iacute;veis na tabela abaixo e em <strong>{servi&ccedil;o}</strong> utilizar a URL do servi&ccedil;o desejado.</p><style type=\"text/css\"> .tg {  border-collapse: collapse;  border-color: #bbb;  border-spacing: 0;  width: 604px; } .tg td {  background-color: #E0FFEB;  border-color: #bbb;  border-style: solid;  border-width: 1px;  color: #594F4F;  font-family: Arial, sans-serif;  font-size: 14px;  overflow: hidden;  padding: 10px 5px;  word-break: normal; } .tg th {  background-color: #9DE0AD;  border-color: #bbb;  border-style: solid;  border-width: 1px;  color: #493F3F;  font-family: Arial, sans-serif;  font-size: 14px;  font-weight: normal;  overflow: hidden;  padding: 10px 5px;  word-break: normal; } .tg .tg-cabecalho {  text-align: left;  vertical-align: top } .tg .tg-corpo {  border-color: inherit;  text-align: left;  vertical-align: top }</style><span id=\"ip1\">&nbsp;</span><table class=\"tg\" style=\"width: 604px;\" aria-describedby=\"ip1\"> <thead>  <tr>   <th class=\"tg-cabecalho\"><span style=\"font-weight:bold\">Nome do Ambiente</span></th>   <th class=\"tg-cabecalho\"><span style=\"font-weight:bold\">URL de acesso</span></th>  </tr> </thead> <tbody>  <tr>   <td class=\"tg-corpo\">Ambiente de Validação da Empresas</td>   <td class=\"tg-corpo\">val.portalunico.siscomex.gov.br</td>  </tr>  <tr>   <td class=\"\\tg-corpo\">Ambiente de Produção</td>   <td class=\"\\tg-corpo\">portalunico.siscomex.gov.br</td>  </tr> </tbody></table><p style=\"margin-bottom: 1em; margin-top: 1em;\">&nbsp;</p><p style=\"margin-bottom: 1em; margin-top: 1em;\"><strong>Exemplo:</strong> Para o servi&ccedil;o \"Consultar Situação de Arquivos por Número de Protocolo\" a URL &eacute; \"/api/ext/check/received-files/{protocolNumber}\".</p><p style=\"margin-bottom: 1em; margin-top: 1em;\">Logo, abaixo temos um exemplo de URL completa considerando o ambiente de Valida&ccedil;&atilde;o, consumindo este servi&ccedil;o </p><p style=\"margin-bottom: 1em; margin-top: 1em;\"> <em>https://val.portalunico.siscomex.gov.br/ccta/api/ext/check/received-files/{protocolNumber}</em></p></br><h2>Serviços de Envio de Arquivos</h2><h3><a href='https://api-docs.portalunico.siscomex.gov.br/swagger/ccta-ext-xml.html'>API Envio de Arquivos</a></h3>
 *
 */
@Path("/")
@Api(value = "/", description = "")
public interface ServiosDeConsultaDeConhecimentoDeCargaApi  {

    /**
     * Retorna o detalhamento de um ou mais conhecimentos de carga.
     *
     * Retorna o detalhamento de um ou mais conhecimentos de carga.
     *
     */
    @GET
    @Path("/api/ext/conhecimentos")
    @Produces({ "application/json" })
    @ApiOperation(value = "Retorna o detalhamento de um ou mais conhecimentos de carga.", notes = "Retorna o detalhamento de um ou mais conhecimentos de carga.", tags={ "Serviços de Consulta de Conhecimento de Carga" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = ConhecimentoConsultaDetalhada.class, responseContainer = "List"),
        @ApiResponse(code = 204, message = "Operação realizada com sucesso. Nenhum conteúdo retornado"),
        @ApiResponse(code = 400, message = "Requisição mal formatada"),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 404, message = "Recurso não encontrado"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
        @ApiResponse(code = 500, message = "Erro interno no servidor") })
    public Response listarViagensCargasDetalhadoIdentificacaoManifestoUsingGET(@ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token é recuperado no parâmetro Set-Token no response da autenticação" ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Este token é recuperado no parâmetro X-CSRF-Token no response da autenticação" ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken,  @NotNull @ApiParam(value = "Número do Conhecimento",required=true)  @QueryParam("numeroConhecimento") String numeroConhecimento,  @ApiParam(value = "CNPJ Responsável  Tamanho: 14  Formato: NNNNNNNNNNNNNN")  @QueryParam("cnpjResponsavel") String cnpjResponsavel,  @ApiParam(value = "Data da emissão do conhecimento  Tamanho: 10  Formato YYYY-MM-DD")  @QueryParam("dataEmissao") String dataEmissao);

    /**
     * Retorna o resumo de um ou mais conhecimentos de carga ativos.
     *
     * Retorna o resumo de um ou mais conhecimentos de carga ativos.
     *
     */
    @GET
    @Path("/api/ext/conhecimentos/resumo")
    @Produces({ "application/json" })
    @ApiOperation(value = "Retorna o resumo de um ou mais conhecimentos de carga ativos.", notes = "Retorna o resumo de um ou mais conhecimentos de carga ativos.", tags={ "Serviços de Consulta de Conhecimento de Carga" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = ConhecimentoConsultaResumida.class, responseContainer = "List"),
        @ApiResponse(code = 204, message = "Operação realizada com sucesso. Nenhum conteúdo retornado"),
        @ApiResponse(code = 400, message = "Requisição mal formatada"),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 404, message = "Recurso não encontrado"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
        @ApiResponse(code = 500, message = "Erro interno no servidor") })
    public Response listarViagensCargasResumoIdentificacaoManifestoUsingGET(@ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token é recuperado no parâmetro Set-Token no response da autenticação" ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Este token é recuperado no parâmetro X-CSRF-Token no response da autenticação" ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken,  @NotNull @ApiParam(value = "Número do Conhecimento",required=true)  @QueryParam("numeroConhecimento") String numeroConhecimento);
}

