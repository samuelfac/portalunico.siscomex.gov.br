package br.gov.siscomex.portalunico.duimp.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.time.OffsetDateTime;
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
 @XmlType(name = "ItemInfoAdicinaisCover", propOrder =
    { "dataHoraFatoGerador"
})

@XmlRootElement(name="ItemInfoAdicinaisCover")
/**
  * Informações adicionais do item 
 **/
@ApiModel(description="Informações adicionais do item ")
public class ItemInfoAdicinaisCover  {
  
  @XmlElement(name="dataHoraFatoGerador", required = true)
  @ApiModelProperty(required = true, value = "Data do fato gerador associado à Duimp para efeito de conversão de valores.")
 /**
   * Data do fato gerador associado à Duimp para efeito de conversão de valores.
  **/
  private OffsetDateTime dataHoraFatoGerador = null;
 /**
   * Data do fato gerador associado à Duimp para efeito de conversão de valores.
   * @return dataHoraFatoGerador
  **/
  @JsonProperty("dataHoraFatoGerador")
  @NotNull
  public OffsetDateTime getDataHoraFatoGerador() {
    return dataHoraFatoGerador;
  }

  public void setDataHoraFatoGerador(OffsetDateTime dataHoraFatoGerador) {
    this.dataHoraFatoGerador = dataHoraFatoGerador;
  }

  public ItemInfoAdicinaisCover dataHoraFatoGerador(OffsetDateTime dataHoraFatoGerador) {
    this.dataHoraFatoGerador = dataHoraFatoGerador;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemInfoAdicinaisCover {\n");
    
    sb.append("    dataHoraFatoGerador: ").append(toIndentedString(dataHoraFatoGerador)).append("\n");
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

