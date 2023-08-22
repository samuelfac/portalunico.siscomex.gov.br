package br.gov.siscomex.portalunico.cct_ext.model;

import br.gov.siscomex.portalunico.cct_ext.model.Coordenadas;
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
 @XmlType(name = "Local", propOrder =
    { "codigoURF", "codigoRA", "coordenadas"
})

@XmlRootElement(name="Local")
/**
  * Dados do local da recepção
 **/
@ApiModel(description="Dados do local da recepção")
public class Local  {
  
  @XmlElement(name="codigoURF", required = true)
  @ApiModelProperty(example = "0817600", required = true, value = "Código da Unidade da Receita Federal de Despacho<br>Tamanho: 7<br>Formato: NNNNNNN<br>Domínio: Tabela de Unidades da RFB de Despacho")
 /**
   * Código da Unidade da Receita Federal de Despacho<br>Tamanho: 7<br>Formato: NNNNNNN<br>Domínio: Tabela de Unidades da RFB de Despacho
  **/
  private String codigoURF = null;

  @XmlElement(name="codigoRA")
  @ApiModelProperty(example = "8911101", value = "Código do Recinto Alfandegado<br>Tamanho: 7<br>Formato: NNNNNNN<br>Domínio: Tabela de Recintos Alfandegados.<br>Deve ser informado somente quando o atributo coordenadas não for informado.")
 /**
   * Código do Recinto Alfandegado<br>Tamanho: 7<br>Formato: NNNNNNN<br>Domínio: Tabela de Recintos Alfandegados.<br>Deve ser informado somente quando o atributo coordenadas não for informado.
  **/
  private String codigoRA = null;

  @XmlElement(name="coordenadas")
  @ApiModelProperty(value = "")
  @Valid
  private Coordenadas coordenadas = null;
 /**
   * Código da Unidade da Receita Federal de Despacho&lt;br&gt;Tamanho: 7&lt;br&gt;Formato: NNNNNNN&lt;br&gt;Domínio: Tabela de Unidades da RFB de Despacho
   * @return codigoURF
  **/
  @JsonProperty("codigoURF")
  @NotNull
  public String getCodigoURF() {
    return codigoURF;
  }

  public void setCodigoURF(String codigoURF) {
    this.codigoURF = codigoURF;
  }

  public Local codigoURF(String codigoURF) {
    this.codigoURF = codigoURF;
    return this;
  }

 /**
   * Código do Recinto Alfandegado&lt;br&gt;Tamanho: 7&lt;br&gt;Formato: NNNNNNN&lt;br&gt;Domínio: Tabela de Recintos Alfandegados.&lt;br&gt;Deve ser informado somente quando o atributo coordenadas não for informado.
   * @return codigoRA
  **/
  @JsonProperty("codigoRA")
  public String getCodigoRA() {
    return codigoRA;
  }

  public void setCodigoRA(String codigoRA) {
    this.codigoRA = codigoRA;
  }

  public Local codigoRA(String codigoRA) {
    this.codigoRA = codigoRA;
    return this;
  }

 /**
   * Get coordenadas
   * @return coordenadas
  **/
  @JsonProperty("coordenadas")
  public Coordenadas getCoordenadas() {
    return coordenadas;
  }

  public void setCoordenadas(Coordenadas coordenadas) {
    this.coordenadas = coordenadas;
  }

  public Local coordenadas(Coordenadas coordenadas) {
    this.coordenadas = coordenadas;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Local {\n");
    
    sb.append("    codigoURF: ").append(toIndentedString(codigoURF)).append("\n");
    sb.append("    codigoRA: ").append(toIndentedString(codigoRA)).append("\n");
    sb.append("    coordenadas: ").append(toIndentedString(coordenadas)).append("\n");
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

