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
 @XmlType(name = "TratamentoTributoDto", propOrder =
    { "tipo", "tributo"
})

@XmlRootElement(name="TratamentoTributoDto")
public class TratamentoTributoDto  {
  
  @XmlElement(name="tipo")
  @ApiModelProperty(value = "")
  @Valid
  private TipoTributoDto tipo = null;

  @XmlElement(name="tributo")
  @ApiModelProperty(value = "")
  @Valid
  private TributoDto tributo = null;
 /**
   * Get tipo
   * @return tipo
  **/
  @JsonProperty("tipo")
  public TipoTributoDto getTipo() {
    return tipo;
  }

    public void setTipo(TipoTributoDto tipo) {
    this.tipo = tipo;
  }

    public TratamentoTributoDto tipo(TipoTributoDto tipo) {
    this.tipo = tipo;
    return this;
  }

 /**
   * Get tributo
   * @return tributo
  **/
  @JsonProperty("tributo")
  public TributoDto getTributo() {
    return tributo;
  }

    public void setTributo(TributoDto tributo) {
    this.tributo = tributo;
  }

    public TratamentoTributoDto tributo(TributoDto tributo) {
    this.tributo = tributo;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TratamentoTributoDto {\n");
    
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

