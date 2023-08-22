package br.gov.siscomex.portalunico.cct_ext.model;

import br.gov.siscomex.portalunico.cct_ext.model.RecepcaoNFF;
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
 @XmlType(name = "RecepcoesNFF", propOrder =
    { "recepcaoNFF"
})

@XmlRootElement(name="RecepcoesNFF")
/**
  * Recepções de Nota Fiscal Formulário<br>Máximo de ocorrências: 1
 **/
@ApiModel(description="Recepções de Nota Fiscal Formulário<br>Máximo de ocorrências: 1")
public class RecepcoesNFF  {
  
  @XmlElement(name="recepcaoNFF", required = true)
  @ApiModelProperty(required = true, value = "Recepções de Nota Fiscal Formulário")
  @Valid
 /**
   * Recepções de Nota Fiscal Formulário
  **/
  private List<RecepcaoNFF> recepcaoNFF = new ArrayList<>();
 /**
   * Recepções de Nota Fiscal Formulário
   * @return recepcaoNFF
  **/
  @JsonProperty("recepcaoNFF")
  @NotNull
  public List<RecepcaoNFF> getRecepcaoNFF() {
    return recepcaoNFF;
  }

  public void setRecepcaoNFF(List<RecepcaoNFF> recepcaoNFF) {
    this.recepcaoNFF = recepcaoNFF;
  }

  public RecepcoesNFF recepcaoNFF(List<RecepcaoNFF> recepcaoNFF) {
    this.recepcaoNFF = recepcaoNFF;
    return this;
  }

  public RecepcoesNFF addRecepcaoNFFItem(RecepcaoNFF recepcaoNFFItem) {
    this.recepcaoNFF.add(recepcaoNFFItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecepcoesNFF {\n");
    
    sb.append("    recepcaoNFF: ").append(toIndentedString(recepcaoNFF)).append("\n");
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

