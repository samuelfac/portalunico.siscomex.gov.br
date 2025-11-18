package br.gov.siscomex.portalunico.dimp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DuimpBalancaComercialCover", propOrder =
        {"identificacao", "situacao", "resultadoAnaliseRisco", "carga", "tributos", "quantidadeItens"
        })

@XmlRootElement(name = "DuimpBalancaComercialCover")
public class DuimpBalancaComercialCover {

    @XmlElement(name = "identificacao")
    @ApiModelProperty(value = "")
    @Valid
    private IdentificacaoDuimpConsultaCover identificacao = null;

    @XmlElement(name = "situacao")
    @ApiModelProperty(value = "")
    @Valid
    private SituacaoDuimpConsultaCover situacao = null;

    @XmlElement(name = "resultadoAnaliseRisco")
    @ApiModelProperty(value = "")
    @Valid
    private ResultadoAnaliseRiscoDuimpCover resultadoAnaliseRisco = null;

    @XmlElement(name = "carga")
    @ApiModelProperty(value = "")
    @Valid
    private CargaDuimpConsultaCover carga = null;

    @XmlElement(name = "tributos")
    @ApiModelProperty(value = "")
    @Valid
    private TributoConsultaDuimpCover tributos = null;

    @XmlElement(name = "quantidadeItens")
    @ApiModelProperty(example = "100", value = "Quantidade total de Itens da Duimp.<br>Tamanho mínimo: 1<br>Tamanho máximo: 5")
    /**
     * Quantidade total de Itens da Duimp.<br>Tamanho mínimo: 1<br>Tamanho máximo: 5
     **/
    private Long quantidadeItens = null;

    /**
     * Get identificacao
     *
     * @return identificacao
     **/
    @JsonProperty("identificacao")
    public IdentificacaoDuimpConsultaCover getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(IdentificacaoDuimpConsultaCover identificacao) {
        this.identificacao = identificacao;
    }

    public DuimpBalancaComercialCover identificacao(IdentificacaoDuimpConsultaCover identificacao) {
        this.identificacao = identificacao;
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

    /**
     * Get situacao
     *
     * @return situacao
     **/
    @JsonProperty("situacao")
    public SituacaoDuimpConsultaCover getSituacao() {
        return situacao;
    }

    public void setSituacao(SituacaoDuimpConsultaCover situacao) {
        this.situacao = situacao;
    }

    /**
     * Get resultadoAnaliseRisco
     *
     * @return resultadoAnaliseRisco
     **/
    @JsonProperty("resultadoAnaliseRisco")
    public ResultadoAnaliseRiscoDuimpCover getResultadoAnaliseRisco() {
        return resultadoAnaliseRisco;
    }

    public void setResultadoAnaliseRisco(ResultadoAnaliseRiscoDuimpCover resultadoAnaliseRisco) {
        this.resultadoAnaliseRisco = resultadoAnaliseRisco;
    }

    public DuimpBalancaComercialCover resultadoAnaliseRisco(ResultadoAnaliseRiscoDuimpCover resultadoAnaliseRisco) {
        this.resultadoAnaliseRisco = resultadoAnaliseRisco;
        return this;
    }

    public DuimpBalancaComercialCover situacao(SituacaoDuimpConsultaCover situacao) {
        this.situacao = situacao;
        return this;
    }

    /**
     * Get carga
     *
     * @return carga
     **/
    @JsonProperty("carga")
    public CargaDuimpConsultaCover getCarga() {
        return carga;
    }

    public void setCarga(CargaDuimpConsultaCover carga) {
        this.carga = carga;
    }

    /**
     * Get tributos
     *
     * @return tributos
     **/
    @JsonProperty("tributos")
    public TributoConsultaDuimpCover getTributos() {
        return tributos;
    }

    public void setTributos(TributoConsultaDuimpCover tributos) {
        this.tributos = tributos;
    }

    public DuimpBalancaComercialCover tributos(TributoConsultaDuimpCover tributos) {
        this.tributos = tributos;
        return this;
    }

    public DuimpBalancaComercialCover carga(CargaDuimpConsultaCover carga) {
        this.carga = carga;
        return this;
    }

    /**
     * Quantidade total de Itens da Duimp.&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 5
     *
     * @return quantidadeItens
     **/
    @JsonProperty("quantidadeItens")
    public Long getQuantidadeItens() {
        return quantidadeItens;
    }

    public void setQuantidadeItens(Long quantidadeItens) {
        this.quantidadeItens = quantidadeItens;
    }

    public DuimpBalancaComercialCover quantidadeItens(Long quantidadeItens) {
        this.quantidadeItens = quantidadeItens;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class DuimpBalancaComercialCover {\n" +
                "    identificacao: " + toIndentedString(identificacao) + "\n" +
                "    situacao: " + toIndentedString(situacao) + "\n" +
                "    resultadoAnaliseRisco: " + toIndentedString(resultadoAnaliseRisco) + "\n" +
                "    carga: " + toIndentedString(carga) + "\n" +
                "    tributos: " + toIndentedString(tributos) + "\n" +
                "    quantidadeItens: " + toIndentedString(quantidadeItens) + "\n" +
                "}";
        return sb;
    }
}
