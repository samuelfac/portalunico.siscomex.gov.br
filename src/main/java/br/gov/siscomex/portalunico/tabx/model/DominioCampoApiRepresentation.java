package br.gov.siscomex.portalunico.tabx.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "DominioCampoApiRepresentation", propOrder =
    { "codigo", "descricao"
})

@XmlRootElement(name="DominioCampoApiRepresentation")
public class DominioCampoApiRepresentation  {
  
  @XmlElement(name="codigo", required = true)
  @ApiModelProperty(example = "S", required = true, value = "Código do domínio do campo.<br>Tamanho mínimo: 1<br>Tamanho máximo: 3")
 /**
   * Código do domínio do campo.<br>Tamanho mínimo: 1<br>Tamanho máximo: 3
  **/
  private String codigo = null;

  @XmlElement(name="descricao", required = true)
  @ApiModelProperty(example = "Sim", required = true, value = "Descrição do domínio do campo.<br>Tamanho mínimo: 1<br>Tamanho máximo: 100")
 /**
   * Descrição do domínio do campo.<br>Tamanho mínimo: 1<br>Tamanho máximo: 100
  **/
  private String descricao = null;
 /**
   * Código do domínio do campo.&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 3
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

  public DominioCampoApiRepresentation codigo(String codigo) {
    this.codigo = codigo;
    return this;
  }

 /**
   * Descrição do domínio do campo.&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 100
   * @return descricao
  **/
  @JsonProperty("descricao")
  @NotNull
  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public DominioCampoApiRepresentation descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DominioCampoApiRepresentation {\n");
    
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

