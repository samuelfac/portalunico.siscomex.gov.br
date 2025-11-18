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
@XmlType(name = "VersaoArquivoDiarioAtributoDTO", propOrder =
        {"versao", "resumo", "adicionado", "excluido", "alterado"
        })

@XmlRootElement(name = "VersaoArquivoDiarioAtributoDTO")
/**
 * Informações sobre alterações no arquivo de atributos
 **/
@ApiModel(description = "Informações sobre alterações no arquivo de atributos")
public class VersaoArquivoDiarioAtributoDTO {

    @XmlElement(name = "versao")
    @ApiModelProperty(value = "Versão do arquivo")
    /**
     * Versão do arquivo
     **/
    private String versao = null;

    @XmlElement(name = "resumo")
    @ApiModelProperty(value = "Resumo das alterações")
    /**
     * Resumo das alterações
     **/
    private String resumo = null;

    @XmlElement(name = "adicionado")
    @ApiModelProperty(value = "Lista de Atributos adicionados")
    /**
     * Lista de Atributos adicionados
     **/
    private List<String> adicionado = null;

    @XmlElement(name = "excluido")
    @ApiModelProperty(value = "Lista de Atributos excluídos")
    /**
     * Lista de Atributos excluídos
     **/
    private List<String> excluido = null;

    @XmlElement(name = "alterado")
    @ApiModelProperty(value = "Lista de Atributos alterados")
    @Valid
    /**
     * Lista de Atributos alterados
     **/
    private List<DiffArquivoDiarioAtributoDTO> alterado = null;

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

    public VersaoArquivoDiarioAtributoDTO versao(String versao) {
        this.versao = versao;
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

    /**
     * Lista de Atributos adicionados
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

    public VersaoArquivoDiarioAtributoDTO adicionado(List<String> adicionado) {
        this.adicionado = adicionado;
        return this;
    }

    public VersaoArquivoDiarioAtributoDTO addAdicionadoItem(String adicionadoItem) {
        this.adicionado.add(adicionadoItem);
        return this;
    }

    /**
     * Lista de Atributos excluídos
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

    public VersaoArquivoDiarioAtributoDTO excluido(List<String> excluido) {
        this.excluido = excluido;
        return this;
    }

    public VersaoArquivoDiarioAtributoDTO addExcluidoItem(String excluidoItem) {
        this.excluido.add(excluidoItem);
        return this;
    }

    /**
     * Lista de Atributos alterados
     *
     * @return alterado
     **/
    @JsonProperty("alterado")
    public List<DiffArquivoDiarioAtributoDTO> getAlterado() {
        return alterado;
    }

    public void setAlterado(List<DiffArquivoDiarioAtributoDTO> alterado) {
        this.alterado = alterado;
    }

    public VersaoArquivoDiarioAtributoDTO alterado(List<DiffArquivoDiarioAtributoDTO> alterado) {
        this.alterado = alterado;
        return this;
    }

    public VersaoArquivoDiarioAtributoDTO addAlteradoItem(DiffArquivoDiarioAtributoDTO alteradoItem) {
        this.alterado.add(alteradoItem);
        return this;
    }

    public VersaoArquivoDiarioAtributoDTO resumo(String resumo) {
        this.resumo = resumo;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class VersaoArquivoDiarioAtributoDTO {\n" +
                "    versao: " + toIndentedString(versao) + "\n" +
                "    resumo: " + toIndentedString(resumo) + "\n" +
                "    adicionado: " + toIndentedString(adicionado) + "\n" +
                "    excluido: " + toIndentedString(excluido) + "\n" +
                "    alterado: " + toIndentedString(alterado) + "\n" +
                "}";
        return sb;
    }
}
