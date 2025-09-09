package br.gov.siscomex.portalunico.anex.model;

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
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TipoDossie", propOrder =
        {"idTipoDossie", "tiposDocumento", "nomeTipoDossie", "tipoRepresentacao"
        })

@XmlRootElement(name = "TipoDossie")
/**
 * Tipo de dossiê.
 **/
@ApiModel(description = "Tipo de dossiê.")
public class TipoDossie {

    @XmlElement(name = "idTipoDossie", required = true)
    @ApiModelProperty(example = "538797", required = true, value = "Id do tipo de dossiê.<br/>Valor mínimo: 1<br/>Valor máximo: 2147483647")
    /**
     * Id do tipo de dossiê.<br/>Valor mínimo: 1<br/>Valor máximo: 2147483647
     **/
    private Long idTipoDossie = null;

    @XmlElement(name = "tiposDocumento")
    @ApiModelProperty(value = "Lista de tipos de documento.")
    @Valid
    /**
     * Lista de tipos de documento.
     **/
    private List<TipoDocumento> tiposDocumento = null;

    @XmlElement(name = "nomeTipoDossie")
    @ApiModelProperty(example = "Dossiê de Importação", value = "Nome do tipo de dossiê.<br/>Tamanho máximo: 255")
    /**
     * Nome do tipo de dossiê.<br/>Tamanho máximo: 255
     **/
    private String nomeTipoDossie = null;
    @XmlElement(name = "tipoRepresentacao")
    @ApiModelProperty(example = "IMPORTACAO", value = "IMPORTACAO, EXPORTACAO, AMBOS")
    /**
     * IMPORTACAO, EXPORTACAO, AMBOS
     **/
    private List<TipoRepresentacaoEnum> tipoRepresentacao = null;

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
     * Id do tipo de dossiê.&lt;br/&gt;Valor mínimo: 1&lt;br/&gt;Valor máximo: 2147483647
     *
     * @return idTipoDossie
     **/
    @JsonProperty("idTipoDossie")
    @NotNull
    public Long getIdTipoDossie() {
        return idTipoDossie;
    }

    public void setIdTipoDossie(Long idTipoDossie) {
        this.idTipoDossie = idTipoDossie;
    }

    public TipoDossie idTipoDossie(Long idTipoDossie) {
        this.idTipoDossie = idTipoDossie;
        return this;
    }

    /**
     * Lista de tipos de documento.
     *
     * @return tiposDocumento
     **/
    @JsonProperty("tiposDocumento")
    public List<TipoDocumento> getTiposDocumento() {
        return tiposDocumento;
    }

    public void setTiposDocumento(List<TipoDocumento> tiposDocumento) {
        this.tiposDocumento = tiposDocumento;
    }

    public TipoDossie tiposDocumento(List<TipoDocumento> tiposDocumento) {
        this.tiposDocumento = tiposDocumento;
        return this;
    }

    public TipoDossie addTiposDocumentoItem(TipoDocumento tiposDocumentoItem) {
        this.tiposDocumento.add(tiposDocumentoItem);
        return this;
    }

    /**
     * Nome do tipo de dossiê.&lt;br/&gt;Tamanho máximo: 255
     *
     * @return nomeTipoDossie
     **/
    @JsonProperty("nomeTipoDossie")
    public String getNomeTipoDossie() {
        return nomeTipoDossie;
    }

    public void setNomeTipoDossie(String nomeTipoDossie) {
        this.nomeTipoDossie = nomeTipoDossie;
    }

    public TipoDossie nomeTipoDossie(String nomeTipoDossie) {
        this.nomeTipoDossie = nomeTipoDossie;
        return this;
    }

    /**
     * IMPORTACAO, EXPORTACAO, AMBOS
     *
     * @return tipoRepresentacao
     **/
    @JsonProperty("tipoRepresentacao")
    public List<TipoRepresentacaoEnum> getTipoRepresentacao() {
        return tipoRepresentacao;
    }

    public void setTipoRepresentacao(List<TipoRepresentacaoEnum> tipoRepresentacao) {
        this.tipoRepresentacao = tipoRepresentacao;
    }

    public TipoDossie tipoRepresentacao(List<TipoRepresentacaoEnum> tipoRepresentacao) {
        this.tipoRepresentacao = tipoRepresentacao;
        return this;
    }

    public TipoDossie addTipoRepresentacaoItem(TipoRepresentacaoEnum tipoRepresentacaoItem) {
        this.tipoRepresentacao.add(tipoRepresentacaoItem);
        return this;
    }


    @Override
    public String toString() {

        String sb = "class TipoDossie {\n" +
                "    idTipoDossie: " + toIndentedString(idTipoDossie) + "\n" +
                "    tiposDocumento: " + toIndentedString(tiposDocumento) + "\n" +
                "    nomeTipoDossie: " + toIndentedString(nomeTipoDossie) + "\n" +
                "    tipoRepresentacao: " + toIndentedString(tipoRepresentacao) + "\n" +
                "}";
        return sb;
    }

    @XmlType(name = "TipoRepresentacaoEnum")
    @XmlEnum(String.class)
    public enum TipoRepresentacaoEnum {

        @XmlEnumValue("IMPORTACAO")
        @JsonProperty("IMPORTACAO")
        IMPORTACAO("IMPORTACAO"),

        @XmlEnumValue("EXPORTACAO")
        @JsonProperty("EXPORTACAO")
        EXPORTACAO("EXPORTACAO"),

        @XmlEnumValue("AMBOS")
        @JsonProperty("AMBOS")
        AMBOS("AMBOS");


        private final String value;

        TipoRepresentacaoEnum(String v) {
            value = v;
        }

        public static TipoRepresentacaoEnum fromValue(String v) {
            for (TipoRepresentacaoEnum b : TipoRepresentacaoEnum.values()) {
                if (String.valueOf(b.value).equals(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "' to TipoRepresentacaoEnum");
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
