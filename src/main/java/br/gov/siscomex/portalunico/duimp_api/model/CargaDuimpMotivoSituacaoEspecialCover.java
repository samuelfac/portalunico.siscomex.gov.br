package br.gov.siscomex.portalunico.duimp_api.model;

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
 @XmlType(name = "CargaDuimpMotivoSituacaoEspecialCover", propOrder =
    { "codigo"
})

@XmlRootElement(name="CargaDuimpMotivoSituacaoEspecialCover")
/**
  * Motivo da situação especial de despacho da carga
 **/
@ApiModel(description="Motivo da situação especial de despacho da carga")
public class CargaDuimpMotivoSituacaoEspecialCover  {
  
  @XmlElement(name="codigo")
  @ApiModelProperty(example = "1", value = "Código do motivo da situação especial de despacho no sistema.<br>Tamanho: 5<br>Formato: 'NNNNN'<br>Origem: Sistema de Tabelas Aduaneiras - https://api-docs.portalunico.siscomex.gov.br/ Para Duimp SEM situação especial de despacho (atributo carga.identificacao preenchido), este atributo será retornado nulo")
 /**
   * Código do motivo da situação especial de despacho no sistema.<br>Tamanho: 5<br>Formato: 'NNNNN'<br>Origem: Sistema de Tabelas Aduaneiras - https://api-docs.portalunico.siscomex.gov.br/ Para Duimp SEM situação especial de despacho (atributo carga.identificacao preenchido), este atributo será retornado nulo
  **/
  private String codigo = null;
 /**
   * Código do motivo da situação especial de despacho no sistema.&lt;br&gt;Tamanho: 5&lt;br&gt;Formato: &#39;NNNNN&#39;&lt;br&gt;Origem: Sistema de Tabelas Aduaneiras - https://api-docs.portalunico.siscomex.gov.br/ Para Duimp SEM situação especial de despacho (atributo carga.identificacao preenchido), este atributo será retornado nulo
   * @return codigo
  **/
  @JsonProperty("codigo")
  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public CargaDuimpMotivoSituacaoEspecialCover codigo(String codigo) {
    this.codigo = codigo;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CargaDuimpMotivoSituacaoEspecialCover {\n");
    
    sb.append("    codigo: ").append(toIndentedString(codigo)).append("\n");
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

