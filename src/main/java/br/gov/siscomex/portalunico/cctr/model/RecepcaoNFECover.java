package br.gov.siscomex.portalunico.cctr.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecepcaoNFECover", propOrder =
        {"pesoAferido", "motivoNaoPesagem", "codigoIdentCarga", "cnpjResp", "conteineres", "notasFiscais", "divergenciasIdentificadas", "local", "transportador", "referenciaLocalRecepcao", "avariasIdentificadas", "localArmazenamento", "observacoesGerais"
        })

@XmlRootElement(name = "RecepcaoNFECover")
/**
 * Recepção de Nota Fiscal Eletrônica
 **/
@ApiModel(description = "Recepção de Nota Fiscal Eletrônica")
public class RecepcaoNFECover {

    @XmlElement(name = "pesoAferido")
    @ApiModelProperty(example = "100.0", value = "Peso aferido na balança do recinto em Kg<br>Tamanho: 12.3<br>Formato: NNNNNNNNNNNN.NNN<br>Deve ser informado somente quando há informação de pesagem.")
    /**
     * Peso aferido na balança do recinto em Kg<br>Tamanho: 12.3<br>Formato: NNNNNNNNNNNN.NNN<br>Deve ser informado somente quando há informação de pesagem.
     **/
    private String pesoAferido = null;

    @XmlElement(name = "motivoNaoPesagem")
    @ApiModelProperty(value = "Motivo da não realização da pesagem<br>Tamanho: 250<br>Deve ser informado somente quando não há informação de pesagem.")
    /**
     * Motivo da não realização da pesagem<br>Tamanho: 250<br>Deve ser informado somente quando não há informação de pesagem.
     **/
    private String motivoNaoPesagem = null;

    @XmlElement(name = "codigoIdentCarga")
    @ApiModelProperty(example = "CARGA 0001 TESTE", value = "Código de identificação da carga<br>Tamanho mínimo: 13<br>Tamanho máximo: 35")
    /**
     * Código de identificação da carga<br>Tamanho mínimo: 13<br>Tamanho máximo: 35
     **/
    private String codigoIdentCarga = null;

    @XmlElement(name = "cnpjResp", required = true)
    @ApiModelProperty(example = "15573459000106", required = true, value = "CNPJ do responsável pela recepção<br>Tamanho: 14<br>Formato: NNNNNNNNNNNNNN")
    /**
     * CNPJ do responsável pela recepção<br>Tamanho: 14<br>Formato: NNNNNNNNNNNNNN
     **/
    private String cnpjResp = null;

    @XmlElement(name = "conteineres")
    @ApiModelProperty(value = "Lista de conteineres")
    @Valid
    /**
     * Lista de conteineres
     **/
    private List<ConteinerCover> conteineres = null;

    @XmlElement(name = "notasFiscais")
    @ApiModelProperty(value = "Notas Fiscais Eletrônicas<br>Coleção de NotaFiscalCover")
    @Valid
    /**
     * Notas Fiscais Eletrônicas<br>Coleção de NotaFiscalCover
     **/
    private List<NotaFiscalCover> notasFiscais = null;

    @XmlElement(name = "divergenciasIdentificadas")
    @ApiModelProperty(value = "Divergências identificadas<br>Tamanho: 250")
    /**
     * Divergências identificadas<br>Tamanho: 250
     **/
    private String divergenciasIdentificadas = null;

    @XmlElement(name = "local", required = true)
    @ApiModelProperty(required = true, value = "")
    @Valid
    private LocalCover local = null;

    @XmlElement(name = "transportador", required = true)
    @ApiModelProperty(required = true, value = "")
    @Valid
    private TransportadorCover transportador = null;

    @XmlElement(name = "referenciaLocalRecepcao")
    @ApiModelProperty(value = "Informação de referência do local da recepção<br>Tamanho: 150")
    /**
     * Informação de referência do local da recepção<br>Tamanho: 150
     **/
    private String referenciaLocalRecepcao = null;

    @XmlElement(name = "avariasIdentificadas")
    @ApiModelProperty(value = "Avarias identificadas<br>Tamanho: 250")
    /**
     * Avarias identificadas<br>Tamanho: 250
     **/
    private String avariasIdentificadas = null;

    @XmlElement(name = "localArmazenamento")
    @ApiModelProperty(value = "Local de armazenamento da carga<br>Tamanho: 150")
    /**
     * Local de armazenamento da carga<br>Tamanho: 150
     **/
    private String localArmazenamento = null;

    @XmlElement(name = "observacoesGerais")
    @ApiModelProperty(value = "Observações adicionais<br>Tamanho: 250")
    /**
     * Observações adicionais<br>Tamanho: 250
     **/
    private String observacoesGerais = null;

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
     * Peso aferido na balança do recinto em Kg&lt;br&gt;Tamanho: 12.3&lt;br&gt;Formato: NNNNNNNNNNNN.NNN&lt;br&gt;Deve ser informado somente quando há informação de pesagem.
     *
     * @return pesoAferido
     **/
    @JsonProperty("pesoAferido")
    @Pattern(regexp = "0\\.\\d{3}|[1-9]\\d{0,8}\\.\\d{3}")
    public String getPesoAferido() {
        return pesoAferido;
    }

    public void setPesoAferido(String pesoAferido) {
        this.pesoAferido = pesoAferido;
    }

    public RecepcaoNFECover pesoAferido(String pesoAferido) {
        this.pesoAferido = pesoAferido;
        return this;
    }

    /**
     * Motivo da não realização da pesagem&lt;br&gt;Tamanho: 250&lt;br&gt;Deve ser informado somente quando não há informação de pesagem.
     *
     * @return motivoNaoPesagem
     **/
    @JsonProperty("motivoNaoPesagem")
    @Size(min = 2, max = 250)
    public String getMotivoNaoPesagem() {
        return motivoNaoPesagem;
    }

    public void setMotivoNaoPesagem(String motivoNaoPesagem) {
        this.motivoNaoPesagem = motivoNaoPesagem;
    }

    public RecepcaoNFECover motivoNaoPesagem(String motivoNaoPesagem) {
        this.motivoNaoPesagem = motivoNaoPesagem;
        return this;
    }

    /**
     * Código de identificação da carga&lt;br&gt;Tamanho mínimo: 13&lt;br&gt;Tamanho máximo: 35
     *
     * @return codigoIdentCarga
     **/
    @JsonProperty("codigoIdentCarga")
    @Pattern(regexp = "(\\dBR\\d{8}\\d[0-9a-zA-Z]{1,23})|(\\d]BR\\d{11}\\d[0-9a-zA-Z]{1,20})")
    public String getCodigoIdentCarga() {
        return codigoIdentCarga;
    }

    public void setCodigoIdentCarga(String codigoIdentCarga) {
        this.codigoIdentCarga = codigoIdentCarga;
    }

    public RecepcaoNFECover codigoIdentCarga(String codigoIdentCarga) {
        this.codigoIdentCarga = codigoIdentCarga;
        return this;
    }

    /**
     * CNPJ do responsável pela recepção&lt;br&gt;Tamanho: 14&lt;br&gt;Formato: NNNNNNNNNNNNNN
     *
     * @return cnpjResp
     **/
    @JsonProperty("cnpjResp")
    @NotNull
    @Pattern(regexp = "\\d{14}")
    public String getCnpjResp() {
        return cnpjResp;
    }

    public void setCnpjResp(String cnpjResp) {
        this.cnpjResp = cnpjResp;
    }

    public RecepcaoNFECover cnpjResp(String cnpjResp) {
        this.cnpjResp = cnpjResp;
        return this;
    }

    /**
     * Lista de conteineres
     *
     * @return conteineres
     **/
    @JsonProperty("conteineres")
    @Size(min = 0, max = 1000)
    public List<ConteinerCover> getConteineres() {
        return conteineres;
    }

    public void setConteineres(List<ConteinerCover> conteineres) {
        this.conteineres = conteineres;
    }

    public RecepcaoNFECover conteineres(List<ConteinerCover> conteineres) {
        this.conteineres = conteineres;
        return this;
    }

    public RecepcaoNFECover addConteineresItem(ConteinerCover conteineresItem) {
        this.conteineres.add(conteineresItem);
        return this;
    }

    /**
     * Notas Fiscais Eletrônicas&lt;br&gt;Coleção de NotaFiscalCover
     *
     * @return notasFiscais
     **/
    @JsonProperty("notasFiscais")
    @Size(min = 0, max = 1000)
    public List<NotaFiscalCover> getNotasFiscais() {
        return notasFiscais;
    }

    public void setNotasFiscais(List<NotaFiscalCover> notasFiscais) {
        this.notasFiscais = notasFiscais;
    }

    public RecepcaoNFECover notasFiscais(List<NotaFiscalCover> notasFiscais) {
        this.notasFiscais = notasFiscais;
        return this;
    }

    public RecepcaoNFECover addNotasFiscaisItem(NotaFiscalCover notasFiscaisItem) {
        this.notasFiscais.add(notasFiscaisItem);
        return this;
    }

    /**
     * Divergências identificadas&lt;br&gt;Tamanho: 250
     *
     * @return divergenciasIdentificadas
     **/
    @JsonProperty("divergenciasIdentificadas")
    @Size(min = 2, max = 250)
    public String getDivergenciasIdentificadas() {
        return divergenciasIdentificadas;
    }

    public void setDivergenciasIdentificadas(String divergenciasIdentificadas) {
        this.divergenciasIdentificadas = divergenciasIdentificadas;
    }

    public RecepcaoNFECover divergenciasIdentificadas(String divergenciasIdentificadas) {
        this.divergenciasIdentificadas = divergenciasIdentificadas;
        return this;
    }

    /**
     * Get local
     *
     * @return local
     **/
    @JsonProperty("local")
    @NotNull
    public LocalCover getLocal() {
        return local;
    }

    public void setLocal(LocalCover local) {
        this.local = local;
    }

    public RecepcaoNFECover local(LocalCover local) {
        this.local = local;
        return this;
    }

    /**
     * Get transportador
     *
     * @return transportador
     **/
    @JsonProperty("transportador")
    @NotNull
    public TransportadorCover getTransportador() {
        return transportador;
    }

    public void setTransportador(TransportadorCover transportador) {
        this.transportador = transportador;
    }

    public RecepcaoNFECover transportador(TransportadorCover transportador) {
        this.transportador = transportador;
        return this;
    }

    /**
     * Informação de referência do local da recepção&lt;br&gt;Tamanho: 150
     *
     * @return referenciaLocalRecepcao
     **/
    @JsonProperty("referenciaLocalRecepcao")
    @Size(min = 2, max = 150)
    public String getReferenciaLocalRecepcao() {
        return referenciaLocalRecepcao;
    }

    public void setReferenciaLocalRecepcao(String referenciaLocalRecepcao) {
        this.referenciaLocalRecepcao = referenciaLocalRecepcao;
    }

    public RecepcaoNFECover referenciaLocalRecepcao(String referenciaLocalRecepcao) {
        this.referenciaLocalRecepcao = referenciaLocalRecepcao;
        return this;
    }

    /**
     * Avarias identificadas&lt;br&gt;Tamanho: 250
     *
     * @return avariasIdentificadas
     **/
    @JsonProperty("avariasIdentificadas")
    @Size(min = 2, max = 250)
    public String getAvariasIdentificadas() {
        return avariasIdentificadas;
    }

    public void setAvariasIdentificadas(String avariasIdentificadas) {
        this.avariasIdentificadas = avariasIdentificadas;
    }

    public RecepcaoNFECover avariasIdentificadas(String avariasIdentificadas) {
        this.avariasIdentificadas = avariasIdentificadas;
        return this;
    }

    /**
     * Local de armazenamento da carga&lt;br&gt;Tamanho: 150
     *
     * @return localArmazenamento
     **/
    @JsonProperty("localArmazenamento")
    @Size(min = 2, max = 150)
    public String getLocalArmazenamento() {
        return localArmazenamento;
    }

    public void setLocalArmazenamento(String localArmazenamento) {
        this.localArmazenamento = localArmazenamento;
    }

    public RecepcaoNFECover localArmazenamento(String localArmazenamento) {
        this.localArmazenamento = localArmazenamento;
        return this;
    }

    /**
     * Observações adicionais&lt;br&gt;Tamanho: 250
     *
     * @return observacoesGerais
     **/
    @JsonProperty("observacoesGerais")
    @Size(min = 2, max = 250)
    public String getObservacoesGerais() {
        return observacoesGerais;
    }

    public void setObservacoesGerais(String observacoesGerais) {
        this.observacoesGerais = observacoesGerais;
    }

    public RecepcaoNFECover observacoesGerais(String observacoesGerais) {
        this.observacoesGerais = observacoesGerais;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class RecepcaoNFECover {\n" +
                "    pesoAferido: " + toIndentedString(pesoAferido) + "\n" +
                "    motivoNaoPesagem: " + toIndentedString(motivoNaoPesagem) + "\n" +
                "    codigoIdentCarga: " + toIndentedString(codigoIdentCarga) + "\n" +
                "    cnpjResp: " + toIndentedString(cnpjResp) + "\n" +
                "    conteineres: " + toIndentedString(conteineres) + "\n" +
                "    notasFiscais: " + toIndentedString(notasFiscais) + "\n" +
                "    divergenciasIdentificadas: " + toIndentedString(divergenciasIdentificadas) + "\n" +
                "    local: " + toIndentedString(local) + "\n" +
                "    transportador: " + toIndentedString(transportador) + "\n" +
                "    referenciaLocalRecepcao: " + toIndentedString(referenciaLocalRecepcao) + "\n" +
                "    avariasIdentificadas: " + toIndentedString(avariasIdentificadas) + "\n" +
                "    localArmazenamento: " + toIndentedString(localArmazenamento) + "\n" +
                "    observacoesGerais: " + toIndentedString(observacoesGerais) + "\n" +
                "}";
        return sb;
    }
}
