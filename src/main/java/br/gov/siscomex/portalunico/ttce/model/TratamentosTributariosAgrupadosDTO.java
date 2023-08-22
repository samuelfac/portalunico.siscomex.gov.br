package br.gov.siscomex.portalunico.ttce.model;

import br.gov.siscomex.portalunico.ttce.model.ImpTratamentoTributarioDTO;
import br.gov.siscomex.portalunico.ttce.model.NcmsDTO;
import br.gov.siscomex.portalunico.ttce.model.PaisesBlocosDTO;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
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

