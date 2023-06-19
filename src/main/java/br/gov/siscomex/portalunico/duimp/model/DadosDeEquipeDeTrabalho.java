package br.gov.siscomex.portalunico.duimp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "DadosDeEquipeDeTrabalho", propOrder =
    { "orgao", "equipeTrabalho"
})

@XmlRootElement(name="DadosDeEquipeDeTrabalho")
public class DadosDeEquipeDeTrabalho  {
  
  @XmlElement(name="orgao")
  @ApiModelProperty(example = "RECEITA", value = "Sigla do Órgão associado a equipe de trabalho<br>Tamanho mínimo: 1<br>Tamanho máximo: 10")
 /**
   * Sigla do Órgão associado a equipe de trabalho<br>Tamanho mínimo: 1<br>Tamanho máximo: 10
  **/
  private String orgao = null;

  @XmlElement(name="equipeTrabalho")
  @ApiModelProperty(example = "08178001", value = "Código da equipe de trabalho de análise fiscal<br>Tamanho mínimo: 1<br>Tamanho máximo: 10")
 /**
   * Código da equipe de trabalho de análise fiscal<br>Tamanho mínimo: 1<br>Tamanho máximo: 10
  **/
  private String equipeTrabalho = null;
 /**
   * Sigla do Órgão associado a equipe de trabalho&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 10
   * @return orgao
  **/
  @JsonProperty("orgao")
  public String getOrgao() {
    return orgao;
  }

  public void setOrgao(String orgao) {
    this.orgao = orgao;
  }

  public DadosDeEquipeDeTrabalho orgao(String orgao) {
    this.orgao = orgao;
    return this;
  }

 /**
   * Código da equipe de trabalho de análise fiscal&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 10
   * @return equipeTrabalho
  **/
  @JsonProperty("equipeTrabalho")
  public String getEquipeTrabalho() {
    return equipeTrabalho;
  }

  public void setEquipeTrabalho(String equipeTrabalho) {
    this.equipeTrabalho = equipeTrabalho;
  }

  public DadosDeEquipeDeTrabalho equipeTrabalho(String equipeTrabalho) {
    this.equipeTrabalho = equipeTrabalho;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DadosDeEquipeDeTrabalho {\n");
    
    sb.append("    orgao: ").append(toIndentedString(orgao)).append("\n");
    sb.append("    equipeTrabalho: ").append(toIndentedString(equipeTrabalho)).append("\n");
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

