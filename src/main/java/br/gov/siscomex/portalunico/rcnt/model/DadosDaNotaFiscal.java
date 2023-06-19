package br.gov.siscomex.portalunico.rcnt.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "DadosDaNotaFiscal", propOrder =
    { "chaveNfe", "idElemento"
})

@XmlRootElement(name="DadosDaNotaFiscal")
public class DadosDaNotaFiscal  {
  
  @XmlElement(name="chaveNfe")
  @ApiModelProperty(example = "35200200000000002720550900024285641000000001", value = "Chave da NF-e que ampara a carga.<br/>Tamanho: 100")
 /**
   * Chave da NF-e que ampara a carga.<br/>Tamanho: 100
  **/
  private String chaveNfe = null;

  @XmlElement(name="idElemento", required = true)
  @ApiModelProperty(required = true, value = "Identificação de cada elemento da lista. Este atributo é obrigatório e deve ser único dentro da lista correspondente.<br/>Tamanho: 40")
 /**
   * Identificação de cada elemento da lista. Este atributo é obrigatório e deve ser único dentro da lista correspondente.<br/>Tamanho: 40
  **/
  private String idElemento = null;
 /**
   * Chave da NF-e que ampara a carga.&lt;br/&gt;Tamanho: 100
   * @return chaveNfe
  **/
  @JsonProperty("chaveNfe")
  public String getChaveNfe() {
    return chaveNfe;
  }

  public void setChaveNfe(String chaveNfe) {
    this.chaveNfe = chaveNfe;
  }

  public DadosDaNotaFiscal chaveNfe(String chaveNfe) {
    this.chaveNfe = chaveNfe;
    return this;
  }

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

  public DadosDaNotaFiscal idElemento(String idElemento) {
    this.idElemento = idElemento;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DadosDaNotaFiscal {\n");
    
    sb.append("    chaveNfe: ").append(toIndentedString(chaveNfe)).append("\n");
    sb.append("    idElemento: ").append(toIndentedString(idElemento)).append("\n");
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

