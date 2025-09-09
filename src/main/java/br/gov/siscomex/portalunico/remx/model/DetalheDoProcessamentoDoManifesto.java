package br.gov.siscomex.portalunico.remx.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.time.OffsetDateTime;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DetalheDoProcessamentoDoManifesto", propOrder =
        {"dataHoraManifesto", "nomeEmpresa", "numeroManifesto", "uaEntrada", "paisOrigem", "cnpj", "remessas"
        })

@XmlRootElement(name = "DetalheDoProcessamentoDoManifesto")
public class DetalheDoProcessamentoDoManifesto {

    @XmlElement(name = "dataHoraManifesto", required = true)
    @ApiModelProperty(required = true, value = "Data e horário do registro do manifesto de carga.<br/>Formato: yyyy-MM-dd'T'HH:mm:ss.SSS")
    /**
     * Data e horário do registro do manifesto de carga.<br/>Formato: yyyy-MM-dd'T'HH:mm:ss.SSS
     **/
    private OffsetDateTime dataHoraManifesto = null;

    @XmlElement(name = "nomeEmpresa", required = true)
    @ApiModelProperty(required = true, value = "Nome da empresa o qual o manifesto pertence. Duzentos e cinquenta e cinco caracteres que podem ser letras, números, além de quaisquer caracteres referentes a codificação UTF-8.")
    /**
     * Nome da empresa o qual o manifesto pertence. Duzentos e cinquenta e cinco caracteres que podem ser letras, números, além de quaisquer caracteres referentes a codificação UTF-8.
     **/
    private String nomeEmpresa = null;

    @XmlElement(name = "numeroManifesto", required = true)
    @ApiModelProperty(required = true, value = "Número do manifesto composto por 15 caracteres alfanuméricos. Este campo é criado pelo sistema quando é feito o registro do manifesto de carga para modalidade expressa ou registro do lote de declaração para modalidade postal.")
    /**
     * Número do manifesto composto por 15 caracteres alfanuméricos. Este campo é criado pelo sistema quando é feito o registro do manifesto de carga para modalidade expressa ou registro do lote de declaração para modalidade postal.
     **/
    private String numeroManifesto = null;

    @XmlElement(name = "uaEntrada", required = true)
    @ApiModelProperty(required = true, value = "Código da unidade administrativa de entrada da carga. Valores de acordo com a tabela de domínio.")
    /**
     * Código da unidade administrativa de entrada da carga. Valores de acordo com a tabela de domínio.
     **/
    private String uaEntrada = null;

    @XmlElement(name = "paisOrigem", required = true)
    @ApiModelProperty(required = true, value = "Código do país de origem da carga. Valores de acordo com a tabela de domínio.")
    /**
     * Código do país de origem da carga. Valores de acordo com a tabela de domínio.
     **/
    private String paisOrigem = null;

    @XmlElement(name = "cnpj", required = true)
    @ApiModelProperty(required = true, value = "CNPJ da empresa responsável composto por 14 caracteres numéricos. Não deve conter caracteres como '.', '-' e '/'.")
    /**
     * CNPJ da empresa responsável composto por 14 caracteres numéricos. Não deve conter caracteres como '.', '-' e '/'.
     **/
    private String cnpj = null;

    @XmlElement(name = "remessas")
    @ApiModelProperty(value = "Lista de remessas.")
    @Valid
    /**
     * Lista de remessas.
     **/
    private List<DetalheDoProcessamentoDaRemessa> remessas = null;

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
     * Data e horário do registro do manifesto de carga.&lt;br/&gt;Formato: yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS
     *
     * @return dataHoraManifesto
     **/
    @JsonProperty("dataHoraManifesto")
    @NotNull
    public OffsetDateTime getDataHoraManifesto() {
        return dataHoraManifesto;
    }

    public void setDataHoraManifesto(OffsetDateTime dataHoraManifesto) {
        this.dataHoraManifesto = dataHoraManifesto;
    }

    public DetalheDoProcessamentoDoManifesto dataHoraManifesto(OffsetDateTime dataHoraManifesto) {
        this.dataHoraManifesto = dataHoraManifesto;
        return this;
    }

    /**
     * Nome da empresa o qual o manifesto pertence. Duzentos e cinquenta e cinco caracteres que podem ser letras, números, além de quaisquer caracteres referentes a codificação UTF-8.
     *
     * @return nomeEmpresa
     **/
    @JsonProperty("nomeEmpresa")
    @NotNull
    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public DetalheDoProcessamentoDoManifesto nomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
        return this;
    }

    /**
     * Número do manifesto composto por 15 caracteres alfanuméricos. Este campo é criado pelo sistema quando é feito o registro do manifesto de carga para modalidade expressa ou registro do lote de declaração para modalidade postal.
     *
     * @return numeroManifesto
     **/
    @JsonProperty("numeroManifesto")
    @NotNull
    public String getNumeroManifesto() {
        return numeroManifesto;
    }

    public void setNumeroManifesto(String numeroManifesto) {
        this.numeroManifesto = numeroManifesto;
    }

    public DetalheDoProcessamentoDoManifesto numeroManifesto(String numeroManifesto) {
        this.numeroManifesto = numeroManifesto;
        return this;
    }

    /**
     * Código da unidade administrativa de entrada da carga. Valores de acordo com a tabela de domínio.
     *
     * @return uaEntrada
     **/
    @JsonProperty("uaEntrada")
    @NotNull
    public String getUaEntrada() {
        return uaEntrada;
    }

    public void setUaEntrada(String uaEntrada) {
        this.uaEntrada = uaEntrada;
    }

    public DetalheDoProcessamentoDoManifesto uaEntrada(String uaEntrada) {
        this.uaEntrada = uaEntrada;
        return this;
    }

    /**
     * Código do país de origem da carga. Valores de acordo com a tabela de domínio.
     *
     * @return paisOrigem
     **/
    @JsonProperty("paisOrigem")
    @NotNull
    public String getPaisOrigem() {
        return paisOrigem;
    }

    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }

    public DetalheDoProcessamentoDoManifesto paisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
        return this;
    }

    /**
     * CNPJ da empresa responsável composto por 14 caracteres numéricos. Não deve conter caracteres como &#39;.&#39;, &#39;-&#39; e &#39;/&#39;.
     *
     * @return cnpj
     **/
    @JsonProperty("cnpj")
    @NotNull
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public DetalheDoProcessamentoDoManifesto cnpj(String cnpj) {
        this.cnpj = cnpj;
        return this;
    }

    /**
     * Lista de remessas.
     *
     * @return remessas
     **/
    @JsonProperty("remessas")
    public List<DetalheDoProcessamentoDaRemessa> getRemessas() {
        return remessas;
    }

    public void setRemessas(List<DetalheDoProcessamentoDaRemessa> remessas) {
        this.remessas = remessas;
    }

    public DetalheDoProcessamentoDoManifesto remessas(List<DetalheDoProcessamentoDaRemessa> remessas) {
        this.remessas = remessas;
        return this;
    }

    public DetalheDoProcessamentoDoManifesto addRemessasItem(DetalheDoProcessamentoDaRemessa remessasItem) {
        this.remessas.add(remessasItem);
        return this;
    }

    @Override
    public String toString() {

        String sb = "class DetalheDoProcessamentoDoManifesto {\n" +
                "    dataHoraManifesto: " + toIndentedString(dataHoraManifesto) + "\n" +
                "    nomeEmpresa: " + toIndentedString(nomeEmpresa) + "\n" +
                "    numeroManifesto: " + toIndentedString(numeroManifesto) + "\n" +
                "    uaEntrada: " + toIndentedString(uaEntrada) + "\n" +
                "    paisOrigem: " + toIndentedString(paisOrigem) + "\n" +
                "    cnpj: " + toIndentedString(cnpj) + "\n" +
                "    remessas: " + toIndentedString(remessas) + "\n" +
                "}";
        return sb;
    }
}
