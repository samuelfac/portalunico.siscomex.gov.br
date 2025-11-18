package br.gov.siscomex.portalunico.ccta.model;

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
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentoSaida", propOrder =
        {"autorizacoesEntrega", "canalDuimp", "dataConclusaoTransitoDta", "dataVinculacao", "dataVinculacaoLong", "descricaoRaDestinoDta", "descricaoUaDestinoDta", "numero", "raDestinoDta", "situacaoDuimp", "tipoDocumentoSaida", "uaDestinoDta", "valorTotalMercadoriaLocalDescarga", "versaoDuimp"
        })

@XmlRootElement(name = "DocumentoSaida")
public class DocumentoSaida {

    @XmlElement(name = "autorizacoesEntrega")
    @ApiModelProperty(value = "")
    @Valid
    private List<DocumentoSaidaAutorizacaoEntrega> autorizacoesEntrega = null;

    @XmlElement(name = "canalDuimp")
    @ApiModelProperty(value = "")
    private String canalDuimp = null;

    @XmlElement(name = "dataConclusaoTransitoDta")
    @ApiModelProperty(value = "")
    private OffsetDateTime dataConclusaoTransitoDta = null;

    @XmlElement(name = "dataVinculacao")
    @ApiModelProperty(value = "")
    private String dataVinculacao = null;

    @XmlElement(name = "dataVinculacaoLong")
    @ApiModelProperty(value = "")
    private Long dataVinculacaoLong = null;

    @XmlElement(name = "descricaoRaDestinoDta")
    @ApiModelProperty(value = "")
    private String descricaoRaDestinoDta = null;

    @XmlElement(name = "descricaoUaDestinoDta")
    @ApiModelProperty(value = "")
    private String descricaoUaDestinoDta = null;

    @XmlElement(name = "numero")
    @ApiModelProperty(value = "")
    private String numero = null;

    @XmlElement(name = "raDestinoDta")
    @ApiModelProperty(value = "")
    private String raDestinoDta = null;

    @XmlElement(name = "situacaoDuimp")
    @ApiModelProperty(value = "")
    private String situacaoDuimp = null;

    @XmlElement(name = "tipoDocumentoSaida")
    @ApiModelProperty(value = "")
    @Valid
    private TipoDocumentoSaida tipoDocumentoSaida = null;

    @XmlElement(name = "uaDestinoDta")
    @ApiModelProperty(value = "")
    private String uaDestinoDta = null;

    @XmlElement(name = "valorTotalMercadoriaLocalDescarga")
    @ApiModelProperty(value = "")
    @Valid
    private BigDecimal valorTotalMercadoriaLocalDescarga = null;

    @XmlElement(name = "versaoDuimp")
    @ApiModelProperty(value = "")
    private Integer versaoDuimp = null;

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
     * Get autorizacoesEntrega
     *
     * @return autorizacoesEntrega
     **/
    @JsonProperty("autorizacoesEntrega")
    public List<DocumentoSaidaAutorizacaoEntrega> getAutorizacoesEntrega() {
        return autorizacoesEntrega;
    }

    public void setAutorizacoesEntrega(List<DocumentoSaidaAutorizacaoEntrega> autorizacoesEntrega) {
        this.autorizacoesEntrega = autorizacoesEntrega;
    }

    public DocumentoSaida autorizacoesEntrega(List<DocumentoSaidaAutorizacaoEntrega> autorizacoesEntrega) {
        this.autorizacoesEntrega = autorizacoesEntrega;
        return this;
    }

    public DocumentoSaida addAutorizacoesEntregaItem(DocumentoSaidaAutorizacaoEntrega autorizacoesEntregaItem) {
        this.autorizacoesEntrega.add(autorizacoesEntregaItem);
        return this;
    }

    /**
     * Get canalDuimp
     *
     * @return canalDuimp
     **/
    @JsonProperty("canalDuimp")
    public String getCanalDuimp() {
        return canalDuimp;
    }

    public void setCanalDuimp(String canalDuimp) {
        this.canalDuimp = canalDuimp;
    }

    /**
     * Get dataConclusaoTransitoDta
     *
     * @return dataConclusaoTransitoDta
     **/
    @JsonProperty("dataConclusaoTransitoDta")
    public OffsetDateTime getDataConclusaoTransitoDta() {
        return dataConclusaoTransitoDta;
    }

    public void setDataConclusaoTransitoDta(OffsetDateTime dataConclusaoTransitoDta) {
        this.dataConclusaoTransitoDta = dataConclusaoTransitoDta;
    }

    public DocumentoSaida dataConclusaoTransitoDta(OffsetDateTime dataConclusaoTransitoDta) {
        this.dataConclusaoTransitoDta = dataConclusaoTransitoDta;
        return this;
    }

    /**
     * Get dataVinculacao
     *
     * @return dataVinculacao
     **/
    @JsonProperty("dataVinculacao")
    public String getDataVinculacao() {
        return dataVinculacao;
    }

    public void setDataVinculacao(String dataVinculacao) {
        this.dataVinculacao = dataVinculacao;
    }

    public DocumentoSaida dataVinculacao(String dataVinculacao) {
        this.dataVinculacao = dataVinculacao;
        return this;
    }

    public DocumentoSaida canalDuimp(String canalDuimp) {
        this.canalDuimp = canalDuimp;
        return this;
    }

    /**
     * Get dataVinculacaoLong
     *
     * @return dataVinculacaoLong
     **/
    @JsonProperty("dataVinculacaoLong")
    public Long getDataVinculacaoLong() {
        return dataVinculacaoLong;
    }

    public void setDataVinculacaoLong(Long dataVinculacaoLong) {
        this.dataVinculacaoLong = dataVinculacaoLong;
    }

    /**
     * Get descricaoRaDestinoDta
     *
     * @return descricaoRaDestinoDta
     **/
    @JsonProperty("descricaoRaDestinoDta")
    public String getDescricaoRaDestinoDta() {
        return descricaoRaDestinoDta;
    }

    public void setDescricaoRaDestinoDta(String descricaoRaDestinoDta) {
        this.descricaoRaDestinoDta = descricaoRaDestinoDta;
    }

    public DocumentoSaida descricaoRaDestinoDta(String descricaoRaDestinoDta) {
        this.descricaoRaDestinoDta = descricaoRaDestinoDta;
        return this;
    }

    public DocumentoSaida dataVinculacaoLong(Long dataVinculacaoLong) {
        this.dataVinculacaoLong = dataVinculacaoLong;
        return this;
    }

    /**
     * Get descricaoUaDestinoDta
     *
     * @return descricaoUaDestinoDta
     **/
    @JsonProperty("descricaoUaDestinoDta")
    public String getDescricaoUaDestinoDta() {
        return descricaoUaDestinoDta;
    }

    public void setDescricaoUaDestinoDta(String descricaoUaDestinoDta) {
        this.descricaoUaDestinoDta = descricaoUaDestinoDta;
    }

    public DocumentoSaida descricaoUaDestinoDta(String descricaoUaDestinoDta) {
        this.descricaoUaDestinoDta = descricaoUaDestinoDta;
        return this;
    }

    /**
     * Get numero
     *
     * @return numero
     **/
    @JsonProperty("numero")
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * Get raDestinoDta
     *
     * @return raDestinoDta
     **/
    @JsonProperty("raDestinoDta")
    public String getRaDestinoDta() {
        return raDestinoDta;
    }

    public void setRaDestinoDta(String raDestinoDta) {
        this.raDestinoDta = raDestinoDta;
    }

    public DocumentoSaida raDestinoDta(String raDestinoDta) {
        this.raDestinoDta = raDestinoDta;
        return this;
    }

    public DocumentoSaida numero(String numero) {
        this.numero = numero;
        return this;
    }

    /**
     * Get situacaoDuimp
     *
     * @return situacaoDuimp
     **/
    @JsonProperty("situacaoDuimp")
    public String getSituacaoDuimp() {
        return situacaoDuimp;
    }

    public void setSituacaoDuimp(String situacaoDuimp) {
        this.situacaoDuimp = situacaoDuimp;
    }

    /**
     * Get tipoDocumentoSaida
     * @return tipoDocumentoSaida
     **/
    @JsonProperty("tipoDocumentoSaida")
    public TipoDocumentoSaida getTipoDocumentoSaida() {
        return tipoDocumentoSaida;
    }

    public void setTipoDocumentoSaida(TipoDocumentoSaida tipoDocumentoSaida) {
        this.tipoDocumentoSaida = tipoDocumentoSaida;
    }

    public DocumentoSaida tipoDocumentoSaida(TipoDocumentoSaida tipoDocumentoSaida) {
        this.tipoDocumentoSaida = tipoDocumentoSaida;
        return this;
    }

    /**
     * Get uaDestinoDta
     * @return uaDestinoDta
     **/
    @JsonProperty("uaDestinoDta")
    public String getUaDestinoDta() {
        return uaDestinoDta;
    }

    public void setUaDestinoDta(String uaDestinoDta) {
        this.uaDestinoDta = uaDestinoDta;
    }

    public DocumentoSaida uaDestinoDta(String uaDestinoDta) {
        this.uaDestinoDta = uaDestinoDta;
        return this;
    }

    public DocumentoSaida situacaoDuimp(String situacaoDuimp) {
        this.situacaoDuimp = situacaoDuimp;
        return this;
    }

    /**
     * Get valorTotalMercadoriaLocalDescarga
     *
     * @return valorTotalMercadoriaLocalDescarga
     **/
    @JsonProperty("valorTotalMercadoriaLocalDescarga")
    public BigDecimal getValorTotalMercadoriaLocalDescarga() {
        return valorTotalMercadoriaLocalDescarga;
    }

    public void setValorTotalMercadoriaLocalDescarga(BigDecimal valorTotalMercadoriaLocalDescarga) {
        this.valorTotalMercadoriaLocalDescarga = valorTotalMercadoriaLocalDescarga;
    }

    /**
     * Get versaoDuimp
     *
     * @return versaoDuimp
     **/
    @JsonProperty("versaoDuimp")
    public Integer getVersaoDuimp() {
        return versaoDuimp;
    }

    public void setVersaoDuimp(Integer versaoDuimp) {
        this.versaoDuimp = versaoDuimp;
    }

    public DocumentoSaida versaoDuimp(Integer versaoDuimp) {
        this.versaoDuimp = versaoDuimp;
        return this;
    }

    public DocumentoSaida valorTotalMercadoriaLocalDescarga(BigDecimal valorTotalMercadoriaLocalDescarga) {
        this.valorTotalMercadoriaLocalDescarga = valorTotalMercadoriaLocalDescarga;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class DocumentoSaida {\n" +
                "    autorizacoesEntrega: " + toIndentedString(autorizacoesEntrega) + "\n" +
                "    canalDuimp: " + toIndentedString(canalDuimp) + "\n" +
                "    dataConclusaoTransitoDta: " + toIndentedString(dataConclusaoTransitoDta) + "\n" +
                "    dataVinculacao: " + toIndentedString(dataVinculacao) + "\n" +
                "    dataVinculacaoLong: " + toIndentedString(dataVinculacaoLong) + "\n" +
                "    descricaoRaDestinoDta: " + toIndentedString(descricaoRaDestinoDta) + "\n" +
                "    descricaoUaDestinoDta: " + toIndentedString(descricaoUaDestinoDta) + "\n" +
                "    numero: " + toIndentedString(numero) + "\n" +
                "    raDestinoDta: " + toIndentedString(raDestinoDta) + "\n" +
                "    situacaoDuimp: " + toIndentedString(situacaoDuimp) + "\n" +
                "    tipoDocumentoSaida: " + toIndentedString(tipoDocumentoSaida) + "\n" +
                "    uaDestinoDta: " + toIndentedString(uaDestinoDta) + "\n" +
                "    valorTotalMercadoriaLocalDescarga: " + toIndentedString(valorTotalMercadoriaLocalDescarga) + "\n" +
                "    versaoDuimp: " + toIndentedString(versaoDuimp) + "\n" +
                "}";
        return sb;
    }
}
