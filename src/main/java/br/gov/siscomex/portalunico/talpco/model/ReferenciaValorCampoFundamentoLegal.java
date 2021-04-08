package br.gov.siscomex.portalunico.talpco.model;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "ReferenciaValorCampoFundamentoLegal", propOrder =
    { "camposAdicionais", "codigoFundamento"
})

@XmlRootElement(name="ReferenciaValorCampoFundamentoLegal")
/**
  * Valor de um campo composto do tipo Fundamento Legal de um LPCO
 **/
@ApiModel(description="Valor de um campo composto do tipo Fundamento Legal de um LPCO")
public class ReferenciaValorCampoFundamentoLegal  {
  
  @XmlElement(name="camposAdicionais")
  @ApiModelProperty(value = "Campos adicionais do fundamento legal.<br>")
  @Valid
 /**
   * Campos adicionais do fundamento legal.<br>
  **/
  private List<ReferenciaCampoAdicionalTt> camposAdicionais = null;

  @XmlElement(name="codigoFundamento", required = true)
  @ApiModelProperty(example = "00102030004", required = true, value = "Código do fundamento legal.<br>Tamanho: 11<br>Formato: 0CCTTRRFFFF, onde CC = Código da agregação, TT=Tipo da Agregação, RR=Regime, FFFF=Fundamento legal")
 /**
   * Código do fundamento legal.<br>Tamanho: 11<br>Formato: 0CCTTRRFFFF, onde CC = Código da agregação, TT=Tipo da Agregação, RR=Regime, FFFF=Fundamento legal
  **/
  private String codigoFundamento = null;
 /**
   * Campos adicionais do fundamento legal.&lt;br&gt;
   * @return camposAdicionais
  **/
  @JsonProperty("camposAdicionais")
  public List<ReferenciaCampoAdicionalTt> getCamposAdicionais() {
    return camposAdicionais;
  }

  public void setCamposAdicionais(List<ReferenciaCampoAdicionalTt> camposAdicionais) {
    this.camposAdicionais = camposAdicionais;
  }

  public ReferenciaValorCampoFundamentoLegal camposAdicionais(List<ReferenciaCampoAdicionalTt> camposAdicionais) {
    this.camposAdicionais = camposAdicionais;
    return this;
  }

  public ReferenciaValorCampoFundamentoLegal addCamposAdicionaisItem(ReferenciaCampoAdicionalTt camposAdicionaisItem) {
    this.camposAdicionais.add(camposAdicionaisItem);
    return this;
  }

 /**
   * Código do fundamento legal.&lt;br&gt;Tamanho: 11&lt;br&gt;Formato: 0CCTTRRFFFF, onde CC &#x3D; Código da agregação, TT&#x3D;Tipo da Agregação, RR&#x3D;Regime, FFFF&#x3D;Fundamento legal
   * @return codigoFundamento
  **/
  @JsonProperty("codigoFundamento")
  @NotNull
  public String getCodigoFundamento() {
    return codigoFundamento;
  }

  public void setCodigoFundamento(String codigoFundamento) {
    this.codigoFundamento = codigoFundamento;
  }

  public ReferenciaValorCampoFundamentoLegal codigoFundamento(String codigoFundamento) {
    this.codigoFundamento = codigoFundamento;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReferenciaValorCampoFundamentoLegal {\n");
    
    sb.append("    camposAdicionais: ").append(toIndentedString(camposAdicionais)).append("\n");
    sb.append("    codigoFundamento: ").append(toIndentedString(codigoFundamento)).append("\n");
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

