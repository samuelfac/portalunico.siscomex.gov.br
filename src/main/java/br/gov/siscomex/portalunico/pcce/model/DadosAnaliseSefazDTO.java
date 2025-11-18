package br.gov.siscomex.portalunico.pcce.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DadosAnaliseSefazDTO", propOrder =
        {"comentario"
        })

@XmlRootElement(name = "DadosAnaliseSefazDTO")
/**
 * Dados da solicitação de análise manual de pagamento/exoneração de ICMS
 **/
@ApiModel(description = "Dados da solicitação de análise manual de pagamento/exoneração de ICMS")
public class DadosAnaliseSefazDTO {

    @XmlElement(name = "comentario", required = true)
    @ApiModelProperty(required = true, value = "Comentário que será enviado à Sefaz para justificar a Declaração<br>Tamanho mínimo: 1<br>Tamanho máximo: 300")
    /**
     * Comentário que será enviado à Sefaz para justificar a Declaração<br>Tamanho mínimo: 1<br>Tamanho máximo: 300
     **/
    private String comentario = null;

    /**
     * Comentário que será enviado à Sefaz para justificar a Declaração&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 300
     *
     * @return comentario
     **/
    @JsonProperty("comentario")
    @NotNull
    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public DadosAnaliseSefazDTO comentario(String comentario) {
        this.comentario = comentario;
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

        String sb = "class DadosAnaliseSefazDTO {\n" +
                "    comentario: " + toIndentedString(comentario) + "\n" +
                "}";
        return sb;
    }
}
