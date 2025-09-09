package br.gov.siscomex.portalunico.ccta.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetornoManifestoViagem", propOrder =
        {"numeroProtocolo"
        })

@XmlRootElement(name = "RetornoManifestoViagem")
/**
 * Retorno da manifestação de viagem rodoviária
 **/
@ApiModel(description = "Retorno da manifestação de viagem rodoviária")
public class RetornoManifestoViagem {

    @XmlElement(name = "numeroProtocolo")
    @ApiModelProperty(example = "e63d5061-b154-4a6a-9066-8f16a2f31818", value = "Número do protocolo referente a entrega da viagem rodoviária. <br/>O número do protocolo deverá ser utilizado no serviço de consulta da situação do processamento da entrega da carga para recuperar o resultado da solicitação.<br/>Tamanho: 36")
    /**
     * Número do protocolo referente a entrega da viagem rodoviária. <br/>O número do protocolo deverá ser utilizado no serviço de consulta da situação do processamento da entrega da carga para recuperar o resultado da solicitação.<br/>Tamanho: 36
     **/
    private String numeroProtocolo = null;

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
     * Número do protocolo referente a entrega da viagem rodoviária. &lt;br/&gt;O número do protocolo deverá ser utilizado no serviço de consulta da situação do processamento da entrega da carga para recuperar o resultado da solicitação.&lt;br/&gt;Tamanho: 36
     *
     * @return numeroProtocolo
     **/
    @JsonProperty("numeroProtocolo")
    public String getNumeroProtocolo() {
        return numeroProtocolo;
    }

    public void setNumeroProtocolo(String numeroProtocolo) {
        this.numeroProtocolo = numeroProtocolo;
    }

    public RetornoManifestoViagem numeroProtocolo(String numeroProtocolo) {
        this.numeroProtocolo = numeroProtocolo;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class RetornoManifestoViagem {\n" +
                "    numeroProtocolo: " + toIndentedString(numeroProtocolo) + "\n" +
                "}";
        return sb;
    }
}
