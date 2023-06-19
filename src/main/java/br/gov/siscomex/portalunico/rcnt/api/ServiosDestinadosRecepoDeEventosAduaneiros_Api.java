package br.gov.siscomex.portalunico.rcnt.api;

import br.gov.siscomex.portalunico.rcnt.model.*;
import io.swagger.annotations.*;

import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;

/**
 * Recintos Aduaneiros
 *
 * <p><h3>Introdução</h3><p>Bem-vindo à <i>Application Programming Interface (API)</i> de interação entre os recintos e o Portal Único de Comércio Exterior no Sistema Integrado de Comércio Exterior (Portal Siscomex), aqui chamada de API-Recintos. Trata-se de um conjunto de rotinas e padrões de programação para acesso a um aplicativo de software baseado nos padrões Web, que permitirá a recepção de eventos dentro do Portal Siscomex.</p><p>Disponibilizamos os endpoints de 22 eventos.</p><p></p><p>Para a utilização dos serviços desta API, a autenticação via certificação digital, do tipo e-CNPJ, é obrigatória. Caso seja verificado erro na autenticação ao serviço, o sistema irá retornar o erro referente à autenticação conforme especificado na seção Status Codes da API.</p><p>O processo de autenticação deve ser executado conforme descrito em <a href=\"https://docs.portalunico.siscomex.gov.br/introducao-api-publica/#autenticacao\">Autenticação</a>.</p><p>Definições importantes, conforme a Portaria Coana n<sup>o</sup> 72, de 12 de abril de 2022:<p style=\"padding-left:30px\">I - Sistema Informatizado de Controle Aduaneiro (SICA): o conjunto de sistemas informatizados de controle que operem em locais ou recintos alfandegados ou autorizados a operar com mercadorias sob controle aduaneiro;<br/>II - interveniente: a administradora de local ou recinto alfandegado ou autorizado a operar com mercadorias sob controle aduaneiro, o depositário e o operador portuário habilitado ou autorizado a operar nestes locais ou recintos;<br/>III - informações: aquelas relativas às operações de entrada e saída de pessoas e veículos, movimentação de carga e armazenamento de mercadorias, inclusive imagens;<br/>IV - registro: a inserção e a retificação de informações no SICA;<br/>V - eventos: o conjunto de informações previstas no Anexo III desta Portaria que devem ser enviadas à API-Recintos simultaneamente ao seu registro no SICA; e<br/>VI - envio de eventos à API-Recintos: transmissão eletrônica de conjunto de informações, inclusive imagens, registradas no SICA à API-Recintos, por meio da integração entre estes.</p></p><p>O interveniente deverá registrar no SICA e enviar para a API-Recintos, para cada operação que realizar, todas as informações de cada evento, excetuadas as informações inaplicáveis ao caso em concreto.</p><p>O envio de eventos retificadores substitui completamente as informações prestadas no evento retificado.</p><p>Todos os eventos enviados à API-Recintos devem conter o CPF do preposto que realizou o registro das informações no SICA, ressalvados os casos de informações coletadas automaticamente.</p><p>A cada envio de eventos à API-Recintos será retornado um protocolo de recepção que deve ser armazenado no SICA. Esse recibo será a identificação única de um evento dentro da API-Recintos e deve ser utilizado para solicitar a retificação ou exclusão do referido evento. Esse protocolo também deve ser utilizado na identificação de artefatos georreferenciados.</p><p>O SICA deverá funcionar de forma ininterrupta e permitir o envio de eventos à API-Recintos de forma simultânea e integrada com o registro de informações relativas às operações executadas nos locais ou recintos alfandegados ou autorizados a operar com mercadorias sob controle aduaneiro.</p><p>Nota 1: O ambiente de validação/treinamento foi projetado para possibilitar testes de integração entre o SICA e a API-Recintos. Portanto, faça uso racional do ambiente de validação/treinamento pois tentativas massivas de envios de eventos poderão ter limitação temporária de acesso.</p><p>Abaixo, foram consolidadas informações técnicas para a integração dos sistemas dos intervenientes com o Portal:<p style=\"padding-left:30px\">1) No Portal, todos os serviços adotam o mesmo protocolo de acesso, baseado no padrão SSL/TLS e no uso de certificado digital. A API do Portal foi desenvolvida baseada na arquitetura REST. Ela trabalhará com o formato JSON. Além disso, toda a nossa API usará o formato UTF-8;<br/>2) Cada envio deve conter um único evento por vez, seguindo o model previsto para cada qual, sendo comum a todos os eventos os dados referentes ao Cabeçalho do Evento (model: Cabeçalho Envio Evento Aduaneiro);<br/>3) O processo de recepção, por parte da API-Recintos, é composta por etapa de validação, armazenamento e, por fim, retorna-se o protocolo de recepção. Dessa maneira, somente será atribuído e retornado o protocolo de recepção para os eventos processados com sucesso. Qualquer erro de validação ou no processamento ocasiona a interrupção da recepção, sendo retornado detalhamento do erro;<br/>4) Para Operações de Retificação e Exclusão é obrigatório informar valor para o atributo protocoloEventoRetificadoOuExcluido que deve apontar para o evento alvo da ação de Retificação ou Exclusão;<br/>5) Para Operações de Exclusão orientamos preencherem apenas o cabeçalho dos eventos.<br/>6) Listas: cada atributo de lista deverá conter um atributo idElemento que identifique unicamente cada item da lista. No caso de eventos retificadores, que referenciam um evento transmitido anteriormente, o recinto deve ser capaz de 'repetir' o mesmo 'idElemento' utilizado no evento retificado;<br/>7) Atributos duplicados: a API não critica atributos duplicados e, caso existam, o conteúdo da segunda ocorrência irá sobrepor o conteúdo da primeira;<br/>8) Domínios: os domínios são sensíveis a maiúsculas e minúsculas;<br/>9) Atributos de data/hora com fuso: deve-se enviar o fuso horário no qual tal data/hora foi gerada considerando, inclusive, o horário de verão.<br/>10) Os perfis de autenticação que devem ser utilizados pelas empresas são: a) Depositário (DEPOSIT) ou b) Operador Portuário (OPERPORT).<br/>11) O campo \"codigoRecinto\" deve ser informado obrigatoriamente em todos os eventos transmitidos na API Recintos.</p><p>O depositário, inclusive quando executar atividades de operador portuário em seu próprio recinto, pode enviar todos os eventos com a autenticação DEPOSIT. O pacote de dados a ser transmitido deve informar o seu código de recinto (codigoRecinto), ou seja, o código do recinto onde ocorreu o evento a ser transmitido.</p><p>Caso o interveniente atue exclusivamente como operador portuário, ou seja, não acumule ambas as atuações (depositário e operador portuário) no recinto de ocorrência do evento, então ele deve usar o perfil OPERPORT para autenticação. Enfatiza-se que o código de recinto (codigoRecinto), indicado no pacote de dados, deve refletir o recinto onde, de fato, ocorreu o evento a ser transmitido.<h4>URLs de Acesso</h4><p>Para utilizar os servi&ccedil;os dispon&iacute;veis nessa API deve-se usar as seguintes de URLs:</p><style type=\"text/css\">.tg  {border-collapse:collapse;border-color:#bbb;border-spacing:0;width: 900px;}.tg td{background-color:#E0FFEB;border-color:#bbb;border-style:solid;border-width:1px;color:#594F4F;font-family:Arial, sans-serif;font-size:14px;overflow:hidden;padding:10px 5px;word-break:normal;}.tg th{background-color:#9DE0AD;border-color:#bbb;border-style:solid;border-width:1px;color:#493F3F;font-family:Arial, sans-serif;font-size:14px;fon t-weight:normal;overflow:hidden;padding:10px 5px;word-break:normal;}.tg .tg-cabecalho{text-align:left;vertical-align:top}.tg .tg-corpo{border-color:inherit;text-align:left;vertical-align:top}</style><table class=\"tg\" style=\"width: 900px;\"><thead><tr><th class=\"tg-cabecalho\"><span style=\"font-weight:bold\">Nome do Ambiente</span></th><th class=\"tg-cabecalho\"><span style=\"font-weight:bold\">URL de acesso</span></th></tr></thead><tbody><tr><td class=\"tg-corpo\">Ambiente de Validação de Empresas</td><td class=\"tg-corpo\">https://val.portalunico.siscomex.gov.br/recintos-ext/api/{serviço}</td></tr><tr><td class=\"tg-corpo\">Ambiente de Produção</td><td class=\"tg-corpo\">https://portalunico.siscomex.gov.br/recintos-ext/api/{serviço}</td></tr></tbody></table><p>&nbsp;</p><p>Logo, abaixo temos um exemplo de URL completa considerando o ambiente de Valida&ccedil;&atilde;o de Empresas, consumindo o servi&ccedil;o de Credenciamento de Pessoas:</p><p><em>https://val.portalunico.siscomex.gov.br/recintos-ext/api/ext/credenciamento-pessoas</em></p>
 *
 */
@Path("/")
@Api(value = "/", description = "")
public interface ServiosDestinadosRecepoDeEventosAduaneiros_Api  {

    /**
     * Agenda/Operação de Navios/Aeronaves
     *
     * Um evento para cada inclusão / alteração no &#39;line up&#39; / &#39;agenda&#39; de navios / aeronaves com atracação / pouso previstos para o recinto.&lt;br/&gt;&lt;br/&gt;Transmitir a agenda (previsão), a chegada (atracação/desatracação pouso/decolagem) e a operação.&lt;br/&gt;&lt;br/&gt;Evento aplicável para recintos com atracadouro ou pista aeronáutica próprios.&lt;br/&gt;&lt;br/&gt;&lt;br/&gt;Exemplo de eventos para Navio:&lt;br/&gt;&lt;br/&gt;Chegada  (informa a viagem e escala de chegada, dados da embarcação, dentre outros)&lt;br/&gt;&lt;br/&gt;evento 1 - previsão de atracação e desatracação;&lt;br/&gt;&lt;br/&gt;evento 2 - previsão + efetiva atracação&lt;br/&gt;&lt;br/&gt;evento 3 - previsão + efetiva atracação + início operação &lt;br/&gt;&lt;br/&gt;&lt;br/&gt;Saída (informa a viagem e escala de partida, dados da embarcação, dentre outros)&lt;br/&gt;&lt;br/&gt;evento 4 - previsão + efetiva atracação + início operação + final operação &lt;br/&gt;&lt;br/&gt;evento 5 - previsão + efetiva atracação + início operação + final operação + efetiva desatracação &lt;br/&gt;&lt;br/&gt;&lt;br/&gt;Exemplo de eventos para Aeronave:&lt;br/&gt;&lt;br/&gt;Chegada  (informa o VOO e viagem de chegada, dados da aeronave, dentre outros)&lt;br/&gt;&lt;br/&gt;evento 1 - previsão de pouso;&lt;br/&gt;&lt;br/&gt;evento 2 - previsão + efetivo pouso&lt;br/&gt;&lt;br/&gt;evento 3 - previsão + efetivo pouso + início operaçã&lt;br/&gt;&lt;br/&gt;&lt;br/&gt;Saída  (informa o VOO e viagem de partida, dados da aeronave, dentre outros)&lt;br/&gt;&lt;br/&gt;evento 4 - previsão + efetivo pouso + início operação  + previsão de partida;          &lt;br/&gt;&lt;br/&gt;evento 5 - previsão + efetivo pouso + início operação  + previsão + final operação   &lt;br/&gt;&lt;br/&gt;evento 6 - previsão + efetivo pouso + início operação  + previsão + final operação + efetiva partida&lt;br/&gt;&lt;br/&gt;&lt;strong&gt;Transmitir imediatamente a recepção da informação.&lt;/strong&gt;&lt;br/&gt;
     *
     */
    @POST
    @Path("/ext/agenda-navios-aeronaves")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Agenda/Operação de Navios/Aeronaves", notes = "Um evento para cada inclusão / alteração no 'line up' / 'agenda' de navios / aeronaves com atracação / pouso previstos para o recinto.<br/><br/>Transmitir a agenda (previsão), a chegada (atracação/desatracação pouso/decolagem) e a operação.<br/><br/>Evento aplicável para recintos com atracadouro ou pista aeronáutica próprios.<br/><br/><br/>Exemplo de eventos para Navio:<br/><br/>Chegada  (informa a viagem e escala de chegada, dados da embarcação, dentre outros)<br/><br/>evento 1 - previsão de atracação e desatracação;<br/><br/>evento 2 - previsão + efetiva atracação<br/><br/>evento 3 - previsão + efetiva atracação + início operação <br/><br/><br/>Saída (informa a viagem e escala de partida, dados da embarcação, dentre outros)<br/><br/>evento 4 - previsão + efetiva atracação + início operação + final operação <br/><br/>evento 5 - previsão + efetiva atracação + início operação + final operação + efetiva desatracação <br/><br/><br/>Exemplo de eventos para Aeronave:<br/><br/>Chegada  (informa o VOO e viagem de chegada, dados da aeronave, dentre outros)<br/><br/>evento 1 - previsão de pouso;<br/><br/>evento 2 - previsão + efetivo pouso<br/><br/>evento 3 - previsão + efetivo pouso + início operaçã<br/><br/><br/>Saída  (informa o VOO e viagem de partida, dados da aeronave, dentre outros)<br/><br/>evento 4 - previsão + efetivo pouso + início operação  + previsão de partida;          <br/><br/>evento 5 - previsão + efetivo pouso + início operação  + previsão + final operação   <br/><br/>evento 6 - previsão + efetivo pouso + início operação  + previsão + final operação + efetiva partida<br/><br/><strong>Transmitir imediatamente a recepção da informação.</strong><br/>", tags={ "Serviços destinados à recepção de eventos aduaneiros." })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Recurso criado com sucesso", response = RespostaParaSucessoNaRecepoDeEventoAduaneiro.class),
        @ApiResponse(code = 400, message = "Requisição mal formatada"),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida", response = ExceptionCoverDocumentacao.class),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio", response = ExceptionCoverDocumentacao.class),
        @ApiResponse(code = 500, message = "Erro interno no servidor"),
        @ApiResponse(code = 503, message = "Serviço indisponível") })
    public Response incluirUsingPOST(@ApiParam(value = "JSON do evento Agenda Operação Navios Aeronaves" ,required=true)@Valid DadosAgendaOperaoNaviosAeronaves body, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token deve ser preenchido com o conteúdo do header Set-Token, retornado no response headers da chamada ao serviço de autenticação." ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF (Cross-Site Request Forgery). Este token deve ser preenchido com o conteúdo do header X-CSRF-Token, retornado no response headers da chamada ao serviço de autenticação." ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * Armazenamento de Lote
     *
     * Um evento para cada armazenamento/mudança de posição do lote dentro do armazém.&lt;br/&gt;Não considerar os movimentos do tipo “house keeping”, a exemplo do posicionamento para verificação ou inspeção física, casos em que a carga retorna, em pouco tempo, para a mesma posição.&lt;br/&gt;Não aplicar para granel.&lt;br/&gt;Transmitir imediatamente a finalização do armazenamento.&lt;br/&gt;Um evento para cada LOTE armazenado.
     *
     */
    @POST
    @Path("/ext/armazenamento-lote")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Armazenamento de Lote", notes = "Um evento para cada armazenamento/mudança de posição do lote dentro do armazém.<br/>Não considerar os movimentos do tipo “house keeping”, a exemplo do posicionamento para verificação ou inspeção física, casos em que a carga retorna, em pouco tempo, para a mesma posição.<br/>Não aplicar para granel.<br/>Transmitir imediatamente a finalização do armazenamento.<br/>Um evento para cada LOTE armazenado.", tags={ "Serviços destinados à recepção de eventos aduaneiros." })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Recurso criado com sucesso", response = RespostaParaSucessoNaRecepoDeEventoAduaneiro.class),
        @ApiResponse(code = 400, message = "Requisição mal formatada"),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida", response = ExceptionCoverDocumentacao.class),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio", response = ExceptionCoverDocumentacao.class),
        @ApiResponse(code = 500, message = "Erro interno no servidor"),
        @ApiResponse(code = 503, message = "Serviço indisponível") })
    public Response incluirUsingPOST1(@ApiParam(value = "JSON do evento Armazenamento de Lote." ,required=true)@Valid DadosArmazenamentoLote body, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token deve ser preenchido com o conteúdo do header Set-Token, retornado no response headers da chamada ao serviço de autenticação." ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF (Cross-Site Request Forgery). Este token deve ser preenchido com o conteúdo do header X-CSRF-Token, retornado no response headers da chamada ao serviço de autenticação." ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken);

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
        @ApiResponse(code = 400, message = "Requisição mal formatada"),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida", response = ExceptionCoverDocumentacao.class),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio", response = ExceptionCoverDocumentacao.class),
        @ApiResponse(code = 500, message = "Erro interno no servidor"),
        @ApiResponse(code = 503, message = "Serviço indisponível") })
    public Response incluirUsingPOST10(@ApiParam(value = "JSON do evento Credenciamento Pessoas" ,required=true)@Valid DadosCredenciamentoPessoa body, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token deve ser preenchido com o conteúdo do header Set-Token, retornado no response headers da chamada ao serviço de autenticação." ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF (Cross-Site Request Forgery). Este token deve ser preenchido com o conteúdo do header X-CSRF-Token, retornado no response headers da chamada ao serviço de autenticação." ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken);

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
        @ApiResponse(code = 400, message = "Requisição mal formatada"),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida", response = ExceptionCoverDocumentacao.class),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio", response = ExceptionCoverDocumentacao.class),
        @ApiResponse(code = 500, message = "Erro interno no servidor"),
        @ApiResponse(code = 503, message = "Serviço indisponível") })
    public Response incluirUsingPOST11(@ApiParam(value = "JSON do evento Credenciamento de Veículos" ,required=true)@Valid DadosCredenciamentoVeculo body, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token deve ser preenchido com o conteúdo do header Set-Token, retornado no response headers da chamada ao serviço de autenticação." ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF (Cross-Site Request Forgery). Este token deve ser preenchido com o conteúdo do header X-CSRF-Token, retornado no response headers da chamada ao serviço de autenticação." ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken);

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
        @ApiResponse(code = 400, message = "Requisição mal formatada"),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida", response = ExceptionCoverDocumentacao.class),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio", response = ExceptionCoverDocumentacao.class),
        @ApiResponse(code = 500, message = "Erro interno no servidor"),
        @ApiResponse(code = 503, message = "Serviço indisponível") })
    public Response incluirUsingPOST12(@ApiParam(value = "JSON do evento Georreferenciamento" ,required=true)@Valid DadosGeorreferenciamento body, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token deve ser preenchido com o conteúdo do header Set-Token, retornado no response headers da chamada ao serviço de autenticação." ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF (Cross-Site Request Forgery). Este token deve ser preenchido com o conteúdo do header X-CSRF-Token, retornado no response headers da chamada ao serviço de autenticação." ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * Geração de Lotes
     *
     * Um evento para cada conjunto de LOTEs gerados por conhecimento.Não considerar os movimentos do tipo “house keeping”, a exemplo de desunitização para verificação ou inspeção física, casos em que a carga deve ser reunitizada após o processo.&lt;br/&gt;Exemplos de geração de lote; desunitização &#x3D; n... lotes; baldeação imediata &#x3D; n... lotes; depositada em armazém &#x3D; n... lotes;&lt;br/&gt;Baldeação, a transferência de mercadoria descarregada de um veículo e posteriormente carregada em outro. Nesse caso ocorre a geração lote e posterior carregamento lote.&lt;br/&gt;Não aplicar para granel.&lt;br/&gt;Transmitir imediatamente a geração de um conjunto de LOTEs por conhecimento.&lt;br/&gt;Pode repetir o conhecimento na transmissão de um novo evento no caso de cargas com chegada parcial.&lt;br/&gt;&lt;br/&gt;Este evento possui integração com Controle de Carga e Trânsito na Importação – modal aéreo (CCT Importação) para funcionalidade de \&quot;recepção de carga\&quot; (Para mais informações,&lt;a href &#x3D;\&quot;https://www.gov.br/siscomex/pt-br/arquivos-e-imagens/manualcctimportao.pdf\&quot;&gt; clique aqui&lt;/a&gt;).&lt;br/&gt; 
     *
     */
    @POST
    @Path("/ext/geracao-lotes")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Geração de Lotes", notes = "Um evento para cada conjunto de LOTEs gerados por conhecimento.Não considerar os movimentos do tipo “house keeping”, a exemplo de desunitização para verificação ou inspeção física, casos em que a carga deve ser reunitizada após o processo.<br/>Exemplos de geração de lote; desunitização = n... lotes; baldeação imediata = n... lotes; depositada em armazém = n... lotes;<br/>Baldeação, a transferência de mercadoria descarregada de um veículo e posteriormente carregada em outro. Nesse caso ocorre a geração lote e posterior carregamento lote.<br/>Não aplicar para granel.<br/>Transmitir imediatamente a geração de um conjunto de LOTEs por conhecimento.<br/>Pode repetir o conhecimento na transmissão de um novo evento no caso de cargas com chegada parcial.<br/><br/>Este evento possui integração com Controle de Carga e Trânsito na Importação – modal aéreo (CCT Importação) para funcionalidade de \"recepção de carga\" (Para mais informações,<a href =\"https://www.gov.br/siscomex/pt-br/arquivos-e-imagens/manualcctimportao.pdf\"> clique aqui</a>).<br/> ", tags={ "Serviços destinados à recepção de eventos aduaneiros." })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Recurso criado com sucesso", response = RespostaParaSucessoNaRecepoDeEventoAduaneiro.class),
        @ApiResponse(code = 400, message = "Requisição mal formatada"),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida", response = ExceptionCoverDocumentacao.class),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio", response = ExceptionCoverDocumentacao.class),
        @ApiResponse(code = 500, message = "Erro interno no servidor"),
        @ApiResponse(code = 503, message = "Serviço indisponível") })
    public Response incluirUsingPOST13(@ApiParam(value = "JSON do evento Geração de Lotes" ,required=true)@Valid DadosGeraoLote body, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token deve ser preenchido com o conteúdo do header Set-Token, retornado no response headers da chamada ao serviço de autenticação." ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF (Cross-Site Request Forgery). Este token deve ser preenchido com o conteúdo do header X-CSRF-Token, retornado no response headers da chamada ao serviço de autenticação." ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * Informação de Bloqueio/Desbloqueio de Veículo/Carga
     *
     * Um evento para cada bloqueio/desbloqueio de carga solicitado/efetuado diretamente no sistema do recinto.&lt;br/&gt;Não enviar os bloqueios/desbloqueios automáticos implementados no sistema do recinto.&lt;br/&gt;Não se trata do bloqueio no sistema Carga e/ou CCT.&lt;br/&gt;Transmitir um evento para cada solicitação de bloqueio ou desbloqueio efetivada no sistema privado do recinto para conhecimento, contêiner, veículo ou lote.
     *
     */
    @POST
    @Path("/ext/bloqueio-desbloqueio-veiculo-carga")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Informação de Bloqueio/Desbloqueio de Veículo/Carga", notes = "Um evento para cada bloqueio/desbloqueio de carga solicitado/efetuado diretamente no sistema do recinto.<br/>Não enviar os bloqueios/desbloqueios automáticos implementados no sistema do recinto.<br/>Não se trata do bloqueio no sistema Carga e/ou CCT.<br/>Transmitir um evento para cada solicitação de bloqueio ou desbloqueio efetivada no sistema privado do recinto para conhecimento, contêiner, veículo ou lote.", tags={ "Serviços destinados à recepção de eventos aduaneiros." })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Recurso criado com sucesso", response = RespostaParaSucessoNaRecepoDeEventoAduaneiro.class),
        @ApiResponse(code = 400, message = "Requisição mal formatada"),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida", response = ExceptionCoverDocumentacao.class),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio", response = ExceptionCoverDocumentacao.class),
        @ApiResponse(code = 500, message = "Erro interno no servidor"),
        @ApiResponse(code = 503, message = "Serviço indisponível") })
    public Response incluirUsingPOST14(@ApiParam(value = "JSON do evento Informação Bloqueio Desbloqueio Veículo Carga" ,required=true)@Valid DadosInformaoBloqueioDesbloqueioVeculoCarga body, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token deve ser preenchido com o conteúdo do header Set-Token, retornado no response headers da chamada ao serviço de autenticação." ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF (Cross-Site Request Forgery). Este token deve ser preenchido com o conteúdo do header X-CSRF-Token, retornado no response headers da chamada ao serviço de autenticação." ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken);

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
        @ApiResponse(code = 400, message = "Requisição mal formatada"),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida", response = ExceptionCoverDocumentacao.class),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio", response = ExceptionCoverDocumentacao.class),
        @ApiResponse(code = 500, message = "Erro interno no servidor"),
        @ApiResponse(code = 503, message = "Serviço indisponível") })
    public Response incluirUsingPOST15(@ApiParam(value = "JSON do evento Informação Prévia Trânsito Simplificado Contêiner" ,required=true)@Valid DadosInformaoPrviaTrnsitoSimplificadoContiner body, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token deve ser preenchido com o conteúdo do header Set-Token, retornado no response headers da chamada ao serviço de autenticação." ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF (Cross-Site Request Forgery). Este token deve ser preenchido com o conteúdo do header X-CSRF-Token, retornado no response headers da chamada ao serviço de autenticação." ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * Inspeção não invasiva
     *
     * Um evento para cada inspeção não invasiva de unidades de carga.&lt;br/&gt;Transmitir imediatamente após a finalização da inspeção.&lt;br/&gt;Um evento para cada conjunto PLACA/CONTÊINER/VOLUME escaneados.
     *
     */
    @POST
    @Path("/ext/inspecao-nao-invasiva")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Inspeção não invasiva", notes = "Um evento para cada inspeção não invasiva de unidades de carga.<br/>Transmitir imediatamente após a finalização da inspeção.<br/>Um evento para cada conjunto PLACA/CONTÊINER/VOLUME escaneados.", tags={ "Serviços destinados à recepção de eventos aduaneiros." })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Recurso criado com sucesso", response = RespostaParaSucessoNaRecepoDeEventoAduaneiro.class),
        @ApiResponse(code = 400, message = "Requisição mal formatada"),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida", response = ExceptionCoverDocumentacao.class),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio", response = ExceptionCoverDocumentacao.class),
        @ApiResponse(code = 500, message = "Erro interno no servidor"),
        @ApiResponse(code = 503, message = "Serviço indisponível") })
    public Response incluirUsingPOST16(@ApiParam(value = "Inspeção não invasiva" ,required=true)@Valid DadosDaInspeoNoInvasiva body, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token deve ser preenchido com o conteúdo do header Set-Token, retornado no response headers da chamada ao serviço de autenticação." ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF (Cross-Site Request Forgery). Este token deve ser preenchido com o conteúdo do header X-CSRF-Token, retornado no response headers da chamada ao serviço de autenticação." ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * Ocorrências de indisponibilidades de equipamentos
     *
     * Transmitir um evento para cada indisponibilidade e retorno à normalidade de cada equipamento definido.&lt;br/&gt;Não considerar indisponibilidades do tipo “house keeping”, casos de manutenção preventiva, rápida e, muitas vezes, diária de equipamentos (exemplo: trocas de óleo em Portêiner que é executada diariamente).
     *
     */
    @POST
    @Path("/ext/indisponibilidade-equipamentos")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Ocorrências de indisponibilidades de equipamentos", notes = "Transmitir um evento para cada indisponibilidade e retorno à normalidade de cada equipamento definido.<br/>Não considerar indisponibilidades do tipo “house keeping”, casos de manutenção preventiva, rápida e, muitas vezes, diária de equipamentos (exemplo: trocas de óleo em Portêiner que é executada diariamente).", tags={ "Serviços destinados à recepção de eventos aduaneiros." })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Recurso criado com sucesso", response = RespostaParaSucessoNaRecepoDeEventoAduaneiro.class),
        @ApiResponse(code = 400, message = "Requisição mal formatada"),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida", response = ExceptionCoverDocumentacao.class),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio", response = ExceptionCoverDocumentacao.class),
        @ApiResponse(code = 500, message = "Erro interno no servidor"),
        @ApiResponse(code = 503, message = "Serviço indisponível") })
    public Response incluirUsingPOST17(@ApiParam(value = "JSON do evento Ocorrências Indisponibilidades Equipamentos" ,required=true)@Valid DadosIndisponibilidadeEquipamento body, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token deve ser preenchido com o conteúdo do header Set-Token, retornado no response headers da chamada ao serviço de autenticação." ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF (Cross-Site Request Forgery). Este token deve ser preenchido com o conteúdo do header X-CSRF-Token, retornado no response headers da chamada ao serviço de autenticação." ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * Pesagem de Veículo/Carga
     *
     * Um evento para cada pesagem efetuada em unidades de carga.&lt;br/&gt; Usar este evento também nos casos em que a pesagem for efetuada em equipamentos de movimentação de Contêineres (RTG, etc) e, neste caso, não informar placas (veículos e semirreboques) e nem taras do conjunto transportador.&lt;br/&gt;Caso a pesagem aconteça via Portainer ou balança de fluxo na operação de embarque/desembarque navio, informar o peso aferido no evento Embarque/Desembarque Navio.&lt;br/&gt;A pesagem dos volumes, nos casos de geração de lotes, deve ser informada no evento Geração Lotes.&lt;br/&gt;No caso de granel que ingressar ou sair do recinto via dutos, transmitir o presente evento com a soma das bateladas da balança de fluxo ao final da operação.&lt;br/&gt;Um evento para cada conjunto de PLACA/CONTÊINER/VOLUME pesados.&lt;br/&gt;Transmitir após a pesagem.&lt;br/&gt;&lt;br/&gt;Obs. 1: As taras de veículo e semirreboque podem ser informadas em separado ou em conjunto e são excludentes, ou seja, caso o recinto opere com a tara do conjunto (cavalo / semirreboque) ,comum no modal aquaviário, informar esta e ignorar a tara em separado, conforme determinação unidade local.&lt;br/&gt;As taras devem ser informadas em separado nos casos de recintos que possuem cadastro de taras, conforme determinação da unidade local. Esse tipo de cadastro é comum no modal rodoviário em que cargas de importação ou exportação ingressam no recinto e permanecem sob rodas até o desembaraço.&lt;br/&gt;&lt;br/&gt;Obs. 2: Para os casos em que a pesagem é feita no gate (ou balança interna), comum no modal aquaviário, usar a tara aferida na última pesagem do conjunto vazio.&lt;br/&gt;Caso o conjunto realize a primeira passagem no recinto “carregado / cheio”, retificar o evento assim que obter a tara do conjunto vazio.&lt;br/&gt;&lt;br/&gt;Obs. 3: Pesagens de veículos vazios, conforme determinação da unidade local, devem ser transmitidas com valores iguais para os atributos peso bruto da balança e tara individual ou tara do conjunto, conforme o caso.
     *
     */
    @POST
    @Path("/ext/pesagem-veiculos-cargas")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Pesagem de Veículo/Carga", notes = "Um evento para cada pesagem efetuada em unidades de carga.<br/> Usar este evento também nos casos em que a pesagem for efetuada em equipamentos de movimentação de Contêineres (RTG, etc) e, neste caso, não informar placas (veículos e semirreboques) e nem taras do conjunto transportador.<br/>Caso a pesagem aconteça via Portainer ou balança de fluxo na operação de embarque/desembarque navio, informar o peso aferido no evento Embarque/Desembarque Navio.<br/>A pesagem dos volumes, nos casos de geração de lotes, deve ser informada no evento Geração Lotes.<br/>No caso de granel que ingressar ou sair do recinto via dutos, transmitir o presente evento com a soma das bateladas da balança de fluxo ao final da operação.<br/>Um evento para cada conjunto de PLACA/CONTÊINER/VOLUME pesados.<br/>Transmitir após a pesagem.<br/><br/>Obs. 1: As taras de veículo e semirreboque podem ser informadas em separado ou em conjunto e são excludentes, ou seja, caso o recinto opere com a tara do conjunto (cavalo / semirreboque) ,comum no modal aquaviário, informar esta e ignorar a tara em separado, conforme determinação unidade local.<br/>As taras devem ser informadas em separado nos casos de recintos que possuem cadastro de taras, conforme determinação da unidade local. Esse tipo de cadastro é comum no modal rodoviário em que cargas de importação ou exportação ingressam no recinto e permanecem sob rodas até o desembaraço.<br/><br/>Obs. 2: Para os casos em que a pesagem é feita no gate (ou balança interna), comum no modal aquaviário, usar a tara aferida na última pesagem do conjunto vazio.<br/>Caso o conjunto realize a primeira passagem no recinto “carregado / cheio”, retificar o evento assim que obter a tara do conjunto vazio.<br/><br/>Obs. 3: Pesagens de veículos vazios, conforme determinação da unidade local, devem ser transmitidas com valores iguais para os atributos peso bruto da balança e tara individual ou tara do conjunto, conforme o caso.", tags={ "Serviços destinados à recepção de eventos aduaneiros." })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Recurso criado com sucesso", response = RespostaParaSucessoNaRecepoDeEventoAduaneiro.class),
        @ApiResponse(code = 400, message = "Requisição mal formatada"),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida", response = ExceptionCoverDocumentacao.class),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio", response = ExceptionCoverDocumentacao.class),
        @ApiResponse(code = 500, message = "Erro interno no servidor"),
        @ApiResponse(code = 503, message = "Serviço indisponível") })
    public Response incluirUsingPOST18(@ApiParam(value = "JSON do evento Pesagem de Veículos/Cargas" ,required=true)@Valid DadosPesagemVeculo body, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token deve ser preenchido com o conteúdo do header Set-Token, retornado no response headers da chamada ao serviço de autenticação." ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF (Cross-Site Request Forgery). Este token deve ser preenchido com o conteúdo do header X-CSRF-Token, retornado no response headers da chamada ao serviço de autenticação." ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken);

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
        @ApiResponse(code = 400, message = "Requisição mal formatada"),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida", response = ExceptionCoverDocumentacao.class),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio", response = ExceptionCoverDocumentacao.class),
        @ApiResponse(code = 500, message = "Erro interno no servidor"),
        @ApiResponse(code = 503, message = "Serviço indisponível") })
    public Response incluirUsingPOST19(@ApiParam(value = "JSON do evento Posição do Contêiner." ,required=true)@Valid DadosPosioContiner body, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token deve ser preenchido com o conteúdo do header Set-Token, retornado no response headers da chamada ao serviço de autenticação." ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF (Cross-Site Request Forgery). Este token deve ser preenchido com o conteúdo do header X-CSRF-Token, retornado no response headers da chamada ao serviço de autenticação." ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken);

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
        @ApiResponse(code = 400, message = "Requisição mal formatada"),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida", response = ExceptionCoverDocumentacao.class),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio", response = ExceptionCoverDocumentacao.class),
        @ApiResponse(code = 500, message = "Erro interno no servidor"),
        @ApiResponse(code = 503, message = "Serviço indisponível") })
    public Response incluirUsingPOST2(@ApiParam(value = "JSON do evento Atribuição / Troca de Navio." ,required=true)@Valid DadosAtribuioTrocaNavio body, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token deve ser preenchido com o conteúdo do header Set-Token, retornado no response headers da chamada ao serviço de autenticação." ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF (Cross-Site Request Forgery). Este token deve ser preenchido com o conteúdo do header X-CSRF-Token, retornado no response headers da chamada ao serviço de autenticação." ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken);

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
        @ApiResponse(code = 400, message = "Requisição mal formatada"),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida", response = ExceptionCoverDocumentacao.class),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio", response = ExceptionCoverDocumentacao.class),
        @ApiResponse(code = 500, message = "Erro interno no servidor"),
        @ApiResponse(code = 503, message = "Serviço indisponível") })
    public Response incluirUsingPOST20(@ApiParam(value = "JSON do evento Posição Veículo Pátio" ,required=true)@Valid DadosPosioVeculoPtio body, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token deve ser preenchido com o conteúdo do header Set-Token, retornado no response headers da chamada ao serviço de autenticação." ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF (Cross-Site Request Forgery). Este token deve ser preenchido com o conteúdo do header X-CSRF-Token, retornado no response headers da chamada ao serviço de autenticação." ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * Representantes
     *
     * Lista de pessoas que acessam o sistema do recinto em nome de cada cliente ou que possuam representação via procuração. Diferente do cadastro de representação do Siscomex. Toda representação via sistema ou papel deve ser informada. Transmitir um evento para cada representação CPF/CNPJ.
     *
     */
    @POST
    @Path("/ext/representantes")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Representantes", notes = "Lista de pessoas que acessam o sistema do recinto em nome de cada cliente ou que possuam representação via procuração. Diferente do cadastro de representação do Siscomex. Toda representação via sistema ou papel deve ser informada. Transmitir um evento para cada representação CPF/CNPJ.", tags={ "Serviços destinados à recepção de eventos aduaneiros." })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Recurso criado com sucesso", response = RespostaParaSucessoNaRecepoDeEventoAduaneiro.class),
        @ApiResponse(code = 400, message = "Requisição mal formatada"),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida", response = ExceptionCoverDocumentacao.class),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio", response = ExceptionCoverDocumentacao.class),
        @ApiResponse(code = 500, message = "Erro interno no servidor"),
        @ApiResponse(code = 503, message = "Serviço indisponível") })
    public Response incluirUsingPOST21(@ApiParam(value = "JSON do evento Representantes" ,required=true)@Valid DadosRepresentante body, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token deve ser preenchido com o conteúdo do header Set-Token, retornado no response headers da chamada ao serviço de autenticação." ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF (Cross-Site Request Forgery). Este token deve ser preenchido com o conteúdo do header X-CSRF-Token, retornado no response headers da chamada ao serviço de autenticação." ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken);

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
        @ApiResponse(code = 400, message = "Requisição mal formatada"),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida", response = ExceptionCoverDocumentacao.class),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio", response = ExceptionCoverDocumentacao.class),
        @ApiResponse(code = 500, message = "Erro interno no servidor"),
        @ApiResponse(code = 503, message = "Serviço indisponível") })
    public Response incluirUsingPOST3(@ApiParam(value = "JSON do evento Avaria / Extravio de Lote." ,required=true)@Valid DadosAvariaExtravioLote body, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token deve ser preenchido com o conteúdo do header Set-Token, retornado no response headers da chamada ao serviço de autenticação." ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF (Cross-Site Request Forgery). Este token deve ser preenchido com o conteúdo do header X-CSRF-Token, retornado no response headers da chamada ao serviço de autenticação." ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken);

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
        @ApiResponse(code = 400, message = "Requisição mal formatada"),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida", response = ExceptionCoverDocumentacao.class),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio", response = ExceptionCoverDocumentacao.class),
        @ApiResponse(code = 500, message = "Erro interno no servidor"),
        @ApiResponse(code = 503, message = "Serviço indisponível") })
    public Response incluirUsingPOST4(@ApiParam(value = "JSON do evento Carregamento Entrega Lotes" ,required=true)@Valid DadosCarregamentoEntregaLotes body, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token deve ser preenchido com o conteúdo do header Set-Token, retornado no response headers da chamada ao serviço de autenticação." ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF (Cross-Site Request Forgery). Este token deve ser preenchido com o conteúdo do header X-CSRF-Token, retornado no response headers da chamada ao serviço de autenticação." ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * Chegada ao Ponto Zero
     *
     * Neste evento o recinto deve informar as cargas que recebe da companhia aérea(transportadora) quando do ingresso em seu recinto.&lt;br/&gt;&lt;br/&gt;Transmitir quando existir ULD (Unit Load Device - Aéreo)
     *
     */
    @POST
    @Path("/ext/chegada-ponto-zero")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Chegada ao Ponto Zero", notes = "Neste evento o recinto deve informar as cargas que recebe da companhia aérea(transportadora) quando do ingresso em seu recinto.<br/><br/>Transmitir quando existir ULD (Unit Load Device - Aéreo)", tags={ "Serviços destinados à recepção de eventos aduaneiros." })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Recurso criado com sucesso", response = RespostaParaSucessoNaRecepoDeEventoAduaneiro.class),
        @ApiResponse(code = 400, message = "Requisição mal formatada"),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida", response = ExceptionCoverDocumentacao.class),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio", response = ExceptionCoverDocumentacao.class),
        @ApiResponse(code = 500, message = "Erro interno no servidor"),
        @ApiResponse(code = 503, message = "Serviço indisponível") })
    public Response incluirUsingPOST5(@ApiParam(value = "JSON da Chegada ao Ponto Zero." ,required=true)@Valid DadosDaChegadaAoPontoZero body, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token deve ser preenchido com o conteúdo do header Set-Token, retornado no response headers da chamada ao serviço de autenticação." ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF (Cross-Site Request Forgery). Este token deve ser preenchido com o conteúdo do header X-CSRF-Token, retornado no response headers da chamada ao serviço de autenticação." ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * Controle de Conferência Física
     *
     * Um evento para cada agendamento ou conclusão de verificação ou inspeção física.&lt;br/&gt;Considerar todos os tipos de conferência solicitadas por qualquer anuente ou pelo proprietário da carga.&lt;br/&gt;&lt;br/&gt;Não transmitir para conferência de embalagem de madeira.&lt;br/&gt;&lt;br/&gt;Transmitir um evento para cada agendamento ou conclusão de conferência recebida.
     *
     */
    @POST
    @Path("/ext/conferencia-fisica")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Controle de Conferência Física", notes = "Um evento para cada agendamento ou conclusão de verificação ou inspeção física.<br/>Considerar todos os tipos de conferência solicitadas por qualquer anuente ou pelo proprietário da carga.<br/><br/>Não transmitir para conferência de embalagem de madeira.<br/><br/>Transmitir um evento para cada agendamento ou conclusão de conferência recebida.", tags={ "Serviços destinados à recepção de eventos aduaneiros." })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Recurso criado com sucesso", response = RespostaParaSucessoNaRecepoDeEventoAduaneiro.class),
        @ApiResponse(code = 400, message = "Requisição mal formatada"),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida", response = ExceptionCoverDocumentacao.class),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio", response = ExceptionCoverDocumentacao.class),
        @ApiResponse(code = 500, message = "Erro interno no servidor"),
        @ApiResponse(code = 503, message = "Serviço indisponível") })
    public Response incluirUsingPOST6(@ApiParam(value = "Conferência Física" ,required=true)@Valid DadosDaConfernciaFsica body, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token deve ser preenchido com o conteúdo do header Set-Token, retornado no response headers da chamada ao serviço de autenticação." ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF (Cross-Site Request Forgery). Este token deve ser preenchido com o conteúdo do header X-CSRF-Token, retornado no response headers da chamada ao serviço de autenticação." ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken);

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
        @ApiResponse(code = 400, message = "Requisição mal formatada"),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida", response = ExceptionCoverDocumentacao.class),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio", response = ExceptionCoverDocumentacao.class),
        @ApiResponse(code = 500, message = "Erro interno no servidor"),
        @ApiResponse(code = 503, message = "Serviço indisponível") })
    public Response incluirUsingPOST7(@ApiParam(value = "JSON do evento Acesso Pessoa" ,required=true)@Valid DadosAcessoPessoa body, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token deve ser preenchido com o conteúdo do header Set-Token, retornado no response headers da chamada ao serviço de autenticação." ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF (Cross-Site Request Forgery). Este token deve ser preenchido com o conteúdo do header X-CSRF-Token, retornado no response headers da chamada ao serviço de autenticação." ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * Controle de Agendamento/Acesso de Veículo
     *
     * Um evento para cada agendamento ou acesso (entrada ou saída) de veículo ao recinto. Transmitir imediatamente ao agendamento ou ao acesso (entrada ou saída).&lt;br/&gt;Um evento para cada agendamento/acesso PLACA/CHASSI/LOCOMOTIVA.&lt;br/&gt;&lt;br/&gt;Obs.: O manifesto e conhecimento de carga informado devem ser os internacionais sempre que existirem. Do contrário deve ser informado conhecimento interno. Exemplo: No ingresso de veículo com contêiner para exportação sem BL existente, tal evento deve constar a informação do CT-e.&lt;br/&gt;&lt;br/&gt;Este evento possui integração com Controle de Carga e Trânsito na Importação (CCT Importação) para a funcionalidade \&quot;chegada de veículo terrestre\&quot;  (Para mais informações,&lt;a href &#x3D;\&quot;https://www.gov.br/siscomex/pt-br/arquivos-e-imagens/manualcctimportao.pdf\&quot;&gt; clique aqui&lt;/a&gt;)
     *
     */
    @POST
    @Path("/ext/acesso-veiculos")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Controle de Agendamento/Acesso de Veículo", notes = "Um evento para cada agendamento ou acesso (entrada ou saída) de veículo ao recinto. Transmitir imediatamente ao agendamento ou ao acesso (entrada ou saída).<br/>Um evento para cada agendamento/acesso PLACA/CHASSI/LOCOMOTIVA.<br/><br/>Obs.: O manifesto e conhecimento de carga informado devem ser os internacionais sempre que existirem. Do contrário deve ser informado conhecimento interno. Exemplo: No ingresso de veículo com contêiner para exportação sem BL existente, tal evento deve constar a informação do CT-e.<br/><br/>Este evento possui integração com Controle de Carga e Trânsito na Importação (CCT Importação) para a funcionalidade \"chegada de veículo terrestre\"  (Para mais informações,<a href =\"https://www.gov.br/siscomex/pt-br/arquivos-e-imagens/manualcctimportao.pdf\"> clique aqui</a>)", tags={ "Serviços destinados à recepção de eventos aduaneiros." })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Recurso criado com sucesso", response = RespostaParaSucessoNaRecepoDeEventoAduaneiro.class),
        @ApiResponse(code = 400, message = "Requisição mal formatada"),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida", response = ExceptionCoverDocumentacao.class),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio", response = ExceptionCoverDocumentacao.class),
        @ApiResponse(code = 500, message = "Erro interno no servidor"),
        @ApiResponse(code = 503, message = "Serviço indisponível") })
    public Response incluirUsingPOST8(@ApiParam(value = "JSON do evento Acesso Veículo" ,required=true)@Valid DadosAcessoVeculo body, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token deve ser preenchido com o conteúdo do header Set-Token, retornado no response headers da chamada ao serviço de autenticação." ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF (Cross-Site Request Forgery). Este token deve ser preenchido com o conteúdo do header X-CSRF-Token, retornado no response headers da chamada ao serviço de autenticação." ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken);

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
        @ApiResponse(code = 400, message = "Requisição mal formatada"),
        @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida", response = ExceptionCoverDocumentacao.class),
        @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
        @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio", response = ExceptionCoverDocumentacao.class),
        @ApiResponse(code = 500, message = "Erro interno no servidor"),
        @ApiResponse(code = 503, message = "Serviço indisponível") })
    public Response incluirUsingPOST9(@ApiParam(value = "JSON do evento Controle de Embarque e Desembarque de Navios" ,required=true)@Valid DadosEmbarqueDesembarqueNavio body, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token deve ser preenchido com o conteúdo do header Set-Token, retornado no response headers da chamada ao serviço de autenticação." ,required=true)@HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF (Cross-Site Request Forgery). Este token deve ser preenchido com o conteúdo do header X-CSRF-Token, retornado no response headers da chamada ao serviço de autenticação." ,required=true)@HeaderParam("X-CSRF-Token") String xCSRFToken);
}

