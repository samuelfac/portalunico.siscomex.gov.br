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

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "RecebimentoRepresentation", propOrder =
    { "protocolNumber", "dateTime", "fileType", "status", "cpf", "cnpj", "errorList"
})

@XmlRootElement(name="RecebimentoRepresentation")
/**
  * Resposta para a consulta da situação atual do processamento do arquivo enviado
 **/
@ApiModel(description="Resposta para a consulta da situação atual do processamento do arquivo enviado")
public class RecebimentoRepresentation  {
  
  @XmlElement(name="protocolNumber")
  @ApiModelProperty(example = "20200414180000001", value = "Número de protocolo gerado no recebimento do arquivo<br>Tamanho: 17<br>Formato: 'AAAAAAAAAAAAAAAAA'")
 /**
   * Número de protocolo gerado no recebimento do arquivo<br>Tamanho: 17<br>Formato: 'AAAAAAAAAAAAAAAAA'
  **/
  private String protocolNumber = null;

  @XmlElement(name="dateTime")
  @ApiModelProperty(example = "2020-04-14T18:00:000-03:00", value = "Data/hora de recebimento do arquivo, no fuso horário de Brasília<br>Formato: 'yyyy-MM-dd'T'HH:mm:ss:SSS-03:00'")
 /**
   * Data/hora de recebimento do arquivo, no fuso horário de Brasília<br>Formato: 'yyyy-MM-dd'T'HH:mm:ss:SSS-03:00'
  **/
  private String dateTime = null;


@XmlType(name="FileTypeEnum")
@XmlEnum(String.class)
public enum FileTypeEnum {

	@XmlEnumValue("XFFM")
	@JsonProperty("XFFM")
	XFFM(String.valueOf("XFFM")),
	
	@XmlEnumValue("XFWB")
	@JsonProperty("XFWB")
	XFWB(String.valueOf("XFWB")),
	
	@XmlEnumValue("XFZB")
	@JsonProperty("XFZB")
	XFZB(String.valueOf("XFZB")),
	
	@XmlEnumValue("XFHL")
	@JsonProperty("XFHL")
	XFHL(String.valueOf("XFHL"));


    private String value;

    FileTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static FileTypeEnum fromValue(String v) {
        for (FileTypeEnum b : FileTypeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to FileTypeEnum");
    }
}

  @XmlElement(name="fileType")
  @ApiModelProperty(example = "XFFM", value = "Tipo de arquivo recebido")
 /**
   * Tipo de arquivo recebido
  **/
  private FileTypeEnum fileType = null;


@XmlType(name="StatusEnum")
@XmlEnum(String.class)
public enum StatusEnum {

	@XmlEnumValue("Processed")
	@JsonProperty("Processed")
	PROCESSED(String.valueOf("Processed")),
	
	@XmlEnumValue("Received")
	@JsonProperty("Received")
	RECEIVED(String.valueOf("Received")),
	
	@XmlEnumValue("Rejected")
	@JsonProperty("Rejected")
	REJECTED(String.valueOf("Rejected"));


    private String value;

    StatusEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static StatusEnum fromValue(String v) {
        for (StatusEnum b : StatusEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to StatusEnum");
    }
}

  @XmlElement(name="status")
  @ApiModelProperty(example = "Rejected", value = "Situação atual do processamento do arquivo")
 /**
   * Situação atual do processamento do arquivo
  **/
  private StatusEnum status = null;

  @XmlElement(name="cpf")
  @ApiModelProperty(example = "99999999999", value = "CPF do usuário autenticado que enviou o arquivo<br>Tamanho: 11<br>Formato: 'NNNNNNNNNNN'")
 /**
   * CPF do usuário autenticado que enviou o arquivo<br>Tamanho: 11<br>Formato: 'NNNNNNNNNNN'
  **/
  private String cpf = null;

  @XmlElement(name="cnpj")
  @ApiModelProperty(example = "99999999999999", value = "CNPJ do Transportador (Cia Aérea) ou do Agente de Carga responsável pelo envio do arquivo<br>Tamanho: 14<br>Formato: 'NNNNNNNNNNNNNN'")
 /**
   * CNPJ do Transportador (Cia Aérea) ou do Agente de Carga responsável pelo envio do arquivo<br>Tamanho: 14<br>Formato: 'NNNNNNNNNNNNNN'
  **/
  private String cnpj = null;

  @XmlElement(name="errorList")
  @ApiModelProperty(value = "Lista de erros encontrados no processamento do arquivo")
  @Valid
 /**
   * Lista de erros encontrados no processamento do arquivo
  **/
  private List<ErroArquivoRepresentation> errorList = null;
 /**
   * Número de protocolo gerado no recebimento do arquivo&lt;br&gt;Tamanho: 17&lt;br&gt;Formato: &#39;AAAAAAAAAAAAAAAAA&#39;
   * @return protocolNumber
  **/
  @JsonProperty("protocolNumber")
  public String getProtocolNumber() {
    return protocolNumber;
  }

  public void setProtocolNumber(String protocolNumber) {
    this.protocolNumber = protocolNumber;
  }

  public RecebimentoRepresentation protocolNumber(String protocolNumber) {
    this.protocolNumber = protocolNumber;
    return this;
  }

 /**
   * Data/hora de recebimento do arquivo, no fuso horário de Brasília&lt;br&gt;Formato: &#39;yyyy-MM-dd&#39;T&#39;HH:mm:ss:SSS-03:00&#39;
   * @return dateTime
  **/
  @JsonProperty("dateTime")
  public String getDateTime() {
    return dateTime;
  }

  public void setDateTime(String dateTime) {
    this.dateTime = dateTime;
  }

  public RecebimentoRepresentation dateTime(String dateTime) {
    this.dateTime = dateTime;
    return this;
  }

 /**
   * Tipo de arquivo recebido
   * @return fileType
  **/
  @JsonProperty("fileType")
  public String getFileType() {
    if (fileType == null) {
      return null;
    }
    return fileType.value();
  }

  public void setFileType(FileTypeEnum fileType) {
    this.fileType = fileType;
  }

  public RecebimentoRepresentation fileType(FileTypeEnum fileType) {
    this.fileType = fileType;
    return this;
  }

 /**
   * Situação atual do processamento do arquivo
   * @return status
  **/
  @JsonProperty("status")
  public String getStatus() {
    if (status == null) {
      return null;
    }
    return status.value();
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public RecebimentoRepresentation status(StatusEnum status) {
    this.status = status;
    return this;
  }

 /**
   * CPF do usuário autenticado que enviou o arquivo&lt;br&gt;Tamanho: 11&lt;br&gt;Formato: &#39;NNNNNNNNNNN&#39;
   * @return cpf
  **/
  @JsonProperty("cpf")
  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public RecebimentoRepresentation cpf(String cpf) {
    this.cpf = cpf;
    return this;
  }

 /**
   * CNPJ do Transportador (Cia Aérea) ou do Agente de Carga responsável pelo envio do arquivo&lt;br&gt;Tamanho: 14&lt;br&gt;Formato: &#39;NNNNNNNNNNNNNN&#39;
   * @return cnpj
  **/
  @JsonProperty("cnpj")
  public String getCnpj() {
    return cnpj;
  }

  public void setCnpj(String cnpj) {
    this.cnpj = cnpj;
  }

  public RecebimentoRepresentation cnpj(String cnpj) {
    this.cnpj = cnpj;
    return this;
  }

 /**
   * Lista de erros encontrados no processamento do arquivo
   * @return errorList
  **/
  @JsonProperty("errorList")
  public List<ErroArquivoRepresentation> getErrorList() {
    return errorList;
  }

  public void setErrorList(List<ErroArquivoRepresentation> errorList) {
    this.errorList = errorList;
  }

  public RecebimentoRepresentation errorList(List<ErroArquivoRepresentation> errorList) {
    this.errorList = errorList;
    return this;
  }

  public RecebimentoRepresentation addErrorListItem(ErroArquivoRepresentation errorListItem) {
    this.errorList.add(errorListItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecebimentoRepresentation {\n");
    
    sb.append("    protocolNumber: ").append(toIndentedString(protocolNumber)).append("\n");
    sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
    sb.append("    fileType: ").append(toIndentedString(fileType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    cpf: ").append(toIndentedString(cpf)).append("\n");
    sb.append("    cnpj: ").append(toIndentedString(cnpj)).append("\n");
    sb.append("    errorList: ").append(toIndentedString(errorList)).append("\n");
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

