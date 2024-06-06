package br.gov.siscomex.portalunico.due.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaisDto", propOrder =
    { "codigo", "nome", "nomeResumido"
})

@XmlRootElement(name = "PaisDto")
public class PaisDto {
  
  @XmlElement(name="codigo")
  @ApiModelProperty(value = "Código<br />Formato: Inteiro, com até 3 digitos")
 /**
   * Código<br />Formato: Inteiro, com até 3 digitos
  **/
  private Long codigo = null;

  @XmlElement(name="nome")
  @ApiModelProperty(value = "Nome<br />Tamanho mínimo: 1<br />Tamanho máximo: 50")
 /**
   * Nome<br />Tamanho mínimo: 1<br />Tamanho máximo: 50
  **/
  private String nome = null;

  @XmlElement(name="nomeResumido")
  @ApiModelProperty(example = "BRA", value = "Nome<br />Tamanho: 3")
 /**
   * Nome<br />Tamanho: 3
  **/
  private String nomeResumido = null;
 /**
   * Código&lt;br /&gt;Formato: Inteiro, com até 3 digitos
   * @return codigo
  **/
  @JsonProperty("codigo")
  public Long getCodigo() {
    return codigo;
  }

  public void setCodigo(Long codigo) {
    this.codigo = codigo;
  }

    public PaisDto codigo(Long codigo) {
    this.codigo = codigo;
    return this;
  }

 /**
   * Nome&lt;br /&gt;Tamanho mínimo: 1&lt;br /&gt;Tamanho máximo: 50
   * @return nome
  **/
  @JsonProperty("nome")
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

    public PaisDto nome(String nome) {
    this.nome = nome;
    return this;
  }

 /**
   * Nome&lt;br /&gt;Tamanho: 3
   * @return nomeResumido
  **/
  @JsonProperty("nomeResumido")
  public String getNomeResumido() {
    return nomeResumido;
  }

  public void setNomeResumido(String nomeResumido) {
    this.nomeResumido = nomeResumido;
  }

    public PaisDto nomeResumido(String nomeResumido) {
    this.nomeResumido = nomeResumido;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
      sb.append("class PaisDto {\n");
    
    sb.append("    codigo: ").append(toIndentedString(codigo)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    nomeResumido: ").append(toIndentedString(nomeResumido)).append("\n");
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

