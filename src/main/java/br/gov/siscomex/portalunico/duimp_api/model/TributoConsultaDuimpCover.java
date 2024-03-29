package br.gov.siscomex.portalunico.duimp_api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "TributoConsultaDuimpCover", propOrder =
    { "mercadoria", "tributosCalculados"
})

@XmlRootElement(name="TributoConsultaDuimpCover")
public class TributoConsultaDuimpCover  {
  
  @XmlElement(name="mercadoria")
  @ApiModelProperty(value = "")
  @Valid
  private MercadoriaDuimpConsultaCover mercadoria = null;

  @XmlElement(name="tributosCalculados")
  @ApiModelProperty(value = "")
  @Valid
  private List<TributoCalculadoDuimpConsultaCover> tributosCalculados = null;
 /**
   * Get mercadoria
   * @return mercadoria
  **/
  @JsonProperty("mercadoria")
  public MercadoriaDuimpConsultaCover getMercadoria() {
    return mercadoria;
  }

  public void setMercadoria(MercadoriaDuimpConsultaCover mercadoria) {
    this.mercadoria = mercadoria;
  }

  public TributoConsultaDuimpCover mercadoria(MercadoriaDuimpConsultaCover mercadoria) {
    this.mercadoria = mercadoria;
    return this;
  }

 /**
   * Get tributosCalculados
   * @return tributosCalculados
  **/
  @JsonProperty("tributosCalculados")
  public List<TributoCalculadoDuimpConsultaCover> getTributosCalculados() {
    return tributosCalculados;
  }

  public void setTributosCalculados(List<TributoCalculadoDuimpConsultaCover> tributosCalculados) {
    this.tributosCalculados = tributosCalculados;
  }

  public TributoConsultaDuimpCover tributosCalculados(List<TributoCalculadoDuimpConsultaCover> tributosCalculados) {
    this.tributosCalculados = tributosCalculados;
    return this;
  }

  public TributoConsultaDuimpCover addTributosCalculadosItem(TributoCalculadoDuimpConsultaCover tributosCalculadosItem) {
    this.tributosCalculados.add(tributosCalculadosItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TributoConsultaDuimpCover {\n");
    
    sb.append("    mercadoria: ").append(toIndentedString(mercadoria)).append("\n");
    sb.append("    tributosCalculados: ").append(toIndentedString(tributosCalculados)).append("\n");
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

