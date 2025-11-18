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

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Conteiner", propOrder =
        {"medida", "numero", "tara"
        })

@XmlRootElement(name = "Conteiner")
public class Conteiner {

    @XmlElement(name = "medida")
    @ApiModelProperty(example = "20", value = "Medidas do conteiner vazio transportado na viagem<BR/> 20 (20 pés) ou 40 (40 pés)<br/> Tamanho Máximo: 2")
    /**
     * Medidas do conteiner vazio transportado na viagem<BR/> 20 (20 pés) ou 40 (40 pés)<br/> Tamanho Máximo: 2
     **/
    private String medida = null;

    @XmlElement(name = "numero")
    @ApiModelProperty(example = "AG48569701", value = "Identificação do conteiner vazio transportado na viagem.<br/> Tamanho Máximo: 11")
    /**
     * Identificação do conteiner vazio transportado na viagem.<br/> Tamanho Máximo: 11
     **/
    private String numero = null;

    @XmlElement(name = "tara")
    @ApiModelProperty(example = "105.478", value = "Tara do conteiner vazio transportado na viagem<br/>Formato: Número Racional com 9 casas inteiras e 3 casas decimais")
    @Valid
    /**
     * Tara do conteiner vazio transportado na viagem<br/>Formato: Número Racional com 9 casas inteiras e 3 casas decimais
     **/
    private BigDecimal tara = null;

    /**
     * Medidas do conteiner vazio transportado na viagem&lt;BR/&gt; 20 (20 pés) ou 40 (40 pés)&lt;br/&gt; Tamanho Máximo: 2
     *
     * @return medida
     **/
    @JsonProperty("medida")
    public String getMedida() {
        return medida;
    }

    public void setMedida(String medida) {
        this.medida = medida;
    }

    public Conteiner medida(String medida) {
        this.medida = medida;
        return this;
    }

    /**
     * Identificação do conteiner vazio transportado na viagem.&lt;br/&gt; Tamanho Máximo: 11
     *
     * @return numero
     **/
    @JsonProperty("numero")
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Conteiner numero(String numero) {
        this.numero = numero;
        return this;
    }

    /**
     * Tara do conteiner vazio transportado na viagem&lt;br/&gt;Formato: Número Racional com 9 casas inteiras e 3 casas decimais
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

    public Conteiner tara(BigDecimal tara) {
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

    @Override
    public String toString() {

        String sb = "class Conteiner {\n" +
                "    medida: " + toIndentedString(medida) + "\n" +
                "    numero: " + toIndentedString(numero) + "\n" +
                "    tara: " + toIndentedString(tara) + "\n" +
                "}";
        return sb;
    }
}
