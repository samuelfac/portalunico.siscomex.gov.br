package br.gov.siscomex.portalunico.dimp.model;

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
@XmlType(name = "ProcessoDocumentoInstrucaoCover", propOrder =
        {"identificacao", "tipo"
        })

@XmlRootElement(name = "ProcessoDocumentoInstrucaoCover")
/**
 * Lista de processos vinculados.
 **/
@ApiModel(description = "Lista de processos vinculados.")
public class ProcessoDocumentoInstrucaoCover {

    @XmlElement(name = "identificacao", required = true)
    @ApiModelProperty(example = "15595720034201371", required = true, value = "Número do Processo vinculado à Duimp.")
    /**
     * Número do Processo vinculado à Duimp.
     **/
    private String identificacao = null;

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

    @XmlElement(name = "tipo", required = true)
    @ApiModelProperty(example = "ADMINISTRATIVO", required = true, value = "Tipo de Processo Administrativo.<br>Domínio:")
    /**
     * Tipo de Processo Administrativo.<br>Domínio:
     **/
    private TipoEnum tipo = null;

    /**
     * Número do Processo vinculado à Duimp.
     *
     * @return identificacao
     **/
    @JsonProperty("identificacao")
    @NotNull
    public String getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }

    public ProcessoDocumentoInstrucaoCover identificacao(String identificacao) {
        this.identificacao = identificacao;
        return this;
    }

    /**
     * Tipo de Processo Administrativo.&lt;br&gt;Domínio:
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

    public ProcessoDocumentoInstrucaoCover tipo(TipoEnum tipo) {
        this.tipo = tipo;
        return this;
    }


    @Override
    public String toString() {

        String sb = "class ProcessoDocumentoInstrucaoCover {\n" +
                "    identificacao: " + toIndentedString(identificacao) + "\n" +
                "    tipo: " + toIndentedString(tipo) + "\n" +
                "}";
        return sb;
    }

    @XmlType(name = "TipoEnum")
    @XmlEnum(String.class)
    public enum TipoEnum {

        @XmlEnumValue("ADMINISTRATIVO")
        @JsonProperty("ADMINISTRATIVO")
        ADMINISTRATIVO("ADMINISTRATIVO");


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
