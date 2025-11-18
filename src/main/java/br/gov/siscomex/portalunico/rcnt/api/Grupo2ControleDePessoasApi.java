package br.gov.siscomex.portalunico.rcnt.api;

import br.gov.siscomex.portalunico.rcnt.model.DadosAcessoPessoa;
import br.gov.siscomex.portalunico.rcnt.model.DadosCredenciamentoPessoa;
import br.gov.siscomex.portalunico.rcnt.model.DadosRepresentante;
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
public interface Grupo2ControleDePessoasApi {

    /**
     * Credenciamento de Pessoas
     *
     * Um evento para cada pessoa credenciada para acesso ao recinto (entrada/saída).&lt;br/&gt;Considerar acesso às áreas alfandegadas apenas.&lt;br/&gt;Transmitir logo que encerrar o ato de credenciamento.&lt;br/&gt;Um evento para cada CPF credenciado.&lt;br/&gt;&lt;br/&gt;Obs.:  Quando do credenciamento inicial informar “credenciamentoAtivo:true”  e validade do credenciamento caso existir.&lt;br/&gt;Casos em que a validade do credenciamento seja informada, a RFB vai considerar credenciamento inativo quando do vencimento do prazo.&lt;br/&gt;Para os casos que não exista validade do credenciamento o evento deve ser retificado para “credenciamentoAtivo:false” quando for o caso.&lt;br/&gt;(por exemplo: no caso de funcionários não há validade de credenciamento logo no caso de demissão o evento de credenciamento deve ser retificado para status &#x3D; inativo).
     *
     */
    @POST
    @Path("/ext/credenciamento-pessoas")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    @ApiOperation(value = "Credenciamento de Pessoas", notes = "Um evento para cada pessoa credenciada para acesso ao recinto (entrada/saída).<br/>Considerar acesso às áreas alfandegadas apenas.<br/>Transmitir logo que encerrar o ato de credenciamento.<br/>Um evento para cada CPF credenciado.<br/><br/>Obs.:  Quando do credenciamento inicial informar “credenciamentoAtivo:true”  e validade do credenciamento caso existir.<br/>Casos em que a validade do credenciamento seja informada, a RFB vai considerar credenciamento inativo quando do vencimento do prazo.<br/>Para os casos que não exista validade do credenciamento o evento deve ser retificado para “credenciamentoAtivo:false” quando for o caso.<br/>(por exemplo: no caso de funcionários não há validade de credenciamento logo no caso de demissão o evento de credenciamento deve ser retificado para status = inativo).", tags = {"Grupo 2 - Controle de Pessoas"})
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Recurso criado com sucesso", response = RespostaParaSucessoNaRecepoDeEventoAduaneiro.class),
            @ApiResponse(code = 400, message = "Requisição mal formatada"),
            @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida", response = ExceptionCoverDocumentacao.class),
            @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
            @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio", response = ExceptionCoverDocumentacao.class),
            @ApiResponse(code = 500, message = "Erro interno no servidor"),
            @ApiResponse(code = 503, message = "Serviço indisponível")})
    RespostaParaSucessoNaRecepoDeEventoAduaneiro incluirUsingPOST10(@ApiParam(value = "JSON do evento Credenciamento Pessoas", required = true) @Valid DadosCredenciamentoPessoa body, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token deve ser preenchido com o conteúdo do header Set-Token, retornado no response headers da chamada ao serviço de autenticação.", required = true) @HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF (Cross-Site Request Forgery). Este token deve ser preenchido com o conteúdo do header X-CSRF-Token, retornado no response headers da chamada ao serviço de autenticação.", required = true) @HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * Representantes
     *
     * Lista de pessoas que acessam o sistema do recinto em nome de cada cliente ou que possuam representação via procuração. Diferente do cadastro de representação do Siscomex. Toda representação via sistema ou papel deve ser informada. Transmitir um evento para cada representação CPF/CNPJ.
     *
     */
    @POST
    @Path("/ext/representantes")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    @ApiOperation(value = "Representantes", notes = "Lista de pessoas que acessam o sistema do recinto em nome de cada cliente ou que possuam representação via procuração. Diferente do cadastro de representação do Siscomex. Toda representação via sistema ou papel deve ser informada. Transmitir um evento para cada representação CPF/CNPJ.", tags = {"Grupo 2 - Controle de Pessoas"})
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Recurso criado com sucesso", response = RespostaParaSucessoNaRecepoDeEventoAduaneiro.class),
            @ApiResponse(code = 400, message = "Requisição mal formatada"),
            @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida", response = ExceptionCoverDocumentacao.class),
            @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
            @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio", response = ExceptionCoverDocumentacao.class),
            @ApiResponse(code = 500, message = "Erro interno no servidor"),
            @ApiResponse(code = 503, message = "Serviço indisponível")})
    RespostaParaSucessoNaRecepoDeEventoAduaneiro incluirUsingPOST21(@ApiParam(value = "JSON do evento Representantes", required = true) @Valid DadosRepresentante body, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token deve ser preenchido com o conteúdo do header Set-Token, retornado no response headers da chamada ao serviço de autenticação.", required = true) @HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF (Cross-Site Request Forgery). Este token deve ser preenchido com o conteúdo do header X-CSRF-Token, retornado no response headers da chamada ao serviço de autenticação.", required = true) @HeaderParam("X-CSRF-Token") String xCSRFToken);

    /**
     * Controle de Acesso de Pessoas
     *
     * Um evento para cada acesso (entrada ou saída) de pessoa ao recinto. Transmitir imediatamente ao acesso (entrada ou saída).&lt;br/&gt;Um evento para cada acesso de CPF;
     *
     */
    @POST
    @Path("/ext/acesso-pessoas")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    @ApiOperation(value = "Controle de Acesso de Pessoas", notes = "Um evento para cada acesso (entrada ou saída) de pessoa ao recinto. Transmitir imediatamente ao acesso (entrada ou saída).<br/>Um evento para cada acesso de CPF;", tags = {"Grupo 2 - Controle de Pessoas"})
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Recurso criado com sucesso", response = RespostaParaSucessoNaRecepoDeEventoAduaneiro.class),
            @ApiResponse(code = 400, message = "Requisição mal formatada"),
            @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida", response = ExceptionCoverDocumentacao.class),
            @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso"),
            @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio", response = ExceptionCoverDocumentacao.class),
            @ApiResponse(code = 500, message = "Erro interno no servidor"),
            @ApiResponse(code = 503, message = "Serviço indisponível")})
    RespostaParaSucessoNaRecepoDeEventoAduaneiro incluirUsingPOST7(@ApiParam(value = "JSON do evento Acesso Pessoa", required = true) @Valid DadosAcessoPessoa body, @ApiParam(value = "JSON Web Token (JWT) contendo as informações do usuário. Este token deve ser preenchido com o conteúdo do header Set-Token, retornado no response headers da chamada ao serviço de autenticação.", required = true) @HeaderParam("Authorization") String authorization, @ApiParam(value = "Token de prevenção contra ataques CSRF (Cross-Site Request Forgery). Este token deve ser preenchido com o conteúdo do header X-CSRF-Token, retornado no response headers da chamada ao serviço de autenticação.", required = true) @HeaderParam("X-CSRF-Token") String xCSRFToken);
}

