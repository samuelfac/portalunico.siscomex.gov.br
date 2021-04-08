package br.gov.siscomex.portalunico.rcnt.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "DadosDocumentoEstrangeiro", propOrder =
    { "numero", "tipo", "validade", "paisEmissor"
})

@XmlRootElement(name="DadosDocumentoEstrangeiro")
public class DadosDocumentoEstrangeiro  {
  
  @XmlElement(name="numero")
  @ApiModelProperty(value = "Número do documento<br/>Tamanho: 50")
 /**
   * Número do documento<br/>Tamanho: 50
  **/
  private String numero = null;


@XmlType(name="TipoEnum")
@XmlEnum(String.class)
public enum TipoEnum {

	@XmlEnumValue("'I'")
	@JsonProperty("'I'")
	I_(String.valueOf("'I'")),
	
	@XmlEnumValue("'P'")
	@JsonProperty("'P'")
	P_(String.valueOf("'P'"));


    private String value;

    TipoEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TipoEnum fromValue(String v) {
        for (TipoEnum b : TipoEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to TipoEnum");
    }
}

  @XmlElement(name="tipo")
  @ApiModelProperty(example = "I", value = "Tipo de documento<br/>Domínio:<br/>I - Identidade<br/>P - Passaporte")
 /**
   * Tipo de documento<br/>Domínio:<br/>I - Identidade<br/>P - Passaporte
  **/
  private TipoEnum tipo = null;

  @XmlElement(name="validade")
  @ApiModelProperty(example = "2020-04-01", value = "Validade do documento<br/>Formato: 'yyyy-MM-dd'")
 /**
   * Validade do documento<br/>Formato: 'yyyy-MM-dd'
  **/
  private String validade = null;

  @XmlElement(name="paisEmissor")
  @ApiModelProperty(example = "23", value = "País emissor do documento conforme tabela de domínio<br/>Domínio: conforme <a href=\"../pages/exemplos/rcnt/Pais.pdf\" rel=\"noopener noreferrer\" target=\"_blank\"> Pais.pdf </a>")
 /**
   * País emissor do documento conforme tabela de domínio<br/>Domínio: conforme <a href=\"../pages/exemplos/rcnt/Pais.pdf\" rel=\"noopener noreferrer\" target=\"_blank\"> Pais.pdf </a>
  **/
  private String paisEmissor = null;
 /**
   * Número do documento&lt;br/&gt;Tamanho: 50
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
   * Tipo de documento&lt;br/&gt;Domínio:&lt;br/&gt;I - Identidade&lt;br/&gt;P - Passaporte
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

 /**
   * País emissor do documento conforme tabela de domínio&lt;br/&gt;Domínio: conforme &lt;a href&#x3D;\&quot;../pages/exemplos/rcnt/Pais.pdf\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot; target&#x3D;\&quot;_blank\&quot;&gt; Pais.pdf &lt;/a&gt;
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


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DadosDocumentoEstrangeiro {\n");
    
    sb.append("    numero: ").append(toIndentedString(numero)).append("\n");
    sb.append("    tipo: ").append(toIndentedString(tipo)).append("\n");
    sb.append("    validade: ").append(toIndentedString(validade)).append("\n");
    sb.append("    paisEmissor: ").append(toIndentedString(paisEmissor)).append("\n");
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

