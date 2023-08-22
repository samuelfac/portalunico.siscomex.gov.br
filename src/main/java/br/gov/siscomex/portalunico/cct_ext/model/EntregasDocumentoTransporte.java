package br.gov.siscomex.portalunico.cct_ext.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "EntregasDocumentoTransporte", propOrder =
    { "entregaDocumentoTransporte"
})

@XmlRootElement(name="EntregasDocumentoTransporte")
/**
  * Entregas por Documentos de Transporte<br>Máximo de ocorrências: 1
 **/
@ApiModel(description="Entregas por Documentos de Transporte<br>Máximo de ocorrências: 1")
public class EntregasDocumentoTransporte  {
  
  @XmlElement(name="entregaDocumentoTransporte", required = true)
  @ApiModelProperty(required = true, value = "Entregas por Documentos de Transporte")
  @Valid
 /**
   * Entregas por Documentos de Transporte
  **/
  private List<EntregaDocumentoTransporte> entregaDocumentoTransporte = new ArrayList<>();
 /**
   * Entregas por Documentos de Transporte
   * @return entregaDocumentoTransporte
  **/
  @JsonProperty("entregaDocumentoTransporte")
  @NotNull
  public List<EntregaDocumentoTransporte> getEntregaDocumentoTransporte() {
    return entregaDocumentoTransporte;
  }

  public void setEntregaDocumentoTransporte(List<EntregaDocumentoTransporte> entregaDocumentoTransporte) {
    this.entregaDocumentoTransporte = entregaDocumentoTransporte;
  }

  public EntregasDocumentoTransporte entregaDocumentoTransporte(List<EntregaDocumentoTransporte> entregaDocumentoTransporte) {
    this.entregaDocumentoTransporte = entregaDocumentoTransporte;
    return this;
  }

  public EntregasDocumentoTransporte addEntregaDocumentoTransporteItem(EntregaDocumentoTransporte entregaDocumentoTransporteItem) {
    this.entregaDocumentoTransporte.add(entregaDocumentoTransporteItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntregasDocumentoTransporte {\n");
    
    sb.append("    entregaDocumentoTransporte: ").append(toIndentedString(entregaDocumentoTransporte)).append("\n");
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

