package br.gov.siscomex.portalunico.duimp_api.model;

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
 @XmlType(name = "TipoDocumentoInstrucaoCover", propOrder =
    { "codigo"
})

@XmlRootElement(name="TipoDocumentoInstrucaoCover")
/**
  * Tipo do documento instrutivo para despacho.
 **/
@ApiModel(description="Tipo do documento instrutivo para despacho.")
public class TipoDocumentoInstrucaoCover  {
  
  @XmlElement(name="codigo", required = true)
  @ApiModelProperty(example = "99", required = true, value = "Código do Tipo de Documento no sistema Anexação (E-Docex).<br>Domínio: Tipos de Documento existentes no sistema Anexação (E-Docex).<br>Valor mínimo: 1<br>Valor máximo: 999")
 /**
   * Código do Tipo de Documento no sistema Anexação (E-Docex).<br>Domínio: Tipos de Documento existentes no sistema Anexação (E-Docex).<br>Valor mínimo: 1<br>Valor máximo: 999
  **/
  private String codigo = null;
 /**
   * Código do Tipo de Documento no sistema Anexação (E-Docex).&lt;br&gt;Domínio: Tipos de Documento existentes no sistema Anexação (E-Docex).&lt;br&gt;Valor mínimo: 1&lt;br&gt;Valor máximo: 999
   * @return codigo
  **/
  @JsonProperty("codigo")
  @NotNull
  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public TipoDocumentoInstrucaoCover codigo(String codigo) {
    this.codigo = codigo;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TipoDocumentoInstrucaoCover {\n");
    
    sb.append("    codigo: ").append(toIndentedString(codigo)).append("\n");
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

