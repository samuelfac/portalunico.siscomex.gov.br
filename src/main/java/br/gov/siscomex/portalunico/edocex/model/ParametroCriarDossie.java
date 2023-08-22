package br.gov.siscomex.portalunico.edocex.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "ParametroCriarDossie", propOrder =
    { "cnpjCpfDeclarante", "descricaoDossie", "idTipoDossie"
})

@XmlRootElement(name="ParametroCriarDossie")
/**
  * Parâmetros para criar um dossiê.
 **/
@ApiModel(description="Parâmetros para criar um dossiê.")
public class ParametroCriarDossie  {
  
  @XmlElement(name="cnpjCpfDeclarante", required = true)
  @ApiModelProperty(example = "88888888888888", required = true, value = "CNPJ ou CPF do dossiê sem formatação.<br/>Tamanho: 14(CNPJ) ou 11(CPF)")
 /**
   * CNPJ ou CPF do dossiê sem formatação.<br/>Tamanho: 14(CNPJ) ou 11(CPF)
  **/
  private String cnpjCpfDeclarante = null;

  @XmlElement(name="descricaoDossie", required = true)
  @ApiModelProperty(example = "Dossiê de exemplo", required = true, value = "Descrição do dossiê.<br/>Tamanho máximo: 255")
 /**
   * Descrição do dossiê.<br/>Tamanho máximo: 255
  **/
  private String descricaoDossie = null;

  @XmlElement(name="idTipoDossie", required = true)
  @ApiModelProperty(example = "538797", required = true, value = "Id do tipo de dossiê.<br/>Valor mínimo: 1<br/>Valor máximo: 2147483647")
 /**
   * Id do tipo de dossiê.<br/>Valor mínimo: 1<br/>Valor máximo: 2147483647
  **/
  private Integer idTipoDossie = null;
 /**
   * CNPJ ou CPF do dossiê sem formatação.&lt;br/&gt;Tamanho: 14(CNPJ) ou 11(CPF)
   * @return cnpjCpfDeclarante
  **/
  @JsonProperty("cnpjCpfDeclarante")
  @NotNull
  public String getCnpjCpfDeclarante() {
    return cnpjCpfDeclarante;
  }

  public void setCnpjCpfDeclarante(String cnpjCpfDeclarante) {
    this.cnpjCpfDeclarante = cnpjCpfDeclarante;
  }

  public ParametroCriarDossie cnpjCpfDeclarante(String cnpjCpfDeclarante) {
    this.cnpjCpfDeclarante = cnpjCpfDeclarante;
    return this;
  }

 /**
   * Descrição do dossiê.&lt;br/&gt;Tamanho máximo: 255
   * @return descricaoDossie
  **/
  @JsonProperty("descricaoDossie")
  @NotNull
  public String getDescricaoDossie() {
    return descricaoDossie;
  }

  public void setDescricaoDossie(String descricaoDossie) {
    this.descricaoDossie = descricaoDossie;
  }

  public ParametroCriarDossie descricaoDossie(String descricaoDossie) {
    this.descricaoDossie = descricaoDossie;
    return this;
  }

 /**
   * Id do tipo de dossiê.&lt;br/&gt;Valor mínimo: 1&lt;br/&gt;Valor máximo: 2147483647
   * @return idTipoDossie
  **/
  @JsonProperty("idTipoDossie")
  @NotNull
  public Integer getIdTipoDossie() {
    return idTipoDossie;
  }

  public void setIdTipoDossie(Integer idTipoDossie) {
    this.idTipoDossie = idTipoDossie;
  }

  public ParametroCriarDossie idTipoDossie(Integer idTipoDossie) {
    this.idTipoDossie = idTipoDossie;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParametroCriarDossie {\n");
    
    sb.append("    cnpjCpfDeclarante: ").append(toIndentedString(cnpjCpfDeclarante)).append("\n");
    sb.append("    descricaoDossie: ").append(toIndentedString(descricaoDossie)).append("\n");
    sb.append("    idTipoDossie: ").append(toIndentedString(idTipoDossie)).append("\n");
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

