package br.gov.siscomex.portalunico.ccta.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ViagemRodoviariaDetalhadaInfoGeraisDadosViagem", propOrder =
        {"apoliceSeguro", "conteineresVazios", "documentoTransporte", "lacresAplicados", "observacoesGerais", "tipoTratamentoMadeira", "transitoAduaneiroInternacional", "transportadorImportador", "transportandoPecasOuPartesMadeira", "visualizacaoDepositario"
        })

@XmlRootElement(name = "ViagemRodoviariaDetalhadaInfoGeraisDadosViagem")
public class ViagemRodoviariaDetalhadaInfoGeraisDadosViagem {

    @XmlElement(name = "apoliceSeguro")
    @ApiModelProperty(value = "")
    @Valid
    private ApoliceSeguro apoliceSeguro = null;

    @XmlElement(name = "conteineresVazios")
    @ApiModelProperty(value = "")
    @Valid
    private List<Conteiner> conteineresVazios = null;

    @XmlElement(name = "documentoTransporte")
    @ApiModelProperty(value = "")
    @Valid
    private ViagemRodoviariaId documentoTransporte = null;

    @XmlElement(name = "lacresAplicados")
    @ApiModelProperty(value = "")
    @Valid
    private TipoAplicacaoLacre lacresAplicados = null;

    @XmlElement(name = "observacoesGerais")
    @ApiModelProperty(example = "Observações gerais.", value = "Observações gerais da viagem<br/> Tamanho Máximo: 500")
    /**
     * Observações gerais da viagem<br/> Tamanho Máximo: 500
     **/
    private String observacoesGerais = null;

    @XmlElement(name = "tipoTratamentoMadeira")
    @ApiModelProperty(value = "")
    @Valid
    private TipoTratamentoMadeira tipoTratamentoMadeira = null;

    @XmlElement(name = "transitoAduaneiroInternacional")
    @ApiModelProperty(value = "Indicador que informa se é trânsito aduaneiro internacional, ou seja, se haverá desembaraço na fronteira (false) ou seguirá por trânsito (true)")
    /**
     * Indicador que informa se é trânsito aduaneiro internacional, ou seja, se haverá desembaraço na fronteira (false) ou seguirá por trânsito (true)
     **/
    private Boolean transitoAduaneiroInternacional = null;

    @XmlElement(name = "transportadorImportador")
    @ApiModelProperty(value = "Indicador que informa se o transportador é o importador")
    /**
     * Indicador que informa se o transportador é o importador
     **/
    private Boolean transportadorImportador = null;

    @XmlElement(name = "transportandoPecasOuPartesMadeira")
    @ApiModelProperty(value = "Indica se o veículo está transportando itens em embalagem/suporte de madeira ")
    /**
     * Indica se o veículo está transportando itens em embalagem/suporte de madeira
     **/
    private Boolean transportandoPecasOuPartesMadeira = null;

    @XmlElement(name = "visualizacaoDepositario")
    @ApiModelProperty(value = "Indicador que informa se o depositário pode visualizar os dados de valor do frete, valor FCA e seguro informados nos CRTs da viagem.")
    /**
     * Indicador que informa se o depositário pode visualizar os dados de valor do frete, valor FCA e seguro informados nos CRTs da viagem.
     **/
    private Boolean visualizacaoDepositario = null;

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
     * Get apoliceSeguro
     *
     * @return apoliceSeguro
     **/
    @JsonProperty("apoliceSeguro")
    public ApoliceSeguro getApoliceSeguro() {
        return apoliceSeguro;
    }

    public void setApoliceSeguro(ApoliceSeguro apoliceSeguro) {
        this.apoliceSeguro = apoliceSeguro;
    }

    /**
     * Get conteineresVazios
     *
     * @return conteineresVazios
     **/
    @JsonProperty("conteineresVazios")
    public List<Conteiner> getConteineresVazios() {
        return conteineresVazios;
    }

    public void setConteineresVazios(List<Conteiner> conteineresVazios) {
        this.conteineresVazios = conteineresVazios;
    }

    public ViagemRodoviariaDetalhadaInfoGeraisDadosViagem conteineresVazios(List<Conteiner> conteineresVazios) {
        this.conteineresVazios = conteineresVazios;
        return this;
    }

    public ViagemRodoviariaDetalhadaInfoGeraisDadosViagem addConteineresVaziosItem(Conteiner conteineresVaziosItem) {
        this.conteineresVazios.add(conteineresVaziosItem);
        return this;
    }

    public ViagemRodoviariaDetalhadaInfoGeraisDadosViagem apoliceSeguro(ApoliceSeguro apoliceSeguro) {
        this.apoliceSeguro = apoliceSeguro;
        return this;
    }

    /**
     * Get documentoTransporte
     *
     * @return documentoTransporte
     **/
    @JsonProperty("documentoTransporte")
    public ViagemRodoviariaId getDocumentoTransporte() {
        return documentoTransporte;
    }

    public void setDocumentoTransporte(ViagemRodoviariaId documentoTransporte) {
        this.documentoTransporte = documentoTransporte;
    }

    /**
     * Get lacresAplicados
     *
     * @return lacresAplicados
     **/
    @JsonProperty("lacresAplicados")
    public TipoAplicacaoLacre getLacresAplicados() {
        return lacresAplicados;
    }

    public void setLacresAplicados(TipoAplicacaoLacre lacresAplicados) {
        this.lacresAplicados = lacresAplicados;
    }

    public ViagemRodoviariaDetalhadaInfoGeraisDadosViagem lacresAplicados(TipoAplicacaoLacre lacresAplicados) {
        this.lacresAplicados = lacresAplicados;
        return this;
    }

    public ViagemRodoviariaDetalhadaInfoGeraisDadosViagem documentoTransporte(ViagemRodoviariaId documentoTransporte) {
        this.documentoTransporte = documentoTransporte;
        return this;
    }

    /**
     * Observações gerais da viagem&lt;br/&gt; Tamanho Máximo: 500
     *
     * @return observacoesGerais
     **/
    @JsonProperty("observacoesGerais")
    public String getObservacoesGerais() {
        return observacoesGerais;
    }

    public void setObservacoesGerais(String observacoesGerais) {
        this.observacoesGerais = observacoesGerais;
    }

    /**
     * Get tipoTratamentoMadeira
     *
     * @return tipoTratamentoMadeira
     **/
    @JsonProperty("tipoTratamentoMadeira")
    public TipoTratamentoMadeira getTipoTratamentoMadeira() {
        return tipoTratamentoMadeira;
    }

    public void setTipoTratamentoMadeira(TipoTratamentoMadeira tipoTratamentoMadeira) {
        this.tipoTratamentoMadeira = tipoTratamentoMadeira;
    }

    public ViagemRodoviariaDetalhadaInfoGeraisDadosViagem tipoTratamentoMadeira(TipoTratamentoMadeira tipoTratamentoMadeira) {
        this.tipoTratamentoMadeira = tipoTratamentoMadeira;
        return this;
    }

    /**
     * Indicador que informa se é trânsito aduaneiro internacional, ou seja, se haverá desembaraço na fronteira (false) ou seguirá por trânsito (true)
     *
     * @return transitoAduaneiroInternacional
     **/
    @JsonProperty("transitoAduaneiroInternacional")
    public Boolean isisTransitoAduaneiroInternacional() {
        return transitoAduaneiroInternacional;
    }

    public void setTransitoAduaneiroInternacional(Boolean transitoAduaneiroInternacional) {
        this.transitoAduaneiroInternacional = transitoAduaneiroInternacional;
    }

    public ViagemRodoviariaDetalhadaInfoGeraisDadosViagem transitoAduaneiroInternacional(Boolean transitoAduaneiroInternacional) {
        this.transitoAduaneiroInternacional = transitoAduaneiroInternacional;
        return this;
    }

    public ViagemRodoviariaDetalhadaInfoGeraisDadosViagem observacoesGerais(String observacoesGerais) {
        this.observacoesGerais = observacoesGerais;
        return this;
    }

    /**
     * Indicador que informa se o transportador é o importador
     *
     * @return transportadorImportador
     **/
    @JsonProperty("transportadorImportador")
    public Boolean isisTransportadorImportador() {
        return transportadorImportador;
    }

    public void setTransportadorImportador(Boolean transportadorImportador) {
        this.transportadorImportador = transportadorImportador;
    }

    public ViagemRodoviariaDetalhadaInfoGeraisDadosViagem transportadorImportador(Boolean transportadorImportador) {
        this.transportadorImportador = transportadorImportador;
        return this;
    }

    /**
     * Indica se o veículo está transportando itens em embalagem/suporte de madeira
     *
     * @return transportandoPecasOuPartesMadeira
     **/
    @JsonProperty("transportandoPecasOuPartesMadeira")
    public Boolean isisTransportandoPecasOuPartesMadeira() {
        return transportandoPecasOuPartesMadeira;
    }

    public void setTransportandoPecasOuPartesMadeira(Boolean transportandoPecasOuPartesMadeira) {
        this.transportandoPecasOuPartesMadeira = transportandoPecasOuPartesMadeira;
    }

    /**
     * Indicador que informa se o depositário pode visualizar os dados de valor do frete, valor FCA e seguro informados nos CRTs da viagem.
     *
     * @return visualizacaoDepositario
     **/
    @JsonProperty("visualizacaoDepositario")
    public Boolean isisVisualizacaoDepositario() {
        return visualizacaoDepositario;
    }

    public void setVisualizacaoDepositario(Boolean visualizacaoDepositario) {
        this.visualizacaoDepositario = visualizacaoDepositario;
    }

    public ViagemRodoviariaDetalhadaInfoGeraisDadosViagem visualizacaoDepositario(Boolean visualizacaoDepositario) {
        this.visualizacaoDepositario = visualizacaoDepositario;
        return this;
    }

    public ViagemRodoviariaDetalhadaInfoGeraisDadosViagem transportandoPecasOuPartesMadeira(Boolean transportandoPecasOuPartesMadeira) {
        this.transportandoPecasOuPartesMadeira = transportandoPecasOuPartesMadeira;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class ViagemRodoviariaDetalhadaInfoGeraisDadosViagem {\n" +
                "    apoliceSeguro: " + toIndentedString(apoliceSeguro) + "\n" +
                "    conteineresVazios: " + toIndentedString(conteineresVazios) + "\n" +
                "    documentoTransporte: " + toIndentedString(documentoTransporte) + "\n" +
                "    lacresAplicados: " + toIndentedString(lacresAplicados) + "\n" +
                "    observacoesGerais: " + toIndentedString(observacoesGerais) + "\n" +
                "    tipoTratamentoMadeira: " + toIndentedString(tipoTratamentoMadeira) + "\n" +
                "    transitoAduaneiroInternacional: " + toIndentedString(transitoAduaneiroInternacional) + "\n" +
                "    transportadorImportador: " + toIndentedString(transportadorImportador) + "\n" +
                "    transportandoPecasOuPartesMadeira: " + toIndentedString(transportandoPecasOuPartesMadeira) + "\n" +
                "    visualizacaoDepositario: " + toIndentedString(visualizacaoDepositario) + "\n" +
                "}";
        return sb;
    }
}
