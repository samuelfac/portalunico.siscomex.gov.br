package br.gov.siscomex.portalunico.duimp_api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.xml.bind.annotation.*;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "TratamentoAdministrativoCover", propOrder =
    { "resultadoProcessamentoTA", "itensTratamentoAdministrativo"
})

@XmlRootElement(name="TratamentoAdministrativoCover")
/**
  * Processo do diagnóstico do tratamento administrativo.
 **/
@ApiModel(description="Processo do diagnóstico do tratamento administrativo.")
public class TratamentoAdministrativoCover  {
  
  @XmlElement(name="resultadoProcessamentoTA")
  @ApiModelProperty(value = "")
  @Valid
  private ResultadoProcessamentoTACover resultadoProcessamentoTA = null;

  @XmlElement(name="itensTratamentoAdministrativo")
  @ApiModelProperty(value = "")
  @Valid
  private List<ItemTratamentoAdministrativoCover> itensTratamentoAdministrativo = null;
 /**
   * Get resultadoProcessamentoTA
   * @return resultadoProcessamentoTA
  **/
  @JsonProperty("resultadoProcessamentoTA")
  public ResultadoProcessamentoTACover getResultadoProcessamentoTA() {
    return resultadoProcessamentoTA;
  }

  public void setResultadoProcessamentoTA(ResultadoProcessamentoTACover resultadoProcessamentoTA) {
    this.resultadoProcessamentoTA = resultadoProcessamentoTA;
  }

  public TratamentoAdministrativoCover resultadoProcessamentoTA(ResultadoProcessamentoTACover resultadoProcessamentoTA) {
    this.resultadoProcessamentoTA = resultadoProcessamentoTA;
    return this;
  }

 /**
   * Get itensTratamentoAdministrativo
   * @return itensTratamentoAdministrativo
  **/
  @JsonProperty("itensTratamentoAdministrativo")
  public List<ItemTratamentoAdministrativoCover> getItensTratamentoAdministrativo() {
    return itensTratamentoAdministrativo;
  }

  public void setItensTratamentoAdministrativo(List<ItemTratamentoAdministrativoCover> itensTratamentoAdministrativo) {
    this.itensTratamentoAdministrativo = itensTratamentoAdministrativo;
  }

  public TratamentoAdministrativoCover itensTratamentoAdministrativo(List<ItemTratamentoAdministrativoCover> itensTratamentoAdministrativo) {
    this.itensTratamentoAdministrativo = itensTratamentoAdministrativo;
    return this;
  }

  public TratamentoAdministrativoCover addItensTratamentoAdministrativoItem(ItemTratamentoAdministrativoCover itensTratamentoAdministrativoItem) {
    this.itensTratamentoAdministrativo.add(itensTratamentoAdministrativoItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TratamentoAdministrativoCover {\n");
    
    sb.append("    resultadoProcessamentoTA: ").append(toIndentedString(resultadoProcessamentoTA)).append("\n");
    sb.append("    itensTratamentoAdministrativo: ").append(toIndentedString(itensTratamentoAdministrativo)).append("\n");
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

