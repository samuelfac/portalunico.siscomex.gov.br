package br.gov.siscomex.portalunico.rcnt.api;

import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

import br.gov.siscomex.portalunico.rcnt.model.DadosAcessoPessoa;
import br.gov.siscomex.portalunico.rcnt.model.DadosAcessoVeculo;
import br.gov.siscomex.portalunico.rcnt.model.DadosAgendaOperaoNaviosAeronaves;
import br.gov.siscomex.portalunico.rcnt.model.DadosArmazenamentoLote;
import br.gov.siscomex.portalunico.rcnt.model.DadosAtribuioTrocaNavio;
import br.gov.siscomex.portalunico.rcnt.model.DadosAvariaExtravioLote;
import br.gov.siscomex.portalunico.rcnt.model.DadosCarregamentoEntregaLotes;
import br.gov.siscomex.portalunico.rcnt.model.DadosCredenciamentoPessoa;
import br.gov.siscomex.portalunico.rcnt.model.DadosCredenciamentoVeculo;
import br.gov.siscomex.portalunico.rcnt.model.DadosDaChegadaAoPontoZero;
import br.gov.siscomex.portalunico.rcnt.model.DadosDaConfernciaFsica;
import br.gov.siscomex.portalunico.rcnt.model.DadosDaInspeoNoInvasiva;
import br.gov.siscomex.portalunico.rcnt.model.DadosEmbarqueDesembarqueNavio;
import br.gov.siscomex.portalunico.rcnt.model.DadosGeorreferenciamento;
import br.gov.siscomex.portalunico.rcnt.model.DadosGeraoLote;
import br.gov.siscomex.portalunico.rcnt.model.DadosIndisponibilidadeEquipamento;
import br.gov.siscomex.portalunico.rcnt.model.DadosInformaoBloqueioDesbloqueioVeculoCarga;
import br.gov.siscomex.portalunico.rcnt.model.DadosInformaoPrviaTrnsitoSimplificadoContiner;
import br.gov.siscomex.portalunico.rcnt.model.DadosPesagemVeculo;
import br.gov.siscomex.portalunico.rcnt.model.DadosPosioContiner;
import br.gov.siscomex.portalunico.rcnt.model.DadosPosioVeculoPtio;
import br.gov.siscomex.portalunico.rcnt.model.DadosRepresentante;
import br.gov.siscomex.portalunico.rcnt.model.RespostaParaErroNaRecepoDeEventoAduaneiro;
import br.gov.siscomex.portalunico.rcnt.model.RespostaParaSucessoNaRecepoDeEventoAduaneiro;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * Recintos Aduaneiros
 *
 * <p><h3>Introdução</h3><p>Bem-vindo à <i>Application Programming Interface (API)</i> de interação entre os recintos e o Portal Único de Comércio Exterior no Sistema Integrado de Comércio Exterior (Portal Siscomex), aqui chamada de API-Recintos. Trata-se de um conjunto de rotinas e padrões de programação para acesso a um aplicativo de software baseado nos padrões Web, que permitirá a recepção de eventos dentro do Portal Siscomex.</p><p>Esta é uma versão inicial que ainda não se encontra em ambiente de produção. Porém, os <i>endpoints</i> (<i>interface</i> de comunicação para envio dos arquivos) devem ser liberados em breve para testes de envio de arquivos no ambiente de Validação. O intuito, nesse momento, é apresentar a documentação da API para as empresas, de modo que estas possam iniciar as adaptações necessárias em seus sistemas.</p><p>Disponibilizamos os endpoints de 22 eventos.</p><p>Os perfis de autenticação que devem ser utilizados pelas empresas são: a) Depositário (DEPOSIT) ou b) Operador Portuário (OPERPORT). O processo de autenticação deve ser executado conforme descrito em <a href=\"https://docs.portalunico.siscomex.gov.br/#autenticacao\">Autenticação PUCOMEX</a>.</p><p>Para a utilização dos serviços desta API, a autenticação via certificação digital, do tipo e-CNPJ, é obrigatória. Caso seja verificado erro na autenticação ao serviço, o sistema irá retornar o erro referente à autenticação conforme especificado na seção Status Codes da API.</p><p><strong>Para a autenticação cada recinto deve utilizar o CNPJ completo associado ao código do recinto dentro do cadastro.</strong></p><p>Definições importantes:<p style=\"padding-left:30px\">I - sistema, o sistema informatizado do interveniente no qual são registradas informações de controle aduaneiro;<br/>II - informações, as informações relativas às operações de entrada e saída de pessoas e veículos, movimentação de carga e armazenamento de mercadorias, que devem ser captadas e registradas no sistema;<br/>III - eventos, conjunto de informações previstas no Anexo Único de Portaria Coana (ainda será publicada), que devem ser enviadas ao Portal Siscomex simultaneamente à ocorrência física das operações;</p></p><p>O interveniente deverá registrar em seu sistema e enviar à API-Recintos, todas as informações de cada evento excetuadas as informações inaplicáveis ao caso em concreto.</p><p>O envio de eventos retificadores substitui completamente as informações prestadas no evento retificado.</p><p>Todos os eventos enviados ao Portal Siscomex devem conter o CPF do preposto que operou o registro das informações no sistema do interveniente, ressalvados os casos de informações coletadas automaticamente.</p><p>A cada envio de eventos ao Portal Siscomex será retornado um protocolo de recepção que deve ser armazenado no sistema informatizado do interveniente. Esse recibo será a identificação única de um evento dentro da API-Recintos e deve ser utilizado para solicitar a retificação ou exclusão do referido evento. Esse protocolo também deve ser utilizado na identificação de artefatos georreferenciados.</p><p>No futuro em ambiente de produção, o sistema do interveniente deverá funcionar de forma ininterrupta e permitir o envio de eventos ao Portal Siscomex de forma simultânea e integrada com o registro de informações relativas às operações que executar. *<br/>*obs.: em ambiente de validação a premissa acima não se aplica visto que esse ambiente deve ser utilizado apenas para testes e validação da integração do sistema do interveniente com a API-Recintos, ou seja, não devem ser realizados testes de performance com o ambiente de validação. Portanto, qualquer envio em massa de eventos pode indisponibilizar a API-Recintos como um todo, impactando todos os demais usuários.</p><p>Abaixo, foram consolidadas informações técnicas para a integração dos sistemas dos intervenientes com o Portal:<p style=\"padding-left:30px\">1) No Portal, todos os serviços adotam o mesmo protocolo de acesso, baseado no padrão SSL/TLS e no uso de certificado digital. A API do Portal foi desenvolvida baseada na arquitetura REST. Ela trabalhará com o formato JSON. Além disso, toda a nossa API usará o formato UTF-8;<br/>2) Cada envio deve conter um único evento por vez, seguindo o model previsto para cada qual, sendo comum a todos os eventos os dados referentes ao Cabeçalho do Evento (model: Cabeçalho Envio Evento Aduaneiro);<br/>3) O processo de recepção, por parte da API-Recintos, é composta por etapa de validação, armazenamento e, por fim, retorna-se o protocolo de recepção. Dessa maneira, somente será atribuído e retornado o protocolo de recepção para os eventos processados com sucesso. Qualquer erro de validação ou no processamento ocasiona a interrupção da recepção, sendo retornado detalhamento do erro;<br/>4) Para Operações de Retificação e Exclusão é obrigatório informar valor para o atributo protocoloEventoRetificadoOuExcluido que deve apontar para o evento alvo da ação de Retificação ou Exclusão;<br/>5) Listas: cada atributo de lista deverá conter um atributo idElemento que identifique unicamente cada item da lista. No caso de eventos retificadores ou de exclusão, que referenciam um evento transmitido anteriormente, o recinto deve ser capaz de 'repetir' o mesmo 'idElemento' utilizado no evento retificado/excluído;<br/>6) Atributos duplicados: a API não critica atributos duplicados e, caso existam, o conteúdo da segunda ocorrência irá sobrepor o conteúdo da primeira;<br/>7) Domínios: os domínios são sensíveis a maiúsculas e minúsculas;<br/>8) Atributos de data/hora com fuso: deve-se enviar o fuso horário no qual tal data/hora foi gerada considerando, inclusive, o horário de verão.<h4>URLs de Acesso</h4><p>Para utilizar os servi&ccedil;os dispon&iacute;veis nessa API deve-se seguir o seguinte padr&atilde;o de URL:</p><p><em>https://{ambiente}/<strong>recintos-ext</strong>/api/{servi&ccedil;o}</em></p><p>Onde, em <strong>{ambiente}</strong> deve-se informar o ambiente desejado dentro os ambientes dispon&iacute;veis na tabela abaixo e em <strong>{servi&ccedil;o}</strong> utilizar a URI do servi&ccedil;o desejado.</p><style type=\"text/css\">.tg  {border-collapse:collapse;border-color:#bbb;border-spacing:0;width: 604px;}.tg td{background-color:#E0FFEB;border-color:#bbb;border-style:solid;border-width:1px;color:#594F4F;font-family:Arial, sans-serif;font-size:14px;overflow:hidden;padding:10px 5px;word-break:normal;}.tg th{background-color:#9DE0AD;border-color:#bbb;border-style:solid;border-width:1px;color:#493F3F;font-family:Arial, sans-serif;font-size:14px;fon t-weight:normal;overflow:hidden;padding:10px 5px;word-break:normal;}.tg .tg-cabecalho{text-align:left;vertical-align:top}.tg .tg-corpo{border-color:inherit;text-align:left;vertical-align:top}</style><table class=\"tg\" style=\"width: 604px;\"><thead><tr><th class=\"tg-cabecalho\"><span style=\"font-weight:bold\">Nome do Ambiente</span></th><th class=\"tg-cabecalho\"><span style=\"font-weight:bold\">URL de acesso</span></th></tr></thead><tbody><tr><td class=\"tg-corpo\">Ambiente de Validação da Empresas</td><td class=\"tg-corpo\">val.portalunico.siscomex.gov.br</td></tr><tr><td class=\"tg-corpo\">Ambiente de Produção</td><td class=\"tg-corpo\">portalunico.siscomex.gov.br</td></tr></tbody></table><p>&nbsp;</p><p>Logo, abaixo temos um exemplo de URL completa considerando o ambiente de Valida&ccedil;&atilde;o, consumindo este servi&ccedil;o </p><p><em>https://val.portalunico.siscomex.gov.br/recintos-ext/api/ext/acesso-pessoas</em></p>
 *
 */
@Path("/")
@Api(value = "/", description = "")
public interface ServiosDestinadosRecepoDeEventosAduaneiros_Api  {

    /**
     * Agenda/Operação de Navios/Aeronaves
     *
     * Um evento para cada inclusão / alteração  no &#39;line up&#39; / &#39;agenda&#39; de navios / aeronaves com atracação / pouso previstos para o recinto.&lt;br/&gt;Transmitir a agenda (previsão)(agenda), a chegada (atracação/desatracação pouso/decolagem) e a operação.&lt;br/&gt; Exemplo: &lt;br/&gt;evento 1 - previsão de atracação e desatracação; &lt;br/&gt;evento 2 - previsão + efetiva atracação &lt;br/&gt;evento 3 - previsão + efetiva atracação + início operação &lt;br/&gt;evento 4 - previsão + efetiva atracação + início operação + final operação &lt;br/&gt;evento 5 - previsão + efetiva atracação + início operação + final operação + efetiva desatracação &lt;br/&gt;Transmitir imediatamente a recepção da informação.
     *
     */
    @POST
    @Path("/ext/agenda-navios-aeronaves")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Agenda/Operação de Navios/Aeronaves", notes = "Um evento para cada inclusão / alteração  no 'line up' / 'agenda' de navios / aeronaves com atracação / pouso previstos para o recinto.<br/>Transmitir a agenda (previsão)(agenda), a chegada (atracação/desatracação pouso/decolagem) e a operação.<br/> Exemplo: <br/>evento 1 - previsão de atracação e desatracação; <br/>evento 2 - previsão + efetiva atracação <br/>evento 3 - previsão + efetiva atracação + início operação <br/>evento 4 - previsão + efetiva atracação + início operação + final operação <br/>evento 5 - previsão + efetiva atracação + início operação + final operação + efetiva desatracação <br/>Transmitir imediatamente a recepção da informação.", tags={ "Serviços destinados à recepção de eventos aduaneiros." })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Recurso criado com sucesso", response = RespostaParaSucessoNaRecepoDeEventoAduaneiro.class),
        @ApiResponse(code = 400, message = "Requisição mal formatada", response = RespostaParaErroNaRecepoDeEventoAduaneiro.class),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio", response = RespostaParaErroNaRecepoDeEventoAduaneiro.class),
        @ApiResponse(code = 500, message = "Erro interno no servidor"),
        @ApiResponse(code = 503, message = "Serviço indisponível") })
    public Response incluir(@QueryParam("TPP-ID") String TPP_ID, @HeaderParam("abi") String abi, @ApiParam(value = "JSON do evento Agenda Operação Navios Aeronaves" ,required=true)@Valid DadosAgendaOperaoNaviosAeronaves body, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Recuperado no parâmetro Set-Token no response da autenticação." ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Recuperado no parâmetro X-CSRF-Token no response da autenticação." ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * Armazenamento de Lote
     *
     * Um evento para cada armazenamento/mudança de posição do lote dentro do armazém.&lt;br/&gt;Não considerar os movimentos do tipo “house keeping”, a exemplo do posicionamento para verificação física de órgão anuente, casos em que a carga retorna, em pouco tempo, para a mesma posição.&lt;br/&gt;Não aplicar para granel.&lt;br/&gt;Transmitir imediatamente a finalização do armazenamento.&lt;br/&gt;Um evento para cada LOTE armazenado.
     *
     */
    @POST
    @Path("/ext/armazenamento-lote")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Armazenamento de Lote", notes = "Um evento para cada armazenamento/mudança de posição do lote dentro do armazém.<br/>Não considerar os movimentos do tipo “house keeping”, a exemplo do posicionamento para verificação física de órgão anuente, casos em que a carga retorna, em pouco tempo, para a mesma posição.<br/>Não aplicar para granel.<br/>Transmitir imediatamente a finalização do armazenamento.<br/>Um evento para cada LOTE armazenado.", tags={ "Serviços destinados à recepção de eventos aduaneiros." })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Recurso criado com sucesso", response = RespostaParaSucessoNaRecepoDeEventoAduaneiro.class),
        @ApiResponse(code = 400, message = "Requisição mal formatada", response = RespostaParaErroNaRecepoDeEventoAduaneiro.class),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio", response = RespostaParaErroNaRecepoDeEventoAduaneiro.class),
        @ApiResponse(code = 500, message = "Erro interno no servidor"),
        @ApiResponse(code = 503, message = "Serviço indisponível") })
    public Response incluir1(@QueryParam("TPP-ID") String TPP_ID, @HeaderParam("abi") String abi, @ApiParam(value = "JSON do evento Armazenamento de Lote." ,required=true)@Valid DadosArmazenamentoLote body, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Recuperado no parâmetro Set-Token no response da autenticação." ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Recuperado no parâmetro X-CSRF-Token no response da autenticação." ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * Credenciamento de Pessoas
     *
     * Um evento para cada pessoa credenciada para acesso ao recinto (entrada/saída).&lt;br/&gt;Considerar acesso às áreas alfandegadas apenas.&lt;br/&gt;Transmitir logo que encerrar o ato de credenciamento.&lt;br/&gt;Um evento para cada CPF credenciado.&lt;br/&gt;&lt;br/&gt;Obs.:  Quando do credenciamento inicial informar “credenciamentoAtivo:true”  e validade do credenciamento caso existir.&lt;br/&gt;Casos em que a validade do credenciamento seja informada, a RFB vai considerar credenciamento inativo quando do vencimento do prazo.&lt;br/&gt;Para os casos que não exista validade do credenciamento o evento deve ser retificado para “credenciamentoAtivo:false” quando for o caso.&lt;br/&gt;(por exemplo: no caso de funcionários não há validade de credenciamento logo no caso de demissão o evento de credenciamento deve ser retificado para status &#x3D; inativo).
     *
     */
    @POST
    @Path("/ext/credenciamento-pessoas")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Credenciamento de Pessoas", notes = "Um evento para cada pessoa credenciada para acesso ao recinto (entrada/saída).<br/>Considerar acesso às áreas alfandegadas apenas.<br/>Transmitir logo que encerrar o ato de credenciamento.<br/>Um evento para cada CPF credenciado.<br/><br/>Obs.:  Quando do credenciamento inicial informar “credenciamentoAtivo:true”  e validade do credenciamento caso existir.<br/>Casos em que a validade do credenciamento seja informada, a RFB vai considerar credenciamento inativo quando do vencimento do prazo.<br/>Para os casos que não exista validade do credenciamento o evento deve ser retificado para “credenciamentoAtivo:false” quando for o caso.<br/>(por exemplo: no caso de funcionários não há validade de credenciamento logo no caso de demissão o evento de credenciamento deve ser retificado para status = inativo).", tags={ "Serviços destinados à recepção de eventos aduaneiros." })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Recurso criado com sucesso", response = RespostaParaSucessoNaRecepoDeEventoAduaneiro.class),
        @ApiResponse(code = 400, message = "Requisição mal formatada", response = RespostaParaErroNaRecepoDeEventoAduaneiro.class),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio", response = RespostaParaErroNaRecepoDeEventoAduaneiro.class),
        @ApiResponse(code = 500, message = "Erro interno no servidor"),
        @ApiResponse(code = 503, message = "Serviço indisponível") })
    public Response incluir10(@QueryParam("TPP-ID") String TPP_ID, @HeaderParam("abi") String abi, @ApiParam(value = "JSON do evento Credenciamento Pessoas" ,required=true)@Valid DadosCredenciamentoPessoa body, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Recuperado no parâmetro Set-Token no response da autenticação." ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Recuperado no parâmetro X-CSRF-Token no response da autenticação." ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * Credenciamento de Veículos
     *
     * Um evento para cada veículo credenciado para entrar/sair no recinto.&lt;br/&gt;Transmitir ao final do ato de credenciamento.&lt;br/&gt;Um evento deve ser transmitido para cada credenciamento de cavalo-trator, outro evento para cada semirreboque, outro para cada vagão…&lt;br/&gt;Um evento para cada PLACA credenciada.&lt;br/&gt;&lt;br/&gt;Obs.:  Quando do credenciamento inicial informar “credenciamentoAtivo:true” e validade do credenciamento caso existir.&lt;br/&gt;Casos em que a validade do credenciamento seja informada, a RFB vai considerar credenciamento inativo quando do vencimento do prazo.&lt;br/&gt;Para os casos que não exista validade do credenciamento o evento deve ser retificado para “credenciamentoAtivo:false” quando for o caso.
     *
     */
    @POST
    @Path("/ext/credenciamento-veiculos")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Credenciamento de Veículos", notes = "Um evento para cada veículo credenciado para entrar/sair no recinto.<br/>Transmitir ao final do ato de credenciamento.<br/>Um evento deve ser transmitido para cada credenciamento de cavalo-trator, outro evento para cada semirreboque, outro para cada vagão…<br/>Um evento para cada PLACA credenciada.<br/><br/>Obs.:  Quando do credenciamento inicial informar “credenciamentoAtivo:true” e validade do credenciamento caso existir.<br/>Casos em que a validade do credenciamento seja informada, a RFB vai considerar credenciamento inativo quando do vencimento do prazo.<br/>Para os casos que não exista validade do credenciamento o evento deve ser retificado para “credenciamentoAtivo:false” quando for o caso.", tags={ "Serviços destinados à recepção de eventos aduaneiros." })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Recurso criado com sucesso", response = RespostaParaSucessoNaRecepoDeEventoAduaneiro.class),
        @ApiResponse(code = 400, message = "Requisição mal formatada", response = RespostaParaErroNaRecepoDeEventoAduaneiro.class),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio", response = RespostaParaErroNaRecepoDeEventoAduaneiro.class),
        @ApiResponse(code = 500, message = "Erro interno no servidor"),
        @ApiResponse(code = 503, message = "Serviço indisponível") })
    public Response incluir11(@QueryParam("TPP-ID") String TPP_ID, @HeaderParam("abi") String abi, @ApiParam(value = "JSON do evento Credenciamento de Veículos" ,required=true)@Valid DadosCredenciamentoVeculo body, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Recuperado no parâmetro Set-Token no response da autenticação." ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Recuperado no parâmetro X-CSRF-Token no response da autenticação." ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * Evento de Georreferenciamento
     *
     * Neste evento deve ser georreferenciado as áreas e equipamentos do recinto conforme lista do atributo &#39;Tipo&#39;.&lt;br/&gt;As coordenadas de cada objeto definido podem ser um polígono ou ponto, por exemplo:&lt;br/&gt;O perímetro da área alfandegada e demais áreas... (polígono)&lt;br/&gt;As câmeras do sistema de CFTV, inclusive dos Gates e que fazem parte do sistema de OCR (ponto);&lt;br/&gt;As catracas, torniquetes e outros instrumentos de controle de acesso de pessoas (ponto);&lt;br/&gt;As balanças rodoviárias (ponto);&lt;br/&gt;Os Portêineres e outros instrumentos de manipulação de unidades de carga em navios (ponto);&lt;br/&gt;Os escâneres, tanto de contêineres quanto de volumes(ponto);&lt;br/&gt;Os gates, portões e outros instrumentos de controle de acesso de veículos (ponto).
     *
     */
    @POST
    @Path("/ext/evento-georreferenciamento")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Evento de Georreferenciamento", notes = "Neste evento deve ser georreferenciado as áreas e equipamentos do recinto conforme lista do atributo 'Tipo'.<br/>As coordenadas de cada objeto definido podem ser um polígono ou ponto, por exemplo:<br/>O perímetro da área alfandegada e demais áreas... (polígono)<br/>As câmeras do sistema de CFTV, inclusive dos Gates e que fazem parte do sistema de OCR (ponto);<br/>As catracas, torniquetes e outros instrumentos de controle de acesso de pessoas (ponto);<br/>As balanças rodoviárias (ponto);<br/>Os Portêineres e outros instrumentos de manipulação de unidades de carga em navios (ponto);<br/>Os escâneres, tanto de contêineres quanto de volumes(ponto);<br/>Os gates, portões e outros instrumentos de controle de acesso de veículos (ponto).", tags={ "Serviços destinados à recepção de eventos aduaneiros." })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Recurso criado com sucesso", response = RespostaParaSucessoNaRecepoDeEventoAduaneiro.class),
        @ApiResponse(code = 400, message = "Requisição mal formatada", response = RespostaParaErroNaRecepoDeEventoAduaneiro.class),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio", response = RespostaParaErroNaRecepoDeEventoAduaneiro.class),
        @ApiResponse(code = 500, message = "Erro interno no servidor"),
        @ApiResponse(code = 503, message = "Serviço indisponível") })
    public Response incluir12(@QueryParam("TPP-ID") String TPP_ID, @HeaderParam("abi") String abi, @ApiParam(value = "JSON do evento Georreferenciamento" ,required=true)@Valid DadosGeorreferenciamento body, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Recuperado no parâmetro Set-Token no response da autenticação." ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Recuperado no parâmetro X-CSRF-Token no response da autenticação." ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * Geração de Lotes
     *
     * Um evento para cada conjunto de LOTEs gerados por conhecimento.Não considerar os movimentos do tipo “house keeping”, a exemplo de desunitização para verificação física de órgão anuente, casos em que a carga deve ser reunitizada após o processo.&lt;br/&gt;Exemplos de geração de lote; desunitização &#x3D; n... lotes; baldeação imediata &#x3D; n... lotes; depositada em armazém &#x3D; n... lotes;&lt;br/&gt;Baldeação, a transferência de mercadoria descarregada de um veículo e posteriormente carregada em outro. Nesse caso ocorre a geração lote e posterior carregamento lote.&lt;br/&gt;Não aplicar para granel.&lt;br/&gt;Transmitir imediatamente a geração de um conjunto de LOTEs por conhecimento.&lt;br/&gt;Pode repetir o conhecimento na transmissão de um novo evento no caso de cargas com chegada parcial.&lt;br/&gt;
     *
     */
    @POST
    @Path("/ext/geracao-lotes")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Geração de Lotes", notes = "Um evento para cada conjunto de LOTEs gerados por conhecimento.Não considerar os movimentos do tipo “house keeping”, a exemplo de desunitização para verificação física de órgão anuente, casos em que a carga deve ser reunitizada após o processo.<br/>Exemplos de geração de lote; desunitização = n... lotes; baldeação imediata = n... lotes; depositada em armazém = n... lotes;<br/>Baldeação, a transferência de mercadoria descarregada de um veículo e posteriormente carregada em outro. Nesse caso ocorre a geração lote e posterior carregamento lote.<br/>Não aplicar para granel.<br/>Transmitir imediatamente a geração de um conjunto de LOTEs por conhecimento.<br/>Pode repetir o conhecimento na transmissão de um novo evento no caso de cargas com chegada parcial.<br/>", tags={ "Serviços destinados à recepção de eventos aduaneiros." })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Recurso criado com sucesso", response = RespostaParaSucessoNaRecepoDeEventoAduaneiro.class),
        @ApiResponse(code = 400, message = "Requisição mal formatada", response = RespostaParaErroNaRecepoDeEventoAduaneiro.class),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio", response = RespostaParaErroNaRecepoDeEventoAduaneiro.class),
        @ApiResponse(code = 500, message = "Erro interno no servidor"),
        @ApiResponse(code = 503, message = "Serviço indisponível") })
    public Response incluir13(@QueryParam("TPP-ID") String TPP_ID, @HeaderParam("abi") String abi, @ApiParam(value = "JSON do evento Geração de Lotes" ,required=true)@Valid DadosGeraoLote body, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Recuperado no parâmetro Set-Token no response da autenticação." ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Recuperado no parâmetro X-CSRF-Token no response da autenticação." ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * Informação de Bloqueio/Desbloqueio de Veículo/Carga
     *
     * Um evento para cada bloqueio/desbloqueio de carga solicitado/efetuado diretamente no sistema do recinto.&lt;br/&gt;Enviar inclusive os bloqueios/desbloqueios automáticos implementados no sistema do recinto.&lt;br/&gt;Não se trata do bloqueio no sistema Carga e/ou CCT.&lt;br/&gt;Transmitir um evento para cada solicitação de bloqueio ou desbloqueio efetivada no sistema privado do recinto para conhecimento, contêiner, veículo ou lote.
     *
     */
    @POST
    @Path("/ext/bloqueio-desbloqueio-veiculo-carga")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Informação de Bloqueio/Desbloqueio de Veículo/Carga", notes = "Um evento para cada bloqueio/desbloqueio de carga solicitado/efetuado diretamente no sistema do recinto.<br/>Enviar inclusive os bloqueios/desbloqueios automáticos implementados no sistema do recinto.<br/>Não se trata do bloqueio no sistema Carga e/ou CCT.<br/>Transmitir um evento para cada solicitação de bloqueio ou desbloqueio efetivada no sistema privado do recinto para conhecimento, contêiner, veículo ou lote.", tags={ "Serviços destinados à recepção de eventos aduaneiros." })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Recurso criado com sucesso", response = RespostaParaSucessoNaRecepoDeEventoAduaneiro.class),
        @ApiResponse(code = 400, message = "Requisição mal formatada", response = RespostaParaErroNaRecepoDeEventoAduaneiro.class),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio", response = RespostaParaErroNaRecepoDeEventoAduaneiro.class),
        @ApiResponse(code = 500, message = "Erro interno no servidor"),
        @ApiResponse(code = 503, message = "Serviço indisponível") })
    public Response incluir14(@QueryParam("TPP-ID") String TPP_ID, @HeaderParam("abi") String abi, @ApiParam(value = "JSON do evento Informação Bloqueio Desbloqueio Veículo Carga" ,required=true)@Valid DadosInformaoBloqueioDesbloqueioVeculoCarga body, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Recuperado no parâmetro Set-Token no response da autenticação." ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Recuperado no parâmetro X-CSRF-Token no response da autenticação." ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * Informação Prévia Trânsito Simplificado Contêiner
     *
     * Um evento para cada lista de unidades que serão removidas. Verificar a normatização local sobre os prazos para que os recintos de destino informem o recinto onde a carga vai atracar sobre a remoção da mesma.&lt;br/&gt;Transmitir imediatamente a recepção da lista de cargas a remover.&lt;br/&gt;Um evento por LISTA CARGAS.
     *
     */
    @POST
    @Path("/ext/transito-simplificado-conteiner")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Informação Prévia Trânsito Simplificado Contêiner", notes = "Um evento para cada lista de unidades que serão removidas. Verificar a normatização local sobre os prazos para que os recintos de destino informem o recinto onde a carga vai atracar sobre a remoção da mesma.<br/>Transmitir imediatamente a recepção da lista de cargas a remover.<br/>Um evento por LISTA CARGAS.", tags={ "Serviços destinados à recepção de eventos aduaneiros." })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Recurso criado com sucesso", response = RespostaParaSucessoNaRecepoDeEventoAduaneiro.class),
        @ApiResponse(code = 400, message = "Requisição mal formatada", response = RespostaParaErroNaRecepoDeEventoAduaneiro.class),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio", response = RespostaParaErroNaRecepoDeEventoAduaneiro.class),
        @ApiResponse(code = 500, message = "Erro interno no servidor"),
        @ApiResponse(code = 503, message = "Serviço indisponível") })
    public Response incluir15(@QueryParam("TPP-ID") String TPP_ID, @HeaderParam("abi") String abi, @ApiParam(value = "JSON do evento Informação Prévia Trânsito Simplificado Contêiner" ,required=true)@Valid DadosInformaoPrviaTrnsitoSimplificadoContiner body, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Recuperado no parâmetro Set-Token no response da autenticação." ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Recuperado no parâmetro X-CSRF-Token no response da autenticação." ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * Inspeção não invasiva
     *
     * Um evento para cada inspeção não invasiva de unidades de carga.&lt;br/&gt;Transmitir imediatamente após a finalização da inspeção.&lt;br/&gt;Um evento para cada conjunto PLACA/CONTÊINER escaneados.
     *
     */
    @POST
    @Path("/ext/inspecao-nao-invasiva")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Inspeção não invasiva", notes = "Um evento para cada inspeção não invasiva de unidades de carga.<br/>Transmitir imediatamente após a finalização da inspeção.<br/>Um evento para cada conjunto PLACA/CONTÊINER escaneados.", tags={ "Serviços destinados à recepção de eventos aduaneiros." })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Recurso criado com sucesso", response = RespostaParaSucessoNaRecepoDeEventoAduaneiro.class),
        @ApiResponse(code = 400, message = "Requisição mal formatada", response = RespostaParaErroNaRecepoDeEventoAduaneiro.class),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio", response = RespostaParaErroNaRecepoDeEventoAduaneiro.class),
        @ApiResponse(code = 500, message = "Erro interno no servidor"),
        @ApiResponse(code = 503, message = "Serviço indisponível") })
    public Response incluir16(@QueryParam("TPP-ID") String TPP_ID, @HeaderParam("abi") String abi, @ApiParam(value = "Inspeção não invasiva" ,required=true)@Valid DadosDaInspeoNoInvasiva body, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Recuperado no parâmetro Set-Token no response da autenticação." ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Recuperado no parâmetro X-CSRF-Token no response da autenticação." ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * Ocorrências de indisponibilidades de equipamentos
     *
     * Transmitir um evento para cada indisponibilidade e retorno à normalidade de cada equipamento definido.
     *
     */
    @POST
    @Path("/ext/indisponibilidade-equipamentos")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Ocorrências de indisponibilidades de equipamentos", notes = "Transmitir um evento para cada indisponibilidade e retorno à normalidade de cada equipamento definido.", tags={ "Serviços destinados à recepção de eventos aduaneiros." })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Recurso criado com sucesso", response = RespostaParaSucessoNaRecepoDeEventoAduaneiro.class),
        @ApiResponse(code = 400, message = "Requisição mal formatada", response = RespostaParaErroNaRecepoDeEventoAduaneiro.class),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio", response = RespostaParaErroNaRecepoDeEventoAduaneiro.class),
        @ApiResponse(code = 500, message = "Erro interno no servidor"),
        @ApiResponse(code = 503, message = "Serviço indisponível") })
    public Response incluir17(@QueryParam("TPP-ID") String TPP_ID, @HeaderParam("abi") String abi, @ApiParam(value = "JSON do evento Ocorrências Indisponibilidades Equipamentos" ,required=true)@Valid DadosIndisponibilidadeEquipamento body, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Recuperado no parâmetro Set-Token no response da autenticação." ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Recuperado no parâmetro X-CSRF-Token no response da autenticação." ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * Pesagem de Veículo/Carga
     *
     * Um evento para cada pesagem efetuada em unidades de carga.&lt;br/&gt;Usar este evento também nos casos em que a pesagem for efetuada em equipamentos de movimentação de Contêineres (RTG, etc) e, neste caso, não informar placas (veículos e semirreboques) e nem taras do conjunto transportador.&lt;br/&gt;Caso a pesagem aconteça via Portainer ou balança de fluxo na operação de embarque/desembarque navio, informar o peso aferido no evento Embarque/Desembarque Navio.&lt;br/&gt;A pesagem dos volumes, nos casos de geração de lotes, deve ser informada no evento Geração Lotes.&lt;br/&gt;No caso de granel que ingressar ou sair do recinto via dutos, transmitir o presente evento com a soma das bateladas da balança de fluxo ao final da operação.&lt;br/&gt;Um evento para cada conjunto de PLACA/CONTÊINER/VOLUME pesados.&lt;br/&gt;Transmitir após a pesagem.&lt;br/&gt;&lt;br/&gt;Obs. 1: As taras de veículo e semirreboque podem ser informadas em separado ou em conjunto e são excludentes, ou seja, caso o recinto opere com a tara do conjunto (cavalo / semirreboque) ,comum no modal aquaviário, informar esta e ignorar a tara em separado, conforme determinação unidade local.&lt;br/&gt;As taras devem ser informadas em separado nos casos de recintos que possuem cadastro de taras, conforme determinação da unidade local. Esse tipo de cadastro é comum no modal rodoviário em que cargas de importação ou exportação ingressam no recinto e permanecem sob rodas até o desembaraço.&lt;br/&gt;&lt;br/&gt;Obs. 2: Para os casos em que a pesagem é feita no gate (ou balança interna), comum no modal aquaviário, usar a tara aferida na última pesagem do conjunto vazio.&lt;br/&gt;Caso o conjunto realize a primeira passagem no recinto “carregado / cheio”, retificar o evento assim que obter a tara do conjunto vazio.&lt;br/&gt;&lt;br/&gt;Obs. 3: Pesagens de veículos vazios, conforme determinação da unidade local, devem ser transmitidas com valores iguais para os atributos peso bruto da balança e tara individual ou tara do conjunto, conforme o caso.
     *
     */
    @POST
    @Path("/ext/pesagem-veiculos-cargas")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Pesagem de Veículo/Carga", notes = "Um evento para cada pesagem efetuada em unidades de carga.<br/>Usar este evento também nos casos em que a pesagem for efetuada em equipamentos de movimentação de Contêineres (RTG, etc) e, neste caso, não informar placas (veículos e semirreboques) e nem taras do conjunto transportador.<br/>Caso a pesagem aconteça via Portainer ou balança de fluxo na operação de embarque/desembarque navio, informar o peso aferido no evento Embarque/Desembarque Navio.<br/>A pesagem dos volumes, nos casos de geração de lotes, deve ser informada no evento Geração Lotes.<br/>No caso de granel que ingressar ou sair do recinto via dutos, transmitir o presente evento com a soma das bateladas da balança de fluxo ao final da operação.<br/>Um evento para cada conjunto de PLACA/CONTÊINER/VOLUME pesados.<br/>Transmitir após a pesagem.<br/><br/>Obs. 1: As taras de veículo e semirreboque podem ser informadas em separado ou em conjunto e são excludentes, ou seja, caso o recinto opere com a tara do conjunto (cavalo / semirreboque) ,comum no modal aquaviário, informar esta e ignorar a tara em separado, conforme determinação unidade local.<br/>As taras devem ser informadas em separado nos casos de recintos que possuem cadastro de taras, conforme determinação da unidade local. Esse tipo de cadastro é comum no modal rodoviário em que cargas de importação ou exportação ingressam no recinto e permanecem sob rodas até o desembaraço.<br/><br/>Obs. 2: Para os casos em que a pesagem é feita no gate (ou balança interna), comum no modal aquaviário, usar a tara aferida na última pesagem do conjunto vazio.<br/>Caso o conjunto realize a primeira passagem no recinto “carregado / cheio”, retificar o evento assim que obter a tara do conjunto vazio.<br/><br/>Obs. 3: Pesagens de veículos vazios, conforme determinação da unidade local, devem ser transmitidas com valores iguais para os atributos peso bruto da balança e tara individual ou tara do conjunto, conforme o caso.", tags={ "Serviços destinados à recepção de eventos aduaneiros." })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Recurso criado com sucesso", response = RespostaParaSucessoNaRecepoDeEventoAduaneiro.class),
        @ApiResponse(code = 400, message = "Requisição mal formatada", response = RespostaParaErroNaRecepoDeEventoAduaneiro.class),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio", response = RespostaParaErroNaRecepoDeEventoAduaneiro.class),
        @ApiResponse(code = 500, message = "Erro interno no servidor"),
        @ApiResponse(code = 503, message = "Serviço indisponível") })
    public Response incluir18(@QueryParam("TPP-ID") String TPP_ID, @HeaderParam("abi") String abi, @ApiParam(value = "JSON do evento Pesagem de Veículos/Cargas" ,required=true)@Valid DadosPesagemVeculo body, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Recuperado no parâmetro Set-Token no response da autenticação." ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Recuperado no parâmetro X-CSRF-Token no response da autenticação." ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * Posição do Contêiner
     *
     * Um evento para cada mudança de posição da unidade de carga dentro do pátio.Não considerar os movimentos do tipo “house keeping”, quando a unidade retorna, em pouco tempo, para a mesma posição.&lt;br/&gt;Transmitir imediatamente a finalização do posicionamento.&lt;br/&gt;Um evento para cada CONTÊINER posicionado no pátio.&lt;br/&gt;
     *
     */
    @POST
    @Path("/ext/posicao-conteiner")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Posição do Contêiner", notes = "Um evento para cada mudança de posição da unidade de carga dentro do pátio.Não considerar os movimentos do tipo “house keeping”, quando a unidade retorna, em pouco tempo, para a mesma posição.<br/>Transmitir imediatamente a finalização do posicionamento.<br/>Um evento para cada CONTÊINER posicionado no pátio.<br/>", tags={ "Serviços destinados à recepção de eventos aduaneiros." })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Recurso criado com sucesso", response = RespostaParaSucessoNaRecepoDeEventoAduaneiro.class),
        @ApiResponse(code = 400, message = "Requisição mal formatada", response = RespostaParaErroNaRecepoDeEventoAduaneiro.class),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio", response = RespostaParaErroNaRecepoDeEventoAduaneiro.class),
        @ApiResponse(code = 500, message = "Erro interno no servidor"),
        @ApiResponse(code = 503, message = "Serviço indisponível") })
    public Response incluir19(@QueryParam("TPP-ID") String TPP_ID, @HeaderParam("abi") String abi, @ApiParam(value = "JSON do evento Posição do Contêiner." ,required=true)@Valid DadosPosioContiner body, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Recuperado no parâmetro Set-Token no response da autenticação." ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Recuperado no parâmetro X-CSRF-Token no response da autenticação." ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * Atribuição/Troca de Navio
     *
     * Um evento para cada alteração de navio em que a unidade de carga ou carga solta irá embarcar.&lt;br/&gt;Transmitir imediatamente a atribuição ou alteração.
     *
     */
    @POST
    @Path("/ext/atribuicao-troca-navio")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Atribuição/Troca de Navio", notes = "Um evento para cada alteração de navio em que a unidade de carga ou carga solta irá embarcar.<br/>Transmitir imediatamente a atribuição ou alteração.", tags={ "Serviços destinados à recepção de eventos aduaneiros." })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Recurso criado com sucesso", response = RespostaParaSucessoNaRecepoDeEventoAduaneiro.class),
        @ApiResponse(code = 400, message = "Requisição mal formatada", response = RespostaParaErroNaRecepoDeEventoAduaneiro.class),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio", response = RespostaParaErroNaRecepoDeEventoAduaneiro.class),
        @ApiResponse(code = 500, message = "Erro interno no servidor"),
        @ApiResponse(code = 503, message = "Serviço indisponível") })
    public Response incluir2(@QueryParam("TPP-ID") String TPP_ID, @HeaderParam("abi") String abi, @ApiParam(value = "JSON do evento Atribuição / Troca de Navio." ,required=true)@Valid DadosAtribuioTrocaNavio body, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Recuperado no parâmetro Set-Token no response da autenticação." ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Recuperado no parâmetro X-CSRF-Token no response da autenticação." ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * Posição Veículo Pátio
     *
     * Um evento para cada mudança de posição de veículo no pátio. Evento comum em recintos do modal rodoviário.&lt;br/&gt;Transmitir imediatamente a finalização do posicionamento.&lt;br/&gt;Um evento para cada conjunto PLACA/CONTÊINER/CHASSI posicionada num box no pátio.
     *
     */
    @POST
    @Path("/ext/posicao-veiculo-patio")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Posição Veículo Pátio", notes = "Um evento para cada mudança de posição de veículo no pátio. Evento comum em recintos do modal rodoviário.<br/>Transmitir imediatamente a finalização do posicionamento.<br/>Um evento para cada conjunto PLACA/CONTÊINER/CHASSI posicionada num box no pátio.", tags={ "Serviços destinados à recepção de eventos aduaneiros." })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Recurso criado com sucesso", response = RespostaParaSucessoNaRecepoDeEventoAduaneiro.class),
        @ApiResponse(code = 400, message = "Requisição mal formatada", response = RespostaParaErroNaRecepoDeEventoAduaneiro.class),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio", response = RespostaParaErroNaRecepoDeEventoAduaneiro.class),
        @ApiResponse(code = 500, message = "Erro interno no servidor"),
        @ApiResponse(code = 503, message = "Serviço indisponível") })
    public Response incluir20(@QueryParam("TPP-ID") String TPP_ID, @HeaderParam("abi") String abi, @ApiParam(value = "JSON do evento Posição Veículo Pátio" ,required=true)@Valid DadosPosioVeculoPtio body, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Recuperado no parâmetro Set-Token no response da autenticação." ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Recuperado no parâmetro X-CSRF-Token no response da autenticação." ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * Representantes
     *
     * Lista de pessoas que acessam o sistema do recinto em nome de cada cliente. Diferente do cadastro de representação do siscomex. Toda representação via sistema ou papel deve ser informada.
     *
     */
    @POST
    @Path("/ext/representantes")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Representantes", notes = "Lista de pessoas que acessam o sistema do recinto em nome de cada cliente. Diferente do cadastro de representação do siscomex. Toda representação via sistema ou papel deve ser informada.", tags={ "Serviços destinados à recepção de eventos aduaneiros." })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Recurso criado com sucesso", response = RespostaParaSucessoNaRecepoDeEventoAduaneiro.class),
        @ApiResponse(code = 400, message = "Requisição mal formatada", response = RespostaParaErroNaRecepoDeEventoAduaneiro.class),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio", response = RespostaParaErroNaRecepoDeEventoAduaneiro.class),
        @ApiResponse(code = 500, message = "Erro interno no servidor"),
        @ApiResponse(code = 503, message = "Serviço indisponível") })
    public Response incluir21(@QueryParam("TPP-ID") String TPP_ID, @HeaderParam("abi") String abi, @ApiParam(value = "JSON do evento Representantes" ,required=true)@Valid DadosRepresentante body, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Recuperado no parâmetro Set-Token no response da autenticação." ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Recuperado no parâmetro X-CSRF-Token no response da autenticação." ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * Avaria/Extravio de Lote
     *
     * Um evento para cada avaria ou extravio verificados em lote de carga.&lt;br/&gt;Transmitir imediatamente a verificação da avaria/extravio.&lt;br/&gt;Não aplicar para granel.&lt;br/&gt;Um evento para cada LOTE com avaria/extravio.
     *
     */
    @POST
    @Path("/ext/avaria-extravio-lote")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Avaria/Extravio de Lote", notes = "Um evento para cada avaria ou extravio verificados em lote de carga.<br/>Transmitir imediatamente a verificação da avaria/extravio.<br/>Não aplicar para granel.<br/>Um evento para cada LOTE com avaria/extravio.", tags={ "Serviços destinados à recepção de eventos aduaneiros." })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Recurso criado com sucesso", response = RespostaParaSucessoNaRecepoDeEventoAduaneiro.class),
        @ApiResponse(code = 400, message = "Requisição mal formatada", response = RespostaParaErroNaRecepoDeEventoAduaneiro.class),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio", response = RespostaParaErroNaRecepoDeEventoAduaneiro.class),
        @ApiResponse(code = 500, message = "Erro interno no servidor"),
        @ApiResponse(code = 503, message = "Serviço indisponível") })
    public Response incluir3(@QueryParam("TPP-ID") String TPP_ID, @HeaderParam("abi") String abi, @ApiParam(value = "JSON do evento Avaria / Extravio de Lote." ,required=true)@Valid DadosAvariaExtravioLote body, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Recuperado no parâmetro Set-Token no response da autenticação." ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Recuperado no parâmetro X-CSRF-Token no response da autenticação." ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * Carregamento/Entrega de Lotes
     *
     * Um evento para cada carregamento de lotes em unidade de carga – contêiner, caminhão, etc. Não considerar os movimentos do tipo &#39;house keeping&#39;, a exemplo do carregamento em caminhão para utilizar o scanner, casos em que a carga  retorna, em pouco tempo, para a mesma posição.&lt;br/&gt;O evento deve ser utilizado quando os lotes forem carregados em unidade de carga(caminhão, vagão, contêiner, ULD aeronave) ou entregue à companhia aérea.&lt;br/&gt;No caso de carga solta a ser carregada diretamente em navio, utilizar apenas o evento Embarque Navio informando o número do lote carregado.&lt;br/&gt;Transmitir imediatamente a finalização do carregamento ou da entrega física de um conjunto de lotes por conhecimento.&lt;br/&gt;Não aplicar para granel.&lt;br/&gt;Um evento para cada conjunto de LOTES carregados do mesmo conhecimento.&lt;br/&gt;Transmitir imediatamente ao carregamento de um conjunto de LOTEs por conhecimento.&lt;br/&gt;Pode repetir o conhecimento na transmissão de um novo evento no caso de cargas com saída parcial.
     *
     */
    @POST
    @Path("/ext/carregamento-lotes")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Carregamento/Entrega de Lotes", notes = "Um evento para cada carregamento de lotes em unidade de carga – contêiner, caminhão, etc. Não considerar os movimentos do tipo 'house keeping', a exemplo do carregamento em caminhão para utilizar o scanner, casos em que a carga  retorna, em pouco tempo, para a mesma posição.<br/>O evento deve ser utilizado quando os lotes forem carregados em unidade de carga(caminhão, vagão, contêiner, ULD aeronave) ou entregue à companhia aérea.<br/>No caso de carga solta a ser carregada diretamente em navio, utilizar apenas o evento Embarque Navio informando o número do lote carregado.<br/>Transmitir imediatamente a finalização do carregamento ou da entrega física de um conjunto de lotes por conhecimento.<br/>Não aplicar para granel.<br/>Um evento para cada conjunto de LOTES carregados do mesmo conhecimento.<br/>Transmitir imediatamente ao carregamento de um conjunto de LOTEs por conhecimento.<br/>Pode repetir o conhecimento na transmissão de um novo evento no caso de cargas com saída parcial.", tags={ "Serviços destinados à recepção de eventos aduaneiros." })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Recurso criado com sucesso", response = RespostaParaSucessoNaRecepoDeEventoAduaneiro.class),
        @ApiResponse(code = 400, message = "Requisição mal formatada", response = RespostaParaErroNaRecepoDeEventoAduaneiro.class),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio", response = RespostaParaErroNaRecepoDeEventoAduaneiro.class),
        @ApiResponse(code = 500, message = "Erro interno no servidor"),
        @ApiResponse(code = 503, message = "Serviço indisponível") })
    public Response incluir4(@QueryParam("TPP-ID") String TPP_ID, @HeaderParam("abi") String abi, @ApiParam(value = "JSON do evento Carregamento Entrega Lotes" ,required=true)@Valid DadosCarregamentoEntregaLotes body, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Recuperado no parâmetro Set-Token no response da autenticação." ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Recuperado no parâmetro X-CSRF-Token no response da autenticação." ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * Chegada ao Ponto Zero
     *
     * Neste evento o recinto deve informar as cargas que recebe da companhia aérea(transportadora) quando do ingresso em seu recinto.&lt;br/&gt;
     *
     */
    @POST
    @Path("/ext/chegada-ponto-zero")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Chegada ao Ponto Zero", notes = "Neste evento o recinto deve informar as cargas que recebe da companhia aérea(transportadora) quando do ingresso em seu recinto.<br/>", tags={ "Serviços destinados à recepção de eventos aduaneiros." })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Recurso criado com sucesso", response = RespostaParaSucessoNaRecepoDeEventoAduaneiro.class),
        @ApiResponse(code = 400, message = "Requisição mal formatada", response = RespostaParaErroNaRecepoDeEventoAduaneiro.class),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio", response = RespostaParaErroNaRecepoDeEventoAduaneiro.class),
        @ApiResponse(code = 500, message = "Erro interno no servidor"),
        @ApiResponse(code = 503, message = "Serviço indisponível") })
    public Response incluir5(@QueryParam("TPP-ID") String TPP_ID, @HeaderParam("abi") String abi, @ApiParam(value = "JSON da Chegada ao Ponto Zero." ,required=true)@Valid DadosDaChegadaAoPontoZero body, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Recuperado no parâmetro Set-Token no response da autenticação." ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Recuperado no parâmetro X-CSRF-Token no response da autenticação." ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * Controle de Conferência Física
     *
     * Um evento para cada agendamento ou conclusão de conferência física.&lt;br/&gt;Considerar todos os tipos de conferência solicitadas por qualquer anuente ou pelo proprietário da carga.&lt;br/&gt;Transmitir um evento para cada agendamento ou conclusão de conferência recebida.
     *
     */
    @POST
    @Path("/ext/conferencia-fisica")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Controle de Conferência Física", notes = "Um evento para cada agendamento ou conclusão de conferência física.<br/>Considerar todos os tipos de conferência solicitadas por qualquer anuente ou pelo proprietário da carga.<br/>Transmitir um evento para cada agendamento ou conclusão de conferência recebida.", tags={ "Serviços destinados à recepção de eventos aduaneiros." })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Recurso criado com sucesso", response = RespostaParaSucessoNaRecepoDeEventoAduaneiro.class),
        @ApiResponse(code = 400, message = "Requisição mal formatada", response = RespostaParaErroNaRecepoDeEventoAduaneiro.class),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio", response = RespostaParaErroNaRecepoDeEventoAduaneiro.class),
        @ApiResponse(code = 500, message = "Erro interno no servidor"),
        @ApiResponse(code = 503, message = "Serviço indisponível") })
    public Response incluir6(@QueryParam("TPP-ID") String TPP_ID, @HeaderParam("abi") String abi, @ApiParam(value = "Conferência Física" ,required=true)@Valid DadosDaConfernciaFsica body, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Recuperado no parâmetro Set-Token no response da autenticação." ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Recuperado no parâmetro X-CSRF-Token no response da autenticação." ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * Controle de Acesso de Pessoas
     *
     * Um evento para cada acesso (entrada ou saída) de pessoa ao recinto. Transmitir imediatamente ao acesso (entrada ou saída).&lt;br/&gt;Um evento para cada acesso de CPF;
     *
     */
    @POST
    @Path("/ext/acesso-pessoas")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Controle de Acesso de Pessoas", notes = "Um evento para cada acesso (entrada ou saída) de pessoa ao recinto. Transmitir imediatamente ao acesso (entrada ou saída).<br/>Um evento para cada acesso de CPF;", tags={ "Serviços destinados à recepção de eventos aduaneiros." })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Recurso criado com sucesso", response = RespostaParaSucessoNaRecepoDeEventoAduaneiro.class),
        @ApiResponse(code = 400, message = "Requisição mal formatada", response = RespostaParaErroNaRecepoDeEventoAduaneiro.class),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio", response = RespostaParaErroNaRecepoDeEventoAduaneiro.class),
        @ApiResponse(code = 500, message = "Erro interno no servidor"),
        @ApiResponse(code = 503, message = "Serviço indisponível") })
    public Response incluir7(@QueryParam("TPP-ID") String TPP_ID, @HeaderParam("abi") String abi, @ApiParam(value = "JSON do evento Acesso Pessoa" ,required=true)@Valid DadosAcessoPessoa body, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Recuperado no parâmetro Set-Token no response da autenticação." ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Recuperado no parâmetro X-CSRF-Token no response da autenticação." ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * Controle de Agendamento/Acesso de Veículo
     *
     * Um evento para cada agendamento ou acesso (entrada ou saída) de veículo ao recinto. Transmitir imediatamente ao agendamento ou ao acesso (entrada ou saída).&lt;br/&gt;Um evento para cada agendamento/acesso PLACA/CHASSI/LOCOMOTIVA.&lt;br/&gt;&lt;br/&gt;Obs.: O manifesto e conhecimento de carga informado devem ser os internacionais sempre que existirem. Do contrário deve ser informado conhecimento interno. Exemplo: No ingresso de veículo com contêiner para exportação sem BL existente, tal evento deve constar a informação do CT-e.
     *
     */
    @POST
    @Path("/ext/acesso-veiculos")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Controle de Agendamento/Acesso de Veículo", notes = "Um evento para cada agendamento ou acesso (entrada ou saída) de veículo ao recinto. Transmitir imediatamente ao agendamento ou ao acesso (entrada ou saída).<br/>Um evento para cada agendamento/acesso PLACA/CHASSI/LOCOMOTIVA.<br/><br/>Obs.: O manifesto e conhecimento de carga informado devem ser os internacionais sempre que existirem. Do contrário deve ser informado conhecimento interno. Exemplo: No ingresso de veículo com contêiner para exportação sem BL existente, tal evento deve constar a informação do CT-e.", tags={ "Serviços destinados à recepção de eventos aduaneiros." })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Recurso criado com sucesso", response = RespostaParaSucessoNaRecepoDeEventoAduaneiro.class),
        @ApiResponse(code = 400, message = "Requisição mal formatada", response = RespostaParaErroNaRecepoDeEventoAduaneiro.class),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio", response = RespostaParaErroNaRecepoDeEventoAduaneiro.class),
        @ApiResponse(code = 500, message = "Erro interno no servidor"),
        @ApiResponse(code = 503, message = "Serviço indisponível") })
    public Response incluir8(@QueryParam("TPP-ID") String TPP_ID, @HeaderParam("abi") String abi, @ApiParam(value = "JSON do evento Acesso Veículo" ,required=true)@Valid DadosAcessoVeculo body, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Recuperado no parâmetro Set-Token no response da autenticação." ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Recuperado no parâmetro X-CSRF-Token no response da autenticação." ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * Embarque/Desembarque no Navio
     *
     * Na API-Recintos entende-se por “navio” a embarcação utilizada para o transporte de cargas (vide tabela Embarcação do Mercante).&lt;br/&gt;Um evento para cada embarque ou desembarque de unidades de carga, carga solta ou granel no navio.&lt;br/&gt;Transmitir imediatamente ao encerramento do embarque / desembarque de cada navio.&lt;br/&gt;Transmitir também nos casos de transbordo/baldeação entre navios.&lt;br/&gt;Um evento por CONTÊINER/LOTE CARGA SOLTA/GRANEL embarcado ou desembarcado.&lt;br/&gt;Granel: um evento ao final da operação de carregamento/descarregamento total do navio graneleiro.&lt;br/&gt;Exemplos:&lt;br/&gt;Granel: informar N manifestos, N conhecimentos, N Portos carregamento, N Portos descarregamento, N Países destino final e demais atributos pertinentes.&lt;br/&gt;Contêiner: informar 1 manifesto, N conhecimentos, 1 Porto carregamento, 1 Porto descarregamento, N Países destino final e demais atributos pertinentes.&lt;br/&gt;Lote Carga solta: informar 1 manifesto, 1 conhecimento, 1 Porto carregamento, 1 Porto descarregamento, 1 País destino final e demais atributos pertinentes.
     *
     */
    @POST
    @Path("/ext/embarque-desembarque-navios")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Embarque/Desembarque no Navio", notes = "Na API-Recintos entende-se por “navio” a embarcação utilizada para o transporte de cargas (vide tabela Embarcação do Mercante).<br/>Um evento para cada embarque ou desembarque de unidades de carga, carga solta ou granel no navio.<br/>Transmitir imediatamente ao encerramento do embarque / desembarque de cada navio.<br/>Transmitir também nos casos de transbordo/baldeação entre navios.<br/>Um evento por CONTÊINER/LOTE CARGA SOLTA/GRANEL embarcado ou desembarcado.<br/>Granel: um evento ao final da operação de carregamento/descarregamento total do navio graneleiro.<br/>Exemplos:<br/>Granel: informar N manifestos, N conhecimentos, N Portos carregamento, N Portos descarregamento, N Países destino final e demais atributos pertinentes.<br/>Contêiner: informar 1 manifesto, N conhecimentos, 1 Porto carregamento, 1 Porto descarregamento, N Países destino final e demais atributos pertinentes.<br/>Lote Carga solta: informar 1 manifesto, 1 conhecimento, 1 Porto carregamento, 1 Porto descarregamento, 1 País destino final e demais atributos pertinentes.", tags={ "Serviços destinados à recepção de eventos aduaneiros." })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Recurso criado com sucesso", response = RespostaParaSucessoNaRecepoDeEventoAduaneiro.class),
        @ApiResponse(code = 400, message = "Requisição mal formatada", response = RespostaParaErroNaRecepoDeEventoAduaneiro.class),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida"),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio", response = RespostaParaErroNaRecepoDeEventoAduaneiro.class),
        @ApiResponse(code = 500, message = "Erro interno no servidor"),
        @ApiResponse(code = 503, message = "Serviço indisponível") })
    public Response incluir9(@QueryParam("TPP-ID") String TPP_ID, @HeaderParam("abi") String abi, @ApiParam(value = "JSON do evento Controle de Embarque e Desembarque de Navios" ,required=true)@Valid DadosEmbarqueDesembarqueNavio body, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Recuperado no parâmetro Set-Token no response da autenticação." ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF. Recuperado no parâmetro X-CSRF-Token no response da autenticação." ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken);
}

