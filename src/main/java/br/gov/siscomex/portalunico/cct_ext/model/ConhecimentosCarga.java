package br.gov.siscomex.portalunico.cct_ext.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

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

