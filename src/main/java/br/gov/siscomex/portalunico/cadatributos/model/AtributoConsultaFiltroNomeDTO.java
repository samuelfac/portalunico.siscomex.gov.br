package br.gov.siscomex.portalunico.cadatributos.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "AtributoConsultaFiltroNomeDTO", propOrder =
    { "nomes", "data"
})

@XmlRootElement(name="AtributoConsultaFiltroNomeDTO")
public class AtributoConsultaFiltroNomeDTO  {
  
  @XmlElement(name="nomes", required = true)
  @ApiModelProperty(required = true, value = "Lista de nomes de Atributos (Máximo 100 nomes.)<br>Tamanho mínimo: 0<br>Tamanho máximo: 200")
 /**
   * Lista de nomes de Atributos (Máximo 100 nomes.)<br>Tamanho mínimo: 0<br>Tamanho máximo: 200
  **/
  private List<String> nomes = new ArrayList<>();

  @XmlElement(name="data", required = true)
  @ApiModelProperty(required = true, value = "Data de referência")
 /**
   * Data de referência
  **/
  private OffsetDateTime data = null;
 /**
   * Lista de nomes de Atributos (Máximo 100 nomes.)&lt;br&gt;Tamanho mínimo: 0&lt;br&gt;Tamanho máximo: 200
   * @return nomes
  **/
  @JsonProperty("nomes")
  @NotNull
  public List<String> getNomes() {
    return nomes;
  }

  public void setNomes(List<String> nomes) {
    this.nomes = nomes;
  }

  public AtributoConsultaFiltroNomeDTO nomes(List<String> nomes) {
    this.nomes = nomes;
    return this;
  }

  public AtributoConsultaFiltroNomeDTO addNomesItem(String nomesItem) {
    this.nomes.add(nomesItem);
    return this;
  }

 /**
   * Data de referência
   * @return data
  **/
  @JsonProperty("data")
  @NotNull
  public OffsetDateTime getData() {
    return data;
  }

  public void setData(OffsetDateTime data) {
    this.data = data;
  }

  public AtributoConsultaFiltroNomeDTO data(OffsetDateTime data) {
    this.data = data;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AtributoConsultaFiltroNomeDTO {\n");
    
    sb.append("    nomes: ").append(toIndentedString(nomes)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

