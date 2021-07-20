package br.gov.siscomex.portalunico.ttce.model;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "ExcetuaNcmDTO", propOrder =
    { "ncms"
})

@XmlRootElement(name="ExcetuaNcmDTO")
/**
  * NCMs para as quais NÃO se aplicam (excetuadas) este conjunto de Tratamentos Tributários agrupados.
 **/
@ApiModel(description="NCMs para as quais NÃO se aplicam (excetuadas) este conjunto de Tratamentos Tributários agrupados.")
public class ExcetuaNcmDTO  {
  
  @XmlElement(name="ncms", required = true)
  @ApiModelProperty(required = true, value = "Lista contendo os códigos das NCMs para os quais se excetua este conjunto de Tratamentos Tributários agrupados.")
  @Valid
 /**
   * Lista contendo os códigos das NCMs para os quais se excetua este conjunto de Tratamentos Tributários agrupados.
  **/
  private List<CodigoNcmDTO> ncms = new ArrayList<>();
 /**
   * Lista contendo os códigos das NCMs para os quais se excetua este conjunto de Tratamentos Tributários agrupados.
   * @return ncms
  **/
  @JsonProperty("ncms")
  @NotNull
  public List<CodigoNcmDTO> getNcms() {
    return ncms;
  }

  public void setNcms(List<CodigoNcmDTO> ncms) {
    this.ncms = ncms;
  }

  public ExcetuaNcmDTO ncms(List<CodigoNcmDTO> ncms) {
    this.ncms = ncms;
    return this;
  }

  public ExcetuaNcmDTO addNcmsItem(CodigoNcmDTO ncmsItem) {
    this.ncms.add(ncmsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExcetuaNcmDTO {\n");
    
    sb.append("    ncms: ").append(toIndentedString(ncms)).append("\n");
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

