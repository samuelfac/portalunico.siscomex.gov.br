package br.gov.siscomex.portalunico.duimp.model;

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
import java.time.OffsetDateTime;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DadosDaCarga", propOrder =
        {"tipoIdentificacaoCarga", "identificacaoCarga", "uaDeclarada", "ufDeclarada", "recintosLocalizacaoCarga", "uaDestinoFinal", "uaEntradaCarga", "ufEntradaCarga", "viaTransporte", "dataChegada", "paisProcedencia", "pesoLiquido", "moedaFreteTotal", "valorFreteTotalMoedaUtiliza", "valorFreteTotalEmReal", "valorFreteTotalDolar", "valorFreteTotalDestinoEmReal", "valorFreteTotalDestinoDolar", "moedaSeguro", "valorSeguroMoedaUtilizada", "valorSeguroEmReal", "valorSeguroDolar", "dadosCargaAquaviaria", "dadosCargaAerea"
        })

@XmlRootElement(name = "DadosDaCarga")
public class DadosDaCarga {


    @XmlType(name = "TipoIdentificacaoCargaEnum")
    @XmlEnum(String.class)
    public enum TipoIdentificacaoCargaEnum {

        @XmlEnumValue("CE")
        @JsonProperty("CE")
        CE("CE"),

        @XmlEnumValue("RUC")
        @JsonProperty("RUC")
        RUC("RUC");


        private final String value;

        TipoIdentificacaoCargaEnum(String v) {
            value = v;
        }

        public String value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static TipoIdentificacaoCargaEnum fromValue(String v) {
            for (TipoIdentificacaoCargaEnum b : TipoIdentificacaoCargaEnum.values()) {
                if (String.valueOf(b.value).equals(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "' to TipoIdentificacaoCargaEnum");
        }
    }

    @XmlElement(name = "tipoIdentificacaoCarga")
    @ApiModelProperty(example = "CE", value = "Tipo de identificação da carga")
    /**
     * Tipo de identificação da carga
     **/
    private TipoIdentificacaoCargaEnum tipoIdentificacaoCarga = null;

    @XmlElement(name = "identificacaoCarga")
    @ApiModelProperty(example = "131905000719512", value = "Número de Identificação da Carga.<br>Quando tipo de identificação da carga for CE: <br> - Tamanho: 15 <br> - Formato: NNNNNNNNNNNNNNN<br>Quando tipo de identificação da carga for RUC: <br> - Tamanho mínimo: 1<br> - Tamanho máximo: 32")
    /**
     * Número de Identificação da Carga.<br>Quando tipo de identificação da carga for CE: <br> - Tamanho: 15 <br> - Formato: NNNNNNNNNNNNNNN<br>Quando tipo de identificação da carga for RUC: <br> - Tamanho mínimo: 1<br> - Tamanho máximo: 32
     **/
    private String identificacaoCarga = null;

    @XmlElement(name = "uaDeclarada")
    @ApiModelProperty(example = "0717600", value = "Código da unidade de despacho declarada pelo importador no registro/retificação da Duimp<br>Tamanho: 7<br>Formato: 'NNNNNNN'")
    /**
     * Código da unidade de despacho declarada pelo importador no registro/retificação da Duimp<br>Tamanho: 7<br>Formato: 'NNNNNNN'
     **/
    private String uaDeclarada = null;

    @XmlElement(name = "ufDeclarada")
    @ApiModelProperty(example = "RJ", value = "Unidade da federação correspondente à unidade de despacho declarada pelo importador no registro/retificação da Duimp<br>Dominio:<br>AC, AL, AP, AM, BA, CE, DF<br>ES, GO, MA, MT, MS, MG, PA<br>PB, PR, PE, PI, RJ, RN, RS<br>RO, RR, SC, SP, SE, TO<br>Tamanho: 2")
    /**
     * Unidade da federação correspondente à unidade de despacho declarada pelo importador no registro/retificação da Duimp<br>Dominio:<br>AC, AL, AP, AM, BA, CE, DF<br>ES, GO, MA, MT, MS, MG, PA<br>PB, PR, PE, PI, RJ, RN, RS<br>RO, RR, SC, SP, SE, TO<br>Tamanho: 2
     **/
    private String ufDeclarada = null;

    @XmlElement(name = "recintosLocalizacaoCarga")
    @ApiModelProperty(example = "[7912001]", value = "Lista de códigos de recinto alfandegado onde a mercadoria foi armazenada para verificação física. <br>Cada elemento é representado da seguinte forma:<br>Tamanho: 7<br>Formato: 'NNNNNNN'")
    /**
     * Lista de códigos de recinto alfandegado onde a mercadoria foi armazenada para verificação física. <br>Cada elemento é representado da seguinte forma:<br>Tamanho: 7<br>Formato: 'NNNNNNN'
     **/
    private List<String> recintosLocalizacaoCarga = null;

    @XmlElement(name = "uaDestinoFinal")
    @ApiModelProperty(example = "0717600", value = "Código da unidade de destino final da carga<br>Tamanho: 7<br>Formato: 'NNNNNNN'")
    /**
     * Código da unidade de destino final da carga<br>Tamanho: 7<br>Formato: 'NNNNNNN'
     **/
    private String uaDestinoFinal = null;

    @XmlElement(name = "uaEntradaCarga")
    @ApiModelProperty(example = "0717600", value = "Unidade da Receita Federal que jurisdiciona o local de entrada da mercadoria no País<br>Tamanho: 7<br>Formato: 'NNNNNNN'")
    /**
     * Unidade da Receita Federal que jurisdiciona o local de entrada da mercadoria no País<br>Tamanho: 7<br>Formato: 'NNNNNNN'
     **/
    private String uaEntradaCarga = null;

    @XmlElement(name = "ufEntradaCarga")
    @ApiModelProperty(example = "RJ", value = "Unidade da federação de entrada da carga<br>Dominio:<br>AC, AL, AP, AM, BA, CE, DF<br>ES, GO, MA, MT, MS, MG, PA<br>PB, PR, PE, PI, RJ, RN, RS<br>RO, RR, SC, SP, SE, TO<br>Tamanho: 2")
    /**
     * Unidade da federação de entrada da carga<br>Dominio:<br>AC, AL, AP, AM, BA, CE, DF<br>ES, GO, MA, MT, MS, MG, PA<br>PB, PR, PE, PI, RJ, RN, RS<br>RO, RR, SC, SP, SE, TO<br>Tamanho: 2
     **/
    private String ufEntradaCarga = null;


    @XmlType(name = "ViaTransporteEnum")
    @XmlEnum(String.class)
    public enum ViaTransporteEnum {

        @XmlEnumValue("MARITMO")
        @JsonProperty("MARITMO")
        MARITMO("MARITMO"),

        @XmlEnumValue("AEREA")
        @JsonProperty("AEREA")
        AEREA("AEREA");


        private final String value;

        ViaTransporteEnum(String v) {
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

    @XmlElement(name = "viaTransporte")
    @ApiModelProperty(example = "MARITMO", value = "Via utilizada no transporte internacional da carga")
    /**
     * Via utilizada no transporte internacional da carga
     **/
    private ViaTransporteEnum viaTransporte = null;

    @XmlElement(name = "dataChegada")
    @ApiModelProperty(value = "Data de Chegada da Carga na URF de Localização da Carga.<br>Formato: 'yyyy-MM-dd'")
    /**
     * Data de Chegada da Carga na URF de Localização da Carga.<br>Formato: 'yyyy-MM-dd'
     **/
    private OffsetDateTime dataChegada = null;

    @XmlElement(name = "paisProcedencia")
    @ApiModelProperty(value = "")
    @Valid
    private PasDoExportadorEstrangeiroObjetoCompostoPelosAtributosCdigoEDescrio paisProcedencia = null;

    @XmlElement(name = "pesoLiquido")
    @ApiModelProperty(example = "1234567890123456", value = "Peso líquido em quilogramas correspondente ao quantitativo total das mercadorias do item.<br>Tamanho: 16,5<br>Formato: Decimal, com até 5 casas decimais separadas por ponto.")
    @Valid
    /**
     * Peso líquido em quilogramas correspondente ao quantitativo total das mercadorias do item.<br>Tamanho: 16,5<br>Formato: Decimal, com até 5 casas decimais separadas por ponto.
     **/
    private BigDecimal pesoLiquido = null;

    @XmlElement(name = "moedaFreteTotal")
    @ApiModelProperty(example = "220", value = "Código da moeda do Valor total do Frete<br> Domínio: Tabela de Moedas do Siscomex.<br>Tamanho: 3<br>Formato: 'NNN'")
    /**
     * Código da moeda do Valor total do Frete<br> Domínio: Tabela de Moedas do Siscomex.<br>Tamanho: 3<br>Formato: 'NNN'
     **/
    private Integer moedaFreteTotal = null;

    @XmlElement(name = "valorFreteTotalMoedaUtiliza")
    @ApiModelProperty(example = "10.12", value = "Valor total do frete na moeda utilizada<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.<br>Observação:<br>Para as Duimp registradas a partir de 08/06/2022, o valor do frete utilizado no cálculo do valor aduaneiro não inclui os gastos relativos à carga, à descarga e ao manuseio incorridos no território nacional e destacados do custo de transporte")
    @Valid
    /**
     * Valor total do frete na moeda utilizada<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.<br>Observação:<br>Para as Duimp registradas a partir de 08/06/2022, o valor do frete utilizado no cálculo do valor aduaneiro não inclui os gastos relativos à carga, à descarga e ao manuseio incorridos no território nacional e destacados do custo de transporte
     **/
    private BigDecimal valorFreteTotalMoedaUtiliza = null;

    @XmlElement(name = "valorFreteTotalEmReal")
    @ApiModelProperty(example = "40.48", value = "Valor total do frete em R$ (Reais)<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.<br>Observação:<br>Para as Duimp registradas a partir de 08/06/2022, o valor do frete utilizado no cálculo do valor aduaneiro não inclui os gastos relativos à carga, à descarga e ao manuseio incorridos no território nacional e destacados do custo de transporte")
    @Valid
    /**
     * Valor total do frete em R$ (Reais)<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.<br>Observação:<br>Para as Duimp registradas a partir de 08/06/2022, o valor do frete utilizado no cálculo do valor aduaneiro não inclui os gastos relativos à carga, à descarga e ao manuseio incorridos no território nacional e destacados do custo de transporte
     **/
    private BigDecimal valorFreteTotalEmReal = null;

    @XmlElement(name = "valorFreteTotalDolar")
    @ApiModelProperty(example = "40.48", value = "Valor total do frete em Dólares<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.<br>Observação:<br>Para as Duimp registradas a partir de 08/06/2022, o valor do frete utilizado no cálculo do valor aduaneiro não inclui os gastos relativos à carga, à descarga e ao manuseio incorridos no território nacional e destacados do custo de transporte")
    @Valid
    /**
     * Valor total do frete em Dólares<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.<br>Observação:<br>Para as Duimp registradas a partir de 08/06/2022, o valor do frete utilizado no cálculo do valor aduaneiro não inclui os gastos relativos à carga, à descarga e ao manuseio incorridos no território nacional e destacados do custo de transporte
     **/
    private BigDecimal valorFreteTotalDolar = null;

    @XmlElement(name = "valorFreteTotalDestinoEmReal")
    @ApiModelProperty(example = "40.48", value = "Valor total do frete não utilizado no cálculo do valor aduaneiro da Duimp, em R$ (Reais)<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.<br>Observação:<br>Para as Duimp registradas a partir de 08/06/2022, o valor do frete utilizado no cálculo do valor aduaneiro não inclui os gastos relativos à carga, à descarga e ao manuseio incorridos no território nacional e destacados do custo de transporte")
    @Valid
    /**
     * Valor total do frete não utilizado no cálculo do valor aduaneiro da Duimp, em R$ (Reais)<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.<br>Observação:<br>Para as Duimp registradas a partir de 08/06/2022, o valor do frete utilizado no cálculo do valor aduaneiro não inclui os gastos relativos à carga, à descarga e ao manuseio incorridos no território nacional e destacados do custo de transporte
     **/
    private BigDecimal valorFreteTotalDestinoEmReal = null;

    @XmlElement(name = "valorFreteTotalDestinoDolar")
    @ApiModelProperty(example = "40.48", value = "Valor total do frete não utilizado no cálculo do valor aduaneiro da Duimp, em Dólares<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.<br>Observação:<br>Para as Duimp registradas a partir de 08/06/2022, o valor do frete utilizado no cálculo do valor aduaneiro não inclui os gastos relativos à carga, à descarga e ao manuseio incorridos no território nacional e destacados do custo de transporte")
    @Valid
    /**
     * Valor total do frete não utilizado no cálculo do valor aduaneiro da Duimp, em Dólares<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.<br>Observação:<br>Para as Duimp registradas a partir de 08/06/2022, o valor do frete utilizado no cálculo do valor aduaneiro não inclui os gastos relativos à carga, à descarga e ao manuseio incorridos no território nacional e destacados do custo de transporte
     **/
    private BigDecimal valorFreteTotalDestinoDolar = null;

    @XmlElement(name = "moedaSeguro")
    @ApiModelProperty(example = "220", value = "Código da moeda negociada do seguro<br> Domínio: Tabela de Moedas do Siscomex.<br>Tamanho: 3<br>Formato: 'NNN'")
    /**
     * Código da moeda negociada do seguro<br> Domínio: Tabela de Moedas do Siscomex.<br>Tamanho: 3<br>Formato: 'NNN'
     **/
    private Integer moedaSeguro = null;

    @XmlElement(name = "valorSeguroMoedaUtilizada")
    @ApiModelProperty(example = "30.12", value = "Valor do seguro na moeda negociada<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.")
    @Valid
    /**
     * Valor do seguro na moeda negociada<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.
     **/
    private BigDecimal valorSeguroMoedaUtilizada = null;

    @XmlElement(name = "valorSeguroEmReal")
    @ApiModelProperty(example = "120.48", value = "Valor do seguro em R$ (Reais)<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.")
    @Valid
    /**
     * Valor do seguro em R$ (Reais)<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.
     **/
    private BigDecimal valorSeguroEmReal = null;

    @XmlElement(name = "valorSeguroDolar")
    @ApiModelProperty(example = "120.48", value = "Valor do seguro em Dólares<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.")
    @Valid
    /**
     * Valor do seguro em Dólares<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.
     **/
    private BigDecimal valorSeguroDolar = null;

    @XmlElement(name = "dadosCargaAquaviaria")
    @ApiModelProperty(value = "")
    @Valid
    private DadosExclusivosDeUmaCargaAquaviriaNoSiscomexCarga dadosCargaAquaviaria = null;

    @XmlElement(name = "dadosCargaAerea")
    @ApiModelProperty(value = "")
    @Valid
    private DadosExclusivosDeUmaCargaAreaNoCCTImportao dadosCargaAerea = null;

    /**
     * Tipo de identificação da carga
     *
     * @return tipoIdentificacaoCarga
     **/
    @JsonProperty("tipoIdentificacaoCarga")
    public String getTipoIdentificacaoCarga() {
        if (tipoIdentificacaoCarga == null) {
            return null;
        }
        return tipoIdentificacaoCarga.value();
    }

    public void setTipoIdentificacaoCarga(TipoIdentificacaoCargaEnum tipoIdentificacaoCarga) {
        this.tipoIdentificacaoCarga = tipoIdentificacaoCarga;
    }

    public DadosDaCarga tipoIdentificacaoCarga(TipoIdentificacaoCargaEnum tipoIdentificacaoCarga) {
        this.tipoIdentificacaoCarga = tipoIdentificacaoCarga;
        return this;
    }

    /**
     * Número de Identificação da Carga.&lt;br&gt;Quando tipo de identificação da carga for CE: &lt;br&gt; - Tamanho: 15 &lt;br&gt; - Formato: NNNNNNNNNNNNNNN&lt;br&gt;Quando tipo de identificação da carga for RUC: &lt;br&gt; - Tamanho mínimo: 1&lt;br&gt; - Tamanho máximo: 32
     *
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
     *
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
     *
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
     * Lista de códigos de recinto alfandegado onde a mercadoria foi armazenada para verificação física. &lt;br&gt;Cada elemento é representado da seguinte forma:&lt;br&gt;Tamanho: 7&lt;br&gt;Formato: &#39;NNNNNNN&#39;
     *
     * @return recintosLocalizacaoCarga
     **/
    @JsonProperty("recintosLocalizacaoCarga")
    public List<String> getRecintosLocalizacaoCarga() {
        return recintosLocalizacaoCarga;
    }

    public void setRecintosLocalizacaoCarga(List<String> recintosLocalizacaoCarga) {
        this.recintosLocalizacaoCarga = recintosLocalizacaoCarga;
    }

    public DadosDaCarga recintosLocalizacaoCarga(List<String> recintosLocalizacaoCarga) {
        this.recintosLocalizacaoCarga = recintosLocalizacaoCarga;
        return this;
    }

    public DadosDaCarga addRecintosLocalizacaoCargaItem(String recintosLocalizacaoCargaItem) {
        this.recintosLocalizacaoCarga.add(recintosLocalizacaoCargaItem);
        return this;
    }

    /**
     * Código da unidade de destino final da carga&lt;br&gt;Tamanho: 7&lt;br&gt;Formato: &#39;NNNNNNN&#39;
     *
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
     *
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
     *
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
     * Via utilizada no transporte internacional da carga
     *
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
     * Data de Chegada da Carga na URF de Localização da Carga.&lt;br&gt;Formato: &#39;yyyy-MM-dd&#39;
     *
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
     * Get paisProcedencia
     *
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
     * Peso líquido em quilogramas correspondente ao quantitativo total das mercadorias do item.&lt;br&gt;Tamanho: 16,5&lt;br&gt;Formato: Decimal, com até 5 casas decimais separadas por ponto.
     *
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
     *
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
     *
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
     *
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
     *
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
     * Valor total do frete não utilizado no cálculo do valor aduaneiro da Duimp, em R$ (Reais)&lt;br&gt;Tamanho: 16,7&lt;br&gt;Formato: Decimal, com até 7 casas decimais separadas por ponto.&lt;br&gt;Observação:&lt;br&gt;Para as Duimp registradas a partir de 08/06/2022, o valor do frete utilizado no cálculo do valor aduaneiro não inclui os gastos relativos à carga, à descarga e ao manuseio incorridos no território nacional e destacados do custo de transporte
     *
     * @return valorFreteTotalDestinoEmReal
     **/
    @JsonProperty("valorFreteTotalDestinoEmReal")
    public BigDecimal getValorFreteTotalDestinoEmReal() {
        return valorFreteTotalDestinoEmReal;
    }

    public void setValorFreteTotalDestinoEmReal(BigDecimal valorFreteTotalDestinoEmReal) {
        this.valorFreteTotalDestinoEmReal = valorFreteTotalDestinoEmReal;
    }

    public DadosDaCarga valorFreteTotalDestinoEmReal(BigDecimal valorFreteTotalDestinoEmReal) {
        this.valorFreteTotalDestinoEmReal = valorFreteTotalDestinoEmReal;
        return this;
    }

    /**
     * Valor total do frete não utilizado no cálculo do valor aduaneiro da Duimp, em Dólares&lt;br&gt;Tamanho: 16,7&lt;br&gt;Formato: Decimal, com até 7 casas decimais separadas por ponto.&lt;br&gt;Observação:&lt;br&gt;Para as Duimp registradas a partir de 08/06/2022, o valor do frete utilizado no cálculo do valor aduaneiro não inclui os gastos relativos à carga, à descarga e ao manuseio incorridos no território nacional e destacados do custo de transporte
     *
     * @return valorFreteTotalDestinoDolar
     **/
    @JsonProperty("valorFreteTotalDestinoDolar")
    public BigDecimal getValorFreteTotalDestinoDolar() {
        return valorFreteTotalDestinoDolar;
    }

    public void setValorFreteTotalDestinoDolar(BigDecimal valorFreteTotalDestinoDolar) {
        this.valorFreteTotalDestinoDolar = valorFreteTotalDestinoDolar;
    }

    public DadosDaCarga valorFreteTotalDestinoDolar(BigDecimal valorFreteTotalDestinoDolar) {
        this.valorFreteTotalDestinoDolar = valorFreteTotalDestinoDolar;
        return this;
    }

    /**
     * Código da moeda negociada do seguro&lt;br&gt; Domínio: Tabela de Moedas do Siscomex.&lt;br&gt;Tamanho: 3&lt;br&gt;Formato: &#39;NNN&#39;
     *
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
     *
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
     *
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
     *
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

    /**
     * Get dadosCargaAquaviaria
     *
     * @return dadosCargaAquaviaria
     **/
    @JsonProperty("dadosCargaAquaviaria")
    public DadosExclusivosDeUmaCargaAquaviriaNoSiscomexCarga getDadosCargaAquaviaria() {
        return dadosCargaAquaviaria;
    }

    public void setDadosCargaAquaviaria(DadosExclusivosDeUmaCargaAquaviriaNoSiscomexCarga dadosCargaAquaviaria) {
        this.dadosCargaAquaviaria = dadosCargaAquaviaria;
    }

    public DadosDaCarga dadosCargaAquaviaria(DadosExclusivosDeUmaCargaAquaviriaNoSiscomexCarga dadosCargaAquaviaria) {
        this.dadosCargaAquaviaria = dadosCargaAquaviaria;
        return this;
    }

    /**
     * Get dadosCargaAerea
     *
     * @return dadosCargaAerea
     **/
    @JsonProperty("dadosCargaAerea")
    public DadosExclusivosDeUmaCargaAreaNoCCTImportao getDadosCargaAerea() {
        return dadosCargaAerea;
    }

    public void setDadosCargaAerea(DadosExclusivosDeUmaCargaAreaNoCCTImportao dadosCargaAerea) {
        this.dadosCargaAerea = dadosCargaAerea;
    }

    public DadosDaCarga dadosCargaAerea(DadosExclusivosDeUmaCargaAreaNoCCTImportao dadosCargaAerea) {
        this.dadosCargaAerea = dadosCargaAerea;
        return this;
    }


    @Override
    public String toString() {

        String sb = "class DadosDaCarga {\n" +
                "    tipoIdentificacaoCarga: " + toIndentedString(tipoIdentificacaoCarga) + "\n" +
                "    identificacaoCarga: " + toIndentedString(identificacaoCarga) + "\n" +
                "    uaDeclarada: " + toIndentedString(uaDeclarada) + "\n" +
                "    ufDeclarada: " + toIndentedString(ufDeclarada) + "\n" +
                "    recintosLocalizacaoCarga: " + toIndentedString(recintosLocalizacaoCarga) + "\n" +
                "    uaDestinoFinal: " + toIndentedString(uaDestinoFinal) + "\n" +
                "    uaEntradaCarga: " + toIndentedString(uaEntradaCarga) + "\n" +
                "    ufEntradaCarga: " + toIndentedString(ufEntradaCarga) + "\n" +
                "    viaTransporte: " + toIndentedString(viaTransporte) + "\n" +
                "    dataChegada: " + toIndentedString(dataChegada) + "\n" +
                "    paisProcedencia: " + toIndentedString(paisProcedencia) + "\n" +
                "    pesoLiquido: " + toIndentedString(pesoLiquido) + "\n" +
                "    moedaFreteTotal: " + toIndentedString(moedaFreteTotal) + "\n" +
                "    valorFreteTotalMoedaUtiliza: " + toIndentedString(valorFreteTotalMoedaUtiliza) + "\n" +
                "    valorFreteTotalEmReal: " + toIndentedString(valorFreteTotalEmReal) + "\n" +
                "    valorFreteTotalDolar: " + toIndentedString(valorFreteTotalDolar) + "\n" +
                "    valorFreteTotalDestinoEmReal: " + toIndentedString(valorFreteTotalDestinoEmReal) + "\n" +
                "    valorFreteTotalDestinoDolar: " + toIndentedString(valorFreteTotalDestinoDolar) + "\n" +
                "    moedaSeguro: " + toIndentedString(moedaSeguro) + "\n" +
                "    valorSeguroMoedaUtilizada: " + toIndentedString(valorSeguroMoedaUtilizada) + "\n" +
                "    valorSeguroEmReal: " + toIndentedString(valorSeguroEmReal) + "\n" +
                "    valorSeguroDolar: " + toIndentedString(valorSeguroDolar) + "\n" +
                "    dadosCargaAquaviaria: " + toIndentedString(dadosCargaAquaviaria) + "\n" +
                "    dadosCargaAerea: " + toIndentedString(dadosCargaAerea) + "\n" +
                "}";
        return sb;
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

