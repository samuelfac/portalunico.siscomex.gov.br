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
 @XmlType(name = "Documentos", propOrder =
    { "documento"
})

@XmlRootElement(name="Documentos")
/**
  * Lista de documentos de carga
 **/
@ApiModel(description="Lista de documentos de carga")
public class Documentos  {
  
  @XmlElement(name="documento", required = true)
  @ApiModelProperty(required = true, value = "Lista de documentos de carga")
  @Valid
 /**
   * Lista de documentos de carga
  **/
  private List<Documento> documento = new ArrayList<>();
 /**
   * Lista de documentos de carga
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

