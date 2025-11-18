package br.gov.siscomex.portalunico.ccta.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponsavelRFBRepresentation", propOrder =
        {"codigoLotacao", "codigoSetor", "cpf", "nome", "nomeLotacao", "nomeSetor"
        })

@XmlRootElement(name = "ResponsavelRFBRepresentation")
public class ResponsavelRFBRepresentation {

    @XmlElement(name = "codigoLotacao")
    @ApiModelProperty(example = "717700", value = "Número do código da lotação")
    /**
     * Número do código da lotação
     **/
    private Integer codigoLotacao = null;

    @XmlElement(name = "codigoSetor")
    @ApiModelProperty(example = "717600", value = "Descrição do código do setor da lotação")
    /**
     * Descrição do código do setor da lotação
     **/
    private Integer codigoSetor = null;

    @XmlElement(name = "cpf")
    @ApiModelProperty(value = "")
    private String cpf = null;

    @XmlElement(name = "nome")
    @ApiModelProperty(value = "")
    private String nome = null;

    @XmlElement(name = "nomeLotacao")
    @ApiModelProperty(example = "AEROPORTO INTERNACIONAL DO RIO DE JANEIRO", value = "Descrição do nome da lotação")
    /**
     * Descrição do nome da lotação
     **/
    private String nomeLotacao = null;

    @XmlElement(name = "nomeSetor")
    @ApiModelProperty(example = "PORTO DO RIO", value = "Número do código do setor da lotação")
    /**
     * Número do código do setor da lotação
     **/
    private String nomeSetor = null;

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
     * Número do código da lotação
     *
     * @return codigoLotacao
     **/
    @JsonProperty("codigoLotacao")
    public Integer getCodigoLotacao() {
        return codigoLotacao;
    }

    public void setCodigoLotacao(Integer codigoLotacao) {
        this.codigoLotacao = codigoLotacao;
    }

    /**
     * Descrição do código do setor da lotação
     *
     * @return codigoSetor
     **/
    @JsonProperty("codigoSetor")
    public Integer getCodigoSetor() {
        return codigoSetor;
    }

    public void setCodigoSetor(Integer codigoSetor) {
        this.codigoSetor = codigoSetor;
    }

    public ResponsavelRFBRepresentation codigoSetor(Integer codigoSetor) {
        this.codigoSetor = codigoSetor;
        return this;
    }

    /**
     * Get cpf
     *
     * @return cpf
     **/
    @JsonProperty("cpf")
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public ResponsavelRFBRepresentation cpf(String cpf) {
        this.cpf = cpf;
        return this;
    }

    /**
     * Get nome
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

    public ResponsavelRFBRepresentation nome(String nome) {
        this.nome = nome;
        return this;
    }

    public ResponsavelRFBRepresentation codigoLotacao(Integer codigoLotacao) {
        this.codigoLotacao = codigoLotacao;
        return this;
    }

    /**
     * Descrição do nome da lotação
     *
     * @return nomeLotacao
     **/
    @JsonProperty("nomeLotacao")
    public String getNomeLotacao() {
        return nomeLotacao;
    }

    public void setNomeLotacao(String nomeLotacao) {
        this.nomeLotacao = nomeLotacao;
    }

    public ResponsavelRFBRepresentation nomeLotacao(String nomeLotacao) {
        this.nomeLotacao = nomeLotacao;
        return this;
    }

    /**
     * Número do código do setor da lotação
     *
     * @return nomeSetor
     **/
    @JsonProperty("nomeSetor")
    public String getNomeSetor() {
        return nomeSetor;
    }

    public void setNomeSetor(String nomeSetor) {
        this.nomeSetor = nomeSetor;
    }

    public ResponsavelRFBRepresentation nomeSetor(String nomeSetor) {
        this.nomeSetor = nomeSetor;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class ResponsavelRFBRepresentation {\n" +
                "    codigoLotacao: " + toIndentedString(codigoLotacao) + "\n" +
                "    codigoSetor: " + toIndentedString(codigoSetor) + "\n" +
                "    cpf: " + toIndentedString(cpf) + "\n" +
                "    nome: " + toIndentedString(nome) + "\n" +
                "    nomeLotacao: " + toIndentedString(nomeLotacao) + "\n" +
                "    nomeSetor: " + toIndentedString(nomeSetor) + "\n" +
                "}";
        return sb;
    }
}
