package br.gov.siscomex.portalunico.cct_ext.model;

import br.gov.siscomex.portalunico.cct_ext.model.Conteiner;
import br.gov.siscomex.portalunico.cct_ext.model.Local;
import br.gov.siscomex.portalunico.cct_ext.model.Recebedor;
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
 @XmlType(name = "EntregaConteiner", propOrder =
    { "identificacaoEntrega", "identificacaoPessoaJuridica", "identificacaoPessoaFisica", "local", "conteineres", "recebedor", "avariasIdentificadas", "divergenciasIdentificadas", "observacoesGerais"
})

@XmlRootElement(name="EntregaConteiner")
/**
  * Entrega por Contêiner
 **/
@ApiModel(description="Entrega por Contêiner")
public class EntregaConteiner  {
  
  @XmlElement(name="identificacaoEntrega", required = true)
  @ApiModelProperty(example = "611504718", required = true, value = "Identificação da entrega<br>Esta informação não será armazenada pelo sistema, servindo apenas como uma identificação de cada recepção no momento da exibição de eventuais mensagens de erro. Este campo não admite duplicatas<br>Tamanho: 50")
 /**
   * Identificação da entrega<br>Esta informação não será armazenada pelo sistema, servindo apenas como uma identificação de cada recepção no momento da exibição de eventuais mensagens de erro. Este campo não admite duplicatas<br>Tamanho: 50
  **/
  private String identificacaoEntrega = null;

  @XmlElement(name="identificacaoPessoaJuridica", required = true)
  @ApiModelProperty(example = "07396865000168", required = true, value = "CNPJ do responsável pela entrega<br>Tamanho: 14<br>Formato: NNNNNNNNNNNNNN")
 /**
   * CNPJ do responsável pela entrega<br>Tamanho: 14<br>Formato: NNNNNNNNNNNNNN
  **/
  private String identificacaoPessoaJuridica = null;

  @XmlElement(name="identificacaoPessoaFisica", required = true)
  @ApiModelProperty(example = "15573459106", required = true, value = "CPF do responsável pela recepção<br>Tamanho: 11<br>Formato: NNNNNNNNNNN")
 /**
   * CPF do responsável pela recepção<br>Tamanho: 11<br>Formato: NNNNNNNNNNN
  **/
  private String identificacaoPessoaFisica = null;

  @XmlElement(name="local", required = true)
  @ApiModelProperty(required = true, value = "")
  @Valid
  private Local local = null;

  @XmlElement(name="conteineres", required = true)
  @ApiModelProperty(required = true, value = "Lista dos contêineres a serem entregues")
  @Valid
 /**
   * Lista dos contêineres a serem entregues
  **/
  private List<Conteiner> conteineres = new ArrayList<>();

  @XmlElement(name="recebedor", required = true)
  @ApiModelProperty(required = true, value = "")
  @Valid
  private Recebedor recebedor = null;

  @XmlElement(name="avariasIdentificadas")
  @ApiModelProperty(example = "quebrado", value = "Avarias identificadas<br>Tamanho: 250")
 /**
   * Avarias identificadas<br>Tamanho: 250
  **/
  private String avariasIdentificadas = null;

  @XmlElement(name="divergenciasIdentificadas")
  @ApiModelProperty(example = "faltando um lacre", value = "Divergências identificadas<br>Tamanho: 250")
 /**
   * Divergências identificadas<br>Tamanho: 250
  **/
  private String divergenciasIdentificadas = null;

  @XmlElement(name="observacoesGerais")
  @ApiModelProperty(example = "contém medicamentos", value = "Observações adicionais<br>Tamanho: 250")
 /**
   * Observações adicionais<br>Tamanho: 250
  **/
  private String observacoesGerais = null;
 /**
   * Identificação da entrega&lt;br&gt;Esta informação não será armazenada pelo sistema, servindo apenas como uma identificação de cada recepção no momento da exibição de eventuais mensagens de erro. Este campo não admite duplicatas&lt;br&gt;Tamanho: 50
   * @return identificacaoEntrega
  **/
  @JsonProperty("identificacaoEntrega")
  @NotNull
  public String getIdentificacaoEntrega() {
    return identificacaoEntrega;
  }

  public void setIdentificacaoEntrega(String identificacaoEntrega) {
    this.identificacaoEntrega = identificacaoEntrega;
  }

  public EntregaConteiner identificacaoEntrega(String identificacaoEntrega) {
    this.identificacaoEntrega = identificacaoEntrega;
    return this;
  }

 /**
   * CNPJ do responsável pela entrega&lt;br&gt;Tamanho: 14&lt;br&gt;Formato: NNNNNNNNNNNNNN
   * @return identificacaoPessoaJuridica
  **/
  @JsonProperty("identificacaoPessoaJuridica")
  @NotNull
  public String getIdentificacaoPessoaJuridica() {
    return identificacaoPessoaJuridica;
  }

  public void setIdentificacaoPessoaJuridica(String identificacaoPessoaJuridica) {
    this.identificacaoPessoaJuridica = identificacaoPessoaJuridica;
  }

  public EntregaConteiner identificacaoPessoaJuridica(String identificacaoPessoaJuridica) {
    this.identificacaoPessoaJuridica = identificacaoPessoaJuridica;
    return this;
  }

 /**
   * CPF do responsável pela recepção&lt;br&gt;Tamanho: 11&lt;br&gt;Formato: NNNNNNNNNNN
   * @return identificacaoPessoaFisica
  **/
  @JsonProperty("identificacaoPessoaFisica")
  @NotNull
  public String getIdentificacaoPessoaFisica() {
    return identificacaoPessoaFisica;
  }

  public void setIdentificacaoPessoaFisica(String identificacaoPessoaFisica) {
    this.identificacaoPessoaFisica = identificacaoPessoaFisica;
  }

  public EntregaConteiner identificacaoPessoaFisica(String identificacaoPessoaFisica) {
    this.identificacaoPessoaFisica = identificacaoPessoaFisica;
    return this;
  }

 /**
   * Get local
   * @return local
  **/
  @JsonProperty("local")
  @NotNull
  public Local getLocal() {
    return local;
  }

  public void setLocal(Local local) {
    this.local = local;
  }

  public EntregaConteiner local(Local local) {
    this.local = local;
    return this;
  }

 /**
   * Lista dos contêineres a serem entregues
   * @return conteineres
  **/
  @JsonProperty("conteineres")
  @NotNull
  public List<Conteiner> getConteineres() {
    return conteineres;
  }

  public void setConteineres(List<Conteiner> conteineres) {
    this.conteineres = conteineres;
  }

  public EntregaConteiner conteineres(List<Conteiner> conteineres) {
    this.conteineres = conteineres;
    return this;
  }

  public EntregaConteiner addConteineresItem(Conteiner conteineresItem) {
    this.conteineres.add(conteineresItem);
    return this;
  }

 /**
   * Get recebedor
   * @return recebedor
  **/
  @JsonProperty("recebedor")
  @NotNull
  public Recebedor getRecebedor() {
    return recebedor;
  }

  public void setRecebedor(Recebedor recebedor) {
    this.recebedor = recebedor;
  }

  public EntregaConteiner recebedor(Recebedor recebedor) {
    this.recebedor = recebedor;
    return this;
  }

 /**
   * Avarias identificadas&lt;br&gt;Tamanho: 250
   * @return avariasIdentificadas
  **/
  @JsonProperty("avariasIdentificadas")
  public String getAvariasIdentificadas() {
    return avariasIdentificadas;
  }

  public void setAvariasIdentificadas(String avariasIdentificadas) {
    this.avariasIdentificadas = avariasIdentificadas;
  }

  public EntregaConteiner avariasIdentificadas(String avariasIdentificadas) {
    this.avariasIdentificadas = avariasIdentificadas;
    return this;
  }

 /**
   * Divergências identificadas&lt;br&gt;Tamanho: 250
   * @return divergenciasIdentificadas
  **/
  @JsonProperty("divergenciasIdentificadas")
  public String getDivergenciasIdentificadas() {
    return divergenciasIdentificadas;
  }

  public void setDivergenciasIdentificadas(String divergenciasIdentificadas) {
    this.divergenciasIdentificadas = divergenciasIdentificadas;
  }

  public EntregaConteiner divergenciasIdentificadas(String divergenciasIdentificadas) {
    this.divergenciasIdentificadas = divergenciasIdentificadas;
    return this;
  }

 /**
   * Observações adicionais&lt;br&gt;Tamanho: 250
   * @return observacoesGerais
  **/
  @JsonProperty("observacoesGerais")
  public String getObservacoesGerais() {
    return observacoesGerais;
  }

  public void setObservacoesGerais(String observacoesGerais) {
    this.observacoesGerais = observacoesGerais;
  }

  public EntregaConteiner observacoesGerais(String observacoesGerais) {
    this.observacoesGerais = observacoesGerais;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntregaConteiner {\n");
    
    sb.append("    identificacaoEntrega: ").append(toIndentedString(identificacaoEntrega)).append("\n");
    sb.append("    identificacaoPessoaJuridica: ").append(toIndentedString(identificacaoPessoaJuridica)).append("\n");
    sb.append("    identificacaoPessoaFisica: ").append(toIndentedString(identificacaoPessoaFisica)).append("\n");
    sb.append("    local: ").append(toIndentedString(local)).append("\n");
    sb.append("    conteineres: ").append(toIndentedString(conteineres)).append("\n");
    sb.append("    recebedor: ").append(toIndentedString(recebedor)).append("\n");
    sb.append("    avariasIdentificadas: ").append(toIndentedString(avariasIdentificadas)).append("\n");
    sb.append("    divergenciasIdentificadas: ").append(toIndentedString(divergenciasIdentificadas)).append("\n");
    sb.append("    observacoesGerais: ").append(toIndentedString(observacoesGerais)).append("\n");
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

