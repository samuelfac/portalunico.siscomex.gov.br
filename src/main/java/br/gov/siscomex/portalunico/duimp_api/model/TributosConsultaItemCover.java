package br.gov.siscomex.portalunico.duimp_api.model;

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
 @XmlType(name = "TributosConsultaItemCover", propOrder =
    { "mercadoria", "tributosAplicados", "tributosCalculados"
})

@XmlRootElement(name="TributosConsultaItemCover")
/**
  * Lista de Tributos.<br>Origem: Sistema Tratamento Tributário - https://api-docs.portalunico.siscomex.gov.br/
 **/
@ApiModel(description="Lista de Tributos.<br>Origem: Sistema Tratamento Tributário - https://api-docs.portalunico.siscomex.gov.br/")
public class TributosConsultaItemCover  {
  
  @XmlElement(name="mercadoria")
  @ApiModelProperty(value = "")
  @Valid
  private MercadoriaValoresCalculadosItemCover mercadoria = null;

  @XmlElement(name="tributosAplicados")
  @ApiModelProperty(value = "")
  @Valid
  private List<TributoItemCover> tributosAplicados = null;

  @XmlElement(name="tributosCalculados")
  @ApiModelProperty(value = "")
  @Valid
  private List<TributoCalculadoItemCover> tributosCalculados = null;
 /**
   * Get mercadoria
   * @return mercadoria
  **/
  @JsonProperty("mercadoria")
  public MercadoriaValoresCalculadosItemCover getMercadoria() {
    return mercadoria;
  }

  public void setMercadoria(MercadoriaValoresCalculadosItemCover mercadoria) {
    this.mercadoria = mercadoria;
  }

  public TributosConsultaItemCover mercadoria(MercadoriaValoresCalculadosItemCover mercadoria) {
    this.mercadoria = mercadoria;
    return this;
  }

 /**
   * Get tributosAplicados
   * @return tributosAplicados
  **/
  @JsonProperty("tributosAplicados")
  public List<TributoItemCover> getTributosAplicados() {
    return tributosAplicados;
  }

  public void setTributosAplicados(List<TributoItemCover> tributosAplicados) {
    this.tributosAplicados = tributosAplicados;
  }

  public TributosConsultaItemCover tributosAplicados(List<TributoItemCover> tributosAplicados) {
    this.tributosAplicados = tributosAplicados;
    return this;
  }

  public TributosConsultaItemCover addTributosAplicadosItem(TributoItemCover tributosAplicadosItem) {
    this.tributosAplicados.add(tributosAplicadosItem);
    return this;
  }

 /**
   * Get tributosCalculados
   * @return tributosCalculados
  **/
  @JsonProperty("tributosCalculados")
  public List<TributoCalculadoItemCover> getTributosCalculados() {
    return tributosCalculados;
  }

  public void setTributosCalculados(List<TributoCalculadoItemCover> tributosCalculados) {
    this.tributosCalculados = tributosCalculados;
  }

  public TributosConsultaItemCover tributosCalculados(List<TributoCalculadoItemCover> tributosCalculados) {
    this.tributosCalculados = tributosCalculados;
    return this;
  }

  public TributosConsultaItemCover addTributosCalculadosItem(TributoCalculadoItemCover tributosCalculadosItem) {
    this.tributosCalculados.add(tributosCalculadosItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TributosConsultaItemCover {\n");
    
    sb.append("    mercadoria: ").append(toIndentedString(mercadoria)).append("\n");
    sb.append("    tributosAplicados: ").append(toIndentedString(tributosAplicados)).append("\n");
    sb.append("    tributosCalculados: ").append(toIndentedString(tributosCalculados)).append("\n");
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

