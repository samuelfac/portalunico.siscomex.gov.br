package br.gov.siscomex.portalunico.remx.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;
import java.time.OffsetDateTime;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DARF", propOrder =
        {"codigoBarrasDarf", "darfRecolhido", "dataRecolhido", "valorTotalRecolhido"
        })

@XmlRootElement(name = "DARF")
public class DARF {

    @XmlElement(name = "codigoBarrasDarf")
    @ApiModelProperty(value = "O número do código de barras completo é composto por 44 caracteres numéricos, ou seja, sem os DV dos quatro campos da barra.")
    /**
     * O número do código de barras completo é composto por 44 caracteres numéricos, ou seja, sem os DV dos quatro campos da barra.
     **/
    private String codigoBarrasDarf = null;

    @XmlElement(name = "darfRecolhido")
    @ApiModelProperty(value = "Indicativo de pagamento de DARF. Domínio: 'S' - DARF pago, 'N' - DARF não pago.")
    /**
     * Indicativo de pagamento de DARF. Domínio: 'S' - DARF pago, 'N' - DARF não pago.
     **/
    private String darfRecolhido = null;

    @XmlElement(name = "dataRecolhido")
    @ApiModelProperty(value = "Data do recolhimento do DARF.<br/>Formato: yyyy-MM-dd'T'HH:mm:ss.SSS")
    /**
     * Data do recolhimento do DARF.<br/>Formato: yyyy-MM-dd'T'HH:mm:ss.SSS
     **/
    private OffsetDateTime dataRecolhido = null;

    @XmlElement(name = "valorTotalRecolhido")
    @ApiModelProperty(value = "Valor total recolhido do DARF. Número fracionário, aceitando no máximo até 10 dígitos antes do ponto e 2 dígitos após o ponto.")
    @Valid
    /**
     * Valor total recolhido do DARF. Número fracionário, aceitando no máximo até 10 dígitos antes do ponto e 2 dígitos após o ponto.
     **/
    private BigDecimal valorTotalRecolhido = null;

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
     * O número do código de barras completo é composto por 44 caracteres numéricos, ou seja, sem os DV dos quatro campos da barra.
     *
     * @return codigoBarrasDarf
     **/
    @JsonProperty("codigoBarrasDarf")
    public String getCodigoBarrasDarf() {
        return codigoBarrasDarf;
    }

    public void setCodigoBarrasDarf(String codigoBarrasDarf) {
        this.codigoBarrasDarf = codigoBarrasDarf;
    }

    public DARF codigoBarrasDarf(String codigoBarrasDarf) {
        this.codigoBarrasDarf = codigoBarrasDarf;
        return this;
    }

    /**
     * Indicativo de pagamento de DARF. Domínio: &#39;S&#39; - DARF pago, &#39;N&#39; - DARF não pago.
     *
     * @return darfRecolhido
     **/
    @JsonProperty("darfRecolhido")
    public String getDarfRecolhido() {
        return darfRecolhido;
    }

    public void setDarfRecolhido(String darfRecolhido) {
        this.darfRecolhido = darfRecolhido;
    }

    /**
     * Data do recolhimento do DARF.&lt;br/&gt;Formato: yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS
     *
     * @return dataRecolhido
     **/
    @JsonProperty("dataRecolhido")
    public OffsetDateTime getDataRecolhido() {
        return dataRecolhido;
    }

    public void setDataRecolhido(OffsetDateTime dataRecolhido) {
        this.dataRecolhido = dataRecolhido;
    }

    public DARF dataRecolhido(OffsetDateTime dataRecolhido) {
        this.dataRecolhido = dataRecolhido;
        return this;
    }

    /**
     * Valor total recolhido do DARF. Número fracionário, aceitando no máximo até 10 dígitos antes do ponto e 2 dígitos após o ponto.
     *
     * @return valorTotalRecolhido
     **/
    @JsonProperty("valorTotalRecolhido")
    public BigDecimal getValorTotalRecolhido() {
        return valorTotalRecolhido;
    }

    public void setValorTotalRecolhido(BigDecimal valorTotalRecolhido) {
        this.valorTotalRecolhido = valorTotalRecolhido;
    }

    public DARF valorTotalRecolhido(BigDecimal valorTotalRecolhido) {
        this.valorTotalRecolhido = valorTotalRecolhido;
        return this;
    }

    public DARF darfRecolhido(String darfRecolhido) {
        this.darfRecolhido = darfRecolhido;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class DARF {\n" +
                "    codigoBarrasDarf: " + toIndentedString(codigoBarrasDarf) + "\n" +
                "    darfRecolhido: " + toIndentedString(darfRecolhido) + "\n" +
                "    dataRecolhido: " + toIndentedString(dataRecolhido) + "\n" +
                "    valorTotalRecolhido: " + toIndentedString(valorTotalRecolhido) + "\n" +
                "}";
        return sb;
    }
}
