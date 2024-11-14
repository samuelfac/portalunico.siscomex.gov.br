package br.gov.siscomex.portalunico.rcnt.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "DadosNavioAgenda", propOrder =
    { "imo", "nome"
})

@XmlRootElement(name="DadosNavioAgenda")
public class DadosNavioAgenda  {
  
  @XmlElement(name="imo")
  @ApiModelProperty(value = "Código IMO do navio de embarque ou desembarque da carga conforme tabela de domínio EMBARCAÇÃO disponível no acesso público do sistema <a href=https://www.mercante.transportes.gov.br/g36127/servlet/serpro.siscomex.mercante.servlet.MercanteController rel=\"noopener noreferrer\" target=\"_blank\">Mercante</a> Pode ser nulo quando o evento for de exclusão.<font color=\"red\"><strong><br/>(!)</strong></font>É obrigatório informar o valor para pelo menos um dos seguintes grupos de atributos: ('navio.imo', 'navio.nome' e 'escala') ou ('iataAeronave', 'prefixoAeronave' e 'voo')<br/>Tamanho: 10")
 /**
   * Código IMO do navio de embarque ou desembarque da carga conforme tabela de domínio EMBARCAÇÃO disponível no acesso público do sistema <a href=https://www.mercante.transportes.gov.br/g36127/servlet/serpro.siscomex.mercante.servlet.MercanteController rel=\"noopener noreferrer\" target=\"_blank\">Mercante</a> Pode ser nulo quando o evento for de exclusão.<font color=\"red\"><strong><br/>(!)</strong></font>É obrigatório informar o valor para pelo menos um dos seguintes grupos de atributos: ('navio.imo', 'navio.nome' e 'escala') ou ('iataAeronave', 'prefixoAeronave' e 'voo')<br/>Tamanho: 10
  **/
  private String imo = null;

  @XmlElement(name="nome")
  @ApiModelProperty(value = "Nome do navio de embarque ou desembarque da carga. Pode ser nulo quando o evento for de exclusão.<font color=\"red\"><strong><br/>(!)</strong></font>É obrigatório informar o valor para pelo menos um dos seguintes grupos de atributos: ('navio.imo', 'navio.nome' e 'escala') ou ('iataAeronave', 'prefixoAeronave' e 'voo')<br/>Tamanho: 100")
 /**
   * Nome do navio de embarque ou desembarque da carga. Pode ser nulo quando o evento for de exclusão.<font color=\"red\"><strong><br/>(!)</strong></font>É obrigatório informar o valor para pelo menos um dos seguintes grupos de atributos: ('navio.imo', 'navio.nome' e 'escala') ou ('iataAeronave', 'prefixoAeronave' e 'voo')<br/>Tamanho: 100
  **/
  private String nome = null;
 /**
   * Código IMO do navio de embarque ou desembarque da carga conforme tabela de domínio EMBARCAÇÃO disponível no acesso público do sistema &lt;a href&#x3D;https://www.mercante.transportes.gov.br/g36127/servlet/serpro.siscomex.mercante.servlet.MercanteController rel&#x3D;\&quot;noopener noreferrer\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Mercante&lt;/a&gt; Pode ser nulo quando o evento for de exclusão.&lt;font color&#x3D;\&quot;red\&quot;&gt;&lt;strong&gt;&lt;br/&gt;(!)&lt;/strong&gt;&lt;/font&gt;É obrigatório informar o valor para pelo menos um dos seguintes grupos de atributos: (&#39;navio.imo&#39;, &#39;navio.nome&#39; e &#39;escala&#39;) ou (&#39;iataAeronave&#39;, &#39;prefixoAeronave&#39; e &#39;voo&#39;)&lt;br/&gt;Tamanho: 10
   * @return imo
  **/
  @JsonProperty("imo")
  public String getImo() {
    return imo;
  }

  public void setImo(String imo) {
    this.imo = imo;
  }

  public DadosNavioAgenda imo(String imo) {
    this.imo = imo;
    return this;
  }

 /**
   * Nome do navio de embarque ou desembarque da carga. Pode ser nulo quando o evento for de exclusão.&lt;font color&#x3D;\&quot;red\&quot;&gt;&lt;strong&gt;&lt;br/&gt;(!)&lt;/strong&gt;&lt;/font&gt;É obrigatório informar o valor para pelo menos um dos seguintes grupos de atributos: (&#39;navio.imo&#39;, &#39;navio.nome&#39; e &#39;escala&#39;) ou (&#39;iataAeronave&#39;, &#39;prefixoAeronave&#39; e &#39;voo&#39;)&lt;br/&gt;Tamanho: 100
   * @return nome
  **/
  @JsonProperty("nome")
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public DadosNavioAgenda nome(String nome) {
    this.nome = nome;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DadosNavioAgenda {\n");
    
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

