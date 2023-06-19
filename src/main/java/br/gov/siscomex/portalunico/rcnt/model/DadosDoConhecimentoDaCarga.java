package br.gov.siscomex.portalunico.rcnt.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "DadosDoConhecimentoDaCarga", propOrder =
    { "idElemento", "numero", "numeroConhecimentoMAWB", "tipo"
})

@XmlRootElement(name="DadosDoConhecimentoDaCarga")
public class DadosDoConhecimentoDaCarga  {
  
  @XmlElement(name="idElemento", required = true)
  @ApiModelProperty(required = true, value = "Identificação de cada elemento da lista. Este atributo é obrigatório e deve ser único dentro da lista correspondente.<br/>Tamanho: 40")
 /**
   * Identificação de cada elemento da lista. Este atributo é obrigatório e deve ser único dentro da lista correspondente.<br/>Tamanho: 40
  **/
  private String idElemento = null;

  @XmlElement(name="numero")
  @ApiModelProperty(example = "131805000071025", value = "Identificação do conhecimento de carga ou do DSIC. <br/>No modal aéreo, na importação, deve ser preenchido quando se tratar de AWB direto, ou HAWB, ou DSIC. <br/>No modal aéreo, na exportação, não deve ser preenchido.  <br/>No aquaviário deve ser preenchido com CE Mercante na importação e na exportação com o conhecimento internacional ou, quando ainda não emitido, com o CT-e que amparou a chegada da carga.<br/>Tamanho: 100")
 /**
   * Identificação do conhecimento de carga ou do DSIC. <br/>No modal aéreo, na importação, deve ser preenchido quando se tratar de AWB direto, ou HAWB, ou DSIC. <br/>No modal aéreo, na exportação, não deve ser preenchido.  <br/>No aquaviário deve ser preenchido com CE Mercante na importação e na exportação com o conhecimento internacional ou, quando ainda não emitido, com o CT-e que amparou a chegada da carga.<br/>Tamanho: 100
  **/
  private String numero = null;

  @XmlElement(name="numeroConhecimentoMAWB")
  @ApiModelProperty(example = "0556548723", value = "Identificação do conhecimento MASTER (MAWB), a ser utilizado somente no modal aéreo. <br/>Quando se tratar de um MAWB, esse campo deve ser preenchido, e o campo 'Conhecimento de carga' deve ser deixado vazio. <br/>Quando se tratar de um HAWB, este campo deve ser preenchido com o MASTER (inclusive nos casos de remessa) e o campo 'Conhecimento de carga' <br/> deve ser preenchido com o HOUSE.<br/>Tamanho: 100")
 /**
   * Identificação do conhecimento MASTER (MAWB), a ser utilizado somente no modal aéreo. <br/>Quando se tratar de um MAWB, esse campo deve ser preenchido, e o campo 'Conhecimento de carga' deve ser deixado vazio. <br/>Quando se tratar de um HAWB, este campo deve ser preenchido com o MASTER (inclusive nos casos de remessa) e o campo 'Conhecimento de carga' <br/> deve ser preenchido com o HOUSE.<br/>Tamanho: 100
  **/
  private String numeroConhecimentoMAWB = null;

  @XmlElement(name="tipo")
  @ApiModelProperty(example = "AWB", value = "Tipo de conhecimento. Conforme tabela de domínio Tipo de Conhecimento disponível no <a href=https://portalunico.siscomex.gov.br/tabx/#/tabelas rel=\"noopener noreferrer\" target=\"_blank\">Portal Único Siscomex.</a>")
 /**
   * Tipo de conhecimento. Conforme tabela de domínio Tipo de Conhecimento disponível no <a href=https://portalunico.siscomex.gov.br/tabx/#/tabelas rel=\"noopener noreferrer\" target=\"_blank\">Portal Único Siscomex.</a>
  **/
  private String tipo = null;
 /**
   * Identificação de cada elemento da lista. Este atributo é obrigatório e deve ser único dentro da lista correspondente.&lt;br/&gt;Tamanho: 40
   * @return idElemento
  **/
  @JsonProperty("idElemento")
  @NotNull
  public String getIdElemento() {
    return idElemento;
  }

  public void setIdElemento(String idElemento) {
    this.idElemento = idElemento;
  }

  public DadosDoConhecimentoDaCarga idElemento(String idElemento) {
    this.idElemento = idElemento;
    return this;
  }

 /**
   * Identificação do conhecimento de carga ou do DSIC. &lt;br/&gt;No modal aéreo, na importação, deve ser preenchido quando se tratar de AWB direto, ou HAWB, ou DSIC. &lt;br/&gt;No modal aéreo, na exportação, não deve ser preenchido.  &lt;br/&gt;No aquaviário deve ser preenchido com CE Mercante na importação e na exportação com o conhecimento internacional ou, quando ainda não emitido, com o CT-e que amparou a chegada da carga.&lt;br/&gt;Tamanho: 100
   * @return numero
  **/
  @JsonProperty("numero")
  public String getNumero() {
    return numero;
  }

  public void setNumero(String numero) {
    this.numero = numero;
  }

  public DadosDoConhecimentoDaCarga numero(String numero) {
    this.numero = numero;
    return this;
  }

 /**
   * Identificação do conhecimento MASTER (MAWB), a ser utilizado somente no modal aéreo. &lt;br/&gt;Quando se tratar de um MAWB, esse campo deve ser preenchido, e o campo &#39;Conhecimento de carga&#39; deve ser deixado vazio. &lt;br/&gt;Quando se tratar de um HAWB, este campo deve ser preenchido com o MASTER (inclusive nos casos de remessa) e o campo &#39;Conhecimento de carga&#39; &lt;br/&gt; deve ser preenchido com o HOUSE.&lt;br/&gt;Tamanho: 100
   * @return numeroConhecimentoMAWB
  **/
  @JsonProperty("numeroConhecimentoMAWB")
  public String getNumeroConhecimentoMAWB() {
    return numeroConhecimentoMAWB;
  }

  public void setNumeroConhecimentoMAWB(String numeroConhecimentoMAWB) {
    this.numeroConhecimentoMAWB = numeroConhecimentoMAWB;
  }

  public DadosDoConhecimentoDaCarga numeroConhecimentoMAWB(String numeroConhecimentoMAWB) {
    this.numeroConhecimentoMAWB = numeroConhecimentoMAWB;
    return this;
  }

 /**
   * Tipo de conhecimento. Conforme tabela de domínio Tipo de Conhecimento disponível no &lt;a href&#x3D;https://portalunico.siscomex.gov.br/tabx/#/tabelas rel&#x3D;\&quot;noopener noreferrer\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Portal Único Siscomex.&lt;/a&gt;
   * @return tipo
  **/
  @JsonProperty("tipo")
  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public DadosDoConhecimentoDaCarga tipo(String tipo) {
    this.tipo = tipo;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DadosDoConhecimentoDaCarga {\n");
    
    sb.append("    idElemento: ").append(toIndentedString(idElemento)).append("\n");
    sb.append("    numero: ").append(toIndentedString(numero)).append("\n");
    sb.append("    numeroConhecimentoMAWB: ").append(toIndentedString(numeroConhecimentoMAWB)).append("\n");
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

