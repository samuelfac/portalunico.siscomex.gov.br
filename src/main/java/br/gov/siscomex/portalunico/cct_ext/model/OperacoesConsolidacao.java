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
 @XmlType(name = "OperacoesConsolidacao", propOrder =
    { "operacaoConsolidacao"
})

@XmlRootElement(name="OperacoesConsolidacao")
/**
  * Lista de consolidações<br>Máximo de ocorrências: 1
 **/
@ApiModel(description="Lista de consolidações<br>Máximo de ocorrências: 1")
public class OperacoesConsolidacao  {
  
  @XmlElement(name="operacaoConsolidacao", required = true)
  @ApiModelProperty(required = true, value = "Dados da consolidação")
  @Valid
 /**
   * Dados da consolidação
  **/
  private List<OperacaoConsolidacao> operacaoConsolidacao = new ArrayList<>();
 /**
   * Dados da consolidação
   * @return operacaoConsolidacao
  **/
  @JsonProperty("operacaoConsolidacao")
  @NotNull
  public List<OperacaoConsolidacao> getOperacaoConsolidacao() {
    return operacaoConsolidacao;
  }

  public void setOperacaoConsolidacao(List<OperacaoConsolidacao> operacaoConsolidacao) {
    this.operacaoConsolidacao = operacaoConsolidacao;
  }

  public OperacoesConsolidacao operacaoConsolidacao(List<OperacaoConsolidacao> operacaoConsolidacao) {
    this.operacaoConsolidacao = operacaoConsolidacao;
    return this;
  }

  public OperacoesConsolidacao addOperacaoConsolidacaoItem(OperacaoConsolidacao operacaoConsolidacaoItem) {
    this.operacaoConsolidacao.add(operacaoConsolidacaoItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperacoesConsolidacao {\n");
    
    sb.append("    operacaoConsolidacao: ").append(toIndentedString(operacaoConsolidacao)).append("\n");
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

