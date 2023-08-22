package br.gov.siscomex.portalunico.pcce.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "OpcaoIcmsAlteracaoDto", propOrder =
    { "ativa", "descricaoOpcao"
})

@XmlRootElement(name="OpcaoIcmsAlteracaoDto")
/**
  * Opção de ICMS a ser alterada pela Sefaz
 **/
@ApiModel(description="Opção de ICMS a ser alterada pela Sefaz")
public class OpcaoIcmsAlteracaoDto  {
  
  @XmlElement(name="ativa", required = true)
  @ApiModelProperty(example = "true", required = true, value = "Indicador de que a opção está ativa e ficará disponível para uso pelo importador<br>Dominio:<br>true - Sim, <br>false - Não")
 /**
   * Indicador de que a opção está ativa e ficará disponível para uso pelo importador<br>Dominio:<br>true - Sim, <br>false - Não
  **/
  private Boolean ativa = null;

  @XmlElement(name="descricaoOpcao", required = true)
  @ApiModelProperty(example = "Id eu nisl nunc mi", required = true, value = "Descrição da opção que será exibida para o importador <br>Tamanho mínimo: 1<br>Tamanho máximo: 30")
 /**
   * Descrição da opção que será exibida para o importador <br>Tamanho mínimo: 1<br>Tamanho máximo: 30
  **/
  private String descricaoOpcao = null;
 /**
   * Indicador de que a opção está ativa e ficará disponível para uso pelo importador&lt;br&gt;Dominio:&lt;br&gt;true - Sim, &lt;br&gt;false - Não
   * @return ativa
  **/
  @JsonProperty("ativa")
  @NotNull
  public Boolean isAtiva() {
    return ativa;
  }

  public void setAtiva(Boolean ativa) {
    this.ativa = ativa;
  }

  public OpcaoIcmsAlteracaoDto ativa(Boolean ativa) {
    this.ativa = ativa;
    return this;
  }

 /**
   * Descrição da opção que será exibida para o importador &lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 30
   * @return descricaoOpcao
  **/
  @JsonProperty("descricaoOpcao")
  @NotNull
  public String getDescricaoOpcao() {
    return descricaoOpcao;
  }

  public void setDescricaoOpcao(String descricaoOpcao) {
    this.descricaoOpcao = descricaoOpcao;
  }

  public OpcaoIcmsAlteracaoDto descricaoOpcao(String descricaoOpcao) {
    this.descricaoOpcao = descricaoOpcao;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpcaoIcmsAlteracaoDto {\n");
    
    sb.append("    ativa: ").append(toIndentedString(ativa)).append("\n");
    sb.append("    descricaoOpcao: ").append(toIndentedString(descricaoOpcao)).append("\n");
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

