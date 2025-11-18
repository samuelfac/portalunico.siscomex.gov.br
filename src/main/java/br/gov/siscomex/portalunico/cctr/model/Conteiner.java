package br.gov.siscomex.portalunico.cctr.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Conteiner", propOrder =
        {"pesoAferido", "motivoNaoPesagem", "lacres"
        })

@XmlRootElement(name = "Conteiner")
/**
 * Dados do contêiner
 **/
@ApiModel(description = "Dados do contêiner")
public class Conteiner {

    @XmlElement(name = "pesoAferido")
    @ApiModelProperty(example = "123.123", value = "Peso aferido<br>Tamanho: 9,3")
    @Valid
    /**
     * Peso aferido<br>Tamanho: 9,3
     **/
    private BigDecimal pesoAferido = null;

    @XmlElement(name = "motivoNaoPesagem")
    @ApiModelProperty(example = "balança quebrada", value = "Motivo da não pesagem<br>Tamanho: 250")
    /**
     * Motivo da não pesagem<br>Tamanho: 250
     **/
    private String motivoNaoPesagem = null;

    @XmlElement(name = "lacres", required = true)
    @ApiModelProperty(example = "[123456,654321]", required = true, value = "Lista com os códigos dos lacres vinculados ao contêiner<br>Tamanho: 15")
    /**
     * Lista com os códigos dos lacres vinculados ao contêiner<br>Tamanho: 15
     **/
    private List<String> lacres = new ArrayList<>();

    /**
     * Peso aferido&lt;br&gt;Tamanho: 9,3
     *
     * @return pesoAferido
     **/
    @JsonProperty("pesoAferido")
    public BigDecimal getPesoAferido() {
        return pesoAferido;
    }

    public void setPesoAferido(BigDecimal pesoAferido) {
        this.pesoAferido = pesoAferido;
    }

    public Conteiner pesoAferido(BigDecimal pesoAferido) {
        this.pesoAferido = pesoAferido;
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
     * Motivo da não pesagem&lt;br&gt;Tamanho: 250
     *
     * @return motivoNaoPesagem
     **/
    @JsonProperty("motivoNaoPesagem")
    public String getMotivoNaoPesagem() {
        return motivoNaoPesagem;
    }

    public void setMotivoNaoPesagem(String motivoNaoPesagem) {
        this.motivoNaoPesagem = motivoNaoPesagem;
    }

    /**
     * Lista com os códigos dos lacres vinculados ao contêiner&lt;br&gt;Tamanho: 15
     *
     * @return lacres
     **/
    @JsonProperty("lacres")
    @NotNull
    public List<String> getLacres() {
        return lacres;
    }

    public void setLacres(List<String> lacres) {
        this.lacres = lacres;
    }

    public Conteiner lacres(List<String> lacres) {
        this.lacres = lacres;
        return this;
    }

    public Conteiner addLacresItem(String lacresItem) {
        this.lacres.add(lacresItem);
        return this;
    }

    public Conteiner motivoNaoPesagem(String motivoNaoPesagem) {
        this.motivoNaoPesagem = motivoNaoPesagem;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class Conteiner {\n" +
                "    pesoAferido: " + toIndentedString(pesoAferido) + "\n" +
                "    motivoNaoPesagem: " + toIndentedString(motivoNaoPesagem) + "\n" +
                "    lacres: " + toIndentedString(lacres) + "\n" +
                "}";
        return sb;
    }
}
