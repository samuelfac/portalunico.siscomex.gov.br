package br.gov.siscomex.portalunico.cct_ext.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Manifestacao", propOrder =
        {"identificacaoManifestacao", "tipoDocumentoTransporte", "indCargaEnviadaDespacho", "cargaJaEmbarcada", "cnpjTransportador", "cpfTransportador", "codigoURF", "codigoRA", "coordenadas", "cnpjRespEstoqueCarga", "veiculoAereo", "veiculoAquaviario", "outroModal", "conhecimento", "transporteProprio", "observacoes"
        })

@XmlRootElement(name = "Manifestacao")
/**
 * Manifesto de Dados de Embarque para Exportação
 **/
@ApiModel(description = "Manifesto de Dados de Embarque para Exportação")
public class Manifestacao {

    @XmlElement(name = "identificacaoManifestacao", required = true)
    @ApiModelProperty(example = "MAN001", required = true, value = "Identificação da Manifestação<br>Esta informação não será armazenada pelo sistema, servindo apenas como uma identificação de cada manifesto no momento da exibição de eventuais mensagens de erro. Este campo é uma chave dentro do arquivo XML, não admitindo duplicatas.")
    /**
     * Identificação da Manifestação<br>Esta informação não será armazenada pelo sistema, servindo apenas como uma identificação de cada manifesto no momento da exibição de eventuais mensagens de erro. Este campo é uma chave dentro do arquivo XML, não admitindo duplicatas.
     **/
    private String identificacaoManifestacao = null;

    @XmlElement(name = "tipoDocumentoTransporte", required = true)
    @ApiModelProperty(example = "01", required = true, value = "Tipo de Documento de Transporte<br>Domínio<br>01 - MIC/DTA<br>02 - TIF/DTA<br>03 - DTAI<br>04 - Outros")
    /**
     * Tipo de Documento de Transporte<br>Domínio<br>01 - MIC/DTA<br>02 - TIF/DTA<br>03 - DTAI<br>04 - Outros
     **/
    private String tipoDocumentoTransporte = null;

    @XmlElement(name = "indCargaEnviadaDespacho", required = true)
    @ApiModelProperty(example = "N", required = true, value = "Indicador Carga Enviada para Despacho<br>Domínio: S (Sim), N(Não)")
    /**
     * Indicador Carga Enviada para Despacho<br>Domínio: S (Sim), N(Não)
     **/
    private String indCargaEnviadaDespacho = null;

    @XmlElement(name = "cargaJaEmbarcada", required = true)
    @ApiModelProperty(example = "S", required = true, value = "Indicador Carga já Embarcada<br>Domínio: S (Sim), N(Não)")
    /**
     * Indicador Carga já Embarcada<br>Domínio: S (Sim), N(Não)
     **/
    private String cargaJaEmbarcada = null;

    @XmlElement(name = "cnpjTransportador")
    @ApiModelProperty(example = "15573459000106", value = "CNPJ do Transportadorr<br>Tamanho: 14<br>Formato: NNNNNNNNNNNNNN<br>Informado e obrigatório apenas para transportador nacional do tipo pessoa jurídica.")
    /**
     * CNPJ do Transportadorr<br>Tamanho: 14<br>Formato: NNNNNNNNNNNNNN<br>Informado e obrigatório apenas para transportador nacional do tipo pessoa jurídica.
     **/
    private String cnpjTransportador = null;

    @XmlElement(name = "cpfTransportador")
    @ApiModelProperty(example = "15573459106", value = "CPF do Transportadorr<br>Tamanho: 11<br>Formato: NNNNNNNNNNN<br>Informado e obrigatório apenas para transportador nacional do tipo pessoa física.")
    /**
     * CPF do Transportadorr<br>Tamanho: 11<br>Formato: NNNNNNNNNNN<br>Informado e obrigatório apenas para transportador nacional do tipo pessoa física.
     **/
    private String cpfTransportador = null;

    @XmlElement(name = "codigoURF")
    @ApiModelProperty(example = "0717700", value = "Código da Unidade de Região FiscalF<br>Tamanho: 7<br>Formato: NNNNNNN<br>Obrigatório quando não foi informado um RA")
    /**
     * Código da Unidade de Região FiscalF<br>Tamanho: 7<br>Formato: NNNNNNN<br>Obrigatório quando não foi informado um RA
     **/
    private String codigoURF = null;

    @XmlElement(name = "codigoRA")
    @ApiModelProperty(example = "7911101", value = "Código do Recinto AduaneiroF<br>Tamanho: 7<br>Formato: NNNNNNN<br>Obrigatório quando não foi informada uma URF")
    /**
     * Código do Recinto AduaneiroF<br>Tamanho: 7<br>Formato: NNNNNNN<br>Obrigatório quando não foi informada uma URF
     **/
    private String codigoRA = null;

    @XmlElement(name = "coordenadas")
    @ApiModelProperty(value = "")
    @Valid
    private Coordenadas coordenadas = null;

    @XmlElement(name = "cnpjRespEstoqueCarga")
    @ApiModelProperty(example = "15573459000106", value = "CNPJ do responsável pelo estoque da carga<br>Tamanho: 14<br>Formato: NNNNNNNNNNNNNN<br>Obrigatório apenas para o manifesto de embarque de carga ainda não embarcada, quando foram informados URF + coordenadas e a carga não consta no estoque de um depositário.")
    /**
     * CNPJ do responsável pelo estoque da carga<br>Tamanho: 14<br>Formato: NNNNNNNNNNNNNN<br>Obrigatório apenas para o manifesto de embarque de carga ainda não embarcada, quando foram informados URF + coordenadas e a carga não consta no estoque de um depositário.
     **/
    private String cnpjRespEstoqueCarga = null;

    @XmlElement(name = "veiculoAereo")
    @ApiModelProperty(value = "")
    @Valid
    private VeiculoAereo veiculoAereo = null;

    @XmlElement(name = "veiculoAquaviario")
    @ApiModelProperty(value = "")
    @Valid
    private VeiculoAquaviario veiculoAquaviario = null;

    @XmlElement(name = "outroModal")
    @ApiModelProperty(value = "")
    @Valid
    private OutroModal outroModal = null;

    @XmlElement(name = "conhecimento")
    @ApiModelProperty(value = "Dados do conhecimento de carga<br>Informado e obrigatório apenas quando a manifestação dos dados de embarque for acobertada por conhecimento de carga.")
    @Valid
    /**
     * Dados do conhecimento de carga<br>Informado e obrigatório apenas quando a manifestação dos dados de embarque for acobertada por conhecimento de carga.
     **/
    private List<Conhecimento> conhecimento = null;

    @XmlElement(name = "transporteProprio")
    @ApiModelProperty(value = "")
    @Valid
    private TransporteProprio transporteProprio = null;

    @XmlElement(name = "observacoes", required = true)
    @ApiModelProperty(example = "ANIFESTO COM CONTEINER E DOCUMENTO", required = true, value = "Observações<br>Tamanho: 250")
    /**
     * Observações<br>Tamanho: 250
     **/
    private String observacoes = null;

    /**
     * Identificação da Manifestação&lt;br&gt;Esta informação não será armazenada pelo sistema, servindo apenas como uma identificação de cada manifesto no momento da exibição de eventuais mensagens de erro. Este campo é uma chave dentro do arquivo XML, não admitindo duplicatas.
     *
     * @return identificacaoManifestacao
     **/
    @JsonProperty("identificacaoManifestacao")
    @NotNull
    public String getIdentificacaoManifestacao() {
        return identificacaoManifestacao;
    }

    public void setIdentificacaoManifestacao(String identificacaoManifestacao) {
        this.identificacaoManifestacao = identificacaoManifestacao;
    }

    public Manifestacao identificacaoManifestacao(String identificacaoManifestacao) {
        this.identificacaoManifestacao = identificacaoManifestacao;
        return this;
    }

    /**
     * Tipo de Documento de Transporte&lt;br&gt;Domínio&lt;br&gt;01 - MIC/DTA&lt;br&gt;02 - TIF/DTA&lt;br&gt;03 - DTAI&lt;br&gt;04 - Outros
     *
     * @return tipoDocumentoTransporte
     **/
    @JsonProperty("tipoDocumentoTransporte")
    @NotNull
    public String getTipoDocumentoTransporte() {
        return tipoDocumentoTransporte;
    }

    public void setTipoDocumentoTransporte(String tipoDocumentoTransporte) {
        this.tipoDocumentoTransporte = tipoDocumentoTransporte;
    }

    public Manifestacao tipoDocumentoTransporte(String tipoDocumentoTransporte) {
        this.tipoDocumentoTransporte = tipoDocumentoTransporte;
        return this;
    }

    /**
     * Indicador Carga Enviada para Despacho&lt;br&gt;Domínio: S (Sim), N(Não)
     *
     * @return indCargaEnviadaDespacho
     **/
    @JsonProperty("indCargaEnviadaDespacho")
    @NotNull
    public String getIndCargaEnviadaDespacho() {
        return indCargaEnviadaDespacho;
    }

    public void setIndCargaEnviadaDespacho(String indCargaEnviadaDespacho) {
        this.indCargaEnviadaDespacho = indCargaEnviadaDespacho;
    }

    public Manifestacao indCargaEnviadaDespacho(String indCargaEnviadaDespacho) {
        this.indCargaEnviadaDespacho = indCargaEnviadaDespacho;
        return this;
    }

    /**
     * Indicador Carga já Embarcada&lt;br&gt;Domínio: S (Sim), N(Não)
     *
     * @return cargaJaEmbarcada
     **/
    @JsonProperty("cargaJaEmbarcada")
    @NotNull
    public String getCargaJaEmbarcada() {
        return cargaJaEmbarcada;
    }

    public void setCargaJaEmbarcada(String cargaJaEmbarcada) {
        this.cargaJaEmbarcada = cargaJaEmbarcada;
    }

    public Manifestacao cargaJaEmbarcada(String cargaJaEmbarcada) {
        this.cargaJaEmbarcada = cargaJaEmbarcada;
        return this;
    }

    /**
     * CNPJ do Transportadorr&lt;br&gt;Tamanho: 14&lt;br&gt;Formato: NNNNNNNNNNNNNN&lt;br&gt;Informado e obrigatório apenas para transportador nacional do tipo pessoa jurídica.
     *
     * @return cnpjTransportador
     **/
    @JsonProperty("cnpjTransportador")
    public String getCnpjTransportador() {
        return cnpjTransportador;
    }

    public void setCnpjTransportador(String cnpjTransportador) {
        this.cnpjTransportador = cnpjTransportador;
    }

    public Manifestacao cnpjTransportador(String cnpjTransportador) {
        this.cnpjTransportador = cnpjTransportador;
        return this;
    }

    /**
     * CPF do Transportadorr&lt;br&gt;Tamanho: 11&lt;br&gt;Formato: NNNNNNNNNNN&lt;br&gt;Informado e obrigatório apenas para transportador nacional do tipo pessoa física.
     *
     * @return cpfTransportador
     **/
    @JsonProperty("cpfTransportador")
    public String getCpfTransportador() {
        return cpfTransportador;
    }

    public void setCpfTransportador(String cpfTransportador) {
        this.cpfTransportador = cpfTransportador;
    }

    public Manifestacao cpfTransportador(String cpfTransportador) {
        this.cpfTransportador = cpfTransportador;
        return this;
    }

    /**
     * Código da Unidade de Região FiscalF&lt;br&gt;Tamanho: 7&lt;br&gt;Formato: NNNNNNN&lt;br&gt;Obrigatório quando não foi informado um RA
     *
     * @return codigoURF
     **/
    @JsonProperty("codigoURF")
    public String getCodigoURF() {
        return codigoURF;
    }

    public void setCodigoURF(String codigoURF) {
        this.codigoURF = codigoURF;
    }

    public Manifestacao codigoURF(String codigoURF) {
        this.codigoURF = codigoURF;
        return this;
    }

    /**
     * Código do Recinto AduaneiroF&lt;br&gt;Tamanho: 7&lt;br&gt;Formato: NNNNNNN&lt;br&gt;Obrigatório quando não foi informada uma URF
     *
     * @return codigoRA
     **/
    @JsonProperty("codigoRA")
    public String getCodigoRA() {
        return codigoRA;
    }

    public void setCodigoRA(String codigoRA) {
        this.codigoRA = codigoRA;
    }

    public Manifestacao codigoRA(String codigoRA) {
        this.codigoRA = codigoRA;
        return this;
    }

    /**
     * Get coordenadas
     *
     * @return coordenadas
     **/
    @JsonProperty("coordenadas")
    public Coordenadas getCoordenadas() {
        return coordenadas;
    }

    public void setCoordenadas(Coordenadas coordenadas) {
        this.coordenadas = coordenadas;
    }

    public Manifestacao coordenadas(Coordenadas coordenadas) {
        this.coordenadas = coordenadas;
        return this;
    }

    /**
     * CNPJ do responsável pelo estoque da carga&lt;br&gt;Tamanho: 14&lt;br&gt;Formato: NNNNNNNNNNNNNN&lt;br&gt;Obrigatório apenas para o manifesto de embarque de carga ainda não embarcada, quando foram informados URF + coordenadas e a carga não consta no estoque de um depositário.
     *
     * @return cnpjRespEstoqueCarga
     **/
    @JsonProperty("cnpjRespEstoqueCarga")
    public String getCnpjRespEstoqueCarga() {
        return cnpjRespEstoqueCarga;
    }

    public void setCnpjRespEstoqueCarga(String cnpjRespEstoqueCarga) {
        this.cnpjRespEstoqueCarga = cnpjRespEstoqueCarga;
    }

    public Manifestacao cnpjRespEstoqueCarga(String cnpjRespEstoqueCarga) {
        this.cnpjRespEstoqueCarga = cnpjRespEstoqueCarga;
        return this;
    }

    /**
     * Get veiculoAereo
     *
     * @return veiculoAereo
     **/
    @JsonProperty("veiculoAereo")
    public VeiculoAereo getVeiculoAereo() {
        return veiculoAereo;
    }

    public void setVeiculoAereo(VeiculoAereo veiculoAereo) {
        this.veiculoAereo = veiculoAereo;
    }

    public Manifestacao veiculoAereo(VeiculoAereo veiculoAereo) {
        this.veiculoAereo = veiculoAereo;
        return this;
    }

    /**
     * Get veiculoAquaviario
     *
     * @return veiculoAquaviario
     **/
    @JsonProperty("veiculoAquaviario")
    public VeiculoAquaviario getVeiculoAquaviario() {
        return veiculoAquaviario;
    }

    public void setVeiculoAquaviario(VeiculoAquaviario veiculoAquaviario) {
        this.veiculoAquaviario = veiculoAquaviario;
    }

    public Manifestacao veiculoAquaviario(VeiculoAquaviario veiculoAquaviario) {
        this.veiculoAquaviario = veiculoAquaviario;
        return this;
    }

    /**
     * Get outroModal
     *
     * @return outroModal
     **/
    @JsonProperty("outroModal")
    public OutroModal getOutroModal() {
        return outroModal;
    }

    public void setOutroModal(OutroModal outroModal) {
        this.outroModal = outroModal;
    }

    public Manifestacao outroModal(OutroModal outroModal) {
        this.outroModal = outroModal;
        return this;
    }

    /**
     * Dados do conhecimento de carga&lt;br&gt;Informado e obrigatório apenas quando a manifestação dos dados de embarque for acobertada por conhecimento de carga.
     *
     * @return conhecimento
     **/
    @JsonProperty("conhecimento")
    public List<Conhecimento> getConhecimento() {
        return conhecimento;
    }

    public void setConhecimento(List<Conhecimento> conhecimento) {
        this.conhecimento = conhecimento;
    }

    public Manifestacao conhecimento(List<Conhecimento> conhecimento) {
        this.conhecimento = conhecimento;
        return this;
    }

    public Manifestacao addConhecimentoItem(Conhecimento conhecimentoItem) {
        this.conhecimento.add(conhecimentoItem);
        return this;
    }

    /**
     * Get transporteProprio
     *
     * @return transporteProprio
     **/
    @JsonProperty("transporteProprio")
    public TransporteProprio getTransporteProprio() {
        return transporteProprio;
    }

    public void setTransporteProprio(TransporteProprio transporteProprio) {
        this.transporteProprio = transporteProprio;
    }

    public Manifestacao transporteProprio(TransporteProprio transporteProprio) {
        this.transporteProprio = transporteProprio;
        return this;
    }

    /**
     * Observações&lt;br&gt;Tamanho: 250
     *
     * @return observacoes
     **/
    @JsonProperty("observacoes")
    @NotNull
    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public Manifestacao observacoes(String observacoes) {
        this.observacoes = observacoes;
        return this;
    }


    @Override
    public String toString() {

        String sb = "class Manifestacao {\n" +
                "    identificacaoManifestacao: " + toIndentedString(identificacaoManifestacao) + "\n" +
                "    tipoDocumentoTransporte: " + toIndentedString(tipoDocumentoTransporte) + "\n" +
                "    indCargaEnviadaDespacho: " + toIndentedString(indCargaEnviadaDespacho) + "\n" +
                "    cargaJaEmbarcada: " + toIndentedString(cargaJaEmbarcada) + "\n" +
                "    cnpjTransportador: " + toIndentedString(cnpjTransportador) + "\n" +
                "    cpfTransportador: " + toIndentedString(cpfTransportador) + "\n" +
                "    codigoURF: " + toIndentedString(codigoURF) + "\n" +
                "    codigoRA: " + toIndentedString(codigoRA) + "\n" +
                "    coordenadas: " + toIndentedString(coordenadas) + "\n" +
                "    cnpjRespEstoqueCarga: " + toIndentedString(cnpjRespEstoqueCarga) + "\n" +
                "    veiculoAereo: " + toIndentedString(veiculoAereo) + "\n" +
                "    veiculoAquaviario: " + toIndentedString(veiculoAquaviario) + "\n" +
                "    outroModal: " + toIndentedString(outroModal) + "\n" +
                "    conhecimento: " + toIndentedString(conhecimento) + "\n" +
                "    transporteProprio: " + toIndentedString(transporteProprio) + "\n" +
                "    observacoes: " + toIndentedString(observacoes) + "\n" +
                "}";
        return sb;
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

