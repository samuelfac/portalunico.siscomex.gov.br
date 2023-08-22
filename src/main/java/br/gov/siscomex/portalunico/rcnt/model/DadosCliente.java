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
 @XmlType(name = "DadosCliente", propOrder =
    { "cnpjCliente", "idElemento", "nomeCliente"
})

@XmlRootElement(name="DadosCliente")
public class DadosCliente  {
  
  @XmlElement(name="cnpjCliente")
  @ApiModelProperty(example = "44444444444444", value = "CNPJ do cliente do armazenamento.<br/>Cliente que contratou o serviço de armazenagem do recinto para o qual será emitida a fatura.<br/>Tamanho: 14<br/>Formato: 'NNNNNNNNNNNNNN'")
 /**
   * CNPJ do cliente do armazenamento.<br/>Cliente que contratou o serviço de armazenagem do recinto para o qual será emitida a fatura.<br/>Tamanho: 14<br/>Formato: 'NNNNNNNNNNNNNN'
  **/
  private String cnpjCliente = null;

  @XmlElement(name="idElemento", required = true)
  @ApiModelProperty(required = true, value = "Identificação de cada elemento da lista. Este atributo é obrigatório e deve ser único dentro da lista correspondente.<br/>Tamanho: 40")
 /**
   * Identificação de cada elemento da lista. Este atributo é obrigatório e deve ser único dentro da lista correspondente.<br/>Tamanho: 40
  **/
  private String idElemento = null;

  @XmlElement(name="nomeCliente")
  @ApiModelProperty(value = "Nome do cliente do armazenamento. <br/>Cliente que contratou o serviço de armazenagem do recinto para o qual será emitida a fatura.<br/>Tamanho: 100")
 /**
   * Nome do cliente do armazenamento. <br/>Cliente que contratou o serviço de armazenagem do recinto para o qual será emitida a fatura.<br/>Tamanho: 100
  **/
  private String nomeCliente = null;
 /**
   * CNPJ do cliente do armazenamento.&lt;br/&gt;Cliente que contratou o serviço de armazenagem do recinto para o qual será emitida a fatura.&lt;br/&gt;Tamanho: 14&lt;br/&gt;Formato: &#39;NNNNNNNNNNNNNN&#39;
   * @return cnpjCliente
  **/
  @JsonProperty("cnpjCliente")
  public String getCnpjCliente() {
    return cnpjCliente;
  }

  public void setCnpjCliente(String cnpjCliente) {
    this.cnpjCliente = cnpjCliente;
  }

  public DadosCliente cnpjCliente(String cnpjCliente) {
    this.cnpjCliente = cnpjCliente;
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

  public DadosCliente idElemento(String idElemento) {
    this.idElemento = idElemento;
    return this;
  }

 /**
   * Nome do cliente do armazenamento. &lt;br/&gt;Cliente que contratou o serviço de armazenagem do recinto para o qual será emitida a fatura.&lt;br/&gt;Tamanho: 100
   * @return nomeCliente
  **/
  @JsonProperty("nomeCliente")
  public String getNomeCliente() {
    return nomeCliente;
  }

  public void setNomeCliente(String nomeCliente) {
    this.nomeCliente = nomeCliente;
  }

  public DadosCliente nomeCliente(String nomeCliente) {
    this.nomeCliente = nomeCliente;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DadosCliente {\n");
    
    sb.append("    cnpjCliente: ").append(toIndentedString(cnpjCliente)).append("\n");
    sb.append("    idElemento: ").append(toIndentedString(idElemento)).append("\n");
    sb.append("    nomeCliente: ").append(toIndentedString(nomeCliente)).append("\n");
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

