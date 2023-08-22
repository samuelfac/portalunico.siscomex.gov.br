package br.gov.siscomex.portalunico.ccta.model;

import java.math.BigDecimal;
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
 @XmlType(name = "EstoqueConsultaResumida", propOrder =
    { "dataHoraSituacaoAtual", "identificacaoViagem", "pesoBrutoEstoque", "quantidadeVolumesEstoque", "recintoAduaneiro", "situacaoAtual", "unidadeRfb"
})

@XmlRootElement(name="EstoqueConsultaResumida")
public class EstoqueConsultaResumida  {
  
  @XmlElement(name="dataHoraSituacaoAtual")
  @ApiModelProperty(example = "12/02/2021 21:21", value = "Data / Hora de atualização do registro na tabela de estoque. A cada momento em que o registro é alterado, esta data é atualizada.<br/> ")
 /**
   * Data / Hora de atualização do registro na tabela de estoque. A cada momento em que o registro é alterado, esta data é atualizada.<br/> 
  **/
  private String dataHoraSituacaoAtual = null;

  @XmlElement(name="identificacaoViagem")
  @ApiModelProperty(example = "XX099020200922MIA", value = "Número de identificação do manifesto<br/>Tamanho: 17")
 /**
   * Número de identificação do manifesto<br/>Tamanho: 17
  **/
  private String identificacaoViagem = null;

  @XmlElement(name="pesoBrutoEstoque")
  @ApiModelProperty(example = "55.0", value = "Peso do volume transportado. Quando for granel, esse campo será nulo.<br/>Tamanho: 10,3<br/> Formato: Decimal, com até 3 casas decimais separadas por ponto. ")
  @Valid
 /**
   * Peso do volume transportado. Quando for granel, esse campo será nulo.<br/>Tamanho: 10,3<br/> Formato: Decimal, com até 3 casas decimais separadas por ponto. 
  **/
  private BigDecimal pesoBrutoEstoque = null;

  @XmlElement(name="quantidadeVolumesEstoque")
  @ApiModelProperty(example = "780.348", value = "Quantidade total de volumes transportados. Quando for granel, aqui constará o peso do produto<br/>Tamanho: 10,3<br/> Formato: Decimal, com até 3 casas decimais separadas por ponto. ")
  @Valid
 /**
   * Quantidade total de volumes transportados. Quando for granel, aqui constará o peso do produto<br/>Tamanho: 10,3<br/> Formato: Decimal, com até 3 casas decimais separadas por ponto. 
  **/
  private BigDecimal quantidadeVolumesEstoque = null;

  @XmlElement(name="recintoAduaneiro")
  @ApiModelProperty(example = "8911101", value = "Código do Recinto Aduaneiro.<br/>Tamanho: 7<br/> Formato: inteiro com até 7 dígitos")
 /**
   * Código do Recinto Aduaneiro.<br/>Tamanho: 7<br/> Formato: inteiro com até 7 dígitos
  **/
  private String recintoAduaneiro = null;

  @XmlElement(name="situacaoAtual")
  @ApiModelProperty(example = "Em área de transferência", value = "Descrição da situação do estoque da carga<br/> ")
 /**
   * Descrição da situação do estoque da carga<br/> 
  **/
  private String situacaoAtual = null;

  @XmlElement(name="unidadeRfb")
  @ApiModelProperty(example = "0817600", value = "Código da UL<br/> Tamanho: 7<br/> Formato: AAAAAAA")
 /**
   * Código da UL<br/> Tamanho: 7<br/> Formato: AAAAAAA
  **/
  private String unidadeRfb = null;
 /**
   * Data / Hora de atualização do registro na tabela de estoque. A cada momento em que o registro é alterado, esta data é atualizada.&lt;br/&gt; 
   * @return dataHoraSituacaoAtual
  **/
  @JsonProperty("dataHoraSituacaoAtual")
  public String getDataHoraSituacaoAtual() {
    return dataHoraSituacaoAtual;
  }

  public void setDataHoraSituacaoAtual(String dataHoraSituacaoAtual) {
    this.dataHoraSituacaoAtual = dataHoraSituacaoAtual;
  }

  public EstoqueConsultaResumida dataHoraSituacaoAtual(String dataHoraSituacaoAtual) {
    this.dataHoraSituacaoAtual = dataHoraSituacaoAtual;
    return this;
  }

 /**
   * Número de identificação do manifesto&lt;br/&gt;Tamanho: 17
   * @return identificacaoViagem
  **/
  @JsonProperty("identificacaoViagem")
  public String getIdentificacaoViagem() {
    return identificacaoViagem;
  }

  public void setIdentificacaoViagem(String identificacaoViagem) {
    this.identificacaoViagem = identificacaoViagem;
  }

  public EstoqueConsultaResumida identificacaoViagem(String identificacaoViagem) {
    this.identificacaoViagem = identificacaoViagem;
    return this;
  }

 /**
   * Peso do volume transportado. Quando for granel, esse campo será nulo.&lt;br/&gt;Tamanho: 10,3&lt;br/&gt; Formato: Decimal, com até 3 casas decimais separadas por ponto. 
   * @return pesoBrutoEstoque
  **/
  @JsonProperty("pesoBrutoEstoque")
  public BigDecimal getPesoBrutoEstoque() {
    return pesoBrutoEstoque;
  }

  public void setPesoBrutoEstoque(BigDecimal pesoBrutoEstoque) {
    this.pesoBrutoEstoque = pesoBrutoEstoque;
  }

  public EstoqueConsultaResumida pesoBrutoEstoque(BigDecimal pesoBrutoEstoque) {
    this.pesoBrutoEstoque = pesoBrutoEstoque;
    return this;
  }

 /**
   * Quantidade total de volumes transportados. Quando for granel, aqui constará o peso do produto&lt;br/&gt;Tamanho: 10,3&lt;br/&gt; Formato: Decimal, com até 3 casas decimais separadas por ponto. 
   * @return quantidadeVolumesEstoque
  **/
  @JsonProperty("quantidadeVolumesEstoque")
  public BigDecimal getQuantidadeVolumesEstoque() {
    return quantidadeVolumesEstoque;
  }

  public void setQuantidadeVolumesEstoque(BigDecimal quantidadeVolumesEstoque) {
    this.quantidadeVolumesEstoque = quantidadeVolumesEstoque;
  }

  public EstoqueConsultaResumida quantidadeVolumesEstoque(BigDecimal quantidadeVolumesEstoque) {
    this.quantidadeVolumesEstoque = quantidadeVolumesEstoque;
    return this;
  }

 /**
   * Código do Recinto Aduaneiro.&lt;br/&gt;Tamanho: 7&lt;br/&gt; Formato: inteiro com até 7 dígitos
   * @return recintoAduaneiro
  **/
  @JsonProperty("recintoAduaneiro")
  public String getRecintoAduaneiro() {
    return recintoAduaneiro;
  }

  public void setRecintoAduaneiro(String recintoAduaneiro) {
    this.recintoAduaneiro = recintoAduaneiro;
  }

  public EstoqueConsultaResumida recintoAduaneiro(String recintoAduaneiro) {
    this.recintoAduaneiro = recintoAduaneiro;
    return this;
  }

 /**
   * Descrição da situação do estoque da carga&lt;br/&gt; 
   * @return situacaoAtual
  **/
  @JsonProperty("situacaoAtual")
  public String getSituacaoAtual() {
    return situacaoAtual;
  }

  public void setSituacaoAtual(String situacaoAtual) {
    this.situacaoAtual = situacaoAtual;
  }

  public EstoqueConsultaResumida situacaoAtual(String situacaoAtual) {
    this.situacaoAtual = situacaoAtual;
    return this;
  }

 /**
   * Código da UL&lt;br/&gt; Tamanho: 7&lt;br/&gt; Formato: AAAAAAA
   * @return unidadeRfb
  **/
  @JsonProperty("unidadeRfb")
  public String getUnidadeRfb() {
    return unidadeRfb;
  }

  public void setUnidadeRfb(String unidadeRfb) {
    this.unidadeRfb = unidadeRfb;
  }

  public EstoqueConsultaResumida unidadeRfb(String unidadeRfb) {
    this.unidadeRfb = unidadeRfb;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EstoqueConsultaResumida {\n");
    
    sb.append("    dataHoraSituacaoAtual: ").append(toIndentedString(dataHoraSituacaoAtual)).append("\n");
    sb.append("    identificacaoViagem: ").append(toIndentedString(identificacaoViagem)).append("\n");
    sb.append("    pesoBrutoEstoque: ").append(toIndentedString(pesoBrutoEstoque)).append("\n");
    sb.append("    quantidadeVolumesEstoque: ").append(toIndentedString(quantidadeVolumesEstoque)).append("\n");
    sb.append("    recintoAduaneiro: ").append(toIndentedString(recintoAduaneiro)).append("\n");
    sb.append("    situacaoAtual: ").append(toIndentedString(situacaoAtual)).append("\n");
    sb.append("    unidadeRfb: ").append(toIndentedString(unidadeRfb)).append("\n");
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

