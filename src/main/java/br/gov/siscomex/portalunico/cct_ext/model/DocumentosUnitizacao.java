package br.gov.siscomex.portalunico.cct_ext.model;

import java.util.List;

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
 @XmlType(name = "DocumentosUnitizacao", propOrder =
    { "numeroDUE", "numeroRUC", "cargaSoltaVeiculo", "granel", "veiculo"
})

@XmlRootElement(name="DocumentosUnitizacao")
/**
  * Lista de documentos envolvidos na unitização
 **/
@ApiModel(description="Lista de documentos envolvidos na unitização")
public class DocumentosUnitizacao  {
  
  @XmlElement(name="numeroDUE")
  @ApiModelProperty(example = "17BR0000451567", value = "Número da DU-E<br>Formato: AABRSSSSSSSSSD<br>Descrição Formato<br>AA - Ano<br>BR - Brasil<br>SSSSSSSSS - Numeração sequencial<br>D - DV<br>Obs: Ao informar o atributo numeroDUE, numeroRUC não poderá ser informado. O número da DU-E não pode ser repetir na lista.")
 /**
   * Número da DU-E<br>Formato: AABRSSSSSSSSSD<br>Descrição Formato<br>AA - Ano<br>BR - Brasil<br>SSSSSSSSS - Numeração sequencial<br>D - DV<br>Obs: Ao informar o atributo numeroDUE, numeroRUC não poderá ser informado. O número da DU-E não pode ser repetir na lista.
  **/
  private String numeroDUE = null;

  @XmlElement(name="numeroRUC")
  @ApiModelProperty(example = "7BR276574827551833214353477473070", value = "Numero da RUC ou RUC Master<br>Tamanho mínimo: 13<br>Tamanho máximo: 35<br>Formato: NAANNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN<br>Obs: Ao informar o atributo numeroDUE, numeroRUC não poderá ser informado. O número da RUC não pode ser repetir na lista.")
 /**
   * Numero da RUC ou RUC Master<br>Tamanho mínimo: 13<br>Tamanho máximo: 35<br>Formato: NAANNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN<br>Obs: Ao informar o atributo numeroDUE, numeroRUC não poderá ser informado. O número da RUC não pode ser repetir na lista.
  **/
  private String numeroRUC = null;

  @XmlElement(name="cargaSoltaVeiculo")
  @ApiModelProperty(value = "Dados informados para carga do tipo solta<br>Informado apenas se houve sobra de solta/veiculo ou granel fora do contêiner.")
  @Valid
 /**
   * Dados informados para carga do tipo solta<br>Informado apenas se houve sobra de solta/veiculo ou granel fora do contêiner.
  **/
  private List<CargaSoltaVeiculo> cargaSoltaVeiculo = null;

  @XmlElement(name="granel")
  @ApiModelProperty(value = "Dados informados para carga do tipo granel<br>Informado apenas se houve sobra de solta/veiculo ou granel fora do contêiner.")
  @Valid
 /**
   * Dados informados para carga do tipo granel<br>Informado apenas se houve sobra de solta/veiculo ou granel fora do contêiner.
  **/
  private List<Granel> granel = null;

  @XmlElement(name="veiculo")
  @ApiModelProperty(value = "Dados informados para carga do tipo veículos<br>Informado apenas se houve sobra de solta/veiculo ou granel fora do contêiner.")
  @Valid
 /**
   * Dados informados para carga do tipo veículos<br>Informado apenas se houve sobra de solta/veiculo ou granel fora do contêiner.
  **/
  private List<Veiculo> veiculo = null;
 /**
   * Número da DU-E&lt;br&gt;Formato: AABRSSSSSSSSSD&lt;br&gt;Descrição Formato&lt;br&gt;AA - Ano&lt;br&gt;BR - Brasil&lt;br&gt;SSSSSSSSS - Numeração sequencial&lt;br&gt;D - DV&lt;br&gt;Obs: Ao informar o atributo numeroDUE, numeroRUC não poderá ser informado. O número da DU-E não pode ser repetir na lista.
   * @return numeroDUE
  **/
  @JsonProperty("numeroDUE")
  public String getNumeroDUE() {
    return numeroDUE;
  }

  public void setNumeroDUE(String numeroDUE) {
    this.numeroDUE = numeroDUE;
  }

  public DocumentosUnitizacao numeroDUE(String numeroDUE) {
    this.numeroDUE = numeroDUE;
    return this;
  }

 /**
   * Numero da RUC ou RUC Master&lt;br&gt;Tamanho mínimo: 13&lt;br&gt;Tamanho máximo: 35&lt;br&gt;Formato: NAANNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN&lt;br&gt;Obs: Ao informar o atributo numeroDUE, numeroRUC não poderá ser informado. O número da RUC não pode ser repetir na lista.
   * @return numeroRUC
  **/
  @JsonProperty("numeroRUC")
  public String getNumeroRUC() {
    return numeroRUC;
  }

  public void setNumeroRUC(String numeroRUC) {
    this.numeroRUC = numeroRUC;
  }

  public DocumentosUnitizacao numeroRUC(String numeroRUC) {
    this.numeroRUC = numeroRUC;
    return this;
  }

 /**
   * Dados informados para carga do tipo solta&lt;br&gt;Informado apenas se houve sobra de solta/veiculo ou granel fora do contêiner.
   * @return cargaSoltaVeiculo
  **/
  @JsonProperty("cargaSoltaVeiculo")
  public List<CargaSoltaVeiculo> getCargaSoltaVeiculo() {
    return cargaSoltaVeiculo;
  }

  public void setCargaSoltaVeiculo(List<CargaSoltaVeiculo> cargaSoltaVeiculo) {
    this.cargaSoltaVeiculo = cargaSoltaVeiculo;
  }

  public DocumentosUnitizacao cargaSoltaVeiculo(List<CargaSoltaVeiculo> cargaSoltaVeiculo) {
    this.cargaSoltaVeiculo = cargaSoltaVeiculo;
    return this;
  }

  public DocumentosUnitizacao addCargaSoltaVeiculoItem(CargaSoltaVeiculo cargaSoltaVeiculoItem) {
    this.cargaSoltaVeiculo.add(cargaSoltaVeiculoItem);
    return this;
  }

 /**
   * Dados informados para carga do tipo granel&lt;br&gt;Informado apenas se houve sobra de solta/veiculo ou granel fora do contêiner.
   * @return granel
  **/
  @JsonProperty("granel")
  public List<Granel> getGranel() {
    return granel;
  }

  public void setGranel(List<Granel> granel) {
    this.granel = granel;
  }

  public DocumentosUnitizacao granel(List<Granel> granel) {
    this.granel = granel;
    return this;
  }

  public DocumentosUnitizacao addGranelItem(Granel granelItem) {
    this.granel.add(granelItem);
    return this;
  }

 /**
   * Dados informados para carga do tipo veículos&lt;br&gt;Informado apenas se houve sobra de solta/veiculo ou granel fora do contêiner.
   * @return veiculo
  **/
  @JsonProperty("veiculo")
  public List<Veiculo> getVeiculo() {
    return veiculo;
  }

  public void setVeiculo(List<Veiculo> veiculo) {
    this.veiculo = veiculo;
  }

  public DocumentosUnitizacao veiculo(List<Veiculo> veiculo) {
    this.veiculo = veiculo;
    return this;
  }

  public DocumentosUnitizacao addVeiculoItem(Veiculo veiculoItem) {
    this.veiculo.add(veiculoItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentosUnitizacao {\n");
    
    sb.append("    numeroDUE: ").append(toIndentedString(numeroDUE)).append("\n");
    sb.append("    numeroRUC: ").append(toIndentedString(numeroRUC)).append("\n");
    sb.append("    cargaSoltaVeiculo: ").append(toIndentedString(cargaSoltaVeiculo)).append("\n");
    sb.append("    granel: ").append(toIndentedString(granel)).append("\n");
    sb.append("    veiculo: ").append(toIndentedString(veiculo)).append("\n");
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

