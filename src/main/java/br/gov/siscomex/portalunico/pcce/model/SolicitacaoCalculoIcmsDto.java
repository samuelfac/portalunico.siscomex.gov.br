package br.gov.siscomex.portalunico.pcce.model;

import java.math.BigDecimal;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "SolicitacaoCalculoIcmsDto", propOrder =
    { "cnaeAdquirente", "cnaeImportador", "codMunicipioDesembaracoPretendido", "cpfSolicitante", "descricaoDespesasAduaneiras", "informacoesComplementares", "numeroDeclaracao", "tipoDeclaracao", "tipoSolicitacao", "tipoTratamento", "ufAdquirente", "ufFavorecida", "ufImportador", "valorAfrmm", "valorDespesasAduaneiras", "versaoDeclaracao"
})

@XmlRootElement(name="SolicitacaoCalculoIcmsDto")
/**
  * Dados de declaração ICMS criada no PCCE
 **/
@ApiModel(description="Dados de declaração ICMS criada no PCCE")
public class SolicitacaoCalculoIcmsDto  {
  
  @XmlElement(name="cnaeAdquirente")
  @ApiModelProperty(example = "6422100", value = "Código Cnae do Adquirente")
 /**
   * Código Cnae do Adquirente
  **/
  private String cnaeAdquirente = null;

  @XmlElement(name="cnaeImportador", required = true)
  @ApiModelProperty(example = "6422100", required = true, value = "Código Cnae do Importador")
 /**
   * Código Cnae do Importador
  **/
  private String cnaeImportador = null;

  @XmlElement(name="codMunicipioDesembaracoPretendido")
  @ApiModelProperty(example = "00000", value = "Código TOM do município de desembaraço pretendido")
 /**
   * Código TOM do município de desembaraço pretendido
  **/
  private String codMunicipioDesembaracoPretendido = null;

  @XmlElement(name="cpfSolicitante", required = true)
  @ApiModelProperty(example = "11111111111", required = true, value = "CPF do responsável pela declaração de ICMS<br>Formato: 'NNNNNNNNNNN'<br>Tamanho: 11")
 /**
   * CPF do responsável pela declaração de ICMS<br>Formato: 'NNNNNNNNNNN'<br>Tamanho: 11
  **/
  private String cpfSolicitante = null;

  @XmlElement(name="descricaoDespesasAduaneiras")
  @ApiModelProperty(value = "Descrição das demais despesas aduaneiras <br>Tamanho máximo: 400")
 /**
   * Descrição das demais despesas aduaneiras <br>Tamanho máximo: 400
  **/
  private String descricaoDespesasAduaneiras = null;

  @XmlElement(name="informacoesComplementares")
  @ApiModelProperty(value = "Texto livre com informações complementares pertinentes <br>Tamanho máximo: 400")
 /**
   * Texto livre com informações complementares pertinentes <br>Tamanho máximo: 400
  **/
  private String informacoesComplementares = null;

  @XmlElement(name="numeroDeclaracao", required = true)
  @ApiModelProperty(example = "19BR00000004677", required = true, value = "Número da declaração<br>Formato: 'NNAANNNNNNNNNNN'<br>Tamanho: 15")
 /**
   * Número da declaração<br>Formato: 'NNAANNNNNNNNNNN'<br>Tamanho: 15
  **/
  private String numeroDeclaracao = null;


@XmlType(name="TipoDeclaracaoEnum")
@XmlEnum(String.class)
public enum TipoDeclaracaoEnum {

	@XmlEnumValue("DUIMP")
	@JsonProperty("DUIMP")
	DUIMP(String.valueOf("DUIMP"));


    private String value;

    TipoDeclaracaoEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TipoDeclaracaoEnum fromValue(String v) {
        for (TipoDeclaracaoEnum b : TipoDeclaracaoEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to TipoDeclaracaoEnum");
    }
}

  @XmlElement(name="tipoDeclaracao", required = true)
  @ApiModelProperty(example = "DUIMP", required = true, value = "Tipo da declaração no Comércio Exterior")
 /**
   * Tipo da declaração no Comércio Exterior
  **/
  private TipoDeclaracaoEnum tipoDeclaracao = null;


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
  @ApiModelProperty(example = "PAGAMENTO_INTEGRAL_DUIMP", required = true, value = "Tipo de solicitação")
 /**
   * Tipo de solicitação
  **/
  private TipoSolicitacaoEnum tipoSolicitacao = null;


@XmlType(name="TipoTratamentoEnum")
@XmlEnum(String.class)
public enum TipoTratamentoEnum {

	@XmlEnumValue("MANUAL")
	@JsonProperty("MANUAL")
	MANUAL(String.valueOf("MANUAL")),
	
	@XmlEnumValue("DECLARATORIO")
	@JsonProperty("DECLARATORIO")
	DECLARATORIO(String.valueOf("DECLARATORIO")),
	
	@XmlEnumValue("AUTOMATICO")
	@JsonProperty("AUTOMATICO")
	AUTOMATICO(String.valueOf("AUTOMATICO")),
	
	@XmlEnumValue("CALCULO_SEFAZ")
	@JsonProperty("CALCULO_SEFAZ")
	CALCULO_SEFAZ(String.valueOf("CALCULO_SEFAZ"));


    private String value;

    TipoTratamentoEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TipoTratamentoEnum fromValue(String v) {
        for (TipoTratamentoEnum b : TipoTratamentoEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to TipoTratamentoEnum");
    }
}

  @XmlElement(name="tipoTratamento", required = true)
  @ApiModelProperty(example = "MANUAL", required = true, value = "Tipo de solicitação")
 /**
   * Tipo de solicitação
  **/
  private TipoTratamentoEnum tipoTratamento = null;


@XmlType(name="UfAdquirenteEnum")
@XmlEnum(String.class)
public enum UfAdquirenteEnum {

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

    UfAdquirenteEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static UfAdquirenteEnum fromValue(String v) {
        for (UfAdquirenteEnum b : UfAdquirenteEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to UfAdquirenteEnum");
    }
}

  @XmlElement(name="ufAdquirente")
  @ApiModelProperty(example = "SC", value = "UF favorecida")
 /**
   * UF favorecida
  **/
  private UfAdquirenteEnum ufAdquirente = null;


@XmlType(name="UfFavorecidaEnum")
@XmlEnum(String.class)
public enum UfFavorecidaEnum {

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

    UfFavorecidaEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static UfFavorecidaEnum fromValue(String v) {
        for (UfFavorecidaEnum b : UfFavorecidaEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to UfFavorecidaEnum");
    }
}

  @XmlElement(name="ufFavorecida", required = true)
  @ApiModelProperty(example = "RS", required = true, value = "UF favorecida")
 /**
   * UF favorecida
  **/
  private UfFavorecidaEnum ufFavorecida = null;


@XmlType(name="UfImportadorEnum")
@XmlEnum(String.class)
public enum UfImportadorEnum {

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

    UfImportadorEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static UfImportadorEnum fromValue(String v) {
        for (UfImportadorEnum b : UfImportadorEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to UfImportadorEnum");
    }
}

  @XmlElement(name="ufImportador", required = true)
  @ApiModelProperty(example = "BA", required = true, value = "UF importador")
 /**
   * UF importador
  **/
  private UfImportadorEnum ufImportador = null;

  @XmlElement(name="valorAfrmm", required = true)
  @ApiModelProperty(example = "103.2", required = true, value = "Valor do AFRMM no momento da criação da solicitação<br>Formato: Decimal, com 2 casas decimais separadas por ponto.<br>Tamanho: 15,2")
  @Valid
 /**
   * Valor do AFRMM no momento da criação da solicitação<br>Formato: Decimal, com 2 casas decimais separadas por ponto.<br>Tamanho: 15,2
  **/
  private BigDecimal valorAfrmm = null;

  @XmlElement(name="valorDespesasAduaneiras")
  @ApiModelProperty(example = "162.57", value = "Valor das demais despesas aduaneiras<br>Formato: Decimal, com 2 casas decimais separadas por ponto.<br>Tamanho: 15,2")
  @Valid
 /**
   * Valor das demais despesas aduaneiras<br>Formato: Decimal, com 2 casas decimais separadas por ponto.<br>Tamanho: 15,2
  **/
  private BigDecimal valorDespesasAduaneiras = null;

  @XmlElement(name="versaoDeclaracao", required = true)
  @ApiModelProperty(example = "1", required = true, value = "Versão da declaração<br>Valor mínimo: 1<br>Valor máximo: 9999")
 /**
   * Versão da declaração<br>Valor mínimo: 1<br>Valor máximo: 9999
  **/
  private String versaoDeclaracao = null;
 /**
   * Código Cnae do Adquirente
   * @return cnaeAdquirente
  **/
  @JsonProperty("cnaeAdquirente")
  public String getCnaeAdquirente() {
    return cnaeAdquirente;
  }

  public void setCnaeAdquirente(String cnaeAdquirente) {
    this.cnaeAdquirente = cnaeAdquirente;
  }

  public SolicitacaoCalculoIcmsDto cnaeAdquirente(String cnaeAdquirente) {
    this.cnaeAdquirente = cnaeAdquirente;
    return this;
  }

 /**
   * Código Cnae do Importador
   * @return cnaeImportador
  **/
  @JsonProperty("cnaeImportador")
  @NotNull
  public String getCnaeImportador() {
    return cnaeImportador;
  }

  public void setCnaeImportador(String cnaeImportador) {
    this.cnaeImportador = cnaeImportador;
  }

  public SolicitacaoCalculoIcmsDto cnaeImportador(String cnaeImportador) {
    this.cnaeImportador = cnaeImportador;
    return this;
  }

 /**
   * Código TOM do município de desembaraço pretendido
   * @return codMunicipioDesembaracoPretendido
  **/
  @JsonProperty("codMunicipioDesembaracoPretendido")
  public String getCodMunicipioDesembaracoPretendido() {
    return codMunicipioDesembaracoPretendido;
  }

  public void setCodMunicipioDesembaracoPretendido(String codMunicipioDesembaracoPretendido) {
    this.codMunicipioDesembaracoPretendido = codMunicipioDesembaracoPretendido;
  }

  public SolicitacaoCalculoIcmsDto codMunicipioDesembaracoPretendido(String codMunicipioDesembaracoPretendido) {
    this.codMunicipioDesembaracoPretendido = codMunicipioDesembaracoPretendido;
    return this;
  }

 /**
   * CPF do responsável pela declaração de ICMS&lt;br&gt;Formato: &#39;NNNNNNNNNNN&#39;&lt;br&gt;Tamanho: 11
   * @return cpfSolicitante
  **/
  @JsonProperty("cpfSolicitante")
  @NotNull
  public String getCpfSolicitante() {
    return cpfSolicitante;
  }

  public void setCpfSolicitante(String cpfSolicitante) {
    this.cpfSolicitante = cpfSolicitante;
  }

  public SolicitacaoCalculoIcmsDto cpfSolicitante(String cpfSolicitante) {
    this.cpfSolicitante = cpfSolicitante;
    return this;
  }

 /**
   * Descrição das demais despesas aduaneiras &lt;br&gt;Tamanho máximo: 400
   * @return descricaoDespesasAduaneiras
  **/
  @JsonProperty("descricaoDespesasAduaneiras")
  public String getDescricaoDespesasAduaneiras() {
    return descricaoDespesasAduaneiras;
  }

  public void setDescricaoDespesasAduaneiras(String descricaoDespesasAduaneiras) {
    this.descricaoDespesasAduaneiras = descricaoDespesasAduaneiras;
  }

  public SolicitacaoCalculoIcmsDto descricaoDespesasAduaneiras(String descricaoDespesasAduaneiras) {
    this.descricaoDespesasAduaneiras = descricaoDespesasAduaneiras;
    return this;
  }

 /**
   * Texto livre com informações complementares pertinentes &lt;br&gt;Tamanho máximo: 400
   * @return informacoesComplementares
  **/
  @JsonProperty("informacoesComplementares")
  public String getInformacoesComplementares() {
    return informacoesComplementares;
  }

  public void setInformacoesComplementares(String informacoesComplementares) {
    this.informacoesComplementares = informacoesComplementares;
  }

  public SolicitacaoCalculoIcmsDto informacoesComplementares(String informacoesComplementares) {
    this.informacoesComplementares = informacoesComplementares;
    return this;
  }

 /**
   * Número da declaração&lt;br&gt;Formato: &#39;NNAANNNNNNNNNNN&#39;&lt;br&gt;Tamanho: 15
   * @return numeroDeclaracao
  **/
  @JsonProperty("numeroDeclaracao")
  @NotNull
  public String getNumeroDeclaracao() {
    return numeroDeclaracao;
  }

  public void setNumeroDeclaracao(String numeroDeclaracao) {
    this.numeroDeclaracao = numeroDeclaracao;
  }

  public SolicitacaoCalculoIcmsDto numeroDeclaracao(String numeroDeclaracao) {
    this.numeroDeclaracao = numeroDeclaracao;
    return this;
  }

 /**
   * Tipo da declaração no Comércio Exterior
   * @return tipoDeclaracao
  **/
  @JsonProperty("tipoDeclaracao")
  @NotNull
  public String getTipoDeclaracao() {
    if (tipoDeclaracao == null) {
      return null;
    }
    return tipoDeclaracao.value();
  }

  public void setTipoDeclaracao(TipoDeclaracaoEnum tipoDeclaracao) {
    this.tipoDeclaracao = tipoDeclaracao;
  }

  public SolicitacaoCalculoIcmsDto tipoDeclaracao(TipoDeclaracaoEnum tipoDeclaracao) {
    this.tipoDeclaracao = tipoDeclaracao;
    return this;
  }

 /**
   * Tipo de solicitação
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

  public SolicitacaoCalculoIcmsDto tipoSolicitacao(TipoSolicitacaoEnum tipoSolicitacao) {
    this.tipoSolicitacao = tipoSolicitacao;
    return this;
  }

 /**
   * Tipo de solicitação
   * @return tipoTratamento
  **/
  @JsonProperty("tipoTratamento")
  @NotNull
  public String getTipoTratamento() {
    if (tipoTratamento == null) {
      return null;
    }
    return tipoTratamento.value();
  }

  public void setTipoTratamento(TipoTratamentoEnum tipoTratamento) {
    this.tipoTratamento = tipoTratamento;
  }

  public SolicitacaoCalculoIcmsDto tipoTratamento(TipoTratamentoEnum tipoTratamento) {
    this.tipoTratamento = tipoTratamento;
    return this;
  }

 /**
   * UF favorecida
   * @return ufAdquirente
  **/
  @JsonProperty("ufAdquirente")
  public String getUfAdquirente() {
    if (ufAdquirente == null) {
      return null;
    }
    return ufAdquirente.value();
  }

  public void setUfAdquirente(UfAdquirenteEnum ufAdquirente) {
    this.ufAdquirente = ufAdquirente;
  }

  public SolicitacaoCalculoIcmsDto ufAdquirente(UfAdquirenteEnum ufAdquirente) {
    this.ufAdquirente = ufAdquirente;
    return this;
  }

 /**
   * UF favorecida
   * @return ufFavorecida
  **/
  @JsonProperty("ufFavorecida")
  @NotNull
  public String getUfFavorecida() {
    if (ufFavorecida == null) {
      return null;
    }
    return ufFavorecida.value();
  }

  public void setUfFavorecida(UfFavorecidaEnum ufFavorecida) {
    this.ufFavorecida = ufFavorecida;
  }

  public SolicitacaoCalculoIcmsDto ufFavorecida(UfFavorecidaEnum ufFavorecida) {
    this.ufFavorecida = ufFavorecida;
    return this;
  }

 /**
   * UF importador
   * @return ufImportador
  **/
  @JsonProperty("ufImportador")
  @NotNull
  public String getUfImportador() {
    if (ufImportador == null) {
      return null;
    }
    return ufImportador.value();
  }

  public void setUfImportador(UfImportadorEnum ufImportador) {
    this.ufImportador = ufImportador;
  }

  public SolicitacaoCalculoIcmsDto ufImportador(UfImportadorEnum ufImportador) {
    this.ufImportador = ufImportador;
    return this;
  }

 /**
   * Valor do AFRMM no momento da criação da solicitação&lt;br&gt;Formato: Decimal, com 2 casas decimais separadas por ponto.&lt;br&gt;Tamanho: 15,2
   * @return valorAfrmm
  **/
  @JsonProperty("valorAfrmm")
  @NotNull
  public BigDecimal getValorAfrmm() {
    return valorAfrmm;
  }

  public void setValorAfrmm(BigDecimal valorAfrmm) {
    this.valorAfrmm = valorAfrmm;
  }

  public SolicitacaoCalculoIcmsDto valorAfrmm(BigDecimal valorAfrmm) {
    this.valorAfrmm = valorAfrmm;
    return this;
  }

 /**
   * Valor das demais despesas aduaneiras&lt;br&gt;Formato: Decimal, com 2 casas decimais separadas por ponto.&lt;br&gt;Tamanho: 15,2
   * @return valorDespesasAduaneiras
  **/
  @JsonProperty("valorDespesasAduaneiras")
  public BigDecimal getValorDespesasAduaneiras() {
    return valorDespesasAduaneiras;
  }

  public void setValorDespesasAduaneiras(BigDecimal valorDespesasAduaneiras) {
    this.valorDespesasAduaneiras = valorDespesasAduaneiras;
  }

  public SolicitacaoCalculoIcmsDto valorDespesasAduaneiras(BigDecimal valorDespesasAduaneiras) {
    this.valorDespesasAduaneiras = valorDespesasAduaneiras;
    return this;
  }

 /**
   * Versão da declaração&lt;br&gt;Valor mínimo: 1&lt;br&gt;Valor máximo: 9999
   * @return versaoDeclaracao
  **/
  @JsonProperty("versaoDeclaracao")
  @NotNull
  public String getVersaoDeclaracao() {
    return versaoDeclaracao;
  }

  public void setVersaoDeclaracao(String versaoDeclaracao) {
    this.versaoDeclaracao = versaoDeclaracao;
  }

  public SolicitacaoCalculoIcmsDto versaoDeclaracao(String versaoDeclaracao) {
    this.versaoDeclaracao = versaoDeclaracao;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SolicitacaoCalculoIcmsDto {\n");
    
    sb.append("    cnaeAdquirente: ").append(toIndentedString(cnaeAdquirente)).append("\n");
    sb.append("    cnaeImportador: ").append(toIndentedString(cnaeImportador)).append("\n");
    sb.append("    codMunicipioDesembaracoPretendido: ").append(toIndentedString(codMunicipioDesembaracoPretendido)).append("\n");
    sb.append("    cpfSolicitante: ").append(toIndentedString(cpfSolicitante)).append("\n");
    sb.append("    descricaoDespesasAduaneiras: ").append(toIndentedString(descricaoDespesasAduaneiras)).append("\n");
    sb.append("    informacoesComplementares: ").append(toIndentedString(informacoesComplementares)).append("\n");
    sb.append("    numeroDeclaracao: ").append(toIndentedString(numeroDeclaracao)).append("\n");
    sb.append("    tipoDeclaracao: ").append(toIndentedString(tipoDeclaracao)).append("\n");
    sb.append("    tipoSolicitacao: ").append(toIndentedString(tipoSolicitacao)).append("\n");
    sb.append("    tipoTratamento: ").append(toIndentedString(tipoTratamento)).append("\n");
    sb.append("    ufAdquirente: ").append(toIndentedString(ufAdquirente)).append("\n");
    sb.append("    ufFavorecida: ").append(toIndentedString(ufFavorecida)).append("\n");
    sb.append("    ufImportador: ").append(toIndentedString(ufImportador)).append("\n");
    sb.append("    valorAfrmm: ").append(toIndentedString(valorAfrmm)).append("\n");
    sb.append("    valorDespesasAduaneiras: ").append(toIndentedString(valorDespesasAduaneiras)).append("\n");
    sb.append("    versaoDeclaracao: ").append(toIndentedString(versaoDeclaracao)).append("\n");
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

