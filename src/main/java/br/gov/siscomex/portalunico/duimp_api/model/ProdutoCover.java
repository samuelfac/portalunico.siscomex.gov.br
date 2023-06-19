package br.gov.siscomex.portalunico.duimp_api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "ProdutoCover", propOrder =
    { "codigo", "versao", "cnpjRaiz"
})

@XmlRootElement(name="ProdutoCover")
/**
  * Dados do Produto.<br>Origem: Sistema Catálogo de Produtos - https://api-docs.portalunico.siscomex.gov.br/
 **/
@ApiModel(description="Dados do Produto.<br>Origem: Sistema Catálogo de Produtos - https://api-docs.portalunico.siscomex.gov.br/")
public class ProdutoCover  {
  
  @XmlElement(name="codigo")
  @ApiModelProperty(example = "10", value = "Código do produto.<br>Formato: Inteiro, com até 10 dígitos")
 /**
   * Código do produto.<br>Formato: Inteiro, com até 10 dígitos
  **/
  private Integer codigo = null;

  @XmlElement(name="versao")
  @ApiModelProperty(example = "1", value = "Versão do produto.<br>Tamanho mínimo: 1<br>Tamanho máximo: 7")
 /**
   * Versão do produto.<br>Tamanho mínimo: 1<br>Tamanho máximo: 7
  **/
  private String versao = null;

  @XmlElement(name="cnpjRaiz")
  @ApiModelProperty(example = "00000000", value = "Cnpj raiz do operador estrangeiro.<br>Tamanho: 8<br>Formato: 'NNNNNNNN'")
 /**
   * Cnpj raiz do operador estrangeiro.<br>Tamanho: 8<br>Formato: 'NNNNNNNN'
  **/
  private String cnpjRaiz = null;
 /**
   * Código do produto.&lt;br&gt;Formato: Inteiro, com até 10 dígitos
   * @return codigo
  **/
  @JsonProperty("codigo")
  public Integer getCodigo() {
    return codigo;
  }

  public void setCodigo(Integer codigo) {
    this.codigo = codigo;
  }

  public ProdutoCover codigo(Integer codigo) {
    this.codigo = codigo;
    return this;
  }

 /**
   * Versão do produto.&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 7
   * @return versao
  **/
  @JsonProperty("versao")
  public String getVersao() {
    return versao;
  }

  public void setVersao(String versao) {
    this.versao = versao;
  }

  public ProdutoCover versao(String versao) {
    this.versao = versao;
    return this;
  }

 /**
   * Cnpj raiz do operador estrangeiro.&lt;br&gt;Tamanho: 8&lt;br&gt;Formato: &#39;NNNNNNNN&#39;
   * @return cnpjRaiz
  **/
  @JsonProperty("cnpjRaiz")
  public String getCnpjRaiz() {
    return cnpjRaiz;
  }

  public void setCnpjRaiz(String cnpjRaiz) {
    this.cnpjRaiz = cnpjRaiz;
  }

  public ProdutoCover cnpjRaiz(String cnpjRaiz) {
    this.cnpjRaiz = cnpjRaiz;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProdutoCover {\n");
    
    sb.append("    codigo: ").append(toIndentedString(codigo)).append("\n");
    sb.append("    versao: ").append(toIndentedString(versao)).append("\n");
    sb.append("    cnpjRaiz: ").append(toIndentedString(cnpjRaiz)).append("\n");
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

