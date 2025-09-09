package br.gov.siscomex.portalunico.ccta.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Endereco", propOrder =
        {"cidade", "estado", "bairro", "logradouro", "cep", "pais"
        })

@XmlRootElement(name = "Endereco")
public class Endereco {

    @XmlElement(name = "cidade")
    @ApiModelProperty(value = "")
    @Valid
    private Cidade cidade = null;

    @XmlElement(name = "estado")
    @ApiModelProperty(value = "Estado do endereço")
    /**
     * Estado do endereço
     **/
    private String estado = null;

    @XmlElement(name = "bairro")
    @ApiModelProperty(value = "Bairro do endereço")
    /**
     * Bairro do endereço
     **/
    private String bairro = null;

    @XmlElement(name = "logradouro")
    @ApiModelProperty(value = "Logadouro do endereço")
    /**
     * Logadouro do endereço
     **/
    private String logradouro = null;

    @XmlElement(name = "cep")
    @ApiModelProperty(value = "CEP do endereço")
    /**
     * CEP do endereço
     **/
    private String cep = null;

    @XmlElement(name = "pais")
    @ApiModelProperty(value = "")
    @Valid
    private Pais pais = null;

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
     * Get cidade
     *
     * @return cidade
     **/
    @JsonProperty("cidade")
    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public Endereco cidade(Cidade cidade) {
        this.cidade = cidade;
        return this;
    }

    /**
     * Estado do endereço
     *
     * @return estado
     **/
    @JsonProperty("estado")
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Endereco estado(String estado) {
        this.estado = estado;
        return this;
    }

    /**
     * Bairro do endereço
     *
     * @return bairro
     **/
    @JsonProperty("bairro")
    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public Endereco bairro(String bairro) {
        this.bairro = bairro;
        return this;
    }

    /**
     * Logadouro do endereço
     *
     * @return logradouro
     **/
    @JsonProperty("logradouro")
    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public Endereco logradouro(String logradouro) {
        this.logradouro = logradouro;
        return this;
    }

    /**
     * CEP do endereço
     *
     * @return cep
     **/
    @JsonProperty("cep")
    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Endereco cep(String cep) {
        this.cep = cep;
        return this;
    }

    /**
     * Get pais
     *
     * @return pais
     **/
    @JsonProperty("pais")
    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public Endereco pais(Pais pais) {
        this.pais = pais;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class Endereco {\n" +
                "    cidade: " + toIndentedString(cidade) + "\n" +
                "    estado: " + toIndentedString(estado) + "\n" +
                "    bairro: " + toIndentedString(bairro) + "\n" +
                "    logradouro: " + toIndentedString(logradouro) + "\n" +
                "    cep: " + toIndentedString(cep) + "\n" +
                "    pais: " + toIndentedString(pais) + "\n" +
                "}";
        return sb;
    }
}
