package br.gov.siscomex.portalunico.edocex.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "ParametroAnexarDocumentoPorOperacao", propOrder =
    { "acessivelSetorPrivado", "arquivo", "assinatura", "idTipoDocumento", "nomeArquivo", "numeroOperacao", "orgaosAnuentes", "palavrasChave", "tipoAcesso", "tipoOperacao"
})

@XmlRootElement(name="ParametroAnexarDocumentoPorOperacao")
/**
  * Parâmetros para anexar documento pelo tipo e número da operação.
 **/
@ApiModel(description="Parâmetros para anexar documento pelo tipo e número da operação.")
public class ParametroAnexarDocumentoPorOperacao  {
  
  @XmlElement(name="acessivelSetorPrivado")
  @ApiModelProperty(example = "false", value = "Indica que este documento esta disponível para usuários do setor privado. (Se aplica apenas nos perfis RFB, Anuentes e SEFAZ)")
 /**
   * Indica que este documento esta disponível para usuários do setor privado. (Se aplica apenas nos perfis RFB, Anuentes e SEFAZ)
  **/
  private Boolean acessivelSetorPrivado = false;

  @XmlElement(name="arquivo", required = true)
  @ApiModelProperty(example = "dGVzdGUgZGUgYXJxdWl2byB0ZXh0by4K", required = true, value = "String em BASE64 representando o conteúdo do arquivo.<br/>Tamanho máximo do arquivo original: equivalente a 15MB, aproximadamente 20MB em BASE64")
 /**
   * String em BASE64 representando o conteúdo do arquivo.<br/>Tamanho máximo do arquivo original: equivalente a 15MB, aproximadamente 20MB em BASE64
  **/
  private String arquivo = null;

  @XmlElement(name="assinatura", required = true)
  @ApiModelProperty(example = "MIAGCSqGSEHAqCAMIACAQExDzANBglghkgBZQMEAgMFADkqhkiG9w0BBwEAAKCAMIIHDzCCBPegAwIBA ..... QwF+gC2xXC1V1u9Yb7PvYoLW/c1z6fpfYsODUVgF6hiddQsH0Ioh3tYP11tb1rQfXpRW+C0OAAAAAAAA", required = true, value = "String em BASE64 representando o conteúdo da assinatura referente ao arquivo.<br/>Tamanho aproximado: equivalente a 2,9KB do arquivo original, aproximadamente 3,8KB em BASE64")
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
  @ApiModelProperty(example = "2000001571", required = true, value = "Número da operação.<br/>Tamanho máximo: 255<br/>Formato: de acordo com o definido em cada sistema de origem do tipo de operação.<br/><br/>Para CATP - Catálogo de Produtos<br/>Formato: <CNPJ Raíz ou CPF>-<código do produto><br/>onde:<br/><CNPJ Raíz> = NNNNNNNN - 8 primeiros dígitos do CNPJ<br/>&lt;CPF&gt; = NNNNNNNNNNN - 11 dígitos do CPF. É utilizado quando o usuário se auto representa como importador/exportador.<br/><código do produto> = NNNNNNNNNN - 10 dígitos do código do produto gerado no CATP - Catálogo de Produtos<br/><br/>Exemplo: para CNPJ 00000000-0000001049, para CPF 01646244907-0000000001")
 /**
   * Número da operação.<br/>Tamanho máximo: 255<br/>Formato: de acordo com o definido em cada sistema de origem do tipo de operação.<br/><br/>Para CATP - Catálogo de Produtos<br/>Formato: <CNPJ Raíz ou CPF>-<código do produto><br/>onde:<br/><CNPJ Raíz> = NNNNNNNN - 8 primeiros dígitos do CNPJ<br/>&lt;CPF&gt; = NNNNNNNNNNN - 11 dígitos do CPF. É utilizado quando o usuário se auto representa como importador/exportador.<br/><código do produto> = NNNNNNNNNN - 10 dígitos do código do produto gerado no CATP - Catálogo de Produtos<br/><br/>Exemplo: para CNPJ 00000000-0000001049, para CPF 01646244907-0000000001
  **/
  private String numeroOperacao = null;

  @XmlElement(name="orgaosAnuentes")
  @ApiModelProperty(example = "[\"RECEITA\",\"SECEX\"]", value = "Lista com as siglas dos órgãos para os quais o documento deverá estar disponível.<br/><br/>* somente deve ser informada para o tipo de acesso '0 - Definido pelo usuário'.<br/><br/><br/>As siglas devem ser obtidas pelos serviços /ext/tipos-documentos-dossie ou /ext/tipos-documentos-operacao<br/>(campo sigla da lista de orgaosAnuentes)<br/><br/>Seguem algumas siglas com as respectivas descrições:<br/>ANCINE - AGENCIA NACIONAL DO CINEMA<br/>ANEEL - AGENCIA NACIONAL DE ENERGIA ELETRICA<br/>ANP - AGENCIA NACIONAL DO PETROLEO<br/>ANVISA - AGENCIA NACIONAL DE VIGILANCIA SANITARIA<br/>BB - BANCO DO BRASIL<br/>BNDES - BANCO NACIONAL DE DESENVOLVIMENTO ECONÔMICO E SOCIAL<br/>CNEN - COMISSAO NACIONAL DE ENERGIA NUCLEAR<br/>CNPQ - CONSELHO NACIONAL DE DESENVOLVIMENTO CIENTIFICO E TECNOLOGICO<br/>CONFAZ - CONSELHO NACIONAL DE POLITICA FAZENDARIA/SECRETARIAS DE FAZENDA ESTADUAIS<br/>DEAEX - DEPARTAMENTO DE ESTATISTICA E APOIO A EXPORTACAO<br/>DECEX - DEPARTAMENTO DE OPERACOES DE COMERCIO EXTERIOR<br/>DFPC - DIRETORIA DE FISCALIZACAO DE PRODUTOS CONTROLADOS-COMANDO DO EXERCITO<br/>DNPM - DEPARTAMENTO NACIONAL DE PRODUCAO MINERAL<br/>DPF - DEPARTAMENTO DE POLICIA FEDERAL<br/>ECT - EMPRESA BRASILEIRA DE CORREIOS E TELEGRAFOS<br/>IBAMA - INSTITUTO BRASILEIRO DO MEIO AMBIENTE E DOS RECURSOS NATURAIS RENOVAVEIS<br/>INMETRO - INSTITUTO NACIONAL DE METROLOGIA<br/>IPHAN - INSTITUTO DO PATRIMÔNIO HISTÓRICO E ARTÍSTICO NACIONAL<br/>MAPA - MINISTERIO DA AGRICULTURA,PECUARIA E ABASTECIMENTO<br/>MCT - MINISTERIO DA CIENCIA, TECNOLOGIA E INOVACAO<br/>MIN.DEFESA - MINISTERIO DA DEFESA<br/>MRE - MINISTÉRIO DAS RELAÇÕES EXTERIORES<br/>RECEITA - RECEITA FEDERAL DO BRASIL<br/>SECEX - SECRETARIA DE COMERCIO EXTERIOR<br/>SUFRAMA - SUPERINTENDENCIA DA ZONA FRANCA DE MANAUS")
 /**
   * Lista com as siglas dos órgãos para os quais o documento deverá estar disponível.<br/><br/>* somente deve ser informada para o tipo de acesso '0 - Definido pelo usuário'.<br/><br/><br/>As siglas devem ser obtidas pelos serviços /ext/tipos-documentos-dossie ou /ext/tipos-documentos-operacao<br/>(campo sigla da lista de orgaosAnuentes)<br/><br/>Seguem algumas siglas com as respectivas descrições:<br/>ANCINE - AGENCIA NACIONAL DO CINEMA<br/>ANEEL - AGENCIA NACIONAL DE ENERGIA ELETRICA<br/>ANP - AGENCIA NACIONAL DO PETROLEO<br/>ANVISA - AGENCIA NACIONAL DE VIGILANCIA SANITARIA<br/>BB - BANCO DO BRASIL<br/>BNDES - BANCO NACIONAL DE DESENVOLVIMENTO ECONÔMICO E SOCIAL<br/>CNEN - COMISSAO NACIONAL DE ENERGIA NUCLEAR<br/>CNPQ - CONSELHO NACIONAL DE DESENVOLVIMENTO CIENTIFICO E TECNOLOGICO<br/>CONFAZ - CONSELHO NACIONAL DE POLITICA FAZENDARIA/SECRETARIAS DE FAZENDA ESTADUAIS<br/>DEAEX - DEPARTAMENTO DE ESTATISTICA E APOIO A EXPORTACAO<br/>DECEX - DEPARTAMENTO DE OPERACOES DE COMERCIO EXTERIOR<br/>DFPC - DIRETORIA DE FISCALIZACAO DE PRODUTOS CONTROLADOS-COMANDO DO EXERCITO<br/>DNPM - DEPARTAMENTO NACIONAL DE PRODUCAO MINERAL<br/>DPF - DEPARTAMENTO DE POLICIA FEDERAL<br/>ECT - EMPRESA BRASILEIRA DE CORREIOS E TELEGRAFOS<br/>IBAMA - INSTITUTO BRASILEIRO DO MEIO AMBIENTE E DOS RECURSOS NATURAIS RENOVAVEIS<br/>INMETRO - INSTITUTO NACIONAL DE METROLOGIA<br/>IPHAN - INSTITUTO DO PATRIMÔNIO HISTÓRICO E ARTÍSTICO NACIONAL<br/>MAPA - MINISTERIO DA AGRICULTURA,PECUARIA E ABASTECIMENTO<br/>MCT - MINISTERIO DA CIENCIA, TECNOLOGIA E INOVACAO<br/>MIN.DEFESA - MINISTERIO DA DEFESA<br/>MRE - MINISTÉRIO DAS RELAÇÕES EXTERIORES<br/>RECEITA - RECEITA FEDERAL DO BRASIL<br/>SECEX - SECRETARIA DE COMERCIO EXTERIOR<br/>SUFRAMA - SUPERINTENDENCIA DA ZONA FRANCA DE MANAUS
  **/
  private List<String> orgaosAnuentes = null;

  @XmlElement(name="palavrasChave", required = true)
  @ApiModelProperty(required = true, value = "")
  @Valid
  private List<ConteudoPalavraChave> palavrasChave = new ArrayList<>();


@XmlType(name="TipoAcessoEnum")
@XmlEnum(Integer.class)
public enum TipoAcessoEnum {

	@XmlEnumValue("0")
	@JsonProperty("0")
	NUMBER_0(Integer.valueOf(0)),
	
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
  @ApiModelProperty(example = "1", value = "Tipo de acesso ao documento.<br/><br/>Por padrão os documentos serão acessados por todos os órgãos da operação. Apenas em caso de exceção pode-se restringir a disponibilização para RFB e SEFAZ.<br/><br/>Para os tipos de operações DI, LI, RE, DT e DIR, idependentemente do perfil do usuário, deve ser obrigatoriamente:<br/>0 - Definido pelo usuário<br/><br/>Para os tipos de operações DUE, DUIMP, CATP e LPCO deve ser atribuido conforme o perfil do usuário.<br/><br/>Perfis do setor privado:<br/>1 - Acessível para todos os órgãos da operação<br/>2 - Restringir a disponibilização para RFB e SEFAZ<br/><br/>Perfil Anuentes e SEFAZ:<br/>1 - Acessível para todos os órgãos da operação<br/><br/>Perfil RFB:<br/>1 - Acessível para todos os órgãos da operação<br/>3 - Acessível apenas para RFB<br/>")
 /**
   * Tipo de acesso ao documento.<br/><br/>Por padrão os documentos serão acessados por todos os órgãos da operação. Apenas em caso de exceção pode-se restringir a disponibilização para RFB e SEFAZ.<br/><br/>Para os tipos de operações DI, LI, RE, DT e DIR, idependentemente do perfil do usuário, deve ser obrigatoriamente:<br/>0 - Definido pelo usuário<br/><br/>Para os tipos de operações DUE, DUIMP, CATP e LPCO deve ser atribuido conforme o perfil do usuário.<br/><br/>Perfis do setor privado:<br/>1 - Acessível para todos os órgãos da operação<br/>2 - Restringir a disponibilização para RFB e SEFAZ<br/><br/>Perfil Anuentes e SEFAZ:<br/>1 - Acessível para todos os órgãos da operação<br/><br/>Perfil RFB:<br/>1 - Acessível para todos os órgãos da operação<br/>3 - Acessível apenas para RFB<br/>
  **/
  private TipoAcessoEnum tipoAcesso = null;


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
  @ApiModelProperty(example = "DI", required = true, value = "DI - Declaração de Importação<br/>LI - Licença de Importação<br/>RE - Registro de Exportação<br/>DT - Declaração de Trânsito<br/>DIR - Declaração de Importação de Remessa<br/>CATP - Catálogo de Produtos<br/>DUE - Declaração Única de Exportação<br/>DUIMP - Declaração Única de Importação,<br/>LPCO - Tratamento Administrativo/LPCO<br/></br>")
 /**
   * DI - Declaração de Importação<br/>LI - Licença de Importação<br/>RE - Registro de Exportação<br/>DT - Declaração de Trânsito<br/>DIR - Declaração de Importação de Remessa<br/>CATP - Catálogo de Produtos<br/>DUE - Declaração Única de Exportação<br/>DUIMP - Declaração Única de Importação,<br/>LPCO - Tratamento Administrativo/LPCO<br/></br>
  **/
  private TipoOperacaoEnum tipoOperacao = null;
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

  public ParametroAnexarDocumentoPorOperacao acessivelSetorPrivado(Boolean acessivelSetorPrivado) {
    this.acessivelSetorPrivado = acessivelSetorPrivado;
    return this;
  }

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
   * Número da operação.&lt;br/&gt;Tamanho máximo: 255&lt;br/&gt;Formato: de acordo com o definido em cada sistema de origem do tipo de operação.&lt;br/&gt;&lt;br/&gt;Para CATP - Catálogo de Produtos&lt;br/&gt;Formato: &lt;CNPJ Raíz ou CPF&gt;-&lt;código do produto&gt;&lt;br/&gt;onde:&lt;br/&gt;&lt;CNPJ Raíz&gt; &#x3D; NNNNNNNN - 8 primeiros dígitos do CNPJ&lt;br/&gt;&amp;lt;CPF&amp;gt; &#x3D; NNNNNNNNNNN - 11 dígitos do CPF. É utilizado quando o usuário se auto representa como importador/exportador.&lt;br/&gt;&lt;código do produto&gt; &#x3D; NNNNNNNNNN - 10 dígitos do código do produto gerado no CATP - Catálogo de Produtos&lt;br/&gt;&lt;br/&gt;Exemplo: para CNPJ 00000000-0000001049, para CPF 01646244907-0000000001
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
   * Lista com as siglas dos órgãos para os quais o documento deverá estar disponível.&lt;br/&gt;&lt;br/&gt;* somente deve ser informada para o tipo de acesso &#39;0 - Definido pelo usuário&#39;.&lt;br/&gt;&lt;br/&gt;&lt;br/&gt;As siglas devem ser obtidas pelos serviços /ext/tipos-documentos-dossie ou /ext/tipos-documentos-operacao&lt;br/&gt;(campo sigla da lista de orgaosAnuentes)&lt;br/&gt;&lt;br/&gt;Seguem algumas siglas com as respectivas descrições:&lt;br/&gt;ANCINE - AGENCIA NACIONAL DO CINEMA&lt;br/&gt;ANEEL - AGENCIA NACIONAL DE ENERGIA ELETRICA&lt;br/&gt;ANP - AGENCIA NACIONAL DO PETROLEO&lt;br/&gt;ANVISA - AGENCIA NACIONAL DE VIGILANCIA SANITARIA&lt;br/&gt;BB - BANCO DO BRASIL&lt;br/&gt;BNDES - BANCO NACIONAL DE DESENVOLVIMENTO ECONÔMICO E SOCIAL&lt;br/&gt;CNEN - COMISSAO NACIONAL DE ENERGIA NUCLEAR&lt;br/&gt;CNPQ - CONSELHO NACIONAL DE DESENVOLVIMENTO CIENTIFICO E TECNOLOGICO&lt;br/&gt;CONFAZ - CONSELHO NACIONAL DE POLITICA FAZENDARIA/SECRETARIAS DE FAZENDA ESTADUAIS&lt;br/&gt;DEAEX - DEPARTAMENTO DE ESTATISTICA E APOIO A EXPORTACAO&lt;br/&gt;DECEX - DEPARTAMENTO DE OPERACOES DE COMERCIO EXTERIOR&lt;br/&gt;DFPC - DIRETORIA DE FISCALIZACAO DE PRODUTOS CONTROLADOS-COMANDO DO EXERCITO&lt;br/&gt;DNPM - DEPARTAMENTO NACIONAL DE PRODUCAO MINERAL&lt;br/&gt;DPF - DEPARTAMENTO DE POLICIA FEDERAL&lt;br/&gt;ECT - EMPRESA BRASILEIRA DE CORREIOS E TELEGRAFOS&lt;br/&gt;IBAMA - INSTITUTO BRASILEIRO DO MEIO AMBIENTE E DOS RECURSOS NATURAIS RENOVAVEIS&lt;br/&gt;INMETRO - INSTITUTO NACIONAL DE METROLOGIA&lt;br/&gt;IPHAN - INSTITUTO DO PATRIMÔNIO HISTÓRICO E ARTÍSTICO NACIONAL&lt;br/&gt;MAPA - MINISTERIO DA AGRICULTURA,PECUARIA E ABASTECIMENTO&lt;br/&gt;MCT - MINISTERIO DA CIENCIA, TECNOLOGIA E INOVACAO&lt;br/&gt;MIN.DEFESA - MINISTERIO DA DEFESA&lt;br/&gt;MRE - MINISTÉRIO DAS RELAÇÕES EXTERIORES&lt;br/&gt;RECEITA - RECEITA FEDERAL DO BRASIL&lt;br/&gt;SECEX - SECRETARIA DE COMERCIO EXTERIOR&lt;br/&gt;SUFRAMA - SUPERINTENDENCIA DA ZONA FRANCA DE MANAUS
   * @return orgaosAnuentes
  **/
  @JsonProperty("orgaosAnuentes")
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
  @NotNull
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
   * Tipo de acesso ao documento.&lt;br/&gt;&lt;br/&gt;Por padrão os documentos serão acessados por todos os órgãos da operação. Apenas em caso de exceção pode-se restringir a disponibilização para RFB e SEFAZ.&lt;br/&gt;&lt;br/&gt;Para os tipos de operações DI, LI, RE, DT e DIR, idependentemente do perfil do usuário, deve ser obrigatoriamente:&lt;br/&gt;0 - Definido pelo usuário&lt;br/&gt;&lt;br/&gt;Para os tipos de operações DUE, DUIMP, CATP e LPCO deve ser atribuido conforme o perfil do usuário.&lt;br/&gt;&lt;br/&gt;Perfis do setor privado:&lt;br/&gt;1 - Acessível para todos os órgãos da operação&lt;br/&gt;2 - Restringir a disponibilização para RFB e SEFAZ&lt;br/&gt;&lt;br/&gt;Perfil Anuentes e SEFAZ:&lt;br/&gt;1 - Acessível para todos os órgãos da operação&lt;br/&gt;&lt;br/&gt;Perfil RFB:&lt;br/&gt;1 - Acessível para todos os órgãos da operação&lt;br/&gt;3 - Acessível apenas para RFB&lt;br/&gt;
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

  public ParametroAnexarDocumentoPorOperacao tipoAcesso(TipoAcessoEnum tipoAcesso) {
    this.tipoAcesso = tipoAcesso;
    return this;
  }

 /**
   * DI - Declaração de Importação&lt;br/&gt;LI - Licença de Importação&lt;br/&gt;RE - Registro de Exportação&lt;br/&gt;DT - Declaração de Trânsito&lt;br/&gt;DIR - Declaração de Importação de Remessa&lt;br/&gt;CATP - Catálogo de Produtos&lt;br/&gt;DUE - Declaração Única de Exportação&lt;br/&gt;DUIMP - Declaração Única de Importação,&lt;br/&gt;LPCO - Tratamento Administrativo/LPCO&lt;br/&gt;&lt;/br&gt;
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
    
    sb.append("    acessivelSetorPrivado: ").append(toIndentedString(acessivelSetorPrivado)).append("\n");
    sb.append("    arquivo: ").append(toIndentedString(arquivo)).append("\n");
    sb.append("    assinatura: ").append(toIndentedString(assinatura)).append("\n");
    sb.append("    idTipoDocumento: ").append(toIndentedString(idTipoDocumento)).append("\n");
    sb.append("    nomeArquivo: ").append(toIndentedString(nomeArquivo)).append("\n");
    sb.append("    numeroOperacao: ").append(toIndentedString(numeroOperacao)).append("\n");
    sb.append("    orgaosAnuentes: ").append(toIndentedString(orgaosAnuentes)).append("\n");
    sb.append("    palavrasChave: ").append(toIndentedString(palavrasChave)).append("\n");
    sb.append("    tipoAcesso: ").append(toIndentedString(tipoAcesso)).append("\n");
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

