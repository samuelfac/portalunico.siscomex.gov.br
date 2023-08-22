package br.gov.siscomex.portalunico.cct_ext.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
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
 @XmlType(name = "DocumentoAnexo", propOrder =
    { "numero", "tipo"
})

@XmlRootElement(name="DocumentoAnexo")
/**
  * Documentos Anexo
 **/
@ApiModel(description="Documentos Anexo")
public class DocumentoAnexo  {
  
  @XmlElement(name="numero", required = true)
  @ApiModelProperty(example = "1223123123", required = true, value = "Número de Documento Anexo.<br>Tamanho: 39<br>Formato: AAA..AA")
 /**
   * Número de Documento Anexo.<br>Tamanho: 39<br>Formato: AAA..AA
  **/
  private String numero = null;

  @XmlElement(name="tipo", required = true)
  @ApiModelProperty(required = true, value = "Tipo de Documento Anexo.<br>Tamanho: 16<br>Formato: AAA..AA")
  @Valid
 /**
   * Tipo de Documento Anexo.<br>Tamanho: 16<br>Formato: AAA..AA
  **/
  private BigDecimal tipo = null;
 /**
   * Número de Documento Anexo.&lt;br&gt;Tamanho: 39&lt;br&gt;Formato: AAA..AA
   * @return numero
  **/
  @JsonProperty("numero")
  @NotNull
  public String getNumero() {
    return numero;
  }

  public void setNumero(String numero) {
    this.numero = numero;
  }

  public DocumentoAnexo numero(String numero) {
    this.numero = numero;
    return this;
  }

 /**
   * Tipo de Documento Anexo.&lt;br&gt;Tamanho: 16&lt;br&gt;Formato: AAA..AA
   * @return tipo
  **/
  @JsonProperty("tipo")
  @NotNull
  public BigDecimal getTipo() {
    return tipo;
  }

  public void setTipo(BigDecimal tipo) {
    this.tipo = tipo;
  }

  public DocumentoAnexo tipo(BigDecimal tipo) {
    this.tipo = tipo;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentoAnexo {\n");
    
    sb.append("    numero: ").append(toIndentedString(numero)).append("\n");
    sb.append("    tipo: ").append(toIndentedString(tipo)).append("\n");
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

