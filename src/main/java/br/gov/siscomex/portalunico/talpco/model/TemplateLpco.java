package br.gov.siscomex.portalunico.talpco.model;

import br.gov.siscomex.portalunico.talpco.model.CampoFormulario;
import br.gov.siscomex.portalunico.talpco.model.ModeloLpcoCompleto;
import br.gov.siscomex.portalunico.talpco.model.TemplateListaNcm;
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
 @XmlType(name = "TemplateLpco", propOrder =
    { "modelo", "listaCamposFormulario", "listaNcm"
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
  @ApiModelProperty(required = true, value = "Lista de campos do pedido que fazem parte dos \"Dados Gerais\" do LPCO, ou seja, aqueles que não são informados por item.")
  @Valid
 /**
   * Lista de campos do pedido que fazem parte dos \"Dados Gerais\" do LPCO, ou seja, aqueles que não são informados por item.
  **/
  private List<CampoFormulario> listaCamposFormulario = new ArrayList<>();

  @XmlElement(name="listaNcm")
  @ApiModelProperty(value = "")
  @Valid
  private TemplateListaNcm listaNcm = null;
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
   * Lista de campos do pedido que fazem parte dos \&quot;Dados Gerais\&quot; do LPCO, ou seja, aqueles que não são informados por item.
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
   * Get listaNcm
   * @return listaNcm
  **/
  @JsonProperty("listaNcm")
  public TemplateListaNcm getListaNcm() {
    return listaNcm;
  }

  public void setListaNcm(TemplateListaNcm listaNcm) {
    this.listaNcm = listaNcm;
  }

  public TemplateLpco listaNcm(TemplateListaNcm listaNcm) {
    this.listaNcm = listaNcm;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateLpco {\n");
    
    sb.append("    modelo: ").append(toIndentedString(modelo)).append("\n");
    sb.append("    listaCamposFormulario: ").append(toIndentedString(listaCamposFormulario)).append("\n");
    sb.append("    listaNcm: ").append(toIndentedString(listaNcm)).append("\n");
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

