package br.gov.siscomex.portalunico.duex.model;

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
@XmlType(name = "ExigenciaFiscalEstruturada", propOrder =
        {"matriculaServidorRespLiberacao", "numeroExigencia", "situacao", "itemDue", "orgao", "listaFundamentoLegal", "dataRegistro", "matriculaServidorResp", "valorRecolherMulta", "observacaoAtendimento", "versaoDocumento", "descricaoComplementar", "descricaoExigencia", "dataLiberacao", "justificativaDispensa", "numeroDocumento", "ncmSugerida"
        })

@XmlRootElement(name = "ExigenciaFiscalEstruturada")
public class ExigenciaFiscalEstruturada {

    @XmlElement(name = "matriculaServidorRespLiberacao")
    @ApiModelProperty(value = "Matrícula servidor do servidor responsável pela dispensa ou atendimento da exigência<br />Tamanho mínimo: 0<br />Tamanho máximo: 15")
    /**
     * Matrícula servidor do servidor responsável pela dispensa ou atendimento da exigência<br />Tamanho mínimo: 0<br />Tamanho máximo: 15
     **/
    private String matriculaServidorRespLiberacao = null;

    @XmlElement(name = "numeroExigencia")
    @ApiModelProperty(value = "Número de ordem da exigência<br />Formato: Inteiro, com até 3 digitos")
    /**
     * Número de ordem da exigência<br />Formato: Inteiro, com até 3 digitos
     **/
    private Integer numeroExigencia = null;

    @XmlElement(name = "situacao")
    @ApiModelProperty(value = "")
    @Valid
    private SituacaoExigenciaFiscalDTO situacao = null;

    @XmlElement(name = "itemDue")
    @ApiModelProperty(value = "")
    @Valid
    private ItemDueExigenciaFiscalDTO itemDue = null;

    @XmlElement(name = "orgao")
    @ApiModelProperty(value = "Órgão responsável pela criação da exigência<br />Tamanho mínimo: 1<br />Tamanho máximo: 10")
    /**
     * Órgão responsável pela criação da exigência<br />Tamanho mínimo: 1<br />Tamanho máximo: 10
     **/
    private String orgao = null;

    @XmlElement(name = "listaFundamentoLegal")
    @ApiModelProperty(value = "")
    @Valid
    private List<FundamentoLegalExigenciaFiscalDTO> listaFundamentoLegal = null;

    @XmlElement(name = "dataRegistro")
    @ApiModelProperty(example = "2019-09-20T14:13:46.966Z", value = "Data de registro da exigência<br />Formato:'yyyy-MM-dd'T'HH:mm:ss.SSSZ'")
    /**
     * Data de registro da exigência<br />Formato:'yyyy-MM-dd'T'HH:mm:ss.SSSZ'
     **/
    private OffsetDateTime dataRegistro = null;

    @XmlElement(name = "matriculaServidorResp")
    @ApiModelProperty(value = "Matrícula do servidor responsável pela criação da exigência<br />Tamanho mínimo: 1<br />Tamanho máximo: 15")
    /**
     * Matrícula do servidor responsável pela criação da exigência<br />Tamanho mínimo: 1<br />Tamanho máximo: 15
     **/
    private String matriculaServidorResp = null;

    @XmlElement(name = "valorRecolherMulta")
    @ApiModelProperty(value = "Valor a recolher de Multa<br />Tamanho: 15,2<br />Formato: Decimal, com até 2 casas decimais separadas por ponto.")
    @Valid
    /**
     * Valor a recolher de Multa<br />Tamanho: 15,2<br />Formato: Decimal, com até 2 casas decimais separadas por ponto.
     **/
    private BigDecimal valorRecolherMulta = null;

    @XmlElement(name = "observacaoAtendimento")
    @ApiModelProperty(value = "Observação do servidor ao atender uma exigência<br />Tamanho mínimo: 0<br />Tamanho máximo: 4000")
    /**
     * Observação do servidor ao atender uma exigência<br />Tamanho mínimo: 0<br />Tamanho máximo: 4000
     **/
    private String observacaoAtendimento = null;

    @XmlElement(name = "versaoDocumento")
    @ApiModelProperty(value = "Número da versão da DU-E<br />Formato: Inteiro, com até 10 digitos")
    /**
     * Número da versão da DU-E<br />Formato: Inteiro, com até 10 digitos
     **/
    private Integer versaoDocumento = null;

    @XmlElement(name = "descricaoComplementar")
    @ApiModelProperty(value = "Descrição complementar da exigência<br />Tamanho mínimo: 0<br />Tamanho máximo: 4000")
    /**
     * Descrição complementar da exigência<br />Tamanho mínimo: 0<br />Tamanho máximo: 4000
     **/
    private String descricaoComplementar = null;

    @XmlElement(name = "descricaoExigencia")
    @ApiModelProperty(value = "Texto do modelo da exigência<br />Tamanho mínimo: 1<br />Tamanho máximo: 8000")
    /**
     * Texto do modelo da exigência<br />Tamanho mínimo: 1<br />Tamanho máximo: 8000
     **/
    private String descricaoExigencia = null;

    @XmlElement(name = "dataLiberacao")
    @ApiModelProperty(example = "2019-09-20T14:13:46.966Z", value = "Data do atendimento ou dispensa da exigência<br />Formato:'yyyy-MM-dd'T'HH:mm:ss.SSSZ'")
    /**
     * Data do atendimento ou dispensa da exigência<br />Formato:'yyyy-MM-dd'T'HH:mm:ss.SSSZ'
     **/
    private OffsetDateTime dataLiberacao = null;

    @XmlElement(name = "justificativaDispensa")
    @ApiModelProperty(value = "Justificativa do servidor ao dispensar uma exigência<br />Tamanho mínimo: 0<br />Tamanho máximo: 4000")
    /**
     * Justificativa do servidor ao dispensar uma exigência<br />Tamanho mínimo: 0<br />Tamanho máximo: 4000
     **/
    private String justificativaDispensa = null;

    @XmlElement(name = "numeroDocumento")
    @ApiModelProperty(example = "21BR0004507604", value = "Número da DU-E<br />Tamanho: 14<br />Formato: 'NNAANNNNNNNNNN'")
    /**
     * Número da DU-E<br />Tamanho: 14<br />Formato: 'NNAANNNNNNNNNN'
     **/
    private String numeroDocumento = null;

    @XmlElement(name = "ncmSugerida")
    @ApiModelProperty(value = "NCM sugerida<br />Tamanho: 8")
    /**
     * NCM sugerida<br />Tamanho: 8
     **/
    private String ncmSugerida = null;

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
     * Matrícula servidor do servidor responsável pela dispensa ou atendimento da exigência&lt;br /&gt;Tamanho mínimo: 0&lt;br /&gt;Tamanho máximo: 15
     *
     * @return matriculaServidorRespLiberacao
     **/
    @JsonProperty("matriculaServidorRespLiberacao")
    public String getMatriculaServidorRespLiberacao() {
        return matriculaServidorRespLiberacao;
    }

    public void setMatriculaServidorRespLiberacao(String matriculaServidorRespLiberacao) {
        this.matriculaServidorRespLiberacao = matriculaServidorRespLiberacao;
    }

    public ExigenciaFiscalEstruturada matriculaServidorRespLiberacao(String matriculaServidorRespLiberacao) {
        this.matriculaServidorRespLiberacao = matriculaServidorRespLiberacao;
        return this;
    }

    /**
     * Número de ordem da exigência&lt;br /&gt;Formato: Inteiro, com até 3 digitos
     *
     * @return numeroExigencia
     **/
    @JsonProperty("numeroExigencia")
    public Integer getNumeroExigencia() {
        return numeroExigencia;
    }

    public void setNumeroExigencia(Integer numeroExigencia) {
        this.numeroExigencia = numeroExigencia;
    }

    public ExigenciaFiscalEstruturada numeroExigencia(Integer numeroExigencia) {
        this.numeroExigencia = numeroExigencia;
        return this;
    }

    /**
     * Get situacao
     *
     * @return situacao
     **/
    @JsonProperty("situacao")
    public SituacaoExigenciaFiscalDTO getSituacao() {
        return situacao;
    }

    public void setSituacao(SituacaoExigenciaFiscalDTO situacao) {
        this.situacao = situacao;
    }

    public ExigenciaFiscalEstruturada situacao(SituacaoExigenciaFiscalDTO situacao) {
        this.situacao = situacao;
        return this;
    }

    /**
     * Get itemDue
     *
     * @return itemDue
     **/
    @JsonProperty("itemDue")
    public ItemDueExigenciaFiscalDTO getItemDue() {
        return itemDue;
    }

    public void setItemDue(ItemDueExigenciaFiscalDTO itemDue) {
        this.itemDue = itemDue;
    }

    public ExigenciaFiscalEstruturada itemDue(ItemDueExigenciaFiscalDTO itemDue) {
        this.itemDue = itemDue;
        return this;
    }

    /**
     * Órgão responsável pela criação da exigência&lt;br /&gt;Tamanho mínimo: 1&lt;br /&gt;Tamanho máximo: 10
     *
     * @return orgao
     **/
    @JsonProperty("orgao")
    public String getOrgao() {
        return orgao;
    }

    public void setOrgao(String orgao) {
        this.orgao = orgao;
    }

    public ExigenciaFiscalEstruturada orgao(String orgao) {
        this.orgao = orgao;
        return this;
    }

    /**
     * Get listaFundamentoLegal
     *
     * @return listaFundamentoLegal
     **/
    @JsonProperty("listaFundamentoLegal")
    public List<FundamentoLegalExigenciaFiscalDTO> getListaFundamentoLegal() {
        return listaFundamentoLegal;
    }

    public void setListaFundamentoLegal(List<FundamentoLegalExigenciaFiscalDTO> listaFundamentoLegal) {
        this.listaFundamentoLegal = listaFundamentoLegal;
    }

    public ExigenciaFiscalEstruturada listaFundamentoLegal(List<FundamentoLegalExigenciaFiscalDTO> listaFundamentoLegal) {
        this.listaFundamentoLegal = listaFundamentoLegal;
        return this;
    }

    public ExigenciaFiscalEstruturada addListaFundamentoLegalItem(FundamentoLegalExigenciaFiscalDTO listaFundamentoLegalItem) {
        this.listaFundamentoLegal.add(listaFundamentoLegalItem);
        return this;
    }

    /**
     * Data de registro da exigência&lt;br /&gt;Formato:&#39;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#39;
     *
     * @return dataRegistro
     **/
    @JsonProperty("dataRegistro")
    public OffsetDateTime getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(OffsetDateTime dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    public ExigenciaFiscalEstruturada dataRegistro(OffsetDateTime dataRegistro) {
        this.dataRegistro = dataRegistro;
        return this;
    }

    /**
     * Matrícula do servidor responsável pela criação da exigência&lt;br /&gt;Tamanho mínimo: 1&lt;br /&gt;Tamanho máximo: 15
     *
     * @return matriculaServidorResp
     **/
    @JsonProperty("matriculaServidorResp")
    public String getMatriculaServidorResp() {
        return matriculaServidorResp;
    }

    public void setMatriculaServidorResp(String matriculaServidorResp) {
        this.matriculaServidorResp = matriculaServidorResp;
    }

    public ExigenciaFiscalEstruturada matriculaServidorResp(String matriculaServidorResp) {
        this.matriculaServidorResp = matriculaServidorResp;
        return this;
    }

    /**
     * Valor a recolher de Multa&lt;br /&gt;Tamanho: 15,2&lt;br /&gt;Formato: Decimal, com até 2 casas decimais separadas por ponto.
     *
     * @return valorRecolherMulta
     **/
    @JsonProperty("valorRecolherMulta")
    public BigDecimal getValorRecolherMulta() {
        return valorRecolherMulta;
    }

    public void setValorRecolherMulta(BigDecimal valorRecolherMulta) {
        this.valorRecolherMulta = valorRecolherMulta;
    }

    public ExigenciaFiscalEstruturada valorRecolherMulta(BigDecimal valorRecolherMulta) {
        this.valorRecolherMulta = valorRecolherMulta;
        return this;
    }

    /**
     * Observação do servidor ao atender uma exigência&lt;br /&gt;Tamanho mínimo: 0&lt;br /&gt;Tamanho máximo: 4000
     *
     * @return observacaoAtendimento
     **/
    @JsonProperty("observacaoAtendimento")
    public String getObservacaoAtendimento() {
        return observacaoAtendimento;
    }

    public void setObservacaoAtendimento(String observacaoAtendimento) {
        this.observacaoAtendimento = observacaoAtendimento;
    }

    public ExigenciaFiscalEstruturada observacaoAtendimento(String observacaoAtendimento) {
        this.observacaoAtendimento = observacaoAtendimento;
        return this;
    }

    /**
     * Número da versão da DU-E&lt;br /&gt;Formato: Inteiro, com até 10 digitos
     *
     * @return versaoDocumento
     **/
    @JsonProperty("versaoDocumento")
    public Integer getVersaoDocumento() {
        return versaoDocumento;
    }

    public void setVersaoDocumento(Integer versaoDocumento) {
        this.versaoDocumento = versaoDocumento;
    }

    public ExigenciaFiscalEstruturada versaoDocumento(Integer versaoDocumento) {
        this.versaoDocumento = versaoDocumento;
        return this;
    }

    /**
     * Descrição complementar da exigência&lt;br /&gt;Tamanho mínimo: 0&lt;br /&gt;Tamanho máximo: 4000
     *
     * @return descricaoComplementar
     **/
    @JsonProperty("descricaoComplementar")
    public String getDescricaoComplementar() {
        return descricaoComplementar;
    }

    public void setDescricaoComplementar(String descricaoComplementar) {
        this.descricaoComplementar = descricaoComplementar;
    }

    public ExigenciaFiscalEstruturada descricaoComplementar(String descricaoComplementar) {
        this.descricaoComplementar = descricaoComplementar;
        return this;
    }

    /**
     * Texto do modelo da exigência&lt;br /&gt;Tamanho mínimo: 1&lt;br /&gt;Tamanho máximo: 8000
     *
     * @return descricaoExigencia
     **/
    @JsonProperty("descricaoExigencia")
    public String getDescricaoExigencia() {
        return descricaoExigencia;
    }

    public void setDescricaoExigencia(String descricaoExigencia) {
        this.descricaoExigencia = descricaoExigencia;
    }

    public ExigenciaFiscalEstruturada descricaoExigencia(String descricaoExigencia) {
        this.descricaoExigencia = descricaoExigencia;
        return this;
    }

    /**
     * Data do atendimento ou dispensa da exigência&lt;br /&gt;Formato:&#39;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#39;
     *
     * @return dataLiberacao
     **/
    @JsonProperty("dataLiberacao")
    public OffsetDateTime getDataLiberacao() {
        return dataLiberacao;
    }

    public void setDataLiberacao(OffsetDateTime dataLiberacao) {
        this.dataLiberacao = dataLiberacao;
    }

    public ExigenciaFiscalEstruturada dataLiberacao(OffsetDateTime dataLiberacao) {
        this.dataLiberacao = dataLiberacao;
        return this;
    }

    /**
     * Justificativa do servidor ao dispensar uma exigência&lt;br /&gt;Tamanho mínimo: 0&lt;br /&gt;Tamanho máximo: 4000
     *
     * @return justificativaDispensa
     **/
    @JsonProperty("justificativaDispensa")
    public String getJustificativaDispensa() {
        return justificativaDispensa;
    }

    public void setJustificativaDispensa(String justificativaDispensa) {
        this.justificativaDispensa = justificativaDispensa;
    }

    public ExigenciaFiscalEstruturada justificativaDispensa(String justificativaDispensa) {
        this.justificativaDispensa = justificativaDispensa;
        return this;
    }

    /**
     * Número da DU-E&lt;br /&gt;Tamanho: 14&lt;br /&gt;Formato: &#39;NNAANNNNNNNNNN&#39;
     *
     * @return numeroDocumento
     **/
    @JsonProperty("numeroDocumento")
    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public ExigenciaFiscalEstruturada numeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
        return this;
    }

    /**
     * NCM sugerida&lt;br /&gt;Tamanho: 8
     *
     * @return ncmSugerida
     **/
    @JsonProperty("ncmSugerida")
    public String getNcmSugerida() {
        return ncmSugerida;
    }

    public void setNcmSugerida(String ncmSugerida) {
        this.ncmSugerida = ncmSugerida;
    }

    public ExigenciaFiscalEstruturada ncmSugerida(String ncmSugerida) {
        this.ncmSugerida = ncmSugerida;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class ExigenciaFiscalEstruturada {\n" +
                "    matriculaServidorRespLiberacao: " + toIndentedString(matriculaServidorRespLiberacao) + "\n" +
                "    numeroExigencia: " + toIndentedString(numeroExigencia) + "\n" +
                "    situacao: " + toIndentedString(situacao) + "\n" +
                "    itemDue: " + toIndentedString(itemDue) + "\n" +
                "    orgao: " + toIndentedString(orgao) + "\n" +
                "    listaFundamentoLegal: " + toIndentedString(listaFundamentoLegal) + "\n" +
                "    dataRegistro: " + toIndentedString(dataRegistro) + "\n" +
                "    matriculaServidorResp: " + toIndentedString(matriculaServidorResp) + "\n" +
                "    valorRecolherMulta: " + toIndentedString(valorRecolherMulta) + "\n" +
                "    observacaoAtendimento: " + toIndentedString(observacaoAtendimento) + "\n" +
                "    versaoDocumento: " + toIndentedString(versaoDocumento) + "\n" +
                "    descricaoComplementar: " + toIndentedString(descricaoComplementar) + "\n" +
                "    descricaoExigencia: " + toIndentedString(descricaoExigencia) + "\n" +
                "    dataLiberacao: " + toIndentedString(dataLiberacao) + "\n" +
                "    justificativaDispensa: " + toIndentedString(justificativaDispensa) + "\n" +
                "    numeroDocumento: " + toIndentedString(numeroDocumento) + "\n" +
                "    ncmSugerida: " + toIndentedString(ncmSugerida) + "\n" +
                "}";
        return sb;
    }
}
