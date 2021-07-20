package br.gov.siscomex.portalunico.ttce.model;

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
 @XmlType(name = "VigenciaMercadoriaDTO", propOrder =
    { "inicio", "fim"
})

@XmlRootElement(name="VigenciaMercadoriaDTO")
/**
  * Data de vigência inicial e final desta mercadoria que tem este conjunto de atributos.
 **/
@ApiModel(description="Data de vigência inicial e final desta mercadoria que tem este conjunto de atributos.")
public class VigenciaMercadoriaDTO  {
  
  @XmlElement(name="inicio", required = true)
  @ApiModelProperty(example = "2020-01-01", required = true, value = "Data de início da vigência</br><br>Formato: 'yyyy-MM-dd'")
 /**
   * Data de início da vigência</br><br>Formato: 'yyyy-MM-dd'
  **/
  private String inicio = null;

  @XmlElement(name="fim", required = true)
  @ApiModelProperty(example = "2021-12-31", required = true, value = "Data de fim da vigência</br><br>Formato: 'yyyy-MM-dd'")
 /**
   * Data de fim da vigência</br><br>Formato: 'yyyy-MM-dd'
  **/
  private String fim = null;
 /**
   * Data de início da vigência&lt;/br&gt;&lt;br&gt;Formato: &#39;yyyy-MM-dd&#39;
   * @return inicio
  **/
  @JsonProperty("inicio")
  @NotNull
  public String getInicio() {
    return inicio;
  }

  public void setInicio(String inicio) {
    this.inicio = inicio;
  }

  public VigenciaMercadoriaDTO inicio(String inicio) {
    this.inicio = inicio;
    return this;
  }

 /**
   * Data de fim da vigência&lt;/br&gt;&lt;br&gt;Formato: &#39;yyyy-MM-dd&#39;
   * @return fim
  **/
  @JsonProperty("fim")
  @NotNull
  public String getFim() {
    return fim;
  }

  public void setFim(String fim) {
    this.fim = fim;
  }

  public VigenciaMercadoriaDTO fim(String fim) {
    this.fim = fim;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VigenciaMercadoriaDTO {\n");
    
    sb.append("    inicio: ").append(toIndentedString(inicio)).append("\n");
    sb.append("    fim: ").append(toIndentedString(fim)).append("\n");
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

