package br.gov.siscomex.portalunico.ccta.model;

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
@XmlType(name = "CargaRodoviariaEstoque", propOrder =
        {"dataHoraSituacao", "quantidadeVolumes", "situacao", "detalhe", "divergencias", "tipoEmbalagem", "documentoSaida", "numeroConteiner", "pesoBruto", "responsavel", "chassiVeiculo", "tipoGranel"
        })

@XmlRootElement(name = "CargaRodoviariaEstoque")
public class CargaRodoviariaEstoque {

    @XmlElement(name = "dataHoraSituacao")
    @ApiModelProperty(value = "")
    private OffsetDateTime dataHoraSituacao = null;

    @XmlElement(name = "quantidadeVolumes")
    @ApiModelProperty(value = "")
    private Integer quantidadeVolumes = null;

    @XmlElement(name = "situacao")
    @ApiModelProperty(value = "")
    @Valid
    private Situacao situacao = null;

    @XmlElement(name = "detalhe")
    @ApiModelProperty(value = "")
    @Valid
    private CargaDetalheSituacaoEstoque detalhe = null;

    @XmlElement(name = "divergencias")
    @ApiModelProperty(value = "")
    @Valid
    private List<CargaRodoviariaDivergencia> divergencias = null;

    @XmlElement(name = "tipoEmbalagem")
    @ApiModelProperty(value = "")
    @Valid
    private TipoEmbalagem tipoEmbalagem = null;

    @XmlElement(name = "documentoSaida")
    @ApiModelProperty(value = "")
    @Valid
    private List<DocumentoSaida> documentoSaida = null;

    @XmlElement(name = "numeroConteiner")
    @ApiModelProperty(value = "")
    private String numeroConteiner = null;

    @XmlElement(name = "pesoBruto")
    @ApiModelProperty(value = "")
    @Valid
    private BigDecimal pesoBruto = null;

    @XmlElement(name = "responsavel")
    @ApiModelProperty(value = "")
    @Valid
    private Responsavel responsavel = null;

    @XmlElement(name = "chassiVeiculo")
    @ApiModelProperty(value = "")
    private String chassiVeiculo = null;

    @XmlElement(name = "tipoGranel")
    @ApiModelProperty(value = "")
    @Valid
    private TipoGranel tipoGranel = null;

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

    public CargaRodoviariaEstoque dataHoraSituacao(OffsetDateTime dataHoraSituacao) {
        this.dataHoraSituacao = dataHoraSituacao;
        return this;
    }

    /**
     * Get quantidadeVolumes
     *
     * @return quantidadeVolumes
     **/
    @JsonProperty("quantidadeVolumes")
    public Integer getQuantidadeVolumes() {
        return quantidadeVolumes;
    }

    public void setQuantidadeVolumes(Integer quantidadeVolumes) {
        this.quantidadeVolumes = quantidadeVolumes;
    }

    public CargaRodoviariaEstoque quantidadeVolumes(Integer quantidadeVolumes) {
        this.quantidadeVolumes = quantidadeVolumes;
        return this;
    }

    /**
     * Get situacao
     *
     * @return situacao
     **/
    @JsonProperty("situacao")
    public Situacao getSituacao() {
        return situacao;
    }

    public void setSituacao(Situacao situacao) {
        this.situacao = situacao;
    }

    public CargaRodoviariaEstoque situacao(Situacao situacao) {
        this.situacao = situacao;
        return this;
    }

    /**
     * Get detalhe
     *
     * @return detalhe
     **/
    @JsonProperty("detalhe")
    public CargaDetalheSituacaoEstoque getDetalhe() {
        return detalhe;
    }

    public void setDetalhe(CargaDetalheSituacaoEstoque detalhe) {
        this.detalhe = detalhe;
    }

    public CargaRodoviariaEstoque detalhe(CargaDetalheSituacaoEstoque detalhe) {
        this.detalhe = detalhe;
        return this;
    }

    /**
     * Get divergencias
     *
     * @return divergencias
     **/
    @JsonProperty("divergencias")
    public List<CargaRodoviariaDivergencia> getDivergencias() {
        return divergencias;
    }

    public void setDivergencias(List<CargaRodoviariaDivergencia> divergencias) {
        this.divergencias = divergencias;
    }

    public CargaRodoviariaEstoque divergencias(List<CargaRodoviariaDivergencia> divergencias) {
        this.divergencias = divergencias;
        return this;
    }

    public CargaRodoviariaEstoque addDivergenciasItem(CargaRodoviariaDivergencia divergenciasItem) {
        this.divergencias.add(divergenciasItem);
        return this;
    }

    /**
     * Get tipoEmbalagem
     *
     * @return tipoEmbalagem
     **/
    @JsonProperty("tipoEmbalagem")
    public TipoEmbalagem getTipoEmbalagem() {
        return tipoEmbalagem;
    }

    public void setTipoEmbalagem(TipoEmbalagem tipoEmbalagem) {
        this.tipoEmbalagem = tipoEmbalagem;
    }

    public CargaRodoviariaEstoque tipoEmbalagem(TipoEmbalagem tipoEmbalagem) {
        this.tipoEmbalagem = tipoEmbalagem;
        return this;
    }

    /**
     * Get documentoSaida
     *
     * @return documentoSaida
     **/
    @JsonProperty("documentoSaida")
    public List<DocumentoSaida> getDocumentoSaida() {
        return documentoSaida;
    }

    public void setDocumentoSaida(List<DocumentoSaida> documentoSaida) {
        this.documentoSaida = documentoSaida;
    }

    public CargaRodoviariaEstoque documentoSaida(List<DocumentoSaida> documentoSaida) {
        this.documentoSaida = documentoSaida;
        return this;
    }

    public CargaRodoviariaEstoque addDocumentoSaidaItem(DocumentoSaida documentoSaidaItem) {
        this.documentoSaida.add(documentoSaidaItem);
        return this;
    }

    /**
     * Get numeroConteiner
     *
     * @return numeroConteiner
     **/
    @JsonProperty("numeroConteiner")
    public String getNumeroConteiner() {
        return numeroConteiner;
    }

    public void setNumeroConteiner(String numeroConteiner) {
        this.numeroConteiner = numeroConteiner;
    }

    public CargaRodoviariaEstoque numeroConteiner(String numeroConteiner) {
        this.numeroConteiner = numeroConteiner;
        return this;
    }

    /**
     * Get pesoBruto
     *
     * @return pesoBruto
     **/
    @JsonProperty("pesoBruto")
    public BigDecimal getPesoBruto() {
        return pesoBruto;
    }

    public void setPesoBruto(BigDecimal pesoBruto) {
        this.pesoBruto = pesoBruto;
    }

    public CargaRodoviariaEstoque pesoBruto(BigDecimal pesoBruto) {
        this.pesoBruto = pesoBruto;
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

    public CargaRodoviariaEstoque responsavel(Responsavel responsavel) {
        this.responsavel = responsavel;
        return this;
    }

    /**
     * Get chassiVeiculo
     *
     * @return chassiVeiculo
     **/
    @JsonProperty("chassiVeiculo")
    public String getChassiVeiculo() {
        return chassiVeiculo;
    }

    public void setChassiVeiculo(String chassiVeiculo) {
        this.chassiVeiculo = chassiVeiculo;
    }

    public CargaRodoviariaEstoque chassiVeiculo(String chassiVeiculo) {
        this.chassiVeiculo = chassiVeiculo;
        return this;
    }

    /**
     * Get tipoGranel
     *
     * @return tipoGranel
     **/
    @JsonProperty("tipoGranel")
    public TipoGranel getTipoGranel() {
        return tipoGranel;
    }

    public void setTipoGranel(TipoGranel tipoGranel) {
        this.tipoGranel = tipoGranel;
    }

    public CargaRodoviariaEstoque tipoGranel(TipoGranel tipoGranel) {
        this.tipoGranel = tipoGranel;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class CargaRodoviariaEstoque {\n" +
                "    dataHoraSituacao: " + toIndentedString(dataHoraSituacao) + "\n" +
                "    quantidadeVolumes: " + toIndentedString(quantidadeVolumes) + "\n" +
                "    situacao: " + toIndentedString(situacao) + "\n" +
                "    detalhe: " + toIndentedString(detalhe) + "\n" +
                "    divergencias: " + toIndentedString(divergencias) + "\n" +
                "    tipoEmbalagem: " + toIndentedString(tipoEmbalagem) + "\n" +
                "    documentoSaida: " + toIndentedString(documentoSaida) + "\n" +
                "    numeroConteiner: " + toIndentedString(numeroConteiner) + "\n" +
                "    pesoBruto: " + toIndentedString(pesoBruto) + "\n" +
                "    responsavel: " + toIndentedString(responsavel) + "\n" +
                "    chassiVeiculo: " + toIndentedString(chassiVeiculo) + "\n" +
                "    tipoGranel: " + toIndentedString(tipoGranel) + "\n" +
                "}";
        return sb;
    }
}
