package br.gov.siscomex.portalunico.duimp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SefazItemCover", propOrder =
        {"numeroItem", "caracterizacaoImportacao", "dadosProduto", "dadosExportadorEstrangeiro", "informacoesComplementares", "declaracoesExportacaoEstrangeira", "declaracoesVinculadas", "condicaoVendaMercadoria", "dadosCambiais", "itemTributo", "lpcos", "informacoesAdicionais"
        })

@XmlRootElement(name = "SefazItemCover")
/**
 * Dados de um dos itens da Duimp
 **/
@ApiModel(description = "Dados de um dos itens da Duimp")
public class SefazItemCover {

    @XmlElement(name = "numeroItem")
    @ApiModelProperty(example = "00001", value = "Número do item<br>Formato: Inteiro, com até 5 digitos<br>Valor mínimo: 1<br>Valor máximo: 99999")
    /**
     * Número do item<br>Formato: Inteiro, com até 5 digitos<br>Valor mínimo: 1<br>Valor máximo: 99999
     **/
    private String numeroItem = null;

    @XmlElement(name = "caracterizacaoImportacao", required = true)
    @ApiModelProperty(required = true, value = "")
    @Valid
    private SefazCaracterizacaoImportacaoCover caracterizacaoImportacao = null;

    @XmlElement(name = "dadosProduto", required = true)
    @ApiModelProperty(required = true, value = "")
    @Valid
    private SefazProdutoCover dadosProduto = null;

    @XmlElement(name = "dadosExportadorEstrangeiro")
    @ApiModelProperty(value = "")
    @Valid
    private SefazExportadorEstrangeiroCover dadosExportadorEstrangeiro = null;

    @XmlElement(name = "informacoesComplementares")
    @ApiModelProperty(value = "")
    @Valid
    private SefazInformacaoComplementarCover informacoesComplementares = null;

    @XmlElement(name = "declaracoesExportacaoEstrangeira")
    @ApiModelProperty(value = "Lista de declarações estrangeiras")
    @Valid
    /**
     * Lista de declarações estrangeiras
     **/
    private List<SefazCertificadoMercosul> declaracoesExportacaoEstrangeira = null;

    @XmlElement(name = "declaracoesVinculadas")
    @ApiModelProperty(value = "lista de declarações vinculadas")
    @Valid
    /**
     * lista de declarações vinculadas
     **/
    private List<SefazDeclaracaoVinculada> declaracoesVinculadas = null;

    @XmlElement(name = "condicaoVendaMercadoria")
    @ApiModelProperty(value = "")
    @Valid
    private SefazCondicaoVendaMercadoriaCover condicaoVendaMercadoria = null;

    @XmlElement(name = "dadosCambiais", required = true)
    @ApiModelProperty(required = true, value = "")
    @Valid
    private SefazDadosCambiaisCover dadosCambiais = null;

    @XmlElement(name = "itemTributo", required = true)
    @ApiModelProperty(required = true, value = "")
    @Valid
    private SefazItemTributoCover itemTributo = null;

    @XmlElement(name = "lpcos")
    @ApiModelProperty(value = "Lista de LPCOs do item")
    @Valid
    /**
     * Lista de LPCOs do item
     **/
    private List<SefazItemLpcoCover> lpcos = null;

    @XmlElement(name = "informacoesAdicionais", required = true)
    @ApiModelProperty(required = true, value = "")
    @Valid
    private SefazItemInfoAdicinaisCover informacoesAdicionais = null;

    /**
     * Número do item&lt;br&gt;Formato: Inteiro, com até 5 digitos&lt;br&gt;Valor mínimo: 1&lt;br&gt;Valor máximo: 99999
     *
     * @return numeroItem
     **/
    @JsonProperty("numeroItem")
    public String getNumeroItem() {
        return numeroItem;
    }

    public void setNumeroItem(String numeroItem) {
        this.numeroItem = numeroItem;
    }

    public SefazItemCover numeroItem(String numeroItem) {
        this.numeroItem = numeroItem;
        return this;
    }

    /**
     * Get caracterizacaoImportacao
     *
     * @return caracterizacaoImportacao
     **/
    @JsonProperty("caracterizacaoImportacao")
    @NotNull
    public SefazCaracterizacaoImportacaoCover getCaracterizacaoImportacao() {
        return caracterizacaoImportacao;
    }

    public void setCaracterizacaoImportacao(SefazCaracterizacaoImportacaoCover caracterizacaoImportacao) {
        this.caracterizacaoImportacao = caracterizacaoImportacao;
    }

    public SefazItemCover caracterizacaoImportacao(SefazCaracterizacaoImportacaoCover caracterizacaoImportacao) {
        this.caracterizacaoImportacao = caracterizacaoImportacao;
        return this;
    }

    /**
     * Get dadosProduto
     *
     * @return dadosProduto
     **/
    @JsonProperty("dadosProduto")
    @NotNull
    public SefazProdutoCover getDadosProduto() {
        return dadosProduto;
    }

    public void setDadosProduto(SefazProdutoCover dadosProduto) {
        this.dadosProduto = dadosProduto;
    }

    public SefazItemCover dadosProduto(SefazProdutoCover dadosProduto) {
        this.dadosProduto = dadosProduto;
        return this;
    }

    /**
     * Get dadosExportadorEstrangeiro
     *
     * @return dadosExportadorEstrangeiro
     **/
    @JsonProperty("dadosExportadorEstrangeiro")
    public SefazExportadorEstrangeiroCover getDadosExportadorEstrangeiro() {
        return dadosExportadorEstrangeiro;
    }

    public void setDadosExportadorEstrangeiro(SefazExportadorEstrangeiroCover dadosExportadorEstrangeiro) {
        this.dadosExportadorEstrangeiro = dadosExportadorEstrangeiro;
    }

    public SefazItemCover dadosExportadorEstrangeiro(SefazExportadorEstrangeiroCover dadosExportadorEstrangeiro) {
        this.dadosExportadorEstrangeiro = dadosExportadorEstrangeiro;
        return this;
    }

    /**
     * Get informacoesComplementares
     *
     * @return informacoesComplementares
     **/
    @JsonProperty("informacoesComplementares")
    public SefazInformacaoComplementarCover getInformacoesComplementares() {
        return informacoesComplementares;
    }

    public void setInformacoesComplementares(SefazInformacaoComplementarCover informacoesComplementares) {
        this.informacoesComplementares = informacoesComplementares;
    }

    public SefazItemCover informacoesComplementares(SefazInformacaoComplementarCover informacoesComplementares) {
        this.informacoesComplementares = informacoesComplementares;
        return this;
    }

    /**
     * Lista de declarações estrangeiras
     *
     * @return declaracoesExportacaoEstrangeira
     **/
    @JsonProperty("declaracoesExportacaoEstrangeira")
    public List<SefazCertificadoMercosul> getDeclaracoesExportacaoEstrangeira() {
        return declaracoesExportacaoEstrangeira;
    }

    public void setDeclaracoesExportacaoEstrangeira(List<SefazCertificadoMercosul> declaracoesExportacaoEstrangeira) {
        this.declaracoesExportacaoEstrangeira = declaracoesExportacaoEstrangeira;
    }

    public SefazItemCover declaracoesExportacaoEstrangeira(List<SefazCertificadoMercosul> declaracoesExportacaoEstrangeira) {
        this.declaracoesExportacaoEstrangeira = declaracoesExportacaoEstrangeira;
        return this;
    }

    public SefazItemCover addDeclaracoesExportacaoEstrangeiraItem(SefazCertificadoMercosul declaracoesExportacaoEstrangeiraItem) {
        this.declaracoesExportacaoEstrangeira.add(declaracoesExportacaoEstrangeiraItem);
        return this;
    }

    /**
     * lista de declarações vinculadas
     *
     * @return declaracoesVinculadas
     **/
    @JsonProperty("declaracoesVinculadas")
    public List<SefazDeclaracaoVinculada> getDeclaracoesVinculadas() {
        return declaracoesVinculadas;
    }

    public void setDeclaracoesVinculadas(List<SefazDeclaracaoVinculada> declaracoesVinculadas) {
        this.declaracoesVinculadas = declaracoesVinculadas;
    }

    public SefazItemCover declaracoesVinculadas(List<SefazDeclaracaoVinculada> declaracoesVinculadas) {
        this.declaracoesVinculadas = declaracoesVinculadas;
        return this;
    }

    public SefazItemCover addDeclaracoesVinculadasItem(SefazDeclaracaoVinculada declaracoesVinculadasItem) {
        this.declaracoesVinculadas.add(declaracoesVinculadasItem);
        return this;
    }

    /**
     * Get condicaoVendaMercadoria
     *
     * @return condicaoVendaMercadoria
     **/
    @JsonProperty("condicaoVendaMercadoria")
    public SefazCondicaoVendaMercadoriaCover getCondicaoVendaMercadoria() {
        return condicaoVendaMercadoria;
    }

    public void setCondicaoVendaMercadoria(SefazCondicaoVendaMercadoriaCover condicaoVendaMercadoria) {
        this.condicaoVendaMercadoria = condicaoVendaMercadoria;
    }

    public SefazItemCover condicaoVendaMercadoria(SefazCondicaoVendaMercadoriaCover condicaoVendaMercadoria) {
        this.condicaoVendaMercadoria = condicaoVendaMercadoria;
        return this;
    }

    /**
     * Get dadosCambiais
     *
     * @return dadosCambiais
     **/
    @JsonProperty("dadosCambiais")
    @NotNull
    public SefazDadosCambiaisCover getDadosCambiais() {
        return dadosCambiais;
    }

    public void setDadosCambiais(SefazDadosCambiaisCover dadosCambiais) {
        this.dadosCambiais = dadosCambiais;
    }

    public SefazItemCover dadosCambiais(SefazDadosCambiaisCover dadosCambiais) {
        this.dadosCambiais = dadosCambiais;
        return this;
    }

    /**
     * Get itemTributo
     * @return itemTributo
     **/
    @JsonProperty("itemTributo")
    @NotNull
    public SefazItemTributoCover getItemTributo() {
        return itemTributo;
    }

    public void setItemTributo(SefazItemTributoCover itemTributo) {
        this.itemTributo = itemTributo;
    }

    public SefazItemCover itemTributo(SefazItemTributoCover itemTributo) {
        this.itemTributo = itemTributo;
        return this;
    }

    /**
     * Lista de LPCOs do item
     * @return lpcos
     **/
    @JsonProperty("lpcos")
    public List<SefazItemLpcoCover> getLpcos() {
        return lpcos;
    }

    public void setLpcos(List<SefazItemLpcoCover> lpcos) {
        this.lpcos = lpcos;
    }

    public SefazItemCover lpcos(List<SefazItemLpcoCover> lpcos) {
        this.lpcos = lpcos;
        return this;
    }

    public SefazItemCover addLpcosItem(SefazItemLpcoCover lpcosItem) {
        this.lpcos.add(lpcosItem);
        return this;
    }

    /**
     * Get informacoesAdicionais
     *
     * @return informacoesAdicionais
     **/
    @JsonProperty("informacoesAdicionais")
    @NotNull
    public SefazItemInfoAdicinaisCover getInformacoesAdicionais() {
        return informacoesAdicionais;
    }

    public void setInformacoesAdicionais(SefazItemInfoAdicinaisCover informacoesAdicionais) {
        this.informacoesAdicionais = informacoesAdicionais;
    }

    public SefazItemCover informacoesAdicionais(SefazItemInfoAdicinaisCover informacoesAdicionais) {
        this.informacoesAdicionais = informacoesAdicionais;
        return this;
    }


    @Override
    public String toString() {

        String sb = "class SefazItemCover {\n" +
                "    numeroItem: " + toIndentedString(numeroItem) + "\n" +
                "    caracterizacaoImportacao: " + toIndentedString(caracterizacaoImportacao) + "\n" +
                "    dadosProduto: " + toIndentedString(dadosProduto) + "\n" +
                "    dadosExportadorEstrangeiro: " + toIndentedString(dadosExportadorEstrangeiro) + "\n" +
                "    informacoesComplementares: " + toIndentedString(informacoesComplementares) + "\n" +
                "    declaracoesExportacaoEstrangeira: " + toIndentedString(declaracoesExportacaoEstrangeira) + "\n" +
                "    declaracoesVinculadas: " + toIndentedString(declaracoesVinculadas) + "\n" +
                "    condicaoVendaMercadoria: " + toIndentedString(condicaoVendaMercadoria) + "\n" +
                "    dadosCambiais: " + toIndentedString(dadosCambiais) + "\n" +
                "    itemTributo: " + toIndentedString(itemTributo) + "\n" +
                "    lpcos: " + toIndentedString(lpcos) + "\n" +
                "    informacoesAdicionais: " + toIndentedString(informacoesAdicionais) + "\n" +
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

