package br.gov.siscomex.portalunico.talpco.model;

import java.math.BigDecimal;

import javax.validation.Valid;
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
 @XmlType(name = "Cotas", propOrder =
    { "moedaValorCondicaoVenda", "moedaValorFinanciado", "moedaVmle", "saldoPesoLiquido", "saldoQuantidadeComercial", "saldoQuantidadeEstatistica", "saldoVMLE", "saldoValorCondicaoVenda", "saldoValorFinanciado", "titulo"
})

@XmlRootElement(name="Cotas")
/**
  * Informações sobre as cotas de um LPCO
 **/
@ApiModel(description="Informações sobre as cotas de um LPCO")
public class Cotas  {
  
  @XmlElement(name="moedaValorCondicaoVenda")
  @ApiModelProperty(example = "USD", value = "Símbolo da moeda associada ao saldo do campo Valor na Condição de Venda<br>Tamanho mínimo: 3<br>Tamanho máximo: 3")
 /**
   * Símbolo da moeda associada ao saldo do campo Valor na Condição de Venda<br>Tamanho mínimo: 3<br>Tamanho máximo: 3
  **/
  private String moedaValorCondicaoVenda = null;

  @XmlElement(name="moedaValorFinanciado")
  @ApiModelProperty(example = "USD", value = "Símbolo da moeda associada ao saldo do campo Valor Financiado<br>Tamanho mínimo: 3<br>Tamanho máximo: 3")
 /**
   * Símbolo da moeda associada ao saldo do campo Valor Financiado<br>Tamanho mínimo: 3<br>Tamanho máximo: 3
  **/
  private String moedaValorFinanciado = null;

  @XmlElement(name="moedaVmle")
  @ApiModelProperty(example = "USD", value = "Símbolo da moeda associada ao saldo do campo VMLE<br>Tamanho mínimo: 3<br>Tamanho máximo: 3")
 /**
   * Símbolo da moeda associada ao saldo do campo VMLE<br>Tamanho mínimo: 3<br>Tamanho máximo: 3
  **/
  private String moedaVmle = null;

  @XmlElement(name="saldoPesoLiquido")
  @ApiModelProperty(example = "123.12345", value = "Saldo disponível para o campo PESO_LIQUIDO, se houver<br>Tamanho: 14,5 + <br>Formato: Decimal, com até 6 casas decimais separadas por ponto")
  @Valid
 /**
   * Saldo disponível para o campo PESO_LIQUIDO, se houver<br>Tamanho: 14,5 + <br>Formato: Decimal, com até 6 casas decimais separadas por ponto
  **/
  private BigDecimal saldoPesoLiquido = null;

  @XmlElement(name="saldoQuantidadeComercial")
  @ApiModelProperty(example = "123.12345", value = "Saldo disponível para o campo QTDE_COMERCIALIZADA, se houver<br>Tamanho: 14,5 + <br>Formato: Decimal, com até 6 casas decimais separadas por ponto")
  @Valid
 /**
   * Saldo disponível para o campo QTDE_COMERCIALIZADA, se houver<br>Tamanho: 14,5 + <br>Formato: Decimal, com até 6 casas decimais separadas por ponto
  **/
  private BigDecimal saldoQuantidadeComercial = null;

  @XmlElement(name="saldoQuantidadeEstatistica")
  @ApiModelProperty(example = "123.12345", value = "Saldo disponível para o campo QTDE_ESTATISTICA, se houver<br>Tamanho: 14,5 + <br>Formato: Decimal, com até 6 casas decimais separadas por ponto")
  @Valid
 /**
   * Saldo disponível para o campo QTDE_ESTATISTICA, se houver<br>Tamanho: 14,5 + <br>Formato: Decimal, com até 6 casas decimais separadas por ponto
  **/
  private BigDecimal saldoQuantidadeEstatistica = null;

  @XmlElement(name="saldoVMLE")
  @ApiModelProperty(example = "123.12", value = "Saldo disponível para o campo VMLE, se houver<br>Tamanho: 15,2 + <br>Formato: Decimal, com até 2 casas decimais separadas por ponto")
  @Valid
 /**
   * Saldo disponível para o campo VMLE, se houver<br>Tamanho: 15,2 + <br>Formato: Decimal, com até 2 casas decimais separadas por ponto
  **/
  private BigDecimal saldoVMLE = null;

  @XmlElement(name="saldoValorCondicaoVenda")
  @ApiModelProperty(example = "123.12", value = "Saldo disponível para o campo VALOR_CONDICAO_VENDA, se houver<br>Tamanho: 15,2 + <br>Formato: Decimal, com até 2 casas decimais separadas por ponto")
  @Valid
 /**
   * Saldo disponível para o campo VALOR_CONDICAO_VENDA, se houver<br>Tamanho: 15,2 + <br>Formato: Decimal, com até 2 casas decimais separadas por ponto
  **/
  private BigDecimal saldoValorCondicaoVenda = null;

  @XmlElement(name="saldoValorFinanciado")
  @ApiModelProperty(example = "123.12", value = "Saldo disponível para o campo VALOR_FINANCIADO, se houver<br>Tamanho: 15,2 + <br>Formato: Decimal, com até 2 casas decimais separadas por ponto")
  @Valid
 /**
   * Saldo disponível para o campo VALOR_FINANCIADO, se houver<br>Tamanho: 15,2 + <br>Formato: Decimal, com até 2 casas decimais separadas por ponto
  **/
  private BigDecimal saldoValorFinanciado = null;

  @XmlElement(name="titulo", required = true)
  @ApiModelProperty(example = "Item 1 - NCM 11223344", required = true, value = "Título da seção do LPCO ao qual os saldos estão vinculados<br>Formato: será 'LPCO' para campos de saldo na seção Dados Gerais, ou 'Item N - NCM NNNNNNNN' para campos vinculados a uma mercadoria do LPCO")
 /**
   * Título da seção do LPCO ao qual os saldos estão vinculados<br>Formato: será 'LPCO' para campos de saldo na seção Dados Gerais, ou 'Item N - NCM NNNNNNNN' para campos vinculados a uma mercadoria do LPCO
  **/
  private String titulo = null;
 /**
   * Símbolo da moeda associada ao saldo do campo Valor na Condição de Venda&lt;br&gt;Tamanho mínimo: 3&lt;br&gt;Tamanho máximo: 3
   * @return moedaValorCondicaoVenda
  **/
  @JsonProperty("moedaValorCondicaoVenda")
  public String getMoedaValorCondicaoVenda() {
    return moedaValorCondicaoVenda;
  }

  public void setMoedaValorCondicaoVenda(String moedaValorCondicaoVenda) {
    this.moedaValorCondicaoVenda = moedaValorCondicaoVenda;
  }

  public Cotas moedaValorCondicaoVenda(String moedaValorCondicaoVenda) {
    this.moedaValorCondicaoVenda = moedaValorCondicaoVenda;
    return this;
  }

 /**
   * Símbolo da moeda associada ao saldo do campo Valor Financiado&lt;br&gt;Tamanho mínimo: 3&lt;br&gt;Tamanho máximo: 3
   * @return moedaValorFinanciado
  **/
  @JsonProperty("moedaValorFinanciado")
  public String getMoedaValorFinanciado() {
    return moedaValorFinanciado;
  }

  public void setMoedaValorFinanciado(String moedaValorFinanciado) {
    this.moedaValorFinanciado = moedaValorFinanciado;
  }

  public Cotas moedaValorFinanciado(String moedaValorFinanciado) {
    this.moedaValorFinanciado = moedaValorFinanciado;
    return this;
  }

 /**
   * Símbolo da moeda associada ao saldo do campo VMLE&lt;br&gt;Tamanho mínimo: 3&lt;br&gt;Tamanho máximo: 3
   * @return moedaVmle
  **/
  @JsonProperty("moedaVmle")
  public String getMoedaVmle() {
    return moedaVmle;
  }

  public void setMoedaVmle(String moedaVmle) {
    this.moedaVmle = moedaVmle;
  }

  public Cotas moedaVmle(String moedaVmle) {
    this.moedaVmle = moedaVmle;
    return this;
  }

 /**
   * Saldo disponível para o campo PESO_LIQUIDO, se houver&lt;br&gt;Tamanho: 14,5 + &lt;br&gt;Formato: Decimal, com até 6 casas decimais separadas por ponto
   * @return saldoPesoLiquido
  **/
  @JsonProperty("saldoPesoLiquido")
  public BigDecimal getSaldoPesoLiquido() {
    return saldoPesoLiquido;
  }

  public void setSaldoPesoLiquido(BigDecimal saldoPesoLiquido) {
    this.saldoPesoLiquido = saldoPesoLiquido;
  }

  public Cotas saldoPesoLiquido(BigDecimal saldoPesoLiquido) {
    this.saldoPesoLiquido = saldoPesoLiquido;
    return this;
  }

 /**
   * Saldo disponível para o campo QTDE_COMERCIALIZADA, se houver&lt;br&gt;Tamanho: 14,5 + &lt;br&gt;Formato: Decimal, com até 6 casas decimais separadas por ponto
   * @return saldoQuantidadeComercial
  **/
  @JsonProperty("saldoQuantidadeComercial")
  public BigDecimal getSaldoQuantidadeComercial() {
    return saldoQuantidadeComercial;
  }

  public void setSaldoQuantidadeComercial(BigDecimal saldoQuantidadeComercial) {
    this.saldoQuantidadeComercial = saldoQuantidadeComercial;
  }

  public Cotas saldoQuantidadeComercial(BigDecimal saldoQuantidadeComercial) {
    this.saldoQuantidadeComercial = saldoQuantidadeComercial;
    return this;
  }

 /**
   * Saldo disponível para o campo QTDE_ESTATISTICA, se houver&lt;br&gt;Tamanho: 14,5 + &lt;br&gt;Formato: Decimal, com até 6 casas decimais separadas por ponto
   * @return saldoQuantidadeEstatistica
  **/
  @JsonProperty("saldoQuantidadeEstatistica")
  public BigDecimal getSaldoQuantidadeEstatistica() {
    return saldoQuantidadeEstatistica;
  }

  public void setSaldoQuantidadeEstatistica(BigDecimal saldoQuantidadeEstatistica) {
    this.saldoQuantidadeEstatistica = saldoQuantidadeEstatistica;
  }

  public Cotas saldoQuantidadeEstatistica(BigDecimal saldoQuantidadeEstatistica) {
    this.saldoQuantidadeEstatistica = saldoQuantidadeEstatistica;
    return this;
  }

 /**
   * Saldo disponível para o campo VMLE, se houver&lt;br&gt;Tamanho: 15,2 + &lt;br&gt;Formato: Decimal, com até 2 casas decimais separadas por ponto
   * @return saldoVMLE
  **/
  @JsonProperty("saldoVMLE")
  public BigDecimal getSaldoVMLE() {
    return saldoVMLE;
  }

  public void setSaldoVMLE(BigDecimal saldoVMLE) {
    this.saldoVMLE = saldoVMLE;
  }

  public Cotas saldoVMLE(BigDecimal saldoVMLE) {
    this.saldoVMLE = saldoVMLE;
    return this;
  }

 /**
   * Saldo disponível para o campo VALOR_CONDICAO_VENDA, se houver&lt;br&gt;Tamanho: 15,2 + &lt;br&gt;Formato: Decimal, com até 2 casas decimais separadas por ponto
   * @return saldoValorCondicaoVenda
  **/
  @JsonProperty("saldoValorCondicaoVenda")
  public BigDecimal getSaldoValorCondicaoVenda() {
    return saldoValorCondicaoVenda;
  }

  public void setSaldoValorCondicaoVenda(BigDecimal saldoValorCondicaoVenda) {
    this.saldoValorCondicaoVenda = saldoValorCondicaoVenda;
  }

  public Cotas saldoValorCondicaoVenda(BigDecimal saldoValorCondicaoVenda) {
    this.saldoValorCondicaoVenda = saldoValorCondicaoVenda;
    return this;
  }

 /**
   * Saldo disponível para o campo VALOR_FINANCIADO, se houver&lt;br&gt;Tamanho: 15,2 + &lt;br&gt;Formato: Decimal, com até 2 casas decimais separadas por ponto
   * @return saldoValorFinanciado
  **/
  @JsonProperty("saldoValorFinanciado")
  public BigDecimal getSaldoValorFinanciado() {
    return saldoValorFinanciado;
  }

  public void setSaldoValorFinanciado(BigDecimal saldoValorFinanciado) {
    this.saldoValorFinanciado = saldoValorFinanciado;
  }

  public Cotas saldoValorFinanciado(BigDecimal saldoValorFinanciado) {
    this.saldoValorFinanciado = saldoValorFinanciado;
    return this;
  }

 /**
   * Título da seção do LPCO ao qual os saldos estão vinculados&lt;br&gt;Formato: será &#39;LPCO&#39; para campos de saldo na seção Dados Gerais, ou &#39;Item N - NCM NNNNNNNN&#39; para campos vinculados a uma mercadoria do LPCO
   * @return titulo
  **/
  @JsonProperty("titulo")
  @NotNull
  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public Cotas titulo(String titulo) {
    this.titulo = titulo;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cotas {\n");
    
    sb.append("    moedaValorCondicaoVenda: ").append(toIndentedString(moedaValorCondicaoVenda)).append("\n");
    sb.append("    moedaValorFinanciado: ").append(toIndentedString(moedaValorFinanciado)).append("\n");
    sb.append("    moedaVmle: ").append(toIndentedString(moedaVmle)).append("\n");
    sb.append("    saldoPesoLiquido: ").append(toIndentedString(saldoPesoLiquido)).append("\n");
    sb.append("    saldoQuantidadeComercial: ").append(toIndentedString(saldoQuantidadeComercial)).append("\n");
    sb.append("    saldoQuantidadeEstatistica: ").append(toIndentedString(saldoQuantidadeEstatistica)).append("\n");
    sb.append("    saldoVMLE: ").append(toIndentedString(saldoVMLE)).append("\n");
    sb.append("    saldoValorCondicaoVenda: ").append(toIndentedString(saldoValorCondicaoVenda)).append("\n");
    sb.append("    saldoValorFinanciado: ").append(toIndentedString(saldoValorFinanciado)).append("\n");
    sb.append("    titulo: ").append(toIndentedString(titulo)).append("\n");
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

