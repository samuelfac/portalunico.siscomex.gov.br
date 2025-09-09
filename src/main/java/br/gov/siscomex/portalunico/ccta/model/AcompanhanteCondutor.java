package br.gov.siscomex.portalunico.ccta.model;

import com.fasterxml.jackson.annotation.JsonProperty;
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
@XmlType(name = "AcompanhanteCondutor", propOrder =
        {"tipoDocumento", "categoria", "nacionalidadeBrasileira", "nome", "numeroDocumento"
        })

@XmlRootElement(name = "AcompanhanteCondutor")
public class AcompanhanteCondutor {


    @XmlElement(name = "tipoDocumento", required = true)
    @ApiModelProperty(example = "F", required = true, value = "Tipo do documento do acompanhante do condutor do veículo.<br/> \"F\" (CPF), \"J\" (CNPJ),\"P\" (passaporte), \"O\" (outros)<br/>Se nacionalidadeBrasileira é true, é obrigatório o preenchimento do valor \"F\" ou \"H\".<br/>Se condutorBrasileiro é false, o tipo pode ser 'P' ou 'O'")
    /**
     * Tipo do documento do acompanhante do condutor do veículo.<br/> \"F\" (CPF), \"J\" (CNPJ),\"P\" (passaporte), \"O\" (outros)<br/>Se nacionalidadeBrasileira é true, é obrigatório o preenchimento do valor \"F\" ou \"H\".<br/>Se condutorBrasileiro é false, o tipo pode ser 'P' ou 'O'
     **/
    private TipoDocumentoEnum tipoDocumento = null;
    @XmlElement(name = "categoria", required = true)
    @ApiModelProperty(example = "A", required = true, value = "Categoria de quem está acompanhando o condutor na viagem<br/> A = Acompanhante, M = Motorista substituto")
    /**
     * Categoria de quem está acompanhando o condutor na viagem<br/> A = Acompanhante, M = Motorista substituto
     **/
    private CategoriaEnum categoria = null;
    @XmlElement(name = "nacionalidadeBrasileira", required = true)
    @ApiModelProperty(example = "true", required = true, value = "Indicador que informa se quem está acompanhando o condutor do veículo da viagem é de nacionalidade brasileira")
    /**
     * Indicador que informa se quem está acompanhando o condutor do veículo da viagem é de nacionalidade brasileira
     **/
    private Boolean nacionalidadeBrasileira = null;
    @XmlElement(name = "nome")
    @ApiModelProperty(example = "Nome e Sobrenome", value = "Nome do acompanhante estrangeiro do condutor do veículo<br/> Se nacionalidadeBrasileira é N, esta informação é de preenchimento obrigatório.<br/> Tamanho Máximo: 150")
    /**
     * Nome do acompanhante estrangeiro do condutor do veículo<br/> Se nacionalidadeBrasileira é N, esta informação é de preenchimento obrigatório.<br/> Tamanho Máximo: 150
     **/
    private String nome = null;
    @XmlElement(name = "numeroDocumento", required = true)
    @ApiModelProperty(example = "12345678901", required = true, value = "Número do documento do acompanhante do condutor do veículo<br/> Se nacionalidadeBrasileira é true e o Tipo do documento do acompanhante for 'F', o número informado  deverá ser  validado no cadastro de CPFs.<br/> Tamanho Máximo: 20")
    /**
     * Número do documento do acompanhante do condutor do veículo<br/> Se nacionalidadeBrasileira é true e o Tipo do documento do acompanhante for 'F', o número informado  deverá ser  validado no cadastro de CPFs.<br/> Tamanho Máximo: 20
     **/
    private String numeroDocumento = null;

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
     * Tipo do documento do acompanhante do condutor do veículo.&lt;br/&gt; \&quot;F\&quot; (CPF), \&quot;J\&quot; (CNPJ),\&quot;P\&quot; (passaporte), \&quot;O\&quot; (outros)&lt;br/&gt;Se nacionalidadeBrasileira é true, é obrigatório o preenchimento do valor \&quot;F\&quot; ou \&quot;H\&quot;.&lt;br/&gt;Se condutorBrasileiro é false, o tipo pode ser &#39;P&#39; ou &#39;O&#39;
     *
     * @return tipoDocumento
     **/
    @JsonProperty("tipoDocumento")
    @NotNull
    public String getTipoDocumento() {
        if (tipoDocumento == null) {
            return null;
        }
        return tipoDocumento.value();
    }

    public void setTipoDocumento(TipoDocumentoEnum tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public AcompanhanteCondutor tipoDocumento(TipoDocumentoEnum tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
        return this;
    }

    /**
     * Categoria de quem está acompanhando o condutor na viagem&lt;br/&gt; A &#x3D; Acompanhante, M &#x3D; Motorista substituto
     *
     * @return categoria
     **/
    @JsonProperty("categoria")
    @NotNull
    public String getCategoria() {
        if (categoria == null) {
            return null;
        }
        return categoria.value();
    }

    public void setCategoria(CategoriaEnum categoria) {
        this.categoria = categoria;
    }

    public AcompanhanteCondutor categoria(CategoriaEnum categoria) {
        this.categoria = categoria;
        return this;
    }

    /**
     * Indicador que informa se quem está acompanhando o condutor do veículo da viagem é de nacionalidade brasileira
     *
     * @return nacionalidadeBrasileira
     **/
    @JsonProperty("nacionalidadeBrasileira")
    @NotNull
    public Boolean isisNacionalidadeBrasileira() {
        return nacionalidadeBrasileira;
    }

    public void setNacionalidadeBrasileira(Boolean nacionalidadeBrasileira) {
        this.nacionalidadeBrasileira = nacionalidadeBrasileira;
    }

    public AcompanhanteCondutor nacionalidadeBrasileira(Boolean nacionalidadeBrasileira) {
        this.nacionalidadeBrasileira = nacionalidadeBrasileira;
        return this;
    }

    /**
     * Nome do acompanhante estrangeiro do condutor do veículo&lt;br/&gt; Se nacionalidadeBrasileira é N, esta informação é de preenchimento obrigatório.&lt;br/&gt; Tamanho Máximo: 150
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

    public AcompanhanteCondutor nome(String nome) {
        this.nome = nome;
        return this;
    }

    /**
     * Número do documento do acompanhante do condutor do veículo&lt;br/&gt; Se nacionalidadeBrasileira é true e o Tipo do documento do acompanhante for &#39;F&#39;, o número informado  deverá ser  validado no cadastro de CPFs.&lt;br/&gt; Tamanho Máximo: 20
     *
     * @return numeroDocumento
     **/
    @JsonProperty("numeroDocumento")
    @NotNull
    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public AcompanhanteCondutor numeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class AcompanhanteCondutor {\n" +
                "    tipoDocumento: " + toIndentedString(tipoDocumento) + "\n" +
                "    categoria: " + toIndentedString(categoria) + "\n" +
                "    nacionalidadeBrasileira: " + toIndentedString(nacionalidadeBrasileira) + "\n" +
                "    nome: " + toIndentedString(nome) + "\n" +
                "    numeroDocumento: " + toIndentedString(numeroDocumento) + "\n" +
                "}";
        return sb;
    }


    @XmlType(name = "TipoDocumentoEnum")
    @XmlEnum(String.class)
    public enum TipoDocumentoEnum {

        @XmlEnumValue("H")
        @JsonProperty("H")
        H("H"),

        @XmlEnumValue("F")
        @JsonProperty("F")
        F("F"),

        @XmlEnumValue("P")
        @JsonProperty("P")
        P("P"),

        @XmlEnumValue("O")
        @JsonProperty("O")
        O("O");


        private final String value;

        TipoDocumentoEnum(String v) {
            value = v;
        }

        public static TipoDocumentoEnum fromValue(String v) {
            for (TipoDocumentoEnum b : TipoDocumentoEnum.values()) {
                if (String.valueOf(b.value).equals(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "' to TipoDocumentoEnum");
        }

        public String value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
    }

    @XmlType(name = "CategoriaEnum")
    @XmlEnum(String.class)
    public enum CategoriaEnum {

        @XmlEnumValue("A")
        @JsonProperty("A")
        A("A"),

        @XmlEnumValue("M")
        @JsonProperty("M")
        M("M");


        private final String value;

        CategoriaEnum(String v) {
            value = v;
        }

        public static CategoriaEnum fromValue(String v) {
            for (CategoriaEnum b : CategoriaEnum.values()) {
                if (String.valueOf(b.value).equals(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "' to CategoriaEnum");
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
