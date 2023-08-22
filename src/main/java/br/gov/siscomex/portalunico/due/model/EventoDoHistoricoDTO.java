package br.gov.siscomex.portalunico.due.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.time.OffsetDateTime;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "EventoDoHistoricoDTO", propOrder =
    { "dataEHoraDoEvento", "detalhes", "evento", "informacoesAdicionais", "motivo", "responsavel"
})

@XmlRootElement(name="EventoDoHistoricoDTO")
public class EventoDoHistoricoDTO  {
  
  @XmlElement(name="dataEHoraDoEvento")
  @ApiModelProperty(example = "2019-09-20T14:13:46.966Z", value = "Data e hora do evento<br />Formato:'yyyy-MM-dd'T'HH:mm:ss.SSSZ'")
 /**
   * Data e hora do evento<br />Formato:'yyyy-MM-dd'T'HH:mm:ss.SSSZ'
  **/
  private OffsetDateTime dataEHoraDoEvento = null;

  @XmlElement(name="detalhes")
  @ApiModelProperty(value = "Detalhes<br />Tamanho mínimo: 0<br />Tamanho máximo: 400")
 /**
   * Detalhes<br />Tamanho mínimo: 0<br />Tamanho máximo: 400
  **/
  private String detalhes = null;

  @XmlElement(name="evento")
  @ApiModelProperty(value = "Evento<br />Tamanho mínimo: 1<br />Tamanho máximo: 150")
 /**
   * Evento<br />Tamanho mínimo: 1<br />Tamanho máximo: 150
  **/
  private String evento = null;

  @XmlElement(name="informacoesAdicionais")
  @ApiModelProperty(value = "Informações adicionais<br />Tamanho mínimo: 0<br />Tamanho máximo: 4000")
 /**
   * Informações adicionais<br />Tamanho mínimo: 0<br />Tamanho máximo: 4000
  **/
  private String informacoesAdicionais = null;

  @XmlElement(name="motivo")
  @ApiModelProperty(value = "Motivo<br />Tamanho mínimo: 0<br />Tamanho máximo: 150")
 /**
   * Motivo<br />Tamanho mínimo: 0<br />Tamanho máximo: 150
  **/
  private String motivo = null;

  @XmlElement(name="responsavel")
  @ApiModelProperty(value = "Responsável<br />Tamanho mínimo: 1<br />Tamanho máximo: 100")
 /**
   * Responsável<br />Tamanho mínimo: 1<br />Tamanho máximo: 100
  **/
  private String responsavel = null;
 /**
   * Data e hora do evento&lt;br /&gt;Formato:&#39;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#39;
   * @return dataEHoraDoEvento
  **/
  @JsonProperty("dataEHoraDoEvento")
  public OffsetDateTime getDataEHoraDoEvento() {
    return dataEHoraDoEvento;
  }

  public void setDataEHoraDoEvento(OffsetDateTime dataEHoraDoEvento) {
    this.dataEHoraDoEvento = dataEHoraDoEvento;
  }

  public EventoDoHistoricoDTO dataEHoraDoEvento(OffsetDateTime dataEHoraDoEvento) {
    this.dataEHoraDoEvento = dataEHoraDoEvento;
    return this;
  }

 /**
   * Detalhes&lt;br /&gt;Tamanho mínimo: 0&lt;br /&gt;Tamanho máximo: 400
   * @return detalhes
  **/
  @JsonProperty("detalhes")
  public String getDetalhes() {
    return detalhes;
  }

  public void setDetalhes(String detalhes) {
    this.detalhes = detalhes;
  }

  public EventoDoHistoricoDTO detalhes(String detalhes) {
    this.detalhes = detalhes;
    return this;
  }

 /**
   * Evento&lt;br /&gt;Tamanho mínimo: 1&lt;br /&gt;Tamanho máximo: 150
   * @return evento
  **/
  @JsonProperty("evento")
  public String getEvento() {
    return evento;
  }

  public void setEvento(String evento) {
    this.evento = evento;
  }

  public EventoDoHistoricoDTO evento(String evento) {
    this.evento = evento;
    return this;
  }

 /**
   * Informações adicionais&lt;br /&gt;Tamanho mínimo: 0&lt;br /&gt;Tamanho máximo: 4000
   * @return informacoesAdicionais
  **/
  @JsonProperty("informacoesAdicionais")
  public String getInformacoesAdicionais() {
    return informacoesAdicionais;
  }

  public void setInformacoesAdicionais(String informacoesAdicionais) {
    this.informacoesAdicionais = informacoesAdicionais;
  }

  public EventoDoHistoricoDTO informacoesAdicionais(String informacoesAdicionais) {
    this.informacoesAdicionais = informacoesAdicionais;
    return this;
  }

 /**
   * Motivo&lt;br /&gt;Tamanho mínimo: 0&lt;br /&gt;Tamanho máximo: 150
   * @return motivo
  **/
  @JsonProperty("motivo")
  public String getMotivo() {
    return motivo;
  }

  public void setMotivo(String motivo) {
    this.motivo = motivo;
  }

  public EventoDoHistoricoDTO motivo(String motivo) {
    this.motivo = motivo;
    return this;
  }

 /**
   * Responsável&lt;br /&gt;Tamanho mínimo: 1&lt;br /&gt;Tamanho máximo: 100
   * @return responsavel
  **/
  @JsonProperty("responsavel")
  public String getResponsavel() {
    return responsavel;
  }

  public void setResponsavel(String responsavel) {
    this.responsavel = responsavel;
  }

  public EventoDoHistoricoDTO responsavel(String responsavel) {
    this.responsavel = responsavel;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventoDoHistoricoDTO {\n");
    
    sb.append("    dataEHoraDoEvento: ").append(toIndentedString(dataEHoraDoEvento)).append("\n");
    sb.append("    detalhes: ").append(toIndentedString(detalhes)).append("\n");
    sb.append("    evento: ").append(toIndentedString(evento)).append("\n");
    sb.append("    informacoesAdicionais: ").append(toIndentedString(informacoesAdicionais)).append("\n");
    sb.append("    motivo: ").append(toIndentedString(motivo)).append("\n");
    sb.append("    responsavel: ").append(toIndentedString(responsavel)).append("\n");
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

