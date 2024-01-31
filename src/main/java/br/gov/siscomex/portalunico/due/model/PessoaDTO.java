package br.gov.siscomex.portalunico.due.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "PessoaDTO", propOrder =
    { "estrangeiro", "nacionalidade", "nome", "numeroDoDocumento", "tipoDoDocumento"
})

@XmlRootElement(name="PessoaDTO")
public class PessoaDTO  {
  
  @XmlElement(name="estrangeiro")
  @ApiModelProperty(value = "")
  private Boolean estrangeiro = null;

  @XmlElement(name="nacionalidade")
  @ApiModelProperty(value = "")
  @Valid
  private PaisDTO nacionalidade = null;

  @XmlElement(name="nome")
  @ApiModelProperty(value = "Nome<br />Tamanho mínimo: 1<br />Tamanho máximo: 150")
 /**
   * Nome<br />Tamanho mínimo: 1<br />Tamanho máximo: 150
  **/
  private String nome = null;

  @XmlElement(name="numeroDoDocumento")
  @ApiModelProperty(value = "Número do documento<br />Tamanho mínimo: 1<br />Tamanho máximo: 20")
 /**
   * Número do documento<br />Tamanho mínimo: 1<br />Tamanho máximo: 20
  **/
  private String numeroDoDocumento = null;


@XmlType(name="TipoDoDocumentoEnum")
@XmlEnum(String.class)
public enum TipoDoDocumentoEnum {

	@XmlEnumValue("CPF")
	@JsonProperty("CPF")
	CPF(String.valueOf("CPF")),
	
	@XmlEnumValue("CNPJ")
	@JsonProperty("CNPJ")
	CNPJ(String.valueOf("CNPJ")),
	
	@XmlEnumValue("PASSAPORTE")
	@JsonProperty("PASSAPORTE")
	PASSAPORTE(String.valueOf("PASSAPORTE")),
	
	@XmlEnumValue("ID")
	@JsonProperty("ID")
	ID(String.valueOf("ID"));


    private String value;

    TipoDoDocumentoEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TipoDoDocumentoEnum fromValue(String v) {
        for (TipoDoDocumentoEnum b : TipoDoDocumentoEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to TipoDoDocumentoEnum");
    }
}

  @XmlElement(name="tipoDoDocumento")
  @ApiModelProperty(value = "")
  private TipoDoDocumentoEnum tipoDoDocumento = null;
 /**
   * Get estrangeiro
   * @return estrangeiro
  **/
  @JsonProperty("estrangeiro")
  public Boolean isEstrangeiro() {
    return estrangeiro;
  }

  public void setEstrangeiro(Boolean estrangeiro) {
    this.estrangeiro = estrangeiro;
  }

  public PessoaDTO estrangeiro(Boolean estrangeiro) {
    this.estrangeiro = estrangeiro;
    return this;
  }

 /**
   * Get nacionalidade
   * @return nacionalidade
  **/
  @JsonProperty("nacionalidade")
  public PaisDTO getNacionalidade() {
    return nacionalidade;
  }

  public void setNacionalidade(PaisDTO nacionalidade) {
    this.nacionalidade = nacionalidade;
  }

  public PessoaDTO nacionalidade(PaisDTO nacionalidade) {
    this.nacionalidade = nacionalidade;
    return this;
  }

 /**
   * Nome&lt;br /&gt;Tamanho mínimo: 1&lt;br /&gt;Tamanho máximo: 150
   * @return nome
  **/
  @JsonProperty("nome")
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public PessoaDTO nome(String nome) {
    this.nome = nome;
    return this;
  }

 /**
   * Número do documento&lt;br /&gt;Tamanho mínimo: 1&lt;br /&gt;Tamanho máximo: 20
   * @return numeroDoDocumento
  **/
  @JsonProperty("numeroDoDocumento")
  public String getNumeroDoDocumento() {
    return numeroDoDocumento;
  }

  public void setNumeroDoDocumento(String numeroDoDocumento) {
    this.numeroDoDocumento = numeroDoDocumento;
  }

  public PessoaDTO numeroDoDocumento(String numeroDoDocumento) {
    this.numeroDoDocumento = numeroDoDocumento;
    return this;
  }

 /**
   * Get tipoDoDocumento
   * @return tipoDoDocumento
  **/
  @JsonProperty("tipoDoDocumento")
  public String getTipoDoDocumento() {
    if (tipoDoDocumento == null) {
      return null;
    }
    return tipoDoDocumento.value();
  }

  public void setTipoDoDocumento(TipoDoDocumentoEnum tipoDoDocumento) {
    this.tipoDoDocumento = tipoDoDocumento;
  }

  public PessoaDTO tipoDoDocumento(TipoDoDocumentoEnum tipoDoDocumento) {
    this.tipoDoDocumento = tipoDoDocumento;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PessoaDTO {\n");
    
    sb.append("    estrangeiro: ").append(toIndentedString(estrangeiro)).append("\n");
    sb.append("    nacionalidade: ").append(toIndentedString(nacionalidade)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    numeroDoDocumento: ").append(toIndentedString(numeroDoDocumento)).append("\n");
    sb.append("    tipoDoDocumento: ").append(toIndentedString(tipoDoDocumento)).append("\n");
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

