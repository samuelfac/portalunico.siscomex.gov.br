package br.gov.siscomex.portalunico.duimp_api.model;

import br.gov.siscomex.portalunico.duimp_api.model.SeguroCover;
import br.gov.siscomex.portalunico.duimp_api.model.UnidadeDeclaradaCover;
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
 @XmlType(name = "CargaCover", propOrder =
    { "identificacao", "unidadeDeclarada", "motivoSituacaoEspecial", "seguro"
})

@XmlRootElement(name="CargaCover")
/**
  * Dados da carga.
 **/
@ApiModel(description="Dados da carga.")
public class CargaCover  {
  
  @XmlElement(name="identificacao")
  @ApiModelProperty(value = "Número de Identificação da Carga.<br>Tamanho: 15<br>Formato: NNNNNNNNNNNNNNN<br>Origem: Sistema Siscomex Carga - https://www4.receita.fazenda.gov.br/g33159/jsp/logon.jsp?ind=11Para Duimp COM situação especial de despacho (atributo carga.motivoSituacaoEspecial.codigo preenchido), este atributo será retornado nulo")
 /**
   * Número de Identificação da Carga.<br>Tamanho: 15<br>Formato: NNNNNNNNNNNNNNN<br>Origem: Sistema Siscomex Carga - https://www4.receita.fazenda.gov.br/g33159/jsp/logon.jsp?ind=11Para Duimp COM situação especial de despacho (atributo carga.motivoSituacaoEspecial.codigo preenchido), este atributo será retornado nulo
  **/
  private String identificacao = null;

  @XmlElement(name="unidadeDeclarada", required = true)
  @ApiModelProperty(required = true, value = "")
  @Valid
  private UnidadeDeclaradaCover unidadeDeclarada = null;

  @XmlElement(name="motivoSituacaoEspecial")
  @ApiModelProperty(value = "Código do motivo da situação especial de despacho no sistema.<br>Tamanho: 5<br>Formato: 'NNNNN'<br>Origem: Sistema de Tabelas Aduaneiras - https://api-docs.portalunico.siscomex.gov.br/")
 /**
   * Código do motivo da situação especial de despacho no sistema.<br>Tamanho: 5<br>Formato: 'NNNNN'<br>Origem: Sistema de Tabelas Aduaneiras - https://api-docs.portalunico.siscomex.gov.br/
  **/
  private String motivoSituacaoEspecial = null;

  @XmlElement(name="seguro")
  @ApiModelProperty(value = "")
  @Valid
  private SeguroCover seguro = null;
 /**
   * Número de Identificação da Carga.&lt;br&gt;Tamanho: 15&lt;br&gt;Formato: NNNNNNNNNNNNNNN&lt;br&gt;Origem: Sistema Siscomex Carga - https://www4.receita.fazenda.gov.br/g33159/jsp/logon.jsp?ind&#x3D;11Para Duimp COM situação especial de despacho (atributo carga.motivoSituacaoEspecial.codigo preenchido), este atributo será retornado nulo
   * @return identificacao
  **/
  @JsonProperty("identificacao")
  public String getIdentificacao() {
    return identificacao;
  }

  public void setIdentificacao(String identificacao) {
    this.identificacao = identificacao;
  }

  public CargaCover identificacao(String identificacao) {
    this.identificacao = identificacao;
    return this;
  }

 /**
   * Get unidadeDeclarada
   * @return unidadeDeclarada
  **/
  @JsonProperty("unidadeDeclarada")
  @NotNull
  public UnidadeDeclaradaCover getUnidadeDeclarada() {
    return unidadeDeclarada;
  }

  public void setUnidadeDeclarada(UnidadeDeclaradaCover unidadeDeclarada) {
    this.unidadeDeclarada = unidadeDeclarada;
  }

  public CargaCover unidadeDeclarada(UnidadeDeclaradaCover unidadeDeclarada) {
    this.unidadeDeclarada = unidadeDeclarada;
    return this;
  }

 /**
   * Código do motivo da situação especial de despacho no sistema.&lt;br&gt;Tamanho: 5&lt;br&gt;Formato: &#39;NNNNN&#39;&lt;br&gt;Origem: Sistema de Tabelas Aduaneiras - https://api-docs.portalunico.siscomex.gov.br/
   * @return motivoSituacaoEspecial
  **/
  @JsonProperty("motivoSituacaoEspecial")
  public String getMotivoSituacaoEspecial() {
    return motivoSituacaoEspecial;
  }

  public void setMotivoSituacaoEspecial(String motivoSituacaoEspecial) {
    this.motivoSituacaoEspecial = motivoSituacaoEspecial;
  }

  public CargaCover motivoSituacaoEspecial(String motivoSituacaoEspecial) {
    this.motivoSituacaoEspecial = motivoSituacaoEspecial;
    return this;
  }

 /**
   * Get seguro
   * @return seguro
  **/
  @JsonProperty("seguro")
  public SeguroCover getSeguro() {
    return seguro;
  }

  public void setSeguro(SeguroCover seguro) {
    this.seguro = seguro;
  }

  public CargaCover seguro(SeguroCover seguro) {
    this.seguro = seguro;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CargaCover {\n");
    
    sb.append("    identificacao: ").append(toIndentedString(identificacao)).append("\n");
    sb.append("    unidadeDeclarada: ").append(toIndentedString(unidadeDeclarada)).append("\n");
    sb.append("    motivoSituacaoEspecial: ").append(toIndentedString(motivoSituacaoEspecial)).append("\n");
    sb.append("    seguro: ").append(toIndentedString(seguro)).append("\n");
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

