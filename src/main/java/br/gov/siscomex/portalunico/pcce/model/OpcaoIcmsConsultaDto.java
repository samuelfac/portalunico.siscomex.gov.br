package br.gov.siscomex.portalunico.pcce.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpcaoIcmsConsultaDto", propOrder =
        {"ativa", "codigoOpcao", "dataCadastro", "descricaoOpcao", "id", "tipoSolicitacao", "uf"
        })

@XmlRootElement(name = "OpcaoIcmsConsultaDto")
/**
 * Opção de ICMS cadastrada no PCCE
 **/
@ApiModel(description = "Opção de ICMS cadastrada no PCCE")
public class OpcaoIcmsConsultaDto {

    @XmlElement(name = "ativa", required = true)
    @ApiModelProperty(example = "true", required = true, value = "Indicador de que a opção está ativa e ficará disponível para uso pelo importador<br>Dominio:<br>true - Sim, <br>false - Não")
    /**
     * Indicador de que a opção está ativa e ficará disponível para uso pelo importador<br>Dominio:<br>true - Sim, <br>false - Não
     **/
    private Boolean ativa = null;

    @XmlElement(name = "codigoOpcao", required = true)
    @ApiModelProperty(example = "9999", required = true, value = "Codigo identificador da opção<br>Tamanho: 4")
    /**
     * Codigo identificador da opção<br>Tamanho: 4
     **/
    private String codigoOpcao = null;

    @XmlElement(name = "dataCadastro", required = true)
    @ApiModelProperty(example = "2021-08-31T09:11:06-0300", required = true, value = "Data e hora do cadastro da opção<br>Formato: 'yyyy-MM-dd'T'HH:mm:ssZ'")
    /**
     * Data e hora do cadastro da opção<br>Formato: 'yyyy-MM-dd'T'HH:mm:ssZ'
     **/
    private String dataCadastro = null;

    @XmlElement(name = "descricaoOpcao", required = true)
    @ApiModelProperty(example = "Id eu nisl nunc mi", required = true, value = "Descrição da opção que será exibida para o importador <br>Tamanho mínimo: 1<br>Tamanho máximo: 30")
    /**
     * Descrição da opção que será exibida para o importador <br>Tamanho mínimo: 1<br>Tamanho máximo: 30
     **/
    private String descricaoOpcao = null;

    @XmlElement(name = "id", required = true)
    @ApiModelProperty(example = "5", required = true, value = "Identificador único da opção no PCCE")
    /**
     * Identificador único da opção no PCCE
     **/
    private Long id = null;
    @XmlElement(name = "tipoSolicitacao", required = true)
    @ApiModelProperty(example = "PAGAMENTO_INTEGRAL_DUIMP", required = true, value = "Tipo de declaração de ICMS à qual a opção está vinculada")
    /**
     * Tipo de declaração de ICMS à qual a opção está vinculada
     **/
    private TipoSolicitacaoEnum tipoSolicitacao = null;
    @XmlElement(name = "uf", required = true)
    @ApiModelProperty(example = "RS", required = true, value = "UF à qual a opção está vinculada")
    /**
     * UF à qual a opção está vinculada
     **/
    private UfEnum uf = null;

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
     * Indicador de que a opção está ativa e ficará disponível para uso pelo importador&lt;br&gt;Dominio:&lt;br&gt;true - Sim, &lt;br&gt;false - Não
     *
     * @return ativa
     **/
    @JsonProperty("ativa")
    @NotNull
    public Boolean isisAtiva() {
        return ativa;
    }

    public void setAtiva(Boolean ativa) {
        this.ativa = ativa;
    }

    public OpcaoIcmsConsultaDto ativa(Boolean ativa) {
        this.ativa = ativa;
        return this;
    }

    /**
     * Codigo identificador da opção&lt;br&gt;Tamanho: 4
     *
     * @return codigoOpcao
     **/
    @JsonProperty("codigoOpcao")
    @NotNull
    public String getCodigoOpcao() {
        return codigoOpcao;
    }

    public void setCodigoOpcao(String codigoOpcao) {
        this.codigoOpcao = codigoOpcao;
    }

    public OpcaoIcmsConsultaDto codigoOpcao(String codigoOpcao) {
        this.codigoOpcao = codigoOpcao;
        return this;
    }

    /**
     * Data e hora do cadastro da opção&lt;br&gt;Formato: &#39;yyyy-MM-dd&#39;T&#39;HH:mm:ssZ&#39;
     *
     * @return dataCadastro
     **/
    @JsonProperty("dataCadastro")
    @NotNull
    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public OpcaoIcmsConsultaDto dataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
        return this;
    }

    /**
     * Descrição da opção que será exibida para o importador &lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 30
     *
     * @return descricaoOpcao
     **/
    @JsonProperty("descricaoOpcao")
    @NotNull
    public String getDescricaoOpcao() {
        return descricaoOpcao;
    }

    public void setDescricaoOpcao(String descricaoOpcao) {
        this.descricaoOpcao = descricaoOpcao;
    }

    public OpcaoIcmsConsultaDto descricaoOpcao(String descricaoOpcao) {
        this.descricaoOpcao = descricaoOpcao;
        return this;
    }

    /**
     * Identificador único da opção no PCCE
     *
     * @return id
     **/
    @JsonProperty("id")
    @NotNull
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public OpcaoIcmsConsultaDto id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Tipo de declaração de ICMS à qual a opção está vinculada
     *
     * @return tipoSolicitacao
     **/
    @JsonProperty("tipoSolicitacao")
    @NotNull
    public String getTipoSolicitacao() {
        if (tipoSolicitacao == null) {
            return null;
        }
        return tipoSolicitacao.value();
    }

    public void setTipoSolicitacao(TipoSolicitacaoEnum tipoSolicitacao) {
        this.tipoSolicitacao = tipoSolicitacao;
    }

    public OpcaoIcmsConsultaDto tipoSolicitacao(TipoSolicitacaoEnum tipoSolicitacao) {
        this.tipoSolicitacao = tipoSolicitacao;
        return this;
    }

    /**
     * UF à qual a opção está vinculada
     *
     * @return uf
     **/
    @JsonProperty("uf")
    @NotNull
    public String getUf() {
        if (uf == null) {
            return null;
        }
        return uf.value();
    }

    public void setUf(UfEnum uf) {
        this.uf = uf;
    }

    public OpcaoIcmsConsultaDto uf(UfEnum uf) {
        this.uf = uf;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class OpcaoIcmsConsultaDto {\n" +
                "    ativa: " + toIndentedString(ativa) + "\n" +
                "    codigoOpcao: " + toIndentedString(codigoOpcao) + "\n" +
                "    dataCadastro: " + toIndentedString(dataCadastro) + "\n" +
                "    descricaoOpcao: " + toIndentedString(descricaoOpcao) + "\n" +
                "    id: " + toIndentedString(id) + "\n" +
                "    tipoSolicitacao: " + toIndentedString(tipoSolicitacao) + "\n" +
                "    uf: " + toIndentedString(uf) + "\n" +
                "}";
        return sb;
    }


    @XmlType(name = "TipoSolicitacaoEnum")
    @XmlEnum(String.class)
    public enum TipoSolicitacaoEnum {

        @XmlEnumValue("PAGAMENTO_INTEGRAL_DUIMP")
        @JsonProperty("PAGAMENTO_INTEGRAL_DUIMP")
        PAGAMENTO_INTEGRAL_DUIMP("PAGAMENTO_INTEGRAL_DUIMP"),

        @XmlEnumValue("PAGAMENTO_PARCIAL_DUIMP")
        @JsonProperty("PAGAMENTO_PARCIAL_DUIMP")
        PAGAMENTO_PARCIAL_DUIMP("PAGAMENTO_PARCIAL_DUIMP"),

        @XmlEnumValue("EXONERACAO_INTEGRAL_DUIMP")
        @JsonProperty("EXONERACAO_INTEGRAL_DUIMP")
        EXONERACAO_INTEGRAL_DUIMP("EXONERACAO_INTEGRAL_DUIMP"),

        @XmlEnumValue("MANDADO_JUDICIAL_DUIMP")
        @JsonProperty("MANDADO_JUDICIAL_DUIMP")
        MANDADO_JUDICIAL_DUIMP("MANDADO_JUDICIAL_DUIMP"),

        @XmlEnumValue("EXONERACAO_PAG_PARCIAL_DUIMP")
        @JsonProperty("EXONERACAO_PAG_PARCIAL_DUIMP")
        EXONERACAO_PAG_PARCIAL_DUIMP("EXONERACAO_PAG_PARCIAL_DUIMP");


        private final String value;

        TipoSolicitacaoEnum(String v) {
            value = v;
        }

        public static TipoSolicitacaoEnum fromValue(String v) {
            for (TipoSolicitacaoEnum b : TipoSolicitacaoEnum.values()) {
                if (String.valueOf(b.value).equals(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "' to TipoSolicitacaoEnum");
        }

        public String value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
    }

    @XmlType(name = "UfEnum")
    @XmlEnum(String.class)
    public enum UfEnum {

        @XmlEnumValue("AC")
        @JsonProperty("AC")
        AC("AC"),

        @XmlEnumValue("AL")
        @JsonProperty("AL")
        AL("AL"),

        @XmlEnumValue("AM")
        @JsonProperty("AM")
        AM("AM"),

        @XmlEnumValue("AP")
        @JsonProperty("AP")
        AP("AP"),

        @XmlEnumValue("BA")
        @JsonProperty("BA")
        BA("BA"),

        @XmlEnumValue("CE")
        @JsonProperty("CE")
        CE("CE"),

        @XmlEnumValue("DF")
        @JsonProperty("DF")
        DF("DF"),

        @XmlEnumValue("ES")
        @JsonProperty("ES")
        ES("ES"),

        @XmlEnumValue("GO")
        @JsonProperty("GO")
        GO("GO"),

        @XmlEnumValue("MA")
        @JsonProperty("MA")
        MA("MA"),

        @XmlEnumValue("MG")
        @JsonProperty("MG")
        MG("MG"),

        @XmlEnumValue("MS")
        @JsonProperty("MS")
        MS("MS"),

        @XmlEnumValue("MT")
        @JsonProperty("MT")
        MT("MT"),

        @XmlEnumValue("PA")
        @JsonProperty("PA")
        PA("PA"),

        @XmlEnumValue("PB")
        @JsonProperty("PB")
        PB("PB"),

        @XmlEnumValue("PE")
        @JsonProperty("PE")
        PE("PE"),

        @XmlEnumValue("PI")
        @JsonProperty("PI")
        PI("PI"),

        @XmlEnumValue("PR")
        @JsonProperty("PR")
        PR("PR"),

        @XmlEnumValue("RJ")
        @JsonProperty("RJ")
        RJ("RJ"),

        @XmlEnumValue("RN")
        @JsonProperty("RN")
        RN("RN"),

        @XmlEnumValue("RO")
        @JsonProperty("RO")
        RO("RO"),

        @XmlEnumValue("RR")
        @JsonProperty("RR")
        RR("RR"),

        @XmlEnumValue("RS")
        @JsonProperty("RS")
        RS("RS"),

        @XmlEnumValue("SC")
        @JsonProperty("SC")
        SC("SC"),

        @XmlEnumValue("SE")
        @JsonProperty("SE")
        SE("SE"),

        @XmlEnumValue("SP")
        @JsonProperty("SP")
        SP("SP"),

        @XmlEnumValue("TO")
        @JsonProperty("TO")
        TO("TO");


        private final String value;

        UfEnum(String v) {
            value = v;
        }

        public String value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static UfEnum fromValue(String v) {
            for (UfEnum b : UfEnum.values()) {
                if (String.valueOf(b.value).equals(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "' to UfEnum");
        }
    }
}
