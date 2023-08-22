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
 @XmlType(name = "DadosSemirreboquePosioVeculoPtio", propOrder =
    { "idElemento", "placa", "vazio"
})

@XmlRootElement(name="DadosSemirreboquePosioVeculoPtio")
public class DadosSemirreboquePosioVeculoPtio  {
  
  @XmlElement(name="idElemento", required = true)
  @ApiModelProperty(required = true, value = "Identificação de cada elemento da lista. Este atributo é obrigatório e deve ser único dentro da lista correspondente.<br/>Tamanho: 40")
 /**
   * Identificação de cada elemento da lista. Este atributo é obrigatório e deve ser único dentro da lista correspondente.<br/>Tamanho: 40
  **/
  private String idElemento = null;

  @XmlElement(name="placa")
  @ApiModelProperty(value = "Placa<br/>Tamanho: 50")
 /**
   * Placa<br/>Tamanho: 50
  **/
  private String placa = null;

  @XmlElement(name="vazio")
  @ApiModelProperty(example = "false", value = "Vazio<br/>Domínio:<br/>true - Sim<br/>false - Não")
 /**
   * Vazio<br/>Domínio:<br/>true - Sim<br/>false - Não
  **/
  private Boolean vazio = null;
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

  public DadosSemirreboquePosioVeculoPtio idElemento(String idElemento) {
    this.idElemento = idElemento;
    return this;
  }

 /**
   * Placa&lt;br/&gt;Tamanho: 50
   * @return placa
  **/
  @JsonProperty("placa")
  public String getPlaca() {
    return placa;
  }

  public void setPlaca(String placa) {
    this.placa = placa;
  }

  public DadosSemirreboquePosioVeculoPtio placa(String placa) {
    this.placa = placa;
    return this;
  }

 /**
   * Vazio&lt;br/&gt;Domínio:&lt;br/&gt;true - Sim&lt;br/&gt;false - Não
   * @return vazio
  **/
  @JsonProperty("vazio")
  public Boolean isVazio() {
    return vazio;
  }

  public void setVazio(Boolean vazio) {
    this.vazio = vazio;
  }

  public DadosSemirreboquePosioVeculoPtio vazio(Boolean vazio) {
    this.vazio = vazio;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DadosSemirreboquePosioVeculoPtio {\n");
    
    sb.append("    idElemento: ").append(toIndentedString(idElemento)).append("\n");
    sb.append("    placa: ").append(toIndentedString(placa)).append("\n");
    sb.append("    vazio: ").append(toIndentedString(vazio)).append("\n");
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

