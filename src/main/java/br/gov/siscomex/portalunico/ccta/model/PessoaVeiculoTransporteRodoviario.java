package br.gov.siscomex.portalunico.ccta.model;

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
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PessoaVeiculoTransporteRodoviario", propOrder =
        {"acompanhantes", "nacionalidadeBrasileira", "nome", "numeroDocumento", "tipo", "tipoDocumento"
        })

@XmlRootElement(name = "PessoaVeiculoTransporteRodoviario")
public class PessoaVeiculoTransporteRodoviario {

    @XmlElement(name = "acompanhantes")
    @ApiModelProperty(value = "")
    @Valid
    private List<PessoaVeiculoTransporteRodoviario> acompanhantes = null;

    @XmlElement(name = "nacionalidadeBrasileira")
    @ApiModelProperty(value = "Indicador de se a pessoa é brasileira ou não")
    /**
     * Indicador de se a pessoa é brasileira ou não
     **/
    private Boolean nacionalidadeBrasileira = null;

    @XmlElement(name = "nome")
    @ApiModelProperty(example = "12345678901", value = "Nome da pessoa envolvida")
    /**
     * Nome da pessoa envolvida
     **/
    private String nome = null;

    @XmlElement(name = "numeroDocumento")
    @ApiModelProperty(example = "12345678901", value = "Número do Documento")
    /**
     * Número do Documento
     **/
    private String numeroDocumento = null;


    @XmlElement(name = "tipo")
    @ApiModelProperty(value = "Classificação da pessoa do veículo")
    /**
     * Classificação da pessoa do veículo
     **/
    private TipoEnum tipo = null;
    @XmlElement(name = "tipoDocumento")
    @ApiModelProperty(value = "")
    @Valid
    private TipoDocumento tipoDocumento = null;

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
     * Get acompanhantes
     *
     * @return acompanhantes
     **/
    @JsonProperty("acompanhantes")
    public List<PessoaVeiculoTransporteRodoviario> getAcompanhantes() {
        return acompanhantes;
    }

    public void setAcompanhantes(List<PessoaVeiculoTransporteRodoviario> acompanhantes) {
        this.acompanhantes = acompanhantes;
    }

    public PessoaVeiculoTransporteRodoviario acompanhantes(List<PessoaVeiculoTransporteRodoviario> acompanhantes) {
        this.acompanhantes = acompanhantes;
        return this;
    }

    public PessoaVeiculoTransporteRodoviario addAcompanhantesItem(PessoaVeiculoTransporteRodoviario acompanhantesItem) {
        this.acompanhantes.add(acompanhantesItem);
        return this;
    }

    /**
     * Indicador de se a pessoa é brasileira ou não
     *
     * @return nacionalidadeBrasileira
     **/
    @JsonProperty("nacionalidadeBrasileira")
    public Boolean isisNacionalidadeBrasileira() {
        return nacionalidadeBrasileira;
    }

    public void setNacionalidadeBrasileira(Boolean nacionalidadeBrasileira) {
        this.nacionalidadeBrasileira = nacionalidadeBrasileira;
    }

    public PessoaVeiculoTransporteRodoviario nacionalidadeBrasileira(Boolean nacionalidadeBrasileira) {
        this.nacionalidadeBrasileira = nacionalidadeBrasileira;
        return this;
    }

    /**
     * Nome da pessoa envolvida
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

    public PessoaVeiculoTransporteRodoviario nome(String nome) {
        this.nome = nome;
        return this;
    }

    /**
     * Número do Documento
     *
     * @return numeroDocumento
     **/
    @JsonProperty("numeroDocumento")
    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public PessoaVeiculoTransporteRodoviario numeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
        return this;
    }

    /**
     * Classificação da pessoa do veículo
     *
     * @return tipo
     **/
    @JsonProperty("tipo")
    public String getTipo() {
        if (tipo == null) {
            return null;
        }
        return tipo.value();
    }

    public void setTipo(TipoEnum tipo) {
        this.tipo = tipo;
    }

    public PessoaVeiculoTransporteRodoviario tipo(TipoEnum tipo) {
        this.tipo = tipo;
        return this;
    }

    /**
     * Get tipoDocumento
     *
     * @return tipoDocumento
     **/
    @JsonProperty("tipoDocumento")
    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public PessoaVeiculoTransporteRodoviario tipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
        return this;
    }


    @Override
    public String toString() {

        String sb = "class PessoaVeiculoTransporteRodoviario {\n" +
                "    acompanhantes: " + toIndentedString(acompanhantes) + "\n" +
                "    nacionalidadeBrasileira: " + toIndentedString(nacionalidadeBrasileira) + "\n" +
                "    nome: " + toIndentedString(nome) + "\n" +
                "    numeroDocumento: " + toIndentedString(numeroDocumento) + "\n" +
                "    tipo: " + toIndentedString(tipo) + "\n" +
                "    tipoDocumento: " + toIndentedString(tipoDocumento) + "\n" +
                "}";
        return sb;
    }

    @XmlType(name = "TipoEnum")
    @XmlEnum(String.class)
    public enum TipoEnum {

        @XmlEnumValue("CONDUTOR")
        @JsonProperty("CONDUTOR")
        CONDUTOR("CONDUTOR"),

        @XmlEnumValue("ACOMPANHANTE")
        @JsonProperty("ACOMPANHANTE")
        ACOMPANHANTE("ACOMPANHANTE"),

        @XmlEnumValue("MOTORISTA_SUBSTITUTO")
        @JsonProperty("MOTORISTA_SUBSTITUTO")
        MOTORISTA_SUBSTITUTO("MOTORISTA_SUBSTITUTO");


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
