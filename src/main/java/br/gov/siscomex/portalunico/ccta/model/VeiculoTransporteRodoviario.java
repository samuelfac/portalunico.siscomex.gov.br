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
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VeiculoTransporteRodoviario", propOrder =
        {"marca", "complementos", "transportadorProprietarioVeiculo", "anoFabricacao", "chassi", "capacidadeTracao"
        })

@XmlRootElement(name = "VeiculoTransporteRodoviario")
public class VeiculoTransporteRodoviario {

    @XmlElement(name = "marca")
    @ApiModelProperty(example = "VW", value = "Marca do veículo da viagem<br/> Tamanho Máximo: 20")
    /**
     * Marca do veículo da viagem<br/> Tamanho Máximo: 20
     **/
    private String marca = null;

    @XmlElement(name = "complementos")
    @ApiModelProperty(value = "")
    @Valid
    private List<ComplementoVeiculoRodoviario> complementos = null;

    @XmlElement(name = "transportadorProprietarioVeiculo")
    @ApiModelProperty(value = "Indicador que informa se o transportador é o proprietário do veículo")
    /**
     * Indicador que informa se o transportador é o proprietário do veículo
     **/
    private Boolean transportadorProprietarioVeiculo = null;

    @XmlElement(name = "anoFabricacao")
    @ApiModelProperty(example = "2010", value = "Ano de fabricação do veículo da viagem<br/> Tamanho: 4<br/> Formato: inteiro de 4 dígitos")
    /**
     * Ano de fabricação do veículo da viagem<br/> Tamanho: 4<br/> Formato: inteiro de 4 dígitos
     **/
    private Integer anoFabricacao = null;

    @XmlElement(name = "chassi")
    @ApiModelProperty(example = "2WXR0U5O8S8SRRB8P", value = "Chassi do veículo da viagem<br/> Tamanho Máximo: 20")
    /**
     * Chassi do veículo da viagem<br/> Tamanho Máximo: 20
     **/
    private String chassi = null;

    @XmlElement(name = "capacidadeTracao")
    @ApiModelProperty(value = "Capacidade de tração do veículo em toneladas<br/>Formato: Número Racional com 9 casas inteiras e 3 casas decimais")
    @Valid
    /**
     * Capacidade de tração do veículo em toneladas<br/>Formato: Número Racional com 9 casas inteiras e 3 casas decimais
     **/
    private BigDecimal capacidadeTracao = null;

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
     * Marca do veículo da viagem&lt;br/&gt; Tamanho Máximo: 20
     *
     * @return marca
     **/
    @JsonProperty("marca")
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public VeiculoTransporteRodoviario marca(String marca) {
        this.marca = marca;
        return this;
    }

    /**
     * Get complementos
     *
     * @return complementos
     **/
    @JsonProperty("complementos")
    public List<ComplementoVeiculoRodoviario> getComplementos() {
        return complementos;
    }

    public void setComplementos(List<ComplementoVeiculoRodoviario> complementos) {
        this.complementos = complementos;
    }

    public VeiculoTransporteRodoviario complementos(List<ComplementoVeiculoRodoviario> complementos) {
        this.complementos = complementos;
        return this;
    }

    public VeiculoTransporteRodoviario addComplementosItem(ComplementoVeiculoRodoviario complementosItem) {
        this.complementos.add(complementosItem);
        return this;
    }

    /**
     * Indicador que informa se o transportador é o proprietário do veículo
     *
     * @return transportadorProprietarioVeiculo
     **/
    @JsonProperty("transportadorProprietarioVeiculo")
    public Boolean isisTransportadorProprietarioVeiculo() {
        return transportadorProprietarioVeiculo;
    }

    public void setTransportadorProprietarioVeiculo(Boolean transportadorProprietarioVeiculo) {
        this.transportadorProprietarioVeiculo = transportadorProprietarioVeiculo;
    }

    public VeiculoTransporteRodoviario transportadorProprietarioVeiculo(Boolean transportadorProprietarioVeiculo) {
        this.transportadorProprietarioVeiculo = transportadorProprietarioVeiculo;
        return this;
    }

    /**
     * Ano de fabricação do veículo da viagem&lt;br/&gt; Tamanho: 4&lt;br/&gt; Formato: inteiro de 4 dígitos
     *
     * @return anoFabricacao
     **/
    @JsonProperty("anoFabricacao")
    public Integer getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(Integer anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public VeiculoTransporteRodoviario anoFabricacao(Integer anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
        return this;
    }

    /**
     * Chassi do veículo da viagem&lt;br/&gt; Tamanho Máximo: 20
     *
     * @return chassi
     **/
    @JsonProperty("chassi")
    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public VeiculoTransporteRodoviario chassi(String chassi) {
        this.chassi = chassi;
        return this;
    }

    /**
     * Capacidade de tração do veículo em toneladas&lt;br/&gt;Formato: Número Racional com 9 casas inteiras e 3 casas decimais
     *
     * @return capacidadeTracao
     **/
    @JsonProperty("capacidadeTracao")
    public BigDecimal getCapacidadeTracao() {
        return capacidadeTracao;
    }

    public void setCapacidadeTracao(BigDecimal capacidadeTracao) {
        this.capacidadeTracao = capacidadeTracao;
    }

    public VeiculoTransporteRodoviario capacidadeTracao(BigDecimal capacidadeTracao) {
        this.capacidadeTracao = capacidadeTracao;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class VeiculoTransporteRodoviario {\n" +
                "    marca: " + toIndentedString(marca) + "\n" +
                "    complementos: " + toIndentedString(complementos) + "\n" +
                "    transportadorProprietarioVeiculo: " + toIndentedString(transportadorProprietarioVeiculo) + "\n" +
                "    anoFabricacao: " + toIndentedString(anoFabricacao) + "\n" +
                "    chassi: " + toIndentedString(chassi) + "\n" +
                "    capacidadeTracao: " + toIndentedString(capacidadeTracao) + "\n" +
                "}";
        return sb;
    }
}
