package br.gov.siscomex.portalunico.edocex.model;

import br.gov.siscomex.portalunico.edocex.model.ConteudoPalavraChave;
import io.swagger.v3.oas.annotations.media.Schema;
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
 @XmlType(name = "ParametroAnexarDocumentoPorDossie", propOrder =
    { "acessivelSetorPrivado", "arquivo", "assinatura", "idTipoDocumento", "nomeArquivo", "numeroDossie", "orgaosAnuentes", "palavrasChave"
})

@XmlRootElement(name="ParametroAnexarDocumentoPorDossie")
/**
  * Parâmetros para anexar documento pelo número do dossiê.
 **/
@ApiModel(description="Parâmetros para anexar documento pelo número do dossiê.")
public class ParametroAnexarDocumentoPorDossie  {
  
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

  @XmlElement(name="numeroDossie", required = true)
  @ApiModelProperty(example = "201900012345678", required = true, value = "Número do dossiê.<br/>Tamanho: 15<br/>Formato: NNNNNNNNNNNNNNN")
 /**
   * Número do dossiê.<br/>Tamanho: 15<br/>Formato: NNNNNNNNNNNNNNN
  **/
  private String numeroDossie = null;

  @XmlElement(name="orgaosAnuentes", required = true)
  @ApiModelProperty(example = "[\"RECEITA\",\"SECEX\"]", required = true, value = "Lista com as siglas dos órgãos para os quais o documento deverá estar disponível.<br/><br/>As siglas devem ser obtidas pelos serviços /ext/tipos-documentos-dossie ou /ext/tipos-documentos-operacao<br/>(campo sigla da lista de orgaosAnuentes)<br/><br/>Seguem algumas siglas com as respectivas descrições:<br/>ANCINE - AGENCIA NACIONAL DO CINEMA<br/>ANEEL - AGENCIA NACIONAL DE ENERGIA ELETRICA<br/>ANP - AGENCIA NACIONAL DO PETROLEO<br/>ANVISA - AGENCIA NACIONAL DE VIGILANCIA SANITARIA<br/>BB - BANCO DO BRASIL<br/>BNDES - BANCO NACIONAL DE DESENVOLVIMENTO ECONÔMICO E SOCIAL<br/>CNEN - COMISSAO NACIONAL DE ENERGIA NUCLEAR<br/>CNPQ - CONSELHO NACIONAL DE DESENVOLVIMENTO CIENTIFICO E TECNOLOGICO<br/>CONFAZ - CONSELHO NACIONAL DE POLITICA FAZENDARIA/SECRETARIAS DE FAZENDA ESTADUAIS<br/>DEAEX - DEPARTAMENTO DE ESTATISTICA E APOIO A EXPORTACAO<br/>DECEX - DEPARTAMENTO DE OPERACOES DE COMERCIO EXTERIOR<br/>DFPC - DIRETORIA DE FISCALIZACAO DE PRODUTOS CONTROLADOS-COMANDO DO EXERCITO<br/>DNPM - DEPARTAMENTO NACIONAL DE PRODUCAO MINERAL<br/>DPF - DEPARTAMENTO DE POLICIA FEDERAL<br/>ECT - EMPRESA BRASILEIRA DE CORREIOS E TELEGRAFOS<br/>IBAMA - INSTITUTO BRASILEIRO DO MEIO AMBIENTE E DOS RECURSOS NATURAIS RENOVAVEIS<br/>INMETRO - INSTITUTO NACIONAL DE METROLOGIA<br/>IPHAN - INSTITUTO DO PATRIMÔNIO HISTÓRICO E ARTÍSTICO NACIONAL<br/>MAPA - MINISTERIO DA AGRICULTURA,PECUARIA E ABASTECIMENTO<br/>MCT - MINISTERIO DA CIENCIA, TECNOLOGIA E INOVACAO<br/>MIN.DEFESA - MINISTERIO DA DEFESA<br/>MRE - MINISTÉRIO DAS RELAÇÕES EXTERIORES<br/>RECEITA - RECEITA FEDERAL DO BRASIL<br/>SECEX - SECRETARIA DE COMERCIO EXTERIOR<br/>SUFRAMA - SUPERINTENDENCIA DA ZONA FRANCA DE MANAUS")
 /**
   * Lista com as siglas dos órgãos para os quais o documento deverá estar disponível.<br/><br/>As siglas devem ser obtidas pelos serviços /ext/tipos-documentos-dossie ou /ext/tipos-documentos-operacao<br/>(campo sigla da lista de orgaosAnuentes)<br/><br/>Seguem algumas siglas com as respectivas descrições:<br/>ANCINE - AGENCIA NACIONAL DO CINEMA<br/>ANEEL - AGENCIA NACIONAL DE ENERGIA ELETRICA<br/>ANP - AGENCIA NACIONAL DO PETROLEO<br/>ANVISA - AGENCIA NACIONAL DE VIGILANCIA SANITARIA<br/>BB - BANCO DO BRASIL<br/>BNDES - BANCO NACIONAL DE DESENVOLVIMENTO ECONÔMICO E SOCIAL<br/>CNEN - COMISSAO NACIONAL DE ENERGIA NUCLEAR<br/>CNPQ - CONSELHO NACIONAL DE DESENVOLVIMENTO CIENTIFICO E TECNOLOGICO<br/>CONFAZ - CONSELHO NACIONAL DE POLITICA FAZENDARIA/SECRETARIAS DE FAZENDA ESTADUAIS<br/>DEAEX - DEPARTAMENTO DE ESTATISTICA E APOIO A EXPORTACAO<br/>DECEX - DEPARTAMENTO DE OPERACOES DE COMERCIO EXTERIOR<br/>DFPC - DIRETORIA DE FISCALIZACAO DE PRODUTOS CONTROLADOS-COMANDO DO EXERCITO<br/>DNPM - DEPARTAMENTO NACIONAL DE PRODUCAO MINERAL<br/>DPF - DEPARTAMENTO DE POLICIA FEDERAL<br/>ECT - EMPRESA BRASILEIRA DE CORREIOS E TELEGRAFOS<br/>IBAMA - INSTITUTO BRASILEIRO DO MEIO AMBIENTE E DOS RECURSOS NATURAIS RENOVAVEIS<br/>INMETRO - INSTITUTO NACIONAL DE METROLOGIA<br/>IPHAN - INSTITUTO DO PATRIMÔNIO HISTÓRICO E ARTÍSTICO NACIONAL<br/>MAPA - MINISTERIO DA AGRICULTURA,PECUARIA E ABASTECIMENTO<br/>MCT - MINISTERIO DA CIENCIA, TECNOLOGIA E INOVACAO<br/>MIN.DEFESA - MINISTERIO DA DEFESA<br/>MRE - MINISTÉRIO DAS RELAÇÕES EXTERIORES<br/>RECEITA - RECEITA FEDERAL DO BRASIL<br/>SECEX - SECRETARIA DE COMERCIO EXTERIOR<br/>SUFRAMA - SUPERINTENDENCIA DA ZONA FRANCA DE MANAUS
  **/
  private List<String> orgaosAnuentes = new ArrayList<>();

  @XmlElement(name="palavrasChave", required = true)
  @ApiModelProperty(required = true, value = "")
  @Valid
  private List<ConteudoPalavraChave> palavrasChave = new ArrayList<>();
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

  public ParametroAnexarDocumentoPorDossie acessivelSetorPrivado(Boolean acessivelSetorPrivado) {
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

  public ParametroAnexarDocumentoPorDossie arquivo(String arquivo) {
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

  public ParametroAnexarDocumentoPorDossie assinatura(String assinatura) {
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

  public ParametroAnexarDocumentoPorDossie idTipoDocumento(Integer idTipoDocumento) {
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

  public ParametroAnexarDocumentoPorDossie nomeArquivo(String nomeArquivo) {
    this.nomeArquivo = nomeArquivo;
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

  public ParametroAnexarDocumentoPorDossie numeroDossie(String numeroDossie) {
    this.numeroDossie = numeroDossie;
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

  public ParametroAnexarDocumentoPorDossie orgaosAnuentes(List<String> orgaosAnuentes) {
    this.orgaosAnuentes = orgaosAnuentes;
    return this;
  }

  public ParametroAnexarDocumentoPorDossie addOrgaosAnuentesItem(String orgaosAnuentesItem) {
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

  public ParametroAnexarDocumentoPorDossie palavrasChave(List<ConteudoPalavraChave> palavrasChave) {
    this.palavrasChave = palavrasChave;
    return this;
  }

  public ParametroAnexarDocumentoPorDossie addPalavrasChaveItem(ConteudoPalavraChave palavrasChaveItem) {
    this.palavrasChave.add(palavrasChaveItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParametroAnexarDocumentoPorDossie {\n");
    
    sb.append("    acessivelSetorPrivado: ").append(toIndentedString(acessivelSetorPrivado)).append("\n");
    sb.append("    arquivo: ").append(toIndentedString(arquivo)).append("\n");
    sb.append("    assinatura: ").append(toIndentedString(assinatura)).append("\n");
    sb.append("    idTipoDocumento: ").append(toIndentedString(idTipoDocumento)).append("\n");
    sb.append("    nomeArquivo: ").append(toIndentedString(nomeArquivo)).append("\n");
    sb.append("    numeroDossie: ").append(toIndentedString(numeroDossie)).append("\n");
    sb.append("    orgaosAnuentes: ").append(toIndentedString(orgaosAnuentes)).append("\n");
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

