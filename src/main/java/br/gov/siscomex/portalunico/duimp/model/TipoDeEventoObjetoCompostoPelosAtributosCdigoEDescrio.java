package br.gov.siscomex.portalunico.duimp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "TipoDeEventoObjetoCompostoPelosAtributosCdigoEDescrio", propOrder =
    { "codigo", "descricao"
})

@XmlRootElement(name="TipoDeEventoObjetoCompostoPelosAtributosCdigoEDescrio")
public class TipoDeEventoObjetoCompostoPelosAtributosCdigoEDescrio  {
  
  @XmlElement(name="codigo")
  @ApiModelProperty(example = "13", value = "<br>Dominio: <br>  1 - Declaração registrada<br>  2 - Diagnosticar<br>  3 - Solicitar Retificação<br>  4 - Declaração Retificada<br> 11 - Carga Vinculada<br> 13 - Carga entregue<br> 14 - Entrega da carga cancelada<br> 15 - Carga Desvinculada<br> 16 - Mudança da unidade de destino final da carga<br> 31 - Pagamento dos tributos federais realizado<br> 32 - ICMS declarado<br> 33 - ICMS cancelado<br> 34 - Solicitação de Desbloqueio de Valores<br>401 - Distribuição para análise fiscal<br>402 - Redistribuição para análise fiscal<br>412 - Autorização de entrega com prosseguimento da conferência aduaneira<br>413 - Desembaraço autorizado<br>414 - Em análise fiscal<br>415 - Retificação deferida<br>416 - Desembaraço autorizado por decisão judicial<br>418 - Declaração desembaraçada sem conferência aduaneira<br>419 - Desembaraço efetuado<br>421 - Auto distribuição do RVF<br>423 - Análise de retificação não realizada por cancelamento da Duimp<br>424 - Análise de exigências e retificações em lote<br>425 - Interrupção da Duimp<br>426 - Liberação da interrupção<br>427 - Declaração desembaraçada sem conferência aduaneira e conferência do anuente<br>428 - Desembaraço efetuado por decisão judicial<br>429 - Solicitação de retificação deferida, sem análise, por decisão judicial<br>451 - Distribuição para conferência<br>452 - Redistribuição para conferência<br>453 - Em conferência<br>455 - Autorização de prosseguimento da conferência do anuente no estabelecimento indicado pelo importador<br>456 - Conclusão da conferência do anuente<br>457 - Conclusão da conferência do anuente por decisão judicial<br>460 - Conferência do anuente em exigência<br>461 - Liberação da conferência do anuente<br>462 - Conferência do anuente cancelada automaticamente<br> 52 - Selecionada para conferência aduaneira<br> 53 - Selecionada para conferência do anuente<br> 54 - Retorno da conferência do anuente por retificação da declaração<br> 55 - Canal Revelado<br> 56 - Definição de equipe de análise fiscal<br> 57 - Conclusão da conferência do anuente por perda de objeto<br> 58 - Equipe de análise fiscal não definida<br> 59 - Retorno da conferência do anuente para a situação aguardando distribuição<br> 60 - Definição de equipe de conferência<br> 61 - Documentos instrutivos do despacho recepcionados<br> 65 - Equipe de conferência não definida<br> 71 - Declaração cancelada<br> 72 - Conferência aduaneira cancelada automaticamente<br> 73 - Solicitação de cancelamento criada<br> 74 - Solicitação de cancelamento não efetivada<br> 75 - Desvinculação de carga não efetivada  -  Cancelamento de ofício não realizado<br> 77 - Movimentação de equipe de análise fiscal<br> 78 - Movimentação automática de equipe de conferência<br> 79 - Retorno da conferência aduaneira para a situação aguardando distribuição<br> 80 - Movimentação de equipe de conferência<br>Tamanho mínimo: 1<br>Tamanho máximo: 3")
 /**
   * <br>Dominio: <br>  1 - Declaração registrada<br>  2 - Diagnosticar<br>  3 - Solicitar Retificação<br>  4 - Declaração Retificada<br> 11 - Carga Vinculada<br> 13 - Carga entregue<br> 14 - Entrega da carga cancelada<br> 15 - Carga Desvinculada<br> 16 - Mudança da unidade de destino final da carga<br> 31 - Pagamento dos tributos federais realizado<br> 32 - ICMS declarado<br> 33 - ICMS cancelado<br> 34 - Solicitação de Desbloqueio de Valores<br>401 - Distribuição para análise fiscal<br>402 - Redistribuição para análise fiscal<br>412 - Autorização de entrega com prosseguimento da conferência aduaneira<br>413 - Desembaraço autorizado<br>414 - Em análise fiscal<br>415 - Retificação deferida<br>416 - Desembaraço autorizado por decisão judicial<br>418 - Declaração desembaraçada sem conferência aduaneira<br>419 - Desembaraço efetuado<br>421 - Auto distribuição do RVF<br>423 - Análise de retificação não realizada por cancelamento da Duimp<br>424 - Análise de exigências e retificações em lote<br>425 - Interrupção da Duimp<br>426 - Liberação da interrupção<br>427 - Declaração desembaraçada sem conferência aduaneira e conferência do anuente<br>428 - Desembaraço efetuado por decisão judicial<br>429 - Solicitação de retificação deferida, sem análise, por decisão judicial<br>451 - Distribuição para conferência<br>452 - Redistribuição para conferência<br>453 - Em conferência<br>455 - Autorização de prosseguimento da conferência do anuente no estabelecimento indicado pelo importador<br>456 - Conclusão da conferência do anuente<br>457 - Conclusão da conferência do anuente por decisão judicial<br>460 - Conferência do anuente em exigência<br>461 - Liberação da conferência do anuente<br>462 - Conferência do anuente cancelada automaticamente<br> 52 - Selecionada para conferência aduaneira<br> 53 - Selecionada para conferência do anuente<br> 54 - Retorno da conferência do anuente por retificação da declaração<br> 55 - Canal Revelado<br> 56 - Definição de equipe de análise fiscal<br> 57 - Conclusão da conferência do anuente por perda de objeto<br> 58 - Equipe de análise fiscal não definida<br> 59 - Retorno da conferência do anuente para a situação aguardando distribuição<br> 60 - Definição de equipe de conferência<br> 61 - Documentos instrutivos do despacho recepcionados<br> 65 - Equipe de conferência não definida<br> 71 - Declaração cancelada<br> 72 - Conferência aduaneira cancelada automaticamente<br> 73 - Solicitação de cancelamento criada<br> 74 - Solicitação de cancelamento não efetivada<br> 75 - Desvinculação de carga não efetivada  -  Cancelamento de ofício não realizado<br> 77 - Movimentação de equipe de análise fiscal<br> 78 - Movimentação automática de equipe de conferência<br> 79 - Retorno da conferência aduaneira para a situação aguardando distribuição<br> 80 - Movimentação de equipe de conferência<br>Tamanho mínimo: 1<br>Tamanho máximo: 3
  **/
  private String codigo = null;

  @XmlElement(name="descricao")
  @ApiModelProperty(example = "Carga Entregue", value = "Descrição correspondente ao valor informado no atributo 'codigo'. <br>Tamanho mínimo: 1<br>Tamanho máximo: 80")
 /**
   * Descrição correspondente ao valor informado no atributo 'codigo'. <br>Tamanho mínimo: 1<br>Tamanho máximo: 80
  **/
  private String descricao = null;
 /**
   * &lt;br&gt;Dominio: &lt;br&gt;  1 - Declaração registrada&lt;br&gt;  2 - Diagnosticar&lt;br&gt;  3 - Solicitar Retificação&lt;br&gt;  4 - Declaração Retificada&lt;br&gt; 11 - Carga Vinculada&lt;br&gt; 13 - Carga entregue&lt;br&gt; 14 - Entrega da carga cancelada&lt;br&gt; 15 - Carga Desvinculada&lt;br&gt; 16 - Mudança da unidade de destino final da carga&lt;br&gt; 31 - Pagamento dos tributos federais realizado&lt;br&gt; 32 - ICMS declarado&lt;br&gt; 33 - ICMS cancelado&lt;br&gt; 34 - Solicitação de Desbloqueio de Valores&lt;br&gt;401 - Distribuição para análise fiscal&lt;br&gt;402 - Redistribuição para análise fiscal&lt;br&gt;412 - Autorização de entrega com prosseguimento da conferência aduaneira&lt;br&gt;413 - Desembaraço autorizado&lt;br&gt;414 - Em análise fiscal&lt;br&gt;415 - Retificação deferida&lt;br&gt;416 - Desembaraço autorizado por decisão judicial&lt;br&gt;418 - Declaração desembaraçada sem conferência aduaneira&lt;br&gt;419 - Desembaraço efetuado&lt;br&gt;421 - Auto distribuição do RVF&lt;br&gt;423 - Análise de retificação não realizada por cancelamento da Duimp&lt;br&gt;424 - Análise de exigências e retificações em lote&lt;br&gt;425 - Interrupção da Duimp&lt;br&gt;426 - Liberação da interrupção&lt;br&gt;427 - Declaração desembaraçada sem conferência aduaneira e conferência do anuente&lt;br&gt;428 - Desembaraço efetuado por decisão judicial&lt;br&gt;429 - Solicitação de retificação deferida, sem análise, por decisão judicial&lt;br&gt;451 - Distribuição para conferência&lt;br&gt;452 - Redistribuição para conferência&lt;br&gt;453 - Em conferência&lt;br&gt;455 - Autorização de prosseguimento da conferência do anuente no estabelecimento indicado pelo importador&lt;br&gt;456 - Conclusão da conferência do anuente&lt;br&gt;457 - Conclusão da conferência do anuente por decisão judicial&lt;br&gt;460 - Conferência do anuente em exigência&lt;br&gt;461 - Liberação da conferência do anuente&lt;br&gt;462 - Conferência do anuente cancelada automaticamente&lt;br&gt; 52 - Selecionada para conferência aduaneira&lt;br&gt; 53 - Selecionada para conferência do anuente&lt;br&gt; 54 - Retorno da conferência do anuente por retificação da declaração&lt;br&gt; 55 - Canal Revelado&lt;br&gt; 56 - Definição de equipe de análise fiscal&lt;br&gt; 57 - Conclusão da conferência do anuente por perda de objeto&lt;br&gt; 58 - Equipe de análise fiscal não definida&lt;br&gt; 59 - Retorno da conferência do anuente para a situação aguardando distribuição&lt;br&gt; 60 - Definição de equipe de conferência&lt;br&gt; 61 - Documentos instrutivos do despacho recepcionados&lt;br&gt; 65 - Equipe de conferência não definida&lt;br&gt; 71 - Declaração cancelada&lt;br&gt; 72 - Conferência aduaneira cancelada automaticamente&lt;br&gt; 73 - Solicitação de cancelamento criada&lt;br&gt; 74 - Solicitação de cancelamento não efetivada&lt;br&gt; 75 - Desvinculação de carga não efetivada  -  Cancelamento de ofício não realizado&lt;br&gt; 77 - Movimentação de equipe de análise fiscal&lt;br&gt; 78 - Movimentação automática de equipe de conferência&lt;br&gt; 79 - Retorno da conferência aduaneira para a situação aguardando distribuição&lt;br&gt; 80 - Movimentação de equipe de conferência&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 3
   * @return codigo
  **/
  @JsonProperty("codigo")
  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public TipoDeEventoObjetoCompostoPelosAtributosCdigoEDescrio codigo(String codigo) {
    this.codigo = codigo;
    return this;
  }

 /**
   * Descrição correspondente ao valor informado no atributo &#39;codigo&#39;. &lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 80
   * @return descricao
  **/
  @JsonProperty("descricao")
  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public TipoDeEventoObjetoCompostoPelosAtributosCdigoEDescrio descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TipoDeEventoObjetoCompostoPelosAtributosCdigoEDescrio {\n");
    
    sb.append("    codigo: ").append(toIndentedString(codigo)).append("\n");
    sb.append("    descricao: ").append(toIndentedString(descricao)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

