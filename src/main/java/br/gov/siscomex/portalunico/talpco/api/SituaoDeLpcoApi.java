package br.gov.siscomex.portalunico.talpco.api;

import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import br.gov.siscomex.portalunico.talpco.model.AlterarSituacaoLpcoRequest;
import br.gov.siscomex.portalunico.talpco.model.AlterarSituacaoLpcoResponse;
import br.gov.siscomex.portalunico.talpco.model.IdDescricao;
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
public interface SituaoDeLpcoApi  {

    /**
     * Alterar a situação de um LPCO.
     *
     */
    @PUT
    @Path("/ext/lpco/situacao/{numero}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Alterar a situação de um LPCO.", notes = "", tags={ "Situação de LPCO" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = AlterarSituacaoLpcoResponse.class),
        @ApiResponse(code = 400, message = "Requisição mal formatada"),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
        @ApiResponse(code = 500, message = "Erro interno no servidor") })
    public Response alterarSituacao(@ApiParam(value = "Número do LPCO que terá a situação alterada.<br>Tamanho: 11<br>Formato: OAANNNNNNNN<br>Lei de formação: O número do LPCO é composto por:<br>* O = Operação (E para exportação, I para importação)<br>* AA = Ano do registro do LPCO<br>* NNNNNNNN = Número sequencial do LPCO no ano",required=true) @PathParam("numero") String numero, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token é recuperado no parâmetro Set-Token no response da autenticação" ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Este token é recuperado no parâmetro X-CSRF-Token no response da autenticação" ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken, @ApiParam(value = "" )@Valid AlterarSituacaoLpcoRequest body);

    /**
     * Consultar as Possíveis Situações de Destino de LPCO.
     *
     */
    @GET
    @Path("/ext/lpco/situacao/{numero}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Consultar as Possíveis Situações de Destino de LPCO.", notes = "", tags={ "Situação de LPCO" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = IdDescricao.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Requisição mal formatada"),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
        @ApiResponse(code = 500, message = "Erro interno no servidor") })
    public Response listarSituacoesDestino(@ApiParam(value = "Número do LPCO para o qual serão listadas as situações de destino.<br>Tamanho: 11<br>Formato: OAANNNNNNNN<br>Lei de formação: O número do LPCO é composto por:<br>* O = Operação (E para exportação, I para importação)<br>* AA = Ano do registro do LPCO<br>* NNNNNNNN = Número sequencial do LPCO no ano",required=true) @PathParam("numero") String numero, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token é recuperado no parâmetro Set-Token no response da autenticação" ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Este token é recuperado no parâmetro X-CSRF-Token no response da autenticação" ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken);
}

