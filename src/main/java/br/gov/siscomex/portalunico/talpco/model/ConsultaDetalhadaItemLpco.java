package br.gov.siscomex.portalunico.talpco.model;

import java.util.List;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "ConsultaDetalhadaItemLpco", propOrder =
    { "campos", "cnpjRaiz", "codigoProduto", "ncm", "numeroItem", "versaoProduto"
})

@XmlRootElement(name="ConsultaDetalhadaItemLpco")
/**
  * Dados de um item de um formulário de um LPCO, exibido na consulta detalhada de LPCOs
 **/
@ApiModel(description="Dados de um item de um formulário de um LPCO, exibido na consulta detalhada de LPCOs")
public class ConsultaDetalhadaItemLpco  {
  
  @XmlElement(name="campos")
  @ApiModelProperty(value = "Campos do LPCO que fazem parte do grupo de campos")
  @Valid
 /**
   * Campos do LPCO que fazem parte do grupo de campos
  **/
  private List<ConsultaDetalhadaCampo> campos = null;

  @XmlElement(name="cnpjRaiz")
  @ApiModelProperty(example = "00055555", value = "CNPJ raiz do produto associado ao item do LPCO, caso este grupo de campos esteja associado a um item de um LPCO que utilize o Catálogo de Produtos<br>Tamanho: 8<br>Formato: NNNNNNNN")
 /**
   * CNPJ raiz do produto associado ao item do LPCO, caso este grupo de campos esteja associado a um item de um LPCO que utilize o Catálogo de Produtos<br>Tamanho: 8<br>Formato: NNNNNNNN
  **/
  private String cnpjRaiz = null;

  @XmlElement(name="codigoProduto")
  @ApiModelProperty(example = "111222333", value = "Código do produto associado ao item do LPCO, caso este grupo de campos esteja associado a um item de um LPCO que utilize o Catálogo de Produtos.")
 /**
   * Código do produto associado ao item do LPCO, caso este grupo de campos esteja associado a um item de um LPCO que utilize o Catálogo de Produtos.
  **/
  private Long codigoProduto = null;

  @XmlElement(name="ncm")
  @ApiModelProperty(example = "11223344", value = "Número da NCM associada ao item do LPCO. Será nulo se o grupo corresponde aos dados gerais do LPCO<br>Tamanho: 8<br>Formato: NNNNNNNN")
 /**
   * Número da NCM associada ao item do LPCO. Será nulo se o grupo corresponde aos dados gerais do LPCO<br>Tamanho: 8<br>Formato: NNNNNNNN
  **/
  private String ncm = null;

  @XmlElement(name="numeroItem")
  @ApiModelProperty(example = "1", value = "Número do item do formulário do LPCO. Se for nulo, indica que são os dados gerais do LPCO.")
 /**
   * Número do item do formulário do LPCO. Se for nulo, indica que são os dados gerais do LPCO.
  **/
  private Integer numeroItem = null;

  @XmlElement(name="versaoProduto")
  @ApiModelProperty(example = "1", value = "Versão do produto associado ao item do LPCO, caso este grupo de campos esteja associado a um item de um LPCO que utilize o Catálogo de Produtos.")
 /**
   * Versão do produto associado ao item do LPCO, caso este grupo de campos esteja associado a um item de um LPCO que utilize o Catálogo de Produtos.
  **/
  private String versaoProduto = null;
 /**
   * Campos do LPCO que fazem parte do grupo de campos
   * @return campos
  **/
  @JsonProperty("campos")
  public List<ConsultaDetalhadaCampo> getCampos() {
    return campos;
  }

  public void setCampos(List<ConsultaDetalhadaCampo> campos) {
    this.campos = campos;
  }

  public ConsultaDetalhadaItemLpco campos(List<ConsultaDetalhadaCampo> campos) {
    this.campos = campos;
    return this;
  }

  public ConsultaDetalhadaItemLpco addCamposItem(ConsultaDetalhadaCampo camposItem) {
    this.campos.add(camposItem);
    return this;
  }

 /**
   * CNPJ raiz do produto associado ao item do LPCO, caso este grupo de campos esteja associado a um item de um LPCO que utilize o Catálogo de Produtos&lt;br&gt;Tamanho: 8&lt;br&gt;Formato: NNNNNNNN
   * @return cnpjRaiz
  **/
  @JsonProperty("cnpjRaiz")
  public String getCnpjRaiz() {
    return cnpjRaiz;
  }

  public void setCnpjRaiz(String cnpjRaiz) {
    this.cnpjRaiz = cnpjRaiz;
  }

  public ConsultaDetalhadaItemLpco cnpjRaiz(String cnpjRaiz) {
    this.cnpjRaiz = cnpjRaiz;
    return this;
  }

 /**
   * Código do produto associado ao item do LPCO, caso este grupo de campos esteja associado a um item de um LPCO que utilize o Catálogo de Produtos.
   * @return codigoProduto
  **/
  @JsonProperty("codigoProduto")
  public Long getCodigoProduto() {
    return codigoProduto;
  }

  public void setCodigoProduto(Long codigoProduto) {
    this.codigoProduto = codigoProduto;
  }

  public ConsultaDetalhadaItemLpco codigoProduto(Long codigoProduto) {
    this.codigoProduto = codigoProduto;
    return this;
  }

 /**
   * Número da NCM associada ao item do LPCO. Será nulo se o grupo corresponde aos dados gerais do LPCO&lt;br&gt;Tamanho: 8&lt;br&gt;Formato: NNNNNNNN
   * @return ncm
  **/
  @JsonProperty("ncm")
  public String getNcm() {
    return ncm;
  }

  public void setNcm(String ncm) {
    this.ncm = ncm;
  }

  public ConsultaDetalhadaItemLpco ncm(String ncm) {
    this.ncm = ncm;
    return this;
  }

 /**
   * Número do item do formulário do LPCO. Se for nulo, indica que são os dados gerais do LPCO.
   * @return numeroItem
  **/
  @JsonProperty("numeroItem")
  public Integer getNumeroItem() {
    return numeroItem;
  }

  public void setNumeroItem(Integer numeroItem) {
    this.numeroItem = numeroItem;
  }

  public ConsultaDetalhadaItemLpco numeroItem(Integer numeroItem) {
    this.numeroItem = numeroItem;
    return this;
  }

 /**
   * Versão do produto associado ao item do LPCO, caso este grupo de campos esteja associado a um item de um LPCO que utilize o Catálogo de Produtos.
   * @return versaoProduto
  **/
  @JsonProperty("versaoProduto")
  public String getVersaoProduto() {
    return versaoProduto;
  }

  public void setVersaoProduto(String versaoProduto) {
    this.versaoProduto = versaoProduto;
  }

  public ConsultaDetalhadaItemLpco versaoProduto(String versaoProduto) {
    this.versaoProduto = versaoProduto;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsultaDetalhadaItemLpco {\n");
    
    sb.append("    campos: ").append(toIndentedString(campos)).append("\n");
    sb.append("    cnpjRaiz: ").append(toIndentedString(cnpjRaiz)).append("\n");
    sb.append("    codigoProduto: ").append(toIndentedString(codigoProduto)).append("\n");
    sb.append("    ncm: ").append(toIndentedString(ncm)).append("\n");
    sb.append("    numeroItem: ").append(toIndentedString(numeroItem)).append("\n");
    sb.append("    versaoProduto: ").append(toIndentedString(versaoProduto)).append("\n");
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

