package br.gov.siscomex.portalunico.cct_ext.model;

import br.gov.siscomex.portalunico.cct_ext.model.Conhecimento;
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
 @XmlType(name = "ConhecimentosCarga", propOrder =
    { "conhecimento"
})

@XmlRootElement(name="ConhecimentosCarga")
/**
  * Lista dos conhecimento de carga
 **/
@ApiModel(description="Lista dos conhecimento de carga")
public class ConhecimentosCarga  {
  
  @XmlElement(name="conhecimento", required = true)
  @ApiModelProperty(required = true, value = "Lista dos conhecimento de carga")
  @Valid
 /**
   * Lista dos conhecimento de carga
  **/
  private List<Conhecimento> conhecimento = new ArrayList<>();
 /**
   * Lista dos conhecimento de carga
   * @return conhecimento
  **/
  @JsonProperty("conhecimento")
  @NotNull
  public List<Conhecimento> getConhecimento() {
    return conhecimento;
  }

  public void setConhecimento(List<Conhecimento> conhecimento) {
    this.conhecimento = conhecimento;
  }

  public ConhecimentosCarga conhecimento(List<Conhecimento> conhecimento) {
    this.conhecimento = conhecimento;
    return this;
  }

  public ConhecimentosCarga addConhecimentoItem(Conhecimento conhecimentoItem) {
    this.conhecimento.add(conhecimentoItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConhecimentosCarga {\n");
    
    sb.append("    conhecimento: ").append(toIndentedString(conhecimento)).append("\n");
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

