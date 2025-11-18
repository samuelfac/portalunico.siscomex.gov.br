package br.gov.siscomex.portalunico.rcnt.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DadosDoCnpjDoCliente", propOrder =
        {"idElemento", "cnpjCliente"
        })

@XmlRootElement(name = "DadosDoCnpjDoCliente")
public class DadosDoCnpjDoCliente {

    @XmlElement(name = "idElemento", required = true)
    @ApiModelProperty(required = true, value = "Identificação de cada elemento da lista. Este atributo é obrigatório e deve ser único dentro da lista correspondente.<br/>Tamanho: 40")
    /**
     * Identificação de cada elemento da lista. Este atributo é obrigatório e deve ser único dentro da lista correspondente.<br/>Tamanho: 40
     **/
    private String idElemento = null;

    @XmlElement(name = "cnpjCliente")
    @ApiModelProperty(example = "44444444444444", value = "CNPJ do importador ou do exportador<br/>Tamanho: 14<br/>Formato: 'NNNNNNNNNNNNNN'")
    /**
     * CNPJ do importador ou do exportador<br/>Tamanho: 14<br/>Formato: 'NNNNNNNNNNNNNN'
     **/
    private String cnpjCliente = null;

    /**
     * Identificação de cada elemento da lista. Este atributo é obrigatório e deve ser único dentro da lista correspondente.&lt;br/&gt;Tamanho: 40
     *
     * @return idElemento
     **/
    @JsonProperty("idElemento")
    @NotNull
    public String getIdElemento() {
        return idElemento;
    }

    public void setIdElemento(String idElemento) {
        this.idElemento = idElemento;
    }

    public DadosDoCnpjDoCliente idElemento(String idElemento) {
        this.idElemento = idElemento;
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
     * CNPJ do importador ou do exportador&lt;br/&gt;Tamanho: 14&lt;br/&gt;Formato: &#39;NNNNNNNNNNNNNN&#39;
     *
     * @return cnpjCliente
     **/
    @JsonProperty("cnpjCliente")
    public String getCnpjCliente() {
        return cnpjCliente;
    }

    public void setCnpjCliente(String cnpjCliente) {
        this.cnpjCliente = cnpjCliente;
    }

    public DadosDoCnpjDoCliente cnpjCliente(String cnpjCliente) {
        this.cnpjCliente = cnpjCliente;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class DadosDoCnpjDoCliente {\n" +
                "    idElemento: " + toIndentedString(idElemento) + "\n" +
                "    cnpjCliente: " + toIndentedString(cnpjCliente) + "\n" +
                "}";
        return sb;
    }
}
