package br.gov.siscomex.portalunico.remx.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemessaDoProcessamentoDoPedidoDeReviso", propOrder =
        {"numeroRemessa", "numeroLote", "novaSituacaoRemessa"
        })

@XmlRootElement(name = "RemessaDoProcessamentoDoPedidoDeReviso")
public class RemessaDoProcessamentoDoPedidoDeReviso {

    @XmlElement(name = "numeroRemessa", required = true)
    @ApiModelProperty(required = true, value = "Número da remessa composto por no máximo 18 caracteres alfanuméricos.")
    /**
     * Número da remessa composto por no máximo 18 caracteres alfanuméricos.
     **/
    private String numeroRemessa = null;

    @XmlElement(name = "numeroLote", required = true)
    @ApiModelProperty(required = true, value = "Número do lote composto por 16 caracteres alfanuméricos. Este campo é criado pelo sistema quando é feito o registro do lote de declaração.")
    /**
     * Número do lote composto por 16 caracteres alfanuméricos. Este campo é criado pelo sistema quando é feito o registro do lote de declaração.
     **/
    private String numeroLote = null;

    @XmlElement(name = "novaSituacaoRemessa", required = true)
    @ApiModelProperty(required = true, value = "Código da nova situação da remessa. O código da situação é composto por até 2 dígitos.")
    /**
     * Código da nova situação da remessa. O código da situação é composto por até 2 dígitos.
     **/
    private Integer novaSituacaoRemessa = null;

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
     * Número da remessa composto por no máximo 18 caracteres alfanuméricos.
     *
     * @return numeroRemessa
     **/
    @JsonProperty("numeroRemessa")
    @NotNull
    public String getNumeroRemessa() {
        return numeroRemessa;
    }

    public void setNumeroRemessa(String numeroRemessa) {
        this.numeroRemessa = numeroRemessa;
    }

    public RemessaDoProcessamentoDoPedidoDeReviso numeroRemessa(String numeroRemessa) {
        this.numeroRemessa = numeroRemessa;
        return this;
    }

    /**
     * Número do lote composto por 16 caracteres alfanuméricos. Este campo é criado pelo sistema quando é feito o registro do lote de declaração.
     *
     * @return numeroLote
     **/
    @JsonProperty("numeroLote")
    @NotNull
    public String getNumeroLote() {
        return numeroLote;
    }

    public void setNumeroLote(String numeroLote) {
        this.numeroLote = numeroLote;
    }

    public RemessaDoProcessamentoDoPedidoDeReviso numeroLote(String numeroLote) {
        this.numeroLote = numeroLote;
        return this;
    }

    /**
     * Código da nova situação da remessa. O código da situação é composto por até 2 dígitos.
     *
     * @return novaSituacaoRemessa
     **/
    @JsonProperty("novaSituacaoRemessa")
    @NotNull
    public Integer getNovaSituacaoRemessa() {
        return novaSituacaoRemessa;
    }

    public void setNovaSituacaoRemessa(Integer novaSituacaoRemessa) {
        this.novaSituacaoRemessa = novaSituacaoRemessa;
    }

    public RemessaDoProcessamentoDoPedidoDeReviso novaSituacaoRemessa(Integer novaSituacaoRemessa) {
        this.novaSituacaoRemessa = novaSituacaoRemessa;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class RemessaDoProcessamentoDoPedidoDeReviso {\n" +
                "    numeroRemessa: " + toIndentedString(numeroRemessa) + "\n" +
                "    numeroLote: " + toIndentedString(numeroLote) + "\n" +
                "    novaSituacaoRemessa: " + toIndentedString(novaSituacaoRemessa) + "\n" +
                "}";
        return sb;
    }
}
