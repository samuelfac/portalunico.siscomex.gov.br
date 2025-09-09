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
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcessamentoDaSolicitaoDeDARF", propOrder =
        {"dataHoraEmissao", "situacao", "codigoBarrasCampo4", "dataHoraProcessamento", "codigoBarrasDarf", "dataLimitePagamento", "cnpj", "contribuinte", "erros", "valorTotalPagamento", "numeroProtocolo", "codigoBarrasCampo2", "dataHorarioEnvio", "codigoBarrasCampo3", "codigoBarrasCampo1", "numeroDocumento"
        })

@XmlRootElement(name = "ProcessamentoDaSolicitaoDeDARF")
public class ProcessamentoDaSolicitaoDeDARF {

    @XmlElement(name = "dataHoraEmissao")
    @ApiModelProperty(value = "Data/Hora do momento da emissão do documento pelo SENDA. <br/>Formato: yyyy-MM-dd'T'HH:mm:ss.SSS")
    /**
     * Data/Hora do momento da emissão do documento pelo SENDA. <br/>Formato: yyyy-MM-dd'T'HH:mm:ss.SSS
     **/
    private OffsetDateTime dataHoraEmissao = null;

    @XmlElement(name = "situacao", required = true)
    @ApiModelProperty(required = true, value = "Situacao do processamento. Valores pré-definidos:<br/>0 - Aguardando processamento;<br/>1 - Processamento concluído.")
    /**
     * Situacao do processamento. Valores pré-definidos:<br/>0 - Aguardando processamento;<br/>1 - Processamento concluído.
     **/
    private Integer situacao = null;

    @XmlElement(name = "codigoBarrasCampo4")
    @ApiModelProperty(value = " Quarta parte do código de barras do DARF, composto por 12 caracteres numéricos.")
    /**
     *  Quarta parte do código de barras do DARF, composto por 12 caracteres numéricos.
     **/
    private String codigoBarrasCampo4 = null;

    @XmlElement(name = "dataHoraProcessamento")
    @ApiModelProperty(value = "Data e horário do processamento da consulta.<br/>Formato: yyyy-MM-dd'T'HH:mm:ss.SSS")
    /**
     * Data e horário do processamento da consulta.<br/>Formato: yyyy-MM-dd'T'HH:mm:ss.SSS
     **/
    private OffsetDateTime dataHoraProcessamento = null;

    @XmlElement(name = "codigoBarrasDarf")
    @ApiModelProperty(value = "O número do código de barras completo é composto por 44 caracteres numéricos, ou seja, sem os DV dos quatro campos da barra.")
    /**
     * O número do código de barras completo é composto por 44 caracteres numéricos, ou seja, sem os DV dos quatro campos da barra.
     **/
    private String codigoBarrasDarf = null;

    @XmlElement(name = "dataLimitePagamento")
    @ApiModelProperty(value = "Data limite para pagamento do DARF, preenchida com o valor idêntico à data de venciomento.")
    /**
     * Data limite para pagamento do DARF, preenchida com o valor idêntico à data de venciomento.
     **/
    private OffsetDateTime dataLimitePagamento = null;

    @XmlElement(name = "cnpj", required = true)
    @ApiModelProperty(required = true, value = "CNPJ da empresa responsável composto por 14 caracteres numéricos. Não deve conter caracteres como '.', '-' e '/'.")
    /**
     * CNPJ da empresa responsável composto por 14 caracteres numéricos. Não deve conter caracteres como '.', '-' e '/'.
     **/
    private String cnpj = null;

    @XmlElement(name = "contribuinte", required = true)
    @ApiModelProperty(required = true, value = "CPF ou CNPJ do contribuinte. Composto por onze (11) para CPF ou quatorze (14) caracteres numéricos para CNPJ. Não deve conter caracteres como ‘.’,’-‘ e ‘/’.")
    /**
     * CPF ou CNPJ do contribuinte. Composto por onze (11) para CPF ou quatorze (14) caracteres numéricos para CNPJ. Não deve conter caracteres como ‘.’,’-‘ e ‘/’.
     **/
    private String contribuinte = null;

    @XmlElement(name = "erros")
    @ApiModelProperty(value = "Lista de erros.")
    @Valid
    /**
     * Lista de erros.
     **/
    private List<ErroNoProcessamento> erros = null;

    @XmlElement(name = "valorTotalPagamento", required = true)
    @ApiModelProperty(required = true, value = "Valor total a ser pago pelo DARF. Número fracionário, aceitando no máximo até 10 dígitos antes do ponto e 2 dígitos após o ponto.")
    @Valid
    /**
     * Valor total a ser pago pelo DARF. Número fracionário, aceitando no máximo até 10 dígitos antes do ponto e 2 dígitos após o ponto.
     **/
    private BigDecimal valorTotalPagamento = null;

    @XmlElement(name = "numeroProtocolo", required = true)
    @ApiModelProperty(required = true, value = "Número do protocolo composto por 36 caracteres alfanuméricos. Este campo é criado pelo sistema e deve ser usado para consulta do resultado.")
    /**
     * Número do protocolo composto por 36 caracteres alfanuméricos. Este campo é criado pelo sistema e deve ser usado para consulta do resultado.
     **/
    private String numeroProtocolo = null;

    @XmlElement(name = "codigoBarrasCampo2")
    @ApiModelProperty(value = " Segunda parte do código de barras do DARF, composto por 12 caracteres numéricos.")
    /**
     *  Segunda parte do código de barras do DARF, composto por 12 caracteres numéricos.
     **/
    private String codigoBarrasCampo2 = null;

    @XmlElement(name = "dataHorarioEnvio", required = true)
    @ApiModelProperty(required = true, value = "Data e horário do envio do Json de consulta.<br/>Formato: yyyy-MM-dd'T'HH:mm:ss.SSS")
    /**
     * Data e horário do envio do Json de consulta.<br/>Formato: yyyy-MM-dd'T'HH:mm:ss.SSS
     **/
    private OffsetDateTime dataHorarioEnvio = null;

    @XmlElement(name = "codigoBarrasCampo3")
    @ApiModelProperty(value = " Terceira parte do código de barras do DARF, composto por 12 caracteres numéricos.")
    /**
     *  Terceira parte do código de barras do DARF, composto por 12 caracteres numéricos.
     **/
    private String codigoBarrasCampo3 = null;

    @XmlElement(name = "codigoBarrasCampo1")
    @ApiModelProperty(value = " Primeira parte do código de barras do DARF, composto por 12 caracteres numéricos.")
    /**
     *  Primeira parte do código de barras do DARF, composto por 12 caracteres numéricos.
     **/
    private String codigoBarrasCampo1 = null;

    @XmlElement(name = "numeroDocumento", required = true)
    @ApiModelProperty(required = true, value = "Número do documento gerado pelo SENDA.  O número do documento é composto por 17 caracteres numéricos.")
    /**
     * Número do documento gerado pelo SENDA.  O número do documento é composto por 17 caracteres numéricos.
     **/
    private String numeroDocumento = null;

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
     * Data/Hora do momento da emissão do documento pelo SENDA. &lt;br/&gt;Formato: yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS
     *
     * @return dataHoraEmissao
     **/
    @JsonProperty("dataHoraEmissao")
    public OffsetDateTime getDataHoraEmissao() {
        return dataHoraEmissao;
    }

    public void setDataHoraEmissao(OffsetDateTime dataHoraEmissao) {
        this.dataHoraEmissao = dataHoraEmissao;
    }

    public ProcessamentoDaSolicitaoDeDARF dataHoraEmissao(OffsetDateTime dataHoraEmissao) {
        this.dataHoraEmissao = dataHoraEmissao;
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

    public ProcessamentoDaSolicitaoDeDARF situacao(Integer situacao) {
        this.situacao = situacao;
        return this;
    }

    /**
     * Quarta parte do código de barras do DARF, composto por 12 caracteres numéricos.
     *
     * @return codigoBarrasCampo4
     **/
    @JsonProperty("codigoBarrasCampo4")
    public String getCodigoBarrasCampo4() {
        return codigoBarrasCampo4;
    }

    public void setCodigoBarrasCampo4(String codigoBarrasCampo4) {
        this.codigoBarrasCampo4 = codigoBarrasCampo4;
    }

    public ProcessamentoDaSolicitaoDeDARF codigoBarrasCampo4(String codigoBarrasCampo4) {
        this.codigoBarrasCampo4 = codigoBarrasCampo4;
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

    public ProcessamentoDaSolicitaoDeDARF dataHoraProcessamento(OffsetDateTime dataHoraProcessamento) {
        this.dataHoraProcessamento = dataHoraProcessamento;
        return this;
    }

    /**
     * O número do código de barras completo é composto por 44 caracteres numéricos, ou seja, sem os DV dos quatro campos da barra.
     *
     * @return codigoBarrasDarf
     **/
    @JsonProperty("codigoBarrasDarf")
    public String getCodigoBarrasDarf() {
        return codigoBarrasDarf;
    }

    public void setCodigoBarrasDarf(String codigoBarrasDarf) {
        this.codigoBarrasDarf = codigoBarrasDarf;
    }

    public ProcessamentoDaSolicitaoDeDARF codigoBarrasDarf(String codigoBarrasDarf) {
        this.codigoBarrasDarf = codigoBarrasDarf;
        return this;
    }

    /**
     * Data limite para pagamento do DARF, preenchida com o valor idêntico à data de venciomento.
     *
     * @return dataLimitePagamento
     **/
    @JsonProperty("dataLimitePagamento")
    public OffsetDateTime getDataLimitePagamento() {
        return dataLimitePagamento;
    }

    public void setDataLimitePagamento(OffsetDateTime dataLimitePagamento) {
        this.dataLimitePagamento = dataLimitePagamento;
    }

    public ProcessamentoDaSolicitaoDeDARF dataLimitePagamento(OffsetDateTime dataLimitePagamento) {
        this.dataLimitePagamento = dataLimitePagamento;
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

    public ProcessamentoDaSolicitaoDeDARF cnpj(String cnpj) {
        this.cnpj = cnpj;
        return this;
    }

    /**
     * CPF ou CNPJ do contribuinte. Composto por onze (11) para CPF ou quatorze (14) caracteres numéricos para CNPJ. Não deve conter caracteres como ‘.’,’-‘ e ‘/’.
     *
     * @return contribuinte
     **/
    @JsonProperty("contribuinte")
    @NotNull
    public String getContribuinte() {
        return contribuinte;
    }

    public void setContribuinte(String contribuinte) {
        this.contribuinte = contribuinte;
    }

    public ProcessamentoDaSolicitaoDeDARF contribuinte(String contribuinte) {
        this.contribuinte = contribuinte;
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

    public ProcessamentoDaSolicitaoDeDARF erros(List<ErroNoProcessamento> erros) {
        this.erros = erros;
        return this;
    }

    public ProcessamentoDaSolicitaoDeDARF addErrosItem(ErroNoProcessamento errosItem) {
        this.erros.add(errosItem);
        return this;
    }

    /**
     * Valor total a ser pago pelo DARF. Número fracionário, aceitando no máximo até 10 dígitos antes do ponto e 2 dígitos após o ponto.
     *
     * @return valorTotalPagamento
     **/
    @JsonProperty("valorTotalPagamento")
    @NotNull
    public BigDecimal getValorTotalPagamento() {
        return valorTotalPagamento;
    }

    public void setValorTotalPagamento(BigDecimal valorTotalPagamento) {
        this.valorTotalPagamento = valorTotalPagamento;
    }

    public ProcessamentoDaSolicitaoDeDARF valorTotalPagamento(BigDecimal valorTotalPagamento) {
        this.valorTotalPagamento = valorTotalPagamento;
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

    public ProcessamentoDaSolicitaoDeDARF numeroProtocolo(String numeroProtocolo) {
        this.numeroProtocolo = numeroProtocolo;
        return this;
    }

    /**
     * Segunda parte do código de barras do DARF, composto por 12 caracteres numéricos.
     *
     * @return codigoBarrasCampo2
     **/
    @JsonProperty("codigoBarrasCampo2")
    public String getCodigoBarrasCampo2() {
        return codigoBarrasCampo2;
    }

    public void setCodigoBarrasCampo2(String codigoBarrasCampo2) {
        this.codigoBarrasCampo2 = codigoBarrasCampo2;
    }

    public ProcessamentoDaSolicitaoDeDARF codigoBarrasCampo2(String codigoBarrasCampo2) {
        this.codigoBarrasCampo2 = codigoBarrasCampo2;
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

    public ProcessamentoDaSolicitaoDeDARF dataHorarioEnvio(OffsetDateTime dataHorarioEnvio) {
        this.dataHorarioEnvio = dataHorarioEnvio;
        return this;
    }

    /**
     * Terceira parte do código de barras do DARF, composto por 12 caracteres numéricos.
     *
     * @return codigoBarrasCampo3
     **/
    @JsonProperty("codigoBarrasCampo3")
    public String getCodigoBarrasCampo3() {
        return codigoBarrasCampo3;
    }

    public void setCodigoBarrasCampo3(String codigoBarrasCampo3) {
        this.codigoBarrasCampo3 = codigoBarrasCampo3;
    }

    public ProcessamentoDaSolicitaoDeDARF codigoBarrasCampo3(String codigoBarrasCampo3) {
        this.codigoBarrasCampo3 = codigoBarrasCampo3;
        return this;
    }

    /**
     * Primeira parte do código de barras do DARF, composto por 12 caracteres numéricos.
     *
     * @return codigoBarrasCampo1
     **/
    @JsonProperty("codigoBarrasCampo1")
    public String getCodigoBarrasCampo1() {
        return codigoBarrasCampo1;
    }

    public void setCodigoBarrasCampo1(String codigoBarrasCampo1) {
        this.codigoBarrasCampo1 = codigoBarrasCampo1;
    }

    public ProcessamentoDaSolicitaoDeDARF codigoBarrasCampo1(String codigoBarrasCampo1) {
        this.codigoBarrasCampo1 = codigoBarrasCampo1;
        return this;
    }

    /**
     * Número do documento gerado pelo SENDA.  O número do documento é composto por 17 caracteres numéricos.
     *
     * @return numeroDocumento
     **/
    @JsonProperty("numeroDocumento")
    @NotNull
    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public ProcessamentoDaSolicitaoDeDARF numeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class ProcessamentoDaSolicitaoDeDARF {\n" +
                "    dataHoraEmissao: " + toIndentedString(dataHoraEmissao) + "\n" +
                "    situacao: " + toIndentedString(situacao) + "\n" +
                "    codigoBarrasCampo4: " + toIndentedString(codigoBarrasCampo4) + "\n" +
                "    dataHoraProcessamento: " + toIndentedString(dataHoraProcessamento) + "\n" +
                "    codigoBarrasDarf: " + toIndentedString(codigoBarrasDarf) + "\n" +
                "    dataLimitePagamento: " + toIndentedString(dataLimitePagamento) + "\n" +
                "    cnpj: " + toIndentedString(cnpj) + "\n" +
                "    contribuinte: " + toIndentedString(contribuinte) + "\n" +
                "    erros: " + toIndentedString(erros) + "\n" +
                "    valorTotalPagamento: " + toIndentedString(valorTotalPagamento) + "\n" +
                "    numeroProtocolo: " + toIndentedString(numeroProtocolo) + "\n" +
                "    codigoBarrasCampo2: " + toIndentedString(codigoBarrasCampo2) + "\n" +
                "    dataHorarioEnvio: " + toIndentedString(dataHorarioEnvio) + "\n" +
                "    codigoBarrasCampo3: " + toIndentedString(codigoBarrasCampo3) + "\n" +
                "    codigoBarrasCampo1: " + toIndentedString(codigoBarrasCampo1) + "\n" +
                "    numeroDocumento: " + toIndentedString(numeroDocumento) + "\n" +
                "}";
        return sb;
    }
}
