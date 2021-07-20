package br.gov.siscomex.portalunico.ccta.model;

import java.math.BigDecimal;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "EstoqueConsultaDetalhada", propOrder =
    { "situacaoAtual", "dataHoraSituacaoAtual", "unidadeRfb", "recintoAduaneiro", "cnpjResponsavelAtual", "quantidadeVolumesEstoque", "pesoBrutoEstoque"
})

@XmlRootElement(name="EstoqueConsultaDetalhada")
public class EstoqueConsultaDetalhada  {
  
  @XmlElement(name="situacaoAtual")
  @ApiModelProperty(example = "Em área de transferência ", value = "Descrição da situação do estoque da carga<br/> ")
 /**
   * Descrição da situação do estoque da carga<br/> 
  **/
  private String situacaoAtual = null;

  @XmlElement(name="dataHoraSituacaoAtual")
  @ApiModelProperty(example = "12/02/2021 21:21 ", value = "Data / Hora do registro<br/> ")
 /**
   * Data / Hora do registro<br/> 
  **/
  private String dataHoraSituacaoAtual = null;

  @XmlElement(name="unidadeRfb")
  @ApiModelProperty(example = "0817600", value = "Código da UL<br/> Tamanho: 7<br/> Formato: AAAAAAA")
 /**
   * Código da UL<br/> Tamanho: 7<br/> Formato: AAAAAAA
  **/
  private String unidadeRfb = null;

  @XmlElement(name="recintoAduaneiro")
  @ApiModelProperty(example = "8911101", value = "Código do Recinto Aduaneiro.<br/>Tamanho: 7<br/> Formato: inteiro com até 7 dígitos")
 /**
   * Código do Recinto Aduaneiro.<br/>Tamanho: 7<br/> Formato: inteiro com até 7 dígitos
  **/
  private String recintoAduaneiro = null;

  @XmlElement(name="cnpjResponsavelAtual")
  @ApiModelProperty(example = "00000000000191", value = "CNPJ responsável pelo estoque<br/> ")
 /**
   * CNPJ responsável pelo estoque<br/> 
  **/
  private String cnpjResponsavelAtual = null;

  @XmlElement(name="quantidadeVolumesEstoque")
  @ApiModelProperty(example = "780.348", value = "Quantidade total de volumes transportados. Quando for granel, aqui constará o peso do produto<br/>Tamanho: 10,3<br/> Formato: Decimal, com até 3 casas decimais separadas por ponto. ")
  @Valid
 /**
   * Quantidade total de volumes transportados. Quando for granel, aqui constará o peso do produto<br/>Tamanho: 10,3<br/> Formato: Decimal, com até 3 casas decimais separadas por ponto. 
  **/
  private BigDecimal quantidadeVolumesEstoque = null;

  @XmlElement(name="pesoBrutoEstoque")
  @ApiModelProperty(example = "55.0", value = "Peso do volume transportado. Quando for granel, esse campo será nulo.<br/>Tamanho: 10,3<br/> Formato: Decimal, com até 3 casas decimais separadas por ponto. ")
  @Valid
 /**
   * Peso do volume transportado. Quando for granel, esse campo será nulo.<br/>Tamanho: 10,3<br/> Formato: Decimal, com até 3 casas decimais separadas por ponto. 
  **/
  private BigDecimal pesoBrutoEstoque = null;
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

  public EstoqueConsultaDetalhada situacaoAtual(String situacaoAtual) {
    this.situacaoAtual = situacaoAtual;
    return this;
  }

 /**
   * Data / Hora do registro&lt;br/&gt; 
   * @return dataHoraSituacaoAtual
  **/
  @JsonProperty("dataHoraSituacaoAtual")
  public String getDataHoraSituacaoAtual() {
    return dataHoraSituacaoAtual;
  }

  public void setDataHoraSituacaoAtual(String dataHoraSituacaoAtual) {
    this.dataHoraSituacaoAtual = dataHoraSituacaoAtual;
  }

  public EstoqueConsultaDetalhada dataHoraSituacaoAtual(String dataHoraSituacaoAtual) {
    this.dataHoraSituacaoAtual = dataHoraSituacaoAtual;
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

  public EstoqueConsultaDetalhada unidadeRfb(String unidadeRfb) {
    this.unidadeRfb = unidadeRfb;
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

  public EstoqueConsultaDetalhada recintoAduaneiro(String recintoAduaneiro) {
    this.recintoAduaneiro = recintoAduaneiro;
    return this;
  }

 /**
   * CNPJ responsável pelo estoque&lt;br/&gt; 
   * @return cnpjResponsavelAtual
  **/
  @JsonProperty("cnpjResponsavelAtual")
  public String getCnpjResponsavelAtual() {
    return cnpjResponsavelAtual;
  }

  public void setCnpjResponsavelAtual(String cnpjResponsavelAtual) {
    this.cnpjResponsavelAtual = cnpjResponsavelAtual;
  }

  public EstoqueConsultaDetalhada cnpjResponsavelAtual(String cnpjResponsavelAtual) {
    this.cnpjResponsavelAtual = cnpjResponsavelAtual;
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

  public EstoqueConsultaDetalhada quantidadeVolumesEstoque(BigDecimal quantidadeVolumesEstoque) {
    this.quantidadeVolumesEstoque = quantidadeVolumesEstoque;
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

  public EstoqueConsultaDetalhada pesoBrutoEstoque(BigDecimal pesoBrutoEstoque) {
    this.pesoBrutoEstoque = pesoBrutoEstoque;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EstoqueConsultaDetalhada {\n");
    
    sb.append("    situacaoAtual: ").append(toIndentedString(situacaoAtual)).append("\n");
    sb.append("    dataHoraSituacaoAtual: ").append(toIndentedString(dataHoraSituacaoAtual)).append("\n");
    sb.append("    unidadeRfb: ").append(toIndentedString(unidadeRfb)).append("\n");
    sb.append("    recintoAduaneiro: ").append(toIndentedString(recintoAduaneiro)).append("\n");
    sb.append("    cnpjResponsavelAtual: ").append(toIndentedString(cnpjResponsavelAtual)).append("\n");
    sb.append("    quantidadeVolumesEstoque: ").append(toIndentedString(quantidadeVolumesEstoque)).append("\n");
    sb.append("    pesoBrutoEstoque: ").append(toIndentedString(pesoBrutoEstoque)).append("\n");
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

