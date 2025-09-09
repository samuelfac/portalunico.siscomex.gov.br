package br.gov.siscomex.portalunico.cada.model;

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
@XmlType(name = "VersaoArquivoDiarioAtributoNcmDTO", propOrder =
        {"adicionado", "excluido", "resumo", "versao", "alterado"
        })

@XmlRootElement(name = "VersaoArquivoDiarioAtributoNcmDTO")
/**
 * Informações sobre alterações no arquivo de atributos e NCM
 **/
@ApiModel(description = "Informações sobre alterações no arquivo de atributos e NCM")
public class VersaoArquivoDiarioAtributoNcmDTO {

    @XmlElement(name = "adicionado")
    @ApiModelProperty(value = "Lista de NCM adicionadas")
    /**
     * Lista de NCM adicionadas
     **/
    private List<String> adicionado = null;

    @XmlElement(name = "excluido")
    @ApiModelProperty(value = "Lista de NCM excluídas")
    /**
     * Lista de NCM excluídas
     **/
    private List<String> excluido = null;

    @XmlElement(name = "resumo")
    @ApiModelProperty(value = "Resumo das alterações")
    /**
     * Resumo das alterações
     **/
    private String resumo = null;

    @XmlElement(name = "versao")
    @ApiModelProperty(value = "Versão do arquivo")
    /**
     * Versão do arquivo
     **/
    private String versao = null;

    @XmlElement(name = "alterado")
    @ApiModelProperty(value = "Lista de NCM alteradas")
    @Valid
    /**
     * Lista de NCM alteradas
     **/
    private List<DiffArquivoDiarioNcmDTO> alterado = null;

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
     * Lista de NCM adicionadas
     *
     * @return adicionado
     **/
    @JsonProperty("adicionado")
    public List<String> getAdicionado() {
        return adicionado;
    }

    public void setAdicionado(List<String> adicionado) {
        this.adicionado = adicionado;
    }

    public VersaoArquivoDiarioAtributoNcmDTO adicionado(List<String> adicionado) {
        this.adicionado = adicionado;
        return this;
    }

    public VersaoArquivoDiarioAtributoNcmDTO addAdicionadoItem(String adicionadoItem) {
        this.adicionado.add(adicionadoItem);
        return this;
    }

    /**
     * Lista de NCM excluídas
     *
     * @return excluido
     **/
    @JsonProperty("excluido")
    public List<String> getExcluido() {
        return excluido;
    }

    public void setExcluido(List<String> excluido) {
        this.excluido = excluido;
    }

    public VersaoArquivoDiarioAtributoNcmDTO excluido(List<String> excluido) {
        this.excluido = excluido;
        return this;
    }

    public VersaoArquivoDiarioAtributoNcmDTO addExcluidoItem(String excluidoItem) {
        this.excluido.add(excluidoItem);
        return this;
    }

    /**
     * Resumo das alterações
     *
     * @return resumo
     **/
    @JsonProperty("resumo")
    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public VersaoArquivoDiarioAtributoNcmDTO resumo(String resumo) {
        this.resumo = resumo;
        return this;
    }

    /**
     * Versão do arquivo
     *
     * @return versao
     **/
    @JsonProperty("versao")
    public String getVersao() {
        return versao;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }

    public VersaoArquivoDiarioAtributoNcmDTO versao(String versao) {
        this.versao = versao;
        return this;
    }

    /**
     * Lista de NCM alteradas
     *
     * @return alterado
     **/
    @JsonProperty("alterado")
    public List<DiffArquivoDiarioNcmDTO> getAlterado() {
        return alterado;
    }

    public void setAlterado(List<DiffArquivoDiarioNcmDTO> alterado) {
        this.alterado = alterado;
    }

    public VersaoArquivoDiarioAtributoNcmDTO alterado(List<DiffArquivoDiarioNcmDTO> alterado) {
        this.alterado = alterado;
        return this;
    }

    public VersaoArquivoDiarioAtributoNcmDTO addAlteradoItem(DiffArquivoDiarioNcmDTO alteradoItem) {
        this.alterado.add(alteradoItem);
        return this;
    }

    @Override
    public String toString() {

        String sb = "class VersaoArquivoDiarioAtributoNcmDTO {\n" +
                "    adicionado: " + toIndentedString(adicionado) + "\n" +
                "    excluido: " + toIndentedString(excluido) + "\n" +
                "    resumo: " + toIndentedString(resumo) + "\n" +
                "    versao: " + toIndentedString(versao) + "\n" +
                "    alterado: " + toIndentedString(alterado) + "\n" +
                "}";
        return sb;
    }
}
