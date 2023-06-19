package br.gov.siscomex.portalunico.cct_ext.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.xml.bind.annotation.*;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "RotasPassagem", propOrder =
    { "rotaPassagem"
})

@XmlRootElement(name="RotasPassagem")
/**
  * Rotas de Passagem
 **/
@ApiModel(description="Rotas de Passagem")
public class RotasPassagem  {
  
  @XmlElement(name="rotaPassagem")
  @ApiModelProperty(value = "Rotas de Passagem")
  @Valid
 /**
   * Rotas de Passagem
  **/
  private List<RotaPassagem> rotaPassagem = null;
 /**
   * Rotas de Passagem
   * @return rotaPassagem
  **/
  @JsonProperty("rotaPassagem")
  public List<RotaPassagem> getRotaPassagem() {
    return rotaPassagem;
  }

  public void setRotaPassagem(List<RotaPassagem> rotaPassagem) {
    this.rotaPassagem = rotaPassagem;
  }

  public RotasPassagem rotaPassagem(List<RotaPassagem> rotaPassagem) {
    this.rotaPassagem = rotaPassagem;
    return this;
  }

  public RotasPassagem addRotaPassagemItem(RotaPassagem rotaPassagemItem) {
    this.rotaPassagem.add(rotaPassagemItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RotasPassagem {\n");
    
    sb.append("    rotaPassagem: ").append(toIndentedString(rotaPassagem)).append("\n");
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

