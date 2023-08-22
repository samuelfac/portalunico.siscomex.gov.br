package br.gov.siscomex.portalunico.duimp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "MotivoParaAusnciaDeCoberturaCambialObjetoCompostoPelosAtributosCdigoEDescrio", propOrder =
    { "codigo", "descricao"
})

@XmlRootElement(name="MotivoParaAusnciaDeCoberturaCambialObjetoCompostoPelosAtributosCdigoEDescrio")
public class MotivoParaAusnciaDeCoberturaCambialObjetoCompostoPelosAtributosCdigoEDescrio  {
  
  @XmlElement(name="codigo")
  @ApiModelProperty(example = "52", value = "Código do Motivo para ausência de cobertura cambial.<br>Dominio: Tabela de Motivos Sem Cobertura do Siscomex.<br>Valor mínimo: 1<br>Valor máximo: 99999")
 /**
   * Código do Motivo para ausência de cobertura cambial.<br>Dominio: Tabela de Motivos Sem Cobertura do Siscomex.<br>Valor mínimo: 1<br>Valor máximo: 99999
  **/
  private String codigo = null;

  @XmlElement(name="descricao")
  @ApiModelProperty(example = "ADMISSAO EM REGIME ADUANEIRO ESPECIAL OU ATIPICO", value = "Descrição correspondente ao valor informado no atributo 'codigo'. <br>Tamanho mínimo: 1<br>Tamanho máximo: 150")
 /**
   * Descrição correspondente ao valor informado no atributo 'codigo'. <br>Tamanho mínimo: 1<br>Tamanho máximo: 150
  **/
  private String descricao = null;
 /**
   * Código do Motivo para ausência de cobertura cambial.&lt;br&gt;Dominio: Tabela de Motivos Sem Cobertura do Siscomex.&lt;br&gt;Valor mínimo: 1&lt;br&gt;Valor máximo: 99999
   * @return codigo
  **/
  @JsonProperty("codigo")
  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public MotivoParaAusnciaDeCoberturaCambialObjetoCompostoPelosAtributosCdigoEDescrio codigo(String codigo) {
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

  public MotivoParaAusnciaDeCoberturaCambialObjetoCompostoPelosAtributosCdigoEDescrio descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MotivoParaAusnciaDeCoberturaCambialObjetoCompostoPelosAtributosCdigoEDescrio {\n");
    
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

