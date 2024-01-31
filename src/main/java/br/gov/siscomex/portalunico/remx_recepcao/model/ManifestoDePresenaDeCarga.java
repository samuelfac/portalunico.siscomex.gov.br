package br.gov.siscomex.portalunico.remx_recepcao.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "ManifestoDePresenaDeCarga", propOrder =
    { "cnpjDeclarante", "numeroManifesto", "remessas"
})

@XmlRootElement(name="ManifestoDePresenaDeCarga")
public class ManifestoDePresenaDeCarga  {
  
  @XmlElement(name="cnpjDeclarante", required = true)
  @ApiModelProperty(example = "63198378000161", required = true, value = "Contém o CNPJ da empresa a qual o manifesto enviado pertence.<br/>Tamanho: 14 <br/>Formato: 'NNNNNNNNNNNNNN'")
 /**
   * Contém o CNPJ da empresa a qual o manifesto enviado pertence.<br/>Tamanho: 14 <br/>Formato: 'NNNNNNNNNNNNNN'
  **/
  private String cnpjDeclarante = null;

  @XmlElement(name="numeroManifesto", required = true)
  @ApiModelProperty(example = "SRP201300000017", required = true, value = "Contém o número do manifesto para o qual se deseja infomar a presença de carga. O número do manifesto é composto por 15 caracteres alfanuméricos. <br/>Tamanho: 15")
 /**
   * Contém o número do manifesto para o qual se deseja infomar a presença de carga. O número do manifesto é composto por 15 caracteres alfanuméricos. <br/>Tamanho: 15
  **/
  private String numeroManifesto = null;

  @XmlElement(name="remessas")
  @ApiModelProperty(value = "Lista de remessas (máximo: 3000 itens)")
  @Valid
 /**
   * Lista de remessas (máximo: 3000 itens)
  **/
  private List<InformaesDaRemessa> remessas = null;
 /**
   * Contém o CNPJ da empresa a qual o manifesto enviado pertence.&lt;br/&gt;Tamanho: 14 &lt;br/&gt;Formato: &#39;NNNNNNNNNNNNNN&#39;
   * @return cnpjDeclarante
  **/
  @JsonProperty("cnpjDeclarante")
  @NotNull
  public String getCnpjDeclarante() {
    return cnpjDeclarante;
  }

  public void setCnpjDeclarante(String cnpjDeclarante) {
    this.cnpjDeclarante = cnpjDeclarante;
  }

  public ManifestoDePresenaDeCarga cnpjDeclarante(String cnpjDeclarante) {
    this.cnpjDeclarante = cnpjDeclarante;
    return this;
  }

 /**
   * Contém o número do manifesto para o qual se deseja infomar a presença de carga. O número do manifesto é composto por 15 caracteres alfanuméricos. &lt;br/&gt;Tamanho: 15
   * @return numeroManifesto
  **/
  @JsonProperty("numeroManifesto")
  @NotNull
  public String getNumeroManifesto() {
    return numeroManifesto;
  }

  public void setNumeroManifesto(String numeroManifesto) {
    this.numeroManifesto = numeroManifesto;
  }

  public ManifestoDePresenaDeCarga numeroManifesto(String numeroManifesto) {
    this.numeroManifesto = numeroManifesto;
    return this;
  }

 /**
   * Lista de remessas (máximo: 3000 itens)
   * @return remessas
  **/
  @JsonProperty("remessas")
  public List<InformaesDaRemessa> getRemessas() {
    return remessas;
  }

  public void setRemessas(List<InformaesDaRemessa> remessas) {
    this.remessas = remessas;
  }

  public ManifestoDePresenaDeCarga remessas(List<InformaesDaRemessa> remessas) {
    this.remessas = remessas;
    return this;
  }

  public ManifestoDePresenaDeCarga addRemessasItem(InformaesDaRemessa remessasItem) {
    this.remessas.add(remessasItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ManifestoDePresenaDeCarga {\n");
    
    sb.append("    cnpjDeclarante: ").append(toIndentedString(cnpjDeclarante)).append("\n");
    sb.append("    numeroManifesto: ").append(toIndentedString(numeroManifesto)).append("\n");
    sb.append("    remessas: ").append(toIndentedString(remessas)).append("\n");
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

