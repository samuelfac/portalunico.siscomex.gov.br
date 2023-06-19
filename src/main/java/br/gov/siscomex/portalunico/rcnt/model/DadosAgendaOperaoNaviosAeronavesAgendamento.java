package br.gov.siscomex.portalunico.rcnt.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "DadosAgendaOperaoNaviosAeronavesAgendamento", propOrder =
    { "dataHoraPrevisaoChegada", "dataHoraPrevisaoSaida"
})

@XmlRootElement(name="DadosAgendaOperaoNaviosAeronavesAgendamento")
public class DadosAgendaOperaoNaviosAeronavesAgendamento  {
  
  @XmlElement(name="dataHoraPrevisaoChegada")
  @ApiModelProperty(example = "2020-04-01T10:50:30.150-0300", value = "Data e hora previstas para atracação de navio ou pouso de aeronave. Deve-se enviar, junto da data, o fuso horário no qual tal data e hora foi gerada<br/>Formato: 'yyyy-MM-ddTHH:mm:ss.SSSZ'")
 /**
   * Data e hora previstas para atracação de navio ou pouso de aeronave. Deve-se enviar, junto da data, o fuso horário no qual tal data e hora foi gerada<br/>Formato: 'yyyy-MM-ddTHH:mm:ss.SSSZ'
  **/
  private String dataHoraPrevisaoChegada = null;

  @XmlElement(name="dataHoraPrevisaoSaida")
  @ApiModelProperty(example = "2020-04-01T10:50:30.150-0300", value = "Data e hora previstas para desatracação de navio ou decolagem de aeronave. Deve-se enviar, junto da data, o fuso horário no qual tal data e hora foi gerada<br/>Formato: 'yyyy-MM-ddTHH:mm:ss.SSSZ'")
 /**
   * Data e hora previstas para desatracação de navio ou decolagem de aeronave. Deve-se enviar, junto da data, o fuso horário no qual tal data e hora foi gerada<br/>Formato: 'yyyy-MM-ddTHH:mm:ss.SSSZ'
  **/
  private String dataHoraPrevisaoSaida = null;
 /**
   * Data e hora previstas para atracação de navio ou pouso de aeronave. Deve-se enviar, junto da data, o fuso horário no qual tal data e hora foi gerada&lt;br/&gt;Formato: &#39;yyyy-MM-ddTHH:mm:ss.SSSZ&#39;
   * @return dataHoraPrevisaoChegada
  **/
  @JsonProperty("dataHoraPrevisaoChegada")
  public String getDataHoraPrevisaoChegada() {
    return dataHoraPrevisaoChegada;
  }

  public void setDataHoraPrevisaoChegada(String dataHoraPrevisaoChegada) {
    this.dataHoraPrevisaoChegada = dataHoraPrevisaoChegada;
  }

  public DadosAgendaOperaoNaviosAeronavesAgendamento dataHoraPrevisaoChegada(String dataHoraPrevisaoChegada) {
    this.dataHoraPrevisaoChegada = dataHoraPrevisaoChegada;
    return this;
  }

 /**
   * Data e hora previstas para desatracação de navio ou decolagem de aeronave. Deve-se enviar, junto da data, o fuso horário no qual tal data e hora foi gerada&lt;br/&gt;Formato: &#39;yyyy-MM-ddTHH:mm:ss.SSSZ&#39;
   * @return dataHoraPrevisaoSaida
  **/
  @JsonProperty("dataHoraPrevisaoSaida")
  public String getDataHoraPrevisaoSaida() {
    return dataHoraPrevisaoSaida;
  }

  public void setDataHoraPrevisaoSaida(String dataHoraPrevisaoSaida) {
    this.dataHoraPrevisaoSaida = dataHoraPrevisaoSaida;
  }

  public DadosAgendaOperaoNaviosAeronavesAgendamento dataHoraPrevisaoSaida(String dataHoraPrevisaoSaida) {
    this.dataHoraPrevisaoSaida = dataHoraPrevisaoSaida;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DadosAgendaOperaoNaviosAeronavesAgendamento {\n");
    
    sb.append("    dataHoraPrevisaoChegada: ").append(toIndentedString(dataHoraPrevisaoChegada)).append("\n");
    sb.append("    dataHoraPrevisaoSaida: ").append(toIndentedString(dataHoraPrevisaoSaida)).append("\n");
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

