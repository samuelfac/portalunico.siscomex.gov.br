package br.gov.siscomex.portalunico.duimp_api.model;

import java.util.List;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "ResultadoAnaliseRiscoDuimpCover", propOrder =
    { "canalConsolidado", "resultadoOrgao"
})

@XmlRootElement(name="ResultadoAnaliseRiscoDuimpCover")
/**
  * Resultado da análise de risco para uma Duimp.
 **/
@ApiModel(description="Resultado da análise de risco para uma Duimp.")
public class ResultadoAnaliseRiscoDuimpCover  {
  

@XmlType(name="CanalConsolidadoEnum")
@XmlEnum(String.class)
public enum CanalConsolidadoEnum {

	@XmlEnumValue("VERDE")
	@JsonProperty("VERDE")
	VERDE(String.valueOf("VERDE")),
	
	@XmlEnumValue("AMARELO")
	@JsonProperty("AMARELO")
	AMARELO(String.valueOf("AMARELO")),
	
	@XmlEnumValue("VERMELHO")
	@JsonProperty("VERMELHO")
	VERMELHO(String.valueOf("VERMELHO")),
	
	@XmlEnumValue("CINZA")
	@JsonProperty("CINZA")
	CINZA(String.valueOf("CINZA"));


    private String value;

    CanalConsolidadoEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static CanalConsolidadoEnum fromValue(String v) {
        for (CanalConsolidadoEnum b : CanalConsolidadoEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to CanalConsolidadoEnum");
    }
}

  @XmlElement(name="canalConsolidado")
  @ApiModelProperty(example = "VERDE", value = "Canais da análise de risco.<br>Domínio:")
 /**
   * Canais da análise de risco.<br>Domínio:
  **/
  private CanalConsolidadoEnum canalConsolidado = null;

  @XmlElement(name="resultadoOrgao")
  @ApiModelProperty(value = "")
  @Valid
  private List<ResultadoOrgaoDuimpCover> resultadoOrgao = null;
 /**
   * Canais da análise de risco.&lt;br&gt;Domínio:
   * @return canalConsolidado
  **/
  @JsonProperty("canalConsolidado")
  public String getCanalConsolidado() {
    if (canalConsolidado == null) {
      return null;
    }
    return canalConsolidado.value();
  }

  public void setCanalConsolidado(CanalConsolidadoEnum canalConsolidado) {
    this.canalConsolidado = canalConsolidado;
  }

  public ResultadoAnaliseRiscoDuimpCover canalConsolidado(CanalConsolidadoEnum canalConsolidado) {
    this.canalConsolidado = canalConsolidado;
    return this;
  }

 /**
   * Get resultadoOrgao
   * @return resultadoOrgao
  **/
  @JsonProperty("resultadoOrgao")
  public List<ResultadoOrgaoDuimpCover> getResultadoOrgao() {
    return resultadoOrgao;
  }

  public void setResultadoOrgao(List<ResultadoOrgaoDuimpCover> resultadoOrgao) {
    this.resultadoOrgao = resultadoOrgao;
  }

  public ResultadoAnaliseRiscoDuimpCover resultadoOrgao(List<ResultadoOrgaoDuimpCover> resultadoOrgao) {
    this.resultadoOrgao = resultadoOrgao;
    return this;
  }

  public ResultadoAnaliseRiscoDuimpCover addResultadoOrgaoItem(ResultadoOrgaoDuimpCover resultadoOrgaoItem) {
    this.resultadoOrgao.add(resultadoOrgaoItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResultadoAnaliseRiscoDuimpCover {\n");
    
    sb.append("    canalConsolidado: ").append(toIndentedString(canalConsolidado)).append("\n");
    sb.append("    resultadoOrgao: ").append(toIndentedString(resultadoOrgao)).append("\n");
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

