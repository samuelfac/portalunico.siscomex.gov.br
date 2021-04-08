package br.gov.siscomex.portalunico.talpco.model;

import java.util.List;

import javax.validation.Valid;
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
 @XmlType(name = "ItemNcmLpcoResponse", propOrder =
    { "listaAtributosNcm", "listaCamposNcm", "ncm", "numeroItem", "produto", "unidadeMedidaComercializada"
})

@XmlRootElement(name="ItemNcmLpcoResponse")
/**
  * Dados de um item de um LPCO
 **/
@ApiModel(description="Dados de um item de um LPCO")
public class ItemNcmLpcoResponse  {
  
  @XmlElement(name="listaAtributosNcm")
  @ApiModelProperty(value = "Lista de atributos do item NCM declarado no LPCO.")
  @Valid
 /**
   * Lista de atributos do item NCM declarado no LPCO.
  **/
  private List<CampoLpcoResponse> listaAtributosNcm = null;

  @XmlElement(name="listaCamposNcm")
  @ApiModelProperty(value = "Lista de campos do item NCM declarado no LPCO.")
  @Valid
 /**
   * Lista de campos do item NCM declarado no LPCO.
  **/
  private List<CampoLpcoResponse> listaCamposNcm = null;

  @XmlElement(name="ncm", required = true)
  @ApiModelProperty(example = "01012100", required = true, value = "Número da NCM do item do LPCO<br>Tamanho: 8<br>Formato: NNNNNNNN")
 /**
   * Número da NCM do item do LPCO<br>Tamanho: 8<br>Formato: NNNNNNNN
  **/
  private String ncm = null;

  @XmlElement(name="numeroItem", required = true)
  @ApiModelProperty(example = "1", required = true, value = "Número sequencial do item adicionado ao LPCO")
 /**
   * Número sequencial do item adicionado ao LPCO
  **/
  private Integer numeroItem = null;

  @XmlElement(name="produto")
  @ApiModelProperty(value = "")
  @Valid
  private Produto produto = null;

  @XmlElement(name="unidadeMedidaComercializada")
  @ApiModelProperty(value = "DESCONTINUADO. Utilize o campo unidade do campo QTD_COMERCIALIZADA")
 /**
   * DESCONTINUADO. Utilize o campo unidade do campo QTD_COMERCIALIZADA
  **/
  private String unidadeMedidaComercializada = null;
 /**
   * Lista de atributos do item NCM declarado no LPCO.
   * @return listaAtributosNcm
  **/
  @JsonProperty("listaAtributosNcm")
  public List<CampoLpcoResponse> getListaAtributosNcm() {
    return listaAtributosNcm;
  }

  public void setListaAtributosNcm(List<CampoLpcoResponse> listaAtributosNcm) {
    this.listaAtributosNcm = listaAtributosNcm;
  }

  public ItemNcmLpcoResponse listaAtributosNcm(List<CampoLpcoResponse> listaAtributosNcm) {
    this.listaAtributosNcm = listaAtributosNcm;
    return this;
  }

  public ItemNcmLpcoResponse addListaAtributosNcmItem(CampoLpcoResponse listaAtributosNcmItem) {
    this.listaAtributosNcm.add(listaAtributosNcmItem);
    return this;
  }

 /**
   * Lista de campos do item NCM declarado no LPCO.
   * @return listaCamposNcm
  **/
  @JsonProperty("listaCamposNcm")
  public List<CampoLpcoResponse> getListaCamposNcm() {
    return listaCamposNcm;
  }

  public void setListaCamposNcm(List<CampoLpcoResponse> listaCamposNcm) {
    this.listaCamposNcm = listaCamposNcm;
  }

  public ItemNcmLpcoResponse listaCamposNcm(List<CampoLpcoResponse> listaCamposNcm) {
    this.listaCamposNcm = listaCamposNcm;
    return this;
  }

  public ItemNcmLpcoResponse addListaCamposNcmItem(CampoLpcoResponse listaCamposNcmItem) {
    this.listaCamposNcm.add(listaCamposNcmItem);
    return this;
  }

 /**
   * Número da NCM do item do LPCO&lt;br&gt;Tamanho: 8&lt;br&gt;Formato: NNNNNNNN
   * @return ncm
  **/
  @JsonProperty("ncm")
  @NotNull
  public String getNcm() {
    return ncm;
  }

  public void setNcm(String ncm) {
    this.ncm = ncm;
  }

  public ItemNcmLpcoResponse ncm(String ncm) {
    this.ncm = ncm;
    return this;
  }

 /**
   * Número sequencial do item adicionado ao LPCO
   * @return numeroItem
  **/
  @JsonProperty("numeroItem")
  @NotNull
  public Integer getNumeroItem() {
    return numeroItem;
  }

  public void setNumeroItem(Integer numeroItem) {
    this.numeroItem = numeroItem;
  }

  public ItemNcmLpcoResponse numeroItem(Integer numeroItem) {
    this.numeroItem = numeroItem;
    return this;
  }

 /**
   * Get produto
   * @return produto
  **/
  @JsonProperty("produto")
  public Produto getProduto() {
    return produto;
  }

  public void setProduto(Produto produto) {
    this.produto = produto;
  }

  public ItemNcmLpcoResponse produto(Produto produto) {
    this.produto = produto;
    return this;
  }

 /**
   * DESCONTINUADO. Utilize o campo unidade do campo QTD_COMERCIALIZADA
   * @return unidadeMedidaComercializada
  **/
  @JsonProperty("unidadeMedidaComercializada")
  public String getUnidadeMedidaComercializada() {
    return unidadeMedidaComercializada;
  }

  public void setUnidadeMedidaComercializada(String unidadeMedidaComercializada) {
    this.unidadeMedidaComercializada = unidadeMedidaComercializada;
  }

  public ItemNcmLpcoResponse unidadeMedidaComercializada(String unidadeMedidaComercializada) {
    this.unidadeMedidaComercializada = unidadeMedidaComercializada;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemNcmLpcoResponse {\n");
    
    sb.append("    listaAtributosNcm: ").append(toIndentedString(listaAtributosNcm)).append("\n");
    sb.append("    listaCamposNcm: ").append(toIndentedString(listaCamposNcm)).append("\n");
    sb.append("    ncm: ").append(toIndentedString(ncm)).append("\n");
    sb.append("    numeroItem: ").append(toIndentedString(numeroItem)).append("\n");
    sb.append("    produto: ").append(toIndentedString(produto)).append("\n");
    sb.append("    unidadeMedidaComercializada: ").append(toIndentedString(unidadeMedidaComercializada)).append("\n");
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

