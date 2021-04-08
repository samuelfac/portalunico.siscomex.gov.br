package br.gov.siscomex.portalunico.duimp.model;

import java.time.OffsetDateTime;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "DuimpHistEventoCover", propOrder =
    { "numeroDuimp", "versaoDuimp", "evento", "dataHora"
})

@XmlRootElement(name="DuimpHistEventoCover")
/**
  * Dados de um evento no histórico de operações da Duimp
 **/
@ApiModel(description="Dados de um evento no histórico de operações da Duimp")
public class DuimpHistEventoCover  {
  
  @XmlElement(name="numeroDuimp")
  @ApiModelProperty(example = "19BR00000004677", value = "Número da Duimp<br>Tamanho: 15<br>Formato: 'NNAANNNNNNNNNNN'<br>Lei de formação. O número da Duimp é composto por: <br>* NN = Corresponde ao ano do registro da Declaração. <br>* AA = Corresponde à sigla do país de emissão do documento (BR).<br>* NNNNNNNNNN = 10 caracteres númericos. Número sequencial da Duimp dentro do ano.<br>* N = 1 caracter númerico. DV para todos os demais caracteres numéricos (Módulo 11)")
 /**
   * Número da Duimp<br>Tamanho: 15<br>Formato: 'NNAANNNNNNNNNNN'<br>Lei de formação. O número da Duimp é composto por: <br>* NN = Corresponde ao ano do registro da Declaração. <br>* AA = Corresponde à sigla do país de emissão do documento (BR).<br>* NNNNNNNNNN = 10 caracteres númericos. Número sequencial da Duimp dentro do ano.<br>* N = 1 caracter númerico. DV para todos os demais caracteres numéricos (Módulo 11)
  **/
  private String numeroDuimp = null;

  @XmlElement(name="versaoDuimp")
  @ApiModelProperty(example = "1", value = "Versão da Duimp em que ocorreu o evento<br>Valor mínimo: 1<br>Valor máximo: 9999")
 /**
   * Versão da Duimp em que ocorreu o evento<br>Valor mínimo: 1<br>Valor máximo: 9999
  **/
  private Integer versaoDuimp = null;

  @XmlElement(name="evento")
  @ApiModelProperty(value = "")
  @Valid
  private TipoDeEventoObjetoCompostoPelosAtributosCdigoEDescrio evento = null;

  @XmlElement(name="dataHora")
  @ApiModelProperty(value = "Data e hora em que o evento ocorreu.<br>Formato: 'yyyy-MM-dd'T'HH:mm:ss.SSSZ'")
 /**
   * Data e hora em que o evento ocorreu.<br>Formato: 'yyyy-MM-dd'T'HH:mm:ss.SSSZ'
  **/
  private OffsetDateTime dataHora = null;
 /**
   * Número da Duimp&lt;br&gt;Tamanho: 15&lt;br&gt;Formato: &#39;NNAANNNNNNNNNNN&#39;&lt;br&gt;Lei de formação. O número da Duimp é composto por: &lt;br&gt;* NN &#x3D; Corresponde ao ano do registro da Declaração. &lt;br&gt;* AA &#x3D; Corresponde à sigla do país de emissão do documento (BR).&lt;br&gt;* NNNNNNNNNN &#x3D; 10 caracteres númericos. Número sequencial da Duimp dentro do ano.&lt;br&gt;* N &#x3D; 1 caracter númerico. DV para todos os demais caracteres numéricos (Módulo 11)
   * @return numeroDuimp
  **/
  @JsonProperty("numeroDuimp")
  public String getNumeroDuimp() {
    return numeroDuimp;
  }

  public void setNumeroDuimp(String numeroDuimp) {
    this.numeroDuimp = numeroDuimp;
  }

  public DuimpHistEventoCover numeroDuimp(String numeroDuimp) {
    this.numeroDuimp = numeroDuimp;
    return this;
  }

 /**
   * Versão da Duimp em que ocorreu o evento&lt;br&gt;Valor mínimo: 1&lt;br&gt;Valor máximo: 9999
   * @return versaoDuimp
  **/
  @JsonProperty("versaoDuimp")
  public Integer getVersaoDuimp() {
    return versaoDuimp;
  }

  public void setVersaoDuimp(Integer versaoDuimp) {
    this.versaoDuimp = versaoDuimp;
  }

  public DuimpHistEventoCover versaoDuimp(Integer versaoDuimp) {
    this.versaoDuimp = versaoDuimp;
    return this;
  }

 /**
   * Get evento
   * @return evento
  **/
  @JsonProperty("evento")
  public TipoDeEventoObjetoCompostoPelosAtributosCdigoEDescrio getEvento() {
    return evento;
  }

  public void setEvento(TipoDeEventoObjetoCompostoPelosAtributosCdigoEDescrio evento) {
    this.evento = evento;
  }

  public DuimpHistEventoCover evento(TipoDeEventoObjetoCompostoPelosAtributosCdigoEDescrio evento) {
    this.evento = evento;
    return this;
  }

 /**
   * Data e hora em que o evento ocorreu.&lt;br&gt;Formato: &#39;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#39;
   * @return dataHora
  **/
  @JsonProperty("dataHora")
  public OffsetDateTime getDataHora() {
    return dataHora;
  }

  public void setDataHora(OffsetDateTime dataHora) {
    this.dataHora = dataHora;
  }

  public DuimpHistEventoCover dataHora(OffsetDateTime dataHora) {
    this.dataHora = dataHora;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DuimpHistEventoCover {\n");
    
    sb.append("    numeroDuimp: ").append(toIndentedString(numeroDuimp)).append("\n");
    sb.append("    versaoDuimp: ").append(toIndentedString(versaoDuimp)).append("\n");
    sb.append("    evento: ").append(toIndentedString(evento)).append("\n");
    sb.append("    dataHora: ").append(toIndentedString(dataHora)).append("\n");
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

