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

	@XmlEnumValue("<br/>Domínio:<br/>CRT - Conhecimento Internacional de Transporte Rodoviário<br/>TIF - Conhecimento-Carta de Porte Internacional<br/>RWB - Rail WayBill<br/>AWB - Air WayBill<br/>DSIC - Documento Subsidiário de Identificação da Carga<br/>CTE - Conhecimento de Transporte Eletrônico<br/>CE_MERCANTE - Conhecimento Eletrônico Mercante<br/>BL - Bill of Lading<br/>POSTAL - Remessa Postal Internacional<br/>")
	@JsonProperty("<br/>Domínio:<br/>CRT - Conhecimento Internacional de Transporte Rodoviário<br/>TIF - Conhecimento-Carta de Porte Internacional<br/>RWB - Rail WayBill<br/>AWB - Air WayBill<br/>DSIC - Documento Subsidiário de Identificação da Carga<br/>CTE - Conhecimento de Transporte Eletrônico<br/>CE_MERCANTE - Conhecimento Eletrônico Mercante<br/>BL - Bill of Lading<br/>POSTAL - Remessa Postal Internacional<br/>")
	_BR_DOM_NIO_BR_CRT_CONHECIMENTO_INTERNACIONAL_DE_TRANSPORTE_RODOVI_RIO_BR_TIF_CONHECIMENTO_CARTA_DE_PORTE_INTERNACIONAL_BR_RWB_RAIL_WAYBILL_BR_AWB_AIR_WAYBILL_BR_DSIC_DOCUMENTO_SUBSIDI_RIO_DE_IDENTIFICA_O_DA_CARGA_BR_CTE_CONHECIMENTO_DE_TRANSPORTE_ELETR_NICO_BR_CE_MERCANTE_CONHECIMENTO_ELETR_NICO_MERCANTE_BR_BL_BILL_OF_LADING_BR_POSTAL_REMESSA_POSTAL_INTERNACIONAL_BR_(String.valueOf("<br/>Domínio:<br/>CRT - Conhecimento Internacional de Transporte Rodoviário<br/>TIF - Conhecimento-Carta de Porte Internacional<br/>RWB - Rail WayBill<br/>AWB - Air WayBill<br/>DSIC - Documento Subsidiário de Identificação da Carga<br/>CTE - Conhecimento de Transporte Eletrônico<br/>CE_MERCANTE - Conhecimento Eletrônico Mercante<br/>BL - Bill of Lading<br/>POSTAL - Remessa Postal Internacional<br/>"));


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
  @ApiModelProperty(example = "AWB", value = "Tipo de conhecimento conforme tabela de domínio.")
 /**
   * Tipo de conhecimento conforme tabela de domínio.
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
   * Tipo de conhecimento conforme tabela de domínio.
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

