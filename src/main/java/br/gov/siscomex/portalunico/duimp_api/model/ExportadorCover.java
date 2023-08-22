package br.gov.siscomex.portalunico.duimp_api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "ExportadorCover", propOrder =
    { "codigo", "versao", "cnpjRaiz", "pais"
})

@XmlRootElement(name="ExportadorCover")
/**
  * Dados de Operador Estrangeiro.<br>Origem: Sistema Catálogo de Produtos - https://api-docs.portalunico.siscomex.gov.br/<br>Observação: Quando o atributo \"exportadorIndicadorFabricante\" for preenchido com o valor \"EXPORTADOR_IGUAL_FABRICANTE\", os valores informados neste grupo devem ser idênticos aos valores informados no grupo \"Fabricante\".
 **/
@ApiModel(description="Dados de Operador Estrangeiro.<br>Origem: Sistema Catálogo de Produtos - https://api-docs.portalunico.siscomex.gov.br/<br>Observação: Quando o atributo \"exportadorIndicadorFabricante\" for preenchido com o valor \"EXPORTADOR_IGUAL_FABRICANTE\", os valores informados neste grupo devem ser idênticos aos valores informados no grupo \"Fabricante\".")
public class ExportadorCover  {
  
  @XmlElement(name="codigo", required = true)
  @ApiModelProperty(example = "CN001", required = true, value = "Código do exportador estrangeiro (TIN).<br>Tamanho mínimo: 1<br>Tamanho máximo: 35")
 /**
   * Código do exportador estrangeiro (TIN).<br>Tamanho mínimo: 1<br>Tamanho máximo: 35
  **/
  private String codigo = null;

  @XmlElement(name="versao", required = true)
  @ApiModelProperty(example = "1", required = true, value = "Versão do exportador.<br>Tamanho mínimo: 0<br>Tamanho máximo: 6")
 /**
   * Versão do exportador.<br>Tamanho mínimo: 0<br>Tamanho máximo: 6
  **/
  private String versao = null;

  @XmlElement(name="cnpjRaiz", required = true)
  @ApiModelProperty(example = "00000000", required = true, value = "CNPJ raiz da empresa responsável. Informar os 8 primeiros dígitos do CNPJ, suprimindo os pontos.<br>Tamanho: 8<br>Formato: 'NNNNNNNN'")
 /**
   * CNPJ raiz da empresa responsável. Informar os 8 primeiros dígitos do CNPJ, suprimindo os pontos.<br>Tamanho: 8<br>Formato: 'NNNNNNNN'
  **/
  private String cnpjRaiz = null;

  @XmlElement(name="pais", required = true)
  @ApiModelProperty(required = true, value = "")
  @Valid
  private PaisExportadorCover pais = null;
 /**
   * Código do exportador estrangeiro (TIN).&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 35
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

  public ExportadorCover codigo(String codigo) {
    this.codigo = codigo;
    return this;
  }

 /**
   * Versão do exportador.&lt;br&gt;Tamanho mínimo: 0&lt;br&gt;Tamanho máximo: 6
   * @return versao
  **/
  @JsonProperty("versao")
  @NotNull
  public String getVersao() {
    return versao;
  }

  public void setVersao(String versao) {
    this.versao = versao;
  }

  public ExportadorCover versao(String versao) {
    this.versao = versao;
    return this;
  }

 /**
   * CNPJ raiz da empresa responsável. Informar os 8 primeiros dígitos do CNPJ, suprimindo os pontos.&lt;br&gt;Tamanho: 8&lt;br&gt;Formato: &#39;NNNNNNNN&#39;
   * @return cnpjRaiz
  **/
  @JsonProperty("cnpjRaiz")
  @NotNull
  public String getCnpjRaiz() {
    return cnpjRaiz;
  }

  public void setCnpjRaiz(String cnpjRaiz) {
    this.cnpjRaiz = cnpjRaiz;
  }

  public ExportadorCover cnpjRaiz(String cnpjRaiz) {
    this.cnpjRaiz = cnpjRaiz;
    return this;
  }

 /**
   * Get pais
   * @return pais
  **/
  @JsonProperty("pais")
  @NotNull
  public PaisExportadorCover getPais() {
    return pais;
  }

  public void setPais(PaisExportadorCover pais) {
    this.pais = pais;
  }

  public ExportadorCover pais(PaisExportadorCover pais) {
    this.pais = pais;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExportadorCover {\n");
    
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

