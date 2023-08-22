package br.gov.siscomex.portalunico.due.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;
import java.time.OffsetDateTime;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "Contestacao", propOrder =
    { "dataDoRegistro", "numeroDoProcesso", "valorContestado"
})

@XmlRootElement(name="Contestacao")
public class Contestacao  {
  
  @XmlElement(name="dataDoRegistro")
  @ApiModelProperty(example = "2019-09-20T14:13:46.966Z", value = "Data do Registro<br />Formato:'yyyy-MM-dd'T'HH:mm:ss.SSSZ'")
 /**
   * Data do Registro<br />Formato:'yyyy-MM-dd'T'HH:mm:ss.SSSZ'
  **/
  private OffsetDateTime dataDoRegistro = null;

  @XmlElement(name="numeroDoProcesso")
  @ApiModelProperty(value = "Número do processo<br />Tamanho mínimo: 1<br />Tamanho máximo: 50")
 /**
   * Número do processo<br />Tamanho mínimo: 1<br />Tamanho máximo: 50
  **/
  private String numeroDoProcesso = null;

  @XmlElement(name="valorContestado")
  @ApiModelProperty(value = "Valor contestado<br />Tamanho: 15,2<br />Formato: Decimal, com até 2 casas decimais separadas por ponto.")
  @Valid
 /**
   * Valor contestado<br />Tamanho: 15,2<br />Formato: Decimal, com até 2 casas decimais separadas por ponto.
  **/
  private BigDecimal valorContestado = null;
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

  public Contestacao dataDoRegistro(OffsetDateTime dataDoRegistro) {
    this.dataDoRegistro = dataDoRegistro;
    return this;
  }

 /**
   * Número do processo&lt;br /&gt;Tamanho mínimo: 1&lt;br /&gt;Tamanho máximo: 50
   * @return numeroDoProcesso
  **/
  @JsonProperty("numeroDoProcesso")
  public String getNumeroDoProcesso() {
    return numeroDoProcesso;
  }

  public void setNumeroDoProcesso(String numeroDoProcesso) {
    this.numeroDoProcesso = numeroDoProcesso;
  }

  public Contestacao numeroDoProcesso(String numeroDoProcesso) {
    this.numeroDoProcesso = numeroDoProcesso;
    return this;
  }

 /**
   * Valor contestado&lt;br /&gt;Tamanho: 15,2&lt;br /&gt;Formato: Decimal, com até 2 casas decimais separadas por ponto.
   * @return valorContestado
  **/
  @JsonProperty("valorContestado")
  public BigDecimal getValorContestado() {
    return valorContestado;
  }

  public void setValorContestado(BigDecimal valorContestado) {
    this.valorContestado = valorContestado;
  }

  public Contestacao valorContestado(BigDecimal valorContestado) {
    this.valorContestado = valorContestado;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Contestacao {\n");
    
    sb.append("    dataDoRegistro: ").append(toIndentedString(dataDoRegistro)).append("\n");
    sb.append("    numeroDoProcesso: ").append(toIndentedString(numeroDoProcesso)).append("\n");
    sb.append("    valorContestado: ").append(toIndentedString(valorContestado)).append("\n");
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

