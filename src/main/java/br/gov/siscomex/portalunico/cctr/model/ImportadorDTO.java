package br.gov.siscomex.portalunico.cctr.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImportadorDTO", propOrder =
        {"identificacao", "nome"
        })

@XmlRootElement(name = "ImportadorDTO")
/**
 * Dados do importador declarado na Duimp
 **/
@ApiModel(description = "Dados do importador declarado na Duimp")
public class ImportadorDTO {

    @XmlElement(name = "identificacao")
    @ApiModelProperty(example = "31827815000172", value = "Número de identificação do importador")
    /**
     * Número de identificação do importador
     **/
    private String identificacao = null;

    @XmlElement(name = "nome")
    @ApiModelProperty(example = "NOME DE EXEMPLO DO IMPORTADOR", value = "Nome do importador")
    /**
     * Nome do importador
     **/
    private String nome = null;

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
     * Número de identificação do importador
     *
     * @return identificacao
     **/
    @JsonProperty("identificacao")
    public String getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }

    public ImportadorDTO identificacao(String identificacao) {
        this.identificacao = identificacao;
        return this;
    }

    /**
     * Nome do importador
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

    public ImportadorDTO nome(String nome) {
        this.nome = nome;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class ImportadorDTO {\n" +
                "    identificacao: " + toIndentedString(identificacao) + "\n" +
                "    nome: " + toIndentedString(nome) + "\n" +
                "}";
        return sb;
    }
}
