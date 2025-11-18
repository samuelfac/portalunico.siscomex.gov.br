package br.gov.siscomex.portalunico.cctr.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RespostaConsultaPosACD", propOrder =
        {"situacaoEspecial", "anoDeposito", "sequenciaDeposito", "anoCarga", "sequenciaCarga", "codigoURF", "codigoRA", "latitude", "longitude", "idResponsavel", "nomeResponsavel", "numeroDUE", "numeroDUIMP", "numeroRUC", "codigoPaisImportador", "nomePaisImportador", "codigoSituacaoEspecial", "nomeSituacaoEspecial", "existeConteiner", "nrConhecimento", "numeroCEMercante"
        })

@XmlRootElement(name = "RespostaConsultaPosACD")
/**
 * Resposta da consulta pós ACD
 **/
@ApiModel(description = "Resposta da consulta pós ACD")
public class RespostaConsultaPosACD {

    @XmlElement(name = "situacaoEspecial")
    @ApiModelProperty(value = "")
    private String situacaoEspecial = null;

    @XmlElement(name = "anoDeposito")
    @ApiModelProperty(example = "2024.0", value = "Tamanho: 4<br>Formato: NNNN")
    @Valid
    /**
     * Tamanho: 4<br>Formato: NNNN
     **/
    private BigDecimal anoDeposito = null;

    @XmlElement(name = "sequenciaDeposito")
    @ApiModelProperty(example = "4210640.0", value = "Tamanho máximo: 10<br>Formato: NNNNNNNNNN")
    @Valid
    /**
     * Tamanho máximo: 10<br>Formato: NNNNNNNNNN
     **/
    private BigDecimal sequenciaDeposito = null;

    @XmlElement(name = "anoCarga")
    @ApiModelProperty(example = "2024.0", value = "Tamanho: 4<br>Formato: NNNN")
    @Valid
    /**
     * Tamanho: 4<br>Formato: NNNN
     **/
    private BigDecimal anoCarga = null;

    @XmlElement(name = "sequenciaCarga")
    @ApiModelProperty(example = "3473591.0", value = "Tamanho: XX<br>Formato: XXXXXXXXX")
    @Valid
    /**
     * Tamanho: XX<br>Formato: XXXXXXXXX
     **/
    private BigDecimal sequenciaCarga = null;

    @XmlElement(name = "codigoURF")
    @ApiModelProperty(example = "717700.0", value = "Código da Unidade de Região Fiscal<br>Tamanho Máximo: 7<br>Formato: NNNNNNN")
    @Valid
    /**
     * Código da Unidade de Região Fiscal<br>Tamanho Máximo: 7<br>Formato: NNNNNNN
     **/
    private BigDecimal codigoURF = null;

    @XmlElement(name = "codigoRA")
    @ApiModelProperty(example = "7911101.0", value = "Código do Recinto Aduaneiro<br>Tamanho: 7<br>Formato: NNNNNNN")
    @Valid
    /**
     * Código do Recinto Aduaneiro<br>Tamanho: 7<br>Formato: NNNNNNN
     **/
    private BigDecimal codigoRA = null;

    @XmlElement(name = "latitude")
    @ApiModelProperty(example = "-22.812222", value = "Latitude do local<br>Coordenadas geográficas em graus decimais<br>Formato: NN.NNNNNN ou -NN.NNNNNN")
    /**
     * Latitude do local<br>Coordenadas geográficas em graus decimais<br>Formato: NN.NNNNNN ou -NN.NNNNNN
     **/
    private String latitude = null;

    @XmlElement(name = "longitude")
    @ApiModelProperty(example = "-43.248333", value = "Longitude do local<br>Coordenadas geográficas em graus decimais<br>Formato: NN.NNNNNN ou -NN.NNNNNN")
    /**
     * Longitude do local<br>Coordenadas geográficas em graus decimais<br>Formato: NN.NNNNNN ou -NN.NNNNNN
     **/
    private String longitude = null;

    @XmlElement(name = "idResponsavel")
    @ApiModelProperty(example = "07396865000168", value = "CPF ou CNPJ do responsável pelo estoque<br>Tamanho máximo: 14<br>Formato: NNNNNNNNNNNNNN")
    /**
     * CPF ou CNPJ do responsável pelo estoque<br>Tamanho máximo: 14<br>Formato: NNNNNNNNNNNNNN
     **/
    private String idResponsavel = null;

    @XmlElement(name = "nomeResponsavel")
    @ApiModelProperty(example = "MOCK Testes Integrados", value = "Tamanho máximo: 60<br>Formato: AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA")
    /**
     * Tamanho máximo: 60<br>Formato: AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
     **/
    private String nomeResponsavel = null;

    @XmlElement(name = "numeroDUE")
    @ApiModelProperty(example = "24BR0000170788", value = "Tamanho: 14<br>Formato: AABRSSSSSSSSSD<br>Descrição do Formato:<br>AA - Ano<br>BR - Brasil<br>SSSSSSSSS - Numeração sequencial<br>D - DV")
    /**
     * Tamanho: 14<br>Formato: AABRSSSSSSSSSD<br>Descrição do Formato:<br>AA - Ano<br>BR - Brasil<br>SSSSSSSSS - Numeração sequencial<br>D - DV
     **/
    private String numeroDUE = null;

    @XmlElement(name = "numeroDUIMP")
    @ApiModelProperty(value = "Tamanho: 14<br>Formato: AAAAAAAAAAAAAA")
    /**
     * Tamanho: 14<br>Formato: AAAAAAAAAAAAAA
     **/
    private String numeroDUIMP = null;

    @XmlElement(name = "numeroRUC")
    @ApiModelProperty(example = "4BR00000000200000000000000000017537", value = "Tamanho mínimo: 13<br>Tamanho máximo: 35<br>Formato: NAANNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN")
    /**
     * Tamanho mínimo: 13<br>Tamanho máximo: 35<br>Formato: NAANNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN
     **/
    private String numeroRUC = null;

    @XmlElement(name = "codigoPaisImportador")
    @ApiModelProperty(example = "676", value = "Tamanho: 3<br>Formato: NNN")
    /**
     * Tamanho: 3<br>Formato: NNN
     **/
    private Integer codigoPaisImportador = null;

    @XmlElement(name = "nomePaisImportador")
    @ApiModelProperty(example = "RUSSIA, FEDERACAO DA", value = "Tamanho Máximo: 50<br>Formato: AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA")
    /**
     * Tamanho Máximo: 50<br>Formato: AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
     **/
    private String nomePaisImportador = null;

    @XmlElement(name = "codigoSituacaoEspecial")
    @ApiModelProperty(value = "")
    private Integer codigoSituacaoEspecial = null;

    @XmlElement(name = "nomeSituacaoEspecial")
    @ApiModelProperty(value = "Tamanho: 30<br>Formato: AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA")
    /**
     * Tamanho: 30<br>Formato: AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
     **/
    private String nomeSituacaoEspecial = null;
    @XmlElement(name = "existeConteiner")
    @ApiModelProperty(example = "N", value = "Tamanho: 1")
    /**
     * Tamanho: 1
     **/
    private ExisteConteinerEnum existeConteiner = null;
    @XmlElement(name = "nrConhecimento")
    @ApiModelProperty(value = "")
    private String nrConhecimento = null;

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

    @XmlElement(name = "numeroCEMercante")
    @ApiModelProperty(value = "")
    private String numeroCEMercante = null;

    /**
     * Get situacaoEspecial
     *
     * @return situacaoEspecial
     **/
    @JsonProperty("situacaoEspecial")
    public String getSituacaoEspecial() {
        return situacaoEspecial;
    }

    public void setSituacaoEspecial(String situacaoEspecial) {
        this.situacaoEspecial = situacaoEspecial;
    }

    public RespostaConsultaPosACD situacaoEspecial(String situacaoEspecial) {
        this.situacaoEspecial = situacaoEspecial;
        return this;
    }

    /**
     * Tamanho: 4&lt;br&gt;Formato: NNNN
     *
     * @return anoDeposito
     **/
    @JsonProperty("anoDeposito")
    public BigDecimal getAnoDeposito() {
        return anoDeposito;
    }

    public void setAnoDeposito(BigDecimal anoDeposito) {
        this.anoDeposito = anoDeposito;
    }

    public RespostaConsultaPosACD anoDeposito(BigDecimal anoDeposito) {
        this.anoDeposito = anoDeposito;
        return this;
    }

    /**
     * Tamanho máximo: 10&lt;br&gt;Formato: NNNNNNNNNN
     *
     * @return sequenciaDeposito
     **/
    @JsonProperty("sequenciaDeposito")
    public BigDecimal getSequenciaDeposito() {
        return sequenciaDeposito;
    }

    public void setSequenciaDeposito(BigDecimal sequenciaDeposito) {
        this.sequenciaDeposito = sequenciaDeposito;
    }

    public RespostaConsultaPosACD sequenciaDeposito(BigDecimal sequenciaDeposito) {
        this.sequenciaDeposito = sequenciaDeposito;
        return this;
    }

    /**
     * Tamanho: 4&lt;br&gt;Formato: NNNN
     *
     * @return anoCarga
     **/
    @JsonProperty("anoCarga")
    public BigDecimal getAnoCarga() {
        return anoCarga;
    }

    public void setAnoCarga(BigDecimal anoCarga) {
        this.anoCarga = anoCarga;
    }

    public RespostaConsultaPosACD anoCarga(BigDecimal anoCarga) {
        this.anoCarga = anoCarga;
        return this;
    }

    /**
     * Tamanho: XX&lt;br&gt;Formato: XXXXXXXXX
     *
     * @return sequenciaCarga
     **/
    @JsonProperty("sequenciaCarga")
    public BigDecimal getSequenciaCarga() {
        return sequenciaCarga;
    }

    public void setSequenciaCarga(BigDecimal sequenciaCarga) {
        this.sequenciaCarga = sequenciaCarga;
    }

    public RespostaConsultaPosACD sequenciaCarga(BigDecimal sequenciaCarga) {
        this.sequenciaCarga = sequenciaCarga;
        return this;
    }

    /**
     * Código da Unidade de Região Fiscal&lt;br&gt;Tamanho Máximo: 7&lt;br&gt;Formato: NNNNNNN
     *
     * @return codigoURF
     **/
    @JsonProperty("codigoURF")
    public BigDecimal getCodigoURF() {
        return codigoURF;
    }

    public void setCodigoURF(BigDecimal codigoURF) {
        this.codigoURF = codigoURF;
    }

    public RespostaConsultaPosACD codigoURF(BigDecimal codigoURF) {
        this.codigoURF = codigoURF;
        return this;
    }

    /**
     * Código do Recinto Aduaneiro&lt;br&gt;Tamanho: 7&lt;br&gt;Formato: NNNNNNN
     *
     * @return codigoRA
     **/
    @JsonProperty("codigoRA")
    public BigDecimal getCodigoRA() {
        return codigoRA;
    }

    public void setCodigoRA(BigDecimal codigoRA) {
        this.codigoRA = codigoRA;
    }

    public RespostaConsultaPosACD codigoRA(BigDecimal codigoRA) {
        this.codigoRA = codigoRA;
        return this;
    }

    /**
     * Latitude do local&lt;br&gt;Coordenadas geográficas em graus decimais&lt;br&gt;Formato: NN.NNNNNN ou -NN.NNNNNN
     * @return latitude
     **/
    @JsonProperty("latitude")
    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public RespostaConsultaPosACD latitude(String latitude) {
        this.latitude = latitude;
        return this;
    }

    /**
     * Longitude do local&lt;br&gt;Coordenadas geográficas em graus decimais&lt;br&gt;Formato: NN.NNNNNN ou -NN.NNNNNN
     *
     * @return longitude
     **/
    @JsonProperty("longitude")
    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public RespostaConsultaPosACD longitude(String longitude) {
        this.longitude = longitude;
        return this;
    }

    /**
     * CPF ou CNPJ do responsável pelo estoque&lt;br&gt;Tamanho máximo: 14&lt;br&gt;Formato: NNNNNNNNNNNNNN
     *
     * @return idResponsavel
     **/
    @JsonProperty("idResponsavel")
    public String getIdResponsavel() {
        return idResponsavel;
    }

    public void setIdResponsavel(String idResponsavel) {
        this.idResponsavel = idResponsavel;
    }

    public RespostaConsultaPosACD idResponsavel(String idResponsavel) {
        this.idResponsavel = idResponsavel;
        return this;
    }

    /**
     * Tamanho máximo: 60&lt;br&gt;Formato: AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
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

    public RespostaConsultaPosACD nomeResponsavel(String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
        return this;
    }

    /**
     * Tamanho: 14&lt;br&gt;Formato: AABRSSSSSSSSSD&lt;br&gt;Descrição do Formato:&lt;br&gt;AA - Ano&lt;br&gt;BR - Brasil&lt;br&gt;SSSSSSSSS - Numeração sequencial&lt;br&gt;D - DV
     *
     * @return numeroDUE
     **/
    @JsonProperty("numeroDUE")
    public String getNumeroDUE() {
        return numeroDUE;
    }

    public void setNumeroDUE(String numeroDUE) {
        this.numeroDUE = numeroDUE;
    }

    public RespostaConsultaPosACD numeroDUE(String numeroDUE) {
        this.numeroDUE = numeroDUE;
        return this;
    }

    /**
     * Tamanho: 14&lt;br&gt;Formato: AAAAAAAAAAAAAA
     *
     * @return numeroDUIMP
     **/
    @JsonProperty("numeroDUIMP")
    public String getNumeroDUIMP() {
        return numeroDUIMP;
    }

    public void setNumeroDUIMP(String numeroDUIMP) {
        this.numeroDUIMP = numeroDUIMP;
    }

    public RespostaConsultaPosACD numeroDUIMP(String numeroDUIMP) {
        this.numeroDUIMP = numeroDUIMP;
        return this;
    }

    /**
     * Tamanho mínimo: 13&lt;br&gt;Tamanho máximo: 35&lt;br&gt;Formato: NAANNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN
     * @return numeroRUC
     **/
    @JsonProperty("numeroRUC")
    public String getNumeroRUC() {
        return numeroRUC;
    }

    public void setNumeroRUC(String numeroRUC) {
        this.numeroRUC = numeroRUC;
    }

    public RespostaConsultaPosACD numeroRUC(String numeroRUC) {
        this.numeroRUC = numeroRUC;
        return this;
    }

    /**
     * Tamanho: 3&lt;br&gt;Formato: NNN
     * @return codigoPaisImportador
     **/
    @JsonProperty("codigoPaisImportador")
    public Integer getCodigoPaisImportador() {
        return codigoPaisImportador;
    }

    public void setCodigoPaisImportador(Integer codigoPaisImportador) {
        this.codigoPaisImportador = codigoPaisImportador;
    }

    public RespostaConsultaPosACD codigoPaisImportador(Integer codigoPaisImportador) {
        this.codigoPaisImportador = codigoPaisImportador;
        return this;
    }

    /**
     * Tamanho Máximo: 50&lt;br&gt;Formato: AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
     * @return nomePaisImportador
     **/
    @JsonProperty("nomePaisImportador")
    public String getNomePaisImportador() {
        return nomePaisImportador;
    }

    public void setNomePaisImportador(String nomePaisImportador) {
        this.nomePaisImportador = nomePaisImportador;
    }

    public RespostaConsultaPosACD nomePaisImportador(String nomePaisImportador) {
        this.nomePaisImportador = nomePaisImportador;
        return this;
    }

    /**
     * Get codigoSituacaoEspecial
     * @return codigoSituacaoEspecial
     **/
    @JsonProperty("codigoSituacaoEspecial")
    public Integer getCodigoSituacaoEspecial() {
        return codigoSituacaoEspecial;
    }

    public void setCodigoSituacaoEspecial(Integer codigoSituacaoEspecial) {
        this.codigoSituacaoEspecial = codigoSituacaoEspecial;
    }

    public RespostaConsultaPosACD codigoSituacaoEspecial(Integer codigoSituacaoEspecial) {
        this.codigoSituacaoEspecial = codigoSituacaoEspecial;
        return this;
    }

    /**
     * Tamanho: 30&lt;br&gt;Formato: AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
     * @return nomeSituacaoEspecial
     **/
    @JsonProperty("nomeSituacaoEspecial")
    public String getNomeSituacaoEspecial() {
        return nomeSituacaoEspecial;
    }

    public void setNomeSituacaoEspecial(String nomeSituacaoEspecial) {
        this.nomeSituacaoEspecial = nomeSituacaoEspecial;
    }

    public RespostaConsultaPosACD nomeSituacaoEspecial(String nomeSituacaoEspecial) {
        this.nomeSituacaoEspecial = nomeSituacaoEspecial;
        return this;
    }

    /**
     * Tamanho: 1
     *
     * @return existeConteiner
     **/
    @JsonProperty("existeConteiner")
    public String getExisteConteiner() {
        if (existeConteiner == null) {
            return null;
        }
        return existeConteiner.value();
    }

    public void setExisteConteiner(ExisteConteinerEnum existeConteiner) {
        this.existeConteiner = existeConteiner;
    }

    public RespostaConsultaPosACD existeConteiner(ExisteConteinerEnum existeConteiner) {
        this.existeConteiner = existeConteiner;
        return this;
    }

    /**
     * Get nrConhecimento
     *
     * @return nrConhecimento
     **/
    @JsonProperty("nrConhecimento")
    public String getNrConhecimento() {
        return nrConhecimento;
    }

    public void setNrConhecimento(String nrConhecimento) {
        this.nrConhecimento = nrConhecimento;
    }

    public RespostaConsultaPosACD nrConhecimento(String nrConhecimento) {
        this.nrConhecimento = nrConhecimento;
        return this;
    }

    /**
     * Get numeroCEMercante
     *
     * @return numeroCEMercante
     **/
    @JsonProperty("numeroCEMercante")
    public String getNumeroCEMercante() {
        return numeroCEMercante;
    }

    public void setNumeroCEMercante(String numeroCEMercante) {
        this.numeroCEMercante = numeroCEMercante;
    }

    public RespostaConsultaPosACD numeroCEMercante(String numeroCEMercante) {
        this.numeroCEMercante = numeroCEMercante;
        return this;
    }


    @Override
    public String toString() {

        String sb = "class RespostaConsultaPosACD {\n" +
                "    situacaoEspecial: " + toIndentedString(situacaoEspecial) + "\n" +
                "    anoDeposito: " + toIndentedString(anoDeposito) + "\n" +
                "    sequenciaDeposito: " + toIndentedString(sequenciaDeposito) + "\n" +
                "    anoCarga: " + toIndentedString(anoCarga) + "\n" +
                "    sequenciaCarga: " + toIndentedString(sequenciaCarga) + "\n" +
                "    codigoURF: " + toIndentedString(codigoURF) + "\n" +
                "    codigoRA: " + toIndentedString(codigoRA) + "\n" +
                "    latitude: " + toIndentedString(latitude) + "\n" +
                "    longitude: " + toIndentedString(longitude) + "\n" +
                "    idResponsavel: " + toIndentedString(idResponsavel) + "\n" +
                "    nomeResponsavel: " + toIndentedString(nomeResponsavel) + "\n" +
                "    numeroDUE: " + toIndentedString(numeroDUE) + "\n" +
                "    numeroDUIMP: " + toIndentedString(numeroDUIMP) + "\n" +
                "    numeroRUC: " + toIndentedString(numeroRUC) + "\n" +
                "    codigoPaisImportador: " + toIndentedString(codigoPaisImportador) + "\n" +
                "    nomePaisImportador: " + toIndentedString(nomePaisImportador) + "\n" +
                "    codigoSituacaoEspecial: " + toIndentedString(codigoSituacaoEspecial) + "\n" +
                "    nomeSituacaoEspecial: " + toIndentedString(nomeSituacaoEspecial) + "\n" +
                "    existeConteiner: " + toIndentedString(existeConteiner) + "\n" +
                "    nrConhecimento: " + toIndentedString(nrConhecimento) + "\n" +
                "    numeroCEMercante: " + toIndentedString(numeroCEMercante) + "\n" +
                "}";
        return sb;
    }

    @XmlType(name = "ExisteConteinerEnum")
    @XmlEnum(String.class)
    public enum ExisteConteinerEnum {

        @XmlEnumValue("S")
        @JsonProperty("S")
        S("S"),

        @XmlEnumValue("N")
        @JsonProperty("N")
        N("N");


        private final String value;

        ExisteConteinerEnum(String v) {
            value = v;
        }

        public static ExisteConteinerEnum fromValue(String v) {
            for (ExisteConteinerEnum b : ExisteConteinerEnum.values()) {
                if (String.valueOf(b.value).equals(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "' to ExisteConteinerEnum");
        }

        public String value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
    }
}
