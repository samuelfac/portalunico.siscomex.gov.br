package br.gov.siscomex.portalunico.rcnt.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "DadosLocalizaoArmazenamentoLote", propOrder =
    { "box", "estante", "prateleira", "rua", "setor"
})

@XmlRootElement(name="DadosLocalizaoArmazenamentoLote")
public class DadosLocalizaoArmazenamentoLote  {
  
  @XmlElement(name="box")
  @ApiModelProperty(value = "Box<br/>Tamanho: 100")
 /**
   * Box<br/>Tamanho: 100
  **/
  private String box = null;

  @XmlElement(name="estante")
  @ApiModelProperty(value = "Estante<br/>Tamanho: 20")
 /**
   * Estante<br/>Tamanho: 20
  **/
  private String estante = null;

  @XmlElement(name="prateleira")
  @ApiModelProperty(value = "Prateleira<br/>Tamanho: 20")
 /**
   * Prateleira<br/>Tamanho: 20
  **/
  private String prateleira = null;

  @XmlElement(name="rua")
  @ApiModelProperty(value = "Rua<br/>Tamanho: 100")
 /**
   * Rua<br/>Tamanho: 100
  **/
  private String rua = null;

  @XmlElement(name="setor")
  @ApiModelProperty(value = "Setor<br/>Tamanho: 100")
 /**
   * Setor<br/>Tamanho: 100
  **/
  private String setor = null;
 /**
   * Box&lt;br/&gt;Tamanho: 100
   * @return box
  **/
  @JsonProperty("box")
  public String getBox() {
    return box;
  }

  public void setBox(String box) {
    this.box = box;
  }

  public DadosLocalizaoArmazenamentoLote box(String box) {
    this.box = box;
    return this;
  }

 /**
   * Estante&lt;br/&gt;Tamanho: 20
   * @return estante
  **/
  @JsonProperty("estante")
  public String getEstante() {
    return estante;
  }

  public void setEstante(String estante) {
    this.estante = estante;
  }

  public DadosLocalizaoArmazenamentoLote estante(String estante) {
    this.estante = estante;
    return this;
  }

 /**
   * Prateleira&lt;br/&gt;Tamanho: 20
   * @return prateleira
  **/
  @JsonProperty("prateleira")
  public String getPrateleira() {
    return prateleira;
  }

  public void setPrateleira(String prateleira) {
    this.prateleira = prateleira;
  }

  public DadosLocalizaoArmazenamentoLote prateleira(String prateleira) {
    this.prateleira = prateleira;
    return this;
  }

 /**
   * Rua&lt;br/&gt;Tamanho: 100
   * @return rua
  **/
  @JsonProperty("rua")
  public String getRua() {
    return rua;
  }

  public void setRua(String rua) {
    this.rua = rua;
  }

  public DadosLocalizaoArmazenamentoLote rua(String rua) {
    this.rua = rua;
    return this;
  }

 /**
   * Setor&lt;br/&gt;Tamanho: 100
   * @return setor
  **/
  @JsonProperty("setor")
  public String getSetor() {
    return setor;
  }

  public void setSetor(String setor) {
    this.setor = setor;
  }

  public DadosLocalizaoArmazenamentoLote setor(String setor) {
    this.setor = setor;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DadosLocalizaoArmazenamentoLote {\n");
    
    sb.append("    box: ").append(toIndentedString(box)).append("\n");
    sb.append("    estante: ").append(toIndentedString(estante)).append("\n");
    sb.append("    prateleira: ").append(toIndentedString(prateleira)).append("\n");
    sb.append("    rua: ").append(toIndentedString(rua)).append("\n");
    sb.append("    setor: ").append(toIndentedString(setor)).append("\n");
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

