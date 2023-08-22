package br.gov.siscomex.portalunico.duimp_api.model;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "LpcoCover", propOrder =
    { "numero"
})

@XmlRootElement(name="LpcoCover")
/**
  * Lista de documentos LPCO (Licenças, Permissões, Certificados e Outros) necessários para operações de comércio exterior.<br>Origem: Sistema Tratamento Administrativo e LPCO - https://api-docs.portalunico.siscomex.gov.br/
 **/
@ApiModel(description="Lista de documentos LPCO (Licenças, Permissões, Certificados e Outros) necessários para operações de comércio exterior.<br>Origem: Sistema Tratamento Administrativo e LPCO - https://api-docs.portalunico.siscomex.gov.br/")
public class LpcoCover  {
  
  @XmlElement(name="numero")
  @ApiModelProperty(example = "I2000000063", value = "Número do um LPCO.<br>Tamanho: 11<br>Formato: 'OAANNNNNNNN'<br>Lei de formação. O número do LPCO é composto por: <br>* O = Operação (E para exportação, I para importação).<br>* AA = Ano do registro do LPCO.<br>* NNNNNNNN = 8 caracteres númericos. Número sequencial do LPCO no ano.")
 /**
   * Número do um LPCO.<br>Tamanho: 11<br>Formato: 'OAANNNNNNNN'<br>Lei de formação. O número do LPCO é composto por: <br>* O = Operação (E para exportação, I para importação).<br>* AA = Ano do registro do LPCO.<br>* NNNNNNNN = 8 caracteres númericos. Número sequencial do LPCO no ano.
  **/
  private String numero = null;
 /**
   * Número do um LPCO.&lt;br&gt;Tamanho: 11&lt;br&gt;Formato: &#39;OAANNNNNNNN&#39;&lt;br&gt;Lei de formação. O número do LPCO é composto por: &lt;br&gt;* O &#x3D; Operação (E para exportação, I para importação).&lt;br&gt;* AA &#x3D; Ano do registro do LPCO.&lt;br&gt;* NNNNNNNN &#x3D; 8 caracteres númericos. Número sequencial do LPCO no ano.
   * @return numero
  **/
  @JsonProperty("numero")
  public String getNumero() {
    return numero;
  }

  public void setNumero(String numero) {
    this.numero = numero;
  }

  public LpcoCover numero(String numero) {
    this.numero = numero;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LpcoCover {\n");
    
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

