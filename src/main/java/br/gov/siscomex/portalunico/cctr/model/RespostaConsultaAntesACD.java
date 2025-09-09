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
import java.time.OffsetDateTime;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RespostaConsultaAntesACD", propOrder =
        {"sequenciaDeposito", "tipo", "codigoURF", "latitude", "numeroNF", "codigoNCM", "anoDeposito", "codigoRA", "idResponsavel", "dataEmissaoNF", "existeConteiner", "numeroDocumento", "numeroItem", "dataCriacao", "nomeResponsavel", "longitude"
        })

@XmlRootElement(name = "RespostaConsultaAntesACD")
/**
 * Resposta da consulta antes ACD
 **/
@ApiModel(description = "Resposta da consulta antes ACD")
public class RespostaConsultaAntesACD {

    @XmlElement(name = "sequenciaDeposito")
    @ApiModelProperty(example = "4210660.0", value = "Tamanho máximo: 10<br>Formato: NNNNNNNNNN")
    @Valid
    /**
     * Tamanho máximo: 10<br>Formato: NNNNNNNNNN
     **/
    private BigDecimal sequenciaDeposito = null;
    @XmlElement(name = "tipo")
    @ApiModelProperty(example = "NF-e", value = "Tipo do documento<br>Só pode ser DUE ou NF-e")
    /**
     * Tipo do documento<br>Só pode ser DUE ou NF-e
     **/
    private TipoEnum tipo = null;
    @XmlElement(name = "codigoURF")
    @ApiModelProperty(example = "717700.0", value = "Código da Unidade de Região Fiscal<br>Tamanho Máximo: 7<br>Formato: NNNNNNN")
    @Valid
    /**
     * Código da Unidade de Região Fiscal<br>Tamanho Máximo: 7<br>Formato: NNNNNNN
     **/
    private BigDecimal codigoURF = null;
    @XmlElement(name = "latitude")
    @ApiModelProperty(example = "-22.812222", value = "Latitude do local<br>Coordenadas geográficas em graus decimais<br>Formato: NN.NNNNNN ou -NN.NNNNNN")
    /**
     * Latitude do local<br>Coordenadas geográficas em graus decimais<br>Formato: NN.NNNNNN ou -NN.NNNNNN
     **/
    private String latitude = null;
    @XmlElement(name = "numeroNF")
    @ApiModelProperty(example = "20544618", value = "Chave de Acesso da Nota Fiscal Eletrônica<br>Tamanho: 44<br>Formato: NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN")
    /**
     * Chave de Acesso da Nota Fiscal Eletrônica<br>Tamanho: 44<br>Formato: NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN
     **/
    private Integer numeroNF = null;
    @XmlElement(name = "codigoNCM")
    @ApiModelProperty(example = "12011000", value = "Código NCM do produto<br>Tamanho: 8<br>Formato: NNNNNNNN")
    /**
     * Código NCM do produto<br>Tamanho: 8<br>Formato: NNNNNNNN
     **/
    private Integer codigoNCM = null;
    @XmlElement(name = "anoDeposito")
    @ApiModelProperty(example = "2024.0", value = "Tamanho: 4<br>Formato: NNNN")
    @Valid
    /**
     * Tamanho: 4<br>Formato: NNNN
     **/
    private BigDecimal anoDeposito = null;
    @XmlElement(name = "codigoRA")
    @ApiModelProperty(example = "7911101.0", value = "Código do Recinto Aduaneiro<br>Tamanho: 7<br>Formato: NNNNNNN")
    @Valid
    /**
     * Código do Recinto Aduaneiro<br>Tamanho: 7<br>Formato: NNNNNNN
     **/
    private BigDecimal codigoRA = null;
    @XmlElement(name = "idResponsavel")
    @ApiModelProperty(example = "07396865000168", value = "CPF ou CNPJ do responsável pelo estoque<br>Tamanho máximo: 14<br>Formato: NNNNNNNNNNNNNN")
    /**
     * CPF ou CNPJ do responsável pelo estoque<br>Tamanho máximo: 14<br>Formato: NNNNNNNNNNNNNN
     **/
    private String idResponsavel = null;
    @XmlElement(name = "dataEmissaoNF")
    @ApiModelProperty(value = "Tamanho: 13<br>Formato: NNNNNNNNNNNNN")
    /**
     * Tamanho: 13<br>Formato: NNNNNNNNNNNNN
     **/
    private OffsetDateTime dataEmissaoNF = null;
    @XmlElement(name = "existeConteiner")
    @ApiModelProperty(example = "N", value = "Tamanho: 1")
    /**
     * Tamanho: 1
     **/
    private ExisteConteinerEnum existeConteiner = null;
    @XmlElement(name = "numeroDocumento")
    @ApiModelProperty(example = "20544618", value = "Número do documento de transporte<br>Tamanho mínimo: 5<br>Tamanho máximo: 15<br>Formato: NNNNNNNNNNNNNNN")
    /**
     * Número do documento de transporte<br>Tamanho mínimo: 5<br>Tamanho máximo: 15<br>Formato: NNNNNNNNNNNNNNN
     **/
    private String numeroDocumento = null;
    @XmlElement(name = "numeroItem")
    @ApiModelProperty(example = "1.0", value = "Número do Item da Nota Fiscal Eletrônica<br>Tamanho máximo: 4<br>Formato: NNNN")
    @Valid
    /**
     * Número do Item da Nota Fiscal Eletrônica<br>Tamanho máximo: 4<br>Formato: NNNN
     **/
    private BigDecimal numeroItem = null;
    @XmlElement(name = "dataCriacao")
    @ApiModelProperty(value = "Tamanho: 13<br>Formato: NNNNNNNNNNNNN")
    /**
     * Tamanho: 13<br>Formato: NNNNNNNNNNNNN
     **/
    private OffsetDateTime dataCriacao = null;
    @XmlElement(name = "nomeResponsavel")
    @ApiModelProperty(example = "MOCK Testes Integrados", value = "Tamanho máximo: 60<br>Formato: AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA")
    /**
     * Tamanho máximo: 60<br>Formato: AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
     **/
    private String nomeResponsavel = null;
    @XmlElement(name = "longitude")
    @ApiModelProperty(example = "-43.248333", value = "Longitude do local<br>Coordenadas geográficas em graus decimais<br>Formato: NN.NNNNNN ou -NN.NNNNNN")
    /**
     * Longitude do local<br>Coordenadas geográficas em graus decimais<br>Formato: NN.NNNNNN ou -NN.NNNNNN
     **/
    private String longitude = null;

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

    public RespostaConsultaAntesACD sequenciaDeposito(BigDecimal sequenciaDeposito) {
        this.sequenciaDeposito = sequenciaDeposito;
        return this;
    }

    /**
     * Tipo do documento&lt;br&gt;Só pode ser DUE ou NF-e
     *
     * @return tipo
     **/
    @JsonProperty("tipo")
    public String getTipo() {
        if (tipo == null) {
            return null;
        }
        return tipo.value();
    }

    public void setTipo(TipoEnum tipo) {
        this.tipo = tipo;
    }

    public RespostaConsultaAntesACD tipo(TipoEnum tipo) {
        this.tipo = tipo;
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

    public RespostaConsultaAntesACD codigoURF(BigDecimal codigoURF) {
        this.codigoURF = codigoURF;
        return this;
    }

    /**
     * Latitude do local&lt;br&gt;Coordenadas geográficas em graus decimais&lt;br&gt;Formato: NN.NNNNNN ou -NN.NNNNNN
     *
     * @return latitude
     **/
    @JsonProperty("latitude")
    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public RespostaConsultaAntesACD latitude(String latitude) {
        this.latitude = latitude;
        return this;
    }

    /**
     * Chave de Acesso da Nota Fiscal Eletrônica&lt;br&gt;Tamanho: 44&lt;br&gt;Formato: NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN
     *
     * @return numeroNF
     **/
    @JsonProperty("numeroNF")
    public Integer getNumeroNF() {
        return numeroNF;
    }

    public void setNumeroNF(Integer numeroNF) {
        this.numeroNF = numeroNF;
    }

    public RespostaConsultaAntesACD numeroNF(Integer numeroNF) {
        this.numeroNF = numeroNF;
        return this;
    }

    /**
     * Código NCM do produto&lt;br&gt;Tamanho: 8&lt;br&gt;Formato: NNNNNNNN
     *
     * @return codigoNCM
     **/
    @JsonProperty("codigoNCM")
    public Integer getCodigoNCM() {
        return codigoNCM;
    }

    public void setCodigoNCM(Integer codigoNCM) {
        this.codigoNCM = codigoNCM;
    }

    public RespostaConsultaAntesACD codigoNCM(Integer codigoNCM) {
        this.codigoNCM = codigoNCM;
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

    public RespostaConsultaAntesACD anoDeposito(BigDecimal anoDeposito) {
        this.anoDeposito = anoDeposito;
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

    public RespostaConsultaAntesACD codigoRA(BigDecimal codigoRA) {
        this.codigoRA = codigoRA;
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

    public RespostaConsultaAntesACD idResponsavel(String idResponsavel) {
        this.idResponsavel = idResponsavel;
        return this;
    }

    /**
     * Tamanho: 13&lt;br&gt;Formato: NNNNNNNNNNNNN
     *
     * @return dataEmissaoNF
     **/
    @JsonProperty("dataEmissaoNF")
    public OffsetDateTime getDataEmissaoNF() {
        return dataEmissaoNF;
    }

    public void setDataEmissaoNF(OffsetDateTime dataEmissaoNF) {
        this.dataEmissaoNF = dataEmissaoNF;
    }

    public RespostaConsultaAntesACD dataEmissaoNF(OffsetDateTime dataEmissaoNF) {
        this.dataEmissaoNF = dataEmissaoNF;
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

    public RespostaConsultaAntesACD existeConteiner(ExisteConteinerEnum existeConteiner) {
        this.existeConteiner = existeConteiner;
        return this;
    }

    /**
     * Número do documento de transporte&lt;br&gt;Tamanho mínimo: 5&lt;br&gt;Tamanho máximo: 15&lt;br&gt;Formato: NNNNNNNNNNNNNNN
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

    public RespostaConsultaAntesACD numeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
        return this;
    }

    /**
     * Número do Item da Nota Fiscal Eletrônica&lt;br&gt;Tamanho máximo: 4&lt;br&gt;Formato: NNNN
     *
     * @return numeroItem
     **/
    @JsonProperty("numeroItem")
    public BigDecimal getNumeroItem() {
        return numeroItem;
    }

    public void setNumeroItem(BigDecimal numeroItem) {
        this.numeroItem = numeroItem;
    }

    public RespostaConsultaAntesACD numeroItem(BigDecimal numeroItem) {
        this.numeroItem = numeroItem;
        return this;
    }

    /**
     * Tamanho: 13&lt;br&gt;Formato: NNNNNNNNNNNNN
     *
     * @return dataCriacao
     **/
    @JsonProperty("dataCriacao")
    public OffsetDateTime getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(OffsetDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public RespostaConsultaAntesACD dataCriacao(OffsetDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
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

    public RespostaConsultaAntesACD nomeResponsavel(String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
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

    public RespostaConsultaAntesACD longitude(String longitude) {
        this.longitude = longitude;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class RespostaConsultaAntesACD {\n" +
                "    sequenciaDeposito: " + toIndentedString(sequenciaDeposito) + "\n" +
                "    tipo: " + toIndentedString(tipo) + "\n" +
                "    codigoURF: " + toIndentedString(codigoURF) + "\n" +
                "    latitude: " + toIndentedString(latitude) + "\n" +
                "    numeroNF: " + toIndentedString(numeroNF) + "\n" +
                "    codigoNCM: " + toIndentedString(codigoNCM) + "\n" +
                "    anoDeposito: " + toIndentedString(anoDeposito) + "\n" +
                "    codigoRA: " + toIndentedString(codigoRA) + "\n" +
                "    idResponsavel: " + toIndentedString(idResponsavel) + "\n" +
                "    dataEmissaoNF: " + toIndentedString(dataEmissaoNF) + "\n" +
                "    existeConteiner: " + toIndentedString(existeConteiner) + "\n" +
                "    numeroDocumento: " + toIndentedString(numeroDocumento) + "\n" +
                "    numeroItem: " + toIndentedString(numeroItem) + "\n" +
                "    dataCriacao: " + toIndentedString(dataCriacao) + "\n" +
                "    nomeResponsavel: " + toIndentedString(nomeResponsavel) + "\n" +
                "    longitude: " + toIndentedString(longitude) + "\n" +
                "}";
        return sb;
    }


    @XmlType(name = "TipoEnum")
    @XmlEnum(String.class)
    public enum TipoEnum {

        @XmlEnumValue("DUE")
        @JsonProperty("DUE")
        DUE("DUE"),

        @XmlEnumValue("NF-e")
        @JsonProperty("NF-e")
        NF_E("NF-e");


        private final String value;

        TipoEnum(String v) {
            value = v;
        }

        public static TipoEnum fromValue(String v) {
            for (TipoEnum b : TipoEnum.values()) {
                if (String.valueOf(b.value).equals(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "' to TipoEnum");
        }

        public String value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
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
