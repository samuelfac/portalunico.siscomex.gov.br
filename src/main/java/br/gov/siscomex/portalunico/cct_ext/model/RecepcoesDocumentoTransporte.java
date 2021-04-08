package br.gov.siscomex.portalunico.cct_ext.model;

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
 @XmlType(name = "RecepcoesDocumentoTransporte", propOrder =
    { "recepcaoDocumentoTransporte"
})

@XmlRootElement(name="RecepcoesDocumentoTransporte")
/**
  * Recepções dos Documentos de Transporte<br>Máximo de ocorrências: 1
 **/
@ApiModel(description="Recepções dos Documentos de Transporte<br>Máximo de ocorrências: 1")
public class RecepcoesDocumentoTransporte  {
  
  @XmlElement(name="recepcaoDocumentoTransporte", required = true)
  @ApiModelProperty(required = true, value = "Recepções dos Documentos de Transporte")
  @Valid
 /**
   * Recepções dos Documentos de Transporte
  **/
  private List<RecepcaoDocumentoTransporte> recepcaoDocumentoTransporte = new ArrayList<>();
 /**
   * Recepções dos Documentos de Transporte
   * @return recepcaoDocumentoTransporte
  **/
  @JsonProperty("recepcaoDocumentoTransporte")
  @NotNull
  public List<RecepcaoDocumentoTransporte> getRecepcaoDocumentoTransporte() {
    return recepcaoDocumentoTransporte;
  }

  public void setRecepcaoDocumentoTransporte(List<RecepcaoDocumentoTransporte> recepcaoDocumentoTransporte) {
    this.recepcaoDocumentoTransporte = recepcaoDocumentoTransporte;
  }

  public RecepcoesDocumentoTransporte recepcaoDocumentoTransporte(List<RecepcaoDocumentoTransporte> recepcaoDocumentoTransporte) {
    this.recepcaoDocumentoTransporte = recepcaoDocumentoTransporte;
    return this;
  }

  public RecepcoesDocumentoTransporte addRecepcaoDocumentoTransporteItem(RecepcaoDocumentoTransporte recepcaoDocumentoTransporteItem) {
    this.recepcaoDocumentoTransporte.add(recepcaoDocumentoTransporteItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecepcoesDocumentoTransporte {\n");
    
    sb.append("    recepcaoDocumentoTransporte: ").append(toIndentedString(recepcaoDocumentoTransporte)).append("\n");
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

