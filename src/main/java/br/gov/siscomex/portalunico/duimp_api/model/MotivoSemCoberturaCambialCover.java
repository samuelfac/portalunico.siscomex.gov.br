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
 @XmlType(name = "MotivoSemCoberturaCambialCover", propOrder =
    { "codigo"
})

@XmlRootElement(name="MotivoSemCoberturaCambialCover")
/**
  * Motivo para ausência de cobertura cambial.<br>Observação: Deve ser preenchido quando a cobertura cambial for \"sem cobertura\".
 **/
@ApiModel(description="Motivo para ausência de cobertura cambial.<br>Observação: Deve ser preenchido quando a cobertura cambial for \"sem cobertura\".")
public class MotivoSemCoberturaCambialCover  {
  
  @XmlElement(name="codigo")
  @ApiModelProperty(example = "52", value = "Código do Motivo para ausência de cobertura cambial.<br>Domínio: Tabela de Motivos Sem Cobertura do Siscomex. - https://api-docs.portalunico.siscomex.gov.br/<br>Valor mínimo: 1<br>Valor máximo: 99999")
 /**
   * Código do Motivo para ausência de cobertura cambial.<br>Domínio: Tabela de Motivos Sem Cobertura do Siscomex. - https://api-docs.portalunico.siscomex.gov.br/<br>Valor mínimo: 1<br>Valor máximo: 99999
  **/
  private Integer codigo = null;
 /**
   * Código do Motivo para ausência de cobertura cambial.&lt;br&gt;Domínio: Tabela de Motivos Sem Cobertura do Siscomex. - https://api-docs.portalunico.siscomex.gov.br/&lt;br&gt;Valor mínimo: 1&lt;br&gt;Valor máximo: 99999
   * @return codigo
  **/
  @JsonProperty("codigo")
  public Integer getCodigo() {
    return codigo;
  }

  public void setCodigo(Integer codigo) {
    this.codigo = codigo;
  }

  public MotivoSemCoberturaCambialCover codigo(Integer codigo) {
    this.codigo = codigo;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MotivoSemCoberturaCambialCover {\n");
    
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

