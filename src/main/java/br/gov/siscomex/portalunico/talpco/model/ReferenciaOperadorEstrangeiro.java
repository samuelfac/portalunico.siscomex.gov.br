package br.gov.siscomex.portalunico.talpco.model;

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
 @XmlType(name = "ReferenciaOperadorEstrangeiro", propOrder =
    { "codigo", "cpfCnpjRaiz", "codigoPais", "versao"
})

@XmlRootElement(name="ReferenciaOperadorEstrangeiro")
/**
  * Referência a um Operador Estrangeiro referenciado em um LPCO. Pode ser um exportador estrangeiro ou um fabricante estrangeiro
 **/
@ApiModel(description="Referência a um Operador Estrangeiro referenciado em um LPCO. Pode ser um exportador estrangeiro ou um fabricante estrangeiro")
public class ReferenciaOperadorEstrangeiro  {
  
  @XmlElement(name="codigo", required = true)
  @ApiModelProperty(example = "111222333", required = true, value = "Código do operador estrangeiro.<br>")
 /**
   * Código do operador estrangeiro.<br>
  **/
  private String codigo = null;

  @XmlElement(name="cpfCnpjRaiz", required = true)
  @ApiModelProperty(example = "00055555", required = true, value = "CNPJ raiz do operador estrangeiro.<br>Tamanho: 8")
 /**
   * CNPJ raiz do operador estrangeiro.<br>Tamanho: 8
  **/
  private String cpfCnpjRaiz = null;

  @XmlElement(name="codigoPais", required = true)
  @ApiModelProperty(example = "AR", required = true, value = "Código na Tabela ISO2 do país do operador estrangeiro.<br>Tamanho: 2")
 /**
   * Código na Tabela ISO2 do país do operador estrangeiro.<br>Tamanho: 2
  **/
  private String codigoPais = null;

  @XmlElement(name="versao", required = true)
  @ApiModelProperty(example = "1", required = true, value = "Versão do operador estrangeiro.<br>")
 /**
   * Versão do operador estrangeiro.<br>
  **/
  private String versao = null;
 /**
   * Código do operador estrangeiro.&lt;br&gt;
   * @return codigo
  **/
  @JsonProperty("codigo")
  @NotNull
  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public ReferenciaOperadorEstrangeiro codigo(String codigo) {
    this.codigo = codigo;
    return this;
  }

 /**
   * CNPJ raiz do operador estrangeiro.&lt;br&gt;Tamanho: 8
   * @return cpfCnpjRaiz
  **/
  @JsonProperty("cpfCnpjRaiz")
  @NotNull
  public String getCpfCnpjRaiz() {
    return cpfCnpjRaiz;
  }

  public void setCpfCnpjRaiz(String cpfCnpjRaiz) {
    this.cpfCnpjRaiz = cpfCnpjRaiz;
  }

  public ReferenciaOperadorEstrangeiro cpfCnpjRaiz(String cpfCnpjRaiz) {
    this.cpfCnpjRaiz = cpfCnpjRaiz;
    return this;
  }

 /**
   * Código na Tabela ISO2 do país do operador estrangeiro.&lt;br&gt;Tamanho: 2
   * @return codigoPais
  **/
  @JsonProperty("codigoPais")
  @NotNull
  public String getCodigoPais() {
    return codigoPais;
  }

  public void setCodigoPais(String codigoPais) {
    this.codigoPais = codigoPais;
  }

  public ReferenciaOperadorEstrangeiro codigoPais(String codigoPais) {
    this.codigoPais = codigoPais;
    return this;
  }

 /**
   * Versão do operador estrangeiro.&lt;br&gt;
   * @return versao
  **/
  @JsonProperty("versao")
  @NotNull
  public String getVersao() {
    return versao;
  }

  public void setVersao(String versao) {
    this.versao = versao;
  }

  public ReferenciaOperadorEstrangeiro versao(String versao) {
    this.versao = versao;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReferenciaOperadorEstrangeiro {\n");
    
    sb.append("    codigo: ").append(toIndentedString(codigo)).append("\n");
    sb.append("    cpfCnpjRaiz: ").append(toIndentedString(cpfCnpjRaiz)).append("\n");
    sb.append("    codigoPais: ").append(toIndentedString(codigoPais)).append("\n");
    sb.append("    versao: ").append(toIndentedString(versao)).append("\n");
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

