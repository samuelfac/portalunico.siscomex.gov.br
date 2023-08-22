package br.gov.siscomex.portalunico.duimp.model;

import br.gov.siscomex.portalunico.duimp.model.ComponenteDeFrete;
import br.gov.siscomex.portalunico.duimp.model.PasDoExportadorEstrangeiroObjetoCompostoPelosAtributosCdigoEDescrio;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
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
 @XmlType(name = "DadosDaCarga", propOrder =
    { "identificacaoCarga", "uaDeclarada", "ufDeclarada", "codRecintoLocalizacaoCarga", "uaDestinoFinal", "uaEntradaCarga", "ufEntradaCarga", "viaTransporte", "tipoConhecimento", "descTipoConhecimento", "paisProcedencia", "dataChegada", "pesoLiquido", "moedaFreteTotal", "valorFreteTotalMoedaUtiliza", "valorFreteTotalEmReal", "valorFreteTotalDolar", "componentesFrete", "valorAFRMMDevido", "valorAFRMMPago", "indicadorAFRMMQuitado", "moedaSeguro", "valorSeguroMoedaUtilizada", "valorSeguroEmReal", "valorSeguroDolar"
})

@XmlRootElement(name="DadosDaCarga")
public class DadosDaCarga  {
  
  @XmlElement(name="identificacaoCarga")
  @ApiModelProperty(example = "131905000719512", value = "Número de Identificação da Carga.<br>Tamanho: 15<br>Formato: NNNNNNNNNNNNNNN")
 /**
   * Número de Identificação da Carga.<br>Tamanho: 15<br>Formato: NNNNNNNNNNNNNNN
  **/
  private String identificacaoCarga = null;

  @XmlElement(name="uaDeclarada")
  @ApiModelProperty(example = "0717600", value = "Código da unidade de despacho declarada pelo importador no registro/retificação da Duimp<br>Tamanho: 7<br>Formato: 'NNNNNNN'")
 /**
   * Código da unidade de despacho declarada pelo importador no registro/retificação da Duimp<br>Tamanho: 7<br>Formato: 'NNNNNNN'
  **/
  private String uaDeclarada = null;

  @XmlElement(name="ufDeclarada")
  @ApiModelProperty(example = "RJ", value = "Unidade da federação correspondente à unidade de despacho declarada pelo importador no registro/retificação da Duimp<br>Dominio:<br>AC, AL, AP, AM, BA, CE, DF<br>ES, GO, MA, MT, MS, MG, PA<br>PB, PR, PE, PI, RJ, RN, RS<br>RO, RR, SC, SP, SE, TO<br>Tamanho: 2")
 /**
   * Unidade da federação correspondente à unidade de despacho declarada pelo importador no registro/retificação da Duimp<br>Dominio:<br>AC, AL, AP, AM, BA, CE, DF<br>ES, GO, MA, MT, MS, MG, PA<br>PB, PR, PE, PI, RJ, RN, RS<br>RO, RR, SC, SP, SE, TO<br>Tamanho: 2
  **/
  private String ufDeclarada = null;

  @XmlElement(name="codRecintoLocalizacaoCarga")
  @ApiModelProperty(example = "7912001", value = "Código do recinto alfandegado onde a mercadoria foi armazenada para verificação física<br>Tamanho: 7<br>Formato: 'NNNNNNN'")
 /**
   * Código do recinto alfandegado onde a mercadoria foi armazenada para verificação física<br>Tamanho: 7<br>Formato: 'NNNNNNN'
  **/
  private String codRecintoLocalizacaoCarga = null;

  @XmlElement(name="uaDestinoFinal")
  @ApiModelProperty(example = "0717600", value = "Código da unidade de destino final da carga<br>Tamanho: 7<br>Formato: 'NNNNNNN'")
 /**
   * Código da unidade de destino final da carga<br>Tamanho: 7<br>Formato: 'NNNNNNN'
  **/
  private String uaDestinoFinal = null;

  @XmlElement(name="uaEntradaCarga")
  @ApiModelProperty(example = "0717600", value = "Unidade da Receita Federal que jurisdiciona o local de entrada da mercadoria no País<br>Tamanho: 7<br>Formato: 'NNNNNNN'")
 /**
   * Unidade da Receita Federal que jurisdiciona o local de entrada da mercadoria no País<br>Tamanho: 7<br>Formato: 'NNNNNNN'
  **/
  private String uaEntradaCarga = null;

  @XmlElement(name="ufEntradaCarga")
  @ApiModelProperty(example = "RJ", value = "Unidade da federação de entrada da carga<br>Dominio:<br>AC, AL, AP, AM, BA, CE, DF<br>ES, GO, MA, MT, MS, MG, PA<br>PB, PR, PE, PI, RJ, RN, RS<br>RO, RR, SC, SP, SE, TO<br>Tamanho: 2")
 /**
   * Unidade da federação de entrada da carga<br>Dominio:<br>AC, AL, AP, AM, BA, CE, DF<br>ES, GO, MA, MT, MS, MG, PA<br>PB, PR, PE, PI, RJ, RN, RS<br>RO, RR, SC, SP, SE, TO<br>Tamanho: 2
  **/
  private String ufEntradaCarga = null;


@XmlType(name="ViaTransporteEnum")
@XmlEnum(String.class)
public enum ViaTransporteEnum {

	@XmlEnumValue("01")
	@JsonProperty("01")
	_01(String.valueOf("01"));


    private String value;

    ViaTransporteEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ViaTransporteEnum fromValue(String v) {
        for (ViaTransporteEnum b : ViaTransporteEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to ViaTransporteEnum");
    }
}

  @XmlElement(name="viaTransporte")
  @ApiModelProperty(example = "01", value = "Código da via utilizada no transporte internacional da carga<br>01 - Marítimo")
 /**
   * Código da via utilizada no transporte internacional da carga<br>01 - Marítimo
  **/
  private ViaTransporteEnum viaTransporte = null;


@XmlType(name="TipoConhecimentoEnum")
@XmlEnum(String.class)
public enum TipoConhecimentoEnum {

	@XmlEnumValue("10")
	@JsonProperty("10")
	_10(String.valueOf("10")),
	
	@XmlEnumValue("12")
	@JsonProperty("12")
	_12(String.valueOf("12"));


    private String value;

    TipoConhecimentoEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TipoConhecimentoEnum fromValue(String v) {
        for (TipoConhecimentoEnum b : TipoConhecimentoEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to TipoConhecimentoEnum");
    }
}

  @XmlElement(name="tipoConhecimento")
  @ApiModelProperty(example = "10", value = "Código do Tipo de conhecimento de transporte de carga.<br>Dominio: <br>10 - BL, <br>12 - HBL")
 /**
   * Código do Tipo de conhecimento de transporte de carga.<br>Dominio: <br>10 - BL, <br>12 - HBL
  **/
  private TipoConhecimentoEnum tipoConhecimento = null;

  @XmlElement(name="descTipoConhecimento")
  @ApiModelProperty(example = "BL", value = "Descrição do Tipo de conhecimento de transporte de carga")
 /**
   * Descrição do Tipo de conhecimento de transporte de carga
  **/
  private String descTipoConhecimento = null;

  @XmlElement(name="paisProcedencia")
  @ApiModelProperty(value = "")
  @Valid
  private PasDoExportadorEstrangeiroObjetoCompostoPelosAtributosCdigoEDescrio paisProcedencia = null;

  @XmlElement(name="dataChegada")
  @ApiModelProperty(value = "Data de Chegada da Carga na URF de Localização da Carga.<br>Formato: 'yyyy-MM-dd'")
 /**
   * Data de Chegada da Carga na URF de Localização da Carga.<br>Formato: 'yyyy-MM-dd'
  **/
  private OffsetDateTime dataChegada = null;

  @XmlElement(name="pesoLiquido")
  @ApiModelProperty(example = "1234567890123456", value = "Peso líquido em quilogramas correspondente ao quantitativo total das mercadorias do item.<br>Tamanho: 16,5<br>Formato: Decimal, com até 5 casas decimais separadas por ponto.")
  @Valid
 /**
   * Peso líquido em quilogramas correspondente ao quantitativo total das mercadorias do item.<br>Tamanho: 16,5<br>Formato: Decimal, com até 5 casas decimais separadas por ponto.
  **/
  private BigDecimal pesoLiquido = null;

  @XmlElement(name="moedaFreteTotal")
  @ApiModelProperty(example = "220", value = "Código da moeda do Valor total do Frete<br> Domínio: Tabela de Moedas do Siscomex.<br>Tamanho: 3<br>Formato: 'NNN'")
 /**
   * Código da moeda do Valor total do Frete<br> Domínio: Tabela de Moedas do Siscomex.<br>Tamanho: 3<br>Formato: 'NNN'
  **/
  private Integer moedaFreteTotal = null;

  @XmlElement(name="valorFreteTotalMoedaUtiliza")
  @ApiModelProperty(example = "10.12", value = "Valor total do frete na moeda utilizada<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.<br>Observação:<br>Para as Duimp registradas a partir de 08/06/2022, o valor do frete utilizado no cálculo do valor aduaneiro não inclui os gastos relativos à carga, à descarga e ao manuseio incorridos no território nacional e destacados do custo de transporte")
  @Valid
 /**
   * Valor total do frete na moeda utilizada<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.<br>Observação:<br>Para as Duimp registradas a partir de 08/06/2022, o valor do frete utilizado no cálculo do valor aduaneiro não inclui os gastos relativos à carga, à descarga e ao manuseio incorridos no território nacional e destacados do custo de transporte
  **/
  private BigDecimal valorFreteTotalMoedaUtiliza = null;

  @XmlElement(name="valorFreteTotalEmReal")
  @ApiModelProperty(example = "40.48", value = "Valor total do frete em R$ (Reais)<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.<br>Observação:<br>Para as Duimp registradas a partir de 08/06/2022, o valor do frete utilizado no cálculo do valor aduaneiro não inclui os gastos relativos à carga, à descarga e ao manuseio incorridos no território nacional e destacados do custo de transporte")
  @Valid
 /**
   * Valor total do frete em R$ (Reais)<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.<br>Observação:<br>Para as Duimp registradas a partir de 08/06/2022, o valor do frete utilizado no cálculo do valor aduaneiro não inclui os gastos relativos à carga, à descarga e ao manuseio incorridos no território nacional e destacados do custo de transporte
  **/
  private BigDecimal valorFreteTotalEmReal = null;

  @XmlElement(name="valorFreteTotalDolar")
  @ApiModelProperty(example = "40.48", value = "Valor total do frete em Dólares<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.<br>Observação:<br>Para as Duimp registradas a partir de 08/06/2022, o valor do frete utilizado no cálculo do valor aduaneiro não inclui os gastos relativos à carga, à descarga e ao manuseio incorridos no território nacional e destacados do custo de transporte")
  @Valid
 /**
   * Valor total do frete em Dólares<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.<br>Observação:<br>Para as Duimp registradas a partir de 08/06/2022, o valor do frete utilizado no cálculo do valor aduaneiro não inclui os gastos relativos à carga, à descarga e ao manuseio incorridos no território nacional e destacados do custo de transporte
  **/
  private BigDecimal valorFreteTotalDolar = null;

  @XmlElement(name="componentesFrete")
  @ApiModelProperty(value = "Lista de Componentes do Frete")
  @Valid
 /**
   * Lista de Componentes do Frete
  **/
  private List<ComponenteDeFrete> componentesFrete = null;

  @XmlElement(name="valorAFRMMDevido")
  @ApiModelProperty(example = "20.12", value = "Valor Devido do AFRMM e da TUM em R$ (Reais)<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.")
  @Valid
 /**
   * Valor Devido do AFRMM e da TUM em R$ (Reais)<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.
  **/
  private BigDecimal valorAFRMMDevido = null;

  @XmlElement(name="valorAFRMMPago")
  @ApiModelProperty(example = "80.48", value = "Valor Pago do AFRMM e da TUM em R$ (Reais)<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.")
  @Valid
 /**
   * Valor Pago do AFRMM e da TUM em R$ (Reais)<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.
  **/
  private BigDecimal valorAFRMMPago = null;


@XmlType(name="IndicadorAFRMMQuitadoEnum")
@XmlEnum(Integer.class)
public enum IndicadorAFRMMQuitadoEnum {

	@XmlEnumValue("1")
	@JsonProperty("1")
	NUMBER_1(Integer.valueOf(1)),
	
	@XmlEnumValue("2")
	@JsonProperty("2")
	NUMBER_2(Integer.valueOf(2));


    private Integer value;

    IndicadorAFRMMQuitadoEnum (Integer v) {
        value = v;
    }

    public Integer value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static IndicadorAFRMMQuitadoEnum fromValue(String v) {
        for (IndicadorAFRMMQuitadoEnum b : IndicadorAFRMMQuitadoEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to IndicadorAFRMMQuitadoEnum");
    }
}

  @XmlElement(name="indicadorAFRMMQuitado")
  @ApiModelProperty(example = "1", value = "Indica se o AFRMM encontra-se quitado ou exonerado.<br>Dominio: <br>1 - Sim,<br>2 - Não")
 /**
   * Indica se o AFRMM encontra-se quitado ou exonerado.<br>Dominio: <br>1 - Sim,<br>2 - Não
  **/
  private IndicadorAFRMMQuitadoEnum indicadorAFRMMQuitado = null;

  @XmlElement(name="moedaSeguro")
  @ApiModelProperty(example = "220", value = "Código da moeda negociada do seguro<br> Domínio: Tabela de Moedas do Siscomex.<br>Tamanho: 3<br>Formato: 'NNN'")
 /**
   * Código da moeda negociada do seguro<br> Domínio: Tabela de Moedas do Siscomex.<br>Tamanho: 3<br>Formato: 'NNN'
  **/
  private Integer moedaSeguro = null;

  @XmlElement(name="valorSeguroMoedaUtilizada")
  @ApiModelProperty(example = "30.12", value = "Valor do seguro na moeda negociada<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.")
  @Valid
 /**
   * Valor do seguro na moeda negociada<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.
  **/
  private BigDecimal valorSeguroMoedaUtilizada = null;

  @XmlElement(name="valorSeguroEmReal")
  @ApiModelProperty(example = "120.48", value = "Valor do seguro em R$ (Reais)<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.")
  @Valid
 /**
   * Valor do seguro em R$ (Reais)<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.
  **/
  private BigDecimal valorSeguroEmReal = null;

  @XmlElement(name="valorSeguroDolar")
  @ApiModelProperty(example = "120.48", value = "Valor do seguro em Dólares<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.")
  @Valid
 /**
   * Valor do seguro em Dólares<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.
  **/
  private BigDecimal valorSeguroDolar = null;
 /**
   * Número de Identificação da Carga.&lt;br&gt;Tamanho: 15&lt;br&gt;Formato: NNNNNNNNNNNNNNN
   * @return identificacaoCarga
  **/
  @JsonProperty("identificacaoCarga")
  public String getIdentificacaoCarga() {
    return identificacaoCarga;
  }

  public void setIdentificacaoCarga(String identificacaoCarga) {
    this.identificacaoCarga = identificacaoCarga;
  }

  public DadosDaCarga identificacaoCarga(String identificacaoCarga) {
    this.identificacaoCarga = identificacaoCarga;
    return this;
  }

 /**
   * Código da unidade de despacho declarada pelo importador no registro/retificação da Duimp&lt;br&gt;Tamanho: 7&lt;br&gt;Formato: &#39;NNNNNNN&#39;
   * @return uaDeclarada
  **/
  @JsonProperty("uaDeclarada")
  public String getUaDeclarada() {
    return uaDeclarada;
  }

  public void setUaDeclarada(String uaDeclarada) {
    this.uaDeclarada = uaDeclarada;
  }

  public DadosDaCarga uaDeclarada(String uaDeclarada) {
    this.uaDeclarada = uaDeclarada;
    return this;
  }

 /**
   * Unidade da federação correspondente à unidade de despacho declarada pelo importador no registro/retificação da Duimp&lt;br&gt;Dominio:&lt;br&gt;AC, AL, AP, AM, BA, CE, DF&lt;br&gt;ES, GO, MA, MT, MS, MG, PA&lt;br&gt;PB, PR, PE, PI, RJ, RN, RS&lt;br&gt;RO, RR, SC, SP, SE, TO&lt;br&gt;Tamanho: 2
   * @return ufDeclarada
  **/
  @JsonProperty("ufDeclarada")
  public String getUfDeclarada() {
    return ufDeclarada;
  }

  public void setUfDeclarada(String ufDeclarada) {
    this.ufDeclarada = ufDeclarada;
  }

  public DadosDaCarga ufDeclarada(String ufDeclarada) {
    this.ufDeclarada = ufDeclarada;
    return this;
  }

 /**
   * Código do recinto alfandegado onde a mercadoria foi armazenada para verificação física&lt;br&gt;Tamanho: 7&lt;br&gt;Formato: &#39;NNNNNNN&#39;
   * @return codRecintoLocalizacaoCarga
  **/
  @JsonProperty("codRecintoLocalizacaoCarga")
  public String getCodRecintoLocalizacaoCarga() {
    return codRecintoLocalizacaoCarga;
  }

  public void setCodRecintoLocalizacaoCarga(String codRecintoLocalizacaoCarga) {
    this.codRecintoLocalizacaoCarga = codRecintoLocalizacaoCarga;
  }

  public DadosDaCarga codRecintoLocalizacaoCarga(String codRecintoLocalizacaoCarga) {
    this.codRecintoLocalizacaoCarga = codRecintoLocalizacaoCarga;
    return this;
  }

 /**
   * Código da unidade de destino final da carga&lt;br&gt;Tamanho: 7&lt;br&gt;Formato: &#39;NNNNNNN&#39;
   * @return uaDestinoFinal
  **/
  @JsonProperty("uaDestinoFinal")
  public String getUaDestinoFinal() {
    return uaDestinoFinal;
  }

  public void setUaDestinoFinal(String uaDestinoFinal) {
    this.uaDestinoFinal = uaDestinoFinal;
  }

  public DadosDaCarga uaDestinoFinal(String uaDestinoFinal) {
    this.uaDestinoFinal = uaDestinoFinal;
    return this;
  }

 /**
   * Unidade da Receita Federal que jurisdiciona o local de entrada da mercadoria no País&lt;br&gt;Tamanho: 7&lt;br&gt;Formato: &#39;NNNNNNN&#39;
   * @return uaEntradaCarga
  **/
  @JsonProperty("uaEntradaCarga")
  public String getUaEntradaCarga() {
    return uaEntradaCarga;
  }

  public void setUaEntradaCarga(String uaEntradaCarga) {
    this.uaEntradaCarga = uaEntradaCarga;
  }

  public DadosDaCarga uaEntradaCarga(String uaEntradaCarga) {
    this.uaEntradaCarga = uaEntradaCarga;
    return this;
  }

 /**
   * Unidade da federação de entrada da carga&lt;br&gt;Dominio:&lt;br&gt;AC, AL, AP, AM, BA, CE, DF&lt;br&gt;ES, GO, MA, MT, MS, MG, PA&lt;br&gt;PB, PR, PE, PI, RJ, RN, RS&lt;br&gt;RO, RR, SC, SP, SE, TO&lt;br&gt;Tamanho: 2
   * @return ufEntradaCarga
  **/
  @JsonProperty("ufEntradaCarga")
  public String getUfEntradaCarga() {
    return ufEntradaCarga;
  }

  public void setUfEntradaCarga(String ufEntradaCarga) {
    this.ufEntradaCarga = ufEntradaCarga;
  }

  public DadosDaCarga ufEntradaCarga(String ufEntradaCarga) {
    this.ufEntradaCarga = ufEntradaCarga;
    return this;
  }

 /**
   * Código da via utilizada no transporte internacional da carga&lt;br&gt;01 - Marítimo
   * @return viaTransporte
  **/
  @JsonProperty("viaTransporte")
  public String getViaTransporte() {
    if (viaTransporte == null) {
      return null;
    }
    return viaTransporte.value();
  }

  public void setViaTransporte(ViaTransporteEnum viaTransporte) {
    this.viaTransporte = viaTransporte;
  }

  public DadosDaCarga viaTransporte(ViaTransporteEnum viaTransporte) {
    this.viaTransporte = viaTransporte;
    return this;
  }

 /**
   * Código do Tipo de conhecimento de transporte de carga.&lt;br&gt;Dominio: &lt;br&gt;10 - BL, &lt;br&gt;12 - HBL
   * @return tipoConhecimento
  **/
  @JsonProperty("tipoConhecimento")
  public String getTipoConhecimento() {
    if (tipoConhecimento == null) {
      return null;
    }
    return tipoConhecimento.value();
  }

  public void setTipoConhecimento(TipoConhecimentoEnum tipoConhecimento) {
    this.tipoConhecimento = tipoConhecimento;
  }

  public DadosDaCarga tipoConhecimento(TipoConhecimentoEnum tipoConhecimento) {
    this.tipoConhecimento = tipoConhecimento;
    return this;
  }

 /**
   * Descrição do Tipo de conhecimento de transporte de carga
   * @return descTipoConhecimento
  **/
  @JsonProperty("descTipoConhecimento")
  public String getDescTipoConhecimento() {
    return descTipoConhecimento;
  }

  public void setDescTipoConhecimento(String descTipoConhecimento) {
    this.descTipoConhecimento = descTipoConhecimento;
  }

  public DadosDaCarga descTipoConhecimento(String descTipoConhecimento) {
    this.descTipoConhecimento = descTipoConhecimento;
    return this;
  }

 /**
   * Get paisProcedencia
   * @return paisProcedencia
  **/
  @JsonProperty("paisProcedencia")
  public PasDoExportadorEstrangeiroObjetoCompostoPelosAtributosCdigoEDescrio getPaisProcedencia() {
    return paisProcedencia;
  }

  public void setPaisProcedencia(PasDoExportadorEstrangeiroObjetoCompostoPelosAtributosCdigoEDescrio paisProcedencia) {
    this.paisProcedencia = paisProcedencia;
  }

  public DadosDaCarga paisProcedencia(PasDoExportadorEstrangeiroObjetoCompostoPelosAtributosCdigoEDescrio paisProcedencia) {
    this.paisProcedencia = paisProcedencia;
    return this;
  }

 /**
   * Data de Chegada da Carga na URF de Localização da Carga.&lt;br&gt;Formato: &#39;yyyy-MM-dd&#39;
   * @return dataChegada
  **/
  @JsonProperty("dataChegada")
  public OffsetDateTime getDataChegada() {
    return dataChegada;
  }

  public void setDataChegada(OffsetDateTime dataChegada) {
    this.dataChegada = dataChegada;
  }

  public DadosDaCarga dataChegada(OffsetDateTime dataChegada) {
    this.dataChegada = dataChegada;
    return this;
  }

 /**
   * Peso líquido em quilogramas correspondente ao quantitativo total das mercadorias do item.&lt;br&gt;Tamanho: 16,5&lt;br&gt;Formato: Decimal, com até 5 casas decimais separadas por ponto.
   * @return pesoLiquido
  **/
  @JsonProperty("pesoLiquido")
  public BigDecimal getPesoLiquido() {
    return pesoLiquido;
  }

  public void setPesoLiquido(BigDecimal pesoLiquido) {
    this.pesoLiquido = pesoLiquido;
  }

  public DadosDaCarga pesoLiquido(BigDecimal pesoLiquido) {
    this.pesoLiquido = pesoLiquido;
    return this;
  }

 /**
   * Código da moeda do Valor total do Frete&lt;br&gt; Domínio: Tabela de Moedas do Siscomex.&lt;br&gt;Tamanho: 3&lt;br&gt;Formato: &#39;NNN&#39;
   * @return moedaFreteTotal
  **/
  @JsonProperty("moedaFreteTotal")
  public Integer getMoedaFreteTotal() {
    return moedaFreteTotal;
  }

  public void setMoedaFreteTotal(Integer moedaFreteTotal) {
    this.moedaFreteTotal = moedaFreteTotal;
  }

  public DadosDaCarga moedaFreteTotal(Integer moedaFreteTotal) {
    this.moedaFreteTotal = moedaFreteTotal;
    return this;
  }

 /**
   * Valor total do frete na moeda utilizada&lt;br&gt;Tamanho: 16,7&lt;br&gt;Formato: Decimal, com até 7 casas decimais separadas por ponto.&lt;br&gt;Observação:&lt;br&gt;Para as Duimp registradas a partir de 08/06/2022, o valor do frete utilizado no cálculo do valor aduaneiro não inclui os gastos relativos à carga, à descarga e ao manuseio incorridos no território nacional e destacados do custo de transporte
   * @return valorFreteTotalMoedaUtiliza
  **/
  @JsonProperty("valorFreteTotalMoedaUtiliza")
  public BigDecimal getValorFreteTotalMoedaUtiliza() {
    return valorFreteTotalMoedaUtiliza;
  }

  public void setValorFreteTotalMoedaUtiliza(BigDecimal valorFreteTotalMoedaUtiliza) {
    this.valorFreteTotalMoedaUtiliza = valorFreteTotalMoedaUtiliza;
  }

  public DadosDaCarga valorFreteTotalMoedaUtiliza(BigDecimal valorFreteTotalMoedaUtiliza) {
    this.valorFreteTotalMoedaUtiliza = valorFreteTotalMoedaUtiliza;
    return this;
  }

 /**
   * Valor total do frete em R$ (Reais)&lt;br&gt;Tamanho: 16,7&lt;br&gt;Formato: Decimal, com até 7 casas decimais separadas por ponto.&lt;br&gt;Observação:&lt;br&gt;Para as Duimp registradas a partir de 08/06/2022, o valor do frete utilizado no cálculo do valor aduaneiro não inclui os gastos relativos à carga, à descarga e ao manuseio incorridos no território nacional e destacados do custo de transporte
   * @return valorFreteTotalEmReal
  **/
  @JsonProperty("valorFreteTotalEmReal")
  public BigDecimal getValorFreteTotalEmReal() {
    return valorFreteTotalEmReal;
  }

  public void setValorFreteTotalEmReal(BigDecimal valorFreteTotalEmReal) {
    this.valorFreteTotalEmReal = valorFreteTotalEmReal;
  }

  public DadosDaCarga valorFreteTotalEmReal(BigDecimal valorFreteTotalEmReal) {
    this.valorFreteTotalEmReal = valorFreteTotalEmReal;
    return this;
  }

 /**
   * Valor total do frete em Dólares&lt;br&gt;Tamanho: 16,7&lt;br&gt;Formato: Decimal, com até 7 casas decimais separadas por ponto.&lt;br&gt;Observação:&lt;br&gt;Para as Duimp registradas a partir de 08/06/2022, o valor do frete utilizado no cálculo do valor aduaneiro não inclui os gastos relativos à carga, à descarga e ao manuseio incorridos no território nacional e destacados do custo de transporte
   * @return valorFreteTotalDolar
  **/
  @JsonProperty("valorFreteTotalDolar")
  public BigDecimal getValorFreteTotalDolar() {
    return valorFreteTotalDolar;
  }

  public void setValorFreteTotalDolar(BigDecimal valorFreteTotalDolar) {
    this.valorFreteTotalDolar = valorFreteTotalDolar;
  }

  public DadosDaCarga valorFreteTotalDolar(BigDecimal valorFreteTotalDolar) {
    this.valorFreteTotalDolar = valorFreteTotalDolar;
    return this;
  }

 /**
   * Lista de Componentes do Frete
   * @return componentesFrete
  **/
  @JsonProperty("componentesFrete")
  public List<ComponenteDeFrete> getComponentesFrete() {
    return componentesFrete;
  }

  public void setComponentesFrete(List<ComponenteDeFrete> componentesFrete) {
    this.componentesFrete = componentesFrete;
  }

  public DadosDaCarga componentesFrete(List<ComponenteDeFrete> componentesFrete) {
    this.componentesFrete = componentesFrete;
    return this;
  }

  public DadosDaCarga addComponentesFreteItem(ComponenteDeFrete componentesFreteItem) {
    this.componentesFrete.add(componentesFreteItem);
    return this;
  }

 /**
   * Valor Devido do AFRMM e da TUM em R$ (Reais)&lt;br&gt;Tamanho: 16,7&lt;br&gt;Formato: Decimal, com até 7 casas decimais separadas por ponto.
   * @return valorAFRMMDevido
  **/
  @JsonProperty("valorAFRMMDevido")
  public BigDecimal getValorAFRMMDevido() {
    return valorAFRMMDevido;
  }

  public void setValorAFRMMDevido(BigDecimal valorAFRMMDevido) {
    this.valorAFRMMDevido = valorAFRMMDevido;
  }

  public DadosDaCarga valorAFRMMDevido(BigDecimal valorAFRMMDevido) {
    this.valorAFRMMDevido = valorAFRMMDevido;
    return this;
  }

 /**
   * Valor Pago do AFRMM e da TUM em R$ (Reais)&lt;br&gt;Tamanho: 16,7&lt;br&gt;Formato: Decimal, com até 7 casas decimais separadas por ponto.
   * @return valorAFRMMPago
  **/
  @JsonProperty("valorAFRMMPago")
  public BigDecimal getValorAFRMMPago() {
    return valorAFRMMPago;
  }

  public void setValorAFRMMPago(BigDecimal valorAFRMMPago) {
    this.valorAFRMMPago = valorAFRMMPago;
  }

  public DadosDaCarga valorAFRMMPago(BigDecimal valorAFRMMPago) {
    this.valorAFRMMPago = valorAFRMMPago;
    return this;
  }

 /**
   * Indica se o AFRMM encontra-se quitado ou exonerado.&lt;br&gt;Dominio: &lt;br&gt;1 - Sim,&lt;br&gt;2 - Não
   * @return indicadorAFRMMQuitado
  **/
  @JsonProperty("indicadorAFRMMQuitado")
  public Integer getIndicadorAFRMMQuitado() {
    if (indicadorAFRMMQuitado == null) {
      return null;
    }
    return indicadorAFRMMQuitado.value();
  }

  public void setIndicadorAFRMMQuitado(IndicadorAFRMMQuitadoEnum indicadorAFRMMQuitado) {
    this.indicadorAFRMMQuitado = indicadorAFRMMQuitado;
  }

  public DadosDaCarga indicadorAFRMMQuitado(IndicadorAFRMMQuitadoEnum indicadorAFRMMQuitado) {
    this.indicadorAFRMMQuitado = indicadorAFRMMQuitado;
    return this;
  }

 /**
   * Código da moeda negociada do seguro&lt;br&gt; Domínio: Tabela de Moedas do Siscomex.&lt;br&gt;Tamanho: 3&lt;br&gt;Formato: &#39;NNN&#39;
   * @return moedaSeguro
  **/
  @JsonProperty("moedaSeguro")
  public Integer getMoedaSeguro() {
    return moedaSeguro;
  }

  public void setMoedaSeguro(Integer moedaSeguro) {
    this.moedaSeguro = moedaSeguro;
  }

  public DadosDaCarga moedaSeguro(Integer moedaSeguro) {
    this.moedaSeguro = moedaSeguro;
    return this;
  }

 /**
   * Valor do seguro na moeda negociada&lt;br&gt;Tamanho: 16,7&lt;br&gt;Formato: Decimal, com até 7 casas decimais separadas por ponto.
   * @return valorSeguroMoedaUtilizada
  **/
  @JsonProperty("valorSeguroMoedaUtilizada")
  public BigDecimal getValorSeguroMoedaUtilizada() {
    return valorSeguroMoedaUtilizada;
  }

  public void setValorSeguroMoedaUtilizada(BigDecimal valorSeguroMoedaUtilizada) {
    this.valorSeguroMoedaUtilizada = valorSeguroMoedaUtilizada;
  }

  public DadosDaCarga valorSeguroMoedaUtilizada(BigDecimal valorSeguroMoedaUtilizada) {
    this.valorSeguroMoedaUtilizada = valorSeguroMoedaUtilizada;
    return this;
  }

 /**
   * Valor do seguro em R$ (Reais)&lt;br&gt;Tamanho: 16,7&lt;br&gt;Formato: Decimal, com até 7 casas decimais separadas por ponto.
   * @return valorSeguroEmReal
  **/
  @JsonProperty("valorSeguroEmReal")
  public BigDecimal getValorSeguroEmReal() {
    return valorSeguroEmReal;
  }

  public void setValorSeguroEmReal(BigDecimal valorSeguroEmReal) {
    this.valorSeguroEmReal = valorSeguroEmReal;
  }

  public DadosDaCarga valorSeguroEmReal(BigDecimal valorSeguroEmReal) {
    this.valorSeguroEmReal = valorSeguroEmReal;
    return this;
  }

 /**
   * Valor do seguro em Dólares&lt;br&gt;Tamanho: 16,7&lt;br&gt;Formato: Decimal, com até 7 casas decimais separadas por ponto.
   * @return valorSeguroDolar
  **/
  @JsonProperty("valorSeguroDolar")
  public BigDecimal getValorSeguroDolar() {
    return valorSeguroDolar;
  }

  public void setValorSeguroDolar(BigDecimal valorSeguroDolar) {
    this.valorSeguroDolar = valorSeguroDolar;
  }

  public DadosDaCarga valorSeguroDolar(BigDecimal valorSeguroDolar) {
    this.valorSeguroDolar = valorSeguroDolar;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DadosDaCarga {\n");
    
    sb.append("    identificacaoCarga: ").append(toIndentedString(identificacaoCarga)).append("\n");
    sb.append("    uaDeclarada: ").append(toIndentedString(uaDeclarada)).append("\n");
    sb.append("    ufDeclarada: ").append(toIndentedString(ufDeclarada)).append("\n");
    sb.append("    codRecintoLocalizacaoCarga: ").append(toIndentedString(codRecintoLocalizacaoCarga)).append("\n");
    sb.append("    uaDestinoFinal: ").append(toIndentedString(uaDestinoFinal)).append("\n");
    sb.append("    uaEntradaCarga: ").append(toIndentedString(uaEntradaCarga)).append("\n");
    sb.append("    ufEntradaCarga: ").append(toIndentedString(ufEntradaCarga)).append("\n");
    sb.append("    viaTransporte: ").append(toIndentedString(viaTransporte)).append("\n");
    sb.append("    tipoConhecimento: ").append(toIndentedString(tipoConhecimento)).append("\n");
    sb.append("    descTipoConhecimento: ").append(toIndentedString(descTipoConhecimento)).append("\n");
    sb.append("    paisProcedencia: ").append(toIndentedString(paisProcedencia)).append("\n");
    sb.append("    dataChegada: ").append(toIndentedString(dataChegada)).append("\n");
    sb.append("    pesoLiquido: ").append(toIndentedString(pesoLiquido)).append("\n");
    sb.append("    moedaFreteTotal: ").append(toIndentedString(moedaFreteTotal)).append("\n");
    sb.append("    valorFreteTotalMoedaUtiliza: ").append(toIndentedString(valorFreteTotalMoedaUtiliza)).append("\n");
    sb.append("    valorFreteTotalEmReal: ").append(toIndentedString(valorFreteTotalEmReal)).append("\n");
    sb.append("    valorFreteTotalDolar: ").append(toIndentedString(valorFreteTotalDolar)).append("\n");
    sb.append("    componentesFrete: ").append(toIndentedString(componentesFrete)).append("\n");
    sb.append("    valorAFRMMDevido: ").append(toIndentedString(valorAFRMMDevido)).append("\n");
    sb.append("    valorAFRMMPago: ").append(toIndentedString(valorAFRMMPago)).append("\n");
    sb.append("    indicadorAFRMMQuitado: ").append(toIndentedString(indicadorAFRMMQuitado)).append("\n");
    sb.append("    moedaSeguro: ").append(toIndentedString(moedaSeguro)).append("\n");
    sb.append("    valorSeguroMoedaUtilizada: ").append(toIndentedString(valorSeguroMoedaUtilizada)).append("\n");
    sb.append("    valorSeguroEmReal: ").append(toIndentedString(valorSeguroEmReal)).append("\n");
    sb.append("    valorSeguroDolar: ").append(toIndentedString(valorSeguroDolar)).append("\n");
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

