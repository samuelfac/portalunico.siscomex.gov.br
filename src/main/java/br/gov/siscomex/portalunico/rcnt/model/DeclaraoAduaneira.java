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
 @XmlType(name = "DeclaraoAduaneira", propOrder =
    { "numeroDeclaracao", "tipo"
})

@XmlRootElement(name="DeclaraoAduaneira")
public class DeclaraoAduaneira  {
  
  @XmlElement(name="numeroDeclaracao")
  @ApiModelProperty(value = "Número da declaração aduaneira.<br/>Tamanho: 100")
 /**
   * Número da declaração aduaneira.<br/>Tamanho: 100
  **/
  private String numeroDeclaracao = null;


@XmlType(name="TipoEnum")
@XmlEnum(String.class)
public enum TipoEnum {

	@XmlEnumValue("'DI'")
	@JsonProperty("'DI'")
	DI_(String.valueOf("'DI'")),
	
	@XmlEnumValue("'DSI_ELETRONICA'")
	@JsonProperty("'DSI_ELETRONICA'")
	DSI_ELETRONICA_(String.valueOf("'DSI_ELETRONICA'")),
	
	@XmlEnumValue("'DSI_FORMULARIO'")
	@JsonProperty("'DSI_FORMULARIO'")
	DSI_FORMULARIO_(String.valueOf("'DSI_FORMULARIO'")),
	
	@XmlEnumValue("'DSE_ELETRONICA'")
	@JsonProperty("'DSE_ELETRONICA'")
	DSE_ELETRONICA_(String.valueOf("'DSE_ELETRONICA'")),
	
	@XmlEnumValue("'DSE_FORMULARIO'")
	@JsonProperty("'DSE_FORMULARIO'")
	DSE_FORMULARIO_(String.valueOf("'DSE_FORMULARIO'")),
	
	@XmlEnumValue("'DUIMP'")
	@JsonProperty("'DUIMP'")
	DUIMP_(String.valueOf("'DUIMP'")),
	
	@XmlEnumValue("'DUE'")
	@JsonProperty("'DUE'")
	DUE_(String.valueOf("'DUE'")),
	
	@XmlEnumValue("'DE'")
	@JsonProperty("'DE'")
	DE_(String.valueOf("'DE'")),
	
	@XmlEnumValue("'DTA'")
	@JsonProperty("'DTA'")
	DTA_(String.valueOf("'DTA'")),
	
	@XmlEnumValue("'DTA_S'")
	@JsonProperty("'DTA_S'")
	DTA_S_(String.valueOf("'DTA_S'")),
	
	@XmlEnumValue("'DTAI'")
	@JsonProperty("'DTAI'")
	DTAI_(String.valueOf("'DTAI'")),
	
	@XmlEnumValue("'DTC'")
	@JsonProperty("'DTC'")
	DTC_(String.valueOf("'DTC'")),
	
	@XmlEnumValue("'DAT'")
	@JsonProperty("'DAT'")
	DAT_(String.valueOf("'DAT'")),
	
	@XmlEnumValue("'ATA_C'")
	@JsonProperty("'ATA_C'")
	ATA_C_(String.valueOf("'ATA_C'")),
	
	@XmlEnumValue("'DIR'")
	@JsonProperty("'DIR'")
	DIR_(String.valueOf("'DIR'")),
	
	@XmlEnumValue("'DRE'")
	@JsonProperty("'DRE'")
	DRE_(String.valueOf("'DRE'")),
	
	@XmlEnumValue("'DRI'")
	@JsonProperty("'DRI'")
	DRI_(String.valueOf("'DRI'"));


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
  @ApiModelProperty(example = "DUIMP", value = "Tipo da Declaração aduaneira conforme tabela de domínio.<br/>Domínio:<br/>DI - Declaração de Importação <br/>DSI_ELETRONICA - DSI Eletrônica <br/>DSI_FORMULARIO - DSI Formulário <br/>DSE_ELETRONICA - DSE Eletrônica <br/>DSE_FORMULARIO -  DSE Formulário <br/>DUIMP - Declaração Única de Importação <br/>DUE - Declaração Única de Exportação <br/>DE - Declaração de Exportação <br/>DTA - Declaração de Trânsito Aduaneiro <br/>DTA_S - Declaração de Trânsito Aduaneiro Simplificado <br/>DTAI - Declaração de Trânsito Aduaneiro Internacional <br/>DTC - Declaração de Trânsito de Contêiner <br/>DAT - Documento de Acompanhamento de Trânsito <br/>ATA_C - Carnê Ata (Ata Carnet) <br/>DIR - Declaração de Importação de Remessa <br/>DRE - Declaração de Remessas de Exportação <br/>DRI - Declaração de Remessas de Importação")
 /**
   * Tipo da Declaração aduaneira conforme tabela de domínio.<br/>Domínio:<br/>DI - Declaração de Importação <br/>DSI_ELETRONICA - DSI Eletrônica <br/>DSI_FORMULARIO - DSI Formulário <br/>DSE_ELETRONICA - DSE Eletrônica <br/>DSE_FORMULARIO -  DSE Formulário <br/>DUIMP - Declaração Única de Importação <br/>DUE - Declaração Única de Exportação <br/>DE - Declaração de Exportação <br/>DTA - Declaração de Trânsito Aduaneiro <br/>DTA_S - Declaração de Trânsito Aduaneiro Simplificado <br/>DTAI - Declaração de Trânsito Aduaneiro Internacional <br/>DTC - Declaração de Trânsito de Contêiner <br/>DAT - Documento de Acompanhamento de Trânsito <br/>ATA_C - Carnê Ata (Ata Carnet) <br/>DIR - Declaração de Importação de Remessa <br/>DRE - Declaração de Remessas de Exportação <br/>DRI - Declaração de Remessas de Importação
  **/
  private TipoEnum tipo = null;
 /**
   * Número da declaração aduaneira.&lt;br/&gt;Tamanho: 100
   * @return numeroDeclaracao
  **/
  @JsonProperty("numeroDeclaracao")
  public String getNumeroDeclaracao() {
    return numeroDeclaracao;
  }

  public void setNumeroDeclaracao(String numeroDeclaracao) {
    this.numeroDeclaracao = numeroDeclaracao;
  }

  public DeclaraoAduaneira numeroDeclaracao(String numeroDeclaracao) {
    this.numeroDeclaracao = numeroDeclaracao;
    return this;
  }

 /**
   * Tipo da Declaração aduaneira conforme tabela de domínio.&lt;br/&gt;Domínio:&lt;br/&gt;DI - Declaração de Importação &lt;br/&gt;DSI_ELETRONICA - DSI Eletrônica &lt;br/&gt;DSI_FORMULARIO - DSI Formulário &lt;br/&gt;DSE_ELETRONICA - DSE Eletrônica &lt;br/&gt;DSE_FORMULARIO -  DSE Formulário &lt;br/&gt;DUIMP - Declaração Única de Importação &lt;br/&gt;DUE - Declaração Única de Exportação &lt;br/&gt;DE - Declaração de Exportação &lt;br/&gt;DTA - Declaração de Trânsito Aduaneiro &lt;br/&gt;DTA_S - Declaração de Trânsito Aduaneiro Simplificado &lt;br/&gt;DTAI - Declaração de Trânsito Aduaneiro Internacional &lt;br/&gt;DTC - Declaração de Trânsito de Contêiner &lt;br/&gt;DAT - Documento de Acompanhamento de Trânsito &lt;br/&gt;ATA_C - Carnê Ata (Ata Carnet) &lt;br/&gt;DIR - Declaração de Importação de Remessa &lt;br/&gt;DRE - Declaração de Remessas de Exportação &lt;br/&gt;DRI - Declaração de Remessas de Importação
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

  public DeclaraoAduaneira tipo(TipoEnum tipo) {
    this.tipo = tipo;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeclaraoAduaneira {\n");
    
    sb.append("    numeroDeclaracao: ").append(toIndentedString(numeroDeclaracao)).append("\n");
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

