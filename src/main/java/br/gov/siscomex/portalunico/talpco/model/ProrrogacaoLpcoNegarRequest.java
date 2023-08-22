package br.gov.siscomex.portalunico.talpco.model;

import io.swagger.v3.oas.annotations.media.Schema;
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
 @XmlType(name = "ProrrogacaoLpcoNegarRequest", propOrder =
    { "novaDataFimVigencia", "justificativa", "faltaPagamentoTaxa", "motivoAnalise"
})

@XmlRootElement(name="ProrrogacaoLpcoNegarRequest")
/**
  * Dados de uma solicitação de prorrogação de um LPCO
 **/
@ApiModel(description="Dados de uma solicitação de prorrogação de um LPCO")
public class ProrrogacaoLpcoNegarRequest  {
  
  @XmlElement(name="novaDataFimVigencia")
  @ApiModelProperty(example = "2019-09-03", value = "Novo fim de vigência a ser solicitado para o LPCO se for uma solicitação de prorrogação<br>Formato: yyyy-MM-dd")
 /**
   * Novo fim de vigência a ser solicitado para o LPCO se for uma solicitação de prorrogação<br>Formato: yyyy-MM-dd
  **/
  private String novaDataFimVigencia = null;

  @XmlElement(name="justificativa")
  @ApiModelProperty(example = "Texto livre", value = "Justificativa para a solicitação de prorrogação<br>Tamanho mínimo: 1<br>Tamanho máximo: 3900")
 /**
   * Justificativa para a solicitação de prorrogação<br>Tamanho mínimo: 1<br>Tamanho máximo: 3900
  **/
  private String justificativa = null;

  @XmlElement(name="faltaPagamentoTaxa")
  @ApiModelProperty(example = "false", value = "Indica se o pagamento de taxa não efetuado")
 /**
   * Indica se o pagamento de taxa não efetuado
  **/
  private Boolean faltaPagamentoTaxa = false;

  @XmlElement(name="motivoAnalise")
  @ApiModelProperty(example = "A01", value = "Código do motivo de análise. Pode ser informado somente se existirem motivos de análise cadastrados no Tabelas Comex. Caso contrário, deve ser nulo.<br>")
 /**
   * Código do motivo de análise. Pode ser informado somente se existirem motivos de análise cadastrados no Tabelas Comex. Caso contrário, deve ser nulo.<br>
  **/
  private String motivoAnalise = null;
 /**
   * Novo fim de vigência a ser solicitado para o LPCO se for uma solicitação de prorrogação&lt;br&gt;Formato: yyyy-MM-dd
   * @return novaDataFimVigencia
  **/
  @JsonProperty("novaDataFimVigencia")
  public String getNovaDataFimVigencia() {
    return novaDataFimVigencia;
  }

  public void setNovaDataFimVigencia(String novaDataFimVigencia) {
    this.novaDataFimVigencia = novaDataFimVigencia;
  }

  public ProrrogacaoLpcoNegarRequest novaDataFimVigencia(String novaDataFimVigencia) {
    this.novaDataFimVigencia = novaDataFimVigencia;
    return this;
  }

 /**
   * Justificativa para a solicitação de prorrogação&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 3900
   * @return justificativa
  **/
  @JsonProperty("justificativa")
  public String getJustificativa() {
    return justificativa;
  }

  public void setJustificativa(String justificativa) {
    this.justificativa = justificativa;
  }

  public ProrrogacaoLpcoNegarRequest justificativa(String justificativa) {
    this.justificativa = justificativa;
    return this;
  }

 /**
   * Indica se o pagamento de taxa não efetuado
   * @return faltaPagamentoTaxa
  **/
  @JsonProperty("faltaPagamentoTaxa")
  public Boolean isFaltaPagamentoTaxa() {
    return faltaPagamentoTaxa;
  }

  public void setFaltaPagamentoTaxa(Boolean faltaPagamentoTaxa) {
    this.faltaPagamentoTaxa = faltaPagamentoTaxa;
  }

  public ProrrogacaoLpcoNegarRequest faltaPagamentoTaxa(Boolean faltaPagamentoTaxa) {
    this.faltaPagamentoTaxa = faltaPagamentoTaxa;
    return this;
  }

 /**
   * Código do motivo de análise. Pode ser informado somente se existirem motivos de análise cadastrados no Tabelas Comex. Caso contrário, deve ser nulo.&lt;br&gt;
   * @return motivoAnalise
  **/
  @JsonProperty("motivoAnalise")
  public String getMotivoAnalise() {
    return motivoAnalise;
  }

  public void setMotivoAnalise(String motivoAnalise) {
    this.motivoAnalise = motivoAnalise;
  }

  public ProrrogacaoLpcoNegarRequest motivoAnalise(String motivoAnalise) {
    this.motivoAnalise = motivoAnalise;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProrrogacaoLpcoNegarRequest {\n");
    
    sb.append("    novaDataFimVigencia: ").append(toIndentedString(novaDataFimVigencia)).append("\n");
    sb.append("    justificativa: ").append(toIndentedString(justificativa)).append("\n");
    sb.append("    faltaPagamentoTaxa: ").append(toIndentedString(faltaPagamentoTaxa)).append("\n");
    sb.append("    motivoAnalise: ").append(toIndentedString(motivoAnalise)).append("\n");
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

