package br.gov.siscomex.portalunico.duimp_api.model;

import br.gov.siscomex.portalunico.duimp_api.model.TributoPagamentoRegistroCover;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "ValorPagamentoRegistroCover", propOrder =
    { "tributo", "valor", "juros"
})

@XmlRootElement(name="ValorPagamentoRegistroCover")
/**
  * Dados do tributo principal.
 **/
@ApiModel(description="Dados do tributo principal.")
public class ValorPagamentoRegistroCover  {
  
  @XmlElement(name="tributo", required = true)
  @ApiModelProperty(required = true, value = "")
  @Valid
  private TributoPagamentoRegistroCover tributo = null;

  @XmlElement(name="valor", required = true)
  @ApiModelProperty(example = "10.12", required = true, value = "Valor do pagamento principal em R$ (Reais).<br>Tamanho: 13,2<br>Formato: Decimal, com até 2 casas decimais separadas por ponto.")
 /**
   * Valor do pagamento principal em R$ (Reais).<br>Tamanho: 13,2<br>Formato: Decimal, com até 2 casas decimais separadas por ponto.
  **/
  private Double valor = null;

  @XmlElement(name="juros", required = true)
  @ApiModelProperty(example = "10.12", required = true, value = "Valor do pagamento de juros em R$ (Reais).<br>Tamanho: 13,2<br>Formato: Decimal, com até 2 casas decimais separadas por ponto.")
 /**
   * Valor do pagamento de juros em R$ (Reais).<br>Tamanho: 13,2<br>Formato: Decimal, com até 2 casas decimais separadas por ponto.
  **/
  private Double juros = null;
 /**
   * Get tributo
   * @return tributo
  **/
  @JsonProperty("tributo")
  @NotNull
  public TributoPagamentoRegistroCover getTributo() {
    return tributo;
  }

  public void setTributo(TributoPagamentoRegistroCover tributo) {
    this.tributo = tributo;
  }

  public ValorPagamentoRegistroCover tributo(TributoPagamentoRegistroCover tributo) {
    this.tributo = tributo;
    return this;
  }

 /**
   * Valor do pagamento principal em R$ (Reais).&lt;br&gt;Tamanho: 13,2&lt;br&gt;Formato: Decimal, com até 2 casas decimais separadas por ponto.
   * @return valor
  **/
  @JsonProperty("valor")
  @NotNull
  public Double getValor() {
    return valor;
  }

  public void setValor(Double valor) {
    this.valor = valor;
  }

  public ValorPagamentoRegistroCover valor(Double valor) {
    this.valor = valor;
    return this;
  }

 /**
   * Valor do pagamento de juros em R$ (Reais).&lt;br&gt;Tamanho: 13,2&lt;br&gt;Formato: Decimal, com até 2 casas decimais separadas por ponto.
   * @return juros
  **/
  @JsonProperty("juros")
  @NotNull
  public Double getJuros() {
    return juros;
  }

  public void setJuros(Double juros) {
    this.juros = juros;
  }

  public ValorPagamentoRegistroCover juros(Double juros) {
    this.juros = juros;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValorPagamentoRegistroCover {\n");
    
    sb.append("    tributo: ").append(toIndentedString(tributo)).append("\n");
    sb.append("    valor: ").append(toIndentedString(valor)).append("\n");
    sb.append("    juros: ").append(toIndentedString(juros)).append("\n");
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

