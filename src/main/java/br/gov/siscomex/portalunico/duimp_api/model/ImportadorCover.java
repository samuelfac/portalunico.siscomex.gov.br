package br.gov.siscomex.portalunico.duimp_api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "ImportadorCover", propOrder =
    { "ni"
})

@XmlRootElement(name="ImportadorCover")
/**
  * Identificação do importador da declaração única de importação.
 **/
@ApiModel(description="Identificação do importador da declaração única de importação.")
public class ImportadorCover  {
  
  @XmlElement(name="ni", required = true)
  @ApiModelProperty(example = "00055555000130", required = true, value = "Número do importador.<br>Tamanho: 14<br>Formato: 'NNNNNNNNNNNNNN'")
 /**
   * Número do importador.<br>Tamanho: 14<br>Formato: 'NNNNNNNNNNNNNN'
  **/
  private String ni = null;
 /**
   * Número do importador.&lt;br&gt;Tamanho: 14&lt;br&gt;Formato: &#39;NNNNNNNNNNNNNN&#39;
   * @return ni
  **/
  @JsonProperty("ni")
  @NotNull
  public String getNi() {
    return ni;
  }

  public void setNi(String ni) {
    this.ni = ni;
  }

  public ImportadorCover ni(String ni) {
    this.ni = ni;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImportadorCover {\n");
    
    sb.append("    ni: ").append(toIndentedString(ni)).append("\n");
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

