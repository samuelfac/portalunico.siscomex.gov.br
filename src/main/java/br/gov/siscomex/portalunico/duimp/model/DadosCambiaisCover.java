package br.gov.siscomex.portalunico.duimp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "DadosCambiaisCover", propOrder =
    { "coberturaCambial", "instituicaoFinanceira", "valorCoberturaCambial", "numeroROFBacen", "motivoSemCobertura"
})

@XmlRootElement(name="DadosCambiaisCover")
/**
  * Dados cambiais
 **/
@ApiModel(description="Dados cambiais")
public class DadosCambiaisCover  {
  

@XmlType(name="CoberturaCambialEnum")
@XmlEnum(Integer.class)
public enum CoberturaCambialEnum {

	@XmlEnumValue("1")
	@JsonProperty("1")
	NUMBER_1(Integer.valueOf(1)),
	
	@XmlEnumValue("2")
	@JsonProperty("2")
	NUMBER_2(Integer.valueOf(2)),
	
	@XmlEnumValue("3")
	@JsonProperty("3")
	NUMBER_3(Integer.valueOf(3)),
	
	@XmlEnumValue("4")
	@JsonProperty("4")
	NUMBER_4(Integer.valueOf(4));


    private Integer value;

    CoberturaCambialEnum (Integer v) {
        value = v;
    }

    public Integer value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static CoberturaCambialEnum fromValue(String v) {
        for (CoberturaCambialEnum b : CoberturaCambialEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to CoberturaCambialEnum");
    }
}

  @XmlElement(name="coberturaCambial")
  @ApiModelProperty(example = "1", value = "Cobertura cambial. <br>Dominio:<br>1 - Até 180 dias,<br>2 - De 181 até 360 dias,<br>3 - Acima de 360 dias,<br>4 - Sem cobertura<br>Tamanho: 1")
 /**
   * Cobertura cambial. <br>Dominio:<br>1 - Até 180 dias,<br>2 - De 181 até 360 dias,<br>3 - Acima de 360 dias,<br>4 - Sem cobertura<br>Tamanho: 1
  **/
  private CoberturaCambialEnum coberturaCambial = null;

  @XmlElement(name="instituicaoFinanceira")
  @ApiModelProperty(value = "Código da instituição financiadora.<br>Valor mínimo: 1<br>Valor máximo: 99")
 /**
   * Código da instituição financiadora.<br>Valor mínimo: 1<br>Valor máximo: 99
  **/
  private Integer instituicaoFinanceira = null;

  @XmlElement(name="valorCoberturaCambial")
  @ApiModelProperty(example = "100.12", value = "Valor da cobertura cambial.<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.")
  @Valid
 /**
   * Valor da cobertura cambial.<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.
  **/
  private BigDecimal valorCoberturaCambial = null;

  @XmlElement(name="numeroROFBacen")
  @ApiModelProperty(example = "180A0A0A", value = "Número do ROF no BACEN<br>Tamanho mínimo: 1<br>Tamanho máximo: 8")
 /**
   * Número do ROF no BACEN<br>Tamanho mínimo: 1<br>Tamanho máximo: 8
  **/
  private String numeroROFBacen = null;

  @XmlElement(name="motivoSemCobertura")
  @ApiModelProperty(value = "")
  @Valid
  private MotivoParaAusnciaDeCoberturaCambialObjetoCompostoPelosAtributosCdigoEDescrio motivoSemCobertura = null;
 /**
   * Cobertura cambial. &lt;br&gt;Dominio:&lt;br&gt;1 - Até 180 dias,&lt;br&gt;2 - De 181 até 360 dias,&lt;br&gt;3 - Acima de 360 dias,&lt;br&gt;4 - Sem cobertura&lt;br&gt;Tamanho: 1
   * @return coberturaCambial
  **/
  @JsonProperty("coberturaCambial")
  public Integer getCoberturaCambial() {
    if (coberturaCambial == null) {
      return null;
    }
    return coberturaCambial.value();
  }

  public void setCoberturaCambial(CoberturaCambialEnum coberturaCambial) {
    this.coberturaCambial = coberturaCambial;
  }

  public DadosCambiaisCover coberturaCambial(CoberturaCambialEnum coberturaCambial) {
    this.coberturaCambial = coberturaCambial;
    return this;
  }

 /**
   * Código da instituição financiadora.&lt;br&gt;Valor mínimo: 1&lt;br&gt;Valor máximo: 99
   * @return instituicaoFinanceira
  **/
  @JsonProperty("instituicaoFinanceira")
  public Integer getInstituicaoFinanceira() {
    return instituicaoFinanceira;
  }

  public void setInstituicaoFinanceira(Integer instituicaoFinanceira) {
    this.instituicaoFinanceira = instituicaoFinanceira;
  }

  public DadosCambiaisCover instituicaoFinanceira(Integer instituicaoFinanceira) {
    this.instituicaoFinanceira = instituicaoFinanceira;
    return this;
  }

 /**
   * Valor da cobertura cambial.&lt;br&gt;Tamanho: 16,7&lt;br&gt;Formato: Decimal, com até 7 casas decimais separadas por ponto.
   * @return valorCoberturaCambial
  **/
  @JsonProperty("valorCoberturaCambial")
  public BigDecimal getValorCoberturaCambial() {
    return valorCoberturaCambial;
  }

  public void setValorCoberturaCambial(BigDecimal valorCoberturaCambial) {
    this.valorCoberturaCambial = valorCoberturaCambial;
  }

  public DadosCambiaisCover valorCoberturaCambial(BigDecimal valorCoberturaCambial) {
    this.valorCoberturaCambial = valorCoberturaCambial;
    return this;
  }

 /**
   * Número do ROF no BACEN&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 8
   * @return numeroROFBacen
  **/
  @JsonProperty("numeroROFBacen")
  public String getNumeroROFBacen() {
    return numeroROFBacen;
  }

  public void setNumeroROFBacen(String numeroROFBacen) {
    this.numeroROFBacen = numeroROFBacen;
  }

  public DadosCambiaisCover numeroROFBacen(String numeroROFBacen) {
    this.numeroROFBacen = numeroROFBacen;
    return this;
  }

 /**
   * Get motivoSemCobertura
   * @return motivoSemCobertura
  **/
  @JsonProperty("motivoSemCobertura")
  public MotivoParaAusnciaDeCoberturaCambialObjetoCompostoPelosAtributosCdigoEDescrio getMotivoSemCobertura() {
    return motivoSemCobertura;
  }

  public void setMotivoSemCobertura(MotivoParaAusnciaDeCoberturaCambialObjetoCompostoPelosAtributosCdigoEDescrio motivoSemCobertura) {
    this.motivoSemCobertura = motivoSemCobertura;
  }

  public DadosCambiaisCover motivoSemCobertura(MotivoParaAusnciaDeCoberturaCambialObjetoCompostoPelosAtributosCdigoEDescrio motivoSemCobertura) {
    this.motivoSemCobertura = motivoSemCobertura;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DadosCambiaisCover {\n");
    
    sb.append("    coberturaCambial: ").append(toIndentedString(coberturaCambial)).append("\n");
    sb.append("    instituicaoFinanceira: ").append(toIndentedString(instituicaoFinanceira)).append("\n");
    sb.append("    valorCoberturaCambial: ").append(toIndentedString(valorCoberturaCambial)).append("\n");
    sb.append("    numeroROFBacen: ").append(toIndentedString(numeroROFBacen)).append("\n");
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

