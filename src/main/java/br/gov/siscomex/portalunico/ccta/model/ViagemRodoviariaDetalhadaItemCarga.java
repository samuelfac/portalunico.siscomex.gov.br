package br.gov.siscomex.portalunico.ccta.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ViagemRodoviariaDetalhadaItemCarga", propOrder =
        {"embalagemVazia", "sequencial", "quantidadeVolumes", "tipoEmbalagem", "medidaConteiner", "contramarca", "numeroConteiner", "taraConteiner", "conteinerVazio", "descricao", "marca", "lacresConteiner", "chassi", "pesoBruto", "tipoGranel"
        })

@XmlRootElement(name = "ViagemRodoviariaDetalhadaItemCarga")
public class ViagemRodoviariaDetalhadaItemCarga {

    @XmlElement(name = "embalagemVazia")
    @ApiModelProperty(value = "Indicador de embalagem vazia de carga solta</br>Para item Carga Solta (2), campo obrigatório")
    /**
     * Indicador de embalagem vazia de carga solta</br>Para item Carga Solta (2), campo obrigatório
     **/
    private Boolean embalagemVazia = null;

    @XmlElement(name = "sequencial")
    @ApiModelProperty(example = "1.0", value = "Número sequencial do item de carga<br/> Tamanho Máximo: 4")
    @Valid
    /**
     * Número sequencial do item de carga<br/> Tamanho Máximo: 4
     **/
    private BigDecimal sequencial = null;

    @XmlElement(name = "quantidadeVolumes")
    @ApiModelProperty(example = "1.0", value = "Quantidade de volumes do item de carga<br/> para \"tipoItemCRT\" = 2 preenchimento obrigatório<br/> Tamanho Máximo: 4")
    @Valid
    /**
     * Quantidade de volumes do item de carga<br/> para \"tipoItemCRT\" = 2 preenchimento obrigatório<br/> Tamanho Máximo: 4
     **/
    private BigDecimal quantidadeVolumes = null;

    @XmlElement(name = "tipoEmbalagem")
    @ApiModelProperty(value = "")
    @Valid
    private TipoEmbalagem tipoEmbalagem = null;

    @XmlElement(name = "medidaConteiner")
    @ApiModelProperty(example = "20", value = "Medida do conteiner<br/>para \"tipoItemCRT\" = 1 <br/>preenchimento obrigatório 20 (20 pés) ou 40 (40 pés)<br/>Tamanho Máximo: 2")
    /**
     * Medida do conteiner<br/>para \"tipoItemCRT\" = 1 <br/>preenchimento obrigatório 20 (20 pés) ou 40 (40 pés)<br/>Tamanho Máximo: 2
     **/
    private String medidaConteiner = null;

    @XmlElement(name = "contramarca")
    @ApiModelProperty(value = "Nome da contramarca do item de carga<br/>para \"tipoItemCRT\" = 4 preenchimento obrigatório<br/> Tamanho Máximo: 55")
    /**
     * Nome da contramarca do item de carga<br/>para \"tipoItemCRT\" = 4 preenchimento obrigatório<br/> Tamanho Máximo: 55
     **/
    private String contramarca = null;

    @XmlElement(name = "numeroConteiner")
    @ApiModelProperty(example = "AG48569701", value = "Número de identificação do conteiner<br/>para \"tipoItemCRT\" = 1 preenchimento obrigatório<br/> Se o número do conteiner preenchido com 11 posições, o DV deverá estar válido<br/> Tamanho Máximo: 11")
    /**
     * Número de identificação do conteiner<br/>para \"tipoItemCRT\" = 1 preenchimento obrigatório<br/> Se o número do conteiner preenchido com 11 posições, o DV deverá estar válido<br/> Tamanho Máximo: 11
     **/
    private String numeroConteiner = null;

    @XmlElement(name = "taraConteiner")
    @ApiModelProperty(example = "105.478", value = "Tara do conteiner em Kg<br/>para \"tipoItemCRT\" = 1 preenchimento obrigatório<br/>Formato: Número Racional com 6 casas inteiras e 3 casas decimais")
    @Valid
    /**
     * Tara do conteiner em Kg<br/>para \"tipoItemCRT\" = 1 preenchimento obrigatório<br/>Formato: Número Racional com 6 casas inteiras e 3 casas decimais
     **/
    private BigDecimal taraConteiner = null;

    @XmlElement(name = "conteinerVazio")
    @ApiModelProperty(value = "Indica se conteiner está vazio<br/>para \"tipoItemCRT\" = 1 preenchimento obrigatório")
    /**
     * Indica se conteiner está vazio<br/>para \"tipoItemCRT\" = 1 preenchimento obrigatório
     **/
    private Boolean conteinerVazio = null;

    @XmlElement(name = "descricao")
    @ApiModelProperty(value = "Descrição do item de carga<br/> Tamanho Máximo: 500")
    /**
     * Descrição do item de carga<br/> Tamanho Máximo: 500
     **/
    private String descricao = null;

    @XmlElement(name = "marca")
    @ApiModelProperty(value = "Nome da marca do item de carga<br/>para \"tipoItemCRT\" = 4 preenchimento obrigatório<br/> Tamanho Máximo: 55")
    /**
     * Nome da marca do item de carga<br/>para \"tipoItemCRT\" = 4 preenchimento obrigatório<br/> Tamanho Máximo: 55
     **/
    private String marca = null;

    @XmlElement(name = "lacresConteiner")
    @ApiModelProperty(example = "", value = "")
    private String lacresConteiner = null;

    @XmlElement(name = "chassi")
    @ApiModelProperty(example = "2WXR0U5O8S8SRRB8P", value = "Número do chassi do veículopara \"tipoItemCRT\" = 4 preenchimento obrigatório<br/> Tamanho Máximo: 30")
    /**
     * Número do chassi do veículopara \"tipoItemCRT\" = 4 preenchimento obrigatório<br/> Tamanho Máximo: 30
     **/
    private String chassi = null;

    @XmlElement(name = "pesoBruto")
    @ApiModelProperty(example = "105.478", value = "Peso bruto do item de carga em Kg<br/>Formato: Número Racional com 9 casas inteiras e 3 casas decimais")
    @Valid
    /**
     * Peso bruto do item de carga em Kg<br/>Formato: Número Racional com 9 casas inteiras e 3 casas decimais
     **/
    private BigDecimal pesoBruto = null;

    @XmlElement(name = "tipoGranel")
    @ApiModelProperty(value = "")
    @Valid
    private TipoGranel tipoGranel = null;

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
     * Indicador de embalagem vazia de carga solta&lt;/br&gt;Para item Carga Solta (2), campo obrigatório
     *
     * @return embalagemVazia
     **/
    @JsonProperty("embalagemVazia")
    public Boolean isisEmbalagemVazia() {
        return embalagemVazia;
    }

    public void setEmbalagemVazia(Boolean embalagemVazia) {
        this.embalagemVazia = embalagemVazia;
    }

    public ViagemRodoviariaDetalhadaItemCarga embalagemVazia(Boolean embalagemVazia) {
        this.embalagemVazia = embalagemVazia;
        return this;
    }

    /**
     * Número sequencial do item de carga&lt;br/&gt; Tamanho Máximo: 4
     *
     * @return sequencial
     **/
    @JsonProperty("sequencial")
    public BigDecimal getSequencial() {
        return sequencial;
    }

    public void setSequencial(BigDecimal sequencial) {
        this.sequencial = sequencial;
    }

    public ViagemRodoviariaDetalhadaItemCarga sequencial(BigDecimal sequencial) {
        this.sequencial = sequencial;
        return this;
    }

    /**
     * Quantidade de volumes do item de carga&lt;br/&gt; para \&quot;tipoItemCRT\&quot; &#x3D; 2 preenchimento obrigatório&lt;br/&gt; Tamanho Máximo: 4
     *
     * @return quantidadeVolumes
     **/
    @JsonProperty("quantidadeVolumes")
    public BigDecimal getQuantidadeVolumes() {
        return quantidadeVolumes;
    }

    public void setQuantidadeVolumes(BigDecimal quantidadeVolumes) {
        this.quantidadeVolumes = quantidadeVolumes;
    }

    public ViagemRodoviariaDetalhadaItemCarga quantidadeVolumes(BigDecimal quantidadeVolumes) {
        this.quantidadeVolumes = quantidadeVolumes;
        return this;
    }

    /**
     * Get tipoEmbalagem
     *
     * @return tipoEmbalagem
     **/
    @JsonProperty("tipoEmbalagem")
    public TipoEmbalagem getTipoEmbalagem() {
        return tipoEmbalagem;
    }

    public void setTipoEmbalagem(TipoEmbalagem tipoEmbalagem) {
        this.tipoEmbalagem = tipoEmbalagem;
    }

    public ViagemRodoviariaDetalhadaItemCarga tipoEmbalagem(TipoEmbalagem tipoEmbalagem) {
        this.tipoEmbalagem = tipoEmbalagem;
        return this;
    }

    /**
     * Medida do conteiner&lt;br/&gt;para \&quot;tipoItemCRT\&quot; &#x3D; 1 &lt;br/&gt;preenchimento obrigatório 20 (20 pés) ou 40 (40 pés)&lt;br/&gt;Tamanho Máximo: 2
     *
     * @return medidaConteiner
     **/
    @JsonProperty("medidaConteiner")
    public String getMedidaConteiner() {
        return medidaConteiner;
    }

    public void setMedidaConteiner(String medidaConteiner) {
        this.medidaConteiner = medidaConteiner;
    }

    public ViagemRodoviariaDetalhadaItemCarga medidaConteiner(String medidaConteiner) {
        this.medidaConteiner = medidaConteiner;
        return this;
    }

    /**
     * Nome da contramarca do item de carga&lt;br/&gt;para \&quot;tipoItemCRT\&quot; &#x3D; 4 preenchimento obrigatório&lt;br/&gt; Tamanho Máximo: 55
     *
     * @return contramarca
     **/
    @JsonProperty("contramarca")
    public String getContramarca() {
        return contramarca;
    }

    public void setContramarca(String contramarca) {
        this.contramarca = contramarca;
    }

    public ViagemRodoviariaDetalhadaItemCarga contramarca(String contramarca) {
        this.contramarca = contramarca;
        return this;
    }

    /**
     * Número de identificação do conteiner&lt;br/&gt;para \&quot;tipoItemCRT\&quot; &#x3D; 1 preenchimento obrigatório&lt;br/&gt; Se o número do conteiner preenchido com 11 posições, o DV deverá estar válido&lt;br/&gt; Tamanho Máximo: 11
     *
     * @return numeroConteiner
     **/
    @JsonProperty("numeroConteiner")
    public String getNumeroConteiner() {
        return numeroConteiner;
    }

    public void setNumeroConteiner(String numeroConteiner) {
        this.numeroConteiner = numeroConteiner;
    }

    public ViagemRodoviariaDetalhadaItemCarga numeroConteiner(String numeroConteiner) {
        this.numeroConteiner = numeroConteiner;
        return this;
    }

    /**
     * Tara do conteiner em Kg&lt;br/&gt;para \&quot;tipoItemCRT\&quot; &#x3D; 1 preenchimento obrigatório&lt;br/&gt;Formato: Número Racional com 6 casas inteiras e 3 casas decimais
     *
     * @return taraConteiner
     **/
    @JsonProperty("taraConteiner")
    public BigDecimal getTaraConteiner() {
        return taraConteiner;
    }

    public void setTaraConteiner(BigDecimal taraConteiner) {
        this.taraConteiner = taraConteiner;
    }

    public ViagemRodoviariaDetalhadaItemCarga taraConteiner(BigDecimal taraConteiner) {
        this.taraConteiner = taraConteiner;
        return this;
    }

    /**
     * Indica se conteiner está vazio&lt;br/&gt;para \&quot;tipoItemCRT\&quot; &#x3D; 1 preenchimento obrigatório
     *
     * @return conteinerVazio
     **/
    @JsonProperty("conteinerVazio")
    public Boolean isisConteinerVazio() {
        return conteinerVazio;
    }

    public void setConteinerVazio(Boolean conteinerVazio) {
        this.conteinerVazio = conteinerVazio;
    }

    public ViagemRodoviariaDetalhadaItemCarga conteinerVazio(Boolean conteinerVazio) {
        this.conteinerVazio = conteinerVazio;
        return this;
    }

    /**
     * Descrição do item de carga&lt;br/&gt; Tamanho Máximo: 500
     *
     * @return descricao
     **/
    @JsonProperty("descricao")
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public ViagemRodoviariaDetalhadaItemCarga descricao(String descricao) {
        this.descricao = descricao;
        return this;
    }

    /**
     * Nome da marca do item de carga&lt;br/&gt;para \&quot;tipoItemCRT\&quot; &#x3D; 4 preenchimento obrigatório&lt;br/&gt; Tamanho Máximo: 55
     *
     * @return marca
     **/
    @JsonProperty("marca")
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public ViagemRodoviariaDetalhadaItemCarga marca(String marca) {
        this.marca = marca;
        return this;
    }

    /**
     * Get lacresConteiner
     *
     * @return lacresConteiner
     **/
    @JsonProperty("lacresConteiner")
    public String getLacresConteiner() {
        return lacresConteiner;
    }

    public void setLacresConteiner(String lacresConteiner) {
        this.lacresConteiner = lacresConteiner;
    }

    public ViagemRodoviariaDetalhadaItemCarga lacresConteiner(String lacresConteiner) {
        this.lacresConteiner = lacresConteiner;
        return this;
    }

    /**
     * Número do chassi do veículopara \&quot;tipoItemCRT\&quot; &#x3D; 4 preenchimento obrigatório&lt;br/&gt; Tamanho Máximo: 30
     *
     * @return chassi
     **/
    @JsonProperty("chassi")
    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public ViagemRodoviariaDetalhadaItemCarga chassi(String chassi) {
        this.chassi = chassi;
        return this;
    }

    /**
     * Peso bruto do item de carga em Kg&lt;br/&gt;Formato: Número Racional com 9 casas inteiras e 3 casas decimais
     *
     * @return pesoBruto
     **/
    @JsonProperty("pesoBruto")
    public BigDecimal getPesoBruto() {
        return pesoBruto;
    }

    public void setPesoBruto(BigDecimal pesoBruto) {
        this.pesoBruto = pesoBruto;
    }

    public ViagemRodoviariaDetalhadaItemCarga pesoBruto(BigDecimal pesoBruto) {
        this.pesoBruto = pesoBruto;
        return this;
    }

    /**
     * Get tipoGranel
     *
     * @return tipoGranel
     **/
    @JsonProperty("tipoGranel")
    public TipoGranel getTipoGranel() {
        return tipoGranel;
    }

    public void setTipoGranel(TipoGranel tipoGranel) {
        this.tipoGranel = tipoGranel;
    }

    public ViagemRodoviariaDetalhadaItemCarga tipoGranel(TipoGranel tipoGranel) {
        this.tipoGranel = tipoGranel;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class ViagemRodoviariaDetalhadaItemCarga {\n" +
                "    embalagemVazia: " + toIndentedString(embalagemVazia) + "\n" +
                "    sequencial: " + toIndentedString(sequencial) + "\n" +
                "    quantidadeVolumes: " + toIndentedString(quantidadeVolumes) + "\n" +
                "    tipoEmbalagem: " + toIndentedString(tipoEmbalagem) + "\n" +
                "    medidaConteiner: " + toIndentedString(medidaConteiner) + "\n" +
                "    contramarca: " + toIndentedString(contramarca) + "\n" +
                "    numeroConteiner: " + toIndentedString(numeroConteiner) + "\n" +
                "    taraConteiner: " + toIndentedString(taraConteiner) + "\n" +
                "    conteinerVazio: " + toIndentedString(conteinerVazio) + "\n" +
                "    descricao: " + toIndentedString(descricao) + "\n" +
                "    marca: " + toIndentedString(marca) + "\n" +
                "    lacresConteiner: " + toIndentedString(lacresConteiner) + "\n" +
                "    chassi: " + toIndentedString(chassi) + "\n" +
                "    pesoBruto: " + toIndentedString(pesoBruto) + "\n" +
                "    tipoGranel: " + toIndentedString(tipoGranel) + "\n" +
                "}";
        return sb;
    }
}
