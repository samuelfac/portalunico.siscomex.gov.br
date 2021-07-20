package br.gov.siscomex.portalunico.talpco.model;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "TemplateLpco", propOrder =
    { "modelo", "listaCamposFormulario", "listaCamposNcm"
})

@XmlRootElement(name="TemplateLpco")
/**
  * Template que especifica a estrutura de um formulário de um LPCO
 **/
@ApiModel(description="Template que especifica a estrutura de um formulário de um LPCO")
public class TemplateLpco  {
  
  @XmlElement(name="modelo", required = true)
  @ApiModelProperty(required = true, value = "")
  @Valid
  private ModeloLpcoCompleto modelo = null;

  @XmlElement(name="listaCamposFormulario", required = true)
  @ApiModelProperty(required = true, value = "Lista de definições de campos do formulário.")
  @Valid
 /**
   * Lista de definições de campos do formulário.
  **/
  private List<CampoFormulario> listaCamposFormulario = new ArrayList<>();

  @XmlElement(name="listaCamposNcm", required = true)
  @ApiModelProperty(required = true, value = "Lista de definições de campos a serem preenchidos para cada NCM informada no LPCO")
  @Valid
 /**
   * Lista de definições de campos a serem preenchidos para cada NCM informada no LPCO
  **/
  private List<CampoFormulario> listaCamposNcm = new ArrayList<>();
 /**
   * Get modelo
   * @return modelo
  **/
  @JsonProperty("modelo")
  @NotNull
  public ModeloLpcoCompleto getModelo() {
    return modelo;
  }

  public void setModelo(ModeloLpcoCompleto modelo) {
    this.modelo = modelo;
  }

  public TemplateLpco modelo(ModeloLpcoCompleto modelo) {
    this.modelo = modelo;
    return this;
  }

 /**
   * Lista de definições de campos do formulário.
   * @return listaCamposFormulario
  **/
  @JsonProperty("listaCamposFormulario")
  @NotNull
  public List<CampoFormulario> getListaCamposFormulario() {
    return listaCamposFormulario;
  }

  public void setListaCamposFormulario(List<CampoFormulario> listaCamposFormulario) {
    this.listaCamposFormulario = listaCamposFormulario;
  }

  public TemplateLpco listaCamposFormulario(List<CampoFormulario> listaCamposFormulario) {
    this.listaCamposFormulario = listaCamposFormulario;
    return this;
  }

  public TemplateLpco addListaCamposFormularioItem(CampoFormulario listaCamposFormularioItem) {
    this.listaCamposFormulario.add(listaCamposFormularioItem);
    return this;
  }

 /**
   * Lista de definições de campos a serem preenchidos para cada NCM informada no LPCO
   * @return listaCamposNcm
  **/
  @JsonProperty("listaCamposNcm")
  @NotNull
  public List<CampoFormulario> getListaCamposNcm() {
    return listaCamposNcm;
  }

  public void setListaCamposNcm(List<CampoFormulario> listaCamposNcm) {
    this.listaCamposNcm = listaCamposNcm;
  }

  public TemplateLpco listaCamposNcm(List<CampoFormulario> listaCamposNcm) {
    this.listaCamposNcm = listaCamposNcm;
    return this;
  }

  public TemplateLpco addListaCamposNcmItem(CampoFormulario listaCamposNcmItem) {
    this.listaCamposNcm.add(listaCamposNcmItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateLpco {\n");
    
    sb.append("    modelo: ").append(toIndentedString(modelo)).append("\n");
    sb.append("    listaCamposFormulario: ").append(toIndentedString(listaCamposFormulario)).append("\n");
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

