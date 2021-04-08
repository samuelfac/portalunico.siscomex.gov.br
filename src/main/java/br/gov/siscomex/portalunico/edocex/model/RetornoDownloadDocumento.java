package br.gov.siscomex.portalunico.edocex.model;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "RetornoDownloadDocumento", propOrder =
    { "arquivoZipBase64", "documento"
})

@XmlRootElement(name="RetornoDownloadDocumento")
/**
  * Retorno do download de documento.
 **/
@ApiModel(description="Retorno do download de documento.")
public class RetornoDownloadDocumento  {
  
  @XmlElement(name="arquivoZipBase64")
  @ApiModelProperty(example = "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", value = "String em BASE64 representando o conteúdo do arquivo e sua assinatura no formato zip<br/>Tamanho máximo do arquivo original: equivalente a 15MB, aproximadamente 20MB em BASE64")
 /**
   * String em BASE64 representando o conteúdo do arquivo e sua assinatura no formato zip<br/>Tamanho máximo do arquivo original: equivalente a 15MB, aproximadamente 20MB em BASE64
  **/
  private String arquivoZipBase64 = null;

  @XmlElement(name="documento")
  @ApiModelProperty(value = "")
  @Valid
  private Documento documento = null;
 /**
   * String em BASE64 representando o conteúdo do arquivo e sua assinatura no formato zip&lt;br/&gt;Tamanho máximo do arquivo original: equivalente a 15MB, aproximadamente 20MB em BASE64
   * @return arquivoZipBase64
  **/
  @JsonProperty("arquivoZipBase64")
  public String getArquivoZipBase64() {
    return arquivoZipBase64;
  }

  public void setArquivoZipBase64(String arquivoZipBase64) {
    this.arquivoZipBase64 = arquivoZipBase64;
  }

  public RetornoDownloadDocumento arquivoZipBase64(String arquivoZipBase64) {
    this.arquivoZipBase64 = arquivoZipBase64;
    return this;
  }

 /**
   * Get documento
   * @return documento
  **/
  @JsonProperty("documento")
  public Documento getDocumento() {
    return documento;
  }

  public void setDocumento(Documento documento) {
    this.documento = documento;
  }

  public RetornoDownloadDocumento documento(Documento documento) {
    this.documento = documento;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetornoDownloadDocumento {\n");
    
    sb.append("    arquivoZipBase64: ").append(toIndentedString(arquivoZipBase64)).append("\n");
    sb.append("    documento: ").append(toIndentedString(documento)).append("\n");
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

