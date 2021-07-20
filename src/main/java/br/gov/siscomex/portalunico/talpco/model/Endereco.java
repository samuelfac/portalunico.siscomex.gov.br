package br.gov.siscomex.portalunico.talpco.model;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "Endereco", propOrder =
    { "logradouro", "bairro", "municipio", "cep", "uf"
})

@XmlRootElement(name="Endereco")
/**
  * Endereço de uma pessoa física/jurídica
 **/
@ApiModel(description="Endereço de uma pessoa física/jurídica")
public class Endereco  {
  
  @XmlElement(name="logradouro", required = true)
  @ApiModelProperty(example = "Rua das Acácias, 123", required = true, value = "Descrição do logradouro, com número")
 /**
   * Descrição do logradouro, com número
  **/
  private String logradouro = null;

  @XmlElement(name="bairro")
  @ApiModelProperty(example = "Centro", value = "Nome do bairro")
 /**
   * Nome do bairro
  **/
  private String bairro = null;

  @XmlElement(name="municipio")
  @ApiModelProperty(example = "Florianópolis", value = "Nome do município")
 /**
   * Nome do município
  **/
  private String municipio = null;

  @XmlElement(name="cep")
  @ApiModelProperty(example = "99999-999", value = "Código CEP com máscara<br>Tamanho mínimo: 9<br>Tamanho máximo: 9<br>Formato: NNNNN-NNN")
 /**
   * Código CEP com máscara<br>Tamanho mínimo: 9<br>Tamanho máximo: 9<br>Formato: NNNNN-NNN
  **/
  private String cep = null;

  @XmlElement(name="uf")
  @ApiModelProperty(example = "SC", value = "Sigla de unidade federativa<br>Tamanho mínimo: 2<br>Tamanho máximo: 2")
 /**
   * Sigla de unidade federativa<br>Tamanho mínimo: 2<br>Tamanho máximo: 2
  **/
  private String uf = null;
 /**
   * Descrição do logradouro, com número
   * @return logradouro
  **/
  @JsonProperty("logradouro")
  @NotNull
  public String getLogradouro() {
    return logradouro;
  }

  public void setLogradouro(String logradouro) {
    this.logradouro = logradouro;
  }

  public Endereco logradouro(String logradouro) {
    this.logradouro = logradouro;
    return this;
  }

 /**
   * Nome do bairro
   * @return bairro
  **/
  @JsonProperty("bairro")
  public String getBairro() {
    return bairro;
  }

  public void setBairro(String bairro) {
    this.bairro = bairro;
  }

  public Endereco bairro(String bairro) {
    this.bairro = bairro;
    return this;
  }

 /**
   * Nome do município
   * @return municipio
  **/
  @JsonProperty("municipio")
  public String getMunicipio() {
    return municipio;
  }

  public void setMunicipio(String municipio) {
    this.municipio = municipio;
  }

  public Endereco municipio(String municipio) {
    this.municipio = municipio;
    return this;
  }

 /**
   * Código CEP com máscara&lt;br&gt;Tamanho mínimo: 9&lt;br&gt;Tamanho máximo: 9&lt;br&gt;Formato: NNNNN-NNN
   * @return cep
  **/
  @JsonProperty("cep")
  public String getCep() {
    return cep;
  }

  public void setCep(String cep) {
    this.cep = cep;
  }

  public Endereco cep(String cep) {
    this.cep = cep;
    return this;
  }

 /**
   * Sigla de unidade federativa&lt;br&gt;Tamanho mínimo: 2&lt;br&gt;Tamanho máximo: 2
   * @return uf
  **/
  @JsonProperty("uf")
  public String getUf() {
    return uf;
  }

  public void setUf(String uf) {
    this.uf = uf;
  }

  public Endereco uf(String uf) {
    this.uf = uf;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Endereco {\n");
    
    sb.append("    logradouro: ").append(toIndentedString(logradouro)).append("\n");
    sb.append("    bairro: ").append(toIndentedString(bairro)).append("\n");
    sb.append("    municipio: ").append(toIndentedString(municipio)).append("\n");
    sb.append("    cep: ").append(toIndentedString(cep)).append("\n");
    sb.append("    uf: ").append(toIndentedString(uf)).append("\n");
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

