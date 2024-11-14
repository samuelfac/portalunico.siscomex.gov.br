package br.gov.siscomex.portalunico.duimp_balanca_itens.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DuimpItemBalancaComercialCover", propOrder =
        {"identificacao", "produto", "caracterizacaoImportacao", "indicadorExportadorFabricante", "fabricante", "exportador", "indicadorCompradorVendedor", "mercadoria", "condicaoVenda", "lpcos", "dadosCambiais", "atributosDuimp", "atributosFundamentoLegalDuimp", "tributos"
        })

@XmlRootElement(name = "DuimpItemBalancaComercialCover")
public class DuimpItemBalancaComercialCover {

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

    @XmlElement(name = "indicadorExportadorFabricante")
    @ApiModelProperty(value = "")
    @Valid
    private IndicadorExportadorFabricanteCover indicadorExportadorFabricante = null;

    @XmlElement(name = "fabricante")
    @ApiModelProperty(value = "")
    @Valid
    private FabricanteCover fabricante = null;

    @XmlElement(name = "exportador")
    @ApiModelProperty(value = "")
    @Valid
    private ExportadorCover exportador = null;

    @XmlElement(name = "indicadorCompradorVendedor")
    @ApiModelProperty(value = "")
    @Valid
    private IndicadorCompradorVendedorCover indicadorCompradorVendedor = null;

    @XmlElement(name = "mercadoria")
    @ApiModelProperty(value = "")
    @Valid
    private MercadoriaCover mercadoria = null;

    @XmlElement(name = "condicaoVenda")
    @ApiModelProperty(value = "")
    @Valid
    private CondicaoVendaConsultaItemCover condicaoVenda = null;

    @XmlElement(name = "lpcos")
    @ApiModelProperty(value = "")
    @Valid
    private List<LpcoCover> lpcos = null;

    @XmlElement(name = "dadosCambiais")
    @ApiModelProperty(value = "")
    @Valid
    private DadosCambiaisCover dadosCambiais = null;

    @XmlElement(name = "atributosDuimp")
    @ApiModelProperty(value = "")
    @Valid
    private List<AtributoItemCover> atributosDuimp = null;

    @XmlElement(name = "atributosFundamentoLegalDuimp")
    @ApiModelProperty(value = "")
    @Valid
    private List<AtributoFundamentoLegalCover> atributosFundamentoLegalDuimp = null;

    @XmlElement(name = "tributos")
    @ApiModelProperty(value = "")
    @Valid
    private TributosConsultaItemCover tributos = null;

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

    public DuimpItemBalancaComercialCover identificacao(IdentificadorItemDuimpCover identificacao) {
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

    public DuimpItemBalancaComercialCover produto(ProdutoConsultaItemCover produto) {
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

    public DuimpItemBalancaComercialCover caracterizacaoImportacao(CaracterizacaoImportacaoConsultaItemCover caracterizacaoImportacao) {
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

    public DuimpItemBalancaComercialCover indicadorExportadorFabricante(IndicadorExportadorFabricanteCover indicadorExportadorFabricante) {
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

    public DuimpItemBalancaComercialCover fabricante(FabricanteCover fabricante) {
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

    public DuimpItemBalancaComercialCover exportador(ExportadorCover exportador) {
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

    public DuimpItemBalancaComercialCover indicadorCompradorVendedor(IndicadorCompradorVendedorCover indicadorCompradorVendedor) {
        this.indicadorCompradorVendedor = indicadorCompradorVendedor;
        return this;
    }

    /**
     * Get mercadoria
     *
     * @return mercadoria
     **/
    @JsonProperty("mercadoria")
    public MercadoriaCover getMercadoria() {
        return mercadoria;
    }

    public void setMercadoria(MercadoriaCover mercadoria) {
        this.mercadoria = mercadoria;
    }

    public DuimpItemBalancaComercialCover mercadoria(MercadoriaCover mercadoria) {
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

    public DuimpItemBalancaComercialCover condicaoVenda(CondicaoVendaConsultaItemCover condicaoVenda) {
        this.condicaoVenda = condicaoVenda;
        return this;
    }

    /**
     * Get lpcos
     *
     * @return lpcos
     **/
    @JsonProperty("lpcos")
    public List<LpcoCover> getLpcos() {
        return lpcos;
    }

    public void setLpcos(List<LpcoCover> lpcos) {
        this.lpcos = lpcos;
    }

    public DuimpItemBalancaComercialCover lpcos(List<LpcoCover> lpcos) {
        this.lpcos = lpcos;
        return this;
    }

    public DuimpItemBalancaComercialCover addLpcosItem(LpcoCover lpcosItem) {
        this.lpcos.add(lpcosItem);
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

    public DuimpItemBalancaComercialCover dadosCambiais(DadosCambiaisCover dadosCambiais) {
        this.dadosCambiais = dadosCambiais;
        return this;
    }

    /**
     * Get atributosDuimp
     *
     * @return atributosDuimp
     **/
    @JsonProperty("atributosDuimp")
    public List<AtributoItemCover> getAtributosDuimp() {
        return atributosDuimp;
    }

    public void setAtributosDuimp(List<AtributoItemCover> atributosDuimp) {
        this.atributosDuimp = atributosDuimp;
    }

    public DuimpItemBalancaComercialCover atributosDuimp(List<AtributoItemCover> atributosDuimp) {
        this.atributosDuimp = atributosDuimp;
        return this;
    }

    public DuimpItemBalancaComercialCover addAtributosDuimpItem(AtributoItemCover atributosDuimpItem) {
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

    public DuimpItemBalancaComercialCover atributosFundamentoLegalDuimp(List<AtributoFundamentoLegalCover> atributosFundamentoLegalDuimp) {
        this.atributosFundamentoLegalDuimp = atributosFundamentoLegalDuimp;
        return this;
    }

    public DuimpItemBalancaComercialCover addAtributosFundamentoLegalDuimpItem(AtributoFundamentoLegalCover atributosFundamentoLegalDuimpItem) {
        this.atributosFundamentoLegalDuimp.add(atributosFundamentoLegalDuimpItem);
        return this;
    }

    /**
     * Get tributos
     *
     * @return tributos
     **/
    @JsonProperty("tributos")
    public TributosConsultaItemCover getTributos() {
        return tributos;
    }

    public void setTributos(TributosConsultaItemCover tributos) {
        this.tributos = tributos;
    }

    public DuimpItemBalancaComercialCover tributos(TributosConsultaItemCover tributos) {
        this.tributos = tributos;
        return this;
    }


    @Override
    public String toString() {

        String sb = "class DuimpItemBalancaComercialCover {\n" +
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
                "    dadosCambiais: " + toIndentedString(dadosCambiais) + "\n" +
                "    atributosDuimp: " + toIndentedString(atributosDuimp) + "\n" +
                "    atributosFundamentoLegalDuimp: " + toIndentedString(atributosFundamentoLegalDuimp) + "\n" +
                "    tributos: " + toIndentedString(tributos) + "\n" +
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

