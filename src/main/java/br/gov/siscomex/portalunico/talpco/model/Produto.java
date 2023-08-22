package br.gov.siscomex.portalunico.talpco.model;

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
 @XmlType(name = "Produto", propOrder =
    { "codigo", "versao", "cnpjRaiz"
})

@XmlRootElement(name="Produto")
/**
  * Referência a um produto utilizado em um item de um LPCO
 **/
@ApiModel(description="Referência a um produto utilizado em um item de um LPCO")
public class Produto  {
  
  @XmlElement(name="codigo", required = true)
  @ApiModelProperty(example = "12", required = true, value = "Código do produto do item do LPCO")
 /**
   * Código do produto do item do LPCO
  **/
  private Long codigo = null;

  @XmlElement(name="versao", required = true)
  @ApiModelProperty(required = true, value = "Versão do produto")
 /**
   * Versão do produto
  **/
  private String versao = null;

  @XmlElement(name="cnpjRaiz", required = true)
  @ApiModelProperty(example = "33683111", required = true, value = "Raiz do CNPJ do fabricante do produto")
 /**
   * Raiz do CNPJ do fabricante do produto
  **/
  private String cnpjRaiz = null;
 /**
   * Código do produto do item do LPCO
   * @return codigo
  **/
  @JsonProperty("codigo")
  @NotNull
  public Long getCodigo() {
    return codigo;
  }

  public void setCodigo(Long codigo) {
    this.codigo = codigo;
  }

  public Produto codigo(Long codigo) {
    this.codigo = codigo;
    return this;
  }

 /**
   * Versão do produto
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

  public Produto versao(String versao) {
    this.versao = versao;
    return this;
  }

 /**
   * Raiz do CNPJ do fabricante do produto
   * @return cnpjRaiz
  **/
  @JsonProperty("cnpjRaiz")
  @NotNull
  public String getCnpjRaiz() {
    return cnpjRaiz;
  }

  public void setCnpjRaiz(String cnpjRaiz) {
    this.cnpjRaiz = cnpjRaiz;
  }

  public Produto cnpjRaiz(String cnpjRaiz) {
    this.cnpjRaiz = cnpjRaiz;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Produto {\n");
    
    sb.append("    codigo: ").append(toIndentedString(codigo)).append("\n");
    sb.append("    versao: ").append(toIndentedString(versao)).append("\n");
    sb.append("    cnpjRaiz: ").append(toIndentedString(cnpjRaiz)).append("\n");
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

