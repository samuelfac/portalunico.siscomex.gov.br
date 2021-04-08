package br.gov.siscomex.portalunico.duimp.model;

import java.util.List;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "ItemTributoCover", propOrder =
    { "dadosMercadoria", "valorMercadoria", "tributosAplicados", "calculosTributos"
})

@XmlRootElement(name="ItemTributoCover")
/**
  * Dados da mercadoria e dos tributos do item
 **/
@ApiModel(description="Dados da mercadoria e dos tributos do item")
public class ItemTributoCover  {
  
  @XmlElement(name="dadosMercadoria")
  @ApiModelProperty(value = "")
  @Valid
  private DadosMercadoriaCover dadosMercadoria = null;

  @XmlElement(name="valorMercadoria")
  @ApiModelProperty(value = "")
  @Valid
  private ValorMercadoriaCover valorMercadoria = null;

  @XmlElement(name="tributosAplicados")
  @ApiModelProperty(value = "Lista de tributos aplicados")
  @Valid
 /**
   * Lista de tributos aplicados
  **/
  private List<TributoAplicadoCover> tributosAplicados = null;

  @XmlElement(name="calculosTributos")
  @ApiModelProperty(value = "Lista de tributos calculados")
  @Valid
 /**
   * Lista de tributos calculados
  **/
  private List<CalculoTributoCover> calculosTributos = null;
 /**
   * Get dadosMercadoria
   * @return dadosMercadoria
  **/
  @JsonProperty("dadosMercadoria")
  public DadosMercadoriaCover getDadosMercadoria() {
    return dadosMercadoria;
  }

  public void setDadosMercadoria(DadosMercadoriaCover dadosMercadoria) {
    this.dadosMercadoria = dadosMercadoria;
  }

  public ItemTributoCover dadosMercadoria(DadosMercadoriaCover dadosMercadoria) {
    this.dadosMercadoria = dadosMercadoria;
    return this;
  }

 /**
   * Get valorMercadoria
   * @return valorMercadoria
  **/
  @JsonProperty("valorMercadoria")
  public ValorMercadoriaCover getValorMercadoria() {
    return valorMercadoria;
  }

  public void setValorMercadoria(ValorMercadoriaCover valorMercadoria) {
    this.valorMercadoria = valorMercadoria;
  }

  public ItemTributoCover valorMercadoria(ValorMercadoriaCover valorMercadoria) {
    this.valorMercadoria = valorMercadoria;
    return this;
  }

 /**
   * Lista de tributos aplicados
   * @return tributosAplicados
  **/
  @JsonProperty("tributosAplicados")
  public List<TributoAplicadoCover> getTributosAplicados() {
    return tributosAplicados;
  }

  public void setTributosAplicados(List<TributoAplicadoCover> tributosAplicados) {
    this.tributosAplicados = tributosAplicados;
  }

  public ItemTributoCover tributosAplicados(List<TributoAplicadoCover> tributosAplicados) {
    this.tributosAplicados = tributosAplicados;
    return this;
  }

  public ItemTributoCover addTributosAplicadosItem(TributoAplicadoCover tributosAplicadosItem) {
    this.tributosAplicados.add(tributosAplicadosItem);
    return this;
  }

 /**
   * Lista de tributos calculados
   * @return calculosTributos
  **/
  @JsonProperty("calculosTributos")
  public List<CalculoTributoCover> getCalculosTributos() {
    return calculosTributos;
  }

  public void setCalculosTributos(List<CalculoTributoCover> calculosTributos) {
    this.calculosTributos = calculosTributos;
  }

  public ItemTributoCover calculosTributos(List<CalculoTributoCover> calculosTributos) {
    this.calculosTributos = calculosTributos;
    return this;
  }

  public ItemTributoCover addCalculosTributosItem(CalculoTributoCover calculosTributosItem) {
    this.calculosTributos.add(calculosTributosItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemTributoCover {\n");
    
    sb.append("    dadosMercadoria: ").append(toIndentedString(dadosMercadoria)).append("\n");
    sb.append("    valorMercadoria: ").append(toIndentedString(valorMercadoria)).append("\n");
    sb.append("    tributosAplicados: ").append(toIndentedString(tributosAplicados)).append("\n");
    sb.append("    calculosTributos: ").append(toIndentedString(calculosTributos)).append("\n");
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

