package br.gov.siscomex.portalunico.duex.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PessoaDTO", propOrder =
        {"tipoDoDocumento", "estrangeiro", "numeroDoDocumento", "nome", "nacionalidade"
        })

@XmlRootElement(name = "PessoaDTO")
public class PessoaDTO {


    @XmlElement(name = "tipoDoDocumento")
    @ApiModelProperty(value = "")
    private TipoDoDocumentoEnum tipoDoDocumento = null;
    @XmlElement(name = "estrangeiro")
    @ApiModelProperty(value = "")
    private Boolean estrangeiro = null;
    @XmlElement(name = "numeroDoDocumento")
    @ApiModelProperty(value = "Número do documento<br />Tamanho mínimo: 1<br />Tamanho máximo: 20")
    /**
     * Número do documento<br />Tamanho mínimo: 1<br />Tamanho máximo: 20
     **/
    private String numeroDoDocumento = null;
    @XmlElement(name = "nome")
    @ApiModelProperty(value = "Nome<br />Tamanho mínimo: 1<br />Tamanho máximo: 150")
    /**
     * Nome<br />Tamanho mínimo: 1<br />Tamanho máximo: 150
     **/
    private String nome = null;
    @XmlElement(name = "nacionalidade")
    @ApiModelProperty(value = "")
    @Valid
    private PaisDto nacionalidade = null;

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
     * Get tipoDoDocumento
     *
     * @return tipoDoDocumento
     **/
    @JsonProperty("tipoDoDocumento")
    public String getTipoDoDocumento() {
        if (tipoDoDocumento == null) {
            return null;
        }
        return tipoDoDocumento.value();
    }

    public void setTipoDoDocumento(TipoDoDocumentoEnum tipoDoDocumento) {
        this.tipoDoDocumento = tipoDoDocumento;
    }

    public PessoaDTO tipoDoDocumento(TipoDoDocumentoEnum tipoDoDocumento) {
        this.tipoDoDocumento = tipoDoDocumento;
        return this;
    }

    /**
     * Get estrangeiro
     *
     * @return estrangeiro
     **/
    @JsonProperty("estrangeiro")
    public Boolean isisEstrangeiro() {
        return estrangeiro;
    }

    public void setEstrangeiro(Boolean estrangeiro) {
        this.estrangeiro = estrangeiro;
    }

    public PessoaDTO estrangeiro(Boolean estrangeiro) {
        this.estrangeiro = estrangeiro;
        return this;
    }

    /**
     * Número do documento&lt;br /&gt;Tamanho mínimo: 1&lt;br /&gt;Tamanho máximo: 20
     *
     * @return numeroDoDocumento
     **/
    @JsonProperty("numeroDoDocumento")
    public String getNumeroDoDocumento() {
        return numeroDoDocumento;
    }

    public void setNumeroDoDocumento(String numeroDoDocumento) {
        this.numeroDoDocumento = numeroDoDocumento;
    }

    public PessoaDTO numeroDoDocumento(String numeroDoDocumento) {
        this.numeroDoDocumento = numeroDoDocumento;
        return this;
    }

    /**
     * Nome&lt;br /&gt;Tamanho mínimo: 1&lt;br /&gt;Tamanho máximo: 150
     *
     * @return nome
     **/
    @JsonProperty("nome")
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public PessoaDTO nome(String nome) {
        this.nome = nome;
        return this;
    }

    /**
     * Get nacionalidade
     *
     * @return nacionalidade
     **/
    @JsonProperty("nacionalidade")
    public PaisDto getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(PaisDto nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public PessoaDTO nacionalidade(PaisDto nacionalidade) {
        this.nacionalidade = nacionalidade;
        return this;
    }


    @Override
    public String toString() {

        String sb = "class PessoaDTO {\n" +
                "    tipoDoDocumento: " + toIndentedString(tipoDoDocumento) + "\n" +
                "    estrangeiro: " + toIndentedString(estrangeiro) + "\n" +
                "    numeroDoDocumento: " + toIndentedString(numeroDoDocumento) + "\n" +
                "    nome: " + toIndentedString(nome) + "\n" +
                "    nacionalidade: " + toIndentedString(nacionalidade) + "\n" +
                "}";
        return sb;
    }

    @XmlType(name = "TipoDoDocumentoEnum")
    @XmlEnum(String.class)
    public enum TipoDoDocumentoEnum {

        @XmlEnumValue("CPF")
        @JsonProperty("CPF")
        CPF("CPF"),

        @XmlEnumValue("CNPJ")
        @JsonProperty("CNPJ")
        CNPJ("CNPJ"),

        @XmlEnumValue("PASSAPORTE")
        @JsonProperty("PASSAPORTE")
        PASSAPORTE("PASSAPORTE"),

        @XmlEnumValue("ID")
        @JsonProperty("ID")
        ID("ID");


        private final String value;

        TipoDoDocumentoEnum(String v) {
            value = v;
        }

        public static TipoDoDocumentoEnum fromValue(String v) {
            for (TipoDoDocumentoEnum b : TipoDoDocumentoEnum.values()) {
                if (String.valueOf(b.value).equals(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "' to TipoDoDocumentoEnum");
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
