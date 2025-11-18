package br.gov.siscomex.portalunico.dimp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
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
@XmlType(name = "UfInteresseSefaz", propOrder =
        {"uf", "tipoInteresse"
        })

@XmlRootElement(name = "UfInteresseSefaz")
public class UfInteresseSefaz {

    @XmlElement(name = "uf", required = true)
    @ApiModelProperty(example = "RJ", required = true, value = "UF de interesse")
    /**
     * UF de interesse
     **/
    private String uf = null;


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

    @XmlElement(name = "tipoInteresse", required = true)
    @ApiModelProperty(example = "DESPACHO", required = true, value = "Tipo da UF de interesse")
    /**
     * Tipo da UF de interesse
     **/
    private TipoInteresseEnum tipoInteresse = null;

    /**
     * UF de interesse
     *
     * @return uf
     **/
    @JsonProperty("uf")
    @NotNull
    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public UfInteresseSefaz uf(String uf) {
        this.uf = uf;
        return this;
    }

    /**
     * Tipo da UF de interesse
     *
     * @return tipoInteresse
     **/
    @JsonProperty("tipoInteresse")
    @NotNull
    public String getTipoInteresse() {
        if (tipoInteresse == null) {
            return null;
        }
        return tipoInteresse.value();
    }

    public void setTipoInteresse(TipoInteresseEnum tipoInteresse) {
        this.tipoInteresse = tipoInteresse;
    }

    public UfInteresseSefaz tipoInteresse(TipoInteresseEnum tipoInteresse) {
        this.tipoInteresse = tipoInteresse;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class UfInteresseSefaz {\n" +
                "    uf: " + toIndentedString(uf) + "\n" +
                "    tipoInteresse: " + toIndentedString(tipoInteresse) + "\n" +
                "}";
        return sb;
    }

    @XmlType(name = "TipoInteresseEnum")
    @XmlEnum(String.class)
    public enum TipoInteresseEnum {

        @XmlEnumValue("DESPACHO(D : UF de realização do Despacho da Duimp) ")
        @JsonProperty("DESPACHO(D : UF de realização do Despacho da Duimp) ")
        DESPACHO_D_UF_DE_REALIZA_O_DO_DESPACHO_DA_DUIMP_("DESPACHO(D : UF de realização do Despacho da Duimp) "),

        @XmlEnumValue("IMPORTADOR(I : UF do domicílio do importador) ")
        @JsonProperty("IMPORTADOR(I : UF do domicílio do importador) ")
        IMPORTADOR_I_UF_DO_DOMIC_LIO_DO_IMPORTADOR_("IMPORTADOR(I : UF do domicílio do importador) "),

        @XmlEnumValue("TERCEIRO(T : UF do domicílio do terceiro (adquirente/encomendante)) ")
        @JsonProperty("TERCEIRO(T : UF do domicílio do terceiro (adquirente/encomendante)) ")
        TERCEIRO_T_UF_DO_DOMIC_LIO_DO_TERCEIRO_ADQUIRENTE_ENCOMENDANTE_("TERCEIRO(T : UF do domicílio do terceiro (adquirente/encomendante)) ");


        private final String value;

        TipoInteresseEnum(String v) {
            value = v;
        }

        public static TipoInteresseEnum fromValue(String v) {
            for (TipoInteresseEnum b : TipoInteresseEnum.values()) {
                if (String.valueOf(b.value).equals(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "' to TipoInteresseEnum");
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
