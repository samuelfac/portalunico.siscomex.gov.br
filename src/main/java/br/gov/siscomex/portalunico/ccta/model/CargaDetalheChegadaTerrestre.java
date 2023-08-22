package br.gov.siscomex.portalunico.ccta.model;

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
 @XmlType(name = "CargaDetalheChegadaTerrestre", propOrder =
    { "codigoRecintoChegada", "codigoRecintoPartida", "codigoUaChegada", "codigoUaPartida", "dataHoraChegada", "dataHoraPartida", "numeroDta", "placa", "termo", "uf", "veiculoRegistradoNoMantra"
})

@XmlRootElement(name="CargaDetalheChegadaTerrestre")
public class CargaDetalheChegadaTerrestre  {
  
  @XmlElement(name="codigoRecintoChegada")
  @ApiModelProperty(example = "8911101", value = "Código do Recinto Aduaneiro de chegada.<br/>Tamanho: 7<br/>Formato: inteiro com até 7 dígitos")
 /**
   * Código do Recinto Aduaneiro de chegada.<br/>Tamanho: 7<br/>Formato: inteiro com até 7 dígitos
  **/
  private String codigoRecintoChegada = null;

  @XmlElement(name="codigoRecintoPartida")
  @ApiModelProperty(example = "8911101", value = "Código do Recinto Aduaneiro de partida.<br/>Tamanho: 7<br/>Formato: inteiro com até 7 dígitos")
 /**
   * Código do Recinto Aduaneiro de partida.<br/>Tamanho: 7<br/>Formato: inteiro com até 7 dígitos
  **/
  private String codigoRecintoPartida = null;

  @XmlElement(name="codigoUaChegada")
  @ApiModelProperty(example = "0817600", value = "Unidade da RFB de chegada<br/> Tamanho: 7<br/>Formato: AAAAAAA")
 /**
   * Unidade da RFB de chegada<br/> Tamanho: 7<br/>Formato: AAAAAAA
  **/
  private String codigoUaChegada = null;

  @XmlElement(name="codigoUaPartida")
  @ApiModelProperty(example = "0817600", value = "Unidade da RFB de partida<br/> Tamanho: 7<br/>Formato: AAAAAAA")
 /**
   * Unidade da RFB de partida<br/> Tamanho: 7<br/>Formato: AAAAAAA
  **/
  private String codigoUaPartida = null;

  @XmlElement(name="dataHoraChegada")
  @ApiModelProperty(example = "2020-04-08T15:30:00-03:00", value = "Data/Hora de chegada.<br/> Formato: yyyy-MM-dd'T'HH:mm:ssZ")
 /**
   * Data/Hora de chegada.<br/> Formato: yyyy-MM-dd'T'HH:mm:ssZ
  **/
  private String dataHoraChegada = null;

  @XmlElement(name="dataHoraPartida")
  @ApiModelProperty(example = "2020-04-08T11:00:00-03:00", value = "Data/Hora de partida.<br/> Formato: yyyy-MM-dd'T'HH:mm:ssZ")
 /**
   * Data/Hora de partida.<br/> Formato: yyyy-MM-dd'T'HH:mm:ssZ
  **/
  private String dataHoraPartida = null;

  @XmlElement(name="numeroDta")
  @ApiModelProperty(example = "2000017171", value = "Número do DTA<br/>Este campo é obrigatório na entrega intermediária entre depositário e transportador terrestre e opcional para as demais entregas intermediárias que escolham os motivos TRANSITO_INTERNACIONAL ou TRANSITO_NACIONAL.</br>Para os demais motivos não deve ser informado.<br/><br/>Tamanho mínimo: 8<br/>Tamanho máximo: 15<br/> Formato: AAAAAAAAAAAAAAA<br/><br/>")
 /**
   * Número do DTA<br/>Este campo é obrigatório na entrega intermediária entre depositário e transportador terrestre e opcional para as demais entregas intermediárias que escolham os motivos TRANSITO_INTERNACIONAL ou TRANSITO_NACIONAL.</br>Para os demais motivos não deve ser informado.<br/><br/>Tamanho mínimo: 8<br/>Tamanho máximo: 15<br/> Formato: AAAAAAAAAAAAAAA<br/><br/>
  **/
  private String numeroDta = null;

  @XmlElement(name="placa")
  @ApiModelProperty(example = "JOS1200, AIJ8R76", value = "Placa do veículo terrestre.<br/>Tamanho: 7<br/>Formato: AAANNNN ou AAANANN")
 /**
   * Placa do veículo terrestre.<br/>Tamanho: 7<br/>Formato: AAANNNN ou AAANANN
  **/
  private String placa = null;

  @XmlElement(name="termo")
  @ApiModelProperty(example = "209876543", value = "Número do termo gerado no sistema Mantra<br/>Tamanho: 9<br/>Formato: NNNNNNNNN")
 /**
   * Número do termo gerado no sistema Mantra<br/>Tamanho: 9<br/>Formato: NNNNNNNNN
  **/
  private String termo = null;


@XmlType(name="UfEnum")
@XmlEnum(String.class)
public enum UfEnum {

	@XmlEnumValue("AC")
	@JsonProperty("AC")
	AC(String.valueOf("AC")),
	
	@XmlEnumValue("AL")
	@JsonProperty("AL")
	AL(String.valueOf("AL")),
	
	@XmlEnumValue("AM")
	@JsonProperty("AM")
	AM(String.valueOf("AM")),
	
	@XmlEnumValue("AP")
	@JsonProperty("AP")
	AP(String.valueOf("AP")),
	
	@XmlEnumValue("BA")
	@JsonProperty("BA")
	BA(String.valueOf("BA")),
	
	@XmlEnumValue("CE")
	@JsonProperty("CE")
	CE(String.valueOf("CE")),
	
	@XmlEnumValue("DF")
	@JsonProperty("DF")
	DF(String.valueOf("DF")),
	
	@XmlEnumValue("ES")
	@JsonProperty("ES")
	ES(String.valueOf("ES")),
	
	@XmlEnumValue("GO")
	@JsonProperty("GO")
	GO(String.valueOf("GO")),
	
	@XmlEnumValue("MA")
	@JsonProperty("MA")
	MA(String.valueOf("MA")),
	
	@XmlEnumValue("MG")
	@JsonProperty("MG")
	MG(String.valueOf("MG")),
	
	@XmlEnumValue("MS")
	@JsonProperty("MS")
	MS(String.valueOf("MS")),
	
	@XmlEnumValue("MT")
	@JsonProperty("MT")
	MT(String.valueOf("MT")),
	
	@XmlEnumValue("PA")
	@JsonProperty("PA")
	PA(String.valueOf("PA")),
	
	@XmlEnumValue("PB")
	@JsonProperty("PB")
	PB(String.valueOf("PB")),
	
	@XmlEnumValue("PE")
	@JsonProperty("PE")
	PE(String.valueOf("PE")),
	
	@XmlEnumValue("PI")
	@JsonProperty("PI")
	PI(String.valueOf("PI")),
	
	@XmlEnumValue("PR")
	@JsonProperty("PR")
	PR(String.valueOf("PR")),
	
	@XmlEnumValue("RJ")
	@JsonProperty("RJ")
	RJ(String.valueOf("RJ")),
	
	@XmlEnumValue("RN")
	@JsonProperty("RN")
	RN(String.valueOf("RN")),
	
	@XmlEnumValue("RO")
	@JsonProperty("RO")
	RO(String.valueOf("RO")),
	
	@XmlEnumValue("RR")
	@JsonProperty("RR")
	RR(String.valueOf("RR")),
	
	@XmlEnumValue("RS")
	@JsonProperty("RS")
	RS(String.valueOf("RS")),
	
	@XmlEnumValue("SC")
	@JsonProperty("SC")
	SC(String.valueOf("SC")),
	
	@XmlEnumValue("SE")
	@JsonProperty("SE")
	SE(String.valueOf("SE")),
	
	@XmlEnumValue("SP")
	@JsonProperty("SP")
	SP(String.valueOf("SP")),
	
	@XmlEnumValue("TO")
	@JsonProperty("TO")
	TO(String.valueOf("TO"));


    private String value;

    UfEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static UfEnum fromValue(String v) {
        for (UfEnum b : UfEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to UfEnum");
    }
}

  @XmlElement(name="uf")
  @ApiModelProperty(example = "RJ", value = "Unidade da Federação (UF) da placa do veículo terrestre.<br/>Tamanho: 2")
 /**
   * Unidade da Federação (UF) da placa do veículo terrestre.<br/>Tamanho: 2
  **/
  private UfEnum uf = null;


@XmlType(name="VeiculoRegistradoNoMantraEnum")
@XmlEnum(String.class)
public enum VeiculoRegistradoNoMantraEnum {

	@XmlEnumValue("S")
	@JsonProperty("S")
	S(String.valueOf("S")),
	
	@XmlEnumValue("N")
	@JsonProperty("N")
	N(String.valueOf("N"));


    private String value;

    VeiculoRegistradoNoMantraEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static VeiculoRegistradoNoMantraEnum fromValue(String v) {
        for (VeiculoRegistradoNoMantraEnum b : VeiculoRegistradoNoMantraEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to VeiculoRegistradoNoMantraEnum");
    }
}

  @XmlElement(name="veiculoRegistradoNoMantra")
  @ApiModelProperty(example = "S", value = "Indicador de veículo informado no Siscomex trânsito.<br/>Tamanho: 1<br/>S - Sim<br/>N - Não")
 /**
   * Indicador de veículo informado no Siscomex trânsito.<br/>Tamanho: 1<br/>S - Sim<br/>N - Não
  **/
  private VeiculoRegistradoNoMantraEnum veiculoRegistradoNoMantra = null;
 /**
   * Código do Recinto Aduaneiro de chegada.&lt;br/&gt;Tamanho: 7&lt;br/&gt;Formato: inteiro com até 7 dígitos
   * @return codigoRecintoChegada
  **/
  @JsonProperty("codigoRecintoChegada")
  public String getCodigoRecintoChegada() {
    return codigoRecintoChegada;
  }

  public void setCodigoRecintoChegada(String codigoRecintoChegada) {
    this.codigoRecintoChegada = codigoRecintoChegada;
  }

  public CargaDetalheChegadaTerrestre codigoRecintoChegada(String codigoRecintoChegada) {
    this.codigoRecintoChegada = codigoRecintoChegada;
    return this;
  }

 /**
   * Código do Recinto Aduaneiro de partida.&lt;br/&gt;Tamanho: 7&lt;br/&gt;Formato: inteiro com até 7 dígitos
   * @return codigoRecintoPartida
  **/
  @JsonProperty("codigoRecintoPartida")
  public String getCodigoRecintoPartida() {
    return codigoRecintoPartida;
  }

  public void setCodigoRecintoPartida(String codigoRecintoPartida) {
    this.codigoRecintoPartida = codigoRecintoPartida;
  }

  public CargaDetalheChegadaTerrestre codigoRecintoPartida(String codigoRecintoPartida) {
    this.codigoRecintoPartida = codigoRecintoPartida;
    return this;
  }

 /**
   * Unidade da RFB de chegada&lt;br/&gt; Tamanho: 7&lt;br/&gt;Formato: AAAAAAA
   * @return codigoUaChegada
  **/
  @JsonProperty("codigoUaChegada")
  public String getCodigoUaChegada() {
    return codigoUaChegada;
  }

  public void setCodigoUaChegada(String codigoUaChegada) {
    this.codigoUaChegada = codigoUaChegada;
  }

  public CargaDetalheChegadaTerrestre codigoUaChegada(String codigoUaChegada) {
    this.codigoUaChegada = codigoUaChegada;
    return this;
  }

 /**
   * Unidade da RFB de partida&lt;br/&gt; Tamanho: 7&lt;br/&gt;Formato: AAAAAAA
   * @return codigoUaPartida
  **/
  @JsonProperty("codigoUaPartida")
  public String getCodigoUaPartida() {
    return codigoUaPartida;
  }

  public void setCodigoUaPartida(String codigoUaPartida) {
    this.codigoUaPartida = codigoUaPartida;
  }

  public CargaDetalheChegadaTerrestre codigoUaPartida(String codigoUaPartida) {
    this.codigoUaPartida = codigoUaPartida;
    return this;
  }

 /**
   * Data/Hora de chegada.&lt;br/&gt; Formato: yyyy-MM-dd&#39;T&#39;HH:mm:ssZ
   * @return dataHoraChegada
  **/
  @JsonProperty("dataHoraChegada")
  public String getDataHoraChegada() {
    return dataHoraChegada;
  }

  public void setDataHoraChegada(String dataHoraChegada) {
    this.dataHoraChegada = dataHoraChegada;
  }

  public CargaDetalheChegadaTerrestre dataHoraChegada(String dataHoraChegada) {
    this.dataHoraChegada = dataHoraChegada;
    return this;
  }

 /**
   * Data/Hora de partida.&lt;br/&gt; Formato: yyyy-MM-dd&#39;T&#39;HH:mm:ssZ
   * @return dataHoraPartida
  **/
  @JsonProperty("dataHoraPartida")
  public String getDataHoraPartida() {
    return dataHoraPartida;
  }

  public void setDataHoraPartida(String dataHoraPartida) {
    this.dataHoraPartida = dataHoraPartida;
  }

  public CargaDetalheChegadaTerrestre dataHoraPartida(String dataHoraPartida) {
    this.dataHoraPartida = dataHoraPartida;
    return this;
  }

 /**
   * Número do DTA&lt;br/&gt;Este campo é obrigatório na entrega intermediária entre depositário e transportador terrestre e opcional para as demais entregas intermediárias que escolham os motivos TRANSITO_INTERNACIONAL ou TRANSITO_NACIONAL.&lt;/br&gt;Para os demais motivos não deve ser informado.&lt;br/&gt;&lt;br/&gt;Tamanho mínimo: 8&lt;br/&gt;Tamanho máximo: 15&lt;br/&gt; Formato: AAAAAAAAAAAAAAA&lt;br/&gt;&lt;br/&gt;
   * @return numeroDta
  **/
  @JsonProperty("numeroDta")
  public String getNumeroDta() {
    return numeroDta;
  }

  public void setNumeroDta(String numeroDta) {
    this.numeroDta = numeroDta;
  }

  public CargaDetalheChegadaTerrestre numeroDta(String numeroDta) {
    this.numeroDta = numeroDta;
    return this;
  }

 /**
   * Placa do veículo terrestre.&lt;br/&gt;Tamanho: 7&lt;br/&gt;Formato: AAANNNN ou AAANANN
   * @return placa
  **/
  @JsonProperty("placa")
  public String getPlaca() {
    return placa;
  }

  public void setPlaca(String placa) {
    this.placa = placa;
  }

  public CargaDetalheChegadaTerrestre placa(String placa) {
    this.placa = placa;
    return this;
  }

 /**
   * Número do termo gerado no sistema Mantra&lt;br/&gt;Tamanho: 9&lt;br/&gt;Formato: NNNNNNNNN
   * @return termo
  **/
  @JsonProperty("termo")
  public String getTermo() {
    return termo;
  }

  public void setTermo(String termo) {
    this.termo = termo;
  }

  public CargaDetalheChegadaTerrestre termo(String termo) {
    this.termo = termo;
    return this;
  }

 /**
   * Unidade da Federação (UF) da placa do veículo terrestre.&lt;br/&gt;Tamanho: 2
   * @return uf
  **/
  @JsonProperty("uf")
  public String getUf() {
    if (uf == null) {
      return null;
    }
    return uf.value();
  }

  public void setUf(UfEnum uf) {
    this.uf = uf;
  }

  public CargaDetalheChegadaTerrestre uf(UfEnum uf) {
    this.uf = uf;
    return this;
  }

 /**
   * Indicador de veículo informado no Siscomex trânsito.&lt;br/&gt;Tamanho: 1&lt;br/&gt;S - Sim&lt;br/&gt;N - Não
   * @return veiculoRegistradoNoMantra
  **/
  @JsonProperty("veiculoRegistradoNoMantra")
  public String getVeiculoRegistradoNoMantra() {
    if (veiculoRegistradoNoMantra == null) {
      return null;
    }
    return veiculoRegistradoNoMantra.value();
  }

  public void setVeiculoRegistradoNoMantra(VeiculoRegistradoNoMantraEnum veiculoRegistradoNoMantra) {
    this.veiculoRegistradoNoMantra = veiculoRegistradoNoMantra;
  }

  public CargaDetalheChegadaTerrestre veiculoRegistradoNoMantra(VeiculoRegistradoNoMantraEnum veiculoRegistradoNoMantra) {
    this.veiculoRegistradoNoMantra = veiculoRegistradoNoMantra;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CargaDetalheChegadaTerrestre {\n");
    
    sb.append("    codigoRecintoChegada: ").append(toIndentedString(codigoRecintoChegada)).append("\n");
    sb.append("    codigoRecintoPartida: ").append(toIndentedString(codigoRecintoPartida)).append("\n");
    sb.append("    codigoUaChegada: ").append(toIndentedString(codigoUaChegada)).append("\n");
    sb.append("    codigoUaPartida: ").append(toIndentedString(codigoUaPartida)).append("\n");
    sb.append("    dataHoraChegada: ").append(toIndentedString(dataHoraChegada)).append("\n");
    sb.append("    dataHoraPartida: ").append(toIndentedString(dataHoraPartida)).append("\n");
    sb.append("    numeroDta: ").append(toIndentedString(numeroDta)).append("\n");
    sb.append("    placa: ").append(toIndentedString(placa)).append("\n");
    sb.append("    termo: ").append(toIndentedString(termo)).append("\n");
    sb.append("    uf: ").append(toIndentedString(uf)).append("\n");
    sb.append("    veiculoRegistradoNoMantra: ").append(toIndentedString(veiculoRegistradoNoMantra)).append("\n");
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

