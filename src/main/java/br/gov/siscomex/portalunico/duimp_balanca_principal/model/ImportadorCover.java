package br.gov.siscomex.portalunico.duimp_balanca_principal.model;

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
@XmlType(name = "ImportadorCover", propOrder =
        {"tipoImportador", "ni"
        })

@XmlRootElement(name = "ImportadorCover")
/**
 * Identificação do importador da declaração única de importação.
 **/
@ApiModel(description = "Identificação do importador da declaração única de importação.")
public class ImportadorCover {


    @XmlType(name = "TipoImportadorEnum")
    @XmlEnum(String.class)
    public enum TipoImportadorEnum {

        @XmlEnumValue("CNPJ")
        @JsonProperty("CNPJ")
        CNPJ("CNPJ"),

        @XmlEnumValue("CPF")
        @JsonProperty("CPF")
        CPF("CPF");


        private final String value;

        TipoImportadorEnum(String v) {
            value = v;
        }

        public String value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static TipoImportadorEnum fromValue(String v) {
            for (TipoImportadorEnum b : TipoImportadorEnum.values()) {
                if (String.valueOf(b.value).equals(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "' to TipoImportadorEnum");
        }
    }

    @XmlElement(name = "tipoImportador")
    @ApiModelProperty(example = "CNPJ", value = "Descreve se o Importador é do tipo CPF ou CNPJ")
    /**
     * Descreve se o Importador é do tipo CPF ou CNPJ
     **/
    private TipoImportadorEnum tipoImportador = null;

    @XmlElement(name = "ni", required = true)
    @ApiModelProperty(example = "00055555000130", required = true, value = "<br>Número do Importador: <br>Caso seja CNPJ: <br>Tamanho: 14<br>Formato: 'NNNNNNNNNNNNNN'<br>Caso seja CPF: <br>Tamanho: 11<br>Formato: 'NNNNNNNNNNN'")
    /**
     * <br>Número do Importador: <br>Caso seja CNPJ: <br>Tamanho: 14<br>Formato: 'NNNNNNNNNNNNNN'<br>Caso seja CPF: <br>Tamanho: 11<br>Formato: 'NNNNNNNNNNN'
     **/
    private String ni = null;

    /**
     * Descreve se o Importador é do tipo CPF ou CNPJ
     *
     * @return tipoImportador
     **/
    @JsonProperty("tipoImportador")
    public String getTipoImportador() {
        if (tipoImportador == null) {
            return null;
        }
        return tipoImportador.value();
    }

    public void setTipoImportador(TipoImportadorEnum tipoImportador) {
        this.tipoImportador = tipoImportador;
    }

    public ImportadorCover tipoImportador(TipoImportadorEnum tipoImportador) {
        this.tipoImportador = tipoImportador;
        return this;
    }

    /**
     * &lt;br&gt;Número do Importador: &lt;br&gt;Caso seja CNPJ: &lt;br&gt;Tamanho: 14&lt;br&gt;Formato: &#39;NNNNNNNNNNNNNN&#39;&lt;br&gt;Caso seja CPF: &lt;br&gt;Tamanho: 11&lt;br&gt;Formato: &#39;NNNNNNNNNNN&#39;
     *
     * @return ni
     **/
    @JsonProperty("ni")
    @NotNull
    public String getNi() {
        return ni;
    }

    public void setNi(String ni) {
        this.ni = ni;
    }

    public ImportadorCover ni(String ni) {
        this.ni = ni;
        return this;
    }


    @Override
    public String toString() {

        String sb = "class ImportadorCover {\n" +
                "    tipoImportador: " + toIndentedString(tipoImportador) + "\n" +
                "    ni: " + toIndentedString(ni) + "\n" +
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

