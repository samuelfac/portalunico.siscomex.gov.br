package br.gov.siscomex.portalunico.cct_ext.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "DocumentoCarga", propOrder =
    { "numeroDUE", "numeroRUC"
})

@XmlRootElement(name="DocumentoCarga")
/**
  * Documento de carga
 **/
@ApiModel(description="Documento de carga")
public class DocumentoCarga  {
  
  @XmlElement(name="numeroDUE")
  @ApiModelProperty(example = "17BR0000453160", value = "Tamanho: 14<br>Formato: AABRSSSSSSSSSD<br>Descrição Formato<br>AA - Ano<br>BR - Brasil<br>SSSSSSSSS - número sequencial<br>D - DV")
 /**
   * Tamanho: 14<br>Formato: AABRSSSSSSSSSD<br>Descrição Formato<br>AA - Ano<br>BR - Brasil<br>SSSSSSSSS - número sequencial<br>D - DV
  **/
  private String numeroDUE = null;

  @XmlElement(name="numeroRUC")
  @ApiModelProperty(example = "7BR00000000100000000000000000048055", value = "Tamanho mínimo: 13<br>Tamanho máximo: 35<br>Formato: NAANNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN")
 /**
   * Tamanho mínimo: 13<br>Tamanho máximo: 35<br>Formato: NAANNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN
  **/
  private String numeroRUC = null;
 /**
   * Tamanho: 14&lt;br&gt;Formato: AABRSSSSSSSSSD&lt;br&gt;Descrição Formato&lt;br&gt;AA - Ano&lt;br&gt;BR - Brasil&lt;br&gt;SSSSSSSSS - número sequencial&lt;br&gt;D - DV
   * @return numeroDUE
  **/
  @JsonProperty("numeroDUE")
  public String getNumeroDUE() {
    return numeroDUE;
  }

  public void setNumeroDUE(String numeroDUE) {
    this.numeroDUE = numeroDUE;
  }

  public DocumentoCarga numeroDUE(String numeroDUE) {
    this.numeroDUE = numeroDUE;
    return this;
  }

 /**
   * Tamanho mínimo: 13&lt;br&gt;Tamanho máximo: 35&lt;br&gt;Formato: NAANNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN
   * @return numeroRUC
  **/
  @JsonProperty("numeroRUC")
  public String getNumeroRUC() {
    return numeroRUC;
  }

  public void setNumeroRUC(String numeroRUC) {
    this.numeroRUC = numeroRUC;
  }

  public DocumentoCarga numeroRUC(String numeroRUC) {
    this.numeroRUC = numeroRUC;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentoCarga {\n");
    
    sb.append("    numeroDUE: ").append(toIndentedString(numeroDUE)).append("\n");
    sb.append("    numeroRUC: ").append(toIndentedString(numeroRUC)).append("\n");
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

