package br.gov.siscomex.portalunico.talpco.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "MensagemLpcoRequest", propOrder =
    { "mensagem"
})

@XmlRootElement(name="MensagemLpcoRequest")
/**
  * Mensagem a ser incluída no histórico do LPCO
 **/
@ApiModel(description="Mensagem a ser incluída no histórico do LPCO")
public class MensagemLpcoRequest  {
  
  @XmlElement(name="mensagem")
  @ApiModelProperty(value = "")
  private String mensagem = null;
 /**
   * Get mensagem
   * @return mensagem
  **/
  @JsonProperty("mensagem")
  public String getMensagem() {
    return mensagem;
  }

  public void setMensagem(String mensagem) {
    this.mensagem = mensagem;
  }

  public MensagemLpcoRequest mensagem(String mensagem) {
    this.mensagem = mensagem;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MensagemLpcoRequest {\n");
    
    sb.append("    mensagem: ").append(toIndentedString(mensagem)).append("\n");
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

