package br.gov.siscomex.portalunico.ccta.api;

import javax.validation.constraints.NotNull;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

import br.gov.siscomex.portalunico.ccta.model.ChaveViagem;
import br.gov.siscomex.portalunico.ccta.model.ViagemConsultaDetalhada;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * Controle de Carga e Trânsito Importação - Modal Aéreo
 *
 * <p><h3 align=\"left\">CCT Importa&ccedil;&atilde;o</h3><h4 align=\"left\">Introdu&ccedil;&atilde;o</h4><p>Bem-vindo &agrave; Application Programming Interface (API) provis&oacute;ria de intera&ccedil;&atilde;o entre transportadores (Cias. A&eacute;reas), agentes de carga, operadores de remessa postal/expressa, recintos aduaneiros e o novo Sistema de Controle de Carga e Tr&acirc;nsito (CCT Importa&ccedil;&atilde;o - Modal A&eacute;reo). Trata-se de um conjunto de rotinas e padr&otilde;es de programa&ccedil;&atilde;o para acesso a um aplicativo de software baseado nos padr&otilde;es Web, que permitir&aacute; a manifesta&ccedil;&atilde;o e gest&atilde;o do fluxo log&iacute;stico de viagens e cargas dentro do Portal &Uacute;nico de Com&eacute;rcio Exterior.</p><p>A documenta&ccedil;&atilde;o a seguir descreve os servi&ccedil;os da vers&atilde;o atual do sistema, dispon&iacute;vel no ambiente de valida&ccedil;&atilde;o do setor privado. Os demais servi&ccedil;os encontram-se em desenvolvimento. N&atilde;o h&aacute;, at&eacute; o momento, vers&atilde;o dispon&iacute;vel para uso em produ&ccedil;&atilde;o. O intuito da API &eacute; permitir que as empresas possam iniciar seus testes, preparando as adapta&ccedil;&otilde;es necess&aacute;rias em seus sistemas. As informa&ccedil;&otilde;es encaminhadas para os endpoints, neste momento, n&atilde;o ter&atilde;o valor legal, nem ser&atilde;o reaproveitadas em produ&ccedil;&atilde;o.</p><p>Nesta vers&atilde;o, todos os servi&ccedil;os listados devem ser acessados por empresas cadastradas como Transportador ou Agente de Carga, utilizando o perfil de acesso &ldquo;TRANSPORT&rdquo;. Os recintos aduaneiros devem utilizar os servi&ccedil;os disponibilizados pelo Sistema Recintos. Os operadores de remessa postal/expressa ser&atilde;o inclu&iacute;dos em vers&atilde;o futura.</p><p>Para a utiliza&ccedil;&atilde;o dos servi&ccedil;os do CCT Importa&ccedil;&atilde;o &ndash; Modal A&eacute;reo, a autentica&ccedil;&atilde;o via certifica&ccedil;&atilde;o digital &eacute; obrigat&oacute;ria. Na se&ccedil;&atilde;o &ldquo;Introdu&ccedil;&atilde;o&rdquo; da API do Portal &Uacute;nico de Com&eacute;rcio Exterior, podem ser encontradas as orienta&ccedil;&otilde;es gerais sobre os padr&otilde;es de comunica&ccedil;&atilde;o dos servi&ccedil;os, os procedimentos para autentica&ccedil;&atilde;o e os c&oacute;digos de resposta das requisi&ccedil;&otilde;es.</p><p>Os arquivos referentes &agrave; manifesta&ccedil;&atilde;o de viagens e cargas devem seguir o padr&atilde;o Cargo XML da IATA (Associa&ccedil;&atilde;o Internacional de Transportes A&eacute;reos). Para conhecimento dos elementos de dados, estrutura e formato do padr&atilde;o XSD, deve-se buscar a informa&ccedil;&atilde;o no site da IATA (www.iata.org). Nesta API, ser&atilde;o detalhadas somente as informa&ccedil;&otilde;es solicitadas de forma diferente do padr&atilde;o IATA.</p><p>Ser&atilde;o solicitados os arquivos XFFM, XFWB, XFZB e XFHL, a serem enviados pelos servi&ccedil;os abaixo, descritos em maiores detalhes nas suas respectivas se&ccedil;&otilde;es desta API:</p><ul><li>Informar Viagem - XFFM (Flight Manifest)</li><li>Informar Conhecimento de Carga - XFWB (Freight Waybill)</li><li>Informar Conhecimento de Carga House - XFZB (House Air Waybill)</li><li>Informar Associa&ccedil;&atilde;o Master e House - XFHL (House Manifest)</li></ul><p>Os arquivos somente ser&atilde;o recebidos caso o XML esteja de acordo com o XSD da IATA. Os arquivos corretamente validados passar&atilde;o &agrave; situa&ccedil;&atilde;o &quot;<em>Received</em>&quot; e receber&atilde;o um n&uacute;mero de protocolo associado ao recebimento desse arquivo, sendo encaminhados para processamento. Os arquivos que n&atilde;o forem validados pelo XSD da IATA ter&atilde;o situa&ccedil;&atilde;o &quot;<em>Rejected</em>&quot; e n&atilde;o receber&atilde;o n&uacute;mero de protocolo.</p><p>Ap&oacute;s a valida&ccedil;&atilde;o do XSD, ser&aacute; realizado o processamento do conte&uacute;do dos campos dos arquivos. Este processamento inclui verifica&ccedil;&otilde;es, tais como: se o campo foi informado vazio ou acima do tamanho permitido, se as informa&ccedil;&otilde;es constam no cadastro da Receita Federal (CPF, CNPJ), etc., com vistas &agrave; grava&ccedil;&atilde;o do dado na base. Os arquivos corretamente processados passar&atilde;o &agrave; situa&ccedil;&atilde;o &quot;<em>Processed</em>&quot;, e os que apresentarem algum tipo de erro passar&atilde;o para &quot;<em>Rejected</em>&quot;.</p><p>A qualquer momento, a situa&ccedil;&atilde;o dos arquivos enviados pode ser consultada pelos seguintes servi&ccedil;os descritos nesta API:</p><ul><li>Consultar Situa&ccedil;&atilde;o de Arquivos por Data</li><li>Consultar Situa&ccedil;&atilde;o de Arquivos por N&uacute;mero de Protocolo</li></ul><p>Durante o processamento, haver&aacute; batimento do conte&uacute;do dos dados com tabelas de dom&iacute;nio. Os dom&iacute;nios que est&atilde;o sendo validados e que podem causar rejei&ccedil;&atilde;o de arquivo referem-se a:</p><ul><li>Aeroportos (c&oacute;digo com tr&ecirc;s posi&ccedil;&otilde;es) - IATA Airport Code (&#42;)</li><li>Companhia A&eacute;rea (n&uacute;mero com tr&ecirc;s posi&ccedil;&otilde;es e c&oacute;digo com duas posi&ccedil;&otilde;es) - IATA Airline Codes</li><li>Indicador de Parcialidade de carga numa viagem - IATA Code List 1.15</li><li>Moeda (c&oacute;digo alfanum&eacute;rico com tr&ecirc;s posi&ccedil;&otilde;es) - ISO 4217</li><li>Pa&iacute;ses (sigla com duas posi&ccedil;&otilde;es) &ndash; ISO 3166</li><li>Recinto Aduaneiro (c&oacute;digo com sete posi&ccedil;&otilde;es) &ndash; site da Receita Federal do Brasil</li><li>Unidade de Medida (Peso) - rec20_Rev10e_2014.xls do site <a href=\"http://www.unece.org/uncefact/codelistrecs.html\">http://www.unece.org/uncefact/codelistrecs.html</a></li><li>Unidade de Medida (Volume) - IATA Code List 1.20</li><li>Voos - C&oacute;digo de voo com duas posi&ccedil;&otilde;es alfanum&eacute;ricas referentes &agrave; Companhia A&eacute;rea e quatro posi&ccedil;&otilde;es num&eacute;ricas referentes ao n&uacute;mero do voo.</li></ul><p>(&#42;) Na vers&atilde;o atual, ser&aacute; aceita uma lista reduzida de aeroportos, informada no final desta se&ccedil;&atilde;o. Em vers&atilde;o futura, a lista ser&aacute; ampliada para todos os aeroportos cadastrados.</p><p>A lista de campos a serem informados e a defini&ccedil;&atilde;o de se eles s&atilde;o obrigat&oacute;rios ou opcionais seguir&atilde;o, via de regra, os padr&otilde;es estabelecidos pela IATA, passando pela valida&ccedil;&atilde;o do XSD. As exce&ccedil;&otilde;es ser&atilde;o mencionadas explicitamente na descri&ccedil;&atilde;o dos servi&ccedil;os na API, fazendo parte do processamento dos arquivos. Os tipos e tamanhos de campos tamb&eacute;m seguir&atilde;o, via de regra, os padr&otilde;es estabelecidos pela IATA e, quando n&atilde;o validados pelo XSD, ser&atilde;o verificados no processamento.</p><p>Ser&atilde;o processados os seguintes tipos de opera&ccedil;&atilde;o para os arquivos:</p><ul><li>XFFM &ndash; Creation</li><li>XFWB, XFZB, XFHL &ndash; Creation, Update e Deletion</li></ul><p>Os arquivos XFFM, XFWB, XFZB e XFHL podem ser enviados em qualquer ordem, desde que cumpram com os prazos estabelecidos pela Receita Federal do Brasil.</p><p>O escopo atual do projeto se encontra restrito a voos regulares. Voos n&atilde;o regulares ser&atilde;o objeto de vers&otilde;es futuras.</p><p>Os servi&ccedil;os de recebimento e consulta de arquivos, a princ&iacute;pio, n&atilde;o estar&atilde;o dispon&iacute;veis no hor&aacute;rio de 1:00h &agrave;s 3:00h, em virtude de parada programada dos sistemas de com&eacute;rcio exterior.</p><p><strong>URLs de Acesso</strong></p><p>Para utilizar os servi&ccedil;os dispon&iacute;veis nessa API deve-se seguir o seguinte padr&atilde;o de URL:</p><p><em>https://{ambiente}/</em><strong>ccta</strong><em>/api/{servi&ccedil;o}</em></p><p>Onde, em <strong>{ambiente} </strong>deve-se informar o ambiente desejado dentro os ambientes dispon&iacute;veis na tabela abaixo e em <strong>{servi&ccedil;o} </strong>utilizar a URI do servi&ccedil;o desejado.</p><table style=\"width: 604px;\"><thead><tr><th>Nome do Ambiente</th><th>URL de acesso</th></tr></thead><tbody><tr><td>Ambiente de Valida&ccedil;&atilde;o da Empresas</td><td>val.portalunico.siscomex.gov.br</td></tr></tbody></table><p>&nbsp;</p><p><strong>Exemplo: </strong>Para o servi&ccedil;o &quot;Consultar Situa&ccedil;&atilde;o de Arquivos por N&uacute;mero de Protocolo&quot; a URI &eacute; &quot;ext/check/received-files/protocolo&quot;.</p><p>Logo, abaixo temos um exemplo de URL completa considerando o ambiente de Valida&ccedil;&atilde;o, consumindo este servi&ccedil;o</p><p><em>https://val.portalunico.siscomex.gov.br/ccta/api/ext/check/received-files/protocolo</em></p>
 *
 */
@Path("/")
@Api(value = "/", description = "")
public interface ServiosDeConsultaDeViagemApi  {

    /**
     * Retorna lista de viagens
     *
     * Lista de viagens
     *
     */
    @GET
    @Path("/ext/viagens/chegadas")
    @Produces({ "application/json" })
    @ApiOperation(value = "Retorna lista de viagens", notes = "Lista de viagens", tags={ "Serviços de Consulta de Viagem" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = ChaveViagem.class, responseContainer = "List"),
        @ApiResponse(code = 204, message = "Operação realizada com sucesso. Nenhum conteúdo retornado"),
        @ApiResponse(code = 400, message = "Requisição mal formatada"),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 404, message = "Recurso não encontrado"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
        @ApiResponse(code = 500, message = "Erro interno no servidor") })
    public Response listarChegadas( @NotNull @ApiParam(value = "Data/Hora inicial de partida prevista ou efetiva.",required=true)  @QueryParam("dataInicial") String dataInicial,  @NotNull @ApiParam(value = "Data/Hora inicial de chegada prevista ou efetiva.",required=true)  @QueryParam("dataFinal") String dataFinal,  @NotNull @ApiParam(value = "Código IATA do aeroporto<br/>Tamanho: 3",required=true)  @QueryParam("codigoAeroportoChegada") String codigoAeroportoChegada,  @NotNull @ApiParam(value = "Código da situação da partida ou chegada<br>Tamanho: 1<br/>",required=true, allowableValues="E - Efetiva, P - Prevista")  @QueryParam("situacaoChegada") String situacaoChegada,  @NotNull @ApiParam(value = "Código da situação da viagem<br>Tamanho: 1<br/>A - Ativa <br/>C - Cancelada<br/>",required=true, allowableValues="A - Ativo, C - Cancelada")  @QueryParam("situacaoViagem") String situacaoViagem,  @NotNull @ApiParam(value = "R - Regular",required=true, allowableValues="R - Regular")  @QueryParam("tipoVoo") String tipoVoo, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token é recuperado no parâmetro Set-Token no response da autenticação" ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Este token é recuperado no parâmetro X-CSRF-Token no response da autenticação" ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken,  @ApiParam(value = "Código do voo, formado por 2 caracteres da sigla IATA da CIA aérea e 4 caracteres do número de voo. Quando o número do voo contiver menos de 4 caracteres numéricos, são exibidos zeros à esquerda.<br/> Formato: AANNNN")  @QueryParam("codigoVoo") String codigoVoo,  @ApiParam(value = "Identificação da compania aérea<br/>Tamanho: 2<br/>")  @QueryParam("ciaAerea") String ciaAerea,  @ApiParam(value = "Código IATA do aeroporto<br/>Tamanho: 3")  @QueryParam("codigoAeroportoPartida") String codigoAeroportoPartida,  @ApiParam(value = "Prefixo da aeronave<br/>Tamanho máximo: 70")  @QueryParam("prefixoAeronave") String prefixoAeronave);

    /**
     * Retorna lista de viagens
     *
     * Lista de viagens
     *
     */
    @GET
    @Path("/ext/viagens/partidas")
    @Produces({ "application/json" })
    @ApiOperation(value = "Retorna lista de viagens", notes = "Lista de viagens", tags={ "Serviços de Consulta de Viagem" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = ChaveViagem.class, responseContainer = "List"),
        @ApiResponse(code = 204, message = "Operação realizada com sucesso. Nenhum conteúdo retornado"),
        @ApiResponse(code = 400, message = "Requisição mal formatada"),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 404, message = "Recurso não encontrado"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
        @ApiResponse(code = 500, message = "Erro interno no servidor") })
    public Response listarPartidas( @NotNull @ApiParam(value = "Data/Hora inicial de partida prevista ou efetiva.",required=true)  @QueryParam("dataInicial") String dataInicial,  @NotNull @ApiParam(value = "Data/Hora inicial de chegada prevista ou efetiva.",required=true)  @QueryParam("dataFinal") String dataFinal,  @NotNull @ApiParam(value = "Código IATA do aeroporto<br/>Tamanho: 3",required=true)  @QueryParam("codigoAeroportoPartida") String codigoAeroportoPartida,  @NotNull @ApiParam(value = "Código da situação da partida ou chegada<br>Tamanho: 1<br/>",required=true, allowableValues="E - Efetiva, P - Prevista")  @QueryParam("situacaoPartida") String situacaoPartida,  @NotNull @ApiParam(value = "Código da situação da viagem<br>Tamanho: 1<br/>A - Ativa <br/>C - Cancelada<br/>",required=true, allowableValues="A - Ativo, C - Cancelada")  @QueryParam("situacaoViagem") String situacaoViagem,  @NotNull @ApiParam(value = "R - Regular",required=true, allowableValues="R - Regular")  @QueryParam("tipoVoo") String tipoVoo, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token é recuperado no parâmetro Set-Token no response da autenticação" ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Este token é recuperado no parâmetro X-CSRF-Token no response da autenticação" ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken,  @ApiParam(value = "Código do voo, formado por 2 caracteres da sigla IATA da CIA aérea e 4 caracteres do número de voo. Quando o número do voo contiver menos de 4 caracteres numéricos, são exibidos zeros à esquerda.<br/> Formato: AANNNN")  @QueryParam("codigoVoo") String codigoVoo,  @ApiParam(value = "Identificação da compania aérea<br/>Tamanho: 2<br/>")  @QueryParam("ciaAerea") String ciaAerea,  @ApiParam(value = "Código IATA do aeroporto<br/>Tamanho: 3")  @QueryParam("codigoAeroportoChegada") String codigoAeroportoChegada,  @ApiParam(value = "Prefixo da aeronave<br/>Tamanho máximo: 70")  @QueryParam("prefixoAeronave") String prefixoAeronave);

    /**
     * Retorna o detalhamento de uma viagem.
     *
     * Retorna o detalhamento de uma viagem.
     *
     */
    @GET
    @Path("/ext/viagens/{numeroManifesto}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Retorna o detalhamento de uma viagem.", notes = "Retorna o detalhamento de uma viagem.", tags={ "Serviços de Consulta de Viagem" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = ViagemConsultaDetalhada.class),
        @ApiResponse(code = 204, message = "Operação realizada com sucesso. Nenhum conteúdo retornado"),
        @ApiResponse(code = 400, message = "Requisição mal formatada"),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 404, message = "Recurso não encontrado"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
        @ApiResponse(code = 500, message = "Erro interno no servidor") })
    public Response listarViagensCargasDetalhadoIdentificacaoManifesto1(@ApiParam(value = "Número do identificação do manifesto<br/>Tamanho: 17",required=true) @PathParam("numeroManifesto") String numeroManifesto, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token é recuperado no parâmetro Set-Token no response da autenticação" ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Este token é recuperado no parâmetro X-CSRF-Token no response da autenticação" ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken);
}

