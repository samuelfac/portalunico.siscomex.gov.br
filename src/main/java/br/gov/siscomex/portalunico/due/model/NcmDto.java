package br.gov.siscomex.portalunico.due.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NcmDto", propOrder =
    { "codigo", "descricao", "unidadeMedidaEstatistica"
})

@XmlRootElement(name = "NcmDto")
public class NcmDto {
  
  @XmlElement(name="codigo")
  @ApiModelProperty(example = "01013000", value = "Código<br />Tamanho: 8<br />Formato: 'NNNNNNNN'")
 /**
   * Código<br />Tamanho: 8<br />Formato: 'NNNNNNNN'
  **/
  private String codigo = null;

  @XmlElement(name="descricao")
  @ApiModelProperty(value = "Descrição<br />Tamanho mínimo: 1<br />Tamanho máximo: 50")
 /**
   * Descrição<br />Tamanho mínimo: 1<br />Tamanho máximo: 50
  **/
  private String descricao = null;

  @XmlElement(name="unidadeMedidaEstatistica")
  @ApiModelProperty(example = "KG", value = "Unidade de Medida Estatística<br />Tamanho: 2<br />Formato: 'AA'")
 /**
   * Unidade de Medida Estatística<br />Tamanho: 2<br />Formato: 'AA'
  **/
  private String unidadeMedidaEstatistica = null;
 /**
   * Código&lt;br /&gt;Tamanho: 8&lt;br /&gt;Formato: &#39;NNNNNNNN&#39;
   * @return codigo
  **/
  @JsonProperty("codigo")
  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

    public NcmDto codigo(String codigo) {
    this.codigo = codigo;
    return this;
  }

 /**
   * Descrição&lt;br /&gt;Tamanho mínimo: 1&lt;br /&gt;Tamanho máximo: 50
   * @return descricao
  **/
  @JsonProperty("descricao")
  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

    public NcmDto descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }

 /**
   * Unidade de Medida Estatística&lt;br /&gt;Tamanho: 2&lt;br /&gt;Formato: &#39;AA&#39;
   * @return unidadeMedidaEstatistica
  **/
  @JsonProperty("unidadeMedidaEstatistica")
  public String getUnidadeMedidaEstatistica() {
    return unidadeMedidaEstatistica;
  }

  public void setUnidadeMedidaEstatistica(String unidadeMedidaEstatistica) {
    this.unidadeMedidaEstatistica = unidadeMedidaEstatistica;
  }

    public NcmDto unidadeMedidaEstatistica(String unidadeMedidaEstatistica) {
    this.unidadeMedidaEstatistica = unidadeMedidaEstatistica;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
      sb.append("class NcmDto {\n");
    
    sb.append("    codigo: ").append(toIndentedString(codigo)).append("\n");
    sb.append("    descricao: ").append(toIndentedString(descricao)).append("\n");
    sb.append("    unidadeMedidaEstatistica: ").append(toIndentedString(unidadeMedidaEstatistica)).append("\n");
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

