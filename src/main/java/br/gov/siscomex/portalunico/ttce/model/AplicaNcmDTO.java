package br.gov.siscomex.portalunico.ttce.model;

import java.util.ArrayList;
import java.util.List;

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
 @XmlType(name = "AplicaNcmDTO", propOrder =
    { "indicadorTodosNCMs", "ncms"
})

@XmlRootElement(name="AplicaNcmDTO")
/**
  * NCMs para as quais se aplicam este conjunto de Tratamentos Tributários agrupados.
 **/
@ApiModel(description="NCMs para as quais se aplicam este conjunto de Tratamentos Tributários agrupados.")
public class AplicaNcmDTO  {
  
  @XmlElement(name="indicadorTodosNCMs", required = true)
  @ApiModelProperty(example = "true", required = true, value = "Indicador de que este conjunto de Tratamentos Tributários agrupados se aplica para todas as NCMs.<br/><br>Dominio:<br>true - Sim, <br>false - Não")
 /**
   * Indicador de que este conjunto de Tratamentos Tributários agrupados se aplica para todas as NCMs.<br/><br>Dominio:<br>true - Sim, <br>false - Não
  **/
  private Boolean indicadorTodosNCMs = null;

  @XmlElement(name="ncms", required = true)
  @ApiModelProperty(required = true, value = "Lista contendo os códigos das NCMs para as quais se aplica este conjunto de Tratamentos Tributários agrupados.<br/>A lista será vazia caso o indicadorTodosNCMs=true.")
  @Valid
 /**
   * Lista contendo os códigos das NCMs para as quais se aplica este conjunto de Tratamentos Tributários agrupados.<br/>A lista será vazia caso o indicadorTodosNCMs=true.
  **/
  private List<CodigoNcmDTO> ncms = new ArrayList<>();
 /**
   * Indicador de que este conjunto de Tratamentos Tributários agrupados se aplica para todas as NCMs.&lt;br/&gt;&lt;br&gt;Dominio:&lt;br&gt;true - Sim, &lt;br&gt;false - Não
   * @return indicadorTodosNCMs
  **/
  @JsonProperty("indicadorTodosNCMs")
  @NotNull
  public Boolean isIndicadorTodosNCMs() {
    return indicadorTodosNCMs;
  }

  public void setIndicadorTodosNCMs(Boolean indicadorTodosNCMs) {
    this.indicadorTodosNCMs = indicadorTodosNCMs;
  }

  public AplicaNcmDTO indicadorTodosNCMs(Boolean indicadorTodosNCMs) {
    this.indicadorTodosNCMs = indicadorTodosNCMs;
    return this;
  }

 /**
   * Lista contendo os códigos das NCMs para as quais se aplica este conjunto de Tratamentos Tributários agrupados.&lt;br/&gt;A lista será vazia caso o indicadorTodosNCMs&#x3D;true.
   * @return ncms
  **/
  @JsonProperty("ncms")
  @NotNull
  public List<CodigoNcmDTO> getNcms() {
    return ncms;
  }

  public void setNcms(List<CodigoNcmDTO> ncms) {
    this.ncms = ncms;
  }

  public AplicaNcmDTO ncms(List<CodigoNcmDTO> ncms) {
    this.ncms = ncms;
    return this;
  }

  public AplicaNcmDTO addNcmsItem(CodigoNcmDTO ncmsItem) {
    this.ncms.add(ncmsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AplicaNcmDTO {\n");
    
    sb.append("    indicadorTodosNCMs: ").append(toIndentedString(indicadorTodosNCMs)).append("\n");
    sb.append("    ncms: ").append(toIndentedString(ncms)).append("\n");
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

