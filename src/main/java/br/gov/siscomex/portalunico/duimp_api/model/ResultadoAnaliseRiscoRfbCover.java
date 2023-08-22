package br.gov.siscomex.portalunico.duimp_api.model;

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
 @XmlType(name = "ResultadoAnaliseRiscoRfbCover", propOrder =
    { "orgao", "resultado"
})

@XmlRootElement(name="ResultadoAnaliseRiscoRfbCover")
public class ResultadoAnaliseRiscoRfbCover  {
  
  @XmlElement(name="orgao")
  @ApiModelProperty(example = "Receita", value = "Sigla do órgão da administração pública.<br>Tamanho mínimo: 1<br>Tamanho máximo: 30")
 /**
   * Sigla do órgão da administração pública.<br>Tamanho mínimo: 1<br>Tamanho máximo: 30
  **/
  private String orgao = null;


@XmlType(name="ResultadoEnum")
@XmlEnum(String.class)
public enum ResultadoEnum {

	@XmlEnumValue("DESEMBARACO_AUTORIZADO")
	@JsonProperty("DESEMBARACO_AUTORIZADO")
	DESEMBARACO_AUTORIZADO(String.valueOf("DESEMBARACO_AUTORIZADO")),
	
	@XmlEnumValue("DESEMBARACO_CONDICIONADO")
	@JsonProperty("DESEMBARACO_CONDICIONADO")
	DESEMBARACO_CONDICIONADO(String.valueOf("DESEMBARACO_CONDICIONADO")),
	
	@XmlEnumValue("EXAME_DOCUMENTAL")
	@JsonProperty("EXAME_DOCUMENTAL")
	EXAME_DOCUMENTAL(String.valueOf("EXAME_DOCUMENTAL")),
	
	@XmlEnumValue("EXAME_DOCUMENTAL_VERIFICACAO_FISICA")
	@JsonProperty("EXAME_DOCUMENTAL_VERIFICACAO_FISICA")
	EXAME_DOCUMENTAL_VERIFICACAO_FISICA(String.valueOf("EXAME_DOCUMENTAL_VERIFICACAO_FISICA")),
	
	@XmlEnumValue("EXAME_DOCUMENTAL_VERIFICACAO_FISICA_APURACAO_INDICIOS_FRAUDE")
	@JsonProperty("EXAME_DOCUMENTAL_VERIFICACAO_FISICA_APURACAO_INDICIOS_FRAUDE")
	EXAME_DOCUMENTAL_VERIFICACAO_FISICA_APURACAO_INDICIOS_FRAUDE(String.valueOf("EXAME_DOCUMENTAL_VERIFICACAO_FISICA_APURACAO_INDICIOS_FRAUDE"));


    private String value;

    ResultadoEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ResultadoEnum fromValue(String v) {
        for (ResultadoEnum b : ResultadoEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to ResultadoEnum");
    }
}

  @XmlElement(name="resultado")
  @ApiModelProperty(example = "DESEMBARACO_AUTORIZADO", value = "Resultados para análise de risco da conferência aduaneira.<br>Domínio:")
 /**
   * Resultados para análise de risco da conferência aduaneira.<br>Domínio:
  **/
  private ResultadoEnum resultado = null;
 /**
   * Sigla do órgão da administração pública.&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 30
   * @return orgao
  **/
  @JsonProperty("orgao")
  public String getOrgao() {
    return orgao;
  }

  public void setOrgao(String orgao) {
    this.orgao = orgao;
  }

  public ResultadoAnaliseRiscoRfbCover orgao(String orgao) {
    this.orgao = orgao;
    return this;
  }

 /**
   * Resultados para análise de risco da conferência aduaneira.&lt;br&gt;Domínio:
   * @return resultado
  **/
  @JsonProperty("resultado")
  public String getResultado() {
    if (resultado == null) {
      return null;
    }
    return resultado.value();
  }

  public void setResultado(ResultadoEnum resultado) {
    this.resultado = resultado;
  }

  public ResultadoAnaliseRiscoRfbCover resultado(ResultadoEnum resultado) {
    this.resultado = resultado;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResultadoAnaliseRiscoRfbCover {\n");
    
    sb.append("    orgao: ").append(toIndentedString(orgao)).append("\n");
    sb.append("    resultado: ").append(toIndentedString(resultado)).append("\n");
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

