package br.gov.siscomex.portalunico.dimp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SefazMotivoDSICDTO", propOrder =
        {"motivo", "subTipoMotivo"
        })

@XmlRootElement(name = "SefazMotivoDSICDTO")
public class SefazMotivoDSICDTO {


    @XmlElement(name = "motivo")
    @ApiModelProperty(example = "BAGAGEM_DESDOBRAMENTO", value = "Indica o motivo para utilização do Tipo de Conhecimento DSIC")
    /**
     * Indica o motivo para utilização do Tipo de Conhecimento DSIC
     **/
    private MotivoEnum motivo = null;
    @XmlElement(name = "subTipoMotivo")
    @ApiModelProperty(example = "DESDOBRAMENTO", value = "Indica o submotivo  quando o 'motivo' informado for 'Bagagem/Desdobramento'")
    /**
     * Indica o submotivo  quando o 'motivo' informado for 'Bagagem/Desdobramento'
     **/
    private SubTipoMotivoEnum subTipoMotivo = null;

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
     * Indica o motivo para utilização do Tipo de Conhecimento DSIC
     *
     * @return motivo
     **/
    @JsonProperty("motivo")
    public String getMotivo() {
        if (motivo == null) {
            return null;
        }
        return motivo.value();
    }

    public void setMotivo(MotivoEnum motivo) {
        this.motivo = motivo;
    }

    public SefazMotivoDSICDTO motivo(MotivoEnum motivo) {
        this.motivo = motivo;
        return this;
    }

    /**
     * Indica o submotivo  quando o &#39;motivo&#39; informado for &#39;Bagagem/Desdobramento&#39;
     *
     * @return subTipoMotivo
     **/
    @JsonProperty("subTipoMotivo")
    public String getSubTipoMotivo() {
        if (subTipoMotivo == null) {
            return null;
        }
        return subTipoMotivo.value();
    }

    public void setSubTipoMotivo(SubTipoMotivoEnum subTipoMotivo) {
        this.subTipoMotivo = subTipoMotivo;
    }

    public SefazMotivoDSICDTO subTipoMotivo(SubTipoMotivoEnum subTipoMotivo) {
        this.subTipoMotivo = subTipoMotivo;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class SefazMotivoDSICDTO {\n" +
                "    motivo: " + toIndentedString(motivo) + "\n" +
                "    subTipoMotivo: " + toIndentedString(subTipoMotivo) + "\n" +
                "}";
        return sb;
    }


    @XmlType(name = "MotivoEnum")
    @XmlEnum(String.class)
    public enum MotivoEnum {

        @XmlEnumValue("MEIOS_PROPRIOS")
        @JsonProperty("MEIOS_PROPRIOS")
        MEIOS_PROPRIOS("MEIOS_PROPRIOS"),

        @XmlEnumValue("APREENSAO")
        @JsonProperty("APREENSAO")
        APREENSAO("APREENSAO"),

        @XmlEnumValue("RETENCAO")
        @JsonProperty("RETENCAO")
        RETENCAO("RETENCAO"),

        @XmlEnumValue("BAGAGEM_DESDOBRAMENTO")
        @JsonProperty("BAGAGEM_DESDOBRAMENTO")
        BAGAGEM_DESDOBRAMENTO("BAGAGEM_DESDOBRAMENTO"),

        @XmlEnumValue("OUTROS")
        @JsonProperty("OUTROS")
        OUTROS("OUTROS");


        private final String value;

        MotivoEnum(String v) {
            value = v;
        }

        public String value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static MotivoEnum fromValue(String v) {
            for (MotivoEnum b : MotivoEnum.values()) {
                if (String.valueOf(b.value).equals(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "' to MotivoEnum");
        }
    }

    @XmlType(name = "SubTipoMotivoEnum")
    @XmlEnum(String.class)
    public enum SubTipoMotivoEnum {

        @XmlEnumValue("BAGAGEM")
        @JsonProperty("BAGAGEM")
        BAGAGEM("BAGAGEM"),

        @XmlEnumValue("DESDOBRAMENTO")
        @JsonProperty("DESDOBRAMENTO")
        DESDOBRAMENTO("DESDOBRAMENTO"),

        @XmlEnumValue("NAO_SE_APLICA")
        @JsonProperty("NAO_SE_APLICA")
        NAO_SE_APLICA("NAO_SE_APLICA");


        private final String value;

        SubTipoMotivoEnum(String v) {
            value = v;
        }

        public String value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static SubTipoMotivoEnum fromValue(String v) {
            for (SubTipoMotivoEnum b : SubTipoMotivoEnum.values()) {
                if (String.valueOf(b.value).equals(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "' to SubTipoMotivoEnum");
        }
    }
}
