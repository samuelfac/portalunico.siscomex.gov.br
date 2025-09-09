package br.gov.siscomex.portalunico.talp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RevogacaoItemLpcoRequest", propOrder =
        {"itens", "justificativa"
        })

@XmlRootElement(name = "RevogacaoItemLpcoRequest")
/**
 * Dados para revogação de itens de LPCO
 **/
@ApiModel(description = "Dados para revogação de itens de LPCO")
public class RevogacaoItemLpcoRequest {

    @XmlElement(name = "itens", required = true)
    @ApiModelProperty(example = "[\"1\", \"2\"]", required = true, value = "Lista dos itens que devem ser revogados de ofício.<br>")
    /**
     * Lista dos itens que devem ser revogados de ofício.<br>
     **/
    private List<Integer> itens = new ArrayList<>();

    @XmlElement(name = "justificativa", required = true)
    @ApiModelProperty(example = "Texto livre", required = true, value = "Justificativa para a operação. Tamanho mínimo: 1<br>Tamanho máximo: 3900")
    /**
     * Justificativa para a operação. Tamanho mínimo: 1<br>Tamanho máximo: 3900
     **/
    private String justificativa = null;

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
     * Lista dos itens que devem ser revogados de ofício.&lt;br&gt;
     *
     * @return itens
     **/
    @JsonProperty("itens")
    @NotNull
    public List<Integer> getItens() {
        return itens;
    }

    public void setItens(List<Integer> itens) {
        this.itens = itens;
    }

    public RevogacaoItemLpcoRequest itens(List<Integer> itens) {
        this.itens = itens;
        return this;
    }

    public RevogacaoItemLpcoRequest addItensItem(Integer itensItem) {
        this.itens.add(itensItem);
        return this;
    }

    /**
     * Justificativa para a operação. Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 3900
     *
     * @return justificativa
     **/
    @JsonProperty("justificativa")
    @NotNull
    public String getJustificativa() {
        return justificativa;
    }

    public void setJustificativa(String justificativa) {
        this.justificativa = justificativa;
    }

    public RevogacaoItemLpcoRequest justificativa(String justificativa) {
        this.justificativa = justificativa;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class RevogacaoItemLpcoRequest {\n" +
                "    itens: " + toIndentedString(itens) + "\n" +
                "    justificativa: " + toIndentedString(justificativa) + "\n" +
                "}";
        return sb;
    }
}
