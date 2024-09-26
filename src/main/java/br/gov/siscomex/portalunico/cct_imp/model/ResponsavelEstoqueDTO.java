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
@XmlType(name = "ResponsavelEstoqueDTO", propOrder =
        {"identificacao", "nome"
        })

@XmlRootElement(name = "ResponsavelEstoqueDTO")
/**
 * Dados do responsável pela carga
 **/
@ApiModel(description = "Dados do responsável pela carga")
public class ResponsavelEstoqueDTO {

    @XmlElement(name = "identificacao")
    @ApiModelProperty(example = "22187098000170", value = "Número de identificação do responsável pelo estoque")
    /**
     * Número de identificação do responsável pelo estoque
     **/
    private String identificacao = null;

    @XmlElement(name = "nome")
    @ApiModelProperty(example = "NOME DE EXEMPLO DO RESPONSAVEL PELO ESTOQUE", value = "Nome do responsável pelo estoque")
    /**
     * Nome do responsável pelo estoque
     **/
    private String nome = null;

    /**
     * Número de identificação do responsável pelo estoque
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

    public ResponsavelEstoqueDTO identificacao(String identificacao) {
        this.identificacao = identificacao;
        return this;
    }

    /**
     * Nome do responsável pelo estoque
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

    public ResponsavelEstoqueDTO nome(String nome) {
        this.nome = nome;
        return this;
    }


    @Override
    public String toString() {

        String sb = "class ResponsavelEstoqueDTO {\n" +
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

