package br.gov.siscomex.portalunico.ccta_ter_ext_xml.model;

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
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemCargaViagem", propOrder =
        {"chassi", "identificacaoConteiner", "lacresConteiner", "pesoBrutoKG", "quantidadeVolumesTransportado", "sequencial", "tipoEmbalagem", "tipoGranel"
        })

@XmlRootElement(name = "ItemCargaViagem")
public class ItemCargaViagem {

    @XmlElement(name = "chassi")
    @ApiModelProperty(example = "2WXR0U5O8S8SRRB8P", value = "Chassi do veículo transportado na viagem.para tipocarga = 4 preenchimento obrigatório<br/>Tamanho Máximo: 30")
    /**
     * Chassi do veículo transportado na viagem.para tipocarga = 4 preenchimento obrigatório<br/>Tamanho Máximo: 30
     **/
    private String chassi = null;

    @XmlElement(name = "identificacaoConteiner")
    @ApiModelProperty(example = "AG48569701", value = "Identificação do conteiner transportado na viagem.para tipocarga = 1 preenchimento obrigatório<br/> Tamanho Máximo: 11")
    /**
     * Identificação do conteiner transportado na viagem.para tipocarga = 1 preenchimento obrigatório<br/> Tamanho Máximo: 11
     **/
    private String identificacaoConteiner = null;

    @XmlElement(name = "lacresConteiner")
    @ApiModelProperty(value = "")
    @Valid
    private List<Lacre> lacresConteiner = null;

    @XmlElement(name = "pesoBrutoKG", required = true)
    @ApiModelProperty(example = "105.478", required = true, value = "Peso bruto em kg do item de carga transportado na viagem<br/>Formato: Número Racional com 9 casas inteiras e 3 casas decimais")
    @Valid
    /**
     * Peso bruto em kg do item de carga transportado na viagem<br/>Formato: Número Racional com 9 casas inteiras e 3 casas decimais
     **/
    private BigDecimal pesoBrutoKG = null;

    @XmlElement(name = "quantidadeVolumesTransportado")
    @ApiModelProperty(example = "55", value = "Quantidade de volumes do item de carga transportado na viagempara tipocarga = 2 preenchimento obrigatório<br/> Tamanho Máximo: 4")
    /**
     * Quantidade de volumes do item de carga transportado na viagempara tipocarga = 2 preenchimento obrigatório<br/> Tamanho Máximo: 4
     **/
    private String quantidadeVolumesTransportado = null;

    @XmlElement(name = "sequencial", required = true)
    @ApiModelProperty(example = "1.0", required = true, value = "Sequencial de item de carga da viagem<br/> Tamanho Máximo: 20")
    @Valid
    /**
     * Sequencial de item de carga da viagem<br/> Tamanho Máximo: 20
     **/
    private BigDecimal sequencial = null;

    @XmlElement(name = "tipoEmbalagem")
    @ApiModelProperty(example = "01", value = "Tipo de embalagem da carga solta transportada na viagem.para tipocarga = 3 preenchimento obrigatório (utilizar tabela de embalagem (Tabx?)<br/> Tamanho Máximo: 2")
    /**
     * Tipo de embalagem da carga solta transportada na viagem.para tipocarga = 3 preenchimento obrigatório (utilizar tabela de embalagem (Tabx?)<br/> Tamanho Máximo: 2
     **/
    private String tipoEmbalagem = null;

    @XmlElement(name = "tipoGranel")
    @ApiModelProperty(example = "01", value = "Tipo de granel do item de carga transportado na viagempara tipocarga = 3 preenchimento obrigatório conforme Tabela de tipos de granel(TabX)<br/>Tamanho Máximo: 2")
    /**
     * Tipo de granel do item de carga transportado na viagempara tipocarga = 3 preenchimento obrigatório conforme Tabela de tipos de granel(TabX)<br/>Tamanho Máximo: 2
     **/
    private String tipoGranel = null;

    /**
     * Chassi do veículo transportado na viagem.para tipocarga &#x3D; 4 preenchimento obrigatório&lt;br/&gt;Tamanho Máximo: 30
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

    public ItemCargaViagem chassi(String chassi) {
        this.chassi = chassi;
        return this;
    }

    /**
     * Identificação do conteiner transportado na viagem.para tipocarga &#x3D; 1 preenchimento obrigatório&lt;br/&gt; Tamanho Máximo: 11
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

    public ItemCargaViagem identificacaoConteiner(String identificacaoConteiner) {
        this.identificacaoConteiner = identificacaoConteiner;
        return this;
    }

    /**
     * Get lacresConteiner
     *
     * @return lacresConteiner
     **/
    @JsonProperty("lacresConteiner")
    public List<Lacre> getLacresConteiner() {
        return lacresConteiner;
    }

    public void setLacresConteiner(List<Lacre> lacresConteiner) {
        this.lacresConteiner = lacresConteiner;
    }

    public ItemCargaViagem lacresConteiner(List<Lacre> lacresConteiner) {
        this.lacresConteiner = lacresConteiner;
        return this;
    }

    public ItemCargaViagem addLacresConteinerItem(Lacre lacresConteinerItem) {
        this.lacresConteiner.add(lacresConteinerItem);
        return this;
    }

    /**
     * Peso bruto em kg do item de carga transportado na viagem&lt;br/&gt;Formato: Número Racional com 9 casas inteiras e 3 casas decimais
     *
     * @return pesoBrutoKG
     **/
    @JsonProperty("pesoBrutoKG")
    @NotNull
    public BigDecimal getPesoBrutoKG() {
        return pesoBrutoKG;
    }

    public void setPesoBrutoKG(BigDecimal pesoBrutoKG) {
        this.pesoBrutoKG = pesoBrutoKG;
    }

    public ItemCargaViagem pesoBrutoKG(BigDecimal pesoBrutoKG) {
        this.pesoBrutoKG = pesoBrutoKG;
        return this;
    }

    /**
     * Quantidade de volumes do item de carga transportado na viagempara tipocarga &#x3D; 2 preenchimento obrigatório&lt;br/&gt; Tamanho Máximo: 4
     *
     * @return quantidadeVolumesTransportado
     **/
    @JsonProperty("quantidadeVolumesTransportado")
    public String getQuantidadeVolumesTransportado() {
        return quantidadeVolumesTransportado;
    }

    public void setQuantidadeVolumesTransportado(String quantidadeVolumesTransportado) {
        this.quantidadeVolumesTransportado = quantidadeVolumesTransportado;
    }

    public ItemCargaViagem quantidadeVolumesTransportado(String quantidadeVolumesTransportado) {
        this.quantidadeVolumesTransportado = quantidadeVolumesTransportado;
        return this;
    }

    /**
     * Sequencial de item de carga da viagem&lt;br/&gt; Tamanho Máximo: 20
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

    public ItemCargaViagem sequencial(BigDecimal sequencial) {
        this.sequencial = sequencial;
        return this;
    }

    /**
     * Tipo de embalagem da carga solta transportada na viagem.para tipocarga &#x3D; 3 preenchimento obrigatório (utilizar tabela de embalagem (Tabx?)&lt;br/&gt; Tamanho Máximo: 2
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

    public ItemCargaViagem tipoEmbalagem(String tipoEmbalagem) {
        this.tipoEmbalagem = tipoEmbalagem;
        return this;
    }

    /**
     * Tipo de granel do item de carga transportado na viagempara tipocarga &#x3D; 3 preenchimento obrigatório conforme Tabela de tipos de granel(TabX)&lt;br/&gt;Tamanho Máximo: 2
     * @return tipoGranel
     **/
    @JsonProperty("tipoGranel")
    public String getTipoGranel() {
        return tipoGranel;
    }

    public void setTipoGranel(String tipoGranel) {
        this.tipoGranel = tipoGranel;
    }

    public ItemCargaViagem tipoGranel(String tipoGranel) {
        this.tipoGranel = tipoGranel;
        return this;
    }


    @Override
    public String toString() {

        String sb = "class ItemCargaViagem {\n" +
                "    chassi: " + toIndentedString(chassi) + "\n" +
                "    identificacaoConteiner: " + toIndentedString(identificacaoConteiner) + "\n" +
                "    lacresConteiner: " + toIndentedString(lacresConteiner) + "\n" +
                "    pesoBrutoKG: " + toIndentedString(pesoBrutoKG) + "\n" +
                "    quantidadeVolumesTransportado: " + toIndentedString(quantidadeVolumesTransportado) + "\n" +
                "    sequencial: " + toIndentedString(sequencial) + "\n" +
                "    tipoEmbalagem: " + toIndentedString(tipoEmbalagem) + "\n" +
                "    tipoGranel: " + toIndentedString(tipoGranel) + "\n" +
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

