package br.gov.siscomex.portalunico.ttce.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "MercadoriaDTO", propOrder =
    { "atributos", "vigencia"
})

@XmlRootElement(name="MercadoriaDTO")
public class MercadoriaDTO  {
  
  @XmlElement(name="atributos", required = true)
  @ApiModelProperty(required = true, value = "Combinação de características (atributos) que determinam o enquadramento de uma mercadoria neste Tratamento Tributário.")
  @Valid
 /**
   * Combinação de características (atributos) que determinam o enquadramento de uma mercadoria neste Tratamento Tributário.
  **/
  private List<AtributoDTO> atributos = new ArrayList<>();

  @XmlElement(name="vigencia", required = true)
  @ApiModelProperty(required = true, value = "")
  @Valid
  private VigenciaMercadoriaDTO vigencia = null;
 /**
   * Combinação de características (atributos) que determinam o enquadramento de uma mercadoria neste Tratamento Tributário.
   * @return atributos
  **/
  @JsonProperty("atributos")
  @NotNull
  public List<AtributoDTO> getAtributos() {
    return atributos;
  }

  public void setAtributos(List<AtributoDTO> atributos) {
    this.atributos = atributos;
  }

  public MercadoriaDTO atributos(List<AtributoDTO> atributos) {
    this.atributos = atributos;
    return this;
  }

  public MercadoriaDTO addAtributosItem(AtributoDTO atributosItem) {
    this.atributos.add(atributosItem);
    return this;
  }

 /**
   * Get vigencia
   * @return vigencia
  **/
  @JsonProperty("vigencia")
  @NotNull
  public VigenciaMercadoriaDTO getVigencia() {
    return vigencia;
  }

  public void setVigencia(VigenciaMercadoriaDTO vigencia) {
    this.vigencia = vigencia;
  }

  public MercadoriaDTO vigencia(VigenciaMercadoriaDTO vigencia) {
    this.vigencia = vigencia;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MercadoriaDTO {\n");
    
    sb.append("    atributos: ").append(toIndentedString(atributos)).append("\n");
    sb.append("    vigencia: ").append(toIndentedString(vigencia)).append("\n");
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

