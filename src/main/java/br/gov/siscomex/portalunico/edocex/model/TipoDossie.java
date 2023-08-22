package br.gov.siscomex.portalunico.edocex.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "TipoDossie", propOrder =
    { "idTipoDossie", "nomeTipoDossie", "tipoRepresentacao", "tiposDocumento"
})

@XmlRootElement(name="TipoDossie")
/**
  * Tipo de dossiê.
 **/
@ApiModel(description="Tipo de dossiê.")
public class TipoDossie  {
  
  @XmlElement(name="idTipoDossie", required = true)
  @ApiModelProperty(example = "538797", required = true, value = "Id do tipo de dossiê.<br/>Valor mínimo: 1<br/>Valor máximo: 2147483647")
 /**
   * Id do tipo de dossiê.<br/>Valor mínimo: 1<br/>Valor máximo: 2147483647
  **/
  private Integer idTipoDossie = null;

  @XmlElement(name="nomeTipoDossie")
  @ApiModelProperty(example = "Dossiê de Importação", value = "Nome do tipo de dossiê.<br/>Tamanho máximo: 255")
 /**
   * Nome do tipo de dossiê.<br/>Tamanho máximo: 255
  **/
  private String nomeTipoDossie = null;


@XmlType(name="TipoRepresentacaoEnum")
@XmlEnum(String.class)
public enum TipoRepresentacaoEnum {

	@XmlEnumValue("IMPORTACAO")
	@JsonProperty("IMPORTACAO")
	IMPORTACAO(String.valueOf("IMPORTACAO")),
	
	@XmlEnumValue("EXPORTACAO")
	@JsonProperty("EXPORTACAO")
	EXPORTACAO(String.valueOf("EXPORTACAO")),
	
	@XmlEnumValue("AMBOS")
	@JsonProperty("AMBOS")
	AMBOS(String.valueOf("AMBOS"));


    private String value;

    TipoRepresentacaoEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TipoRepresentacaoEnum fromValue(String v) {
        for (TipoRepresentacaoEnum b : TipoRepresentacaoEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to TipoRepresentacaoEnum");
    }
}

  @XmlElement(name="tipoRepresentacao", required = true)
  @ApiModelProperty(example = "IMPORTACAO", required = true, value = "IMPORTACAO, EXPORTACAO, AMBOS")
 /**
   * IMPORTACAO, EXPORTACAO, AMBOS
  **/
  private TipoRepresentacaoEnum tipoRepresentacao = null;

  @XmlElement(name="tiposDocumento")
  @ApiModelProperty(value = "")
  @Valid
  private List<TipoDocumento> tiposDocumento = null;
 /**
   * Id do tipo de dossiê.&lt;br/&gt;Valor mínimo: 1&lt;br/&gt;Valor máximo: 2147483647
   * @return idTipoDossie
  **/
  @JsonProperty("idTipoDossie")
  @NotNull
  public Integer getIdTipoDossie() {
    return idTipoDossie;
  }

  public void setIdTipoDossie(Integer idTipoDossie) {
    this.idTipoDossie = idTipoDossie;
  }

  public TipoDossie idTipoDossie(Integer idTipoDossie) {
    this.idTipoDossie = idTipoDossie;
    return this;
  }

 /**
   * Nome do tipo de dossiê.&lt;br/&gt;Tamanho máximo: 255
   * @return nomeTipoDossie
  **/
  @JsonProperty("nomeTipoDossie")
  public String getNomeTipoDossie() {
    return nomeTipoDossie;
  }

  public void setNomeTipoDossie(String nomeTipoDossie) {
    this.nomeTipoDossie = nomeTipoDossie;
  }

  public TipoDossie nomeTipoDossie(String nomeTipoDossie) {
    this.nomeTipoDossie = nomeTipoDossie;
    return this;
  }

 /**
   * IMPORTACAO, EXPORTACAO, AMBOS
   * @return tipoRepresentacao
  **/
  @JsonProperty("tipoRepresentacao")
  @NotNull
  public String getTipoRepresentacao() {
    if (tipoRepresentacao == null) {
      return null;
    }
    return tipoRepresentacao.value();
  }

  public void setTipoRepresentacao(TipoRepresentacaoEnum tipoRepresentacao) {
    this.tipoRepresentacao = tipoRepresentacao;
  }

  public TipoDossie tipoRepresentacao(TipoRepresentacaoEnum tipoRepresentacao) {
    this.tipoRepresentacao = tipoRepresentacao;
    return this;
  }

 /**
   * Get tiposDocumento
   * @return tiposDocumento
  **/
  @JsonProperty("tiposDocumento")
  public List<TipoDocumento> getTiposDocumento() {
    return tiposDocumento;
  }

  public void setTiposDocumento(List<TipoDocumento> tiposDocumento) {
    this.tiposDocumento = tiposDocumento;
  }

  public TipoDossie tiposDocumento(List<TipoDocumento> tiposDocumento) {
    this.tiposDocumento = tiposDocumento;
    return this;
  }

  public TipoDossie addTiposDocumentoItem(TipoDocumento tiposDocumentoItem) {
    this.tiposDocumento.add(tiposDocumentoItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TipoDossie {\n");
    
    sb.append("    idTipoDossie: ").append(toIndentedString(idTipoDossie)).append("\n");
    sb.append("    nomeTipoDossie: ").append(toIndentedString(nomeTipoDossie)).append("\n");
    sb.append("    tipoRepresentacao: ").append(toIndentedString(tipoRepresentacao)).append("\n");
    sb.append("    tiposDocumento: ").append(toIndentedString(tiposDocumento)).append("\n");
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

