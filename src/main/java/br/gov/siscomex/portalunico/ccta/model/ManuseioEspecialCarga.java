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
@XmlType(name = "ManuseioEspecialCarga", propOrder =
        {"codigo"
        })

@XmlRootElement(name = "ManuseioEspecialCarga")
public class ManuseioEspecialCarga {

    @XmlElement(name = "codigo", required = true)
    @ApiModelProperty(example = "AOG", required = true, value = "Código de manuseio especial da carga<br/> Tamanho Máximo: 5")
    /**
     * Código de manuseio especial da carga<br/> Tamanho Máximo: 5
     **/
    private String codigo = null;

    /**
     * Código de manuseio especial da carga&lt;br/&gt; Tamanho Máximo: 5
     *
     * @return codigo
     **/
    @JsonProperty("codigo")
    @NotNull
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public ManuseioEspecialCarga codigo(String codigo) {
        this.codigo = codigo;
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

    @Override
    public String toString() {

        String sb = "class ManuseioEspecialCarga {\n" +
                "    codigo: " + toIndentedString(codigo) + "\n" +
                "}";
        return sb;
    }
}
