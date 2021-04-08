package br.gov.siscomex.portalunico.cct_ext.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "Transportador", propOrder =
    { "cnpj", "cpf", "nomeEstrangeiro", "cpfCondutor", "nomeCondutorEstrangeiro"
})

@XmlRootElement(name="Transportador")
/**
  * Dados do Transportador
 **/
@ApiModel(description="Dados do Transportador")
public class Transportador  {
  
  @XmlElement(name="cnpj")
  @ApiModelProperty(example = "00000000000272", value = "CNPJ do transportador<br>Tamanho: 14<br>Formato: NNNNNNNNNNNNNN<br>Deve ser informado somente quando cpf e nomeEstrangeiro não forem informados.")
 /**
   * CNPJ do transportador<br>Tamanho: 14<br>Formato: NNNNNNNNNNNNNN<br>Deve ser informado somente quando cpf e nomeEstrangeiro não forem informados.
  **/
  private String cnpj = null;

  @XmlElement(name="cpf")
  @ApiModelProperty(example = "10715312707", value = "CPF do transportador<br>Tamanho: 11<br>Formato: NNNNNNNNNNN<br>Deve ser informado somente quando cnpj e nomeEstrangeiro não forem informados")
 /**
   * CPF do transportador<br>Tamanho: 11<br>Formato: NNNNNNNNNNN<br>Deve ser informado somente quando cnpj e nomeEstrangeiro não forem informados
  **/
  private String cpf = null;

  @XmlElement(name="nomeEstrangeiro")
  @ApiModelProperty(example = "Nome do transportador", value = "Nome do transportador quando for estrangeiro<br>Tamanho: 60<br>Deve ser informado somente quando cnpj e cpf não forem informados. ")
 /**
   * Nome do transportador quando for estrangeiro<br>Tamanho: 60<br>Deve ser informado somente quando cnpj e cpf não forem informados. 
  **/
  private String nomeEstrangeiro = null;

  @XmlElement(name="cpfCondutor")
  @ApiModelProperty(example = "10715312707", value = "CPF do condutor<br>Tamanho: 11<br>Formato: NNNNNNNNNNN<br>Deve ser informado somente quando nomeCondutorEstrangeiro não for informado. ")
 /**
   * CPF do condutor<br>Tamanho: 11<br>Formato: NNNNNNNNNNN<br>Deve ser informado somente quando nomeCondutorEstrangeiro não for informado. 
  **/
  private String cpfCondutor = null;

  @XmlElement(name="nomeCondutorEstrangeiro")
  @ApiModelProperty(example = "Nome do condutor", value = "Nome do condutor quando for estrangeiro<br>Tamanho: 60<br>Deve ser informado somente quando cpfCondutor não for informado.")
 /**
   * Nome do condutor quando for estrangeiro<br>Tamanho: 60<br>Deve ser informado somente quando cpfCondutor não for informado.
  **/
  private String nomeCondutorEstrangeiro = null;
 /**
   * CNPJ do transportador&lt;br&gt;Tamanho: 14&lt;br&gt;Formato: NNNNNNNNNNNNNN&lt;br&gt;Deve ser informado somente quando cpf e nomeEstrangeiro não forem informados.
   * @return cnpj
  **/
  @JsonProperty("cnpj")
  public String getCnpj() {
    return cnpj;
  }

  public void setCnpj(String cnpj) {
    this.cnpj = cnpj;
  }

  public Transportador cnpj(String cnpj) {
    this.cnpj = cnpj;
    return this;
  }

 /**
   * CPF do transportador&lt;br&gt;Tamanho: 11&lt;br&gt;Formato: NNNNNNNNNNN&lt;br&gt;Deve ser informado somente quando cnpj e nomeEstrangeiro não forem informados
   * @return cpf
  **/
  @JsonProperty("cpf")
  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public Transportador cpf(String cpf) {
    this.cpf = cpf;
    return this;
  }

 /**
   * Nome do transportador quando for estrangeiro&lt;br&gt;Tamanho: 60&lt;br&gt;Deve ser informado somente quando cnpj e cpf não forem informados. 
   * @return nomeEstrangeiro
  **/
  @JsonProperty("nomeEstrangeiro")
  public String getNomeEstrangeiro() {
    return nomeEstrangeiro;
  }

  public void setNomeEstrangeiro(String nomeEstrangeiro) {
    this.nomeEstrangeiro = nomeEstrangeiro;
  }

  public Transportador nomeEstrangeiro(String nomeEstrangeiro) {
    this.nomeEstrangeiro = nomeEstrangeiro;
    return this;
  }

 /**
   * CPF do condutor&lt;br&gt;Tamanho: 11&lt;br&gt;Formato: NNNNNNNNNNN&lt;br&gt;Deve ser informado somente quando nomeCondutorEstrangeiro não for informado. 
   * @return cpfCondutor
  **/
  @JsonProperty("cpfCondutor")
  public String getCpfCondutor() {
    return cpfCondutor;
  }

  public void setCpfCondutor(String cpfCondutor) {
    this.cpfCondutor = cpfCondutor;
  }

  public Transportador cpfCondutor(String cpfCondutor) {
    this.cpfCondutor = cpfCondutor;
    return this;
  }

 /**
   * Nome do condutor quando for estrangeiro&lt;br&gt;Tamanho: 60&lt;br&gt;Deve ser informado somente quando cpfCondutor não for informado.
   * @return nomeCondutorEstrangeiro
  **/
  @JsonProperty("nomeCondutorEstrangeiro")
  public String getNomeCondutorEstrangeiro() {
    return nomeCondutorEstrangeiro;
  }

  public void setNomeCondutorEstrangeiro(String nomeCondutorEstrangeiro) {
    this.nomeCondutorEstrangeiro = nomeCondutorEstrangeiro;
  }

  public Transportador nomeCondutorEstrangeiro(String nomeCondutorEstrangeiro) {
    this.nomeCondutorEstrangeiro = nomeCondutorEstrangeiro;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Transportador {\n");
    
    sb.append("    cnpj: ").append(toIndentedString(cnpj)).append("\n");
    sb.append("    cpf: ").append(toIndentedString(cpf)).append("\n");
    sb.append("    nomeEstrangeiro: ").append(toIndentedString(nomeEstrangeiro)).append("\n");
    sb.append("    cpfCondutor: ").append(toIndentedString(cpfCondutor)).append("\n");
    sb.append("    nomeCondutorEstrangeiro: ").append(toIndentedString(nomeCondutorEstrangeiro)).append("\n");
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

