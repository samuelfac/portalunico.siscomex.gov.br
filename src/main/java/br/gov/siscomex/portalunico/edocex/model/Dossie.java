package br.gov.siscomex.portalunico.edocex.model;

import br.gov.siscomex.portalunico.edocex.model.Documento;
import br.gov.siscomex.portalunico.edocex.model.DossieVinculado;
import br.gov.siscomex.portalunico.edocex.model.Vinculo;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.OffsetDateTime;
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
 @XmlType(name = "Dossie", propOrder =
    { "cnpjCpf", "cpfCriacao", "criadoPor", "dataHoraCriacao", "descricaoDossie", "documentos", "dossiesVinculados", "idTipoDossie", "nomeTipoDossie", "numeroDossie", "vinculos"
})

@XmlRootElement(name="Dossie")
/**
  * Dossiê.
 **/
@ApiModel(description="Dossiê.")
public class Dossie  {
  
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

  @XmlElement(name="vinculos")
  @ApiModelProperty(value = "Lista de vinculos do dossiê com operações.")
  @Valid
 /**
   * Lista de vinculos do dossiê com operações.
  **/
  private List<Vinculo> vinculos = null;
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

  public Dossie cnpjCpf(String cnpjCpf) {
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

  public Dossie cpfCriacao(String cpfCriacao) {
    this.cpfCriacao = cpfCriacao;
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

  public Dossie criadoPor(CriadoPorEnum criadoPor) {
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

  public Dossie dataHoraCriacao(OffsetDateTime dataHoraCriacao) {
    this.dataHoraCriacao = dataHoraCriacao;
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

  public Dossie descricaoDossie(String descricaoDossie) {
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

  public Dossie documentos(List<Documento> documentos) {
    this.documentos = documentos;
    return this;
  }

  public Dossie addDocumentosItem(Documento documentosItem) {
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

  public Dossie dossiesVinculados(List<DossieVinculado> dossiesVinculados) {
    this.dossiesVinculados = dossiesVinculados;
    return this;
  }

  public Dossie addDossiesVinculadosItem(DossieVinculado dossiesVinculadosItem) {
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

  public Dossie idTipoDossie(Long idTipoDossie) {
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

  public Dossie nomeTipoDossie(String nomeTipoDossie) {
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

  public Dossie numeroDossie(String numeroDossie) {
    this.numeroDossie = numeroDossie;
    return this;
  }

 /**
   * Lista de vinculos do dossiê com operações.
   * @return vinculos
  **/
  @JsonProperty("vinculos")
  public List<Vinculo> getVinculos() {
    return vinculos;
  }

  public void setVinculos(List<Vinculo> vinculos) {
    this.vinculos = vinculos;
  }

  public Dossie vinculos(List<Vinculo> vinculos) {
    this.vinculos = vinculos;
    return this;
  }

  public Dossie addVinculosItem(Vinculo vinculosItem) {
    this.vinculos.add(vinculosItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Dossie {\n");
    
    sb.append("    cnpjCpf: ").append(toIndentedString(cnpjCpf)).append("\n");
    sb.append("    cpfCriacao: ").append(toIndentedString(cpfCriacao)).append("\n");
    sb.append("    criadoPor: ").append(toIndentedString(criadoPor)).append("\n");
    sb.append("    dataHoraCriacao: ").append(toIndentedString(dataHoraCriacao)).append("\n");
    sb.append("    descricaoDossie: ").append(toIndentedString(descricaoDossie)).append("\n");
    sb.append("    documentos: ").append(toIndentedString(documentos)).append("\n");
    sb.append("    dossiesVinculados: ").append(toIndentedString(dossiesVinculados)).append("\n");
    sb.append("    idTipoDossie: ").append(toIndentedString(idTipoDossie)).append("\n");
    sb.append("    nomeTipoDossie: ").append(toIndentedString(nomeTipoDossie)).append("\n");
    sb.append("    numeroDossie: ").append(toIndentedString(numeroDossie)).append("\n");
    sb.append("    vinculos: ").append(toIndentedString(vinculos)).append("\n");
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

