package br.gov.siscomex.portalunico.cct_imp.model;

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
@XmlType(name = "ConsultaEstoquePosResult", propOrder =
        {"lista", "erros"
        })

@XmlRootElement(name = "ConsultaEstoquePosResult")
public class ConsultaEstoquePosResult {

    @XmlElement(name = "lista")
    @ApiModelProperty(value = "")
    @Valid
    private List<ConsultaEstoquePosDetails> lista = null;

    @XmlElement(name = "erros")
    @ApiModelProperty(value = "")
    @Valid
    private List<MensagemErro> erros = null;

    /**
     * Get lista
     *
     * @return lista
     **/
    @JsonProperty("lista")
    public List<ConsultaEstoquePosDetails> getLista() {
        return lista;
    }

    public void setLista(List<ConsultaEstoquePosDetails> lista) {
        this.lista = lista;
    }

    public ConsultaEstoquePosResult lista(List<ConsultaEstoquePosDetails> lista) {
        this.lista = lista;
        return this;
    }

    public ConsultaEstoquePosResult addListaItem(ConsultaEstoquePosDetails listaItem) {
        this.lista.add(listaItem);
        return this;
    }

    /**
     * Get erros
     *
     * @return erros
     **/
    @JsonProperty("erros")
    public List<MensagemErro> getErros() {
        return erros;
    }

    public void setErros(List<MensagemErro> erros) {
        this.erros = erros;
    }

    public ConsultaEstoquePosResult erros(List<MensagemErro> erros) {
        this.erros = erros;
        return this;
    }

    public ConsultaEstoquePosResult addErrosItem(MensagemErro errosItem) {
        this.erros.add(errosItem);
        return this;
    }


    @Override
    public String toString() {

        String sb = "class ConsultaEstoquePosResult {\n" +
                "    lista: " + toIndentedString(lista) + "\n" +
                "    erros: " + toIndentedString(erros) + "\n" +
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

