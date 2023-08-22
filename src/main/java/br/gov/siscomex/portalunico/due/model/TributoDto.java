package br.gov.siscomex.portalunico.due.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "TributoDto", propOrder =
    { "codigo", "nome"
})

@XmlRootElement(name="TributoDto")
public class TributoDto  {
  
  @XmlElement(name="codigo")
  @ApiModelProperty(value = "Código<br />Formato: Inteiro, com até 17 digitos")
 /**
   * Código<br />Formato: Inteiro, com até 17 digitos
  **/
  private Long codigo = null;

  @XmlElement(name="nome")
  @ApiModelProperty(value = "Nome<br />Tamanho mínimo: 1<br />Tamanho máximo: 100")
 /**
   * Nome<br />Tamanho mínimo: 1<br />Tamanho máximo: 100
  **/
  private String nome = null;
 /**
   * Código&lt;br /&gt;Formato: Inteiro, com até 17 digitos
   * @return codigo
  **/
  @JsonProperty("codigo")
  public Long getCodigo() {
    return codigo;
  }

  public void setCodigo(Long codigo) {
    this.codigo = codigo;
  }

  public TributoDto codigo(Long codigo) {
    this.codigo = codigo;
    return this;
  }

 /**
   * Nome&lt;br /&gt;Tamanho mínimo: 1&lt;br /&gt;Tamanho máximo: 100
   * @return nome
  **/
  @JsonProperty("nome")
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public TributoDto nome(String nome) {
    this.nome = nome;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TributoDto {\n");
    
    sb.append("    codigo: ").append(toIndentedString(codigo)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
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

