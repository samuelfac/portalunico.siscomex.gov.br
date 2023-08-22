package br.gov.siscomex.portalunico.duimp_api.model;

import br.gov.siscomex.portalunico.duimp_api.model.DeclaracaoExportacaoEstrangeiraCover;
import br.gov.siscomex.portalunico.duimp_api.model.DocumentoInstrucaoCover;
import br.gov.siscomex.portalunico.duimp_api.model.ProcessoDocumentoInstrucaoCover;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "DocumentosCover", propOrder =
    { "documentosInstrucao", "processos", "declaracoesExportacaoEstrangeira"
})

@XmlRootElement(name="DocumentosCover")
/**
  * Lista de documentos associados à declaração única de importação.
 **/
@ApiModel(description="Lista de documentos associados à declaração única de importação.")
public class DocumentosCover  {
  
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

  public DocumentosCover documentosInstrucao(List<DocumentoInstrucaoCover> documentosInstrucao) {
    this.documentosInstrucao = documentosInstrucao;
    return this;
  }

  public DocumentosCover addDocumentosInstrucaoItem(DocumentoInstrucaoCover documentosInstrucaoItem) {
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

  public DocumentosCover processos(List<ProcessoDocumentoInstrucaoCover> processos) {
    this.processos = processos;
    return this;
  }

  public DocumentosCover addProcessosItem(ProcessoDocumentoInstrucaoCover processosItem) {
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

  public DocumentosCover declaracoesExportacaoEstrangeira(List<DeclaracaoExportacaoEstrangeiraCover> declaracoesExportacaoEstrangeira) {
    this.declaracoesExportacaoEstrangeira = declaracoesExportacaoEstrangeira;
    return this;
  }

  public DocumentosCover addDeclaracoesExportacaoEstrangeiraItem(DeclaracaoExportacaoEstrangeiraCover declaracoesExportacaoEstrangeiraItem) {
    this.declaracoesExportacaoEstrangeira.add(declaracoesExportacaoEstrangeiraItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentosCover {\n");
    
    sb.append("    documentosInstrucao: ").append(toIndentedString(documentosInstrucao)).append("\n");
    sb.append("    processos: ").append(toIndentedString(processos)).append("\n");
    sb.append("    declaracoesExportacaoEstrangeira: ").append(toIndentedString(declaracoesExportacaoEstrangeira)).append("\n");
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

