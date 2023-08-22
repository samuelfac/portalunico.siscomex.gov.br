package br.gov.siscomex.portalunico.duimp_api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.time.OffsetDateTime;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "DeclaracaoVinculadaCoverConsulta", propOrder =
    { "tipo", "numero", "versao", "dataRegistro", "item"
})

@XmlRootElement(name="DeclaracaoVinculadaCoverConsulta")
/**
  * Lista de declarações aduaneiras vinculadas.
 **/
@ApiModel(description="Lista de declarações aduaneiras vinculadas.")
public class DeclaracaoVinculadaCoverConsulta  {
  

@XmlType(name="TipoEnum")
@XmlEnum(String.class)
public enum TipoEnum {

	@XmlEnumValue("DUIMP")
	@JsonProperty("DUIMP")
	DUIMP(String.valueOf("DUIMP")),
	
	@XmlEnumValue("DUE")
	@JsonProperty("DUE")
	DUE(String.valueOf("DUE")),
	
	@XmlEnumValue("DI")
	@JsonProperty("DI")
	DI(String.valueOf("DI")),
	
	@XmlEnumValue("DE")
	@JsonProperty("DE")
	DE(String.valueOf("DE"));


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
  @ApiModelProperty(example = "DUIMP", value = "Tipo de declaração vinculada.<br>Domínio:")
 /**
   * Tipo de declaração vinculada.<br>Domínio:
  **/
  private TipoEnum tipo = null;

  @XmlElement(name="numero")
  @ApiModelProperty(example = "23BR00001010550", value = "Número da Declaração.<br>Tamanho mínimo: 1<br>Tamanho máximo: 16")
 /**
   * Número da Declaração.<br>Tamanho mínimo: 1<br>Tamanho máximo: 16
  **/
  private String numero = null;

  @XmlElement(name="versao")
  @ApiModelProperty(example = "1", value = "Versão da declaração vinculada, quando o tipo for 'Duimp'. Para os demais tipos, esse atributo será fornecido com o valor nulo")
 /**
   * Versão da declaração vinculada, quando o tipo for 'Duimp'. Para os demais tipos, esse atributo será fornecido com o valor nulo
  **/
  private String versao = null;

  @XmlElement(name="dataRegistro")
  @ApiModelProperty(value = "Data de registro da declaração vinculada, quando o tipo for 'Duimp'. Para os demais tipos, esse atributo será fornecido com o valor nulo.")
 /**
   * Data de registro da declaração vinculada, quando o tipo for 'Duimp'. Para os demais tipos, esse atributo será fornecido com o valor nulo.
  **/
  private OffsetDateTime dataRegistro = null;

  @XmlElement(name="item")
  @ApiModelProperty(value = "")
  @Valid
  private ItemDeclaracaoVinculadaCover item = null;
 /**
   * Tipo de declaração vinculada.&lt;br&gt;Domínio:
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

  public DeclaracaoVinculadaCoverConsulta tipo(TipoEnum tipo) {
    this.tipo = tipo;
    return this;
  }

 /**
   * Número da Declaração.&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 16
   * @return numero
  **/
  @JsonProperty("numero")
  public String getNumero() {
    return numero;
  }

  public void setNumero(String numero) {
    this.numero = numero;
  }

  public DeclaracaoVinculadaCoverConsulta numero(String numero) {
    this.numero = numero;
    return this;
  }

 /**
   * Versão da declaração vinculada, quando o tipo for &#39;Duimp&#39;. Para os demais tipos, esse atributo será fornecido com o valor nulo
   * @return versao
  **/
  @JsonProperty("versao")
  public String getVersao() {
    return versao;
  }

  public void setVersao(String versao) {
    this.versao = versao;
  }

  public DeclaracaoVinculadaCoverConsulta versao(String versao) {
    this.versao = versao;
    return this;
  }

 /**
   * Data de registro da declaração vinculada, quando o tipo for &#39;Duimp&#39;. Para os demais tipos, esse atributo será fornecido com o valor nulo.
   * @return dataRegistro
  **/
  @JsonProperty("dataRegistro")
  public OffsetDateTime getDataRegistro() {
    return dataRegistro;
  }

  public void setDataRegistro(OffsetDateTime dataRegistro) {
    this.dataRegistro = dataRegistro;
  }

  public DeclaracaoVinculadaCoverConsulta dataRegistro(OffsetDateTime dataRegistro) {
    this.dataRegistro = dataRegistro;
    return this;
  }

 /**
   * Get item
   * @return item
  **/
  @JsonProperty("item")
  public ItemDeclaracaoVinculadaCover getItem() {
    return item;
  }

  public void setItem(ItemDeclaracaoVinculadaCover item) {
    this.item = item;
  }

  public DeclaracaoVinculadaCoverConsulta item(ItemDeclaracaoVinculadaCover item) {
    this.item = item;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeclaracaoVinculadaCoverConsulta {\n");
    
    sb.append("    tipo: ").append(toIndentedString(tipo)).append("\n");
    sb.append("    numero: ").append(toIndentedString(numero)).append("\n");
    sb.append("    versao: ").append(toIndentedString(versao)).append("\n");
    sb.append("    dataRegistro: ").append(toIndentedString(dataRegistro)).append("\n");
    sb.append("    item: ").append(toIndentedString(item)).append("\n");
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

