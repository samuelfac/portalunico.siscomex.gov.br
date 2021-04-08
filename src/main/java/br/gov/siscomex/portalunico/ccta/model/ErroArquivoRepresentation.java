package br.gov.siscomex.portalunico.ccta.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "ErroArquivoRepresentation", propOrder =
    { "code", "description", "detail"
})

@XmlRootElement(name="ErroArquivoRepresentation")
/**
  * Erro encontrado na consulta da situação atual do processamento do arquivo enviado
 **/
@ApiModel(description="Erro encontrado na consulta da situação atual do processamento do arquivo enviado")
public class ErroArquivoRepresentation  {
  
  @XmlElement(name="code")
  @ApiModelProperty(example = "ER-01", value = "Código identificador do tipo de erro encontrado")
 /**
   * Código identificador do tipo de erro encontrado
  **/
  private String code = null;

  @XmlElement(name="description")
  @ApiModelProperty(example = "Erro tipo 01 no processamento do arquivo.", value = "Descrição do erro encontrado")
 /**
   * Descrição do erro encontrado
  **/
  private String description = null;

  @XmlElement(name="detail")
  @ApiModelProperty(example = "Detalhes sobre o erro tipo 01 encontrado.", value = "Detalhe sobre o erro encontrado. Quando o erro for referente a um dos campos do arquivo XML, o detalhe será o caminho completo da tag XML do campo onde foi encontrado o erro")
 /**
   * Detalhe sobre o erro encontrado. Quando o erro for referente a um dos campos do arquivo XML, o detalhe será o caminho completo da tag XML do campo onde foi encontrado o erro
  **/
  private String detail = null;
 /**
   * Código identificador do tipo de erro encontrado
   * @return code
  **/
  @JsonProperty("code")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public ErroArquivoRepresentation code(String code) {
    this.code = code;
    return this;
  }

 /**
   * Descrição do erro encontrado
   * @return description
  **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ErroArquivoRepresentation description(String description) {
    this.description = description;
    return this;
  }

 /**
   * Detalhe sobre o erro encontrado. Quando o erro for referente a um dos campos do arquivo XML, o detalhe será o caminho completo da tag XML do campo onde foi encontrado o erro
   * @return detail
  **/
  @JsonProperty("detail")
  public String getDetail() {
    return detail;
  }

  public void setDetail(String detail) {
    this.detail = detail;
  }

  public ErroArquivoRepresentation detail(String detail) {
    this.detail = detail;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErroArquivoRepresentation {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
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

