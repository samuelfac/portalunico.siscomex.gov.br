package br.gov.siscomex.portalunico.ccta.model;

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
 @XmlType(name = "ClassificacaoMercadoriaConsultaDetalhada", propOrder =
    { "codigo"
})

@XmlRootElement(name="ClassificacaoMercadoriaConsultaDetalhada")
public class ClassificacaoMercadoriaConsultaDetalhada  {
  
  @XmlElement(name="codigo")
  @ApiModelProperty(example = "877887", value = "Código de classificação da mercadoria<br/>Tamanho: 18")
 /**
   * Código de classificação da mercadoria<br/>Tamanho: 18
  **/
  private String codigo = null;
 /**
   * Código de classificação da mercadoria&lt;br/&gt;Tamanho: 18
   * @return codigo
  **/
  @JsonProperty("codigo")
  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public ClassificacaoMercadoriaConsultaDetalhada codigo(String codigo) {
    this.codigo = codigo;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClassificacaoMercadoriaConsultaDetalhada {\n");
    
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

