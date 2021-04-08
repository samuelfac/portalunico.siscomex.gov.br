package br.gov.siscomex.portalunico.talpco.model;

import java.math.BigDecimal;

import javax.validation.Valid;
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
 @XmlType(name = "ConsultaDetalhadaVinculo", propOrder =
    { "chaveNfe", "dataCancelamentoDocumento", "dataExclusao", "dataVinculo", "estornaDesvinculo", "idVersao", "ncm", "numeroDocumento", "numeroDocumentoItem", "numeroItemLpco", "numeroItemNfe", "pesoLiquido", "quantidadeComercializada", "quantidadeUnidadeEstatistica", "valorCondicaoVenda", "valorFinanciado", "valorItem"
})

@XmlRootElement(name="ConsultaDetalhadaVinculo")
/**
  * Vínculo de um LPCO com uma DU-E / DUIMP, exibido na consulta detalhada de LPCOs
 **/
@ApiModel(description="Vínculo de um LPCO com uma DU-E / DUIMP, exibido na consulta detalhada de LPCOs")
public class ConsultaDetalhadaVinculo  {
  
  @XmlElement(name="chaveNfe")
  @ApiModelProperty(example = "11223344", value = "Chave da NF-e do item da DUE vinculado ao LPCO<br>Tamanho: 44")
 /**
   * Chave da NF-e do item da DUE vinculado ao LPCO<br>Tamanho: 44
  **/
  private String chaveNfe = null;

  @XmlElement(name="dataCancelamentoDocumento")
  @ApiModelProperty(example = "2019-09-02T10:04:38.123Z", value = "Data de cancelamento da DUE / DUIMP, caso exista.<br>Formato: dd-MM-yyyy'T'HH:mm:ss:SSSZ")
 /**
   * Data de cancelamento da DUE / DUIMP, caso exista.<br>Formato: dd-MM-yyyy'T'HH:mm:ss:SSSZ
  **/
  private String dataCancelamentoDocumento = null;

  @XmlElement(name="dataExclusao")
  @ApiModelProperty(example = "2019-09-02T10:04:38.123Z", value = "Data em que o vínculo entre o item da DUE / DUIMP e o LPCO foi excluído.<br>Formato: dd-MM-yyyy'T'HH:mm:ss:SSSZ")
 /**
   * Data em que o vínculo entre o item da DUE / DUIMP e o LPCO foi excluído.<br>Formato: dd-MM-yyyy'T'HH:mm:ss:SSSZ
  **/
  private String dataExclusao = null;

  @XmlElement(name="dataVinculo", required = true)
  @ApiModelProperty(example = "2019-09-02T10:04:38.123Z", required = true, value = "Data em que o vínculo entre o item da DUE / DUIMP e o LPCO foi estabelecido.<br>Formato: dd-MM-yyyy'T'HH:mm:ss:SSSZ")
 /**
   * Data em que o vínculo entre o item da DUE / DUIMP e o LPCO foi estabelecido.<br>Formato: dd-MM-yyyy'T'HH:mm:ss:SSSZ
  **/
  private String dataVinculo = null;

  @XmlElement(name="estornaDesvinculo", required = true)
  @ApiModelProperty(example = "true", required = true, value = "Indica se os valores e quantidades que este vínculo consome da cota do LPCO deve ser estornado caso o vínculo seja excluído.<br>")
 /**
   * Indica se os valores e quantidades que este vínculo consome da cota do LPCO deve ser estornado caso o vínculo seja excluído.<br>
  **/
  private Boolean estornaDesvinculo = false;

  @XmlElement(name="idVersao")
  @ApiModelProperty(value = "")
  private Long idVersao = null;

  @XmlElement(name="ncm", required = true)
  @ApiModelProperty(example = "11223344", required = true, value = "NCM do item da DUE / DUIMP vinculado ao LPCO<br>Tamanho: 8<br>Formato: NNNNNNNN")
 /**
   * NCM do item da DUE / DUIMP vinculado ao LPCO<br>Tamanho: 8<br>Formato: NNNNNNNN
  **/
  private String ncm = null;

  @XmlElement(name="numeroDocumento", required = true)
  @ApiModelProperty(example = "20BR0000000001", required = true, value = "Número da DUE / DUIMP foi vinculada ao LPCO<br>Tamanho: 14 (DU-E) ou 15 (DUIMP)")
 /**
   * Número da DUE / DUIMP foi vinculada ao LPCO<br>Tamanho: 14 (DU-E) ou 15 (DUIMP)
  **/
  private String numeroDocumento = null;

  @XmlElement(name="numeroDocumentoItem")
  @ApiModelProperty(example = "1", value = "Número do item da DUE / DUIMP vinculado ao LPCO<br>")
 /**
   * Número do item da DUE / DUIMP vinculado ao LPCO<br>
  **/
  private Long numeroDocumentoItem = null;

  @XmlElement(name="numeroItemLpco")
  @ApiModelProperty(example = "1", value = "Número do item do LPCO ao qual a DUE / DUIMP foi vinculada")
 /**
   * Número do item do LPCO ao qual a DUE / DUIMP foi vinculada
  **/
  private Integer numeroItemLpco = null;

  @XmlElement(name="numeroItemNfe")
  @ApiModelProperty(example = "1.0", value = "Numero do item da NF-e do item da DUE vinculado ao LPCO<br>")
  @Valid
 /**
   * Numero do item da NF-e do item da DUE vinculado ao LPCO<br>
  **/
  private BigDecimal numeroItemNfe = null;

  @XmlElement(name="pesoLiquido")
  @ApiModelProperty(example = "100.0", value = "Peso líquido do item da DUE / DUIMP vinculado ao LPCO<br>Tamanho: 14,5 + <br>Formato: Decimal, com até 6 casas decimais separadas por ponto")
  @Valid
 /**
   * Peso líquido do item da DUE / DUIMP vinculado ao LPCO<br>Tamanho: 14,5 + <br>Formato: Decimal, com até 6 casas decimais separadas por ponto
  **/
  private BigDecimal pesoLiquido = null;

  @XmlElement(name="quantidadeComercializada")
  @ApiModelProperty(example = "100.02212", value = "Quantidade na unidade comercializada do item da DUE / DUIMP vinculado ao LPCO.<br>Tamanho: 14,5 + <br>Formato: Decimal, com até 6 casas decimais separadas por ponto")
  @Valid
 /**
   * Quantidade na unidade comercializada do item da DUE / DUIMP vinculado ao LPCO.<br>Tamanho: 14,5 + <br>Formato: Decimal, com até 6 casas decimais separadas por ponto
  **/
  private BigDecimal quantidadeComercializada = null;

  @XmlElement(name="quantidadeUnidadeEstatistica")
  @ApiModelProperty(example = "100.02212", value = "Quantidade na unidade estatística do item da DUE / DUIMP vinculado ao LPCO.<br>Tamanho: 14,5 + <br>Formato: Decimal, com até 6 casas decimais separadas por ponto")
  @Valid
 /**
   * Quantidade na unidade estatística do item da DUE / DUIMP vinculado ao LPCO.<br>Tamanho: 14,5 + <br>Formato: Decimal, com até 6 casas decimais separadas por ponto
  **/
  private BigDecimal quantidadeUnidadeEstatistica = null;

  @XmlElement(name="valorCondicaoVenda")
  @ApiModelProperty(example = "1010.2", value = "Valor na condição de venda do item da DUE / DUIMP vinculado ao LPCO<br>Tamanho: 15,2 + <br>Formato: Decimal, com até 2 casas decimais separadas por ponto")
  @Valid
 /**
   * Valor na condição de venda do item da DUE / DUIMP vinculado ao LPCO<br>Tamanho: 15,2 + <br>Formato: Decimal, com até 2 casas decimais separadas por ponto
  **/
  private BigDecimal valorCondicaoVenda = null;

  @XmlElement(name="valorFinanciado")
  @ApiModelProperty(example = "1010.2", value = "Valor financiado do item da DUE / DUIMP vinculado ao LPCO<br>Tamanho: 15,2 + <br>Formato: Decimal, com até 2 casas decimais separadas por ponto")
  @Valid
 /**
   * Valor financiado do item da DUE / DUIMP vinculado ao LPCO<br>Tamanho: 15,2 + <br>Formato: Decimal, com até 2 casas decimais separadas por ponto
  **/
  private BigDecimal valorFinanciado = null;

  @XmlElement(name="valorItem")
  @ApiModelProperty(example = "100.0", value = "Valor do item da DUE / DUIMP vinculado ao LPCO<br>")
  @Valid
 /**
   * Valor do item da DUE / DUIMP vinculado ao LPCO<br>
  **/
  private BigDecimal valorItem = null;
 /**
   * Chave da NF-e do item da DUE vinculado ao LPCO&lt;br&gt;Tamanho: 44
   * @return chaveNfe
  **/
  @JsonProperty("chaveNfe")
  public String getChaveNfe() {
    return chaveNfe;
  }

  public void setChaveNfe(String chaveNfe) {
    this.chaveNfe = chaveNfe;
  }

  public ConsultaDetalhadaVinculo chaveNfe(String chaveNfe) {
    this.chaveNfe = chaveNfe;
    return this;
  }

 /**
   * Data de cancelamento da DUE / DUIMP, caso exista.&lt;br&gt;Formato: dd-MM-yyyy&#39;T&#39;HH:mm:ss:SSSZ
   * @return dataCancelamentoDocumento
  **/
  @JsonProperty("dataCancelamentoDocumento")
  public String getDataCancelamentoDocumento() {
    return dataCancelamentoDocumento;
  }

  public void setDataCancelamentoDocumento(String dataCancelamentoDocumento) {
    this.dataCancelamentoDocumento = dataCancelamentoDocumento;
  }

  public ConsultaDetalhadaVinculo dataCancelamentoDocumento(String dataCancelamentoDocumento) {
    this.dataCancelamentoDocumento = dataCancelamentoDocumento;
    return this;
  }

 /**
   * Data em que o vínculo entre o item da DUE / DUIMP e o LPCO foi excluído.&lt;br&gt;Formato: dd-MM-yyyy&#39;T&#39;HH:mm:ss:SSSZ
   * @return dataExclusao
  **/
  @JsonProperty("dataExclusao")
  public String getDataExclusao() {
    return dataExclusao;
  }

  public void setDataExclusao(String dataExclusao) {
    this.dataExclusao = dataExclusao;
  }

  public ConsultaDetalhadaVinculo dataExclusao(String dataExclusao) {
    this.dataExclusao = dataExclusao;
    return this;
  }

 /**
   * Data em que o vínculo entre o item da DUE / DUIMP e o LPCO foi estabelecido.&lt;br&gt;Formato: dd-MM-yyyy&#39;T&#39;HH:mm:ss:SSSZ
   * @return dataVinculo
  **/
  @JsonProperty("dataVinculo")
  @NotNull
  public String getDataVinculo() {
    return dataVinculo;
  }

  public void setDataVinculo(String dataVinculo) {
    this.dataVinculo = dataVinculo;
  }

  public ConsultaDetalhadaVinculo dataVinculo(String dataVinculo) {
    this.dataVinculo = dataVinculo;
    return this;
  }

 /**
   * Indica se os valores e quantidades que este vínculo consome da cota do LPCO deve ser estornado caso o vínculo seja excluído.&lt;br&gt;
   * @return estornaDesvinculo
  **/
  @JsonProperty("estornaDesvinculo")
  @NotNull
  public Boolean isEstornaDesvinculo() {
    return estornaDesvinculo;
  }

  public void setEstornaDesvinculo(Boolean estornaDesvinculo) {
    this.estornaDesvinculo = estornaDesvinculo;
  }

  public ConsultaDetalhadaVinculo estornaDesvinculo(Boolean estornaDesvinculo) {
    this.estornaDesvinculo = estornaDesvinculo;
    return this;
  }

 /**
   * Get idVersao
   * @return idVersao
  **/
  @JsonProperty("idVersao")
  public Long getIdVersao() {
    return idVersao;
  }

  public void setIdVersao(Long idVersao) {
    this.idVersao = idVersao;
  }

  public ConsultaDetalhadaVinculo idVersao(Long idVersao) {
    this.idVersao = idVersao;
    return this;
  }

 /**
   * NCM do item da DUE / DUIMP vinculado ao LPCO&lt;br&gt;Tamanho: 8&lt;br&gt;Formato: NNNNNNNN
   * @return ncm
  **/
  @JsonProperty("ncm")
  @NotNull
  public String getNcm() {
    return ncm;
  }

  public void setNcm(String ncm) {
    this.ncm = ncm;
  }

  public ConsultaDetalhadaVinculo ncm(String ncm) {
    this.ncm = ncm;
    return this;
  }

 /**
   * Número da DUE / DUIMP foi vinculada ao LPCO&lt;br&gt;Tamanho: 14 (DU-E) ou 15 (DUIMP)
   * @return numeroDocumento
  **/
  @JsonProperty("numeroDocumento")
  @NotNull
  public String getNumeroDocumento() {
    return numeroDocumento;
  }

  public void setNumeroDocumento(String numeroDocumento) {
    this.numeroDocumento = numeroDocumento;
  }

  public ConsultaDetalhadaVinculo numeroDocumento(String numeroDocumento) {
    this.numeroDocumento = numeroDocumento;
    return this;
  }

 /**
   * Número do item da DUE / DUIMP vinculado ao LPCO&lt;br&gt;
   * @return numeroDocumentoItem
  **/
  @JsonProperty("numeroDocumentoItem")
  public Long getNumeroDocumentoItem() {
    return numeroDocumentoItem;
  }

  public void setNumeroDocumentoItem(Long numeroDocumentoItem) {
    this.numeroDocumentoItem = numeroDocumentoItem;
  }

  public ConsultaDetalhadaVinculo numeroDocumentoItem(Long numeroDocumentoItem) {
    this.numeroDocumentoItem = numeroDocumentoItem;
    return this;
  }

 /**
   * Número do item do LPCO ao qual a DUE / DUIMP foi vinculada
   * @return numeroItemLpco
  **/
  @JsonProperty("numeroItemLpco")
  public Integer getNumeroItemLpco() {
    return numeroItemLpco;
  }

  public void setNumeroItemLpco(Integer numeroItemLpco) {
    this.numeroItemLpco = numeroItemLpco;
  }

  public ConsultaDetalhadaVinculo numeroItemLpco(Integer numeroItemLpco) {
    this.numeroItemLpco = numeroItemLpco;
    return this;
  }

 /**
   * Numero do item da NF-e do item da DUE vinculado ao LPCO&lt;br&gt;
   * @return numeroItemNfe
  **/
  @JsonProperty("numeroItemNfe")
  public BigDecimal getNumeroItemNfe() {
    return numeroItemNfe;
  }

  public void setNumeroItemNfe(BigDecimal numeroItemNfe) {
    this.numeroItemNfe = numeroItemNfe;
  }

  public ConsultaDetalhadaVinculo numeroItemNfe(BigDecimal numeroItemNfe) {
    this.numeroItemNfe = numeroItemNfe;
    return this;
  }

 /**
   * Peso líquido do item da DUE / DUIMP vinculado ao LPCO&lt;br&gt;Tamanho: 14,5 + &lt;br&gt;Formato: Decimal, com até 6 casas decimais separadas por ponto
   * @return pesoLiquido
  **/
  @JsonProperty("pesoLiquido")
  public BigDecimal getPesoLiquido() {
    return pesoLiquido;
  }

  public void setPesoLiquido(BigDecimal pesoLiquido) {
    this.pesoLiquido = pesoLiquido;
  }

  public ConsultaDetalhadaVinculo pesoLiquido(BigDecimal pesoLiquido) {
    this.pesoLiquido = pesoLiquido;
    return this;
  }

 /**
   * Quantidade na unidade comercializada do item da DUE / DUIMP vinculado ao LPCO.&lt;br&gt;Tamanho: 14,5 + &lt;br&gt;Formato: Decimal, com até 6 casas decimais separadas por ponto
   * @return quantidadeComercializada
  **/
  @JsonProperty("quantidadeComercializada")
  public BigDecimal getQuantidadeComercializada() {
    return quantidadeComercializada;
  }

  public void setQuantidadeComercializada(BigDecimal quantidadeComercializada) {
    this.quantidadeComercializada = quantidadeComercializada;
  }

  public ConsultaDetalhadaVinculo quantidadeComercializada(BigDecimal quantidadeComercializada) {
    this.quantidadeComercializada = quantidadeComercializada;
    return this;
  }

 /**
   * Quantidade na unidade estatística do item da DUE / DUIMP vinculado ao LPCO.&lt;br&gt;Tamanho: 14,5 + &lt;br&gt;Formato: Decimal, com até 6 casas decimais separadas por ponto
   * @return quantidadeUnidadeEstatistica
  **/
  @JsonProperty("quantidadeUnidadeEstatistica")
  public BigDecimal getQuantidadeUnidadeEstatistica() {
    return quantidadeUnidadeEstatistica;
  }

  public void setQuantidadeUnidadeEstatistica(BigDecimal quantidadeUnidadeEstatistica) {
    this.quantidadeUnidadeEstatistica = quantidadeUnidadeEstatistica;
  }

  public ConsultaDetalhadaVinculo quantidadeUnidadeEstatistica(BigDecimal quantidadeUnidadeEstatistica) {
    this.quantidadeUnidadeEstatistica = quantidadeUnidadeEstatistica;
    return this;
  }

 /**
   * Valor na condição de venda do item da DUE / DUIMP vinculado ao LPCO&lt;br&gt;Tamanho: 15,2 + &lt;br&gt;Formato: Decimal, com até 2 casas decimais separadas por ponto
   * @return valorCondicaoVenda
  **/
  @JsonProperty("valorCondicaoVenda")
  public BigDecimal getValorCondicaoVenda() {
    return valorCondicaoVenda;
  }

  public void setValorCondicaoVenda(BigDecimal valorCondicaoVenda) {
    this.valorCondicaoVenda = valorCondicaoVenda;
  }

  public ConsultaDetalhadaVinculo valorCondicaoVenda(BigDecimal valorCondicaoVenda) {
    this.valorCondicaoVenda = valorCondicaoVenda;
    return this;
  }

 /**
   * Valor financiado do item da DUE / DUIMP vinculado ao LPCO&lt;br&gt;Tamanho: 15,2 + &lt;br&gt;Formato: Decimal, com até 2 casas decimais separadas por ponto
   * @return valorFinanciado
  **/
  @JsonProperty("valorFinanciado")
  public BigDecimal getValorFinanciado() {
    return valorFinanciado;
  }

  public void setValorFinanciado(BigDecimal valorFinanciado) {
    this.valorFinanciado = valorFinanciado;
  }

  public ConsultaDetalhadaVinculo valorFinanciado(BigDecimal valorFinanciado) {
    this.valorFinanciado = valorFinanciado;
    return this;
  }

 /**
   * Valor do item da DUE / DUIMP vinculado ao LPCO&lt;br&gt;
   * @return valorItem
  **/
  @JsonProperty("valorItem")
  public BigDecimal getValorItem() {
    return valorItem;
  }

  public void setValorItem(BigDecimal valorItem) {
    this.valorItem = valorItem;
  }

  public ConsultaDetalhadaVinculo valorItem(BigDecimal valorItem) {
    this.valorItem = valorItem;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsultaDetalhadaVinculo {\n");
    
    sb.append("    chaveNfe: ").append(toIndentedString(chaveNfe)).append("\n");
    sb.append("    dataCancelamentoDocumento: ").append(toIndentedString(dataCancelamentoDocumento)).append("\n");
    sb.append("    dataExclusao: ").append(toIndentedString(dataExclusao)).append("\n");
    sb.append("    dataVinculo: ").append(toIndentedString(dataVinculo)).append("\n");
    sb.append("    estornaDesvinculo: ").append(toIndentedString(estornaDesvinculo)).append("\n");
    sb.append("    idVersao: ").append(toIndentedString(idVersao)).append("\n");
    sb.append("    ncm: ").append(toIndentedString(ncm)).append("\n");
    sb.append("    numeroDocumento: ").append(toIndentedString(numeroDocumento)).append("\n");
    sb.append("    numeroDocumentoItem: ").append(toIndentedString(numeroDocumentoItem)).append("\n");
    sb.append("    numeroItemLpco: ").append(toIndentedString(numeroItemLpco)).append("\n");
    sb.append("    numeroItemNfe: ").append(toIndentedString(numeroItemNfe)).append("\n");
    sb.append("    pesoLiquido: ").append(toIndentedString(pesoLiquido)).append("\n");
    sb.append("    quantidadeComercializada: ").append(toIndentedString(quantidadeComercializada)).append("\n");
    sb.append("    quantidadeUnidadeEstatistica: ").append(toIndentedString(quantidadeUnidadeEstatistica)).append("\n");
    sb.append("    valorCondicaoVenda: ").append(toIndentedString(valorCondicaoVenda)).append("\n");
    sb.append("    valorFinanciado: ").append(toIndentedString(valorFinanciado)).append("\n");
    sb.append("    valorItem: ").append(toIndentedString(valorItem)).append("\n");
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

