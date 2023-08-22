package br.gov.siscomex.portalunico.cct_ext.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "DocumentoTransporteDTO", propOrder =
    { "ano", "sequencia", "numeroDocumentoTransporte", "tipoDocumentoTransporte", "codigoViaTransporte", "situacaoAtual", "situacoesObservacao", "dataEmissao", "cpfCnpjTransportador", "nomeTransportador", "tipoDAT", "localOrigem", "localDestinoPrevisto", "localDestinoRealizado", "veiculoFerroviario", "veiculoRodoviario", "conteineres", "cargas", "identificacaoVeiculo", "pesoBrutoTransportado", "observacao", "dadosVeiculoConferem", "dadosUnidadeTransporteConferem", "dadosConteinerConferem", "dadosEmbalagemConferem", "cargaComAvaria", "descricaoAvaria", "cargaComDivergencia", "descricaoDivergencia", "observacaoRecepcao", "pesoAferido", "motivoNaoPesagem", "dataHoraInicioTransito", "dataHoraChegadaTransito", "numeroLicencaOriginaria", "numeroLicComplTETI", "dataSolicitacaoTransito", "descricaoViaDeTransporte", "descricaoTipoDocumentoTransporte", "urlConsulta"
})

@XmlRootElement(name="DocumentoTransporteDTO")
public class DocumentoTransporteDTO  {
  
  @XmlElement(name="ano")
  @ApiModelProperty(value = "")
  @Valid
  private BigDecimal ano = null;

  @XmlElement(name="sequencia")
  @ApiModelProperty(value = "")
  @Valid
  private BigDecimal sequencia = null;

  @XmlElement(name="numeroDocumentoTransporte")
  @ApiModelProperty(value = "")
  private String numeroDocumentoTransporte = null;

  @XmlElement(name="tipoDocumentoTransporte")
  @ApiModelProperty(value = "")
  private Integer tipoDocumentoTransporte = null;

  @XmlElement(name="codigoViaTransporte")
  @ApiModelProperty(value = "")
  private Integer codigoViaTransporte = null;


@XmlType(name="SituacaoAtualEnum")
@XmlEnum(String.class)
public enum SituacaoAtualEnum {

	@XmlEnumValue("MANIFESTADO")
	@JsonProperty("MANIFESTADO")
	MANIFESTADO(String.valueOf("MANIFESTADO")),
	
	@XmlEnumValue("CONCEDIDO")
	@JsonProperty("CONCEDIDO")
	CONCEDIDO(String.valueOf("CONCEDIDO")),
	
	@XmlEnumValue("TRANSITO_INICIADO")
	@JsonProperty("TRANSITO_INICIADO")
	TRANSITO_INICIADO(String.valueOf("TRANSITO_INICIADO")),
	
	@XmlEnumValue("RECEBIDO_EM_TRANSITO")
	@JsonProperty("RECEBIDO_EM_TRANSITO")
	RECEBIDO_EM_TRANSITO(String.valueOf("RECEBIDO_EM_TRANSITO")),
	
	@XmlEnumValue("CONCLUIDO")
	@JsonProperty("CONCLUIDO")
	CONCLUIDO(String.valueOf("CONCLUIDO")),
	
	@XmlEnumValue("CANCELADO")
	@JsonProperty("CANCELADO")
	CANCELADO(String.valueOf("CANCELADO")),
	
	@XmlEnumValue("EM_ANALISE_PARA_CONCESSAO")
	@JsonProperty("EM_ANALISE_PARA_CONCESSAO")
	EM_ANALISE_PARA_CONCESSAO(String.valueOf("EM_ANALISE_PARA_CONCESSAO")),
	
	@XmlEnumValue("EM_ANALISE_PARA_CONCLUSAO")
	@JsonProperty("EM_ANALISE_PARA_CONCLUSAO")
	EM_ANALISE_PARA_CONCLUSAO(String.valueOf("EM_ANALISE_PARA_CONCLUSAO")),
	
	@XmlEnumValue("AGUARDANDO_ANALISE_PARA_CONCESSAO")
	@JsonProperty("AGUARDANDO_ANALISE_PARA_CONCESSAO")
	AGUARDANDO_ANALISE_PARA_CONCESSAO(String.valueOf("AGUARDANDO_ANALISE_PARA_CONCESSAO")),
	
	@XmlEnumValue("AGUARDANDO_ANALISE_PARA_CONCLUSAO")
	@JsonProperty("AGUARDANDO_ANALISE_PARA_CONCLUSAO")
	AGUARDANDO_ANALISE_PARA_CONCLUSAO(String.valueOf("AGUARDANDO_ANALISE_PARA_CONCLUSAO")),
	
	@XmlEnumValue("MANIFESTADO_DESPACHO")
	@JsonProperty("MANIFESTADO_DESPACHO")
	MANIFESTADO_DESPACHO(String.valueOf("MANIFESTADO_DESPACHO"));


    private String value;

    SituacaoAtualEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static SituacaoAtualEnum fromValue(String v) {
        for (SituacaoAtualEnum b : SituacaoAtualEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to SituacaoAtualEnum");
    }
}

  @XmlElement(name="situacaoAtual")
  @ApiModelProperty(value = "")
  private SituacaoAtualEnum situacaoAtual = null;

  @XmlElement(name="situacoesObservacao")
  @ApiModelProperty(value = "")
  private Map<String, String> situacoesObservacao = null;

  @XmlElement(name="dataEmissao")
  @ApiModelProperty(value = "")
  private OffsetDateTime dataEmissao = null;

  @XmlElement(name="cpfCnpjTransportador")
  @ApiModelProperty(value = "")
  private String cpfCnpjTransportador = null;

  @XmlElement(name="nomeTransportador")
  @ApiModelProperty(value = "")
  private String nomeTransportador = null;

  @XmlElement(name="tipoDAT")
  @ApiModelProperty(value = "")
  private Integer tipoDAT = null;

  @XmlElement(name="localOrigem")
  @ApiModelProperty(value = "")
  @Valid
  private LocalDTO localOrigem = null;

  @XmlElement(name="localDestinoPrevisto")
  @ApiModelProperty(value = "")
  @Valid
  private LocalDTO localDestinoPrevisto = null;

  @XmlElement(name="localDestinoRealizado")
  @ApiModelProperty(value = "")
  @Valid
  private LocalDTO localDestinoRealizado = null;

  @XmlElement(name="veiculoFerroviario")
  @ApiModelProperty(value = "")
  @Valid
  private VeiculoFerroviarioDTO veiculoFerroviario = null;

  @XmlElement(name="veiculoRodoviario")
  @ApiModelProperty(value = "")
  @Valid
  private VeiculoRodoviarioDTO veiculoRodoviario = null;

  @XmlElement(name="conteineres")
  @ApiModelProperty(value = "")
  @Valid
  private List<ConteinerDTO> conteineres = null;

  @XmlElement(name="cargas")
  @ApiModelProperty(value = "")
  @Valid
  private List<CargaDTO> cargas = null;

  @XmlElement(name="identificacaoVeiculo")
  @ApiModelProperty(value = "")
  private String identificacaoVeiculo = null;

  @XmlElement(name="pesoBrutoTransportado")
  @ApiModelProperty(value = "")
  @Valid
  private BigDecimal pesoBrutoTransportado = null;

  @XmlElement(name="observacao")
  @ApiModelProperty(value = "")
  private String observacao = null;

  @XmlElement(name="dadosVeiculoConferem")
  @ApiModelProperty(value = "")
  private String dadosVeiculoConferem = null;

  @XmlElement(name="dadosUnidadeTransporteConferem")
  @ApiModelProperty(value = "")
  private String dadosUnidadeTransporteConferem = null;

  @XmlElement(name="dadosConteinerConferem")
  @ApiModelProperty(value = "")
  private String dadosConteinerConferem = null;

  @XmlElement(name="dadosEmbalagemConferem")
  @ApiModelProperty(value = "")
  private String dadosEmbalagemConferem = null;

  @XmlElement(name="cargaComAvaria")
  @ApiModelProperty(value = "")
  private String cargaComAvaria = null;

  @XmlElement(name="descricaoAvaria")
  @ApiModelProperty(value = "")
  private String descricaoAvaria = null;

  @XmlElement(name="cargaComDivergencia")
  @ApiModelProperty(value = "")
  private String cargaComDivergencia = null;

  @XmlElement(name="descricaoDivergencia")
  @ApiModelProperty(value = "")
  private String descricaoDivergencia = null;

  @XmlElement(name="observacaoRecepcao")
  @ApiModelProperty(value = "")
  private String observacaoRecepcao = null;

  @XmlElement(name="pesoAferido")
  @ApiModelProperty(value = "")
  @Valid
  private BigDecimal pesoAferido = null;

  @XmlElement(name="motivoNaoPesagem")
  @ApiModelProperty(value = "")
  private String motivoNaoPesagem = null;

  @XmlElement(name="dataHoraInicioTransito")
  @ApiModelProperty(value = "")
  private OffsetDateTime dataHoraInicioTransito = null;

  @XmlElement(name="dataHoraChegadaTransito")
  @ApiModelProperty(value = "")
  private OffsetDateTime dataHoraChegadaTransito = null;

  @XmlElement(name="numeroLicencaOriginaria")
  @ApiModelProperty(value = "")
  private String numeroLicencaOriginaria = null;

  @XmlElement(name="numeroLicComplTETI")
  @ApiModelProperty(value = "")
  private String numeroLicComplTETI = null;

  @XmlElement(name="dataSolicitacaoTransito")
  @ApiModelProperty(value = "")
  private OffsetDateTime dataSolicitacaoTransito = null;

  @XmlElement(name="descricaoViaDeTransporte")
  @ApiModelProperty(value = "")
  private String descricaoViaDeTransporte = null;

  @XmlElement(name="descricaoTipoDocumentoTransporte")
  @ApiModelProperty(value = "")
  private String descricaoTipoDocumentoTransporte = null;

  @XmlElement(name="urlConsulta")
  @ApiModelProperty(value = "")
  private String urlConsulta = null;
 /**
   * Get ano
   * @return ano
  **/
  @JsonProperty("ano")
  public BigDecimal getAno() {
    return ano;
  }

  public void setAno(BigDecimal ano) {
    this.ano = ano;
  }

  public DocumentoTransporteDTO ano(BigDecimal ano) {
    this.ano = ano;
    return this;
  }

 /**
   * Get sequencia
   * @return sequencia
  **/
  @JsonProperty("sequencia")
  public BigDecimal getSequencia() {
    return sequencia;
  }

  public void setSequencia(BigDecimal sequencia) {
    this.sequencia = sequencia;
  }

  public DocumentoTransporteDTO sequencia(BigDecimal sequencia) {
    this.sequencia = sequencia;
    return this;
  }

 /**
   * Get numeroDocumentoTransporte
   * @return numeroDocumentoTransporte
  **/
  @JsonProperty("numeroDocumentoTransporte")
  public String getNumeroDocumentoTransporte() {
    return numeroDocumentoTransporte;
  }

  public void setNumeroDocumentoTransporte(String numeroDocumentoTransporte) {
    this.numeroDocumentoTransporte = numeroDocumentoTransporte;
  }

  public DocumentoTransporteDTO numeroDocumentoTransporte(String numeroDocumentoTransporte) {
    this.numeroDocumentoTransporte = numeroDocumentoTransporte;
    return this;
  }

 /**
   * Get tipoDocumentoTransporte
   * @return tipoDocumentoTransporte
  **/
  @JsonProperty("tipoDocumentoTransporte")
  public Integer getTipoDocumentoTransporte() {
    return tipoDocumentoTransporte;
  }

  public void setTipoDocumentoTransporte(Integer tipoDocumentoTransporte) {
    this.tipoDocumentoTransporte = tipoDocumentoTransporte;
  }

  public DocumentoTransporteDTO tipoDocumentoTransporte(Integer tipoDocumentoTransporte) {
    this.tipoDocumentoTransporte = tipoDocumentoTransporte;
    return this;
  }

 /**
   * Get codigoViaTransporte
   * @return codigoViaTransporte
  **/
  @JsonProperty("codigoViaTransporte")
  public Integer getCodigoViaTransporte() {
    return codigoViaTransporte;
  }

  public void setCodigoViaTransporte(Integer codigoViaTransporte) {
    this.codigoViaTransporte = codigoViaTransporte;
  }

  public DocumentoTransporteDTO codigoViaTransporte(Integer codigoViaTransporte) {
    this.codigoViaTransporte = codigoViaTransporte;
    return this;
  }

 /**
   * Get situacaoAtual
   * @return situacaoAtual
  **/
  @JsonProperty("situacaoAtual")
  public String getSituacaoAtual() {
    if (situacaoAtual == null) {
      return null;
    }
    return situacaoAtual.value();
  }

  public void setSituacaoAtual(SituacaoAtualEnum situacaoAtual) {
    this.situacaoAtual = situacaoAtual;
  }

  public DocumentoTransporteDTO situacaoAtual(SituacaoAtualEnum situacaoAtual) {
    this.situacaoAtual = situacaoAtual;
    return this;
  }

 /**
   * Get situacoesObservacao
   * @return situacoesObservacao
  **/
  @JsonProperty("situacoesObservacao")
  public Map<String, String> getSituacoesObservacao() {
    return situacoesObservacao;
  }

  public void setSituacoesObservacao(Map<String, String> situacoesObservacao) {
    this.situacoesObservacao = situacoesObservacao;
  }

  public DocumentoTransporteDTO situacoesObservacao(Map<String, String> situacoesObservacao) {
    this.situacoesObservacao = situacoesObservacao;
    return this;
  }

  public DocumentoTransporteDTO putSituacoesObservacaoItem(String key, String situacoesObservacaoItem) {
    this.situacoesObservacao.put(key, situacoesObservacaoItem);
    return this;
  }

 /**
   * Get dataEmissao
   * @return dataEmissao
  **/
  @JsonProperty("dataEmissao")
  public OffsetDateTime getDataEmissao() {
    return dataEmissao;
  }

  public void setDataEmissao(OffsetDateTime dataEmissao) {
    this.dataEmissao = dataEmissao;
  }

  public DocumentoTransporteDTO dataEmissao(OffsetDateTime dataEmissao) {
    this.dataEmissao = dataEmissao;
    return this;
  }

 /**
   * Get cpfCnpjTransportador
   * @return cpfCnpjTransportador
  **/
  @JsonProperty("cpfCnpjTransportador")
  public String getCpfCnpjTransportador() {
    return cpfCnpjTransportador;
  }

  public void setCpfCnpjTransportador(String cpfCnpjTransportador) {
    this.cpfCnpjTransportador = cpfCnpjTransportador;
  }

  public DocumentoTransporteDTO cpfCnpjTransportador(String cpfCnpjTransportador) {
    this.cpfCnpjTransportador = cpfCnpjTransportador;
    return this;
  }

 /**
   * Get nomeTransportador
   * @return nomeTransportador
  **/
  @JsonProperty("nomeTransportador")
  public String getNomeTransportador() {
    return nomeTransportador;
  }

  public void setNomeTransportador(String nomeTransportador) {
    this.nomeTransportador = nomeTransportador;
  }

  public DocumentoTransporteDTO nomeTransportador(String nomeTransportador) {
    this.nomeTransportador = nomeTransportador;
    return this;
  }

 /**
   * Get tipoDAT
   * @return tipoDAT
  **/
  @JsonProperty("tipoDAT")
  public Integer getTipoDAT() {
    return tipoDAT;
  }

  public void setTipoDAT(Integer tipoDAT) {
    this.tipoDAT = tipoDAT;
  }

  public DocumentoTransporteDTO tipoDAT(Integer tipoDAT) {
    this.tipoDAT = tipoDAT;
    return this;
  }

 /**
   * Get localOrigem
   * @return localOrigem
  **/
  @JsonProperty("localOrigem")
  public LocalDTO getLocalOrigem() {
    return localOrigem;
  }

  public void setLocalOrigem(LocalDTO localOrigem) {
    this.localOrigem = localOrigem;
  }

  public DocumentoTransporteDTO localOrigem(LocalDTO localOrigem) {
    this.localOrigem = localOrigem;
    return this;
  }

 /**
   * Get localDestinoPrevisto
   * @return localDestinoPrevisto
  **/
  @JsonProperty("localDestinoPrevisto")
  public LocalDTO getLocalDestinoPrevisto() {
    return localDestinoPrevisto;
  }

  public void setLocalDestinoPrevisto(LocalDTO localDestinoPrevisto) {
    this.localDestinoPrevisto = localDestinoPrevisto;
  }

  public DocumentoTransporteDTO localDestinoPrevisto(LocalDTO localDestinoPrevisto) {
    this.localDestinoPrevisto = localDestinoPrevisto;
    return this;
  }

 /**
   * Get localDestinoRealizado
   * @return localDestinoRealizado
  **/
  @JsonProperty("localDestinoRealizado")
  public LocalDTO getLocalDestinoRealizado() {
    return localDestinoRealizado;
  }

  public void setLocalDestinoRealizado(LocalDTO localDestinoRealizado) {
    this.localDestinoRealizado = localDestinoRealizado;
  }

  public DocumentoTransporteDTO localDestinoRealizado(LocalDTO localDestinoRealizado) {
    this.localDestinoRealizado = localDestinoRealizado;
    return this;
  }

 /**
   * Get veiculoFerroviario
   * @return veiculoFerroviario
  **/
  @JsonProperty("veiculoFerroviario")
  public VeiculoFerroviarioDTO getVeiculoFerroviario() {
    return veiculoFerroviario;
  }

  public void setVeiculoFerroviario(VeiculoFerroviarioDTO veiculoFerroviario) {
    this.veiculoFerroviario = veiculoFerroviario;
  }

  public DocumentoTransporteDTO veiculoFerroviario(VeiculoFerroviarioDTO veiculoFerroviario) {
    this.veiculoFerroviario = veiculoFerroviario;
    return this;
  }

 /**
   * Get veiculoRodoviario
   * @return veiculoRodoviario
  **/
  @JsonProperty("veiculoRodoviario")
  public VeiculoRodoviarioDTO getVeiculoRodoviario() {
    return veiculoRodoviario;
  }

  public void setVeiculoRodoviario(VeiculoRodoviarioDTO veiculoRodoviario) {
    this.veiculoRodoviario = veiculoRodoviario;
  }

  public DocumentoTransporteDTO veiculoRodoviario(VeiculoRodoviarioDTO veiculoRodoviario) {
    this.veiculoRodoviario = veiculoRodoviario;
    return this;
  }

 /**
   * Get conteineres
   * @return conteineres
  **/
  @JsonProperty("conteineres")
  public List<ConteinerDTO> getConteineres() {
    return conteineres;
  }

  public void setConteineres(List<ConteinerDTO> conteineres) {
    this.conteineres = conteineres;
  }

  public DocumentoTransporteDTO conteineres(List<ConteinerDTO> conteineres) {
    this.conteineres = conteineres;
    return this;
  }

  public DocumentoTransporteDTO addConteineresItem(ConteinerDTO conteineresItem) {
    this.conteineres.add(conteineresItem);
    return this;
  }

 /**
   * Get cargas
   * @return cargas
  **/
  @JsonProperty("cargas")
  public List<CargaDTO> getCargas() {
    return cargas;
  }

  public void setCargas(List<CargaDTO> cargas) {
    this.cargas = cargas;
  }

  public DocumentoTransporteDTO cargas(List<CargaDTO> cargas) {
    this.cargas = cargas;
    return this;
  }

  public DocumentoTransporteDTO addCargasItem(CargaDTO cargasItem) {
    this.cargas.add(cargasItem);
    return this;
  }

 /**
   * Get identificacaoVeiculo
   * @return identificacaoVeiculo
  **/
  @JsonProperty("identificacaoVeiculo")
  public String getIdentificacaoVeiculo() {
    return identificacaoVeiculo;
  }

  public void setIdentificacaoVeiculo(String identificacaoVeiculo) {
    this.identificacaoVeiculo = identificacaoVeiculo;
  }

  public DocumentoTransporteDTO identificacaoVeiculo(String identificacaoVeiculo) {
    this.identificacaoVeiculo = identificacaoVeiculo;
    return this;
  }

 /**
   * Get pesoBrutoTransportado
   * @return pesoBrutoTransportado
  **/
  @JsonProperty("pesoBrutoTransportado")
  public BigDecimal getPesoBrutoTransportado() {
    return pesoBrutoTransportado;
  }

  public void setPesoBrutoTransportado(BigDecimal pesoBrutoTransportado) {
    this.pesoBrutoTransportado = pesoBrutoTransportado;
  }

  public DocumentoTransporteDTO pesoBrutoTransportado(BigDecimal pesoBrutoTransportado) {
    this.pesoBrutoTransportado = pesoBrutoTransportado;
    return this;
  }

 /**
   * Get observacao
   * @return observacao
  **/
  @JsonProperty("observacao")
  public String getObservacao() {
    return observacao;
  }

  public void setObservacao(String observacao) {
    this.observacao = observacao;
  }

  public DocumentoTransporteDTO observacao(String observacao) {
    this.observacao = observacao;
    return this;
  }

 /**
   * Get dadosVeiculoConferem
   * @return dadosVeiculoConferem
  **/
  @JsonProperty("dadosVeiculoConferem")
  public String getDadosVeiculoConferem() {
    return dadosVeiculoConferem;
  }

  public void setDadosVeiculoConferem(String dadosVeiculoConferem) {
    this.dadosVeiculoConferem = dadosVeiculoConferem;
  }

  public DocumentoTransporteDTO dadosVeiculoConferem(String dadosVeiculoConferem) {
    this.dadosVeiculoConferem = dadosVeiculoConferem;
    return this;
  }

 /**
   * Get dadosUnidadeTransporteConferem
   * @return dadosUnidadeTransporteConferem
  **/
  @JsonProperty("dadosUnidadeTransporteConferem")
  public String getDadosUnidadeTransporteConferem() {
    return dadosUnidadeTransporteConferem;
  }

  public void setDadosUnidadeTransporteConferem(String dadosUnidadeTransporteConferem) {
    this.dadosUnidadeTransporteConferem = dadosUnidadeTransporteConferem;
  }

  public DocumentoTransporteDTO dadosUnidadeTransporteConferem(String dadosUnidadeTransporteConferem) {
    this.dadosUnidadeTransporteConferem = dadosUnidadeTransporteConferem;
    return this;
  }

 /**
   * Get dadosConteinerConferem
   * @return dadosConteinerConferem
  **/
  @JsonProperty("dadosConteinerConferem")
  public String getDadosConteinerConferem() {
    return dadosConteinerConferem;
  }

  public void setDadosConteinerConferem(String dadosConteinerConferem) {
    this.dadosConteinerConferem = dadosConteinerConferem;
  }

  public DocumentoTransporteDTO dadosConteinerConferem(String dadosConteinerConferem) {
    this.dadosConteinerConferem = dadosConteinerConferem;
    return this;
  }

 /**
   * Get dadosEmbalagemConferem
   * @return dadosEmbalagemConferem
  **/
  @JsonProperty("dadosEmbalagemConferem")
  public String getDadosEmbalagemConferem() {
    return dadosEmbalagemConferem;
  }

  public void setDadosEmbalagemConferem(String dadosEmbalagemConferem) {
    this.dadosEmbalagemConferem = dadosEmbalagemConferem;
  }

  public DocumentoTransporteDTO dadosEmbalagemConferem(String dadosEmbalagemConferem) {
    this.dadosEmbalagemConferem = dadosEmbalagemConferem;
    return this;
  }

 /**
   * Get cargaComAvaria
   * @return cargaComAvaria
  **/
  @JsonProperty("cargaComAvaria")
  public String getCargaComAvaria() {
    return cargaComAvaria;
  }

  public void setCargaComAvaria(String cargaComAvaria) {
    this.cargaComAvaria = cargaComAvaria;
  }

  public DocumentoTransporteDTO cargaComAvaria(String cargaComAvaria) {
    this.cargaComAvaria = cargaComAvaria;
    return this;
  }

 /**
   * Get descricaoAvaria
   * @return descricaoAvaria
  **/
  @JsonProperty("descricaoAvaria")
  public String getDescricaoAvaria() {
    return descricaoAvaria;
  }

  public void setDescricaoAvaria(String descricaoAvaria) {
    this.descricaoAvaria = descricaoAvaria;
  }

  public DocumentoTransporteDTO descricaoAvaria(String descricaoAvaria) {
    this.descricaoAvaria = descricaoAvaria;
    return this;
  }

 /**
   * Get cargaComDivergencia
   * @return cargaComDivergencia
  **/
  @JsonProperty("cargaComDivergencia")
  public String getCargaComDivergencia() {
    return cargaComDivergencia;
  }

  public void setCargaComDivergencia(String cargaComDivergencia) {
    this.cargaComDivergencia = cargaComDivergencia;
  }

  public DocumentoTransporteDTO cargaComDivergencia(String cargaComDivergencia) {
    this.cargaComDivergencia = cargaComDivergencia;
    return this;
  }

 /**
   * Get descricaoDivergencia
   * @return descricaoDivergencia
  **/
  @JsonProperty("descricaoDivergencia")
  public String getDescricaoDivergencia() {
    return descricaoDivergencia;
  }

  public void setDescricaoDivergencia(String descricaoDivergencia) {
    this.descricaoDivergencia = descricaoDivergencia;
  }

  public DocumentoTransporteDTO descricaoDivergencia(String descricaoDivergencia) {
    this.descricaoDivergencia = descricaoDivergencia;
    return this;
  }

 /**
   * Get observacaoRecepcao
   * @return observacaoRecepcao
  **/
  @JsonProperty("observacaoRecepcao")
  public String getObservacaoRecepcao() {
    return observacaoRecepcao;
  }

  public void setObservacaoRecepcao(String observacaoRecepcao) {
    this.observacaoRecepcao = observacaoRecepcao;
  }

  public DocumentoTransporteDTO observacaoRecepcao(String observacaoRecepcao) {
    this.observacaoRecepcao = observacaoRecepcao;
    return this;
  }

 /**
   * Get pesoAferido
   * @return pesoAferido
  **/
  @JsonProperty("pesoAferido")
  public BigDecimal getPesoAferido() {
    return pesoAferido;
  }

  public void setPesoAferido(BigDecimal pesoAferido) {
    this.pesoAferido = pesoAferido;
  }

  public DocumentoTransporteDTO pesoAferido(BigDecimal pesoAferido) {
    this.pesoAferido = pesoAferido;
    return this;
  }

 /**
   * Get motivoNaoPesagem
   * @return motivoNaoPesagem
  **/
  @JsonProperty("motivoNaoPesagem")
  public String getMotivoNaoPesagem() {
    return motivoNaoPesagem;
  }

  public void setMotivoNaoPesagem(String motivoNaoPesagem) {
    this.motivoNaoPesagem = motivoNaoPesagem;
  }

  public DocumentoTransporteDTO motivoNaoPesagem(String motivoNaoPesagem) {
    this.motivoNaoPesagem = motivoNaoPesagem;
    return this;
  }

 /**
   * Get dataHoraInicioTransito
   * @return dataHoraInicioTransito
  **/
  @JsonProperty("dataHoraInicioTransito")
  public OffsetDateTime getDataHoraInicioTransito() {
    return dataHoraInicioTransito;
  }

  public void setDataHoraInicioTransito(OffsetDateTime dataHoraInicioTransito) {
    this.dataHoraInicioTransito = dataHoraInicioTransito;
  }

  public DocumentoTransporteDTO dataHoraInicioTransito(OffsetDateTime dataHoraInicioTransito) {
    this.dataHoraInicioTransito = dataHoraInicioTransito;
    return this;
  }

 /**
   * Get dataHoraChegadaTransito
   * @return dataHoraChegadaTransito
  **/
  @JsonProperty("dataHoraChegadaTransito")
  public OffsetDateTime getDataHoraChegadaTransito() {
    return dataHoraChegadaTransito;
  }

  public void setDataHoraChegadaTransito(OffsetDateTime dataHoraChegadaTransito) {
    this.dataHoraChegadaTransito = dataHoraChegadaTransito;
  }

  public DocumentoTransporteDTO dataHoraChegadaTransito(OffsetDateTime dataHoraChegadaTransito) {
    this.dataHoraChegadaTransito = dataHoraChegadaTransito;
    return this;
  }

 /**
   * Get numeroLicencaOriginaria
   * @return numeroLicencaOriginaria
  **/
  @JsonProperty("numeroLicencaOriginaria")
  public String getNumeroLicencaOriginaria() {
    return numeroLicencaOriginaria;
  }

  public void setNumeroLicencaOriginaria(String numeroLicencaOriginaria) {
    this.numeroLicencaOriginaria = numeroLicencaOriginaria;
  }

  public DocumentoTransporteDTO numeroLicencaOriginaria(String numeroLicencaOriginaria) {
    this.numeroLicencaOriginaria = numeroLicencaOriginaria;
    return this;
  }

 /**
   * Get numeroLicComplTETI
   * @return numeroLicComplTETI
  **/
  @JsonProperty("numeroLicComplTETI")
  public String getNumeroLicComplTETI() {
    return numeroLicComplTETI;
  }

  public void setNumeroLicComplTETI(String numeroLicComplTETI) {
    this.numeroLicComplTETI = numeroLicComplTETI;
  }

  public DocumentoTransporteDTO numeroLicComplTETI(String numeroLicComplTETI) {
    this.numeroLicComplTETI = numeroLicComplTETI;
    return this;
  }

 /**
   * Get dataSolicitacaoTransito
   * @return dataSolicitacaoTransito
  **/
  @JsonProperty("dataSolicitacaoTransito")
  public OffsetDateTime getDataSolicitacaoTransito() {
    return dataSolicitacaoTransito;
  }

  public void setDataSolicitacaoTransito(OffsetDateTime dataSolicitacaoTransito) {
    this.dataSolicitacaoTransito = dataSolicitacaoTransito;
  }

  public DocumentoTransporteDTO dataSolicitacaoTransito(OffsetDateTime dataSolicitacaoTransito) {
    this.dataSolicitacaoTransito = dataSolicitacaoTransito;
    return this;
  }

 /**
   * Get descricaoViaDeTransporte
   * @return descricaoViaDeTransporte
  **/
  @JsonProperty("descricaoViaDeTransporte")
  public String getDescricaoViaDeTransporte() {
    return descricaoViaDeTransporte;
  }

  public void setDescricaoViaDeTransporte(String descricaoViaDeTransporte) {
    this.descricaoViaDeTransporte = descricaoViaDeTransporte;
  }

  public DocumentoTransporteDTO descricaoViaDeTransporte(String descricaoViaDeTransporte) {
    this.descricaoViaDeTransporte = descricaoViaDeTransporte;
    return this;
  }

 /**
   * Get descricaoTipoDocumentoTransporte
   * @return descricaoTipoDocumentoTransporte
  **/
  @JsonProperty("descricaoTipoDocumentoTransporte")
  public String getDescricaoTipoDocumentoTransporte() {
    return descricaoTipoDocumentoTransporte;
  }

  public void setDescricaoTipoDocumentoTransporte(String descricaoTipoDocumentoTransporte) {
    this.descricaoTipoDocumentoTransporte = descricaoTipoDocumentoTransporte;
  }

  public DocumentoTransporteDTO descricaoTipoDocumentoTransporte(String descricaoTipoDocumentoTransporte) {
    this.descricaoTipoDocumentoTransporte = descricaoTipoDocumentoTransporte;
    return this;
  }

 /**
   * Get urlConsulta
   * @return urlConsulta
  **/
  @JsonProperty("urlConsulta")
  public String getUrlConsulta() {
    return urlConsulta;
  }

  public void setUrlConsulta(String urlConsulta) {
    this.urlConsulta = urlConsulta;
  }

  public DocumentoTransporteDTO urlConsulta(String urlConsulta) {
    this.urlConsulta = urlConsulta;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentoTransporteDTO {\n");
    
    sb.append("    ano: ").append(toIndentedString(ano)).append("\n");
    sb.append("    sequencia: ").append(toIndentedString(sequencia)).append("\n");
    sb.append("    numeroDocumentoTransporte: ").append(toIndentedString(numeroDocumentoTransporte)).append("\n");
    sb.append("    tipoDocumentoTransporte: ").append(toIndentedString(tipoDocumentoTransporte)).append("\n");
    sb.append("    codigoViaTransporte: ").append(toIndentedString(codigoViaTransporte)).append("\n");
    sb.append("    situacaoAtual: ").append(toIndentedString(situacaoAtual)).append("\n");
    sb.append("    situacoesObservacao: ").append(toIndentedString(situacoesObservacao)).append("\n");
    sb.append("    dataEmissao: ").append(toIndentedString(dataEmissao)).append("\n");
    sb.append("    cpfCnpjTransportador: ").append(toIndentedString(cpfCnpjTransportador)).append("\n");
    sb.append("    nomeTransportador: ").append(toIndentedString(nomeTransportador)).append("\n");
    sb.append("    tipoDAT: ").append(toIndentedString(tipoDAT)).append("\n");
    sb.append("    localOrigem: ").append(toIndentedString(localOrigem)).append("\n");
    sb.append("    localDestinoPrevisto: ").append(toIndentedString(localDestinoPrevisto)).append("\n");
    sb.append("    localDestinoRealizado: ").append(toIndentedString(localDestinoRealizado)).append("\n");
    sb.append("    veiculoFerroviario: ").append(toIndentedString(veiculoFerroviario)).append("\n");
    sb.append("    veiculoRodoviario: ").append(toIndentedString(veiculoRodoviario)).append("\n");
    sb.append("    conteineres: ").append(toIndentedString(conteineres)).append("\n");
    sb.append("    cargas: ").append(toIndentedString(cargas)).append("\n");
    sb.append("    identificacaoVeiculo: ").append(toIndentedString(identificacaoVeiculo)).append("\n");
    sb.append("    pesoBrutoTransportado: ").append(toIndentedString(pesoBrutoTransportado)).append("\n");
    sb.append("    observacao: ").append(toIndentedString(observacao)).append("\n");
    sb.append("    dadosVeiculoConferem: ").append(toIndentedString(dadosVeiculoConferem)).append("\n");
    sb.append("    dadosUnidadeTransporteConferem: ").append(toIndentedString(dadosUnidadeTransporteConferem)).append("\n");
    sb.append("    dadosConteinerConferem: ").append(toIndentedString(dadosConteinerConferem)).append("\n");
    sb.append("    dadosEmbalagemConferem: ").append(toIndentedString(dadosEmbalagemConferem)).append("\n");
    sb.append("    cargaComAvaria: ").append(toIndentedString(cargaComAvaria)).append("\n");
    sb.append("    descricaoAvaria: ").append(toIndentedString(descricaoAvaria)).append("\n");
    sb.append("    cargaComDivergencia: ").append(toIndentedString(cargaComDivergencia)).append("\n");
    sb.append("    descricaoDivergencia: ").append(toIndentedString(descricaoDivergencia)).append("\n");
    sb.append("    observacaoRecepcao: ").append(toIndentedString(observacaoRecepcao)).append("\n");
    sb.append("    pesoAferido: ").append(toIndentedString(pesoAferido)).append("\n");
    sb.append("    motivoNaoPesagem: ").append(toIndentedString(motivoNaoPesagem)).append("\n");
    sb.append("    dataHoraInicioTransito: ").append(toIndentedString(dataHoraInicioTransito)).append("\n");
    sb.append("    dataHoraChegadaTransito: ").append(toIndentedString(dataHoraChegadaTransito)).append("\n");
    sb.append("    numeroLicencaOriginaria: ").append(toIndentedString(numeroLicencaOriginaria)).append("\n");
    sb.append("    numeroLicComplTETI: ").append(toIndentedString(numeroLicComplTETI)).append("\n");
    sb.append("    dataSolicitacaoTransito: ").append(toIndentedString(dataSolicitacaoTransito)).append("\n");
    sb.append("    descricaoViaDeTransporte: ").append(toIndentedString(descricaoViaDeTransporte)).append("\n");
    sb.append("    descricaoTipoDocumentoTransporte: ").append(toIndentedString(descricaoTipoDocumentoTransporte)).append("\n");
    sb.append("    urlConsulta: ").append(toIndentedString(urlConsulta)).append("\n");
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

