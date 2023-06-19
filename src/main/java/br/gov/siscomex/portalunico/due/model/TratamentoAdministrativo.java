package br.gov.siscomex.portalunico.due.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "TratamentoAdministrativo", propOrder =
    { "codigoLPCO", "impeditivoDeEmbarque", "mensagem", "orgaos", "situacao"
})

@XmlRootElement(name="TratamentoAdministrativo")
public class TratamentoAdministrativo  {
  
  @XmlElement(name="codigoLPCO")
  @ApiModelProperty(value = "Código LPCO<br />Tamanho mínimo: 0<br />Tamanho máximo: 11")
 /**
   * Código LPCO<br />Tamanho mínimo: 0<br />Tamanho máximo: 11
  **/
  private String codigoLPCO = null;

  @XmlElement(name="impeditivoDeEmbarque")
  @ApiModelProperty(value = "")
  private Boolean impeditivoDeEmbarque = false;

  @XmlElement(name="mensagem")
  @ApiModelProperty(value = "Mensagem<br />Tamanho mínimo: 0<br />Tamanho máximo: 2000")
 /**
   * Mensagem<br />Tamanho mínimo: 0<br />Tamanho máximo: 2000
  **/
  private String mensagem = null;

  @XmlElement(name="orgaos")
  @ApiModelProperty(value = "Órgãos<br />Tamanho mínimo: 0<br />Tamanho máximo: 15")
 /**
   * Órgãos<br />Tamanho mínimo: 0<br />Tamanho máximo: 15
  **/
  private List<String> orgaos = null;


@XmlType(name="SituacaoEnum")
@XmlEnum(String.class)
public enum SituacaoEnum {

	@XmlEnumValue("PARA_ANALISE")
	@JsonProperty("PARA_ANALISE")
	PARA_ANALISE(String.valueOf("PARA_ANALISE")),
	
	@XmlEnumValue("EM_ANALISE")
	@JsonProperty("EM_ANALISE")
	EM_ANALISE(String.valueOf("EM_ANALISE")),
	
	@XmlEnumValue("INDEFERIDO")
	@JsonProperty("INDEFERIDO")
	INDEFERIDO(String.valueOf("INDEFERIDO")),
	
	@XmlEnumValue("EM_EXIGENCIA")
	@JsonProperty("EM_EXIGENCIA")
	EM_EXIGENCIA(String.valueOf("EM_EXIGENCIA")),
	
	@XmlEnumValue("RESPOSTA_EXIGENCIA")
	@JsonProperty("RESPOSTA_EXIGENCIA")
	RESPOSTA_EXIGENCIA(String.valueOf("RESPOSTA_EXIGENCIA")),
	
	@XmlEnumValue("CANCELADO")
	@JsonProperty("CANCELADO")
	CANCELADO(String.valueOf("CANCELADO")),
	
	@XmlEnumValue("ESGOTADO")
	@JsonProperty("ESGOTADO")
	ESGOTADO(String.valueOf("ESGOTADO")),
	
	@XmlEnumValue("DEFERIDO")
	@JsonProperty("DEFERIDO")
	DEFERIDO(String.valueOf("DEFERIDO")),
	
	@XmlEnumValue("VENCIDO")
	@JsonProperty("VENCIDO")
	VENCIDO(String.valueOf("VENCIDO")),
	
	@XmlEnumValue("ANULADO_REVOGADO")
	@JsonProperty("ANULADO_REVOGADO")
	ANULADO_REVOGADO(String.valueOf("ANULADO_REVOGADO")),
	
	@XmlEnumValue("EM_VERIFICACAO")
	@JsonProperty("EM_VERIFICACAO")
	EM_VERIFICACAO(String.valueOf("EM_VERIFICACAO")),
	
	@XmlEnumValue("EM_INSPECAO")
	@JsonProperty("EM_INSPECAO")
	EM_INSPECAO(String.valueOf("EM_INSPECAO")),
	
	@XmlEnumValue("RASCUNHO_RETIFICACAO")
	@JsonProperty("RASCUNHO_RETIFICACAO")
	RASCUNHO_RETIFICACAO(String.valueOf("RASCUNHO_RETIFICACAO")),
	
	@XmlEnumValue("RASCUNHO_LPCO")
	@JsonProperty("RASCUNHO_LPCO")
	RASCUNHO_LPCO(String.valueOf("RASCUNHO_LPCO")),
	
	@XmlEnumValue("AGUARDANDO_PAGAMENTO")
	@JsonProperty("AGUARDANDO_PAGAMENTO")
	AGUARDANDO_PAGAMENTO(String.valueOf("AGUARDANDO_PAGAMENTO"));


    private String value;

    SituacaoEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static SituacaoEnum fromValue(String v) {
        for (SituacaoEnum b : SituacaoEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to SituacaoEnum");
    }
}

  @XmlElement(name="situacao")
  @ApiModelProperty(value = "")
  private SituacaoEnum situacao = null;
 /**
   * Código LPCO&lt;br /&gt;Tamanho mínimo: 0&lt;br /&gt;Tamanho máximo: 11
   * @return codigoLPCO
  **/
  @JsonProperty("codigoLPCO")
  public String getCodigoLPCO() {
    return codigoLPCO;
  }

  public void setCodigoLPCO(String codigoLPCO) {
    this.codigoLPCO = codigoLPCO;
  }

  public TratamentoAdministrativo codigoLPCO(String codigoLPCO) {
    this.codigoLPCO = codigoLPCO;
    return this;
  }

 /**
   * Get impeditivoDeEmbarque
   * @return impeditivoDeEmbarque
  **/
  @JsonProperty("impeditivoDeEmbarque")
  public Boolean isImpeditivoDeEmbarque() {
    return impeditivoDeEmbarque;
  }

  public void setImpeditivoDeEmbarque(Boolean impeditivoDeEmbarque) {
    this.impeditivoDeEmbarque = impeditivoDeEmbarque;
  }

  public TratamentoAdministrativo impeditivoDeEmbarque(Boolean impeditivoDeEmbarque) {
    this.impeditivoDeEmbarque = impeditivoDeEmbarque;
    return this;
  }

 /**
   * Mensagem&lt;br /&gt;Tamanho mínimo: 0&lt;br /&gt;Tamanho máximo: 2000
   * @return mensagem
  **/
  @JsonProperty("mensagem")
  public String getMensagem() {
    return mensagem;
  }

  public void setMensagem(String mensagem) {
    this.mensagem = mensagem;
  }

  public TratamentoAdministrativo mensagem(String mensagem) {
    this.mensagem = mensagem;
    return this;
  }

 /**
   * Órgãos&lt;br /&gt;Tamanho mínimo: 0&lt;br /&gt;Tamanho máximo: 15
   * @return orgaos
  **/
  @JsonProperty("orgaos")
  public List<String> getOrgaos() {
    return orgaos;
  }

  public void setOrgaos(List<String> orgaos) {
    this.orgaos = orgaos;
  }

  public TratamentoAdministrativo orgaos(List<String> orgaos) {
    this.orgaos = orgaos;
    return this;
  }

  public TratamentoAdministrativo addOrgaosItem(String orgaosItem) {
    this.orgaos.add(orgaosItem);
    return this;
  }

 /**
   * Get situacao
   * @return situacao
  **/
  @JsonProperty("situacao")
  public String getSituacao() {
    if (situacao == null) {
      return null;
    }
    return situacao.value();
  }

  public void setSituacao(SituacaoEnum situacao) {
    this.situacao = situacao;
  }

  public TratamentoAdministrativo situacao(SituacaoEnum situacao) {
    this.situacao = situacao;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TratamentoAdministrativo {\n");
    
    sb.append("    codigoLPCO: ").append(toIndentedString(codigoLPCO)).append("\n");
    sb.append("    impeditivoDeEmbarque: ").append(toIndentedString(impeditivoDeEmbarque)).append("\n");
    sb.append("    mensagem: ").append(toIndentedString(mensagem)).append("\n");
    sb.append("    orgaos: ").append(toIndentedString(orgaos)).append("\n");
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

