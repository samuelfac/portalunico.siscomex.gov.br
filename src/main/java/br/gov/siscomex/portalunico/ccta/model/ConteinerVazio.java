package br.gov.siscomex.portalunico.ccta.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConteinerVazio", propOrder =
        {"identificacaoConteinerVazio", "medidaConteinerVazio", "taraConteinerVazio"
        })

@XmlRootElement(name = "ConteinerVazio")
public class ConteinerVazio {

    @XmlElement(name = "identificacaoConteinerVazio", required = true)
    @ApiModelProperty(example = "AG48569701", required = true, value = "Identificação do conteiner vazio transportado na viagem.<br/> Tamanho Máximo: 11")
    /**
     * Identificação do conteiner vazio transportado na viagem.<br/> Tamanho Máximo: 11
     **/
    private String identificacaoConteinerVazio = null;

    @XmlElement(name = "medidaConteinerVazio")
    @ApiModelProperty(example = "20", value = "Medidas do conteiner vazio transportado na viagem<BR/> 20 (20 pés) ou 40 (40 pés)<br/> Tamanho Máximo: 2")
    /**
     * Medidas do conteiner vazio transportado na viagem<BR/> 20 (20 pés) ou 40 (40 pés)<br/> Tamanho Máximo: 2
     **/
    private String medidaConteinerVazio = null;

    @XmlElement(name = "taraConteinerVazio", required = true)
    @ApiModelProperty(example = "105.478", required = true, value = "Tara do conteiner vazio transportado na viagem<br/>Formato: Número Racional com 9 casas inteiras e 3 casas decimais")
    /**
     * Tara do conteiner vazio transportado na viagem<br/>Formato: Número Racional com 9 casas inteiras e 3 casas decimais
     **/
    private String taraConteinerVazio = null;

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
     * Identificação do conteiner vazio transportado na viagem.&lt;br/&gt; Tamanho Máximo: 11
     *
     * @return identificacaoConteinerVazio
     **/
    @JsonProperty("identificacaoConteinerVazio")
    @NotNull
    public String getIdentificacaoConteinerVazio() {
        return identificacaoConteinerVazio;
    }

    public void setIdentificacaoConteinerVazio(String identificacaoConteinerVazio) {
        this.identificacaoConteinerVazio = identificacaoConteinerVazio;
    }

    /**
     * Medidas do conteiner vazio transportado na viagem&lt;BR/&gt; 20 (20 pés) ou 40 (40 pés)&lt;br/&gt; Tamanho Máximo: 2
     *
     * @return medidaConteinerVazio
     **/
    @JsonProperty("medidaConteinerVazio")
    public String getMedidaConteinerVazio() {
        return medidaConteinerVazio;
    }

    public void setMedidaConteinerVazio(String medidaConteinerVazio) {
        this.medidaConteinerVazio = medidaConteinerVazio;
    }

    public ConteinerVazio medidaConteinerVazio(String medidaConteinerVazio) {
        this.medidaConteinerVazio = medidaConteinerVazio;
        return this;
    }

    /**
     * Tara do conteiner vazio transportado na viagem&lt;br/&gt;Formato: Número Racional com 9 casas inteiras e 3 casas decimais
     *
     * @return taraConteinerVazio
     **/
    @JsonProperty("taraConteinerVazio")
    @NotNull
    public String getTaraConteinerVazio() {
        return taraConteinerVazio;
    }

    public void setTaraConteinerVazio(String taraConteinerVazio) {
        this.taraConteinerVazio = taraConteinerVazio;
    }

    public ConteinerVazio taraConteinerVazio(String taraConteinerVazio) {
        this.taraConteinerVazio = taraConteinerVazio;
        return this;
    }

    public ConteinerVazio identificacaoConteinerVazio(String identificacaoConteinerVazio) {
        this.identificacaoConteinerVazio = identificacaoConteinerVazio;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class ConteinerVazio {\n" +
                "    identificacaoConteinerVazio: " + toIndentedString(identificacaoConteinerVazio) + "\n" +
                "    medidaConteinerVazio: " + toIndentedString(medidaConteinerVazio) + "\n" +
                "    taraConteinerVazio: " + toIndentedString(taraConteinerVazio) + "\n" +
                "}";
        return sb;
    }
}
