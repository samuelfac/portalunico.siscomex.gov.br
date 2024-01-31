package br.gov.siscomex.portalunico.due.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "CalculoTributarioDTO", propOrder =
    { "quadroDeCalculos", "tratamentosTributarios"
})

@XmlRootElement(name="CalculoTributarioDTO")
public class CalculoTributarioDTO  {
  
  @XmlElement(name="quadroDeCalculos")
  @ApiModelProperty(value = "")
  @Valid
  private List<QuadroCalculoDto> quadroDeCalculos = null;

  @XmlElement(name="tratamentosTributarios")
  @ApiModelProperty(value = "")
  @Valid
  private List<TratamentoTributarioDTO> tratamentosTributarios = null;
 /**
   * Get quadroDeCalculos
   * @return quadroDeCalculos
  **/
  @JsonProperty("quadroDeCalculos")
  public List<QuadroCalculoDto> getQuadroDeCalculos() {
    return quadroDeCalculos;
  }

  public void setQuadroDeCalculos(List<QuadroCalculoDto> quadroDeCalculos) {
    this.quadroDeCalculos = quadroDeCalculos;
  }

  public CalculoTributarioDTO quadroDeCalculos(List<QuadroCalculoDto> quadroDeCalculos) {
    this.quadroDeCalculos = quadroDeCalculos;
    return this;
  }

  public CalculoTributarioDTO addQuadroDeCalculosItem(QuadroCalculoDto quadroDeCalculosItem) {
    this.quadroDeCalculos.add(quadroDeCalculosItem);
    return this;
  }

 /**
   * Get tratamentosTributarios
   * @return tratamentosTributarios
  **/
  @JsonProperty("tratamentosTributarios")
  public List<TratamentoTributarioDTO> getTratamentosTributarios() {
    return tratamentosTributarios;
  }

  public void setTratamentosTributarios(List<TratamentoTributarioDTO> tratamentosTributarios) {
    this.tratamentosTributarios = tratamentosTributarios;
  }

  public CalculoTributarioDTO tratamentosTributarios(List<TratamentoTributarioDTO> tratamentosTributarios) {
    this.tratamentosTributarios = tratamentosTributarios;
    return this;
  }

  public CalculoTributarioDTO addTratamentosTributariosItem(TratamentoTributarioDTO tratamentosTributariosItem) {
    this.tratamentosTributarios.add(tratamentosTributariosItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CalculoTributarioDTO {\n");
    
    sb.append("    quadroDeCalculos: ").append(toIndentedString(quadroDeCalculos)).append("\n");
    sb.append("    tratamentosTributarios: ").append(toIndentedString(tratamentosTributarios)).append("\n");
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

