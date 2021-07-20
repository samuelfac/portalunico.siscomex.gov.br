package br.gov.siscomex.portalunico.duimp_api.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "JurosPagamentoCover", propOrder =
    { "codigoReceita", "valor", "dataPagamentoJuros", "bancoJuros", "agenciaJuros", "contaJuros"
})

@XmlRootElement(name="JurosPagamentoCover")
/**
  * Informações sobre os Juros.
 **/
@ApiModel(description="Informações sobre os Juros.")
public class JurosPagamentoCover  {
  
  @XmlElement(name="codigoReceita")
  @ApiModelProperty(example = "5602", value = "Código da receita.<br>Tamanho: 4<br>Formato: 'NNNN'")
 /**
   * Código da receita.<br>Tamanho: 4<br>Formato: 'NNNN'
  **/
  private String codigoReceita = null;

  @XmlElement(name="valor")
  @ApiModelProperty(example = "100.1", value = "Valor de juros.<br>Tamanho: 17,2<br>Formato: Decimal, com até 2 casas decimais separadas por ponto.")
 /**
   * Valor de juros.<br>Tamanho: 17,2<br>Formato: Decimal, com até 2 casas decimais separadas por ponto.
  **/
  private Double valor = null;

  @XmlElement(name="dataPagamentoJuros")
  @ApiModelProperty(example = "2021-05-25T15:53:18-0300", value = "Data de pagamento de juros.<br>Formato: 'yyyy-MM-dd'T'HH:mm:ssZ'")
 /**
   * Data de pagamento de juros.<br>Formato: 'yyyy-MM-dd'T'HH:mm:ssZ'
  **/
  private String dataPagamentoJuros = null;

  @XmlElement(name="bancoJuros")
  @ApiModelProperty(example = "001", value = "Código do banco.<br>Valor mínimo: 1<br>Valor máximo: 999")
 /**
   * Código do banco.<br>Valor mínimo: 1<br>Valor máximo: 999
  **/
  private String bancoJuros = null;

  @XmlElement(name="agenciaJuros")
  @ApiModelProperty(example = "3521", value = "Número da agência<br>Tamanho mínimo: 1<br>Tamanho máximo: 4")
 /**
   * Número da agência<br>Tamanho mínimo: 1<br>Tamanho máximo: 4
  **/
  private String agenciaJuros = null;

  @XmlElement(name="contaJuros")
  @ApiModelProperty(example = "707070", value = "Número da conta<br>Tamanho mínimo: 1<br>Tamanho máximo: 10")
 /**
   * Número da conta<br>Tamanho mínimo: 1<br>Tamanho máximo: 10
  **/
  private String contaJuros = null;
 /**
   * Código da receita.&lt;br&gt;Tamanho: 4&lt;br&gt;Formato: &#39;NNNN&#39;
   * @return codigoReceita
  **/
  @JsonProperty("codigoReceita")
  public String getCodigoReceita() {
    return codigoReceita;
  }

  public void setCodigoReceita(String codigoReceita) {
    this.codigoReceita = codigoReceita;
  }

  public JurosPagamentoCover codigoReceita(String codigoReceita) {
    this.codigoReceita = codigoReceita;
    return this;
  }

 /**
   * Valor de juros.&lt;br&gt;Tamanho: 17,2&lt;br&gt;Formato: Decimal, com até 2 casas decimais separadas por ponto.
   * @return valor
  **/
  @JsonProperty("valor")
  public Double getValor() {
    return valor;
  }

  public void setValor(Double valor) {
    this.valor = valor;
  }

  public JurosPagamentoCover valor(Double valor) {
    this.valor = valor;
    return this;
  }

 /**
   * Data de pagamento de juros.&lt;br&gt;Formato: &#39;yyyy-MM-dd&#39;T&#39;HH:mm:ssZ&#39;
   * @return dataPagamentoJuros
  **/
  @JsonProperty("dataPagamentoJuros")
  public String getDataPagamentoJuros() {
    return dataPagamentoJuros;
  }

  public void setDataPagamentoJuros(String dataPagamentoJuros) {
    this.dataPagamentoJuros = dataPagamentoJuros;
  }

  public JurosPagamentoCover dataPagamentoJuros(String dataPagamentoJuros) {
    this.dataPagamentoJuros = dataPagamentoJuros;
    return this;
  }

 /**
   * Código do banco.&lt;br&gt;Valor mínimo: 1&lt;br&gt;Valor máximo: 999
   * @return bancoJuros
  **/
  @JsonProperty("bancoJuros")
  public String getBancoJuros() {
    return bancoJuros;
  }

  public void setBancoJuros(String bancoJuros) {
    this.bancoJuros = bancoJuros;
  }

  public JurosPagamentoCover bancoJuros(String bancoJuros) {
    this.bancoJuros = bancoJuros;
    return this;
  }

 /**
   * Número da agência&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 4
   * @return agenciaJuros
  **/
  @JsonProperty("agenciaJuros")
  public String getAgenciaJuros() {
    return agenciaJuros;
  }

  public void setAgenciaJuros(String agenciaJuros) {
    this.agenciaJuros = agenciaJuros;
  }

  public JurosPagamentoCover agenciaJuros(String agenciaJuros) {
    this.agenciaJuros = agenciaJuros;
    return this;
  }

 /**
   * Número da conta&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 10
   * @return contaJuros
  **/
  @JsonProperty("contaJuros")
  public String getContaJuros() {
    return contaJuros;
  }

  public void setContaJuros(String contaJuros) {
    this.contaJuros = contaJuros;
  }

  public JurosPagamentoCover contaJuros(String contaJuros) {
    this.contaJuros = contaJuros;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JurosPagamentoCover {\n");
    
    sb.append("    codigoReceita: ").append(toIndentedString(codigoReceita)).append("\n");
    sb.append("    valor: ").append(toIndentedString(valor)).append("\n");
    sb.append("    dataPagamentoJuros: ").append(toIndentedString(dataPagamentoJuros)).append("\n");
    sb.append("    bancoJuros: ").append(toIndentedString(bancoJuros)).append("\n");
    sb.append("    agenciaJuros: ").append(toIndentedString(agenciaJuros)).append("\n");
    sb.append("    contaJuros: ").append(toIndentedString(contaJuros)).append("\n");
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

