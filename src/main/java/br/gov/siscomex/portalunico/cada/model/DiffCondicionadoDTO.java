package br.gov.siscomex.portalunico.cada.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiffCondicionadoDTO", propOrder =
        {"obrigatorio", "multivalorado", "condicao", "atributo", "dataFimVigencia", "dataInicioVigencia"
        })

@XmlRootElement(name = "DiffCondicionadoDTO")
public class DiffCondicionadoDTO {

    @XmlElement(name = "obrigatorio")
    @ApiModelProperty(value = "")
    @Valid
    private DiffValorDTO obrigatorio = null;

    @XmlElement(name = "multivalorado")
    @ApiModelProperty(value = "")
    @Valid
    private DiffValorDTO multivalorado = null;

    @XmlElement(name = "condicao")
    @ApiModelProperty(value = "")
    @Valid
    private DiffValorDTO condicao = null;

    @XmlElement(name = "atributo", required = true)
    @ApiModelProperty(required = true, value = "")
    @Valid
    private DiffArquivoDiarioAtributoDTO atributo = null;

    @XmlElement(name = "dataFimVigencia")
    @ApiModelProperty(value = "")
    @Valid
    private DiffValorDTO dataFimVigencia = null;

    @XmlElement(name = "dataInicioVigencia")
    @ApiModelProperty(value = "")
    @Valid
    private DiffValorDTO dataInicioVigencia = null;

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
     * Get obrigatorio
     *
     * @return obrigatorio
     **/
    @JsonProperty("obrigatorio")
    public DiffValorDTO getObrigatorio() {
        return obrigatorio;
    }

    public void setObrigatorio(DiffValorDTO obrigatorio) {
        this.obrigatorio = obrigatorio;
    }

    public DiffCondicionadoDTO obrigatorio(DiffValorDTO obrigatorio) {
        this.obrigatorio = obrigatorio;
        return this;
    }

    /**
     * Get multivalorado
     *
     * @return multivalorado
     **/
    @JsonProperty("multivalorado")
    public DiffValorDTO getMultivalorado() {
        return multivalorado;
    }

    public void setMultivalorado(DiffValorDTO multivalorado) {
        this.multivalorado = multivalorado;
    }

    public DiffCondicionadoDTO multivalorado(DiffValorDTO multivalorado) {
        this.multivalorado = multivalorado;
        return this;
    }

    /**
     * Get condicao
     *
     * @return condicao
     **/
    @JsonProperty("condicao")
    public DiffValorDTO getCondicao() {
        return condicao;
    }

    public void setCondicao(DiffValorDTO condicao) {
        this.condicao = condicao;
    }

    public DiffCondicionadoDTO condicao(DiffValorDTO condicao) {
        this.condicao = condicao;
        return this;
    }

    /**
     * Get atributo
     *
     * @return atributo
     **/
    @JsonProperty("atributo")
    @NotNull
    public DiffArquivoDiarioAtributoDTO getAtributo() {
        return atributo;
    }

    public void setAtributo(DiffArquivoDiarioAtributoDTO atributo) {
        this.atributo = atributo;
    }

    public DiffCondicionadoDTO atributo(DiffArquivoDiarioAtributoDTO atributo) {
        this.atributo = atributo;
        return this;
    }

    /**
     * Get dataFimVigencia
     *
     * @return dataFimVigencia
     **/
    @JsonProperty("dataFimVigencia")
    public DiffValorDTO getDataFimVigencia() {
        return dataFimVigencia;
    }

    public void setDataFimVigencia(DiffValorDTO dataFimVigencia) {
        this.dataFimVigencia = dataFimVigencia;
    }

    public DiffCondicionadoDTO dataFimVigencia(DiffValorDTO dataFimVigencia) {
        this.dataFimVigencia = dataFimVigencia;
        return this;
    }

    /**
     * Get dataInicioVigencia
     *
     * @return dataInicioVigencia
     **/
    @JsonProperty("dataInicioVigencia")
    public DiffValorDTO getDataInicioVigencia() {
        return dataInicioVigencia;
    }

    public void setDataInicioVigencia(DiffValorDTO dataInicioVigencia) {
        this.dataInicioVigencia = dataInicioVigencia;
    }

    public DiffCondicionadoDTO dataInicioVigencia(DiffValorDTO dataInicioVigencia) {
        this.dataInicioVigencia = dataInicioVigencia;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class DiffCondicionadoDTO {\n" +
                "    obrigatorio: " + toIndentedString(obrigatorio) + "\n" +
                "    multivalorado: " + toIndentedString(multivalorado) + "\n" +
                "    condicao: " + toIndentedString(condicao) + "\n" +
                "    atributo: " + toIndentedString(atributo) + "\n" +
                "    dataFimVigencia: " + toIndentedString(dataFimVigencia) + "\n" +
                "    dataInicioVigencia: " + toIndentedString(dataInicioVigencia) + "\n" +
                "}";
        return sb;
    }
}
