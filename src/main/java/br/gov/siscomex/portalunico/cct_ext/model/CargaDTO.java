package br.gov.siscomex.portalunico.cct_ext.model;

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
 @XmlType(name = "CargaDTO", propOrder =
    { "numeroDue", "numeroRuc", "codigoTipoEmbalagem", "descricaoTipoEmbalagem", "codigoTipoGranel", "descricaoTipoGranel", "siglaUnidadeMedida", "quantidadeManifestada", "descricaoCarga", "pesoBruto"
})

@XmlRootElement(name="CargaDTO")
public class CargaDTO  {
  
  @XmlElement(name="numeroDue")
  @ApiModelProperty(value = "")
  private String numeroDue = null;

  @XmlElement(name="numeroRuc")
  @ApiModelProperty(value = "")
  private String numeroRuc = null;

  @XmlElement(name="codigoTipoEmbalagem")
  @ApiModelProperty(value = "")
  private Integer codigoTipoEmbalagem = null;

  @XmlElement(name="descricaoTipoEmbalagem")
  @ApiModelProperty(value = "")
  private String descricaoTipoEmbalagem = null;

  @XmlElement(name="codigoTipoGranel")
  @ApiModelProperty(value = "")
  private Integer codigoTipoGranel = null;

  @XmlElement(name="descricaoTipoGranel")
  @ApiModelProperty(value = "")
  private String descricaoTipoGranel = null;

  @XmlElement(name="siglaUnidadeMedida")
  @ApiModelProperty(value = "")
  private String siglaUnidadeMedida = null;

  @XmlElement(name="quantidadeManifestada")
  @ApiModelProperty(value = "")
  @Valid
  private BigDecimal quantidadeManifestada = null;

  @XmlElement(name="descricaoCarga")
  @ApiModelProperty(value = "")
  private String descricaoCarga = null;

  @XmlElement(name="pesoBruto")
  @ApiModelProperty(value = "")
  @Valid
  private BigDecimal pesoBruto = null;
 /**
   * Get numeroDue
   * @return numeroDue
  **/
  @JsonProperty("numeroDue")
  public String getNumeroDue() {
    return numeroDue;
  }

  public void setNumeroDue(String numeroDue) {
    this.numeroDue = numeroDue;
  }

  public CargaDTO numeroDue(String numeroDue) {
    this.numeroDue = numeroDue;
    return this;
  }

 /**
   * Get numeroRuc
   * @return numeroRuc
  **/
  @JsonProperty("numeroRuc")
  public String getNumeroRuc() {
    return numeroRuc;
  }

  public void setNumeroRuc(String numeroRuc) {
    this.numeroRuc = numeroRuc;
  }

  public CargaDTO numeroRuc(String numeroRuc) {
    this.numeroRuc = numeroRuc;
    return this;
  }

 /**
   * Get codigoTipoEmbalagem
   * @return codigoTipoEmbalagem
  **/
  @JsonProperty("codigoTipoEmbalagem")
  public Integer getCodigoTipoEmbalagem() {
    return codigoTipoEmbalagem;
  }

  public void setCodigoTipoEmbalagem(Integer codigoTipoEmbalagem) {
    this.codigoTipoEmbalagem = codigoTipoEmbalagem;
  }

  public CargaDTO codigoTipoEmbalagem(Integer codigoTipoEmbalagem) {
    this.codigoTipoEmbalagem = codigoTipoEmbalagem;
    return this;
  }

 /**
   * Get descricaoTipoEmbalagem
   * @return descricaoTipoEmbalagem
  **/
  @JsonProperty("descricaoTipoEmbalagem")
  public String getDescricaoTipoEmbalagem() {
    return descricaoTipoEmbalagem;
  }

  public void setDescricaoTipoEmbalagem(String descricaoTipoEmbalagem) {
    this.descricaoTipoEmbalagem = descricaoTipoEmbalagem;
  }

  public CargaDTO descricaoTipoEmbalagem(String descricaoTipoEmbalagem) {
    this.descricaoTipoEmbalagem = descricaoTipoEmbalagem;
    return this;
  }

 /**
   * Get codigoTipoGranel
   * @return codigoTipoGranel
  **/
  @JsonProperty("codigoTipoGranel")
  public Integer getCodigoTipoGranel() {
    return codigoTipoGranel;
  }

  public void setCodigoTipoGranel(Integer codigoTipoGranel) {
    this.codigoTipoGranel = codigoTipoGranel;
  }

  public CargaDTO codigoTipoGranel(Integer codigoTipoGranel) {
    this.codigoTipoGranel = codigoTipoGranel;
    return this;
  }

 /**
   * Get descricaoTipoGranel
   * @return descricaoTipoGranel
  **/
  @JsonProperty("descricaoTipoGranel")
  public String getDescricaoTipoGranel() {
    return descricaoTipoGranel;
  }

  public void setDescricaoTipoGranel(String descricaoTipoGranel) {
    this.descricaoTipoGranel = descricaoTipoGranel;
  }

  public CargaDTO descricaoTipoGranel(String descricaoTipoGranel) {
    this.descricaoTipoGranel = descricaoTipoGranel;
    return this;
  }

 /**
   * Get siglaUnidadeMedida
   * @return siglaUnidadeMedida
  **/
  @JsonProperty("siglaUnidadeMedida")
  public String getSiglaUnidadeMedida() {
    return siglaUnidadeMedida;
  }

  public void setSiglaUnidadeMedida(String siglaUnidadeMedida) {
    this.siglaUnidadeMedida = siglaUnidadeMedida;
  }

  public CargaDTO siglaUnidadeMedida(String siglaUnidadeMedida) {
    this.siglaUnidadeMedida = siglaUnidadeMedida;
    return this;
  }

 /**
   * Get quantidadeManifestada
   * @return quantidadeManifestada
  **/
  @JsonProperty("quantidadeManifestada")
  public BigDecimal getQuantidadeManifestada() {
    return quantidadeManifestada;
  }

  public void setQuantidadeManifestada(BigDecimal quantidadeManifestada) {
    this.quantidadeManifestada = quantidadeManifestada;
  }

  public CargaDTO quantidadeManifestada(BigDecimal quantidadeManifestada) {
    this.quantidadeManifestada = quantidadeManifestada;
    return this;
  }

 /**
   * Get descricaoCarga
   * @return descricaoCarga
  **/
  @JsonProperty("descricaoCarga")
  public String getDescricaoCarga() {
    return descricaoCarga;
  }

  public void setDescricaoCarga(String descricaoCarga) {
    this.descricaoCarga = descricaoCarga;
  }

  public CargaDTO descricaoCarga(String descricaoCarga) {
    this.descricaoCarga = descricaoCarga;
    return this;
  }

 /**
   * Get pesoBruto
   * @return pesoBruto
  **/
  @JsonProperty("pesoBruto")
  public BigDecimal getPesoBruto() {
    return pesoBruto;
  }

  public void setPesoBruto(BigDecimal pesoBruto) {
    this.pesoBruto = pesoBruto;
  }

  public CargaDTO pesoBruto(BigDecimal pesoBruto) {
    this.pesoBruto = pesoBruto;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CargaDTO {\n");
    
    sb.append("    numeroDue: ").append(toIndentedString(numeroDue)).append("\n");
    sb.append("    numeroRuc: ").append(toIndentedString(numeroRuc)).append("\n");
    sb.append("    codigoTipoEmbalagem: ").append(toIndentedString(codigoTipoEmbalagem)).append("\n");
    sb.append("    descricaoTipoEmbalagem: ").append(toIndentedString(descricaoTipoEmbalagem)).append("\n");
    sb.append("    codigoTipoGranel: ").append(toIndentedString(codigoTipoGranel)).append("\n");
    sb.append("    descricaoTipoGranel: ").append(toIndentedString(descricaoTipoGranel)).append("\n");
    sb.append("    siglaUnidadeMedida: ").append(toIndentedString(siglaUnidadeMedida)).append("\n");
    sb.append("    quantidadeManifestada: ").append(toIndentedString(quantidadeManifestada)).append("\n");
    sb.append("    descricaoCarga: ").append(toIndentedString(descricaoCarga)).append("\n");
    sb.append("    pesoBruto: ").append(toIndentedString(pesoBruto)).append("\n");
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

