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

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComponenteDeFrete", propOrder =
        {"codigoComponenteFrete", "valorMoeda", "codigoMoeda", "pagamento", "descricao"
        })

@XmlRootElement(name = "ComponenteDeFrete")
public class ComponenteDeFrete {

    @XmlElement(name = "codigoComponenteFrete")
    @ApiModelProperty(example = "A01", value = "Código do componente do Frete<br> Domínio: Tabela de Componentes do Frete do Sistema Mercante.<br>Origem: Sistema Mercante - https://www.mercante.transportes.gov.br/<br>Tamanho: 3<br>Formato: 'AAA'")
    /**
     * Código do componente do Frete<br> Domínio: Tabela de Componentes do Frete do Sistema Mercante.<br>Origem: Sistema Mercante - https://www.mercante.transportes.gov.br/<br>Tamanho: 3<br>Formato: 'AAA'
     **/
    private String codigoComponenteFrete = null;

    @XmlElement(name = "valorMoeda")
    @ApiModelProperty(example = "40.48", value = "Valor do frete na moeda utilizada pelo componente<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.")
    @Valid
    /**
     * Valor do frete na moeda utilizada pelo componente<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.
     **/
    private BigDecimal valorMoeda = null;

    @XmlElement(name = "codigoMoeda")
    @ApiModelProperty(example = "220", value = "Código da moeda utilizada no Frete do componente<br> Domínio: Tabela de Moedas do Siscomex.<br>Tamanho: 3<br>Formato: 'NNN'")
    /**
     * Código da moeda utilizada no Frete do componente<br> Domínio: Tabela de Moedas do Siscomex.<br>Tamanho: 3<br>Formato: 'NNN'
     **/
    private String codigoMoeda = null;
    @XmlElement(name = "pagamento")
    @ApiModelProperty(example = "COLLECT", value = "Tipo de Pagamento .<br>Domínio:")
    /**
     * Tipo de Pagamento .<br>Domínio:
     **/
    private PagamentoEnum pagamento = null;
    @XmlElement(name = "descricao")
    @ApiModelProperty(value = "")
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
     * Código do componente do Frete&lt;br&gt; Domínio: Tabela de Componentes do Frete do Sistema Mercante.&lt;br&gt;Origem: Sistema Mercante - https://www.mercante.transportes.gov.br/&lt;br&gt;Tamanho: 3&lt;br&gt;Formato: &#39;AAA&#39;
     *
     * @return codigoComponenteFrete
     **/
    @JsonProperty("codigoComponenteFrete")
    public String getCodigoComponenteFrete() {
        return codigoComponenteFrete;
    }

    public void setCodigoComponenteFrete(String codigoComponenteFrete) {
        this.codigoComponenteFrete = codigoComponenteFrete;
    }

    public ComponenteDeFrete codigoComponenteFrete(String codigoComponenteFrete) {
        this.codigoComponenteFrete = codigoComponenteFrete;
        return this;
    }

    /**
     * Valor do frete na moeda utilizada pelo componente&lt;br&gt;Tamanho: 16,7&lt;br&gt;Formato: Decimal, com até 7 casas decimais separadas por ponto.
     *
     * @return valorMoeda
     **/
    @JsonProperty("valorMoeda")
    public BigDecimal getValorMoeda() {
        return valorMoeda;
    }

    public void setValorMoeda(BigDecimal valorMoeda) {
        this.valorMoeda = valorMoeda;
    }

    public ComponenteDeFrete valorMoeda(BigDecimal valorMoeda) {
        this.valorMoeda = valorMoeda;
        return this;
    }

    /**
     * Código da moeda utilizada no Frete do componente&lt;br&gt; Domínio: Tabela de Moedas do Siscomex.&lt;br&gt;Tamanho: 3&lt;br&gt;Formato: &#39;NNN&#39;
     *
     * @return codigoMoeda
     **/
    @JsonProperty("codigoMoeda")
    public String getCodigoMoeda() {
        return codigoMoeda;
    }

    public void setCodigoMoeda(String codigoMoeda) {
        this.codigoMoeda = codigoMoeda;
    }

    public ComponenteDeFrete codigoMoeda(String codigoMoeda) {
        this.codigoMoeda = codigoMoeda;
        return this;
    }

    /**
     * Tipo de Pagamento .&lt;br&gt;Domínio:
     *
     * @return pagamento
     **/
    @JsonProperty("pagamento")
    public String getPagamento() {
        if (pagamento == null) {
            return null;
        }
        return pagamento.value();
    }

    public void setPagamento(PagamentoEnum pagamento) {
        this.pagamento = pagamento;
    }

    public ComponenteDeFrete pagamento(PagamentoEnum pagamento) {
        this.pagamento = pagamento;
        return this;
    }

    /**
     * Get descricao
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

    public ComponenteDeFrete descricao(String descricao) {
        this.descricao = descricao;
        return this;
    }


    @Override
    public String toString() {

        String sb = "class ComponenteDeFrete {\n" +
                "    codigoComponenteFrete: " + toIndentedString(codigoComponenteFrete) + "\n" +
                "    valorMoeda: " + toIndentedString(valorMoeda) + "\n" +
                "    codigoMoeda: " + toIndentedString(codigoMoeda) + "\n" +
                "    pagamento: " + toIndentedString(pagamento) + "\n" +
                "    descricao: " + toIndentedString(descricao) + "\n" +
                "}";
        return sb;
    }

    @XmlType(name = "PagamentoEnum")
    @XmlEnum(String.class)
    public enum PagamentoEnum {

        @XmlEnumValue("PREPAID")
        @JsonProperty("PREPAID")
        PREPAID("PREPAID"),

        @XmlEnumValue("COLLECT")
        @JsonProperty("COLLECT")
        COLLECT("COLLECT");


        private final String value;

        PagamentoEnum(String v) {
            value = v;
        }

        public static PagamentoEnum fromValue(String v) {
            for (PagamentoEnum b : PagamentoEnum.values()) {
                if (String.valueOf(b.value).equals(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "' to PagamentoEnum");
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
