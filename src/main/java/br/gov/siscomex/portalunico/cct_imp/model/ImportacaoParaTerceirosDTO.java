package br.gov.siscomex.portalunico.cct_imp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImportacaoParaTerceirosDTO", propOrder =
        {"terceiro", "descricao", "tipo"
        })

@XmlRootElement(name = "ImportacaoParaTerceirosDTO")
/**
 * Lista de caracterização da importação para terceiros
 **/
@ApiModel(description = "Lista de caracterização da importação para terceiros")
public class ImportacaoParaTerceirosDTO {

    @XmlElement(name = "terceiro")
    @ApiModelProperty(value = "")
    @Valid
    private TerceiroDTO terceiro = null;

    @XmlElement(name = "descricao")
    @ApiModelProperty(example = "Importação por Encomenda", value = "Descrição da indicação de caracterização da importação")
    /**
     * Descrição da indicação de caracterização da importação
     **/
    private String descricao = null;

    @XmlElement(name = "tipo")
    @ApiModelProperty(example = "Encomendante", value = "Descrição do tipo de terceiro")
    /**
     * Descrição do tipo de terceiro
     **/
    private String tipo = null;

    /**
     * Get terceiro
     *
     * @return terceiro
     **/
    @JsonProperty("terceiro")
    public TerceiroDTO getTerceiro() {
        return terceiro;
    }

    public void setTerceiro(TerceiroDTO terceiro) {
        this.terceiro = terceiro;
    }

    public ImportacaoParaTerceirosDTO terceiro(TerceiroDTO terceiro) {
        this.terceiro = terceiro;
        return this;
    }

    /**
     * Descrição da indicação de caracterização da importação
     *
     * @return descricao
     **/
    @JsonProperty("descricao")
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public ImportacaoParaTerceirosDTO descricao(String descricao) {
        this.descricao = descricao;
        return this;
    }

    /**
     * Descrição do tipo de terceiro
     *
     * @return tipo
     **/
    @JsonProperty("tipo")
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public ImportacaoParaTerceirosDTO tipo(String tipo) {
        this.tipo = tipo;
        return this;
    }


    @Override
    public String toString() {

        String sb = "class ImportacaoParaTerceirosDTO {\n" +
                "    terceiro: " + toIndentedString(terceiro) + "\n" +
                "    descricao: " + toIndentedString(descricao) + "\n" +
                "    tipo: " + toIndentedString(tipo) + "\n" +
                "}";
        return sb;
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
}

