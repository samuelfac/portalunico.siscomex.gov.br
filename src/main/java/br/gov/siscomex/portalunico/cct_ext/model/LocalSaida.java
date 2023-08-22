package br.gov.siscomex.portalunico.cct_ext.model;

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
 @XmlType(name = "LocalSaida", propOrder =
    { "codigoURF", "codigoRA"
})

@XmlRootElement(name="LocalSaida")
/**
  * Dados do Local de Saída
 **/
@ApiModel(description="Dados do Local de Saída")
public class LocalSaida  {
  
  @XmlElement(name="codigoURF", required = true)
  @ApiModelProperty(example = "0717700", required = true, value = "Código da Unidade de Região Fiscal<br>Tamanho: 7<br>Formato: NNNNNNN")
 /**
   * Código da Unidade de Região Fiscal<br>Tamanho: 7<br>Formato: NNNNNNN
  **/
  private String codigoURF = null;

  @XmlElement(name="codigoRA", required = true)
  @ApiModelProperty(example = "7911101", required = true, value = "Código do Recinto Aduaneiro<br>Tamanho: 7<br>Formato: NNNNNNN")
 /**
   * Código do Recinto Aduaneiro<br>Tamanho: 7<br>Formato: NNNNNNN
  **/
  private String codigoRA = null;
 /**
   * Código da Unidade de Região Fiscal&lt;br&gt;Tamanho: 7&lt;br&gt;Formato: NNNNNNN
   * @return codigoURF
  **/
  @JsonProperty("codigoURF")
  @NotNull
  public String getCodigoURF() {
    return codigoURF;
  }

  public void setCodigoURF(String codigoURF) {
    this.codigoURF = codigoURF;
  }

  public LocalSaida codigoURF(String codigoURF) {
    this.codigoURF = codigoURF;
    return this;
  }

 /**
   * Código do Recinto Aduaneiro&lt;br&gt;Tamanho: 7&lt;br&gt;Formato: NNNNNNN
   * @return codigoRA
  **/
  @JsonProperty("codigoRA")
  @NotNull
  public String getCodigoRA() {
    return codigoRA;
  }

  public void setCodigoRA(String codigoRA) {
    this.codigoRA = codigoRA;
  }

  public LocalSaida codigoRA(String codigoRA) {
    this.codigoRA = codigoRA;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocalSaida {\n");
    
    sb.append("    codigoURF: ").append(toIndentedString(codigoURF)).append("\n");
    sb.append("    codigoRA: ").append(toIndentedString(codigoRA)).append("\n");
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

