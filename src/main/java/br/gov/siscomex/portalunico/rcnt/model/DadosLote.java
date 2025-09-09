package br.gov.siscomex.portalunico.rcnt.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DadosLote", propOrder =
        {"embalagemComercial", "numeroLote", "observacaoAvaria", "quantidadeVolumesAvariados", "contraMarca", "divergenciaQuantidade", "pesoLoteBalanca", "listaTipoAvaria", "marca", "observacaoDivergencia", "quantidadeVolumesDivergentes", "idElemento", "divergenciaQualificacao", "listaVolumesVerificados"
        })

@XmlRootElement(name = "DadosLote")
public class DadosLote {

    @XmlElement(name = "embalagemComercial")
    @ApiModelProperty(value = "Embalagem comercial visível<br/>Tamanho: 100")
    /**
     * Embalagem comercial visível<br/>Tamanho: 100
     **/
    private String embalagemComercial = null;

    @XmlElement(name = "numeroLote", required = true)
    @ApiModelProperty(required = true, value = "Número do Lote interno gerado pelo Recinto. Pode ser nulo quando o evento for de exclusão.<br/>Tamanho: 100")
    /**
     * Número do Lote interno gerado pelo Recinto. Pode ser nulo quando o evento for de exclusão.<br/>Tamanho: 100
     **/
    private String numeroLote = null;

    @XmlElement(name = "observacaoAvaria")
    @ApiModelProperty(value = "Observações da avaria<br/>Tamanho: 200")
    /**
     * Observações da avaria<br/>Tamanho: 200
     **/
    private String observacaoAvaria = null;

    @XmlElement(name = "quantidadeVolumesAvariados")
    @ApiModelProperty(example = "3", value = "Informar a quantidade de volumes avariados.<font color=\"red\"><strong><br/>(!)</strong></font>É obrigatório que o atributo 'quantidadeVolumesAvariados' seja informado quando o atributo 'tipoAvaria' for informado.")
    /**
     * Informar a quantidade de volumes avariados.<font color=\"red\"><strong><br/>(!)</strong></font>É obrigatório que o atributo 'quantidadeVolumesAvariados' seja informado quando o atributo 'tipoAvaria' for informado.
     **/
    private Integer quantidadeVolumesAvariados = null;

    @XmlElement(name = "contraMarca")
    @ApiModelProperty(value = "Contramarca visível<br/>Tamanho: 100")
    /**
     * Contramarca visível<br/>Tamanho: 100
     **/
    private String contraMarca = null;

    @XmlElement(name = "divergenciaQuantidade", required = true)
    @ApiModelProperty(example = "false", required = true, value = "Divergência de quantidades de mercadoria/volumes. Pode ser nulo quando o evento for de exclusão.<br/>Domínio:<br/>true - Sim<br/>false - Não")
    /**
     * Divergência de quantidades de mercadoria/volumes. Pode ser nulo quando o evento for de exclusão.<br/>Domínio:<br/>true - Sim<br/>false - Não
     **/
    private Boolean divergenciaQuantidade = null;

    @XmlElement(name = "pesoLoteBalanca")
    @ApiModelProperty(example = "15.5", value = "Peso do lote na balança (Kg).<br/><br/>pesoLoteBalanca, até 4 casas decimais.")
    @Valid
    /**
     * Peso do lote na balança (Kg).<br/><br/>pesoLoteBalanca, até 4 casas decimais.
     **/
    private BigDecimal pesoLoteBalanca = null;

    @XmlElement(name = "listaTipoAvaria")
    @ApiModelProperty(value = "Lista dos Tipos de Avarias.")
    @Valid
    /**
     * Lista dos Tipos de Avarias.
     **/
    private List<DadosDoTipoDeAvaria> listaTipoAvaria = null;

    @XmlElement(name = "marca")
    @ApiModelProperty(value = "Marca visível<br/>Tamanho: 100")
    /**
     * Marca visível<br/>Tamanho: 100
     **/
    private String marca = null;

    @XmlElement(name = "observacaoDivergencia")
    @ApiModelProperty(value = "Observações da divergência<br/>Tamanho: 200")
    /**
     * Observações da divergência<br/>Tamanho: 200
     **/
    private String observacaoDivergencia = null;

    @XmlElement(name = "quantidadeVolumesDivergentes")
    @ApiModelProperty(example = "10", value = "Informar a quantidade de volumes divergentes.<font color=\"red\"><strong><br/>(!)</strong></font>É obrigatório que o atributo 'quantidadeVolumesDivergentes' seja informado quando o atributo 'divergenciaQuantidade' for informado com 'true'.")
    /**
     * Informar a quantidade de volumes divergentes.<font color=\"red\"><strong><br/>(!)</strong></font>É obrigatório que o atributo 'quantidadeVolumesDivergentes' seja informado quando o atributo 'divergenciaQuantidade' for informado com 'true'.
     **/
    private Integer quantidadeVolumesDivergentes = null;

    @XmlElement(name = "idElemento", required = true)
    @ApiModelProperty(required = true, value = "Identificação de cada elemento da lista. Este atributo é obrigatório e deve ser único dentro da lista correspondente.<br/>Tamanho: 40")
    /**
     * Identificação de cada elemento da lista. Este atributo é obrigatório e deve ser único dentro da lista correspondente.<br/>Tamanho: 40
     **/
    private String idElemento = null;

    @XmlElement(name = "divergenciaQualificacao", required = true)
    @ApiModelProperty(example = "false", required = true, value = "Divergência de qualificação de mercadoria/volumes. Pode ser nulo quando o evento for de exclusão.<br/>Domínio:<br/>true - Sim<br/>false - Não")
    /**
     * Divergência de qualificação de mercadoria/volumes. Pode ser nulo quando o evento for de exclusão.<br/>Domínio:<br/>true - Sim<br/>false - Não
     **/
    private Boolean divergenciaQualificacao = null;

    @XmlElement(name = "listaVolumesVerificados", required = true)
    @ApiModelProperty(required = true, value = "Lista de volumes verificados e recepcionados.")
    @Valid
    /**
     * Lista de volumes verificados e recepcionados.
     **/
    private List<DadosVolumeVerificadoMadeiraObrigatorio> listaVolumesVerificados = new ArrayList<>();

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
     * Embalagem comercial visível&lt;br/&gt;Tamanho: 100
     *
     * @return embalagemComercial
     **/
    @JsonProperty("embalagemComercial")
    public String getEmbalagemComercial() {
        return embalagemComercial;
    }

    public void setEmbalagemComercial(String embalagemComercial) {
        this.embalagemComercial = embalagemComercial;
    }

    public DadosLote embalagemComercial(String embalagemComercial) {
        this.embalagemComercial = embalagemComercial;
        return this;
    }

    /**
     * Número do Lote interno gerado pelo Recinto. Pode ser nulo quando o evento for de exclusão.&lt;br/&gt;Tamanho: 100
     *
     * @return numeroLote
     **/
    @JsonProperty("numeroLote")
    @NotNull
    public String getNumeroLote() {
        return numeroLote;
    }

    public void setNumeroLote(String numeroLote) {
        this.numeroLote = numeroLote;
    }

    public DadosLote numeroLote(String numeroLote) {
        this.numeroLote = numeroLote;
        return this;
    }

    /**
     * Observações da avaria&lt;br/&gt;Tamanho: 200
     *
     * @return observacaoAvaria
     **/
    @JsonProperty("observacaoAvaria")
    public String getObservacaoAvaria() {
        return observacaoAvaria;
    }

    public void setObservacaoAvaria(String observacaoAvaria) {
        this.observacaoAvaria = observacaoAvaria;
    }

    public DadosLote observacaoAvaria(String observacaoAvaria) {
        this.observacaoAvaria = observacaoAvaria;
        return this;
    }

    /**
     * Informar a quantidade de volumes avariados.&lt;font color&#x3D;\&quot;red\&quot;&gt;&lt;strong&gt;&lt;br/&gt;(!)&lt;/strong&gt;&lt;/font&gt;É obrigatório que o atributo &#39;quantidadeVolumesAvariados&#39; seja informado quando o atributo &#39;tipoAvaria&#39; for informado.
     *
     * @return quantidadeVolumesAvariados
     **/
    @JsonProperty("quantidadeVolumesAvariados")
    public Integer getQuantidadeVolumesAvariados() {
        return quantidadeVolumesAvariados;
    }

    public void setQuantidadeVolumesAvariados(Integer quantidadeVolumesAvariados) {
        this.quantidadeVolumesAvariados = quantidadeVolumesAvariados;
    }

    public DadosLote quantidadeVolumesAvariados(Integer quantidadeVolumesAvariados) {
        this.quantidadeVolumesAvariados = quantidadeVolumesAvariados;
        return this;
    }

    /**
     * Contramarca visível&lt;br/&gt;Tamanho: 100
     *
     * @return contraMarca
     **/
    @JsonProperty("contraMarca")
    public String getContraMarca() {
        return contraMarca;
    }

    public void setContraMarca(String contraMarca) {
        this.contraMarca = contraMarca;
    }

    public DadosLote contraMarca(String contraMarca) {
        this.contraMarca = contraMarca;
        return this;
    }

    /**
     * Divergência de quantidades de mercadoria/volumes. Pode ser nulo quando o evento for de exclusão.&lt;br/&gt;Domínio:&lt;br/&gt;true - Sim&lt;br/&gt;false - Não
     *
     * @return divergenciaQuantidade
     **/
    @JsonProperty("divergenciaQuantidade")
    @NotNull
    public Boolean isisDivergenciaQuantidade() {
        return divergenciaQuantidade;
    }

    public void setDivergenciaQuantidade(Boolean divergenciaQuantidade) {
        this.divergenciaQuantidade = divergenciaQuantidade;
    }

    public DadosLote divergenciaQuantidade(Boolean divergenciaQuantidade) {
        this.divergenciaQuantidade = divergenciaQuantidade;
        return this;
    }

    /**
     * Peso do lote na balança (Kg).&lt;br/&gt;&lt;br/&gt;pesoLoteBalanca, até 4 casas decimais.
     *
     * @return pesoLoteBalanca
     **/
    @JsonProperty("pesoLoteBalanca")
    public BigDecimal getPesoLoteBalanca() {
        return pesoLoteBalanca;
    }

    public void setPesoLoteBalanca(BigDecimal pesoLoteBalanca) {
        this.pesoLoteBalanca = pesoLoteBalanca;
    }

    public DadosLote pesoLoteBalanca(BigDecimal pesoLoteBalanca) {
        this.pesoLoteBalanca = pesoLoteBalanca;
        return this;
    }

    /**
     * Lista dos Tipos de Avarias.
     *
     * @return listaTipoAvaria
     **/
    @JsonProperty("listaTipoAvaria")
    public List<DadosDoTipoDeAvaria> getListaTipoAvaria() {
        return listaTipoAvaria;
    }

    public void setListaTipoAvaria(List<DadosDoTipoDeAvaria> listaTipoAvaria) {
        this.listaTipoAvaria = listaTipoAvaria;
    }

    public DadosLote listaTipoAvaria(List<DadosDoTipoDeAvaria> listaTipoAvaria) {
        this.listaTipoAvaria = listaTipoAvaria;
        return this;
    }

    public DadosLote addListaTipoAvariaItem(DadosDoTipoDeAvaria listaTipoAvariaItem) {
        this.listaTipoAvaria.add(listaTipoAvariaItem);
        return this;
    }

    /**
     * Marca visível&lt;br/&gt;Tamanho: 100
     *
     * @return marca
     **/
    @JsonProperty("marca")
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public DadosLote marca(String marca) {
        this.marca = marca;
        return this;
    }

    /**
     * Observações da divergência&lt;br/&gt;Tamanho: 200
     *
     * @return observacaoDivergencia
     **/
    @JsonProperty("observacaoDivergencia")
    public String getObservacaoDivergencia() {
        return observacaoDivergencia;
    }

    public void setObservacaoDivergencia(String observacaoDivergencia) {
        this.observacaoDivergencia = observacaoDivergencia;
    }

    public DadosLote observacaoDivergencia(String observacaoDivergencia) {
        this.observacaoDivergencia = observacaoDivergencia;
        return this;
    }

    /**
     * Informar a quantidade de volumes divergentes.&lt;font color&#x3D;\&quot;red\&quot;&gt;&lt;strong&gt;&lt;br/&gt;(!)&lt;/strong&gt;&lt;/font&gt;É obrigatório que o atributo &#39;quantidadeVolumesDivergentes&#39; seja informado quando o atributo &#39;divergenciaQuantidade&#39; for informado com &#39;true&#39;.
     *
     * @return quantidadeVolumesDivergentes
     **/
    @JsonProperty("quantidadeVolumesDivergentes")
    public Integer getQuantidadeVolumesDivergentes() {
        return quantidadeVolumesDivergentes;
    }

    public void setQuantidadeVolumesDivergentes(Integer quantidadeVolumesDivergentes) {
        this.quantidadeVolumesDivergentes = quantidadeVolumesDivergentes;
    }

    public DadosLote quantidadeVolumesDivergentes(Integer quantidadeVolumesDivergentes) {
        this.quantidadeVolumesDivergentes = quantidadeVolumesDivergentes;
        return this;
    }

    /**
     * Identificação de cada elemento da lista. Este atributo é obrigatório e deve ser único dentro da lista correspondente.&lt;br/&gt;Tamanho: 40
     *
     * @return idElemento
     **/
    @JsonProperty("idElemento")
    @NotNull
    public String getIdElemento() {
        return idElemento;
    }

    public void setIdElemento(String idElemento) {
        this.idElemento = idElemento;
    }

    public DadosLote idElemento(String idElemento) {
        this.idElemento = idElemento;
        return this;
    }

    /**
     * Divergência de qualificação de mercadoria/volumes. Pode ser nulo quando o evento for de exclusão.&lt;br/&gt;Domínio:&lt;br/&gt;true - Sim&lt;br/&gt;false - Não
     *
     * @return divergenciaQualificacao
     **/
    @JsonProperty("divergenciaQualificacao")
    @NotNull
    public Boolean isisDivergenciaQualificacao() {
        return divergenciaQualificacao;
    }

    public void setDivergenciaQualificacao(Boolean divergenciaQualificacao) {
        this.divergenciaQualificacao = divergenciaQualificacao;
    }

    public DadosLote divergenciaQualificacao(Boolean divergenciaQualificacao) {
        this.divergenciaQualificacao = divergenciaQualificacao;
        return this;
    }

    /**
     * Lista de volumes verificados e recepcionados.
     *
     * @return listaVolumesVerificados
     **/
    @JsonProperty("listaVolumesVerificados")
    @NotNull
    public List<DadosVolumeVerificadoMadeiraObrigatorio> getListaVolumesVerificados() {
        return listaVolumesVerificados;
    }

    public void setListaVolumesVerificados(List<DadosVolumeVerificadoMadeiraObrigatorio> listaVolumesVerificados) {
        this.listaVolumesVerificados = listaVolumesVerificados;
    }

    public DadosLote listaVolumesVerificados(List<DadosVolumeVerificadoMadeiraObrigatorio> listaVolumesVerificados) {
        this.listaVolumesVerificados = listaVolumesVerificados;
        return this;
    }

    public DadosLote addListaVolumesVerificadosItem(DadosVolumeVerificadoMadeiraObrigatorio listaVolumesVerificadosItem) {
        this.listaVolumesVerificados.add(listaVolumesVerificadosItem);
        return this;
    }

    @Override
    public String toString() {

        String sb = "class DadosLote {\n" +
                "    embalagemComercial: " + toIndentedString(embalagemComercial) + "\n" +
                "    numeroLote: " + toIndentedString(numeroLote) + "\n" +
                "    observacaoAvaria: " + toIndentedString(observacaoAvaria) + "\n" +
                "    quantidadeVolumesAvariados: " + toIndentedString(quantidadeVolumesAvariados) + "\n" +
                "    contraMarca: " + toIndentedString(contraMarca) + "\n" +
                "    divergenciaQuantidade: " + toIndentedString(divergenciaQuantidade) + "\n" +
                "    pesoLoteBalanca: " + toIndentedString(pesoLoteBalanca) + "\n" +
                "    listaTipoAvaria: " + toIndentedString(listaTipoAvaria) + "\n" +
                "    marca: " + toIndentedString(marca) + "\n" +
                "    observacaoDivergencia: " + toIndentedString(observacaoDivergencia) + "\n" +
                "    quantidadeVolumesDivergentes: " + toIndentedString(quantidadeVolumesDivergentes) + "\n" +
                "    idElemento: " + toIndentedString(idElemento) + "\n" +
                "    divergenciaQualificacao: " + toIndentedString(divergenciaQualificacao) + "\n" +
                "    listaVolumesVerificados: " + toIndentedString(listaVolumesVerificados) + "\n" +
                "}";
        return sb;
    }
}
