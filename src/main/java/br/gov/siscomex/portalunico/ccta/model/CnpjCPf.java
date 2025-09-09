package br.gov.siscomex.portalunico.ccta.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CnpjCPf", propOrder =
        {"numeroIdentificacao", "nome"
        })

@XmlRootElement(name = "CnpjCPf")
public class CnpjCPf {

    @XmlElement(name = "numeroIdentificacao")
    @ApiModelProperty(example = "00000000000191", value = "Número do CNPJ")
    /**
     * Número do CNPJ
     **/
    private String numeroIdentificacao = null;

    @XmlElement(name = "nome")
    @ApiModelProperty(value = "Nome pessoa fisica ou jurídica")
    /**
     * Nome pessoa fisica ou jurídica
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
     * Número do CNPJ
     *
     * @return numeroIdentificacao
     **/
    @JsonProperty("numeroIdentificacao")
    public String getNumeroIdentificacao() {
        return numeroIdentificacao;
    }

    public void setNumeroIdentificacao(String numeroIdentificacao) {
        this.numeroIdentificacao = numeroIdentificacao;
    }

    public CnpjCPf numeroIdentificacao(String numeroIdentificacao) {
        this.numeroIdentificacao = numeroIdentificacao;
        return this;
    }

    /**
     * Nome pessoa fisica ou jurídica
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

    public CnpjCPf nome(String nome) {
        this.nome = nome;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class CnpjCPf {\n" +
                "    numeroIdentificacao: " + toIndentedString(numeroIdentificacao) + "\n" +
                "    nome: " + toIndentedString(nome) + "\n" +
                "}";
        return sb;
    }
}
