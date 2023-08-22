package br.gov.siscomex.portalunico.talpco.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "ReferenciaImportacaoTerceiro", propOrder =
    { "codigoIndicador", "cpfCnpj"
})

@XmlRootElement(name="ReferenciaImportacaoTerceiro")
/**
  * Valor de um campo composto do tipo Indicação de importação para terceiros
 **/
@ApiModel(description="Valor de um campo composto do tipo Indicação de importação para terceiros")
public class ReferenciaImportacaoTerceiro  {
  
  @XmlElement(name="codigoIndicador", required = true)
  @ApiModelProperty(example = "0", required = true, value = "Código do indicador: 0: Importação Direta, 1: Importação por Conta e Ordem, 2: Importação por Encomenda.<br>Tamanho: 1")
 /**
   * Código do indicador: 0: Importação Direta, 1: Importação por Conta e Ordem, 2: Importação por Encomenda.<br>Tamanho: 1
  **/
  private Integer codigoIndicador = null;

  @XmlElement(name="cpfCnpj")
  @ApiModelProperty(example = "03141554900", value = "CPF / CNPJ do adquirente / encomendante. Não deve ser informado no caso de importação direta.<br>Tamanho: 11 (CPF) ou 14 (CNPJ)")
 /**
   * CPF / CNPJ do adquirente / encomendante. Não deve ser informado no caso de importação direta.<br>Tamanho: 11 (CPF) ou 14 (CNPJ)
  **/
  private String cpfCnpj = null;
 /**
   * Código do indicador: 0: Importação Direta, 1: Importação por Conta e Ordem, 2: Importação por Encomenda.&lt;br&gt;Tamanho: 1
   * @return codigoIndicador
  **/
  @JsonProperty("codigoIndicador")
  @NotNull
  public Integer getCodigoIndicador() {
    return codigoIndicador;
  }

  public void setCodigoIndicador(Integer codigoIndicador) {
    this.codigoIndicador = codigoIndicador;
  }

  public ReferenciaImportacaoTerceiro codigoIndicador(Integer codigoIndicador) {
    this.codigoIndicador = codigoIndicador;
    return this;
  }

 /**
   * CPF / CNPJ do adquirente / encomendante. Não deve ser informado no caso de importação direta.&lt;br&gt;Tamanho: 11 (CPF) ou 14 (CNPJ)
   * @return cpfCnpj
  **/
  @JsonProperty("cpfCnpj")
  public String getCpfCnpj() {
    return cpfCnpj;
  }

  public void setCpfCnpj(String cpfCnpj) {
    this.cpfCnpj = cpfCnpj;
  }

  public ReferenciaImportacaoTerceiro cpfCnpj(String cpfCnpj) {
    this.cpfCnpj = cpfCnpj;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReferenciaImportacaoTerceiro {\n");
    
    sb.append("    codigoIndicador: ").append(toIndentedString(codigoIndicador)).append("\n");
    sb.append("    cpfCnpj: ").append(toIndentedString(cpfCnpj)).append("\n");
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

