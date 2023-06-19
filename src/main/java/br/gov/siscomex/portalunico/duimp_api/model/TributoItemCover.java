package br.gov.siscomex.portalunico.duimp_api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.xml.bind.annotation.*;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "TributoItemCover", propOrder =
    { "tributo", "regime", "fundamento", "atributos"
})

@XmlRootElement(name="TributoItemCover")
/**
  * Lista de Tributos.<br>Origem: Sistema Tratamento Tributário - https://api-docs.portalunico.siscomex.gov.br/
 **/
@ApiModel(description="Lista de Tributos.<br>Origem: Sistema Tratamento Tributário - https://api-docs.portalunico.siscomex.gov.br/")
public class TributoItemCover  {
  
  @XmlElement(name="tributo")
  @ApiModelProperty(value = "")
  @Valid
  private TributoCover tributo = null;

  @XmlElement(name="regime")
  @ApiModelProperty(value = "")
  @Valid
  private RegimeCover regime = null;

  @XmlElement(name="fundamento")
  @ApiModelProperty(value = "")
  @Valid
  private FundamentoCover fundamento = null;

  @XmlElement(name="atributos")
  @ApiModelProperty(value = "")
  @Valid
  private List<AtributoTributoCover> atributos = null;
 /**
   * Get tributo
   * @return tributo
  **/
  @JsonProperty("tributo")
  public TributoCover getTributo() {
    return tributo;
  }

  public void setTributo(TributoCover tributo) {
    this.tributo = tributo;
  }

  public TributoItemCover tributo(TributoCover tributo) {
    this.tributo = tributo;
    return this;
  }

 /**
   * Get regime
   * @return regime
  **/
  @JsonProperty("regime")
  public RegimeCover getRegime() {
    return regime;
  }

  public void setRegime(RegimeCover regime) {
    this.regime = regime;
  }

  public TributoItemCover regime(RegimeCover regime) {
    this.regime = regime;
    return this;
  }

 /**
   * Get fundamento
   * @return fundamento
  **/
  @JsonProperty("fundamento")
  public FundamentoCover getFundamento() {
    return fundamento;
  }

  public void setFundamento(FundamentoCover fundamento) {
    this.fundamento = fundamento;
  }

  public TributoItemCover fundamento(FundamentoCover fundamento) {
    this.fundamento = fundamento;
    return this;
  }

 /**
   * Get atributos
   * @return atributos
  **/
  @JsonProperty("atributos")
  public List<AtributoTributoCover> getAtributos() {
    return atributos;
  }

  public void setAtributos(List<AtributoTributoCover> atributos) {
    this.atributos = atributos;
  }

  public TributoItemCover atributos(List<AtributoTributoCover> atributos) {
    this.atributos = atributos;
    return this;
  }

  public TributoItemCover addAtributosItem(AtributoTributoCover atributosItem) {
    this.atributos.add(atributosItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TributoItemCover {\n");
    
    sb.append("    tributo: ").append(toIndentedString(tributo)).append("\n");
    sb.append("    regime: ").append(toIndentedString(regime)).append("\n");
    sb.append("    fundamento: ").append(toIndentedString(fundamento)).append("\n");
    sb.append("    atributos: ").append(toIndentedString(atributos)).append("\n");
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

