package br.gov.siscomex.portalunico.cct_ext.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "Local", propOrder =
    { "codigoURF", "codigoRA", "coordenadas"
})

@XmlRootElement(name="Local")
/**
  * Dados do local da entrega
 **/
@ApiModel(description="Dados do local da entrega")
public class Local  {
  
  @XmlElement(name="codigoURF")
  @ApiModelProperty(example = "0717600", value = "Código da unidade da Receita Federal onde a recepção está sendo efetuada<br>Tamanho: 7<br>Formato: NNNNNNN<br>Domínio: Tabela de Unidades da RFB.<br>Deve ser informado apenas quando o receptor não for um depositário.")
 /**
   * Código da unidade da Receita Federal onde a recepção está sendo efetuada<br>Tamanho: 7<br>Formato: NNNNNNN<br>Domínio: Tabela de Unidades da RFB.<br>Deve ser informado apenas quando o receptor não for um depositário.
  **/
  private String codigoURF = null;

  @XmlElement(name="codigoRA")
  @ApiModelProperty(example = "7911101", value = "Código do recinto alfandegado onde a recepção está sendo efetuada<br>Tamanho: 7<br>Formato: NNNNNNN<br>Domínio: Tabela de recintos aduaneiros<br>Deve ser informado apenas quando o receptor for um depositário.")
 /**
   * Código do recinto alfandegado onde a recepção está sendo efetuada<br>Tamanho: 7<br>Formato: NNNNNNN<br>Domínio: Tabela de recintos aduaneiros<br>Deve ser informado apenas quando o receptor for um depositário.
  **/
  private String codigoRA = null;

  @XmlElement(name="coordenadas")
  @ApiModelProperty(value = "")
  @Valid
  private Coordenadas coordenadas = null;
 /**
   * Código da unidade da Receita Federal onde a recepção está sendo efetuada&lt;br&gt;Tamanho: 7&lt;br&gt;Formato: NNNNNNN&lt;br&gt;Domínio: Tabela de Unidades da RFB.&lt;br&gt;Deve ser informado apenas quando o receptor não for um depositário.
   * @return codigoURF
  **/
  @JsonProperty("codigoURF")
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
   * Código do recinto alfandegado onde a recepção está sendo efetuada&lt;br&gt;Tamanho: 7&lt;br&gt;Formato: NNNNNNN&lt;br&gt;Domínio: Tabela de recintos aduaneiros&lt;br&gt;Deve ser informado apenas quando o receptor for um depositário.
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

