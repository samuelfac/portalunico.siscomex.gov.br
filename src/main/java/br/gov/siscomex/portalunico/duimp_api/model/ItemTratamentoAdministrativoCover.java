package br.gov.siscomex.portalunico.duimp_api.model;

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
 @XmlType(name = "ItemTratamentoAdministrativoCover", propOrder =
    { "numeroItemDuimp", "tipoTratamento", "descricao", "orgao", "lpco", "observacoes"
})

@XmlRootElement(name="ItemTratamentoAdministrativoCover")
/**
  * Lista de itens do tratamento administrativo.
 **/
@ApiModel(description="Lista de itens do tratamento administrativo.")
public class ItemTratamentoAdministrativoCover  {
  
  @XmlElement(name="numeroItemDuimp")
  @ApiModelProperty(example = "1.0", value = "Identificação de cada item de Duimp que possui TA (número sequencial).<br>Tamanho: 15")
 /**
   * Identificação de cada item de Duimp que possui TA (número sequencial).<br>Tamanho: 15
  **/
  private Double numeroItemDuimp = null;


@XmlType(name="TipoTratamentoEnum")
@XmlEnum(String.class)
public enum TipoTratamentoEnum {

	@XmlEnumValue("IMPEDE_REGISTRO")
	@JsonProperty("IMPEDE_REGISTRO")
	IMPEDE_REGISTRO(String.valueOf("IMPEDE_REGISTRO")),
	
	@XmlEnumValue("REQUER_LPCO")
	@JsonProperty("REQUER_LPCO")
	REQUER_LPCO(String.valueOf("REQUER_LPCO")),
	
	@XmlEnumValue("ALERTA")
	@JsonProperty("ALERTA")
	ALERTA(String.valueOf("ALERTA"));


    private String value;

    TipoTratamentoEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TipoTratamentoEnum fromValue(String v) {
        for (TipoTratamentoEnum b : TipoTratamentoEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to TipoTratamentoEnum");
    }
}

  @XmlElement(name="tipoTratamento")
  @ApiModelProperty(example = "IMPEDE_REGISTRO", value = "Tipo de tratamento administrativo.<br>Domínio:")
 /**
   * Tipo de tratamento administrativo.<br>Domínio:
  **/
  private TipoTratamentoEnum tipoTratamento = null;

  @XmlElement(name="descricao")
  @ApiModelProperty(example = "ALERTA", value = "Descrição do código de retorno do item do TA.<br>Tamanho mínimo: 0<br>Tamanho máximo: 4000")
 /**
   * Descrição do código de retorno do item do TA.<br>Tamanho mínimo: 0<br>Tamanho máximo: 4000
  **/
  private String descricao = null;

  @XmlElement(name="orgao")
  @ApiModelProperty(example = "DECEX", value = "Sigla do Órgão Anuente associado ao TA.<br>Tamanho mínimo: 1<br>Tamanho máximo: 30")
 /**
   * Sigla do Órgão Anuente associado ao TA.<br>Tamanho mínimo: 1<br>Tamanho máximo: 30
  **/
  private String orgao = null;

  @XmlElement(name="lpco")
  @ApiModelProperty(example = "21255555555", value = "Número único do LPCO associado ao item de TA.<br>Tamanho: 11")
 /**
   * Número único do LPCO associado ao item de TA.<br>Tamanho: 11
  **/
  private String lpco = null;

  @XmlElement(name="observacoes")
  @ApiModelProperty(example = "Texto de observação.", value = "Observação cadastrada no Sistema TA/LPCO para este tratamento admnistrativo.<br>Tamanho mínimo: 0<br>Tamanho máximo: 4000")
 /**
   * Observação cadastrada no Sistema TA/LPCO para este tratamento admnistrativo.<br>Tamanho mínimo: 0<br>Tamanho máximo: 4000
  **/
  private String observacoes = null;
 /**
   * Identificação de cada item de Duimp que possui TA (número sequencial).&lt;br&gt;Tamanho: 15
   * @return numeroItemDuimp
  **/
  @JsonProperty("numeroItemDuimp")
  public Double getNumeroItemDuimp() {
    return numeroItemDuimp;
  }

  public void setNumeroItemDuimp(Double numeroItemDuimp) {
    this.numeroItemDuimp = numeroItemDuimp;
  }

  public ItemTratamentoAdministrativoCover numeroItemDuimp(Double numeroItemDuimp) {
    this.numeroItemDuimp = numeroItemDuimp;
    return this;
  }

 /**
   * Tipo de tratamento administrativo.&lt;br&gt;Domínio:
   * @return tipoTratamento
  **/
  @JsonProperty("tipoTratamento")
  public String getTipoTratamento() {
    if (tipoTratamento == null) {
      return null;
    }
    return tipoTratamento.value();
  }

  public void setTipoTratamento(TipoTratamentoEnum tipoTratamento) {
    this.tipoTratamento = tipoTratamento;
  }

  public ItemTratamentoAdministrativoCover tipoTratamento(TipoTratamentoEnum tipoTratamento) {
    this.tipoTratamento = tipoTratamento;
    return this;
  }

 /**
   * Descrição do código de retorno do item do TA.&lt;br&gt;Tamanho mínimo: 0&lt;br&gt;Tamanho máximo: 4000
   * @return descricao
  **/
  @JsonProperty("descricao")
  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public ItemTratamentoAdministrativoCover descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }

 /**
   * Sigla do Órgão Anuente associado ao TA.&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 30
   * @return orgao
  **/
  @JsonProperty("orgao")
  public String getOrgao() {
    return orgao;
  }

  public void setOrgao(String orgao) {
    this.orgao = orgao;
  }

  public ItemTratamentoAdministrativoCover orgao(String orgao) {
    this.orgao = orgao;
    return this;
  }

 /**
   * Número único do LPCO associado ao item de TA.&lt;br&gt;Tamanho: 11
   * @return lpco
  **/
  @JsonProperty("lpco")
  public String getLpco() {
    return lpco;
  }

  public void setLpco(String lpco) {
    this.lpco = lpco;
  }

  public ItemTratamentoAdministrativoCover lpco(String lpco) {
    this.lpco = lpco;
    return this;
  }

 /**
   * Observação cadastrada no Sistema TA/LPCO para este tratamento admnistrativo.&lt;br&gt;Tamanho mínimo: 0&lt;br&gt;Tamanho máximo: 4000
   * @return observacoes
  **/
  @JsonProperty("observacoes")
  public String getObservacoes() {
    return observacoes;
  }

  public void setObservacoes(String observacoes) {
    this.observacoes = observacoes;
  }

  public ItemTratamentoAdministrativoCover observacoes(String observacoes) {
    this.observacoes = observacoes;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemTratamentoAdministrativoCover {\n");
    
    sb.append("    numeroItemDuimp: ").append(toIndentedString(numeroItemDuimp)).append("\n");
    sb.append("    tipoTratamento: ").append(toIndentedString(tipoTratamento)).append("\n");
    sb.append("    descricao: ").append(toIndentedString(descricao)).append("\n");
    sb.append("    orgao: ").append(toIndentedString(orgao)).append("\n");
    sb.append("    lpco: ").append(toIndentedString(lpco)).append("\n");
    sb.append("    observacoes: ").append(toIndentedString(observacoes)).append("\n");
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

