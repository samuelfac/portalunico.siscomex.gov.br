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

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResultadoAnaliseRiscoDuimpCover", propOrder =
        {"canalConsolidado"
        })

@XmlRootElement(name = "ResultadoAnaliseRiscoDuimpCover")
/**
 * Resultado da análise de risco para uma Duimp.
 **/
@ApiModel(description = "Resultado da análise de risco para uma Duimp.")
public class ResultadoAnaliseRiscoDuimpCover {


    @XmlElement(name = "canalConsolidado")
    @ApiModelProperty(example = "VERDE", value = "Canais da análise de risco.<br>Domínio:")
    /**
     * Canais da análise de risco.<br>Domínio:
     **/
    private CanalConsolidadoEnum canalConsolidado = null;

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
     * Canais da análise de risco.&lt;br&gt;Domínio:
     *
     * @return canalConsolidado
     **/
    @JsonProperty("canalConsolidado")
    public String getCanalConsolidado() {
        if (canalConsolidado == null) {
            return null;
        }
        return canalConsolidado.value();
    }

    public void setCanalConsolidado(CanalConsolidadoEnum canalConsolidado) {
        this.canalConsolidado = canalConsolidado;
    }

    public ResultadoAnaliseRiscoDuimpCover canalConsolidado(CanalConsolidadoEnum canalConsolidado) {
        this.canalConsolidado = canalConsolidado;
        return this;
    }


    @Override
    public String toString() {

        String sb = "class ResultadoAnaliseRiscoDuimpCover {\n" +
                "    canalConsolidado: " + toIndentedString(canalConsolidado) + "\n" +
                "}";
        return sb;
    }

    @XmlType(name = "CanalConsolidadoEnum")
    @XmlEnum(String.class)
    public enum CanalConsolidadoEnum {

        @XmlEnumValue("1 - Verde")
        @JsonProperty("1 - Verde")
        _1_VERDE("1 - Verde"),

        @XmlEnumValue("12 - Amarelo")
        @JsonProperty("12 - Amarelo")
        _12_AMARELO("12 - Amarelo"),

        @XmlEnumValue("3 - Vermelho")
        @JsonProperty("3 - Vermelho")
        _3_VERMELHO("3 - Vermelho"),

        @XmlEnumValue("15 - Cinza")
        @JsonProperty("15 - Cinza")
        _15_CINZA("15 - Cinza");


        private final String value;

        CanalConsolidadoEnum(String v) {
            value = v;
        }

        public static CanalConsolidadoEnum fromValue(String v) {
            for (CanalConsolidadoEnum b : CanalConsolidadoEnum.values()) {
                if (String.valueOf(b.value).equals(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "' to CanalConsolidadoEnum");
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
