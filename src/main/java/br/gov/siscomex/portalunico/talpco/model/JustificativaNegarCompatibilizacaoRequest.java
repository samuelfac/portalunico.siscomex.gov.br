package br.gov.siscomex.portalunico.talpco.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "JustificativaNegarCompatibilizacaoRequest", propOrder =
    { "justificativa", "faltaPagamentoTaxa"
})

@XmlRootElement(name="JustificativaNegarCompatibilizacaoRequest")
/**
  * Justificativa para a ação sobre solciitação de compatibilização de produtos em um LPCO
 **/
@ApiModel(description="Justificativa para a ação sobre solciitação de compatibilização de produtos em um LPCO")
public class JustificativaNegarCompatibilizacaoRequest  {
  
  @XmlElement(name="justificativa")
  @ApiModelProperty(example = "Texto livre", value = "Justificativa para a operação. Tamanho mínimo: 1<br>Tamanho máximo: 3900")
 /**
   * Justificativa para a operação. Tamanho mínimo: 1<br>Tamanho máximo: 3900
  **/
  private String justificativa = null;

  @XmlElement(name="faltaPagamentoTaxa")
  @ApiModelProperty(example = "false", value = "Indica se o pagamento de taxa não efetuado")
 /**
   * Indica se o pagamento de taxa não efetuado
  **/
  private Boolean faltaPagamentoTaxa = false;
 /**
   * Justificativa para a operação. Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 3900
   * @return justificativa
  **/
  @JsonProperty("justificativa")
  public String getJustificativa() {
    return justificativa;
  }

  public void setJustificativa(String justificativa) {
    this.justificativa = justificativa;
  }

  public JustificativaNegarCompatibilizacaoRequest justificativa(String justificativa) {
    this.justificativa = justificativa;
    return this;
  }

 /**
   * Indica se o pagamento de taxa não efetuado
   * @return faltaPagamentoTaxa
  **/
  @JsonProperty("faltaPagamentoTaxa")
  public Boolean isFaltaPagamentoTaxa() {
    return faltaPagamentoTaxa;
  }

  public void setFaltaPagamentoTaxa(Boolean faltaPagamentoTaxa) {
    this.faltaPagamentoTaxa = faltaPagamentoTaxa;
  }

  public JustificativaNegarCompatibilizacaoRequest faltaPagamentoTaxa(Boolean faltaPagamentoTaxa) {
    this.faltaPagamentoTaxa = faltaPagamentoTaxa;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JustificativaNegarCompatibilizacaoRequest {\n");
    
    sb.append("    justificativa: ").append(toIndentedString(justificativa)).append("\n");
    sb.append("    faltaPagamentoTaxa: ").append(toIndentedString(faltaPagamentoTaxa)).append("\n");
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

