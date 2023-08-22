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
 @XmlType(name = "ItemNFEEstoque", propOrder =
    { "item", "ncm", "saldo"
})

@XmlRootElement(name="ItemNFEEstoque")
/**
  * Estoque da Nota Fiscal Eletrônica
 **/
@ApiModel(description="Estoque da Nota Fiscal Eletrônica")
public class ItemNFEEstoque  {
  
  @XmlElement(name="item")
  @ApiModelProperty(example = "1.0", value = "Número do Item da Nota Fiscal Eletrônica<br>Tamanho máximo: 4<br>Formato: NNNN")
  @Valid
 /**
   * Número do Item da Nota Fiscal Eletrônica<br>Tamanho máximo: 4<br>Formato: NNNN
  **/
  private BigDecimal item = null;

  @XmlElement(name="ncm")
  @ApiModelProperty(example = "1022190.0", value = "Código NCM do produto<br>Tamanho: 8")
  @Valid
 /**
   * Código NCM do produto<br>Tamanho: 8
  **/
  private BigDecimal ncm = null;

  @XmlElement(name="saldo")
  @ApiModelProperty(example = "100.0", value = "Saldo em estoque<br>Tamanho: 12.3<br>Formato: NNNNNNNNNNNN.NNN")
  @Valid
 /**
   * Saldo em estoque<br>Tamanho: 12.3<br>Formato: NNNNNNNNNNNN.NNN
  **/
  private BigDecimal saldo = null;
 /**
   * Número do Item da Nota Fiscal Eletrônica&lt;br&gt;Tamanho máximo: 4&lt;br&gt;Formato: NNNN
   * @return item
  **/
  @JsonProperty("item")
  public BigDecimal getItem() {
    return item;
  }

  public void setItem(BigDecimal item) {
    this.item = item;
  }

  public ItemNFEEstoque item(BigDecimal item) {
    this.item = item;
    return this;
  }

 /**
   * Código NCM do produto&lt;br&gt;Tamanho: 8
   * @return ncm
  **/
  @JsonProperty("ncm")
  public BigDecimal getNcm() {
    return ncm;
  }

  public void setNcm(BigDecimal ncm) {
    this.ncm = ncm;
  }

  public ItemNFEEstoque ncm(BigDecimal ncm) {
    this.ncm = ncm;
    return this;
  }

 /**
   * Saldo em estoque&lt;br&gt;Tamanho: 12.3&lt;br&gt;Formato: NNNNNNNNNNNN.NNN
   * @return saldo
  **/
  @JsonProperty("saldo")
  public BigDecimal getSaldo() {
    return saldo;
  }

  public void setSaldo(BigDecimal saldo) {
    this.saldo = saldo;
  }

  public ItemNFEEstoque saldo(BigDecimal saldo) {
    this.saldo = saldo;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemNFEEstoque {\n");
    
    sb.append("    item: ").append(toIndentedString(item)).append("\n");
    sb.append("    ncm: ").append(toIndentedString(ncm)).append("\n");
    sb.append("    saldo: ").append(toIndentedString(saldo)).append("\n");
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

