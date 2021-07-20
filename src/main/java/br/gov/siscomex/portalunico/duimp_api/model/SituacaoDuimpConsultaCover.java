package br.gov.siscomex.portalunico.duimp_api.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "SituacaoDuimpConsultaCover", propOrder =
    { "situacaoDuimp", "situacaoAnaliseRetificacao", "controleAduaneiro", "controleAdministrativo", "controleCarga"
})

@XmlRootElement(name="SituacaoDuimpConsultaCover")
/**
  * Tipos de situações e controles da declaração única de importação.
 **/
@ApiModel(description="Tipos de situações e controles da declaração única de importação.")
public class SituacaoDuimpConsultaCover  {
  

@XmlType(name="SituacaoDuimpEnum")
@XmlEnum(String.class)
public enum SituacaoDuimpEnum {

	@XmlEnumValue("REGISTRADA_AGUARDANDO_CANAL")
	@JsonProperty("REGISTRADA_AGUARDANDO_CANAL")
	REGISTRADA_AGUARDANDO_CANAL(String.valueOf("REGISTRADA_AGUARDANDO_CANAL")),
	
	@XmlEnumValue("EM_CONFERENCIA_SELECIONADA")
	@JsonProperty("EM_CONFERENCIA_SELECIONADA")
	EM_CONFERENCIA_SELECIONADA(String.valueOf("EM_CONFERENCIA_SELECIONADA")),
	
	@XmlEnumValue("DESEMBARACADA_AGUARDANDO_PENDENCIA_TRIBUTOS_ESTADUAIS")
	@JsonProperty("DESEMBARACADA_AGUARDANDO_PENDENCIA_TRIBUTOS_ESTADUAIS")
	DESEMBARACADA_AGUARDANDO_PENDENCIA_TRIBUTOS_ESTADUAIS(String.valueOf("DESEMBARACADA_AGUARDANDO_PENDENCIA_TRIBUTOS_ESTADUAIS")),
	
	@XmlEnumValue("DESEMBARACADA_AGUARDANDO_ENTREGA_CARGA")
	@JsonProperty("DESEMBARACADA_AGUARDANDO_ENTREGA_CARGA")
	DESEMBARACADA_AGUARDANDO_ENTREGA_CARGA(String.valueOf("DESEMBARACADA_AGUARDANDO_ENTREGA_CARGA")),
	
	@XmlEnumValue("DESEMBARACADA_CARGA_ENTREGUE")
	@JsonProperty("DESEMBARACADA_CARGA_ENTREGUE")
	DESEMBARACADA_CARGA_ENTREGUE(String.valueOf("DESEMBARACADA_CARGA_ENTREGUE")),
	
	@XmlEnumValue("ENTREGA_ANTECIPADA_AGUARDANDO_PENDENCIA_TRIBUTOS_ESTADUAIS")
	@JsonProperty("ENTREGA_ANTECIPADA_AGUARDANDO_PENDENCIA_TRIBUTOS_ESTADUAIS")
	ENTREGA_ANTECIPADA_AGUARDANDO_PENDENCIA_TRIBUTOS_ESTADUAIS(String.valueOf("ENTREGA_ANTECIPADA_AGUARDANDO_PENDENCIA_TRIBUTOS_ESTADUAIS")),
	
	@XmlEnumValue("ENTREGA_ANTECIPADA_AGUARDANDO_ENTREGA_CARGA")
	@JsonProperty("ENTREGA_ANTECIPADA_AGUARDANDO_ENTREGA_CARGA")
	ENTREGA_ANTECIPADA_AGUARDANDO_ENTREGA_CARGA(String.valueOf("ENTREGA_ANTECIPADA_AGUARDANDO_ENTREGA_CARGA")),
	
	@XmlEnumValue("ENTREGA_ANTECIPADA_CARGA_ENTREGUE")
	@JsonProperty("ENTREGA_ANTECIPADA_CARGA_ENTREGUE")
	ENTREGA_ANTECIPADA_CARGA_ENTREGUE(String.valueOf("ENTREGA_ANTECIPADA_CARGA_ENTREGUE")),
	
	@XmlEnumValue("CANCELADA_PELA_ADUANA")
	@JsonProperty("CANCELADA_PELA_ADUANA")
	CANCELADA_PELA_ADUANA(String.valueOf("CANCELADA_PELA_ADUANA")),
	
	@XmlEnumValue("CANCELADA_POR_APURACAO")
	@JsonProperty("CANCELADA_POR_APURACAO")
	CANCELADA_POR_APURACAO(String.valueOf("CANCELADA_POR_APURACAO"));


    private String value;

    SituacaoDuimpEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static SituacaoDuimpEnum fromValue(String v) {
        for (SituacaoDuimpEnum b : SituacaoDuimpEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to SituacaoDuimpEnum");
    }
}

  @XmlElement(name="situacaoDuimp")
  @ApiModelProperty(example = "REGISTRADA_AGUARDANDO_CANAL", value = "Situação da versão vigente da Duimp.<br>Domínio:")
 /**
   * Situação da versão vigente da Duimp.<br>Domínio:
  **/
  private SituacaoDuimpEnum situacaoDuimp = null;


@XmlType(name="SituacaoAnaliseRetificacaoEnum")
@XmlEnum(String.class)
public enum SituacaoAnaliseRetificacaoEnum {

	@XmlEnumValue("NA")
	@JsonProperty("NA")
	NA(String.valueOf("NA")),
	
	@XmlEnumValue("PENDENTE_AGUARDANDO_ANALISE")
	@JsonProperty("PENDENTE_AGUARDANDO_ANALISE")
	PENDENTE_AGUARDANDO_ANALISE(String.valueOf("PENDENTE_AGUARDANDO_ANALISE")),
	
	@XmlEnumValue("DEFERIDA")
	@JsonProperty("DEFERIDA")
	DEFERIDA(String.valueOf("DEFERIDA")),
	
	@XmlEnumValue("DEFERIDA_COM_EXIGENCIA")
	@JsonProperty("DEFERIDA_COM_EXIGENCIA")
	DEFERIDA_COM_EXIGENCIA(String.valueOf("DEFERIDA_COM_EXIGENCIA")),
	
	@XmlEnumValue("SEM_ANALISE")
	@JsonProperty("SEM_ANALISE")
	SEM_ANALISE(String.valueOf("SEM_ANALISE")),
	
	@XmlEnumValue("SEM_ANALISE_POR_CANCELAMENTO")
	@JsonProperty("SEM_ANALISE_POR_CANCELAMENTO")
	SEM_ANALISE_POR_CANCELAMENTO(String.valueOf("SEM_ANALISE_POR_CANCELAMENTO")),
	
	@XmlEnumValue("DEFERIDA_AUTOMATICAMENTE")
	@JsonProperty("DEFERIDA_AUTOMATICAMENTE")
	DEFERIDA_AUTOMATICAMENTE(String.valueOf("DEFERIDA_AUTOMATICAMENTE"));


    private String value;

    SituacaoAnaliseRetificacaoEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static SituacaoAnaliseRetificacaoEnum fromValue(String v) {
        for (SituacaoAnaliseRetificacaoEnum b : SituacaoAnaliseRetificacaoEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to SituacaoAnaliseRetificacaoEnum");
    }
}

  @XmlElement(name="situacaoAnaliseRetificacao")
  @ApiModelProperty(example = "PENDENTE_AGUARDANDO_ANALISE", value = "Tipos de situações da análise da retificação.<br>Domínio:")
 /**
   * Tipos de situações da análise da retificação.<br>Domínio:
  **/
  private SituacaoAnaliseRetificacaoEnum situacaoAnaliseRetificacao = null;


@XmlType(name="ControleAduaneiroEnum")
@XmlEnum(String.class)
public enum ControleAduaneiroEnum {

	@XmlEnumValue("AGUARDANDO_ANALISE_RISCO")
	@JsonProperty("AGUARDANDO_ANALISE_RISCO")
	AGUARDANDO_ANALISE_RISCO(String.valueOf("AGUARDANDO_ANALISE_RISCO")),
	
	@XmlEnumValue("DESEMBARACO_AUTOMATICO")
	@JsonProperty("DESEMBARACO_AUTOMATICO")
	DESEMBARACO_AUTOMATICO(String.valueOf("DESEMBARACO_AUTOMATICO")),
	
	@XmlEnumValue("AGUARDANDO_DOC")
	@JsonProperty("AGUARDANDO_DOC")
	AGUARDANDO_DOC(String.valueOf("AGUARDANDO_DOC")),
	
	@XmlEnumValue("AGUARDANDO_DISTRIBUICAO")
	@JsonProperty("AGUARDANDO_DISTRIBUICAO")
	AGUARDANDO_DISTRIBUICAO(String.valueOf("AGUARDANDO_DISTRIBUICAO")),
	
	@XmlEnumValue("EM_ANALISE_FISCAL")
	@JsonProperty("EM_ANALISE_FISCAL")
	EM_ANALISE_FISCAL(String.valueOf("EM_ANALISE_FISCAL")),
	
	@XmlEnumValue("INTERROMPIDA")
	@JsonProperty("INTERROMPIDA")
	INTERROMPIDA(String.valueOf("INTERROMPIDA")),
	
	@XmlEnumValue("DESEMBARACO_AUTORIZADO")
	@JsonProperty("DESEMBARACO_AUTORIZADO")
	DESEMBARACO_AUTORIZADO(String.valueOf("DESEMBARACO_AUTORIZADO")),
	
	@XmlEnumValue("CONCLUIDA_SEM_PROSSEGUIMENTO_DESPACHO")
	@JsonProperty("CONCLUIDA_SEM_PROSSEGUIMENTO_DESPACHO")
	CONCLUIDA_SEM_PROSSEGUIMENTO_DESPACHO(String.valueOf("CONCLUIDA_SEM_PROSSEGUIMENTO_DESPACHO")),
	
	@XmlEnumValue("CANCELADA")
	@JsonProperty("CANCELADA")
	CANCELADA(String.valueOf("CANCELADA"));


    private String value;

    ControleAduaneiroEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ControleAduaneiroEnum fromValue(String v) {
        for (ControleAduaneiroEnum b : ControleAduaneiroEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to ControleAduaneiroEnum");
    }
}

  @XmlElement(name="controleAduaneiro")
  @ApiModelProperty(example = "DESEMBARACO_AUTOMATICO", value = "Tipos de situações de conferência aduaneira.<br>Domínio:")
 /**
   * Tipos de situações de conferência aduaneira.<br>Domínio:
  **/
  private ControleAduaneiroEnum controleAduaneiro = null;


@XmlType(name="ControleAdministrativoEnum")
@XmlEnum(String.class)
public enum ControleAdministrativoEnum {

	@XmlEnumValue("DISPENSADO")
	@JsonProperty("DISPENSADO")
	DISPENSADO(String.valueOf("DISPENSADO")),
	
	@XmlEnumValue("DEFERIDO")
	@JsonProperty("DEFERIDO")
	DEFERIDO(String.valueOf("DEFERIDO")),
	
	@XmlEnumValue("ALERTA")
	@JsonProperty("ALERTA")
	ALERTA(String.valueOf("ALERTA")),
	
	@XmlEnumValue("PENDENTE")
	@JsonProperty("PENDENTE")
	PENDENTE(String.valueOf("PENDENTE")),
	
	@XmlEnumValue("IMPEDIDO")
	@JsonProperty("IMPEDIDO")
	IMPEDIDO(String.valueOf("IMPEDIDO"));


    private String value;

    ControleAdministrativoEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ControleAdministrativoEnum fromValue(String v) {
        for (ControleAdministrativoEnum b : ControleAdministrativoEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to ControleAdministrativoEnum");
    }
}

  @XmlElement(name="controleAdministrativo")
  @ApiModelProperty(example = "DISPENSADO", value = "Tipos de situações do controle administrativo.<br>Domínio:")
 /**
   * Tipos de situações do controle administrativo.<br>Domínio:
  **/
  private ControleAdministrativoEnum controleAdministrativo = null;


@XmlType(name="ControleCargaEnum")
@XmlEnum(String.class)
public enum ControleCargaEnum {

	@XmlEnumValue("DESVINCULADA")
	@JsonProperty("DESVINCULADA")
	DESVINCULADA(String.valueOf("DESVINCULADA")),
	
	@XmlEnumValue("ENTREGUE")
	@JsonProperty("ENTREGUE")
	ENTREGUE(String.valueOf("ENTREGUE")),
	
	@XmlEnumValue("ATRACADA")
	@JsonProperty("ATRACADA")
	ATRACADA(String.valueOf("ATRACADA")),
	
	@XmlEnumValue("VINCULADA")
	@JsonProperty("VINCULADA")
	VINCULADA(String.valueOf("VINCULADA"));


    private String value;

    ControleCargaEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ControleCargaEnum fromValue(String v) {
        for (ControleCargaEnum b : ControleCargaEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to ControleCargaEnum");
    }
}

  @XmlElement(name="controleCarga")
  @ApiModelProperty(example = "VINCULADA", value = "Tipos de situações do controle de carga.<br>Domínio:")
 /**
   * Tipos de situações do controle de carga.<br>Domínio:
  **/
  private ControleCargaEnum controleCarga = null;
 /**
   * Situação da versão vigente da Duimp.&lt;br&gt;Domínio:
   * @return situacaoDuimp
  **/
  @JsonProperty("situacaoDuimp")
  public String getSituacaoDuimp() {
    if (situacaoDuimp == null) {
      return null;
    }
    return situacaoDuimp.value();
  }

  public void setSituacaoDuimp(SituacaoDuimpEnum situacaoDuimp) {
    this.situacaoDuimp = situacaoDuimp;
  }

  public SituacaoDuimpConsultaCover situacaoDuimp(SituacaoDuimpEnum situacaoDuimp) {
    this.situacaoDuimp = situacaoDuimp;
    return this;
  }

 /**
   * Tipos de situações da análise da retificação.&lt;br&gt;Domínio:
   * @return situacaoAnaliseRetificacao
  **/
  @JsonProperty("situacaoAnaliseRetificacao")
  public String getSituacaoAnaliseRetificacao() {
    if (situacaoAnaliseRetificacao == null) {
      return null;
    }
    return situacaoAnaliseRetificacao.value();
  }

  public void setSituacaoAnaliseRetificacao(SituacaoAnaliseRetificacaoEnum situacaoAnaliseRetificacao) {
    this.situacaoAnaliseRetificacao = situacaoAnaliseRetificacao;
  }

  public SituacaoDuimpConsultaCover situacaoAnaliseRetificacao(SituacaoAnaliseRetificacaoEnum situacaoAnaliseRetificacao) {
    this.situacaoAnaliseRetificacao = situacaoAnaliseRetificacao;
    return this;
  }

 /**
   * Tipos de situações de conferência aduaneira.&lt;br&gt;Domínio:
   * @return controleAduaneiro
  **/
  @JsonProperty("controleAduaneiro")
  public String getControleAduaneiro() {
    if (controleAduaneiro == null) {
      return null;
    }
    return controleAduaneiro.value();
  }

  public void setControleAduaneiro(ControleAduaneiroEnum controleAduaneiro) {
    this.controleAduaneiro = controleAduaneiro;
  }

  public SituacaoDuimpConsultaCover controleAduaneiro(ControleAduaneiroEnum controleAduaneiro) {
    this.controleAduaneiro = controleAduaneiro;
    return this;
  }

 /**
   * Tipos de situações do controle administrativo.&lt;br&gt;Domínio:
   * @return controleAdministrativo
  **/
  @JsonProperty("controleAdministrativo")
  public String getControleAdministrativo() {
    if (controleAdministrativo == null) {
      return null;
    }
    return controleAdministrativo.value();
  }

  public void setControleAdministrativo(ControleAdministrativoEnum controleAdministrativo) {
    this.controleAdministrativo = controleAdministrativo;
  }

  public SituacaoDuimpConsultaCover controleAdministrativo(ControleAdministrativoEnum controleAdministrativo) {
    this.controleAdministrativo = controleAdministrativo;
    return this;
  }

 /**
   * Tipos de situações do controle de carga.&lt;br&gt;Domínio:
   * @return controleCarga
  **/
  @JsonProperty("controleCarga")
  public String getControleCarga() {
    if (controleCarga == null) {
      return null;
    }
    return controleCarga.value();
  }

  public void setControleCarga(ControleCargaEnum controleCarga) {
    this.controleCarga = controleCarga;
  }

  public SituacaoDuimpConsultaCover controleCarga(ControleCargaEnum controleCarga) {
    this.controleCarga = controleCarga;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SituacaoDuimpConsultaCover {\n");
    
    sb.append("    situacaoDuimp: ").append(toIndentedString(situacaoDuimp)).append("\n");
    sb.append("    situacaoAnaliseRetificacao: ").append(toIndentedString(situacaoAnaliseRetificacao)).append("\n");
    sb.append("    controleAduaneiro: ").append(toIndentedString(controleAduaneiro)).append("\n");
    sb.append("    controleAdministrativo: ").append(toIndentedString(controleAdministrativo)).append("\n");
    sb.append("    controleCarga: ").append(toIndentedString(controleCarga)).append("\n");
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

