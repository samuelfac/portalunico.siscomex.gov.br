package br.gov.siscomex.portalunico.ttce.model;

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
 @XmlType(name = "CodigoNcmExcetuaDTO", propOrder =
    { "codigo"
})

@XmlRootElement(name="CodigoNcmExcetuaDTO")
/**
  * Código de uma NCM.
 **/
@ApiModel(description="Código de uma NCM.")
public class CodigoNcmExcetuaDTO  {
  
  @XmlElement(name="codigo", required = true)
  @ApiModelProperty(example = "04022110", required = true, value = "Código da NCM.<br/><br/>Os dois primeiros caracterizam o produto (capítulo);<br/>Os dois números seguintes abrangem mais sobre a característica do produto (posição);<br/>O quinto e sexto definem a subcategoria do mesmo (ou subposição);<br/>O sétimo o classifica (item); e<br/>O oitavo se refere ao subitem, que descreve especificamente do que se trata a mercadoria.<br/><br/><br>Tamanho mínimo: 2<br>Tamanho máximo: 8")
 /**
   * Código da NCM.<br/><br/>Os dois primeiros caracterizam o produto (capítulo);<br/>Os dois números seguintes abrangem mais sobre a característica do produto (posição);<br/>O quinto e sexto definem a subcategoria do mesmo (ou subposição);<br/>O sétimo o classifica (item); e<br/>O oitavo se refere ao subitem, que descreve especificamente do que se trata a mercadoria.<br/><br/><br>Tamanho mínimo: 2<br>Tamanho máximo: 8
  **/
  private String codigo = null;
 /**
   * Código da NCM.&lt;br/&gt;&lt;br/&gt;Os dois primeiros caracterizam o produto (capítulo);&lt;br/&gt;Os dois números seguintes abrangem mais sobre a característica do produto (posição);&lt;br/&gt;O quinto e sexto definem a subcategoria do mesmo (ou subposição);&lt;br/&gt;O sétimo o classifica (item); e&lt;br/&gt;O oitavo se refere ao subitem, que descreve especificamente do que se trata a mercadoria.&lt;br/&gt;&lt;br/&gt;&lt;br&gt;Tamanho mínimo: 2&lt;br&gt;Tamanho máximo: 8
   * @return codigo
  **/
  @JsonProperty("codigo")
  @NotNull
  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public CodigoNcmExcetuaDTO codigo(String codigo) {
    this.codigo = codigo;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CodigoNcmExcetuaDTO {\n");
    
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

