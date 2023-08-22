package br.gov.siscomex.portalunico.cct_ext.model;

import br.gov.siscomex.portalunico.cct_ext.model.ItemNFEEstoque;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
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
 @XmlType(name = "EstoqueNFE", propOrder =
    { "numero", "urf", "recinto", "latitude", "longitude", "registro", "responsavel", "pesoAferido", "motivoNaoPesagem", "itens"
})

@XmlRootElement(name="EstoqueNFE")
/**
  * Estoque da Nota Fiscal Eletrônica
 **/
@ApiModel(description="Estoque da Nota Fiscal Eletrônica")
public class EstoqueNFE  {
  
  @XmlElement(name="numero")
  @ApiModelProperty(example = "20161016175341723460934170526686662814689781", value = "Chave de Acesso da Nota Fiscal Eletrônica<br>Tamanho: 44<br>Formato: NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN")
 /**
   * Chave de Acesso da Nota Fiscal Eletrônica<br>Tamanho: 44<br>Formato: NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN
  **/
  private String numero = null;

  @XmlElement(name="urf")
  @ApiModelProperty(example = "0817600", value = "Código da unidade da Receita Federal onde está estocada a nota<br>Tamanho: 7<br>Formato: NNNNNNN<br>Domínio: Tabela de Unidades da RFB de Despacho")
 /**
   * Código da unidade da Receita Federal onde está estocada a nota<br>Tamanho: 7<br>Formato: NNNNNNN<br>Domínio: Tabela de Unidades da RFB de Despacho
  **/
  private String urf = null;

  @XmlElement(name="recinto")
  @ApiModelProperty(example = "8911101", value = "Código do recinto aduaneiro onde está estocada a nota<br>Tamanho: 7<br>Formato: NNNNNNN<br>Domínio: Tabela de Recintos Alfandegados.")
 /**
   * Código do recinto aduaneiro onde está estocada a nota<br>Tamanho: 7<br>Formato: NNNNNNN<br>Domínio: Tabela de Recintos Alfandegados.
  **/
  private String recinto = null;

  @XmlElement(name="latitude")
  @ApiModelProperty(example = "-22.812222", value = "Latitude do local<br>Coordenadas geográficas em graus decimais<br>Formato: NN.NNNNNNN ou -NN.NNNNNNN")
 /**
   * Latitude do local<br>Coordenadas geográficas em graus decimais<br>Formato: NN.NNNNNNN ou -NN.NNNNNNN
  **/
  private String latitude = null;

  @XmlElement(name="longitude")
  @ApiModelProperty(example = "-43.248333", value = "Longitude do local<br>Coordenadas geográficas em graus decimais<br>Formato: NN.NNNNNNN ou -NN.NNNNNNN")
 /**
   * Longitude do local<br>Coordenadas geográficas em graus decimais<br>Formato: NN.NNNNNNN ou -NN.NNNNNNN
  **/
  private String longitude = null;

  @XmlElement(name="registro")
  @ApiModelProperty(value = "Data do registro em estoque<br>Formato: AAAA-MM-DD")
 /**
   * Data do registro em estoque<br>Formato: AAAA-MM-DD
  **/
  private OffsetDateTime registro = null;

  @XmlElement(name="responsavel")
  @ApiModelProperty(example = "15573459000106", value = "CPF ou CNPJ do responsável pelo estoque<br>Tamanho máximo: 14<br>Formato: NNNNNNNNNNNNNN")
 /**
   * CPF ou CNPJ do responsável pelo estoque<br>Tamanho máximo: 14<br>Formato: NNNNNNNNNNNNNN
  **/
  private String responsavel = null;

  @XmlElement(name="pesoAferido")
  @ApiModelProperty(example = "100.0", value = "Peso aferido na recepção em Kg<br>Tamanho: 12.3<br>Formato: NNNNNNNNNNNN.NNN")
  @Valid
 /**
   * Peso aferido na recepção em Kg<br>Tamanho: 12.3<br>Formato: NNNNNNNNNNNN.NNN
  **/
  private BigDecimal pesoAferido = null;

  @XmlElement(name="motivoNaoPesagem")
  @ApiModelProperty(example = "Motivo da não realização da pesagem", value = "Motivo da não pesagem na recepção<br>Tamanho: 250")
 /**
   * Motivo da não pesagem na recepção<br>Tamanho: 250
  **/
  private String motivoNaoPesagem = null;

  @XmlElement(name="itens")
  @ApiModelProperty(value = "Itens da Nota Fiscal")
  @Valid
 /**
   * Itens da Nota Fiscal
  **/
  private List<ItemNFEEstoque> itens = null;
 /**
   * Chave de Acesso da Nota Fiscal Eletrônica&lt;br&gt;Tamanho: 44&lt;br&gt;Formato: NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN
   * @return numero
  **/
  @JsonProperty("numero")
  public String getNumero() {
    return numero;
  }

  public void setNumero(String numero) {
    this.numero = numero;
  }

  public EstoqueNFE numero(String numero) {
    this.numero = numero;
    return this;
  }

 /**
   * Código da unidade da Receita Federal onde está estocada a nota&lt;br&gt;Tamanho: 7&lt;br&gt;Formato: NNNNNNN&lt;br&gt;Domínio: Tabela de Unidades da RFB de Despacho
   * @return urf
  **/
  @JsonProperty("urf")
  public String getUrf() {
    return urf;
  }

  public void setUrf(String urf) {
    this.urf = urf;
  }

  public EstoqueNFE urf(String urf) {
    this.urf = urf;
    return this;
  }

 /**
   * Código do recinto aduaneiro onde está estocada a nota&lt;br&gt;Tamanho: 7&lt;br&gt;Formato: NNNNNNN&lt;br&gt;Domínio: Tabela de Recintos Alfandegados.
   * @return recinto
  **/
  @JsonProperty("recinto")
  public String getRecinto() {
    return recinto;
  }

  public void setRecinto(String recinto) {
    this.recinto = recinto;
  }

  public EstoqueNFE recinto(String recinto) {
    this.recinto = recinto;
    return this;
  }

 /**
   * Latitude do local&lt;br&gt;Coordenadas geográficas em graus decimais&lt;br&gt;Formato: NN.NNNNNNN ou -NN.NNNNNNN
   * @return latitude
  **/
  @JsonProperty("latitude")
  public String getLatitude() {
    return latitude;
  }

  public void setLatitude(String latitude) {
    this.latitude = latitude;
  }

  public EstoqueNFE latitude(String latitude) {
    this.latitude = latitude;
    return this;
  }

 /**
   * Longitude do local&lt;br&gt;Coordenadas geográficas em graus decimais&lt;br&gt;Formato: NN.NNNNNNN ou -NN.NNNNNNN
   * @return longitude
  **/
  @JsonProperty("longitude")
  public String getLongitude() {
    return longitude;
  }

  public void setLongitude(String longitude) {
    this.longitude = longitude;
  }

  public EstoqueNFE longitude(String longitude) {
    this.longitude = longitude;
    return this;
  }

 /**
   * Data do registro em estoque&lt;br&gt;Formato: AAAA-MM-DD
   * @return registro
  **/
  @JsonProperty("registro")
  public OffsetDateTime getRegistro() {
    return registro;
  }

  public void setRegistro(OffsetDateTime registro) {
    this.registro = registro;
  }

  public EstoqueNFE registro(OffsetDateTime registro) {
    this.registro = registro;
    return this;
  }

 /**
   * CPF ou CNPJ do responsável pelo estoque&lt;br&gt;Tamanho máximo: 14&lt;br&gt;Formato: NNNNNNNNNNNNNN
   * @return responsavel
  **/
  @JsonProperty("responsavel")
  public String getResponsavel() {
    return responsavel;
  }

  public void setResponsavel(String responsavel) {
    this.responsavel = responsavel;
  }

  public EstoqueNFE responsavel(String responsavel) {
    this.responsavel = responsavel;
    return this;
  }

 /**
   * Peso aferido na recepção em Kg&lt;br&gt;Tamanho: 12.3&lt;br&gt;Formato: NNNNNNNNNNNN.NNN
   * @return pesoAferido
  **/
  @JsonProperty("pesoAferido")
  public BigDecimal getPesoAferido() {
    return pesoAferido;
  }

  public void setPesoAferido(BigDecimal pesoAferido) {
    this.pesoAferido = pesoAferido;
  }

  public EstoqueNFE pesoAferido(BigDecimal pesoAferido) {
    this.pesoAferido = pesoAferido;
    return this;
  }

 /**
   * Motivo da não pesagem na recepção&lt;br&gt;Tamanho: 250
   * @return motivoNaoPesagem
  **/
  @JsonProperty("motivoNaoPesagem")
  public String getMotivoNaoPesagem() {
    return motivoNaoPesagem;
  }

  public void setMotivoNaoPesagem(String motivoNaoPesagem) {
    this.motivoNaoPesagem = motivoNaoPesagem;
  }

  public EstoqueNFE motivoNaoPesagem(String motivoNaoPesagem) {
    this.motivoNaoPesagem = motivoNaoPesagem;
    return this;
  }

 /**
   * Itens da Nota Fiscal
   * @return itens
  **/
  @JsonProperty("itens")
  public List<ItemNFEEstoque> getItens() {
    return itens;
  }

  public void setItens(List<ItemNFEEstoque> itens) {
    this.itens = itens;
  }

  public EstoqueNFE itens(List<ItemNFEEstoque> itens) {
    this.itens = itens;
    return this;
  }

  public EstoqueNFE addItensItem(ItemNFEEstoque itensItem) {
    this.itens.add(itensItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EstoqueNFE {\n");
    
    sb.append("    numero: ").append(toIndentedString(numero)).append("\n");
    sb.append("    urf: ").append(toIndentedString(urf)).append("\n");
    sb.append("    recinto: ").append(toIndentedString(recinto)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    registro: ").append(toIndentedString(registro)).append("\n");
    sb.append("    responsavel: ").append(toIndentedString(responsavel)).append("\n");
    sb.append("    pesoAferido: ").append(toIndentedString(pesoAferido)).append("\n");
    sb.append("    motivoNaoPesagem: ").append(toIndentedString(motivoNaoPesagem)).append("\n");
    sb.append("    itens: ").append(toIndentedString(itens)).append("\n");
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

