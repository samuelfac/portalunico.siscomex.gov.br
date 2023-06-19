package br.gov.siscomex.portalunico.cct_ext.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "ListaRegistros", propOrder =
    { "lista"
})

@XmlRootElement(name="ListaRegistros")
/**
  * Lista do resultado da consulta
 **/
@ApiModel(description="Lista do resultado da consulta")
public class ListaRegistros  {
  
  @XmlElement(name="lista", required = true)
  @ApiModelProperty(required = true, value = "Lista do resultado da consulta<br>Tamanho máximo: 500")
 /**
   * Lista do resultado da consulta<br>Tamanho máximo: 500
  **/
  private List<Object> lista = new ArrayList<>();
 /**
   * Lista do resultado da consulta&lt;br&gt;Tamanho máximo: 500
   * @return lista
  **/
  @JsonProperty("lista")
  @NotNull
  public List<Object> getLista() {
    return lista;
  }

  public void setLista(List<Object> lista) {
    this.lista = lista;
  }

  public ListaRegistros lista(List<Object> lista) {
    this.lista = lista;
    return this;
  }

  public ListaRegistros addListaItem(Object listaItem) {
    this.lista.add(listaItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListaRegistros {\n");
    
    sb.append("    lista: ").append(toIndentedString(lista)).append("\n");
    sb.append("}");
    return sb.toString();
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

