package br.gov.siscomex.portalunico.cctr.model;

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
@XmlType(name = "DocumentoTransportePK", propOrder =
        {"ano", "sequencia"
        })

@XmlRootElement(name = "DocumentoTransportePK")
public class DocumentoTransportePK {

    @XmlElement(name = "ano")
    @ApiModelProperty(value = "")
    @Valid
    private BigDecimal ano = null;

    @XmlElement(name = "sequencia")
    @ApiModelProperty(value = "")
    @Valid
    private BigDecimal sequencia = null;

    /**
     * Get ano
     *
     * @return ano
     **/
    @JsonProperty("ano")
    public BigDecimal getAno() {
        return ano;
    }

    public void setAno(BigDecimal ano) {
        this.ano = ano;
    }

    public DocumentoTransportePK ano(BigDecimal ano) {
        this.ano = ano;
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
     * Get sequencia
     *
     * @return sequencia
     **/
    @JsonProperty("sequencia")
    public BigDecimal getSequencia() {
        return sequencia;
    }

    public void setSequencia(BigDecimal sequencia) {
        this.sequencia = sequencia;
    }

    public DocumentoTransportePK sequencia(BigDecimal sequencia) {
        this.sequencia = sequencia;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class DocumentoTransportePK {\n" +
                "    ano: " + toIndentedString(ano) + "\n" +
                "    sequencia: " + toIndentedString(sequencia) + "\n" +
                "}";
        return sb;
    }
}
