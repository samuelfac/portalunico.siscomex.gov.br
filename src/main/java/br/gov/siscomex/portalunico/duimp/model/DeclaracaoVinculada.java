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
import java.time.OffsetDateTime;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "DeclaracaoVinculada", propOrder =
    { "tipo", "numero", "versao", "dataHoraRegistro", "numeroItem", "valorFreteMoedaDeclaracao", "valorSeguroMoedaDeclaracao", "unidadeMedidaEstatistica", "qtdMercadoriaUnidadeEstatistica", "itemCodigoRegime", "itemCodigoFundamento", "itemNcmAssociada", "mnemonicoSistemaControle"
})

@XmlRootElement(name="DeclaracaoVinculada")
/**
  * Declaração vinculada
 **/
@ApiModel(description="Declaração vinculada")
public class DeclaracaoVinculada  {
  

@XmlType(name="TipoEnum")
@XmlEnum(String.class)
public enum TipoEnum {

	@XmlEnumValue("1")
	@JsonProperty("1")
	_1(String.valueOf("1")),
	
	@XmlEnumValue("2")
	@JsonProperty("2")
	_2(String.valueOf("2")),
	
	@XmlEnumValue("3")
	@JsonProperty("3")
	_3(String.valueOf("3")),
	
	@XmlEnumValue("4")
	@JsonProperty("4")
	_4(String.valueOf("4"));


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
  @ApiModelProperty(example = "1", value = "Tipo de declaração vinculada.<br>Dominio:<br>1 - Duimp, <br>2 - DU-E, <br>3 - DI, <br>4 - DE<br>Tamanho: 1")
 /**
   * Tipo de declaração vinculada.<br>Dominio:<br>1 - Duimp, <br>2 - DU-E, <br>3 - DI, <br>4 - DE<br>Tamanho: 1
  **/
  private TipoEnum tipo = null;

  @XmlElement(name="numero")
  @ApiModelProperty(example = "19BR00000004936", value = "Número da Declaração vinculada.<br>Tamanho mínimo: 1<br>Tamanho máximo: 16")
 /**
   * Número da Declaração vinculada.<br>Tamanho mínimo: 1<br>Tamanho máximo: 16
  **/
  private String numero = null;

  @XmlElement(name="versao")
  @ApiModelProperty(example = "0001", value = "Versão da Declaração vinculada.<br>Tamanho: 4<br>Valor mínimo: 0001<br>Valor máximo: 9999<br>Observação:<br>Apenas quando a declaração vinculada for uma Duimp.")
 /**
   * Versão da Declaração vinculada.<br>Tamanho: 4<br>Valor mínimo: 0001<br>Valor máximo: 9999<br>Observação:<br>Apenas quando a declaração vinculada for uma Duimp.
  **/
  private String versao = null;

  @XmlElement(name="dataHoraRegistro")
  @ApiModelProperty(value = "Data e hora do registro declaração vinculada.<br>Formato: 'yyyy-MM-dd'T'HH:mm:ss.SSSZ'<br>Observação:<br>Apenas quando a declaração vinculada for uma Duimp.")
 /**
   * Data e hora do registro declaração vinculada.<br>Formato: 'yyyy-MM-dd'T'HH:mm:ss.SSSZ'<br>Observação:<br>Apenas quando a declaração vinculada for uma Duimp.
  **/
  private OffsetDateTime dataHoraRegistro = null;

  @XmlElement(name="numeroItem")
  @ApiModelProperty(example = "10001", value = "Número do item ou adição da declaração vinculada.<br>Valor mínimo: 1<br>Valor máximo: 99999")
 /**
   * Número do item ou adição da declaração vinculada.<br>Valor mínimo: 1<br>Valor máximo: 99999
  **/
  private String numeroItem = null;

  @XmlElement(name="valorFreteMoedaDeclaracao")
  @ApiModelProperty(example = "3806.5", value = "Valor do Frete na Moeda Negociada do Item da Declaração Vinculada.<br>Tamanho: 17,2<br>Formato: Decimal, com até 2 casas decimais separadas por ponto.<br>Observação:<br>Apenas quando a declaração vinculada for uma Duimp.")
  @Valid
 /**
   * Valor do Frete na Moeda Negociada do Item da Declaração Vinculada.<br>Tamanho: 17,2<br>Formato: Decimal, com até 2 casas decimais separadas por ponto.<br>Observação:<br>Apenas quando a declaração vinculada for uma Duimp.
  **/
  private BigDecimal valorFreteMoedaDeclaracao = null;

  @XmlElement(name="valorSeguroMoedaDeclaracao")
  @ApiModelProperty(example = "3806.5", value = "Valor do Seguro na Moeda Negociada do Item da Declaração Vinculada.<br>Tamanho: 17,2<br>Formato: Decimal, com até 2 casas decimais separadas por ponto.<br>Observação:<br>Apenas quando a declaração vinculada for uma Duimp.")
  @Valid
 /**
   * Valor do Seguro na Moeda Negociada do Item da Declaração Vinculada.<br>Tamanho: 17,2<br>Formato: Decimal, com até 2 casas decimais separadas por ponto.<br>Observação:<br>Apenas quando a declaração vinculada for uma Duimp.
  **/
  private BigDecimal valorSeguroMoedaDeclaracao = null;

  @XmlElement(name="unidadeMedidaEstatistica")
  @ApiModelProperty(example = "Peças", value = "Unidade de Medida Estatística (UME) do item da Declaração Vinculada.<br>Tamanho mínimo: 1<br>Tamanho máximo: 30<br>Observação:<br>Apenas quando a declaração vinculada for uma Duimp.")
 /**
   * Unidade de Medida Estatística (UME) do item da Declaração Vinculada.<br>Tamanho mínimo: 1<br>Tamanho máximo: 30<br>Observação:<br>Apenas quando a declaração vinculada for uma Duimp.
  **/
  private String unidadeMedidaEstatistica = null;

  @XmlElement(name="qtdMercadoriaUnidadeEstatistica")
  @ApiModelProperty(example = "1234.00005", value = "Quantidade da Mercadoria na Unidade de Medida Estatística do Item da Declaração Vinculada.<br>Tamanho: 16,5<br>Formato: Decimal, com até 5 casas decimais separadas por ponto.<br>Observação:<br>Apenas quando a declaração vinculada for uma Duimp.")
  @Valid
 /**
   * Quantidade da Mercadoria na Unidade de Medida Estatística do Item da Declaração Vinculada.<br>Tamanho: 16,5<br>Formato: Decimal, com até 5 casas decimais separadas por ponto.<br>Observação:<br>Apenas quando a declaração vinculada for uma Duimp.
  **/
  private BigDecimal qtdMercadoriaUnidadeEstatistica = null;

  @XmlElement(name="itemCodigoRegime")
  @ApiModelProperty(example = "3", value = "Regime Aplicado ao  Item da Declaração Vinculada.<br>Dominio: Regimes tributários existentes no sistema Tratamento Tributário<br>Observação:<br>Apenas quando a declaração vinculada for uma Duimp.")
 /**
   * Regime Aplicado ao  Item da Declaração Vinculada.<br>Dominio: Regimes tributários existentes no sistema Tratamento Tributário<br>Observação:<br>Apenas quando a declaração vinculada for uma Duimp.
  **/
  private Integer itemCodigoRegime = null;

  @XmlElement(name="itemCodigoFundamento")
  @ApiModelProperty(example = "1031", value = "Fundamento Aplicado ao Item da Declaração Vinculada<br>Dominio: Fundamentos legais existentes no sistema Tratamento Tributário<br>Observação:<br>Apenas quando a declaração vinculada for uma Duimp.")
 /**
   * Fundamento Aplicado ao Item da Declaração Vinculada<br>Dominio: Fundamentos legais existentes no sistema Tratamento Tributário<br>Observação:<br>Apenas quando a declaração vinculada for uma Duimp.
  **/
  private Integer itemCodigoFundamento = null;

  @XmlElement(name="itemNcmAssociada")
  @ApiModelProperty(example = "02013000", value = "Código da NCM associada ao item da Declaração Vinculada.<br>Tamanho: 8<br>Formato: 'NNNNNNNN'<br>Observação:<br>Apenas quando a declaração vinculada for uma Duimp.")
 /**
   * Código da NCM associada ao item da Declaração Vinculada.<br>Tamanho: 8<br>Formato: 'NNNNNNNN'<br>Observação:<br>Apenas quando a declaração vinculada for uma Duimp.
  **/
  private String itemNcmAssociada = null;


@XmlType(name="MnemonicoSistemaControleEnum")
@XmlEnum(String.class)
public enum MnemonicoSistemaControleEnum {

	@XmlEnumValue("RAES")
	@JsonProperty("RAES")
	RAES(String.valueOf("RAES")),
	
	@XmlEnumValue("DRAW_ISENCAO")
	@JsonProperty("DRAW_ISENCAO")
	DRAW_ISENCAO(String.valueOf("DRAW_ISENCAO")),
	
	@XmlEnumValue("DRAW_INTEGRADO")
	@JsonProperty("DRAW_INTEGRADO")
	DRAW_INTEGRADO(String.valueOf("DRAW_INTEGRADO")),
	
	@XmlEnumValue("DRAW_SUSPENSAO")
	@JsonProperty("DRAW_SUSPENSAO")
	DRAW_SUSPENSAO(String.valueOf("DRAW_SUSPENSAO")),
	
	@XmlEnumValue("DRAW_CONTINUO")
	@JsonProperty("DRAW_CONTINUO")
	DRAW_CONTINUO(String.valueOf("DRAW_CONTINUO"));


    private String value;

    MnemonicoSistemaControleEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static MnemonicoSistemaControleEnum fromValue(String v) {
        for (MnemonicoSistemaControleEnum b : MnemonicoSistemaControleEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to MnemonicoSistemaControleEnum");
    }
}

  @XmlElement(name="mnemonicoSistemaControle")
  @ApiModelProperty(example = "DRAW_ISENCAO", value = "Mnemonico do sistema de controle Associado ao Fundamento Aplicado ao Item da Declaração Vinculada.<br>Observação:<br>Apenas quando a declaração vinculada for uma Duimp.")
 /**
   * Mnemonico do sistema de controle Associado ao Fundamento Aplicado ao Item da Declaração Vinculada.<br>Observação:<br>Apenas quando a declaração vinculada for uma Duimp.
  **/
  private MnemonicoSistemaControleEnum mnemonicoSistemaControle = null;
 /**
   * Tipo de declaração vinculada.&lt;br&gt;Dominio:&lt;br&gt;1 - Duimp, &lt;br&gt;2 - DU-E, &lt;br&gt;3 - DI, &lt;br&gt;4 - DE&lt;br&gt;Tamanho: 1
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

  public DeclaracaoVinculada tipo(TipoEnum tipo) {
    this.tipo = tipo;
    return this;
  }

 /**
   * Número da Declaração vinculada.&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 16
   * @return numero
  **/
  @JsonProperty("numero")
  public String getNumero() {
    return numero;
  }

  public void setNumero(String numero) {
    this.numero = numero;
  }

  public DeclaracaoVinculada numero(String numero) {
    this.numero = numero;
    return this;
  }

 /**
   * Versão da Declaração vinculada.&lt;br&gt;Tamanho: 4&lt;br&gt;Valor mínimo: 0001&lt;br&gt;Valor máximo: 9999&lt;br&gt;Observação:&lt;br&gt;Apenas quando a declaração vinculada for uma Duimp.
   * @return versao
  **/
  @JsonProperty("versao")
  public String getVersao() {
    return versao;
  }

  public void setVersao(String versao) {
    this.versao = versao;
  }

  public DeclaracaoVinculada versao(String versao) {
    this.versao = versao;
    return this;
  }

 /**
   * Data e hora do registro declaração vinculada.&lt;br&gt;Formato: &#39;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#39;&lt;br&gt;Observação:&lt;br&gt;Apenas quando a declaração vinculada for uma Duimp.
   * @return dataHoraRegistro
  **/
  @JsonProperty("dataHoraRegistro")
  public OffsetDateTime getDataHoraRegistro() {
    return dataHoraRegistro;
  }

  public void setDataHoraRegistro(OffsetDateTime dataHoraRegistro) {
    this.dataHoraRegistro = dataHoraRegistro;
  }

  public DeclaracaoVinculada dataHoraRegistro(OffsetDateTime dataHoraRegistro) {
    this.dataHoraRegistro = dataHoraRegistro;
    return this;
  }

 /**
   * Número do item ou adição da declaração vinculada.&lt;br&gt;Valor mínimo: 1&lt;br&gt;Valor máximo: 99999
   * @return numeroItem
  **/
  @JsonProperty("numeroItem")
  public String getNumeroItem() {
    return numeroItem;
  }

  public void setNumeroItem(String numeroItem) {
    this.numeroItem = numeroItem;
  }

  public DeclaracaoVinculada numeroItem(String numeroItem) {
    this.numeroItem = numeroItem;
    return this;
  }

 /**
   * Valor do Frete na Moeda Negociada do Item da Declaração Vinculada.&lt;br&gt;Tamanho: 17,2&lt;br&gt;Formato: Decimal, com até 2 casas decimais separadas por ponto.&lt;br&gt;Observação:&lt;br&gt;Apenas quando a declaração vinculada for uma Duimp.
   * @return valorFreteMoedaDeclaracao
  **/
  @JsonProperty("valorFreteMoedaDeclaracao")
  public BigDecimal getValorFreteMoedaDeclaracao() {
    return valorFreteMoedaDeclaracao;
  }

  public void setValorFreteMoedaDeclaracao(BigDecimal valorFreteMoedaDeclaracao) {
    this.valorFreteMoedaDeclaracao = valorFreteMoedaDeclaracao;
  }

  public DeclaracaoVinculada valorFreteMoedaDeclaracao(BigDecimal valorFreteMoedaDeclaracao) {
    this.valorFreteMoedaDeclaracao = valorFreteMoedaDeclaracao;
    return this;
  }

 /**
   * Valor do Seguro na Moeda Negociada do Item da Declaração Vinculada.&lt;br&gt;Tamanho: 17,2&lt;br&gt;Formato: Decimal, com até 2 casas decimais separadas por ponto.&lt;br&gt;Observação:&lt;br&gt;Apenas quando a declaração vinculada for uma Duimp.
   * @return valorSeguroMoedaDeclaracao
  **/
  @JsonProperty("valorSeguroMoedaDeclaracao")
  public BigDecimal getValorSeguroMoedaDeclaracao() {
    return valorSeguroMoedaDeclaracao;
  }

  public void setValorSeguroMoedaDeclaracao(BigDecimal valorSeguroMoedaDeclaracao) {
    this.valorSeguroMoedaDeclaracao = valorSeguroMoedaDeclaracao;
  }

  public DeclaracaoVinculada valorSeguroMoedaDeclaracao(BigDecimal valorSeguroMoedaDeclaracao) {
    this.valorSeguroMoedaDeclaracao = valorSeguroMoedaDeclaracao;
    return this;
  }

 /**
   * Unidade de Medida Estatística (UME) do item da Declaração Vinculada.&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 30&lt;br&gt;Observação:&lt;br&gt;Apenas quando a declaração vinculada for uma Duimp.
   * @return unidadeMedidaEstatistica
  **/
  @JsonProperty("unidadeMedidaEstatistica")
  public String getUnidadeMedidaEstatistica() {
    return unidadeMedidaEstatistica;
  }

  public void setUnidadeMedidaEstatistica(String unidadeMedidaEstatistica) {
    this.unidadeMedidaEstatistica = unidadeMedidaEstatistica;
  }

  public DeclaracaoVinculada unidadeMedidaEstatistica(String unidadeMedidaEstatistica) {
    this.unidadeMedidaEstatistica = unidadeMedidaEstatistica;
    return this;
  }

 /**
   * Quantidade da Mercadoria na Unidade de Medida Estatística do Item da Declaração Vinculada.&lt;br&gt;Tamanho: 16,5&lt;br&gt;Formato: Decimal, com até 5 casas decimais separadas por ponto.&lt;br&gt;Observação:&lt;br&gt;Apenas quando a declaração vinculada for uma Duimp.
   * @return qtdMercadoriaUnidadeEstatistica
  **/
  @JsonProperty("qtdMercadoriaUnidadeEstatistica")
  public BigDecimal getQtdMercadoriaUnidadeEstatistica() {
    return qtdMercadoriaUnidadeEstatistica;
  }

  public void setQtdMercadoriaUnidadeEstatistica(BigDecimal qtdMercadoriaUnidadeEstatistica) {
    this.qtdMercadoriaUnidadeEstatistica = qtdMercadoriaUnidadeEstatistica;
  }

  public DeclaracaoVinculada qtdMercadoriaUnidadeEstatistica(BigDecimal qtdMercadoriaUnidadeEstatistica) {
    this.qtdMercadoriaUnidadeEstatistica = qtdMercadoriaUnidadeEstatistica;
    return this;
  }

 /**
   * Regime Aplicado ao  Item da Declaração Vinculada.&lt;br&gt;Dominio: Regimes tributários existentes no sistema Tratamento Tributário&lt;br&gt;Observação:&lt;br&gt;Apenas quando a declaração vinculada for uma Duimp.
   * @return itemCodigoRegime
  **/
  @JsonProperty("itemCodigoRegime")
  public Integer getItemCodigoRegime() {
    return itemCodigoRegime;
  }

  public void setItemCodigoRegime(Integer itemCodigoRegime) {
    this.itemCodigoRegime = itemCodigoRegime;
  }

  public DeclaracaoVinculada itemCodigoRegime(Integer itemCodigoRegime) {
    this.itemCodigoRegime = itemCodigoRegime;
    return this;
  }

 /**
   * Fundamento Aplicado ao Item da Declaração Vinculada&lt;br&gt;Dominio: Fundamentos legais existentes no sistema Tratamento Tributário&lt;br&gt;Observação:&lt;br&gt;Apenas quando a declaração vinculada for uma Duimp.
   * @return itemCodigoFundamento
  **/
  @JsonProperty("itemCodigoFundamento")
  public Integer getItemCodigoFundamento() {
    return itemCodigoFundamento;
  }

  public void setItemCodigoFundamento(Integer itemCodigoFundamento) {
    this.itemCodigoFundamento = itemCodigoFundamento;
  }

  public DeclaracaoVinculada itemCodigoFundamento(Integer itemCodigoFundamento) {
    this.itemCodigoFundamento = itemCodigoFundamento;
    return this;
  }

 /**
   * Código da NCM associada ao item da Declaração Vinculada.&lt;br&gt;Tamanho: 8&lt;br&gt;Formato: &#39;NNNNNNNN&#39;&lt;br&gt;Observação:&lt;br&gt;Apenas quando a declaração vinculada for uma Duimp.
   * @return itemNcmAssociada
  **/
  @JsonProperty("itemNcmAssociada")
  public String getItemNcmAssociada() {
    return itemNcmAssociada;
  }

  public void setItemNcmAssociada(String itemNcmAssociada) {
    this.itemNcmAssociada = itemNcmAssociada;
  }

  public DeclaracaoVinculada itemNcmAssociada(String itemNcmAssociada) {
    this.itemNcmAssociada = itemNcmAssociada;
    return this;
  }

 /**
   * Mnemonico do sistema de controle Associado ao Fundamento Aplicado ao Item da Declaração Vinculada.&lt;br&gt;Observação:&lt;br&gt;Apenas quando a declaração vinculada for uma Duimp.
   * @return mnemonicoSistemaControle
  **/
  @JsonProperty("mnemonicoSistemaControle")
  public String getMnemonicoSistemaControle() {
    if (mnemonicoSistemaControle == null) {
      return null;
    }
    return mnemonicoSistemaControle.value();
  }

  public void setMnemonicoSistemaControle(MnemonicoSistemaControleEnum mnemonicoSistemaControle) {
    this.mnemonicoSistemaControle = mnemonicoSistemaControle;
  }

  public DeclaracaoVinculada mnemonicoSistemaControle(MnemonicoSistemaControleEnum mnemonicoSistemaControle) {
    this.mnemonicoSistemaControle = mnemonicoSistemaControle;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeclaracaoVinculada {\n");
    
    sb.append("    tipo: ").append(toIndentedString(tipo)).append("\n");
    sb.append("    numero: ").append(toIndentedString(numero)).append("\n");
    sb.append("    versao: ").append(toIndentedString(versao)).append("\n");
    sb.append("    dataHoraRegistro: ").append(toIndentedString(dataHoraRegistro)).append("\n");
    sb.append("    numeroItem: ").append(toIndentedString(numeroItem)).append("\n");
    sb.append("    valorFreteMoedaDeclaracao: ").append(toIndentedString(valorFreteMoedaDeclaracao)).append("\n");
    sb.append("    valorSeguroMoedaDeclaracao: ").append(toIndentedString(valorSeguroMoedaDeclaracao)).append("\n");
    sb.append("    unidadeMedidaEstatistica: ").append(toIndentedString(unidadeMedidaEstatistica)).append("\n");
    sb.append("    qtdMercadoriaUnidadeEstatistica: ").append(toIndentedString(qtdMercadoriaUnidadeEstatistica)).append("\n");
    sb.append("    itemCodigoRegime: ").append(toIndentedString(itemCodigoRegime)).append("\n");
    sb.append("    itemCodigoFundamento: ").append(toIndentedString(itemCodigoFundamento)).append("\n");
    sb.append("    itemNcmAssociada: ").append(toIndentedString(itemNcmAssociada)).append("\n");
    sb.append("    mnemonicoSistemaControle: ").append(toIndentedString(mnemonicoSistemaControle)).append("\n");
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

