package br.gov.siscomex.portalunico.duimp_api.model;

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
 @XmlType(name = "MoedaNegociadaCover", propOrder =
    { "codigo"
})

@XmlRootElement(name="MoedaNegociadaCover")
/**
  * Moeda utilizada para a negociação da mercadoria e usada na expedição da fatura comercial (ISO-4217).
 **/
@ApiModel(description="Moeda utilizada para a negociação da mercadoria e usada na expedição da fatura comercial (ISO-4217).")
public class MoedaNegociadaCover  {
  
  @XmlElement(name="codigo", required = true)
  @ApiModelProperty(example = "USD", required = true, value = "Código da Moeda utilizada para a negociação da mercadoria e usada na expedição da fatura comercial (ISO-4217).<br>Tamanho: 3<br>Formato: 'AAA'<br>Origem: Sistema de Tabelas Aduaneiras - https://api-docs.portalunico.siscomex.gov.br/")
 /**
   * Código da Moeda utilizada para a negociação da mercadoria e usada na expedição da fatura comercial (ISO-4217).<br>Tamanho: 3<br>Formato: 'AAA'<br>Origem: Sistema de Tabelas Aduaneiras - https://api-docs.portalunico.siscomex.gov.br/
  **/
  private String codigo = null;
 /**
   * Código da Moeda utilizada para a negociação da mercadoria e usada na expedição da fatura comercial (ISO-4217).&lt;br&gt;Tamanho: 3&lt;br&gt;Formato: &#39;AAA&#39;&lt;br&gt;Origem: Sistema de Tabelas Aduaneiras - https://api-docs.portalunico.siscomex.gov.br/
   * @return codigo
  **/
  @JsonProperty("codigo")
  @NotNull
  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public MoedaNegociadaCover codigo(String codigo) {
    this.codigo = codigo;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MoedaNegociadaCover {\n");
    
    sb.append("    codigo: ").append(toIndentedString(codigo)).append("\n");
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

