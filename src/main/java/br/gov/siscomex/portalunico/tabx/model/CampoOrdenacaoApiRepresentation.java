package br.gov.siscomex.portalunico.tabx.model;

import com.fasterxml.jackson.annotation.JsonProperty;
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
 @XmlType(name = "CampoOrdenacaoApiRepresentation", propOrder =
    { "nomeTabela", "nome", "tipoOrdenacao"
})

@XmlRootElement(name="CampoOrdenacaoApiRepresentation")
public class CampoOrdenacaoApiRepresentation  {
  
  @XmlElement(name="nomeTabela", required = true)
  @ApiModelProperty(example = "GRUPO_EXIGENCIA", required = true, value = "Nome da tabela.")
 /**
   * Nome da tabela.
  **/
  private String nomeTabela = null;

  @XmlElement(name="nome", required = true)
  @ApiModelProperty(example = "CODIGO", required = true, value = "Nome do campo.")
 /**
   * Nome do campo.
  **/
  private String nome = null;


@XmlType(name="TipoOrdenacaoEnum")
@XmlEnum(String.class)
public enum TipoOrdenacaoEnum {

	@XmlEnumValue("ASC")
	@JsonProperty("ASC")
	ASC(String.valueOf("ASC")),
	
	@XmlEnumValue("DESC")
	@JsonProperty("DESC")
	DESC(String.valueOf("DESC"));


    private String value;

    TipoOrdenacaoEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TipoOrdenacaoEnum fromValue(String v) {
        for (TipoOrdenacaoEnum b : TipoOrdenacaoEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to TipoOrdenacaoEnum");
    }
}

  @XmlElement(name="tipoOrdenacao")
  @ApiModelProperty(example = "DESC", value = "Tipo de ordenação.<br>Domínio:")
 /**
   * Tipo de ordenação.<br>Domínio:
  **/
  private TipoOrdenacaoEnum tipoOrdenacao = null;
 /**
   * Nome da tabela.
   * @return nomeTabela
  **/
  @JsonProperty("nomeTabela")
  @NotNull
  public String getNomeTabela() {
    return nomeTabela;
  }

  public void setNomeTabela(String nomeTabela) {
    this.nomeTabela = nomeTabela;
  }

  public CampoOrdenacaoApiRepresentation nomeTabela(String nomeTabela) {
    this.nomeTabela = nomeTabela;
    return this;
  }

 /**
   * Nome do campo.
   * @return nome
  **/
  @JsonProperty("nome")
  @NotNull
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public CampoOrdenacaoApiRepresentation nome(String nome) {
    this.nome = nome;
    return this;
  }

 /**
   * Tipo de ordenação.&lt;br&gt;Domínio:
   * @return tipoOrdenacao
  **/
  @JsonProperty("tipoOrdenacao")
  public String getTipoOrdenacao() {
    if (tipoOrdenacao == null) {
      return null;
    }
    return tipoOrdenacao.value();
  }

  public void setTipoOrdenacao(TipoOrdenacaoEnum tipoOrdenacao) {
    this.tipoOrdenacao = tipoOrdenacao;
  }

  public CampoOrdenacaoApiRepresentation tipoOrdenacao(TipoOrdenacaoEnum tipoOrdenacao) {
    this.tipoOrdenacao = tipoOrdenacao;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampoOrdenacaoApiRepresentation {\n");
    
    sb.append("    nomeTabela: ").append(toIndentedString(nomeTabela)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    tipoOrdenacao: ").append(toIndentedString(tipoOrdenacao)).append("\n");
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

