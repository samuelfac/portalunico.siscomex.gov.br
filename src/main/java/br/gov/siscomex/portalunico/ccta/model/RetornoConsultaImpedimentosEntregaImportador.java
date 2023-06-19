package br.gov.siscomex.portalunico.ccta.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.xml.bind.annotation.*;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "RetornoConsultaImpedimentosEntregaImportador", propOrder =
    { "entregaAutorizada", "identificacaoCarga", "impedimentos", "numeroDocumentoSaida", "tipoCarga", "tipoDocumentoSaida"
})

@XmlRootElement(name="RetornoConsultaImpedimentosEntregaImportador")
/**
  * Retorno da consulta de impedimentos da entrega da carga.
 **/
@ApiModel(description="Retorno da consulta de impedimentos da entrega da carga.")
public class RetornoConsultaImpedimentosEntregaImportador  {
  
  @XmlElement(name="entregaAutorizada")
  @ApiModelProperty(example = "false", value = "Indicador informando que a entrega esta autorizada")
 /**
   * Indicador informando que a entrega esta autorizada
  **/
  private Boolean entregaAutorizada = null;

  @XmlElement(name="identificacaoCarga")
  @ApiModelProperty(example = "43NQKMM8KNT", value = "Identificação da carga (Conhecimento/DSIC)<br/>Tamanho mínimo: 1<br/>Tamanho máximo: 35")
 /**
   * Identificação da carga (Conhecimento/DSIC)<br/>Tamanho mínimo: 1<br/>Tamanho máximo: 35
  **/
  private String identificacaoCarga = null;

  @XmlElement(name="impedimentos")
  @ApiModelProperty(value = "Lista de impedimentos da entrega da carga ao importador")
  @Valid
 /**
   * Lista de impedimentos da entrega da carga ao importador
  **/
  private List<ImpedimentoEntregaImportador> impedimentos = null;

  @XmlElement(name="numeroDocumentoSaida")
  @ApiModelProperty(example = "5490178901", value = "Número de documento de saída<br/>Tamanho mínimo: 1<br/>Tamanho máximo:17<br/> Formato: NNNNNNNNNNNNNNNNN")
 /**
   * Número de documento de saída<br/>Tamanho mínimo: 1<br/>Tamanho máximo:17<br/> Formato: NNNNNNNNNNNNNNNNN
  **/
  private String numeroDocumentoSaida = null;


@XmlType(name="TipoCargaEnum")
@XmlEnum(String.class)
public enum TipoCargaEnum {

	@XmlEnumValue("740")
	@JsonProperty("740")
	_740(String.valueOf("740")),
	
	@XmlEnumValue("741")
	@JsonProperty("741")
	_741(String.valueOf("741")),
	
	@XmlEnumValue("703")
	@JsonProperty("703")
	_703(String.valueOf("703")),
	
	@XmlEnumValue("14")
	@JsonProperty("14")
	_14(String.valueOf("14"));


    private String value;

    TipoCargaEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TipoCargaEnum fromValue(String v) {
        for (TipoCargaEnum b : TipoCargaEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to TipoCargaEnum");
    }
}

  @XmlElement(name="tipoCarga")
  @ApiModelProperty(example = "740", value = "Tipo de carga. <p>Os tipos podem ser:</p><ul><li><em>740</em> – Air Waybill.</li><li><em>741</em> – Master Air Waybill.</li><li><em>703</em> – House Air Waybill.</li><li><em>14</em> – DSIC - Documento Subsidiário de Identificação de Carga.</li></ul>")
 /**
   * Tipo de carga. <p>Os tipos podem ser:</p><ul><li><em>740</em> – Air Waybill.</li><li><em>741</em> – Master Air Waybill.</li><li><em>703</em> – House Air Waybill.</li><li><em>14</em> – DSIC - Documento Subsidiário de Identificação de Carga.</li></ul>
  **/
  private TipoCargaEnum tipoCarga = null;


@XmlType(name="TipoDocumentoSaidaEnum")
@XmlEnum(String.class)
public enum TipoDocumentoSaidaEnum {

	@XmlEnumValue("DI")
	@JsonProperty("DI")
	DI(String.valueOf("DI")),
	
	@XmlEnumValue("PROCESSO")
	@JsonProperty("PROCESSO")
	PROCESSO(String.valueOf("PROCESSO")),
	
	@XmlEnumValue("EDMOV")
	@JsonProperty("EDMOV")
	EDMOV(String.valueOf("EDMOV")),
	
	@XmlEnumValue("OUTROS")
	@JsonProperty("OUTROS")
	OUTROS(String.valueOf("OUTROS")),
	
	@XmlEnumValue("PMD")
	@JsonProperty("PMD")
	PMD(String.valueOf("PMD")),
	
	@XmlEnumValue("PDE_TR")
	@JsonProperty("PDE_TR")
	PDE_TR(String.valueOf("PDE_TR")),
	
	@XmlEnumValue("DSI")
	@JsonProperty("DSI")
	DSI(String.valueOf("DSI")),
	
	@XmlEnumValue("DSI_FORMULARIO")
	@JsonProperty("DSI_FORMULARIO")
	DSI_FORMULARIO(String.valueOf("DSI_FORMULARIO"));


    private String value;

    TipoDocumentoSaidaEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TipoDocumentoSaidaEnum fromValue(String v) {
        for (TipoDocumentoSaidaEnum b : TipoDocumentoSaidaEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to TipoDocumentoSaidaEnum");
    }
}

  @XmlElement(name="tipoDocumentoSaida")
  @ApiModelProperty(example = "PROCESSO", value = "Tipo de documento de saída")
 /**
   * Tipo de documento de saída
  **/
  private TipoDocumentoSaidaEnum tipoDocumentoSaida = null;
 /**
   * Indicador informando que a entrega esta autorizada
   * @return entregaAutorizada
  **/
  @JsonProperty("entregaAutorizada")
  public Boolean isEntregaAutorizada() {
    return entregaAutorizada;
  }

  public void setEntregaAutorizada(Boolean entregaAutorizada) {
    this.entregaAutorizada = entregaAutorizada;
  }

  public RetornoConsultaImpedimentosEntregaImportador entregaAutorizada(Boolean entregaAutorizada) {
    this.entregaAutorizada = entregaAutorizada;
    return this;
  }

 /**
   * Identificação da carga (Conhecimento/DSIC)&lt;br/&gt;Tamanho mínimo: 1&lt;br/&gt;Tamanho máximo: 35
   * @return identificacaoCarga
  **/
  @JsonProperty("identificacaoCarga")
  public String getIdentificacaoCarga() {
    return identificacaoCarga;
  }

  public void setIdentificacaoCarga(String identificacaoCarga) {
    this.identificacaoCarga = identificacaoCarga;
  }

  public RetornoConsultaImpedimentosEntregaImportador identificacaoCarga(String identificacaoCarga) {
    this.identificacaoCarga = identificacaoCarga;
    return this;
  }

 /**
   * Lista de impedimentos da entrega da carga ao importador
   * @return impedimentos
  **/
  @JsonProperty("impedimentos")
  public List<ImpedimentoEntregaImportador> getImpedimentos() {
    return impedimentos;
  }

  public void setImpedimentos(List<ImpedimentoEntregaImportador> impedimentos) {
    this.impedimentos = impedimentos;
  }

  public RetornoConsultaImpedimentosEntregaImportador impedimentos(List<ImpedimentoEntregaImportador> impedimentos) {
    this.impedimentos = impedimentos;
    return this;
  }

  public RetornoConsultaImpedimentosEntregaImportador addImpedimentosItem(ImpedimentoEntregaImportador impedimentosItem) {
    this.impedimentos.add(impedimentosItem);
    return this;
  }

 /**
   * Número de documento de saída&lt;br/&gt;Tamanho mínimo: 1&lt;br/&gt;Tamanho máximo:17&lt;br/&gt; Formato: NNNNNNNNNNNNNNNNN
   * @return numeroDocumentoSaida
  **/
  @JsonProperty("numeroDocumentoSaida")
  public String getNumeroDocumentoSaida() {
    return numeroDocumentoSaida;
  }

  public void setNumeroDocumentoSaida(String numeroDocumentoSaida) {
    this.numeroDocumentoSaida = numeroDocumentoSaida;
  }

  public RetornoConsultaImpedimentosEntregaImportador numeroDocumentoSaida(String numeroDocumentoSaida) {
    this.numeroDocumentoSaida = numeroDocumentoSaida;
    return this;
  }

 /**
   * Tipo de carga. &lt;p&gt;Os tipos podem ser:&lt;/p&gt;&lt;ul&gt;&lt;li&gt;&lt;em&gt;740&lt;/em&gt; – Air Waybill.&lt;/li&gt;&lt;li&gt;&lt;em&gt;741&lt;/em&gt; – Master Air Waybill.&lt;/li&gt;&lt;li&gt;&lt;em&gt;703&lt;/em&gt; – House Air Waybill.&lt;/li&gt;&lt;li&gt;&lt;em&gt;14&lt;/em&gt; – DSIC - Documento Subsidiário de Identificação de Carga.&lt;/li&gt;&lt;/ul&gt;
   * @return tipoCarga
  **/
  @JsonProperty("tipoCarga")
  public String getTipoCarga() {
    if (tipoCarga == null) {
      return null;
    }
    return tipoCarga.value();
  }

  public void setTipoCarga(TipoCargaEnum tipoCarga) {
    this.tipoCarga = tipoCarga;
  }

  public RetornoConsultaImpedimentosEntregaImportador tipoCarga(TipoCargaEnum tipoCarga) {
    this.tipoCarga = tipoCarga;
    return this;
  }

 /**
   * Tipo de documento de saída
   * @return tipoDocumentoSaida
  **/
  @JsonProperty("tipoDocumentoSaida")
  public String getTipoDocumentoSaida() {
    if (tipoDocumentoSaida == null) {
      return null;
    }
    return tipoDocumentoSaida.value();
  }

  public void setTipoDocumentoSaida(TipoDocumentoSaidaEnum tipoDocumentoSaida) {
    this.tipoDocumentoSaida = tipoDocumentoSaida;
  }

  public RetornoConsultaImpedimentosEntregaImportador tipoDocumentoSaida(TipoDocumentoSaidaEnum tipoDocumentoSaida) {
    this.tipoDocumentoSaida = tipoDocumentoSaida;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetornoConsultaImpedimentosEntregaImportador {\n");
    
    sb.append("    entregaAutorizada: ").append(toIndentedString(entregaAutorizada)).append("\n");
    sb.append("    identificacaoCarga: ").append(toIndentedString(identificacaoCarga)).append("\n");
    sb.append("    impedimentos: ").append(toIndentedString(impedimentos)).append("\n");
    sb.append("    numeroDocumentoSaida: ").append(toIndentedString(numeroDocumentoSaida)).append("\n");
    sb.append("    tipoCarga: ").append(toIndentedString(tipoCarga)).append("\n");
    sb.append("    tipoDocumentoSaida: ").append(toIndentedString(tipoDocumentoSaida)).append("\n");
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

