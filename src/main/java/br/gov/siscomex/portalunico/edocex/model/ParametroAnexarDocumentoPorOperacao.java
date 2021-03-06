package br.gov.siscomex.portalunico.edocex.model;

import java.util.ArrayList;
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
 @XmlType(name = "ParametroAnexarDocumentoPorOperacao", propOrder =
    { "arquivo", "assinatura", "idTipoDocumento", "nomeArquivo", "numeroOperacao", "orgaosAnuentes", "palavrasChave", "restritoAosOrgaos", "tipoOperacao"
})

@XmlRootElement(name="ParametroAnexarDocumentoPorOperacao")
/**
  * Parâmetros para anexar documento pelo tipo e número da operação.
 **/
@ApiModel(description="Parâmetros para anexar documento pelo tipo e número da operação.")
public class ParametroAnexarDocumentoPorOperacao  {
  
  @XmlElement(name="arquivo", required = true)
  @ApiModelProperty(example = "dGVzdGUgZGUgYXJxdWl2byB0ZXh0by4K", required = true, value = "String em BASE64 representando o conteúdo do arquivo.<br/>Tamanho máximo do arquivo original: equivalente a 15MB, aproximadamente 20MB em BASE64")
 /**
   * String em BASE64 representando o conteúdo do arquivo.<br/>Tamanho máximo do arquivo original: equivalente a 15MB, aproximadamente 20MB em BASE64
  **/
  private String arquivo = null;

  @XmlElement(name="assinatura", required = true)
  @ApiModelProperty(example = "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", required = true, value = "String em BASE64 representando o conteúdo da assinatura referente ao arquivo.<br/>Tamanho aproximado: equivalente a 2,9KB do arquivo original, aproximadamente 3,8KB em BASE64")
 /**
   * String em BASE64 representando o conteúdo da assinatura referente ao arquivo.<br/>Tamanho aproximado: equivalente a 2,9KB do arquivo original, aproximadamente 3,8KB em BASE64
  **/
  private String assinatura = null;

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

  @XmlElement(name="numeroOperacao", required = true)
  @ApiModelProperty(example = "2000001571", required = true, value = "Número da operação.<br/>Tamanho máximo: 255<br/>Formato: de acordo com o definido em cada sistema de origem do tipo de operação.")
 /**
   * Número da operação.<br/>Tamanho máximo: 255<br/>Formato: de acordo com o definido em cada sistema de origem do tipo de operação.
  **/
  private String numeroOperacao = null;

  @XmlElement(name="orgaosAnuentes", required = true)
  @ApiModelProperty(example = "[\"RECEITA\",\"SECEX\"]", required = true, value = "Lista com as siglas dos órgãos para os quais o documento deverá estar disponível.<br/><br/>As siglas devem ser obtidas pelos serviços /ext/tipos-documentos-dossie ou /ext/tipos-documentos-operacao<br/>(campo sigla da lista de orgaosAnuentes)<br/><br/>Seguem algumas siglas com as respectivas descrições:<br/>ANCINE - AGENCIA NACIONAL DO CINEMA<br/>ANEEL - AGENCIA NACIONAL DE ENERGIA ELETRICA<br/>ANP - AGENCIA NACIONAL DO PETROLEO<br/>ANVISA - AGENCIA NACIONAL DE VIGILANCIA SANITARIA<br/>BB - BANCO DO BRASIL<br/>BNDES - BANCO NACIONAL DE DESENVOLVIMENTO ECONÔMICO E SOCIAL<br/>CNEN - COMISSAO NACIONAL DE ENERGIA NUCLEAR<br/>CNPQ - CONSELHO NACIONAL DE DESENVOLVIMENTO CIENTIFICO E TECNOLOGICO<br/>CONFAZ - CONSELHO NACIONAL DE POLITICA FAZENDARIA/SECRETARIAS DE FAZENDA ESTADUAIS<br/>DEAEX - DEPARTAMENTO DE ESTATISTICA E APOIO A EXPORTACAO<br/>DECEX - DEPARTAMENTO DE OPERACOES DE COMERCIO EXTERIOR<br/>DFPC - DIRETORIA DE FISCALIZACAO DE PRODUTOS CONTROLADOS-COMANDO DO EXERCITO<br/>DNPM - DEPARTAMENTO NACIONAL DE PRODUCAO MINERAL<br/>DPF - DEPARTAMENTO DE POLICIA FEDERAL<br/>ECT - EMPRESA BRASILEIRA DE CORREIOS E TELEGRAFOS<br/>IBAMA - INSTITUTO BRASILEIRO DO MEIO AMBIENTE E DOS RECURSOS NATURAIS RENOVAVEIS<br/>INMETRO - INSTITUTO NACIONAL DE METROLOGIA<br/>IPHAN - INSTITUTO DO PATRIMÔNIO HISTÓRICO E ARTÍSTICO NACIONAL<br/>MAPA - MINISTERIO DA AGRICULTURA,PECUARIA E ABASTECIMENTO<br/>MCT - MINISTERIO DA CIENCIA, TECNOLOGIA E INOVACAO<br/>MIN.DEFESA - MINISTERIO DA DEFESA<br/>MRE - MINISTÉRIO DAS RELAÇÕES EXTERIORES<br/>RECEITA - RECEITA FEDERAL DO BRASIL<br/>SECEX - SECRETARIA DE COMERCIO EXTERIOR<br/>SUFRAMA - SUPERINTENDENCIA DA ZONA FRANCA DE MANAUS")
 /**
   * Lista com as siglas dos órgãos para os quais o documento deverá estar disponível.<br/><br/>As siglas devem ser obtidas pelos serviços /ext/tipos-documentos-dossie ou /ext/tipos-documentos-operacao<br/>(campo sigla da lista de orgaosAnuentes)<br/><br/>Seguem algumas siglas com as respectivas descrições:<br/>ANCINE - AGENCIA NACIONAL DO CINEMA<br/>ANEEL - AGENCIA NACIONAL DE ENERGIA ELETRICA<br/>ANP - AGENCIA NACIONAL DO PETROLEO<br/>ANVISA - AGENCIA NACIONAL DE VIGILANCIA SANITARIA<br/>BB - BANCO DO BRASIL<br/>BNDES - BANCO NACIONAL DE DESENVOLVIMENTO ECONÔMICO E SOCIAL<br/>CNEN - COMISSAO NACIONAL DE ENERGIA NUCLEAR<br/>CNPQ - CONSELHO NACIONAL DE DESENVOLVIMENTO CIENTIFICO E TECNOLOGICO<br/>CONFAZ - CONSELHO NACIONAL DE POLITICA FAZENDARIA/SECRETARIAS DE FAZENDA ESTADUAIS<br/>DEAEX - DEPARTAMENTO DE ESTATISTICA E APOIO A EXPORTACAO<br/>DECEX - DEPARTAMENTO DE OPERACOES DE COMERCIO EXTERIOR<br/>DFPC - DIRETORIA DE FISCALIZACAO DE PRODUTOS CONTROLADOS-COMANDO DO EXERCITO<br/>DNPM - DEPARTAMENTO NACIONAL DE PRODUCAO MINERAL<br/>DPF - DEPARTAMENTO DE POLICIA FEDERAL<br/>ECT - EMPRESA BRASILEIRA DE CORREIOS E TELEGRAFOS<br/>IBAMA - INSTITUTO BRASILEIRO DO MEIO AMBIENTE E DOS RECURSOS NATURAIS RENOVAVEIS<br/>INMETRO - INSTITUTO NACIONAL DE METROLOGIA<br/>IPHAN - INSTITUTO DO PATRIMÔNIO HISTÓRICO E ARTÍSTICO NACIONAL<br/>MAPA - MINISTERIO DA AGRICULTURA,PECUARIA E ABASTECIMENTO<br/>MCT - MINISTERIO DA CIENCIA, TECNOLOGIA E INOVACAO<br/>MIN.DEFESA - MINISTERIO DA DEFESA<br/>MRE - MINISTÉRIO DAS RELAÇÕES EXTERIORES<br/>RECEITA - RECEITA FEDERAL DO BRASIL<br/>SECEX - SECRETARIA DE COMERCIO EXTERIOR<br/>SUFRAMA - SUPERINTENDENCIA DA ZONA FRANCA DE MANAUS
  **/
  private List<String> orgaosAnuentes = new ArrayList<>();

  @XmlElement(name="palavrasChave")
  @ApiModelProperty(value = "")
  @Valid
  private List<ConteudoPalavraChave> palavrasChave = null;

  @XmlElement(name="restritoAosOrgaos")
  @ApiModelProperty(example = "true", value = "Indica que este documento esta disponível apenas para os órgãos anuentes. (Se aplica apenas nas visões RFB e Anuentes)")
 /**
   * Indica que este documento esta disponível apenas para os órgãos anuentes. (Se aplica apenas nas visões RFB e Anuentes)
  **/
  private Boolean restritoAosOrgaos = false;


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
  @ApiModelProperty(example = "DI", required = true, value = "DI - Declaração de Importação<br/>LI - Licença de Importação<br/>RE - Registro de Exportação<br/>DT - Declaração de Trânsito<br/>DIR - Declaração de Importação de Remessa<br/>CATP - Catálogo de Produtos<br/>DUE - Declaração Única de Exportação<br/>LPCO - Tratamento Administrativo/LPCO<br/></br>")
 /**
   * DI - Declaração de Importação<br/>LI - Licença de Importação<br/>RE - Registro de Exportação<br/>DT - Declaração de Trânsito<br/>DIR - Declaração de Importação de Remessa<br/>CATP - Catálogo de Produtos<br/>DUE - Declaração Única de Exportação<br/>LPCO - Tratamento Administrativo/LPCO<br/></br>
  **/
  private TipoOperacaoEnum tipoOperacao = null;
 /**
   * String em BASE64 representando o conteúdo do arquivo.&lt;br/&gt;Tamanho máximo do arquivo original: equivalente a 15MB, aproximadamente 20MB em BASE64
   * @return arquivo
  **/
  @JsonProperty("arquivo")
  @NotNull
  public String getArquivo() {
    return arquivo;
  }

  public void setArquivo(String arquivo) {
    this.arquivo = arquivo;
  }

  public ParametroAnexarDocumentoPorOperacao arquivo(String arquivo) {
    this.arquivo = arquivo;
    return this;
  }

 /**
   * String em BASE64 representando o conteúdo da assinatura referente ao arquivo.&lt;br/&gt;Tamanho aproximado: equivalente a 2,9KB do arquivo original, aproximadamente 3,8KB em BASE64
   * @return assinatura
  **/
  @JsonProperty("assinatura")
  @NotNull
  public String getAssinatura() {
    return assinatura;
  }

  public void setAssinatura(String assinatura) {
    this.assinatura = assinatura;
  }

  public ParametroAnexarDocumentoPorOperacao assinatura(String assinatura) {
    this.assinatura = assinatura;
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

  public ParametroAnexarDocumentoPorOperacao idTipoDocumento(Integer idTipoDocumento) {
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

  public ParametroAnexarDocumentoPorOperacao nomeArquivo(String nomeArquivo) {
    this.nomeArquivo = nomeArquivo;
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

  public ParametroAnexarDocumentoPorOperacao numeroOperacao(String numeroOperacao) {
    this.numeroOperacao = numeroOperacao;
    return this;
  }

 /**
   * Lista com as siglas dos órgãos para os quais o documento deverá estar disponível.&lt;br/&gt;&lt;br/&gt;As siglas devem ser obtidas pelos serviços /ext/tipos-documentos-dossie ou /ext/tipos-documentos-operacao&lt;br/&gt;(campo sigla da lista de orgaosAnuentes)&lt;br/&gt;&lt;br/&gt;Seguem algumas siglas com as respectivas descrições:&lt;br/&gt;ANCINE - AGENCIA NACIONAL DO CINEMA&lt;br/&gt;ANEEL - AGENCIA NACIONAL DE ENERGIA ELETRICA&lt;br/&gt;ANP - AGENCIA NACIONAL DO PETROLEO&lt;br/&gt;ANVISA - AGENCIA NACIONAL DE VIGILANCIA SANITARIA&lt;br/&gt;BB - BANCO DO BRASIL&lt;br/&gt;BNDES - BANCO NACIONAL DE DESENVOLVIMENTO ECONÔMICO E SOCIAL&lt;br/&gt;CNEN - COMISSAO NACIONAL DE ENERGIA NUCLEAR&lt;br/&gt;CNPQ - CONSELHO NACIONAL DE DESENVOLVIMENTO CIENTIFICO E TECNOLOGICO&lt;br/&gt;CONFAZ - CONSELHO NACIONAL DE POLITICA FAZENDARIA/SECRETARIAS DE FAZENDA ESTADUAIS&lt;br/&gt;DEAEX - DEPARTAMENTO DE ESTATISTICA E APOIO A EXPORTACAO&lt;br/&gt;DECEX - DEPARTAMENTO DE OPERACOES DE COMERCIO EXTERIOR&lt;br/&gt;DFPC - DIRETORIA DE FISCALIZACAO DE PRODUTOS CONTROLADOS-COMANDO DO EXERCITO&lt;br/&gt;DNPM - DEPARTAMENTO NACIONAL DE PRODUCAO MINERAL&lt;br/&gt;DPF - DEPARTAMENTO DE POLICIA FEDERAL&lt;br/&gt;ECT - EMPRESA BRASILEIRA DE CORREIOS E TELEGRAFOS&lt;br/&gt;IBAMA - INSTITUTO BRASILEIRO DO MEIO AMBIENTE E DOS RECURSOS NATURAIS RENOVAVEIS&lt;br/&gt;INMETRO - INSTITUTO NACIONAL DE METROLOGIA&lt;br/&gt;IPHAN - INSTITUTO DO PATRIMÔNIO HISTÓRICO E ARTÍSTICO NACIONAL&lt;br/&gt;MAPA - MINISTERIO DA AGRICULTURA,PECUARIA E ABASTECIMENTO&lt;br/&gt;MCT - MINISTERIO DA CIENCIA, TECNOLOGIA E INOVACAO&lt;br/&gt;MIN.DEFESA - MINISTERIO DA DEFESA&lt;br/&gt;MRE - MINISTÉRIO DAS RELAÇÕES EXTERIORES&lt;br/&gt;RECEITA - RECEITA FEDERAL DO BRASIL&lt;br/&gt;SECEX - SECRETARIA DE COMERCIO EXTERIOR&lt;br/&gt;SUFRAMA - SUPERINTENDENCIA DA ZONA FRANCA DE MANAUS
   * @return orgaosAnuentes
  **/
  @JsonProperty("orgaosAnuentes")
  @NotNull
  public List<String> getOrgaosAnuentes() {
    return orgaosAnuentes;
  }

  public void setOrgaosAnuentes(List<String> orgaosAnuentes) {
    this.orgaosAnuentes = orgaosAnuentes;
  }

  public ParametroAnexarDocumentoPorOperacao orgaosAnuentes(List<String> orgaosAnuentes) {
    this.orgaosAnuentes = orgaosAnuentes;
    return this;
  }

  public ParametroAnexarDocumentoPorOperacao addOrgaosAnuentesItem(String orgaosAnuentesItem) {
    this.orgaosAnuentes.add(orgaosAnuentesItem);
    return this;
  }

 /**
   * Get palavrasChave
   * @return palavrasChave
  **/
  @JsonProperty("palavrasChave")
  public List<ConteudoPalavraChave> getPalavrasChave() {
    return palavrasChave;
  }

  public void setPalavrasChave(List<ConteudoPalavraChave> palavrasChave) {
    this.palavrasChave = palavrasChave;
  }

  public ParametroAnexarDocumentoPorOperacao palavrasChave(List<ConteudoPalavraChave> palavrasChave) {
    this.palavrasChave = palavrasChave;
    return this;
  }

  public ParametroAnexarDocumentoPorOperacao addPalavrasChaveItem(ConteudoPalavraChave palavrasChaveItem) {
    this.palavrasChave.add(palavrasChaveItem);
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

  public ParametroAnexarDocumentoPorOperacao restritoAosOrgaos(Boolean restritoAosOrgaos) {
    this.restritoAosOrgaos = restritoAosOrgaos;
    return this;
  }

 /**
   * DI - Declaração de Importação&lt;br/&gt;LI - Licença de Importação&lt;br/&gt;RE - Registro de Exportação&lt;br/&gt;DT - Declaração de Trânsito&lt;br/&gt;DIR - Declaração de Importação de Remessa&lt;br/&gt;CATP - Catálogo de Produtos&lt;br/&gt;DUE - Declaração Única de Exportação&lt;br/&gt;LPCO - Tratamento Administrativo/LPCO&lt;br/&gt;&lt;/br&gt;
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

  public ParametroAnexarDocumentoPorOperacao tipoOperacao(TipoOperacaoEnum tipoOperacao) {
    this.tipoOperacao = tipoOperacao;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParametroAnexarDocumentoPorOperacao {\n");
    
    sb.append("    arquivo: ").append(toIndentedString(arquivo)).append("\n");
    sb.append("    assinatura: ").append(toIndentedString(assinatura)).append("\n");
    sb.append("    idTipoDocumento: ").append(toIndentedString(idTipoDocumento)).append("\n");
    sb.append("    nomeArquivo: ").append(toIndentedString(nomeArquivo)).append("\n");
    sb.append("    numeroOperacao: ").append(toIndentedString(numeroOperacao)).append("\n");
    sb.append("    orgaosAnuentes: ").append(toIndentedString(orgaosAnuentes)).append("\n");
    sb.append("    palavrasChave: ").append(toIndentedString(palavrasChave)).append("\n");
    sb.append("    restritoAosOrgaos: ").append(toIndentedString(restritoAosOrgaos)).append("\n");
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

