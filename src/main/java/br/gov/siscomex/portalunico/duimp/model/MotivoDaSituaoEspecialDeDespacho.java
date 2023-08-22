package br.gov.siscomex.portalunico.duimp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "MotivoDaSituaoEspecialDeDespacho", propOrder =
    { "codigo", "descricao"
})

@XmlRootElement(name="MotivoDaSituaoEspecialDeDespacho")
public class MotivoDaSituaoEspecialDeDespacho  {
  
  @XmlElement(name="codigo")
  @ApiModelProperty(example = "90", value = "Código do motivo da situação especial de despacho da Duimp<br>Tamanho mínimo: 1<br>Tamanho máximo: 2")
 /**
   * Código do motivo da situação especial de despacho da Duimp<br>Tamanho mínimo: 1<br>Tamanho máximo: 2
  **/
  private String codigo = null;

  @XmlElement(name="descricao")
  @ApiModelProperty(example = "Descrição do código de motivo 90", value = "Descrição correspondente ao valor informado no atributo 'codigo'. <br>Tamanho mínimo: 1<br>Tamanho máximo: 150")
 /**
   * Descrição correspondente ao valor informado no atributo 'codigo'. <br>Tamanho mínimo: 1<br>Tamanho máximo: 150
  **/
  private String descricao = null;
 /**
   * Código do motivo da situação especial de despacho da Duimp&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 2
   * @return codigo
  **/
  @JsonProperty("codigo")
  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public MotivoDaSituaoEspecialDeDespacho codigo(String codigo) {
    this.codigo = codigo;
    return this;
  }

 /**
   * Descrição correspondente ao valor informado no atributo &#39;codigo&#39;. &lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 150
   * @return descricao
  **/
  @JsonProperty("descricao")
  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public MotivoDaSituaoEspecialDeDespacho descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MotivoDaSituaoEspecialDeDespacho {\n");
    
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

