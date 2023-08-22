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
 @XmlType(name = "Documentos", propOrder =
    { "documento"
})

@XmlRootElement(name="Documentos")
/**
  * Documentos de carga envolvidos na entrega (DU-E / RUC)
 **/
@ApiModel(description="Documentos de carga envolvidos na entrega (DU-E / RUC)")
public class Documentos  {
  
  @XmlElement(name="documento", required = true)
  @ApiModelProperty(required = true, value = "Documento de carga envolvidos na entrega (DU-E / RUC)")
  @Valid
 /**
   * Documento de carga envolvidos na entrega (DU-E / RUC)
  **/
  private List<Documento> documento = new ArrayList<>();
 /**
   * Documento de carga envolvidos na entrega (DU-E / RUC)
   * @return documento
  **/
  @JsonProperty("documento")
  @NotNull
  public List<Documento> getDocumento() {
    return documento;
  }

  public void setDocumento(List<Documento> documento) {
    this.documento = documento;
  }

  public Documentos documento(List<Documento> documento) {
    this.documento = documento;
    return this;
  }

  public Documentos addDocumentoItem(Documento documentoItem) {
    this.documento.add(documentoItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Documentos {\n");
    
    sb.append("    documento: ").append(toIndentedString(documento)).append("\n");
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

