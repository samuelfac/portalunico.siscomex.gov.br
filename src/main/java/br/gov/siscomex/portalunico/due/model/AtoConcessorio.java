package br.gov.siscomex.portalunico.due.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "AtoConcessorio", propOrder =
    { "beneficiario", "item", "itemDeDUE", "motivosDeNaoVinculacao", "numero", "quantidadeExportada", "situacao", "tipo", "valorComCoberturaCambial"
})

@XmlRootElement(name="AtoConcessorio")
public class AtoConcessorio  {
  
  @XmlElement(name="beneficiario")
  @ApiModelProperty(value = "")
  @Valid
  private Beneficiario beneficiario = null;

  @XmlElement(name="item")
  @ApiModelProperty(value = "")
  @Valid
  private ItemDoAtoConcessorio item = null;

  @XmlElement(name="itemDeDUE")
  @ApiModelProperty(value = "")
  @Valid
  private ItemDeDUE itemDeDUE = null;

  @XmlElement(name="motivosDeNaoVinculacao")
  @ApiModelProperty(value = "")
  @Valid
  private List<MotivoDeNaoVinculacao> motivosDeNaoVinculacao = null;

  @XmlElement(name="numero")
  @ApiModelProperty(value = "Número <br />Tamanho mínimo: 1<br />Tamanho máximo: 11")
 /**
   * Número <br />Tamanho mínimo: 1<br />Tamanho máximo: 11
  **/
  private String numero = null;

  @XmlElement(name="quantidadeExportada")
  @ApiModelProperty(value = "Quantidade exportada<br />Tamanho: 14,5<br />Formato: Decimal, com até 5 casas decimais separadas por ponto.")
  @Valid
 /**
   * Quantidade exportada<br />Tamanho: 14,5<br />Formato: Decimal, com até 5 casas decimais separadas por ponto.
  **/
  private BigDecimal quantidadeExportada = null;

  @XmlElement(name="situacao")
  @ApiModelProperty(value = "")
  @Valid
  private Situacao situacao = null;

  @XmlElement(name="tipo")
  @ApiModelProperty(value = "")
  @Valid
  private TipoDeAtoConcessorio tipo = null;

  @XmlElement(name="valorComCoberturaCambial")
  @ApiModelProperty(value = "Valor com cobertura cambial<br />Tamanho: 15,2<br />Formato: Decimal, com até 2 casas decimais separadas por ponto.")
  @Valid
 /**
   * Valor com cobertura cambial<br />Tamanho: 15,2<br />Formato: Decimal, com até 2 casas decimais separadas por ponto.
  **/
  private BigDecimal valorComCoberturaCambial = null;
 /**
   * Get beneficiario
   * @return beneficiario
  **/
  @JsonProperty("beneficiario")
  public Beneficiario getBeneficiario() {
    return beneficiario;
  }

  public void setBeneficiario(Beneficiario beneficiario) {
    this.beneficiario = beneficiario;
  }

  public AtoConcessorio beneficiario(Beneficiario beneficiario) {
    this.beneficiario = beneficiario;
    return this;
  }

 /**
   * Get item
   * @return item
  **/
  @JsonProperty("item")
  public ItemDoAtoConcessorio getItem() {
    return item;
  }

  public void setItem(ItemDoAtoConcessorio item) {
    this.item = item;
  }

  public AtoConcessorio item(ItemDoAtoConcessorio item) {
    this.item = item;
    return this;
  }

 /**
   * Get itemDeDUE
   * @return itemDeDUE
  **/
  @JsonProperty("itemDeDUE")
  public ItemDeDUE getItemDeDUE() {
    return itemDeDUE;
  }

  public void setItemDeDUE(ItemDeDUE itemDeDUE) {
    this.itemDeDUE = itemDeDUE;
  }

  public AtoConcessorio itemDeDUE(ItemDeDUE itemDeDUE) {
    this.itemDeDUE = itemDeDUE;
    return this;
  }

 /**
   * Get motivosDeNaoVinculacao
   * @return motivosDeNaoVinculacao
  **/
  @JsonProperty("motivosDeNaoVinculacao")
  public List<MotivoDeNaoVinculacao> getMotivosDeNaoVinculacao() {
    return motivosDeNaoVinculacao;
  }

  public void setMotivosDeNaoVinculacao(List<MotivoDeNaoVinculacao> motivosDeNaoVinculacao) {
    this.motivosDeNaoVinculacao = motivosDeNaoVinculacao;
  }

  public AtoConcessorio motivosDeNaoVinculacao(List<MotivoDeNaoVinculacao> motivosDeNaoVinculacao) {
    this.motivosDeNaoVinculacao = motivosDeNaoVinculacao;
    return this;
  }

  public AtoConcessorio addMotivosDeNaoVinculacaoItem(MotivoDeNaoVinculacao motivosDeNaoVinculacaoItem) {
    this.motivosDeNaoVinculacao.add(motivosDeNaoVinculacaoItem);
    return this;
  }

 /**
   * Número &lt;br /&gt;Tamanho mínimo: 1&lt;br /&gt;Tamanho máximo: 11
   * @return numero
  **/
  @JsonProperty("numero")
  public String getNumero() {
    return numero;
  }

  public void setNumero(String numero) {
    this.numero = numero;
  }

  public AtoConcessorio numero(String numero) {
    this.numero = numero;
    return this;
  }

 /**
   * Quantidade exportada&lt;br /&gt;Tamanho: 14,5&lt;br /&gt;Formato: Decimal, com até 5 casas decimais separadas por ponto.
   * @return quantidadeExportada
  **/
  @JsonProperty("quantidadeExportada")
  public BigDecimal getQuantidadeExportada() {
    return quantidadeExportada;
  }

  public void setQuantidadeExportada(BigDecimal quantidadeExportada) {
    this.quantidadeExportada = quantidadeExportada;
  }

  public AtoConcessorio quantidadeExportada(BigDecimal quantidadeExportada) {
    this.quantidadeExportada = quantidadeExportada;
    return this;
  }

 /**
   * Get situacao
   * @return situacao
  **/
  @JsonProperty("situacao")
  public Situacao getSituacao() {
    return situacao;
  }

  public void setSituacao(Situacao situacao) {
    this.situacao = situacao;
  }

  public AtoConcessorio situacao(Situacao situacao) {
    this.situacao = situacao;
    return this;
  }

 /**
   * Get tipo
   * @return tipo
  **/
  @JsonProperty("tipo")
  public TipoDeAtoConcessorio getTipo() {
    return tipo;
  }

  public void setTipo(TipoDeAtoConcessorio tipo) {
    this.tipo = tipo;
  }

  public AtoConcessorio tipo(TipoDeAtoConcessorio tipo) {
    this.tipo = tipo;
    return this;
  }

 /**
   * Valor com cobertura cambial&lt;br /&gt;Tamanho: 15,2&lt;br /&gt;Formato: Decimal, com até 2 casas decimais separadas por ponto.
   * @return valorComCoberturaCambial
  **/
  @JsonProperty("valorComCoberturaCambial")
  public BigDecimal getValorComCoberturaCambial() {
    return valorComCoberturaCambial;
  }

  public void setValorComCoberturaCambial(BigDecimal valorComCoberturaCambial) {
    this.valorComCoberturaCambial = valorComCoberturaCambial;
  }

  public AtoConcessorio valorComCoberturaCambial(BigDecimal valorComCoberturaCambial) {
    this.valorComCoberturaCambial = valorComCoberturaCambial;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AtoConcessorio {\n");
    
    sb.append("    beneficiario: ").append(toIndentedString(beneficiario)).append("\n");
    sb.append("    item: ").append(toIndentedString(item)).append("\n");
    sb.append("    itemDeDUE: ").append(toIndentedString(itemDeDUE)).append("\n");
    sb.append("    motivosDeNaoVinculacao: ").append(toIndentedString(motivosDeNaoVinculacao)).append("\n");
    sb.append("    numero: ").append(toIndentedString(numero)).append("\n");
    sb.append("    quantidadeExportada: ").append(toIndentedString(quantidadeExportada)).append("\n");
    sb.append("    situacao: ").append(toIndentedString(situacao)).append("\n");
    sb.append("    tipo: ").append(toIndentedString(tipo)).append("\n");
    sb.append("    valorComCoberturaCambial: ").append(toIndentedString(valorComCoberturaCambial)).append("\n");
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

