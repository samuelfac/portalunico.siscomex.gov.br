package br.gov.siscomex.portalunico.cct_ext.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "NotaFiscalFormulario", propOrder =
    { "numeroNF", "serieNF", "modeloNF", "aamm", "ufEmissor", "dataEmissao", "identificacaoEmissor", "destinatario", "conteineres", "itensNFF"
})

@XmlRootElement(name="NotaFiscalFormulario")
/**
  * Nota Fiscal Formulário
 **/
@ApiModel(description="Nota Fiscal Formulário")
public class NotaFiscalFormulario  {
  
  @XmlElement(name="numeroNF", required = true)
  @ApiModelProperty(example = "30990001", required = true, value = "Número da nota fiscal<br>Tamanho: 9<br>Não será permitida a inclusão de notas fiscais duplicadas (Atributos idênticos para: numeroNF, serieNF, modeloNF, AAMM, ufEmissor, dataEmissao e identificacaoEmissor).")
 /**
   * Número da nota fiscal<br>Tamanho: 9<br>Não será permitida a inclusão de notas fiscais duplicadas (Atributos idênticos para: numeroNF, serieNF, modeloNF, AAMM, ufEmissor, dataEmissao e identificacaoEmissor).
  **/
  private String numeroNF = null;

  @XmlElement(name="serieNF", required = true)
  @ApiModelProperty(example = "100", required = true, value = "Número de série<br>Tamanho: 3<br>Informar zero se não utilizada a série do documento fiscal.")
 /**
   * Número de série<br>Tamanho: 3<br>Informar zero se não utilizada a série do documento fiscal.
  **/
  private String serieNF = null;

  @XmlElement(name="modeloNF", required = true)
  @ApiModelProperty(example = "01", required = true, value = "Modelo da nota fiscal<br>Tamanho: 2<br>Domínio: 01 (modelo 01), 04 (produtor).")
 /**
   * Modelo da nota fiscal<br>Tamanho: 2<br>Domínio: 01 (modelo 01), 04 (produtor).
  **/
  private String modeloNF = null;

  @XmlElement(name="aamm", required = true)
  @ApiModelProperty(example = "1910", required = true, value = "Ano e mês de emissão<nr>Tamanho: 4<br>Formato: AAMM")
 /**
   * Ano e mês de emissão<nr>Tamanho: 4<br>Formato: AAMM
  **/
  private String aamm = null;

  @XmlElement(name="ufEmissor", required = true)
  @ApiModelProperty(example = "BR-RJ", required = true, value = "Sigla da Unidade da Federação emitente<br>Tamanho: 4<br>Formato: AA<br>Consulte a tabela de domínios “UF” (vide a seção 6.2 deste documento). Exemplo: BR-RJ, BR-AM, BR-PA, etc")
 /**
   * Sigla da Unidade da Federação emitente<br>Tamanho: 4<br>Formato: AA<br>Consulte a tabela de domínios “UF” (vide a seção 6.2 deste documento). Exemplo: BR-RJ, BR-AM, BR-PA, etc
  **/
  private String ufEmissor = null;

  @XmlElement(name="dataEmissao", required = true)
  @ApiModelProperty(example = "15-10-2016", required = true, value = "Data de emissão<br>Formato: AAAA-MM-DD")
 /**
   * Data de emissão<br>Formato: AAAA-MM-DD
  **/
  private String dataEmissao = null;

  @XmlElement(name="identificacaoEmissor", required = true)
  @ApiModelProperty(required = true, value = "")
  @Valid
  private IdentificacaoEmissor identificacaoEmissor = null;

  @XmlElement(name="destinatario", required = true)
  @ApiModelProperty(required = true, value = "")
  @Valid
  private Destinatario destinatario = null;

  @XmlElement(name="conteineres", required = true)
  @ApiModelProperty(required = true, value = "")
  @Valid
  private Conteineres conteineres = null;

  @XmlElement(name="itensNFF", required = true)
  @ApiModelProperty(required = true, value = "")
  @Valid
  private ItensNFF itensNFF = null;
 /**
   * Número da nota fiscal&lt;br&gt;Tamanho: 9&lt;br&gt;Não será permitida a inclusão de notas fiscais duplicadas (Atributos idênticos para: numeroNF, serieNF, modeloNF, AAMM, ufEmissor, dataEmissao e identificacaoEmissor).
   * @return numeroNF
  **/
  @JsonProperty("numeroNF")
  @NotNull
  public String getNumeroNF() {
    return numeroNF;
  }

  public void setNumeroNF(String numeroNF) {
    this.numeroNF = numeroNF;
  }

  public NotaFiscalFormulario numeroNF(String numeroNF) {
    this.numeroNF = numeroNF;
    return this;
  }

 /**
   * Número de série&lt;br&gt;Tamanho: 3&lt;br&gt;Informar zero se não utilizada a série do documento fiscal.
   * @return serieNF
  **/
  @JsonProperty("serieNF")
  @NotNull
  public String getSerieNF() {
    return serieNF;
  }

  public void setSerieNF(String serieNF) {
    this.serieNF = serieNF;
  }

  public NotaFiscalFormulario serieNF(String serieNF) {
    this.serieNF = serieNF;
    return this;
  }

 /**
   * Modelo da nota fiscal&lt;br&gt;Tamanho: 2&lt;br&gt;Domínio: 01 (modelo 01), 04 (produtor).
   * @return modeloNF
  **/
  @JsonProperty("modeloNF")
  @NotNull
  public String getModeloNF() {
    return modeloNF;
  }

  public void setModeloNF(String modeloNF) {
    this.modeloNF = modeloNF;
  }

  public NotaFiscalFormulario modeloNF(String modeloNF) {
    this.modeloNF = modeloNF;
    return this;
  }

 /**
   * Ano e mês de emissão&lt;nr&gt;Tamanho: 4&lt;br&gt;Formato: AAMM
   * @return aamm
  **/
  @JsonProperty("aamm")
  @NotNull
  public String getAamm() {
    return aamm;
  }

  public void setAamm(String aamm) {
    this.aamm = aamm;
  }

  public NotaFiscalFormulario aamm(String aamm) {
    this.aamm = aamm;
    return this;
  }

 /**
   * Sigla da Unidade da Federação emitente&lt;br&gt;Tamanho: 4&lt;br&gt;Formato: AA&lt;br&gt;Consulte a tabela de domínios “UF” (vide a seção 6.2 deste documento). Exemplo: BR-RJ, BR-AM, BR-PA, etc
   * @return ufEmissor
  **/
  @JsonProperty("ufEmissor")
  @NotNull
  public String getUfEmissor() {
    return ufEmissor;
  }

  public void setUfEmissor(String ufEmissor) {
    this.ufEmissor = ufEmissor;
  }

  public NotaFiscalFormulario ufEmissor(String ufEmissor) {
    this.ufEmissor = ufEmissor;
    return this;
  }

 /**
   * Data de emissão&lt;br&gt;Formato: AAAA-MM-DD
   * @return dataEmissao
  **/
  @JsonProperty("dataEmissao")
  @NotNull
  public String getDataEmissao() {
    return dataEmissao;
  }

  public void setDataEmissao(String dataEmissao) {
    this.dataEmissao = dataEmissao;
  }

  public NotaFiscalFormulario dataEmissao(String dataEmissao) {
    this.dataEmissao = dataEmissao;
    return this;
  }

 /**
   * Get identificacaoEmissor
   * @return identificacaoEmissor
  **/
  @JsonProperty("identificacaoEmissor")
  @NotNull
  public IdentificacaoEmissor getIdentificacaoEmissor() {
    return identificacaoEmissor;
  }

  public void setIdentificacaoEmissor(IdentificacaoEmissor identificacaoEmissor) {
    this.identificacaoEmissor = identificacaoEmissor;
  }

  public NotaFiscalFormulario identificacaoEmissor(IdentificacaoEmissor identificacaoEmissor) {
    this.identificacaoEmissor = identificacaoEmissor;
    return this;
  }

 /**
   * Get destinatario
   * @return destinatario
  **/
  @JsonProperty("destinatario")
  @NotNull
  public Destinatario getDestinatario() {
    return destinatario;
  }

  public void setDestinatario(Destinatario destinatario) {
    this.destinatario = destinatario;
  }

  public NotaFiscalFormulario destinatario(Destinatario destinatario) {
    this.destinatario = destinatario;
    return this;
  }

 /**
   * Get conteineres
   * @return conteineres
  **/
  @JsonProperty("conteineres")
  @NotNull
  public Conteineres getConteineres() {
    return conteineres;
  }

  public void setConteineres(Conteineres conteineres) {
    this.conteineres = conteineres;
  }

  public NotaFiscalFormulario conteineres(Conteineres conteineres) {
    this.conteineres = conteineres;
    return this;
  }

 /**
   * Get itensNFF
   * @return itensNFF
  **/
  @JsonProperty("itensNFF")
  @NotNull
  public ItensNFF getItensNFF() {
    return itensNFF;
  }

  public void setItensNFF(ItensNFF itensNFF) {
    this.itensNFF = itensNFF;
  }

  public NotaFiscalFormulario itensNFF(ItensNFF itensNFF) {
    this.itensNFF = itensNFF;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotaFiscalFormulario {\n");
    
    sb.append("    numeroNF: ").append(toIndentedString(numeroNF)).append("\n");
    sb.append("    serieNF: ").append(toIndentedString(serieNF)).append("\n");
    sb.append("    modeloNF: ").append(toIndentedString(modeloNF)).append("\n");
    sb.append("    aamm: ").append(toIndentedString(aamm)).append("\n");
    sb.append("    ufEmissor: ").append(toIndentedString(ufEmissor)).append("\n");
    sb.append("    dataEmissao: ").append(toIndentedString(dataEmissao)).append("\n");
    sb.append("    identificacaoEmissor: ").append(toIndentedString(identificacaoEmissor)).append("\n");
    sb.append("    destinatario: ").append(toIndentedString(destinatario)).append("\n");
    sb.append("    conteineres: ").append(toIndentedString(conteineres)).append("\n");
    sb.append("    itensNFF: ").append(toIndentedString(itensNFF)).append("\n");
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

