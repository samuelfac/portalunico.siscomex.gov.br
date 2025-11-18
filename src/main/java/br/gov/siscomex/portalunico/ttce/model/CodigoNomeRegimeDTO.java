package br.gov.siscomex.portalunico.ttce.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CodigoNomeRegimeDTO", propOrder =
        {"codigo", "nome"
        })

@XmlRootElement(name = "CodigoNomeRegimeDTO")
/**
 * DTO que representa um Regime Tributário.
 **/
@ApiModel(description = "DTO que representa um Regime Tributário.")
public class CodigoNomeRegimeDTO {

    @XmlElement(name = "codigo", required = true)
    @ApiModelProperty(example = "1", required = true, value = "Código identificador do Regime Tributário.")
    /**
     * Código identificador do Regime Tributário.
     **/
    private String codigo = null;

    @XmlElement(name = "nome", required = true)
    @ApiModelProperty(example = "RECOLHIMENTO INTEGRAL", required = true, value = "Nome do Regime Tributário.")
    /**
     * Nome do Regime Tributário.
     **/
    private String nome = null;

    /**
     * Código identificador do Regime Tributário.
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

    public CodigoNomeRegimeDTO codigo(String codigo) {
        this.codigo = codigo;
        return this;
    }

    /**
     * Nome do Regime Tributário.
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

    public CodigoNomeRegimeDTO nome(String nome) {
        this.nome = nome;
        return this;
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

    @Override
    public String toString() {

        String sb = "class CodigoNomeRegimeDTO {\n" +
                "    codigo: " + toIndentedString(codigo) + "\n" +
                "    nome: " + toIndentedString(nome) + "\n" +
                "}";
        return sb;
    }
}
