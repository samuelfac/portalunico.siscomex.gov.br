package br.gov.siscomex.portalunico.cct_ext.model;

import java.util.List;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "VeiculoRodoviario", propOrder =
    { "cpfCondutor", "documentoCondutorEstrangeiro", "nomeCondutorEstrangeiro", "veiculos"
})

@XmlRootElement(name="VeiculoRodoviario")
/**
  * Dados do veículo rodoviário
 **/
@ApiModel(description="Dados do veículo rodoviário")
public class VeiculoRodoviario  {
  
  @XmlElement(name="cpfCondutor")
  @ApiModelProperty(example = "15573459106", value = "CPF do condutor<br>Informado quando o condutor for brasileiro<br>Tamanho: 11<br>Formato: NNNNNNNNNNN")
 /**
   * CPF do condutor<br>Informado quando o condutor for brasileiro<br>Tamanho: 11<br>Formato: NNNNNNNNNNN
  **/
  private String cpfCondutor = null;

  @XmlElement(name="documentoCondutorEstrangeiro")
  @ApiModelProperty(example = "15573459000106", value = "Documento de identificação do condutor estrangeiro<br>Informado quando o condutor for estrangeiro juntamente com o nome do condutor<br>Tamanho: 15")
 /**
   * Documento de identificação do condutor estrangeiro<br>Informado quando o condutor for estrangeiro juntamente com o nome do condutor<br>Tamanho: 15
  **/
  private String documentoCondutorEstrangeiro = null;

  @XmlElement(name="nomeCondutorEstrangeiro")
  @ApiModelProperty(example = "Nome do Condutor", value = "Nome do condutor estrangeiro<br>Informado quando o condutor for estrangeiro juntamente com o documento do condutor<br>Tamanho: 60")
 /**
   * Nome do condutor estrangeiro<br>Informado quando o condutor for estrangeiro juntamente com o documento do condutor<br>Tamanho: 60
  **/
  private String nomeCondutorEstrangeiro = null;

  @XmlElement(name="veiculos")
  @ApiModelProperty(value = "Informação de cada veiculo envolvido no trânsito<br>Máximo de 4 veículos diferentes entre si. Esta tag contém os dados do \"cavalo\" e seus reboques e será obedecida a seguinte ordem nas informações de veículo rodoviário quando informado : Truck/Cavalo, 1º Reboque, 2º Reboque e 3º Reboque;")
  @Valid
 /**
   * Informação de cada veiculo envolvido no trânsito<br>Máximo de 4 veículos diferentes entre si. Esta tag contém os dados do \"cavalo\" e seus reboques e será obedecida a seguinte ordem nas informações de veículo rodoviário quando informado : Truck/Cavalo, 1º Reboque, 2º Reboque e 3º Reboque;
  **/
  private List<Veiculo> veiculos = null;
 /**
   * CPF do condutor&lt;br&gt;Informado quando o condutor for brasileiro&lt;br&gt;Tamanho: 11&lt;br&gt;Formato: NNNNNNNNNNN
   * @return cpfCondutor
  **/
  @JsonProperty("cpfCondutor")
  public String getCpfCondutor() {
    return cpfCondutor;
  }

  public void setCpfCondutor(String cpfCondutor) {
    this.cpfCondutor = cpfCondutor;
  }

  public VeiculoRodoviario cpfCondutor(String cpfCondutor) {
    this.cpfCondutor = cpfCondutor;
    return this;
  }

 /**
   * Documento de identificação do condutor estrangeiro&lt;br&gt;Informado quando o condutor for estrangeiro juntamente com o nome do condutor&lt;br&gt;Tamanho: 15
   * @return documentoCondutorEstrangeiro
  **/
  @JsonProperty("documentoCondutorEstrangeiro")
  public String getDocumentoCondutorEstrangeiro() {
    return documentoCondutorEstrangeiro;
  }

  public void setDocumentoCondutorEstrangeiro(String documentoCondutorEstrangeiro) {
    this.documentoCondutorEstrangeiro = documentoCondutorEstrangeiro;
  }

  public VeiculoRodoviario documentoCondutorEstrangeiro(String documentoCondutorEstrangeiro) {
    this.documentoCondutorEstrangeiro = documentoCondutorEstrangeiro;
    return this;
  }

 /**
   * Nome do condutor estrangeiro&lt;br&gt;Informado quando o condutor for estrangeiro juntamente com o documento do condutor&lt;br&gt;Tamanho: 60
   * @return nomeCondutorEstrangeiro
  **/
  @JsonProperty("nomeCondutorEstrangeiro")
  public String getNomeCondutorEstrangeiro() {
    return nomeCondutorEstrangeiro;
  }

  public void setNomeCondutorEstrangeiro(String nomeCondutorEstrangeiro) {
    this.nomeCondutorEstrangeiro = nomeCondutorEstrangeiro;
  }

  public VeiculoRodoviario nomeCondutorEstrangeiro(String nomeCondutorEstrangeiro) {
    this.nomeCondutorEstrangeiro = nomeCondutorEstrangeiro;
    return this;
  }

 /**
   * Informação de cada veiculo envolvido no trânsito&lt;br&gt;Máximo de 4 veículos diferentes entre si. Esta tag contém os dados do \&quot;cavalo\&quot; e seus reboques e será obedecida a seguinte ordem nas informações de veículo rodoviário quando informado : Truck/Cavalo, 1º Reboque, 2º Reboque e 3º Reboque;
   * @return veiculos
  **/
  @JsonProperty("veiculos")
  public List<Veiculo> getVeiculos() {
    return veiculos;
  }

  public void setVeiculos(List<Veiculo> veiculos) {
    this.veiculos = veiculos;
  }

  public VeiculoRodoviario veiculos(List<Veiculo> veiculos) {
    this.veiculos = veiculos;
    return this;
  }

  public VeiculoRodoviario addVeiculosItem(Veiculo veiculosItem) {
    this.veiculos.add(veiculosItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VeiculoRodoviario {\n");
    
    sb.append("    cpfCondutor: ").append(toIndentedString(cpfCondutor)).append("\n");
    sb.append("    documentoCondutorEstrangeiro: ").append(toIndentedString(documentoCondutorEstrangeiro)).append("\n");
    sb.append("    nomeCondutorEstrangeiro: ").append(toIndentedString(nomeCondutorEstrangeiro)).append("\n");
    sb.append("    veiculos: ").append(toIndentedString(veiculos)).append("\n");
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

