package br.gov.siscomex.portalunico.duimp_api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "CaracterizacaoImportacaoConsultaItemCover", propOrder =
    { "indicador", "ni"
})

@XmlRootElement(name="CaracterizacaoImportacaoConsultaItemCover")
/**
  * Caracterização da Importação.
 **/
@ApiModel(description="Caracterização da Importação.")
public class CaracterizacaoImportacaoConsultaItemCover  {
  

@XmlType(name="IndicadorEnum")
@XmlEnum(String.class)
public enum IndicadorEnum {

	@XmlEnumValue("IMPORTACAO_DIRETA")
	@JsonProperty("IMPORTACAO_DIRETA")
	DIRETA(String.valueOf("IMPORTACAO_DIRETA")),
	
	@XmlEnumValue("IMPORTACAO_POR_CONTA_E_ORDEM")
	@JsonProperty("IMPORTACAO_POR_CONTA_E_ORDEM")
	POR_CONTA_E_ORDEM(String.valueOf("IMPORTACAO_POR_CONTA_E_ORDEM"));


    private String value;

    IndicadorEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static IndicadorEnum fromValue(String v) {
        for (IndicadorEnum b : IndicadorEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to IndicadorEnum");
    }
}

  @XmlElement(name="indicador", required = true)
  @ApiModelProperty(example = "IMPORTACAO_DIRETA", required = true, value = "Indicador de importação por terceiros.")
 /**
   * Indicador de importação por terceiros.
  **/
  private IndicadorEnum indicador = null;

  @XmlElement(name="ni")
  @ApiModelProperty(example = "00000000000191", value = "CNPJ do adquirente.<br>Tamanho: 14<br>Formato: 'NNNNNNNNNNNNNN'<br>Observação: Este atributo é informado apenas quando selecionada a opção 'IMPORTACAO_POR_CONTA_E_ORDEM'")
 /**
   * CNPJ do adquirente.<br>Tamanho: 14<br>Formato: 'NNNNNNNNNNNNNN'<br>Observação: Este atributo é informado apenas quando selecionada a opção 'IMPORTACAO_POR_CONTA_E_ORDEM'
  **/
  private String ni = null;
 /**
   * Indicador de importação por terceiros.
   * @return indicador
  **/
  @JsonProperty("indicador")
  @NotNull
  public String getIndicador() {
    if (indicador == null) {
      return null;
    }
    return indicador.value();
  }

  public void setIndicador(IndicadorEnum indicador) {
    this.indicador = indicador;
  }

  public CaracterizacaoImportacaoConsultaItemCover indicador(IndicadorEnum indicador) {
    this.indicador = indicador;
    return this;
  }

 /**
   * CNPJ do adquirente.&lt;br&gt;Tamanho: 14&lt;br&gt;Formato: &#39;NNNNNNNNNNNNNN&#39;&lt;br&gt;Observação: Este atributo é informado apenas quando selecionada a opção &#39;IMPORTACAO_POR_CONTA_E_ORDEM&#39;
   * @return ni
  **/
  @JsonProperty("ni")
  public String getNi() {
    return ni;
  }

  public void setNi(String ni) {
    this.ni = ni;
  }

  public CaracterizacaoImportacaoConsultaItemCover ni(String ni) {
    this.ni = ni;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CaracterizacaoImportacaoConsultaItemCover {\n");
    
    sb.append("    indicador: ").append(toIndentedString(indicador)).append("\n");
    sb.append("    ni: ").append(toIndentedString(ni)).append("\n");
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

