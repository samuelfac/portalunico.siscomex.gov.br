package br.gov.siscomex.portalunico.rcnt.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "DadosAgendaOperaoNaviosAeronavesChegada", propOrder =
    { "dataHoraChegada", "dataHoraSaida"
})

@XmlRootElement(name="DadosAgendaOperaoNaviosAeronavesChegada")
public class DadosAgendaOperaoNaviosAeronavesChegada  {
  
  @XmlElement(name="dataHoraChegada")
  @ApiModelProperty(example = "2020-04-01T10:50:30.150-0300", value = "Data e hora da atracação do navio ou pouso da aeronave. Deve-se enviar, junto da data, o fuso horário no qual tal data e hora foi gerada.<br/>Formato: 'yyyy-MM-ddTHH:mm:ss.SSSZ'")
 /**
   * Data e hora da atracação do navio ou pouso da aeronave. Deve-se enviar, junto da data, o fuso horário no qual tal data e hora foi gerada.<br/>Formato: 'yyyy-MM-ddTHH:mm:ss.SSSZ'
  **/
  private String dataHoraChegada = null;

  @XmlElement(name="dataHoraSaida")
  @ApiModelProperty(example = "2020-04-01T10:50:30.150-0300", value = "Data e hora da desatracação do navio ou decolagem da aeronave. Deve-se enviar, junto da data, o fuso horário no qual tal data e hora foi gerada.<br/>Formato: 'yyyy-MM-ddTHH:mm:ss.SSSZ'")
 /**
   * Data e hora da desatracação do navio ou decolagem da aeronave. Deve-se enviar, junto da data, o fuso horário no qual tal data e hora foi gerada.<br/>Formato: 'yyyy-MM-ddTHH:mm:ss.SSSZ'
  **/
  private String dataHoraSaida = null;
 /**
   * Data e hora da atracação do navio ou pouso da aeronave. Deve-se enviar, junto da data, o fuso horário no qual tal data e hora foi gerada.&lt;br/&gt;Formato: &#39;yyyy-MM-ddTHH:mm:ss.SSSZ&#39;
   * @return dataHoraChegada
  **/
  @JsonProperty("dataHoraChegada")
  public String getDataHoraChegada() {
    return dataHoraChegada;
  }

  public void setDataHoraChegada(String dataHoraChegada) {
    this.dataHoraChegada = dataHoraChegada;
  }

  public DadosAgendaOperaoNaviosAeronavesChegada dataHoraChegada(String dataHoraChegada) {
    this.dataHoraChegada = dataHoraChegada;
    return this;
  }

 /**
   * Data e hora da desatracação do navio ou decolagem da aeronave. Deve-se enviar, junto da data, o fuso horário no qual tal data e hora foi gerada.&lt;br/&gt;Formato: &#39;yyyy-MM-ddTHH:mm:ss.SSSZ&#39;
   * @return dataHoraSaida
  **/
  @JsonProperty("dataHoraSaida")
  public String getDataHoraSaida() {
    return dataHoraSaida;
  }

  public void setDataHoraSaida(String dataHoraSaida) {
    this.dataHoraSaida = dataHoraSaida;
  }

  public DadosAgendaOperaoNaviosAeronavesChegada dataHoraSaida(String dataHoraSaida) {
    this.dataHoraSaida = dataHoraSaida;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DadosAgendaOperaoNaviosAeronavesChegada {\n");
    
    sb.append("    dataHoraChegada: ").append(toIndentedString(dataHoraChegada)).append("\n");
    sb.append("    dataHoraSaida: ").append(toIndentedString(dataHoraSaida)).append("\n");
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

