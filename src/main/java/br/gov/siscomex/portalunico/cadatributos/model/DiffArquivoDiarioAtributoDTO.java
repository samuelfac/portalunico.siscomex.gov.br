package br.gov.siscomex.portalunico.cadatributos.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiffArquivoDiarioAtributoDTO", propOrder =
        {"codigo", "nome", "definicao", "nomeApresentacao", "tipoAtributo", "brid", "wcoid", "orientacaoPreenchimento", "formaPreenchimento", "tamanhoMaximo", "mascara", "casasDecimais", "modalidade", "obrigatorio", "dataInicioVigencia", "dataFimVigencia", "informacaoAdicional", "dominio", "objetivos", "orgaos", "atributoCondicionante", "condicionados", "listaSubatributos", "multivalorado"
        })

@XmlRootElement(name = "DiffArquivoDiarioAtributoDTO")
public class DiffArquivoDiarioAtributoDTO {

    @XmlElement(name = "codigo")
    @ApiModelProperty(value = "Código do atributo")
    /**
     * Código do atributo
     **/
    private String codigo = null;

    @XmlElement(name = "nome")
    @ApiModelProperty(value = "")
    @Valid
    private DiffValorDTO nome = null;

    @XmlElement(name = "definicao")
    @ApiModelProperty(value = "")
    @Valid
    private DiffValorDTO definicao = null;

    @XmlElement(name = "nomeApresentacao")
    @ApiModelProperty(value = "")
    @Valid
    private DiffValorDTO nomeApresentacao = null;

    @XmlElement(name = "tipoAtributo")
    @ApiModelProperty(value = "")
    @Valid
    private DiffValorDTO tipoAtributo = null;

    @XmlElement(name = "brid")
    @ApiModelProperty(value = "")
    @Valid
    private DiffValorDTO brid = null;

    @XmlElement(name = "wcoid")
    @ApiModelProperty(value = "")
    @Valid
    private DiffValorDTO wcoid = null;

    @XmlElement(name = "orientacaoPreenchimento")
    @ApiModelProperty(value = "")
    @Valid
    private DiffValorDTO orientacaoPreenchimento = null;

    @XmlElement(name = "formaPreenchimento")
    @ApiModelProperty(value = "")
    @Valid
    private DiffValorDTO formaPreenchimento = null;

    @XmlElement(name = "tamanhoMaximo")
    @ApiModelProperty(value = "")
    @Valid
    private DiffValorDTO tamanhoMaximo = null;

    @XmlElement(name = "mascara")
    @ApiModelProperty(value = "")
    @Valid
    private DiffValorDTO mascara = null;

    @XmlElement(name = "casasDecimais")
    @ApiModelProperty(value = "")
    @Valid
    private DiffValorDTO casasDecimais = null;

    @XmlElement(name = "modalidade")
    @ApiModelProperty(value = "")
    @Valid
    private DiffValorDTO modalidade = null;

    @XmlElement(name = "obrigatorio")
    @ApiModelProperty(value = "")
    @Valid
    private DiffValorDTO obrigatorio = null;

    @XmlElement(name = "dataInicioVigencia")
    @ApiModelProperty(value = "")
    @Valid
    private DiffValorDTO dataInicioVigencia = null;

    @XmlElement(name = "dataFimVigencia")
    @ApiModelProperty(value = "")
    @Valid
    private DiffValorDTO dataFimVigencia = null;

    @XmlElement(name = "informacaoAdicional")
    @ApiModelProperty(value = "")
    @Valid
    private DiffValorDTO informacaoAdicional = null;

    @XmlElement(name = "dominio")
    @ApiModelProperty(value = "")
    @Valid
    private DiffArquivoDiarioDominioDTO dominio = null;

    @XmlElement(name = "objetivos")
    @ApiModelProperty(value = "")
    @Valid
    private DiffValorDTO objetivos = null;

    @XmlElement(name = "orgaos")
    @ApiModelProperty(value = "")
    @Valid
    private DiffValorDTO orgaos = null;

    @XmlElement(name = "atributoCondicionante")
    @ApiModelProperty(value = "")
    @Valid
    private DiffValorDTO atributoCondicionante = null;

    @XmlElement(name = "condicionados")
    @ApiModelProperty(value = "")
    @Valid
    private DiffArquivoDiarioCondicionadoDTO condicionados = null;

    @XmlElement(name = "listaSubatributos")
    @ApiModelProperty(value = "")
    @Valid
    private DiffArquivoDiarioSubatributoDTO listaSubatributos = null;

    @XmlElement(name = "multivalorado")
    @ApiModelProperty(value = "")
    @Valid
    private DiffValorDTO multivalorado = null;

    /**
     * Código do atributo
     *
     * @return codigo
     **/
    @JsonProperty("codigo")
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public DiffArquivoDiarioAtributoDTO codigo(String codigo) {
        this.codigo = codigo;
        return this;
    }

    /**
     * Get nome
     *
     * @return nome
     **/
    @JsonProperty("nome")
    public DiffValorDTO getNome() {
        return nome;
    }

    public void setNome(DiffValorDTO nome) {
        this.nome = nome;
    }

    public DiffArquivoDiarioAtributoDTO nome(DiffValorDTO nome) {
        this.nome = nome;
        return this;
    }

    /**
     * Get definicao
     *
     * @return definicao
     **/
    @JsonProperty("definicao")
    public DiffValorDTO getDefinicao() {
        return definicao;
    }

    public void setDefinicao(DiffValorDTO definicao) {
        this.definicao = definicao;
    }

    public DiffArquivoDiarioAtributoDTO definicao(DiffValorDTO definicao) {
        this.definicao = definicao;
        return this;
    }

    /**
     * Get nomeApresentacao
     *
     * @return nomeApresentacao
     **/
    @JsonProperty("nomeApresentacao")
    public DiffValorDTO getNomeApresentacao() {
        return nomeApresentacao;
    }

    public void setNomeApresentacao(DiffValorDTO nomeApresentacao) {
        this.nomeApresentacao = nomeApresentacao;
    }

    public DiffArquivoDiarioAtributoDTO nomeApresentacao(DiffValorDTO nomeApresentacao) {
        this.nomeApresentacao = nomeApresentacao;
        return this;
    }

    /**
     * Get tipoAtributo
     *
     * @return tipoAtributo
     **/
    @JsonProperty("tipoAtributo")
    public DiffValorDTO getTipoAtributo() {
        return tipoAtributo;
    }

    public void setTipoAtributo(DiffValorDTO tipoAtributo) {
        this.tipoAtributo = tipoAtributo;
    }

    public DiffArquivoDiarioAtributoDTO tipoAtributo(DiffValorDTO tipoAtributo) {
        this.tipoAtributo = tipoAtributo;
        return this;
    }

    /**
     * Get brid
     *
     * @return brid
     **/
    @JsonProperty("brid")
    public DiffValorDTO getBrid() {
        return brid;
    }

    public void setBrid(DiffValorDTO brid) {
        this.brid = brid;
    }

    public DiffArquivoDiarioAtributoDTO brid(DiffValorDTO brid) {
        this.brid = brid;
        return this;
    }

    /**
     * Get wcoid
     *
     * @return wcoid
     **/
    @JsonProperty("wcoid")
    public DiffValorDTO getWcoid() {
        return wcoid;
    }

    public void setWcoid(DiffValorDTO wcoid) {
        this.wcoid = wcoid;
    }

    public DiffArquivoDiarioAtributoDTO wcoid(DiffValorDTO wcoid) {
        this.wcoid = wcoid;
        return this;
    }

    /**
     * Get orientacaoPreenchimento
     *
     * @return orientacaoPreenchimento
     **/
    @JsonProperty("orientacaoPreenchimento")
    public DiffValorDTO getOrientacaoPreenchimento() {
        return orientacaoPreenchimento;
    }

    public void setOrientacaoPreenchimento(DiffValorDTO orientacaoPreenchimento) {
        this.orientacaoPreenchimento = orientacaoPreenchimento;
    }

    public DiffArquivoDiarioAtributoDTO orientacaoPreenchimento(DiffValorDTO orientacaoPreenchimento) {
        this.orientacaoPreenchimento = orientacaoPreenchimento;
        return this;
    }

    /**
     * Get formaPreenchimento
     *
     * @return formaPreenchimento
     **/
    @JsonProperty("formaPreenchimento")
    public DiffValorDTO getFormaPreenchimento() {
        return formaPreenchimento;
    }

    public void setFormaPreenchimento(DiffValorDTO formaPreenchimento) {
        this.formaPreenchimento = formaPreenchimento;
    }

    public DiffArquivoDiarioAtributoDTO formaPreenchimento(DiffValorDTO formaPreenchimento) {
        this.formaPreenchimento = formaPreenchimento;
        return this;
    }

    /**
     * Get tamanhoMaximo
     *
     * @return tamanhoMaximo
     **/
    @JsonProperty("tamanhoMaximo")
    public DiffValorDTO getTamanhoMaximo() {
        return tamanhoMaximo;
    }

    public void setTamanhoMaximo(DiffValorDTO tamanhoMaximo) {
        this.tamanhoMaximo = tamanhoMaximo;
    }

    public DiffArquivoDiarioAtributoDTO tamanhoMaximo(DiffValorDTO tamanhoMaximo) {
        this.tamanhoMaximo = tamanhoMaximo;
        return this;
    }

    /**
     * Get mascara
     *
     * @return mascara
     **/
    @JsonProperty("mascara")
    public DiffValorDTO getMascara() {
        return mascara;
    }

    public void setMascara(DiffValorDTO mascara) {
        this.mascara = mascara;
    }

    public DiffArquivoDiarioAtributoDTO mascara(DiffValorDTO mascara) {
        this.mascara = mascara;
        return this;
    }

    /**
     * Get casasDecimais
     *
     * @return casasDecimais
     **/
    @JsonProperty("casasDecimais")
    public DiffValorDTO getCasasDecimais() {
        return casasDecimais;
    }

    public void setCasasDecimais(DiffValorDTO casasDecimais) {
        this.casasDecimais = casasDecimais;
    }

    public DiffArquivoDiarioAtributoDTO casasDecimais(DiffValorDTO casasDecimais) {
        this.casasDecimais = casasDecimais;
        return this;
    }

    /**
     * Get modalidade
     *
     * @return modalidade
     **/
    @JsonProperty("modalidade")
    public DiffValorDTO getModalidade() {
        return modalidade;
    }

    public void setModalidade(DiffValorDTO modalidade) {
        this.modalidade = modalidade;
    }

    public DiffArquivoDiarioAtributoDTO modalidade(DiffValorDTO modalidade) {
        this.modalidade = modalidade;
        return this;
    }

    /**
     * Get obrigatorio
     *
     * @return obrigatorio
     **/
    @JsonProperty("obrigatorio")
    public DiffValorDTO getObrigatorio() {
        return obrigatorio;
    }

    public void setObrigatorio(DiffValorDTO obrigatorio) {
        this.obrigatorio = obrigatorio;
    }

    public DiffArquivoDiarioAtributoDTO obrigatorio(DiffValorDTO obrigatorio) {
        this.obrigatorio = obrigatorio;
        return this;
    }

    /**
     * Get dataInicioVigencia
     *
     * @return dataInicioVigencia
     **/
    @JsonProperty("dataInicioVigencia")
    public DiffValorDTO getDataInicioVigencia() {
        return dataInicioVigencia;
    }

    public void setDataInicioVigencia(DiffValorDTO dataInicioVigencia) {
        this.dataInicioVigencia = dataInicioVigencia;
    }

    public DiffArquivoDiarioAtributoDTO dataInicioVigencia(DiffValorDTO dataInicioVigencia) {
        this.dataInicioVigencia = dataInicioVigencia;
        return this;
    }

    /**
     * Get dataFimVigencia
     *
     * @return dataFimVigencia
     **/
    @JsonProperty("dataFimVigencia")
    public DiffValorDTO getDataFimVigencia() {
        return dataFimVigencia;
    }

    public void setDataFimVigencia(DiffValorDTO dataFimVigencia) {
        this.dataFimVigencia = dataFimVigencia;
    }

    public DiffArquivoDiarioAtributoDTO dataFimVigencia(DiffValorDTO dataFimVigencia) {
        this.dataFimVigencia = dataFimVigencia;
        return this;
    }

    /**
     * Get informacaoAdicional
     *
     * @return informacaoAdicional
     **/
    @JsonProperty("informacaoAdicional")
    public DiffValorDTO getInformacaoAdicional() {
        return informacaoAdicional;
    }

    public void setInformacaoAdicional(DiffValorDTO informacaoAdicional) {
        this.informacaoAdicional = informacaoAdicional;
    }

    public DiffArquivoDiarioAtributoDTO informacaoAdicional(DiffValorDTO informacaoAdicional) {
        this.informacaoAdicional = informacaoAdicional;
        return this;
    }

    /**
     * Get dominio
     *
     * @return dominio
     **/
    @JsonProperty("dominio")
    public DiffArquivoDiarioDominioDTO getDominio() {
        return dominio;
    }

    public void setDominio(DiffArquivoDiarioDominioDTO dominio) {
        this.dominio = dominio;
    }

    public DiffArquivoDiarioAtributoDTO dominio(DiffArquivoDiarioDominioDTO dominio) {
        this.dominio = dominio;
        return this;
    }

    /**
     * Get objetivos
     *
     * @return objetivos
     **/
    @JsonProperty("objetivos")
    public DiffValorDTO getObjetivos() {
        return objetivos;
    }

    public void setObjetivos(DiffValorDTO objetivos) {
        this.objetivos = objetivos;
    }

    public DiffArquivoDiarioAtributoDTO objetivos(DiffValorDTO objetivos) {
        this.objetivos = objetivos;
        return this;
    }

    /**
     * Get orgaos
     *
     * @return orgaos
     **/
    @JsonProperty("orgaos")
    public DiffValorDTO getOrgaos() {
        return orgaos;
    }

    public void setOrgaos(DiffValorDTO orgaos) {
        this.orgaos = orgaos;
    }

    public DiffArquivoDiarioAtributoDTO orgaos(DiffValorDTO orgaos) {
        this.orgaos = orgaos;
        return this;
    }

    /**
     * Get atributoCondicionante
     *
     * @return atributoCondicionante
     **/
    @JsonProperty("atributoCondicionante")
    public DiffValorDTO getAtributoCondicionante() {
        return atributoCondicionante;
    }

    public void setAtributoCondicionante(DiffValorDTO atributoCondicionante) {
        this.atributoCondicionante = atributoCondicionante;
    }

    public DiffArquivoDiarioAtributoDTO atributoCondicionante(DiffValorDTO atributoCondicionante) {
        this.atributoCondicionante = atributoCondicionante;
        return this;
    }

    /**
     * Get condicionados
     *
     * @return condicionados
     **/
    @JsonProperty("condicionados")
    public DiffArquivoDiarioCondicionadoDTO getCondicionados() {
        return condicionados;
    }

    public void setCondicionados(DiffArquivoDiarioCondicionadoDTO condicionados) {
        this.condicionados = condicionados;
    }

    public DiffArquivoDiarioAtributoDTO condicionados(DiffArquivoDiarioCondicionadoDTO condicionados) {
        this.condicionados = condicionados;
        return this;
    }

    /**
     * Get listaSubatributos
     *
     * @return listaSubatributos
     **/
    @JsonProperty("listaSubatributos")
    public DiffArquivoDiarioSubatributoDTO getListaSubatributos() {
        return listaSubatributos;
    }

    public void setListaSubatributos(DiffArquivoDiarioSubatributoDTO listaSubatributos) {
        this.listaSubatributos = listaSubatributos;
    }

    public DiffArquivoDiarioAtributoDTO listaSubatributos(DiffArquivoDiarioSubatributoDTO listaSubatributos) {
        this.listaSubatributos = listaSubatributos;
        return this;
    }

    /**
     * Get multivalorado
     *
     * @return multivalorado
     **/
    @JsonProperty("multivalorado")
    public DiffValorDTO getMultivalorado() {
        return multivalorado;
    }

    public void setMultivalorado(DiffValorDTO multivalorado) {
        this.multivalorado = multivalorado;
    }

    public DiffArquivoDiarioAtributoDTO multivalorado(DiffValorDTO multivalorado) {
        this.multivalorado = multivalorado;
        return this;
    }


    @Override
    public String toString() {

        String sb = "class DiffArquivoDiarioAtributoDTO {\n" +
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
                "    objetivos: " + toIndentedString(objetivos) + "\n" +
                "    orgaos: " + toIndentedString(orgaos) + "\n" +
                "    atributoCondicionante: " + toIndentedString(atributoCondicionante) + "\n" +
                "    condicionados: " + toIndentedString(condicionados) + "\n" +
                "    listaSubatributos: " + toIndentedString(listaSubatributos) + "\n" +
                "    multivalorado: " + toIndentedString(multivalorado) + "\n" +
                "}";
        return sb;
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

