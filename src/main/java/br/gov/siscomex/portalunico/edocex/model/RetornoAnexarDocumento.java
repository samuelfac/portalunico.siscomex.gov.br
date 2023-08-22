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
 @XmlType(name = "RetornoAnexarDocumento", propOrder =
    { "idDocumento"
})

@XmlRootElement(name="RetornoAnexarDocumento")
/**
  * Retorno do serviço de anexar documento.
 **/
@ApiModel(description="Retorno do serviço de anexar documento.")
public class RetornoAnexarDocumento  {
  
  @XmlElement(name="idDocumento", required = true)
  @ApiModelProperty(example = "4456487453", required = true, value = "Id do documento.<br/>Valor mínimo: 1<br/>Valor máximo: 9223372036854775807")
 /**
   * Id do documento.<br/>Valor mínimo: 1<br/>Valor máximo: 9223372036854775807
  **/
  private Long idDocumento = null;
 /**
   * Id do documento.&lt;br/&gt;Valor mínimo: 1&lt;br/&gt;Valor máximo: 9223372036854775807
   * @return idDocumento
  **/
  @JsonProperty("idDocumento")
  @NotNull
  public Long getIdDocumento() {
    return idDocumento;
  }

  public void setIdDocumento(Long idDocumento) {
    this.idDocumento = idDocumento;
  }

  public RetornoAnexarDocumento idDocumento(Long idDocumento) {
    this.idDocumento = idDocumento;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetornoAnexarDocumento {\n");
    
    sb.append("    idDocumento: ").append(toIndentedString(idDocumento)).append("\n");
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

