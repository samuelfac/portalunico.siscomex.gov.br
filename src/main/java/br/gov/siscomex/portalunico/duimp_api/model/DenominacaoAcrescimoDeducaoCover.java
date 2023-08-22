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
 @XmlType(name = "DenominacaoAcrescimoDeducaoCover", propOrder =
    { "codigo"
})

@XmlRootElement(name="DenominacaoAcrescimoDeducaoCover")
/**
  * Denominação do acréscimo ou da dedução escolhida.
 **/
@ApiModel(description="Denominação do acréscimo ou da dedução escolhida.")
public class DenominacaoAcrescimoDeducaoCover  {
  
  @XmlElement(name="codigo")
  @ApiModelProperty(example = "1", value = "Código do acréscimo ou da dedução escolhida.<br>Domínio: Tabela de Acréscimos/Deduções do Siscomex<br>Valor mínimo: 1<br>Valor máximo: 99Origem: Sistema Tabelas Aduaneiras - https://api-docs.portalunico.siscomex.gov.br/")
 /**
   * Código do acréscimo ou da dedução escolhida.<br>Domínio: Tabela de Acréscimos/Deduções do Siscomex<br>Valor mínimo: 1<br>Valor máximo: 99Origem: Sistema Tabelas Aduaneiras - https://api-docs.portalunico.siscomex.gov.br/
  **/
  private Integer codigo = null;
 /**
   * Código do acréscimo ou da dedução escolhida.&lt;br&gt;Domínio: Tabela de Acréscimos/Deduções do Siscomex&lt;br&gt;Valor mínimo: 1&lt;br&gt;Valor máximo: 99Origem: Sistema Tabelas Aduaneiras - https://api-docs.portalunico.siscomex.gov.br/
   * @return codigo
  **/
  @JsonProperty("codigo")
  public Integer getCodigo() {
    return codigo;
  }

  public void setCodigo(Integer codigo) {
    this.codigo = codigo;
  }

  public DenominacaoAcrescimoDeducaoCover codigo(Integer codigo) {
    this.codigo = codigo;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DenominacaoAcrescimoDeducaoCover {\n");
    
    sb.append("    codigo: ").append(toIndentedString(codigo)).append("\n");
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

