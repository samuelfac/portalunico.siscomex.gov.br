package br.gov.siscomex.portalunico.cct_ext.model;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "OperacaoUnitizacao", propOrder =
    { "identificacaoResponsavelUnitizacao", "local", "unitizacoes"
})

@XmlRootElement(name="OperacaoUnitizacao")
/**
  * Unitização de Carga<br>Máximo de ocorrências: 1
 **/
@ApiModel(description="Unitização de Carga<br>Máximo de ocorrências: 1")
public class OperacaoUnitizacao  {
  
  @XmlElement(name="identificacaoResponsavelUnitizacao", required = true)
  @ApiModelProperty(example = "27657485000147", required = true, value = "CNPJ do responsável pela unitização<br>Tamanho: 14<br>Formato: NNNNNNNNNNNNNN")
 /**
   * CNPJ do responsável pela unitização<br>Tamanho: 14<br>Formato: NNNNNNNNNNNNNN
  **/
  private String identificacaoResponsavelUnitizacao = null;

  @XmlElement(name="local", required = true)
  @ApiModelProperty(required = true, value = "")
  @Valid
  private Local local = null;

  @XmlElement(name="unitizacoes", required = true)
  @ApiModelProperty(required = true, value = "Dados das cargas unitizadas")
  @Valid
 /**
   * Dados das cargas unitizadas
  **/
  private List<Unitizacoes> unitizacoes = new ArrayList<>();
 /**
   * CNPJ do responsável pela unitização&lt;br&gt;Tamanho: 14&lt;br&gt;Formato: NNNNNNNNNNNNNN
   * @return identificacaoResponsavelUnitizacao
  **/
  @JsonProperty("identificacaoResponsavelUnitizacao")
  @NotNull
  public String getIdentificacaoResponsavelUnitizacao() {
    return identificacaoResponsavelUnitizacao;
  }

  public void setIdentificacaoResponsavelUnitizacao(String identificacaoResponsavelUnitizacao) {
    this.identificacaoResponsavelUnitizacao = identificacaoResponsavelUnitizacao;
  }

  public OperacaoUnitizacao identificacaoResponsavelUnitizacao(String identificacaoResponsavelUnitizacao) {
    this.identificacaoResponsavelUnitizacao = identificacaoResponsavelUnitizacao;
    return this;
  }

 /**
   * Get local
   * @return local
  **/
  @JsonProperty("local")
  @NotNull
  public Local getLocal() {
    return local;
  }

  public void setLocal(Local local) {
    this.local = local;
  }

  public OperacaoUnitizacao local(Local local) {
    this.local = local;
    return this;
  }

 /**
   * Dados das cargas unitizadas
   * @return unitizacoes
  **/
  @JsonProperty("unitizacoes")
  @NotNull
  public List<Unitizacoes> getUnitizacoes() {
    return unitizacoes;
  }

  public void setUnitizacoes(List<Unitizacoes> unitizacoes) {
    this.unitizacoes = unitizacoes;
  }

  public OperacaoUnitizacao unitizacoes(List<Unitizacoes> unitizacoes) {
    this.unitizacoes = unitizacoes;
    return this;
  }

  public OperacaoUnitizacao addUnitizacoesItem(Unitizacoes unitizacoesItem) {
    this.unitizacoes.add(unitizacoesItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperacaoUnitizacao {\n");
    
    sb.append("    identificacaoResponsavelUnitizacao: ").append(toIndentedString(identificacaoResponsavelUnitizacao)).append("\n");
    sb.append("    local: ").append(toIndentedString(local)).append("\n");
    sb.append("    unitizacoes: ").append(toIndentedString(unitizacoes)).append("\n");
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

