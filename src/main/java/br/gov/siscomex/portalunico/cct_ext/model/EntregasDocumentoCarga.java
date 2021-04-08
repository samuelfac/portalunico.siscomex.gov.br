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
 @XmlType(name = "EntregasDocumentoCarga", propOrder =
    { "entregaDocumentoCarga"
})

@XmlRootElement(name="EntregasDocumentoCarga")
/**
  * Entregas por Documento de Carga<br>Máximo de ocorrências: 1
 **/
@ApiModel(description="Entregas por Documento de Carga<br>Máximo de ocorrências: 1")
public class EntregasDocumentoCarga  {
  
  @XmlElement(name="entregaDocumentoCarga", required = true)
  @ApiModelProperty(required = true, value = "Entrega por Documento de Carga")
  @Valid
 /**
   * Entrega por Documento de Carga
  **/
  private List<EntregaDocumentoCarga> entregaDocumentoCarga = new ArrayList<>();
 /**
   * Entrega por Documento de Carga
   * @return entregaDocumentoCarga
  **/
  @JsonProperty("entregaDocumentoCarga")
  @NotNull
  public List<EntregaDocumentoCarga> getEntregaDocumentoCarga() {
    return entregaDocumentoCarga;
  }

  public void setEntregaDocumentoCarga(List<EntregaDocumentoCarga> entregaDocumentoCarga) {
    this.entregaDocumentoCarga = entregaDocumentoCarga;
  }

  public EntregasDocumentoCarga entregaDocumentoCarga(List<EntregaDocumentoCarga> entregaDocumentoCarga) {
    this.entregaDocumentoCarga = entregaDocumentoCarga;
    return this;
  }

  public EntregasDocumentoCarga addEntregaDocumentoCargaItem(EntregaDocumentoCarga entregaDocumentoCargaItem) {
    this.entregaDocumentoCarga.add(entregaDocumentoCargaItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntregasDocumentoCarga {\n");
    
    sb.append("    entregaDocumentoCarga: ").append(toIndentedString(entregaDocumentoCarga)).append("\n");
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

