package br.gov.siscomex.portalunico.cct_ext.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.*;
import java.math.BigDecimal;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "Carga", propOrder =
    { "consignatario", "remetente", "destinatario", "codigoAduanaDestino", "nomeAduanaDestino", "paisOrigemMercadorias", "valorFOTMercadorias", "moedaValorFOT", "valorSeguro", "moedaValorSeguro", "codigoTiposVolumes", "nomeTiposVolumes", "qtdeVolumes", "pesoBruto", "descricaoMercadorias", "documentosAnexos", "nfes"
})

@XmlRootElement(name="Carga")
/**
  * Dados da carga
 **/
@ApiModel(description="Dados da carga")
public class Carga  {
  
  @XmlElement(name="consignatario", required = true)
  @ApiModelProperty(required = true, value = "")
  @Valid
  private Consignatario consignatario = null;

  @XmlElement(name="remetente", required = true)
  @ApiModelProperty(required = true, value = "")
  @Valid
  private Remetente remetente = null;

  @XmlElement(name="destinatario", required = true)
  @ApiModelProperty(required = true, value = "")
  @Valid
  private Destinatrio destinatario = null;

  @XmlElement(name="codigoAduanaDestino")
  @ApiModelProperty(example = "12AB567", value = "Código da aduana de destino<br>Tamanho: 7<br>Formato: AAAAAAA")
 /**
   * Código da aduana de destino<br>Tamanho: 7<br>Formato: AAAAAAA
  **/
  private String codigoAduanaDestino = null;

  @XmlElement(name="nomeAduanaDestino", required = true)
  @ApiModelProperty(example = "Buenos Aires Aduana", required = true, value = "Nome da aduana de destino<br>Tamanho: 60")
 /**
   * Nome da aduana de destino<br>Tamanho: 60
  **/
  private String nomeAduanaDestino = null;

  @XmlElement(name="paisOrigemMercadorias", required = true)
  @ApiModelProperty(example = "BR", required = true, value = "Sigla do país de origem das mercadorias<br>Tamanho: 2<br>Formato: AA<br>Sigla ISO/Alfa 2 do país")
 /**
   * Sigla do país de origem das mercadorias<br>Tamanho: 2<br>Formato: AA<br>Sigla ISO/Alfa 2 do país
  **/
  private String paisOrigemMercadorias = null;

  @XmlElement(name="valorFOTMercadorias", required = true)
  @ApiModelProperty(example = "20000.0", required = true, value = "Valor FOT das mercadorias<br>Tamanho: 15.2<br>Formato: NNNNNNNNNNNNNNN.NN")
  @Valid
 /**
   * Valor FOT das mercadorias<br>Tamanho: 15.2<br>Formato: NNNNNNNNNNNNNNN.NN
  **/
  private BigDecimal valorFOTMercadorias = null;

  @XmlElement(name="moedaValorFOT", required = true)
  @ApiModelProperty(example = "220", required = true, value = "Código da moeda FOT das mercadorias<br>Tamanho: 3<br>Formato: NNN")
 /**
   * Código da moeda FOT das mercadorias<br>Tamanho: 3<br>Formato: NNN
  **/
  private String moedaValorFOT = null;

  @XmlElement(name="valorSeguro")
  @ApiModelProperty(example = "1000.0", value = "Valor do seguro<br>Tamanho: 14.2<br>Formato: NNNNNNNNNNNNNN.NN")
  @Valid
 /**
   * Valor do seguro<br>Tamanho: 14.2<br>Formato: NNNNNNNNNNNNNN.NN
  **/
  private BigDecimal valorSeguro = null;

  @XmlElement(name="moedaValorSeguro")
  @ApiModelProperty(example = "220", value = "Código da moeda do seguro<br>Tamanho: 3<br>Formato: NNN")
 /**
   * Código da moeda do seguro<br>Tamanho: 3<br>Formato: NNN
  **/
  private String moedaValorSeguro = null;

  @XmlElement(name="codigoTiposVolumes")
  @ApiModelProperty(example = "1", value = "Código do tipo de volume<br>Tamanho: 2<br>Formato: NN")
 /**
   * Código do tipo de volume<br>Tamanho: 2<br>Formato: NN
  **/
  private Integer codigoTiposVolumes = null;

  @XmlElement(name="nomeTiposVolumes", required = true)
  @ApiModelProperty(example = "caixas", required = true, value = "Nome do tipo de volume<br>Tamanho: 15")
 /**
   * Nome do tipo de volume<br>Tamanho: 15
  **/
  private String nomeTiposVolumes = null;

  @XmlElement(name="qtdeVolumes")
  @ApiModelProperty(example = "123456", value = "Quantidade do volume<br>Tamanho: 6<br>Formato: NNNNNN")
 /**
   * Quantidade do volume<br>Tamanho: 6<br>Formato: NNNNNN
  **/
  private Integer qtdeVolumes = null;

  @XmlElement(name="pesoBruto", required = true)
  @ApiModelProperty(example = "100000.0", required = true, value = "Peso Bruto (kg) da mercadoria<br>Tamanho: 12.3<br>Formato: NNNNNNNNNNNN.NNN")
  @Valid
 /**
   * Peso Bruto (kg) da mercadoria<br>Tamanho: 12.3<br>Formato: NNNNNNNNNNNN.NNN
  **/
  private BigDecimal pesoBruto = null;

  @XmlElement(name="descricaoMercadorias", required = true)
  @ApiModelProperty(example = "mercadoria", required = true, value = "Descrição das mercadoria<br>Tamanho: 520<br>Marcas e números dos volumes, descrição das mercadorias.")
 /**
   * Descrição das mercadoria<br>Tamanho: 520<br>Marcas e números dos volumes, descrição das mercadorias.
  **/
  private String descricaoMercadorias = null;

  @XmlElement(name="documentosAnexos", required = true)
  @ApiModelProperty(example = "Documento 1234", required = true, value = "Documentos anexos<br>Tamanho: 400")
 /**
   * Documentos anexos<br>Tamanho: 400
  **/
  private String documentosAnexos = null;

  @XmlElement(name="nfes", required = true)
  @ApiModelProperty(required = true, value = "")
  @Valid
  private Nfes nfes = null;
 /**
   * Get consignatario
   * @return consignatario
  **/
  @JsonProperty("consignatario")
  @NotNull
  public Consignatario getConsignatario() {
    return consignatario;
  }

  public void setConsignatario(Consignatario consignatario) {
    this.consignatario = consignatario;
  }

  public Carga consignatario(Consignatario consignatario) {
    this.consignatario = consignatario;
    return this;
  }

 /**
   * Get remetente
   * @return remetente
  **/
  @JsonProperty("remetente")
  @NotNull
  public Remetente getRemetente() {
    return remetente;
  }

  public void setRemetente(Remetente remetente) {
    this.remetente = remetente;
  }

  public Carga remetente(Remetente remetente) {
    this.remetente = remetente;
    return this;
  }

 /**
   * Get destinatario
   * @return destinatario
  **/
  @JsonProperty("destinatario")
  @NotNull
  public Destinatrio getDestinatario() {
    return destinatario;
  }

  public void setDestinatario(Destinatrio destinatario) {
    this.destinatario = destinatario;
  }

  public Carga destinatario(Destinatrio destinatario) {
    this.destinatario = destinatario;
    return this;
  }

 /**
   * Código da aduana de destino&lt;br&gt;Tamanho: 7&lt;br&gt;Formato: AAAAAAA
   * @return codigoAduanaDestino
  **/
  @JsonProperty("codigoAduanaDestino")
  public String getCodigoAduanaDestino() {
    return codigoAduanaDestino;
  }

  public void setCodigoAduanaDestino(String codigoAduanaDestino) {
    this.codigoAduanaDestino = codigoAduanaDestino;
  }

  public Carga codigoAduanaDestino(String codigoAduanaDestino) {
    this.codigoAduanaDestino = codigoAduanaDestino;
    return this;
  }

 /**
   * Nome da aduana de destino&lt;br&gt;Tamanho: 60
   * @return nomeAduanaDestino
  **/
  @JsonProperty("nomeAduanaDestino")
  @NotNull
  public String getNomeAduanaDestino() {
    return nomeAduanaDestino;
  }

  public void setNomeAduanaDestino(String nomeAduanaDestino) {
    this.nomeAduanaDestino = nomeAduanaDestino;
  }

  public Carga nomeAduanaDestino(String nomeAduanaDestino) {
    this.nomeAduanaDestino = nomeAduanaDestino;
    return this;
  }

 /**
   * Sigla do país de origem das mercadorias&lt;br&gt;Tamanho: 2&lt;br&gt;Formato: AA&lt;br&gt;Sigla ISO/Alfa 2 do país
   * @return paisOrigemMercadorias
  **/
  @JsonProperty("paisOrigemMercadorias")
  @NotNull
  public String getPaisOrigemMercadorias() {
    return paisOrigemMercadorias;
  }

  public void setPaisOrigemMercadorias(String paisOrigemMercadorias) {
    this.paisOrigemMercadorias = paisOrigemMercadorias;
  }

  public Carga paisOrigemMercadorias(String paisOrigemMercadorias) {
    this.paisOrigemMercadorias = paisOrigemMercadorias;
    return this;
  }

 /**
   * Valor FOT das mercadorias&lt;br&gt;Tamanho: 15.2&lt;br&gt;Formato: NNNNNNNNNNNNNNN.NN
   * @return valorFOTMercadorias
  **/
  @JsonProperty("valorFOTMercadorias")
  @NotNull
  public BigDecimal getValorFOTMercadorias() {
    return valorFOTMercadorias;
  }

  public void setValorFOTMercadorias(BigDecimal valorFOTMercadorias) {
    this.valorFOTMercadorias = valorFOTMercadorias;
  }

  public Carga valorFOTMercadorias(BigDecimal valorFOTMercadorias) {
    this.valorFOTMercadorias = valorFOTMercadorias;
    return this;
  }

 /**
   * Código da moeda FOT das mercadorias&lt;br&gt;Tamanho: 3&lt;br&gt;Formato: NNN
   * @return moedaValorFOT
  **/
  @JsonProperty("moedaValorFOT")
  @NotNull
  public String getMoedaValorFOT() {
    return moedaValorFOT;
  }

  public void setMoedaValorFOT(String moedaValorFOT) {
    this.moedaValorFOT = moedaValorFOT;
  }

  public Carga moedaValorFOT(String moedaValorFOT) {
    this.moedaValorFOT = moedaValorFOT;
    return this;
  }

 /**
   * Valor do seguro&lt;br&gt;Tamanho: 14.2&lt;br&gt;Formato: NNNNNNNNNNNNNN.NN
   * @return valorSeguro
  **/
  @JsonProperty("valorSeguro")
  public BigDecimal getValorSeguro() {
    return valorSeguro;
  }

  public void setValorSeguro(BigDecimal valorSeguro) {
    this.valorSeguro = valorSeguro;
  }

  public Carga valorSeguro(BigDecimal valorSeguro) {
    this.valorSeguro = valorSeguro;
    return this;
  }

 /**
   * Código da moeda do seguro&lt;br&gt;Tamanho: 3&lt;br&gt;Formato: NNN
   * @return moedaValorSeguro
  **/
  @JsonProperty("moedaValorSeguro")
  public String getMoedaValorSeguro() {
    return moedaValorSeguro;
  }

  public void setMoedaValorSeguro(String moedaValorSeguro) {
    this.moedaValorSeguro = moedaValorSeguro;
  }

  public Carga moedaValorSeguro(String moedaValorSeguro) {
    this.moedaValorSeguro = moedaValorSeguro;
    return this;
  }

 /**
   * Código do tipo de volume&lt;br&gt;Tamanho: 2&lt;br&gt;Formato: NN
   * @return codigoTiposVolumes
  **/
  @JsonProperty("codigoTiposVolumes")
  public Integer getCodigoTiposVolumes() {
    return codigoTiposVolumes;
  }

  public void setCodigoTiposVolumes(Integer codigoTiposVolumes) {
    this.codigoTiposVolumes = codigoTiposVolumes;
  }

  public Carga codigoTiposVolumes(Integer codigoTiposVolumes) {
    this.codigoTiposVolumes = codigoTiposVolumes;
    return this;
  }

 /**
   * Nome do tipo de volume&lt;br&gt;Tamanho: 15
   * @return nomeTiposVolumes
  **/
  @JsonProperty("nomeTiposVolumes")
  @NotNull
  public String getNomeTiposVolumes() {
    return nomeTiposVolumes;
  }

  public void setNomeTiposVolumes(String nomeTiposVolumes) {
    this.nomeTiposVolumes = nomeTiposVolumes;
  }

  public Carga nomeTiposVolumes(String nomeTiposVolumes) {
    this.nomeTiposVolumes = nomeTiposVolumes;
    return this;
  }

 /**
   * Quantidade do volume&lt;br&gt;Tamanho: 6&lt;br&gt;Formato: NNNNNN
   * @return qtdeVolumes
  **/
  @JsonProperty("qtdeVolumes")
  public Integer getQtdeVolumes() {
    return qtdeVolumes;
  }

  public void setQtdeVolumes(Integer qtdeVolumes) {
    this.qtdeVolumes = qtdeVolumes;
  }

  public Carga qtdeVolumes(Integer qtdeVolumes) {
    this.qtdeVolumes = qtdeVolumes;
    return this;
  }

 /**
   * Peso Bruto (kg) da mercadoria&lt;br&gt;Tamanho: 12.3&lt;br&gt;Formato: NNNNNNNNNNNN.NNN
   * @return pesoBruto
  **/
  @JsonProperty("pesoBruto")
  @NotNull
  public BigDecimal getPesoBruto() {
    return pesoBruto;
  }

  public void setPesoBruto(BigDecimal pesoBruto) {
    this.pesoBruto = pesoBruto;
  }

  public Carga pesoBruto(BigDecimal pesoBruto) {
    this.pesoBruto = pesoBruto;
    return this;
  }

 /**
   * Descrição das mercadoria&lt;br&gt;Tamanho: 520&lt;br&gt;Marcas e números dos volumes, descrição das mercadorias.
   * @return descricaoMercadorias
  **/
  @JsonProperty("descricaoMercadorias")
  @NotNull
  public String getDescricaoMercadorias() {
    return descricaoMercadorias;
  }

  public void setDescricaoMercadorias(String descricaoMercadorias) {
    this.descricaoMercadorias = descricaoMercadorias;
  }

  public Carga descricaoMercadorias(String descricaoMercadorias) {
    this.descricaoMercadorias = descricaoMercadorias;
    return this;
  }

 /**
   * Documentos anexos&lt;br&gt;Tamanho: 400
   * @return documentosAnexos
  **/
  @JsonProperty("documentosAnexos")
  @NotNull
  public String getDocumentosAnexos() {
    return documentosAnexos;
  }

  public void setDocumentosAnexos(String documentosAnexos) {
    this.documentosAnexos = documentosAnexos;
  }

  public Carga documentosAnexos(String documentosAnexos) {
    this.documentosAnexos = documentosAnexos;
    return this;
  }

 /**
   * Get nfes
   * @return nfes
  **/
  @JsonProperty("nfes")
  @NotNull
  public Nfes getNfes() {
    return nfes;
  }

  public void setNfes(Nfes nfes) {
    this.nfes = nfes;
  }

  public Carga nfes(Nfes nfes) {
    this.nfes = nfes;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Carga {\n");
    
    sb.append("    consignatario: ").append(toIndentedString(consignatario)).append("\n");
    sb.append("    remetente: ").append(toIndentedString(remetente)).append("\n");
    sb.append("    destinatario: ").append(toIndentedString(destinatario)).append("\n");
    sb.append("    codigoAduanaDestino: ").append(toIndentedString(codigoAduanaDestino)).append("\n");
    sb.append("    nomeAduanaDestino: ").append(toIndentedString(nomeAduanaDestino)).append("\n");
    sb.append("    paisOrigemMercadorias: ").append(toIndentedString(paisOrigemMercadorias)).append("\n");
    sb.append("    valorFOTMercadorias: ").append(toIndentedString(valorFOTMercadorias)).append("\n");
    sb.append("    moedaValorFOT: ").append(toIndentedString(moedaValorFOT)).append("\n");
    sb.append("    valorSeguro: ").append(toIndentedString(valorSeguro)).append("\n");
    sb.append("    moedaValorSeguro: ").append(toIndentedString(moedaValorSeguro)).append("\n");
    sb.append("    codigoTiposVolumes: ").append(toIndentedString(codigoTiposVolumes)).append("\n");
    sb.append("    nomeTiposVolumes: ").append(toIndentedString(nomeTiposVolumes)).append("\n");
    sb.append("    qtdeVolumes: ").append(toIndentedString(qtdeVolumes)).append("\n");
    sb.append("    pesoBruto: ").append(toIndentedString(pesoBruto)).append("\n");
    sb.append("    descricaoMercadorias: ").append(toIndentedString(descricaoMercadorias)).append("\n");
    sb.append("    documentosAnexos: ").append(toIndentedString(documentosAnexos)).append("\n");
    sb.append("    nfes: ").append(toIndentedString(nfes)).append("\n");
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

