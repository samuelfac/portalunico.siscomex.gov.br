package br.gov.siscomex.portalunico.duimp.model;

import java.util.List;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "DocumentoInstrutivoDeDespacho", propOrder =
    { "tipo", "palavrasChave"
})

@XmlRootElement(name="DocumentoInstrutivoDeDespacho")
public class DocumentoInstrutivoDeDespacho  {
  
  @XmlElement(name="tipo")
  @ApiModelProperty(value = "")
  @Valid
  private TipoDeDocumentoObjetoCompostoPelosAtributosCdigoEDescrio tipo = null;

  @XmlElement(name="palavrasChave")
  @ApiModelProperty(value = "Lista de palavras chave associadas ao documento instrutivo")
  @Valid
 /**
   * Lista de palavras chave associadas ao documento instrutivo
  **/
  private List<PalavraChaveCover> palavrasChave = null;
 /**
   * Get tipo
   * @return tipo
  **/
  @JsonProperty("tipo")
  public TipoDeDocumentoObjetoCompostoPelosAtributosCdigoEDescrio getTipo() {
    return tipo;
  }

  public void setTipo(TipoDeDocumentoObjetoCompostoPelosAtributosCdigoEDescrio tipo) {
    this.tipo = tipo;
  }

  public DocumentoInstrutivoDeDespacho tipo(TipoDeDocumentoObjetoCompostoPelosAtributosCdigoEDescrio tipo) {
    this.tipo = tipo;
    return this;
  }

 /**
   * Lista de palavras chave associadas ao documento instrutivo
   * @return palavrasChave
  **/
  @JsonProperty("palavrasChave")
  public List<PalavraChaveCover> getPalavrasChave() {
    return palavrasChave;
  }

  public void setPalavrasChave(List<PalavraChaveCover> palavrasChave) {
    this.palavrasChave = palavrasChave;
  }

  public DocumentoInstrutivoDeDespacho palavrasChave(List<PalavraChaveCover> palavrasChave) {
    this.palavrasChave = palavrasChave;
    return this;
  }

  public DocumentoInstrutivoDeDespacho addPalavrasChaveItem(PalavraChaveCover palavrasChaveItem) {
    this.palavrasChave.add(palavrasChaveItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentoInstrutivoDeDespacho {\n");
    
    sb.append("    tipo: ").append(toIndentedString(tipo)).append("\n");
    sb.append("    palavrasChave: ").append(toIndentedString(palavrasChave)).append("\n");
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

