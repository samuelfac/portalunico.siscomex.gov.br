package br.gov.siscomex.portalunico.cct_rcar.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtratoVO", propOrder =
        {"codigo", "texto"
        })

@XmlRootElement(name = "ExtratoVO")
/**
 * Falha de processamento, devido regra de negócio ou erro de sistema
 **/
@ApiModel(description = "Falha de processamento, devido regra de negócio ou erro de sistema")
public class ExtratoVO {

    @XmlElement(name = "codigo")
    @ApiModelProperty(example = "CCTR-ER0126", value = "Código do erro encontrado durante o processamento")
    /**
     * Código do erro encontrado durante o processamento
     **/
    private String codigo = null;

    @XmlElement(name = "texto")
    @ApiModelProperty(example = "O usuário não representa o interveniente informado", value = "Descrição do erro encontrado durante o processamento")
    /**
     * Descrição do erro encontrado durante o processamento
     **/
    private String texto = null;

    /**
     * Código do erro encontrado durante o processamento
     *
     * @return codigo
     **/
    @JsonProperty("codigo")
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public ExtratoVO codigo(String codigo) {
        this.codigo = codigo;
        return this;
    }

    /**
     * Descrição do erro encontrado durante o processamento
     *
     * @return texto
     **/
    @JsonProperty("texto")
    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public ExtratoVO texto(String texto) {
        this.texto = texto;
        return this;
    }


    @Override
    public String toString() {

        String sb = "class ExtratoVO {\n" +
                "    codigo: " + toIndentedString(codigo) + "\n" +
                "    texto: " + toIndentedString(texto) + "\n" +
                "}";
        return sb;
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
}

