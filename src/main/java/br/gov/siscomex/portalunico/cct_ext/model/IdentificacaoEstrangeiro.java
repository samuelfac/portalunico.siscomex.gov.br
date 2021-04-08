package br.gov.siscomex.portalunico.cct_ext.model;

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
 @XmlType(name = "IdentificacaoEstrangeiro", propOrder =
    { "pais", "nome"
})

@XmlRootElement(name="IdentificacaoEstrangeiro")
/**
  * Dados do Destinatário Estrangeiro
 **/
@ApiModel(description="Dados do Destinatário Estrangeiro")
public class IdentificacaoEstrangeiro  {
  
  @XmlElement(name="pais", required = true)
  @ApiModelProperty(example = "AR", required = true, value = "País do Transportador<br>Sigla ISO/Alfa 2 do país<br>Tamanho: 2<br>Formato: AA")
 /**
   * País do Transportador<br>Sigla ISO/Alfa 2 do país<br>Tamanho: 2<br>Formato: AA
  **/
  private String pais = null;

  @XmlElement(name="nome", required = true)
  @ApiModelProperty(example = "Nome do destinatário", required = true, value = "Nome do destinatário<br>Tamanho: 60")
 /**
   * Nome do destinatário<br>Tamanho: 60
  **/
  private String nome = null;
 /**
   * País do Transportador&lt;br&gt;Sigla ISO/Alfa 2 do país&lt;br&gt;Tamanho: 2&lt;br&gt;Formato: AA
   * @return pais
  **/
  @JsonProperty("pais")
  @NotNull
  public String getPais() {
    return pais;
  }

  public void setPais(String pais) {
    this.pais = pais;
  }

  public IdentificacaoEstrangeiro pais(String pais) {
    this.pais = pais;
    return this;
  }

 /**
   * Nome do destinatário&lt;br&gt;Tamanho: 60
   * @return nome
  **/
  @JsonProperty("nome")
  @NotNull
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public IdentificacaoEstrangeiro nome(String nome) {
    this.nome = nome;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentificacaoEstrangeiro {\n");
    
    sb.append("    pais: ").append(toIndentedString(pais)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
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

