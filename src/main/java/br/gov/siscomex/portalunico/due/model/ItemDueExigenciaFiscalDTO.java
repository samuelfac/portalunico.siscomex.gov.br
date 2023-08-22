package br.gov.siscomex.portalunico.due.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "ItemDueExigenciaFiscalDTO", propOrder =
    { "codigoNCM", "descricaoMercadoria", "numeroItemDue", "numeroItemNotaFiscal", "numeroNotaFiscal"
})

@XmlRootElement(name="ItemDueExigenciaFiscalDTO")
public class ItemDueExigenciaFiscalDTO  {
  
  @XmlElement(name="codigoNCM")
  @ApiModelProperty(value = "NCM <br />Tamanho: 8")
 /**
   * NCM <br />Tamanho: 8
  **/
  private String codigoNCM = null;

  @XmlElement(name="descricaoMercadoria")
  @ApiModelProperty(value = "Descrição da mercadoria ou descrição do item de nota fiscal<br />Tamanho máximo: 256")
 /**
   * Descrição da mercadoria ou descrição do item de nota fiscal<br />Tamanho máximo: 256
  **/
  private String descricaoMercadoria = null;

  @XmlElement(name="numeroItemDue")
  @ApiModelProperty(value = "Número do item<br />Formato: Inteiro, com até 5 digitos")
 /**
   * Número do item<br />Formato: Inteiro, com até 5 digitos
  **/
  private String numeroItemDue = null;

  @XmlElement(name="numeroItemNotaFiscal")
  @ApiModelProperty(value = "Número<br />Tamanho: 3,0<br />Formato: Decimal, com 0 casas decimais.")
 /**
   * Número<br />Tamanho: 3,0<br />Formato: Decimal, com 0 casas decimais.
  **/
  private String numeroItemNotaFiscal = null;

  @XmlElement(name="numeroNotaFiscal")
  @ApiModelProperty(value = "Chave de acesso<br />Tamanho: 44<br />Formato: 'NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN'")
 /**
   * Chave de acesso<br />Tamanho: 44<br />Formato: 'NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN'
  **/
  private String numeroNotaFiscal = null;
 /**
   * NCM &lt;br /&gt;Tamanho: 8
   * @return codigoNCM
  **/
  @JsonProperty("codigoNCM")
  public String getCodigoNCM() {
    return codigoNCM;
  }

  public void setCodigoNCM(String codigoNCM) {
    this.codigoNCM = codigoNCM;
  }

  public ItemDueExigenciaFiscalDTO codigoNCM(String codigoNCM) {
    this.codigoNCM = codigoNCM;
    return this;
  }

 /**
   * Descrição da mercadoria ou descrição do item de nota fiscal&lt;br /&gt;Tamanho máximo: 256
   * @return descricaoMercadoria
  **/
  @JsonProperty("descricaoMercadoria")
  public String getDescricaoMercadoria() {
    return descricaoMercadoria;
  }

  public void setDescricaoMercadoria(String descricaoMercadoria) {
    this.descricaoMercadoria = descricaoMercadoria;
  }

  public ItemDueExigenciaFiscalDTO descricaoMercadoria(String descricaoMercadoria) {
    this.descricaoMercadoria = descricaoMercadoria;
    return this;
  }

 /**
   * Número do item&lt;br /&gt;Formato: Inteiro, com até 5 digitos
   * @return numeroItemDue
  **/
  @JsonProperty("numeroItemDue")
  public String getNumeroItemDue() {
    return numeroItemDue;
  }

  public void setNumeroItemDue(String numeroItemDue) {
    this.numeroItemDue = numeroItemDue;
  }

  public ItemDueExigenciaFiscalDTO numeroItemDue(String numeroItemDue) {
    this.numeroItemDue = numeroItemDue;
    return this;
  }

 /**
   * Número&lt;br /&gt;Tamanho: 3,0&lt;br /&gt;Formato: Decimal, com 0 casas decimais.
   * @return numeroItemNotaFiscal
  **/
  @JsonProperty("numeroItemNotaFiscal")
  public String getNumeroItemNotaFiscal() {
    return numeroItemNotaFiscal;
  }

  public void setNumeroItemNotaFiscal(String numeroItemNotaFiscal) {
    this.numeroItemNotaFiscal = numeroItemNotaFiscal;
  }

  public ItemDueExigenciaFiscalDTO numeroItemNotaFiscal(String numeroItemNotaFiscal) {
    this.numeroItemNotaFiscal = numeroItemNotaFiscal;
    return this;
  }

 /**
   * Chave de acesso&lt;br /&gt;Tamanho: 44&lt;br /&gt;Formato: &#39;NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN&#39;
   * @return numeroNotaFiscal
  **/
  @JsonProperty("numeroNotaFiscal")
  public String getNumeroNotaFiscal() {
    return numeroNotaFiscal;
  }

  public void setNumeroNotaFiscal(String numeroNotaFiscal) {
    this.numeroNotaFiscal = numeroNotaFiscal;
  }

  public ItemDueExigenciaFiscalDTO numeroNotaFiscal(String numeroNotaFiscal) {
    this.numeroNotaFiscal = numeroNotaFiscal;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemDueExigenciaFiscalDTO {\n");
    
    sb.append("    codigoNCM: ").append(toIndentedString(codigoNCM)).append("\n");
    sb.append("    descricaoMercadoria: ").append(toIndentedString(descricaoMercadoria)).append("\n");
    sb.append("    numeroItemDue: ").append(toIndentedString(numeroItemDue)).append("\n");
    sb.append("    numeroItemNotaFiscal: ").append(toIndentedString(numeroItemNotaFiscal)).append("\n");
    sb.append("    numeroNotaFiscal: ").append(toIndentedString(numeroNotaFiscal)).append("\n");
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

