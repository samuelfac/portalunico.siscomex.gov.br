package br.gov.siscomex.portalunico.ccta.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "ChaveViagem", propOrder =
    { "identificacaoViagem"
})

@XmlRootElement(name="ChaveViagem")
public class ChaveViagem  {
  
  @XmlElement(name="identificacaoViagem")
  @ApiModelProperty(example = "XX099020200922MIA", value = "Número do identificação do manifesto<br/>Tamanho: 17")
 /**
   * Número do identificação do manifesto<br/>Tamanho: 17
  **/
  private String identificacaoViagem = null;
 /**
   * Número do identificação do manifesto&lt;br/&gt;Tamanho: 17
   * @return identificacaoViagem
  **/
  @JsonProperty("identificacaoViagem")
  public String getIdentificacaoViagem() {
    return identificacaoViagem;
  }

  public void setIdentificacaoViagem(String identificacaoViagem) {
    this.identificacaoViagem = identificacaoViagem;
  }

  public ChaveViagem identificacaoViagem(String identificacaoViagem) {
    this.identificacaoViagem = identificacaoViagem;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChaveViagem {\n");
    
    sb.append("    identificacaoViagem: ").append(toIndentedString(identificacaoViagem)).append("\n");
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

