package br.gov.siscomex.portalunico.duimp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SefazInformacaoComplementarCover", propOrder =
        {"atributosDinamicos", "descricaoComplementarMercadoria"
        })

@XmlRootElement(name = "SefazInformacaoComplementarCover")
/**
 * Informações complementares da mercadoria
 **/
@ApiModel(description = "Informações complementares da mercadoria")
public class SefazInformacaoComplementarCover {

    @XmlElement(name = "atributosDinamicos")
    @ApiModelProperty(value = "Lista de atributos dinâmicos da mercadoria")
    @Valid
    /**
     * Lista de atributos dinâmicos da mercadoria
     **/
    private List<SefazAtributoCover> atributosDinamicos = null;

    @XmlElement(name = "descricaoComplementarMercadoria")
    @ApiModelProperty(example = "Texto complementando informações sobre a mercadoria. Podem ser informados até 4000 caracteres aqui", value = "Descrição complementar da mercadoria<br>Tamanho mínimo: 0<br>Tamanho máximo: 4000")
    /**
     * Descrição complementar da mercadoria<br>Tamanho mínimo: 0<br>Tamanho máximo: 4000
     **/
    private String descricaoComplementarMercadoria = null;

    /**
     * Lista de atributos dinâmicos da mercadoria
     *
     * @return atributosDinamicos
     **/
    @JsonProperty("atributosDinamicos")
    public List<SefazAtributoCover> getAtributosDinamicos() {
        return atributosDinamicos;
    }

    public void setAtributosDinamicos(List<SefazAtributoCover> atributosDinamicos) {
        this.atributosDinamicos = atributosDinamicos;
    }

    public SefazInformacaoComplementarCover atributosDinamicos(List<SefazAtributoCover> atributosDinamicos) {
        this.atributosDinamicos = atributosDinamicos;
        return this;
    }

    public SefazInformacaoComplementarCover addAtributosDinamicosItem(SefazAtributoCover atributosDinamicosItem) {
        this.atributosDinamicos.add(atributosDinamicosItem);
        return this;
    }

    /**
     * Descrição complementar da mercadoria&lt;br&gt;Tamanho mínimo: 0&lt;br&gt;Tamanho máximo: 4000
     *
     * @return descricaoComplementarMercadoria
     **/
    @JsonProperty("descricaoComplementarMercadoria")
    public String getDescricaoComplementarMercadoria() {
        return descricaoComplementarMercadoria;
    }

    public void setDescricaoComplementarMercadoria(String descricaoComplementarMercadoria) {
        this.descricaoComplementarMercadoria = descricaoComplementarMercadoria;
    }

    public SefazInformacaoComplementarCover descricaoComplementarMercadoria(String descricaoComplementarMercadoria) {
        this.descricaoComplementarMercadoria = descricaoComplementarMercadoria;
        return this;
    }


    @Override
    public String toString() {

        String sb = "class SefazInformacaoComplementarCover {\n" +
                "    atributosDinamicos: " + toIndentedString(atributosDinamicos) + "\n" +
                "    descricaoComplementarMercadoria: " + toIndentedString(descricaoComplementarMercadoria) + "\n" +
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

