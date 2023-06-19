package br.gov.siscomex.portalunico.duimp_api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "IdentificadorDuimpCover", propOrder =
    { "numero", "versao"
})

@XmlRootElement(name="IdentificadorDuimpCover")
/**
  * Dados da identificação da declaração única de importação.
 **/
@ApiModel(description="Dados da identificação da declaração única de importação.")
public class IdentificadorDuimpCover  {
  
  @XmlElement(name="numero")
  @ApiModelProperty(example = "19BR00000004677", value = "Número da Duimp.<br>Tamanho: 15<br>Formato: 'NNAANNNNNNNNNNN'<br>Lei de formação. O número da Duimp é composto por: <br>* NN = Corresponde ao ano do registro da Declaração. <br>* AA = Corresponde à sigla do país de emissão do documento (BR).<br>* NNNNNNNNNN = 10 caracteres númericos. Número sequencial da Duimp dentro do ano.<br>* N = 1 caracter númerico. DV para todos os demais caracteres numéricos (Módulo 11)")
 /**
   * Número da Duimp.<br>Tamanho: 15<br>Formato: 'NNAANNNNNNNNNNN'<br>Lei de formação. O número da Duimp é composto por: <br>* NN = Corresponde ao ano do registro da Declaração. <br>* AA = Corresponde à sigla do país de emissão do documento (BR).<br>* NNNNNNNNNN = 10 caracteres númericos. Número sequencial da Duimp dentro do ano.<br>* N = 1 caracter númerico. DV para todos os demais caracteres numéricos (Módulo 11)
  **/
  private String numero = null;

  @XmlElement(name="versao")
  @ApiModelProperty(example = "1", value = "Versão da Duimp.<br>Valor mínimo: 1<br>Valor máximo: 9999")
 /**
   * Versão da Duimp.<br>Valor mínimo: 1<br>Valor máximo: 9999
  **/
  private String versao = null;
 /**
   * Número da Duimp.&lt;br&gt;Tamanho: 15&lt;br&gt;Formato: &#39;NNAANNNNNNNNNNN&#39;&lt;br&gt;Lei de formação. O número da Duimp é composto por: &lt;br&gt;* NN &#x3D; Corresponde ao ano do registro da Declaração. &lt;br&gt;* AA &#x3D; Corresponde à sigla do país de emissão do documento (BR).&lt;br&gt;* NNNNNNNNNN &#x3D; 10 caracteres númericos. Número sequencial da Duimp dentro do ano.&lt;br&gt;* N &#x3D; 1 caracter númerico. DV para todos os demais caracteres numéricos (Módulo 11)
   * @return numero
  **/
  @JsonProperty("numero")
  public String getNumero() {
    return numero;
  }

  public void setNumero(String numero) {
    this.numero = numero;
  }

  public IdentificadorDuimpCover numero(String numero) {
    this.numero = numero;
    return this;
  }

 /**
   * Versão da Duimp.&lt;br&gt;Valor mínimo: 1&lt;br&gt;Valor máximo: 9999
   * @return versao
  **/
  @JsonProperty("versao")
  public String getVersao() {
    return versao;
  }

  public void setVersao(String versao) {
    this.versao = versao;
  }

  public IdentificadorDuimpCover versao(String versao) {
    this.versao = versao;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentificadorDuimpCover {\n");
    
    sb.append("    numero: ").append(toIndentedString(numero)).append("\n");
    sb.append("    versao: ").append(toIndentedString(versao)).append("\n");
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

