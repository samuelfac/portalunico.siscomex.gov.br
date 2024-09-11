package br.gov.siscomex.portalunico.duimp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SefazCondicaoVendaMercadoriaCover", propOrder =
        {"metodoValoracao", "incoterm", "acrescimosDeducoes"
        })

@XmlRootElement(name = "SefazCondicaoVendaMercadoriaCover")
/**
 * Condição de venda da mercadoria
 **/
@ApiModel(description = "Condição de venda da mercadoria")
public class SefazCondicaoVendaMercadoriaCover {

    @XmlElement(name = "metodoValoracao")
    @ApiModelProperty(example = "1", value = "Código do método de valoração.<br>Dominio: Tabela de Métodos de Valoração Siscomex<br>Valor mínimo: 1<br>Valor máximo: 99999")
    /**
     * Código do método de valoração.<br>Dominio: Tabela de Métodos de Valoração Siscomex<br>Valor mínimo: 1<br>Valor máximo: 99999
     **/
    private Integer metodoValoracao = null;

    @XmlElement(name = "incoterm")
    @ApiModelProperty(example = "FOB", value = "Condição de Venda (Código INCOTERM).<br>Dominio: Tabela de Códigos de Condição de Venda do Siscomex<br>Tamanho: 3")
    /**
     * Condição de Venda (Código INCOTERM).<br>Dominio: Tabela de Códigos de Condição de Venda do Siscomex<br>Tamanho: 3
     **/
    private String incoterm = null;

    @XmlElement(name = "acrescimosDeducoes")
    @ApiModelProperty(value = "Lista de acréscimos e deduções")
    @Valid
    /**
     * Lista de acréscimos e deduções
     **/
    private List<SefazAcrescimoDeducaoCover> acrescimosDeducoes = null;

    /**
     * Código do método de valoração.&lt;br&gt;Dominio: Tabela de Métodos de Valoração Siscomex&lt;br&gt;Valor mínimo: 1&lt;br&gt;Valor máximo: 99999
     *
     * @return metodoValoracao
     **/
    @JsonProperty("metodoValoracao")
    public Integer getMetodoValoracao() {
        return metodoValoracao;
    }

    public void setMetodoValoracao(Integer metodoValoracao) {
        this.metodoValoracao = metodoValoracao;
    }

    public SefazCondicaoVendaMercadoriaCover metodoValoracao(Integer metodoValoracao) {
        this.metodoValoracao = metodoValoracao;
        return this;
    }

    /**
     * Condição de Venda (Código INCOTERM).&lt;br&gt;Dominio: Tabela de Códigos de Condição de Venda do Siscomex&lt;br&gt;Tamanho: 3
     *
     * @return incoterm
     **/
    @JsonProperty("incoterm")
    public String getIncoterm() {
        return incoterm;
    }

    public void setIncoterm(String incoterm) {
        this.incoterm = incoterm;
    }

    public SefazCondicaoVendaMercadoriaCover incoterm(String incoterm) {
        this.incoterm = incoterm;
        return this;
    }

    /**
     * Lista de acréscimos e deduções
     *
     * @return acrescimosDeducoes
     **/
    @JsonProperty("acrescimosDeducoes")
    public List<SefazAcrescimoDeducaoCover> getAcrescimosDeducoes() {
        return acrescimosDeducoes;
    }

    public void setAcrescimosDeducoes(List<SefazAcrescimoDeducaoCover> acrescimosDeducoes) {
        this.acrescimosDeducoes = acrescimosDeducoes;
    }

    public SefazCondicaoVendaMercadoriaCover acrescimosDeducoes(List<SefazAcrescimoDeducaoCover> acrescimosDeducoes) {
        this.acrescimosDeducoes = acrescimosDeducoes;
        return this;
    }

    public SefazCondicaoVendaMercadoriaCover addAcrescimosDeducoesItem(SefazAcrescimoDeducaoCover acrescimosDeducoesItem) {
        this.acrescimosDeducoes.add(acrescimosDeducoesItem);
        return this;
    }


    @Override
    public String toString() {

        String sb = "class SefazCondicaoVendaMercadoriaCover {\n" +
                "    metodoValoracao: " + toIndentedString(metodoValoracao) + "\n" +
                "    incoterm: " + toIndentedString(incoterm) + "\n" +
                "    acrescimosDeducoes: " + toIndentedString(acrescimosDeducoes) + "\n" +
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

