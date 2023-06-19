package br.gov.siscomex.portalunico.duimp_api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "DocumentoVinculadoCover", propOrder =
    { "tipo", "numero", "numeroItem"
})

@XmlRootElement(name="DocumentoVinculadoCover")
/**
  * Lista de declarações aduaneiras vinculadas.
 **/
@ApiModel(description="Lista de declarações aduaneiras vinculadas.")
public class DocumentoVinculadoCover  {
  

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
  @ApiModelProperty(example = "DUE", value = "Tipo de declaração vinculada.<br>Domínio:")
 /**
   * Tipo de declaração vinculada.<br>Domínio:
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
  private Integer numeroItem = null;
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

  public DocumentoVinculadoCover tipo(TipoEnum tipo) {
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

  public DocumentoVinculadoCover numero(String numero) {
    this.numero = numero;
    return this;
  }

 /**
   * Número do item/adição da declaração.&lt;br&gt;Valor mínimo: 1&lt;br&gt;Valor máximo: 99999
   * @return numeroItem
  **/
  @JsonProperty("numeroItem")
  public Integer getNumeroItem() {
    return numeroItem;
  }

  public void setNumeroItem(Integer numeroItem) {
    this.numeroItem = numeroItem;
  }

  public DocumentoVinculadoCover numeroItem(Integer numeroItem) {
    this.numeroItem = numeroItem;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentoVinculadoCover {\n");
    
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

