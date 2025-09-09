package br.gov.siscomex.portalunico.dimp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentosDuimpConsultaCover", propOrder =
        {"documentosInstrucao", "declaracoesExportacaoEstrangeira", "processos", "dossies"
        })

@XmlRootElement(name = "DocumentosDuimpConsultaCover")
public class DocumentosDuimpConsultaCover {

    @XmlElement(name = "documentosInstrucao", required = true)
    @ApiModelProperty(required = true, value = "")
    @Valid
    private List<DocumentoInstrucaoCover> documentosInstrucao = new ArrayList<>();

    @XmlElement(name = "declaracoesExportacaoEstrangeira")
    @ApiModelProperty(value = "")
    @Valid
    private List<DeclaracaoExportacaoEstrangeiraCover> declaracoesExportacaoEstrangeira = null;

    @XmlElement(name = "processos")
    @ApiModelProperty(value = "")
    @Valid
    private List<ProcessoDocumentoInstrucaoCover> processos = null;

    @XmlElement(name = "dossies")
    @ApiModelProperty(value = "")
    @Valid
    private List<DossieCover> dossies = null;

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
     * Get documentosInstrucao
     *
     * @return documentosInstrucao
     **/
    @JsonProperty("documentosInstrucao")
    @NotNull
    public List<DocumentoInstrucaoCover> getDocumentosInstrucao() {
        return documentosInstrucao;
    }

    public void setDocumentosInstrucao(List<DocumentoInstrucaoCover> documentosInstrucao) {
        this.documentosInstrucao = documentosInstrucao;
    }

    public DocumentosDuimpConsultaCover documentosInstrucao(List<DocumentoInstrucaoCover> documentosInstrucao) {
        this.documentosInstrucao = documentosInstrucao;
        return this;
    }

    public DocumentosDuimpConsultaCover addDocumentosInstrucaoItem(DocumentoInstrucaoCover documentosInstrucaoItem) {
        this.documentosInstrucao.add(documentosInstrucaoItem);
        return this;
    }

    /**
     * Get declaracoesExportacaoEstrangeira
     *
     * @return declaracoesExportacaoEstrangeira
     **/
    @JsonProperty("declaracoesExportacaoEstrangeira")
    public List<DeclaracaoExportacaoEstrangeiraCover> getDeclaracoesExportacaoEstrangeira() {
        return declaracoesExportacaoEstrangeira;
    }

    public void setDeclaracoesExportacaoEstrangeira(List<DeclaracaoExportacaoEstrangeiraCover> declaracoesExportacaoEstrangeira) {
        this.declaracoesExportacaoEstrangeira = declaracoesExportacaoEstrangeira;
    }

    public DocumentosDuimpConsultaCover declaracoesExportacaoEstrangeira(List<DeclaracaoExportacaoEstrangeiraCover> declaracoesExportacaoEstrangeira) {
        this.declaracoesExportacaoEstrangeira = declaracoesExportacaoEstrangeira;
        return this;
    }

    public DocumentosDuimpConsultaCover addDeclaracoesExportacaoEstrangeiraItem(DeclaracaoExportacaoEstrangeiraCover declaracoesExportacaoEstrangeiraItem) {
        this.declaracoesExportacaoEstrangeira.add(declaracoesExportacaoEstrangeiraItem);
        return this;
    }

    /**
     * Get processos
     *
     * @return processos
     **/
    @JsonProperty("processos")
    public List<ProcessoDocumentoInstrucaoCover> getProcessos() {
        return processos;
    }

    public void setProcessos(List<ProcessoDocumentoInstrucaoCover> processos) {
        this.processos = processos;
    }

    public DocumentosDuimpConsultaCover processos(List<ProcessoDocumentoInstrucaoCover> processos) {
        this.processos = processos;
        return this;
    }

    public DocumentosDuimpConsultaCover addProcessosItem(ProcessoDocumentoInstrucaoCover processosItem) {
        this.processos.add(processosItem);
        return this;
    }

    /**
     * Get dossies
     *
     * @return dossies
     **/
    @JsonProperty("dossies")
    public List<DossieCover> getDossies() {
        return dossies;
    }

    public void setDossies(List<DossieCover> dossies) {
        this.dossies = dossies;
    }

    public DocumentosDuimpConsultaCover dossies(List<DossieCover> dossies) {
        this.dossies = dossies;
        return this;
    }

    public DocumentosDuimpConsultaCover addDossiesItem(DossieCover dossiesItem) {
        this.dossies.add(dossiesItem);
        return this;
    }

    @Override
    public String toString() {

        String sb = "class DocumentosDuimpConsultaCover {\n" +
                "    documentosInstrucao: " + toIndentedString(documentosInstrucao) + "\n" +
                "    declaracoesExportacaoEstrangeira: " + toIndentedString(declaracoesExportacaoEstrangeira) + "\n" +
                "    processos: " + toIndentedString(processos) + "\n" +
                "    dossies: " + toIndentedString(dossies) + "\n" +
                "}";
        return sb;
    }
}
