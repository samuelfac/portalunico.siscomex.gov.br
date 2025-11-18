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
import java.time.LocalDate;
import java.time.OffsetDateTime;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CargaRodoviariaDetalhadaDadosBasicos", propOrder =
        {"categoriaCarga", "cidadeEmissao", "cidadeEntregaMercadoria", "cidadeTransportadorRespMercadoria", "dataEmissao", "dataTransportadorRespMercadoria", "identificacao", "paisEmissao", "paisEntregaMercadoria", "paisOrigemMercadoria", "paisTransportadorRespMercadoria", "partesPecasMadeira", "pesoBrutoKg", "prazoEntregaMercadoria", "ruc", "situacaoCarga", "tipo", "tipoCarga", "visualizaDepositario", "volumeMetrosCubicos"
        })

@XmlRootElement(name = "CargaRodoviariaDetalhadaDadosBasicos")
public class CargaRodoviariaDetalhadaDadosBasicos {

    @XmlElement(name = "categoriaCarga")
    @ApiModelProperty(value = "")
    @Valid
    private CategoriaCargaCrt categoriaCarga = null;

    @XmlElement(name = "cidadeEmissao")
    @ApiModelProperty(value = "")
    @Valid
    private Cidade cidadeEmissao = null;

    @XmlElement(name = "cidadeEntregaMercadoria")
    @ApiModelProperty(value = "")
    @Valid
    private Cidade cidadeEntregaMercadoria = null;

    @XmlElement(name = "cidadeTransportadorRespMercadoria")
    @ApiModelProperty(value = "")
    @Valid
    private Cidade cidadeTransportadorRespMercadoria = null;

    @XmlElement(name = "dataEmissao")
    @ApiModelProperty(example = "2020-05-07T17:43:18-03:00", value = "Data/Hora de emissão.<br/> Formato: yyyy-MM-dd'T'HH:mm:ssZ")
    /**
     * Data/Hora de emissão.<br/> Formato: yyyy-MM-dd'T'HH:mm:ssZ
     **/
    private OffsetDateTime dataEmissao = null;

    @XmlElement(name = "dataTransportadorRespMercadoria")
    @ApiModelProperty(value = "Data/Hora em que o transportador se responsabiliza pela mercadoria<br/>Formato: yyyyMMddHHmmssZ")
    /**
     * Data/Hora em que o transportador se responsabiliza pela mercadoria<br/>Formato: yyyyMMddHHmmssZ
     **/
    private OffsetDateTime dataTransportadorRespMercadoria = null;

    @XmlElement(name = "identificacao")
    @ApiModelProperty(example = "UY172911152", value = "Número do conhecimento<br/>Tamanho mínimo: 1<br/>Tamanho máximo: 35")
    /**
     * Número do conhecimento<br/>Tamanho mínimo: 1<br/>Tamanho máximo: 35
     **/
    private String identificacao = null;

    @XmlElement(name = "paisEmissao")
    @ApiModelProperty(value = "")
    @Valid
    private Pais paisEmissao = null;

    @XmlElement(name = "paisEntregaMercadoria")
    @ApiModelProperty(value = "")
    @Valid
    private Pais paisEntregaMercadoria = null;

    @XmlElement(name = "paisOrigemMercadoria")
    @ApiModelProperty(value = "")
    @Valid
    private Pais paisOrigemMercadoria = null;

    @XmlElement(name = "paisTransportadorRespMercadoria")
    @ApiModelProperty(value = "")
    @Valid
    private Pais paisTransportadorRespMercadoria = null;

    @XmlElement(name = "partesPecasMadeira")
    @ApiModelProperty(example = "false", value = "Indica se algum dos itens da carga está sendo transportado em embalagem/suporte de madeira<br/> S - Sim <br/>N - Não<br/>")
    /**
     * Indica se algum dos itens da carga está sendo transportado em embalagem/suporte de madeira<br/> S - Sim <br/>N - Não<br/>
     **/
    private Boolean partesPecasMadeira = null;

    @XmlElement(name = "pesoBrutoKg")
    @ApiModelProperty(example = "105.478", value = "Peso bruto da carga em KG<br/>Formato: Número Racional com 9 casas inteiras e 3 casas decimais")
    @Valid
    /**
     * Peso bruto da carga em KG<br/>Formato: Número Racional com 9 casas inteiras e 3 casas decimais
     **/
    private BigDecimal pesoBrutoKg = null;

    @XmlElement(name = "prazoEntregaMercadoria")
    @ApiModelProperty(value = "Data em que o transportador se compromete com a  entrega da carga<br/>Formato: yyyyMMddHHmmss")
    /**
     * Data em que o transportador se compromete com a  entrega da carga<br/>Formato: yyyyMMddHHmmss
     **/
    private LocalDate prazoEntregaMercadoria = null;

    @XmlElement(name = "ruc")
    @ApiModelProperty(example = "0BRIMP000555552000100DGXKKI9LMCG", value = "Número único de referencia da carga que atende à recomendação da Organização Mundial de Aduanas (OMA) para a Unique Consignment Reference (UCR). Utilizado para o rastreamento de uma carga, servindo para o controle da armazenagem e movimentação da carga<br>Tamanho: 35")
    /**
     * Número único de referencia da carga que atende à recomendação da Organização Mundial de Aduanas (OMA) para a Unique Consignment Reference (UCR). Utilizado para o rastreamento de uma carga, servindo para o controle da armazenagem e movimentação da carga<br>Tamanho: 35
     **/
    private String ruc = null;
    @XmlElement(name = "tipo")
    @ApiModelProperty(value = "")
    @Valid
    private TipoConhecimento tipo = null;

    @XmlElement(name = "situacaoCarga")
    @ApiModelProperty(example = "A, E", value = "Código da situação do Conhecimento<br>Tamanho: 1<br/>A - Ativo <br/>E - Excluído<br/>")
    /**
     * Código da situação do Conhecimento<br>Tamanho: 1<br/>A - Ativo <br/>E - Excluído<br/>
     **/
    private SituacaoCargaEnum situacaoCarga = null;
    @XmlElement(name = "tipoCarga")
    @ApiModelProperty(value = "")
    @Valid
    private TipoItemCargaCrt tipoCarga = null;
    @XmlElement(name = "visualizaDepositario")
    @ApiModelProperty(example = "true", value = "Indicador que informa se o depositário pode visualizar os dados de valor do frete, valor FCA e seguro informados nos CRTs da viagem.")
    /**
     * Indicador que informa se o depositário pode visualizar os dados de valor do frete, valor FCA e seguro informados nos CRTs da viagem.
     **/
    private Boolean visualizaDepositario = null;
    @XmlElement(name = "volumeMetrosCubicos")
    @ApiModelProperty(example = "435.498", value = "Volume da carga em metros cúbicos<br/>Formato: Número Racional com 9 casas inteiras e 3 casas decimais")
    @Valid
    /**
     * Volume da carga em metros cúbicos<br/>Formato: Número Racional com 9 casas inteiras e 3 casas decimais
     **/
    private BigDecimal volumeMetrosCubicos = null;

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

    /**
     * Get categoriaCarga
     *
     * @return categoriaCarga
     **/
    @JsonProperty("categoriaCarga")
    public CategoriaCargaCrt getCategoriaCarga() {
        return categoriaCarga;
    }

    public void setCategoriaCarga(CategoriaCargaCrt categoriaCarga) {
        this.categoriaCarga = categoriaCarga;
    }

    public CargaRodoviariaDetalhadaDadosBasicos categoriaCarga(CategoriaCargaCrt categoriaCarga) {
        this.categoriaCarga = categoriaCarga;
        return this;
    }

    /**
     * Get cidadeEmissao
     *
     * @return cidadeEmissao
     **/
    @JsonProperty("cidadeEmissao")
    public Cidade getCidadeEmissao() {
        return cidadeEmissao;
    }

    public void setCidadeEmissao(Cidade cidadeEmissao) {
        this.cidadeEmissao = cidadeEmissao;
    }

    public CargaRodoviariaDetalhadaDadosBasicos cidadeEmissao(Cidade cidadeEmissao) {
        this.cidadeEmissao = cidadeEmissao;
        return this;
    }

    /**
     * Get cidadeEntregaMercadoria
     *
     * @return cidadeEntregaMercadoria
     **/
    @JsonProperty("cidadeEntregaMercadoria")
    public Cidade getCidadeEntregaMercadoria() {
        return cidadeEntregaMercadoria;
    }

    public void setCidadeEntregaMercadoria(Cidade cidadeEntregaMercadoria) {
        this.cidadeEntregaMercadoria = cidadeEntregaMercadoria;
    }

    public CargaRodoviariaDetalhadaDadosBasicos cidadeEntregaMercadoria(Cidade cidadeEntregaMercadoria) {
        this.cidadeEntregaMercadoria = cidadeEntregaMercadoria;
        return this;
    }

    /**
     * Get cidadeTransportadorRespMercadoria
     *
     * @return cidadeTransportadorRespMercadoria
     **/
    @JsonProperty("cidadeTransportadorRespMercadoria")
    public Cidade getCidadeTransportadorRespMercadoria() {
        return cidadeTransportadorRespMercadoria;
    }

    public void setCidadeTransportadorRespMercadoria(Cidade cidadeTransportadorRespMercadoria) {
        this.cidadeTransportadorRespMercadoria = cidadeTransportadorRespMercadoria;
    }

    public CargaRodoviariaDetalhadaDadosBasicos cidadeTransportadorRespMercadoria(Cidade cidadeTransportadorRespMercadoria) {
        this.cidadeTransportadorRespMercadoria = cidadeTransportadorRespMercadoria;
        return this;
    }

    /**
     * Data/Hora de emissão.&lt;br/&gt; Formato: yyyy-MM-dd&#39;T&#39;HH:mm:ssZ
     *
     * @return dataEmissao
     **/
    @JsonProperty("dataEmissao")
    public OffsetDateTime getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(OffsetDateTime dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public CargaRodoviariaDetalhadaDadosBasicos dataEmissao(OffsetDateTime dataEmissao) {
        this.dataEmissao = dataEmissao;
        return this;
    }

    /**
     * Data/Hora em que o transportador se responsabiliza pela mercadoria&lt;br/&gt;Formato: yyyyMMddHHmmssZ
     *
     * @return dataTransportadorRespMercadoria
     **/
    @JsonProperty("dataTransportadorRespMercadoria")
    public OffsetDateTime getDataTransportadorRespMercadoria() {
        return dataTransportadorRespMercadoria;
    }

    public void setDataTransportadorRespMercadoria(OffsetDateTime dataTransportadorRespMercadoria) {
        this.dataTransportadorRespMercadoria = dataTransportadorRespMercadoria;
    }

    public CargaRodoviariaDetalhadaDadosBasicos dataTransportadorRespMercadoria(OffsetDateTime dataTransportadorRespMercadoria) {
        this.dataTransportadorRespMercadoria = dataTransportadorRespMercadoria;
        return this;
    }

    /**
     * Número do conhecimento&lt;br/&gt;Tamanho mínimo: 1&lt;br/&gt;Tamanho máximo: 35
     *
     * @return identificacao
     **/
    @JsonProperty("identificacao")
    public String getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }

    public CargaRodoviariaDetalhadaDadosBasicos identificacao(String identificacao) {
        this.identificacao = identificacao;
        return this;
    }

    /**
     * Get paisEmissao
     * @return paisEmissao
     **/
    @JsonProperty("paisEmissao")
    public Pais getPaisEmissao() {
        return paisEmissao;
    }

    public void setPaisEmissao(Pais paisEmissao) {
        this.paisEmissao = paisEmissao;
    }

    public CargaRodoviariaDetalhadaDadosBasicos paisEmissao(Pais paisEmissao) {
        this.paisEmissao = paisEmissao;
        return this;
    }

    /**
     * Get paisEntregaMercadoria
     *
     * @return paisEntregaMercadoria
     **/
    @JsonProperty("paisEntregaMercadoria")
    public Pais getPaisEntregaMercadoria() {
        return paisEntregaMercadoria;
    }

    public void setPaisEntregaMercadoria(Pais paisEntregaMercadoria) {
        this.paisEntregaMercadoria = paisEntregaMercadoria;
    }

    public CargaRodoviariaDetalhadaDadosBasicos paisEntregaMercadoria(Pais paisEntregaMercadoria) {
        this.paisEntregaMercadoria = paisEntregaMercadoria;
        return this;
    }

    /**
     * Get paisOrigemMercadoria
     *
     * @return paisOrigemMercadoria
     **/
    @JsonProperty("paisOrigemMercadoria")
    public Pais getPaisOrigemMercadoria() {
        return paisOrigemMercadoria;
    }

    public void setPaisOrigemMercadoria(Pais paisOrigemMercadoria) {
        this.paisOrigemMercadoria = paisOrigemMercadoria;
    }

    public CargaRodoviariaDetalhadaDadosBasicos paisOrigemMercadoria(Pais paisOrigemMercadoria) {
        this.paisOrigemMercadoria = paisOrigemMercadoria;
        return this;
    }

    /**
     * Get paisTransportadorRespMercadoria
     *
     * @return paisTransportadorRespMercadoria
     **/
    @JsonProperty("paisTransportadorRespMercadoria")
    public Pais getPaisTransportadorRespMercadoria() {
        return paisTransportadorRespMercadoria;
    }

    public void setPaisTransportadorRespMercadoria(Pais paisTransportadorRespMercadoria) {
        this.paisTransportadorRespMercadoria = paisTransportadorRespMercadoria;
    }

    public CargaRodoviariaDetalhadaDadosBasicos paisTransportadorRespMercadoria(Pais paisTransportadorRespMercadoria) {
        this.paisTransportadorRespMercadoria = paisTransportadorRespMercadoria;
        return this;
    }

    /**
     * Indica se algum dos itens da carga está sendo transportado em embalagem/suporte de madeira&lt;br/&gt; S - Sim &lt;br/&gt;N - Não&lt;br/&gt;
     *
     * @return partesPecasMadeira
     **/
    @JsonProperty("partesPecasMadeira")
    public Boolean isisPartesPecasMadeira() {
        return partesPecasMadeira;
    }

    public void setPartesPecasMadeira(Boolean partesPecasMadeira) {
        this.partesPecasMadeira = partesPecasMadeira;
    }

    public CargaRodoviariaDetalhadaDadosBasicos partesPecasMadeira(Boolean partesPecasMadeira) {
        this.partesPecasMadeira = partesPecasMadeira;
        return this;
    }

    /**
     * Peso bruto da carga em KG&lt;br/&gt;Formato: Número Racional com 9 casas inteiras e 3 casas decimais
     *
     * @return pesoBrutoKg
     **/
    @JsonProperty("pesoBrutoKg")
    public BigDecimal getPesoBrutoKg() {
        return pesoBrutoKg;
    }

    public void setPesoBrutoKg(BigDecimal pesoBrutoKg) {
        this.pesoBrutoKg = pesoBrutoKg;
    }

    public CargaRodoviariaDetalhadaDadosBasicos pesoBrutoKg(BigDecimal pesoBrutoKg) {
        this.pesoBrutoKg = pesoBrutoKg;
        return this;
    }

    /**
     * Data em que o transportador se compromete com a  entrega da carga&lt;br/&gt;Formato: yyyyMMddHHmmss
     * @return prazoEntregaMercadoria
     **/
    @JsonProperty("prazoEntregaMercadoria")
    public LocalDate getPrazoEntregaMercadoria() {
        return prazoEntregaMercadoria;
    }

    public void setPrazoEntregaMercadoria(LocalDate prazoEntregaMercadoria) {
        this.prazoEntregaMercadoria = prazoEntregaMercadoria;
    }

    public CargaRodoviariaDetalhadaDadosBasicos prazoEntregaMercadoria(LocalDate prazoEntregaMercadoria) {
        this.prazoEntregaMercadoria = prazoEntregaMercadoria;
        return this;
    }

    /**
     * Número único de referencia da carga que atende à recomendação da Organização Mundial de Aduanas (OMA) para a Unique Consignment Reference (UCR). Utilizado para o rastreamento de uma carga, servindo para o controle da armazenagem e movimentação da carga&lt;br&gt;Tamanho: 35
     *
     * @return ruc
     **/
    @JsonProperty("ruc")
    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public CargaRodoviariaDetalhadaDadosBasicos ruc(String ruc) {
        this.ruc = ruc;
        return this;
    }

    /**
     * Código da situação do Conhecimento&lt;br&gt;Tamanho: 1&lt;br/&gt;A - Ativo &lt;br/&gt;E - Excluído&lt;br/&gt;
     * @return situacaoCarga
     **/
    @JsonProperty("situacaoCarga")
    public String getSituacaoCarga() {
        if (situacaoCarga == null) {
            return null;
        }
        return situacaoCarga.value();
    }

    public void setSituacaoCarga(SituacaoCargaEnum situacaoCarga) {
        this.situacaoCarga = situacaoCarga;
    }

    public CargaRodoviariaDetalhadaDadosBasicos situacaoCarga(SituacaoCargaEnum situacaoCarga) {
        this.situacaoCarga = situacaoCarga;
        return this;
    }

    /**
     * Get tipo
     *
     * @return tipo
     **/
    @JsonProperty("tipo")
    public TipoConhecimento getTipo() {
        return tipo;
    }

    public void setTipo(TipoConhecimento tipo) {
        this.tipo = tipo;
    }

    public CargaRodoviariaDetalhadaDadosBasicos tipo(TipoConhecimento tipo) {
        this.tipo = tipo;
        return this;
    }

    /**
     * Get tipoCarga
     *
     * @return tipoCarga
     **/
    @JsonProperty("tipoCarga")
    public TipoItemCargaCrt getTipoCarga() {
        return tipoCarga;
    }

    public void setTipoCarga(TipoItemCargaCrt tipoCarga) {
        this.tipoCarga = tipoCarga;
    }

    public CargaRodoviariaDetalhadaDadosBasicos tipoCarga(TipoItemCargaCrt tipoCarga) {
        this.tipoCarga = tipoCarga;
        return this;
    }

    /**
     * Indicador que informa se o depositário pode visualizar os dados de valor do frete, valor FCA e seguro informados nos CRTs da viagem.
     *
     * @return visualizaDepositario
     **/
    @JsonProperty("visualizaDepositario")
    public Boolean isisVisualizaDepositario() {
        return visualizaDepositario;
    }

    public void setVisualizaDepositario(Boolean visualizaDepositario) {
        this.visualizaDepositario = visualizaDepositario;
    }

    public CargaRodoviariaDetalhadaDadosBasicos visualizaDepositario(Boolean visualizaDepositario) {
        this.visualizaDepositario = visualizaDepositario;
        return this;
    }

    /**
     * Volume da carga em metros cúbicos&lt;br/&gt;Formato: Número Racional com 9 casas inteiras e 3 casas decimais
     *
     * @return volumeMetrosCubicos
     **/
    @JsonProperty("volumeMetrosCubicos")
    public BigDecimal getVolumeMetrosCubicos() {
        return volumeMetrosCubicos;
    }

    public void setVolumeMetrosCubicos(BigDecimal volumeMetrosCubicos) {
        this.volumeMetrosCubicos = volumeMetrosCubicos;
    }

    public CargaRodoviariaDetalhadaDadosBasicos volumeMetrosCubicos(BigDecimal volumeMetrosCubicos) {
        this.volumeMetrosCubicos = volumeMetrosCubicos;
        return this;
    }


    @Override
    public String toString() {

        String sb = "class CargaRodoviariaDetalhadaDadosBasicos {\n" +
                "    categoriaCarga: " + toIndentedString(categoriaCarga) + "\n" +
                "    cidadeEmissao: " + toIndentedString(cidadeEmissao) + "\n" +
                "    cidadeEntregaMercadoria: " + toIndentedString(cidadeEntregaMercadoria) + "\n" +
                "    cidadeTransportadorRespMercadoria: " + toIndentedString(cidadeTransportadorRespMercadoria) + "\n" +
                "    dataEmissao: " + toIndentedString(dataEmissao) + "\n" +
                "    dataTransportadorRespMercadoria: " + toIndentedString(dataTransportadorRespMercadoria) + "\n" +
                "    identificacao: " + toIndentedString(identificacao) + "\n" +
                "    paisEmissao: " + toIndentedString(paisEmissao) + "\n" +
                "    paisEntregaMercadoria: " + toIndentedString(paisEntregaMercadoria) + "\n" +
                "    paisOrigemMercadoria: " + toIndentedString(paisOrigemMercadoria) + "\n" +
                "    paisTransportadorRespMercadoria: " + toIndentedString(paisTransportadorRespMercadoria) + "\n" +
                "    partesPecasMadeira: " + toIndentedString(partesPecasMadeira) + "\n" +
                "    pesoBrutoKg: " + toIndentedString(pesoBrutoKg) + "\n" +
                "    prazoEntregaMercadoria: " + toIndentedString(prazoEntregaMercadoria) + "\n" +
                "    ruc: " + toIndentedString(ruc) + "\n" +
                "    situacaoCarga: " + toIndentedString(situacaoCarga) + "\n" +
                "    tipo: " + toIndentedString(tipo) + "\n" +
                "    tipoCarga: " + toIndentedString(tipoCarga) + "\n" +
                "    visualizaDepositario: " + toIndentedString(visualizaDepositario) + "\n" +
                "    volumeMetrosCubicos: " + toIndentedString(volumeMetrosCubicos) + "\n" +
                "}";
        return sb;
    }

    @XmlType(name = "SituacaoCargaEnum")
    @XmlEnum(String.class)
    public enum SituacaoCargaEnum {

        @XmlEnumValue("A")
        @JsonProperty("A")
        A("A"),

        @XmlEnumValue("E")
        @JsonProperty("E")
        E("E");


        private final String value;

        SituacaoCargaEnum(String v) {
            value = v;
        }

        public static SituacaoCargaEnum fromValue(String v) {
            for (SituacaoCargaEnum b : SituacaoCargaEnum.values()) {
                if (String.valueOf(b.value).equals(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "' to SituacaoCargaEnum");
        }

        public String value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
    }
}
