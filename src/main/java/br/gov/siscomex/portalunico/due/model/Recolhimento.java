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
 @XmlType(name = "Recolhimento", propOrder =
    { "dataDoPagamento", "dataDoRegistro", "valorDaMulta", "valorDoImpostoRecolhido", "valorDoJurosMora"
})

@XmlRootElement(name="Recolhimento")
public class Recolhimento  {
  
  @XmlElement(name="dataDoPagamento")
  @ApiModelProperty(example = "2019-09-20T14:13:46.966Z", value = "Data do pagamento<br />Formato:'yyyy-MM-dd'T'HH:mm:ss.SSSZ'")
 /**
   * Data do pagamento<br />Formato:'yyyy-MM-dd'T'HH:mm:ss.SSSZ'
  **/
  private OffsetDateTime dataDoPagamento = null;

  @XmlElement(name="dataDoRegistro")
  @ApiModelProperty(example = "2019-09-20T14:13:46.966Z", value = "Data do Registro<br />Formato:'yyyy-MM-dd'T'HH:mm:ss.SSSZ'")
 /**
   * Data do Registro<br />Formato:'yyyy-MM-dd'T'HH:mm:ss.SSSZ'
  **/
  private OffsetDateTime dataDoRegistro = null;

  @XmlElement(name="valorDaMulta")
  @ApiModelProperty(value = "Valor da multa<br />Tamanho: 7,2<br />Formato: Decimal, com até 2 casas decimais separadas por ponto.")
  @Valid
 /**
   * Valor da multa<br />Tamanho: 7,2<br />Formato: Decimal, com até 2 casas decimais separadas por ponto.
  **/
  private BigDecimal valorDaMulta = null;

  @XmlElement(name="valorDoImpostoRecolhido")
  @ApiModelProperty(value = "Valor do imposto recolhido<br />Tamanho: 15,2<br />Formato: Decimal, com até 2 casas decimais separadas por ponto.")
  @Valid
 /**
   * Valor do imposto recolhido<br />Tamanho: 15,2<br />Formato: Decimal, com até 2 casas decimais separadas por ponto.
  **/
  private BigDecimal valorDoImpostoRecolhido = null;

  @XmlElement(name="valorDoJurosMora")
  @ApiModelProperty(value = "Valor do Juros de Mora<br />Tamanho: 7,2<br />Formato: Decimal, com até 2 casas decimais separadas por ponto.")
  @Valid
 /**
   * Valor do Juros de Mora<br />Tamanho: 7,2<br />Formato: Decimal, com até 2 casas decimais separadas por ponto.
  **/
  private BigDecimal valorDoJurosMora = null;
 /**
   * Data do pagamento&lt;br /&gt;Formato:&#39;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#39;
   * @return dataDoPagamento
  **/
  @JsonProperty("dataDoPagamento")
  public OffsetDateTime getDataDoPagamento() {
    return dataDoPagamento;
  }

  public void setDataDoPagamento(OffsetDateTime dataDoPagamento) {
    this.dataDoPagamento = dataDoPagamento;
  }

  public Recolhimento dataDoPagamento(OffsetDateTime dataDoPagamento) {
    this.dataDoPagamento = dataDoPagamento;
    return this;
  }

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

  public Recolhimento dataDoRegistro(OffsetDateTime dataDoRegistro) {
    this.dataDoRegistro = dataDoRegistro;
    return this;
  }

 /**
   * Valor da multa&lt;br /&gt;Tamanho: 7,2&lt;br /&gt;Formato: Decimal, com até 2 casas decimais separadas por ponto.
   * @return valorDaMulta
  **/
  @JsonProperty("valorDaMulta")
  public BigDecimal getValorDaMulta() {
    return valorDaMulta;
  }

  public void setValorDaMulta(BigDecimal valorDaMulta) {
    this.valorDaMulta = valorDaMulta;
  }

  public Recolhimento valorDaMulta(BigDecimal valorDaMulta) {
    this.valorDaMulta = valorDaMulta;
    return this;
  }

 /**
   * Valor do imposto recolhido&lt;br /&gt;Tamanho: 15,2&lt;br /&gt;Formato: Decimal, com até 2 casas decimais separadas por ponto.
   * @return valorDoImpostoRecolhido
  **/
  @JsonProperty("valorDoImpostoRecolhido")
  public BigDecimal getValorDoImpostoRecolhido() {
    return valorDoImpostoRecolhido;
  }

  public void setValorDoImpostoRecolhido(BigDecimal valorDoImpostoRecolhido) {
    this.valorDoImpostoRecolhido = valorDoImpostoRecolhido;
  }

  public Recolhimento valorDoImpostoRecolhido(BigDecimal valorDoImpostoRecolhido) {
    this.valorDoImpostoRecolhido = valorDoImpostoRecolhido;
    return this;
  }

 /**
   * Valor do Juros de Mora&lt;br /&gt;Tamanho: 7,2&lt;br /&gt;Formato: Decimal, com até 2 casas decimais separadas por ponto.
   * @return valorDoJurosMora
  **/
  @JsonProperty("valorDoJurosMora")
  public BigDecimal getValorDoJurosMora() {
    return valorDoJurosMora;
  }

  public void setValorDoJurosMora(BigDecimal valorDoJurosMora) {
    this.valorDoJurosMora = valorDoJurosMora;
  }

  public Recolhimento valorDoJurosMora(BigDecimal valorDoJurosMora) {
    this.valorDoJurosMora = valorDoJurosMora;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Recolhimento {\n");
    
    sb.append("    dataDoPagamento: ").append(toIndentedString(dataDoPagamento)).append("\n");
    sb.append("    dataDoRegistro: ").append(toIndentedString(dataDoRegistro)).append("\n");
    sb.append("    valorDaMulta: ").append(toIndentedString(valorDaMulta)).append("\n");
    sb.append("    valorDoImpostoRecolhido: ").append(toIndentedString(valorDoImpostoRecolhido)).append("\n");
    sb.append("    valorDoJurosMora: ").append(toIndentedString(valorDoJurosMora)).append("\n");
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

