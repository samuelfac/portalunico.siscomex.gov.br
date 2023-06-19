package br.gov.siscomex.portalunico.cct_ext.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "Entregador", propOrder =
    { "cnpj", "cpf", "nomeEstrangeiro"
})

@XmlRootElement(name="Entregador")
/**
  * Dados do Entregador
 **/
@ApiModel(description="Dados do Entregador")
public class Entregador  {
  
  @XmlElement(name="cnpj")
  @ApiModelProperty(example = "99999999999999", value = "CNPJ do entregador<br>Tamanho: 14<br>Formato: NNNNNNNNNNNNNN<br>Informado apenas quando o entregador for nacional e pessoa jurídica.")
 /**
   * CNPJ do entregador<br>Tamanho: 14<br>Formato: NNNNNNNNNNNNNN<br>Informado apenas quando o entregador for nacional e pessoa jurídica.
  **/
  private String cnpj = null;

  @XmlElement(name="cpf")
  @ApiModelProperty(example = "99999999999", value = "CPF do entregador<br>Tamanho: 11<br><br>Formato: NNNNNNNNNNN")
 /**
   * CPF do entregador<br>Tamanho: 11<br><br>Formato: NNNNNNNNNNN
  **/
  private String cpf = null;

  @XmlElement(name="nomeEstrangeiro")
  @ApiModelProperty(example = "Nome do entregador", value = "Nome do entregador<br>Tamanho: 60")
 /**
   * Nome do entregador<br>Tamanho: 60
  **/
  private String nomeEstrangeiro = null;
 /**
   * CNPJ do entregador&lt;br&gt;Tamanho: 14&lt;br&gt;Formato: NNNNNNNNNNNNNN&lt;br&gt;Informado apenas quando o entregador for nacional e pessoa jurídica.
   * @return cnpj
  **/
  @JsonProperty("cnpj")
  public String getCnpj() {
    return cnpj;
  }

  public void setCnpj(String cnpj) {
    this.cnpj = cnpj;
  }

  public Entregador cnpj(String cnpj) {
    this.cnpj = cnpj;
    return this;
  }

 /**
   * CPF do entregador&lt;br&gt;Tamanho: 11&lt;br&gt;&lt;br&gt;Formato: NNNNNNNNNNN
   * @return cpf
  **/
  @JsonProperty("cpf")
  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public Entregador cpf(String cpf) {
    this.cpf = cpf;
    return this;
  }

 /**
   * Nome do entregador&lt;br&gt;Tamanho: 60
   * @return nomeEstrangeiro
  **/
  @JsonProperty("nomeEstrangeiro")
  public String getNomeEstrangeiro() {
    return nomeEstrangeiro;
  }

  public void setNomeEstrangeiro(String nomeEstrangeiro) {
    this.nomeEstrangeiro = nomeEstrangeiro;
  }

  public Entregador nomeEstrangeiro(String nomeEstrangeiro) {
    this.nomeEstrangeiro = nomeEstrangeiro;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Entregador {\n");
    
    sb.append("    cnpj: ").append(toIndentedString(cnpj)).append("\n");
    sb.append("    cpf: ").append(toIndentedString(cpf)).append("\n");
    sb.append("    nomeEstrangeiro: ").append(toIndentedString(nomeEstrangeiro)).append("\n");
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

