package br.gov.siscomex.portalunico.ccta.model;

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
 @XmlType(name = "ChaveDsic", propOrder =
    { "identificacaoDSIC"
})

@XmlRootElement(name="ChaveDsic")
public class ChaveDsic  {
  
  @XmlElement(name="identificacaoDSIC")
  @ApiModelProperty(example = "D2000000035", value = "Número de identificação do DSIC<br/>Tamanho: 11<br/> Formato: ANNNNNNNNNN")
 /**
   * Número de identificação do DSIC<br/>Tamanho: 11<br/> Formato: ANNNNNNNNNN
  **/
  private String identificacaoDSIC = null;
 /**
   * Número de identificação do DSIC&lt;br/&gt;Tamanho: 11&lt;br/&gt; Formato: ANNNNNNNNNN
   * @return identificacaoDSIC
  **/
  @JsonProperty("identificacaoDSIC")
  public String getIdentificacaoDSIC() {
    return identificacaoDSIC;
  }

  public void setIdentificacaoDSIC(String identificacaoDSIC) {
    this.identificacaoDSIC = identificacaoDSIC;
  }

  public ChaveDsic identificacaoDSIC(String identificacaoDSIC) {
    this.identificacaoDSIC = identificacaoDSIC;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChaveDsic {\n");
    
    sb.append("    identificacaoDSIC: ").append(toIndentedString(identificacaoDSIC)).append("\n");
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

