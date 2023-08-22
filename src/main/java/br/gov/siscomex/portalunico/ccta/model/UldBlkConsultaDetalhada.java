package br.gov.siscomex.portalunico.ccta.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "UldBlkConsultaDetalhada", propOrder =
    { "codigoProprietarioULD", "numeroSerieULD", "quantidade", "tara", "tipoULD"
})

@XmlRootElement(name="UldBlkConsultaDetalhada")
public class UldBlkConsultaDetalhada  {
  
  @XmlElement(name="codigoProprietarioULD")
  @ApiModelProperty(example = "XX", value = "Identifica a companhia aérea proprietária da ULD<br/>Tamanho: : 2<br/> Formato: AA")
 /**
   * Identifica a companhia aérea proprietária da ULD<br/>Tamanho: : 2<br/> Formato: AA
  **/
  private String codigoProprietarioULD = null;

  @XmlElement(name="numeroSerieULD")
  @ApiModelProperty(example = "AS123", value = "Número de série de uma ULD registrado pelo seu proprietário<br/>Tamanho: 5<br/> Formato: AAAAA")
 /**
   * Número de série de uma ULD registrado pelo seu proprietário<br/>Tamanho: 5<br/> Formato: AAAAA
  **/
  private String numeroSerieULD = null;

  @XmlElement(name="quantidade")
  @ApiModelProperty(example = "5", value = "Quantidade de volumes<br/>Tamanho: 4<br/>Formato: Inteiro, com até 4 digitos")
 /**
   * Quantidade de volumes<br/>Tamanho: 4<br/>Formato: Inteiro, com até 4 digitos
  **/
  private Integer quantidade = null;

  @XmlElement(name="tara")
  @ApiModelProperty(example = "780.348", value = "Peso da unidade da ULD, vazia<br/>Tamanho: 10,3<br/> Formato: Decimal, com até 3 casas decimais separadas por ponto")
  @Valid
 /**
   * Peso da unidade da ULD, vazia<br/>Tamanho: 10,3<br/> Formato: Decimal, com até 3 casas decimais separadas por ponto
  **/
  private BigDecimal tara = null;

  @XmlElement(name="tipoULD")
  @ApiModelProperty(example = "ULD", value = "Código referente ao tipo da ULD<br/>Tamanho 3<br/> Formato: AAA")
 /**
   * Código referente ao tipo da ULD<br/>Tamanho 3<br/> Formato: AAA
  **/
  private String tipoULD = null;
 /**
   * Identifica a companhia aérea proprietária da ULD&lt;br/&gt;Tamanho: : 2&lt;br/&gt; Formato: AA
   * @return codigoProprietarioULD
  **/
  @JsonProperty("codigoProprietarioULD")
  public String getCodigoProprietarioULD() {
    return codigoProprietarioULD;
  }

  public void setCodigoProprietarioULD(String codigoProprietarioULD) {
    this.codigoProprietarioULD = codigoProprietarioULD;
  }

  public UldBlkConsultaDetalhada codigoProprietarioULD(String codigoProprietarioULD) {
    this.codigoProprietarioULD = codigoProprietarioULD;
    return this;
  }

 /**
   * Número de série de uma ULD registrado pelo seu proprietário&lt;br/&gt;Tamanho: 5&lt;br/&gt; Formato: AAAAA
   * @return numeroSerieULD
  **/
  @JsonProperty("numeroSerieULD")
  public String getNumeroSerieULD() {
    return numeroSerieULD;
  }

  public void setNumeroSerieULD(String numeroSerieULD) {
    this.numeroSerieULD = numeroSerieULD;
  }

  public UldBlkConsultaDetalhada numeroSerieULD(String numeroSerieULD) {
    this.numeroSerieULD = numeroSerieULD;
    return this;
  }

 /**
   * Quantidade de volumes&lt;br/&gt;Tamanho: 4&lt;br/&gt;Formato: Inteiro, com até 4 digitos
   * @return quantidade
  **/
  @JsonProperty("quantidade")
  public Integer getQuantidade() {
    return quantidade;
  }

  public void setQuantidade(Integer quantidade) {
    this.quantidade = quantidade;
  }

  public UldBlkConsultaDetalhada quantidade(Integer quantidade) {
    this.quantidade = quantidade;
    return this;
  }

 /**
   * Peso da unidade da ULD, vazia&lt;br/&gt;Tamanho: 10,3&lt;br/&gt; Formato: Decimal, com até 3 casas decimais separadas por ponto
   * @return tara
  **/
  @JsonProperty("tara")
  public BigDecimal getTara() {
    return tara;
  }

  public void setTara(BigDecimal tara) {
    this.tara = tara;
  }

  public UldBlkConsultaDetalhada tara(BigDecimal tara) {
    this.tara = tara;
    return this;
  }

 /**
   * Código referente ao tipo da ULD&lt;br/&gt;Tamanho 3&lt;br/&gt; Formato: AAA
   * @return tipoULD
  **/
  @JsonProperty("tipoULD")
  public String getTipoULD() {
    return tipoULD;
  }

  public void setTipoULD(String tipoULD) {
    this.tipoULD = tipoULD;
  }

  public UldBlkConsultaDetalhada tipoULD(String tipoULD) {
    this.tipoULD = tipoULD;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UldBlkConsultaDetalhada {\n");
    
    sb.append("    codigoProprietarioULD: ").append(toIndentedString(codigoProprietarioULD)).append("\n");
    sb.append("    numeroSerieULD: ").append(toIndentedString(numeroSerieULD)).append("\n");
    sb.append("    quantidade: ").append(toIndentedString(quantidade)).append("\n");
    sb.append("    tara: ").append(toIndentedString(tara)).append("\n");
    sb.append("    tipoULD: ").append(toIndentedString(tipoULD)).append("\n");
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

