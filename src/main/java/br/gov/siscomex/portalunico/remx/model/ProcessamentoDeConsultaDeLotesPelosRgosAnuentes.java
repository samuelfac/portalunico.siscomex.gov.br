package br.gov.siscomex.portalunico.remx.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.time.OffsetDateTime;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcessamentoDeConsultaDeLotesPelosRgosAnuentes", propOrder =
        {"situacao", "numeroProtocolo", "dataHoraProcessamento", "dataHorarioEnvio", "lotes", "erros"
        })

@XmlRootElement(name = "ProcessamentoDeConsultaDeLotesPelosRgosAnuentes")
public class ProcessamentoDeConsultaDeLotesPelosRgosAnuentes {

    @XmlElement(name = "situacao")
    @ApiModelProperty(value = "Situacao do processamento. Valores pré-definidos:<br/>0 - Aguardando processamento;<br/>1 - Processamento concluído.")
    /**
     * Situacao do processamento. Valores pré-definidos:<br/>0 - Aguardando processamento;<br/>1 - Processamento concluído.
     **/
    private Integer situacao = null;

    @XmlElement(name = "numeroProtocolo")
    @ApiModelProperty(value = "Número do protocolo composto por 36 caracteres alfanuméricos. Este campo é criado pelo sistema e deve ser usado para consulta do resultado.")
    /**
     * Número do protocolo composto por 36 caracteres alfanuméricos. Este campo é criado pelo sistema e deve ser usado para consulta do resultado.
     **/
    private String numeroProtocolo = null;

    @XmlElement(name = "dataHoraProcessamento")
    @ApiModelProperty(value = "Data e horário do processamento da consulta.<br/>Formato: yyyy-MM-dd'T'HH:mm:ss.SSS")
    /**
     * Data e horário do processamento da consulta.<br/>Formato: yyyy-MM-dd'T'HH:mm:ss.SSS
     **/
    private OffsetDateTime dataHoraProcessamento = null;

    @XmlElement(name = "dataHorarioEnvio")
    @ApiModelProperty(value = "Data e horário do envio do Json de consulta.<br/>Formato: yyyy-MM-dd'T'HH:mm:ss.SSS")
    /**
     * Data e horário do envio do Json de consulta.<br/>Formato: yyyy-MM-dd'T'HH:mm:ss.SSS
     **/
    private OffsetDateTime dataHorarioEnvio = null;

    @XmlElement(name = "lotes")
    @ApiModelProperty(value = "Lista de lotes.")
    @Valid
    /**
     * Lista de lotes.
     **/
    private List<LoteDaConsultaDeLotesPelosRgosAnuentes> lotes = null;

    @XmlElement(name = "erros")
    @ApiModelProperty(value = "Lista de erros.")
    @Valid
    /**
     * Lista de erros.
     **/
    private List<ErroNoProcessamento> erros = null;

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
     * Situacao do processamento. Valores pré-definidos:&lt;br/&gt;0 - Aguardando processamento;&lt;br/&gt;1 - Processamento concluído.
     *
     * @return situacao
     **/
    @JsonProperty("situacao")
    public Integer getSituacao() {
        return situacao;
    }

    public void setSituacao(Integer situacao) {
        this.situacao = situacao;
    }

    public ProcessamentoDeConsultaDeLotesPelosRgosAnuentes situacao(Integer situacao) {
        this.situacao = situacao;
        return this;
    }

    /**
     * Número do protocolo composto por 36 caracteres alfanuméricos. Este campo é criado pelo sistema e deve ser usado para consulta do resultado.
     *
     * @return numeroProtocolo
     **/
    @JsonProperty("numeroProtocolo")
    public String getNumeroProtocolo() {
        return numeroProtocolo;
    }

    public void setNumeroProtocolo(String numeroProtocolo) {
        this.numeroProtocolo = numeroProtocolo;
    }

    public ProcessamentoDeConsultaDeLotesPelosRgosAnuentes numeroProtocolo(String numeroProtocolo) {
        this.numeroProtocolo = numeroProtocolo;
        return this;
    }

    /**
     * Data e horário do processamento da consulta.&lt;br/&gt;Formato: yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS
     *
     * @return dataHoraProcessamento
     **/
    @JsonProperty("dataHoraProcessamento")
    public OffsetDateTime getDataHoraProcessamento() {
        return dataHoraProcessamento;
    }

    public void setDataHoraProcessamento(OffsetDateTime dataHoraProcessamento) {
        this.dataHoraProcessamento = dataHoraProcessamento;
    }

    public ProcessamentoDeConsultaDeLotesPelosRgosAnuentes dataHoraProcessamento(OffsetDateTime dataHoraProcessamento) {
        this.dataHoraProcessamento = dataHoraProcessamento;
        return this;
    }

    /**
     * Data e horário do envio do Json de consulta.&lt;br/&gt;Formato: yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS
     *
     * @return dataHorarioEnvio
     **/
    @JsonProperty("dataHorarioEnvio")
    public OffsetDateTime getDataHorarioEnvio() {
        return dataHorarioEnvio;
    }

    public void setDataHorarioEnvio(OffsetDateTime dataHorarioEnvio) {
        this.dataHorarioEnvio = dataHorarioEnvio;
    }

    public ProcessamentoDeConsultaDeLotesPelosRgosAnuentes dataHorarioEnvio(OffsetDateTime dataHorarioEnvio) {
        this.dataHorarioEnvio = dataHorarioEnvio;
        return this;
    }

    /**
     * Lista de lotes.
     *
     * @return lotes
     **/
    @JsonProperty("lotes")
    public List<LoteDaConsultaDeLotesPelosRgosAnuentes> getLotes() {
        return lotes;
    }

    public void setLotes(List<LoteDaConsultaDeLotesPelosRgosAnuentes> lotes) {
        this.lotes = lotes;
    }

    public ProcessamentoDeConsultaDeLotesPelosRgosAnuentes lotes(List<LoteDaConsultaDeLotesPelosRgosAnuentes> lotes) {
        this.lotes = lotes;
        return this;
    }

    public ProcessamentoDeConsultaDeLotesPelosRgosAnuentes addLotesItem(LoteDaConsultaDeLotesPelosRgosAnuentes lotesItem) {
        this.lotes.add(lotesItem);
        return this;
    }

    /**
     * Lista de erros.
     *
     * @return erros
     **/
    @JsonProperty("erros")
    public List<ErroNoProcessamento> getErros() {
        return erros;
    }

    public void setErros(List<ErroNoProcessamento> erros) {
        this.erros = erros;
    }

    public ProcessamentoDeConsultaDeLotesPelosRgosAnuentes erros(List<ErroNoProcessamento> erros) {
        this.erros = erros;
        return this;
    }

    public ProcessamentoDeConsultaDeLotesPelosRgosAnuentes addErrosItem(ErroNoProcessamento errosItem) {
        this.erros.add(errosItem);
        return this;
    }

    @Override
    public String toString() {

        String sb = "class ProcessamentoDeConsultaDeLotesPelosRgosAnuentes {\n" +
                "    situacao: " + toIndentedString(situacao) + "\n" +
                "    numeroProtocolo: " + toIndentedString(numeroProtocolo) + "\n" +
                "    dataHoraProcessamento: " + toIndentedString(dataHoraProcessamento) + "\n" +
                "    dataHorarioEnvio: " + toIndentedString(dataHorarioEnvio) + "\n" +
                "    lotes: " + toIndentedString(lotes) + "\n" +
                "    erros: " + toIndentedString(erros) + "\n" +
                "}";
        return sb;
    }
}
