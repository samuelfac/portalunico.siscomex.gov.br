package br.gov.siscomex.portalunico.due.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "FundamentoLegalExigenciaFiscalDTO", propOrder =
    { "linkNorma", "textoFundamentoLegal"
})

@XmlRootElement(name="FundamentoLegalExigenciaFiscalDTO")
public class FundamentoLegalExigenciaFiscalDTO  {
  
  @XmlElement(name="linkNorma")
  @ApiModelProperty(value = "Link da norma <br />Tamanho mínimo: 0<br />Tamanho máximo: 500")
 /**
   * Link da norma <br />Tamanho mínimo: 0<br />Tamanho máximo: 500
  **/
  private String linkNorma = null;

  @XmlElement(name="textoFundamentoLegal")
  @ApiModelProperty(value = "Dados do fundamento legal <br />Tamanho mínimo: 0<br />Tamanho máximo: 80")
 /**
   * Dados do fundamento legal <br />Tamanho mínimo: 0<br />Tamanho máximo: 80
  **/
  private String textoFundamentoLegal = null;
 /**
   * Link da norma &lt;br /&gt;Tamanho mínimo: 0&lt;br /&gt;Tamanho máximo: 500
   * @return linkNorma
  **/
  @JsonProperty("linkNorma")
  public String getLinkNorma() {
    return linkNorma;
  }

  public void setLinkNorma(String linkNorma) {
    this.linkNorma = linkNorma;
  }

  public FundamentoLegalExigenciaFiscalDTO linkNorma(String linkNorma) {
    this.linkNorma = linkNorma;
    return this;
  }

 /**
   * Dados do fundamento legal &lt;br /&gt;Tamanho mínimo: 0&lt;br /&gt;Tamanho máximo: 80
   * @return textoFundamentoLegal
  **/
  @JsonProperty("textoFundamentoLegal")
  public String getTextoFundamentoLegal() {
    return textoFundamentoLegal;
  }

  public void setTextoFundamentoLegal(String textoFundamentoLegal) {
    this.textoFundamentoLegal = textoFundamentoLegal;
  }

  public FundamentoLegalExigenciaFiscalDTO textoFundamentoLegal(String textoFundamentoLegal) {
    this.textoFundamentoLegal = textoFundamentoLegal;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FundamentoLegalExigenciaFiscalDTO {\n");
    
    sb.append("    linkNorma: ").append(toIndentedString(linkNorma)).append("\n");
    sb.append("    textoFundamentoLegal: ").append(toIndentedString(textoFundamentoLegal)).append("\n");
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

