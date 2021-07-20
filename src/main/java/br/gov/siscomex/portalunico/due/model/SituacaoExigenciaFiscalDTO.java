package br.gov.siscomex.portalunico.due.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "SituacaoExigenciaFiscalDTO", propOrder =
    { "descricao"
})

@XmlRootElement(name="SituacaoExigenciaFiscalDTO")
public class SituacaoExigenciaFiscalDTO  {
  
  @XmlElement(name="descricao")
  @ApiModelProperty(example = "Ativa", value = "Descriçao da situação<br />Domínio: <br />Ativa<br />Dispensada<br />Atendida<br />Encerrada (DU-E Cancelada)<br />Encerrada (DU-E Cancelada por Ofício)")
 /**
   * Descriçao da situação<br />Domínio: <br />Ativa<br />Dispensada<br />Atendida<br />Encerrada (DU-E Cancelada)<br />Encerrada (DU-E Cancelada por Ofício)
  **/
  private String descricao = null;
 /**
   * Descriçao da situação&lt;br /&gt;Domínio: &lt;br /&gt;Ativa&lt;br /&gt;Dispensada&lt;br /&gt;Atendida&lt;br /&gt;Encerrada (DU-E Cancelada)&lt;br /&gt;Encerrada (DU-E Cancelada por Ofício)
   * @return descricao
  **/
  @JsonProperty("descricao")
  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public SituacaoExigenciaFiscalDTO descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SituacaoExigenciaFiscalDTO {\n");
    
    sb.append("    descricao: ").append(toIndentedString(descricao)).append("\n");
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

