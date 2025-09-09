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
@XmlType(name = "ProcessamentoDoCancelamentoDeDARF", propOrder =
        {"situacao", "numeroProtocolo", "dataHoraProcessamento", "codigoBarrasDarf", "dataHorarioEnvio", "cnpj", "erros"
        })

@XmlRootElement(name = "ProcessamentoDoCancelamentoDeDARF")
public class ProcessamentoDoCancelamentoDeDARF {

    @XmlElement(name = "situacao", required = true)
    @ApiModelProperty(required = true, value = "Situacao do processamento. Valores pré-definidos:<br/>0 - Aguardando processamento;<br/>1 - Processamento concluído.")
    /**
     * Situacao do processamento. Valores pré-definidos:<br/>0 - Aguardando processamento;<br/>1 - Processamento concluído.
     **/
    private Integer situacao = null;

    @XmlElement(name = "numeroProtocolo", required = true)
    @ApiModelProperty(required = true, value = "Número do protocolo composto por 36 caracteres alfanuméricos. Este campo é criado pelo sistema e deve ser usado para consulta do resultado.")
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

    @XmlElement(name = "codigoBarrasDarf", required = true)
    @ApiModelProperty(required = true, value = "O número do código de barras completo é composto por 44 caracteres numéricos, ou seja, sem os DV dos quatro campos da barra.")
    /**
     * O número do código de barras completo é composto por 44 caracteres numéricos, ou seja, sem os DV dos quatro campos da barra.
     **/
    private String codigoBarrasDarf = null;

    @XmlElement(name = "dataHorarioEnvio", required = true)
    @ApiModelProperty(required = true, value = "Data e horário do envio do Json de consulta.<br/>Formato: yyyy-MM-dd'T'HH:mm:ss.SSS")
    /**
     * Data e horário do envio do Json de consulta.<br/>Formato: yyyy-MM-dd'T'HH:mm:ss.SSS
     **/
    private OffsetDateTime dataHorarioEnvio = null;

    @XmlElement(name = "cnpj", required = true)
    @ApiModelProperty(required = true, value = "CNPJ da empresa responsável composto por 14 caracteres numéricos. Não deve conter caracteres como '.', '-' e '/'.")
    /**
     * CNPJ da empresa responsável composto por 14 caracteres numéricos. Não deve conter caracteres como '.', '-' e '/'.
     **/
    private String cnpj = null;

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
    @NotNull
    public Integer getSituacao() {
        return situacao;
    }

    public void setSituacao(Integer situacao) {
        this.situacao = situacao;
    }

    public ProcessamentoDoCancelamentoDeDARF situacao(Integer situacao) {
        this.situacao = situacao;
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

    public ProcessamentoDoCancelamentoDeDARF numeroProtocolo(String numeroProtocolo) {
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

    public ProcessamentoDoCancelamentoDeDARF dataHoraProcessamento(OffsetDateTime dataHoraProcessamento) {
        this.dataHoraProcessamento = dataHoraProcessamento;
        return this;
    }

    /**
     * O número do código de barras completo é composto por 44 caracteres numéricos, ou seja, sem os DV dos quatro campos da barra.
     *
     * @return codigoBarrasDarf
     **/
    @JsonProperty("codigoBarrasDarf")
    @NotNull
    public String getCodigoBarrasDarf() {
        return codigoBarrasDarf;
    }

    public void setCodigoBarrasDarf(String codigoBarrasDarf) {
        this.codigoBarrasDarf = codigoBarrasDarf;
    }

    public ProcessamentoDoCancelamentoDeDARF codigoBarrasDarf(String codigoBarrasDarf) {
        this.codigoBarrasDarf = codigoBarrasDarf;
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

    public ProcessamentoDoCancelamentoDeDARF dataHorarioEnvio(OffsetDateTime dataHorarioEnvio) {
        this.dataHorarioEnvio = dataHorarioEnvio;
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

    public ProcessamentoDoCancelamentoDeDARF cnpj(String cnpj) {
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

    public ProcessamentoDoCancelamentoDeDARF erros(List<ErroNoProcessamento> erros) {
        this.erros = erros;
        return this;
    }

    public ProcessamentoDoCancelamentoDeDARF addErrosItem(ErroNoProcessamento errosItem) {
        this.erros.add(errosItem);
        return this;
    }

    @Override
    public String toString() {

        String sb = "class ProcessamentoDoCancelamentoDeDARF {\n" +
                "    situacao: " + toIndentedString(situacao) + "\n" +
                "    numeroProtocolo: " + toIndentedString(numeroProtocolo) + "\n" +
                "    dataHoraProcessamento: " + toIndentedString(dataHoraProcessamento) + "\n" +
                "    codigoBarrasDarf: " + toIndentedString(codigoBarrasDarf) + "\n" +
                "    dataHorarioEnvio: " + toIndentedString(dataHorarioEnvio) + "\n" +
                "    cnpj: " + toIndentedString(cnpj) + "\n" +
                "    erros: " + toIndentedString(erros) + "\n" +
                "}";
        return sb;
    }
}
