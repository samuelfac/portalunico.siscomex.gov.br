package br.gov.siscomex.portalunico.rcnt.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DadosDocumentoEstrangeiro", propOrder =
        {"numero", "paisEmissor", "tipo", "validade"
        })

@XmlRootElement(name = "DadosDocumentoEstrangeiro")
/**
 * Informar apenas no caso de estrangeiro sem CPF
 **/
@ApiModel(description = "Informar apenas no caso de estrangeiro sem CPF")
public class DadosDocumentoEstrangeiro {

    @XmlElement(name = "numero")
    @ApiModelProperty(value = "Número do documento<font color=\"red\"><strong><br/>(!)</strong></font>É obrigatório que os atributos 'documentoEstrangeiro.numero', 'documentoEstrangeiro.tipo' e 'documentoEstrangeiro.paisEmissor' sejam informados quando o atributo 'cpf' não for informado.<br/>Tamanho: 50")
    /**
     * Número do documento<font color=\"red\"><strong><br/>(!)</strong></font>É obrigatório que os atributos 'documentoEstrangeiro.numero', 'documentoEstrangeiro.tipo' e 'documentoEstrangeiro.paisEmissor' sejam informados quando o atributo 'cpf' não for informado.<br/>Tamanho: 50
     **/
    private String numero = null;

    @XmlElement(name = "paisEmissor")
    @ApiModelProperty(example = "DE", value = "País emissor do documento. Conforme tabela de domínio País disponível no <a href=https://portalunico.siscomex.gov.br/tabx/#/tabelas rel=\"noopener noreferrer\" target=\"_blank\">Portal Único Siscomex.</a><font color=\"red\"><strong><br/>(!)</strong></font>É obrigatório que os atributos 'documentoEstrangeiro.numero', 'documentoEstrangeiro.tipo' e 'documentoEstrangeiro.paisEmissor' sejam informados quando o atributo 'cpf' não for informado.")
    /**
     * País emissor do documento. Conforme tabela de domínio País disponível no <a href=https://portalunico.siscomex.gov.br/tabx/#/tabelas rel=\"noopener noreferrer\" target=\"_blank\">Portal Único Siscomex.</a><font color=\"red\"><strong><br/>(!)</strong></font>É obrigatório que os atributos 'documentoEstrangeiro.numero', 'documentoEstrangeiro.tipo' e 'documentoEstrangeiro.paisEmissor' sejam informados quando o atributo 'cpf' não for informado.
     **/
    private String paisEmissor = null;


    @XmlElement(name = "tipo")
    @ApiModelProperty(example = "I", value = "Tipo de documento<br/>Domínio:<br/>I - Identidade<br/>P - Passaporte<font color=\"red\"><strong><br/>(!)</strong></font>É obrigatório que os atributos 'documentoEstrangeiro.numero', 'documentoEstrangeiro.tipo' e 'documentoEstrangeiro.paisEmissor' sejam informados quando o atributo 'cpf' não for informado.")
    /**
     * Tipo de documento<br/>Domínio:<br/>I - Identidade<br/>P - Passaporte<font color=\"red\"><strong><br/>(!)</strong></font>É obrigatório que os atributos 'documentoEstrangeiro.numero', 'documentoEstrangeiro.tipo' e 'documentoEstrangeiro.paisEmissor' sejam informados quando o atributo 'cpf' não for informado.
     **/
    private TipoEnum tipo = null;

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

    @XmlElement(name = "validade")
    @ApiModelProperty(example = "2020-04-01", value = "Validade do documento<br/>Formato: 'yyyy-MM-dd'")
    /**
     * Validade do documento<br/>Formato: 'yyyy-MM-dd'
     **/
    private String validade = null;

    /**
     * Número do documento&lt;font color&#x3D;\&quot;red\&quot;&gt;&lt;strong&gt;&lt;br/&gt;(!)&lt;/strong&gt;&lt;/font&gt;É obrigatório que os atributos &#39;documentoEstrangeiro.numero&#39;, &#39;documentoEstrangeiro.tipo&#39; e &#39;documentoEstrangeiro.paisEmissor&#39; sejam informados quando o atributo &#39;cpf&#39; não for informado.&lt;br/&gt;Tamanho: 50
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

    public DadosDocumentoEstrangeiro numero(String numero) {
        this.numero = numero;
        return this;
    }

    /**
     * País emissor do documento. Conforme tabela de domínio País disponível no &lt;a href&#x3D;https://portalunico.siscomex.gov.br/tabx/#/tabelas rel&#x3D;\&quot;noopener noreferrer\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Portal Único Siscomex.&lt;/a&gt;&lt;font color&#x3D;\&quot;red\&quot;&gt;&lt;strong&gt;&lt;br/&gt;(!)&lt;/strong&gt;&lt;/font&gt;É obrigatório que os atributos &#39;documentoEstrangeiro.numero&#39;, &#39;documentoEstrangeiro.tipo&#39; e &#39;documentoEstrangeiro.paisEmissor&#39; sejam informados quando o atributo &#39;cpf&#39; não for informado.
     *
     * @return paisEmissor
     **/
    @JsonProperty("paisEmissor")
    public String getPaisEmissor() {
        return paisEmissor;
    }

    public void setPaisEmissor(String paisEmissor) {
        this.paisEmissor = paisEmissor;
    }

    public DadosDocumentoEstrangeiro paisEmissor(String paisEmissor) {
        this.paisEmissor = paisEmissor;
        return this;
    }

    /**
     * Tipo de documento&lt;br/&gt;Domínio:&lt;br/&gt;I - Identidade&lt;br/&gt;P - Passaporte&lt;font color&#x3D;\&quot;red\&quot;&gt;&lt;strong&gt;&lt;br/&gt;(!)&lt;/strong&gt;&lt;/font&gt;É obrigatório que os atributos &#39;documentoEstrangeiro.numero&#39;, &#39;documentoEstrangeiro.tipo&#39; e &#39;documentoEstrangeiro.paisEmissor&#39; sejam informados quando o atributo &#39;cpf&#39; não for informado.
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

    public DadosDocumentoEstrangeiro tipo(TipoEnum tipo) {
        this.tipo = tipo;
        return this;
    }

    /**
     * Validade do documento&lt;br/&gt;Formato: &#39;yyyy-MM-dd&#39;
     *
     * @return validade
     **/
    @JsonProperty("validade")
    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public DadosDocumentoEstrangeiro validade(String validade) {
        this.validade = validade;
        return this;
    }


    @Override
    public String toString() {

        String sb = "class DadosDocumentoEstrangeiro {\n" +
                "    numero: " + toIndentedString(numero) + "\n" +
                "    paisEmissor: " + toIndentedString(paisEmissor) + "\n" +
                "    tipo: " + toIndentedString(tipo) + "\n" +
                "    validade: " + toIndentedString(validade) + "\n" +
                "}";
        return sb;
    }

    @XmlType(name = "TipoEnum")
    @XmlEnum(String.class)
    public enum TipoEnum {

        @XmlEnumValue("'I'")
        @JsonProperty("'I'")
        I_("'I'"),

        @XmlEnumValue("'P'")
        @JsonProperty("'P'")
        P_("'P'");


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
