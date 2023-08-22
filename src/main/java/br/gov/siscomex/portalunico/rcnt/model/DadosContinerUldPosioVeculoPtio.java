package br.gov.siscomex.portalunico.rcnt.model;

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
 @XmlType(name = "DadosContinerUldPosioVeculoPtio", propOrder =
    { "idElemento", "numeroConteiner", "identificacaoUld", "vazio"
})

@XmlRootElement(name="DadosContinerUldPosioVeculoPtio")
public class DadosContinerUldPosioVeculoPtio  {
  
  @XmlElement(name="idElemento", required = true)
  @ApiModelProperty(required = true, value = "Identificação de cada elemento da lista. Este atributo é obrigatório e deve ser único dentro da lista correspondente.<br/>Tamanho: 40")
 /**
   * Identificação de cada elemento da lista. Este atributo é obrigatório e deve ser único dentro da lista correspondente.<br/>Tamanho: 40
  **/
  private String idElemento = null;

  @XmlElement(name="numeroConteiner")
  @ApiModelProperty(value = "Identificação do número do contêiner.<br/>Tamanho: 200")
 /**
   * Identificação do número do contêiner.<br/>Tamanho: 200
  **/
  private String numeroConteiner = null;

  @XmlElement(name="identificacaoUld")
  @ApiModelProperty(example = "AZEB123_AA, AKE21001NZ", value = "Identificação da ULD no formato (TTTNNNNNPP) composta pelos seguintes atributos: Tipo de ULD (3 caracteres - TTT), Número da ULD (5 caracteres - NNNNN - Caso o número tenha menos que 5 caracteres, preencher à direita com o caracter especial \"_\") e Código do proprietário da ULD (2 caracteres - PP).<br/>Tamanho: 10")
 /**
   * Identificação da ULD no formato (TTTNNNNNPP) composta pelos seguintes atributos: Tipo de ULD (3 caracteres - TTT), Número da ULD (5 caracteres - NNNNN - Caso o número tenha menos que 5 caracteres, preencher à direita com o caracter especial \"_\") e Código do proprietário da ULD (2 caracteres - PP).<br/>Tamanho: 10
  **/
  private String identificacaoUld = null;

  @XmlElement(name="vazio")
  @ApiModelProperty(example = "false", value = "Vazio.<br/>Domínio:<br/>true - Sim<br/>false - Não")
 /**
   * Vazio.<br/>Domínio:<br/>true - Sim<br/>false - Não
  **/
  private Boolean vazio = null;
 /**
   * Identificação de cada elemento da lista. Este atributo é obrigatório e deve ser único dentro da lista correspondente.&lt;br/&gt;Tamanho: 40
   * @return idElemento
  **/
  @JsonProperty("idElemento")
  @NotNull
  public String getIdElemento() {
    return idElemento;
  }

  public void setIdElemento(String idElemento) {
    this.idElemento = idElemento;
  }

  public DadosContinerUldPosioVeculoPtio idElemento(String idElemento) {
    this.idElemento = idElemento;
    return this;
  }

 /**
   * Identificação do número do contêiner.&lt;br/&gt;Tamanho: 200
   * @return numeroConteiner
  **/
  @JsonProperty("numeroConteiner")
  public String getNumeroConteiner() {
    return numeroConteiner;
  }

  public void setNumeroConteiner(String numeroConteiner) {
    this.numeroConteiner = numeroConteiner;
  }

  public DadosContinerUldPosioVeculoPtio numeroConteiner(String numeroConteiner) {
    this.numeroConteiner = numeroConteiner;
    return this;
  }

 /**
   * Identificação da ULD no formato (TTTNNNNNPP) composta pelos seguintes atributos: Tipo de ULD (3 caracteres - TTT), Número da ULD (5 caracteres - NNNNN - Caso o número tenha menos que 5 caracteres, preencher à direita com o caracter especial \&quot;_\&quot;) e Código do proprietário da ULD (2 caracteres - PP).&lt;br/&gt;Tamanho: 10
   * @return identificacaoUld
  **/
  @JsonProperty("identificacaoUld")
  public String getIdentificacaoUld() {
    return identificacaoUld;
  }

  public void setIdentificacaoUld(String identificacaoUld) {
    this.identificacaoUld = identificacaoUld;
  }

  public DadosContinerUldPosioVeculoPtio identificacaoUld(String identificacaoUld) {
    this.identificacaoUld = identificacaoUld;
    return this;
  }

 /**
   * Vazio.&lt;br/&gt;Domínio:&lt;br/&gt;true - Sim&lt;br/&gt;false - Não
   * @return vazio
  **/
  @JsonProperty("vazio")
  public Boolean isVazio() {
    return vazio;
  }

  public void setVazio(Boolean vazio) {
    this.vazio = vazio;
  }

  public DadosContinerUldPosioVeculoPtio vazio(Boolean vazio) {
    this.vazio = vazio;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DadosContinerUldPosioVeculoPtio {\n");
    
    sb.append("    idElemento: ").append(toIndentedString(idElemento)).append("\n");
    sb.append("    numeroConteiner: ").append(toIndentedString(numeroConteiner)).append("\n");
    sb.append("    identificacaoUld: ").append(toIndentedString(identificacaoUld)).append("\n");
    sb.append("    vazio: ").append(toIndentedString(vazio)).append("\n");
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

