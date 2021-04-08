package br.gov.siscomex.portalunico.cct_ext.model;

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
 @XmlType(name = "Embalagem", propOrder =
    { "codigoTipoEmbalagem", "quantidade"
})

@XmlRootElement(name="Embalagem")
/**
  * Dados da embalagem
 **/
@ApiModel(description="Dados da embalagem")
public class Embalagem  {
  
  @XmlElement(name="codigoTipoEmbalagem", required = true)
  @ApiModelProperty(example = "10", required = true, value = "Tipo de embalagem conforme a tabela Tipo de Embalagem.<br>Tamanho: 2<br>Formato: NN")
 /**
   * Tipo de embalagem conforme a tabela Tipo de Embalagem.<br>Tamanho: 2<br>Formato: NN
  **/
  private Integer codigoTipoEmbalagem = null;

  @XmlElement(name="quantidade", required = true)
  @ApiModelProperty(example = "9999", required = true, value = "Quantidade de embalagens deste tipo<br>Tamanho: 4<br>Formato: NNNN")
 /**
   * Quantidade de embalagens deste tipo<br>Tamanho: 4<br>Formato: NNNN
  **/
  private Integer quantidade = null;
 /**
   * Tipo de embalagem conforme a tabela Tipo de Embalagem.&lt;br&gt;Tamanho: 2&lt;br&gt;Formato: NN
   * @return codigoTipoEmbalagem
  **/
  @JsonProperty("codigoTipoEmbalagem")
  @NotNull
  public Integer getCodigoTipoEmbalagem() {
    return codigoTipoEmbalagem;
  }

  public void setCodigoTipoEmbalagem(Integer codigoTipoEmbalagem) {
    this.codigoTipoEmbalagem = codigoTipoEmbalagem;
  }

  public Embalagem codigoTipoEmbalagem(Integer codigoTipoEmbalagem) {
    this.codigoTipoEmbalagem = codigoTipoEmbalagem;
    return this;
  }

 /**
   * Quantidade de embalagens deste tipo&lt;br&gt;Tamanho: 4&lt;br&gt;Formato: NNNN
   * @return quantidade
  **/
  @JsonProperty("quantidade")
  @NotNull
  public Integer getQuantidade() {
    return quantidade;
  }

  public void setQuantidade(Integer quantidade) {
    this.quantidade = quantidade;
  }

  public Embalagem quantidade(Integer quantidade) {
    this.quantidade = quantidade;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Embalagem {\n");
    
    sb.append("    codigoTipoEmbalagem: ").append(toIndentedString(codigoTipoEmbalagem)).append("\n");
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

