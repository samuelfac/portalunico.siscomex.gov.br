package br.gov.siscomex.portalunico.talpco.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "ReferenciaExportadorEFabricanteDoProduto", propOrder =
    { "exportadorIgualFabricante", "operadorEstrangeiro"
})

@XmlRootElement(name="ReferenciaExportadorEFabricanteDoProduto")
/**
  * Valor de um campo composto do tipo Exportador é o fabricante do produto
 **/
@ApiModel(description="Valor de um campo composto do tipo Exportador é o fabricante do produto")
public class ReferenciaExportadorEFabricanteDoProduto  {
  
  @XmlElement(name="exportadorIgualFabricante", required = true)
  @ApiModelProperty(example = "true", required = true, value = "Indica se é o exportador é igual ao fabricante do produto.<br>")
 /**
   * Indica se é o exportador é igual ao fabricante do produto.<br>
  **/
  private Boolean exportadorIgualFabricante = false;

  @XmlElement(name="operadorEstrangeiro")
  @ApiModelProperty(value = "")
  @Valid
  private ReferenciaOperadorEstrangeiro operadorEstrangeiro = null;
 /**
   * Indica se é o exportador é igual ao fabricante do produto.&lt;br&gt;
   * @return exportadorIgualFabricante
  **/
  @JsonProperty("exportadorIgualFabricante")
  @NotNull
  public Boolean isExportadorIgualFabricante() {
    return exportadorIgualFabricante;
  }

  public void setExportadorIgualFabricante(Boolean exportadorIgualFabricante) {
    this.exportadorIgualFabricante = exportadorIgualFabricante;
  }

  public ReferenciaExportadorEFabricanteDoProduto exportadorIgualFabricante(Boolean exportadorIgualFabricante) {
    this.exportadorIgualFabricante = exportadorIgualFabricante;
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

  public ReferenciaExportadorEFabricanteDoProduto operadorEstrangeiro(ReferenciaOperadorEstrangeiro operadorEstrangeiro) {
    this.operadorEstrangeiro = operadorEstrangeiro;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReferenciaExportadorEFabricanteDoProduto {\n");
    
    sb.append("    exportadorIgualFabricante: ").append(toIndentedString(exportadorIgualFabricante)).append("\n");
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

