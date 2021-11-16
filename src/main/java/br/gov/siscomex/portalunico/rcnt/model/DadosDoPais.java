package br.gov.siscomex.portalunico.rcnt.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "DadosDoPais", propOrder =
    { "idElemento", "pais"
})

@XmlRootElement(name="DadosDoPais")
public class DadosDoPais  {
  
  @XmlElement(name="idElemento")
  @ApiModelProperty(value = "Identificação de cada elemento da lista.<br/>Tamanho: 40")
 /**
   * Identificação de cada elemento da lista.<br/>Tamanho: 40
  **/
  private String idElemento = null;

  @XmlElement(name="pais")
  @ApiModelProperty(example = "DE", value = "País de destino final da carga conforme tabela de domínio.<br/>Domínio: conforme <a href=\"../pages/exemplos/rcnt/Pais.pdf\" rel=\"noopener noreferrer\" target=\"_blank\"> Pais.pdf </a>")
 /**
   * País de destino final da carga conforme tabela de domínio.<br/>Domínio: conforme <a href=\"../pages/exemplos/rcnt/Pais.pdf\" rel=\"noopener noreferrer\" target=\"_blank\"> Pais.pdf </a>
  **/
  private String pais = null;
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

  public DadosDoPais idElemento(String idElemento) {
    this.idElemento = idElemento;
    return this;
  }

 /**
   * País de destino final da carga conforme tabela de domínio.&lt;br/&gt;Domínio: conforme &lt;a href&#x3D;\&quot;../pages/exemplos/rcnt/Pais.pdf\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot; target&#x3D;\&quot;_blank\&quot;&gt; Pais.pdf &lt;/a&gt;
   * @return pais
  **/
  @JsonProperty("pais")
  public String getPais() {
    return pais;
  }

  public void setPais(String pais) {
    this.pais = pais;
  }

  public DadosDoPais pais(String pais) {
    this.pais = pais;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DadosDoPais {\n");
    
    sb.append("    idElemento: ").append(toIndentedString(idElemento)).append("\n");
    sb.append("    pais: ").append(toIndentedString(pais)).append("\n");
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

