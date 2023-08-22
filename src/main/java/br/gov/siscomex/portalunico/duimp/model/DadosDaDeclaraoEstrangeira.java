package br.gov.siscomex.portalunico.duimp.model;

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
 @XmlType(name = "DadosDaDeclaraoEstrangeira", propOrder =
    { "numeroDeclaracao", "faixaItemInicial", "faixaItemFinal"
})

@XmlRootElement(name="DadosDaDeclaraoEstrangeira")
public class DadosDaDeclaraoEstrangeira  {
  
  @XmlElement(name="numeroDeclaracao")
  @ApiModelProperty(example = "19XY0000001-XYZ", value = "Número da declaração.<br>Tamanho mínimo: 1<br>Tamanho máximo: 70")
 /**
   * Número da declaração.<br>Tamanho mínimo: 1<br>Tamanho máximo: 70
  **/
  private String numeroDeclaracao = null;

  @XmlElement(name="faixaItemInicial")
  @ApiModelProperty(example = "A-11", value = "Item inicial da faixa de itens<br>Tamanho mínimo: 1<br>Tamanho máximo: 7")
 /**
   * Item inicial da faixa de itens<br>Tamanho mínimo: 1<br>Tamanho máximo: 7
  **/
  private String faixaItemInicial = null;

  @XmlElement(name="faixaItemFinal")
  @ApiModelProperty(example = "B-20", value = "Item final da faixa de itens<br>Tamanho mínimo: 1<br>Tamanho máximo: 7")
 /**
   * Item final da faixa de itens<br>Tamanho mínimo: 1<br>Tamanho máximo: 7
  **/
  private String faixaItemFinal = null;
 /**
   * Número da declaração.&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 70
   * @return numeroDeclaracao
  **/
  @JsonProperty("numeroDeclaracao")
  public String getNumeroDeclaracao() {
    return numeroDeclaracao;
  }

  public void setNumeroDeclaracao(String numeroDeclaracao) {
    this.numeroDeclaracao = numeroDeclaracao;
  }

  public DadosDaDeclaraoEstrangeira numeroDeclaracao(String numeroDeclaracao) {
    this.numeroDeclaracao = numeroDeclaracao;
    return this;
  }

 /**
   * Item inicial da faixa de itens&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 7
   * @return faixaItemInicial
  **/
  @JsonProperty("faixaItemInicial")
  public String getFaixaItemInicial() {
    return faixaItemInicial;
  }

  public void setFaixaItemInicial(String faixaItemInicial) {
    this.faixaItemInicial = faixaItemInicial;
  }

  public DadosDaDeclaraoEstrangeira faixaItemInicial(String faixaItemInicial) {
    this.faixaItemInicial = faixaItemInicial;
    return this;
  }

 /**
   * Item final da faixa de itens&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 7
   * @return faixaItemFinal
  **/
  @JsonProperty("faixaItemFinal")
  public String getFaixaItemFinal() {
    return faixaItemFinal;
  }

  public void setFaixaItemFinal(String faixaItemFinal) {
    this.faixaItemFinal = faixaItemFinal;
  }

  public DadosDaDeclaraoEstrangeira faixaItemFinal(String faixaItemFinal) {
    this.faixaItemFinal = faixaItemFinal;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DadosDaDeclaraoEstrangeira {\n");
    
    sb.append("    numeroDeclaracao: ").append(toIndentedString(numeroDeclaracao)).append("\n");
    sb.append("    faixaItemInicial: ").append(toIndentedString(faixaItemInicial)).append("\n");
    sb.append("    faixaItemFinal: ").append(toIndentedString(faixaItemFinal)).append("\n");
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

