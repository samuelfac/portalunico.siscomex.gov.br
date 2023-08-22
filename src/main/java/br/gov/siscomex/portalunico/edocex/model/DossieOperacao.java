package br.gov.siscomex.portalunico.edocex.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.time.OffsetDateTime;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "DossieOperacao", propOrder =
    { "cnpjCpf", "cpfCriacao", "cpfVinculacao", "criadoPor", "dataHoraCriacao", "dataHoraVinculacao", "descricaoDossie", "documentos", "dossiesVinculados", "idTipoDossie", "nomeTipoDossie", "numeroDossie", "vinculadoPor"
})

@XmlRootElement(name="DossieOperacao")
/**
  * Dossiê retornado na consulta por operação.
 **/
@ApiModel(description="Dossiê retornado na consulta por operação.")
public class DossieOperacao  {
  
  @XmlElement(name="cnpjCpf", required = true)
  @ApiModelProperty(example = "88888888888888", required = true, value = "CNPJ ou CPF do dossiê sem formatação.<br/>Tamanho: 14(CNPJ) ou 11(CPF)")
 /**
   * CNPJ ou CPF do dossiê sem formatação.<br/>Tamanho: 14(CNPJ) ou 11(CPF)
  **/
  private String cnpjCpf = null;

  @XmlElement(name="cpfCriacao", required = true)
  @ApiModelProperty(example = "77777777777", required = true, value = "CPF do usuário que criou o dossiê sem formatação.<br/>Tamanho: 11")
 /**
   * CPF do usuário que criou o dossiê sem formatação.<br/>Tamanho: 11
  **/
  private String cpfCriacao = null;

  @XmlElement(name="cpfVinculacao", required = true)
  @ApiModelProperty(example = "77777777777", required = true, value = "CPF do usuário que vinculou o dossiê sem formatação.<br/>Tamanho: 11")
 /**
   * CPF do usuário que vinculou o dossiê sem formatação.<br/>Tamanho: 11
  **/
  private String cpfVinculacao = null;


@XmlType(name="CriadoPorEnum")
@XmlEnum(String.class)
public enum CriadoPorEnum {

	@XmlEnumValue("Representante Legal")
	@JsonProperty("Representante Legal")
	REPRESENTANTE_LEGAL(String.valueOf("Representante Legal")),
	
	@XmlEnumValue("Administração Pública")
	@JsonProperty("Administração Pública")
	ADMINISTRA_O_P_BLICA(String.valueOf("Administração Pública"));


    private String value;

    CriadoPorEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static CriadoPorEnum fromValue(String v) {
        for (CriadoPorEnum b : CriadoPorEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to CriadoPorEnum");
    }
}

  @XmlElement(name="criadoPor", required = true)
  @ApiModelProperty(example = "Representante Legal", required = true, value = "Tipo de usuário/órgão que criou o documento.")
 /**
   * Tipo de usuário/órgão que criou o documento.
  **/
  private CriadoPorEnum criadoPor = null;

  @XmlElement(name="dataHoraCriacao", required = true)
  @ApiModelProperty(required = true, value = "Data/hora da criação.<br/>Formato ISO 8601: yyyy-MM-dd'T'HH:mm:ss.SSSz")
 /**
   * Data/hora da criação.<br/>Formato ISO 8601: yyyy-MM-dd'T'HH:mm:ss.SSSz
  **/
  private OffsetDateTime dataHoraCriacao = null;

  @XmlElement(name="dataHoraVinculacao")
  @ApiModelProperty(value = "Data/hora da vinculação do  dossiê à operação.<br/>Formato ISO 8601: yyyy-MM-dd'T'HH:mm:ss.SSSz")
 /**
   * Data/hora da vinculação do  dossiê à operação.<br/>Formato ISO 8601: yyyy-MM-dd'T'HH:mm:ss.SSSz
  **/
  private OffsetDateTime dataHoraVinculacao = null;

  @XmlElement(name="descricaoDossie", required = true)
  @ApiModelProperty(example = "Dossiê de exemplo", required = true, value = "Descrição do dossiê.<br/>Tamanho máximo: 255")
 /**
   * Descrição do dossiê.<br/>Tamanho máximo: 255
  **/
  private String descricaoDossie = null;

  @XmlElement(name="documentos")
  @ApiModelProperty(value = "")
  @Valid
  private List<Documento> documentos = null;

  @XmlElement(name="dossiesVinculados")
  @ApiModelProperty(value = "\\*Somente se exitirem dossiês vinculados ao dossiê da operação.<br/>Lista de dossiês vinculados ao dossiê da operação. ")
  @Valid
 /**
   * \\*Somente se exitirem dossiês vinculados ao dossiê da operação.<br/>Lista de dossiês vinculados ao dossiê da operação. 
  **/
  private List<DossieVinculado> dossiesVinculados = null;

  @XmlElement(name="idTipoDossie", required = true)
  @ApiModelProperty(example = "538797", required = true, value = "Id do tipo de dossiê.<br/>Valor mínimo: 1<br/>Valor máximo: 2147483647")
 /**
   * Id do tipo de dossiê.<br/>Valor mínimo: 1<br/>Valor máximo: 2147483647
  **/
  private Long idTipoDossie = null;

  @XmlElement(name="nomeTipoDossie")
  @ApiModelProperty(example = "Dossiê de Importação", value = "Nome do tipo de dossiê.<br/>Tamanho máximo: 255")
 /**
   * Nome do tipo de dossiê.<br/>Tamanho máximo: 255
  **/
  private String nomeTipoDossie = null;

  @XmlElement(name="numeroDossie", required = true)
  @ApiModelProperty(example = "201900012345678", required = true, value = "Número do dossiê.<br/>Tamanho: 15<br/>Formato: NNNNNNNNNNNNNNN")
 /**
   * Número do dossiê.<br/>Tamanho: 15<br/>Formato: NNNNNNNNNNNNNNN
  **/
  private String numeroDossie = null;


@XmlType(name="VinculadoPorEnum")
@XmlEnum(String.class)
public enum VinculadoPorEnum {

	@XmlEnumValue("Representante Legal")
	@JsonProperty("Representante Legal")
	REPRESENTANTE_LEGAL(String.valueOf("Representante Legal")),
	
	@XmlEnumValue("Administração Pública")
	@JsonProperty("Administração Pública")
	ADMINISTRA_O_P_BLICA(String.valueOf("Administração Pública"));


    private String value;

    VinculadoPorEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static VinculadoPorEnum fromValue(String v) {
        for (VinculadoPorEnum b : VinculadoPorEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to VinculadoPorEnum");
    }
}

  @XmlElement(name="vinculadoPor", required = true)
  @ApiModelProperty(example = "Representante Legal", required = true, value = "Tipo de usuário/órgão que vinculou o dossiê.")
 /**
   * Tipo de usuário/órgão que vinculou o dossiê.
  **/
  private VinculadoPorEnum vinculadoPor = null;
 /**
   * CNPJ ou CPF do dossiê sem formatação.&lt;br/&gt;Tamanho: 14(CNPJ) ou 11(CPF)
   * @return cnpjCpf
  **/
  @JsonProperty("cnpjCpf")
  @NotNull
  public String getCnpjCpf() {
    return cnpjCpf;
  }

  public void setCnpjCpf(String cnpjCpf) {
    this.cnpjCpf = cnpjCpf;
  }

  public DossieOperacao cnpjCpf(String cnpjCpf) {
    this.cnpjCpf = cnpjCpf;
    return this;
  }

 /**
   * CPF do usuário que criou o dossiê sem formatação.&lt;br/&gt;Tamanho: 11
   * @return cpfCriacao
  **/
  @JsonProperty("cpfCriacao")
  @NotNull
  public String getCpfCriacao() {
    return cpfCriacao;
  }

  public void setCpfCriacao(String cpfCriacao) {
    this.cpfCriacao = cpfCriacao;
  }

  public DossieOperacao cpfCriacao(String cpfCriacao) {
    this.cpfCriacao = cpfCriacao;
    return this;
  }

 /**
   * CPF do usuário que vinculou o dossiê sem formatação.&lt;br/&gt;Tamanho: 11
   * @return cpfVinculacao
  **/
  @JsonProperty("cpfVinculacao")
  @NotNull
  public String getCpfVinculacao() {
    return cpfVinculacao;
  }

  public void setCpfVinculacao(String cpfVinculacao) {
    this.cpfVinculacao = cpfVinculacao;
  }

  public DossieOperacao cpfVinculacao(String cpfVinculacao) {
    this.cpfVinculacao = cpfVinculacao;
    return this;
  }

 /**
   * Tipo de usuário/órgão que criou o documento.
   * @return criadoPor
  **/
  @JsonProperty("criadoPor")
  @NotNull
  public String getCriadoPor() {
    if (criadoPor == null) {
      return null;
    }
    return criadoPor.value();
  }

  public void setCriadoPor(CriadoPorEnum criadoPor) {
    this.criadoPor = criadoPor;
  }

  public DossieOperacao criadoPor(CriadoPorEnum criadoPor) {
    this.criadoPor = criadoPor;
    return this;
  }

 /**
   * Data/hora da criação.&lt;br/&gt;Formato ISO 8601: yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSz
   * @return dataHoraCriacao
  **/
  @JsonProperty("dataHoraCriacao")
  @NotNull
  public OffsetDateTime getDataHoraCriacao() {
    return dataHoraCriacao;
  }

  public void setDataHoraCriacao(OffsetDateTime dataHoraCriacao) {
    this.dataHoraCriacao = dataHoraCriacao;
  }

  public DossieOperacao dataHoraCriacao(OffsetDateTime dataHoraCriacao) {
    this.dataHoraCriacao = dataHoraCriacao;
    return this;
  }

 /**
   * Data/hora da vinculação do  dossiê à operação.&lt;br/&gt;Formato ISO 8601: yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSz
   * @return dataHoraVinculacao
  **/
  @JsonProperty("dataHoraVinculacao")
  public OffsetDateTime getDataHoraVinculacao() {
    return dataHoraVinculacao;
  }

  public void setDataHoraVinculacao(OffsetDateTime dataHoraVinculacao) {
    this.dataHoraVinculacao = dataHoraVinculacao;
  }

  public DossieOperacao dataHoraVinculacao(OffsetDateTime dataHoraVinculacao) {
    this.dataHoraVinculacao = dataHoraVinculacao;
    return this;
  }

 /**
   * Descrição do dossiê.&lt;br/&gt;Tamanho máximo: 255
   * @return descricaoDossie
  **/
  @JsonProperty("descricaoDossie")
  @NotNull
  public String getDescricaoDossie() {
    return descricaoDossie;
  }

  public void setDescricaoDossie(String descricaoDossie) {
    this.descricaoDossie = descricaoDossie;
  }

  public DossieOperacao descricaoDossie(String descricaoDossie) {
    this.descricaoDossie = descricaoDossie;
    return this;
  }

 /**
   * Get documentos
   * @return documentos
  **/
  @JsonProperty("documentos")
  public List<Documento> getDocumentos() {
    return documentos;
  }

  public void setDocumentos(List<Documento> documentos) {
    this.documentos = documentos;
  }

  public DossieOperacao documentos(List<Documento> documentos) {
    this.documentos = documentos;
    return this;
  }

  public DossieOperacao addDocumentosItem(Documento documentosItem) {
    this.documentos.add(documentosItem);
    return this;
  }

 /**
   * \\*Somente se exitirem dossiês vinculados ao dossiê da operação.&lt;br/&gt;Lista de dossiês vinculados ao dossiê da operação. 
   * @return dossiesVinculados
  **/
  @JsonProperty("dossiesVinculados")
  public List<DossieVinculado> getDossiesVinculados() {
    return dossiesVinculados;
  }

  public void setDossiesVinculados(List<DossieVinculado> dossiesVinculados) {
    this.dossiesVinculados = dossiesVinculados;
  }

  public DossieOperacao dossiesVinculados(List<DossieVinculado> dossiesVinculados) {
    this.dossiesVinculados = dossiesVinculados;
    return this;
  }

  public DossieOperacao addDossiesVinculadosItem(DossieVinculado dossiesVinculadosItem) {
    this.dossiesVinculados.add(dossiesVinculadosItem);
    return this;
  }

 /**
   * Id do tipo de dossiê.&lt;br/&gt;Valor mínimo: 1&lt;br/&gt;Valor máximo: 2147483647
   * @return idTipoDossie
  **/
  @JsonProperty("idTipoDossie")
  @NotNull
  public Long getIdTipoDossie() {
    return idTipoDossie;
  }

  public void setIdTipoDossie(Long idTipoDossie) {
    this.idTipoDossie = idTipoDossie;
  }

  public DossieOperacao idTipoDossie(Long idTipoDossie) {
    this.idTipoDossie = idTipoDossie;
    return this;
  }

 /**
   * Nome do tipo de dossiê.&lt;br/&gt;Tamanho máximo: 255
   * @return nomeTipoDossie
  **/
  @JsonProperty("nomeTipoDossie")
  public String getNomeTipoDossie() {
    return nomeTipoDossie;
  }

  public void setNomeTipoDossie(String nomeTipoDossie) {
    this.nomeTipoDossie = nomeTipoDossie;
  }

  public DossieOperacao nomeTipoDossie(String nomeTipoDossie) {
    this.nomeTipoDossie = nomeTipoDossie;
    return this;
  }

 /**
   * Número do dossiê.&lt;br/&gt;Tamanho: 15&lt;br/&gt;Formato: NNNNNNNNNNNNNNN
   * @return numeroDossie
  **/
  @JsonProperty("numeroDossie")
  @NotNull
  public String getNumeroDossie() {
    return numeroDossie;
  }

  public void setNumeroDossie(String numeroDossie) {
    this.numeroDossie = numeroDossie;
  }

  public DossieOperacao numeroDossie(String numeroDossie) {
    this.numeroDossie = numeroDossie;
    return this;
  }

 /**
   * Tipo de usuário/órgão que vinculou o dossiê.
   * @return vinculadoPor
  **/
  @JsonProperty("vinculadoPor")
  @NotNull
  public String getVinculadoPor() {
    if (vinculadoPor == null) {
      return null;
    }
    return vinculadoPor.value();
  }

  public void setVinculadoPor(VinculadoPorEnum vinculadoPor) {
    this.vinculadoPor = vinculadoPor;
  }

  public DossieOperacao vinculadoPor(VinculadoPorEnum vinculadoPor) {
    this.vinculadoPor = vinculadoPor;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DossieOperacao {\n");
    
    sb.append("    cnpjCpf: ").append(toIndentedString(cnpjCpf)).append("\n");
    sb.append("    cpfCriacao: ").append(toIndentedString(cpfCriacao)).append("\n");
    sb.append("    cpfVinculacao: ").append(toIndentedString(cpfVinculacao)).append("\n");
    sb.append("    criadoPor: ").append(toIndentedString(criadoPor)).append("\n");
    sb.append("    dataHoraCriacao: ").append(toIndentedString(dataHoraCriacao)).append("\n");
    sb.append("    dataHoraVinculacao: ").append(toIndentedString(dataHoraVinculacao)).append("\n");
    sb.append("    descricaoDossie: ").append(toIndentedString(descricaoDossie)).append("\n");
    sb.append("    documentos: ").append(toIndentedString(documentos)).append("\n");
    sb.append("    dossiesVinculados: ").append(toIndentedString(dossiesVinculados)).append("\n");
    sb.append("    idTipoDossie: ").append(toIndentedString(idTipoDossie)).append("\n");
    sb.append("    nomeTipoDossie: ").append(toIndentedString(nomeTipoDossie)).append("\n");
    sb.append("    numeroDossie: ").append(toIndentedString(numeroDossie)).append("\n");
    sb.append("    vinculadoPor: ").append(toIndentedString(vinculadoPor)).append("\n");
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

