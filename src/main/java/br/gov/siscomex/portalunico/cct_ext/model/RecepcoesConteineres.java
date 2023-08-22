package br.gov.siscomex.portalunico.cct_ext.model;

import br.gov.siscomex.portalunico.cct_ext.model.RecepcaoConteiner;
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
 @XmlType(name = "RecepcoesConteineres", propOrder =
    { "recepcaoConteiner"
})

@XmlRootElement(name="RecepcoesConteineres")
/**
  * Recepções por Contêineres<br>Máximo de ocorrências: 1
 **/
@ApiModel(description="Recepções por Contêineres<br>Máximo de ocorrências: 1")
public class RecepcoesConteineres  {
  
  @XmlElement(name="recepcaoConteiner", required = true)
  @ApiModelProperty(required = true, value = "")
  @Valid
  private RecepcaoConteiner recepcaoConteiner = null;
 /**
   * Get recepcaoConteiner
   * @return recepcaoConteiner
  **/
  @JsonProperty("recepcaoConteiner")
  @NotNull
  public RecepcaoConteiner getRecepcaoConteiner() {
    return recepcaoConteiner;
  }

  public void setRecepcaoConteiner(RecepcaoConteiner recepcaoConteiner) {
    this.recepcaoConteiner = recepcaoConteiner;
  }

  public RecepcoesConteineres recepcaoConteiner(RecepcaoConteiner recepcaoConteiner) {
    this.recepcaoConteiner = recepcaoConteiner;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecepcoesConteineres {\n");
    
    sb.append("    recepcaoConteiner: ").append(toIndentedString(recepcaoConteiner)).append("\n");
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

