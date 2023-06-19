package br.gov.siscomex.portalunico.ccta.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "DocumentoSaidaConsultaDetalhada", propOrder =
    { "dataHoraVinculacao", "numero", "raDestinoDta", "tipo", "uaDestinoDta"
})

@XmlRootElement(name="DocumentoSaidaConsultaDetalhada")
public class DocumentoSaidaConsultaDetalhada  {
  
  @XmlElement(name="dataHoraVinculacao")
  @ApiModelProperty(example = "12/02/2021 21:21", value = "Data / Hora do registro<br/> ")
 /**
   * Data / Hora do registro<br/> 
  **/
  private String dataHoraVinculacao = null;

  @XmlElement(name="numero")
  @ApiModelProperty(example = "5490178901", value = "Número de documento de saída<br/>Tamanho mínimo: 1<br/>Tamanho máximo:17<br/> Formato: NNNNNNNNNNNNNNNNN")
 /**
   * Número de documento de saída<br/>Tamanho mínimo: 1<br/>Tamanho máximo:17<br/> Formato: NNNNNNNNNNNNNNNNN
  **/
  private String numero = null;

  @XmlElement(name="raDestinoDta")
  @ApiModelProperty(example = "7911101", value = "Recinto Aduaneiro de destino da DTA.")
 /**
   * Recinto Aduaneiro de destino da DTA.
  **/
  private String raDestinoDta = null;


@XmlType(name="TipoEnum")
@XmlEnum(String.class)
public enum TipoEnum {

	@XmlEnumValue("10")
	@JsonProperty("10")
	_10(String.valueOf("10")),
	
	@XmlEnumValue("11")
	@JsonProperty("11")
	_11(String.valueOf("11")),
	
	@XmlEnumValue("12")
	@JsonProperty("12")
	_12(String.valueOf("12")),
	
	@XmlEnumValue("20")
	@JsonProperty("20")
	_20(String.valueOf("20")),
	
	@XmlEnumValue("21")
	@JsonProperty("21")
	_21(String.valueOf("21")),
	
	@XmlEnumValue("22")
	@JsonProperty("22")
	_22(String.valueOf("22")),
	
	@XmlEnumValue("23")
	@JsonProperty("23")
	_23(String.valueOf("23")),
	
	@XmlEnumValue("24")
	@JsonProperty("24")
	_24(String.valueOf("24")),
	
	@XmlEnumValue("30")
	@JsonProperty("30")
	_30(String.valueOf("30")),
	
	@XmlEnumValue("21")
	@JsonProperty("21")
	_21_9(String.valueOf("21")),
	
	@XmlEnumValue("32")
	@JsonProperty("32")
	_32(String.valueOf("32")),
	
	@XmlEnumValue("33")
	@JsonProperty("33")
	_33(String.valueOf("33")),
	
	@XmlEnumValue("34")
	@JsonProperty("34")
	_34(String.valueOf("34")),
	
	@XmlEnumValue("35")
	@JsonProperty("35")
	_35(String.valueOf("35")),
	
	@XmlEnumValue("36")
	@JsonProperty("36")
	_36(String.valueOf("36")),
	
	@XmlEnumValue("37")
	@JsonProperty("37")
	_37(String.valueOf("37")),
	
	@XmlEnumValue("38")
	@JsonProperty("38")
	_38(String.valueOf("38")),
	
	@XmlEnumValue("39")
	@JsonProperty("39")
	_39(String.valueOf("39")),
	
	@XmlEnumValue("40")
	@JsonProperty("40")
	_40(String.valueOf("40")),
	
	@XmlEnumValue("50")
	@JsonProperty("50")
	_50(String.valueOf("50")),
	
	@XmlEnumValue("99")
	@JsonProperty("99")
	_99(String.valueOf("99"));


    private String value;

    TipoEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TipoEnum fromValue(String v) {
        for (TipoEnum b : TipoEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to TipoEnum");
    }
}

  @XmlElement(name="tipo")
  @ApiModelProperty(example = "20", value = "Tipo de documento de saída<p>Os documentos podem ser:</p>10 – DI<br/>11 – Processo Digital/Processo Dossiê<br/>12 – E-DMOV<br/>20 – Outros<br/>21 – PMB<br/>22 – PDE/TR<br/>23 – DSI Eletrônica<br/>24 – DSI Formulário<br/>30 – DTA - Importação comum<br/>31 – DTA - Importação especial - bagagem desacompanhada<br/>32 – DTA - Importação especial - mala diplomática<br/>33 – DTA - Importação especial - urna funerária<br/>34 – DTA - Importação especial - outras<br/>35 – DTA - Passagem comum<br/>36 – DTA - Passagem comum - bagagem desacompanhada<br/>37 – DTA - Passagem comum - mala diplomática<br/>38 – DTA - Passagem comum - partes e peças<br/>39 – DTA - Passagem comum - urna funerária<br/>40 – DTA - Passagem comum - outras<br/>50 – DTI<br/>99 – DUIMP<br/>")
 /**
   * Tipo de documento de saída<p>Os documentos podem ser:</p>10 – DI<br/>11 – Processo Digital/Processo Dossiê<br/>12 – E-DMOV<br/>20 – Outros<br/>21 – PMB<br/>22 – PDE/TR<br/>23 – DSI Eletrônica<br/>24 – DSI Formulário<br/>30 – DTA - Importação comum<br/>31 – DTA - Importação especial - bagagem desacompanhada<br/>32 – DTA - Importação especial - mala diplomática<br/>33 – DTA - Importação especial - urna funerária<br/>34 – DTA - Importação especial - outras<br/>35 – DTA - Passagem comum<br/>36 – DTA - Passagem comum - bagagem desacompanhada<br/>37 – DTA - Passagem comum - mala diplomática<br/>38 – DTA - Passagem comum - partes e peças<br/>39 – DTA - Passagem comum - urna funerária<br/>40 – DTA - Passagem comum - outras<br/>50 – DTI<br/>99 – DUIMP<br/>
  **/
  private TipoEnum tipo = null;

  @XmlElement(name="uaDestinoDta")
  @ApiModelProperty(example = "0717700", value = "Unidade da RFB de destino da DTA.")
 /**
   * Unidade da RFB de destino da DTA.
  **/
  private String uaDestinoDta = null;
 /**
   * Data / Hora do registro&lt;br/&gt; 
   * @return dataHoraVinculacao
  **/
  @JsonProperty("dataHoraVinculacao")
  public String getDataHoraVinculacao() {
    return dataHoraVinculacao;
  }

  public void setDataHoraVinculacao(String dataHoraVinculacao) {
    this.dataHoraVinculacao = dataHoraVinculacao;
  }

  public DocumentoSaidaConsultaDetalhada dataHoraVinculacao(String dataHoraVinculacao) {
    this.dataHoraVinculacao = dataHoraVinculacao;
    return this;
  }

 /**
   * Número de documento de saída&lt;br/&gt;Tamanho mínimo: 1&lt;br/&gt;Tamanho máximo:17&lt;br/&gt; Formato: NNNNNNNNNNNNNNNNN
   * @return numero
  **/
  @JsonProperty("numero")
  public String getNumero() {
    return numero;
  }

  public void setNumero(String numero) {
    this.numero = numero;
  }

  public DocumentoSaidaConsultaDetalhada numero(String numero) {
    this.numero = numero;
    return this;
  }

 /**
   * Recinto Aduaneiro de destino da DTA.
   * @return raDestinoDta
  **/
  @JsonProperty("raDestinoDta")
  public String getRaDestinoDta() {
    return raDestinoDta;
  }

  public void setRaDestinoDta(String raDestinoDta) {
    this.raDestinoDta = raDestinoDta;
  }

  public DocumentoSaidaConsultaDetalhada raDestinoDta(String raDestinoDta) {
    this.raDestinoDta = raDestinoDta;
    return this;
  }

 /**
   * Tipo de documento de saída&lt;p&gt;Os documentos podem ser:&lt;/p&gt;10 – DI&lt;br/&gt;11 – Processo Digital/Processo Dossiê&lt;br/&gt;12 – E-DMOV&lt;br/&gt;20 – Outros&lt;br/&gt;21 – PMB&lt;br/&gt;22 – PDE/TR&lt;br/&gt;23 – DSI Eletrônica&lt;br/&gt;24 – DSI Formulário&lt;br/&gt;30 – DTA - Importação comum&lt;br/&gt;31 – DTA - Importação especial - bagagem desacompanhada&lt;br/&gt;32 – DTA - Importação especial - mala diplomática&lt;br/&gt;33 – DTA - Importação especial - urna funerária&lt;br/&gt;34 – DTA - Importação especial - outras&lt;br/&gt;35 – DTA - Passagem comum&lt;br/&gt;36 – DTA - Passagem comum - bagagem desacompanhada&lt;br/&gt;37 – DTA - Passagem comum - mala diplomática&lt;br/&gt;38 – DTA - Passagem comum - partes e peças&lt;br/&gt;39 – DTA - Passagem comum - urna funerária&lt;br/&gt;40 – DTA - Passagem comum - outras&lt;br/&gt;50 – DTI&lt;br/&gt;99 – DUIMP&lt;br/&gt;
   * @return tipo
  **/
  @JsonProperty("tipo")
  public String getTipo() {
    if (tipo == null) {
      return null;
    }
    return tipo.value();
  }

  public void setTipo(TipoEnum tipo) {
    this.tipo = tipo;
  }

  public DocumentoSaidaConsultaDetalhada tipo(TipoEnum tipo) {
    this.tipo = tipo;
    return this;
  }

 /**
   * Unidade da RFB de destino da DTA.
   * @return uaDestinoDta
  **/
  @JsonProperty("uaDestinoDta")
  public String getUaDestinoDta() {
    return uaDestinoDta;
  }

  public void setUaDestinoDta(String uaDestinoDta) {
    this.uaDestinoDta = uaDestinoDta;
  }

  public DocumentoSaidaConsultaDetalhada uaDestinoDta(String uaDestinoDta) {
    this.uaDestinoDta = uaDestinoDta;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentoSaidaConsultaDetalhada {\n");
    
    sb.append("    dataHoraVinculacao: ").append(toIndentedString(dataHoraVinculacao)).append("\n");
    sb.append("    numero: ").append(toIndentedString(numero)).append("\n");
    sb.append("    raDestinoDta: ").append(toIndentedString(raDestinoDta)).append("\n");
    sb.append("    tipo: ").append(toIndentedString(tipo)).append("\n");
    sb.append("    uaDestinoDta: ").append(toIndentedString(uaDestinoDta)).append("\n");
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

