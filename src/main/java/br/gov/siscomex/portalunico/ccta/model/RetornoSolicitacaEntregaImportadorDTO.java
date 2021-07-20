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
 @XmlType(name = "RetornoSolicitacaEntregaImportadorDTO", propOrder =
    { "numeroProtocolo"
})

@XmlRootElement(name="RetornoSolicitacaEntregaImportadorDTO")
/**
  * Retorno da solicitação de entrega da carga.
 **/
@ApiModel(description="Retorno da solicitação de entrega da carga.")
public class RetornoSolicitacaEntregaImportadorDTO  {
  
  @XmlElement(name="numeroProtocolo")
  @ApiModelProperty(example = "e63d5061-b154-4a6a-9066-8f16a2f31818", value = "Número do protocolo referente a entrega da carga. <br/>O número do protocolo deverá ser utilizado no serviço de consulta da situação do processamento da entrega da carga para recuperar o resultado da solicitação.<br/>Tamanho: 36")
 /**
   * Número do protocolo referente a entrega da carga. <br/>O número do protocolo deverá ser utilizado no serviço de consulta da situação do processamento da entrega da carga para recuperar o resultado da solicitação.<br/>Tamanho: 36
  **/
  private String numeroProtocolo = null;
 /**
   * Número do protocolo referente a entrega da carga. &lt;br/&gt;O número do protocolo deverá ser utilizado no serviço de consulta da situação do processamento da entrega da carga para recuperar o resultado da solicitação.&lt;br/&gt;Tamanho: 36
   * @return numeroProtocolo
  **/
  @JsonProperty("numeroProtocolo")
  public String getNumeroProtocolo() {
    return numeroProtocolo;
  }

  public void setNumeroProtocolo(String numeroProtocolo) {
    this.numeroProtocolo = numeroProtocolo;
  }

  public RetornoSolicitacaEntregaImportadorDTO numeroProtocolo(String numeroProtocolo) {
    this.numeroProtocolo = numeroProtocolo;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetornoSolicitacaEntregaImportadorDTO {\n");
    
    sb.append("    numeroProtocolo: ").append(toIndentedString(numeroProtocolo)).append("\n");
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

