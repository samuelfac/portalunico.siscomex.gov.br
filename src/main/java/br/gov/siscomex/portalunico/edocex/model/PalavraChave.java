package br.gov.siscomex.portalunico.edocex.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.*;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "PalavraChave", propOrder =
    { "casasDecimais", "dominios", "idPalavraChave", "mascara", "nomePalavraChave", "obrigatoria", "tamanhoCampo", "tipoDado"
})

@XmlRootElement(name="PalavraChave")
/**
  * Palavra-chave.
 **/
@ApiModel(description="Palavra-chave.")
public class PalavraChave  {
  
  @XmlElement(name="casasDecimais")
  @ApiModelProperty(example = "2", value = "Se aplica apenas ao tipo de dado REAL e indica o número de casas decimais.<br/>Valor mínimo:    1<br/>Valor máximo:   18 (incluindo o tamanho máximo do campo)")
 /**
   * Se aplica apenas ao tipo de dado REAL e indica o número de casas decimais.<br/>Valor mínimo:    1<br/>Valor máximo:   18 (incluindo o tamanho máximo do campo)
  **/
  private Integer casasDecimais = null;

  @XmlElement(name="dominios")
  @ApiModelProperty(value = "Para o tipo de dado LISTA indica os valores de domínio possíveis para a palavra-chave.")
  @Valid
 /**
   * Para o tipo de dado LISTA indica os valores de domínio possíveis para a palavra-chave.
  **/
  private List<Dominio> dominios = null;

  @XmlElement(name="idPalavraChave", required = true)
  @ApiModelProperty(example = "597", required = true, value = "Id da palavra-chave.<br/>Valor mínimo: 1<br/>Valor máximo: 2147483647")
 /**
   * Id da palavra-chave.<br/>Valor mínimo: 1<br/>Valor máximo: 2147483647
  **/
  private Integer idPalavraChave = null;

  @XmlElement(name="mascara")
  @ApiModelProperty(example = "99.999.999/9999-99", value = "Máscara para formatação do valor da palavra-chave do tipo de dado TEXTO.<br/>Tamanho máximo: valor definido em tamanhoCampo<br/>A máscara pode ser composta com os seguintes caracteres:<br/>9 - pode ser substituído por número de 0 a 9<br/>a - pode ser substituído somente letras de A a Z<br/>\\* - pode ser substituído por números de 0 a 9 ou letras de A a Z<br/>? - a partir de sua posição os caracteres não são obrigatórios<br/>Exemplos:<br/>CNPJ: 99.999.999/9999-99<br/>CPF: 999.999.999-99<br/>Código: 9?99999 - 0 a 999999<br/>Código: 999999 - 00000 a 999999<br/>NCM: 99.99.9999<br/>conta corrente: 999.999-a - 000.000-a a 999.999-z<br/>conta corrente: 999.999-* - 000.000-0 a 999.999-z<br/>telefone: (99) 9999-9999?9")
 /**
   * Máscara para formatação do valor da palavra-chave do tipo de dado TEXTO.<br/>Tamanho máximo: valor definido em tamanhoCampo<br/>A máscara pode ser composta com os seguintes caracteres:<br/>9 - pode ser substituído por número de 0 a 9<br/>a - pode ser substituído somente letras de A a Z<br/>\\* - pode ser substituído por números de 0 a 9 ou letras de A a Z<br/>? - a partir de sua posição os caracteres não são obrigatórios<br/>Exemplos:<br/>CNPJ: 99.999.999/9999-99<br/>CPF: 999.999.999-99<br/>Código: 9?99999 - 0 a 999999<br/>Código: 999999 - 00000 a 999999<br/>NCM: 99.99.9999<br/>conta corrente: 999.999-a - 000.000-a a 999.999-z<br/>conta corrente: 999.999-* - 000.000-0 a 999.999-z<br/>telefone: (99) 9999-9999?9
  **/
  private String mascara = null;

  @XmlElement(name="nomePalavraChave", required = true)
  @ApiModelProperty(example = "Valor R$", required = true, value = "Nome da palavra-chave.")
 /**
   * Nome da palavra-chave.
  **/
  private String nomePalavraChave = null;

  @XmlElement(name="obrigatoria", required = true)
  @ApiModelProperty(example = "true", required = true, value = "Indica se esta palavra-chave tem seu uso obrigatório para o tipo de documento.")
 /**
   * Indica se esta palavra-chave tem seu uso obrigatório para o tipo de documento.
  **/
  private Boolean obrigatoria = false;

  @XmlElement(name="tamanhoCampo", required = true)
  @ApiModelProperty(example = "14", required = true, value = "Tamanho máximo da palavra-chave.<br/>Valor mínimo NUMERO_INTEIRO:       1<br/>Valor máximo NUMERO_INTEIRO:      18<br/>Valor mínimo NUMERO_REAL:          1<br/>Valor máximo NUMERO_REAL:         18 (incluindo o tamanho das casas decimais)<br/>Valor mínimo TEXTO:         1<br/>Valor máximo TEXTO:       255")
 /**
   * Tamanho máximo da palavra-chave.<br/>Valor mínimo NUMERO_INTEIRO:       1<br/>Valor máximo NUMERO_INTEIRO:      18<br/>Valor mínimo NUMERO_REAL:          1<br/>Valor máximo NUMERO_REAL:         18 (incluindo o tamanho das casas decimais)<br/>Valor mínimo TEXTO:         1<br/>Valor máximo TEXTO:       255
  **/
  private Integer tamanhoCampo = null;


@XmlType(name="TipoDadoEnum")
@XmlEnum(String.class)
public enum TipoDadoEnum {

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
	
	@XmlEnumValue("LISTA")
	@JsonProperty("LISTA")
	LISTA(String.valueOf("LISTA")),
	
	@XmlEnumValue("TEXTO")
	@JsonProperty("TEXTO")
	TEXTO(String.valueOf("TEXTO"));


    private String value;

    TipoDadoEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TipoDadoEnum fromValue(String v) {
        for (TipoDadoEnum b : TipoDadoEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to TipoDadoEnum");
    }
}

  @XmlElement(name="tipoDado", required = true)
  @ApiModelProperty(example = "NUMERO_REAL", required = true, value = "Tipo de dado da palavra-chave.<br/>DATA, DATA_HORA, NUMERO_INTEIRO, NUMERO_REAL, LISTA, TEXTO<br/>Formato TEXTO: conforme máscara definida para a palavra-chave<br/>Formato DATA: dd/MM/yyyy ou yyyy-MM-dd<br/>&emsp;&emsp;Exemplos: 15/02/2021 ou 2021-02-15<br/>Formato DATA_HORA: dd/MM/yyyy HH:mm:ss ou formato ISO 8601 yyyy-MM-dd'T'HH:mm:ss.SSSz<br/>&emsp;&emsp;Exemplos: 15/02/2021 15:48:25, 2021-02-15T15:48:25 ou 2019-05-03T15:38:11.855BRT<br/>Formato NUMERO_INTEIRO: 99.999 (com ou sem ponto como separador de milhar)<br/>&emsp;&emsp;Exemplos: 1234 ou 1.234<br/>Formato NUMERO_REAL: 99.999,99 (pode ser enviado em três formatos diferentes:<br/>&emsp;&emsp;1) com ponto como separador de milhar e vírgula como separador decimal;<br/>&emsp;&emsp;2) apenas vírgula como separador decimal, sem separador de milhar; ou<br/>&emsp;&emsp;3) apenas ponto como separador decimal, sem separador de milhar)<br/>&emsp;&emsp;Exemplos: 1.234.478,65 ou 1234478.65 ou 1234478,65<br/>")
 /**
   * Tipo de dado da palavra-chave.<br/>DATA, DATA_HORA, NUMERO_INTEIRO, NUMERO_REAL, LISTA, TEXTO<br/>Formato TEXTO: conforme máscara definida para a palavra-chave<br/>Formato DATA: dd/MM/yyyy ou yyyy-MM-dd<br/>&emsp;&emsp;Exemplos: 15/02/2021 ou 2021-02-15<br/>Formato DATA_HORA: dd/MM/yyyy HH:mm:ss ou formato ISO 8601 yyyy-MM-dd'T'HH:mm:ss.SSSz<br/>&emsp;&emsp;Exemplos: 15/02/2021 15:48:25, 2021-02-15T15:48:25 ou 2019-05-03T15:38:11.855BRT<br/>Formato NUMERO_INTEIRO: 99.999 (com ou sem ponto como separador de milhar)<br/>&emsp;&emsp;Exemplos: 1234 ou 1.234<br/>Formato NUMERO_REAL: 99.999,99 (pode ser enviado em três formatos diferentes:<br/>&emsp;&emsp;1) com ponto como separador de milhar e vírgula como separador decimal;<br/>&emsp;&emsp;2) apenas vírgula como separador decimal, sem separador de milhar; ou<br/>&emsp;&emsp;3) apenas ponto como separador decimal, sem separador de milhar)<br/>&emsp;&emsp;Exemplos: 1.234.478,65 ou 1234478.65 ou 1234478,65<br/>
  **/
  private TipoDadoEnum tipoDado = null;
 /**
   * Se aplica apenas ao tipo de dado REAL e indica o número de casas decimais.&lt;br/&gt;Valor mínimo:    1&lt;br/&gt;Valor máximo:   18 (incluindo o tamanho máximo do campo)
   * @return casasDecimais
  **/
  @JsonProperty("casasDecimais")
  public Integer getCasasDecimais() {
    return casasDecimais;
  }

  public void setCasasDecimais(Integer casasDecimais) {
    this.casasDecimais = casasDecimais;
  }

  public PalavraChave casasDecimais(Integer casasDecimais) {
    this.casasDecimais = casasDecimais;
    return this;
  }

 /**
   * Para o tipo de dado LISTA indica os valores de domínio possíveis para a palavra-chave.
   * @return dominios
  **/
  @JsonProperty("dominios")
  public List<Dominio> getDominios() {
    return dominios;
  }

  public void setDominios(List<Dominio> dominios) {
    this.dominios = dominios;
  }

  public PalavraChave dominios(List<Dominio> dominios) {
    this.dominios = dominios;
    return this;
  }

  public PalavraChave addDominiosItem(Dominio dominiosItem) {
    this.dominios.add(dominiosItem);
    return this;
  }

 /**
   * Id da palavra-chave.&lt;br/&gt;Valor mínimo: 1&lt;br/&gt;Valor máximo: 2147483647
   * @return idPalavraChave
  **/
  @JsonProperty("idPalavraChave")
  @NotNull
  public Integer getIdPalavraChave() {
    return idPalavraChave;
  }

  public void setIdPalavraChave(Integer idPalavraChave) {
    this.idPalavraChave = idPalavraChave;
  }

  public PalavraChave idPalavraChave(Integer idPalavraChave) {
    this.idPalavraChave = idPalavraChave;
    return this;
  }

 /**
   * Máscara para formatação do valor da palavra-chave do tipo de dado TEXTO.&lt;br/&gt;Tamanho máximo: valor definido em tamanhoCampo&lt;br/&gt;A máscara pode ser composta com os seguintes caracteres:&lt;br/&gt;9 - pode ser substituído por número de 0 a 9&lt;br/&gt;a - pode ser substituído somente letras de A a Z&lt;br/&gt;\\* - pode ser substituído por números de 0 a 9 ou letras de A a Z&lt;br/&gt;? - a partir de sua posição os caracteres não são obrigatórios&lt;br/&gt;Exemplos:&lt;br/&gt;CNPJ: 99.999.999/9999-99&lt;br/&gt;CPF: 999.999.999-99&lt;br/&gt;Código: 9?99999 - 0 a 999999&lt;br/&gt;Código: 999999 - 00000 a 999999&lt;br/&gt;NCM: 99.99.9999&lt;br/&gt;conta corrente: 999.999-a - 000.000-a a 999.999-z&lt;br/&gt;conta corrente: 999.999-* - 000.000-0 a 999.999-z&lt;br/&gt;telefone: (99) 9999-9999?9
   * @return mascara
  **/
  @JsonProperty("mascara")
  public String getMascara() {
    return mascara;
  }

  public void setMascara(String mascara) {
    this.mascara = mascara;
  }

  public PalavraChave mascara(String mascara) {
    this.mascara = mascara;
    return this;
  }

 /**
   * Nome da palavra-chave.
   * @return nomePalavraChave
  **/
  @JsonProperty("nomePalavraChave")
  @NotNull
  public String getNomePalavraChave() {
    return nomePalavraChave;
  }

  public void setNomePalavraChave(String nomePalavraChave) {
    this.nomePalavraChave = nomePalavraChave;
  }

  public PalavraChave nomePalavraChave(String nomePalavraChave) {
    this.nomePalavraChave = nomePalavraChave;
    return this;
  }

 /**
   * Indica se esta palavra-chave tem seu uso obrigatório para o tipo de documento.
   * @return obrigatoria
  **/
  @JsonProperty("obrigatoria")
  @NotNull
  public Boolean isObrigatoria() {
    return obrigatoria;
  }

  public void setObrigatoria(Boolean obrigatoria) {
    this.obrigatoria = obrigatoria;
  }

  public PalavraChave obrigatoria(Boolean obrigatoria) {
    this.obrigatoria = obrigatoria;
    return this;
  }

 /**
   * Tamanho máximo da palavra-chave.&lt;br/&gt;Valor mínimo NUMERO_INTEIRO:       1&lt;br/&gt;Valor máximo NUMERO_INTEIRO:      18&lt;br/&gt;Valor mínimo NUMERO_REAL:          1&lt;br/&gt;Valor máximo NUMERO_REAL:         18 (incluindo o tamanho das casas decimais)&lt;br/&gt;Valor mínimo TEXTO:         1&lt;br/&gt;Valor máximo TEXTO:       255
   * @return tamanhoCampo
  **/
  @JsonProperty("tamanhoCampo")
  @NotNull
  public Integer getTamanhoCampo() {
    return tamanhoCampo;
  }

  public void setTamanhoCampo(Integer tamanhoCampo) {
    this.tamanhoCampo = tamanhoCampo;
  }

  public PalavraChave tamanhoCampo(Integer tamanhoCampo) {
    this.tamanhoCampo = tamanhoCampo;
    return this;
  }

 /**
   * Tipo de dado da palavra-chave.&lt;br/&gt;DATA, DATA_HORA, NUMERO_INTEIRO, NUMERO_REAL, LISTA, TEXTO&lt;br/&gt;Formato TEXTO: conforme máscara definida para a palavra-chave&lt;br/&gt;Formato DATA: dd/MM/yyyy ou yyyy-MM-dd&lt;br/&gt;&amp;emsp;&amp;emsp;Exemplos: 15/02/2021 ou 2021-02-15&lt;br/&gt;Formato DATA_HORA: dd/MM/yyyy HH:mm:ss ou formato ISO 8601 yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSz&lt;br/&gt;&amp;emsp;&amp;emsp;Exemplos: 15/02/2021 15:48:25, 2021-02-15T15:48:25 ou 2019-05-03T15:38:11.855BRT&lt;br/&gt;Formato NUMERO_INTEIRO: 99.999 (com ou sem ponto como separador de milhar)&lt;br/&gt;&amp;emsp;&amp;emsp;Exemplos: 1234 ou 1.234&lt;br/&gt;Formato NUMERO_REAL: 99.999,99 (pode ser enviado em três formatos diferentes:&lt;br/&gt;&amp;emsp;&amp;emsp;1) com ponto como separador de milhar e vírgula como separador decimal;&lt;br/&gt;&amp;emsp;&amp;emsp;2) apenas vírgula como separador decimal, sem separador de milhar; ou&lt;br/&gt;&amp;emsp;&amp;emsp;3) apenas ponto como separador decimal, sem separador de milhar)&lt;br/&gt;&amp;emsp;&amp;emsp;Exemplos: 1.234.478,65 ou 1234478.65 ou 1234478,65&lt;br/&gt;
   * @return tipoDado
  **/
  @JsonProperty("tipoDado")
  @NotNull
  public String getTipoDado() {
    if (tipoDado == null) {
      return null;
    }
    return tipoDado.value();
  }

  public void setTipoDado(TipoDadoEnum tipoDado) {
    this.tipoDado = tipoDado;
  }

  public PalavraChave tipoDado(TipoDadoEnum tipoDado) {
    this.tipoDado = tipoDado;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PalavraChave {\n");
    
    sb.append("    casasDecimais: ").append(toIndentedString(casasDecimais)).append("\n");
    sb.append("    dominios: ").append(toIndentedString(dominios)).append("\n");
    sb.append("    idPalavraChave: ").append(toIndentedString(idPalavraChave)).append("\n");
    sb.append("    mascara: ").append(toIndentedString(mascara)).append("\n");
    sb.append("    nomePalavraChave: ").append(toIndentedString(nomePalavraChave)).append("\n");
    sb.append("    obrigatoria: ").append(toIndentedString(obrigatoria)).append("\n");
    sb.append("    tamanhoCampo: ").append(toIndentedString(tamanhoCampo)).append("\n");
    sb.append("    tipoDado: ").append(toIndentedString(tipoDado)).append("\n");
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

