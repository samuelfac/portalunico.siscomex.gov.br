package br.gov.siscomex.portalunico.talpco.model;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "AlterarSituacaoLpcoResponse", propOrder =
    { "numero"
})

@XmlRootElement(name="AlterarSituacaoLpcoResponse")
/**
  * Resposta de uma solicitação de alteração de situação de um LPCO
 **/
@ApiModel(description="Resposta de uma solicitação de alteração de situação de um LPCO")
public class AlterarSituacaoLpcoResponse  {
  
  @XmlElement(name="numero", required = true)
  @ApiModelProperty(example = "E1900000123", required = true, value = "Número do LPCO que teve a siutação alterada<br>Tamanho: 11<br>Formato: OAANNNNNNNN<br>Lei de formação: O número do LPCO é composto por:<br>* O = Operação (E para exportação, I para importação)<br>* AA = Ano do registro do LPCO<br>* NNNNNNNN = Número sequencial do LPCO no ano")
 /**
   * Número do LPCO que teve a siutação alterada<br>Tamanho: 11<br>Formato: OAANNNNNNNN<br>Lei de formação: O número do LPCO é composto por:<br>* O = Operação (E para exportação, I para importação)<br>* AA = Ano do registro do LPCO<br>* NNNNNNNN = Número sequencial do LPCO no ano
  **/
  private String numero = null;
 /**
   * Número do LPCO que teve a siutação alterada&lt;br&gt;Tamanho: 11&lt;br&gt;Formato: OAANNNNNNNN&lt;br&gt;Lei de formação: O número do LPCO é composto por:&lt;br&gt;* O &#x3D; Operação (E para exportação, I para importação)&lt;br&gt;* AA &#x3D; Ano do registro do LPCO&lt;br&gt;* NNNNNNNN &#x3D; Número sequencial do LPCO no ano
   * @return numero
  **/
  @JsonProperty("numero")
  @NotNull
  public String getNumero() {
    return numero;
  }

  public void setNumero(String numero) {
    this.numero = numero;
  }

  public AlterarSituacaoLpcoResponse numero(String numero) {
    this.numero = numero;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlterarSituacaoLpcoResponse {\n");
    
    sb.append("    numero: ").append(toIndentedString(numero)).append("\n");
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

