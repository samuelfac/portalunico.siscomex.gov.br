package br.gov.siscomex.portalunico.rcnt.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "DadosDoTelefone", propOrder =
    { "idElemento", "numeroTelefone"
})

@XmlRootElement(name="DadosDoTelefone")
public class DadosDoTelefone  {
  
  @XmlElement(name="idElemento", required = true)
  @ApiModelProperty(required = true, value = "Identificação de cada elemento da lista. Este atributo é obrigatório e deve ser único dentro da lista correspondente.<br/>Tamanho: 40")
 /**
   * Identificação de cada elemento da lista. Este atributo é obrigatório e deve ser único dentro da lista correspondente.<br/>Tamanho: 40
  **/
  private String idElemento = null;

  @XmlElement(name="numeroTelefone")
  @ApiModelProperty(example = "+55 (21)9999-9999", value = "Número do telefone.<br/>Tamanho: 100")
 /**
   * Número do telefone.<br/>Tamanho: 100
  **/
  private String numeroTelefone = null;
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

  public DadosDoTelefone idElemento(String idElemento) {
    this.idElemento = idElemento;
    return this;
  }

 /**
   * Número do telefone.&lt;br/&gt;Tamanho: 100
   * @return numeroTelefone
  **/
  @JsonProperty("numeroTelefone")
  public String getNumeroTelefone() {
    return numeroTelefone;
  }

  public void setNumeroTelefone(String numeroTelefone) {
    this.numeroTelefone = numeroTelefone;
  }

  public DadosDoTelefone numeroTelefone(String numeroTelefone) {
    this.numeroTelefone = numeroTelefone;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DadosDoTelefone {\n");
    
    sb.append("    idElemento: ").append(toIndentedString(idElemento)).append("\n");
    sb.append("    numeroTelefone: ").append(toIndentedString(numeroTelefone)).append("\n");
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

