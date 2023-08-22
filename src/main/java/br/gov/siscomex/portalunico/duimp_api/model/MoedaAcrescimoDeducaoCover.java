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
 @XmlType(name = "MoedaAcrescimoDeducaoCover", propOrder =
    { "codigo", "valor"
})

@XmlRootElement(name="MoedaAcrescimoDeducaoCover")
/**
  * Dados da moeda utilizada no Acréscimo ou Dedução.
 **/
@ApiModel(description="Dados da moeda utilizada no Acréscimo ou Dedução.")
public class MoedaAcrescimoDeducaoCover  {
  
  @XmlElement(name="codigo", required = true)
  @ApiModelProperty(example = "USD", required = true, value = "Código da Moeda negociada (ISO-4217).<br>Tamanho: 3<br>Formato: 'AAA'<br>Origem: Sistema de Tabelas Aduaneiras - https://api-docs.portalunico.siscomex.gov.br/")
 /**
   * Código da Moeda negociada (ISO-4217).<br>Tamanho: 3<br>Formato: 'AAA'<br>Origem: Sistema de Tabelas Aduaneiras - https://api-docs.portalunico.siscomex.gov.br/
  **/
  private String codigo = null;

  @XmlElement(name="valor", required = true)
  @ApiModelProperty(example = "100.12", required = true, value = "Valor, na moeda negociada, acrescentado no/deduzido do valor da condição de venda.<br>Tamanho: 13,2<br>Formato: Decimal, com até 2 casas decimais separadas por ponto.")
 /**
   * Valor, na moeda negociada, acrescentado no/deduzido do valor da condição de venda.<br>Tamanho: 13,2<br>Formato: Decimal, com até 2 casas decimais separadas por ponto.
  **/
  private Double valor = null;
 /**
   * Código da Moeda negociada (ISO-4217).&lt;br&gt;Tamanho: 3&lt;br&gt;Formato: &#39;AAA&#39;&lt;br&gt;Origem: Sistema de Tabelas Aduaneiras - https://api-docs.portalunico.siscomex.gov.br/
   * @return codigo
  **/
  @JsonProperty("codigo")
  @NotNull
  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public MoedaAcrescimoDeducaoCover codigo(String codigo) {
    this.codigo = codigo;
    return this;
  }

 /**
   * Valor, na moeda negociada, acrescentado no/deduzido do valor da condição de venda.&lt;br&gt;Tamanho: 13,2&lt;br&gt;Formato: Decimal, com até 2 casas decimais separadas por ponto.
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

  public MoedaAcrescimoDeducaoCover valor(Double valor) {
    this.valor = valor;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MoedaAcrescimoDeducaoCover {\n");
    
    sb.append("    codigo: ").append(toIndentedString(codigo)).append("\n");
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

