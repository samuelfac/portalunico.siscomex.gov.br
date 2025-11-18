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
@XmlType(name = "SimularTaExportacaoFiltros", propOrder =
        {"pais", "enquadramento", "situacaoEspecial", "ncm", "atributos"
        })

@XmlRootElement(name = "SimularTaExportacaoFiltros")
/**
 * Dados a serem informados para realizar a simulação de um Tratamento Administrativo de exportação
 **/
@ApiModel(description = "Dados a serem informados para realizar a simulação de um Tratamento Administrativo de exportação")
public class SimularTaExportacaoFiltros {

    @XmlElement(name = "pais", required = true)
    @ApiModelProperty(example = "80", required = true, value = "Código do país em Iso2")
    /**
     * Código do país em Iso2
     **/
    private String pais = null;

    @XmlElement(name = "enquadramento", required = true)
    @ApiModelProperty(example = "80000", required = true, value = "Código do enquadramento")
    /**
     * Código do enquadramento
     **/
    private String enquadramento = null;

    @XmlElement(name = "situacaoEspecial", required = true)
    @ApiModelProperty(example = "2000", required = true, value = "Código da situação especial")
    /**
     * Código da situação especial
     **/
    private Integer situacaoEspecial = null;

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

    public SimularTaExportacaoFiltros pais(String pais) {
        this.pais = pais;
        return this;
    }

    /**
     * Código do enquadramento
     *
     * @return enquadramento
     **/
    @JsonProperty("enquadramento")
    @NotNull
    public String getEnquadramento() {
        return enquadramento;
    }

    public void setEnquadramento(String enquadramento) {
        this.enquadramento = enquadramento;
    }

    /**
     * Código da situação especial
     *
     * @return situacaoEspecial
     **/
    @JsonProperty("situacaoEspecial")
    @NotNull
    public Integer getSituacaoEspecial() {
        return situacaoEspecial;
    }

    public void setSituacaoEspecial(Integer situacaoEspecial) {
        this.situacaoEspecial = situacaoEspecial;
    }

    public SimularTaExportacaoFiltros situacaoEspecial(Integer situacaoEspecial) {
        this.situacaoEspecial = situacaoEspecial;
        return this;
    }

    public SimularTaExportacaoFiltros enquadramento(String enquadramento) {
        this.enquadramento = enquadramento;
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

    public SimularTaExportacaoFiltros atributos(List<AtributoNcmValorDTO> atributos) {
        this.atributos = atributos;
        return this;
    }

    public SimularTaExportacaoFiltros addAtributosItem(AtributoNcmValorDTO atributosItem) {
        this.atributos.add(atributosItem);
        return this;
    }

    public SimularTaExportacaoFiltros ncm(String ncm) {
        this.ncm = ncm;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class SimularTaExportacaoFiltros {\n" +
                "    pais: " + toIndentedString(pais) + "\n" +
                "    enquadramento: " + toIndentedString(enquadramento) + "\n" +
                "    situacaoEspecial: " + toIndentedString(situacaoEspecial) + "\n" +
                "    ncm: " + toIndentedString(ncm) + "\n" +
                "    atributos: " + toIndentedString(atributos) + "\n" +
                "}";
        return sb;
    }
}
