package br.gov.siscomex.portalunico.rcnt.model;

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
 @XmlType(name = "DadosDoConhecimentoDaCargaSimplificado", propOrder =
    { "idElemento", "numero", "tipo"
})

@XmlRootElement(name="DadosDoConhecimentoDaCargaSimplificado")
public class DadosDoConhecimentoDaCargaSimplificado  {
  
  @XmlElement(name="idElemento")
  @ApiModelProperty(value = "Identificação de cada elemento da lista.<br/>Tamanho: 40")
 /**
   * Identificação de cada elemento da lista.<br/>Tamanho: 40
  **/
  private String idElemento = null;

  @XmlElement(name="numero")
  @ApiModelProperty(example = "131805000071025", value = "Número do conhecimento. <br/>No aquaviário deve ser preenchido com CE Mercante na importação e na exportação com o conhecimento internacional ou, quando ainda não emitido, com o CT-e que amparou a chegada da carga.<br/>Tamanho: 100")
 /**
   * Número do conhecimento. <br/>No aquaviário deve ser preenchido com CE Mercante na importação e na exportação com o conhecimento internacional ou, quando ainda não emitido, com o CT-e que amparou a chegada da carga.<br/>Tamanho: 100
  **/
  private String numero = null;


@XmlType(name="TipoEnum")
@XmlEnum(String.class)
public enum TipoEnum {

	@XmlEnumValue("'CRT'")
	@JsonProperty("'CRT'")
	CRT_(String.valueOf("'CRT'")),
	
	@XmlEnumValue("'TIF'")
	@JsonProperty("'TIF'")
	TIF_(String.valueOf("'TIF'")),
	
	@XmlEnumValue("'BL'")
	@JsonProperty("'BL'")
	BL_(String.valueOf("'BL'")),
	
	@XmlEnumValue("'AWB'")
	@JsonProperty("'AWB'")
	AWB_(String.valueOf("'AWB'")),
	
	@XmlEnumValue("'DSIC'")
	@JsonProperty("'DSIC'")
	DSIC_(String.valueOf("'DSIC'")),
	
	@XmlEnumValue("'COURIER'")
	@JsonProperty("'COURIER'")
	COURIER_(String.valueOf("'COURIER'")),
	
	@XmlEnumValue("'POSTAL'")
	@JsonProperty("'POSTAL'")
	POSTAL_(String.valueOf("'POSTAL'")),
	
	@XmlEnumValue("'CTE'")
	@JsonProperty("'CTE'")
	CTE_(String.valueOf("'CTE'")),
	
	@XmlEnumValue("'CELET'")
	@JsonProperty("'CELET'")
	CELET_(String.valueOf("'CELET'")),
	
	@XmlEnumValue("'CE_MERCANTE'")
	@JsonProperty("'CE_MERCANTE'")
	CE_MERCANTE_(String.valueOf("'CE_MERCANTE'"));


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
  @ApiModelProperty(example = "AWB", value = "Tipo de conhecimento conforme tabela de domínio.<br/>Domínio:<br/>CRT - CRT<br/>TIF - TIF<br/>BL - BL<br/>AWB - AWB<br/>DSIC - DSIC<br/>COURIER - Courier<br/>POSTAL - Postal<br/>CTE - CT-e<br/>CELET - Conhecimento Eletrônico<br>CE_MERCANTE - CE Mercante")
 /**
   * Tipo de conhecimento conforme tabela de domínio.<br/>Domínio:<br/>CRT - CRT<br/>TIF - TIF<br/>BL - BL<br/>AWB - AWB<br/>DSIC - DSIC<br/>COURIER - Courier<br/>POSTAL - Postal<br/>CTE - CT-e<br/>CELET - Conhecimento Eletrônico<br>CE_MERCANTE - CE Mercante
  **/
  private TipoEnum tipo = null;
 /**
   * Identificação de cada elemento da lista.&lt;br/&gt;Tamanho: 40
   * @return idElemento
  **/
  @JsonProperty("idElemento")
  public String getIdElemento() {
    return idElemento;
  }

  public void setIdElemento(String idElemento) {
    this.idElemento = idElemento;
  }

  public DadosDoConhecimentoDaCargaSimplificado idElemento(String idElemento) {
    this.idElemento = idElemento;
    return this;
  }

 /**
   * Número do conhecimento. &lt;br/&gt;No aquaviário deve ser preenchido com CE Mercante na importação e na exportação com o conhecimento internacional ou, quando ainda não emitido, com o CT-e que amparou a chegada da carga.&lt;br/&gt;Tamanho: 100
   * @return numero
  **/
  @JsonProperty("numero")
  public String getNumero() {
    return numero;
  }

  public void setNumero(String numero) {
    this.numero = numero;
  }

  public DadosDoConhecimentoDaCargaSimplificado numero(String numero) {
    this.numero = numero;
    return this;
  }

 /**
   * Tipo de conhecimento conforme tabela de domínio.&lt;br/&gt;Domínio:&lt;br/&gt;CRT - CRT&lt;br/&gt;TIF - TIF&lt;br/&gt;BL - BL&lt;br/&gt;AWB - AWB&lt;br/&gt;DSIC - DSIC&lt;br/&gt;COURIER - Courier&lt;br/&gt;POSTAL - Postal&lt;br/&gt;CTE - CT-e&lt;br/&gt;CELET - Conhecimento Eletrônico&lt;br&gt;CE_MERCANTE - CE Mercante
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

  public DadosDoConhecimentoDaCargaSimplificado tipo(TipoEnum tipo) {
    this.tipo = tipo;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DadosDoConhecimentoDaCargaSimplificado {\n");
    
    sb.append("    idElemento: ").append(toIndentedString(idElemento)).append("\n");
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

