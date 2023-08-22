package br.gov.siscomex.portalunico.cct_ext.model;

import br.gov.siscomex.portalunico.cct_ext.model.VeiculoFerroviario;
import br.gov.siscomex.portalunico.cct_ext.model.VeiculoRodoviario;
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
 @XmlType(name = "TransitoSimplificado", propOrder =
    { "codigoURFDestino", "cnpjRespDestino", "codigoRADestino", "veiculoFerroviario", "veiculoRodoviario", "indEscaneamento"
})

@XmlRootElement(name="TransitoSimplificado")
/**
  * Conjunto de informações obrigatórias ao informar Trânsito Simplificado<br>Não pode ser informado junto com o Indicador de baldeação ou transbordo
 **/
@ApiModel(description="Conjunto de informações obrigatórias ao informar Trânsito Simplificado<br>Não pode ser informado junto com o Indicador de baldeação ou transbordo")
public class TransitoSimplificado  {
  
  @XmlElement(name="codigoURFDestino")
  @ApiModelProperty(example = "0717600", value = "Código da Unidade da Receita Federal do local de destino do trânsito<br>Tamanho: 7<br>Formato: NNNNNNN<br>Deve ser informado junto com o CNPJ Responsável do Destino quando não for informado o Recinto Aduaneiro")
 /**
   * Código da Unidade da Receita Federal do local de destino do trânsito<br>Tamanho: 7<br>Formato: NNNNNNN<br>Deve ser informado junto com o CNPJ Responsável do Destino quando não for informado o Recinto Aduaneiro
  **/
  private String codigoURFDestino = null;

  @XmlElement(name="cnpjRespDestino")
  @ApiModelProperty(example = "15573459000106", value = "CNPJ do responsável do local de destino do trânsito<br>Tamanho: 11<br>Formato: NNNNNNNNNNN<br>Deve ser informado junto com o código da Unidade da Receita Federal no destino quando não for informado o Recinto Aduaneiro")
 /**
   * CNPJ do responsável do local de destino do trânsito<br>Tamanho: 11<br>Formato: NNNNNNNNNNN<br>Deve ser informado junto com o código da Unidade da Receita Federal no destino quando não for informado o Recinto Aduaneiro
  **/
  private String cnpjRespDestino = null;

  @XmlElement(name="codigoRADestino")
  @ApiModelProperty(example = "7911101", value = "Código do Recinto Aduaneiro do local de destino do trânsito<br>Tamanho: 7<br>Formato: NNNNNNN<br>Deve ser informado quando não for informada a Unidade da Receita Federal de destino")
 /**
   * Código do Recinto Aduaneiro do local de destino do trânsito<br>Tamanho: 7<br>Formato: NNNNNNN<br>Deve ser informado quando não for informada a Unidade da Receita Federal de destino
  **/
  private String codigoRADestino = null;

  @XmlElement(name="veiculoFerroviario")
  @ApiModelProperty(value = "")
  @Valid
  private VeiculoFerroviario veiculoFerroviario = null;

  @XmlElement(name="veiculoRodoviario")
  @ApiModelProperty(value = "")
  @Valid
  private VeiculoRodoviario veiculoRodoviario = null;

  @XmlElement(name="indEscaneamento")
  @ApiModelProperty(example = "N", value = "Indicador de escaneamento<br>Domínio: S (Sim), N (Não)")
 /**
   * Indicador de escaneamento<br>Domínio: S (Sim), N (Não)
  **/
  private String indEscaneamento = null;
 /**
   * Código da Unidade da Receita Federal do local de destino do trânsito&lt;br&gt;Tamanho: 7&lt;br&gt;Formato: NNNNNNN&lt;br&gt;Deve ser informado junto com o CNPJ Responsável do Destino quando não for informado o Recinto Aduaneiro
   * @return codigoURFDestino
  **/
  @JsonProperty("codigoURFDestino")
  public String getCodigoURFDestino() {
    return codigoURFDestino;
  }

  public void setCodigoURFDestino(String codigoURFDestino) {
    this.codigoURFDestino = codigoURFDestino;
  }

  public TransitoSimplificado codigoURFDestino(String codigoURFDestino) {
    this.codigoURFDestino = codigoURFDestino;
    return this;
  }

 /**
   * CNPJ do responsável do local de destino do trânsito&lt;br&gt;Tamanho: 11&lt;br&gt;Formato: NNNNNNNNNNN&lt;br&gt;Deve ser informado junto com o código da Unidade da Receita Federal no destino quando não for informado o Recinto Aduaneiro
   * @return cnpjRespDestino
  **/
  @JsonProperty("cnpjRespDestino")
  public String getCnpjRespDestino() {
    return cnpjRespDestino;
  }

  public void setCnpjRespDestino(String cnpjRespDestino) {
    this.cnpjRespDestino = cnpjRespDestino;
  }

  public TransitoSimplificado cnpjRespDestino(String cnpjRespDestino) {
    this.cnpjRespDestino = cnpjRespDestino;
    return this;
  }

 /**
   * Código do Recinto Aduaneiro do local de destino do trânsito&lt;br&gt;Tamanho: 7&lt;br&gt;Formato: NNNNNNN&lt;br&gt;Deve ser informado quando não for informada a Unidade da Receita Federal de destino
   * @return codigoRADestino
  **/
  @JsonProperty("codigoRADestino")
  public String getCodigoRADestino() {
    return codigoRADestino;
  }

  public void setCodigoRADestino(String codigoRADestino) {
    this.codigoRADestino = codigoRADestino;
  }

  public TransitoSimplificado codigoRADestino(String codigoRADestino) {
    this.codigoRADestino = codigoRADestino;
    return this;
  }

 /**
   * Get veiculoFerroviario
   * @return veiculoFerroviario
  **/
  @JsonProperty("veiculoFerroviario")
  public VeiculoFerroviario getVeiculoFerroviario() {
    return veiculoFerroviario;
  }

  public void setVeiculoFerroviario(VeiculoFerroviario veiculoFerroviario) {
    this.veiculoFerroviario = veiculoFerroviario;
  }

  public TransitoSimplificado veiculoFerroviario(VeiculoFerroviario veiculoFerroviario) {
    this.veiculoFerroviario = veiculoFerroviario;
    return this;
  }

 /**
   * Get veiculoRodoviario
   * @return veiculoRodoviario
  **/
  @JsonProperty("veiculoRodoviario")
  public VeiculoRodoviario getVeiculoRodoviario() {
    return veiculoRodoviario;
  }

  public void setVeiculoRodoviario(VeiculoRodoviario veiculoRodoviario) {
    this.veiculoRodoviario = veiculoRodoviario;
  }

  public TransitoSimplificado veiculoRodoviario(VeiculoRodoviario veiculoRodoviario) {
    this.veiculoRodoviario = veiculoRodoviario;
    return this;
  }

 /**
   * Indicador de escaneamento&lt;br&gt;Domínio: S (Sim), N (Não)
   * @return indEscaneamento
  **/
  @JsonProperty("indEscaneamento")
  public String getIndEscaneamento() {
    return indEscaneamento;
  }

  public void setIndEscaneamento(String indEscaneamento) {
    this.indEscaneamento = indEscaneamento;
  }

  public TransitoSimplificado indEscaneamento(String indEscaneamento) {
    this.indEscaneamento = indEscaneamento;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransitoSimplificado {\n");
    
    sb.append("    codigoURFDestino: ").append(toIndentedString(codigoURFDestino)).append("\n");
    sb.append("    cnpjRespDestino: ").append(toIndentedString(cnpjRespDestino)).append("\n");
    sb.append("    codigoRADestino: ").append(toIndentedString(codigoRADestino)).append("\n");
    sb.append("    veiculoFerroviario: ").append(toIndentedString(veiculoFerroviario)).append("\n");
    sb.append("    veiculoRodoviario: ").append(toIndentedString(veiculoRodoviario)).append("\n");
    sb.append("    indEscaneamento: ").append(toIndentedString(indEscaneamento)).append("\n");
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

