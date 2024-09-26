package br.gov.siscomex.portalunico.cct_imp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TerceiroDTO", propOrder =
        {"identificacao", "nome"
        })

@XmlRootElement(name = "TerceiroDTO")
/**
 * Dados de terceiro declarado na Duimp
 **/
@ApiModel(description = "Dados de terceiro declarado na Duimp")
public class TerceiroDTO {

    @XmlElement(name = "identificacao")
    @ApiModelProperty(example = "64854252000160", value = "Número de identificação")
    /**
     * Número de identificação
     **/
    private String identificacao = null;

    @XmlElement(name = "nome")
    @ApiModelProperty(example = "NOME DE EXEMPLO DO TERCEIRO", value = "Nome do terceiro")
    /**
     * Nome do terceiro
     **/
    private String nome = null;

    /**
     * Número de identificação
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

    public TerceiroDTO identificacao(String identificacao) {
        this.identificacao = identificacao;
        return this;
    }

    /**
     * Nome do terceiro
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

    public TerceiroDTO nome(String nome) {
        this.nome = nome;
        return this;
    }


    @Override
    public String toString() {

        String sb = "class TerceiroDTO {\n" +
                "    identificacao: " + toIndentedString(identificacao) + "\n" +
                "    nome: " + toIndentedString(nome) + "\n" +
                "}";
        return sb;
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
}

