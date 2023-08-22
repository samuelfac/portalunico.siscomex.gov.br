package br.gov.siscomex.portalunico.cct_ext.model;

import br.gov.siscomex.portalunico.cct_ext.model.CargaSoltaVeiculo;
import br.gov.siscomex.portalunico.cct_ext.model.Granel;
import io.swagger.v3.oas.annotations.media.Schema;
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
 @XmlType(name = "Documento", propOrder =
    { "numeroDUE", "numeroRUC", "cargaSoltaVeiculo", "granel"
})

@XmlRootElement(name="Documento")
/**
  * Documento de carga envolvidos na entrega (DU-E / RUC)
 **/
@ApiModel(description="Documento de carga envolvidos na entrega (DU-E / RUC)")
public class Documento  {
  
  @XmlElement(name="numeroDUE", required = true)
  @ApiModelProperty(example = "17BR0000451567", required = true, value = "Número da DU-E<br>Tamanho: 14<br>Formato: AABRSSSSSSSSSD <br>Descrição Formato<br>AA - Ano<br>BR - Brasil<br>SSSSSSSSS - Numeração sequencial<br>D - DV")
 /**
   * Número da DU-E<br>Tamanho: 14<br>Formato: AABRSSSSSSSSSD <br>Descrição Formato<br>AA - Ano<br>BR - Brasil<br>SSSSSSSSS - Numeração sequencial<br>D - DV
  **/
  private String numeroDUE = null;

  @XmlElement(name="numeroRUC", required = true)
  @ApiModelProperty(example = "7BR276574827551833214353477473070", required = true, value = "Número da RUC ou RUC Master<br>Tamanho mínimo: 13<br>Tamanho máximo: 35<br>Formato: NAANNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN")
 /**
   * Número da RUC ou RUC Master<br>Tamanho mínimo: 13<br>Tamanho máximo: 35<br>Formato: NAANNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN
  **/
  private String numeroRUC = null;

  @XmlElement(name="cargaSoltaVeiculo", required = true)
  @ApiModelProperty(required = true, value = "")
  @Valid
  private CargaSoltaVeiculo cargaSoltaVeiculo = null;

  @XmlElement(name="granel", required = true)
  @ApiModelProperty(required = true, value = "")
  @Valid
  private Granel granel = null;
 /**
   * Número da DU-E&lt;br&gt;Tamanho: 14&lt;br&gt;Formato: AABRSSSSSSSSSD &lt;br&gt;Descrição Formato&lt;br&gt;AA - Ano&lt;br&gt;BR - Brasil&lt;br&gt;SSSSSSSSS - Numeração sequencial&lt;br&gt;D - DV
   * @return numeroDUE
  **/
  @JsonProperty("numeroDUE")
  @NotNull
  public String getNumeroDUE() {
    return numeroDUE;
  }

  public void setNumeroDUE(String numeroDUE) {
    this.numeroDUE = numeroDUE;
  }

  public Documento numeroDUE(String numeroDUE) {
    this.numeroDUE = numeroDUE;
    return this;
  }

 /**
   * Número da RUC ou RUC Master&lt;br&gt;Tamanho mínimo: 13&lt;br&gt;Tamanho máximo: 35&lt;br&gt;Formato: NAANNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN
   * @return numeroRUC
  **/
  @JsonProperty("numeroRUC")
  @NotNull
  public String getNumeroRUC() {
    return numeroRUC;
  }

  public void setNumeroRUC(String numeroRUC) {
    this.numeroRUC = numeroRUC;
  }

  public Documento numeroRUC(String numeroRUC) {
    this.numeroRUC = numeroRUC;
    return this;
  }

 /**
   * Get cargaSoltaVeiculo
   * @return cargaSoltaVeiculo
  **/
  @JsonProperty("cargaSoltaVeiculo")
  @NotNull
  public CargaSoltaVeiculo getCargaSoltaVeiculo() {
    return cargaSoltaVeiculo;
  }

  public void setCargaSoltaVeiculo(CargaSoltaVeiculo cargaSoltaVeiculo) {
    this.cargaSoltaVeiculo = cargaSoltaVeiculo;
  }

  public Documento cargaSoltaVeiculo(CargaSoltaVeiculo cargaSoltaVeiculo) {
    this.cargaSoltaVeiculo = cargaSoltaVeiculo;
    return this;
  }

 /**
   * Get granel
   * @return granel
  **/
  @JsonProperty("granel")
  @NotNull
  public Granel getGranel() {
    return granel;
  }

  public void setGranel(Granel granel) {
    this.granel = granel;
  }

  public Documento granel(Granel granel) {
    this.granel = granel;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Documento {\n");
    
    sb.append("    numeroDUE: ").append(toIndentedString(numeroDUE)).append("\n");
    sb.append("    numeroRUC: ").append(toIndentedString(numeroRUC)).append("\n");
    sb.append("    cargaSoltaVeiculo: ").append(toIndentedString(cargaSoltaVeiculo)).append("\n");
    sb.append("    granel: ").append(toIndentedString(granel)).append("\n");
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

