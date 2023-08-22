package br.gov.siscomex.portalunico.rcnt.model;

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
 @XmlType(name = "DatasDeOperao", propOrder =
    { "dtHrInicioConferenciaFisica", "dataHoraInicioPosicionamento", "dataHoraFimPosicionamento", "dataHoraInicioConferenciaFisica", "dataHoraFimConferenciaFisica"
})

@XmlRootElement(name="DatasDeOperao")
public class DatasDeOperao  {
  
  @XmlElement(name="dtHrInicioConferenciaFisica")
  @ApiModelProperty(value = "")
  private String dtHrInicioConferenciaFisica = null;

  @XmlElement(name="dataHoraInicioPosicionamento")
  @ApiModelProperty(example = "2020-04-01T10:50:30.150-0300", value = "Informar data e hora do início do posicionamento da carga para fins de conferência física. Deve-se enviar, junto da data, o fuso horário no qual tal data e hora foi gerada.<br/>Formato: 'yyyy-MM-ddTHH:mm:ss.SSSZ'")
 /**
   * Informar data e hora do início do posicionamento da carga para fins de conferência física. Deve-se enviar, junto da data, o fuso horário no qual tal data e hora foi gerada.<br/>Formato: 'yyyy-MM-ddTHH:mm:ss.SSSZ'
  **/
  private String dataHoraInicioPosicionamento = null;

  @XmlElement(name="dataHoraFimPosicionamento")
  @ApiModelProperty(example = "2020-04-01T10:50:30.150-0300", value = "Informar data e hora do final do posicionamento da carga. Após esse momento é possível efetivar a conferência física. Deve-se enviar, junto da data, o fuso horário no qual tal data e hora foi gerada.<br/>Formato: 'yyyy-MM-ddTHH:mm:ss.SSSZ'")
 /**
   * Informar data e hora do final do posicionamento da carga. Após esse momento é possível efetivar a conferência física. Deve-se enviar, junto da data, o fuso horário no qual tal data e hora foi gerada.<br/>Formato: 'yyyy-MM-ddTHH:mm:ss.SSSZ'
  **/
  private String dataHoraFimPosicionamento = null;

  @XmlElement(name="dataHoraInicioConferenciaFisica")
  @ApiModelProperty(example = "2020-04-01T10:50:30.150-0300", value = "Informar data e hora do início da conferência física. Deve-se enviar, junto da data, o fuso horário no qual tal data e hora foi gerada.<br/>Formato: 'yyyy-MM-ddTHH:mm:ss.SSSZ'")
 /**
   * Informar data e hora do início da conferência física. Deve-se enviar, junto da data, o fuso horário no qual tal data e hora foi gerada.<br/>Formato: 'yyyy-MM-ddTHH:mm:ss.SSSZ'
  **/
  private String dataHoraInicioConferenciaFisica = null;

  @XmlElement(name="dataHoraFimConferenciaFisica")
  @ApiModelProperty(example = "2020-04-01T10:50:30.150-0300", value = "Informar data e hora do final da conferência física. Deve-se enviar, junto da data, o fuso horário no qual tal data e hora foi gerada.<br/>Formato: 'yyyy-MM-ddTHH:mm:ss.SSSZ'")
 /**
   * Informar data e hora do final da conferência física. Deve-se enviar, junto da data, o fuso horário no qual tal data e hora foi gerada.<br/>Formato: 'yyyy-MM-ddTHH:mm:ss.SSSZ'
  **/
  private String dataHoraFimConferenciaFisica = null;
 /**
   * Get dtHrInicioConferenciaFisica
   * @return dtHrInicioConferenciaFisica
  **/
  @JsonProperty("dtHrInicioConferenciaFisica")
  public String getDtHrInicioConferenciaFisica() {
    return dtHrInicioConferenciaFisica;
  }

  public void setDtHrInicioConferenciaFisica(String dtHrInicioConferenciaFisica) {
    this.dtHrInicioConferenciaFisica = dtHrInicioConferenciaFisica;
  }

  public DatasDeOperao dtHrInicioConferenciaFisica(String dtHrInicioConferenciaFisica) {
    this.dtHrInicioConferenciaFisica = dtHrInicioConferenciaFisica;
    return this;
  }

 /**
   * Informar data e hora do início do posicionamento da carga para fins de conferência física. Deve-se enviar, junto da data, o fuso horário no qual tal data e hora foi gerada.&lt;br/&gt;Formato: &#39;yyyy-MM-ddTHH:mm:ss.SSSZ&#39;
   * @return dataHoraInicioPosicionamento
  **/
  @JsonProperty("dataHoraInicioPosicionamento")
  public String getDataHoraInicioPosicionamento() {
    return dataHoraInicioPosicionamento;
  }

  public void setDataHoraInicioPosicionamento(String dataHoraInicioPosicionamento) {
    this.dataHoraInicioPosicionamento = dataHoraInicioPosicionamento;
  }

  public DatasDeOperao dataHoraInicioPosicionamento(String dataHoraInicioPosicionamento) {
    this.dataHoraInicioPosicionamento = dataHoraInicioPosicionamento;
    return this;
  }

 /**
   * Informar data e hora do final do posicionamento da carga. Após esse momento é possível efetivar a conferência física. Deve-se enviar, junto da data, o fuso horário no qual tal data e hora foi gerada.&lt;br/&gt;Formato: &#39;yyyy-MM-ddTHH:mm:ss.SSSZ&#39;
   * @return dataHoraFimPosicionamento
  **/
  @JsonProperty("dataHoraFimPosicionamento")
  public String getDataHoraFimPosicionamento() {
    return dataHoraFimPosicionamento;
  }

  public void setDataHoraFimPosicionamento(String dataHoraFimPosicionamento) {
    this.dataHoraFimPosicionamento = dataHoraFimPosicionamento;
  }

  public DatasDeOperao dataHoraFimPosicionamento(String dataHoraFimPosicionamento) {
    this.dataHoraFimPosicionamento = dataHoraFimPosicionamento;
    return this;
  }

 /**
   * Informar data e hora do início da conferência física. Deve-se enviar, junto da data, o fuso horário no qual tal data e hora foi gerada.&lt;br/&gt;Formato: &#39;yyyy-MM-ddTHH:mm:ss.SSSZ&#39;
   * @return dataHoraInicioConferenciaFisica
  **/
  @JsonProperty("dataHoraInicioConferenciaFisica")
  public String getDataHoraInicioConferenciaFisica() {
    return dataHoraInicioConferenciaFisica;
  }

  public void setDataHoraInicioConferenciaFisica(String dataHoraInicioConferenciaFisica) {
    this.dataHoraInicioConferenciaFisica = dataHoraInicioConferenciaFisica;
  }

  public DatasDeOperao dataHoraInicioConferenciaFisica(String dataHoraInicioConferenciaFisica) {
    this.dataHoraInicioConferenciaFisica = dataHoraInicioConferenciaFisica;
    return this;
  }

 /**
   * Informar data e hora do final da conferência física. Deve-se enviar, junto da data, o fuso horário no qual tal data e hora foi gerada.&lt;br/&gt;Formato: &#39;yyyy-MM-ddTHH:mm:ss.SSSZ&#39;
   * @return dataHoraFimConferenciaFisica
  **/
  @JsonProperty("dataHoraFimConferenciaFisica")
  public String getDataHoraFimConferenciaFisica() {
    return dataHoraFimConferenciaFisica;
  }

  public void setDataHoraFimConferenciaFisica(String dataHoraFimConferenciaFisica) {
    this.dataHoraFimConferenciaFisica = dataHoraFimConferenciaFisica;
  }

  public DatasDeOperao dataHoraFimConferenciaFisica(String dataHoraFimConferenciaFisica) {
    this.dataHoraFimConferenciaFisica = dataHoraFimConferenciaFisica;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatasDeOperao {\n");
    
    sb.append("    dtHrInicioConferenciaFisica: ").append(toIndentedString(dtHrInicioConferenciaFisica)).append("\n");
    sb.append("    dataHoraInicioPosicionamento: ").append(toIndentedString(dataHoraInicioPosicionamento)).append("\n");
    sb.append("    dataHoraFimPosicionamento: ").append(toIndentedString(dataHoraFimPosicionamento)).append("\n");
    sb.append("    dataHoraInicioConferenciaFisica: ").append(toIndentedString(dataHoraInicioConferenciaFisica)).append("\n");
    sb.append("    dataHoraFimConferenciaFisica: ").append(toIndentedString(dataHoraFimConferenciaFisica)).append("\n");
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

