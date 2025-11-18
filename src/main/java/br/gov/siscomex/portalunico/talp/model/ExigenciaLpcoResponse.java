package br.gov.siscomex.portalunico.talp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExigenciaLpcoResponse", propOrder =
        {"numero", "exigencia", "dataExigencia", "resposta", "dataResposta", "situacao", "numeroCancelado", "aviso", "situacaoPagamentoTaxa"
        })

@XmlRootElement(name = "ExigenciaLpcoResponse")
/**
 * Dados de uma exigência associada a um LPCO
 **/
@ApiModel(description = "Dados de uma exigência associada a um LPCO")
public class ExigenciaLpcoResponse {

    @XmlElement(name = "numero", required = true)
    @ApiModelProperty(example = "2", required = true, value = "Número sequencial da exigência")
    /**
     * Número sequencial da exigência
     **/
    private Long numero = null;

    @XmlElement(name = "exigencia", required = true)
    @ApiModelProperty(example = "Enviar documentos XYZ", required = true, value = "Descrição da exigência<br>Tamanho mínimo: 1<br>Tamanho máximo: 4000")
    /**
     * Descrição da exigência<br>Tamanho mínimo: 1<br>Tamanho máximo: 4000
     **/
    private String exigencia = null;

    @XmlElement(name = "dataExigencia", required = true)
    @ApiModelProperty(example = "04/09/2019", required = true, value = "Data em que a exigência foi realizada<br>Formato: dd/MM/yyyy")
    /**
     * Data em que a exigência foi realizada<br>Formato: dd/MM/yyyy
     **/
    private String dataExigencia = null;

    @XmlElement(name = "resposta")
    @ApiModelProperty(example = "Documentos XYZ anexados ao LPCO", value = "Resposta dada à exigência<br>Tamanho mínimo: 1<br>Tamanho máximo: 4000")
    /**
     * Resposta dada à exigência<br>Tamanho mínimo: 1<br>Tamanho máximo: 4000
     **/
    private String resposta = null;

    @XmlElement(name = "dataResposta")
    @ApiModelProperty(example = "14/09/2019", value = "Data em que a resposta foi dada<br>Formato: dd/MM/yyyy")
    /**
     * Data em que a resposta foi dada<br>Formato: dd/MM/yyyy
     **/
    private String dataResposta = null;

    @XmlElement(name = "situacao", required = true)
    @ApiModelProperty(required = true, value = "")
    @Valid
    private SituacaoExigenciaLpco situacao = null;

    @XmlElement(name = "numeroCancelado")
    @ApiModelProperty(example = "1", value = "Número da exigência anterior cancelada")
    /**
     * Número da exigência anterior cancelada
     **/
    private Long numeroCancelado = null;

    @XmlElement(name = "aviso")
    @ApiModelProperty(example = "A exigência anterior foi cancelada e uma nova exigência foi criada com a nova descrição", value = "Aviso sobre a operação realizada")
    /**
     * Aviso sobre a operação realizada
     **/
    private String aviso = null;

    @XmlElement(name = "situacaoPagamentoTaxa")
    @ApiModelProperty(value = "")
    @Valid
    private SituacaoPagamentoTaxa situacaoPagamentoTaxa = null;

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
     * Número sequencial da exigência
     *
     * @return numero
     **/
    @JsonProperty("numero")
    @NotNull
    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    /**
     * Descrição da exigência&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 4000
     *
     * @return exigencia
     **/
    @JsonProperty("exigencia")
    @NotNull
    public String getExigencia() {
        return exigencia;
    }

    public void setExigencia(String exigencia) {
        this.exigencia = exigencia;
    }

    public ExigenciaLpcoResponse exigencia(String exigencia) {
        this.exigencia = exigencia;
        return this;
    }

    /**
     * Data em que a exigência foi realizada&lt;br&gt;Formato: dd/MM/yyyy
     *
     * @return dataExigencia
     **/
    @JsonProperty("dataExigencia")
    @NotNull
    public String getDataExigencia() {
        return dataExigencia;
    }

    public void setDataExigencia(String dataExigencia) {
        this.dataExigencia = dataExigencia;
    }

    public ExigenciaLpcoResponse dataExigencia(String dataExigencia) {
        this.dataExigencia = dataExigencia;
        return this;
    }

    /**
     * Resposta dada à exigência&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 4000
     *
     * @return resposta
     **/
    @JsonProperty("resposta")
    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }

    public ExigenciaLpcoResponse resposta(String resposta) {
        this.resposta = resposta;
        return this;
    }

    /**
     * Data em que a resposta foi dada&lt;br&gt;Formato: dd/MM/yyyy
     *
     * @return dataResposta
     **/
    @JsonProperty("dataResposta")
    public String getDataResposta() {
        return dataResposta;
    }

    public void setDataResposta(String dataResposta) {
        this.dataResposta = dataResposta;
    }

    public ExigenciaLpcoResponse dataResposta(String dataResposta) {
        this.dataResposta = dataResposta;
        return this;
    }

    public ExigenciaLpcoResponse numero(Long numero) {
        this.numero = numero;
        return this;
    }

    /**
     * Get situacao
     *
     * @return situacao
     **/
    @JsonProperty("situacao")
    @NotNull
    public SituacaoExigenciaLpco getSituacao() {
        return situacao;
    }

    public void setSituacao(SituacaoExigenciaLpco situacao) {
        this.situacao = situacao;
    }

    /**
     * Número da exigência anterior cancelada
     *
     * @return numeroCancelado
     **/
    @JsonProperty("numeroCancelado")
    public Long getNumeroCancelado() {
        return numeroCancelado;
    }

    public void setNumeroCancelado(Long numeroCancelado) {
        this.numeroCancelado = numeroCancelado;
    }

    public ExigenciaLpcoResponse numeroCancelado(Long numeroCancelado) {
        this.numeroCancelado = numeroCancelado;
        return this;
    }

    /**
     * Aviso sobre a operação realizada
     * @return aviso
     **/
    @JsonProperty("aviso")
    public String getAviso() {
        return aviso;
    }

    public void setAviso(String aviso) {
        this.aviso = aviso;
    }

    public ExigenciaLpcoResponse aviso(String aviso) {
        this.aviso = aviso;
        return this;
    }

    public ExigenciaLpcoResponse situacao(SituacaoExigenciaLpco situacao) {
        this.situacao = situacao;
        return this;
    }

    /**
     * Get situacaoPagamentoTaxa
     *
     * @return situacaoPagamentoTaxa
     **/
    @JsonProperty("situacaoPagamentoTaxa")
    public SituacaoPagamentoTaxa getSituacaoPagamentoTaxa() {
        return situacaoPagamentoTaxa;
    }

    public void setSituacaoPagamentoTaxa(SituacaoPagamentoTaxa situacaoPagamentoTaxa) {
        this.situacaoPagamentoTaxa = situacaoPagamentoTaxa;
    }

    public ExigenciaLpcoResponse situacaoPagamentoTaxa(SituacaoPagamentoTaxa situacaoPagamentoTaxa) {
        this.situacaoPagamentoTaxa = situacaoPagamentoTaxa;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class ExigenciaLpcoResponse {\n" +
                "    numero: " + toIndentedString(numero) + "\n" +
                "    exigencia: " + toIndentedString(exigencia) + "\n" +
                "    dataExigencia: " + toIndentedString(dataExigencia) + "\n" +
                "    resposta: " + toIndentedString(resposta) + "\n" +
                "    dataResposta: " + toIndentedString(dataResposta) + "\n" +
                "    situacao: " + toIndentedString(situacao) + "\n" +
                "    numeroCancelado: " + toIndentedString(numeroCancelado) + "\n" +
                "    aviso: " + toIndentedString(aviso) + "\n" +
                "    situacaoPagamentoTaxa: " + toIndentedString(situacaoPagamentoTaxa) + "\n" +
                "}";
        return sb;
    }
}
