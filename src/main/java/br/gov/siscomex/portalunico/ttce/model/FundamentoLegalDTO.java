package br.gov.siscomex.portalunico.ttce.model;

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
@XmlType(name = "FundamentoLegalDTO", propOrder =
        {"codigo", "nome", "tipo"
        })

@XmlRootElement(name = "FundamentoLegalDTO")
/**
 * DTO que representa um Fundamento Legal.
 **/
@ApiModel(description = "DTO que representa um Fundamento Legal.")
public class FundamentoLegalDTO {

    @XmlElement(name = "codigo", required = true)
    @ApiModelProperty(example = "0003", required = true, value = "Código identificador do Fundamento Legal, com 4 dígitos.")
    /**
     * Código identificador do Fundamento Legal, com 4 dígitos.
     **/
    private String codigo = null;

    @XmlElement(name = "nome", required = true)
    @ApiModelProperty(example = "ALÍQUOTA TEC", required = true, value = "Nome do Fundamento Legal.")
    /**
     * Nome do Fundamento Legal.
     **/
    private String nome = null;


    @XmlElement(name = "tipo", required = true)
    @ApiModelProperty(example = "Normal", required = true, value = "Tipo de Uso do Fundamento Legal. Valores possíveis: Normal, Teto ou Opcional")
    /**
     * Tipo de Uso do Fundamento Legal. Valores possíveis: Normal, Teto ou Opcional
     **/
    private TipoEnum tipo = null;

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
     * Código identificador do Fundamento Legal, com 4 dígitos.
     *
     * @return codigo
     **/
    @JsonProperty("codigo")
    @NotNull
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public FundamentoLegalDTO codigo(String codigo) {
        this.codigo = codigo;
        return this;
    }

    /**
     * Nome do Fundamento Legal.
     *
     * @return nome
     **/
    @JsonProperty("nome")
    @NotNull
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public FundamentoLegalDTO nome(String nome) {
        this.nome = nome;
        return this;
    }

    /**
     * Tipo de Uso do Fundamento Legal. Valores possíveis: Normal, Teto ou Opcional
     *
     * @return tipo
     **/
    @JsonProperty("tipo")
    @NotNull
    public String getTipo() {
        if (tipo == null) {
            return null;
        }
        return tipo.value();
    }

    public void setTipo(TipoEnum tipo) {
        this.tipo = tipo;
    }

    public FundamentoLegalDTO tipo(TipoEnum tipo) {
        this.tipo = tipo;
        return this;
    }


    @Override
    public String toString() {

        String sb = "class FundamentoLegalDTO {\n" +
                "    codigo: " + toIndentedString(codigo) + "\n" +
                "    nome: " + toIndentedString(nome) + "\n" +
                "    tipo: " + toIndentedString(tipo) + "\n" +
                "}";
        return sb;
    }

    @XmlType(name = "TipoEnum")
    @XmlEnum(String.class)
    public enum TipoEnum {

        @XmlEnumValue("Normal")
        @JsonProperty("Normal")
        NORMAL("Normal"),

        @XmlEnumValue("Teto")
        @JsonProperty("Teto")
        TETO("Teto"),

        @XmlEnumValue("Opcional")
        @JsonProperty("Opcional")
        OPCIONAL("Opcional");


        private final String value;

        TipoEnum(String v) {
            value = v;
        }

        public static TipoEnum fromValue(String v) {
            for (TipoEnum b : TipoEnum.values()) {
                if (String.valueOf(b.value).equals(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "' to TipoEnum");
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
