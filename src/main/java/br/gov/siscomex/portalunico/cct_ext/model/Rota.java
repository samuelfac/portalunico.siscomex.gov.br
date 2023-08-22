package br.gov.siscomex.portalunico.cct_ext.model;

import br.gov.siscomex.portalunico.cct_ext.model.RotasPassagem;
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
 @XmlType(name = "Rota", propOrder =
    { "tempoPercurso", "descricaoRota", "codigoCidadeEntrada", "codigoAduanaEntrada", "codigoLugarOperativoEntrada", "codigoCidadeDestino", "codigoAduanaDestino", "codigoLugarOperativoDestino", "rotasPassagem"
})

@XmlRootElement(name="Rota")
/**
  * Rotas Internacionais
 **/
@ApiModel(description="Rotas Internacionais")
public class Rota  {
  
  @XmlElement(name="tempoPercurso", required = true)
  @ApiModelProperty(example = "100.0", required = true, value = "Prazo Aduana origem-destino horas.<br>Tamanho: 3<br>Formato: NNN")
  @Valid
 /**
   * Prazo Aduana origem-destino horas.<br>Tamanho: 3<br>Formato: NNN
  **/
  private BigDecimal tempoPercurso = null;

  @XmlElement(name="descricaoRota", required = true)
  @ApiModelProperty(example = "Teste Descrição", required = true, value = "Descrição da rota de trânsito internacional.<br>Tamanho: 500<br>Formato: AAA..AA")
 /**
   * Descrição da rota de trânsito internacional.<br>Tamanho: 500<br>Formato: AAA..AA
  **/
  private String descricaoRota = null;

  @XmlElement(name="codigoCidadeEntrada", required = true)
  @ApiModelProperty(example = "30", required = true, value = "Cidade de entrada (UNLOCODE).<br>Tamanho: 5<br>Formato: AAAAA")
 /**
   * Cidade de entrada (UNLOCODE).<br>Tamanho: 5<br>Formato: AAAAA
  **/
  private String codigoCidadeEntrada = null;

  @XmlElement(name="codigoAduanaEntrada", required = true)
  @ApiModelProperty(example = "222", required = true, value = "Aduana de entrada (ADUANAS ESTRANGEIRAS).<br>Tamanho: 9<br>Formato: AAAAAAAAA")
 /**
   * Aduana de entrada (ADUANAS ESTRANGEIRAS).<br>Tamanho: 9<br>Formato: AAAAAAAAA
  **/
  private String codigoAduanaEntrada = null;

  @XmlElement(name="codigoLugarOperativoEntrada", required = true)
  @ApiModelProperty(example = "1234567", required = true, value = "Lugar operativo de entrada (LUGAR OPERATIVOS ADUANAS ESTRANGEIRAS).<br>Tamanho: 9<br>Formato: AAAAAAAAA")
 /**
   * Lugar operativo de entrada (LUGAR OPERATIVOS ADUANAS ESTRANGEIRAS).<br>Tamanho: 9<br>Formato: AAAAAAAAA
  **/
  private String codigoLugarOperativoEntrada = null;

  @XmlElement(name="codigoCidadeDestino", required = true)
  @ApiModelProperty(example = "20", required = true, value = "Cidade de destino (UNLOCODE).<br>Tamanho: 5<br>Formato: AAAAA")
 /**
   * Cidade de destino (UNLOCODE).<br>Tamanho: 5<br>Formato: AAAAA
  **/
  private String codigoCidadeDestino = null;

  @XmlElement(name="codigoAduanaDestino", required = true)
  @ApiModelProperty(example = "333", required = true, value = "Aduana de destino (ADUANAS ESTRANGEIRAS).<br>Tamanho: 9<br>Formato: AAAAAAAAA")
 /**
   * Aduana de destino (ADUANAS ESTRANGEIRAS).<br>Tamanho: 9<br>Formato: AAAAAAAAA
  **/
  private String codigoAduanaDestino = null;

  @XmlElement(name="codigoLugarOperativoDestino", required = true)
  @ApiModelProperty(example = "1234567", required = true, value = "Lugar operativo de destino (LUGAR OPERATIVOS ADUANAS ESTRANGEIRAS).<br>Tamanho: 9<br>Formato: AAAAAAAAA")
 /**
   * Lugar operativo de destino (LUGAR OPERATIVOS ADUANAS ESTRANGEIRAS).<br>Tamanho: 9<br>Formato: AAAAAAAAA
  **/
  private String codigoLugarOperativoDestino = null;

  @XmlElement(name="rotasPassagem")
  @ApiModelProperty(value = "")
  @Valid
  private RotasPassagem rotasPassagem = null;
 /**
   * Prazo Aduana origem-destino horas.&lt;br&gt;Tamanho: 3&lt;br&gt;Formato: NNN
   * @return tempoPercurso
  **/
  @JsonProperty("tempoPercurso")
  @NotNull
  public BigDecimal getTempoPercurso() {
    return tempoPercurso;
  }

  public void setTempoPercurso(BigDecimal tempoPercurso) {
    this.tempoPercurso = tempoPercurso;
  }

  public Rota tempoPercurso(BigDecimal tempoPercurso) {
    this.tempoPercurso = tempoPercurso;
    return this;
  }

 /**
   * Descrição da rota de trânsito internacional.&lt;br&gt;Tamanho: 500&lt;br&gt;Formato: AAA..AA
   * @return descricaoRota
  **/
  @JsonProperty("descricaoRota")
  @NotNull
  public String getDescricaoRota() {
    return descricaoRota;
  }

  public void setDescricaoRota(String descricaoRota) {
    this.descricaoRota = descricaoRota;
  }

  public Rota descricaoRota(String descricaoRota) {
    this.descricaoRota = descricaoRota;
    return this;
  }

 /**
   * Cidade de entrada (UNLOCODE).&lt;br&gt;Tamanho: 5&lt;br&gt;Formato: AAAAA
   * @return codigoCidadeEntrada
  **/
  @JsonProperty("codigoCidadeEntrada")
  @NotNull
  public String getCodigoCidadeEntrada() {
    return codigoCidadeEntrada;
  }

  public void setCodigoCidadeEntrada(String codigoCidadeEntrada) {
    this.codigoCidadeEntrada = codigoCidadeEntrada;
  }

  public Rota codigoCidadeEntrada(String codigoCidadeEntrada) {
    this.codigoCidadeEntrada = codigoCidadeEntrada;
    return this;
  }

 /**
   * Aduana de entrada (ADUANAS ESTRANGEIRAS).&lt;br&gt;Tamanho: 9&lt;br&gt;Formato: AAAAAAAAA
   * @return codigoAduanaEntrada
  **/
  @JsonProperty("codigoAduanaEntrada")
  @NotNull
  public String getCodigoAduanaEntrada() {
    return codigoAduanaEntrada;
  }

  public void setCodigoAduanaEntrada(String codigoAduanaEntrada) {
    this.codigoAduanaEntrada = codigoAduanaEntrada;
  }

  public Rota codigoAduanaEntrada(String codigoAduanaEntrada) {
    this.codigoAduanaEntrada = codigoAduanaEntrada;
    return this;
  }

 /**
   * Lugar operativo de entrada (LUGAR OPERATIVOS ADUANAS ESTRANGEIRAS).&lt;br&gt;Tamanho: 9&lt;br&gt;Formato: AAAAAAAAA
   * @return codigoLugarOperativoEntrada
  **/
  @JsonProperty("codigoLugarOperativoEntrada")
  @NotNull
  public String getCodigoLugarOperativoEntrada() {
    return codigoLugarOperativoEntrada;
  }

  public void setCodigoLugarOperativoEntrada(String codigoLugarOperativoEntrada) {
    this.codigoLugarOperativoEntrada = codigoLugarOperativoEntrada;
  }

  public Rota codigoLugarOperativoEntrada(String codigoLugarOperativoEntrada) {
    this.codigoLugarOperativoEntrada = codigoLugarOperativoEntrada;
    return this;
  }

 /**
   * Cidade de destino (UNLOCODE).&lt;br&gt;Tamanho: 5&lt;br&gt;Formato: AAAAA
   * @return codigoCidadeDestino
  **/
  @JsonProperty("codigoCidadeDestino")
  @NotNull
  public String getCodigoCidadeDestino() {
    return codigoCidadeDestino;
  }

  public void setCodigoCidadeDestino(String codigoCidadeDestino) {
    this.codigoCidadeDestino = codigoCidadeDestino;
  }

  public Rota codigoCidadeDestino(String codigoCidadeDestino) {
    this.codigoCidadeDestino = codigoCidadeDestino;
    return this;
  }

 /**
   * Aduana de destino (ADUANAS ESTRANGEIRAS).&lt;br&gt;Tamanho: 9&lt;br&gt;Formato: AAAAAAAAA
   * @return codigoAduanaDestino
  **/
  @JsonProperty("codigoAduanaDestino")
  @NotNull
  public String getCodigoAduanaDestino() {
    return codigoAduanaDestino;
  }

  public void setCodigoAduanaDestino(String codigoAduanaDestino) {
    this.codigoAduanaDestino = codigoAduanaDestino;
  }

  public Rota codigoAduanaDestino(String codigoAduanaDestino) {
    this.codigoAduanaDestino = codigoAduanaDestino;
    return this;
  }

 /**
   * Lugar operativo de destino (LUGAR OPERATIVOS ADUANAS ESTRANGEIRAS).&lt;br&gt;Tamanho: 9&lt;br&gt;Formato: AAAAAAAAA
   * @return codigoLugarOperativoDestino
  **/
  @JsonProperty("codigoLugarOperativoDestino")
  @NotNull
  public String getCodigoLugarOperativoDestino() {
    return codigoLugarOperativoDestino;
  }

  public void setCodigoLugarOperativoDestino(String codigoLugarOperativoDestino) {
    this.codigoLugarOperativoDestino = codigoLugarOperativoDestino;
  }

  public Rota codigoLugarOperativoDestino(String codigoLugarOperativoDestino) {
    this.codigoLugarOperativoDestino = codigoLugarOperativoDestino;
    return this;
  }

 /**
   * Get rotasPassagem
   * @return rotasPassagem
  **/
  @JsonProperty("rotasPassagem")
  public RotasPassagem getRotasPassagem() {
    return rotasPassagem;
  }

  public void setRotasPassagem(RotasPassagem rotasPassagem) {
    this.rotasPassagem = rotasPassagem;
  }

  public Rota rotasPassagem(RotasPassagem rotasPassagem) {
    this.rotasPassagem = rotasPassagem;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Rota {\n");
    
    sb.append("    tempoPercurso: ").append(toIndentedString(tempoPercurso)).append("\n");
    sb.append("    descricaoRota: ").append(toIndentedString(descricaoRota)).append("\n");
    sb.append("    codigoCidadeEntrada: ").append(toIndentedString(codigoCidadeEntrada)).append("\n");
    sb.append("    codigoAduanaEntrada: ").append(toIndentedString(codigoAduanaEntrada)).append("\n");
    sb.append("    codigoLugarOperativoEntrada: ").append(toIndentedString(codigoLugarOperativoEntrada)).append("\n");
    sb.append("    codigoCidadeDestino: ").append(toIndentedString(codigoCidadeDestino)).append("\n");
    sb.append("    codigoAduanaDestino: ").append(toIndentedString(codigoAduanaDestino)).append("\n");
    sb.append("    codigoLugarOperativoDestino: ").append(toIndentedString(codigoLugarOperativoDestino)).append("\n");
    sb.append("    rotasPassagem: ").append(toIndentedString(rotasPassagem)).append("\n");
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

