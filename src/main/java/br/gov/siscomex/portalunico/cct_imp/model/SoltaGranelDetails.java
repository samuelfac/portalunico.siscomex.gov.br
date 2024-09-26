package br.gov.siscomex.portalunico.cct_imp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SoltaGranelDetails", propOrder =
        {"descricao", "quantidade", "situacao", "unidadeMedida"
        })

@XmlRootElement(name = "SoltaGranelDetails")
/**
 * Lista de cargas, solta ou granel
 **/
@ApiModel(description = "Lista de cargas, solta ou granel")
public class SoltaGranelDetails {

    @XmlElement(name = "descricao")
    @ApiModelProperty(example = "Caixa", value = "Descrição do Tipo da Carga")
    /**
     * Descrição do Tipo da Carga
     **/
    private String descricao = null;

    @XmlElement(name = "quantidade")
    @ApiModelProperty(example = "150", value = "Quantidade total de volumes estocada")
    @Valid
    /**
     * Quantidade total de volumes estocada
     **/
    private BigDecimal quantidade = null;

    @XmlElement(name = "situacao")
    @ApiModelProperty(example = "Disponível", value = "Descrição da situação")
    /**
     * Descrição da situação
     **/
    private String situacao = null;

    @XmlElement(name = "unidadeMedida")
    @ApiModelProperty(example = "m3", value = "Sigla da unidade de medida")
    /**
     * Sigla da unidade de medida
     **/
    private String unidadeMedida = null;

    /**
     * Descrição do Tipo da Carga
     *
     * @return descricao
     **/
    @JsonProperty("descricao")
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public SoltaGranelDetails descricao(String descricao) {
        this.descricao = descricao;
        return this;
    }

    /**
     * Quantidade total de volumes estocada
     *
     * @return quantidade
     **/
    @JsonProperty("quantidade")
    public BigDecimal getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(BigDecimal quantidade) {
        this.quantidade = quantidade;
    }

    public SoltaGranelDetails quantidade(BigDecimal quantidade) {
        this.quantidade = quantidade;
        return this;
    }

    /**
     * Descrição da situação
     *
     * @return situacao
     **/
    @JsonProperty("situacao")
    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public SoltaGranelDetails situacao(String situacao) {
        this.situacao = situacao;
        return this;
    }

    /**
     * Sigla da unidade de medida
     *
     * @return unidadeMedida
     **/
    @JsonProperty("unidadeMedida")
    public String getUnidadeMedida() {
        return unidadeMedida;
    }

    public void setUnidadeMedida(String unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }

    public SoltaGranelDetails unidadeMedida(String unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
        return this;
    }


    @Override
    public String toString() {

        String sb = "class SoltaGranelDetails {\n" +
                "    descricao: " + toIndentedString(descricao) + "\n" +
                "    quantidade: " + toIndentedString(quantidade) + "\n" +
                "    situacao: " + toIndentedString(situacao) + "\n" +
                "    unidadeMedida: " + toIndentedString(unidadeMedida) + "\n" +
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

