package br.gov.siscomex.portalunico.cct_imp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultaEstoquePosDetails", propOrder =
        {"local", "numeroRUC", "numeroConhecimento", "numeroCEMercante", "existeConteiner", "conteineres", "cargas", "veiculos", "numeroDUIMP", "situacao", "canal", "importador", "indicacaoDeImportacaoParaTerceiros", "valorTotalMercadoriaNoLocalDescarregamento", "destinoFinalCarga", "nomeConsignatario", "paisOrigemCarga", "entregaAutorizadaPelaDuimp", "entregaAutorizadaPeloSiscomexCarga"
        })

@XmlRootElement(name = "ConsultaEstoquePosDetails")
public class ConsultaEstoquePosDetails {

    @XmlElement(name = "local")
    @ApiModelProperty(value = "")
    @Valid
    private LocalDTO local = null;

    @XmlElement(name = "numeroRUC")
    @ApiModelProperty(example = "4US00055555200000000000000000000715", value = "Número da RUC")
    /**
     * Número da RUC
     **/
    private String numeroRUC = null;

    @XmlElement(name = "numeroConhecimento")
    @ApiModelProperty(example = "CON011748926659858", value = "Número do BL original do conhecimento")
    /**
     * Número do BL original do conhecimento
     **/
    private String numeroConhecimento = null;

    @XmlElement(name = "numeroCEMercante")
    @ApiModelProperty(example = "132405005073923", value = "Número de CE Mercante")
    /**
     * Número de CE Mercante
     **/
    private String numeroCEMercante = null;

    @XmlElement(name = "existeConteiner")
    @ApiModelProperty(example = "S", value = "Indica se existe contêiner associado")
    /**
     * Indica se existe contêiner associado
     **/
    private String existeConteiner = null;

    @XmlElement(name = "conteineres")
    @ApiModelProperty(value = "Lista de contêineres")
    @Valid
    /**
     * Lista de contêineres
     **/
    private List<ConteinerDetails> conteineres = null;

    @XmlElement(name = "cargas")
    @ApiModelProperty(value = "Lista de cargas, solta ou granel")
    @Valid
    /**
     * Lista de cargas, solta ou granel
     **/
    private List<SoltaGranelDetails> cargas = null;

    @XmlElement(name = "veiculos")
    @ApiModelProperty(value = "Lista de veículos")
    @Valid
    /**
     * Lista de veículos
     **/
    private List<VeiculoDetails> veiculos = null;

    @XmlElement(name = "numeroDUIMP")
    @ApiModelProperty(example = "24BR00000010785", value = "Número da Duimp")
    /**
     * Número da Duimp
     **/
    private String numeroDUIMP = null;

    @XmlElement(name = "situacao")
    @ApiModelProperty(example = "Em Conferência", value = "Descrição da situação da Duimp")
    /**
     * Descrição da situação da Duimp
     **/
    private String situacao = null;

    @XmlElement(name = "canal")
    @ApiModelProperty(example = "Amarelo", value = "Descrição do canal da Duimp")
    /**
     * Descrição do canal da Duimp
     **/
    private String canal = null;

    @XmlElement(name = "importador")
    @ApiModelProperty(value = "")
    @Valid
    private ImportadorDTO importador = null;

    @XmlElement(name = "indicacaoDeImportacaoParaTerceiros")
    @ApiModelProperty(value = "Lista de caracterização da importação para terceiros")
    @Valid
    /**
     * Lista de caracterização da importação para terceiros
     **/
    private List<ImportacaoParaTerceirosDTO> indicacaoDeImportacaoParaTerceiros = null;

    @XmlElement(name = "valorTotalMercadoriaNoLocalDescarregamento")
    @ApiModelProperty(example = "4954.7", value = "Valor total da mercadoria no local de descarregamento em reais")
    @Valid
    /**
     * Valor total da mercadoria no local de descarregamento em reais
     **/
    private BigDecimal valorTotalMercadoriaNoLocalDescarregamento = null;

    @XmlElement(name = "destinoFinalCarga")
    @ApiModelProperty(value = "")
    @Valid
    private UrfDTO destinoFinalCarga = null;

    @XmlElement(name = "nomeConsignatario")
    @ApiModelProperty(example = "NOME DE EXEMPLO DO CONSIGNATARIO", value = "Nome do consignarário")
    /**
     * Nome do consignarário
     **/
    private String nomeConsignatario = null;

    @XmlElement(name = "paisOrigemCarga")
    @ApiModelProperty(example = "ESTADOS UNIDOS", value = "Nome do país de origem da carga")
    /**
     * Nome do país de origem da carga
     **/
    private String paisOrigemCarga = null;

    @XmlElement(name = "entregaAutorizadaPelaDuimp")
    @ApiModelProperty(example = "S", value = "Indica se existe autorização no Sistema DIMP para entrega da carga")
    /**
     * Indica se existe autorização no Sistema DIMP para entrega da carga
     **/
    private String entregaAutorizadaPelaDuimp = null;

    @XmlElement(name = "entregaAutorizadaPeloSiscomexCarga")
    @ApiModelProperty(example = "N", value = "Indica se existe autorização no Sistema Siscomex Carga para entrega da carga")
    /**
     * Indica se existe autorização no Sistema Siscomex Carga para entrega da carga
     **/
    private String entregaAutorizadaPeloSiscomexCarga = null;

    /**
     * Get local
     *
     * @return local
     **/
    @JsonProperty("local")
    public LocalDTO getLocal() {
        return local;
    }

    public void setLocal(LocalDTO local) {
        this.local = local;
    }

    public ConsultaEstoquePosDetails local(LocalDTO local) {
        this.local = local;
        return this;
    }

    /**
     * Número da RUC
     *
     * @return numeroRUC
     **/
    @JsonProperty("numeroRUC")
    public String getNumeroRUC() {
        return numeroRUC;
    }

    public void setNumeroRUC(String numeroRUC) {
        this.numeroRUC = numeroRUC;
    }

    public ConsultaEstoquePosDetails numeroRUC(String numeroRUC) {
        this.numeroRUC = numeroRUC;
        return this;
    }

    /**
     * Número do BL original do conhecimento
     *
     * @return numeroConhecimento
     **/
    @JsonProperty("numeroConhecimento")
    public String getNumeroConhecimento() {
        return numeroConhecimento;
    }

    public void setNumeroConhecimento(String numeroConhecimento) {
        this.numeroConhecimento = numeroConhecimento;
    }

    public ConsultaEstoquePosDetails numeroConhecimento(String numeroConhecimento) {
        this.numeroConhecimento = numeroConhecimento;
        return this;
    }

    /**
     * Número de CE Mercante
     *
     * @return numeroCEMercante
     **/
    @JsonProperty("numeroCEMercante")
    public String getNumeroCEMercante() {
        return numeroCEMercante;
    }

    public void setNumeroCEMercante(String numeroCEMercante) {
        this.numeroCEMercante = numeroCEMercante;
    }

    public ConsultaEstoquePosDetails numeroCEMercante(String numeroCEMercante) {
        this.numeroCEMercante = numeroCEMercante;
        return this;
    }

    /**
     * Indica se existe contêiner associado
     *
     * @return existeConteiner
     **/
    @JsonProperty("existeConteiner")
    public String getExisteConteiner() {
        return existeConteiner;
    }

    public void setExisteConteiner(String existeConteiner) {
        this.existeConteiner = existeConteiner;
    }

    public ConsultaEstoquePosDetails existeConteiner(String existeConteiner) {
        this.existeConteiner = existeConteiner;
        return this;
    }

    /**
     * Lista de contêineres
     *
     * @return conteineres
     **/
    @JsonProperty("conteineres")
    public List<ConteinerDetails> getConteineres() {
        return conteineres;
    }

    public void setConteineres(List<ConteinerDetails> conteineres) {
        this.conteineres = conteineres;
    }

    public ConsultaEstoquePosDetails conteineres(List<ConteinerDetails> conteineres) {
        this.conteineres = conteineres;
        return this;
    }

    public ConsultaEstoquePosDetails addConteineresItem(ConteinerDetails conteineresItem) {
        this.conteineres.add(conteineresItem);
        return this;
    }

    /**
     * Lista de cargas, solta ou granel
     *
     * @return cargas
     **/
    @JsonProperty("cargas")
    public List<SoltaGranelDetails> getCargas() {
        return cargas;
    }

    public void setCargas(List<SoltaGranelDetails> cargas) {
        this.cargas = cargas;
    }

    public ConsultaEstoquePosDetails cargas(List<SoltaGranelDetails> cargas) {
        this.cargas = cargas;
        return this;
    }

    public ConsultaEstoquePosDetails addCargasItem(SoltaGranelDetails cargasItem) {
        this.cargas.add(cargasItem);
        return this;
    }

    /**
     * Lista de veículos
     *
     * @return veiculos
     **/
    @JsonProperty("veiculos")
    public List<VeiculoDetails> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(List<VeiculoDetails> veiculos) {
        this.veiculos = veiculos;
    }

    public ConsultaEstoquePosDetails veiculos(List<VeiculoDetails> veiculos) {
        this.veiculos = veiculos;
        return this;
    }

    public ConsultaEstoquePosDetails addVeiculosItem(VeiculoDetails veiculosItem) {
        this.veiculos.add(veiculosItem);
        return this;
    }

    /**
     * Número da Duimp
     * @return numeroDUIMP
     **/
    @JsonProperty("numeroDUIMP")
    public String getNumeroDUIMP() {
        return numeroDUIMP;
    }

    public void setNumeroDUIMP(String numeroDUIMP) {
        this.numeroDUIMP = numeroDUIMP;
    }

    public ConsultaEstoquePosDetails numeroDUIMP(String numeroDUIMP) {
        this.numeroDUIMP = numeroDUIMP;
        return this;
    }

    /**
     * Descrição da situação da Duimp
     * @return situacao
     **/
    @JsonProperty("situacao")
    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public ConsultaEstoquePosDetails situacao(String situacao) {
        this.situacao = situacao;
        return this;
    }

    /**
     * Descrição do canal da Duimp
     * @return canal
     **/
    @JsonProperty("canal")
    public String getCanal() {
        return canal;
    }

    public void setCanal(String canal) {
        this.canal = canal;
    }

    public ConsultaEstoquePosDetails canal(String canal) {
        this.canal = canal;
        return this;
    }

    /**
     * Get importador
     * @return importador
     **/
    @JsonProperty("importador")
    public ImportadorDTO getImportador() {
        return importador;
    }

    public void setImportador(ImportadorDTO importador) {
        this.importador = importador;
    }

    public ConsultaEstoquePosDetails importador(ImportadorDTO importador) {
        this.importador = importador;
        return this;
    }

    /**
     * Lista de caracterização da importação para terceiros
     *
     * @return indicacaoDeImportacaoParaTerceiros
     **/
    @JsonProperty("indicacaoDeImportacaoParaTerceiros")
    public List<ImportacaoParaTerceirosDTO> getIndicacaoDeImportacaoParaTerceiros() {
        return indicacaoDeImportacaoParaTerceiros;
    }

    public void setIndicacaoDeImportacaoParaTerceiros(List<ImportacaoParaTerceirosDTO> indicacaoDeImportacaoParaTerceiros) {
        this.indicacaoDeImportacaoParaTerceiros = indicacaoDeImportacaoParaTerceiros;
    }

    public ConsultaEstoquePosDetails indicacaoDeImportacaoParaTerceiros(List<ImportacaoParaTerceirosDTO> indicacaoDeImportacaoParaTerceiros) {
        this.indicacaoDeImportacaoParaTerceiros = indicacaoDeImportacaoParaTerceiros;
        return this;
    }

    public ConsultaEstoquePosDetails addIndicacaoDeImportacaoParaTerceirosItem(ImportacaoParaTerceirosDTO indicacaoDeImportacaoParaTerceirosItem) {
        this.indicacaoDeImportacaoParaTerceiros.add(indicacaoDeImportacaoParaTerceirosItem);
        return this;
    }

    /**
     * Valor total da mercadoria no local de descarregamento em reais
     *
     * @return valorTotalMercadoriaNoLocalDescarregamento
     **/
    @JsonProperty("valorTotalMercadoriaNoLocalDescarregamento")
    public BigDecimal getValorTotalMercadoriaNoLocalDescarregamento() {
        return valorTotalMercadoriaNoLocalDescarregamento;
    }

    public void setValorTotalMercadoriaNoLocalDescarregamento(BigDecimal valorTotalMercadoriaNoLocalDescarregamento) {
        this.valorTotalMercadoriaNoLocalDescarregamento = valorTotalMercadoriaNoLocalDescarregamento;
    }

    public ConsultaEstoquePosDetails valorTotalMercadoriaNoLocalDescarregamento(BigDecimal valorTotalMercadoriaNoLocalDescarregamento) {
        this.valorTotalMercadoriaNoLocalDescarregamento = valorTotalMercadoriaNoLocalDescarregamento;
        return this;
    }

    /**
     * Get destinoFinalCarga
     * @return destinoFinalCarga
     **/
    @JsonProperty("destinoFinalCarga")
    public UrfDTO getDestinoFinalCarga() {
        return destinoFinalCarga;
    }

    public void setDestinoFinalCarga(UrfDTO destinoFinalCarga) {
        this.destinoFinalCarga = destinoFinalCarga;
    }

    public ConsultaEstoquePosDetails destinoFinalCarga(UrfDTO destinoFinalCarga) {
        this.destinoFinalCarga = destinoFinalCarga;
        return this;
    }

    /**
     * Nome do consignarário
     * @return nomeConsignatario
     **/
    @JsonProperty("nomeConsignatario")
    public String getNomeConsignatario() {
        return nomeConsignatario;
    }

    public void setNomeConsignatario(String nomeConsignatario) {
        this.nomeConsignatario = nomeConsignatario;
    }

    public ConsultaEstoquePosDetails nomeConsignatario(String nomeConsignatario) {
        this.nomeConsignatario = nomeConsignatario;
        return this;
    }

    /**
     * Nome do país de origem da carga
     * @return paisOrigemCarga
     **/
    @JsonProperty("paisOrigemCarga")
    public String getPaisOrigemCarga() {
        return paisOrigemCarga;
    }

    public void setPaisOrigemCarga(String paisOrigemCarga) {
        this.paisOrigemCarga = paisOrigemCarga;
    }

    public ConsultaEstoquePosDetails paisOrigemCarga(String paisOrigemCarga) {
        this.paisOrigemCarga = paisOrigemCarga;
        return this;
    }

    /**
     * Indica se existe autorização no Sistema DIMP para entrega da carga
     * @return entregaAutorizadaPelaDuimp
     **/
    @JsonProperty("entregaAutorizadaPelaDuimp")
    public String getEntregaAutorizadaPelaDuimp() {
        return entregaAutorizadaPelaDuimp;
    }

    public void setEntregaAutorizadaPelaDuimp(String entregaAutorizadaPelaDuimp) {
        this.entregaAutorizadaPelaDuimp = entregaAutorizadaPelaDuimp;
    }

    public ConsultaEstoquePosDetails entregaAutorizadaPelaDuimp(String entregaAutorizadaPelaDuimp) {
        this.entregaAutorizadaPelaDuimp = entregaAutorizadaPelaDuimp;
        return this;
    }

    /**
     * Indica se existe autorização no Sistema Siscomex Carga para entrega da carga
     *
     * @return entregaAutorizadaPeloSiscomexCarga
     **/
    @JsonProperty("entregaAutorizadaPeloSiscomexCarga")
    public String getEntregaAutorizadaPeloSiscomexCarga() {
        return entregaAutorizadaPeloSiscomexCarga;
    }

    public void setEntregaAutorizadaPeloSiscomexCarga(String entregaAutorizadaPeloSiscomexCarga) {
        this.entregaAutorizadaPeloSiscomexCarga = entregaAutorizadaPeloSiscomexCarga;
    }

    public ConsultaEstoquePosDetails entregaAutorizadaPeloSiscomexCarga(String entregaAutorizadaPeloSiscomexCarga) {
        this.entregaAutorizadaPeloSiscomexCarga = entregaAutorizadaPeloSiscomexCarga;
        return this;
    }


    @Override
    public String toString() {

        String sb = "class ConsultaEstoquePosDetails {\n" +
                "    local: " + toIndentedString(local) + "\n" +
                "    numeroRUC: " + toIndentedString(numeroRUC) + "\n" +
                "    numeroConhecimento: " + toIndentedString(numeroConhecimento) + "\n" +
                "    numeroCEMercante: " + toIndentedString(numeroCEMercante) + "\n" +
                "    existeConteiner: " + toIndentedString(existeConteiner) + "\n" +
                "    conteineres: " + toIndentedString(conteineres) + "\n" +
                "    cargas: " + toIndentedString(cargas) + "\n" +
                "    veiculos: " + toIndentedString(veiculos) + "\n" +
                "    numeroDUIMP: " + toIndentedString(numeroDUIMP) + "\n" +
                "    situacao: " + toIndentedString(situacao) + "\n" +
                "    canal: " + toIndentedString(canal) + "\n" +
                "    importador: " + toIndentedString(importador) + "\n" +
                "    indicacaoDeImportacaoParaTerceiros: " + toIndentedString(indicacaoDeImportacaoParaTerceiros) + "\n" +
                "    valorTotalMercadoriaNoLocalDescarregamento: " + toIndentedString(valorTotalMercadoriaNoLocalDescarregamento) + "\n" +
                "    destinoFinalCarga: " + toIndentedString(destinoFinalCarga) + "\n" +
                "    nomeConsignatario: " + toIndentedString(nomeConsignatario) + "\n" +
                "    paisOrigemCarga: " + toIndentedString(paisOrigemCarga) + "\n" +
                "    entregaAutorizadaPelaDuimp: " + toIndentedString(entregaAutorizadaPelaDuimp) + "\n" +
                "    entregaAutorizadaPeloSiscomexCarga: " + toIndentedString(entregaAutorizadaPeloSiscomexCarga) + "\n" +
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

