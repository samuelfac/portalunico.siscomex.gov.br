package br.gov.siscomex.portalunico.remx_consulta.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "Divergncia", propOrder =
    { "codigoDivergencia", "justificativa", "nomeFiscal", "vigente"
})

@XmlRootElement(name="Divergncia")
public class Divergncia  {
  
  @XmlElement(name="codigoDivergencia")
  @ApiModelProperty(value = "Contém o código da divergência. O código da divergência é composto por até 2 dígitos.")
 /**
   * Contém o código da divergência. O código da divergência é composto por até 2 dígitos.
  **/
  private Integer codigoDivergencia = null;

  @XmlElement(name="justificativa")
  @ApiModelProperty(value = "Contém a justificativa da divergência.  Máximo de 500 caracteres, que podem ser letras, números, além de quaisquer caracteres referentes a codificação UTF-8")
 /**
   * Contém a justificativa da divergência.  Máximo de 500 caracteres, que podem ser letras, números, além de quaisquer caracteres referentes a codificação UTF-8
  **/
  private String justificativa = null;

  @XmlElement(name="nomeFiscal")
  @ApiModelProperty(value = "Contém o nome do fiscal que aplicou a divergência.  Máximo de 50 caracteres.")
 /**
   * Contém o nome do fiscal que aplicou a divergência.  Máximo de 50 caracteres.
  **/
  private String nomeFiscal = null;

  @XmlElement(name="vigente")
  @ApiModelProperty(value = "Contém a informação se a divergência está vigente. Valores pré-definidos:<br/>S: Vigente<br/>N: Não vigente")
 /**
   * Contém a informação se a divergência está vigente. Valores pré-definidos:<br/>S: Vigente<br/>N: Não vigente
  **/
  private String vigente = null;
 /**
   * Contém o código da divergência. O código da divergência é composto por até 2 dígitos.
   * @return codigoDivergencia
  **/
  @JsonProperty("codigoDivergencia")
  public Integer getCodigoDivergencia() {
    return codigoDivergencia;
  }

  public void setCodigoDivergencia(Integer codigoDivergencia) {
    this.codigoDivergencia = codigoDivergencia;
  }

  public Divergncia codigoDivergencia(Integer codigoDivergencia) {
    this.codigoDivergencia = codigoDivergencia;
    return this;
  }

 /**
   * Contém a justificativa da divergência.  Máximo de 500 caracteres, que podem ser letras, números, além de quaisquer caracteres referentes a codificação UTF-8
   * @return justificativa
  **/
  @JsonProperty("justificativa")
  public String getJustificativa() {
    return justificativa;
  }

  public void setJustificativa(String justificativa) {
    this.justificativa = justificativa;
  }

  public Divergncia justificativa(String justificativa) {
    this.justificativa = justificativa;
    return this;
  }

 /**
   * Contém o nome do fiscal que aplicou a divergência.  Máximo de 50 caracteres.
   * @return nomeFiscal
  **/
  @JsonProperty("nomeFiscal")
  public String getNomeFiscal() {
    return nomeFiscal;
  }

  public void setNomeFiscal(String nomeFiscal) {
    this.nomeFiscal = nomeFiscal;
  }

  public Divergncia nomeFiscal(String nomeFiscal) {
    this.nomeFiscal = nomeFiscal;
    return this;
  }

 /**
   * Contém a informação se a divergência está vigente. Valores pré-definidos:&lt;br/&gt;S: Vigente&lt;br/&gt;N: Não vigente
   * @return vigente
  **/
  @JsonProperty("vigente")
  public String getVigente() {
    return vigente;
  }

  public void setVigente(String vigente) {
    this.vigente = vigente;
  }

  public Divergncia vigente(String vigente) {
    this.vigente = vigente;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Divergncia {\n");
    
    sb.append("    codigoDivergencia: ").append(toIndentedString(codigoDivergencia)).append("\n");
    sb.append("    justificativa: ").append(toIndentedString(justificativa)).append("\n");
    sb.append("    nomeFiscal: ").append(toIndentedString(nomeFiscal)).append("\n");
    sb.append("    vigente: ").append(toIndentedString(vigente)).append("\n");
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

