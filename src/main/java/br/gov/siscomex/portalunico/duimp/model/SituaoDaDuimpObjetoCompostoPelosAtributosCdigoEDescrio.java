package br.gov.siscomex.portalunico.duimp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "SituaoDaDuimpObjetoCompostoPelosAtributosCdigoEDescrio", propOrder =
    { "codigo", "descricao"
})

@XmlRootElement(name="SituaoDaDuimpObjetoCompostoPelosAtributosCdigoEDescrio")
public class SituaoDaDuimpObjetoCompostoPelosAtributosCdigoEDescrio  {
  
  @XmlElement(name="codigo")
  @ApiModelProperty(example = "11", value = "Situação da versão vigente da Duimp.:<br>Dominio: <br>00 - Em elaboração.<br>02 - Em elaboração. Aguardando Resposta da Vinculação de Carga<br>04 - Em elaboração. Aguardando Resposta do PCCE<br>05 - Em elaboração. Aguardando Resposta da Desvinculação de Carga<br>11 - Registrada. Aguardando Resultado da Análise de Risco<br>12 - Registrada. Aguardando Resultado da Análise de Risco (Retificação)<br>13 - Registrada. Análise de Risco Recebida<br>31 - Em Conferência<br>33 - Em Conferência. Pendente de Análise de Risco<br>37 - Em Conferência. Pendente de Análise do Responsável<br>40 - Desembaraçada. Aguardando Chegada da Carga ou Cumprimento de Tributos Estaduais<br>42 - Desembaraçada. Aguardando Entrega da Carga<br>43 - Desembaraçada. Carga Entregue<br>50 - Entrega Antecipada Autorizada. Aguardando Chegada da Carga ou Cumprimento de Tributos Estaduais<br>52 - Entrega Antecipada Autorizada. Aguardando Entrega da Carga<br>53 - Entrega Antecipada Autorizada. Carga Entregue<br>60 - Solicitação de Retificação em Elaboração.<br>62 - Solicitação de Retificação em Elaboração. Aguardando Resposta da Vinculação de Carga<br>63 - Solicitação de Retificação em Elaboração. Aguardando Resposta da Desvinculação de Carga Antiga<br>64 - Solicitação de Retificação em Elaboração. Aguardando Resposta do PCCE<br>65 - Solicitação de Retificação em Elaboração. Aguardando Resposta da Desvinculação de Carga Nova<br>80 - Cancelada. Por Apuração Especial<br>82 - Cancelada. Pela Aduana a pedido do importador")
 /**
   * Situação da versão vigente da Duimp.:<br>Dominio: <br>00 - Em elaboração.<br>02 - Em elaboração. Aguardando Resposta da Vinculação de Carga<br>04 - Em elaboração. Aguardando Resposta do PCCE<br>05 - Em elaboração. Aguardando Resposta da Desvinculação de Carga<br>11 - Registrada. Aguardando Resultado da Análise de Risco<br>12 - Registrada. Aguardando Resultado da Análise de Risco (Retificação)<br>13 - Registrada. Análise de Risco Recebida<br>31 - Em Conferência<br>33 - Em Conferência. Pendente de Análise de Risco<br>37 - Em Conferência. Pendente de Análise do Responsável<br>40 - Desembaraçada. Aguardando Chegada da Carga ou Cumprimento de Tributos Estaduais<br>42 - Desembaraçada. Aguardando Entrega da Carga<br>43 - Desembaraçada. Carga Entregue<br>50 - Entrega Antecipada Autorizada. Aguardando Chegada da Carga ou Cumprimento de Tributos Estaduais<br>52 - Entrega Antecipada Autorizada. Aguardando Entrega da Carga<br>53 - Entrega Antecipada Autorizada. Carga Entregue<br>60 - Solicitação de Retificação em Elaboração.<br>62 - Solicitação de Retificação em Elaboração. Aguardando Resposta da Vinculação de Carga<br>63 - Solicitação de Retificação em Elaboração. Aguardando Resposta da Desvinculação de Carga Antiga<br>64 - Solicitação de Retificação em Elaboração. Aguardando Resposta do PCCE<br>65 - Solicitação de Retificação em Elaboração. Aguardando Resposta da Desvinculação de Carga Nova<br>80 - Cancelada. Por Apuração Especial<br>82 - Cancelada. Pela Aduana a pedido do importador
  **/
  private String codigo = null;

  @XmlElement(name="descricao")
  @ApiModelProperty(example = "Registrada. Aguardando Resultado da Análise de Risco", value = "Descrição da situação correspondente ao valor informado no atributo 'codigo'. <br>Tamanho mínimo: 1<br>Tamanho máximo: 150")
 /**
   * Descrição da situação correspondente ao valor informado no atributo 'codigo'. <br>Tamanho mínimo: 1<br>Tamanho máximo: 150
  **/
  private String descricao = null;
 /**
   * Situação da versão vigente da Duimp.:&lt;br&gt;Dominio: &lt;br&gt;00 - Em elaboração.&lt;br&gt;02 - Em elaboração. Aguardando Resposta da Vinculação de Carga&lt;br&gt;04 - Em elaboração. Aguardando Resposta do PCCE&lt;br&gt;05 - Em elaboração. Aguardando Resposta da Desvinculação de Carga&lt;br&gt;11 - Registrada. Aguardando Resultado da Análise de Risco&lt;br&gt;12 - Registrada. Aguardando Resultado da Análise de Risco (Retificação)&lt;br&gt;13 - Registrada. Análise de Risco Recebida&lt;br&gt;31 - Em Conferência&lt;br&gt;33 - Em Conferência. Pendente de Análise de Risco&lt;br&gt;37 - Em Conferência. Pendente de Análise do Responsável&lt;br&gt;40 - Desembaraçada. Aguardando Chegada da Carga ou Cumprimento de Tributos Estaduais&lt;br&gt;42 - Desembaraçada. Aguardando Entrega da Carga&lt;br&gt;43 - Desembaraçada. Carga Entregue&lt;br&gt;50 - Entrega Antecipada Autorizada. Aguardando Chegada da Carga ou Cumprimento de Tributos Estaduais&lt;br&gt;52 - Entrega Antecipada Autorizada. Aguardando Entrega da Carga&lt;br&gt;53 - Entrega Antecipada Autorizada. Carga Entregue&lt;br&gt;60 - Solicitação de Retificação em Elaboração.&lt;br&gt;62 - Solicitação de Retificação em Elaboração. Aguardando Resposta da Vinculação de Carga&lt;br&gt;63 - Solicitação de Retificação em Elaboração. Aguardando Resposta da Desvinculação de Carga Antiga&lt;br&gt;64 - Solicitação de Retificação em Elaboração. Aguardando Resposta do PCCE&lt;br&gt;65 - Solicitação de Retificação em Elaboração. Aguardando Resposta da Desvinculação de Carga Nova&lt;br&gt;80 - Cancelada. Por Apuração Especial&lt;br&gt;82 - Cancelada. Pela Aduana a pedido do importador
   * @return codigo
  **/
  @JsonProperty("codigo")
  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public SituaoDaDuimpObjetoCompostoPelosAtributosCdigoEDescrio codigo(String codigo) {
    this.codigo = codigo;
    return this;
  }

 /**
   * Descrição da situação correspondente ao valor informado no atributo &#39;codigo&#39;. &lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 150
   * @return descricao
  **/
  @JsonProperty("descricao")
  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public SituaoDaDuimpObjetoCompostoPelosAtributosCdigoEDescrio descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SituaoDaDuimpObjetoCompostoPelosAtributosCdigoEDescrio {\n");
    
    sb.append("    codigo: ").append(toIndentedString(codigo)).append("\n");
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

