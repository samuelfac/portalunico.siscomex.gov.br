package br.gov.siscomex.portalunico.anex.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParametroAnexarDocumentoPorDossie", propOrder =
        {"acessivelSetorPrivado", "numeroDossie", "idTipoDocumento", "nomeArquivo", "arquivo", "palavrasChave", "orgaosAnuentes"
        })

@XmlRootElement(name = "ParametroAnexarDocumentoPorDossie")
/**
 * Arquivo e dados do documento
 **/
@ApiModel(description = "Arquivo e dados do documento")
public class ParametroAnexarDocumentoPorDossie {

    @XmlElement(name = "acessivelSetorPrivado")
    @ApiModelProperty(example = "false", value = "Indica que este documento esta disponível para usuários do setor privado. (Se aplica apenas nos perfis RFB, Anuentes e SEFAZ)")
    /**
     * Indica que este documento esta disponível para usuários do setor privado. (Se aplica apenas nos perfis RFB, Anuentes e SEFAZ)
     **/
    private Boolean acessivelSetorPrivado = null;

    @XmlElement(name = "numeroDossie", required = true)
    @ApiModelProperty(example = "201900012345678", required = true, value = "Número do dossiê.<br/>Tamanho: 15<br/>Formato: NNNNNNNNNNNNNNN")
    /**
     * Número do dossiê.<br/>Tamanho: 15<br/>Formato: NNNNNNNNNNNNNNN
     **/
    private String numeroDossie = null;

    @XmlElement(name = "idTipoDocumento", required = true)
    @ApiModelProperty(example = "87453", required = true, value = "Id do tipo de documento.<br/>Valor mínimo: 1<br/>Valor máximo: 2147483647")
    /**
     * Id do tipo de documento.<br/>Valor mínimo: 1<br/>Valor máximo: 2147483647
     **/
    private Integer idTipoDocumento = null;

    @XmlElement(name = "nomeArquivo", required = true)
    @ApiModelProperty(example = "texto.txt", required = true, value = "Nome do arquivo<br/>Tamanho máximo: 255")
    /**
     * Nome do arquivo<br/>Tamanho máximo: 255
     **/
    private String nomeArquivo = null;

    @XmlElement(name = "arquivo", required = true)
    @ApiModelProperty(example = "dGVzdGUgZGUgYXJxdWl2byB0ZXh0by4K", required = true, value = "String em BASE64 representando o conteúdo do arquivo.<br/>Tamanho máximo do arquivo original: equivalente a 15MB, aproximadamente 20MB em BASE64")
    /**
     * String em BASE64 representando o conteúdo do arquivo.<br/>Tamanho máximo do arquivo original: equivalente a 15MB, aproximadamente 20MB em BASE64
     **/
    private String arquivo = null;

    @XmlElement(name = "palavrasChave", required = true)
    @ApiModelProperty(required = true, value = "")
    @Valid
    private List<ConteudoPalavraChaveDocumentoCommandApi> palavrasChave = new ArrayList<>();

    @XmlElement(name = "orgaosAnuentes")
    @ApiModelProperty(example = "[\"RECEITA\",\"SECEX\"]", value = "Lista com as siglas dos órgãos para os quais o documento deverá estar disponível.<br/><br/>As siglas devem ser obtidas pelos serviços /ext/tipos-documentos-dossie ou /ext/tipos-documentos-operacao<br/>(campo sigla da lista de orgaosAnuentes)<br/>")
    /**
     * Lista com as siglas dos órgãos para os quais o documento deverá estar disponível.<br/><br/>As siglas devem ser obtidas pelos serviços /ext/tipos-documentos-dossie ou /ext/tipos-documentos-operacao<br/>(campo sigla da lista de orgaosAnuentes)<br/>
     **/
    private List<String> orgaosAnuentes = null;

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

    /**
     * Indica que este documento esta disponível para usuários do setor privado. (Se aplica apenas nos perfis RFB, Anuentes e SEFAZ)
     *
     * @return acessivelSetorPrivado
     **/
    @JsonProperty("acessivelSetorPrivado")
    public Boolean isisAcessivelSetorPrivado() {
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
     * Número do dossiê.&lt;br/&gt;Tamanho: 15&lt;br/&gt;Formato: NNNNNNNNNNNNNNN
     *
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
     * Id do tipo de documento.&lt;br/&gt;Valor mínimo: 1&lt;br/&gt;Valor máximo: 2147483647
     *
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
     *
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
     * String em BASE64 representando o conteúdo do arquivo.&lt;br/&gt;Tamanho máximo do arquivo original: equivalente a 15MB, aproximadamente 20MB em BASE64
     *
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
     * Get palavrasChave
     *
     * @return palavrasChave
     **/
    @JsonProperty("palavrasChave")
    @NotNull
    public List<ConteudoPalavraChaveDocumentoCommandApi> getPalavrasChave() {
        return palavrasChave;
    }

    public void setPalavrasChave(List<ConteudoPalavraChaveDocumentoCommandApi> palavrasChave) {
        this.palavrasChave = palavrasChave;
    }

    public ParametroAnexarDocumentoPorDossie palavrasChave(List<ConteudoPalavraChaveDocumentoCommandApi> palavrasChave) {
        this.palavrasChave = palavrasChave;
        return this;
    }

    public ParametroAnexarDocumentoPorDossie addPalavrasChaveItem(ConteudoPalavraChaveDocumentoCommandApi palavrasChaveItem) {
        this.palavrasChave.add(palavrasChaveItem);
        return this;
    }

    /**
     * Lista com as siglas dos órgãos para os quais o documento deverá estar disponível.&lt;br/&gt;&lt;br/&gt;As siglas devem ser obtidas pelos serviços /ext/tipos-documentos-dossie ou /ext/tipos-documentos-operacao&lt;br/&gt;(campo sigla da lista de orgaosAnuentes)&lt;br/&gt;
     *
     * @return orgaosAnuentes
     **/
    @JsonProperty("orgaosAnuentes")
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

    @Override
    public String toString() {

        String sb = "class ParametroAnexarDocumentoPorDossie {\n" +
                "    acessivelSetorPrivado: " + toIndentedString(acessivelSetorPrivado) + "\n" +
                "    numeroDossie: " + toIndentedString(numeroDossie) + "\n" +
                "    idTipoDocumento: " + toIndentedString(idTipoDocumento) + "\n" +
                "    nomeArquivo: " + toIndentedString(nomeArquivo) + "\n" +
                "    arquivo: " + toIndentedString(arquivo) + "\n" +
                "    palavrasChave: " + toIndentedString(palavrasChave) + "\n" +
                "    orgaosAnuentes: " + toIndentedString(orgaosAnuentes) + "\n" +
                "}";
        return sb;
    }
}
