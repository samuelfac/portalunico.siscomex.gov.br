package br.gov.siscomex.portalunico.talpco.model;

import br.gov.siscomex.portalunico.talpco.model.ReferenciaOperadorEstrangeiro;
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
 @XmlType(name = "ReferenciaFabricante", propOrder =
    { "codigoPais", "conhecido", "cpfCnpj", "operadorEstrangeiro"
})

@XmlRootElement(name="ReferenciaFabricante")
/**
  * Valor de um campo composto do tipo Fabricante/Produtor
 **/
@ApiModel(description="Valor de um campo composto do tipo Fabricante/Produtor")
public class ReferenciaFabricante  {
  
  @XmlElement(name="codigoPais", required = true)
  @ApiModelProperty(example = "AR", required = true, value = "Código na Tabela ISO2 do país do fabricante.<br>Tamanho: 2")
 /**
   * Código na Tabela ISO2 do país do fabricante.<br>Tamanho: 2
  **/
  private String codigoPais = null;

  @XmlElement(name="conhecido", required = true)
  @ApiModelProperty(example = "true", required = true, value = "Indica se é um fabricante conhecido.<br>")
 /**
   * Indica se é um fabricante conhecido.<br>
  **/
  private Boolean conhecido = false;

  @XmlElement(name="cpfCnpj")
  @ApiModelProperty(example = "03141554900", value = "CPF / CNPJ do fabricante. Só deve ser informado se for um fabricante nacional (codigoPais = BR).<br>Tamanho: 11 (CPF) ou 14 (CNPJ)")
 /**
   * CPF / CNPJ do fabricante. Só deve ser informado se for um fabricante nacional (codigoPais = BR).<br>Tamanho: 11 (CPF) ou 14 (CNPJ)
  **/
  private String cpfCnpj = null;

  @XmlElement(name="operadorEstrangeiro")
  @ApiModelProperty(value = "")
  @Valid
  private ReferenciaOperadorEstrangeiro operadorEstrangeiro = null;
 /**
   * Código na Tabela ISO2 do país do fabricante.&lt;br&gt;Tamanho: 2
   * @return codigoPais
  **/
  @JsonProperty("codigoPais")
  @NotNull
  public String getCodigoPais() {
    return codigoPais;
  }

  public void setCodigoPais(String codigoPais) {
    this.codigoPais = codigoPais;
  }

  public ReferenciaFabricante codigoPais(String codigoPais) {
    this.codigoPais = codigoPais;
    return this;
  }

 /**
   * Indica se é um fabricante conhecido.&lt;br&gt;
   * @return conhecido
  **/
  @JsonProperty("conhecido")
  @NotNull
  public Boolean isConhecido() {
    return conhecido;
  }

  public void setConhecido(Boolean conhecido) {
    this.conhecido = conhecido;
  }

  public ReferenciaFabricante conhecido(Boolean conhecido) {
    this.conhecido = conhecido;
    return this;
  }

 /**
   * CPF / CNPJ do fabricante. Só deve ser informado se for um fabricante nacional (codigoPais &#x3D; BR).&lt;br&gt;Tamanho: 11 (CPF) ou 14 (CNPJ)
   * @return cpfCnpj
  **/
  @JsonProperty("cpfCnpj")
  public String getCpfCnpj() {
    return cpfCnpj;
  }

  public void setCpfCnpj(String cpfCnpj) {
    this.cpfCnpj = cpfCnpj;
  }

  public ReferenciaFabricante cpfCnpj(String cpfCnpj) {
    this.cpfCnpj = cpfCnpj;
    return this;
  }

 /**
   * Get operadorEstrangeiro
   * @return operadorEstrangeiro
  **/
  @JsonProperty("operadorEstrangeiro")
  public ReferenciaOperadorEstrangeiro getOperadorEstrangeiro() {
    return operadorEstrangeiro;
  }

  public void setOperadorEstrangeiro(ReferenciaOperadorEstrangeiro operadorEstrangeiro) {
    this.operadorEstrangeiro = operadorEstrangeiro;
  }

  public ReferenciaFabricante operadorEstrangeiro(ReferenciaOperadorEstrangeiro operadorEstrangeiro) {
    this.operadorEstrangeiro = operadorEstrangeiro;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReferenciaFabricante {\n");
    
    sb.append("    codigoPais: ").append(toIndentedString(codigoPais)).append("\n");
    sb.append("    conhecido: ").append(toIndentedString(conhecido)).append("\n");
    sb.append("    cpfCnpj: ").append(toIndentedString(cpfCnpj)).append("\n");
    sb.append("    operadorEstrangeiro: ").append(toIndentedString(operadorEstrangeiro)).append("\n");
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

