package br.gov.siscomex.portalunico.cct_ext.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.xml.bind.annotation.*;
import java.math.BigDecimal;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "DocumentoTransportePK", propOrder =
    { "ano", "sequencia"
})

@XmlRootElement(name="DocumentoTransportePK")
public class DocumentoTransportePK  {
  
  @XmlElement(name="ano")
  @ApiModelProperty(value = "")
  @Valid
  private BigDecimal ano = null;

  @XmlElement(name="sequencia")
  @ApiModelProperty(value = "")
  @Valid
  private BigDecimal sequencia = null;
 /**
   * Get ano
   * @return ano
  **/
  @JsonProperty("ano")
  public BigDecimal getAno() {
    return ano;
  }

  public void setAno(BigDecimal ano) {
    this.ano = ano;
  }

  public DocumentoTransportePK ano(BigDecimal ano) {
    this.ano = ano;
    return this;
  }

 /**
   * Get sequencia
   * @return sequencia
  **/
  @JsonProperty("sequencia")
  public BigDecimal getSequencia() {
    return sequencia;
  }

  public void setSequencia(BigDecimal sequencia) {
    this.sequencia = sequencia;
  }

  public DocumentoTransportePK sequencia(BigDecimal sequencia) {
    this.sequencia = sequencia;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentoTransportePK {\n");
    
    sb.append("    ano: ").append(toIndentedString(ano)).append("\n");
    sb.append("    sequencia: ").append(toIndentedString(sequencia)).append("\n");
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

