package br.gov.siscomex.portalunico.ccta.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "DesbloqueioConsultaDetalhada", propOrder =
    { "alcanceBloqueio", "dataHoraBloqueio", "dataHoraDesbloqueio", "justificativaBloqueio", "justificativaDesbloqueio", "motivoBloqueio", "responsavelBloqueio", "responsavelDesbloqueio", "tipoBloqueio"
})

@XmlRootElement(name="DesbloqueioConsultaDetalhada")
public class DesbloqueioConsultaDetalhada  {
  

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

  @XmlElement(name="dataHoraDesbloqueio")
  @ApiModelProperty(example = "12/02/2021 21:21", value = "Data na qual a o desbloqueio foi aplicado<br/> ")
 /**
   * Data na qual a o desbloqueio foi aplicado<br/> 
  **/
  private String dataHoraDesbloqueio = null;

  @XmlElement(name="justificativaBloqueio")
  @ApiModelProperty(example = "Texto examplo de justificativa", value = "Justificativa para o bloqueio / desbloqueio aplicado<br>Tamanho: 512<br/>")
 /**
   * Justificativa para o bloqueio / desbloqueio aplicado<br>Tamanho: 512<br/>
  **/
  private String justificativaBloqueio = null;

  @XmlElement(name="justificativaDesbloqueio")
  @ApiModelProperty(example = "Texto examplo de justificativa", value = "Justificativa para o bloqueio / desbloqueio aplicado<br>Tamanho: 512<br/>")
 /**
   * Justificativa para o bloqueio / desbloqueio aplicado<br>Tamanho: 512<br/>
  **/
  private String justificativaDesbloqueio = null;

  @XmlElement(name="motivoBloqueio")
  @ApiModelProperty(example = "Carga em abandono", value = "Motivo do bloqueio aplicado<br>Tamanho: 100<br/>")
 /**
   * Motivo do bloqueio aplicado<br>Tamanho: 100<br/>
  **/
  private String motivoBloqueio = null;

  @XmlElement(name="responsavelBloqueio")
  @ApiModelProperty(example = "PORTO DO RIO", value = "Setor responsável pela aplicação do bloqueio / desbloqueio<br>Tamanho: 50<br/>")
 /**
   * Setor responsável pela aplicação do bloqueio / desbloqueio<br>Tamanho: 50<br/>
  **/
  private String responsavelBloqueio = null;

  @XmlElement(name="responsavelDesbloqueio")
  @ApiModelProperty(example = "PORTO DO RIO", value = "Setor responsável pela aplicação do bloqueio / desbloqueio<br>Tamanho: 50<br/>")
 /**
   * Setor responsável pela aplicação do bloqueio / desbloqueio<br>Tamanho: 50<br/>
  **/
  private String responsavelDesbloqueio = null;

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

  public DesbloqueioConsultaDetalhada alcanceBloqueio(AlcanceBloqueioEnum alcanceBloqueio) {
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

  public DesbloqueioConsultaDetalhada dataHoraBloqueio(String dataHoraBloqueio) {
    this.dataHoraBloqueio = dataHoraBloqueio;
    return this;
  }

 /**
   * Data na qual a o desbloqueio foi aplicado&lt;br/&gt; 
   * @return dataHoraDesbloqueio
  **/
  @JsonProperty("dataHoraDesbloqueio")
  public String getDataHoraDesbloqueio() {
    return dataHoraDesbloqueio;
  }

  public void setDataHoraDesbloqueio(String dataHoraDesbloqueio) {
    this.dataHoraDesbloqueio = dataHoraDesbloqueio;
  }

  public DesbloqueioConsultaDetalhada dataHoraDesbloqueio(String dataHoraDesbloqueio) {
    this.dataHoraDesbloqueio = dataHoraDesbloqueio;
    return this;
  }

 /**
   * Justificativa para o bloqueio / desbloqueio aplicado&lt;br&gt;Tamanho: 512&lt;br/&gt;
   * @return justificativaBloqueio
  **/
  @JsonProperty("justificativaBloqueio")
  public String getJustificativaBloqueio() {
    return justificativaBloqueio;
  }

  public void setJustificativaBloqueio(String justificativaBloqueio) {
    this.justificativaBloqueio = justificativaBloqueio;
  }

  public DesbloqueioConsultaDetalhada justificativaBloqueio(String justificativaBloqueio) {
    this.justificativaBloqueio = justificativaBloqueio;
    return this;
  }

 /**
   * Justificativa para o bloqueio / desbloqueio aplicado&lt;br&gt;Tamanho: 512&lt;br/&gt;
   * @return justificativaDesbloqueio
  **/
  @JsonProperty("justificativaDesbloqueio")
  public String getJustificativaDesbloqueio() {
    return justificativaDesbloqueio;
  }

  public void setJustificativaDesbloqueio(String justificativaDesbloqueio) {
    this.justificativaDesbloqueio = justificativaDesbloqueio;
  }

  public DesbloqueioConsultaDetalhada justificativaDesbloqueio(String justificativaDesbloqueio) {
    this.justificativaDesbloqueio = justificativaDesbloqueio;
    return this;
  }

 /**
   * Motivo do bloqueio aplicado&lt;br&gt;Tamanho: 100&lt;br/&gt;
   * @return motivoBloqueio
  **/
  @JsonProperty("motivoBloqueio")
  public String getMotivoBloqueio() {
    return motivoBloqueio;
  }

  public void setMotivoBloqueio(String motivoBloqueio) {
    this.motivoBloqueio = motivoBloqueio;
  }

  public DesbloqueioConsultaDetalhada motivoBloqueio(String motivoBloqueio) {
    this.motivoBloqueio = motivoBloqueio;
    return this;
  }

 /**
   * Setor responsável pela aplicação do bloqueio / desbloqueio&lt;br&gt;Tamanho: 50&lt;br/&gt;
   * @return responsavelBloqueio
  **/
  @JsonProperty("responsavelBloqueio")
  public String getResponsavelBloqueio() {
    return responsavelBloqueio;
  }

  public void setResponsavelBloqueio(String responsavelBloqueio) {
    this.responsavelBloqueio = responsavelBloqueio;
  }

  public DesbloqueioConsultaDetalhada responsavelBloqueio(String responsavelBloqueio) {
    this.responsavelBloqueio = responsavelBloqueio;
    return this;
  }

 /**
   * Setor responsável pela aplicação do bloqueio / desbloqueio&lt;br&gt;Tamanho: 50&lt;br/&gt;
   * @return responsavelDesbloqueio
  **/
  @JsonProperty("responsavelDesbloqueio")
  public String getResponsavelDesbloqueio() {
    return responsavelDesbloqueio;
  }

  public void setResponsavelDesbloqueio(String responsavelDesbloqueio) {
    this.responsavelDesbloqueio = responsavelDesbloqueio;
  }

  public DesbloqueioConsultaDetalhada responsavelDesbloqueio(String responsavelDesbloqueio) {
    this.responsavelDesbloqueio = responsavelDesbloqueio;
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

  public DesbloqueioConsultaDetalhada tipoBloqueio(String tipoBloqueio) {
    this.tipoBloqueio = tipoBloqueio;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DesbloqueioConsultaDetalhada {\n");
    
    sb.append("    alcanceBloqueio: ").append(toIndentedString(alcanceBloqueio)).append("\n");
    sb.append("    dataHoraBloqueio: ").append(toIndentedString(dataHoraBloqueio)).append("\n");
    sb.append("    dataHoraDesbloqueio: ").append(toIndentedString(dataHoraDesbloqueio)).append("\n");
    sb.append("    justificativaBloqueio: ").append(toIndentedString(justificativaBloqueio)).append("\n");
    sb.append("    justificativaDesbloqueio: ").append(toIndentedString(justificativaDesbloqueio)).append("\n");
    sb.append("    motivoBloqueio: ").append(toIndentedString(motivoBloqueio)).append("\n");
    sb.append("    responsavelBloqueio: ").append(toIndentedString(responsavelBloqueio)).append("\n");
    sb.append("    responsavelDesbloqueio: ").append(toIndentedString(responsavelDesbloqueio)).append("\n");
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

