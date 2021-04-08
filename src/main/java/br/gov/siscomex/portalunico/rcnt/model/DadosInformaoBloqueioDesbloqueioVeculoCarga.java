package br.gov.siscomex.portalunico.rcnt.model;

import java.util.List;

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

import io.swagger.annotations.ApiModelProperty;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "DadosInformaoBloqueioDesbloqueioVeculoCarga", propOrder =
    { "tipoOperacao", "idEvento", "dataHoraOcorrencia", "dataHoraRegistro", "cpfOperadorOcorrencia", "cpfOperadorRegistro", "protocoloEventoRetificadoOuExcluido", "contingencia", "codigoRecinto", "status", "numeroManifesto", "tipoManifesto", "numeroConhecimentoMAWB", "numeroConhecimento", "tipoConhecimento", "numeroDeclaracao", "tipoDeclaracao", "placa", "numeroConteiner", "identificacaoUld", "listaLotes", "solicitante", "setorSolicitante", "motivo"
})

@XmlRootElement(name="DadosInformaoBloqueioDesbloqueioVeculoCarga")
public class DadosInformaoBloqueioDesbloqueioVeculoCarga  {
  

@XmlType(name="TipoOperacaoEnum")
@XmlEnum(String.class)
public enum TipoOperacaoEnum {

	@XmlEnumValue("'I'")
	@JsonProperty("'I'")
	I_(String.valueOf("'I'")),
	
	@XmlEnumValue("'R'")
	@JsonProperty("'R'")
	R_(String.valueOf("'R'")),
	
	@XmlEnumValue("'E'")
	@JsonProperty("'E'")
	E_(String.valueOf("'E'"));


    private String value;

    TipoOperacaoEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TipoOperacaoEnum fromValue(String v) {
        for (TipoOperacaoEnum b : TipoOperacaoEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to TipoOperacaoEnum");
    }
}

  @XmlElement(name="tipoOperacao", required = true)
  @ApiModelProperty(example = "I", required = true, value = "Indica se o evento transmitido é novo (incluir) ou retifica/exclui evento anterior.<br/>Domínio:<br/>I - Incluir<br/>R - Retificar<br/>E - Excluir")
 /**
   * Indica se o evento transmitido é novo (incluir) ou retifica/exclui evento anterior.<br/>Domínio:<br/>I - Incluir<br/>R - Retificar<br/>E - Excluir
  **/
  private TipoOperacaoEnum tipoOperacao = null;

  @XmlElement(name="idEvento", required = true)
  @ApiModelProperty(required = true, value = "Identificador único do evento que pode ser utilizado para recuperar as informações do Evento no sistema de origem do Recinto remetente. Ex.: Chave tabela 1 + ... + chave tabela n - tantas chaves quantas forem as tabelas necessárias para montar o registro do evento.<br/>Tamanho: 100")
 /**
   * Identificador único do evento que pode ser utilizado para recuperar as informações do Evento no sistema de origem do Recinto remetente. Ex.: Chave tabela 1 + ... + chave tabela n - tantas chaves quantas forem as tabelas necessárias para montar o registro do evento.<br/>Tamanho: 100
  **/
  private String idEvento = null;

  @XmlElement(name="dataHoraOcorrencia", required = true)
  @ApiModelProperty(example = "2020-04-01T10:50:30.150-0300", required = true, value = "Data e hora em que o evento ocorreu ou que se coletou, em formulário papel durante uma contingência, os dados do evento. Deve-se enviar, junto da data, o fuso horário no qual tal data e hora foi gerada.<br/>Formato: 'yyyy-MM-ddTHH:mm:ss.SSSZ'")
 /**
   * Data e hora em que o evento ocorreu ou que se coletou, em formulário papel durante uma contingência, os dados do evento. Deve-se enviar, junto da data, o fuso horário no qual tal data e hora foi gerada.<br/>Formato: 'yyyy-MM-ddTHH:mm:ss.SSSZ'
  **/
  private String dataHoraOcorrencia = null;

  @XmlElement(name="dataHoraRegistro", required = true)
  @ApiModelProperty(example = "2020-04-01T10:50:30.150-0300", required = true, value = "Data e hora em que se efetuou o lançamento, no sistema informatizado, seja em operações normais, seja das informações coletadas durante uma contingência. Deve-se enviar, junto da data, o fuso horário no qual tal data e hora foi gerada.<br/>Formato: 'yyyy-MM-ddTHH:mm:ss.SSSZ'")
 /**
   * Data e hora em que se efetuou o lançamento, no sistema informatizado, seja em operações normais, seja das informações coletadas durante uma contingência. Deve-se enviar, junto da data, o fuso horário no qual tal data e hora foi gerada.<br/>Formato: 'yyyy-MM-ddTHH:mm:ss.SSSZ'
  **/
  private String dataHoraRegistro = null;

  @XmlElement(name="cpfOperadorOcorrencia")
  @ApiModelProperty(example = "55555555555", value = "CPF da pessoa que coletou, em formulário papel durante uma contingência, os dados do evento.<br/>Pode ser nulo quando o processo for automatizado, com isso, não há operador de ocorrência e nem de registro.<br/>Tamanho: 11<br/>Formato: 'NNNNNNNNNNN'")
 /**
   * CPF da pessoa que coletou, em formulário papel durante uma contingência, os dados do evento.<br/>Pode ser nulo quando o processo for automatizado, com isso, não há operador de ocorrência e nem de registro.<br/>Tamanho: 11<br/>Formato: 'NNNNNNNNNNN'
  **/
  private String cpfOperadorOcorrencia = null;

  @XmlElement(name="cpfOperadorRegistro")
  @ApiModelProperty(example = "55555555555", value = "CPF da pessoa que efetuou o lançamento, no sistema informatizado, seja em operações normais, seja das informações coletadas durante uma contingência.<br>Pode ser nulo quando o processo for automatizado, com isso, não há operador de ocorrência e nem de registro.<br/>Tamanho: 11<br/>Formato: 'NNNNNNNNNNN'")
 /**
   * CPF da pessoa que efetuou o lançamento, no sistema informatizado, seja em operações normais, seja das informações coletadas durante uma contingência.<br>Pode ser nulo quando o processo for automatizado, com isso, não há operador de ocorrência e nem de registro.<br/>Tamanho: 11<br/>Formato: 'NNNNNNNNNNN'
  **/
  private String cpfOperadorRegistro = null;

  @XmlElement(name="protocoloEventoRetificadoOuExcluido")
  @ApiModelProperty(example = "66d24eb1-6ac9-4798-bc93-f4c66eb6fa9b", value = "Observar que no caso de evento retificador ou de exclusão, o protocolo do evento retificado ou excluído deve ser informado para possibilitar a correta vinculação. Usar protocolo recebido após o envio do evento original. O envio de eventos retificadores substitui completamente as informações prestadas no evento retificado.<br/>Tamanho: 36")
 /**
   * Observar que no caso de evento retificador ou de exclusão, o protocolo do evento retificado ou excluído deve ser informado para possibilitar a correta vinculação. Usar protocolo recebido após o envio do evento original. O envio de eventos retificadores substitui completamente as informações prestadas no evento retificado.<br/>Tamanho: 36
  **/
  private String protocoloEventoRetificadoOuExcluido = null;

  @XmlElement(name="contingencia", required = true)
  @ApiModelProperty(example = "false", required = true, value = "Indica que este evento ocorreu durante uma contingência. Via de regra deverá haver um evento (Ocorrências de indisponibilidade de equipamentos) para o equipamento envolvido. Transmitir como true sempre que ocorrer falha operacional no sistema do recinto que impeça o registro e/ou envio de informações em seu sistema.<br/>Domínio:<br/>true - Sim<br/>false - Não")
 /**
   * Indica que este evento ocorreu durante uma contingência. Via de regra deverá haver um evento (Ocorrências de indisponibilidade de equipamentos) para o equipamento envolvido. Transmitir como true sempre que ocorrer falha operacional no sistema do recinto que impeça o registro e/ou envio de informações em seu sistema.<br/>Domínio:<br/>true - Sim<br/>false - Não
  **/
  private Boolean contingencia = null;

  @XmlElement(name="codigoRecinto", required = true)
  @ApiModelProperty(example = "1111111", required = true, value = "Código Siscomex do recinto onde ocorreu o evento a ser transmitido.<br/>Tamanho: 15")
 /**
   * Código Siscomex do recinto onde ocorreu o evento a ser transmitido.<br/>Tamanho: 15
  **/
  private String codigoRecinto = null;


@XmlType(name="StatusEnum")
@XmlEnum(String.class)
public enum StatusEnum {

	@XmlEnumValue("'B'")
	@JsonProperty("'B'")
	B_(String.valueOf("'B'")),
	
	@XmlEnumValue("'D'")
	@JsonProperty("'D'")
	D_(String.valueOf("'D'"));


    private String value;

    StatusEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static StatusEnum fromValue(String v) {
        for (StatusEnum b : StatusEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to StatusEnum");
    }
}

  @XmlElement(name="status")
  @ApiModelProperty(example = "B", value = "Informar bloqueio ou desbloqueio.<br/>Domínio:<br/>B - Bloqueio<br/>D - Desbloqueio")
 /**
   * Informar bloqueio ou desbloqueio.<br/>Domínio:<br/>B - Bloqueio<br/>D - Desbloqueio
  **/
  private StatusEnum status = null;

  @XmlElement(name="numeroManifesto")
  @ApiModelProperty(example = "1318500002175", value = "Número do Manifesto.<br/>Tamanho: 100")
 /**
   * Número do Manifesto.<br/>Tamanho: 100
  **/
  private String numeroManifesto = null;


@XmlType(name="TipoManifestoEnum")
@XmlEnum(String.class)
public enum TipoManifestoEnum {

	@XmlEnumValue("'MICDTA'")
	@JsonProperty("'MICDTA'")
	MICDTA_(String.valueOf("'MICDTA'")),
	
	@XmlEnumValue("'TIFDTA'")
	@JsonProperty("'TIFDTA'")
	TIFDTA_(String.valueOf("'TIFDTA'")),
	
	@XmlEnumValue("'MDFE'")
	@JsonProperty("'MDFE'")
	MDFE_(String.valueOf("'MDFE'")),
	
	@XmlEnumValue("'MELET'")
	@JsonProperty("'MELET'")
	MELET_(String.valueOf("'MELET'"));


    private String value;

    TipoManifestoEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TipoManifestoEnum fromValue(String v) {
        for (TipoManifestoEnum b : TipoManifestoEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to TipoManifestoEnum");
    }
}

  @XmlElement(name="tipoManifesto")
  @ApiModelProperty(example = "MICDTA", value = "Tipo do manifesto conforme tabela de domínio.<br/>Domínio:<br/>MICDTA - MicDTA<br/>TIFDTA - TifDTA<br/>MDFE - MDF-e<br/>MELET - Manifesto Eletrônico")
 /**
   * Tipo do manifesto conforme tabela de domínio.<br/>Domínio:<br/>MICDTA - MicDTA<br/>TIFDTA - TifDTA<br/>MDFE - MDF-e<br/>MELET - Manifesto Eletrônico
  **/
  private TipoManifestoEnum tipoManifesto = null;

  @XmlElement(name="numeroConhecimentoMAWB")
  @ApiModelProperty(example = "0556548723", value = "Identificação do conhecimento MASTER (MAWB), a ser utilizado somente no modal aéreo. <br/>Quando se tratar de um MAWB, esse campo deve ser preenchido, e o campo 'Conhecimento de carga' deve ser deixado vazio. <br/>Quando se tratar de um HAWB, este campo deve ser preenchido com o MASTER (inclusive nos casos de remessa) e o campo 'Conhecimento de carga' <br/> deve ser preenchido com o HOUSE.<br/>Tamanho: 100")
 /**
   * Identificação do conhecimento MASTER (MAWB), a ser utilizado somente no modal aéreo. <br/>Quando se tratar de um MAWB, esse campo deve ser preenchido, e o campo 'Conhecimento de carga' deve ser deixado vazio. <br/>Quando se tratar de um HAWB, este campo deve ser preenchido com o MASTER (inclusive nos casos de remessa) e o campo 'Conhecimento de carga' <br/> deve ser preenchido com o HOUSE.<br/>Tamanho: 100
  **/
  private String numeroConhecimentoMAWB = null;

  @XmlElement(name="numeroConhecimento")
  @ApiModelProperty(example = "131805000071025", value = "Identificação do conhecimento de carga ou do DSIC. <br/>No modal aéreo, deve ser preenchido quando se tratar de AWB direto, ou HAWB, ou DSIC. <br/>No aquaviário deve ser preenchido com CE Mercante na importação e na exportação com o conhecimento internacional ou, quando ainda não emitido, com o CT-e que amparou a chegada da carga.<br/>Tamanho: 100")
 /**
   * Identificação do conhecimento de carga ou do DSIC. <br/>No modal aéreo, deve ser preenchido quando se tratar de AWB direto, ou HAWB, ou DSIC. <br/>No aquaviário deve ser preenchido com CE Mercante na importação e na exportação com o conhecimento internacional ou, quando ainda não emitido, com o CT-e que amparou a chegada da carga.<br/>Tamanho: 100
  **/
  private String numeroConhecimento = null;


@XmlType(name="TipoConhecimentoEnum")
@XmlEnum(String.class)
public enum TipoConhecimentoEnum {

	@XmlEnumValue("'CRT'")
	@JsonProperty("'CRT'")
	CRT_(String.valueOf("'CRT'")),
	
	@XmlEnumValue("'TIF'")
	@JsonProperty("'TIF'")
	TIF_(String.valueOf("'TIF'")),
	
	@XmlEnumValue("'BL'")
	@JsonProperty("'BL'")
	BL_(String.valueOf("'BL'")),
	
	@XmlEnumValue("'AWB'")
	@JsonProperty("'AWB'")
	AWB_(String.valueOf("'AWB'")),
	
	@XmlEnumValue("'DSIC'")
	@JsonProperty("'DSIC'")
	DSIC_(String.valueOf("'DSIC'")),
	
	@XmlEnumValue("'COURIER'")
	@JsonProperty("'COURIER'")
	COURIER_(String.valueOf("'COURIER'")),
	
	@XmlEnumValue("'POSTAL'")
	@JsonProperty("'POSTAL'")
	POSTAL_(String.valueOf("'POSTAL'")),
	
	@XmlEnumValue("'CTE'")
	@JsonProperty("'CTE'")
	CTE_(String.valueOf("'CTE'")),
	
	@XmlEnumValue("'CELET'")
	@JsonProperty("'CELET'")
	CELET_(String.valueOf("'CELET'")),
	
	@XmlEnumValue("'CE_MERCANTE'")
	@JsonProperty("'CE_MERCANTE'")
	CE_MERCANTE_(String.valueOf("'CE_MERCANTE'"));


    private String value;

    TipoConhecimentoEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TipoConhecimentoEnum fromValue(String v) {
        for (TipoConhecimentoEnum b : TipoConhecimentoEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to TipoConhecimentoEnum");
    }
}

  @XmlElement(name="tipoConhecimento")
  @ApiModelProperty(example = "AWB", value = "Tipo de conhecimento conforme tabela de domínio.<br/>Domínio:<br/>CRT - CRT<br/>TIF - TIF<br/>BL - BL<br/>AWB - AWB<br/>DSIC - DSIC<br/>COURIER - Courier<br/>POSTAL - Postal<br/>CTE - CT-e<br/>CELET - Conhecimento Eletrônico<br>CE_MERCANTE - CE Mercante")
 /**
   * Tipo de conhecimento conforme tabela de domínio.<br/>Domínio:<br/>CRT - CRT<br/>TIF - TIF<br/>BL - BL<br/>AWB - AWB<br/>DSIC - DSIC<br/>COURIER - Courier<br/>POSTAL - Postal<br/>CTE - CT-e<br/>CELET - Conhecimento Eletrônico<br>CE_MERCANTE - CE Mercante
  **/
  private TipoConhecimentoEnum tipoConhecimento = null;

  @XmlElement(name="numeroDeclaracao")
  @ApiModelProperty(value = "Número da declaração aduaneira.<br/>Tamanho: 100")
 /**
   * Número da declaração aduaneira.<br/>Tamanho: 100
  **/
  private String numeroDeclaracao = null;


@XmlType(name="TipoDeclaracaoEnum")
@XmlEnum(String.class)
public enum TipoDeclaracaoEnum {

	@XmlEnumValue("'DI'")
	@JsonProperty("'DI'")
	DI_(String.valueOf("'DI'")),
	
	@XmlEnumValue("'DSI_ELETRONICA'")
	@JsonProperty("'DSI_ELETRONICA'")
	DSI_ELETRONICA_(String.valueOf("'DSI_ELETRONICA'")),
	
	@XmlEnumValue("'DSI_FORMULARIO'")
	@JsonProperty("'DSI_FORMULARIO'")
	DSI_FORMULARIO_(String.valueOf("'DSI_FORMULARIO'")),
	
	@XmlEnumValue("'DSE_ELETRONICA'")
	@JsonProperty("'DSE_ELETRONICA'")
	DSE_ELETRONICA_(String.valueOf("'DSE_ELETRONICA'")),
	
	@XmlEnumValue("'DSE_FORMULARIO'")
	@JsonProperty("'DSE_FORMULARIO'")
	DSE_FORMULARIO_(String.valueOf("'DSE_FORMULARIO'")),
	
	@XmlEnumValue("'DUIMP'")
	@JsonProperty("'DUIMP'")
	DUIMP_(String.valueOf("'DUIMP'")),
	
	@XmlEnumValue("'DUE'")
	@JsonProperty("'DUE'")
	DUE_(String.valueOf("'DUE'")),
	
	@XmlEnumValue("'DE'")
	@JsonProperty("'DE'")
	DE_(String.valueOf("'DE'")),
	
	@XmlEnumValue("'DTA'")
	@JsonProperty("'DTA'")
	DTA_(String.valueOf("'DTA'")),
	
	@XmlEnumValue("'DTA_S'")
	@JsonProperty("'DTA_S'")
	DTA_S_(String.valueOf("'DTA_S'")),
	
	@XmlEnumValue("'DTAI'")
	@JsonProperty("'DTAI'")
	DTAI_(String.valueOf("'DTAI'")),
	
	@XmlEnumValue("'DTC'")
	@JsonProperty("'DTC'")
	DTC_(String.valueOf("'DTC'")),
	
	@XmlEnumValue("'DAT'")
	@JsonProperty("'DAT'")
	DAT_(String.valueOf("'DAT'")),
	
	@XmlEnumValue("'ATA_C'")
	@JsonProperty("'ATA_C'")
	ATA_C_(String.valueOf("'ATA_C'")),
	
	@XmlEnumValue("'DIR'")
	@JsonProperty("'DIR'")
	DIR_(String.valueOf("'DIR'")),
	
	@XmlEnumValue("'DRE'")
	@JsonProperty("'DRE'")
	DRE_(String.valueOf("'DRE'")),
	
	@XmlEnumValue("'DRI'")
	@JsonProperty("'DRI'")
	DRI_(String.valueOf("'DRI'"));


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

  @XmlElement(name="tipoDeclaracao")
  @ApiModelProperty(example = "DUIMP", value = "Tipo da declaração aduaneira conforme tabela de domínio.<br/>Domínio:<br/>DI - Declaração de Importação <br/>DSI_ELETRONICA - DSI Eletrônica <br/>DSI_FORMULARIO - DSI Formulário <br/>DSE_ELETRONICA - DSE Eletrônica <br/>DSE_FORMULARIO -  DSE Formulário <br/>DUIMP - Declaração Única de Importação <br/>DUE - Declaração Única de Exportação <br/>DE - Declaração de Exportação <br/>DTA - Declaração de Trânsito Aduaneiro <br/>DTA_S - Declaração de Trânsito Aduaneiro Simplificado <br/>DTAI - Declaração de Trânsito Aduaneiro Internacional <br/>DTC - Declaração de Trânsito de Contêiner <br/>DAT - Documento de Acompanhamento de Trânsito <br/>ATA_C - Carnê Ata (Ata Carnet) <br/>DIR - Declaração de Importação de Remessa <br/>DRE - Declaração de Remessas de Exportação <br/>DRI - Declaração de Remessas de Importação")
 /**
   * Tipo da declaração aduaneira conforme tabela de domínio.<br/>Domínio:<br/>DI - Declaração de Importação <br/>DSI_ELETRONICA - DSI Eletrônica <br/>DSI_FORMULARIO - DSI Formulário <br/>DSE_ELETRONICA - DSE Eletrônica <br/>DSE_FORMULARIO -  DSE Formulário <br/>DUIMP - Declaração Única de Importação <br/>DUE - Declaração Única de Exportação <br/>DE - Declaração de Exportação <br/>DTA - Declaração de Trânsito Aduaneiro <br/>DTA_S - Declaração de Trânsito Aduaneiro Simplificado <br/>DTAI - Declaração de Trânsito Aduaneiro Internacional <br/>DTC - Declaração de Trânsito de Contêiner <br/>DAT - Documento de Acompanhamento de Trânsito <br/>ATA_C - Carnê Ata (Ata Carnet) <br/>DIR - Declaração de Importação de Remessa <br/>DRE - Declaração de Remessas de Exportação <br/>DRI - Declaração de Remessas de Importação
  **/
  private TipoDeclaracaoEnum tipoDeclaracao = null;

  @XmlElement(name="placa")
  @ApiModelProperty(value = "Placa (cavalo-trator/semirreboque/locomotiva/vagão).<br/>Tamanho: 50")
 /**
   * Placa (cavalo-trator/semirreboque/locomotiva/vagão).<br/>Tamanho: 50
  **/
  private String placa = null;

  @XmlElement(name="numeroConteiner")
  @ApiModelProperty(value = "Identificação do número do contêiner.<br/>Tamanho: 200")
 /**
   * Identificação do número do contêiner.<br/>Tamanho: 200
  **/
  private String numeroConteiner = null;

  @XmlElement(name="identificacaoUld")
  @ApiModelProperty(example = "AZEB123_AA, AKE21001NZ", value = "Identificação da ULD, no formato (TTTNNNNNPP) composta pelos seguintes atributos: Tipo de ULD (3 caracteres - TTT), Número da ULD (5 caracteres - NNNNN - Caso o número tenha menos que 5 caracteres, preencher à direita com o caracter especial \"_\") e  Código do proprietário da ULD (2 caracteres - PP). Ex: AZEB123_AA, AKE21001NZ.<br/>Tamanho: 10")
 /**
   * Identificação da ULD, no formato (TTTNNNNNPP) composta pelos seguintes atributos: Tipo de ULD (3 caracteres - TTT), Número da ULD (5 caracteres - NNNNN - Caso o número tenha menos que 5 caracteres, preencher à direita com o caracter especial \"_\") e  Código do proprietário da ULD (2 caracteres - PP). Ex: AZEB123_AA, AKE21001NZ.<br/>Tamanho: 10
  **/
  private String identificacaoUld = null;

  @XmlElement(name="listaLotes")
  @ApiModelProperty(value = "Lista de lotes. Usar o mesmo número gerado no Evento de Geração de Lotes.")
  @Valid
 /**
   * Lista de lotes. Usar o mesmo número gerado no Evento de Geração de Lotes.
  **/
  private List<DadosDaIdentificaoDoLote> listaLotes = null;


@XmlType(name="SolicitanteEnum")
@XmlEnum(String.class)
public enum SolicitanteEnum {

	@XmlEnumValue("'ACI'")
	@JsonProperty("'ACI'")
	ACI_(String.valueOf("'ACI'")),
	
	@XmlEnumValue("'ANCINE'")
	@JsonProperty("'ANCINE'")
	ANCINE_(String.valueOf("'ANCINE'")),
	
	@XmlEnumValue("'ANEEL'")
	@JsonProperty("'ANEEL'")
	ANEEL_(String.valueOf("'ANEEL'")),
	
	@XmlEnumValue("'ANP'")
	@JsonProperty("'ANP'")
	ANP_(String.valueOf("'ANP'")),
	
	@XmlEnumValue("'ANVISA'")
	@JsonProperty("'ANVISA'")
	ANVISA_(String.valueOf("'ANVISA'")),
	
	@XmlEnumValue("'BB'")
	@JsonProperty("'BB'")
	BB_(String.valueOf("'BB'")),
	
	@XmlEnumValue("'BEFIEX'")
	@JsonProperty("'BEFIEX'")
	BEFIEX_(String.valueOf("'BEFIEX'")),
	
	@XmlEnumValue("'BNDES'")
	@JsonProperty("'BNDES'")
	BNDES_(String.valueOf("'BNDES'")),
	
	@XmlEnumValue("'CNEN'")
	@JsonProperty("'CNEN'")
	CNEN_(String.valueOf("'CNEN'")),
	
	@XmlEnumValue("'CNPQ'")
	@JsonProperty("'CNPQ'")
	CNPQ_(String.valueOf("'CNPQ'")),
	
	@XmlEnumValue("'CONFAZ'")
	@JsonProperty("'CONFAZ'")
	CONFAZ_(String.valueOf("'CONFAZ'")),
	
	@XmlEnumValue("'COTAC'")
	@JsonProperty("'COTAC'")
	COTAC_(String.valueOf("'COTAC'")),
	
	@XmlEnumValue("'DEAEX'")
	@JsonProperty("'DEAEX'")
	DEAEX_(String.valueOf("'DEAEX'")),
	
	@XmlEnumValue("'DECEX'")
	@JsonProperty("'DECEX'")
	DECEX_(String.valueOf("'DECEX'")),
	
	@XmlEnumValue("'DEPLA'")
	@JsonProperty("'DEPLA'")
	DEPLA_(String.valueOf("'DEPLA'")),
	
	@XmlEnumValue("'DFPC'")
	@JsonProperty("'DFPC'")
	DFPC_(String.valueOf("'DFPC'")),
	
	@XmlEnumValue("'DNPM'")
	@JsonProperty("'DNPM'")
	DNPM_(String.valueOf("'DNPM'")),
	
	@XmlEnumValue("'DPF'")
	@JsonProperty("'DPF'")
	DPF_(String.valueOf("'DPF'")),
	
	@XmlEnumValue("'ECT'")
	@JsonProperty("'ECT'")
	ECT_(String.valueOf("'ECT'")),
	
	@XmlEnumValue("'GESTOR'")
	@JsonProperty("'GESTOR'")
	GESTOR_(String.valueOf("'GESTOR'")),
	
	@XmlEnumValue("'IBAMA'")
	@JsonProperty("'IBAMA'")
	IBAMA_(String.valueOf("'IBAMA'")),
	
	@XmlEnumValue("'INMETRO'")
	@JsonProperty("'INMETRO'")
	INMETRO_(String.valueOf("'INMETRO'")),
	
	@XmlEnumValue("'IPHAN'")
	@JsonProperty("'IPHAN'")
	IPHAN_(String.valueOf("'IPHAN'")),
	
	@XmlEnumValue("'JUSTIÇA'")
	@JsonProperty("'JUSTIÇA'")
	JUSTI_A_(String.valueOf("'JUSTIÇA'")),
	
	@XmlEnumValue("'MAPA'")
	@JsonProperty("'MAPA'")
	MAPA_(String.valueOf("'MAPA'")),
	
	@XmlEnumValue("'MCTI'")
	@JsonProperty("'MCTI'")
	MCTI_(String.valueOf("'MCTI'")),
	
	@XmlEnumValue("'MD'")
	@JsonProperty("'MD'")
	MD_(String.valueOf("'MD'")),
	
	@XmlEnumValue("'MRE'")
	@JsonProperty("'MRE'")
	MRE_(String.valueOf("'MRE'")),
	
	@XmlEnumValue("'RFB'")
	@JsonProperty("'RFB'")
	RFB_(String.valueOf("'RFB'")),
	
	@XmlEnumValue("'SDAVO'")
	@JsonProperty("'SDAVO'")
	SDAVO_(String.valueOf("'SDAVO'")),
	
	@XmlEnumValue("'SECEX'")
	@JsonProperty("'SECEX'")
	SECEX_(String.valueOf("'SECEX'")),
	
	@XmlEnumValue("'SEPIN'")
	@JsonProperty("'SEPIN'")
	SEPIN_(String.valueOf("'SEPIN'")),
	
	@XmlEnumValue("'SPC-MA'")
	@JsonProperty("'SPC-MA'")
	SPC_MA_(String.valueOf("'SPC-MA'")),
	
	@XmlEnumValue("'SUFRAMA'")
	@JsonProperty("'SUFRAMA'")
	SUFRAMA_(String.valueOf("'SUFRAMA'")),
	
	@XmlEnumValue("'OUTRO'")
	@JsonProperty("'OUTRO'")
	OUTRO_(String.valueOf("'OUTRO'"));


    private String value;

    SolicitanteEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static SolicitanteEnum fromValue(String v) {
        for (SolicitanteEnum b : SolicitanteEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to SolicitanteEnum");
    }
}

  @XmlElement(name="solicitante")
  @ApiModelProperty(example = "ANCINE", value = "Indicar qual o interveniente que solicitou o bloqueio ou desbloqueio.<br/>Domínio:<br/>ACI - ÁREA DE CONTROLE INTEGRADO<br/>ANCINE - AGENCIA NACIONAL DO CINEMA<br/>ANEEL - AGENCIA NACIONAL DE ENERGIA ELETRICA<br/>ANP - AGENCIA NACIONAL DO PETROLEO<br/>ANVISA - AGENCIA NACIONAL DE VIGILANCIA SANITARIA<br/>BB - BANCO DO BRASIL<br/>BEFIEX - PROGRAMAS BEFIEX<br/>BNDES - BANCO NACIONAL DE DESENVOLVIMENTO ECONÔMICO E SOCIAL<br/>CNEN - COMISSAO NACIONAL DE ENERGIA NUCLEAR<br/>CNPQ - CONSELHO NACIONAL DE DESENVOLVIMENTO CIENTIFICO E TECNOLOGICO<br/>CONFAZ - CONSELHO NACIONAL DE POLITICA FAZENDARIA/SECRETARIAS DE FAZENDA ESTADUAIS<br/>COTAC - MIN.AERON. COMISSAO COORDENADORA DO TRANSPORTE AEREO CIVIL<br/>DEAEX - DEPARTAMENTO DE ESTATISTICA E APOIO A EXPORTACAO<br/>DECEX - DEPARTAMENTO DE OPERACOES DE COMERCIO EXTERIOR<br/>DEPLA - DEPARTAMENTO DE PLANEJAMENTO E DESENVOLVIMENTO DO COMERCIO EXTERIOR<br/>DFPC - DIRETORIA DE FISCALIZACAO DE PRODUTOS CONTROLADOS<br/>DNPM - DEPARTAMENTO NACIONAL DE PRODUCAO MINERAL<br/>DPF - DEPARTAMENTO DE POLICIA FEDERAL<br/>ECT - EMPRESA BRASILEIRA DE CORREIOS E TELEGRAFOS<br/>GESTOR - MICT/DECEX/GESTOR<br/>IBAMA - INSTITUTO BRASILEIRO DO MEIO AMBIENTE E DOS RECURSOS NATURAIS RENOVAVEIS<br/>INMETRO - INSTITUTO NACIONAL DE METROLOGIA<br/>IPHAN - INSTITUTO DO PATRIMÔNIO HISTÓRICO E ARTÍSTICO NACIONAL<br/>JUSTIÇA - JUSTIÇA FEDERAL OU ESTADUAL, TRIBUNAIS, E DEMAIS.<br/>MAPA - MINISTERIO DA AGRICULTURA,PECUARIA E ABASTECIMENTO<br/>MCTI - MINISTERIO DA CIENCIA, TECNOLOGIA E INOVACAO<br/>MD - MINISTERIO DA DEFESA<br/>MRE - MINISTÉRIO DAS RELAÇÕES EXTERIORES<br/>RFB - RECEITA FEDERAL DO BRASIL<br/>SDAVO - AUDIOVISUAL<br/>SECEX - SECRETARIA DE COMERCIO EXTERIOR<br/>SEPIN - MIN.DA CIENCIA E TECNOLOGIA<br/>SPC_MA - SECRETARIA DE PRODUCAO E COMERCIALIZACAO<br/>SUFRAMA - SUPERINTENDENCIA DA ZONA FRANCA DE MANAUS<br/>OUTRO - OUTROS NÃO LISTADOS ANTERIORMENTE")
 /**
   * Indicar qual o interveniente que solicitou o bloqueio ou desbloqueio.<br/>Domínio:<br/>ACI - ÁREA DE CONTROLE INTEGRADO<br/>ANCINE - AGENCIA NACIONAL DO CINEMA<br/>ANEEL - AGENCIA NACIONAL DE ENERGIA ELETRICA<br/>ANP - AGENCIA NACIONAL DO PETROLEO<br/>ANVISA - AGENCIA NACIONAL DE VIGILANCIA SANITARIA<br/>BB - BANCO DO BRASIL<br/>BEFIEX - PROGRAMAS BEFIEX<br/>BNDES - BANCO NACIONAL DE DESENVOLVIMENTO ECONÔMICO E SOCIAL<br/>CNEN - COMISSAO NACIONAL DE ENERGIA NUCLEAR<br/>CNPQ - CONSELHO NACIONAL DE DESENVOLVIMENTO CIENTIFICO E TECNOLOGICO<br/>CONFAZ - CONSELHO NACIONAL DE POLITICA FAZENDARIA/SECRETARIAS DE FAZENDA ESTADUAIS<br/>COTAC - MIN.AERON. COMISSAO COORDENADORA DO TRANSPORTE AEREO CIVIL<br/>DEAEX - DEPARTAMENTO DE ESTATISTICA E APOIO A EXPORTACAO<br/>DECEX - DEPARTAMENTO DE OPERACOES DE COMERCIO EXTERIOR<br/>DEPLA - DEPARTAMENTO DE PLANEJAMENTO E DESENVOLVIMENTO DO COMERCIO EXTERIOR<br/>DFPC - DIRETORIA DE FISCALIZACAO DE PRODUTOS CONTROLADOS<br/>DNPM - DEPARTAMENTO NACIONAL DE PRODUCAO MINERAL<br/>DPF - DEPARTAMENTO DE POLICIA FEDERAL<br/>ECT - EMPRESA BRASILEIRA DE CORREIOS E TELEGRAFOS<br/>GESTOR - MICT/DECEX/GESTOR<br/>IBAMA - INSTITUTO BRASILEIRO DO MEIO AMBIENTE E DOS RECURSOS NATURAIS RENOVAVEIS<br/>INMETRO - INSTITUTO NACIONAL DE METROLOGIA<br/>IPHAN - INSTITUTO DO PATRIMÔNIO HISTÓRICO E ARTÍSTICO NACIONAL<br/>JUSTIÇA - JUSTIÇA FEDERAL OU ESTADUAL, TRIBUNAIS, E DEMAIS.<br/>MAPA - MINISTERIO DA AGRICULTURA,PECUARIA E ABASTECIMENTO<br/>MCTI - MINISTERIO DA CIENCIA, TECNOLOGIA E INOVACAO<br/>MD - MINISTERIO DA DEFESA<br/>MRE - MINISTÉRIO DAS RELAÇÕES EXTERIORES<br/>RFB - RECEITA FEDERAL DO BRASIL<br/>SDAVO - AUDIOVISUAL<br/>SECEX - SECRETARIA DE COMERCIO EXTERIOR<br/>SEPIN - MIN.DA CIENCIA E TECNOLOGIA<br/>SPC_MA - SECRETARIA DE PRODUCAO E COMERCIALIZACAO<br/>SUFRAMA - SUPERINTENDENCIA DA ZONA FRANCA DE MANAUS<br/>OUTRO - OUTROS NÃO LISTADOS ANTERIORMENTE
  **/
  private SolicitanteEnum solicitante = null;

  @XmlElement(name="setorSolicitante")
  @ApiModelProperty(value = "Identificação do setor, seção e/ou serviço solicitante do bloqueio ou desbloqueio.<br/>Tamanho: 100")
 /**
   * Identificação do setor, seção e/ou serviço solicitante do bloqueio ou desbloqueio.<br/>Tamanho: 100
  **/
  private String setorSolicitante = null;

  @XmlElement(name="motivo")
  @ApiModelProperty(value = "Motivação do bloqueio ou desbloqueio.<br/>Tamanho: 100")
 /**
   * Motivação do bloqueio ou desbloqueio.<br/>Tamanho: 100
  **/
  private String motivo = null;
 /**
   * Indica se o evento transmitido é novo (incluir) ou retifica/exclui evento anterior.&lt;br/&gt;Domínio:&lt;br/&gt;I - Incluir&lt;br/&gt;R - Retificar&lt;br/&gt;E - Excluir
   * @return tipoOperacao
  **/
  @JsonProperty("tipoOperacao")
  @NotNull
  public String getTipoOperacao() {
    if (tipoOperacao == null) {
      return null;
    }
    return tipoOperacao.value();
  }

  public void setTipoOperacao(TipoOperacaoEnum tipoOperacao) {
    this.tipoOperacao = tipoOperacao;
  }

  public DadosInformaoBloqueioDesbloqueioVeculoCarga tipoOperacao(TipoOperacaoEnum tipoOperacao) {
    this.tipoOperacao = tipoOperacao;
    return this;
  }

 /**
   * Identificador único do evento que pode ser utilizado para recuperar as informações do Evento no sistema de origem do Recinto remetente. Ex.: Chave tabela 1 + ... + chave tabela n - tantas chaves quantas forem as tabelas necessárias para montar o registro do evento.&lt;br/&gt;Tamanho: 100
   * @return idEvento
  **/
  @JsonProperty("idEvento")
  @NotNull
  public String getIdEvento() {
    return idEvento;
  }

  public void setIdEvento(String idEvento) {
    this.idEvento = idEvento;
  }

  public DadosInformaoBloqueioDesbloqueioVeculoCarga idEvento(String idEvento) {
    this.idEvento = idEvento;
    return this;
  }

 /**
   * Data e hora em que o evento ocorreu ou que se coletou, em formulário papel durante uma contingência, os dados do evento. Deve-se enviar, junto da data, o fuso horário no qual tal data e hora foi gerada.&lt;br/&gt;Formato: &#39;yyyy-MM-ddTHH:mm:ss.SSSZ&#39;
   * @return dataHoraOcorrencia
  **/
  @JsonProperty("dataHoraOcorrencia")
  @NotNull
  public String getDataHoraOcorrencia() {
    return dataHoraOcorrencia;
  }

  public void setDataHoraOcorrencia(String dataHoraOcorrencia) {
    this.dataHoraOcorrencia = dataHoraOcorrencia;
  }

  public DadosInformaoBloqueioDesbloqueioVeculoCarga dataHoraOcorrencia(String dataHoraOcorrencia) {
    this.dataHoraOcorrencia = dataHoraOcorrencia;
    return this;
  }

 /**
   * Data e hora em que se efetuou o lançamento, no sistema informatizado, seja em operações normais, seja das informações coletadas durante uma contingência. Deve-se enviar, junto da data, o fuso horário no qual tal data e hora foi gerada.&lt;br/&gt;Formato: &#39;yyyy-MM-ddTHH:mm:ss.SSSZ&#39;
   * @return dataHoraRegistro
  **/
  @JsonProperty("dataHoraRegistro")
  @NotNull
  public String getDataHoraRegistro() {
    return dataHoraRegistro;
  }

  public void setDataHoraRegistro(String dataHoraRegistro) {
    this.dataHoraRegistro = dataHoraRegistro;
  }

  public DadosInformaoBloqueioDesbloqueioVeculoCarga dataHoraRegistro(String dataHoraRegistro) {
    this.dataHoraRegistro = dataHoraRegistro;
    return this;
  }

 /**
   * CPF da pessoa que coletou, em formulário papel durante uma contingência, os dados do evento.&lt;br/&gt;Pode ser nulo quando o processo for automatizado, com isso, não há operador de ocorrência e nem de registro.&lt;br/&gt;Tamanho: 11&lt;br/&gt;Formato: &#39;NNNNNNNNNNN&#39;
   * @return cpfOperadorOcorrencia
  **/
  @JsonProperty("cpfOperadorOcorrencia")
  public String getCpfOperadorOcorrencia() {
    return cpfOperadorOcorrencia;
  }

  public void setCpfOperadorOcorrencia(String cpfOperadorOcorrencia) {
    this.cpfOperadorOcorrencia = cpfOperadorOcorrencia;
  }

  public DadosInformaoBloqueioDesbloqueioVeculoCarga cpfOperadorOcorrencia(String cpfOperadorOcorrencia) {
    this.cpfOperadorOcorrencia = cpfOperadorOcorrencia;
    return this;
  }

 /**
   * CPF da pessoa que efetuou o lançamento, no sistema informatizado, seja em operações normais, seja das informações coletadas durante uma contingência.&lt;br&gt;Pode ser nulo quando o processo for automatizado, com isso, não há operador de ocorrência e nem de registro.&lt;br/&gt;Tamanho: 11&lt;br/&gt;Formato: &#39;NNNNNNNNNNN&#39;
   * @return cpfOperadorRegistro
  **/
  @JsonProperty("cpfOperadorRegistro")
  public String getCpfOperadorRegistro() {
    return cpfOperadorRegistro;
  }

  public void setCpfOperadorRegistro(String cpfOperadorRegistro) {
    this.cpfOperadorRegistro = cpfOperadorRegistro;
  }

  public DadosInformaoBloqueioDesbloqueioVeculoCarga cpfOperadorRegistro(String cpfOperadorRegistro) {
    this.cpfOperadorRegistro = cpfOperadorRegistro;
    return this;
  }

 /**
   * Observar que no caso de evento retificador ou de exclusão, o protocolo do evento retificado ou excluído deve ser informado para possibilitar a correta vinculação. Usar protocolo recebido após o envio do evento original. O envio de eventos retificadores substitui completamente as informações prestadas no evento retificado.&lt;br/&gt;Tamanho: 36
   * @return protocoloEventoRetificadoOuExcluido
  **/
  @JsonProperty("protocoloEventoRetificadoOuExcluido")
  public String getProtocoloEventoRetificadoOuExcluido() {
    return protocoloEventoRetificadoOuExcluido;
  }

  public void setProtocoloEventoRetificadoOuExcluido(String protocoloEventoRetificadoOuExcluido) {
    this.protocoloEventoRetificadoOuExcluido = protocoloEventoRetificadoOuExcluido;
  }

  public DadosInformaoBloqueioDesbloqueioVeculoCarga protocoloEventoRetificadoOuExcluido(String protocoloEventoRetificadoOuExcluido) {
    this.protocoloEventoRetificadoOuExcluido = protocoloEventoRetificadoOuExcluido;
    return this;
  }

 /**
   * Indica que este evento ocorreu durante uma contingência. Via de regra deverá haver um evento (Ocorrências de indisponibilidade de equipamentos) para o equipamento envolvido. Transmitir como true sempre que ocorrer falha operacional no sistema do recinto que impeça o registro e/ou envio de informações em seu sistema.&lt;br/&gt;Domínio:&lt;br/&gt;true - Sim&lt;br/&gt;false - Não
   * @return contingencia
  **/
  @JsonProperty("contingencia")
  @NotNull
  public Boolean isContingencia() {
    return contingencia;
  }

  public void setContingencia(Boolean contingencia) {
    this.contingencia = contingencia;
  }

  public DadosInformaoBloqueioDesbloqueioVeculoCarga contingencia(Boolean contingencia) {
    this.contingencia = contingencia;
    return this;
  }

 /**
   * Código Siscomex do recinto onde ocorreu o evento a ser transmitido.&lt;br/&gt;Tamanho: 15
   * @return codigoRecinto
  **/
  @JsonProperty("codigoRecinto")
  @NotNull
  public String getCodigoRecinto() {
    return codigoRecinto;
  }

  public void setCodigoRecinto(String codigoRecinto) {
    this.codigoRecinto = codigoRecinto;
  }

  public DadosInformaoBloqueioDesbloqueioVeculoCarga codigoRecinto(String codigoRecinto) {
    this.codigoRecinto = codigoRecinto;
    return this;
  }

 /**
   * Informar bloqueio ou desbloqueio.&lt;br/&gt;Domínio:&lt;br/&gt;B - Bloqueio&lt;br/&gt;D - Desbloqueio
   * @return status
  **/
  @JsonProperty("status")
  public String getStatus() {
    if (status == null) {
      return null;
    }
    return status.value();
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public DadosInformaoBloqueioDesbloqueioVeculoCarga status(StatusEnum status) {
    this.status = status;
    return this;
  }

 /**
   * Número do Manifesto.&lt;br/&gt;Tamanho: 100
   * @return numeroManifesto
  **/
  @JsonProperty("numeroManifesto")
  public String getNumeroManifesto() {
    return numeroManifesto;
  }

  public void setNumeroManifesto(String numeroManifesto) {
    this.numeroManifesto = numeroManifesto;
  }

  public DadosInformaoBloqueioDesbloqueioVeculoCarga numeroManifesto(String numeroManifesto) {
    this.numeroManifesto = numeroManifesto;
    return this;
  }

 /**
   * Tipo do manifesto conforme tabela de domínio.&lt;br/&gt;Domínio:&lt;br/&gt;MICDTA - MicDTA&lt;br/&gt;TIFDTA - TifDTA&lt;br/&gt;MDFE - MDF-e&lt;br/&gt;MELET - Manifesto Eletrônico
   * @return tipoManifesto
  **/
  @JsonProperty("tipoManifesto")
  public String getTipoManifesto() {
    if (tipoManifesto == null) {
      return null;
    }
    return tipoManifesto.value();
  }

  public void setTipoManifesto(TipoManifestoEnum tipoManifesto) {
    this.tipoManifesto = tipoManifesto;
  }

  public DadosInformaoBloqueioDesbloqueioVeculoCarga tipoManifesto(TipoManifestoEnum tipoManifesto) {
    this.tipoManifesto = tipoManifesto;
    return this;
  }

 /**
   * Identificação do conhecimento MASTER (MAWB), a ser utilizado somente no modal aéreo. &lt;br/&gt;Quando se tratar de um MAWB, esse campo deve ser preenchido, e o campo &#39;Conhecimento de carga&#39; deve ser deixado vazio. &lt;br/&gt;Quando se tratar de um HAWB, este campo deve ser preenchido com o MASTER (inclusive nos casos de remessa) e o campo &#39;Conhecimento de carga&#39; &lt;br/&gt; deve ser preenchido com o HOUSE.&lt;br/&gt;Tamanho: 100
   * @return numeroConhecimentoMAWB
  **/
  @JsonProperty("numeroConhecimentoMAWB")
  public String getNumeroConhecimentoMAWB() {
    return numeroConhecimentoMAWB;
  }

  public void setNumeroConhecimentoMAWB(String numeroConhecimentoMAWB) {
    this.numeroConhecimentoMAWB = numeroConhecimentoMAWB;
  }

  public DadosInformaoBloqueioDesbloqueioVeculoCarga numeroConhecimentoMAWB(String numeroConhecimentoMAWB) {
    this.numeroConhecimentoMAWB = numeroConhecimentoMAWB;
    return this;
  }

 /**
   * Identificação do conhecimento de carga ou do DSIC. &lt;br/&gt;No modal aéreo, deve ser preenchido quando se tratar de AWB direto, ou HAWB, ou DSIC. &lt;br/&gt;No aquaviário deve ser preenchido com CE Mercante na importação e na exportação com o conhecimento internacional ou, quando ainda não emitido, com o CT-e que amparou a chegada da carga.&lt;br/&gt;Tamanho: 100
   * @return numeroConhecimento
  **/
  @JsonProperty("numeroConhecimento")
  public String getNumeroConhecimento() {
    return numeroConhecimento;
  }

  public void setNumeroConhecimento(String numeroConhecimento) {
    this.numeroConhecimento = numeroConhecimento;
  }

  public DadosInformaoBloqueioDesbloqueioVeculoCarga numeroConhecimento(String numeroConhecimento) {
    this.numeroConhecimento = numeroConhecimento;
    return this;
  }

 /**
   * Tipo de conhecimento conforme tabela de domínio.&lt;br/&gt;Domínio:&lt;br/&gt;CRT - CRT&lt;br/&gt;TIF - TIF&lt;br/&gt;BL - BL&lt;br/&gt;AWB - AWB&lt;br/&gt;DSIC - DSIC&lt;br/&gt;COURIER - Courier&lt;br/&gt;POSTAL - Postal&lt;br/&gt;CTE - CT-e&lt;br/&gt;CELET - Conhecimento Eletrônico&lt;br&gt;CE_MERCANTE - CE Mercante
   * @return tipoConhecimento
  **/
  @JsonProperty("tipoConhecimento")
  public String getTipoConhecimento() {
    if (tipoConhecimento == null) {
      return null;
    }
    return tipoConhecimento.value();
  }

  public void setTipoConhecimento(TipoConhecimentoEnum tipoConhecimento) {
    this.tipoConhecimento = tipoConhecimento;
  }

  public DadosInformaoBloqueioDesbloqueioVeculoCarga tipoConhecimento(TipoConhecimentoEnum tipoConhecimento) {
    this.tipoConhecimento = tipoConhecimento;
    return this;
  }

 /**
   * Número da declaração aduaneira.&lt;br/&gt;Tamanho: 100
   * @return numeroDeclaracao
  **/
  @JsonProperty("numeroDeclaracao")
  public String getNumeroDeclaracao() {
    return numeroDeclaracao;
  }

  public void setNumeroDeclaracao(String numeroDeclaracao) {
    this.numeroDeclaracao = numeroDeclaracao;
  }

  public DadosInformaoBloqueioDesbloqueioVeculoCarga numeroDeclaracao(String numeroDeclaracao) {
    this.numeroDeclaracao = numeroDeclaracao;
    return this;
  }

 /**
   * Tipo da declaração aduaneira conforme tabela de domínio.&lt;br/&gt;Domínio:&lt;br/&gt;DI - Declaração de Importação &lt;br/&gt;DSI_ELETRONICA - DSI Eletrônica &lt;br/&gt;DSI_FORMULARIO - DSI Formulário &lt;br/&gt;DSE_ELETRONICA - DSE Eletrônica &lt;br/&gt;DSE_FORMULARIO -  DSE Formulário &lt;br/&gt;DUIMP - Declaração Única de Importação &lt;br/&gt;DUE - Declaração Única de Exportação &lt;br/&gt;DE - Declaração de Exportação &lt;br/&gt;DTA - Declaração de Trânsito Aduaneiro &lt;br/&gt;DTA_S - Declaração de Trânsito Aduaneiro Simplificado &lt;br/&gt;DTAI - Declaração de Trânsito Aduaneiro Internacional &lt;br/&gt;DTC - Declaração de Trânsito de Contêiner &lt;br/&gt;DAT - Documento de Acompanhamento de Trânsito &lt;br/&gt;ATA_C - Carnê Ata (Ata Carnet) &lt;br/&gt;DIR - Declaração de Importação de Remessa &lt;br/&gt;DRE - Declaração de Remessas de Exportação &lt;br/&gt;DRI - Declaração de Remessas de Importação
   * @return tipoDeclaracao
  **/
  @JsonProperty("tipoDeclaracao")
  public String getTipoDeclaracao() {
    if (tipoDeclaracao == null) {
      return null;
    }
    return tipoDeclaracao.value();
  }

  public void setTipoDeclaracao(TipoDeclaracaoEnum tipoDeclaracao) {
    this.tipoDeclaracao = tipoDeclaracao;
  }

  public DadosInformaoBloqueioDesbloqueioVeculoCarga tipoDeclaracao(TipoDeclaracaoEnum tipoDeclaracao) {
    this.tipoDeclaracao = tipoDeclaracao;
    return this;
  }

 /**
   * Placa (cavalo-trator/semirreboque/locomotiva/vagão).&lt;br/&gt;Tamanho: 50
   * @return placa
  **/
  @JsonProperty("placa")
  public String getPlaca() {
    return placa;
  }

  public void setPlaca(String placa) {
    this.placa = placa;
  }

  public DadosInformaoBloqueioDesbloqueioVeculoCarga placa(String placa) {
    this.placa = placa;
    return this;
  }

 /**
   * Identificação do número do contêiner.&lt;br/&gt;Tamanho: 200
   * @return numeroConteiner
  **/
  @JsonProperty("numeroConteiner")
  public String getNumeroConteiner() {
    return numeroConteiner;
  }

  public void setNumeroConteiner(String numeroConteiner) {
    this.numeroConteiner = numeroConteiner;
  }

  public DadosInformaoBloqueioDesbloqueioVeculoCarga numeroConteiner(String numeroConteiner) {
    this.numeroConteiner = numeroConteiner;
    return this;
  }

 /**
   * Identificação da ULD, no formato (TTTNNNNNPP) composta pelos seguintes atributos: Tipo de ULD (3 caracteres - TTT), Número da ULD (5 caracteres - NNNNN - Caso o número tenha menos que 5 caracteres, preencher à direita com o caracter especial \&quot;_\&quot;) e  Código do proprietário da ULD (2 caracteres - PP). Ex: AZEB123_AA, AKE21001NZ.&lt;br/&gt;Tamanho: 10
   * @return identificacaoUld
  **/
  @JsonProperty("identificacaoUld")
  public String getIdentificacaoUld() {
    return identificacaoUld;
  }

  public void setIdentificacaoUld(String identificacaoUld) {
    this.identificacaoUld = identificacaoUld;
  }

  public DadosInformaoBloqueioDesbloqueioVeculoCarga identificacaoUld(String identificacaoUld) {
    this.identificacaoUld = identificacaoUld;
    return this;
  }

 /**
   * Lista de lotes. Usar o mesmo número gerado no Evento de Geração de Lotes.
   * @return listaLotes
  **/
  @JsonProperty("listaLotes")
  public List<DadosDaIdentificaoDoLote> getListaLotes() {
    return listaLotes;
  }

  public void setListaLotes(List<DadosDaIdentificaoDoLote> listaLotes) {
    this.listaLotes = listaLotes;
  }

  public DadosInformaoBloqueioDesbloqueioVeculoCarga listaLotes(List<DadosDaIdentificaoDoLote> listaLotes) {
    this.listaLotes = listaLotes;
    return this;
  }

  public DadosInformaoBloqueioDesbloqueioVeculoCarga addListaLotesItem(DadosDaIdentificaoDoLote listaLotesItem) {
    this.listaLotes.add(listaLotesItem);
    return this;
  }

 /**
   * Indicar qual o interveniente que solicitou o bloqueio ou desbloqueio.&lt;br/&gt;Domínio:&lt;br/&gt;ACI - ÁREA DE CONTROLE INTEGRADO&lt;br/&gt;ANCINE - AGENCIA NACIONAL DO CINEMA&lt;br/&gt;ANEEL - AGENCIA NACIONAL DE ENERGIA ELETRICA&lt;br/&gt;ANP - AGENCIA NACIONAL DO PETROLEO&lt;br/&gt;ANVISA - AGENCIA NACIONAL DE VIGILANCIA SANITARIA&lt;br/&gt;BB - BANCO DO BRASIL&lt;br/&gt;BEFIEX - PROGRAMAS BEFIEX&lt;br/&gt;BNDES - BANCO NACIONAL DE DESENVOLVIMENTO ECONÔMICO E SOCIAL&lt;br/&gt;CNEN - COMISSAO NACIONAL DE ENERGIA NUCLEAR&lt;br/&gt;CNPQ - CONSELHO NACIONAL DE DESENVOLVIMENTO CIENTIFICO E TECNOLOGICO&lt;br/&gt;CONFAZ - CONSELHO NACIONAL DE POLITICA FAZENDARIA/SECRETARIAS DE FAZENDA ESTADUAIS&lt;br/&gt;COTAC - MIN.AERON. COMISSAO COORDENADORA DO TRANSPORTE AEREO CIVIL&lt;br/&gt;DEAEX - DEPARTAMENTO DE ESTATISTICA E APOIO A EXPORTACAO&lt;br/&gt;DECEX - DEPARTAMENTO DE OPERACOES DE COMERCIO EXTERIOR&lt;br/&gt;DEPLA - DEPARTAMENTO DE PLANEJAMENTO E DESENVOLVIMENTO DO COMERCIO EXTERIOR&lt;br/&gt;DFPC - DIRETORIA DE FISCALIZACAO DE PRODUTOS CONTROLADOS&lt;br/&gt;DNPM - DEPARTAMENTO NACIONAL DE PRODUCAO MINERAL&lt;br/&gt;DPF - DEPARTAMENTO DE POLICIA FEDERAL&lt;br/&gt;ECT - EMPRESA BRASILEIRA DE CORREIOS E TELEGRAFOS&lt;br/&gt;GESTOR - MICT/DECEX/GESTOR&lt;br/&gt;IBAMA - INSTITUTO BRASILEIRO DO MEIO AMBIENTE E DOS RECURSOS NATURAIS RENOVAVEIS&lt;br/&gt;INMETRO - INSTITUTO NACIONAL DE METROLOGIA&lt;br/&gt;IPHAN - INSTITUTO DO PATRIMÔNIO HISTÓRICO E ARTÍSTICO NACIONAL&lt;br/&gt;JUSTIÇA - JUSTIÇA FEDERAL OU ESTADUAL, TRIBUNAIS, E DEMAIS.&lt;br/&gt;MAPA - MINISTERIO DA AGRICULTURA,PECUARIA E ABASTECIMENTO&lt;br/&gt;MCTI - MINISTERIO DA CIENCIA, TECNOLOGIA E INOVACAO&lt;br/&gt;MD - MINISTERIO DA DEFESA&lt;br/&gt;MRE - MINISTÉRIO DAS RELAÇÕES EXTERIORES&lt;br/&gt;RFB - RECEITA FEDERAL DO BRASIL&lt;br/&gt;SDAVO - AUDIOVISUAL&lt;br/&gt;SECEX - SECRETARIA DE COMERCIO EXTERIOR&lt;br/&gt;SEPIN - MIN.DA CIENCIA E TECNOLOGIA&lt;br/&gt;SPC_MA - SECRETARIA DE PRODUCAO E COMERCIALIZACAO&lt;br/&gt;SUFRAMA - SUPERINTENDENCIA DA ZONA FRANCA DE MANAUS&lt;br/&gt;OUTRO - OUTROS NÃO LISTADOS ANTERIORMENTE
   * @return solicitante
  **/
  @JsonProperty("solicitante")
  public String getSolicitante() {
    if (solicitante == null) {
      return null;
    }
    return solicitante.value();
  }

  public void setSolicitante(SolicitanteEnum solicitante) {
    this.solicitante = solicitante;
  }

  public DadosInformaoBloqueioDesbloqueioVeculoCarga solicitante(SolicitanteEnum solicitante) {
    this.solicitante = solicitante;
    return this;
  }

 /**
   * Identificação do setor, seção e/ou serviço solicitante do bloqueio ou desbloqueio.&lt;br/&gt;Tamanho: 100
   * @return setorSolicitante
  **/
  @JsonProperty("setorSolicitante")
  public String getSetorSolicitante() {
    return setorSolicitante;
  }

  public void setSetorSolicitante(String setorSolicitante) {
    this.setorSolicitante = setorSolicitante;
  }

  public DadosInformaoBloqueioDesbloqueioVeculoCarga setorSolicitante(String setorSolicitante) {
    this.setorSolicitante = setorSolicitante;
    return this;
  }

 /**
   * Motivação do bloqueio ou desbloqueio.&lt;br/&gt;Tamanho: 100
   * @return motivo
  **/
  @JsonProperty("motivo")
  public String getMotivo() {
    return motivo;
  }

  public void setMotivo(String motivo) {
    this.motivo = motivo;
  }

  public DadosInformaoBloqueioDesbloqueioVeculoCarga motivo(String motivo) {
    this.motivo = motivo;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DadosInformaoBloqueioDesbloqueioVeculoCarga {\n");
    
    sb.append("    tipoOperacao: ").append(toIndentedString(tipoOperacao)).append("\n");
    sb.append("    idEvento: ").append(toIndentedString(idEvento)).append("\n");
    sb.append("    dataHoraOcorrencia: ").append(toIndentedString(dataHoraOcorrencia)).append("\n");
    sb.append("    dataHoraRegistro: ").append(toIndentedString(dataHoraRegistro)).append("\n");
    sb.append("    cpfOperadorOcorrencia: ").append(toIndentedString(cpfOperadorOcorrencia)).append("\n");
    sb.append("    cpfOperadorRegistro: ").append(toIndentedString(cpfOperadorRegistro)).append("\n");
    sb.append("    protocoloEventoRetificadoOuExcluido: ").append(toIndentedString(protocoloEventoRetificadoOuExcluido)).append("\n");
    sb.append("    contingencia: ").append(toIndentedString(contingencia)).append("\n");
    sb.append("    codigoRecinto: ").append(toIndentedString(codigoRecinto)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    numeroManifesto: ").append(toIndentedString(numeroManifesto)).append("\n");
    sb.append("    tipoManifesto: ").append(toIndentedString(tipoManifesto)).append("\n");
    sb.append("    numeroConhecimentoMAWB: ").append(toIndentedString(numeroConhecimentoMAWB)).append("\n");
    sb.append("    numeroConhecimento: ").append(toIndentedString(numeroConhecimento)).append("\n");
    sb.append("    tipoConhecimento: ").append(toIndentedString(tipoConhecimento)).append("\n");
    sb.append("    numeroDeclaracao: ").append(toIndentedString(numeroDeclaracao)).append("\n");
    sb.append("    tipoDeclaracao: ").append(toIndentedString(tipoDeclaracao)).append("\n");
    sb.append("    placa: ").append(toIndentedString(placa)).append("\n");
    sb.append("    numeroConteiner: ").append(toIndentedString(numeroConteiner)).append("\n");
    sb.append("    identificacaoUld: ").append(toIndentedString(identificacaoUld)).append("\n");
    sb.append("    listaLotes: ").append(toIndentedString(listaLotes)).append("\n");
    sb.append("    solicitante: ").append(toIndentedString(solicitante)).append("\n");
    sb.append("    setorSolicitante: ").append(toIndentedString(setorSolicitante)).append("\n");
    sb.append("    motivo: ").append(toIndentedString(motivo)).append("\n");
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

