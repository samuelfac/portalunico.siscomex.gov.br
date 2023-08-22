package br.gov.siscomex.portalunico.ttce.model;

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
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "ImpTratamentoTributarioDTO", propOrder =
    { "tributo", "regime", "fundamentoLegal", "vigencia", "mercadorias"
})

@XmlRootElement(name="ImpTratamentoTributarioDTO")
/**
  * Tratamento Tributário de Importação e Lista de atributos deste tratamento.
 **/
@ApiModel(description="Tratamento Tributário de Importação e Lista de atributos deste tratamento.")
public class ImpTratamentoTributarioDTO  {
  
  @XmlElement(name="tributo", required = true)
  @ApiModelProperty(required = true, value = "")
  @Valid
  private CodigoNomeTributoDTO tributo = null;

  @XmlElement(name="regime", required = true)
  @ApiModelProperty(required = true, value = "")
  @Valid
  private CodigoNomeRegimeDTO regime = null;

  @XmlElement(name="fundamentoLegal", required = true)
  @ApiModelProperty(required = true, value = "")
  @Valid
  private FundamentoLegalTratamentoDTO fundamentoLegal = null;

  @XmlElement(name="vigencia", required = true)
  @ApiModelProperty(required = true, value = "")
  @Valid
  private VigenciaTratamentoDTO vigencia = null;

  @XmlElement(name="mercadorias", required = true)
  @ApiModelProperty(required = true, value = "Lista de mercadorias (NCMs) que se enquadram neste Tratamento Tributário mas que possuem características específicas (lista de atributos) juntamente com sua vigência.")
  @Valid
 /**
   * Lista de mercadorias (NCMs) que se enquadram neste Tratamento Tributário mas que possuem características específicas (lista de atributos) juntamente com sua vigência.
  **/
  private List<MercadoriaDTO> mercadorias = new ArrayList<>();
 /**
   * Get tributo
   * @return tributo
  **/
  @JsonProperty("tributo")
  @NotNull
  public CodigoNomeTributoDTO getTributo() {
    return tributo;
  }

  public void setTributo(CodigoNomeTributoDTO tributo) {
    this.tributo = tributo;
  }

  public ImpTratamentoTributarioDTO tributo(CodigoNomeTributoDTO tributo) {
    this.tributo = tributo;
    return this;
  }

 /**
   * Get regime
   * @return regime
  **/
  @JsonProperty("regime")
  @NotNull
  public CodigoNomeRegimeDTO getRegime() {
    return regime;
  }

  public void setRegime(CodigoNomeRegimeDTO regime) {
    this.regime = regime;
  }

  public ImpTratamentoTributarioDTO regime(CodigoNomeRegimeDTO regime) {
    this.regime = regime;
    return this;
  }

 /**
   * Get fundamentoLegal
   * @return fundamentoLegal
  **/
  @JsonProperty("fundamentoLegal")
  @NotNull
  public FundamentoLegalTratamentoDTO getFundamentoLegal() {
    return fundamentoLegal;
  }

  public void setFundamentoLegal(FundamentoLegalTratamentoDTO fundamentoLegal) {
    this.fundamentoLegal = fundamentoLegal;
  }

  public ImpTratamentoTributarioDTO fundamentoLegal(FundamentoLegalTratamentoDTO fundamentoLegal) {
    this.fundamentoLegal = fundamentoLegal;
    return this;
  }

 /**
   * Get vigencia
   * @return vigencia
  **/
  @JsonProperty("vigencia")
  @NotNull
  public VigenciaTratamentoDTO getVigencia() {
    return vigencia;
  }

  public void setVigencia(VigenciaTratamentoDTO vigencia) {
    this.vigencia = vigencia;
  }

  public ImpTratamentoTributarioDTO vigencia(VigenciaTratamentoDTO vigencia) {
    this.vigencia = vigencia;
    return this;
  }

 /**
   * Lista de mercadorias (NCMs) que se enquadram neste Tratamento Tributário mas que possuem características específicas (lista de atributos) juntamente com sua vigência.
   * @return mercadorias
  **/
  @JsonProperty("mercadorias")
  @NotNull
  public List<MercadoriaDTO> getMercadorias() {
    return mercadorias;
  }

  public void setMercadorias(List<MercadoriaDTO> mercadorias) {
    this.mercadorias = mercadorias;
  }

  public ImpTratamentoTributarioDTO mercadorias(List<MercadoriaDTO> mercadorias) {
    this.mercadorias = mercadorias;
    return this;
  }

  public ImpTratamentoTributarioDTO addMercadoriasItem(MercadoriaDTO mercadoriasItem) {
    this.mercadorias.add(mercadoriasItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImpTratamentoTributarioDTO {\n");
    
    sb.append("    tributo: ").append(toIndentedString(tributo)).append("\n");
    sb.append("    regime: ").append(toIndentedString(regime)).append("\n");
    sb.append("    fundamentoLegal: ").append(toIndentedString(fundamentoLegal)).append("\n");
    sb.append("    vigencia: ").append(toIndentedString(vigencia)).append("\n");
    sb.append("    mercadorias: ").append(toIndentedString(mercadorias)).append("\n");
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

