package br.gov.siscomex.portalunico.cct_ext.model;

import br.gov.siscomex.portalunico.cct_ext.model.RotaPassagem;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
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

