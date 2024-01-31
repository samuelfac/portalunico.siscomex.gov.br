package br.gov.siscomex.portalunico.cadatributos.model;

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
    { "codigo", "modalidade", "obrigatorio", "dataInicioVigencia", "dataFimVigencia", "informacaoAdicional", "multivalorado", "listaSubatributos", "nome", "orgaos", "objetivos", "tipoAtributo", "atributoCondicionante", "condicionados", "dominio", "brid", "wcoid", "formaPreenchimento", "orientacaoPreenchimento", "nomeApresentacao", "definicao", "tamanhoMaximo", "mascara", "casasDecimais"
})

@XmlRootElement(name="ArquivoDiarioAtributoDTO")
/**
  * Informações do arquivo diário com a lista de Atributos e NCM
 **/
@ApiModel(description="Informações do arquivo diário com a lista de Atributos e NCM")
public class ArquivoDiarioAtributoDTO  {
  
  @XmlElement(name="codigo", required = true)
  @ApiModelProperty(example = "ATT_1", required = true, value = "Código do atributo<br>Tamanho mínimo: 1<br>Tamanho máximo: 25")
 /**
   * Código do atributo<br>Tamanho mínimo: 1<br>Tamanho máximo: 25
  **/
  private String codigo = null;

  @XmlElement(name="modalidade", required = true)
  @ApiModelProperty(example = "Exportação", required = true, value = "Modalidade de operação.<br>Tamanho máximo: 20<br>Domínio:<br>Exportação<br>Importação")
 /**
   * Modalidade de operação.<br>Tamanho máximo: 20<br>Domínio:<br>Exportação<br>Importação
  **/
  private String modalidade = null;

  @XmlElement(name="obrigatorio", required = true)
  @ApiModelProperty(example = "true", required = true, value = "Preenchimento obrigatório.<br>Domínio:<br>true<br>false")
 /**
   * Preenchimento obrigatório.<br>Domínio:<br>true<br>false
  **/
  private Boolean obrigatorio = false;

  @XmlElement(name="dataInicioVigencia", required = true)
  @ApiModelProperty(example = "2019-01-01", required = true, value = "Data de início de vigência<br>Formato: yyyy-MM-dd")
 /**
   * Data de início de vigência<br>Formato: yyyy-MM-dd
  **/
  private String dataInicioVigencia = null;

  @XmlElement(name="dataFimVigencia")
  @ApiModelProperty(example = "2019-08-29", value = "Data de fim de vigência<br>Formato: yyyy-MM-dd")
 /**
   * Data de fim de vigência<br>Formato: yyyy-MM-dd
  **/
  private String dataFimVigencia = null;

  @XmlElement(name="informacaoAdicional")
  @ApiModelProperty(example = "Texto livre", value = "Informação adicional de preenchimento para o vínculo<br>Tamanho mínimo: 0<br>Tamanho máximo: 1000")
 /**
   * Informação adicional de preenchimento para o vínculo<br>Tamanho mínimo: 0<br>Tamanho máximo: 1000
  **/
  private String informacaoAdicional = null;

  @XmlElement(name="multivalorado", required = true)
  @ApiModelProperty(example = "true", required = true, value = "Campo multivalorado.<br>Domínio:<br>true<br>false")
 /**
   * Campo multivalorado.<br>Domínio:<br>true<br>false
  **/
  private Boolean multivalorado = false;

  @XmlElement(name="listaSubatributos")
  @ApiModelProperty(value = "")
  @Valid
  private List<ArquivoDiarioAtributoDTO> listaSubatributos = null;

  @XmlElement(name="nome")
  @ApiModelProperty(value = "")
  private String nome = null;

  @XmlElement(name="orgaos")
  @ApiModelProperty(value = "")
  private List<String> orgaos = null;

  @XmlElement(name="objetivos")
  @ApiModelProperty(value = "")
  @Valid
  private List<ObjetivoAtributoConsultaDTO> objetivos = null;

  @XmlElement(name="tipoAtributo")
  @ApiModelProperty(value = "")
  private String tipoAtributo = null;

  @XmlElement(name="atributoCondicionante")
  @ApiModelProperty(value = "")
  private Boolean atributoCondicionante = false;

  @XmlElement(name="condicionados")
  @ApiModelProperty(value = "")
  @Valid
  private List<ArquivoDiarioCondicionadoDTO> condicionados = null;

  @XmlElement(name="dominio")
  @ApiModelProperty(value = "")
  @Valid
  private List<ItemAtributoListaConsultaDTO> dominio = null;

  @XmlElement(name="brid")
  @ApiModelProperty(value = "")
  private String brid = null;

  @XmlElement(name="wcoid")
  @ApiModelProperty(value = "")
  private String wcoid = null;


@XmlType(name="FormaPreenchimentoEnum")
@XmlEnum(String.class)
public enum FormaPreenchimentoEnum {

	@XmlEnumValue("LISTA_ESTATICA")
	@JsonProperty("LISTA_ESTATICA")
	LISTA_ESTATICA(String.valueOf("LISTA_ESTATICA")),
	
	@XmlEnumValue("BOOLEANO")
	@JsonProperty("BOOLEANO")
	BOOLEANO(String.valueOf("BOOLEANO")),
	
	@XmlEnumValue("DATA")
	@JsonProperty("DATA")
	DATA(String.valueOf("DATA")),
	
	@XmlEnumValue("DATA_HORA")
	@JsonProperty("DATA_HORA")
	DATA_HORA(String.valueOf("DATA_HORA")),
	
	@XmlEnumValue("NUMERO_INTEIRO")
	@JsonProperty("NUMERO_INTEIRO")
	NUMERO_INTEIRO(String.valueOf("NUMERO_INTEIRO")),
	
	@XmlEnumValue("NUMERO_REAL")
	@JsonProperty("NUMERO_REAL")
	NUMERO_REAL(String.valueOf("NUMERO_REAL")),
	
	@XmlEnumValue("TEXTO")
	@JsonProperty("TEXTO")
	TEXTO(String.valueOf("TEXTO")),
	
	@XmlEnumValue("DOMINIO_DINAMICO")
	@JsonProperty("DOMINIO_DINAMICO")
	DOMINIO_DINAMICO(String.valueOf("DOMINIO_DINAMICO")),
	
	@XmlEnumValue("COMPOSTO")
	@JsonProperty("COMPOSTO")
	COMPOSTO(String.valueOf("COMPOSTO"));


    private String value;

    FormaPreenchimentoEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static FormaPreenchimentoEnum fromValue(String v) {
        for (FormaPreenchimentoEnum b : FormaPreenchimentoEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to FormaPreenchimentoEnum");
    }
}

  @XmlElement(name="formaPreenchimento")
  @ApiModelProperty(value = "")
  private FormaPreenchimentoEnum formaPreenchimento = null;

  @XmlElement(name="orientacaoPreenchimento")
  @ApiModelProperty(value = "")
  private String orientacaoPreenchimento = null;

  @XmlElement(name="nomeApresentacao")
  @ApiModelProperty(value = "")
  private String nomeApresentacao = null;

  @XmlElement(name="definicao")
  @ApiModelProperty(value = "")
  private String definicao = null;

  @XmlElement(name="tamanhoMaximo")
  @ApiModelProperty(value = "")
  private Integer tamanhoMaximo = null;

  @XmlElement(name="mascara")
  @ApiModelProperty(value = "")
  private String mascara = null;

  @XmlElement(name="casasDecimais")
  @ApiModelProperty(value = "")
  private Integer casasDecimais = null;
 /**
   * Código do atributo&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 25
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
  public Boolean isObrigatorio() {
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
   * Campo multivalorado.&lt;br&gt;Domínio:&lt;br&gt;true&lt;br&gt;false
   * @return multivalorado
  **/
  @JsonProperty("multivalorado")
  @NotNull
  public Boolean isMultivalorado() {
    return multivalorado;
  }

  public void setMultivalorado(Boolean multivalorado) {
    this.multivalorado = multivalorado;
  }

  public ArquivoDiarioAtributoDTO multivalorado(Boolean multivalorado) {
    this.multivalorado = multivalorado;
    return this;
  }

 /**
   * Get listaSubatributos
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
   * Get nome
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
   * Get orgaos
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
   * Get objetivos
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
   * Get tipoAtributo
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
   * Get atributoCondicionante
   * @return atributoCondicionante
  **/
  @JsonProperty("atributoCondicionante")
  public Boolean isAtributoCondicionante() {
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
   * Get condicionados
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
   * Get dominio
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
   * Get brid
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
   * Get wcoid
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
   * Get formaPreenchimento
   * @return formaPreenchimento
  **/
  @JsonProperty("formaPreenchimento")
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
   * Get orientacaoPreenchimento
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
   * Get nomeApresentacao
   * @return nomeApresentacao
  **/
  @JsonProperty("nomeApresentacao")
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
   * Get definicao
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
   * Get tamanhoMaximo
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
   * Get mascara
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
   * Get casasDecimais
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


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArquivoDiarioAtributoDTO {\n");
    
    sb.append("    codigo: ").append(toIndentedString(codigo)).append("\n");
    sb.append("    modalidade: ").append(toIndentedString(modalidade)).append("\n");
    sb.append("    obrigatorio: ").append(toIndentedString(obrigatorio)).append("\n");
    sb.append("    dataInicioVigencia: ").append(toIndentedString(dataInicioVigencia)).append("\n");
    sb.append("    dataFimVigencia: ").append(toIndentedString(dataFimVigencia)).append("\n");
    sb.append("    informacaoAdicional: ").append(toIndentedString(informacaoAdicional)).append("\n");
    sb.append("    multivalorado: ").append(toIndentedString(multivalorado)).append("\n");
    sb.append("    listaSubatributos: ").append(toIndentedString(listaSubatributos)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    orgaos: ").append(toIndentedString(orgaos)).append("\n");
    sb.append("    objetivos: ").append(toIndentedString(objetivos)).append("\n");
    sb.append("    tipoAtributo: ").append(toIndentedString(tipoAtributo)).append("\n");
    sb.append("    atributoCondicionante: ").append(toIndentedString(atributoCondicionante)).append("\n");
    sb.append("    condicionados: ").append(toIndentedString(condicionados)).append("\n");
    sb.append("    dominio: ").append(toIndentedString(dominio)).append("\n");
    sb.append("    brid: ").append(toIndentedString(brid)).append("\n");
    sb.append("    wcoid: ").append(toIndentedString(wcoid)).append("\n");
    sb.append("    formaPreenchimento: ").append(toIndentedString(formaPreenchimento)).append("\n");
    sb.append("    orientacaoPreenchimento: ").append(toIndentedString(orientacaoPreenchimento)).append("\n");
    sb.append("    nomeApresentacao: ").append(toIndentedString(nomeApresentacao)).append("\n");
    sb.append("    definicao: ").append(toIndentedString(definicao)).append("\n");
    sb.append("    tamanhoMaximo: ").append(toIndentedString(tamanhoMaximo)).append("\n");
    sb.append("    mascara: ").append(toIndentedString(mascara)).append("\n");
    sb.append("    casasDecimais: ").append(toIndentedString(casasDecimais)).append("\n");
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

