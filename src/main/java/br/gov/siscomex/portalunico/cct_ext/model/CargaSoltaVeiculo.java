package br.gov.siscomex.portalunico.cct_ext.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "CargaSoltaVeiculo", propOrder =
    { "tipoEmbalagem", "total", "quantidade"
})

@XmlRootElement(name="CargaSoltaVeiculo")
/**
  * Dados da carga solta/veículo
 **/
@ApiModel(description="Dados da carga solta/veículo")
public class CargaSoltaVeiculo  {
  
  @XmlElement(name="tipoEmbalagem", required = true)
  @ApiModelProperty(example = "10", required = true, value = "Tipo de embalagem conforme a tabela Tipo de Embalagem.<br>Tamanho: 2<br>Formato: NN")
 /**
   * Tipo de embalagem conforme a tabela Tipo de Embalagem.<br>Tamanho: 2<br>Formato: NN
  **/
  private Integer tipoEmbalagem = null;

  @XmlElement(name="total")
  @ApiModelProperty(example = "99999", value = "Total de embalagens deste tipo, caso não tenha sido informado ainda.<br>Tamanho: 5<br>Formato: NNNNN")
 /**
   * Total de embalagens deste tipo, caso não tenha sido informado ainda.<br>Tamanho: 5<br>Formato: NNNNN
  **/
  private Integer total = null;

  @XmlElement(name="quantidade")
  @ApiModelProperty(example = "9999", value = "Quantidade de embalagens deste tipo.<br>Tamanho: 4<br>Formato: NNNNN")
 /**
   * Quantidade de embalagens deste tipo.<br>Tamanho: 4<br>Formato: NNNNN
  **/
  private Integer quantidade = null;
 /**
   * Tipo de embalagem conforme a tabela Tipo de Embalagem.&lt;br&gt;Tamanho: 2&lt;br&gt;Formato: NN
   * @return tipoEmbalagem
  **/
  @JsonProperty("tipoEmbalagem")
  @NotNull
  public Integer getTipoEmbalagem() {
    return tipoEmbalagem;
  }

  public void setTipoEmbalagem(Integer tipoEmbalagem) {
    this.tipoEmbalagem = tipoEmbalagem;
  }

  public CargaSoltaVeiculo tipoEmbalagem(Integer tipoEmbalagem) {
    this.tipoEmbalagem = tipoEmbalagem;
    return this;
  }

 /**
   * Total de embalagens deste tipo, caso não tenha sido informado ainda.&lt;br&gt;Tamanho: 5&lt;br&gt;Formato: NNNNN
   * @return total
  **/
  @JsonProperty("total")
  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }

  public CargaSoltaVeiculo total(Integer total) {
    this.total = total;
    return this;
  }

 /**
   * Quantidade de embalagens deste tipo.&lt;br&gt;Tamanho: 4&lt;br&gt;Formato: NNNNN
   * @return quantidade
  **/
  @JsonProperty("quantidade")
  public Integer getQuantidade() {
    return quantidade;
  }

  public void setQuantidade(Integer quantidade) {
    this.quantidade = quantidade;
  }

  public CargaSoltaVeiculo quantidade(Integer quantidade) {
    this.quantidade = quantidade;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CargaSoltaVeiculo {\n");
    
    sb.append("    tipoEmbalagem: ").append(toIndentedString(tipoEmbalagem)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

