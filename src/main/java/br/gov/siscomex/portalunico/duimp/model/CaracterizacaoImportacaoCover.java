package br.gov.siscomex.portalunico.duimp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "CaracterizacaoImportacaoCover", propOrder =
    { "indicadorImportacaoTerceiros", "cnpjAdquirente", "ufAdquirente", "nomeAdquirente"
})

@XmlRootElement(name="CaracterizacaoImportacaoCover")
/**
  * Caracterização da Importação
 **/
@ApiModel(description="Caracterização da Importação")
public class CaracterizacaoImportacaoCover  {
  
  @XmlElement(name="indicadorImportacaoTerceiros")
  @ApiModelProperty(value = "Indicador de importação por terceiros.<br>Dominio:<br>S - SIM,<br>N - NÃO<br>Tamanho: 1")
 /**
   * Indicador de importação por terceiros.<br>Dominio:<br>S - SIM,<br>N - NÃO<br>Tamanho: 1
  **/
  private Integer indicadorImportacaoTerceiros = null;

  @XmlElement(name="cnpjAdquirente")
  @ApiModelProperty(example = "00000000000191", value = "CNPJ do adquirente<br>Tamanho: 14<br>Formato: 'NNNNNNNNNNNNNN'")
 /**
   * CNPJ do adquirente<br>Tamanho: 14<br>Formato: 'NNNNNNNNNNNNNN'
  **/
  private String cnpjAdquirente = null;

  @XmlElement(name="ufAdquirente")
  @ApiModelProperty(example = "RJ", value = "UF do adquirente<br>Dominio:<br>AC, AL, AP, AM, BA, CE, DF<br>ES, GO, MA, MT, MS, MG, PA<br>PB, PR, PE, PI, RJ, RN, RS<br>RO, RR, SC, SP, SE, TO<br>Tamanho: 2")
 /**
   * UF do adquirente<br>Dominio:<br>AC, AL, AP, AM, BA, CE, DF<br>ES, GO, MA, MT, MS, MG, PA<br>PB, PR, PE, PI, RJ, RN, RS<br>RO, RR, SC, SP, SE, TO<br>Tamanho: 2
  **/
  private String ufAdquirente = null;

  @XmlElement(name="nomeAdquirente")
  @ApiModelProperty(example = "Nome do adquirente", value = "Nome do adquirente<br>Tamanho mínimo: 1<br>Tamanho máximo: 80")
 /**
   * Nome do adquirente<br>Tamanho mínimo: 1<br>Tamanho máximo: 80
  **/
  private String nomeAdquirente = null;
 /**
   * Indicador de importação por terceiros.&lt;br&gt;Dominio:&lt;br&gt;S - SIM,&lt;br&gt;N - NÃO&lt;br&gt;Tamanho: 1
   * @return indicadorImportacaoTerceiros
  **/
  @JsonProperty("indicadorImportacaoTerceiros")
  public Integer getIndicadorImportacaoTerceiros() {
    return indicadorImportacaoTerceiros;
  }

  public void setIndicadorImportacaoTerceiros(Integer indicadorImportacaoTerceiros) {
    this.indicadorImportacaoTerceiros = indicadorImportacaoTerceiros;
  }

  public CaracterizacaoImportacaoCover indicadorImportacaoTerceiros(Integer indicadorImportacaoTerceiros) {
    this.indicadorImportacaoTerceiros = indicadorImportacaoTerceiros;
    return this;
  }

 /**
   * CNPJ do adquirente&lt;br&gt;Tamanho: 14&lt;br&gt;Formato: &#39;NNNNNNNNNNNNNN&#39;
   * @return cnpjAdquirente
  **/
  @JsonProperty("cnpjAdquirente")
  public String getCnpjAdquirente() {
    return cnpjAdquirente;
  }

  public void setCnpjAdquirente(String cnpjAdquirente) {
    this.cnpjAdquirente = cnpjAdquirente;
  }

  public CaracterizacaoImportacaoCover cnpjAdquirente(String cnpjAdquirente) {
    this.cnpjAdquirente = cnpjAdquirente;
    return this;
  }

 /**
   * UF do adquirente&lt;br&gt;Dominio:&lt;br&gt;AC, AL, AP, AM, BA, CE, DF&lt;br&gt;ES, GO, MA, MT, MS, MG, PA&lt;br&gt;PB, PR, PE, PI, RJ, RN, RS&lt;br&gt;RO, RR, SC, SP, SE, TO&lt;br&gt;Tamanho: 2
   * @return ufAdquirente
  **/
  @JsonProperty("ufAdquirente")
  public String getUfAdquirente() {
    return ufAdquirente;
  }

  public void setUfAdquirente(String ufAdquirente) {
    this.ufAdquirente = ufAdquirente;
  }

  public CaracterizacaoImportacaoCover ufAdquirente(String ufAdquirente) {
    this.ufAdquirente = ufAdquirente;
    return this;
  }

 /**
   * Nome do adquirente&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 80
   * @return nomeAdquirente
  **/
  @JsonProperty("nomeAdquirente")
  public String getNomeAdquirente() {
    return nomeAdquirente;
  }

  public void setNomeAdquirente(String nomeAdquirente) {
    this.nomeAdquirente = nomeAdquirente;
  }

  public CaracterizacaoImportacaoCover nomeAdquirente(String nomeAdquirente) {
    this.nomeAdquirente = nomeAdquirente;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CaracterizacaoImportacaoCover {\n");
    
    sb.append("    indicadorImportacaoTerceiros: ").append(toIndentedString(indicadorImportacaoTerceiros)).append("\n");
    sb.append("    cnpjAdquirente: ").append(toIndentedString(cnpjAdquirente)).append("\n");
    sb.append("    ufAdquirente: ").append(toIndentedString(ufAdquirente)).append("\n");
    sb.append("    nomeAdquirente: ").append(toIndentedString(nomeAdquirente)).append("\n");
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

