package br.gov.siscomex.portalunico.ccta.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "RespostaRecebimento", propOrder =
    { "message", "list"
})

@XmlRootElement(name="RespostaRecebimento")
/**
  * Resposta para a consulta da situação atual do processamento do arquivo enviado
 **/
@ApiModel(description="Resposta para a consulta da situação atual do processamento do arquivo enviado")
public class RespostaRecebimento  {
  
  @XmlElement(name="message")
  @ApiModelProperty(example = "A consulta efetuada retornou mais de 500 registros. Refine sua pesquisa.", value = "Mensagem de retorno quando a pesquisa retornar mais registros que o máximo permitido")
 /**
   * Mensagem de retorno quando a pesquisa retornar mais registros que o máximo permitido
  **/
  private String message = null;

  @XmlElement(name="list")
  @ApiModelProperty(value = "Lista com os resultados")
  @Valid
 /**
   * Lista com os resultados
  **/
  private List<Recebimento> list = null;
 /**
   * Mensagem de retorno quando a pesquisa retornar mais registros que o máximo permitido
   * @return message
  **/
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public RespostaRecebimento message(String message) {
    this.message = message;
    return this;
  }

 /**
   * Lista com os resultados
   * @return list
  **/
  @JsonProperty("list")
  public List<Recebimento> getList() {
    return list;
  }

  public void setList(List<Recebimento> list) {
    this.list = list;
  }

  public RespostaRecebimento list(List<Recebimento> list) {
    this.list = list;
    return this;
  }

  public RespostaRecebimento addListItem(Recebimento listItem) {
    this.list.add(listItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RespostaRecebimento {\n");
    
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    list: ").append(toIndentedString(list)).append("\n");
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

