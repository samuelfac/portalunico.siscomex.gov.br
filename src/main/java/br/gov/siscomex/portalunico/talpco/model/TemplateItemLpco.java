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
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "TemplateItemLpco", propOrder =
    { "ncm", "descricaoNcm", "listaCamposNcm", "listaAtributosNcm", "unidadeMedidaEstatistica"
})

@XmlRootElement(name="TemplateItemLpco")
/**
  * Template que especifica a estrutura de um item de um formulário de um LPCO
 **/
@ApiModel(description="Template que especifica a estrutura de um item de um formulário de um LPCO")
public class TemplateItemLpco  {
  
  @XmlElement(name="ncm", required = true)
  @ApiModelProperty(example = "08051000", required = true, value = "Código NCM informado para pesquisa do modelo<br>Tamanho: 8<br>Formato: NNNNNNNN")
 /**
   * Código NCM informado para pesquisa do modelo<br>Tamanho: 8<br>Formato: NNNNNNNN
  **/
  private String ncm = null;

  @XmlElement(name="descricaoNcm", required = true)
  @ApiModelProperty(example = "- LARANJAS", required = true, value = "Descrição do NCM informado para pesquisa do modelo")
 /**
   * Descrição do NCM informado para pesquisa do modelo
  **/
  private String descricaoNcm = null;

  @XmlElement(name="listaCamposNcm", required = true)
  @ApiModelProperty(required = true, value = "Lista de definições de campos a serem preenchidos por NCM")
  @Valid
 /**
   * Lista de definições de campos a serem preenchidos por NCM
  **/
  private List<CampoFormulario> listaCamposNcm = new ArrayList<>();

  @XmlElement(name="listaAtributosNcm", required = true)
  @ApiModelProperty(required = true, value = "Lista de definições dos atributos exigidos para o o NCM no formulário")
  @Valid
 /**
   * Lista de definições dos atributos exigidos para o o NCM no formulário
  **/
  private List<CampoFormulario> listaAtributosNcm = new ArrayList<>();

  @XmlElement(name="unidadeMedidaEstatistica")
  @ApiModelProperty(value = "Unidade de medida estatística utilizada para esta NCM. É um campo apenas informativo, e não precisa ser enviado no atributo \"unidadeMedida\" do campo QTD_ESTATISTICA na inclusão/alteração do LPCO<br>Tamanho mínimo: 1<br>Tamanho máximo: 60")
 /**
   * Unidade de medida estatística utilizada para esta NCM. É um campo apenas informativo, e não precisa ser enviado no atributo \"unidadeMedida\" do campo QTD_ESTATISTICA na inclusão/alteração do LPCO<br>Tamanho mínimo: 1<br>Tamanho máximo: 60
  **/
  private String unidadeMedidaEstatistica = null;
 /**
   * Código NCM informado para pesquisa do modelo&lt;br&gt;Tamanho: 8&lt;br&gt;Formato: NNNNNNNN
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

  public TemplateItemLpco ncm(String ncm) {
    this.ncm = ncm;
    return this;
  }

 /**
   * Descrição do NCM informado para pesquisa do modelo
   * @return descricaoNcm
  **/
  @JsonProperty("descricaoNcm")
  @NotNull
  public String getDescricaoNcm() {
    return descricaoNcm;
  }

  public void setDescricaoNcm(String descricaoNcm) {
    this.descricaoNcm = descricaoNcm;
  }

  public TemplateItemLpco descricaoNcm(String descricaoNcm) {
    this.descricaoNcm = descricaoNcm;
    return this;
  }

 /**
   * Lista de definições de campos a serem preenchidos por NCM
   * @return listaCamposNcm
  **/
  @JsonProperty("listaCamposNcm")
  @NotNull
  public List<CampoFormulario> getListaCamposNcm() {
    return listaCamposNcm;
  }

  public void setListaCamposNcm(List<CampoFormulario> listaCamposNcm) {
    this.listaCamposNcm = listaCamposNcm;
  }

  public TemplateItemLpco listaCamposNcm(List<CampoFormulario> listaCamposNcm) {
    this.listaCamposNcm = listaCamposNcm;
    return this;
  }

  public TemplateItemLpco addListaCamposNcmItem(CampoFormulario listaCamposNcmItem) {
    this.listaCamposNcm.add(listaCamposNcmItem);
    return this;
  }

 /**
   * Lista de definições dos atributos exigidos para o o NCM no formulário
   * @return listaAtributosNcm
  **/
  @JsonProperty("listaAtributosNcm")
  @NotNull
  public List<CampoFormulario> getListaAtributosNcm() {
    return listaAtributosNcm;
  }

  public void setListaAtributosNcm(List<CampoFormulario> listaAtributosNcm) {
    this.listaAtributosNcm = listaAtributosNcm;
  }

  public TemplateItemLpco listaAtributosNcm(List<CampoFormulario> listaAtributosNcm) {
    this.listaAtributosNcm = listaAtributosNcm;
    return this;
  }

  public TemplateItemLpco addListaAtributosNcmItem(CampoFormulario listaAtributosNcmItem) {
    this.listaAtributosNcm.add(listaAtributosNcmItem);
    return this;
  }

 /**
   * Unidade de medida estatística utilizada para esta NCM. É um campo apenas informativo, e não precisa ser enviado no atributo \&quot;unidadeMedida\&quot; do campo QTD_ESTATISTICA na inclusão/alteração do LPCO&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 60
   * @return unidadeMedidaEstatistica
  **/
  @JsonProperty("unidadeMedidaEstatistica")
  public String getUnidadeMedidaEstatistica() {
    return unidadeMedidaEstatistica;
  }

  public void setUnidadeMedidaEstatistica(String unidadeMedidaEstatistica) {
    this.unidadeMedidaEstatistica = unidadeMedidaEstatistica;
  }

  public TemplateItemLpco unidadeMedidaEstatistica(String unidadeMedidaEstatistica) {
    this.unidadeMedidaEstatistica = unidadeMedidaEstatistica;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateItemLpco {\n");
    
    sb.append("    ncm: ").append(toIndentedString(ncm)).append("\n");
    sb.append("    descricaoNcm: ").append(toIndentedString(descricaoNcm)).append("\n");
    sb.append("    listaCamposNcm: ").append(toIndentedString(listaCamposNcm)).append("\n");
    sb.append("    listaAtributosNcm: ").append(toIndentedString(listaAtributosNcm)).append("\n");
    sb.append("    unidadeMedidaEstatistica: ").append(toIndentedString(unidadeMedidaEstatistica)).append("\n");
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

