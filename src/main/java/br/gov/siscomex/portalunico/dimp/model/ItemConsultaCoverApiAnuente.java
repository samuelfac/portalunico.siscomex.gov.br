package br.gov.siscomex.portalunico.dimp.model;

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
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemConsultaCoverApiAnuente", propOrder =
        {"status", "identificacao", "produto", "caracterizacaoImportacao", "indicadorExportadorFabricante", "fabricante", "exportador", "indicadorCompradorVendedor", "mercadoria", "condicaoVenda", "lpcos", "certificadoMercosul", "declaracoesVinculadas", "dadosCambiais", "atributosDuimp", "atributosFundamentoLegalDuimp", "tributos", "dadosInsumoDrawbackIsencao"
        })

@XmlRootElement(name = "ItemConsultaCoverApiAnuente")
/**
 * Dados do item de uma Duimp.
 **/
@ApiModel(description = "Dados do item de uma Duimp.")
public class ItemConsultaCoverApiAnuente {


    @XmlElement(name = "status")
    @ApiModelProperty(example = "ATIVO", value = "Indicador da situação do item associado à versão da Duimp consultada (ativo ou inativo).<br>Domínio:")
    /**
     * Indicador da situação do item associado à versão da Duimp consultada (ativo ou inativo).<br>Domínio:
     **/
    private StatusEnum status = null;
    @XmlElement(name = "identificacao")
    @ApiModelProperty(value = "")
    @Valid
    private IdentificadorItemDuimpCover identificacao = null;
    @XmlElement(name = "produto")
    @ApiModelProperty(value = "")
    @Valid
    private ProdutoConsultaItemCover produto = null;
    @XmlElement(name = "caracterizacaoImportacao")
    @ApiModelProperty(value = "")
    @Valid
    private CaracterizacaoImportacaoConsultaItemCover caracterizacaoImportacao = null;
    @XmlElement(name = "fabricante")
    @ApiModelProperty(value = "")
    @Valid
    private FabricanteCover fabricante = null;

    @XmlElement(name = "indicadorExportadorFabricante")
    @ApiModelProperty(value = "")
    @Valid
    private IndicadorExportadorFabricanteCover indicadorExportadorFabricante = null;
    @XmlElement(name = "indicadorCompradorVendedor")
    @ApiModelProperty(value = "")
    @Valid
    private IndicadorCompradorVendedorCover indicadorCompradorVendedor = null;

    @XmlElement(name = "exportador")
    @ApiModelProperty(value = "")
    @Valid
    private ExportadorCover exportador = null;
    @XmlElement(name = "lpcos")
    @ApiModelProperty(value = "")
    @Valid
    private List<LpcoCover> lpcos = null;

    @XmlElement(name = "mercadoria")
    @ApiModelProperty(value = "")
    @Valid
    private MercadoriaCover mercadoria = null;

    @XmlElement(name = "condicaoVenda")
    @ApiModelProperty(value = "")
    @Valid
    private CondicaoVendaConsultaItemCover condicaoVenda = null;
    @XmlElement(name = "declaracoesVinculadas")
    @ApiModelProperty(value = "")
    @Valid
    private List<DeclaracaoVinculadaCoverConsulta> declaracoesVinculadas = null;

    @XmlElement(name = "certificadoMercosul")
    @ApiModelProperty(value = "")
    @Valid
    private List<CertificadoMercosulCover> certificadoMercosul = null;
    @XmlElement(name = "dadosCambiais")
    @ApiModelProperty(value = "")
    @Valid
    private DadosCambiaisCover dadosCambiais = null;
    @XmlElement(name = "atributosDuimp")
    @ApiModelProperty(value = "")
    @Valid
    private List<AtributoItemCover> atributosDuimp = null;
    @XmlElement(name = "tributos")
    @ApiModelProperty(value = "")
    @Valid
    private TributosConsultaItemCoverApiAnuente tributos = null;

    @XmlElement(name = "atributosFundamentoLegalDuimp")
    @ApiModelProperty(value = "")
    @Valid
    private List<AtributoFundamentoLegalCover> atributosFundamentoLegalDuimp = null;
    @XmlElement(name = "dadosInsumoDrawbackIsencao")
    @ApiModelProperty(value = "")
    @Valid
    private DrawbackConsultaItemCover dadosInsumoDrawbackIsencao = null;

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
     * Indicador da situação do item associado à versão da Duimp consultada (ativo ou inativo).&lt;br&gt;Domínio:
     *
     * @return status
     **/
    @JsonProperty("status")
    public String getStatus() {
        if (status == null) {
            return null;
        }
        return status.value();
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public ItemConsultaCoverApiAnuente status(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * Get identificacao
     *
     * @return identificacao
     **/
    @JsonProperty("identificacao")
    public IdentificadorItemDuimpCover getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(IdentificadorItemDuimpCover identificacao) {
        this.identificacao = identificacao;
    }

    public ItemConsultaCoverApiAnuente identificacao(IdentificadorItemDuimpCover identificacao) {
        this.identificacao = identificacao;
        return this;
    }

    /**
     * Get produto
     *
     * @return produto
     **/
    @JsonProperty("produto")
    public ProdutoConsultaItemCover getProduto() {
        return produto;
    }

    public void setProduto(ProdutoConsultaItemCover produto) {
        this.produto = produto;
    }

    public ItemConsultaCoverApiAnuente produto(ProdutoConsultaItemCover produto) {
        this.produto = produto;
        return this;
    }

    /**
     * Get caracterizacaoImportacao
     *
     * @return caracterizacaoImportacao
     **/
    @JsonProperty("caracterizacaoImportacao")
    public CaracterizacaoImportacaoConsultaItemCover getCaracterizacaoImportacao() {
        return caracterizacaoImportacao;
    }

    public void setCaracterizacaoImportacao(CaracterizacaoImportacaoConsultaItemCover caracterizacaoImportacao) {
        this.caracterizacaoImportacao = caracterizacaoImportacao;
    }

    public ItemConsultaCoverApiAnuente caracterizacaoImportacao(CaracterizacaoImportacaoConsultaItemCover caracterizacaoImportacao) {
        this.caracterizacaoImportacao = caracterizacaoImportacao;
        return this;
    }

    /**
     * Get indicadorExportadorFabricante
     *
     * @return indicadorExportadorFabricante
     **/
    @JsonProperty("indicadorExportadorFabricante")
    public IndicadorExportadorFabricanteCover getIndicadorExportadorFabricante() {
        return indicadorExportadorFabricante;
    }

    public void setIndicadorExportadorFabricante(IndicadorExportadorFabricanteCover indicadorExportadorFabricante) {
        this.indicadorExportadorFabricante = indicadorExportadorFabricante;
    }

    public ItemConsultaCoverApiAnuente indicadorExportadorFabricante(IndicadorExportadorFabricanteCover indicadorExportadorFabricante) {
        this.indicadorExportadorFabricante = indicadorExportadorFabricante;
        return this;
    }

    /**
     * Get fabricante
     *
     * @return fabricante
     **/
    @JsonProperty("fabricante")
    public FabricanteCover getFabricante() {
        return fabricante;
    }

    public void setFabricante(FabricanteCover fabricante) {
        this.fabricante = fabricante;
    }

    public ItemConsultaCoverApiAnuente fabricante(FabricanteCover fabricante) {
        this.fabricante = fabricante;
        return this;
    }

    /**
     * Get exportador
     *
     * @return exportador
     **/
    @JsonProperty("exportador")
    public ExportadorCover getExportador() {
        return exportador;
    }

    public void setExportador(ExportadorCover exportador) {
        this.exportador = exportador;
    }

    public ItemConsultaCoverApiAnuente exportador(ExportadorCover exportador) {
        this.exportador = exportador;
        return this;
    }

    /**
     * Get indicadorCompradorVendedor
     *
     * @return indicadorCompradorVendedor
     **/
    @JsonProperty("indicadorCompradorVendedor")
    public IndicadorCompradorVendedorCover getIndicadorCompradorVendedor() {
        return indicadorCompradorVendedor;
    }

    public void setIndicadorCompradorVendedor(IndicadorCompradorVendedorCover indicadorCompradorVendedor) {
        this.indicadorCompradorVendedor = indicadorCompradorVendedor;
    }

    public ItemConsultaCoverApiAnuente indicadorCompradorVendedor(IndicadorCompradorVendedorCover indicadorCompradorVendedor) {
        this.indicadorCompradorVendedor = indicadorCompradorVendedor;
        return this;
    }

    /**
     * Get mercadoria
     * @return mercadoria
     **/
    @JsonProperty("mercadoria")
    public MercadoriaCover getMercadoria() {
        return mercadoria;
    }

    public void setMercadoria(MercadoriaCover mercadoria) {
        this.mercadoria = mercadoria;
    }

    public ItemConsultaCoverApiAnuente mercadoria(MercadoriaCover mercadoria) {
        this.mercadoria = mercadoria;
        return this;
    }

    /**
     * Get condicaoVenda
     *
     * @return condicaoVenda
     **/
    @JsonProperty("condicaoVenda")
    public CondicaoVendaConsultaItemCover getCondicaoVenda() {
        return condicaoVenda;
    }

    public void setCondicaoVenda(CondicaoVendaConsultaItemCover condicaoVenda) {
        this.condicaoVenda = condicaoVenda;
    }

    public ItemConsultaCoverApiAnuente condicaoVenda(CondicaoVendaConsultaItemCover condicaoVenda) {
        this.condicaoVenda = condicaoVenda;
        return this;
    }

    /**
     * Get lpcos
     * @return lpcos
     **/
    @JsonProperty("lpcos")
    public List<LpcoCover> getLpcos() {
        return lpcos;
    }

    public void setLpcos(List<LpcoCover> lpcos) {
        this.lpcos = lpcos;
    }

    public ItemConsultaCoverApiAnuente lpcos(List<LpcoCover> lpcos) {
        this.lpcos = lpcos;
        return this;
    }

    public ItemConsultaCoverApiAnuente addLpcosItem(LpcoCover lpcosItem) {
        this.lpcos.add(lpcosItem);
        return this;
    }

    /**
     * Get certificadoMercosul
     *
     * @return certificadoMercosul
     **/
    @JsonProperty("certificadoMercosul")
    public List<CertificadoMercosulCover> getCertificadoMercosul() {
        return certificadoMercosul;
    }

    public void setCertificadoMercosul(List<CertificadoMercosulCover> certificadoMercosul) {
        this.certificadoMercosul = certificadoMercosul;
    }

    public ItemConsultaCoverApiAnuente certificadoMercosul(List<CertificadoMercosulCover> certificadoMercosul) {
        this.certificadoMercosul = certificadoMercosul;
        return this;
    }

    public ItemConsultaCoverApiAnuente addCertificadoMercosulItem(CertificadoMercosulCover certificadoMercosulItem) {
        this.certificadoMercosul.add(certificadoMercosulItem);
        return this;
    }

    /**
     * Get declaracoesVinculadas
     *
     * @return declaracoesVinculadas
     **/
    @JsonProperty("declaracoesVinculadas")
    public List<DeclaracaoVinculadaCoverConsulta> getDeclaracoesVinculadas() {
        return declaracoesVinculadas;
    }

    public void setDeclaracoesVinculadas(List<DeclaracaoVinculadaCoverConsulta> declaracoesVinculadas) {
        this.declaracoesVinculadas = declaracoesVinculadas;
    }

    public ItemConsultaCoverApiAnuente declaracoesVinculadas(List<DeclaracaoVinculadaCoverConsulta> declaracoesVinculadas) {
        this.declaracoesVinculadas = declaracoesVinculadas;
        return this;
    }

    public ItemConsultaCoverApiAnuente addDeclaracoesVinculadasItem(DeclaracaoVinculadaCoverConsulta declaracoesVinculadasItem) {
        this.declaracoesVinculadas.add(declaracoesVinculadasItem);
        return this;
    }

    /**
     * Get dadosCambiais
     *
     * @return dadosCambiais
     **/
    @JsonProperty("dadosCambiais")
    public DadosCambiaisCover getDadosCambiais() {
        return dadosCambiais;
    }

    public void setDadosCambiais(DadosCambiaisCover dadosCambiais) {
        this.dadosCambiais = dadosCambiais;
    }

    public ItemConsultaCoverApiAnuente dadosCambiais(DadosCambiaisCover dadosCambiais) {
        this.dadosCambiais = dadosCambiais;
        return this;
    }

    /**
     * Get atributosDuimp
     * @return atributosDuimp
     **/
    @JsonProperty("atributosDuimp")
    public List<AtributoItemCover> getAtributosDuimp() {
        return atributosDuimp;
    }

    public void setAtributosDuimp(List<AtributoItemCover> atributosDuimp) {
        this.atributosDuimp = atributosDuimp;
    }

    public ItemConsultaCoverApiAnuente atributosDuimp(List<AtributoItemCover> atributosDuimp) {
        this.atributosDuimp = atributosDuimp;
        return this;
    }

    public ItemConsultaCoverApiAnuente addAtributosDuimpItem(AtributoItemCover atributosDuimpItem) {
        this.atributosDuimp.add(atributosDuimpItem);
        return this;
    }

    /**
     * Get atributosFundamentoLegalDuimp
     *
     * @return atributosFundamentoLegalDuimp
     **/
    @JsonProperty("atributosFundamentoLegalDuimp")
    public List<AtributoFundamentoLegalCover> getAtributosFundamentoLegalDuimp() {
        return atributosFundamentoLegalDuimp;
    }

    public void setAtributosFundamentoLegalDuimp(List<AtributoFundamentoLegalCover> atributosFundamentoLegalDuimp) {
        this.atributosFundamentoLegalDuimp = atributosFundamentoLegalDuimp;
    }

    public ItemConsultaCoverApiAnuente atributosFundamentoLegalDuimp(List<AtributoFundamentoLegalCover> atributosFundamentoLegalDuimp) {
        this.atributosFundamentoLegalDuimp = atributosFundamentoLegalDuimp;
        return this;
    }

    public ItemConsultaCoverApiAnuente addAtributosFundamentoLegalDuimpItem(AtributoFundamentoLegalCover atributosFundamentoLegalDuimpItem) {
        this.atributosFundamentoLegalDuimp.add(atributosFundamentoLegalDuimpItem);
        return this;
    }

    /**
     * Get tributos
     *
     * @return tributos
     **/
    @JsonProperty("tributos")
    public TributosConsultaItemCoverApiAnuente getTributos() {
        return tributos;
    }

    public void setTributos(TributosConsultaItemCoverApiAnuente tributos) {
        this.tributos = tributos;
    }

    public ItemConsultaCoverApiAnuente tributos(TributosConsultaItemCoverApiAnuente tributos) {
        this.tributos = tributos;
        return this;
    }

    /**
     * Get dadosInsumoDrawbackIsencao
     *
     * @return dadosInsumoDrawbackIsencao
     **/
    @JsonProperty("dadosInsumoDrawbackIsencao")
    public DrawbackConsultaItemCover getDadosInsumoDrawbackIsencao() {
        return dadosInsumoDrawbackIsencao;
    }

    public void setDadosInsumoDrawbackIsencao(DrawbackConsultaItemCover dadosInsumoDrawbackIsencao) {
        this.dadosInsumoDrawbackIsencao = dadosInsumoDrawbackIsencao;
    }

    public ItemConsultaCoverApiAnuente dadosInsumoDrawbackIsencao(DrawbackConsultaItemCover dadosInsumoDrawbackIsencao) {
        this.dadosInsumoDrawbackIsencao = dadosInsumoDrawbackIsencao;
        return this;
    }


    @Override
    public String toString() {

        String sb = "class ItemConsultaCoverApiAnuente {\n" +
                "    status: " + toIndentedString(status) + "\n" +
                "    identificacao: " + toIndentedString(identificacao) + "\n" +
                "    produto: " + toIndentedString(produto) + "\n" +
                "    caracterizacaoImportacao: " + toIndentedString(caracterizacaoImportacao) + "\n" +
                "    indicadorExportadorFabricante: " + toIndentedString(indicadorExportadorFabricante) + "\n" +
                "    fabricante: " + toIndentedString(fabricante) + "\n" +
                "    exportador: " + toIndentedString(exportador) + "\n" +
                "    indicadorCompradorVendedor: " + toIndentedString(indicadorCompradorVendedor) + "\n" +
                "    mercadoria: " + toIndentedString(mercadoria) + "\n" +
                "    condicaoVenda: " + toIndentedString(condicaoVenda) + "\n" +
                "    lpcos: " + toIndentedString(lpcos) + "\n" +
                "    certificadoMercosul: " + toIndentedString(certificadoMercosul) + "\n" +
                "    declaracoesVinculadas: " + toIndentedString(declaracoesVinculadas) + "\n" +
                "    dadosCambiais: " + toIndentedString(dadosCambiais) + "\n" +
                "    atributosDuimp: " + toIndentedString(atributosDuimp) + "\n" +
                "    atributosFundamentoLegalDuimp: " + toIndentedString(atributosFundamentoLegalDuimp) + "\n" +
                "    tributos: " + toIndentedString(tributos) + "\n" +
                "    dadosInsumoDrawbackIsencao: " + toIndentedString(dadosInsumoDrawbackIsencao) + "\n" +
                "}";
        return sb;
    }

    @XmlType(name = "StatusEnum")
    @XmlEnum(String.class)
    public enum StatusEnum {

        @XmlEnumValue("ATIVO")
        @JsonProperty("ATIVO")
        ATIVO("ATIVO"),

        @XmlEnumValue("INATIVO")
        @JsonProperty("INATIVO")
        INATIVO("INATIVO");


        private final String value;

        StatusEnum(String v) {
            value = v;
        }

        public static StatusEnum fromValue(String v) {
            for (StatusEnum b : StatusEnum.values()) {
                if (String.valueOf(b.value).equals(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "' to StatusEnum");
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
