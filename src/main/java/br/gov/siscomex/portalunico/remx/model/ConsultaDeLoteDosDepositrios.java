package br.gov.siscomex.portalunico.remx.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.time.OffsetDateTime;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultaDeLoteDosDepositrios", propOrder =
        {"cnpjDeclarante", "dataFimLote", "dataFimManifesto", "dataInicioLote", "dataInicioManifesto", "listaOperadora", "listaUaDespacho", "numeroMaster"
        })

@XmlRootElement(name = "ConsultaDeLoteDosDepositrios")
public class ConsultaDeLoteDosDepositrios {

    @XmlElement(name = "cnpjDeclarante", required = true)
    @ApiModelProperty(example = "33683111000107", required = true, value = "CNPJ da empresa responsável composto por 14 caracteres numéricos. Não deve conter caracteres como '.', '-' e '/'.")
    /**
     * CNPJ da empresa responsável composto por 14 caracteres numéricos. Não deve conter caracteres como '.', '-' e '/'.
     **/
    private String cnpjDeclarante = null;

    @XmlElement(name = "dataFimLote")
    @ApiModelProperty(value = "Data final relacionada ao filtro por período de registro de lote.<br/>Formato: yyyy-MM-dd'T'HH:mm:ss.SSS")
    /**
     * Data final relacionada ao filtro por período de registro de lote.<br/>Formato: yyyy-MM-dd'T'HH:mm:ss.SSS
     **/
    private OffsetDateTime dataFimLote = null;

    @XmlElement(name = "dataFimManifesto")
    @ApiModelProperty(value = "Data final relacionada ao filtro por período de registro de manifesto.<br/>Formato: yyyy-MM-dd'T'HH:mm:ss.SSS")
    /**
     * Data final relacionada ao filtro por período de registro de manifesto.<br/>Formato: yyyy-MM-dd'T'HH:mm:ss.SSS
     **/
    private OffsetDateTime dataFimManifesto = null;

    @XmlElement(name = "dataInicioLote")
    @ApiModelProperty(value = "Data inicial relacionada ao filtro por período de registro de lote.<br/>Formato: yyyy-MM-dd'T'HH:mm:ss.SSS")
    /**
     * Data inicial relacionada ao filtro por período de registro de lote.<br/>Formato: yyyy-MM-dd'T'HH:mm:ss.SSS
     **/
    private OffsetDateTime dataInicioLote = null;

    @XmlElement(name = "dataInicioManifesto")
    @ApiModelProperty(value = "Data inicial relacionada ao filtro por período de registro de manifesto.<br/>Formato: yyyy-MM-dd'T'HH:mm:ss.SSS")
    /**
     * Data inicial relacionada ao filtro por período de registro de manifesto.<br/>Formato: yyyy-MM-dd'T'HH:mm:ss.SSS
     **/
    private OffsetDateTime dataInicioManifesto = null;

    @XmlElement(name = "listaOperadora")
    @ApiModelProperty(value = "Lista de operadora. Cada item da lista contém:<br/>Código da empresa operadora de remessa (mneumônico). Composto por 3 caracteres alfanuméricos. Valores de acordo com a tabela de domínio.")
    /**
     * Lista de operadora. Cada item da lista contém:<br/>Código da empresa operadora de remessa (mneumônico). Composto por 3 caracteres alfanuméricos. Valores de acordo com a tabela de domínio.
     **/
    private List<String> listaOperadora = null;

    @XmlElement(name = "listaUaDespacho")
    @ApiModelProperty(value = "Lista de UA despacho. Cada item da lista contém:<br/>Código da unidade administrativa de despacho da carga. Composto por 7 caracteres numéricos. Valores de acordo com a tabela de domínio. O sistema permitirá o preenchimento de uaDespacho sem o zero à esquerda (com 6 caracteres).")
    /**
     * Lista de UA despacho. Cada item da lista contém:<br/>Código da unidade administrativa de despacho da carga. Composto por 7 caracteres numéricos. Valores de acordo com a tabela de domínio. O sistema permitirá o preenchimento de uaDespacho sem o zero à esquerda (com 6 caracteres).
     **/
    private List<String> listaUaDespacho = null;

    @XmlElement(name = "numeroMaster")
    @ApiModelProperty(value = "Número do Master (11 caracteres numéricos) ou o número da Mala Postal (29 caracteres alfanuméricos).")
    /**
     * Número do Master (11 caracteres numéricos) ou o número da Mala Postal (29 caracteres alfanuméricos).
     **/
    private String numeroMaster = null;

    /**
     * CNPJ da empresa responsável composto por 14 caracteres numéricos. Não deve conter caracteres como &#39;.&#39;, &#39;-&#39; e &#39;/&#39;.
     *
     * @return cnpjDeclarante
     **/
    @JsonProperty("cnpjDeclarante")
    @NotNull
    public String getCnpjDeclarante() {
        return cnpjDeclarante;
    }

    public void setCnpjDeclarante(String cnpjDeclarante) {
        this.cnpjDeclarante = cnpjDeclarante;
    }

    public ConsultaDeLoteDosDepositrios cnpjDeclarante(String cnpjDeclarante) {
        this.cnpjDeclarante = cnpjDeclarante;
        return this;
    }

    /**
     * Data final relacionada ao filtro por período de registro de lote.&lt;br/&gt;Formato: yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS
     *
     * @return dataFimLote
     **/
    @JsonProperty("dataFimLote")
    public OffsetDateTime getDataFimLote() {
        return dataFimLote;
    }

    public void setDataFimLote(OffsetDateTime dataFimLote) {
        this.dataFimLote = dataFimLote;
    }

    public ConsultaDeLoteDosDepositrios dataFimLote(OffsetDateTime dataFimLote) {
        this.dataFimLote = dataFimLote;
        return this;
    }

    /**
     * Data final relacionada ao filtro por período de registro de manifesto.&lt;br/&gt;Formato: yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS
     *
     * @return dataFimManifesto
     **/
    @JsonProperty("dataFimManifesto")
    public OffsetDateTime getDataFimManifesto() {
        return dataFimManifesto;
    }

    public void setDataFimManifesto(OffsetDateTime dataFimManifesto) {
        this.dataFimManifesto = dataFimManifesto;
    }

    public ConsultaDeLoteDosDepositrios dataFimManifesto(OffsetDateTime dataFimManifesto) {
        this.dataFimManifesto = dataFimManifesto;
        return this;
    }

    /**
     * Data inicial relacionada ao filtro por período de registro de lote.&lt;br/&gt;Formato: yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS
     *
     * @return dataInicioLote
     **/
    @JsonProperty("dataInicioLote")
    public OffsetDateTime getDataInicioLote() {
        return dataInicioLote;
    }

    public void setDataInicioLote(OffsetDateTime dataInicioLote) {
        this.dataInicioLote = dataInicioLote;
    }

    public ConsultaDeLoteDosDepositrios dataInicioLote(OffsetDateTime dataInicioLote) {
        this.dataInicioLote = dataInicioLote;
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
     * Data inicial relacionada ao filtro por período de registro de manifesto.&lt;br/&gt;Formato: yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS
     *
     * @return dataInicioManifesto
     **/
    @JsonProperty("dataInicioManifesto")
    public OffsetDateTime getDataInicioManifesto() {
        return dataInicioManifesto;
    }

    public void setDataInicioManifesto(OffsetDateTime dataInicioManifesto) {
        this.dataInicioManifesto = dataInicioManifesto;
    }

    /**
     * Lista de operadora. Cada item da lista contém:&lt;br/&gt;Código da empresa operadora de remessa (mneumônico). Composto por 3 caracteres alfanuméricos. Valores de acordo com a tabela de domínio.
     *
     * @return listaOperadora
     **/
    @JsonProperty("listaOperadora")
    public List<String> getListaOperadora() {
        return listaOperadora;
    }

    public void setListaOperadora(List<String> listaOperadora) {
        this.listaOperadora = listaOperadora;
    }

    public ConsultaDeLoteDosDepositrios listaOperadora(List<String> listaOperadora) {
        this.listaOperadora = listaOperadora;
        return this;
    }

    public ConsultaDeLoteDosDepositrios addListaOperadoraItem(String listaOperadoraItem) {
        this.listaOperadora.add(listaOperadoraItem);
        return this;
    }

    public ConsultaDeLoteDosDepositrios dataInicioManifesto(OffsetDateTime dataInicioManifesto) {
        this.dataInicioManifesto = dataInicioManifesto;
        return this;
    }

    /**
     * Lista de UA despacho. Cada item da lista contém:&lt;br/&gt;Código da unidade administrativa de despacho da carga. Composto por 7 caracteres numéricos. Valores de acordo com a tabela de domínio. O sistema permitirá o preenchimento de uaDespacho sem o zero à esquerda (com 6 caracteres).
     *
     * @return listaUaDespacho
     **/
    @JsonProperty("listaUaDespacho")
    public List<String> getListaUaDespacho() {
        return listaUaDespacho;
    }

    public void setListaUaDespacho(List<String> listaUaDespacho) {
        this.listaUaDespacho = listaUaDespacho;
    }

    public ConsultaDeLoteDosDepositrios listaUaDespacho(List<String> listaUaDespacho) {
        this.listaUaDespacho = listaUaDespacho;
        return this;
    }

    public ConsultaDeLoteDosDepositrios addListaUaDespachoItem(String listaUaDespachoItem) {
        this.listaUaDespacho.add(listaUaDespachoItem);
        return this;
    }

    /**
     * Número do Master (11 caracteres numéricos) ou o número da Mala Postal (29 caracteres alfanuméricos).
     *
     * @return numeroMaster
     **/
    @JsonProperty("numeroMaster")
    public String getNumeroMaster() {
        return numeroMaster;
    }

    public void setNumeroMaster(String numeroMaster) {
        this.numeroMaster = numeroMaster;
    }

    public ConsultaDeLoteDosDepositrios numeroMaster(String numeroMaster) {
        this.numeroMaster = numeroMaster;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class ConsultaDeLoteDosDepositrios {\n" +
                "    cnpjDeclarante: " + toIndentedString(cnpjDeclarante) + "\n" +
                "    dataFimLote: " + toIndentedString(dataFimLote) + "\n" +
                "    dataFimManifesto: " + toIndentedString(dataFimManifesto) + "\n" +
                "    dataInicioLote: " + toIndentedString(dataInicioLote) + "\n" +
                "    dataInicioManifesto: " + toIndentedString(dataInicioManifesto) + "\n" +
                "    listaOperadora: " + toIndentedString(listaOperadora) + "\n" +
                "    listaUaDespacho: " + toIndentedString(listaUaDespacho) + "\n" +
                "    numeroMaster: " + toIndentedString(numeroMaster) + "\n" +
                "}";
        return sb;
    }
}
