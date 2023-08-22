package br.gov.siscomex.portalunico.duimp.model;

import br.gov.siscomex.portalunico.duimp.model.CaracterizacaoImportacaoCover;
import br.gov.siscomex.portalunico.duimp.model.CertificadoMercosul;
import br.gov.siscomex.portalunico.duimp.model.CondicaoVendaMercadoriaCover;
import br.gov.siscomex.portalunico.duimp.model.DadosCambiaisCover;
import br.gov.siscomex.portalunico.duimp.model.DeclaracaoVinculada;
import br.gov.siscomex.portalunico.duimp.model.ExportadorEstrangeiroCover;
import br.gov.siscomex.portalunico.duimp.model.InformacaoComplementarCover;
import br.gov.siscomex.portalunico.duimp.model.ItemInfoAdicinaisCover;
import br.gov.siscomex.portalunico.duimp.model.ItemLpcoCover;
import br.gov.siscomex.portalunico.duimp.model.ItemTributoCover;
import br.gov.siscomex.portalunico.duimp.model.ProdutoCover;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
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
 @XmlType(name = "ItemCover", propOrder =
    { "numeroItem", "caracterizacaoImportacao", "dadosProduto", "dadosExportadorEstrangeiro", "informacoesComplementares", "declaracoesExportacaoEstrangeira", "declaracoesVinculadas", "condicaoVendaMercadoria", "dadosCambiais", "itemTributo", "lpcos", "informacoesAdicionais"
})

@XmlRootElement(name="ItemCover")
/**
  * Dados de um dos itens da Duimp
 **/
@ApiModel(description="Dados de um dos itens da Duimp")
public class ItemCover  {
  
  @XmlElement(name="numeroItem")
  @ApiModelProperty(example = "00001", value = "Número do item<br>Formato: Inteiro, com até 5 digitos<br>Valor mínimo: 1<br>Valor máximo: 99999")
 /**
   * Número do item<br>Formato: Inteiro, com até 5 digitos<br>Valor mínimo: 1<br>Valor máximo: 99999
  **/
  private String numeroItem = null;

  @XmlElement(name="caracterizacaoImportacao", required = true)
  @ApiModelProperty(required = true, value = "")
  @Valid
  private CaracterizacaoImportacaoCover caracterizacaoImportacao = null;

  @XmlElement(name="dadosProduto", required = true)
  @ApiModelProperty(required = true, value = "")
  @Valid
  private ProdutoCover dadosProduto = null;

  @XmlElement(name="dadosExportadorEstrangeiro")
  @ApiModelProperty(value = "")
  @Valid
  private ExportadorEstrangeiroCover dadosExportadorEstrangeiro = null;

  @XmlElement(name="informacoesComplementares")
  @ApiModelProperty(value = "")
  @Valid
  private InformacaoComplementarCover informacoesComplementares = null;

  @XmlElement(name="declaracoesExportacaoEstrangeira")
  @ApiModelProperty(value = "Lista de declarações estrangeiras")
  @Valid
 /**
   * Lista de declarações estrangeiras
  **/
  private List<CertificadoMercosul> declaracoesExportacaoEstrangeira = null;

  @XmlElement(name="declaracoesVinculadas")
  @ApiModelProperty(value = "lista de declarações vinculadas")
  @Valid
 /**
   * lista de declarações vinculadas
  **/
  private List<DeclaracaoVinculada> declaracoesVinculadas = null;

  @XmlElement(name="condicaoVendaMercadoria")
  @ApiModelProperty(value = "")
  @Valid
  private CondicaoVendaMercadoriaCover condicaoVendaMercadoria = null;

  @XmlElement(name="dadosCambiais", required = true)
  @ApiModelProperty(required = true, value = "")
  @Valid
  private DadosCambiaisCover dadosCambiais = null;

  @XmlElement(name="itemTributo", required = true)
  @ApiModelProperty(required = true, value = "")
  @Valid
  private ItemTributoCover itemTributo = null;

  @XmlElement(name="lpcos")
  @ApiModelProperty(value = "Lista de LPCOs do item")
  @Valid
 /**
   * Lista de LPCOs do item
  **/
  private List<ItemLpcoCover> lpcos = null;

  @XmlElement(name="informacoesAdicionais", required = true)
  @ApiModelProperty(required = true, value = "")
  @Valid
  private ItemInfoAdicinaisCover informacoesAdicionais = null;
 /**
   * Número do item&lt;br&gt;Formato: Inteiro, com até 5 digitos&lt;br&gt;Valor mínimo: 1&lt;br&gt;Valor máximo: 99999
   * @return numeroItem
  **/
  @JsonProperty("numeroItem")
  public String getNumeroItem() {
    return numeroItem;
  }

  public void setNumeroItem(String numeroItem) {
    this.numeroItem = numeroItem;
  }

  public ItemCover numeroItem(String numeroItem) {
    this.numeroItem = numeroItem;
    return this;
  }

 /**
   * Get caracterizacaoImportacao
   * @return caracterizacaoImportacao
  **/
  @JsonProperty("caracterizacaoImportacao")
  @NotNull
  public CaracterizacaoImportacaoCover getCaracterizacaoImportacao() {
    return caracterizacaoImportacao;
  }

  public void setCaracterizacaoImportacao(CaracterizacaoImportacaoCover caracterizacaoImportacao) {
    this.caracterizacaoImportacao = caracterizacaoImportacao;
  }

  public ItemCover caracterizacaoImportacao(CaracterizacaoImportacaoCover caracterizacaoImportacao) {
    this.caracterizacaoImportacao = caracterizacaoImportacao;
    return this;
  }

 /**
   * Get dadosProduto
   * @return dadosProduto
  **/
  @JsonProperty("dadosProduto")
  @NotNull
  public ProdutoCover getDadosProduto() {
    return dadosProduto;
  }

  public void setDadosProduto(ProdutoCover dadosProduto) {
    this.dadosProduto = dadosProduto;
  }

  public ItemCover dadosProduto(ProdutoCover dadosProduto) {
    this.dadosProduto = dadosProduto;
    return this;
  }

 /**
   * Get dadosExportadorEstrangeiro
   * @return dadosExportadorEstrangeiro
  **/
  @JsonProperty("dadosExportadorEstrangeiro")
  public ExportadorEstrangeiroCover getDadosExportadorEstrangeiro() {
    return dadosExportadorEstrangeiro;
  }

  public void setDadosExportadorEstrangeiro(ExportadorEstrangeiroCover dadosExportadorEstrangeiro) {
    this.dadosExportadorEstrangeiro = dadosExportadorEstrangeiro;
  }

  public ItemCover dadosExportadorEstrangeiro(ExportadorEstrangeiroCover dadosExportadorEstrangeiro) {
    this.dadosExportadorEstrangeiro = dadosExportadorEstrangeiro;
    return this;
  }

 /**
   * Get informacoesComplementares
   * @return informacoesComplementares
  **/
  @JsonProperty("informacoesComplementares")
  public InformacaoComplementarCover getInformacoesComplementares() {
    return informacoesComplementares;
  }

  public void setInformacoesComplementares(InformacaoComplementarCover informacoesComplementares) {
    this.informacoesComplementares = informacoesComplementares;
  }

  public ItemCover informacoesComplementares(InformacaoComplementarCover informacoesComplementares) {
    this.informacoesComplementares = informacoesComplementares;
    return this;
  }

 /**
   * Lista de declarações estrangeiras
   * @return declaracoesExportacaoEstrangeira
  **/
  @JsonProperty("declaracoesExportacaoEstrangeira")
  public List<CertificadoMercosul> getDeclaracoesExportacaoEstrangeira() {
    return declaracoesExportacaoEstrangeira;
  }

  public void setDeclaracoesExportacaoEstrangeira(List<CertificadoMercosul> declaracoesExportacaoEstrangeira) {
    this.declaracoesExportacaoEstrangeira = declaracoesExportacaoEstrangeira;
  }

  public ItemCover declaracoesExportacaoEstrangeira(List<CertificadoMercosul> declaracoesExportacaoEstrangeira) {
    this.declaracoesExportacaoEstrangeira = declaracoesExportacaoEstrangeira;
    return this;
  }

  public ItemCover addDeclaracoesExportacaoEstrangeiraItem(CertificadoMercosul declaracoesExportacaoEstrangeiraItem) {
    this.declaracoesExportacaoEstrangeira.add(declaracoesExportacaoEstrangeiraItem);
    return this;
  }

 /**
   * lista de declarações vinculadas
   * @return declaracoesVinculadas
  **/
  @JsonProperty("declaracoesVinculadas")
  public List<DeclaracaoVinculada> getDeclaracoesVinculadas() {
    return declaracoesVinculadas;
  }

  public void setDeclaracoesVinculadas(List<DeclaracaoVinculada> declaracoesVinculadas) {
    this.declaracoesVinculadas = declaracoesVinculadas;
  }

  public ItemCover declaracoesVinculadas(List<DeclaracaoVinculada> declaracoesVinculadas) {
    this.declaracoesVinculadas = declaracoesVinculadas;
    return this;
  }

  public ItemCover addDeclaracoesVinculadasItem(DeclaracaoVinculada declaracoesVinculadasItem) {
    this.declaracoesVinculadas.add(declaracoesVinculadasItem);
    return this;
  }

 /**
   * Get condicaoVendaMercadoria
   * @return condicaoVendaMercadoria
  **/
  @JsonProperty("condicaoVendaMercadoria")
  public CondicaoVendaMercadoriaCover getCondicaoVendaMercadoria() {
    return condicaoVendaMercadoria;
  }

  public void setCondicaoVendaMercadoria(CondicaoVendaMercadoriaCover condicaoVendaMercadoria) {
    this.condicaoVendaMercadoria = condicaoVendaMercadoria;
  }

  public ItemCover condicaoVendaMercadoria(CondicaoVendaMercadoriaCover condicaoVendaMercadoria) {
    this.condicaoVendaMercadoria = condicaoVendaMercadoria;
    return this;
  }

 /**
   * Get dadosCambiais
   * @return dadosCambiais
  **/
  @JsonProperty("dadosCambiais")
  @NotNull
  public DadosCambiaisCover getDadosCambiais() {
    return dadosCambiais;
  }

  public void setDadosCambiais(DadosCambiaisCover dadosCambiais) {
    this.dadosCambiais = dadosCambiais;
  }

  public ItemCover dadosCambiais(DadosCambiaisCover dadosCambiais) {
    this.dadosCambiais = dadosCambiais;
    return this;
  }

 /**
   * Get itemTributo
   * @return itemTributo
  **/
  @JsonProperty("itemTributo")
  @NotNull
  public ItemTributoCover getItemTributo() {
    return itemTributo;
  }

  public void setItemTributo(ItemTributoCover itemTributo) {
    this.itemTributo = itemTributo;
  }

  public ItemCover itemTributo(ItemTributoCover itemTributo) {
    this.itemTributo = itemTributo;
    return this;
  }

 /**
   * Lista de LPCOs do item
   * @return lpcos
  **/
  @JsonProperty("lpcos")
  public List<ItemLpcoCover> getLpcos() {
    return lpcos;
  }

  public void setLpcos(List<ItemLpcoCover> lpcos) {
    this.lpcos = lpcos;
  }

  public ItemCover lpcos(List<ItemLpcoCover> lpcos) {
    this.lpcos = lpcos;
    return this;
  }

  public ItemCover addLpcosItem(ItemLpcoCover lpcosItem) {
    this.lpcos.add(lpcosItem);
    return this;
  }

 /**
   * Get informacoesAdicionais
   * @return informacoesAdicionais
  **/
  @JsonProperty("informacoesAdicionais")
  @NotNull
  public ItemInfoAdicinaisCover getInformacoesAdicionais() {
    return informacoesAdicionais;
  }

  public void setInformacoesAdicionais(ItemInfoAdicinaisCover informacoesAdicionais) {
    this.informacoesAdicionais = informacoesAdicionais;
  }

  public ItemCover informacoesAdicionais(ItemInfoAdicinaisCover informacoesAdicionais) {
    this.informacoesAdicionais = informacoesAdicionais;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemCover {\n");
    
    sb.append("    numeroItem: ").append(toIndentedString(numeroItem)).append("\n");
    sb.append("    caracterizacaoImportacao: ").append(toIndentedString(caracterizacaoImportacao)).append("\n");
    sb.append("    dadosProduto: ").append(toIndentedString(dadosProduto)).append("\n");
    sb.append("    dadosExportadorEstrangeiro: ").append(toIndentedString(dadosExportadorEstrangeiro)).append("\n");
    sb.append("    informacoesComplementares: ").append(toIndentedString(informacoesComplementares)).append("\n");
    sb.append("    declaracoesExportacaoEstrangeira: ").append(toIndentedString(declaracoesExportacaoEstrangeira)).append("\n");
    sb.append("    declaracoesVinculadas: ").append(toIndentedString(declaracoesVinculadas)).append("\n");
    sb.append("    condicaoVendaMercadoria: ").append(toIndentedString(condicaoVendaMercadoria)).append("\n");
    sb.append("    dadosCambiais: ").append(toIndentedString(dadosCambiais)).append("\n");
    sb.append("    itemTributo: ").append(toIndentedString(itemTributo)).append("\n");
    sb.append("    lpcos: ").append(toIndentedString(lpcos)).append("\n");
    sb.append("    informacoesAdicionais: ").append(toIndentedString(informacoesAdicionais)).append("\n");
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

