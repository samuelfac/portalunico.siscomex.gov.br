package br.gov.siscomex.portalunico.ccta_ter_ext_xml.model;

import com.fasterxml.jackson.annotation.JsonProperty;
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
import java.math.BigDecimal;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Reboque", propOrder =
        {"lacresReboque", "placaReboque", "reboquePropriaMercadoria", "taraReboque", "tipoReboque"
        })

@XmlRootElement(name = "Reboque")
public class Reboque {

    @XmlElement(name = "lacresReboque")
    @ApiModelProperty(value = "")
    @Valid
    private List<Lacre> lacresReboque = null;

    @XmlElement(name = "placaReboque")
    @ApiModelProperty(example = "REB6789", value = "Placa do reboque <br/>É obrigatória apenas se o reboquePropriaMercadoria for igual a \"false\".<br/> Tamanho Máximo: 20")
    /**
     * Placa do reboque <br/>É obrigatória apenas se o reboquePropriaMercadoria for igual a \"false\".<br/> Tamanho Máximo: 20
     **/
    private String placaReboque = null;

    @XmlElement(name = "reboquePropriaMercadoria", required = true)
    @ApiModelProperty(example = "true", required = true, value = "Indicador que informa se o reboque é a própria mercadoria")
    /**
     * Indicador que informa se o reboque é a própria mercadoria
     **/
    private Boolean reboquePropriaMercadoria = null;

    @XmlElement(name = "taraReboque", required = true)
    @ApiModelProperty(example = "105.478", required = true, value = "Tara do reboque<br/> Obrigatória para cada reboque informado se tipoVeiculo é C1R, C2R ou C3R.<br/>Formato: Número Racional com 9 casas inteiras e 3 casas decimais")
    @Valid
    /**
     * Tara do reboque<br/> Obrigatória para cada reboque informado se tipoVeiculo é C1R, C2R ou C3R.<br/>Formato: Número Racional com 9 casas inteiras e 3 casas decimais
     **/
    private BigDecimal taraReboque = null;


    @XmlType(name = "TipoReboqueEnum")
    @XmlEnum(String.class)
    public enum TipoReboqueEnum {

        @XmlEnumValue("R")
        @JsonProperty("R")
        R("R"),

        @XmlEnumValue("S")
        @JsonProperty("S")
        S("S");


        private final String value;

        TipoReboqueEnum(String v) {
            value = v;
        }

        public String value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static TipoReboqueEnum fromValue(String v) {
            for (TipoReboqueEnum b : TipoReboqueEnum.values()) {
                if (String.valueOf(b.value).equals(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "' to TipoReboqueEnum");
        }
    }

    @XmlElement(name = "tipoReboque", required = true)
    @ApiModelProperty(example = "R", required = true, value = "Indicador que informa se é reboque ou semi reboque")
    /**
     * Indicador que informa se é reboque ou semi reboque
     **/
    private TipoReboqueEnum tipoReboque = null;

    /**
     * Get lacresReboque
     *
     * @return lacresReboque
     **/
    @JsonProperty("lacresReboque")
    public List<Lacre> getLacresReboque() {
        return lacresReboque;
    }

    public void setLacresReboque(List<Lacre> lacresReboque) {
        this.lacresReboque = lacresReboque;
    }

    public Reboque lacresReboque(List<Lacre> lacresReboque) {
        this.lacresReboque = lacresReboque;
        return this;
    }

    public Reboque addLacresReboqueItem(Lacre lacresReboqueItem) {
        this.lacresReboque.add(lacresReboqueItem);
        return this;
    }

    /**
     * Placa do reboque &lt;br/&gt;É obrigatória apenas se o reboquePropriaMercadoria for igual a \&quot;false\&quot;.&lt;br/&gt; Tamanho Máximo: 20
     *
     * @return placaReboque
     **/
    @JsonProperty("placaReboque")
    public String getPlacaReboque() {
        return placaReboque;
    }

    public void setPlacaReboque(String placaReboque) {
        this.placaReboque = placaReboque;
    }

    public Reboque placaReboque(String placaReboque) {
        this.placaReboque = placaReboque;
        return this;
    }

    /**
     * Indicador que informa se o reboque é a própria mercadoria
     *
     * @return reboquePropriaMercadoria
     **/
    @JsonProperty("reboquePropriaMercadoria")
    @NotNull
    public Boolean isReboquePropriaMercadoria() {
        return reboquePropriaMercadoria;
    }

    public void setReboquePropriaMercadoria(Boolean reboquePropriaMercadoria) {
        this.reboquePropriaMercadoria = reboquePropriaMercadoria;
    }

    public Reboque reboquePropriaMercadoria(Boolean reboquePropriaMercadoria) {
        this.reboquePropriaMercadoria = reboquePropriaMercadoria;
        return this;
    }

    /**
     * Tara do reboque&lt;br/&gt; Obrigatória para cada reboque informado se tipoVeiculo é C1R, C2R ou C3R.&lt;br/&gt;Formato: Número Racional com 9 casas inteiras e 3 casas decimais
     *
     * @return taraReboque
     **/
    @JsonProperty("taraReboque")
    @NotNull
    public BigDecimal getTaraReboque() {
        return taraReboque;
    }

    public void setTaraReboque(BigDecimal taraReboque) {
        this.taraReboque = taraReboque;
    }

    public Reboque taraReboque(BigDecimal taraReboque) {
        this.taraReboque = taraReboque;
        return this;
    }

    /**
     * Indicador que informa se é reboque ou semi reboque
     *
     * @return tipoReboque
     **/
    @JsonProperty("tipoReboque")
    @NotNull
    public String getTipoReboque() {
        if (tipoReboque == null) {
            return null;
        }
        return tipoReboque.value();
    }

    public void setTipoReboque(TipoReboqueEnum tipoReboque) {
        this.tipoReboque = tipoReboque;
    }

    public Reboque tipoReboque(TipoReboqueEnum tipoReboque) {
        this.tipoReboque = tipoReboque;
        return this;
    }


    @Override
    public String toString() {

        String sb = "class Reboque {\n" +
                "    lacresReboque: " + toIndentedString(lacresReboque) + "\n" +
                "    placaReboque: " + toIndentedString(placaReboque) + "\n" +
                "    reboquePropriaMercadoria: " + toIndentedString(reboquePropriaMercadoria) + "\n" +
                "    taraReboque: " + toIndentedString(taraReboque) + "\n" +
                "    tipoReboque: " + toIndentedString(tipoReboque) + "\n" +
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

