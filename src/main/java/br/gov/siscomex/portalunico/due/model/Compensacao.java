package br.gov.siscomex.portalunico.due.model;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "Compensacao", propOrder =
    { "dataDoRegistro", "numeroDaDeclaracao", "valorCompensado"
})

@XmlRootElement(name="Compensacao")
public class Compensacao  {
  
  @XmlElement(name="dataDoRegistro")
  @ApiModelProperty(example = "2019-09-20T14:13:46.966Z", value = "Data do Registro<br />Formato:'yyyy-MM-dd'T'HH:mm:ss.SSSZ'")
 /**
   * Data do Registro<br />Formato:'yyyy-MM-dd'T'HH:mm:ss.SSSZ'
  **/
  private OffsetDateTime dataDoRegistro = null;

  @XmlElement(name="numeroDaDeclaracao")
  @ApiModelProperty(value = "Número da declaração<br />Tamanho mínimo: 1<br />Tamanho máximo: 24")
 /**
   * Número da declaração<br />Tamanho mínimo: 1<br />Tamanho máximo: 24
  **/
  private String numeroDaDeclaracao = null;

  @XmlElement(name="valorCompensado")
  @ApiModelProperty(value = "Valor compensado<br />Tamanho: 15,2<br />Formato: Decimal, com até 2 casas decimais separadas por ponto.")
  @Valid
 /**
   * Valor compensado<br />Tamanho: 15,2<br />Formato: Decimal, com até 2 casas decimais separadas por ponto.
  **/
  private BigDecimal valorCompensado = null;
 /**
   * Data do Registro&lt;br /&gt;Formato:&#39;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#39;
   * @return dataDoRegistro
  **/
  @JsonProperty("dataDoRegistro")
  public OffsetDateTime getDataDoRegistro() {
    return dataDoRegistro;
  }

  public void setDataDoRegistro(OffsetDateTime dataDoRegistro) {
    this.dataDoRegistro = dataDoRegistro;
  }

  public Compensacao dataDoRegistro(OffsetDateTime dataDoRegistro) {
    this.dataDoRegistro = dataDoRegistro;
    return this;
  }

 /**
   * Número da declaração&lt;br /&gt;Tamanho mínimo: 1&lt;br /&gt;Tamanho máximo: 24
   * @return numeroDaDeclaracao
  **/
  @JsonProperty("numeroDaDeclaracao")
  public String getNumeroDaDeclaracao() {
    return numeroDaDeclaracao;
  }

  public void setNumeroDaDeclaracao(String numeroDaDeclaracao) {
    this.numeroDaDeclaracao = numeroDaDeclaracao;
  }

  public Compensacao numeroDaDeclaracao(String numeroDaDeclaracao) {
    this.numeroDaDeclaracao = numeroDaDeclaracao;
    return this;
  }

 /**
   * Valor compensado&lt;br /&gt;Tamanho: 15,2&lt;br /&gt;Formato: Decimal, com até 2 casas decimais separadas por ponto.
   * @return valorCompensado
  **/
  @JsonProperty("valorCompensado")
  public BigDecimal getValorCompensado() {
    return valorCompensado;
  }

  public void setValorCompensado(BigDecimal valorCompensado) {
    this.valorCompensado = valorCompensado;
  }

  public Compensacao valorCompensado(BigDecimal valorCompensado) {
    this.valorCompensado = valorCompensado;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Compensacao {\n");
    
    sb.append("    dataDoRegistro: ").append(toIndentedString(dataDoRegistro)).append("\n");
    sb.append("    numeroDaDeclaracao: ").append(toIndentedString(numeroDaDeclaracao)).append("\n");
    sb.append("    valorCompensado: ").append(toIndentedString(valorCompensado)).append("\n");
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

