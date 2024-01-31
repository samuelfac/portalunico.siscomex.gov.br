package br.gov.siscomex.portalunico.tabx.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "DadosTabelaApiRepresentation", propOrder =
    { "nomeTabela", "dados"
})

@XmlRootElement(name="DadosTabelaApiRepresentation")
public class DadosTabelaApiRepresentation  {
  
  @XmlElement(name="nomeTabela", required = true)
  @ApiModelProperty(example = "GRUPO_EXIGENCIA", required = true, value = "Nome da tabela.<br>Tamanho mínimo: 1<br>Tamanho máximo: 50")
 /**
   * Nome da tabela.<br>Tamanho mínimo: 1<br>Tamanho máximo: 50
  **/
  private String nomeTabela = null;

  @XmlElement(name="dados")
  @ApiModelProperty(value = "Dados da tabela.")
  @Valid
 /**
   * Dados da tabela.
  **/
  private List<DadoTabelaApiRepresentation> dados = null;
 /**
   * Nome da tabela.&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 50
   * @return nomeTabela
  **/
  @JsonProperty("nomeTabela")
  @NotNull
  public String getNomeTabela() {
    return nomeTabela;
  }

  public void setNomeTabela(String nomeTabela) {
    this.nomeTabela = nomeTabela;
  }

  public DadosTabelaApiRepresentation nomeTabela(String nomeTabela) {
    this.nomeTabela = nomeTabela;
    return this;
  }

 /**
   * Dados da tabela.
   * @return dados
  **/
  @JsonProperty("dados")
  public List<DadoTabelaApiRepresentation> getDados() {
    return dados;
  }

  public void setDados(List<DadoTabelaApiRepresentation> dados) {
    this.dados = dados;
  }

  public DadosTabelaApiRepresentation dados(List<DadoTabelaApiRepresentation> dados) {
    this.dados = dados;
    return this;
  }

  public DadosTabelaApiRepresentation addDadosItem(DadoTabelaApiRepresentation dadosItem) {
    this.dados.add(dadosItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DadosTabelaApiRepresentation {\n");
    
    sb.append("    nomeTabela: ").append(toIndentedString(nomeTabela)).append("\n");
    sb.append("    dados: ").append(toIndentedString(dados)).append("\n");
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

