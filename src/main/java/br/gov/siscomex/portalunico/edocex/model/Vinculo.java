package br.gov.siscomex.portalunico.edocex.model;

import java.time.OffsetDateTime;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "Vinculo", propOrder =
    { "cpfVinculacao", "dataHoraVinculacao", "numeroOperacao", "tipoOperacao", "vinculadoPor"
})

@XmlRootElement(name="Vinculo")
/**
  * Vinculo do dossiê.
 **/
@ApiModel(description="Vinculo do dossiê.")
public class Vinculo  {
  
  @XmlElement(name="cpfVinculacao", required = true)
  @ApiModelProperty(example = "77777777777", required = true, value = "CPF do usuário que vinculou o dossiê sem formatação.<br/>Tamanho: 11")
 /**
   * CPF do usuário que vinculou o dossiê sem formatação.<br/>Tamanho: 11
  **/
  private String cpfVinculacao = null;

  @XmlElement(name="dataHoraVinculacao")
  @ApiModelProperty(value = "Data/hora da vinculação do  dossiê à operação.<br/>Formato ISO 8601: yyyy-MM-dd'T'HH:mm:ss.SSSz")
 /**
   * Data/hora da vinculação do  dossiê à operação.<br/>Formato ISO 8601: yyyy-MM-dd'T'HH:mm:ss.SSSz
  **/
  private OffsetDateTime dataHoraVinculacao = null;

  @XmlElement(name="numeroOperacao", required = true)
  @ApiModelProperty(example = "19BR0000000174", required = true, value = "Número da operação.<br/>Tamanho máximo: 255<br/>Formato: de acordo com o definido em cada sistema de origem do tipo de operação.")
 /**
   * Número da operação.<br/>Tamanho máximo: 255<br/>Formato: de acordo com o definido em cada sistema de origem do tipo de operação.
  **/
  private String numeroOperacao = null;


@XmlType(name="TipoOperacaoEnum")
@XmlEnum(String.class)
public enum TipoOperacaoEnum {

	@XmlEnumValue("DI")
	@JsonProperty("DI")
	DI(String.valueOf("DI")),
	
	@XmlEnumValue("LI")
	@JsonProperty("LI")
	LI(String.valueOf("LI")),
	
	@XmlEnumValue("RE")
	@JsonProperty("RE")
	RE(String.valueOf("RE")),
	
	@XmlEnumValue("LPCO")
	@JsonProperty("LPCO")
	LPCO(String.valueOf("LPCO")),
	
	@XmlEnumValue("DUE")
	@JsonProperty("DUE")
	DUE(String.valueOf("DUE")),
	
	@XmlEnumValue("CATP")
	@JsonProperty("CATP")
	CATP(String.valueOf("CATP")),
	
	@XmlEnumValue("DUIMP")
	@JsonProperty("DUIMP")
	DUIMP(String.valueOf("DUIMP")),
	
	@XmlEnumValue("DT")
	@JsonProperty("DT")
	DT(String.valueOf("DT")),
	
	@XmlEnumValue("DIR")
	@JsonProperty("DIR")
	DIR(String.valueOf("DIR")),
	
	@XmlEnumValue("RECINTOS")
	@JsonProperty("RECINTOS")
	RECINTOS(String.valueOf("RECINTOS"));


    private String value;

    TipoOperacaoEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TipoOperacaoEnum fromValue(String v) {
        for (TipoOperacaoEnum b : TipoOperacaoEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to TipoOperacaoEnum");
    }
}

  @XmlElement(name="tipoOperacao", required = true)
  @ApiModelProperty(example = "DUE", required = true, value = "Identifica o tipo de operação desejado:<br/>DI - Declaração de Importação,<br/>LI - Licença de Importação,<br/>RE - Registro de Exportação,<br/>LPCO - Tratamento Administrativo/LPCO,<br/>DUE - Declaração Única de Exportação,<br/>CATP - Catálogo de Produtos,<br/>DUIMP - Declaração Única de Importação,<br/>DT - Declaração de Trânsito,<br/>DIR - Declaração de Importação de Remessa</br>RECINTOS - Recintos Aduaneiros")
 /**
   * Identifica o tipo de operação desejado:<br/>DI - Declaração de Importação,<br/>LI - Licença de Importação,<br/>RE - Registro de Exportação,<br/>LPCO - Tratamento Administrativo/LPCO,<br/>DUE - Declaração Única de Exportação,<br/>CATP - Catálogo de Produtos,<br/>DUIMP - Declaração Única de Importação,<br/>DT - Declaração de Trânsito,<br/>DIR - Declaração de Importação de Remessa</br>RECINTOS - Recintos Aduaneiros
  **/
  private TipoOperacaoEnum tipoOperacao = null;


@XmlType(name="VinculadoPorEnum")
@XmlEnum(String.class)
public enum VinculadoPorEnum {

	@XmlEnumValue("Representante Legal")
	@JsonProperty("Representante Legal")
	REPRESENTANTE_LEGAL(String.valueOf("Representante Legal")),
	
	@XmlEnumValue("Administração Pública")
	@JsonProperty("Administração Pública")
	ADMINISTRA_O_P_BLICA(String.valueOf("Administração Pública"));


    private String value;

    VinculadoPorEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static VinculadoPorEnum fromValue(String v) {
        for (VinculadoPorEnum b : VinculadoPorEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to VinculadoPorEnum");
    }
}

  @XmlElement(name="vinculadoPor", required = true)
  @ApiModelProperty(example = "Representante Legal", required = true, value = "Tipo de usuário/órgão que vinculou o dossiê.")
 /**
   * Tipo de usuário/órgão que vinculou o dossiê.
  **/
  private VinculadoPorEnum vinculadoPor = null;
 /**
   * CPF do usuário que vinculou o dossiê sem formatação.&lt;br/&gt;Tamanho: 11
   * @return cpfVinculacao
  **/
  @JsonProperty("cpfVinculacao")
  @NotNull
  public String getCpfVinculacao() {
    return cpfVinculacao;
  }

  public void setCpfVinculacao(String cpfVinculacao) {
    this.cpfVinculacao = cpfVinculacao;
  }

  public Vinculo cpfVinculacao(String cpfVinculacao) {
    this.cpfVinculacao = cpfVinculacao;
    return this;
  }

 /**
   * Data/hora da vinculação do  dossiê à operação.&lt;br/&gt;Formato ISO 8601: yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSz
   * @return dataHoraVinculacao
  **/
  @JsonProperty("dataHoraVinculacao")
  public OffsetDateTime getDataHoraVinculacao() {
    return dataHoraVinculacao;
  }

  public void setDataHoraVinculacao(OffsetDateTime dataHoraVinculacao) {
    this.dataHoraVinculacao = dataHoraVinculacao;
  }

  public Vinculo dataHoraVinculacao(OffsetDateTime dataHoraVinculacao) {
    this.dataHoraVinculacao = dataHoraVinculacao;
    return this;
  }

 /**
   * Número da operação.&lt;br/&gt;Tamanho máximo: 255&lt;br/&gt;Formato: de acordo com o definido em cada sistema de origem do tipo de operação.
   * @return numeroOperacao
  **/
  @JsonProperty("numeroOperacao")
  @NotNull
  public String getNumeroOperacao() {
    return numeroOperacao;
  }

  public void setNumeroOperacao(String numeroOperacao) {
    this.numeroOperacao = numeroOperacao;
  }

  public Vinculo numeroOperacao(String numeroOperacao) {
    this.numeroOperacao = numeroOperacao;
    return this;
  }

 /**
   * Identifica o tipo de operação desejado:&lt;br/&gt;DI - Declaração de Importação,&lt;br/&gt;LI - Licença de Importação,&lt;br/&gt;RE - Registro de Exportação,&lt;br/&gt;LPCO - Tratamento Administrativo/LPCO,&lt;br/&gt;DUE - Declaração Única de Exportação,&lt;br/&gt;CATP - Catálogo de Produtos,&lt;br/&gt;DUIMP - Declaração Única de Importação,&lt;br/&gt;DT - Declaração de Trânsito,&lt;br/&gt;DIR - Declaração de Importação de Remessa&lt;/br&gt;RECINTOS - Recintos Aduaneiros
   * @return tipoOperacao
  **/
  @JsonProperty("tipoOperacao")
  @NotNull
  public String getTipoOperacao() {
    if (tipoOperacao == null) {
      return null;
    }
    return tipoOperacao.value();
  }

  public void setTipoOperacao(TipoOperacaoEnum tipoOperacao) {
    this.tipoOperacao = tipoOperacao;
  }

  public Vinculo tipoOperacao(TipoOperacaoEnum tipoOperacao) {
    this.tipoOperacao = tipoOperacao;
    return this;
  }

 /**
   * Tipo de usuário/órgão que vinculou o dossiê.
   * @return vinculadoPor
  **/
  @JsonProperty("vinculadoPor")
  @NotNull
  public String getVinculadoPor() {
    if (vinculadoPor == null) {
      return null;
    }
    return vinculadoPor.value();
  }

  public void setVinculadoPor(VinculadoPorEnum vinculadoPor) {
    this.vinculadoPor = vinculadoPor;
  }

  public Vinculo vinculadoPor(VinculadoPorEnum vinculadoPor) {
    this.vinculadoPor = vinculadoPor;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Vinculo {\n");
    
    sb.append("    cpfVinculacao: ").append(toIndentedString(cpfVinculacao)).append("\n");
    sb.append("    dataHoraVinculacao: ").append(toIndentedString(dataHoraVinculacao)).append("\n");
    sb.append("    numeroOperacao: ").append(toIndentedString(numeroOperacao)).append("\n");
    sb.append("    tipoOperacao: ").append(toIndentedString(tipoOperacao)).append("\n");
    sb.append("    vinculadoPor: ").append(toIndentedString(vinculadoPor)).append("\n");
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

