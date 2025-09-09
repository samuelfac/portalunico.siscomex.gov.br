package br.gov.siscomex.portalunico.ccta.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.time.LocalDate;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ViagemRodoviariaCargaDetalhada", propOrder =
        {"conhecimentoManifestado", "cidadeTransportadorResponsabilizaCarga", "valorFca", "dataEmissaoCarga", "tipoCarga", "paisTransportadorResponsabilizaCarga", "documentosAnexos", "paisEntrega", "valorSeguro", "cidadeEntrega", "itensCarga", "numeroCarga", "cargaFracionada", "estoque", "unidadeAlfandegaDestinoFinal", "identificacaoConsignatario", "recintoAduaneiroAlfandegaDestinoFinal", "tipoIdentificacaoConsignatario", "valorFrete", "mercadorias", "nomeConsignatario"
        })

@XmlRootElement(name = "ViagemRodoviariaCargaDetalhada")
public class ViagemRodoviariaCargaDetalhada {

    @XmlElement(name = "conhecimentoManifestado")
    @ApiModelProperty(value = "")
    private Boolean conhecimentoManifestado = null;

    @XmlElement(name = "cidadeTransportadorResponsabilizaCarga")
    @ApiModelProperty(value = "")
    @Valid
    private Cidade cidadeTransportadorResponsabilizaCarga = null;

    @XmlElement(name = "valorFca")
    @ApiModelProperty(value = "")
    @Valid
    private ValorMonetario valorFca = null;

    @XmlElement(name = "dataEmissaoCarga")
    @ApiModelProperty(example = "Fri Aug 07 02:00:00 CEST 2020", value = "Data de emissão do CRT<br/>Formato: yyyy-MM-dd")
    /**
     * Data de emissão do CRT<br/>Formato: yyyy-MM-dd
     **/
    private LocalDate dataEmissaoCarga = null;

    @XmlElement(name = "tipoCarga")
    @ApiModelProperty(value = "")
    @Valid
    private TipoItemCargaCrt tipoCarga = null;

    @XmlElement(name = "paisTransportadorResponsabilizaCarga")
    @ApiModelProperty(value = "")
    @Valid
    private Pais paisTransportadorResponsabilizaCarga = null;

    @XmlElement(name = "documentosAnexos")
    @ApiModelProperty(value = "")
    @Valid
    private List<CargaRodoviariaDocumentoAnexo> documentosAnexos = null;

    @XmlElement(name = "paisEntrega")
    @ApiModelProperty(value = "")
    @Valid
    private Pais paisEntrega = null;

    @XmlElement(name = "valorSeguro")
    @ApiModelProperty(value = "")
    @Valid
    private ValorMonetario valorSeguro = null;

    @XmlElement(name = "cidadeEntrega")
    @ApiModelProperty(value = "")
    @Valid
    private Cidade cidadeEntrega = null;

    @XmlElement(name = "itensCarga")
    @ApiModelProperty(value = "")
    @Valid
    private List<ViagemRodoviariaDetalhadaItemCarga> itensCarga = null;

    @XmlElement(name = "numeroCarga")
    @ApiModelProperty(example = "UY172911152", value = "Número do CRT<br/> Tamanho Máximo: 15")
    /**
     * Número do CRT<br/> Tamanho Máximo: 15
     **/
    private String numeroCarga = null;

    @XmlElement(name = "cargaFracionada")
    @ApiModelProperty(value = "Indica se a carga está fracionada. (Cargas francionadas podem ser divididas em mais de uma viagem)")
    /**
     * Indica se a carga está fracionada. (Cargas francionadas podem ser divididas em mais de uma viagem)
     **/
    private Boolean cargaFracionada = null;

    @XmlElement(name = "estoque")
    @ApiModelProperty(value = "")
    @Valid
    private ViagemRodoviariaSituacaoResumida estoque = null;

    @XmlElement(name = "unidadeAlfandegaDestinoFinal")
    @ApiModelProperty(value = "")
    @Valid
    private UnidadeRfb unidadeAlfandegaDestinoFinal = null;

    @XmlElement(name = "identificacaoConsignatario")
    @ApiModelProperty(example = "00000000000191", value = "Identificação fiscal do consignatário da carga<br/>quando \"idTipoDocumentoConsignatario\"  for \"F\" ou \"J\" deverá estar ativo no cadastro de CPF/CNPJ<br/> Tamanho Máximo: 35")
    /**
     * Identificação fiscal do consignatário da carga<br/>quando \"idTipoDocumentoConsignatario\"  for \"F\" ou \"J\" deverá estar ativo no cadastro de CPF/CNPJ<br/> Tamanho Máximo: 35
     **/
    private String identificacaoConsignatario = null;

    @XmlElement(name = "recintoAduaneiroAlfandegaDestinoFinal")
    @ApiModelProperty(value = "")
    @Valid
    private Recinto recintoAduaneiroAlfandegaDestinoFinal = null;

    @XmlElement(name = "tipoIdentificacaoConsignatario")
    @ApiModelProperty(value = "")
    @Valid
    private TipoDocumento tipoIdentificacaoConsignatario = null;

    @XmlElement(name = "valorFrete")
    @ApiModelProperty(value = "")
    @Valid
    private ValorMonetario valorFrete = null;

    @XmlElement(name = "mercadorias")
    @ApiModelProperty(value = "")
    @Valid
    private List<CargaRodoviariaMercadoria> mercadorias = null;

    @XmlElement(name = "nomeConsignatario")
    @ApiModelProperty(value = "Nome do consignatario")
    /**
     * Nome do consignatario
     **/
    private String nomeConsignatario = null;

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
     * Get conhecimentoManifestado
     *
     * @return conhecimentoManifestado
     **/
    @JsonProperty("conhecimentoManifestado")
    public Boolean isisConhecimentoManifestado() {
        return conhecimentoManifestado;
    }

    public void setConhecimentoManifestado(Boolean conhecimentoManifestado) {
        this.conhecimentoManifestado = conhecimentoManifestado;
    }

    public ViagemRodoviariaCargaDetalhada conhecimentoManifestado(Boolean conhecimentoManifestado) {
        this.conhecimentoManifestado = conhecimentoManifestado;
        return this;
    }

    /**
     * Get cidadeTransportadorResponsabilizaCarga
     *
     * @return cidadeTransportadorResponsabilizaCarga
     **/
    @JsonProperty("cidadeTransportadorResponsabilizaCarga")
    public Cidade getCidadeTransportadorResponsabilizaCarga() {
        return cidadeTransportadorResponsabilizaCarga;
    }

    public void setCidadeTransportadorResponsabilizaCarga(Cidade cidadeTransportadorResponsabilizaCarga) {
        this.cidadeTransportadorResponsabilizaCarga = cidadeTransportadorResponsabilizaCarga;
    }

    public ViagemRodoviariaCargaDetalhada cidadeTransportadorResponsabilizaCarga(Cidade cidadeTransportadorResponsabilizaCarga) {
        this.cidadeTransportadorResponsabilizaCarga = cidadeTransportadorResponsabilizaCarga;
        return this;
    }

    /**
     * Get valorFca
     *
     * @return valorFca
     **/
    @JsonProperty("valorFca")
    public ValorMonetario getValorFca() {
        return valorFca;
    }

    public void setValorFca(ValorMonetario valorFca) {
        this.valorFca = valorFca;
    }

    public ViagemRodoviariaCargaDetalhada valorFca(ValorMonetario valorFca) {
        this.valorFca = valorFca;
        return this;
    }

    /**
     * Data de emissão do CRT&lt;br/&gt;Formato: yyyy-MM-dd
     *
     * @return dataEmissaoCarga
     **/
    @JsonProperty("dataEmissaoCarga")
    public LocalDate getDataEmissaoCarga() {
        return dataEmissaoCarga;
    }

    public void setDataEmissaoCarga(LocalDate dataEmissaoCarga) {
        this.dataEmissaoCarga = dataEmissaoCarga;
    }

    public ViagemRodoviariaCargaDetalhada dataEmissaoCarga(LocalDate dataEmissaoCarga) {
        this.dataEmissaoCarga = dataEmissaoCarga;
        return this;
    }

    /**
     * Get tipoCarga
     *
     * @return tipoCarga
     **/
    @JsonProperty("tipoCarga")
    public TipoItemCargaCrt getTipoCarga() {
        return tipoCarga;
    }

    public void setTipoCarga(TipoItemCargaCrt tipoCarga) {
        this.tipoCarga = tipoCarga;
    }

    public ViagemRodoviariaCargaDetalhada tipoCarga(TipoItemCargaCrt tipoCarga) {
        this.tipoCarga = tipoCarga;
        return this;
    }

    /**
     * Get paisTransportadorResponsabilizaCarga
     *
     * @return paisTransportadorResponsabilizaCarga
     **/
    @JsonProperty("paisTransportadorResponsabilizaCarga")
    public Pais getPaisTransportadorResponsabilizaCarga() {
        return paisTransportadorResponsabilizaCarga;
    }

    public void setPaisTransportadorResponsabilizaCarga(Pais paisTransportadorResponsabilizaCarga) {
        this.paisTransportadorResponsabilizaCarga = paisTransportadorResponsabilizaCarga;
    }

    public ViagemRodoviariaCargaDetalhada paisTransportadorResponsabilizaCarga(Pais paisTransportadorResponsabilizaCarga) {
        this.paisTransportadorResponsabilizaCarga = paisTransportadorResponsabilizaCarga;
        return this;
    }

    /**
     * Get documentosAnexos
     *
     * @return documentosAnexos
     **/
    @JsonProperty("documentosAnexos")
    public List<CargaRodoviariaDocumentoAnexo> getDocumentosAnexos() {
        return documentosAnexos;
    }

    public void setDocumentosAnexos(List<CargaRodoviariaDocumentoAnexo> documentosAnexos) {
        this.documentosAnexos = documentosAnexos;
    }

    public ViagemRodoviariaCargaDetalhada documentosAnexos(List<CargaRodoviariaDocumentoAnexo> documentosAnexos) {
        this.documentosAnexos = documentosAnexos;
        return this;
    }

    public ViagemRodoviariaCargaDetalhada addDocumentosAnexosItem(CargaRodoviariaDocumentoAnexo documentosAnexosItem) {
        this.documentosAnexos.add(documentosAnexosItem);
        return this;
    }

    /**
     * Get paisEntrega
     *
     * @return paisEntrega
     **/
    @JsonProperty("paisEntrega")
    public Pais getPaisEntrega() {
        return paisEntrega;
    }

    public void setPaisEntrega(Pais paisEntrega) {
        this.paisEntrega = paisEntrega;
    }

    public ViagemRodoviariaCargaDetalhada paisEntrega(Pais paisEntrega) {
        this.paisEntrega = paisEntrega;
        return this;
    }

    /**
     * Get valorSeguro
     *
     * @return valorSeguro
     **/
    @JsonProperty("valorSeguro")
    public ValorMonetario getValorSeguro() {
        return valorSeguro;
    }

    public void setValorSeguro(ValorMonetario valorSeguro) {
        this.valorSeguro = valorSeguro;
    }

    public ViagemRodoviariaCargaDetalhada valorSeguro(ValorMonetario valorSeguro) {
        this.valorSeguro = valorSeguro;
        return this;
    }

    /**
     * Get cidadeEntrega
     *
     * @return cidadeEntrega
     **/
    @JsonProperty("cidadeEntrega")
    public Cidade getCidadeEntrega() {
        return cidadeEntrega;
    }

    public void setCidadeEntrega(Cidade cidadeEntrega) {
        this.cidadeEntrega = cidadeEntrega;
    }

    public ViagemRodoviariaCargaDetalhada cidadeEntrega(Cidade cidadeEntrega) {
        this.cidadeEntrega = cidadeEntrega;
        return this;
    }

    /**
     * Get itensCarga
     *
     * @return itensCarga
     **/
    @JsonProperty("itensCarga")
    public List<ViagemRodoviariaDetalhadaItemCarga> getItensCarga() {
        return itensCarga;
    }

    public void setItensCarga(List<ViagemRodoviariaDetalhadaItemCarga> itensCarga) {
        this.itensCarga = itensCarga;
    }

    public ViagemRodoviariaCargaDetalhada itensCarga(List<ViagemRodoviariaDetalhadaItemCarga> itensCarga) {
        this.itensCarga = itensCarga;
        return this;
    }

    public ViagemRodoviariaCargaDetalhada addItensCargaItem(ViagemRodoviariaDetalhadaItemCarga itensCargaItem) {
        this.itensCarga.add(itensCargaItem);
        return this;
    }

    /**
     * Número do CRT&lt;br/&gt; Tamanho Máximo: 15
     *
     * @return numeroCarga
     **/
    @JsonProperty("numeroCarga")
    public String getNumeroCarga() {
        return numeroCarga;
    }

    public void setNumeroCarga(String numeroCarga) {
        this.numeroCarga = numeroCarga;
    }

    public ViagemRodoviariaCargaDetalhada numeroCarga(String numeroCarga) {
        this.numeroCarga = numeroCarga;
        return this;
    }

    /**
     * Indica se a carga está fracionada. (Cargas francionadas podem ser divididas em mais de uma viagem)
     *
     * @return cargaFracionada
     **/
    @JsonProperty("cargaFracionada")
    public Boolean isisCargaFracionada() {
        return cargaFracionada;
    }

    public void setCargaFracionada(Boolean cargaFracionada) {
        this.cargaFracionada = cargaFracionada;
    }

    public ViagemRodoviariaCargaDetalhada cargaFracionada(Boolean cargaFracionada) {
        this.cargaFracionada = cargaFracionada;
        return this;
    }

    /**
     * Get estoque
     *
     * @return estoque
     **/
    @JsonProperty("estoque")
    public ViagemRodoviariaSituacaoResumida getEstoque() {
        return estoque;
    }

    public void setEstoque(ViagemRodoviariaSituacaoResumida estoque) {
        this.estoque = estoque;
    }

    public ViagemRodoviariaCargaDetalhada estoque(ViagemRodoviariaSituacaoResumida estoque) {
        this.estoque = estoque;
        return this;
    }

    /**
     * Get unidadeAlfandegaDestinoFinal
     *
     * @return unidadeAlfandegaDestinoFinal
     **/
    @JsonProperty("unidadeAlfandegaDestinoFinal")
    public UnidadeRfb getUnidadeAlfandegaDestinoFinal() {
        return unidadeAlfandegaDestinoFinal;
    }

    public void setUnidadeAlfandegaDestinoFinal(UnidadeRfb unidadeAlfandegaDestinoFinal) {
        this.unidadeAlfandegaDestinoFinal = unidadeAlfandegaDestinoFinal;
    }

    public ViagemRodoviariaCargaDetalhada unidadeAlfandegaDestinoFinal(UnidadeRfb unidadeAlfandegaDestinoFinal) {
        this.unidadeAlfandegaDestinoFinal = unidadeAlfandegaDestinoFinal;
        return this;
    }

    /**
     * Identificação fiscal do consignatário da carga&lt;br/&gt;quando \&quot;idTipoDocumentoConsignatario\&quot;  for \&quot;F\&quot; ou \&quot;J\&quot; deverá estar ativo no cadastro de CPF/CNPJ&lt;br/&gt; Tamanho Máximo: 35
     *
     * @return identificacaoConsignatario
     **/
    @JsonProperty("identificacaoConsignatario")
    public String getIdentificacaoConsignatario() {
        return identificacaoConsignatario;
    }

    public void setIdentificacaoConsignatario(String identificacaoConsignatario) {
        this.identificacaoConsignatario = identificacaoConsignatario;
    }

    public ViagemRodoviariaCargaDetalhada identificacaoConsignatario(String identificacaoConsignatario) {
        this.identificacaoConsignatario = identificacaoConsignatario;
        return this;
    }

    /**
     * Get recintoAduaneiroAlfandegaDestinoFinal
     *
     * @return recintoAduaneiroAlfandegaDestinoFinal
     **/
    @JsonProperty("recintoAduaneiroAlfandegaDestinoFinal")
    public Recinto getRecintoAduaneiroAlfandegaDestinoFinal() {
        return recintoAduaneiroAlfandegaDestinoFinal;
    }

    public void setRecintoAduaneiroAlfandegaDestinoFinal(Recinto recintoAduaneiroAlfandegaDestinoFinal) {
        this.recintoAduaneiroAlfandegaDestinoFinal = recintoAduaneiroAlfandegaDestinoFinal;
    }

    public ViagemRodoviariaCargaDetalhada recintoAduaneiroAlfandegaDestinoFinal(Recinto recintoAduaneiroAlfandegaDestinoFinal) {
        this.recintoAduaneiroAlfandegaDestinoFinal = recintoAduaneiroAlfandegaDestinoFinal;
        return this;
    }

    /**
     * Get tipoIdentificacaoConsignatario
     *
     * @return tipoIdentificacaoConsignatario
     **/
    @JsonProperty("tipoIdentificacaoConsignatario")
    public TipoDocumento getTipoIdentificacaoConsignatario() {
        return tipoIdentificacaoConsignatario;
    }

    public void setTipoIdentificacaoConsignatario(TipoDocumento tipoIdentificacaoConsignatario) {
        this.tipoIdentificacaoConsignatario = tipoIdentificacaoConsignatario;
    }

    public ViagemRodoviariaCargaDetalhada tipoIdentificacaoConsignatario(TipoDocumento tipoIdentificacaoConsignatario) {
        this.tipoIdentificacaoConsignatario = tipoIdentificacaoConsignatario;
        return this;
    }

    /**
     * Get valorFrete
     *
     * @return valorFrete
     **/
    @JsonProperty("valorFrete")
    public ValorMonetario getValorFrete() {
        return valorFrete;
    }

    public void setValorFrete(ValorMonetario valorFrete) {
        this.valorFrete = valorFrete;
    }

    public ViagemRodoviariaCargaDetalhada valorFrete(ValorMonetario valorFrete) {
        this.valorFrete = valorFrete;
        return this;
    }

    /**
     * Get mercadorias
     *
     * @return mercadorias
     **/
    @JsonProperty("mercadorias")
    public List<CargaRodoviariaMercadoria> getMercadorias() {
        return mercadorias;
    }

    public void setMercadorias(List<CargaRodoviariaMercadoria> mercadorias) {
        this.mercadorias = mercadorias;
    }

    public ViagemRodoviariaCargaDetalhada mercadorias(List<CargaRodoviariaMercadoria> mercadorias) {
        this.mercadorias = mercadorias;
        return this;
    }

    public ViagemRodoviariaCargaDetalhada addMercadoriasItem(CargaRodoviariaMercadoria mercadoriasItem) {
        this.mercadorias.add(mercadoriasItem);
        return this;
    }

    /**
     * Nome do consignatario
     *
     * @return nomeConsignatario
     **/
    @JsonProperty("nomeConsignatario")
    public String getNomeConsignatario() {
        return nomeConsignatario;
    }

    public void setNomeConsignatario(String nomeConsignatario) {
        this.nomeConsignatario = nomeConsignatario;
    }

    public ViagemRodoviariaCargaDetalhada nomeConsignatario(String nomeConsignatario) {
        this.nomeConsignatario = nomeConsignatario;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class ViagemRodoviariaCargaDetalhada {\n" +
                "    conhecimentoManifestado: " + toIndentedString(conhecimentoManifestado) + "\n" +
                "    cidadeTransportadorResponsabilizaCarga: " + toIndentedString(cidadeTransportadorResponsabilizaCarga) + "\n" +
                "    valorFca: " + toIndentedString(valorFca) + "\n" +
                "    dataEmissaoCarga: " + toIndentedString(dataEmissaoCarga) + "\n" +
                "    tipoCarga: " + toIndentedString(tipoCarga) + "\n" +
                "    paisTransportadorResponsabilizaCarga: " + toIndentedString(paisTransportadorResponsabilizaCarga) + "\n" +
                "    documentosAnexos: " + toIndentedString(documentosAnexos) + "\n" +
                "    paisEntrega: " + toIndentedString(paisEntrega) + "\n" +
                "    valorSeguro: " + toIndentedString(valorSeguro) + "\n" +
                "    cidadeEntrega: " + toIndentedString(cidadeEntrega) + "\n" +
                "    itensCarga: " + toIndentedString(itensCarga) + "\n" +
                "    numeroCarga: " + toIndentedString(numeroCarga) + "\n" +
                "    cargaFracionada: " + toIndentedString(cargaFracionada) + "\n" +
                "    estoque: " + toIndentedString(estoque) + "\n" +
                "    unidadeAlfandegaDestinoFinal: " + toIndentedString(unidadeAlfandegaDestinoFinal) + "\n" +
                "    identificacaoConsignatario: " + toIndentedString(identificacaoConsignatario) + "\n" +
                "    recintoAduaneiroAlfandegaDestinoFinal: " + toIndentedString(recintoAduaneiroAlfandegaDestinoFinal) + "\n" +
                "    tipoIdentificacaoConsignatario: " + toIndentedString(tipoIdentificacaoConsignatario) + "\n" +
                "    valorFrete: " + toIndentedString(valorFrete) + "\n" +
                "    mercadorias: " + toIndentedString(mercadorias) + "\n" +
                "    nomeConsignatario: " + toIndentedString(nomeConsignatario) + "\n" +
                "}";
        return sb;
    }
}
