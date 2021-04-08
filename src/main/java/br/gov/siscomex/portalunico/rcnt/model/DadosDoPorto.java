package br.gov.siscomex.portalunico.rcnt.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "DadosDoPorto", propOrder =
    { "idElemento", "porto"
})

@XmlRootElement(name="DadosDoPorto")
public class DadosDoPorto  {
  
  @XmlElement(name="idElemento")
  @ApiModelProperty(value = "Identificação de cada elemento da lista.<br/>Tamanho: 40")
 /**
   * Identificação de cada elemento da lista.<br/>Tamanho: 40
  **/
  private String idElemento = null;

  @XmlElement(name="porto")
  @ApiModelProperty(value = "Porto conforme tabela de domínio.<br/>Domínio: conforme <a href=\"../pages/exemplos/rcnt/Porto.pdf\" rel=\"noopener noreferrer\" target=\"_blank\"> Porto.pdf </a>")
 /**
   * Porto conforme tabela de domínio.<br/>Domínio: conforme <a href=\"../pages/exemplos/rcnt/Porto.pdf\" rel=\"noopener noreferrer\" target=\"_blank\"> Porto.pdf </a>
  **/
  private String porto = null;
 /**
   * Identificação de cada elemento da lista.&lt;br/&gt;Tamanho: 40
   * @return idElemento
  **/
  @JsonProperty("idElemento")
  public String getIdElemento() {
    return idElemento;
  }

  public void setIdElemento(String idElemento) {
    this.idElemento = idElemento;
  }

  public DadosDoPorto idElemento(String idElemento) {
    this.idElemento = idElemento;
    return this;
  }

 /**
   * Porto conforme tabela de domínio.&lt;br/&gt;Domínio: conforme &lt;a href&#x3D;\&quot;../pages/exemplos/rcnt/Porto.pdf\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot; target&#x3D;\&quot;_blank\&quot;&gt; Porto.pdf &lt;/a&gt;
   * @return porto
  **/
  @JsonProperty("porto")
  public String getPorto() {
    return porto;
  }

  public void setPorto(String porto) {
    this.porto = porto;
  }

  public DadosDoPorto porto(String porto) {
    this.porto = porto;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DadosDoPorto {\n");
    
    sb.append("    idElemento: ").append(toIndentedString(idElemento)).append("\n");
    sb.append("    porto: ").append(toIndentedString(porto)).append("\n");
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

