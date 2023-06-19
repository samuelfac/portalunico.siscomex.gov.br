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
 @XmlType(name = "RecepcoesDocumentoCarga", propOrder =
    { "recepcaoDocumentoCarga"
})

@XmlRootElement(name="RecepcoesDocumentoCarga")
/**
  * Recepções por Documento de Carga<br>Máximo de ocorrências: 1
 **/
@ApiModel(description="Recepções por Documento de Carga<br>Máximo de ocorrências: 1")
public class RecepcoesDocumentoCarga  {
  
  @XmlElement(name="recepcaoDocumentoCarga", required = true)
  @ApiModelProperty(required = true, value = "Lista de recepções por Documento de Carga")
  @Valid
 /**
   * Lista de recepções por Documento de Carga
  **/
  private List<RecepcaoDocumentoCarga> recepcaoDocumentoCarga = new ArrayList<>();
 /**
   * Lista de recepções por Documento de Carga
   * @return recepcaoDocumentoCarga
  **/
  @JsonProperty("recepcaoDocumentoCarga")
  @NotNull
  public List<RecepcaoDocumentoCarga> getRecepcaoDocumentoCarga() {
    return recepcaoDocumentoCarga;
  }

  public void setRecepcaoDocumentoCarga(List<RecepcaoDocumentoCarga> recepcaoDocumentoCarga) {
    this.recepcaoDocumentoCarga = recepcaoDocumentoCarga;
  }

  public RecepcoesDocumentoCarga recepcaoDocumentoCarga(List<RecepcaoDocumentoCarga> recepcaoDocumentoCarga) {
    this.recepcaoDocumentoCarga = recepcaoDocumentoCarga;
    return this;
  }

  public RecepcoesDocumentoCarga addRecepcaoDocumentoCargaItem(RecepcaoDocumentoCarga recepcaoDocumentoCargaItem) {
    this.recepcaoDocumentoCarga.add(recepcaoDocumentoCargaItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecepcoesDocumentoCarga {\n");
    
    sb.append("    recepcaoDocumentoCarga: ").append(toIndentedString(recepcaoDocumentoCarga)).append("\n");
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

