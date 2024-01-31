package br.gov.siscomex.portalunico.tabx.model;

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
 @XmlType(name = "DadoTabelaApiRepresentation", propOrder =
    { "campos"
})

@XmlRootElement(name="DadoTabelaApiRepresentation")
public class DadoTabelaApiRepresentation  {
  
  @XmlElement(name="campos")
  @ApiModelProperty(value = "Campos da tabela.")
  @Valid
 /**
   * Campos da tabela.
  **/
  private List<CampoConsultaApiRepresentantion> campos = null;
 /**
   * Campos da tabela.
   * @return campos
  **/
  @JsonProperty("campos")
  public List<CampoConsultaApiRepresentantion> getCampos() {
    return campos;
  }

  public void setCampos(List<CampoConsultaApiRepresentantion> campos) {
    this.campos = campos;
  }

  public DadoTabelaApiRepresentation campos(List<CampoConsultaApiRepresentantion> campos) {
    this.campos = campos;
    return this;
  }

  public DadoTabelaApiRepresentation addCamposItem(CampoConsultaApiRepresentantion camposItem) {
    this.campos.add(camposItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DadoTabelaApiRepresentation {\n");
    
    sb.append("    campos: ").append(toIndentedString(campos)).append("\n");
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

