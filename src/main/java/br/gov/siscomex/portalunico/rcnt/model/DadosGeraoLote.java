package br.gov.siscomex.portalunico.rcnt.model;

import br.gov.siscomex.portalunico.rcnt.model.DadosDaCmera;
import br.gov.siscomex.portalunico.rcnt.model.DadosDaMercadoriaPerigosa;
import br.gov.siscomex.portalunico.rcnt.model.DadosDaNotaFiscalEmbarqueDesembarque;
import br.gov.siscomex.portalunico.rcnt.model.DadosDoChassi;
import br.gov.siscomex.portalunico.rcnt.model.DadosLote;
import br.gov.siscomex.portalunico.rcnt.model.DadosNavio;
import br.gov.siscomex.portalunico.rcnt.model.DadosVolumeManifestado;
import br.gov.siscomex.portalunico.rcnt.model.DeclaraoAduaneira;
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
 @XmlType(name = "DadosGeraoLote", propOrder =
    { "tipoOperacao", "idEvento", "dataHoraOcorrencia", "dataHoraRegistro", "cpfOperadorOcorrencia", "cpfOperadorRegistro", "protocoloEventoRetificadoOuExcluido", "contingencia", "codigoRecinto", "numeroManifesto", "tipoManifesto", "numeroConhecimentoMAWB", "numeroConhecimento", "tipoConhecimento", "numeroRUC", "declaracaoAduaneira", "listaNfe", "cnpjResponsavelAnterior", "codigoRecintoOrigem", "pesoManifesto", "listaVolumesManifesto", "numeroConteiner", "identificacaoUld", "listaChassi", "navio", "iataAeronave", "prefixoAeronave", "viagem", "escala", "aeroportoOrigem", "placaSemirreboque", "listaMercadoriaPerigosa", "perecivel", "cargaSolta", "indicadorDeRemessaInternacional", "listaCameras", "observacaoRecepcao", "lotes"
})

@XmlRootElement(name="DadosGeraoLote")
public class DadosGeraoLote  {
  

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
  @ApiModelProperty(example = "131805000071025", value = "Identificação do conhecimento de carga ou do DSIC. <br/>No modal aéreo, na importação, deve ser preenchido quando se tratar de AWB direto, ou HAWB, ou DSIC. <br/>No modal aéreo, na exportação, não deve ser preenchido.  <br/>No aquaviário deve ser preenchido com CE Mercante na importação e na exportação com o conhecimento internacional ou, quando ainda não emitido, com o CT-e que amparou a chegada da carga.<br/>Tamanho: 100")
 /**
   * Identificação do conhecimento de carga ou do DSIC. <br/>No modal aéreo, na importação, deve ser preenchido quando se tratar de AWB direto, ou HAWB, ou DSIC. <br/>No modal aéreo, na exportação, não deve ser preenchido.  <br/>No aquaviário deve ser preenchido com CE Mercante na importação e na exportação com o conhecimento internacional ou, quando ainda não emitido, com o CT-e que amparou a chegada da carga.<br/>Tamanho: 100
  **/
  private String numeroConhecimento = null;

  @XmlElement(name="tipoConhecimento")
  @ApiModelProperty(example = "AWB", value = "Conforme tabela de domínio Tipo de Conhecimento disponível no <a href=https://portalunico.siscomex.gov.br/tabx/#/tabelas rel=\"noopener noreferrer\" target=\"_blank\">Portal Único Siscomex.</a>")
 /**
   * Conforme tabela de domínio Tipo de Conhecimento disponível no <a href=https://portalunico.siscomex.gov.br/tabx/#/tabelas rel=\"noopener noreferrer\" target=\"_blank\">Portal Único Siscomex.</a>
  **/
  private String tipoConhecimento = null;

  @XmlElement(name="numeroRUC")
  @ApiModelProperty(value = "Número da RUC (Referência Única da Carga) / UCR (Unique Consignment Reference).<br/>Tamanho: 35")
 /**
   * Número da RUC (Referência Única da Carga) / UCR (Unique Consignment Reference).<br/>Tamanho: 35
  **/
  private String numeroRUC = null;

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

  @XmlElement(name="cnpjResponsavelAnterior")
  @ApiModelProperty(example = "44444444444444", value = "CNPJ do responsável pela carga anteriormente à troca de responsabilidade para o depositário.<br/>Tamanho: 14<br/>Formato: 'NNNNNNNNNNNNNN'")
 /**
   * CNPJ do responsável pela carga anteriormente à troca de responsabilidade para o depositário.<br/>Tamanho: 14<br/>Formato: 'NNNNNNNNNNNNNN'
  **/
  private String cnpjResponsavelAnterior = null;

  @XmlElement(name="codigoRecintoOrigem")
  @ApiModelProperty(example = "1111111", value = "Código Siscomex do recinto de origem. No modal aéreo, deve ser preenchido na troca de responsabilidade entre depositários.<br/>Tamanho: 15")
 /**
   * Código Siscomex do recinto de origem. No modal aéreo, deve ser preenchido na troca de responsabilidade entre depositários.<br/>Tamanho: 15
  **/
  private String codigoRecintoOrigem = null;

  @XmlElement(name="pesoManifesto")
  @ApiModelProperty(example = "15.5", value = "Peso manifestado total da carga, ou seja, do conhecimento.<br/><br/>pesoManifesto, até 4 casas decimais.")
  @Valid
 /**
   * Peso manifestado total da carga, ou seja, do conhecimento.<br/><br/>pesoManifesto, até 4 casas decimais.
  **/
  private BigDecimal pesoManifesto = null;

  @XmlElement(name="listaVolumesManifesto")
  @ApiModelProperty(value = "Lista de Volumes Manifestados")
  @Valid
 /**
   * Lista de Volumes Manifestados
  **/
  private List<DadosVolumeManifestado> listaVolumesManifesto = null;

  @XmlElement(name="numeroConteiner")
  @ApiModelProperty(value = "Identificação do número do contêiner.<br/>Tamanho: 200")
 /**
   * Identificação do número do contêiner.<br/>Tamanho: 200
  **/
  private String numeroConteiner = null;

  @XmlElement(name="identificacaoUld")
  @ApiModelProperty(example = "AZEB123_AA, AKE21001NZ", value = "Identificação da ULD no formato (TTTNNNNNPP) composta pelos seguintes atributos: Tipo de ULD (3 caracteres - TTT), Número da ULD (5 caracteres - NNNNN - Caso o número tenha menos que 5 caracteres, preencher à direita com o caracter especial \"_\") e Código do proprietário da ULD (2 caracteres - PP).<br/>Tamanho: 10")
 /**
   * Identificação da ULD no formato (TTTNNNNNPP) composta pelos seguintes atributos: Tipo de ULD (3 caracteres - TTT), Número da ULD (5 caracteres - NNNNN - Caso o número tenha menos que 5 caracteres, preencher à direita com o caracter especial \"_\") e Código do proprietário da ULD (2 caracteres - PP).<br/>Tamanho: 10
  **/
  private String identificacaoUld = null;

  @XmlElement(name="listaChassi")
  @ApiModelProperty(value = "Lista de Chassis. Informar todos os chassis das mercadorias, inclusive o tipo meios próprios (Impo/Expo ônibus, cavalo-trator, semirreboque...)<br/>Tamanho: 50")
  @Valid
 /**
   * Lista de Chassis. Informar todos os chassis das mercadorias, inclusive o tipo meios próprios (Impo/Expo ônibus, cavalo-trator, semirreboque...)<br/>Tamanho: 50
  **/
  private List<DadosDoChassi> listaChassi = null;

  @XmlElement(name="navio")
  @ApiModelProperty(value = "")
  @Valid
  private DadosNavio navio = null;

  @XmlElement(name="iataAeronave")
  @ApiModelProperty(value = "Código IATA da aeronave<br/>Tamanho: 50")
 /**
   * Código IATA da aeronave<br/>Tamanho: 50
  **/
  private String iataAeronave = null;

  @XmlElement(name="prefixoAeronave")
  @ApiModelProperty(value = "Prefixo da Aeronave<br/>Tamanho: 20")
 /**
   * Prefixo da Aeronave<br/>Tamanho: 20
  **/
  private String prefixoAeronave = null;

  @XmlElement(name="viagem")
  @ApiModelProperty(example = "AA090520191209MIA', onde vôo = 'AA0905', data de partida prevista = '20191209' e aeroporto da partida = 'MIA", value = "Identificação da viagem.<br/>Tamanho: 20<br/>No aéreo a composição da viagem é: vôo + data da partida prevista + aeroporto da partida.No aquaviário também deve ser informado o campo viagem no formato disponível.")
 /**
   * Identificação da viagem.<br/>Tamanho: 20<br/>No aéreo a composição da viagem é: vôo + data da partida prevista + aeroporto da partida.No aquaviário também deve ser informado o campo viagem no formato disponível.
  **/
  private String viagem = null;

  @XmlElement(name="escala")
  @ApiModelProperty(value = "Escala<br/>Tamanho: 20")
 /**
   * Escala<br/>Tamanho: 20
  **/
  private String escala = null;

  @XmlElement(name="aeroportoOrigem")
  @ApiModelProperty(value = "Aeroporto de origem da carga - Código IATA<br/>Tamanho: 3")
 /**
   * Aeroporto de origem da carga - Código IATA<br/>Tamanho: 3
  **/
  private String aeroportoOrigem = null;

  @XmlElement(name="placaSemirreboque")
  @ApiModelProperty(value = "Placa semirreboque/vagão<br/>Tamanho: 50Placa semirreboque/vagão.")
 /**
   * Placa semirreboque/vagão<br/>Tamanho: 50Placa semirreboque/vagão.
  **/
  private String placaSemirreboque = null;

  @XmlElement(name="listaMercadoriaPerigosa")
  @ApiModelProperty(value = "Lista de códigos da mercadoria perigosa.")
  @Valid
 /**
   * Lista de códigos da mercadoria perigosa.
  **/
  private List<DadosDaMercadoriaPerigosa> listaMercadoriaPerigosa = null;

  @XmlElement(name="perecivel")
  @ApiModelProperty(example = "false", value = "Mercadoria Perecível<br/>Domínio:<br/>true - Sim<br/>false - Não")
 /**
   * Mercadoria Perecível<br/>Domínio:<br/>true - Sim<br/>false - Não
  **/
  private Boolean perecivel = null;

  @XmlElement(name="cargaSolta")
  @ApiModelProperty(example = "false", value = "Carga Solta<br/>Domínio:<br/>true - Sim<br/>false - Não")
 /**
   * Carga Solta<br/>Domínio:<br/>true - Sim<br/>false - Não
  **/
  private Boolean cargaSolta = null;


@XmlType(name="IndicadorDeRemessaInternacionalEnum")
@XmlEnum(String.class)
public enum IndicadorDeRemessaInternacionalEnum {

	@XmlEnumValue("'E'")
	@JsonProperty("'E'")
	E_(String.valueOf("'E'")),
	
	@XmlEnumValue("'P'")
	@JsonProperty("'P'")
	P_(String.valueOf("'P'"));


    private String value;

    IndicadorDeRemessaInternacionalEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static IndicadorDeRemessaInternacionalEnum fromValue(String v) {
        for (IndicadorDeRemessaInternacionalEnum b : IndicadorDeRemessaInternacionalEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to IndicadorDeRemessaInternacionalEnum");
    }
}

  @XmlElement(name="indicadorDeRemessaInternacional")
  @ApiModelProperty(example = "E", value = "Indicador de remessa internacional expressa ou postal.<br/>Domínio:<br/>E - EXPRESSA<br/>P - POSTAL")
 /**
   * Indicador de remessa internacional expressa ou postal.<br/>Domínio:<br/>E - EXPRESSA<br/>P - POSTAL
  **/
  private IndicadorDeRemessaInternacionalEnum indicadorDeRemessaInternacional = null;

  @XmlElement(name="listaCameras")
  @ApiModelProperty(value = "Lista de identificação das câmeras. Usar o protocolo do evento de georreferenciamento para indicar, nesta lista, todas as câmeras que cobrem a área.")
  @Valid
 /**
   * Lista de identificação das câmeras. Usar o protocolo do evento de georreferenciamento para indicar, nesta lista, todas as câmeras que cobrem a área.
  **/
  private List<DadosDaCmera> listaCameras = null;

  @XmlElement(name="observacaoRecepcao")
  @ApiModelProperty(value = "Observações da recepção da carga<br/>Tamanho: 200")
 /**
   * Observações da recepção da carga<br/>Tamanho: 200
  **/
  private String observacaoRecepcao = null;

  @XmlElement(name="lotes")
  @ApiModelProperty(value = "Lista de lotes")
  @Valid
 /**
   * Lista de lotes
  **/
  private List<DadosLote> lotes = null;
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

  public DadosGeraoLote tipoOperacao(TipoOperacaoEnum tipoOperacao) {
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

  public DadosGeraoLote idEvento(String idEvento) {
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

  public DadosGeraoLote dataHoraOcorrencia(String dataHoraOcorrencia) {
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

  public DadosGeraoLote dataHoraRegistro(String dataHoraRegistro) {
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

  public DadosGeraoLote cpfOperadorOcorrencia(String cpfOperadorOcorrencia) {
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

  public DadosGeraoLote cpfOperadorRegistro(String cpfOperadorRegistro) {
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

  public DadosGeraoLote protocoloEventoRetificadoOuExcluido(String protocoloEventoRetificadoOuExcluido) {
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

  public DadosGeraoLote contingencia(Boolean contingencia) {
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

  public DadosGeraoLote codigoRecinto(String codigoRecinto) {
    this.codigoRecinto = codigoRecinto;
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

  public DadosGeraoLote numeroManifesto(String numeroManifesto) {
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

  public DadosGeraoLote tipoManifesto(TipoManifestoEnum tipoManifesto) {
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

  public DadosGeraoLote numeroConhecimentoMAWB(String numeroConhecimentoMAWB) {
    this.numeroConhecimentoMAWB = numeroConhecimentoMAWB;
    return this;
  }

 /**
   * Identificação do conhecimento de carga ou do DSIC. &lt;br/&gt;No modal aéreo, na importação, deve ser preenchido quando se tratar de AWB direto, ou HAWB, ou DSIC. &lt;br/&gt;No modal aéreo, na exportação, não deve ser preenchido.  &lt;br/&gt;No aquaviário deve ser preenchido com CE Mercante na importação e na exportação com o conhecimento internacional ou, quando ainda não emitido, com o CT-e que amparou a chegada da carga.&lt;br/&gt;Tamanho: 100
   * @return numeroConhecimento
  **/
  @JsonProperty("numeroConhecimento")
  public String getNumeroConhecimento() {
    return numeroConhecimento;
  }

  public void setNumeroConhecimento(String numeroConhecimento) {
    this.numeroConhecimento = numeroConhecimento;
  }

  public DadosGeraoLote numeroConhecimento(String numeroConhecimento) {
    this.numeroConhecimento = numeroConhecimento;
    return this;
  }

 /**
   * Conforme tabela de domínio Tipo de Conhecimento disponível no &lt;a href&#x3D;https://portalunico.siscomex.gov.br/tabx/#/tabelas rel&#x3D;\&quot;noopener noreferrer\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Portal Único Siscomex.&lt;/a&gt;
   * @return tipoConhecimento
  **/
  @JsonProperty("tipoConhecimento")
  public String getTipoConhecimento() {
    return tipoConhecimento;
  }

  public void setTipoConhecimento(String tipoConhecimento) {
    this.tipoConhecimento = tipoConhecimento;
  }

  public DadosGeraoLote tipoConhecimento(String tipoConhecimento) {
    this.tipoConhecimento = tipoConhecimento;
    return this;
  }

 /**
   * Número da RUC (Referência Única da Carga) / UCR (Unique Consignment Reference).&lt;br/&gt;Tamanho: 35
   * @return numeroRUC
  **/
  @JsonProperty("numeroRUC")
  public String getNumeroRUC() {
    return numeroRUC;
  }

  public void setNumeroRUC(String numeroRUC) {
    this.numeroRUC = numeroRUC;
  }

  public DadosGeraoLote numeroRUC(String numeroRUC) {
    this.numeroRUC = numeroRUC;
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

  public DadosGeraoLote declaracaoAduaneira(DeclaraoAduaneira declaracaoAduaneira) {
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

  public DadosGeraoLote listaNfe(List<DadosDaNotaFiscalEmbarqueDesembarque> listaNfe) {
    this.listaNfe = listaNfe;
    return this;
  }

  public DadosGeraoLote addListaNfeItem(DadosDaNotaFiscalEmbarqueDesembarque listaNfeItem) {
    this.listaNfe.add(listaNfeItem);
    return this;
  }

 /**
   * CNPJ do responsável pela carga anteriormente à troca de responsabilidade para o depositário.&lt;br/&gt;Tamanho: 14&lt;br/&gt;Formato: &#39;NNNNNNNNNNNNNN&#39;
   * @return cnpjResponsavelAnterior
  **/
  @JsonProperty("cnpjResponsavelAnterior")
  public String getCnpjResponsavelAnterior() {
    return cnpjResponsavelAnterior;
  }

  public void setCnpjResponsavelAnterior(String cnpjResponsavelAnterior) {
    this.cnpjResponsavelAnterior = cnpjResponsavelAnterior;
  }

  public DadosGeraoLote cnpjResponsavelAnterior(String cnpjResponsavelAnterior) {
    this.cnpjResponsavelAnterior = cnpjResponsavelAnterior;
    return this;
  }

 /**
   * Código Siscomex do recinto de origem. No modal aéreo, deve ser preenchido na troca de responsabilidade entre depositários.&lt;br/&gt;Tamanho: 15
   * @return codigoRecintoOrigem
  **/
  @JsonProperty("codigoRecintoOrigem")
  public String getCodigoRecintoOrigem() {
    return codigoRecintoOrigem;
  }

  public void setCodigoRecintoOrigem(String codigoRecintoOrigem) {
    this.codigoRecintoOrigem = codigoRecintoOrigem;
  }

  public DadosGeraoLote codigoRecintoOrigem(String codigoRecintoOrigem) {
    this.codigoRecintoOrigem = codigoRecintoOrigem;
    return this;
  }

 /**
   * Peso manifestado total da carga, ou seja, do conhecimento.&lt;br/&gt;&lt;br/&gt;pesoManifesto, até 4 casas decimais.
   * @return pesoManifesto
  **/
  @JsonProperty("pesoManifesto")
  public BigDecimal getPesoManifesto() {
    return pesoManifesto;
  }

  public void setPesoManifesto(BigDecimal pesoManifesto) {
    this.pesoManifesto = pesoManifesto;
  }

  public DadosGeraoLote pesoManifesto(BigDecimal pesoManifesto) {
    this.pesoManifesto = pesoManifesto;
    return this;
  }

 /**
   * Lista de Volumes Manifestados
   * @return listaVolumesManifesto
  **/
  @JsonProperty("listaVolumesManifesto")
  public List<DadosVolumeManifestado> getListaVolumesManifesto() {
    return listaVolumesManifesto;
  }

  public void setListaVolumesManifesto(List<DadosVolumeManifestado> listaVolumesManifesto) {
    this.listaVolumesManifesto = listaVolumesManifesto;
  }

  public DadosGeraoLote listaVolumesManifesto(List<DadosVolumeManifestado> listaVolumesManifesto) {
    this.listaVolumesManifesto = listaVolumesManifesto;
    return this;
  }

  public DadosGeraoLote addListaVolumesManifestoItem(DadosVolumeManifestado listaVolumesManifestoItem) {
    this.listaVolumesManifesto.add(listaVolumesManifestoItem);
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

  public DadosGeraoLote numeroConteiner(String numeroConteiner) {
    this.numeroConteiner = numeroConteiner;
    return this;
  }

 /**
   * Identificação da ULD no formato (TTTNNNNNPP) composta pelos seguintes atributos: Tipo de ULD (3 caracteres - TTT), Número da ULD (5 caracteres - NNNNN - Caso o número tenha menos que 5 caracteres, preencher à direita com o caracter especial \&quot;_\&quot;) e Código do proprietário da ULD (2 caracteres - PP).&lt;br/&gt;Tamanho: 10
   * @return identificacaoUld
  **/
  @JsonProperty("identificacaoUld")
  public String getIdentificacaoUld() {
    return identificacaoUld;
  }

  public void setIdentificacaoUld(String identificacaoUld) {
    this.identificacaoUld = identificacaoUld;
  }

  public DadosGeraoLote identificacaoUld(String identificacaoUld) {
    this.identificacaoUld = identificacaoUld;
    return this;
  }

 /**
   * Lista de Chassis. Informar todos os chassis das mercadorias, inclusive o tipo meios próprios (Impo/Expo ônibus, cavalo-trator, semirreboque...)&lt;br/&gt;Tamanho: 50
   * @return listaChassi
  **/
  @JsonProperty("listaChassi")
  public List<DadosDoChassi> getListaChassi() {
    return listaChassi;
  }

  public void setListaChassi(List<DadosDoChassi> listaChassi) {
    this.listaChassi = listaChassi;
  }

  public DadosGeraoLote listaChassi(List<DadosDoChassi> listaChassi) {
    this.listaChassi = listaChassi;
    return this;
  }

  public DadosGeraoLote addListaChassiItem(DadosDoChassi listaChassiItem) {
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

  public DadosGeraoLote navio(DadosNavio navio) {
    this.navio = navio;
    return this;
  }

 /**
   * Código IATA da aeronave&lt;br/&gt;Tamanho: 50
   * @return iataAeronave
  **/
  @JsonProperty("iataAeronave")
  public String getIataAeronave() {
    return iataAeronave;
  }

  public void setIataAeronave(String iataAeronave) {
    this.iataAeronave = iataAeronave;
  }

  public DadosGeraoLote iataAeronave(String iataAeronave) {
    this.iataAeronave = iataAeronave;
    return this;
  }

 /**
   * Prefixo da Aeronave&lt;br/&gt;Tamanho: 20
   * @return prefixoAeronave
  **/
  @JsonProperty("prefixoAeronave")
  public String getPrefixoAeronave() {
    return prefixoAeronave;
  }

  public void setPrefixoAeronave(String prefixoAeronave) {
    this.prefixoAeronave = prefixoAeronave;
  }

  public DadosGeraoLote prefixoAeronave(String prefixoAeronave) {
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

  public DadosGeraoLote viagem(String viagem) {
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

  public DadosGeraoLote escala(String escala) {
    this.escala = escala;
    return this;
  }

 /**
   * Aeroporto de origem da carga - Código IATA&lt;br/&gt;Tamanho: 3
   * @return aeroportoOrigem
  **/
  @JsonProperty("aeroportoOrigem")
  public String getAeroportoOrigem() {
    return aeroportoOrigem;
  }

  public void setAeroportoOrigem(String aeroportoOrigem) {
    this.aeroportoOrigem = aeroportoOrigem;
  }

  public DadosGeraoLote aeroportoOrigem(String aeroportoOrigem) {
    this.aeroportoOrigem = aeroportoOrigem;
    return this;
  }

 /**
   * Placa semirreboque/vagão&lt;br/&gt;Tamanho: 50Placa semirreboque/vagão.
   * @return placaSemirreboque
  **/
  @JsonProperty("placaSemirreboque")
  public String getPlacaSemirreboque() {
    return placaSemirreboque;
  }

  public void setPlacaSemirreboque(String placaSemirreboque) {
    this.placaSemirreboque = placaSemirreboque;
  }

  public DadosGeraoLote placaSemirreboque(String placaSemirreboque) {
    this.placaSemirreboque = placaSemirreboque;
    return this;
  }

 /**
   * Lista de códigos da mercadoria perigosa.
   * @return listaMercadoriaPerigosa
  **/
  @JsonProperty("listaMercadoriaPerigosa")
  public List<DadosDaMercadoriaPerigosa> getListaMercadoriaPerigosa() {
    return listaMercadoriaPerigosa;
  }

  public void setListaMercadoriaPerigosa(List<DadosDaMercadoriaPerigosa> listaMercadoriaPerigosa) {
    this.listaMercadoriaPerigosa = listaMercadoriaPerigosa;
  }

  public DadosGeraoLote listaMercadoriaPerigosa(List<DadosDaMercadoriaPerigosa> listaMercadoriaPerigosa) {
    this.listaMercadoriaPerigosa = listaMercadoriaPerigosa;
    return this;
  }

  public DadosGeraoLote addListaMercadoriaPerigosaItem(DadosDaMercadoriaPerigosa listaMercadoriaPerigosaItem) {
    this.listaMercadoriaPerigosa.add(listaMercadoriaPerigosaItem);
    return this;
  }

 /**
   * Mercadoria Perecível&lt;br/&gt;Domínio:&lt;br/&gt;true - Sim&lt;br/&gt;false - Não
   * @return perecivel
  **/
  @JsonProperty("perecivel")
  public Boolean isPerecivel() {
    return perecivel;
  }

  public void setPerecivel(Boolean perecivel) {
    this.perecivel = perecivel;
  }

  public DadosGeraoLote perecivel(Boolean perecivel) {
    this.perecivel = perecivel;
    return this;
  }

 /**
   * Carga Solta&lt;br/&gt;Domínio:&lt;br/&gt;true - Sim&lt;br/&gt;false - Não
   * @return cargaSolta
  **/
  @JsonProperty("cargaSolta")
  public Boolean isCargaSolta() {
    return cargaSolta;
  }

  public void setCargaSolta(Boolean cargaSolta) {
    this.cargaSolta = cargaSolta;
  }

  public DadosGeraoLote cargaSolta(Boolean cargaSolta) {
    this.cargaSolta = cargaSolta;
    return this;
  }

 /**
   * Indicador de remessa internacional expressa ou postal.&lt;br/&gt;Domínio:&lt;br/&gt;E - EXPRESSA&lt;br/&gt;P - POSTAL
   * @return indicadorDeRemessaInternacional
  **/
  @JsonProperty("indicadorDeRemessaInternacional")
  public String getIndicadorDeRemessaInternacional() {
    if (indicadorDeRemessaInternacional == null) {
      return null;
    }
    return indicadorDeRemessaInternacional.value();
  }

  public void setIndicadorDeRemessaInternacional(IndicadorDeRemessaInternacionalEnum indicadorDeRemessaInternacional) {
    this.indicadorDeRemessaInternacional = indicadorDeRemessaInternacional;
  }

  public DadosGeraoLote indicadorDeRemessaInternacional(IndicadorDeRemessaInternacionalEnum indicadorDeRemessaInternacional) {
    this.indicadorDeRemessaInternacional = indicadorDeRemessaInternacional;
    return this;
  }

 /**
   * Lista de identificação das câmeras. Usar o protocolo do evento de georreferenciamento para indicar, nesta lista, todas as câmeras que cobrem a área.
   * @return listaCameras
  **/
  @JsonProperty("listaCameras")
  public List<DadosDaCmera> getListaCameras() {
    return listaCameras;
  }

  public void setListaCameras(List<DadosDaCmera> listaCameras) {
    this.listaCameras = listaCameras;
  }

  public DadosGeraoLote listaCameras(List<DadosDaCmera> listaCameras) {
    this.listaCameras = listaCameras;
    return this;
  }

  public DadosGeraoLote addListaCamerasItem(DadosDaCmera listaCamerasItem) {
    this.listaCameras.add(listaCamerasItem);
    return this;
  }

 /**
   * Observações da recepção da carga&lt;br/&gt;Tamanho: 200
   * @return observacaoRecepcao
  **/
  @JsonProperty("observacaoRecepcao")
  public String getObservacaoRecepcao() {
    return observacaoRecepcao;
  }

  public void setObservacaoRecepcao(String observacaoRecepcao) {
    this.observacaoRecepcao = observacaoRecepcao;
  }

  public DadosGeraoLote observacaoRecepcao(String observacaoRecepcao) {
    this.observacaoRecepcao = observacaoRecepcao;
    return this;
  }

 /**
   * Lista de lotes
   * @return lotes
  **/
  @JsonProperty("lotes")
  public List<DadosLote> getLotes() {
    return lotes;
  }

  public void setLotes(List<DadosLote> lotes) {
    this.lotes = lotes;
  }

  public DadosGeraoLote lotes(List<DadosLote> lotes) {
    this.lotes = lotes;
    return this;
  }

  public DadosGeraoLote addLotesItem(DadosLote lotesItem) {
    this.lotes.add(lotesItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DadosGeraoLote {\n");
    
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
    sb.append("    numeroRUC: ").append(toIndentedString(numeroRUC)).append("\n");
    sb.append("    declaracaoAduaneira: ").append(toIndentedString(declaracaoAduaneira)).append("\n");
    sb.append("    listaNfe: ").append(toIndentedString(listaNfe)).append("\n");
    sb.append("    cnpjResponsavelAnterior: ").append(toIndentedString(cnpjResponsavelAnterior)).append("\n");
    sb.append("    codigoRecintoOrigem: ").append(toIndentedString(codigoRecintoOrigem)).append("\n");
    sb.append("    pesoManifesto: ").append(toIndentedString(pesoManifesto)).append("\n");
    sb.append("    listaVolumesManifesto: ").append(toIndentedString(listaVolumesManifesto)).append("\n");
    sb.append("    numeroConteiner: ").append(toIndentedString(numeroConteiner)).append("\n");
    sb.append("    identificacaoUld: ").append(toIndentedString(identificacaoUld)).append("\n");
    sb.append("    listaChassi: ").append(toIndentedString(listaChassi)).append("\n");
    sb.append("    navio: ").append(toIndentedString(navio)).append("\n");
    sb.append("    iataAeronave: ").append(toIndentedString(iataAeronave)).append("\n");
    sb.append("    prefixoAeronave: ").append(toIndentedString(prefixoAeronave)).append("\n");
    sb.append("    viagem: ").append(toIndentedString(viagem)).append("\n");
    sb.append("    escala: ").append(toIndentedString(escala)).append("\n");
    sb.append("    aeroportoOrigem: ").append(toIndentedString(aeroportoOrigem)).append("\n");
    sb.append("    placaSemirreboque: ").append(toIndentedString(placaSemirreboque)).append("\n");
    sb.append("    listaMercadoriaPerigosa: ").append(toIndentedString(listaMercadoriaPerigosa)).append("\n");
    sb.append("    perecivel: ").append(toIndentedString(perecivel)).append("\n");
    sb.append("    cargaSolta: ").append(toIndentedString(cargaSolta)).append("\n");
    sb.append("    indicadorDeRemessaInternacional: ").append(toIndentedString(indicadorDeRemessaInternacional)).append("\n");
    sb.append("    listaCameras: ").append(toIndentedString(listaCameras)).append("\n");
    sb.append("    observacaoRecepcao: ").append(toIndentedString(observacaoRecepcao)).append("\n");
    sb.append("    lotes: ").append(toIndentedString(lotes)).append("\n");
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

