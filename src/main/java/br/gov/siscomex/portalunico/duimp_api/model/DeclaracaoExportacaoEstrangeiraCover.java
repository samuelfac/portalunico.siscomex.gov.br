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
 @XmlType(name = "DeclaracaoExportacaoEstrangeiraCover", propOrder =
    { "numero", "faixaInicio", "faixaFim"
})

@XmlRootElement(name="DeclaracaoExportacaoEstrangeiraCover")
/**
  * Lista de declarações estrangeiras.<br>Observação: Os campos deste grupo são informados apenas quando a procedência da carga é de um país do Mercosul.
 **/
@ApiModel(description="Lista de declarações estrangeiras.<br>Observação: Os campos deste grupo são informados apenas quando a procedência da carga é de um país do Mercosul.")
public class DeclaracaoExportacaoEstrangeiraCover  {
  
  @XmlElement(name="numero")
  @ApiModelProperty(example = "19XY0000001-XYZ", value = "Número da declaração.<br>Tamanho mínimo: 1<br>Tamanho máximo: 70")
 /**
   * Número da declaração.<br>Tamanho mínimo: 1<br>Tamanho máximo: 70
  **/
  private String numero = null;

  @XmlElement(name="faixaInicio")
  @ApiModelProperty(example = "A-11", value = "Item inicial da faixa de itens.<br>Tamanho mínimo: 1<br>Tamanho máximo: 7")
 /**
   * Item inicial da faixa de itens.<br>Tamanho mínimo: 1<br>Tamanho máximo: 7
  **/
  private String faixaInicio = null;

  @XmlElement(name="faixaFim")
  @ApiModelProperty(example = "B-20", value = "Item final da faixa de itens.<br>Tamanho mínimo: 1<br>Tamanho máximo: 7")
 /**
   * Item final da faixa de itens.<br>Tamanho mínimo: 1<br>Tamanho máximo: 7
  **/
  private String faixaFim = null;
 /**
   * Número da declaração.&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 70
   * @return numero
  **/
  @JsonProperty("numero")
  public String getNumero() {
    return numero;
  }

  public void setNumero(String numero) {
    this.numero = numero;
  }

  public DeclaracaoExportacaoEstrangeiraCover numero(String numero) {
    this.numero = numero;
    return this;
  }

 /**
   * Item inicial da faixa de itens.&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 7
   * @return faixaInicio
  **/
  @JsonProperty("faixaInicio")
  public String getFaixaInicio() {
    return faixaInicio;
  }

  public void setFaixaInicio(String faixaInicio) {
    this.faixaInicio = faixaInicio;
  }

  public DeclaracaoExportacaoEstrangeiraCover faixaInicio(String faixaInicio) {
    this.faixaInicio = faixaInicio;
    return this;
  }

 /**
   * Item final da faixa de itens.&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 7
   * @return faixaFim
  **/
  @JsonProperty("faixaFim")
  public String getFaixaFim() {
    return faixaFim;
  }

  public void setFaixaFim(String faixaFim) {
    this.faixaFim = faixaFim;
  }

  public DeclaracaoExportacaoEstrangeiraCover faixaFim(String faixaFim) {
    this.faixaFim = faixaFim;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeclaracaoExportacaoEstrangeiraCover {\n");
    
    sb.append("    numero: ").append(toIndentedString(numero)).append("\n");
    sb.append("    faixaInicio: ").append(toIndentedString(faixaInicio)).append("\n");
    sb.append("    faixaFim: ").append(toIndentedString(faixaFim)).append("\n");
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

