package br.gov.siscomex.portalunico.duimp_api.model;

import br.gov.siscomex.portalunico.duimp_api.model.PaisFabricanteCover;
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
 @XmlType(name = "FabricanteCover", propOrder =
    { "codigo", "versao", "cnpjRaiz", "pais"
})

@XmlRootElement(name="FabricanteCover")
/**
  * Dados do Fabricante/Produtor<br>Origem: Sistema Catálogo de Produtos - https://api-docs.portalunico.siscomex.gov.br/
 **/
@ApiModel(description="Dados do Fabricante/Produtor<br>Origem: Sistema Catálogo de Produtos - https://api-docs.portalunico.siscomex.gov.br/")
public class FabricanteCover  {
  
  @XmlElement(name="codigo")
  @ApiModelProperty(example = "2104", value = "Código do Fabricante.<br>Tamanho mínimo: 1<br>Tamanho máximo: 35<br>Observação: Quando o país de origem for \"BR\", este atributo deverá ser preenchido com o CNPJ ou CPF do Fabricante. Quando o país de origem for diferente de \"BR\", deverá ser utilizado o código do exportador estrangeiro (TIN).")
 /**
   * Código do Fabricante.<br>Tamanho mínimo: 1<br>Tamanho máximo: 35<br>Observação: Quando o país de origem for \"BR\", este atributo deverá ser preenchido com o CNPJ ou CPF do Fabricante. Quando o país de origem for diferente de \"BR\", deverá ser utilizado o código do exportador estrangeiro (TIN).
  **/
  private String codigo = null;

  @XmlElement(name="versao")
  @ApiModelProperty(example = "1", value = "Versão do fabricante.<br>Tamanho mínimo: 0<br>Tamanho máximo: 6")
 /**
   * Versão do fabricante.<br>Tamanho mínimo: 0<br>Tamanho máximo: 6
  **/
  private String versao = null;

  @XmlElement(name="cnpjRaiz")
  @ApiModelProperty(example = "00000000", value = "CNPJ raiz da empresa responsável. Informar os 8 primeiros dígitos do CNPJ, suprimindo os pontos.<br>Tamanho: 8<br>Formato: 'NNNNNNNN'")
 /**
   * CNPJ raiz da empresa responsável. Informar os 8 primeiros dígitos do CNPJ, suprimindo os pontos.<br>Tamanho: 8<br>Formato: 'NNNNNNNN'
  **/
  private String cnpjRaiz = null;

  @XmlElement(name="pais")
  @ApiModelProperty(value = "")
  @Valid
  private PaisFabricanteCover pais = null;
 /**
   * Código do Fabricante.&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 35&lt;br&gt;Observação: Quando o país de origem for \&quot;BR\&quot;, este atributo deverá ser preenchido com o CNPJ ou CPF do Fabricante. Quando o país de origem for diferente de \&quot;BR\&quot;, deverá ser utilizado o código do exportador estrangeiro (TIN).
   * @return codigo
  **/
  @JsonProperty("codigo")
  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public FabricanteCover codigo(String codigo) {
    this.codigo = codigo;
    return this;
  }

 /**
   * Versão do fabricante.&lt;br&gt;Tamanho mínimo: 0&lt;br&gt;Tamanho máximo: 6
   * @return versao
  **/
  @JsonProperty("versao")
  public String getVersao() {
    return versao;
  }

  public void setVersao(String versao) {
    this.versao = versao;
  }

  public FabricanteCover versao(String versao) {
    this.versao = versao;
    return this;
  }

 /**
   * CNPJ raiz da empresa responsável. Informar os 8 primeiros dígitos do CNPJ, suprimindo os pontos.&lt;br&gt;Tamanho: 8&lt;br&gt;Formato: &#39;NNNNNNNN&#39;
   * @return cnpjRaiz
  **/
  @JsonProperty("cnpjRaiz")
  public String getCnpjRaiz() {
    return cnpjRaiz;
  }

  public void setCnpjRaiz(String cnpjRaiz) {
    this.cnpjRaiz = cnpjRaiz;
  }

  public FabricanteCover cnpjRaiz(String cnpjRaiz) {
    this.cnpjRaiz = cnpjRaiz;
    return this;
  }

 /**
   * Get pais
   * @return pais
  **/
  @JsonProperty("pais")
  public PaisFabricanteCover getPais() {
    return pais;
  }

  public void setPais(PaisFabricanteCover pais) {
    this.pais = pais;
  }

  public FabricanteCover pais(PaisFabricanteCover pais) {
    this.pais = pais;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FabricanteCover {\n");
    
    sb.append("    codigo: ").append(toIndentedString(codigo)).append("\n");
    sb.append("    versao: ").append(toIndentedString(versao)).append("\n");
    sb.append("    cnpjRaiz: ").append(toIndentedString(cnpjRaiz)).append("\n");
    sb.append("    pais: ").append(toIndentedString(pais)).append("\n");
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

