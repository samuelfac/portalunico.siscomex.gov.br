package br.gov.siscomex.portalunico.duimp_api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "AtributoFundamentoLegalCover", propOrder =
    { "codigo", "valor"
})

@XmlRootElement(name="AtributoFundamentoLegalCover")
public class AtributoFundamentoLegalCover  {
  
  @XmlElement(name="codigo")
  @ApiModelProperty(value = "Código do atributo Fundamento Legal da Duimp para regimes especiais de despacho")
 /**
   * Código do atributo Fundamento Legal da Duimp para regimes especiais de despacho
  **/
  private String codigo = null;

  @XmlElement(name="valor")
  @ApiModelProperty(example = "10.53", value = "Valor do atributo Fundamento Legal da Duimp para regimes especiais de despacho")
 /**
   * Valor do atributo Fundamento Legal da Duimp para regimes especiais de despacho
  **/
  private String valor = null;
 /**
   * Código do atributo Fundamento Legal da Duimp para regimes especiais de despacho
   * @return codigo
  **/
  @JsonProperty("codigo")
  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public AtributoFundamentoLegalCover codigo(String codigo) {
    this.codigo = codigo;
    return this;
  }

 /**
   * Valor do atributo Fundamento Legal da Duimp para regimes especiais de despacho
   * @return valor
  **/
  @JsonProperty("valor")
  public String getValor() {
    return valor;
  }

  public void setValor(String valor) {
    this.valor = valor;
  }

  public AtributoFundamentoLegalCover valor(String valor) {
    this.valor = valor;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AtributoFundamentoLegalCover {\n");
    
    sb.append("    codigo: ").append(toIndentedString(codigo)).append("\n");
    sb.append("    valor: ").append(toIndentedString(valor)).append("\n");
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

