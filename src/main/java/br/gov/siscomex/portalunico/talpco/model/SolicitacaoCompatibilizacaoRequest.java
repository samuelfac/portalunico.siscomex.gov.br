package br.gov.siscomex.portalunico.talpco.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "SolicitacaoCompatibilizacaoRequest", propOrder =
    { "numeroDocumento", "numeroItemDocumento", "versaoCompatibilizacao", "justificativa"
})

@XmlRootElement(name="SolicitacaoCompatibilizacaoRequest")
/**
  * Dados para realizar uma solicitação de compatiblização de versões de produtos de um LPCO
 **/
@ApiModel(description="Dados para realizar uma solicitação de compatiblização de versões de produtos de um LPCO")
public class SolicitacaoCompatibilizacaoRequest  {
  
  @XmlElement(name="numeroDocumento", required = true)
  @ApiModelProperty(example = "20BR00000000000", required = true, value = "Número do documento de importação (Duimp) vinculado aos itens LPCO a serem compatilizados<br>Tamanho: 15")
 /**
   * Número do documento de importação (Duimp) vinculado aos itens LPCO a serem compatilizados<br>Tamanho: 15
  **/
  private String numeroDocumento = null;

  @XmlElement(name="numeroItemDocumento", required = true)
  @ApiModelProperty(example = "1", required = true, value = "Número do item da Duimp vinculado aos itens LPCO a serem compatilizados")
 /**
   * Número do item da Duimp vinculado aos itens LPCO a serem compatilizados
  **/
  private Integer numeroItemDocumento = null;

  @XmlElement(name="versaoCompatibilizacao", required = true)
  @ApiModelProperty(example = "1.1", required = true, value = "Versão do produto a ser compatilizado<br>Tamanho mínimo: 1<br>Tamanho máximo: 3")
 /**
   * Versão do produto a ser compatilizado<br>Tamanho mínimo: 1<br>Tamanho máximo: 3
  **/
  private String versaoCompatibilizacao = null;

  @XmlElement(name="justificativa")
  @ApiModelProperty(example = "Texto livre", value = "Justificativa utilizada para solicitação de compatibilização<br>Tamanho mínimo: 1<br>Tamanho máximo: 3900")
 /**
   * Justificativa utilizada para solicitação de compatibilização<br>Tamanho mínimo: 1<br>Tamanho máximo: 3900
  **/
  private String justificativa = null;
 /**
   * Número do documento de importação (Duimp) vinculado aos itens LPCO a serem compatilizados&lt;br&gt;Tamanho: 15
   * @return numeroDocumento
  **/
  @JsonProperty("numeroDocumento")
  @NotNull
  public String getNumeroDocumento() {
    return numeroDocumento;
  }

  public void setNumeroDocumento(String numeroDocumento) {
    this.numeroDocumento = numeroDocumento;
  }

  public SolicitacaoCompatibilizacaoRequest numeroDocumento(String numeroDocumento) {
    this.numeroDocumento = numeroDocumento;
    return this;
  }

 /**
   * Número do item da Duimp vinculado aos itens LPCO a serem compatilizados
   * @return numeroItemDocumento
  **/
  @JsonProperty("numeroItemDocumento")
  @NotNull
  public Integer getNumeroItemDocumento() {
    return numeroItemDocumento;
  }

  public void setNumeroItemDocumento(Integer numeroItemDocumento) {
    this.numeroItemDocumento = numeroItemDocumento;
  }

  public SolicitacaoCompatibilizacaoRequest numeroItemDocumento(Integer numeroItemDocumento) {
    this.numeroItemDocumento = numeroItemDocumento;
    return this;
  }

 /**
   * Versão do produto a ser compatilizado&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 3
   * @return versaoCompatibilizacao
  **/
  @JsonProperty("versaoCompatibilizacao")
  @NotNull
  public String getVersaoCompatibilizacao() {
    return versaoCompatibilizacao;
  }

  public void setVersaoCompatibilizacao(String versaoCompatibilizacao) {
    this.versaoCompatibilizacao = versaoCompatibilizacao;
  }

  public SolicitacaoCompatibilizacaoRequest versaoCompatibilizacao(String versaoCompatibilizacao) {
    this.versaoCompatibilizacao = versaoCompatibilizacao;
    return this;
  }

 /**
   * Justificativa utilizada para solicitação de compatibilização&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 3900
   * @return justificativa
  **/
  @JsonProperty("justificativa")
  public String getJustificativa() {
    return justificativa;
  }

  public void setJustificativa(String justificativa) {
    this.justificativa = justificativa;
  }

  public SolicitacaoCompatibilizacaoRequest justificativa(String justificativa) {
    this.justificativa = justificativa;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SolicitacaoCompatibilizacaoRequest {\n");
    
    sb.append("    numeroDocumento: ").append(toIndentedString(numeroDocumento)).append("\n");
    sb.append("    numeroItemDocumento: ").append(toIndentedString(numeroItemDocumento)).append("\n");
    sb.append("    versaoCompatibilizacao: ").append(toIndentedString(versaoCompatibilizacao)).append("\n");
    sb.append("    justificativa: ").append(toIndentedString(justificativa)).append("\n");
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

