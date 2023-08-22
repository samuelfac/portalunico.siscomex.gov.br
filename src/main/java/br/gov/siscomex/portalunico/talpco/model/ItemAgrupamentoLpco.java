package br.gov.siscomex.portalunico.talpco.model;

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
 @XmlType(name = "ItemAgrupamentoLpco", propOrder =
    { "numeroLi", "numeroLpco", "situacao", "numeroConhecimento", "dataInclusao", "dataExclusao"
})

@XmlRootElement(name="ItemAgrupamentoLpco")
/**
  * Item que faz parte de um agrupamento de LPCOs (apenas LPCOs com LI vinculada). Permite identificar o LPCO que faz parte do agrupamento.
 **/
@ApiModel(description="Item que faz parte de um agrupamento de LPCOs (apenas LPCOs com LI vinculada). Permite identificar o LPCO que faz parte do agrupamento.")
public class ItemAgrupamentoLpco  {
  
  @XmlElement(name="numeroLi", required = true)
  @ApiModelProperty(example = "2300012349", required = true, value = "Número da LI a qual o LPCO que faz parte do agrupamento está vinculado.<br>Tamanho: 11<br>Formato: AANNNNNNNV (apenas dígitos, sem os caracteres separadores)<br>Lei de formação: O número da LI é composto por:<br>* AA = Ano do registro da LI<br>* NNNNNNN = Número sequencial da LI no ano* V = Dígito verificador")
 /**
   * Número da LI a qual o LPCO que faz parte do agrupamento está vinculado.<br>Tamanho: 11<br>Formato: AANNNNNNNV (apenas dígitos, sem os caracteres separadores)<br>Lei de formação: O número da LI é composto por:<br>* AA = Ano do registro da LI<br>* NNNNNNN = Número sequencial da LI no ano* V = Dígito verificador
  **/
  private String numeroLi = null;

  @XmlElement(name="numeroLpco", required = true)
  @ApiModelProperty(example = "E1900000001", required = true, value = "Número do LPCO que faz parte do agrupamento está vinculado.<br>Tamanho: 11<br>Formato: OAANNNNNNNN<br>Lei de formação: O número do LPCO é composto por:<br>* O = Operação (E para exportação, I para importação)<br>* AA = Ano do registro do LPCO<br>* NNNNNNNN = Número sequencial do LPCO no ano")
 /**
   * Número do LPCO que faz parte do agrupamento está vinculado.<br>Tamanho: 11<br>Formato: OAANNNNNNNN<br>Lei de formação: O número do LPCO é composto por:<br>* O = Operação (E para exportação, I para importação)<br>* AA = Ano do registro do LPCO<br>* NNNNNNNN = Número sequencial do LPCO no ano
  **/
  private String numeroLpco = null;

  @XmlElement(name="situacao", required = true)
  @ApiModelProperty(example = "Para análise", required = true, value = "Descrição da situação na qual o LPCO agrupado se encontra.<br>Tamanho máximo: 30")
 /**
   * Descrição da situação na qual o LPCO agrupado se encontra.<br>Tamanho máximo: 30
  **/
  private String situacao = null;

  @XmlElement(name="numeroConhecimento")
  @ApiModelProperty(example = "99999999999999999999", value = "Número do conhecimento de carga do LPCO, se houver. Disponível apenas em LPCOs com LI vinculada.<br>Tamanho máximo: 20")
 /**
   * Número do conhecimento de carga do LPCO, se houver. Disponível apenas em LPCOs com LI vinculada.<br>Tamanho máximo: 20
  **/
  private String numeroConhecimento = null;

  @XmlElement(name="dataInclusao", required = true)
  @ApiModelProperty(example = "2019-09-02T10:04:38.123Z", required = true, value = "Data em que o LPCO foi incluído no agrupamento.<br>Formato: dd-MM-yyyy'T'HH:mm:ss:SSSZ")
 /**
   * Data em que o LPCO foi incluído no agrupamento.<br>Formato: dd-MM-yyyy'T'HH:mm:ss:SSSZ
  **/
  private String dataInclusao = null;

  @XmlElement(name="dataExclusao")
  @ApiModelProperty(example = "2019-09-02T10:04:38.123Z", value = "Data em que o LPCO foi excluído no agrupamento (se for o caso).<br>Formato: dd-MM-yyyy'T'HH:mm:ss:SSSZ")
 /**
   * Data em que o LPCO foi excluído no agrupamento (se for o caso).<br>Formato: dd-MM-yyyy'T'HH:mm:ss:SSSZ
  **/
  private String dataExclusao = null;
 /**
   * Número da LI a qual o LPCO que faz parte do agrupamento está vinculado.&lt;br&gt;Tamanho: 11&lt;br&gt;Formato: AANNNNNNNV (apenas dígitos, sem os caracteres separadores)&lt;br&gt;Lei de formação: O número da LI é composto por:&lt;br&gt;* AA &#x3D; Ano do registro da LI&lt;br&gt;* NNNNNNN &#x3D; Número sequencial da LI no ano* V &#x3D; Dígito verificador
   * @return numeroLi
  **/
  @JsonProperty("numeroLi")
  @NotNull
  public String getNumeroLi() {
    return numeroLi;
  }

  public void setNumeroLi(String numeroLi) {
    this.numeroLi = numeroLi;
  }

  public ItemAgrupamentoLpco numeroLi(String numeroLi) {
    this.numeroLi = numeroLi;
    return this;
  }

 /**
   * Número do LPCO que faz parte do agrupamento está vinculado.&lt;br&gt;Tamanho: 11&lt;br&gt;Formato: OAANNNNNNNN&lt;br&gt;Lei de formação: O número do LPCO é composto por:&lt;br&gt;* O &#x3D; Operação (E para exportação, I para importação)&lt;br&gt;* AA &#x3D; Ano do registro do LPCO&lt;br&gt;* NNNNNNNN &#x3D; Número sequencial do LPCO no ano
   * @return numeroLpco
  **/
  @JsonProperty("numeroLpco")
  @NotNull
  public String getNumeroLpco() {
    return numeroLpco;
  }

  public void setNumeroLpco(String numeroLpco) {
    this.numeroLpco = numeroLpco;
  }

  public ItemAgrupamentoLpco numeroLpco(String numeroLpco) {
    this.numeroLpco = numeroLpco;
    return this;
  }

 /**
   * Descrição da situação na qual o LPCO agrupado se encontra.&lt;br&gt;Tamanho máximo: 30
   * @return situacao
  **/
  @JsonProperty("situacao")
  @NotNull
  public String getSituacao() {
    return situacao;
  }

  public void setSituacao(String situacao) {
    this.situacao = situacao;
  }

  public ItemAgrupamentoLpco situacao(String situacao) {
    this.situacao = situacao;
    return this;
  }

 /**
   * Número do conhecimento de carga do LPCO, se houver. Disponível apenas em LPCOs com LI vinculada.&lt;br&gt;Tamanho máximo: 20
   * @return numeroConhecimento
  **/
  @JsonProperty("numeroConhecimento")
  public String getNumeroConhecimento() {
    return numeroConhecimento;
  }

  public void setNumeroConhecimento(String numeroConhecimento) {
    this.numeroConhecimento = numeroConhecimento;
  }

  public ItemAgrupamentoLpco numeroConhecimento(String numeroConhecimento) {
    this.numeroConhecimento = numeroConhecimento;
    return this;
  }

 /**
   * Data em que o LPCO foi incluído no agrupamento.&lt;br&gt;Formato: dd-MM-yyyy&#39;T&#39;HH:mm:ss:SSSZ
   * @return dataInclusao
  **/
  @JsonProperty("dataInclusao")
  @NotNull
  public String getDataInclusao() {
    return dataInclusao;
  }

  public void setDataInclusao(String dataInclusao) {
    this.dataInclusao = dataInclusao;
  }

  public ItemAgrupamentoLpco dataInclusao(String dataInclusao) {
    this.dataInclusao = dataInclusao;
    return this;
  }

 /**
   * Data em que o LPCO foi excluído no agrupamento (se for o caso).&lt;br&gt;Formato: dd-MM-yyyy&#39;T&#39;HH:mm:ss:SSSZ
   * @return dataExclusao
  **/
  @JsonProperty("dataExclusao")
  public String getDataExclusao() {
    return dataExclusao;
  }

  public void setDataExclusao(String dataExclusao) {
    this.dataExclusao = dataExclusao;
  }

  public ItemAgrupamentoLpco dataExclusao(String dataExclusao) {
    this.dataExclusao = dataExclusao;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemAgrupamentoLpco {\n");
    
    sb.append("    numeroLi: ").append(toIndentedString(numeroLi)).append("\n");
    sb.append("    numeroLpco: ").append(toIndentedString(numeroLpco)).append("\n");
    sb.append("    situacao: ").append(toIndentedString(situacao)).append("\n");
    sb.append("    numeroConhecimento: ").append(toIndentedString(numeroConhecimento)).append("\n");
    sb.append("    dataInclusao: ").append(toIndentedString(dataInclusao)).append("\n");
    sb.append("    dataExclusao: ").append(toIndentedString(dataExclusao)).append("\n");
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

