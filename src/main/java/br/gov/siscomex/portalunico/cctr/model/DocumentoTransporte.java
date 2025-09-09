package br.gov.siscomex.portalunico.cctr.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
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
import java.util.List;
import java.util.Map;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentoTransporte", propOrder =
        {"observacao", "tipoDocumentoTransporte", "cpfCnpjTransportador", "localDestinoPrevisto", "situacoesObservacao", "veiculoFerroviario", "conteineres", "dataEmissao", "descricaoAvaria", "cargaComDivergencia", "pesoBrutoTransportado", "cargaComAvaria", "dadosUnidadeTransporteConferem", "dadosEmbalagemConferem", "localEstoque", "viaTransporte", "tipoDAT", "veiculoRodoviario", "dadosConteinerConferem", "localManifestacao", "nomeTransportador", "dadosVeiculoConferem", "localOrigem", "numeroRUT", "cargas", "numeroDocumentoTransporte", "situacaoAtual", "descricaoDivergencia", "localDestinoRealizado", "observacaoRecepcao"
        })

@XmlRootElement(name = "DocumentoTransporte")
/**
 * Documento de Transporte
 **/
@ApiModel(description = "Documento de Transporte")
public class DocumentoTransporte {

    @XmlElement(name = "observacao")
    @ApiModelProperty(example = "Observações adicionais", value = "Observações adicionais")
    /**
     * Observações adicionais
     **/
    private String observacao = null;
    @XmlElement(name = "tipoDocumentoTransporte")
    @ApiModelProperty(value = "Tipo de documento de transporte")
    /**
     * Tipo de documento de transporte
     **/
    private TipoDocumentoTransporteEnum tipoDocumentoTransporte = null;
    @XmlElement(name = "cpfCnpjTransportador")
    @ApiModelProperty(example = "27657485000147", value = "CPF ou CNPJ do Transportador")
    /**
     * CPF ou CNPJ do Transportador
     **/
    private String cpfCnpjTransportador = null;
    @XmlElement(name = "localDestinoPrevisto")
    @ApiModelProperty(value = "")
    @Valid
    private Local localDestinoPrevisto = null;
    @XmlElement(name = "situacoesObservacao")
    @ApiModelProperty(value = "Situação do documento de transporte")
    /**
     * Situação do documento de transporte
     **/
    private Map<String, String> situacoesObservacao = null;
    @XmlElement(name = "veiculoFerroviario")
    @ApiModelProperty(value = "")
    @Valid
    private VeiculoFerroviario veiculoFerroviario = null;
    @XmlElement(name = "conteineres")
    @ApiModelProperty(value = "Lista de Contêineres vinculados ao documento de transporte")
    @Valid
    /**
     * Lista de Contêineres vinculados ao documento de transporte
     **/
    private List<Conteineres> conteineres = null;
    @XmlElement(name = "dataEmissao")
    @ApiModelProperty(example = "2019-01-04", value = "Data de Emissão do Documento de Transporte<br>No formato AAAA-MM-YY")
    /**
     * Data de Emissão do Documento de Transporte<br>No formato AAAA-MM-YY
     **/
    private String dataEmissao = null;
    @XmlElement(name = "descricaoAvaria")
    @ApiModelProperty(example = "Avarias identificadas", value = "Avarias identificadas")
    /**
     * Avarias identificadas
     **/
    private String descricaoAvaria = null;
    @XmlElement(name = "cargaComDivergencia")
    @ApiModelProperty(example = "N", value = "Indicador de divergências<br>Domínio: S = Sim, N = Não e NA = Não se aplica")
    /**
     * Indicador de divergências<br>Domínio: S = Sim, N = Não e NA = Não se aplica
     **/
    private String cargaComDivergencia = null;
    @XmlElement(name = "pesoBrutoTransportado")
    @ApiModelProperty(example = "9999.99", value = "Peso aferido na balança do recinto em Kg<br>Deve ser informado somente quando há informação de pesagem. Neste caso, é obrigatório.<br>Tamanho: 4.2<br>Formato: NNNN.NN")
    @Valid
    /**
     * Peso aferido na balança do recinto em Kg<br>Deve ser informado somente quando há informação de pesagem. Neste caso, é obrigatório.<br>Tamanho: 4.2<br>Formato: NNNN.NN
     **/
    private BigDecimal pesoBrutoTransportado = null;
    @XmlElement(name = "cargaComAvaria")
    @ApiModelProperty(example = "N", value = "Indicador de avarias<br>Domínio: S = Sim, N = Não e NA = Não se aplica")
    /**
     * Indicador de avarias<br>Domínio: S = Sim, N = Não e NA = Não se aplica
     **/
    private String cargaComAvaria = null;
    @XmlElement(name = "dadosUnidadeTransporteConferem")
    @ApiModelProperty(example = "N", value = "Indicador de conferência dos dados da unidade de transporte com os dados recepcionados<br>Domínio: S = Sim, N = Não e NA = Não se aplica")
    /**
     * Indicador de conferência dos dados da unidade de transporte com os dados recepcionados<br>Domínio: S = Sim, N = Não e NA = Não se aplica
     **/
    private String dadosUnidadeTransporteConferem = null;
    @XmlElement(name = "dadosEmbalagemConferem")
    @ApiModelProperty(example = "N", value = "Indicador de conferência dos dados das embalagens com os dados informados na entrega<br>Domínio: S = Sim, N = Não e NA = Não se aplica")
    /**
     * Indicador de conferência dos dados das embalagens com os dados informados na entrega<br>Domínio: S = Sim, N = Não e NA = Não se aplica
     **/
    private String dadosEmbalagemConferem = null;
    @XmlElement(name = "localEstoque")
    @ApiModelProperty(value = "")
    @Valid
    private Local localEstoque = null;
    @XmlElement(name = "viaTransporte")
    @ApiModelProperty(value = "")
    @Valid
    private ViaDeTransporteCCTDTO viaTransporte = null;
    @XmlElement(name = "tipoDAT")
    @ApiModelProperty(value = "Tipo do DAT")
    /**
     * Tipo do DAT
     **/
    private TipoDATEnum tipoDAT = null;
    @XmlElement(name = "veiculoRodoviario")
    @ApiModelProperty(value = "")
    @Valid
    private VeiculoRodovario veiculoRodoviario = null;
    @XmlElement(name = "dadosConteinerConferem")
    @ApiModelProperty(example = "N", value = "Indicador de conferência dos dados do contêiner com os dados recepcionados<br>Domínio: S = Sim, N = Não e NA = Não se aplica")
    /**
     * Indicador de conferência dos dados do contêiner com os dados recepcionados<br>Domínio: S = Sim, N = Não e NA = Não se aplica
     **/
    private String dadosConteinerConferem = null;
    @XmlElement(name = "localManifestacao")
    @ApiModelProperty(value = "")
    @Valid
    private Local localManifestacao = null;
    @XmlElement(name = "nomeTransportador")
    @ApiModelProperty(example = "IEYIQBEIWMVEU KXIXW DVNW", value = "Nome do Transportador")
    /**
     * Nome do Transportador
     **/
    private String nomeTransportador = null;
    @XmlElement(name = "dadosVeiculoConferem")
    @ApiModelProperty(example = "N", value = "Indicador de conferência dos dados do veículo com os dados recepcionados<br>Domínio: S = Sim, N = Não e NA = Não se aplica")
    /**
     * Indicador de conferência dos dados do veículo com os dados recepcionados<br>Domínio: S = Sim, N = Não e NA = Não se aplica
     **/
    private String dadosVeiculoConferem = null;
    @XmlElement(name = "localOrigem")
    @ApiModelProperty(value = "")
    @Valid
    private Local localOrigem = null;
    @XmlElement(name = "numeroRUT")
    @ApiModelProperty(example = "24BR000064T", value = "Número do RUT")
    /**
     * Número do RUT
     **/
    private String numeroRUT = null;
    @XmlElement(name = "cargas")
    @ApiModelProperty(value = "Lista de DUE’s e/ou RUC’s vinculados ao documento de transporte")
    @Valid
    /**
     * Lista de DUE’s e/ou RUC’s vinculados ao documento de transporte
     **/
    private List<Cargas> cargas = null;
    @XmlElement(name = "numeroDocumentoTransporte")
    @ApiModelProperty(example = "BR000000001", value = "Número do documento de transporte")
    /**
     * Número do documento de transporte
     **/
    private String numeroDocumentoTransporte = null;
    @XmlElement(name = "situacaoAtual")
    @ApiModelProperty(example = "Manifestado", value = "Situação do documento de transporte")
    /**
     * Situação do documento de transporte
     **/
    private String situacaoAtual = null;
    @XmlElement(name = "descricaoDivergencia")
    @ApiModelProperty(example = "Divergências identificadas", value = "Divergências identificadas")
    /**
     * Divergências identificadas
     **/
    private String descricaoDivergencia = null;
    @XmlElement(name = "localDestinoRealizado")
    @ApiModelProperty(value = "")
    @Valid
    private Local localDestinoRealizado = null;
    @XmlElement(name = "observacaoRecepcao")
    @ApiModelProperty(example = "Observações adicionais", value = "Observações adicionais")
    /**
     * Observações adicionais
     **/
    private String observacaoRecepcao = null;

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

    /**
     * Observações adicionais
     *
     * @return observacao
     **/
    @JsonProperty("observacao")
    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public DocumentoTransporte observacao(String observacao) {
        this.observacao = observacao;
        return this;
    }

    /**
     * Tipo de documento de transporte
     *
     * @return tipoDocumentoTransporte
     **/
    @JsonProperty("tipoDocumentoTransporte")
    public String getTipoDocumentoTransporte() {
        if (tipoDocumentoTransporte == null) {
            return null;
        }
        return tipoDocumentoTransporte.value();
    }

    public void setTipoDocumentoTransporte(TipoDocumentoTransporteEnum tipoDocumentoTransporte) {
        this.tipoDocumentoTransporte = tipoDocumentoTransporte;
    }

    public DocumentoTransporte tipoDocumentoTransporte(TipoDocumentoTransporteEnum tipoDocumentoTransporte) {
        this.tipoDocumentoTransporte = tipoDocumentoTransporte;
        return this;
    }

    /**
     * CPF ou CNPJ do Transportador
     *
     * @return cpfCnpjTransportador
     **/
    @JsonProperty("cpfCnpjTransportador")
    public String getCpfCnpjTransportador() {
        return cpfCnpjTransportador;
    }

    public void setCpfCnpjTransportador(String cpfCnpjTransportador) {
        this.cpfCnpjTransportador = cpfCnpjTransportador;
    }

    public DocumentoTransporte cpfCnpjTransportador(String cpfCnpjTransportador) {
        this.cpfCnpjTransportador = cpfCnpjTransportador;
        return this;
    }

    /**
     * Get localDestinoPrevisto
     *
     * @return localDestinoPrevisto
     **/
    @JsonProperty("localDestinoPrevisto")
    public Local getLocalDestinoPrevisto() {
        return localDestinoPrevisto;
    }

    public void setLocalDestinoPrevisto(Local localDestinoPrevisto) {
        this.localDestinoPrevisto = localDestinoPrevisto;
    }

    public DocumentoTransporte localDestinoPrevisto(Local localDestinoPrevisto) {
        this.localDestinoPrevisto = localDestinoPrevisto;
        return this;
    }

    /**
     * Situação do documento de transporte
     *
     * @return situacoesObservacao
     **/
    @JsonProperty("situacoesObservacao")
    public Map<String, String> getSituacoesObservacao() {
        return situacoesObservacao;
    }

    public void setSituacoesObservacao(Map<String, String> situacoesObservacao) {
        this.situacoesObservacao = situacoesObservacao;
    }

    public DocumentoTransporte situacoesObservacao(Map<String, String> situacoesObservacao) {
        this.situacoesObservacao = situacoesObservacao;
        return this;
    }

    public DocumentoTransporte putSituacoesObservacaoItem(String key, String situacoesObservacaoItem) {
        this.situacoesObservacao.put(key, situacoesObservacaoItem);
        return this;
    }

    /**
     * Get veiculoFerroviario
     *
     * @return veiculoFerroviario
     **/
    @JsonProperty("veiculoFerroviario")
    public VeiculoFerroviario getVeiculoFerroviario() {
        return veiculoFerroviario;
    }

    public void setVeiculoFerroviario(VeiculoFerroviario veiculoFerroviario) {
        this.veiculoFerroviario = veiculoFerroviario;
    }

    public DocumentoTransporte veiculoFerroviario(VeiculoFerroviario veiculoFerroviario) {
        this.veiculoFerroviario = veiculoFerroviario;
        return this;
    }

    /**
     * Lista de Contêineres vinculados ao documento de transporte
     *
     * @return conteineres
     **/
    @JsonProperty("conteineres")
    public List<Conteineres> getConteineres() {
        return conteineres;
    }

    public void setConteineres(List<Conteineres> conteineres) {
        this.conteineres = conteineres;
    }

    public DocumentoTransporte conteineres(List<Conteineres> conteineres) {
        this.conteineres = conteineres;
        return this;
    }

    public DocumentoTransporte addConteineresItem(Conteineres conteineresItem) {
        this.conteineres.add(conteineresItem);
        return this;
    }

    /**
     * Data de Emissão do Documento de Transporte&lt;br&gt;No formato AAAA-MM-YY
     *
     * @return dataEmissao
     **/
    @JsonProperty("dataEmissao")
    public String getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(String dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public DocumentoTransporte dataEmissao(String dataEmissao) {
        this.dataEmissao = dataEmissao;
        return this;
    }

    /**
     * Avarias identificadas
     *
     * @return descricaoAvaria
     **/
    @JsonProperty("descricaoAvaria")
    public String getDescricaoAvaria() {
        return descricaoAvaria;
    }

    public void setDescricaoAvaria(String descricaoAvaria) {
        this.descricaoAvaria = descricaoAvaria;
    }

    public DocumentoTransporte descricaoAvaria(String descricaoAvaria) {
        this.descricaoAvaria = descricaoAvaria;
        return this;
    }

    /**
     * Indicador de divergências&lt;br&gt;Domínio: S &#x3D; Sim, N &#x3D; Não e NA &#x3D; Não se aplica
     *
     * @return cargaComDivergencia
     **/
    @JsonProperty("cargaComDivergencia")
    public String getCargaComDivergencia() {
        return cargaComDivergencia;
    }

    public void setCargaComDivergencia(String cargaComDivergencia) {
        this.cargaComDivergencia = cargaComDivergencia;
    }

    public DocumentoTransporte cargaComDivergencia(String cargaComDivergencia) {
        this.cargaComDivergencia = cargaComDivergencia;
        return this;
    }

    /**
     * Peso aferido na balança do recinto em Kg&lt;br&gt;Deve ser informado somente quando há informação de pesagem. Neste caso, é obrigatório.&lt;br&gt;Tamanho: 4.2&lt;br&gt;Formato: NNNN.NN
     *
     * @return pesoBrutoTransportado
     **/
    @JsonProperty("pesoBrutoTransportado")
    public BigDecimal getPesoBrutoTransportado() {
        return pesoBrutoTransportado;
    }

    public void setPesoBrutoTransportado(BigDecimal pesoBrutoTransportado) {
        this.pesoBrutoTransportado = pesoBrutoTransportado;
    }

    public DocumentoTransporte pesoBrutoTransportado(BigDecimal pesoBrutoTransportado) {
        this.pesoBrutoTransportado = pesoBrutoTransportado;
        return this;
    }

    /**
     * Indicador de avarias&lt;br&gt;Domínio: S &#x3D; Sim, N &#x3D; Não e NA &#x3D; Não se aplica
     *
     * @return cargaComAvaria
     **/
    @JsonProperty("cargaComAvaria")
    public String getCargaComAvaria() {
        return cargaComAvaria;
    }

    public void setCargaComAvaria(String cargaComAvaria) {
        this.cargaComAvaria = cargaComAvaria;
    }

    public DocumentoTransporte cargaComAvaria(String cargaComAvaria) {
        this.cargaComAvaria = cargaComAvaria;
        return this;
    }

    /**
     * Indicador de conferência dos dados da unidade de transporte com os dados recepcionados&lt;br&gt;Domínio: S &#x3D; Sim, N &#x3D; Não e NA &#x3D; Não se aplica
     *
     * @return dadosUnidadeTransporteConferem
     **/
    @JsonProperty("dadosUnidadeTransporteConferem")
    public String getDadosUnidadeTransporteConferem() {
        return dadosUnidadeTransporteConferem;
    }

    public void setDadosUnidadeTransporteConferem(String dadosUnidadeTransporteConferem) {
        this.dadosUnidadeTransporteConferem = dadosUnidadeTransporteConferem;
    }

    public DocumentoTransporte dadosUnidadeTransporteConferem(String dadosUnidadeTransporteConferem) {
        this.dadosUnidadeTransporteConferem = dadosUnidadeTransporteConferem;
        return this;
    }

    /**
     * Indicador de conferência dos dados das embalagens com os dados informados na entrega&lt;br&gt;Domínio: S &#x3D; Sim, N &#x3D; Não e NA &#x3D; Não se aplica
     *
     * @return dadosEmbalagemConferem
     **/
    @JsonProperty("dadosEmbalagemConferem")
    public String getDadosEmbalagemConferem() {
        return dadosEmbalagemConferem;
    }

    public void setDadosEmbalagemConferem(String dadosEmbalagemConferem) {
        this.dadosEmbalagemConferem = dadosEmbalagemConferem;
    }

    public DocumentoTransporte dadosEmbalagemConferem(String dadosEmbalagemConferem) {
        this.dadosEmbalagemConferem = dadosEmbalagemConferem;
        return this;
    }

    /**
     * Get localEstoque
     *
     * @return localEstoque
     **/
    @JsonProperty("localEstoque")
    public Local getLocalEstoque() {
        return localEstoque;
    }

    public void setLocalEstoque(Local localEstoque) {
        this.localEstoque = localEstoque;
    }

    public DocumentoTransporte localEstoque(Local localEstoque) {
        this.localEstoque = localEstoque;
        return this;
    }

    /**
     * Get viaTransporte
     *
     * @return viaTransporte
     **/
    @JsonProperty("viaTransporte")
    public ViaDeTransporteCCTDTO getViaTransporte() {
        return viaTransporte;
    }

    public void setViaTransporte(ViaDeTransporteCCTDTO viaTransporte) {
        this.viaTransporte = viaTransporte;
    }

    public DocumentoTransporte viaTransporte(ViaDeTransporteCCTDTO viaTransporte) {
        this.viaTransporte = viaTransporte;
        return this;
    }

    /**
     * Tipo do DAT
     *
     * @return tipoDAT
     **/
    @JsonProperty("tipoDAT")
    public String getTipoDAT() {
        if (tipoDAT == null) {
            return null;
        }
        return tipoDAT.value();
    }

    public void setTipoDAT(TipoDATEnum tipoDAT) {
        this.tipoDAT = tipoDAT;
    }

    public DocumentoTransporte tipoDAT(TipoDATEnum tipoDAT) {
        this.tipoDAT = tipoDAT;
        return this;
    }

    /**
     * Get veiculoRodoviario
     *
     * @return veiculoRodoviario
     **/
    @JsonProperty("veiculoRodoviario")
    public VeiculoRodovario getVeiculoRodoviario() {
        return veiculoRodoviario;
    }

    public void setVeiculoRodoviario(VeiculoRodovario veiculoRodoviario) {
        this.veiculoRodoviario = veiculoRodoviario;
    }

    public DocumentoTransporte veiculoRodoviario(VeiculoRodovario veiculoRodoviario) {
        this.veiculoRodoviario = veiculoRodoviario;
        return this;
    }

    /**
     * Indicador de conferência dos dados do contêiner com os dados recepcionados&lt;br&gt;Domínio: S &#x3D; Sim, N &#x3D; Não e NA &#x3D; Não se aplica
     *
     * @return dadosConteinerConferem
     **/
    @JsonProperty("dadosConteinerConferem")
    public String getDadosConteinerConferem() {
        return dadosConteinerConferem;
    }

    public void setDadosConteinerConferem(String dadosConteinerConferem) {
        this.dadosConteinerConferem = dadosConteinerConferem;
    }

    public DocumentoTransporte dadosConteinerConferem(String dadosConteinerConferem) {
        this.dadosConteinerConferem = dadosConteinerConferem;
        return this;
    }

    /**
     * Get localManifestacao
     *
     * @return localManifestacao
     **/
    @JsonProperty("localManifestacao")
    public Local getLocalManifestacao() {
        return localManifestacao;
    }

    public void setLocalManifestacao(Local localManifestacao) {
        this.localManifestacao = localManifestacao;
    }

    public DocumentoTransporte localManifestacao(Local localManifestacao) {
        this.localManifestacao = localManifestacao;
        return this;
    }

    /**
     * Nome do Transportador
     *
     * @return nomeTransportador
     **/
    @JsonProperty("nomeTransportador")
    public String getNomeTransportador() {
        return nomeTransportador;
    }

    public void setNomeTransportador(String nomeTransportador) {
        this.nomeTransportador = nomeTransportador;
    }

    public DocumentoTransporte nomeTransportador(String nomeTransportador) {
        this.nomeTransportador = nomeTransportador;
        return this;
    }

    /**
     * Indicador de conferência dos dados do veículo com os dados recepcionados&lt;br&gt;Domínio: S &#x3D; Sim, N &#x3D; Não e NA &#x3D; Não se aplica
     *
     * @return dadosVeiculoConferem
     **/
    @JsonProperty("dadosVeiculoConferem")
    public String getDadosVeiculoConferem() {
        return dadosVeiculoConferem;
    }

    public void setDadosVeiculoConferem(String dadosVeiculoConferem) {
        this.dadosVeiculoConferem = dadosVeiculoConferem;
    }

    public DocumentoTransporte dadosVeiculoConferem(String dadosVeiculoConferem) {
        this.dadosVeiculoConferem = dadosVeiculoConferem;
        return this;
    }

    /**
     * Get localOrigem
     *
     * @return localOrigem
     **/
    @JsonProperty("localOrigem")
    public Local getLocalOrigem() {
        return localOrigem;
    }

    public void setLocalOrigem(Local localOrigem) {
        this.localOrigem = localOrigem;
    }

    public DocumentoTransporte localOrigem(Local localOrigem) {
        this.localOrigem = localOrigem;
        return this;
    }

    /**
     * Número do RUT
     *
     * @return numeroRUT
     **/
    @JsonProperty("numeroRUT")
    public String getNumeroRUT() {
        return numeroRUT;
    }

    public void setNumeroRUT(String numeroRUT) {
        this.numeroRUT = numeroRUT;
    }

    public DocumentoTransporte numeroRUT(String numeroRUT) {
        this.numeroRUT = numeroRUT;
        return this;
    }

    /**
     * Lista de DUE’s e/ou RUC’s vinculados ao documento de transporte
     *
     * @return cargas
     **/
    @JsonProperty("cargas")
    public List<Cargas> getCargas() {
        return cargas;
    }

    public void setCargas(List<Cargas> cargas) {
        this.cargas = cargas;
    }

    public DocumentoTransporte cargas(List<Cargas> cargas) {
        this.cargas = cargas;
        return this;
    }

    public DocumentoTransporte addCargasItem(Cargas cargasItem) {
        this.cargas.add(cargasItem);
        return this;
    }

    /**
     * Número do documento de transporte
     *
     * @return numeroDocumentoTransporte
     **/
    @JsonProperty("numeroDocumentoTransporte")
    public String getNumeroDocumentoTransporte() {
        return numeroDocumentoTransporte;
    }

    public void setNumeroDocumentoTransporte(String numeroDocumentoTransporte) {
        this.numeroDocumentoTransporte = numeroDocumentoTransporte;
    }

    public DocumentoTransporte numeroDocumentoTransporte(String numeroDocumentoTransporte) {
        this.numeroDocumentoTransporte = numeroDocumentoTransporte;
        return this;
    }

    /**
     * Situação do documento de transporte
     *
     * @return situacaoAtual
     **/
    @JsonProperty("situacaoAtual")
    public String getSituacaoAtual() {
        return situacaoAtual;
    }

    public void setSituacaoAtual(String situacaoAtual) {
        this.situacaoAtual = situacaoAtual;
    }

    public DocumentoTransporte situacaoAtual(String situacaoAtual) {
        this.situacaoAtual = situacaoAtual;
        return this;
    }

    /**
     * Divergências identificadas
     *
     * @return descricaoDivergencia
     **/
    @JsonProperty("descricaoDivergencia")
    public String getDescricaoDivergencia() {
        return descricaoDivergencia;
    }

    public void setDescricaoDivergencia(String descricaoDivergencia) {
        this.descricaoDivergencia = descricaoDivergencia;
    }

    public DocumentoTransporte descricaoDivergencia(String descricaoDivergencia) {
        this.descricaoDivergencia = descricaoDivergencia;
        return this;
    }

    /**
     * Get localDestinoRealizado
     *
     * @return localDestinoRealizado
     **/
    @JsonProperty("localDestinoRealizado")
    public Local getLocalDestinoRealizado() {
        return localDestinoRealizado;
    }

    public void setLocalDestinoRealizado(Local localDestinoRealizado) {
        this.localDestinoRealizado = localDestinoRealizado;
    }

    public DocumentoTransporte localDestinoRealizado(Local localDestinoRealizado) {
        this.localDestinoRealizado = localDestinoRealizado;
        return this;
    }

    /**
     * Observações adicionais
     *
     * @return observacaoRecepcao
     **/
    @JsonProperty("observacaoRecepcao")
    public String getObservacaoRecepcao() {
        return observacaoRecepcao;
    }

    public void setObservacaoRecepcao(String observacaoRecepcao) {
        this.observacaoRecepcao = observacaoRecepcao;
    }

    public DocumentoTransporte observacaoRecepcao(String observacaoRecepcao) {
        this.observacaoRecepcao = observacaoRecepcao;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class DocumentoTransporte {\n" +
                "    observacao: " + toIndentedString(observacao) + "\n" +
                "    tipoDocumentoTransporte: " + toIndentedString(tipoDocumentoTransporte) + "\n" +
                "    cpfCnpjTransportador: " + toIndentedString(cpfCnpjTransportador) + "\n" +
                "    localDestinoPrevisto: " + toIndentedString(localDestinoPrevisto) + "\n" +
                "    situacoesObservacao: " + toIndentedString(situacoesObservacao) + "\n" +
                "    veiculoFerroviario: " + toIndentedString(veiculoFerroviario) + "\n" +
                "    conteineres: " + toIndentedString(conteineres) + "\n" +
                "    dataEmissao: " + toIndentedString(dataEmissao) + "\n" +
                "    descricaoAvaria: " + toIndentedString(descricaoAvaria) + "\n" +
                "    cargaComDivergencia: " + toIndentedString(cargaComDivergencia) + "\n" +
                "    pesoBrutoTransportado: " + toIndentedString(pesoBrutoTransportado) + "\n" +
                "    cargaComAvaria: " + toIndentedString(cargaComAvaria) + "\n" +
                "    dadosUnidadeTransporteConferem: " + toIndentedString(dadosUnidadeTransporteConferem) + "\n" +
                "    dadosEmbalagemConferem: " + toIndentedString(dadosEmbalagemConferem) + "\n" +
                "    localEstoque: " + toIndentedString(localEstoque) + "\n" +
                "    viaTransporte: " + toIndentedString(viaTransporte) + "\n" +
                "    tipoDAT: " + toIndentedString(tipoDAT) + "\n" +
                "    veiculoRodoviario: " + toIndentedString(veiculoRodoviario) + "\n" +
                "    dadosConteinerConferem: " + toIndentedString(dadosConteinerConferem) + "\n" +
                "    localManifestacao: " + toIndentedString(localManifestacao) + "\n" +
                "    nomeTransportador: " + toIndentedString(nomeTransportador) + "\n" +
                "    dadosVeiculoConferem: " + toIndentedString(dadosVeiculoConferem) + "\n" +
                "    localOrigem: " + toIndentedString(localOrigem) + "\n" +
                "    numeroRUT: " + toIndentedString(numeroRUT) + "\n" +
                "    cargas: " + toIndentedString(cargas) + "\n" +
                "    numeroDocumentoTransporte: " + toIndentedString(numeroDocumentoTransporte) + "\n" +
                "    situacaoAtual: " + toIndentedString(situacaoAtual) + "\n" +
                "    descricaoDivergencia: " + toIndentedString(descricaoDivergencia) + "\n" +
                "    localDestinoRealizado: " + toIndentedString(localDestinoRealizado) + "\n" +
                "    observacaoRecepcao: " + toIndentedString(observacaoRecepcao) + "\n" +
                "}";
        return sb;
    }


    @XmlType(name = "TipoDocumentoTransporteEnum")
    @XmlEnum(String.class)
    public enum TipoDocumentoTransporteEnum {

        @XmlEnumValue("MIC_DTA")
        @JsonProperty("MIC_DTA")
        MIC_DTA("MIC_DTA"),

        @XmlEnumValue("TIF_DTA")
        @JsonProperty("TIF_DTA")
        TIF_DTA("TIF_DTA"),

        @XmlEnumValue("DTAI")
        @JsonProperty("DTAI")
        DTAI("DTAI"),

        @XmlEnumValue("DAT")
        @JsonProperty("DAT")
        DAT("DAT");


        private final String value;

        TipoDocumentoTransporteEnum(String v) {
            value = v;
        }

        public static TipoDocumentoTransporteEnum fromValue(String v) {
            for (TipoDocumentoTransporteEnum b : TipoDocumentoTransporteEnum.values()) {
                if (String.valueOf(b.value).equals(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "' to TipoDocumentoTransporteEnum");
        }

        public String value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
    }

    @XmlType(name = "TipoDATEnum")
    @XmlEnum(String.class)
    public enum TipoDATEnum {

        @XmlEnumValue("SIMPLIFICADO")
        @JsonProperty("SIMPLIFICADO")
        SIMPLIFICADO("SIMPLIFICADO"),

        @XmlEnumValue("COMPLETO")
        @JsonProperty("COMPLETO")
        COMPLETO("COMPLETO");


        private final String value;

        TipoDATEnum(String v) {
            value = v;
        }

        public static TipoDATEnum fromValue(String v) {
            for (TipoDATEnum b : TipoDATEnum.values()) {
                if (String.valueOf(b.value).equals(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "' to TipoDATEnum");
        }

        public String value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
    }
}
