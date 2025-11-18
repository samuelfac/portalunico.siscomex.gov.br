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
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcessamentoDaSolicitaoDeDevoluo", propOrder =
        {"cnpj", "dataHoraProcessamento", "dataHorarioEnvio", "dataHorarioRegistroDevolucao", "erros", "manifestos", "numeroDevolucao", "numeroProtocolo", "situacao"
        })

@XmlRootElement(name = "ProcessamentoDaSolicitaoDeDevoluo")
public class ProcessamentoDaSolicitaoDeDevoluo {

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

    @XmlElement(name = "dataHorarioRegistroDevolucao", required = true)
    @ApiModelProperty(required = true, value = "Data e horário do registro do pedido de devolução no sistema.<br/>Formato: yyyy-MM-dd'T'HH:mm:ss.SSS")
    /**
     * Data e horário do registro do pedido de devolução no sistema.<br/>Formato: yyyy-MM-dd'T'HH:mm:ss.SSS
     **/
    private OffsetDateTime dataHorarioRegistroDevolucao = null;

    @XmlElement(name = "erros")
    @ApiModelProperty(value = "Lista de erros.")
    @Valid
    /**
     * Lista de erros.
     **/
    private List<ErroNoProcessamento> erros = null;

    @XmlElement(name = "manifestos", required = true)
    @ApiModelProperty(required = true, value = "Lista de manifestos.")
    @Valid
    /**
     * Lista de manifestos.
     **/
    private List<ManifestoDoProcessamentoDaSolicitaoDeDevoluo> manifestos = new ArrayList<>();

    @XmlElement(name = "numeroDevolucao", required = true)
    @ApiModelProperty(required = true, value = "Número do registro de devolução gerado pelo sistema.")
    /**
     * Número do registro de devolução gerado pelo sistema.
     **/
    private String numeroDevolucao = null;

    @XmlElement(name = "numeroProtocolo", required = true)
    @ApiModelProperty(required = true, value = "Número do protocolo composto por 36 caracteres alfanuméricos. Este campo é criado pelo sistema e deve ser usado para consulta do resultado.")
    /**
     * Número do protocolo composto por 36 caracteres alfanuméricos. Este campo é criado pelo sistema e deve ser usado para consulta do resultado.
     **/
    private String numeroProtocolo = null;

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

    public ProcessamentoDaSolicitaoDeDevoluo dataHoraProcessamento(OffsetDateTime dataHoraProcessamento) {
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

    public ProcessamentoDaSolicitaoDeDevoluo dataHorarioEnvio(OffsetDateTime dataHorarioEnvio) {
        this.dataHorarioEnvio = dataHorarioEnvio;
        return this;
    }

    public ProcessamentoDaSolicitaoDeDevoluo cnpj(String cnpj) {
        this.cnpj = cnpj;
        return this;
    }

    /**
     * Data e horário do registro do pedido de devolução no sistema.&lt;br/&gt;Formato: yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS
     *
     * @return dataHorarioRegistroDevolucao
     **/
    @JsonProperty("dataHorarioRegistroDevolucao")
    @NotNull
    public OffsetDateTime getDataHorarioRegistroDevolucao() {
        return dataHorarioRegistroDevolucao;
    }

    public void setDataHorarioRegistroDevolucao(OffsetDateTime dataHorarioRegistroDevolucao) {
        this.dataHorarioRegistroDevolucao = dataHorarioRegistroDevolucao;
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

    public ProcessamentoDaSolicitaoDeDevoluo erros(List<ErroNoProcessamento> erros) {
        this.erros = erros;
        return this;
    }

    public ProcessamentoDaSolicitaoDeDevoluo addErrosItem(ErroNoProcessamento errosItem) {
        this.erros.add(errosItem);
        return this;
    }

    public ProcessamentoDaSolicitaoDeDevoluo dataHorarioRegistroDevolucao(OffsetDateTime dataHorarioRegistroDevolucao) {
        this.dataHorarioRegistroDevolucao = dataHorarioRegistroDevolucao;
        return this;
    }

    /**
     * Lista de manifestos.
     *
     * @return manifestos
     **/
    @JsonProperty("manifestos")
    @NotNull
    public List<ManifestoDoProcessamentoDaSolicitaoDeDevoluo> getManifestos() {
        return manifestos;
    }

    public void setManifestos(List<ManifestoDoProcessamentoDaSolicitaoDeDevoluo> manifestos) {
        this.manifestos = manifestos;
    }

    public ProcessamentoDaSolicitaoDeDevoluo manifestos(List<ManifestoDoProcessamentoDaSolicitaoDeDevoluo> manifestos) {
        this.manifestos = manifestos;
        return this;
    }

    public ProcessamentoDaSolicitaoDeDevoluo addManifestosItem(ManifestoDoProcessamentoDaSolicitaoDeDevoluo manifestosItem) {
        this.manifestos.add(manifestosItem);
        return this;
    }

    /**
     * Número do registro de devolução gerado pelo sistema.
     *
     * @return numeroDevolucao
     **/
    @JsonProperty("numeroDevolucao")
    @NotNull
    public String getNumeroDevolucao() {
        return numeroDevolucao;
    }

    public void setNumeroDevolucao(String numeroDevolucao) {
        this.numeroDevolucao = numeroDevolucao;
    }

    public ProcessamentoDaSolicitaoDeDevoluo numeroDevolucao(String numeroDevolucao) {
        this.numeroDevolucao = numeroDevolucao;
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

    public ProcessamentoDaSolicitaoDeDevoluo numeroProtocolo(String numeroProtocolo) {
        this.numeroProtocolo = numeroProtocolo;
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

    public ProcessamentoDaSolicitaoDeDevoluo situacao(Integer situacao) {
        this.situacao = situacao;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class ProcessamentoDaSolicitaoDeDevoluo {\n" +
                "    cnpj: " + toIndentedString(cnpj) + "\n" +
                "    dataHoraProcessamento: " + toIndentedString(dataHoraProcessamento) + "\n" +
                "    dataHorarioEnvio: " + toIndentedString(dataHorarioEnvio) + "\n" +
                "    dataHorarioRegistroDevolucao: " + toIndentedString(dataHorarioRegistroDevolucao) + "\n" +
                "    erros: " + toIndentedString(erros) + "\n" +
                "    manifestos: " + toIndentedString(manifestos) + "\n" +
                "    numeroDevolucao: " + toIndentedString(numeroDevolucao) + "\n" +
                "    numeroProtocolo: " + toIndentedString(numeroProtocolo) + "\n" +
                "    situacao: " + toIndentedString(situacao) + "\n" +
                "}";
        return sb;
    }
}
