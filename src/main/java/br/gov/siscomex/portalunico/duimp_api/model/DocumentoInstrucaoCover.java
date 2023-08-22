package br.gov.siscomex.portalunico.duimp_api.model;

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
 @XmlType(name = "DocumentoInstrucaoCover", propOrder =
    { "tipo", "palavrasChave"
})

@XmlRootElement(name="DocumentoInstrucaoCover")
/**
  * Lista de documentos instrutivos para despacho.<br>Origem: Sistema Anexação Eletrônica - https://api-docs.portalunico.siscomex.gov.br/
 **/
@ApiModel(description="Lista de documentos instrutivos para despacho.<br>Origem: Sistema Anexação Eletrônica - https://api-docs.portalunico.siscomex.gov.br/")
public class DocumentoInstrucaoCover  {
  
  @XmlElement(name="tipo", required = true)
  @ApiModelProperty(required = true, value = "")
  @Valid
  private TipoDocumentoInstrucaoCover tipo = null;

  @XmlElement(name="palavrasChave", required = true)
  @ApiModelProperty(required = true, value = "")
  @Valid
  private List<PalavraChaveDocumentoInstrucaoCover> palavrasChave = new ArrayList<>();
 /**
   * Get tipo
   * @return tipo
  **/
  @JsonProperty("tipo")
  @NotNull
  public TipoDocumentoInstrucaoCover getTipo() {
    return tipo;
  }

  public void setTipo(TipoDocumentoInstrucaoCover tipo) {
    this.tipo = tipo;
  }

  public DocumentoInstrucaoCover tipo(TipoDocumentoInstrucaoCover tipo) {
    this.tipo = tipo;
    return this;
  }

 /**
   * Get palavrasChave
   * @return palavrasChave
  **/
  @JsonProperty("palavrasChave")
  @NotNull
  public List<PalavraChaveDocumentoInstrucaoCover> getPalavrasChave() {
    return palavrasChave;
  }

  public void setPalavrasChave(List<PalavraChaveDocumentoInstrucaoCover> palavrasChave) {
    this.palavrasChave = palavrasChave;
  }

  public DocumentoInstrucaoCover palavrasChave(List<PalavraChaveDocumentoInstrucaoCover> palavrasChave) {
    this.palavrasChave = palavrasChave;
    return this;
  }

  public DocumentoInstrucaoCover addPalavrasChaveItem(PalavraChaveDocumentoInstrucaoCover palavrasChaveItem) {
    this.palavrasChave.add(palavrasChaveItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentoInstrucaoCover {\n");
    
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

