package br.gov.siscomex.portalunico.ccta.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.time.OffsetDateTime;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ViagemRodoviariaSituacaoResumida", propOrder =
        {"dataHoraSituacao", "detalhe", "situacaoAtual", "responsavel"
        })

@XmlRootElement(name = "ViagemRodoviariaSituacaoResumida")
public class ViagemRodoviariaSituacaoResumida {

    @XmlElement(name = "dataHoraSituacao")
    @ApiModelProperty(value = "")
    private OffsetDateTime dataHoraSituacao = null;

    @XmlElement(name = "detalhe")
    @ApiModelProperty(value = "")
    @Valid
    private CargaDetalheSituacaoEstoqueViagem detalhe = null;

    @XmlElement(name = "situacaoAtual")
    @ApiModelProperty(value = "")
    private String situacaoAtual = null;

    @XmlElement(name = "responsavel")
    @ApiModelProperty(value = "")
    @Valid
    private Responsavel responsavel = null;

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
     * Get dataHoraSituacao
     *
     * @return dataHoraSituacao
     **/
    @JsonProperty("dataHoraSituacao")
    public OffsetDateTime getDataHoraSituacao() {
        return dataHoraSituacao;
    }

    public void setDataHoraSituacao(OffsetDateTime dataHoraSituacao) {
        this.dataHoraSituacao = dataHoraSituacao;
    }

    public ViagemRodoviariaSituacaoResumida dataHoraSituacao(OffsetDateTime dataHoraSituacao) {
        this.dataHoraSituacao = dataHoraSituacao;
        return this;
    }

    /**
     * Get detalhe
     *
     * @return detalhe
     **/
    @JsonProperty("detalhe")
    public CargaDetalheSituacaoEstoqueViagem getDetalhe() {
        return detalhe;
    }

    public void setDetalhe(CargaDetalheSituacaoEstoqueViagem detalhe) {
        this.detalhe = detalhe;
    }

    public ViagemRodoviariaSituacaoResumida detalhe(CargaDetalheSituacaoEstoqueViagem detalhe) {
        this.detalhe = detalhe;
        return this;
    }

    /**
     * Get situacaoAtual
     *
     * @return situacaoAtual
     **/
    @JsonProperty("situacaoAtual")
    public String getSituacaoAtual() {
        return situacaoAtual;
    }

    public void setSituacaoAtual(String situacaoAtual) {
        this.situacaoAtual = situacaoAtual;
    }

    public ViagemRodoviariaSituacaoResumida situacaoAtual(String situacaoAtual) {
        this.situacaoAtual = situacaoAtual;
        return this;
    }

    /**
     * Get responsavel
     *
     * @return responsavel
     **/
    @JsonProperty("responsavel")
    public Responsavel getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Responsavel responsavel) {
        this.responsavel = responsavel;
    }

    public ViagemRodoviariaSituacaoResumida responsavel(Responsavel responsavel) {
        this.responsavel = responsavel;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class ViagemRodoviariaSituacaoResumida {\n" +
                "    dataHoraSituacao: " + toIndentedString(dataHoraSituacao) + "\n" +
                "    detalhe: " + toIndentedString(detalhe) + "\n" +
                "    situacaoAtual: " + toIndentedString(situacaoAtual) + "\n" +
                "    responsavel: " + toIndentedString(responsavel) + "\n" +
                "}";
        return sb;
    }
}
