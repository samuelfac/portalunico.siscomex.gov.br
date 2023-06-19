package br.gov.siscomex.portalunico.duimp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.xml.bind.annotation.*;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "TributoAplicadoCover", propOrder =
    { "tributo", "regime", "fundamentoLegal", "atributosDinamicos"
})

@XmlRootElement(name="TributoAplicadoCover")
/**
  * Dados de um tributo aplicado
 **/
@ApiModel(description="Dados de um tributo aplicado")
public class TributoAplicadoCover  {
  
  @XmlElement(name="tributo")
  @ApiModelProperty(value = "")
  @Valid
  private TipoDeTributoObjetoCompostoPelosAtributosCdigoEDescrio tributo = null;

  @XmlElement(name="regime")
  @ApiModelProperty(value = "")
  @Valid
  private RegimeTributrioObjetoCompostoPelosAtributosCdigoEDescrio regime = null;

  @XmlElement(name="fundamentoLegal")
  @ApiModelProperty(value = "")
  @Valid
  private FundamentoLegalDoRegimeTributrioDeImportaoObjetoCompostoPelosAtributosCdigoEDescrio fundamentoLegal = null;

  @XmlElement(name="atributosDinamicos")
  @ApiModelProperty(value = "Lista de atributos dinâmicos dos tributos")
  @Valid
 /**
   * Lista de atributos dinâmicos dos tributos
  **/
  private List<AtributoTributoCover> atributosDinamicos = null;
 /**
   * Get tributo
   * @return tributo
  **/
  @JsonProperty("tributo")
  public TipoDeTributoObjetoCompostoPelosAtributosCdigoEDescrio getTributo() {
    return tributo;
  }

  public void setTributo(TipoDeTributoObjetoCompostoPelosAtributosCdigoEDescrio tributo) {
    this.tributo = tributo;
  }

  public TributoAplicadoCover tributo(TipoDeTributoObjetoCompostoPelosAtributosCdigoEDescrio tributo) {
    this.tributo = tributo;
    return this;
  }

 /**
   * Get regime
   * @return regime
  **/
  @JsonProperty("regime")
  public RegimeTributrioObjetoCompostoPelosAtributosCdigoEDescrio getRegime() {
    return regime;
  }

  public void setRegime(RegimeTributrioObjetoCompostoPelosAtributosCdigoEDescrio regime) {
    this.regime = regime;
  }

  public TributoAplicadoCover regime(RegimeTributrioObjetoCompostoPelosAtributosCdigoEDescrio regime) {
    this.regime = regime;
    return this;
  }

 /**
   * Get fundamentoLegal
   * @return fundamentoLegal
  **/
  @JsonProperty("fundamentoLegal")
  public FundamentoLegalDoRegimeTributrioDeImportaoObjetoCompostoPelosAtributosCdigoEDescrio getFundamentoLegal() {
    return fundamentoLegal;
  }

  public void setFundamentoLegal(FundamentoLegalDoRegimeTributrioDeImportaoObjetoCompostoPelosAtributosCdigoEDescrio fundamentoLegal) {
    this.fundamentoLegal = fundamentoLegal;
  }

  public TributoAplicadoCover fundamentoLegal(FundamentoLegalDoRegimeTributrioDeImportaoObjetoCompostoPelosAtributosCdigoEDescrio fundamentoLegal) {
    this.fundamentoLegal = fundamentoLegal;
    return this;
  }

 /**
   * Lista de atributos dinâmicos dos tributos
   * @return atributosDinamicos
  **/
  @JsonProperty("atributosDinamicos")
  public List<AtributoTributoCover> getAtributosDinamicos() {
    return atributosDinamicos;
  }

  public void setAtributosDinamicos(List<AtributoTributoCover> atributosDinamicos) {
    this.atributosDinamicos = atributosDinamicos;
  }

  public TributoAplicadoCover atributosDinamicos(List<AtributoTributoCover> atributosDinamicos) {
    this.atributosDinamicos = atributosDinamicos;
    return this;
  }

  public TributoAplicadoCover addAtributosDinamicosItem(AtributoTributoCover atributosDinamicosItem) {
    this.atributosDinamicos.add(atributosDinamicosItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TributoAplicadoCover {\n");
    
    sb.append("    tributo: ").append(toIndentedString(tributo)).append("\n");
    sb.append("    regime: ").append(toIndentedString(regime)).append("\n");
    sb.append("    fundamentoLegal: ").append(toIndentedString(fundamentoLegal)).append("\n");
    sb.append("    atributosDinamicos: ").append(toIndentedString(atributosDinamicos)).append("\n");
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

