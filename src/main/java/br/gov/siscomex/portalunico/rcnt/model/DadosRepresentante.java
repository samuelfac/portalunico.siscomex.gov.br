package br.gov.siscomex.portalunico.rcnt.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "DadosRepresentante", propOrder =
    { "tipoOperacao", "idEvento", "dataHoraOcorrencia", "dataHoraRegistro", "cpfOperadorOcorrencia", "cpfOperadorRegistro", "protocoloEventoRetificadoOuExcluido", "contingencia", "codigoRecinto", "cpfRepresentante", "cnpjRepresentante", "documentoEstrangeiroRepresentante", "nomeRepresentante", "cpfRepresentado", "cnpjRepresentado", "nomeRepresentado", "documentoEstrangeiroRepresentado", "dataHoraInicioValidade", "dataHoraFimValidade", "motivo"
})

@XmlRootElement(name="DadosRepresentante")
public class DadosRepresentante  {
  

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

  @XmlElement(name="cpfRepresentante")
  @ApiModelProperty(example = "55555555555", value = "CPF representante<br/>Tamanho: 11<br/>Formato: 'NNNNNNNNNNN'")
 /**
   * CPF representante<br/>Tamanho: 11<br/>Formato: 'NNNNNNNNNNN'
  **/
  private String cpfRepresentante = null;

  @XmlElement(name="cnpjRepresentante")
  @ApiModelProperty(example = "44444444444444", value = "CNPJ representante<br/>Tamanho: 14<br/>Formato: 'NNNNNNNNNNNNNN'")
 /**
   * CNPJ representante<br/>Tamanho: 14<br/>Formato: 'NNNNNNNNNNNNNN'
  **/
  private String cnpjRepresentante = null;

  @XmlElement(name="documentoEstrangeiroRepresentante")
  @ApiModelProperty(value = "")
  @Valid
  private DadosDocumentoEstrangeiro documentoEstrangeiroRepresentante = null;

  @XmlElement(name="nomeRepresentante")
  @ApiModelProperty(value = "Nome representante<br/>Tamanho: 100")
 /**
   * Nome representante<br/>Tamanho: 100
  **/
  private String nomeRepresentante = null;

  @XmlElement(name="cpfRepresentado")
  @ApiModelProperty(example = "55555555555", value = "CPF representado<br/>Tamanho: 11<br/>Formato: 'NNNNNNNNNNN'")
 /**
   * CPF representado<br/>Tamanho: 11<br/>Formato: 'NNNNNNNNNNN'
  **/
  private String cpfRepresentado = null;

  @XmlElement(name="cnpjRepresentado")
  @ApiModelProperty(example = "44444444444444", value = "CNPJ representado<br/>Tamanho: 14<br/>Formato: 'NNNNNNNNNNNNNN'")
 /**
   * CNPJ representado<br/>Tamanho: 14<br/>Formato: 'NNNNNNNNNNNNNN'
  **/
  private String cnpjRepresentado = null;

  @XmlElement(name="nomeRepresentado")
  @ApiModelProperty(value = "Nome do representado<br/>Tamanho: 100")
 /**
   * Nome do representado<br/>Tamanho: 100
  **/
  private String nomeRepresentado = null;

  @XmlElement(name="documentoEstrangeiroRepresentado")
  @ApiModelProperty(value = "")
  @Valid
  private DadosDocumentoEstrangeiro documentoEstrangeiroRepresentado = null;

  @XmlElement(name="dataHoraInicioValidade")
  @ApiModelProperty(example = "2020-04-01T10:50:30.150-0300", value = "Data Início representação<br/>Formato: 'yyyy-MM-ddTHH:mm:ss.SSSZ'")
 /**
   * Data Início representação<br/>Formato: 'yyyy-MM-ddTHH:mm:ss.SSSZ'
  **/
  private String dataHoraInicioValidade = null;

  @XmlElement(name="dataHoraFimValidade")
  @ApiModelProperty(example = "2020-04-01T10:50:30.150-0300", value = "Data Fim representação, se houver<br/>Formato: 'yyyy-MM-ddTHH:mm:ss.SSSZ'")
 /**
   * Data Fim representação, se houver<br/>Formato: 'yyyy-MM-ddTHH:mm:ss.SSSZ'
  **/
  private String dataHoraFimValidade = null;

  @XmlElement(name="motivo")
  @ApiModelProperty(example = "representação para trâmite de documentos, representação para fechar faturamento com recinto, representação para monitoramento de cargas no portal do recinto...", value = "Motivo da representação<br/>Tamanho: 100")
 /**
   * Motivo da representação<br/>Tamanho: 100
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

  public DadosRepresentante tipoOperacao(TipoOperacaoEnum tipoOperacao) {
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

  public DadosRepresentante idEvento(String idEvento) {
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

  public DadosRepresentante dataHoraOcorrencia(String dataHoraOcorrencia) {
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

  public DadosRepresentante dataHoraRegistro(String dataHoraRegistro) {
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

  public DadosRepresentante cpfOperadorOcorrencia(String cpfOperadorOcorrencia) {
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

  public DadosRepresentante cpfOperadorRegistro(String cpfOperadorRegistro) {
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

  public DadosRepresentante protocoloEventoRetificadoOuExcluido(String protocoloEventoRetificadoOuExcluido) {
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

  public DadosRepresentante contingencia(Boolean contingencia) {
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

  public DadosRepresentante codigoRecinto(String codigoRecinto) {
    this.codigoRecinto = codigoRecinto;
    return this;
  }

 /**
   * CPF representante&lt;br/&gt;Tamanho: 11&lt;br/&gt;Formato: &#39;NNNNNNNNNNN&#39;
   * @return cpfRepresentante
  **/
  @JsonProperty("cpfRepresentante")
  public String getCpfRepresentante() {
    return cpfRepresentante;
  }

  public void setCpfRepresentante(String cpfRepresentante) {
    this.cpfRepresentante = cpfRepresentante;
  }

  public DadosRepresentante cpfRepresentante(String cpfRepresentante) {
    this.cpfRepresentante = cpfRepresentante;
    return this;
  }

 /**
   * CNPJ representante&lt;br/&gt;Tamanho: 14&lt;br/&gt;Formato: &#39;NNNNNNNNNNNNNN&#39;
   * @return cnpjRepresentante
  **/
  @JsonProperty("cnpjRepresentante")
  public String getCnpjRepresentante() {
    return cnpjRepresentante;
  }

  public void setCnpjRepresentante(String cnpjRepresentante) {
    this.cnpjRepresentante = cnpjRepresentante;
  }

  public DadosRepresentante cnpjRepresentante(String cnpjRepresentante) {
    this.cnpjRepresentante = cnpjRepresentante;
    return this;
  }

 /**
   * Get documentoEstrangeiroRepresentante
   * @return documentoEstrangeiroRepresentante
  **/
  @JsonProperty("documentoEstrangeiroRepresentante")
  public DadosDocumentoEstrangeiro getDocumentoEstrangeiroRepresentante() {
    return documentoEstrangeiroRepresentante;
  }

  public void setDocumentoEstrangeiroRepresentante(DadosDocumentoEstrangeiro documentoEstrangeiroRepresentante) {
    this.documentoEstrangeiroRepresentante = documentoEstrangeiroRepresentante;
  }

  public DadosRepresentante documentoEstrangeiroRepresentante(DadosDocumentoEstrangeiro documentoEstrangeiroRepresentante) {
    this.documentoEstrangeiroRepresentante = documentoEstrangeiroRepresentante;
    return this;
  }

 /**
   * Nome representante&lt;br/&gt;Tamanho: 100
   * @return nomeRepresentante
  **/
  @JsonProperty("nomeRepresentante")
  public String getNomeRepresentante() {
    return nomeRepresentante;
  }

  public void setNomeRepresentante(String nomeRepresentante) {
    this.nomeRepresentante = nomeRepresentante;
  }

  public DadosRepresentante nomeRepresentante(String nomeRepresentante) {
    this.nomeRepresentante = nomeRepresentante;
    return this;
  }

 /**
   * CPF representado&lt;br/&gt;Tamanho: 11&lt;br/&gt;Formato: &#39;NNNNNNNNNNN&#39;
   * @return cpfRepresentado
  **/
  @JsonProperty("cpfRepresentado")
  public String getCpfRepresentado() {
    return cpfRepresentado;
  }

  public void setCpfRepresentado(String cpfRepresentado) {
    this.cpfRepresentado = cpfRepresentado;
  }

  public DadosRepresentante cpfRepresentado(String cpfRepresentado) {
    this.cpfRepresentado = cpfRepresentado;
    return this;
  }

 /**
   * CNPJ representado&lt;br/&gt;Tamanho: 14&lt;br/&gt;Formato: &#39;NNNNNNNNNNNNNN&#39;
   * @return cnpjRepresentado
  **/
  @JsonProperty("cnpjRepresentado")
  public String getCnpjRepresentado() {
    return cnpjRepresentado;
  }

  public void setCnpjRepresentado(String cnpjRepresentado) {
    this.cnpjRepresentado = cnpjRepresentado;
  }

  public DadosRepresentante cnpjRepresentado(String cnpjRepresentado) {
    this.cnpjRepresentado = cnpjRepresentado;
    return this;
  }

 /**
   * Nome do representado&lt;br/&gt;Tamanho: 100
   * @return nomeRepresentado
  **/
  @JsonProperty("nomeRepresentado")
  public String getNomeRepresentado() {
    return nomeRepresentado;
  }

  public void setNomeRepresentado(String nomeRepresentado) {
    this.nomeRepresentado = nomeRepresentado;
  }

  public DadosRepresentante nomeRepresentado(String nomeRepresentado) {
    this.nomeRepresentado = nomeRepresentado;
    return this;
  }

 /**
   * Get documentoEstrangeiroRepresentado
   * @return documentoEstrangeiroRepresentado
  **/
  @JsonProperty("documentoEstrangeiroRepresentado")
  public DadosDocumentoEstrangeiro getDocumentoEstrangeiroRepresentado() {
    return documentoEstrangeiroRepresentado;
  }

  public void setDocumentoEstrangeiroRepresentado(DadosDocumentoEstrangeiro documentoEstrangeiroRepresentado) {
    this.documentoEstrangeiroRepresentado = documentoEstrangeiroRepresentado;
  }

  public DadosRepresentante documentoEstrangeiroRepresentado(DadosDocumentoEstrangeiro documentoEstrangeiroRepresentado) {
    this.documentoEstrangeiroRepresentado = documentoEstrangeiroRepresentado;
    return this;
  }

 /**
   * Data Início representação&lt;br/&gt;Formato: &#39;yyyy-MM-ddTHH:mm:ss.SSSZ&#39;
   * @return dataHoraInicioValidade
  **/
  @JsonProperty("dataHoraInicioValidade")
  public String getDataHoraInicioValidade() {
    return dataHoraInicioValidade;
  }

  public void setDataHoraInicioValidade(String dataHoraInicioValidade) {
    this.dataHoraInicioValidade = dataHoraInicioValidade;
  }

  public DadosRepresentante dataHoraInicioValidade(String dataHoraInicioValidade) {
    this.dataHoraInicioValidade = dataHoraInicioValidade;
    return this;
  }

 /**
   * Data Fim representação, se houver&lt;br/&gt;Formato: &#39;yyyy-MM-ddTHH:mm:ss.SSSZ&#39;
   * @return dataHoraFimValidade
  **/
  @JsonProperty("dataHoraFimValidade")
  public String getDataHoraFimValidade() {
    return dataHoraFimValidade;
  }

  public void setDataHoraFimValidade(String dataHoraFimValidade) {
    this.dataHoraFimValidade = dataHoraFimValidade;
  }

  public DadosRepresentante dataHoraFimValidade(String dataHoraFimValidade) {
    this.dataHoraFimValidade = dataHoraFimValidade;
    return this;
  }

 /**
   * Motivo da representação&lt;br/&gt;Tamanho: 100
   * @return motivo
  **/
  @JsonProperty("motivo")
  public String getMotivo() {
    return motivo;
  }

  public void setMotivo(String motivo) {
    this.motivo = motivo;
  }

  public DadosRepresentante motivo(String motivo) {
    this.motivo = motivo;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DadosRepresentante {\n");
    
    sb.append("    tipoOperacao: ").append(toIndentedString(tipoOperacao)).append("\n");
    sb.append("    idEvento: ").append(toIndentedString(idEvento)).append("\n");
    sb.append("    dataHoraOcorrencia: ").append(toIndentedString(dataHoraOcorrencia)).append("\n");
    sb.append("    dataHoraRegistro: ").append(toIndentedString(dataHoraRegistro)).append("\n");
    sb.append("    cpfOperadorOcorrencia: ").append(toIndentedString(cpfOperadorOcorrencia)).append("\n");
    sb.append("    cpfOperadorRegistro: ").append(toIndentedString(cpfOperadorRegistro)).append("\n");
    sb.append("    protocoloEventoRetificadoOuExcluido: ").append(toIndentedString(protocoloEventoRetificadoOuExcluido)).append("\n");
    sb.append("    contingencia: ").append(toIndentedString(contingencia)).append("\n");
    sb.append("    codigoRecinto: ").append(toIndentedString(codigoRecinto)).append("\n");
    sb.append("    cpfRepresentante: ").append(toIndentedString(cpfRepresentante)).append("\n");
    sb.append("    cnpjRepresentante: ").append(toIndentedString(cnpjRepresentante)).append("\n");
    sb.append("    documentoEstrangeiroRepresentante: ").append(toIndentedString(documentoEstrangeiroRepresentante)).append("\n");
    sb.append("    nomeRepresentante: ").append(toIndentedString(nomeRepresentante)).append("\n");
    sb.append("    cpfRepresentado: ").append(toIndentedString(cpfRepresentado)).append("\n");
    sb.append("    cnpjRepresentado: ").append(toIndentedString(cnpjRepresentado)).append("\n");
    sb.append("    nomeRepresentado: ").append(toIndentedString(nomeRepresentado)).append("\n");
    sb.append("    documentoEstrangeiroRepresentado: ").append(toIndentedString(documentoEstrangeiroRepresentado)).append("\n");
    sb.append("    dataHoraInicioValidade: ").append(toIndentedString(dataHoraInicioValidade)).append("\n");
    sb.append("    dataHoraFimValidade: ").append(toIndentedString(dataHoraFimValidade)).append("\n");
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

