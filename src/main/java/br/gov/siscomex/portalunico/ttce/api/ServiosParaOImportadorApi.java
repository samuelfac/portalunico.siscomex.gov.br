package br.gov.siscomex.portalunico.ttce.api;

import br.gov.siscomex.portalunico.ttce.model.DadosTratamentosTributariosImportacaoDTO;
import io.swagger.annotations.*;

import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

/**
 * Tratamento Tributário
 *
 * <p><html><h4>Introdução</h4><p>O <strong>Tratamento Tributário do Comércio Exterior (TT ou TTCE)</strong> é o sistema responsável pelo cálculo de tributos incidentes na Importação, Exportação e Transporte de mercadorias. Com base nas informações de NCM, país de origem e valor aduaneiro, o sistema retorna o cálculo dos tributos incidentes em uma operação do Comércio Exterior.</p><h4>URLs de Acesso</h4><p>Para utilizar os serviços disponíveis nessa API deve-se seguir o seguinte padrão de URL:</p><p><em>https://{ambiente}/<strong>ttce</strong>/api/{serviço}</em></p><p>Onde, em <strong>{ambiente}</strong> deve-se informar o ambiente desejado dentre os ambientes disponíveis na tabela abaixo e em <strong>{serviço}</strong> utilizar a URI do serviço desejado.</p><style type=\"text/css\">.tg {border-collapse:collapse;border-color:#bbb;border-spacing:0;width: 100%;}.tg td {background-color:#E0FFEB;border-color:#bbb;border-style:solid;border-width:1px;color:#594F4F;        font-family:Arial, sans-serif;font-size:14px;overflow:hidden;padding:10px 5px;word-break:normal;}.tg th {background-color:#9DE0AD;border-color:#bbb;border-style:solid;border-width:1px;color:#493F3F;        font-family:Arial, sans-serif;font-size:14px;font-weight:normal;overflow:hidden;padding:10px 5px;word-break:normal;}.tg .tg-cabecalho {text-align:left;vertical-align:top;}.tg .tg-corpo {border-color:inherit;text-align:left;vertical-align:top;}</style><table class=\"tg\" style=\"width: 100%;\"><thead><tr>      <th class=\"tg-cabecalho\"><span style=\"font-weight:bold\">Nome do Ambiente</span></th>      <th class=\"tg-cabecalho\"><span style=\"font-weight:bold\">URL de Acesso</span></th>      </tr></thead><tbody><tr><td class=\"tg-corpo\">Ambiente de Validação das Empresas</td>      <td class=\"tg-corpo\">val.portalunico.siscomex.gov.br</td></tr><tr>      <td class=\"tg-corpo\">Ambiente de Produção</td>      <td class=\"tg-corpo\">portalunico.siscomex.gov.br</td></tr></tbody></table><br/><p><strong>Exemplo:</strong> Para o serviço \"que retorna um arquivo para auxiliar o importador a preencher a seção de Tratamento Tributário da DUIMP\" a URI é <strong>\"/ext/tratamentos-tributarios/importacao/\"</strong>.</p><p>Logo, abaixo temos um exemplo de URL completa, considerando o ambiente de Produção, consumindo este serviço:</p><p><em><a target=\"_blank\" href=\"https://portalunico.siscomex.gov.br/ttce/api/ext/tratamentos-tributarios/importacao/\">https://portalunico.siscomex.gov.br/ttce/api/ext/tratamentos-tributarios/importacao/</em></p></html>
 *
 */
@Path("/")
@Api(value = "/", description = "")
public interface ServiosParaOImportadorApi  {

    /**
     * Serviço que retorna um arquivo para auxiliar o importador a preencher a lista de &#39;tributos&#39; no JSON do serviço para inclusão de itens na DUIMP. Este arquivo é gerado diariamente com os tratamentos tributários vigentes e contem os fundamentos legais normais que contenham atributos adicionais e todos os fundamentos legais opcionais (com ou sem atributos adicionais). O retorno deste serviço é um arquivo ZIP com um arquivo JSON.
     *
     * Serviço que retorna um arquivo para auxiliar o importador a preencher a lista de &#39;tributos&#39; no JSON do serviço para inclusão de itens na DUIMP. Este arquivo é gerado diariamente com os tratamentos tributários vigentes e contem os fundamentos legais normais que contenham atributos adicionais e todos os fundamentos legais opcionais (com ou sem atributos adicionais). O retorno deste serviço é um arquivo ZIP com um arquivo JSON.
     *
     */
    @GET
    @Path("/ext/tratamentos-tributarios/importacao/")
    @Produces({ "application/zip" })
    @ApiOperation(value = "Serviço que retorna um arquivo para auxiliar o importador a preencher a lista de 'tributos' no JSON do serviço para inclusão de itens na DUIMP. Este arquivo é gerado diariamente com os tratamentos tributários vigentes e contem os fundamentos legais normais que contenham atributos adicionais e todos os fundamentos legais opcionais (com ou sem atributos adicionais). O retorno deste serviço é um arquivo ZIP com um arquivo JSON.", notes = "Serviço que retorna um arquivo para auxiliar o importador a preencher a lista de 'tributos' no JSON do serviço para inclusão de itens na DUIMP. Este arquivo é gerado diariamente com os tratamentos tributários vigentes e contem os fundamentos legais normais que contenham atributos adicionais e todos os fundamentos legais opcionais (com ou sem atributos adicionais). O retorno deste serviço é um arquivo ZIP com um arquivo JSON.", tags={ "Serviços para o importador" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = DadosTratamentosTributariosImportacaoDTO.class),
        @ApiResponse(code = 400, message = "Requisição mal formatada"),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 404, message = "Recurso não encontrado"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
        @ApiResponse(code = 500, message = "Erro interno no servidor") })
    public Response downloadUsingGET1(@ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Recuperado no parâmetro Set-Token no response da autenticação." ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Recuperado no parâmetro X-CSRF-Token no response da autenticação." ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken);
}

