package br.gov.siscomex.portalunico.duimp_api.model;

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
 @XmlType(name = "ResultadoProcessamentoTACover", propOrder =
    { "dataProcessamento", "resultadoConsolidadoTA"
})

@XmlRootElement(name="ResultadoProcessamentoTACover")
/**
  * Resultados do tratamento administrativo.
 **/
@ApiModel(description="Resultados do tratamento administrativo.")
public class ResultadoProcessamentoTACover  {
  
  @XmlElement(name="dataProcessamento")
  @ApiModelProperty(example = "2021-05-25T15:53:18-0300", value = "Data do diagnóstico que gerou o resultado.<br>Formato: 'yyyy-MM-dd'T'HH:mm:ssZ'")
 /**
   * Data do diagnóstico que gerou o resultado.<br>Formato: 'yyyy-MM-dd'T'HH:mm:ssZ'
  **/
  private String dataProcessamento = null;


@XmlType(name="ResultadoConsolidadoTAEnum")
@XmlEnum(String.class)
public enum ResultadoConsolidadoTAEnum {

	@XmlEnumValue("DISPENSADO")
	@JsonProperty("DISPENSADO")
	DISPENSADO(String.valueOf("DISPENSADO")),
	
	@XmlEnumValue("DEFERIDO")
	@JsonProperty("DEFERIDO")
	DEFERIDO(String.valueOf("DEFERIDO")),
	
	@XmlEnumValue("ALERTA")
	@JsonProperty("ALERTA")
	ALERTA(String.valueOf("ALERTA")),
	
	@XmlEnumValue("PENDENTE")
	@JsonProperty("PENDENTE")
	PENDENTE(String.valueOf("PENDENTE")),
	
	@XmlEnumValue("IMPEDIDO")
	@JsonProperty("IMPEDIDO")
	IMPEDIDO(String.valueOf("IMPEDIDO"));


    private String value;

    ResultadoConsolidadoTAEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ResultadoConsolidadoTAEnum fromValue(String v) {
        for (ResultadoConsolidadoTAEnum b : ResultadoConsolidadoTAEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to ResultadoConsolidadoTAEnum");
    }
}

  @XmlElement(name="resultadoConsolidadoTA")
  @ApiModelProperty(example = "DEFERIDO", value = "Resultado, dos itens, consolidado dos tratamentos administrativos.<br>Domínio:")
 /**
   * Resultado, dos itens, consolidado dos tratamentos administrativos.<br>Domínio:
  **/
  private ResultadoConsolidadoTAEnum resultadoConsolidadoTA = null;
 /**
   * Data do diagnóstico que gerou o resultado.&lt;br&gt;Formato: &#39;yyyy-MM-dd&#39;T&#39;HH:mm:ssZ&#39;
   * @return dataProcessamento
  **/
  @JsonProperty("dataProcessamento")
  public String getDataProcessamento() {
    return dataProcessamento;
  }

  public void setDataProcessamento(String dataProcessamento) {
    this.dataProcessamento = dataProcessamento;
  }

  public ResultadoProcessamentoTACover dataProcessamento(String dataProcessamento) {
    this.dataProcessamento = dataProcessamento;
    return this;
  }

 /**
   * Resultado, dos itens, consolidado dos tratamentos administrativos.&lt;br&gt;Domínio:
   * @return resultadoConsolidadoTA
  **/
  @JsonProperty("resultadoConsolidadoTA")
  public String getResultadoConsolidadoTA() {
    if (resultadoConsolidadoTA == null) {
      return null;
    }
    return resultadoConsolidadoTA.value();
  }

  public void setResultadoConsolidadoTA(ResultadoConsolidadoTAEnum resultadoConsolidadoTA) {
    this.resultadoConsolidadoTA = resultadoConsolidadoTA;
  }

  public ResultadoProcessamentoTACover resultadoConsolidadoTA(ResultadoConsolidadoTAEnum resultadoConsolidadoTA) {
    this.resultadoConsolidadoTA = resultadoConsolidadoTA;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResultadoProcessamentoTACover {\n");
    
    sb.append("    dataProcessamento: ").append(toIndentedString(dataProcessamento)).append("\n");
    sb.append("    resultadoConsolidadoTA: ").append(toIndentedString(resultadoConsolidadoTA)).append("\n");
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

