package br.gov.siscomex.portalunico.due.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "RecintoAduaneiroDto", propOrder =
    { "codigo", "cooordenada", "descricao", "unidadeLocalRFB", "zona"
})

@XmlRootElement(name="RecintoAduaneiroDto")
public class RecintoAduaneiroDto  {
  
  @XmlElement(name="codigo")
  @ApiModelProperty(example = "8911101", value = "Código<br />Tamanho: 7<br />Formato: 'NNNNNNN'")
 /**
   * Código<br />Tamanho: 7<br />Formato: 'NNNNNNN'
  **/
  private String codigo = null;

  @XmlElement(name="cooordenada")
  @ApiModelProperty(value = "")
  @Valid
  private CoordenadaGeograficaDto cooordenada = null;

  @XmlElement(name="descricao")
  @ApiModelProperty(value = "Descrição<br />Tamanho mínimo: 0<br />Tamanho máximo: 50")
 /**
   * Descrição<br />Tamanho mínimo: 0<br />Tamanho máximo: 50
  **/
  private String descricao = null;

  @XmlElement(name="unidadeLocalRFB")
  @ApiModelProperty(value = "")
  @Valid
  private UnidadeLocalRFBDto unidadeLocalRFB = null;

  @XmlElement(name="zona")
  @ApiModelProperty(example = "1", value = "Zona<br />Domínio: <br />1 = Primária<br />2 = Secundária")
 /**
   * Zona<br />Domínio: <br />1 = Primária<br />2 = Secundária
  **/
  private String zona = null;
 /**
   * Código&lt;br /&gt;Tamanho: 7&lt;br /&gt;Formato: &#39;NNNNNNN&#39;
   * @return codigo
  **/
  @JsonProperty("codigo")
  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public RecintoAduaneiroDto codigo(String codigo) {
    this.codigo = codigo;
    return this;
  }

 /**
   * Get cooordenada
   * @return cooordenada
  **/
  @JsonProperty("cooordenada")
  public CoordenadaGeograficaDto getCooordenada() {
    return cooordenada;
  }

  public void setCooordenada(CoordenadaGeograficaDto cooordenada) {
    this.cooordenada = cooordenada;
  }

  public RecintoAduaneiroDto cooordenada(CoordenadaGeograficaDto cooordenada) {
    this.cooordenada = cooordenada;
    return this;
  }

 /**
   * Descrição&lt;br /&gt;Tamanho mínimo: 0&lt;br /&gt;Tamanho máximo: 50
   * @return descricao
  **/
  @JsonProperty("descricao")
  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public RecintoAduaneiroDto descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }

 /**
   * Get unidadeLocalRFB
   * @return unidadeLocalRFB
  **/
  @JsonProperty("unidadeLocalRFB")
  public UnidadeLocalRFBDto getUnidadeLocalRFB() {
    return unidadeLocalRFB;
  }

  public void setUnidadeLocalRFB(UnidadeLocalRFBDto unidadeLocalRFB) {
    this.unidadeLocalRFB = unidadeLocalRFB;
  }

  public RecintoAduaneiroDto unidadeLocalRFB(UnidadeLocalRFBDto unidadeLocalRFB) {
    this.unidadeLocalRFB = unidadeLocalRFB;
    return this;
  }

 /**
   * Zona&lt;br /&gt;Domínio: &lt;br /&gt;1 &#x3D; Primária&lt;br /&gt;2 &#x3D; Secundária
   * @return zona
  **/
  @JsonProperty("zona")
  public String getZona() {
    return zona;
  }

  public void setZona(String zona) {
    this.zona = zona;
  }

  public RecintoAduaneiroDto zona(String zona) {
    this.zona = zona;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecintoAduaneiroDto {\n");
    
    sb.append("    codigo: ").append(toIndentedString(codigo)).append("\n");
    sb.append("    cooordenada: ").append(toIndentedString(cooordenada)).append("\n");
    sb.append("    descricao: ").append(toIndentedString(descricao)).append("\n");
    sb.append("    unidadeLocalRFB: ").append(toIndentedString(unidadeLocalRFB)).append("\n");
    sb.append("    zona: ").append(toIndentedString(zona)).append("\n");
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

