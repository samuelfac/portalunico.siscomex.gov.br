package br.gov.siscomex.portalunico.duimp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "FundamentoLegalDoRegimeTributrioDeImportaoObjetoCompostoPelosAtributosCdigoEDescrio", propOrder =
    { "codigo", "descricao"
})

@XmlRootElement(name="FundamentoLegalDoRegimeTributrioDeImportaoObjetoCompostoPelosAtributosCdigoEDescrio")
public class FundamentoLegalDoRegimeTributrioDeImportaoObjetoCompostoPelosAtributosCdigoEDescrio  {
  
  @XmlElement(name="codigo")
  @ApiModelProperty(example = "1001", value = "Código do fundamento legal do regime tributário de importação utilizado na declaração<br>Dominio: Fundamentos legais existentes no sistema Tratamento Tributário")
 /**
   * Código do fundamento legal do regime tributário de importação utilizado na declaração<br>Dominio: Fundamentos legais existentes no sistema Tratamento Tributário
  **/
  private String codigo = null;

  @XmlElement(name="descricao")
  @ApiModelProperty(example = "LIVROS, JORNAIS E PERIODICOS ... ", value = "Descrição correspondente ao valor informado no atributo 'codigo'. <br>Tamanho mínimo: 1<br>Tamanho máximo: 150")
 /**
   * Descrição correspondente ao valor informado no atributo 'codigo'. <br>Tamanho mínimo: 1<br>Tamanho máximo: 150
  **/
  private String descricao = null;
 /**
   * Código do fundamento legal do regime tributário de importação utilizado na declaração&lt;br&gt;Dominio: Fundamentos legais existentes no sistema Tratamento Tributário
   * @return codigo
  **/
  @JsonProperty("codigo")
  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public FundamentoLegalDoRegimeTributrioDeImportaoObjetoCompostoPelosAtributosCdigoEDescrio codigo(String codigo) {
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

  public FundamentoLegalDoRegimeTributrioDeImportaoObjetoCompostoPelosAtributosCdigoEDescrio descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FundamentoLegalDoRegimeTributrioDeImportaoObjetoCompostoPelosAtributosCdigoEDescrio {\n");
    
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

