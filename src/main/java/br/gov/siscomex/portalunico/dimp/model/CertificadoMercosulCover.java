package br.gov.siscomex.portalunico.dimp.model;

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
@XmlType(name = "CertificadoMercosulCover", propOrder =
        {"tipo", "numero", "quantidade"
        })

@XmlRootElement(name = "CertificadoMercosulCover")
/**
 * Lista de declarações estrangeiras.<br>Observação: Este atributo somente deve ser preenchido quando o país de procedência é pertencente ao Mercosul.<br>Observação: Este grupo será preenchido apenas nos casos de importação de mercadorias que procedam diretamente do exterior cujo país de procedência seja membro do MERCOSUL.
 **/
@ApiModel(description = "Lista de declarações estrangeiras.<br>Observação: Este atributo somente deve ser preenchido quando o país de procedência é pertencente ao Mercosul.<br>Observação: Este grupo será preenchido apenas nos casos de importação de mercadorias que procedam diretamente do exterior cujo país de procedência seja membro do MERCOSUL.")
public class CertificadoMercosulCover {


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

    @XmlElement(name = "tipo", required = true)
    @ApiModelProperty(example = "CCPTC", required = true, value = "Tipo de certificado Mercosul.<br>Domínio:")
    /**
     * Tipo de certificado Mercosul.<br>Domínio:
     **/
    private TipoEnum tipo = null;

    @XmlElement(name = "numero", required = true)
    @ApiModelProperty(example = "PY-06000AA0000A-0001", required = true, value = "Número do Certificado Mercosul.<br>Tamanho mínimo: 1<br>Tamanho máximo: 20")
    /**
     * Número do Certificado Mercosul.<br>Tamanho mínimo: 1<br>Tamanho máximo: 20
     **/
    private String numero = null;

    @XmlElement(name = "quantidade", required = true)
    @ApiModelProperty(example = "1.12345", required = true, value = "Quantidade da mercadoria na unidade estatística.<br>Tamanho: 11,5<br>Formato: Decimal, com até 5 casas decimais separadas por ponto.")
    /**
     * Quantidade da mercadoria na unidade estatística.<br>Tamanho: 11,5<br>Formato: Decimal, com até 5 casas decimais separadas por ponto.
     **/
    private String quantidade = null;

    /**
     * Tipo de certificado Mercosul.&lt;br&gt;Domínio:
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

    public CertificadoMercosulCover tipo(TipoEnum tipo) {
        this.tipo = tipo;
        return this;
    }

    /**
     * Número do Certificado Mercosul.&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 20
     *
     * @return numero
     **/
    @JsonProperty("numero")
    @NotNull
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public CertificadoMercosulCover numero(String numero) {
        this.numero = numero;
        return this;
    }

    /**
     * Quantidade da mercadoria na unidade estatística.&lt;br&gt;Tamanho: 11,5&lt;br&gt;Formato: Decimal, com até 5 casas decimais separadas por ponto.
     *
     * @return quantidade
     **/
    @JsonProperty("quantidade")
    @NotNull
    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    public CertificadoMercosulCover quantidade(String quantidade) {
        this.quantidade = quantidade;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class CertificadoMercosulCover {\n" +
                "    tipo: " + toIndentedString(tipo) + "\n" +
                "    numero: " + toIndentedString(numero) + "\n" +
                "    quantidade: " + toIndentedString(quantidade) + "\n" +
                "}";
        return sb;
    }

    @XmlType(name = "TipoEnum")
    @XmlEnum(String.class)
    public enum TipoEnum {

        @XmlEnumValue("CCPTC")
        @JsonProperty("CCPTC")
        CCPTC("CCPTC"),

        @XmlEnumValue("CCROM")
        @JsonProperty("CCROM")
        CCROM("CCROM");


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
