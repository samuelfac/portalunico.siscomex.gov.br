package br.gov.siscomex.portalunico.rcnt.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "DadosListaNavio", propOrder =
    { "idElemento", "imo", "nome"
})

@XmlRootElement(name="DadosListaNavio")
public class DadosListaNavio  {
  
  @XmlElement(name="idElemento")
  @ApiModelProperty(value = "Identificação de cada elemento da lista.<br/>Tamanho: 40")
 /**
   * Identificação de cada elemento da lista.<br/>Tamanho: 40
  **/
  private String idElemento = null;

  @XmlElement(name="imo")
  @ApiModelProperty(value = "Código IMO do navio de embarque ou desembarque da carga conforme tabela de domínio EMBARCAÇÃO disponível no acesso público do sistema <a href=https://www.mercante.transportes.gov.br/g36127/servlet/serpro.siscomex.mercante.servlet.MercanteController rel=\"noopener noreferrer\" target=\"_blank\">Mercante</a><br/>Tamanho: 10")
 /**
   * Código IMO do navio de embarque ou desembarque da carga conforme tabela de domínio EMBARCAÇÃO disponível no acesso público do sistema <a href=https://www.mercante.transportes.gov.br/g36127/servlet/serpro.siscomex.mercante.servlet.MercanteController rel=\"noopener noreferrer\" target=\"_blank\">Mercante</a><br/>Tamanho: 10
  **/
  private String imo = null;

  @XmlElement(name="nome")
  @ApiModelProperty(value = " Nome do navio de embarque ou desembarque da carga.<br/>Tamanho: 100")
 /**
   *  Nome do navio de embarque ou desembarque da carga.<br/>Tamanho: 100
  **/
  private String nome = null;
 /**
   * Identificação de cada elemento da lista.&lt;br/&gt;Tamanho: 40
   * @return idElemento
  **/
  @JsonProperty("idElemento")
  public String getIdElemento() {
    return idElemento;
  }

  public void setIdElemento(String idElemento) {
    this.idElemento = idElemento;
  }

  public DadosListaNavio idElemento(String idElemento) {
    this.idElemento = idElemento;
    return this;
  }

 /**
   * Código IMO do navio de embarque ou desembarque da carga conforme tabela de domínio EMBARCAÇÃO disponível no acesso público do sistema &lt;a href&#x3D;https://www.mercante.transportes.gov.br/g36127/servlet/serpro.siscomex.mercante.servlet.MercanteController rel&#x3D;\&quot;noopener noreferrer\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Mercante&lt;/a&gt;&lt;br/&gt;Tamanho: 10
   * @return imo
  **/
  @JsonProperty("imo")
  public String getImo() {
    return imo;
  }

  public void setImo(String imo) {
    this.imo = imo;
  }

  public DadosListaNavio imo(String imo) {
    this.imo = imo;
    return this;
  }

 /**
   *  Nome do navio de embarque ou desembarque da carga.&lt;br/&gt;Tamanho: 100
   * @return nome
  **/
  @JsonProperty("nome")
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public DadosListaNavio nome(String nome) {
    this.nome = nome;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DadosListaNavio {\n");
    
    sb.append("    idElemento: ").append(toIndentedString(idElemento)).append("\n");
    sb.append("    imo: ").append(toIndentedString(imo)).append("\n");
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

