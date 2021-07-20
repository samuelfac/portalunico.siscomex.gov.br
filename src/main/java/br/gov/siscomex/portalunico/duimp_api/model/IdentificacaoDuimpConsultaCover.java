package br.gov.siscomex.portalunico.duimp_api.model;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "IdentificacaoDuimpConsultaCover", propOrder =
    { "numero", "versao", "importador", "dataRegistro", "responsavelRegistroNumero", "informacaoComplementar"
})

@XmlRootElement(name="IdentificacaoDuimpConsultaCover")
/**
  * Dados da identificação da declaração única de importação.
 **/
@ApiModel(description="Dados da identificação da declaração única de importação.")
public class IdentificacaoDuimpConsultaCover  {
  
  @XmlElement(name="numero")
  @ApiModelProperty(example = "19BR00000004677", value = "<br>Tamanho: 15<br>Formato: 'NNAANNNNNNNNNNN'<br>Lei de formação. O número da Duimp é composto por: <br>* NN = Corresponde ao ano do registro da Declaração. <br>* AA = Corresponde à sigla do país de emissão do documento (BR).<br>* NNNNNNNNNN = 10 caracteres númericos. Número sequencial da Duimp dentro do ano.<br>* N = 1 caracter númerico. DV para todos os demais caracteres numéricos (Módulo 11)")
 /**
   * <br>Tamanho: 15<br>Formato: 'NNAANNNNNNNNNNN'<br>Lei de formação. O número da Duimp é composto por: <br>* NN = Corresponde ao ano do registro da Declaração. <br>* AA = Corresponde à sigla do país de emissão do documento (BR).<br>* NNNNNNNNNN = 10 caracteres númericos. Número sequencial da Duimp dentro do ano.<br>* N = 1 caracter númerico. DV para todos os demais caracteres numéricos (Módulo 11)
  **/
  private String numero = null;

  @XmlElement(name="versao")
  @ApiModelProperty(example = "1", value = "Versão da Duimp.<br>Valor mínimo: 1<br>Valor máximo: 9999")
 /**
   * Versão da Duimp.<br>Valor mínimo: 1<br>Valor máximo: 9999
  **/
  private String versao = null;

  @XmlElement(name="importador")
  @ApiModelProperty(value = "")
  @Valid
  private ImportadorCover importador = null;

  @XmlElement(name="dataRegistro")
  @ApiModelProperty(example = "2021-05-25T15:53:18-0300", value = "Data e hora em que a Duimp foi registrada.<br>Formato: 'yyyy-MM-dd'T'HH:mm:ssZ'")
 /**
   * Data e hora em que a Duimp foi registrada.<br>Formato: 'yyyy-MM-dd'T'HH:mm:ssZ'
  **/
  private String dataRegistro = null;

  @XmlElement(name="responsavelRegistroNumero")
  @ApiModelProperty(example = "11365015769", value = "CPF do responsável pela declaração.<br>Formato: 'NNNNNNNNNNN'")
 /**
   * CPF do responsável pela declaração.<br>Formato: 'NNNNNNNNNNN'
  **/
  private String responsavelRegistroNumero = null;

  @XmlElement(name="informacaoComplementar")
  @ApiModelProperty(example = "Texto complementando informações sobre a Duimp.", value = "Descrição complementar da Duimp.<br>Tamanho mínimo: 0<br>Tamanho máximo: 7800")
 /**
   * Descrição complementar da Duimp.<br>Tamanho mínimo: 0<br>Tamanho máximo: 7800
  **/
  private String informacaoComplementar = null;
 /**
   * &lt;br&gt;Tamanho: 15&lt;br&gt;Formato: &#39;NNAANNNNNNNNNNN&#39;&lt;br&gt;Lei de formação. O número da Duimp é composto por: &lt;br&gt;* NN &#x3D; Corresponde ao ano do registro da Declaração. &lt;br&gt;* AA &#x3D; Corresponde à sigla do país de emissão do documento (BR).&lt;br&gt;* NNNNNNNNNN &#x3D; 10 caracteres númericos. Número sequencial da Duimp dentro do ano.&lt;br&gt;* N &#x3D; 1 caracter númerico. DV para todos os demais caracteres numéricos (Módulo 11)
   * @return numero
  **/
  @JsonProperty("numero")
  public String getNumero() {
    return numero;
  }

  public void setNumero(String numero) {
    this.numero = numero;
  }

  public IdentificacaoDuimpConsultaCover numero(String numero) {
    this.numero = numero;
    return this;
  }

 /**
   * Versão da Duimp.&lt;br&gt;Valor mínimo: 1&lt;br&gt;Valor máximo: 9999
   * @return versao
  **/
  @JsonProperty("versao")
  public String getVersao() {
    return versao;
  }

  public void setVersao(String versao) {
    this.versao = versao;
  }

  public IdentificacaoDuimpConsultaCover versao(String versao) {
    this.versao = versao;
    return this;
  }

 /**
   * Get importador
   * @return importador
  **/
  @JsonProperty("importador")
  public ImportadorCover getImportador() {
    return importador;
  }

  public void setImportador(ImportadorCover importador) {
    this.importador = importador;
  }

  public IdentificacaoDuimpConsultaCover importador(ImportadorCover importador) {
    this.importador = importador;
    return this;
  }

 /**
   * Data e hora em que a Duimp foi registrada.&lt;br&gt;Formato: &#39;yyyy-MM-dd&#39;T&#39;HH:mm:ssZ&#39;
   * @return dataRegistro
  **/
  @JsonProperty("dataRegistro")
  public String getDataRegistro() {
    return dataRegistro;
  }

  public void setDataRegistro(String dataRegistro) {
    this.dataRegistro = dataRegistro;
  }

  public IdentificacaoDuimpConsultaCover dataRegistro(String dataRegistro) {
    this.dataRegistro = dataRegistro;
    return this;
  }

 /**
   * CPF do responsável pela declaração.&lt;br&gt;Formato: &#39;NNNNNNNNNNN&#39;
   * @return responsavelRegistroNumero
  **/
  @JsonProperty("responsavelRegistroNumero")
  public String getResponsavelRegistroNumero() {
    return responsavelRegistroNumero;
  }

  public void setResponsavelRegistroNumero(String responsavelRegistroNumero) {
    this.responsavelRegistroNumero = responsavelRegistroNumero;
  }

  public IdentificacaoDuimpConsultaCover responsavelRegistroNumero(String responsavelRegistroNumero) {
    this.responsavelRegistroNumero = responsavelRegistroNumero;
    return this;
  }

 /**
   * Descrição complementar da Duimp.&lt;br&gt;Tamanho mínimo: 0&lt;br&gt;Tamanho máximo: 7800
   * @return informacaoComplementar
  **/
  @JsonProperty("informacaoComplementar")
  public String getInformacaoComplementar() {
    return informacaoComplementar;
  }

  public void setInformacaoComplementar(String informacaoComplementar) {
    this.informacaoComplementar = informacaoComplementar;
  }

  public IdentificacaoDuimpConsultaCover informacaoComplementar(String informacaoComplementar) {
    this.informacaoComplementar = informacaoComplementar;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentificacaoDuimpConsultaCover {\n");
    
    sb.append("    numero: ").append(toIndentedString(numero)).append("\n");
    sb.append("    versao: ").append(toIndentedString(versao)).append("\n");
    sb.append("    importador: ").append(toIndentedString(importador)).append("\n");
    sb.append("    dataRegistro: ").append(toIndentedString(dataRegistro)).append("\n");
    sb.append("    responsavelRegistroNumero: ").append(toIndentedString(responsavelRegistroNumero)).append("\n");
    sb.append("    informacaoComplementar: ").append(toIndentedString(informacaoComplementar)).append("\n");
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

