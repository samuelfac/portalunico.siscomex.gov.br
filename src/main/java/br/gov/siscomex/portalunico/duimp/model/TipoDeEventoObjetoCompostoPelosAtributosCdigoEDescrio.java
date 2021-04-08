package br.gov.siscomex.portalunico.duimp.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "TipoDeEventoObjetoCompostoPelosAtributosCdigoEDescrio", propOrder =
    { "codigo", "descricao"
})

@XmlRootElement(name="TipoDeEventoObjetoCompostoPelosAtributosCdigoEDescrio")
public class TipoDeEventoObjetoCompostoPelosAtributosCdigoEDescrio  {
  
  @XmlElement(name="codigo")
  @ApiModelProperty(example = "13", value = "<br>Dominio: <br>  1 - Declaração registrada<br>  2 - Diagnosticar<br>  3 - Solicitar Retificação<br>  4 - Declaração Retificada<br> 11 - Carga Vinculada<br> 12 - Registro de chegada da carga<br> 13 - Carga entregue<br> 14 - Entrega da carga cancelada<br> 15 - Carga Desvinculada<br> 31 - Pagamento dos tributos federais realizado<br> 32 - ICMS declarado<br> 33 - ICMS cancelado<br>400 - Definição da unidade de análise fiscal<br>401 - Distribuição para análise fiscal<br>402 - Redistribuição para análise fiscal<br>403 - Solicitação de RVF<br>407 - Conclusão de RVF<br>408 - Solicitação de Retificação indeferida. Exigência fiscal registrada<br>409 - Inclusão da exigência fiscal para interrupção da conferência<br>410 - Liberação da exigência fiscal<br>411 - Autorização de entrega sem prosseguimento do despacho<br>412 - Autorização de entrega com prosseguimento do despacho<br>413 - Desembaraço autorizado<br>414 - Em análise fiscal<br>415 - Retificação Deferida<br>417 - Cancelamento automático de exigência<br>418 - Declaração desembaraçada sem conferência<br>419 - Desembaraço efetuado<br>420 - Conclusão da conferência sem prosseguimento do despacho<br>421 - Auto distribuição do RVF<br>422 - Análise de retificação baixada por entrega sem prosseguimento do despacho<br>423 - Análise de retificação baixada por cancelamento da Duimp<br>424 - Análise de exigências e retificações em lote<br>425 - Interrupção da Duimp<br>426 - Liberação da interrupção<br> 51 - Liberada sem conferência aduaneira<br> 52 - Selecionada para conferência aduaneira<br> 61 - Documentos instrutivos do despacho recepcionados<br> 71 - Declaração cancelada<br> 72 - Conferência da Receita Federal cancelada automaticamente<br> 73 - Solicitação de cancelamento criada<br> 74 - Solicitação de cancelamento não efetivada<br> 75 - Desvinculação de carga não efetivada  -  Cancelamento de ofício não realizado<br> 76 - Solicitação de cancelamento confirmada<br>Tamanho mínimo: 1<br>Tamanho máximo: 3")
 /**
   * <br>Dominio: <br>  1 - Declaração registrada<br>  2 - Diagnosticar<br>  3 - Solicitar Retificação<br>  4 - Declaração Retificada<br> 11 - Carga Vinculada<br> 12 - Registro de chegada da carga<br> 13 - Carga entregue<br> 14 - Entrega da carga cancelada<br> 15 - Carga Desvinculada<br> 31 - Pagamento dos tributos federais realizado<br> 32 - ICMS declarado<br> 33 - ICMS cancelado<br>400 - Definição da unidade de análise fiscal<br>401 - Distribuição para análise fiscal<br>402 - Redistribuição para análise fiscal<br>403 - Solicitação de RVF<br>407 - Conclusão de RVF<br>408 - Solicitação de Retificação indeferida. Exigência fiscal registrada<br>409 - Inclusão da exigência fiscal para interrupção da conferência<br>410 - Liberação da exigência fiscal<br>411 - Autorização de entrega sem prosseguimento do despacho<br>412 - Autorização de entrega com prosseguimento do despacho<br>413 - Desembaraço autorizado<br>414 - Em análise fiscal<br>415 - Retificação Deferida<br>417 - Cancelamento automático de exigência<br>418 - Declaração desembaraçada sem conferência<br>419 - Desembaraço efetuado<br>420 - Conclusão da conferência sem prosseguimento do despacho<br>421 - Auto distribuição do RVF<br>422 - Análise de retificação baixada por entrega sem prosseguimento do despacho<br>423 - Análise de retificação baixada por cancelamento da Duimp<br>424 - Análise de exigências e retificações em lote<br>425 - Interrupção da Duimp<br>426 - Liberação da interrupção<br> 51 - Liberada sem conferência aduaneira<br> 52 - Selecionada para conferência aduaneira<br> 61 - Documentos instrutivos do despacho recepcionados<br> 71 - Declaração cancelada<br> 72 - Conferência da Receita Federal cancelada automaticamente<br> 73 - Solicitação de cancelamento criada<br> 74 - Solicitação de cancelamento não efetivada<br> 75 - Desvinculação de carga não efetivada  -  Cancelamento de ofício não realizado<br> 76 - Solicitação de cancelamento confirmada<br>Tamanho mínimo: 1<br>Tamanho máximo: 3
  **/
  private String codigo = null;

  @XmlElement(name="descricao")
  @ApiModelProperty(example = "Carga Entregue", value = "Descrição correspondente ao valor informado no atributo 'codigo'. <br>Tamanho mínimo: 1<br>Tamanho máximo: 80")
 /**
   * Descrição correspondente ao valor informado no atributo 'codigo'. <br>Tamanho mínimo: 1<br>Tamanho máximo: 80
  **/
  private String descricao = null;
 /**
   * &lt;br&gt;Dominio: &lt;br&gt;  1 - Declaração registrada&lt;br&gt;  2 - Diagnosticar&lt;br&gt;  3 - Solicitar Retificação&lt;br&gt;  4 - Declaração Retificada&lt;br&gt; 11 - Carga Vinculada&lt;br&gt; 12 - Registro de chegada da carga&lt;br&gt; 13 - Carga entregue&lt;br&gt; 14 - Entrega da carga cancelada&lt;br&gt; 15 - Carga Desvinculada&lt;br&gt; 31 - Pagamento dos tributos federais realizado&lt;br&gt; 32 - ICMS declarado&lt;br&gt; 33 - ICMS cancelado&lt;br&gt;400 - Definição da unidade de análise fiscal&lt;br&gt;401 - Distribuição para análise fiscal&lt;br&gt;402 - Redistribuição para análise fiscal&lt;br&gt;403 - Solicitação de RVF&lt;br&gt;407 - Conclusão de RVF&lt;br&gt;408 - Solicitação de Retificação indeferida. Exigência fiscal registrada&lt;br&gt;409 - Inclusão da exigência fiscal para interrupção da conferência&lt;br&gt;410 - Liberação da exigência fiscal&lt;br&gt;411 - Autorização de entrega sem prosseguimento do despacho&lt;br&gt;412 - Autorização de entrega com prosseguimento do despacho&lt;br&gt;413 - Desembaraço autorizado&lt;br&gt;414 - Em análise fiscal&lt;br&gt;415 - Retificação Deferida&lt;br&gt;417 - Cancelamento automático de exigência&lt;br&gt;418 - Declaração desembaraçada sem conferência&lt;br&gt;419 - Desembaraço efetuado&lt;br&gt;420 - Conclusão da conferência sem prosseguimento do despacho&lt;br&gt;421 - Auto distribuição do RVF&lt;br&gt;422 - Análise de retificação baixada por entrega sem prosseguimento do despacho&lt;br&gt;423 - Análise de retificação baixada por cancelamento da Duimp&lt;br&gt;424 - Análise de exigências e retificações em lote&lt;br&gt;425 - Interrupção da Duimp&lt;br&gt;426 - Liberação da interrupção&lt;br&gt; 51 - Liberada sem conferência aduaneira&lt;br&gt; 52 - Selecionada para conferência aduaneira&lt;br&gt; 61 - Documentos instrutivos do despacho recepcionados&lt;br&gt; 71 - Declaração cancelada&lt;br&gt; 72 - Conferência da Receita Federal cancelada automaticamente&lt;br&gt; 73 - Solicitação de cancelamento criada&lt;br&gt; 74 - Solicitação de cancelamento não efetivada&lt;br&gt; 75 - Desvinculação de carga não efetivada  -  Cancelamento de ofício não realizado&lt;br&gt; 76 - Solicitação de cancelamento confirmada&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 3
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

