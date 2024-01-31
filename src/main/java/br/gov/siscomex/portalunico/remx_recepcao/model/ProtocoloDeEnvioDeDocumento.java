package br.gov.siscomex.portalunico.remx_recepcao.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.time.OffsetDateTime;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "ProtocoloDeEnvioDeDocumento", propOrder =
    { "dataHoraTransmissao", "numeroProtocolo"
})

@XmlRootElement(name="ProtocoloDeEnvioDeDocumento")
public class ProtocoloDeEnvioDeDocumento  {
  
  @XmlElement(name="dataHoraTransmissao", required = true)
  @ApiModelProperty(required = true, value = "Data e Hora de transmissão <br/>Formato: yyyy-MM-dd'T'HH:mm:ss.SSSZ")
 /**
   * Data e Hora de transmissão <br/>Formato: yyyy-MM-dd'T'HH:mm:ss.SSSZ
  **/
  private OffsetDateTime dataHoraTransmissao = null;

  @XmlElement(name="numeroProtocolo", required = true)
  @ApiModelProperty(required = true, value = "Protocolo do Envio <br/>Tamanho: 36")
 /**
   * Protocolo do Envio <br/>Tamanho: 36
  **/
  private String numeroProtocolo = null;
 /**
   * Data e Hora de transmissão &lt;br/&gt;Formato: yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ
   * @return dataHoraTransmissao
  **/
  @JsonProperty("dataHoraTransmissao")
  @NotNull
  public OffsetDateTime getDataHoraTransmissao() {
    return dataHoraTransmissao;
  }

  public void setDataHoraTransmissao(OffsetDateTime dataHoraTransmissao) {
    this.dataHoraTransmissao = dataHoraTransmissao;
  }

  public ProtocoloDeEnvioDeDocumento dataHoraTransmissao(OffsetDateTime dataHoraTransmissao) {
    this.dataHoraTransmissao = dataHoraTransmissao;
    return this;
  }

 /**
   * Protocolo do Envio &lt;br/&gt;Tamanho: 36
   * @return numeroProtocolo
  **/
  @JsonProperty("numeroProtocolo")
  @NotNull
  public String getNumeroProtocolo() {
    return numeroProtocolo;
  }

  public void setNumeroProtocolo(String numeroProtocolo) {
    this.numeroProtocolo = numeroProtocolo;
  }

  public ProtocoloDeEnvioDeDocumento numeroProtocolo(String numeroProtocolo) {
    this.numeroProtocolo = numeroProtocolo;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProtocoloDeEnvioDeDocumento {\n");
    
    sb.append("    dataHoraTransmissao: ").append(toIndentedString(dataHoraTransmissao)).append("\n");
    sb.append("    numeroProtocolo: ").append(toIndentedString(numeroProtocolo)).append("\n");
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

