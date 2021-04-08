package br.gov.siscomex.portalunico.edocex.model;

import java.time.OffsetDateTime;
import java.util.List;

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
 @XmlType(name = "Documento", propOrder =
    { "anexadoPor", "cpfAnexacao", "dataHoraAnexacao", "disponivelParaOrgaos", "documentoLido", "documentoPalavrasChave", "id", "idTipoDocumento", "nomeArquivo", "nomeTipoDocumento", "restritoAosOrgaos", "sha256"
})

@XmlRootElement(name="Documento")
/**
  * Documento.
 **/
@ApiModel(description="Documento.")
public class Documento  {
  

@XmlType(name="AnexadoPorEnum")
@XmlEnum(String.class)
public enum AnexadoPorEnum {

	@XmlEnumValue("Representante Legal")
	@JsonProperty("Representante Legal")
	REPRESENTANTE_LEGAL(String.valueOf("Representante Legal")),
	
	@XmlEnumValue("Administração Pública")
	@JsonProperty("Administração Pública")
	ADMINISTRA_O_P_BLICA(String.valueOf("Administração Pública"));


    private String value;

    AnexadoPorEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static AnexadoPorEnum fromValue(String v) {
        for (AnexadoPorEnum b : AnexadoPorEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to AnexadoPorEnum");
    }
}

  @XmlElement(name="anexadoPor")
  @ApiModelProperty(example = "Representante Legal", value = "Tipo de usuário/órgão que anexou o documento.<br/>Tamanho máximo: 30")
 /**
   * Tipo de usuário/órgão que anexou o documento.<br/>Tamanho máximo: 30
  **/
  private AnexadoPorEnum anexadoPor = null;

  @XmlElement(name="cpfAnexacao")
  @ApiModelProperty(example = "77777777777", value = "CPF do usuário da anexação sem formatação.<br/>Tamanho: 11")
 /**
   * CPF do usuário da anexação sem formatação.<br/>Tamanho: 11
  **/
  private String cpfAnexacao = null;

  @XmlElement(name="dataHoraAnexacao")
  @ApiModelProperty(value = "Data/hora da anexação do documento.<br/>Formato ISO 8601: yyyy-MM-dd'T'HH:mm:ss.SSSz")
 /**
   * Data/hora da anexação do documento.<br/>Formato ISO 8601: yyyy-MM-dd'T'HH:mm:ss.SSSz
  **/
  private OffsetDateTime dataHoraAnexacao = null;

  @XmlElement(name="disponivelParaOrgaos")
  @ApiModelProperty(value = "")
  @Valid
  private List<DocumentoDisponivelParaOrgao> disponivelParaOrgaos = null;

  @XmlElement(name="documentoLido")
  @ApiModelProperty(example = "true", value = "Indica que este documento foi lido pelo usuário logado. Lido equivale ao usuário ter feito o upload ou o download do documento.")
 /**
   * Indica que este documento foi lido pelo usuário logado. Lido equivale ao usuário ter feito o upload ou o download do documento.
  **/
  private Boolean documentoLido = false;

  @XmlElement(name="documentoPalavrasChave")
  @ApiModelProperty(value = "")
  @Valid
  private List<DocumentoPalavraChave> documentoPalavrasChave = null;

  @XmlElement(name="id")
  @ApiModelProperty(example = "4456487453", value = "Id do documento.<br/>Valor mínimo: 1<br/>Valor máximo: 9223372036854775807")
 /**
   * Id do documento.<br/>Valor mínimo: 1<br/>Valor máximo: 9223372036854775807
  **/
  private Long id = null;

  @XmlElement(name="idTipoDocumento", required = true)
  @ApiModelProperty(example = "87453", required = true, value = "Id do tipo de documento.<br/>Valor mínimo: 1<br/>Valor máximo: 2147483647")
 /**
   * Id do tipo de documento.<br/>Valor mínimo: 1<br/>Valor máximo: 2147483647
  **/
  private Integer idTipoDocumento = null;

  @XmlElement(name="nomeArquivo")
  @ApiModelProperty(example = "texto.txt", value = "Nome do arquivo<br/>Tamanho máximo: 255")
 /**
   * Nome do arquivo<br/>Tamanho máximo: 255
  **/
  private String nomeArquivo = null;

  @XmlElement(name="nomeTipoDocumento")
  @ApiModelProperty(example = "Fatura Comercial", value = "Nome do tipo de documento.<br/>Tamanho máximo: 255")
 /**
   * Nome do tipo de documento.<br/>Tamanho máximo: 255
  **/
  private String nomeTipoDocumento = null;

  @XmlElement(name="restritoAosOrgaos")
  @ApiModelProperty(example = "true", value = "Indica que este documento esta disponível apenas para os órgãos anuentes. (Se aplica apenas nas visões RFB e Anuentes)")
 /**
   * Indica que este documento esta disponível apenas para os órgãos anuentes. (Se aplica apenas nas visões RFB e Anuentes)
  **/
  private Boolean restritoAosOrgaos = false;

  @XmlElement(name="sha256")
  @ApiModelProperty(example = "536292681b12d75fb1bce7b793d38c5d9d82efc408b53bda08abeeccb5eda434", value = "String em SHA256 representando o hash do arquivo.<br/>Tamanho: 64")
 /**
   * String em SHA256 representando o hash do arquivo.<br/>Tamanho: 64
  **/
  private String sha256 = null;
 /**
   * Tipo de usuário/órgão que anexou o documento.&lt;br/&gt;Tamanho máximo: 30
   * @return anexadoPor
  **/
  @JsonProperty("anexadoPor")
  public String getAnexadoPor() {
    if (anexadoPor == null) {
      return null;
    }
    return anexadoPor.value();
  }

  public void setAnexadoPor(AnexadoPorEnum anexadoPor) {
    this.anexadoPor = anexadoPor;
  }

  public Documento anexadoPor(AnexadoPorEnum anexadoPor) {
    this.anexadoPor = anexadoPor;
    return this;
  }

 /**
   * CPF do usuário da anexação sem formatação.&lt;br/&gt;Tamanho: 11
   * @return cpfAnexacao
  **/
  @JsonProperty("cpfAnexacao")
  public String getCpfAnexacao() {
    return cpfAnexacao;
  }

  public void setCpfAnexacao(String cpfAnexacao) {
    this.cpfAnexacao = cpfAnexacao;
  }

  public Documento cpfAnexacao(String cpfAnexacao) {
    this.cpfAnexacao = cpfAnexacao;
    return this;
  }

 /**
   * Data/hora da anexação do documento.&lt;br/&gt;Formato ISO 8601: yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSz
   * @return dataHoraAnexacao
  **/
  @JsonProperty("dataHoraAnexacao")
  public OffsetDateTime getDataHoraAnexacao() {
    return dataHoraAnexacao;
  }

  public void setDataHoraAnexacao(OffsetDateTime dataHoraAnexacao) {
    this.dataHoraAnexacao = dataHoraAnexacao;
  }

  public Documento dataHoraAnexacao(OffsetDateTime dataHoraAnexacao) {
    this.dataHoraAnexacao = dataHoraAnexacao;
    return this;
  }

 /**
   * Get disponivelParaOrgaos
   * @return disponivelParaOrgaos
  **/
  @JsonProperty("disponivelParaOrgaos")
  public List<DocumentoDisponivelParaOrgao> getDisponivelParaOrgaos() {
    return disponivelParaOrgaos;
  }

  public void setDisponivelParaOrgaos(List<DocumentoDisponivelParaOrgao> disponivelParaOrgaos) {
    this.disponivelParaOrgaos = disponivelParaOrgaos;
  }

  public Documento disponivelParaOrgaos(List<DocumentoDisponivelParaOrgao> disponivelParaOrgaos) {
    this.disponivelParaOrgaos = disponivelParaOrgaos;
    return this;
  }

  public Documento addDisponivelParaOrgaosItem(DocumentoDisponivelParaOrgao disponivelParaOrgaosItem) {
    this.disponivelParaOrgaos.add(disponivelParaOrgaosItem);
    return this;
  }

 /**
   * Indica que este documento foi lido pelo usuário logado. Lido equivale ao usuário ter feito o upload ou o download do documento.
   * @return documentoLido
  **/
  @JsonProperty("documentoLido")
  public Boolean isDocumentoLido() {
    return documentoLido;
  }

  public void setDocumentoLido(Boolean documentoLido) {
    this.documentoLido = documentoLido;
  }

  public Documento documentoLido(Boolean documentoLido) {
    this.documentoLido = documentoLido;
    return this;
  }

 /**
   * Get documentoPalavrasChave
   * @return documentoPalavrasChave
  **/
  @JsonProperty("documentoPalavrasChave")
  public List<DocumentoPalavraChave> getDocumentoPalavrasChave() {
    return documentoPalavrasChave;
  }

  public void setDocumentoPalavrasChave(List<DocumentoPalavraChave> documentoPalavrasChave) {
    this.documentoPalavrasChave = documentoPalavrasChave;
  }

  public Documento documentoPalavrasChave(List<DocumentoPalavraChave> documentoPalavrasChave) {
    this.documentoPalavrasChave = documentoPalavrasChave;
    return this;
  }

  public Documento addDocumentoPalavrasChaveItem(DocumentoPalavraChave documentoPalavrasChaveItem) {
    this.documentoPalavrasChave.add(documentoPalavrasChaveItem);
    return this;
  }

 /**
   * Id do documento.&lt;br/&gt;Valor mínimo: 1&lt;br/&gt;Valor máximo: 9223372036854775807
   * @return id
  **/
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Documento id(Long id) {
    this.id = id;
    return this;
  }

 /**
   * Id do tipo de documento.&lt;br/&gt;Valor mínimo: 1&lt;br/&gt;Valor máximo: 2147483647
   * @return idTipoDocumento
  **/
  @JsonProperty("idTipoDocumento")
  @NotNull
  public Integer getIdTipoDocumento() {
    return idTipoDocumento;
  }

  public void setIdTipoDocumento(Integer idTipoDocumento) {
    this.idTipoDocumento = idTipoDocumento;
  }

  public Documento idTipoDocumento(Integer idTipoDocumento) {
    this.idTipoDocumento = idTipoDocumento;
    return this;
  }

 /**
   * Nome do arquivo&lt;br/&gt;Tamanho máximo: 255
   * @return nomeArquivo
  **/
  @JsonProperty("nomeArquivo")
  public String getNomeArquivo() {
    return nomeArquivo;
  }

  public void setNomeArquivo(String nomeArquivo) {
    this.nomeArquivo = nomeArquivo;
  }

  public Documento nomeArquivo(String nomeArquivo) {
    this.nomeArquivo = nomeArquivo;
    return this;
  }

 /**
   * Nome do tipo de documento.&lt;br/&gt;Tamanho máximo: 255
   * @return nomeTipoDocumento
  **/
  @JsonProperty("nomeTipoDocumento")
  public String getNomeTipoDocumento() {
    return nomeTipoDocumento;
  }

  public void setNomeTipoDocumento(String nomeTipoDocumento) {
    this.nomeTipoDocumento = nomeTipoDocumento;
  }

  public Documento nomeTipoDocumento(String nomeTipoDocumento) {
    this.nomeTipoDocumento = nomeTipoDocumento;
    return this;
  }

 /**
   * Indica que este documento esta disponível apenas para os órgãos anuentes. (Se aplica apenas nas visões RFB e Anuentes)
   * @return restritoAosOrgaos
  **/
  @JsonProperty("restritoAosOrgaos")
  public Boolean isRestritoAosOrgaos() {
    return restritoAosOrgaos;
  }

  public void setRestritoAosOrgaos(Boolean restritoAosOrgaos) {
    this.restritoAosOrgaos = restritoAosOrgaos;
  }

  public Documento restritoAosOrgaos(Boolean restritoAosOrgaos) {
    this.restritoAosOrgaos = restritoAosOrgaos;
    return this;
  }

 /**
   * String em SHA256 representando o hash do arquivo.&lt;br/&gt;Tamanho: 64
   * @return sha256
  **/
  @JsonProperty("sha256")
  public String getSha256() {
    return sha256;
  }

  public void setSha256(String sha256) {
    this.sha256 = sha256;
  }

  public Documento sha256(String sha256) {
    this.sha256 = sha256;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Documento {\n");
    
    sb.append("    anexadoPor: ").append(toIndentedString(anexadoPor)).append("\n");
    sb.append("    cpfAnexacao: ").append(toIndentedString(cpfAnexacao)).append("\n");
    sb.append("    dataHoraAnexacao: ").append(toIndentedString(dataHoraAnexacao)).append("\n");
    sb.append("    disponivelParaOrgaos: ").append(toIndentedString(disponivelParaOrgaos)).append("\n");
    sb.append("    documentoLido: ").append(toIndentedString(documentoLido)).append("\n");
    sb.append("    documentoPalavrasChave: ").append(toIndentedString(documentoPalavrasChave)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idTipoDocumento: ").append(toIndentedString(idTipoDocumento)).append("\n");
    sb.append("    nomeArquivo: ").append(toIndentedString(nomeArquivo)).append("\n");
    sb.append("    nomeTipoDocumento: ").append(toIndentedString(nomeTipoDocumento)).append("\n");
    sb.append("    restritoAosOrgaos: ").append(toIndentedString(restritoAosOrgaos)).append("\n");
    sb.append("    sha256: ").append(toIndentedString(sha256)).append("\n");
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

