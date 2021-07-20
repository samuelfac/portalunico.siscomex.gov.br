package br.gov.siscomex.portalunico.talpco.model;

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
 @XmlType(name = "ConsultaDetalhadaLpco", propOrder =
    { "id", "numero", "codigoModelo", "orgao", "formaPreenchimento", "multiplasOperacoes", "requerInspecao", "numeroOrgaoOrigem", "dataReferencia", "dataInicioVigencia", "dataFimVigencia", "dataRegistro", "registroPublico", "versoes", "exigencias"
})

@XmlRootElement(name="ConsultaDetalhadaLpco")
/**
  * Dados de um LPCO, exibido na consulta detalhada de LPCOs
 **/
@ApiModel(description="Dados de um LPCO, exibido na consulta detalhada de LPCOs")
public class ConsultaDetalhadaLpco  {
  
  @XmlElement(name="id")
  @ApiModelProperty(value = "")
  private Long id = null;

  @XmlElement(name="numero", required = true)
  @ApiModelProperty(example = "E1900000001", required = true, value = "Número do LPCO<br>Tamanho: 11<br>Formato: OAANNNNNNNN<br>Lei de formação: O número do LPCO é composto por:<br>* O = Operação (E para exportação, I para importação)<br>* AA = Ano do registro do LPCO<br>* NNNNNNNN = Número sequencial do LPCO no ano")
 /**
   * Número do LPCO<br>Tamanho: 11<br>Formato: OAANNNNNNNN<br>Lei de formação: O número do LPCO é composto por:<br>* O = Operação (E para exportação, I para importação)<br>* AA = Ano do registro do LPCO<br>* NNNNNNNN = Número sequencial do LPCO no ano
  **/
  private String numero = null;

  @XmlElement(name="codigoModelo", required = true)
  @ApiModelProperty(example = "E00104", required = true, value = "Código do modelo de LPCO<br>Tamanho: 11<br>Formato: OAANNNNNNNN<br>Lei de formação: O número do LPCO é composto por:<br>* O = Operação (E para exportação, I para importação)<br>* AA = Ano do registro do LPCO<br>* NNNNNNNN = Número sequencial do LPCO no ano")
 /**
   * Código do modelo de LPCO<br>Tamanho: 11<br>Formato: OAANNNNNNNN<br>Lei de formação: O número do LPCO é composto por:<br>* O = Operação (E para exportação, I para importação)<br>* AA = Ano do registro do LPCO<br>* NNNNNNNN = Número sequencial do LPCO no ano
  **/
  private String codigoModelo = null;

  @XmlElement(name="orgao", required = true)
  @ApiModelProperty(example = "MAPA", required = true, value = "Sigla do órgão anuente do documento LPCO.")
 /**
   * Sigla do órgão anuente do documento LPCO.
  **/
  private String orgao = null;


@XmlType(name="FormaPreenchimentoEnum")
@XmlEnum(String.class)
public enum FormaPreenchimentoEnum {

	@XmlEnumValue("OFICIO")
	@JsonProperty("OFICIO")
	OFICIO(String.valueOf("OFICIO")),
	
	@XmlEnumValue("EXPORTADOR")
	@JsonProperty("EXPORTADOR")
	EXPORTADOR(String.valueOf("EXPORTADOR"));


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

  @XmlElement(name="formaPreenchimento", required = true)
  @ApiModelProperty(example = "OFICIO", required = true, value = "Forma de preenchimento do LPCO<br>Tamanho máximo: 50")
 /**
   * Forma de preenchimento do LPCO<br>Tamanho máximo: 50
  **/
  private FormaPreenchimentoEnum formaPreenchimento = null;

  @XmlElement(name="multiplasOperacoes", required = true)
  @ApiModelProperty(example = "true", required = true, value = "Indica se este LPCO pode ser utilizado para mais de uma operação")
 /**
   * Indica se este LPCO pode ser utilizado para mais de uma operação
  **/
  private Boolean multiplasOperacoes = false;

  @XmlElement(name="requerInspecao", required = true)
  @ApiModelProperty(example = "true", required = true, value = "Indica se o LPCO requer inspeção")
 /**
   * Indica se o LPCO requer inspeção
  **/
  private Boolean requerInspecao = false;

  @XmlElement(name="numeroOrgaoOrigem")
  @ApiModelProperty(example = "EXA12345", value = "Número do LPCO no órgão anuente, se houver<br>Tamanho mínimo: 1<br>Tamanho máximo: 30")
 /**
   * Número do LPCO no órgão anuente, se houver<br>Tamanho mínimo: 1<br>Tamanho máximo: 30
  **/
  private String numeroOrgaoOrigem = null;

  @XmlElement(name="dataReferencia", required = true)
  @ApiModelProperty(example = "2019-09-02T10:04:38.123Z", required = true, value = "Data de referência do LPCO.<br>Formato: dd-MM-yyyy'T'HH:mm:ss:SSSZ")
 /**
   * Data de referência do LPCO.<br>Formato: dd-MM-yyyy'T'HH:mm:ss:SSSZ
  **/
  private String dataReferencia = null;

  @XmlElement(name="dataInicioVigencia")
  @ApiModelProperty(example = "2019-09-02T10:04:38.123Z", value = "Data de início de vigência do LPCO.<br>Formato: dd-MM-yyyy'T'HH:mm:ss:SSSZ")
 /**
   * Data de início de vigência do LPCO.<br>Formato: dd-MM-yyyy'T'HH:mm:ss:SSSZ
  **/
  private String dataInicioVigencia = null;

  @XmlElement(name="dataFimVigencia")
  @ApiModelProperty(example = "2019-09-02T10:04:38.123Z", value = "Data de fim de vigência do LPCO.<br>Formato: dd-MM-yyyy'T'HH:mm:ss:SSSZ")
 /**
   * Data de fim de vigência do LPCO.<br>Formato: dd-MM-yyyy'T'HH:mm:ss:SSSZ
  **/
  private String dataFimVigencia = null;

  @XmlElement(name="dataRegistro")
  @ApiModelProperty(example = "2019-09-02T10:04:38.123Z", value = "Data de registro do LPCO.<br>Formato: dd-MM-yyyy'T'HH:mm:ss:SSSZ")
 /**
   * Data de registro do LPCO.<br>Formato: dd-MM-yyyy'T'HH:mm:ss:SSSZ
  **/
  private String dataRegistro = null;

  @XmlElement(name="registroPublico", required = true)
  @ApiModelProperty(example = "true", required = true, value = "Indica se o LPCO foi cadastrado pelo perfil de Acesso Público")
 /**
   * Indica se o LPCO foi cadastrado pelo perfil de Acesso Público
  **/
  private Boolean registroPublico = false;

  @XmlElement(name="versoes", required = true)
  @ApiModelProperty(required = true, value = "Lista de versões do formulário deste LPCO")
  @Valid
 /**
   * Lista de versões do formulário deste LPCO
  **/
  private List<ConsultaDetalhadaVersao> versoes = new ArrayList<>();

  @XmlElement(name="exigencias", required = true)
  @ApiModelProperty(required = true, value = "Lista de exigências cadastradas para este LPCO")
  @Valid
 /**
   * Lista de exigências cadastradas para este LPCO
  **/
  private List<ConsultaDetalhadaExigencia> exigencias = new ArrayList<>();
 /**
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public ConsultaDetalhadaLpco id(Long id) {
    this.id = id;
    return this;
  }

 /**
   * Número do LPCO&lt;br&gt;Tamanho: 11&lt;br&gt;Formato: OAANNNNNNNN&lt;br&gt;Lei de formação: O número do LPCO é composto por:&lt;br&gt;* O &#x3D; Operação (E para exportação, I para importação)&lt;br&gt;* AA &#x3D; Ano do registro do LPCO&lt;br&gt;* NNNNNNNN &#x3D; Número sequencial do LPCO no ano
   * @return numero
  **/
  @JsonProperty("numero")
  @NotNull
  public String getNumero() {
    return numero;
  }

  public void setNumero(String numero) {
    this.numero = numero;
  }

  public ConsultaDetalhadaLpco numero(String numero) {
    this.numero = numero;
    return this;
  }

 /**
   * Código do modelo de LPCO&lt;br&gt;Tamanho: 11&lt;br&gt;Formato: OAANNNNNNNN&lt;br&gt;Lei de formação: O número do LPCO é composto por:&lt;br&gt;* O &#x3D; Operação (E para exportação, I para importação)&lt;br&gt;* AA &#x3D; Ano do registro do LPCO&lt;br&gt;* NNNNNNNN &#x3D; Número sequencial do LPCO no ano
   * @return codigoModelo
  **/
  @JsonProperty("codigoModelo")
  @NotNull
  public String getCodigoModelo() {
    return codigoModelo;
  }

  public void setCodigoModelo(String codigoModelo) {
    this.codigoModelo = codigoModelo;
  }

  public ConsultaDetalhadaLpco codigoModelo(String codigoModelo) {
    this.codigoModelo = codigoModelo;
    return this;
  }

 /**
   * Sigla do órgão anuente do documento LPCO.
   * @return orgao
  **/
  @JsonProperty("orgao")
  @NotNull
  public String getOrgao() {
    return orgao;
  }

  public void setOrgao(String orgao) {
    this.orgao = orgao;
  }

  public ConsultaDetalhadaLpco orgao(String orgao) {
    this.orgao = orgao;
    return this;
  }

 /**
   * Forma de preenchimento do LPCO&lt;br&gt;Tamanho máximo: 50
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

  public ConsultaDetalhadaLpco formaPreenchimento(FormaPreenchimentoEnum formaPreenchimento) {
    this.formaPreenchimento = formaPreenchimento;
    return this;
  }

 /**
   * Indica se este LPCO pode ser utilizado para mais de uma operação
   * @return multiplasOperacoes
  **/
  @JsonProperty("multiplasOperacoes")
  @NotNull
  public Boolean isMultiplasOperacoes() {
    return multiplasOperacoes;
  }

  public void setMultiplasOperacoes(Boolean multiplasOperacoes) {
    this.multiplasOperacoes = multiplasOperacoes;
  }

  public ConsultaDetalhadaLpco multiplasOperacoes(Boolean multiplasOperacoes) {
    this.multiplasOperacoes = multiplasOperacoes;
    return this;
  }

 /**
   * Indica se o LPCO requer inspeção
   * @return requerInspecao
  **/
  @JsonProperty("requerInspecao")
  @NotNull
  public Boolean isRequerInspecao() {
    return requerInspecao;
  }

  public void setRequerInspecao(Boolean requerInspecao) {
    this.requerInspecao = requerInspecao;
  }

  public ConsultaDetalhadaLpco requerInspecao(Boolean requerInspecao) {
    this.requerInspecao = requerInspecao;
    return this;
  }

 /**
   * Número do LPCO no órgão anuente, se houver&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 30
   * @return numeroOrgaoOrigem
  **/
  @JsonProperty("numeroOrgaoOrigem")
  public String getNumeroOrgaoOrigem() {
    return numeroOrgaoOrigem;
  }

  public void setNumeroOrgaoOrigem(String numeroOrgaoOrigem) {
    this.numeroOrgaoOrigem = numeroOrgaoOrigem;
  }

  public ConsultaDetalhadaLpco numeroOrgaoOrigem(String numeroOrgaoOrigem) {
    this.numeroOrgaoOrigem = numeroOrgaoOrigem;
    return this;
  }

 /**
   * Data de referência do LPCO.&lt;br&gt;Formato: dd-MM-yyyy&#39;T&#39;HH:mm:ss:SSSZ
   * @return dataReferencia
  **/
  @JsonProperty("dataReferencia")
  @NotNull
  public String getDataReferencia() {
    return dataReferencia;
  }

  public void setDataReferencia(String dataReferencia) {
    this.dataReferencia = dataReferencia;
  }

  public ConsultaDetalhadaLpco dataReferencia(String dataReferencia) {
    this.dataReferencia = dataReferencia;
    return this;
  }

 /**
   * Data de início de vigência do LPCO.&lt;br&gt;Formato: dd-MM-yyyy&#39;T&#39;HH:mm:ss:SSSZ
   * @return dataInicioVigencia
  **/
  @JsonProperty("dataInicioVigencia")
  public String getDataInicioVigencia() {
    return dataInicioVigencia;
  }

  public void setDataInicioVigencia(String dataInicioVigencia) {
    this.dataInicioVigencia = dataInicioVigencia;
  }

  public ConsultaDetalhadaLpco dataInicioVigencia(String dataInicioVigencia) {
    this.dataInicioVigencia = dataInicioVigencia;
    return this;
  }

 /**
   * Data de fim de vigência do LPCO.&lt;br&gt;Formato: dd-MM-yyyy&#39;T&#39;HH:mm:ss:SSSZ
   * @return dataFimVigencia
  **/
  @JsonProperty("dataFimVigencia")
  public String getDataFimVigencia() {
    return dataFimVigencia;
  }

  public void setDataFimVigencia(String dataFimVigencia) {
    this.dataFimVigencia = dataFimVigencia;
  }

  public ConsultaDetalhadaLpco dataFimVigencia(String dataFimVigencia) {
    this.dataFimVigencia = dataFimVigencia;
    return this;
  }

 /**
   * Data de registro do LPCO.&lt;br&gt;Formato: dd-MM-yyyy&#39;T&#39;HH:mm:ss:SSSZ
   * @return dataRegistro
  **/
  @JsonProperty("dataRegistro")
  public String getDataRegistro() {
    return dataRegistro;
  }

  public void setDataRegistro(String dataRegistro) {
    this.dataRegistro = dataRegistro;
  }

  public ConsultaDetalhadaLpco dataRegistro(String dataRegistro) {
    this.dataRegistro = dataRegistro;
    return this;
  }

 /**
   * Indica se o LPCO foi cadastrado pelo perfil de Acesso Público
   * @return registroPublico
  **/
  @JsonProperty("registroPublico")
  @NotNull
  public Boolean isRegistroPublico() {
    return registroPublico;
  }

  public void setRegistroPublico(Boolean registroPublico) {
    this.registroPublico = registroPublico;
  }

  public ConsultaDetalhadaLpco registroPublico(Boolean registroPublico) {
    this.registroPublico = registroPublico;
    return this;
  }

 /**
   * Lista de versões do formulário deste LPCO
   * @return versoes
  **/
  @JsonProperty("versoes")
  @NotNull
  public List<ConsultaDetalhadaVersao> getVersoes() {
    return versoes;
  }

  public void setVersoes(List<ConsultaDetalhadaVersao> versoes) {
    this.versoes = versoes;
  }

  public ConsultaDetalhadaLpco versoes(List<ConsultaDetalhadaVersao> versoes) {
    this.versoes = versoes;
    return this;
  }

  public ConsultaDetalhadaLpco addVersoesItem(ConsultaDetalhadaVersao versoesItem) {
    this.versoes.add(versoesItem);
    return this;
  }

 /**
   * Lista de exigências cadastradas para este LPCO
   * @return exigencias
  **/
  @JsonProperty("exigencias")
  @NotNull
  public List<ConsultaDetalhadaExigencia> getExigencias() {
    return exigencias;
  }

  public void setExigencias(List<ConsultaDetalhadaExigencia> exigencias) {
    this.exigencias = exigencias;
  }

  public ConsultaDetalhadaLpco exigencias(List<ConsultaDetalhadaExigencia> exigencias) {
    this.exigencias = exigencias;
    return this;
  }

  public ConsultaDetalhadaLpco addExigenciasItem(ConsultaDetalhadaExigencia exigenciasItem) {
    this.exigencias.add(exigenciasItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsultaDetalhadaLpco {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    numero: ").append(toIndentedString(numero)).append("\n");
    sb.append("    codigoModelo: ").append(toIndentedString(codigoModelo)).append("\n");
    sb.append("    orgao: ").append(toIndentedString(orgao)).append("\n");
    sb.append("    formaPreenchimento: ").append(toIndentedString(formaPreenchimento)).append("\n");
    sb.append("    multiplasOperacoes: ").append(toIndentedString(multiplasOperacoes)).append("\n");
    sb.append("    requerInspecao: ").append(toIndentedString(requerInspecao)).append("\n");
    sb.append("    numeroOrgaoOrigem: ").append(toIndentedString(numeroOrgaoOrigem)).append("\n");
    sb.append("    dataReferencia: ").append(toIndentedString(dataReferencia)).append("\n");
    sb.append("    dataInicioVigencia: ").append(toIndentedString(dataInicioVigencia)).append("\n");
    sb.append("    dataFimVigencia: ").append(toIndentedString(dataFimVigencia)).append("\n");
    sb.append("    dataRegistro: ").append(toIndentedString(dataRegistro)).append("\n");
    sb.append("    registroPublico: ").append(toIndentedString(registroPublico)).append("\n");
    sb.append("    versoes: ").append(toIndentedString(versoes)).append("\n");
    sb.append("    exigencias: ").append(toIndentedString(exigencias)).append("\n");
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

