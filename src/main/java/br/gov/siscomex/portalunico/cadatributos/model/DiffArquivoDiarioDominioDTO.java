package br.gov.siscomex.portalunico.cadatributos.model;

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
@XmlType(name = "DiffArquivoDiarioDominioDTO", propOrder =
        {"adicionado", "excluido", "alterado"
        })

@XmlRootElement(name = "DiffArquivoDiarioDominioDTO")
public class DiffArquivoDiarioDominioDTO {

    @XmlElement(name = "adicionado")
    @ApiModelProperty(value = "Lista de Valores do Domínio adicionados")
    /**
     * Lista de Valores do Domínio adicionados
     **/
    private List<String> adicionado = null;

    @XmlElement(name = "excluido")
    @ApiModelProperty(value = "Lista de Valores do Domínio excluídos")
    /**
     * Lista de Valores do Domínio excluídos
     **/
    private List<String> excluido = null;

    @XmlElement(name = "alterado")
    @ApiModelProperty(value = "Lista de Valores do Domínio alterados")
    @Valid
    /**
     * Lista de Valores do Domínio alterados
     **/
    private List<DiffValorDTO> alterado = null;

    /**
     * Lista de Valores do Domínio adicionados
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

    public DiffArquivoDiarioDominioDTO adicionado(List<String> adicionado) {
        this.adicionado = adicionado;
        return this;
    }

    public DiffArquivoDiarioDominioDTO addAdicionadoItem(String adicionadoItem) {
        this.adicionado.add(adicionadoItem);
        return this;
    }

    /**
     * Lista de Valores do Domínio excluídos
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

    public DiffArquivoDiarioDominioDTO excluido(List<String> excluido) {
        this.excluido = excluido;
        return this;
    }

    public DiffArquivoDiarioDominioDTO addExcluidoItem(String excluidoItem) {
        this.excluido.add(excluidoItem);
        return this;
    }

    /**
     * Lista de Valores do Domínio alterados
     *
     * @return alterado
     **/
    @JsonProperty("alterado")
    public List<DiffValorDTO> getAlterado() {
        return alterado;
    }

    public void setAlterado(List<DiffValorDTO> alterado) {
        this.alterado = alterado;
    }

    public DiffArquivoDiarioDominioDTO alterado(List<DiffValorDTO> alterado) {
        this.alterado = alterado;
        return this;
    }

    public DiffArquivoDiarioDominioDTO addAlteradoItem(DiffValorDTO alteradoItem) {
        this.alterado.add(alteradoItem);
        return this;
    }


    @Override
    public String toString() {

        String sb = "class DiffArquivoDiarioDominioDTO {\n" +
                "    adicionado: " + toIndentedString(adicionado) + "\n" +
                "    excluido: " + toIndentedString(excluido) + "\n" +
                "    alterado: " + toIndentedString(alterado) + "\n" +
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

