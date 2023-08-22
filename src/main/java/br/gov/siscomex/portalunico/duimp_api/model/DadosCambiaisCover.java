package br.gov.siscomex.portalunico.duimp_api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "DadosCambiaisCover", propOrder =
    { "coberturaCambial", "numeroROF", "instituicaoFinanciadora", "valorCoberturaCambial", "motivoSemCobertura"
})

@XmlRootElement(name="DadosCambiaisCover")
/**
  * Dados cambiais.
 **/
@ApiModel(description="Dados cambiais.")
public class DadosCambiaisCover  {
  
  @XmlElement(name="coberturaCambial", required = true)
  @ApiModelProperty(required = true, value = "")
  @Valid
  private CoberturaCambialCover coberturaCambial = null;

  @XmlElement(name="numeroROF")
  @ApiModelProperty(example = "180A0A0A", value = "Número do ROF no BACEN.<br>Observação: Deve ser preenchido quando a cobertura cambial estiver acima de 360 dias ou quando o motivo selecionado no atributo \"motivoSemCobertura\" admitir a utilização do ROF.<br>Tamanho mínimo: 1<br>Tamanho máximo: 8")
 /**
   * Número do ROF no BACEN.<br>Observação: Deve ser preenchido quando a cobertura cambial estiver acima de 360 dias ou quando o motivo selecionado no atributo \"motivoSemCobertura\" admitir a utilização do ROF.<br>Tamanho mínimo: 1<br>Tamanho máximo: 8
  **/
  private String numeroROF = null;

  @XmlElement(name="instituicaoFinanciadora")
  @ApiModelProperty(value = "")
  @Valid
  private InstituicaoFinanciadoraCover instituicaoFinanciadora = null;

  @XmlElement(name="valorCoberturaCambial")
  @ApiModelProperty(example = "100.12", value = "Valor da cobertura cambial.<br>Tamanho: 13,2<br>Formato: Decimal, com até 2 casas decimais separadas por ponto.Observação: Deve ser preenchido quando a cobertura cambial estiver acima de 360 dias.")
 /**
   * Valor da cobertura cambial.<br>Tamanho: 13,2<br>Formato: Decimal, com até 2 casas decimais separadas por ponto.Observação: Deve ser preenchido quando a cobertura cambial estiver acima de 360 dias.
  **/
  private String valorCoberturaCambial = null;

  @XmlElement(name="motivoSemCobertura")
  @ApiModelProperty(value = "")
  @Valid
  private MotivoSemCoberturaCambialCover motivoSemCobertura = null;
 /**
   * Get coberturaCambial
   * @return coberturaCambial
  **/
  @JsonProperty("coberturaCambial")
  @NotNull
  public CoberturaCambialCover getCoberturaCambial() {
    return coberturaCambial;
  }

  public void setCoberturaCambial(CoberturaCambialCover coberturaCambial) {
    this.coberturaCambial = coberturaCambial;
  }

  public DadosCambiaisCover coberturaCambial(CoberturaCambialCover coberturaCambial) {
    this.coberturaCambial = coberturaCambial;
    return this;
  }

 /**
   * Número do ROF no BACEN.&lt;br&gt;Observação: Deve ser preenchido quando a cobertura cambial estiver acima de 360 dias ou quando o motivo selecionado no atributo \&quot;motivoSemCobertura\&quot; admitir a utilização do ROF.&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 8
   * @return numeroROF
  **/
  @JsonProperty("numeroROF")
  public String getNumeroROF() {
    return numeroROF;
  }

  public void setNumeroROF(String numeroROF) {
    this.numeroROF = numeroROF;
  }

  public DadosCambiaisCover numeroROF(String numeroROF) {
    this.numeroROF = numeroROF;
    return this;
  }

 /**
   * Get instituicaoFinanciadora
   * @return instituicaoFinanciadora
  **/
  @JsonProperty("instituicaoFinanciadora")
  public InstituicaoFinanciadoraCover getInstituicaoFinanciadora() {
    return instituicaoFinanciadora;
  }

  public void setInstituicaoFinanciadora(InstituicaoFinanciadoraCover instituicaoFinanciadora) {
    this.instituicaoFinanciadora = instituicaoFinanciadora;
  }

  public DadosCambiaisCover instituicaoFinanciadora(InstituicaoFinanciadoraCover instituicaoFinanciadora) {
    this.instituicaoFinanciadora = instituicaoFinanciadora;
    return this;
  }

 /**
   * Valor da cobertura cambial.&lt;br&gt;Tamanho: 13,2&lt;br&gt;Formato: Decimal, com até 2 casas decimais separadas por ponto.Observação: Deve ser preenchido quando a cobertura cambial estiver acima de 360 dias.
   * @return valorCoberturaCambial
  **/
  @JsonProperty("valorCoberturaCambial")
  public String getValorCoberturaCambial() {
    return valorCoberturaCambial;
  }

  public void setValorCoberturaCambial(String valorCoberturaCambial) {
    this.valorCoberturaCambial = valorCoberturaCambial;
  }

  public DadosCambiaisCover valorCoberturaCambial(String valorCoberturaCambial) {
    this.valorCoberturaCambial = valorCoberturaCambial;
    return this;
  }

 /**
   * Get motivoSemCobertura
   * @return motivoSemCobertura
  **/
  @JsonProperty("motivoSemCobertura")
  public MotivoSemCoberturaCambialCover getMotivoSemCobertura() {
    return motivoSemCobertura;
  }

  public void setMotivoSemCobertura(MotivoSemCoberturaCambialCover motivoSemCobertura) {
    this.motivoSemCobertura = motivoSemCobertura;
  }

  public DadosCambiaisCover motivoSemCobertura(MotivoSemCoberturaCambialCover motivoSemCobertura) {
    this.motivoSemCobertura = motivoSemCobertura;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DadosCambiaisCover {\n");
    
    sb.append("    coberturaCambial: ").append(toIndentedString(coberturaCambial)).append("\n");
    sb.append("    numeroROF: ").append(toIndentedString(numeroROF)).append("\n");
    sb.append("    instituicaoFinanciadora: ").append(toIndentedString(instituicaoFinanciadora)).append("\n");
    sb.append("    valorCoberturaCambial: ").append(toIndentedString(valorCoberturaCambial)).append("\n");
    sb.append("    motivoSemCobertura: ").append(toIndentedString(motivoSemCobertura)).append("\n");
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

