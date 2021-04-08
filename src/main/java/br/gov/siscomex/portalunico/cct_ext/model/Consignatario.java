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
 @XmlType(name = "Consignatario", propOrder =
    { "indConsignadoAOrdem", "pais", "nome", "endereco"
})

@XmlRootElement(name="Consignatario")
/**
  * Dados do consignatário
 **/
@ApiModel(description="Dados do consignatário")
public class Consignatario  {
  
  @XmlElement(name="indConsignadoAOrdem", required = true)
  @ApiModelProperty(example = "1", required = true, value = "Indicador To Order<br>Domínio: 1 (prepaid), 2 (collect).")
 /**
   * Indicador To Order<br>Domínio: 1 (prepaid), 2 (collect).
  **/
  private String indConsignadoAOrdem = null;

  @XmlElement(name="pais")
  @ApiModelProperty(example = "AR", value = "Sigla do país de origem do consignatário<br>Tamanho: 2<br>Formato: AA<br>Sigla ISO/Alfa 2 do país")
 /**
   * Sigla do país de origem do consignatário<br>Tamanho: 2<br>Formato: AA<br>Sigla ISO/Alfa 2 do país
  **/
  private String pais = null;

  @XmlElement(name="nome")
  @ApiModelProperty(example = "Nome do consignatário", value = "Nome do consignatário<br>Tamanho: 60<br>Não deve ser informado quando o indicador to Order for marcado como S (Sim)")
 /**
   * Nome do consignatário<br>Tamanho: 60<br>Não deve ser informado quando o indicador to Order for marcado como S (Sim)
  **/
  private String nome = null;

  @XmlElement(name="endereco")
  @ApiModelProperty(example = "Endereço do consignatário", value = "Endereço do consignatário<br>Tamanho: 260<br>Não deve ser informado quando o indicador to Order for marcado como S (Sim)")
 /**
   * Endereço do consignatário<br>Tamanho: 260<br>Não deve ser informado quando o indicador to Order for marcado como S (Sim)
  **/
  private String endereco = null;
 /**
   * Indicador To Order&lt;br&gt;Domínio: 1 (prepaid), 2 (collect).
   * @return indConsignadoAOrdem
  **/
  @JsonProperty("indConsignadoAOrdem")
  @NotNull
  public String getIndConsignadoAOrdem() {
    return indConsignadoAOrdem;
  }

  public void setIndConsignadoAOrdem(String indConsignadoAOrdem) {
    this.indConsignadoAOrdem = indConsignadoAOrdem;
  }

  public Consignatario indConsignadoAOrdem(String indConsignadoAOrdem) {
    this.indConsignadoAOrdem = indConsignadoAOrdem;
    return this;
  }

 /**
   * Sigla do país de origem do consignatário&lt;br&gt;Tamanho: 2&lt;br&gt;Formato: AA&lt;br&gt;Sigla ISO/Alfa 2 do país
   * @return pais
  **/
  @JsonProperty("pais")
  public String getPais() {
    return pais;
  }

  public void setPais(String pais) {
    this.pais = pais;
  }

  public Consignatario pais(String pais) {
    this.pais = pais;
    return this;
  }

 /**
   * Nome do consignatário&lt;br&gt;Tamanho: 60&lt;br&gt;Não deve ser informado quando o indicador to Order for marcado como S (Sim)
   * @return nome
  **/
  @JsonProperty("nome")
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Consignatario nome(String nome) {
    this.nome = nome;
    return this;
  }

 /**
   * Endereço do consignatário&lt;br&gt;Tamanho: 260&lt;br&gt;Não deve ser informado quando o indicador to Order for marcado como S (Sim)
   * @return endereco
  **/
  @JsonProperty("endereco")
  public String getEndereco() {
    return endereco;
  }

  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }

  public Consignatario endereco(String endereco) {
    this.endereco = endereco;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Consignatario {\n");
    
    sb.append("    indConsignadoAOrdem: ").append(toIndentedString(indConsignadoAOrdem)).append("\n");
    sb.append("    pais: ").append(toIndentedString(pais)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    endereco: ").append(toIndentedString(endereco)).append("\n");
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

