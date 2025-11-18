package br.gov.siscomex.portalunico.ccta.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.time.LocalDate;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApoliceSeguro", propOrder =
        {"dataVencimento", "numero"
        })

@XmlRootElement(name = "ApoliceSeguro")
public class ApoliceSeguro {

    @XmlElement(name = "dataVencimento")
    @ApiModelProperty(example = "Fri Aug 07 02:00:00 CEST 2020", value = "Data de vencimento do seguro<br/>Formato: yyyy-MM-dd")
    /**
     * Data de vencimento do seguro<br/>Formato: yyyy-MM-dd
     **/
    private LocalDate dataVencimento = null;

    @XmlElement(name = "numero")
    @ApiModelProperty(example = "APOLICE123", value = "Apólice de seguro<br/> Tamanho Máximo: 20")
    /**
     * Apólice de seguro<br/> Tamanho Máximo: 20
     **/
    private String numero = null;

    /**
     * Data de vencimento do seguro&lt;br/&gt;Formato: yyyy-MM-dd
     *
     * @return dataVencimento
     **/
    @JsonProperty("dataVencimento")
    public LocalDate getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(LocalDate dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public ApoliceSeguro dataVencimento(LocalDate dataVencimento) {
        this.dataVencimento = dataVencimento;
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
     * Apólice de seguro&lt;br/&gt; Tamanho Máximo: 20
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

    public ApoliceSeguro numero(String numero) {
        this.numero = numero;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class ApoliceSeguro {\n" +
                "    dataVencimento: " + toIndentedString(dataVencimento) + "\n" +
                "    numero: " + toIndentedString(numero) + "\n" +
                "}";
        return sb;
    }
}
