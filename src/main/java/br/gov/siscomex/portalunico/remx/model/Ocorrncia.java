package br.gov.siscomex.portalunico.remx.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.time.OffsetDateTime;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Ocorrncia", propOrder =
        {"codOcorrencia", "dataInsercao", "idOcorrencia", "idOrgaoResponsavelOcorrencia", "nomeFiscalRespOcorrencia", "nomeOcorrencia", "observacao", "resolvida"
        })

@XmlRootElement(name = "Ocorrncia")
public class Ocorrncia {

    @XmlElement(name = "codOcorrencia")
    @ApiModelProperty(value = "Código da ocorrência. O código da ocorrência é composto por 3 caracteres numéricos.")
    /**
     * Código da ocorrência. O código da ocorrência é composto por 3 caracteres numéricos.
     **/
    private Integer codOcorrencia = null;

    @XmlElement(name = "dataInsercao")
    @ApiModelProperty(value = "Data e horário da inserção da ocorrência.<br/>Formato: yyyy-MM-dd'T'HH:mm:ss.SSS")
    /**
     * Data e horário da inserção da ocorrência.<br/>Formato: yyyy-MM-dd'T'HH:mm:ss.SSS
     **/
    private OffsetDateTime dataInsercao = null;

    @XmlElement(name = "idOcorrencia")
    @ApiModelProperty(value = "Identificador da ocorrência. Utilizado para identificar qual ocorrência está sendo alterada ou resolvida. Máximo de 10 caracteres numéricos.")
    /**
     * Identificador da ocorrência. Utilizado para identificar qual ocorrência está sendo alterada ou resolvida. Máximo de 10 caracteres numéricos.
     **/
    private Integer idOcorrencia = null;

    @XmlElement(name = "idOrgaoResponsavelOcorrencia")
    @ApiModelProperty(value = "Sigla do órgão responsável pela ocorrência. Máximo de 50 caracteres.")
    /**
     * Sigla do órgão responsável pela ocorrência. Máximo de 50 caracteres.
     **/
    private String idOrgaoResponsavelOcorrencia = null;

    @XmlElement(name = "nomeFiscalRespOcorrencia")
    @ApiModelProperty(value = "Nome do fiscal responsável pela ocorrência. Máximo de 50 caracteres.")
    /**
     * Nome do fiscal responsável pela ocorrência. Máximo de 50 caracteres.
     **/
    private String nomeFiscalRespOcorrencia = null;

    @XmlElement(name = "nomeOcorrencia")
    @ApiModelProperty(value = "Descrição da ocorrência, conforme regra do sistema Remessa 'Lista de ocorrências permitidas em função do usuário logado no sistema'.")
    /**
     * Descrição da ocorrência, conforme regra do sistema Remessa 'Lista de ocorrências permitidas em função do usuário logado no sistema'.
     **/
    private String nomeOcorrencia = null;

    @XmlElement(name = "observacao")
    @ApiModelProperty(value = "Observação relacionada à ocorrência. Máximo de 4000 caracteres, que podem ser letras, números, além de quaisquer caracteres referentes a codificação UTF-8.")
    /**
     * Observação relacionada à ocorrência. Máximo de 4000 caracteres, que podem ser letras, números, além de quaisquer caracteres referentes a codificação UTF-8.
     **/
    private String observacao = null;

    @XmlElement(name = "resolvida")
    @ApiModelProperty(value = "Indicador de resolução da ocorrência.<br/>Valores pré-definidos:<br/>0 - Ocorrência não resolvida<br/>1 - Ocorrência resolvida<br/>2 - Interrompida RFB")
    /**
     * Indicador de resolução da ocorrência.<br/>Valores pré-definidos:<br/>0 - Ocorrência não resolvida<br/>1 - Ocorrência resolvida<br/>2 - Interrompida RFB
     **/
    private String resolvida = null;

    /**
     * Código da ocorrência. O código da ocorrência é composto por 3 caracteres numéricos.
     *
     * @return codOcorrencia
     **/
    @JsonProperty("codOcorrencia")
    public Integer getCodOcorrencia() {
        return codOcorrencia;
    }

    public void setCodOcorrencia(Integer codOcorrencia) {
        this.codOcorrencia = codOcorrencia;
    }

    public Ocorrncia codOcorrencia(Integer codOcorrencia) {
        this.codOcorrencia = codOcorrencia;
        return this;
    }

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
     * Data e horário da inserção da ocorrência.&lt;br/&gt;Formato: yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS
     *
     * @return dataInsercao
     **/
    @JsonProperty("dataInsercao")
    public OffsetDateTime getDataInsercao() {
        return dataInsercao;
    }

    public void setDataInsercao(OffsetDateTime dataInsercao) {
        this.dataInsercao = dataInsercao;
    }

    /**
     * Identificador da ocorrência. Utilizado para identificar qual ocorrência está sendo alterada ou resolvida. Máximo de 10 caracteres numéricos.
     *
     * @return idOcorrencia
     **/
    @JsonProperty("idOcorrencia")
    public Integer getIdOcorrencia() {
        return idOcorrencia;
    }

    public void setIdOcorrencia(Integer idOcorrencia) {
        this.idOcorrencia = idOcorrencia;
    }

    public Ocorrncia idOcorrencia(Integer idOcorrencia) {
        this.idOcorrencia = idOcorrencia;
        return this;
    }

    public Ocorrncia dataInsercao(OffsetDateTime dataInsercao) {
        this.dataInsercao = dataInsercao;
        return this;
    }

    /**
     * Sigla do órgão responsável pela ocorrência. Máximo de 50 caracteres.
     *
     * @return idOrgaoResponsavelOcorrencia
     **/
    @JsonProperty("idOrgaoResponsavelOcorrencia")
    public String getIdOrgaoResponsavelOcorrencia() {
        return idOrgaoResponsavelOcorrencia;
    }

    public void setIdOrgaoResponsavelOcorrencia(String idOrgaoResponsavelOcorrencia) {
        this.idOrgaoResponsavelOcorrencia = idOrgaoResponsavelOcorrencia;
    }

    /**
     * Nome do fiscal responsável pela ocorrência. Máximo de 50 caracteres.
     *
     * @return nomeFiscalRespOcorrencia
     **/
    @JsonProperty("nomeFiscalRespOcorrencia")
    public String getNomeFiscalRespOcorrencia() {
        return nomeFiscalRespOcorrencia;
    }

    public void setNomeFiscalRespOcorrencia(String nomeFiscalRespOcorrencia) {
        this.nomeFiscalRespOcorrencia = nomeFiscalRespOcorrencia;
    }

    public Ocorrncia nomeFiscalRespOcorrencia(String nomeFiscalRespOcorrencia) {
        this.nomeFiscalRespOcorrencia = nomeFiscalRespOcorrencia;
        return this;
    }

    /**
     * Descrição da ocorrência, conforme regra do sistema Remessa &#39;Lista de ocorrências permitidas em função do usuário logado no sistema&#39;.
     *
     * @return nomeOcorrencia
     **/
    @JsonProperty("nomeOcorrencia")
    public String getNomeOcorrencia() {
        return nomeOcorrencia;
    }

    public void setNomeOcorrencia(String nomeOcorrencia) {
        this.nomeOcorrencia = nomeOcorrencia;
    }

    public Ocorrncia nomeOcorrencia(String nomeOcorrencia) {
        this.nomeOcorrencia = nomeOcorrencia;
        return this;
    }

    public Ocorrncia idOrgaoResponsavelOcorrencia(String idOrgaoResponsavelOcorrencia) {
        this.idOrgaoResponsavelOcorrencia = idOrgaoResponsavelOcorrencia;
        return this;
    }

    /**
     * Observação relacionada à ocorrência. Máximo de 4000 caracteres, que podem ser letras, números, além de quaisquer caracteres referentes a codificação UTF-8.
     *
     * @return observacao
     **/
    @JsonProperty("observacao")
    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Ocorrncia observacao(String observacao) {
        this.observacao = observacao;
        return this;
    }

    /**
     * Indicador de resolução da ocorrência.&lt;br/&gt;Valores pré-definidos:&lt;br/&gt;0 - Ocorrência não resolvida&lt;br/&gt;1 - Ocorrência resolvida&lt;br/&gt;2 - Interrompida RFB
     *
     * @return resolvida
     **/
    @JsonProperty("resolvida")
    public String getResolvida() {
        return resolvida;
    }

    public void setResolvida(String resolvida) {
        this.resolvida = resolvida;
    }

    public Ocorrncia resolvida(String resolvida) {
        this.resolvida = resolvida;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class Ocorrncia {\n" +
                "    codOcorrencia: " + toIndentedString(codOcorrencia) + "\n" +
                "    dataInsercao: " + toIndentedString(dataInsercao) + "\n" +
                "    idOcorrencia: " + toIndentedString(idOcorrencia) + "\n" +
                "    idOrgaoResponsavelOcorrencia: " + toIndentedString(idOrgaoResponsavelOcorrencia) + "\n" +
                "    nomeFiscalRespOcorrencia: " + toIndentedString(nomeFiscalRespOcorrencia) + "\n" +
                "    nomeOcorrencia: " + toIndentedString(nomeOcorrencia) + "\n" +
                "    observacao: " + toIndentedString(observacao) + "\n" +
                "    resolvida: " + toIndentedString(resolvida) + "\n" +
                "}";
        return sb;
    }
}
