package br.gov.siscomex.portalunico.cct_imp.model;

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

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecepcaoDocumentoCarga", propOrder =
        {"identificacaoRecepcao", "identificacaoPessoaJuridica", "local", "documentos", "entregador", "pesoAferido", "motivoNaoPesagem", "localArmazenamento", "observacoes"
        })

@XmlRootElement(name = "RecepcaoDocumentoCarga")
/**
 * Recepção por Documento de Carga
 **/
@ApiModel(description = "Recepção por Documento de Carga ")
public class RecepcaoDocumentoCarga {

    @XmlElement(name = "identificacaoRecepcao", required = true)
    @ApiModelProperty(example = "REC001", required = true, value = "Identificação da Recepção<br>Esta informação não será armazenada pelo sistema, servindo apenas como uma identificação de cada recepção no momento da exibição de eventuais mensagens de erro. Este campo não admite duplicatas.")
    /**
     * Identificação da Recepção<br>Esta informação não será armazenada pelo sistema, servindo apenas como uma identificação de cada recepção no momento da exibição de eventuais mensagens de erro. Este campo não admite duplicatas.
     **/
    private String identificacaoRecepcao = null;

    @XmlElement(name = "identificacaoPessoaJuridica", required = true)
    @ApiModelProperty(example = "07396865000168", required = true, value = "CNPJ do responsável pela recepção<br>Tamanho: 14<br>Formato: NNNNNNNNNNNNNN")
    /**
     * CNPJ do responsável pela recepção<br>Tamanho: 14<br>Formato: NNNNNNNNNNNNNN
     **/
    private String identificacaoPessoaJuridica = null;

    @XmlElement(name = "local", required = true)
    @ApiModelProperty(required = true, value = "")
    @Valid
    private Local local = null;

    @XmlElement(name = "documentos", required = true)
    @ApiModelProperty(required = true, value = "")
    @Valid
    private Documentos documentos = null;

    @XmlElement(name = "entregador", required = true)
    @ApiModelProperty(required = true, value = "")
    @Valid
    private Entregador entregador = null;

    @XmlElement(name = "pesoAferido")
    @ApiModelProperty(value = "Peso aferido na balança do recinto em Kg<br>Tamanho: 12.3<br>Formato: NNNNNNNNNNNN.NNN<br>Deve ser informado somente quando há informação de pesagem. Neste caso, é obrigatório.")
    @Valid
    /**
     * Peso aferido na balança do recinto em Kg<br>Tamanho: 12.3<br>Formato: NNNNNNNNNNNN.NNN<br>Deve ser informado somente quando há informação de pesagem. Neste caso, é obrigatório.
     **/
    private BigDecimal pesoAferido = null;

    @XmlElement(name = "motivoNaoPesagem")
    @ApiModelProperty(example = "Motivo da não realização da pesagem", value = "Motivo da não realização da pesagem<br>Tamanho: 250<br>Deve ser informado somente quando não há informação de pesagem. Neste caso, é obrigatório.")
    /**
     * Motivo da não realização da pesagem<br>Tamanho: 250<br>Deve ser informado somente quando não há informação de pesagem. Neste caso, é obrigatório.
     **/
    private String motivoNaoPesagem = null;

    @XmlElement(name = "localArmazenamento")
    @ApiModelProperty(value = "Local de armazenamento da carga<br>Tamanho: 150")
    /**
     * Local de armazenamento da carga<br>Tamanho: 150
     **/
    private String localArmazenamento = null;

    @XmlElement(name = "observacoes")
    @ApiModelProperty(example = "Observações gerais", value = "Observações gerais<br>Tamanho: 250")
    /**
     * Observações gerais<br>Tamanho: 250
     **/
    private String observacoes = null;

    /**
     * Identificação da Recepção&lt;br&gt;Esta informação não será armazenada pelo sistema, servindo apenas como uma identificação de cada recepção no momento da exibição de eventuais mensagens de erro. Este campo não admite duplicatas.
     *
     * @return identificacaoRecepcao
     **/
    @JsonProperty("identificacaoRecepcao")
    @NotNull
    public String getIdentificacaoRecepcao() {
        return identificacaoRecepcao;
    }

    public void setIdentificacaoRecepcao(String identificacaoRecepcao) {
        this.identificacaoRecepcao = identificacaoRecepcao;
    }

    public RecepcaoDocumentoCarga identificacaoRecepcao(String identificacaoRecepcao) {
        this.identificacaoRecepcao = identificacaoRecepcao;
        return this;
    }

    /**
     * CNPJ do responsável pela recepção&lt;br&gt;Tamanho: 14&lt;br&gt;Formato: NNNNNNNNNNNNNN
     *
     * @return identificacaoPessoaJuridica
     **/
    @JsonProperty("identificacaoPessoaJuridica")
    @NotNull
    public String getIdentificacaoPessoaJuridica() {
        return identificacaoPessoaJuridica;
    }

    public void setIdentificacaoPessoaJuridica(String identificacaoPessoaJuridica) {
        this.identificacaoPessoaJuridica = identificacaoPessoaJuridica;
    }

    public RecepcaoDocumentoCarga identificacaoPessoaJuridica(String identificacaoPessoaJuridica) {
        this.identificacaoPessoaJuridica = identificacaoPessoaJuridica;
        return this;
    }

    /**
     * Get local
     *
     * @return local
     **/
    @JsonProperty("local")
    @NotNull
    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public RecepcaoDocumentoCarga local(Local local) {
        this.local = local;
        return this;
    }

    /**
     * Get documentos
     *
     * @return documentos
     **/
    @JsonProperty("documentos")
    @NotNull
    public Documentos getDocumentos() {
        return documentos;
    }

    public void setDocumentos(Documentos documentos) {
        this.documentos = documentos;
    }

    public RecepcaoDocumentoCarga documentos(Documentos documentos) {
        this.documentos = documentos;
        return this;
    }

    /**
     * Get entregador
     *
     * @return entregador
     **/
    @JsonProperty("entregador")
    @NotNull
    public Entregador getEntregador() {
        return entregador;
    }

    public void setEntregador(Entregador entregador) {
        this.entregador = entregador;
    }

    public RecepcaoDocumentoCarga entregador(Entregador entregador) {
        this.entregador = entregador;
        return this;
    }

    /**
     * Peso aferido na balança do recinto em Kg&lt;br&gt;Tamanho: 12.3&lt;br&gt;Formato: NNNNNNNNNNNN.NNN&lt;br&gt;Deve ser informado somente quando há informação de pesagem. Neste caso, é obrigatório.
     *
     * @return pesoAferido
     **/
    @JsonProperty("pesoAferido")
    public BigDecimal getPesoAferido() {
        return pesoAferido;
    }

    public void setPesoAferido(BigDecimal pesoAferido) {
        this.pesoAferido = pesoAferido;
    }

    public RecepcaoDocumentoCarga pesoAferido(BigDecimal pesoAferido) {
        this.pesoAferido = pesoAferido;
        return this;
    }

    /**
     * Motivo da não realização da pesagem&lt;br&gt;Tamanho: 250&lt;br&gt;Deve ser informado somente quando não há informação de pesagem. Neste caso, é obrigatório.
     *
     * @return motivoNaoPesagem
     **/
    @JsonProperty("motivoNaoPesagem")
    public String getMotivoNaoPesagem() {
        return motivoNaoPesagem;
    }

    public void setMotivoNaoPesagem(String motivoNaoPesagem) {
        this.motivoNaoPesagem = motivoNaoPesagem;
    }

    public RecepcaoDocumentoCarga motivoNaoPesagem(String motivoNaoPesagem) {
        this.motivoNaoPesagem = motivoNaoPesagem;
        return this;
    }

    /**
     * Local de armazenamento da carga&lt;br&gt;Tamanho: 150
     *
     * @return localArmazenamento
     **/
    @JsonProperty("localArmazenamento")
    public String getLocalArmazenamento() {
        return localArmazenamento;
    }

    public void setLocalArmazenamento(String localArmazenamento) {
        this.localArmazenamento = localArmazenamento;
    }

    public RecepcaoDocumentoCarga localArmazenamento(String localArmazenamento) {
        this.localArmazenamento = localArmazenamento;
        return this;
    }

    /**
     * Observações gerais&lt;br&gt;Tamanho: 250
     * @return observacoes
     **/
    @JsonProperty("observacoes")
    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public RecepcaoDocumentoCarga observacoes(String observacoes) {
        this.observacoes = observacoes;
        return this;
    }


    @Override
    public String toString() {

        String sb = "class RecepcaoDocumentoCarga {\n" +
                "    identificacaoRecepcao: " + toIndentedString(identificacaoRecepcao) + "\n" +
                "    identificacaoPessoaJuridica: " + toIndentedString(identificacaoPessoaJuridica) + "\n" +
                "    local: " + toIndentedString(local) + "\n" +
                "    documentos: " + toIndentedString(documentos) + "\n" +
                "    entregador: " + toIndentedString(entregador) + "\n" +
                "    pesoAferido: " + toIndentedString(pesoAferido) + "\n" +
                "    motivoNaoPesagem: " + toIndentedString(motivoNaoPesagem) + "\n" +
                "    localArmazenamento: " + toIndentedString(localArmazenamento) + "\n" +
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

