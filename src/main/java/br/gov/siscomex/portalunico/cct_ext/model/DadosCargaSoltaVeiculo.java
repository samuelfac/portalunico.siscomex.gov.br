package br.gov.siscomex.portalunico.cct_ext.model;

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
 @XmlType(name = "DadosCargaSoltaVeiculo", propOrder =
    { "tipoEmbalagem", "descricaoEmbalagem", "quantidade"
})

@XmlRootElement(name="DadosCargaSoltaVeiculo")
/**
  * Dados da carga solta / veículo
 **/
@ApiModel(description="Dados da carga solta / veículo")
public class DadosCargaSoltaVeiculo  {
  
  @XmlElement(name="tipoEmbalagem")
  @ApiModelProperty(example = "1", value = "Tamanho: 2<br>Formato: NN")
 /**
   * Tamanho: 2<br>Formato: NN
  **/
  private Integer tipoEmbalagem = null;

  @XmlElement(name="descricaoEmbalagem")
  @ApiModelProperty(example = "caixa", value = "Tamanho:")
 /**
   * Tamanho:
  **/
  private String descricaoEmbalagem = null;

  @XmlElement(name="quantidade")
  @ApiModelProperty(example = "10", value = "Tamanho: 12.3<br>Formato: Decimal, com três casas decimais separadas por ponto")
 /**
   * Tamanho: 12.3<br>Formato: Decimal, com três casas decimais separadas por ponto
  **/
  private Integer quantidade = null;
 /**
   * Tamanho: 2&lt;br&gt;Formato: NN
   * @return tipoEmbalagem
  **/
  @JsonProperty("tipoEmbalagem")
  public Integer getTipoEmbalagem() {
    return tipoEmbalagem;
  }

  public void setTipoEmbalagem(Integer tipoEmbalagem) {
    this.tipoEmbalagem = tipoEmbalagem;
  }

  public DadosCargaSoltaVeiculo tipoEmbalagem(Integer tipoEmbalagem) {
    this.tipoEmbalagem = tipoEmbalagem;
    return this;
  }

 /**
   * Tamanho:
   * @return descricaoEmbalagem
  **/
  @JsonProperty("descricaoEmbalagem")
  public String getDescricaoEmbalagem() {
    return descricaoEmbalagem;
  }

  public void setDescricaoEmbalagem(String descricaoEmbalagem) {
    this.descricaoEmbalagem = descricaoEmbalagem;
  }

  public DadosCargaSoltaVeiculo descricaoEmbalagem(String descricaoEmbalagem) {
    this.descricaoEmbalagem = descricaoEmbalagem;
    return this;
  }

 /**
   * Tamanho: 12.3&lt;br&gt;Formato: Decimal, com três casas decimais separadas por ponto
   * @return quantidade
  **/
  @JsonProperty("quantidade")
  public Integer getQuantidade() {
    return quantidade;
  }

  public void setQuantidade(Integer quantidade) {
    this.quantidade = quantidade;
  }

  public DadosCargaSoltaVeiculo quantidade(Integer quantidade) {
    this.quantidade = quantidade;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DadosCargaSoltaVeiculo {\n");
    
    sb.append("    tipoEmbalagem: ").append(toIndentedString(tipoEmbalagem)).append("\n");
    sb.append("    descricaoEmbalagem: ").append(toIndentedString(descricaoEmbalagem)).append("\n");
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

