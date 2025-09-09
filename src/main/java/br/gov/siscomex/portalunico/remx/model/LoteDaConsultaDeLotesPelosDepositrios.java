package br.gov.siscomex.portalunico.remx.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoteDaConsultaDeLotesPelosDepositrios", propOrder =
        {"numeroLote", "listaNumeroRemessa", "uaDespacho", "operadora", "qtdRemessas"
        })

@XmlRootElement(name = "LoteDaConsultaDeLotesPelosDepositrios")
public class LoteDaConsultaDeLotesPelosDepositrios {

    @XmlElement(name = "numeroLote")
    @ApiModelProperty(value = "Número do lote composto por 16 caracteres alfanuméricos. Este campo é criado pelo sistema quando é feito o registro do lote de declaração.")
    /**
     * Número do lote composto por 16 caracteres alfanuméricos. Este campo é criado pelo sistema quando é feito o registro do lote de declaração.
     **/
    private String numeroLote = null;

    @XmlElement(name = "listaNumeroRemessa")
    @ApiModelProperty(value = "Lista de números de remessas. Cada item da lista contém: <br/>Número da remessa composto por no máximo 18 caracteres alfanuméricos.")
    /**
     * Lista de números de remessas. Cada item da lista contém: <br/>Número da remessa composto por no máximo 18 caracteres alfanuméricos.
     **/
    private List<String> listaNumeroRemessa = null;

    @XmlElement(name = "uaDespacho")
    @ApiModelProperty(value = "Código da unidade administrativa de despacho da carga. Composto por 7 caracteres numéricos. Valores de acordo com a tabela de domínio.")
    /**
     * Código da unidade administrativa de despacho da carga. Composto por 7 caracteres numéricos. Valores de acordo com a tabela de domínio.
     **/
    private String uaDespacho = null;

    @XmlElement(name = "operadora")
    @ApiModelProperty(value = "Código da empresa operadora de remessa (mneumônico). Composto por 3 caracteres alfanuméricos. Valores de acordo com a tabela de domínio.")
    /**
     * Código da empresa operadora de remessa (mneumônico). Composto por 3 caracteres alfanuméricos. Valores de acordo com a tabela de domínio.
     **/
    private String operadora = null;

    @XmlElement(name = "qtdRemessas")
    @ApiModelProperty(value = "Quantidade de remessas do lote. Composto por 5 caracteres numéricos.")
    /**
     * Quantidade de remessas do lote. Composto por 5 caracteres numéricos.
     **/
    private Integer qtdRemessas = null;

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

    public LoteDaConsultaDeLotesPelosDepositrios numeroLote(String numeroLote) {
        this.numeroLote = numeroLote;
        return this;
    }

    /**
     * Lista de números de remessas. Cada item da lista contém: &lt;br/&gt;Número da remessa composto por no máximo 18 caracteres alfanuméricos.
     *
     * @return listaNumeroRemessa
     **/
    @JsonProperty("listaNumeroRemessa")
    public List<String> getListaNumeroRemessa() {
        return listaNumeroRemessa;
    }

    public void setListaNumeroRemessa(List<String> listaNumeroRemessa) {
        this.listaNumeroRemessa = listaNumeroRemessa;
    }

    public LoteDaConsultaDeLotesPelosDepositrios listaNumeroRemessa(List<String> listaNumeroRemessa) {
        this.listaNumeroRemessa = listaNumeroRemessa;
        return this;
    }

    public LoteDaConsultaDeLotesPelosDepositrios addListaNumeroRemessaItem(String listaNumeroRemessaItem) {
        this.listaNumeroRemessa.add(listaNumeroRemessaItem);
        return this;
    }

    /**
     * Código da unidade administrativa de despacho da carga. Composto por 7 caracteres numéricos. Valores de acordo com a tabela de domínio.
     *
     * @return uaDespacho
     **/
    @JsonProperty("uaDespacho")
    public String getUaDespacho() {
        return uaDespacho;
    }

    public void setUaDespacho(String uaDespacho) {
        this.uaDespacho = uaDespacho;
    }

    public LoteDaConsultaDeLotesPelosDepositrios uaDespacho(String uaDespacho) {
        this.uaDespacho = uaDespacho;
        return this;
    }

    /**
     * Código da empresa operadora de remessa (mneumônico). Composto por 3 caracteres alfanuméricos. Valores de acordo com a tabela de domínio.
     *
     * @return operadora
     **/
    @JsonProperty("operadora")
    public String getOperadora() {
        return operadora;
    }

    public void setOperadora(String operadora) {
        this.operadora = operadora;
    }

    public LoteDaConsultaDeLotesPelosDepositrios operadora(String operadora) {
        this.operadora = operadora;
        return this;
    }

    /**
     * Quantidade de remessas do lote. Composto por 5 caracteres numéricos.
     *
     * @return qtdRemessas
     **/
    @JsonProperty("qtdRemessas")
    public Integer getQtdRemessas() {
        return qtdRemessas;
    }

    public void setQtdRemessas(Integer qtdRemessas) {
        this.qtdRemessas = qtdRemessas;
    }

    public LoteDaConsultaDeLotesPelosDepositrios qtdRemessas(Integer qtdRemessas) {
        this.qtdRemessas = qtdRemessas;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class LoteDaConsultaDeLotesPelosDepositrios {\n" +
                "    numeroLote: " + toIndentedString(numeroLote) + "\n" +
                "    listaNumeroRemessa: " + toIndentedString(listaNumeroRemessa) + "\n" +
                "    uaDespacho: " + toIndentedString(uaDespacho) + "\n" +
                "    operadora: " + toIndentedString(operadora) + "\n" +
                "    qtdRemessas: " + toIndentedString(qtdRemessas) + "\n" +
                "}";
        return sb;
    }
}
