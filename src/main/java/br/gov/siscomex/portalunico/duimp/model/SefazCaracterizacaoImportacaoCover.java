package br.gov.siscomex.portalunico.duimp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SefazCaracterizacaoImportacaoCover", propOrder =
        {"indicadorImportacaoTerceiros", "tipoIdentificacaoTerceiro", "identificacaoTerceiro", "uf", "nome"
        })

@XmlRootElement(name = "SefazCaracterizacaoImportacaoCover")
/**
 * Caracterização da Importação
 **/
@ApiModel(description = "Caracterização da Importação")
public class SefazCaracterizacaoImportacaoCover {


    @XmlType(name = "IndicadorImportacaoTerceirosEnum")
    @XmlEnum(String.class)
    public enum IndicadorImportacaoTerceirosEnum {

        @XmlEnumValue("IMPORTACAO_DIRETA")
        @JsonProperty("IMPORTACAO_DIRETA")
        DIRETA("IMPORTACAO_DIRETA"),

        @XmlEnumValue("IMPORTACAO_POR_CONTA_E_ORDEM")
        @JsonProperty("IMPORTACAO_POR_CONTA_E_ORDEM")
        POR_CONTA_E_ORDEM("IMPORTACAO_POR_CONTA_E_ORDEM"),

        @XmlEnumValue("IMPORTACAO_POR_ENCOMENDA")
        @JsonProperty("IMPORTACAO_POR_ENCOMENDA")
        POR_ENCOMENDA("IMPORTACAO_POR_ENCOMENDA");


        private final String value;

        IndicadorImportacaoTerceirosEnum(String v) {
            value = v;
        }

        public String value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static IndicadorImportacaoTerceirosEnum fromValue(String v) {
            for (IndicadorImportacaoTerceirosEnum b : IndicadorImportacaoTerceirosEnum.values()) {
                if (String.valueOf(b.value).equals(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "' to IndicadorImportacaoTerceirosEnum");
        }
    }

    @XmlElement(name = "indicadorImportacaoTerceiros", required = true)
    @ApiModelProperty(example = "IMPORTACAO_DIRETA", required = true, value = "Indicador de importação por terceiros.")
    /**
     * Indicador de importação por terceiros.
     **/
    private IndicadorImportacaoTerceirosEnum indicadorImportacaoTerceiros = null;


    @XmlType(name = "TipoIdentificacaoTerceiroEnum")
    @XmlEnum(String.class)
    public enum TipoIdentificacaoTerceiroEnum {

        @XmlEnumValue("1")
        @JsonProperty("1")
        _1("1"),

        @XmlEnumValue("2")
        @JsonProperty("2")
        _2("2");


        private final String value;

        TipoIdentificacaoTerceiroEnum(String v) {
            value = v;
        }

        public String value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static TipoIdentificacaoTerceiroEnum fromValue(String v) {
            for (TipoIdentificacaoTerceiroEnum b : TipoIdentificacaoTerceiroEnum.values()) {
                if (String.valueOf(b.value).equals(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "' to TipoIdentificacaoTerceiroEnum");
        }
    }

    @XmlElement(name = "tipoIdentificacaoTerceiro", required = true)
    @ApiModelProperty(example = "1", required = true, value = "Tipo do Adquirente ou Encomendante. Indica se ele  é uma pessoa jurídica (CNPJ)  ou uma pessoa física (CPF)  <br>Dominio: <br>1 - Pessoa Jurídica, <br>2 - Pessoa Física residente no país<br>Observação: Por enquanto será retornado apenas CNPJ")
    /**
     * Tipo do Adquirente ou Encomendante. Indica se ele  é uma pessoa jurídica (CNPJ)  ou uma pessoa física (CPF)  <br>Dominio: <br>1 - Pessoa Jurídica, <br>2 - Pessoa Física residente no país<br>Observação: Por enquanto será retornado apenas CNPJ
     **/
    private TipoIdentificacaoTerceiroEnum tipoIdentificacaoTerceiro = null;

    @XmlElement(name = "identificacaoTerceiro")
    @ApiModelProperty(example = "00000000000191", value = "Identificação  do adquirente ou encomendante<br>Caso seja CNPJ: <br>Tamanho: 14<br>Formato: 'NNNNNNNNNNNNNN'<br>Caso seja CPF: <br>Tamanho: 11<br>Formato: 'NNNNNNNNNNN'<br>Observação:<br>Apenas quando o atributo 'indicadorImportacaoTerceiros' for IMPORTACAO_POR_CONTA_E_ORDEM ou IMPORTACAO_POR_ENCOMENDA")
    /**
     * Identificação  do adquirente ou encomendante<br>Caso seja CNPJ: <br>Tamanho: 14<br>Formato: 'NNNNNNNNNNNNNN'<br>Caso seja CPF: <br>Tamanho: 11<br>Formato: 'NNNNNNNNNNN'<br>Observação:<br>Apenas quando o atributo 'indicadorImportacaoTerceiros' for IMPORTACAO_POR_CONTA_E_ORDEM ou IMPORTACAO_POR_ENCOMENDA
     **/
    private String identificacaoTerceiro = null;

    @XmlElement(name = "uf")
    @ApiModelProperty(example = "RJ", value = "UF do adquirente ou encomendante<br>Dominio:<br>AC, AL, AP, AM, BA, CE, DF<br>ES, GO, MA, MT, MS, MG, PA<br>PB, PR, PE, PI, RJ, RN, RS<br>RO, RR, SC, SP, SE, TO<br>Tamanho: 2<br>Observação:<br>Apenas quando o atributo 'indicadorImportacaoTerceiros' for IMPORTACAO_POR_CONTA_E_ORDEM ou IMPORTACAO_POR_ENCOMENDA")
    /**
     * UF do adquirente ou encomendante<br>Dominio:<br>AC, AL, AP, AM, BA, CE, DF<br>ES, GO, MA, MT, MS, MG, PA<br>PB, PR, PE, PI, RJ, RN, RS<br>RO, RR, SC, SP, SE, TO<br>Tamanho: 2<br>Observação:<br>Apenas quando o atributo 'indicadorImportacaoTerceiros' for IMPORTACAO_POR_CONTA_E_ORDEM ou IMPORTACAO_POR_ENCOMENDA
     **/
    private String uf = null;

    @XmlElement(name = "nome")
    @ApiModelProperty(example = "Nome do CNPJ ou CPF informado", value = "Nome do adquirente ou encomendante<br>Tamanho mínimo: 1<br>Tamanho máximo: 150<br>Observação:<br>Apenas quando o atributo 'indicadorImportacaoTerceiros' for IMPORTACAO_POR_CONTA_E_ORDEM ou IMPORTACAO_POR_ENCOMENDA")
    /**
     * Nome do adquirente ou encomendante<br>Tamanho mínimo: 1<br>Tamanho máximo: 150<br>Observação:<br>Apenas quando o atributo 'indicadorImportacaoTerceiros' for IMPORTACAO_POR_CONTA_E_ORDEM ou IMPORTACAO_POR_ENCOMENDA
     **/
    private String nome = null;

    /**
     * Indicador de importação por terceiros.
     *
     * @return indicadorImportacaoTerceiros
     **/
    @JsonProperty("indicadorImportacaoTerceiros")
    @NotNull
    public String getIndicadorImportacaoTerceiros() {
        if (indicadorImportacaoTerceiros == null) {
            return null;
        }
        return indicadorImportacaoTerceiros.value();
    }

    public void setIndicadorImportacaoTerceiros(IndicadorImportacaoTerceirosEnum indicadorImportacaoTerceiros) {
        this.indicadorImportacaoTerceiros = indicadorImportacaoTerceiros;
    }

    public SefazCaracterizacaoImportacaoCover indicadorImportacaoTerceiros(IndicadorImportacaoTerceirosEnum indicadorImportacaoTerceiros) {
        this.indicadorImportacaoTerceiros = indicadorImportacaoTerceiros;
        return this;
    }

    /**
     * Tipo do Adquirente ou Encomendante. Indica se ele  é uma pessoa jurídica (CNPJ)  ou uma pessoa física (CPF)  &lt;br&gt;Dominio: &lt;br&gt;1 - Pessoa Jurídica, &lt;br&gt;2 - Pessoa Física residente no país&lt;br&gt;Observação: Por enquanto será retornado apenas CNPJ
     *
     * @return tipoIdentificacaoTerceiro
     **/
    @JsonProperty("tipoIdentificacaoTerceiro")
    @NotNull
    public String getTipoIdentificacaoTerceiro() {
        if (tipoIdentificacaoTerceiro == null) {
            return null;
        }
        return tipoIdentificacaoTerceiro.value();
    }

    public void setTipoIdentificacaoTerceiro(TipoIdentificacaoTerceiroEnum tipoIdentificacaoTerceiro) {
        this.tipoIdentificacaoTerceiro = tipoIdentificacaoTerceiro;
    }

    public SefazCaracterizacaoImportacaoCover tipoIdentificacaoTerceiro(TipoIdentificacaoTerceiroEnum tipoIdentificacaoTerceiro) {
        this.tipoIdentificacaoTerceiro = tipoIdentificacaoTerceiro;
        return this;
    }

    /**
     * Identificação  do adquirente ou encomendante&lt;br&gt;Caso seja CNPJ: &lt;br&gt;Tamanho: 14&lt;br&gt;Formato: &#39;NNNNNNNNNNNNNN&#39;&lt;br&gt;Caso seja CPF: &lt;br&gt;Tamanho: 11&lt;br&gt;Formato: &#39;NNNNNNNNNNN&#39;&lt;br&gt;Observação:&lt;br&gt;Apenas quando o atributo &#39;indicadorImportacaoTerceiros&#39; for IMPORTACAO_POR_CONTA_E_ORDEM ou IMPORTACAO_POR_ENCOMENDA
     *
     * @return identificacaoTerceiro
     **/
    @JsonProperty("identificacaoTerceiro")
    public String getIdentificacaoTerceiro() {
        return identificacaoTerceiro;
    }

    public void setIdentificacaoTerceiro(String identificacaoTerceiro) {
        this.identificacaoTerceiro = identificacaoTerceiro;
    }

    public SefazCaracterizacaoImportacaoCover identificacaoTerceiro(String identificacaoTerceiro) {
        this.identificacaoTerceiro = identificacaoTerceiro;
        return this;
    }

    /**
     * UF do adquirente ou encomendante&lt;br&gt;Dominio:&lt;br&gt;AC, AL, AP, AM, BA, CE, DF&lt;br&gt;ES, GO, MA, MT, MS, MG, PA&lt;br&gt;PB, PR, PE, PI, RJ, RN, RS&lt;br&gt;RO, RR, SC, SP, SE, TO&lt;br&gt;Tamanho: 2&lt;br&gt;Observação:&lt;br&gt;Apenas quando o atributo &#39;indicadorImportacaoTerceiros&#39; for IMPORTACAO_POR_CONTA_E_ORDEM ou IMPORTACAO_POR_ENCOMENDA
     *
     * @return uf
     **/
    @JsonProperty("uf")
    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public SefazCaracterizacaoImportacaoCover uf(String uf) {
        this.uf = uf;
        return this;
    }

    /**
     * Nome do adquirente ou encomendante&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 150&lt;br&gt;Observação:&lt;br&gt;Apenas quando o atributo &#39;indicadorImportacaoTerceiros&#39; for IMPORTACAO_POR_CONTA_E_ORDEM ou IMPORTACAO_POR_ENCOMENDA
     *
     * @return nome
     **/
    @JsonProperty("nome")
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public SefazCaracterizacaoImportacaoCover nome(String nome) {
        this.nome = nome;
        return this;
    }


    @Override
    public String toString() {

        String sb = "class SefazCaracterizacaoImportacaoCover {\n" +
                "    indicadorImportacaoTerceiros: " + toIndentedString(indicadorImportacaoTerceiros) + "\n" +
                "    tipoIdentificacaoTerceiro: " + toIndentedString(tipoIdentificacaoTerceiro) + "\n" +
                "    identificacaoTerceiro: " + toIndentedString(identificacaoTerceiro) + "\n" +
                "    uf: " + toIndentedString(uf) + "\n" +
                "    nome: " + toIndentedString(nome) + "\n" +
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

