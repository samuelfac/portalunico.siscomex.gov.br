package br.gov.siscomex.portalunico.talpco.model;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "ConsultaDetalhadaCampoValor", propOrder =
    { "dataInclusao", "valor"
})

@XmlRootElement(name="ConsultaDetalhadaCampoValor")
/**
  * Valor de um campo de um LPCO, exibido na consulta detalhada de LPCOs
 **/
@ApiModel(description="Valor de um campo de um LPCO, exibido na consulta detalhada de LPCOs")
public class ConsultaDetalhadaCampoValor  {
  
  @XmlElement(name="dataInclusao", required = true)
  @ApiModelProperty(example = "2019-09-02T10:04:38.123Z", required = true, value = "Data de inclusão do valor<br>Formato: dd-MM-yyyy'T'HH:mm:ss:SSSZ")
 /**
   * Data de inclusão do valor<br>Formato: dd-MM-yyyy'T'HH:mm:ss:SSSZ
  **/
  private String dataInclusao = null;

  @XmlElement(name="valor", required = true)
  @ApiModelProperty(example = "01", required = true, value = "Valor do campo.<br>Tamanho mínimo: 1<br>Tamanho máximo: 10000")
 /**
   * Valor do campo.<br>Tamanho mínimo: 1<br>Tamanho máximo: 10000
  **/
  private String valor = null;
 /**
   * Data de inclusão do valor&lt;br&gt;Formato: dd-MM-yyyy&#39;T&#39;HH:mm:ss:SSSZ
   * @return dataInclusao
  **/
  @JsonProperty("dataInclusao")
  @NotNull
  public String getDataInclusao() {
    return dataInclusao;
  }

  public void setDataInclusao(String dataInclusao) {
    this.dataInclusao = dataInclusao;
  }

  public ConsultaDetalhadaCampoValor dataInclusao(String dataInclusao) {
    this.dataInclusao = dataInclusao;
    return this;
  }

 /**
   * Valor do campo.&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 10000
   * @return valor
  **/
  @JsonProperty("valor")
  @NotNull
  public String getValor() {
    return valor;
  }

  public void setValor(String valor) {
    this.valor = valor;
  }

  public ConsultaDetalhadaCampoValor valor(String valor) {
    this.valor = valor;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsultaDetalhadaCampoValor {\n");
    
    sb.append("    dataInclusao: ").append(toIndentedString(dataInclusao)).append("\n");
    sb.append("    valor: ").append(toIndentedString(valor)).append("\n");
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

