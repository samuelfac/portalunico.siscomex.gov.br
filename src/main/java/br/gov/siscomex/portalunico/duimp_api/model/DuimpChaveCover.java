package br.gov.siscomex.portalunico.duimp_api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "DuimpChaveCover", propOrder =
    { "numero", "chaveAcesso"
})

@XmlRootElement(name="DuimpChaveCover")
public class DuimpChaveCover  {
  
  @XmlElement(name="numero")
  @ApiModelProperty(example = "20BR00000012345", value = "<br>Tamanho: 15<br>Formato: 'NNAANNNNNNNNNNN'<br>Lei de formação. O número da Duimp é composto por: <br>* NN = Corresponde ao ano do registro da Declaração. <br>* AA = Corresponde à sigla do país de emissão do documento (BR).<br>* NNNNNNNNNN = 10 caracteres númericos. Número sequencial da Duimp dentro do ano.<br>* N = 1 caracter númerico. DV para todos os demais caracteres numéricos (Módulo 11)")
 /**
   * <br>Tamanho: 15<br>Formato: 'NNAANNNNNNNNNNN'<br>Lei de formação. O número da Duimp é composto por: <br>* NN = Corresponde ao ano do registro da Declaração. <br>* AA = Corresponde à sigla do país de emissão do documento (BR).<br>* NNNNNNNNNN = 10 caracteres númericos. Número sequencial da Duimp dentro do ano.<br>* N = 1 caracter númerico. DV para todos os demais caracteres numéricos (Módulo 11)
  **/
  private String numero = null;

  @XmlElement(name="chaveAcesso")
  @ApiModelProperty(example = "21ASW000000879", value = "Código que dá acesso as informações públicas da Duimp.<br>Tamanho: 14<br>Formato: 'NNAAANNNNNNNNN'<br>Lei de formação: <br>* NN= Corresponde ao ano (2 caracteres).<br>* AAA (3 letras aleatórias).<br>* NNNNNNNNNN = 10 caracteres númericos. Número sequencial da Duimp dentro do ano.<br>* DV ( 1 número do Módulo 11).")
 /**
   * Código que dá acesso as informações públicas da Duimp.<br>Tamanho: 14<br>Formato: 'NNAAANNNNNNNNN'<br>Lei de formação: <br>* NN= Corresponde ao ano (2 caracteres).<br>* AAA (3 letras aleatórias).<br>* NNNNNNNNNN = 10 caracteres númericos. Número sequencial da Duimp dentro do ano.<br>* DV ( 1 número do Módulo 11).
  **/
  private String chaveAcesso = null;
 /**
   * &lt;br&gt;Tamanho: 15&lt;br&gt;Formato: &#39;NNAANNNNNNNNNNN&#39;&lt;br&gt;Lei de formação. O número da Duimp é composto por: &lt;br&gt;* NN &#x3D; Corresponde ao ano do registro da Declaração. &lt;br&gt;* AA &#x3D; Corresponde à sigla do país de emissão do documento (BR).&lt;br&gt;* NNNNNNNNNN &#x3D; 10 caracteres númericos. Número sequencial da Duimp dentro do ano.&lt;br&gt;* N &#x3D; 1 caracter númerico. DV para todos os demais caracteres numéricos (Módulo 11)
   * @return numero
  **/
  @JsonProperty("numero")
  public String getNumero() {
    return numero;
  }

  public void setNumero(String numero) {
    this.numero = numero;
  }

  public DuimpChaveCover numero(String numero) {
    this.numero = numero;
    return this;
  }

 /**
   * Código que dá acesso as informações públicas da Duimp.&lt;br&gt;Tamanho: 14&lt;br&gt;Formato: &#39;NNAAANNNNNNNNN&#39;&lt;br&gt;Lei de formação: &lt;br&gt;* NN&#x3D; Corresponde ao ano (2 caracteres).&lt;br&gt;* AAA (3 letras aleatórias).&lt;br&gt;* NNNNNNNNNN &#x3D; 10 caracteres númericos. Número sequencial da Duimp dentro do ano.&lt;br&gt;* DV ( 1 número do Módulo 11).
   * @return chaveAcesso
  **/
  @JsonProperty("chaveAcesso")
  public String getChaveAcesso() {
    return chaveAcesso;
  }

  public void setChaveAcesso(String chaveAcesso) {
    this.chaveAcesso = chaveAcesso;
  }

  public DuimpChaveCover chaveAcesso(String chaveAcesso) {
    this.chaveAcesso = chaveAcesso;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DuimpChaveCover {\n");
    
    sb.append("    numero: ").append(toIndentedString(numero)).append("\n");
    sb.append("    chaveAcesso: ").append(toIndentedString(chaveAcesso)).append("\n");
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

