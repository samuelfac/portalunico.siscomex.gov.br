package br.gov.siscomex.portalunico.cada.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiffArquivoDiarioSubatributoDTO", propOrder =
        {"adicionado", "excluido", "alterado"
        })

@XmlRootElement(name = "DiffArquivoDiarioSubatributoDTO")
public class DiffArquivoDiarioSubatributoDTO {

    @XmlElement(name = "adicionado")
    @ApiModelProperty(value = "Lista de subatributos adicionados")
    /**
     * Lista de subatributos adicionados
     **/
    private List<String> adicionado = null;

    @XmlElement(name = "excluido")
    @ApiModelProperty(value = "Lista de subatributos excluídos")
    /**
     * Lista de subatributos excluídos
     **/
    private List<String> excluido = null;

    @XmlElement(name = "alterado")
    @ApiModelProperty(value = "Lista de subatributos alterados")
    @Valid
    /**
     * Lista de subatributos alterados
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
     * Lista de subatributos adicionados
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

    public DiffArquivoDiarioSubatributoDTO adicionado(List<String> adicionado) {
        this.adicionado = adicionado;
        return this;
    }

    public DiffArquivoDiarioSubatributoDTO addAdicionadoItem(String adicionadoItem) {
        this.adicionado.add(adicionadoItem);
        return this;
    }

    /**
     * Lista de subatributos excluídos
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

    public DiffArquivoDiarioSubatributoDTO excluido(List<String> excluido) {
        this.excluido = excluido;
        return this;
    }

    public DiffArquivoDiarioSubatributoDTO addExcluidoItem(String excluidoItem) {
        this.excluido.add(excluidoItem);
        return this;
    }

    /**
     * Lista de subatributos alterados
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

    public DiffArquivoDiarioSubatributoDTO alterado(List<DiffArquivoDiarioAtributoDTO> alterado) {
        this.alterado = alterado;
        return this;
    }

    public DiffArquivoDiarioSubatributoDTO addAlteradoItem(DiffArquivoDiarioAtributoDTO alteradoItem) {
        this.alterado.add(alteradoItem);
        return this;
    }

    @Override
    public String toString() {

        String sb = "class DiffArquivoDiarioSubatributoDTO {\n" +
                "    adicionado: " + toIndentedString(adicionado) + "\n" +
                "    excluido: " + toIndentedString(excluido) + "\n" +
                "    alterado: " + toIndentedString(alterado) + "\n" +
                "}";
        return sb;
    }
}
