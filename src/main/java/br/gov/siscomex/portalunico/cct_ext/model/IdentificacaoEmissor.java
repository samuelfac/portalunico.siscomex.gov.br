package br.gov.siscomex.portalunico.cct_ext.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "IdentificacaoEmissor", propOrder =
    { "cnpj", "cpf"
})

@XmlRootElement(name="IdentificacaoEmissor")
/**
  * Dados do emissor
 **/
@ApiModel(description="Dados do emissor")
public class IdentificacaoEmissor  {
  
  @XmlElement(name="cnpj")
  @ApiModelProperty(example = "99999999999999", value = "CNPJ do emissor<br>Tamanho: 14<br>Formato: NNNNNNNNNNNNNN<br>Deve ser informado somente quando cpf não for informado. Neste caso, é obrigatório.")
 /**
   * CNPJ do emissor<br>Tamanho: 14<br>Formato: NNNNNNNNNNNNNN<br>Deve ser informado somente quando cpf não for informado. Neste caso, é obrigatório.
  **/
  private String cnpj = null;

  @XmlElement(name="cpf")
  @ApiModelProperty(example = "99999999999", value = "CPF do emissor<br>Tamanho: 11<br>Formato: NNNNNNNNNNN<br>Deve ser informado somente quando cnpj não for informado. Neste caso, é obrigatório.")
 /**
   * CPF do emissor<br>Tamanho: 11<br>Formato: NNNNNNNNNNN<br>Deve ser informado somente quando cnpj não for informado. Neste caso, é obrigatório.
  **/
  private String cpf = null;
 /**
   * CNPJ do emissor&lt;br&gt;Tamanho: 14&lt;br&gt;Formato: NNNNNNNNNNNNNN&lt;br&gt;Deve ser informado somente quando cpf não for informado. Neste caso, é obrigatório.
   * @return cnpj
  **/
  @JsonProperty("cnpj")
  public String getCnpj() {
    return cnpj;
  }

  public void setCnpj(String cnpj) {
    this.cnpj = cnpj;
  }

  public IdentificacaoEmissor cnpj(String cnpj) {
    this.cnpj = cnpj;
    return this;
  }

 /**
   * CPF do emissor&lt;br&gt;Tamanho: 11&lt;br&gt;Formato: NNNNNNNNNNN&lt;br&gt;Deve ser informado somente quando cnpj não for informado. Neste caso, é obrigatório.
   * @return cpf
  **/
  @JsonProperty("cpf")
  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public IdentificacaoEmissor cpf(String cpf) {
    this.cpf = cpf;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentificacaoEmissor {\n");
    
    sb.append("    cnpj: ").append(toIndentedString(cnpj)).append("\n");
    sb.append("    cpf: ").append(toIndentedString(cpf)).append("\n");
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

