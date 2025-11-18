package br.gov.siscomex.portalunico.ccta.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CargaRodoviariaMercadoria", propOrder =
        {"classificacaoNCM", "descricao", "pesoBruto", "quantidadeVolumes", "sequencial"
        })

@XmlRootElement(name = "CargaRodoviariaMercadoria")
public class CargaRodoviariaMercadoria {

    @XmlElement(name = "classificacaoNCM")
    @ApiModelProperty(value = "")
    @Valid
    private Ncm classificacaoNCM = null;

    @XmlElement(name = "descricao")
    @ApiModelProperty(value = "Descrição da mercadoria<br/> Tamanho Máximo: 500")
    /**
     * Descrição da mercadoria<br/> Tamanho Máximo: 500
     **/
    private String descricao = null;

    @XmlElement(name = "pesoBruto")
    @ApiModelProperty(example = "105.478", value = "Peso da mercadoria em Kg<br/>Formato: Número Racional com 9 casas inteiras e 3 casas decimais")
    @Valid
    /**
     * Peso da mercadoria em Kg<br/>Formato: Número Racional com 9 casas inteiras e 3 casas decimais
     **/
    private BigDecimal pesoBruto = null;

    @XmlElement(name = "quantidadeVolumes")
    @ApiModelProperty(example = "1.0", value = "Quantidade<br/> Tamanho Máximo: 6")
    @Valid
    /**
     * Quantidade<br/> Tamanho Máximo: 6
     **/
    private BigDecimal quantidadeVolumes = null;

    @XmlElement(name = "sequencial")
    @ApiModelProperty(example = "1.0", value = "Número sequencial da mercadoria<br>Pelo menos uma mercadoria é obrigatória<br/> Tamanho Máximo: 4")
    @Valid
    /**
     * Número sequencial da mercadoria<br>Pelo menos uma mercadoria é obrigatória<br/> Tamanho Máximo: 4
     **/
    private BigDecimal sequencial = null;

    /**
     * Get classificacaoNCM
     *
     * @return classificacaoNCM
     **/
    @JsonProperty("classificacaoNCM")
    public Ncm getClassificacaoNCM() {
        return classificacaoNCM;
    }

    public void setClassificacaoNCM(Ncm classificacaoNCM) {
        this.classificacaoNCM = classificacaoNCM;
    }

    public CargaRodoviariaMercadoria classificacaoNCM(Ncm classificacaoNCM) {
        this.classificacaoNCM = classificacaoNCM;
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
     * Descrição da mercadoria&lt;br/&gt; Tamanho Máximo: 500
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

    /**
     * Peso da mercadoria em Kg&lt;br/&gt;Formato: Número Racional com 9 casas inteiras e 3 casas decimais
     *
     * @return pesoBruto
     **/
    @JsonProperty("pesoBruto")
    public BigDecimal getPesoBruto() {
        return pesoBruto;
    }

    public void setPesoBruto(BigDecimal pesoBruto) {
        this.pesoBruto = pesoBruto;
    }

    public CargaRodoviariaMercadoria pesoBruto(BigDecimal pesoBruto) {
        this.pesoBruto = pesoBruto;
        return this;
    }

    public CargaRodoviariaMercadoria descricao(String descricao) {
        this.descricao = descricao;
        return this;
    }

    /**
     * Quantidade&lt;br/&gt; Tamanho Máximo: 6
     *
     * @return quantidadeVolumes
     **/
    @JsonProperty("quantidadeVolumes")
    public BigDecimal getQuantidadeVolumes() {
        return quantidadeVolumes;
    }

    public void setQuantidadeVolumes(BigDecimal quantidadeVolumes) {
        this.quantidadeVolumes = quantidadeVolumes;
    }

    public CargaRodoviariaMercadoria quantidadeVolumes(BigDecimal quantidadeVolumes) {
        this.quantidadeVolumes = quantidadeVolumes;
        return this;
    }

    /**
     * Número sequencial da mercadoria&lt;br&gt;Pelo menos uma mercadoria é obrigatória&lt;br/&gt; Tamanho Máximo: 4
     *
     * @return sequencial
     **/
    @JsonProperty("sequencial")
    public BigDecimal getSequencial() {
        return sequencial;
    }

    public void setSequencial(BigDecimal sequencial) {
        this.sequencial = sequencial;
    }

    public CargaRodoviariaMercadoria sequencial(BigDecimal sequencial) {
        this.sequencial = sequencial;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class CargaRodoviariaMercadoria {\n" +
                "    classificacaoNCM: " + toIndentedString(classificacaoNCM) + "\n" +
                "    descricao: " + toIndentedString(descricao) + "\n" +
                "    pesoBruto: " + toIndentedString(pesoBruto) + "\n" +
                "    quantidadeVolumes: " + toIndentedString(quantidadeVolumes) + "\n" +
                "    sequencial: " + toIndentedString(sequencial) + "\n" +
                "}";
        return sb;
    }
}
