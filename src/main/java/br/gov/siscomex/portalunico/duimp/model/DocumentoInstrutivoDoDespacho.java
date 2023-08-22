package br.gov.siscomex.portalunico.duimp.model;

import br.gov.siscomex.portalunico.duimp.model.PalavraChaveCover;
import br.gov.siscomex.portalunico.duimp.model.TipoDeDocumentoObjetoCompostoPelosAtributosCdigoEDescrio;
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
 @XmlType(name = "DocumentoInstrutivoDoDespacho", propOrder =
    { "tipo", "palavrasChave"
})

@XmlRootElement(name="DocumentoInstrutivoDoDespacho")
public class DocumentoInstrutivoDoDespacho  {
  
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

  public DocumentoInstrutivoDoDespacho tipo(TipoDeDocumentoObjetoCompostoPelosAtributosCdigoEDescrio tipo) {
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

  public DocumentoInstrutivoDoDespacho palavrasChave(List<PalavraChaveCover> palavrasChave) {
    this.palavrasChave = palavrasChave;
    return this;
  }

  public DocumentoInstrutivoDoDespacho addPalavrasChaveItem(PalavraChaveCover palavrasChaveItem) {
    this.palavrasChave.add(palavrasChaveItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentoInstrutivoDoDespacho {\n");
    
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

