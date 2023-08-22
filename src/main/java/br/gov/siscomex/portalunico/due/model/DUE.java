package br.gov.siscomex.portalunico.due.model;

import br.gov.siscomex.portalunico.due.model.CNPJ;
import br.gov.siscomex.portalunico.due.model.DeclaracaoTributaria;
import br.gov.siscomex.portalunico.due.model.EventoDoHistoricoDTO;
import br.gov.siscomex.portalunico.due.model.ExigenciaFiscalDTO;
import br.gov.siscomex.portalunico.due.model.ItemDUERemoteDTO;
import br.gov.siscomex.portalunico.due.model.Link;
import br.gov.siscomex.portalunico.due.model.MoedaDto;
import br.gov.siscomex.portalunico.due.model.MotivoDispensaNotaFiscalDTO;
import br.gov.siscomex.portalunico.due.model.PaisDto;
import br.gov.siscomex.portalunico.due.model.PessoaDTO;
import br.gov.siscomex.portalunico.due.model.RecintoAduaneiroDto;
import br.gov.siscomex.portalunico.due.model.SituacaoDaCargaDTO;
import br.gov.siscomex.portalunico.due.model.SolicitacaoDTO;
import br.gov.siscomex.portalunico.due.model.UnidadeLocalRFBDto;
import br.gov.siscomex.portalunico.due.model.ViaTransporteEspecialDTO;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
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
 @XmlType(name = "DUE", propOrder =
    { "atosConcessoriosIsencao", "bloqueio", "canal", "chaveDeAcesso", "consorciada", "dat", "dataDeCriacao", "dataDeRegistro", "dataDoCCE", "declaracaoTributaria", "declarante", "despachoEmRecintoAlfandegado", "despachoEmRecintoDomiciliar", "embarqueEmRecintoAlfandegado", "enderecoDoEstabelecimentoDoLocalDeDespacho", "enderecoDoEstabelecimentoDoLocalDeEmbarque", "estabelecimentoDoLocalDeDespacho", "eventosDoHistorico", "exigenciaAtiva", "exigenciasFiscais", "exigenciasFiscaisEstruturadas", "formaDeExportacao", "impedidoDeEmbarque", "inclusaoNotaFiscal", "informacoesComplementares", "itens", "justificativaDeDispensaDaNotaFiscal", "latitudeDoLocalDeDespacho", "latitudeDoLocalDeEmbarque", "longitudeDoLocalDeDespacho", "longitudeDoLocalDeEmbarque", "moeda", "motivoDeDispensaDaNotaFiscal", "numero", "oea", "paisImportador", "recintoAduaneiroDeDespacho", "recintoAduaneiroDeEmbarque", "referenciaDoEnderecoDoLocalDeDespacho", "referenciaDoEnderecoDoLocalDeEmbarque", "responsavelPeloACD", "ruc", "situacao", "situacaoDoTratamentoAdministrativo", "situacaoEspecial", "situacoesDaCarga", "solicitacoes", "tipo", "tratamentoPrioritario", "unidadeLocalDeAnaliseFiscal", "unidadeLocalDeDespacho", "unidadeLocalDeEmbarque", "valorTotalMercadoria", "viaDeTransporteEspecial"
})

@XmlRootElement(name="DUE")
public class DUE  {
  
  @XmlElement(name="atosConcessoriosIsencao")
  @ApiModelProperty(value = "")
  @Valid
  private Link atosConcessoriosIsencao = null;

  @XmlElement(name="bloqueio")
  @ApiModelProperty(value = "")
  private Boolean bloqueio = false;


@XmlType(name="CanalEnum")
@XmlEnum(String.class)
public enum CanalEnum {

	@XmlEnumValue("VERDE")
	@JsonProperty("VERDE")
	VERDE(String.valueOf("VERDE")),
	
	@XmlEnumValue("LARANJA")
	@JsonProperty("LARANJA")
	LARANJA(String.valueOf("LARANJA")),
	
	@XmlEnumValue("VERMELHO")
	@JsonProperty("VERMELHO")
	VERMELHO(String.valueOf("VERMELHO"));


    private String value;

    CanalEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static CanalEnum fromValue(String v) {
        for (CanalEnum b : CanalEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to CanalEnum");
    }
}

  @XmlElement(name="canal")
  @ApiModelProperty(value = "")
  private CanalEnum canal = null;

  @XmlElement(name="chaveDeAcesso")
  @ApiModelProperty(example = "17AAA101000", value = "Chave de acesso<br />Tamanho: 11<br />Formato: 'NNAAANNNNNN'")
 /**
   * Chave de acesso<br />Tamanho: 11<br />Formato: 'NNAAANNNNNN'
  **/
  private String chaveDeAcesso = null;

  @XmlElement(name="consorciada")
  @ApiModelProperty(value = "")
  private Boolean consorciada = false;

  @XmlElement(name="dat")
  @ApiModelProperty(value = "")
  private Boolean dat = false;

  @XmlElement(name="dataDeCriacao")
  @ApiModelProperty(example = "2019-09-20T14:13:46.966Z", value = "Data de criação<br />Formato:'yyyy-MM-dd'T'HH:mm:ss.SSSZ'")
 /**
   * Data de criação<br />Formato:'yyyy-MM-dd'T'HH:mm:ss.SSSZ'
  **/
  private OffsetDateTime dataDeCriacao = null;

  @XmlElement(name="dataDeRegistro")
  @ApiModelProperty(example = "2019-09-20T14:13:46.966Z", value = "Data de registro<br />Formato:'yyyy-MM-dd'T'HH:mm:ss.SSSZ'")
 /**
   * Data de registro<br />Formato:'yyyy-MM-dd'T'HH:mm:ss.SSSZ'
  **/
  private OffsetDateTime dataDeRegistro = null;

  @XmlElement(name="dataDoCCE")
  @ApiModelProperty(example = "2019-09-20T14:13:46.966Z", value = "Data em que a carga foi completamente exportada<br />Formato:'yyyy-MM-dd'T'HH:mm:ss.SSSZ'")
 /**
   * Data em que a carga foi completamente exportada<br />Formato:'yyyy-MM-dd'T'HH:mm:ss.SSSZ'
  **/
  private OffsetDateTime dataDoCCE = null;

  @XmlElement(name="declaracaoTributaria")
  @ApiModelProperty(value = "")
  @Valid
  private DeclaracaoTributaria declaracaoTributaria = null;

  @XmlElement(name="declarante")
  @ApiModelProperty(value = "")
  @Valid
  private PessoaDTO declarante = null;

  @XmlElement(name="despachoEmRecintoAlfandegado")
  @ApiModelProperty(value = "")
  private Boolean despachoEmRecintoAlfandegado = false;

  @XmlElement(name="despachoEmRecintoDomiciliar")
  @ApiModelProperty(value = "")
  private Boolean despachoEmRecintoDomiciliar = false;

  @XmlElement(name="embarqueEmRecintoAlfandegado")
  @ApiModelProperty(value = "")
  private Boolean embarqueEmRecintoAlfandegado = false;

  @XmlElement(name="enderecoDoEstabelecimentoDoLocalDeDespacho")
  @ApiModelProperty(value = "Endereço do estabelecimento do local de despacho<br />Tamanho mínimo: 0<br />Tamanho máximo: 240")
 /**
   * Endereço do estabelecimento do local de despacho<br />Tamanho mínimo: 0<br />Tamanho máximo: 240
  **/
  private String enderecoDoEstabelecimentoDoLocalDeDespacho = null;

  @XmlElement(name="enderecoDoEstabelecimentoDoLocalDeEmbarque")
  @ApiModelProperty(value = "Endereço do estabelecimento do local de embarque<br />Tamanho mínimo: 0<br />Tamanho máximo: 240")
 /**
   * Endereço do estabelecimento do local de embarque<br />Tamanho mínimo: 0<br />Tamanho máximo: 240
  **/
  private String enderecoDoEstabelecimentoDoLocalDeEmbarque = null;

  @XmlElement(name="estabelecimentoDoLocalDeDespacho")
  @ApiModelProperty(value = "")
  @Valid
  private CNPJ estabelecimentoDoLocalDeDespacho = null;

  @XmlElement(name="eventosDoHistorico")
  @ApiModelProperty(value = "")
  @Valid
  private List<EventoDoHistoricoDTO> eventosDoHistorico = null;

  @XmlElement(name="exigenciaAtiva")
  @ApiModelProperty(value = "")
  private Boolean exigenciaAtiva = false;

  @XmlElement(name="exigenciasFiscais")
  @ApiModelProperty(value = "*Campo descontinuado, utilize o atributo exigenciasFiscaisEstruturadas ")
  @Valid
 /**
   * *Campo descontinuado, utilize o atributo exigenciasFiscaisEstruturadas 
  **/
  private List<ExigenciaFiscalDTO> exigenciasFiscais = null;

  @XmlElement(name="exigenciasFiscaisEstruturadas")
  @ApiModelProperty(value = "")
  @Valid
  private Link exigenciasFiscaisEstruturadas = null;


@XmlType(name="FormaDeExportacaoEnum")
@XmlEnum(String.class)
public enum FormaDeExportacaoEnum {

	@XmlEnumValue("POR_CONTA_PROPRIA")
	@JsonProperty("POR_CONTA_PROPRIA")
	CONTA_PROPRIA(String.valueOf("POR_CONTA_PROPRIA")),
	
	@XmlEnumValue("POR_CONTA_E_ORDEM_TERCEIROS")
	@JsonProperty("POR_CONTA_E_ORDEM_TERCEIROS")
	CONTA_E_ORDEM_TERCEIROS(String.valueOf("POR_CONTA_E_ORDEM_TERCEIROS")),
	
	@XmlEnumValue("POR_OPERADOR_REMESSA_POSTAL")
	@JsonProperty("POR_OPERADOR_REMESSA_POSTAL")
	OPERADOR_REMESSA_POSTAL(String.valueOf("POR_OPERADOR_REMESSA_POSTAL"));


    private String value;

    FormaDeExportacaoEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static FormaDeExportacaoEnum fromValue(String v) {
        for (FormaDeExportacaoEnum b : FormaDeExportacaoEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to FormaDeExportacaoEnum");
    }
}

  @XmlElement(name="formaDeExportacao")
  @ApiModelProperty(value = "")
  private FormaDeExportacaoEnum formaDeExportacao = null;

  @XmlElement(name="impedidoDeEmbarque")
  @ApiModelProperty(value = "")
  private Boolean impedidoDeEmbarque = false;

  @XmlElement(name="inclusaoNotaFiscal")
  @ApiModelProperty(value = "")
  private Boolean inclusaoNotaFiscal = false;

  @XmlElement(name="informacoesComplementares")
  @ApiModelProperty(value = "Informações complementares<br />Tamanho mínimo: 0<br />Tamanho máximo: 2000")
 /**
   * Informações complementares<br />Tamanho mínimo: 0<br />Tamanho máximo: 2000
  **/
  private String informacoesComplementares = null;

  @XmlElement(name="itens")
  @ApiModelProperty(value = "")
  @Valid
  private List<ItemDUERemoteDTO> itens = null;

  @XmlElement(name="justificativaDeDispensaDaNotaFiscal")
  @ApiModelProperty(value = "Justificativa de dispensa da Nota Fiscal<br />Tamanho mínimo: 0<br />Tamanho máximo: 1000")
 /**
   * Justificativa de dispensa da Nota Fiscal<br />Tamanho mínimo: 0<br />Tamanho máximo: 1000
  **/
  private String justificativaDeDispensaDaNotaFiscal = null;

  @XmlElement(name="latitudeDoLocalDeDespacho")
  @ApiModelProperty(value = "Latitude do Local de Despacho<br />Regex: \"^((-)?90(\\\\.[0]{6}))|((-)?([0-9]|[1-8][0-9])(\\\\.[0-9]{6}))$\"")
 /**
   * Latitude do Local de Despacho<br />Regex: \"^((-)?90(\\\\.[0]{6}))|((-)?([0-9]|[1-8][0-9])(\\\\.[0-9]{6}))$\"
  **/
  private String latitudeDoLocalDeDespacho = null;

  @XmlElement(name="latitudeDoLocalDeEmbarque")
  @ApiModelProperty(value = "Latitude do Local de embarque<br />Regex: \"^((-)?90(\\\\.[0]{6}))|((-)?([0-9]|[1-8][0-9])(\\\\.[0-9]{6}))$\"")
 /**
   * Latitude do Local de embarque<br />Regex: \"^((-)?90(\\\\.[0]{6}))|((-)?([0-9]|[1-8][0-9])(\\\\.[0-9]{6}))$\"
  **/
  private String latitudeDoLocalDeEmbarque = null;

  @XmlElement(name="longitudeDoLocalDeDespacho")
  @ApiModelProperty(value = "Longitude do Local de Despacho<br />Regex: \"^((-)?90(\\\\.[0]{6}))|((-)?([0-9]|[1-8][0-9])(\\\\.[0-9]{6}))$\"")
 /**
   * Longitude do Local de Despacho<br />Regex: \"^((-)?90(\\\\.[0]{6}))|((-)?([0-9]|[1-8][0-9])(\\\\.[0-9]{6}))$\"
  **/
  private String longitudeDoLocalDeDespacho = null;

  @XmlElement(name="longitudeDoLocalDeEmbarque")
  @ApiModelProperty(value = "Longitude do Local de Despacho<br />Regex: \"^((-)?90(\\\\.[0]{6}))|((-)?([0-9]|[1-8][0-9])(\\\\.[0-9]{6}))$\"")
 /**
   * Longitude do Local de Despacho<br />Regex: \"^((-)?90(\\\\.[0]{6}))|((-)?([0-9]|[1-8][0-9])(\\\\.[0-9]{6}))$\"
  **/
  private String longitudeDoLocalDeEmbarque = null;

  @XmlElement(name="moeda")
  @ApiModelProperty(value = "")
  @Valid
  private MoedaDto moeda = null;

  @XmlElement(name="motivoDeDispensaDaNotaFiscal")
  @ApiModelProperty(value = "")
  @Valid
  private MotivoDispensaNotaFiscalDTO motivoDeDispensaDaNotaFiscal = null;

  @XmlElement(name="numero")
  @ApiModelProperty(example = "19BR0000056196", value = "Número da DUE<br />Tamanho: 14<br />Formato: 'NNAANNNNNNNNNN'")
 /**
   * Número da DUE<br />Tamanho: 14<br />Formato: 'NNAANNNNNNNNNN'
  **/
  private String numero = null;

  @XmlElement(name="oea")
  @ApiModelProperty(value = "")
  private Boolean oea = false;

  @XmlElement(name="paisImportador")
  @ApiModelProperty(value = "")
  @Valid
  private PaisDto paisImportador = null;

  @XmlElement(name="recintoAduaneiroDeDespacho")
  @ApiModelProperty(value = "")
  @Valid
  private RecintoAduaneiroDto recintoAduaneiroDeDespacho = null;

  @XmlElement(name="recintoAduaneiroDeEmbarque")
  @ApiModelProperty(value = "")
  @Valid
  private RecintoAduaneiroDto recintoAduaneiroDeEmbarque = null;

  @XmlElement(name="referenciaDoEnderecoDoLocalDeDespacho")
  @ApiModelProperty(value = "Referência do endereço do local de despacho<br />Tamanho mínimo: 0<br />Tamanho máximo: 240")
 /**
   * Referência do endereço do local de despacho<br />Tamanho mínimo: 0<br />Tamanho máximo: 240
  **/
  private String referenciaDoEnderecoDoLocalDeDespacho = null;

  @XmlElement(name="referenciaDoEnderecoDoLocalDeEmbarque")
  @ApiModelProperty(value = "Referência do endereço do local de embarque<br />Tamanho mínimo: 0<br />Tamanho máximo: 240")
 /**
   * Referência do endereço do local de embarque<br />Tamanho mínimo: 0<br />Tamanho máximo: 240
  **/
  private String referenciaDoEnderecoDoLocalDeEmbarque = null;


@XmlType(name="ResponsavelPeloACDEnum")
@XmlEnum(String.class)
public enum ResponsavelPeloACDEnum {

	@XmlEnumValue("REGISTRO_DA_DUE")
	@JsonProperty("REGISTRO_DA_DUE")
	REGISTRO_DA_DUE(String.valueOf("REGISTRO_DA_DUE")),
	
	@XmlEnumValue("RECEPCAO_NO_CCT")
	@JsonProperty("RECEPCAO_NO_CCT")
	RECEPCAO_NO_CCT(String.valueOf("RECEPCAO_NO_CCT"));


    private String value;

    ResponsavelPeloACDEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ResponsavelPeloACDEnum fromValue(String v) {
        for (ResponsavelPeloACDEnum b : ResponsavelPeloACDEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to ResponsavelPeloACDEnum");
    }
}

  @XmlElement(name="responsavelPeloACD")
  @ApiModelProperty(value = "")
  private ResponsavelPeloACDEnum responsavelPeloACD = null;

  @XmlElement(name="ruc")
  @ApiModelProperty(example = "9BR00000000100000000000000000023366", value = "RUC - Número da referência única de carga<br />Tamanho: 35<br />Formato: 'NAANNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN'")
 /**
   * RUC - Número da referência única de carga<br />Tamanho: 35<br />Formato: 'NAANNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN'
  **/
  private String ruc = null;


@XmlType(name="SituacaoEnum")
@XmlEnum(String.class)
public enum SituacaoEnum {

	@XmlEnumValue("EM_ELABORACAO")
	@JsonProperty("EM_ELABORACAO")
	EM_ELABORACAO(String.valueOf("EM_ELABORACAO")),
	
	@XmlEnumValue("REGISTRADA")
	@JsonProperty("REGISTRADA")
	REGISTRADA(String.valueOf("REGISTRADA")),
	
	@XmlEnumValue("ACD_EM_PROCESSAMENTO")
	@JsonProperty("ACD_EM_PROCESSAMENTO")
	ACD_EM_PROCESSAMENTO(String.valueOf("ACD_EM_PROCESSAMENTO")),
	
	@XmlEnumValue("CARGA_APRESENTADA_PARA_DESPACHO")
	@JsonProperty("CARGA_APRESENTADA_PARA_DESPACHO")
	CARGA_APRESENTADA_PARA_DESPACHO(String.valueOf("CARGA_APRESENTADA_PARA_DESPACHO")),
	
	@XmlEnumValue("LIBERADA_SEM_CONFERENCIA_ADUANEIRA")
	@JsonProperty("LIBERADA_SEM_CONFERENCIA_ADUANEIRA")
	LIBERADA_SEM_CONFERENCIA_ADUANEIRA(String.valueOf("LIBERADA_SEM_CONFERENCIA_ADUANEIRA")),
	
	@XmlEnumValue("SELECIONADA_PARA_FISCALIZACAO")
	@JsonProperty("SELECIONADA_PARA_FISCALIZACAO")
	SELECIONADA_PARA_FISCALIZACAO(String.valueOf("SELECIONADA_PARA_FISCALIZACAO")),
	
	@XmlEnumValue("EMBARQUE_ANTECIPADO_COM_PENDENCIA_LPCO")
	@JsonProperty("EMBARQUE_ANTECIPADO_COM_PENDENCIA_LPCO")
	EMBARQUE_ANTECIPADO_COM_PENDENCIA_LPCO(String.valueOf("EMBARQUE_ANTECIPADO_COM_PENDENCIA_LPCO")),
	
	@XmlEnumValue("EMBARQUE_ANTECIPADO_AUTORIZADO")
	@JsonProperty("EMBARQUE_ANTECIPADO_AUTORIZADO")
	EMBARQUE_ANTECIPADO_AUTORIZADO(String.valueOf("EMBARQUE_ANTECIPADO_AUTORIZADO")),
	
	@XmlEnumValue("EMBARQUE_ANTECIPADO_PENDENTE_DE_AUTORIZACAO")
	@JsonProperty("EMBARQUE_ANTECIPADO_PENDENTE_DE_AUTORIZACAO")
	EMBARQUE_ANTECIPADO_PENDENTE_DE_AUTORIZACAO(String.valueOf("EMBARQUE_ANTECIPADO_PENDENTE_DE_AUTORIZACAO")),
	
	@XmlEnumValue("EM_ANALISE_FISCAL")
	@JsonProperty("EM_ANALISE_FISCAL")
	EM_ANALISE_FISCAL(String.valueOf("EM_ANALISE_FISCAL")),
	
	@XmlEnumValue("CONCLUSAO_DA_CONFERENCIA_ADUANA")
	@JsonProperty("CONCLUSAO_DA_CONFERENCIA_ADUANA")
	CONCLUSAO_DA_CONFERENCIA_ADUANA(String.valueOf("CONCLUSAO_DA_CONFERENCIA_ADUANA")),
	
	@XmlEnumValue("DESEMBARACADA_COM_PENDENCIA_LPCO")
	@JsonProperty("DESEMBARACADA_COM_PENDENCIA_LPCO")
	DESEMBARACADA_COM_PENDENCIA_LPCO(String.valueOf("DESEMBARACADA_COM_PENDENCIA_LPCO")),
	
	@XmlEnumValue("DESEMBARACADA")
	@JsonProperty("DESEMBARACADA")
	DESEMBARACADA(String.valueOf("DESEMBARACADA")),
	
	@XmlEnumValue("AVERBADA_SEM_DIVERGENCIA")
	@JsonProperty("AVERBADA_SEM_DIVERGENCIA")
	AVERBADA_SEM_DIVERGENCIA(String.valueOf("AVERBADA_SEM_DIVERGENCIA")),
	
	@XmlEnumValue("CANCELADA_PELO_EXPORTADOR")
	@JsonProperty("CANCELADA_PELO_EXPORTADOR")
	CANCELADA_PELO_EXPORTADOR(String.valueOf("CANCELADA_PELO_EXPORTADOR")),
	
	@XmlEnumValue("CANCELADA_POR_EXPIRACAO_DE_PRAZO")
	@JsonProperty("CANCELADA_POR_EXPIRACAO_DE_PRAZO")
	CANCELADA_POR_EXPIRACAO_DE_PRAZO(String.valueOf("CANCELADA_POR_EXPIRACAO_DE_PRAZO")),
	
	@XmlEnumValue("CANCELADA_PELA_ADUANA")
	@JsonProperty("CANCELADA_PELA_ADUANA")
	CANCELADA_PELA_ADUANA(String.valueOf("CANCELADA_PELA_ADUANA")),
	
	@XmlEnumValue("CANCELADA_PELA_ADUANA_A_PEDIDO_DO_EXPORTADOR")
	@JsonProperty("CANCELADA_PELA_ADUANA_A_PEDIDO_DO_EXPORTADOR")
	CANCELADA_PELA_ADUANA_A_PEDIDO_DO_EXPORTADOR(String.valueOf("CANCELADA_PELA_ADUANA_A_PEDIDO_DO_EXPORTADOR")),
	
	@XmlEnumValue("INTERROMPIDA")
	@JsonProperty("INTERROMPIDA")
	INTERROMPIDA(String.valueOf("INTERROMPIDA"));


    private String value;

    SituacaoEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static SituacaoEnum fromValue(String v) {
        for (SituacaoEnum b : SituacaoEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to SituacaoEnum");
    }
}

  @XmlElement(name="situacao")
  @ApiModelProperty(value = "")
  private SituacaoEnum situacao = null;


@XmlType(name="SituacaoDoTratamentoAdministrativoEnum")
@XmlEnum(String.class)
public enum SituacaoDoTratamentoAdministrativoEnum {

	@XmlEnumValue("DEFERIDO")
	@JsonProperty("DEFERIDO")
	DEFERIDO(String.valueOf("DEFERIDO")),
	
	@XmlEnumValue("DISPENSADO")
	@JsonProperty("DISPENSADO")
	DISPENSADO(String.valueOf("DISPENSADO")),
	
	@XmlEnumValue("PENDENTE")
	@JsonProperty("PENDENTE")
	PENDENTE(String.valueOf("PENDENTE")),
	
	@XmlEnumValue("EM_PROCESSAMENTO")
	@JsonProperty("EM_PROCESSAMENTO")
	EM_PROCESSAMENTO(String.valueOf("EM_PROCESSAMENTO")),
	
	@XmlEnumValue("IMPEDIDO")
	@JsonProperty("IMPEDIDO")
	IMPEDIDO(String.valueOf("IMPEDIDO"));


    private String value;

    SituacaoDoTratamentoAdministrativoEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static SituacaoDoTratamentoAdministrativoEnum fromValue(String v) {
        for (SituacaoDoTratamentoAdministrativoEnum b : SituacaoDoTratamentoAdministrativoEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to SituacaoDoTratamentoAdministrativoEnum");
    }
}

  @XmlElement(name="situacaoDoTratamentoAdministrativo")
  @ApiModelProperty(value = "")
  private SituacaoDoTratamentoAdministrativoEnum situacaoDoTratamentoAdministrativo = null;


@XmlType(name="SituacaoEspecialEnum")
@XmlEnum(String.class)
public enum SituacaoEspecialEnum {

	@XmlEnumValue("DUE_A_POSTERIORI")
	@JsonProperty("DUE_A_POSTERIORI")
	DUE_A_POSTERIORI(String.valueOf("DUE_A_POSTERIORI")),
	
	@XmlEnumValue("EMBARQUE_ANTECIPADO")
	@JsonProperty("EMBARQUE_ANTECIPADO")
	EMBARQUE_ANTECIPADO(String.valueOf("EMBARQUE_ANTECIPADO")),
	
	@XmlEnumValue("EXPORTACAO_SEM_SAIDA_PAIS")
	@JsonProperty("EXPORTACAO_SEM_SAIDA_PAIS")
	EXPORTACAO_SEM_SAIDA_PAIS(String.valueOf("EXPORTACAO_SEM_SAIDA_PAIS"));


    private String value;

    SituacaoEspecialEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static SituacaoEspecialEnum fromValue(String v) {
        for (SituacaoEspecialEnum b : SituacaoEspecialEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to SituacaoEspecialEnum");
    }
}

  @XmlElement(name="situacaoEspecial")
  @ApiModelProperty(value = "")
  private SituacaoEspecialEnum situacaoEspecial = null;

  @XmlElement(name="situacoesDaCarga")
  @ApiModelProperty(value = "")
  @Valid
  private List<SituacaoDaCargaDTO> situacoesDaCarga = null;

  @XmlElement(name="solicitacoes")
  @ApiModelProperty(value = "")
  @Valid
  private List<SolicitacaoDTO> solicitacoes = null;


@XmlType(name="TipoEnum")
@XmlEnum(String.class)
public enum TipoEnum {

	@XmlEnumValue("NOTA_FISCAL_ELETRONICA")
	@JsonProperty("NOTA_FISCAL_ELETRONICA")
	NOTA_FISCAL_ELETRONICA(String.valueOf("NOTA_FISCAL_ELETRONICA")),
	
	@XmlEnumValue("NOTA_FISCAL_FORMULARIO")
	@JsonProperty("NOTA_FISCAL_FORMULARIO")
	NOTA_FISCAL_FORMULARIO(String.valueOf("NOTA_FISCAL_FORMULARIO")),
	
	@XmlEnumValue("SEM_NOTA")
	@JsonProperty("SEM_NOTA")
	SEM_NOTA(String.valueOf("SEM_NOTA"));


    private String value;

    TipoEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TipoEnum fromValue(String v) {
        for (TipoEnum b : TipoEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to TipoEnum");
    }
}

  @XmlElement(name="tipo")
  @ApiModelProperty(value = "")
  private TipoEnum tipo = null;

  @XmlElement(name="tratamentoPrioritario")
  @ApiModelProperty(value = "")
  private Boolean tratamentoPrioritario = false;

  @XmlElement(name="unidadeLocalDeAnaliseFiscal")
  @ApiModelProperty(value = "")
  @Valid
  private UnidadeLocalRFBDto unidadeLocalDeAnaliseFiscal = null;

  @XmlElement(name="unidadeLocalDeDespacho")
  @ApiModelProperty(value = "")
  @Valid
  private UnidadeLocalRFBDto unidadeLocalDeDespacho = null;

  @XmlElement(name="unidadeLocalDeEmbarque")
  @ApiModelProperty(value = "")
  @Valid
  private UnidadeLocalRFBDto unidadeLocalDeEmbarque = null;

  @XmlElement(name="valorTotalMercadoria")
  @ApiModelProperty(value = "Valor total da mercadoria<br />Tamanho: 15,2<br />Formato: Decimal, com até 2 casas decimais separadas por ponto.")
  @Valid
 /**
   * Valor total da mercadoria<br />Tamanho: 15,2<br />Formato: Decimal, com até 2 casas decimais separadas por ponto.
  **/
  private BigDecimal valorTotalMercadoria = null;

  @XmlElement(name="viaDeTransporteEspecial")
  @ApiModelProperty(value = "")
  @Valid
  private ViaTransporteEspecialDTO viaDeTransporteEspecial = null;
 /**
   * Get atosConcessoriosIsencao
   * @return atosConcessoriosIsencao
  **/
  @JsonProperty("atosConcessoriosIsencao")
  public Link getAtosConcessoriosIsencao() {
    return atosConcessoriosIsencao;
  }

  public void setAtosConcessoriosIsencao(Link atosConcessoriosIsencao) {
    this.atosConcessoriosIsencao = atosConcessoriosIsencao;
  }

  public DUE atosConcessoriosIsencao(Link atosConcessoriosIsencao) {
    this.atosConcessoriosIsencao = atosConcessoriosIsencao;
    return this;
  }

 /**
   * Get bloqueio
   * @return bloqueio
  **/
  @JsonProperty("bloqueio")
  public Boolean isBloqueio() {
    return bloqueio;
  }

  public void setBloqueio(Boolean bloqueio) {
    this.bloqueio = bloqueio;
  }

  public DUE bloqueio(Boolean bloqueio) {
    this.bloqueio = bloqueio;
    return this;
  }

 /**
   * Get canal
   * @return canal
  **/
  @JsonProperty("canal")
  public String getCanal() {
    if (canal == null) {
      return null;
    }
    return canal.value();
  }

  public void setCanal(CanalEnum canal) {
    this.canal = canal;
  }

  public DUE canal(CanalEnum canal) {
    this.canal = canal;
    return this;
  }

 /**
   * Chave de acesso&lt;br /&gt;Tamanho: 11&lt;br /&gt;Formato: &#39;NNAAANNNNNN&#39;
   * @return chaveDeAcesso
  **/
  @JsonProperty("chaveDeAcesso")
  public String getChaveDeAcesso() {
    return chaveDeAcesso;
  }

  public void setChaveDeAcesso(String chaveDeAcesso) {
    this.chaveDeAcesso = chaveDeAcesso;
  }

  public DUE chaveDeAcesso(String chaveDeAcesso) {
    this.chaveDeAcesso = chaveDeAcesso;
    return this;
  }

 /**
   * Get consorciada
   * @return consorciada
  **/
  @JsonProperty("consorciada")
  public Boolean isConsorciada() {
    return consorciada;
  }

  public void setConsorciada(Boolean consorciada) {
    this.consorciada = consorciada;
  }

  public DUE consorciada(Boolean consorciada) {
    this.consorciada = consorciada;
    return this;
  }

 /**
   * Get dat
   * @return dat
  **/
  @JsonProperty("dat")
  public Boolean isDat() {
    return dat;
  }

  public void setDat(Boolean dat) {
    this.dat = dat;
  }

  public DUE dat(Boolean dat) {
    this.dat = dat;
    return this;
  }

 /**
   * Data de criação&lt;br /&gt;Formato:&#39;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#39;
   * @return dataDeCriacao
  **/
  @JsonProperty("dataDeCriacao")
  public OffsetDateTime getDataDeCriacao() {
    return dataDeCriacao;
  }

  public void setDataDeCriacao(OffsetDateTime dataDeCriacao) {
    this.dataDeCriacao = dataDeCriacao;
  }

  public DUE dataDeCriacao(OffsetDateTime dataDeCriacao) {
    this.dataDeCriacao = dataDeCriacao;
    return this;
  }

 /**
   * Data de registro&lt;br /&gt;Formato:&#39;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#39;
   * @return dataDeRegistro
  **/
  @JsonProperty("dataDeRegistro")
  public OffsetDateTime getDataDeRegistro() {
    return dataDeRegistro;
  }

  public void setDataDeRegistro(OffsetDateTime dataDeRegistro) {
    this.dataDeRegistro = dataDeRegistro;
  }

  public DUE dataDeRegistro(OffsetDateTime dataDeRegistro) {
    this.dataDeRegistro = dataDeRegistro;
    return this;
  }

 /**
   * Data em que a carga foi completamente exportada&lt;br /&gt;Formato:&#39;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#39;
   * @return dataDoCCE
  **/
  @JsonProperty("dataDoCCE")
  public OffsetDateTime getDataDoCCE() {
    return dataDoCCE;
  }

  public void setDataDoCCE(OffsetDateTime dataDoCCE) {
    this.dataDoCCE = dataDoCCE;
  }

  public DUE dataDoCCE(OffsetDateTime dataDoCCE) {
    this.dataDoCCE = dataDoCCE;
    return this;
  }

 /**
   * Get declaracaoTributaria
   * @return declaracaoTributaria
  **/
  @JsonProperty("declaracaoTributaria")
  public DeclaracaoTributaria getDeclaracaoTributaria() {
    return declaracaoTributaria;
  }

  public void setDeclaracaoTributaria(DeclaracaoTributaria declaracaoTributaria) {
    this.declaracaoTributaria = declaracaoTributaria;
  }

  public DUE declaracaoTributaria(DeclaracaoTributaria declaracaoTributaria) {
    this.declaracaoTributaria = declaracaoTributaria;
    return this;
  }

 /**
   * Get declarante
   * @return declarante
  **/
  @JsonProperty("declarante")
  public PessoaDTO getDeclarante() {
    return declarante;
  }

  public void setDeclarante(PessoaDTO declarante) {
    this.declarante = declarante;
  }

  public DUE declarante(PessoaDTO declarante) {
    this.declarante = declarante;
    return this;
  }

 /**
   * Get despachoEmRecintoAlfandegado
   * @return despachoEmRecintoAlfandegado
  **/
  @JsonProperty("despachoEmRecintoAlfandegado")
  public Boolean isDespachoEmRecintoAlfandegado() {
    return despachoEmRecintoAlfandegado;
  }

  public void setDespachoEmRecintoAlfandegado(Boolean despachoEmRecintoAlfandegado) {
    this.despachoEmRecintoAlfandegado = despachoEmRecintoAlfandegado;
  }

  public DUE despachoEmRecintoAlfandegado(Boolean despachoEmRecintoAlfandegado) {
    this.despachoEmRecintoAlfandegado = despachoEmRecintoAlfandegado;
    return this;
  }

 /**
   * Get despachoEmRecintoDomiciliar
   * @return despachoEmRecintoDomiciliar
  **/
  @JsonProperty("despachoEmRecintoDomiciliar")
  public Boolean isDespachoEmRecintoDomiciliar() {
    return despachoEmRecintoDomiciliar;
  }

  public void setDespachoEmRecintoDomiciliar(Boolean despachoEmRecintoDomiciliar) {
    this.despachoEmRecintoDomiciliar = despachoEmRecintoDomiciliar;
  }

  public DUE despachoEmRecintoDomiciliar(Boolean despachoEmRecintoDomiciliar) {
    this.despachoEmRecintoDomiciliar = despachoEmRecintoDomiciliar;
    return this;
  }

 /**
   * Get embarqueEmRecintoAlfandegado
   * @return embarqueEmRecintoAlfandegado
  **/
  @JsonProperty("embarqueEmRecintoAlfandegado")
  public Boolean isEmbarqueEmRecintoAlfandegado() {
    return embarqueEmRecintoAlfandegado;
  }

  public void setEmbarqueEmRecintoAlfandegado(Boolean embarqueEmRecintoAlfandegado) {
    this.embarqueEmRecintoAlfandegado = embarqueEmRecintoAlfandegado;
  }

  public DUE embarqueEmRecintoAlfandegado(Boolean embarqueEmRecintoAlfandegado) {
    this.embarqueEmRecintoAlfandegado = embarqueEmRecintoAlfandegado;
    return this;
  }

 /**
   * Endereço do estabelecimento do local de despacho&lt;br /&gt;Tamanho mínimo: 0&lt;br /&gt;Tamanho máximo: 240
   * @return enderecoDoEstabelecimentoDoLocalDeDespacho
  **/
  @JsonProperty("enderecoDoEstabelecimentoDoLocalDeDespacho")
  public String getEnderecoDoEstabelecimentoDoLocalDeDespacho() {
    return enderecoDoEstabelecimentoDoLocalDeDespacho;
  }

  public void setEnderecoDoEstabelecimentoDoLocalDeDespacho(String enderecoDoEstabelecimentoDoLocalDeDespacho) {
    this.enderecoDoEstabelecimentoDoLocalDeDespacho = enderecoDoEstabelecimentoDoLocalDeDespacho;
  }

  public DUE enderecoDoEstabelecimentoDoLocalDeDespacho(String enderecoDoEstabelecimentoDoLocalDeDespacho) {
    this.enderecoDoEstabelecimentoDoLocalDeDespacho = enderecoDoEstabelecimentoDoLocalDeDespacho;
    return this;
  }

 /**
   * Endereço do estabelecimento do local de embarque&lt;br /&gt;Tamanho mínimo: 0&lt;br /&gt;Tamanho máximo: 240
   * @return enderecoDoEstabelecimentoDoLocalDeEmbarque
  **/
  @JsonProperty("enderecoDoEstabelecimentoDoLocalDeEmbarque")
  public String getEnderecoDoEstabelecimentoDoLocalDeEmbarque() {
    return enderecoDoEstabelecimentoDoLocalDeEmbarque;
  }

  public void setEnderecoDoEstabelecimentoDoLocalDeEmbarque(String enderecoDoEstabelecimentoDoLocalDeEmbarque) {
    this.enderecoDoEstabelecimentoDoLocalDeEmbarque = enderecoDoEstabelecimentoDoLocalDeEmbarque;
  }

  public DUE enderecoDoEstabelecimentoDoLocalDeEmbarque(String enderecoDoEstabelecimentoDoLocalDeEmbarque) {
    this.enderecoDoEstabelecimentoDoLocalDeEmbarque = enderecoDoEstabelecimentoDoLocalDeEmbarque;
    return this;
  }

 /**
   * Get estabelecimentoDoLocalDeDespacho
   * @return estabelecimentoDoLocalDeDespacho
  **/
  @JsonProperty("estabelecimentoDoLocalDeDespacho")
  public CNPJ getEstabelecimentoDoLocalDeDespacho() {
    return estabelecimentoDoLocalDeDespacho;
  }

  public void setEstabelecimentoDoLocalDeDespacho(CNPJ estabelecimentoDoLocalDeDespacho) {
    this.estabelecimentoDoLocalDeDespacho = estabelecimentoDoLocalDeDespacho;
  }

  public DUE estabelecimentoDoLocalDeDespacho(CNPJ estabelecimentoDoLocalDeDespacho) {
    this.estabelecimentoDoLocalDeDespacho = estabelecimentoDoLocalDeDespacho;
    return this;
  }

 /**
   * Get eventosDoHistorico
   * @return eventosDoHistorico
  **/
  @JsonProperty("eventosDoHistorico")
  public List<EventoDoHistoricoDTO> getEventosDoHistorico() {
    return eventosDoHistorico;
  }

  public void setEventosDoHistorico(List<EventoDoHistoricoDTO> eventosDoHistorico) {
    this.eventosDoHistorico = eventosDoHistorico;
  }

  public DUE eventosDoHistorico(List<EventoDoHistoricoDTO> eventosDoHistorico) {
    this.eventosDoHistorico = eventosDoHistorico;
    return this;
  }

  public DUE addEventosDoHistoricoItem(EventoDoHistoricoDTO eventosDoHistoricoItem) {
    this.eventosDoHistorico.add(eventosDoHistoricoItem);
    return this;
  }

 /**
   * Get exigenciaAtiva
   * @return exigenciaAtiva
  **/
  @JsonProperty("exigenciaAtiva")
  public Boolean isExigenciaAtiva() {
    return exigenciaAtiva;
  }

  public void setExigenciaAtiva(Boolean exigenciaAtiva) {
    this.exigenciaAtiva = exigenciaAtiva;
  }

  public DUE exigenciaAtiva(Boolean exigenciaAtiva) {
    this.exigenciaAtiva = exigenciaAtiva;
    return this;
  }

 /**
   * *Campo descontinuado, utilize o atributo exigenciasFiscaisEstruturadas 
   * @return exigenciasFiscais
  **/
  @JsonProperty("exigenciasFiscais")
  public List<ExigenciaFiscalDTO> getExigenciasFiscais() {
    return exigenciasFiscais;
  }

  public void setExigenciasFiscais(List<ExigenciaFiscalDTO> exigenciasFiscais) {
    this.exigenciasFiscais = exigenciasFiscais;
  }

  public DUE exigenciasFiscais(List<ExigenciaFiscalDTO> exigenciasFiscais) {
    this.exigenciasFiscais = exigenciasFiscais;
    return this;
  }

  public DUE addExigenciasFiscaisItem(ExigenciaFiscalDTO exigenciasFiscaisItem) {
    this.exigenciasFiscais.add(exigenciasFiscaisItem);
    return this;
  }

 /**
   * Get exigenciasFiscaisEstruturadas
   * @return exigenciasFiscaisEstruturadas
  **/
  @JsonProperty("exigenciasFiscaisEstruturadas")
  public Link getExigenciasFiscaisEstruturadas() {
    return exigenciasFiscaisEstruturadas;
  }

  public void setExigenciasFiscaisEstruturadas(Link exigenciasFiscaisEstruturadas) {
    this.exigenciasFiscaisEstruturadas = exigenciasFiscaisEstruturadas;
  }

  public DUE exigenciasFiscaisEstruturadas(Link exigenciasFiscaisEstruturadas) {
    this.exigenciasFiscaisEstruturadas = exigenciasFiscaisEstruturadas;
    return this;
  }

 /**
   * Get formaDeExportacao
   * @return formaDeExportacao
  **/
  @JsonProperty("formaDeExportacao")
  public String getFormaDeExportacao() {
    if (formaDeExportacao == null) {
      return null;
    }
    return formaDeExportacao.value();
  }

  public void setFormaDeExportacao(FormaDeExportacaoEnum formaDeExportacao) {
    this.formaDeExportacao = formaDeExportacao;
  }

  public DUE formaDeExportacao(FormaDeExportacaoEnum formaDeExportacao) {
    this.formaDeExportacao = formaDeExportacao;
    return this;
  }

 /**
   * Get impedidoDeEmbarque
   * @return impedidoDeEmbarque
  **/
  @JsonProperty("impedidoDeEmbarque")
  public Boolean isImpedidoDeEmbarque() {
    return impedidoDeEmbarque;
  }

  public void setImpedidoDeEmbarque(Boolean impedidoDeEmbarque) {
    this.impedidoDeEmbarque = impedidoDeEmbarque;
  }

  public DUE impedidoDeEmbarque(Boolean impedidoDeEmbarque) {
    this.impedidoDeEmbarque = impedidoDeEmbarque;
    return this;
  }

 /**
   * Get inclusaoNotaFiscal
   * @return inclusaoNotaFiscal
  **/
  @JsonProperty("inclusaoNotaFiscal")
  public Boolean isInclusaoNotaFiscal() {
    return inclusaoNotaFiscal;
  }

  public void setInclusaoNotaFiscal(Boolean inclusaoNotaFiscal) {
    this.inclusaoNotaFiscal = inclusaoNotaFiscal;
  }

  public DUE inclusaoNotaFiscal(Boolean inclusaoNotaFiscal) {
    this.inclusaoNotaFiscal = inclusaoNotaFiscal;
    return this;
  }

 /**
   * Informações complementares&lt;br /&gt;Tamanho mínimo: 0&lt;br /&gt;Tamanho máximo: 2000
   * @return informacoesComplementares
  **/
  @JsonProperty("informacoesComplementares")
  public String getInformacoesComplementares() {
    return informacoesComplementares;
  }

  public void setInformacoesComplementares(String informacoesComplementares) {
    this.informacoesComplementares = informacoesComplementares;
  }

  public DUE informacoesComplementares(String informacoesComplementares) {
    this.informacoesComplementares = informacoesComplementares;
    return this;
  }

 /**
   * Get itens
   * @return itens
  **/
  @JsonProperty("itens")
  public List<ItemDUERemoteDTO> getItens() {
    return itens;
  }

  public void setItens(List<ItemDUERemoteDTO> itens) {
    this.itens = itens;
  }

  public DUE itens(List<ItemDUERemoteDTO> itens) {
    this.itens = itens;
    return this;
  }

  public DUE addItensItem(ItemDUERemoteDTO itensItem) {
    this.itens.add(itensItem);
    return this;
  }

 /**
   * Justificativa de dispensa da Nota Fiscal&lt;br /&gt;Tamanho mínimo: 0&lt;br /&gt;Tamanho máximo: 1000
   * @return justificativaDeDispensaDaNotaFiscal
  **/
  @JsonProperty("justificativaDeDispensaDaNotaFiscal")
  public String getJustificativaDeDispensaDaNotaFiscal() {
    return justificativaDeDispensaDaNotaFiscal;
  }

  public void setJustificativaDeDispensaDaNotaFiscal(String justificativaDeDispensaDaNotaFiscal) {
    this.justificativaDeDispensaDaNotaFiscal = justificativaDeDispensaDaNotaFiscal;
  }

  public DUE justificativaDeDispensaDaNotaFiscal(String justificativaDeDispensaDaNotaFiscal) {
    this.justificativaDeDispensaDaNotaFiscal = justificativaDeDispensaDaNotaFiscal;
    return this;
  }

 /**
   * Latitude do Local de Despacho&lt;br /&gt;Regex: \&quot;^((-)?90(\\\\.[0]{6}))|((-)?([0-9]|[1-8][0-9])(\\\\.[0-9]{6}))$\&quot;
   * @return latitudeDoLocalDeDespacho
  **/
  @JsonProperty("latitudeDoLocalDeDespacho")
  public String getLatitudeDoLocalDeDespacho() {
    return latitudeDoLocalDeDespacho;
  }

  public void setLatitudeDoLocalDeDespacho(String latitudeDoLocalDeDespacho) {
    this.latitudeDoLocalDeDespacho = latitudeDoLocalDeDespacho;
  }

  public DUE latitudeDoLocalDeDespacho(String latitudeDoLocalDeDespacho) {
    this.latitudeDoLocalDeDespacho = latitudeDoLocalDeDespacho;
    return this;
  }

 /**
   * Latitude do Local de embarque&lt;br /&gt;Regex: \&quot;^((-)?90(\\\\.[0]{6}))|((-)?([0-9]|[1-8][0-9])(\\\\.[0-9]{6}))$\&quot;
   * @return latitudeDoLocalDeEmbarque
  **/
  @JsonProperty("latitudeDoLocalDeEmbarque")
  public String getLatitudeDoLocalDeEmbarque() {
    return latitudeDoLocalDeEmbarque;
  }

  public void setLatitudeDoLocalDeEmbarque(String latitudeDoLocalDeEmbarque) {
    this.latitudeDoLocalDeEmbarque = latitudeDoLocalDeEmbarque;
  }

  public DUE latitudeDoLocalDeEmbarque(String latitudeDoLocalDeEmbarque) {
    this.latitudeDoLocalDeEmbarque = latitudeDoLocalDeEmbarque;
    return this;
  }

 /**
   * Longitude do Local de Despacho&lt;br /&gt;Regex: \&quot;^((-)?90(\\\\.[0]{6}))|((-)?([0-9]|[1-8][0-9])(\\\\.[0-9]{6}))$\&quot;
   * @return longitudeDoLocalDeDespacho
  **/
  @JsonProperty("longitudeDoLocalDeDespacho")
  public String getLongitudeDoLocalDeDespacho() {
    return longitudeDoLocalDeDespacho;
  }

  public void setLongitudeDoLocalDeDespacho(String longitudeDoLocalDeDespacho) {
    this.longitudeDoLocalDeDespacho = longitudeDoLocalDeDespacho;
  }

  public DUE longitudeDoLocalDeDespacho(String longitudeDoLocalDeDespacho) {
    this.longitudeDoLocalDeDespacho = longitudeDoLocalDeDespacho;
    return this;
  }

 /**
   * Longitude do Local de Despacho&lt;br /&gt;Regex: \&quot;^((-)?90(\\\\.[0]{6}))|((-)?([0-9]|[1-8][0-9])(\\\\.[0-9]{6}))$\&quot;
   * @return longitudeDoLocalDeEmbarque
  **/
  @JsonProperty("longitudeDoLocalDeEmbarque")
  public String getLongitudeDoLocalDeEmbarque() {
    return longitudeDoLocalDeEmbarque;
  }

  public void setLongitudeDoLocalDeEmbarque(String longitudeDoLocalDeEmbarque) {
    this.longitudeDoLocalDeEmbarque = longitudeDoLocalDeEmbarque;
  }

  public DUE longitudeDoLocalDeEmbarque(String longitudeDoLocalDeEmbarque) {
    this.longitudeDoLocalDeEmbarque = longitudeDoLocalDeEmbarque;
    return this;
  }

 /**
   * Get moeda
   * @return moeda
  **/
  @JsonProperty("moeda")
  public MoedaDto getMoeda() {
    return moeda;
  }

  public void setMoeda(MoedaDto moeda) {
    this.moeda = moeda;
  }

  public DUE moeda(MoedaDto moeda) {
    this.moeda = moeda;
    return this;
  }

 /**
   * Get motivoDeDispensaDaNotaFiscal
   * @return motivoDeDispensaDaNotaFiscal
  **/
  @JsonProperty("motivoDeDispensaDaNotaFiscal")
  public MotivoDispensaNotaFiscalDTO getMotivoDeDispensaDaNotaFiscal() {
    return motivoDeDispensaDaNotaFiscal;
  }

  public void setMotivoDeDispensaDaNotaFiscal(MotivoDispensaNotaFiscalDTO motivoDeDispensaDaNotaFiscal) {
    this.motivoDeDispensaDaNotaFiscal = motivoDeDispensaDaNotaFiscal;
  }

  public DUE motivoDeDispensaDaNotaFiscal(MotivoDispensaNotaFiscalDTO motivoDeDispensaDaNotaFiscal) {
    this.motivoDeDispensaDaNotaFiscal = motivoDeDispensaDaNotaFiscal;
    return this;
  }

 /**
   * Número da DUE&lt;br /&gt;Tamanho: 14&lt;br /&gt;Formato: &#39;NNAANNNNNNNNNN&#39;
   * @return numero
  **/
  @JsonProperty("numero")
  public String getNumero() {
    return numero;
  }

  public void setNumero(String numero) {
    this.numero = numero;
  }

  public DUE numero(String numero) {
    this.numero = numero;
    return this;
  }

 /**
   * Get oea
   * @return oea
  **/
  @JsonProperty("oea")
  public Boolean isOea() {
    return oea;
  }

  public void setOea(Boolean oea) {
    this.oea = oea;
  }

  public DUE oea(Boolean oea) {
    this.oea = oea;
    return this;
  }

 /**
   * Get paisImportador
   * @return paisImportador
  **/
  @JsonProperty("paisImportador")
  public PaisDto getPaisImportador() {
    return paisImportador;
  }

  public void setPaisImportador(PaisDto paisImportador) {
    this.paisImportador = paisImportador;
  }

  public DUE paisImportador(PaisDto paisImportador) {
    this.paisImportador = paisImportador;
    return this;
  }

 /**
   * Get recintoAduaneiroDeDespacho
   * @return recintoAduaneiroDeDespacho
  **/
  @JsonProperty("recintoAduaneiroDeDespacho")
  public RecintoAduaneiroDto getRecintoAduaneiroDeDespacho() {
    return recintoAduaneiroDeDespacho;
  }

  public void setRecintoAduaneiroDeDespacho(RecintoAduaneiroDto recintoAduaneiroDeDespacho) {
    this.recintoAduaneiroDeDespacho = recintoAduaneiroDeDespacho;
  }

  public DUE recintoAduaneiroDeDespacho(RecintoAduaneiroDto recintoAduaneiroDeDespacho) {
    this.recintoAduaneiroDeDespacho = recintoAduaneiroDeDespacho;
    return this;
  }

 /**
   * Get recintoAduaneiroDeEmbarque
   * @return recintoAduaneiroDeEmbarque
  **/
  @JsonProperty("recintoAduaneiroDeEmbarque")
  public RecintoAduaneiroDto getRecintoAduaneiroDeEmbarque() {
    return recintoAduaneiroDeEmbarque;
  }

  public void setRecintoAduaneiroDeEmbarque(RecintoAduaneiroDto recintoAduaneiroDeEmbarque) {
    this.recintoAduaneiroDeEmbarque = recintoAduaneiroDeEmbarque;
  }

  public DUE recintoAduaneiroDeEmbarque(RecintoAduaneiroDto recintoAduaneiroDeEmbarque) {
    this.recintoAduaneiroDeEmbarque = recintoAduaneiroDeEmbarque;
    return this;
  }

 /**
   * Referência do endereço do local de despacho&lt;br /&gt;Tamanho mínimo: 0&lt;br /&gt;Tamanho máximo: 240
   * @return referenciaDoEnderecoDoLocalDeDespacho
  **/
  @JsonProperty("referenciaDoEnderecoDoLocalDeDespacho")
  public String getReferenciaDoEnderecoDoLocalDeDespacho() {
    return referenciaDoEnderecoDoLocalDeDespacho;
  }

  public void setReferenciaDoEnderecoDoLocalDeDespacho(String referenciaDoEnderecoDoLocalDeDespacho) {
    this.referenciaDoEnderecoDoLocalDeDespacho = referenciaDoEnderecoDoLocalDeDespacho;
  }

  public DUE referenciaDoEnderecoDoLocalDeDespacho(String referenciaDoEnderecoDoLocalDeDespacho) {
    this.referenciaDoEnderecoDoLocalDeDespacho = referenciaDoEnderecoDoLocalDeDespacho;
    return this;
  }

 /**
   * Referência do endereço do local de embarque&lt;br /&gt;Tamanho mínimo: 0&lt;br /&gt;Tamanho máximo: 240
   * @return referenciaDoEnderecoDoLocalDeEmbarque
  **/
  @JsonProperty("referenciaDoEnderecoDoLocalDeEmbarque")
  public String getReferenciaDoEnderecoDoLocalDeEmbarque() {
    return referenciaDoEnderecoDoLocalDeEmbarque;
  }

  public void setReferenciaDoEnderecoDoLocalDeEmbarque(String referenciaDoEnderecoDoLocalDeEmbarque) {
    this.referenciaDoEnderecoDoLocalDeEmbarque = referenciaDoEnderecoDoLocalDeEmbarque;
  }

  public DUE referenciaDoEnderecoDoLocalDeEmbarque(String referenciaDoEnderecoDoLocalDeEmbarque) {
    this.referenciaDoEnderecoDoLocalDeEmbarque = referenciaDoEnderecoDoLocalDeEmbarque;
    return this;
  }

 /**
   * Get responsavelPeloACD
   * @return responsavelPeloACD
  **/
  @JsonProperty("responsavelPeloACD")
  public String getResponsavelPeloACD() {
    if (responsavelPeloACD == null) {
      return null;
    }
    return responsavelPeloACD.value();
  }

  public void setResponsavelPeloACD(ResponsavelPeloACDEnum responsavelPeloACD) {
    this.responsavelPeloACD = responsavelPeloACD;
  }

  public DUE responsavelPeloACD(ResponsavelPeloACDEnum responsavelPeloACD) {
    this.responsavelPeloACD = responsavelPeloACD;
    return this;
  }

 /**
   * RUC - Número da referência única de carga&lt;br /&gt;Tamanho: 35&lt;br /&gt;Formato: &#39;NAANNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN&#39;
   * @return ruc
  **/
  @JsonProperty("ruc")
  public String getRuc() {
    return ruc;
  }

  public void setRuc(String ruc) {
    this.ruc = ruc;
  }

  public DUE ruc(String ruc) {
    this.ruc = ruc;
    return this;
  }

 /**
   * Get situacao
   * @return situacao
  **/
  @JsonProperty("situacao")
  public String getSituacao() {
    if (situacao == null) {
      return null;
    }
    return situacao.value();
  }

  public void setSituacao(SituacaoEnum situacao) {
    this.situacao = situacao;
  }

  public DUE situacao(SituacaoEnum situacao) {
    this.situacao = situacao;
    return this;
  }

 /**
   * Get situacaoDoTratamentoAdministrativo
   * @return situacaoDoTratamentoAdministrativo
  **/
  @JsonProperty("situacaoDoTratamentoAdministrativo")
  public String getSituacaoDoTratamentoAdministrativo() {
    if (situacaoDoTratamentoAdministrativo == null) {
      return null;
    }
    return situacaoDoTratamentoAdministrativo.value();
  }

  public void setSituacaoDoTratamentoAdministrativo(SituacaoDoTratamentoAdministrativoEnum situacaoDoTratamentoAdministrativo) {
    this.situacaoDoTratamentoAdministrativo = situacaoDoTratamentoAdministrativo;
  }

  public DUE situacaoDoTratamentoAdministrativo(SituacaoDoTratamentoAdministrativoEnum situacaoDoTratamentoAdministrativo) {
    this.situacaoDoTratamentoAdministrativo = situacaoDoTratamentoAdministrativo;
    return this;
  }

 /**
   * Get situacaoEspecial
   * @return situacaoEspecial
  **/
  @JsonProperty("situacaoEspecial")
  public String getSituacaoEspecial() {
    if (situacaoEspecial == null) {
      return null;
    }
    return situacaoEspecial.value();
  }

  public void setSituacaoEspecial(SituacaoEspecialEnum situacaoEspecial) {
    this.situacaoEspecial = situacaoEspecial;
  }

  public DUE situacaoEspecial(SituacaoEspecialEnum situacaoEspecial) {
    this.situacaoEspecial = situacaoEspecial;
    return this;
  }

 /**
   * Get situacoesDaCarga
   * @return situacoesDaCarga
  **/
  @JsonProperty("situacoesDaCarga")
  public List<SituacaoDaCargaDTO> getSituacoesDaCarga() {
    return situacoesDaCarga;
  }

  public void setSituacoesDaCarga(List<SituacaoDaCargaDTO> situacoesDaCarga) {
    this.situacoesDaCarga = situacoesDaCarga;
  }

  public DUE situacoesDaCarga(List<SituacaoDaCargaDTO> situacoesDaCarga) {
    this.situacoesDaCarga = situacoesDaCarga;
    return this;
  }

  public DUE addSituacoesDaCargaItem(SituacaoDaCargaDTO situacoesDaCargaItem) {
    this.situacoesDaCarga.add(situacoesDaCargaItem);
    return this;
  }

 /**
   * Get solicitacoes
   * @return solicitacoes
  **/
  @JsonProperty("solicitacoes")
  public List<SolicitacaoDTO> getSolicitacoes() {
    return solicitacoes;
  }

  public void setSolicitacoes(List<SolicitacaoDTO> solicitacoes) {
    this.solicitacoes = solicitacoes;
  }

  public DUE solicitacoes(List<SolicitacaoDTO> solicitacoes) {
    this.solicitacoes = solicitacoes;
    return this;
  }

  public DUE addSolicitacoesItem(SolicitacaoDTO solicitacoesItem) {
    this.solicitacoes.add(solicitacoesItem);
    return this;
  }

 /**
   * Get tipo
   * @return tipo
  **/
  @JsonProperty("tipo")
  public String getTipo() {
    if (tipo == null) {
      return null;
    }
    return tipo.value();
  }

  public void setTipo(TipoEnum tipo) {
    this.tipo = tipo;
  }

  public DUE tipo(TipoEnum tipo) {
    this.tipo = tipo;
    return this;
  }

 /**
   * Get tratamentoPrioritario
   * @return tratamentoPrioritario
  **/
  @JsonProperty("tratamentoPrioritario")
  public Boolean isTratamentoPrioritario() {
    return tratamentoPrioritario;
  }

  public void setTratamentoPrioritario(Boolean tratamentoPrioritario) {
    this.tratamentoPrioritario = tratamentoPrioritario;
  }

  public DUE tratamentoPrioritario(Boolean tratamentoPrioritario) {
    this.tratamentoPrioritario = tratamentoPrioritario;
    return this;
  }

 /**
   * Get unidadeLocalDeAnaliseFiscal
   * @return unidadeLocalDeAnaliseFiscal
  **/
  @JsonProperty("unidadeLocalDeAnaliseFiscal")
  public UnidadeLocalRFBDto getUnidadeLocalDeAnaliseFiscal() {
    return unidadeLocalDeAnaliseFiscal;
  }

  public void setUnidadeLocalDeAnaliseFiscal(UnidadeLocalRFBDto unidadeLocalDeAnaliseFiscal) {
    this.unidadeLocalDeAnaliseFiscal = unidadeLocalDeAnaliseFiscal;
  }

  public DUE unidadeLocalDeAnaliseFiscal(UnidadeLocalRFBDto unidadeLocalDeAnaliseFiscal) {
    this.unidadeLocalDeAnaliseFiscal = unidadeLocalDeAnaliseFiscal;
    return this;
  }

 /**
   * Get unidadeLocalDeDespacho
   * @return unidadeLocalDeDespacho
  **/
  @JsonProperty("unidadeLocalDeDespacho")
  public UnidadeLocalRFBDto getUnidadeLocalDeDespacho() {
    return unidadeLocalDeDespacho;
  }

  public void setUnidadeLocalDeDespacho(UnidadeLocalRFBDto unidadeLocalDeDespacho) {
    this.unidadeLocalDeDespacho = unidadeLocalDeDespacho;
  }

  public DUE unidadeLocalDeDespacho(UnidadeLocalRFBDto unidadeLocalDeDespacho) {
    this.unidadeLocalDeDespacho = unidadeLocalDeDespacho;
    return this;
  }

 /**
   * Get unidadeLocalDeEmbarque
   * @return unidadeLocalDeEmbarque
  **/
  @JsonProperty("unidadeLocalDeEmbarque")
  public UnidadeLocalRFBDto getUnidadeLocalDeEmbarque() {
    return unidadeLocalDeEmbarque;
  }

  public void setUnidadeLocalDeEmbarque(UnidadeLocalRFBDto unidadeLocalDeEmbarque) {
    this.unidadeLocalDeEmbarque = unidadeLocalDeEmbarque;
  }

  public DUE unidadeLocalDeEmbarque(UnidadeLocalRFBDto unidadeLocalDeEmbarque) {
    this.unidadeLocalDeEmbarque = unidadeLocalDeEmbarque;
    return this;
  }

 /**
   * Valor total da mercadoria&lt;br /&gt;Tamanho: 15,2&lt;br /&gt;Formato: Decimal, com até 2 casas decimais separadas por ponto.
   * @return valorTotalMercadoria
  **/
  @JsonProperty("valorTotalMercadoria")
  public BigDecimal getValorTotalMercadoria() {
    return valorTotalMercadoria;
  }

  public void setValorTotalMercadoria(BigDecimal valorTotalMercadoria) {
    this.valorTotalMercadoria = valorTotalMercadoria;
  }

  public DUE valorTotalMercadoria(BigDecimal valorTotalMercadoria) {
    this.valorTotalMercadoria = valorTotalMercadoria;
    return this;
  }

 /**
   * Get viaDeTransporteEspecial
   * @return viaDeTransporteEspecial
  **/
  @JsonProperty("viaDeTransporteEspecial")
  public ViaTransporteEspecialDTO getViaDeTransporteEspecial() {
    return viaDeTransporteEspecial;
  }

  public void setViaDeTransporteEspecial(ViaTransporteEspecialDTO viaDeTransporteEspecial) {
    this.viaDeTransporteEspecial = viaDeTransporteEspecial;
  }

  public DUE viaDeTransporteEspecial(ViaTransporteEspecialDTO viaDeTransporteEspecial) {
    this.viaDeTransporteEspecial = viaDeTransporteEspecial;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DUE {\n");
    
    sb.append("    atosConcessoriosIsencao: ").append(toIndentedString(atosConcessoriosIsencao)).append("\n");
    sb.append("    bloqueio: ").append(toIndentedString(bloqueio)).append("\n");
    sb.append("    canal: ").append(toIndentedString(canal)).append("\n");
    sb.append("    chaveDeAcesso: ").append(toIndentedString(chaveDeAcesso)).append("\n");
    sb.append("    consorciada: ").append(toIndentedString(consorciada)).append("\n");
    sb.append("    dat: ").append(toIndentedString(dat)).append("\n");
    sb.append("    dataDeCriacao: ").append(toIndentedString(dataDeCriacao)).append("\n");
    sb.append("    dataDeRegistro: ").append(toIndentedString(dataDeRegistro)).append("\n");
    sb.append("    dataDoCCE: ").append(toIndentedString(dataDoCCE)).append("\n");
    sb.append("    declaracaoTributaria: ").append(toIndentedString(declaracaoTributaria)).append("\n");
    sb.append("    declarante: ").append(toIndentedString(declarante)).append("\n");
    sb.append("    despachoEmRecintoAlfandegado: ").append(toIndentedString(despachoEmRecintoAlfandegado)).append("\n");
    sb.append("    despachoEmRecintoDomiciliar: ").append(toIndentedString(despachoEmRecintoDomiciliar)).append("\n");
    sb.append("    embarqueEmRecintoAlfandegado: ").append(toIndentedString(embarqueEmRecintoAlfandegado)).append("\n");
    sb.append("    enderecoDoEstabelecimentoDoLocalDeDespacho: ").append(toIndentedString(enderecoDoEstabelecimentoDoLocalDeDespacho)).append("\n");
    sb.append("    enderecoDoEstabelecimentoDoLocalDeEmbarque: ").append(toIndentedString(enderecoDoEstabelecimentoDoLocalDeEmbarque)).append("\n");
    sb.append("    estabelecimentoDoLocalDeDespacho: ").append(toIndentedString(estabelecimentoDoLocalDeDespacho)).append("\n");
    sb.append("    eventosDoHistorico: ").append(toIndentedString(eventosDoHistorico)).append("\n");
    sb.append("    exigenciaAtiva: ").append(toIndentedString(exigenciaAtiva)).append("\n");
    sb.append("    exigenciasFiscais: ").append(toIndentedString(exigenciasFiscais)).append("\n");
    sb.append("    exigenciasFiscaisEstruturadas: ").append(toIndentedString(exigenciasFiscaisEstruturadas)).append("\n");
    sb.append("    formaDeExportacao: ").append(toIndentedString(formaDeExportacao)).append("\n");
    sb.append("    impedidoDeEmbarque: ").append(toIndentedString(impedidoDeEmbarque)).append("\n");
    sb.append("    inclusaoNotaFiscal: ").append(toIndentedString(inclusaoNotaFiscal)).append("\n");
    sb.append("    informacoesComplementares: ").append(toIndentedString(informacoesComplementares)).append("\n");
    sb.append("    itens: ").append(toIndentedString(itens)).append("\n");
    sb.append("    justificativaDeDispensaDaNotaFiscal: ").append(toIndentedString(justificativaDeDispensaDaNotaFiscal)).append("\n");
    sb.append("    latitudeDoLocalDeDespacho: ").append(toIndentedString(latitudeDoLocalDeDespacho)).append("\n");
    sb.append("    latitudeDoLocalDeEmbarque: ").append(toIndentedString(latitudeDoLocalDeEmbarque)).append("\n");
    sb.append("    longitudeDoLocalDeDespacho: ").append(toIndentedString(longitudeDoLocalDeDespacho)).append("\n");
    sb.append("    longitudeDoLocalDeEmbarque: ").append(toIndentedString(longitudeDoLocalDeEmbarque)).append("\n");
    sb.append("    moeda: ").append(toIndentedString(moeda)).append("\n");
    sb.append("    motivoDeDispensaDaNotaFiscal: ").append(toIndentedString(motivoDeDispensaDaNotaFiscal)).append("\n");
    sb.append("    numero: ").append(toIndentedString(numero)).append("\n");
    sb.append("    oea: ").append(toIndentedString(oea)).append("\n");
    sb.append("    paisImportador: ").append(toIndentedString(paisImportador)).append("\n");
    sb.append("    recintoAduaneiroDeDespacho: ").append(toIndentedString(recintoAduaneiroDeDespacho)).append("\n");
    sb.append("    recintoAduaneiroDeEmbarque: ").append(toIndentedString(recintoAduaneiroDeEmbarque)).append("\n");
    sb.append("    referenciaDoEnderecoDoLocalDeDespacho: ").append(toIndentedString(referenciaDoEnderecoDoLocalDeDespacho)).append("\n");
    sb.append("    referenciaDoEnderecoDoLocalDeEmbarque: ").append(toIndentedString(referenciaDoEnderecoDoLocalDeEmbarque)).append("\n");
    sb.append("    responsavelPeloACD: ").append(toIndentedString(responsavelPeloACD)).append("\n");
    sb.append("    ruc: ").append(toIndentedString(ruc)).append("\n");
    sb.append("    situacao: ").append(toIndentedString(situacao)).append("\n");
    sb.append("    situacaoDoTratamentoAdministrativo: ").append(toIndentedString(situacaoDoTratamentoAdministrativo)).append("\n");
    sb.append("    situacaoEspecial: ").append(toIndentedString(situacaoEspecial)).append("\n");
    sb.append("    situacoesDaCarga: ").append(toIndentedString(situacoesDaCarga)).append("\n");
    sb.append("    solicitacoes: ").append(toIndentedString(solicitacoes)).append("\n");
    sb.append("    tipo: ").append(toIndentedString(tipo)).append("\n");
    sb.append("    tratamentoPrioritario: ").append(toIndentedString(tratamentoPrioritario)).append("\n");
    sb.append("    unidadeLocalDeAnaliseFiscal: ").append(toIndentedString(unidadeLocalDeAnaliseFiscal)).append("\n");
    sb.append("    unidadeLocalDeDespacho: ").append(toIndentedString(unidadeLocalDeDespacho)).append("\n");
    sb.append("    unidadeLocalDeEmbarque: ").append(toIndentedString(unidadeLocalDeEmbarque)).append("\n");
    sb.append("    valorTotalMercadoria: ").append(toIndentedString(valorTotalMercadoria)).append("\n");
    sb.append("    viaDeTransporteEspecial: ").append(toIndentedString(viaDeTransporteEspecial)).append("\n");
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

