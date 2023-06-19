package br.gov.siscomex.portalunico.cct_ext.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "DocumentosTransporte", propOrder =
    { "id", "tipoDocumento", "numeroDocumento", "dataEmissao", "identificacaoVeiculo"
})

@XmlRootElement(name="DocumentosTransporte")
/**
  * Documento de transporte
 **/
@ApiModel(description="Documento de transporte")
public class DocumentosTransporte  {
  
  @XmlElement(name="id")
  @ApiModelProperty(value = "")
  @Valid
  private DocumentoTransportePK id = null;

  @XmlElement(name="tipoDocumento")
  @ApiModelProperty(example = "1", value = "Domínio<br>01 - MIC/DTA<br>02 - TIF/DTA<br>03 - DTAI<br>04 - Outros")
 /**
   * Domínio<br>01 - MIC/DTA<br>02 - TIF/DTA<br>03 - DTAI<br>04 - Outros
  **/
  private String tipoDocumento = null;

  @XmlElement(name="numeroDocumento")
  @ApiModelProperty(example = "123456", value = "Tamanho mínimo: 5<br>Tamanho máximo: 15")
 /**
   * Tamanho mínimo: 5<br>Tamanho máximo: 15
  **/
  private String numeroDocumento = null;

  @XmlElement(name="dataEmissao")
  @ApiModelProperty(example = "2019-12-30", value = "Formato: AAAA-MM-DD")
 /**
   * Formato: AAAA-MM-DD
  **/
  private String dataEmissao = null;

  @XmlElement(name="identificacaoVeiculo")
  @ApiModelProperty(example = "ABC1234", value = "Tamanho mínimo: 1<br>Tamanho máximo: 15")
 /**
   * Tamanho mínimo: 1<br>Tamanho máximo: 15
  **/
  private String identificacaoVeiculo = null;
 /**
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  public DocumentoTransportePK getId() {
    return id;
  }

  public void setId(DocumentoTransportePK id) {
    this.id = id;
  }

  public DocumentosTransporte id(DocumentoTransportePK id) {
    this.id = id;
    return this;
  }

 /**
   * Domínio&lt;br&gt;01 - MIC/DTA&lt;br&gt;02 - TIF/DTA&lt;br&gt;03 - DTAI&lt;br&gt;04 - Outros
   * @return tipoDocumento
  **/
  @JsonProperty("tipoDocumento")
  public String getTipoDocumento() {
    return tipoDocumento;
  }

  public void setTipoDocumento(String tipoDocumento) {
    this.tipoDocumento = tipoDocumento;
  }

  public DocumentosTransporte tipoDocumento(String tipoDocumento) {
    this.tipoDocumento = tipoDocumento;
    return this;
  }

 /**
   * Tamanho mínimo: 5&lt;br&gt;Tamanho máximo: 15
   * @return numeroDocumento
  **/
  @JsonProperty("numeroDocumento")
  public String getNumeroDocumento() {
    return numeroDocumento;
  }

  public void setNumeroDocumento(String numeroDocumento) {
    this.numeroDocumento = numeroDocumento;
  }

  public DocumentosTransporte numeroDocumento(String numeroDocumento) {
    this.numeroDocumento = numeroDocumento;
    return this;
  }

 /**
   * Formato: AAAA-MM-DD
   * @return dataEmissao
  **/
  @JsonProperty("dataEmissao")
  public String getDataEmissao() {
    return dataEmissao;
  }

  public void setDataEmissao(String dataEmissao) {
    this.dataEmissao = dataEmissao;
  }

  public DocumentosTransporte dataEmissao(String dataEmissao) {
    this.dataEmissao = dataEmissao;
    return this;
  }

 /**
   * Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 15
   * @return identificacaoVeiculo
  **/
  @JsonProperty("identificacaoVeiculo")
  public String getIdentificacaoVeiculo() {
    return identificacaoVeiculo;
  }

  public void setIdentificacaoVeiculo(String identificacaoVeiculo) {
    this.identificacaoVeiculo = identificacaoVeiculo;
  }

  public DocumentosTransporte identificacaoVeiculo(String identificacaoVeiculo) {
    this.identificacaoVeiculo = identificacaoVeiculo;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentosTransporte {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    tipoDocumento: ").append(toIndentedString(tipoDocumento)).append("\n");
    sb.append("    numeroDocumento: ").append(toIndentedString(numeroDocumento)).append("\n");
    sb.append("    dataEmissao: ").append(toIndentedString(dataEmissao)).append("\n");
    sb.append("    identificacaoVeiculo: ").append(toIndentedString(identificacaoVeiculo)).append("\n");
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

