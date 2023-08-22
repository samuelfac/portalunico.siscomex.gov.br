package br.gov.siscomex.portalunico.due.model;

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
 @XmlType(name = "Link", propOrder =
    { "href", "method", "rel", "title", "type"
})

@XmlRootElement(name="Link")
public class Link  {
  
  @XmlElement(name="href")
  @ApiModelProperty(value = "Href<br />Tamanho mínimo: 1<br />Tamanho máximo: 1024")
 /**
   * Href<br />Tamanho mínimo: 1<br />Tamanho máximo: 1024
  **/
  private String href = null;


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

  @XmlElement(name="method")
  @ApiModelProperty(value = "")
  private MethodEnum method = null;

  @XmlElement(name="rel")
  @ApiModelProperty(value = "Rel<br />Tamanho mínimo: 0<br />Tamanho máximo: 200")
 /**
   * Rel<br />Tamanho mínimo: 0<br />Tamanho máximo: 200
  **/
  private String rel = null;

  @XmlElement(name="title")
  @ApiModelProperty(value = "Title<br />Tamanho mínimo: 0<br />Tamanho máximo: 200")
 /**
   * Title<br />Tamanho mínimo: 0<br />Tamanho máximo: 200
  **/
  private String title = null;

  @XmlElement(name="type")
  @ApiModelProperty(value = "Media Type<br />Tamanho mínimo: 0<br />Tamanho máximo: 50")
 /**
   * Media Type<br />Tamanho mínimo: 0<br />Tamanho máximo: 50
  **/
  private String type = null;
 /**
   * Href&lt;br /&gt;Tamanho mínimo: 1&lt;br /&gt;Tamanho máximo: 1024
   * @return href
  **/
  @JsonProperty("href")
  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public Link href(String href) {
    this.href = href;
    return this;
  }

 /**
   * Get method
   * @return method
  **/
  @JsonProperty("method")
  public String getMethod() {
    if (method == null) {
      return null;
    }
    return method.value();
  }

  public void setMethod(MethodEnum method) {
    this.method = method;
  }

  public Link method(MethodEnum method) {
    this.method = method;
    return this;
  }

 /**
   * Rel&lt;br /&gt;Tamanho mínimo: 0&lt;br /&gt;Tamanho máximo: 200
   * @return rel
  **/
  @JsonProperty("rel")
  public String getRel() {
    return rel;
  }

  public void setRel(String rel) {
    this.rel = rel;
  }

  public Link rel(String rel) {
    this.rel = rel;
    return this;
  }

 /**
   * Title&lt;br /&gt;Tamanho mínimo: 0&lt;br /&gt;Tamanho máximo: 200
   * @return title
  **/
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Link title(String title) {
    this.title = title;
    return this;
  }

 /**
   * Media Type&lt;br /&gt;Tamanho mínimo: 0&lt;br /&gt;Tamanho máximo: 50
   * @return type
  **/
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Link type(String type) {
    this.type = type;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Link {\n");
    
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    rel: ").append(toIndentedString(rel)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

