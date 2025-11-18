package br.gov.siscomex.portalunico.anex.model;

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
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParametroAnexarDocumentoPorOperacao", propOrder =
        {"acessivelSetorPrivado", "arquivo", "idTipoDocumento", "nomeArquivo", "numeroOperacao", "orgaosAnuentes", "palavrasChave", "tipoAcesso", "tipoOperacao"
        })

@XmlRootElement(name = "ParametroAnexarDocumentoPorOperacao")
/**
 * Arquivo e dados do documento
 **/
@ApiModel(description = "Arquivo e dados do documento")
public class ParametroAnexarDocumentoPorOperacao {

    @XmlElement(name = "acessivelSetorPrivado")
    @ApiModelProperty(example = "false", value = "Indica que este documento esta disponível para usuários do setor privado. (Se aplica apenas nos perfis RFB, Anuentes e SEFAZ)")
    /**
     * Indica que este documento esta disponível para usuários do setor privado. (Se aplica apenas nos perfis RFB, Anuentes e SEFAZ)
     **/
    private Boolean acessivelSetorPrivado = null;

    @XmlElement(name = "arquivo", required = true)
    @ApiModelProperty(example = "dGVzdGUgZGUgYXJxdWl2byB0ZXh0by4K", required = true, value = "String em BASE64 representando o conteúdo do arquivo.<br/>Tamanho máximo do arquivo original: equivalente a 15MB, aproximadamente 20MB em BASE64")
    /**
     * String em BASE64 representando o conteúdo do arquivo.<br/>Tamanho máximo do arquivo original: equivalente a 15MB, aproximadamente 20MB em BASE64
     **/
    private String arquivo = null;

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

    @XmlElement(name = "numeroOperacao", required = true)
    @ApiModelProperty(example = "19BR0000000174", required = true, value = "Número da operação.<br/>Tamanho máximo: 255<br/>Formato: de acordo com o definido em cada sistema de origem do tipo de operação.<br/><br/>Para DI - Declaração de Importação<br/>Formato: NNNNNNNNNN - 10 dígitos numéricos<br/>Exemplo: 2000004120<br/><br/>Para LI - Licença de Importação<br/>Formato: NNNNNNNNNNN - 11 dígitos numéricos<br/>Exemplo: 19000000235<br/><br/>Para RE - Registro de Exportação<br/>Formato: NNNNNNNNNNNN - 12 dígitos numéricos<br/>Exemplo: 190000005786<br/><br/>Para DT - Declaração de Trânsito<br/>Formato: NNNNNNNNNN - 10 dígitos numéricos<br/>Exemplo: 2100003784<br/><br/>Para DIR - Declaração de Importação de Remessa<br/>Formato: NNNNNNNNNNNN - 12 dígitos numéricos<br/>Exemplo: 210000103657<br/><br/>Para LPCO - Tratamento Administrativo/LPCO<br/>Formato: XNNNNNNNNNN - X = \"E\" para exportação ou \"I\" para importação concatenado com 10 dígitos numéricos<br/>Exemplo: E1900002152 ou I1900000454<br/><br/>Para CATP - Catálogo de Produtos<br/>Formato: <CNPJ Raíz ou CPF>-<código do produto><br/>onde:<br/><CNPJ Raíz> = NNNNNNNN - 8 primeiros dígitos do CNPJ<br/>&lt;CPF&gt; = NNNNNNNNNNN - 11 dígitos do CPF. É utilizado quando o usuário se auto representa como importador/exportador.<br/><código do produto> = NNNNNNNNNN - 10 dígitos do código do produto gerado no CATP - Catálogo de Produtos<br/>Exemplo: para CNPJ 00000000-0000001049, para CPF 01646244907-0000000001<br/><br/>Para DUE - Declaração Única de Exportação<br/>Formato: NNBRNNNNNNNNNN - 2 dígitos numéricos concatenados com \"BR\" e 10 dígitos numéricos<br/>Exemplo: 19BR0000000530<br/><br/>Para DUIMP - Declaração Única de Importação,<br/>Formato: NNBRNNNNNNNNNNN - 2 dígitos numéricos concatenados com \"BR\" e 11 dígitos numéricos<br/>Exemplo: 21BR00000002386<br/>")
    /**
     * Número da operação.<br/>Tamanho máximo: 255<br/>Formato: de acordo com o definido em cada sistema de origem do tipo de operação.<br/><br/>Para DI - Declaração de Importação<br/>Formato: NNNNNNNNNN - 10 dígitos numéricos<br/>Exemplo: 2000004120<br/><br/>Para LI - Licença de Importação<br/>Formato: NNNNNNNNNNN - 11 dígitos numéricos<br/>Exemplo: 19000000235<br/><br/>Para RE - Registro de Exportação<br/>Formato: NNNNNNNNNNNN - 12 dígitos numéricos<br/>Exemplo: 190000005786<br/><br/>Para DT - Declaração de Trânsito<br/>Formato: NNNNNNNNNN - 10 dígitos numéricos<br/>Exemplo: 2100003784<br/><br/>Para DIR - Declaração de Importação de Remessa<br/>Formato: NNNNNNNNNNNN - 12 dígitos numéricos<br/>Exemplo: 210000103657<br/><br/>Para LPCO - Tratamento Administrativo/LPCO<br/>Formato: XNNNNNNNNNN - X = \"E\" para exportação ou \"I\" para importação concatenado com 10 dígitos numéricos<br/>Exemplo: E1900002152 ou I1900000454<br/><br/>Para CATP - Catálogo de Produtos<br/>Formato: <CNPJ Raíz ou CPF>-<código do produto><br/>onde:<br/><CNPJ Raíz> = NNNNNNNN - 8 primeiros dígitos do CNPJ<br/>&lt;CPF&gt; = NNNNNNNNNNN - 11 dígitos do CPF. É utilizado quando o usuário se auto representa como importador/exportador.<br/><código do produto> = NNNNNNNNNN - 10 dígitos do código do produto gerado no CATP - Catálogo de Produtos<br/>Exemplo: para CNPJ 00000000-0000001049, para CPF 01646244907-0000000001<br/><br/>Para DUE - Declaração Única de Exportação<br/>Formato: NNBRNNNNNNNNNN - 2 dígitos numéricos concatenados com \"BR\" e 10 dígitos numéricos<br/>Exemplo: 19BR0000000530<br/><br/>Para DUIMP - Declaração Única de Importação,<br/>Formato: NNBRNNNNNNNNNNN - 2 dígitos numéricos concatenados com \"BR\" e 11 dígitos numéricos<br/>Exemplo: 21BR00000002386<br/>
     **/
    private String numeroOperacao = null;

    @XmlElement(name = "orgaosAnuentes")
    @ApiModelProperty(example = "[\"RECEITA\",\"SECEX\"]", value = "Lista com as siglas dos órgãos para os quais o documento deverá estar disponível.<br/><br/>* somente deve ser informada para o tipo de acesso '0 - Definido pelo usuário'.<br/><br/>As siglas devem ser obtidas pelos serviços /ext/tipos-documentos-dossie ou /ext/tipos-documentos-operacao<br/>(campo sigla da lista de orgaosAnuentes)<br/>")
    /**
     * Lista com as siglas dos órgãos para os quais o documento deverá estar disponível.<br/><br/>* somente deve ser informada para o tipo de acesso '0 - Definido pelo usuário'.<br/><br/>As siglas devem ser obtidas pelos serviços /ext/tipos-documentos-dossie ou /ext/tipos-documentos-operacao<br/>(campo sigla da lista de orgaosAnuentes)<br/>
     **/
    private List<String> orgaosAnuentes = null;

    @XmlElement(name = "palavrasChave", required = true)
    @ApiModelProperty(required = true, value = "")
    @Valid
    private List<ConteudoPalavraChaveDocumentoCommandApi> palavrasChave = new ArrayList<>();
    @XmlElement(name = "tipoOperacao", required = true)
    @ApiModelProperty(example = "DI", required = true, value = "DI - Declaração de Importação<br/>LI - Licença de Importação<br/>RE - Registro de Exportação<br/>DT - Declaração de Trânsito<br/>DIR - Declaração de Importação de Remessa<br/>CATP - Catálogo de Produtos<br/>DUE - Declaração Única de Exportação<br/>DUIMP - Declaração Única de Importação,<br/>LPCO - Tratamento Administrativo/LPCO<br/></br>")
    /**
     * DI - Declaração de Importação<br/>LI - Licença de Importação<br/>RE - Registro de Exportação<br/>DT - Declaração de Trânsito<br/>DIR - Declaração de Importação de Remessa<br/>CATP - Catálogo de Produtos<br/>DUE - Declaração Única de Exportação<br/>DUIMP - Declaração Única de Importação,<br/>LPCO - Tratamento Administrativo/LPCO<br/></br>
     **/
    private TipoOperacaoEnum tipoOperacao = null;

    @XmlElement(name = "tipoAcesso")
    @ApiModelProperty(example = "1", value = "Tipo de acesso ao documento.<br/><br/>Por padrão os documentos serão acessados por todos os órgãos da operação. Apenas em caso de exceção pode-se restringir a disponibilização para RFB e SEFAZ.<br/><br/>Para os tipos de operações DI, LI, RE, DT e DIR, idependentemente do perfil do usuário, deve ser obrigatoriamente:<br/>0 - Definido pelo usuário<br/><br/>Para os tipos de operações DUE, DUIMP, CATP, LPCO e AC deve ser atribuido conforme o perfil do usuário.<br/><br/>Perfis do setor privado:<br/>1 - Acessível para todos os órgãos da operação<br/>2 - Restringir a disponibilização para RFB e SEFAZ<br/><br/>Perfil Anuentes e SEFAZ:<br/>1 - Acessível para todos os órgãos da operação<br/><br/>Perfil RFB:<br/>1 - Acessível para todos os órgãos da operação<br/>3 - Acessível apenas para RFB<br/>")
    /**
     * Tipo de acesso ao documento.<br/><br/>Por padrão os documentos serão acessados por todos os órgãos da operação. Apenas em caso de exceção pode-se restringir a disponibilização para RFB e SEFAZ.<br/><br/>Para os tipos de operações DI, LI, RE, DT e DIR, idependentemente do perfil do usuário, deve ser obrigatoriamente:<br/>0 - Definido pelo usuário<br/><br/>Para os tipos de operações DUE, DUIMP, CATP, LPCO e AC deve ser atribuido conforme o perfil do usuário.<br/><br/>Perfis do setor privado:<br/>1 - Acessível para todos os órgãos da operação<br/>2 - Restringir a disponibilização para RFB e SEFAZ<br/><br/>Perfil Anuentes e SEFAZ:<br/>1 - Acessível para todos os órgãos da operação<br/><br/>Perfil RFB:<br/>1 - Acessível para todos os órgãos da operação<br/>3 - Acessível apenas para RFB<br/>
     **/
    private TipoAcessoEnum tipoAcesso = null;

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
     * String em BASE64 representando o conteúdo do arquivo.&lt;br/&gt;Tamanho máximo do arquivo original: equivalente a 15MB, aproximadamente 20MB em BASE64
     *
     * @return arquivo
     **/
    @JsonProperty("arquivo")
    @NotNull
    public String getArquivo() {
        return arquivo;
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

    public ParametroAnexarDocumentoPorOperacao acessivelSetorPrivado(Boolean acessivelSetorPrivado) {
        this.acessivelSetorPrivado = acessivelSetorPrivado;
        return this;
    }

    public void setArquivo(String arquivo) {
        this.arquivo = arquivo;
    }

    public ParametroAnexarDocumentoPorOperacao arquivo(String arquivo) {
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

    public ParametroAnexarDocumentoPorOperacao idTipoDocumento(Integer idTipoDocumento) {
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

    public ParametroAnexarDocumentoPorOperacao nomeArquivo(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
        return this;
    }

    /**
     * Número da operação.&lt;br/&gt;Tamanho máximo: 255&lt;br/&gt;Formato: de acordo com o definido em cada sistema de origem do tipo de operação.&lt;br/&gt;&lt;br/&gt;Para DI - Declaração de Importação&lt;br/&gt;Formato: NNNNNNNNNN - 10 dígitos numéricos&lt;br/&gt;Exemplo: 2000004120&lt;br/&gt;&lt;br/&gt;Para LI - Licença de Importação&lt;br/&gt;Formato: NNNNNNNNNNN - 11 dígitos numéricos&lt;br/&gt;Exemplo: 19000000235&lt;br/&gt;&lt;br/&gt;Para RE - Registro de Exportação&lt;br/&gt;Formato: NNNNNNNNNNNN - 12 dígitos numéricos&lt;br/&gt;Exemplo: 190000005786&lt;br/&gt;&lt;br/&gt;Para DT - Declaração de Trânsito&lt;br/&gt;Formato: NNNNNNNNNN - 10 dígitos numéricos&lt;br/&gt;Exemplo: 2100003784&lt;br/&gt;&lt;br/&gt;Para DIR - Declaração de Importação de Remessa&lt;br/&gt;Formato: NNNNNNNNNNNN - 12 dígitos numéricos&lt;br/&gt;Exemplo: 210000103657&lt;br/&gt;&lt;br/&gt;Para LPCO - Tratamento Administrativo/LPCO&lt;br/&gt;Formato: XNNNNNNNNNN - X &#x3D; \&quot;E\&quot; para exportação ou \&quot;I\&quot; para importação concatenado com 10 dígitos numéricos&lt;br/&gt;Exemplo: E1900002152 ou I1900000454&lt;br/&gt;&lt;br/&gt;Para CATP - Catálogo de Produtos&lt;br/&gt;Formato: &lt;CNPJ Raíz ou CPF&gt;-&lt;código do produto&gt;&lt;br/&gt;onde:&lt;br/&gt;&lt;CNPJ Raíz&gt; &#x3D; NNNNNNNN - 8 primeiros dígitos do CNPJ&lt;br/&gt;&amp;lt;CPF&amp;gt; &#x3D; NNNNNNNNNNN - 11 dígitos do CPF. É utilizado quando o usuário se auto representa como importador/exportador.&lt;br/&gt;&lt;código do produto&gt; &#x3D; NNNNNNNNNN - 10 dígitos do código do produto gerado no CATP - Catálogo de Produtos&lt;br/&gt;Exemplo: para CNPJ 00000000-0000001049, para CPF 01646244907-0000000001&lt;br/&gt;&lt;br/&gt;Para DUE - Declaração Única de Exportação&lt;br/&gt;Formato: NNBRNNNNNNNNNN - 2 dígitos numéricos concatenados com \&quot;BR\&quot; e 10 dígitos numéricos&lt;br/&gt;Exemplo: 19BR0000000530&lt;br/&gt;&lt;br/&gt;Para DUIMP - Declaração Única de Importação,&lt;br/&gt;Formato: NNBRNNNNNNNNNNN - 2 dígitos numéricos concatenados com \&quot;BR\&quot; e 11 dígitos numéricos&lt;br/&gt;Exemplo: 21BR00000002386&lt;br/&gt;
     *
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
     * Lista com as siglas dos órgãos para os quais o documento deverá estar disponível.&lt;br/&gt;&lt;br/&gt;* somente deve ser informada para o tipo de acesso &#39;0 - Definido pelo usuário&#39;.&lt;br/&gt;&lt;br/&gt;As siglas devem ser obtidas pelos serviços /ext/tipos-documentos-dossie ou /ext/tipos-documentos-operacao&lt;br/&gt;(campo sigla da lista de orgaosAnuentes)&lt;br/&gt;
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

    public ParametroAnexarDocumentoPorOperacao orgaosAnuentes(List<String> orgaosAnuentes) {
        this.orgaosAnuentes = orgaosAnuentes;
        return this;
    }

    public ParametroAnexarDocumentoPorOperacao addOrgaosAnuentesItem(String orgaosAnuentesItem) {
        this.orgaosAnuentes.add(orgaosAnuentesItem);
        return this;
    }

    public void setPalavrasChave(List<ConteudoPalavraChaveDocumentoCommandApi> palavrasChave) {
        this.palavrasChave = palavrasChave;
    }

    public ParametroAnexarDocumentoPorOperacao palavrasChave(List<ConteudoPalavraChaveDocumentoCommandApi> palavrasChave) {
        this.palavrasChave = palavrasChave;
        return this;
    }

    public ParametroAnexarDocumentoPorOperacao addPalavrasChaveItem(ConteudoPalavraChaveDocumentoCommandApi palavrasChaveItem) {
        this.palavrasChave.add(palavrasChaveItem);
        return this;
    }

    /**
     * DI - Declaração de Importação&lt;br/&gt;LI - Licença de Importação&lt;br/&gt;RE - Registro de Exportação&lt;br/&gt;DT - Declaração de Trânsito&lt;br/&gt;DIR - Declaração de Importação de Remessa&lt;br/&gt;CATP - Catálogo de Produtos&lt;br/&gt;DUE - Declaração Única de Exportação&lt;br/&gt;DUIMP - Declaração Única de Importação,&lt;br/&gt;LPCO - Tratamento Administrativo/LPCO&lt;br/&gt;&lt;/br&gt;
     *
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

    /**
     * Tipo de acesso ao documento.&lt;br/&gt;&lt;br/&gt;Por padrão os documentos serão acessados por todos os órgãos da operação. Apenas em caso de exceção pode-se restringir a disponibilização para RFB e SEFAZ.&lt;br/&gt;&lt;br/&gt;Para os tipos de operações DI, LI, RE, DT e DIR, idependentemente do perfil do usuário, deve ser obrigatoriamente:&lt;br/&gt;0 - Definido pelo usuário&lt;br/&gt;&lt;br/&gt;Para os tipos de operações DUE, DUIMP, CATP, LPCO e AC deve ser atribuido conforme o perfil do usuário.&lt;br/&gt;&lt;br/&gt;Perfis do setor privado:&lt;br/&gt;1 - Acessível para todos os órgãos da operação&lt;br/&gt;2 - Restringir a disponibilização para RFB e SEFAZ&lt;br/&gt;&lt;br/&gt;Perfil Anuentes e SEFAZ:&lt;br/&gt;1 - Acessível para todos os órgãos da operação&lt;br/&gt;&lt;br/&gt;Perfil RFB:&lt;br/&gt;1 - Acessível para todos os órgãos da operação&lt;br/&gt;3 - Acessível apenas para RFB&lt;br/&gt;
     *
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

    public void setTipoOperacao(TipoOperacaoEnum tipoOperacao) {
        this.tipoOperacao = tipoOperacao;
    }

    public ParametroAnexarDocumentoPorOperacao tipoOperacao(TipoOperacaoEnum tipoOperacao) {
        this.tipoOperacao = tipoOperacao;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class ParametroAnexarDocumentoPorOperacao {\n" +
                "    acessivelSetorPrivado: " + toIndentedString(acessivelSetorPrivado) + "\n" +
                "    arquivo: " + toIndentedString(arquivo) + "\n" +
                "    idTipoDocumento: " + toIndentedString(idTipoDocumento) + "\n" +
                "    nomeArquivo: " + toIndentedString(nomeArquivo) + "\n" +
                "    numeroOperacao: " + toIndentedString(numeroOperacao) + "\n" +
                "    orgaosAnuentes: " + toIndentedString(orgaosAnuentes) + "\n" +
                "    palavrasChave: " + toIndentedString(palavrasChave) + "\n" +
                "    tipoAcesso: " + toIndentedString(tipoAcesso) + "\n" +
                "    tipoOperacao: " + toIndentedString(tipoOperacao) + "\n" +
                "}";
        return sb;
    }


    @XmlType(name = "TipoAcessoEnum")
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


        private final Integer value;

        TipoAcessoEnum(Integer v) {
            value = v;
        }

        public static TipoAcessoEnum fromValue(String v) {
            for (TipoAcessoEnum b : TipoAcessoEnum.values()) {
                if (String.valueOf(b.value).equals(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "' to TipoAcessoEnum");
        }

        public Integer value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
    }

    @XmlType(name = "TipoOperacaoEnum")
    @XmlEnum(String.class)
    public enum TipoOperacaoEnum {

        @XmlEnumValue("DI")
        @JsonProperty("DI")
        DI("DI"),

        @XmlEnumValue("LI")
        @JsonProperty("LI")
        LI("LI"),

        @XmlEnumValue("RE")
        @JsonProperty("RE")
        RE("RE"),

        @XmlEnumValue("DT")
        @JsonProperty("DT")
        DT("DT"),

        @XmlEnumValue("DIR")
        @JsonProperty("DIR")
        DIR("DIR"),

        @XmlEnumValue("CATP")
        @JsonProperty("CATP")
        CATP("CATP"),

        @XmlEnumValue("DUE")
        @JsonProperty("DUE")
        DUE("DUE"),

        @XmlEnumValue("DUIMP")
        @JsonProperty("DUIMP")
        DUIMP("DUIMP"),

        @XmlEnumValue("LPCO")
        @JsonProperty("LPCO")
        LPCO("LPCO");


        private final String value;

        TipoOperacaoEnum(String v) {
            value = v;
        }

        public static TipoOperacaoEnum fromValue(String v) {
            for (TipoOperacaoEnum b : TipoOperacaoEnum.values()) {
                if (String.valueOf(b.value).equals(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "' to TipoOperacaoEnum");
        }

        public String value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
    }
}
