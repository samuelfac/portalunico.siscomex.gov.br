package br.gov.siscomex.portalunico.duimp_api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SituacaoDuimpConsultaCover", propOrder =
        {"situacaoDuimp", "situacaoAnaliseRetificacao", "situacaoLicenciamento", "controleCarga", "situacaoConferenciaAduaneira", "situacaoConferenciaAnuente"
        })

@XmlRootElement(name = "SituacaoDuimpConsultaCover")
/**
 * Tipos de situações e controles da declaração única de importação.
 **/
@ApiModel(description = "Tipos de situações e controles da declaração única de importação.")
public class SituacaoDuimpConsultaCover {


    @XmlType(name = "SituacaoDuimpEnum")
    @XmlEnum(String.class)
    public enum SituacaoDuimpEnum {

        @XmlEnumValue("REGISTRADA_AGUARDANDO_CANAL")
        @JsonProperty("REGISTRADA_AGUARDANDO_CANAL")
        REGISTRADA_AGUARDANDO_CANAL("REGISTRADA_AGUARDANDO_CANAL"),

        @XmlEnumValue("EM_CONFERENCIA_SELECIONADA")
        @JsonProperty("EM_CONFERENCIA_SELECIONADA")
        EM_CONFERENCIA_SELECIONADA("EM_CONFERENCIA_SELECIONADA"),

        @XmlEnumValue("DESEMBARACADA_AGUARDANDO_PENDENCIA_TRIBUTOS_ESTADUAIS")
        @JsonProperty("DESEMBARACADA_AGUARDANDO_PENDENCIA_TRIBUTOS_ESTADUAIS")
        DESEMBARACADA_AGUARDANDO_PENDENCIA_TRIBUTOS_ESTADUAIS("DESEMBARACADA_AGUARDANDO_PENDENCIA_TRIBUTOS_ESTADUAIS"),

        @XmlEnumValue("DESEMBARACADA_AGUARDANDO_ENTREGA_CARGA")
        @JsonProperty("DESEMBARACADA_AGUARDANDO_ENTREGA_CARGA")
        DESEMBARACADA_AGUARDANDO_ENTREGA_CARGA("DESEMBARACADA_AGUARDANDO_ENTREGA_CARGA"),

        @XmlEnumValue("DESEMBARACADA_CARGA_ENTREGUE")
        @JsonProperty("DESEMBARACADA_CARGA_ENTREGUE")
        DESEMBARACADA_CARGA_ENTREGUE("DESEMBARACADA_CARGA_ENTREGUE"),

        @XmlEnumValue("ENTREGA_ANTECIPADA_AGUARDANDO_PENDENCIA_TRIBUTOS_ESTADUAIS")
        @JsonProperty("ENTREGA_ANTECIPADA_AGUARDANDO_PENDENCIA_TRIBUTOS_ESTADUAIS")
        ENTREGA_ANTECIPADA_AGUARDANDO_PENDENCIA_TRIBUTOS_ESTADUAIS("ENTREGA_ANTECIPADA_AGUARDANDO_PENDENCIA_TRIBUTOS_ESTADUAIS"),

        @XmlEnumValue("ENTREGA_ANTECIPADA_AGUARDANDO_ENTREGA_CARGA")
        @JsonProperty("ENTREGA_ANTECIPADA_AGUARDANDO_ENTREGA_CARGA")
        ENTREGA_ANTECIPADA_AGUARDANDO_ENTREGA_CARGA("ENTREGA_ANTECIPADA_AGUARDANDO_ENTREGA_CARGA"),

        @XmlEnumValue("ENTREGA_ANTECIPADA_CARGA_ENTREGUE")
        @JsonProperty("ENTREGA_ANTECIPADA_CARGA_ENTREGUE")
        ENTREGA_ANTECIPADA_CARGA_ENTREGUE("ENTREGA_ANTECIPADA_CARGA_ENTREGUE"),

        @XmlEnumValue("CANCELADA_PELA_ADUANA")
        @JsonProperty("CANCELADA_PELA_ADUANA")
        CANCELADA_PELA_ADUANA("CANCELADA_PELA_ADUANA"),

        @XmlEnumValue("CANCELADA_POR_APURACAO")
        @JsonProperty("CANCELADA_POR_APURACAO")
        CANCELADA_POR_APURACAO("CANCELADA_POR_APURACAO");


        private final String value;

        SituacaoDuimpEnum(String v) {
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

    @XmlElement(name = "situacaoDuimp")
    @ApiModelProperty(example = "REGISTRADA_AGUARDANDO_CANAL", value = "Situação da versão vigente da Duimp.<br>Domínio:")
    /**
     * Situação da versão vigente da Duimp.<br>Domínio:
     **/
    private SituacaoDuimpEnum situacaoDuimp = null;


    @XmlType(name = "SituacaoAnaliseRetificacaoEnum")
    @XmlEnum(String.class)
    public enum SituacaoAnaliseRetificacaoEnum {

        @XmlEnumValue("NA")
        @JsonProperty("NA")
        NA("NA"),

        @XmlEnumValue("PENDENTE_AGUARDANDO_ANALISE")
        @JsonProperty("PENDENTE_AGUARDANDO_ANALISE")
        PENDENTE_AGUARDANDO_ANALISE("PENDENTE_AGUARDANDO_ANALISE"),

        @XmlEnumValue("DEFERIDA")
        @JsonProperty("DEFERIDA")
        DEFERIDA("DEFERIDA"),

        @XmlEnumValue("DEFERIDA_COM_EXIGENCIA")
        @JsonProperty("DEFERIDA_COM_EXIGENCIA")
        DEFERIDA_COM_EXIGENCIA("DEFERIDA_COM_EXIGENCIA"),

        @XmlEnumValue("SEM_ANALISE")
        @JsonProperty("SEM_ANALISE")
        SEM_ANALISE("SEM_ANALISE"),

        @XmlEnumValue("SEM_ANALISE_POR_CANCELAMENTO")
        @JsonProperty("SEM_ANALISE_POR_CANCELAMENTO")
        SEM_ANALISE_POR_CANCELAMENTO("SEM_ANALISE_POR_CANCELAMENTO"),

        @XmlEnumValue("DEFERIDA_AUTOMATICAMENTE")
        @JsonProperty("DEFERIDA_AUTOMATICAMENTE")
        DEFERIDA_AUTOMATICAMENTE("DEFERIDA_AUTOMATICAMENTE");


        private final String value;

        SituacaoAnaliseRetificacaoEnum(String v) {
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

    @XmlElement(name = "situacaoAnaliseRetificacao")
    @ApiModelProperty(example = "PENDENTE_AGUARDANDO_ANALISE", value = "Tipos de situações da análise da retificação.<br>Domínio:")
    /**
     * Tipos de situações da análise da retificação.<br>Domínio:
     **/
    private SituacaoAnaliseRetificacaoEnum situacaoAnaliseRetificacao = null;


    @XmlType(name = "SituacaoLicenciamentoEnum")
    @XmlEnum(String.class)
    public enum SituacaoLicenciamentoEnum {

        @XmlEnumValue("DISPENSADO")
        @JsonProperty("DISPENSADO")
        DISPENSADO("DISPENSADO"),

        @XmlEnumValue("DEFERIDO")
        @JsonProperty("DEFERIDO")
        DEFERIDO("DEFERIDO"),

        @XmlEnumValue("PENDENTE")
        @JsonProperty("PENDENTE")
        PENDENTE("PENDENTE"),

        @XmlEnumValue("IMPEDIDO")
        @JsonProperty("IMPEDIDO")
        IMPEDIDO("IMPEDIDO");


        private final String value;

        SituacaoLicenciamentoEnum(String v) {
            value = v;
        }

        public String value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static SituacaoLicenciamentoEnum fromValue(String v) {
            for (SituacaoLicenciamentoEnum b : SituacaoLicenciamentoEnum.values()) {
                if (String.valueOf(b.value).equals(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "' to SituacaoLicenciamentoEnum");
        }
    }

    @XmlElement(name = "situacaoLicenciamento")
    @ApiModelProperty(example = "DISPENSADO", value = "Tipos de situações do licenciamento.<br>Domínio:")
    /**
     * Tipos de situações do licenciamento.<br>Domínio:
     **/
    private SituacaoLicenciamentoEnum situacaoLicenciamento = null;


    @XmlType(name = "ControleCargaEnum")
    @XmlEnum(String.class)
    public enum ControleCargaEnum {

        @XmlEnumValue("DESVINCULADA")
        @JsonProperty("DESVINCULADA")
        DESVINCULADA("DESVINCULADA"),

        @XmlEnumValue("ENTREGUE")
        @JsonProperty("ENTREGUE")
        ENTREGUE("ENTREGUE"),

        @XmlEnumValue("ATRACADA")
        @JsonProperty("ATRACADA")
        ATRACADA("ATRACADA"),

        @XmlEnumValue("VINCULADA")
        @JsonProperty("VINCULADA")
        VINCULADA("VINCULADA");


        private final String value;

        ControleCargaEnum(String v) {
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

    @XmlElement(name = "controleCarga")
    @ApiModelProperty(example = "VINCULADA", value = "Tipos de situações do controle de carga.<br>Domínio:")
    /**
     * Tipos de situações do controle de carga.<br>Domínio:
     **/
    private ControleCargaEnum controleCarga = null;

    @XmlElement(name = "situacaoConferenciaAduaneira")
    @ApiModelProperty(value = "")
    @Valid
    private List<SituacaoConferenciaAduaneiraCover> situacaoConferenciaAduaneira = null;

    @XmlElement(name = "situacaoConferenciaAnuente")
    @ApiModelProperty(value = "")
    @Valid
    private List<SituacaoConferenciaAnuenteCover> situacaoConferenciaAnuente = null;

    /**
     * Situação da versão vigente da Duimp.&lt;br&gt;Domínio:
     *
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
     *
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
     * Tipos de situações do licenciamento.&lt;br&gt;Domínio:
     *
     * @return situacaoLicenciamento
     **/
    @JsonProperty("situacaoLicenciamento")
    public String getSituacaoLicenciamento() {
        if (situacaoLicenciamento == null) {
            return null;
        }
        return situacaoLicenciamento.value();
    }

    public void setSituacaoLicenciamento(SituacaoLicenciamentoEnum situacaoLicenciamento) {
        this.situacaoLicenciamento = situacaoLicenciamento;
    }

    public SituacaoDuimpConsultaCover situacaoLicenciamento(SituacaoLicenciamentoEnum situacaoLicenciamento) {
        this.situacaoLicenciamento = situacaoLicenciamento;
        return this;
    }

    /**
     * Tipos de situações do controle de carga.&lt;br&gt;Domínio:
     *
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

    /**
     * Get situacaoConferenciaAduaneira
     *
     * @return situacaoConferenciaAduaneira
     **/
    @JsonProperty("situacaoConferenciaAduaneira")
    public List<SituacaoConferenciaAduaneiraCover> getSituacaoConferenciaAduaneira() {
        return situacaoConferenciaAduaneira;
    }

    public void setSituacaoConferenciaAduaneira(List<SituacaoConferenciaAduaneiraCover> situacaoConferenciaAduaneira) {
        this.situacaoConferenciaAduaneira = situacaoConferenciaAduaneira;
    }

    public SituacaoDuimpConsultaCover situacaoConferenciaAduaneira(List<SituacaoConferenciaAduaneiraCover> situacaoConferenciaAduaneira) {
        this.situacaoConferenciaAduaneira = situacaoConferenciaAduaneira;
        return this;
    }

    public SituacaoDuimpConsultaCover addSituacaoConferenciaAduaneiraItem(SituacaoConferenciaAduaneiraCover situacaoConferenciaAduaneiraItem) {
        this.situacaoConferenciaAduaneira.add(situacaoConferenciaAduaneiraItem);
        return this;
    }

    /**
     * Get situacaoConferenciaAnuente
     *
     * @return situacaoConferenciaAnuente
     **/
    @JsonProperty("situacaoConferenciaAnuente")
    public List<SituacaoConferenciaAnuenteCover> getSituacaoConferenciaAnuente() {
        return situacaoConferenciaAnuente;
    }

    public void setSituacaoConferenciaAnuente(List<SituacaoConferenciaAnuenteCover> situacaoConferenciaAnuente) {
        this.situacaoConferenciaAnuente = situacaoConferenciaAnuente;
    }

    public SituacaoDuimpConsultaCover situacaoConferenciaAnuente(List<SituacaoConferenciaAnuenteCover> situacaoConferenciaAnuente) {
        this.situacaoConferenciaAnuente = situacaoConferenciaAnuente;
        return this;
    }

    public SituacaoDuimpConsultaCover addSituacaoConferenciaAnuenteItem(SituacaoConferenciaAnuenteCover situacaoConferenciaAnuenteItem) {
        this.situacaoConferenciaAnuente.add(situacaoConferenciaAnuenteItem);
        return this;
    }


    @Override
    public String toString() {

        String sb = "class SituacaoDuimpConsultaCover {\n" +
                "    situacaoDuimp: " + toIndentedString(situacaoDuimp) + "\n" +
                "    situacaoAnaliseRetificacao: " + toIndentedString(situacaoAnaliseRetificacao) + "\n" +
                "    situacaoLicenciamento: " + toIndentedString(situacaoLicenciamento) + "\n" +
                "    controleCarga: " + toIndentedString(controleCarga) + "\n" +
                "    situacaoConferenciaAduaneira: " + toIndentedString(situacaoConferenciaAduaneira) + "\n" +
                "    situacaoConferenciaAnuente: " + toIndentedString(situacaoConferenciaAnuente) + "\n" +
                "}";
        return sb;
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

