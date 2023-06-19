package br.gov.siscomex.portalunico.edocex.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.*;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "Documento", propOrder =
    { "acessivelSetorPrivado", "anexadoPor", "cpfAnexacao", "dataHoraAnexacao", "disponivelParaOrgaos", "documentoLido", "documentoPalavrasChave", "id", "idTipoDocumento", "nomeArquivo", "nomeTipoDocumento", "sha256", "tipoAcesso"
})

@XmlRootElement(name="Documento")
/**
  * Documento.
 **/
@ApiModel(description="Documento.")
public class Documento  {
  
  @XmlElement(name="acessivelSetorPrivado")
  @ApiModelProperty(example = "false", value = "Indica que este documento esta disponível para usuários do setor privado. (Se aplica apenas nos perfis RFB, Anuentes e SEFAZ)")
 /**
   * Indica que este documento esta disponível para usuários do setor privado. (Se aplica apenas nos perfis RFB, Anuentes e SEFAZ)
  **/
  private Boolean acessivelSetorPrivado = false;


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

  @XmlElement(name="anexadoPor", required = true)
  @ApiModelProperty(example = "Representante Legal", required = true, value = "Tipo de usuário/órgão que anexou o documento.<br/>Tamanho máximo: 30")
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

  @XmlElement(name="dataHoraAnexacao", required = true)
  @ApiModelProperty(required = true, value = "Data/hora da anexação do documento.<br/>Formato ISO 8601: yyyy-MM-dd'T'HH:mm:ss.SSSz")
 /**
   * Data/hora da anexação do documento.<br/>Formato ISO 8601: yyyy-MM-dd'T'HH:mm:ss.SSSz
  **/
  private OffsetDateTime dataHoraAnexacao = null;

  @XmlElement(name="disponivelParaOrgaos")
  @ApiModelProperty(value = "Somente será retornado para dossiês de operações DI, LI, RE, DT e DIR<br/>")
  @Valid
 /**
   * Somente será retornado para dossiês de operações DI, LI, RE, DT e DIR<br/>
  **/
  private List<DocumentoDisponivelParaOrgao> disponivelParaOrgaos = null;

  @XmlElement(name="documentoLido", required = true)
  @ApiModelProperty(example = "true", required = true, value = "Indica que este documento foi lido pelo usuário logado. Lido equivale ao usuário ter feito o upload ou o download do documento.")
 /**
   * Indica que este documento foi lido pelo usuário logado. Lido equivale ao usuário ter feito o upload ou o download do documento.
  **/
  private Boolean documentoLido = false;

  @XmlElement(name="documentoPalavrasChave", required = true)
  @ApiModelProperty(required = true, value = "")
  @Valid
  private List<DocumentoPalavraChave> documentoPalavrasChave = new ArrayList<>();

  @XmlElement(name="id", required = true)
  @ApiModelProperty(example = "4456487453", required = true, value = "Id do documento.<br/>Valor mínimo: 1<br/>Valor máximo: 9223372036854775807")
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

  @XmlElement(name="nomeArquivo", required = true)
  @ApiModelProperty(example = "texto.txt", required = true, value = "Nome do arquivo<br/>Tamanho máximo: 255")
 /**
   * Nome do arquivo<br/>Tamanho máximo: 255
  **/
  private String nomeArquivo = null;

  @XmlElement(name="nomeTipoDocumento", required = true)
  @ApiModelProperty(example = "Fatura Comercial", required = true, value = "Nome do tipo de documento.<br/>Tamanho máximo: 255")
 /**
   * Nome do tipo de documento.<br/>Tamanho máximo: 255
  **/
  private String nomeTipoDocumento = null;

  @XmlElement(name="sha256", required = true)
  @ApiModelProperty(example = "536292681b12d75fb1bce7b793d38c5d9d82efc408b53bda08abeeccb5eda434", required = true, value = "String em SHA256 representando o hash do arquivo.<br/>Tamanho: 64")
 /**
   * String em SHA256 representando o hash do arquivo.<br/>Tamanho: 64
  **/
  private String sha256 = null;


@XmlType(name="TipoAcessoEnum")
@XmlEnum(Integer.class)
public enum TipoAcessoEnum {

	@XmlEnumValue("1")
	@JsonProperty("1")
	NUMBER_1(Integer.valueOf(1)),
	
	@XmlEnumValue("2")
	@JsonProperty("2")
	NUMBER_2(Integer.valueOf(2)),
	
	@XmlEnumValue("3")
	@JsonProperty("3")
	NUMBER_3(Integer.valueOf(3));


    private Integer value;

    TipoAcessoEnum (Integer v) {
        value = v;
    }

    public Integer value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TipoAcessoEnum fromValue(String v) {
        for (TipoAcessoEnum b : TipoAcessoEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to TipoAcessoEnum");
    }
}

  @XmlElement(name="tipoAcesso")
  @ApiModelProperty(example = "1", value = "Tipo de acesso ao documento.<br/><br/>Somente será retornado para dossiês de operações CATP, DU-E, DUIMP e LPCO<br/><br/>1 - Acessível para todos os órgãos da operação<br/>2 - Restringir a disponibilização para RFB e SEFAZ<br/>3 - Acessível apenas para RFB<br/><br/>")
 /**
   * Tipo de acesso ao documento.<br/><br/>Somente será retornado para dossiês de operações CATP, DU-E, DUIMP e LPCO<br/><br/>1 - Acessível para todos os órgãos da operação<br/>2 - Restringir a disponibilização para RFB e SEFAZ<br/>3 - Acessível apenas para RFB<br/><br/>
  **/
  private TipoAcessoEnum tipoAcesso = null;
 /**
   * Indica que este documento esta disponível para usuários do setor privado. (Se aplica apenas nos perfis RFB, Anuentes e SEFAZ)
   * @return acessivelSetorPrivado
  **/
  @JsonProperty("acessivelSetorPrivado")
  public Boolean isAcessivelSetorPrivado() {
    return acessivelSetorPrivado;
  }

  public void setAcessivelSetorPrivado(Boolean acessivelSetorPrivado) {
    this.acessivelSetorPrivado = acessivelSetorPrivado;
  }

  public Documento acessivelSetorPrivado(Boolean acessivelSetorPrivado) {
    this.acessivelSetorPrivado = acessivelSetorPrivado;
    return this;
  }

 /**
   * Tipo de usuário/órgão que anexou o documento.&lt;br/&gt;Tamanho máximo: 30
   * @return anexadoPor
  **/
  @JsonProperty("anexadoPor")
  @NotNull
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
  @NotNull
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
   * Somente será retornado para dossiês de operações DI, LI, RE, DT e DIR&lt;br/&gt;
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
  @NotNull
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
  @NotNull
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
  @NotNull
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
  @NotNull
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
  @NotNull
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
   * String em SHA256 representando o hash do arquivo.&lt;br/&gt;Tamanho: 64
   * @return sha256
  **/
  @JsonProperty("sha256")
  @NotNull
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

 /**
   * Tipo de acesso ao documento.&lt;br/&gt;&lt;br/&gt;Somente será retornado para dossiês de operações CATP, DU-E, DUIMP e LPCO&lt;br/&gt;&lt;br/&gt;1 - Acessível para todos os órgãos da operação&lt;br/&gt;2 - Restringir a disponibilização para RFB e SEFAZ&lt;br/&gt;3 - Acessível apenas para RFB&lt;br/&gt;&lt;br/&gt;
   * @return tipoAcesso
  **/
  @JsonProperty("tipoAcesso")
  public Integer getTipoAcesso() {
    if (tipoAcesso == null) {
      return null;
    }
    return tipoAcesso.value();
  }

  public void setTipoAcesso(TipoAcessoEnum tipoAcesso) {
    this.tipoAcesso = tipoAcesso;
  }

  public Documento tipoAcesso(TipoAcessoEnum tipoAcesso) {
    this.tipoAcesso = tipoAcesso;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Documento {\n");
    
    sb.append("    acessivelSetorPrivado: ").append(toIndentedString(acessivelSetorPrivado)).append("\n");
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
    sb.append("    sha256: ").append(toIndentedString(sha256)).append("\n");
    sb.append("    tipoAcesso: ").append(toIndentedString(tipoAcesso)).append("\n");
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

