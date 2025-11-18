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
@XmlType(name = "ProcessamentoDoRegistroOuRetificaoDoManifestoDeCarga", propOrder =
        {"cnpj", "dataHoraProcessamento", "dataHorarioEnvio", "dataHorarioRegistroManifesto", "erros", "numeroManifesto", "numeroProtocolo", "sequencialManifesto", "situacao"
        })

@XmlRootElement(name = "ProcessamentoDoRegistroOuRetificaoDoManifestoDeCarga")
public class ProcessamentoDoRegistroOuRetificaoDoManifestoDeCarga {

    @XmlElement(name = "cnpj", required = true)
    @ApiModelProperty(required = true, value = "CNPJ da empresa responsável composto por 14 caracteres numéricos. Não deve conter caracteres como '.', '-' e '/'.")
    /**
     * CNPJ da empresa responsável composto por 14 caracteres numéricos. Não deve conter caracteres como '.', '-' e '/'.
     **/
    private String cnpj = null;

    @XmlElement(name = "dataHoraProcessamento")
    @ApiModelProperty(value = "Data e horário do processamento da consulta.<br/>Formato: yyyy-MM-dd'T'HH:mm:ss.SSS")
    /**
     * Data e horário do processamento da consulta.<br/>Formato: yyyy-MM-dd'T'HH:mm:ss.SSS
     **/
    private OffsetDateTime dataHoraProcessamento = null;

    @XmlElement(name = "dataHorarioEnvio", required = true)
    @ApiModelProperty(required = true, value = "Data e horário do envio do Json de consulta.<br/>Formato: yyyy-MM-dd'T'HH:mm:ss.SSS")
    /**
     * Data e horário do envio do Json de consulta.<br/>Formato: yyyy-MM-dd'T'HH:mm:ss.SSS
     **/
    private OffsetDateTime dataHorarioEnvio = null;

    @XmlElement(name = "dataHorarioRegistroManifesto")
    @ApiModelProperty(value = "Data e horário do registro do manifesto de carga.<br/>Formato: yyyy-MM-dd'T'HH:mm:ss.SSS")
    /**
     * Data e horário do registro do manifesto de carga.<br/>Formato: yyyy-MM-dd'T'HH:mm:ss.SSS
     **/
    private OffsetDateTime dataHorarioRegistroManifesto = null;

    @XmlElement(name = "erros")
    @ApiModelProperty(value = "Lista de erros.")
    @Valid
    /**
     * Lista de erros.
     **/
    private List<ErroNoProcessamento> erros = null;

    @XmlElement(name = "numeroManifesto", required = true)
    @ApiModelProperty(required = true, value = "Número do manifesto composto por 15 caracteres alfanuméricos. Este campo é criado pelo sistema quando é feito o registro do manifesto de carga para modalidade expressa ou registro do lote de declaração para modalidade postal.")
    /**
     * Número do manifesto composto por 15 caracteres alfanuméricos. Este campo é criado pelo sistema quando é feito o registro do manifesto de carga para modalidade expressa ou registro do lote de declaração para modalidade postal.
     **/
    private String numeroManifesto = null;

    @XmlElement(name = "numeroProtocolo", required = true)
    @ApiModelProperty(required = true, value = "Número do protocolo composto por 36 caracteres alfanuméricos. Este campo é criado pelo sistema e deve ser usado para consulta do resultado.")
    /**
     * Número do protocolo composto por 36 caracteres alfanuméricos. Este campo é criado pelo sistema e deve ser usado para consulta do resultado.
     **/
    private String numeroProtocolo = null;

    @XmlElement(name = "sequencialManifesto", required = true)
    @ApiModelProperty(required = true, value = "Número sequencial do manifesto enviado pelo operador para uma determinada UA de despacho em um determinado dia. O sequencial do manifesto é composto por 5 dígitos numéricos.")
    /**
     * Número sequencial do manifesto enviado pelo operador para uma determinada UA de despacho em um determinado dia. O sequencial do manifesto é composto por 5 dígitos numéricos.
     **/
    private String sequencialManifesto = null;

    @XmlElement(name = "situacao", required = true)
    @ApiModelProperty(required = true, value = "Situacao do processamento. Valores pré-definidos:<br/>0 - Aguardando processamento;<br/>1 - Processamento concluído.")
    /**
     * Situacao do processamento. Valores pré-definidos:<br/>0 - Aguardando processamento;<br/>1 - Processamento concluído.
     **/
    private Integer situacao = null;

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

    public ProcessamentoDoRegistroOuRetificaoDoManifestoDeCarga dataHoraProcessamento(OffsetDateTime dataHoraProcessamento) {
        this.dataHoraProcessamento = dataHoraProcessamento;
        return this;
    }

    /**
     * Data e horário do envio do Json de consulta.&lt;br/&gt;Formato: yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS
     *
     * @return dataHorarioEnvio
     **/
    @JsonProperty("dataHorarioEnvio")
    @NotNull
    public OffsetDateTime getDataHorarioEnvio() {
        return dataHorarioEnvio;
    }

    public void setDataHorarioEnvio(OffsetDateTime dataHorarioEnvio) {
        this.dataHorarioEnvio = dataHorarioEnvio;
    }

    public ProcessamentoDoRegistroOuRetificaoDoManifestoDeCarga dataHorarioEnvio(OffsetDateTime dataHorarioEnvio) {
        this.dataHorarioEnvio = dataHorarioEnvio;
        return this;
    }

    public ProcessamentoDoRegistroOuRetificaoDoManifestoDeCarga cnpj(String cnpj) {
        this.cnpj = cnpj;
        return this;
    }

    /**
     * Data e horário do registro do manifesto de carga.&lt;br/&gt;Formato: yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS
     *
     * @return dataHorarioRegistroManifesto
     **/
    @JsonProperty("dataHorarioRegistroManifesto")
    public OffsetDateTime getDataHorarioRegistroManifesto() {
        return dataHorarioRegistroManifesto;
    }

    public void setDataHorarioRegistroManifesto(OffsetDateTime dataHorarioRegistroManifesto) {
        this.dataHorarioRegistroManifesto = dataHorarioRegistroManifesto;
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

    public ProcessamentoDoRegistroOuRetificaoDoManifestoDeCarga erros(List<ErroNoProcessamento> erros) {
        this.erros = erros;
        return this;
    }

    public ProcessamentoDoRegistroOuRetificaoDoManifestoDeCarga addErrosItem(ErroNoProcessamento errosItem) {
        this.erros.add(errosItem);
        return this;
    }

    public ProcessamentoDoRegistroOuRetificaoDoManifestoDeCarga dataHorarioRegistroManifesto(OffsetDateTime dataHorarioRegistroManifesto) {
        this.dataHorarioRegistroManifesto = dataHorarioRegistroManifesto;
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

    public ProcessamentoDoRegistroOuRetificaoDoManifestoDeCarga numeroManifesto(String numeroManifesto) {
        this.numeroManifesto = numeroManifesto;
        return this;
    }

    /**
     * Número do protocolo composto por 36 caracteres alfanuméricos. Este campo é criado pelo sistema e deve ser usado para consulta do resultado.
     *
     * @return numeroProtocolo
     **/
    @JsonProperty("numeroProtocolo")
    @NotNull
    public String getNumeroProtocolo() {
        return numeroProtocolo;
    }

    public void setNumeroProtocolo(String numeroProtocolo) {
        this.numeroProtocolo = numeroProtocolo;
    }

    public ProcessamentoDoRegistroOuRetificaoDoManifestoDeCarga numeroProtocolo(String numeroProtocolo) {
        this.numeroProtocolo = numeroProtocolo;
        return this;
    }

    /**
     * Número sequencial do manifesto enviado pelo operador para uma determinada UA de despacho em um determinado dia. O sequencial do manifesto é composto por 5 dígitos numéricos.
     *
     * @return sequencialManifesto
     **/
    @JsonProperty("sequencialManifesto")
    @NotNull
    public String getSequencialManifesto() {
        return sequencialManifesto;
    }

    public void setSequencialManifesto(String sequencialManifesto) {
        this.sequencialManifesto = sequencialManifesto;
    }

    public ProcessamentoDoRegistroOuRetificaoDoManifestoDeCarga sequencialManifesto(String sequencialManifesto) {
        this.sequencialManifesto = sequencialManifesto;
        return this;
    }

    /**
     * Situacao do processamento. Valores pré-definidos:&lt;br/&gt;0 - Aguardando processamento;&lt;br/&gt;1 - Processamento concluído.
     *
     * @return situacao
     **/
    @JsonProperty("situacao")
    @NotNull
    public Integer getSituacao() {
        return situacao;
    }

    public void setSituacao(Integer situacao) {
        this.situacao = situacao;
    }

    public ProcessamentoDoRegistroOuRetificaoDoManifestoDeCarga situacao(Integer situacao) {
        this.situacao = situacao;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class ProcessamentoDoRegistroOuRetificaoDoManifestoDeCarga {\n" +
                "    cnpj: " + toIndentedString(cnpj) + "\n" +
                "    dataHoraProcessamento: " + toIndentedString(dataHoraProcessamento) + "\n" +
                "    dataHorarioEnvio: " + toIndentedString(dataHorarioEnvio) + "\n" +
                "    dataHorarioRegistroManifesto: " + toIndentedString(dataHorarioRegistroManifesto) + "\n" +
                "    erros: " + toIndentedString(erros) + "\n" +
                "    numeroManifesto: " + toIndentedString(numeroManifesto) + "\n" +
                "    numeroProtocolo: " + toIndentedString(numeroProtocolo) + "\n" +
                "    sequencialManifesto: " + toIndentedString(sequencialManifesto) + "\n" +
                "    situacao: " + toIndentedString(situacao) + "\n" +
                "}";
        return sb;
    }
}
