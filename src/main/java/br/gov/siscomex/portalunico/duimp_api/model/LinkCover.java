package br.gov.siscomex.portalunico.duimp_api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "LinkCover", propOrder =
    { "_rel", "_href", "_method"
})

@XmlRootElement(name="LinkCover")
public class LinkCover  {
  
  @XmlElement(name="_rel")
  @ApiModelProperty(value = "Descrição de uma URL que provê um operação relacionada ao serviço utilizado.")
 /**
   * Descrição de uma URL que provê um operação relacionada ao serviço utilizado.
  **/
  private String _rel = null;

  @XmlElement(name="_href")
  @ApiModelProperty(value = "URL que deve ser utilizada para acessar o serviço descrito no atributo '_rel'")
 /**
   * URL que deve ser utilizada para acessar o serviço descrito no atributo '_rel'
  **/
  private String _href = null;


@XmlType(name="MethodEnum")
@XmlEnum(String.class)
public enum MethodEnum {

	@XmlEnumValue("GET")
	@JsonProperty("GET")
	GET(String.valueOf("GET")),
	
	@XmlEnumValue("HEAD")
	@JsonProperty("HEAD")
	HEAD(String.valueOf("HEAD")),
	
	@XmlEnumValue("POST")
	@JsonProperty("POST")
	POST(String.valueOf("POST")),
	
	@XmlEnumValue("PUT")
	@JsonProperty("PUT")
	PUT(String.valueOf("PUT")),
	
	@XmlEnumValue("DELETE")
	@JsonProperty("DELETE")
	DELETE(String.valueOf("DELETE")),
	
	@XmlEnumValue("OPTIONS")
	@JsonProperty("OPTIONS")
	OPTIONS(String.valueOf("OPTIONS")),
	
	@XmlEnumValue("TRACE")
	@JsonProperty("TRACE")
	TRACE(String.valueOf("TRACE")),
	
	@XmlEnumValue("PATCH")
	@JsonProperty("PATCH")
	PATCH(String.valueOf("PATCH"));


    private String value;

    MethodEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static MethodEnum fromValue(String v) {
        for (MethodEnum b : MethodEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to MethodEnum");
    }
}

  @XmlElement(name="_method")
  @ApiModelProperty(value = "Método HTTP que deve ser utilizado para acessar o serviço")
 /**
   * Método HTTP que deve ser utilizado para acessar o serviço
  **/
  private MethodEnum _method = null;
 /**
   * Descrição de uma URL que provê um operação relacionada ao serviço utilizado.
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

 /**
   * URL que deve ser utilizada para acessar o serviço descrito no atributo &#39;_rel&#39;
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


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkCover {\n");
    
    sb.append("    _rel: ").append(toIndentedString(_rel)).append("\n");
    sb.append("    _href: ").append(toIndentedString(_href)).append("\n");
    sb.append("    _method: ").append(toIndentedString(_method)).append("\n");
    sb.append("}");
    return sb.toString();
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

