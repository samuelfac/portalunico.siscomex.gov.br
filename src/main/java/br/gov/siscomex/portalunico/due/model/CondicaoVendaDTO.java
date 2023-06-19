package br.gov.siscomex.portalunico.due.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "CondicaoVendaDTO", propOrder =
    { "codigo", "descricao"
})

@XmlRootElement(name="CondicaoVendaDTO")
public class CondicaoVendaDTO  {
  
  @XmlElement(name="codigo")
  @ApiModelProperty(value = "Código<br />Tamanho mínimo: 0<br />Tamanho máximo: 3")
 /**
   * Código<br />Tamanho mínimo: 0<br />Tamanho máximo: 3
  **/
  private String codigo = null;

  @XmlElement(name="descricao")
  @ApiModelProperty(value = "Descrição<br />Tamanho mínimo: 0<br />Tamanho máximo: 100")
 /**
   * Descrição<br />Tamanho mínimo: 0<br />Tamanho máximo: 100
  **/
  private String descricao = null;
 /**
   * Código&lt;br /&gt;Tamanho mínimo: 0&lt;br /&gt;Tamanho máximo: 3
   * @return codigo
  **/
  @JsonProperty("codigo")
  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public CondicaoVendaDTO codigo(String codigo) {
    this.codigo = codigo;
    return this;
  }

 /**
   * Descrição&lt;br /&gt;Tamanho mínimo: 0&lt;br /&gt;Tamanho máximo: 100
   * @return descricao
  **/
  @JsonProperty("descricao")
  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public CondicaoVendaDTO descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CondicaoVendaDTO {\n");
    
    sb.append("    codigo: ").append(toIndentedString(codigo)).append("\n");
    sb.append("    descricao: ").append(toIndentedString(descricao)).append("\n");
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

