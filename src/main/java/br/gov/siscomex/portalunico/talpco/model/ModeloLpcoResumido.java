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
 @XmlType(name = "ModeloLpcoResumido", propOrder =
    { "codigo", "nome", "preenchimento"
})

@XmlRootElement(name="ModeloLpcoResumido")
/**
  * Dados resumidos de um modelo de LPCO
 **/
@ApiModel(description="Dados resumidos de um modelo de LPCO")
public class ModeloLpcoResumido  {
  
  @XmlElement(name="codigo", required = true)
  @ApiModelProperty(example = "E00104", required = true, value = "Código do modelo de LPCO<br>Tamanho: 6<br>Formato: ONNNNN<br>Lei de formação: O número do modelo de LPCO é composto por:<br>* O = Operação (E para exportação, I para importação)<br>* NNNNN = Número sequencial do LPCO no ano")
 /**
   * Código do modelo de LPCO<br>Tamanho: 6<br>Formato: ONNNNN<br>Lei de formação: O número do modelo de LPCO é composto por:<br>* O = Operação (E para exportação, I para importação)<br>* NNNNN = Número sequencial do LPCO no ano
  **/
  private String codigo = null;

  @XmlElement(name="nome", required = true)
  @ApiModelProperty(example = "Certificação para Produtos de Origem Vegetal - Embarque Antecipado", required = true, value = "Nome do modelo de LPCO<br>Tamanho mínimo: 1<br>Tamanho máximo: 100")
 /**
   * Nome do modelo de LPCO<br>Tamanho mínimo: 1<br>Tamanho máximo: 100
  **/
  private String nome = null;

  @XmlElement(name="preenchimento", required = true)
  @ApiModelProperty(required = true, value = "Forma de preenchimento do modelo, se pelo importador/exportador, de ofício, ou ambos.")
 /**
   * Forma de preenchimento do modelo, se pelo importador/exportador, de ofício, ou ambos.
  **/
  private String preenchimento = null;
 /**
   * Código do modelo de LPCO&lt;br&gt;Tamanho: 6&lt;br&gt;Formato: ONNNNN&lt;br&gt;Lei de formação: O número do modelo de LPCO é composto por:&lt;br&gt;* O &#x3D; Operação (E para exportação, I para importação)&lt;br&gt;* NNNNN &#x3D; Número sequencial do LPCO no ano
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

  public ModeloLpcoResumido codigo(String codigo) {
    this.codigo = codigo;
    return this;
  }

 /**
   * Nome do modelo de LPCO&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 100
   * @return nome
  **/
  @JsonProperty("nome")
  @NotNull
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public ModeloLpcoResumido nome(String nome) {
    this.nome = nome;
    return this;
  }

 /**
   * Forma de preenchimento do modelo, se pelo importador/exportador, de ofício, ou ambos.
   * @return preenchimento
  **/
  @JsonProperty("preenchimento")
  @NotNull
  public String getPreenchimento() {
    return preenchimento;
  }

  public void setPreenchimento(String preenchimento) {
    this.preenchimento = preenchimento;
  }

  public ModeloLpcoResumido preenchimento(String preenchimento) {
    this.preenchimento = preenchimento;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModeloLpcoResumido {\n");
    
    sb.append("    codigo: ").append(toIndentedString(codigo)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    preenchimento: ").append(toIndentedString(preenchimento)).append("\n");
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

