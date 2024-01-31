package br.gov.siscomex.portalunico.due.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "TratamentoDoTributoDTO", propOrder =
    { "tipo", "tributo"
})

@XmlRootElement(name="TratamentoDoTributoDTO")
public class TratamentoDoTributoDTO  {
  
  @XmlElement(name="tipo")
  @ApiModelProperty(value = "")
  @Valid
  private TipoTributoDTO tipo = null;

  @XmlElement(name="tributo")
  @ApiModelProperty(value = "")
  @Valid
  private TributoDTO tributo = null;
 /**
   * Get tipo
   * @return tipo
  **/
  @JsonProperty("tipo")
  public TipoTributoDTO getTipo() {
    return tipo;
  }

  public void setTipo(TipoTributoDTO tipo) {
    this.tipo = tipo;
  }

  public TratamentoDoTributoDTO tipo(TipoTributoDTO tipo) {
    this.tipo = tipo;
    return this;
  }

 /**
   * Get tributo
   * @return tributo
  **/
  @JsonProperty("tributo")
  public TributoDTO getTributo() {
    return tributo;
  }

  public void setTributo(TributoDTO tributo) {
    this.tributo = tributo;
  }

  public TratamentoDoTributoDTO tributo(TributoDTO tributo) {
    this.tributo = tributo;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TratamentoDoTributoDTO {\n");
    
    sb.append("    tipo: ").append(toIndentedString(tipo)).append("\n");
    sb.append("    tributo: ").append(toIndentedString(tributo)).append("\n");
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
