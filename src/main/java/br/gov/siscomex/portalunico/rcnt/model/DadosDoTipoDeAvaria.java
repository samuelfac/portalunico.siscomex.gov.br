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
 @XmlType(name = "DadosDoTipoDeAvaria", propOrder =
    { "idElemento", "tipoAvaria"
})

@XmlRootElement(name="DadosDoTipoDeAvaria")
public class DadosDoTipoDeAvaria  {
  
  @XmlElement(name="idElemento")
  @ApiModelProperty(value = "Identificação de cada elemento da lista.<br/>Tamanho: 40")
 /**
   * Identificação de cada elemento da lista.<br/>Tamanho: 40
  **/
  private String idElemento = null;


@XmlType(name="TipoAvariaEnum")
@XmlEnum(String.class)
public enum TipoAvariaEnum {

	@XmlEnumValue("'A'")
	@JsonProperty("'A'")
	A_(String.valueOf("'A'")),
	
	@XmlEnumValue("'B'")
	@JsonProperty("'B'")
	B_(String.valueOf("'B'")),
	
	@XmlEnumValue("'C'")
	@JsonProperty("'C'")
	C_(String.valueOf("'C'")),
	
	@XmlEnumValue("'D'")
	@JsonProperty("'D'")
	D_(String.valueOf("'D'")),
	
	@XmlEnumValue("'E'")
	@JsonProperty("'E'")
	E_(String.valueOf("'E'")),
	
	@XmlEnumValue("'F'")
	@JsonProperty("'F'")
	F_(String.valueOf("'F'")),
	
	@XmlEnumValue("'G'")
	@JsonProperty("'G'")
	G_(String.valueOf("'G'")),
	
	@XmlEnumValue("'H'")
	@JsonProperty("'H'")
	H_(String.valueOf("'H'")),
	
	@XmlEnumValue("'I'")
	@JsonProperty("'I'")
	I_(String.valueOf("'I'")),
	
	@XmlEnumValue("'J'")
	@JsonProperty("'J'")
	J_(String.valueOf("'J'")),
	
	@XmlEnumValue("'K'")
	@JsonProperty("'K'")
	K_(String.valueOf("'K'")),
	
	@XmlEnumValue("'L'")
	@JsonProperty("'L'")
	L_(String.valueOf("'L'")),
	
	@XmlEnumValue("'M'")
	@JsonProperty("'M'")
	M_(String.valueOf("'M'")),
	
	@XmlEnumValue("'N'")
	@JsonProperty("'N'")
	N_(String.valueOf("'N'")),
	
	@XmlEnumValue("'O'")
	@JsonProperty("'O'")
	O_(String.valueOf("'O'")),
	
	@XmlEnumValue("'P'")
	@JsonProperty("'P'")
	P_(String.valueOf("'P'")),
	
	@XmlEnumValue("'Q'")
	@JsonProperty("'Q'")
	Q_(String.valueOf("'Q'")),
	
	@XmlEnumValue("'R'")
	@JsonProperty("'R'")
	R_(String.valueOf("'R'")),
	
	@XmlEnumValue("'S'")
	@JsonProperty("'S'")
	S_(String.valueOf("'S'"));


    private String value;

    TipoAvariaEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TipoAvariaEnum fromValue(String v) {
        for (TipoAvariaEnum b : TipoAvariaEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to TipoAvariaEnum");
    }
}

  @XmlElement(name="tipoAvaria")
  @ApiModelProperty(example = "E", value = "Tipo de Avaria.<br/>Domínio:<br/>A - Diferença de peso<br/>B - Lacre violado<br/>C - Amassado<br/>D - Vazamento<br/>E - Quebrado<br/>F - Rasgado<br/>G - Refitado<br/>H - Furado<br/>I - Aberto<br/>J - Molhado<br/>K - Despregado<br/>L - Repregado<br/>M - Indícios de violação<br/>N - Riscado<br/>O - Sensor de Impacto Ativado<br/>P - Sensor de Inclinação Ativado<br/>Q - Carga Recebida com Alteração de Informação<br/>R - Indícios de Deterioração<br/>S - Carga Lacrada Pelo Fiel Depositário")
 /**
   * Tipo de Avaria.<br/>Domínio:<br/>A - Diferença de peso<br/>B - Lacre violado<br/>C - Amassado<br/>D - Vazamento<br/>E - Quebrado<br/>F - Rasgado<br/>G - Refitado<br/>H - Furado<br/>I - Aberto<br/>J - Molhado<br/>K - Despregado<br/>L - Repregado<br/>M - Indícios de violação<br/>N - Riscado<br/>O - Sensor de Impacto Ativado<br/>P - Sensor de Inclinação Ativado<br/>Q - Carga Recebida com Alteração de Informação<br/>R - Indícios de Deterioração<br/>S - Carga Lacrada Pelo Fiel Depositário
  **/
  private TipoAvariaEnum tipoAvaria = null;
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

  public DadosDoTipoDeAvaria idElemento(String idElemento) {
    this.idElemento = idElemento;
    return this;
  }

 /**
   * Tipo de Avaria.&lt;br/&gt;Domínio:&lt;br/&gt;A - Diferença de peso&lt;br/&gt;B - Lacre violado&lt;br/&gt;C - Amassado&lt;br/&gt;D - Vazamento&lt;br/&gt;E - Quebrado&lt;br/&gt;F - Rasgado&lt;br/&gt;G - Refitado&lt;br/&gt;H - Furado&lt;br/&gt;I - Aberto&lt;br/&gt;J - Molhado&lt;br/&gt;K - Despregado&lt;br/&gt;L - Repregado&lt;br/&gt;M - Indícios de violação&lt;br/&gt;N - Riscado&lt;br/&gt;O - Sensor de Impacto Ativado&lt;br/&gt;P - Sensor de Inclinação Ativado&lt;br/&gt;Q - Carga Recebida com Alteração de Informação&lt;br/&gt;R - Indícios de Deterioração&lt;br/&gt;S - Carga Lacrada Pelo Fiel Depositário
   * @return tipoAvaria
  **/
  @JsonProperty("tipoAvaria")
  public String getTipoAvaria() {
    if (tipoAvaria == null) {
      return null;
    }
    return tipoAvaria.value();
  }

  public void setTipoAvaria(TipoAvariaEnum tipoAvaria) {
    this.tipoAvaria = tipoAvaria;
  }

  public DadosDoTipoDeAvaria tipoAvaria(TipoAvariaEnum tipoAvaria) {
    this.tipoAvaria = tipoAvaria;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DadosDoTipoDeAvaria {\n");
    
    sb.append("    idElemento: ").append(toIndentedString(idElemento)).append("\n");
    sb.append("    tipoAvaria: ").append(toIndentedString(tipoAvaria)).append("\n");
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

