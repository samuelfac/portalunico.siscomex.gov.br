package br.gov.siscomex.portalunico.talpco.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.*;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "ItemLpcoResponse", propOrder =
    { "numeroItem", "ncm", "listaCamposNcm", "listaAtributosNcm", "produto", "identificadorCota", "criterioDistribuicaoCota", "parcelaDistribuicaoCota"
})

@XmlRootElement(name="ItemLpcoResponse")
/**
  * Dados de um item de um LPCO
 **/
@ApiModel(description="Dados de um item de um LPCO")
public class ItemLpcoResponse  {
  
  @XmlElement(name="numeroItem", required = true)
  @ApiModelProperty(example = "1", required = true, value = "Número sequencial do item do LPCO.")
 /**
   * Número sequencial do item do LPCO.
  **/
  private Integer numeroItem = null;

  @XmlElement(name="ncm", required = true)
  @ApiModelProperty(example = "01012100", required = true, value = "Código da NCM do item do LPCO.<br>Tamanho: 8<br>Formato: NNNNNNNN")
 /**
   * Código da NCM do item do LPCO.<br>Tamanho: 8<br>Formato: NNNNNNNN
  **/
  private String ncm = null;

  @XmlElement(name="listaCamposNcm")
  @ApiModelProperty(value = " Lista de campos de cada item do LPCO exigidos pelo modelo.")
  @Valid
 /**
   *  Lista de campos de cada item do LPCO exigidos pelo modelo.
  **/
  private List<CampoLpcoResponse> listaCamposNcm = null;

  @XmlElement(name="listaAtributosNcm")
  @ApiModelProperty(value = "Lista de atributos dinâmicos da NCM (varia de NCM para NCM). Essa lista de atributos da NCM pode ser obtida no endpoint /ext/lpco/modelo/{codigoModelo}/{ncm}.")
  @Valid
 /**
   * Lista de atributos dinâmicos da NCM (varia de NCM para NCM). Essa lista de atributos da NCM pode ser obtida no endpoint /ext/lpco/modelo/{codigoModelo}/{ncm}.
  **/
  private List<CampoLpcoResponse> listaAtributosNcm = null;

  @XmlElement(name="produto")
  @ApiModelProperty(value = "")
  @Valid
  private Produto produto = null;

  @XmlElement(name="identificadorCota")
  @ApiModelProperty(example = "I00085-01-01", value = "Identificador da cota")
 /**
   * Identificador da cota
  **/
  private String identificadorCota = null;

  @XmlElement(name="criterioDistribuicaoCota")
  @ApiModelProperty(example = "Performance", value = "Critério de distribuição da cota")
 /**
   * Critério de distribuição da cota
  **/
  private String criterioDistribuicaoCota = null;

  @XmlElement(name="parcelaDistribuicaoCota")
  @ApiModelProperty(example = "Ordem de registro", value = "Parcela de distribuição da cota")
 /**
   * Parcela de distribuição da cota
  **/
  private String parcelaDistribuicaoCota = null;
 /**
   * Número sequencial do item do LPCO.
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

  public ItemLpcoResponse numeroItem(Integer numeroItem) {
    this.numeroItem = numeroItem;
    return this;
  }

 /**
   * Código da NCM do item do LPCO.&lt;br&gt;Tamanho: 8&lt;br&gt;Formato: NNNNNNNN
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

  public ItemLpcoResponse ncm(String ncm) {
    this.ncm = ncm;
    return this;
  }

 /**
   *  Lista de campos de cada item do LPCO exigidos pelo modelo.
   * @return listaCamposNcm
  **/
  @JsonProperty("listaCamposNcm")
  public List<CampoLpcoResponse> getListaCamposNcm() {
    return listaCamposNcm;
  }

  public void setListaCamposNcm(List<CampoLpcoResponse> listaCamposNcm) {
    this.listaCamposNcm = listaCamposNcm;
  }

  public ItemLpcoResponse listaCamposNcm(List<CampoLpcoResponse> listaCamposNcm) {
    this.listaCamposNcm = listaCamposNcm;
    return this;
  }

  public ItemLpcoResponse addListaCamposNcmItem(CampoLpcoResponse listaCamposNcmItem) {
    this.listaCamposNcm.add(listaCamposNcmItem);
    return this;
  }

 /**
   * Lista de atributos dinâmicos da NCM (varia de NCM para NCM). Essa lista de atributos da NCM pode ser obtida no endpoint /ext/lpco/modelo/{codigoModelo}/{ncm}.
   * @return listaAtributosNcm
  **/
  @JsonProperty("listaAtributosNcm")
  public List<CampoLpcoResponse> getListaAtributosNcm() {
    return listaAtributosNcm;
  }

  public void setListaAtributosNcm(List<CampoLpcoResponse> listaAtributosNcm) {
    this.listaAtributosNcm = listaAtributosNcm;
  }

  public ItemLpcoResponse listaAtributosNcm(List<CampoLpcoResponse> listaAtributosNcm) {
    this.listaAtributosNcm = listaAtributosNcm;
    return this;
  }

  public ItemLpcoResponse addListaAtributosNcmItem(CampoLpcoResponse listaAtributosNcmItem) {
    this.listaAtributosNcm.add(listaAtributosNcmItem);
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

  public ItemLpcoResponse produto(Produto produto) {
    this.produto = produto;
    return this;
  }

 /**
   * Identificador da cota
   * @return identificadorCota
  **/
  @JsonProperty("identificadorCota")
  public String getIdentificadorCota() {
    return identificadorCota;
  }

  public void setIdentificadorCota(String identificadorCota) {
    this.identificadorCota = identificadorCota;
  }

  public ItemLpcoResponse identificadorCota(String identificadorCota) {
    this.identificadorCota = identificadorCota;
    return this;
  }

 /**
   * Critério de distribuição da cota
   * @return criterioDistribuicaoCota
  **/
  @JsonProperty("criterioDistribuicaoCota")
  public String getCriterioDistribuicaoCota() {
    return criterioDistribuicaoCota;
  }

  public void setCriterioDistribuicaoCota(String criterioDistribuicaoCota) {
    this.criterioDistribuicaoCota = criterioDistribuicaoCota;
  }

  public ItemLpcoResponse criterioDistribuicaoCota(String criterioDistribuicaoCota) {
    this.criterioDistribuicaoCota = criterioDistribuicaoCota;
    return this;
  }

 /**
   * Parcela de distribuição da cota
   * @return parcelaDistribuicaoCota
  **/
  @JsonProperty("parcelaDistribuicaoCota")
  public String getParcelaDistribuicaoCota() {
    return parcelaDistribuicaoCota;
  }

  public void setParcelaDistribuicaoCota(String parcelaDistribuicaoCota) {
    this.parcelaDistribuicaoCota = parcelaDistribuicaoCota;
  }

  public ItemLpcoResponse parcelaDistribuicaoCota(String parcelaDistribuicaoCota) {
    this.parcelaDistribuicaoCota = parcelaDistribuicaoCota;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemLpcoResponse {\n");
    
    sb.append("    numeroItem: ").append(toIndentedString(numeroItem)).append("\n");
    sb.append("    ncm: ").append(toIndentedString(ncm)).append("\n");
    sb.append("    listaCamposNcm: ").append(toIndentedString(listaCamposNcm)).append("\n");
    sb.append("    listaAtributosNcm: ").append(toIndentedString(listaAtributosNcm)).append("\n");
    sb.append("    produto: ").append(toIndentedString(produto)).append("\n");
    sb.append("    identificadorCota: ").append(toIndentedString(identificadorCota)).append("\n");
    sb.append("    criterioDistribuicaoCota: ").append(toIndentedString(criterioDistribuicaoCota)).append("\n");
    sb.append("    parcelaDistribuicaoCota: ").append(toIndentedString(parcelaDistribuicaoCota)).append("\n");
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

