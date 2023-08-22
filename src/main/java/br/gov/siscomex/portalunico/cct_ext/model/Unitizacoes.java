package br.gov.siscomex.portalunico.cct_ext.model;

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
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "Unitizacoes", propOrder =
    { "documentosUnitizacao", "conteineres"
})

@XmlRootElement(name="Unitizacoes")
/**
  * Dados das cargas unitizadas
 **/
@ApiModel(description="Dados das cargas unitizadas")
public class Unitizacoes  {
  
  @XmlElement(name="documentosUnitizacao", required = true)
  @ApiModelProperty(required = true, value = "Lista de documentos envolvidos na unitização")
  @Valid
 /**
   * Lista de documentos envolvidos na unitização
  **/
  private List<DocumentosUnitizacao> documentosUnitizacao = new ArrayList<>();

  @XmlElement(name="conteineres", required = true)
  @ApiModelProperty(required = true, value = "Lista dos contêineres envolvidos na unitização")
  @Valid
 /**
   * Lista dos contêineres envolvidos na unitização
  **/
  private List<Conteiner> conteineres = new ArrayList<>();
 /**
   * Lista de documentos envolvidos na unitização
   * @return documentosUnitizacao
  **/
  @JsonProperty("documentosUnitizacao")
  @NotNull
  public List<DocumentosUnitizacao> getDocumentosUnitizacao() {
    return documentosUnitizacao;
  }

  public void setDocumentosUnitizacao(List<DocumentosUnitizacao> documentosUnitizacao) {
    this.documentosUnitizacao = documentosUnitizacao;
  }

  public Unitizacoes documentosUnitizacao(List<DocumentosUnitizacao> documentosUnitizacao) {
    this.documentosUnitizacao = documentosUnitizacao;
    return this;
  }

  public Unitizacoes addDocumentosUnitizacaoItem(DocumentosUnitizacao documentosUnitizacaoItem) {
    this.documentosUnitizacao.add(documentosUnitizacaoItem);
    return this;
  }

 /**
   * Lista dos contêineres envolvidos na unitização
   * @return conteineres
  **/
  @JsonProperty("conteineres")
  @NotNull
  public List<Conteiner> getConteineres() {
    return conteineres;
  }

  public void setConteineres(List<Conteiner> conteineres) {
    this.conteineres = conteineres;
  }

  public Unitizacoes conteineres(List<Conteiner> conteineres) {
    this.conteineres = conteineres;
    return this;
  }

  public Unitizacoes addConteineresItem(Conteiner conteineresItem) {
    this.conteineres.add(conteineresItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Unitizacoes {\n");
    
    sb.append("    documentosUnitizacao: ").append(toIndentedString(documentosUnitizacao)).append("\n");
    sb.append("    conteineres: ").append(toIndentedString(conteineres)).append("\n");
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

