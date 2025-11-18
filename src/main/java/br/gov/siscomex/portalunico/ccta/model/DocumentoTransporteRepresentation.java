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
        {"dataEmissao", "numero", "tipo"
        })

@XmlRootElement(name = "DocumentoTransporteRepresentation")
public class DocumentoTransporteRepresentation {

    @XmlElement(name = "dataEmissao")
    @ApiModelProperty(value = "")
    private String dataEmissao = null;

    @XmlElement(name = "numero")
    @ApiModelProperty(value = "")
    private String numero = null;

    @XmlElement(name = "tipo")
    @ApiModelProperty(value = "")
    private String tipo = null;

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

    public DocumentoTransporteRepresentation dataEmissao(String dataEmissao) {
        this.dataEmissao = dataEmissao;
        return this;
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

    @Override
    public String toString() {

        String sb = "class DocumentoTransporteRepresentation {\n" +
                "    dataEmissao: " + toIndentedString(dataEmissao) + "\n" +
                "    numero: " + toIndentedString(numero) + "\n" +
                "    tipo: " + toIndentedString(tipo) + "\n" +
                "}";
        return sb;
    }
}
