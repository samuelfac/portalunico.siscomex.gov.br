package br.gov.siscomex.portalunico.rcnt.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "RespostaParaSucessoNaRecepoDeEventoAduaneiro", propOrder =
    { "cabecalhoRequisicao", "dataHoraTransmissao", "protocolo"
})

@XmlRootElement(name="RespostaParaSucessoNaRecepoDeEventoAduaneiro")
public class RespostaParaSucessoNaRecepoDeEventoAduaneiro  {
  
  @XmlElement(name="cabecalhoRequisicao", required = true)
  @ApiModelProperty(required = true, value = "")
  @Valid
  private CabealhoEnvioEventoAduaneiro cabecalhoRequisicao = null;

  @XmlElement(name="dataHoraTransmissao", required = true)
  @ApiModelProperty(example = "2020-04-01T10:50:30.150-0300", required = true, value = "Data e Hora de transmissão <br/>Formato: 'yyyy-MM-ddTHH:mm:ss.SSSZ'")
 /**
   * Data e Hora de transmissão <br/>Formato: 'yyyy-MM-ddTHH:mm:ss.SSSZ'
  **/
  private String dataHoraTransmissao = null;

  @XmlElement(name="protocolo", required = true)
  @ApiModelProperty(required = true, value = "Protocolo do Evento<br/>Tamanho: 36")
 /**
   * Protocolo do Evento<br/>Tamanho: 36
  **/
  private String protocolo = null;
 /**
   * Get cabecalhoRequisicao
   * @return cabecalhoRequisicao
  **/
  @JsonProperty("cabecalhoRequisicao")
  @NotNull
  public CabealhoEnvioEventoAduaneiro getCabecalhoRequisicao() {
    return cabecalhoRequisicao;
  }

  public void setCabecalhoRequisicao(CabealhoEnvioEventoAduaneiro cabecalhoRequisicao) {
    this.cabecalhoRequisicao = cabecalhoRequisicao;
  }

  public RespostaParaSucessoNaRecepoDeEventoAduaneiro cabecalhoRequisicao(CabealhoEnvioEventoAduaneiro cabecalhoRequisicao) {
    this.cabecalhoRequisicao = cabecalhoRequisicao;
    return this;
  }

 /**
   * Data e Hora de transmissão &lt;br/&gt;Formato: &#39;yyyy-MM-ddTHH:mm:ss.SSSZ&#39;
   * @return dataHoraTransmissao
  **/
  @JsonProperty("dataHoraTransmissao")
  @NotNull
  public String getDataHoraTransmissao() {
    return dataHoraTransmissao;
  }

  public void setDataHoraTransmissao(String dataHoraTransmissao) {
    this.dataHoraTransmissao = dataHoraTransmissao;
  }

  public RespostaParaSucessoNaRecepoDeEventoAduaneiro dataHoraTransmissao(String dataHoraTransmissao) {
    this.dataHoraTransmissao = dataHoraTransmissao;
    return this;
  }

 /**
   * Protocolo do Evento&lt;br/&gt;Tamanho: 36
   * @return protocolo
  **/
  @JsonProperty("protocolo")
  @NotNull
  public String getProtocolo() {
    return protocolo;
  }

  public void setProtocolo(String protocolo) {
    this.protocolo = protocolo;
  }

  public RespostaParaSucessoNaRecepoDeEventoAduaneiro protocolo(String protocolo) {
    this.protocolo = protocolo;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RespostaParaSucessoNaRecepoDeEventoAduaneiro {\n");
    
    sb.append("    cabecalhoRequisicao: ").append(toIndentedString(cabecalhoRequisicao)).append("\n");
    sb.append("    dataHoraTransmissao: ").append(toIndentedString(dataHoraTransmissao)).append("\n");
    sb.append("    protocolo: ").append(toIndentedString(protocolo)).append("\n");
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

