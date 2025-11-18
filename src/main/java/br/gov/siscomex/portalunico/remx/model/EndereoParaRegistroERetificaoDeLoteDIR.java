package br.gov.siscomex.portalunico.remx.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EndereoParaRegistroERetificaoDeLoteDIR", propOrder =
        {"cep", "complemento", "estado", "logradouro", "municipio", "pais"
        })

@XmlRootElement(name = "EndereoParaRegistroERetificaoDeLoteDIR")
public class EndereoParaRegistroERetificaoDeLoteDIR {

    @XmlElement(name = "cep")
    @ApiModelProperty(value = "Código de endereçamento postal (CEP) do endereço.<br/>15 caracteres, sendo possível qualquer caracter alfanumérico já que podemos ter casos de CEP internacional formatado.<br/>Para CEPs nacionais, até 8 caracteres, sendo possível apenas hífen e pontos como caracteres especiais.")
    /**
     * Código de endereçamento postal (CEP) do endereço.<br/>15 caracteres, sendo possível qualquer caracter alfanumérico já que podemos ter casos de CEP internacional formatado.<br/>Para CEPs nacionais, até 8 caracteres, sendo possível apenas hífen e pontos como caracteres especiais.
     **/
    private String cep = null;

    @XmlElement(name = "complemento")
    @ApiModelProperty(value = "Coomplemento do endereço. 80 caracteres que podem ser letras, números, além de quaisquer caracteres referentes a codificação UTF-8.")
    /**
     * Coomplemento do endereço. 80 caracteres que podem ser letras, números, além de quaisquer caracteres referentes a codificação UTF-8.
     **/
    private String complemento = null;

    @XmlElement(name = "estado", required = true)
    @ApiModelProperty(required = true, value = "Sigla do estado. Valores de acordo com a tabela de domínio.<br/>Obs.: Para estados no exterior, a sigla é EX (conforme consta na tabela).")
    /**
     * Sigla do estado. Valores de acordo com a tabela de domínio.<br/>Obs.: Para estados no exterior, a sigla é EX (conforme consta na tabela).
     **/
    private String estado = null;

    @XmlElement(name = "logradouro", required = true)
    @ApiModelProperty(required = true, value = "Logradouro. 50 caracteres que podem ser letras, números, além de quaisquer caracteres referentes a codificação UTF-8.")
    /**
     * Logradouro. 50 caracteres que podem ser letras, números, além de quaisquer caracteres referentes a codificação UTF-8.
     **/
    private String logradouro = null;

    @XmlElement(name = "municipio", required = true)
    @ApiModelProperty(required = true, value = "Código do município.<br/>Obs1.: Para municípios do exterior o código é 9707 (conforme consta na tabela).<br/>Obs2.: Quando estado é nacional, o município deverá pertencer ao estado informado.")
    /**
     * Código do município.<br/>Obs1.: Para municípios do exterior o código é 9707 (conforme consta na tabela).<br/>Obs2.: Quando estado é nacional, o município deverá pertencer ao estado informado.
     **/
    private Integer municipio = null;

    @XmlElement(name = "pais", required = true)
    @ApiModelProperty(required = true, value = "Código do país. Valores de acordo com a tabela de domínio.")
    /**
     * Código do país. Valores de acordo com a tabela de domínio.
     **/
    private Integer pais = null;

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
     * Código de endereçamento postal (CEP) do endereço.&lt;br/&gt;15 caracteres, sendo possível qualquer caracter alfanumérico já que podemos ter casos de CEP internacional formatado.&lt;br/&gt;Para CEPs nacionais, até 8 caracteres, sendo possível apenas hífen e pontos como caracteres especiais.
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

    /**
     * Coomplemento do endereço. 80 caracteres que podem ser letras, números, além de quaisquer caracteres referentes a codificação UTF-8.
     *
     * @return complemento
     **/
    @JsonProperty("complemento")
    @Size(min = 0, max = 80)
    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public EndereoParaRegistroERetificaoDeLoteDIR complemento(String complemento) {
        this.complemento = complemento;
        return this;
    }

    public EndereoParaRegistroERetificaoDeLoteDIR cep(String cep) {
        this.cep = cep;
        return this;
    }

    /**
     * Sigla do estado. Valores de acordo com a tabela de domínio.&lt;br/&gt;Obs.: Para estados no exterior, a sigla é EX (conforme consta na tabela).
     *
     * @return estado
     **/
    @JsonProperty("estado")
    @NotNull
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * Logradouro. 50 caracteres que podem ser letras, números, além de quaisquer caracteres referentes a codificação UTF-8.
     *
     * @return logradouro
     **/
    @JsonProperty("logradouro")
    @NotNull
    @Size(min = 0, max = 50)
    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public EndereoParaRegistroERetificaoDeLoteDIR logradouro(String logradouro) {
        this.logradouro = logradouro;
        return this;
    }

    /**
     * Código do município.&lt;br/&gt;Obs1.: Para municípios do exterior o código é 9707 (conforme consta na tabela).&lt;br/&gt;Obs2.: Quando estado é nacional, o município deverá pertencer ao estado informado.
     *
     * @return municipio
     **/
    @JsonProperty("municipio")
    @NotNull
    public Integer getMunicipio() {
        return municipio;
    }

    public void setMunicipio(Integer municipio) {
        this.municipio = municipio;
    }

    public EndereoParaRegistroERetificaoDeLoteDIR municipio(Integer municipio) {
        this.municipio = municipio;
        return this;
    }

    /**
     * Código do país. Valores de acordo com a tabela de domínio.
     *
     * @return pais
     **/
    @JsonProperty("pais")
    @NotNull
    public Integer getPais() {
        return pais;
    }

    public void setPais(Integer pais) {
        this.pais = pais;
    }

    public EndereoParaRegistroERetificaoDeLoteDIR pais(Integer pais) {
        this.pais = pais;
        return this;
    }

    public EndereoParaRegistroERetificaoDeLoteDIR estado(String estado) {
        this.estado = estado;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class EndereoParaRegistroERetificaoDeLoteDIR {\n" +
                "    cep: " + toIndentedString(cep) + "\n" +
                "    complemento: " + toIndentedString(complemento) + "\n" +
                "    estado: " + toIndentedString(estado) + "\n" +
                "    logradouro: " + toIndentedString(logradouro) + "\n" +
                "    municipio: " + toIndentedString(municipio) + "\n" +
                "    pais: " + toIndentedString(pais) + "\n" +
                "}";
        return sb;
    }
}
