package br.gov.siscomex.portalunico.tabx.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "FiltroCampoApiRepresentation", propOrder =
    { "nomeTabela", "nome", "valores"
})

@XmlRootElement(name="FiltroCampoApiRepresentation")
public class FiltroCampoApiRepresentation  {
  
  @XmlElement(name="nomeTabela", required = true)
  @ApiModelProperty(example = "GRUPO_EXIGENCIA", required = true, value = "Nome da tabela.")
 /**
   * Nome da tabela.
  **/
  private String nomeTabela = null;

  @XmlElement(name="nome", required = true)
  @ApiModelProperty(example = "CODIGO", required = true, value = "Nome do campo.")
 /**
   * Nome do campo.
  **/
  private String nome = null;

  @XmlElement(name="valores", required = true)
  @ApiModelProperty(example = "[\"01\",\"02\"]", required = true, value = "Valores atribuído ao filtro.")
 /**
   * Valores atribuído ao filtro.
  **/
  private List<String> valores = new ArrayList<>();
 /**
   * Nome da tabela.
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

  public FiltroCampoApiRepresentation nomeTabela(String nomeTabela) {
    this.nomeTabela = nomeTabela;
    return this;
  }

 /**
   * Nome do campo.
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

  public FiltroCampoApiRepresentation nome(String nome) {
    this.nome = nome;
    return this;
  }

 /**
   * Valores atribuído ao filtro.
   * @return valores
  **/
  @JsonProperty("valores")
  @NotNull
  public List<String> getValores() {
    return valores;
  }

  public void setValores(List<String> valores) {
    this.valores = valores;
  }

  public FiltroCampoApiRepresentation valores(List<String> valores) {
    this.valores = valores;
    return this;
  }

  public FiltroCampoApiRepresentation addValoresItem(String valoresItem) {
    this.valores.add(valoresItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FiltroCampoApiRepresentation {\n");
    
    sb.append("    nomeTabela: ").append(toIndentedString(nomeTabela)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    valores: ").append(toIndentedString(valores)).append("\n");
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

