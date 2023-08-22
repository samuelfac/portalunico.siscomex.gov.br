package br.gov.siscomex.portalunico.cct_ext.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
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
 @XmlType(name = "RotaPassagem", propOrder =
    { "codigoPais", "codigoCidadeEntrada", "codigoAduanaEntrada", "codigoLugarOperativoEntrada", "codigoCidadeSaida", "codigoAduanaSaida", "codigoLugarOperativoSaida", "ordemPrecedencia"
})

@XmlRootElement(name="RotaPassagem")
/**
  * Rotas de Passagem
 **/
@ApiModel(description="Rotas de Passagem")
public class RotaPassagem  {
  
  @XmlElement(name="codigoPais")
  @ApiModelProperty(example = "BR", value = "País de passagem.<br>Tamanho: 2<br>Formato: AA")
 /**
   * País de passagem.<br>Tamanho: 2<br>Formato: AA
  **/
  private String codigoPais = null;

  @XmlElement(name="codigoCidadeEntrada")
  @ApiModelProperty(example = "30", value = "Cidade de entrada (UNLOCODE).<br>Tamanho: 5<br>Formato: AAAAA")
 /**
   * Cidade de entrada (UNLOCODE).<br>Tamanho: 5<br>Formato: AAAAA
  **/
  private String codigoCidadeEntrada = null;

  @XmlElement(name="codigoAduanaEntrada")
  @ApiModelProperty(example = "555", value = "Aduana de entrada (ADUANAS ESTRANGEIRAS).<br>Tamanho: 9<br>Formato: AAAAAAAAA")
 /**
   * Aduana de entrada (ADUANAS ESTRANGEIRAS).<br>Tamanho: 9<br>Formato: AAAAAAAAA
  **/
  private String codigoAduanaEntrada = null;

  @XmlElement(name="codigoLugarOperativoEntrada")
  @ApiModelProperty(example = "1234567", value = "Lugar operativo de entrada (LUGAR OPERATIVOS ADUANAS ESTRANGEIRAS).<br>Tamanho: 9<br>Formato: AAAAAAAAA")
 /**
   * Lugar operativo de entrada (LUGAR OPERATIVOS ADUANAS ESTRANGEIRAS).<br>Tamanho: 9<br>Formato: AAAAAAAAA
  **/
  private String codigoLugarOperativoEntrada = null;

  @XmlElement(name="codigoCidadeSaida")
  @ApiModelProperty(example = "10", value = "Cidade de saída (UNLOCODE).<br>Tamanho: 5<br>Formato: AAAAA")
 /**
   * Cidade de saída (UNLOCODE).<br>Tamanho: 5<br>Formato: AAAAA
  **/
  private String codigoCidadeSaida = null;

  @XmlElement(name="codigoAduanaSaida")
  @ApiModelProperty(example = "444", value = "Aduana de saída (ADUANAS ESTRANGEIRAS).<br>Tamanho: 9<br>Formato: AAAAAAAAA")
 /**
   * Aduana de saída (ADUANAS ESTRANGEIRAS).<br>Tamanho: 9<br>Formato: AAAAAAAAA
  **/
  private String codigoAduanaSaida = null;

  @XmlElement(name="codigoLugarOperativoSaida")
  @ApiModelProperty(example = "1234567", value = "Lugar operativo de saída (LUGAR OPERATIVOS ADUANAS ESTRANGEIRAS).<br>Tamanho: 9<br>Formato: AAAAAAAAA")
 /**
   * Lugar operativo de saída (LUGAR OPERATIVOS ADUANAS ESTRANGEIRAS).<br>Tamanho: 9<br>Formato: AAAAAAAAA
  **/
  private String codigoLugarOperativoSaida = null;

  @XmlElement(name="ordemPrecedencia")
  @ApiModelProperty(example = "1.0", value = "Ordem de precedência.<br>Tamanho: 1<br>Formato: N")
  @Valid
 /**
   * Ordem de precedência.<br>Tamanho: 1<br>Formato: N
  **/
  private BigDecimal ordemPrecedencia = null;
 /**
   * País de passagem.&lt;br&gt;Tamanho: 2&lt;br&gt;Formato: AA
   * @return codigoPais
  **/
  @JsonProperty("codigoPais")
  public String getCodigoPais() {
    return codigoPais;
  }

  public void setCodigoPais(String codigoPais) {
    this.codigoPais = codigoPais;
  }

  public RotaPassagem codigoPais(String codigoPais) {
    this.codigoPais = codigoPais;
    return this;
  }

 /**
   * Cidade de entrada (UNLOCODE).&lt;br&gt;Tamanho: 5&lt;br&gt;Formato: AAAAA
   * @return codigoCidadeEntrada
  **/
  @JsonProperty("codigoCidadeEntrada")
  public String getCodigoCidadeEntrada() {
    return codigoCidadeEntrada;
  }

  public void setCodigoCidadeEntrada(String codigoCidadeEntrada) {
    this.codigoCidadeEntrada = codigoCidadeEntrada;
  }

  public RotaPassagem codigoCidadeEntrada(String codigoCidadeEntrada) {
    this.codigoCidadeEntrada = codigoCidadeEntrada;
    return this;
  }

 /**
   * Aduana de entrada (ADUANAS ESTRANGEIRAS).&lt;br&gt;Tamanho: 9&lt;br&gt;Formato: AAAAAAAAA
   * @return codigoAduanaEntrada
  **/
  @JsonProperty("codigoAduanaEntrada")
  public String getCodigoAduanaEntrada() {
    return codigoAduanaEntrada;
  }

  public void setCodigoAduanaEntrada(String codigoAduanaEntrada) {
    this.codigoAduanaEntrada = codigoAduanaEntrada;
  }

  public RotaPassagem codigoAduanaEntrada(String codigoAduanaEntrada) {
    this.codigoAduanaEntrada = codigoAduanaEntrada;
    return this;
  }

 /**
   * Lugar operativo de entrada (LUGAR OPERATIVOS ADUANAS ESTRANGEIRAS).&lt;br&gt;Tamanho: 9&lt;br&gt;Formato: AAAAAAAAA
   * @return codigoLugarOperativoEntrada
  **/
  @JsonProperty("codigoLugarOperativoEntrada")
  public String getCodigoLugarOperativoEntrada() {
    return codigoLugarOperativoEntrada;
  }

  public void setCodigoLugarOperativoEntrada(String codigoLugarOperativoEntrada) {
    this.codigoLugarOperativoEntrada = codigoLugarOperativoEntrada;
  }

  public RotaPassagem codigoLugarOperativoEntrada(String codigoLugarOperativoEntrada) {
    this.codigoLugarOperativoEntrada = codigoLugarOperativoEntrada;
    return this;
  }

 /**
   * Cidade de saída (UNLOCODE).&lt;br&gt;Tamanho: 5&lt;br&gt;Formato: AAAAA
   * @return codigoCidadeSaida
  **/
  @JsonProperty("codigoCidadeSaida")
  public String getCodigoCidadeSaida() {
    return codigoCidadeSaida;
  }

  public void setCodigoCidadeSaida(String codigoCidadeSaida) {
    this.codigoCidadeSaida = codigoCidadeSaida;
  }

  public RotaPassagem codigoCidadeSaida(String codigoCidadeSaida) {
    this.codigoCidadeSaida = codigoCidadeSaida;
    return this;
  }

 /**
   * Aduana de saída (ADUANAS ESTRANGEIRAS).&lt;br&gt;Tamanho: 9&lt;br&gt;Formato: AAAAAAAAA
   * @return codigoAduanaSaida
  **/
  @JsonProperty("codigoAduanaSaida")
  public String getCodigoAduanaSaida() {
    return codigoAduanaSaida;
  }

  public void setCodigoAduanaSaida(String codigoAduanaSaida) {
    this.codigoAduanaSaida = codigoAduanaSaida;
  }

  public RotaPassagem codigoAduanaSaida(String codigoAduanaSaida) {
    this.codigoAduanaSaida = codigoAduanaSaida;
    return this;
  }

 /**
   * Lugar operativo de saída (LUGAR OPERATIVOS ADUANAS ESTRANGEIRAS).&lt;br&gt;Tamanho: 9&lt;br&gt;Formato: AAAAAAAAA
   * @return codigoLugarOperativoSaida
  **/
  @JsonProperty("codigoLugarOperativoSaida")
  public String getCodigoLugarOperativoSaida() {
    return codigoLugarOperativoSaida;
  }

  public void setCodigoLugarOperativoSaida(String codigoLugarOperativoSaida) {
    this.codigoLugarOperativoSaida = codigoLugarOperativoSaida;
  }

  public RotaPassagem codigoLugarOperativoSaida(String codigoLugarOperativoSaida) {
    this.codigoLugarOperativoSaida = codigoLugarOperativoSaida;
    return this;
  }

 /**
   * Ordem de precedência.&lt;br&gt;Tamanho: 1&lt;br&gt;Formato: N
   * @return ordemPrecedencia
  **/
  @JsonProperty("ordemPrecedencia")
  public BigDecimal getOrdemPrecedencia() {
    return ordemPrecedencia;
  }

  public void setOrdemPrecedencia(BigDecimal ordemPrecedencia) {
    this.ordemPrecedencia = ordemPrecedencia;
  }

  public RotaPassagem ordemPrecedencia(BigDecimal ordemPrecedencia) {
    this.ordemPrecedencia = ordemPrecedencia;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RotaPassagem {\n");
    
    sb.append("    codigoPais: ").append(toIndentedString(codigoPais)).append("\n");
    sb.append("    codigoCidadeEntrada: ").append(toIndentedString(codigoCidadeEntrada)).append("\n");
    sb.append("    codigoAduanaEntrada: ").append(toIndentedString(codigoAduanaEntrada)).append("\n");
    sb.append("    codigoLugarOperativoEntrada: ").append(toIndentedString(codigoLugarOperativoEntrada)).append("\n");
    sb.append("    codigoCidadeSaida: ").append(toIndentedString(codigoCidadeSaida)).append("\n");
    sb.append("    codigoAduanaSaida: ").append(toIndentedString(codigoAduanaSaida)).append("\n");
    sb.append("    codigoLugarOperativoSaida: ").append(toIndentedString(codigoLugarOperativoSaida)).append("\n");
    sb.append("    ordemPrecedencia: ").append(toIndentedString(ordemPrecedencia)).append("\n");
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

