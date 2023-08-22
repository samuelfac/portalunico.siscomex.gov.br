package br.gov.siscomex.portalunico.ccta.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "ItemCargaConhecimentoConsultaDetalhada", propOrder =
    { "classificacoesMercadoria", "descricaoMercadoria", "ulds"
})

@XmlRootElement(name="ItemCargaConhecimentoConsultaDetalhada")
public class ItemCargaConhecimentoConsultaDetalhada  {
  
  @XmlElement(name="classificacoesMercadoria")
  @ApiModelProperty(example = "877887", value = "Código de classificação da mercadoria<br/>Tamanho: 18")
  @Valid
 /**
   * Código de classificação da mercadoria<br/>Tamanho: 18
  **/
  private List<ClassificacaoMercadoriaConsultaDetalhada> classificacoesMercadoria = null;

  @XmlElement(name="descricaoMercadoria")
  @ApiModelProperty(example = "Descrição completa das mercadorias", value = "Descrição completa das mercadorias que estão sendo transportadas<br>Tamanho: 600<br/>")
 /**
   * Descrição completa das mercadorias que estão sendo transportadas<br>Tamanho: 600<br/>
  **/
  private String descricaoMercadoria = null;

  @XmlElement(name="ulds")
  @ApiModelProperty(value = "Lista contendo as Ulds da carga<br/>")
  @Valid
 /**
   * Lista contendo as Ulds da carga<br/>
  **/
  private List<UldBlkConsultaDetalhada> ulds = null;
 /**
   * Código de classificação da mercadoria&lt;br/&gt;Tamanho: 18
   * @return classificacoesMercadoria
  **/
  @JsonProperty("classificacoesMercadoria")
  public List<ClassificacaoMercadoriaConsultaDetalhada> getClassificacoesMercadoria() {
    return classificacoesMercadoria;
  }

  public void setClassificacoesMercadoria(List<ClassificacaoMercadoriaConsultaDetalhada> classificacoesMercadoria) {
    this.classificacoesMercadoria = classificacoesMercadoria;
  }

  public ItemCargaConhecimentoConsultaDetalhada classificacoesMercadoria(List<ClassificacaoMercadoriaConsultaDetalhada> classificacoesMercadoria) {
    this.classificacoesMercadoria = classificacoesMercadoria;
    return this;
  }

  public ItemCargaConhecimentoConsultaDetalhada addClassificacoesMercadoriaItem(ClassificacaoMercadoriaConsultaDetalhada classificacoesMercadoriaItem) {
    this.classificacoesMercadoria.add(classificacoesMercadoriaItem);
    return this;
  }

 /**
   * Descrição completa das mercadorias que estão sendo transportadas&lt;br&gt;Tamanho: 600&lt;br/&gt;
   * @return descricaoMercadoria
  **/
  @JsonProperty("descricaoMercadoria")
  public String getDescricaoMercadoria() {
    return descricaoMercadoria;
  }

  public void setDescricaoMercadoria(String descricaoMercadoria) {
    this.descricaoMercadoria = descricaoMercadoria;
  }

  public ItemCargaConhecimentoConsultaDetalhada descricaoMercadoria(String descricaoMercadoria) {
    this.descricaoMercadoria = descricaoMercadoria;
    return this;
  }

 /**
   * Lista contendo as Ulds da carga&lt;br/&gt;
   * @return ulds
  **/
  @JsonProperty("ulds")
  public List<UldBlkConsultaDetalhada> getUlds() {
    return ulds;
  }

  public void setUlds(List<UldBlkConsultaDetalhada> ulds) {
    this.ulds = ulds;
  }

  public ItemCargaConhecimentoConsultaDetalhada ulds(List<UldBlkConsultaDetalhada> ulds) {
    this.ulds = ulds;
    return this;
  }

  public ItemCargaConhecimentoConsultaDetalhada addUldsItem(UldBlkConsultaDetalhada uldsItem) {
    this.ulds.add(uldsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemCargaConhecimentoConsultaDetalhada {\n");
    
    sb.append("    classificacoesMercadoria: ").append(toIndentedString(classificacoesMercadoria)).append("\n");
    sb.append("    descricaoMercadoria: ").append(toIndentedString(descricaoMercadoria)).append("\n");
    sb.append("    ulds: ").append(toIndentedString(ulds)).append("\n");
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

