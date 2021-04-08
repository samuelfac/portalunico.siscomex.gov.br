package br.gov.siscomex.portalunico.rcnt.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "DadosPrximoNavio", propOrder =
    { "imo", "nome"
})

@XmlRootElement(name="DadosPrximoNavio")
/**
  * Nos casos em que há previsão de transbordo ou baldeação de carga, indicar o próximo navio.
 **/
@ApiModel(description="Nos casos em que há previsão de transbordo ou baldeação de carga, indicar o próximo navio.")
public class DadosPrximoNavio  {
  
  @XmlElement(name="imo")
  @ApiModelProperty(value = "Código IMO do navio de embarque ou desembarque da carga conforme tabela de domínio.<br/>Domínio: conforme <a href=\"../pages/exemplos/rcnt/Embarcacao.pdf\" rel=\"noopener noreferrer\" target=\"_blank\"> Embarcacao.pdf </a>")
 /**
   * Código IMO do navio de embarque ou desembarque da carga conforme tabela de domínio.<br/>Domínio: conforme <a href=\"../pages/exemplos/rcnt/Embarcacao.pdf\" rel=\"noopener noreferrer\" target=\"_blank\"> Embarcacao.pdf </a>
  **/
  private String imo = null;

  @XmlElement(name="nome")
  @ApiModelProperty(value = " Nome do navio de embarque ou desembarque da carga.<br/>Tamanho: 100")
 /**
   *  Nome do navio de embarque ou desembarque da carga.<br/>Tamanho: 100
  **/
  private String nome = null;
 /**
   * Código IMO do navio de embarque ou desembarque da carga conforme tabela de domínio.&lt;br/&gt;Domínio: conforme &lt;a href&#x3D;\&quot;../pages/exemplos/rcnt/Embarcacao.pdf\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot; target&#x3D;\&quot;_blank\&quot;&gt; Embarcacao.pdf &lt;/a&gt;
   * @return imo
  **/
  @JsonProperty("imo")
  public String getImo() {
    return imo;
  }

  public void setImo(String imo) {
    this.imo = imo;
  }

  public DadosPrximoNavio imo(String imo) {
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

  public DadosPrximoNavio nome(String nome) {
    this.nome = nome;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DadosPrximoNavio {\n");
    
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

