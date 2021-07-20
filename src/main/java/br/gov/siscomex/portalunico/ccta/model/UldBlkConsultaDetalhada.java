package br.gov.siscomex.portalunico.ccta.model;

import java.util.List;

import javax.validation.Valid;
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
 @XmlType(name = "UldBlkConsultaDetalhada", propOrder =
    { "formaTransporte", "tipoULD", "numeroSerieULD", "codigoProprietarioULD", "conhecimentos"
})

@XmlRootElement(name="UldBlkConsultaDetalhada")
public class UldBlkConsultaDetalhada  {
  

@XmlType(name="FormaTransporteEnum")
@XmlEnum(String.class)
public enum FormaTransporteEnum {

	@XmlEnumValue("ULD")
	@JsonProperty("ULD")
	ULD(String.valueOf("ULD")),
	
	@XmlEnumValue("BLK")
	@JsonProperty("BLK")
	BLK(String.valueOf("BLK"));


    private String value;

    FormaTransporteEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static FormaTransporteEnum fromValue(String v) {
        for (FormaTransporteEnum b : FormaTransporteEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to FormaTransporteEnum");
    }
}

  @XmlElement(name="formaTransporte")
  @ApiModelProperty(example = "BLK", value = "Forma de transporte<br/>Tamanho 3<br/> Formato: AAA")
 /**
   * Forma de transporte<br/>Tamanho 3<br/> Formato: AAA
  **/
  private FormaTransporteEnum formaTransporte = null;

  @XmlElement(name="tipoULD")
  @ApiModelProperty(example = "ULD", value = "Código referente ao tipo da ULD<br/>Tamanho 3<br/> Formato: AAA")
 /**
   * Código referente ao tipo da ULD<br/>Tamanho 3<br/> Formato: AAA
  **/
  private String tipoULD = null;

  @XmlElement(name="numeroSerieULD")
  @ApiModelProperty(example = "AS123", value = "Número de série de uma ULD registrado pelo seu proprietário<br/>Tamanho: 5<br/> Formato: AAAAA")
 /**
   * Número de série de uma ULD registrado pelo seu proprietário<br/>Tamanho: 5<br/> Formato: AAAAA
  **/
  private String numeroSerieULD = null;

  @XmlElement(name="codigoProprietarioULD")
  @ApiModelProperty(example = "XX", value = "Identifica a companhia aérea proprietária da ULD<br/>Tamanho: : 2<br/> Formato: AA")
 /**
   * Identifica a companhia aérea proprietária da ULD<br/>Tamanho: : 2<br/> Formato: AA
  **/
  private String codigoProprietarioULD = null;

  @XmlElement(name="conhecimentos")
  @ApiModelProperty(value = "Lista contendo os conhecimentos manifestados para este manifesto<br/>")
  @Valid
 /**
   * Lista contendo os conhecimentos manifestados para este manifesto<br/>
  **/
  private List<ChaveConhecimento> conhecimentos = null;
 /**
   * Forma de transporte&lt;br/&gt;Tamanho 3&lt;br/&gt; Formato: AAA
   * @return formaTransporte
  **/
  @JsonProperty("formaTransporte")
  public String getFormaTransporte() {
    if (formaTransporte == null) {
      return null;
    }
    return formaTransporte.value();
  }

  public void setFormaTransporte(FormaTransporteEnum formaTransporte) {
    this.formaTransporte = formaTransporte;
  }

  public UldBlkConsultaDetalhada formaTransporte(FormaTransporteEnum formaTransporte) {
    this.formaTransporte = formaTransporte;
    return this;
  }

 /**
   * Código referente ao tipo da ULD&lt;br/&gt;Tamanho 3&lt;br/&gt; Formato: AAA
   * @return tipoULD
  **/
  @JsonProperty("tipoULD")
  public String getTipoULD() {
    return tipoULD;
  }

  public void setTipoULD(String tipoULD) {
    this.tipoULD = tipoULD;
  }

  public UldBlkConsultaDetalhada tipoULD(String tipoULD) {
    this.tipoULD = tipoULD;
    return this;
  }

 /**
   * Número de série de uma ULD registrado pelo seu proprietário&lt;br/&gt;Tamanho: 5&lt;br/&gt; Formato: AAAAA
   * @return numeroSerieULD
  **/
  @JsonProperty("numeroSerieULD")
  public String getNumeroSerieULD() {
    return numeroSerieULD;
  }

  public void setNumeroSerieULD(String numeroSerieULD) {
    this.numeroSerieULD = numeroSerieULD;
  }

  public UldBlkConsultaDetalhada numeroSerieULD(String numeroSerieULD) {
    this.numeroSerieULD = numeroSerieULD;
    return this;
  }

 /**
   * Identifica a companhia aérea proprietária da ULD&lt;br/&gt;Tamanho: : 2&lt;br/&gt; Formato: AA
   * @return codigoProprietarioULD
  **/
  @JsonProperty("codigoProprietarioULD")
  public String getCodigoProprietarioULD() {
    return codigoProprietarioULD;
  }

  public void setCodigoProprietarioULD(String codigoProprietarioULD) {
    this.codigoProprietarioULD = codigoProprietarioULD;
  }

  public UldBlkConsultaDetalhada codigoProprietarioULD(String codigoProprietarioULD) {
    this.codigoProprietarioULD = codigoProprietarioULD;
    return this;
  }

 /**
   * Lista contendo os conhecimentos manifestados para este manifesto&lt;br/&gt;
   * @return conhecimentos
  **/
  @JsonProperty("conhecimentos")
  public List<ChaveConhecimento> getConhecimentos() {
    return conhecimentos;
  }

  public void setConhecimentos(List<ChaveConhecimento> conhecimentos) {
    this.conhecimentos = conhecimentos;
  }

  public UldBlkConsultaDetalhada conhecimentos(List<ChaveConhecimento> conhecimentos) {
    this.conhecimentos = conhecimentos;
    return this;
  }

  public UldBlkConsultaDetalhada addConhecimentosItem(ChaveConhecimento conhecimentosItem) {
    this.conhecimentos.add(conhecimentosItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UldBlkConsultaDetalhada {\n");
    
    sb.append("    formaTransporte: ").append(toIndentedString(formaTransporte)).append("\n");
    sb.append("    tipoULD: ").append(toIndentedString(tipoULD)).append("\n");
    sb.append("    numeroSerieULD: ").append(toIndentedString(numeroSerieULD)).append("\n");
    sb.append("    codigoProprietarioULD: ").append(toIndentedString(codigoProprietarioULD)).append("\n");
    sb.append("    conhecimentos: ").append(toIndentedString(conhecimentos)).append("\n");
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

