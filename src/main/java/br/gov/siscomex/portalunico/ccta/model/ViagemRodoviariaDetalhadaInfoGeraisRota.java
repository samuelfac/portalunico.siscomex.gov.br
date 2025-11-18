package br.gov.siscomex.portalunico.ccta.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.time.LocalDate;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ViagemRodoviariaDetalhadaInfoGeraisRota", propOrder =
        {"alfandegaPartida", "cidadeDestinoFinal", "cidadePartida", "dataPrevistaDestinoFinal", "dataPrevistaEntrada", "descricaoRotaInternacional", "numeroDTAExterior", "paisDestinoFinal", "paisPartida", "recintoAduaneiroEntrada", "unidadeRFBEntrada"
        })

@XmlRootElement(name = "ViagemRodoviariaDetalhadaInfoGeraisRota")
public class ViagemRodoviariaDetalhadaInfoGeraisRota {

    @XmlElement(name = "alfandegaPartida")
    @ApiModelProperty(value = "")
    @Valid
    private Recinto alfandegaPartida = null;

    @XmlElement(name = "cidadeDestinoFinal")
    @ApiModelProperty(value = "")
    @Valid
    private Cidade cidadeDestinoFinal = null;

    @XmlElement(name = "cidadePartida")
    @ApiModelProperty(value = "")
    @Valid
    private Cidade cidadePartida = null;

    @XmlElement(name = "dataPrevistaDestinoFinal")
    @ApiModelProperty(example = "Fri Aug 07 02:00:00 CEST 2020", value = "Data prevista de chegada do veículo na cidade de destino final viagem<br/>Formato: yyyy-MM-dd")
    /**
     * Data prevista de chegada do veículo na cidade de destino final viagem<br/>Formato: yyyy-MM-dd
     **/
    private LocalDate dataPrevistaDestinoFinal = null;

    @XmlElement(name = "dataPrevistaEntrada")
    @ApiModelProperty(example = "Fri Aug 07 02:00:00 CEST 2020", value = "Data prevista de chegada do veículo na Aduana de entrada no Brasil<br/>Formato: yyyy-MM-dd")
    /**
     * Data prevista de chegada do veículo na Aduana de entrada no Brasil<br/>Formato: yyyy-MM-dd
     **/
    private LocalDate dataPrevistaEntrada = null;

    @XmlElement(name = "descricaoRotaInternacional", required = true)
    @ApiModelProperty(example = "Descrição da rota internacional", required = true, value = "Descrição da rota internacional desde local de partida até a cidade de destino final<br/> Tamanho Máximo: 500")
    /**
     * Descrição da rota internacional desde local de partida até a cidade de destino final<br/> Tamanho Máximo: 500
     **/
    private String descricaoRotaInternacional = null;

    @XmlElement(name = "numeroDTAExterior")
    @ApiModelProperty(example = "15656489854988", value = "Número da declaração de trânsito no exterior, quando ocorrer<br/> Tamanho Máximo: 20")
    /**
     * Número da declaração de trânsito no exterior, quando ocorrer<br/> Tamanho Máximo: 20
     **/
    private String numeroDTAExterior = null;

    @XmlElement(name = "paisDestinoFinal")
    @ApiModelProperty(value = "")
    @Valid
    private Pais paisDestinoFinal = null;

    @XmlElement(name = "paisPartida")
    @ApiModelProperty(value = "")
    @Valid
    private Pais paisPartida = null;

    @XmlElement(name = "recintoAduaneiroEntrada")
    @ApiModelProperty(value = "")
    @Valid
    private Recinto recintoAduaneiroEntrada = null;

    @XmlElement(name = "unidadeRFBEntrada")
    @ApiModelProperty(value = "")
    @Valid
    private UnidadeRfb unidadeRFBEntrada = null;

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
     * Get alfandegaPartida
     *
     * @return alfandegaPartida
     **/
    @JsonProperty("alfandegaPartida")
    public Recinto getAlfandegaPartida() {
        return alfandegaPartida;
    }

    public void setAlfandegaPartida(Recinto alfandegaPartida) {
        this.alfandegaPartida = alfandegaPartida;
    }

    /**
     * Get cidadeDestinoFinal
     *
     * @return cidadeDestinoFinal
     **/
    @JsonProperty("cidadeDestinoFinal")
    public Cidade getCidadeDestinoFinal() {
        return cidadeDestinoFinal;
    }

    public void setCidadeDestinoFinal(Cidade cidadeDestinoFinal) {
        this.cidadeDestinoFinal = cidadeDestinoFinal;
    }

    public ViagemRodoviariaDetalhadaInfoGeraisRota cidadeDestinoFinal(Cidade cidadeDestinoFinal) {
        this.cidadeDestinoFinal = cidadeDestinoFinal;
        return this;
    }

    /**
     * Get cidadePartida
     *
     * @return cidadePartida
     **/
    @JsonProperty("cidadePartida")
    public Cidade getCidadePartida() {
        return cidadePartida;
    }

    public void setCidadePartida(Cidade cidadePartida) {
        this.cidadePartida = cidadePartida;
    }

    public ViagemRodoviariaDetalhadaInfoGeraisRota cidadePartida(Cidade cidadePartida) {
        this.cidadePartida = cidadePartida;
        return this;
    }

    /**
     * Data prevista de chegada do veículo na cidade de destino final viagem&lt;br/&gt;Formato: yyyy-MM-dd
     *
     * @return dataPrevistaDestinoFinal
     **/
    @JsonProperty("dataPrevistaDestinoFinal")
    public LocalDate getDataPrevistaDestinoFinal() {
        return dataPrevistaDestinoFinal;
    }

    public void setDataPrevistaDestinoFinal(LocalDate dataPrevistaDestinoFinal) {
        this.dataPrevistaDestinoFinal = dataPrevistaDestinoFinal;
    }

    public ViagemRodoviariaDetalhadaInfoGeraisRota dataPrevistaDestinoFinal(LocalDate dataPrevistaDestinoFinal) {
        this.dataPrevistaDestinoFinal = dataPrevistaDestinoFinal;
        return this;
    }

    /**
     * Data prevista de chegada do veículo na Aduana de entrada no Brasil&lt;br/&gt;Formato: yyyy-MM-dd
     *
     * @return dataPrevistaEntrada
     **/
    @JsonProperty("dataPrevistaEntrada")
    public LocalDate getDataPrevistaEntrada() {
        return dataPrevistaEntrada;
    }

    public void setDataPrevistaEntrada(LocalDate dataPrevistaEntrada) {
        this.dataPrevistaEntrada = dataPrevistaEntrada;
    }

    public ViagemRodoviariaDetalhadaInfoGeraisRota dataPrevistaEntrada(LocalDate dataPrevistaEntrada) {
        this.dataPrevistaEntrada = dataPrevistaEntrada;
        return this;
    }

    public ViagemRodoviariaDetalhadaInfoGeraisRota alfandegaPartida(Recinto alfandegaPartida) {
        this.alfandegaPartida = alfandegaPartida;
        return this;
    }

    /**
     * Descrição da rota internacional desde local de partida até a cidade de destino final&lt;br/&gt; Tamanho Máximo: 500
     *
     * @return descricaoRotaInternacional
     **/
    @JsonProperty("descricaoRotaInternacional")
    @NotNull
    public String getDescricaoRotaInternacional() {
        return descricaoRotaInternacional;
    }

    public void setDescricaoRotaInternacional(String descricaoRotaInternacional) {
        this.descricaoRotaInternacional = descricaoRotaInternacional;
    }

    public ViagemRodoviariaDetalhadaInfoGeraisRota descricaoRotaInternacional(String descricaoRotaInternacional) {
        this.descricaoRotaInternacional = descricaoRotaInternacional;
        return this;
    }

    /**
     * Número da declaração de trânsito no exterior, quando ocorrer&lt;br/&gt; Tamanho Máximo: 20
     *
     * @return numeroDTAExterior
     **/
    @JsonProperty("numeroDTAExterior")
    public String getNumeroDTAExterior() {
        return numeroDTAExterior;
    }

    public void setNumeroDTAExterior(String numeroDTAExterior) {
        this.numeroDTAExterior = numeroDTAExterior;
    }

    /**
     * Get paisDestinoFinal
     *
     * @return paisDestinoFinal
     **/
    @JsonProperty("paisDestinoFinal")
    public Pais getPaisDestinoFinal() {
        return paisDestinoFinal;
    }

    public void setPaisDestinoFinal(Pais paisDestinoFinal) {
        this.paisDestinoFinal = paisDestinoFinal;
    }

    public ViagemRodoviariaDetalhadaInfoGeraisRota paisDestinoFinal(Pais paisDestinoFinal) {
        this.paisDestinoFinal = paisDestinoFinal;
        return this;
    }

    /**
     * Get paisPartida
     * @return paisPartida
     **/
    @JsonProperty("paisPartida")
    public Pais getPaisPartida() {
        return paisPartida;
    }

    public void setPaisPartida(Pais paisPartida) {
        this.paisPartida = paisPartida;
    }

    public ViagemRodoviariaDetalhadaInfoGeraisRota paisPartida(Pais paisPartida) {
        this.paisPartida = paisPartida;
        return this;
    }

    /**
     * Get recintoAduaneiroEntrada
     *
     * @return recintoAduaneiroEntrada
     **/
    @JsonProperty("recintoAduaneiroEntrada")
    public Recinto getRecintoAduaneiroEntrada() {
        return recintoAduaneiroEntrada;
    }

    public void setRecintoAduaneiroEntrada(Recinto recintoAduaneiroEntrada) {
        this.recintoAduaneiroEntrada = recintoAduaneiroEntrada;
    }

    public ViagemRodoviariaDetalhadaInfoGeraisRota recintoAduaneiroEntrada(Recinto recintoAduaneiroEntrada) {
        this.recintoAduaneiroEntrada = recintoAduaneiroEntrada;
        return this;
    }

    /**
     * Get unidadeRFBEntrada
     * @return unidadeRFBEntrada
     **/
    @JsonProperty("unidadeRFBEntrada")
    public UnidadeRfb getUnidadeRFBEntrada() {
        return unidadeRFBEntrada;
    }

    public void setUnidadeRFBEntrada(UnidadeRfb unidadeRFBEntrada) {
        this.unidadeRFBEntrada = unidadeRFBEntrada;
    }

    public ViagemRodoviariaDetalhadaInfoGeraisRota unidadeRFBEntrada(UnidadeRfb unidadeRFBEntrada) {
        this.unidadeRFBEntrada = unidadeRFBEntrada;
        return this;
    }

    public ViagemRodoviariaDetalhadaInfoGeraisRota numeroDTAExterior(String numeroDTAExterior) {
        this.numeroDTAExterior = numeroDTAExterior;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class ViagemRodoviariaDetalhadaInfoGeraisRota {\n" +
                "    alfandegaPartida: " + toIndentedString(alfandegaPartida) + "\n" +
                "    cidadeDestinoFinal: " + toIndentedString(cidadeDestinoFinal) + "\n" +
                "    cidadePartida: " + toIndentedString(cidadePartida) + "\n" +
                "    dataPrevistaDestinoFinal: " + toIndentedString(dataPrevistaDestinoFinal) + "\n" +
                "    dataPrevistaEntrada: " + toIndentedString(dataPrevistaEntrada) + "\n" +
                "    descricaoRotaInternacional: " + toIndentedString(descricaoRotaInternacional) + "\n" +
                "    numeroDTAExterior: " + toIndentedString(numeroDTAExterior) + "\n" +
                "    paisDestinoFinal: " + toIndentedString(paisDestinoFinal) + "\n" +
                "    paisPartida: " + toIndentedString(paisPartida) + "\n" +
                "    recintoAduaneiroEntrada: " + toIndentedString(recintoAduaneiroEntrada) + "\n" +
                "    unidadeRFBEntrada: " + toIndentedString(unidadeRFBEntrada) + "\n" +
                "}";
        return sb;
    }
}
