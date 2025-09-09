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
@XmlType(name = "DadosDoPorto", propOrder =
        {"porto", "idElemento"
        })

@XmlRootElement(name = "DadosDoPorto")
public class DadosDoPorto {

    @XmlElement(name = "porto")
    @ApiModelProperty(value = "Porto. Conforme tabela de domínio Porto disponível no <a href=https://portalunico.siscomex.gov.br/tabx/#/tabelas rel=\"noopener noreferrer\" target=\"_blank\">Portal Único Siscomex.</a>")
    /**
     * Porto. Conforme tabela de domínio Porto disponível no <a href=https://portalunico.siscomex.gov.br/tabx/#/tabelas rel=\"noopener noreferrer\" target=\"_blank\">Portal Único Siscomex.</a>
     **/
    private String porto = null;

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
     * Porto. Conforme tabela de domínio Porto disponível no &lt;a href&#x3D;https://portalunico.siscomex.gov.br/tabx/#/tabelas rel&#x3D;\&quot;noopener noreferrer\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Portal Único Siscomex.&lt;/a&gt;
     *
     * @return porto
     **/
    @JsonProperty("porto")
    public String getPorto() {
        return porto;
    }

    public void setPorto(String porto) {
        this.porto = porto;
    }

    public DadosDoPorto porto(String porto) {
        this.porto = porto;
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

    public DadosDoPorto idElemento(String idElemento) {
        this.idElemento = idElemento;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class DadosDoPorto {\n" +
                "    porto: " + toIndentedString(porto) + "\n" +
                "    idElemento: " + toIndentedString(idElemento) + "\n" +
                "}";
        return sb;
    }
}
