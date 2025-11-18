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

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntregaDocumentoCarga", propOrder =
        {"identificacaoEntrega", "identificacaoPessoaJuridica", "local", "documentos", "recebedor", "observacoes"
        })

@XmlRootElement(name = "EntregaDocumentoCarga")
/**
 * Entrega por Documento de Carga de Importação
 **/
@ApiModel(description = "Entrega por Documento de Carga de Importação")
public class EntregaDocumentoCarga {

    @XmlElement(name = "identificacaoEntrega", required = true)
    @ApiModelProperty(example = "ENT001", required = true, value = "Identificação da Entrega<br>Esta informação não será armazenada pelo sistema, servindo apenas como uma identificação de cada entrega no momento da exibição de eventuais mensagens de erro. Este campo não admite duplicatas.")
    /**
     * Identificação da Entrega<br>Esta informação não será armazenada pelo sistema, servindo apenas como uma identificação de cada entrega no momento da exibição de eventuais mensagens de erro. Este campo não admite duplicatas.
     **/
    private String identificacaoEntrega = null;

    @XmlElement(name = "identificacaoPessoaJuridica", required = true)
    @ApiModelProperty(example = "15573459000106", required = true, value = "CNPJ do responsável pela Entrega<br>Tamanho: 14<br>Formato: NNNNNNNNNNNNNN")
    /**
     * CNPJ do responsável pela Entrega<br>Tamanho: 14<br>Formato: NNNNNNNNNNNNNN
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

    @XmlElement(name = "recebedor", required = true)
    @ApiModelProperty(required = true, value = "")
    @Valid
    private Recebedor recebedor = null;

    @XmlElement(name = "observacoes")
    @ApiModelProperty(value = "Dados do interveniente que está recebendo a carga")
    /**
     * Dados do interveniente que está recebendo a carga
     **/
    private String observacoes = null;

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
     * Identificação da Entrega&lt;br&gt;Esta informação não será armazenada pelo sistema, servindo apenas como uma identificação de cada entrega no momento da exibição de eventuais mensagens de erro. Este campo não admite duplicatas.
     *
     * @return identificacaoEntrega
     **/
    @JsonProperty("identificacaoEntrega")
    @NotNull
    public String getIdentificacaoEntrega() {
        return identificacaoEntrega;
    }

    public void setIdentificacaoEntrega(String identificacaoEntrega) {
        this.identificacaoEntrega = identificacaoEntrega;
    }

    /**
     * CNPJ do responsável pela Entrega&lt;br&gt;Tamanho: 14&lt;br&gt;Formato: NNNNNNNNNNNNNN
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

    public EntregaDocumentoCarga identificacaoPessoaJuridica(String identificacaoPessoaJuridica) {
        this.identificacaoPessoaJuridica = identificacaoPessoaJuridica;
        return this;
    }

    public EntregaDocumentoCarga identificacaoEntrega(String identificacaoEntrega) {
        this.identificacaoEntrega = identificacaoEntrega;
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

    public EntregaDocumentoCarga local(Local local) {
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

    /**
     * Get recebedor
     *
     * @return recebedor
     **/
    @JsonProperty("recebedor")
    @NotNull
    public Recebedor getRecebedor() {
        return recebedor;
    }

    public void setRecebedor(Recebedor recebedor) {
        this.recebedor = recebedor;
    }

    public EntregaDocumentoCarga recebedor(Recebedor recebedor) {
        this.recebedor = recebedor;
        return this;
    }

    public EntregaDocumentoCarga documentos(Documentos documentos) {
        this.documentos = documentos;
        return this;
    }

    /**
     * Dados do interveniente que está recebendo a carga
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

    public EntregaDocumentoCarga observacoes(String observacoes) {
        this.observacoes = observacoes;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class EntregaDocumentoCarga {\n" +
                "    identificacaoEntrega: " + toIndentedString(identificacaoEntrega) + "\n" +
                "    identificacaoPessoaJuridica: " + toIndentedString(identificacaoPessoaJuridica) + "\n" +
                "    local: " + toIndentedString(local) + "\n" +
                "    documentos: " + toIndentedString(documentos) + "\n" +
                "    recebedor: " + toIndentedString(recebedor) + "\n" +
                "    observacoes: " + toIndentedString(observacoes) + "\n" +
                "}";
        return sb;
    }
}
