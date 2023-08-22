package br.gov.siscomex.portalunico.cct_ext.model;

import br.gov.siscomex.portalunico.cct_ext.model.IdentificacaoEstrangeiro;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "Destinatario", propOrder =
    { "cnpj", "cpf", "identificacaoEstrangeiro"
})

@XmlRootElement(name="Destinatario")
/**
  * Destinatário
 **/
@ApiModel(description="Destinatário")
public class Destinatario  {
  
  @XmlElement(name="cnpj")
  @ApiModelProperty(example = "9999999999999", value = "CNPJ do destinatário<br>Tamanho: 14<br>Formato: NNNNNNNNNNNNNN<br>Deve ser informado somente quando cpf e identificacaoEstrangeiro não forem informados. Neste caso, é obrigatório.")
 /**
   * CNPJ do destinatário<br>Tamanho: 14<br>Formato: NNNNNNNNNNNNNN<br>Deve ser informado somente quando cpf e identificacaoEstrangeiro não forem informados. Neste caso, é obrigatório.
  **/
  private String cnpj = null;

  @XmlElement(name="cpf")
  @ApiModelProperty(example = "99999999999", value = "CPF do destinatário<br>Tamanho: 11<br>Formato: NNNNNNNNNNN<br>Deve ser informado somente quando cnpj e identificacaoEstrangeiro não forem informados. Neste caso, é obrigatório.")
 /**
   * CPF do destinatário<br>Tamanho: 11<br>Formato: NNNNNNNNNNN<br>Deve ser informado somente quando cnpj e identificacaoEstrangeiro não forem informados. Neste caso, é obrigatório.
  **/
  private String cpf = null;

  @XmlElement(name="identificacaoEstrangeiro")
  @ApiModelProperty(value = "")
  @Valid
  private IdentificacaoEstrangeiro identificacaoEstrangeiro = null;
 /**
   * CNPJ do destinatário&lt;br&gt;Tamanho: 14&lt;br&gt;Formato: NNNNNNNNNNNNNN&lt;br&gt;Deve ser informado somente quando cpf e identificacaoEstrangeiro não forem informados. Neste caso, é obrigatório.
   * @return cnpj
  **/
  @JsonProperty("cnpj")
  public String getCnpj() {
    return cnpj;
  }

  public void setCnpj(String cnpj) {
    this.cnpj = cnpj;
  }

  public Destinatario cnpj(String cnpj) {
    this.cnpj = cnpj;
    return this;
  }

 /**
   * CPF do destinatário&lt;br&gt;Tamanho: 11&lt;br&gt;Formato: NNNNNNNNNNN&lt;br&gt;Deve ser informado somente quando cnpj e identificacaoEstrangeiro não forem informados. Neste caso, é obrigatório.
   * @return cpf
  **/
  @JsonProperty("cpf")
  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public Destinatario cpf(String cpf) {
    this.cpf = cpf;
    return this;
  }

 /**
   * Get identificacaoEstrangeiro
   * @return identificacaoEstrangeiro
  **/
  @JsonProperty("identificacaoEstrangeiro")
  public IdentificacaoEstrangeiro getIdentificacaoEstrangeiro() {
    return identificacaoEstrangeiro;
  }

  public void setIdentificacaoEstrangeiro(IdentificacaoEstrangeiro identificacaoEstrangeiro) {
    this.identificacaoEstrangeiro = identificacaoEstrangeiro;
  }

  public Destinatario identificacaoEstrangeiro(IdentificacaoEstrangeiro identificacaoEstrangeiro) {
    this.identificacaoEstrangeiro = identificacaoEstrangeiro;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Destinatario {\n");
    
    sb.append("    cnpj: ").append(toIndentedString(cnpj)).append("\n");
    sb.append("    cpf: ").append(toIndentedString(cpf)).append("\n");
    sb.append("    identificacaoEstrangeiro: ").append(toIndentedString(identificacaoEstrangeiro)).append("\n");
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

