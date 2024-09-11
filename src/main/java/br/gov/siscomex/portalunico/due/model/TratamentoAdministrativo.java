package br.gov.siscomex.portalunico.due.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TratamentoAdministrativo", propOrder =
        {"codigoLPCO", "impeditivoDeEmbarque", "mensagem", "orgaos", "situacao"
        })

@XmlRootElement(name = "TratamentoAdministrativo")
public class TratamentoAdministrativo {

    @XmlElement(name = "codigoLPCO")
    @ApiModelProperty(value = "Código LPCO<br />Tamanho mínimo: 0<br />Tamanho máximo: 11")
    /**
     * Código LPCO<br />Tamanho mínimo: 0<br />Tamanho máximo: 11
     **/
    private String codigoLPCO = null;

    @XmlElement(name = "impeditivoDeEmbarque")
    @ApiModelProperty(value = "")
    private Boolean impeditivoDeEmbarque = null;

    @XmlElement(name = "mensagem")
    @ApiModelProperty(value = "Mensagem<br />Tamanho mínimo: 0<br />Tamanho máximo: 2000")
    /**
     * Mensagem<br />Tamanho mínimo: 0<br />Tamanho máximo: 2000
     **/
    private String mensagem = null;

    @XmlElement(name = "orgaos")
    @ApiModelProperty(value = "Órgãos<br />Tamanho mínimo: 0<br />Tamanho máximo: 15")
    /**
     * Órgãos<br />Tamanho mínimo: 0<br />Tamanho máximo: 15
     **/
    private List<String> orgaos = null;


    @XmlType(name = "SituacaoEnum")
    @XmlEnum(String.class)
    public enum SituacaoEnum {

        @XmlEnumValue("PARA_ANALISE")
        @JsonProperty("PARA_ANALISE")
        PARA_ANALISE("PARA_ANALISE"),

        @XmlEnumValue("EM_ANALISE")
        @JsonProperty("EM_ANALISE")
        EM_ANALISE("EM_ANALISE"),

        @XmlEnumValue("INDEFERIDO")
        @JsonProperty("INDEFERIDO")
        INDEFERIDO("INDEFERIDO"),

        @XmlEnumValue("EM_EXIGENCIA")
        @JsonProperty("EM_EXIGENCIA")
        EM_EXIGENCIA("EM_EXIGENCIA"),

        @XmlEnumValue("RESPOSTA_EXIGENCIA")
        @JsonProperty("RESPOSTA_EXIGENCIA")
        RESPOSTA_EXIGENCIA("RESPOSTA_EXIGENCIA"),

        @XmlEnumValue("CANCELADO")
        @JsonProperty("CANCELADO")
        CANCELADO("CANCELADO"),

        @XmlEnumValue("ESGOTADO")
        @JsonProperty("ESGOTADO")
        ESGOTADO("ESGOTADO"),

        @XmlEnumValue("DEFERIDO")
        @JsonProperty("DEFERIDO")
        DEFERIDO("DEFERIDO"),

        @XmlEnumValue("VENCIDO")
        @JsonProperty("VENCIDO")
        VENCIDO("VENCIDO"),

        @XmlEnumValue("ANULADO_REVOGADO")
        @JsonProperty("ANULADO_REVOGADO")
        ANULADO_REVOGADO("ANULADO_REVOGADO"),

        @XmlEnumValue("EM_VERIFICACAO")
        @JsonProperty("EM_VERIFICACAO")
        EM_VERIFICACAO("EM_VERIFICACAO"),

        @XmlEnumValue("EM_INSPECAO")
        @JsonProperty("EM_INSPECAO")
        EM_INSPECAO("EM_INSPECAO"),

        @XmlEnumValue("RASCUNHO_RETIFICACAO")
        @JsonProperty("RASCUNHO_RETIFICACAO")
        RASCUNHO_RETIFICACAO("RASCUNHO_RETIFICACAO"),

        @XmlEnumValue("RASCUNHO_LPCO")
        @JsonProperty("RASCUNHO_LPCO")
        RASCUNHO_LPCO("RASCUNHO_LPCO"),

        @XmlEnumValue("AGUARDANDO_PAGAMENTO")
        @JsonProperty("AGUARDANDO_PAGAMENTO")
        AGUARDANDO_PAGAMENTO("AGUARDANDO_PAGAMENTO"),

        @XmlEnumValue("AUTORIZACAO_IMPORTACAO_EMITIDA")
        @JsonProperty("AUTORIZACAO_IMPORTACAO_EMITIDA")
        AUTORIZACAO_IMPORTACAO_EMITIDA("AUTORIZACAO_IMPORTACAO_EMITIDA"),

        @XmlEnumValue("PARAMETRIZADO")
        @JsonProperty("PARAMETRIZADO")
        PARAMETRIZADO("PARAMETRIZADO"),

        @XmlEnumValue("CONFERENCIA_DOCUMENTAL")
        @JsonProperty("CONFERENCIA_DOCUMENTAL")
        CONFERENCIA_DOCUMENTAL("CONFERENCIA_DOCUMENTAL"),

        @XmlEnumValue("INSPECAO_FISICA")
        @JsonProperty("INSPECAO_FISICA")
        INSPECAO_FISICA("INSPECAO_FISICA"),

        @XmlEnumValue("RECURSO_INDEFERIMENTO")
        @JsonProperty("RECURSO_INDEFERIMENTO")
        RECURSO_INDEFERIMENTO("RECURSO_INDEFERIMENTO"),

        @XmlEnumValue("RECURSO_DIVERSO")
        @JsonProperty("RECURSO_DIVERSO")
        RECURSO_DIVERSO("RECURSO_DIVERSO");


        private final String value;

        SituacaoEnum(String v) {
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

    @XmlElement(name = "situacao")
    @ApiModelProperty(value = "")
    private SituacaoEnum situacao = null;

    /**
     * Código LPCO&lt;br /&gt;Tamanho mínimo: 0&lt;br /&gt;Tamanho máximo: 11
     *
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
     *
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
     *
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
     *
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
     *
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

        String sb = "class TratamentoAdministrativo {\n" +
                "    codigoLPCO: " + toIndentedString(codigoLPCO) + "\n" +
                "    impeditivoDeEmbarque: " + toIndentedString(impeditivoDeEmbarque) + "\n" +
                "    mensagem: " + toIndentedString(mensagem) + "\n" +
                "    orgaos: " + toIndentedString(orgaos) + "\n" +
                "    situacao: " + toIndentedString(situacao) + "\n" +
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

