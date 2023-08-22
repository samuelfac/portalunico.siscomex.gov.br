package br.gov.siscomex.portalunico.talpco.model;

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

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "EmbarqueCarga", propOrder =
    { "modalTransporte", "numeroConhecimento", "dataHoraEmbarque"
})

@XmlRootElement(name="EmbarqueCarga")
/**
  * Dados referentes ao embarque de carga associado a um LPCO com LI vinculada
 **/
@ApiModel(description="Dados referentes ao embarque de carga associado a um LPCO com LI vinculada")
public class EmbarqueCarga  {
  

@XmlType(name="ModalTransporteEnum")
@XmlEnum(String.class)
public enum ModalTransporteEnum {

	@XmlEnumValue("AEREO")
	@JsonProperty("AEREO")
	AEREO(String.valueOf("AEREO")),
	
	@XmlEnumValue("MARITIMO")
	@JsonProperty("MARITIMO")
	MARITIMO(String.valueOf("MARITIMO")),
	
	@XmlEnumValue("TERRESTRE")
	@JsonProperty("TERRESTRE")
	TERRESTRE(String.valueOf("TERRESTRE"));


    private String value;

    ModalTransporteEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ModalTransporteEnum fromValue(String v) {
        for (ModalTransporteEnum b : ModalTransporteEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to ModalTransporteEnum");
    }
}

  @XmlElement(name="modalTransporte", required = true)
  @ApiModelProperty(example = "MARITIMO", required = true, value = "Modal de transporte da carga associada ao LPCO.<br>Tamanho máximo: 20")
 /**
   * Modal de transporte da carga associada ao LPCO.<br>Tamanho máximo: 20
  **/
  private ModalTransporteEnum modalTransporte = null;

  @XmlElement(name="numeroConhecimento", required = true)
  @ApiModelProperty(example = "99999999999999999999", required = true, value = "Número do conhecimento de carga do LPCO, se houver. Disponível apenas em LPCOs com LI vinculada.<br>Tamanho máximo: 20")
 /**
   * Número do conhecimento de carga do LPCO, se houver. Disponível apenas em LPCOs com LI vinculada.<br>Tamanho máximo: 20
  **/
  private String numeroConhecimento = null;

  @XmlElement(name="dataHoraEmbarque", required = true)
  @ApiModelProperty(example = "2023-03-02T15:31Z", required = true, value = "Data e hora do embarque<br>Formato: dd-MM-yyyy'T'HH:mmZ")
 /**
   * Data e hora do embarque<br>Formato: dd-MM-yyyy'T'HH:mmZ
  **/
  private String dataHoraEmbarque = null;
 /**
   * Modal de transporte da carga associada ao LPCO.&lt;br&gt;Tamanho máximo: 20
   * @return modalTransporte
  **/
  @JsonProperty("modalTransporte")
  @NotNull
  public String getModalTransporte() {
    if (modalTransporte == null) {
      return null;
    }
    return modalTransporte.value();
  }

  public void setModalTransporte(ModalTransporteEnum modalTransporte) {
    this.modalTransporte = modalTransporte;
  }

  public EmbarqueCarga modalTransporte(ModalTransporteEnum modalTransporte) {
    this.modalTransporte = modalTransporte;
    return this;
  }

 /**
   * Número do conhecimento de carga do LPCO, se houver. Disponível apenas em LPCOs com LI vinculada.&lt;br&gt;Tamanho máximo: 20
   * @return numeroConhecimento
  **/
  @JsonProperty("numeroConhecimento")
  @NotNull
  public String getNumeroConhecimento() {
    return numeroConhecimento;
  }

  public void setNumeroConhecimento(String numeroConhecimento) {
    this.numeroConhecimento = numeroConhecimento;
  }

  public EmbarqueCarga numeroConhecimento(String numeroConhecimento) {
    this.numeroConhecimento = numeroConhecimento;
    return this;
  }

 /**
   * Data e hora do embarque&lt;br&gt;Formato: dd-MM-yyyy&#39;T&#39;HH:mmZ
   * @return dataHoraEmbarque
  **/
  @JsonProperty("dataHoraEmbarque")
  @NotNull
  public String getDataHoraEmbarque() {
    return dataHoraEmbarque;
  }

  public void setDataHoraEmbarque(String dataHoraEmbarque) {
    this.dataHoraEmbarque = dataHoraEmbarque;
  }

  public EmbarqueCarga dataHoraEmbarque(String dataHoraEmbarque) {
    this.dataHoraEmbarque = dataHoraEmbarque;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmbarqueCarga {\n");
    
    sb.append("    modalTransporte: ").append(toIndentedString(modalTransporte)).append("\n");
    sb.append("    numeroConhecimento: ").append(toIndentedString(numeroConhecimento)).append("\n");
    sb.append("    dataHoraEmbarque: ").append(toIndentedString(dataHoraEmbarque)).append("\n");
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

