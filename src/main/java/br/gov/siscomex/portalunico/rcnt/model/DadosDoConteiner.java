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
@XmlType(name = "DadosDoConteiner", propOrder =
        {"numero", "idElemento"
        })

@XmlRootElement(name = "DadosDoConteiner")
public class DadosDoConteiner {

    @XmlElement(name = "numero")
    @ApiModelProperty(value = "Número do Conteiner<br/>Tamanho: 200")
    /**
     * Número do Conteiner<br/>Tamanho: 200
     **/
    private String numero = null;

    @XmlElement(name = "idElemento", required = true)
    @ApiModelProperty(required = true, value = "Identificação de cada elemento da lista. Este atributo é obrigatório e deve ser único dentro da lista correspondente.<br/>Tamanho: 40")
    /**
     * Identificação de cada elemento da lista. Este atributo é obrigatório e deve ser único dentro da lista correspondente.<br/>Tamanho: 40
     **/
    private String idElemento = null;

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
     * Número do Conteiner&lt;br/&gt;Tamanho: 200
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

    public DadosDoConteiner numero(String numero) {
        this.numero = numero;
        return this;
    }

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

    public DadosDoConteiner idElemento(String idElemento) {
        this.idElemento = idElemento;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class DadosDoConteiner {\n" +
                "    numero: " + toIndentedString(numero) + "\n" +
                "    idElemento: " + toIndentedString(idElemento) + "\n" +
                "}";
        return sb;
    }
}
