package br.gov.siscomex.portalunico.talpco.api;

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

import br.gov.siscomex.portalunico.talpco.model.CompatibilizacaoLpcoResponse;
import br.gov.siscomex.portalunico.talpco.model.JustificativaCompatibilizacaoRequest;
import br.gov.siscomex.portalunico.talpco.model.SolicitacaoCompatibilizacaoRequest;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * Tratamento Administrativo, Licenças, Permissões, Certificações e Outros Documentos
 *
 * <p><h3>TALPCO - Tratamento Administrativo, Licen&ccedil;as, Permiss&otilde;es, Certificados e Outros</h3><h4>Introdu&ccedil;&atilde;o</h4> <p>Bem-vindo &agrave; API do sistema Pucomex - TALPCO.</p> <p>O TALPCO &eacute; o sistema respons&aacute;vel pelo controle de documentos LPCO (Licen&ccedil;as, Permiss&otilde;es, Certificados e Outros) necess&aacute;rios para opera&ccedil;&otilde;es de com&eacute;rcio exterior. A partir deste sistema, &eacute; poss&iacute;vel gerenciar v&aacute;rias opera&ccedil;&otilde;es relativas aos LPCOs, desde a consulta de modelos de LPCO dispon&iacute;veis at&eacute; o cadastro de pedidos de LPCO e seu acompanhamento.</p> <p>As opera&ccedil;&otilde;es que podem ser gerenciadas pela API do sistema s&atilde;o:</p> <ul> <li>Consulta de modelos de LPCOs</li> <li>Cadastro de LPCOs</li> <li>Consulta de LPCOs</li> <li>Altera&ccedil;&otilde;es de situa&ccedil;&atilde;o (an&aacute;lise, deferimento, entre outros)</li> <li>Controle de exig&ecirc;ncias</li> <li>Altera&ccedil;&atilde;o e retifica&ccedil;&atilde;o de LPCOs</li> <li>Solicita&ccedil;&atilde;o de compabiliza&ccedil;&atilde;o de LPCO</li> <li>Controle de Prorroga&ccedil;&otilde;es</li> </ul> <h4>URLs de Acesso</h4> <p>Para utilizar os servi&ccedil;os dispon&iacute;veis nessa API deve-se seguir o seguinte padr&atilde;o de URL:</p> <p><em>https://{ambiente}/<strong>talpco</strong>/api/{servi&ccedil;o}</em></p> <p>Onde, em <strong>{ambiente}</strong> deve-se informar o ambiente desejado dentro os ambientes dispon&iacute;veis na tabela abaixo e em <strong>{servi&ccedil;o}</strong> utilizar a URI do servi&ccedil;o desejado.</p> <style type=\"text/css\">  .tg  {border-collapse:collapse;border-color:#bbb;border-spacing:0;width: 604px;}  .tg td{background-color:#E0FFEB;border-color:#bbb;border-style:solid;border-width:1px;color:#594F4F;  font-family:Arial, sans-serif;font-size:14px;overflow:hidden;padding:10px 5px;word-break:normal;}  .tg th{background-color:#9DE0AD;border-color:#bbb;border-style:solid;border-width:1px;color:#493F3F;  font-family:Arial, sans-serif;font-size:14px;font-weight:normal;overflow:hidden;padding:10px 5px;word-break:normal;}  .tg   .tg-cabecalho{text-align:left;vertical-align:top}.tg   .tg-corpo{border-color:inherit;text-align:left;vertical-align:top} </style> <table class=\"tg\" style=\"width: 604px;\"> <thead> <tr> <th class=\"tg-cabecalho\"><span style=\"font-weight:bold\">Nome do Ambiente</span></th> <th class=\"tg-cabecalho\"><span style=\"font-weight:bold\">URL de acesso</span></th> </tr> </thead> <tbody> <tr> <td class=\"tg-corpo\">Ambiente de Validação da Empresas</td> <td class=\"tg-corpo\">val.portalunico.siscomex.gov.br</td> </tr> <tr> <td class=\"tg-corpo\">Ambiente de Produção</td> <td class=\"tg-corpo\">portalunico.siscomex.gov.br</td> </tr> </tbody> </table> <p>&nbsp;</p> <p><strong>Exemplo:</strong> Para o servi&ccedil;o \"Detalhar LPCO\" a URI &eacute; \"/ext/lpco/{numero}\".</p> <p>Logo, abaixo temos um exemplo de URL completa considerando o ambiente de Valida&ccedil;&atilde;o, consumindo este servi&ccedil;o </p> <p><em>https://val.portalunico.siscomex.gov.br/talpco/api/ext/lpco/E2000000001</em></p> 
 *
 */
@Path("/")
@Api(value = "/", description = "")
public interface CompatibilizaoDeProdutosDeLpcOsApi  {

    /**
     * Aceitar solicitação de compatibilização de LPCO.
     *
     * &lt;p&gt; Disponível apenas para a Administração Pública.&lt;/p&gt;
     *
     */
    @PUT
    @Path("/ext/lpco/compatibilizacao/{numeroLpco}/aceitar")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Aceitar solicitação de compatibilização de LPCO.", notes = "<p> Disponível apenas para a Administração Pública.</p>", tags={ "Compatibilização de produtos de LPCOs" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = CompatibilizacaoLpcoResponse.class),
        @ApiResponse(code = 400, message = "Requisição mal formatada"),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
        @ApiResponse(code = 500, message = "Erro interno no servidor") })
    public Response aceitarSolicitacaoAlteracao(@ApiParam(value = "Número do LPCO para o qual será aceita a solicitação de compatibilização.<br>Tamanho: 11<br>Formato: OAANNNNNNNN<br>Lei de formação: O número do LPCO é composto por:<br>* O = Operação (E para exportação, I para importação)<br>* AA = Ano do registro do LPCO<br>* NNNNNNNN = Número sequencial do LPCO no ano",required=true) @PathParam("numeroLpco") String numeroLpco, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token é recuperado no parâmetro Set-Token no response da autenticação" ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Este token é recuperado no parâmetro X-CSRF-Token no response da autenticação" ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken, @ApiParam(value = "" )@Valid JustificativaCompatibilizacaoRequest body);

    /**
     * Cancelar solicitação de retificação de LPCO.
     *
     */
    @PUT
    @Path("/ext/lpco/compatibilizacao/{numeroLpco}/cancelar")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Cancelar solicitação de retificação de LPCO.", notes = "", tags={ "Compatibilização de produtos de LPCOs" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = CompatibilizacaoLpcoResponse.class),
        @ApiResponse(code = 400, message = "Requisição mal formatada"),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
        @ApiResponse(code = 500, message = "Erro interno no servidor") })
    public Response cancelarSolicitacaoAlteracao(@ApiParam(value = "Número do LPCO para o qual será cancelada a solicitação de retificação.<br>Tamanho: 11<br>Formato: OAANNNNNNNN<br>Lei de formação: O número do LPCO é composto por:<br>* O = Operação (E para exportação, I para importação)<br>* AA = Ano do registro do LPCO<br>* NNNNNNNN = Número sequencial do LPCO no ano",required=true) @PathParam("numeroLpco") String numeroLpco, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token é recuperado no parâmetro Set-Token no response da autenticação" ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Este token é recuperado no parâmetro X-CSRF-Token no response da autenticação" ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken, @ApiParam(value = "" )@Valid JustificativaCompatibilizacaoRequest body);

    /**
     * Solicitar Compatibilização de LPCO.
     *
     */
    @POST
    @Path("/ext/lpco/compatibilizacao/{numeroLpco}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Solicitar Compatibilização de LPCO.", notes = "", tags={ "Compatibilização de produtos de LPCOs" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = CompatibilizacaoLpcoResponse.class),
        @ApiResponse(code = 400, message = "Requisição mal formatada"),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
        @ApiResponse(code = 500, message = "Erro interno no servidor") })
    public Response inserirSolicitacaoAlteracao(@ApiParam(value = "Número do LPCO a ser compatibilizado.<br>Tamanho: 11<br>Formato: OAANNNNNNNN<br>Lei de formação: O número do LPCO é composto por:<br>* O = Operação (E para exportação, I para importação)<br>* AA = Ano do registro do LPCO<br>* NNNNNNNN = Número sequencial do LPCO no ano",required=true) @PathParam("numeroLpco") String numeroLpco, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token é recuperado no parâmetro Set-Token no response da autenticação" ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Este token é recuperado no parâmetro X-CSRF-Token no response da autenticação" ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken, @ApiParam(value = "" )@Valid SolicitacaoCompatibilizacaoRequest body);

    /**
     * Negar solicitação de compatiblização de LPCO.
     *
     * &lt;p&gt; Disponível apenas para a Administração Pública.&lt;/p&gt;
     *
     */
    @PUT
    @Path("/ext/lpco/compatibilizacao/{numeroLpco}/negar")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Negar solicitação de compatiblização de LPCO.", notes = "<p> Disponível apenas para a Administração Pública.</p>", tags={ "Compatibilização de produtos de LPCOs" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = CompatibilizacaoLpcoResponse.class),
        @ApiResponse(code = 400, message = "Requisição mal formatada"),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
        @ApiResponse(code = 500, message = "Erro interno no servidor") })
    public Response negarSolicitacaoAlteracaoDepreciada(@ApiParam(value = "Número do LPCO para o qual será negada a solicitação de compatiblização.<br>Tamanho: 11<br>Formato: OAANNNNNNNN<br>Lei de formação: O número do LPCO é composto por:<br>* O = Operação (E para exportação, I para importação)<br>* AA = Ano do registro do LPCO<br>* NNNNNNNN = Número sequencial do LPCO no ano",required=true) @PathParam("numeroLpco") String numeroLpco, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token é recuperado no parâmetro Set-Token no response da autenticação" ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Este token é recuperado no parâmetro X-CSRF-Token no response da autenticação" ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken, @ApiParam(value = "" )@Valid JustificativaCompatibilizacaoRequest body);

    /**
     * Detalhar Solicitação de Compatibilização pendentes de análise.
     *
     */
    @GET
    @Path("/ext/lpco/compatibilizacao/{numeroLpco}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Detalhar Solicitação de Compatibilização pendentes de análise.", notes = "", tags={ "Compatibilização de produtos de LPCOs" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = CompatibilizacaoLpcoResponse.class),
        @ApiResponse(code = 204, message = "Operação realizada com sucesso. Nemhum conteúdo retornado"),
        @ApiResponse(code = 400, message = "Requisição mal formatada"),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
        @ApiResponse(code = 500, message = "Erro interno no servidor") })
    public Response obterRetificacao(@ApiParam(value = "Número do LPCO a ser verificado.<br>Tamanho: 11<br>Formato: OAANNNNNNNN<br>Lei de formação: O número do LPCO é composto por:<br>* O = Operação (E para exportação, I para importação)<br>* AA = Ano do registro do LPCO<br>* NNNNNNNN = Número sequencial do LPCO no ano",required=true) @PathParam("numeroLpco") String numeroLpco, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token é recuperado no parâmetro Set-Token no response da autenticação" ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Este token é recuperado no parâmetro X-CSRF-Token no response da autenticação" ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken);
}

