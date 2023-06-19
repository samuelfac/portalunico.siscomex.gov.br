package br.gov.siscomex.portalunico.duimp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "DeclaracaoVinculada", propOrder =
    { "tipo", "numero", "numeroItem"
})

@XmlRootElement(name="DeclaracaoVinculada")
/**
  * Declaração aduaneira vinculada
 **/
@ApiModel(description="Declaração aduaneira vinculada")
public class DeclaracaoVinculada  {
  

@XmlType(name="TipoEnum")
@XmlEnum(String.class)
public enum TipoEnum {

	@XmlEnumValue("1")
	@JsonProperty("1")
	_1(String.valueOf("1")),
	
	@XmlEnumValue("2")
	@JsonProperty("2")
	_2(String.valueOf("2")),
	
	@XmlEnumValue("3")
	@JsonProperty("3")
	_3(String.valueOf("3")),
	
	@XmlEnumValue("4")
	@JsonProperty("4")
	_4(String.valueOf("4"));


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
  @ApiModelProperty(example = "1", value = "Tipo de declaração vinculada.<br>Dominio:<br>1 - Duimp, <br>2 - DU-E, <br>3 - DI, <br>4 - DE<br>Tamanho: 1")
 /**
   * Tipo de declaração vinculada.<br>Dominio:<br>1 - Duimp, <br>2 - DU-E, <br>3 - DI, <br>4 - DE<br>Tamanho: 1
  **/
  private TipoEnum tipo = null;

  @XmlElement(name="numero")
  @ApiModelProperty(example = "19BR00000004936", value = "Número da Declaração.<br>Tamanho mínimo: 1<br>Tamanho máximo: 16")
 /**
   * Número da Declaração.<br>Tamanho mínimo: 1<br>Tamanho máximo: 16
  **/
  private String numero = null;

  @XmlElement(name="numeroItem")
  @ApiModelProperty(example = "10001", value = "Número do item/adição da declaração.<br>Valor mínimo: 1<br>Valor máximo: 99999")
 /**
   * Número do item/adição da declaração.<br>Valor mínimo: 1<br>Valor máximo: 99999
  **/
  private String numeroItem = null;
 /**
   * Tipo de declaração vinculada.&lt;br&gt;Dominio:&lt;br&gt;1 - Duimp, &lt;br&gt;2 - DU-E, &lt;br&gt;3 - DI, &lt;br&gt;4 - DE&lt;br&gt;Tamanho: 1
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

  public DeclaracaoVinculada tipo(TipoEnum tipo) {
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

  public DeclaracaoVinculada numero(String numero) {
    this.numero = numero;
    return this;
  }

 /**
   * Número do item/adição da declaração.&lt;br&gt;Valor mínimo: 1&lt;br&gt;Valor máximo: 99999
   * @return numeroItem
  **/
  @JsonProperty("numeroItem")
  public String getNumeroItem() {
    return numeroItem;
  }

  public void setNumeroItem(String numeroItem) {
    this.numeroItem = numeroItem;
  }

  public DeclaracaoVinculada numeroItem(String numeroItem) {
    this.numeroItem = numeroItem;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeclaracaoVinculada {\n");
    
    sb.append("    tipo: ").append(toIndentedString(tipo)).append("\n");
    sb.append("    numero: ").append(toIndentedString(numero)).append("\n");
    sb.append("    numeroItem: ").append(toIndentedString(numeroItem)).append("\n");
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

