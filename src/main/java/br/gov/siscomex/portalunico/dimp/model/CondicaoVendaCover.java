package br.gov.siscomex.portalunico.dimp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CondicaoVendaCover", propOrder =
        {"metodoValoracao", "incoterm", "frete", "seguro", "acrescimosDeducoes"
        })

@XmlRootElement(name = "CondicaoVendaCover")
/**
 * Condição de venda da mercadoria.
 **/
@ApiModel(description = "Condição de venda da mercadoria.")
public class CondicaoVendaCover {

    @XmlElement(name = "metodoValoracao", required = true)
    @ApiModelProperty(required = true, value = "")
    @Valid
    private MetodoValoracaoCover metodoValoracao = null;

    @XmlElement(name = "incoterm", required = true)
    @ApiModelProperty(required = true, value = "")
    @Valid
    private IncotermCover incoterm = null;

    @XmlElement(name = "frete")
    @ApiModelProperty(value = "")
    @Valid
    private ItemFreteCover frete = null;

    @XmlElement(name = "seguro")
    @ApiModelProperty(value = "")
    @Valid
    private ItemSeguroCover seguro = null;

    @XmlElement(name = "acrescimosDeducoes")
    @ApiModelProperty(value = "")
    @Valid
    private List<AcrescimoDeducaoCover> acrescimosDeducoes = null;

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
     * Get metodoValoracao
     *
     * @return metodoValoracao
     **/
    @JsonProperty("metodoValoracao")
    @NotNull
    public MetodoValoracaoCover getMetodoValoracao() {
        return metodoValoracao;
    }

    public void setMetodoValoracao(MetodoValoracaoCover metodoValoracao) {
        this.metodoValoracao = metodoValoracao;
    }

    /**
     * Get incoterm
     *
     * @return incoterm
     **/
    @JsonProperty("incoterm")
    @NotNull
    public IncotermCover getIncoterm() {
        return incoterm;
    }

    public void setIncoterm(IncotermCover incoterm) {
        this.incoterm = incoterm;
    }

    public CondicaoVendaCover incoterm(IncotermCover incoterm) {
        this.incoterm = incoterm;
        return this;
    }

    /**
     * Get frete
     *
     * @return frete
     **/
    @JsonProperty("frete")
    public ItemFreteCover getFrete() {
        return frete;
    }

    public void setFrete(ItemFreteCover frete) {
        this.frete = frete;
    }

    public CondicaoVendaCover frete(ItemFreteCover frete) {
        this.frete = frete;
        return this;
    }

    public CondicaoVendaCover metodoValoracao(MetodoValoracaoCover metodoValoracao) {
        this.metodoValoracao = metodoValoracao;
        return this;
    }

    /**
     * Get seguro
     *
     * @return seguro
     **/
    @JsonProperty("seguro")
    public ItemSeguroCover getSeguro() {
        return seguro;
    }

    public void setSeguro(ItemSeguroCover seguro) {
        this.seguro = seguro;
    }

    /**
     * Get acrescimosDeducoes
     *
     * @return acrescimosDeducoes
     **/
    @JsonProperty("acrescimosDeducoes")
    public List<AcrescimoDeducaoCover> getAcrescimosDeducoes() {
        return acrescimosDeducoes;
    }

    public void setAcrescimosDeducoes(List<AcrescimoDeducaoCover> acrescimosDeducoes) {
        this.acrescimosDeducoes = acrescimosDeducoes;
    }

    public CondicaoVendaCover acrescimosDeducoes(List<AcrescimoDeducaoCover> acrescimosDeducoes) {
        this.acrescimosDeducoes = acrescimosDeducoes;
        return this;
    }

    public CondicaoVendaCover addAcrescimosDeducoesItem(AcrescimoDeducaoCover acrescimosDeducoesItem) {
        this.acrescimosDeducoes.add(acrescimosDeducoesItem);
        return this;
    }

    public CondicaoVendaCover seguro(ItemSeguroCover seguro) {
        this.seguro = seguro;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class CondicaoVendaCover {\n" +
                "    metodoValoracao: " + toIndentedString(metodoValoracao) + "\n" +
                "    incoterm: " + toIndentedString(incoterm) + "\n" +
                "    frete: " + toIndentedString(frete) + "\n" +
                "    seguro: " + toIndentedString(seguro) + "\n" +
                "    acrescimosDeducoes: " + toIndentedString(acrescimosDeducoes) + "\n" +
                "}";
        return sb;
    }
}
