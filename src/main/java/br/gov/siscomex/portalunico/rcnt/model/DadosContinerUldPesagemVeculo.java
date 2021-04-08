package br.gov.siscomex.portalunico.rcnt.model;

import java.math.BigDecimal;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "DadosContinerUldPesagemVeculo", propOrder =
    { "idElemento", "numeroConteiner", "identificacaoUld", "tipo", "tara"
})

@XmlRootElement(name="DadosContinerUldPesagemVeculo")
public class DadosContinerUldPesagemVeculo  {
  
  @XmlElement(name="idElemento")
  @ApiModelProperty(value = "Identificação de cada elemento da lista.<br/>Tamanho: 40")
 /**
   * Identificação de cada elemento da lista.<br/>Tamanho: 40
  **/
  private String idElemento = null;

  @XmlElement(name="numeroConteiner")
  @ApiModelProperty(value = "Identificação do número do contêiner.<br/>Tamanho: 200")
 /**
   * Identificação do número do contêiner.<br/>Tamanho: 200
  **/
  private String numeroConteiner = null;

  @XmlElement(name="identificacaoUld")
  @ApiModelProperty(example = "AZEB123_AA, AKE21001NZ", value = "Identificação da ULD, no formato (TTTNNNNNPP) composta pelos seguintes atributos: Tipo de ULD (3 caracteres - TTT), Número da ULD (5 caracteres - NNNNN - Caso o número tenha menos que 5 caracteres, preencher à direita com o caracter especial \"_\") e  Código do proprietário da ULD (2 caracteres - PP). Ex: AZEB123_AA, AKE21001NZ.<br/>Tamanho: 10")
 /**
   * Identificação da ULD, no formato (TTTNNNNNPP) composta pelos seguintes atributos: Tipo de ULD (3 caracteres - TTT), Número da ULD (5 caracteres - NNNNN - Caso o número tenha menos que 5 caracteres, preencher à direita com o caracter especial \"_\") e  Código do proprietário da ULD (2 caracteres - PP). Ex: AZEB123_AA, AKE21001NZ.<br/>Tamanho: 10
  **/
  private String identificacaoUld = null;

  @XmlElement(name="tipo")
  @ApiModelProperty(example = "12U0", value = "Tipo de contêiner conforme tabela de domínio.<br/><a href=\"../pages/exemplos/rcnt/Tipo_Conteiner.pdf\" rel=\"noopener noreferrer\" target=\"_blank\"> Tipo_Conteiner.pdf </a>")
 /**
   * Tipo de contêiner conforme tabela de domínio.<br/><a href=\"../pages/exemplos/rcnt/Tipo_Conteiner.pdf\" rel=\"noopener noreferrer\" target=\"_blank\"> Tipo_Conteiner.pdf </a>
  **/
  private String tipo = null;

  @XmlElement(name="tara")
  @ApiModelProperty(example = "200.0", value = "Tara do contêiner ou ULD.<br/><br/>tara, até 4 casas decimais.")
  @Valid
 /**
   * Tara do contêiner ou ULD.<br/><br/>tara, até 4 casas decimais.
  **/
  private BigDecimal tara = null;
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

  public DadosContinerUldPesagemVeculo idElemento(String idElemento) {
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

  public DadosContinerUldPesagemVeculo numeroConteiner(String numeroConteiner) {
    this.numeroConteiner = numeroConteiner;
    return this;
  }

 /**
   * Identificação da ULD, no formato (TTTNNNNNPP) composta pelos seguintes atributos: Tipo de ULD (3 caracteres - TTT), Número da ULD (5 caracteres - NNNNN - Caso o número tenha menos que 5 caracteres, preencher à direita com o caracter especial \&quot;_\&quot;) e  Código do proprietário da ULD (2 caracteres - PP). Ex: AZEB123_AA, AKE21001NZ.&lt;br/&gt;Tamanho: 10
   * @return identificacaoUld
  **/
  @JsonProperty("identificacaoUld")
  public String getIdentificacaoUld() {
    return identificacaoUld;
  }

  public void setIdentificacaoUld(String identificacaoUld) {
    this.identificacaoUld = identificacaoUld;
  }

  public DadosContinerUldPesagemVeculo identificacaoUld(String identificacaoUld) {
    this.identificacaoUld = identificacaoUld;
    return this;
  }

 /**
   * Tipo de contêiner conforme tabela de domínio.&lt;br/&gt;&lt;a href&#x3D;\&quot;../pages/exemplos/rcnt/Tipo_Conteiner.pdf\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot; target&#x3D;\&quot;_blank\&quot;&gt; Tipo_Conteiner.pdf &lt;/a&gt;
   * @return tipo
  **/
  @JsonProperty("tipo")
  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public DadosContinerUldPesagemVeculo tipo(String tipo) {
    this.tipo = tipo;
    return this;
  }

 /**
   * Tara do contêiner ou ULD.&lt;br/&gt;&lt;br/&gt;tara, até 4 casas decimais.
   * @return tara
  **/
  @JsonProperty("tara")
  public BigDecimal getTara() {
    return tara;
  }

  public void setTara(BigDecimal tara) {
    this.tara = tara;
  }

  public DadosContinerUldPesagemVeculo tara(BigDecimal tara) {
    this.tara = tara;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DadosContinerUldPesagemVeculo {\n");
    
    sb.append("    idElemento: ").append(toIndentedString(idElemento)).append("\n");
    sb.append("    numeroConteiner: ").append(toIndentedString(numeroConteiner)).append("\n");
    sb.append("    identificacaoUld: ").append(toIndentedString(identificacaoUld)).append("\n");
    sb.append("    tipo: ").append(toIndentedString(tipo)).append("\n");
    sb.append("    tara: ").append(toIndentedString(tara)).append("\n");
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

