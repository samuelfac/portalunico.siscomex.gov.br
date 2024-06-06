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
import java.time.OffsetDateTime;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "ItemDUERemoteDTO", propOrder =
    { "atributoDestaqueNcmBD", "atributos", "calculoTributario", "codigoCondicaoVenda", "dataDeConversao", "descricaoComplementar", "descricaoDaMercadoria", "documentosDeTransformacao", "documentosImportacao", "enderecoImportador", "exportacaoTemporaria", "exportador", "itemDaNotaFiscalDeExportacao", "itensDaNotaDeRemessa", "itensDeNotaComplementar", "listaDeEnquadramentos", "listaPaisDestino", "motivoDoTratamentoPrioritario", "ncm", "nomeImportador", "numero", "percentualDeComissaoDoAgente", "pesoLiquidoTotal", "quantidadeNaUnidadeComercializada", "quantidadeNaUnidadeEstatistica", "tratamentosAdministrativos", "unidadeComercializada", "valorDaMercadoriaNaCondicaoDeVenda", "valorDaMercadoriaNaCondicaoDeVendaEmReais", "valorDaMercadoriaNoLocalDeEmbarque", "valorDaMercadoriaNoLocalDeEmbarqueEmReais", "valorFinanciado", "valorTotal"
})

@XmlRootElement(name="ItemDUERemoteDTO")
public class ItemDUERemoteDTO  {
  
  @XmlElement(name="atributoDestaqueNcmBD")
  @ApiModelProperty(example = "01", value = "Atributo de destaque da NCM<br />Tamanho: 2<br />Formato: 'NN'")
 /**
   * Atributo de destaque da NCM<br />Tamanho: 2<br />Formato: 'NN'
  **/
  private String atributoDestaqueNcmBD = null;

  @XmlElement(name="atributos")
  @ApiModelProperty(value = "")
  @Valid
  private List<AtributoDto> atributos = null;

  @XmlElement(name="calculoTributario")
  @ApiModelProperty(value = "")
  @Valid
  private CalculoTributarioDto calculoTributario = null;

  @XmlElement(name="codigoCondicaoVenda")
  @ApiModelProperty(value = "")
  @Valid
  private CondicaoVendaDTO codigoCondicaoVenda = null;

  @XmlElement(name="dataDeConversao")
  @ApiModelProperty(example = "2019-09-20T14:13:46.966Z", value = "Data de conversão<br />Formato:'yyyy-MM-dd'T'HH:mm:ss.SSSZ'")
 /**
   * Data de conversão<br />Formato:'yyyy-MM-dd'T'HH:mm:ss.SSSZ'
  **/
  private OffsetDateTime dataDeConversao = null;

  @XmlElement(name="descricaoComplementar")
  @ApiModelProperty(value = "Descrição complementar<br />Tamanho mínimo: 0<br />Tamanho máximo: 2000")
 /**
   * Descrição complementar<br />Tamanho mínimo: 0<br />Tamanho máximo: 2000
  **/
  private String descricaoComplementar = null;

  @XmlElement(name="descricaoDaMercadoria")
  @ApiModelProperty(value = "Descrição da Mercadoria<br />Tamanho mínimo: 0<br />Tamanho máximo: 2000")
 /**
   * Descrição da Mercadoria<br />Tamanho mínimo: 0<br />Tamanho máximo: 2000
  **/
  private String descricaoDaMercadoria = null;

  @XmlElement(name="documentosDeTransformacao")
  @ApiModelProperty(value = "")
  @Valid
  private List<DocumentoDeTransformacao> documentosDeTransformacao = null;

  @XmlElement(name="documentosImportacao")
  @ApiModelProperty(value = "")
  @Valid
  private List<DocumentoImportacao> documentosImportacao = null;

  @XmlElement(name="enderecoImportador")
  @ApiModelProperty(value = "Endereço do importador<br />Tamanho mínimo: 0<br />Tamanho máximo: 380")
 /**
   * Endereço do importador<br />Tamanho mínimo: 0<br />Tamanho máximo: 380
  **/
  private String enderecoImportador = null;

  @XmlElement(name="exportacaoTemporaria")
  @ApiModelProperty(value = "")
  @Valid
  private ExportacaoTemporaria exportacaoTemporaria = null;

  @XmlElement(name="exportador")
  @ApiModelProperty(value = "")
  @Valid
  private PessoaDTO exportador = null;

  @XmlElement(name="itemDaNotaFiscalDeExportacao")
  @ApiModelProperty(value = "")
  @Valid
  private ItemDaNotaFiscalRemoteDTO itemDaNotaFiscalDeExportacao = null;

  @XmlElement(name="itensDaNotaDeRemessa")
  @ApiModelProperty(value = "")
  @Valid
  private List<ItemDaNotaFiscalRemoteDTO> itensDaNotaDeRemessa = null;

  @XmlElement(name="itensDeNotaComplementar")
  @ApiModelProperty(value = "")
  @Valid
  private List<ItemDaNotaFiscalRemoteDTO> itensDeNotaComplementar = null;

  @XmlElement(name="listaDeEnquadramentos")
  @ApiModelProperty(value = "")
  @Valid
  private List<Enquadramento> listaDeEnquadramentos = null;

  @XmlElement(name="listaPaisDestino")
  @ApiModelProperty(value = "")
  @Valid
  private List<PaisDto> listaPaisDestino = null;

  @XmlElement(name="motivoDoTratamentoPrioritario")
  @ApiModelProperty(value = "Motivo do Tratamento prioritário<br />Domínio: <br />1 = Carga viva<br />2 = Carga perecível<br />3 = Carga perigosa<br />4 = Urna funerária<br />5 = Órgãos humano<br />6 = Partes/peças de aeronave")
 /**
   * Motivo do Tratamento prioritário<br />Domínio: <br />1 = Carga viva<br />2 = Carga perecível<br />3 = Carga perigosa<br />4 = Urna funerária<br />5 = Órgãos humano<br />6 = Partes/peças de aeronave
  **/
  private String motivoDoTratamentoPrioritario = null;

  @XmlElement(name="ncm")
  @ApiModelProperty(value = "")
  @Valid
  private NcmDto ncm = null;

  @XmlElement(name="nomeImportador")
  @ApiModelProperty(value = "Nome do importador<br />Tamanho mínimo: 0<br />Tamanho máximo: 60")
 /**
   * Nome do importador<br />Tamanho mínimo: 0<br />Tamanho máximo: 60
  **/
  private String nomeImportador = null;

  @XmlElement(name="numero")
  @ApiModelProperty(value = "Número do item<br />Formato: Inteiro, com até 5 digitos")
 /**
   * Número do item<br />Formato: Inteiro, com até 5 digitos
  **/
  private Integer numero = null;

  @XmlElement(name="percentualDeComissaoDoAgente")
  @ApiModelProperty(value = "Percentual de comissão do Agente<br />Tamanho: 3,2<br />Formato: Decimal, com até 2 casas decimais separadas por ponto.")
  @Valid
 /**
   * Percentual de comissão do Agente<br />Tamanho: 3,2<br />Formato: Decimal, com até 2 casas decimais separadas por ponto.
  **/
  private BigDecimal percentualDeComissaoDoAgente = null;

  @XmlElement(name="pesoLiquidoTotal")
  @ApiModelProperty(value = "Peso líquido total<br />Tamanho: 14,5<br />Formato: Decimal, com até 5 casas decimais separadas por ponto.")
  @Valid
 /**
   * Peso líquido total<br />Tamanho: 14,5<br />Formato: Decimal, com até 5 casas decimais separadas por ponto.
  **/
  private BigDecimal pesoLiquidoTotal = null;

  @XmlElement(name="quantidadeNaUnidadeComercializada")
  @ApiModelProperty(value = "Quantidade na unidade comercializada<br />Tamanho: 14,5<br />Formato: Decimal, com até 5 casas decimais separadas por ponto.")
  @Valid
 /**
   * Quantidade na unidade comercializada<br />Tamanho: 14,5<br />Formato: Decimal, com até 5 casas decimais separadas por ponto.
  **/
  private BigDecimal quantidadeNaUnidadeComercializada = null;

  @XmlElement(name="quantidadeNaUnidadeEstatistica")
  @ApiModelProperty(value = "Quantidade na unidade comercializada<br />Tamanho: 14,5<br />Formato: Decimal, com até 5 casas decimais separadas por ponto.")
  @Valid
 /**
   * Quantidade na unidade comercializada<br />Tamanho: 14,5<br />Formato: Decimal, com até 5 casas decimais separadas por ponto.
  **/
  private BigDecimal quantidadeNaUnidadeEstatistica = null;

  @XmlElement(name="tratamentosAdministrativos")
  @ApiModelProperty(value = "")
  @Valid
  private List<TratamentoAdministrativo> tratamentosAdministrativos = null;

  @XmlElement(name="unidadeComercializada")
  @ApiModelProperty(value = "Unidade comercializada<br />Tamanho mínimo: 0<br />Tamanho máximo: 20")
 /**
   * Unidade comercializada<br />Tamanho mínimo: 0<br />Tamanho máximo: 20
  **/
  private String unidadeComercializada = null;

  @XmlElement(name="valorDaMercadoriaNaCondicaoDeVenda")
  @ApiModelProperty(value = "Valor da mercadoria na condição de venda<br />Tamanho: 15,2<br />Formato: Decimal, com até 2 casas decimais separadas por ponto.")
  @Valid
 /**
   * Valor da mercadoria na condição de venda<br />Tamanho: 15,2<br />Formato: Decimal, com até 2 casas decimais separadas por ponto.
  **/
  private BigDecimal valorDaMercadoriaNaCondicaoDeVenda = null;

  @XmlElement(name="valorDaMercadoriaNaCondicaoDeVendaEmReais")
  @ApiModelProperty(value = "")
  @Valid
  private BigDecimal valorDaMercadoriaNaCondicaoDeVendaEmReais = null;

  @XmlElement(name="valorDaMercadoriaNoLocalDeEmbarque")
  @ApiModelProperty(value = "Valor da Mercadoria no local de embarque<br />Tamanho: 15,2<br />Formato: Decimal, com até 2 casas decimais separadas por ponto.")
  @Valid
 /**
   * Valor da Mercadoria no local de embarque<br />Tamanho: 15,2<br />Formato: Decimal, com até 2 casas decimais separadas por ponto.
  **/
  private BigDecimal valorDaMercadoriaNoLocalDeEmbarque = null;

  @XmlElement(name="valorDaMercadoriaNoLocalDeEmbarqueEmReais")
  @ApiModelProperty(value = "Valor da Mercadoria no local de embarque em reais<br />Tamanho: 15,2<br />Formato: Decimal, com até 2 casas decimais separadas por ponto.")
  @Valid
 /**
   * Valor da Mercadoria no local de embarque em reais<br />Tamanho: 15,2<br />Formato: Decimal, com até 2 casas decimais separadas por ponto.
  **/
  private BigDecimal valorDaMercadoriaNoLocalDeEmbarqueEmReais = null;

  @XmlElement(name="valorFinanciado")
  @ApiModelProperty(value = "Valor Financiado<br />Tamanho: 15,2<br />Formato: Decimal, com até 2 casas decimais separadas por ponto.")
  @Valid
 /**
   * Valor Financiado<br />Tamanho: 15,2<br />Formato: Decimal, com até 2 casas decimais separadas por ponto.
  **/
  private BigDecimal valorFinanciado = null;

  @XmlElement(name="valorTotal")
  @ApiModelProperty(value = "Valor total<br />Tamanho: 15,2<br />Formato: Decimal, com até 2 casas decimais separadas por ponto.")
  @Valid
 /**
   * Valor total<br />Tamanho: 15,2<br />Formato: Decimal, com até 2 casas decimais separadas por ponto.
  **/
  private BigDecimal valorTotal = null;
 /**
   * Atributo de destaque da NCM&lt;br /&gt;Tamanho: 2&lt;br /&gt;Formato: &#39;NN&#39;
   * @return atributoDestaqueNcmBD
  **/
  @JsonProperty("atributoDestaqueNcmBD")
  public String getAtributoDestaqueNcmBD() {
    return atributoDestaqueNcmBD;
  }

  public void setAtributoDestaqueNcmBD(String atributoDestaqueNcmBD) {
    this.atributoDestaqueNcmBD = atributoDestaqueNcmBD;
  }

  public ItemDUERemoteDTO atributoDestaqueNcmBD(String atributoDestaqueNcmBD) {
    this.atributoDestaqueNcmBD = atributoDestaqueNcmBD;
    return this;
  }

 /**
   * Get atributos
   * @return atributos
  **/
  @JsonProperty("atributos")
  public List<AtributoDto> getAtributos() {
    return atributos;
  }

    public void setAtributos(List<AtributoDto> atributos) {
    this.atributos = atributos;
  }

    public ItemDUERemoteDTO atributos(List<AtributoDto> atributos) {
    this.atributos = atributos;
    return this;
  }

    public ItemDUERemoteDTO addAtributosItem(AtributoDto atributosItem) {
    this.atributos.add(atributosItem);
    return this;
  }

 /**
   * Get calculoTributario
   * @return calculoTributario
  **/
  @JsonProperty("calculoTributario")
  public CalculoTributarioDto getCalculoTributario() {
    return calculoTributario;
  }

    public void setCalculoTributario(CalculoTributarioDto calculoTributario) {
    this.calculoTributario = calculoTributario;
  }

    public ItemDUERemoteDTO calculoTributario(CalculoTributarioDto calculoTributario) {
    this.calculoTributario = calculoTributario;
    return this;
  }

 /**
   * Get codigoCondicaoVenda
   * @return codigoCondicaoVenda
  **/
  @JsonProperty("codigoCondicaoVenda")
  public CondicaoVendaDTO getCodigoCondicaoVenda() {
    return codigoCondicaoVenda;
  }

  public void setCodigoCondicaoVenda(CondicaoVendaDTO codigoCondicaoVenda) {
    this.codigoCondicaoVenda = codigoCondicaoVenda;
  }

  public ItemDUERemoteDTO codigoCondicaoVenda(CondicaoVendaDTO codigoCondicaoVenda) {
    this.codigoCondicaoVenda = codigoCondicaoVenda;
    return this;
  }

 /**
   * Data de conversão&lt;br /&gt;Formato:&#39;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#39;
   * @return dataDeConversao
  **/
  @JsonProperty("dataDeConversao")
  public OffsetDateTime getDataDeConversao() {
    return dataDeConversao;
  }

  public void setDataDeConversao(OffsetDateTime dataDeConversao) {
    this.dataDeConversao = dataDeConversao;
  }

  public ItemDUERemoteDTO dataDeConversao(OffsetDateTime dataDeConversao) {
    this.dataDeConversao = dataDeConversao;
    return this;
  }

 /**
   * Descrição complementar&lt;br /&gt;Tamanho mínimo: 0&lt;br /&gt;Tamanho máximo: 2000
   * @return descricaoComplementar
  **/
  @JsonProperty("descricaoComplementar")
  public String getDescricaoComplementar() {
    return descricaoComplementar;
  }

  public void setDescricaoComplementar(String descricaoComplementar) {
    this.descricaoComplementar = descricaoComplementar;
  }

  public ItemDUERemoteDTO descricaoComplementar(String descricaoComplementar) {
    this.descricaoComplementar = descricaoComplementar;
    return this;
  }

 /**
   * Descrição da Mercadoria&lt;br /&gt;Tamanho mínimo: 0&lt;br /&gt;Tamanho máximo: 2000
   * @return descricaoDaMercadoria
  **/
  @JsonProperty("descricaoDaMercadoria")
  public String getDescricaoDaMercadoria() {
    return descricaoDaMercadoria;
  }

  public void setDescricaoDaMercadoria(String descricaoDaMercadoria) {
    this.descricaoDaMercadoria = descricaoDaMercadoria;
  }

  public ItemDUERemoteDTO descricaoDaMercadoria(String descricaoDaMercadoria) {
    this.descricaoDaMercadoria = descricaoDaMercadoria;
    return this;
  }

 /**
   * Get documentosDeTransformacao
   * @return documentosDeTransformacao
  **/
  @JsonProperty("documentosDeTransformacao")
  public List<DocumentoDeTransformacao> getDocumentosDeTransformacao() {
    return documentosDeTransformacao;
  }

  public void setDocumentosDeTransformacao(List<DocumentoDeTransformacao> documentosDeTransformacao) {
    this.documentosDeTransformacao = documentosDeTransformacao;
  }

  public ItemDUERemoteDTO documentosDeTransformacao(List<DocumentoDeTransformacao> documentosDeTransformacao) {
    this.documentosDeTransformacao = documentosDeTransformacao;
    return this;
  }

  public ItemDUERemoteDTO addDocumentosDeTransformacaoItem(DocumentoDeTransformacao documentosDeTransformacaoItem) {
    this.documentosDeTransformacao.add(documentosDeTransformacaoItem);
    return this;
  }

 /**
   * Get documentosImportacao
   * @return documentosImportacao
  **/
  @JsonProperty("documentosImportacao")
  public List<DocumentoImportacao> getDocumentosImportacao() {
    return documentosImportacao;
  }

  public void setDocumentosImportacao(List<DocumentoImportacao> documentosImportacao) {
    this.documentosImportacao = documentosImportacao;
  }

  public ItemDUERemoteDTO documentosImportacao(List<DocumentoImportacao> documentosImportacao) {
    this.documentosImportacao = documentosImportacao;
    return this;
  }

  public ItemDUERemoteDTO addDocumentosImportacaoItem(DocumentoImportacao documentosImportacaoItem) {
    this.documentosImportacao.add(documentosImportacaoItem);
    return this;
  }

 /**
   * Endereço do importador&lt;br /&gt;Tamanho mínimo: 0&lt;br /&gt;Tamanho máximo: 380
   * @return enderecoImportador
  **/
  @JsonProperty("enderecoImportador")
  public String getEnderecoImportador() {
    return enderecoImportador;
  }

  public void setEnderecoImportador(String enderecoImportador) {
    this.enderecoImportador = enderecoImportador;
  }

  public ItemDUERemoteDTO enderecoImportador(String enderecoImportador) {
    this.enderecoImportador = enderecoImportador;
    return this;
  }

 /**
   * Get exportacaoTemporaria
   * @return exportacaoTemporaria
  **/
  @JsonProperty("exportacaoTemporaria")
  public ExportacaoTemporaria getExportacaoTemporaria() {
    return exportacaoTemporaria;
  }

  public void setExportacaoTemporaria(ExportacaoTemporaria exportacaoTemporaria) {
    this.exportacaoTemporaria = exportacaoTemporaria;
  }

  public ItemDUERemoteDTO exportacaoTemporaria(ExportacaoTemporaria exportacaoTemporaria) {
    this.exportacaoTemporaria = exportacaoTemporaria;
    return this;
  }

 /**
   * Get exportador
   * @return exportador
  **/
  @JsonProperty("exportador")
  public PessoaDTO getExportador() {
    return exportador;
  }

  public void setExportador(PessoaDTO exportador) {
    this.exportador = exportador;
  }

  public ItemDUERemoteDTO exportador(PessoaDTO exportador) {
    this.exportador = exportador;
    return this;
  }

 /**
   * Get itemDaNotaFiscalDeExportacao
   * @return itemDaNotaFiscalDeExportacao
  **/
  @JsonProperty("itemDaNotaFiscalDeExportacao")
  public ItemDaNotaFiscalRemoteDTO getItemDaNotaFiscalDeExportacao() {
    return itemDaNotaFiscalDeExportacao;
  }

  public void setItemDaNotaFiscalDeExportacao(ItemDaNotaFiscalRemoteDTO itemDaNotaFiscalDeExportacao) {
    this.itemDaNotaFiscalDeExportacao = itemDaNotaFiscalDeExportacao;
  }

  public ItemDUERemoteDTO itemDaNotaFiscalDeExportacao(ItemDaNotaFiscalRemoteDTO itemDaNotaFiscalDeExportacao) {
    this.itemDaNotaFiscalDeExportacao = itemDaNotaFiscalDeExportacao;
    return this;
  }

 /**
   * Get itensDaNotaDeRemessa
   * @return itensDaNotaDeRemessa
  **/
  @JsonProperty("itensDaNotaDeRemessa")
  public List<ItemDaNotaFiscalRemoteDTO> getItensDaNotaDeRemessa() {
    return itensDaNotaDeRemessa;
  }

  public void setItensDaNotaDeRemessa(List<ItemDaNotaFiscalRemoteDTO> itensDaNotaDeRemessa) {
    this.itensDaNotaDeRemessa = itensDaNotaDeRemessa;
  }

  public ItemDUERemoteDTO itensDaNotaDeRemessa(List<ItemDaNotaFiscalRemoteDTO> itensDaNotaDeRemessa) {
    this.itensDaNotaDeRemessa = itensDaNotaDeRemessa;
    return this;
  }

  public ItemDUERemoteDTO addItensDaNotaDeRemessaItem(ItemDaNotaFiscalRemoteDTO itensDaNotaDeRemessaItem) {
    this.itensDaNotaDeRemessa.add(itensDaNotaDeRemessaItem);
    return this;
  }

 /**
   * Get itensDeNotaComplementar
   * @return itensDeNotaComplementar
  **/
  @JsonProperty("itensDeNotaComplementar")
  public List<ItemDaNotaFiscalRemoteDTO> getItensDeNotaComplementar() {
    return itensDeNotaComplementar;
  }

  public void setItensDeNotaComplementar(List<ItemDaNotaFiscalRemoteDTO> itensDeNotaComplementar) {
    this.itensDeNotaComplementar = itensDeNotaComplementar;
  }

  public ItemDUERemoteDTO itensDeNotaComplementar(List<ItemDaNotaFiscalRemoteDTO> itensDeNotaComplementar) {
    this.itensDeNotaComplementar = itensDeNotaComplementar;
    return this;
  }

  public ItemDUERemoteDTO addItensDeNotaComplementarItem(ItemDaNotaFiscalRemoteDTO itensDeNotaComplementarItem) {
    this.itensDeNotaComplementar.add(itensDeNotaComplementarItem);
    return this;
  }

 /**
   * Get listaDeEnquadramentos
   * @return listaDeEnquadramentos
  **/
  @JsonProperty("listaDeEnquadramentos")
  public List<Enquadramento> getListaDeEnquadramentos() {
    return listaDeEnquadramentos;
  }

  public void setListaDeEnquadramentos(List<Enquadramento> listaDeEnquadramentos) {
    this.listaDeEnquadramentos = listaDeEnquadramentos;
  }

  public ItemDUERemoteDTO listaDeEnquadramentos(List<Enquadramento> listaDeEnquadramentos) {
    this.listaDeEnquadramentos = listaDeEnquadramentos;
    return this;
  }

  public ItemDUERemoteDTO addListaDeEnquadramentosItem(Enquadramento listaDeEnquadramentosItem) {
    this.listaDeEnquadramentos.add(listaDeEnquadramentosItem);
    return this;
  }

 /**
   * Get listaPaisDestino
   * @return listaPaisDestino
  **/
  @JsonProperty("listaPaisDestino")
  public List<PaisDto> getListaPaisDestino() {
    return listaPaisDestino;
  }

    public void setListaPaisDestino(List<PaisDto> listaPaisDestino) {
    this.listaPaisDestino = listaPaisDestino;
  }

    public ItemDUERemoteDTO listaPaisDestino(List<PaisDto> listaPaisDestino) {
    this.listaPaisDestino = listaPaisDestino;
    return this;
  }

    public ItemDUERemoteDTO addListaPaisDestinoItem(PaisDto listaPaisDestinoItem) {
    this.listaPaisDestino.add(listaPaisDestinoItem);
    return this;
  }

 /**
   * Motivo do Tratamento prioritário&lt;br /&gt;Domínio: &lt;br /&gt;1 &#x3D; Carga viva&lt;br /&gt;2 &#x3D; Carga perecível&lt;br /&gt;3 &#x3D; Carga perigosa&lt;br /&gt;4 &#x3D; Urna funerária&lt;br /&gt;5 &#x3D; Órgãos humano&lt;br /&gt;6 &#x3D; Partes/peças de aeronave
   * @return motivoDoTratamentoPrioritario
  **/
  @JsonProperty("motivoDoTratamentoPrioritario")
  public String getMotivoDoTratamentoPrioritario() {
    return motivoDoTratamentoPrioritario;
  }

  public void setMotivoDoTratamentoPrioritario(String motivoDoTratamentoPrioritario) {
    this.motivoDoTratamentoPrioritario = motivoDoTratamentoPrioritario;
  }

  public ItemDUERemoteDTO motivoDoTratamentoPrioritario(String motivoDoTratamentoPrioritario) {
    this.motivoDoTratamentoPrioritario = motivoDoTratamentoPrioritario;
    return this;
  }

 /**
   * Get ncm
   * @return ncm
  **/
  @JsonProperty("ncm")
  public NcmDto getNcm() {
    return ncm;
  }

    public void setNcm(NcmDto ncm) {
    this.ncm = ncm;
  }

    public ItemDUERemoteDTO ncm(NcmDto ncm) {
    this.ncm = ncm;
    return this;
  }

 /**
   * Nome do importador&lt;br /&gt;Tamanho mínimo: 0&lt;br /&gt;Tamanho máximo: 60
   * @return nomeImportador
  **/
  @JsonProperty("nomeImportador")
  public String getNomeImportador() {
    return nomeImportador;
  }

  public void setNomeImportador(String nomeImportador) {
    this.nomeImportador = nomeImportador;
  }

  public ItemDUERemoteDTO nomeImportador(String nomeImportador) {
    this.nomeImportador = nomeImportador;
    return this;
  }

 /**
   * Número do item&lt;br /&gt;Formato: Inteiro, com até 5 digitos
   * @return numero
  **/
  @JsonProperty("numero")
  public Integer getNumero() {
    return numero;
  }

  public void setNumero(Integer numero) {
    this.numero = numero;
  }

  public ItemDUERemoteDTO numero(Integer numero) {
    this.numero = numero;
    return this;
  }

 /**
   * Percentual de comissão do Agente&lt;br /&gt;Tamanho: 3,2&lt;br /&gt;Formato: Decimal, com até 2 casas decimais separadas por ponto.
   * @return percentualDeComissaoDoAgente
  **/
  @JsonProperty("percentualDeComissaoDoAgente")
  public BigDecimal getPercentualDeComissaoDoAgente() {
    return percentualDeComissaoDoAgente;
  }

  public void setPercentualDeComissaoDoAgente(BigDecimal percentualDeComissaoDoAgente) {
    this.percentualDeComissaoDoAgente = percentualDeComissaoDoAgente;
  }

  public ItemDUERemoteDTO percentualDeComissaoDoAgente(BigDecimal percentualDeComissaoDoAgente) {
    this.percentualDeComissaoDoAgente = percentualDeComissaoDoAgente;
    return this;
  }

 /**
   * Peso líquido total&lt;br /&gt;Tamanho: 14,5&lt;br /&gt;Formato: Decimal, com até 5 casas decimais separadas por ponto.
   * @return pesoLiquidoTotal
  **/
  @JsonProperty("pesoLiquidoTotal")
  public BigDecimal getPesoLiquidoTotal() {
    return pesoLiquidoTotal;
  }

  public void setPesoLiquidoTotal(BigDecimal pesoLiquidoTotal) {
    this.pesoLiquidoTotal = pesoLiquidoTotal;
  }

  public ItemDUERemoteDTO pesoLiquidoTotal(BigDecimal pesoLiquidoTotal) {
    this.pesoLiquidoTotal = pesoLiquidoTotal;
    return this;
  }

 /**
   * Quantidade na unidade comercializada&lt;br /&gt;Tamanho: 14,5&lt;br /&gt;Formato: Decimal, com até 5 casas decimais separadas por ponto.
   * @return quantidadeNaUnidadeComercializada
  **/
  @JsonProperty("quantidadeNaUnidadeComercializada")
  public BigDecimal getQuantidadeNaUnidadeComercializada() {
    return quantidadeNaUnidadeComercializada;
  }

  public void setQuantidadeNaUnidadeComercializada(BigDecimal quantidadeNaUnidadeComercializada) {
    this.quantidadeNaUnidadeComercializada = quantidadeNaUnidadeComercializada;
  }

  public ItemDUERemoteDTO quantidadeNaUnidadeComercializada(BigDecimal quantidadeNaUnidadeComercializada) {
    this.quantidadeNaUnidadeComercializada = quantidadeNaUnidadeComercializada;
    return this;
  }

 /**
   * Quantidade na unidade comercializada&lt;br /&gt;Tamanho: 14,5&lt;br /&gt;Formato: Decimal, com até 5 casas decimais separadas por ponto.
   * @return quantidadeNaUnidadeEstatistica
  **/
  @JsonProperty("quantidadeNaUnidadeEstatistica")
  public BigDecimal getQuantidadeNaUnidadeEstatistica() {
    return quantidadeNaUnidadeEstatistica;
  }

  public void setQuantidadeNaUnidadeEstatistica(BigDecimal quantidadeNaUnidadeEstatistica) {
    this.quantidadeNaUnidadeEstatistica = quantidadeNaUnidadeEstatistica;
  }

  public ItemDUERemoteDTO quantidadeNaUnidadeEstatistica(BigDecimal quantidadeNaUnidadeEstatistica) {
    this.quantidadeNaUnidadeEstatistica = quantidadeNaUnidadeEstatistica;
    return this;
  }

 /**
   * Get tratamentosAdministrativos
   * @return tratamentosAdministrativos
  **/
  @JsonProperty("tratamentosAdministrativos")
  public List<TratamentoAdministrativo> getTratamentosAdministrativos() {
    return tratamentosAdministrativos;
  }

  public void setTratamentosAdministrativos(List<TratamentoAdministrativo> tratamentosAdministrativos) {
    this.tratamentosAdministrativos = tratamentosAdministrativos;
  }

  public ItemDUERemoteDTO tratamentosAdministrativos(List<TratamentoAdministrativo> tratamentosAdministrativos) {
    this.tratamentosAdministrativos = tratamentosAdministrativos;
    return this;
  }

  public ItemDUERemoteDTO addTratamentosAdministrativosItem(TratamentoAdministrativo tratamentosAdministrativosItem) {
    this.tratamentosAdministrativos.add(tratamentosAdministrativosItem);
    return this;
  }

 /**
   * Unidade comercializada&lt;br /&gt;Tamanho mínimo: 0&lt;br /&gt;Tamanho máximo: 20
   * @return unidadeComercializada
  **/
  @JsonProperty("unidadeComercializada")
  public String getUnidadeComercializada() {
    return unidadeComercializada;
  }

  public void setUnidadeComercializada(String unidadeComercializada) {
    this.unidadeComercializada = unidadeComercializada;
  }

  public ItemDUERemoteDTO unidadeComercializada(String unidadeComercializada) {
    this.unidadeComercializada = unidadeComercializada;
    return this;
  }

 /**
   * Valor da mercadoria na condição de venda&lt;br /&gt;Tamanho: 15,2&lt;br /&gt;Formato: Decimal, com até 2 casas decimais separadas por ponto.
   * @return valorDaMercadoriaNaCondicaoDeVenda
  **/
  @JsonProperty("valorDaMercadoriaNaCondicaoDeVenda")
  public BigDecimal getValorDaMercadoriaNaCondicaoDeVenda() {
    return valorDaMercadoriaNaCondicaoDeVenda;
  }

  public void setValorDaMercadoriaNaCondicaoDeVenda(BigDecimal valorDaMercadoriaNaCondicaoDeVenda) {
    this.valorDaMercadoriaNaCondicaoDeVenda = valorDaMercadoriaNaCondicaoDeVenda;
  }

  public ItemDUERemoteDTO valorDaMercadoriaNaCondicaoDeVenda(BigDecimal valorDaMercadoriaNaCondicaoDeVenda) {
    this.valorDaMercadoriaNaCondicaoDeVenda = valorDaMercadoriaNaCondicaoDeVenda;
    return this;
  }

 /**
   * Get valorDaMercadoriaNaCondicaoDeVendaEmReais
   * @return valorDaMercadoriaNaCondicaoDeVendaEmReais
  **/
  @JsonProperty("valorDaMercadoriaNaCondicaoDeVendaEmReais")
  public BigDecimal getValorDaMercadoriaNaCondicaoDeVendaEmReais() {
    return valorDaMercadoriaNaCondicaoDeVendaEmReais;
  }

  public void setValorDaMercadoriaNaCondicaoDeVendaEmReais(BigDecimal valorDaMercadoriaNaCondicaoDeVendaEmReais) {
    this.valorDaMercadoriaNaCondicaoDeVendaEmReais = valorDaMercadoriaNaCondicaoDeVendaEmReais;
  }

  public ItemDUERemoteDTO valorDaMercadoriaNaCondicaoDeVendaEmReais(BigDecimal valorDaMercadoriaNaCondicaoDeVendaEmReais) {
    this.valorDaMercadoriaNaCondicaoDeVendaEmReais = valorDaMercadoriaNaCondicaoDeVendaEmReais;
    return this;
  }

 /**
   * Valor da Mercadoria no local de embarque&lt;br /&gt;Tamanho: 15,2&lt;br /&gt;Formato: Decimal, com até 2 casas decimais separadas por ponto.
   * @return valorDaMercadoriaNoLocalDeEmbarque
  **/
  @JsonProperty("valorDaMercadoriaNoLocalDeEmbarque")
  public BigDecimal getValorDaMercadoriaNoLocalDeEmbarque() {
    return valorDaMercadoriaNoLocalDeEmbarque;
  }

  public void setValorDaMercadoriaNoLocalDeEmbarque(BigDecimal valorDaMercadoriaNoLocalDeEmbarque) {
    this.valorDaMercadoriaNoLocalDeEmbarque = valorDaMercadoriaNoLocalDeEmbarque;
  }

  public ItemDUERemoteDTO valorDaMercadoriaNoLocalDeEmbarque(BigDecimal valorDaMercadoriaNoLocalDeEmbarque) {
    this.valorDaMercadoriaNoLocalDeEmbarque = valorDaMercadoriaNoLocalDeEmbarque;
    return this;
  }

 /**
   * Valor da Mercadoria no local de embarque em reais&lt;br /&gt;Tamanho: 15,2&lt;br /&gt;Formato: Decimal, com até 2 casas decimais separadas por ponto.
   * @return valorDaMercadoriaNoLocalDeEmbarqueEmReais
  **/
  @JsonProperty("valorDaMercadoriaNoLocalDeEmbarqueEmReais")
  public BigDecimal getValorDaMercadoriaNoLocalDeEmbarqueEmReais() {
    return valorDaMercadoriaNoLocalDeEmbarqueEmReais;
  }

  public void setValorDaMercadoriaNoLocalDeEmbarqueEmReais(BigDecimal valorDaMercadoriaNoLocalDeEmbarqueEmReais) {
    this.valorDaMercadoriaNoLocalDeEmbarqueEmReais = valorDaMercadoriaNoLocalDeEmbarqueEmReais;
  }

  public ItemDUERemoteDTO valorDaMercadoriaNoLocalDeEmbarqueEmReais(BigDecimal valorDaMercadoriaNoLocalDeEmbarqueEmReais) {
    this.valorDaMercadoriaNoLocalDeEmbarqueEmReais = valorDaMercadoriaNoLocalDeEmbarqueEmReais;
    return this;
  }

 /**
   * Valor Financiado&lt;br /&gt;Tamanho: 15,2&lt;br /&gt;Formato: Decimal, com até 2 casas decimais separadas por ponto.
   * @return valorFinanciado
  **/
  @JsonProperty("valorFinanciado")
  public BigDecimal getValorFinanciado() {
    return valorFinanciado;
  }

  public void setValorFinanciado(BigDecimal valorFinanciado) {
    this.valorFinanciado = valorFinanciado;
  }

  public ItemDUERemoteDTO valorFinanciado(BigDecimal valorFinanciado) {
    this.valorFinanciado = valorFinanciado;
    return this;
  }

 /**
   * Valor total&lt;br /&gt;Tamanho: 15,2&lt;br /&gt;Formato: Decimal, com até 2 casas decimais separadas por ponto.
   * @return valorTotal
  **/
  @JsonProperty("valorTotal")
  public BigDecimal getValorTotal() {
    return valorTotal;
  }

  public void setValorTotal(BigDecimal valorTotal) {
    this.valorTotal = valorTotal;
  }

  public ItemDUERemoteDTO valorTotal(BigDecimal valorTotal) {
    this.valorTotal = valorTotal;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemDUERemoteDTO {\n");
    
    sb.append("    atributoDestaqueNcmBD: ").append(toIndentedString(atributoDestaqueNcmBD)).append("\n");
    sb.append("    atributos: ").append(toIndentedString(atributos)).append("\n");
    sb.append("    calculoTributario: ").append(toIndentedString(calculoTributario)).append("\n");
    sb.append("    codigoCondicaoVenda: ").append(toIndentedString(codigoCondicaoVenda)).append("\n");
    sb.append("    dataDeConversao: ").append(toIndentedString(dataDeConversao)).append("\n");
    sb.append("    descricaoComplementar: ").append(toIndentedString(descricaoComplementar)).append("\n");
    sb.append("    descricaoDaMercadoria: ").append(toIndentedString(descricaoDaMercadoria)).append("\n");
    sb.append("    documentosDeTransformacao: ").append(toIndentedString(documentosDeTransformacao)).append("\n");
    sb.append("    documentosImportacao: ").append(toIndentedString(documentosImportacao)).append("\n");
    sb.append("    enderecoImportador: ").append(toIndentedString(enderecoImportador)).append("\n");
    sb.append("    exportacaoTemporaria: ").append(toIndentedString(exportacaoTemporaria)).append("\n");
    sb.append("    exportador: ").append(toIndentedString(exportador)).append("\n");
    sb.append("    itemDaNotaFiscalDeExportacao: ").append(toIndentedString(itemDaNotaFiscalDeExportacao)).append("\n");
    sb.append("    itensDaNotaDeRemessa: ").append(toIndentedString(itensDaNotaDeRemessa)).append("\n");
    sb.append("    itensDeNotaComplementar: ").append(toIndentedString(itensDeNotaComplementar)).append("\n");
    sb.append("    listaDeEnquadramentos: ").append(toIndentedString(listaDeEnquadramentos)).append("\n");
    sb.append("    listaPaisDestino: ").append(toIndentedString(listaPaisDestino)).append("\n");
    sb.append("    motivoDoTratamentoPrioritario: ").append(toIndentedString(motivoDoTratamentoPrioritario)).append("\n");
    sb.append("    ncm: ").append(toIndentedString(ncm)).append("\n");
    sb.append("    nomeImportador: ").append(toIndentedString(nomeImportador)).append("\n");
    sb.append("    numero: ").append(toIndentedString(numero)).append("\n");
    sb.append("    percentualDeComissaoDoAgente: ").append(toIndentedString(percentualDeComissaoDoAgente)).append("\n");
    sb.append("    pesoLiquidoTotal: ").append(toIndentedString(pesoLiquidoTotal)).append("\n");
    sb.append("    quantidadeNaUnidadeComercializada: ").append(toIndentedString(quantidadeNaUnidadeComercializada)).append("\n");
    sb.append("    quantidadeNaUnidadeEstatistica: ").append(toIndentedString(quantidadeNaUnidadeEstatistica)).append("\n");
    sb.append("    tratamentosAdministrativos: ").append(toIndentedString(tratamentosAdministrativos)).append("\n");
    sb.append("    unidadeComercializada: ").append(toIndentedString(unidadeComercializada)).append("\n");
    sb.append("    valorDaMercadoriaNaCondicaoDeVenda: ").append(toIndentedString(valorDaMercadoriaNaCondicaoDeVenda)).append("\n");
    sb.append("    valorDaMercadoriaNaCondicaoDeVendaEmReais: ").append(toIndentedString(valorDaMercadoriaNaCondicaoDeVendaEmReais)).append("\n");
    sb.append("    valorDaMercadoriaNoLocalDeEmbarque: ").append(toIndentedString(valorDaMercadoriaNoLocalDeEmbarque)).append("\n");
    sb.append("    valorDaMercadoriaNoLocalDeEmbarqueEmReais: ").append(toIndentedString(valorDaMercadoriaNoLocalDeEmbarqueEmReais)).append("\n");
    sb.append("    valorFinanciado: ").append(toIndentedString(valorFinanciado)).append("\n");
    sb.append("    valorTotal: ").append(toIndentedString(valorTotal)).append("\n");
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

