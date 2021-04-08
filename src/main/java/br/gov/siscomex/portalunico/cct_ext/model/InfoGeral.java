package br.gov.siscomex.portalunico.cct_ext.model;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "InfoGeral", propOrder =
    { "cpfManifestador", "cnpjManifestador", "paisDestino", "cidadeDestino", "indTransitoAduaneiroInternacional", "docTransporte", "localSaida", "observacoes"
})

@XmlRootElement(name="InfoGeral")
/**
  * Dados gerais da Manifestação
 **/
@ApiModel(description="Dados gerais da Manifestação")
public class InfoGeral  {
  
  @XmlElement(name="cpfManifestador")
  @ApiModelProperty(example = "15573459106", value = "CPF do Manifestador<br>Tamanho: 11<br>Formato: NNNNNNNNNNN<br>Informado e obrigatório apenas para transportador nacional do tipo pessoa física.")
 /**
   * CPF do Manifestador<br>Tamanho: 11<br>Formato: NNNNNNNNNNN<br>Informado e obrigatório apenas para transportador nacional do tipo pessoa física.
  **/
  private String cpfManifestador = null;

  @XmlElement(name="cnpjManifestador")
  @ApiModelProperty(example = "15573459000106", value = "CNPJ do Manifestador<br>Tamanho: 14<br>Formato: NNNNNNNNNNNNNN<br>Informado e obrigatório apenas para transportador nacional do tipo pessoa jurídica.")
 /**
   * CNPJ do Manifestador<br>Tamanho: 14<br>Formato: NNNNNNNNNNNNNN<br>Informado e obrigatório apenas para transportador nacional do tipo pessoa jurídica.
  **/
  private String cnpjManifestador = null;


@XmlType(name="PaisDestinoEnum")
@XmlEnum(String.class)
public enum PaisDestinoEnum {

	@XmlEnumValue("AR")
	@JsonProperty("AR")
	AR(String.valueOf("AR")),
	
	@XmlEnumValue("BO")
	@JsonProperty("BO")
	BO(String.valueOf("BO")),
	
	@XmlEnumValue("CL")
	@JsonProperty("CL")
	CL(String.valueOf("CL")),
	
	@XmlEnumValue("PY")
	@JsonProperty("PY")
	PY(String.valueOf("PY")),
	
	@XmlEnumValue("PE")
	@JsonProperty("PE")
	PE(String.valueOf("PE")),
	
	@XmlEnumValue("UY")
	@JsonProperty("UY")
	UY(String.valueOf("UY"));


    private String value;

    PaisDestinoEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static PaisDestinoEnum fromValue(String v) {
        for (PaisDestinoEnum b : PaisDestinoEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to PaisDestinoEnum");
    }
}

  @XmlElement(name="paisDestino", required = true)
  @ApiModelProperty(example = "AR", required = true, value = "Código do país de destino da carga<br>Tamanho: 2<br>Formato: AA<br>Domínio: <br>AR (Argentina), <br>BO (Bolívia), <br>CL (Chile), <br>PY (Paraguai), <br>PE (Peru), <br>UY (Uruguai)")
 /**
   * Código do país de destino da carga<br>Tamanho: 2<br>Formato: AA<br>Domínio: <br>AR (Argentina), <br>BO (Bolívia), <br>CL (Chile), <br>PY (Paraguai), <br>PE (Peru), <br>UY (Uruguai)
  **/
  private PaisDestinoEnum paisDestino = null;

  @XmlElement(name="cidadeDestino", required = true)
  @ApiModelProperty(example = "BUENOS AIRES", required = true, value = "Nome da cidade de destino da carga<br>Tamanho: 60")
 /**
   * Nome da cidade de destino da carga<br>Tamanho: 60
  **/
  private String cidadeDestino = null;

  @XmlElement(name="indTransitoAduaneiroInternacional", required = true)
  @ApiModelProperty(example = "S", required = true, value = "Indicador de transito aduaneiro internacional<br>Domínio: <br>S (Sim), <br>N(Não).")
 /**
   * Indicador de transito aduaneiro internacional<br>Domínio: <br>S (Sim), <br>N(Não).
  **/
  private String indTransitoAduaneiroInternacional = null;

  @XmlElement(name="docTransporte", required = true)
  @ApiModelProperty(required = true, value = "")
  @Valid
  private DocTransporte docTransporte = null;

  @XmlElement(name="localSaida", required = true)
  @ApiModelProperty(required = true, value = "")
  @Valid
  private LocalSaida localSaida = null;

  @XmlElement(name="observacoes")
  @ApiModelProperty(example = "MIC/DTA Pre-ACD", value = "Observações<br>Tamanho: 250")
 /**
   * Observações<br>Tamanho: 250
  **/
  private String observacoes = null;
 /**
   * CPF do Manifestador&lt;br&gt;Tamanho: 11&lt;br&gt;Formato: NNNNNNNNNNN&lt;br&gt;Informado e obrigatório apenas para transportador nacional do tipo pessoa física.
   * @return cpfManifestador
  **/
  @JsonProperty("cpfManifestador")
  public String getCpfManifestador() {
    return cpfManifestador;
  }

  public void setCpfManifestador(String cpfManifestador) {
    this.cpfManifestador = cpfManifestador;
  }

  public InfoGeral cpfManifestador(String cpfManifestador) {
    this.cpfManifestador = cpfManifestador;
    return this;
  }

 /**
   * CNPJ do Manifestador&lt;br&gt;Tamanho: 14&lt;br&gt;Formato: NNNNNNNNNNNNNN&lt;br&gt;Informado e obrigatório apenas para transportador nacional do tipo pessoa jurídica.
   * @return cnpjManifestador
  **/
  @JsonProperty("cnpjManifestador")
  public String getCnpjManifestador() {
    return cnpjManifestador;
  }

  public void setCnpjManifestador(String cnpjManifestador) {
    this.cnpjManifestador = cnpjManifestador;
  }

  public InfoGeral cnpjManifestador(String cnpjManifestador) {
    this.cnpjManifestador = cnpjManifestador;
    return this;
  }

 /**
   * Código do país de destino da carga&lt;br&gt;Tamanho: 2&lt;br&gt;Formato: AA&lt;br&gt;Domínio: &lt;br&gt;AR (Argentina), &lt;br&gt;BO (Bolívia), &lt;br&gt;CL (Chile), &lt;br&gt;PY (Paraguai), &lt;br&gt;PE (Peru), &lt;br&gt;UY (Uruguai)
   * @return paisDestino
  **/
  @JsonProperty("paisDestino")
  @NotNull
  public String getPaisDestino() {
    if (paisDestino == null) {
      return null;
    }
    return paisDestino.value();
  }

  public void setPaisDestino(PaisDestinoEnum paisDestino) {
    this.paisDestino = paisDestino;
  }

  public InfoGeral paisDestino(PaisDestinoEnum paisDestino) {
    this.paisDestino = paisDestino;
    return this;
  }

 /**
   * Nome da cidade de destino da carga&lt;br&gt;Tamanho: 60
   * @return cidadeDestino
  **/
  @JsonProperty("cidadeDestino")
  @NotNull
  public String getCidadeDestino() {
    return cidadeDestino;
  }

  public void setCidadeDestino(String cidadeDestino) {
    this.cidadeDestino = cidadeDestino;
  }

  public InfoGeral cidadeDestino(String cidadeDestino) {
    this.cidadeDestino = cidadeDestino;
    return this;
  }

 /**
   * Indicador de transito aduaneiro internacional&lt;br&gt;Domínio: &lt;br&gt;S (Sim), &lt;br&gt;N(Não).
   * @return indTransitoAduaneiroInternacional
  **/
  @JsonProperty("indTransitoAduaneiroInternacional")
  @NotNull
  public String getIndTransitoAduaneiroInternacional() {
    return indTransitoAduaneiroInternacional;
  }

  public void setIndTransitoAduaneiroInternacional(String indTransitoAduaneiroInternacional) {
    this.indTransitoAduaneiroInternacional = indTransitoAduaneiroInternacional;
  }

  public InfoGeral indTransitoAduaneiroInternacional(String indTransitoAduaneiroInternacional) {
    this.indTransitoAduaneiroInternacional = indTransitoAduaneiroInternacional;
    return this;
  }

 /**
   * Get docTransporte
   * @return docTransporte
  **/
  @JsonProperty("docTransporte")
  @NotNull
  public DocTransporte getDocTransporte() {
    return docTransporte;
  }

  public void setDocTransporte(DocTransporte docTransporte) {
    this.docTransporte = docTransporte;
  }

  public InfoGeral docTransporte(DocTransporte docTransporte) {
    this.docTransporte = docTransporte;
    return this;
  }

 /**
   * Get localSaida
   * @return localSaida
  **/
  @JsonProperty("localSaida")
  @NotNull
  public LocalSaida getLocalSaida() {
    return localSaida;
  }

  public void setLocalSaida(LocalSaida localSaida) {
    this.localSaida = localSaida;
  }

  public InfoGeral localSaida(LocalSaida localSaida) {
    this.localSaida = localSaida;
    return this;
  }

 /**
   * Observações&lt;br&gt;Tamanho: 250
   * @return observacoes
  **/
  @JsonProperty("observacoes")
  public String getObservacoes() {
    return observacoes;
  }

  public void setObservacoes(String observacoes) {
    this.observacoes = observacoes;
  }

  public InfoGeral observacoes(String observacoes) {
    this.observacoes = observacoes;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfoGeral {\n");
    
    sb.append("    cpfManifestador: ").append(toIndentedString(cpfManifestador)).append("\n");
    sb.append("    cnpjManifestador: ").append(toIndentedString(cnpjManifestador)).append("\n");
    sb.append("    paisDestino: ").append(toIndentedString(paisDestino)).append("\n");
    sb.append("    cidadeDestino: ").append(toIndentedString(cidadeDestino)).append("\n");
    sb.append("    indTransitoAduaneiroInternacional: ").append(toIndentedString(indTransitoAduaneiroInternacional)).append("\n");
    sb.append("    docTransporte: ").append(toIndentedString(docTransporte)).append("\n");
    sb.append("    localSaida: ").append(toIndentedString(localSaida)).append("\n");
    sb.append("    observacoes: ").append(toIndentedString(observacoes)).append("\n");
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

