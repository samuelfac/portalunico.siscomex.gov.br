package br.gov.siscomex.portalunico.catp.model;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "AgenciaEmissoraIntegracaoDTO", propOrder =
    { "numero", "codigo"
})

@XmlRootElement(name="AgenciaEmissoraIntegracaoDTO")
public class AgenciaEmissoraIntegracaoDTO  {
  
  @XmlElement(name="numero", required = true)
  @ApiModelProperty(example = "1232121212122", required = true, value = "Número da Agência Emissora de acordo com o WCO Data Model<br>Tamanho: 35")
 /**
   * Número da Agência Emissora de acordo com o WCO Data Model<br>Tamanho: 35
  **/
  private String numero = null;

  @XmlElement(name="codigo", required = true)
  @ApiModelProperty(example = "123", required = true, value = "Código da Agência Emissora de acordo com o WCO Data Model<br>Tamanho: 3")
 /**
   * Código da Agência Emissora de acordo com o WCO Data Model<br>Tamanho: 3
  **/
  private String codigo = null;
 /**
   * Número da Agência Emissora de acordo com o WCO Data Model&lt;br&gt;Tamanho: 35
   * @return numero
  **/
  @JsonProperty("numero")
  @NotNull
  public String getNumero() {
    return numero;
  }

  public void setNumero(String numero) {
    this.numero = numero;
  }

  public AgenciaEmissoraIntegracaoDTO numero(String numero) {
    this.numero = numero;
    return this;
  }

 /**
   * Código da Agência Emissora de acordo com o WCO Data Model&lt;br&gt;Tamanho: 3
   * @return codigo
  **/
  @JsonProperty("codigo")
  @NotNull
  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public AgenciaEmissoraIntegracaoDTO codigo(String codigo) {
    this.codigo = codigo;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgenciaEmissoraIntegracaoDTO {\n");
    
    sb.append("    numero: ").append(toIndentedString(numero)).append("\n");
    sb.append("    codigo: ").append(toIndentedString(codigo)).append("\n");
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

