package br.gov.siscomex.portalunico.ccta.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Mercadoria", propOrder =
        {"sequencial", "ncm", "quantidade", "pesoKg", "descricao"
        })

@XmlRootElement(name = "Mercadoria")
public class Mercadoria {

    @XmlElement(name = "sequencial", required = true)
    @ApiModelProperty(required = true, value = "Número sequencial da mercadoria<br>Pelo menos uma mercadoria é obrigatória<br/> Tamanho Máximo: 4")
    @Valid
    /**
     * Número sequencial da mercadoria<br>Pelo menos uma mercadoria é obrigatória<br/> Tamanho Máximo: 4
     **/
    private BigDecimal sequencial = null;

    @XmlElement(name = "ncm")
    @ApiModelProperty(example = "01", value = "Código NCM da mercadoria<br/> Pode ser preenchido com 2, 4, 6 ou 8 dígitos")
    /**
     * Código NCM da mercadoria<br/> Pode ser preenchido com 2, 4, 6 ou 8 dígitos
     **/
    private String ncm = null;

    @XmlElement(name = "quantidade")
    @ApiModelProperty(value = "Quantidade<br/> Tamanho Máximo: 6")
    @Valid
    /**
     * Quantidade<br/> Tamanho Máximo: 6
     **/
    private BigDecimal quantidade = null;

    @XmlElement(name = "pesoKg")
    @ApiModelProperty(example = "105.478", value = "Peso da mercadoria em Kg<br/>Formato: Número Racional com 9 casas inteiras e 3 casas decimais")
    @Valid
    /**
     * Peso da mercadoria em Kg<br/>Formato: Número Racional com 9 casas inteiras e 3 casas decimais
     **/
    private BigDecimal pesoKg = null;

    @XmlElement(name = "descricao", required = true)
    @ApiModelProperty(required = true, value = "Descrição da mercadoria<br/> Tamanho Máximo: 500")
    /**
     * Descrição da mercadoria<br/> Tamanho Máximo: 500
     **/
    private String descricao = null;

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
     * Número sequencial da mercadoria&lt;br&gt;Pelo menos uma mercadoria é obrigatória&lt;br/&gt; Tamanho Máximo: 4
     *
     * @return sequencial
     **/
    @JsonProperty("sequencial")
    @NotNull
    public BigDecimal getSequencial() {
        return sequencial;
    }

    public void setSequencial(BigDecimal sequencial) {
        this.sequencial = sequencial;
    }

    public Mercadoria sequencial(BigDecimal sequencial) {
        this.sequencial = sequencial;
        return this;
    }

    /**
     * Código NCM da mercadoria&lt;br/&gt; Pode ser preenchido com 2, 4, 6 ou 8 dígitos
     *
     * @return ncm
     **/
    @JsonProperty("ncm")
    public String getNcm() {
        return ncm;
    }

    public void setNcm(String ncm) {
        this.ncm = ncm;
    }

    public Mercadoria ncm(String ncm) {
        this.ncm = ncm;
        return this;
    }

    /**
     * Quantidade&lt;br/&gt; Tamanho Máximo: 6
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

    public Mercadoria quantidade(BigDecimal quantidade) {
        this.quantidade = quantidade;
        return this;
    }

    /**
     * Peso da mercadoria em Kg&lt;br/&gt;Formato: Número Racional com 9 casas inteiras e 3 casas decimais
     *
     * @return pesoKg
     **/
    @JsonProperty("pesoKg")
    public BigDecimal getPesoKg() {
        return pesoKg;
    }

    public void setPesoKg(BigDecimal pesoKg) {
        this.pesoKg = pesoKg;
    }

    public Mercadoria pesoKg(BigDecimal pesoKg) {
        this.pesoKg = pesoKg;
        return this;
    }

    /**
     * Descrição da mercadoria&lt;br/&gt; Tamanho Máximo: 500
     *
     * @return descricao
     **/
    @JsonProperty("descricao")
    @NotNull
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Mercadoria descricao(String descricao) {
        this.descricao = descricao;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class Mercadoria {\n" +
                "    sequencial: " + toIndentedString(sequencial) + "\n" +
                "    ncm: " + toIndentedString(ncm) + "\n" +
                "    quantidade: " + toIndentedString(quantidade) + "\n" +
                "    pesoKg: " + toIndentedString(pesoKg) + "\n" +
                "    descricao: " + toIndentedString(descricao) + "\n" +
                "}";
        return sb;
    }
}
