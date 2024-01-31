package br.gov.siscomex.portalunico.duimp_api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "IncotermCover", propOrder =
    { "codigo", "complemento"
})

@XmlRootElement(name="IncotermCover")
/**
  * Condição de Venda<br>Origem: Sistema de Tabelas Aduaneiras - https://api-docs.portalunico.siscomex.gov.br/<br>Observação: Este grupo só deve ser preenchido quando o atributo \"código do método de valoração\" for preenchido com o valor '1'.
 **/
@ApiModel(description="Condição de Venda<br>Origem: Sistema de Tabelas Aduaneiras - https://api-docs.portalunico.siscomex.gov.br/<br>Observação: Este grupo só deve ser preenchido quando o atributo \"código do método de valoração\" for preenchido com o valor '1'.")
public class IncotermCover  {
  
  @XmlElement(name="codigo")
  @ApiModelProperty(example = "FOB", value = "Código da Condição de Venda (Código INCOTERM).<br>Tamanho: 3<br>Domínio: EXW, FAS, FCA, FOB, OCV, C+F, CFR, CPT, C+I, DAT, CIF, CIP, DAP")
 /**
   * Código da Condição de Venda (Código INCOTERM).<br>Tamanho: 3<br>Domínio: EXW, FAS, FCA, FOB, OCV, C+F, CFR, CPT, C+I, DAT, CIF, CIP, DAP
  **/
  private String codigo = null;

  @XmlElement(name="complemento")
  @ApiModelProperty(example = "1", value = "Descrição complementar da condição de venda.<br>Tamanho mínimo: 0<br>Tamanho máximo: 250")
 /**
   * Descrição complementar da condição de venda.<br>Tamanho mínimo: 0<br>Tamanho máximo: 250
  **/
  private String complemento = null;
 /**
   * Código da Condição de Venda (Código INCOTERM).&lt;br&gt;Tamanho: 3&lt;br&gt;Domínio: EXW, FAS, FCA, FOB, OCV, C+F, CFR, CPT, C+I, DAT, CIF, CIP, DAP
   * @return codigo
  **/
  @JsonProperty("codigo")
  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public IncotermCover codigo(String codigo) {
    this.codigo = codigo;
    return this;
  }

 /**
   * Descrição complementar da condição de venda.&lt;br&gt;Tamanho mínimo: 0&lt;br&gt;Tamanho máximo: 250
   * @return complemento
  **/
  @JsonProperty("complemento")
  public String getComplemento() {
    return complemento;
  }

  public void setComplemento(String complemento) {
    this.complemento = complemento;
  }

  public IncotermCover complemento(String complemento) {
    this.complemento = complemento;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncotermCover {\n");
    
    sb.append("    codigo: ").append(toIndentedString(codigo)).append("\n");
    sb.append("    complemento: ").append(toIndentedString(complemento)).append("\n");
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

