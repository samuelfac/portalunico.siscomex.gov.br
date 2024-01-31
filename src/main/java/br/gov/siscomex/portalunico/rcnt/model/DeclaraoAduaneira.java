package br.gov.siscomex.portalunico.rcnt.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "DeclaraoAduaneira", propOrder =
    { "numeroDeclaracao", "tipo"
})

@XmlRootElement(name="DeclaraoAduaneira")
public class DeclaraoAduaneira  {
  
  @XmlElement(name="numeroDeclaracao")
  @ApiModelProperty(value = "Número da declaração aduaneira.<br/> O tamanho permitido para 'numeroDeclaracao' será conforme o valor de 'tipo' da declaração:   'DI': 10 (somente números) 'DTA': 10 'DUE': 14 'DAT': 11 'DUIMP': 15 Outros: até 100")
 /**
   * Número da declaração aduaneira.<br/> O tamanho permitido para 'numeroDeclaracao' será conforme o valor de 'tipo' da declaração:   'DI': 10 (somente números) 'DTA': 10 'DUE': 14 'DAT': 11 'DUIMP': 15 Outros: até 100
  **/
  private String numeroDeclaracao = null;

  @XmlElement(name="tipo")
  @ApiModelProperty(example = "DUIMP", value = "Tipo da Declaração aduaneira. Conforme tabela de domínio Tipo de Declaração Aduaneira disponível no <a href=https://portalunico.siscomex.gov.br/tabx/#/tabelas rel=\"noopener noreferrer\" target=\"_blank\">Portal Único Siscomex.</a>")
 /**
   * Tipo da Declaração aduaneira. Conforme tabela de domínio Tipo de Declaração Aduaneira disponível no <a href=https://portalunico.siscomex.gov.br/tabx/#/tabelas rel=\"noopener noreferrer\" target=\"_blank\">Portal Único Siscomex.</a>
  **/
  private String tipo = null;
 /**
   * Número da declaração aduaneira.&lt;br/&gt; O tamanho permitido para &#39;numeroDeclaracao&#39; será conforme o valor de &#39;tipo&#39; da declaração:   &#39;DI&#39;: 10 (somente números) &#39;DTA&#39;: 10 &#39;DUE&#39;: 14 &#39;DAT&#39;: 11 &#39;DUIMP&#39;: 15 Outros: até 100
   * @return numeroDeclaracao
  **/
  @JsonProperty("numeroDeclaracao")
  public String getNumeroDeclaracao() {
    return numeroDeclaracao;
  }

  public void setNumeroDeclaracao(String numeroDeclaracao) {
    this.numeroDeclaracao = numeroDeclaracao;
  }

  public DeclaraoAduaneira numeroDeclaracao(String numeroDeclaracao) {
    this.numeroDeclaracao = numeroDeclaracao;
    return this;
  }

 /**
   * Tipo da Declaração aduaneira. Conforme tabela de domínio Tipo de Declaração Aduaneira disponível no &lt;a href&#x3D;https://portalunico.siscomex.gov.br/tabx/#/tabelas rel&#x3D;\&quot;noopener noreferrer\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Portal Único Siscomex.&lt;/a&gt;
   * @return tipo
  **/
  @JsonProperty("tipo")
  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public DeclaraoAduaneira tipo(String tipo) {
    this.tipo = tipo;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeclaraoAduaneira {\n");
    
    sb.append("    numeroDeclaracao: ").append(toIndentedString(numeroDeclaracao)).append("\n");
    sb.append("    tipo: ").append(toIndentedString(tipo)).append("\n");
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

