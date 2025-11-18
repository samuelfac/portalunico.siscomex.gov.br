package br.gov.siscomex.portalunico.rcnt.api;

import br.gov.siscomex.portalunico.rcnt.model.DadosArmazenamentoLote;
import br.gov.siscomex.portalunico.rcnt.model.DadosAvariaExtravioLote;
import br.gov.siscomex.portalunico.rcnt.model.DadosCarregamentoEntregaLotes;
import br.gov.siscomex.portalunico.rcnt.model.DadosDaChegadaAoPontoZero;
import br.gov.siscomex.portalunico.rcnt.model.DadosDaConfernciaFsica;
import br.gov.siscomex.portalunico.rcnt.model.DadosGeraoLote;
import br.gov.siscomex.portalunico.rcnt.model.DadosInformaoBloqueioDesbloqueioVeculoCarga;
import br.gov.siscomex.portalunico.rcnt.model.DadosInformaoPrviaTrnsitoSimplificadoContiner;
import br.gov.siscomex.portalunico.rcnt.model.DadosPosioContiner;
import br.gov.siscomex.portalunico.rcnt.model.ExceptionCoverDocumentacao;
import br.gov.siscomex.portalunico.rcnt.model.RespostaParaSucessoNaRecepoDeEventoAduaneiro;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * Recintos Aduaneiros
 *
 * <p><h3>Introdução</h3><p>Bem-vindo à <i>Application Programming Interface (API)</i> de interação entre os recintos e o Portal Único de Comércio Exterior no Sistema Integrado de Comércio Exterior (Portal Siscomex), aqui chamada de API-Recintos. Trata-se de um conjunto de rotinas e padrões de programação para acesso a um aplicativo de software baseado nos padrões Web, que permitirá a recepção de eventos dentro do Portal Siscomex.</p><p>Disponibilizamos os endpoints de 22 eventos.</p><p></p><p>Para a utilização dos serviços desta API, a autenticação via certificação digital, do tipo e-CNPJ, é obrigatória. Caso seja verificado erro na autenticação ao serviço, o sistema irá retornar o erro referente à autenticação conforme especificado na seção Status Codes da API.</p><p>O processo de autenticação deve ser executado conforme descrito em <a href=\"https://docs.portalunico.siscomex.gov.br/introducao-api-publica/#autenticacao\">Autenticação</a>.</p><p>Definições importantes, conforme a Portaria Coana n<sup>o</sup> 72, de 12 de abril de 2022:<p style=\"padding-left:30px\">I - Sistema Informatizado de Controle Aduaneiro (SICA): o conjunto de sistemas informatizados de controle que operem em locais ou recintos alfandegados ou autorizados a operar com mercadorias sob controle aduaneiro;<br/>II - interveniente: a administradora de local ou recinto alfandegado ou autorizado a operar com mercadorias sob controle aduaneiro, o depositário e o operador portuário habilitado ou autorizado a operar nestes locais ou recintos;<br/>III - informações: aquelas relativas às operações de entrada e saída de pessoas e veículos, movimentação de carga e armazenamento de mercadorias, inclusive imagens;<br/>IV - registro: a inserção e a retificação de informações no SICA;<br/>V - eventos: o conjunto de informações previstas no Anexo III desta Portaria que devem ser enviadas à API-Recintos simultaneamente ao seu registro no SICA; e<br/>VI - envio de eventos à API-Recintos: transmissão eletrônica de conjunto de informações, inclusive imagens, registradas no SICA à API-Recintos, por meio da integração entre estes.</p></p><p>O interveniente deverá registrar no SICA e enviar para a API-Recintos, para cada operação que realizar, todas as informações de cada evento, excetuadas as informações inaplicáveis ao caso em concreto.</p><p>O envio de eventos retificadores substitui completamente as informações prestadas no evento retificado.</p><p>Todos os eventos enviados à API-Recintos devem conter o CPF do preposto que realizou o registro das informações no SICA, ressalvados os casos de informações coletadas automaticamente.</p><p>A cada envio de eventos à API-Recintos será retornado um protocolo de recepção que deve ser armazenado no SICA. Esse recibo será a identificação única de um evento dentro da API-Recintos e deve ser utilizado para solicitar a retificação ou exclusão do referido evento. Esse protocolo também deve ser utilizado na identificação de artefatos georreferenciados.</p><p>O SICA deverá funcionar de forma ininterrupta e permitir o envio de eventos à API-Recintos de forma simultânea e integrada com o registro de informações relativas às operações executadas nos locais ou recintos alfandegados ou autorizados a operar com mercadorias sob controle aduaneiro.</p><p>Nota 1: O ambiente de validação/treinamento foi projetado para possibilitar testes de integração entre o SICA e a API-Recintos. Portanto, faça uso racional do ambiente de validação/treinamento pois tentativas massivas de envios de eventos poderão ter limitação temporária de acesso.</p><p>Abaixo, foram consolidadas informações técnicas para a integração dos sistemas dos intervenientes com o Portal:<p style=\"padding-left:30px\">1) No Portal, todos os serviços adotam o mesmo protocolo de acesso, baseado no padrão SSL/TLS e no uso de certificado digital. A API do Portal foi desenvolvida baseada na arquitetura REST. Ela trabalhará com o formato JSON. Além disso, toda a nossa API usará o formato UTF-8;<br/>2) Cada envio deve conter um único evento por vez, seguindo o model previsto para cada qual, sendo comum a todos os eventos os dados referentes ao Cabeçalho do Evento (model: Cabeçalho Envio Evento Aduaneiro);<br/>3) O processo de recepção, por parte da API-Recintos, é composta por etapa de validação, armazenamento e, por fim, retorna-se o protocolo de recepção. Dessa maneira, somente será atribuído e retornado o protocolo de recepção para os eventos processados com sucesso. Qualquer erro de validação ou no processamento ocasiona a interrupção da recepção, sendo retornado detalhamento do erro;<br/>4) Para Operações de Retificação e Exclusão é obrigatório informar valor para o atributo protocoloEventoRetificadoOuExcluido que deve apontar para o evento alvo da ação de Retificação ou Exclusão;<br/>5) Para Operações de Exclusão orientamos preencherem apenas o cabeçalho dos eventos.<br/>6) Listas: cada atributo de lista deverá conter um atributo idElemento que identifique unicamente cada item da lista. No caso de eventos retificadores, que referenciam um evento transmitido anteriormente, o recinto deve ser capaz de 'repetir' o mesmo 'idElemento' utilizado no evento retificado;<br/>7) Atributos duplicados: a API não critica atributos duplicados e, caso existam, o conteúdo da segunda ocorrência irá sobrepor o conteúdo da primeira;<br/>8) Domínios: os domínios são sensíveis a maiúsculas e minúsculas;<br/>9) Atributos de data/hora com fuso: deve-se enviar o fuso horário no qual tal data/hora foi gerada considerando, inclusive, o horário de verão.<br/>10) Os perfis de autenticação que devem ser utilizados pelas empresas são: a) Depositário (DEPOSIT) ou b) Operador Portuário (OPERPORT).<br/>11) O campo \"codigoRecinto\" deve ser informado obrigatoriamente em todos os eventos transmitidos na API Recintos.<br/>12) Os campos que representam informações de CPF e CNPJ em eventos deve ser informados somente com números, sem caracteres de formatação.<br/>13) Para todos os eventos, o tamanho máximo da mensagem em formato JSON deve ser 500KB.<br/>14) Na recepção de eventos de inclusão, será rejeitado o evento para o qual for verificado que já existe evento com o mesmo ID, CNPJ, código do recinto e tipo de evento, recebido nos últimos 60 minutos, considerando a data de transmissão.</p><p>O depositário, inclusive quando executar atividades de operador portuário em seu próprio recinto, pode enviar todos os eventos com a autenticação DEPOSIT. O pacote de dados a ser transmitido deve informar o seu código de recinto (codigoRecinto), ou seja, o código do recinto onde ocorreu o evento a ser transmitido.</p><p>Caso o interveniente atue exclusivamente como operador portuário, ou seja, não acumule ambas as atuações (depositário e operador portuário) no recinto de ocorrência do evento, então ele deve usar o perfil OPERPORT para autenticação. Enfatiza-se que o código de recinto (codigoRecinto), indicado no pacote de dados, deve refletir o recinto onde, de fato, ocorreu o evento a ser transmitido.</p><p>Ressaltamos que o servidor da API Recintos possui horário sincronizado com o protocolo NTP.BR. Orientamos que os recintos sincronizem os servidores envolvidos na geração e transmissão dos eventos com o mesmo protocolo.<h4>URLs de Acesso</h4><p>Para utilizar os servi&ccedil;os dispon&iacute;veis nessa API deve-se usar as seguintes de URLs:</p><style type=\"text/css\">.tg  {border-collapse:collapse;border-color:#bbb;border-spacing:0;width: 900px;}.tg td{background-color:#E0FFEB;border-color:#bbb;border-style:solid;border-width:1px;color:#594F4F;font-family:Arial, sans-serif;font-size:14px;overflow:hidden;padding:10px 5px;word-break:normal;}.tg th{background-color:#9DE0AD;border-color:#bbb;border-style:solid;border-width:1px;color:#493F3F;font-family:Arial, sans-serif;font-size:14px;fon t-weight:normal;overflow:hidden;padding:10px 5px;word-break:normal;}.tg .tg-cabecalho{text-align:left;vertical-align:top}.tg .tg-corpo{border-color:inherit;text-align:left;vertical-align:top}</style><table class=\"tg\" style=\"width: 900px;\"><thead><tr><th class=\"tg-cabecalho\"><span style=\"font-weight:bold\">Nome do Ambiente</span></th><th class=\"tg-cabecalho\"><span style=\"font-weight:bold\">URL de acesso</span></th><th class=\"tg-cabecalho\"><span style=\"font-weight:bold\">Público Alvo</span></th></tr></thead><tbody><tr><td class=\"tg-corpo\">Ambiente de Homologação</td><td class=\"tg-corpo\">https://hom.pucomex.serpro.gov.br/recintos-ext/api/ext/{serviço}</td><td class=\"tg-corpo\">Gestores e homologadores</td></tr><tr><td class=\"tg-corpo\">Ambiente de Validação de Empresas</td><td class=\"tg-corpo\">https://val.portalunico.siscomex.gov.br/recintos-ext/api/{serviço}</td><td class=\"tg-corpo\">Recintos Aduaneiros</td></tr><tr><td class=\"tg-corpo\">Ambiente de Produção</td><td class=\"tg-corpo\">https://portalunico.siscomex.gov.br/recintos-ext/api/{serviço}</td><td class=\"tg-corpo\">Recintos Aduaneiros</td></tr></tbody></table><p>&nbsp;</p><p>Logo, abaixo temos um exemplo de URL completa considerando o ambiente de Valida&ccedil;&atilde;o de Empresas, consumindo o servi&ccedil;o de Credenciamento de Pessoas:</p><p><em>https://val.portalunico.siscomex.gov.br/recintos-ext/api/ext/credenciamento-pessoas</em></p><br/><h2>Organização por Tópicos dos Eventos</h2><h3>Os endpoints relativos aos 22 eventos estão distribuídos em 6 grupos, conforme abaixo: </h3>
 *
 */
@Path("/")
@Api(value = "/", description = "")
public interface Grupo5ControleDeCargasEUnidadesDeCarga_Api {

    /**
     * Controle de Carga Solta - Posição de Lote
     *
     * Um evento para cada armazenamento/mudança de posição do lote dentro do armazém.&lt;br/&gt;Não considerar os movimentos do tipo “house keeping”, a exemplo do posicionamento para verificação ou inspeção física, casos em que a carga retorna, em pouco tempo, para a mesma posição.&lt;br/&gt;Não aplicar para granel.&lt;br/&gt;Transmitir imediatamente a finalização do armazenamento.&lt;br/&gt;Um evento para cada LOTE armazenado.
     *
     */
    @POST
    @Path("/ext/armazenamento-lote")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    @ApiOperation(value = "Controle de Carga Solta - Posição de Lote", notes = "Um evento para cada armazenamento/mudança de posição do lote dentro do armazém.<br/>Não considerar os movimentos do tipo “house keeping”, a exemplo do posicionamento para verificação ou inspeção física, casos em que a carga retorna, em pouco tempo, para a mesma posição.<br/>Não aplicar para granel.<br/>Transmitir imediatamente a finalização do armazenamento.<br/>Um evento para cada LOTE armazenado.", tags = {"Grupo 5 - Controle de Cargas e Unidades de Carga "})
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Recurso criado com sucesso", response = RespostaParaSucessoNaRecepoDeEventoAduaneiro.class),
            @ApiResponse(code = 400, message = "Requisição mal formatada"),
            @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida", response = ExceptionCoverDocumentacao.class),
            @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
            @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio", response = ExceptionCoverDocumentacao.class),
            @ApiResponse(code = 500, message = "Erro interno no servidor"),
            @ApiResponse(code = 503, message = "Serviço indisponível")})
    RespostaParaSucessoNaRecepoDeEventoAduaneiro incluirUsingPOST1(@ApiParam(value = "JSON do evento Armazenamento de Lote.", required = true) @Valid DadosArmazenamentoLote body, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token deve ser preenchido com o conteúdo do header Set-Token, retornado no response headers da chamada ao serviço de autenticação.", required = true) @HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF (Cross-Site Request Forgery). Este token deve ser preenchido com o conteúdo do header X-CSRF-Token, retornado no response headers da chamada ao serviço de autenticação.", required = true) @HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * Controle de Carga Solta - Geração de Lotes
     *
     * Um evento para cada conjunto de LOTEs gerados por conhecimento.Não considerar os movimentos do tipo “house keeping”, a exemplo de desunitização para verificação ou inspeção física, casos em que a carga deve ser reunitizada após o processo.&lt;br/&gt;Exemplos de geração de lote; desunitização &#x3D; n... lotes; baldeação imediata &#x3D; n... lotes; depositada em armazém &#x3D; n... lotes;&lt;br/&gt;Baldeação, a transferência de mercadoria descarregada de um veículo e posteriormente carregada em outro. Nesse caso ocorre a geração lote e posterior carregamento lote.&lt;br/&gt;Não aplicar para granel.&lt;br/&gt;Transmitir imediatamente a geração de um conjunto de LOTEs por conhecimento.&lt;br/&gt;Pode repetir o conhecimento na transmissão de um novo evento no caso de cargas com chegada parcial.&lt;br/&gt;&lt;br/&gt;Este evento possui integração com Controle de Carga e Trânsito na Importação – modal aéreo (CCT Importação) para funcionalidade de \&quot;recepção de carga\&quot; (Para mais informações,&lt;a href &#x3D;\&quot;https://www.gov.br/siscomex/pt-br/arquivos-e-imagens/manualcctimportao.pdf\&quot;&gt; clique aqui&lt;/a&gt;).&lt;br/&gt; 
     *
     */
    @POST
    @Path("/ext/geracao-lotes")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    @ApiOperation(value = "Controle de Carga Solta - Geração de Lotes", notes = "Um evento para cada conjunto de LOTEs gerados por conhecimento.Não considerar os movimentos do tipo “house keeping”, a exemplo de desunitização para verificação ou inspeção física, casos em que a carga deve ser reunitizada após o processo.<br/>Exemplos de geração de lote; desunitização = n... lotes; baldeação imediata = n... lotes; depositada em armazém = n... lotes;<br/>Baldeação, a transferência de mercadoria descarregada de um veículo e posteriormente carregada em outro. Nesse caso ocorre a geração lote e posterior carregamento lote.<br/>Não aplicar para granel.<br/>Transmitir imediatamente a geração de um conjunto de LOTEs por conhecimento.<br/>Pode repetir o conhecimento na transmissão de um novo evento no caso de cargas com chegada parcial.<br/><br/>Este evento possui integração com Controle de Carga e Trânsito na Importação – modal aéreo (CCT Importação) para funcionalidade de \"recepção de carga\" (Para mais informações,<a href =\"https://www.gov.br/siscomex/pt-br/arquivos-e-imagens/manualcctimportao.pdf\"> clique aqui</a>).<br/> ", tags = {"Grupo 5 - Controle de Cargas e Unidades de Carga "})
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Recurso criado com sucesso", response = RespostaParaSucessoNaRecepoDeEventoAduaneiro.class),
            @ApiResponse(code = 400, message = "Requisição mal formatada"),
            @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida", response = ExceptionCoverDocumentacao.class),
            @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
            @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio", response = ExceptionCoverDocumentacao.class),
            @ApiResponse(code = 500, message = "Erro interno no servidor"),
            @ApiResponse(code = 503, message = "Serviço indisponível")})
    RespostaParaSucessoNaRecepoDeEventoAduaneiro incluirUsingPOST13(@ApiParam(value = "JSON do evento Geração de Lotes", required = true) @Valid DadosGeraoLote body, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token deve ser preenchido com o conteúdo do header Set-Token, retornado no response headers da chamada ao serviço de autenticação.", required = true) @HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF (Cross-Site Request Forgery). Este token deve ser preenchido com o conteúdo do header X-CSRF-Token, retornado no response headers da chamada ao serviço de autenticação.", required = true) @HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * Informação de Bloqueio/Desbloqueio de Veículo Terrestre /Carga / Unidade de Carga
     *
     * Um evento para cada bloqueio/desbloqueio de carga solicitado/efetuado diretamente no sistema do recinto.&lt;br/&gt;Não enviar os bloqueios/desbloqueios automáticos implementados no sistema do recinto.&lt;br/&gt;Não se trata do bloqueio no sistema Carga e/ou CCT.&lt;br/&gt;Transmitir um evento para cada solicitação de bloqueio ou desbloqueio efetivada no sistema privado do recinto para conhecimento, contêiner, veículo ou lote.
     *
     */
    @POST
    @Path("/ext/bloqueio-desbloqueio-veiculo-carga")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    @ApiOperation(value = "Informação de Bloqueio/Desbloqueio de Veículo Terrestre /Carga / Unidade de Carga", notes = "Um evento para cada bloqueio/desbloqueio de carga solicitado/efetuado diretamente no sistema do recinto.<br/>Não enviar os bloqueios/desbloqueios automáticos implementados no sistema do recinto.<br/>Não se trata do bloqueio no sistema Carga e/ou CCT.<br/>Transmitir um evento para cada solicitação de bloqueio ou desbloqueio efetivada no sistema privado do recinto para conhecimento, contêiner, veículo ou lote.", tags = {"Grupo 5 - Controle de Cargas e Unidades de Carga "})
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Recurso criado com sucesso", response = RespostaParaSucessoNaRecepoDeEventoAduaneiro.class),
            @ApiResponse(code = 400, message = "Requisição mal formatada"),
            @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida", response = ExceptionCoverDocumentacao.class),
            @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
            @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio", response = ExceptionCoverDocumentacao.class),
            @ApiResponse(code = 500, message = "Erro interno no servidor"),
            @ApiResponse(code = 503, message = "Serviço indisponível")})
    RespostaParaSucessoNaRecepoDeEventoAduaneiro incluirUsingPOST14(@ApiParam(value = "JSON do evento Informação Bloqueio Desbloqueio Veículo Carga", required = true) @Valid DadosInformaoBloqueioDesbloqueioVeculoCarga body, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token deve ser preenchido com o conteúdo do header Set-Token, retornado no response headers da chamada ao serviço de autenticação.", required = true) @HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF (Cross-Site Request Forgery). Este token deve ser preenchido com o conteúdo do header X-CSRF-Token, retornado no response headers da chamada ao serviço de autenticação.", required = true) @HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * Informação Prévia Trânsito Simplificado Contêiner
     *
     * Um evento para cada lista de unidades que serão removidas. Verificar a normatização local sobre os prazos para que os recintos de destino informem o recinto onde a carga vai atracar sobre a remoção da mesma.&lt;br/&gt;Transmitir imediatamente a recepção da lista de cargas a remover.&lt;br/&gt;Um evento por LISTA CARGAS.
     *
     */
    @POST
    @Path("/ext/transito-simplificado-conteiner")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    @ApiOperation(value = "Informação Prévia Trânsito Simplificado Contêiner", notes = "Um evento para cada lista de unidades que serão removidas. Verificar a normatização local sobre os prazos para que os recintos de destino informem o recinto onde a carga vai atracar sobre a remoção da mesma.<br/>Transmitir imediatamente a recepção da lista de cargas a remover.<br/>Um evento por LISTA CARGAS.", tags = {"Grupo 5 - Controle de Cargas e Unidades de Carga "})
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Recurso criado com sucesso", response = RespostaParaSucessoNaRecepoDeEventoAduaneiro.class),
            @ApiResponse(code = 400, message = "Requisição mal formatada"),
            @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida", response = ExceptionCoverDocumentacao.class),
            @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
            @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio", response = ExceptionCoverDocumentacao.class),
            @ApiResponse(code = 500, message = "Erro interno no servidor"),
            @ApiResponse(code = 503, message = "Serviço indisponível")})
    RespostaParaSucessoNaRecepoDeEventoAduaneiro incluirUsingPOST15(@ApiParam(value = "JSON do evento Informação Prévia Trânsito Simplificado Contêiner", required = true) @Valid DadosInformaoPrviaTrnsitoSimplificadoContiner body, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token deve ser preenchido com o conteúdo do header Set-Token, retornado no response headers da chamada ao serviço de autenticação.", required = true) @HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF (Cross-Site Request Forgery). Este token deve ser preenchido com o conteúdo do header X-CSRF-Token, retornado no response headers da chamada ao serviço de autenticação.", required = true) @HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * Posição do Contêiner
     *
     * Um evento para cada mudança de posição da unidade de carga dentro do pátio.Não considerar os movimentos do tipo “house keeping”, quando a unidade retorna, em pouco tempo, para a mesma posição.&lt;br/&gt;Transmitir imediatamente a finalização do posicionamento.&lt;br/&gt;Um evento para cada CONTÊINER posicionado no pátio.&lt;br/&gt;
     *
     */
    @POST
    @Path("/ext/posicao-conteiner")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    @ApiOperation(value = "Posição do Contêiner", notes = "Um evento para cada mudança de posição da unidade de carga dentro do pátio.Não considerar os movimentos do tipo “house keeping”, quando a unidade retorna, em pouco tempo, para a mesma posição.<br/>Transmitir imediatamente a finalização do posicionamento.<br/>Um evento para cada CONTÊINER posicionado no pátio.<br/>", tags = {"Grupo 5 - Controle de Cargas e Unidades de Carga "})
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Recurso criado com sucesso", response = RespostaParaSucessoNaRecepoDeEventoAduaneiro.class),
            @ApiResponse(code = 400, message = "Requisição mal formatada"),
            @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida", response = ExceptionCoverDocumentacao.class),
            @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
            @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio", response = ExceptionCoverDocumentacao.class),
            @ApiResponse(code = 500, message = "Erro interno no servidor"),
            @ApiResponse(code = 503, message = "Serviço indisponível")})
    RespostaParaSucessoNaRecepoDeEventoAduaneiro incluirUsingPOST19(@ApiParam(value = "JSON do evento Posição do Contêiner.", required = true) @Valid DadosPosioContiner body, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token deve ser preenchido com o conteúdo do header Set-Token, retornado no response headers da chamada ao serviço de autenticação.", required = true) @HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF (Cross-Site Request Forgery). Este token deve ser preenchido com o conteúdo do header X-CSRF-Token, retornado no response headers da chamada ao serviço de autenticação.", required = true) @HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * Controle de Carga Solta - Avaria/Extravio de Lote
     *
     * Um evento para cada avaria ou extravio verificados em lote de carga.&lt;br/&gt;Transmitir imediatamente a verificação da avaria/extravio.&lt;br/&gt;Não aplicar para granel.&lt;br/&gt;Um evento para cada LOTE com avaria/extravio.
     *
     */
    @POST
    @Path("/ext/avaria-extravio-lote")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    @ApiOperation(value = "Controle de Carga Solta - Avaria/Extravio de Lote", notes = "Um evento para cada avaria ou extravio verificados em lote de carga.<br/>Transmitir imediatamente a verificação da avaria/extravio.<br/>Não aplicar para granel.<br/>Um evento para cada LOTE com avaria/extravio.", tags = {"Grupo 5 - Controle de Cargas e Unidades de Carga "})
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Recurso criado com sucesso", response = RespostaParaSucessoNaRecepoDeEventoAduaneiro.class),
            @ApiResponse(code = 400, message = "Requisição mal formatada"),
            @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida", response = ExceptionCoverDocumentacao.class),
            @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
            @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio", response = ExceptionCoverDocumentacao.class),
            @ApiResponse(code = 500, message = "Erro interno no servidor"),
            @ApiResponse(code = 503, message = "Serviço indisponível")})
    RespostaParaSucessoNaRecepoDeEventoAduaneiro incluirUsingPOST3(@ApiParam(value = "JSON do evento Avaria / Extravio de Lote.", required = true) @Valid DadosAvariaExtravioLote body, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token deve ser preenchido com o conteúdo do header Set-Token, retornado no response headers da chamada ao serviço de autenticação.", required = true) @HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF (Cross-Site Request Forgery). Este token deve ser preenchido com o conteúdo do header X-CSRF-Token, retornado no response headers da chamada ao serviço de autenticação.", required = true) @HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * Controle de Carga Solta - Carregamento/Entrega de Lotes
     *
     * Um evento para cada carregamento de lotes em unidade de carga – contêiner, caminhão, etc. Não considerar os movimentos do tipo &#39;house keeping&#39;, a exemplo do carregamento em caminhão para utilizar o scanner, casos em que a carga  retorna, em pouco tempo, para a mesma posição.&lt;br/&gt;O evento deve ser utilizado quando os lotes forem carregados em unidade de carga(caminhão, vagão, contêiner, ULD aeronave) ou entregue à companhia aérea.&lt;br/&gt;No caso de carga solta a ser carregada diretamente em navio, utilizar apenas o evento Embarque Navio informando o número do lote carregado.&lt;br/&gt;Transmitir imediatamente a finalização do carregamento ou da entrega física de um conjunto de lotes por conhecimento.&lt;br/&gt;Não aplicar para granel.&lt;br/&gt;Um evento para cada conjunto de LOTES carregados do mesmo conhecimento.&lt;br/&gt;Transmitir imediatamente ao carregamento de um conjunto de LOTEs por conhecimento.&lt;br/&gt;Pode repetir o conhecimento na transmissão de um novo evento no caso de cargas com saída parcial.
     *
     */
    @POST
    @Path("/ext/carregamento-lotes")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    @ApiOperation(value = "Controle de Carga Solta - Carregamento/Entrega de Lotes", notes = "Um evento para cada carregamento de lotes em unidade de carga – contêiner, caminhão, etc. Não considerar os movimentos do tipo 'house keeping', a exemplo do carregamento em caminhão para utilizar o scanner, casos em que a carga  retorna, em pouco tempo, para a mesma posição.<br/>O evento deve ser utilizado quando os lotes forem carregados em unidade de carga(caminhão, vagão, contêiner, ULD aeronave) ou entregue à companhia aérea.<br/>No caso de carga solta a ser carregada diretamente em navio, utilizar apenas o evento Embarque Navio informando o número do lote carregado.<br/>Transmitir imediatamente a finalização do carregamento ou da entrega física de um conjunto de lotes por conhecimento.<br/>Não aplicar para granel.<br/>Um evento para cada conjunto de LOTES carregados do mesmo conhecimento.<br/>Transmitir imediatamente ao carregamento de um conjunto de LOTEs por conhecimento.<br/>Pode repetir o conhecimento na transmissão de um novo evento no caso de cargas com saída parcial.", tags = {"Grupo 5 - Controle de Cargas e Unidades de Carga "})
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Recurso criado com sucesso", response = RespostaParaSucessoNaRecepoDeEventoAduaneiro.class),
            @ApiResponse(code = 400, message = "Requisição mal formatada"),
            @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida", response = ExceptionCoverDocumentacao.class),
            @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
            @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio", response = ExceptionCoverDocumentacao.class),
            @ApiResponse(code = 500, message = "Erro interno no servidor"),
            @ApiResponse(code = 503, message = "Serviço indisponível")})
    RespostaParaSucessoNaRecepoDeEventoAduaneiro incluirUsingPOST4(@ApiParam(value = "JSON do evento Carregamento Entrega Lotes", required = true) @Valid DadosCarregamentoEntregaLotes body, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token deve ser preenchido com o conteúdo do header Set-Token, retornado no response headers da chamada ao serviço de autenticação.", required = true) @HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF (Cross-Site Request Forgery). Este token deve ser preenchido com o conteúdo do header X-CSRF-Token, retornado no response headers da chamada ao serviço de autenticação.", required = true) @HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * Chegada ao Ponto Zero
     *
     * Neste evento o recinto deve informar as cargas que recebe da companhia aérea(transportadora) quando do ingresso em seu recinto.&lt;br/&gt;&lt;br/&gt;Transmitir quando existir ULD (Unit Load Device - Aéreo)
     *
     */
    @POST
    @Path("/ext/chegada-ponto-zero")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    @ApiOperation(value = "Chegada ao Ponto Zero", notes = "Neste evento o recinto deve informar as cargas que recebe da companhia aérea(transportadora) quando do ingresso em seu recinto.<br/><br/>Transmitir quando existir ULD (Unit Load Device - Aéreo)", tags = {"Grupo 5 - Controle de Cargas e Unidades de Carga "})
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Recurso criado com sucesso", response = RespostaParaSucessoNaRecepoDeEventoAduaneiro.class),
            @ApiResponse(code = 400, message = "Requisição mal formatada"),
            @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida", response = ExceptionCoverDocumentacao.class),
            @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
            @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio", response = ExceptionCoverDocumentacao.class),
            @ApiResponse(code = 500, message = "Erro interno no servidor"),
            @ApiResponse(code = 503, message = "Serviço indisponível")})
    RespostaParaSucessoNaRecepoDeEventoAduaneiro incluirUsingPOST5(@ApiParam(value = "JSON da Chegada ao Ponto Zero.", required = true) @Valid DadosDaChegadaAoPontoZero body, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token deve ser preenchido com o conteúdo do header Set-Token, retornado no response headers da chamada ao serviço de autenticação.", required = true) @HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF (Cross-Site Request Forgery). Este token deve ser preenchido com o conteúdo do header X-CSRF-Token, retornado no response headers da chamada ao serviço de autenticação.", required = true) @HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * Controle de Conferência Física
     *
     * Um evento para cada agendamento ou conclusão de verificação ou inspeção física.&lt;br/&gt;Considerar todos os tipos de conferência solicitadas por qualquer anuente ou pelo proprietário da carga.&lt;br/&gt;&lt;br/&gt;Não transmitir para conferência de embalagem de madeira.&lt;br/&gt;&lt;br/&gt;Transmitir um evento para cada agendamento ou conclusão de conferência recebida.
     *
     */
    @POST
    @Path("/ext/conferencia-fisica")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    @ApiOperation(value = "Controle de Conferência Física", notes = "Um evento para cada agendamento ou conclusão de verificação ou inspeção física.<br/>Considerar todos os tipos de conferência solicitadas por qualquer anuente ou pelo proprietário da carga.<br/><br/>Não transmitir para conferência de embalagem de madeira.<br/><br/>Transmitir um evento para cada agendamento ou conclusão de conferência recebida.", tags = {"Grupo 5 - Controle de Cargas e Unidades de Carga "})
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Recurso criado com sucesso", response = RespostaParaSucessoNaRecepoDeEventoAduaneiro.class),
            @ApiResponse(code = 400, message = "Requisição mal formatada"),
            @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida", response = ExceptionCoverDocumentacao.class),
            @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
            @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio", response = ExceptionCoverDocumentacao.class),
            @ApiResponse(code = 500, message = "Erro interno no servidor"),
            @ApiResponse(code = 503, message = "Serviço indisponível")})
    RespostaParaSucessoNaRecepoDeEventoAduaneiro incluirUsingPOST6(@ApiParam(value = "Conferência Física", required = true) @Valid DadosDaConfernciaFsica body, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token deve ser preenchido com o conteúdo do header Set-Token, retornado no response headers da chamada ao serviço de autenticação.", required = true) @HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF (Cross-Site Request Forgery). Este token deve ser preenchido com o conteúdo do header X-CSRF-Token, retornado no response headers da chamada ao serviço de autenticação.", required = true) @HeaderParam("X-CSRF-Token") String xCSRFToken);
}

