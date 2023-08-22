package br.gov.siscomex.portalunico.rcnt.model;

import br.gov.siscomex.portalunico.rcnt.model.DadosContinerUldInspeoNoInvasiva;
import br.gov.siscomex.portalunico.rcnt.model.DadosDaCarga;
import br.gov.siscomex.portalunico.rcnt.model.DadosDaCmera;
import br.gov.siscomex.portalunico.rcnt.model.DadosDaNotaFiscalEmbarqueDesembarque;
import br.gov.siscomex.portalunico.rcnt.model.DadosDoManisfestoDaCarga;
import br.gov.siscomex.portalunico.rcnt.model.DadosImagemScanner;
import br.gov.siscomex.portalunico.rcnt.model.DadosSemirreboqueDaInspeoNoInvasiva;
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
 @XmlType(name = "DadosDaInspeoNoInvasiva", propOrder =
    { "tipoOperacao", "idEvento", "dataHoraOcorrencia", "dataHoraRegistro", "cpfOperadorOcorrencia", "cpfOperadorRegistro", "protocoloEventoRetificadoOuExcluido", "contingencia", "codigoRecinto", "listaManifestos", "listaNfe", "listaCarga", "listaSemirreboque", "listaConteineresUld", "vazio", "imagemScanner", "arquivoMetadados", "scanner", "listaCameras"
})

@XmlRootElement(name="DadosDaInspeoNoInvasiva")
public class DadosDaInspeoNoInvasiva  {
  

@XmlType(name="TipoOperacaoEnum")
@XmlEnum(String.class)
public enum TipoOperacaoEnum {

	@XmlEnumValue("'I'")
	@JsonProperty("'I'")
	I_(String.valueOf("'I'")),
	
	@XmlEnumValue("'R'")
	@JsonProperty("'R'")
	R_(String.valueOf("'R'")),
	
	@XmlEnumValue("'E'")
	@JsonProperty("'E'")
	E_(String.valueOf("'E'"));


    private String value;

    TipoOperacaoEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TipoOperacaoEnum fromValue(String v) {
        for (TipoOperacaoEnum b : TipoOperacaoEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to TipoOperacaoEnum");
    }
}

  @XmlElement(name="tipoOperacao", required = true)
  @ApiModelProperty(example = "I", required = true, value = "Indica se o evento transmitido é novo (incluir) ou retifica/exclui evento anterior.<br/>Domínio:<br/>I - Incluir<br/>R - Retificar<br/>E - Excluir")
 /**
   * Indica se o evento transmitido é novo (incluir) ou retifica/exclui evento anterior.<br/>Domínio:<br/>I - Incluir<br/>R - Retificar<br/>E - Excluir
  **/
  private TipoOperacaoEnum tipoOperacao = null;

  @XmlElement(name="idEvento", required = true)
  @ApiModelProperty(required = true, value = "Identificador único do evento que pode ser utilizado para recuperar as informações do Evento no sistema de origem do Recinto remetente. Ex.: Chave tabela 1 + ... + chave tabela n - tantas chaves quantas forem as tabelas necessárias para montar o registro do evento.<br/>Tamanho: 100")
 /**
   * Identificador único do evento que pode ser utilizado para recuperar as informações do Evento no sistema de origem do Recinto remetente. Ex.: Chave tabela 1 + ... + chave tabela n - tantas chaves quantas forem as tabelas necessárias para montar o registro do evento.<br/>Tamanho: 100
  **/
  private String idEvento = null;

  @XmlElement(name="dataHoraOcorrencia", required = true)
  @ApiModelProperty(example = "2020-04-01T10:50:30.150-0300", required = true, value = "Data e hora em que o evento ocorreu ou que se coletou, em formulário papel durante uma contingência, os dados do evento. Deve-se enviar, junto da data, o fuso horário no qual tal data e hora foi gerada.<br/>Formato: 'yyyy-MM-ddTHH:mm:ss.SSSZ'")
 /**
   * Data e hora em que o evento ocorreu ou que se coletou, em formulário papel durante uma contingência, os dados do evento. Deve-se enviar, junto da data, o fuso horário no qual tal data e hora foi gerada.<br/>Formato: 'yyyy-MM-ddTHH:mm:ss.SSSZ'
  **/
  private String dataHoraOcorrencia = null;

  @XmlElement(name="dataHoraRegistro", required = true)
  @ApiModelProperty(example = "2020-04-01T10:50:30.150-0300", required = true, value = "Data e hora em que se efetuou o lançamento, no sistema informatizado, seja em operações normais, seja das informações coletadas durante uma contingência. Deve-se enviar, junto da data, o fuso horário no qual tal data e hora foi gerada.<br/>Formato: 'yyyy-MM-ddTHH:mm:ss.SSSZ'")
 /**
   * Data e hora em que se efetuou o lançamento, no sistema informatizado, seja em operações normais, seja das informações coletadas durante uma contingência. Deve-se enviar, junto da data, o fuso horário no qual tal data e hora foi gerada.<br/>Formato: 'yyyy-MM-ddTHH:mm:ss.SSSZ'
  **/
  private String dataHoraRegistro = null;

  @XmlElement(name="cpfOperadorOcorrencia")
  @ApiModelProperty(example = "55555555555", value = "CPF da pessoa que coletou, em formulário papel durante uma contingência, os dados do evento.<br/>Pode ser nulo quando o processo for automatizado, com isso, não há operador de ocorrência e nem de registro.<br/>Tamanho: 11<br/>Formato: 'NNNNNNNNNNN'")
 /**
   * CPF da pessoa que coletou, em formulário papel durante uma contingência, os dados do evento.<br/>Pode ser nulo quando o processo for automatizado, com isso, não há operador de ocorrência e nem de registro.<br/>Tamanho: 11<br/>Formato: 'NNNNNNNNNNN'
  **/
  private String cpfOperadorOcorrencia = null;

  @XmlElement(name="cpfOperadorRegistro")
  @ApiModelProperty(example = "55555555555", value = "CPF da pessoa que efetuou o lançamento, no sistema informatizado, seja em operações normais, seja das informações coletadas durante uma contingência.<br>Pode ser nulo quando o processo for automatizado, com isso, não há operador de ocorrência e nem de registro.<br/>Tamanho: 11<br/>Formato: 'NNNNNNNNNNN'")
 /**
   * CPF da pessoa que efetuou o lançamento, no sistema informatizado, seja em operações normais, seja das informações coletadas durante uma contingência.<br>Pode ser nulo quando o processo for automatizado, com isso, não há operador de ocorrência e nem de registro.<br/>Tamanho: 11<br/>Formato: 'NNNNNNNNNNN'
  **/
  private String cpfOperadorRegistro = null;

  @XmlElement(name="protocoloEventoRetificadoOuExcluido")
  @ApiModelProperty(example = "66d24eb1-6ac9-4798-bc93-f4c66eb6fa9b", value = "Observar que no caso de evento retificador ou de exclusão, o protocolo do evento retificado ou excluído deve ser informado para possibilitar a correta vinculação. Usar protocolo recebido após o envio do evento original. O envio de eventos retificadores substitui completamente as informações prestadas no evento retificado.<br/>Tamanho: 36")
 /**
   * Observar que no caso de evento retificador ou de exclusão, o protocolo do evento retificado ou excluído deve ser informado para possibilitar a correta vinculação. Usar protocolo recebido após o envio do evento original. O envio de eventos retificadores substitui completamente as informações prestadas no evento retificado.<br/>Tamanho: 36
  **/
  private String protocoloEventoRetificadoOuExcluido = null;

  @XmlElement(name="contingencia", required = true)
  @ApiModelProperty(example = "false", required = true, value = "Indica que este evento ocorreu durante uma contingência. Via de regra deverá haver um evento (Ocorrências de indisponibilidade de equipamentos) para o equipamento envolvido. Transmitir como true sempre que ocorrer falha operacional no sistema do recinto que impeça o registro e/ou envio de informações em seu sistema.<br/>Domínio:<br/>true - Sim<br/>false - Não")
 /**
   * Indica que este evento ocorreu durante uma contingência. Via de regra deverá haver um evento (Ocorrências de indisponibilidade de equipamentos) para o equipamento envolvido. Transmitir como true sempre que ocorrer falha operacional no sistema do recinto que impeça o registro e/ou envio de informações em seu sistema.<br/>Domínio:<br/>true - Sim<br/>false - Não
  **/
  private Boolean contingencia = null;

  @XmlElement(name="codigoRecinto", required = true)
  @ApiModelProperty(example = "1111111", required = true, value = "Código Siscomex do recinto onde ocorreu o evento a ser transmitido.<br/>Tamanho: 15")
 /**
   * Código Siscomex do recinto onde ocorreu o evento a ser transmitido.<br/>Tamanho: 15
  **/
  private String codigoRecinto = null;

  @XmlElement(name="listaManifestos")
  @ApiModelProperty(value = "Lista de manifestos.")
  @Valid
 /**
   * Lista de manifestos.
  **/
  private List<DadosDoManisfestoDaCarga> listaManifestos = null;

  @XmlElement(name="listaNfe")
  @ApiModelProperty(value = "Lista de chaves das NFE que amparam o transporte.")
  @Valid
 /**
   * Lista de chaves das NFE que amparam o transporte.
  **/
  private List<DadosDaNotaFiscalEmbarqueDesembarque> listaNfe = null;

  @XmlElement(name="listaCarga")
  @ApiModelProperty(value = "Lista de identificadores de Carga.")
  @Valid
 /**
   * Lista de identificadores de Carga.
  **/
  private List<DadosDaCarga> listaCarga = null;

  @XmlElement(name="listaSemirreboque")
  @ApiModelProperty(value = "Lista de semirreboques ou vagões. No caso de caminhão truck informar a placa nessa estrutura.")
  @Valid
 /**
   * Lista de semirreboques ou vagões. No caso de caminhão truck informar a placa nessa estrutura.
  **/
  private List<DadosSemirreboqueDaInspeoNoInvasiva> listaSemirreboque = null;

  @XmlElement(name="listaConteineresUld")
  @ApiModelProperty(value = "Lista de contêineres ou ULD (Unit Load Device – Aéreo).")
  @Valid
 /**
   * Lista de contêineres ou ULD (Unit Load Device – Aéreo).
  **/
  private List<DadosContinerUldInspeoNoInvasiva> listaConteineresUld = null;

  @XmlElement(name="vazio")
  @ApiModelProperty(example = "false", value = "Vazio.<br/>Domínio:<br/>true - Sim<br/>false - Não")
 /**
   * Vazio.<br/>Domínio:<br/>true - Sim<br/>false - Não
  **/
  private Boolean vazio = null;

  @XmlElement(name="imagemScanner", required = true)
  @ApiModelProperty(required = true, value = "")
  @Valid
  private DadosImagemScanner imagemScanner = null;

  @XmlElement(name="arquivoMetadados")
  @ApiModelProperty(example = "xml", value = "Arquivo gerado que acompanha a imagem do scanner, geralmente um xml<br/>Tamanho: 7160")
 /**
   * Arquivo gerado que acompanha a imagem do scanner, geralmente um xml<br/>Tamanho: 7160
  **/
  private String arquivoMetadados = null;

  @XmlElement(name="scanner")
  @ApiModelProperty(example = "66d24eb1-6ac9-4798-bc93-f4c66eb6fa9b", value = "Identificação do scanner. Usar o protocolo do evento de georreferenciamento relativo ao scanner.<br/>Tamanho: 36")
 /**
   * Identificação do scanner. Usar o protocolo do evento de georreferenciamento relativo ao scanner.<br/>Tamanho: 36
  **/
  private String scanner = null;

  @XmlElement(name="listaCameras")
  @ApiModelProperty(value = "Lista de identificação das câmeras. Usar o protocolo do evento de georreferenciamento para indicar, nesta lista, todas as câmeras que cobrem a área onde foi realizado o escaneamento.")
  @Valid
 /**
   * Lista de identificação das câmeras. Usar o protocolo do evento de georreferenciamento para indicar, nesta lista, todas as câmeras que cobrem a área onde foi realizado o escaneamento.
  **/
  private List<DadosDaCmera> listaCameras = null;
 /**
   * Indica se o evento transmitido é novo (incluir) ou retifica/exclui evento anterior.&lt;br/&gt;Domínio:&lt;br/&gt;I - Incluir&lt;br/&gt;R - Retificar&lt;br/&gt;E - Excluir
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

  public void setTipoOperacao(TipoOperacaoEnum tipoOperacao) {
    this.tipoOperacao = tipoOperacao;
  }

  public DadosDaInspeoNoInvasiva tipoOperacao(TipoOperacaoEnum tipoOperacao) {
    this.tipoOperacao = tipoOperacao;
    return this;
  }

 /**
   * Identificador único do evento que pode ser utilizado para recuperar as informações do Evento no sistema de origem do Recinto remetente. Ex.: Chave tabela 1 + ... + chave tabela n - tantas chaves quantas forem as tabelas necessárias para montar o registro do evento.&lt;br/&gt;Tamanho: 100
   * @return idEvento
  **/
  @JsonProperty("idEvento")
  @NotNull
  public String getIdEvento() {
    return idEvento;
  }

  public void setIdEvento(String idEvento) {
    this.idEvento = idEvento;
  }

  public DadosDaInspeoNoInvasiva idEvento(String idEvento) {
    this.idEvento = idEvento;
    return this;
  }

 /**
   * Data e hora em que o evento ocorreu ou que se coletou, em formulário papel durante uma contingência, os dados do evento. Deve-se enviar, junto da data, o fuso horário no qual tal data e hora foi gerada.&lt;br/&gt;Formato: &#39;yyyy-MM-ddTHH:mm:ss.SSSZ&#39;
   * @return dataHoraOcorrencia
  **/
  @JsonProperty("dataHoraOcorrencia")
  @NotNull
  public String getDataHoraOcorrencia() {
    return dataHoraOcorrencia;
  }

  public void setDataHoraOcorrencia(String dataHoraOcorrencia) {
    this.dataHoraOcorrencia = dataHoraOcorrencia;
  }

  public DadosDaInspeoNoInvasiva dataHoraOcorrencia(String dataHoraOcorrencia) {
    this.dataHoraOcorrencia = dataHoraOcorrencia;
    return this;
  }

 /**
   * Data e hora em que se efetuou o lançamento, no sistema informatizado, seja em operações normais, seja das informações coletadas durante uma contingência. Deve-se enviar, junto da data, o fuso horário no qual tal data e hora foi gerada.&lt;br/&gt;Formato: &#39;yyyy-MM-ddTHH:mm:ss.SSSZ&#39;
   * @return dataHoraRegistro
  **/
  @JsonProperty("dataHoraRegistro")
  @NotNull
  public String getDataHoraRegistro() {
    return dataHoraRegistro;
  }

  public void setDataHoraRegistro(String dataHoraRegistro) {
    this.dataHoraRegistro = dataHoraRegistro;
  }

  public DadosDaInspeoNoInvasiva dataHoraRegistro(String dataHoraRegistro) {
    this.dataHoraRegistro = dataHoraRegistro;
    return this;
  }

 /**
   * CPF da pessoa que coletou, em formulário papel durante uma contingência, os dados do evento.&lt;br/&gt;Pode ser nulo quando o processo for automatizado, com isso, não há operador de ocorrência e nem de registro.&lt;br/&gt;Tamanho: 11&lt;br/&gt;Formato: &#39;NNNNNNNNNNN&#39;
   * @return cpfOperadorOcorrencia
  **/
  @JsonProperty("cpfOperadorOcorrencia")
  public String getCpfOperadorOcorrencia() {
    return cpfOperadorOcorrencia;
  }

  public void setCpfOperadorOcorrencia(String cpfOperadorOcorrencia) {
    this.cpfOperadorOcorrencia = cpfOperadorOcorrencia;
  }

  public DadosDaInspeoNoInvasiva cpfOperadorOcorrencia(String cpfOperadorOcorrencia) {
    this.cpfOperadorOcorrencia = cpfOperadorOcorrencia;
    return this;
  }

 /**
   * CPF da pessoa que efetuou o lançamento, no sistema informatizado, seja em operações normais, seja das informações coletadas durante uma contingência.&lt;br&gt;Pode ser nulo quando o processo for automatizado, com isso, não há operador de ocorrência e nem de registro.&lt;br/&gt;Tamanho: 11&lt;br/&gt;Formato: &#39;NNNNNNNNNNN&#39;
   * @return cpfOperadorRegistro
  **/
  @JsonProperty("cpfOperadorRegistro")
  public String getCpfOperadorRegistro() {
    return cpfOperadorRegistro;
  }

  public void setCpfOperadorRegistro(String cpfOperadorRegistro) {
    this.cpfOperadorRegistro = cpfOperadorRegistro;
  }

  public DadosDaInspeoNoInvasiva cpfOperadorRegistro(String cpfOperadorRegistro) {
    this.cpfOperadorRegistro = cpfOperadorRegistro;
    return this;
  }

 /**
   * Observar que no caso de evento retificador ou de exclusão, o protocolo do evento retificado ou excluído deve ser informado para possibilitar a correta vinculação. Usar protocolo recebido após o envio do evento original. O envio de eventos retificadores substitui completamente as informações prestadas no evento retificado.&lt;br/&gt;Tamanho: 36
   * @return protocoloEventoRetificadoOuExcluido
  **/
  @JsonProperty("protocoloEventoRetificadoOuExcluido")
  public String getProtocoloEventoRetificadoOuExcluido() {
    return protocoloEventoRetificadoOuExcluido;
  }

  public void setProtocoloEventoRetificadoOuExcluido(String protocoloEventoRetificadoOuExcluido) {
    this.protocoloEventoRetificadoOuExcluido = protocoloEventoRetificadoOuExcluido;
  }

  public DadosDaInspeoNoInvasiva protocoloEventoRetificadoOuExcluido(String protocoloEventoRetificadoOuExcluido) {
    this.protocoloEventoRetificadoOuExcluido = protocoloEventoRetificadoOuExcluido;
    return this;
  }

 /**
   * Indica que este evento ocorreu durante uma contingência. Via de regra deverá haver um evento (Ocorrências de indisponibilidade de equipamentos) para o equipamento envolvido. Transmitir como true sempre que ocorrer falha operacional no sistema do recinto que impeça o registro e/ou envio de informações em seu sistema.&lt;br/&gt;Domínio:&lt;br/&gt;true - Sim&lt;br/&gt;false - Não
   * @return contingencia
  **/
  @JsonProperty("contingencia")
  @NotNull
  public Boolean isContingencia() {
    return contingencia;
  }

  public void setContingencia(Boolean contingencia) {
    this.contingencia = contingencia;
  }

  public DadosDaInspeoNoInvasiva contingencia(Boolean contingencia) {
    this.contingencia = contingencia;
    return this;
  }

 /**
   * Código Siscomex do recinto onde ocorreu o evento a ser transmitido.&lt;br/&gt;Tamanho: 15
   * @return codigoRecinto
  **/
  @JsonProperty("codigoRecinto")
  @NotNull
  public String getCodigoRecinto() {
    return codigoRecinto;
  }

  public void setCodigoRecinto(String codigoRecinto) {
    this.codigoRecinto = codigoRecinto;
  }

  public DadosDaInspeoNoInvasiva codigoRecinto(String codigoRecinto) {
    this.codigoRecinto = codigoRecinto;
    return this;
  }

 /**
   * Lista de manifestos.
   * @return listaManifestos
  **/
  @JsonProperty("listaManifestos")
  public List<DadosDoManisfestoDaCarga> getListaManifestos() {
    return listaManifestos;
  }

  public void setListaManifestos(List<DadosDoManisfestoDaCarga> listaManifestos) {
    this.listaManifestos = listaManifestos;
  }

  public DadosDaInspeoNoInvasiva listaManifestos(List<DadosDoManisfestoDaCarga> listaManifestos) {
    this.listaManifestos = listaManifestos;
    return this;
  }

  public DadosDaInspeoNoInvasiva addListaManifestosItem(DadosDoManisfestoDaCarga listaManifestosItem) {
    this.listaManifestos.add(listaManifestosItem);
    return this;
  }

 /**
   * Lista de chaves das NFE que amparam o transporte.
   * @return listaNfe
  **/
  @JsonProperty("listaNfe")
  public List<DadosDaNotaFiscalEmbarqueDesembarque> getListaNfe() {
    return listaNfe;
  }

  public void setListaNfe(List<DadosDaNotaFiscalEmbarqueDesembarque> listaNfe) {
    this.listaNfe = listaNfe;
  }

  public DadosDaInspeoNoInvasiva listaNfe(List<DadosDaNotaFiscalEmbarqueDesembarque> listaNfe) {
    this.listaNfe = listaNfe;
    return this;
  }

  public DadosDaInspeoNoInvasiva addListaNfeItem(DadosDaNotaFiscalEmbarqueDesembarque listaNfeItem) {
    this.listaNfe.add(listaNfeItem);
    return this;
  }

 /**
   * Lista de identificadores de Carga.
   * @return listaCarga
  **/
  @JsonProperty("listaCarga")
  public List<DadosDaCarga> getListaCarga() {
    return listaCarga;
  }

  public void setListaCarga(List<DadosDaCarga> listaCarga) {
    this.listaCarga = listaCarga;
  }

  public DadosDaInspeoNoInvasiva listaCarga(List<DadosDaCarga> listaCarga) {
    this.listaCarga = listaCarga;
    return this;
  }

  public DadosDaInspeoNoInvasiva addListaCargaItem(DadosDaCarga listaCargaItem) {
    this.listaCarga.add(listaCargaItem);
    return this;
  }

 /**
   * Lista de semirreboques ou vagões. No caso de caminhão truck informar a placa nessa estrutura.
   * @return listaSemirreboque
  **/
  @JsonProperty("listaSemirreboque")
  public List<DadosSemirreboqueDaInspeoNoInvasiva> getListaSemirreboque() {
    return listaSemirreboque;
  }

  public void setListaSemirreboque(List<DadosSemirreboqueDaInspeoNoInvasiva> listaSemirreboque) {
    this.listaSemirreboque = listaSemirreboque;
  }

  public DadosDaInspeoNoInvasiva listaSemirreboque(List<DadosSemirreboqueDaInspeoNoInvasiva> listaSemirreboque) {
    this.listaSemirreboque = listaSemirreboque;
    return this;
  }

  public DadosDaInspeoNoInvasiva addListaSemirreboqueItem(DadosSemirreboqueDaInspeoNoInvasiva listaSemirreboqueItem) {
    this.listaSemirreboque.add(listaSemirreboqueItem);
    return this;
  }

 /**
   * Lista de contêineres ou ULD (Unit Load Device – Aéreo).
   * @return listaConteineresUld
  **/
  @JsonProperty("listaConteineresUld")
  public List<DadosContinerUldInspeoNoInvasiva> getListaConteineresUld() {
    return listaConteineresUld;
  }

  public void setListaConteineresUld(List<DadosContinerUldInspeoNoInvasiva> listaConteineresUld) {
    this.listaConteineresUld = listaConteineresUld;
  }

  public DadosDaInspeoNoInvasiva listaConteineresUld(List<DadosContinerUldInspeoNoInvasiva> listaConteineresUld) {
    this.listaConteineresUld = listaConteineresUld;
    return this;
  }

  public DadosDaInspeoNoInvasiva addListaConteineresUldItem(DadosContinerUldInspeoNoInvasiva listaConteineresUldItem) {
    this.listaConteineresUld.add(listaConteineresUldItem);
    return this;
  }

 /**
   * Vazio.&lt;br/&gt;Domínio:&lt;br/&gt;true - Sim&lt;br/&gt;false - Não
   * @return vazio
  **/
  @JsonProperty("vazio")
  public Boolean isVazio() {
    return vazio;
  }

  public void setVazio(Boolean vazio) {
    this.vazio = vazio;
  }

  public DadosDaInspeoNoInvasiva vazio(Boolean vazio) {
    this.vazio = vazio;
    return this;
  }

 /**
   * Get imagemScanner
   * @return imagemScanner
  **/
  @JsonProperty("imagemScanner")
  @NotNull
  public DadosImagemScanner getImagemScanner() {
    return imagemScanner;
  }

  public void setImagemScanner(DadosImagemScanner imagemScanner) {
    this.imagemScanner = imagemScanner;
  }

  public DadosDaInspeoNoInvasiva imagemScanner(DadosImagemScanner imagemScanner) {
    this.imagemScanner = imagemScanner;
    return this;
  }

 /**
   * Arquivo gerado que acompanha a imagem do scanner, geralmente um xml&lt;br/&gt;Tamanho: 7160
   * @return arquivoMetadados
  **/
  @JsonProperty("arquivoMetadados")
  public String getArquivoMetadados() {
    return arquivoMetadados;
  }

  public void setArquivoMetadados(String arquivoMetadados) {
    this.arquivoMetadados = arquivoMetadados;
  }

  public DadosDaInspeoNoInvasiva arquivoMetadados(String arquivoMetadados) {
    this.arquivoMetadados = arquivoMetadados;
    return this;
  }

 /**
   * Identificação do scanner. Usar o protocolo do evento de georreferenciamento relativo ao scanner.&lt;br/&gt;Tamanho: 36
   * @return scanner
  **/
  @JsonProperty("scanner")
  public String getScanner() {
    return scanner;
  }

  public void setScanner(String scanner) {
    this.scanner = scanner;
  }

  public DadosDaInspeoNoInvasiva scanner(String scanner) {
    this.scanner = scanner;
    return this;
  }

 /**
   * Lista de identificação das câmeras. Usar o protocolo do evento de georreferenciamento para indicar, nesta lista, todas as câmeras que cobrem a área onde foi realizado o escaneamento.
   * @return listaCameras
  **/
  @JsonProperty("listaCameras")
  public List<DadosDaCmera> getListaCameras() {
    return listaCameras;
  }

  public void setListaCameras(List<DadosDaCmera> listaCameras) {
    this.listaCameras = listaCameras;
  }

  public DadosDaInspeoNoInvasiva listaCameras(List<DadosDaCmera> listaCameras) {
    this.listaCameras = listaCameras;
    return this;
  }

  public DadosDaInspeoNoInvasiva addListaCamerasItem(DadosDaCmera listaCamerasItem) {
    this.listaCameras.add(listaCamerasItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DadosDaInspeoNoInvasiva {\n");
    
    sb.append("    tipoOperacao: ").append(toIndentedString(tipoOperacao)).append("\n");
    sb.append("    idEvento: ").append(toIndentedString(idEvento)).append("\n");
    sb.append("    dataHoraOcorrencia: ").append(toIndentedString(dataHoraOcorrencia)).append("\n");
    sb.append("    dataHoraRegistro: ").append(toIndentedString(dataHoraRegistro)).append("\n");
    sb.append("    cpfOperadorOcorrencia: ").append(toIndentedString(cpfOperadorOcorrencia)).append("\n");
    sb.append("    cpfOperadorRegistro: ").append(toIndentedString(cpfOperadorRegistro)).append("\n");
    sb.append("    protocoloEventoRetificadoOuExcluido: ").append(toIndentedString(protocoloEventoRetificadoOuExcluido)).append("\n");
    sb.append("    contingencia: ").append(toIndentedString(contingencia)).append("\n");
    sb.append("    codigoRecinto: ").append(toIndentedString(codigoRecinto)).append("\n");
    sb.append("    listaManifestos: ").append(toIndentedString(listaManifestos)).append("\n");
    sb.append("    listaNfe: ").append(toIndentedString(listaNfe)).append("\n");
    sb.append("    listaCarga: ").append(toIndentedString(listaCarga)).append("\n");
    sb.append("    listaSemirreboque: ").append(toIndentedString(listaSemirreboque)).append("\n");
    sb.append("    listaConteineresUld: ").append(toIndentedString(listaConteineresUld)).append("\n");
    sb.append("    vazio: ").append(toIndentedString(vazio)).append("\n");
    sb.append("    imagemScanner: ").append(toIndentedString(imagemScanner)).append("\n");
    sb.append("    arquivoMetadados: ").append(toIndentedString(arquivoMetadados)).append("\n");
    sb.append("    scanner: ").append(toIndentedString(scanner)).append("\n");
    sb.append("    listaCameras: ").append(toIndentedString(listaCameras)).append("\n");
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

