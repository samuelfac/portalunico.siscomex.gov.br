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
@XmlType(name = "CodigoNomeTipoFundamentoOpcionalDTO", propOrder =
        {"codigo", "nome", "tipo"
        })

@XmlRootElement(name = "CodigoNomeTipoFundamentoOpcionalDTO")
/**
 * DTO que representa um Fundamento Legal opcional.
 **/
@ApiModel(description = "DTO que representa um Fundamento Legal opcional.")
public class CodigoNomeTipoFundamentoOpcionalDTO {

    @XmlElement(name = "codigo", required = true)
    @ApiModelProperty(example = "0015", required = true, value = "Código identificador do Fundamento Legal, com 4 dígitos.")
    /**
     * Código identificador do Fundamento Legal, com 4 dígitos.
     **/
    private String codigo = null;

    @XmlElement(name = "nome", required = true)
    @ApiModelProperty(example = "ACE 72 MERCOSUL X COLÔMBIA", required = true, value = "Nome do Fundamento Legal.")
    /**
     * Nome do Fundamento Legal.
     **/
    private String nome = null;


    @XmlElement(name = "tipo", required = true)
    @ApiModelProperty(example = "Opcional", required = true, value = "Tipo de Uso. Nesse contexto o valor sempre será Opcional.")
    /**
     * Tipo de Uso. Nesse contexto o valor sempre será Opcional.
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

    public CodigoNomeTipoFundamentoOpcionalDTO codigo(String codigo) {
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

    public CodigoNomeTipoFundamentoOpcionalDTO nome(String nome) {
        this.nome = nome;
        return this;
    }

    /**
     * Tipo de Uso. Nesse contexto o valor sempre será Opcional.
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

    public CodigoNomeTipoFundamentoOpcionalDTO tipo(TipoEnum tipo) {
        this.tipo = tipo;
        return this;
    }


    @Override
    public String toString() {

        String sb = "class CodigoNomeTipoFundamentoOpcionalDTO {\n" +
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
