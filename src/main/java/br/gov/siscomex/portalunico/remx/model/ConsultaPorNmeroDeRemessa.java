package br.gov.siscomex.portalunico.remx.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultaPorNmeroDeRemessa", propOrder =
        {"numeroRemessa", "cnpjDeclarante", "numeroManifesto"
        })

@XmlRootElement(name = "ConsultaPorNmeroDeRemessa")
public class ConsultaPorNmeroDeRemessa {

    @XmlElement(name = "numeroRemessa", required = true)
    @ApiModelProperty(example = "1059756472772322", required = true, value = "Número da remessa composto por no máximo 18 caracteres alfanuméricos.")
    /**
     * Número da remessa composto por no máximo 18 caracteres alfanuméricos.
     **/
    private String numeroRemessa = null;

    @XmlElement(name = "cnpjDeclarante", required = true)
    @ApiModelProperty(example = "63198378000161", required = true, value = "CNPJ da empresa responsável composto por 14 caracteres numéricos. Não deve conter caracteres como '.', '-' e '/'.")
    /**
     * CNPJ da empresa responsável composto por 14 caracteres numéricos. Não deve conter caracteres como '.', '-' e '/'.
     **/
    private String cnpjDeclarante = null;

    @XmlElement(name = "numeroManifesto", required = true)
    @ApiModelProperty(example = "SRP201300000017", required = true, value = "Número do manifesto composto por 15 caracteres alfanuméricos. Este campo é criado pelo sistema quando é feito o registro do manifesto de carga para modalidade expressa ou registro do lote de declaração para modalidade postal.")
    /**
     * Número do manifesto composto por 15 caracteres alfanuméricos. Este campo é criado pelo sistema quando é feito o registro do manifesto de carga para modalidade expressa ou registro do lote de declaração para modalidade postal.
     **/
    private String numeroManifesto = null;

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
     * Número da remessa composto por no máximo 18 caracteres alfanuméricos.
     *
     * @return numeroRemessa
     **/
    @JsonProperty("numeroRemessa")
    @NotNull
    @Size(min = 1, max = 18)
    public String getNumeroRemessa() {
        return numeroRemessa;
    }

    public void setNumeroRemessa(String numeroRemessa) {
        this.numeroRemessa = numeroRemessa;
    }

    public ConsultaPorNmeroDeRemessa numeroRemessa(String numeroRemessa) {
        this.numeroRemessa = numeroRemessa;
        return this;
    }

    /**
     * CNPJ da empresa responsável composto por 14 caracteres numéricos. Não deve conter caracteres como &#39;.&#39;, &#39;-&#39; e &#39;/&#39;.
     *
     * @return cnpjDeclarante
     **/
    @JsonProperty("cnpjDeclarante")
    @NotNull
    public String getCnpjDeclarante() {
        return cnpjDeclarante;
    }

    public void setCnpjDeclarante(String cnpjDeclarante) {
        this.cnpjDeclarante = cnpjDeclarante;
    }

    public ConsultaPorNmeroDeRemessa cnpjDeclarante(String cnpjDeclarante) {
        this.cnpjDeclarante = cnpjDeclarante;
        return this;
    }

    /**
     * Número do manifesto composto por 15 caracteres alfanuméricos. Este campo é criado pelo sistema quando é feito o registro do manifesto de carga para modalidade expressa ou registro do lote de declaração para modalidade postal.
     *
     * @return numeroManifesto
     **/
    @JsonProperty("numeroManifesto")
    @NotNull
    public String getNumeroManifesto() {
        return numeroManifesto;
    }

    public void setNumeroManifesto(String numeroManifesto) {
        this.numeroManifesto = numeroManifesto;
    }

    public ConsultaPorNmeroDeRemessa numeroManifesto(String numeroManifesto) {
        this.numeroManifesto = numeroManifesto;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class ConsultaPorNmeroDeRemessa {\n" +
                "    numeroRemessa: " + toIndentedString(numeroRemessa) + "\n" +
                "    cnpjDeclarante: " + toIndentedString(cnpjDeclarante) + "\n" +
                "    numeroManifesto: " + toIndentedString(numeroManifesto) + "\n" +
                "}";
        return sb;
    }
}
