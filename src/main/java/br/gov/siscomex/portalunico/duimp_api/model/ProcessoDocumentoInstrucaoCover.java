package br.gov.siscomex.portalunico.duimp_api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "ProcessoDocumentoInstrucaoCover", propOrder =
    { "identificacao", "tipo"
})

@XmlRootElement(name="ProcessoDocumentoInstrucaoCover")
/**
  * Lista de processos vinculados.
 **/
@ApiModel(description="Lista de processos vinculados.")
public class ProcessoDocumentoInstrucaoCover  {
  
  @XmlElement(name="identificacao")
  @ApiModelProperty(example = "15595720034201371", value = "Número do Processo vinculado à Duimp.")
 /**
   * Número do Processo vinculado à Duimp.
  **/
  private String identificacao = null;


@XmlType(name="TipoEnum")
@XmlEnum(String.class)
public enum TipoEnum {

	@XmlEnumValue("ADMINISTRATIVO")
	@JsonProperty("ADMINISTRATIVO")
	ADMINISTRATIVO(String.valueOf("ADMINISTRATIVO"));


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
  @ApiModelProperty(example = "ADMINISTRATIVO", value = "Tipo de Processo Administrativo.<br>Domínio:")
 /**
   * Tipo de Processo Administrativo.<br>Domínio:
  **/
  private TipoEnum tipo = null;
 /**
   * Número do Processo vinculado à Duimp.
   * @return identificacao
  **/
  @JsonProperty("identificacao")
  public String getIdentificacao() {
    return identificacao;
  }

  public void setIdentificacao(String identificacao) {
    this.identificacao = identificacao;
  }

  public ProcessoDocumentoInstrucaoCover identificacao(String identificacao) {
    this.identificacao = identificacao;
    return this;
  }

 /**
   * Tipo de Processo Administrativo.&lt;br&gt;Domínio:
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

  public ProcessoDocumentoInstrucaoCover tipo(TipoEnum tipo) {
    this.tipo = tipo;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessoDocumentoInstrucaoCover {\n");
    
    sb.append("    identificacao: ").append(toIndentedString(identificacao)).append("\n");
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

