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
@XmlType(name = "CargaRodoviariaItemCarga", propOrder =
        {"embalagemVazia", "sequencial", "quantidadeVolumes", "tipoEmbalagem", "tipoTratamentoMadeiraBruta", "medidaConteiner", "contramarca", "numeroConteiner", "taraConteiner", "conteinerVazio", "descricao", "possuiEmbalagemSuporteMadeiraBruta", "marca", "chassi", "pesoBruto", "pesoConteiner", "pesoLiquido", "tipoGranel"
        })

@XmlRootElement(name = "CargaRodoviariaItemCarga")
public class CargaRodoviariaItemCarga {

    @XmlElement(name = "embalagemVazia")
    @ApiModelProperty(example = "false", value = "Indicador de embalagem vazia de carga solta</br>Para item Carga Solta (2), campo obrigatório")
    /**
     * Indicador de embalagem vazia de carga solta</br>Para item Carga Solta (2), campo obrigatório
     **/
    private Boolean embalagemVazia = null;

    @XmlElement(name = "sequencial")
    @ApiModelProperty(value = "Sequencial de item de carga da viagem<br/> Tamanho Máximo: 20")
    @Valid
    /**
     * Sequencial de item de carga da viagem<br/> Tamanho Máximo: 20
     **/
    private BigDecimal sequencial = null;

    @XmlElement(name = "quantidadeVolumes")
    @ApiModelProperty(value = "Quantidade de volumes do item de carga transportado na viagempara tipocarga = 2 preenchimento obrigatório<br/> Tamanho Máximo: 4")
    /**
     * Quantidade de volumes do item de carga transportado na viagempara tipocarga = 2 preenchimento obrigatório<br/> Tamanho Máximo: 4
     **/
    private Integer quantidadeVolumes = null;

    @XmlElement(name = "tipoEmbalagem")
    @ApiModelProperty(value = "")
    @Valid
    private TipoEmbalagem tipoEmbalagem = null;

    @XmlElement(name = "tipoTratamentoMadeiraBruta")
    @ApiModelProperty(value = "")
    @Valid
    private TipoTratamentoMadeira tipoTratamentoMadeiraBruta = null;

    @XmlElement(name = "medidaConteiner")
    @ApiModelProperty(example = "20", value = "Medida do conteiner<br/>para \"tipoItemCRT\" = 1 <br/>preenchimento obrigatório 20 (20 pés) ou 40 (40 pés)<br/>Tamanho Máximo: 2")
    /**
     * Medida do conteiner<br/>para \"tipoItemCRT\" = 1 <br/>preenchimento obrigatório 20 (20 pés) ou 40 (40 pés)<br/>Tamanho Máximo: 2
     **/
    private String medidaConteiner = null;

    @XmlElement(name = "contramarca")
    @ApiModelProperty(example = "TCROSS", value = "Nome da contramarca do item de carga<br/>para \"tipoItemCRT\" = 4 preenchimento obrigatório<br/> Tamanho Máximo: 55")
    /**
     * Nome da contramarca do item de carga<br/>para \"tipoItemCRT\" = 4 preenchimento obrigatório<br/> Tamanho Máximo: 55
     **/
    private String contramarca = null;

    @XmlElement(name = "numeroConteiner")
    @ApiModelProperty(example = "AG48569701", value = "Identificação do conteiner transportado na viagem.para tipocarga = 1 preenchimento obrigatório<br/> Tamanho Máximo: 11")
    /**
     * Identificação do conteiner transportado na viagem.para tipocarga = 1 preenchimento obrigatório<br/> Tamanho Máximo: 11
     **/
    private String numeroConteiner = null;

    @XmlElement(name = "taraConteiner")
    @ApiModelProperty(example = "20.0", value = "Tara do conteiner em Kg<br/>para \"tipoItemCRT\" = 1 preenchimento obrigatório<br/>Formato: Número Racional com 6 casas inteiras e 3 casas decimais")
    @Valid
    /**
     * Tara do conteiner em Kg<br/>para \"tipoItemCRT\" = 1 preenchimento obrigatório<br/>Formato: Número Racional com 6 casas inteiras e 3 casas decimais
     **/
    private BigDecimal taraConteiner = null;

    @XmlElement(name = "conteinerVazio")
    @ApiModelProperty(example = "false", value = "Indica se conteiner está vazio<br/>para \"tipoItemCRT\" = 1 preenchimento obrigatório")
    /**
     * Indica se conteiner está vazio<br/>para \"tipoItemCRT\" = 1 preenchimento obrigatório
     **/
    private Boolean conteinerVazio = null;

    @XmlElement(name = "descricao")
    @ApiModelProperty(value = "Descrição do tipo de item de carga do CRT")
    /**
     * Descrição do tipo de item de carga do CRT
     **/
    private String descricao = null;

    @XmlElement(name = "possuiEmbalagemSuporteMadeiraBruta")
    @ApiModelProperty(example = "false", value = "Indica se o item de carga está sendo transportado em embalagem/suporte de madeira bruta")
    /**
     * Indica se o item de carga está sendo transportado em embalagem/suporte de madeira bruta
     **/
    private Boolean possuiEmbalagemSuporteMadeiraBruta = null;

    @XmlElement(name = "marca")
    @ApiModelProperty(example = "VW", value = "Marca do veículo da viagem<br/> Tamanho Máximo: 20")
    /**
     * Marca do veículo da viagem<br/> Tamanho Máximo: 20
     **/
    private String marca = null;

    @XmlElement(name = "chassi")
    @ApiModelProperty(example = "2WXR0U5O8S8SRRB8P", value = "Chassi do veículo da viagem<br/> Tamanho Máximo: 20")
    /**
     * Chassi do veículo da viagem<br/> Tamanho Máximo: 20
     **/
    private String chassi = null;

    @XmlElement(name = "pesoBruto")
    @ApiModelProperty(example = "105.478", value = "Peso bruto da carga em KG<br/>Formato: Número Racional com 9 casas inteiras e 3 casas decimais")
    @Valid
    /**
     * Peso bruto da carga em KG<br/>Formato: Número Racional com 9 casas inteiras e 3 casas decimais
     **/
    private BigDecimal pesoBruto = null;

    @XmlElement(name = "pesoConteiner")
    @ApiModelProperty(example = "30.0", value = "Peso do conteiner")
    @Valid
    /**
     * Peso do conteiner
     **/
    private BigDecimal pesoConteiner = null;

    @XmlElement(name = "pesoLiquido")
    @ApiModelProperty(example = "105.478", value = "Peso líquido do item de carga em Kg<br/>Formato: Número Racional com 9 casas inteiras e 3 casas decimais")
    @Valid
    /**
     * Peso líquido do item de carga em Kg<br/>Formato: Número Racional com 9 casas inteiras e 3 casas decimais
     **/
    private BigDecimal pesoLiquido = null;

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

    public CargaRodoviariaItemCarga embalagemVazia(Boolean embalagemVazia) {
        this.embalagemVazia = embalagemVazia;
        return this;
    }

    /**
     * Sequencial de item de carga da viagem&lt;br/&gt; Tamanho Máximo: 20
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

    public CargaRodoviariaItemCarga sequencial(BigDecimal sequencial) {
        this.sequencial = sequencial;
        return this;
    }

    /**
     * Quantidade de volumes do item de carga transportado na viagempara tipocarga &#x3D; 2 preenchimento obrigatório&lt;br/&gt; Tamanho Máximo: 4
     *
     * @return quantidadeVolumes
     **/
    @JsonProperty("quantidadeVolumes")
    public Integer getQuantidadeVolumes() {
        return quantidadeVolumes;
    }

    public void setQuantidadeVolumes(Integer quantidadeVolumes) {
        this.quantidadeVolumes = quantidadeVolumes;
    }

    public CargaRodoviariaItemCarga quantidadeVolumes(Integer quantidadeVolumes) {
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

    public CargaRodoviariaItemCarga tipoEmbalagem(TipoEmbalagem tipoEmbalagem) {
        this.tipoEmbalagem = tipoEmbalagem;
        return this;
    }

    /**
     * Get tipoTratamentoMadeiraBruta
     *
     * @return tipoTratamentoMadeiraBruta
     **/
    @JsonProperty("tipoTratamentoMadeiraBruta")
    public TipoTratamentoMadeira getTipoTratamentoMadeiraBruta() {
        return tipoTratamentoMadeiraBruta;
    }

    public void setTipoTratamentoMadeiraBruta(TipoTratamentoMadeira tipoTratamentoMadeiraBruta) {
        this.tipoTratamentoMadeiraBruta = tipoTratamentoMadeiraBruta;
    }

    public CargaRodoviariaItemCarga tipoTratamentoMadeiraBruta(TipoTratamentoMadeira tipoTratamentoMadeiraBruta) {
        this.tipoTratamentoMadeiraBruta = tipoTratamentoMadeiraBruta;
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

    public CargaRodoviariaItemCarga medidaConteiner(String medidaConteiner) {
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

    public CargaRodoviariaItemCarga contramarca(String contramarca) {
        this.contramarca = contramarca;
        return this;
    }

    /**
     * Identificação do conteiner transportado na viagem.para tipocarga &#x3D; 1 preenchimento obrigatório&lt;br/&gt; Tamanho Máximo: 11
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

    public CargaRodoviariaItemCarga numeroConteiner(String numeroConteiner) {
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

    public CargaRodoviariaItemCarga taraConteiner(BigDecimal taraConteiner) {
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

    public CargaRodoviariaItemCarga conteinerVazio(Boolean conteinerVazio) {
        this.conteinerVazio = conteinerVazio;
        return this;
    }

    /**
     * Descrição do tipo de item de carga do CRT
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

    public CargaRodoviariaItemCarga descricao(String descricao) {
        this.descricao = descricao;
        return this;
    }

    /**
     * Indica se o item de carga está sendo transportado em embalagem/suporte de madeira bruta
     *
     * @return possuiEmbalagemSuporteMadeiraBruta
     **/
    @JsonProperty("possuiEmbalagemSuporteMadeiraBruta")
    public Boolean isisPossuiEmbalagemSuporteMadeiraBruta() {
        return possuiEmbalagemSuporteMadeiraBruta;
    }

    public void setPossuiEmbalagemSuporteMadeiraBruta(Boolean possuiEmbalagemSuporteMadeiraBruta) {
        this.possuiEmbalagemSuporteMadeiraBruta = possuiEmbalagemSuporteMadeiraBruta;
    }

    public CargaRodoviariaItemCarga possuiEmbalagemSuporteMadeiraBruta(Boolean possuiEmbalagemSuporteMadeiraBruta) {
        this.possuiEmbalagemSuporteMadeiraBruta = possuiEmbalagemSuporteMadeiraBruta;
        return this;
    }

    /**
     * Marca do veículo da viagem&lt;br/&gt; Tamanho Máximo: 20
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

    public CargaRodoviariaItemCarga marca(String marca) {
        this.marca = marca;
        return this;
    }

    /**
     * Chassi do veículo da viagem&lt;br/&gt; Tamanho Máximo: 20
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

    public CargaRodoviariaItemCarga chassi(String chassi) {
        this.chassi = chassi;
        return this;
    }

    /**
     * Peso bruto da carga em KG&lt;br/&gt;Formato: Número Racional com 9 casas inteiras e 3 casas decimais
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

    public CargaRodoviariaItemCarga pesoBruto(BigDecimal pesoBruto) {
        this.pesoBruto = pesoBruto;
        return this;
    }

    /**
     * Peso do conteiner
     *
     * @return pesoConteiner
     **/
    @JsonProperty("pesoConteiner")
    public BigDecimal getPesoConteiner() {
        return pesoConteiner;
    }

    public void setPesoConteiner(BigDecimal pesoConteiner) {
        this.pesoConteiner = pesoConteiner;
    }

    public CargaRodoviariaItemCarga pesoConteiner(BigDecimal pesoConteiner) {
        this.pesoConteiner = pesoConteiner;
        return this;
    }

    /**
     * Peso líquido do item de carga em Kg&lt;br/&gt;Formato: Número Racional com 9 casas inteiras e 3 casas decimais
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

    public CargaRodoviariaItemCarga pesoLiquido(BigDecimal pesoLiquido) {
        this.pesoLiquido = pesoLiquido;
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

    public CargaRodoviariaItemCarga tipoGranel(TipoGranel tipoGranel) {
        this.tipoGranel = tipoGranel;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class CargaRodoviariaItemCarga {\n" +
                "    embalagemVazia: " + toIndentedString(embalagemVazia) + "\n" +
                "    sequencial: " + toIndentedString(sequencial) + "\n" +
                "    quantidadeVolumes: " + toIndentedString(quantidadeVolumes) + "\n" +
                "    tipoEmbalagem: " + toIndentedString(tipoEmbalagem) + "\n" +
                "    tipoTratamentoMadeiraBruta: " + toIndentedString(tipoTratamentoMadeiraBruta) + "\n" +
                "    medidaConteiner: " + toIndentedString(medidaConteiner) + "\n" +
                "    contramarca: " + toIndentedString(contramarca) + "\n" +
                "    numeroConteiner: " + toIndentedString(numeroConteiner) + "\n" +
                "    taraConteiner: " + toIndentedString(taraConteiner) + "\n" +
                "    conteinerVazio: " + toIndentedString(conteinerVazio) + "\n" +
                "    descricao: " + toIndentedString(descricao) + "\n" +
                "    possuiEmbalagemSuporteMadeiraBruta: " + toIndentedString(possuiEmbalagemSuporteMadeiraBruta) + "\n" +
                "    marca: " + toIndentedString(marca) + "\n" +
                "    chassi: " + toIndentedString(chassi) + "\n" +
                "    pesoBruto: " + toIndentedString(pesoBruto) + "\n" +
                "    pesoConteiner: " + toIndentedString(pesoConteiner) + "\n" +
                "    pesoLiquido: " + toIndentedString(pesoLiquido) + "\n" +
                "    tipoGranel: " + toIndentedString(tipoGranel) + "\n" +
                "}";
        return sb;
    }
}
