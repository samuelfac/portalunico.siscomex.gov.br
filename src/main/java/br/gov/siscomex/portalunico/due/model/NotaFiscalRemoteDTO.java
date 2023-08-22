package br.gov.siscomex.portalunico.due.model;

import br.gov.siscomex.portalunico.due.model.NumeroIdentificacaoDTO;
import java.time.OffsetDateTime;
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
 @XmlType(name = "NotaFiscalRemoteDTO", propOrder =
    { "chaveDeAcesso", "dataEmissao", "finalidade", "identificacaoDoEmitente", "modelo", "notaFicalEletronica", "numeroDoDocumento", "quantidadeDeItens", "serie", "ufDoEmissor"
})

@XmlRootElement(name="NotaFiscalRemoteDTO")
public class NotaFiscalRemoteDTO  {
  
  @XmlElement(name="chaveDeAcesso")
  @ApiModelProperty(value = "Chave de acesso<br />Tamanho: 44<br />Formato: 'NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN'")
 /**
   * Chave de acesso<br />Tamanho: 44<br />Formato: 'NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN'
  **/
  private String chaveDeAcesso = null;

  @XmlElement(name="dataEmissao")
  @ApiModelProperty(example = "2019-09-20T14:13:46.966Z", value = "Data de emissão da NF<br />Formato:'yyyy-MM-dd'T'HH:mm:ss.SSSZ'")
 /**
   * Data de emissão da NF<br />Formato:'yyyy-MM-dd'T'HH:mm:ss.SSSZ'
  **/
  private OffsetDateTime dataEmissao = null;

  @XmlElement(name="finalidade")
  @ApiModelProperty(value = "Finalidade<br />Tamanho mínimo: 1<br />Tamanho máximo: 25")
 /**
   * Finalidade<br />Tamanho mínimo: 1<br />Tamanho máximo: 25
  **/
  private String finalidade = null;

  @XmlElement(name="identificacaoDoEmitente")
  @ApiModelProperty(value = "")
  @Valid
  private NumeroIdentificacaoDTO identificacaoDoEmitente = null;

  @XmlElement(name="modelo")
  @ApiModelProperty(example = "01", value = "Modelo<br />Tamanho: 2<br />Formato: 'NN'")
 /**
   * Modelo<br />Tamanho: 2<br />Formato: 'NN'
  **/
  private String modelo = null;

  @XmlElement(name="notaFicalEletronica")
  @ApiModelProperty(value = "")
  private Boolean notaFicalEletronica = false;

  @XmlElement(name="numeroDoDocumento")
  @ApiModelProperty(value = "Número do documento<br />Formato: Inteiro, com até 9 digitos")
 /**
   * Número do documento<br />Formato: Inteiro, com até 9 digitos
  **/
  private Integer numeroDoDocumento = null;

  @XmlElement(name="quantidadeDeItens")
  @ApiModelProperty(value = "Quantidade de itens<br />Formato: Inteiro, com até 3 digitos")
 /**
   * Quantidade de itens<br />Formato: Inteiro, com até 3 digitos
  **/
  private Integer quantidadeDeItens = null;

  @XmlElement(name="serie")
  @ApiModelProperty(example = "90", value = "Serie<br />Formato: Inteiro, com até 3 digitos")
 /**
   * Serie<br />Formato: Inteiro, com até 3 digitos
  **/
  private Integer serie = null;

  @XmlElement(name="ufDoEmissor")
  @ApiModelProperty(example = "RJ", value = "UF do emissor<br />Tamanho: 2<br />Formato: 'AAS'")
 /**
   * UF do emissor<br />Tamanho: 2<br />Formato: 'AAS'
  **/
  private String ufDoEmissor = null;
 /**
   * Chave de acesso&lt;br /&gt;Tamanho: 44&lt;br /&gt;Formato: &#39;NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN&#39;
   * @return chaveDeAcesso
  **/
  @JsonProperty("chaveDeAcesso")
  public String getChaveDeAcesso() {
    return chaveDeAcesso;
  }

  public void setChaveDeAcesso(String chaveDeAcesso) {
    this.chaveDeAcesso = chaveDeAcesso;
  }

  public NotaFiscalRemoteDTO chaveDeAcesso(String chaveDeAcesso) {
    this.chaveDeAcesso = chaveDeAcesso;
    return this;
  }

 /**
   * Data de emissão da NF&lt;br /&gt;Formato:&#39;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#39;
   * @return dataEmissao
  **/
  @JsonProperty("dataEmissao")
  public OffsetDateTime getDataEmissao() {
    return dataEmissao;
  }

  public void setDataEmissao(OffsetDateTime dataEmissao) {
    this.dataEmissao = dataEmissao;
  }

  public NotaFiscalRemoteDTO dataEmissao(OffsetDateTime dataEmissao) {
    this.dataEmissao = dataEmissao;
    return this;
  }

 /**
   * Finalidade&lt;br /&gt;Tamanho mínimo: 1&lt;br /&gt;Tamanho máximo: 25
   * @return finalidade
  **/
  @JsonProperty("finalidade")
  public String getFinalidade() {
    return finalidade;
  }

  public void setFinalidade(String finalidade) {
    this.finalidade = finalidade;
  }

  public NotaFiscalRemoteDTO finalidade(String finalidade) {
    this.finalidade = finalidade;
    return this;
  }

 /**
   * Get identificacaoDoEmitente
   * @return identificacaoDoEmitente
  **/
  @JsonProperty("identificacaoDoEmitente")
  public NumeroIdentificacaoDTO getIdentificacaoDoEmitente() {
    return identificacaoDoEmitente;
  }

  public void setIdentificacaoDoEmitente(NumeroIdentificacaoDTO identificacaoDoEmitente) {
    this.identificacaoDoEmitente = identificacaoDoEmitente;
  }

  public NotaFiscalRemoteDTO identificacaoDoEmitente(NumeroIdentificacaoDTO identificacaoDoEmitente) {
    this.identificacaoDoEmitente = identificacaoDoEmitente;
    return this;
  }

 /**
   * Modelo&lt;br /&gt;Tamanho: 2&lt;br /&gt;Formato: &#39;NN&#39;
   * @return modelo
  **/
  @JsonProperty("modelo")
  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public NotaFiscalRemoteDTO modelo(String modelo) {
    this.modelo = modelo;
    return this;
  }

 /**
   * Get notaFicalEletronica
   * @return notaFicalEletronica
  **/
  @JsonProperty("notaFicalEletronica")
  public Boolean isNotaFicalEletronica() {
    return notaFicalEletronica;
  }

  public void setNotaFicalEletronica(Boolean notaFicalEletronica) {
    this.notaFicalEletronica = notaFicalEletronica;
  }

  public NotaFiscalRemoteDTO notaFicalEletronica(Boolean notaFicalEletronica) {
    this.notaFicalEletronica = notaFicalEletronica;
    return this;
  }

 /**
   * Número do documento&lt;br /&gt;Formato: Inteiro, com até 9 digitos
   * @return numeroDoDocumento
  **/
  @JsonProperty("numeroDoDocumento")
  public Integer getNumeroDoDocumento() {
    return numeroDoDocumento;
  }

  public void setNumeroDoDocumento(Integer numeroDoDocumento) {
    this.numeroDoDocumento = numeroDoDocumento;
  }

  public NotaFiscalRemoteDTO numeroDoDocumento(Integer numeroDoDocumento) {
    this.numeroDoDocumento = numeroDoDocumento;
    return this;
  }

 /**
   * Quantidade de itens&lt;br /&gt;Formato: Inteiro, com até 3 digitos
   * @return quantidadeDeItens
  **/
  @JsonProperty("quantidadeDeItens")
  public Integer getQuantidadeDeItens() {
    return quantidadeDeItens;
  }

  public void setQuantidadeDeItens(Integer quantidadeDeItens) {
    this.quantidadeDeItens = quantidadeDeItens;
  }

  public NotaFiscalRemoteDTO quantidadeDeItens(Integer quantidadeDeItens) {
    this.quantidadeDeItens = quantidadeDeItens;
    return this;
  }

 /**
   * Serie&lt;br /&gt;Formato: Inteiro, com até 3 digitos
   * @return serie
  **/
  @JsonProperty("serie")
  public Integer getSerie() {
    return serie;
  }

  public void setSerie(Integer serie) {
    this.serie = serie;
  }

  public NotaFiscalRemoteDTO serie(Integer serie) {
    this.serie = serie;
    return this;
  }

 /**
   * UF do emissor&lt;br /&gt;Tamanho: 2&lt;br /&gt;Formato: &#39;AAS&#39;
   * @return ufDoEmissor
  **/
  @JsonProperty("ufDoEmissor")
  public String getUfDoEmissor() {
    return ufDoEmissor;
  }

  public void setUfDoEmissor(String ufDoEmissor) {
    this.ufDoEmissor = ufDoEmissor;
  }

  public NotaFiscalRemoteDTO ufDoEmissor(String ufDoEmissor) {
    this.ufDoEmissor = ufDoEmissor;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotaFiscalRemoteDTO {\n");
    
    sb.append("    chaveDeAcesso: ").append(toIndentedString(chaveDeAcesso)).append("\n");
    sb.append("    dataEmissao: ").append(toIndentedString(dataEmissao)).append("\n");
    sb.append("    finalidade: ").append(toIndentedString(finalidade)).append("\n");
    sb.append("    identificacaoDoEmitente: ").append(toIndentedString(identificacaoDoEmitente)).append("\n");
    sb.append("    modelo: ").append(toIndentedString(modelo)).append("\n");
    sb.append("    notaFicalEletronica: ").append(toIndentedString(notaFicalEletronica)).append("\n");
    sb.append("    numeroDoDocumento: ").append(toIndentedString(numeroDoDocumento)).append("\n");
    sb.append("    quantidadeDeItens: ").append(toIndentedString(quantidadeDeItens)).append("\n");
    sb.append("    serie: ").append(toIndentedString(serie)).append("\n");
    sb.append("    ufDoEmissor: ").append(toIndentedString(ufDoEmissor)).append("\n");
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

