package br.gov.siscomex.portalunico.rcnt.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.*;
import java.math.BigDecimal;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "DadosEmbarqueDesembarqueNavio", propOrder =
    { "tipoOperacao", "idEvento", "dataHoraOcorrencia", "dataHoraRegistro", "cpfOperadorOcorrencia", "cpfOperadorRegistro", "protocoloEventoRetificadoOuExcluido", "contingencia", "codigoRecinto", "listaManifestos", "listaDeclaracaoAduaneira", "listaNfe", "embarqueDesembarque", "numeroConteiner", "tipoConteiner", "taraConteiner", "pesoBrutoManifesto", "pesoBrutoBalanca", "pesoArqueacao", "tipoGranel", "volume", "cargaSolta", "numeroLote", "listaVolumes", "listaChassi", "navio", "viagem", "escala", "listaPortoCarregamento", "listaPortoDescarregamento", "listaPaisDestinoFinalCarga", "posicaoNavio", "proximoNavio", "portainer", "listaCameras"
})

@XmlRootElement(name="DadosEmbarqueDesembarqueNavio")
public class DadosEmbarqueDesembarqueNavio  {
  

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

  @XmlElement(name="listaManifestos")
  @ApiModelProperty(value = "Lista de manifestos.")
  @Valid
 /**
   * Lista de manifestos.
  **/
  private List<DadosDoManisfestoDaCargaSimplificado> listaManifestos = null;

  @XmlElement(name="listaDeclaracaoAduaneira")
  @ApiModelProperty(value = "Lista de declarações aduaneiras associadas à carga.")
  @Valid
 /**
   * Lista de declarações aduaneiras associadas à carga.
  **/
  private List<DocumentoAduaneiro> listaDeclaracaoAduaneira = null;

  @XmlElement(name="listaNfe")
  @ApiModelProperty(value = "Lista de Notas Fiscais. Informar obrigatoriamente nos casos de Despachos a Posteriori.")
  @Valid
 /**
   * Lista de Notas Fiscais. Informar obrigatoriamente nos casos de Despachos a Posteriori.
  **/
  private List<DadosDaNotaFiscalEmbarqueDesembarque> listaNfe = null;


@XmlType(name="EmbarqueDesembarqueEnum")
@XmlEnum(String.class)
public enum EmbarqueDesembarqueEnum {

	@XmlEnumValue("'E'")
	@JsonProperty("'E'")
	E_(String.valueOf("'E'")),
	
	@XmlEnumValue("'D'")
	@JsonProperty("'D'")
	D_(String.valueOf("'D'"));


    private String value;

    EmbarqueDesembarqueEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static EmbarqueDesembarqueEnum fromValue(String v) {
        for (EmbarqueDesembarqueEnum b : EmbarqueDesembarqueEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to EmbarqueDesembarqueEnum");
    }
}

  @XmlElement(name="embarqueDesembarque", required = true)
  @ApiModelProperty(example = "E", required = true, value = "Tipo de evento: embarque ou desembarque. Pode ser nulo quando o evento for de exclusão.<br/>Domínio:<br/>E - Embarque<br/>D - Desembarque")
 /**
   * Tipo de evento: embarque ou desembarque. Pode ser nulo quando o evento for de exclusão.<br/>Domínio:<br/>E - Embarque<br/>D - Desembarque
  **/
  private EmbarqueDesembarqueEnum embarqueDesembarque = null;

  @XmlElement(name="numeroConteiner")
  @ApiModelProperty(value = "Identificação do número do contêiner.<br/>Tamanho: 200")
 /**
   * Identificação do número do contêiner.<br/>Tamanho: 200
  **/
  private String numeroConteiner = null;

  @XmlElement(name="tipoConteiner")
  @ApiModelProperty(example = "12U0", value = "Tipo de contêiner conforme tabela de domínio.<br/><a href=\"../pages/exemplos/rcnt/Tipo_Conteiner.pdf\" rel=\"noopener noreferrer\" target=\"_blank\"> Tipo_Conteiner.pdf </a>")
 /**
   * Tipo de contêiner conforme tabela de domínio.<br/><a href=\"../pages/exemplos/rcnt/Tipo_Conteiner.pdf\" rel=\"noopener noreferrer\" target=\"_blank\"> Tipo_Conteiner.pdf </a>
  **/
  private String tipoConteiner = null;

  @XmlElement(name="taraConteiner")
  @ApiModelProperty(example = "15.5", value = "Tara do contêiner (KG).<br/> Informar esse atributo nos casos em que a pesagem for efetuada em equipamentos de movimentação de Contêineres (Portainer, etc) no embarque/desembarque.<br/><br/>taraConteiner, até 4 casas decimais.")
  @Valid
 /**
   * Tara do contêiner (KG).<br/> Informar esse atributo nos casos em que a pesagem for efetuada em equipamentos de movimentação de Contêineres (Portainer, etc) no embarque/desembarque.<br/><br/>taraConteiner, até 4 casas decimais.
  **/
  private BigDecimal taraConteiner = null;

  @XmlElement(name="pesoBrutoManifesto")
  @ApiModelProperty(example = "15.5", value = "Peso bruto manifesto / VGM (Kg).<br/><br/>pesoBrutoManifesto, até 4 casas decimais.")
  @Valid
 /**
   * Peso bruto manifesto / VGM (Kg).<br/><br/>pesoBrutoManifesto, até 4 casas decimais.
  **/
  private BigDecimal pesoBrutoManifesto = null;

  @XmlElement(name="pesoBrutoBalanca")
  @ApiModelProperty(example = "15.5", value = "Peso da carga na balança (kg). Informar esse atributo nos casos em que a pesagem for efetuada em equipamentos de movimentação de Contêineres (Portainer, etc) no embarque/desembarque.No caso de granel informar um único evento de carregamento/descarregamento do navio com a soma das bateladas da balança de fluxo que compõe o peso total do granel embarcado ou desembarcado.<br/><br/>pesoBrutoBalanca, até 4 casas decimais.")
  @Valid
 /**
   * Peso da carga na balança (kg). Informar esse atributo nos casos em que a pesagem for efetuada em equipamentos de movimentação de Contêineres (Portainer, etc) no embarque/desembarque.No caso de granel informar um único evento de carregamento/descarregamento do navio com a soma das bateladas da balança de fluxo que compõe o peso total do granel embarcado ou desembarcado.<br/><br/>pesoBrutoBalanca, até 4 casas decimais.
  **/
  private BigDecimal pesoBrutoBalanca = null;

  @XmlElement(name="pesoArqueacao")
  @ApiModelProperty(example = "15.5", value = "Peso Arqueação (kg). Informar peso apurado em quantificação por arqueação de granéis. Observar que no caso de granel há um único evento de carregamento/descarregamento do navio.<br/><br/>pesoArqueacao, até 4 casas decimais.")
  @Valid
 /**
   * Peso Arqueação (kg). Informar peso apurado em quantificação por arqueação de granéis. Observar que no caso de granel há um único evento de carregamento/descarregamento do navio.<br/><br/>pesoArqueacao, até 4 casas decimais.
  **/
  private BigDecimal pesoArqueacao = null;


@XmlType(name="TipoGranelEnum")
@XmlEnum(String.class)
public enum TipoGranelEnum {

	@XmlEnumValue("'01'")
	@JsonProperty("'01'")
	_01_(String.valueOf("'01'")),
	
	@XmlEnumValue("'02'")
	@JsonProperty("'02'")
	_02_(String.valueOf("'02'")),
	
	@XmlEnumValue("'03'")
	@JsonProperty("'03'")
	_03_(String.valueOf("'03'")),
	
	@XmlEnumValue("'04'")
	@JsonProperty("'04'")
	_04_(String.valueOf("'04'")),
	
	@XmlEnumValue("'05'")
	@JsonProperty("'05'")
	_05_(String.valueOf("'05'")),
	
	@XmlEnumValue("'06'")
	@JsonProperty("'06'")
	_06_(String.valueOf("'06'")),
	
	@XmlEnumValue("'07'")
	@JsonProperty("'07'")
	_07_(String.valueOf("'07'")),
	
	@XmlEnumValue("'99'")
	@JsonProperty("'99'")
	_99_(String.valueOf("'99'"));


    private String value;

    TipoGranelEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TipoGranelEnum fromValue(String v) {
        for (TipoGranelEnum b : TipoGranelEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to TipoGranelEnum");
    }
}

  @XmlElement(name="tipoGranel")
  @ApiModelProperty(example = "01", value = "Tipo de granel conforme tabela de domínio.<br/>Domínio:<br/>01 - SÓLIDOS - MINÉRIOS<br/>02 - SÓLIDOS - GRÃOS<br/>03 - SÓLIDOS - FARELOS<br/>04 - SÓLIDOS - OUTROS<br/>05 - LÍQUIDOS - COMBUSTÍVEIS<br/>06 - LÍQUIDOS - OUTROS<br/>07 - GASOSOS<br/>99 - OUTROS<br/>")
 /**
   * Tipo de granel conforme tabela de domínio.<br/>Domínio:<br/>01 - SÓLIDOS - MINÉRIOS<br/>02 - SÓLIDOS - GRÃOS<br/>03 - SÓLIDOS - FARELOS<br/>04 - SÓLIDOS - OUTROS<br/>05 - LÍQUIDOS - COMBUSTÍVEIS<br/>06 - LÍQUIDOS - OUTROS<br/>07 - GASOSOS<br/>99 - OUTROS<br/>
  **/
  private TipoGranelEnum tipoGranel = null;

  @XmlElement(name="volume")
  @ApiModelProperty(example = "15.5", value = "Volume (metros cúbicos). Especificamente no caso de granel líquido ou gasoso.<br/><br/>volume, até 4 casas decimais.")
  @Valid
 /**
   * Volume (metros cúbicos). Especificamente no caso de granel líquido ou gasoso.<br/><br/>volume, até 4 casas decimais.
  **/
  private BigDecimal volume = null;

  @XmlElement(name="cargaSolta")
  @ApiModelProperty(example = "false", value = "Indicador de carga solta.<br/>Domínio:<br/>true - Sim<br/>false - Não")
 /**
   * Indicador de carga solta.<br/>Domínio:<br/>true - Sim<br/>false - Não
  **/
  private Boolean cargaSolta = null;

  @XmlElement(name="numeroLote")
  @ApiModelProperty(value = "<br/>Número de Lote. Usar o mesmo número gerado no evento GERAÇÃO DE LOTES.<br/>Esse número será informado somente nos casos de carregamento de lote diretamente em navio, ou seja, sem unidade de carga (contêiner). <br/>Por exemplo: carga solta. <br/>Tamanho: 100")
 /**
   * <br/>Número de Lote. Usar o mesmo número gerado no evento GERAÇÃO DE LOTES.<br/>Esse número será informado somente nos casos de carregamento de lote diretamente em navio, ou seja, sem unidade de carga (contêiner). <br/>Por exemplo: carga solta. <br/>Tamanho: 100
  **/
  private String numeroLote = null;

  @XmlElement(name="listaVolumes")
  @ApiModelProperty(value = "Informar no caso de carregamento de carga solta em que não houve Geração de Lotes ou nos casos de descarregamento de carga solta.")
  @Valid
 /**
   * Informar no caso de carregamento de carga solta em que não houve Geração de Lotes ou nos casos de descarregamento de carga solta.
  **/
  private List<DadosVolumeVerificado> listaVolumes = null;

  @XmlElement(name="listaChassi")
  @ApiModelProperty(value = "Lista de Chassis. Informar todos os chassis das mercadorias, inclusive o tipo meios próprios (Impo/Expo ônibus, cavalo-trator, semirreboque...)")
  @Valid
 /**
   * Lista de Chassis. Informar todos os chassis das mercadorias, inclusive o tipo meios próprios (Impo/Expo ônibus, cavalo-trator, semirreboque...)
  **/
  private List<DadosDoChassi> listaChassi = null;

  @XmlElement(name="navio")
  @ApiModelProperty(value = "")
  @Valid
  private DadosNavio navio = null;

  @XmlElement(name="viagem")
  @ApiModelProperty(value = "Viagem<br/>Tamanho: 20")
 /**
   * Viagem<br/>Tamanho: 20
  **/
  private String viagem = null;

  @XmlElement(name="escala")
  @ApiModelProperty(value = "Escala<br/>Tamanho: 20")
 /**
   * Escala<br/>Tamanho: 20
  **/
  private String escala = null;

  @XmlElement(name="listaPortoCarregamento")
  @ApiModelProperty(value = "Lista de portos de carregamento conforme tabela de domínio. No caso de desembarque da carga, indicar o porto em que a carga foi carregada. ")
  @Valid
 /**
   * Lista de portos de carregamento conforme tabela de domínio. No caso de desembarque da carga, indicar o porto em que a carga foi carregada. 
  **/
  private List<DadosDoPorto> listaPortoCarregamento = null;

  @XmlElement(name="listaPortoDescarregamento")
  @ApiModelProperty(value = "Lista de portos de descarregamento conforme tabela de domínio. No caso de embarque, indicar o porto previsto para descarregamento.")
  @Valid
 /**
   * Lista de portos de descarregamento conforme tabela de domínio. No caso de embarque, indicar o porto previsto para descarregamento.
  **/
  private List<DadosDoPorto> listaPortoDescarregamento = null;

  @XmlElement(name="listaPaisDestinoFinalCarga")
  @ApiModelProperty(value = "Lista de países de destino final da carga conforme tabela de domínio.")
  @Valid
 /**
   * Lista de países de destino final da carga conforme tabela de domínio.
  **/
  private List<DadosDoPais> listaPaisDestinoFinalCarga = null;

  @XmlElement(name="posicaoNavio")
  @ApiModelProperty(value = "Posição do contêiner ou volume dentro do navio.<br/>Tamanho: 20")
 /**
   * Posição do contêiner ou volume dentro do navio.<br/>Tamanho: 20
  **/
  private String posicaoNavio = null;

  @XmlElement(name="proximoNavio")
  @ApiModelProperty(value = "")
  @Valid
  private DadosPrximoNavio proximoNavio = null;

  @XmlElement(name="portainer")
  @ApiModelProperty(example = "66d24eb1-6ac9-4798-bc93-f4c66eb6fa9b", value = "Identificação do portainer ou outro equipamento do recinto utilizado no embarque ou desembarque.<br/>No caso de uso de equipamento do navio ou elemento móvel, não informar. Usar o protocolo do evento de georreferenciamento. <br/><br/>Tamanho: 36")
 /**
   * Identificação do portainer ou outro equipamento do recinto utilizado no embarque ou desembarque.<br/>No caso de uso de equipamento do navio ou elemento móvel, não informar. Usar o protocolo do evento de georreferenciamento. <br/><br/>Tamanho: 36
  **/
  private String portainer = null;

  @XmlElement(name="listaCameras")
  @ApiModelProperty(value = "Lista de identificação das câmeras. Usar o protocolo do evento de georreferenciamento para indicar, nesta lista, todas as câmeras que cobrem a área onde ocorreu a operação da embarcação (cais).")
  @Valid
 /**
   * Lista de identificação das câmeras. Usar o protocolo do evento de georreferenciamento para indicar, nesta lista, todas as câmeras que cobrem a área onde ocorreu a operação da embarcação (cais).
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

  public DadosEmbarqueDesembarqueNavio tipoOperacao(TipoOperacaoEnum tipoOperacao) {
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

  public DadosEmbarqueDesembarqueNavio idEvento(String idEvento) {
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

  public DadosEmbarqueDesembarqueNavio dataHoraOcorrencia(String dataHoraOcorrencia) {
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

  public DadosEmbarqueDesembarqueNavio dataHoraRegistro(String dataHoraRegistro) {
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

  public DadosEmbarqueDesembarqueNavio cpfOperadorOcorrencia(String cpfOperadorOcorrencia) {
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

  public DadosEmbarqueDesembarqueNavio cpfOperadorRegistro(String cpfOperadorRegistro) {
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

  public DadosEmbarqueDesembarqueNavio protocoloEventoRetificadoOuExcluido(String protocoloEventoRetificadoOuExcluido) {
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

  public DadosEmbarqueDesembarqueNavio contingencia(Boolean contingencia) {
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

  public DadosEmbarqueDesembarqueNavio codigoRecinto(String codigoRecinto) {
    this.codigoRecinto = codigoRecinto;
    return this;
  }

 /**
   * Lista de manifestos.
   * @return listaManifestos
  **/
  @JsonProperty("listaManifestos")
  public List<DadosDoManisfestoDaCargaSimplificado> getListaManifestos() {
    return listaManifestos;
  }

  public void setListaManifestos(List<DadosDoManisfestoDaCargaSimplificado> listaManifestos) {
    this.listaManifestos = listaManifestos;
  }

  public DadosEmbarqueDesembarqueNavio listaManifestos(List<DadosDoManisfestoDaCargaSimplificado> listaManifestos) {
    this.listaManifestos = listaManifestos;
    return this;
  }

  public DadosEmbarqueDesembarqueNavio addListaManifestosItem(DadosDoManisfestoDaCargaSimplificado listaManifestosItem) {
    this.listaManifestos.add(listaManifestosItem);
    return this;
  }

 /**
   * Lista de declarações aduaneiras associadas à carga.
   * @return listaDeclaracaoAduaneira
  **/
  @JsonProperty("listaDeclaracaoAduaneira")
  public List<DocumentoAduaneiro> getListaDeclaracaoAduaneira() {
    return listaDeclaracaoAduaneira;
  }

  public void setListaDeclaracaoAduaneira(List<DocumentoAduaneiro> listaDeclaracaoAduaneira) {
    this.listaDeclaracaoAduaneira = listaDeclaracaoAduaneira;
  }

  public DadosEmbarqueDesembarqueNavio listaDeclaracaoAduaneira(List<DocumentoAduaneiro> listaDeclaracaoAduaneira) {
    this.listaDeclaracaoAduaneira = listaDeclaracaoAduaneira;
    return this;
  }

  public DadosEmbarqueDesembarqueNavio addListaDeclaracaoAduaneiraItem(DocumentoAduaneiro listaDeclaracaoAduaneiraItem) {
    this.listaDeclaracaoAduaneira.add(listaDeclaracaoAduaneiraItem);
    return this;
  }

 /**
   * Lista de Notas Fiscais. Informar obrigatoriamente nos casos de Despachos a Posteriori.
   * @return listaNfe
  **/
  @JsonProperty("listaNfe")
  public List<DadosDaNotaFiscalEmbarqueDesembarque> getListaNfe() {
    return listaNfe;
  }

  public void setListaNfe(List<DadosDaNotaFiscalEmbarqueDesembarque> listaNfe) {
    this.listaNfe = listaNfe;
  }

  public DadosEmbarqueDesembarqueNavio listaNfe(List<DadosDaNotaFiscalEmbarqueDesembarque> listaNfe) {
    this.listaNfe = listaNfe;
    return this;
  }

  public DadosEmbarqueDesembarqueNavio addListaNfeItem(DadosDaNotaFiscalEmbarqueDesembarque listaNfeItem) {
    this.listaNfe.add(listaNfeItem);
    return this;
  }

 /**
   * Tipo de evento: embarque ou desembarque. Pode ser nulo quando o evento for de exclusão.&lt;br/&gt;Domínio:&lt;br/&gt;E - Embarque&lt;br/&gt;D - Desembarque
   * @return embarqueDesembarque
  **/
  @JsonProperty("embarqueDesembarque")
  @NotNull
  public String getEmbarqueDesembarque() {
    if (embarqueDesembarque == null) {
      return null;
    }
    return embarqueDesembarque.value();
  }

  public void setEmbarqueDesembarque(EmbarqueDesembarqueEnum embarqueDesembarque) {
    this.embarqueDesembarque = embarqueDesembarque;
  }

  public DadosEmbarqueDesembarqueNavio embarqueDesembarque(EmbarqueDesembarqueEnum embarqueDesembarque) {
    this.embarqueDesembarque = embarqueDesembarque;
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

  public DadosEmbarqueDesembarqueNavio numeroConteiner(String numeroConteiner) {
    this.numeroConteiner = numeroConteiner;
    return this;
  }

 /**
   * Tipo de contêiner conforme tabela de domínio.&lt;br/&gt;&lt;a href&#x3D;\&quot;../pages/exemplos/rcnt/Tipo_Conteiner.pdf\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot; target&#x3D;\&quot;_blank\&quot;&gt; Tipo_Conteiner.pdf &lt;/a&gt;
   * @return tipoConteiner
  **/
  @JsonProperty("tipoConteiner")
  public String getTipoConteiner() {
    return tipoConteiner;
  }

  public void setTipoConteiner(String tipoConteiner) {
    this.tipoConteiner = tipoConteiner;
  }

  public DadosEmbarqueDesembarqueNavio tipoConteiner(String tipoConteiner) {
    this.tipoConteiner = tipoConteiner;
    return this;
  }

 /**
   * Tara do contêiner (KG).&lt;br/&gt; Informar esse atributo nos casos em que a pesagem for efetuada em equipamentos de movimentação de Contêineres (Portainer, etc) no embarque/desembarque.&lt;br/&gt;&lt;br/&gt;taraConteiner, até 4 casas decimais.
   * @return taraConteiner
  **/
  @JsonProperty("taraConteiner")
  public BigDecimal getTaraConteiner() {
    return taraConteiner;
  }

  public void setTaraConteiner(BigDecimal taraConteiner) {
    this.taraConteiner = taraConteiner;
  }

  public DadosEmbarqueDesembarqueNavio taraConteiner(BigDecimal taraConteiner) {
    this.taraConteiner = taraConteiner;
    return this;
  }

 /**
   * Peso bruto manifesto / VGM (Kg).&lt;br/&gt;&lt;br/&gt;pesoBrutoManifesto, até 4 casas decimais.
   * @return pesoBrutoManifesto
  **/
  @JsonProperty("pesoBrutoManifesto")
  public BigDecimal getPesoBrutoManifesto() {
    return pesoBrutoManifesto;
  }

  public void setPesoBrutoManifesto(BigDecimal pesoBrutoManifesto) {
    this.pesoBrutoManifesto = pesoBrutoManifesto;
  }

  public DadosEmbarqueDesembarqueNavio pesoBrutoManifesto(BigDecimal pesoBrutoManifesto) {
    this.pesoBrutoManifesto = pesoBrutoManifesto;
    return this;
  }

 /**
   * Peso da carga na balança (kg). Informar esse atributo nos casos em que a pesagem for efetuada em equipamentos de movimentação de Contêineres (Portainer, etc) no embarque/desembarque.No caso de granel informar um único evento de carregamento/descarregamento do navio com a soma das bateladas da balança de fluxo que compõe o peso total do granel embarcado ou desembarcado.&lt;br/&gt;&lt;br/&gt;pesoBrutoBalanca, até 4 casas decimais.
   * @return pesoBrutoBalanca
  **/
  @JsonProperty("pesoBrutoBalanca")
  public BigDecimal getPesoBrutoBalanca() {
    return pesoBrutoBalanca;
  }

  public void setPesoBrutoBalanca(BigDecimal pesoBrutoBalanca) {
    this.pesoBrutoBalanca = pesoBrutoBalanca;
  }

  public DadosEmbarqueDesembarqueNavio pesoBrutoBalanca(BigDecimal pesoBrutoBalanca) {
    this.pesoBrutoBalanca = pesoBrutoBalanca;
    return this;
  }

 /**
   * Peso Arqueação (kg). Informar peso apurado em quantificação por arqueação de granéis. Observar que no caso de granel há um único evento de carregamento/descarregamento do navio.&lt;br/&gt;&lt;br/&gt;pesoArqueacao, até 4 casas decimais.
   * @return pesoArqueacao
  **/
  @JsonProperty("pesoArqueacao")
  public BigDecimal getPesoArqueacao() {
    return pesoArqueacao;
  }

  public void setPesoArqueacao(BigDecimal pesoArqueacao) {
    this.pesoArqueacao = pesoArqueacao;
  }

  public DadosEmbarqueDesembarqueNavio pesoArqueacao(BigDecimal pesoArqueacao) {
    this.pesoArqueacao = pesoArqueacao;
    return this;
  }

 /**
   * Tipo de granel conforme tabela de domínio.&lt;br/&gt;Domínio:&lt;br/&gt;01 - SÓLIDOS - MINÉRIOS&lt;br/&gt;02 - SÓLIDOS - GRÃOS&lt;br/&gt;03 - SÓLIDOS - FARELOS&lt;br/&gt;04 - SÓLIDOS - OUTROS&lt;br/&gt;05 - LÍQUIDOS - COMBUSTÍVEIS&lt;br/&gt;06 - LÍQUIDOS - OUTROS&lt;br/&gt;07 - GASOSOS&lt;br/&gt;99 - OUTROS&lt;br/&gt;
   * @return tipoGranel
  **/
  @JsonProperty("tipoGranel")
  public String getTipoGranel() {
    if (tipoGranel == null) {
      return null;
    }
    return tipoGranel.value();
  }

  public void setTipoGranel(TipoGranelEnum tipoGranel) {
    this.tipoGranel = tipoGranel;
  }

  public DadosEmbarqueDesembarqueNavio tipoGranel(TipoGranelEnum tipoGranel) {
    this.tipoGranel = tipoGranel;
    return this;
  }

 /**
   * Volume (metros cúbicos). Especificamente no caso de granel líquido ou gasoso.&lt;br/&gt;&lt;br/&gt;volume, até 4 casas decimais.
   * @return volume
  **/
  @JsonProperty("volume")
  public BigDecimal getVolume() {
    return volume;
  }

  public void setVolume(BigDecimal volume) {
    this.volume = volume;
  }

  public DadosEmbarqueDesembarqueNavio volume(BigDecimal volume) {
    this.volume = volume;
    return this;
  }

 /**
   * Indicador de carga solta.&lt;br/&gt;Domínio:&lt;br/&gt;true - Sim&lt;br/&gt;false - Não
   * @return cargaSolta
  **/
  @JsonProperty("cargaSolta")
  public Boolean isCargaSolta() {
    return cargaSolta;
  }

  public void setCargaSolta(Boolean cargaSolta) {
    this.cargaSolta = cargaSolta;
  }

  public DadosEmbarqueDesembarqueNavio cargaSolta(Boolean cargaSolta) {
    this.cargaSolta = cargaSolta;
    return this;
  }

 /**
   * &lt;br/&gt;Número de Lote. Usar o mesmo número gerado no evento GERAÇÃO DE LOTES.&lt;br/&gt;Esse número será informado somente nos casos de carregamento de lote diretamente em navio, ou seja, sem unidade de carga (contêiner). &lt;br/&gt;Por exemplo: carga solta. &lt;br/&gt;Tamanho: 100
   * @return numeroLote
  **/
  @JsonProperty("numeroLote")
  public String getNumeroLote() {
    return numeroLote;
  }

  public void setNumeroLote(String numeroLote) {
    this.numeroLote = numeroLote;
  }

  public DadosEmbarqueDesembarqueNavio numeroLote(String numeroLote) {
    this.numeroLote = numeroLote;
    return this;
  }

 /**
   * Informar no caso de carregamento de carga solta em que não houve Geração de Lotes ou nos casos de descarregamento de carga solta.
   * @return listaVolumes
  **/
  @JsonProperty("listaVolumes")
  public List<DadosVolumeVerificado> getListaVolumes() {
    return listaVolumes;
  }

  public void setListaVolumes(List<DadosVolumeVerificado> listaVolumes) {
    this.listaVolumes = listaVolumes;
  }

  public DadosEmbarqueDesembarqueNavio listaVolumes(List<DadosVolumeVerificado> listaVolumes) {
    this.listaVolumes = listaVolumes;
    return this;
  }

  public DadosEmbarqueDesembarqueNavio addListaVolumesItem(DadosVolumeVerificado listaVolumesItem) {
    this.listaVolumes.add(listaVolumesItem);
    return this;
  }

 /**
   * Lista de Chassis. Informar todos os chassis das mercadorias, inclusive o tipo meios próprios (Impo/Expo ônibus, cavalo-trator, semirreboque...)
   * @return listaChassi
  **/
  @JsonProperty("listaChassi")
  public List<DadosDoChassi> getListaChassi() {
    return listaChassi;
  }

  public void setListaChassi(List<DadosDoChassi> listaChassi) {
    this.listaChassi = listaChassi;
  }

  public DadosEmbarqueDesembarqueNavio listaChassi(List<DadosDoChassi> listaChassi) {
    this.listaChassi = listaChassi;
    return this;
  }

  public DadosEmbarqueDesembarqueNavio addListaChassiItem(DadosDoChassi listaChassiItem) {
    this.listaChassi.add(listaChassiItem);
    return this;
  }

 /**
   * Get navio
   * @return navio
  **/
  @JsonProperty("navio")
  public DadosNavio getNavio() {
    return navio;
  }

  public void setNavio(DadosNavio navio) {
    this.navio = navio;
  }

  public DadosEmbarqueDesembarqueNavio navio(DadosNavio navio) {
    this.navio = navio;
    return this;
  }

 /**
   * Viagem&lt;br/&gt;Tamanho: 20
   * @return viagem
  **/
  @JsonProperty("viagem")
  public String getViagem() {
    return viagem;
  }

  public void setViagem(String viagem) {
    this.viagem = viagem;
  }

  public DadosEmbarqueDesembarqueNavio viagem(String viagem) {
    this.viagem = viagem;
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

  public DadosEmbarqueDesembarqueNavio escala(String escala) {
    this.escala = escala;
    return this;
  }

 /**
   * Lista de portos de carregamento conforme tabela de domínio. No caso de desembarque da carga, indicar o porto em que a carga foi carregada. 
   * @return listaPortoCarregamento
  **/
  @JsonProperty("listaPortoCarregamento")
  public List<DadosDoPorto> getListaPortoCarregamento() {
    return listaPortoCarregamento;
  }

  public void setListaPortoCarregamento(List<DadosDoPorto> listaPortoCarregamento) {
    this.listaPortoCarregamento = listaPortoCarregamento;
  }

  public DadosEmbarqueDesembarqueNavio listaPortoCarregamento(List<DadosDoPorto> listaPortoCarregamento) {
    this.listaPortoCarregamento = listaPortoCarregamento;
    return this;
  }

  public DadosEmbarqueDesembarqueNavio addListaPortoCarregamentoItem(DadosDoPorto listaPortoCarregamentoItem) {
    this.listaPortoCarregamento.add(listaPortoCarregamentoItem);
    return this;
  }

 /**
   * Lista de portos de descarregamento conforme tabela de domínio. No caso de embarque, indicar o porto previsto para descarregamento.
   * @return listaPortoDescarregamento
  **/
  @JsonProperty("listaPortoDescarregamento")
  public List<DadosDoPorto> getListaPortoDescarregamento() {
    return listaPortoDescarregamento;
  }

  public void setListaPortoDescarregamento(List<DadosDoPorto> listaPortoDescarregamento) {
    this.listaPortoDescarregamento = listaPortoDescarregamento;
  }

  public DadosEmbarqueDesembarqueNavio listaPortoDescarregamento(List<DadosDoPorto> listaPortoDescarregamento) {
    this.listaPortoDescarregamento = listaPortoDescarregamento;
    return this;
  }

  public DadosEmbarqueDesembarqueNavio addListaPortoDescarregamentoItem(DadosDoPorto listaPortoDescarregamentoItem) {
    this.listaPortoDescarregamento.add(listaPortoDescarregamentoItem);
    return this;
  }

 /**
   * Lista de países de destino final da carga conforme tabela de domínio.
   * @return listaPaisDestinoFinalCarga
  **/
  @JsonProperty("listaPaisDestinoFinalCarga")
  public List<DadosDoPais> getListaPaisDestinoFinalCarga() {
    return listaPaisDestinoFinalCarga;
  }

  public void setListaPaisDestinoFinalCarga(List<DadosDoPais> listaPaisDestinoFinalCarga) {
    this.listaPaisDestinoFinalCarga = listaPaisDestinoFinalCarga;
  }

  public DadosEmbarqueDesembarqueNavio listaPaisDestinoFinalCarga(List<DadosDoPais> listaPaisDestinoFinalCarga) {
    this.listaPaisDestinoFinalCarga = listaPaisDestinoFinalCarga;
    return this;
  }

  public DadosEmbarqueDesembarqueNavio addListaPaisDestinoFinalCargaItem(DadosDoPais listaPaisDestinoFinalCargaItem) {
    this.listaPaisDestinoFinalCarga.add(listaPaisDestinoFinalCargaItem);
    return this;
  }

 /**
   * Posição do contêiner ou volume dentro do navio.&lt;br/&gt;Tamanho: 20
   * @return posicaoNavio
  **/
  @JsonProperty("posicaoNavio")
  public String getPosicaoNavio() {
    return posicaoNavio;
  }

  public void setPosicaoNavio(String posicaoNavio) {
    this.posicaoNavio = posicaoNavio;
  }

  public DadosEmbarqueDesembarqueNavio posicaoNavio(String posicaoNavio) {
    this.posicaoNavio = posicaoNavio;
    return this;
  }

 /**
   * Get proximoNavio
   * @return proximoNavio
  **/
  @JsonProperty("proximoNavio")
  public DadosPrximoNavio getProximoNavio() {
    return proximoNavio;
  }

  public void setProximoNavio(DadosPrximoNavio proximoNavio) {
    this.proximoNavio = proximoNavio;
  }

  public DadosEmbarqueDesembarqueNavio proximoNavio(DadosPrximoNavio proximoNavio) {
    this.proximoNavio = proximoNavio;
    return this;
  }

 /**
   * Identificação do portainer ou outro equipamento do recinto utilizado no embarque ou desembarque.&lt;br/&gt;No caso de uso de equipamento do navio ou elemento móvel, não informar. Usar o protocolo do evento de georreferenciamento. &lt;br/&gt;&lt;br/&gt;Tamanho: 36
   * @return portainer
  **/
  @JsonProperty("portainer")
  public String getPortainer() {
    return portainer;
  }

  public void setPortainer(String portainer) {
    this.portainer = portainer;
  }

  public DadosEmbarqueDesembarqueNavio portainer(String portainer) {
    this.portainer = portainer;
    return this;
  }

 /**
   * Lista de identificação das câmeras. Usar o protocolo do evento de georreferenciamento para indicar, nesta lista, todas as câmeras que cobrem a área onde ocorreu a operação da embarcação (cais).
   * @return listaCameras
  **/
  @JsonProperty("listaCameras")
  public List<DadosDaCmera> getListaCameras() {
    return listaCameras;
  }

  public void setListaCameras(List<DadosDaCmera> listaCameras) {
    this.listaCameras = listaCameras;
  }

  public DadosEmbarqueDesembarqueNavio listaCameras(List<DadosDaCmera> listaCameras) {
    this.listaCameras = listaCameras;
    return this;
  }

  public DadosEmbarqueDesembarqueNavio addListaCamerasItem(DadosDaCmera listaCamerasItem) {
    this.listaCameras.add(listaCamerasItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DadosEmbarqueDesembarqueNavio {\n");
    
    sb.append("    tipoOperacao: ").append(toIndentedString(tipoOperacao)).append("\n");
    sb.append("    idEvento: ").append(toIndentedString(idEvento)).append("\n");
    sb.append("    dataHoraOcorrencia: ").append(toIndentedString(dataHoraOcorrencia)).append("\n");
    sb.append("    dataHoraRegistro: ").append(toIndentedString(dataHoraRegistro)).append("\n");
    sb.append("    cpfOperadorOcorrencia: ").append(toIndentedString(cpfOperadorOcorrencia)).append("\n");
    sb.append("    cpfOperadorRegistro: ").append(toIndentedString(cpfOperadorRegistro)).append("\n");
    sb.append("    protocoloEventoRetificadoOuExcluido: ").append(toIndentedString(protocoloEventoRetificadoOuExcluido)).append("\n");
    sb.append("    contingencia: ").append(toIndentedString(contingencia)).append("\n");
    sb.append("    codigoRecinto: ").append(toIndentedString(codigoRecinto)).append("\n");
    sb.append("    listaManifestos: ").append(toIndentedString(listaManifestos)).append("\n");
    sb.append("    listaDeclaracaoAduaneira: ").append(toIndentedString(listaDeclaracaoAduaneira)).append("\n");
    sb.append("    listaNfe: ").append(toIndentedString(listaNfe)).append("\n");
    sb.append("    embarqueDesembarque: ").append(toIndentedString(embarqueDesembarque)).append("\n");
    sb.append("    numeroConteiner: ").append(toIndentedString(numeroConteiner)).append("\n");
    sb.append("    tipoConteiner: ").append(toIndentedString(tipoConteiner)).append("\n");
    sb.append("    taraConteiner: ").append(toIndentedString(taraConteiner)).append("\n");
    sb.append("    pesoBrutoManifesto: ").append(toIndentedString(pesoBrutoManifesto)).append("\n");
    sb.append("    pesoBrutoBalanca: ").append(toIndentedString(pesoBrutoBalanca)).append("\n");
    sb.append("    pesoArqueacao: ").append(toIndentedString(pesoArqueacao)).append("\n");
    sb.append("    tipoGranel: ").append(toIndentedString(tipoGranel)).append("\n");
    sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
    sb.append("    cargaSolta: ").append(toIndentedString(cargaSolta)).append("\n");
    sb.append("    numeroLote: ").append(toIndentedString(numeroLote)).append("\n");
    sb.append("    listaVolumes: ").append(toIndentedString(listaVolumes)).append("\n");
    sb.append("    listaChassi: ").append(toIndentedString(listaChassi)).append("\n");
    sb.append("    navio: ").append(toIndentedString(navio)).append("\n");
    sb.append("    viagem: ").append(toIndentedString(viagem)).append("\n");
    sb.append("    escala: ").append(toIndentedString(escala)).append("\n");
    sb.append("    listaPortoCarregamento: ").append(toIndentedString(listaPortoCarregamento)).append("\n");
    sb.append("    listaPortoDescarregamento: ").append(toIndentedString(listaPortoDescarregamento)).append("\n");
    sb.append("    listaPaisDestinoFinalCarga: ").append(toIndentedString(listaPaisDestinoFinalCarga)).append("\n");
    sb.append("    posicaoNavio: ").append(toIndentedString(posicaoNavio)).append("\n");
    sb.append("    proximoNavio: ").append(toIndentedString(proximoNavio)).append("\n");
    sb.append("    portainer: ").append(toIndentedString(portainer)).append("\n");
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

