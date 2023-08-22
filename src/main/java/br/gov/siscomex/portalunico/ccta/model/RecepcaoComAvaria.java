package br.gov.siscomex.portalunico.ccta.model;

import br.gov.siscomex.portalunico.ccta.model.Avaria;
import java.util.ArrayList;
import java.util.List;
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
 @XmlType(name = "RecepcaoComAvaria", propOrder =
    { "avarias", "observacoesAvarias", "recinto"
})

@XmlRootElement(name="RecepcaoComAvaria")
public class RecepcaoComAvaria  {
  
  @XmlElement(name="avarias")
  @ApiModelProperty(value = "Lista as avarias<br/>")
  @Valid
 /**
   * Lista as avarias<br/>
  **/
  private List<Avaria> avarias = null;

  @XmlElement(name="observacoesAvarias")
  @ApiModelProperty(value = "Lista as observações sobre as avarias na recepção<br/>")
 /**
   * Lista as observações sobre as avarias na recepção<br/>
  **/
  private List<String> observacoesAvarias = null;

  @XmlElement(name="recinto")
  @ApiModelProperty(example = "8911101", value = "Código do Recinto Aduaneiro.<br/>Tamanho: 7<br/> Formato: inteiro com até 7 dígitos")
 /**
   * Código do Recinto Aduaneiro.<br/>Tamanho: 7<br/> Formato: inteiro com até 7 dígitos
  **/
  private String recinto = null;
 /**
   * Lista as avarias&lt;br/&gt;
   * @return avarias
  **/
  @JsonProperty("avarias")
  public List<Avaria> getAvarias() {
    return avarias;
  }

  public void setAvarias(List<Avaria> avarias) {
    this.avarias = avarias;
  }

  public RecepcaoComAvaria avarias(List<Avaria> avarias) {
    this.avarias = avarias;
    return this;
  }

  public RecepcaoComAvaria addAvariasItem(Avaria avariasItem) {
    this.avarias.add(avariasItem);
    return this;
  }

 /**
   * Lista as observações sobre as avarias na recepção&lt;br/&gt;
   * @return observacoesAvarias
  **/
  @JsonProperty("observacoesAvarias")
  public List<String> getObservacoesAvarias() {
    return observacoesAvarias;
  }

  public void setObservacoesAvarias(List<String> observacoesAvarias) {
    this.observacoesAvarias = observacoesAvarias;
  }

  public RecepcaoComAvaria observacoesAvarias(List<String> observacoesAvarias) {
    this.observacoesAvarias = observacoesAvarias;
    return this;
  }

  public RecepcaoComAvaria addObservacoesAvariasItem(String observacoesAvariasItem) {
    this.observacoesAvarias.add(observacoesAvariasItem);
    return this;
  }

 /**
   * Código do Recinto Aduaneiro.&lt;br/&gt;Tamanho: 7&lt;br/&gt; Formato: inteiro com até 7 dígitos
   * @return recinto
  **/
  @JsonProperty("recinto")
  public String getRecinto() {
    return recinto;
  }

  public void setRecinto(String recinto) {
    this.recinto = recinto;
  }

  public RecepcaoComAvaria recinto(String recinto) {
    this.recinto = recinto;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecepcaoComAvaria {\n");
    
    sb.append("    avarias: ").append(toIndentedString(avarias)).append("\n");
    sb.append("    observacoesAvarias: ").append(toIndentedString(observacoesAvarias)).append("\n");
    sb.append("    recinto: ").append(toIndentedString(recinto)).append("\n");
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

