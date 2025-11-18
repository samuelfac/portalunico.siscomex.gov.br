package br.gov.siscomex.portalunico.dimp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.time.OffsetDateTime;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SituacaoDuimpConsultaCover", propOrder =
        {"situacaoDuimp", "dataDesembaraco"
        })

@XmlRootElement(name = "SituacaoDuimpConsultaCover")
/**
 * Tipos de situações e controles da declaração única de importação.
 **/
@ApiModel(description = "Tipos de situações e controles da declaração única de importação.")
public class SituacaoDuimpConsultaCover {


    @XmlElement(name = "situacaoDuimp")
    @ApiModelProperty(example = "REGISTRADA_AGUARDANDO_CANAL", value = "Situação da versão vigente da Duimp.<br>Domínio:")
    /**
     * Situação da versão vigente da Duimp.<br>Domínio:
     **/
    private SituacaoDuimpEnum situacaoDuimp = null;
    @XmlElement(name = "dataDesembaraco")
    @ApiModelProperty(value = "Data e hora do desembaraço.<br>Formato: 'yyyy-MM-dd'T'HH:mm:ssZ'")
    /**
     * Data e hora do desembaraço.<br>Formato: 'yyyy-MM-dd'T'HH:mm:ssZ'
     **/
    private OffsetDateTime dataDesembaraco = null;

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
     * Data e hora do desembaraço.&lt;br&gt;Formato: &#39;yyyy-MM-dd&#39;T&#39;HH:mm:ssZ&#39;
     *
     * @return dataDesembaraco
     **/
    @JsonProperty("dataDesembaraco")
    public OffsetDateTime getDataDesembaraco() {
        return dataDesembaraco;
    }

    public void setDataDesembaraco(OffsetDateTime dataDesembaraco) {
        this.dataDesembaraco = dataDesembaraco;
    }

    public SituacaoDuimpConsultaCover dataDesembaraco(OffsetDateTime dataDesembaraco) {
        this.dataDesembaraco = dataDesembaraco;
        return this;
    }


    @Override
    public String toString() {

        String sb = "class SituacaoDuimpConsultaCover {\n" +
                "    situacaoDuimp: " + toIndentedString(situacaoDuimp) + "\n" +
                "    dataDesembaraco: " + toIndentedString(dataDesembaraco) + "\n" +
                "}";
        return sb;
    }

    @XmlType(name = "SituacaoDuimpEnum")
    @XmlEnum(String.class)
    public enum SituacaoDuimpEnum {

        @XmlEnumValue("EM_ELABORACAO")
        @JsonProperty("EM_ELABORACAO")
        EM_ELABORACAO("EM_ELABORACAO"),

        @XmlEnumValue("ELABORADA_AGUARDANDO_VINCULACAO_CARGA")
        @JsonProperty("ELABORADA_AGUARDANDO_VINCULACAO_CARGA")
        ELABORADA_AGUARDANDO_VINCULACAO_CARGA("ELABORADA_AGUARDANDO_VINCULACAO_CARGA"),

        @XmlEnumValue("ELABORADA_AGUARDANDO_PCCE")
        @JsonProperty("ELABORADA_AGUARDANDO_PCCE")
        ELABORADA_AGUARDANDO_PCCE("ELABORADA_AGUARDANDO_PCCE"),

        @XmlEnumValue("ELABORADA_AGUARDANDO_DESVINCULACAO_CARGA")
        @JsonProperty("ELABORADA_AGUARDANDO_DESVINCULACAO_CARGA")
        ELABORADA_AGUARDANDO_DESVINCULACAO_CARGA("ELABORADA_AGUARDANDO_DESVINCULACAO_CARGA"),

        @XmlEnumValue("ELABORADA_AGUARDANDO_PROCESSAMENTO_DRAWBACK")
        @JsonProperty("ELABORADA_AGUARDANDO_PROCESSAMENTO_DRAWBACK")
        ELABORADA_AGUARDANDO_PROCESSAMENTO_DRAWBACK("ELABORADA_AGUARDANDO_PROCESSAMENTO_DRAWBACK"),

        @XmlEnumValue("ELABORADA_AGUARDANDO_ROLLBACK_PROCESSAMENTO_DRAWBACK")
        @JsonProperty("ELABORADA_AGUARDANDO_ROLLBACK_PROCESSAMENTO_DRAWBACK")
        ELABORADA_AGUARDANDO_ROLLBACK_PROCESSAMENTO_DRAWBACK("ELABORADA_AGUARDANDO_ROLLBACK_PROCESSAMENTO_DRAWBACK"),

        @XmlEnumValue("ELABORADA_AGUARDANDO_CRIACAO_ESTOQUE")
        @JsonProperty("ELABORADA_AGUARDANDO_CRIACAO_ESTOQUE")
        ELABORADA_AGUARDANDO_CRIACAO_ESTOQUE("ELABORADA_AGUARDANDO_CRIACAO_ESTOQUE"),

        @XmlEnumValue("ELABORADA_AGUARDANDO_EXCLUSAO_ESTOQUE")
        @JsonProperty("ELABORADA_AGUARDANDO_EXCLUSAO_ESTOQUE")
        ELABORADA_AGUARDANDO_EXCLUSAO_ESTOQUE("ELABORADA_AGUARDANDO_EXCLUSAO_ESTOQUE"),

        @XmlEnumValue("SOLICITACAO_RETIFICACAO_EM_ELABORACAO")
        @JsonProperty("SOLICITACAO_RETIFICACAO_EM_ELABORACAO")
        SOLICITACAO_RETIFICACAO_EM_ELABORACAO("SOLICITACAO_RETIFICACAO_EM_ELABORACAO"),

        @XmlEnumValue("SOLICITACAO_RETIFICACAO_AGUARDANDO_VINCULACAO_CARGA_NOVA")
        @JsonProperty("SOLICITACAO_RETIFICACAO_AGUARDANDO_VINCULACAO_CARGA_NOVA")
        SOLICITACAO_RETIFICACAO_AGUARDANDO_VINCULACAO_CARGA_NOVA("SOLICITACAO_RETIFICACAO_AGUARDANDO_VINCULACAO_CARGA_NOVA"),

        @XmlEnumValue("SOLICITACAO_RETIFICACAO_AGUARDANDO_DESVINCULACAO_CARGA_ANTIGA")
        @JsonProperty("SOLICITACAO_RETIFICACAO_AGUARDANDO_DESVINCULACAO_CARGA_ANTIGA")
        SOLICITACAO_RETIFICACAO_AGUARDANDO_DESVINCULACAO_CARGA_ANTIGA("SOLICITACAO_RETIFICACAO_AGUARDANDO_DESVINCULACAO_CARGA_ANTIGA"),

        @XmlEnumValue("SOLICITACAO_RETIFICACAO_AGUARDANDO_PAGAMENTO")
        @JsonProperty("SOLICITACAO_RETIFICACAO_AGUARDANDO_PAGAMENTO")
        SOLICITACAO_RETIFICACAO_AGUARDANDO_PAGAMENTO("SOLICITACAO_RETIFICACAO_AGUARDANDO_PAGAMENTO"),

        @XmlEnumValue("SOLICITACAO_RETIFICACAO_AGUARDANDO_DESVINCULACAO_CARGA_NOVA")
        @JsonProperty("SOLICITACAO_RETIFICACAO_AGUARDANDO_DESVINCULACAO_CARGA_NOVA")
        SOLICITACAO_RETIFICACAO_AGUARDANDO_DESVINCULACAO_CARGA_NOVA("SOLICITACAO_RETIFICACAO_AGUARDANDO_DESVINCULACAO_CARGA_NOVA"),

        @XmlEnumValue("SOLICITACAO_RETIFICACAO_AGUARDANDO_PROCESSAMENTO_DRAWBACK")
        @JsonProperty("SOLICITACAO_RETIFICACAO_AGUARDANDO_PROCESSAMENTO_DRAWBACK")
        SOLICITACAO_RETIFICACAO_AGUARDANDO_PROCESSAMENTO_DRAWBACK("SOLICITACAO_RETIFICACAO_AGUARDANDO_PROCESSAMENTO_DRAWBACK"),

        @XmlEnumValue("SOLICITACAO_RETIFICACAO_AGUARDANDO_ROLLBACK_PROCESSAMENTO_DRAWBACK")
        @JsonProperty("SOLICITACAO_RETIFICACAO_AGUARDANDO_ROLLBACK_PROCESSAMENTO_DRAWBACK")
        SOLICITACAO_RETIFICACAO_AGUARDANDO_ROLLBACK_PROCESSAMENTO_DRAWBACK("SOLICITACAO_RETIFICACAO_AGUARDANDO_ROLLBACK_PROCESSAMENTO_DRAWBACK"),

        @XmlEnumValue("REGISTRADA_AGUARDANDO_CANAL")
        @JsonProperty("REGISTRADA_AGUARDANDO_CANAL")
        REGISTRADA_AGUARDANDO_CANAL("REGISTRADA_AGUARDANDO_CANAL"),

        @XmlEnumValue("EM_CONFERENCIA_SELECIONADA")
        @JsonProperty("EM_CONFERENCIA_SELECIONADA")
        EM_CONFERENCIA_SELECIONADA("EM_CONFERENCIA_SELECIONADA"),

        @XmlEnumValue("DESEMBARACADA_AGUARDANDO_PENDENCIA")
        @JsonProperty("DESEMBARACADA_AGUARDANDO_PENDENCIA")
        DESEMBARACADA_AGUARDANDO_PENDENCIA("DESEMBARACADA_AGUARDANDO_PENDENCIA"),

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
}
