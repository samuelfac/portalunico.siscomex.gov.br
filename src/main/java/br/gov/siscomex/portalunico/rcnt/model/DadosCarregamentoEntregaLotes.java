package br.gov.siscomex.portalunico.rcnt.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "DadosCarregamentoEntregaLotes", propOrder =
    { "tipoOperacao", "idEvento", "dataHoraOcorrencia", "dataHoraRegistro", "cpfOperadorOcorrencia", "cpfOperadorRegistro", "protocoloEventoRetificadoOuExcluido", "contingencia", "codigoRecinto", "numeroManifesto", "tipoManifesto", "numeroConhecimentoMAWB", "numeroConhecimento", "tipoConhecimento", "declaracaoAduaneira", "listaNfe", "listaNumeroLote", "indicadorPerdimento", "identificacaoDocumentoPerdimento", "quantidadeVolumesLote", "placaSemirreboque", "numeroConteiner", "identificacaoUld", "entregaParaCompanhiaAerea", "cnpjCompanhiaAerea", "nomeCompanhiaAerea", "iataAeronave", "prefixoAeronave", "viagem", "voo", "escala", "entregaParaPessoaFisica", "cpfRecepcao", "documentoEstrangeiro", "listaCameras"
})

@XmlRootElement(name="DadosCarregamentoEntregaLotes")
public class DadosCarregamentoEntregaLotes  {
  

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
  @ApiModelProperty(required = true, value = "Identificador único do evento que pode ser utilizado para recuperar as informações do Evento no sistema de origem do Recinto remetente. Ex.: Chave tabela 1 + ... + chave tabela n - tantas chaves quantas forem as tabelas necessárias para montar o registro do evento.<br/> O idEvento informado em cada evento não pode ser repetido quando \"tipoOperacao\"=\"I-Incluir\", ou seja, não pode ser reutilizado em novos eventos de inclusão para o mesmo tipo de evento e pelo mesmo recinto remetente.<br/>Tamanho: 100")
 /**
   * Identificador único do evento que pode ser utilizado para recuperar as informações do Evento no sistema de origem do Recinto remetente. Ex.: Chave tabela 1 + ... + chave tabela n - tantas chaves quantas forem as tabelas necessárias para montar o registro do evento.<br/> O idEvento informado em cada evento não pode ser repetido quando \"tipoOperacao\"=\"I-Incluir\", ou seja, não pode ser reutilizado em novos eventos de inclusão para o mesmo tipo de evento e pelo mesmo recinto remetente.<br/>Tamanho: 100
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

  @XmlElement(name="numeroManifesto")
  @ApiModelProperty(example = "1318500002175", value = "Número do Manifesto. No caso de MDF-e informar a chave de acesso.<br/>Tamanho: 100")
 /**
   * Número do Manifesto. No caso de MDF-e informar a chave de acesso.<br/>Tamanho: 100
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
  @ApiModelProperty(example = "0556548723", value = "Identificação do conhecimento MASTER (MAWB), a ser utilizado somente no modal aéreo. <br/>Quando se tratar de um MAWB, esse campo deve ser preenchido, e o campo 'Conhecimento de carga' deve ser deixado vazio. <br/>Quando se tratar de um HAWB, este campo deve ser preenchido com o MASTER (inclusive nos casos de remessa) e o campo 'Conhecimento de carga' <br/> deve ser preenchido com o HOUSE.<br/>Deve ser informado sem caracteres de máscara de formatação. Contudo, será permitido o uso do caractere \"-\".<br/>Tamanho: 100")
 /**
   * Identificação do conhecimento MASTER (MAWB), a ser utilizado somente no modal aéreo. <br/>Quando se tratar de um MAWB, esse campo deve ser preenchido, e o campo 'Conhecimento de carga' deve ser deixado vazio. <br/>Quando se tratar de um HAWB, este campo deve ser preenchido com o MASTER (inclusive nos casos de remessa) e o campo 'Conhecimento de carga' <br/> deve ser preenchido com o HOUSE.<br/>Deve ser informado sem caracteres de máscara de formatação. Contudo, será permitido o uso do caractere \"-\".<br/>Tamanho: 100
  **/
  private String numeroConhecimentoMAWB = null;

  @XmlElement(name="numeroConhecimento")
  @ApiModelProperty(example = "131805000071025", value = "Identificação do conhecimento de carga ou do DSIC. <br/>No modal aéreo, na importação, deve ser preenchido quando se tratar de AWB direto, ou HAWB, ou DSIC. <br/>No modal aéreo, na exportação, não deve ser preenchido.  <br/>No aquaviário deve ser preenchido com CE Mercante na importação e na exportação com o conhecimento internacional ou, quando ainda não emitido, com o CT-e que amparou a chegada da carga. No caso de CT-e informar a chave de acesso.<br/> Deve ser informado sem caracteres de máscara de formatação. Contudo, será permitido o uso do caractere \"-\". <br/>Tamanho: 100")
 /**
   * Identificação do conhecimento de carga ou do DSIC. <br/>No modal aéreo, na importação, deve ser preenchido quando se tratar de AWB direto, ou HAWB, ou DSIC. <br/>No modal aéreo, na exportação, não deve ser preenchido.  <br/>No aquaviário deve ser preenchido com CE Mercante na importação e na exportação com o conhecimento internacional ou, quando ainda não emitido, com o CT-e que amparou a chegada da carga. No caso de CT-e informar a chave de acesso.<br/> Deve ser informado sem caracteres de máscara de formatação. Contudo, será permitido o uso do caractere \"-\". <br/>Tamanho: 100
  **/
  private String numeroConhecimento = null;

  @XmlElement(name="tipoConhecimento")
  @ApiModelProperty(example = "AWB", value = "Tipo de conhecimento. Conforme tabela de domínio Tipo de Conhecimento disponível no <a href=https://portalunico.siscomex.gov.br/tabx/#/tabelas rel=\"noopener noreferrer\" target=\"_blank\">Portal Único Siscomex.</a>")
 /**
   * Tipo de conhecimento. Conforme tabela de domínio Tipo de Conhecimento disponível no <a href=https://portalunico.siscomex.gov.br/tabx/#/tabelas rel=\"noopener noreferrer\" target=\"_blank\">Portal Único Siscomex.</a>
  **/
  private String tipoConhecimento = null;

  @XmlElement(name="declaracaoAduaneira")
  @ApiModelProperty(value = "")
  @Valid
  private DeclaraoAduaneira declaracaoAduaneira = null;

  @XmlElement(name="listaNfe")
  @ApiModelProperty(value = "Lista de chaves das NFE que amparam o transporte.")
  @Valid
 /**
   * Lista de chaves das NFE que amparam o transporte.
  **/
  private List<DadosDaNotaFiscalEmbarqueDesembarque> listaNfe = null;

  @XmlElement(name="listaNumeroLote", required = true)
  @ApiModelProperty(required = true, value = "Lista com os números dos lotes carregados e/ou entregues. Usar o mesmo número gerado no evento GERAÇÃO DE LOTES. Pode ser nulo quando o evento for de exclusão.")
  @Valid
 /**
   * Lista com os números dos lotes carregados e/ou entregues. Usar o mesmo número gerado no evento GERAÇÃO DE LOTES. Pode ser nulo quando o evento for de exclusão.
  **/
  private List<DadosDaIdentificaoDoLote> listaNumeroLote = new ArrayList<>();

  @XmlElement(name="indicadorPerdimento")
  @ApiModelProperty(example = "false", value = "Indica que os volumes carregados em unidade de carga ou entregues foram objeto de destinação de mercadorias em perdimento<br/>Domínio:<br/>true - Sim<br/>false - Não")
 /**
   * Indica que os volumes carregados em unidade de carga ou entregues foram objeto de destinação de mercadorias em perdimento<br/>Domínio:<br/>true - Sim<br/>false - Não
  **/
  private Boolean indicadorPerdimento = null;

  @XmlElement(name="identificacaoDocumentoPerdimento")
  @ApiModelProperty(value = "Identificação do documento ou termo que amparou o perdimento<br/>Tamanho: 100")
 /**
   * Identificação do documento ou termo que amparou o perdimento<br/>Tamanho: 100
  **/
  private String identificacaoDocumentoPerdimento = null;

  @XmlElement(name="quantidadeVolumesLote")
  @ApiModelProperty(example = "15.5", value = "Quantidade de volumes carregados em unidade de carga ou entregues")
  @Valid
 /**
   * Quantidade de volumes carregados em unidade de carga ou entregues
  **/
  private BigDecimal quantidadeVolumesLote = null;

  @XmlElement(name="placaSemirreboque")
  @ApiModelProperty(value = "Placa do semirreboque, vagão ou truck que carregou a carga.<br/>Tamanho: 50")
 /**
   * Placa do semirreboque, vagão ou truck que carregou a carga.<br/>Tamanho: 50
  **/
  private String placaSemirreboque = null;

  @XmlElement(name="numeroConteiner")
  @ApiModelProperty(value = "Identificação do número do contêiner em que os lotes foram carregados.<br/>Tamanho: 200")
 /**
   * Identificação do número do contêiner em que os lotes foram carregados.<br/>Tamanho: 200
  **/
  private String numeroConteiner = null;

  @XmlElement(name="identificacaoUld")
  @ApiModelProperty(example = "AZEB123_AA, AKE21001NZ", value = "Identificação da ULD em que os lotes foram carregados, no formato (TTTNNNNNPP) composta pelos seguintes atributos: Tipo de ULD (3 caracteres - TTT), Número da ULD (5 caracteres - NNNNN - Caso o número tenha menos que 5 caracteres, preencher à direita com o caracter especial \"_\") e Código do proprietário da ULD (2 caracteres - PP).<br/>Tamanho: 10")
 /**
   * Identificação da ULD em que os lotes foram carregados, no formato (TTTNNNNNPP) composta pelos seguintes atributos: Tipo de ULD (3 caracteres - TTT), Número da ULD (5 caracteres - NNNNN - Caso o número tenha menos que 5 caracteres, preencher à direita com o caracter especial \"_\") e Código do proprietário da ULD (2 caracteres - PP).<br/>Tamanho: 10
  **/
  private String identificacaoUld = null;

  @XmlElement(name="entregaParaCompanhiaAerea")
  @ApiModelProperty(example = "false", value = "Entrega para companhia aérea. <br/>Indicador para os casos em que o recinto apenas entrega os lotes para companhia aérea.<br/>Domínio:<br/>true - Sim<br/>false - Não")
 /**
   * Entrega para companhia aérea. <br/>Indicador para os casos em que o recinto apenas entrega os lotes para companhia aérea.<br/>Domínio:<br/>true - Sim<br/>false - Não
  **/
  private Boolean entregaParaCompanhiaAerea = null;

  @XmlElement(name="cnpjCompanhiaAerea")
  @ApiModelProperty(example = "44444444444444", value = "CNPJ da companhia aérea para a qual o depositário entregou os lotes.<br/>Tamanho: 14<br/>Formato: 'NNNNNNNNNNNNNN'")
 /**
   * CNPJ da companhia aérea para a qual o depositário entregou os lotes.<br/>Tamanho: 14<br/>Formato: 'NNNNNNNNNNNNNN'
  **/
  private String cnpjCompanhiaAerea = null;

  @XmlElement(name="nomeCompanhiaAerea")
  @ApiModelProperty(value = "Nome da companhia aérea para a qual o depositário entregou os lotes.<br/>Tamanho: 100")
 /**
   * Nome da companhia aérea para a qual o depositário entregou os lotes.<br/>Tamanho: 100
  **/
  private String nomeCompanhiaAerea = null;

  @XmlElement(name="iataAeronave")
  @ApiModelProperty(value = "IATA Aeronave<br/>Tamanho: 50")
 /**
   * IATA Aeronave<br/>Tamanho: 50
  **/
  private String iataAeronave = null;

  @XmlElement(name="prefixoAeronave")
  @ApiModelProperty(value = "Prefixo Aeronave<br/>Tamanho: 20")
 /**
   * Prefixo Aeronave<br/>Tamanho: 20
  **/
  private String prefixoAeronave = null;

  @XmlElement(name="viagem")
  @ApiModelProperty(example = "AA090520191209MIA', onde vôo = 'AA0905', data de partida prevista = '20191209' e aeroporto da partida = 'MIA", value = "Identificação da viagem.<br/>Tamanho: 20<br/>No aéreo a composição da viagem é: vôo + data da partida prevista + aeroporto da partida.No aquaviário também deve ser informado o campo viagem no formato disponível.")
 /**
   * Identificação da viagem.<br/>Tamanho: 20<br/>No aéreo a composição da viagem é: vôo + data da partida prevista + aeroporto da partida.No aquaviário também deve ser informado o campo viagem no formato disponível.
  **/
  private String viagem = null;

  @XmlElement(name="voo")
  @ApiModelProperty(value = "Vôo<br/>Tamanho: 20")
 /**
   * Vôo<br/>Tamanho: 20
  **/
  private String voo = null;

  @XmlElement(name="escala")
  @ApiModelProperty(value = "Escala<br/>Tamanho: 20")
 /**
   * Escala<br/>Tamanho: 20
  **/
  private String escala = null;

  @XmlElement(name="entregaParaPessoaFisica")
  @ApiModelProperty(example = "false", value = "Indicador para os casos em que o recinto entrega os lotes em mãos para novo responsável pessoa física. Nessa situação não há veículo transportador.<br/>Domínio:<br/>true - Sim<br/>false - Não")
 /**
   * Indicador para os casos em que o recinto entrega os lotes em mãos para novo responsável pessoa física. Nessa situação não há veículo transportador.<br/>Domínio:<br/>true - Sim<br/>false - Não
  **/
  private Boolean entregaParaPessoaFisica = null;

  @XmlElement(name="cpfRecepcao")
  @ApiModelProperty(example = "55555555555", value = "CPF para os casos em que o recinto entrega os lotes em mãos para novo responsável pessoa física. Nessa situação não há veículo transportador.<br/>Tamanho: 11<br/>Formato: 'NNNNNNNNNNN'")
 /**
   * CPF para os casos em que o recinto entrega os lotes em mãos para novo responsável pessoa física. Nessa situação não há veículo transportador.<br/>Tamanho: 11<br/>Formato: 'NNNNNNNNNNN'
  **/
  private String cpfRecepcao = null;

  @XmlElement(name="documentoEstrangeiro")
  @ApiModelProperty(value = "")
  @Valid
  private DadosDocumentoEstrangeiro documentoEstrangeiro = null;

  @XmlElement(name="listaCameras")
  @ApiModelProperty(value = "Lista de identificação das câmeras. Usar o protocolo do evento de georreferenciamento para indicar, nesta lista, todas as câmeras que cobrem a área onde o lote foi carregado ou entregue para companhia aérea.")
  @Valid
 /**
   * Lista de identificação das câmeras. Usar o protocolo do evento de georreferenciamento para indicar, nesta lista, todas as câmeras que cobrem a área onde o lote foi carregado ou entregue para companhia aérea.
  **/
  private List<DadosDaCmera> listaCameras = null;
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

  public DadosCarregamentoEntregaLotes tipoOperacao(TipoOperacaoEnum tipoOperacao) {
    this.tipoOperacao = tipoOperacao;
    return this;
  }

 /**
   * Identificador único do evento que pode ser utilizado para recuperar as informações do Evento no sistema de origem do Recinto remetente. Ex.: Chave tabela 1 + ... + chave tabela n - tantas chaves quantas forem as tabelas necessárias para montar o registro do evento.&lt;br/&gt; O idEvento informado em cada evento não pode ser repetido quando \&quot;tipoOperacao\&quot;&#x3D;\&quot;I-Incluir\&quot;, ou seja, não pode ser reutilizado em novos eventos de inclusão para o mesmo tipo de evento e pelo mesmo recinto remetente.&lt;br/&gt;Tamanho: 100
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

  public DadosCarregamentoEntregaLotes idEvento(String idEvento) {
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

  public DadosCarregamentoEntregaLotes dataHoraOcorrencia(String dataHoraOcorrencia) {
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

  public DadosCarregamentoEntregaLotes dataHoraRegistro(String dataHoraRegistro) {
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

  public DadosCarregamentoEntregaLotes cpfOperadorOcorrencia(String cpfOperadorOcorrencia) {
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

  public DadosCarregamentoEntregaLotes cpfOperadorRegistro(String cpfOperadorRegistro) {
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

  public DadosCarregamentoEntregaLotes protocoloEventoRetificadoOuExcluido(String protocoloEventoRetificadoOuExcluido) {
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

  public DadosCarregamentoEntregaLotes contingencia(Boolean contingencia) {
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

  public DadosCarregamentoEntregaLotes codigoRecinto(String codigoRecinto) {
    this.codigoRecinto = codigoRecinto;
    return this;
  }

 /**
   * Número do Manifesto. No caso de MDF-e informar a chave de acesso.&lt;br/&gt;Tamanho: 100
   * @return numeroManifesto
  **/
  @JsonProperty("numeroManifesto")
  public String getNumeroManifesto() {
    return numeroManifesto;
  }

  public void setNumeroManifesto(String numeroManifesto) {
    this.numeroManifesto = numeroManifesto;
  }

  public DadosCarregamentoEntregaLotes numeroManifesto(String numeroManifesto) {
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

  public DadosCarregamentoEntregaLotes tipoManifesto(TipoManifestoEnum tipoManifesto) {
    this.tipoManifesto = tipoManifesto;
    return this;
  }

 /**
   * Identificação do conhecimento MASTER (MAWB), a ser utilizado somente no modal aéreo. &lt;br/&gt;Quando se tratar de um MAWB, esse campo deve ser preenchido, e o campo &#39;Conhecimento de carga&#39; deve ser deixado vazio. &lt;br/&gt;Quando se tratar de um HAWB, este campo deve ser preenchido com o MASTER (inclusive nos casos de remessa) e o campo &#39;Conhecimento de carga&#39; &lt;br/&gt; deve ser preenchido com o HOUSE.&lt;br/&gt;Deve ser informado sem caracteres de máscara de formatação. Contudo, será permitido o uso do caractere \&quot;-\&quot;.&lt;br/&gt;Tamanho: 100
   * @return numeroConhecimentoMAWB
  **/
  @JsonProperty("numeroConhecimentoMAWB")
  public String getNumeroConhecimentoMAWB() {
    return numeroConhecimentoMAWB;
  }

  public void setNumeroConhecimentoMAWB(String numeroConhecimentoMAWB) {
    this.numeroConhecimentoMAWB = numeroConhecimentoMAWB;
  }

  public DadosCarregamentoEntregaLotes numeroConhecimentoMAWB(String numeroConhecimentoMAWB) {
    this.numeroConhecimentoMAWB = numeroConhecimentoMAWB;
    return this;
  }

 /**
   * Identificação do conhecimento de carga ou do DSIC. &lt;br/&gt;No modal aéreo, na importação, deve ser preenchido quando se tratar de AWB direto, ou HAWB, ou DSIC. &lt;br/&gt;No modal aéreo, na exportação, não deve ser preenchido.  &lt;br/&gt;No aquaviário deve ser preenchido com CE Mercante na importação e na exportação com o conhecimento internacional ou, quando ainda não emitido, com o CT-e que amparou a chegada da carga. No caso de CT-e informar a chave de acesso.&lt;br/&gt; Deve ser informado sem caracteres de máscara de formatação. Contudo, será permitido o uso do caractere \&quot;-\&quot;. &lt;br/&gt;Tamanho: 100
   * @return numeroConhecimento
  **/
  @JsonProperty("numeroConhecimento")
  public String getNumeroConhecimento() {
    return numeroConhecimento;
  }

  public void setNumeroConhecimento(String numeroConhecimento) {
    this.numeroConhecimento = numeroConhecimento;
  }

  public DadosCarregamentoEntregaLotes numeroConhecimento(String numeroConhecimento) {
    this.numeroConhecimento = numeroConhecimento;
    return this;
  }

 /**
   * Tipo de conhecimento. Conforme tabela de domínio Tipo de Conhecimento disponível no &lt;a href&#x3D;https://portalunico.siscomex.gov.br/tabx/#/tabelas rel&#x3D;\&quot;noopener noreferrer\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Portal Único Siscomex.&lt;/a&gt;
   * @return tipoConhecimento
  **/
  @JsonProperty("tipoConhecimento")
  public String getTipoConhecimento() {
    return tipoConhecimento;
  }

  public void setTipoConhecimento(String tipoConhecimento) {
    this.tipoConhecimento = tipoConhecimento;
  }

  public DadosCarregamentoEntregaLotes tipoConhecimento(String tipoConhecimento) {
    this.tipoConhecimento = tipoConhecimento;
    return this;
  }

 /**
   * Get declaracaoAduaneira
   * @return declaracaoAduaneira
  **/
  @JsonProperty("declaracaoAduaneira")
  public DeclaraoAduaneira getDeclaracaoAduaneira() {
    return declaracaoAduaneira;
  }

  public void setDeclaracaoAduaneira(DeclaraoAduaneira declaracaoAduaneira) {
    this.declaracaoAduaneira = declaracaoAduaneira;
  }

  public DadosCarregamentoEntregaLotes declaracaoAduaneira(DeclaraoAduaneira declaracaoAduaneira) {
    this.declaracaoAduaneira = declaracaoAduaneira;
    return this;
  }

 /**
   * Lista de chaves das NFE que amparam o transporte.
   * @return listaNfe
  **/
  @JsonProperty("listaNfe")
  public List<DadosDaNotaFiscalEmbarqueDesembarque> getListaNfe() {
    return listaNfe;
  }

  public void setListaNfe(List<DadosDaNotaFiscalEmbarqueDesembarque> listaNfe) {
    this.listaNfe = listaNfe;
  }

  public DadosCarregamentoEntregaLotes listaNfe(List<DadosDaNotaFiscalEmbarqueDesembarque> listaNfe) {
    this.listaNfe = listaNfe;
    return this;
  }

  public DadosCarregamentoEntregaLotes addListaNfeItem(DadosDaNotaFiscalEmbarqueDesembarque listaNfeItem) {
    this.listaNfe.add(listaNfeItem);
    return this;
  }

 /**
   * Lista com os números dos lotes carregados e/ou entregues. Usar o mesmo número gerado no evento GERAÇÃO DE LOTES. Pode ser nulo quando o evento for de exclusão.
   * @return listaNumeroLote
  **/
  @JsonProperty("listaNumeroLote")
  @NotNull
  public List<DadosDaIdentificaoDoLote> getListaNumeroLote() {
    return listaNumeroLote;
  }

  public void setListaNumeroLote(List<DadosDaIdentificaoDoLote> listaNumeroLote) {
    this.listaNumeroLote = listaNumeroLote;
  }

  public DadosCarregamentoEntregaLotes listaNumeroLote(List<DadosDaIdentificaoDoLote> listaNumeroLote) {
    this.listaNumeroLote = listaNumeroLote;
    return this;
  }

  public DadosCarregamentoEntregaLotes addListaNumeroLoteItem(DadosDaIdentificaoDoLote listaNumeroLoteItem) {
    this.listaNumeroLote.add(listaNumeroLoteItem);
    return this;
  }

 /**
   * Indica que os volumes carregados em unidade de carga ou entregues foram objeto de destinação de mercadorias em perdimento&lt;br/&gt;Domínio:&lt;br/&gt;true - Sim&lt;br/&gt;false - Não
   * @return indicadorPerdimento
  **/
  @JsonProperty("indicadorPerdimento")
  public Boolean isIndicadorPerdimento() {
    return indicadorPerdimento;
  }

  public void setIndicadorPerdimento(Boolean indicadorPerdimento) {
    this.indicadorPerdimento = indicadorPerdimento;
  }

  public DadosCarregamentoEntregaLotes indicadorPerdimento(Boolean indicadorPerdimento) {
    this.indicadorPerdimento = indicadorPerdimento;
    return this;
  }

 /**
   * Identificação do documento ou termo que amparou o perdimento&lt;br/&gt;Tamanho: 100
   * @return identificacaoDocumentoPerdimento
  **/
  @JsonProperty("identificacaoDocumentoPerdimento")
  public String getIdentificacaoDocumentoPerdimento() {
    return identificacaoDocumentoPerdimento;
  }

  public void setIdentificacaoDocumentoPerdimento(String identificacaoDocumentoPerdimento) {
    this.identificacaoDocumentoPerdimento = identificacaoDocumentoPerdimento;
  }

  public DadosCarregamentoEntregaLotes identificacaoDocumentoPerdimento(String identificacaoDocumentoPerdimento) {
    this.identificacaoDocumentoPerdimento = identificacaoDocumentoPerdimento;
    return this;
  }

 /**
   * Quantidade de volumes carregados em unidade de carga ou entregues
   * @return quantidadeVolumesLote
  **/
  @JsonProperty("quantidadeVolumesLote")
  public BigDecimal getQuantidadeVolumesLote() {
    return quantidadeVolumesLote;
  }

  public void setQuantidadeVolumesLote(BigDecimal quantidadeVolumesLote) {
    this.quantidadeVolumesLote = quantidadeVolumesLote;
  }

  public DadosCarregamentoEntregaLotes quantidadeVolumesLote(BigDecimal quantidadeVolumesLote) {
    this.quantidadeVolumesLote = quantidadeVolumesLote;
    return this;
  }

 /**
   * Placa do semirreboque, vagão ou truck que carregou a carga.&lt;br/&gt;Tamanho: 50
   * @return placaSemirreboque
  **/
  @JsonProperty("placaSemirreboque")
  public String getPlacaSemirreboque() {
    return placaSemirreboque;
  }

  public void setPlacaSemirreboque(String placaSemirreboque) {
    this.placaSemirreboque = placaSemirreboque;
  }

  public DadosCarregamentoEntregaLotes placaSemirreboque(String placaSemirreboque) {
    this.placaSemirreboque = placaSemirreboque;
    return this;
  }

 /**
   * Identificação do número do contêiner em que os lotes foram carregados.&lt;br/&gt;Tamanho: 200
   * @return numeroConteiner
  **/
  @JsonProperty("numeroConteiner")
  public String getNumeroConteiner() {
    return numeroConteiner;
  }

  public void setNumeroConteiner(String numeroConteiner) {
    this.numeroConteiner = numeroConteiner;
  }

  public DadosCarregamentoEntregaLotes numeroConteiner(String numeroConteiner) {
    this.numeroConteiner = numeroConteiner;
    return this;
  }

 /**
   * Identificação da ULD em que os lotes foram carregados, no formato (TTTNNNNNPP) composta pelos seguintes atributos: Tipo de ULD (3 caracteres - TTT), Número da ULD (5 caracteres - NNNNN - Caso o número tenha menos que 5 caracteres, preencher à direita com o caracter especial \&quot;_\&quot;) e Código do proprietário da ULD (2 caracteres - PP).&lt;br/&gt;Tamanho: 10
   * @return identificacaoUld
  **/
  @JsonProperty("identificacaoUld")
  public String getIdentificacaoUld() {
    return identificacaoUld;
  }

  public void setIdentificacaoUld(String identificacaoUld) {
    this.identificacaoUld = identificacaoUld;
  }

  public DadosCarregamentoEntregaLotes identificacaoUld(String identificacaoUld) {
    this.identificacaoUld = identificacaoUld;
    return this;
  }

 /**
   * Entrega para companhia aérea. &lt;br/&gt;Indicador para os casos em que o recinto apenas entrega os lotes para companhia aérea.&lt;br/&gt;Domínio:&lt;br/&gt;true - Sim&lt;br/&gt;false - Não
   * @return entregaParaCompanhiaAerea
  **/
  @JsonProperty("entregaParaCompanhiaAerea")
  public Boolean isEntregaParaCompanhiaAerea() {
    return entregaParaCompanhiaAerea;
  }

  public void setEntregaParaCompanhiaAerea(Boolean entregaParaCompanhiaAerea) {
    this.entregaParaCompanhiaAerea = entregaParaCompanhiaAerea;
  }

  public DadosCarregamentoEntregaLotes entregaParaCompanhiaAerea(Boolean entregaParaCompanhiaAerea) {
    this.entregaParaCompanhiaAerea = entregaParaCompanhiaAerea;
    return this;
  }

 /**
   * CNPJ da companhia aérea para a qual o depositário entregou os lotes.&lt;br/&gt;Tamanho: 14&lt;br/&gt;Formato: &#39;NNNNNNNNNNNNNN&#39;
   * @return cnpjCompanhiaAerea
  **/
  @JsonProperty("cnpjCompanhiaAerea")
  public String getCnpjCompanhiaAerea() {
    return cnpjCompanhiaAerea;
  }

  public void setCnpjCompanhiaAerea(String cnpjCompanhiaAerea) {
    this.cnpjCompanhiaAerea = cnpjCompanhiaAerea;
  }

  public DadosCarregamentoEntregaLotes cnpjCompanhiaAerea(String cnpjCompanhiaAerea) {
    this.cnpjCompanhiaAerea = cnpjCompanhiaAerea;
    return this;
  }

 /**
   * Nome da companhia aérea para a qual o depositário entregou os lotes.&lt;br/&gt;Tamanho: 100
   * @return nomeCompanhiaAerea
  **/
  @JsonProperty("nomeCompanhiaAerea")
  public String getNomeCompanhiaAerea() {
    return nomeCompanhiaAerea;
  }

  public void setNomeCompanhiaAerea(String nomeCompanhiaAerea) {
    this.nomeCompanhiaAerea = nomeCompanhiaAerea;
  }

  public DadosCarregamentoEntregaLotes nomeCompanhiaAerea(String nomeCompanhiaAerea) {
    this.nomeCompanhiaAerea = nomeCompanhiaAerea;
    return this;
  }

 /**
   * IATA Aeronave&lt;br/&gt;Tamanho: 50
   * @return iataAeronave
  **/
  @JsonProperty("iataAeronave")
  public String getIataAeronave() {
    return iataAeronave;
  }

  public void setIataAeronave(String iataAeronave) {
    this.iataAeronave = iataAeronave;
  }

  public DadosCarregamentoEntregaLotes iataAeronave(String iataAeronave) {
    this.iataAeronave = iataAeronave;
    return this;
  }

 /**
   * Prefixo Aeronave&lt;br/&gt;Tamanho: 20
   * @return prefixoAeronave
  **/
  @JsonProperty("prefixoAeronave")
  public String getPrefixoAeronave() {
    return prefixoAeronave;
  }

  public void setPrefixoAeronave(String prefixoAeronave) {
    this.prefixoAeronave = prefixoAeronave;
  }

  public DadosCarregamentoEntregaLotes prefixoAeronave(String prefixoAeronave) {
    this.prefixoAeronave = prefixoAeronave;
    return this;
  }

 /**
   * Identificação da viagem.&lt;br/&gt;Tamanho: 20&lt;br/&gt;No aéreo a composição da viagem é: vôo + data da partida prevista + aeroporto da partida.No aquaviário também deve ser informado o campo viagem no formato disponível.
   * @return viagem
  **/
  @JsonProperty("viagem")
  public String getViagem() {
    return viagem;
  }

  public void setViagem(String viagem) {
    this.viagem = viagem;
  }

  public DadosCarregamentoEntregaLotes viagem(String viagem) {
    this.viagem = viagem;
    return this;
  }

 /**
   * Vôo&lt;br/&gt;Tamanho: 20
   * @return voo
  **/
  @JsonProperty("voo")
  public String getVoo() {
    return voo;
  }

  public void setVoo(String voo) {
    this.voo = voo;
  }

  public DadosCarregamentoEntregaLotes voo(String voo) {
    this.voo = voo;
    return this;
  }

 /**
   * Escala&lt;br/&gt;Tamanho: 20
   * @return escala
  **/
  @JsonProperty("escala")
  public String getEscala() {
    return escala;
  }

  public void setEscala(String escala) {
    this.escala = escala;
  }

  public DadosCarregamentoEntregaLotes escala(String escala) {
    this.escala = escala;
    return this;
  }

 /**
   * Indicador para os casos em que o recinto entrega os lotes em mãos para novo responsável pessoa física. Nessa situação não há veículo transportador.&lt;br/&gt;Domínio:&lt;br/&gt;true - Sim&lt;br/&gt;false - Não
   * @return entregaParaPessoaFisica
  **/
  @JsonProperty("entregaParaPessoaFisica")
  public Boolean isEntregaParaPessoaFisica() {
    return entregaParaPessoaFisica;
  }

  public void setEntregaParaPessoaFisica(Boolean entregaParaPessoaFisica) {
    this.entregaParaPessoaFisica = entregaParaPessoaFisica;
  }

  public DadosCarregamentoEntregaLotes entregaParaPessoaFisica(Boolean entregaParaPessoaFisica) {
    this.entregaParaPessoaFisica = entregaParaPessoaFisica;
    return this;
  }

 /**
   * CPF para os casos em que o recinto entrega os lotes em mãos para novo responsável pessoa física. Nessa situação não há veículo transportador.&lt;br/&gt;Tamanho: 11&lt;br/&gt;Formato: &#39;NNNNNNNNNNN&#39;
   * @return cpfRecepcao
  **/
  @JsonProperty("cpfRecepcao")
  public String getCpfRecepcao() {
    return cpfRecepcao;
  }

  public void setCpfRecepcao(String cpfRecepcao) {
    this.cpfRecepcao = cpfRecepcao;
  }

  public DadosCarregamentoEntregaLotes cpfRecepcao(String cpfRecepcao) {
    this.cpfRecepcao = cpfRecepcao;
    return this;
  }

 /**
   * Get documentoEstrangeiro
   * @return documentoEstrangeiro
  **/
  @JsonProperty("documentoEstrangeiro")
  public DadosDocumentoEstrangeiro getDocumentoEstrangeiro() {
    return documentoEstrangeiro;
  }

  public void setDocumentoEstrangeiro(DadosDocumentoEstrangeiro documentoEstrangeiro) {
    this.documentoEstrangeiro = documentoEstrangeiro;
  }

  public DadosCarregamentoEntregaLotes documentoEstrangeiro(DadosDocumentoEstrangeiro documentoEstrangeiro) {
    this.documentoEstrangeiro = documentoEstrangeiro;
    return this;
  }

 /**
   * Lista de identificação das câmeras. Usar o protocolo do evento de georreferenciamento para indicar, nesta lista, todas as câmeras que cobrem a área onde o lote foi carregado ou entregue para companhia aérea.
   * @return listaCameras
  **/
  @JsonProperty("listaCameras")
  public List<DadosDaCmera> getListaCameras() {
    return listaCameras;
  }

  public void setListaCameras(List<DadosDaCmera> listaCameras) {
    this.listaCameras = listaCameras;
  }

  public DadosCarregamentoEntregaLotes listaCameras(List<DadosDaCmera> listaCameras) {
    this.listaCameras = listaCameras;
    return this;
  }

  public DadosCarregamentoEntregaLotes addListaCamerasItem(DadosDaCmera listaCamerasItem) {
    this.listaCameras.add(listaCamerasItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DadosCarregamentoEntregaLotes {\n");
    
    sb.append("    tipoOperacao: ").append(toIndentedString(tipoOperacao)).append("\n");
    sb.append("    idEvento: ").append(toIndentedString(idEvento)).append("\n");
    sb.append("    dataHoraOcorrencia: ").append(toIndentedString(dataHoraOcorrencia)).append("\n");
    sb.append("    dataHoraRegistro: ").append(toIndentedString(dataHoraRegistro)).append("\n");
    sb.append("    cpfOperadorOcorrencia: ").append(toIndentedString(cpfOperadorOcorrencia)).append("\n");
    sb.append("    cpfOperadorRegistro: ").append(toIndentedString(cpfOperadorRegistro)).append("\n");
    sb.append("    protocoloEventoRetificadoOuExcluido: ").append(toIndentedString(protocoloEventoRetificadoOuExcluido)).append("\n");
    sb.append("    contingencia: ").append(toIndentedString(contingencia)).append("\n");
    sb.append("    codigoRecinto: ").append(toIndentedString(codigoRecinto)).append("\n");
    sb.append("    numeroManifesto: ").append(toIndentedString(numeroManifesto)).append("\n");
    sb.append("    tipoManifesto: ").append(toIndentedString(tipoManifesto)).append("\n");
    sb.append("    numeroConhecimentoMAWB: ").append(toIndentedString(numeroConhecimentoMAWB)).append("\n");
    sb.append("    numeroConhecimento: ").append(toIndentedString(numeroConhecimento)).append("\n");
    sb.append("    tipoConhecimento: ").append(toIndentedString(tipoConhecimento)).append("\n");
    sb.append("    declaracaoAduaneira: ").append(toIndentedString(declaracaoAduaneira)).append("\n");
    sb.append("    listaNfe: ").append(toIndentedString(listaNfe)).append("\n");
    sb.append("    listaNumeroLote: ").append(toIndentedString(listaNumeroLote)).append("\n");
    sb.append("    indicadorPerdimento: ").append(toIndentedString(indicadorPerdimento)).append("\n");
    sb.append("    identificacaoDocumentoPerdimento: ").append(toIndentedString(identificacaoDocumentoPerdimento)).append("\n");
    sb.append("    quantidadeVolumesLote: ").append(toIndentedString(quantidadeVolumesLote)).append("\n");
    sb.append("    placaSemirreboque: ").append(toIndentedString(placaSemirreboque)).append("\n");
    sb.append("    numeroConteiner: ").append(toIndentedString(numeroConteiner)).append("\n");
    sb.append("    identificacaoUld: ").append(toIndentedString(identificacaoUld)).append("\n");
    sb.append("    entregaParaCompanhiaAerea: ").append(toIndentedString(entregaParaCompanhiaAerea)).append("\n");
    sb.append("    cnpjCompanhiaAerea: ").append(toIndentedString(cnpjCompanhiaAerea)).append("\n");
    sb.append("    nomeCompanhiaAerea: ").append(toIndentedString(nomeCompanhiaAerea)).append("\n");
    sb.append("    iataAeronave: ").append(toIndentedString(iataAeronave)).append("\n");
    sb.append("    prefixoAeronave: ").append(toIndentedString(prefixoAeronave)).append("\n");
    sb.append("    viagem: ").append(toIndentedString(viagem)).append("\n");
    sb.append("    voo: ").append(toIndentedString(voo)).append("\n");
    sb.append("    escala: ").append(toIndentedString(escala)).append("\n");
    sb.append("    entregaParaPessoaFisica: ").append(toIndentedString(entregaParaPessoaFisica)).append("\n");
    sb.append("    cpfRecepcao: ").append(toIndentedString(cpfRecepcao)).append("\n");
    sb.append("    documentoEstrangeiro: ").append(toIndentedString(documentoEstrangeiro)).append("\n");
    sb.append("    listaCameras: ").append(toIndentedString(listaCameras)).append("\n");
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

