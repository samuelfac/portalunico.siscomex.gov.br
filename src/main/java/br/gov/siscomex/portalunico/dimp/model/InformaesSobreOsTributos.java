package br.gov.siscomex.portalunico.dimp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InformaesSobreOsTributos", propOrder =
        {"quantidadeAdicoes", "indicadorCumprimentoICMS", "tributosCalculados", "taxaUtilizacao"
        })

@XmlRootElement(name = "InformaesSobreOsTributos")
public class InformaesSobreOsTributos {

    @XmlElement(name = "quantidadeAdicoes")
    @ApiModelProperty(example = "2", value = "Quantidade de adições (Equivalência da duimp com número de adições de uma DI)<br>Valor mínimo: 1<br>Valor máximo: 99999")
    /**
     * Quantidade de adições (Equivalência da duimp com número de adições de uma DI)<br>Valor mínimo: 1<br>Valor máximo: 99999
     **/
    private Integer quantidadeAdicoes = null;
    @XmlElement(name = "indicadorCumprimentoICMS")
    @ApiModelProperty(example = "1", value = "Indicador de cumprimento do ICMS.<br>Dominio:<br>1-ICMS Pago, <br>2-ICMS Cancelado<br>Tamanho: 1")
    /**
     * Indicador de cumprimento do ICMS.<br>Dominio:<br>1-ICMS Pago, <br>2-ICMS Cancelado<br>Tamanho: 1
     **/
    private IndicadorCumprimentoICMSEnum indicadorCumprimentoICMS = null;
    @XmlElement(name = "tributosCalculados")
    @ApiModelProperty(value = "Tributos calculados")
    @Valid
    /**
     * Tributos calculados
     **/
    private List<SefazTributoCalculadoCover> tributosCalculados = null;
    @XmlElement(name = "taxaUtilizacao")
    @ApiModelProperty(example = "214.5", value = "Valor total da taxa de utilização do Siscomex<br>Tamanho: 17,2<br>Formato: Decimal, com até 2 casas decimais separadas por ponto.")
    @Valid
    /**
     * Valor total da taxa de utilização do Siscomex<br>Tamanho: 17,2<br>Formato: Decimal, com até 2 casas decimais separadas por ponto.
     **/
    private BigDecimal taxaUtilizacao = null;

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
     * Quantidade de adições (Equivalência da duimp com número de adições de uma DI)&lt;br&gt;Valor mínimo: 1&lt;br&gt;Valor máximo: 99999
     *
     * @return quantidadeAdicoes
     **/
    @JsonProperty("quantidadeAdicoes")
    public Integer getQuantidadeAdicoes() {
        return quantidadeAdicoes;
    }

    public void setQuantidadeAdicoes(Integer quantidadeAdicoes) {
        this.quantidadeAdicoes = quantidadeAdicoes;
    }

    public InformaesSobreOsTributos quantidadeAdicoes(Integer quantidadeAdicoes) {
        this.quantidadeAdicoes = quantidadeAdicoes;
        return this;
    }

    /**
     * Indicador de cumprimento do ICMS.&lt;br&gt;Dominio:&lt;br&gt;1-ICMS Pago, &lt;br&gt;2-ICMS Cancelado&lt;br&gt;Tamanho: 1
     *
     * @return indicadorCumprimentoICMS
     **/
    @JsonProperty("indicadorCumprimentoICMS")
    public String getIndicadorCumprimentoICMS() {
        if (indicadorCumprimentoICMS == null) {
            return null;
        }
        return indicadorCumprimentoICMS.value();
    }

    public void setIndicadorCumprimentoICMS(IndicadorCumprimentoICMSEnum indicadorCumprimentoICMS) {
        this.indicadorCumprimentoICMS = indicadorCumprimentoICMS;
    }

    public InformaesSobreOsTributos indicadorCumprimentoICMS(IndicadorCumprimentoICMSEnum indicadorCumprimentoICMS) {
        this.indicadorCumprimentoICMS = indicadorCumprimentoICMS;
        return this;
    }

    /**
     * Tributos calculados
     *
     * @return tributosCalculados
     **/
    @JsonProperty("tributosCalculados")
    public List<SefazTributoCalculadoCover> getTributosCalculados() {
        return tributosCalculados;
    }

    public void setTributosCalculados(List<SefazTributoCalculadoCover> tributosCalculados) {
        this.tributosCalculados = tributosCalculados;
    }

    public InformaesSobreOsTributos tributosCalculados(List<SefazTributoCalculadoCover> tributosCalculados) {
        this.tributosCalculados = tributosCalculados;
        return this;
    }

    public InformaesSobreOsTributos addTributosCalculadosItem(SefazTributoCalculadoCover tributosCalculadosItem) {
        this.tributosCalculados.add(tributosCalculadosItem);
        return this;
    }

    /**
     * Valor total da taxa de utilização do Siscomex&lt;br&gt;Tamanho: 17,2&lt;br&gt;Formato: Decimal, com até 2 casas decimais separadas por ponto.
     *
     * @return taxaUtilizacao
     **/
    @JsonProperty("taxaUtilizacao")
    public BigDecimal getTaxaUtilizacao() {
        return taxaUtilizacao;
    }

    public void setTaxaUtilizacao(BigDecimal taxaUtilizacao) {
        this.taxaUtilizacao = taxaUtilizacao;
    }

    public InformaesSobreOsTributos taxaUtilizacao(BigDecimal taxaUtilizacao) {
        this.taxaUtilizacao = taxaUtilizacao;
        return this;
    }


    @Override
    public String toString() {

        String sb = "class InformaesSobreOsTributos {\n" +
                "    quantidadeAdicoes: " + toIndentedString(quantidadeAdicoes) + "\n" +
                "    indicadorCumprimentoICMS: " + toIndentedString(indicadorCumprimentoICMS) + "\n" +
                "    tributosCalculados: " + toIndentedString(tributosCalculados) + "\n" +
                "    taxaUtilizacao: " + toIndentedString(taxaUtilizacao) + "\n" +
                "}";
        return sb;
    }

    @XmlType(name = "IndicadorCumprimentoICMSEnum")
    @XmlEnum(String.class)
    public enum IndicadorCumprimentoICMSEnum {

        @XmlEnumValue("1")
        @JsonProperty("1")
        _1("1"),

        @XmlEnumValue("2")
        @JsonProperty("2")
        _2("2");


        private final String value;

        IndicadorCumprimentoICMSEnum(String v) {
            value = v;
        }

        public static IndicadorCumprimentoICMSEnum fromValue(String v) {
            for (IndicadorCumprimentoICMSEnum b : IndicadorCumprimentoICMSEnum.values()) {
                if (String.valueOf(b.value).equals(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "' to IndicadorCumprimentoICMSEnum");
        }

        public String value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
    }
}
