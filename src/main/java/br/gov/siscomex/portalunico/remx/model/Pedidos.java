package br.gov.siscomex.portalunico.remx.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Pedidos", propOrder =
        {"numeroDevolucao", "numeroPedidoRevisao"
        })

@XmlRootElement(name = "Pedidos")
public class Pedidos {

    @XmlElement(name = "numeroDevolucao")
    @ApiModelProperty(value = "Número do registro de devolução gerado pelo sistema.")
    /**
     * Número do registro de devolução gerado pelo sistema.
     **/
    private String numeroDevolucao = null;

    @XmlElement(name = "numeroPedidoRevisao")
    @ApiModelProperty(value = "Número do pedido de revisão gerado pelo sistema.")
    /**
     * Número do pedido de revisão gerado pelo sistema.
     **/
    private String numeroPedidoRevisao = null;

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
     * Número do registro de devolução gerado pelo sistema.
     *
     * @return numeroDevolucao
     **/
    @JsonProperty("numeroDevolucao")
    public String getNumeroDevolucao() {
        return numeroDevolucao;
    }

    public void setNumeroDevolucao(String numeroDevolucao) {
        this.numeroDevolucao = numeroDevolucao;
    }

    public Pedidos numeroDevolucao(String numeroDevolucao) {
        this.numeroDevolucao = numeroDevolucao;
        return this;
    }

    /**
     * Número do pedido de revisão gerado pelo sistema.
     *
     * @return numeroPedidoRevisao
     **/
    @JsonProperty("numeroPedidoRevisao")
    public String getNumeroPedidoRevisao() {
        return numeroPedidoRevisao;
    }

    public void setNumeroPedidoRevisao(String numeroPedidoRevisao) {
        this.numeroPedidoRevisao = numeroPedidoRevisao;
    }

    public Pedidos numeroPedidoRevisao(String numeroPedidoRevisao) {
        this.numeroPedidoRevisao = numeroPedidoRevisao;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class Pedidos {\n" +
                "    numeroDevolucao: " + toIndentedString(numeroDevolucao) + "\n" +
                "    numeroPedidoRevisao: " + toIndentedString(numeroPedidoRevisao) + "\n" +
                "}";
        return sb;
    }
}
