package br.gov.siscomex.portalunico.ccta.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "BloqueioCargaConsultaResumida", propOrder =
    { "alcanceBloqueio", "dataHoraBloqueio", "tipoBloqueio"
})

@XmlRootElement(name="BloqueioCargaConsultaResumida")
public class BloqueioCargaConsultaResumida  {
  

@XmlType(name="AlcanceBloqueioEnum")
@XmlEnum(String.class)
public enum AlcanceBloqueioEnum {

	@XmlEnumValue("T")
	@JsonProperty("T")
	T(String.valueOf("T")),
	
	@XmlEnumValue("P")
	@JsonProperty("P")
	P(String.valueOf("P"));


    private String value;

    AlcanceBloqueioEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static AlcanceBloqueioEnum fromValue(String v) {
        for (AlcanceBloqueioEnum b : AlcanceBloqueioEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to AlcanceBloqueioEnum");
    }
}

  @XmlElement(name="alcanceBloqueio")
  @ApiModelProperty(example = "T", value = "Indica o alcance do bloqueio.<br/> Tamanho: 1<br/>T - Total<br/>P - Parcial")
 /**
   * Indica o alcance do bloqueio.<br/> Tamanho: 1<br/>T - Total<br/>P - Parcial
  **/
  private AlcanceBloqueioEnum alcanceBloqueio = null;

  @XmlElement(name="dataHoraBloqueio")
  @ApiModelProperty(example = "12/02/2021 21:21", value = "Data na qual a o bloqueio foi aplicado<br/> ")
 /**
   * Data na qual a o bloqueio foi aplicado<br/> 
  **/
  private String dataHoraBloqueio = null;

  @XmlElement(name="tipoBloqueio")
  @ApiModelProperty(example = "Impede vinculação a documento de saída DI, DSI eletrônica, DTA", value = "Tipo do bloqueio aplicado<br>Tamanho: 100<br/>")
 /**
   * Tipo do bloqueio aplicado<br>Tamanho: 100<br/>
  **/
  private String tipoBloqueio = null;
 /**
   * Indica o alcance do bloqueio.&lt;br/&gt; Tamanho: 1&lt;br/&gt;T - Total&lt;br/&gt;P - Parcial
   * @return alcanceBloqueio
  **/
  @JsonProperty("alcanceBloqueio")
  public String getAlcanceBloqueio() {
    if (alcanceBloqueio == null) {
      return null;
    }
    return alcanceBloqueio.value();
  }

  public void setAlcanceBloqueio(AlcanceBloqueioEnum alcanceBloqueio) {
    this.alcanceBloqueio = alcanceBloqueio;
  }

  public BloqueioCargaConsultaResumida alcanceBloqueio(AlcanceBloqueioEnum alcanceBloqueio) {
    this.alcanceBloqueio = alcanceBloqueio;
    return this;
  }

 /**
   * Data na qual a o bloqueio foi aplicado&lt;br/&gt; 
   * @return dataHoraBloqueio
  **/
  @JsonProperty("dataHoraBloqueio")
  public String getDataHoraBloqueio() {
    return dataHoraBloqueio;
  }

  public void setDataHoraBloqueio(String dataHoraBloqueio) {
    this.dataHoraBloqueio = dataHoraBloqueio;
  }

  public BloqueioCargaConsultaResumida dataHoraBloqueio(String dataHoraBloqueio) {
    this.dataHoraBloqueio = dataHoraBloqueio;
    return this;
  }

 /**
   * Tipo do bloqueio aplicado&lt;br&gt;Tamanho: 100&lt;br/&gt;
   * @return tipoBloqueio
  **/
  @JsonProperty("tipoBloqueio")
  public String getTipoBloqueio() {
    return tipoBloqueio;
  }

  public void setTipoBloqueio(String tipoBloqueio) {
    this.tipoBloqueio = tipoBloqueio;
  }

  public BloqueioCargaConsultaResumida tipoBloqueio(String tipoBloqueio) {
    this.tipoBloqueio = tipoBloqueio;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BloqueioCargaConsultaResumida {\n");
    
    sb.append("    alcanceBloqueio: ").append(toIndentedString(alcanceBloqueio)).append("\n");
    sb.append("    dataHoraBloqueio: ").append(toIndentedString(dataHoraBloqueio)).append("\n");
    sb.append("    tipoBloqueio: ").append(toIndentedString(tipoBloqueio)).append("\n");
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

