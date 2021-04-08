package br.gov.siscomex.portalunico.rcnt.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "DadosAgendaOperaoNaviosAeronavesOperao", propOrder =
    { "dataHoraInicioOperacao", "dataHoraFimOperacao"
})

@XmlRootElement(name="DadosAgendaOperaoNaviosAeronavesOperao")
public class DadosAgendaOperaoNaviosAeronavesOperao  {
  
  @XmlElement(name="dataHoraInicioOperacao")
  @ApiModelProperty(example = "2020-04-01T10:50:30.150-0300", value = "Data e hora do início da operação no navio ou aeronave. Deve-se enviar, junto da data, o fuso horário no qual tal data e hora foi gerada<br/>Formato: 'yyyy-MM-ddTHH:mm:ss.SSSZ'")
 /**
   * Data e hora do início da operação no navio ou aeronave. Deve-se enviar, junto da data, o fuso horário no qual tal data e hora foi gerada<br/>Formato: 'yyyy-MM-ddTHH:mm:ss.SSSZ'
  **/
  private String dataHoraInicioOperacao = null;

  @XmlElement(name="dataHoraFimOperacao")
  @ApiModelProperty(example = "2020-04-01T10:50:30.150-0300", value = "Data e hora do final da operação no navio ou aeronave. Deve-se enviar, junto da data, o fuso horário no qual tal data e hora foi gerada.<br/>Formato: 'yyyy-MM-ddTHH:mm:ss.SSSZ'")
 /**
   * Data e hora do final da operação no navio ou aeronave. Deve-se enviar, junto da data, o fuso horário no qual tal data e hora foi gerada.<br/>Formato: 'yyyy-MM-ddTHH:mm:ss.SSSZ'
  **/
  private String dataHoraFimOperacao = null;
 /**
   * Data e hora do início da operação no navio ou aeronave. Deve-se enviar, junto da data, o fuso horário no qual tal data e hora foi gerada&lt;br/&gt;Formato: &#39;yyyy-MM-ddTHH:mm:ss.SSSZ&#39;
   * @return dataHoraInicioOperacao
  **/
  @JsonProperty("dataHoraInicioOperacao")
  public String getDataHoraInicioOperacao() {
    return dataHoraInicioOperacao;
  }

  public void setDataHoraInicioOperacao(String dataHoraInicioOperacao) {
    this.dataHoraInicioOperacao = dataHoraInicioOperacao;
  }

  public DadosAgendaOperaoNaviosAeronavesOperao dataHoraInicioOperacao(String dataHoraInicioOperacao) {
    this.dataHoraInicioOperacao = dataHoraInicioOperacao;
    return this;
  }

 /**
   * Data e hora do final da operação no navio ou aeronave. Deve-se enviar, junto da data, o fuso horário no qual tal data e hora foi gerada.&lt;br/&gt;Formato: &#39;yyyy-MM-ddTHH:mm:ss.SSSZ&#39;
   * @return dataHoraFimOperacao
  **/
  @JsonProperty("dataHoraFimOperacao")
  public String getDataHoraFimOperacao() {
    return dataHoraFimOperacao;
  }

  public void setDataHoraFimOperacao(String dataHoraFimOperacao) {
    this.dataHoraFimOperacao = dataHoraFimOperacao;
  }

  public DadosAgendaOperaoNaviosAeronavesOperao dataHoraFimOperacao(String dataHoraFimOperacao) {
    this.dataHoraFimOperacao = dataHoraFimOperacao;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DadosAgendaOperaoNaviosAeronavesOperao {\n");
    
    sb.append("    dataHoraInicioOperacao: ").append(toIndentedString(dataHoraInicioOperacao)).append("\n");
    sb.append("    dataHoraFimOperacao: ").append(toIndentedString(dataHoraFimOperacao)).append("\n");
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

