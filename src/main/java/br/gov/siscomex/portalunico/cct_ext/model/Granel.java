package br.gov.siscomex.portalunico.cct_ext.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "Granel", propOrder =
    { "tipoGranel", "sgUnidadeMedida", "total", "quantidade"
})

@XmlRootElement(name="Granel")
/**
  * Dados do granel
 **/
@ApiModel(description="Dados do granel")
public class Granel  {
  
  @XmlElement(name="tipoGranel", required = true)
  @ApiModelProperty(example = "19", required = true, value = "Tipo de granel conforme a tabela Tipo de Granel<br>Tamanho: 2<br>Formato: NN")
 /**
   * Tipo de granel conforme a tabela Tipo de Granel<br>Tamanho: 2<br>Formato: NN
  **/
  private Integer tipoGranel = null;

  @XmlElement(name="sgUnidadeMedida", required = true)
  @ApiModelProperty(example = "kg", required = true, value = "Unidade de medida estatística<br>Tamanho: 4<br>Formato: AAAA<br>Domínio: kg = quilo e m3 = metro cúbico.")
 /**
   * Unidade de medida estatística<br>Tamanho: 4<br>Formato: AAAA<br>Domínio: kg = quilo e m3 = metro cúbico.
  **/
  private String sgUnidadeMedida = null;

  @XmlElement(name="total", required = true)
  @ApiModelProperty(example = "9923.456", required = true, value = "Peso bruto total, caso ainda não tenha sido informado<br>Tamanho: 12.3<br>Formato: NNNNNNNNNNNN.NNN")
  @Valid
 /**
   * Peso bruto total, caso ainda não tenha sido informado<br>Tamanho: 12.3<br>Formato: NNNNNNNNNNNN.NNN
  **/
  private BigDecimal total = null;

  @XmlElement(name="quantidade", required = true)
  @ApiModelProperty(example = "123.456", required = true, value = "Peso bruto<br>Tamanho: 12.3<br>Formato: NNNNNNNNNNNN.NNN")
  @Valid
 /**
   * Peso bruto<br>Tamanho: 12.3<br>Formato: NNNNNNNNNNNN.NNN
  **/
  private BigDecimal quantidade = null;
 /**
   * Tipo de granel conforme a tabela Tipo de Granel&lt;br&gt;Tamanho: 2&lt;br&gt;Formato: NN
   * @return tipoGranel
  **/
  @JsonProperty("tipoGranel")
  @NotNull
  public Integer getTipoGranel() {
    return tipoGranel;
  }

  public void setTipoGranel(Integer tipoGranel) {
    this.tipoGranel = tipoGranel;
  }

  public Granel tipoGranel(Integer tipoGranel) {
    this.tipoGranel = tipoGranel;
    return this;
  }

 /**
   * Unidade de medida estatística&lt;br&gt;Tamanho: 4&lt;br&gt;Formato: AAAA&lt;br&gt;Domínio: kg &#x3D; quilo e m3 &#x3D; metro cúbico.
   * @return sgUnidadeMedida
  **/
  @JsonProperty("sgUnidadeMedida")
  @NotNull
  public String getSgUnidadeMedida() {
    return sgUnidadeMedida;
  }

  public void setSgUnidadeMedida(String sgUnidadeMedida) {
    this.sgUnidadeMedida = sgUnidadeMedida;
  }

  public Granel sgUnidadeMedida(String sgUnidadeMedida) {
    this.sgUnidadeMedida = sgUnidadeMedida;
    return this;
  }

 /**
   * Peso bruto total, caso ainda não tenha sido informado&lt;br&gt;Tamanho: 12.3&lt;br&gt;Formato: NNNNNNNNNNNN.NNN
   * @return total
  **/
  @JsonProperty("total")
  @NotNull
  public BigDecimal getTotal() {
    return total;
  }

  public void setTotal(BigDecimal total) {
    this.total = total;
  }

  public Granel total(BigDecimal total) {
    this.total = total;
    return this;
  }

 /**
   * Peso bruto&lt;br&gt;Tamanho: 12.3&lt;br&gt;Formato: NNNNNNNNNNNN.NNN
   * @return quantidade
  **/
  @JsonProperty("quantidade")
  @NotNull
  public BigDecimal getQuantidade() {
    return quantidade;
  }

  public void setQuantidade(BigDecimal quantidade) {
    this.quantidade = quantidade;
  }

  public Granel quantidade(BigDecimal quantidade) {
    this.quantidade = quantidade;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Granel {\n");
    
    sb.append("    tipoGranel: ").append(toIndentedString(tipoGranel)).append("\n");
    sb.append("    sgUnidadeMedida: ").append(toIndentedString(sgUnidadeMedida)).append("\n");
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

