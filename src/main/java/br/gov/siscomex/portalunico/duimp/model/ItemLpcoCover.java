package br.gov.siscomex.portalunico.duimp.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "ItemLpcoCover", propOrder =
    { "numero", "modelo", "orgao"
})

@XmlRootElement(name="ItemLpcoCover")
/**
  * Dados do LPCO
 **/
@ApiModel(description="Dados do LPCO")
public class ItemLpcoCover  {
  
  @XmlElement(name="numero")
  @ApiModelProperty(example = "I2000000007", value = "Número do LPCO<br><br>Tamanho: 11<br>Formato: 'IAANNNNNNNN'<br>Lei de formação. O número do LPCO é composto por: <br>* I = Prefixo para modelos utilizados na Importação.<br>* AA = Corresponde à sigla do país de emissão do documento (BR).<br>* NNNNNNNN = 8 caracteres númericos. Número sequencial do modelo.")
 /**
   * Número do LPCO<br><br>Tamanho: 11<br>Formato: 'IAANNNNNNNN'<br>Lei de formação. O número do LPCO é composto por: <br>* I = Prefixo para modelos utilizados na Importação.<br>* AA = Corresponde à sigla do país de emissão do documento (BR).<br>* NNNNNNNN = 8 caracteres númericos. Número sequencial do modelo.
  **/
  private String numero = null;

  @XmlElement(name="modelo")
  @ApiModelProperty(example = "I00101", value = "Código do modelo do LPCO<br><br>Tamanho: 6<br>Formato: 'INNNNN'<br>Lei de formação. O modelo do LPCO é composto por: <br>* I = Prefixo para modelos utilizados na Importação.<br>* NNNNN = 5 caracteres númericos. Número sequencial do modelo.")
 /**
   * Código do modelo do LPCO<br><br>Tamanho: 6<br>Formato: 'INNNNN'<br>Lei de formação. O modelo do LPCO é composto por: <br>* I = Prefixo para modelos utilizados na Importação.<br>* NNNNN = 5 caracteres númericos. Número sequencial do modelo.
  **/
  private String modelo = null;

  @XmlElement(name="orgao")
  @ApiModelProperty(example = "DECEX", value = "Sigla do Órgão Anuente<br><br>Tamanho mínimo: 1<br>Tamanho máximo: 30")
 /**
   * Sigla do Órgão Anuente<br><br>Tamanho mínimo: 1<br>Tamanho máximo: 30
  **/
  private String orgao = null;
 /**
   * Número do LPCO&lt;br&gt;&lt;br&gt;Tamanho: 11&lt;br&gt;Formato: &#39;IAANNNNNNNN&#39;&lt;br&gt;Lei de formação. O número do LPCO é composto por: &lt;br&gt;* I &#x3D; Prefixo para modelos utilizados na Importação.&lt;br&gt;* AA &#x3D; Corresponde à sigla do país de emissão do documento (BR).&lt;br&gt;* NNNNNNNN &#x3D; 8 caracteres númericos. Número sequencial do modelo.
   * @return numero
  **/
  @JsonProperty("numero")
  public String getNumero() {
    return numero;
  }

  public void setNumero(String numero) {
    this.numero = numero;
  }

  public ItemLpcoCover numero(String numero) {
    this.numero = numero;
    return this;
  }

 /**
   * Código do modelo do LPCO&lt;br&gt;&lt;br&gt;Tamanho: 6&lt;br&gt;Formato: &#39;INNNNN&#39;&lt;br&gt;Lei de formação. O modelo do LPCO é composto por: &lt;br&gt;* I &#x3D; Prefixo para modelos utilizados na Importação.&lt;br&gt;* NNNNN &#x3D; 5 caracteres númericos. Número sequencial do modelo.
   * @return modelo
  **/
  @JsonProperty("modelo")
  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public ItemLpcoCover modelo(String modelo) {
    this.modelo = modelo;
    return this;
  }

 /**
   * Sigla do Órgão Anuente&lt;br&gt;&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 30
   * @return orgao
  **/
  @JsonProperty("orgao")
  public String getOrgao() {
    return orgao;
  }

  public void setOrgao(String orgao) {
    this.orgao = orgao;
  }

  public ItemLpcoCover orgao(String orgao) {
    this.orgao = orgao;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemLpcoCover {\n");
    
    sb.append("    numero: ").append(toIndentedString(numero)).append("\n");
    sb.append("    modelo: ").append(toIndentedString(modelo)).append("\n");
    sb.append("    orgao: ").append(toIndentedString(orgao)).append("\n");
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

