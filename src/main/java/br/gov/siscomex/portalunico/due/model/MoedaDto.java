package br.gov.siscomex.portalunico.due.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MoedaDto", propOrder =
    { "codigo", "descricao"
})

@XmlRootElement(name = "MoedaDto")
public class MoedaDto {
  
  @XmlElement(name="codigo")
  @ApiModelProperty(value = "Código<br />Formato: Inteiro, com até 3 digitos")
 /**
   * Código<br />Formato: Inteiro, com até 3 digitos
  **/
  private Integer codigo = null;

  @XmlElement(name="descricao")
  @ApiModelProperty(value = "Descrição<br />Tamanho mínimo: 1<br />Tamanho máximo: 50")
 /**
   * Descrição<br />Tamanho mínimo: 1<br />Tamanho máximo: 50
  **/
  private String descricao = null;
 /**
   * Código&lt;br /&gt;Formato: Inteiro, com até 3 digitos
   * @return codigo
  **/
  @JsonProperty("codigo")
  public Integer getCodigo() {
    return codigo;
  }

  public void setCodigo(Integer codigo) {
    this.codigo = codigo;
  }

    public MoedaDto codigo(Integer codigo) {
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

    public MoedaDto descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
      sb.append("class MoedaDto {\n");
    
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

