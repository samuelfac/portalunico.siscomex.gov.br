package br.gov.siscomex.portalunico.cada.model;

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
@XmlType(name = "ArquivoDiarioAtributoDTO", propOrder =
        {"codigo", "nome", "definicao", "nomeApresentacao", "tipoAtributo", "brid", "wcoid", "orientacaoPreenchimento", "formaPreenchimento", "tamanhoMaximo", "mascara", "casasDecimais", "modalidade", "obrigatorio", "dataInicioVigencia", "dataFimVigencia", "informacaoAdicional", "dominio", "atributoFiltro", "objetivos", "orgaos", "atributoCondicionante", "condicionados", "listaSubatributos", "multivalorado"
        })

@XmlRootElement(name = "ArquivoDiarioAtributoDTO")
/**
 * Informações do arquivo diário com a lista de Atributos e NCM
 **/
@ApiModel(description = "Informações do arquivo diário com a lista de Atributos e NCM")
public class ArquivoDiarioAtributoDTO {

    @XmlElement(name = "codigo", required = true)
    @ApiModelProperty(example = "ATT_1", required = true, value = "Código do atributo<br>Tamanho mínimo: 1<br>Tamanho máximo: 25")
    /**
     * Código do atributo<br>Tamanho mínimo: 1<br>Tamanho máximo: 25
     **/
    private String codigo = null;

    @XmlElement(name = "nome")
    @ApiModelProperty(example = "Peso é ...", value = "Nome do atributo<br>Tamanho mínimo: 0<br>Tamanho máximo: 200")
    /**
     * Nome do atributo<br>Tamanho mínimo: 0<br>Tamanho máximo: 200
     **/
    private String nome = null;

    @XmlElement(name = "definicao")
    @ApiModelProperty(example = "Peso é definido...", value = "Definição<br>Tamanho mínimo: 0<br>Tamanho máximo: 200")
    /**
     * Definição<br>Tamanho mínimo: 0<br>Tamanho máximo: 200
     **/
    private String definicao = null;

    @XmlElement(name = "nomeApresentacao", required = true)
    @ApiModelProperty(example = "Peso", required = true, value = "Nome de apresentação<br>Tamanho mínimo: 1<br>Tamanho máximo: 40")
    /**
     * Nome de apresentação<br>Tamanho mínimo: 1<br>Tamanho máximo: 40
     **/
    private String nomeApresentacao = null;

    @XmlElement(name = "tipoAtributo")
    @ApiModelProperty(example = "Simples", value = "Tipo de atributoSimples<br>")
    /**
     * Tipo de atributoSimples<br>
     **/
    private String tipoAtributo = null;

    @XmlElement(name = "brid")
    @ApiModelProperty(example = "123", value = "BR ID<br>Tamanho mínimo: 0<br>Tamanho máximo: 10")
    /**
     * BR ID<br>Tamanho mínimo: 0<br>Tamanho máximo: 10
     **/
    private String brid = null;

    @XmlElement(name = "wcoid")
    @ApiModelProperty(example = "123", value = "Código WCO ID<br>Tamanho mínimo: 0<br>Tamanho máximo: 10")
    /**
     * Código WCO ID<br>Tamanho mínimo: 0<br>Tamanho máximo: 10
     **/
    private String wcoid = null;

    @XmlElement(name = "orientacaoPreenchimento")
    @ApiModelProperty(example = "Orientação de preenchimento", value = "Orientação de preenchimento<br>Tamanho mínimo: 0<br>Tamanho máximo: 200")
    /**
     * Orientação de preenchimento<br>Tamanho mínimo: 0<br>Tamanho máximo: 200
     **/
    private String orientacaoPreenchimento = null;
    @XmlElement(name = "tamanhoMaximo")
    @ApiModelProperty(example = "100", value = "Tamanho máximo<br>Tamanho mínimo: 0<br>Tamanho máximo: 10")
    /**
     * Tamanho máximo<br>Tamanho mínimo: 0<br>Tamanho máximo: 10
     **/
    private Integer tamanhoMaximo = null;

    @XmlElement(name = "formaPreenchimento", required = true)
    @ApiModelProperty(example = "BOOLEANO", required = true, value = "Forma de preenchimento.<br>Tamanho máximo: 20<br>Domínio:<br>LISTA_ESTATICA<br>BOOLEANO<br>DATA<br>DATA_HORA<br>NUMERO_INTEIRO<br>NUMERO_REAL<br>TEXTO<br>DOMINIO_DINAMICO<br>COMPOSTO")
    /**
     * Forma de preenchimento.<br>Tamanho máximo: 20<br>Domínio:<br>LISTA_ESTATICA<br>BOOLEANO<br>DATA<br>DATA_HORA<br>NUMERO_INTEIRO<br>NUMERO_REAL<br>TEXTO<br>DOMINIO_DINAMICO<br>COMPOSTO
     **/
    private FormaPreenchimentoEnum formaPreenchimento = null;
    @XmlElement(name = "mascara")
    @ApiModelProperty(example = "99999", value = "Máscara<br>Tamanho mínimo: 0<br>Tamanho máximo: 50")
    /**
     * Máscara<br>Tamanho mínimo: 0<br>Tamanho máximo: 50
     **/
    private String mascara = null;
    @XmlElement(name = "modalidade", required = true)
    @ApiModelProperty(example = "Exportação", required = true, value = "Modalidade de operação.<br>Tamanho máximo: 20<br>Domínio:<br>Exportação<br>Importação")
    /**
     * Modalidade de operação.<br>Tamanho máximo: 20<br>Domínio:<br>Exportação<br>Importação
     **/
    private String modalidade = null;

    @XmlElement(name = "casasDecimais")
    @ApiModelProperty(example = "5", value = "Casas Decimais<br>Tamanho mínimo: 0<br>Tamanho máximo: 10")
    /**
     * Casas Decimais<br>Tamanho mínimo: 0<br>Tamanho máximo: 10
     **/
    private Integer casasDecimais = null;
    @XmlElement(name = "obrigatorio", required = true)
    @ApiModelProperty(example = "true", required = true, value = "Preenchimento obrigatório.<br>Domínio:<br>true<br>false")
    /**
     * Preenchimento obrigatório.<br>Domínio:<br>true<br>false
     **/
    private Boolean obrigatorio = false;
    @XmlElement(name = "dataInicioVigencia", required = true)
    @ApiModelProperty(example = "2019-01-01", required = true, value = "Data de início de vigência<br>Formato: yyyy-MM-dd")
    /**
     * Data de início de vigência<br>Formato: yyyy-MM-dd
     **/
    private String dataInicioVigencia = null;
    @XmlElement(name = "dataFimVigencia")
    @ApiModelProperty(example = "2019-08-29", value = "Data de fim de vigência<br>Formato: yyyy-MM-dd")
    /**
     * Data de fim de vigência<br>Formato: yyyy-MM-dd
     **/
    private String dataFimVigencia = null;
    @XmlElement(name = "informacaoAdicional")
    @ApiModelProperty(example = "Texto livre", value = "Informação adicional de preenchimento para o vínculo<br>Tamanho mínimo: 0<br>Tamanho máximo: 1000")
    /**
     * Informação adicional de preenchimento para o vínculo<br>Tamanho mínimo: 0<br>Tamanho máximo: 1000
     **/
    private String informacaoAdicional = null;
    @XmlElement(name = "dominio")
    @ApiModelProperty(value = "Lista de domínio do atributo")
    @Valid
    /**
     * Lista de domínio do atributo
     **/
    private List<ItemAtributoListaConsultaDTO> dominio = null;
    @XmlElement(name = "atributoFiltro")
    @ApiModelProperty(value = "")
    @Valid
    private ArquivoDiarioAtributoDTO atributoFiltro = null;
    @XmlElement(name = "orgaos")
    @ApiModelProperty(value = "Lista de códigos dos órgãos vinculados ao Atributo e NCM<br>Tamanho mínimo: 1<br>Tamanho máximo: 10")
    /**
     * Lista de códigos dos órgãos vinculados ao Atributo e NCM<br>Tamanho mínimo: 1<br>Tamanho máximo: 10
     **/
    private List<String> orgaos = null;

    @XmlElement(name = "objetivos")
    @ApiModelProperty(value = "Lista de objetivos do atributo")
    @Valid
    /**
     * Lista de objetivos do atributo
     **/
    private List<ObjetivoAtributoConsultaDTO> objetivos = null;
    @XmlElement(name = "atributoCondicionante", required = true)
    @ApiModelProperty(example = "false", required = true, value = "Atributos possui atributos condicionados.<br>Domínio:<br>true<br>false")
    /**
     * Atributos possui atributos condicionados.<br>Domínio:<br>true<br>false
     **/
    private Boolean atributoCondicionante = false;
    @XmlElement(name = "condicionados")
    @ApiModelProperty(value = "Lista de atributos condicionados")
    @Valid
    /**
     * Lista de atributos condicionados
     **/
    private List<ArquivoDiarioCondicionadoDTO> condicionados = null;
    @XmlElement(name = "multivalorado", required = true)
    @ApiModelProperty(example = "true", required = true, value = "Campo multivalorado.<br>Domínio:<br>true<br>false")
    /**
     * Campo multivalorado.<br>Domínio:<br>true<br>false
     **/
    private Boolean multivalorado = false;

    @XmlElement(name = "listaSubatributos")
    @ApiModelProperty(value = "Lista de subatributos")
    @Valid
    /**
     * Lista de subatributos
     **/
    private List<ArquivoDiarioAtributoDTO> listaSubatributos = null;

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
     * Código do atributo&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 25
     *
     * @return codigo
     **/
    @JsonProperty("codigo")
    @NotNull
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public ArquivoDiarioAtributoDTO codigo(String codigo) {
        this.codigo = codigo;
        return this;
    }

    /**
     * Nome do atributo&lt;br&gt;Tamanho mínimo: 0&lt;br&gt;Tamanho máximo: 200
     *
     * @return nome
     **/
    @JsonProperty("nome")
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArquivoDiarioAtributoDTO nome(String nome) {
        this.nome = nome;
        return this;
    }

    /**
     * Definição&lt;br&gt;Tamanho mínimo: 0&lt;br&gt;Tamanho máximo: 200
     *
     * @return definicao
     **/
    @JsonProperty("definicao")
    public String getDefinicao() {
        return definicao;
    }

    public void setDefinicao(String definicao) {
        this.definicao = definicao;
    }

    public ArquivoDiarioAtributoDTO definicao(String definicao) {
        this.definicao = definicao;
        return this;
    }

    /**
     * Nome de apresentação&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 40
     *
     * @return nomeApresentacao
     **/
    @JsonProperty("nomeApresentacao")
    @NotNull
    public String getNomeApresentacao() {
        return nomeApresentacao;
    }

    public void setNomeApresentacao(String nomeApresentacao) {
        this.nomeApresentacao = nomeApresentacao;
    }

    public ArquivoDiarioAtributoDTO nomeApresentacao(String nomeApresentacao) {
        this.nomeApresentacao = nomeApresentacao;
        return this;
    }

    /**
     * Tipo de atributoSimples&lt;br&gt;
     *
     * @return tipoAtributo
     **/
    @JsonProperty("tipoAtributo")
    public String getTipoAtributo() {
        return tipoAtributo;
    }

    public void setTipoAtributo(String tipoAtributo) {
        this.tipoAtributo = tipoAtributo;
    }

    public ArquivoDiarioAtributoDTO tipoAtributo(String tipoAtributo) {
        this.tipoAtributo = tipoAtributo;
        return this;
    }

    /**
     * BR ID&lt;br&gt;Tamanho mínimo: 0&lt;br&gt;Tamanho máximo: 10
     *
     * @return brid
     **/
    @JsonProperty("brid")
    public String getBrid() {
        return brid;
    }

    public void setBrid(String brid) {
        this.brid = brid;
    }

    public ArquivoDiarioAtributoDTO brid(String brid) {
        this.brid = brid;
        return this;
    }

    /**
     * Código WCO ID&lt;br&gt;Tamanho mínimo: 0&lt;br&gt;Tamanho máximo: 10
     * @return wcoid
     **/
    @JsonProperty("wcoid")
    public String getWcoid() {
        return wcoid;
    }

    public void setWcoid(String wcoid) {
        this.wcoid = wcoid;
    }

    public ArquivoDiarioAtributoDTO wcoid(String wcoid) {
        this.wcoid = wcoid;
        return this;
    }

    /**
     * Orientação de preenchimento&lt;br&gt;Tamanho mínimo: 0&lt;br&gt;Tamanho máximo: 200
     *
     * @return orientacaoPreenchimento
     **/
    @JsonProperty("orientacaoPreenchimento")
    public String getOrientacaoPreenchimento() {
        return orientacaoPreenchimento;
    }

    public void setOrientacaoPreenchimento(String orientacaoPreenchimento) {
        this.orientacaoPreenchimento = orientacaoPreenchimento;
    }

    public ArquivoDiarioAtributoDTO orientacaoPreenchimento(String orientacaoPreenchimento) {
        this.orientacaoPreenchimento = orientacaoPreenchimento;
        return this;
    }

    /**
     * Forma de preenchimento.&lt;br&gt;Tamanho máximo: 20&lt;br&gt;Domínio:&lt;br&gt;LISTA_ESTATICA&lt;br&gt;BOOLEANO&lt;br&gt;DATA&lt;br&gt;DATA_HORA&lt;br&gt;NUMERO_INTEIRO&lt;br&gt;NUMERO_REAL&lt;br&gt;TEXTO&lt;br&gt;DOMINIO_DINAMICO&lt;br&gt;COMPOSTO
     *
     * @return formaPreenchimento
     **/
    @JsonProperty("formaPreenchimento")
    @NotNull
    public String getFormaPreenchimento() {
        if (formaPreenchimento == null) {
            return null;
        }
        return formaPreenchimento.value();
    }

    public void setFormaPreenchimento(FormaPreenchimentoEnum formaPreenchimento) {
        this.formaPreenchimento = formaPreenchimento;
    }

    public ArquivoDiarioAtributoDTO formaPreenchimento(FormaPreenchimentoEnum formaPreenchimento) {
        this.formaPreenchimento = formaPreenchimento;
        return this;
    }

    /**
     * Tamanho máximo&lt;br&gt;Tamanho mínimo: 0&lt;br&gt;Tamanho máximo: 10
     * @return tamanhoMaximo
     **/
    @JsonProperty("tamanhoMaximo")
    public Integer getTamanhoMaximo() {
        return tamanhoMaximo;
    }

    public void setTamanhoMaximo(Integer tamanhoMaximo) {
        this.tamanhoMaximo = tamanhoMaximo;
    }

    public ArquivoDiarioAtributoDTO tamanhoMaximo(Integer tamanhoMaximo) {
        this.tamanhoMaximo = tamanhoMaximo;
        return this;
    }

    /**
     * Máscara&lt;br&gt;Tamanho mínimo: 0&lt;br&gt;Tamanho máximo: 50
     * @return mascara
     **/
    @JsonProperty("mascara")
    public String getMascara() {
        return mascara;
    }

    public void setMascara(String mascara) {
        this.mascara = mascara;
    }

    public ArquivoDiarioAtributoDTO mascara(String mascara) {
        this.mascara = mascara;
        return this;
    }

    /**
     * Casas Decimais&lt;br&gt;Tamanho mínimo: 0&lt;br&gt;Tamanho máximo: 10
     * @return casasDecimais
     **/
    @JsonProperty("casasDecimais")
    public Integer getCasasDecimais() {
        return casasDecimais;
    }

    public void setCasasDecimais(Integer casasDecimais) {
        this.casasDecimais = casasDecimais;
    }

    public ArquivoDiarioAtributoDTO casasDecimais(Integer casasDecimais) {
        this.casasDecimais = casasDecimais;
        return this;
    }

    /**
     * Modalidade de operação.&lt;br&gt;Tamanho máximo: 20&lt;br&gt;Domínio:&lt;br&gt;Exportação&lt;br&gt;Importação
     * @return modalidade
     **/
    @JsonProperty("modalidade")
    @NotNull
    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }

    public ArquivoDiarioAtributoDTO modalidade(String modalidade) {
        this.modalidade = modalidade;
        return this;
    }

    /**
     * Preenchimento obrigatório.&lt;br&gt;Domínio:&lt;br&gt;true&lt;br&gt;false
     * @return obrigatorio
     **/
    @JsonProperty("obrigatorio")
    @NotNull
    public Boolean isisObrigatorio() {
        return obrigatorio;
    }

    public void setObrigatorio(Boolean obrigatorio) {
        this.obrigatorio = obrigatorio;
    }

    public ArquivoDiarioAtributoDTO obrigatorio(Boolean obrigatorio) {
        this.obrigatorio = obrigatorio;
        return this;
    }

    /**
     * Data de início de vigência&lt;br&gt;Formato: yyyy-MM-dd
     *
     * @return dataInicioVigencia
     **/
    @JsonProperty("dataInicioVigencia")
    @NotNull
    public String getDataInicioVigencia() {
        return dataInicioVigencia;
    }

    public void setDataInicioVigencia(String dataInicioVigencia) {
        this.dataInicioVigencia = dataInicioVigencia;
    }

    public ArquivoDiarioAtributoDTO dataInicioVigencia(String dataInicioVigencia) {
        this.dataInicioVigencia = dataInicioVigencia;
        return this;
    }

    /**
     * Data de fim de vigência&lt;br&gt;Formato: yyyy-MM-dd
     * @return dataFimVigencia
     **/
    @JsonProperty("dataFimVigencia")
    public String getDataFimVigencia() {
        return dataFimVigencia;
    }

    public void setDataFimVigencia(String dataFimVigencia) {
        this.dataFimVigencia = dataFimVigencia;
    }

    public ArquivoDiarioAtributoDTO dataFimVigencia(String dataFimVigencia) {
        this.dataFimVigencia = dataFimVigencia;
        return this;
    }

    /**
     * Informação adicional de preenchimento para o vínculo&lt;br&gt;Tamanho mínimo: 0&lt;br&gt;Tamanho máximo: 1000
     *
     * @return informacaoAdicional
     **/
    @JsonProperty("informacaoAdicional")
    public String getInformacaoAdicional() {
        return informacaoAdicional;
    }

    public void setInformacaoAdicional(String informacaoAdicional) {
        this.informacaoAdicional = informacaoAdicional;
    }

    public ArquivoDiarioAtributoDTO informacaoAdicional(String informacaoAdicional) {
        this.informacaoAdicional = informacaoAdicional;
        return this;
    }

    /**
     * Lista de domínio do atributo
     *
     * @return dominio
     **/
    @JsonProperty("dominio")
    public List<ItemAtributoListaConsultaDTO> getDominio() {
        return dominio;
    }

    public void setDominio(List<ItemAtributoListaConsultaDTO> dominio) {
        this.dominio = dominio;
    }

    public ArquivoDiarioAtributoDTO dominio(List<ItemAtributoListaConsultaDTO> dominio) {
        this.dominio = dominio;
        return this;
    }

    public ArquivoDiarioAtributoDTO addDominioItem(ItemAtributoListaConsultaDTO dominioItem) {
        this.dominio.add(dominioItem);
        return this;
    }

    /**
     * Get atributoFiltro
     * @return atributoFiltro
     **/
    @JsonProperty("atributoFiltro")
    public ArquivoDiarioAtributoDTO getAtributoFiltro() {
        return atributoFiltro;
    }

    public void setAtributoFiltro(ArquivoDiarioAtributoDTO atributoFiltro) {
        this.atributoFiltro = atributoFiltro;
    }

    public ArquivoDiarioAtributoDTO atributoFiltro(ArquivoDiarioAtributoDTO atributoFiltro) {
        this.atributoFiltro = atributoFiltro;
        return this;
    }

    /**
     * Lista de objetivos do atributo
     * @return objetivos
     **/
    @JsonProperty("objetivos")
    public List<ObjetivoAtributoConsultaDTO> getObjetivos() {
        return objetivos;
    }

    public void setObjetivos(List<ObjetivoAtributoConsultaDTO> objetivos) {
        this.objetivos = objetivos;
    }

    public ArquivoDiarioAtributoDTO objetivos(List<ObjetivoAtributoConsultaDTO> objetivos) {
        this.objetivos = objetivos;
        return this;
    }

    public ArquivoDiarioAtributoDTO addObjetivosItem(ObjetivoAtributoConsultaDTO objetivosItem) {
        this.objetivos.add(objetivosItem);
        return this;
    }

    /**
     * Lista de códigos dos órgãos vinculados ao Atributo e NCM&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 10
     * @return orgaos
     **/
    @JsonProperty("orgaos")
    public List<String> getOrgaos() {
        return orgaos;
    }

    public void setOrgaos(List<String> orgaos) {
        this.orgaos = orgaos;
    }

    public ArquivoDiarioAtributoDTO orgaos(List<String> orgaos) {
        this.orgaos = orgaos;
        return this;
    }

    public ArquivoDiarioAtributoDTO addOrgaosItem(String orgaosItem) {
        this.orgaos.add(orgaosItem);
        return this;
    }

    /**
     * Atributos possui atributos condicionados.&lt;br&gt;Domínio:&lt;br&gt;true&lt;br&gt;false
     * @return atributoCondicionante
     **/
    @JsonProperty("atributoCondicionante")
    @NotNull
    public Boolean isisAtributoCondicionante() {
        return atributoCondicionante;
    }

    public void setAtributoCondicionante(Boolean atributoCondicionante) {
        this.atributoCondicionante = atributoCondicionante;
    }

    public ArquivoDiarioAtributoDTO atributoCondicionante(Boolean atributoCondicionante) {
        this.atributoCondicionante = atributoCondicionante;
        return this;
    }

    /**
     * Lista de atributos condicionados
     * @return condicionados
     **/
    @JsonProperty("condicionados")
    public List<ArquivoDiarioCondicionadoDTO> getCondicionados() {
        return condicionados;
    }

    public void setCondicionados(List<ArquivoDiarioCondicionadoDTO> condicionados) {
        this.condicionados = condicionados;
    }

    public ArquivoDiarioAtributoDTO condicionados(List<ArquivoDiarioCondicionadoDTO> condicionados) {
        this.condicionados = condicionados;
        return this;
    }

    public ArquivoDiarioAtributoDTO addCondicionadosItem(ArquivoDiarioCondicionadoDTO condicionadosItem) {
        this.condicionados.add(condicionadosItem);
        return this;
    }

    /**
     * Lista de subatributos
     * @return listaSubatributos
     **/
    @JsonProperty("listaSubatributos")
    public List<ArquivoDiarioAtributoDTO> getListaSubatributos() {
        return listaSubatributos;
    }

    public void setListaSubatributos(List<ArquivoDiarioAtributoDTO> listaSubatributos) {
        this.listaSubatributos = listaSubatributos;
    }

    public ArquivoDiarioAtributoDTO listaSubatributos(List<ArquivoDiarioAtributoDTO> listaSubatributos) {
        this.listaSubatributos = listaSubatributos;
        return this;
    }

    public ArquivoDiarioAtributoDTO addListaSubatributosItem(ArquivoDiarioAtributoDTO listaSubatributosItem) {
        this.listaSubatributos.add(listaSubatributosItem);
        return this;
    }

    /**
     * Campo multivalorado.&lt;br&gt;Domínio:&lt;br&gt;true&lt;br&gt;false
     * @return multivalorado
     **/
    @JsonProperty("multivalorado")
    @NotNull
    public Boolean isisMultivalorado() {
        return multivalorado;
    }

    public void setMultivalorado(Boolean multivalorado) {
        this.multivalorado = multivalorado;
    }

    public ArquivoDiarioAtributoDTO multivalorado(Boolean multivalorado) {
        this.multivalorado = multivalorado;
        return this;
    }


    @Override
    public String toString() {

        String sb = "class ArquivoDiarioAtributoDTO {\n" +
                "    codigo: " + toIndentedString(codigo) + "\n" +
                "    nome: " + toIndentedString(nome) + "\n" +
                "    definicao: " + toIndentedString(definicao) + "\n" +
                "    nomeApresentacao: " + toIndentedString(nomeApresentacao) + "\n" +
                "    tipoAtributo: " + toIndentedString(tipoAtributo) + "\n" +
                "    brid: " + toIndentedString(brid) + "\n" +
                "    wcoid: " + toIndentedString(wcoid) + "\n" +
                "    orientacaoPreenchimento: " + toIndentedString(orientacaoPreenchimento) + "\n" +
                "    formaPreenchimento: " + toIndentedString(formaPreenchimento) + "\n" +
                "    tamanhoMaximo: " + toIndentedString(tamanhoMaximo) + "\n" +
                "    mascara: " + toIndentedString(mascara) + "\n" +
                "    casasDecimais: " + toIndentedString(casasDecimais) + "\n" +
                "    modalidade: " + toIndentedString(modalidade) + "\n" +
                "    obrigatorio: " + toIndentedString(obrigatorio) + "\n" +
                "    dataInicioVigencia: " + toIndentedString(dataInicioVigencia) + "\n" +
                "    dataFimVigencia: " + toIndentedString(dataFimVigencia) + "\n" +
                "    informacaoAdicional: " + toIndentedString(informacaoAdicional) + "\n" +
                "    dominio: " + toIndentedString(dominio) + "\n" +
                "    atributoFiltro: " + toIndentedString(atributoFiltro) + "\n" +
                "    objetivos: " + toIndentedString(objetivos) + "\n" +
                "    orgaos: " + toIndentedString(orgaos) + "\n" +
                "    atributoCondicionante: " + toIndentedString(atributoCondicionante) + "\n" +
                "    condicionados: " + toIndentedString(condicionados) + "\n" +
                "    listaSubatributos: " + toIndentedString(listaSubatributos) + "\n" +
                "    multivalorado: " + toIndentedString(multivalorado) + "\n" +
                "}";
        return sb;
    }

    @XmlType(name = "FormaPreenchimentoEnum")
    @XmlEnum(String.class)
    public enum FormaPreenchimentoEnum {

        @XmlEnumValue("LISTA_ESTATICA")
        @JsonProperty("LISTA_ESTATICA")
        LISTA_ESTATICA("LISTA_ESTATICA"),

        @XmlEnumValue("BOOLEANO")
        @JsonProperty("BOOLEANO")
        BOOLEANO("BOOLEANO"),

        @XmlEnumValue("DATA")
        @JsonProperty("DATA")
        DATA("DATA"),

        @XmlEnumValue("DATA_HORA")
        @JsonProperty("DATA_HORA")
        DATA_HORA("DATA_HORA"),

        @XmlEnumValue("NUMERO_INTEIRO")
        @JsonProperty("NUMERO_INTEIRO")
        NUMERO_INTEIRO("NUMERO_INTEIRO"),

        @XmlEnumValue("NUMERO_REAL")
        @JsonProperty("NUMERO_REAL")
        NUMERO_REAL("NUMERO_REAL"),

        @XmlEnumValue("TEXTO")
        @JsonProperty("TEXTO")
        TEXTO("TEXTO"),

        @XmlEnumValue("DOMINIO_DINAMICO")
        @JsonProperty("DOMINIO_DINAMICO")
        DOMINIO_DINAMICO("DOMINIO_DINAMICO"),

        @XmlEnumValue("COMPOSTO")
        @JsonProperty("COMPOSTO")
        COMPOSTO("COMPOSTO"),

        @XmlEnumValue("LISTA_TABX_FILTRO")
        @JsonProperty("LISTA_TABX_FILTRO")
        LISTA_TABX_FILTRO("LISTA_TABX_FILTRO");


        private final String value;

        FormaPreenchimentoEnum(String v) {
            value = v;
        }

        public static FormaPreenchimentoEnum fromValue(String v) {
            for (FormaPreenchimentoEnum b : FormaPreenchimentoEnum.values()) {
                if (String.valueOf(b.value).equals(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "' to FormaPreenchimentoEnum");
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
