package br.gov.siscomex.portalunico.duimp_api.model;

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
 @XmlType(name = "FundamentoCover", propOrder =
    { "codigo"
})

@XmlRootElement(name="FundamentoCover")
/**
  * Fundamento legal do regime tributário de importação.
 **/
@ApiModel(description="Fundamento legal do regime tributário de importação.")
public class FundamentoCover  {
  
  @XmlElement(name="codigo", required = true)
  @ApiModelProperty(example = "1001", required = true, value = "Código do fundamento legal do regime tributário de importação utilizado na declaração.<br>Dominio: Fundamentos legais existentes no sistema Tratamento Tributário.")
 /**
   * Código do fundamento legal do regime tributário de importação utilizado na declaração.<br>Dominio: Fundamentos legais existentes no sistema Tratamento Tributário.
  **/
  private Integer codigo = null;
 /**
   * Código do fundamento legal do regime tributário de importação utilizado na declaração.&lt;br&gt;Dominio: Fundamentos legais existentes no sistema Tratamento Tributário.
   * @return codigo
  **/
  @JsonProperty("codigo")
  @NotNull
  public Integer getCodigo() {
    return codigo;
  }

  public void setCodigo(Integer codigo) {
    this.codigo = codigo;
  }

  public FundamentoCover codigo(Integer codigo) {
    this.codigo = codigo;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FundamentoCover {\n");
    
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

