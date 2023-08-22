package br.gov.siscomex.portalunico.ttce.model;

import br.gov.siscomex.portalunico.ttce.model.AplicaPaisesBlocosDTO;
import br.gov.siscomex.portalunico.ttce.model.ExcetuaPaisesBlocosDTO;
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
 @XmlType(name = "PaisesBlocosDTO", propOrder =
    { "aplica", "excetua"
})

@XmlRootElement(name="PaisesBlocosDTO")
/**
  * Configuração de Países/Blocos.
 **/
@ApiModel(description="Configuração de Países/Blocos.")
public class PaisesBlocosDTO  {
  
  @XmlElement(name="aplica")
  @ApiModelProperty(value = "")
  @Valid
  private AplicaPaisesBlocosDTO aplica = null;

  @XmlElement(name="excetua")
  @ApiModelProperty(value = "")
  @Valid
  private ExcetuaPaisesBlocosDTO excetua = null;
 /**
   * Get aplica
   * @return aplica
  **/
  @JsonProperty("aplica")
  public AplicaPaisesBlocosDTO getAplica() {
    return aplica;
  }

  public void setAplica(AplicaPaisesBlocosDTO aplica) {
    this.aplica = aplica;
  }

  public PaisesBlocosDTO aplica(AplicaPaisesBlocosDTO aplica) {
    this.aplica = aplica;
    return this;
  }

 /**
   * Get excetua
   * @return excetua
  **/
  @JsonProperty("excetua")
  public ExcetuaPaisesBlocosDTO getExcetua() {
    return excetua;
  }

  public void setExcetua(ExcetuaPaisesBlocosDTO excetua) {
    this.excetua = excetua;
  }

  public PaisesBlocosDTO excetua(ExcetuaPaisesBlocosDTO excetua) {
    this.excetua = excetua;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaisesBlocosDTO {\n");
    
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

