package br.gov.siscomex.portalunico.ccta.api;

import br.gov.siscomex.portalunico.ccta.model.ManifestoCrt;
import br.gov.siscomex.portalunico.ccta.model.ManifestoViagem;
import br.gov.siscomex.portalunico.ccta.model.RetornoManifestoCrt;
import br.gov.siscomex.portalunico.ccta.model.RetornoManifestoViagem;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * Manifestação de Carga - Modal Rodoviário
 *
 * <p><h4>Introdução</h4><p style=\"margin-bottom: 1em; margin-top: 1em;\">Bem-vindo à Application Programming Interface (API) de interação com o  novo Sistema de Controle de Carga e Trânsito (CCT Importação - Modal Rodoviário). Trata-se de um conjunto de rotinas e  padrões de programação para acesso a um aplicativo de software baseado nos padrões Web, que permitirá a manifestação e gestão do fluxo logístico de viagens e cargas dentro do Portal Único de Comércio Exterior.</p><p style=\"margin-bottom: 1em; margin-top: 1em;\">Os perfis de acesso que podem utilizar cada serviço encontram-se listados no   manual do usuário. Na seção <a  href=\"https://docs.portalunico.siscomex.gov.br/introducao-api-publica/\">Introdução</a> da API do Portal Único de Comércio Exterior, podem ser encontradas as orientações gerais sobre os padrões de comunicação dos serviços, os procedimentos para autenticação e os códigos de resposta das requisições.</p><p style=\"margin-bottom: 1em; margin-top: 1em;\">Os serviços, a princípio, não estarão disponíveis no horário de 1:00h às 3:00h, em virtude de parada programada dos sistemas de comércio exterior.</p><h4>URLs de Acesso</h4><p style=\"margin-bottom: 1em; margin-top: 1em;\">Para utilizar os servi&ccedil;os dispon&iacute;veis nessa API deve-se seguir o seguinte padr&atilde;o de URL:</p><p style=\"margin-bottom: 1em; margin-top: 1em;\"><em>https://{ambiente}/<strong>ccta</strong>/{servi&ccedil;o}</em></p><p style=\"margin-bottom: 1em; margin-top: 1em;\">Onde, em <strong>{ambiente}</strong> deve-se informar o ambiente desejado dentro os ambientes dispon&iacute;veis na tabela abaixo e em <strong>{servi&ccedil;o}</strong> utilizar a URL do servi&ccedil;o desejado.</p><style type=\"text/css\"> .tg {  border-collapse: collapse;  border-color: #bbb;  border-spacing: 0;  width: 604px; } .tg td {  background-color: #E0FFEB;  border-color: #bbb;  border-style: solid;  border-width: 1px;  color: #594F4F;  font-family: Arial, sans-serif;  font-size: 14px;  overflow: hidden;  padding: 10px 5px;  word-break: normal; } .tg th {  background-color: #9DE0AD;  border-color: #bbb;  border-style: solid;  border-width: 1px;  color: #493F3F;  font-family: Arial, sans-serif;  font-size: 14px;  font-weight: normal;  overflow: hidden;  padding: 10px 5px;  word-break: normal; } .tg .tg-cabecalho {  text-align: left;  vertical-align: top } .tg .tg-corpo {  border-color: inherit;  text-align: left;  vertical-align: top }</style><span id=\"ip1\">&nbsp;</span><table class=\"tg\" style=\"width: 100%;\" aria-describedby=\"ip1\"> <thead>  <tr>   <th class=\"tg-cabecalho\"><span style=\"font-weight:bold\">Nome do ambiente</span></th>   <th class=\"tg-cabecalho\"><span style=\"font-weight:bold\">URL de acesso</span></th>   <th class=\"tg-cabecalho\"><span style=\"font-weight:bold\">Público alvo</span></th>  </tr> </thead> <tbody>  <tr>   <td class=\"tg-corpo\">Ambiente de Homologação</td>   <td class=\"tg-corpo\">hom.pucomex.serpro.gov.br</td>   <td class=\"tg-corpo\">Intervenientes Públicos</br>(conforme perfil de acesso)</td>  </tr>  <tr>   <td class=\"tg-corpo\">Ambiente de Validação das Empresas</td>   <td class=\"tg-corpo\">val.portalunico.siscomex.gov.br</td>   <td class=\"tg-corpo\">Intervenientes Privados</td>  </tr>  <!--  <tr>   <td class=\"\\tg-corpo\">Ambiente de Produção</td>   <td class=\"\\tg-corpo\">portalunico.siscomex.gov.br</td>   <td class=\"tg-corpo\">Todos Intervenientes</br>(públicos e privados)</td>  </tr>  --> </tbody></table><p style=\"margin-bottom: 1em; margin-top: 1em;\">&nbsp;</p><p style=\"margin-bottom: 1em; margin-top: 1em;\"><strong>Exemplo:</strong> Para o servi&ccedil;o \"Consultar Situação de Arquivos por Número de Protocolo\" a URL &eacute; \"/api/ext/check/received-files/{protocolNumber}\".</p><p style=\"margin-bottom: 1em; margin-top: 1em;\">Logo, abaixo temos um exemplo de URL completa considerando o ambiente de Valida&ccedil;&atilde;o, consumindo este servi&ccedil;o </p><p style=\"margin-bottom: 1em; margin-top: 1em;\"> <em>https://val.portalunico.siscomex.gov.br/ccta/api/ext/check/received-files/{protocolNumber}</em></p></br>
 *
 */
@Path("/")
@Api(value = "/", description = "")
public interface ServicosDeEnvioDeArquivosApi {

    /**
     * Informar Manifesto do CRT
     * <p>
     * &lt;p style&#x3D;\&quot;margin-bottom: 1em; margin-top: 1em;\&quot;&gt; Esse serviço tem por objetivo possibilitar a manifestação da carga pelo transportador nacional ou estrangeiro (este através de um representante CNPJ ou CPF)&lt;/p&gt;&lt;p style&#x3D;\&quot;margin-bottom: 1em; margin-top: 1em;\&quot;&gt; O processamento dessa manifestação é realizado de forma assíncrona, sendo retornado apenas o número de protocolo para consulta posterior.&lt;/p&gt;
     *
     */
    @POST
    @Path("/api/ext/rodoviario/manifestacao/conhecimento")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    @ApiOperation(value = "Informar Manifesto do CRT", notes = "<p style=\"margin-bottom: 1em; margin-top: 1em;\"> Esse serviço tem por objetivo possibilitar a manifestação da carga pelo transportador nacional ou estrangeiro (este através de um representante CNPJ ou CPF)</p><p style=\"margin-bottom: 1em; margin-top: 1em;\"> O processamento dessa manifestação é realizado de forma assíncrona, sendo retornado apenas o número de protocolo para consulta posterior.</p>", tags = {"Servicos de Envio de Arquivos"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = RetornoManifestoCrt.class),
            @ApiResponse(code = 400, message = "Requisição mal formatada"),
            @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
            @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
            @ApiResponse(code = 500, message = "Erro interno no servidor"),
            @ApiResponse(code = 204, message = "Operação realizada com sucesso. Nenhum conteúdo retornado"),
            @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
            @ApiResponse(code = 404, message = "Recurso não encontrado")})
    RetornoManifestoCrt doPostUsingPOST(@ApiParam(value = "", required = true) @Valid ManifestoCrt body, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token é recuperado no parâmetro Set-Token no response da autenticação", required = true) @HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Este token é recuperado no parâmetro X-CSRF-Token no response da autenticação", required = true) @HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * Informar Manifesto do Viagem
     * <p>
     * &lt;p style&#x3D;\&quot;margin-bottom: 1em; margin-top: 1em;\&quot;&gt; Esse serviço tem por objetivo possibilitar a manifestação da viagem pelo transportador nacional ou estrangeiro (este através de um representante CNPJ ou CPF)&lt;/p&gt;&lt;p style&#x3D;\&quot;margin-bottom: 1em; margin-top: 1em;\&quot;&gt; O processamento dessa manifestação é realizado de forma assíncrona, sendo retornado apenas o número de protocolo para consulta posterior.&lt;/p&gt;
     *
     */
    @POST
    @Path("/api/ext/rodoviario/manifestacao/viagem")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    @ApiOperation(value = "Informar Manifesto do Viagem", notes = "<p style=\"margin-bottom: 1em; margin-top: 1em;\"> Esse serviço tem por objetivo possibilitar a manifestação da viagem pelo transportador nacional ou estrangeiro (este através de um representante CNPJ ou CPF)</p><p style=\"margin-bottom: 1em; margin-top: 1em;\"> O processamento dessa manifestação é realizado de forma assíncrona, sendo retornado apenas o número de protocolo para consulta posterior.</p>", tags = {"Servicos de Envio de Arquivos"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = RetornoManifestoViagem.class),
            @ApiResponse(code = 400, message = "Requisição mal formatada"),
            @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
            @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
            @ApiResponse(code = 500, message = "Erro interno no servidor"),
            @ApiResponse(code = 204, message = "Operação realizada com sucesso. Nenhum conteúdo retornado"),
            @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
            @ApiResponse(code = 404, message = "Recurso não encontrado")})
    RetornoManifestoViagem manifestoViagemUsingPOST(@ApiParam(value = "", required = true) @Valid ManifestoViagem body, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token é recuperado no parâmetro Set-Token no response da autenticação", required = true) @HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Este token é recuperado no parâmetro X-CSRF-Token no response da autenticação", required = true) @HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * Retificar Manifesto do CRT
     * <p>
     * &lt;p style&#x3D;\&quot;margin-bottom: 1em; margin-top: 1em;\&quot;&gt; Esse serviço tem por objetivo possibilitar a retificação da carga pelo transportador nacional ou estrangeiro (este através de um representante CNPJ ou CPF)&lt;/p&gt;&lt;p style&#x3D;\&quot;margin-bottom: 1em; margin-top: 1em;\&quot;&gt; O processamento dessa retificação é realizado de forma assíncrona, sendo retornado apenas o número de protocolo para consulta posterior.&lt;/p&gt;
     *
     */
    @PUT
    @Path("/api/ext/rodoviario/manifestacao/conhecimento")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    @ApiOperation(value = "Retificar Manifesto do CRT", notes = "<p style=\"margin-bottom: 1em; margin-top: 1em;\"> Esse serviço tem por objetivo possibilitar a retificação da carga pelo transportador nacional ou estrangeiro (este através de um representante CNPJ ou CPF)</p><p style=\"margin-bottom: 1em; margin-top: 1em;\"> O processamento dessa retificação é realizado de forma assíncrona, sendo retornado apenas o número de protocolo para consulta posterior.</p>", tags = {"Servicos de Envio de Arquivos"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = RetornoManifestoCrt.class),
            @ApiResponse(code = 400, message = "Requisição mal formatada"),
            @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
            @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
            @ApiResponse(code = 500, message = "Erro interno no servidor"),
            @ApiResponse(code = 204, message = "Operação realizada com sucesso. Nenhum conteúdo retornado"),
            @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
            @ApiResponse(code = 404, message = "Recurso não encontrado")})
    RetornoManifestoCrt retificarUsingPUT(@ApiParam(value = "", required = true) @Valid ManifestoCrt body, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token é recuperado no parâmetro Set-Token no response da autenticação", required = true) @HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Este token é recuperado no parâmetro X-CSRF-Token no response da autenticação", required = true) @HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * Retificar Manifesto do Viagem
     * <p>
     * &lt;p style&#x3D;\&quot;margin-bottom: 1em; margin-top: 1em;\&quot;&gt; Esse serviço tem por objetivo possibilitar a retificação da viagem pelo transportador nacional ou estrangeiro (este através de um representante CNPJ ou CPF)&lt;/p&gt;&lt;p style&#x3D;\&quot;margin-bottom: 1em; margin-top: 1em;\&quot;&gt; O processamento dessa retificação é realizado de forma assíncrona, sendo retornado apenas o número de protocolo para consulta posterior.&lt;/p&gt;
     *
     */
    @PUT
    @Path("/api/ext/rodoviario/manifestacao/viagem")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    @ApiOperation(value = "Retificar Manifesto do Viagem", notes = "<p style=\"margin-bottom: 1em; margin-top: 1em;\"> Esse serviço tem por objetivo possibilitar a retificação da viagem pelo transportador nacional ou estrangeiro (este através de um representante CNPJ ou CPF)</p><p style=\"margin-bottom: 1em; margin-top: 1em;\"> O processamento dessa retificação é realizado de forma assíncrona, sendo retornado apenas o número de protocolo para consulta posterior.</p>", tags = {"Servicos de Envio de Arquivos"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = RetornoManifestoViagem.class),
            @ApiResponse(code = 400, message = "Requisição mal formatada"),
            @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
            @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
            @ApiResponse(code = 500, message = "Erro interno no servidor"),
            @ApiResponse(code = 204, message = "Operação realizada com sucesso. Nenhum conteúdo retornado"),
            @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
            @ApiResponse(code = 404, message = "Recurso não encontrado")})
    RetornoManifestoViagem retificarUsingPUT1(@ApiParam(value = "", required = true) @Valid ManifestoViagem body, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token é recuperado no parâmetro Set-Token no response da autenticação", required = true) @HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Este token é recuperado no parâmetro X-CSRF-Token no response da autenticação", required = true) @HeaderParam("X-CSRF-Token") String xCSRFToken);
}

