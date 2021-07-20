package br.gov.siscomex.portalunico.ccta.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "InfoManuseioConsultaDetalhada", propOrder =
    { "codigo", "detalhes"
})

@XmlRootElement(name="InfoManuseioConsultaDetalhada")
public class InfoManuseioConsultaDetalhada  {
  
  @XmlElement(name="codigo")
  @ApiModelProperty(example = "Exemplo de procedimento especial<br/> ", value = "Código relacionado a um procedimento especial a ser realizado referente a carga<br/> ")
 /**
   * Código relacionado a um procedimento especial a ser realizado referente a carga<br/> 
  **/
  private String codigo = null;

  @XmlElement(name="detalhes")
  @ApiModelProperty(example = "Exemplo de procedimento especial<br/> ", value = "Descrição do procedimento especial a ser realizado<br/> ")
 /**
   * Descrição do procedimento especial a ser realizado<br/> 
  **/
  private String detalhes = null;
 /**
   * Código relacionado a um procedimento especial a ser realizado referente a carga&lt;br/&gt; 
   * @return codigo
  **/
  @JsonProperty("codigo")
  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public InfoManuseioConsultaDetalhada codigo(String codigo) {
    this.codigo = codigo;
    return this;
  }

 /**
   * Descrição do procedimento especial a ser realizado&lt;br/&gt; 
   * @return detalhes
  **/
  @JsonProperty("detalhes")
  public String getDetalhes() {
    return detalhes;
  }

  public void setDetalhes(String detalhes) {
    this.detalhes = detalhes;
  }

  public InfoManuseioConsultaDetalhada detalhes(String detalhes) {
    this.detalhes = detalhes;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfoManuseioConsultaDetalhada {\n");
    
    sb.append("    codigo: ").append(toIndentedString(codigo)).append("\n");
    sb.append("    detalhes: ").append(toIndentedString(detalhes)).append("\n");
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

