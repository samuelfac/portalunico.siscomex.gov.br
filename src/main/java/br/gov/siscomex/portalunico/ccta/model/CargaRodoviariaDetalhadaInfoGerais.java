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
@XmlType(name = "CargaRodoviariaDetalhadaInfoGerais", propOrder =
        {"seguro", "outrosCustos", "condicaoVendaMercadoriaLocalEmbarque", "itensCarga", "dadosBasicos", "instrucoesFormalidadesAlfandega", "valorMercadoriaLocalEmbarque", "mercadorias", "frete", "documentosAnexados", "valorReembolso", "declaracoesObservacoes", "valorMercadoriaDeclaradoRemetente"
        })

@XmlRootElement(name = "CargaRodoviariaDetalhadaInfoGerais")
public class CargaRodoviariaDetalhadaInfoGerais {

    @XmlElement(name = "seguro")
    @ApiModelProperty(value = "")
    @Valid
    private CargaRodoviariaSeguro seguro = null;

    @XmlElement(name = "outrosCustos")
    @ApiModelProperty(value = "")
    @Valid
    private CargaRodoviariaOutrosCustos outrosCustos = null;

    @XmlElement(name = "condicaoVendaMercadoriaLocalEmbarque")
    @ApiModelProperty(value = "")
    @Valid
    private CondicaoVendaMercadoria condicaoVendaMercadoriaLocalEmbarque = null;

    @XmlElement(name = "itensCarga")
    @ApiModelProperty(value = "")
    @Valid
    private List<CargaRodoviariaItemCarga> itensCarga = null;

    @XmlElement(name = "dadosBasicos")
    @ApiModelProperty(value = "")
    @Valid
    private CargaRodoviariaDetalhadaDadosBasicos dadosBasicos = null;

    @XmlElement(name = "instrucoesFormalidadesAlfandega")
    @ApiModelProperty(example = "Declarações e demais observações", value = "Declarações e demais observações")
    /**
     * Declarações e demais observações
     **/
    private String instrucoesFormalidadesAlfandega = null;

    @XmlElement(name = "valorMercadoriaLocalEmbarque")
    @ApiModelProperty(value = "")
    @Valid
    private ValorMonetario valorMercadoriaLocalEmbarque = null;

    @XmlElement(name = "mercadorias")
    @ApiModelProperty(value = "")
    @Valid
    private List<CargaRodoviariaMercadoria> mercadorias = null;

    @XmlElement(name = "frete")
    @ApiModelProperty(value = "")
    @Valid
    private CargaRodoviariaFrete frete = null;

    @XmlElement(name = "documentosAnexados")
    @ApiModelProperty(value = "")
    @Valid
    private List<CargaRodoviariaDocumentoAnexo> documentosAnexados = null;

    @XmlElement(name = "valorReembolso")
    @ApiModelProperty(value = "")
    @Valid
    private ValorMonetario valorReembolso = null;

    @XmlElement(name = "declaracoesObservacoes")
    @ApiModelProperty(example = "Declarações e demais observações", value = "Declarações e demais observações")
    /**
     * Declarações e demais observações
     **/
    private String declaracoesObservacoes = null;

    @XmlElement(name = "valorMercadoriaDeclaradoRemetente")
    @ApiModelProperty(value = "")
    @Valid
    private ValorMonetario valorMercadoriaDeclaradoRemetente = null;

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
     * Get seguro
     *
     * @return seguro
     **/
    @JsonProperty("seguro")
    public CargaRodoviariaSeguro getSeguro() {
        return seguro;
    }

    public void setSeguro(CargaRodoviariaSeguro seguro) {
        this.seguro = seguro;
    }

    public CargaRodoviariaDetalhadaInfoGerais seguro(CargaRodoviariaSeguro seguro) {
        this.seguro = seguro;
        return this;
    }

    /**
     * Get outrosCustos
     *
     * @return outrosCustos
     **/
    @JsonProperty("outrosCustos")
    public CargaRodoviariaOutrosCustos getOutrosCustos() {
        return outrosCustos;
    }

    public void setOutrosCustos(CargaRodoviariaOutrosCustos outrosCustos) {
        this.outrosCustos = outrosCustos;
    }

    public CargaRodoviariaDetalhadaInfoGerais outrosCustos(CargaRodoviariaOutrosCustos outrosCustos) {
        this.outrosCustos = outrosCustos;
        return this;
    }

    /**
     * Get condicaoVendaMercadoriaLocalEmbarque
     *
     * @return condicaoVendaMercadoriaLocalEmbarque
     **/
    @JsonProperty("condicaoVendaMercadoriaLocalEmbarque")
    public CondicaoVendaMercadoria getCondicaoVendaMercadoriaLocalEmbarque() {
        return condicaoVendaMercadoriaLocalEmbarque;
    }

    public void setCondicaoVendaMercadoriaLocalEmbarque(CondicaoVendaMercadoria condicaoVendaMercadoriaLocalEmbarque) {
        this.condicaoVendaMercadoriaLocalEmbarque = condicaoVendaMercadoriaLocalEmbarque;
    }

    public CargaRodoviariaDetalhadaInfoGerais condicaoVendaMercadoriaLocalEmbarque(CondicaoVendaMercadoria condicaoVendaMercadoriaLocalEmbarque) {
        this.condicaoVendaMercadoriaLocalEmbarque = condicaoVendaMercadoriaLocalEmbarque;
        return this;
    }

    /**
     * Get itensCarga
     *
     * @return itensCarga
     **/
    @JsonProperty("itensCarga")
    public List<CargaRodoviariaItemCarga> getItensCarga() {
        return itensCarga;
    }

    public void setItensCarga(List<CargaRodoviariaItemCarga> itensCarga) {
        this.itensCarga = itensCarga;
    }

    public CargaRodoviariaDetalhadaInfoGerais itensCarga(List<CargaRodoviariaItemCarga> itensCarga) {
        this.itensCarga = itensCarga;
        return this;
    }

    public CargaRodoviariaDetalhadaInfoGerais addItensCargaItem(CargaRodoviariaItemCarga itensCargaItem) {
        this.itensCarga.add(itensCargaItem);
        return this;
    }

    /**
     * Get dadosBasicos
     *
     * @return dadosBasicos
     **/
    @JsonProperty("dadosBasicos")
    public CargaRodoviariaDetalhadaDadosBasicos getDadosBasicos() {
        return dadosBasicos;
    }

    public void setDadosBasicos(CargaRodoviariaDetalhadaDadosBasicos dadosBasicos) {
        this.dadosBasicos = dadosBasicos;
    }

    public CargaRodoviariaDetalhadaInfoGerais dadosBasicos(CargaRodoviariaDetalhadaDadosBasicos dadosBasicos) {
        this.dadosBasicos = dadosBasicos;
        return this;
    }

    /**
     * Declarações e demais observações
     *
     * @return instrucoesFormalidadesAlfandega
     **/
    @JsonProperty("instrucoesFormalidadesAlfandega")
    public String getInstrucoesFormalidadesAlfandega() {
        return instrucoesFormalidadesAlfandega;
    }

    public void setInstrucoesFormalidadesAlfandega(String instrucoesFormalidadesAlfandega) {
        this.instrucoesFormalidadesAlfandega = instrucoesFormalidadesAlfandega;
    }

    public CargaRodoviariaDetalhadaInfoGerais instrucoesFormalidadesAlfandega(String instrucoesFormalidadesAlfandega) {
        this.instrucoesFormalidadesAlfandega = instrucoesFormalidadesAlfandega;
        return this;
    }

    /**
     * Get valorMercadoriaLocalEmbarque
     *
     * @return valorMercadoriaLocalEmbarque
     **/
    @JsonProperty("valorMercadoriaLocalEmbarque")
    public ValorMonetario getValorMercadoriaLocalEmbarque() {
        return valorMercadoriaLocalEmbarque;
    }

    public void setValorMercadoriaLocalEmbarque(ValorMonetario valorMercadoriaLocalEmbarque) {
        this.valorMercadoriaLocalEmbarque = valorMercadoriaLocalEmbarque;
    }

    public CargaRodoviariaDetalhadaInfoGerais valorMercadoriaLocalEmbarque(ValorMonetario valorMercadoriaLocalEmbarque) {
        this.valorMercadoriaLocalEmbarque = valorMercadoriaLocalEmbarque;
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

    public CargaRodoviariaDetalhadaInfoGerais mercadorias(List<CargaRodoviariaMercadoria> mercadorias) {
        this.mercadorias = mercadorias;
        return this;
    }

    public CargaRodoviariaDetalhadaInfoGerais addMercadoriasItem(CargaRodoviariaMercadoria mercadoriasItem) {
        this.mercadorias.add(mercadoriasItem);
        return this;
    }

    /**
     * Get frete
     *
     * @return frete
     **/
    @JsonProperty("frete")
    public CargaRodoviariaFrete getFrete() {
        return frete;
    }

    public void setFrete(CargaRodoviariaFrete frete) {
        this.frete = frete;
    }

    public CargaRodoviariaDetalhadaInfoGerais frete(CargaRodoviariaFrete frete) {
        this.frete = frete;
        return this;
    }

    /**
     * Get documentosAnexados
     *
     * @return documentosAnexados
     **/
    @JsonProperty("documentosAnexados")
    public List<CargaRodoviariaDocumentoAnexo> getDocumentosAnexados() {
        return documentosAnexados;
    }

    public void setDocumentosAnexados(List<CargaRodoviariaDocumentoAnexo> documentosAnexados) {
        this.documentosAnexados = documentosAnexados;
    }

    public CargaRodoviariaDetalhadaInfoGerais documentosAnexados(List<CargaRodoviariaDocumentoAnexo> documentosAnexados) {
        this.documentosAnexados = documentosAnexados;
        return this;
    }

    public CargaRodoviariaDetalhadaInfoGerais addDocumentosAnexadosItem(CargaRodoviariaDocumentoAnexo documentosAnexadosItem) {
        this.documentosAnexados.add(documentosAnexadosItem);
        return this;
    }

    /**
     * Get valorReembolso
     *
     * @return valorReembolso
     **/
    @JsonProperty("valorReembolso")
    public ValorMonetario getValorReembolso() {
        return valorReembolso;
    }

    public void setValorReembolso(ValorMonetario valorReembolso) {
        this.valorReembolso = valorReembolso;
    }

    public CargaRodoviariaDetalhadaInfoGerais valorReembolso(ValorMonetario valorReembolso) {
        this.valorReembolso = valorReembolso;
        return this;
    }

    /**
     * Declarações e demais observações
     *
     * @return declaracoesObservacoes
     **/
    @JsonProperty("declaracoesObservacoes")
    public String getDeclaracoesObservacoes() {
        return declaracoesObservacoes;
    }

    public void setDeclaracoesObservacoes(String declaracoesObservacoes) {
        this.declaracoesObservacoes = declaracoesObservacoes;
    }

    public CargaRodoviariaDetalhadaInfoGerais declaracoesObservacoes(String declaracoesObservacoes) {
        this.declaracoesObservacoes = declaracoesObservacoes;
        return this;
    }

    /**
     * Get valorMercadoriaDeclaradoRemetente
     *
     * @return valorMercadoriaDeclaradoRemetente
     **/
    @JsonProperty("valorMercadoriaDeclaradoRemetente")
    public ValorMonetario getValorMercadoriaDeclaradoRemetente() {
        return valorMercadoriaDeclaradoRemetente;
    }

    public void setValorMercadoriaDeclaradoRemetente(ValorMonetario valorMercadoriaDeclaradoRemetente) {
        this.valorMercadoriaDeclaradoRemetente = valorMercadoriaDeclaradoRemetente;
    }

    public CargaRodoviariaDetalhadaInfoGerais valorMercadoriaDeclaradoRemetente(ValorMonetario valorMercadoriaDeclaradoRemetente) {
        this.valorMercadoriaDeclaradoRemetente = valorMercadoriaDeclaradoRemetente;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class CargaRodoviariaDetalhadaInfoGerais {\n" +
                "    seguro: " + toIndentedString(seguro) + "\n" +
                "    outrosCustos: " + toIndentedString(outrosCustos) + "\n" +
                "    condicaoVendaMercadoriaLocalEmbarque: " + toIndentedString(condicaoVendaMercadoriaLocalEmbarque) + "\n" +
                "    itensCarga: " + toIndentedString(itensCarga) + "\n" +
                "    dadosBasicos: " + toIndentedString(dadosBasicos) + "\n" +
                "    instrucoesFormalidadesAlfandega: " + toIndentedString(instrucoesFormalidadesAlfandega) + "\n" +
                "    valorMercadoriaLocalEmbarque: " + toIndentedString(valorMercadoriaLocalEmbarque) + "\n" +
                "    mercadorias: " + toIndentedString(mercadorias) + "\n" +
                "    frete: " + toIndentedString(frete) + "\n" +
                "    documentosAnexados: " + toIndentedString(documentosAnexados) + "\n" +
                "    valorReembolso: " + toIndentedString(valorReembolso) + "\n" +
                "    declaracoesObservacoes: " + toIndentedString(declaracoesObservacoes) + "\n" +
                "    valorMercadoriaDeclaradoRemetente: " + toIndentedString(valorMercadoriaDeclaradoRemetente) + "\n" +
                "}";
        return sb;
    }
}
