package br.gov.siscomex.portalunico.cct_ext.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.*;
import java.math.BigDecimal;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "Frete", propOrder =
    { "codigoMoedaFrete", "formaPagamento", "valor"
})

@XmlRootElement(name="Frete")
/**
  * Dados do frete
 **/
@ApiModel(description="Dados do frete")
public class Frete  {
  
  @XmlElement(name="codigoMoedaFrete", required = true)
  @ApiModelProperty(example = "USD", required = true, value = "Código da moeda do Frete<br>Domínio: Tabela Tipo de Moeda")
 /**
   * Código da moeda do Frete<br>Domínio: Tabela Tipo de Moeda
  **/
  private String codigoMoedaFrete = null;

  @XmlElement(name="formaPagamento", required = true)
  @ApiModelProperty(example = "1", required = true, value = "Forma de pagamento do frete<br>Domínio: 1 (prepaid), 2 (collect).")
 /**
   * Forma de pagamento do frete<br>Domínio: 1 (prepaid), 2 (collect).
  **/
  private String formaPagamento = null;

  @XmlElement(name="valor", required = true)
  @ApiModelProperty(example = "15632.87", required = true, value = "Valor do frete")
  @Valid
 /**
   * Valor do frete
  **/
  private BigDecimal valor = null;
 /**
   * Código da moeda do Frete&lt;br&gt;Domínio: Tabela Tipo de Moeda
   * @return codigoMoedaFrete
  **/
  @JsonProperty("codigoMoedaFrete")
  @NotNull
  public String getCodigoMoedaFrete() {
    return codigoMoedaFrete;
  }

  public void setCodigoMoedaFrete(String codigoMoedaFrete) {
    this.codigoMoedaFrete = codigoMoedaFrete;
  }

  public Frete codigoMoedaFrete(String codigoMoedaFrete) {
    this.codigoMoedaFrete = codigoMoedaFrete;
    return this;
  }

 /**
   * Forma de pagamento do frete&lt;br&gt;Domínio: 1 (prepaid), 2 (collect).
   * @return formaPagamento
  **/
  @JsonProperty("formaPagamento")
  @NotNull
  public String getFormaPagamento() {
    return formaPagamento;
  }

  public void setFormaPagamento(String formaPagamento) {
    this.formaPagamento = formaPagamento;
  }

  public Frete formaPagamento(String formaPagamento) {
    this.formaPagamento = formaPagamento;
    return this;
  }

 /**
   * Valor do frete
   * @return valor
  **/
  @JsonProperty("valor")
  @NotNull
  public BigDecimal getValor() {
    return valor;
  }

  public void setValor(BigDecimal valor) {
    this.valor = valor;
  }

  public Frete valor(BigDecimal valor) {
    this.valor = valor;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Frete {\n");
    
    sb.append("    codigoMoedaFrete: ").append(toIndentedString(codigoMoedaFrete)).append("\n");
    sb.append("    formaPagamento: ").append(toIndentedString(formaPagamento)).append("\n");
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

