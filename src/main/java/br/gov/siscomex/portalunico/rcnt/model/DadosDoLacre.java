package br.gov.siscomex.portalunico.rcnt.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "DadosDoLacre", propOrder =
    { "idElemento", "localSif", "numero", "tipo"
})

@XmlRootElement(name="DadosDoLacre")
public class DadosDoLacre  {
  
  @XmlElement(name="idElemento", required = true)
  @ApiModelProperty(required = true, value = "Identificação de cada elemento da lista. Este atributo é obrigatório e deve ser único dentro da lista correspondente.<br/>Tamanho: 40")
 /**
   * Identificação de cada elemento da lista. Este atributo é obrigatório e deve ser único dentro da lista correspondente.<br/>Tamanho: 40
  **/
  private String idElemento = null;

  @XmlElement(name="localSif")
  @ApiModelProperty(value = "Código da unidade de inspeção federal.<br/>Tamanho: 100")
 /**
   * Código da unidade de inspeção federal.<br/>Tamanho: 100
  **/
  private String localSif = null;

  @XmlElement(name="numero")
  @ApiModelProperty(example = "99", value = "Número do Lacre")
 /**
   * Número do Lacre
  **/
  private String numero = null;


@XmlType(name="TipoEnum")
@XmlEnum(String.class)
public enum TipoEnum {

	@XmlEnumValue("'RFB'")
	@JsonProperty("'RFB'")
	RFB_(String.valueOf("'RFB'")),
	
	@XmlEnumValue("'SIF'")
	@JsonProperty("'SIF'")
	SIF_(String.valueOf("'SIF'")),
	
	@XmlEnumValue("'ARM'")
	@JsonProperty("'ARM'")
	ARM_(String.valueOf("'ARM'")),
	
	@XmlEnumValue("'REC'")
	@JsonProperty("'REC'")
	REC_(String.valueOf("'REC'")),
	
	@XmlEnumValue("'TRP'")
	@JsonProperty("'TRP'")
	TRP_(String.valueOf("'TRP'")),
	
	@XmlEnumValue("'EST'")
	@JsonProperty("'EST'")
	EST_(String.valueOf("'EST'")),
	
	@XmlEnumValue("'OUT'")
	@JsonProperty("'OUT'")
	OUT_(String.valueOf("'OUT'"));


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
  @ApiModelProperty(example = "REC", value = "Tipo de lacre conforme tabela de domínio.<br/>Domínio:<br/>RFB - RFB<br/>SIF - SIF<br/>ARM - Armador<br/>REC - Recinto<br/>TRP - Transportador<br/>EST - Estrangeiro<br/>OUT - Outro")
 /**
   * Tipo de lacre conforme tabela de domínio.<br/>Domínio:<br/>RFB - RFB<br/>SIF - SIF<br/>ARM - Armador<br/>REC - Recinto<br/>TRP - Transportador<br/>EST - Estrangeiro<br/>OUT - Outro
  **/
  private TipoEnum tipo = null;
 /**
   * Identificação de cada elemento da lista. Este atributo é obrigatório e deve ser único dentro da lista correspondente.&lt;br/&gt;Tamanho: 40
   * @return idElemento
  **/
  @JsonProperty("idElemento")
  @NotNull
  public String getIdElemento() {
    return idElemento;
  }

  public void setIdElemento(String idElemento) {
    this.idElemento = idElemento;
  }

  public DadosDoLacre idElemento(String idElemento) {
    this.idElemento = idElemento;
    return this;
  }

 /**
   * Código da unidade de inspeção federal.&lt;br/&gt;Tamanho: 100
   * @return localSif
  **/
  @JsonProperty("localSif")
  public String getLocalSif() {
    return localSif;
  }

  public void setLocalSif(String localSif) {
    this.localSif = localSif;
  }

  public DadosDoLacre localSif(String localSif) {
    this.localSif = localSif;
    return this;
  }

 /**
   * Número do Lacre
   * @return numero
  **/
  @JsonProperty("numero")
  public String getNumero() {
    return numero;
  }

  public void setNumero(String numero) {
    this.numero = numero;
  }

  public DadosDoLacre numero(String numero) {
    this.numero = numero;
    return this;
  }

 /**
   * Tipo de lacre conforme tabela de domínio.&lt;br/&gt;Domínio:&lt;br/&gt;RFB - RFB&lt;br/&gt;SIF - SIF&lt;br/&gt;ARM - Armador&lt;br/&gt;REC - Recinto&lt;br/&gt;TRP - Transportador&lt;br/&gt;EST - Estrangeiro&lt;br/&gt;OUT - Outro
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

  public DadosDoLacre tipo(TipoEnum tipo) {
    this.tipo = tipo;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DadosDoLacre {\n");
    
    sb.append("    idElemento: ").append(toIndentedString(idElemento)).append("\n");
    sb.append("    localSif: ").append(toIndentedString(localSif)).append("\n");
    sb.append("    numero: ").append(toIndentedString(numero)).append("\n");
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

