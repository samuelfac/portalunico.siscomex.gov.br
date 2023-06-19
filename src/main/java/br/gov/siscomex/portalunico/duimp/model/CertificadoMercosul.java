package br.gov.siscomex.portalunico.duimp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.xml.bind.annotation.*;
import java.math.BigDecimal;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "CertificadoMercosul", propOrder =
    { "tipoCertificadoMercosul", "numeroCertificado", "quantidadeUnidadeEstatisticaCertificado"
})

@XmlRootElement(name="CertificadoMercosul")
/**
  * Dados de um certificado do Mercosul
 **/
@ApiModel(description="Dados de um certificado do Mercosul")
public class CertificadoMercosul  {
  

@XmlType(name="TipoCertificadoMercosulEnum")
@XmlEnum(String.class)
public enum TipoCertificadoMercosulEnum {

	@XmlEnumValue("2")
	@JsonProperty("2")
	_2(String.valueOf("2")),
	
	@XmlEnumValue("3")
	@JsonProperty("3")
	_3(String.valueOf("3"));


    private String value;

    TipoCertificadoMercosulEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TipoCertificadoMercosulEnum fromValue(String v) {
        for (TipoCertificadoMercosulEnum b : TipoCertificadoMercosulEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to TipoCertificadoMercosulEnum");
    }
}

  @XmlElement(name="tipoCertificadoMercosul")
  @ApiModelProperty(example = "2", value = "Tipo de certificado Mercosul.<br>Dominio:<br>2 - CCPTC<br>3 - CCROM<br>Tamanho: 1")
 /**
   * Tipo de certificado Mercosul.<br>Dominio:<br>2 - CCPTC<br>3 - CCROM<br>Tamanho: 1
  **/
  private TipoCertificadoMercosulEnum tipoCertificadoMercosul = null;

  @XmlElement(name="numeroCertificado")
  @ApiModelProperty(example = "PY-06000AA00000000A-0001", value = "Número do Certificado MercosulNúmero do certificado Mercosul.<br>Tamanho mínimo: 1<br>Tamanho máximo: 23")
 /**
   * Número do Certificado MercosulNúmero do certificado Mercosul.<br>Tamanho mínimo: 1<br>Tamanho máximo: 23
  **/
  private String numeroCertificado = null;

  @XmlElement(name="quantidadeUnidadeEstatisticaCertificado")
  @ApiModelProperty(example = "1.00345", value = "Quantidade da mercadoria na unidade estatistica<br>Tamanho: 11,5<br>Formato: Decimal, com até 5 casas decimais separadas por ponto.")
  @Valid
 /**
   * Quantidade da mercadoria na unidade estatistica<br>Tamanho: 11,5<br>Formato: Decimal, com até 5 casas decimais separadas por ponto.
  **/
  private BigDecimal quantidadeUnidadeEstatisticaCertificado = null;
 /**
   * Tipo de certificado Mercosul.&lt;br&gt;Dominio:&lt;br&gt;2 - CCPTC&lt;br&gt;3 - CCROM&lt;br&gt;Tamanho: 1
   * @return tipoCertificadoMercosul
  **/
  @JsonProperty("tipoCertificadoMercosul")
  public String getTipoCertificadoMercosul() {
    if (tipoCertificadoMercosul == null) {
      return null;
    }
    return tipoCertificadoMercosul.value();
  }

  public void setTipoCertificadoMercosul(TipoCertificadoMercosulEnum tipoCertificadoMercosul) {
    this.tipoCertificadoMercosul = tipoCertificadoMercosul;
  }

  public CertificadoMercosul tipoCertificadoMercosul(TipoCertificadoMercosulEnum tipoCertificadoMercosul) {
    this.tipoCertificadoMercosul = tipoCertificadoMercosul;
    return this;
  }

 /**
   * Número do Certificado MercosulNúmero do certificado Mercosul.&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 23
   * @return numeroCertificado
  **/
  @JsonProperty("numeroCertificado")
  public String getNumeroCertificado() {
    return numeroCertificado;
  }

  public void setNumeroCertificado(String numeroCertificado) {
    this.numeroCertificado = numeroCertificado;
  }

  public CertificadoMercosul numeroCertificado(String numeroCertificado) {
    this.numeroCertificado = numeroCertificado;
    return this;
  }

 /**
   * Quantidade da mercadoria na unidade estatistica&lt;br&gt;Tamanho: 11,5&lt;br&gt;Formato: Decimal, com até 5 casas decimais separadas por ponto.
   * @return quantidadeUnidadeEstatisticaCertificado
  **/
  @JsonProperty("quantidadeUnidadeEstatisticaCertificado")
  public BigDecimal getQuantidadeUnidadeEstatisticaCertificado() {
    return quantidadeUnidadeEstatisticaCertificado;
  }

  public void setQuantidadeUnidadeEstatisticaCertificado(BigDecimal quantidadeUnidadeEstatisticaCertificado) {
    this.quantidadeUnidadeEstatisticaCertificado = quantidadeUnidadeEstatisticaCertificado;
  }

  public CertificadoMercosul quantidadeUnidadeEstatisticaCertificado(BigDecimal quantidadeUnidadeEstatisticaCertificado) {
    this.quantidadeUnidadeEstatisticaCertificado = quantidadeUnidadeEstatisticaCertificado;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CertificadoMercosul {\n");
    
    sb.append("    tipoCertificadoMercosul: ").append(toIndentedString(tipoCertificadoMercosul)).append("\n");
    sb.append("    numeroCertificado: ").append(toIndentedString(numeroCertificado)).append("\n");
    sb.append("    quantidadeUnidadeEstatisticaCertificado: ").append(toIndentedString(quantidadeUnidadeEstatisticaCertificado)).append("\n");
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

