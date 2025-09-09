package br.gov.siscomex.portalunico.remx.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Divergncia", propOrder =
        {"justificativa", "nomeFiscal", "codigoDivergencia", "vigente"
        })

@XmlRootElement(name = "Divergncia")
public class Divergncia {

    @XmlElement(name = "justificativa")
    @ApiModelProperty(value = "Justificativa da divergência. Máximo de 500 caracteres, que podem ser letras, números, além de quaisquer caracteres referentes a codificação UTF-8.")
    /**
     * Justificativa da divergência. Máximo de 500 caracteres, que podem ser letras, números, além de quaisquer caracteres referentes a codificação UTF-8.
     **/
    private String justificativa = null;

    @XmlElement(name = "nomeFiscal")
    @ApiModelProperty(value = "Nome do fiscal que aplicou a divergência. Máximo de 50 caracteres.")
    /**
     * Nome do fiscal que aplicou a divergência. Máximo de 50 caracteres.
     **/
    private String nomeFiscal = null;

    @XmlElement(name = "codigoDivergencia")
    @ApiModelProperty(value = "Código da divergência. O código da divergência é composto por até 2 dígitos.")
    /**
     * Código da divergência. O código da divergência é composto por até 2 dígitos.
     **/
    private Integer codigoDivergencia = null;

    @XmlElement(name = "vigente")
    @ApiModelProperty(value = "Informação se a divergência está vigente. Valores pré-definidos:<br/>S: Vigente.<br/>N: Não vigente.")
    /**
     * Informação se a divergência está vigente. Valores pré-definidos:<br/>S: Vigente.<br/>N: Não vigente.
     **/
    private String vigente = null;

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
     * Justificativa da divergência. Máximo de 500 caracteres, que podem ser letras, números, além de quaisquer caracteres referentes a codificação UTF-8.
     *
     * @return justificativa
     **/
    @JsonProperty("justificativa")
    public String getJustificativa() {
        return justificativa;
    }

    public void setJustificativa(String justificativa) {
        this.justificativa = justificativa;
    }

    public Divergncia justificativa(String justificativa) {
        this.justificativa = justificativa;
        return this;
    }

    /**
     * Nome do fiscal que aplicou a divergência. Máximo de 50 caracteres.
     *
     * @return nomeFiscal
     **/
    @JsonProperty("nomeFiscal")
    public String getNomeFiscal() {
        return nomeFiscal;
    }

    public void setNomeFiscal(String nomeFiscal) {
        this.nomeFiscal = nomeFiscal;
    }

    public Divergncia nomeFiscal(String nomeFiscal) {
        this.nomeFiscal = nomeFiscal;
        return this;
    }

    /**
     * Código da divergência. O código da divergência é composto por até 2 dígitos.
     *
     * @return codigoDivergencia
     **/
    @JsonProperty("codigoDivergencia")
    public Integer getCodigoDivergencia() {
        return codigoDivergencia;
    }

    public void setCodigoDivergencia(Integer codigoDivergencia) {
        this.codigoDivergencia = codigoDivergencia;
    }

    public Divergncia codigoDivergencia(Integer codigoDivergencia) {
        this.codigoDivergencia = codigoDivergencia;
        return this;
    }

    /**
     * Informação se a divergência está vigente. Valores pré-definidos:&lt;br/&gt;S: Vigente.&lt;br/&gt;N: Não vigente.
     *
     * @return vigente
     **/
    @JsonProperty("vigente")
    public String getVigente() {
        return vigente;
    }

    public void setVigente(String vigente) {
        this.vigente = vigente;
    }

    public Divergncia vigente(String vigente) {
        this.vigente = vigente;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class Divergncia {\n" +
                "    justificativa: " + toIndentedString(justificativa) + "\n" +
                "    nomeFiscal: " + toIndentedString(nomeFiscal) + "\n" +
                "    codigoDivergencia: " + toIndentedString(codigoDivergencia) + "\n" +
                "    vigente: " + toIndentedString(vigente) + "\n" +
                "}";
        return sb;
    }
}
