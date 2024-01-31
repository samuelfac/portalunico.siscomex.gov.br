package br.gov.siscomex.portalunico.remx_consulta.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.time.OffsetDateTime;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "Ocorrncia", propOrder =
    { "codOcorrencia", "cpfFiscalRespOcorrencia", "dataInsercao", "idOcorrencia", "idOrgaoResponsavelOcorrencia", "nomeFiscalRespOcorrencia", "observacao", "resolvida"
})

@XmlRootElement(name="Ocorrncia")
public class Ocorrncia  {
  
  @XmlElement(name="codOcorrencia")
  @ApiModelProperty(value = "Contém o código da ocorrência. O código da ocorrência é composto por até 2 dígitos.")
 /**
   * Contém o código da ocorrência. O código da ocorrência é composto por até 2 dígitos.
  **/
  private Integer codOcorrencia = null;

  @XmlElement(name="cpfFiscalRespOcorrencia")
  @ApiModelProperty(value = "Contém o CPF do fiscal responsável pela ocorrência.  Onze caracteres numéricos.")
 /**
   * Contém o CPF do fiscal responsável pela ocorrência.  Onze caracteres numéricos.
  **/
  private String cpfFiscalRespOcorrencia = null;

  @XmlElement(name="dataInsercao")
  @ApiModelProperty(value = "Data e Hora da inserção da ocorrência. <br/>Formato: yyyy-MM-dd'T'HH:mm:ss.SSSZ")
 /**
   * Data e Hora da inserção da ocorrência. <br/>Formato: yyyy-MM-dd'T'HH:mm:ss.SSSZ
  **/
  private OffsetDateTime dataInsercao = null;

  @XmlElement(name="idOcorrencia")
  @ApiModelProperty(value = "Contém o identificador da ocorrência. Utilizado para identificar qual ocorrência está sendo alterada ou resolvida.")
 /**
   * Contém o identificador da ocorrência. Utilizado para identificar qual ocorrência está sendo alterada ou resolvida.
  **/
  private Integer idOcorrencia = null;

  @XmlElement(name="idOrgaoResponsavelOcorrencia")
  @ApiModelProperty(value = "Contém a sigla do órgão responsável pela ocorrência. Máximo de 50 caracteres.")
 /**
   * Contém a sigla do órgão responsável pela ocorrência. Máximo de 50 caracteres.
  **/
  private String idOrgaoResponsavelOcorrencia = null;

  @XmlElement(name="nomeFiscalRespOcorrencia")
  @ApiModelProperty(value = "Contém o nome do fiscal responsável pela ocorrência.  Máximo de 50 caracteres.")
 /**
   * Contém o nome do fiscal responsável pela ocorrência.  Máximo de 50 caracteres.
  **/
  private String nomeFiscalRespOcorrencia = null;

  @XmlElement(name="observacao")
  @ApiModelProperty(value = "Observação relacionada à ocorrência.")
 /**
   * Observação relacionada à ocorrência.
  **/
  private String observacao = null;

  @XmlElement(name="resolvida")
  @ApiModelProperty(value = "Contém o indicador de resolução da ocorrência. Valores pré-definidos:<br/>0 - Ocorrência não resolvida; <br/>1 - Ocorrência resolvida;<br>2 - Interrompida RFB")
 /**
   * Contém o indicador de resolução da ocorrência. Valores pré-definidos:<br/>0 - Ocorrência não resolvida; <br/>1 - Ocorrência resolvida;<br>2 - Interrompida RFB
  **/
  private String resolvida = null;
 /**
   * Contém o código da ocorrência. O código da ocorrência é composto por até 2 dígitos.
   * @return codOcorrencia
  **/
  @JsonProperty("codOcorrencia")
  public Integer getCodOcorrencia() {
    return codOcorrencia;
  }

  public void setCodOcorrencia(Integer codOcorrencia) {
    this.codOcorrencia = codOcorrencia;
  }

  public Ocorrncia codOcorrencia(Integer codOcorrencia) {
    this.codOcorrencia = codOcorrencia;
    return this;
  }

 /**
   * Contém o CPF do fiscal responsável pela ocorrência.  Onze caracteres numéricos.
   * @return cpfFiscalRespOcorrencia
  **/
  @JsonProperty("cpfFiscalRespOcorrencia")
  public String getCpfFiscalRespOcorrencia() {
    return cpfFiscalRespOcorrencia;
  }

  public void setCpfFiscalRespOcorrencia(String cpfFiscalRespOcorrencia) {
    this.cpfFiscalRespOcorrencia = cpfFiscalRespOcorrencia;
  }

  public Ocorrncia cpfFiscalRespOcorrencia(String cpfFiscalRespOcorrencia) {
    this.cpfFiscalRespOcorrencia = cpfFiscalRespOcorrencia;
    return this;
  }

 /**
   * Data e Hora da inserção da ocorrência. &lt;br/&gt;Formato: yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ
   * @return dataInsercao
  **/
  @JsonProperty("dataInsercao")
  public OffsetDateTime getDataInsercao() {
    return dataInsercao;
  }

  public void setDataInsercao(OffsetDateTime dataInsercao) {
    this.dataInsercao = dataInsercao;
  }

  public Ocorrncia dataInsercao(OffsetDateTime dataInsercao) {
    this.dataInsercao = dataInsercao;
    return this;
  }

 /**
   * Contém o identificador da ocorrência. Utilizado para identificar qual ocorrência está sendo alterada ou resolvida.
   * @return idOcorrencia
  **/
  @JsonProperty("idOcorrencia")
  public Integer getIdOcorrencia() {
    return idOcorrencia;
  }

  public void setIdOcorrencia(Integer idOcorrencia) {
    this.idOcorrencia = idOcorrencia;
  }

  public Ocorrncia idOcorrencia(Integer idOcorrencia) {
    this.idOcorrencia = idOcorrencia;
    return this;
  }

 /**
   * Contém a sigla do órgão responsável pela ocorrência. Máximo de 50 caracteres.
   * @return idOrgaoResponsavelOcorrencia
  **/
  @JsonProperty("idOrgaoResponsavelOcorrencia")
  public String getIdOrgaoResponsavelOcorrencia() {
    return idOrgaoResponsavelOcorrencia;
  }

  public void setIdOrgaoResponsavelOcorrencia(String idOrgaoResponsavelOcorrencia) {
    this.idOrgaoResponsavelOcorrencia = idOrgaoResponsavelOcorrencia;
  }

  public Ocorrncia idOrgaoResponsavelOcorrencia(String idOrgaoResponsavelOcorrencia) {
    this.idOrgaoResponsavelOcorrencia = idOrgaoResponsavelOcorrencia;
    return this;
  }

 /**
   * Contém o nome do fiscal responsável pela ocorrência.  Máximo de 50 caracteres.
   * @return nomeFiscalRespOcorrencia
  **/
  @JsonProperty("nomeFiscalRespOcorrencia")
  public String getNomeFiscalRespOcorrencia() {
    return nomeFiscalRespOcorrencia;
  }

  public void setNomeFiscalRespOcorrencia(String nomeFiscalRespOcorrencia) {
    this.nomeFiscalRespOcorrencia = nomeFiscalRespOcorrencia;
  }

  public Ocorrncia nomeFiscalRespOcorrencia(String nomeFiscalRespOcorrencia) {
    this.nomeFiscalRespOcorrencia = nomeFiscalRespOcorrencia;
    return this;
  }

 /**
   * Observação relacionada à ocorrência.
   * @return observacao
  **/
  @JsonProperty("observacao")
  public String getObservacao() {
    return observacao;
  }

  public void setObservacao(String observacao) {
    this.observacao = observacao;
  }

  public Ocorrncia observacao(String observacao) {
    this.observacao = observacao;
    return this;
  }

 /**
   * Contém o indicador de resolução da ocorrência. Valores pré-definidos:&lt;br/&gt;0 - Ocorrência não resolvida; &lt;br/&gt;1 - Ocorrência resolvida;&lt;br&gt;2 - Interrompida RFB
   * @return resolvida
  **/
  @JsonProperty("resolvida")
  public String getResolvida() {
    return resolvida;
  }

  public void setResolvida(String resolvida) {
    this.resolvida = resolvida;
  }

  public Ocorrncia resolvida(String resolvida) {
    this.resolvida = resolvida;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ocorrncia {\n");
    
    sb.append("    codOcorrencia: ").append(toIndentedString(codOcorrencia)).append("\n");
    sb.append("    cpfFiscalRespOcorrencia: ").append(toIndentedString(cpfFiscalRespOcorrencia)).append("\n");
    sb.append("    dataInsercao: ").append(toIndentedString(dataInsercao)).append("\n");
    sb.append("    idOcorrencia: ").append(toIndentedString(idOcorrencia)).append("\n");
    sb.append("    idOrgaoResponsavelOcorrencia: ").append(toIndentedString(idOrgaoResponsavelOcorrencia)).append("\n");
    sb.append("    nomeFiscalRespOcorrencia: ").append(toIndentedString(nomeFiscalRespOcorrencia)).append("\n");
    sb.append("    observacao: ").append(toIndentedString(observacao)).append("\n");
    sb.append("    resolvida: ").append(toIndentedString(resolvida)).append("\n");
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

