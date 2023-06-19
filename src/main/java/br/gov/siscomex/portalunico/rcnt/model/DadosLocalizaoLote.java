package br.gov.siscomex.portalunico.rcnt.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "DadosLocalizaoLote", propOrder =
    { "altura", "fila", "pilha", "quadra"
})

@XmlRootElement(name="DadosLocalizaoLote")
public class DadosLocalizaoLote  {
  
  @XmlElement(name="altura")
  @ApiModelProperty(value = "Altura<br/>Tamanho: 20")
 /**
   * Altura<br/>Tamanho: 20
  **/
  private String altura = null;

  @XmlElement(name="fila")
  @ApiModelProperty(value = "Fila<br/>Tamanho: 20")
 /**
   * Fila<br/>Tamanho: 20
  **/
  private String fila = null;

  @XmlElement(name="pilha")
  @ApiModelProperty(value = "Pilha<br/>Tamanho: 20")
 /**
   * Pilha<br/>Tamanho: 20
  **/
  private String pilha = null;

  @XmlElement(name="quadra")
  @ApiModelProperty(value = "Quadra<br/>Tamanho: 20")
 /**
   * Quadra<br/>Tamanho: 20
  **/
  private String quadra = null;
 /**
   * Altura&lt;br/&gt;Tamanho: 20
   * @return altura
  **/
  @JsonProperty("altura")
  public String getAltura() {
    return altura;
  }

  public void setAltura(String altura) {
    this.altura = altura;
  }

  public DadosLocalizaoLote altura(String altura) {
    this.altura = altura;
    return this;
  }

 /**
   * Fila&lt;br/&gt;Tamanho: 20
   * @return fila
  **/
  @JsonProperty("fila")
  public String getFila() {
    return fila;
  }

  public void setFila(String fila) {
    this.fila = fila;
  }

  public DadosLocalizaoLote fila(String fila) {
    this.fila = fila;
    return this;
  }

 /**
   * Pilha&lt;br/&gt;Tamanho: 20
   * @return pilha
  **/
  @JsonProperty("pilha")
  public String getPilha() {
    return pilha;
  }

  public void setPilha(String pilha) {
    this.pilha = pilha;
  }

  public DadosLocalizaoLote pilha(String pilha) {
    this.pilha = pilha;
    return this;
  }

 /**
   * Quadra&lt;br/&gt;Tamanho: 20
   * @return quadra
  **/
  @JsonProperty("quadra")
  public String getQuadra() {
    return quadra;
  }

  public void setQuadra(String quadra) {
    this.quadra = quadra;
  }

  public DadosLocalizaoLote quadra(String quadra) {
    this.quadra = quadra;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DadosLocalizaoLote {\n");
    
    sb.append("    altura: ").append(toIndentedString(altura)).append("\n");
    sb.append("    fila: ").append(toIndentedString(fila)).append("\n");
    sb.append("    pilha: ").append(toIndentedString(pilha)).append("\n");
    sb.append("    quadra: ").append(toIndentedString(quadra)).append("\n");
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

