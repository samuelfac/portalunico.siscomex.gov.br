package br.gov.siscomex.portalunico.cct_ext.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.xml.bind.annotation.*;
import java.math.BigDecimal;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "DadosGranel", propOrder =
    { "tipoGranel", "descricaoGranel", "sgUnidadeMedida", "descUnidadeMedida", "quantidade"
})

@XmlRootElement(name="DadosGranel")
/**
  * Dados do granel
 **/
@ApiModel(description="Dados do granel")
public class DadosGranel  {
  
  @XmlElement(name="tipoGranel")
  @ApiModelProperty(example = "60", value = "Tamanho: 2<br>Formato: NN")
 /**
   * Tamanho: 2<br>Formato: NN
  **/
  private Integer tipoGranel = null;

  @XmlElement(name="descricaoGranel")
  @ApiModelProperty(example = "soja", value = "Tamanho:")
 /**
   * Tamanho:
  **/
  private String descricaoGranel = null;

  @XmlElement(name="sgUnidadeMedida")
  @ApiModelProperty(example = "kg", value = "Tamanho: 4<br>Formato: AAAA")
 /**
   * Tamanho: 4<br>Formato: AAAA
  **/
  private String sgUnidadeMedida = null;

  @XmlElement(name="descUnidadeMedida")
  @ApiModelProperty(example = "kilo", value = "Tamanho:")
 /**
   * Tamanho:
  **/
  private String descUnidadeMedida = null;

  @XmlElement(name="quantidade")
  @ApiModelProperty(example = "10.001", value = "Tamanho: 12.3<br>Formato: Decimal, com três casas decimais separadas por ponto")
  @Valid
 /**
   * Tamanho: 12.3<br>Formato: Decimal, com três casas decimais separadas por ponto
  **/
  private BigDecimal quantidade = null;
 /**
   * Tamanho: 2&lt;br&gt;Formato: NN
   * @return tipoGranel
  **/
  @JsonProperty("tipoGranel")
  public Integer getTipoGranel() {
    return tipoGranel;
  }

  public void setTipoGranel(Integer tipoGranel) {
    this.tipoGranel = tipoGranel;
  }

  public DadosGranel tipoGranel(Integer tipoGranel) {
    this.tipoGranel = tipoGranel;
    return this;
  }

 /**
   * Tamanho:
   * @return descricaoGranel
  **/
  @JsonProperty("descricaoGranel")
  public String getDescricaoGranel() {
    return descricaoGranel;
  }

  public void setDescricaoGranel(String descricaoGranel) {
    this.descricaoGranel = descricaoGranel;
  }

  public DadosGranel descricaoGranel(String descricaoGranel) {
    this.descricaoGranel = descricaoGranel;
    return this;
  }

 /**
   * Tamanho: 4&lt;br&gt;Formato: AAAA
   * @return sgUnidadeMedida
  **/
  @JsonProperty("sgUnidadeMedida")
  public String getSgUnidadeMedida() {
    return sgUnidadeMedida;
  }

  public void setSgUnidadeMedida(String sgUnidadeMedida) {
    this.sgUnidadeMedida = sgUnidadeMedida;
  }

  public DadosGranel sgUnidadeMedida(String sgUnidadeMedida) {
    this.sgUnidadeMedida = sgUnidadeMedida;
    return this;
  }

 /**
   * Tamanho:
   * @return descUnidadeMedida
  **/
  @JsonProperty("descUnidadeMedida")
  public String getDescUnidadeMedida() {
    return descUnidadeMedida;
  }

  public void setDescUnidadeMedida(String descUnidadeMedida) {
    this.descUnidadeMedida = descUnidadeMedida;
  }

  public DadosGranel descUnidadeMedida(String descUnidadeMedida) {
    this.descUnidadeMedida = descUnidadeMedida;
    return this;
  }

 /**
   * Tamanho: 12.3&lt;br&gt;Formato: Decimal, com três casas decimais separadas por ponto
   * @return quantidade
  **/
  @JsonProperty("quantidade")
  public BigDecimal getQuantidade() {
    return quantidade;
  }

  public void setQuantidade(BigDecimal quantidade) {
    this.quantidade = quantidade;
  }

  public DadosGranel quantidade(BigDecimal quantidade) {
    this.quantidade = quantidade;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DadosGranel {\n");
    
    sb.append("    tipoGranel: ").append(toIndentedString(tipoGranel)).append("\n");
    sb.append("    descricaoGranel: ").append(toIndentedString(descricaoGranel)).append("\n");
    sb.append("    sgUnidadeMedida: ").append(toIndentedString(sgUnidadeMedida)).append("\n");
    sb.append("    descUnidadeMedida: ").append(toIndentedString(descUnidadeMedida)).append("\n");
    sb.append("    quantidade: ").append(toIndentedString(quantidade)).append("\n");
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

