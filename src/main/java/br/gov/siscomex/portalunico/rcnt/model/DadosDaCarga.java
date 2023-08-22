package br.gov.siscomex.portalunico.rcnt.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "DadosDaCarga", propOrder =
    { "idElemento", "identificadorCarga"
})

@XmlRootElement(name="DadosDaCarga")
public class DadosDaCarga  {
  
  @XmlElement(name="idElemento", required = true)
  @ApiModelProperty(required = true, value = "Identificação de cada elemento da lista. Este atributo é obrigatório e deve ser único dentro da lista correspondente.<br/>Tamanho: 40")
 /**
   * Identificação de cada elemento da lista. Este atributo é obrigatório e deve ser único dentro da lista correspondente.<br/>Tamanho: 40
  **/
  private String idElemento = null;

  @XmlElement(name="identificadorCarga")
  @ApiModelProperty(example = "carga1", value = "Outro identificador da carga, como número da reserva ou bilhete aéreo nos casos de bagagem. Utilização para casos em que não há manifesto ou conhecimento associado à carga.<br/>Tamanho: 100")
 /**
   * Outro identificador da carga, como número da reserva ou bilhete aéreo nos casos de bagagem. Utilização para casos em que não há manifesto ou conhecimento associado à carga.<br/>Tamanho: 100
  **/
  private String identificadorCarga = null;
 /**
   * Identificação de cada elemento da lista. Este atributo é obrigatório e deve ser único dentro da lista correspondente.&lt;br/&gt;Tamanho: 40
   * @return idElemento
  **/
  @JsonProperty("idElemento")
  @NotNull
  public String getIdElemento() {
    return idElemento;
  }

  public void setIdElemento(String idElemento) {
    this.idElemento = idElemento;
  }

  public DadosDaCarga idElemento(String idElemento) {
    this.idElemento = idElemento;
    return this;
  }

 /**
   * Outro identificador da carga, como número da reserva ou bilhete aéreo nos casos de bagagem. Utilização para casos em que não há manifesto ou conhecimento associado à carga.&lt;br/&gt;Tamanho: 100
   * @return identificadorCarga
  **/
  @JsonProperty("identificadorCarga")
  public String getIdentificadorCarga() {
    return identificadorCarga;
  }

  public void setIdentificadorCarga(String identificadorCarga) {
    this.identificadorCarga = identificadorCarga;
  }

  public DadosDaCarga identificadorCarga(String identificadorCarga) {
    this.identificadorCarga = identificadorCarga;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DadosDaCarga {\n");
    
    sb.append("    idElemento: ").append(toIndentedString(idElemento)).append("\n");
    sb.append("    identificadorCarga: ").append(toIndentedString(identificadorCarga)).append("\n");
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

