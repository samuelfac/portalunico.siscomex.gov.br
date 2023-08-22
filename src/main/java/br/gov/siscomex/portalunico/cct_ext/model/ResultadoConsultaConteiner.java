package br.gov.siscomex.portalunico.cct_ext.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "ResultadoConsultaConteiner", propOrder =
    { "numeroConteiner", "pesoBruto", "motivoNaoPesagem", "tara", "lacres", "documentosCarga", "documentosTransporte", "permiteMovimentacao"
})

@XmlRootElement(name="ResultadoConsultaConteiner")
/**
  * Resultado da consulta do contêiner
 **/
@ApiModel(description="Resultado da consulta do contêiner")
public class ResultadoConsultaConteiner  {
  
  @XmlElement(name="numeroConteiner")
  @ApiModelProperty(example = "SXYOU6BXDF", value = "Número Contêiner<br>Tamanho: 20<br>Formato: AAAAAAAAAAAAAAAAAAAA")
 /**
   * Número Contêiner<br>Tamanho: 20<br>Formato: AAAAAAAAAAAAAAAAAAAA
  **/
  private String numeroConteiner = null;

  @XmlElement(name="pesoBruto")
  @ApiModelProperty(example = "1500.252", value = "Peso Bruto<br>Tamanho: 12.3<br>Formato: Decimal, com três casas decimais separadas por ponto")
 /**
   * Peso Bruto<br>Tamanho: 12.3<br>Formato: Decimal, com três casas decimais separadas por ponto
  **/
  private String pesoBruto = null;

  @XmlElement(name="motivoNaoPesagem")
  @ApiModelProperty(example = "Motivo da não pesagem<br>Tamanho: 250", value = "Tamanho mínimo: 1<br>Tamanho máximo: 250")
 /**
   * Tamanho mínimo: 1<br>Tamanho máximo: 250
  **/
  private String motivoNaoPesagem = null;

  @XmlElement(name="tara")
  @ApiModelProperty(example = "400.252", value = "Tara<br>Tamanho: 12.3<br>Formato: Decimal, com três casas decimais separadas por ponto")
 /**
   * Tara<br>Tamanho: 12.3<br>Formato: Decimal, com três casas decimais separadas por ponto
  **/
  private String tara = null;

  @XmlElement(name="lacres")
  @ApiModelProperty(example = "[ABC123,CDE456,EDR5676]", value = "Lacre<br>Tamanho: 15")
 /**
   * Lacre<br>Tamanho: 15
  **/
  private List<String> lacres = null;

  @XmlElement(name="documentosCarga")
  @ApiModelProperty(value = "")
  @Valid
  private List<DocumentosCarga> documentosCarga = null;

  @XmlElement(name="documentosTransporte")
  @ApiModelProperty(value = "")
  @Valid
  private List<DocumentosTransporte> documentosTransporte = null;

  @XmlElement(name="permiteMovimentacao")
  @ApiModelProperty(example = "true", value = "")
  private Boolean permiteMovimentacao = false;
 /**
   * Número Contêiner&lt;br&gt;Tamanho: 20&lt;br&gt;Formato: AAAAAAAAAAAAAAAAAAAA
   * @return numeroConteiner
  **/
  @JsonProperty("numeroConteiner")
  public String getNumeroConteiner() {
    return numeroConteiner;
  }

  public void setNumeroConteiner(String numeroConteiner) {
    this.numeroConteiner = numeroConteiner;
  }

  public ResultadoConsultaConteiner numeroConteiner(String numeroConteiner) {
    this.numeroConteiner = numeroConteiner;
    return this;
  }

 /**
   * Peso Bruto&lt;br&gt;Tamanho: 12.3&lt;br&gt;Formato: Decimal, com três casas decimais separadas por ponto
   * @return pesoBruto
  **/
  @JsonProperty("pesoBruto")
  public String getPesoBruto() {
    return pesoBruto;
  }

  public void setPesoBruto(String pesoBruto) {
    this.pesoBruto = pesoBruto;
  }

  public ResultadoConsultaConteiner pesoBruto(String pesoBruto) {
    this.pesoBruto = pesoBruto;
    return this;
  }

 /**
   * Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 250
   * @return motivoNaoPesagem
  **/
  @JsonProperty("motivoNaoPesagem")
  public String getMotivoNaoPesagem() {
    return motivoNaoPesagem;
  }

  public void setMotivoNaoPesagem(String motivoNaoPesagem) {
    this.motivoNaoPesagem = motivoNaoPesagem;
  }

  public ResultadoConsultaConteiner motivoNaoPesagem(String motivoNaoPesagem) {
    this.motivoNaoPesagem = motivoNaoPesagem;
    return this;
  }

 /**
   * Tara&lt;br&gt;Tamanho: 12.3&lt;br&gt;Formato: Decimal, com três casas decimais separadas por ponto
   * @return tara
  **/
  @JsonProperty("tara")
  public String getTara() {
    return tara;
  }

  public void setTara(String tara) {
    this.tara = tara;
  }

  public ResultadoConsultaConteiner tara(String tara) {
    this.tara = tara;
    return this;
  }

 /**
   * Lacre&lt;br&gt;Tamanho: 15
   * @return lacres
  **/
  @JsonProperty("lacres")
  public List<String> getLacres() {
    return lacres;
  }

  public void setLacres(List<String> lacres) {
    this.lacres = lacres;
  }

  public ResultadoConsultaConteiner lacres(List<String> lacres) {
    this.lacres = lacres;
    return this;
  }

  public ResultadoConsultaConteiner addLacresItem(String lacresItem) {
    this.lacres.add(lacresItem);
    return this;
  }

 /**
   * Get documentosCarga
   * @return documentosCarga
  **/
  @JsonProperty("documentosCarga")
  public List<DocumentosCarga> getDocumentosCarga() {
    return documentosCarga;
  }

  public void setDocumentosCarga(List<DocumentosCarga> documentosCarga) {
    this.documentosCarga = documentosCarga;
  }

  public ResultadoConsultaConteiner documentosCarga(List<DocumentosCarga> documentosCarga) {
    this.documentosCarga = documentosCarga;
    return this;
  }

  public ResultadoConsultaConteiner addDocumentosCargaItem(DocumentosCarga documentosCargaItem) {
    this.documentosCarga.add(documentosCargaItem);
    return this;
  }

 /**
   * Get documentosTransporte
   * @return documentosTransporte
  **/
  @JsonProperty("documentosTransporte")
  public List<DocumentosTransporte> getDocumentosTransporte() {
    return documentosTransporte;
  }

  public void setDocumentosTransporte(List<DocumentosTransporte> documentosTransporte) {
    this.documentosTransporte = documentosTransporte;
  }

  public ResultadoConsultaConteiner documentosTransporte(List<DocumentosTransporte> documentosTransporte) {
    this.documentosTransporte = documentosTransporte;
    return this;
  }

  public ResultadoConsultaConteiner addDocumentosTransporteItem(DocumentosTransporte documentosTransporteItem) {
    this.documentosTransporte.add(documentosTransporteItem);
    return this;
  }

 /**
   * Get permiteMovimentacao
   * @return permiteMovimentacao
  **/
  @JsonProperty("permiteMovimentacao")
  public Boolean isPermiteMovimentacao() {
    return permiteMovimentacao;
  }

  public void setPermiteMovimentacao(Boolean permiteMovimentacao) {
    this.permiteMovimentacao = permiteMovimentacao;
  }

  public ResultadoConsultaConteiner permiteMovimentacao(Boolean permiteMovimentacao) {
    this.permiteMovimentacao = permiteMovimentacao;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResultadoConsultaConteiner {\n");
    
    sb.append("    numeroConteiner: ").append(toIndentedString(numeroConteiner)).append("\n");
    sb.append("    pesoBruto: ").append(toIndentedString(pesoBruto)).append("\n");
    sb.append("    motivoNaoPesagem: ").append(toIndentedString(motivoNaoPesagem)).append("\n");
    sb.append("    tara: ").append(toIndentedString(tara)).append("\n");
    sb.append("    lacres: ").append(toIndentedString(lacres)).append("\n");
    sb.append("    documentosCarga: ").append(toIndentedString(documentosCarga)).append("\n");
    sb.append("    documentosTransporte: ").append(toIndentedString(documentosTransporte)).append("\n");
    sb.append("    permiteMovimentacao: ").append(toIndentedString(permiteMovimentacao)).append("\n");
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

