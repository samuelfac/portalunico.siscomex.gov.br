package br.gov.siscomex.portalunico.ttce.api;

import br.gov.siscomex.portalunico.ttce.model.ChamadaObterTratamentosTributariosImportacaoDTO;
import br.gov.siscomex.portalunico.ttce.model.ExceptionCover;
import br.gov.siscomex.portalunico.ttce.model.RespostaObterTratamentosTributariosImportacaoDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * Tratamento Tributário
 *
 * <p><h4>Introdução</h4><p>O <strong>Tratamento Tributário do Comércio Exterior (TT ou TTCE)</strong> é o sistema responsável pelo cálculo de tributos incidentes na Importação, Exportação e Transporte de mercadorias. Com base nas informações de NCM, país de origem e valor aduaneiro, o sistema retorna o cálculo dos tributos incidentes em uma operação do Comércio Exterior.</p><hr/><style type=\"text/css\"> div.info tr, div.info th, div.info td { border: 1px solid lightgray; padding: 5px !important } </style><br/><h4>URLs de Acesso</h4><p>Para utilizar os serviços disponíveis nessa API deve-se seguir o seguinte padrão de URL:</p><p><em>https://{ambiente}/<strong>ttce</strong>{serviço}</em></p><p>Onde, em <strong>{ambiente}</strong> deve-se informar a <strong>URL de Acesso</strong> do ambiente desejado, dentre os ambientes disponíveis na tabela abaixo, e em <strong>{serviço}</strong> utilizar a URI do serviço desejado.</p><table style=\"width: 100%\"><thead   ><tr><th  >Nome do Ambiente</th>    <th  >URL de Acesso</th>    <th  >Público Alvo</th></tr></thead><tbody><tr><td    >Ambiente de Homologação</td><td  >hom.pucomex.serpro.gov.br</td><td  >Intervenientes Públicos (conforme perfil de acesso)</td></tr><tr><td>Ambiente de Validação das Empresas</td><td  >val.portalunico.siscomex.gov.br</td><td  >Intervenientes Privados</td></tr><tr><td  >Ambiente de Produção</td><td  >portalunico.siscomex.gov.br</td><td  >Todos Intervenientes (públicos e privados)</td></tr></tbody></table><br/><p><strong>Exemplo:</strong> Para o serviço \"que retorna os dados para auxiliar o importador a preencher a seção de Tratamento Tributário da DUIMP\" a URI é <strong>\"/api/ext/tratamentos-tributarios/importacao/\"</strong>.</p><p>Logo, abaixo temos um exemplo de URL completa, considerando o ambiente de Produção, consumindo este serviço:</p><p><em><a target=\"_blank\" href=\"https://portalunico.siscomex.gov.br/ttce/api/ext/tratamentos-tributarios/importacao/\">https://portalunico.siscomex.gov.br/ttce/api/ext/tratamentos-tributarios/importacao/</a></em></p><hr/><br/><h4>Dados de apoio e Exemplos adicionais</h4><p>Para consultar dados de apoio e exemplos adicionais, <a href=\"/pages/exemplos/ttce/exemplo1/index.html\" target=\"_blank\">clique aqui</a>.</p><hr/>
 *
 */
@Path("/")
@Api(value = "/", description = "")
public interface ServicosParaOImportadorApi {

    /**
     * Serviço que retorna os dados para auxiliar o importador a preencher a lista de &#39;tributos&#39; no JSON do serviço para inclusão de itens na DUIMP. O retorno deste serviço contém os Fundamentos Legais de tipo de uso normal e teto que contenham atributos adicionais e todos os Fundamentos Legais de tipo de uso opcional (com ou sem atributos).
     * <p>
     * Serviço que retorna os dados para auxiliar o importador a preencher a lista de &#39;tributos&#39; no JSON do serviço para inclusão de itens na DUIMP. O retorno deste serviço contém os Fundamentos Legais de tipo de uso normal e teto que contenham atributos adicionais e todos os Fundamentos Legais de tipo de uso opcional (com ou sem atributos).
     *
     */
    @POST
    @Path("/api/ext/tratamentos-tributarios/importacao/")
    @Consumes({"application/json"})
    @Produces({"application/json", "*/*"})
    @ApiOperation(value = "Serviço que retorna os dados para auxiliar o importador a preencher a lista de 'tributos' no JSON do serviço para inclusão de itens na DUIMP. O retorno deste serviço contém os Fundamentos Legais de tipo de uso normal e teto que contenham atributos adicionais e todos os Fundamentos Legais de tipo de uso opcional (com ou sem atributos).", notes = "Serviço que retorna os dados para auxiliar o importador a preencher a lista de 'tributos' no JSON do serviço para inclusão de itens na DUIMP. O retorno deste serviço contém os Fundamentos Legais de tipo de uso normal e teto que contenham atributos adicionais e todos os Fundamentos Legais de tipo de uso opcional (com ou sem atributos).", tags = {"Servicos para o importador"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Operação realizada com sucesso", response = RespostaObterTratamentosTributariosImportacaoDTO.class),
            @ApiResponse(code = 400, message = "Requisição mal formatada", response = ExceptionCover.class),
            @ApiResponse(code = 422, message = "Erro(s) de validação da camada de negócio", response = ExceptionCover.class),
            @ApiResponse(code = 500, message = "Erro interno no servidor", response = ExceptionCover.class),
            @ApiResponse(code = 401, message = "Usuário não autenticado ou autenticação inválida", response = ExceptionCover.class),
            @ApiResponse(code = 204, message = "Operação realizada com sucesso. Nenhum conteúdo retornado"),
            @ApiResponse(code = 403, message = "Usuário não tem permissão de acesso ao recurso", response = ExceptionCover.class),
            @ApiResponse(code = 404, message = "Recurso não encontrado")})
    RespostaObterTratamentosTributariosImportacaoDTO gerarJson(@ApiParam(value = "", required = true) @Valid ChamadaObterTratamentosTributariosImportacaoDTO body);
}

