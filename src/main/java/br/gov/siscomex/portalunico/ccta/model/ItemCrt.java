package br.gov.siscomex.portalunico.ccta.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemCrt", propOrder =
        {"conteinerVazio", "contramarca", "descricao", "embalagemVazia", "marca", "medidaConteiner", "numeroChassiVeiculo", "numeroConteiner", "pesoBrutoKg", "pesoLiquido", "possuiEmbalagemSuporteMadeiraBruta", "qtdeVolumesTotalManifestada", "sequencial", "taraConteiner", "tipoEmbalagem", "tipoGranel", "tipoTratamentoMadeiraBruta"
        })

@XmlRootElement(name = "ItemCrt")
public class ItemCrt {

    @XmlElement(name = "conteinerVazio")
    @ApiModelProperty(value = "Indica se conteiner está vazio<br/>para \"tipoItemCRT\" = 1 preenchimento obrigatório")
    /**
     * Indica se conteiner está vazio<br/>para \"tipoItemCRT\" = 1 preenchimento obrigatório
     **/
    private Boolean conteinerVazio = null;

    @XmlElement(name = "contramarca")
    @ApiModelProperty(value = "Nome da contramarca do item de carga<br/>para \"tipoItemCRT\" = 4 preenchimento obrigatório<br/> Tamanho Máximo: 55")
    /**
     * Nome da contramarca do item de carga<br/>para \"tipoItemCRT\" = 4 preenchimento obrigatório<br/> Tamanho Máximo: 55
     **/
    private String contramarca = null;

    @XmlElement(name = "descricao", required = true)
    @ApiModelProperty(required = true, value = "Descrição do item de carga<br/> Tamanho Máximo: 500")
    /**
     * Descrição do item de carga<br/> Tamanho Máximo: 500
     **/
    private String descricao = null;

    @XmlElement(name = "embalagemVazia")
    @ApiModelProperty(value = "Indicador de embalagem vazia de carga solta</br>Para item Carga Solta (2), campo obrigatório")
    /**
     * Indicador de embalagem vazia de carga solta</br>Para item Carga Solta (2), campo obrigatório
     **/
    private Boolean embalagemVazia = null;

    @XmlElement(name = "marca")
    @ApiModelProperty(value = "Nome da marca do item de carga<br/>para \"tipoItemCRT\" = 4 preenchimento obrigatório<br/> Tamanho Máximo: 55")
    /**
     * Nome da marca do item de carga<br/>para \"tipoItemCRT\" = 4 preenchimento obrigatório<br/> Tamanho Máximo: 55
     **/
    private String marca = null;

    @XmlElement(name = "medidaConteiner")
    @ApiModelProperty(example = "20", value = "Medida do conteiner<br/>para \"tipoItemCRT\" = 1 <br/>preenchimento obrigatório 20 (20 pés) ou 40 (40 pés)<br/>Tamanho Máximo: 2")
    /**
     * Medida do conteiner<br/>para \"tipoItemCRT\" = 1 <br/>preenchimento obrigatório 20 (20 pés) ou 40 (40 pés)<br/>Tamanho Máximo: 2
     **/
    private String medidaConteiner = null;

    @XmlElement(name = "numeroChassiVeiculo")
    @ApiModelProperty(example = "2WXR0U5O8S8SRRB8P", value = "Número do chassi do veículopara \"tipoItemCRT\" = 4 preenchimento obrigatório<br/> Tamanho Máximo: 30")
    /**
     * Número do chassi do veículopara \"tipoItemCRT\" = 4 preenchimento obrigatório<br/> Tamanho Máximo: 30
     **/
    private String numeroChassiVeiculo = null;

    @XmlElement(name = "numeroConteiner")
    @ApiModelProperty(example = "AG48569701", value = "Número de identificação do conteiner<br/>para \"tipoItemCRT\" = 1 preenchimento obrigatório<br/> Se o número do conteiner preenchido com 11 posições, o DV deverá estar válido<br/> Tamanho Máximo: 11")
    /**
     * Número de identificação do conteiner<br/>para \"tipoItemCRT\" = 1 preenchimento obrigatório<br/> Se o número do conteiner preenchido com 11 posições, o DV deverá estar válido<br/> Tamanho Máximo: 11
     **/
    private String numeroConteiner = null;

    @XmlElement(name = "pesoBrutoKg", required = true)
    @ApiModelProperty(example = "105.478", required = true, value = "Peso bruto do item de carga em Kg<br/>Formato: Número Racional com 9 casas inteiras e 3 casas decimais")
    @Valid
    /**
     * Peso bruto do item de carga em Kg<br/>Formato: Número Racional com 9 casas inteiras e 3 casas decimais
     **/
    private BigDecimal pesoBrutoKg = null;

    @XmlElement(name = "pesoLiquido")
    @ApiModelProperty(example = "105.478", value = "Peso líquido do item de carga em Kg<br/>Formato: Número Racional com 9 casas inteiras e 3 casas decimais")
    @Valid
    /**
     * Peso líquido do item de carga em Kg<br/>Formato: Número Racional com 9 casas inteiras e 3 casas decimais
     **/
    private BigDecimal pesoLiquido = null;

    @XmlElement(name = "possuiEmbalagemSuporteMadeiraBruta", required = true)
    @ApiModelProperty(required = true, value = "Indica se o item de carga está sendo transportado em embalagem/suporte de madeira bruta")
    /**
     * Indica se o item de carga está sendo transportado em embalagem/suporte de madeira bruta
     **/
    private Boolean possuiEmbalagemSuporteMadeiraBruta = null;

    @XmlElement(name = "qtdeVolumesTotalManifestada")
    @ApiModelProperty(value = "Quantidade de volumes do item de carga<br/> para \"tipoItemCRT\" = 2 preenchimento obrigatório<br/> Tamanho Máximo: 4")
    @Valid
    /**
     * Quantidade de volumes do item de carga<br/> para \"tipoItemCRT\" = 2 preenchimento obrigatório<br/> Tamanho Máximo: 4
     **/
    private BigDecimal qtdeVolumesTotalManifestada = null;

    @XmlElement(name = "sequencial", required = true)
    @ApiModelProperty(required = true, value = "Número sequencial do item de carga<br/> Tamanho Máximo: 4")
    @Valid
    /**
     * Número sequencial do item de carga<br/> Tamanho Máximo: 4
     **/
    private BigDecimal sequencial = null;

    @XmlElement(name = "taraConteiner")
    @ApiModelProperty(example = "105.478", value = "Tara do conteiner em Kg<br/>para \"tipoItemCRT\" = 1 preenchimento obrigatório<br/>Formato: Número Racional com 6 casas inteiras e 3 casas decimais")
    @Valid
    /**
     * Tara do conteiner em Kg<br/>para \"tipoItemCRT\" = 1 preenchimento obrigatório<br/>Formato: Número Racional com 6 casas inteiras e 3 casas decimais
     **/
    private BigDecimal taraConteiner = null;

    @XmlElement(name = "tipoEmbalagem")
    @ApiModelProperty(example = "01", value = "Tipo de embalagem de carga solta</br>Para item Carga Solta (2), campo obrigatório, recuperar de tabela<br/> Tamanho Máximo: 2")
    /**
     * Tipo de embalagem de carga solta</br>Para item Carga Solta (2), campo obrigatório, recuperar de tabela<br/> Tamanho Máximo: 2
     **/
    private String tipoEmbalagem = null;

    @XmlElement(name = "tipoGranel")
    @ApiModelProperty(example = "01", value = "Código do tipo de granel</br>para \"tipoItemCRT\" = 3 preenchimento obrigatório conforme Tabela de tipos de granel(TabX)<br/>Tamanho Máximo: 2")
    /**
     * Código do tipo de granel</br>para \"tipoItemCRT\" = 3 preenchimento obrigatório conforme Tabela de tipos de granel(TabX)<br/>Tamanho Máximo: 2
     **/
    private String tipoGranel = null;

    @XmlElement(name = "tipoTratamentoMadeiraBruta")
    @ApiModelProperty(example = "2", value = "Tipo de tratamento para madeira bruta (Obrigatório quando houver indicação de embalagem/suporte de madeira bruta). 1: Madeira processada; 2: Madeira tratada e certificada; e 3: Não tratada e não certificada;")
    /**
     * Tipo de tratamento para madeira bruta (Obrigatório quando houver indicação de embalagem/suporte de madeira bruta). 1: Madeira processada; 2: Madeira tratada e certificada; e 3: Não tratada e não certificada;
     **/
    private String tipoTratamentoMadeiraBruta = null;

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

    public ItemCrt contramarca(String contramarca) {
        this.contramarca = contramarca;
        return this;
    }

    /**
     * Descrição do item de carga&lt;br/&gt; Tamanho Máximo: 500
     *
     * @return descricao
     **/
    @JsonProperty("descricao")
    @NotNull
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public ItemCrt descricao(String descricao) {
        this.descricao = descricao;
        return this;
    }

    public ItemCrt conteinerVazio(Boolean conteinerVazio) {
        this.conteinerVazio = conteinerVazio;
        return this;
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

    public ItemCrt marca(String marca) {
        this.marca = marca;
        return this;
    }

    public ItemCrt embalagemVazia(Boolean embalagemVazia) {
        this.embalagemVazia = embalagemVazia;
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

    /**
     * Número do chassi do veículopara \&quot;tipoItemCRT\&quot; &#x3D; 4 preenchimento obrigatório&lt;br/&gt; Tamanho Máximo: 30
     *
     * @return numeroChassiVeiculo
     **/
    @JsonProperty("numeroChassiVeiculo")
    public String getNumeroChassiVeiculo() {
        return numeroChassiVeiculo;
    }

    public void setNumeroChassiVeiculo(String numeroChassiVeiculo) {
        this.numeroChassiVeiculo = numeroChassiVeiculo;
    }

    public ItemCrt numeroChassiVeiculo(String numeroChassiVeiculo) {
        this.numeroChassiVeiculo = numeroChassiVeiculo;
        return this;
    }

    public ItemCrt medidaConteiner(String medidaConteiner) {
        this.medidaConteiner = medidaConteiner;
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

    /**
     * Peso bruto do item de carga em Kg&lt;br/&gt;Formato: Número Racional com 9 casas inteiras e 3 casas decimais
     *
     * @return pesoBrutoKg
     **/
    @JsonProperty("pesoBrutoKg")
    @NotNull
    public BigDecimal getPesoBrutoKg() {
        return pesoBrutoKg;
    }

    public void setPesoBrutoKg(BigDecimal pesoBrutoKg) {
        this.pesoBrutoKg = pesoBrutoKg;
    }

    public ItemCrt pesoBrutoKg(BigDecimal pesoBrutoKg) {
        this.pesoBrutoKg = pesoBrutoKg;
        return this;
    }

    /**
     * Peso líquido do item de carga em Kg&lt;br/&gt;Formato: Número Racional com 9 casas inteiras e 3 casas decimais
     * @return pesoLiquido
     **/
    @JsonProperty("pesoLiquido")
    public BigDecimal getPesoLiquido() {
        return pesoLiquido;
    }

    public void setPesoLiquido(BigDecimal pesoLiquido) {
        this.pesoLiquido = pesoLiquido;
    }

    public ItemCrt pesoLiquido(BigDecimal pesoLiquido) {
        this.pesoLiquido = pesoLiquido;
        return this;
    }

    public ItemCrt numeroConteiner(String numeroConteiner) {
        this.numeroConteiner = numeroConteiner;
        return this;
    }

    /**
     * Indica se o item de carga está sendo transportado em embalagem/suporte de madeira bruta
     *
     * @return possuiEmbalagemSuporteMadeiraBruta
     **/
    @JsonProperty("possuiEmbalagemSuporteMadeiraBruta")
    @NotNull
    public Boolean isisPossuiEmbalagemSuporteMadeiraBruta() {
        return possuiEmbalagemSuporteMadeiraBruta;
    }

    public void setPossuiEmbalagemSuporteMadeiraBruta(Boolean possuiEmbalagemSuporteMadeiraBruta) {
        this.possuiEmbalagemSuporteMadeiraBruta = possuiEmbalagemSuporteMadeiraBruta;
    }

    public ItemCrt possuiEmbalagemSuporteMadeiraBruta(Boolean possuiEmbalagemSuporteMadeiraBruta) {
        this.possuiEmbalagemSuporteMadeiraBruta = possuiEmbalagemSuporteMadeiraBruta;
        return this;
    }

    /**
     * Quantidade de volumes do item de carga&lt;br/&gt; para \&quot;tipoItemCRT\&quot; &#x3D; 2 preenchimento obrigatório&lt;br/&gt; Tamanho Máximo: 4
     *
     * @return qtdeVolumesTotalManifestada
     **/
    @JsonProperty("qtdeVolumesTotalManifestada")
    public BigDecimal getQtdeVolumesTotalManifestada() {
        return qtdeVolumesTotalManifestada;
    }

    public void setQtdeVolumesTotalManifestada(BigDecimal qtdeVolumesTotalManifestada) {
        this.qtdeVolumesTotalManifestada = qtdeVolumesTotalManifestada;
    }

    public ItemCrt qtdeVolumesTotalManifestada(BigDecimal qtdeVolumesTotalManifestada) {
        this.qtdeVolumesTotalManifestada = qtdeVolumesTotalManifestada;
        return this;
    }

    /**
     * Número sequencial do item de carga&lt;br/&gt; Tamanho Máximo: 4
     *
     * @return sequencial
     **/
    @JsonProperty("sequencial")
    @NotNull
    public BigDecimal getSequencial() {
        return sequencial;
    }

    public void setSequencial(BigDecimal sequencial) {
        this.sequencial = sequencial;
    }

    public ItemCrt sequencial(BigDecimal sequencial) {
        this.sequencial = sequencial;
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

    public ItemCrt taraConteiner(BigDecimal taraConteiner) {
        this.taraConteiner = taraConteiner;
        return this;
    }

    /**
     * Tipo de embalagem de carga solta&lt;/br&gt;Para item Carga Solta (2), campo obrigatório, recuperar de tabela&lt;br/&gt; Tamanho Máximo: 2
     *
     * @return tipoEmbalagem
     **/
    @JsonProperty("tipoEmbalagem")
    public String getTipoEmbalagem() {
        return tipoEmbalagem;
    }

    public void setTipoEmbalagem(String tipoEmbalagem) {
        this.tipoEmbalagem = tipoEmbalagem;
    }

    /**
     * Código do tipo de granel&lt;/br&gt;para \&quot;tipoItemCRT\&quot; &#x3D; 3 preenchimento obrigatório conforme Tabela de tipos de granel(TabX)&lt;br/&gt;Tamanho Máximo: 2
     * @return tipoGranel
     **/
    @JsonProperty("tipoGranel")
    public String getTipoGranel() {
        return tipoGranel;
    }

    public void setTipoGranel(String tipoGranel) {
        this.tipoGranel = tipoGranel;
    }

    public ItemCrt tipoGranel(String tipoGranel) {
        this.tipoGranel = tipoGranel;
        return this;
    }

    public ItemCrt tipoEmbalagem(String tipoEmbalagem) {
        this.tipoEmbalagem = tipoEmbalagem;
        return this;
    }

    /**
     * Tipo de tratamento para madeira bruta (Obrigatório quando houver indicação de embalagem/suporte de madeira bruta). 1: Madeira processada; 2: Madeira tratada e certificada; e 3: Não tratada e não certificada;
     *
     * @return tipoTratamentoMadeiraBruta
     **/
    @JsonProperty("tipoTratamentoMadeiraBruta")
    public String getTipoTratamentoMadeiraBruta() {
        return tipoTratamentoMadeiraBruta;
    }

    public void setTipoTratamentoMadeiraBruta(String tipoTratamentoMadeiraBruta) {
        this.tipoTratamentoMadeiraBruta = tipoTratamentoMadeiraBruta;
    }

    public ItemCrt tipoTratamentoMadeiraBruta(String tipoTratamentoMadeiraBruta) {
        this.tipoTratamentoMadeiraBruta = tipoTratamentoMadeiraBruta;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class ItemCrt {\n" +
                "    conteinerVazio: " + toIndentedString(conteinerVazio) + "\n" +
                "    contramarca: " + toIndentedString(contramarca) + "\n" +
                "    descricao: " + toIndentedString(descricao) + "\n" +
                "    embalagemVazia: " + toIndentedString(embalagemVazia) + "\n" +
                "    marca: " + toIndentedString(marca) + "\n" +
                "    medidaConteiner: " + toIndentedString(medidaConteiner) + "\n" +
                "    numeroChassiVeiculo: " + toIndentedString(numeroChassiVeiculo) + "\n" +
                "    numeroConteiner: " + toIndentedString(numeroConteiner) + "\n" +
                "    pesoBrutoKg: " + toIndentedString(pesoBrutoKg) + "\n" +
                "    pesoLiquido: " + toIndentedString(pesoLiquido) + "\n" +
                "    possuiEmbalagemSuporteMadeiraBruta: " + toIndentedString(possuiEmbalagemSuporteMadeiraBruta) + "\n" +
                "    qtdeVolumesTotalManifestada: " + toIndentedString(qtdeVolumesTotalManifestada) + "\n" +
                "    sequencial: " + toIndentedString(sequencial) + "\n" +
                "    taraConteiner: " + toIndentedString(taraConteiner) + "\n" +
                "    tipoEmbalagem: " + toIndentedString(tipoEmbalagem) + "\n" +
                "    tipoGranel: " + toIndentedString(tipoGranel) + "\n" +
                "    tipoTratamentoMadeiraBruta: " + toIndentedString(tipoTratamentoMadeiraBruta) + "\n" +
                "}";
        return sb;
    }
}
