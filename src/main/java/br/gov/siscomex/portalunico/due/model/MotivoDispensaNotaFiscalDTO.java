package br.gov.siscomex.portalunico.due.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "MotivoDispensaNotaFiscalDTO", propOrder =
    { "codigo", "descricao"
})

@XmlRootElement(name="MotivoDispensaNotaFiscalDTO")
public class MotivoDispensaNotaFiscalDTO  {
  
  @XmlElement(name="codigo")
  @ApiModelProperty(value = "Código<br />Formato: Inteiro, com até 3 digitos")
 /**
   * Código<br />Formato: Inteiro, com até 3 digitos
  **/
  private Integer codigo = null;

  @XmlElement(name="descricao")
  @ApiModelProperty(value = "Descrição<br />Tamanho mínimo: 1<br />Tamanho máximo: 50")
 /**
   * Descrição<br />Tamanho mínimo: 1<br />Tamanho máximo: 50
  **/
  private String descricao = null;
 /**
   * Código&lt;br /&gt;Formato: Inteiro, com até 3 digitos
   * @return codigo
  **/
  @JsonProperty("codigo")
  public Integer getCodigo() {
    return codigo;
  }

  public void setCodigo(Integer codigo) {
    this.codigo = codigo;
  }

  public MotivoDispensaNotaFiscalDTO codigo(Integer codigo) {
    this.codigo = codigo;
    return this;
  }

 /**
   * Descrição&lt;br /&gt;Tamanho mínimo: 1&lt;br /&gt;Tamanho máximo: 50
   * @return descricao
  **/
  @JsonProperty("descricao")
  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public MotivoDispensaNotaFiscalDTO descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MotivoDispensaNotaFiscalDTO {\n");
    
    sb.append("    codigo: ").append(toIndentedString(codigo)).append("\n");
    sb.append("    descricao: ").append(toIndentedString(descricao)).append("\n");
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

