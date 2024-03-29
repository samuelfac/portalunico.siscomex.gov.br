package br.gov.siscomex.portalunico.cct_ext.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "ConteinerDTO", propOrder =
    { "numeroConteiner", "tara", "lacres", "pesoBruto"
})

@XmlRootElement(name="ConteinerDTO")
public class ConteinerDTO  {
  
  @XmlElement(name="numeroConteiner")
  @ApiModelProperty(value = "")
  private String numeroConteiner = null;

  @XmlElement(name="tara")
  @ApiModelProperty(value = "")
  @Valid
  private BigDecimal tara = null;

  @XmlElement(name="lacres")
  @ApiModelProperty(value = "")
  private List<String> lacres = null;

  @XmlElement(name="pesoBruto")
  @ApiModelProperty(value = "")
  @Valid
  private BigDecimal pesoBruto = null;
 /**
   * Get numeroConteiner
   * @return numeroConteiner
  **/
  @JsonProperty("numeroConteiner")
  public String getNumeroConteiner() {
    return numeroConteiner;
  }

  public void setNumeroConteiner(String numeroConteiner) {
    this.numeroConteiner = numeroConteiner;
  }

  public ConteinerDTO numeroConteiner(String numeroConteiner) {
    this.numeroConteiner = numeroConteiner;
    return this;
  }

 /**
   * Get tara
   * @return tara
  **/
  @JsonProperty("tara")
  public BigDecimal getTara() {
    return tara;
  }

  public void setTara(BigDecimal tara) {
    this.tara = tara;
  }

  public ConteinerDTO tara(BigDecimal tara) {
    this.tara = tara;
    return this;
  }

 /**
   * Get lacres
   * @return lacres
  **/
  @JsonProperty("lacres")
  public List<String> getLacres() {
    return lacres;
  }

  public void setLacres(List<String> lacres) {
    this.lacres = lacres;
  }

  public ConteinerDTO lacres(List<String> lacres) {
    this.lacres = lacres;
    return this;
  }

  public ConteinerDTO addLacresItem(String lacresItem) {
    this.lacres.add(lacresItem);
    return this;
  }

 /**
   * Get pesoBruto
   * @return pesoBruto
  **/
  @JsonProperty("pesoBruto")
  public BigDecimal getPesoBruto() {
    return pesoBruto;
  }

  public void setPesoBruto(BigDecimal pesoBruto) {
    this.pesoBruto = pesoBruto;
  }

  public ConteinerDTO pesoBruto(BigDecimal pesoBruto) {
    this.pesoBruto = pesoBruto;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConteinerDTO {\n");
    
    sb.append("    numeroConteiner: ").append(toIndentedString(numeroConteiner)).append("\n");
    sb.append("    tara: ").append(toIndentedString(tara)).append("\n");
    sb.append("    lacres: ").append(toIndentedString(lacres)).append("\n");
    sb.append("    pesoBruto: ").append(toIndentedString(pesoBruto)).append("\n");
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

