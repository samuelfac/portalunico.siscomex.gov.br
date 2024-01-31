package br.gov.siscomex.portalunico.remx_consulta.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.time.OffsetDateTime;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "ProcessamentoDeManifestoDePresenaDeCarga", propOrder =
    { "cnpj", "dataHoraProcessamento", "dataHorarioEnvio", "erros", "numeroManifesto", "numeroProtocolo", "remessas", "situacao"
})

@XmlRootElement(name="ProcessamentoDeManifestoDePresenaDeCarga")
public class ProcessamentoDeManifestoDePresenaDeCarga  {
  
  @XmlElement(name="cnpj", required = true)
  @ApiModelProperty(required = true, value = "Contém o CNPJ da empresa para a qual foi registrado o Manifesto.  Exatamente quatorze caracteres numéricos. Não deve conter ‘.’,’-‘ e ‘/’.")
 /**
   * Contém o CNPJ da empresa para a qual foi registrado o Manifesto.  Exatamente quatorze caracteres numéricos. Não deve conter ‘.’,’-‘ e ‘/’.
  **/
  private String cnpj = null;

  @XmlElement(name="dataHoraProcessamento")
  @ApiModelProperty(value = "Contém a data e horário do processamento do documento de presença de carga. <br/>Formato: yyyy-MM-dd'T'HH:mm:ss.SSSZ")
 /**
   * Contém a data e horário do processamento do documento de presença de carga. <br/>Formato: yyyy-MM-dd'T'HH:mm:ss.SSSZ
  **/
  private OffsetDateTime dataHoraProcessamento = null;

  @XmlElement(name="dataHorarioEnvio", required = true)
  @ApiModelProperty(required = true, value = "Contém a data e horário do envio do documento de presença de carga. <br/>Formato: yyyy-MM-dd'T'HH:mm:ss.SSSZ")
 /**
   * Contém a data e horário do envio do documento de presença de carga. <br/>Formato: yyyy-MM-dd'T'HH:mm:ss.SSSZ
  **/
  private OffsetDateTime dataHorarioEnvio = null;

  @XmlElement(name="erros")
  @ApiModelProperty(value = "Lista de erros")
  @Valid
 /**
   * Lista de erros
  **/
  private List<ErroNoProcessamentoDeManifestoDePresenaDeCarga> erros = null;

  @XmlElement(name="numeroManifesto", required = true)
  @ApiModelProperty(required = true, value = "Contém o número do manifesto para o qual foi informado a presença de carga.")
 /**
   * Contém o número do manifesto para o qual foi informado a presença de carga.
  **/
  private String numeroManifesto = null;

  @XmlElement(name="numeroProtocolo", required = true)
  @ApiModelProperty(required = true, value = "Protocolo do Envio <br/>Tamanho: 36")
 /**
   * Protocolo do Envio <br/>Tamanho: 36
  **/
  private String numeroProtocolo = null;

  @XmlElement(name="remessas")
  @ApiModelProperty(value = "Lista de remessas")
  @Valid
 /**
   * Lista de remessas
  **/
  private List<DetalheDoProcessamentoDaRemessa> remessas = null;

  @XmlElement(name="situacao", required = true)
  @ApiModelProperty(required = true, value = "Situacao do processamento</br>0 - Aguardando processamento;</br>1 - Processamento concluído.")
 /**
   * Situacao do processamento</br>0 - Aguardando processamento;</br>1 - Processamento concluído.
  **/
  private Integer situacao = null;
 /**
   * Contém o CNPJ da empresa para a qual foi registrado o Manifesto.  Exatamente quatorze caracteres numéricos. Não deve conter ‘.’,’-‘ e ‘/’.
   * @return cnpj
  **/
  @JsonProperty("cnpj")
  @NotNull
  public String getCnpj() {
    return cnpj;
  }

  public void setCnpj(String cnpj) {
    this.cnpj = cnpj;
  }

  public ProcessamentoDeManifestoDePresenaDeCarga cnpj(String cnpj) {
    this.cnpj = cnpj;
    return this;
  }

 /**
   * Contém a data e horário do processamento do documento de presença de carga. &lt;br/&gt;Formato: yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ
   * @return dataHoraProcessamento
  **/
  @JsonProperty("dataHoraProcessamento")
  public OffsetDateTime getDataHoraProcessamento() {
    return dataHoraProcessamento;
  }

  public void setDataHoraProcessamento(OffsetDateTime dataHoraProcessamento) {
    this.dataHoraProcessamento = dataHoraProcessamento;
  }

  public ProcessamentoDeManifestoDePresenaDeCarga dataHoraProcessamento(OffsetDateTime dataHoraProcessamento) {
    this.dataHoraProcessamento = dataHoraProcessamento;
    return this;
  }

 /**
   * Contém a data e horário do envio do documento de presença de carga. &lt;br/&gt;Formato: yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ
   * @return dataHorarioEnvio
  **/
  @JsonProperty("dataHorarioEnvio")
  @NotNull
  public OffsetDateTime getDataHorarioEnvio() {
    return dataHorarioEnvio;
  }

  public void setDataHorarioEnvio(OffsetDateTime dataHorarioEnvio) {
    this.dataHorarioEnvio = dataHorarioEnvio;
  }

  public ProcessamentoDeManifestoDePresenaDeCarga dataHorarioEnvio(OffsetDateTime dataHorarioEnvio) {
    this.dataHorarioEnvio = dataHorarioEnvio;
    return this;
  }

 /**
   * Lista de erros
   * @return erros
  **/
  @JsonProperty("erros")
  public List<ErroNoProcessamentoDeManifestoDePresenaDeCarga> getErros() {
    return erros;
  }

  public void setErros(List<ErroNoProcessamentoDeManifestoDePresenaDeCarga> erros) {
    this.erros = erros;
  }

  public ProcessamentoDeManifestoDePresenaDeCarga erros(List<ErroNoProcessamentoDeManifestoDePresenaDeCarga> erros) {
    this.erros = erros;
    return this;
  }

  public ProcessamentoDeManifestoDePresenaDeCarga addErrosItem(ErroNoProcessamentoDeManifestoDePresenaDeCarga errosItem) {
    this.erros.add(errosItem);
    return this;
  }

 /**
   * Contém o número do manifesto para o qual foi informado a presença de carga.
   * @return numeroManifesto
  **/
  @JsonProperty("numeroManifesto")
  @NotNull
  public String getNumeroManifesto() {
    return numeroManifesto;
  }

  public void setNumeroManifesto(String numeroManifesto) {
    this.numeroManifesto = numeroManifesto;
  }

  public ProcessamentoDeManifestoDePresenaDeCarga numeroManifesto(String numeroManifesto) {
    this.numeroManifesto = numeroManifesto;
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

  public ProcessamentoDeManifestoDePresenaDeCarga numeroProtocolo(String numeroProtocolo) {
    this.numeroProtocolo = numeroProtocolo;
    return this;
  }

 /**
   * Lista de remessas
   * @return remessas
  **/
  @JsonProperty("remessas")
  public List<DetalheDoProcessamentoDaRemessa> getRemessas() {
    return remessas;
  }

  public void setRemessas(List<DetalheDoProcessamentoDaRemessa> remessas) {
    this.remessas = remessas;
  }

  public ProcessamentoDeManifestoDePresenaDeCarga remessas(List<DetalheDoProcessamentoDaRemessa> remessas) {
    this.remessas = remessas;
    return this;
  }

  public ProcessamentoDeManifestoDePresenaDeCarga addRemessasItem(DetalheDoProcessamentoDaRemessa remessasItem) {
    this.remessas.add(remessasItem);
    return this;
  }

 /**
   * Situacao do processamento&lt;/br&gt;0 - Aguardando processamento;&lt;/br&gt;1 - Processamento concluído.
   * @return situacao
  **/
  @JsonProperty("situacao")
  @NotNull
  public Integer getSituacao() {
    return situacao;
  }

  public void setSituacao(Integer situacao) {
    this.situacao = situacao;
  }

  public ProcessamentoDeManifestoDePresenaDeCarga situacao(Integer situacao) {
    this.situacao = situacao;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessamentoDeManifestoDePresenaDeCarga {\n");
    
    sb.append("    cnpj: ").append(toIndentedString(cnpj)).append("\n");
    sb.append("    dataHoraProcessamento: ").append(toIndentedString(dataHoraProcessamento)).append("\n");
    sb.append("    dataHorarioEnvio: ").append(toIndentedString(dataHorarioEnvio)).append("\n");
    sb.append("    erros: ").append(toIndentedString(erros)).append("\n");
    sb.append("    numeroManifesto: ").append(toIndentedString(numeroManifesto)).append("\n");
    sb.append("    numeroProtocolo: ").append(toIndentedString(numeroProtocolo)).append("\n");
    sb.append("    remessas: ").append(toIndentedString(remessas)).append("\n");
    sb.append("    situacao: ").append(toIndentedString(situacao)).append("\n");
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

