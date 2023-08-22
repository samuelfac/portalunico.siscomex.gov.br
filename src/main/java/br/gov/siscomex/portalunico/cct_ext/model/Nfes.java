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
 @XmlType(name = "Nfes", propOrder =
    { "nfe"
})

@XmlRootElement(name="Nfes")
/**
  * Lista das notas fiscais eletrônicas
 **/
@ApiModel(description="Lista das notas fiscais eletrônicas")
public class Nfes  {
  
  @XmlElement(name="nfe", required = true)
  @ApiModelProperty(required = true, value = "Lista das notas fiscais eletrônicas")
  @Valid
 /**
   * Lista das notas fiscais eletrônicas
  **/
  private List<Nfe> nfe = new ArrayList<>();
 /**
   * Lista das notas fiscais eletrônicas
   * @return nfe
  **/
  @JsonProperty("nfe")
  @NotNull
  public List<Nfe> getNfe() {
    return nfe;
  }

  public void setNfe(List<Nfe> nfe) {
    this.nfe = nfe;
  }

  public Nfes nfe(List<Nfe> nfe) {
    this.nfe = nfe;
    return this;
  }

  public Nfes addNfeItem(Nfe nfeItem) {
    this.nfe.add(nfeItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Nfes {\n");
    
    sb.append("    nfe: ").append(toIndentedString(nfe)).append("\n");
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

