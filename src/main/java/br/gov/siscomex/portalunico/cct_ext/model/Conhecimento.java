package br.gov.siscomex.portalunico.cct_ext.model;

import br.gov.siscomex.portalunico.cct_ext.model.Carga;
import br.gov.siscomex.portalunico.cct_ext.model.DocumentosAnexo;
import br.gov.siscomex.portalunico.cct_ext.model.Frete;
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
 @XmlType(name = "Conhecimento", propOrder =
    { "numero", "dataEmissao", "frete", "carga", "documentosAnexo"
})

@XmlRootElement(name="Conhecimento")
/**
  * Dados do conhecimento de carga
 **/
@ApiModel(description="Dados do conhecimento de carga")
public class Conhecimento  {
  
  @XmlElement(name="numero", required = true)
  @ApiModelProperty(example = "BR123456789", required = true, value = "Número do conhecimento de carga<br>Tamanho: 20<br>Formato: PPNNNNNNNNNNNNNNNNNN, onde PP = sigla ISO/Alfa 2 do país")
 /**
   * Número do conhecimento de carga<br>Tamanho: 20<br>Formato: PPNNNNNNNNNNNNNNNNNN, onde PP = sigla ISO/Alfa 2 do país
  **/
  private String numero = null;

  @XmlElement(name="dataEmissao", required = true)
  @ApiModelProperty(example = "2016-12-19", required = true, value = "Data de emissão do conhecimento de carga<br>Formato: AAAA-MM-DD")
 /**
   * Data de emissão do conhecimento de carga<br>Formato: AAAA-MM-DD
  **/
  private String dataEmissao = null;

  @XmlElement(name="frete", required = true)
  @ApiModelProperty(required = true, value = "")
  @Valid
  private Frete frete = null;

  @XmlElement(name="carga", required = true)
  @ApiModelProperty(required = true, value = "")
  @Valid
  private Carga carga = null;

  @XmlElement(name="documentosAnexo")
  @ApiModelProperty(value = "")
  @Valid
  private DocumentosAnexo documentosAnexo = null;
 /**
   * Número do conhecimento de carga&lt;br&gt;Tamanho: 20&lt;br&gt;Formato: PPNNNNNNNNNNNNNNNNNN, onde PP &#x3D; sigla ISO/Alfa 2 do país
   * @return numero
  **/
  @JsonProperty("numero")
  @NotNull
  public String getNumero() {
    return numero;
  }

  public void setNumero(String numero) {
    this.numero = numero;
  }

  public Conhecimento numero(String numero) {
    this.numero = numero;
    return this;
  }

 /**
   * Data de emissão do conhecimento de carga&lt;br&gt;Formato: AAAA-MM-DD
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

  public Conhecimento dataEmissao(String dataEmissao) {
    this.dataEmissao = dataEmissao;
    return this;
  }

 /**
   * Get frete
   * @return frete
  **/
  @JsonProperty("frete")
  @NotNull
  public Frete getFrete() {
    return frete;
  }

  public void setFrete(Frete frete) {
    this.frete = frete;
  }

  public Conhecimento frete(Frete frete) {
    this.frete = frete;
    return this;
  }

 /**
   * Get carga
   * @return carga
  **/
  @JsonProperty("carga")
  @NotNull
  public Carga getCarga() {
    return carga;
  }

  public void setCarga(Carga carga) {
    this.carga = carga;
  }

  public Conhecimento carga(Carga carga) {
    this.carga = carga;
    return this;
  }

 /**
   * Get documentosAnexo
   * @return documentosAnexo
  **/
  @JsonProperty("documentosAnexo")
  public DocumentosAnexo getDocumentosAnexo() {
    return documentosAnexo;
  }

  public void setDocumentosAnexo(DocumentosAnexo documentosAnexo) {
    this.documentosAnexo = documentosAnexo;
  }

  public Conhecimento documentosAnexo(DocumentosAnexo documentosAnexo) {
    this.documentosAnexo = documentosAnexo;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Conhecimento {\n");
    
    sb.append("    numero: ").append(toIndentedString(numero)).append("\n");
    sb.append("    dataEmissao: ").append(toIndentedString(dataEmissao)).append("\n");
    sb.append("    frete: ").append(toIndentedString(frete)).append("\n");
    sb.append("    carga: ").append(toIndentedString(carga)).append("\n");
    sb.append("    documentosAnexo: ").append(toIndentedString(documentosAnexo)).append("\n");
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

