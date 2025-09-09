package br.gov.siscomex.portalunico.cctr.model;

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
@XmlType(name = "TCargaSolta", propOrder =
        {"tipoEmbalagem", "quantidade"
        })

@XmlRootElement(name = "TCargaSolta")
/**
 * Dados informados para carga do tipo carga solta
 **/
@ApiModel(description = "Dados informados para carga do tipo carga solta")
public class TCargaSolta {

    @XmlElement(name = "tipoEmbalagem", required = true)
    @ApiModelProperty(example = "10", required = true, value = "Tipo de embalagem conforme a tabela Tipo de Embalagem.<br>Tamanho: 2<br>Formato: NN")
    /**
     * Tipo de embalagem conforme a tabela Tipo de Embalagem.<br>Tamanho: 2<br>Formato: NN
     **/
    private Integer tipoEmbalagem = null;

    @XmlElement(name = "quantidade")
    @ApiModelProperty(example = "9999", value = "Quantidade de embalagens deste tipo.<br>Tamanho: 4<br>Formato: NNNNN")
    /**
     * Quantidade de embalagens deste tipo.<br>Tamanho: 4<br>Formato: NNNNN
     **/
    private Integer quantidade = null;

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
     * Tipo de embalagem conforme a tabela Tipo de Embalagem.&lt;br&gt;Tamanho: 2&lt;br&gt;Formato: NN
     *
     * @return tipoEmbalagem
     **/
    @JsonProperty("tipoEmbalagem")
    @NotNull
    public Integer getTipoEmbalagem() {
        return tipoEmbalagem;
    }

    public void setTipoEmbalagem(Integer tipoEmbalagem) {
        this.tipoEmbalagem = tipoEmbalagem;
    }

    public TCargaSolta tipoEmbalagem(Integer tipoEmbalagem) {
        this.tipoEmbalagem = tipoEmbalagem;
        return this;
    }

    /**
     * Quantidade de embalagens deste tipo.&lt;br&gt;Tamanho: 4&lt;br&gt;Formato: NNNNN
     *
     * @return quantidade
     **/
    @JsonProperty("quantidade")
    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public TCargaSolta quantidade(Integer quantidade) {
        this.quantidade = quantidade;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class TCargaSolta {\n" +
                "    tipoEmbalagem: " + toIndentedString(tipoEmbalagem) + "\n" +
                "    quantidade: " + toIndentedString(quantidade) + "\n" +
                "}";
        return sb;
    }
}
