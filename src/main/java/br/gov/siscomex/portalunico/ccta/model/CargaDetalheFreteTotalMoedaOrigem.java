package br.gov.siscomex.portalunico.ccta.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "CargaDetalheFreteTotalMoedaOrigem", propOrder =
    { "tipo", "valorCollect", "valorPrepaid"
})

@XmlRootElement(name="CargaDetalheFreteTotalMoedaOrigem")
public class CargaDetalheFreteTotalMoedaOrigem  {
  
  @XmlElement(name="tipo")
  @ApiModelProperty(value = "")
  @Valid
  private TipoTotalMoedaOrigem tipo = null;

  @XmlElement(name="valorCollect")
  @ApiModelProperty(value = "")
  @Valid
  private ValorMonetario valorCollect = null;

  @XmlElement(name="valorPrepaid")
  @ApiModelProperty(value = "")
  @Valid
  private ValorMonetario valorPrepaid = null;
 /**
   * Get tipo
   * @return tipo
  **/
  @JsonProperty("tipo")
  public TipoTotalMoedaOrigem getTipo() {
    return tipo;
  }

  public void setTipo(TipoTotalMoedaOrigem tipo) {
    this.tipo = tipo;
  }

  public CargaDetalheFreteTotalMoedaOrigem tipo(TipoTotalMoedaOrigem tipo) {
    this.tipo = tipo;
    return this;
  }

 /**
   * Get valorCollect
   * @return valorCollect
  **/
  @JsonProperty("valorCollect")
  public ValorMonetario getValorCollect() {
    return valorCollect;
  }

  public void setValorCollect(ValorMonetario valorCollect) {
    this.valorCollect = valorCollect;
  }

  public CargaDetalheFreteTotalMoedaOrigem valorCollect(ValorMonetario valorCollect) {
    this.valorCollect = valorCollect;
    return this;
  }

 /**
   * Get valorPrepaid
   * @return valorPrepaid
  **/
  @JsonProperty("valorPrepaid")
  public ValorMonetario getValorPrepaid() {
    return valorPrepaid;
  }

  public void setValorPrepaid(ValorMonetario valorPrepaid) {
    this.valorPrepaid = valorPrepaid;
  }

  public CargaDetalheFreteTotalMoedaOrigem valorPrepaid(ValorMonetario valorPrepaid) {
    this.valorPrepaid = valorPrepaid;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CargaDetalheFreteTotalMoedaOrigem {\n");
    
    sb.append("    tipo: ").append(toIndentedString(tipo)).append("\n");
    sb.append("    valorCollect: ").append(toIndentedString(valorCollect)).append("\n");
    sb.append("    valorPrepaid: ").append(toIndentedString(valorPrepaid)).append("\n");
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

