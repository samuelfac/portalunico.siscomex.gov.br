package br.gov.siscomex.portalunico.cct_ext.model;

import br.gov.siscomex.portalunico.cct_ext.model.RecepcaoNFE;
import io.swagger.v3.oas.annotations.media.Schema;
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
 @XmlType(name = "RecepcoesNFE", propOrder =
    { "recepcaoNFe"
})

@XmlRootElement(name="RecepcoesNFE")
/**
  * Recepções de Nota Fiscal Eletrônica<br>Máximo de ocorrências: 1
 **/
@ApiModel(description="Recepções de Nota Fiscal Eletrônica<br>Máximo de ocorrências: 1")
public class RecepcoesNFE  {
  
  @XmlElement(name="recepcaoNFe")
  @ApiModelProperty(value = "")
  @Valid
  private List<RecepcaoNFE> recepcaoNFe = null;
 /**
   * Get recepcaoNFe
   * @return recepcaoNFe
  **/
  @JsonProperty("recepcaoNFe")
  public List<RecepcaoNFE> getRecepcaoNFe() {
    return recepcaoNFe;
  }

  public void setRecepcaoNFe(List<RecepcaoNFE> recepcaoNFe) {
    this.recepcaoNFe = recepcaoNFe;
  }

  public RecepcoesNFE recepcaoNFe(List<RecepcaoNFE> recepcaoNFe) {
    this.recepcaoNFe = recepcaoNFe;
    return this;
  }

  public RecepcoesNFE addRecepcaoNFeItem(RecepcaoNFE recepcaoNFeItem) {
    this.recepcaoNFe.add(recepcaoNFeItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecepcoesNFE {\n");
    
    sb.append("    recepcaoNFe: ").append(toIndentedString(recepcaoNFe)).append("\n");
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

