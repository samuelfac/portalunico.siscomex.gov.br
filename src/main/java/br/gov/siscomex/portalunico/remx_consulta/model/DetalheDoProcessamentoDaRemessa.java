package br.gov.siscomex.portalunico.remx_consulta.model;

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
 @XmlType(name = "DetalheDoProcessamentoDaRemessa", propOrder =
    { "divergencias", "novaSituacaoRemessa", "numeroRemessa", "ocorrencias", "totalVolumesRecebidos"
})

@XmlRootElement(name="DetalheDoProcessamentoDaRemessa")
public class DetalheDoProcessamentoDaRemessa  {
  
  @XmlElement(name="divergencias")
  @ApiModelProperty(value = "Lista de Divergências")
  @Valid
 /**
   * Lista de Divergências
  **/
  private List<Divergncia> divergencias = null;

  @XmlElement(name="novaSituacaoRemessa", required = true)
  @ApiModelProperty(required = true, value = "Contém a nova situação da remessa.")
 /**
   * Contém a nova situação da remessa.
  **/
  private Integer novaSituacaoRemessa = null;

  @XmlElement(name="numeroRemessa", required = true)
  @ApiModelProperty(required = true, value = "Contém o número da remessa.")
 /**
   * Contém o número da remessa.
  **/
  private String numeroRemessa = null;

  @XmlElement(name="ocorrencias")
  @ApiModelProperty(value = "Lista de Ocorrências")
  @Valid
 /**
   * Lista de Ocorrências
  **/
  private List<Ocorrncia> ocorrencias = null;

  @XmlElement(name="totalVolumesRecebidos", required = true)
  @ApiModelProperty(required = true, value = "Contém o total de volumes recebidos da remessa em todas as presenças de carga.")
 /**
   * Contém o total de volumes recebidos da remessa em todas as presenças de carga.
  **/
  private Integer totalVolumesRecebidos = null;
 /**
   * Lista de Divergências
   * @return divergencias
  **/
  @JsonProperty("divergencias")
  public List<Divergncia> getDivergencias() {
    return divergencias;
  }

  public void setDivergencias(List<Divergncia> divergencias) {
    this.divergencias = divergencias;
  }

  public DetalheDoProcessamentoDaRemessa divergencias(List<Divergncia> divergencias) {
    this.divergencias = divergencias;
    return this;
  }

  public DetalheDoProcessamentoDaRemessa addDivergenciasItem(Divergncia divergenciasItem) {
    this.divergencias.add(divergenciasItem);
    return this;
  }

 /**
   * Contém a nova situação da remessa.
   * @return novaSituacaoRemessa
  **/
  @JsonProperty("novaSituacaoRemessa")
  @NotNull
  public Integer getNovaSituacaoRemessa() {
    return novaSituacaoRemessa;
  }

  public void setNovaSituacaoRemessa(Integer novaSituacaoRemessa) {
    this.novaSituacaoRemessa = novaSituacaoRemessa;
  }

  public DetalheDoProcessamentoDaRemessa novaSituacaoRemessa(Integer novaSituacaoRemessa) {
    this.novaSituacaoRemessa = novaSituacaoRemessa;
    return this;
  }

 /**
   * Contém o número da remessa.
   * @return numeroRemessa
  **/
  @JsonProperty("numeroRemessa")
  @NotNull
  public String getNumeroRemessa() {
    return numeroRemessa;
  }

  public void setNumeroRemessa(String numeroRemessa) {
    this.numeroRemessa = numeroRemessa;
  }

  public DetalheDoProcessamentoDaRemessa numeroRemessa(String numeroRemessa) {
    this.numeroRemessa = numeroRemessa;
    return this;
  }

 /**
   * Lista de Ocorrências
   * @return ocorrencias
  **/
  @JsonProperty("ocorrencias")
  public List<Ocorrncia> getOcorrencias() {
    return ocorrencias;
  }

  public void setOcorrencias(List<Ocorrncia> ocorrencias) {
    this.ocorrencias = ocorrencias;
  }

  public DetalheDoProcessamentoDaRemessa ocorrencias(List<Ocorrncia> ocorrencias) {
    this.ocorrencias = ocorrencias;
    return this;
  }

  public DetalheDoProcessamentoDaRemessa addOcorrenciasItem(Ocorrncia ocorrenciasItem) {
    this.ocorrencias.add(ocorrenciasItem);
    return this;
  }

 /**
   * Contém o total de volumes recebidos da remessa em todas as presenças de carga.
   * @return totalVolumesRecebidos
  **/
  @JsonProperty("totalVolumesRecebidos")
  @NotNull
  public Integer getTotalVolumesRecebidos() {
    return totalVolumesRecebidos;
  }

  public void setTotalVolumesRecebidos(Integer totalVolumesRecebidos) {
    this.totalVolumesRecebidos = totalVolumesRecebidos;
  }

  public DetalheDoProcessamentoDaRemessa totalVolumesRecebidos(Integer totalVolumesRecebidos) {
    this.totalVolumesRecebidos = totalVolumesRecebidos;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetalheDoProcessamentoDaRemessa {\n");
    
    sb.append("    divergencias: ").append(toIndentedString(divergencias)).append("\n");
    sb.append("    novaSituacaoRemessa: ").append(toIndentedString(novaSituacaoRemessa)).append("\n");
    sb.append("    numeroRemessa: ").append(toIndentedString(numeroRemessa)).append("\n");
    sb.append("    ocorrencias: ").append(toIndentedString(ocorrencias)).append("\n");
    sb.append("    totalVolumesRecebidos: ").append(toIndentedString(totalVolumesRecebidos)).append("\n");
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

