package br.gov.siscomex.portalunico.duimp_api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "CargaCover", propOrder =
    { "identificacao", "unidadeDeclarada", "seguro"
})

@XmlRootElement(name="CargaCover")
/**
  * Dados da carga.
 **/
@ApiModel(description="Dados da carga.")
public class CargaCover  {
  
  @XmlElement(name="identificacao", required = true)
  @ApiModelProperty(required = true, value = "Número de Identificação da Carga.<br>Tamanho: 15<br>Formato: NNNNNNNNNNNNNNN<br>Origem: Sistema Siscomex Carga - https://www4.receita.fazenda.gov.br/g33159/jsp/logon.jsp?ind=11")
 /**
   * Número de Identificação da Carga.<br>Tamanho: 15<br>Formato: NNNNNNNNNNNNNNN<br>Origem: Sistema Siscomex Carga - https://www4.receita.fazenda.gov.br/g33159/jsp/logon.jsp?ind=11
  **/
  private String identificacao = null;

  @XmlElement(name="unidadeDeclarada", required = true)
  @ApiModelProperty(required = true, value = "")
  @Valid
  private UnidadeDeclaradaCover unidadeDeclarada = null;

  @XmlElement(name="seguro")
  @ApiModelProperty(value = "")
  @Valid
  private SeguroCover seguro = null;
 /**
   * Número de Identificação da Carga.&lt;br&gt;Tamanho: 15&lt;br&gt;Formato: NNNNNNNNNNNNNNN&lt;br&gt;Origem: Sistema Siscomex Carga - https://www4.receita.fazenda.gov.br/g33159/jsp/logon.jsp?ind&#x3D;11
   * @return identificacao
  **/
  @JsonProperty("identificacao")
  @NotNull
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

