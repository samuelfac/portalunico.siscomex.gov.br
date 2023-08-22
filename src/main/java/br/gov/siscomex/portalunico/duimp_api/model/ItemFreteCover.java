package br.gov.siscomex.portalunico.duimp_api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "ItemFreteCover", propOrder =
    { "valor"
})

@XmlRootElement(name="ItemFreteCover")
/**
  * Dados do Frete declarado.
 **/
@ApiModel(description="Dados do Frete declarado.")
public class ItemFreteCover  {
  
  @XmlElement(name="valor", required = true)
  @ApiModelProperty(example = "100.02", required = true, value = "Valor do frete em real de Duimp de situação especial de despacho, cujo motivo (da situação especial de despacho) possui o atributo 'Cálculo do frete e seguro' preenchido com o valor '2' (Declarado pelo importador), na tabela 'Tabela Motivo da Situação Especial da Duimp' do sistema TABX.<br>Tamanho: 17,2<br>Formato: Decimal, com até 2 casas decimais separadas por ponto.")
 /**
   * Valor do frete em real de Duimp de situação especial de despacho, cujo motivo (da situação especial de despacho) possui o atributo 'Cálculo do frete e seguro' preenchido com o valor '2' (Declarado pelo importador), na tabela 'Tabela Motivo da Situação Especial da Duimp' do sistema TABX.<br>Tamanho: 17,2<br>Formato: Decimal, com até 2 casas decimais separadas por ponto.
  **/
  private Double valor = null;
 /**
   * Valor do frete em real de Duimp de situação especial de despacho, cujo motivo (da situação especial de despacho) possui o atributo &#39;Cálculo do frete e seguro&#39; preenchido com o valor &#39;2&#39; (Declarado pelo importador), na tabela &#39;Tabela Motivo da Situação Especial da Duimp&#39; do sistema TABX.&lt;br&gt;Tamanho: 17,2&lt;br&gt;Formato: Decimal, com até 2 casas decimais separadas por ponto.
   * @return valor
  **/
  @JsonProperty("valor")
  @NotNull
  public Double getValor() {
    return valor;
  }

  public void setValor(Double valor) {
    this.valor = valor;
  }

  public ItemFreteCover valor(Double valor) {
    this.valor = valor;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemFreteCover {\n");
    
    sb.append("    valor: ").append(toIndentedString(valor)).append("\n");
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

