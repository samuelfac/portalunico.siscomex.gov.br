package br.gov.siscomex.portalunico.pcce.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SefazIcmsFracionadoDto", propOrder =
        {"dataConfirmacaoCredito", "notasFiscais", "numeroDeclaracao", "tipoDeclaracao", "tipoRetorno", "valorTotalCredito", "versaoDeclaracao"
        })

@XmlRootElement(name = "SefazIcmsFracionadoDto")
/**
 * Dados de notas fiscais liberadas em declaração de ICMS com pagamento fracionado
 **/
@ApiModel(description = "Dados de notas fiscais liberadas em declaração de ICMS com pagamento fracionado")
public class SefazIcmsFracionadoDto {

    @XmlElement(name = "dataConfirmacaoCredito")
    @ApiModelProperty(example = "2021-08-31T09:11:06-0300", value = "Data e hora da confirmação do crédito de ICMS<br>Formato: 'yyyy-MM-dd'T'HH:mm:ssZ'<br/> (*) Obrigatório se tipoRetorno = SEM_VALOR_A_PAGAR")
    /**
     * Data e hora da confirmação do crédito de ICMS<br>Formato: 'yyyy-MM-dd'T'HH:mm:ssZ'<br/> (*) Obrigatório se tipoRetorno = SEM_VALOR_A_PAGAR
     **/
    private String dataConfirmacaoCredito = null;

    @XmlElement(name = "notasFiscais", required = true)
    @ApiModelProperty(required = true, value = "Lista de nota fiscais cuja obrigação de ICMS já foi cumprida.")
    @Valid
    /**
     * Lista de nota fiscais cuja obrigação de ICMS já foi cumprida.
     **/
    private List<SefazNotaFiscalDto> notasFiscais = new ArrayList<>();

    @XmlElement(name = "numeroDeclaracao", required = true)
    @ApiModelProperty(example = "19BR00000004677", required = true, value = "Número da declaração<br>Formato: 'NNAANNNNNNNNNNN'<br>Tamanho: 15")
    /**
     * Número da declaração<br>Formato: 'NNAANNNNNNNNNNN'<br>Tamanho: 15
     **/
    private String numeroDeclaracao = null;
    @XmlElement(name = "tipoDeclaracao", required = true)
    @ApiModelProperty(example = "DUIMP", required = true, value = "Tipo da declaração no Comércio Exterior")
    /**
     * Tipo da declaração no Comércio Exterior
     **/
    private TipoDeclaracaoEnum tipoDeclaracao = null;

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

    @XmlElement(name = "tipoRetorno", required = true)
    @ApiModelProperty(example = "SEM_VALOR_A_PAGAR", required = true, value = "Tipo de retorno<br/> - CALCULADO_A_PAGAR: indica que ainda existem notas fiscais pendentes de liberação<br/> - SEM_VALOR_A_PAGAR: indica que todas as notas fiscais já foram liberadas<br/>")
    /**
     * Tipo de retorno<br/> - CALCULADO_A_PAGAR: indica que ainda existem notas fiscais pendentes de liberação<br/> - SEM_VALOR_A_PAGAR: indica que todas as notas fiscais já foram liberadas<br/>
     **/
    private TipoRetornoEnum tipoRetorno = null;
    @XmlElement(name = "valorTotalCredito")
    @ApiModelProperty(example = "103.2", value = "Valor total do crédito de ICMS<br>Formato: Decimal, com 2 casas decimais separadas por ponto.<br>Tamanho: 15,2<br/> (*) Obrigatório se tipoRetorno = SEM_VALOR_A_PAGAR")
    @Valid
    /**
     * Valor total do crédito de ICMS<br>Formato: Decimal, com 2 casas decimais separadas por ponto.<br>Tamanho: 15,2<br/> (*) Obrigatório se tipoRetorno = SEM_VALOR_A_PAGAR
     **/
    private BigDecimal valorTotalCredito = null;
    @XmlElement(name = "versaoDeclaracao", required = true)
    @ApiModelProperty(example = "1", required = true, value = "Versão da declaração<br>Valor mínimo: 1<br>Valor máximo: 9999")
    /**
     * Versão da declaração<br>Valor mínimo: 1<br>Valor máximo: 9999
     **/
    private String versaoDeclaracao = null;

    /**
     * Tipo de retorno&lt;br/&gt; - CALCULADO_A_PAGAR: indica que ainda existem notas fiscais pendentes de liberação&lt;br/&gt; - SEM_VALOR_A_PAGAR: indica que todas as notas fiscais já foram liberadas&lt;br/&gt;
     *
     * @return tipoRetorno
     **/
    @JsonProperty("tipoRetorno")
    @NotNull
    public String getTipoRetorno() {
        if (tipoRetorno == null) {
            return null;
        }
        return tipoRetorno.value();
    }

    /**
     * Data e hora da confirmação do crédito de ICMS&lt;br&gt;Formato: &#39;yyyy-MM-dd&#39;T&#39;HH:mm:ssZ&#39;&lt;br/&gt; (*) Obrigatório se tipoRetorno &#x3D; SEM_VALOR_A_PAGAR
     *
     * @return dataConfirmacaoCredito
     **/
    @JsonProperty("dataConfirmacaoCredito")
    public String getDataConfirmacaoCredito() {
        return dataConfirmacaoCredito;
    }

    public void setDataConfirmacaoCredito(String dataConfirmacaoCredito) {
        this.dataConfirmacaoCredito = dataConfirmacaoCredito;
    }

    public SefazIcmsFracionadoDto dataConfirmacaoCredito(String dataConfirmacaoCredito) {
        this.dataConfirmacaoCredito = dataConfirmacaoCredito;
        return this;
    }

    /**
     * Lista de nota fiscais cuja obrigação de ICMS já foi cumprida.
     *
     * @return notasFiscais
     **/
    @JsonProperty("notasFiscais")
    @NotNull
    public List<SefazNotaFiscalDto> getNotasFiscais() {
        return notasFiscais;
    }

    public void setNotasFiscais(List<SefazNotaFiscalDto> notasFiscais) {
        this.notasFiscais = notasFiscais;
    }

    public SefazIcmsFracionadoDto notasFiscais(List<SefazNotaFiscalDto> notasFiscais) {
        this.notasFiscais = notasFiscais;
        return this;
    }

    public SefazIcmsFracionadoDto addNotasFiscaisItem(SefazNotaFiscalDto notasFiscaisItem) {
        this.notasFiscais.add(notasFiscaisItem);
        return this;
    }

    /**
     * Número da declaração&lt;br&gt;Formato: &#39;NNAANNNNNNNNNNN&#39;&lt;br&gt;Tamanho: 15
     *
     * @return numeroDeclaracao
     **/
    @JsonProperty("numeroDeclaracao")
    @NotNull
    public String getNumeroDeclaracao() {
        return numeroDeclaracao;
    }

    public void setNumeroDeclaracao(String numeroDeclaracao) {
        this.numeroDeclaracao = numeroDeclaracao;
    }

    public SefazIcmsFracionadoDto numeroDeclaracao(String numeroDeclaracao) {
        this.numeroDeclaracao = numeroDeclaracao;
        return this;
    }

    /**
     * Tipo da declaração no Comércio Exterior
     *
     * @return tipoDeclaracao
     **/
    @JsonProperty("tipoDeclaracao")
    @NotNull
    public String getTipoDeclaracao() {
        if (tipoDeclaracao == null) {
            return null;
        }
        return tipoDeclaracao.value();
    }

    public void setTipoDeclaracao(TipoDeclaracaoEnum tipoDeclaracao) {
        this.tipoDeclaracao = tipoDeclaracao;
    }

    public SefazIcmsFracionadoDto tipoDeclaracao(TipoDeclaracaoEnum tipoDeclaracao) {
        this.tipoDeclaracao = tipoDeclaracao;
        return this;
    }

    public void setTipoRetorno(TipoRetornoEnum tipoRetorno) {
        this.tipoRetorno = tipoRetorno;
    }

    public SefazIcmsFracionadoDto tipoRetorno(TipoRetornoEnum tipoRetorno) {
        this.tipoRetorno = tipoRetorno;
        return this;
    }

    /**
     * Valor total do crédito de ICMS&lt;br&gt;Formato: Decimal, com 2 casas decimais separadas por ponto.&lt;br&gt;Tamanho: 15,2&lt;br/&gt; (*) Obrigatório se tipoRetorno &#x3D; SEM_VALOR_A_PAGAR
     *
     * @return valorTotalCredito
     **/
    @JsonProperty("valorTotalCredito")
    public BigDecimal getValorTotalCredito() {
        return valorTotalCredito;
    }

    public void setValorTotalCredito(BigDecimal valorTotalCredito) {
        this.valorTotalCredito = valorTotalCredito;
    }

    public SefazIcmsFracionadoDto valorTotalCredito(BigDecimal valorTotalCredito) {
        this.valorTotalCredito = valorTotalCredito;
        return this;
    }

    /**
     * Versão da declaração&lt;br&gt;Valor mínimo: 1&lt;br&gt;Valor máximo: 9999
     *
     * @return versaoDeclaracao
     **/
    @JsonProperty("versaoDeclaracao")
    @NotNull
    public String getVersaoDeclaracao() {
        return versaoDeclaracao;
    }

    public void setVersaoDeclaracao(String versaoDeclaracao) {
        this.versaoDeclaracao = versaoDeclaracao;
    }

    public SefazIcmsFracionadoDto versaoDeclaracao(String versaoDeclaracao) {
        this.versaoDeclaracao = versaoDeclaracao;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class SefazIcmsFracionadoDto {\n" +
                "    dataConfirmacaoCredito: " + toIndentedString(dataConfirmacaoCredito) + "\n" +
                "    notasFiscais: " + toIndentedString(notasFiscais) + "\n" +
                "    numeroDeclaracao: " + toIndentedString(numeroDeclaracao) + "\n" +
                "    tipoDeclaracao: " + toIndentedString(tipoDeclaracao) + "\n" +
                "    tipoRetorno: " + toIndentedString(tipoRetorno) + "\n" +
                "    valorTotalCredito: " + toIndentedString(valorTotalCredito) + "\n" +
                "    versaoDeclaracao: " + toIndentedString(versaoDeclaracao) + "\n" +
                "}";
        return sb;
    }


    @XmlType(name = "TipoDeclaracaoEnum")
    @XmlEnum(String.class)
    public enum TipoDeclaracaoEnum {

        @XmlEnumValue("DUIMP")
        @JsonProperty("DUIMP")
        DUIMP("DUIMP");


        private final String value;

        TipoDeclaracaoEnum(String v) {
            value = v;
        }

        public static TipoDeclaracaoEnum fromValue(String v) {
            for (TipoDeclaracaoEnum b : TipoDeclaracaoEnum.values()) {
                if (String.valueOf(b.value).equals(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "' to TipoDeclaracaoEnum");
        }

        public String value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
    }

    @XmlType(name = "TipoRetornoEnum")
    @XmlEnum(String.class)
    public enum TipoRetornoEnum {

        @XmlEnumValue("CALCULADO_A_PAGAR")
        @JsonProperty("CALCULADO_A_PAGAR")
        CALCULADO_A_PAGAR("CALCULADO_A_PAGAR"),

        @XmlEnumValue("SEM_VALOR_A_PAGAR")
        @JsonProperty("SEM_VALOR_A_PAGAR")
        SEM_VALOR_A_PAGAR("SEM_VALOR_A_PAGAR");


        private final String value;

        TipoRetornoEnum(String v) {
            value = v;
        }

        public static TipoRetornoEnum fromValue(String v) {
            for (TipoRetornoEnum b : TipoRetornoEnum.values()) {
                if (String.valueOf(b.value).equals(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "' to TipoRetornoEnum");
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
