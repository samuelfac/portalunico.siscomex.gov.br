package br.gov.siscomex.portalunico.pcce.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UFCandidataIcmsDTO", propOrder =
        {"siglaUF", "tiposDeclaracao", "tipoFavorecida"
        })

@XmlRootElement(name = "UFCandidataIcmsDTO")
/**
 * Dados e configurações de uma UF candidata à favorecida do ICMS de Duimp
 **/
@ApiModel(description = "Dados e configurações de uma UF candidata à favorecida do ICMS de Duimp")
public class UFCandidataIcmsDTO {


    @XmlElement(name = "siglaUF", required = true)
    @ApiModelProperty(required = true, value = "Sigla da UF candidata à favorecida do ICMS")
    /**
     * Sigla da UF candidata à favorecida do ICMS
     **/
    private SiglaUFEnum siglaUF = null;
    @XmlElement(name = "tiposDeclaracao", required = true)
    @ApiModelProperty(required = true, value = "Lista de tipos de declaração/solicitação disponíveis para a UF")
    @Valid
    /**
     * Lista de tipos de declaração/solicitação disponíveis para a UF
     **/
    private List<TipoDeclaracaoIcmsDTO> tiposDeclaracao = new ArrayList<>();
    @XmlElement(name = "tipoFavorecida", required = true)
    @ApiModelProperty(required = true, value = "Tipo da UF em relação à declaração de ICMS")
    /**
     * Tipo da UF em relação à declaração de ICMS
     **/
    private TipoFavorecidaEnum tipoFavorecida = null;

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
     * Sigla da UF candidata à favorecida do ICMS
     *
     * @return siglaUF
     **/
    @JsonProperty("siglaUF")
    @NotNull
    public String getSiglaUF() {
        if (siglaUF == null) {
            return null;
        }
        return siglaUF.value();
    }

    public void setSiglaUF(SiglaUFEnum siglaUF) {
        this.siglaUF = siglaUF;
    }

    public UFCandidataIcmsDTO siglaUF(SiglaUFEnum siglaUF) {
        this.siglaUF = siglaUF;
        return this;
    }

    /**
     * Lista de tipos de declaração/solicitação disponíveis para a UF
     *
     * @return tiposDeclaracao
     **/
    @JsonProperty("tiposDeclaracao")
    @NotNull
    public List<TipoDeclaracaoIcmsDTO> getTiposDeclaracao() {
        return tiposDeclaracao;
    }

    public void setTiposDeclaracao(List<TipoDeclaracaoIcmsDTO> tiposDeclaracao) {
        this.tiposDeclaracao = tiposDeclaracao;
    }

    public UFCandidataIcmsDTO tiposDeclaracao(List<TipoDeclaracaoIcmsDTO> tiposDeclaracao) {
        this.tiposDeclaracao = tiposDeclaracao;
        return this;
    }

    public UFCandidataIcmsDTO addTiposDeclaracaoItem(TipoDeclaracaoIcmsDTO tiposDeclaracaoItem) {
        this.tiposDeclaracao.add(tiposDeclaracaoItem);
        return this;
    }

    /**
     * Tipo da UF em relação à declaração de ICMS
     *
     * @return tipoFavorecida
     **/
    @JsonProperty("tipoFavorecida")
    @NotNull
    public String getTipoFavorecida() {
        if (tipoFavorecida == null) {
            return null;
        }
        return tipoFavorecida.value();
    }

    public void setTipoFavorecida(TipoFavorecidaEnum tipoFavorecida) {
        this.tipoFavorecida = tipoFavorecida;
    }

    public UFCandidataIcmsDTO tipoFavorecida(TipoFavorecidaEnum tipoFavorecida) {
        this.tipoFavorecida = tipoFavorecida;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class UFCandidataIcmsDTO {\n" +
                "    siglaUF: " + toIndentedString(siglaUF) + "\n" +
                "    tiposDeclaracao: " + toIndentedString(tiposDeclaracao) + "\n" +
                "    tipoFavorecida: " + toIndentedString(tipoFavorecida) + "\n" +
                "}";
        return sb;
    }


    @XmlType(name = "SiglaUFEnum")
    @XmlEnum(String.class)
    public enum SiglaUFEnum {

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

        SiglaUFEnum(String v) {
            value = v;
        }

        public static SiglaUFEnum fromValue(String v) {
            for (SiglaUFEnum b : SiglaUFEnum.values()) {
                if (String.valueOf(b.value).equals(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "' to SiglaUFEnum");
        }

        public String value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
    }

    @XmlType(name = "TipoFavorecidaEnum")
    @XmlEnum(String.class)
    public enum TipoFavorecidaEnum {

        @XmlEnumValue("ADQUIRENTE")
        @JsonProperty("ADQUIRENTE")
        ADQUIRENTE("ADQUIRENTE"),

        @XmlEnumValue("IMPORTADOR")
        @JsonProperty("IMPORTADOR")
        IMPORTADOR("IMPORTADOR"),

        @XmlEnumValue("DESPACHO")
        @JsonProperty("DESPACHO")
        DESPACHO("DESPACHO");


        private final String value;

        TipoFavorecidaEnum(String v) {
            value = v;
        }

        public static TipoFavorecidaEnum fromValue(String v) {
            for (TipoFavorecidaEnum b : TipoFavorecidaEnum.values()) {
                if (String.valueOf(b.value).equals(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "' to TipoFavorecidaEnum");
        }

        public String value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
    }
}
