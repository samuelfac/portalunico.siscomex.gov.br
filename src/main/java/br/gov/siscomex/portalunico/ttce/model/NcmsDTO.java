package br.gov.siscomex.portalunico.ttce.model;

import br.gov.siscomex.portalunico.ttce.model.AplicaNcmDTO;
import br.gov.siscomex.portalunico.ttce.model.ExcetuaNcmDTO;
import io.swagger.v3.oas.annotations.media.Schema;
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
 @XmlType(name = "NcmsDTO", propOrder =
    { "aplica", "excetua"
})

@XmlRootElement(name="NcmsDTO")
/**
  * Configuração de NCMs.
 **/
@ApiModel(description="Configuração de NCMs.")
public class NcmsDTO  {
  
  @XmlElement(name="aplica", required = true)
  @ApiModelProperty(required = true, value = "")
  @Valid
  private AplicaNcmDTO aplica = null;

  @XmlElement(name="excetua", required = true)
  @ApiModelProperty(required = true, value = "")
  @Valid
  private ExcetuaNcmDTO excetua = null;
 /**
   * Get aplica
   * @return aplica
  **/
  @JsonProperty("aplica")
  @NotNull
  public AplicaNcmDTO getAplica() {
    return aplica;
  }

  public void setAplica(AplicaNcmDTO aplica) {
    this.aplica = aplica;
  }

  public NcmsDTO aplica(AplicaNcmDTO aplica) {
    this.aplica = aplica;
    return this;
  }

 /**
   * Get excetua
   * @return excetua
  **/
  @JsonProperty("excetua")
  @NotNull
  public ExcetuaNcmDTO getExcetua() {
    return excetua;
  }

  public void setExcetua(ExcetuaNcmDTO excetua) {
    this.excetua = excetua;
  }

  public NcmsDTO excetua(ExcetuaNcmDTO excetua) {
    this.excetua = excetua;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NcmsDTO {\n");
    
    sb.append("    aplica: ").append(toIndentedString(aplica)).append("\n");
    sb.append("    excetua: ").append(toIndentedString(excetua)).append("\n");
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

