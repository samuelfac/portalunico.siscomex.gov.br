package br.gov.siscomex.portalunico.edocex.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.time.OffsetDateTime;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "DossieVinculado", propOrder =
    { "cpfVinculacao", "dataHoraVinculacao", "numeroDossie", "vinculadoPor"
})

@XmlRootElement(name="DossieVinculado")
/**
  * Dossiê vinculado ao dossiê.
 **/
@ApiModel(description="Dossiê vinculado ao dossiê.")
public class DossieVinculado  {
  
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

  @XmlElement(name="numeroDossie", required = true)
  @ApiModelProperty(example = "201900012345678", required = true, value = "Número do dossiê.<br/>Tamanho: 15<br/>Formato: NNNNNNNNNNNNNNN")
 /**
   * Número do dossiê.<br/>Tamanho: 15<br/>Formato: NNNNNNNNNNNNNNN
  **/
  private String numeroDossie = null;


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

  public DossieVinculado cpfVinculacao(String cpfVinculacao) {
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

  public DossieVinculado dataHoraVinculacao(OffsetDateTime dataHoraVinculacao) {
    this.dataHoraVinculacao = dataHoraVinculacao;
    return this;
  }

 /**
   * Número do dossiê.&lt;br/&gt;Tamanho: 15&lt;br/&gt;Formato: NNNNNNNNNNNNNNN
   * @return numeroDossie
  **/
  @JsonProperty("numeroDossie")
  @NotNull
  public String getNumeroDossie() {
    return numeroDossie;
  }

  public void setNumeroDossie(String numeroDossie) {
    this.numeroDossie = numeroDossie;
  }

  public DossieVinculado numeroDossie(String numeroDossie) {
    this.numeroDossie = numeroDossie;
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

  public DossieVinculado vinculadoPor(VinculadoPorEnum vinculadoPor) {
    this.vinculadoPor = vinculadoPor;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DossieVinculado {\n");
    
    sb.append("    cpfVinculacao: ").append(toIndentedString(cpfVinculacao)).append("\n");
    sb.append("    dataHoraVinculacao: ").append(toIndentedString(dataHoraVinculacao)).append("\n");
    sb.append("    numeroDossie: ").append(toIndentedString(numeroDossie)).append("\n");
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

