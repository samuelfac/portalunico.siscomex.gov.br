package br.gov.siscomex.portalunico.pcce.api;

import br.gov.siscomex.portalunico.pcce.model.*;
import io.swagger.annotations.*;

import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.List;

/**
 * Pagamento Centralizado do Comércio Exterior
 *
 * <p><!DOCTYPE html><html><h4>Introdução</h4><p>O PCCE visa facilitar a validação e o acompanhamento do cumprimento da obrigação do ICMS, via PUCOMEX, junto às Sefaz/UF e o pagamento de tributos federais relativos à Declaração Única de Importação. Futuramente também será responsável pelos pagamentos dos demais tributos e taxas vinculados ao Comércio Exterior.</p><h4>URLs de Acesso</h4><p>Para utilizar os serviços disponíveis nessa API deve-se seguir o seguinte padrão de URL:</p><p><em>https://{ambiente}/<strong>pcce</strong>/api/{serviço}</em></p><p>Onde, em <strong>{ambiente}</strong> deve-se informar o ambiente desejado dentro os ambientes disponíveis na tabela abaixo e em <strong>{serviço}</strong> utilizar a URI do serviço desejado.</p><style type=\"text/css\">.tg  {border-collapse:collapse;border-color:#bbb;border-spacing:0;width: 100%;}.tg td{background-color:#E0FFEB;border-color:#bbb;border-style:solid;border-width:1px;color:#594F4F;  font-family:Arial, sans-serif;font-size:14px;overflow:hidden;padding:10px 5px;word-break:normal;}.tg th{background-color:#9DE0AD;border-color:#bbb;border-style:solid;border-width:1px;color:#493F3F;  font-family:Arial, sans-serif;font-size:14px;font-weight:normal;overflow:hidden;padding:10px 5px;word-break:normal;}.tg .tg-cabecalho{text-align:left;vertical-align:top}.tg .tg-corpo{border-color:inherit;text-align:left;vertical-align:top}</style><table class=\"tg\" style=\"width: 100%;\"><thead><tr>    <th class=\"tg-cabecalho\"><span style=\"font-weight:bold\">Nome do Ambiente</span></th>    <th class=\"tg-cabecalho\"><span style=\"font-weight:bold\">URL de acesso</span></th>  </tr></thead><tbody><tr>    <td class=\"tg-corpo\">Ambiente de Produção</td>    <td class=\"tg-corpo\">portalunico.siscomex.gov.br</td>  </tr></tbody></table><br/><p><strong>Exemplo:</strong> Para o serviço \"Confirmar crédito de pagamento de ICMS\" a URI é \"/ext/sefaz/icms/credito\".</p><p>Logo, abaixo temos um exemplo de URL completa considerando o ambiente de Produção, consumindo este serviço:</p><p><em>https://portalunico.siscomex.gov.br/pcce/api/ext/sefaz/icms/credito</em></p></html>
 *
 */
@Path("/")
@Api(value = "/", description = "")
public interface ServiosDestinadosComunicaoComSistemasDasSefazApi  {

    /**
     * Alterar opção de cálculo de ICMS
     *
     * Altera os dados e/ou inativa uma opção de cálculo de ICMS.
     *
     */
    @PUT
    @Path("/ext/sefaz/opcao/{id}")
    @Consumes({ "*/*" })
    @ApiOperation(value = "Alterar opção de cálculo de ICMS", notes = "Altera os dados e/ou inativa uma opção de cálculo de ICMS.", tags={ "Serviços destinados à comunicação com sistemas das Sefaz" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Operação realizada com sucesso"),
        @ApiResponse(code = 400, message = "Requisição mal formatada"),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 404, message = "Recurso não encontrado"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
        @ApiResponse(code = 500, message = "Erro interno no servidor") })
    public Response alterarOpcaoICMS(@ApiParam(value = "Dados da opção de ICMS a alterar" ,required=true)@Valid OpcaoIcmsAlteracaoDto body, @ApiParam(value = "Identificador único da opção no PCCE",required=true) @PathParam("id") Long id, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Recuperado no parâmetro Set-Token no response da autenticação." ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Recuperado no parâmetro X-CSRF-Token no response da autenticação." ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * Cadastrar opções para cálculo de ICMS
     *
     * Recebe da Sefaz os dados referentes às opções que serão disponibilizadas para o importador na solicitação de cálculo de ICMS.
     *
     */
    @POST
    @Path("/ext/sefaz/opcao")
    @Consumes({ "application/json" })
    @ApiOperation(value = "Cadastrar opções para cálculo de ICMS", notes = "Recebe da Sefaz os dados referentes às opções que serão disponibilizadas para o importador na solicitação de cálculo de ICMS.", tags={ "Serviços destinados à comunicação com sistemas das Sefaz" })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Recurso criado com sucesso"),
        @ApiResponse(code = 400, message = "Requisição mal formatada"),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 404, message = "Recurso não encontrado"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
        @ApiResponse(code = 500, message = "Erro interno no servidor") })
    public Response cadastrarOpcoesIcms(@ApiParam(value = "Lista de opções de ICMS a cadastrar" ,required=true)@Valid List<OpcaoIcmsDto> body, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Recuperado no parâmetro Set-Token no response da autenticação." ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Recuperado no parâmetro X-CSRF-Token no response da autenticação." ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * Confirmar crédito de pagamento de ICMS
     *
     * Recebe da Sefaz a confirmação de crédito de pagamento de ICMS.
     *
     */
    @POST
    @Path("/ext/sefaz/icms/credito")
    @Consumes({ "application/json" })
    @ApiOperation(value = "Confirmar crédito de pagamento de ICMS", notes = "Recebe da Sefaz a confirmação de crédito de pagamento de ICMS.", tags={ "Serviços destinados à comunicação com sistemas das Sefaz" })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Recurso criado com sucesso"),
        @ApiResponse(code = 400, message = "Requisição mal formatada"),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 404, message = "Recurso não encontrado"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
        @ApiResponse(code = 500, message = "Erro interno no servidor") })
    public Response confirmarCreditoPagamentoIcms(@ApiParam(value = "Dados da confirmação de crédito de ICMS" ,required=true)@Valid SefazCreditoIcmsDto body, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Recuperado no parâmetro Set-Token no response da autenticação." ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Recuperado no parâmetro X-CSRF-Token no response da autenticação." ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * Consultar declarações de ICMS
     *
     * Consulta dados das declarações de ICMS no PCCE.
     *
     */
    @GET
    @Path("/ext/sefaz/icms/consulta/{numDeclaracao}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Consultar declarações de ICMS", notes = "Consulta dados das declarações de ICMS no PCCE.", tags={ "Serviços destinados à comunicação com sistemas das Sefaz" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = SolicitacaoIcmsDto.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Requisição mal formatada"),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 404, message = "Recurso não encontrado"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
        @ApiResponse(code = 500, message = "Erro interno no servidor") })
    public Response consultarDeclaracoesIcmsSefaz(@ApiParam(value = "Número da Duimp (sem hífen e sem versão)",required=true) @PathParam("numDeclaracao") String numDeclaracao, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Recuperado no parâmetro Set-Token no response da autenticação." ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Recuperado no parâmetro X-CSRF-Token no response da autenticação." ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * Consultar opções de cálculo de ICMS
     *
     * Retorna a lista de opções de cálculo de ICMS cadastradas para a Sefaz.
     *
     */
    @GET
    @Path("/ext/sefaz/opcao")
    @Produces({ "application/json" })
    @ApiOperation(value = "Consultar opções de cálculo de ICMS", notes = "Retorna a lista de opções de cálculo de ICMS cadastradas para a Sefaz.", tags={ "Serviços destinados à comunicação com sistemas das Sefaz" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = OpcaoIcmsConsultaDto.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Requisição mal formatada"),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 404, message = "Recurso não encontrado"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
        @ApiResponse(code = 500, message = "Erro interno no servidor") })
    public Response consultarOpcoesICMS(@ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Recuperado no parâmetro Set-Token no response da autenticação." ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Recuperado no parâmetro X-CSRF-Token no response da autenticação." ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * Consultar solicitação de cálculo de ICMS pendente
     *
     * Consulta de solicitação de cálculo de ICMS pendente.
     *
     */
    @GET
    @Path("/ext/sefaz/icms/consulta/calculo/{numDeclaracao}/{versaoDeclaracao}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Consultar solicitação de cálculo de ICMS pendente", notes = "Consulta de solicitação de cálculo de ICMS pendente.", tags={ "Serviços destinados à comunicação com sistemas das Sefaz" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = SolicitacaoCalculoIcmsDto.class),
        @ApiResponse(code = 400, message = "Requisição mal formatada"),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 404, message = "Recurso não encontrado"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
        @ApiResponse(code = 500, message = "Erro interno no servidor") })
    public Response consultarSolicitacaoCalculoIcmsSefaz(@ApiParam(value = "Número da Duimp (sem hífen)",required=true) @PathParam("numDeclaracao") String numDeclaracao, @ApiParam(value = "Versão da Duimp",required=true) @PathParam("versaoDeclaracao") Integer versaoDeclaracao, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Recuperado no parâmetro Set-Token no response da autenticação." ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Recuperado no parâmetro X-CSRF-Token no response da autenticação." ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * Excluir opção de cálculo de ICMS
     *
     * Exclui uma opção de cálculo de ICMS.
     *
     */
    @DELETE
    @Path("/ext/sefaz/opcao/{id}")
    @ApiOperation(value = "Excluir opção de cálculo de ICMS", notes = "Exclui uma opção de cálculo de ICMS.", tags={ "Serviços destinados à comunicação com sistemas das Sefaz" })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Operação realizada com sucesso. Nenhum conteúdo retornado"),
        @ApiResponse(code = 400, message = "Requisição mal formatada"),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 404, message = "Recurso não encontrado"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
        @ApiResponse(code = 500, message = "Erro interno no servidor") })
    public Response excluirOpcaoICMS(@ApiParam(value = "Identificador único da opção no PCCE",required=true) @PathParam("id") Long id, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Recuperado no parâmetro Set-Token no response da autenticação." ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Recuperado no parâmetro X-CSRF-Token no response da autenticação." ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * Cancelar guia de pagamento de ICMS
     *
     * Registra o cancelamento de uma guia de pagamento de ICMS.
     *
     */
    @PUT
    @Path("/ext/sefaz/icms/guia/{numDeclaracao}/{versaoDeclaracao}/{codigoBarras}")
    @ApiOperation(value = "Cancelar guia de pagamento de ICMS", notes = "Registra o cancelamento de uma guia de pagamento de ICMS.", tags={ "Serviços destinados à comunicação com sistemas das Sefaz" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Operação realizada com sucesso"),
        @ApiResponse(code = 400, message = "Requisição mal formatada"),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 404, message = "Recurso não encontrado"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
        @ApiResponse(code = 500, message = "Erro interno no servidor") })
    public Response receberCancelamentoGuiaPagamentoIcms(@ApiParam(value = "Número da Duimp (sem hífen)",required=true) @PathParam("numDeclaracao") String numDeclaracao, @ApiParam(value = "Versão da Duimp",required=true) @PathParam("versaoDeclaracao") String versaoDeclaracao, @ApiParam(value = "Código de barras da guia",required=true) @PathParam("codigoBarras") String codigoBarras, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Recuperado no parâmetro Set-Token no response da autenticação." ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Recuperado no parâmetro X-CSRF-Token no response da autenticação." ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * Receber dados de declaração de ICMS da Sefaz
     *
     * Recebe da Sefaz os dados referentes ao cálculo de ICMS para criação automática da declaração de ICMS no Pucomex.
     *
     */
    @POST
    @Path("/ext/sefaz/icms")
    @Consumes({ "application/json" })
    @ApiOperation(value = "Receber dados de declaração de ICMS da Sefaz", notes = "Recebe da Sefaz os dados referentes ao cálculo de ICMS para criação automática da declaração de ICMS no Pucomex.", tags={ "Serviços destinados à comunicação com sistemas das Sefaz" })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Recurso criado com sucesso"),
        @ApiResponse(code = 400, message = "Requisição mal formatada"),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 404, message = "Recurso não encontrado"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
        @ApiResponse(code = 500, message = "Erro interno no servidor") })
    public Response receberDadosDeclaracaoIcmsSefaz(@ApiParam(value = "Dados da declaração de ICMS" ,required=true)@Valid SefazDadosIcmsDto body, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Recuperado no parâmetro Set-Token no response da autenticação." ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Recuperado no parâmetro X-CSRF-Token no response da autenticação." ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * Cadastrar guia de pagamento de ICMS
     *
     * Cadastra uma guia de pagamento de ICMS recebida da Sefaz.
     *
     */
    @POST
    @Path("/ext/sefaz/icms/guia")
    @Consumes({ "application/json" })
    @ApiOperation(value = "Cadastrar guia de pagamento de ICMS", notes = "Cadastra uma guia de pagamento de ICMS recebida da Sefaz.", tags={ "Serviços destinados à comunicação com sistemas das Sefaz" })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Recurso criado com sucesso"),
        @ApiResponse(code = 400, message = "Requisição mal formatada"),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 404, message = "Recurso não encontrado"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
        @ApiResponse(code = 500, message = "Erro interno no servidor") })
    public Response receberGuiaPagamentoIcms(@ApiParam(value = "Dados da guia de pagamento de ICMS" ,required=true)@Valid SefazInclusaoGuiaIcmsDto body, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Recuperado no parâmetro Set-Token no response da autenticação." ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Recuperado no parâmetro X-CSRF-Token no response da autenticação." ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken);
}

