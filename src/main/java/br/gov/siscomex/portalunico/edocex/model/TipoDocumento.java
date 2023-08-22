package br.gov.siscomex.portalunico.edocex.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "TipoDocumento", propOrder =
    { "idTipoDocumento", "nomeTipoDocumento"
})

@XmlRootElement(name="TipoDocumento")
/**
  * Tipo de documento.
 **/
@ApiModel(description="Tipo de documento.")
public class TipoDocumento  {
  
  @XmlElement(name="idTipoDocumento", required = true)
  @ApiModelProperty(example = "87453", required = true, value = "Id do tipo de documento.<br/>Valor mínimo: 1<br/>Valor máximo: 2147483647")
 /**
   * Id do tipo de documento.<br/>Valor mínimo: 1<br/>Valor máximo: 2147483647
  **/
  private Long idTipoDocumento = null;

  @XmlElement(name="nomeTipoDocumento", required = true)
  @ApiModelProperty(example = "Fatura Comercial", required = true, value = "Nome do tipo de documento.<br/>Tamanho máximo: 255")
 /**
   * Nome do tipo de documento.<br/>Tamanho máximo: 255
  **/
  private String nomeTipoDocumento = null;
 /**
   * Id do tipo de documento.&lt;br/&gt;Valor mínimo: 1&lt;br/&gt;Valor máximo: 2147483647
   * @return idTipoDocumento
  **/
  @JsonProperty("idTipoDocumento")
  @NotNull
  public Long getIdTipoDocumento() {
    return idTipoDocumento;
  }

  public void setIdTipoDocumento(Long idTipoDocumento) {
    this.idTipoDocumento = idTipoDocumento;
  }

  public TipoDocumento idTipoDocumento(Long idTipoDocumento) {
    this.idTipoDocumento = idTipoDocumento;
    return this;
  }

 /**
   * Nome do tipo de documento.&lt;br/&gt;Tamanho máximo: 255
   * @return nomeTipoDocumento
  **/
  @JsonProperty("nomeTipoDocumento")
  @NotNull
  public String getNomeTipoDocumento() {
    return nomeTipoDocumento;
  }

  public void setNomeTipoDocumento(String nomeTipoDocumento) {
    this.nomeTipoDocumento = nomeTipoDocumento;
  }

  public TipoDocumento nomeTipoDocumento(String nomeTipoDocumento) {
    this.nomeTipoDocumento = nomeTipoDocumento;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TipoDocumento {\n");
    
    sb.append("    idTipoDocumento: ").append(toIndentedString(idTipoDocumento)).append("\n");
    sb.append("    nomeTipoDocumento: ").append(toIndentedString(nomeTipoDocumento)).append("\n");
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

