package br.gov.siscomex.portalunico.ccta.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "ImpedimentoEntregaImportador", propOrder =
    { "codigo", "descricao", "descricaoUnidadeRFB", "unidadeRFB"
})

@XmlRootElement(name="ImpedimentoEntregaImportador")
/**
  * Impedimento para entrega de carga ao importador
 **/
@ApiModel(description="Impedimento para entrega de carga ao importador")
public class ImpedimentoEntregaImportador  {
  
  @XmlElement(name="codigo")
  @ApiModelProperty(example = "34", value = "Código do impedimento.<br/>Tamanho: 11")
 /**
   * Código do impedimento.<br/>Tamanho: 11
  **/
  private String codigo = null;

  @XmlElement(name="descricao")
  @ApiModelProperty(example = "Carga bloqueada.", value = "Descrição do impedimento<br/>Tamanho máximo: 300")
 /**
   * Descrição do impedimento<br/>Tamanho máximo: 300
  **/
  private String descricao = null;

  @XmlElement(name="descricaoUnidadeRFB")
  @ApiModelProperty(example = "AEROPORTO INTERNACIONAL DO RIO DE JANEIRO", value = "Descrição da unidade da RFB da Cia. Aérea ou Depositário responsável pela entrega<br/>Este campo só é retornado para impedimentos originados no sistema Mantra")
 /**
   * Descrição da unidade da RFB da Cia. Aérea ou Depositário responsável pela entrega<br/>Este campo só é retornado para impedimentos originados no sistema Mantra
  **/
  private String descricaoUnidadeRFB = null;

  @XmlElement(name="unidadeRFB")
  @ApiModelProperty(example = "0717700", value = "Unidade da RFB da Cia. Aérea ou Depositário responsável pela entrega<br/>Este campo só é retornado para impedimentos originados no sistema Mantra")
 /**
   * Unidade da RFB da Cia. Aérea ou Depositário responsável pela entrega<br/>Este campo só é retornado para impedimentos originados no sistema Mantra
  **/
  private String unidadeRFB = null;
 /**
   * Código do impedimento.&lt;br/&gt;Tamanho: 11
   * @return codigo
  **/
  @JsonProperty("codigo")
  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public ImpedimentoEntregaImportador codigo(String codigo) {
    this.codigo = codigo;
    return this;
  }

 /**
   * Descrição do impedimento&lt;br/&gt;Tamanho máximo: 300
   * @return descricao
  **/
  @JsonProperty("descricao")
  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public ImpedimentoEntregaImportador descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }

 /**
   * Descrição da unidade da RFB da Cia. Aérea ou Depositário responsável pela entrega&lt;br/&gt;Este campo só é retornado para impedimentos originados no sistema Mantra
   * @return descricaoUnidadeRFB
  **/
  @JsonProperty("descricaoUnidadeRFB")
  public String getDescricaoUnidadeRFB() {
    return descricaoUnidadeRFB;
  }

  public void setDescricaoUnidadeRFB(String descricaoUnidadeRFB) {
    this.descricaoUnidadeRFB = descricaoUnidadeRFB;
  }

  public ImpedimentoEntregaImportador descricaoUnidadeRFB(String descricaoUnidadeRFB) {
    this.descricaoUnidadeRFB = descricaoUnidadeRFB;
    return this;
  }

 /**
   * Unidade da RFB da Cia. Aérea ou Depositário responsável pela entrega&lt;br/&gt;Este campo só é retornado para impedimentos originados no sistema Mantra
   * @return unidadeRFB
  **/
  @JsonProperty("unidadeRFB")
  public String getUnidadeRFB() {
    return unidadeRFB;
  }

  public void setUnidadeRFB(String unidadeRFB) {
    this.unidadeRFB = unidadeRFB;
  }

  public ImpedimentoEntregaImportador unidadeRFB(String unidadeRFB) {
    this.unidadeRFB = unidadeRFB;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImpedimentoEntregaImportador {\n");
    
    sb.append("    codigo: ").append(toIndentedString(codigo)).append("\n");
    sb.append("    descricao: ").append(toIndentedString(descricao)).append("\n");
    sb.append("    descricaoUnidadeRFB: ").append(toIndentedString(descricaoUnidadeRFB)).append("\n");
    sb.append("    unidadeRFB: ").append(toIndentedString(unidadeRFB)).append("\n");
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

