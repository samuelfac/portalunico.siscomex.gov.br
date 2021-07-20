package br.gov.siscomex.portalunico.duimp_api.model;

import java.util.List;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "ItemConsultaCover", propOrder =
    { "status", "identificacao", "produto", "caracterizacaoImportacao", "indicadorExportadorFabricante", "fabricante", "exportador", "indicadorCompradorVendedor", "mercadoria", "condicaoVenda", "lpcos", "certificadoMercosul", "documentosVinculados", "dadosCambiais", "atributos", "tributos"
})

@XmlRootElement(name="ItemConsultaCover")
public class ItemConsultaCover  {
  

@XmlType(name="StatusEnum")
@XmlEnum(String.class)
public enum StatusEnum {

	@XmlEnumValue("ATIVO")
	@JsonProperty("ATIVO")
	ATIVO(String.valueOf("ATIVO")),
	
	@XmlEnumValue("INATIVO")
	@JsonProperty("INATIVO")
	INATIVO(String.valueOf("INATIVO"));


    private String value;

    StatusEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static StatusEnum fromValue(String v) {
        for (StatusEnum b : StatusEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to StatusEnum");
    }
}

  @XmlElement(name="status")
  @ApiModelProperty(example = "ATIVO", value = "Indicador da situação do item associado à versão da Duimp consultada (ativo ou inativo).<br>Domínio:")
 /**
   * Indicador da situação do item associado à versão da Duimp consultada (ativo ou inativo).<br>Domínio:
  **/
  private StatusEnum status = null;

  @XmlElement(name="identificacao")
  @ApiModelProperty(value = "")
  @Valid
  private IdentificadorItemDuimpCover identificacao = null;

  @XmlElement(name="produto")
  @ApiModelProperty(value = "")
  @Valid
  private ProdutoConsultaItemCover produto = null;

  @XmlElement(name="caracterizacaoImportacao")
  @ApiModelProperty(value = "")
  @Valid
  private CaracterizacaoImportacaoConsultaItemCover caracterizacaoImportacao = null;

  @XmlElement(name="indicadorExportadorFabricante")
  @ApiModelProperty(value = "")
  @Valid
  private IndicadorExportadorFabricanteCover indicadorExportadorFabricante = null;

  @XmlElement(name="fabricante")
  @ApiModelProperty(value = "")
  @Valid
  private FabricanteCover fabricante = null;

  @XmlElement(name="exportador")
  @ApiModelProperty(value = "")
  @Valid
  private ExportadorCover exportador = null;

  @XmlElement(name="indicadorCompradorVendedor")
  @ApiModelProperty(value = "")
  @Valid
  private IndicadorCompradorVendedorCover indicadorCompradorVendedor = null;

  @XmlElement(name="mercadoria")
  @ApiModelProperty(value = "")
  @Valid
  private MercadoriaCover mercadoria = null;

  @XmlElement(name="condicaoVenda")
  @ApiModelProperty(value = "")
  @Valid
  private CondicaoVendaConsultaItemCover condicaoVenda = null;

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

  @XmlElement(name="dadosCambiais")
  @ApiModelProperty(value = "")
  @Valid
  private DadosCambiaisCover dadosCambiais = null;

  @XmlElement(name="atributos")
  @ApiModelProperty(value = "")
  @Valid
  private List<AtributoItemCover> atributos = null;

  @XmlElement(name="tributos")
  @ApiModelProperty(value = "")
  @Valid
  private TributosConsultaItemCover tributos = null;
 /**
   * Indicador da situação do item associado à versão da Duimp consultada (ativo ou inativo).&lt;br&gt;Domínio:
   * @return status
  **/
  @JsonProperty("status")
  public String getStatus() {
    if (status == null) {
      return null;
    }
    return status.value();
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public ItemConsultaCover status(StatusEnum status) {
    this.status = status;
    return this;
  }

 /**
   * Get identificacao
   * @return identificacao
  **/
  @JsonProperty("identificacao")
  public IdentificadorItemDuimpCover getIdentificacao() {
    return identificacao;
  }

  public void setIdentificacao(IdentificadorItemDuimpCover identificacao) {
    this.identificacao = identificacao;
  }

  public ItemConsultaCover identificacao(IdentificadorItemDuimpCover identificacao) {
    this.identificacao = identificacao;
    return this;
  }

 /**
   * Get produto
   * @return produto
  **/
  @JsonProperty("produto")
  public ProdutoConsultaItemCover getProduto() {
    return produto;
  }

  public void setProduto(ProdutoConsultaItemCover produto) {
    this.produto = produto;
  }

  public ItemConsultaCover produto(ProdutoConsultaItemCover produto) {
    this.produto = produto;
    return this;
  }

 /**
   * Get caracterizacaoImportacao
   * @return caracterizacaoImportacao
  **/
  @JsonProperty("caracterizacaoImportacao")
  public CaracterizacaoImportacaoConsultaItemCover getCaracterizacaoImportacao() {
    return caracterizacaoImportacao;
  }

  public void setCaracterizacaoImportacao(CaracterizacaoImportacaoConsultaItemCover caracterizacaoImportacao) {
    this.caracterizacaoImportacao = caracterizacaoImportacao;
  }

  public ItemConsultaCover caracterizacaoImportacao(CaracterizacaoImportacaoConsultaItemCover caracterizacaoImportacao) {
    this.caracterizacaoImportacao = caracterizacaoImportacao;
    return this;
  }

 /**
   * Get indicadorExportadorFabricante
   * @return indicadorExportadorFabricante
  **/
  @JsonProperty("indicadorExportadorFabricante")
  public IndicadorExportadorFabricanteCover getIndicadorExportadorFabricante() {
    return indicadorExportadorFabricante;
  }

  public void setIndicadorExportadorFabricante(IndicadorExportadorFabricanteCover indicadorExportadorFabricante) {
    this.indicadorExportadorFabricante = indicadorExportadorFabricante;
  }

  public ItemConsultaCover indicadorExportadorFabricante(IndicadorExportadorFabricanteCover indicadorExportadorFabricante) {
    this.indicadorExportadorFabricante = indicadorExportadorFabricante;
    return this;
  }

 /**
   * Get fabricante
   * @return fabricante
  **/
  @JsonProperty("fabricante")
  public FabricanteCover getFabricante() {
    return fabricante;
  }

  public void setFabricante(FabricanteCover fabricante) {
    this.fabricante = fabricante;
  }

  public ItemConsultaCover fabricante(FabricanteCover fabricante) {
    this.fabricante = fabricante;
    return this;
  }

 /**
   * Get exportador
   * @return exportador
  **/
  @JsonProperty("exportador")
  public ExportadorCover getExportador() {
    return exportador;
  }

  public void setExportador(ExportadorCover exportador) {
    this.exportador = exportador;
  }

  public ItemConsultaCover exportador(ExportadorCover exportador) {
    this.exportador = exportador;
    return this;
  }

 /**
   * Get indicadorCompradorVendedor
   * @return indicadorCompradorVendedor
  **/
  @JsonProperty("indicadorCompradorVendedor")
  public IndicadorCompradorVendedorCover getIndicadorCompradorVendedor() {
    return indicadorCompradorVendedor;
  }

  public void setIndicadorCompradorVendedor(IndicadorCompradorVendedorCover indicadorCompradorVendedor) {
    this.indicadorCompradorVendedor = indicadorCompradorVendedor;
  }

  public ItemConsultaCover indicadorCompradorVendedor(IndicadorCompradorVendedorCover indicadorCompradorVendedor) {
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

  public ItemConsultaCover mercadoria(MercadoriaCover mercadoria) {
    this.mercadoria = mercadoria;
    return this;
  }

 /**
   * Get condicaoVenda
   * @return condicaoVenda
  **/
  @JsonProperty("condicaoVenda")
  public CondicaoVendaConsultaItemCover getCondicaoVenda() {
    return condicaoVenda;
  }

  public void setCondicaoVenda(CondicaoVendaConsultaItemCover condicaoVenda) {
    this.condicaoVenda = condicaoVenda;
  }

  public ItemConsultaCover condicaoVenda(CondicaoVendaConsultaItemCover condicaoVenda) {
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

  public ItemConsultaCover lpcos(List<LpcoCover> lpcos) {
    this.lpcos = lpcos;
    return this;
  }

  public ItemConsultaCover addLpcosItem(LpcoCover lpcosItem) {
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

  public ItemConsultaCover certificadoMercosul(List<CertificadoMercosulCover> certificadoMercosul) {
    this.certificadoMercosul = certificadoMercosul;
    return this;
  }

  public ItemConsultaCover addCertificadoMercosulItem(CertificadoMercosulCover certificadoMercosulItem) {
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

  public ItemConsultaCover documentosVinculados(List<DocumentoVinculadoCover> documentosVinculados) {
    this.documentosVinculados = documentosVinculados;
    return this;
  }

  public ItemConsultaCover addDocumentosVinculadosItem(DocumentoVinculadoCover documentosVinculadosItem) {
    this.documentosVinculados.add(documentosVinculadosItem);
    return this;
  }

 /**
   * Get dadosCambiais
   * @return dadosCambiais
  **/
  @JsonProperty("dadosCambiais")
  public DadosCambiaisCover getDadosCambiais() {
    return dadosCambiais;
  }

  public void setDadosCambiais(DadosCambiaisCover dadosCambiais) {
    this.dadosCambiais = dadosCambiais;
  }

  public ItemConsultaCover dadosCambiais(DadosCambiaisCover dadosCambiais) {
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

  public ItemConsultaCover atributos(List<AtributoItemCover> atributos) {
    this.atributos = atributos;
    return this;
  }

  public ItemConsultaCover addAtributosItem(AtributoItemCover atributosItem) {
    this.atributos.add(atributosItem);
    return this;
  }

 /**
   * Get tributos
   * @return tributos
  **/
  @JsonProperty("tributos")
  public TributosConsultaItemCover getTributos() {
    return tributos;
  }

  public void setTributos(TributosConsultaItemCover tributos) {
    this.tributos = tributos;
  }

  public ItemConsultaCover tributos(TributosConsultaItemCover tributos) {
    this.tributos = tributos;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemConsultaCover {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

