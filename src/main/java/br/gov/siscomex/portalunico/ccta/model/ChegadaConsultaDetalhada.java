package br.gov.siscomex.portalunico.ccta.model;

import java.util.List;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "ChegadaConsultaDetalhada", propOrder =
    { "codigoAeroportoChegada", "dataHoraChegadaPrevista", "dataHoraPartidaPrevista", "dataHoraChegadaEfetiva", "termoEntrada", "prefixoAeronaveChegadaEfetiva", "uldBlks"
})

@XmlRootElement(name="ChegadaConsultaDetalhada")
public class ChegadaConsultaDetalhada  {
  
  @XmlElement(name="codigoAeroportoChegada")
  @ApiModelProperty(example = "GIG", value = "Código IATA do aeroporto<br/>Tamanho: 3")
 /**
   * Código IATA do aeroporto<br/>Tamanho: 3
  **/
  private String codigoAeroportoChegada = null;

  @XmlElement(name="dataHoraChegadaPrevista")
  @ApiModelProperty(example = "12/02/2021 21:21 ", value = "Data/Hora de chegada prevista.")
 /**
   * Data/Hora de chegada prevista.
  **/
  private String dataHoraChegadaPrevista = null;

  @XmlElement(name="dataHoraPartidaPrevista")
  @ApiModelProperty(example = "12/02/2021 21:21 ", value = "Data/Hora de partida prevista.<br/> Formato: yyyy-MM-dd'T'HH:mm:ssZ")
 /**
   * Data/Hora de partida prevista.<br/> Formato: yyyy-MM-dd'T'HH:mm:ssZ
  **/
  private String dataHoraPartidaPrevista = null;

  @XmlElement(name="dataHoraChegadaEfetiva")
  @ApiModelProperty(example = "12/02/2021 21:21 ", value = "Data/Hora de chegada efetiva.")
 /**
   * Data/Hora de chegada efetiva.
  **/
  private String dataHoraChegadaEfetiva = null;

  @XmlElement(name="termoEntrada")
  @ApiModelProperty(example = "209876543", value = "Número do termo gerado no sistema Mantra<br/>Tamanho: 9<br/>Formato: NNNNNNNNN")
 /**
   * Número do termo gerado no sistema Mantra<br/>Tamanho: 9<br/>Formato: NNNNNNNNN
  **/
  private String termoEntrada = null;

  @XmlElement(name="prefixoAeronaveChegadaEfetiva")
  @ApiModelProperty(example = "N659UA", value = "Prefixo da aeronave<br/>Tamanho máximo: 70")
 /**
   * Prefixo da aeronave<br/>Tamanho máximo: 70
  **/
  private String prefixoAeronaveChegadaEfetiva = null;

  @XmlElement(name="uldBlks")
  @ApiModelProperty(value = "Lista contendo as Ulds da carga<br/>")
  @Valid
 /**
   * Lista contendo as Ulds da carga<br/>
  **/
  private List<UldBlkConsultaDetalhada> uldBlks = null;
 /**
   * Código IATA do aeroporto&lt;br/&gt;Tamanho: 3
   * @return codigoAeroportoChegada
  **/
  @JsonProperty("codigoAeroportoChegada")
  public String getCodigoAeroportoChegada() {
    return codigoAeroportoChegada;
  }

  public void setCodigoAeroportoChegada(String codigoAeroportoChegada) {
    this.codigoAeroportoChegada = codigoAeroportoChegada;
  }

  public ChegadaConsultaDetalhada codigoAeroportoChegada(String codigoAeroportoChegada) {
    this.codigoAeroportoChegada = codigoAeroportoChegada;
    return this;
  }

 /**
   * Data/Hora de chegada prevista.
   * @return dataHoraChegadaPrevista
  **/
  @JsonProperty("dataHoraChegadaPrevista")
  public String getDataHoraChegadaPrevista() {
    return dataHoraChegadaPrevista;
  }

  public void setDataHoraChegadaPrevista(String dataHoraChegadaPrevista) {
    this.dataHoraChegadaPrevista = dataHoraChegadaPrevista;
  }

  public ChegadaConsultaDetalhada dataHoraChegadaPrevista(String dataHoraChegadaPrevista) {
    this.dataHoraChegadaPrevista = dataHoraChegadaPrevista;
    return this;
  }

 /**
   * Data/Hora de partida prevista.&lt;br/&gt; Formato: yyyy-MM-dd&#39;T&#39;HH:mm:ssZ
   * @return dataHoraPartidaPrevista
  **/
  @JsonProperty("dataHoraPartidaPrevista")
  public String getDataHoraPartidaPrevista() {
    return dataHoraPartidaPrevista;
  }

  public void setDataHoraPartidaPrevista(String dataHoraPartidaPrevista) {
    this.dataHoraPartidaPrevista = dataHoraPartidaPrevista;
  }

  public ChegadaConsultaDetalhada dataHoraPartidaPrevista(String dataHoraPartidaPrevista) {
    this.dataHoraPartidaPrevista = dataHoraPartidaPrevista;
    return this;
  }

 /**
   * Data/Hora de chegada efetiva.
   * @return dataHoraChegadaEfetiva
  **/
  @JsonProperty("dataHoraChegadaEfetiva")
  public String getDataHoraChegadaEfetiva() {
    return dataHoraChegadaEfetiva;
  }

  public void setDataHoraChegadaEfetiva(String dataHoraChegadaEfetiva) {
    this.dataHoraChegadaEfetiva = dataHoraChegadaEfetiva;
  }

  public ChegadaConsultaDetalhada dataHoraChegadaEfetiva(String dataHoraChegadaEfetiva) {
    this.dataHoraChegadaEfetiva = dataHoraChegadaEfetiva;
    return this;
  }

 /**
   * Número do termo gerado no sistema Mantra&lt;br/&gt;Tamanho: 9&lt;br/&gt;Formato: NNNNNNNNN
   * @return termoEntrada
  **/
  @JsonProperty("termoEntrada")
  public String getTermoEntrada() {
    return termoEntrada;
  }

  public void setTermoEntrada(String termoEntrada) {
    this.termoEntrada = termoEntrada;
  }

  public ChegadaConsultaDetalhada termoEntrada(String termoEntrada) {
    this.termoEntrada = termoEntrada;
    return this;
  }

 /**
   * Prefixo da aeronave&lt;br/&gt;Tamanho máximo: 70
   * @return prefixoAeronaveChegadaEfetiva
  **/
  @JsonProperty("prefixoAeronaveChegadaEfetiva")
  public String getPrefixoAeronaveChegadaEfetiva() {
    return prefixoAeronaveChegadaEfetiva;
  }

  public void setPrefixoAeronaveChegadaEfetiva(String prefixoAeronaveChegadaEfetiva) {
    this.prefixoAeronaveChegadaEfetiva = prefixoAeronaveChegadaEfetiva;
  }

  public ChegadaConsultaDetalhada prefixoAeronaveChegadaEfetiva(String prefixoAeronaveChegadaEfetiva) {
    this.prefixoAeronaveChegadaEfetiva = prefixoAeronaveChegadaEfetiva;
    return this;
  }

 /**
   * Lista contendo as Ulds da carga&lt;br/&gt;
   * @return uldBlks
  **/
  @JsonProperty("uldBlks")
  public List<UldBlkConsultaDetalhada> getUldBlks() {
    return uldBlks;
  }

  public void setUldBlks(List<UldBlkConsultaDetalhada> uldBlks) {
    this.uldBlks = uldBlks;
  }

  public ChegadaConsultaDetalhada uldBlks(List<UldBlkConsultaDetalhada> uldBlks) {
    this.uldBlks = uldBlks;
    return this;
  }

  public ChegadaConsultaDetalhada addUldBlksItem(UldBlkConsultaDetalhada uldBlksItem) {
    this.uldBlks.add(uldBlksItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChegadaConsultaDetalhada {\n");
    
    sb.append("    codigoAeroportoChegada: ").append(toIndentedString(codigoAeroportoChegada)).append("\n");
    sb.append("    dataHoraChegadaPrevista: ").append(toIndentedString(dataHoraChegadaPrevista)).append("\n");
    sb.append("    dataHoraPartidaPrevista: ").append(toIndentedString(dataHoraPartidaPrevista)).append("\n");
    sb.append("    dataHoraChegadaEfetiva: ").append(toIndentedString(dataHoraChegadaEfetiva)).append("\n");
    sb.append("    termoEntrada: ").append(toIndentedString(termoEntrada)).append("\n");
    sb.append("    prefixoAeronaveChegadaEfetiva: ").append(toIndentedString(prefixoAeronaveChegadaEfetiva)).append("\n");
    sb.append("    uldBlks: ").append(toIndentedString(uldBlks)).append("\n");
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

