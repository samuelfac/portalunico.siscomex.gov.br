package br.gov.siscomex.portalunico.ttce.model;

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
 @XmlType(name = "FundamentoLegalTratamentoDTO", propOrder =
    { "codigo", "nome", "tipo", "obrigatoriedade"
})

@XmlRootElement(name="FundamentoLegalTratamentoDTO")
/**
  * Informações de um Fundamento Legal.
 **/
@ApiModel(description="Informações de um Fundamento Legal.")
public class FundamentoLegalTratamentoDTO  {
  
  @XmlElement(name="codigo", required = true)
  @ApiModelProperty(example = "3", required = true, value = "Código do Fundamento Legal.<br/><br>Tamanho mínimo: 1<br>Tamanho máximo: 4")
 /**
   * Código do Fundamento Legal.<br/><br>Tamanho mínimo: 1<br>Tamanho máximo: 4
  **/
  private String codigo = null;

  @XmlElement(name="nome", required = true)
  @ApiModelProperty(example = "ALÍQUOTA TEC", required = true, value = "Nome do Fundamento Legal.")
 /**
   * Nome do Fundamento Legal.
  **/
  private String nome = null;


@XmlType(name="TipoEnum")
@XmlEnum(String.class)
public enum TipoEnum {

	@XmlEnumValue("Normal")
	@JsonProperty("Normal")
	NORMAL(String.valueOf("Normal")),
	
	@XmlEnumValue("Opcional")
	@JsonProperty("Opcional")
	OPCIONAL(String.valueOf("Opcional"));


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

  @XmlElement(name="tipo", required = true)
  @ApiModelProperty(example = "Normal", required = true, value = "Tipo do Fundamento Legal.</br>")
 /**
   * Tipo do Fundamento Legal.</br>
  **/
  private TipoEnum tipo = null;

  @XmlElement(name="obrigatoriedade", required = true)
  @ApiModelProperty(example = "true", required = true, value = "Indicador de obrigatoriedade do Fundamento Legal.</br></br>Se tipo=Normal então obrigatoriedade=true</br>Se tipo=Opcional então obrigatoriedade=false</br><br>Dominio:<br>true - Sim, <br>false - Não")
 /**
   * Indicador de obrigatoriedade do Fundamento Legal.</br></br>Se tipo=Normal então obrigatoriedade=true</br>Se tipo=Opcional então obrigatoriedade=false</br><br>Dominio:<br>true - Sim, <br>false - Não
  **/
  private Boolean obrigatoriedade = null;
 /**
   * Código do Fundamento Legal.&lt;br/&gt;&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 4
   * @return codigo
  **/
  @JsonProperty("codigo")
  @NotNull
  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public FundamentoLegalTratamentoDTO codigo(String codigo) {
    this.codigo = codigo;
    return this;
  }

 /**
   * Nome do Fundamento Legal.
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

  public FundamentoLegalTratamentoDTO nome(String nome) {
    this.nome = nome;
    return this;
  }

 /**
   * Tipo do Fundamento Legal.&lt;/br&gt;
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

  public FundamentoLegalTratamentoDTO tipo(TipoEnum tipo) {
    this.tipo = tipo;
    return this;
  }

 /**
   * Indicador de obrigatoriedade do Fundamento Legal.&lt;/br&gt;&lt;/br&gt;Se tipo&#x3D;Normal então obrigatoriedade&#x3D;true&lt;/br&gt;Se tipo&#x3D;Opcional então obrigatoriedade&#x3D;false&lt;/br&gt;&lt;br&gt;Dominio:&lt;br&gt;true - Sim, &lt;br&gt;false - Não
   * @return obrigatoriedade
  **/
  @JsonProperty("obrigatoriedade")
  @NotNull
  public Boolean isObrigatoriedade() {
    return obrigatoriedade;
  }

  public void setObrigatoriedade(Boolean obrigatoriedade) {
    this.obrigatoriedade = obrigatoriedade;
  }

  public FundamentoLegalTratamentoDTO obrigatoriedade(Boolean obrigatoriedade) {
    this.obrigatoriedade = obrigatoriedade;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FundamentoLegalTratamentoDTO {\n");
    
    sb.append("    codigo: ").append(toIndentedString(codigo)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    tipo: ").append(toIndentedString(tipo)).append("\n");
    sb.append("    obrigatoriedade: ").append(toIndentedString(obrigatoriedade)).append("\n");
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

