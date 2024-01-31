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
 @XmlType(name = "AtributoConsultaFiltroCodigoDTO", propOrder =
    { "codigos", "data"
})

@XmlRootElement(name="AtributoConsultaFiltroCodigoDTO")
public class AtributoConsultaFiltroCodigoDTO  {
  
  @XmlElement(name="codigos", required = true)
  @ApiModelProperty(required = true, value = "Lista de códigos de Atributos (Máximo 100 códigos.)<br>Tamanho mínimo: 1<br>Tamanho máximo: 25")
 /**
   * Lista de códigos de Atributos (Máximo 100 códigos.)<br>Tamanho mínimo: 1<br>Tamanho máximo: 25
  **/
  private List<String> codigos = new ArrayList<>();

  @XmlElement(name="data", required = true)
  @ApiModelProperty(required = true, value = "Data de referência")
 /**
   * Data de referência
  **/
  private OffsetDateTime data = null;
 /**
   * Lista de códigos de Atributos (Máximo 100 códigos.)&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 25
   * @return codigos
  **/
  @JsonProperty("codigos")
  @NotNull
  public List<String> getCodigos() {
    return codigos;
  }

  public void setCodigos(List<String> codigos) {
    this.codigos = codigos;
  }

  public AtributoConsultaFiltroCodigoDTO codigos(List<String> codigos) {
    this.codigos = codigos;
    return this;
  }

  public AtributoConsultaFiltroCodigoDTO addCodigosItem(String codigosItem) {
    this.codigos.add(codigosItem);
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

  public AtributoConsultaFiltroCodigoDTO data(OffsetDateTime data) {
    this.data = data;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AtributoConsultaFiltroCodigoDTO {\n");
    
    sb.append("    codigos: ").append(toIndentedString(codigos)).append("\n");
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

