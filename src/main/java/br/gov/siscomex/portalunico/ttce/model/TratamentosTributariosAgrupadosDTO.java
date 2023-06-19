package br.gov.siscomex.portalunico.ttce.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.xml.bind.annotation.*;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "TratamentosTributariosAgrupadosDTO", propOrder =
    { "ncm", "paisesBlocos", "tratamentosTributarios"
})

@XmlRootElement(name="TratamentosTributariosAgrupadosDTO")
/**
  * Tratamentos Tributários de Importação, agrupados por configuração de NCMs e Países/Blocos.
 **/
@ApiModel(description="Tratamentos Tributários de Importação, agrupados por configuração de NCMs e Países/Blocos.")
public class TratamentosTributariosAgrupadosDTO  {
  
  @XmlElement(name="ncm")
  @ApiModelProperty(value = "")
  @Valid
  private NcmsDTO ncm = null;

  @XmlElement(name="paisesBlocos")
  @ApiModelProperty(value = "")
  @Valid
  private PaisesBlocosDTO paisesBlocos = null;

  @XmlElement(name="tratamentosTributarios")
  @ApiModelProperty(value = "Lista contendo os Tratamentos Tributários de Importação para esta configuração de NCMs e Países/Blocos.")
  @Valid
 /**
   * Lista contendo os Tratamentos Tributários de Importação para esta configuração de NCMs e Países/Blocos.
  **/
  private List<ImpTratamentoTributarioDTO> tratamentosTributarios = null;
 /**
   * Get ncm
   * @return ncm
  **/
  @JsonProperty("ncm")
  public NcmsDTO getNcm() {
    return ncm;
  }

  public void setNcm(NcmsDTO ncm) {
    this.ncm = ncm;
  }

  public TratamentosTributariosAgrupadosDTO ncm(NcmsDTO ncm) {
    this.ncm = ncm;
    return this;
  }

 /**
   * Get paisesBlocos
   * @return paisesBlocos
  **/
  @JsonProperty("paisesBlocos")
  public PaisesBlocosDTO getPaisesBlocos() {
    return paisesBlocos;
  }

  public void setPaisesBlocos(PaisesBlocosDTO paisesBlocos) {
    this.paisesBlocos = paisesBlocos;
  }

  public TratamentosTributariosAgrupadosDTO paisesBlocos(PaisesBlocosDTO paisesBlocos) {
    this.paisesBlocos = paisesBlocos;
    return this;
  }

 /**
   * Lista contendo os Tratamentos Tributários de Importação para esta configuração de NCMs e Países/Blocos.
   * @return tratamentosTributarios
  **/
  @JsonProperty("tratamentosTributarios")
  public List<ImpTratamentoTributarioDTO> getTratamentosTributarios() {
    return tratamentosTributarios;
  }

  public void setTratamentosTributarios(List<ImpTratamentoTributarioDTO> tratamentosTributarios) {
    this.tratamentosTributarios = tratamentosTributarios;
  }

  public TratamentosTributariosAgrupadosDTO tratamentosTributarios(List<ImpTratamentoTributarioDTO> tratamentosTributarios) {
    this.tratamentosTributarios = tratamentosTributarios;
    return this;
  }

  public TratamentosTributariosAgrupadosDTO addTratamentosTributariosItem(ImpTratamentoTributarioDTO tratamentosTributariosItem) {
    this.tratamentosTributarios.add(tratamentosTributariosItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TratamentosTributariosAgrupadosDTO {\n");
    
    sb.append("    ncm: ").append(toIndentedString(ncm)).append("\n");
    sb.append("    paisesBlocos: ").append(toIndentedString(paisesBlocos)).append("\n");
    sb.append("    tratamentosTributarios: ").append(toIndentedString(tratamentosTributarios)).append("\n");
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

