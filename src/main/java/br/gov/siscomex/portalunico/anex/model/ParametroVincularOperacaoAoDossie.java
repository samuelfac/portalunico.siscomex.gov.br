package br.gov.siscomex.portalunico.anex.model;

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
@XmlType(name = "ParametroVincularOperacaoAoDossie", propOrder =
        {"numeroDossie", "numeroOperacao", "tipoOperacao"
        })

@XmlRootElement(name = "ParametroVincularOperacaoAoDossie")
/**
 * Representação da vinculação de um dossie a uma operação ou vice-versa
 **/
@ApiModel(description = "Representação da vinculação de um dossie a uma operação ou vice-versa")
public class ParametroVincularOperacaoAoDossie {

    @XmlElement(name = "numeroDossie", required = true)
    @ApiModelProperty(example = "201900012345678", required = true, value = "Número do dossiê.<br/>Tamanho: 15<br/>Formato: NNNNNNNNNNNNNNN")
    /**
     * Número do dossiê.<br/>Tamanho: 15<br/>Formato: NNNNNNNNNNNNNNN
     **/
    private String numeroDossie = null;

    @XmlElement(name = "numeroOperacao", required = true)
    @ApiModelProperty(example = "2000004120", required = true, value = "Número da operação.<br/>Tamanho máximo: 255<br/>Formato: de acordo com o definido em cada sistema de origem do tipo de operação.<br/><br/>Para DI - Declaração de Importação<br/>Formato: NNNNNNNNNN - 10 dígitos numéricos<br/>Exemplo: 2000004120<br/><br/>Para LI - Licença de Importação<br/>Formato: NNNNNNNNNNN - 11 dígitos numéricos<br/>Exemplo: 19000000235<br/><br/>Para RE - Registro de Exportação<br/>Formato: NNNNNNNNNNNN - 12 dígitos numéricos<br/>Exemplo: 190000005786<br/><br/>Para DT - Declaração de Trânsito<br/>Formato: NNNNNNNNNN - 10 dígitos numéricos<br/>Exemplo: 2100003784<br/>")
    /**
     * Número da operação.<br/>Tamanho máximo: 255<br/>Formato: de acordo com o definido em cada sistema de origem do tipo de operação.<br/><br/>Para DI - Declaração de Importação<br/>Formato: NNNNNNNNNN - 10 dígitos numéricos<br/>Exemplo: 2000004120<br/><br/>Para LI - Licença de Importação<br/>Formato: NNNNNNNNNNN - 11 dígitos numéricos<br/>Exemplo: 19000000235<br/><br/>Para RE - Registro de Exportação<br/>Formato: NNNNNNNNNNNN - 12 dígitos numéricos<br/>Exemplo: 190000005786<br/><br/>Para DT - Declaração de Trânsito<br/>Formato: NNNNNNNNNN - 10 dígitos numéricos<br/>Exemplo: 2100003784<br/>
     **/
    private String numeroOperacao = null;


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

    @XmlElement(name = "tipoOperacao", required = true)
    @ApiModelProperty(example = "DI", required = true, value = "DI - Declaração de Importação<br/>LI - Licença de Importação<br/>RE - Registro de Exportação<br/>DT - Declaração de Trânsito<br/>")
    /**
     * DI - Declaração de Importação<br/>LI - Licença de Importação<br/>RE - Registro de Exportação<br/>DT - Declaração de Trânsito<br/>
     **/
    private TipoOperacaoEnum tipoOperacao = null;

    /**
     * Número do dossiê.&lt;br/&gt;Tamanho: 15&lt;br/&gt;Formato: NNNNNNNNNNNNNNN
     *
     * @return numeroDossie
     **/
    @JsonProperty("numeroDossie")
    @NotNull
    public String getNumeroDossie() {
        return numeroDossie;
    }

    public void setNumeroDossie(String numeroDossie) {
        this.numeroDossie = numeroDossie;
    }

    public ParametroVincularOperacaoAoDossie numeroDossie(String numeroDossie) {
        this.numeroDossie = numeroDossie;
        return this;
    }

    /**
     * Número da operação.&lt;br/&gt;Tamanho máximo: 255&lt;br/&gt;Formato: de acordo com o definido em cada sistema de origem do tipo de operação.&lt;br/&gt;&lt;br/&gt;Para DI - Declaração de Importação&lt;br/&gt;Formato: NNNNNNNNNN - 10 dígitos numéricos&lt;br/&gt;Exemplo: 2000004120&lt;br/&gt;&lt;br/&gt;Para LI - Licença de Importação&lt;br/&gt;Formato: NNNNNNNNNNN - 11 dígitos numéricos&lt;br/&gt;Exemplo: 19000000235&lt;br/&gt;&lt;br/&gt;Para RE - Registro de Exportação&lt;br/&gt;Formato: NNNNNNNNNNNN - 12 dígitos numéricos&lt;br/&gt;Exemplo: 190000005786&lt;br/&gt;&lt;br/&gt;Para DT - Declaração de Trânsito&lt;br/&gt;Formato: NNNNNNNNNN - 10 dígitos numéricos&lt;br/&gt;Exemplo: 2100003784&lt;br/&gt;
     *
     * @return numeroOperacao
     **/
    @JsonProperty("numeroOperacao")
    @NotNull
    public String getNumeroOperacao() {
        return numeroOperacao;
    }

    public void setNumeroOperacao(String numeroOperacao) {
        this.numeroOperacao = numeroOperacao;
    }

    public ParametroVincularOperacaoAoDossie numeroOperacao(String numeroOperacao) {
        this.numeroOperacao = numeroOperacao;
        return this;
    }

    /**
     * DI - Declaração de Importação&lt;br/&gt;LI - Licença de Importação&lt;br/&gt;RE - Registro de Exportação&lt;br/&gt;DT - Declaração de Trânsito&lt;br/&gt;
     *
     * @return tipoOperacao
     **/
    @JsonProperty("tipoOperacao")
    @NotNull
    public String getTipoOperacao() {
        if (tipoOperacao == null) {
            return null;
        }
        return tipoOperacao.value();
    }

    public void setTipoOperacao(TipoOperacaoEnum tipoOperacao) {
        this.tipoOperacao = tipoOperacao;
    }

    public ParametroVincularOperacaoAoDossie tipoOperacao(TipoOperacaoEnum tipoOperacao) {
        this.tipoOperacao = tipoOperacao;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class ParametroVincularOperacaoAoDossie {\n" +
                "    numeroDossie: " + toIndentedString(numeroDossie) + "\n" +
                "    numeroOperacao: " + toIndentedString(numeroOperacao) + "\n" +
                "    tipoOperacao: " + toIndentedString(tipoOperacao) + "\n" +
                "}";
        return sb;
    }

    @XmlType(name = "TipoOperacaoEnum")
    @XmlEnum(String.class)
    public enum TipoOperacaoEnum {

        @XmlEnumValue("DI")
        @JsonProperty("DI")
        DI("DI"),

        @XmlEnumValue("LI")
        @JsonProperty("LI")
        LI("LI"),

        @XmlEnumValue("RE")
        @JsonProperty("RE")
        RE("RE"),

        @XmlEnumValue("DT")
        @JsonProperty("DT")
        DT("DT");


        private final String value;

        TipoOperacaoEnum(String v) {
            value = v;
        }

        public static TipoOperacaoEnum fromValue(String v) {
            for (TipoOperacaoEnum b : TipoOperacaoEnum.values()) {
                if (String.valueOf(b.value).equals(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "' to TipoOperacaoEnum");
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
