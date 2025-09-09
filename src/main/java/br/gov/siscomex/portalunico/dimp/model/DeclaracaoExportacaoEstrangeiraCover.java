package br.gov.siscomex.portalunico.dimp.model;

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
@XmlType(name = "DeclaracaoExportacaoEstrangeiraCover", propOrder =
        {"faixaInicio", "numero", "faixaFim"
        })

@XmlRootElement(name = "DeclaracaoExportacaoEstrangeiraCover")
/**
 * Lista de declarações estrangeiras.<br>Observação: Os campos deste grupo são informados apenas quando a procedência da carga é de um país do Mercosul.
 **/
@ApiModel(description = "Lista de declarações estrangeiras.<br>Observação: Os campos deste grupo são informados apenas quando a procedência da carga é de um país do Mercosul.")
public class DeclaracaoExportacaoEstrangeiraCover {

    @XmlElement(name = "faixaInicio", required = true)
    @ApiModelProperty(example = "A-11", required = true, value = "Item inicial da faixa de itens.<br>Tamanho mínimo: 1<br>Tamanho máximo: 7")
    /**
     * Item inicial da faixa de itens.<br>Tamanho mínimo: 1<br>Tamanho máximo: 7
     **/
    private String faixaInicio = null;

    @XmlElement(name = "numero", required = true)
    @ApiModelProperty(example = "19XY0000001-XYZ", required = true, value = "Número da declaração.<br>Tamanho mínimo: 1<br>Tamanho máximo: 70")
    /**
     * Número da declaração.<br>Tamanho mínimo: 1<br>Tamanho máximo: 70
     **/
    private String numero = null;

    @XmlElement(name = "faixaFim", required = true)
    @ApiModelProperty(example = "B-20", required = true, value = "Item final da faixa de itens.<br>Tamanho mínimo: 1<br>Tamanho máximo: 7")
    /**
     * Item final da faixa de itens.<br>Tamanho mínimo: 1<br>Tamanho máximo: 7
     **/
    private String faixaFim = null;

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
     * Item inicial da faixa de itens.&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 7
     *
     * @return faixaInicio
     **/
    @JsonProperty("faixaInicio")
    @NotNull
    public String getFaixaInicio() {
        return faixaInicio;
    }

    public void setFaixaInicio(String faixaInicio) {
        this.faixaInicio = faixaInicio;
    }

    public DeclaracaoExportacaoEstrangeiraCover faixaInicio(String faixaInicio) {
        this.faixaInicio = faixaInicio;
        return this;
    }

    /**
     * Número da declaração.&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 70
     *
     * @return numero
     **/
    @JsonProperty("numero")
    @NotNull
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public DeclaracaoExportacaoEstrangeiraCover numero(String numero) {
        this.numero = numero;
        return this;
    }

    /**
     * Item final da faixa de itens.&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 7
     *
     * @return faixaFim
     **/
    @JsonProperty("faixaFim")
    @NotNull
    public String getFaixaFim() {
        return faixaFim;
    }

    public void setFaixaFim(String faixaFim) {
        this.faixaFim = faixaFim;
    }

    public DeclaracaoExportacaoEstrangeiraCover faixaFim(String faixaFim) {
        this.faixaFim = faixaFim;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class DeclaracaoExportacaoEstrangeiraCover {\n" +
                "    faixaInicio: " + toIndentedString(faixaInicio) + "\n" +
                "    numero: " + toIndentedString(numero) + "\n" +
                "    faixaFim: " + toIndentedString(faixaFim) + "\n" +
                "}";
        return sb;
    }
}
