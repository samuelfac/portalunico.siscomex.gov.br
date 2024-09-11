package br.gov.siscomex.portalunico.cct_ext.model;

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
@XmlType(name = "ListaRespostaAPIAntesACD", propOrder =
        {"lista"
        })

@XmlRootElement(name = "ListaRespostaAPIAntesACD")
/**
 * Lista com registros da consulta de estoque antes ACD
 **/
@ApiModel(description = "Lista com registros da consulta de estoque antes ACD")
public class ListaRespostaAPIAntesACD {

    @XmlElement(name = "lista", required = true)
    @ApiModelProperty(required = true, value = "Lista do resultado da consulta<br>Tamanho máximo: 500")
    @Valid
    /**
     * Lista do resultado da consulta<br>Tamanho máximo: 500
     **/
    private List<RespostaConsultaAntesACD> lista = new ArrayList<>();

    /**
     * Lista do resultado da consulta&lt;br&gt;Tamanho máximo: 500
     *
     * @return lista
     **/
    @JsonProperty("lista")
    @NotNull
    public List<RespostaConsultaAntesACD> getLista() {
        return lista;
    }

    public void setLista(List<RespostaConsultaAntesACD> lista) {
        this.lista = lista;
    }

    public ListaRespostaAPIAntesACD lista(List<RespostaConsultaAntesACD> lista) {
        this.lista = lista;
        return this;
    }

    public ListaRespostaAPIAntesACD addListaItem(RespostaConsultaAntesACD listaItem) {
        this.lista.add(listaItem);
        return this;
    }


    @Override
    public String toString() {

        String sb = "class ListaRespostaAPIAntesACD {\n" +
                "    lista: " + toIndentedString(lista) + "\n" +
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

