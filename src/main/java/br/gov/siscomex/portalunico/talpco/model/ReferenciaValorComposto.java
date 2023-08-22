package br.gov.siscomex.portalunico.talpco.model;

import br.gov.siscomex.portalunico.talpco.model.ReferenciaExportadorEFabricanteDoProduto;
import br.gov.siscomex.portalunico.talpco.model.ReferenciaFabricante;
import br.gov.siscomex.portalunico.talpco.model.ReferenciaImportacaoTerceiro;
import br.gov.siscomex.portalunico.talpco.model.ReferenciaOperadorEstrangeiro;
import br.gov.siscomex.portalunico.talpco.model.ReferenciaValorAtributoComposto;
import br.gov.siscomex.portalunico.talpco.model.ReferenciaValorCampoFundamentoLegal;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
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
 @XmlType(name = "ReferenciaValorComposto", propOrder =
    { "indicacaoImportacaoTerceiros", "exportadorEstrangeiro", "exportadorEFabricanteDoProduto", "fabricante", "fundamentoLegal", "listaComposicaoAtributo"
})

@XmlRootElement(name="ReferenciaValorComposto")
/**
  * Estrutura que guarda o valor de um campo composto de um LPCO. Apenas um dos campos desta estrutura estará preenchido, dependendo do tipo do campo.
 **/
@ApiModel(description="Estrutura que guarda o valor de um campo composto de um LPCO. Apenas um dos campos desta estrutura estará preenchido, dependendo do tipo do campo.")
public class ReferenciaValorComposto  {
  
  @XmlElement(name="indicacaoImportacaoTerceiros")
  @ApiModelProperty(value = "")
  @Valid
  private ReferenciaImportacaoTerceiro indicacaoImportacaoTerceiros = null;

  @XmlElement(name="exportadorEstrangeiro")
  @ApiModelProperty(value = "")
  @Valid
  private ReferenciaOperadorEstrangeiro exportadorEstrangeiro = null;

  @XmlElement(name="exportadorEFabricanteDoProduto")
  @ApiModelProperty(value = "")
  @Valid
  private ReferenciaExportadorEFabricanteDoProduto exportadorEFabricanteDoProduto = null;

  @XmlElement(name="fabricante")
  @ApiModelProperty(value = "")
  @Valid
  private ReferenciaFabricante fabricante = null;

  @XmlElement(name="fundamentoLegal")
  @ApiModelProperty(value = "")
  @Valid
  private ReferenciaValorCampoFundamentoLegal fundamentoLegal = null;

  @XmlElement(name="listaComposicaoAtributo")
  @ApiModelProperty(value = "Lista de Atributos Compostos.<br>")
  @Valid
 /**
   * Lista de Atributos Compostos.<br>
  **/
  private List<List<ReferenciaValorAtributoComposto>> listaComposicaoAtributo = null;
 /**
   * Get indicacaoImportacaoTerceiros
   * @return indicacaoImportacaoTerceiros
  **/
  @JsonProperty("indicacaoImportacaoTerceiros")
  public ReferenciaImportacaoTerceiro getIndicacaoImportacaoTerceiros() {
    return indicacaoImportacaoTerceiros;
  }

  public void setIndicacaoImportacaoTerceiros(ReferenciaImportacaoTerceiro indicacaoImportacaoTerceiros) {
    this.indicacaoImportacaoTerceiros = indicacaoImportacaoTerceiros;
  }

  public ReferenciaValorComposto indicacaoImportacaoTerceiros(ReferenciaImportacaoTerceiro indicacaoImportacaoTerceiros) {
    this.indicacaoImportacaoTerceiros = indicacaoImportacaoTerceiros;
    return this;
  }

 /**
   * Get exportadorEstrangeiro
   * @return exportadorEstrangeiro
  **/
  @JsonProperty("exportadorEstrangeiro")
  public ReferenciaOperadorEstrangeiro getExportadorEstrangeiro() {
    return exportadorEstrangeiro;
  }

  public void setExportadorEstrangeiro(ReferenciaOperadorEstrangeiro exportadorEstrangeiro) {
    this.exportadorEstrangeiro = exportadorEstrangeiro;
  }

  public ReferenciaValorComposto exportadorEstrangeiro(ReferenciaOperadorEstrangeiro exportadorEstrangeiro) {
    this.exportadorEstrangeiro = exportadorEstrangeiro;
    return this;
  }

 /**
   * Get exportadorEFabricanteDoProduto
   * @return exportadorEFabricanteDoProduto
  **/
  @JsonProperty("exportadorEFabricanteDoProduto")
  public ReferenciaExportadorEFabricanteDoProduto getExportadorEFabricanteDoProduto() {
    return exportadorEFabricanteDoProduto;
  }

  public void setExportadorEFabricanteDoProduto(ReferenciaExportadorEFabricanteDoProduto exportadorEFabricanteDoProduto) {
    this.exportadorEFabricanteDoProduto = exportadorEFabricanteDoProduto;
  }

  public ReferenciaValorComposto exportadorEFabricanteDoProduto(ReferenciaExportadorEFabricanteDoProduto exportadorEFabricanteDoProduto) {
    this.exportadorEFabricanteDoProduto = exportadorEFabricanteDoProduto;
    return this;
  }

 /**
   * Get fabricante
   * @return fabricante
  **/
  @JsonProperty("fabricante")
  public ReferenciaFabricante getFabricante() {
    return fabricante;
  }

  public void setFabricante(ReferenciaFabricante fabricante) {
    this.fabricante = fabricante;
  }

  public ReferenciaValorComposto fabricante(ReferenciaFabricante fabricante) {
    this.fabricante = fabricante;
    return this;
  }

 /**
   * Get fundamentoLegal
   * @return fundamentoLegal
  **/
  @JsonProperty("fundamentoLegal")
  public ReferenciaValorCampoFundamentoLegal getFundamentoLegal() {
    return fundamentoLegal;
  }

  public void setFundamentoLegal(ReferenciaValorCampoFundamentoLegal fundamentoLegal) {
    this.fundamentoLegal = fundamentoLegal;
  }

  public ReferenciaValorComposto fundamentoLegal(ReferenciaValorCampoFundamentoLegal fundamentoLegal) {
    this.fundamentoLegal = fundamentoLegal;
    return this;
  }

 /**
   * Lista de Atributos Compostos.&lt;br&gt;
   * @return listaComposicaoAtributo
  **/
  @JsonProperty("listaComposicaoAtributo")
  public List<List<ReferenciaValorAtributoComposto>> getListaComposicaoAtributo() {
    return listaComposicaoAtributo;
  }

  public void setListaComposicaoAtributo(List<List<ReferenciaValorAtributoComposto>> listaComposicaoAtributo) {
    this.listaComposicaoAtributo = listaComposicaoAtributo;
  }

  public ReferenciaValorComposto listaComposicaoAtributo(List<List<ReferenciaValorAtributoComposto>> listaComposicaoAtributo) {
    this.listaComposicaoAtributo = listaComposicaoAtributo;
    return this;
  }

  public ReferenciaValorComposto addListaComposicaoAtributoItem(List<ReferenciaValorAtributoComposto> listaComposicaoAtributoItem) {
    this.listaComposicaoAtributo.add(listaComposicaoAtributoItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReferenciaValorComposto {\n");
    
    sb.append("    indicacaoImportacaoTerceiros: ").append(toIndentedString(indicacaoImportacaoTerceiros)).append("\n");
    sb.append("    exportadorEstrangeiro: ").append(toIndentedString(exportadorEstrangeiro)).append("\n");
    sb.append("    exportadorEFabricanteDoProduto: ").append(toIndentedString(exportadorEFabricanteDoProduto)).append("\n");
    sb.append("    fabricante: ").append(toIndentedString(fabricante)).append("\n");
    sb.append("    fundamentoLegal: ").append(toIndentedString(fundamentoLegal)).append("\n");
    sb.append("    listaComposicaoAtributo: ").append(toIndentedString(listaComposicaoAtributo)).append("\n");
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

