package br.gov.siscomex.portalunico.cct_ext.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.xml.bind.annotation.*;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "VeiculoRodoviarioDTO", propOrder =
    { "indTtransportadorProprietario", "cpjCnpjResponsavel", "cpfCondutor", "numeroDocCondutorEstrangeiro", "nomeCondutorEstrangeiro", "veiculos"
})

@XmlRootElement(name="VeiculoRodoviarioDTO")
public class VeiculoRodoviarioDTO  {
  
  @XmlElement(name="indTtransportadorProprietario")
  @ApiModelProperty(value = "")
  private String indTtransportadorProprietario = null;

  @XmlElement(name="cpjCnpjResponsavel")
  @ApiModelProperty(value = "")
  private String cpjCnpjResponsavel = null;

  @XmlElement(name="cpfCondutor")
  @ApiModelProperty(value = "")
  private String cpfCondutor = null;

  @XmlElement(name="numeroDocCondutorEstrangeiro")
  @ApiModelProperty(value = "")
  private String numeroDocCondutorEstrangeiro = null;

  @XmlElement(name="nomeCondutorEstrangeiro")
  @ApiModelProperty(value = "")
  private String nomeCondutorEstrangeiro = null;

  @XmlElement(name="veiculos")
  @ApiModelProperty(value = "")
  @Valid
  private List<VeiculoDTO> veiculos = null;
 /**
   * Get indTtransportadorProprietario
   * @return indTtransportadorProprietario
  **/
  @JsonProperty("indTtransportadorProprietario")
  public String getIndTtransportadorProprietario() {
    return indTtransportadorProprietario;
  }

  public void setIndTtransportadorProprietario(String indTtransportadorProprietario) {
    this.indTtransportadorProprietario = indTtransportadorProprietario;
  }

  public VeiculoRodoviarioDTO indTtransportadorProprietario(String indTtransportadorProprietario) {
    this.indTtransportadorProprietario = indTtransportadorProprietario;
    return this;
  }

 /**
   * Get cpjCnpjResponsavel
   * @return cpjCnpjResponsavel
  **/
  @JsonProperty("cpjCnpjResponsavel")
  public String getCpjCnpjResponsavel() {
    return cpjCnpjResponsavel;
  }

  public void setCpjCnpjResponsavel(String cpjCnpjResponsavel) {
    this.cpjCnpjResponsavel = cpjCnpjResponsavel;
  }

  public VeiculoRodoviarioDTO cpjCnpjResponsavel(String cpjCnpjResponsavel) {
    this.cpjCnpjResponsavel = cpjCnpjResponsavel;
    return this;
  }

 /**
   * Get cpfCondutor
   * @return cpfCondutor
  **/
  @JsonProperty("cpfCondutor")
  public String getCpfCondutor() {
    return cpfCondutor;
  }

  public void setCpfCondutor(String cpfCondutor) {
    this.cpfCondutor = cpfCondutor;
  }

  public VeiculoRodoviarioDTO cpfCondutor(String cpfCondutor) {
    this.cpfCondutor = cpfCondutor;
    return this;
  }

 /**
   * Get numeroDocCondutorEstrangeiro
   * @return numeroDocCondutorEstrangeiro
  **/
  @JsonProperty("numeroDocCondutorEstrangeiro")
  public String getNumeroDocCondutorEstrangeiro() {
    return numeroDocCondutorEstrangeiro;
  }

  public void setNumeroDocCondutorEstrangeiro(String numeroDocCondutorEstrangeiro) {
    this.numeroDocCondutorEstrangeiro = numeroDocCondutorEstrangeiro;
  }

  public VeiculoRodoviarioDTO numeroDocCondutorEstrangeiro(String numeroDocCondutorEstrangeiro) {
    this.numeroDocCondutorEstrangeiro = numeroDocCondutorEstrangeiro;
    return this;
  }

 /**
   * Get nomeCondutorEstrangeiro
   * @return nomeCondutorEstrangeiro
  **/
  @JsonProperty("nomeCondutorEstrangeiro")
  public String getNomeCondutorEstrangeiro() {
    return nomeCondutorEstrangeiro;
  }

  public void setNomeCondutorEstrangeiro(String nomeCondutorEstrangeiro) {
    this.nomeCondutorEstrangeiro = nomeCondutorEstrangeiro;
  }

  public VeiculoRodoviarioDTO nomeCondutorEstrangeiro(String nomeCondutorEstrangeiro) {
    this.nomeCondutorEstrangeiro = nomeCondutorEstrangeiro;
    return this;
  }

 /**
   * Get veiculos
   * @return veiculos
  **/
  @JsonProperty("veiculos")
  public List<VeiculoDTO> getVeiculos() {
    return veiculos;
  }

  public void setVeiculos(List<VeiculoDTO> veiculos) {
    this.veiculos = veiculos;
  }

  public VeiculoRodoviarioDTO veiculos(List<VeiculoDTO> veiculos) {
    this.veiculos = veiculos;
    return this;
  }

  public VeiculoRodoviarioDTO addVeiculosItem(VeiculoDTO veiculosItem) {
    this.veiculos.add(veiculosItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VeiculoRodoviarioDTO {\n");
    
    sb.append("    indTtransportadorProprietario: ").append(toIndentedString(indTtransportadorProprietario)).append("\n");
    sb.append("    cpjCnpjResponsavel: ").append(toIndentedString(cpjCnpjResponsavel)).append("\n");
    sb.append("    cpfCondutor: ").append(toIndentedString(cpfCondutor)).append("\n");
    sb.append("    numeroDocCondutorEstrangeiro: ").append(toIndentedString(numeroDocCondutorEstrangeiro)).append("\n");
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

