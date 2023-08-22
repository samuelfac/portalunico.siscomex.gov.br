package br.gov.siscomex.portalunico.cct_ext.model;

import br.gov.siscomex.portalunico.cct_ext.model.EntregaDocumentoTransporte;
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

