package br.gov.siscomex.portalunico.due.model;

import java.math.BigDecimal;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
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
 @XmlType(name = "DocumentoDeTransformacao", propOrder =
    { "numero", "numeroDoItem", "numeroDoProcesso", "quantidadeUtilizada", "tipo"
})

@XmlRootElement(name="DocumentoDeTransformacao")
public class DocumentoDeTransformacao  {
  
  @XmlElement(name="numero", required = true)
  @ApiModelProperty(required = true, value = "Número<br />Tamanho mínimo: 1<br />Tamanho máximo: 30")
 /**
   * Número<br />Tamanho mínimo: 1<br />Tamanho máximo: 30
  **/
  private String numero = null;

  @XmlElement(name="numeroDoItem")
  @ApiModelProperty(value = "Número<br />Tamanho mínimo: 0<br />Tamanho máximo: 20")
 /**
   * Número<br />Tamanho mínimo: 0<br />Tamanho máximo: 20
  **/
  private String numeroDoItem = null;

  @XmlElement(name="numeroDoProcesso")
  @ApiModelProperty(value = "Número do processo<br />Formato: Inteiro, com até 17 digitos")
 /**
   * Número do processo<br />Formato: Inteiro, com até 17 digitos
  **/
  private Long numeroDoProcesso = null;

  @XmlElement(name="quantidadeUtilizada")
  @ApiModelProperty(value = "Quantidade utilizada<br />Tamanho: 19,5<br />Formato: Decimal, com até 5 casas decimais separadas por ponto.")
  @Valid
 /**
   * Quantidade utilizada<br />Tamanho: 19,5<br />Formato: Decimal, com até 5 casas decimais separadas por ponto.
  **/
  private BigDecimal quantidadeUtilizada = null;


@XmlType(name="TipoEnum")
@XmlEnum(String.class)
public enum TipoEnum {

	@XmlEnumValue("DI")
	@JsonProperty("DI")
	DI(String.valueOf("DI")),
	
	@XmlEnumValue("DSI_ELETRONICA")
	@JsonProperty("DSI_ELETRONICA")
	DSI_ELETRONICA(String.valueOf("DSI_ELETRONICA")),
	
	@XmlEnumValue("DSI_FORMULARIO")
	@JsonProperty("DSI_FORMULARIO")
	DSI_FORMULARIO(String.valueOf("DSI_FORMULARIO")),
	
	@XmlEnumValue("E_DBV")
	@JsonProperty("E_DBV")
	E_DBV(String.valueOf("E_DBV")),
	
	@XmlEnumValue("DUE_ITEM")
	@JsonProperty("DUE_ITEM")
	DUE_ITEM(String.valueOf("DUE_ITEM")),
	
	@XmlEnumValue("DSE")
	@JsonProperty("DSE")
	DSE(String.valueOf("DSE")),
	
	@XmlEnumValue("RE")
	@JsonProperty("RE")
	RE(String.valueOf("RE")),
	
	@XmlEnumValue("DUIMP")
	@JsonProperty("DUIMP")
	DUIMP(String.valueOf("DUIMP")),
	
	@XmlEnumValue("DSE_FORMULARIO")
	@JsonProperty("DSE_FORMULARIO")
	DSE_FORMULARIO(String.valueOf("DSE_FORMULARIO"));


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
  @ApiModelProperty(value = "")
  private TipoEnum tipo = null;
 /**
   * Número&lt;br /&gt;Tamanho mínimo: 1&lt;br /&gt;Tamanho máximo: 30
   * @return numero
  **/
  @JsonProperty("numero")
  @NotNull
  public String getNumero() {
    return numero;
  }

  public void setNumero(String numero) {
    this.numero = numero;
  }

  public DocumentoDeTransformacao numero(String numero) {
    this.numero = numero;
    return this;
  }

 /**
   * Número&lt;br /&gt;Tamanho mínimo: 0&lt;br /&gt;Tamanho máximo: 20
   * @return numeroDoItem
  **/
  @JsonProperty("numeroDoItem")
  public String getNumeroDoItem() {
    return numeroDoItem;
  }

  public void setNumeroDoItem(String numeroDoItem) {
    this.numeroDoItem = numeroDoItem;
  }

  public DocumentoDeTransformacao numeroDoItem(String numeroDoItem) {
    this.numeroDoItem = numeroDoItem;
    return this;
  }

 /**
   * Número do processo&lt;br /&gt;Formato: Inteiro, com até 17 digitos
   * @return numeroDoProcesso
  **/
  @JsonProperty("numeroDoProcesso")
  public Long getNumeroDoProcesso() {
    return numeroDoProcesso;
  }

  public void setNumeroDoProcesso(Long numeroDoProcesso) {
    this.numeroDoProcesso = numeroDoProcesso;
  }

  public DocumentoDeTransformacao numeroDoProcesso(Long numeroDoProcesso) {
    this.numeroDoProcesso = numeroDoProcesso;
    return this;
  }

 /**
   * Quantidade utilizada&lt;br /&gt;Tamanho: 19,5&lt;br /&gt;Formato: Decimal, com até 5 casas decimais separadas por ponto.
   * @return quantidadeUtilizada
  **/
  @JsonProperty("quantidadeUtilizada")
  public BigDecimal getQuantidadeUtilizada() {
    return quantidadeUtilizada;
  }

  public void setQuantidadeUtilizada(BigDecimal quantidadeUtilizada) {
    this.quantidadeUtilizada = quantidadeUtilizada;
  }

  public DocumentoDeTransformacao quantidadeUtilizada(BigDecimal quantidadeUtilizada) {
    this.quantidadeUtilizada = quantidadeUtilizada;
    return this;
  }

 /**
   * Get tipo
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

  public DocumentoDeTransformacao tipo(TipoEnum tipo) {
    this.tipo = tipo;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentoDeTransformacao {\n");
    
    sb.append("    numero: ").append(toIndentedString(numero)).append("\n");
    sb.append("    numeroDoItem: ").append(toIndentedString(numeroDoItem)).append("\n");
    sb.append("    numeroDoProcesso: ").append(toIndentedString(numeroDoProcesso)).append("\n");
    sb.append("    quantidadeUtilizada: ").append(toIndentedString(quantidadeUtilizada)).append("\n");
    sb.append("    tipo: ").append(toIndentedString(tipo)).append("\n");
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

