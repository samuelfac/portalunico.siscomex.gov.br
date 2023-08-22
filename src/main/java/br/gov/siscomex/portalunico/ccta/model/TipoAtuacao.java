package br.gov.siscomex.portalunico.ccta.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "TipoAtuacao", propOrder =
    { "codigo", "descricao"
})

@XmlRootElement(name="TipoAtuacao")
public class TipoAtuacao  {
  

@XmlType(name="CodigoEnum")
@XmlEnum(String.class)
public enum CodigoEnum {

	@XmlEnumValue("C")
	@JsonProperty("C")
	C(String.valueOf("C")),
	
	@XmlEnumValue("A")
	@JsonProperty("A")
	A(String.valueOf("A"));


    private String value;

    CodigoEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static CodigoEnum fromValue(String v) {
        for (CodigoEnum b : CodigoEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to CodigoEnum");
    }
}

  @XmlElement(name="codigo")
  @ApiModelProperty(example = "C", value = "Código do tipo de atuação.<br/>Tamanho: 1<br/>C - Transportador<br/>A - Agente de Carga")
 /**
   * Código do tipo de atuação.<br/>Tamanho: 1<br/>C - Transportador<br/>A - Agente de Carga
  **/
  private CodigoEnum codigo = null;

  @XmlElement(name="descricao")
  @ApiModelProperty(example = "Transportador", value = "Descrição do tipo de atuação.<br/>Tamanho: 15")
 /**
   * Descrição do tipo de atuação.<br/>Tamanho: 15
  **/
  private String descricao = null;
 /**
   * Código do tipo de atuação.&lt;br/&gt;Tamanho: 1&lt;br/&gt;C - Transportador&lt;br/&gt;A - Agente de Carga
   * @return codigo
  **/
  @JsonProperty("codigo")
  public String getCodigo() {
    if (codigo == null) {
      return null;
    }
    return codigo.value();
  }

  public void setCodigo(CodigoEnum codigo) {
    this.codigo = codigo;
  }

  public TipoAtuacao codigo(CodigoEnum codigo) {
    this.codigo = codigo;
    return this;
  }

 /**
   * Descrição do tipo de atuação.&lt;br/&gt;Tamanho: 15
   * @return descricao
  **/
  @JsonProperty("descricao")
  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public TipoAtuacao descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TipoAtuacao {\n");
    
    sb.append("    codigo: ").append(toIndentedString(codigo)).append("\n");
    sb.append("    descricao: ").append(toIndentedString(descricao)).append("\n");
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

