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
@XmlType(name = "ComplementoVeiculoRodoviario", propOrder =
        {"lacres", "placa", "propriaMercadoria", "sequencial", "tara", "tipo"
        })

@XmlRootElement(name = "ComplementoVeiculoRodoviario")
public class ComplementoVeiculoRodoviario {

    @XmlElement(name = "lacres")
    @ApiModelProperty(example = "[\"123\"]", value = "Lista de Lacres")
    /**
     * Lista de Lacres
     **/
    private List<String> lacres = null;

    @XmlElement(name = "placa")
    @ApiModelProperty(example = "REB6789", value = "Placa do reboque <br/>É obrigatória apenas se o reboquePropriaMercadoria for igual a \"false\".<br/> Tamanho Máximo: 20")
    /**
     * Placa do reboque <br/>É obrigatória apenas se o reboquePropriaMercadoria for igual a \"false\".<br/> Tamanho Máximo: 20
     **/
    private String placa = null;

    @XmlElement(name = "propriaMercadoria")
    @ApiModelProperty(value = "Indicador que informa se o reboque é a própria mercadoria")
    /**
     * Indicador que informa se o reboque é a própria mercadoria
     **/
    private Boolean propriaMercadoria = null;

    @XmlElement(name = "sequencial")
    @ApiModelProperty(example = "1", value = "Sequencial da lista de complemento de veículo")
    /**
     * Sequencial da lista de complemento de veículo
     **/
    private Integer sequencial = null;

    @XmlElement(name = "tara")
    @ApiModelProperty(example = "105.478", value = "Tara do reboque<br/> Obrigatória para cada reboque informado se tipoVeiculo é C1R, C2R ou C3R.<br/>Formato: Número Racional com 9 casas inteiras e 3 casas decimais")
    @Valid
    /**
     * Tara do reboque<br/> Obrigatória para cada reboque informado se tipoVeiculo é C1R, C2R ou C3R.<br/>Formato: Número Racional com 9 casas inteiras e 3 casas decimais
     **/
    private BigDecimal tara = null;

    @XmlElement(name = "tipo")
    @ApiModelProperty(value = "")
    @Valid
    private TipoComplementoVeiculo tipo = null;

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
     * Lista de Lacres
     *
     * @return lacres
     **/
    @JsonProperty("lacres")
    public List<String> getLacres() {
        return lacres;
    }

    public void setLacres(List<String> lacres) {
        this.lacres = lacres;
    }

    public ComplementoVeiculoRodoviario lacres(List<String> lacres) {
        this.lacres = lacres;
        return this;
    }

    public ComplementoVeiculoRodoviario addLacresItem(String lacresItem) {
        this.lacres.add(lacresItem);
        return this;
    }

    /**
     * Placa do reboque &lt;br/&gt;É obrigatória apenas se o reboquePropriaMercadoria for igual a \&quot;false\&quot;.&lt;br/&gt; Tamanho Máximo: 20
     *
     * @return placa
     **/
    @JsonProperty("placa")
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     * Indicador que informa se o reboque é a própria mercadoria
     *
     * @return propriaMercadoria
     **/
    @JsonProperty("propriaMercadoria")
    public Boolean isisPropriaMercadoria() {
        return propriaMercadoria;
    }

    public void setPropriaMercadoria(Boolean propriaMercadoria) {
        this.propriaMercadoria = propriaMercadoria;
    }

    public ComplementoVeiculoRodoviario propriaMercadoria(Boolean propriaMercadoria) {
        this.propriaMercadoria = propriaMercadoria;
        return this;
    }

    /**
     * Sequencial da lista de complemento de veículo
     *
     * @return sequencial
     **/
    @JsonProperty("sequencial")
    public Integer getSequencial() {
        return sequencial;
    }

    public void setSequencial(Integer sequencial) {
        this.sequencial = sequencial;
    }

    public ComplementoVeiculoRodoviario sequencial(Integer sequencial) {
        this.sequencial = sequencial;
        return this;
    }

    /**
     * Tara do reboque&lt;br/&gt; Obrigatória para cada reboque informado se tipoVeiculo é C1R, C2R ou C3R.&lt;br/&gt;Formato: Número Racional com 9 casas inteiras e 3 casas decimais
     *
     * @return tara
     **/
    @JsonProperty("tara")
    public BigDecimal getTara() {
        return tara;
    }

    public void setTara(BigDecimal tara) {
        this.tara = tara;
    }

    public ComplementoVeiculoRodoviario tara(BigDecimal tara) {
        this.tara = tara;
        return this;
    }

    public ComplementoVeiculoRodoviario placa(String placa) {
        this.placa = placa;
        return this;
    }

    /**
     * Get tipo
     *
     * @return tipo
     **/
    @JsonProperty("tipo")
    public TipoComplementoVeiculo getTipo() {
        return tipo;
    }

    public void setTipo(TipoComplementoVeiculo tipo) {
        this.tipo = tipo;
    }

    public ComplementoVeiculoRodoviario tipo(TipoComplementoVeiculo tipo) {
        this.tipo = tipo;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class ComplementoVeiculoRodoviario {\n" +
                "    lacres: " + toIndentedString(lacres) + "\n" +
                "    placa: " + toIndentedString(placa) + "\n" +
                "    propriaMercadoria: " + toIndentedString(propriaMercadoria) + "\n" +
                "    sequencial: " + toIndentedString(sequencial) + "\n" +
                "    tara: " + toIndentedString(tara) + "\n" +
                "    tipo: " + toIndentedString(tipo) + "\n" +
                "}";
        return sb;
    }
}
