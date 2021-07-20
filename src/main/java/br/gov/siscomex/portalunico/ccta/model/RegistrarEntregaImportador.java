package br.gov.siscomex.portalunico.ccta.model;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "RegistrarEntregaImportador", propOrder =
    { "cnpjResponsavelEntrega", "unidadeRFB", "recintoAduaneiro", "tipoCarga", "identificacaoCarga", "dataEmissao", "cnpjResponsavelArquivo", "tipoDocumentoSaida", "numeroDocumentoSaida", "tipoEntrega", "pesoEntrega", "volumeEntrega", "contingencia", "dataHoraEntrega", "comprovanteIcmsApresentado", "observacoes", "recebedor"
})

@XmlRootElement(name="RegistrarEntregaImportador")
public class RegistrarEntregaImportador  {
  
  @XmlElement(name="cnpjResponsavelEntrega", required = true)
  @ApiModelProperty(example = "00000000000191", required = true, value = "CNPJ do responsável pela entrega da carga.<br/>Tamanho: 14<br/>Formato: NNNNNNNNNNNNNN")
 /**
   * CNPJ do responsável pela entrega da carga.<br/>Tamanho: 14<br/>Formato: NNNNNNNNNNNNNN
  **/
  private String cnpjResponsavelEntrega = null;

  @XmlElement(name="unidadeRFB")
  @ApiModelProperty(example = "0717700", value = "Unidade da RFB da Cia. Aérea ou Depositário responsável pela entrega<br/>Este campo é obrigatório para Cia. Aérea e opcional para o Depositário.")
 /**
   * Unidade da RFB da Cia. Aérea ou Depositário responsável pela entrega<br/>Este campo é obrigatório para Cia. Aérea e opcional para o Depositário.
  **/
  private String unidadeRFB = null;

  @XmlElement(name="recintoAduaneiro")
  @ApiModelProperty(example = "7911101", value = "Recinto Aduaneiro do Depositário responsável pela entrega.<br/>Este campo é obrigatório para o Depositário e não deve ser informado para outros intervenientes.")
 /**
   * Recinto Aduaneiro do Depositário responsável pela entrega.<br/>Este campo é obrigatório para o Depositário e não deve ser informado para outros intervenientes.
  **/
  private String recintoAduaneiro = null;


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

  @XmlElement(name="identificacaoCarga")
  @ApiModelProperty(example = "43NQKMM8KNT", value = "Identificação da carga (Conhecimento/DSIC)<br/>Tamanho mínimo: 1<br/>Tamanho máximo: 35")
 /**
   * Identificação da carga (Conhecimento/DSIC)<br/>Tamanho mínimo: 1<br/>Tamanho máximo: 35
  **/
  private String identificacaoCarga = null;

  @XmlElement(name="dataEmissao")
  @ApiModelProperty(example = "2020-08-07", value = "Data da emissão do conhecimento.<br/>Obrigatório para tipos de conhecimento AWB, MAWB e HAWB.<br/>Para o tipo DSIC não deve ser informado.<br/>Formato: yyyy-MM-dd")
 /**
   * Data da emissão do conhecimento.<br/>Obrigatório para tipos de conhecimento AWB, MAWB e HAWB.<br/>Para o tipo DSIC não deve ser informado.<br/>Formato: yyyy-MM-dd
  **/
  private String dataEmissao = null;

  @XmlElement(name="cnpjResponsavelArquivo")
  @ApiModelProperty(example = "00000000000191", value = "CNPJ do responsável pelo arquivo do conhecimento de carga.<br/>Somente deve ser informado para conhecimentos do tipo HAWB<br/>Tamanho: 8<br/>Formato: NNNNNNNN ou <br/>Tamanho: 14<br/>Formato: NNNNNNNNNNNNNN")
 /**
   * CNPJ do responsável pelo arquivo do conhecimento de carga.<br/>Somente deve ser informado para conhecimentos do tipo HAWB<br/>Tamanho: 8<br/>Formato: NNNNNNNN ou <br/>Tamanho: 14<br/>Formato: NNNNNNNNNNNNNN
  **/
  private String cnpjResponsavelArquivo = null;


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

  @XmlElement(name="numeroDocumentoSaida")
  @ApiModelProperty(example = "5490178901", value = "Número de documento de saída<br/>Tamanho mínimo: 1<br/>Tamanho máximo:17<br/> Formato: NNNNNNNNNNNNNNNNN")
 /**
   * Número de documento de saída<br/>Tamanho mínimo: 1<br/>Tamanho máximo:17<br/> Formato: NNNNNNNNNNNNNNNNN
  **/
  private String numeroDocumentoSaida = null;


@XmlType(name="TipoEntregaEnum")
@XmlEnum(String.class)
public enum TipoEntregaEnum {

	@XmlEnumValue("PARCIAL")
	@JsonProperty("PARCIAL")
	PARCIAL(String.valueOf("PARCIAL")),
	
	@XmlEnumValue("TOTAL")
	@JsonProperty("TOTAL")
	TOTAL(String.valueOf("TOTAL"));


    private String value;

    TipoEntregaEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TipoEntregaEnum fromValue(String v) {
        for (TipoEntregaEnum b : TipoEntregaEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to TipoEntregaEnum");
    }
}

  @XmlElement(name="tipoEntrega")
  @ApiModelProperty(example = "TOTAL", value = "Indicador para entrega parcial ou total")
 /**
   * Indicador para entrega parcial ou total
  **/
  private TipoEntregaEnum tipoEntrega = null;

  @XmlElement(name="pesoEntrega")
  @ApiModelProperty(example = "105.478", value = "Peso em Kg<br/>Tamanho: 7,3<br/>Formato: Decimal, com até 3 casas decimais separadas por ponto.")
  @Valid
 /**
   * Peso em Kg<br/>Tamanho: 7,3<br/>Formato: Decimal, com até 3 casas decimais separadas por ponto.
  **/
  private BigDecimal pesoEntrega = null;

  @XmlElement(name="volumeEntrega")
  @ApiModelProperty(example = "5", value = "Quantidade de volumes<br/>Tamanho: 4<br/>Formato: Inteiro, com até 4 digitos")
 /**
   * Quantidade de volumes<br/>Tamanho: 4<br/>Formato: Inteiro, com até 4 digitos
  **/
  private Long volumeEntrega = null;

  @XmlElement(name="contingencia")
  @ApiModelProperty(example = "false", value = "Indica que a entrega foi realizada em contingência")
 /**
   * Indica que a entrega foi realizada em contingência
  **/
  private Boolean contingencia = null;

  @XmlElement(name="dataHoraEntrega")
  @ApiModelProperty(example = "2020-08-07T15:45:38-03:00", value = "Data e hora da entrega efetiva no caso de entrega em contingência<br/>Formato: yyyy-MM-dd'T'HH:mm:ssZ")
 /**
   * Data e hora da entrega efetiva no caso de entrega em contingência<br/>Formato: yyyy-MM-dd'T'HH:mm:ssZ
  **/
  private OffsetDateTime dataHoraEntrega = null;

  @XmlElement(name="comprovanteIcmsApresentado")
  @ApiModelProperty(example = "true", value = "Indica a apresentação de comprovante de pagamento/exoneração do ICMS")
 /**
   * Indica a apresentação de comprovante de pagamento/exoneração do ICMS
  **/
  private Boolean comprovanteIcmsApresentado = null;

  @XmlElement(name="observacoes")
  @ApiModelProperty(example = "Entrega realizada com a apresentação de documentação", value = "Observações sobre a entrega<br/>Tamanho máximo: 300")
 /**
   * Observações sobre a entrega<br/>Tamanho máximo: 300
  **/
  private String observacoes = null;

  @XmlElement(name="recebedor")
  @ApiModelProperty(value = "")
  @Valid
  private Recebedor recebedor = null;
 /**
   * CNPJ do responsável pela entrega da carga.&lt;br/&gt;Tamanho: 14&lt;br/&gt;Formato: NNNNNNNNNNNNNN
   * @return cnpjResponsavelEntrega
  **/
  @JsonProperty("cnpjResponsavelEntrega")
  @NotNull
  public String getCnpjResponsavelEntrega() {
    return cnpjResponsavelEntrega;
  }

  public void setCnpjResponsavelEntrega(String cnpjResponsavelEntrega) {
    this.cnpjResponsavelEntrega = cnpjResponsavelEntrega;
  }

  public RegistrarEntregaImportador cnpjResponsavelEntrega(String cnpjResponsavelEntrega) {
    this.cnpjResponsavelEntrega = cnpjResponsavelEntrega;
    return this;
  }

 /**
   * Unidade da RFB da Cia. Aérea ou Depositário responsável pela entrega&lt;br/&gt;Este campo é obrigatório para Cia. Aérea e opcional para o Depositário.
   * @return unidadeRFB
  **/
  @JsonProperty("unidadeRFB")
  public String getUnidadeRFB() {
    return unidadeRFB;
  }

  public void setUnidadeRFB(String unidadeRFB) {
    this.unidadeRFB = unidadeRFB;
  }

  public RegistrarEntregaImportador unidadeRFB(String unidadeRFB) {
    this.unidadeRFB = unidadeRFB;
    return this;
  }

 /**
   * Recinto Aduaneiro do Depositário responsável pela entrega.&lt;br/&gt;Este campo é obrigatório para o Depositário e não deve ser informado para outros intervenientes.
   * @return recintoAduaneiro
  **/
  @JsonProperty("recintoAduaneiro")
  public String getRecintoAduaneiro() {
    return recintoAduaneiro;
  }

  public void setRecintoAduaneiro(String recintoAduaneiro) {
    this.recintoAduaneiro = recintoAduaneiro;
  }

  public RegistrarEntregaImportador recintoAduaneiro(String recintoAduaneiro) {
    this.recintoAduaneiro = recintoAduaneiro;
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

  public RegistrarEntregaImportador tipoCarga(TipoCargaEnum tipoCarga) {
    this.tipoCarga = tipoCarga;
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

  public RegistrarEntregaImportador identificacaoCarga(String identificacaoCarga) {
    this.identificacaoCarga = identificacaoCarga;
    return this;
  }

 /**
   * Data da emissão do conhecimento.&lt;br/&gt;Obrigatório para tipos de conhecimento AWB, MAWB e HAWB.&lt;br/&gt;Para o tipo DSIC não deve ser informado.&lt;br/&gt;Formato: yyyy-MM-dd
   * @return dataEmissao
  **/
  @JsonProperty("dataEmissao")
  public String getDataEmissao() {
    return dataEmissao;
  }

  public void setDataEmissao(String dataEmissao) {
    this.dataEmissao = dataEmissao;
  }

  public RegistrarEntregaImportador dataEmissao(String dataEmissao) {
    this.dataEmissao = dataEmissao;
    return this;
  }

 /**
   * CNPJ do responsável pelo arquivo do conhecimento de carga.&lt;br/&gt;Somente deve ser informado para conhecimentos do tipo HAWB&lt;br/&gt;Tamanho: 8&lt;br/&gt;Formato: NNNNNNNN ou &lt;br/&gt;Tamanho: 14&lt;br/&gt;Formato: NNNNNNNNNNNNNN
   * @return cnpjResponsavelArquivo
  **/
  @JsonProperty("cnpjResponsavelArquivo")
  public String getCnpjResponsavelArquivo() {
    return cnpjResponsavelArquivo;
  }

  public void setCnpjResponsavelArquivo(String cnpjResponsavelArquivo) {
    this.cnpjResponsavelArquivo = cnpjResponsavelArquivo;
  }

  public RegistrarEntregaImportador cnpjResponsavelArquivo(String cnpjResponsavelArquivo) {
    this.cnpjResponsavelArquivo = cnpjResponsavelArquivo;
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

  public RegistrarEntregaImportador tipoDocumentoSaida(TipoDocumentoSaidaEnum tipoDocumentoSaida) {
    this.tipoDocumentoSaida = tipoDocumentoSaida;
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

  public RegistrarEntregaImportador numeroDocumentoSaida(String numeroDocumentoSaida) {
    this.numeroDocumentoSaida = numeroDocumentoSaida;
    return this;
  }

 /**
   * Indicador para entrega parcial ou total
   * @return tipoEntrega
  **/
  @JsonProperty("tipoEntrega")
  public String getTipoEntrega() {
    if (tipoEntrega == null) {
      return null;
    }
    return tipoEntrega.value();
  }

  public void setTipoEntrega(TipoEntregaEnum tipoEntrega) {
    this.tipoEntrega = tipoEntrega;
  }

  public RegistrarEntregaImportador tipoEntrega(TipoEntregaEnum tipoEntrega) {
    this.tipoEntrega = tipoEntrega;
    return this;
  }

 /**
   * Peso em Kg&lt;br/&gt;Tamanho: 7,3&lt;br/&gt;Formato: Decimal, com até 3 casas decimais separadas por ponto.
   * @return pesoEntrega
  **/
  @JsonProperty("pesoEntrega")
  public BigDecimal getPesoEntrega() {
    return pesoEntrega;
  }

  public void setPesoEntrega(BigDecimal pesoEntrega) {
    this.pesoEntrega = pesoEntrega;
  }

  public RegistrarEntregaImportador pesoEntrega(BigDecimal pesoEntrega) {
    this.pesoEntrega = pesoEntrega;
    return this;
  }

 /**
   * Quantidade de volumes&lt;br/&gt;Tamanho: 4&lt;br/&gt;Formato: Inteiro, com até 4 digitos
   * @return volumeEntrega
  **/
  @JsonProperty("volumeEntrega")
  public Long getVolumeEntrega() {
    return volumeEntrega;
  }

  public void setVolumeEntrega(Long volumeEntrega) {
    this.volumeEntrega = volumeEntrega;
  }

  public RegistrarEntregaImportador volumeEntrega(Long volumeEntrega) {
    this.volumeEntrega = volumeEntrega;
    return this;
  }

 /**
   * Indica que a entrega foi realizada em contingência
   * @return contingencia
  **/
  @JsonProperty("contingencia")
  public Boolean isContingencia() {
    return contingencia;
  }

  public void setContingencia(Boolean contingencia) {
    this.contingencia = contingencia;
  }

  public RegistrarEntregaImportador contingencia(Boolean contingencia) {
    this.contingencia = contingencia;
    return this;
  }

 /**
   * Data e hora da entrega efetiva no caso de entrega em contingência&lt;br/&gt;Formato: yyyy-MM-dd&#39;T&#39;HH:mm:ssZ
   * @return dataHoraEntrega
  **/
  @JsonProperty("dataHoraEntrega")
  public OffsetDateTime getDataHoraEntrega() {
    return dataHoraEntrega;
  }

  public void setDataHoraEntrega(OffsetDateTime dataHoraEntrega) {
    this.dataHoraEntrega = dataHoraEntrega;
  }

  public RegistrarEntregaImportador dataHoraEntrega(OffsetDateTime dataHoraEntrega) {
    this.dataHoraEntrega = dataHoraEntrega;
    return this;
  }

 /**
   * Indica a apresentação de comprovante de pagamento/exoneração do ICMS
   * @return comprovanteIcmsApresentado
  **/
  @JsonProperty("comprovanteIcmsApresentado")
  public Boolean isComprovanteIcmsApresentado() {
    return comprovanteIcmsApresentado;
  }

  public void setComprovanteIcmsApresentado(Boolean comprovanteIcmsApresentado) {
    this.comprovanteIcmsApresentado = comprovanteIcmsApresentado;
  }

  public RegistrarEntregaImportador comprovanteIcmsApresentado(Boolean comprovanteIcmsApresentado) {
    this.comprovanteIcmsApresentado = comprovanteIcmsApresentado;
    return this;
  }

 /**
   * Observações sobre a entrega&lt;br/&gt;Tamanho máximo: 300
   * @return observacoes
  **/
  @JsonProperty("observacoes")
  public String getObservacoes() {
    return observacoes;
  }

  public void setObservacoes(String observacoes) {
    this.observacoes = observacoes;
  }

  public RegistrarEntregaImportador observacoes(String observacoes) {
    this.observacoes = observacoes;
    return this;
  }

 /**
   * Get recebedor
   * @return recebedor
  **/
  @JsonProperty("recebedor")
  public Recebedor getRecebedor() {
    return recebedor;
  }

  public void setRecebedor(Recebedor recebedor) {
    this.recebedor = recebedor;
  }

  public RegistrarEntregaImportador recebedor(Recebedor recebedor) {
    this.recebedor = recebedor;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegistrarEntregaImportador {\n");
    
    sb.append("    cnpjResponsavelEntrega: ").append(toIndentedString(cnpjResponsavelEntrega)).append("\n");
    sb.append("    unidadeRFB: ").append(toIndentedString(unidadeRFB)).append("\n");
    sb.append("    recintoAduaneiro: ").append(toIndentedString(recintoAduaneiro)).append("\n");
    sb.append("    tipoCarga: ").append(toIndentedString(tipoCarga)).append("\n");
    sb.append("    identificacaoCarga: ").append(toIndentedString(identificacaoCarga)).append("\n");
    sb.append("    dataEmissao: ").append(toIndentedString(dataEmissao)).append("\n");
    sb.append("    cnpjResponsavelArquivo: ").append(toIndentedString(cnpjResponsavelArquivo)).append("\n");
    sb.append("    tipoDocumentoSaida: ").append(toIndentedString(tipoDocumentoSaida)).append("\n");
    sb.append("    numeroDocumentoSaida: ").append(toIndentedString(numeroDocumentoSaida)).append("\n");
    sb.append("    tipoEntrega: ").append(toIndentedString(tipoEntrega)).append("\n");
    sb.append("    pesoEntrega: ").append(toIndentedString(pesoEntrega)).append("\n");
    sb.append("    volumeEntrega: ").append(toIndentedString(volumeEntrega)).append("\n");
    sb.append("    contingencia: ").append(toIndentedString(contingencia)).append("\n");
    sb.append("    dataHoraEntrega: ").append(toIndentedString(dataHoraEntrega)).append("\n");
    sb.append("    comprovanteIcmsApresentado: ").append(toIndentedString(comprovanteIcmsApresentado)).append("\n");
    sb.append("    observacoes: ").append(toIndentedString(observacoes)).append("\n");
    sb.append("    recebedor: ").append(toIndentedString(recebedor)).append("\n");
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

