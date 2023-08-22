package br.gov.siscomex.portalunico.cct_ext.model;

import br.gov.siscomex.portalunico.cct_ext.model.TransitoSimplificado;
import io.swagger.v3.oas.annotations.media.Schema;
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
 @XmlType(name = "Recebedor", propOrder =
    { "cnpj", "cpf", "nomeEstrangeiro", "viaTransporte", "baldeacaoOuTransbordo", "transitoSimplificado"
})

@XmlRootElement(name="Recebedor")
/**
  * Dados do interveniente que está recebendo a carga
 **/
@ApiModel(description="Dados do interveniente que está recebendo a carga")
public class Recebedor  {
  
  @XmlElement(name="cnpj", required = true)
  @ApiModelProperty(example = "15573459000106", required = true, value = "CNPJ do recebedor<br>Tamanho: 14<br>Formato: NNNNNNNNNNNNNN<br>Informado apenas quando o recebedor for nacional e pessoa jurídica.")
 /**
   * CNPJ do recebedor<br>Tamanho: 14<br>Formato: NNNNNNNNNNNNNN<br>Informado apenas quando o recebedor for nacional e pessoa jurídica.
  **/
  private String cnpj = null;

  @XmlElement(name="cpf", required = true)
  @ApiModelProperty(example = "15573459106", required = true, value = "CPF do recebedor<br>Tamanho: 11<br>Formato: NNNNNNNNNNN<br>Informado apenas quando o recebedor for nacional e pessoa física.")
 /**
   * CPF do recebedor<br>Tamanho: 11<br>Formato: NNNNNNNNNNN<br>Informado apenas quando o recebedor for nacional e pessoa física.
  **/
  private String cpf = null;

  @XmlElement(name="nomeEstrangeiro", required = true)
  @ApiModelProperty(example = "Nome Estrangeiro", required = true, value = "Nome do recebedor<br>Tamanho: 60<br>Informado apenas quando o recebedor for estrangeiro.")
 /**
   * Nome do recebedor<br>Tamanho: 60<br>Informado apenas quando o recebedor for estrangeiro.
  **/
  private String nomeEstrangeiro = null;

  @XmlElement(name="viaTransporte")
  @ApiModelProperty(example = "1", value = "Código da via de transporte<br>Tamanho: 2<bb>Formato: NN")
 /**
   * Código da via de transporte<br>Tamanho: 2<bb>Formato: NN
  **/
  private Integer viaTransporte = null;

  @XmlElement(name="baldeacaoOuTransbordo")
  @ApiModelProperty(example = "N", value = "Indicador de baldeação ou transbordo<br>Domínio: S (Sim), N (Não). Quando este atributo for preenchido com 'S' fica configurada a situação de trânsito especial. Deve ser informado como 'S' apenas quando um depositário de uma recinto de zona primária (ou um operador portuário) estiver entregando a carga para um transportador de via aérea ou aquaviária. Não pode ser informado junto com o Trânsito Simplificado.")
 /**
   * Indicador de baldeação ou transbordo<br>Domínio: S (Sim), N (Não). Quando este atributo for preenchido com 'S' fica configurada a situação de trânsito especial. Deve ser informado como 'S' apenas quando um depositário de uma recinto de zona primária (ou um operador portuário) estiver entregando a carga para um transportador de via aérea ou aquaviária. Não pode ser informado junto com o Trânsito Simplificado.
  **/
  private String baldeacaoOuTransbordo = null;

  @XmlElement(name="transitoSimplificado")
  @ApiModelProperty(value = "")
  @Valid
  private TransitoSimplificado transitoSimplificado = null;
 /**
   * CNPJ do recebedor&lt;br&gt;Tamanho: 14&lt;br&gt;Formato: NNNNNNNNNNNNNN&lt;br&gt;Informado apenas quando o recebedor for nacional e pessoa jurídica.
   * @return cnpj
  **/
  @JsonProperty("cnpj")
  @NotNull
  public String getCnpj() {
    return cnpj;
  }

  public void setCnpj(String cnpj) {
    this.cnpj = cnpj;
  }

  public Recebedor cnpj(String cnpj) {
    this.cnpj = cnpj;
    return this;
  }

 /**
   * CPF do recebedor&lt;br&gt;Tamanho: 11&lt;br&gt;Formato: NNNNNNNNNNN&lt;br&gt;Informado apenas quando o recebedor for nacional e pessoa física.
   * @return cpf
  **/
  @JsonProperty("cpf")
  @NotNull
  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public Recebedor cpf(String cpf) {
    this.cpf = cpf;
    return this;
  }

 /**
   * Nome do recebedor&lt;br&gt;Tamanho: 60&lt;br&gt;Informado apenas quando o recebedor for estrangeiro.
   * @return nomeEstrangeiro
  **/
  @JsonProperty("nomeEstrangeiro")
  @NotNull
  public String getNomeEstrangeiro() {
    return nomeEstrangeiro;
  }

  public void setNomeEstrangeiro(String nomeEstrangeiro) {
    this.nomeEstrangeiro = nomeEstrangeiro;
  }

  public Recebedor nomeEstrangeiro(String nomeEstrangeiro) {
    this.nomeEstrangeiro = nomeEstrangeiro;
    return this;
  }

 /**
   * Código da via de transporte&lt;br&gt;Tamanho: 2&lt;bb&gt;Formato: NN
   * @return viaTransporte
  **/
  @JsonProperty("viaTransporte")
  public Integer getViaTransporte() {
    return viaTransporte;
  }

  public void setViaTransporte(Integer viaTransporte) {
    this.viaTransporte = viaTransporte;
  }

  public Recebedor viaTransporte(Integer viaTransporte) {
    this.viaTransporte = viaTransporte;
    return this;
  }

 /**
   * Indicador de baldeação ou transbordo&lt;br&gt;Domínio: S (Sim), N (Não). Quando este atributo for preenchido com &#39;S&#39; fica configurada a situação de trânsito especial. Deve ser informado como &#39;S&#39; apenas quando um depositário de uma recinto de zona primária (ou um operador portuário) estiver entregando a carga para um transportador de via aérea ou aquaviária. Não pode ser informado junto com o Trânsito Simplificado.
   * @return baldeacaoOuTransbordo
  **/
  @JsonProperty("baldeacaoOuTransbordo")
  public String getBaldeacaoOuTransbordo() {
    return baldeacaoOuTransbordo;
  }

  public void setBaldeacaoOuTransbordo(String baldeacaoOuTransbordo) {
    this.baldeacaoOuTransbordo = baldeacaoOuTransbordo;
  }

  public Recebedor baldeacaoOuTransbordo(String baldeacaoOuTransbordo) {
    this.baldeacaoOuTransbordo = baldeacaoOuTransbordo;
    return this;
  }

 /**
   * Get transitoSimplificado
   * @return transitoSimplificado
  **/
  @JsonProperty("transitoSimplificado")
  public TransitoSimplificado getTransitoSimplificado() {
    return transitoSimplificado;
  }

  public void setTransitoSimplificado(TransitoSimplificado transitoSimplificado) {
    this.transitoSimplificado = transitoSimplificado;
  }

  public Recebedor transitoSimplificado(TransitoSimplificado transitoSimplificado) {
    this.transitoSimplificado = transitoSimplificado;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Recebedor {\n");
    
    sb.append("    cnpj: ").append(toIndentedString(cnpj)).append("\n");
    sb.append("    cpf: ").append(toIndentedString(cpf)).append("\n");
    sb.append("    nomeEstrangeiro: ").append(toIndentedString(nomeEstrangeiro)).append("\n");
    sb.append("    viaTransporte: ").append(toIndentedString(viaTransporte)).append("\n");
    sb.append("    baldeacaoOuTransbordo: ").append(toIndentedString(baldeacaoOuTransbordo)).append("\n");
    sb.append("    transitoSimplificado: ").append(toIndentedString(transitoSimplificado)).append("\n");
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

