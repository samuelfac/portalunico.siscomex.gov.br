package br.gov.siscomex.portalunico.ccta.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentoTransporteRepresentation", propOrder =
        {"tipo", "numero", "dataEmissao"
        })

@XmlRootElement(name = "DocumentoTransporteRepresentation")
public class DocumentoTransporteRepresentation {

    @XmlElement(name = "tipo")
    @ApiModelProperty(value = "")
    private String tipo = null;

    @XmlElement(name = "numero")
    @ApiModelProperty(value = "")
    private String numero = null;

    @XmlElement(name = "dataEmissao")
    @ApiModelProperty(value = "")
    private String dataEmissao = null;

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
     * Get tipo
     *
     * @return tipo
     **/
    @JsonProperty("tipo")
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public DocumentoTransporteRepresentation tipo(String tipo) {
        this.tipo = tipo;
        return this;
    }

    /**
     * Get numero
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

    public DocumentoTransporteRepresentation numero(String numero) {
        this.numero = numero;
        return this;
    }

    /**
     * Get dataEmissao
     *
     * @return dataEmissao
     **/
    @JsonProperty("dataEmissao")
    public String getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(String dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public DocumentoTransporteRepresentation dataEmissao(String dataEmissao) {
        this.dataEmissao = dataEmissao;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class DocumentoTransporteRepresentation {\n" +
                "    tipo: " + toIndentedString(tipo) + "\n" +
                "    numero: " + toIndentedString(numero) + "\n" +
                "    dataEmissao: " + toIndentedString(dataEmissao) + "\n" +
                "}";
        return sb;
    }
}
