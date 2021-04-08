package br.gov.siscomex.portalunico.cct_ext.model;

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
 @XmlType(name = "Nfe", propOrder =
    { "chaveAcesso", "conteineres"
})

@XmlRootElement(name="Nfe")
/**
  * Dados da nota fiscal eletrônica
 **/
@ApiModel(description="Dados da nota fiscal eletrônica")
public class Nfe  {
  
  @XmlElement(name="chaveAcesso", required = true)
  @ApiModelProperty(example = "35190500000000002720550900013694961000000003", required = true, value = "Chave de acesso da nota fiscal eletrônica<br>Tamanho: 44")
 /**
   * Chave de acesso da nota fiscal eletrônica<br>Tamanho: 44
  **/
  private String chaveAcesso = null;

  @XmlElement(name="conteineres", required = true)
  @ApiModelProperty(required = true, value = "")
  @Valid
  private Conteineres conteineres = null;
 /**
   * Chave de acesso da nota fiscal eletrônica&lt;br&gt;Tamanho: 44
   * @return chaveAcesso
  **/
  @JsonProperty("chaveAcesso")
  @NotNull
  public String getChaveAcesso() {
    return chaveAcesso;
  }

  public void setChaveAcesso(String chaveAcesso) {
    this.chaveAcesso = chaveAcesso;
  }

  public Nfe chaveAcesso(String chaveAcesso) {
    this.chaveAcesso = chaveAcesso;
    return this;
  }

 /**
   * Get conteineres
   * @return conteineres
  **/
  @JsonProperty("conteineres")
  @NotNull
  public Conteineres getConteineres() {
    return conteineres;
  }

  public void setConteineres(Conteineres conteineres) {
    this.conteineres = conteineres;
  }

  public Nfe conteineres(Conteineres conteineres) {
    this.conteineres = conteineres;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Nfe {\n");
    
    sb.append("    chaveAcesso: ").append(toIndentedString(chaveAcesso)).append("\n");
    sb.append("    conteineres: ").append(toIndentedString(conteineres)).append("\n");
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

