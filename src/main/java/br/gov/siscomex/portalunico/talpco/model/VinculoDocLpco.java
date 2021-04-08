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
 @XmlType(name = "VinculoDocLpco", propOrder =
    { "dataACD", "dataAverbacao", "dataCCE", "dataDesembaraco", "dataDesvinculacao", "dataVinculo", "numeroDocumento", "numeroDocumentoItem", "quantidadeComercial", "quantidadeUnidadeEstatistica", "vmle"
})

@XmlRootElement(name="VinculoDocLpco")
/**
  * Dados de um vínculo entre um LPCO e uma DU-E / DUIMP
 **/
@ApiModel(description="Dados de um vínculo entre um LPCO e uma DU-E / DUIMP")
public class VinculoDocLpco  {
  
  @XmlElement(name="dataACD")
  @ApiModelProperty(example = "25/11/2020", value = "Data de ACD da DU-E vinculada ao LPCO<br>Formato: dd/MM/yyyy")
 /**
   * Data de ACD da DU-E vinculada ao LPCO<br>Formato: dd/MM/yyyy
  **/
  private String dataACD = null;

  @XmlElement(name="dataAverbacao")
  @ApiModelProperty(example = "25/11/2020", value = "Data de averbação da DU-E vinculada ao LPCO<br>Formato: dd/MM/yyyy")
 /**
   * Data de averbação da DU-E vinculada ao LPCO<br>Formato: dd/MM/yyyy
  **/
  private String dataAverbacao = null;

  @XmlElement(name="dataCCE")
  @ApiModelProperty(example = "25/11/2020", value = "Data de CCE da DU-E vinculada ao LPCO<br>Formato: dd/MM/yyyy")
 /**
   * Data de CCE da DU-E vinculada ao LPCO<br>Formato: dd/MM/yyyy
  **/
  private String dataCCE = null;

  @XmlElement(name="dataDesembaraco")
  @ApiModelProperty(example = "25/11/2020", value = "Data de desembaraço da DU-E vinculada ao LPCO<br>Formato: dd/MM/yyyy")
 /**
   * Data de desembaraço da DU-E vinculada ao LPCO<br>Formato: dd/MM/yyyy
  **/
  private String dataDesembaraco = null;

  @XmlElement(name="dataDesvinculacao")
  @ApiModelProperty(example = "25/11/2020", value = "Se preenchido, este campo indica a data em que o vínculo entre a DU-E deixou de ser válido.Se este campo estiver vazio, significa que o vínculo ainda é válido<br>Formato: dd/MM/yyyy")
 /**
   * Se preenchido, este campo indica a data em que o vínculo entre a DU-E deixou de ser válido.Se este campo estiver vazio, significa que o vínculo ainda é válido<br>Formato: dd/MM/yyyy
  **/
  private String dataDesvinculacao = null;

  @XmlElement(name="dataVinculo", required = true)
  @ApiModelProperty(example = "25/11/2020", required = true, value = "Data em que o vínculo entre o LPCO e a DU-E foi criado<br>Formato: dd/MM/yyyy")
 /**
   * Data em que o vínculo entre o LPCO e a DU-E foi criado<br>Formato: dd/MM/yyyy
  **/
  private String dataVinculo = null;

  @XmlElement(name="numeroDocumento", required = true)
  @ApiModelProperty(example = "19BR0000001234", required = true, value = "Número da DU-E vinculada ao LPCO<br>Tamanho mínimo: 14<br>Tamanho máximo: 14")
 /**
   * Número da DU-E vinculada ao LPCO<br>Tamanho mínimo: 14<br>Tamanho máximo: 14
  **/
  private String numeroDocumento = null;

  @XmlElement(name="numeroDocumentoItem", required = true)
  @ApiModelProperty(example = "1", required = true, value = "Número do item da DU-E ao qual o LPCO foi vinculado")
 /**
   * Número do item da DU-E ao qual o LPCO foi vinculado
  **/
  private Long numeroDocumentoItem = null;

  @XmlElement(name="quantidadeComercial")
  @ApiModelProperty(example = "100.001122", value = "Se o LPCO  tiver um campo com código QTDE_COMERCIALIZADA, este campo indicará qual é a quantidade da cota definida pelo LPCO que foi consumida por este vínculo<br>Formato: número com precisão máxima de 6 casas decimais")
  @Valid
 /**
   * Se o LPCO  tiver um campo com código QTDE_COMERCIALIZADA, este campo indicará qual é a quantidade da cota definida pelo LPCO que foi consumida por este vínculo<br>Formato: número com precisão máxima de 6 casas decimais
  **/
  private BigDecimal quantidadeComercial = null;

  @XmlElement(name="quantidadeUnidadeEstatistica")
  @ApiModelProperty(example = "100.001122", value = "Se o LPCO  tiver um campo com código QTDE_ESTATISTICA, este campo indicará qual é a quantidade da cota definida pelo LPCO que foi consumida por este vínculo<br>Formato: número com precisão máxima de 6 casas decimais")
  @Valid
 /**
   * Se o LPCO  tiver um campo com código QTDE_ESTATISTICA, este campo indicará qual é a quantidade da cota definida pelo LPCO que foi consumida por este vínculo<br>Formato: número com precisão máxima de 6 casas decimais
  **/
  private BigDecimal quantidadeUnidadeEstatistica = null;

  @XmlElement(name="vmle")
  @ApiModelProperty(example = "100.01", value = "Se o LPCO  tiver um campo com código VMLE, este campo indicará qual é a quantidade da cota definida pelo LPCO que foi consumida por este vínculo<br>Formato: número com precisão máxima de 2 casas decimais")
  @Valid
 /**
   * Se o LPCO  tiver um campo com código VMLE, este campo indicará qual é a quantidade da cota definida pelo LPCO que foi consumida por este vínculo<br>Formato: número com precisão máxima de 2 casas decimais
  **/
  private BigDecimal vmle = null;
 /**
   * Data de ACD da DU-E vinculada ao LPCO&lt;br&gt;Formato: dd/MM/yyyy
   * @return dataACD
  **/
  @JsonProperty("dataACD")
  public String getDataACD() {
    return dataACD;
  }

  public void setDataACD(String dataACD) {
    this.dataACD = dataACD;
  }

  public VinculoDocLpco dataACD(String dataACD) {
    this.dataACD = dataACD;
    return this;
  }

 /**
   * Data de averbação da DU-E vinculada ao LPCO&lt;br&gt;Formato: dd/MM/yyyy
   * @return dataAverbacao
  **/
  @JsonProperty("dataAverbacao")
  public String getDataAverbacao() {
    return dataAverbacao;
  }

  public void setDataAverbacao(String dataAverbacao) {
    this.dataAverbacao = dataAverbacao;
  }

  public VinculoDocLpco dataAverbacao(String dataAverbacao) {
    this.dataAverbacao = dataAverbacao;
    return this;
  }

 /**
   * Data de CCE da DU-E vinculada ao LPCO&lt;br&gt;Formato: dd/MM/yyyy
   * @return dataCCE
  **/
  @JsonProperty("dataCCE")
  public String getDataCCE() {
    return dataCCE;
  }

  public void setDataCCE(String dataCCE) {
    this.dataCCE = dataCCE;
  }

  public VinculoDocLpco dataCCE(String dataCCE) {
    this.dataCCE = dataCCE;
    return this;
  }

 /**
   * Data de desembaraço da DU-E vinculada ao LPCO&lt;br&gt;Formato: dd/MM/yyyy
   * @return dataDesembaraco
  **/
  @JsonProperty("dataDesembaraco")
  public String getDataDesembaraco() {
    return dataDesembaraco;
  }

  public void setDataDesembaraco(String dataDesembaraco) {
    this.dataDesembaraco = dataDesembaraco;
  }

  public VinculoDocLpco dataDesembaraco(String dataDesembaraco) {
    this.dataDesembaraco = dataDesembaraco;
    return this;
  }

 /**
   * Se preenchido, este campo indica a data em que o vínculo entre a DU-E deixou de ser válido.Se este campo estiver vazio, significa que o vínculo ainda é válido&lt;br&gt;Formato: dd/MM/yyyy
   * @return dataDesvinculacao
  **/
  @JsonProperty("dataDesvinculacao")
  public String getDataDesvinculacao() {
    return dataDesvinculacao;
  }

  public void setDataDesvinculacao(String dataDesvinculacao) {
    this.dataDesvinculacao = dataDesvinculacao;
  }

  public VinculoDocLpco dataDesvinculacao(String dataDesvinculacao) {
    this.dataDesvinculacao = dataDesvinculacao;
    return this;
  }

 /**
   * Data em que o vínculo entre o LPCO e a DU-E foi criado&lt;br&gt;Formato: dd/MM/yyyy
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

  public VinculoDocLpco dataVinculo(String dataVinculo) {
    this.dataVinculo = dataVinculo;
    return this;
  }

 /**
   * Número da DU-E vinculada ao LPCO&lt;br&gt;Tamanho mínimo: 14&lt;br&gt;Tamanho máximo: 14
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

  public VinculoDocLpco numeroDocumento(String numeroDocumento) {
    this.numeroDocumento = numeroDocumento;
    return this;
  }

 /**
   * Número do item da DU-E ao qual o LPCO foi vinculado
   * @return numeroDocumentoItem
  **/
  @JsonProperty("numeroDocumentoItem")
  @NotNull
  public Long getNumeroDocumentoItem() {
    return numeroDocumentoItem;
  }

  public void setNumeroDocumentoItem(Long numeroDocumentoItem) {
    this.numeroDocumentoItem = numeroDocumentoItem;
  }

  public VinculoDocLpco numeroDocumentoItem(Long numeroDocumentoItem) {
    this.numeroDocumentoItem = numeroDocumentoItem;
    return this;
  }

 /**
   * Se o LPCO  tiver um campo com código QTDE_COMERCIALIZADA, este campo indicará qual é a quantidade da cota definida pelo LPCO que foi consumida por este vínculo&lt;br&gt;Formato: número com precisão máxima de 6 casas decimais
   * @return quantidadeComercial
  **/
  @JsonProperty("quantidadeComercial")
  public BigDecimal getQuantidadeComercial() {
    return quantidadeComercial;
  }

  public void setQuantidadeComercial(BigDecimal quantidadeComercial) {
    this.quantidadeComercial = quantidadeComercial;
  }

  public VinculoDocLpco quantidadeComercial(BigDecimal quantidadeComercial) {
    this.quantidadeComercial = quantidadeComercial;
    return this;
  }

 /**
   * Se o LPCO  tiver um campo com código QTDE_ESTATISTICA, este campo indicará qual é a quantidade da cota definida pelo LPCO que foi consumida por este vínculo&lt;br&gt;Formato: número com precisão máxima de 6 casas decimais
   * @return quantidadeUnidadeEstatistica
  **/
  @JsonProperty("quantidadeUnidadeEstatistica")
  public BigDecimal getQuantidadeUnidadeEstatistica() {
    return quantidadeUnidadeEstatistica;
  }

  public void setQuantidadeUnidadeEstatistica(BigDecimal quantidadeUnidadeEstatistica) {
    this.quantidadeUnidadeEstatistica = quantidadeUnidadeEstatistica;
  }

  public VinculoDocLpco quantidadeUnidadeEstatistica(BigDecimal quantidadeUnidadeEstatistica) {
    this.quantidadeUnidadeEstatistica = quantidadeUnidadeEstatistica;
    return this;
  }

 /**
   * Se o LPCO  tiver um campo com código VMLE, este campo indicará qual é a quantidade da cota definida pelo LPCO que foi consumida por este vínculo&lt;br&gt;Formato: número com precisão máxima de 2 casas decimais
   * @return vmle
  **/
  @JsonProperty("vmle")
  public BigDecimal getVmle() {
    return vmle;
  }

  public void setVmle(BigDecimal vmle) {
    this.vmle = vmle;
  }

  public VinculoDocLpco vmle(BigDecimal vmle) {
    this.vmle = vmle;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VinculoDocLpco {\n");
    
    sb.append("    dataACD: ").append(toIndentedString(dataACD)).append("\n");
    sb.append("    dataAverbacao: ").append(toIndentedString(dataAverbacao)).append("\n");
    sb.append("    dataCCE: ").append(toIndentedString(dataCCE)).append("\n");
    sb.append("    dataDesembaraco: ").append(toIndentedString(dataDesembaraco)).append("\n");
    sb.append("    dataDesvinculacao: ").append(toIndentedString(dataDesvinculacao)).append("\n");
    sb.append("    dataVinculo: ").append(toIndentedString(dataVinculo)).append("\n");
    sb.append("    numeroDocumento: ").append(toIndentedString(numeroDocumento)).append("\n");
    sb.append("    numeroDocumentoItem: ").append(toIndentedString(numeroDocumentoItem)).append("\n");
    sb.append("    quantidadeComercial: ").append(toIndentedString(quantidadeComercial)).append("\n");
    sb.append("    quantidadeUnidadeEstatistica: ").append(toIndentedString(quantidadeUnidadeEstatistica)).append("\n");
    sb.append("    vmle: ").append(toIndentedString(vmle)).append("\n");
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

