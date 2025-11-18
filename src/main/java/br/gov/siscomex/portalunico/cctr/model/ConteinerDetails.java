package br.gov.siscomex.portalunico.cctr.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
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
@XmlType(name = "ConteinerDetails", propOrder =
        {"numeroConteiner", "tara", "lacres", "situacao"
        })

@XmlRootElement(name = "ConteinerDetails")
/**
 * Lista de contêineres
 **/
@ApiModel(description = "Lista de contêineres")
public class ConteinerDetails {

    @XmlElement(name = "numeroConteiner")
    @ApiModelProperty(example = "CT00667010", value = "Número do contêiner")
    /**
     * Número do contêiner
     **/
    private String numeroConteiner = null;

    @XmlElement(name = "tara")
    @ApiModelProperty(example = "100", value = "Tara do Contêiner")
    @Valid
    /**
     * Tara do Contêiner
     **/
    private BigDecimal tara = null;

    @XmlElement(name = "lacres")
    @ApiModelProperty(example = "LACRE001", value = "Números dos Lacres")
    /**
     * Números dos Lacres
     **/
    private List<String> lacres = null;

    @XmlElement(name = "situacao")
    @ApiModelProperty(example = "Disponível", value = "Descrição da situação")
    /**
     * Descrição da situação
     **/
    private String situacao = null;

    /**
     * Número do contêiner
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

    public ConteinerDetails numeroConteiner(String numeroConteiner) {
        this.numeroConteiner = numeroConteiner;
        return this;
    }

    /**
     * Tara do Contêiner
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

    public ConteinerDetails tara(BigDecimal tara) {
        this.tara = tara;
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
     * Números dos Lacres
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

    public ConteinerDetails lacres(List<String> lacres) {
        this.lacres = lacres;
        return this;
    }

    public ConteinerDetails addLacresItem(String lacresItem) {
        this.lacres.add(lacresItem);
        return this;
    }

    /**
     * Descrição da situação
     *
     * @return situacao
     **/
    @JsonProperty("situacao")
    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public ConteinerDetails situacao(String situacao) {
        this.situacao = situacao;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class ConteinerDetails {\n" +
                "    numeroConteiner: " + toIndentedString(numeroConteiner) + "\n" +
                "    tara: " + toIndentedString(tara) + "\n" +
                "    lacres: " + toIndentedString(lacres) + "\n" +
                "    situacao: " + toIndentedString(situacao) + "\n" +
                "}";
        return sb;
    }
}
