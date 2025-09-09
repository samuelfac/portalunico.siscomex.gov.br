package br.gov.siscomex.portalunico.duex.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Declarante", propOrder =
        {"tipo", "numero"
        })

@XmlRootElement(name = "Declarante")
public class Declarante {

    @XmlElement(name = "tipo")
    @ApiModelProperty(value = "Tipo<br />Domínio: <br />'PF' = Pessoa Física<br />'PJ' = Pessoa Jurídica<br />'ES' = Estrangeiro ")
    /**
     * Tipo<br />Domínio: <br />'PF' = Pessoa Física<br />'PJ' = Pessoa Jurídica<br />'ES' = Estrangeiro
     **/
    private String tipo = null;

    @XmlElement(name = "numero")
    @ApiModelProperty(value = "Número do documento<br />Tamanho mínimo: 1<br />Tamanho máximo: 20")
    /**
     * Número do documento<br />Tamanho mínimo: 1<br />Tamanho máximo: 20
     **/
    private String numero = null;

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
     * Tipo&lt;br /&gt;Domínio: &lt;br /&gt;&#39;PF&#39; &#x3D; Pessoa Física&lt;br /&gt;&#39;PJ&#39; &#x3D; Pessoa Jurídica&lt;br /&gt;&#39;ES&#39; &#x3D; Estrangeiro
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

    public Declarante tipo(String tipo) {
        this.tipo = tipo;
        return this;
    }

    /**
     * Número do documento&lt;br /&gt;Tamanho mínimo: 1&lt;br /&gt;Tamanho máximo: 20
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

    public Declarante numero(String numero) {
        this.numero = numero;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class Declarante {\n" +
                "    tipo: " + toIndentedString(tipo) + "\n" +
                "    numero: " + toIndentedString(numero) + "\n" +
                "}";
        return sb;
    }
}
