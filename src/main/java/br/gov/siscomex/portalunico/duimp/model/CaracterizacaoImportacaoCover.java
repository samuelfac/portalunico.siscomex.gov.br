package br.gov.siscomex.portalunico.duimp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "CaracterizacaoImportacaoCover", propOrder =
    { "indicadorImportacaoTerceiros", "cnpj", "uf", "nome"
})

@XmlRootElement(name="CaracterizacaoImportacaoCover")
/**
  * Caracterização da Importação
 **/
@ApiModel(description="Caracterização da Importação")
public class CaracterizacaoImportacaoCover  {
  

@XmlType(name="IndicadorImportacaoTerceirosEnum")
@XmlEnum(String.class)
public enum IndicadorImportacaoTerceirosEnum {

	@XmlEnumValue("IMPORTACAO_DIRETA")
	@JsonProperty("IMPORTACAO_DIRETA")
	DIRETA(String.valueOf("IMPORTACAO_DIRETA")),
	
	@XmlEnumValue("IMPORTACAO_POR_CONTA_E_ORDEM")
	@JsonProperty("IMPORTACAO_POR_CONTA_E_ORDEM")
	POR_CONTA_E_ORDEM(String.valueOf("IMPORTACAO_POR_CONTA_E_ORDEM")),
	
	@XmlEnumValue("IMPORTACAO_POR_ENCOMENDA")
	@JsonProperty("IMPORTACAO_POR_ENCOMENDA")
	POR_ENCOMENDA(String.valueOf("IMPORTACAO_POR_ENCOMENDA"));


    private String value;

    IndicadorImportacaoTerceirosEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static IndicadorImportacaoTerceirosEnum fromValue(String v) {
        for (IndicadorImportacaoTerceirosEnum b : IndicadorImportacaoTerceirosEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to IndicadorImportacaoTerceirosEnum");
    }
}

  @XmlElement(name="indicadorImportacaoTerceiros", required = true)
  @ApiModelProperty(example = "IMPORTACAO_DIRETA", required = true, value = "Indicador de importação por terceiros.")
 /**
   * Indicador de importação por terceiros.
  **/
  private IndicadorImportacaoTerceirosEnum indicadorImportacaoTerceiros = null;

  @XmlElement(name="cnpj")
  @ApiModelProperty(example = "00000000000191", value = "CNPJ do adquirente ou encomendante<br>Tamanho: 14<br>Formato: 'NNNNNNNNNNNNNN'<br>Observação:<br>Apenas quando o atributo 'indicadorImportacaoTerceiros' for IMPORTACAO_POR_CONTA_E_ORDEM ou IMPORTACAO_POR_ENCOMENDA")
 /**
   * CNPJ do adquirente ou encomendante<br>Tamanho: 14<br>Formato: 'NNNNNNNNNNNNNN'<br>Observação:<br>Apenas quando o atributo 'indicadorImportacaoTerceiros' for IMPORTACAO_POR_CONTA_E_ORDEM ou IMPORTACAO_POR_ENCOMENDA
  **/
  private String cnpj = null;

  @XmlElement(name="uf")
  @ApiModelProperty(example = "RJ", value = "UF do adquirente ou encomendante<br>Dominio:<br>AC, AL, AP, AM, BA, CE, DF<br>ES, GO, MA, MT, MS, MG, PA<br>PB, PR, PE, PI, RJ, RN, RS<br>RO, RR, SC, SP, SE, TO<br>Tamanho: 2<br>Observação:<br>Apenas quando o atributo 'indicadorImportacaoTerceiros' for IMPORTACAO_POR_CONTA_E_ORDEM ou IMPORTACAO_POR_ENCOMENDA")
 /**
   * UF do adquirente ou encomendante<br>Dominio:<br>AC, AL, AP, AM, BA, CE, DF<br>ES, GO, MA, MT, MS, MG, PA<br>PB, PR, PE, PI, RJ, RN, RS<br>RO, RR, SC, SP, SE, TO<br>Tamanho: 2<br>Observação:<br>Apenas quando o atributo 'indicadorImportacaoTerceiros' for IMPORTACAO_POR_CONTA_E_ORDEM ou IMPORTACAO_POR_ENCOMENDA
  **/
  private String uf = null;

  @XmlElement(name="nome")
  @ApiModelProperty(example = "Nome do CNPJ informado", value = "Nome do adquirente ou encomendante<br>Tamanho mínimo: 1<br>Tamanho máximo: 150<br>Observação:<br>Apenas quando o atributo 'indicadorImportacaoTerceiros' for IMPORTACAO_POR_CONTA_E_ORDEM ou IMPORTACAO_POR_ENCOMENDA")
 /**
   * Nome do adquirente ou encomendante<br>Tamanho mínimo: 1<br>Tamanho máximo: 150<br>Observação:<br>Apenas quando o atributo 'indicadorImportacaoTerceiros' for IMPORTACAO_POR_CONTA_E_ORDEM ou IMPORTACAO_POR_ENCOMENDA
  **/
  private String nome = null;
 /**
   * Indicador de importação por terceiros.
   * @return indicadorImportacaoTerceiros
  **/
  @JsonProperty("indicadorImportacaoTerceiros")
  @NotNull
  public String getIndicadorImportacaoTerceiros() {
    if (indicadorImportacaoTerceiros == null) {
      return null;
    }
    return indicadorImportacaoTerceiros.value();
  }

  public void setIndicadorImportacaoTerceiros(IndicadorImportacaoTerceirosEnum indicadorImportacaoTerceiros) {
    this.indicadorImportacaoTerceiros = indicadorImportacaoTerceiros;
  }

  public CaracterizacaoImportacaoCover indicadorImportacaoTerceiros(IndicadorImportacaoTerceirosEnum indicadorImportacaoTerceiros) {
    this.indicadorImportacaoTerceiros = indicadorImportacaoTerceiros;
    return this;
  }

 /**
   * CNPJ do adquirente ou encomendante&lt;br&gt;Tamanho: 14&lt;br&gt;Formato: &#39;NNNNNNNNNNNNNN&#39;&lt;br&gt;Observação:&lt;br&gt;Apenas quando o atributo &#39;indicadorImportacaoTerceiros&#39; for IMPORTACAO_POR_CONTA_E_ORDEM ou IMPORTACAO_POR_ENCOMENDA
   * @return cnpj
  **/
  @JsonProperty("cnpj")
  public String getCnpj() {
    return cnpj;
  }

  public void setCnpj(String cnpj) {
    this.cnpj = cnpj;
  }

  public CaracterizacaoImportacaoCover cnpj(String cnpj) {
    this.cnpj = cnpj;
    return this;
  }

 /**
   * UF do adquirente ou encomendante&lt;br&gt;Dominio:&lt;br&gt;AC, AL, AP, AM, BA, CE, DF&lt;br&gt;ES, GO, MA, MT, MS, MG, PA&lt;br&gt;PB, PR, PE, PI, RJ, RN, RS&lt;br&gt;RO, RR, SC, SP, SE, TO&lt;br&gt;Tamanho: 2&lt;br&gt;Observação:&lt;br&gt;Apenas quando o atributo &#39;indicadorImportacaoTerceiros&#39; for IMPORTACAO_POR_CONTA_E_ORDEM ou IMPORTACAO_POR_ENCOMENDA
   * @return uf
  **/
  @JsonProperty("uf")
  public String getUf() {
    return uf;
  }

  public void setUf(String uf) {
    this.uf = uf;
  }

  public CaracterizacaoImportacaoCover uf(String uf) {
    this.uf = uf;
    return this;
  }

 /**
   * Nome do adquirente ou encomendante&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 150&lt;br&gt;Observação:&lt;br&gt;Apenas quando o atributo &#39;indicadorImportacaoTerceiros&#39; for IMPORTACAO_POR_CONTA_E_ORDEM ou IMPORTACAO_POR_ENCOMENDA
   * @return nome
  **/
  @JsonProperty("nome")
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public CaracterizacaoImportacaoCover nome(String nome) {
    this.nome = nome;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CaracterizacaoImportacaoCover {\n");
    
    sb.append("    indicadorImportacaoTerceiros: ").append(toIndentedString(indicadorImportacaoTerceiros)).append("\n");
    sb.append("    cnpj: ").append(toIndentedString(cnpj)).append("\n");
    sb.append("    uf: ").append(toIndentedString(uf)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
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

