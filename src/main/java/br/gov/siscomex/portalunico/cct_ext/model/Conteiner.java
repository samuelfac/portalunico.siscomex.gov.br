package br.gov.siscomex.portalunico.cct_ext.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
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
 @XmlType(name = "Conteiner", propOrder =
    { "numeroConteiner", "pesoAferido", "tara", "motivoNaoPesagem", "lacres"
})

@XmlRootElement(name="Conteiner")
/**
  * Dados do contêiner
 **/
@ApiModel(description="Dados do contêiner")
public class Conteiner  {
  
  @XmlElement(name="numeroConteiner", required = true)
  @ApiModelProperty(example = "CONT000001", required = true, value = "Número do contêiner<br>Tamanho: 20<br>Formato: AAAAAAAAAAAAAAAAAAAA")
 /**
   * Número do contêiner<br>Tamanho: 20<br>Formato: AAAAAAAAAAAAAAAAAAAA
  **/
  private String numeroConteiner = null;

  @XmlElement(name="pesoAferido")
  @ApiModelProperty(example = "123.123", value = "Peso aferido<br>Tamanho: 9,3")
  @Valid
 /**
   * Peso aferido<br>Tamanho: 9,3
  **/
  private BigDecimal pesoAferido = null;

  @XmlElement(name="tara", required = true)
  @ApiModelProperty(example = "23.0", required = true, value = "Valor da tara informada<br>Tamanho: 12.3<br>Formato: Decimal, com três casas decimais separadas por ponto")
  @Valid
 /**
   * Valor da tara informada<br>Tamanho: 12.3<br>Formato: Decimal, com três casas decimais separadas por ponto
  **/
  private BigDecimal tara = null;

  @XmlElement(name="motivoNaoPesagem")
  @ApiModelProperty(example = "balança quebrada", value = "Motivo da não pesagem<br>Tamanho: 250")
 /**
   * Motivo da não pesagem<br>Tamanho: 250
  **/
  private String motivoNaoPesagem = null;

  @XmlElement(name="lacres", required = true)
  @ApiModelProperty(example = "[123456,654321]", required = true, value = "Lista com os códigos dos lacres vinculados ao contêiner<br>Tamanho: 15")
 /**
   * Lista com os códigos dos lacres vinculados ao contêiner<br>Tamanho: 15
  **/
  private List<String> lacres = new ArrayList<>();
 /**
   * Número do contêiner&lt;br&gt;Tamanho: 20&lt;br&gt;Formato: AAAAAAAAAAAAAAAAAAAA
   * @return numeroConteiner
  **/
  @JsonProperty("numeroConteiner")
  @NotNull
  public String getNumeroConteiner() {
    return numeroConteiner;
  }

  public void setNumeroConteiner(String numeroConteiner) {
    this.numeroConteiner = numeroConteiner;
  }

  public Conteiner numeroConteiner(String numeroConteiner) {
    this.numeroConteiner = numeroConteiner;
    return this;
  }

 /**
   * Peso aferido&lt;br&gt;Tamanho: 9,3
   * @return pesoAferido
  **/
  @JsonProperty("pesoAferido")
  public BigDecimal getPesoAferido() {
    return pesoAferido;
  }

  public void setPesoAferido(BigDecimal pesoAferido) {
    this.pesoAferido = pesoAferido;
  }

  public Conteiner pesoAferido(BigDecimal pesoAferido) {
    this.pesoAferido = pesoAferido;
    return this;
  }

 /**
   * Valor da tara informada&lt;br&gt;Tamanho: 12.3&lt;br&gt;Formato: Decimal, com três casas decimais separadas por ponto
   * @return tara
  **/
  @JsonProperty("tara")
  @NotNull
  public BigDecimal getTara() {
    return tara;
  }

  public void setTara(BigDecimal tara) {
    this.tara = tara;
  }

  public Conteiner tara(BigDecimal tara) {
    this.tara = tara;
    return this;
  }

 /**
   * Motivo da não pesagem&lt;br&gt;Tamanho: 250
   * @return motivoNaoPesagem
  **/
  @JsonProperty("motivoNaoPesagem")
  public String getMotivoNaoPesagem() {
    return motivoNaoPesagem;
  }

  public void setMotivoNaoPesagem(String motivoNaoPesagem) {
    this.motivoNaoPesagem = motivoNaoPesagem;
  }

  public Conteiner motivoNaoPesagem(String motivoNaoPesagem) {
    this.motivoNaoPesagem = motivoNaoPesagem;
    return this;
  }

 /**
   * Lista com os códigos dos lacres vinculados ao contêiner&lt;br&gt;Tamanho: 15
   * @return lacres
  **/
  @JsonProperty("lacres")
  @NotNull
  public List<String> getLacres() {
    return lacres;
  }

  public void setLacres(List<String> lacres) {
    this.lacres = lacres;
  }

  public Conteiner lacres(List<String> lacres) {
    this.lacres = lacres;
    return this;
  }

  public Conteiner addLacresItem(String lacresItem) {
    this.lacres.add(lacresItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Conteiner {\n");
    
    sb.append("    numeroConteiner: ").append(toIndentedString(numeroConteiner)).append("\n");
    sb.append("    pesoAferido: ").append(toIndentedString(pesoAferido)).append("\n");
    sb.append("    tara: ").append(toIndentedString(tara)).append("\n");
    sb.append("    motivoNaoPesagem: ").append(toIndentedString(motivoNaoPesagem)).append("\n");
    sb.append("    lacres: ").append(toIndentedString(lacres)).append("\n");
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

