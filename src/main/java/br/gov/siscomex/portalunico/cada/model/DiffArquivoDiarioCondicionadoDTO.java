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
@XmlType(name = "DiffArquivoDiarioCondicionadoDTO", propOrder =
        {"adicionado", "excluido", "alterado"
        })

@XmlRootElement(name = "DiffArquivoDiarioCondicionadoDTO")
public class DiffArquivoDiarioCondicionadoDTO {

    @XmlElement(name = "adicionado")
    @ApiModelProperty(value = "Lista de Atributos Condicionados adicionados")
    /**
     * Lista de Atributos Condicionados adicionados
     **/
    private List<String> adicionado = null;

    @XmlElement(name = "excluido")
    @ApiModelProperty(value = "Lista de Atributos Condicionados excluídos")
    /**
     * Lista de Atributos Condicionados excluídos
     **/
    private List<String> excluido = null;

    @XmlElement(name = "alterado")
    @ApiModelProperty(value = "Lista de Atributos Condicionados alterados")
    @Valid
    /**
     * Lista de Atributos Condicionados alterados
     **/
    private List<DiffCondicionadoDTO> alterado = null;

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
     * Lista de Atributos Condicionados adicionados
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

    public DiffArquivoDiarioCondicionadoDTO adicionado(List<String> adicionado) {
        this.adicionado = adicionado;
        return this;
    }

    public DiffArquivoDiarioCondicionadoDTO addAdicionadoItem(String adicionadoItem) {
        this.adicionado.add(adicionadoItem);
        return this;
    }

    /**
     * Lista de Atributos Condicionados excluídos
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

    public DiffArquivoDiarioCondicionadoDTO excluido(List<String> excluido) {
        this.excluido = excluido;
        return this;
    }

    public DiffArquivoDiarioCondicionadoDTO addExcluidoItem(String excluidoItem) {
        this.excluido.add(excluidoItem);
        return this;
    }

    /**
     * Lista de Atributos Condicionados alterados
     *
     * @return alterado
     **/
    @JsonProperty("alterado")
    public List<DiffCondicionadoDTO> getAlterado() {
        return alterado;
    }

    public void setAlterado(List<DiffCondicionadoDTO> alterado) {
        this.alterado = alterado;
    }

    public DiffArquivoDiarioCondicionadoDTO alterado(List<DiffCondicionadoDTO> alterado) {
        this.alterado = alterado;
        return this;
    }

    public DiffArquivoDiarioCondicionadoDTO addAlteradoItem(DiffCondicionadoDTO alteradoItem) {
        this.alterado.add(alteradoItem);
        return this;
    }

    @Override
    public String toString() {

        String sb = "class DiffArquivoDiarioCondicionadoDTO {\n" +
                "    adicionado: " + toIndentedString(adicionado) + "\n" +
                "    excluido: " + toIndentedString(excluido) + "\n" +
                "    alterado: " + toIndentedString(alterado) + "\n" +
                "}";
        return sb;
    }
}
