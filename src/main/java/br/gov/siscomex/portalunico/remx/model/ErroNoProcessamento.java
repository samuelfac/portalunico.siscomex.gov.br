package br.gov.siscomex.portalunico.remx.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ErroNoProcessamento", propOrder =
        {"codigoBarrasDarf", "codigoMensagem", "mensagem", "numeroLote", "numeroManifesto", "numeroRemessa"
        })

@XmlRootElement(name = "ErroNoProcessamento")
public class ErroNoProcessamento {

    @XmlElement(name = "codigoBarrasDarf")
    @ApiModelProperty(value = "Número da remessa composto por no máximo 18 caracteres alfanuméricos.")
    /**
     * Número da remessa composto por no máximo 18 caracteres alfanuméricos.
     **/
    private String codigoBarrasDarf = null;

    @XmlElement(name = "codigoMensagem")
    @ApiModelProperty(value = "Código da mensagem de erro, composto de 5 caracteres, sendo 2 caracteres referentes ao tipo da mensagem e 3 referentes à mensagem de erro.")
    /**
     * Código da mensagem de erro, composto de 5 caracteres, sendo 2 caracteres referentes ao tipo da mensagem e 3 referentes à mensagem de erro.
     **/
    private String codigoMensagem = null;

    @XmlElement(name = "mensagem")
    @ApiModelProperty(value = "Mensagem de erro. Até 300 caracteres alfanuméricos, incluindo '.', '-' e '/'.")
    /**
     * Mensagem de erro. Até 300 caracteres alfanuméricos, incluindo '.', '-' e '/'.
     **/
    private String mensagem = null;

    @XmlElement(name = "numeroLote")
    @ApiModelProperty(value = "Número do lote composto por 16 caracteres alfanuméricos. Este campo é criado pelo sistema quando é feito o registro do lote de declaração.")
    /**
     * Número do lote composto por 16 caracteres alfanuméricos. Este campo é criado pelo sistema quando é feito o registro do lote de declaração.
     **/
    private String numeroLote = null;

    @XmlElement(name = "numeroManifesto")
    @ApiModelProperty(value = "Número do manifesto composto por 15 caracteres alfanuméricos. Este campo é criado pelo sistema quando é feito o registro do manifesto de carga para modalidade expressa ou registro do lote de declaração para modalidade postal.")
    /**
     * Número do manifesto composto por 15 caracteres alfanuméricos. Este campo é criado pelo sistema quando é feito o registro do manifesto de carga para modalidade expressa ou registro do lote de declaração para modalidade postal.
     **/
    private String numeroManifesto = null;

    @XmlElement(name = "numeroRemessa")
    @ApiModelProperty(value = "Número da remessa composto por no máximo 18 caracteres alfanuméricos.")
    /**
     * Número da remessa composto por no máximo 18 caracteres alfanuméricos.
     **/
    private String numeroRemessa = null;

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
     * @return codigoBarrasDarf
     **/
    @JsonProperty("codigoBarrasDarf")
    public String getCodigoBarrasDarf() {
        return codigoBarrasDarf;
    }

    public void setCodigoBarrasDarf(String codigoBarrasDarf) {
        this.codigoBarrasDarf = codigoBarrasDarf;
    }

    /**
     * Código da mensagem de erro, composto de 5 caracteres, sendo 2 caracteres referentes ao tipo da mensagem e 3 referentes à mensagem de erro.
     *
     * @return codigoMensagem
     **/
    @JsonProperty("codigoMensagem")
    public String getCodigoMensagem() {
        return codigoMensagem;
    }

    public void setCodigoMensagem(String codigoMensagem) {
        this.codigoMensagem = codigoMensagem;
    }

    public ErroNoProcessamento codigoMensagem(String codigoMensagem) {
        this.codigoMensagem = codigoMensagem;
        return this;
    }

    /**
     * Mensagem de erro. Até 300 caracteres alfanuméricos, incluindo &#39;.&#39;, &#39;-&#39; e &#39;/&#39;.
     *
     * @return mensagem
     **/
    @JsonProperty("mensagem")
    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public ErroNoProcessamento mensagem(String mensagem) {
        this.mensagem = mensagem;
        return this;
    }

    public ErroNoProcessamento codigoBarrasDarf(String codigoBarrasDarf) {
        this.codigoBarrasDarf = codigoBarrasDarf;
        return this;
    }

    /**
     * Número do lote composto por 16 caracteres alfanuméricos. Este campo é criado pelo sistema quando é feito o registro do lote de declaração.
     *
     * @return numeroLote
     **/
    @JsonProperty("numeroLote")
    public String getNumeroLote() {
        return numeroLote;
    }

    public void setNumeroLote(String numeroLote) {
        this.numeroLote = numeroLote;
    }

    /**
     * Número do manifesto composto por 15 caracteres alfanuméricos. Este campo é criado pelo sistema quando é feito o registro do manifesto de carga para modalidade expressa ou registro do lote de declaração para modalidade postal.
     *
     * @return numeroManifesto
     **/
    @JsonProperty("numeroManifesto")
    public String getNumeroManifesto() {
        return numeroManifesto;
    }

    public void setNumeroManifesto(String numeroManifesto) {
        this.numeroManifesto = numeroManifesto;
    }

    public ErroNoProcessamento numeroManifesto(String numeroManifesto) {
        this.numeroManifesto = numeroManifesto;
        return this;
    }

    public ErroNoProcessamento numeroLote(String numeroLote) {
        this.numeroLote = numeroLote;
        return this;
    }

    /**
     * Número da remessa composto por no máximo 18 caracteres alfanuméricos.
     *
     * @return numeroRemessa
     **/
    @JsonProperty("numeroRemessa")
    public String getNumeroRemessa() {
        return numeroRemessa;
    }

    public void setNumeroRemessa(String numeroRemessa) {
        this.numeroRemessa = numeroRemessa;
    }

    public ErroNoProcessamento numeroRemessa(String numeroRemessa) {
        this.numeroRemessa = numeroRemessa;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class ErroNoProcessamento {\n" +
                "    codigoBarrasDarf: " + toIndentedString(codigoBarrasDarf) + "\n" +
                "    codigoMensagem: " + toIndentedString(codigoMensagem) + "\n" +
                "    mensagem: " + toIndentedString(mensagem) + "\n" +
                "    numeroLote: " + toIndentedString(numeroLote) + "\n" +
                "    numeroManifesto: " + toIndentedString(numeroManifesto) + "\n" +
                "    numeroRemessa: " + toIndentedString(numeroRemessa) + "\n" +
                "}";
        return sb;
    }
}
