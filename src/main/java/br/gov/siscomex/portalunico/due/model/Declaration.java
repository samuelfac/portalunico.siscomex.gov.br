package br.gov.siscomex.portalunico.due.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "Declaration", propOrder =
    { "declarationDrawbackIsencao", "declarationNFe", "declarationNoNF"
})

@XmlRootElement(name="Declaration")
public class Declaration  {
  
  @XmlElement(name="declarationDrawbackIsencao")
  @ApiModelProperty(value = "")
  @Valid
  private DeclarationDrawbackIsencao declarationDrawbackIsencao = null;

  @XmlElement(name="declarationNFe")
  @ApiModelProperty(value = "")
  @Valid
  private DeclarationNFe declarationNFe = null;

  @XmlElement(name="declarationNoNF")
  @ApiModelProperty(value = "")
  @Valid
  private DeclarationNoNF declarationNoNF = null;
 /**
   * Get declarationDrawbackIsencao
   * @return declarationDrawbackIsencao
  **/
  @JsonProperty("declarationDrawbackIsencao")
  public DeclarationDrawbackIsencao getDeclarationDrawbackIsencao() {
    return declarationDrawbackIsencao;
  }

  public void setDeclarationDrawbackIsencao(DeclarationDrawbackIsencao declarationDrawbackIsencao) {
    this.declarationDrawbackIsencao = declarationDrawbackIsencao;
  }

  public Declaration declarationDrawbackIsencao(DeclarationDrawbackIsencao declarationDrawbackIsencao) {
    this.declarationDrawbackIsencao = declarationDrawbackIsencao;
    return this;
  }

 /**
   * Get declarationNFe
   * @return declarationNFe
  **/
  @JsonProperty("declarationNFe")
  public DeclarationNFe getDeclarationNFe() {
    return declarationNFe;
  }

  public void setDeclarationNFe(DeclarationNFe declarationNFe) {
    this.declarationNFe = declarationNFe;
  }

  public Declaration declarationNFe(DeclarationNFe declarationNFe) {
    this.declarationNFe = declarationNFe;
    return this;
  }

 /**
   * Get declarationNoNF
   * @return declarationNoNF
  **/
  @JsonProperty("declarationNoNF")
  public DeclarationNoNF getDeclarationNoNF() {
    return declarationNoNF;
  }

  public void setDeclarationNoNF(DeclarationNoNF declarationNoNF) {
    this.declarationNoNF = declarationNoNF;
  }

  public Declaration declarationNoNF(DeclarationNoNF declarationNoNF) {
    this.declarationNoNF = declarationNoNF;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Declaration {\n");
    
    sb.append("    declarationDrawbackIsencao: ").append(toIndentedString(declarationDrawbackIsencao)).append("\n");
    sb.append("    declarationNFe: ").append(toIndentedString(declarationNFe)).append("\n");
    sb.append("    declarationNoNF: ").append(toIndentedString(declarationNoNF)).append("\n");
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

