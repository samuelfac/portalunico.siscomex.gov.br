package br.gov.siscomex.portalunico.dimp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LinkCover", propOrder =
        {"_href", "_method", "_rel"
        })

@XmlRootElement(name = "LinkCover")
public class LinkCover {

    @XmlElement(name = "_href")
    @ApiModelProperty(value = "URL que deve ser utilizada para acessar o serviço descrito no atributo '_rel'")
    /**
     * URL que deve ser utilizada para acessar o serviço descrito no atributo '_rel'
     **/
    private String _href = null;
    @XmlElement(name = "_method")
    @ApiModelProperty(value = "Método HTTP que deve ser utilizado para acessar o serviço")
    /**
     * Método HTTP que deve ser utilizado para acessar o serviço
     **/
    private MethodEnum _method = null;
    @XmlElement(name = "_rel")
    @ApiModelProperty(value = "Descrição de uma URL que provê um operação relacionada ao serviço utilizado.")
    /**
     * Descrição de uma URL que provê um operação relacionada ao serviço utilizado.
     **/
    private String _rel = null;

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
     * URL que deve ser utilizada para acessar o serviço descrito no atributo &#39;_rel&#39;
     *
     * @return _href
     **/
    @JsonProperty("_href")
    public String getHref() {
        return _href;
    }

    public void setHref(String _href) {
        this._href = _href;
    }

    public LinkCover _href(String _href) {
        this._href = _href;
        return this;
    }

    /**
     * Método HTTP que deve ser utilizado para acessar o serviço
     *
     * @return _method
     **/
    @JsonProperty("_method")
    public String getMethod() {
        if (_method == null) {
            return null;
        }
        return _method.value();
    }

    public void setMethod(MethodEnum _method) {
        this._method = _method;
    }

    public LinkCover _method(MethodEnum _method) {
        this._method = _method;
        return this;
    }

    /**
     * Descrição de uma URL que provê um operação relacionada ao serviço utilizado.
     *
     * @return _rel
     **/
    @JsonProperty("_rel")
    public String getRel() {
        return _rel;
    }

    public void setRel(String _rel) {
        this._rel = _rel;
    }

    public LinkCover _rel(String _rel) {
        this._rel = _rel;
        return this;
    }


    @Override
    public String toString() {

        String sb = "class LinkCover {\n" +
                "    _href: " + toIndentedString(_href) + "\n" +
                "    _method: " + toIndentedString(_method) + "\n" +
                "    _rel: " + toIndentedString(_rel) + "\n" +
                "}";
        return sb;
    }

    @XmlType(name = "MethodEnum")
    @XmlEnum(String.class)
    public enum MethodEnum {

        @XmlEnumValue("GET")
        @JsonProperty("GET")
        GET("GET"),

        @XmlEnumValue("HEAD")
        @JsonProperty("HEAD")
        HEAD("HEAD"),

        @XmlEnumValue("POST")
        @JsonProperty("POST")
        POST("POST"),

        @XmlEnumValue("PUT")
        @JsonProperty("PUT")
        PUT("PUT"),

        @XmlEnumValue("DELETE")
        @JsonProperty("DELETE")
        DELETE("DELETE"),

        @XmlEnumValue("OPTIONS")
        @JsonProperty("OPTIONS")
        OPTIONS("OPTIONS"),

        @XmlEnumValue("TRACE")
        @JsonProperty("TRACE")
        TRACE("TRACE"),

        @XmlEnumValue("PATCH")
        @JsonProperty("PATCH")
        PATCH("PATCH");


        private final String value;

        MethodEnum(String v) {
            value = v;
        }

        public static MethodEnum fromValue(String v) {
            for (MethodEnum b : MethodEnum.values()) {
                if (String.valueOf(b.value).equals(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "' to MethodEnum");
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
