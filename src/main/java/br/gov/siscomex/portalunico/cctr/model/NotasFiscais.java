package br.gov.siscomex.portalunico.cctr.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotasFiscais", propOrder =
        {"nff"
        })

@XmlRootElement(name = "NotasFiscais")
/**
 * Notas Fiscais Formulário
 **/
@ApiModel(description = "Notas Fiscais Formulário")
public class NotasFiscais {

    @XmlElement(name = "nff", required = true)
    @ApiModelProperty(required = true, value = "Notas Fiscais Formulário")
    @Valid
    /**
     * Notas Fiscais Formulário
     **/
    private List<NotaFiscalFormulario> nff = new ArrayList<>();

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
     * Notas Fiscais Formulário
     *
     * @return nff
     **/
    @JsonProperty("nff")
    @NotNull
    public List<NotaFiscalFormulario> getNff() {
        return nff;
    }

    public void setNff(List<NotaFiscalFormulario> nff) {
        this.nff = nff;
    }

    public NotasFiscais nff(List<NotaFiscalFormulario> nff) {
        this.nff = nff;
        return this;
    }

    public NotasFiscais addNffItem(NotaFiscalFormulario nffItem) {
        this.nff.add(nffItem);
        return this;
    }

    @Override
    public String toString() {

        String sb = "class NotasFiscais {\n" +
                "    nff: " + toIndentedString(nff) + "\n" +
                "}";
        return sb;
    }
}
