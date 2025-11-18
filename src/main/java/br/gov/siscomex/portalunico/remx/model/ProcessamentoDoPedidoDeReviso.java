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
@XmlType(name = "ProcessamentoDoPedidoDeReviso", propOrder =
        {"cnpj", "dataHoraProcessamento", "dataHorarioEnvio", "dataHorarioRegistroPedidoRevisao", "erros", "manifestos", "numeroPedidoRevisao", "numeroProtocolo", "situacao"
        })

@XmlRootElement(name = "ProcessamentoDoPedidoDeReviso")
public class ProcessamentoDoPedidoDeReviso {

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

    @XmlElement(name = "dataHorarioRegistroPedidoRevisao", required = true)
    @ApiModelProperty(required = true, value = "Data e horário do registro do pedido de revisão no sistema.<br/>Formato: yyyy-MM-dd'T'HH:mm:ss.SSS")
    /**
     * Data e horário do registro do pedido de revisão no sistema.<br/>Formato: yyyy-MM-dd'T'HH:mm:ss.SSS
     **/
    private OffsetDateTime dataHorarioRegistroPedidoRevisao = null;

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
    private List<ManifestoDoProcessamentoDoPedidoDeReviso> manifestos = new ArrayList<>();

    @XmlElement(name = "numeroPedidoRevisao", required = true)
    @ApiModelProperty(required = true, value = "Número do pedido de revisão gerado pelo sistema.")
    /**
     * Número do pedido de revisão gerado pelo sistema.
     **/
    private String numeroPedidoRevisao = null;

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

    public ProcessamentoDoPedidoDeReviso dataHoraProcessamento(OffsetDateTime dataHoraProcessamento) {
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

    public ProcessamentoDoPedidoDeReviso dataHorarioEnvio(OffsetDateTime dataHorarioEnvio) {
        this.dataHorarioEnvio = dataHorarioEnvio;
        return this;
    }

    /**
     * Data e horário do registro do pedido de revisão no sistema.&lt;br/&gt;Formato: yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS
     *
     * @return dataHorarioRegistroPedidoRevisao
     **/
    @JsonProperty("dataHorarioRegistroPedidoRevisao")
    @NotNull
    public OffsetDateTime getDataHorarioRegistroPedidoRevisao() {
        return dataHorarioRegistroPedidoRevisao;
    }

    public void setDataHorarioRegistroPedidoRevisao(OffsetDateTime dataHorarioRegistroPedidoRevisao) {
        this.dataHorarioRegistroPedidoRevisao = dataHorarioRegistroPedidoRevisao;
    }

    public ProcessamentoDoPedidoDeReviso dataHorarioRegistroPedidoRevisao(OffsetDateTime dataHorarioRegistroPedidoRevisao) {
        this.dataHorarioRegistroPedidoRevisao = dataHorarioRegistroPedidoRevisao;
        return this;
    }

    public ProcessamentoDoPedidoDeReviso cnpj(String cnpj) {
        this.cnpj = cnpj;
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

    public ProcessamentoDoPedidoDeReviso erros(List<ErroNoProcessamento> erros) {
        this.erros = erros;
        return this;
    }

    public ProcessamentoDoPedidoDeReviso addErrosItem(ErroNoProcessamento errosItem) {
        this.erros.add(errosItem);
        return this;
    }

    /**
     * Lista de manifestos.
     *
     * @return manifestos
     **/
    @JsonProperty("manifestos")
    @NotNull
    public List<ManifestoDoProcessamentoDoPedidoDeReviso> getManifestos() {
        return manifestos;
    }

    public void setManifestos(List<ManifestoDoProcessamentoDoPedidoDeReviso> manifestos) {
        this.manifestos = manifestos;
    }

    public ProcessamentoDoPedidoDeReviso manifestos(List<ManifestoDoProcessamentoDoPedidoDeReviso> manifestos) {
        this.manifestos = manifestos;
        return this;
    }

    /**
     * Número do pedido de revisão gerado pelo sistema.
     *
     * @return numeroPedidoRevisao
     **/
    @JsonProperty("numeroPedidoRevisao")
    @NotNull
    public String getNumeroPedidoRevisao() {
        return numeroPedidoRevisao;
    }

    public void setNumeroPedidoRevisao(String numeroPedidoRevisao) {
        this.numeroPedidoRevisao = numeroPedidoRevisao;
    }

    public ProcessamentoDoPedidoDeReviso numeroPedidoRevisao(String numeroPedidoRevisao) {
        this.numeroPedidoRevisao = numeroPedidoRevisao;
        return this;
    }

    public ProcessamentoDoPedidoDeReviso addManifestosItem(ManifestoDoProcessamentoDoPedidoDeReviso manifestosItem) {
        this.manifestos.add(manifestosItem);
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

    public ProcessamentoDoPedidoDeReviso numeroProtocolo(String numeroProtocolo) {
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

    public ProcessamentoDoPedidoDeReviso situacao(Integer situacao) {
        this.situacao = situacao;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class ProcessamentoDoPedidoDeReviso {\n" +
                "    cnpj: " + toIndentedString(cnpj) + "\n" +
                "    dataHoraProcessamento: " + toIndentedString(dataHoraProcessamento) + "\n" +
                "    dataHorarioEnvio: " + toIndentedString(dataHorarioEnvio) + "\n" +
                "    dataHorarioRegistroPedidoRevisao: " + toIndentedString(dataHorarioRegistroPedidoRevisao) + "\n" +
                "    erros: " + toIndentedString(erros) + "\n" +
                "    manifestos: " + toIndentedString(manifestos) + "\n" +
                "    numeroPedidoRevisao: " + toIndentedString(numeroPedidoRevisao) + "\n" +
                "    numeroProtocolo: " + toIndentedString(numeroProtocolo) + "\n" +
                "    situacao: " + toIndentedString(situacao) + "\n" +
                "}";
        return sb;
    }
}
