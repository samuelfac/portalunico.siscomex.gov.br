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
import java.time.OffsetDateTime;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Vinculo", propOrder =
        {"dataHoraVinculacao", "cpfVinculacao", "numeroOperacao", "tipoOperacao", "vinculadoPor"
        })

@XmlRootElement(name = "Vinculo")
/**
 * Vinculo do dossiê  com operação.
 **/
@ApiModel(description = "Vinculo do dossiê  com operação.")
public class Vinculo {

    @XmlElement(name = "dataHoraVinculacao")
    @ApiModelProperty(value = "Data/hora da vinculação do  dossiê à operação.<br/>Formato ISO 8601: yyyy-MM-dd'T'HH:mm:ss.SSSz")
    /**
     * Data/hora da vinculação do  dossiê à operação.<br/>Formato ISO 8601: yyyy-MM-dd'T'HH:mm:ss.SSSz
     **/
    private OffsetDateTime dataHoraVinculacao = null;

    @XmlElement(name = "cpfVinculacao", required = true)
    @ApiModelProperty(example = "77777777777", required = true, value = "CPF do usuário que vinculou o dossiê sem formatação.<br/>Tamanho: 11")
    /**
     * CPF do usuário que vinculou o dossiê sem formatação.<br/>Tamanho: 11
     **/
    private String cpfVinculacao = null;

    @XmlElement(name = "numeroOperacao", required = true)
    @ApiModelProperty(example = "19BR0000000174", required = true, value = "Número da operação.<br/>Tamanho máximo: 255<br/>Formato: de acordo com o definido em cada sistema de origem do tipo de operação.<br/><br/>Para DI - Declaração de Importação<br/>Formato: NNNNNNNNNN - 10 dígitos numéricos<br/>Exemplo: 2000004120<br/><br/>Para LI - Licença de Importação<br/>Formato: NNNNNNNNNNN - 11 dígitos numéricos<br/>Exemplo: 19000000235<br/><br/>Para RE - Registro de Exportação<br/>Formato: NNNNNNNNNNNN - 12 dígitos numéricos<br/>Exemplo: 190000005786<br/><br/>Para DT - Declaração de Trânsito<br/>Formato: NNNNNNNNNN - 10 dígitos numéricos<br/>Exemplo: 2100003784<br/><br/>Para DIR - Declaração de Importação de Remessa<br/>Formato: NNNNNNNNNNNN - 12 dígitos numéricos<br/>Exemplo: 210000103657<br/><br/>Para LPCO - Tratamento Administrativo/LPCO<br/>Formato: XNNNNNNNNNN - X = \"E\" para exportação ou \"I\" para importação concatenado com 10 dígitos numéricos<br/>Exemplo: E1900002152 ou I1900000454<br/><br/>Para CATP - Catálogo de Produtos<br/>Formato: <CNPJ Raíz ou CPF>-<código do produto><br/>onde:<br/><CNPJ Raíz> = NNNNNNNN - 8 primeiros dígitos do CNPJ<br/>&lt;CPF&gt; = NNNNNNNNNNN - 11 dígitos do CPF. É utilizado quando o usuário se auto representa como importador/exportador.<br/><código do produto> = NNNNNNNNNN - 10 dígitos do código do produto gerado no CATP - Catálogo de Produtos<br/>Exemplo: para CNPJ 00000000-0000001049, para CPF 01646244907-0000000001<br/><br/>Para DUE - Declaração Única de Exportação<br/>Formato: NNBRNNNNNNNNNN - 2 dígitos numéricos concatenados com \"BR\" e 10 dígitos numéricos<br/>Exemplo: 19BR0000000530<br/><br/>Para DUIMP - Declaração Única de Importação,<br/>Formato: NNBRNNNNNNNNNNN - 2 dígitos numéricos concatenados com \"BR\" e 11 dígitos numéricos<br/>Exemplo: 21BR00000002386<br/>")
    /**
     * Número da operação.<br/>Tamanho máximo: 255<br/>Formato: de acordo com o definido em cada sistema de origem do tipo de operação.<br/><br/>Para DI - Declaração de Importação<br/>Formato: NNNNNNNNNN - 10 dígitos numéricos<br/>Exemplo: 2000004120<br/><br/>Para LI - Licença de Importação<br/>Formato: NNNNNNNNNNN - 11 dígitos numéricos<br/>Exemplo: 19000000235<br/><br/>Para RE - Registro de Exportação<br/>Formato: NNNNNNNNNNNN - 12 dígitos numéricos<br/>Exemplo: 190000005786<br/><br/>Para DT - Declaração de Trânsito<br/>Formato: NNNNNNNNNN - 10 dígitos numéricos<br/>Exemplo: 2100003784<br/><br/>Para DIR - Declaração de Importação de Remessa<br/>Formato: NNNNNNNNNNNN - 12 dígitos numéricos<br/>Exemplo: 210000103657<br/><br/>Para LPCO - Tratamento Administrativo/LPCO<br/>Formato: XNNNNNNNNNN - X = \"E\" para exportação ou \"I\" para importação concatenado com 10 dígitos numéricos<br/>Exemplo: E1900002152 ou I1900000454<br/><br/>Para CATP - Catálogo de Produtos<br/>Formato: <CNPJ Raíz ou CPF>-<código do produto><br/>onde:<br/><CNPJ Raíz> = NNNNNNNN - 8 primeiros dígitos do CNPJ<br/>&lt;CPF&gt; = NNNNNNNNNNN - 11 dígitos do CPF. É utilizado quando o usuário se auto representa como importador/exportador.<br/><código do produto> = NNNNNNNNNN - 10 dígitos do código do produto gerado no CATP - Catálogo de Produtos<br/>Exemplo: para CNPJ 00000000-0000001049, para CPF 01646244907-0000000001<br/><br/>Para DUE - Declaração Única de Exportação<br/>Formato: NNBRNNNNNNNNNN - 2 dígitos numéricos concatenados com \"BR\" e 10 dígitos numéricos<br/>Exemplo: 19BR0000000530<br/><br/>Para DUIMP - Declaração Única de Importação,<br/>Formato: NNBRNNNNNNNNNNN - 2 dígitos numéricos concatenados com \"BR\" e 11 dígitos numéricos<br/>Exemplo: 21BR00000002386<br/>
     **/
    private String numeroOperacao = null;
    @XmlElement(name = "tipoOperacao", required = true)
    @ApiModelProperty(example = "DUE", required = true, value = "Identifica o tipo de operação desejado:<br/>DI - Declaração de Importação<br/>LI - Licença de Importação<br/>RE - Registro de Exportação<br/>DT - Declaração de Trânsito<br/>DIR - Declaração de Importação de Remessa<br/>CATP - Catálogo de Produtos<br/>DUE - Declaração Única de Exportação<br/>DUIMP - Declaração Única de Importação,<br/>LPCO - Tratamento Administrativo/LPCO<br/>")
    /**
     * Identifica o tipo de operação desejado:<br/>DI - Declaração de Importação<br/>LI - Licença de Importação<br/>RE - Registro de Exportação<br/>DT - Declaração de Trânsito<br/>DIR - Declaração de Importação de Remessa<br/>CATP - Catálogo de Produtos<br/>DUE - Declaração Única de Exportação<br/>DUIMP - Declaração Única de Importação,<br/>LPCO - Tratamento Administrativo/LPCO<br/>
     **/
    private TipoOperacaoEnum tipoOperacao = null;
    @XmlElement(name = "vinculadoPor", required = true)
    @ApiModelProperty(example = "Representante Legal", required = true, value = "Tipo de usuário/órgão que vinculou o dossiê.")
    /**
     * Tipo de usuário/órgão que vinculou o dossiê.
     **/
    private VinculadoPorEnum vinculadoPor = null;

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
     * Data/hora da vinculação do  dossiê à operação.&lt;br/&gt;Formato ISO 8601: yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSz
     *
     * @return dataHoraVinculacao
     **/
    @JsonProperty("dataHoraVinculacao")
    public OffsetDateTime getDataHoraVinculacao() {
        return dataHoraVinculacao;
    }

    public void setDataHoraVinculacao(OffsetDateTime dataHoraVinculacao) {
        this.dataHoraVinculacao = dataHoraVinculacao;
    }

    public Vinculo dataHoraVinculacao(OffsetDateTime dataHoraVinculacao) {
        this.dataHoraVinculacao = dataHoraVinculacao;
        return this;
    }

    /**
     * CPF do usuário que vinculou o dossiê sem formatação.&lt;br/&gt;Tamanho: 11
     *
     * @return cpfVinculacao
     **/
    @JsonProperty("cpfVinculacao")
    @NotNull
    public String getCpfVinculacao() {
        return cpfVinculacao;
    }

    public void setCpfVinculacao(String cpfVinculacao) {
        this.cpfVinculacao = cpfVinculacao;
    }

    public Vinculo cpfVinculacao(String cpfVinculacao) {
        this.cpfVinculacao = cpfVinculacao;
        return this;
    }

    /**
     * Número da operação.&lt;br/&gt;Tamanho máximo: 255&lt;br/&gt;Formato: de acordo com o definido em cada sistema de origem do tipo de operação.&lt;br/&gt;&lt;br/&gt;Para DI - Declaração de Importação&lt;br/&gt;Formato: NNNNNNNNNN - 10 dígitos numéricos&lt;br/&gt;Exemplo: 2000004120&lt;br/&gt;&lt;br/&gt;Para LI - Licença de Importação&lt;br/&gt;Formato: NNNNNNNNNNN - 11 dígitos numéricos&lt;br/&gt;Exemplo: 19000000235&lt;br/&gt;&lt;br/&gt;Para RE - Registro de Exportação&lt;br/&gt;Formato: NNNNNNNNNNNN - 12 dígitos numéricos&lt;br/&gt;Exemplo: 190000005786&lt;br/&gt;&lt;br/&gt;Para DT - Declaração de Trânsito&lt;br/&gt;Formato: NNNNNNNNNN - 10 dígitos numéricos&lt;br/&gt;Exemplo: 2100003784&lt;br/&gt;&lt;br/&gt;Para DIR - Declaração de Importação de Remessa&lt;br/&gt;Formato: NNNNNNNNNNNN - 12 dígitos numéricos&lt;br/&gt;Exemplo: 210000103657&lt;br/&gt;&lt;br/&gt;Para LPCO - Tratamento Administrativo/LPCO&lt;br/&gt;Formato: XNNNNNNNNNN - X &#x3D; \&quot;E\&quot; para exportação ou \&quot;I\&quot; para importação concatenado com 10 dígitos numéricos&lt;br/&gt;Exemplo: E1900002152 ou I1900000454&lt;br/&gt;&lt;br/&gt;Para CATP - Catálogo de Produtos&lt;br/&gt;Formato: &lt;CNPJ Raíz ou CPF&gt;-&lt;código do produto&gt;&lt;br/&gt;onde:&lt;br/&gt;&lt;CNPJ Raíz&gt; &#x3D; NNNNNNNN - 8 primeiros dígitos do CNPJ&lt;br/&gt;&amp;lt;CPF&amp;gt; &#x3D; NNNNNNNNNNN - 11 dígitos do CPF. É utilizado quando o usuário se auto representa como importador/exportador.&lt;br/&gt;&lt;código do produto&gt; &#x3D; NNNNNNNNNN - 10 dígitos do código do produto gerado no CATP - Catálogo de Produtos&lt;br/&gt;Exemplo: para CNPJ 00000000-0000001049, para CPF 01646244907-0000000001&lt;br/&gt;&lt;br/&gt;Para DUE - Declaração Única de Exportação&lt;br/&gt;Formato: NNBRNNNNNNNNNN - 2 dígitos numéricos concatenados com \&quot;BR\&quot; e 10 dígitos numéricos&lt;br/&gt;Exemplo: 19BR0000000530&lt;br/&gt;&lt;br/&gt;Para DUIMP - Declaração Única de Importação,&lt;br/&gt;Formato: NNBRNNNNNNNNNNN - 2 dígitos numéricos concatenados com \&quot;BR\&quot; e 11 dígitos numéricos&lt;br/&gt;Exemplo: 21BR00000002386&lt;br/&gt;
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

    public Vinculo numeroOperacao(String numeroOperacao) {
        this.numeroOperacao = numeroOperacao;
        return this;
    }

    /**
     * Identifica o tipo de operação desejado:&lt;br/&gt;DI - Declaração de Importação&lt;br/&gt;LI - Licença de Importação&lt;br/&gt;RE - Registro de Exportação&lt;br/&gt;DT - Declaração de Trânsito&lt;br/&gt;DIR - Declaração de Importação de Remessa&lt;br/&gt;CATP - Catálogo de Produtos&lt;br/&gt;DUE - Declaração Única de Exportação&lt;br/&gt;DUIMP - Declaração Única de Importação,&lt;br/&gt;LPCO - Tratamento Administrativo/LPCO&lt;br/&gt;
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

    public Vinculo tipoOperacao(TipoOperacaoEnum tipoOperacao) {
        this.tipoOperacao = tipoOperacao;
        return this;
    }

    /**
     * Tipo de usuário/órgão que vinculou o dossiê.
     *
     * @return vinculadoPor
     **/
    @JsonProperty("vinculadoPor")
    @NotNull
    public String getVinculadoPor() {
        if (vinculadoPor == null) {
            return null;
        }
        return vinculadoPor.value();
    }

    public void setVinculadoPor(VinculadoPorEnum vinculadoPor) {
        this.vinculadoPor = vinculadoPor;
    }

    public Vinculo vinculadoPor(VinculadoPorEnum vinculadoPor) {
        this.vinculadoPor = vinculadoPor;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class Vinculo {\n" +
                "    dataHoraVinculacao: " + toIndentedString(dataHoraVinculacao) + "\n" +
                "    cpfVinculacao: " + toIndentedString(cpfVinculacao) + "\n" +
                "    numeroOperacao: " + toIndentedString(numeroOperacao) + "\n" +
                "    tipoOperacao: " + toIndentedString(tipoOperacao) + "\n" +
                "    vinculadoPor: " + toIndentedString(vinculadoPor) + "\n" +
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
        DT("DT"),

        @XmlEnumValue("DIR")
        @JsonProperty("DIR")
        DIR("DIR"),

        @XmlEnumValue("CATP")
        @JsonProperty("CATP")
        CATP("CATP"),

        @XmlEnumValue("DUE")
        @JsonProperty("DUE")
        DUE("DUE"),

        @XmlEnumValue("DUIMP")
        @JsonProperty("DUIMP")
        DUIMP("DUIMP"),

        @XmlEnumValue("LPCO")
        @JsonProperty("LPCO")
        LPCO("LPCO");


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

    @XmlType(name = "VinculadoPorEnum")
    @XmlEnum(String.class)
    public enum VinculadoPorEnum {

        @XmlEnumValue("Representante Legal")
        @JsonProperty("Representante Legal")
        REPRESENTANTE_LEGAL("Representante Legal"),

        @XmlEnumValue("Administração Pública")
        @JsonProperty("Administração Pública")
        ADMINISTRA_O_P_BLICA("Administração Pública");


        private final String value;

        VinculadoPorEnum(String v) {
            value = v;
        }

        public static VinculadoPorEnum fromValue(String v) {
            for (VinculadoPorEnum b : VinculadoPorEnum.values()) {
                if (String.valueOf(b.value).equals(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "' to VinculadoPorEnum");
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
