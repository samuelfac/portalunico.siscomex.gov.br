package br.gov.siscomex.portalunico.duimp_api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "UnidadeDeclaradaCover", propOrder =
    { "codigo"
})

@XmlRootElement(name="UnidadeDeclaradaCover")
/**
  * Unidade de Despacho.
 **/
@ApiModel(description="Unidade de Despacho.")
public class UnidadeDeclaradaCover  {
  
  @XmlElement(name="codigo", required = true)
  @ApiModelProperty(example = "7912001", required = true, value = "Código da unidade da RFB na qual as mercadorias acobertadas pela Duimp serão submetidas a conferência aduaneira.<br>Tamanho: 7<br>Formato: 'NNNNNNN'<br>Origem: Sistema de Tabelas Aduaneiras - https://api-docs.portalunico.siscomex.gov.br/")
 /**
   * Código da unidade da RFB na qual as mercadorias acobertadas pela Duimp serão submetidas a conferência aduaneira.<br>Tamanho: 7<br>Formato: 'NNNNNNN'<br>Origem: Sistema de Tabelas Aduaneiras - https://api-docs.portalunico.siscomex.gov.br/
  **/
  private String codigo = null;
 /**
   * Código da unidade da RFB na qual as mercadorias acobertadas pela Duimp serão submetidas a conferência aduaneira.&lt;br&gt;Tamanho: 7&lt;br&gt;Formato: &#39;NNNNNNN&#39;&lt;br&gt;Origem: Sistema de Tabelas Aduaneiras - https://api-docs.portalunico.siscomex.gov.br/
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

  public UnidadeDeclaradaCover codigo(String codigo) {
    this.codigo = codigo;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UnidadeDeclaradaCover {\n");
    
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

