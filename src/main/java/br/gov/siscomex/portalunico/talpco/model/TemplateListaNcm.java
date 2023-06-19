package br.gov.siscomex.portalunico.talpco.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.xml.bind.annotation.*;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "TemplateListaNcm", propOrder =
    { "dominioNcm", "listaCamposNcm"
})

@XmlRootElement(name="TemplateListaNcm")
/**
  * Template para os itens NCM de um formulário de LPCO
 **/
@ApiModel(description="Template para os itens NCM de um formulário de LPCO")
public class TemplateListaNcm  {
  
  @XmlElement(name="dominioNcm")
  @ApiModelProperty(example = "[\"01012100\", \"01012900\"]", value = "Opções de NCM, sem pontuação, que podem ser preenchidas para cada item do LPCO")
 /**
   * Opções de NCM, sem pontuação, que podem ser preenchidas para cada item do LPCO
  **/
  private List<String> dominioNcm = null;

  @XmlElement(name="listaCamposNcm")
  @ApiModelProperty(value = "Lista de definições de campos a serem preenchidos para cada NCM informada no LPCO")
  @Valid
 /**
   * Lista de definições de campos a serem preenchidos para cada NCM informada no LPCO
  **/
  private List<CampoFormulario> listaCamposNcm = null;
 /**
   * Opções de NCM, sem pontuação, que podem ser preenchidas para cada item do LPCO
   * @return dominioNcm
  **/
  @JsonProperty("dominioNcm")
  public List<String> getDominioNcm() {
    return dominioNcm;
  }

  public void setDominioNcm(List<String> dominioNcm) {
    this.dominioNcm = dominioNcm;
  }

  public TemplateListaNcm dominioNcm(List<String> dominioNcm) {
    this.dominioNcm = dominioNcm;
    return this;
  }

  public TemplateListaNcm addDominioNcmItem(String dominioNcmItem) {
    this.dominioNcm.add(dominioNcmItem);
    return this;
  }

 /**
   * Lista de definições de campos a serem preenchidos para cada NCM informada no LPCO
   * @return listaCamposNcm
  **/
  @JsonProperty("listaCamposNcm")
  public List<CampoFormulario> getListaCamposNcm() {
    return listaCamposNcm;
  }

  public void setListaCamposNcm(List<CampoFormulario> listaCamposNcm) {
    this.listaCamposNcm = listaCamposNcm;
  }

  public TemplateListaNcm listaCamposNcm(List<CampoFormulario> listaCamposNcm) {
    this.listaCamposNcm = listaCamposNcm;
    return this;
  }

  public TemplateListaNcm addListaCamposNcmItem(CampoFormulario listaCamposNcmItem) {
    this.listaCamposNcm.add(listaCamposNcmItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateListaNcm {\n");
    
    sb.append("    dominioNcm: ").append(toIndentedString(dominioNcm)).append("\n");
    sb.append("    listaCamposNcm: ").append(toIndentedString(listaCamposNcm)).append("\n");
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

