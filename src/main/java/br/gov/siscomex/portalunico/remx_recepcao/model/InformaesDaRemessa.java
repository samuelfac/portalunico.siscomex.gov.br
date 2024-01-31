package br.gov.siscomex.portalunico.remx_recepcao.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "InformaesDaRemessa", propOrder =
    { "indicadorOver", "infoFiscalizacao", "numeroMaster", "numeroRemessa", "pesoRemessa", "tratamentoAdm", "volumesRecebidos", "volumesRemessa"
})

@XmlRootElement(name="InformaesDaRemessa")
public class InformaesDaRemessa  {
  
  @XmlElement(name="indicadorOver", required = true)
  @ApiModelProperty(required = true, value = "Contém um indicador para sinalizar uma remessa over.  <br/>Domínio:<br/>0 - Remessa manifestada<br/>1 - Remessa Over (apenas para remessa expressa).")
 /**
   * Contém um indicador para sinalizar uma remessa over.  <br/>Domínio:<br/>0 - Remessa manifestada<br/>1 - Remessa Over (apenas para remessa expressa).
  **/
  private Object indicadorOver = null;

  @XmlElement(name="infoFiscalizacao")
  @ApiModelProperty(value = "Conterá informações de fiscalização. Obs.: pode ser informado quando do registro/retificação da DIR. Máximo de 500 caracteres, que podem ser letras, números, além de quaisquer caracteres referentes a codificação UTF-8.")
 /**
   * Conterá informações de fiscalização. Obs.: pode ser informado quando do registro/retificação da DIR. Máximo de 500 caracteres, que podem ser letras, números, além de quaisquer caracteres referentes a codificação UTF-8.
  **/
  private String infoFiscalizacao = null;

  @XmlElement(name="numeroMaster", required = true)
  @ApiModelProperty(required = true, value = "Contém o número do Master (11 caracteres numéricos) ou o número da Mala Postal (29 caracteres alfanuméricos).")
 /**
   * Contém o número do Master (11 caracteres numéricos) ou o número da Mala Postal (29 caracteres alfanuméricos).
  **/
  private String numeroMaster = null;

  @XmlElement(name="numeroRemessa", required = true)
  @ApiModelProperty(required = true, value = "Contém o número da remessa identificado na presença de carga (Informado pelo operador). Máximo de dezoito caracteres alfanuméricos.")
 /**
   * Contém o número da remessa identificado na presença de carga (Informado pelo operador). Máximo de dezoito caracteres alfanuméricos.
  **/
  private String numeroRemessa = null;

  @XmlElement(name="pesoRemessa")
  @ApiModelProperty(value = "Contém o peso em Kg da remessa. Número fracionário aceitando até 10 dígitos antes do ponto e 2 dígitos após")
 /**
   * Contém o peso em Kg da remessa. Número fracionário aceitando até 10 dígitos antes do ponto e 2 dígitos após
  **/
  private Object pesoRemessa = null;

  @XmlElement(name="tratamentoAdm")
  @ApiModelProperty(value = "Especifica se a mercadoria necessita de tratamento administrativo, encaminhando a mesma para seleção do órgão desejado.<br/>1- Fiscalização ANVISA<br/>2 - Fiscalização VIGIAGRO/MAPA<br/>3 - Fiscalização RFB<br/>4 - Fiscalização VIGIAGRO/MAPA e Anvisa<br/>5 - Fiscalização VIGIAGRO/MAPA e RFB<br/>6 - Fiscalização Anvisa e RFB<br/>7 - Fiscalização VIGIAGRO/MAPA, Anvisa e RFB<br/>8 - Fiscalização IBAMA<br/>9 - Fiscalização IBAMA e ANVISA<br/>10 - Fiscalização IBAMA e VIGIAGRO/MAPA<br/>11 - Fiscalização IBAMA e RFB<br/>12 - Fiscalização IBAMA, VIGIAGRO/MAPA e ANVISA<br/>13 - Fiscalização IBAMA, VIGIAGRO/MAPA e RFB<br/>14 - Fiscalização IBAMA, ANVISA e RFB<br/>15 - Fiscalização IBAMA, ANVISA, VIGIAGRO/MAPA e RFB")
 /**
   * Especifica se a mercadoria necessita de tratamento administrativo, encaminhando a mesma para seleção do órgão desejado.<br/>1- Fiscalização ANVISA<br/>2 - Fiscalização VIGIAGRO/MAPA<br/>3 - Fiscalização RFB<br/>4 - Fiscalização VIGIAGRO/MAPA e Anvisa<br/>5 - Fiscalização VIGIAGRO/MAPA e RFB<br/>6 - Fiscalização Anvisa e RFB<br/>7 - Fiscalização VIGIAGRO/MAPA, Anvisa e RFB<br/>8 - Fiscalização IBAMA<br/>9 - Fiscalização IBAMA e ANVISA<br/>10 - Fiscalização IBAMA e VIGIAGRO/MAPA<br/>11 - Fiscalização IBAMA e RFB<br/>12 - Fiscalização IBAMA, VIGIAGRO/MAPA e ANVISA<br/>13 - Fiscalização IBAMA, VIGIAGRO/MAPA e RFB<br/>14 - Fiscalização IBAMA, ANVISA e RFB<br/>15 - Fiscalização IBAMA, ANVISA, VIGIAGRO/MAPA e RFB
  **/
  private Integer tratamentoAdm = null;

  @XmlElement(name="volumesRecebidos", required = true)
  @ApiModelProperty(required = true, value = "Contém a quantidade de volumes recebidos na remessa. Máximo de 4 caracteres numéricos (0 até 9999).")
 /**
   * Contém a quantidade de volumes recebidos na remessa. Máximo de 4 caracteres numéricos (0 até 9999).
  **/
  private Integer volumesRecebidos = null;

  @XmlElement(name="volumesRemessa")
  @ApiModelProperty(value = "Contém a quantidade de volumes da remessa. Para remessas over é a quantidade de volumes informados na primeira presença de carga.  Máximo de 4 caracteres numéricos (1 até 9999). ")
 /**
   * Contém a quantidade de volumes da remessa. Para remessas over é a quantidade de volumes informados na primeira presença de carga.  Máximo de 4 caracteres numéricos (1 até 9999). 
  **/
  private Object volumesRemessa = null;
 /**
   * Contém um indicador para sinalizar uma remessa over.  &lt;br/&gt;Domínio:&lt;br/&gt;0 - Remessa manifestada&lt;br/&gt;1 - Remessa Over (apenas para remessa expressa).
   * @return indicadorOver
  **/
  @JsonProperty("indicadorOver")
  @NotNull
  public Object getIndicadorOver() {
    return indicadorOver;
  }

  public void setIndicadorOver(Object indicadorOver) {
    this.indicadorOver = indicadorOver;
  }

  public InformaesDaRemessa indicadorOver(Object indicadorOver) {
    this.indicadorOver = indicadorOver;
    return this;
  }

 /**
   * Conterá informações de fiscalização. Obs.: pode ser informado quando do registro/retificação da DIR. Máximo de 500 caracteres, que podem ser letras, números, além de quaisquer caracteres referentes a codificação UTF-8.
   * @return infoFiscalizacao
  **/
  @JsonProperty("infoFiscalizacao")
  public String getInfoFiscalizacao() {
    return infoFiscalizacao;
  }

  public void setInfoFiscalizacao(String infoFiscalizacao) {
    this.infoFiscalizacao = infoFiscalizacao;
  }

  public InformaesDaRemessa infoFiscalizacao(String infoFiscalizacao) {
    this.infoFiscalizacao = infoFiscalizacao;
    return this;
  }

 /**
   * Contém o número do Master (11 caracteres numéricos) ou o número da Mala Postal (29 caracteres alfanuméricos).
   * @return numeroMaster
  **/
  @JsonProperty("numeroMaster")
  @NotNull
  public String getNumeroMaster() {
    return numeroMaster;
  }

  public void setNumeroMaster(String numeroMaster) {
    this.numeroMaster = numeroMaster;
  }

  public InformaesDaRemessa numeroMaster(String numeroMaster) {
    this.numeroMaster = numeroMaster;
    return this;
  }

 /**
   * Contém o número da remessa identificado na presença de carga (Informado pelo operador). Máximo de dezoito caracteres alfanuméricos.
   * @return numeroRemessa
  **/
  @JsonProperty("numeroRemessa")
  @NotNull
  public String getNumeroRemessa() {
    return numeroRemessa;
  }

  public void setNumeroRemessa(String numeroRemessa) {
    this.numeroRemessa = numeroRemessa;
  }

  public InformaesDaRemessa numeroRemessa(String numeroRemessa) {
    this.numeroRemessa = numeroRemessa;
    return this;
  }

 /**
   * Contém o peso em Kg da remessa. Número fracionário aceitando até 10 dígitos antes do ponto e 2 dígitos após
   * @return pesoRemessa
  **/
  @JsonProperty("pesoRemessa")
  public Object getPesoRemessa() {
    return pesoRemessa;
  }

  public void setPesoRemessa(Object pesoRemessa) {
    this.pesoRemessa = pesoRemessa;
  }

  public InformaesDaRemessa pesoRemessa(Object pesoRemessa) {
    this.pesoRemessa = pesoRemessa;
    return this;
  }

 /**
   * Especifica se a mercadoria necessita de tratamento administrativo, encaminhando a mesma para seleção do órgão desejado.&lt;br/&gt;1- Fiscalização ANVISA&lt;br/&gt;2 - Fiscalização VIGIAGRO/MAPA&lt;br/&gt;3 - Fiscalização RFB&lt;br/&gt;4 - Fiscalização VIGIAGRO/MAPA e Anvisa&lt;br/&gt;5 - Fiscalização VIGIAGRO/MAPA e RFB&lt;br/&gt;6 - Fiscalização Anvisa e RFB&lt;br/&gt;7 - Fiscalização VIGIAGRO/MAPA, Anvisa e RFB&lt;br/&gt;8 - Fiscalização IBAMA&lt;br/&gt;9 - Fiscalização IBAMA e ANVISA&lt;br/&gt;10 - Fiscalização IBAMA e VIGIAGRO/MAPA&lt;br/&gt;11 - Fiscalização IBAMA e RFB&lt;br/&gt;12 - Fiscalização IBAMA, VIGIAGRO/MAPA e ANVISA&lt;br/&gt;13 - Fiscalização IBAMA, VIGIAGRO/MAPA e RFB&lt;br/&gt;14 - Fiscalização IBAMA, ANVISA e RFB&lt;br/&gt;15 - Fiscalização IBAMA, ANVISA, VIGIAGRO/MAPA e RFB
   * @return tratamentoAdm
  **/
  @JsonProperty("tratamentoAdm")
  public Integer getTratamentoAdm() {
    return tratamentoAdm;
  }

  public void setTratamentoAdm(Integer tratamentoAdm) {
    this.tratamentoAdm = tratamentoAdm;
  }

  public InformaesDaRemessa tratamentoAdm(Integer tratamentoAdm) {
    this.tratamentoAdm = tratamentoAdm;
    return this;
  }

 /**
   * Contém a quantidade de volumes recebidos na remessa. Máximo de 4 caracteres numéricos (0 até 9999).
   * @return volumesRecebidos
  **/
  @JsonProperty("volumesRecebidos")
  @NotNull
  public Integer getVolumesRecebidos() {
    return volumesRecebidos;
  }

  public void setVolumesRecebidos(Integer volumesRecebidos) {
    this.volumesRecebidos = volumesRecebidos;
  }

  public InformaesDaRemessa volumesRecebidos(Integer volumesRecebidos) {
    this.volumesRecebidos = volumesRecebidos;
    return this;
  }

 /**
   * Contém a quantidade de volumes da remessa. Para remessas over é a quantidade de volumes informados na primeira presença de carga.  Máximo de 4 caracteres numéricos (1 até 9999). 
   * @return volumesRemessa
  **/
  @JsonProperty("volumesRemessa")
  public Object getVolumesRemessa() {
    return volumesRemessa;
  }

  public void setVolumesRemessa(Object volumesRemessa) {
    this.volumesRemessa = volumesRemessa;
  }

  public InformaesDaRemessa volumesRemessa(Object volumesRemessa) {
    this.volumesRemessa = volumesRemessa;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InformaesDaRemessa {\n");
    
    sb.append("    indicadorOver: ").append(toIndentedString(indicadorOver)).append("\n");
    sb.append("    infoFiscalizacao: ").append(toIndentedString(infoFiscalizacao)).append("\n");
    sb.append("    numeroMaster: ").append(toIndentedString(numeroMaster)).append("\n");
    sb.append("    numeroRemessa: ").append(toIndentedString(numeroRemessa)).append("\n");
    sb.append("    pesoRemessa: ").append(toIndentedString(pesoRemessa)).append("\n");
    sb.append("    tratamentoAdm: ").append(toIndentedString(tratamentoAdm)).append("\n");
    sb.append("    volumesRecebidos: ").append(toIndentedString(volumesRecebidos)).append("\n");
    sb.append("    volumesRemessa: ").append(toIndentedString(volumesRemessa)).append("\n");
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

