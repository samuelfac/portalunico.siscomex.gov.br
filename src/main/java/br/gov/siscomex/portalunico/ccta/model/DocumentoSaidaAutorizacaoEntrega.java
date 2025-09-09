package br.gov.siscomex.portalunico.ccta.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.time.OffsetDateTime;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentoSaidaAutorizacaoEntrega", propOrder =
        {"cpfResponsavel", "tipoDocumento", "ulResponsavel", "identificacaoDocumento", "dataAutorizacao", "numeroDocumentoSaida", "justificativa", "lotacaoResponsavel", "tipoAutorizacao", "matriculaResponsavel", "nomeResponsavel"
        })

@XmlRootElement(name = "DocumentoSaidaAutorizacaoEntrega")
public class DocumentoSaidaAutorizacaoEntrega {

    @XmlElement(name = "cpfResponsavel")
    @ApiModelProperty(value = "")
    private String cpfResponsavel = null;

    @XmlElement(name = "tipoDocumento")
    @ApiModelProperty(value = "")
    private String tipoDocumento = null;

    @XmlElement(name = "ulResponsavel")
    @ApiModelProperty(value = "")
    private String ulResponsavel = null;

    @XmlElement(name = "identificacaoDocumento")
    @ApiModelProperty(value = "")
    private String identificacaoDocumento = null;

    @XmlElement(name = "dataAutorizacao")
    @ApiModelProperty(value = "")
    private OffsetDateTime dataAutorizacao = null;

    @XmlElement(name = "numeroDocumentoSaida")
    @ApiModelProperty(value = "")
    private String numeroDocumentoSaida = null;

    @XmlElement(name = "justificativa")
    @ApiModelProperty(value = "")
    private String justificativa = null;

    @XmlElement(name = "lotacaoResponsavel")
    @ApiModelProperty(value = "")
    private String lotacaoResponsavel = null;

    @XmlElement(name = "tipoAutorizacao")
    @ApiModelProperty(value = "")
    private String tipoAutorizacao = null;

    @XmlElement(name = "matriculaResponsavel")
    @ApiModelProperty(value = "")
    private String matriculaResponsavel = null;

    @XmlElement(name = "nomeResponsavel")
    @ApiModelProperty(value = "")
    private String nomeResponsavel = null;

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
     * Get cpfResponsavel
     *
     * @return cpfResponsavel
     **/
    @JsonProperty("cpfResponsavel")
    public String getCpfResponsavel() {
        return cpfResponsavel;
    }

    public void setCpfResponsavel(String cpfResponsavel) {
        this.cpfResponsavel = cpfResponsavel;
    }

    public DocumentoSaidaAutorizacaoEntrega cpfResponsavel(String cpfResponsavel) {
        this.cpfResponsavel = cpfResponsavel;
        return this;
    }

    /**
     * Get tipoDocumento
     *
     * @return tipoDocumento
     **/
    @JsonProperty("tipoDocumento")
    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public DocumentoSaidaAutorizacaoEntrega tipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
        return this;
    }

    /**
     * Get ulResponsavel
     *
     * @return ulResponsavel
     **/
    @JsonProperty("ulResponsavel")
    public String getUlResponsavel() {
        return ulResponsavel;
    }

    public void setUlResponsavel(String ulResponsavel) {
        this.ulResponsavel = ulResponsavel;
    }

    public DocumentoSaidaAutorizacaoEntrega ulResponsavel(String ulResponsavel) {
        this.ulResponsavel = ulResponsavel;
        return this;
    }

    /**
     * Get identificacaoDocumento
     *
     * @return identificacaoDocumento
     **/
    @JsonProperty("identificacaoDocumento")
    public String getIdentificacaoDocumento() {
        return identificacaoDocumento;
    }

    public void setIdentificacaoDocumento(String identificacaoDocumento) {
        this.identificacaoDocumento = identificacaoDocumento;
    }

    public DocumentoSaidaAutorizacaoEntrega identificacaoDocumento(String identificacaoDocumento) {
        this.identificacaoDocumento = identificacaoDocumento;
        return this;
    }

    /**
     * Get dataAutorizacao
     *
     * @return dataAutorizacao
     **/
    @JsonProperty("dataAutorizacao")
    public OffsetDateTime getDataAutorizacao() {
        return dataAutorizacao;
    }

    public void setDataAutorizacao(OffsetDateTime dataAutorizacao) {
        this.dataAutorizacao = dataAutorizacao;
    }

    public DocumentoSaidaAutorizacaoEntrega dataAutorizacao(OffsetDateTime dataAutorizacao) {
        this.dataAutorizacao = dataAutorizacao;
        return this;
    }

    /**
     * Get numeroDocumentoSaida
     *
     * @return numeroDocumentoSaida
     **/
    @JsonProperty("numeroDocumentoSaida")
    public String getNumeroDocumentoSaida() {
        return numeroDocumentoSaida;
    }

    public void setNumeroDocumentoSaida(String numeroDocumentoSaida) {
        this.numeroDocumentoSaida = numeroDocumentoSaida;
    }

    public DocumentoSaidaAutorizacaoEntrega numeroDocumentoSaida(String numeroDocumentoSaida) {
        this.numeroDocumentoSaida = numeroDocumentoSaida;
        return this;
    }

    /**
     * Get justificativa
     *
     * @return justificativa
     **/
    @JsonProperty("justificativa")
    public String getJustificativa() {
        return justificativa;
    }

    public void setJustificativa(String justificativa) {
        this.justificativa = justificativa;
    }

    public DocumentoSaidaAutorizacaoEntrega justificativa(String justificativa) {
        this.justificativa = justificativa;
        return this;
    }

    /**
     * Get lotacaoResponsavel
     *
     * @return lotacaoResponsavel
     **/
    @JsonProperty("lotacaoResponsavel")
    public String getLotacaoResponsavel() {
        return lotacaoResponsavel;
    }

    public void setLotacaoResponsavel(String lotacaoResponsavel) {
        this.lotacaoResponsavel = lotacaoResponsavel;
    }

    public DocumentoSaidaAutorizacaoEntrega lotacaoResponsavel(String lotacaoResponsavel) {
        this.lotacaoResponsavel = lotacaoResponsavel;
        return this;
    }

    /**
     * Get tipoAutorizacao
     *
     * @return tipoAutorizacao
     **/
    @JsonProperty("tipoAutorizacao")
    public String getTipoAutorizacao() {
        return tipoAutorizacao;
    }

    public void setTipoAutorizacao(String tipoAutorizacao) {
        this.tipoAutorizacao = tipoAutorizacao;
    }

    public DocumentoSaidaAutorizacaoEntrega tipoAutorizacao(String tipoAutorizacao) {
        this.tipoAutorizacao = tipoAutorizacao;
        return this;
    }

    /**
     * Get matriculaResponsavel
     *
     * @return matriculaResponsavel
     **/
    @JsonProperty("matriculaResponsavel")
    public String getMatriculaResponsavel() {
        return matriculaResponsavel;
    }

    public void setMatriculaResponsavel(String matriculaResponsavel) {
        this.matriculaResponsavel = matriculaResponsavel;
    }

    public DocumentoSaidaAutorizacaoEntrega matriculaResponsavel(String matriculaResponsavel) {
        this.matriculaResponsavel = matriculaResponsavel;
        return this;
    }

    /**
     * Get nomeResponsavel
     *
     * @return nomeResponsavel
     **/
    @JsonProperty("nomeResponsavel")
    public String getNomeResponsavel() {
        return nomeResponsavel;
    }

    public void setNomeResponsavel(String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
    }

    public DocumentoSaidaAutorizacaoEntrega nomeResponsavel(String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class DocumentoSaidaAutorizacaoEntrega {\n" +
                "    cpfResponsavel: " + toIndentedString(cpfResponsavel) + "\n" +
                "    tipoDocumento: " + toIndentedString(tipoDocumento) + "\n" +
                "    ulResponsavel: " + toIndentedString(ulResponsavel) + "\n" +
                "    identificacaoDocumento: " + toIndentedString(identificacaoDocumento) + "\n" +
                "    dataAutorizacao: " + toIndentedString(dataAutorizacao) + "\n" +
                "    numeroDocumentoSaida: " + toIndentedString(numeroDocumentoSaida) + "\n" +
                "    justificativa: " + toIndentedString(justificativa) + "\n" +
                "    lotacaoResponsavel: " + toIndentedString(lotacaoResponsavel) + "\n" +
                "    tipoAutorizacao: " + toIndentedString(tipoAutorizacao) + "\n" +
                "    matriculaResponsavel: " + toIndentedString(matriculaResponsavel) + "\n" +
                "    nomeResponsavel: " + toIndentedString(nomeResponsavel) + "\n" +
                "}";
        return sb;
    }
}
