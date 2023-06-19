package br.gov.siscomex.portalunico.duimp_api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "CargaDuimpConsultaCover", propOrder =
    { "unidadeDeclarada", "identificacao", "seguro", "frete", "valorAFRMMDevido", "valorAFRMMPago", "indicadorAFRMMQuitado"
})

@XmlRootElement(name="CargaDuimpConsultaCover")
/**
  * Dados da carga.
 **/
@ApiModel(description="Dados da carga.")
public class CargaDuimpConsultaCover  {
  
  @XmlElement(name="unidadeDeclarada")
  @ApiModelProperty(value = "")
  @Valid
  private UnidadeDeclaradaCover unidadeDeclarada = null;

  @XmlElement(name="identificacao")
  @ApiModelProperty(example = "132105000002800", value = "Número de Identificação da Carga.<br>Tamanho: 15<br>Formato: NNNNNNNNNNNNNNN<br>Origem: Sistema Siscomex Carga - https://www4.receita.fazenda.gov.br/g33159/jsp/logon.jsp?ind=11")
 /**
   * Número de Identificação da Carga.<br>Tamanho: 15<br>Formato: NNNNNNNNNNNNNNN<br>Origem: Sistema Siscomex Carga - https://www4.receita.fazenda.gov.br/g33159/jsp/logon.jsp?ind=11
  **/
  private String identificacao = null;

  @XmlElement(name="seguro")
  @ApiModelProperty(value = "")
  @Valid
  private CargaDuimpSeguroConsultaCover seguro = null;

  @XmlElement(name="frete")
  @ApiModelProperty(value = "")
  @Valid
  private CargaDuimpFreteConsultaCover frete = null;

  @XmlElement(name="valorAFRMMDevido")
  @ApiModelProperty(example = "153.77", value = "Valor devido do AFRMM e da TUM em R$ (Reais).<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.")
 /**
   * Valor devido do AFRMM e da TUM em R$ (Reais).<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.
  **/
  private Double valorAFRMMDevido = null;

  @XmlElement(name="valorAFRMMPago")
  @ApiModelProperty(example = "153.77", value = "Valor pago do AFRMM e da TUM em R$ (Reais).<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.")
 /**
   * Valor pago do AFRMM e da TUM em R$ (Reais).<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.
  **/
  private Double valorAFRMMPago = null;


@XmlType(name="IndicadorAFRMMQuitadoEnum")
@XmlEnum(String.class)
public enum IndicadorAFRMMQuitadoEnum {

	@XmlEnumValue("SIM")
	@JsonProperty("SIM")
	SIM(String.valueOf("SIM")),
	
	@XmlEnumValue("NAO")
	@JsonProperty("NAO")
	NAO(String.valueOf("NAO")),
	
	@XmlEnumValue("NA")
	@JsonProperty("NA")
	NA(String.valueOf("NA"));


    private String value;

    IndicadorAFRMMQuitadoEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static IndicadorAFRMMQuitadoEnum fromValue(String v) {
        for (IndicadorAFRMMQuitadoEnum b : IndicadorAFRMMQuitadoEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to IndicadorAFRMMQuitadoEnum");
    }
}

  @XmlElement(name="indicadorAFRMMQuitado")
  @ApiModelProperty(example = "SIM", value = "Indicador de AFRMM e da TUM quitados.<br>Domínio:")
 /**
   * Indicador de AFRMM e da TUM quitados.<br>Domínio:
  **/
  private IndicadorAFRMMQuitadoEnum indicadorAFRMMQuitado = null;
 /**
   * Get unidadeDeclarada
   * @return unidadeDeclarada
  **/
  @JsonProperty("unidadeDeclarada")
  public UnidadeDeclaradaCover getUnidadeDeclarada() {
    return unidadeDeclarada;
  }

  public void setUnidadeDeclarada(UnidadeDeclaradaCover unidadeDeclarada) {
    this.unidadeDeclarada = unidadeDeclarada;
  }

  public CargaDuimpConsultaCover unidadeDeclarada(UnidadeDeclaradaCover unidadeDeclarada) {
    this.unidadeDeclarada = unidadeDeclarada;
    return this;
  }

 /**
   * Número de Identificação da Carga.&lt;br&gt;Tamanho: 15&lt;br&gt;Formato: NNNNNNNNNNNNNNN&lt;br&gt;Origem: Sistema Siscomex Carga - https://www4.receita.fazenda.gov.br/g33159/jsp/logon.jsp?ind&#x3D;11
   * @return identificacao
  **/
  @JsonProperty("identificacao")
  public String getIdentificacao() {
    return identificacao;
  }

  public void setIdentificacao(String identificacao) {
    this.identificacao = identificacao;
  }

  public CargaDuimpConsultaCover identificacao(String identificacao) {
    this.identificacao = identificacao;
    return this;
  }

 /**
   * Get seguro
   * @return seguro
  **/
  @JsonProperty("seguro")
  public CargaDuimpSeguroConsultaCover getSeguro() {
    return seguro;
  }

  public void setSeguro(CargaDuimpSeguroConsultaCover seguro) {
    this.seguro = seguro;
  }

  public CargaDuimpConsultaCover seguro(CargaDuimpSeguroConsultaCover seguro) {
    this.seguro = seguro;
    return this;
  }

 /**
   * Get frete
   * @return frete
  **/
  @JsonProperty("frete")
  public CargaDuimpFreteConsultaCover getFrete() {
    return frete;
  }

  public void setFrete(CargaDuimpFreteConsultaCover frete) {
    this.frete = frete;
  }

  public CargaDuimpConsultaCover frete(CargaDuimpFreteConsultaCover frete) {
    this.frete = frete;
    return this;
  }

 /**
   * Valor devido do AFRMM e da TUM em R$ (Reais).&lt;br&gt;Tamanho: 16,7&lt;br&gt;Formato: Decimal, com até 7 casas decimais separadas por ponto.
   * @return valorAFRMMDevido
  **/
  @JsonProperty("valorAFRMMDevido")
  public Double getValorAFRMMDevido() {
    return valorAFRMMDevido;
  }

  public void setValorAFRMMDevido(Double valorAFRMMDevido) {
    this.valorAFRMMDevido = valorAFRMMDevido;
  }

  public CargaDuimpConsultaCover valorAFRMMDevido(Double valorAFRMMDevido) {
    this.valorAFRMMDevido = valorAFRMMDevido;
    return this;
  }

 /**
   * Valor pago do AFRMM e da TUM em R$ (Reais).&lt;br&gt;Tamanho: 16,7&lt;br&gt;Formato: Decimal, com até 7 casas decimais separadas por ponto.
   * @return valorAFRMMPago
  **/
  @JsonProperty("valorAFRMMPago")
  public Double getValorAFRMMPago() {
    return valorAFRMMPago;
  }

  public void setValorAFRMMPago(Double valorAFRMMPago) {
    this.valorAFRMMPago = valorAFRMMPago;
  }

  public CargaDuimpConsultaCover valorAFRMMPago(Double valorAFRMMPago) {
    this.valorAFRMMPago = valorAFRMMPago;
    return this;
  }

 /**
   * Indicador de AFRMM e da TUM quitados.&lt;br&gt;Domínio:
   * @return indicadorAFRMMQuitado
  **/
  @JsonProperty("indicadorAFRMMQuitado")
  public String getIndicadorAFRMMQuitado() {
    if (indicadorAFRMMQuitado == null) {
      return null;
    }
    return indicadorAFRMMQuitado.value();
  }

  public void setIndicadorAFRMMQuitado(IndicadorAFRMMQuitadoEnum indicadorAFRMMQuitado) {
    this.indicadorAFRMMQuitado = indicadorAFRMMQuitado;
  }

  public CargaDuimpConsultaCover indicadorAFRMMQuitado(IndicadorAFRMMQuitadoEnum indicadorAFRMMQuitado) {
    this.indicadorAFRMMQuitado = indicadorAFRMMQuitado;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CargaDuimpConsultaCover {\n");
    
    sb.append("    unidadeDeclarada: ").append(toIndentedString(unidadeDeclarada)).append("\n");
    sb.append("    identificacao: ").append(toIndentedString(identificacao)).append("\n");
    sb.append("    seguro: ").append(toIndentedString(seguro)).append("\n");
    sb.append("    frete: ").append(toIndentedString(frete)).append("\n");
    sb.append("    valorAFRMMDevido: ").append(toIndentedString(valorAFRMMDevido)).append("\n");
    sb.append("    valorAFRMMPago: ").append(toIndentedString(valorAFRMMPago)).append("\n");
    sb.append("    indicadorAFRMMQuitado: ").append(toIndentedString(indicadorAFRMMQuitado)).append("\n");
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

