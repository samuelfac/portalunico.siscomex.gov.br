package br.gov.siscomex.portalunico.remx.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManifestoDePresenaDeCarga", propOrder =
        {"cnpjDeclarante", "numeroManifesto", "remessas"
        })

@XmlRootElement(name = "ManifestoDePresenaDeCarga")
public class ManifestoDePresenaDeCarga {

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

    @XmlElement(name = "remessas")
    @ApiModelProperty(value = "Lista de remessas. (máximo: 1100 itens)")
    @Valid
    /**
     * Lista de remessas. (máximo: 1100 itens)
     **/
    private List<InformaesDaRemessa> remessas = null;

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

    public ManifestoDePresenaDeCarga cnpjDeclarante(String cnpjDeclarante) {
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

    public ManifestoDePresenaDeCarga numeroManifesto(String numeroManifesto) {
        this.numeroManifesto = numeroManifesto;
        return this;
    }

    /**
     * Lista de remessas. (máximo: 1100 itens)
     *
     * @return remessas
     **/
    @JsonProperty("remessas")
    public List<InformaesDaRemessa> getRemessas() {
        return remessas;
    }

    public void setRemessas(List<InformaesDaRemessa> remessas) {
        this.remessas = remessas;
    }

    public ManifestoDePresenaDeCarga remessas(List<InformaesDaRemessa> remessas) {
        this.remessas = remessas;
        return this;
    }

    public ManifestoDePresenaDeCarga addRemessasItem(InformaesDaRemessa remessasItem) {
        this.remessas.add(remessasItem);
        return this;
    }

    @Override
    public String toString() {

        String sb = "class ManifestoDePresenaDeCarga {\n" +
                "    cnpjDeclarante: " + toIndentedString(cnpjDeclarante) + "\n" +
                "    numeroManifesto: " + toIndentedString(numeroManifesto) + "\n" +
                "    remessas: " + toIndentedString(remessas) + "\n" +
                "}";
        return sb;
    }
}
