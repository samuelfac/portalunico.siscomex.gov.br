package br.gov.siscomex.portalunico.ccta.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChaveViagem", propOrder =
        {"aeroportoChegada", "dataHoraChegadaEfetiva", "identificacaoViagem", "termoEntrada"
        })

@XmlRootElement(name = "ChaveViagem")
public class ChaveViagem {

    @XmlElement(name = "aeroportoChegada")
    @ApiModelProperty(example = "GIG", value = "Código IATA do aeroporto<br/>Tamanho: 3")
    /**
     * Código IATA do aeroporto<br/>Tamanho: 3
     **/
    private String aeroportoChegada = null;

    @XmlElement(name = "dataHoraChegadaEfetiva")
    @ApiModelProperty(example = "2020-04-08T15:30:00-03:00", value = "Data/Hora de chegada efetiva.<br/> Formato: yyyy-MM-dd'T'HH:mm:ssZ")
    /**
     * Data/Hora de chegada efetiva.<br/> Formato: yyyy-MM-dd'T'HH:mm:ssZ
     **/
    private String dataHoraChegadaEfetiva = null;

    @XmlElement(name = "identificacaoViagem")
    @ApiModelProperty(example = "XX099020200922MIA", value = "Número de identificação do manifesto<br/>Tamanho: 17")
    /**
     * Número de identificação do manifesto<br/>Tamanho: 17
     **/
    private String identificacaoViagem = null;

    @XmlElement(name = "termoEntrada")
    @ApiModelProperty(example = "200027913", value = "Número de identificação do termo de entrada")
    /**
     * Número de identificação do termo de entrada
     **/
    private String termoEntrada = null;

    /**
     * Código IATA do aeroporto&lt;br/&gt;Tamanho: 3
     *
     * @return aeroportoChegada
     **/
    @JsonProperty("aeroportoChegada")
    public String getAeroportoChegada() {
        return aeroportoChegada;
    }

    public void setAeroportoChegada(String aeroportoChegada) {
        this.aeroportoChegada = aeroportoChegada;
    }

    public ChaveViagem aeroportoChegada(String aeroportoChegada) {
        this.aeroportoChegada = aeroportoChegada;
        return this;
    }

    /**
     * Data/Hora de chegada efetiva.&lt;br/&gt; Formato: yyyy-MM-dd&#39;T&#39;HH:mm:ssZ
     *
     * @return dataHoraChegadaEfetiva
     **/
    @JsonProperty("dataHoraChegadaEfetiva")
    public String getDataHoraChegadaEfetiva() {
        return dataHoraChegadaEfetiva;
    }

    public void setDataHoraChegadaEfetiva(String dataHoraChegadaEfetiva) {
        this.dataHoraChegadaEfetiva = dataHoraChegadaEfetiva;
    }

    public ChaveViagem dataHoraChegadaEfetiva(String dataHoraChegadaEfetiva) {
        this.dataHoraChegadaEfetiva = dataHoraChegadaEfetiva;
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
     * Número de identificação do manifesto&lt;br/&gt;Tamanho: 17
     *
     * @return identificacaoViagem
     **/
    @JsonProperty("identificacaoViagem")
    public String getIdentificacaoViagem() {
        return identificacaoViagem;
    }

    public void setIdentificacaoViagem(String identificacaoViagem) {
        this.identificacaoViagem = identificacaoViagem;
    }

    public ChaveViagem identificacaoViagem(String identificacaoViagem) {
        this.identificacaoViagem = identificacaoViagem;
        return this;
    }

    /**
     * Número de identificação do termo de entrada
     *
     * @return termoEntrada
     **/
    @JsonProperty("termoEntrada")
    public String getTermoEntrada() {
        return termoEntrada;
    }

    public void setTermoEntrada(String termoEntrada) {
        this.termoEntrada = termoEntrada;
    }

    public ChaveViagem termoEntrada(String termoEntrada) {
        this.termoEntrada = termoEntrada;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class ChaveViagem {\n" +
                "    aeroportoChegada: " + toIndentedString(aeroportoChegada) + "\n" +
                "    dataHoraChegadaEfetiva: " + toIndentedString(dataHoraChegadaEfetiva) + "\n" +
                "    identificacaoViagem: " + toIndentedString(identificacaoViagem) + "\n" +
                "    termoEntrada: " + toIndentedString(termoEntrada) + "\n" +
                "}";
        return sb;
    }
}
