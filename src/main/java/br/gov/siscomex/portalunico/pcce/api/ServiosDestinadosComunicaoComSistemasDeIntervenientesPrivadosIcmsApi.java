package br.gov.siscomex.portalunico.pcce.api;

import br.gov.siscomex.portalunico.pcce.model.DadosAnaliseSefazDTO;
import br.gov.siscomex.portalunico.pcce.model.DadosSolicitacaoIcmsDTO;
import br.gov.siscomex.portalunico.pcce.model.DeclaracaoIcmsDTO;
import br.gov.siscomex.portalunico.pcce.model.DuimpUFsCandidatasIcmsDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

/**
 * Pagamento Centralizado do Comércio Exterior
 *
 * <p><!DOCTYPE html><html><h4>Introdução</h4><p>O PCCE visa facilitar a validação e o acompanhamento do cumprimento da obrigação do ICMS, via PUCOMEX, junto às Sefaz/UF e o pagamento de tributos federais relativos à Declaração Única de Importação. Futuramente também será responsável pelos pagamentos dos demais tributos e taxas vinculados ao Comércio Exterior.</p><h4>URLs de Acesso</h4><p>Para utilizar os serviços disponíveis nessa API deve-se seguir o seguinte padrão de URL:</p><p><em>https://{ambiente}/<strong>pcce</strong>/api/{serviço}</em></p><p>Onde, em <strong>{ambiente}</strong> deve-se informar o ambiente desejado dentro os ambientes disponíveis na tabela abaixo e em <strong>{serviço}</strong> utilizar a URI do serviço desejado.</p><style type=\"text/css\">.tg  {border-collapse:collapse;border-color:#bbb;border-spacing:0;width: 100%;}.tg td{background-color:#E0FFEB;border-color:#bbb;border-style:solid;border-width:1px;color:#594F4F;  font-family:Arial, sans-serif;font-size:14px;overflow:hidden;padding:10px 5px;word-break:normal;}.tg th{background-color:#9DE0AD;border-color:#bbb;border-style:solid;border-width:1px;color:#493F3F;  font-family:Arial, sans-serif;font-size:14px;font-weight:normal;overflow:hidden;padding:10px 5px;word-break:normal;}.tg .tg-cabecalho{text-align:left;vertical-align:top}.tg .tg-corpo{border-color:inherit;text-align:left;vertical-align:top}</style><table class=\"tg\" style=\"width: 100%;\"><thead><tr>    <th class=\"tg-cabecalho\"><span style=\"font-weight:bold\">Nome do Ambiente</span></th>    <th class=\"tg-cabecalho\"><span style=\"font-weight:bold\">URL de acesso</span></th>  </tr></thead><tbody>  <tr>    <td class=\"tg-corpo\">Ambiente de Validação das Empresas</td>    <td class=\"tg-corpo\">val.portalunico.siscomex.gov.br</td>  </tr>  <tr>    <td class=\"tg-corpo\">Ambiente de Produção</td>    <td class=\"tg-corpo\">portalunico.siscomex.gov.br</td>  </tr></tbody></table><br/><p><strong>Exemplo:</strong> Para o serviço \"Confirmar crédito de pagamento de ICMS\" a URI é \"/ext/sefaz/icms/credito\".</p><p>Logo, abaixo temos um exemplo de URL completa considerando o ambiente de Produção, consumindo este serviço:</p><p><em>https://portalunico.siscomex.gov.br/pcce/api/ext/sefaz/icms/credito</em></p></html>
 */
@Path("/")
@Api(value = "/", description = "")
public interface ServiosDestinadosComunicaoComSistemasDeIntervenientesPrivadosIcmsApi {

    /**
     * Cancelar declaração de ICMS de Duimp
     * <p>
     * Serviço destinado a cancelar uma solicitação de pagamento/exoneração de ICMS de Duimp.
     */
    @PUT
    @Path("/ext/priv/icms/{numeroDuimp}/{versaoDuimp}/cancelamento")
    @ApiOperation(value = "Cancelar declaração de ICMS de Duimp", notes = "Serviço destinado a cancelar uma solicitação de pagamento/exoneração de ICMS de Duimp.", tags = {"Serviços destinados à comunicação com sistemas de Intervenientes Privados - ICMS"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Operação realizada com sucesso"),
            @ApiResponse(code = 400, message = "Requisição mal formatada"),
            @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
            @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
            @ApiResponse(code = 404, message = "Recurso não encontrado"),
            @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
            @ApiResponse(code = 500, message = "Erro interno no servidor")})
    Response cancelarDeclaracaoIcms(@ApiParam(value = "Número da Duimp<br>Formato: 'NNAANNNNNNNNNNN'<br>Tamanho: 15", required = true) @PathParam("numeroDuimp") String numeroDuimp, @ApiParam(value = "Versão da Duimp<br>Valor mínimo: 1<br>Valor máximo: 9999", required = true) @PathParam("versaoDuimp") String versaoDuimp, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Recuperado no parâmetro Set-Token no response da autenticação.", required = true) @HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Recuperado no parâmetro X-CSRF-Token no response da autenticação.", required = true) @HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * Consultar Declaração de Tributos Estaduais ativa de Duimp
     * <p>
     * Serviço destinado a consultar a Declaração de Tributos Estaduais ativa de uma Duimp.
     */
    @GET
    @Path("/ext/priv/icms/{numeroDuimp}")
    @Produces({"application/json"})
    @ApiOperation(value = "Consultar Declaração de Tributos Estaduais ativa de Duimp", notes = "Serviço destinado a consultar a Declaração de Tributos Estaduais ativa de uma Duimp.", tags = {"Serviços destinados à comunicação com sistemas de Intervenientes Privados - ICMS"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = DeclaracaoIcmsDTO.class),
            @ApiResponse(code = 400, message = "Requisição mal formatada"),
            @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
            @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
            @ApiResponse(code = 404, message = "Recurso não encontrado"),
            @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
            @ApiResponse(code = 500, message = "Erro interno no servidor")})
    Response consultarDeclaracaoIcms(@ApiParam(value = "Número da Duimp (sem hífen)<br>Formato: 'NNAANNNNNNNNNNN'<br>Tamanho: 15", required = true) @PathParam("numeroDuimp") String numeroDuimp, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Recuperado no parâmetro Set-Token no response da autenticação.", required = true) @HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Recuperado no parâmetro X-CSRF-Token no response da autenticação.", required = true) @HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * Consultar UFs candidatas à favorecida para o ICMS de Duimp
     * <p>
     * Serviço destinado a consultar as possíveis UFs Favorecidas, bem como os tipos de tratamento, tipos de declaração e opções de cálculo de ICMS disponíveis para a Duimp.
     */
    @GET
    @Path("/ext/priv/icms/{numeroDuimp}/ufs-favorecidas")
    @Produces({"application/json"})
    @ApiOperation(value = "Consultar UFs candidatas à favorecida para o ICMS de Duimp", notes = "Serviço destinado a consultar as possíveis UFs Favorecidas, bem como os tipos de tratamento, tipos de declaração e opções de cálculo de ICMS disponíveis para a Duimp.", tags = {"Serviços destinados à comunicação com sistemas de Intervenientes Privados - ICMS"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = DuimpUFsCandidatasIcmsDTO.class),
            @ApiResponse(code = 400, message = "Requisição mal formatada"),
            @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
            @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
            @ApiResponse(code = 404, message = "Recurso não encontrado"),
            @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
            @ApiResponse(code = 500, message = "Erro interno no servidor")})
    Response consultarUFsCandidatasFavorecida(@ApiParam(value = "Número da Duimp (sem hífen)<br>Formato: 'NNAANNNNNNNNNNN'<br>Tamanho: 15", required = true) @PathParam("numeroDuimp") String numeroDuimp, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Recuperado no parâmetro Set-Token no response da autenticação.", required = true) @HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Recuperado no parâmetro X-CSRF-Token no response da autenticação.", required = true) @HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * Solicitar pagamento/exoneração de ICMS para Duimp
     * <p>
     * Serviço destinado a criar uma solicitação de pagamento/exoneração de ICMS para Duimp.
     */
    @POST
    @Path("/ext/priv/icms")
    @Consumes({"application/json"})
    @ApiOperation(value = "Solicitar pagamento/exoneração de ICMS para Duimp", notes = "Serviço destinado a criar uma solicitação de pagamento/exoneração de ICMS para Duimp.", tags = {"Serviços destinados à comunicação com sistemas de Intervenientes Privados - ICMS"})
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Recurso criado com sucesso"),
            @ApiResponse(code = 400, message = "Requisição mal formatada"),
            @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
            @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
            @ApiResponse(code = 404, message = "Recurso não encontrado"),
            @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
            @ApiResponse(code = 500, message = "Erro interno no servidor")})
    Response criarDeclaracaoIcms(@ApiParam(value = "Dados da solicitação de pagamento/exoneração de ICMS", required = true) @Valid DadosSolicitacaoIcmsDTO body, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Recuperado no parâmetro Set-Token no response da autenticação.", required = true) @HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Recuperado no parâmetro X-CSRF-Token no response da autenticação.", required = true) @HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * Enviar solicitação de pagamento/exoneração de ICMS de Duimp para análise manual da Sefaz
     * <p>
     * Serviço destinado a enviar uma solicitação de pagamento/exoneração de ICMS de Duimp para análise manual da Sefaz. Utilizar apenas para solicitações com tratamento do tipo &#39;MANUAL&#39;.
     */
    @PUT
    @Path("/ext/priv/icms/{numeroDuimp}/{versaoDuimp}/analisesefaz")
    @Consumes({"application/json"})
    @ApiOperation(value = "Enviar solicitação de pagamento/exoneração de ICMS de Duimp para análise manual da Sefaz", notes = "Serviço destinado a enviar uma solicitação de pagamento/exoneração de ICMS de Duimp para análise manual da Sefaz. Utilizar apenas para solicitações com tratamento do tipo 'MANUAL'.", tags = {"Serviços destinados à comunicação com sistemas de Intervenientes Privados - ICMS"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Operação realizada com sucesso"),
            @ApiResponse(code = 400, message = "Requisição mal formatada"),
            @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
            @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
            @ApiResponse(code = 404, message = "Recurso não encontrado"),
            @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
            @ApiResponse(code = 500, message = "Erro interno no servidor")})
    Response enviarDeclaracaoIcmsAnaliseSefaz(@ApiParam(value = "Dados da solicitação de análise manual de pagamento/exoneração de ICMS", required = true) @Valid DadosAnaliseSefazDTO body, @ApiParam(value = "Número da Duimp<br>Formato: 'NNAANNNNNNNNNNN'<br>Tamanho: 15", required = true) @PathParam("numeroDuimp") String numeroDuimp, @ApiParam(value = "Versão da Duimp<br>Valor mínimo: 1<br>Valor máximo: 9999", required = true) @PathParam("versaoDuimp") String versaoDuimp, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Recuperado no parâmetro Set-Token no response da autenticação.", required = true) @HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Recuperado no parâmetro X-CSRF-Token no response da autenticação.", required = true) @HeaderParam("X-CSRF-Token") String xCSRFToken);
}

