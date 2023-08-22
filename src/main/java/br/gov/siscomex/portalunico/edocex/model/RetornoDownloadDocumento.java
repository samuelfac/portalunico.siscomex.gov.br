package br.gov.siscomex.portalunico.edocex.model;

import br.gov.siscomex.portalunico.edocex.model.Documento;
import io.swagger.v3.oas.annotations.media.Schema;
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
 @XmlType(name = "RetornoDownloadDocumento", propOrder =
    { "arquivoZipBase64", "documento"
})

@XmlRootElement(name="RetornoDownloadDocumento")
/**
  * Retorno do download de documento.
 **/
@ApiModel(description="Retorno do download de documento.")
public class RetornoDownloadDocumento  {
  
  @XmlElement(name="arquivoZipBase64", required = true)
  @ApiModelProperty(example = "UEsDBBQACAAIAEN2Qk8AAAAAAAAAAFULAAANACAAenp6enou ..... AAEEKIyVGgR4AwAAUEsFBgAAAAACAAIAsgAAAAIJAAAAAA==", required = true, value = "String em BASE64 representando o conteúdo do arquivo e sua assinatura no formato zip<br/>Tamanho máximo do arquivo original: equivalente a 15MB, aproximadamente 20MB em BASE64")
 /**
   * String em BASE64 representando o conteúdo do arquivo e sua assinatura no formato zip<br/>Tamanho máximo do arquivo original: equivalente a 15MB, aproximadamente 20MB em BASE64
  **/
  private String arquivoZipBase64 = null;

  @XmlElement(name="documento", required = true)
  @ApiModelProperty(required = true, value = "")
  @Valid
  private Documento documento = null;
 /**
   * String em BASE64 representando o conteúdo do arquivo e sua assinatura no formato zip&lt;br/&gt;Tamanho máximo do arquivo original: equivalente a 15MB, aproximadamente 20MB em BASE64
   * @return arquivoZipBase64
  **/
  @JsonProperty("arquivoZipBase64")
  @NotNull
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
  @NotNull
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

