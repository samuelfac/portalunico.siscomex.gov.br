package br.gov.siscomex.portalunico.cct_ext.model;

import com.fasterxml.jackson.annotation.JsonProperty;
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
 @XmlType(name = "NotasFiscais", propOrder =
    { "nfe"
})

@XmlRootElement(name="NotasFiscais")
public class NotasFiscais  {
  
  @XmlElement(name="nfe", required = true)
  @ApiModelProperty(required = true, value = "")
  @Valid
  private List<NotaFiscalEletronica> nfe = new ArrayList<>();
 /**
   * Get nfe
   * @return nfe
  **/
  @JsonProperty("nfe")
  @NotNull
  public List<NotaFiscalEletronica> getNfe() {
    return nfe;
  }

  public void setNfe(List<NotaFiscalEletronica> nfe) {
    this.nfe = nfe;
  }

  public NotasFiscais nfe(List<NotaFiscalEletronica> nfe) {
    this.nfe = nfe;
    return this;
  }

  public NotasFiscais addNfeItem(NotaFiscalEletronica nfeItem) {
    this.nfe.add(nfeItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotasFiscais {\n");
    
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

