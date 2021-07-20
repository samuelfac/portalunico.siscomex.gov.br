package br.gov.siscomex.portalunico.ccta.model;

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
 @XmlType(name = "Recebedor", propOrder =
    { "tipoDocumento", "numeroDocumento", "nome"
})

@XmlRootElement(name="Recebedor")
public class Recebedor  {
  

@XmlType(name="TipoDocumentoEnum")
@XmlEnum(String.class)
public enum TipoDocumentoEnum {

	@XmlEnumValue("PASSAPORTE")
	@JsonProperty("PASSAPORTE")
	PASSAPORTE(String.valueOf("PASSAPORTE")),
	
	@XmlEnumValue("CPF")
	@JsonProperty("CPF")
	CPF(String.valueOf("CPF"));


    private String value;

    TipoDocumentoEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TipoDocumentoEnum fromValue(String v) {
        for (TipoDocumentoEnum b : TipoDocumentoEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to TipoDocumentoEnum");
    }
}

  @XmlElement(name="tipoDocumento")
  @ApiModelProperty(example = "CPF", value = "Tipo de documento do recebedor da carga")
 /**
   * Tipo de documento do recebedor da carga
  **/
  private TipoDocumentoEnum tipoDocumento = null;

  @XmlElement(name="numeroDocumento")
  @ApiModelProperty(example = "12345678901", value = "Número do documento do recebedor conforme tipo de documento:<br><ul><li><em>CPF</em> Número do CPF - Tamanho: 11 sem formatação</li><li><em>PASSAPORTE</em> Número do passaporte - Tamanho máximo: 35 sem formatação</li></ul>")
 /**
   * Número do documento do recebedor conforme tipo de documento:<br><ul><li><em>CPF</em> Número do CPF - Tamanho: 11 sem formatação</li><li><em>PASSAPORTE</em> Número do passaporte - Tamanho máximo: 35 sem formatação</li></ul>
  **/
  private String numeroDocumento = null;

  @XmlElement(name="nome")
  @ApiModelProperty(example = "Fulano da Silva", value = "Nome do recebedor da carga")
 /**
   * Nome do recebedor da carga
  **/
  private String nome = null;
 /**
   * Tipo de documento do recebedor da carga
   * @return tipoDocumento
  **/
  @JsonProperty("tipoDocumento")
  public String getTipoDocumento() {
    if (tipoDocumento == null) {
      return null;
    }
    return tipoDocumento.value();
  }

  public void setTipoDocumento(TipoDocumentoEnum tipoDocumento) {
    this.tipoDocumento = tipoDocumento;
  }

  public Recebedor tipoDocumento(TipoDocumentoEnum tipoDocumento) {
    this.tipoDocumento = tipoDocumento;
    return this;
  }

 /**
   * Número do documento do recebedor conforme tipo de documento:&lt;br&gt;&lt;ul&gt;&lt;li&gt;&lt;em&gt;CPF&lt;/em&gt; Número do CPF - Tamanho: 11 sem formatação&lt;/li&gt;&lt;li&gt;&lt;em&gt;PASSAPORTE&lt;/em&gt; Número do passaporte - Tamanho máximo: 35 sem formatação&lt;/li&gt;&lt;/ul&gt;
   * @return numeroDocumento
  **/
  @JsonProperty("numeroDocumento")
  public String getNumeroDocumento() {
    return numeroDocumento;
  }

  public void setNumeroDocumento(String numeroDocumento) {
    this.numeroDocumento = numeroDocumento;
  }

  public Recebedor numeroDocumento(String numeroDocumento) {
    this.numeroDocumento = numeroDocumento;
    return this;
  }

 /**
   * Nome do recebedor da carga
   * @return nome
  **/
  @JsonProperty("nome")
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Recebedor nome(String nome) {
    this.nome = nome;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Recebedor {\n");
    
    sb.append("    tipoDocumento: ").append(toIndentedString(tipoDocumento)).append("\n");
    sb.append("    numeroDocumento: ").append(toIndentedString(numeroDocumento)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
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

