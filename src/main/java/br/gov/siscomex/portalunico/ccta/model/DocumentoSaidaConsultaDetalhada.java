package br.gov.siscomex.portalunico.ccta.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentoSaidaConsultaDetalhada", propOrder =
        {"canalDuimp", "dataConclusaoDta", "dataHoraVinculacao", "numero", "raDestinoDta", "situacaoDuimp", "tipo", "uaDestinoDta", "valorTotalMercadoriaLocalDescarga", "versaoDuimp"
        })

@XmlRootElement(name = "DocumentoSaidaConsultaDetalhada")
public class DocumentoSaidaConsultaDetalhada {

    @XmlElement(name = "canalDuimp")
    @ApiModelProperty(example = "Verde", value = "Tipo de canal em que caiu a Duimp")
    /**
     * Tipo de canal em que caiu a Duimp
     **/
    private String canalDuimp = null;

    @XmlElement(name = "dataConclusaoDta")
    @ApiModelProperty(example = "2020-04-08T15:30:00-03:00", value = "Data de conclusão de DTA.")
    /**
     * Data de conclusão de DTA.
     **/
    private String dataConclusaoDta = null;

    @XmlElement(name = "dataHoraVinculacao")
    @ApiModelProperty(example = "12/02/2021 21:21", value = "Data / Hora do registro<br/> ")
    /**
     * Data / Hora do registro<br/>
     **/
    private String dataHoraVinculacao = null;

    @XmlElement(name = "numero")
    @ApiModelProperty(example = "5490178901", value = "Número de documento de saída<br/>Tamanho mínimo: 1<br/>Tamanho máximo:17<br/> Formato: NNNNNNNNNNNNNNNNN")
    /**
     * Número de documento de saída<br/>Tamanho mínimo: 1<br/>Tamanho máximo:17<br/> Formato: NNNNNNNNNNNNNNNNN
     **/
    private String numero = null;

    @XmlElement(name = "raDestinoDta")
    @ApiModelProperty(example = "7911101", value = "Recinto Aduaneiro de destino da DTA.")
    /**
     * Recinto Aduaneiro de destino da DTA.
     **/
    private String raDestinoDta = null;

    @XmlElement(name = "situacaoDuimp")
    @ApiModelProperty(example = "Desembaraçada", value = "Descrição da situação Duimp")
    /**
     * Descrição da situação Duimp
     **/
    private String situacaoDuimp = null;
    @XmlElement(name = "tipo")
    @ApiModelProperty(example = "20", value = "Tipo de documento de saída<p>Os documentos podem ser:</p>10 – DI<br/>11 – Processo Digital/Processo Dossiê<br/>12 – E-DMOV<br/>20 – Outros<br/>21 – PMB<br/>22 – PDE/TR<br/>23 – DSI Eletrônica<br/>24 – DSI Formulário<br/>30 – DTA - Entrada comum<br/>31 – DTA - Entrada especial - bagagem desacompanhada<br/>32 – DTA - Entrada especial - mala diplomática<br/>33 – DTA - Entrada especial - urna funerária<br/>34 – DTA - Entrada especial - outras<br/>35 – DTA - Passagem comum<br/>36 – DTA - Passagem especial - bagagem desacompanhada<br/>37 – DTA - Passagem especial - mala diplomática<br/>38 – DTA - Passagem especial - partes e peças<br/>39 – DTA - Passagem especial - urna funerária<br/>40 – DTA - Passagem especial - outras<br/>50 – DTI<br/>99 – DUIMP<br/>")
    /**
     * Tipo de documento de saída<p>Os documentos podem ser:</p>10 – DI<br/>11 – Processo Digital/Processo Dossiê<br/>12 – E-DMOV<br/>20 – Outros<br/>21 – PMB<br/>22 – PDE/TR<br/>23 – DSI Eletrônica<br/>24 – DSI Formulário<br/>30 – DTA - Entrada comum<br/>31 – DTA - Entrada especial - bagagem desacompanhada<br/>32 – DTA - Entrada especial - mala diplomática<br/>33 – DTA - Entrada especial - urna funerária<br/>34 – DTA - Entrada especial - outras<br/>35 – DTA - Passagem comum<br/>36 – DTA - Passagem especial - bagagem desacompanhada<br/>37 – DTA - Passagem especial - mala diplomática<br/>38 – DTA - Passagem especial - partes e peças<br/>39 – DTA - Passagem especial - urna funerária<br/>40 – DTA - Passagem especial - outras<br/>50 – DTI<br/>99 – DUIMP<br/>
     **/
    private TipoEnum tipo = null;
    @XmlElement(name = "uaDestinoDta")
    @ApiModelProperty(example = "0717700", value = "Unidade da RFB de destino da DTA.")
    /**
     * Unidade da RFB de destino da DTA.
     **/
    private String uaDestinoDta = null;
    @XmlElement(name = "versaoDuimp")
    @ApiModelProperty(value = "Versão da Duimp")
    /**
     * Versão da Duimp
     **/
    private Integer versaoDuimp = null;

    @XmlElement(name = "valorTotalMercadoriaLocalDescarga")
    @ApiModelProperty(example = "5866.26", value = "Valor total da mercadoria no local de descarga")
    @Valid
    /**
     * Valor total da mercadoria no local de descarga
     **/
    private BigDecimal valorTotalMercadoriaLocalDescarga = null;

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
     * Tipo de canal em que caiu a Duimp
     *
     * @return canalDuimp
     **/
    @JsonProperty("canalDuimp")
    public String getCanalDuimp() {
        return canalDuimp;
    }

    public void setCanalDuimp(String canalDuimp) {
        this.canalDuimp = canalDuimp;
    }

    public DocumentoSaidaConsultaDetalhada canalDuimp(String canalDuimp) {
        this.canalDuimp = canalDuimp;
        return this;
    }

    /**
     * Data de conclusão de DTA.
     *
     * @return dataConclusaoDta
     **/
    @JsonProperty("dataConclusaoDta")
    public String getDataConclusaoDta() {
        return dataConclusaoDta;
    }

    public void setDataConclusaoDta(String dataConclusaoDta) {
        this.dataConclusaoDta = dataConclusaoDta;
    }

    public DocumentoSaidaConsultaDetalhada dataConclusaoDta(String dataConclusaoDta) {
        this.dataConclusaoDta = dataConclusaoDta;
        return this;
    }

    /**
     * Data / Hora do registro&lt;br/&gt;
     *
     * @return dataHoraVinculacao
     **/
    @JsonProperty("dataHoraVinculacao")
    public String getDataHoraVinculacao() {
        return dataHoraVinculacao;
    }

    public void setDataHoraVinculacao(String dataHoraVinculacao) {
        this.dataHoraVinculacao = dataHoraVinculacao;
    }

    public DocumentoSaidaConsultaDetalhada dataHoraVinculacao(String dataHoraVinculacao) {
        this.dataHoraVinculacao = dataHoraVinculacao;
        return this;
    }

    /**
     * Número de documento de saída&lt;br/&gt;Tamanho mínimo: 1&lt;br/&gt;Tamanho máximo:17&lt;br/&gt; Formato: NNNNNNNNNNNNNNNNN
     *
     * @return numero
     **/
    @JsonProperty("numero")
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public DocumentoSaidaConsultaDetalhada numero(String numero) {
        this.numero = numero;
        return this;
    }

    /**
     * Recinto Aduaneiro de destino da DTA.
     *
     * @return raDestinoDta
     **/
    @JsonProperty("raDestinoDta")
    public String getRaDestinoDta() {
        return raDestinoDta;
    }

    public void setRaDestinoDta(String raDestinoDta) {
        this.raDestinoDta = raDestinoDta;
    }

    public DocumentoSaidaConsultaDetalhada raDestinoDta(String raDestinoDta) {
        this.raDestinoDta = raDestinoDta;
        return this;
    }

    /**
     * Descrição da situação Duimp
     *
     * @return situacaoDuimp
     **/
    @JsonProperty("situacaoDuimp")
    public String getSituacaoDuimp() {
        return situacaoDuimp;
    }

    public void setSituacaoDuimp(String situacaoDuimp) {
        this.situacaoDuimp = situacaoDuimp;
    }

    public DocumentoSaidaConsultaDetalhada situacaoDuimp(String situacaoDuimp) {
        this.situacaoDuimp = situacaoDuimp;
        return this;
    }

    /**
     * Tipo de documento de saída&lt;p&gt;Os documentos podem ser:&lt;/p&gt;10 – DI&lt;br/&gt;11 – Processo Digital/Processo Dossiê&lt;br/&gt;12 – E-DMOV&lt;br/&gt;20 – Outros&lt;br/&gt;21 – PMB&lt;br/&gt;22 – PDE/TR&lt;br/&gt;23 – DSI Eletrônica&lt;br/&gt;24 – DSI Formulário&lt;br/&gt;30 – DTA - Entrada comum&lt;br/&gt;31 – DTA - Entrada especial - bagagem desacompanhada&lt;br/&gt;32 – DTA - Entrada especial - mala diplomática&lt;br/&gt;33 – DTA - Entrada especial - urna funerária&lt;br/&gt;34 – DTA - Entrada especial - outras&lt;br/&gt;35 – DTA - Passagem comum&lt;br/&gt;36 – DTA - Passagem especial - bagagem desacompanhada&lt;br/&gt;37 – DTA - Passagem especial - mala diplomática&lt;br/&gt;38 – DTA - Passagem especial - partes e peças&lt;br/&gt;39 – DTA - Passagem especial - urna funerária&lt;br/&gt;40 – DTA - Passagem especial - outras&lt;br/&gt;50 – DTI&lt;br/&gt;99 – DUIMP&lt;br/&gt;
     *
     * @return tipo
     **/
    @JsonProperty("tipo")
    public String getTipo() {
        if (tipo == null) {
            return null;
        }
        return tipo.value();
    }

    public void setTipo(TipoEnum tipo) {
        this.tipo = tipo;
    }

    public DocumentoSaidaConsultaDetalhada tipo(TipoEnum tipo) {
        this.tipo = tipo;
        return this;
    }

    /**
     * Unidade da RFB de destino da DTA.
     *
     * @return uaDestinoDta
     **/
    @JsonProperty("uaDestinoDta")
    public String getUaDestinoDta() {
        return uaDestinoDta;
    }

    public void setUaDestinoDta(String uaDestinoDta) {
        this.uaDestinoDta = uaDestinoDta;
    }

    public DocumentoSaidaConsultaDetalhada uaDestinoDta(String uaDestinoDta) {
        this.uaDestinoDta = uaDestinoDta;
        return this;
    }

    /**
     * Valor total da mercadoria no local de descarga
     *
     * @return valorTotalMercadoriaLocalDescarga
     **/
    @JsonProperty("valorTotalMercadoriaLocalDescarga")
    public BigDecimal getValorTotalMercadoriaLocalDescarga() {
        return valorTotalMercadoriaLocalDescarga;
    }

    public void setValorTotalMercadoriaLocalDescarga(BigDecimal valorTotalMercadoriaLocalDescarga) {
        this.valorTotalMercadoriaLocalDescarga = valorTotalMercadoriaLocalDescarga;
    }

    public DocumentoSaidaConsultaDetalhada valorTotalMercadoriaLocalDescarga(BigDecimal valorTotalMercadoriaLocalDescarga) {
        this.valorTotalMercadoriaLocalDescarga = valorTotalMercadoriaLocalDescarga;
        return this;
    }

    /**
     * Versão da Duimp
     *
     * @return versaoDuimp
     **/
    @JsonProperty("versaoDuimp")
    public Integer getVersaoDuimp() {
        return versaoDuimp;
    }

    public void setVersaoDuimp(Integer versaoDuimp) {
        this.versaoDuimp = versaoDuimp;
    }

    public DocumentoSaidaConsultaDetalhada versaoDuimp(Integer versaoDuimp) {
        this.versaoDuimp = versaoDuimp;
        return this;
    }


    @Override
    public String toString() {

        String sb = "class DocumentoSaidaConsultaDetalhada {\n" +
                "    canalDuimp: " + toIndentedString(canalDuimp) + "\n" +
                "    dataConclusaoDta: " + toIndentedString(dataConclusaoDta) + "\n" +
                "    dataHoraVinculacao: " + toIndentedString(dataHoraVinculacao) + "\n" +
                "    numero: " + toIndentedString(numero) + "\n" +
                "    raDestinoDta: " + toIndentedString(raDestinoDta) + "\n" +
                "    situacaoDuimp: " + toIndentedString(situacaoDuimp) + "\n" +
                "    tipo: " + toIndentedString(tipo) + "\n" +
                "    uaDestinoDta: " + toIndentedString(uaDestinoDta) + "\n" +
                "    valorTotalMercadoriaLocalDescarga: " + toIndentedString(valorTotalMercadoriaLocalDescarga) + "\n" +
                "    versaoDuimp: " + toIndentedString(versaoDuimp) + "\n" +
                "}";
        return sb;
    }

    @XmlType(name = "TipoEnum")
    @XmlEnum(String.class)
    public enum TipoEnum {

        @XmlEnumValue("10")
        @JsonProperty("10")
        _10("10"),

        @XmlEnumValue("11")
        @JsonProperty("11")
        _11("11"),

        @XmlEnumValue("12")
        @JsonProperty("12")
        _12("12"),

        @XmlEnumValue("20")
        @JsonProperty("20")
        _20("20"),

        @XmlEnumValue("21")
        @JsonProperty("21")
        _21("21"),

        @XmlEnumValue("22")
        @JsonProperty("22")
        _22("22"),

        @XmlEnumValue("23")
        @JsonProperty("23")
        _23("23"),

        @XmlEnumValue("24")
        @JsonProperty("24")
        _24("24"),

        @XmlEnumValue("30")
        @JsonProperty("30")
        _30("30"),

        @XmlEnumValue("21")
        @JsonProperty("21")
        _21_9("21"),

        @XmlEnumValue("32")
        @JsonProperty("32")
        _32("32"),

        @XmlEnumValue("33")
        @JsonProperty("33")
        _33("33"),

        @XmlEnumValue("34")
        @JsonProperty("34")
        _34("34"),

        @XmlEnumValue("35")
        @JsonProperty("35")
        _35("35"),

        @XmlEnumValue("36")
        @JsonProperty("36")
        _36("36"),

        @XmlEnumValue("37")
        @JsonProperty("37")
        _37("37"),

        @XmlEnumValue("38")
        @JsonProperty("38")
        _38("38"),

        @XmlEnumValue("39")
        @JsonProperty("39")
        _39("39"),

        @XmlEnumValue("40")
        @JsonProperty("40")
        _40("40"),

        @XmlEnumValue("50")
        @JsonProperty("50")
        _50("50"),

        @XmlEnumValue("99")
        @JsonProperty("99")
        _99("99");


        private final String value;

        TipoEnum(String v) {
            value = v;
        }

        public static TipoEnum fromValue(String v) {
            for (TipoEnum b : TipoEnum.values()) {
                if (String.valueOf(b.value).equals(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "' to TipoEnum");
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
