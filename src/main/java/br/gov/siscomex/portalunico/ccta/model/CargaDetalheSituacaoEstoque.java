package br.gov.siscomex.portalunico.ccta.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CargaDetalheSituacaoEstoque", propOrder =
        {"numeroManifesto", "ra", "ul"
        })

@XmlRootElement(name = "CargaDetalheSituacaoEstoque")
public class CargaDetalheSituacaoEstoque {

    @XmlElement(name = "numeroManifesto")
    @ApiModelProperty(example = "AR123040104", value = "Número do documento de transporte.<br/>Não pode haver outro documento de transporte com a mesma chave tipoDocumentoTransporte, numeroDocumentoTransporte e dataEmissao.<br/> Tamanho Máximo: 15")
    /**
     * Número do documento de transporte.<br/>Não pode haver outro documento de transporte com a mesma chave tipoDocumentoTransporte, numeroDocumentoTransporte e dataEmissao.<br/> Tamanho Máximo: 15
     **/
    private String numeroManifesto = null;

    @XmlElement(name = "ra")
    @ApiModelProperty(value = "")
    @Valid
    private Recinto ra = null;

    @XmlElement(name = "ul")
    @ApiModelProperty(value = "")
    @Valid
    private UnidadeRfb ul = null;

    /**
     * Número do documento de transporte.&lt;br/&gt;Não pode haver outro documento de transporte com a mesma chave tipoDocumentoTransporte, numeroDocumentoTransporte e dataEmissao.&lt;br/&gt; Tamanho Máximo: 15
     *
     * @return numeroManifesto
     **/
    @JsonProperty("numeroManifesto")
    public String getNumeroManifesto() {
        return numeroManifesto;
    }

    public void setNumeroManifesto(String numeroManifesto) {
        this.numeroManifesto = numeroManifesto;
    }

    public CargaDetalheSituacaoEstoque numeroManifesto(String numeroManifesto) {
        this.numeroManifesto = numeroManifesto;
        return this;
    }

    /**
     * Get ra
     *
     * @return ra
     **/
    @JsonProperty("ra")
    public Recinto getRa() {
        return ra;
    }

    public void setRa(Recinto ra) {
        this.ra = ra;
    }

    public CargaDetalheSituacaoEstoque ra(Recinto ra) {
        this.ra = ra;
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
     * Get ul
     *
     * @return ul
     **/
    @JsonProperty("ul")
    public UnidadeRfb getUl() {
        return ul;
    }

    public void setUl(UnidadeRfb ul) {
        this.ul = ul;
    }

    public CargaDetalheSituacaoEstoque ul(UnidadeRfb ul) {
        this.ul = ul;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class CargaDetalheSituacaoEstoque {\n" +
                "    numeroManifesto: " + toIndentedString(numeroManifesto) + "\n" +
                "    ra: " + toIndentedString(ra) + "\n" +
                "    ul: " + toIndentedString(ul) + "\n" +
                "}";
        return sb;
    }
}
