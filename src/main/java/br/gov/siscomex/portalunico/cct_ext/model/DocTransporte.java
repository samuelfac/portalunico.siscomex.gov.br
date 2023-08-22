package br.gov.siscomex.portalunico.cct_ext.model;

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
 @XmlType(name = "DocTransporte", propOrder =
    { "numero", "dataEmissao"
})

@XmlRootElement(name="DocTransporte")
/**
  * Dados do Documento de Transporte
 **/
@ApiModel(description="Dados do Documento de Transporte")
public class DocTransporte  {
  
  @XmlElement(name="numero", required = true)
  @ApiModelProperty(example = "BR554885728 AIRES", required = true, value = "Número do documento de transporte<br>Tamanho mínimo: 5<br>Tamanho Máximo: 15<br>Formato: BRNNNNNNNNNNNNN, onde 999999999 é um número sequencial.")
 /**
   * Número do documento de transporte<br>Tamanho mínimo: 5<br>Tamanho Máximo: 15<br>Formato: BRNNNNNNNNNNNNN, onde 999999999 é um número sequencial.
  **/
  private String numero = null;

  @XmlElement(name="dataEmissao", required = true)
  @ApiModelProperty(example = "2019-05-30", required = true, value = "Data de emissão do documento de transporte<br>Formato: AAAA-MM-DD")
 /**
   * Data de emissão do documento de transporte<br>Formato: AAAA-MM-DD
  **/
  private String dataEmissao = null;
 /**
   * Número do documento de transporte&lt;br&gt;Tamanho mínimo: 5&lt;br&gt;Tamanho Máximo: 15&lt;br&gt;Formato: BRNNNNNNNNNNNNN, onde 999999999 é um número sequencial.
   * @return numero
  **/
  @JsonProperty("numero")
  @NotNull
  public String getNumero() {
    return numero;
  }

  public void setNumero(String numero) {
    this.numero = numero;
  }

  public DocTransporte numero(String numero) {
    this.numero = numero;
    return this;
  }

 /**
   * Data de emissão do documento de transporte&lt;br&gt;Formato: AAAA-MM-DD
   * @return dataEmissao
  **/
  @JsonProperty("dataEmissao")
  @NotNull
  public String getDataEmissao() {
    return dataEmissao;
  }

  public void setDataEmissao(String dataEmissao) {
    this.dataEmissao = dataEmissao;
  }

  public DocTransporte dataEmissao(String dataEmissao) {
    this.dataEmissao = dataEmissao;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocTransporte {\n");
    
    sb.append("    numero: ").append(toIndentedString(numero)).append("\n");
    sb.append("    dataEmissao: ").append(toIndentedString(dataEmissao)).append("\n");
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

