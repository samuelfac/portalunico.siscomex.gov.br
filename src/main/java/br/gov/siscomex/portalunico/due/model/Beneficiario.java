package br.gov.siscomex.portalunico.due.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "Beneficiario", propOrder =
    { "cnpj"
})

@XmlRootElement(name="Beneficiario")
public class Beneficiario  {
  
  @XmlElement(name="cnpj")
  @ApiModelProperty(example = "81783734000196", value = "CNPJ<br />Tamanho: 14<br />Formato: 'NNNNNNNNNNNNNN'")
 /**
   * CNPJ<br />Tamanho: 14<br />Formato: 'NNNNNNNNNNNNNN'
  **/
  private String cnpj = null;
 /**
   * CNPJ&lt;br /&gt;Tamanho: 14&lt;br /&gt;Formato: &#39;NNNNNNNNNNNNNN&#39;
   * @return cnpj
  **/
  @JsonProperty("cnpj")
  public String getCnpj() {
    return cnpj;
  }

  public void setCnpj(String cnpj) {
    this.cnpj = cnpj;
  }

  public Beneficiario cnpj(String cnpj) {
    this.cnpj = cnpj;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Beneficiario {\n");
    
    sb.append("    cnpj: ").append(toIndentedString(cnpj)).append("\n");
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

