package br.gov.siscomex.portalunico.edocex.model;

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
 @XmlType(name = "RetornoConsultarDocumentoPorOperacao", propOrder =
    { "documentos", "dossies", "numeroOperacao", "tipoOperacao"
})

@XmlRootElement(name="RetornoConsultarDocumentoPorOperacao")
/**
  * Retorno da consulta de documentos por operação.
 **/
@ApiModel(description="Retorno da consulta de documentos por operação.")
public class RetornoConsultarDocumentoPorOperacao  {
  
  @XmlElement(name="documentos")
  @ApiModelProperty(value = "\\* somente quando houver apenas um dossiê para a operação.<br/>Lista de documentos.")
  @Valid
 /**
   * \\* somente quando houver apenas um dossiê para a operação.<br/>Lista de documentos.
  **/
  private List<Documento> documentos = null;

  @XmlElement(name="dossies")
  @ApiModelProperty(value = "\\* somente quando houver mais de um dossiê para a operação.<br/>Lista de dossiês.")
  @Valid
 /**
   * \\* somente quando houver mais de um dossiê para a operação.<br/>Lista de dossiês.
  **/
  private List<DossieOperacao> dossies = null;

  @XmlElement(name="numeroOperacao", required = true)
  @ApiModelProperty(example = "19BR0000000174", required = true, value = "Número da operação.<br/>Tamanho máximo: 255<br/>Formato: de acordo com o definido em cada sistema de origem do tipo de operação.")
 /**
   * Número da operação.<br/>Tamanho máximo: 255<br/>Formato: de acordo com o definido em cada sistema de origem do tipo de operação.
  **/
  private String numeroOperacao = null;


@XmlType(name="TipoOperacaoEnum")
@XmlEnum(String.class)
public enum TipoOperacaoEnum {

	@XmlEnumValue("DI")
	@JsonProperty("DI")
	DI(String.valueOf("DI")),
	
	@XmlEnumValue("LI")
	@JsonProperty("LI")
	LI(String.valueOf("LI")),
	
	@XmlEnumValue("RE")
	@JsonProperty("RE")
	RE(String.valueOf("RE")),
	
	@XmlEnumValue("LPCO")
	@JsonProperty("LPCO")
	LPCO(String.valueOf("LPCO")),
	
	@XmlEnumValue("DUE")
	@JsonProperty("DUE")
	DUE(String.valueOf("DUE")),
	
	@XmlEnumValue("CATP")
	@JsonProperty("CATP")
	CATP(String.valueOf("CATP")),
	
	@XmlEnumValue("DUIMP")
	@JsonProperty("DUIMP")
	DUIMP(String.valueOf("DUIMP")),
	
	@XmlEnumValue("DT")
	@JsonProperty("DT")
	DT(String.valueOf("DT")),
	
	@XmlEnumValue("DIR")
	@JsonProperty("DIR")
	DIR(String.valueOf("DIR")),
	
	@XmlEnumValue("RECINTOS")
	@JsonProperty("RECINTOS")
	RECINTOS(String.valueOf("RECINTOS"));


    private String value;

    TipoOperacaoEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TipoOperacaoEnum fromValue(String v) {
        for (TipoOperacaoEnum b : TipoOperacaoEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to TipoOperacaoEnum");
    }
}

  @XmlElement(name="tipoOperacao", required = true)
  @ApiModelProperty(example = "DUE", required = true, value = "Identifica o tipo de operação desejado:<br/>DI - Declaração de Importação,<br/>LI - Licença de Importação,<br/>RE - Registro de Exportação,<br/>LPCO - Tratamento Administrativo/LPCO,<br/>DUE - Declaração Única de Exportação,<br/>CATP - Catálogo de Produtos,<br/>DUIMP - Declaração Única de Importação,<br/>DT - Declaração de Trânsito,<br/>DIR - Declaração de Importação de Remessa</br>RECINTOS - Recintos Aduaneiros")
 /**
   * Identifica o tipo de operação desejado:<br/>DI - Declaração de Importação,<br/>LI - Licença de Importação,<br/>RE - Registro de Exportação,<br/>LPCO - Tratamento Administrativo/LPCO,<br/>DUE - Declaração Única de Exportação,<br/>CATP - Catálogo de Produtos,<br/>DUIMP - Declaração Única de Importação,<br/>DT - Declaração de Trânsito,<br/>DIR - Declaração de Importação de Remessa</br>RECINTOS - Recintos Aduaneiros
  **/
  private TipoOperacaoEnum tipoOperacao = null;
 /**
   * \\* somente quando houver apenas um dossiê para a operação.&lt;br/&gt;Lista de documentos.
   * @return documentos
  **/
  @JsonProperty("documentos")
  public List<Documento> getDocumentos() {
    return documentos;
  }

  public void setDocumentos(List<Documento> documentos) {
    this.documentos = documentos;
  }

  public RetornoConsultarDocumentoPorOperacao documentos(List<Documento> documentos) {
    this.documentos = documentos;
    return this;
  }

  public RetornoConsultarDocumentoPorOperacao addDocumentosItem(Documento documentosItem) {
    this.documentos.add(documentosItem);
    return this;
  }

 /**
   * \\* somente quando houver mais de um dossiê para a operação.&lt;br/&gt;Lista de dossiês.
   * @return dossies
  **/
  @JsonProperty("dossies")
  public List<DossieOperacao> getDossies() {
    return dossies;
  }

  public void setDossies(List<DossieOperacao> dossies) {
    this.dossies = dossies;
  }

  public RetornoConsultarDocumentoPorOperacao dossies(List<DossieOperacao> dossies) {
    this.dossies = dossies;
    return this;
  }

  public RetornoConsultarDocumentoPorOperacao addDossiesItem(DossieOperacao dossiesItem) {
    this.dossies.add(dossiesItem);
    return this;
  }

 /**
   * Número da operação.&lt;br/&gt;Tamanho máximo: 255&lt;br/&gt;Formato: de acordo com o definido em cada sistema de origem do tipo de operação.
   * @return numeroOperacao
  **/
  @JsonProperty("numeroOperacao")
  @NotNull
  public String getNumeroOperacao() {
    return numeroOperacao;
  }

  public void setNumeroOperacao(String numeroOperacao) {
    this.numeroOperacao = numeroOperacao;
  }

  public RetornoConsultarDocumentoPorOperacao numeroOperacao(String numeroOperacao) {
    this.numeroOperacao = numeroOperacao;
    return this;
  }

 /**
   * Identifica o tipo de operação desejado:&lt;br/&gt;DI - Declaração de Importação,&lt;br/&gt;LI - Licença de Importação,&lt;br/&gt;RE - Registro de Exportação,&lt;br/&gt;LPCO - Tratamento Administrativo/LPCO,&lt;br/&gt;DUE - Declaração Única de Exportação,&lt;br/&gt;CATP - Catálogo de Produtos,&lt;br/&gt;DUIMP - Declaração Única de Importação,&lt;br/&gt;DT - Declaração de Trânsito,&lt;br/&gt;DIR - Declaração de Importação de Remessa&lt;/br&gt;RECINTOS - Recintos Aduaneiros
   * @return tipoOperacao
  **/
  @JsonProperty("tipoOperacao")
  @NotNull
  public String getTipoOperacao() {
    if (tipoOperacao == null) {
      return null;
    }
    return tipoOperacao.value();
  }

  public void setTipoOperacao(TipoOperacaoEnum tipoOperacao) {
    this.tipoOperacao = tipoOperacao;
  }

  public RetornoConsultarDocumentoPorOperacao tipoOperacao(TipoOperacaoEnum tipoOperacao) {
    this.tipoOperacao = tipoOperacao;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetornoConsultarDocumentoPorOperacao {\n");
    
    sb.append("    documentos: ").append(toIndentedString(documentos)).append("\n");
    sb.append("    dossies: ").append(toIndentedString(dossies)).append("\n");
    sb.append("    numeroOperacao: ").append(toIndentedString(numeroOperacao)).append("\n");
    sb.append("    tipoOperacao: ").append(toIndentedString(tipoOperacao)).append("\n");
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

