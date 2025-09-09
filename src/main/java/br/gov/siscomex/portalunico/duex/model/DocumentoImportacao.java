package br.gov.siscomex.portalunico.duex.model;

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
import java.time.OffsetDateTime;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentoImportacao", propOrder =
        {"numeroEDBV", "numeroProcesso", "tipo", "complemento", "numero", "numeroDSIFormulario", "dataRegistro", "numeroDSI", "numeroDI", "quantidadeUtilizada"
        })

@XmlRootElement(name = "DocumentoImportacao")
public class DocumentoImportacao {

    @XmlElement(name = "numeroEDBV")
    @ApiModelProperty(value = "Número da Declarção de Bens e Valores<br />Tamanho mínimo: 0<br />Tamanho máximo: 30")
    /**
     * Número da Declarção de Bens e Valores<br />Tamanho mínimo: 0<br />Tamanho máximo: 30
     **/
    private String numeroEDBV = null;

    @XmlElement(name = "numeroProcesso")
    @ApiModelProperty(value = "Número do processo<br />Formato: Inteiro, com até 17 digitos")
    /**
     * Número do processo<br />Formato: Inteiro, com até 17 digitos
     **/
    private Long numeroProcesso = null;
    @XmlElement(name = "tipo")
    @ApiModelProperty(value = "")
    private TipoEnum tipo = null;
    @XmlElement(name = "complemento")
    @ApiModelProperty(value = "Informação complementar<br />Tamanho mínimo: 0<br />Tamanho máximo: 20")
    /**
     * Informação complementar<br />Tamanho mínimo: 0<br />Tamanho máximo: 20
     **/
    private String complemento = null;
    @XmlElement(name = "numero")
    @ApiModelProperty(value = "")
    private String numero = null;
    @XmlElement(name = "numeroDSIFormulario")
    @ApiModelProperty(value = "Número da declaração simplificada de importação formulário<br />Tamanho mínimo: 0<br />Tamanho máximo: 30")
    /**
     * Número da declaração simplificada de importação formulário<br />Tamanho mínimo: 0<br />Tamanho máximo: 30
     **/
    private String numeroDSIFormulario = null;
    @XmlElement(name = "dataRegistro")
    @ApiModelProperty(example = "2019-09-20T14:13:46.966Z", value = "Data de registro<br />Formato:'yyyy-MM-dd'T'HH:mm:ss.SSSZ'")
    /**
     * Data de registro<br />Formato:'yyyy-MM-dd'T'HH:mm:ss.SSSZ'
     **/
    private OffsetDateTime dataRegistro = null;
    @XmlElement(name = "numeroDSI")
    @ApiModelProperty(value = "Número da declaração simplificada de importação<br />Tamanho mínimo: 0<br />Tamanho máximo: 30")
    /**
     * Número da declaração simplificada de importação<br />Tamanho mínimo: 0<br />Tamanho máximo: 30
     **/
    private String numeroDSI = null;
    @XmlElement(name = "numeroDI")
    @ApiModelProperty(value = "Número do documento de Importação<br />Tamanho mínimo: 0<br />Tamanho máximo: 30")
    /**
     * Número do documento de Importação<br />Tamanho mínimo: 0<br />Tamanho máximo: 30
     **/
    private String numeroDI = null;
    @XmlElement(name = "quantidadeUtilizada")
    @ApiModelProperty(value = "Valor da mercadoria na condição de venda<br />Tamanho: 14,5<br />Formato: Decimal, com até 5 casas decimais separadas por ponto.")
    @Valid
    /**
     * Valor da mercadoria na condição de venda<br />Tamanho: 14,5<br />Formato: Decimal, com até 5 casas decimais separadas por ponto.
     **/
    private BigDecimal quantidadeUtilizada = null;

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
     * Número da Declarção de Bens e Valores&lt;br /&gt;Tamanho mínimo: 0&lt;br /&gt;Tamanho máximo: 30
     *
     * @return numeroEDBV
     **/
    @JsonProperty("numeroEDBV")
    public String getNumeroEDBV() {
        return numeroEDBV;
    }

    public void setNumeroEDBV(String numeroEDBV) {
        this.numeroEDBV = numeroEDBV;
    }

    public DocumentoImportacao numeroEDBV(String numeroEDBV) {
        this.numeroEDBV = numeroEDBV;
        return this;
    }

    /**
     * Número do processo&lt;br /&gt;Formato: Inteiro, com até 17 digitos
     *
     * @return numeroProcesso
     **/
    @JsonProperty("numeroProcesso")
    public Long getNumeroProcesso() {
        return numeroProcesso;
    }

    public void setNumeroProcesso(Long numeroProcesso) {
        this.numeroProcesso = numeroProcesso;
    }

    public DocumentoImportacao numeroProcesso(Long numeroProcesso) {
        this.numeroProcesso = numeroProcesso;
        return this;
    }

    /**
     * Get tipo
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

    public DocumentoImportacao tipo(TipoEnum tipo) {
        this.tipo = tipo;
        return this;
    }

    /**
     * Informação complementar&lt;br /&gt;Tamanho mínimo: 0&lt;br /&gt;Tamanho máximo: 20
     *
     * @return complemento
     **/
    @JsonProperty("complemento")
    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public DocumentoImportacao complemento(String complemento) {
        this.complemento = complemento;
        return this;
    }

    /**
     * Get numero
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

    public DocumentoImportacao numero(String numero) {
        this.numero = numero;
        return this;
    }

    /**
     * Número da declaração simplificada de importação formulário&lt;br /&gt;Tamanho mínimo: 0&lt;br /&gt;Tamanho máximo: 30
     *
     * @return numeroDSIFormulario
     **/
    @JsonProperty("numeroDSIFormulario")
    public String getNumeroDSIFormulario() {
        return numeroDSIFormulario;
    }

    public void setNumeroDSIFormulario(String numeroDSIFormulario) {
        this.numeroDSIFormulario = numeroDSIFormulario;
    }

    public DocumentoImportacao numeroDSIFormulario(String numeroDSIFormulario) {
        this.numeroDSIFormulario = numeroDSIFormulario;
        return this;
    }

    /**
     * Data de registro&lt;br /&gt;Formato:&#39;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#39;
     *
     * @return dataRegistro
     **/
    @JsonProperty("dataRegistro")
    public OffsetDateTime getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(OffsetDateTime dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    public DocumentoImportacao dataRegistro(OffsetDateTime dataRegistro) {
        this.dataRegistro = dataRegistro;
        return this;
    }

    /**
     * Número da declaração simplificada de importação&lt;br /&gt;Tamanho mínimo: 0&lt;br /&gt;Tamanho máximo: 30
     *
     * @return numeroDSI
     **/
    @JsonProperty("numeroDSI")
    public String getNumeroDSI() {
        return numeroDSI;
    }

    public void setNumeroDSI(String numeroDSI) {
        this.numeroDSI = numeroDSI;
    }

    public DocumentoImportacao numeroDSI(String numeroDSI) {
        this.numeroDSI = numeroDSI;
        return this;
    }

    /**
     * Número do documento de Importação&lt;br /&gt;Tamanho mínimo: 0&lt;br /&gt;Tamanho máximo: 30
     *
     * @return numeroDI
     **/
    @JsonProperty("numeroDI")
    public String getNumeroDI() {
        return numeroDI;
    }

    public void setNumeroDI(String numeroDI) {
        this.numeroDI = numeroDI;
    }

    public DocumentoImportacao numeroDI(String numeroDI) {
        this.numeroDI = numeroDI;
        return this;
    }

    /**
     * Valor da mercadoria na condição de venda&lt;br /&gt;Tamanho: 14,5&lt;br /&gt;Formato: Decimal, com até 5 casas decimais separadas por ponto.
     *
     * @return quantidadeUtilizada
     **/
    @JsonProperty("quantidadeUtilizada")
    public BigDecimal getQuantidadeUtilizada() {
        return quantidadeUtilizada;
    }

    public void setQuantidadeUtilizada(BigDecimal quantidadeUtilizada) {
        this.quantidadeUtilizada = quantidadeUtilizada;
    }

    public DocumentoImportacao quantidadeUtilizada(BigDecimal quantidadeUtilizada) {
        this.quantidadeUtilizada = quantidadeUtilizada;
        return this;
    }


    @Override
    public String toString() {

        String sb = "class DocumentoImportacao {\n" +
                "    numeroEDBV: " + toIndentedString(numeroEDBV) + "\n" +
                "    numeroProcesso: " + toIndentedString(numeroProcesso) + "\n" +
                "    tipo: " + toIndentedString(tipo) + "\n" +
                "    complemento: " + toIndentedString(complemento) + "\n" +
                "    numero: " + toIndentedString(numero) + "\n" +
                "    numeroDSIFormulario: " + toIndentedString(numeroDSIFormulario) + "\n" +
                "    dataRegistro: " + toIndentedString(dataRegistro) + "\n" +
                "    numeroDSI: " + toIndentedString(numeroDSI) + "\n" +
                "    numeroDI: " + toIndentedString(numeroDI) + "\n" +
                "    quantidadeUtilizada: " + toIndentedString(quantidadeUtilizada) + "\n" +
                "}";
        return sb;
    }

    @XmlType(name = "TipoEnum")
    @XmlEnum(String.class)
    public enum TipoEnum {

        @XmlEnumValue("DI")
        @JsonProperty("DI")
        DI("DI"),

        @XmlEnumValue("DSI_ELETRONICA")
        @JsonProperty("DSI_ELETRONICA")
        DSI_ELETRONICA("DSI_ELETRONICA"),

        @XmlEnumValue("DSI_FORMULARIO")
        @JsonProperty("DSI_FORMULARIO")
        DSI_FORMULARIO("DSI_FORMULARIO"),

        @XmlEnumValue("E_DBV")
        @JsonProperty("E_DBV")
        E_DBV("E_DBV"),

        @XmlEnumValue("DUE_ITEM")
        @JsonProperty("DUE_ITEM")
        DUE_ITEM("DUE_ITEM"),

        @XmlEnumValue("DSE")
        @JsonProperty("DSE")
        DSE("DSE"),

        @XmlEnumValue("RE")
        @JsonProperty("RE")
        RE("RE"),

        @XmlEnumValue("DUIMP")
        @JsonProperty("DUIMP")
        DUIMP("DUIMP"),

        @XmlEnumValue("DSE_FORMULARIO")
        @JsonProperty("DSE_FORMULARIO")
        DSE_FORMULARIO("DSE_FORMULARIO");


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
