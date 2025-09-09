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
@XmlType(name = "SoltaVeiculo", propOrder =
        {"total", "tipoEmbalagem", "quantidade"
        })

@XmlRootElement(name = "SoltaVeiculo")
/**
 * Dados de Carga Solta/Veículo
 **/
@ApiModel(description = "Dados de Carga Solta/Veículo")
public class SoltaVeiculo {

    @XmlElement(name = "total")
    @ApiModelProperty(example = "9999999", value = "Total de embalagens deste tipo, caso não tenha sido informado ainda.<br>Tamanho: 7<br>Formato: NNNNNNN")
    /**
     * Total de embalagens deste tipo, caso não tenha sido informado ainda.<br>Tamanho: 7<br>Formato: NNNNNNN
     **/
    private Integer total = null;

    @XmlElement(name = "tipoEmbalagem")
    @ApiModelProperty(example = "10", value = "Tipo de embalagem conforme a tabela Tipo de Embalagem.<br>Tamanho: 2<br>Formato: NN")
    /**
     * Tipo de embalagem conforme a tabela Tipo de Embalagem.<br>Tamanho: 2<br>Formato: NN
     **/
    private String tipoEmbalagem = null;

    @XmlElement(name = "quantidade", required = true)
    @ApiModelProperty(example = "9999999", required = true, value = "Quantidade de embalagens deste tipo.<br>Tamanho: 7<br>Formato: NNNNNNN")
    /**
     * Quantidade de embalagens deste tipo.<br>Tamanho: 7<br>Formato: NNNNNNN
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
     * Total de embalagens deste tipo, caso não tenha sido informado ainda.&lt;br&gt;Tamanho: 7&lt;br&gt;Formato: NNNNNNN
     *
     * @return total
     **/
    @JsonProperty("total")
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public SoltaVeiculo total(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * Tipo de embalagem conforme a tabela Tipo de Embalagem.&lt;br&gt;Tamanho: 2&lt;br&gt;Formato: NN
     *
     * @return tipoEmbalagem
     **/
    @JsonProperty("tipoEmbalagem")
    public String getTipoEmbalagem() {
        return tipoEmbalagem;
    }

    public void setTipoEmbalagem(String tipoEmbalagem) {
        this.tipoEmbalagem = tipoEmbalagem;
    }

    public SoltaVeiculo tipoEmbalagem(String tipoEmbalagem) {
        this.tipoEmbalagem = tipoEmbalagem;
        return this;
    }

    /**
     * Quantidade de embalagens deste tipo.&lt;br&gt;Tamanho: 7&lt;br&gt;Formato: NNNNNNN
     *
     * @return quantidade
     **/
    @JsonProperty("quantidade")
    @NotNull
    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public SoltaVeiculo quantidade(Integer quantidade) {
        this.quantidade = quantidade;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class SoltaVeiculo {\n" +
                "    total: " + toIndentedString(total) + "\n" +
                "    tipoEmbalagem: " + toIndentedString(tipoEmbalagem) + "\n" +
                "    quantidade: " + toIndentedString(quantidade) + "\n" +
                "}";
        return sb;
    }
}
