package br.gov.siscomex.portalunico.dimp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SefazItemCover", propOrder =
        {"numeroItem", "caracterizacaoImportacao", "dadosProduto", "relacaoExportadorFabricante", "vinculacaoCompradorVendedor", "dadosOperadorExportador", "dadosOperadorFabricante", "informacoesComplementares", "declaracoesExportacaoEstrangeira", "declaracoesVinculadas", "condicaoVendaMercadoria", "dadosCambiais", "itemTributo", "lpcos", "dadosInsumoDrawbackIsencao", "informacoesAdicionais"
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
    @XmlElement(name = "relacaoExportadorFabricante")
    @ApiModelProperty(example = "1", value = "Relação exportador x fabricante.<br>Dominio:<br>0 - Exportador é diferente do fabricante,<br>1 - exportador é fabricante")
    /**
     * Relação exportador x fabricante.<br>Dominio:<br>0 - Exportador é diferente do fabricante,<br>1 - exportador é fabricante
     **/
    private RelacaoExportadorFabricanteEnum relacaoExportadorFabricante = null;
    @XmlElement(name = "dadosOperadorFabricante")
    @ApiModelProperty(value = "")
    @Valid
    private SefazOperadorFabricanteCover dadosOperadorFabricante = null;
    @XmlElement(name = "informacoesComplementares")
    @ApiModelProperty(value = "")
    @Valid
    private SefazInformacaoComplementarCover informacoesComplementares = null;

    @XmlElement(name = "vinculacaoCompradorVendedor")
    @ApiModelProperty(example = "1", value = "Vinculação comprador x vendedor.<br>Dominio:<br>1 - Não há vinculação, <br>2 - Vinculação sem influência no preço,<br> 3 - Vinculação com influência no preço")
    /**
     * Vinculação comprador x vendedor.<br>Dominio:<br>1 - Não há vinculação, <br>2 - Vinculação sem influência no preço,<br> 3 - Vinculação com influência no preço
     **/
    private VinculacaoCompradorVendedorEnum vinculacaoCompradorVendedor = null;

    @XmlElement(name = "dadosOperadorExportador")
    @ApiModelProperty(value = "")
    @Valid
    private SefazOperadorExportadorCover dadosOperadorExportador = null;
    @XmlElement(name = "dadosCambiais", required = true)
    @ApiModelProperty(required = true, value = "")
    @Valid
    private SefazDadosCambiaisCover dadosCambiais = null;
    @XmlElement(name = "lpcos")
    @ApiModelProperty(value = "Lista de LPCOs do item")
    @Valid
    /**
     * Lista de LPCOs do item
     **/
    private List<SefazItemLpcoCover> lpcos = null;

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
    @XmlElement(name = "dadosInsumoDrawbackIsencao")
    @ApiModelProperty(value = "")
    @Valid
    private SefazDadosInsumoDrawbackIsencaoCover dadosInsumoDrawbackIsencao = null;

    @XmlElement(name = "itemTributo", required = true)
    @ApiModelProperty(required = true, value = "")
    @Valid
    private SefazItemTributoCover itemTributo = null;
    @XmlElement(name = "informacoesAdicionais", required = true)
    @ApiModelProperty(required = true, value = "")
    @Valid
    private SefazItemInfoAdicinaisCover informacoesAdicionais = null;

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
     * Relação exportador x fabricante.&lt;br&gt;Dominio:&lt;br&gt;0 - Exportador é diferente do fabricante,&lt;br&gt;1 - exportador é fabricante
     *
     * @return relacaoExportadorFabricante
     **/
    @JsonProperty("relacaoExportadorFabricante")
    public String getRelacaoExportadorFabricante() {
        if (relacaoExportadorFabricante == null) {
            return null;
        }
        return relacaoExportadorFabricante.value();
    }

    public void setRelacaoExportadorFabricante(RelacaoExportadorFabricanteEnum relacaoExportadorFabricante) {
        this.relacaoExportadorFabricante = relacaoExportadorFabricante;
    }

    public SefazItemCover relacaoExportadorFabricante(RelacaoExportadorFabricanteEnum relacaoExportadorFabricante) {
        this.relacaoExportadorFabricante = relacaoExportadorFabricante;
        return this;
    }

    /**
     * Get dadosOperadorFabricante
     *
     * @return dadosOperadorFabricante
     **/
    @JsonProperty("dadosOperadorFabricante")
    public SefazOperadorFabricanteCover getDadosOperadorFabricante() {
        return dadosOperadorFabricante;
    }

    /**
     * Vinculação comprador x vendedor.&lt;br&gt;Dominio:&lt;br&gt;1 - Não há vinculação, &lt;br&gt;2 - Vinculação sem influência no preço,&lt;br&gt; 3 - Vinculação com influência no preço
     *
     * @return vinculacaoCompradorVendedor
     **/
    @JsonProperty("vinculacaoCompradorVendedor")
    public String getVinculacaoCompradorVendedor() {
        if (vinculacaoCompradorVendedor == null) {
            return null;
        }
        return vinculacaoCompradorVendedor.value();
    }

    public void setVinculacaoCompradorVendedor(VinculacaoCompradorVendedorEnum vinculacaoCompradorVendedor) {
        this.vinculacaoCompradorVendedor = vinculacaoCompradorVendedor;
    }

    public SefazItemCover vinculacaoCompradorVendedor(VinculacaoCompradorVendedorEnum vinculacaoCompradorVendedor) {
        this.vinculacaoCompradorVendedor = vinculacaoCompradorVendedor;
        return this;
    }

    /**
     * Get dadosOperadorExportador
     *
     * @return dadosOperadorExportador
     **/
    @JsonProperty("dadosOperadorExportador")
    public SefazOperadorExportadorCover getDadosOperadorExportador() {
        return dadosOperadorExportador;
    }

    public void setDadosOperadorExportador(SefazOperadorExportadorCover dadosOperadorExportador) {
        this.dadosOperadorExportador = dadosOperadorExportador;
    }

    public SefazItemCover dadosOperadorExportador(SefazOperadorExportadorCover dadosOperadorExportador) {
        this.dadosOperadorExportador = dadosOperadorExportador;
        return this;
    }

    public void setDadosOperadorFabricante(SefazOperadorFabricanteCover dadosOperadorFabricante) {
        this.dadosOperadorFabricante = dadosOperadorFabricante;
    }

    public SefazItemCover dadosOperadorFabricante(SefazOperadorFabricanteCover dadosOperadorFabricante) {
        this.dadosOperadorFabricante = dadosOperadorFabricante;
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
     * Get dadosCambiais
     *
     * @return dadosCambiais
     **/
    @JsonProperty("dadosCambiais")
    @NotNull
    public SefazDadosCambiaisCover getDadosCambiais() {
        return dadosCambiais;
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

    public void setDadosCambiais(SefazDadosCambiaisCover dadosCambiais) {
        this.dadosCambiais = dadosCambiais;
    }

    public SefazItemCover dadosCambiais(SefazDadosCambiaisCover dadosCambiais) {
        this.dadosCambiais = dadosCambiais;
        return this;
    }

    /**
     * Lista de LPCOs do item
     *
     * @return lpcos
     **/
    @JsonProperty("lpcos")
    public List<SefazItemLpcoCover> getLpcos() {
        return lpcos;
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
     * Get dadosInsumoDrawbackIsencao
     *
     * @return dadosInsumoDrawbackIsencao
     **/
    @JsonProperty("dadosInsumoDrawbackIsencao")
    public SefazDadosInsumoDrawbackIsencaoCover getDadosInsumoDrawbackIsencao() {
        return dadosInsumoDrawbackIsencao;
    }

    public void setDadosInsumoDrawbackIsencao(SefazDadosInsumoDrawbackIsencaoCover dadosInsumoDrawbackIsencao) {
        this.dadosInsumoDrawbackIsencao = dadosInsumoDrawbackIsencao;
    }

    public SefazItemCover dadosInsumoDrawbackIsencao(SefazDadosInsumoDrawbackIsencaoCover dadosInsumoDrawbackIsencao) {
        this.dadosInsumoDrawbackIsencao = dadosInsumoDrawbackIsencao;
        return this;
    }

    /**
     * Get informacoesAdicionais
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
                "    relacaoExportadorFabricante: " + toIndentedString(relacaoExportadorFabricante) + "\n" +
                "    vinculacaoCompradorVendedor: " + toIndentedString(vinculacaoCompradorVendedor) + "\n" +
                "    dadosOperadorExportador: " + toIndentedString(dadosOperadorExportador) + "\n" +
                "    dadosOperadorFabricante: " + toIndentedString(dadosOperadorFabricante) + "\n" +
                "    informacoesComplementares: " + toIndentedString(informacoesComplementares) + "\n" +
                "    declaracoesExportacaoEstrangeira: " + toIndentedString(declaracoesExportacaoEstrangeira) + "\n" +
                "    declaracoesVinculadas: " + toIndentedString(declaracoesVinculadas) + "\n" +
                "    condicaoVendaMercadoria: " + toIndentedString(condicaoVendaMercadoria) + "\n" +
                "    dadosCambiais: " + toIndentedString(dadosCambiais) + "\n" +
                "    itemTributo: " + toIndentedString(itemTributo) + "\n" +
                "    lpcos: " + toIndentedString(lpcos) + "\n" +
                "    dadosInsumoDrawbackIsencao: " + toIndentedString(dadosInsumoDrawbackIsencao) + "\n" +
                "    informacoesAdicionais: " + toIndentedString(informacoesAdicionais) + "\n" +
                "}";
        return sb;
    }


    @XmlType(name = "RelacaoExportadorFabricanteEnum")
    @XmlEnum(String.class)
    public enum RelacaoExportadorFabricanteEnum {

        @XmlEnumValue("0")
        @JsonProperty("0")
        _0("0"),

        @XmlEnumValue("1")
        @JsonProperty("1")
        _1("1");


        private final String value;

        RelacaoExportadorFabricanteEnum(String v) {
            value = v;
        }

        public static RelacaoExportadorFabricanteEnum fromValue(String v) {
            for (RelacaoExportadorFabricanteEnum b : RelacaoExportadorFabricanteEnum.values()) {
                if (String.valueOf(b.value).equals(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "' to RelacaoExportadorFabricanteEnum");
        }

        public String value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
    }

    @XmlType(name = "VinculacaoCompradorVendedorEnum")
    @XmlEnum(String.class)
    public enum VinculacaoCompradorVendedorEnum {

        @XmlEnumValue("1")
        @JsonProperty("1")
        _1("1"),

        @XmlEnumValue("2")
        @JsonProperty("2")
        _2("2"),

        @XmlEnumValue("3")
        @JsonProperty("3")
        _3("3");


        private final String value;

        VinculacaoCompradorVendedorEnum(String v) {
            value = v;
        }

        public static VinculacaoCompradorVendedorEnum fromValue(String v) {
            for (VinculacaoCompradorVendedorEnum b : VinculacaoCompradorVendedorEnum.values()) {
                if (String.valueOf(b.value).equals(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "' to VinculacaoCompradorVendedorEnum");
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
