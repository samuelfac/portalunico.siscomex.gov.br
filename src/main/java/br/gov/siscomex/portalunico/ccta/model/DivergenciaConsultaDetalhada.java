package br.gov.siscomex.portalunico.ccta.model;

import com.fasterxml.jackson.annotation.JsonProperty;
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
 @XmlType(name = "DivergenciaConsultaDetalhada", propOrder =
    { "dataDivergencia", "momentoDivergencia", "percentualDiferencaPeso", "percentualDiferencaVolumes", "pesoConhecimento", "pesoDivergente", "pesoManifestoVoo", "quantidadeVolumesConhecimento", "quantidadeVolumesDivergentes", "quantidadeVolumesManifestoVoo", "tipoDivergencia", "totalParcial"
})

@XmlRootElement(name="DivergenciaConsultaDetalhada")
public class DivergenciaConsultaDetalhada  {
  
  @XmlElement(name="dataDivergencia")
  @ApiModelProperty(example = "2020-04-08T11:00:00-03:00", value = "Data na qual a divergência foi criada.<br/> Formato: yyyy-MM-dd'T'HH:mm:ssZ ")
 /**
   * Data na qual a divergência foi criada.<br/> Formato: yyyy-MM-dd'T'HH:mm:ssZ 
  **/
  private String dataDivergencia = null;


@XmlType(name="MomentoDivergenciaEnum")
@XmlEnum(String.class)
public enum MomentoDivergenciaEnum {

	@XmlEnumValue("Viagem")
	@JsonProperty("Viagem")
	VIAGEM(String.valueOf("Viagem")),
	
	@XmlEnumValue("Recepção da Carga")
	@JsonProperty("Recepção da Carga")
	RECEP_O_DA_CARGA(String.valueOf("Recepção da Carga")),
	
	@XmlEnumValue("Entrega da Carga")
	@JsonProperty("Entrega da Carga")
	ENTREGA_DA_CARGA(String.valueOf("Entrega da Carga")),
	
	@XmlEnumValue("Retificação da Carga")
	@JsonProperty("Retificação da Carga")
	RETIFICA_O_DA_CARGA(String.valueOf("Retificação da Carga"));


    private String value;

    MomentoDivergenciaEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static MomentoDivergenciaEnum fromValue(String v) {
        for (MomentoDivergenciaEnum b : MomentoDivergenciaEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to MomentoDivergenciaEnum");
    }
}

  @XmlElement(name="momentoDivergencia")
  @ApiModelProperty(example = "Viagem", value = "Descrição do evento motivador da divergência<br/> ")
 /**
   * Descrição do evento motivador da divergência<br/> 
  **/
  private MomentoDivergenciaEnum momentoDivergencia = null;

  @XmlElement(name="percentualDiferencaPeso")
  @ApiModelProperty(example = "50.0", value = "Percentual de peso bruto (KG) divergente<br/>Tamanho: 2,2<br/> Formato: Decimal, com até 2 casas decimais separadas por ponto.")
  @Valid
 /**
   * Percentual de peso bruto (KG) divergente<br/>Tamanho: 2,2<br/> Formato: Decimal, com até 2 casas decimais separadas por ponto.
  **/
  private BigDecimal percentualDiferencaPeso = null;

  @XmlElement(name="percentualDiferencaVolumes")
  @ApiModelProperty(example = "50.0", value = "Percentual de quantidade de volumes divergentes<br/>Tamanho: 2,2<br/> Formato: Decimal, com até 2 casas decimais separadas por ponto.")
  @Valid
 /**
   * Percentual de quantidade de volumes divergentes<br/>Tamanho: 2,2<br/> Formato: Decimal, com até 2 casas decimais separadas por ponto.
  **/
  private BigDecimal percentualDiferencaVolumes = null;

  @XmlElement(name="pesoConhecimento")
  @ApiModelProperty(example = "105.478", value = "Peso em Kg<br/>Tamanho: 7,3<br/>Formato: Decimal, com até 3 casas decimais separadas por ponto.")
  @Valid
 /**
   * Peso em Kg<br/>Tamanho: 7,3<br/>Formato: Decimal, com até 3 casas decimais separadas por ponto.
  **/
  private BigDecimal pesoConhecimento = null;

  @XmlElement(name="pesoDivergente")
  @ApiModelProperty(example = "105.478", value = "Peso bruto (kg) divergente<br/>Tamanho: 10,3<br/> Formato: Decimal, com até 3 casas decimais separadas por ponto.")
  @Valid
 /**
   * Peso bruto (kg) divergente<br/>Tamanho: 10,3<br/> Formato: Decimal, com até 3 casas decimais separadas por ponto.
  **/
  private BigDecimal pesoDivergente = null;

  @XmlElement(name="pesoManifestoVoo")
  @ApiModelProperty(example = "105.478", value = "Peso em Kg<br/>Tamanho: 7,3<br/>Formato: Decimal, com até 3 casas decimais separadas por ponto.")
  @Valid
 /**
   * Peso em Kg<br/>Tamanho: 7,3<br/>Formato: Decimal, com até 3 casas decimais separadas por ponto.
  **/
  private BigDecimal pesoManifestoVoo = null;

  @XmlElement(name="quantidadeVolumesConhecimento")
  @ApiModelProperty(example = "5", value = "Quantidade de volumes<br/>Tamanho: 4<br/>Formato: Inteiro, com até 4 digitos")
 /**
   * Quantidade de volumes<br/>Tamanho: 4<br/>Formato: Inteiro, com até 4 digitos
  **/
  private Integer quantidadeVolumesConhecimento = null;

  @XmlElement(name="quantidadeVolumesDivergentes")
  @ApiModelProperty(example = "5", value = "Quantidade de volumes divergentes<br/>Tamanho: 4<br/>Formato: Inteiro, com até 4 digitos")
 /**
   * Quantidade de volumes divergentes<br/>Tamanho: 4<br/>Formato: Inteiro, com até 4 digitos
  **/
  private Integer quantidadeVolumesDivergentes = null;

  @XmlElement(name="quantidadeVolumesManifestoVoo")
  @ApiModelProperty(example = "5", value = "Quantidade de volumes<br/>Tamanho: 4<br/>Formato: Inteiro, com até 4 digitos")
 /**
   * Quantidade de volumes<br/>Tamanho: 4<br/>Formato: Inteiro, com até 4 digitos
  **/
  private Integer quantidadeVolumesManifestoVoo = null;


@XmlType(name="TipoDivergenciaEnum")
@XmlEnum(String.class)
public enum TipoDivergenciaEnum {

	@XmlEnumValue("Divergência de Peso")
	@JsonProperty("Divergência de Peso")
	PESO(String.valueOf("Divergência de Peso")),
	
	@XmlEnumValue("Divergência de Volumes")
	@JsonProperty("Divergência de Volumes")
	VOLUMES(String.valueOf("Divergência de Volumes"));


    private String value;

    TipoDivergenciaEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TipoDivergenciaEnum fromValue(String v) {
        for (TipoDivergenciaEnum b : TipoDivergenciaEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to TipoDivergenciaEnum");
    }
}

  @XmlElement(name="tipoDivergencia")
  @ApiModelProperty(example = "Divergência de Peso", value = "Descrição do tipo da divergência<br/> ")
 /**
   * Descrição do tipo da divergência<br/> 
  **/
  private TipoDivergenciaEnum tipoDivergencia = null;


@XmlType(name="TotalParcialEnum")
@XmlEnum(String.class)
public enum TotalParcialEnum {

	@XmlEnumValue("D")
	@JsonProperty("D")
	D(String.valueOf("D")),
	
	@XmlEnumValue("M")
	@JsonProperty("M")
	M(String.valueOf("M")),
	
	@XmlEnumValue("P")
	@JsonProperty("P")
	P(String.valueOf("P")),
	
	@XmlEnumValue("S")
	@JsonProperty("S")
	S(String.valueOf("S")),
	
	@XmlEnumValue("T")
	@JsonProperty("T")
	T(String.valueOf("T"));


    private String value;

    TotalParcialEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TotalParcialEnum fromValue(String v) {
        for (TotalParcialEnum b : TotalParcialEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to TotalParcialEnum");
    }
}

  @XmlElement(name="totalParcial")
  @ApiModelProperty(example = "P", value = "Indicador de parcialidade de carga<br/>Tamanho: 1<br/>T - Remessa total<br/>P - Remessa de peça<br/>S - Remessa dividida em único voo<br/>D - Remessa dividida em vários voos<br/>M - Múltiplas remessas")
 /**
   * Indicador de parcialidade de carga<br/>Tamanho: 1<br/>T - Remessa total<br/>P - Remessa de peça<br/>S - Remessa dividida em único voo<br/>D - Remessa dividida em vários voos<br/>M - Múltiplas remessas
  **/
  private TotalParcialEnum totalParcial = null;
 /**
   * Data na qual a divergência foi criada.&lt;br/&gt; Formato: yyyy-MM-dd&#39;T&#39;HH:mm:ssZ 
   * @return dataDivergencia
  **/
  @JsonProperty("dataDivergencia")
  public String getDataDivergencia() {
    return dataDivergencia;
  }

  public void setDataDivergencia(String dataDivergencia) {
    this.dataDivergencia = dataDivergencia;
  }

  public DivergenciaConsultaDetalhada dataDivergencia(String dataDivergencia) {
    this.dataDivergencia = dataDivergencia;
    return this;
  }

 /**
   * Descrição do evento motivador da divergência&lt;br/&gt; 
   * @return momentoDivergencia
  **/
  @JsonProperty("momentoDivergencia")
  public String getMomentoDivergencia() {
    if (momentoDivergencia == null) {
      return null;
    }
    return momentoDivergencia.value();
  }

  public void setMomentoDivergencia(MomentoDivergenciaEnum momentoDivergencia) {
    this.momentoDivergencia = momentoDivergencia;
  }

  public DivergenciaConsultaDetalhada momentoDivergencia(MomentoDivergenciaEnum momentoDivergencia) {
    this.momentoDivergencia = momentoDivergencia;
    return this;
  }

 /**
   * Percentual de peso bruto (KG) divergente&lt;br/&gt;Tamanho: 2,2&lt;br/&gt; Formato: Decimal, com até 2 casas decimais separadas por ponto.
   * @return percentualDiferencaPeso
  **/
  @JsonProperty("percentualDiferencaPeso")
  public BigDecimal getPercentualDiferencaPeso() {
    return percentualDiferencaPeso;
  }

  public void setPercentualDiferencaPeso(BigDecimal percentualDiferencaPeso) {
    this.percentualDiferencaPeso = percentualDiferencaPeso;
  }

  public DivergenciaConsultaDetalhada percentualDiferencaPeso(BigDecimal percentualDiferencaPeso) {
    this.percentualDiferencaPeso = percentualDiferencaPeso;
    return this;
  }

 /**
   * Percentual de quantidade de volumes divergentes&lt;br/&gt;Tamanho: 2,2&lt;br/&gt; Formato: Decimal, com até 2 casas decimais separadas por ponto.
   * @return percentualDiferencaVolumes
  **/
  @JsonProperty("percentualDiferencaVolumes")
  public BigDecimal getPercentualDiferencaVolumes() {
    return percentualDiferencaVolumes;
  }

  public void setPercentualDiferencaVolumes(BigDecimal percentualDiferencaVolumes) {
    this.percentualDiferencaVolumes = percentualDiferencaVolumes;
  }

  public DivergenciaConsultaDetalhada percentualDiferencaVolumes(BigDecimal percentualDiferencaVolumes) {
    this.percentualDiferencaVolumes = percentualDiferencaVolumes;
    return this;
  }

 /**
   * Peso em Kg&lt;br/&gt;Tamanho: 7,3&lt;br/&gt;Formato: Decimal, com até 3 casas decimais separadas por ponto.
   * @return pesoConhecimento
  **/
  @JsonProperty("pesoConhecimento")
  public BigDecimal getPesoConhecimento() {
    return pesoConhecimento;
  }

  public void setPesoConhecimento(BigDecimal pesoConhecimento) {
    this.pesoConhecimento = pesoConhecimento;
  }

  public DivergenciaConsultaDetalhada pesoConhecimento(BigDecimal pesoConhecimento) {
    this.pesoConhecimento = pesoConhecimento;
    return this;
  }

 /**
   * Peso bruto (kg) divergente&lt;br/&gt;Tamanho: 10,3&lt;br/&gt; Formato: Decimal, com até 3 casas decimais separadas por ponto.
   * @return pesoDivergente
  **/
  @JsonProperty("pesoDivergente")
  public BigDecimal getPesoDivergente() {
    return pesoDivergente;
  }

  public void setPesoDivergente(BigDecimal pesoDivergente) {
    this.pesoDivergente = pesoDivergente;
  }

  public DivergenciaConsultaDetalhada pesoDivergente(BigDecimal pesoDivergente) {
    this.pesoDivergente = pesoDivergente;
    return this;
  }

 /**
   * Peso em Kg&lt;br/&gt;Tamanho: 7,3&lt;br/&gt;Formato: Decimal, com até 3 casas decimais separadas por ponto.
   * @return pesoManifestoVoo
  **/
  @JsonProperty("pesoManifestoVoo")
  public BigDecimal getPesoManifestoVoo() {
    return pesoManifestoVoo;
  }

  public void setPesoManifestoVoo(BigDecimal pesoManifestoVoo) {
    this.pesoManifestoVoo = pesoManifestoVoo;
  }

  public DivergenciaConsultaDetalhada pesoManifestoVoo(BigDecimal pesoManifestoVoo) {
    this.pesoManifestoVoo = pesoManifestoVoo;
    return this;
  }

 /**
   * Quantidade de volumes&lt;br/&gt;Tamanho: 4&lt;br/&gt;Formato: Inteiro, com até 4 digitos
   * @return quantidadeVolumesConhecimento
  **/
  @JsonProperty("quantidadeVolumesConhecimento")
  public Integer getQuantidadeVolumesConhecimento() {
    return quantidadeVolumesConhecimento;
  }

  public void setQuantidadeVolumesConhecimento(Integer quantidadeVolumesConhecimento) {
    this.quantidadeVolumesConhecimento = quantidadeVolumesConhecimento;
  }

  public DivergenciaConsultaDetalhada quantidadeVolumesConhecimento(Integer quantidadeVolumesConhecimento) {
    this.quantidadeVolumesConhecimento = quantidadeVolumesConhecimento;
    return this;
  }

 /**
   * Quantidade de volumes divergentes&lt;br/&gt;Tamanho: 4&lt;br/&gt;Formato: Inteiro, com até 4 digitos
   * @return quantidadeVolumesDivergentes
  **/
  @JsonProperty("quantidadeVolumesDivergentes")
  public Integer getQuantidadeVolumesDivergentes() {
    return quantidadeVolumesDivergentes;
  }

  public void setQuantidadeVolumesDivergentes(Integer quantidadeVolumesDivergentes) {
    this.quantidadeVolumesDivergentes = quantidadeVolumesDivergentes;
  }

  public DivergenciaConsultaDetalhada quantidadeVolumesDivergentes(Integer quantidadeVolumesDivergentes) {
    this.quantidadeVolumesDivergentes = quantidadeVolumesDivergentes;
    return this;
  }

 /**
   * Quantidade de volumes&lt;br/&gt;Tamanho: 4&lt;br/&gt;Formato: Inteiro, com até 4 digitos
   * @return quantidadeVolumesManifestoVoo
  **/
  @JsonProperty("quantidadeVolumesManifestoVoo")
  public Integer getQuantidadeVolumesManifestoVoo() {
    return quantidadeVolumesManifestoVoo;
  }

  public void setQuantidadeVolumesManifestoVoo(Integer quantidadeVolumesManifestoVoo) {
    this.quantidadeVolumesManifestoVoo = quantidadeVolumesManifestoVoo;
  }

  public DivergenciaConsultaDetalhada quantidadeVolumesManifestoVoo(Integer quantidadeVolumesManifestoVoo) {
    this.quantidadeVolumesManifestoVoo = quantidadeVolumesManifestoVoo;
    return this;
  }

 /**
   * Descrição do tipo da divergência&lt;br/&gt; 
   * @return tipoDivergencia
  **/
  @JsonProperty("tipoDivergencia")
  public String getTipoDivergencia() {
    if (tipoDivergencia == null) {
      return null;
    }
    return tipoDivergencia.value();
  }

  public void setTipoDivergencia(TipoDivergenciaEnum tipoDivergencia) {
    this.tipoDivergencia = tipoDivergencia;
  }

  public DivergenciaConsultaDetalhada tipoDivergencia(TipoDivergenciaEnum tipoDivergencia) {
    this.tipoDivergencia = tipoDivergencia;
    return this;
  }

 /**
   * Indicador de parcialidade de carga&lt;br/&gt;Tamanho: 1&lt;br/&gt;T - Remessa total&lt;br/&gt;P - Remessa de peça&lt;br/&gt;S - Remessa dividida em único voo&lt;br/&gt;D - Remessa dividida em vários voos&lt;br/&gt;M - Múltiplas remessas
   * @return totalParcial
  **/
  @JsonProperty("totalParcial")
  public String getTotalParcial() {
    if (totalParcial == null) {
      return null;
    }
    return totalParcial.value();
  }

  public void setTotalParcial(TotalParcialEnum totalParcial) {
    this.totalParcial = totalParcial;
  }

  public DivergenciaConsultaDetalhada totalParcial(TotalParcialEnum totalParcial) {
    this.totalParcial = totalParcial;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DivergenciaConsultaDetalhada {\n");
    
    sb.append("    dataDivergencia: ").append(toIndentedString(dataDivergencia)).append("\n");
    sb.append("    momentoDivergencia: ").append(toIndentedString(momentoDivergencia)).append("\n");
    sb.append("    percentualDiferencaPeso: ").append(toIndentedString(percentualDiferencaPeso)).append("\n");
    sb.append("    percentualDiferencaVolumes: ").append(toIndentedString(percentualDiferencaVolumes)).append("\n");
    sb.append("    pesoConhecimento: ").append(toIndentedString(pesoConhecimento)).append("\n");
    sb.append("    pesoDivergente: ").append(toIndentedString(pesoDivergente)).append("\n");
    sb.append("    pesoManifestoVoo: ").append(toIndentedString(pesoManifestoVoo)).append("\n");
    sb.append("    quantidadeVolumesConhecimento: ").append(toIndentedString(quantidadeVolumesConhecimento)).append("\n");
    sb.append("    quantidadeVolumesDivergentes: ").append(toIndentedString(quantidadeVolumesDivergentes)).append("\n");
    sb.append("    quantidadeVolumesManifestoVoo: ").append(toIndentedString(quantidadeVolumesManifestoVoo)).append("\n");
    sb.append("    tipoDivergencia: ").append(toIndentedString(tipoDivergencia)).append("\n");
    sb.append("    totalParcial: ").append(toIndentedString(totalParcial)).append("\n");
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

