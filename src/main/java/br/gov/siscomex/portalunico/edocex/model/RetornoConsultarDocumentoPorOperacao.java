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
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "RetornoConsultarDocumentoPorOperacao", propOrder =
    { "documentos", "dossies", "dossiesVinculados", "numeroOperacao", "tipoOperacao"
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

  @XmlElement(name="dossiesVinculados")
  @ApiModelProperty(value = "\\*Somente se exitirem dossiês vinculados ao dossiê da operação.<br/>Lista de dossiês vinculados ao dossiê da operação. ")
  @Valid
 /**
   * \\*Somente se exitirem dossiês vinculados ao dossiê da operação.<br/>Lista de dossiês vinculados ao dossiê da operação. 
  **/
  private List<DossieVinculado> dossiesVinculados = null;

  @XmlElement(name="numeroOperacao", required = true)
  @ApiModelProperty(example = "19BR0000000174", required = true, value = "Número da operação.<br/>Tamanho máximo: 255<br/>Formato: de acordo com o definido em cada sistema de origem do tipo de operação.<br/><br/>Para DI - Declaração de Importação<br/>Formato: NNNNNNNNNN - 10 dígitos numéricos<br/>Exemplo: 2000004120<br/><br/>Para LI - Licença de Importação<br/>Formato: NNNNNNNNNNN - 11 dígitos numéricos<br/>Exemplo: 19000000235<br/><br/>Para RE - Registro de Exportação<br/>Formato: NNNNNNNNNNNN - 12 dígitos numéricos<br/>Exemplo: 190000005786<br/><br/>Para DT - Declaração de Trânsito<br/>Formato: NNNNNNNNNN - 10 dígitos numéricos<br/>Exemplo: 2100003784<br/><br/>Para DIR - Declaração de Importação de Remessa<br/>Formato: NNNNNNNNNNNN - 12 dígitos numéricos<br/>Exemplo: 210000103657<br/><br/>Para LPCO - Tratamento Administrativo/LPCO<br/>Formato: XNNNNNNNNNN - X = \"E\" para exportação ou \"I\" para importação concatenado com 10 dígitos numéricos<br/>Exemplo: E1900002152 ou I1900000454<br/><br/>Para CATP - Catálogo de Produtos<br/>Formato: <CNPJ Raíz ou CPF>-<código do produto><br/>onde:<br/><CNPJ Raíz> = NNNNNNNN - 8 primeiros dígitos do CNPJ<br/>&lt;CPF&gt; = NNNNNNNNNNN - 11 dígitos do CPF. É utilizado quando o usuário se auto representa como importador/exportador.<br/><código do produto> = NNNNNNNNNN - 10 dígitos do código do produto gerado no CATP - Catálogo de Produtos<br/>Exemplo: para CNPJ 00000000-0000001049, para CPF 01646244907-0000000001<br/><br/>Para DUE - Declaração Única de Exportação<br/>Formato: NNBRNNNNNNNNNN - 2 dígitos numéricos concatenados com \"BR\" e 10 dígitos numéricos<br/>Exemplo: 19BR0000000530<br/><br/>Para DUIMP - Declaração Única de Importação,<br/>Formato: NNBRNNNNNNNNNNN - 2 dígitos numéricos concatenados com \"BR\" e 11 dígitos numéricos<br/>Exemplo: 21BR00000002386<br/>")
 /**
   * Número da operação.<br/>Tamanho máximo: 255<br/>Formato: de acordo com o definido em cada sistema de origem do tipo de operação.<br/><br/>Para DI - Declaração de Importação<br/>Formato: NNNNNNNNNN - 10 dígitos numéricos<br/>Exemplo: 2000004120<br/><br/>Para LI - Licença de Importação<br/>Formato: NNNNNNNNNNN - 11 dígitos numéricos<br/>Exemplo: 19000000235<br/><br/>Para RE - Registro de Exportação<br/>Formato: NNNNNNNNNNNN - 12 dígitos numéricos<br/>Exemplo: 190000005786<br/><br/>Para DT - Declaração de Trânsito<br/>Formato: NNNNNNNNNN - 10 dígitos numéricos<br/>Exemplo: 2100003784<br/><br/>Para DIR - Declaração de Importação de Remessa<br/>Formato: NNNNNNNNNNNN - 12 dígitos numéricos<br/>Exemplo: 210000103657<br/><br/>Para LPCO - Tratamento Administrativo/LPCO<br/>Formato: XNNNNNNNNNN - X = \"E\" para exportação ou \"I\" para importação concatenado com 10 dígitos numéricos<br/>Exemplo: E1900002152 ou I1900000454<br/><br/>Para CATP - Catálogo de Produtos<br/>Formato: <CNPJ Raíz ou CPF>-<código do produto><br/>onde:<br/><CNPJ Raíz> = NNNNNNNN - 8 primeiros dígitos do CNPJ<br/>&lt;CPF&gt; = NNNNNNNNNNN - 11 dígitos do CPF. É utilizado quando o usuário se auto representa como importador/exportador.<br/><código do produto> = NNNNNNNNNN - 10 dígitos do código do produto gerado no CATP - Catálogo de Produtos<br/>Exemplo: para CNPJ 00000000-0000001049, para CPF 01646244907-0000000001<br/><br/>Para DUE - Declaração Única de Exportação<br/>Formato: NNBRNNNNNNNNNN - 2 dígitos numéricos concatenados com \"BR\" e 10 dígitos numéricos<br/>Exemplo: 19BR0000000530<br/><br/>Para DUIMP - Declaração Única de Importação,<br/>Formato: NNBRNNNNNNNNNNN - 2 dígitos numéricos concatenados com \"BR\" e 11 dígitos numéricos<br/>Exemplo: 21BR00000002386<br/>
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
	
	@XmlEnumValue("DT")
	@JsonProperty("DT")
	DT(String.valueOf("DT")),
	
	@XmlEnumValue("DIR")
	@JsonProperty("DIR")
	DIR(String.valueOf("DIR")),
	
	@XmlEnumValue("CATP")
	@JsonProperty("CATP")
	CATP(String.valueOf("CATP")),
	
	@XmlEnumValue("DUE")
	@JsonProperty("DUE")
	DUE(String.valueOf("DUE")),
	
	@XmlEnumValue("DUIMP")
	@JsonProperty("DUIMP")
	DUIMP(String.valueOf("DUIMP")),
	
	@XmlEnumValue("LPCO")
	@JsonProperty("LPCO")
	LPCO(String.valueOf("LPCO"));


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
  @ApiModelProperty(example = "DUE", required = true, value = "Identifica o tipo de operação desejado:<br/>DI - Declaração de Importação<br/>LI - Licença de Importação<br/>RE - Registro de Exportação<br/>DT - Declaração de Trânsito<br/>DIR - Declaração de Importação de Remessa<br/>CATP - Catálogo de Produtos<br/>DUE - Declaração Única de Exportação<br/>DUIMP - Declaração Única de Importação,<br/>LPCO - Tratamento Administrativo/LPCO<br/>")
 /**
   * Identifica o tipo de operação desejado:<br/>DI - Declaração de Importação<br/>LI - Licença de Importação<br/>RE - Registro de Exportação<br/>DT - Declaração de Trânsito<br/>DIR - Declaração de Importação de Remessa<br/>CATP - Catálogo de Produtos<br/>DUE - Declaração Única de Exportação<br/>DUIMP - Declaração Única de Importação,<br/>LPCO - Tratamento Administrativo/LPCO<br/>
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

  public RetornoConsultarDocumentoPorOperacao dossiesVinculados(List<DossieVinculado> dossiesVinculados) {
    this.dossiesVinculados = dossiesVinculados;
    return this;
  }

  public RetornoConsultarDocumentoPorOperacao addDossiesVinculadosItem(DossieVinculado dossiesVinculadosItem) {
    this.dossiesVinculados.add(dossiesVinculadosItem);
    return this;
  }

 /**
   * Número da operação.&lt;br/&gt;Tamanho máximo: 255&lt;br/&gt;Formato: de acordo com o definido em cada sistema de origem do tipo de operação.&lt;br/&gt;&lt;br/&gt;Para DI - Declaração de Importação&lt;br/&gt;Formato: NNNNNNNNNN - 10 dígitos numéricos&lt;br/&gt;Exemplo: 2000004120&lt;br/&gt;&lt;br/&gt;Para LI - Licença de Importação&lt;br/&gt;Formato: NNNNNNNNNNN - 11 dígitos numéricos&lt;br/&gt;Exemplo: 19000000235&lt;br/&gt;&lt;br/&gt;Para RE - Registro de Exportação&lt;br/&gt;Formato: NNNNNNNNNNNN - 12 dígitos numéricos&lt;br/&gt;Exemplo: 190000005786&lt;br/&gt;&lt;br/&gt;Para DT - Declaração de Trânsito&lt;br/&gt;Formato: NNNNNNNNNN - 10 dígitos numéricos&lt;br/&gt;Exemplo: 2100003784&lt;br/&gt;&lt;br/&gt;Para DIR - Declaração de Importação de Remessa&lt;br/&gt;Formato: NNNNNNNNNNNN - 12 dígitos numéricos&lt;br/&gt;Exemplo: 210000103657&lt;br/&gt;&lt;br/&gt;Para LPCO - Tratamento Administrativo/LPCO&lt;br/&gt;Formato: XNNNNNNNNNN - X &#x3D; \&quot;E\&quot; para exportação ou \&quot;I\&quot; para importação concatenado com 10 dígitos numéricos&lt;br/&gt;Exemplo: E1900002152 ou I1900000454&lt;br/&gt;&lt;br/&gt;Para CATP - Catálogo de Produtos&lt;br/&gt;Formato: &lt;CNPJ Raíz ou CPF&gt;-&lt;código do produto&gt;&lt;br/&gt;onde:&lt;br/&gt;&lt;CNPJ Raíz&gt; &#x3D; NNNNNNNN - 8 primeiros dígitos do CNPJ&lt;br/&gt;&amp;lt;CPF&amp;gt; &#x3D; NNNNNNNNNNN - 11 dígitos do CPF. É utilizado quando o usuário se auto representa como importador/exportador.&lt;br/&gt;&lt;código do produto&gt; &#x3D; NNNNNNNNNN - 10 dígitos do código do produto gerado no CATP - Catálogo de Produtos&lt;br/&gt;Exemplo: para CNPJ 00000000-0000001049, para CPF 01646244907-0000000001&lt;br/&gt;&lt;br/&gt;Para DUE - Declaração Única de Exportação&lt;br/&gt;Formato: NNBRNNNNNNNNNN - 2 dígitos numéricos concatenados com \&quot;BR\&quot; e 10 dígitos numéricos&lt;br/&gt;Exemplo: 19BR0000000530&lt;br/&gt;&lt;br/&gt;Para DUIMP - Declaração Única de Importação,&lt;br/&gt;Formato: NNBRNNNNNNNNNNN - 2 dígitos numéricos concatenados com \&quot;BR\&quot; e 11 dígitos numéricos&lt;br/&gt;Exemplo: 21BR00000002386&lt;br/&gt;
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
   * Identifica o tipo de operação desejado:&lt;br/&gt;DI - Declaração de Importação&lt;br/&gt;LI - Licença de Importação&lt;br/&gt;RE - Registro de Exportação&lt;br/&gt;DT - Declaração de Trânsito&lt;br/&gt;DIR - Declaração de Importação de Remessa&lt;br/&gt;CATP - Catálogo de Produtos&lt;br/&gt;DUE - Declaração Única de Exportação&lt;br/&gt;DUIMP - Declaração Única de Importação,&lt;br/&gt;LPCO - Tratamento Administrativo/LPCO&lt;br/&gt;
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
    sb.append("    dossiesVinculados: ").append(toIndentedString(dossiesVinculados)).append("\n");
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

