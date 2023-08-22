package br.gov.siscomex.portalunico.pcce.model;

import br.gov.siscomex.portalunico.pcce.model.GuiaIcmsDto;
import br.gov.siscomex.portalunico.pcce.model.OpcaoIcmsConsultaDto;
import br.gov.siscomex.portalunico.pcce.model.SituacaoHistoricoDto;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
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
 @XmlType(name = "SolicitacaoIcmsDto", propOrder =
    { "cargaEntregue", "cnaeAdquirente", "cnaeImportador", "codMunicipioDesembaracoPretendido", "cpfSolicitante", "dataConfirmacaoCredito", "descricaoDespesasAduaneiras", "guias", "historico", "informacoesComplementares", "numMandadoJudicial", "numeroDeclaracao", "opcaoIcms", "periodoReferencia", "situacaoSolicitacao", "status", "tipoDeclaracao", "tipoSolicitacao", "tipoTratamento", "ufAdquirente", "ufFavorecida", "ufImportador", "valorAfrmm", "valorCIFExonerado", "valorCIFPagamento", "valorDespesasAduaneiras", "valorTotalARecolher", "valorTotalCredito", "valorTotalDevido", "versaoDeclaracao"
})

@XmlRootElement(name="SolicitacaoIcmsDto")
/**
  * Dados de declaração ICMS criada no PCCE
 **/
@ApiModel(description="Dados de declaração ICMS criada no PCCE")
public class SolicitacaoIcmsDto  {
  
  @XmlElement(name="cargaEntregue", required = true)
  @ApiModelProperty(required = true, value = "Flag para indicar se a carga foi entregue <br/>(*) Utilizado para tipo de tratamento manual")
 /**
   * Flag para indicar se a carga foi entregue <br/>(*) Utilizado para tipo de tratamento manual
  **/
  private Boolean cargaEntregue = null;

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

  @XmlElement(name="dataConfirmacaoCredito", required = true)
  @ApiModelProperty(example = "2021-08-31T09:11:06-0300", required = true, value = "Data e hora da confirmação do crédito de ICMS<br>Formato: 'yyyy-MM-dd'T'HH:mm:ssZ'")
 /**
   * Data e hora da confirmação do crédito de ICMS<br>Formato: 'yyyy-MM-dd'T'HH:mm:ssZ'
  **/
  private String dataConfirmacaoCredito = null;

  @XmlElement(name="descricaoDespesasAduaneiras")
  @ApiModelProperty(value = "Descrição das demais despesas aduaneiras <br>Tamanho máximo: 400")
 /**
   * Descrição das demais despesas aduaneiras <br>Tamanho máximo: 400
  **/
  private String descricaoDespesasAduaneiras = null;

  @XmlElement(name="guias")
  @ApiModelProperty(value = "Lista de guias de pagamento de ICMS (não canceladas)")
  @Valid
 /**
   * Lista de guias de pagamento de ICMS (não canceladas)
  **/
  private List<GuiaIcmsDto> guias = null;

  @XmlElement(name="historico")
  @ApiModelProperty(value = "Histórico da solicitação de ICMS")
  @Valid
 /**
   * Histórico da solicitação de ICMS
  **/
  private List<SituacaoHistoricoDto> historico = null;

  @XmlElement(name="informacoesComplementares")
  @ApiModelProperty(value = "Texto livre com informações complementares pertinentes <br>Tamanho máximo: 400")
 /**
   * Texto livre com informações complementares pertinentes <br>Tamanho máximo: 400
  **/
  private String informacoesComplementares = null;

  @XmlElement(name="numMandadoJudicial")
  @ApiModelProperty(example = "11111111111111111111", value = "Número do Mandado Judicial <br>Tamanho mínimo: 1<br>Tamanho máximo: 30<br/>(*) Obrigatório se tipoSolicitacao = MANDADO_JUDICIAL_DUIMP")
 /**
   * Número do Mandado Judicial <br>Tamanho mínimo: 1<br>Tamanho máximo: 30<br/>(*) Obrigatório se tipoSolicitacao = MANDADO_JUDICIAL_DUIMP
  **/
  private String numMandadoJudicial = null;

  @XmlElement(name="numeroDeclaracao", required = true)
  @ApiModelProperty(example = "19BR00000004677", required = true, value = "Número da declaração<br>Formato: 'NNAANNNNNNNNNNN'<br>Tamanho: 15")
 /**
   * Número da declaração<br>Formato: 'NNAANNNNNNNNNNN'<br>Tamanho: 15
  **/
  private String numeroDeclaracao = null;

  @XmlElement(name="opcaoIcms")
  @ApiModelProperty(value = "")
  @Valid
  private OpcaoIcmsConsultaDto opcaoIcms = null;

  @XmlElement(name="periodoReferencia", required = true)
  @ApiModelProperty(example = "2019-01", required = true, value = "Período de referência<br>Formato: 'yyyy-MM'")
 /**
   * Período de referência<br>Formato: 'yyyy-MM'
  **/
  private String periodoReferencia = null;


@XmlType(name="SituacaoSolicitacaoEnum")
@XmlEnum(String.class)
public enum SituacaoSolicitacaoEnum {

	@XmlEnumValue("DUIMP_CONCLUIDA_SEFAZ_SEM_CARGA")
	@JsonProperty("DUIMP_CONCLUIDA_SEFAZ_SEM_CARGA")
	CONCLUIDA_SEFAZ_SEM_CARGA(String.valueOf("DUIMP_CONCLUIDA_SEFAZ_SEM_CARGA")),
	
	@XmlEnumValue("DUIMP_DECLARADA")
	@JsonProperty("DUIMP_DECLARADA")
	DECLARADA(String.valueOf("DUIMP_DECLARADA")),
	
	@XmlEnumValue("DUIMP_CANCELADA_IMPORTADOR")
	@JsonProperty("DUIMP_CANCELADA_IMPORTADOR")
	CANCELADA_IMPORTADOR(String.valueOf("DUIMP_CANCELADA_IMPORTADOR")),
	
	@XmlEnumValue("DUIMP_PENDENTE_PAGAMENTO_EXONERACAO")
	@JsonProperty("DUIMP_PENDENTE_PAGAMENTO_EXONERACAO")
	PENDENTE_PAGAMENTO_EXONERACAO(String.valueOf("DUIMP_PENDENTE_PAGAMENTO_EXONERACAO")),
	
	@XmlEnumValue("DUIMP_PAGA_EXONERADA")
	@JsonProperty("DUIMP_PAGA_EXONERADA")
	PAGA_EXONERADA(String.valueOf("DUIMP_PAGA_EXONERADA")),
	
	@XmlEnumValue("DUIMP_CANCELADA_AUTOMATICAMENTE")
	@JsonProperty("DUIMP_CANCELADA_AUTOMATICAMENTE")
	CANCELADA_AUTOMATICAMENTE(String.valueOf("DUIMP_CANCELADA_AUTOMATICAMENTE")),
	
	@XmlEnumValue("DUIMP_AGUARDANDO_DOCUMENTACAO")
	@JsonProperty("DUIMP_AGUARDANDO_DOCUMENTACAO")
	AGUARDANDO_DOCUMENTACAO(String.valueOf("DUIMP_AGUARDANDO_DOCUMENTACAO")),
	
	@XmlEnumValue("DUIMP_AGUARDANDO_EXIGENCIA")
	@JsonProperty("DUIMP_AGUARDANDO_EXIGENCIA")
	AGUARDANDO_EXIGENCIA(String.valueOf("DUIMP_AGUARDANDO_EXIGENCIA")),
	
	@XmlEnumValue("DUIMP_A_DISTRIBUIR")
	@JsonProperty("DUIMP_A_DISTRIBUIR")
	A_DISTRIBUIR(String.valueOf("DUIMP_A_DISTRIBUIR")),
	
	@XmlEnumValue("DUIMP_A_DISTRIBUIR_RETORNO")
	@JsonProperty("DUIMP_A_DISTRIBUIR_RETORNO")
	A_DISTRIBUIR_RETORNO(String.valueOf("DUIMP_A_DISTRIBUIR_RETORNO")),
	
	@XmlEnumValue("DUIMP_DISTRIBUIDA")
	@JsonProperty("DUIMP_DISTRIBUIDA")
	DISTRIBUIDA(String.valueOf("DUIMP_DISTRIBUIDA")),
	
	@XmlEnumValue("DUIMP_SOLICITACAO_AUTORIZADA_SEFAZ")
	@JsonProperty("DUIMP_SOLICITACAO_AUTORIZADA_SEFAZ")
	SOLICITACAO_AUTORIZADA_SEFAZ(String.valueOf("DUIMP_SOLICITACAO_AUTORIZADA_SEFAZ")),
	
	@XmlEnumValue("DUIMP_SOLICITACAO_INDEFERIDA")
	@JsonProperty("DUIMP_SOLICITACAO_INDEFERIDA")
	SOLICITACAO_INDEFERIDA(String.valueOf("DUIMP_SOLICITACAO_INDEFERIDA")),
	
	@XmlEnumValue("DUIMP_DECLARADA_PAGA")
	@JsonProperty("DUIMP_DECLARADA_PAGA")
	DECLARADA_PAGA(String.valueOf("DUIMP_DECLARADA_PAGA")),
	
	@XmlEnumValue("DUIMP_CALCULO_SOLICITADO")
	@JsonProperty("DUIMP_CALCULO_SOLICITADO")
	CALCULO_SOLICITADO(String.valueOf("DUIMP_CALCULO_SOLICITADO")),
	
	@XmlEnumValue("DUIMP_CALCULO_INDEFERIDO")
	@JsonProperty("DUIMP_CALCULO_INDEFERIDO")
	CALCULO_INDEFERIDO(String.valueOf("DUIMP_CALCULO_INDEFERIDO"));


    private String value;

    SituacaoSolicitacaoEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static SituacaoSolicitacaoEnum fromValue(String v) {
        for (SituacaoSolicitacaoEnum b : SituacaoSolicitacaoEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to SituacaoSolicitacaoEnum");
    }
}

  @XmlElement(name="situacaoSolicitacao", required = true)
  @ApiModelProperty(example = "DUIMP_AGUARDANDO_EXIGENCIA", required = true, value = "Descrição da situação da solicitação")
 /**
   * Descrição da situação da solicitação
  **/
  private SituacaoSolicitacaoEnum situacaoSolicitacao = null;

  @XmlElement(name="status")
  @ApiModelProperty(example = "Entrega não permitida. Solicitação de pagamento/exoneração do ICMS realizada no Portal Siscomex não concluída.", value = "Status da entrega, conforme o tipo de tratamento")
 /**
   * Status da entrega, conforme o tipo de tratamento
  **/
  private String status = null;


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

  @XmlElement(name="valorAfrmm")
  @ApiModelProperty(example = "95.8", value = "Valor do AFRMM no momento da criação da solicitação<br>Formato: Decimal, com 2 casas decimais separadas por ponto.<br>Tamanho: 15,2<br/>(*) Obrigatório para Duimp de modal marítmo.")
  @Valid
 /**
   * Valor do AFRMM no momento da criação da solicitação<br>Formato: Decimal, com 2 casas decimais separadas por ponto.<br>Tamanho: 15,2<br/>(*) Obrigatório para Duimp de modal marítmo.
  **/
  private BigDecimal valorAfrmm = null;

  @XmlElement(name="valorCIFExonerado")
  @ApiModelProperty(example = "60.33", value = "Valor CIF Exonerado (abatido da base de cálculo de ICMS)<br>Formato: Decimal, com 2 casas decimais separadas por ponto.<br>Tamanho: 15,2<br/>(*) Obrigatório se tipoSolicitacao = EXONERACAO_PAG_PARCIAL_DUIMP ou EXONERACAO_INTEGRAL_DUIMP.")
  @Valid
 /**
   * Valor CIF Exonerado (abatido da base de cálculo de ICMS)<br>Formato: Decimal, com 2 casas decimais separadas por ponto.<br>Tamanho: 15,2<br/>(*) Obrigatório se tipoSolicitacao = EXONERACAO_PAG_PARCIAL_DUIMP ou EXONERACAO_INTEGRAL_DUIMP.
  **/
  private BigDecimal valorCIFExonerado = null;

  @XmlElement(name="valorCIFPagamento")
  @ApiModelProperty(example = "162.57", value = "Valor considerado para a base de cálculo do ICMS<br>Formato: Decimal, com 2 casas decimais separadas por ponto.<br>Tamanho: 15,2<br/>(*) Obrigatório se tipoSolicitacao = PAGAMENTO_PARCIAL_DUIMP ou EXONERACAO_PAG_PARCIAL_DUIMP.")
  @Valid
 /**
   * Valor considerado para a base de cálculo do ICMS<br>Formato: Decimal, com 2 casas decimais separadas por ponto.<br>Tamanho: 15,2<br/>(*) Obrigatório se tipoSolicitacao = PAGAMENTO_PARCIAL_DUIMP ou EXONERACAO_PAG_PARCIAL_DUIMP.
  **/
  private BigDecimal valorCIFPagamento = null;

  @XmlElement(name="valorDespesasAduaneiras")
  @ApiModelProperty(example = "162.57", value = "Valor das demais despesas aduaneiras<br>Formato: Decimal, com 2 casas decimais separadas por ponto.<br>Tamanho: 15,2")
  @Valid
 /**
   * Valor das demais despesas aduaneiras<br>Formato: Decimal, com 2 casas decimais separadas por ponto.<br>Tamanho: 15,2
  **/
  private BigDecimal valorDespesasAduaneiras = null;

  @XmlElement(name="valorTotalARecolher", required = true)
  @ApiModelProperty(example = "103.2", required = true, value = "Valor total a recolher de ICMS<br>Formato: Decimal, com 2 casas decimais separadas por ponto.<br>Tamanho: 15,2")
  @Valid
 /**
   * Valor total a recolher de ICMS<br>Formato: Decimal, com 2 casas decimais separadas por ponto.<br>Tamanho: 15,2
  **/
  private BigDecimal valorTotalARecolher = null;

  @XmlElement(name="valorTotalCredito", required = true)
  @ApiModelProperty(example = "103.2", required = true, value = "Valor total do crédito de ICMS<br>Formato: Decimal, com 2 casas decimais separadas por ponto.<br>Tamanho: 15,2")
  @Valid
 /**
   * Valor total do crédito de ICMS<br>Formato: Decimal, com 2 casas decimais separadas por ponto.<br>Tamanho: 15,2
  **/
  private BigDecimal valorTotalCredito = null;

  @XmlElement(name="valorTotalDevido", required = true)
  @ApiModelProperty(example = "103.2", required = true, value = "Valor total devido de ICMS<br>Formato: Decimal, com 2 casas decimais separadas por ponto.<br>Tamanho: 15,2")
  @Valid
 /**
   * Valor total devido de ICMS<br>Formato: Decimal, com 2 casas decimais separadas por ponto.<br>Tamanho: 15,2
  **/
  private BigDecimal valorTotalDevido = null;

  @XmlElement(name="versaoDeclaracao", required = true)
  @ApiModelProperty(example = "1", required = true, value = "Versão da declaração<br>Valor mínimo: 1<br>Valor máximo: 9999")
 /**
   * Versão da declaração<br>Valor mínimo: 1<br>Valor máximo: 9999
  **/
  private String versaoDeclaracao = null;
 /**
   * Flag para indicar se a carga foi entregue &lt;br/&gt;(*) Utilizado para tipo de tratamento manual
   * @return cargaEntregue
  **/
  @JsonProperty("cargaEntregue")
  @NotNull
  public Boolean isCargaEntregue() {
    return cargaEntregue;
  }

  public void setCargaEntregue(Boolean cargaEntregue) {
    this.cargaEntregue = cargaEntregue;
  }

  public SolicitacaoIcmsDto cargaEntregue(Boolean cargaEntregue) {
    this.cargaEntregue = cargaEntregue;
    return this;
  }

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

  public SolicitacaoIcmsDto cnaeAdquirente(String cnaeAdquirente) {
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

  public SolicitacaoIcmsDto cnaeImportador(String cnaeImportador) {
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

  public SolicitacaoIcmsDto codMunicipioDesembaracoPretendido(String codMunicipioDesembaracoPretendido) {
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

  public SolicitacaoIcmsDto cpfSolicitante(String cpfSolicitante) {
    this.cpfSolicitante = cpfSolicitante;
    return this;
  }

 /**
   * Data e hora da confirmação do crédito de ICMS&lt;br&gt;Formato: &#39;yyyy-MM-dd&#39;T&#39;HH:mm:ssZ&#39;
   * @return dataConfirmacaoCredito
  **/
  @JsonProperty("dataConfirmacaoCredito")
  @NotNull
  public String getDataConfirmacaoCredito() {
    return dataConfirmacaoCredito;
  }

  public void setDataConfirmacaoCredito(String dataConfirmacaoCredito) {
    this.dataConfirmacaoCredito = dataConfirmacaoCredito;
  }

  public SolicitacaoIcmsDto dataConfirmacaoCredito(String dataConfirmacaoCredito) {
    this.dataConfirmacaoCredito = dataConfirmacaoCredito;
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

  public SolicitacaoIcmsDto descricaoDespesasAduaneiras(String descricaoDespesasAduaneiras) {
    this.descricaoDespesasAduaneiras = descricaoDespesasAduaneiras;
    return this;
  }

 /**
   * Lista de guias de pagamento de ICMS (não canceladas)
   * @return guias
  **/
  @JsonProperty("guias")
  public List<GuiaIcmsDto> getGuias() {
    return guias;
  }

  public void setGuias(List<GuiaIcmsDto> guias) {
    this.guias = guias;
  }

  public SolicitacaoIcmsDto guias(List<GuiaIcmsDto> guias) {
    this.guias = guias;
    return this;
  }

  public SolicitacaoIcmsDto addGuiasItem(GuiaIcmsDto guiasItem) {
    this.guias.add(guiasItem);
    return this;
  }

 /**
   * Histórico da solicitação de ICMS
   * @return historico
  **/
  @JsonProperty("historico")
  public List<SituacaoHistoricoDto> getHistorico() {
    return historico;
  }

  public void setHistorico(List<SituacaoHistoricoDto> historico) {
    this.historico = historico;
  }

  public SolicitacaoIcmsDto historico(List<SituacaoHistoricoDto> historico) {
    this.historico = historico;
    return this;
  }

  public SolicitacaoIcmsDto addHistoricoItem(SituacaoHistoricoDto historicoItem) {
    this.historico.add(historicoItem);
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

  public SolicitacaoIcmsDto informacoesComplementares(String informacoesComplementares) {
    this.informacoesComplementares = informacoesComplementares;
    return this;
  }

 /**
   * Número do Mandado Judicial &lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 30&lt;br/&gt;(*) Obrigatório se tipoSolicitacao &#x3D; MANDADO_JUDICIAL_DUIMP
   * @return numMandadoJudicial
  **/
  @JsonProperty("numMandadoJudicial")
  public String getNumMandadoJudicial() {
    return numMandadoJudicial;
  }

  public void setNumMandadoJudicial(String numMandadoJudicial) {
    this.numMandadoJudicial = numMandadoJudicial;
  }

  public SolicitacaoIcmsDto numMandadoJudicial(String numMandadoJudicial) {
    this.numMandadoJudicial = numMandadoJudicial;
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

  public SolicitacaoIcmsDto numeroDeclaracao(String numeroDeclaracao) {
    this.numeroDeclaracao = numeroDeclaracao;
    return this;
  }

 /**
   * Get opcaoIcms
   * @return opcaoIcms
  **/
  @JsonProperty("opcaoIcms")
  public OpcaoIcmsConsultaDto getOpcaoIcms() {
    return opcaoIcms;
  }

  public void setOpcaoIcms(OpcaoIcmsConsultaDto opcaoIcms) {
    this.opcaoIcms = opcaoIcms;
  }

  public SolicitacaoIcmsDto opcaoIcms(OpcaoIcmsConsultaDto opcaoIcms) {
    this.opcaoIcms = opcaoIcms;
    return this;
  }

 /**
   * Período de referência&lt;br&gt;Formato: &#39;yyyy-MM&#39;
   * @return periodoReferencia
  **/
  @JsonProperty("periodoReferencia")
  @NotNull
  public String getPeriodoReferencia() {
    return periodoReferencia;
  }

  public void setPeriodoReferencia(String periodoReferencia) {
    this.periodoReferencia = periodoReferencia;
  }

  public SolicitacaoIcmsDto periodoReferencia(String periodoReferencia) {
    this.periodoReferencia = periodoReferencia;
    return this;
  }

 /**
   * Descrição da situação da solicitação
   * @return situacaoSolicitacao
  **/
  @JsonProperty("situacaoSolicitacao")
  @NotNull
  public String getSituacaoSolicitacao() {
    if (situacaoSolicitacao == null) {
      return null;
    }
    return situacaoSolicitacao.value();
  }

  public void setSituacaoSolicitacao(SituacaoSolicitacaoEnum situacaoSolicitacao) {
    this.situacaoSolicitacao = situacaoSolicitacao;
  }

  public SolicitacaoIcmsDto situacaoSolicitacao(SituacaoSolicitacaoEnum situacaoSolicitacao) {
    this.situacaoSolicitacao = situacaoSolicitacao;
    return this;
  }

 /**
   * Status da entrega, conforme o tipo de tratamento
   * @return status
  **/
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public SolicitacaoIcmsDto status(String status) {
    this.status = status;
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

  public SolicitacaoIcmsDto tipoDeclaracao(TipoDeclaracaoEnum tipoDeclaracao) {
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

  public SolicitacaoIcmsDto tipoSolicitacao(TipoSolicitacaoEnum tipoSolicitacao) {
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

  public SolicitacaoIcmsDto tipoTratamento(TipoTratamentoEnum tipoTratamento) {
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

  public SolicitacaoIcmsDto ufAdquirente(UfAdquirenteEnum ufAdquirente) {
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

  public SolicitacaoIcmsDto ufFavorecida(UfFavorecidaEnum ufFavorecida) {
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

  public SolicitacaoIcmsDto ufImportador(UfImportadorEnum ufImportador) {
    this.ufImportador = ufImportador;
    return this;
  }

 /**
   * Valor do AFRMM no momento da criação da solicitação&lt;br&gt;Formato: Decimal, com 2 casas decimais separadas por ponto.&lt;br&gt;Tamanho: 15,2&lt;br/&gt;(*) Obrigatório para Duimp de modal marítmo.
   * @return valorAfrmm
  **/
  @JsonProperty("valorAfrmm")
  public BigDecimal getValorAfrmm() {
    return valorAfrmm;
  }

  public void setValorAfrmm(BigDecimal valorAfrmm) {
    this.valorAfrmm = valorAfrmm;
  }

  public SolicitacaoIcmsDto valorAfrmm(BigDecimal valorAfrmm) {
    this.valorAfrmm = valorAfrmm;
    return this;
  }

 /**
   * Valor CIF Exonerado (abatido da base de cálculo de ICMS)&lt;br&gt;Formato: Decimal, com 2 casas decimais separadas por ponto.&lt;br&gt;Tamanho: 15,2&lt;br/&gt;(*) Obrigatório se tipoSolicitacao &#x3D; EXONERACAO_PAG_PARCIAL_DUIMP ou EXONERACAO_INTEGRAL_DUIMP.
   * @return valorCIFExonerado
  **/
  @JsonProperty("valorCIFExonerado")
  public BigDecimal getValorCIFExonerado() {
    return valorCIFExonerado;
  }

  public void setValorCIFExonerado(BigDecimal valorCIFExonerado) {
    this.valorCIFExonerado = valorCIFExonerado;
  }

  public SolicitacaoIcmsDto valorCIFExonerado(BigDecimal valorCIFExonerado) {
    this.valorCIFExonerado = valorCIFExonerado;
    return this;
  }

 /**
   * Valor considerado para a base de cálculo do ICMS&lt;br&gt;Formato: Decimal, com 2 casas decimais separadas por ponto.&lt;br&gt;Tamanho: 15,2&lt;br/&gt;(*) Obrigatório se tipoSolicitacao &#x3D; PAGAMENTO_PARCIAL_DUIMP ou EXONERACAO_PAG_PARCIAL_DUIMP.
   * @return valorCIFPagamento
  **/
  @JsonProperty("valorCIFPagamento")
  public BigDecimal getValorCIFPagamento() {
    return valorCIFPagamento;
  }

  public void setValorCIFPagamento(BigDecimal valorCIFPagamento) {
    this.valorCIFPagamento = valorCIFPagamento;
  }

  public SolicitacaoIcmsDto valorCIFPagamento(BigDecimal valorCIFPagamento) {
    this.valorCIFPagamento = valorCIFPagamento;
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

  public SolicitacaoIcmsDto valorDespesasAduaneiras(BigDecimal valorDespesasAduaneiras) {
    this.valorDespesasAduaneiras = valorDespesasAduaneiras;
    return this;
  }

 /**
   * Valor total a recolher de ICMS&lt;br&gt;Formato: Decimal, com 2 casas decimais separadas por ponto.&lt;br&gt;Tamanho: 15,2
   * @return valorTotalARecolher
  **/
  @JsonProperty("valorTotalARecolher")
  @NotNull
  public BigDecimal getValorTotalARecolher() {
    return valorTotalARecolher;
  }

  public void setValorTotalARecolher(BigDecimal valorTotalARecolher) {
    this.valorTotalARecolher = valorTotalARecolher;
  }

  public SolicitacaoIcmsDto valorTotalARecolher(BigDecimal valorTotalARecolher) {
    this.valorTotalARecolher = valorTotalARecolher;
    return this;
  }

 /**
   * Valor total do crédito de ICMS&lt;br&gt;Formato: Decimal, com 2 casas decimais separadas por ponto.&lt;br&gt;Tamanho: 15,2
   * @return valorTotalCredito
  **/
  @JsonProperty("valorTotalCredito")
  @NotNull
  public BigDecimal getValorTotalCredito() {
    return valorTotalCredito;
  }

  public void setValorTotalCredito(BigDecimal valorTotalCredito) {
    this.valorTotalCredito = valorTotalCredito;
  }

  public SolicitacaoIcmsDto valorTotalCredito(BigDecimal valorTotalCredito) {
    this.valorTotalCredito = valorTotalCredito;
    return this;
  }

 /**
   * Valor total devido de ICMS&lt;br&gt;Formato: Decimal, com 2 casas decimais separadas por ponto.&lt;br&gt;Tamanho: 15,2
   * @return valorTotalDevido
  **/
  @JsonProperty("valorTotalDevido")
  @NotNull
  public BigDecimal getValorTotalDevido() {
    return valorTotalDevido;
  }

  public void setValorTotalDevido(BigDecimal valorTotalDevido) {
    this.valorTotalDevido = valorTotalDevido;
  }

  public SolicitacaoIcmsDto valorTotalDevido(BigDecimal valorTotalDevido) {
    this.valorTotalDevido = valorTotalDevido;
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

  public SolicitacaoIcmsDto versaoDeclaracao(String versaoDeclaracao) {
    this.versaoDeclaracao = versaoDeclaracao;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SolicitacaoIcmsDto {\n");
    
    sb.append("    cargaEntregue: ").append(toIndentedString(cargaEntregue)).append("\n");
    sb.append("    cnaeAdquirente: ").append(toIndentedString(cnaeAdquirente)).append("\n");
    sb.append("    cnaeImportador: ").append(toIndentedString(cnaeImportador)).append("\n");
    sb.append("    codMunicipioDesembaracoPretendido: ").append(toIndentedString(codMunicipioDesembaracoPretendido)).append("\n");
    sb.append("    cpfSolicitante: ").append(toIndentedString(cpfSolicitante)).append("\n");
    sb.append("    dataConfirmacaoCredito: ").append(toIndentedString(dataConfirmacaoCredito)).append("\n");
    sb.append("    descricaoDespesasAduaneiras: ").append(toIndentedString(descricaoDespesasAduaneiras)).append("\n");
    sb.append("    guias: ").append(toIndentedString(guias)).append("\n");
    sb.append("    historico: ").append(toIndentedString(historico)).append("\n");
    sb.append("    informacoesComplementares: ").append(toIndentedString(informacoesComplementares)).append("\n");
    sb.append("    numMandadoJudicial: ").append(toIndentedString(numMandadoJudicial)).append("\n");
    sb.append("    numeroDeclaracao: ").append(toIndentedString(numeroDeclaracao)).append("\n");
    sb.append("    opcaoIcms: ").append(toIndentedString(opcaoIcms)).append("\n");
    sb.append("    periodoReferencia: ").append(toIndentedString(periodoReferencia)).append("\n");
    sb.append("    situacaoSolicitacao: ").append(toIndentedString(situacaoSolicitacao)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tipoDeclaracao: ").append(toIndentedString(tipoDeclaracao)).append("\n");
    sb.append("    tipoSolicitacao: ").append(toIndentedString(tipoSolicitacao)).append("\n");
    sb.append("    tipoTratamento: ").append(toIndentedString(tipoTratamento)).append("\n");
    sb.append("    ufAdquirente: ").append(toIndentedString(ufAdquirente)).append("\n");
    sb.append("    ufFavorecida: ").append(toIndentedString(ufFavorecida)).append("\n");
    sb.append("    ufImportador: ").append(toIndentedString(ufImportador)).append("\n");
    sb.append("    valorAfrmm: ").append(toIndentedString(valorAfrmm)).append("\n");
    sb.append("    valorCIFExonerado: ").append(toIndentedString(valorCIFExonerado)).append("\n");
    sb.append("    valorCIFPagamento: ").append(toIndentedString(valorCIFPagamento)).append("\n");
    sb.append("    valorDespesasAduaneiras: ").append(toIndentedString(valorDespesasAduaneiras)).append("\n");
    sb.append("    valorTotalARecolher: ").append(toIndentedString(valorTotalARecolher)).append("\n");
    sb.append("    valorTotalCredito: ").append(toIndentedString(valorTotalCredito)).append("\n");
    sb.append("    valorTotalDevido: ").append(toIndentedString(valorTotalDevido)).append("\n");
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

