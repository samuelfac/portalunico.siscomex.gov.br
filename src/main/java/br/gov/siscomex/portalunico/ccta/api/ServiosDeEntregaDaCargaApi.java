package br.gov.siscomex.portalunico.ccta.api;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

import br.gov.siscomex.portalunico.ccta.model.RegistrarEntregaImportador;
import br.gov.siscomex.portalunico.ccta.model.RetornoConsultaImpedimentosEntregaImportador;
import br.gov.siscomex.portalunico.ccta.model.RetornoSolicitacaEntregaImportadorDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * Controle de Carga e Trânsito Importação - Modal Aéreo
 *
 * <p><h3>CCT Importação</h3><h4>Introdução</h4><p>Bem-vindo à Application Programming Interface (API) provisória de interação entre transportadores (Cias. Aéreas), agentes de carga, operadores de remessa postal/expressa, recintos aduaneiros,  importadores e o novo Sistema de Controle de Carga e Trânsito (CCT Importação - Modal Aéreo). Trata-se de um conjunto de rotinas e padrões de programação para acesso a um aplicativo de software baseado nos padrões Web, que permitirá a manifestação e gestão do fluxo logístico de viagens e cargas dentro do Portal Único de Comércio Exterior.</p><p>A documentação a seguir descreve os serviços da versão atual do sistema, disponível no ambiente de validação do setor privado. Os demais serviços encontram-se em desenvolvimento. Não há, até o momento, versão disponível para uso em produção. O intuito da API é permitir que as empresas possam iniciar seus testes, preparando as adaptações necessárias em seus sistemas. As informações encaminhadas para os endpoints, neste momento, não terão valor legal, nem serão reaproveitadas em produção.</p><p>Nesta versão,  os serviços listados devem ser acessados por empresas cadastradas como Transportadores (perfil &quot;TRANSPORT&quot;), Agentes de carga (perfil &quot;AGECARGA&quot;), Recintos aduaneiros (perfil &quot;DEPOSIT&quot;) e Operadores de remessa postal/expressa (perfil &quot;AGEREMESS&quot;) de acordo com os serviços que estiverem autorizados a utilizar.</p><p>Para a utilização dos serviços do CCT Importação – Modal Aéreo, a autenticação via certificação digital é obrigatória. Na seção “Introdução” da API do Portal Único de Comércio Exterior, podem ser encontradas as orientações gerais sobre os padrões de comunicação dos serviços, os procedimentos para autenticação e os códigos de resposta das requisições.</p><p>Os arquivos referentes à manifestação de viagens e cargas devem seguir o padrão Cargo XML da IATA (Associação Internacional de Transportes Aéreos). Para conhecimento dos elementos de dados, estrutura e formato do padrão XSD, deve-se buscar a informação no site da IATA (www.iata.org). Nesta API, serão detalhadas somente as informações solicitadas de forma diferente do padrão IATA.</p><p>Serão solicitados os arquivos XFFM, XFWB, XFZB e XFHL, a serem enviados pelos serviços abaixo, descritos em maiores detalhes nas suas respectivas seções desta API:</p><ul><li>Informar Viagem - XFFM (Flight Manifest)</li><li>Informar Conhecimento de Carga - XFWB (Freight Waybill)</li><li>Informar Conhecimento de Carga House - XFZB (House Air Waybill)</li><li>Informar Associação Master e House - XFHL (House Manifest)</li></ul><p>Os arquivos somente serão recebidos caso o XML esteja de acordo com o XSD da IATA. Os arquivos corretamente validados passarão à situação &quot;<em>Received</em>&quot; e receberão um número de protocolo associado ao recebimento desse arquivo, sendo encaminhados para processamento. Os arquivos que não forem validados pelo XSD da IATA terão situação &quot;<em>Rejected</em>&quot; e não receberão número de protocolo.</p><p>Após a validação do XSD, será realizado o processamento do conteúdo dos campos dos arquivos. Este processamento inclui verificações, tais como: se o campo foi informado vazio ou acima do tamanho permitido, se as informações constam no cadastro da Receita Federal (CPF, CNPJ), etc., com vistas à gravação do dado na base. Os arquivos corretamente processados passarão à situação &quot;<em>Processed</em>&quot;, e os que apresentarem algum tipo de erro passarão para &quot;<em>Rejected</em>&quot;.</p><p>A qualquer momento, a situação dos arquivos enviados pode ser consultada pelos seguintes serviços descritos nesta API:</p><ul><li>Consultar Situação de Arquivos por Data</li><li>Consultar Situação de Arquivos por Número de Protocolo</li></ul><p>Durante o processamento, haverá batimento do conteúdo dos dados com tabelas de domínio. Os domínios que estão sendo validados e que podem causar rejeição de arquivo referem-se a:</p><ul><li>Aeroportos (código com três posições) - IATA Airport Code (&#42;)</li><li>Companhia Aérea (número com três posições e código com duas posições) - IATA Airline Codes</li><li>Indicador de Parcialidade de carga numa viagem - IATA Code List 1.15</li><li>Moeda (código alfanumérico com três posições) - ISO 4217</li><li>Países (sigla com duas posições) – ISO 3166</li><li>Recinto Aduaneiro (código com sete posições) – site da Receita Federal do Brasil</li><li>Unidade de Medida (Peso) - rec20_Rev10e_2014.xls do site <a href=\"http://www.unece.org/uncefact/codelistrecs.html\">http://www.unece.org/uncefact/codelistrecs.html</a></li><li>Unidade de Medida (Volume) - IATA Code List 1.20</li><li>Voos - Código de voo com duas posições alfanuméricas referentes à Companhia Aérea e quatro posições numéricas referentes ao número do voo.</li></ul><p>A lista de campos a serem informados e a definição de se eles são obrigatórios ou opcionais seguirão, via de regra, os padrões estabelecidos pela IATA, passando pela validação do XSD. As exceções serão mencionadas explicitamente na descrição dos serviços na API, fazendo parte do processamento dos arquivos. Os tipos e tamanhos de campos também seguirão, via de regra, os padrões estabelecidos pela IATA e, quando não validados pelo XSD, serão verificados no processamento.</p><p>Serão processados os seguintes tipos de operação para os arquivos:</p><ul><li>XFFM – Creation</li><li>XFWB, XFZB, XFHL – Creation, Update e Deletion</li></ul><p>Os arquivos XFFM, XFWB, XFZB e XFHL podem ser enviados em qualquer ordem, desde que cumpram com os prazos estabelecidos pela Receita Federal do Brasil.</p><p>O escopo atual do projeto se encontra restrito a voos regulares. Voos não regulares serão objeto de versões futuras.</p><p>Os serviços de recebimento e consulta de arquivos, a princípio, não estarão disponíveis no horário de 1:00h às 3:00h, em virtude de parada programada dos sistemas de comércio exterior.</p><h4>URLs de Acesso</h4><p>Para utilizar os servi&ccedil;os dispon&iacute;veis nessa API deve-se seguir o seguinte padr&atilde;o de URL:</p><p><em>https://{ambiente}/<strong>ccta</strong>/api/{servi&ccedil;o}</em></p><p>Onde, em <strong>{ambiente}</strong> deve-se informar o ambiente desejado dentro os ambientes dispon&iacute;veis na tabela abaixo e em <strong>{servi&ccedil;o}</strong> utilizar a URI do servi&ccedil;o desejado.</p><style type=\"text/css\">  .tg  {border-collapse:collapse;border-color:#bbb;border-spacing:0;width: 604px;}  .tg td{background-color:#E0FFEB;border-color:#bbb;border-style:solid;border-width:1px;color:#594F4F;    font-family:Arial, sans-serif;font-size:14px;overflow:hidden;padding:10px 5px;word-break:normal;}  .tg th{background-color:#9DE0AD;border-color:#bbb;border-style:solid;border-width:1px;color:#493F3F;    font-family:Arial, sans-serif;font-size:14px;font-weight:normal;overflow:hidden;padding:10px 5px;word-break:normal;}  .tg .tg-cabecalho{text-align:left;vertical-align:top}  .tg .tg-corpo{border-color:inherit;text-align:left;vertical-align:top}</style><table class=\"tg\" style=\"width: 604px;\"><thead>  <tr>    <th class=\"tg-cabecalho\"><span style=\"font-weight:bold\">Nome do Ambiente</span></th>    <th class=\"tg-cabecalho\"><span style=\"font-weight:bold\">URL de acesso</span></th>  </tr></thead><tbody>  <tr>    <td class=\"tg-corpo\">Ambiente de Validação da Empresas</td>    <td class=\"tg-corpo\">val.portalunico.siscomex.gov.br</td>  </tr> </tbody></table><p>&nbsp;</p><p><strong>Exemplo:</strong> Para o servi&ccedil;o \"Consultar Situação de Arquivos por Número de Protocolo\" a URI &eacute; \"ext/check/received-files/protocolo\".</p><p>Logo, abaixo temos um exemplo de URL completa considerando o ambiente de Valida&ccedil;&atilde;o, consumindo este servi&ccedil;o </p><p><em>https://val.portalunico.siscomex.gov.br/ccta/api/ext/check/received-files/protocolo</em></p>
 *
 */
@Path("/")
@Api(value = "/", description = "")
public interface ServiosDeEntregaDaCargaApi  {

    /**
     * Possibilitar a entrega da carga
     *
     * &lt;p&gt;Esse serviço tem por objetivo possibilitar a entrega da carga para o destinatário final, através do conhecimento de carga/DSIC e do documento de saída vinculado ao mesmo. A entrega poderá ser realizada de forma total ou parcial.&lt;/p&gt;&lt;p&gt;O processamento dessa entrega é realizado de forma assíncrona, sendo retornado apenas o número de protocolo para consulta posterior.&lt;/p&gt;
     *
     */
    @POST
    @Path("/ext/entregas-carga")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Possibilitar a entrega da carga", notes = "<p>Esse serviço tem por objetivo possibilitar a entrega da carga para o destinatário final, através do conhecimento de carga/DSIC e do documento de saída vinculado ao mesmo. A entrega poderá ser realizada de forma total ou parcial.</p><p>O processamento dessa entrega é realizado de forma assíncrona, sendo retornado apenas o número de protocolo para consulta posterior.</p>", tags={ "Serviços de Entrega da Carga" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = RetornoSolicitacaEntregaImportadorDTO.class),
        @ApiResponse(code = 204, message = "Operação realizada com sucesso. Nenhum conteúdo retornado"),
        @ApiResponse(code = 400, message = "Requisição mal formatada"),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 404, message = "Recurso não encontrado"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
        @ApiResponse(code = 500, message = "Erro interno no servidor") })
    public Response entregaImportador(@ApiParam(value = "" ,required=true)@Valid RegistrarEntregaImportador body, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token é recuperado no parâmetro Set-Token no response da autenticação" ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Este token é recuperado no parâmetro X-CSRF-Token no response da autenticação" ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * Consultar a lista de impedimentos para realização da entrega da carga
     *
     * &lt;p&gt;Esse serviço tem por objetivo retornar a lista de impedimentos para a realização da entrega da carga.&lt;/p&gt;
     *
     */
    @GET
    @Path("/ext/entregas-carga/impedimentos")
    @Produces({ "application/json" })
    @ApiOperation(value = "Consultar a lista de impedimentos para realização da entrega da carga", notes = "<p>Esse serviço tem por objetivo retornar a lista de impedimentos para a realização da entrega da carga.</p>", tags={ "Serviços de Entrega da Carga" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = RetornoConsultaImpedimentosEntregaImportador.class),
        @ApiResponse(code = 204, message = "Operação realizada com sucesso. Nenhum conteúdo retornado"),
        @ApiResponse(code = 400, message = "Requisição mal formatada"),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 404, message = "Recurso não encontrado"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio"),
        @ApiResponse(code = 500, message = "Erro interno no servidor") })
    public Response impedimentosEntregaImportador( @NotNull @ApiParam(value = "Tipo de carga. <p>Os tipos podem ser:</p><ul><li><em>740</em> – Air Waybill.</li><li><em>741</em> – Master Air Waybill.</li><li><em>703</em> – House Air Waybill.</li><li><em>14</em> – DSIC - Documento Subsidiário de Identificação de Carga.</li></ul>",required=true, allowableValues="740, 741, 703, 14")  @QueryParam("tipoCarga") String tipoCarga,  @NotNull @ApiParam(value = "Identificação da carga (Conhecimento/DSIC)<br/>Tamanho mínimo: 1<br/>Tamanho máximo: 35",required=true)  @QueryParam("identificacaoCarga") String identificacaoCarga,  @NotNull @ApiParam(value = "Tipo de documento de saída",required=true, allowableValues="DI, PROCESSO, EDMOV, OUTROS, PMD, PDE_TR, DSI, DSI_FORMULARIO")  @QueryParam("tipoDocumentoSaida") String tipoDocumentoSaida,  @NotNull @ApiParam(value = "Número de documento de saída<br/>Tamanho mínimo: 1<br/>Tamanho máximo:17<br/> Formato: NNNNNNNNNNNNNNNNN",required=true)  @QueryParam("numeroDocumentoSaida") String numeroDocumentoSaida, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token é recuperado no parâmetro Set-Token no response da autenticação" ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Este token é recuperado no parâmetro X-CSRF-Token no response da autenticação" ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken,  @ApiParam(value = "Data da emissão do conhecimento.<br/>Obrigatório para tipos de conhecimento AWB, MAWB e HAWB.<br/>Para o tipo DSIC não deve ser informado.")  @QueryParam("dataEmissao") String dataEmissao,  @ApiParam(value = "CNPJ responsável pelo envio do arquivo<br/> ")  @QueryParam("cnpjResponsavelArquivo") String cnpjResponsavelArquivo);
}

