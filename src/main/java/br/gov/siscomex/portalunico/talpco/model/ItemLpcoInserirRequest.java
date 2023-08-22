package br.gov.siscomex.portalunico.talpco.model;

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
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "ItemLpcoInserirRequest", propOrder =
    { "ncm", "produto", "listaCamposNcm", "listaAtributosNcm"
})

@XmlRootElement(name="ItemLpcoInserirRequest")
/**
  * Dados um item de um LPCO a ser cadastrado
 **/
@ApiModel(description="Dados um item de um LPCO a ser cadastrado")
public class ItemLpcoInserirRequest  {
  
  @XmlElement(name="ncm", required = true)
  @ApiModelProperty(example = "01012100", required = true, value = "Código da NCM do item do LPCO.<br>Tamanho: 8<br>Formato: NNNNNNNN")
 /**
   * Código da NCM do item do LPCO.<br>Tamanho: 8<br>Formato: NNNNNNNN
  **/
  private String ncm = null;

  @XmlElement(name="produto")
  @ApiModelProperty(value = "")
  @Valid
  private Produto produto = null;

  @XmlElement(name="listaCamposNcm")
  @ApiModelProperty(value = "Lista de campos de cada item do LPCO exigidos pelo modelo. Para campos de valor composto (como Fabricante/Produtor, Exportador estrangeiro, Exportador é o fabricante do Produto, Fundamento legal, Indicação de importação para terceiros), verifique a estrutura específica de valor do campo.")
  @Valid
 /**
   * Lista de campos de cada item do LPCO exigidos pelo modelo. Para campos de valor composto (como Fabricante/Produtor, Exportador estrangeiro, Exportador é o fabricante do Produto, Fundamento legal, Indicação de importação para terceiros), verifique a estrutura específica de valor do campo.
  **/
  private List<CampoLpcoRequest> listaCamposNcm = null;

  @XmlElement(name="listaAtributosNcm")
  @ApiModelProperty(value = "Lista de atributos dinâmicos da NCM (varia de NCM para NCM). Essa lista de atributos da NCM pode ser obtida no endpoint /ext/lpco/modelo/{codigoModelo}/{ncm}.")
  @Valid
 /**
   * Lista de atributos dinâmicos da NCM (varia de NCM para NCM). Essa lista de atributos da NCM pode ser obtida no endpoint /ext/lpco/modelo/{codigoModelo}/{ncm}.
  **/
  private List<CampoLpcoRequest> listaAtributosNcm = null;
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

  public ItemLpcoInserirRequest ncm(String ncm) {
    this.ncm = ncm;
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

  public ItemLpcoInserirRequest produto(Produto produto) {
    this.produto = produto;
    return this;
  }

 /**
   * Lista de campos de cada item do LPCO exigidos pelo modelo. Para campos de valor composto (como Fabricante/Produtor, Exportador estrangeiro, Exportador é o fabricante do Produto, Fundamento legal, Indicação de importação para terceiros), verifique a estrutura específica de valor do campo.
   * @return listaCamposNcm
  **/
  @JsonProperty("listaCamposNcm")
  public List<CampoLpcoRequest> getListaCamposNcm() {
    return listaCamposNcm;
  }

  public void setListaCamposNcm(List<CampoLpcoRequest> listaCamposNcm) {
    this.listaCamposNcm = listaCamposNcm;
  }

  public ItemLpcoInserirRequest listaCamposNcm(List<CampoLpcoRequest> listaCamposNcm) {
    this.listaCamposNcm = listaCamposNcm;
    return this;
  }

  public ItemLpcoInserirRequest addListaCamposNcmItem(CampoLpcoRequest listaCamposNcmItem) {
    this.listaCamposNcm.add(listaCamposNcmItem);
    return this;
  }

 /**
   * Lista de atributos dinâmicos da NCM (varia de NCM para NCM). Essa lista de atributos da NCM pode ser obtida no endpoint /ext/lpco/modelo/{codigoModelo}/{ncm}.
   * @return listaAtributosNcm
  **/
  @JsonProperty("listaAtributosNcm")
  public List<CampoLpcoRequest> getListaAtributosNcm() {
    return listaAtributosNcm;
  }

  public void setListaAtributosNcm(List<CampoLpcoRequest> listaAtributosNcm) {
    this.listaAtributosNcm = listaAtributosNcm;
  }

  public ItemLpcoInserirRequest listaAtributosNcm(List<CampoLpcoRequest> listaAtributosNcm) {
    this.listaAtributosNcm = listaAtributosNcm;
    return this;
  }

  public ItemLpcoInserirRequest addListaAtributosNcmItem(CampoLpcoRequest listaAtributosNcmItem) {
    this.listaAtributosNcm.add(listaAtributosNcmItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemLpcoInserirRequest {\n");
    
    sb.append("    ncm: ").append(toIndentedString(ncm)).append("\n");
    sb.append("    produto: ").append(toIndentedString(produto)).append("\n");
    sb.append("    listaCamposNcm: ").append(toIndentedString(listaCamposNcm)).append("\n");
    sb.append("    listaAtributosNcm: ").append(toIndentedString(listaAtributosNcm)).append("\n");
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

