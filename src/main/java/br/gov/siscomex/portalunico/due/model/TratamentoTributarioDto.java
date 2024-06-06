package br.gov.siscomex.portalunico.due.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.time.OffsetDateTime;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TratamentoTributarioDto", propOrder =
    { "dataDoRegistro", "fundamentoLegal", "regimeTributario", "tributos"
})

@XmlRootElement(name = "TratamentoTributarioDto")
public class TratamentoTributarioDto {
  
  @XmlElement(name="dataDoRegistro")
  @ApiModelProperty(example = "2019-09-20T14:13:46.966Z", value = "Data do registro<br />Formato:'yyyy-MM-dd'T'HH:mm:ss.SSSZ'")
 /**
   * Data do registro<br />Formato:'yyyy-MM-dd'T'HH:mm:ss.SSSZ'
  **/
  private OffsetDateTime dataDoRegistro = null;

  @XmlElement(name="fundamentoLegal")
  @ApiModelProperty(value = "")
  @Valid
  private FundamentoLegal fundamentoLegal = null;

  @XmlElement(name="regimeTributario")
  @ApiModelProperty(value = "")
  @Valid
  private RegimeTributarioDto regimeTributario = null;

  @XmlElement(name="tributos")
  @ApiModelProperty(value = "")
  @Valid
  private List<TratamentoTributoDto> tributos = null;
 /**
   * Data do registro&lt;br /&gt;Formato:&#39;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#39;
   * @return dataDoRegistro
  **/
  @JsonProperty("dataDoRegistro")
  public OffsetDateTime getDataDoRegistro() {
    return dataDoRegistro;
  }

  public void setDataDoRegistro(OffsetDateTime dataDoRegistro) {
    this.dataDoRegistro = dataDoRegistro;
  }

    public TratamentoTributarioDto dataDoRegistro(OffsetDateTime dataDoRegistro) {
    this.dataDoRegistro = dataDoRegistro;
    return this;
  }

 /**
   * Get fundamentoLegal
   * @return fundamentoLegal
  **/
  @JsonProperty("fundamentoLegal")
  public FundamentoLegal getFundamentoLegal() {
    return fundamentoLegal;
  }

  public void setFundamentoLegal(FundamentoLegal fundamentoLegal) {
    this.fundamentoLegal = fundamentoLegal;
  }

    public TratamentoTributarioDto fundamentoLegal(FundamentoLegal fundamentoLegal) {
    this.fundamentoLegal = fundamentoLegal;
    return this;
  }

 /**
   * Get regimeTributario
   * @return regimeTributario
  **/
  @JsonProperty("regimeTributario")
  public RegimeTributarioDto getRegimeTributario() {
    return regimeTributario;
  }

    public void setRegimeTributario(RegimeTributarioDto regimeTributario) {
    this.regimeTributario = regimeTributario;
  }

    public TratamentoTributarioDto regimeTributario(RegimeTributarioDto regimeTributario) {
    this.regimeTributario = regimeTributario;
    return this;
  }

 /**
   * Get tributos
   * @return tributos
  **/
  @JsonProperty("tributos")
  public List<TratamentoTributoDto> getTributos() {
    return tributos;
  }

  public void setTributos(List<TratamentoTributoDto> tributos) {
    this.tributos = tributos;
  }

    public TratamentoTributarioDto tributos(List<TratamentoTributoDto> tributos) {
    this.tributos = tributos;
    return this;
  }

    public TratamentoTributarioDto addTributosItem(TratamentoTributoDto tributosItem) {
    this.tributos.add(tributosItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
      sb.append("class TratamentoTributarioDto {\n");
    
    sb.append("    dataDoRegistro: ").append(toIndentedString(dataDoRegistro)).append("\n");
    sb.append("    fundamentoLegal: ").append(toIndentedString(fundamentoLegal)).append("\n");
    sb.append("    regimeTributario: ").append(toIndentedString(regimeTributario)).append("\n");
    sb.append("    tributos: ").append(toIndentedString(tributos)).append("\n");
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

