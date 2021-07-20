package br.gov.siscomex.portalunico.rcnt.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "DadosDaMercadoriaPerigosa", propOrder =
    { "idElemento", "codigoMercadoriaPerigosa"
})

@XmlRootElement(name="DadosDaMercadoriaPerigosa")
public class DadosDaMercadoriaPerigosa  {
  
  @XmlElement(name="idElemento")
  @ApiModelProperty(value = "Identificação de cada elemento da lista.<br/>Tamanho: 10")
 /**
   * Identificação de cada elemento da lista.<br/>Tamanho: 10
  **/
  private String idElemento = null;

  @XmlElement(name="codigoMercadoriaPerigosa")
  @ApiModelProperty(example = "4", value = "<br/>Código da mercadoria perigosa conforme tabela de domínio MERCADORIA PERIGOSA disponível no acesso público do <a href=https://www35.receita.fazenda.gov.br/tabaduaneiras-web/private/pages/telaInicial.jsf rel=\"noopener noreferrer\" target=\"_blank\">Tabelas Aduaneiras</a><br/>Tamanho: 10")
 /**
   * <br/>Código da mercadoria perigosa conforme tabela de domínio MERCADORIA PERIGOSA disponível no acesso público do <a href=https://www35.receita.fazenda.gov.br/tabaduaneiras-web/private/pages/telaInicial.jsf rel=\"noopener noreferrer\" target=\"_blank\">Tabelas Aduaneiras</a><br/>Tamanho: 10
  **/
  private String codigoMercadoriaPerigosa = null;
 /**
   * Identificação de cada elemento da lista.&lt;br/&gt;Tamanho: 10
   * @return idElemento
  **/
  @JsonProperty("idElemento")
  public String getIdElemento() {
    return idElemento;
  }

  public void setIdElemento(String idElemento) {
    this.idElemento = idElemento;
  }

  public DadosDaMercadoriaPerigosa idElemento(String idElemento) {
    this.idElemento = idElemento;
    return this;
  }

 /**
   * &lt;br/&gt;Código da mercadoria perigosa conforme tabela de domínio MERCADORIA PERIGOSA disponível no acesso público do &lt;a href&#x3D;https://www35.receita.fazenda.gov.br/tabaduaneiras-web/private/pages/telaInicial.jsf rel&#x3D;\&quot;noopener noreferrer\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Tabelas Aduaneiras&lt;/a&gt;&lt;br/&gt;Tamanho: 10
   * @return codigoMercadoriaPerigosa
  **/
  @JsonProperty("codigoMercadoriaPerigosa")
  public String getCodigoMercadoriaPerigosa() {
    return codigoMercadoriaPerigosa;
  }

  public void setCodigoMercadoriaPerigosa(String codigoMercadoriaPerigosa) {
    this.codigoMercadoriaPerigosa = codigoMercadoriaPerigosa;
  }

  public DadosDaMercadoriaPerigosa codigoMercadoriaPerigosa(String codigoMercadoriaPerigosa) {
    this.codigoMercadoriaPerigosa = codigoMercadoriaPerigosa;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DadosDaMercadoriaPerigosa {\n");
    
    sb.append("    idElemento: ").append(toIndentedString(idElemento)).append("\n");
    sb.append("    codigoMercadoriaPerigosa: ").append(toIndentedString(codigoMercadoriaPerigosa)).append("\n");
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

