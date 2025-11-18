package br.gov.siscomex.portalunico.talp.model;

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
@XmlType(name = "SimularTaImportacaoFiltros", propOrder =
        {"pais", "condicaoMercadoria", "ncm", "atributos", "fundamentoLegal", "camposAdicionais"
        })

@XmlRootElement(name = "SimularTaImportacaoFiltros")
/**
 * Dados a serem informados para realizar a simulação de um Tratamento Administrativo de importação
 **/
@ApiModel(description = "Dados a serem informados para realizar a simulação de um Tratamento Administrativo de importação")
public class SimularTaImportacaoFiltros {

    @XmlElement(name = "pais", required = true)
    @ApiModelProperty(example = "80", required = true, value = "Código do país em Iso2")
    /**
     * Código do país em Iso2
     **/
    private String pais = null;

    @XmlElement(name = "condicaoMercadoria", required = true)
    @ApiModelProperty(example = "NOVA", required = true, value = "Código da condição da mercadoria")
    /**
     * Código da condição da mercadoria
     **/
    private String condicaoMercadoria = null;

    @XmlElement(name = "ncm", required = true)
    @ApiModelProperty(example = "01012100", required = true, value = "NCM a ser buscado")
    /**
     * NCM a ser buscado
     **/
    private String ncm = null;

    @XmlElement(name = "atributos", required = true)
    @ApiModelProperty(required = true, value = "Lista de atributos do NCM")
    @Valid
    /**
     * Lista de atributos do NCM
     **/
    private List<AtributoNcmValorDTO> atributos = new ArrayList<>();

    @XmlElement(name = "fundamentoLegal")
    @ApiModelProperty(example = "00617050920", value = "Código do fundamento legal")
    /**
     * Código do fundamento legal
     **/
    private String fundamentoLegal = null;

    @XmlElement(name = "camposAdicionais", required = true)
    @ApiModelProperty(required = true, value = "Campo adicional do TT")
    @Valid
    /**
     * Campo adicional do TT
     **/
    private List<ReferenciaCampoAdicionalTtDTO> camposAdicionais = new ArrayList<>();

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
     * Código do país em Iso2
     *
     * @return pais
     **/
    @JsonProperty("pais")
    @NotNull
    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    /**
     * Código da condição da mercadoria
     *
     * @return condicaoMercadoria
     **/
    @JsonProperty("condicaoMercadoria")
    @NotNull
    public String getCondicaoMercadoria() {
        return condicaoMercadoria;
    }

    public void setCondicaoMercadoria(String condicaoMercadoria) {
        this.condicaoMercadoria = condicaoMercadoria;
    }

    public SimularTaImportacaoFiltros condicaoMercadoria(String condicaoMercadoria) {
        this.condicaoMercadoria = condicaoMercadoria;
        return this;
    }

    /**
     * NCM a ser buscado
     *
     * @return ncm
     **/
    @JsonProperty("ncm")
    @NotNull
    public String getNcm() {
        return ncm;
    }

    public void setNcm(String ncm) {
        this.ncm = ncm;
    }

    public SimularTaImportacaoFiltros ncm(String ncm) {
        this.ncm = ncm;
        return this;
    }

    /**
     * Lista de atributos do NCM
     *
     * @return atributos
     **/
    @JsonProperty("atributos")
    @NotNull
    public List<AtributoNcmValorDTO> getAtributos() {
        return atributos;
    }

    public void setAtributos(List<AtributoNcmValorDTO> atributos) {
        this.atributos = atributos;
    }

    public SimularTaImportacaoFiltros atributos(List<AtributoNcmValorDTO> atributos) {
        this.atributos = atributos;
        return this;
    }

    public SimularTaImportacaoFiltros addAtributosItem(AtributoNcmValorDTO atributosItem) {
        this.atributos.add(atributosItem);
        return this;
    }

    public SimularTaImportacaoFiltros pais(String pais) {
        this.pais = pais;
        return this;
    }

    /**
     * Código do fundamento legal
     *
     * @return fundamentoLegal
     **/
    @JsonProperty("fundamentoLegal")
    public String getFundamentoLegal() {
        return fundamentoLegal;
    }

    public void setFundamentoLegal(String fundamentoLegal) {
        this.fundamentoLegal = fundamentoLegal;
    }

    public SimularTaImportacaoFiltros fundamentoLegal(String fundamentoLegal) {
        this.fundamentoLegal = fundamentoLegal;
        return this;
    }

    /**
     * Campo adicional do TT
     *
     * @return camposAdicionais
     **/
    @JsonProperty("camposAdicionais")
    @NotNull
    public List<ReferenciaCampoAdicionalTtDTO> getCamposAdicionais() {
        return camposAdicionais;
    }

    public void setCamposAdicionais(List<ReferenciaCampoAdicionalTtDTO> camposAdicionais) {
        this.camposAdicionais = camposAdicionais;
    }

    public SimularTaImportacaoFiltros camposAdicionais(List<ReferenciaCampoAdicionalTtDTO> camposAdicionais) {
        this.camposAdicionais = camposAdicionais;
        return this;
    }

    public SimularTaImportacaoFiltros addCamposAdicionaisItem(ReferenciaCampoAdicionalTtDTO camposAdicionaisItem) {
        this.camposAdicionais.add(camposAdicionaisItem);
        return this;
    }

    @Override
    public String toString() {

        String sb = "class SimularTaImportacaoFiltros {\n" +
                "    pais: " + toIndentedString(pais) + "\n" +
                "    condicaoMercadoria: " + toIndentedString(condicaoMercadoria) + "\n" +
                "    ncm: " + toIndentedString(ncm) + "\n" +
                "    atributos: " + toIndentedString(atributos) + "\n" +
                "    fundamentoLegal: " + toIndentedString(fundamentoLegal) + "\n" +
                "    camposAdicionais: " + toIndentedString(camposAdicionais) + "\n" +
                "}";
        return sb;
    }
}
