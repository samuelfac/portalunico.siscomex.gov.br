package br.gov.siscomex.portalunico.talp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SimularTaResultadoExternalDTO", propOrder =
        {"tipoTratamento", "orgaoAnuente", "mensagem", "modelo", "validoMultiplasOperacoes", "permiteRetificacao", "impedeDesembaraco", "permiteInspecao", "lpcoPrevioEmbarque"
        })

@XmlRootElement(name = "SimularTaResultadoExternalDTO")
public class SimularTaResultadoExternalDTO {

    @XmlElement(name = "tipoTratamento")
    @ApiModelProperty(value = "")
    private String tipoTratamento = null;

    @XmlElement(name = "orgaoAnuente")
    @ApiModelProperty(value = "")
    private String orgaoAnuente = null;

    @XmlElement(name = "mensagem")
    @ApiModelProperty(value = "")
    private String mensagem = null;

    @XmlElement(name = "modelo")
    @ApiModelProperty(value = "")
    @Valid
    private ModeloLpcoItemProcessaTaDTO modelo = null;

    @XmlElement(name = "validoMultiplasOperacoes")
    @ApiModelProperty(value = "")
    private Boolean validoMultiplasOperacoes = null;

    @XmlElement(name = "permiteRetificacao")
    @ApiModelProperty(value = "")
    private String permiteRetificacao = null;

    @XmlElement(name = "impedeDesembaraco")
    @ApiModelProperty(value = "")
    private Boolean impedeDesembaraco = null;

    @XmlElement(name = "permiteInspecao")
    @ApiModelProperty(value = "")
    private Boolean permiteInspecao = null;

    @XmlElement(name = "lpcoPrevioEmbarque")
    @ApiModelProperty(value = "")
    private Boolean lpcoPrevioEmbarque = null;

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
     * Get tipoTratamento
     *
     * @return tipoTratamento
     **/
    @JsonProperty("tipoTratamento")
    public String getTipoTratamento() {
        return tipoTratamento;
    }

    public void setTipoTratamento(String tipoTratamento) {
        this.tipoTratamento = tipoTratamento;
    }

    /**
     * Get orgaoAnuente
     *
     * @return orgaoAnuente
     **/
    @JsonProperty("orgaoAnuente")
    public String getOrgaoAnuente() {
        return orgaoAnuente;
    }

    public void setOrgaoAnuente(String orgaoAnuente) {
        this.orgaoAnuente = orgaoAnuente;
    }

    public SimularTaResultadoExternalDTO orgaoAnuente(String orgaoAnuente) {
        this.orgaoAnuente = orgaoAnuente;
        return this;
    }

    /**
     * Get mensagem
     *
     * @return mensagem
     **/
    @JsonProperty("mensagem")
    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public SimularTaResultadoExternalDTO mensagem(String mensagem) {
        this.mensagem = mensagem;
        return this;
    }

    public SimularTaResultadoExternalDTO tipoTratamento(String tipoTratamento) {
        this.tipoTratamento = tipoTratamento;
        return this;
    }

    /**
     * Get modelo
     *
     * @return modelo
     **/
    @JsonProperty("modelo")
    public ModeloLpcoItemProcessaTaDTO getModelo() {
        return modelo;
    }

    public void setModelo(ModeloLpcoItemProcessaTaDTO modelo) {
        this.modelo = modelo;
    }

    /**
     * Get validoMultiplasOperacoes
     *
     * @return validoMultiplasOperacoes
     **/
    @JsonProperty("validoMultiplasOperacoes")
    public Boolean isisValidoMultiplasOperacoes() {
        return validoMultiplasOperacoes;
    }

    public void setValidoMultiplasOperacoes(Boolean validoMultiplasOperacoes) {
        this.validoMultiplasOperacoes = validoMultiplasOperacoes;
    }

    public SimularTaResultadoExternalDTO validoMultiplasOperacoes(Boolean validoMultiplasOperacoes) {
        this.validoMultiplasOperacoes = validoMultiplasOperacoes;
        return this;
    }

    public SimularTaResultadoExternalDTO modelo(ModeloLpcoItemProcessaTaDTO modelo) {
        this.modelo = modelo;
        return this;
    }

    /**
     * Get permiteRetificacao
     *
     * @return permiteRetificacao
     **/
    @JsonProperty("permiteRetificacao")
    public String getPermiteRetificacao() {
        return permiteRetificacao;
    }

    public void setPermiteRetificacao(String permiteRetificacao) {
        this.permiteRetificacao = permiteRetificacao;
    }

    /**
     * Get impedeDesembaraco
     *
     * @return impedeDesembaraco
     **/
    @JsonProperty("impedeDesembaraco")
    public Boolean isisImpedeDesembaraco() {
        return impedeDesembaraco;
    }

    public void setImpedeDesembaraco(Boolean impedeDesembaraco) {
        this.impedeDesembaraco = impedeDesembaraco;
    }

    public SimularTaResultadoExternalDTO impedeDesembaraco(Boolean impedeDesembaraco) {
        this.impedeDesembaraco = impedeDesembaraco;
        return this;
    }

    public SimularTaResultadoExternalDTO permiteRetificacao(String permiteRetificacao) {
        this.permiteRetificacao = permiteRetificacao;
        return this;
    }

    /**
     * Get permiteInspecao
     *
     * @return permiteInspecao
     **/
    @JsonProperty("permiteInspecao")
    public Boolean isisPermiteInspecao() {
        return permiteInspecao;
    }

    public void setPermiteInspecao(Boolean permiteInspecao) {
        this.permiteInspecao = permiteInspecao;
    }

    public SimularTaResultadoExternalDTO permiteInspecao(Boolean permiteInspecao) {
        this.permiteInspecao = permiteInspecao;
        return this;
    }

    /**
     * Get lpcoPrevioEmbarque
     *
     * @return lpcoPrevioEmbarque
     **/
    @JsonProperty("lpcoPrevioEmbarque")
    public Boolean isisLpcoPrevioEmbarque() {
        return lpcoPrevioEmbarque;
    }

    public void setLpcoPrevioEmbarque(Boolean lpcoPrevioEmbarque) {
        this.lpcoPrevioEmbarque = lpcoPrevioEmbarque;
    }

    public SimularTaResultadoExternalDTO lpcoPrevioEmbarque(Boolean lpcoPrevioEmbarque) {
        this.lpcoPrevioEmbarque = lpcoPrevioEmbarque;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class SimularTaResultadoExternalDTO {\n" +
                "    tipoTratamento: " + toIndentedString(tipoTratamento) + "\n" +
                "    orgaoAnuente: " + toIndentedString(orgaoAnuente) + "\n" +
                "    mensagem: " + toIndentedString(mensagem) + "\n" +
                "    modelo: " + toIndentedString(modelo) + "\n" +
                "    validoMultiplasOperacoes: " + toIndentedString(validoMultiplasOperacoes) + "\n" +
                "    permiteRetificacao: " + toIndentedString(permiteRetificacao) + "\n" +
                "    impedeDesembaraco: " + toIndentedString(impedeDesembaraco) + "\n" +
                "    permiteInspecao: " + toIndentedString(permiteInspecao) + "\n" +
                "    lpcoPrevioEmbarque: " + toIndentedString(lpcoPrevioEmbarque) + "\n" +
                "}";
        return sb;
    }
}
