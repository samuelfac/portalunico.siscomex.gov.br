package br.gov.siscomex.portalunico.cct_ext.model;

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
 @XmlType(name = "TransitoSimplificadoDocumentoTransporte", propOrder =
    { "codigoURFDestino", "cnpjRespDestino", "codigoRADestino"
})

@XmlRootElement(name="TransitoSimplificadoDocumentoTransporte")
/**
  * Conjunto de informações obrigatórias ao informar Trânsito Simplificado
 **/
@ApiModel(description="Conjunto de informações obrigatórias ao informar Trânsito Simplificado")
public class TransitoSimplificadoDocumentoTransporte  {
  
  @XmlElement(name="codigoURFDestino")
  @ApiModelProperty(example = "0717700", value = "Código da Unidade da Receita Federal do local de destino do trânsito<br>Deve ser informado junto com o CNPJ Responsável do Destino quando não for informado o Recinto Aduaneiro<br>Tamanho: 7<br>Formato: NNNNNNN")
 /**
   * Código da Unidade da Receita Federal do local de destino do trânsito<br>Deve ser informado junto com o CNPJ Responsável do Destino quando não for informado o Recinto Aduaneiro<br>Tamanho: 7<br>Formato: NNNNNNN
  **/
  private String codigoURFDestino = null;

  @XmlElement(name="cnpjRespDestino")
  @ApiModelProperty(example = "07396865000168", value = "CNPJ do responsável do local de destino do trânsito<br>Tamanho: 14<br>Formato: NNNNNNNNNNNNNN<br>Deve ser informado junto com o código da Unidade da Receita Federal no destino quando não for informado o Recinto Aduaneiro")
 /**
   * CNPJ do responsável do local de destino do trânsito<br>Tamanho: 14<br>Formato: NNNNNNNNNNNNNN<br>Deve ser informado junto com o código da Unidade da Receita Federal no destino quando não for informado o Recinto Aduaneiro
  **/
  private String cnpjRespDestino = null;

  @XmlElement(name="codigoRADestino")
  @ApiModelProperty(example = "7911101", value = "Código do Recinto Aduaneiro do local de destino do trânsito<br>Deve ser informado quando não for informada a Unidade da Receita Federal de destino<br>Tamanho: 7<br>Formato: NNNNNNN")
 /**
   * Código do Recinto Aduaneiro do local de destino do trânsito<br>Deve ser informado quando não for informada a Unidade da Receita Federal de destino<br>Tamanho: 7<br>Formato: NNNNNNN
  **/
  private String codigoRADestino = null;
 /**
   * Código da Unidade da Receita Federal do local de destino do trânsito&lt;br&gt;Deve ser informado junto com o CNPJ Responsável do Destino quando não for informado o Recinto Aduaneiro&lt;br&gt;Tamanho: 7&lt;br&gt;Formato: NNNNNNN
   * @return codigoURFDestino
  **/
  @JsonProperty("codigoURFDestino")
  public String getCodigoURFDestino() {
    return codigoURFDestino;
  }

  public void setCodigoURFDestino(String codigoURFDestino) {
    this.codigoURFDestino = codigoURFDestino;
  }

  public TransitoSimplificadoDocumentoTransporte codigoURFDestino(String codigoURFDestino) {
    this.codigoURFDestino = codigoURFDestino;
    return this;
  }

 /**
   * CNPJ do responsável do local de destino do trânsito&lt;br&gt;Tamanho: 14&lt;br&gt;Formato: NNNNNNNNNNNNNN&lt;br&gt;Deve ser informado junto com o código da Unidade da Receita Federal no destino quando não for informado o Recinto Aduaneiro
   * @return cnpjRespDestino
  **/
  @JsonProperty("cnpjRespDestino")
  public String getCnpjRespDestino() {
    return cnpjRespDestino;
  }

  public void setCnpjRespDestino(String cnpjRespDestino) {
    this.cnpjRespDestino = cnpjRespDestino;
  }

  public TransitoSimplificadoDocumentoTransporte cnpjRespDestino(String cnpjRespDestino) {
    this.cnpjRespDestino = cnpjRespDestino;
    return this;
  }

 /**
   * Código do Recinto Aduaneiro do local de destino do trânsito&lt;br&gt;Deve ser informado quando não for informada a Unidade da Receita Federal de destino&lt;br&gt;Tamanho: 7&lt;br&gt;Formato: NNNNNNN
   * @return codigoRADestino
  **/
  @JsonProperty("codigoRADestino")
  public String getCodigoRADestino() {
    return codigoRADestino;
  }

  public void setCodigoRADestino(String codigoRADestino) {
    this.codigoRADestino = codigoRADestino;
  }

  public TransitoSimplificadoDocumentoTransporte codigoRADestino(String codigoRADestino) {
    this.codigoRADestino = codigoRADestino;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransitoSimplificadoDocumentoTransporte {\n");
    
    sb.append("    codigoURFDestino: ").append(toIndentedString(codigoURFDestino)).append("\n");
    sb.append("    cnpjRespDestino: ").append(toIndentedString(cnpjRespDestino)).append("\n");
    sb.append("    codigoRADestino: ").append(toIndentedString(codigoRADestino)).append("\n");
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

