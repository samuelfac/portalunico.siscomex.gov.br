package br.gov.siscomex.portalunico.pcce.model;

import io.swagger.v3.oas.annotations.media.Schema;
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
 @XmlType(name = "OpcaoIcmsConsultaDto", propOrder =
    { "ativa", "codigoOpcao", "dataCadastro", "descricaoOpcao", "id", "tipoSolicitacao", "uf"
})

@XmlRootElement(name="OpcaoIcmsConsultaDto")
/**
  * Opção de ICMS cadastrada no PCCE
 **/
@ApiModel(description="Opção de ICMS cadastrada no PCCE")
public class OpcaoIcmsConsultaDto  {
  
  @XmlElement(name="ativa", required = true)
  @ApiModelProperty(example = "true", required = true, value = "Indicador de que a opção está ativa e ficará disponível para uso pelo importador<br>Dominio:<br>true - Sim, <br>false - Não")
 /**
   * Indicador de que a opção está ativa e ficará disponível para uso pelo importador<br>Dominio:<br>true - Sim, <br>false - Não
  **/
  private Boolean ativa = null;

  @XmlElement(name="codigoOpcao", required = true)
  @ApiModelProperty(example = "9999", required = true, value = "Codigo identificador da opção<br>Tamanho: 4")
 /**
   * Codigo identificador da opção<br>Tamanho: 4
  **/
  private String codigoOpcao = null;

  @XmlElement(name="dataCadastro", required = true)
  @ApiModelProperty(example = "2021-08-31T09:11:06-0300", required = true, value = "Data e hora do cadastro da opção<br>Formato: 'yyyy-MM-dd'T'HH:mm:ssZ'")
 /**
   * Data e hora do cadastro da opção<br>Formato: 'yyyy-MM-dd'T'HH:mm:ssZ'
  **/
  private String dataCadastro = null;

  @XmlElement(name="descricaoOpcao", required = true)
  @ApiModelProperty(example = "Id eu nisl nunc mi", required = true, value = "Descrição da opção que será exibida para o importador <br>Tamanho mínimo: 1<br>Tamanho máximo: 30")
 /**
   * Descrição da opção que será exibida para o importador <br>Tamanho mínimo: 1<br>Tamanho máximo: 30
  **/
  private String descricaoOpcao = null;

  @XmlElement(name="id", required = true)
  @ApiModelProperty(example = "5", required = true, value = "Identificador único da opção no PCCE")
 /**
   * Identificador único da opção no PCCE
  **/
  private Long id = null;


@XmlType(name="TipoSolicitacaoEnum")
@XmlEnum(String.class)
public enum TipoSolicitacaoEnum {

	@XmlEnumValue("PAGAMENTO_INTEGRAL_DUIMP")
	@JsonProperty("PAGAMENTO_INTEGRAL_DUIMP")
	PAGAMENTO_INTEGRAL_DUIMP(String.valueOf("PAGAMENTO_INTEGRAL_DUIMP")),
	
	@XmlEnumValue("PAGAMENTO_PARCIAL_DUIMP")
	@JsonProperty("PAGAMENTO_PARCIAL_DUIMP")
	PAGAMENTO_PARCIAL_DUIMP(String.valueOf("PAGAMENTO_PARCIAL_DUIMP")),
	
	@XmlEnumValue("EXONERACAO_INTEGRAL_DUIMP")
	@JsonProperty("EXONERACAO_INTEGRAL_DUIMP")
	EXONERACAO_INTEGRAL_DUIMP(String.valueOf("EXONERACAO_INTEGRAL_DUIMP")),
	
	@XmlEnumValue("MANDADO_JUDICIAL_DUIMP")
	@JsonProperty("MANDADO_JUDICIAL_DUIMP")
	MANDADO_JUDICIAL_DUIMP(String.valueOf("MANDADO_JUDICIAL_DUIMP")),
	
	@XmlEnumValue("EXONERACAO_PAG_PARCIAL_DUIMP")
	@JsonProperty("EXONERACAO_PAG_PARCIAL_DUIMP")
	EXONERACAO_PAG_PARCIAL_DUIMP(String.valueOf("EXONERACAO_PAG_PARCIAL_DUIMP"));


    private String value;

    TipoSolicitacaoEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TipoSolicitacaoEnum fromValue(String v) {
        for (TipoSolicitacaoEnum b : TipoSolicitacaoEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to TipoSolicitacaoEnum");
    }
}

  @XmlElement(name="tipoSolicitacao", required = true)
  @ApiModelProperty(example = "PAGAMENTO_INTEGRAL_DUIMP", required = true, value = "Tipo de declaração de ICMS à qual a opção está vinculada")
 /**
   * Tipo de declaração de ICMS à qual a opção está vinculada
  **/
  private TipoSolicitacaoEnum tipoSolicitacao = null;


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

  @XmlElement(name="uf", required = true)
  @ApiModelProperty(example = "RS", required = true, value = "UF à qual a opção está vinculada")
 /**
   * UF à qual a opção está vinculada
  **/
  private UfEnum uf = null;
 /**
   * Indicador de que a opção está ativa e ficará disponível para uso pelo importador&lt;br&gt;Dominio:&lt;br&gt;true - Sim, &lt;br&gt;false - Não
   * @return ativa
  **/
  @JsonProperty("ativa")
  @NotNull
  public Boolean isAtiva() {
    return ativa;
  }

  public void setAtiva(Boolean ativa) {
    this.ativa = ativa;
  }

  public OpcaoIcmsConsultaDto ativa(Boolean ativa) {
    this.ativa = ativa;
    return this;
  }

 /**
   * Codigo identificador da opção&lt;br&gt;Tamanho: 4
   * @return codigoOpcao
  **/
  @JsonProperty("codigoOpcao")
  @NotNull
  public String getCodigoOpcao() {
    return codigoOpcao;
  }

  public void setCodigoOpcao(String codigoOpcao) {
    this.codigoOpcao = codigoOpcao;
  }

  public OpcaoIcmsConsultaDto codigoOpcao(String codigoOpcao) {
    this.codigoOpcao = codigoOpcao;
    return this;
  }

 /**
   * Data e hora do cadastro da opção&lt;br&gt;Formato: &#39;yyyy-MM-dd&#39;T&#39;HH:mm:ssZ&#39;
   * @return dataCadastro
  **/
  @JsonProperty("dataCadastro")
  @NotNull
  public String getDataCadastro() {
    return dataCadastro;
  }

  public void setDataCadastro(String dataCadastro) {
    this.dataCadastro = dataCadastro;
  }

  public OpcaoIcmsConsultaDto dataCadastro(String dataCadastro) {
    this.dataCadastro = dataCadastro;
    return this;
  }

 /**
   * Descrição da opção que será exibida para o importador &lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 30
   * @return descricaoOpcao
  **/
  @JsonProperty("descricaoOpcao")
  @NotNull
  public String getDescricaoOpcao() {
    return descricaoOpcao;
  }

  public void setDescricaoOpcao(String descricaoOpcao) {
    this.descricaoOpcao = descricaoOpcao;
  }

  public OpcaoIcmsConsultaDto descricaoOpcao(String descricaoOpcao) {
    this.descricaoOpcao = descricaoOpcao;
    return this;
  }

 /**
   * Identificador único da opção no PCCE
   * @return id
  **/
  @JsonProperty("id")
  @NotNull
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public OpcaoIcmsConsultaDto id(Long id) {
    this.id = id;
    return this;
  }

 /**
   * Tipo de declaração de ICMS à qual a opção está vinculada
   * @return tipoSolicitacao
  **/
  @JsonProperty("tipoSolicitacao")
  @NotNull
  public String getTipoSolicitacao() {
    if (tipoSolicitacao == null) {
      return null;
    }
    return tipoSolicitacao.value();
  }

  public void setTipoSolicitacao(TipoSolicitacaoEnum tipoSolicitacao) {
    this.tipoSolicitacao = tipoSolicitacao;
  }

  public OpcaoIcmsConsultaDto tipoSolicitacao(TipoSolicitacaoEnum tipoSolicitacao) {
    this.tipoSolicitacao = tipoSolicitacao;
    return this;
  }

 /**
   * UF à qual a opção está vinculada
   * @return uf
  **/
  @JsonProperty("uf")
  @NotNull
  public String getUf() {
    if (uf == null) {
      return null;
    }
    return uf.value();
  }

  public void setUf(UfEnum uf) {
    this.uf = uf;
  }

  public OpcaoIcmsConsultaDto uf(UfEnum uf) {
    this.uf = uf;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpcaoIcmsConsultaDto {\n");
    
    sb.append("    ativa: ").append(toIndentedString(ativa)).append("\n");
    sb.append("    codigoOpcao: ").append(toIndentedString(codigoOpcao)).append("\n");
    sb.append("    dataCadastro: ").append(toIndentedString(dataCadastro)).append("\n");
    sb.append("    descricaoOpcao: ").append(toIndentedString(descricaoOpcao)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    tipoSolicitacao: ").append(toIndentedString(tipoSolicitacao)).append("\n");
    sb.append("    uf: ").append(toIndentedString(uf)).append("\n");
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

