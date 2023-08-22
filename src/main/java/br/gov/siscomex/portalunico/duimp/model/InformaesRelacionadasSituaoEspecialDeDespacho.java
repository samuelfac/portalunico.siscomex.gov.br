package br.gov.siscomex.portalunico.duimp.model;

import br.gov.siscomex.portalunico.duimp.model.MotivoDaSituaoEspecialDeDespacho;
import java.math.BigDecimal;
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
 @XmlType(name = "InformaesRelacionadasSituaoEspecialDeDespacho", propOrder =
    { "indSituacaoEspecialDespacho", "motivoSituacaoEspecial", "valorTotalFreteReal", "valorSeguroEmReal"
})

@XmlRootElement(name="InformaesRelacionadasSituaoEspecialDeDespacho")
public class InformaesRelacionadasSituaoEspecialDeDespacho  {
  

@XmlType(name="IndSituacaoEspecialDespachoEnum")
@XmlEnum(String.class)
public enum IndSituacaoEspecialDespachoEnum {

	@XmlEnumValue("S")
	@JsonProperty("S")
	S(String.valueOf("S")),
	
	@XmlEnumValue("N")
	@JsonProperty("N")
	N(String.valueOf("N"));


    private String value;

    IndSituacaoEspecialDespachoEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static IndSituacaoEspecialDespachoEnum fromValue(String v) {
        for (IndSituacaoEspecialDespachoEnum b : IndSituacaoEspecialDespachoEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to IndSituacaoEspecialDespachoEnum");
    }
}

  @XmlElement(name="indSituacaoEspecialDespacho")
  @ApiModelProperty(example = "S", value = "Indicador de Duimp com situação especial de despacho.<br>Dominio: <br>S - Sim, <br>N - Não<br>Tamanho: 1")
 /**
   * Indicador de Duimp com situação especial de despacho.<br>Dominio: <br>S - Sim, <br>N - Não<br>Tamanho: 1
  **/
  private IndSituacaoEspecialDespachoEnum indSituacaoEspecialDespacho = null;

  @XmlElement(name="motivoSituacaoEspecial")
  @ApiModelProperty(value = "")
  @Valid
  private MotivoDaSituaoEspecialDeDespacho motivoSituacaoEspecial = null;

  @XmlElement(name="valorTotalFreteReal")
  @ApiModelProperty(example = "3806.12", value = "Valor do total do frete em Real para situação especial de despacho. (Valor calculado pelo sistema)<br>Tamanho: 17,2<br>Formato: Decimal, com até 2 casas decimais separadas por ponto.<br>Observação:<br>Apenas quando o indicador de situação especial de despacho for = 'S'")
  @Valid
 /**
   * Valor do total do frete em Real para situação especial de despacho. (Valor calculado pelo sistema)<br>Tamanho: 17,2<br>Formato: Decimal, com até 2 casas decimais separadas por ponto.<br>Observação:<br>Apenas quando o indicador de situação especial de despacho for = 'S'
  **/
  private BigDecimal valorTotalFreteReal = null;

  @XmlElement(name="valorSeguroEmReal")
  @ApiModelProperty(example = "120.48", value = "Valor do seguro em R$ (Reais)<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.<br>Observação:<br>Apenas quando o indicador de situação especial de despacho for = 'S'")
  @Valid
 /**
   * Valor do seguro em R$ (Reais)<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.<br>Observação:<br>Apenas quando o indicador de situação especial de despacho for = 'S'
  **/
  private BigDecimal valorSeguroEmReal = null;
 /**
   * Indicador de Duimp com situação especial de despacho.&lt;br&gt;Dominio: &lt;br&gt;S - Sim, &lt;br&gt;N - Não&lt;br&gt;Tamanho: 1
   * @return indSituacaoEspecialDespacho
  **/
  @JsonProperty("indSituacaoEspecialDespacho")
  public String getIndSituacaoEspecialDespacho() {
    if (indSituacaoEspecialDespacho == null) {
      return null;
    }
    return indSituacaoEspecialDespacho.value();
  }

  public void setIndSituacaoEspecialDespacho(IndSituacaoEspecialDespachoEnum indSituacaoEspecialDespacho) {
    this.indSituacaoEspecialDespacho = indSituacaoEspecialDespacho;
  }

  public InformaesRelacionadasSituaoEspecialDeDespacho indSituacaoEspecialDespacho(IndSituacaoEspecialDespachoEnum indSituacaoEspecialDespacho) {
    this.indSituacaoEspecialDespacho = indSituacaoEspecialDespacho;
    return this;
  }

 /**
   * Get motivoSituacaoEspecial
   * @return motivoSituacaoEspecial
  **/
  @JsonProperty("motivoSituacaoEspecial")
  public MotivoDaSituaoEspecialDeDespacho getMotivoSituacaoEspecial() {
    return motivoSituacaoEspecial;
  }

  public void setMotivoSituacaoEspecial(MotivoDaSituaoEspecialDeDespacho motivoSituacaoEspecial) {
    this.motivoSituacaoEspecial = motivoSituacaoEspecial;
  }

  public InformaesRelacionadasSituaoEspecialDeDespacho motivoSituacaoEspecial(MotivoDaSituaoEspecialDeDespacho motivoSituacaoEspecial) {
    this.motivoSituacaoEspecial = motivoSituacaoEspecial;
    return this;
  }

 /**
   * Valor do total do frete em Real para situação especial de despacho. (Valor calculado pelo sistema)&lt;br&gt;Tamanho: 17,2&lt;br&gt;Formato: Decimal, com até 2 casas decimais separadas por ponto.&lt;br&gt;Observação:&lt;br&gt;Apenas quando o indicador de situação especial de despacho for &#x3D; &#39;S&#39;
   * @return valorTotalFreteReal
  **/
  @JsonProperty("valorTotalFreteReal")
  public BigDecimal getValorTotalFreteReal() {
    return valorTotalFreteReal;
  }

  public void setValorTotalFreteReal(BigDecimal valorTotalFreteReal) {
    this.valorTotalFreteReal = valorTotalFreteReal;
  }

  public InformaesRelacionadasSituaoEspecialDeDespacho valorTotalFreteReal(BigDecimal valorTotalFreteReal) {
    this.valorTotalFreteReal = valorTotalFreteReal;
    return this;
  }

 /**
   * Valor do seguro em R$ (Reais)&lt;br&gt;Tamanho: 16,7&lt;br&gt;Formato: Decimal, com até 7 casas decimais separadas por ponto.&lt;br&gt;Observação:&lt;br&gt;Apenas quando o indicador de situação especial de despacho for &#x3D; &#39;S&#39;
   * @return valorSeguroEmReal
  **/
  @JsonProperty("valorSeguroEmReal")
  public BigDecimal getValorSeguroEmReal() {
    return valorSeguroEmReal;
  }

  public void setValorSeguroEmReal(BigDecimal valorSeguroEmReal) {
    this.valorSeguroEmReal = valorSeguroEmReal;
  }

  public InformaesRelacionadasSituaoEspecialDeDespacho valorSeguroEmReal(BigDecimal valorSeguroEmReal) {
    this.valorSeguroEmReal = valorSeguroEmReal;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InformaesRelacionadasSituaoEspecialDeDespacho {\n");
    
    sb.append("    indSituacaoEspecialDespacho: ").append(toIndentedString(indSituacaoEspecialDespacho)).append("\n");
    sb.append("    motivoSituacaoEspecial: ").append(toIndentedString(motivoSituacaoEspecial)).append("\n");
    sb.append("    valorTotalFreteReal: ").append(toIndentedString(valorTotalFreteReal)).append("\n");
    sb.append("    valorSeguroEmReal: ").append(toIndentedString(valorSeguroEmReal)).append("\n");
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

