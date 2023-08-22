package br.gov.siscomex.portalunico.duimp_api.model;

import io.swagger.v3.oas.annotations.media.Schema;
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
 @XmlType(name = "PaisExportadorCover", propOrder =
    { "codigo"
})

@XmlRootElement(name="PaisExportadorCover")
/**
  * País de procedência da mercadoria.
 **/
@ApiModel(description="País de procedência da mercadoria.")
public class PaisExportadorCover  {
  
  @XmlElement(name="codigo", required = true)
  @ApiModelProperty(example = "BR", required = true, value = "Código do país de origem no formato ISO (3166-1 alfa-2).<br>Tamanho: 2<br>Formato: 'AA'")
 /**
   * Código do país de origem no formato ISO (3166-1 alfa-2).<br>Tamanho: 2<br>Formato: 'AA'
  **/
  private String codigo = null;
 /**
   * Código do país de origem no formato ISO (3166-1 alfa-2).&lt;br&gt;Tamanho: 2&lt;br&gt;Formato: &#39;AA&#39;
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

  public PaisExportadorCover codigo(String codigo) {
    this.codigo = codigo;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaisExportadorCover {\n");
    
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

