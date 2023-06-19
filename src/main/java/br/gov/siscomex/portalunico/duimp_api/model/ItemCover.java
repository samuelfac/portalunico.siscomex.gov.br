package br.gov.siscomex.portalunico.duimp_api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.*;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "ItemCover", propOrder =
    { "identificacao", "produto", "caracterizacaoImportacao", "indicadorExportadorFabricante", "fabricante", "exportador", "indicadorCompradorVendedor", "mercadoria", "condicaoVenda", "lpcos", "certificadoMercosul", "documentosVinculados", "dadosCambiais", "atributos", "tributos"
})

@XmlRootElement(name="ItemCover")
/**
  * Dados do item da Duimp.
 **/
@ApiModel(description="Dados do item da Duimp.")
public class ItemCover  {
  
  @XmlElement(name="identificacao", required = true)
  @ApiModelProperty(required = true, value = "")
  @Valid
  private IdentificacaoItemCover identificacao = null;

  @XmlElement(name="produto", required = true)
  @ApiModelProperty(required = true, value = "")
  @Valid
  private ProdutoCover produto = null;

  @XmlElement(name="caracterizacaoImportacao", required = true)
  @ApiModelProperty(required = true, value = "")
  @Valid
  private CaracterizacaoImportacaoCover caracterizacaoImportacao = null;

  @XmlElement(name="indicadorExportadorFabricante", required = true)
  @ApiModelProperty(required = true, value = "")
  @Valid
  private IndicadorExportadorFabricanteCover indicadorExportadorFabricante = null;

  @XmlElement(name="fabricante", required = true)
  @ApiModelProperty(required = true, value = "")
  @Valid
  private FabricanteCover fabricante = null;

  @XmlElement(name="exportador", required = true)
  @ApiModelProperty(required = true, value = "")
  @Valid
  private ExportadorCover exportador = null;

  @XmlElement(name="indicadorCompradorVendedor", required = true)
  @ApiModelProperty(required = true, value = "")
  @Valid
  private IndicadorCompradorVendedorCover indicadorCompradorVendedor = null;

  @XmlElement(name="mercadoria")
  @ApiModelProperty(value = "")
  @Valid
  private MercadoriaCover mercadoria = null;

  @XmlElement(name="condicaoVenda")
  @ApiModelProperty(value = "")
  @Valid
  private CondicaoVendaCover condicaoVenda = null;

  @XmlElement(name="lpcos")
  @ApiModelProperty(value = "")
  @Valid
  private List<LpcoCover> lpcos = null;

  @XmlElement(name="certificadoMercosul")
  @ApiModelProperty(value = "")
  @Valid
  private List<CertificadoMercosulCover> certificadoMercosul = null;

  @XmlElement(name="documentosVinculados")
  @ApiModelProperty(value = "")
  @Valid
  private List<DocumentoVinculadoCover> documentosVinculados = null;

  @XmlElement(name="dadosCambiais", required = true)
  @ApiModelProperty(required = true, value = "")
  @Valid
  private DadosCambiaisCover dadosCambiais = null;

  @XmlElement(name="atributos")
  @ApiModelProperty(value = "")
  @Valid
  private List<AtributoItemCover> atributos = null;

  @XmlElement(name="tributos")
  @ApiModelProperty(value = "")
  @Valid
  private List<TributoItemCover> tributos = null;
 /**
   * Get identificacao
   * @return identificacao
  **/
  @JsonProperty("identificacao")
  @NotNull
  public IdentificacaoItemCover getIdentificacao() {
    return identificacao;
  }

  public void setIdentificacao(IdentificacaoItemCover identificacao) {
    this.identificacao = identificacao;
  }

  public ItemCover identificacao(IdentificacaoItemCover identificacao) {
    this.identificacao = identificacao;
    return this;
  }

 /**
   * Get produto
   * @return produto
  **/
  @JsonProperty("produto")
  @NotNull
  public ProdutoCover getProduto() {
    return produto;
  }

  public void setProduto(ProdutoCover produto) {
    this.produto = produto;
  }

  public ItemCover produto(ProdutoCover produto) {
    this.produto = produto;
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
   * Get indicadorExportadorFabricante
   * @return indicadorExportadorFabricante
  **/
  @JsonProperty("indicadorExportadorFabricante")
  @NotNull
  public IndicadorExportadorFabricanteCover getIndicadorExportadorFabricante() {
    return indicadorExportadorFabricante;
  }

  public void setIndicadorExportadorFabricante(IndicadorExportadorFabricanteCover indicadorExportadorFabricante) {
    this.indicadorExportadorFabricante = indicadorExportadorFabricante;
  }

  public ItemCover indicadorExportadorFabricante(IndicadorExportadorFabricanteCover indicadorExportadorFabricante) {
    this.indicadorExportadorFabricante = indicadorExportadorFabricante;
    return this;
  }

 /**
   * Get fabricante
   * @return fabricante
  **/
  @JsonProperty("fabricante")
  @NotNull
  public FabricanteCover getFabricante() {
    return fabricante;
  }

  public void setFabricante(FabricanteCover fabricante) {
    this.fabricante = fabricante;
  }

  public ItemCover fabricante(FabricanteCover fabricante) {
    this.fabricante = fabricante;
    return this;
  }

 /**
   * Get exportador
   * @return exportador
  **/
  @JsonProperty("exportador")
  @NotNull
  public ExportadorCover getExportador() {
    return exportador;
  }

  public void setExportador(ExportadorCover exportador) {
    this.exportador = exportador;
  }

  public ItemCover exportador(ExportadorCover exportador) {
    this.exportador = exportador;
    return this;
  }

 /**
   * Get indicadorCompradorVendedor
   * @return indicadorCompradorVendedor
  **/
  @JsonProperty("indicadorCompradorVendedor")
  @NotNull
  public IndicadorCompradorVendedorCover getIndicadorCompradorVendedor() {
    return indicadorCompradorVendedor;
  }

  public void setIndicadorCompradorVendedor(IndicadorCompradorVendedorCover indicadorCompradorVendedor) {
    this.indicadorCompradorVendedor = indicadorCompradorVendedor;
  }

  public ItemCover indicadorCompradorVendedor(IndicadorCompradorVendedorCover indicadorCompradorVendedor) {
    this.indicadorCompradorVendedor = indicadorCompradorVendedor;
    return this;
  }

 /**
   * Get mercadoria
   * @return mercadoria
  **/
  @JsonProperty("mercadoria")
  public MercadoriaCover getMercadoria() {
    return mercadoria;
  }

  public void setMercadoria(MercadoriaCover mercadoria) {
    this.mercadoria = mercadoria;
  }

  public ItemCover mercadoria(MercadoriaCover mercadoria) {
    this.mercadoria = mercadoria;
    return this;
  }

 /**
   * Get condicaoVenda
   * @return condicaoVenda
  **/
  @JsonProperty("condicaoVenda")
  public CondicaoVendaCover getCondicaoVenda() {
    return condicaoVenda;
  }

  public void setCondicaoVenda(CondicaoVendaCover condicaoVenda) {
    this.condicaoVenda = condicaoVenda;
  }

  public ItemCover condicaoVenda(CondicaoVendaCover condicaoVenda) {
    this.condicaoVenda = condicaoVenda;
    return this;
  }

 /**
   * Get lpcos
   * @return lpcos
  **/
  @JsonProperty("lpcos")
  public List<LpcoCover> getLpcos() {
    return lpcos;
  }

  public void setLpcos(List<LpcoCover> lpcos) {
    this.lpcos = lpcos;
  }

  public ItemCover lpcos(List<LpcoCover> lpcos) {
    this.lpcos = lpcos;
    return this;
  }

  public ItemCover addLpcosItem(LpcoCover lpcosItem) {
    this.lpcos.add(lpcosItem);
    return this;
  }

 /**
   * Get certificadoMercosul
   * @return certificadoMercosul
  **/
  @JsonProperty("certificadoMercosul")
  public List<CertificadoMercosulCover> getCertificadoMercosul() {
    return certificadoMercosul;
  }

  public void setCertificadoMercosul(List<CertificadoMercosulCover> certificadoMercosul) {
    this.certificadoMercosul = certificadoMercosul;
  }

  public ItemCover certificadoMercosul(List<CertificadoMercosulCover> certificadoMercosul) {
    this.certificadoMercosul = certificadoMercosul;
    return this;
  }

  public ItemCover addCertificadoMercosulItem(CertificadoMercosulCover certificadoMercosulItem) {
    this.certificadoMercosul.add(certificadoMercosulItem);
    return this;
  }

 /**
   * Get documentosVinculados
   * @return documentosVinculados
  **/
  @JsonProperty("documentosVinculados")
  public List<DocumentoVinculadoCover> getDocumentosVinculados() {
    return documentosVinculados;
  }

  public void setDocumentosVinculados(List<DocumentoVinculadoCover> documentosVinculados) {
    this.documentosVinculados = documentosVinculados;
  }

  public ItemCover documentosVinculados(List<DocumentoVinculadoCover> documentosVinculados) {
    this.documentosVinculados = documentosVinculados;
    return this;
  }

  public ItemCover addDocumentosVinculadosItem(DocumentoVinculadoCover documentosVinculadosItem) {
    this.documentosVinculados.add(documentosVinculadosItem);
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
   * Get atributos
   * @return atributos
  **/
  @JsonProperty("atributos")
  public List<AtributoItemCover> getAtributos() {
    return atributos;
  }

  public void setAtributos(List<AtributoItemCover> atributos) {
    this.atributos = atributos;
  }

  public ItemCover atributos(List<AtributoItemCover> atributos) {
    this.atributos = atributos;
    return this;
  }

  public ItemCover addAtributosItem(AtributoItemCover atributosItem) {
    this.atributos.add(atributosItem);
    return this;
  }

 /**
   * Get tributos
   * @return tributos
  **/
  @JsonProperty("tributos")
  public List<TributoItemCover> getTributos() {
    return tributos;
  }

  public void setTributos(List<TributoItemCover> tributos) {
    this.tributos = tributos;
  }

  public ItemCover tributos(List<TributoItemCover> tributos) {
    this.tributos = tributos;
    return this;
  }

  public ItemCover addTributosItem(TributoItemCover tributosItem) {
    this.tributos.add(tributosItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemCover {\n");
    
    sb.append("    identificacao: ").append(toIndentedString(identificacao)).append("\n");
    sb.append("    produto: ").append(toIndentedString(produto)).append("\n");
    sb.append("    caracterizacaoImportacao: ").append(toIndentedString(caracterizacaoImportacao)).append("\n");
    sb.append("    indicadorExportadorFabricante: ").append(toIndentedString(indicadorExportadorFabricante)).append("\n");
    sb.append("    fabricante: ").append(toIndentedString(fabricante)).append("\n");
    sb.append("    exportador: ").append(toIndentedString(exportador)).append("\n");
    sb.append("    indicadorCompradorVendedor: ").append(toIndentedString(indicadorCompradorVendedor)).append("\n");
    sb.append("    mercadoria: ").append(toIndentedString(mercadoria)).append("\n");
    sb.append("    condicaoVenda: ").append(toIndentedString(condicaoVenda)).append("\n");
    sb.append("    lpcos: ").append(toIndentedString(lpcos)).append("\n");
    sb.append("    certificadoMercosul: ").append(toIndentedString(certificadoMercosul)).append("\n");
    sb.append("    documentosVinculados: ").append(toIndentedString(documentosVinculados)).append("\n");
    sb.append("    dadosCambiais: ").append(toIndentedString(dadosCambiais)).append("\n");
    sb.append("    atributos: ").append(toIndentedString(atributos)).append("\n");
    sb.append("    tributos: ").append(toIndentedString(tributos)).append("\n");
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

