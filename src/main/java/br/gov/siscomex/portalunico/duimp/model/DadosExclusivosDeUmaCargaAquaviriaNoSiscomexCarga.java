package br.gov.siscomex.portalunico.duimp.model;

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
@XmlType(name = "DadosExclusivosDeUmaCargaAquaviriaNoSiscomexCarga", propOrder =
        {"tipoConhecimento", "valorAFRMMDevido", "valorAFRMMPago", "indicadorAFRMMQuitado", "componentesFrete"
        })

@XmlRootElement(name = "DadosExclusivosDeUmaCargaAquaviriaNoSiscomexCarga")
public class DadosExclusivosDeUmaCargaAquaviriaNoSiscomexCarga {

    @XmlElement(name = "tipoConhecimento")
    @ApiModelProperty(value = "")
    @Valid
    private TipoDeConhecimentoDaCargaAquaviria tipoConhecimento = null;

    @XmlElement(name = "valorAFRMMDevido")
    @ApiModelProperty(example = "20.12", value = "Valor Devido do AFRMM e da TUM em R$ (Reais)<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.")
    @Valid
    /**
     * Valor Devido do AFRMM e da TUM em R$ (Reais)<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.
     **/
    private BigDecimal valorAFRMMDevido = null;

    @XmlElement(name = "valorAFRMMPago")
    @ApiModelProperty(example = "80.48", value = "Valor Pago do AFRMM e da TUM em R$ (Reais)<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.")
    @Valid
    /**
     * Valor Pago do AFRMM e da TUM em R$ (Reais)<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.
     **/
    private BigDecimal valorAFRMMPago = null;


    @XmlType(name = "IndicadorAFRMMQuitadoEnum")
    @XmlEnum(Integer.class)
    public enum IndicadorAFRMMQuitadoEnum {

        @XmlEnumValue("1")
        @JsonProperty("1")
        NUMBER_1(Integer.valueOf(1)),

        @XmlEnumValue("2")
        @JsonProperty("2")
        NUMBER_2(Integer.valueOf(2));


        private final Integer value;

        IndicadorAFRMMQuitadoEnum(Integer v) {
            value = v;
        }

        public Integer value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static IndicadorAFRMMQuitadoEnum fromValue(String v) {
            for (IndicadorAFRMMQuitadoEnum b : IndicadorAFRMMQuitadoEnum.values()) {
                if (String.valueOf(b.value).equals(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "' to IndicadorAFRMMQuitadoEnum");
        }
    }

    @XmlElement(name = "indicadorAFRMMQuitado")
    @ApiModelProperty(example = "1", value = "Indica se o AFRMM encontra-se quitado ou exonerado.<br>Dominio: <br>1 - Sim,<br>2 - Não")
    /**
     * Indica se o AFRMM encontra-se quitado ou exonerado.<br>Dominio: <br>1 - Sim,<br>2 - Não
     **/
    private IndicadorAFRMMQuitadoEnum indicadorAFRMMQuitado = null;

    @XmlElement(name = "componentesFrete")
    @ApiModelProperty(value = "Lista de Componentes do Frete")
    @Valid
    /**
     * Lista de Componentes do Frete
     **/
    private List<ComponenteDeFrete> componentesFrete = null;

    /**
     * Get tipoConhecimento
     *
     * @return tipoConhecimento
     **/
    @JsonProperty("tipoConhecimento")
    public TipoDeConhecimentoDaCargaAquaviria getTipoConhecimento() {
        return tipoConhecimento;
    }

    public void setTipoConhecimento(TipoDeConhecimentoDaCargaAquaviria tipoConhecimento) {
        this.tipoConhecimento = tipoConhecimento;
    }

    public DadosExclusivosDeUmaCargaAquaviriaNoSiscomexCarga tipoConhecimento(TipoDeConhecimentoDaCargaAquaviria tipoConhecimento) {
        this.tipoConhecimento = tipoConhecimento;
        return this;
    }

    /**
     * Valor Devido do AFRMM e da TUM em R$ (Reais)&lt;br&gt;Tamanho: 16,7&lt;br&gt;Formato: Decimal, com até 7 casas decimais separadas por ponto.
     *
     * @return valorAFRMMDevido
     **/
    @JsonProperty("valorAFRMMDevido")
    public BigDecimal getValorAFRMMDevido() {
        return valorAFRMMDevido;
    }

    public void setValorAFRMMDevido(BigDecimal valorAFRMMDevido) {
        this.valorAFRMMDevido = valorAFRMMDevido;
    }

    public DadosExclusivosDeUmaCargaAquaviriaNoSiscomexCarga valorAFRMMDevido(BigDecimal valorAFRMMDevido) {
        this.valorAFRMMDevido = valorAFRMMDevido;
        return this;
    }

    /**
     * Valor Pago do AFRMM e da TUM em R$ (Reais)&lt;br&gt;Tamanho: 16,7&lt;br&gt;Formato: Decimal, com até 7 casas decimais separadas por ponto.
     *
     * @return valorAFRMMPago
     **/
    @JsonProperty("valorAFRMMPago")
    public BigDecimal getValorAFRMMPago() {
        return valorAFRMMPago;
    }

    public void setValorAFRMMPago(BigDecimal valorAFRMMPago) {
        this.valorAFRMMPago = valorAFRMMPago;
    }

    public DadosExclusivosDeUmaCargaAquaviriaNoSiscomexCarga valorAFRMMPago(BigDecimal valorAFRMMPago) {
        this.valorAFRMMPago = valorAFRMMPago;
        return this;
    }

    /**
     * Indica se o AFRMM encontra-se quitado ou exonerado.&lt;br&gt;Dominio: &lt;br&gt;1 - Sim,&lt;br&gt;2 - Não
     *
     * @return indicadorAFRMMQuitado
     **/
    @JsonProperty("indicadorAFRMMQuitado")
    public Integer getIndicadorAFRMMQuitado() {
        if (indicadorAFRMMQuitado == null) {
            return null;
        }
        return indicadorAFRMMQuitado.value();
    }

    public void setIndicadorAFRMMQuitado(IndicadorAFRMMQuitadoEnum indicadorAFRMMQuitado) {
        this.indicadorAFRMMQuitado = indicadorAFRMMQuitado;
    }

    public DadosExclusivosDeUmaCargaAquaviriaNoSiscomexCarga indicadorAFRMMQuitado(IndicadorAFRMMQuitadoEnum indicadorAFRMMQuitado) {
        this.indicadorAFRMMQuitado = indicadorAFRMMQuitado;
        return this;
    }

    /**
     * Lista de Componentes do Frete
     *
     * @return componentesFrete
     **/
    @JsonProperty("componentesFrete")
    public List<ComponenteDeFrete> getComponentesFrete() {
        return componentesFrete;
    }

    public void setComponentesFrete(List<ComponenteDeFrete> componentesFrete) {
        this.componentesFrete = componentesFrete;
    }

    public DadosExclusivosDeUmaCargaAquaviriaNoSiscomexCarga componentesFrete(List<ComponenteDeFrete> componentesFrete) {
        this.componentesFrete = componentesFrete;
        return this;
    }

    public DadosExclusivosDeUmaCargaAquaviriaNoSiscomexCarga addComponentesFreteItem(ComponenteDeFrete componentesFreteItem) {
        this.componentesFrete.add(componentesFreteItem);
        return this;
    }


    @Override
    public String toString() {

        String sb = "class DadosExclusivosDeUmaCargaAquaviriaNoSiscomexCarga {\n" +
                "    tipoConhecimento: " + toIndentedString(tipoConhecimento) + "\n" +
                "    valorAFRMMDevido: " + toIndentedString(valorAFRMMDevido) + "\n" +
                "    valorAFRMMPago: " + toIndentedString(valorAFRMMPago) + "\n" +
                "    indicadorAFRMMQuitado: " + toIndentedString(indicadorAFRMMQuitado) + "\n" +
                "    componentesFrete: " + toIndentedString(componentesFrete) + "\n" +
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

