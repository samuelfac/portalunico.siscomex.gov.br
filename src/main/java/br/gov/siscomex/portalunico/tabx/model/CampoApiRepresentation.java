package br.gov.siscomex.portalunico.tabx.model;

import com.fasterxml.jackson.annotation.JsonProperty;
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
 @XmlType(name = "CampoApiRepresentation", propOrder =
    { "nome", "rotulo", "descricao", "tipo", "tamanho", "casasDecimais", "formato", "obrigatorio", "autoNumerado", "chaveNegocio", "campoEstrangeiro", "restricaoUnicidade", "possuiDominio", "nomeTabelaEstrangeira", "dominios"
})

@XmlRootElement(name="CampoApiRepresentation")
public class CampoApiRepresentation  {
  
  @XmlElement(name="nome", required = true)
  @ApiModelProperty(example = "INDICADOR_DESPACHO_EXP", required = true, value = "Nome do campo.<br>Tamanho mínimo: 1<br>Tamanho máximo: 40")
 /**
   * Nome do campo.<br>Tamanho mínimo: 1<br>Tamanho máximo: 40
  **/
  private String nome = null;

  @XmlElement(name="rotulo")
  @ApiModelProperty(example = "Indicador de despacho de exportação", value = "Rótulo do campo.<br>Tamanho mínimo: 1<br>Tamanho máximo: 50")
 /**
   * Rótulo do campo.<br>Tamanho mínimo: 1<br>Tamanho máximo: 50
  **/
  private String rotulo = null;

  @XmlElement(name="descricao")
  @ApiModelProperty(example = "Indicador de despacho de exportação", value = "Descrição do campo.<br>Tamanho mínimo: 1<br>Tamanho máximo: 100")
 /**
   * Descrição do campo.<br>Tamanho mínimo: 1<br>Tamanho máximo: 100
  **/
  private String descricao = null;


@XmlType(name="TipoEnum")
@XmlEnum(String.class)
public enum TipoEnum {

	@XmlEnumValue("INTEIRO")
	@JsonProperty("INTEIRO")
	INTEIRO(String.valueOf("INTEIRO")),
	
	@XmlEnumValue("DECIMAL")
	@JsonProperty("DECIMAL")
	DECIMAL(String.valueOf("DECIMAL")),
	
	@XmlEnumValue("STRING")
	@JsonProperty("STRING")
	STRING(String.valueOf("STRING")),
	
	@XmlEnumValue("DATA")
	@JsonProperty("DATA")
	DATA(String.valueOf("DATA")),
	
	@XmlEnumValue("DATA_HORA")
	@JsonProperty("DATA_HORA")
	DATA_HORA(String.valueOf("DATA_HORA")),
	
	@XmlEnumValue("BOOLEANO")
	@JsonProperty("BOOLEANO")
	BOOLEANO(String.valueOf("BOOLEANO"));


    private String value;

    TipoEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TipoEnum fromValue(String v) {
        for (TipoEnum b : TipoEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to TipoEnum");
    }
}

  @XmlElement(name="tipo", required = true)
  @ApiModelProperty(example = "STRING", required = true, value = "Tipo do campo.<br>Tamanho mínimo: 1<br>Tamanho máximo: 50")
 /**
   * Tipo do campo.<br>Tamanho mínimo: 1<br>Tamanho máximo: 50
  **/
  private TipoEnum tipo = null;

  @XmlElement(name="tamanho")
  @ApiModelProperty(example = "1", value = "Tamanho do campo.<br>Valor mínimo: 1<br>Valor máximo: 9999")
 /**
   * Tamanho do campo.<br>Valor mínimo: 1<br>Valor máximo: 9999
  **/
  private Integer tamanho = null;

  @XmlElement(name="casasDecimais")
  @ApiModelProperty(example = "0", value = "Casas decimais do campo.<br>Valor: 0 ou 1")
 /**
   * Casas decimais do campo.<br>Valor: 0 ou 1
  **/
  private Integer casasDecimais = null;

  @XmlElement(name="formato")
  @ApiModelProperty(value = "Formato do campo.<br>Tamanho mínimo: 1<br>Tamanho máximo: 30")
 /**
   * Formato do campo.<br>Tamanho mínimo: 1<br>Tamanho máximo: 30
  **/
  private String formato = null;

  @XmlElement(name="obrigatorio", required = true)
  @ApiModelProperty(example = "true", required = true, value = "Obrigatoriedade do campo.")
 /**
   * Obrigatoriedade do campo.
  **/
  private Boolean obrigatorio = null;

  @XmlElement(name="autoNumerado", required = true)
  @ApiModelProperty(example = "true", required = true, value = "Indicador de autonumerado.")
 /**
   * Indicador de autonumerado.
  **/
  private Boolean autoNumerado = null;

  @XmlElement(name="chaveNegocio", required = true)
  @ApiModelProperty(example = "false", required = true, value = "Indicador de chave de negócio.")
 /**
   * Indicador de chave de negócio.
  **/
  private Boolean chaveNegocio = null;

  @XmlElement(name="campoEstrangeiro", required = true)
  @ApiModelProperty(example = "false", required = true, value = "Indicador de campo estrangeiro.")
 /**
   * Indicador de campo estrangeiro.
  **/
  private Boolean campoEstrangeiro = null;

  @XmlElement(name="restricaoUnicidade", required = true)
  @ApiModelProperty(example = "true", required = true, value = "Indicador de restrição por unicidade.")
 /**
   * Indicador de restrição por unicidade.
  **/
  private Boolean restricaoUnicidade = null;

  @XmlElement(name="possuiDominio", required = true)
  @ApiModelProperty(example = "true", required = true, value = "Indicador de existência de domínio.")
 /**
   * Indicador de existência de domínio.
  **/
  private Boolean possuiDominio = null;

  @XmlElement(name="nomeTabelaEstrangeira")
  @ApiModelProperty(value = "Nome da tabela estrangeira.<br>Tamanho mínimo: 1<br>Tamanho máximo: 50")
 /**
   * Nome da tabela estrangeira.<br>Tamanho mínimo: 1<br>Tamanho máximo: 50
  **/
  private String nomeTabelaEstrangeira = null;

  @XmlElement(name="dominios")
  @ApiModelProperty(value = "Domínios do campo.")
  @Valid
 /**
   * Domínios do campo.
  **/
  private List<DominioCampoApiRepresentation> dominios = null;
 /**
   * Nome do campo.&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 40
   * @return nome
  **/
  @JsonProperty("nome")
  @NotNull
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public CampoApiRepresentation nome(String nome) {
    this.nome = nome;
    return this;
  }

 /**
   * Rótulo do campo.&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 50
   * @return rotulo
  **/
  @JsonProperty("rotulo")
  public String getRotulo() {
    return rotulo;
  }

  public void setRotulo(String rotulo) {
    this.rotulo = rotulo;
  }

  public CampoApiRepresentation rotulo(String rotulo) {
    this.rotulo = rotulo;
    return this;
  }

 /**
   * Descrição do campo.&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 100
   * @return descricao
  **/
  @JsonProperty("descricao")
  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public CampoApiRepresentation descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }

 /**
   * Tipo do campo.&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 50
   * @return tipo
  **/
  @JsonProperty("tipo")
  @NotNull
  public String getTipo() {
    if (tipo == null) {
      return null;
    }
    return tipo.value();
  }

  public void setTipo(TipoEnum tipo) {
    this.tipo = tipo;
  }

  public CampoApiRepresentation tipo(TipoEnum tipo) {
    this.tipo = tipo;
    return this;
  }

 /**
   * Tamanho do campo.&lt;br&gt;Valor mínimo: 1&lt;br&gt;Valor máximo: 9999
   * @return tamanho
  **/
  @JsonProperty("tamanho")
  public Integer getTamanho() {
    return tamanho;
  }

  public void setTamanho(Integer tamanho) {
    this.tamanho = tamanho;
  }

  public CampoApiRepresentation tamanho(Integer tamanho) {
    this.tamanho = tamanho;
    return this;
  }

 /**
   * Casas decimais do campo.&lt;br&gt;Valor: 0 ou 1
   * @return casasDecimais
  **/
  @JsonProperty("casasDecimais")
  public Integer getCasasDecimais() {
    return casasDecimais;
  }

  public void setCasasDecimais(Integer casasDecimais) {
    this.casasDecimais = casasDecimais;
  }

  public CampoApiRepresentation casasDecimais(Integer casasDecimais) {
    this.casasDecimais = casasDecimais;
    return this;
  }

 /**
   * Formato do campo.&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 30
   * @return formato
  **/
  @JsonProperty("formato")
  public String getFormato() {
    return formato;
  }

  public void setFormato(String formato) {
    this.formato = formato;
  }

  public CampoApiRepresentation formato(String formato) {
    this.formato = formato;
    return this;
  }

 /**
   * Obrigatoriedade do campo.
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

  public CampoApiRepresentation obrigatorio(Boolean obrigatorio) {
    this.obrigatorio = obrigatorio;
    return this;
  }

 /**
   * Indicador de autonumerado.
   * @return autoNumerado
  **/
  @JsonProperty("autoNumerado")
  @NotNull
  public Boolean isAutoNumerado() {
    return autoNumerado;
  }

  public void setAutoNumerado(Boolean autoNumerado) {
    this.autoNumerado = autoNumerado;
  }

  public CampoApiRepresentation autoNumerado(Boolean autoNumerado) {
    this.autoNumerado = autoNumerado;
    return this;
  }

 /**
   * Indicador de chave de negócio.
   * @return chaveNegocio
  **/
  @JsonProperty("chaveNegocio")
  @NotNull
  public Boolean isChaveNegocio() {
    return chaveNegocio;
  }

  public void setChaveNegocio(Boolean chaveNegocio) {
    this.chaveNegocio = chaveNegocio;
  }

  public CampoApiRepresentation chaveNegocio(Boolean chaveNegocio) {
    this.chaveNegocio = chaveNegocio;
    return this;
  }

 /**
   * Indicador de campo estrangeiro.
   * @return campoEstrangeiro
  **/
  @JsonProperty("campoEstrangeiro")
  @NotNull
  public Boolean isCampoEstrangeiro() {
    return campoEstrangeiro;
  }

  public void setCampoEstrangeiro(Boolean campoEstrangeiro) {
    this.campoEstrangeiro = campoEstrangeiro;
  }

  public CampoApiRepresentation campoEstrangeiro(Boolean campoEstrangeiro) {
    this.campoEstrangeiro = campoEstrangeiro;
    return this;
  }

 /**
   * Indicador de restrição por unicidade.
   * @return restricaoUnicidade
  **/
  @JsonProperty("restricaoUnicidade")
  @NotNull
  public Boolean isRestricaoUnicidade() {
    return restricaoUnicidade;
  }

  public void setRestricaoUnicidade(Boolean restricaoUnicidade) {
    this.restricaoUnicidade = restricaoUnicidade;
  }

  public CampoApiRepresentation restricaoUnicidade(Boolean restricaoUnicidade) {
    this.restricaoUnicidade = restricaoUnicidade;
    return this;
  }

 /**
   * Indicador de existência de domínio.
   * @return possuiDominio
  **/
  @JsonProperty("possuiDominio")
  @NotNull
  public Boolean isPossuiDominio() {
    return possuiDominio;
  }

  public void setPossuiDominio(Boolean possuiDominio) {
    this.possuiDominio = possuiDominio;
  }

  public CampoApiRepresentation possuiDominio(Boolean possuiDominio) {
    this.possuiDominio = possuiDominio;
    return this;
  }

 /**
   * Nome da tabela estrangeira.&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 50
   * @return nomeTabelaEstrangeira
  **/
  @JsonProperty("nomeTabelaEstrangeira")
  public String getNomeTabelaEstrangeira() {
    return nomeTabelaEstrangeira;
  }

  public void setNomeTabelaEstrangeira(String nomeTabelaEstrangeira) {
    this.nomeTabelaEstrangeira = nomeTabelaEstrangeira;
  }

  public CampoApiRepresentation nomeTabelaEstrangeira(String nomeTabelaEstrangeira) {
    this.nomeTabelaEstrangeira = nomeTabelaEstrangeira;
    return this;
  }

 /**
   * Domínios do campo.
   * @return dominios
  **/
  @JsonProperty("dominios")
  public List<DominioCampoApiRepresentation> getDominios() {
    return dominios;
  }

  public void setDominios(List<DominioCampoApiRepresentation> dominios) {
    this.dominios = dominios;
  }

  public CampoApiRepresentation dominios(List<DominioCampoApiRepresentation> dominios) {
    this.dominios = dominios;
    return this;
  }

  public CampoApiRepresentation addDominiosItem(DominioCampoApiRepresentation dominiosItem) {
    this.dominios.add(dominiosItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampoApiRepresentation {\n");
    
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    rotulo: ").append(toIndentedString(rotulo)).append("\n");
    sb.append("    descricao: ").append(toIndentedString(descricao)).append("\n");
    sb.append("    tipo: ").append(toIndentedString(tipo)).append("\n");
    sb.append("    tamanho: ").append(toIndentedString(tamanho)).append("\n");
    sb.append("    casasDecimais: ").append(toIndentedString(casasDecimais)).append("\n");
    sb.append("    formato: ").append(toIndentedString(formato)).append("\n");
    sb.append("    obrigatorio: ").append(toIndentedString(obrigatorio)).append("\n");
    sb.append("    autoNumerado: ").append(toIndentedString(autoNumerado)).append("\n");
    sb.append("    chaveNegocio: ").append(toIndentedString(chaveNegocio)).append("\n");
    sb.append("    campoEstrangeiro: ").append(toIndentedString(campoEstrangeiro)).append("\n");
    sb.append("    restricaoUnicidade: ").append(toIndentedString(restricaoUnicidade)).append("\n");
    sb.append("    possuiDominio: ").append(toIndentedString(possuiDominio)).append("\n");
    sb.append("    nomeTabelaEstrangeira: ").append(toIndentedString(nomeTabelaEstrangeira)).append("\n");
    sb.append("    dominios: ").append(toIndentedString(dominios)).append("\n");
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

