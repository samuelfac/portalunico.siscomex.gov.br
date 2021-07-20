package br.gov.siscomex.portalunico.ccta.model;

import java.util.List;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "ItemCargaConhecimentoConsultaDetalhada", propOrder =
    { "descricaoMercadoria", "classificacoesMercadoria"
})

@XmlRootElement(name="ItemCargaConhecimentoConsultaDetalhada")
public class ItemCargaConhecimentoConsultaDetalhada  {
  
  @XmlElement(name="descricaoMercadoria")
  @ApiModelProperty(example = "Descrição completa das mercadorias", value = "Descrição completa das mercadorias que estão sendo transportadas<br>Tamanho: 600<br/>")
 /**
   * Descrição completa das mercadorias que estão sendo transportadas<br>Tamanho: 600<br/>
  **/
  private String descricaoMercadoria = null;

  @XmlElement(name="classificacoesMercadoria")
  @ApiModelProperty(example = "877887", value = "Código de classificação da mercadoria<br/>Tamanho: 18")
  @Valid
 /**
   * Código de classificação da mercadoria<br/>Tamanho: 18
  **/
  private List<ClassificacaoMercadoriaConsultaDetalhadaRepresentation> classificacoesMercadoria = null;
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
   * Código de classificação da mercadoria&lt;br/&gt;Tamanho: 18
   * @return classificacoesMercadoria
  **/
  @JsonProperty("classificacoesMercadoria")
  public List<ClassificacaoMercadoriaConsultaDetalhadaRepresentation> getClassificacoesMercadoria() {
    return classificacoesMercadoria;
  }

  public void setClassificacoesMercadoria(List<ClassificacaoMercadoriaConsultaDetalhadaRepresentation> classificacoesMercadoria) {
    this.classificacoesMercadoria = classificacoesMercadoria;
  }

  public ItemCargaConhecimentoConsultaDetalhada classificacoesMercadoria(List<ClassificacaoMercadoriaConsultaDetalhadaRepresentation> classificacoesMercadoria) {
    this.classificacoesMercadoria = classificacoesMercadoria;
    return this;
  }

  public ItemCargaConhecimentoConsultaDetalhada addClassificacoesMercadoriaItem(ClassificacaoMercadoriaConsultaDetalhadaRepresentation classificacoesMercadoriaItem) {
    this.classificacoesMercadoria.add(classificacoesMercadoriaItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemCargaConhecimentoConsultaDetalhada {\n");
    
    sb.append("    descricaoMercadoria: ").append(toIndentedString(descricaoMercadoria)).append("\n");
    sb.append("    classificacoesMercadoria: ").append(toIndentedString(classificacoesMercadoria)).append("\n");
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

