package br.gov.siscomex.portalunico.cctr.model;

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
import java.math.BigDecimal;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Manifestacao", propOrder =
        {"identificacaoManifestacao", "pesoBrutoTotalTransportado", "observacoes", "cpfTransportador", "localDestino", "veiculoRodoviario", "veiculoFerroviario", "cnpjTransportador", "conteineres", "documentosCarga", "viaTransporte", "tipoDAT"
        })

@XmlRootElement(name = "Manifestacao")
/**
 * Dados da Manifestação Nacional
 **/
@ApiModel(description = "Dados da Manifestação Nacional")
public class Manifestacao {

    @XmlElement(name = "identificacaoManifestacao", required = true)
    @ApiModelProperty(example = "MAN001", required = true, value = "Identificação da Manifestação<br>Esta informação não será armazenada pelo sistema, servindo apenas como uma identificação de cada manifesto no momento da exibição de eventuais mensagens de erro. Este campo é uma chave dentro do arquivo XML, não admitindo duplicatas.")
    /**
     * Identificação da Manifestação<br>Esta informação não será armazenada pelo sistema, servindo apenas como uma identificação de cada manifesto no momento da exibição de eventuais mensagens de erro. Este campo é uma chave dentro do arquivo XML, não admitindo duplicatas.
     **/
    private String identificacaoManifestacao = null;

    @XmlElement(name = "pesoBrutoTotalTransportado", required = true)
    @ApiModelProperty(example = "100.0", required = true, value = "Peso das cargas(sem o veículo)<br>Tamanho: 12.3<br>Formato: NNNNNNNNNNNN.NNN")
    @Valid
    /**
     * Peso das cargas(sem o veículo)<br>Tamanho: 12.3<br>Formato: NNNNNNNNNNNN.NNN
     **/
    private BigDecimal pesoBrutoTotalTransportado = null;

    @XmlElement(name = "observacoes")
    @ApiModelProperty(example = "Exemplo de observação", value = "Observações<br>Tamanho: 250")
    /**
     * Observações<br>Tamanho: 250
     **/
    private String observacoes = null;

    @XmlElement(name = "cpfTransportador")
    @ApiModelProperty(example = "00000000000", value = "CPF do Transportador<br>Tamanho: 11<br>Formato: NNNNNNNNNNN")
    /**
     * CPF do Transportador<br>Tamanho: 11<br>Formato: NNNNNNNNNNN
     **/
    private String cpfTransportador = null;

    @XmlElement(name = "localDestino", required = true)
    @ApiModelProperty(required = true, value = "")
    @Valid
    private LocalMunicipio localDestino = null;

    @XmlElement(name = "veiculoRodoviario")
    @ApiModelProperty(value = "")
    @Valid
    private VeiculoRodoviario veiculoRodoviario = null;

    @XmlElement(name = "veiculoFerroviario")
    @ApiModelProperty(value = "")
    @Valid
    private VeiculoFerroviario veiculoFerroviario = null;

    @XmlElement(name = "cnpjTransportador")
    @ApiModelProperty(example = "07396865000168", value = "Cnpj do Transportador<br>Tamanho: 14<br>Formato: NNNNNNNNNNNNNN")
    /**
     * Cnpj do Transportador<br>Tamanho: 14<br>Formato: NNNNNNNNNNNNNN
     **/
    private String cnpjTransportador = null;

    @XmlElement(name = "conteineres")
    @ApiModelProperty(value = "Informação de contêiner(es)")
    @Valid
    /**
     * Informação de contêiner(es)
     **/
    private List<Conteiner> conteineres = null;

    @XmlElement(name = "documentosCarga")
    @ApiModelProperty(value = "Informação referente a documentos de carga")
    @Valid
    /**
     * Informação referente a documentos de carga
     **/
    private List<Documento> documentosCarga = null;

    @XmlElement(name = "viaTransporte", required = true)
    @ApiModelProperty(example = "06", required = true, value = "Via de Transporte<br>Tamanho: 2<br>Formato: NN")
    /**
     * Via de Transporte<br>Tamanho: 2<br>Formato: NN
     **/
    private String viaTransporte = null;

    @XmlElement(name = "tipoDAT", required = true)
    @ApiModelProperty(example = "1", required = true, value = "Tipo do DAT<br>Tamanho: 1<br>Formato: N<br>Domínio: 1 = Completo, 2 = Simplificado")
    /**
     * Tipo do DAT<br>Tamanho: 1<br>Formato: N<br>Domínio: 1 = Completo, 2 = Simplificado
     **/
    private Integer tipoDAT = null;

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
     * Peso das cargas(sem o veículo)&lt;br&gt;Tamanho: 12.3&lt;br&gt;Formato: NNNNNNNNNNNN.NNN
     *
     * @return pesoBrutoTotalTransportado
     **/
    @JsonProperty("pesoBrutoTotalTransportado")
    @NotNull
    public BigDecimal getPesoBrutoTotalTransportado() {
        return pesoBrutoTotalTransportado;
    }

    public void setPesoBrutoTotalTransportado(BigDecimal pesoBrutoTotalTransportado) {
        this.pesoBrutoTotalTransportado = pesoBrutoTotalTransportado;
    }

    public Manifestacao pesoBrutoTotalTransportado(BigDecimal pesoBrutoTotalTransportado) {
        this.pesoBrutoTotalTransportado = pesoBrutoTotalTransportado;
        return this;
    }

    /**
     * Observações&lt;br&gt;Tamanho: 250
     *
     * @return observacoes
     **/
    @JsonProperty("observacoes")
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

    /**
     * CPF do Transportador&lt;br&gt;Tamanho: 11&lt;br&gt;Formato: NNNNNNNNNNN
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
     * Get localDestino
     *
     * @return localDestino
     **/
    @JsonProperty("localDestino")
    @NotNull
    public LocalMunicipio getLocalDestino() {
        return localDestino;
    }

    public void setLocalDestino(LocalMunicipio localDestino) {
        this.localDestino = localDestino;
    }

    public Manifestacao localDestino(LocalMunicipio localDestino) {
        this.localDestino = localDestino;
        return this;
    }

    /**
     * Get veiculoRodoviario
     *
     * @return veiculoRodoviario
     **/
    @JsonProperty("veiculoRodoviario")
    public VeiculoRodoviario getVeiculoRodoviario() {
        return veiculoRodoviario;
    }

    public void setVeiculoRodoviario(VeiculoRodoviario veiculoRodoviario) {
        this.veiculoRodoviario = veiculoRodoviario;
    }

    public Manifestacao veiculoRodoviario(VeiculoRodoviario veiculoRodoviario) {
        this.veiculoRodoviario = veiculoRodoviario;
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

    public Manifestacao veiculoFerroviario(VeiculoFerroviario veiculoFerroviario) {
        this.veiculoFerroviario = veiculoFerroviario;
        return this;
    }

    /**
     * Cnpj do Transportador&lt;br&gt;Tamanho: 14&lt;br&gt;Formato: NNNNNNNNNNNNNN
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
     * Informação de contêiner(es)
     *
     * @return conteineres
     **/
    @JsonProperty("conteineres")
    public List<Conteiner> getConteineres() {
        return conteineres;
    }

    public void setConteineres(List<Conteiner> conteineres) {
        this.conteineres = conteineres;
    }

    public Manifestacao conteineres(List<Conteiner> conteineres) {
        this.conteineres = conteineres;
        return this;
    }

    public Manifestacao addConteineresItem(Conteiner conteineresItem) {
        this.conteineres.add(conteineresItem);
        return this;
    }

    /**
     * Informação referente a documentos de carga
     *
     * @return documentosCarga
     **/
    @JsonProperty("documentosCarga")
    public List<Documento> getDocumentosCarga() {
        return documentosCarga;
    }

    public void setDocumentosCarga(List<Documento> documentosCarga) {
        this.documentosCarga = documentosCarga;
    }

    public Manifestacao documentosCarga(List<Documento> documentosCarga) {
        this.documentosCarga = documentosCarga;
        return this;
    }

    public Manifestacao addDocumentosCargaItem(Documento documentosCargaItem) {
        this.documentosCarga.add(documentosCargaItem);
        return this;
    }

    /**
     * Via de Transporte&lt;br&gt;Tamanho: 2&lt;br&gt;Formato: NN
     *
     * @return viaTransporte
     **/
    @JsonProperty("viaTransporte")
    @NotNull
    public String getViaTransporte() {
        return viaTransporte;
    }

    public void setViaTransporte(String viaTransporte) {
        this.viaTransporte = viaTransporte;
    }

    public Manifestacao viaTransporte(String viaTransporte) {
        this.viaTransporte = viaTransporte;
        return this;
    }

    /**
     * Tipo do DAT&lt;br&gt;Tamanho: 1&lt;br&gt;Formato: N&lt;br&gt;Domínio: 1 &#x3D; Completo, 2 &#x3D; Simplificado
     *
     * @return tipoDAT
     **/
    @JsonProperty("tipoDAT")
    @NotNull
    public Integer getTipoDAT() {
        return tipoDAT;
    }

    public void setTipoDAT(Integer tipoDAT) {
        this.tipoDAT = tipoDAT;
    }

    public Manifestacao tipoDAT(Integer tipoDAT) {
        this.tipoDAT = tipoDAT;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class Manifestacao {\n" +
                "    identificacaoManifestacao: " + toIndentedString(identificacaoManifestacao) + "\n" +
                "    pesoBrutoTotalTransportado: " + toIndentedString(pesoBrutoTotalTransportado) + "\n" +
                "    observacoes: " + toIndentedString(observacoes) + "\n" +
                "    cpfTransportador: " + toIndentedString(cpfTransportador) + "\n" +
                "    localDestino: " + toIndentedString(localDestino) + "\n" +
                "    veiculoRodoviario: " + toIndentedString(veiculoRodoviario) + "\n" +
                "    veiculoFerroviario: " + toIndentedString(veiculoFerroviario) + "\n" +
                "    cnpjTransportador: " + toIndentedString(cnpjTransportador) + "\n" +
                "    conteineres: " + toIndentedString(conteineres) + "\n" +
                "    documentosCarga: " + toIndentedString(documentosCarga) + "\n" +
                "    viaTransporte: " + toIndentedString(viaTransporte) + "\n" +
                "    tipoDAT: " + toIndentedString(tipoDAT) + "\n" +
                "}";
        return sb;
    }
}
