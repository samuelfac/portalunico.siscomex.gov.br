package br.gov.siscomex.portalunico.duimp_api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "DocumentosDuimpConsultaCover", propOrder =
    { "documentosInstrucao", "processos", "declaracoesExportacaoEstrangeira", "dossies"
})

@XmlRootElement(name="DocumentosDuimpConsultaCover")
public class DocumentosDuimpConsultaCover  {
  
  @XmlElement(name="documentosInstrucao", required = true)
  @ApiModelProperty(required = true, value = "")
  @Valid
  private List<DocumentoInstrucaoCover> documentosInstrucao = new ArrayList<>();

  @XmlElement(name="processos")
  @ApiModelProperty(value = "")
  @Valid
  private List<ProcessoDocumentoInstrucaoCover> processos = null;

  @XmlElement(name="declaracoesExportacaoEstrangeira")
  @ApiModelProperty(value = "")
  @Valid
  private List<DeclaracaoExportacaoEstrangeiraCover> declaracoesExportacaoEstrangeira = null;

  @XmlElement(name="dossies")
  @ApiModelProperty(value = "")
  @Valid
  private List<DossieCover> dossies = null;
 /**
   * Get documentosInstrucao
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
   * Get processos
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
   * Get declaracoesExportacaoEstrangeira
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
   * Get dossies
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
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentosDuimpConsultaCover {\n");
    
    sb.append("    documentosInstrucao: ").append(toIndentedString(documentosInstrucao)).append("\n");
    sb.append("    processos: ").append(toIndentedString(processos)).append("\n");
    sb.append("    declaracoesExportacaoEstrangeira: ").append(toIndentedString(declaracoesExportacaoEstrangeira)).append("\n");
    sb.append("    dossies: ").append(toIndentedString(dossies)).append("\n");
    sb.append("}");
    return sb.toString();
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

