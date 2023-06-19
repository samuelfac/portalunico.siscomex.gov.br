package br.gov.siscomex.portalunico.cct_ext.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "OperacaoDesunitizacao", propOrder =
    { "identificacaoResponsavelDesunitizacao", "local", "desunitizacoes"
})

@XmlRootElement(name="OperacaoDesunitizacao")
/**
  * Desunitização de carga<br>Máximo de ocorrências: 1
 **/
@ApiModel(description="Desunitização de carga<br>Máximo de ocorrências: 1")
public class OperacaoDesunitizacao  {
  
  @XmlElement(name="identificacaoResponsavelDesunitizacao", required = true)
  @ApiModelProperty(example = "27657485000147", required = true, value = "CNPJ do responsável pela Desunitização<br>Tamanho: 14<br>Formato: NNNNNNNNNNNNNN")
 /**
   * CNPJ do responsável pela Desunitização<br>Tamanho: 14<br>Formato: NNNNNNNNNNNNNN
  **/
  private String identificacaoResponsavelDesunitizacao = null;

  @XmlElement(name="local", required = true)
  @ApiModelProperty(required = true, value = "")
  @Valid
  private Local local = null;

  @XmlElement(name="desunitizacoes", required = true)
  @ApiModelProperty(required = true, value = "Lista das desunitizações")
  @Valid
 /**
   * Lista das desunitizações
  **/
  private List<Desunitizacao> desunitizacoes = new ArrayList<>();
 /**
   * CNPJ do responsável pela Desunitização&lt;br&gt;Tamanho: 14&lt;br&gt;Formato: NNNNNNNNNNNNNN
   * @return identificacaoResponsavelDesunitizacao
  **/
  @JsonProperty("identificacaoResponsavelDesunitizacao")
  @NotNull
  public String getIdentificacaoResponsavelDesunitizacao() {
    return identificacaoResponsavelDesunitizacao;
  }

  public void setIdentificacaoResponsavelDesunitizacao(String identificacaoResponsavelDesunitizacao) {
    this.identificacaoResponsavelDesunitizacao = identificacaoResponsavelDesunitizacao;
  }

  public OperacaoDesunitizacao identificacaoResponsavelDesunitizacao(String identificacaoResponsavelDesunitizacao) {
    this.identificacaoResponsavelDesunitizacao = identificacaoResponsavelDesunitizacao;
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

  public OperacaoDesunitizacao local(Local local) {
    this.local = local;
    return this;
  }

 /**
   * Lista das desunitizações
   * @return desunitizacoes
  **/
  @JsonProperty("desunitizacoes")
  @NotNull
  public List<Desunitizacao> getDesunitizacoes() {
    return desunitizacoes;
  }

  public void setDesunitizacoes(List<Desunitizacao> desunitizacoes) {
    this.desunitizacoes = desunitizacoes;
  }

  public OperacaoDesunitizacao desunitizacoes(List<Desunitizacao> desunitizacoes) {
    this.desunitizacoes = desunitizacoes;
    return this;
  }

  public OperacaoDesunitizacao addDesunitizacoesItem(Desunitizacao desunitizacoesItem) {
    this.desunitizacoes.add(desunitizacoesItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperacaoDesunitizacao {\n");
    
    sb.append("    identificacaoResponsavelDesunitizacao: ").append(toIndentedString(identificacaoResponsavelDesunitizacao)).append("\n");
    sb.append("    local: ").append(toIndentedString(local)).append("\n");
    sb.append("    desunitizacoes: ").append(toIndentedString(desunitizacoes)).append("\n");
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

