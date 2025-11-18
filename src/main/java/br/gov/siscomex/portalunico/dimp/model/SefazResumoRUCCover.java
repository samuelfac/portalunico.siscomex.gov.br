package br.gov.siscomex.portalunico.dimp.model;

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
@XmlType(name = "SefazResumoRUCCover", propOrder =
        {"totalPesoBrutoKgRecepcionados", "totalPesoBrutoKgEntregues", "totalVolumesRecepcionados", "totalVolumesEntregues"
        })

@XmlRootElement(name = "SefazResumoRUCCover")
public class SefazResumoRUCCover {

    @XmlElement(name = "totalPesoBrutoKgRecepcionados")
    @ApiModelProperty(value = "Total Recepcionado (Peso Bruto em KG)<br>Tamanho: 16,5<br>Formato: Decimal, com até 5 casas decimais separadas por ponto.")
    @Valid
    /**
     * Total Recepcionado (Peso Bruto em KG)<br>Tamanho: 16,5<br>Formato: Decimal, com até 5 casas decimais separadas por ponto.
     **/
    private BigDecimal totalPesoBrutoKgRecepcionados = null;

    @XmlElement(name = "totalPesoBrutoKgEntregues")
    @ApiModelProperty(value = "Total Entregue (Peso Bruto em KG)<br>Tamanho: 16,5<br>Formato: Decimal, com até 5 casas decimais separadas por ponto.")
    @Valid
    /**
     * Total Entregue (Peso Bruto em KG)<br>Tamanho: 16,5<br>Formato: Decimal, com até 5 casas decimais separadas por ponto.
     **/
    private BigDecimal totalPesoBrutoKgEntregues = null;

    @XmlElement(name = "totalVolumesRecepcionados")
    @ApiModelProperty(value = "Total de Volumes Recepcionados<br>Formato: Inteiro, com até 10 digitos<br>Valor mínimo: 1<br>Valor máximo: 2.147.483.647")
    /**
     * Total de Volumes Recepcionados<br>Formato: Inteiro, com até 10 digitos<br>Valor mínimo: 1<br>Valor máximo: 2.147.483.647
     **/
    private Integer totalVolumesRecepcionados = null;

    @XmlElement(name = "totalVolumesEntregues")
    @ApiModelProperty(value = "Total de Volumes Entreques<br>Formato: Inteiro, com até 10 digitos<br>Valor mínimo: 1<br>Valor máximo: 2.147.483.647")
    /**
     * Total de Volumes Entreques<br>Formato: Inteiro, com até 10 digitos<br>Valor mínimo: 1<br>Valor máximo: 2.147.483.647
     **/
    private Integer totalVolumesEntregues = null;

    /**
     * Total Recepcionado (Peso Bruto em KG)&lt;br&gt;Tamanho: 16,5&lt;br&gt;Formato: Decimal, com até 5 casas decimais separadas por ponto.
     *
     * @return totalPesoBrutoKgRecepcionados
     **/
    @JsonProperty("totalPesoBrutoKgRecepcionados")
    public BigDecimal getTotalPesoBrutoKgRecepcionados() {
        return totalPesoBrutoKgRecepcionados;
    }

    public void setTotalPesoBrutoKgRecepcionados(BigDecimal totalPesoBrutoKgRecepcionados) {
        this.totalPesoBrutoKgRecepcionados = totalPesoBrutoKgRecepcionados;
    }

    public SefazResumoRUCCover totalPesoBrutoKgRecepcionados(BigDecimal totalPesoBrutoKgRecepcionados) {
        this.totalPesoBrutoKgRecepcionados = totalPesoBrutoKgRecepcionados;
        return this;
    }

    /**
     * Total Entregue (Peso Bruto em KG)&lt;br&gt;Tamanho: 16,5&lt;br&gt;Formato: Decimal, com até 5 casas decimais separadas por ponto.
     *
     * @return totalPesoBrutoKgEntregues
     **/
    @JsonProperty("totalPesoBrutoKgEntregues")
    public BigDecimal getTotalPesoBrutoKgEntregues() {
        return totalPesoBrutoKgEntregues;
    }

    public void setTotalPesoBrutoKgEntregues(BigDecimal totalPesoBrutoKgEntregues) {
        this.totalPesoBrutoKgEntregues = totalPesoBrutoKgEntregues;
    }

    public SefazResumoRUCCover totalPesoBrutoKgEntregues(BigDecimal totalPesoBrutoKgEntregues) {
        this.totalPesoBrutoKgEntregues = totalPesoBrutoKgEntregues;
        return this;
    }

    /**
     * Total de Volumes Recepcionados&lt;br&gt;Formato: Inteiro, com até 10 digitos&lt;br&gt;Valor mínimo: 1&lt;br&gt;Valor máximo: 2.147.483.647
     *
     * @return totalVolumesRecepcionados
     **/
    @JsonProperty("totalVolumesRecepcionados")
    public Integer getTotalVolumesRecepcionados() {
        return totalVolumesRecepcionados;
    }

    public void setTotalVolumesRecepcionados(Integer totalVolumesRecepcionados) {
        this.totalVolumesRecepcionados = totalVolumesRecepcionados;
    }

    public SefazResumoRUCCover totalVolumesRecepcionados(Integer totalVolumesRecepcionados) {
        this.totalVolumesRecepcionados = totalVolumesRecepcionados;
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
     * Total de Volumes Entreques&lt;br&gt;Formato: Inteiro, com até 10 digitos&lt;br&gt;Valor mínimo: 1&lt;br&gt;Valor máximo: 2.147.483.647
     *
     * @return totalVolumesEntregues
     **/
    @JsonProperty("totalVolumesEntregues")
    public Integer getTotalVolumesEntregues() {
        return totalVolumesEntregues;
    }

    public void setTotalVolumesEntregues(Integer totalVolumesEntregues) {
        this.totalVolumesEntregues = totalVolumesEntregues;
    }

    public SefazResumoRUCCover totalVolumesEntregues(Integer totalVolumesEntregues) {
        this.totalVolumesEntregues = totalVolumesEntregues;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class SefazResumoRUCCover {\n" +
                "    totalPesoBrutoKgRecepcionados: " + toIndentedString(totalPesoBrutoKgRecepcionados) + "\n" +
                "    totalPesoBrutoKgEntregues: " + toIndentedString(totalPesoBrutoKgEntregues) + "\n" +
                "    totalVolumesRecepcionados: " + toIndentedString(totalVolumesRecepcionados) + "\n" +
                "    totalVolumesEntregues: " + toIndentedString(totalVolumesEntregues) + "\n" +
                "}";
        return sb;
    }
}
