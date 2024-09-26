package br.gov.siscomex.portalunico.ccta_ter_ext_xml.model;

import com.fasterxml.jackson.annotation.JsonProperty;
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
import java.math.BigDecimal;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemEnLastre", propOrder =
        {"descricao", "identificacaoConteiner", "lacres", "medidaConteiner", "pesoBrutoKg", "quantidadeVolumes", "sequencial", "taraConteiner", "tipo", "tipoEmbalagem"
        })

@XmlRootElement(name = "ItemEnLastre")
public class ItemEnLastre {

    @XmlElement(name = "descricao", required = true)
    @ApiModelProperty(example = "Descrição do item.", required = true, value = "descrição do item en lastre<br/> Tamanho Máximo: 500")
    /**
     * descrição do item en lastre<br/> Tamanho Máximo: 500
     **/
    private String descricao = null;

    @XmlElement(name = "identificacaoConteiner")
    @ApiModelProperty(example = "AG48569701", value = "Identificação do conteiner transportado na viagem (en lastre).<br/> para tipo = 1 preenchimento obrigatório<br/> Tamanho Máximo: 11")
    /**
     * Identificação do conteiner transportado na viagem (en lastre).<br/> para tipo = 1 preenchimento obrigatório<br/> Tamanho Máximo: 11
     **/
    private String identificacaoConteiner = null;

    @XmlElement(name = "lacres")
    @ApiModelProperty(value = "")
    @Valid
    private List<Lacre> lacres = null;

    @XmlElement(name = "medidaConteiner")
    @ApiModelProperty(example = "20", value = "Medidas do conteiner (en lastre)<br/> para tipo = 1 preenchimento obrigatório<BR/> 20P (20 pés) ou 40P (40 pés)<br/> Tamanho Máximo: 2")
    /**
     * Medidas do conteiner (en lastre)<br/> para tipo = 1 preenchimento obrigatório<BR/> 20P (20 pés) ou 40P (40 pés)<br/> Tamanho Máximo: 2
     **/
    private String medidaConteiner = null;

    @XmlElement(name = "pesoBrutoKg", required = true)
    @ApiModelProperty(example = "105.478", required = true, value = "Peso bruto em kg do item de carga transportado na viagem (en lastre)<br/>Formato: Número Racional com 9 casas inteiras e 3 casas decimais")
    @Valid
    /**
     * Peso bruto em kg do item de carga transportado na viagem (en lastre)<br/>Formato: Número Racional com 9 casas inteiras e 3 casas decimais
     **/
    private BigDecimal pesoBrutoKg = null;

    @XmlElement(name = "quantidadeVolumes")
    @ApiModelProperty(example = "55", value = "Quantidade de volumes do item de carga transportado na viagem (en lastre)<br/> para tipo = 2 preenchimento obrigatório<br/> Tamanho Máximo: 4")
    /**
     * Quantidade de volumes do item de carga transportado na viagem (en lastre)<br/> para tipo = 2 preenchimento obrigatório<br/> Tamanho Máximo: 4
     **/
    private Integer quantidadeVolumes = null;

    @XmlElement(name = "sequencial", required = true)
    @ApiModelProperty(example = "1.0", required = true, value = "Sequencial do item en lastre<br/> Tamanho Máximo: 20")
    @Valid
    /**
     * Sequencial do item en lastre<br/> Tamanho Máximo: 20
     **/
    private BigDecimal sequencial = null;

    @XmlElement(name = "taraConteiner")
    @ApiModelProperty(example = "105.478", value = "Tara do conteiner (en lastre)<br/> para tipo = 1 preenchimento obrigatório<br/>Formato: Número Racional com 9 casas inteiras e 3 casas decimais")
    @Valid
    /**
     * Tara do conteiner (en lastre)<br/> para tipo = 1 preenchimento obrigatório<br/>Formato: Número Racional com 9 casas inteiras e 3 casas decimais
     **/
    private BigDecimal taraConteiner = null;


    @XmlType(name = "TipoEnum")
    @XmlEnum(String.class)
    public enum TipoEnum {

        @XmlEnumValue("1")
        @JsonProperty("1")
        _1("1"),

        @XmlEnumValue("2")
        @JsonProperty("2")
        _2("2");


        private final String value;

        TipoEnum(String v) {
            value = v;
        }

        public String value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static TipoEnum fromValue(String v) {
            for (TipoEnum b : TipoEnum.values()) {
                if (String.valueOf(b.value).equals(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "' to TipoEnum");
        }
    }

    @XmlElement(name = "tipo", required = true)
    @ApiModelProperty(example = "1", required = true, value = "Tipo do item en lastre<br/>1 = conteiner; 2 = carga solta")
    /**
     * Tipo do item en lastre<br/>1 = conteiner; 2 = carga solta
     **/
    private TipoEnum tipo = null;

    @XmlElement(name = "tipoEmbalagem")
    @ApiModelProperty(example = "01", value = "Tipo de embalagem da carga solta transportada na viagem (en lastre)<br/> para tipo = 2 preenchimento obrigatório<br/> Tamanho Máximo: 2")
    /**
     * Tipo de embalagem da carga solta transportada na viagem (en lastre)<br/> para tipo = 2 preenchimento obrigatório<br/> Tamanho Máximo: 2
     **/
    private String tipoEmbalagem = null;

    /**
     * descrição do item en lastre&lt;br/&gt; Tamanho Máximo: 500
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

    public ItemEnLastre descricao(String descricao) {
        this.descricao = descricao;
        return this;
    }

    /**
     * Identificação do conteiner transportado na viagem (en lastre).&lt;br/&gt; para tipo &#x3D; 1 preenchimento obrigatório&lt;br/&gt; Tamanho Máximo: 11
     *
     * @return identificacaoConteiner
     **/
    @JsonProperty("identificacaoConteiner")
    public String getIdentificacaoConteiner() {
        return identificacaoConteiner;
    }

    public void setIdentificacaoConteiner(String identificacaoConteiner) {
        this.identificacaoConteiner = identificacaoConteiner;
    }

    public ItemEnLastre identificacaoConteiner(String identificacaoConteiner) {
        this.identificacaoConteiner = identificacaoConteiner;
        return this;
    }

    /**
     * Get lacres
     *
     * @return lacres
     **/
    @JsonProperty("lacres")
    public List<Lacre> getLacres() {
        return lacres;
    }

    public void setLacres(List<Lacre> lacres) {
        this.lacres = lacres;
    }

    public ItemEnLastre lacres(List<Lacre> lacres) {
        this.lacres = lacres;
        return this;
    }

    public ItemEnLastre addLacresItem(Lacre lacresItem) {
        this.lacres.add(lacresItem);
        return this;
    }

    /**
     * Medidas do conteiner (en lastre)&lt;br/&gt; para tipo &#x3D; 1 preenchimento obrigatório&lt;BR/&gt; 20P (20 pés) ou 40P (40 pés)&lt;br/&gt; Tamanho Máximo: 2
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

    public ItemEnLastre medidaConteiner(String medidaConteiner) {
        this.medidaConteiner = medidaConteiner;
        return this;
    }

    /**
     * Peso bruto em kg do item de carga transportado na viagem (en lastre)&lt;br/&gt;Formato: Número Racional com 9 casas inteiras e 3 casas decimais
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

    public ItemEnLastre pesoBrutoKg(BigDecimal pesoBrutoKg) {
        this.pesoBrutoKg = pesoBrutoKg;
        return this;
    }

    /**
     * Quantidade de volumes do item de carga transportado na viagem (en lastre)&lt;br/&gt; para tipo &#x3D; 2 preenchimento obrigatório&lt;br/&gt; Tamanho Máximo: 4
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

    public ItemEnLastre quantidadeVolumes(Integer quantidadeVolumes) {
        this.quantidadeVolumes = quantidadeVolumes;
        return this;
    }

    /**
     * Sequencial do item en lastre&lt;br/&gt; Tamanho Máximo: 20
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

    public ItemEnLastre sequencial(BigDecimal sequencial) {
        this.sequencial = sequencial;
        return this;
    }

    /**
     * Tara do conteiner (en lastre)&lt;br/&gt; para tipo &#x3D; 1 preenchimento obrigatório&lt;br/&gt;Formato: Número Racional com 9 casas inteiras e 3 casas decimais
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

    public ItemEnLastre taraConteiner(BigDecimal taraConteiner) {
        this.taraConteiner = taraConteiner;
        return this;
    }

    /**
     * Tipo do item en lastre&lt;br/&gt;1 &#x3D; conteiner; 2 &#x3D; carga solta
     *
     * @return tipo
     **/
    @JsonProperty("tipo")
    @NotNull
    public String getTipo() {
        if (tipo == null) {
            return null;
        }
        return tipo.value();
    }

    public void setTipo(TipoEnum tipo) {
        this.tipo = tipo;
    }

    public ItemEnLastre tipo(TipoEnum tipo) {
        this.tipo = tipo;
        return this;
    }

    /**
     * Tipo de embalagem da carga solta transportada na viagem (en lastre)&lt;br/&gt; para tipo &#x3D; 2 preenchimento obrigatório&lt;br/&gt; Tamanho Máximo: 2
     * @return tipoEmbalagem
     **/
    @JsonProperty("tipoEmbalagem")
    public String getTipoEmbalagem() {
        return tipoEmbalagem;
    }

    public void setTipoEmbalagem(String tipoEmbalagem) {
        this.tipoEmbalagem = tipoEmbalagem;
    }

    public ItemEnLastre tipoEmbalagem(String tipoEmbalagem) {
        this.tipoEmbalagem = tipoEmbalagem;
        return this;
    }


    @Override
    public String toString() {

        String sb = "class ItemEnLastre {\n" +
                "    descricao: " + toIndentedString(descricao) + "\n" +
                "    identificacaoConteiner: " + toIndentedString(identificacaoConteiner) + "\n" +
                "    lacres: " + toIndentedString(lacres) + "\n" +
                "    medidaConteiner: " + toIndentedString(medidaConteiner) + "\n" +
                "    pesoBrutoKg: " + toIndentedString(pesoBrutoKg) + "\n" +
                "    quantidadeVolumes: " + toIndentedString(quantidadeVolumes) + "\n" +
                "    sequencial: " + toIndentedString(sequencial) + "\n" +
                "    taraConteiner: " + toIndentedString(taraConteiner) + "\n" +
                "    tipo: " + toIndentedString(tipo) + "\n" +
                "    tipoEmbalagem: " + toIndentedString(tipoEmbalagem) + "\n" +
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

