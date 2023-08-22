package br.gov.siscomex.portalunico.duimp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "DadosDoProcesso", propOrder =
    { "tipo", "numeroProcesso"
})

@XmlRootElement(name="DadosDoProcesso")
public class DadosDoProcesso  {
  
  @XmlElement(name="tipo")
  @ApiModelProperty(value = "")
  @Valid
  private TipoDeProcessoObjetoCompostoPelosAtributosCdigoEDescrio tipo = null;

  @XmlElement(name="numeroProcesso")
  @ApiModelProperty(example = "15595720034201371", value = "Número do Processo vinculado à Duimp")
 /**
   * Número do Processo vinculado à Duimp
  **/
  private String numeroProcesso = null;
 /**
   * Get tipo
   * @return tipo
  **/
  @JsonProperty("tipo")
  public TipoDeProcessoObjetoCompostoPelosAtributosCdigoEDescrio getTipo() {
    return tipo;
  }

  public void setTipo(TipoDeProcessoObjetoCompostoPelosAtributosCdigoEDescrio tipo) {
    this.tipo = tipo;
  }

  public DadosDoProcesso tipo(TipoDeProcessoObjetoCompostoPelosAtributosCdigoEDescrio tipo) {
    this.tipo = tipo;
    return this;
  }

 /**
   * Número do Processo vinculado à Duimp
   * @return numeroProcesso
  **/
  @JsonProperty("numeroProcesso")
  public String getNumeroProcesso() {
    return numeroProcesso;
  }

  public void setNumeroProcesso(String numeroProcesso) {
    this.numeroProcesso = numeroProcesso;
  }

  public DadosDoProcesso numeroProcesso(String numeroProcesso) {
    this.numeroProcesso = numeroProcesso;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DadosDoProcesso {\n");
    
    sb.append("    tipo: ").append(toIndentedString(tipo)).append("\n");
    sb.append("    numeroProcesso: ").append(toIndentedString(numeroProcesso)).append("\n");
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

