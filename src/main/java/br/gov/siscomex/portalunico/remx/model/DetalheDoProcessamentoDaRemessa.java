package br.gov.siscomex.portalunico.remx.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DetalheDoProcessamentoDaRemessa", propOrder =
        {"descricao", "destinacaoComercial", "destinatario", "dir", "divergencias", "documentosAnexados", "freteDolar", "freteModoPagto", "freteReal", "ii", "infoFiscalizacao", "informacoesComplementares", "master", "mercadorias", "multas", "numeroRemessa", "ocorrencias", "pedidos", "peso", "remessaConforme", "remetente", "selecoes", "situacao", "totalVolumesRecebidos", "txCambioDtRegistro", "valorIIReal", "valorJurosMora", "valorJurosOficio", "valorMultaMora", "valorMultasReal", "valorRemessaDolar", "valorRemessaReal", "valorTributavelDolar", "valorTributavelReal", "volumes"
        })

@XmlRootElement(name = "DetalheDoProcessamentoDaRemessa")
public class DetalheDoProcessamentoDaRemessa {

    @XmlElement(name = "descricao")
    @ApiModelProperty(value = "Descrição da remessa. Máximo de 4.000 caracteres, que podem ser letras, números, além de quaisquer caracteres referentes a codificação UTF-8.")
    /**
     * Descrição da remessa. Máximo de 4.000 caracteres, que podem ser letras, números, além de quaisquer caracteres referentes a codificação UTF-8.
     **/
    private String descricao = null;

    @XmlElement(name = "destinacaoComercial")
    @ApiModelProperty(value = "Indica se a remessa tem destinação comercial ou não. Sim – 's' e Não – 'n'.")
    /**
     * Indica se a remessa tem destinação comercial ou não. Sim – 's' e Não – 'n'.
     **/
    private String destinacaoComercial = null;

    @XmlElement(name = "destinatario")
    @ApiModelProperty(value = "")
    @Valid
    private Pessoa destinatario = null;

    @XmlElement(name = "dir")
    @ApiModelProperty(value = "")
    @Valid
    private DeclaraoDeRemessaDIR dir = null;

    @XmlElement(name = "divergencias")
    @ApiModelProperty(value = "Lista de divergências.")
    @Valid
    /**
     * Lista de divergências.
     **/
    private List<Divergncia> divergencias = null;

    @XmlElement(name = "documentosAnexados")
    @ApiModelProperty(value = "Lista de documentos anexados.")
    @Valid
    /**
     * Lista de documentos anexados.
     **/
    private List<DocumentoAnexado> documentosAnexados = null;

    @XmlElement(name = "freteDolar")
    @ApiModelProperty(value = "Valor do Frete da remessa em Dólares Americanos (USD). Número fracionário, aceitando no máximo até 10 dígitos antes do ponto e 2 dígitos após o ponto.")
    @Valid
    /**
     * Valor do Frete da remessa em Dólares Americanos (USD). Número fracionário, aceitando no máximo até 10 dígitos antes do ponto e 2 dígitos após o ponto.
     **/
    private BigDecimal freteDolar = null;

    @XmlElement(name = "freteModoPagto")
    @ApiModelProperty(value = "Modo de pagamento do frete. Valores pré-definidos: 'PREPAID' ou 'COLLECT'.")
    /**
     * Modo de pagamento do frete. Valores pré-definidos: 'PREPAID' ou 'COLLECT'.
     **/
    private String freteModoPagto = null;

    @XmlElement(name = "freteReal")
    @ApiModelProperty(value = "Valor do Frete da remessa em Reais (BRL). Número fracionário, aceitando no máximo até 10 dígitos antes do ponto e 2 dígitos após o ponto.")
    @Valid
    /**
     * Valor do Frete da remessa em Reais (BRL). Número fracionário, aceitando no máximo até 10 dígitos antes do ponto e 2 dígitos após o ponto.
     **/
    private BigDecimal freteReal = null;

    @XmlElement(name = "ii")
    @ApiModelProperty(value = "")
    @Valid
    private ImpostoDeImportao ii = null;

    @XmlElement(name = "infoFiscalizacao")
    @ApiModelProperty(value = "Informações de fiscalização. Máximo de 500 caracteres, que podem ser letras, números, além de quaisquer caracteres referentes a codificação UTF-8.")
    /**
     * Informações de fiscalização. Máximo de 500 caracteres, que podem ser letras, números, além de quaisquer caracteres referentes a codificação UTF-8.
     **/
    private String infoFiscalizacao = null;

    @XmlElement(name = "informacoesComplementares")
    @ApiModelProperty(value = "Lista de todas as informações complementares da remessa. Cada informação complementar tem no máximo de 4.000 caracteres, que podem ser letras, números, além de quaisquer caracteres referentes a codificação UTF-8.")
    @Valid
    /**
     * Lista de todas as informações complementares da remessa. Cada informação complementar tem no máximo de 4.000 caracteres, que podem ser letras, números, além de quaisquer caracteres referentes a codificação UTF-8.
     **/
    private List<InformaoComplementar> informacoesComplementares = null;

    @XmlElement(name = "master")
    @ApiModelProperty(value = "Número do Master (11 caracteres numéricos) ou o número da Mala Postal (29 caracteres alfanuméricos).")
    /**
     * Número do Master (11 caracteres numéricos) ou o número da Mala Postal (29 caracteres alfanuméricos).
     **/
    private String master = null;

    @XmlElement(name = "mercadorias")
    @ApiModelProperty(value = "Lista de mercadorias.")
    @Valid
    /**
     * Lista de mercadorias.
     **/
    private List<Mercadoria> mercadorias = null;

    @XmlElement(name = "multas")
    @ApiModelProperty(value = "Lista de multas.")
    @Valid
    /**
     * Lista de multas.
     **/
    private List<Multa> multas = null;

    @XmlElement(name = "numeroRemessa", required = true)
    @ApiModelProperty(required = true, value = "Número da remessa composto por no máximo 18 caracteres alfanuméricos.")
    /**
     * Número da remessa composto por no máximo 18 caracteres alfanuméricos.
     **/
    private String numeroRemessa = null;

    @XmlElement(name = "ocorrencias")
    @ApiModelProperty(value = "Lista de ocorrências.")
    @Valid
    /**
     * Lista de ocorrências.
     **/
    private List<Ocorrncia> ocorrencias = null;

    @XmlElement(name = "pedidos")
    @ApiModelProperty(value = "Lista de pedidos de revisão e devolução.")
    @Valid
    /**
     * Lista de pedidos de revisão e devolução.
     **/
    private List<Pedidos> pedidos = null;

    @XmlElement(name = "peso")
    @ApiModelProperty(value = "Peso em quilogramas da remessa. Número fracionário, maior que zero, aceitando no máximo até 10 dígitos antes do ponto e 2 dígitos após o ponto. O peso da remessa deve ser maior ou igual ao somatório dos pesos das suas mercadorias.")
    @Valid
    /**
     * Peso em quilogramas da remessa. Número fracionário, maior que zero, aceitando no máximo até 10 dígitos antes do ponto e 2 dígitos após o ponto. O peso da remessa deve ser maior ou igual ao somatório dos pesos das suas mercadorias.
     **/
    private BigDecimal peso = null;

    @XmlElement(name = "remessaConforme")
    @ApiModelProperty(value = "")
    @Valid
    private RemessaConforme remessaConforme = null;

    @XmlElement(name = "remetente")
    @ApiModelProperty(value = "")
    @Valid
    private Pessoa remetente = null;

    @XmlElement(name = "selecoes")
    @ApiModelProperty(value = "Lista de seleções para fiscalização.")
    @Valid
    /**
     * Lista de seleções para fiscalização.
     **/
    private List<Seleo> selecoes = null;

    @XmlElement(name = "situacao")
    @ApiModelProperty(value = "Código da situação da remessa. O código da situação é composto por 2 dígitos.")
    /**
     * Código da situação da remessa. O código da situação é composto por 2 dígitos.
     **/
    private Integer situacao = null;

    @XmlElement(name = "totalVolumesRecebidos")
    @ApiModelProperty(value = "Quantidade de volumes que foram recebidos. Máximo de quatro caracteres numéricos (de 1 a 9999).")
    /**
     * Quantidade de volumes que foram recebidos. Máximo de quatro caracteres numéricos (de 1 a 9999).
     **/
    private Integer totalVolumesRecebidos = null;

    @XmlElement(name = "txCambioDtRegistro")
    @ApiModelProperty(value = "Valor da taxa de câmbio USD x BRL na data de registro da DIR. Número fracionário, aceitando no máximo até 10 dígitos antes do ponto e 5 dígitos após o ponto.")
    /**
     * Valor da taxa de câmbio USD x BRL na data de registro da DIR. Número fracionário, aceitando no máximo até 10 dígitos antes do ponto e 5 dígitos após o ponto.
     **/
    private String txCambioDtRegistro = null;

    @XmlElement(name = "valorIIReal")
    @ApiModelProperty(value = "Valor total do Imposto de Importação em Reais (BRL). Número fracionário, aceitando no máximo até 10 dígitos antes do ponto e 2 dígitos após o ponto.")
    @Valid
    /**
     * Valor total do Imposto de Importação em Reais (BRL). Número fracionário, aceitando no máximo até 10 dígitos antes do ponto e 2 dígitos após o ponto.
     **/
    private BigDecimal valorIIReal = null;

    @XmlElement(name = "valorJurosMora")
    @ApiModelProperty(value = "Valor de juros de mora para a remessa. Número fracionário, aceitando no máximo até 9 dígitos antes do ponto e 2 dígitos após o ponto.")
    @Valid
    /**
     * Valor de juros de mora para a remessa. Número fracionário, aceitando no máximo até 9 dígitos antes do ponto e 2 dígitos após o ponto.
     **/
    private BigDecimal valorJurosMora = null;

    @XmlElement(name = "valorJurosOficio")
    @ApiModelProperty(value = "Valor de juros de ofício para a remessa. Número fracionário, aceitando no máximo até 9 dígitos antes do ponto e 2 dígitos após o ponto.")
    @Valid
    /**
     * Valor de juros de ofício para a remessa. Número fracionário, aceitando no máximo até 9 dígitos antes do ponto e 2 dígitos após o ponto.
     **/
    private BigDecimal valorJurosOficio = null;

    @XmlElement(name = "valorMultaMora")
    @ApiModelProperty(value = "Valor de multa de mora para a remessa. Número fracionário, aceitando no máximo até 9 dígitos antes do ponto e 2 dígitos após o ponto.")
    @Valid
    /**
     * Valor de multa de mora para a remessa. Número fracionário, aceitando no máximo até 9 dígitos antes do ponto e 2 dígitos após o ponto.
     **/
    private BigDecimal valorMultaMora = null;

    @XmlElement(name = "valorMultasReal")
    @ApiModelProperty(value = "Valor total das multas da remessa em Reais (BRL). Número fracionário, aceitando no máximo até 10 dígitos antes do ponto e 2 dígitos após o ponto.")
    @Valid
    /**
     * Valor total das multas da remessa em Reais (BRL). Número fracionário, aceitando no máximo até 10 dígitos antes do ponto e 2 dígitos após o ponto.
     **/
    private BigDecimal valorMultasReal = null;

    @XmlElement(name = "valorRemessaDolar")
    @ApiModelProperty(value = "Valor total da remessa em Dólares Americanos (USD). Número fracionário, aceitando no máximo até 10 dígitos antes do ponto e 2 dígitos após o ponto.")
    @Valid
    /**
     * Valor total da remessa em Dólares Americanos (USD). Número fracionário, aceitando no máximo até 10 dígitos antes do ponto e 2 dígitos após o ponto.
     **/
    private BigDecimal valorRemessaDolar = null;

    @XmlElement(name = "valorRemessaReal")
    @ApiModelProperty(value = "Valor total da remessa em Reais (BRL). Número fracionário, aceitando no máximo até 10 dígitos antes do ponto e 2 dígitos após o ponto.")
    @Valid
    /**
     * Valor total da remessa em Reais (BRL). Número fracionário, aceitando no máximo até 10 dígitos antes do ponto e 2 dígitos após o ponto.
     **/
    private BigDecimal valorRemessaReal = null;

    @XmlElement(name = "valorTributavelDolar")
    @ApiModelProperty(value = "Valor tributável da remessa em Dólares Americanos (USD). Número fracionário, aceitando no máximo até 10 dígitos antes do ponto e 2 dígitos após o ponto.")
    @Valid
    /**
     * Valor tributável da remessa em Dólares Americanos (USD). Número fracionário, aceitando no máximo até 10 dígitos antes do ponto e 2 dígitos após o ponto.
     **/
    private BigDecimal valorTributavelDolar = null;

    @XmlElement(name = "valorTributavelReal")
    @ApiModelProperty(value = "Valor tributável da remessa em Reais (BRL). Número fracionário, aceitando no máximo até 10 dígitos antes do ponto e 2 dígitos após o ponto.")
    @Valid
    /**
     * Valor tributável da remessa em Reais (BRL). Número fracionário, aceitando no máximo até 10 dígitos antes do ponto e 2 dígitos após o ponto.
     **/
    private BigDecimal valorTributavelReal = null;

    @XmlElement(name = "volumes")
    @ApiModelProperty(value = "Quantidade de volumes da remessa. Máximo de 4 caracteres numéricos (de 1 a 9999).")
    /**
     * Quantidade de volumes da remessa. Máximo de 4 caracteres numéricos (de 1 a 9999).
     **/
    private Integer volumes = null;

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
     * Descrição da remessa. Máximo de 4.000 caracteres, que podem ser letras, números, além de quaisquer caracteres referentes a codificação UTF-8.
     *
     * @return descricao
     **/
    @JsonProperty("descricao")
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public DetalheDoProcessamentoDaRemessa descricao(String descricao) {
        this.descricao = descricao;
        return this;
    }

    /**
     * Indica se a remessa tem destinação comercial ou não. Sim – &#39;s&#39; e Não – &#39;n&#39;.
     *
     * @return destinacaoComercial
     **/
    @JsonProperty("destinacaoComercial")
    public String getDestinacaoComercial() {
        return destinacaoComercial;
    }

    public void setDestinacaoComercial(String destinacaoComercial) {
        this.destinacaoComercial = destinacaoComercial;
    }

    public DetalheDoProcessamentoDaRemessa destinacaoComercial(String destinacaoComercial) {
        this.destinacaoComercial = destinacaoComercial;
        return this;
    }

    /**
     * Get destinatario
     *
     * @return destinatario
     **/
    @JsonProperty("destinatario")
    public Pessoa getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(Pessoa destinatario) {
        this.destinatario = destinatario;
    }

    public DetalheDoProcessamentoDaRemessa destinatario(Pessoa destinatario) {
        this.destinatario = destinatario;
        return this;
    }

    /**
     * Get dir
     *
     * @return dir
     **/
    @JsonProperty("dir")
    public DeclaraoDeRemessaDIR getDir() {
        return dir;
    }

    public void setDir(DeclaraoDeRemessaDIR dir) {
        this.dir = dir;
    }

    public DetalheDoProcessamentoDaRemessa dir(DeclaraoDeRemessaDIR dir) {
        this.dir = dir;
        return this;
    }

    /**
     * Lista de divergências.
     *
     * @return divergencias
     **/
    @JsonProperty("divergencias")
    public List<Divergncia> getDivergencias() {
        return divergencias;
    }

    public void setDivergencias(List<Divergncia> divergencias) {
        this.divergencias = divergencias;
    }

    public DetalheDoProcessamentoDaRemessa divergencias(List<Divergncia> divergencias) {
        this.divergencias = divergencias;
        return this;
    }

    public DetalheDoProcessamentoDaRemessa addDivergenciasItem(Divergncia divergenciasItem) {
        this.divergencias.add(divergenciasItem);
        return this;
    }

    /**
     * Lista de documentos anexados.
     *
     * @return documentosAnexados
     **/
    @JsonProperty("documentosAnexados")
    public List<DocumentoAnexado> getDocumentosAnexados() {
        return documentosAnexados;
    }

    public void setDocumentosAnexados(List<DocumentoAnexado> documentosAnexados) {
        this.documentosAnexados = documentosAnexados;
    }

    public DetalheDoProcessamentoDaRemessa documentosAnexados(List<DocumentoAnexado> documentosAnexados) {
        this.documentosAnexados = documentosAnexados;
        return this;
    }

    public DetalheDoProcessamentoDaRemessa addDocumentosAnexadosItem(DocumentoAnexado documentosAnexadosItem) {
        this.documentosAnexados.add(documentosAnexadosItem);
        return this;
    }

    /**
     * Valor do Frete da remessa em Dólares Americanos (USD). Número fracionário, aceitando no máximo até 10 dígitos antes do ponto e 2 dígitos após o ponto.
     *
     * @return freteDolar
     **/
    @JsonProperty("freteDolar")
    public BigDecimal getFreteDolar() {
        return freteDolar;
    }

    public void setFreteDolar(BigDecimal freteDolar) {
        this.freteDolar = freteDolar;
    }

    public DetalheDoProcessamentoDaRemessa freteDolar(BigDecimal freteDolar) {
        this.freteDolar = freteDolar;
        return this;
    }

    /**
     * Modo de pagamento do frete. Valores pré-definidos: &#39;PREPAID&#39; ou &#39;COLLECT&#39;.
     *
     * @return freteModoPagto
     **/
    @JsonProperty("freteModoPagto")
    public String getFreteModoPagto() {
        return freteModoPagto;
    }

    public void setFreteModoPagto(String freteModoPagto) {
        this.freteModoPagto = freteModoPagto;
    }

    public DetalheDoProcessamentoDaRemessa freteModoPagto(String freteModoPagto) {
        this.freteModoPagto = freteModoPagto;
        return this;
    }

    /**
     * Valor do Frete da remessa em Reais (BRL). Número fracionário, aceitando no máximo até 10 dígitos antes do ponto e 2 dígitos após o ponto.
     *
     * @return freteReal
     **/
    @JsonProperty("freteReal")
    public BigDecimal getFreteReal() {
        return freteReal;
    }

    public void setFreteReal(BigDecimal freteReal) {
        this.freteReal = freteReal;
    }

    public DetalheDoProcessamentoDaRemessa freteReal(BigDecimal freteReal) {
        this.freteReal = freteReal;
        return this;
    }

    /**
     * Get ii
     *
     * @return ii
     **/
    @JsonProperty("ii")
    public ImpostoDeImportao getIi() {
        return ii;
    }

    public void setIi(ImpostoDeImportao ii) {
        this.ii = ii;
    }

    public DetalheDoProcessamentoDaRemessa ii(ImpostoDeImportao ii) {
        this.ii = ii;
        return this;
    }

    /**
     * Informações de fiscalização. Máximo de 500 caracteres, que podem ser letras, números, além de quaisquer caracteres referentes a codificação UTF-8.
     *
     * @return infoFiscalizacao
     **/
    @JsonProperty("infoFiscalizacao")
    public String getInfoFiscalizacao() {
        return infoFiscalizacao;
    }

    public void setInfoFiscalizacao(String infoFiscalizacao) {
        this.infoFiscalizacao = infoFiscalizacao;
    }

    public DetalheDoProcessamentoDaRemessa infoFiscalizacao(String infoFiscalizacao) {
        this.infoFiscalizacao = infoFiscalizacao;
        return this;
    }

    /**
     * Lista de todas as informações complementares da remessa. Cada informação complementar tem no máximo de 4.000 caracteres, que podem ser letras, números, além de quaisquer caracteres referentes a codificação UTF-8.
     *
     * @return informacoesComplementares
     **/
    @JsonProperty("informacoesComplementares")
    public List<InformaoComplementar> getInformacoesComplementares() {
        return informacoesComplementares;
    }

    public void setInformacoesComplementares(List<InformaoComplementar> informacoesComplementares) {
        this.informacoesComplementares = informacoesComplementares;
    }

    public DetalheDoProcessamentoDaRemessa informacoesComplementares(List<InformaoComplementar> informacoesComplementares) {
        this.informacoesComplementares = informacoesComplementares;
        return this;
    }

    public DetalheDoProcessamentoDaRemessa addInformacoesComplementaresItem(InformaoComplementar informacoesComplementaresItem) {
        this.informacoesComplementares.add(informacoesComplementaresItem);
        return this;
    }

    /**
     * Número do Master (11 caracteres numéricos) ou o número da Mala Postal (29 caracteres alfanuméricos).
     *
     * @return master
     **/
    @JsonProperty("master")
    public String getMaster() {
        return master;
    }

    public void setMaster(String master) {
        this.master = master;
    }

    public DetalheDoProcessamentoDaRemessa master(String master) {
        this.master = master;
        return this;
    }

    /**
     * Lista de mercadorias.
     *
     * @return mercadorias
     **/
    @JsonProperty("mercadorias")
    public List<Mercadoria> getMercadorias() {
        return mercadorias;
    }

    public void setMercadorias(List<Mercadoria> mercadorias) {
        this.mercadorias = mercadorias;
    }

    public DetalheDoProcessamentoDaRemessa mercadorias(List<Mercadoria> mercadorias) {
        this.mercadorias = mercadorias;
        return this;
    }

    /**
     * Lista de multas.
     * @return multas
     **/
    @JsonProperty("multas")
    public List<Multa> getMultas() {
        return multas;
    }

    public void setMultas(List<Multa> multas) {
        this.multas = multas;
    }

    public DetalheDoProcessamentoDaRemessa multas(List<Multa> multas) {
        this.multas = multas;
        return this;
    }

    public DetalheDoProcessamentoDaRemessa addMultasItem(Multa multasItem) {
        this.multas.add(multasItem);
        return this;
    }

    public DetalheDoProcessamentoDaRemessa addMercadoriasItem(Mercadoria mercadoriasItem) {
        this.mercadorias.add(mercadoriasItem);
        return this;
    }

    /**
     * Número da remessa composto por no máximo 18 caracteres alfanuméricos.
     *
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

    /**
     * Lista de ocorrências.
     * @return ocorrencias
     **/
    @JsonProperty("ocorrencias")
    public List<Ocorrncia> getOcorrencias() {
        return ocorrencias;
    }

    public void setOcorrencias(List<Ocorrncia> ocorrencias) {
        this.ocorrencias = ocorrencias;
    }

    public DetalheDoProcessamentoDaRemessa ocorrencias(List<Ocorrncia> ocorrencias) {
        this.ocorrencias = ocorrencias;
        return this;
    }

    public DetalheDoProcessamentoDaRemessa addOcorrenciasItem(Ocorrncia ocorrenciasItem) {
        this.ocorrencias.add(ocorrenciasItem);
        return this;
    }

    /**
     * Lista de pedidos de revisão e devolução.
     * @return pedidos
     **/
    @JsonProperty("pedidos")
    public List<Pedidos> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedidos> pedidos) {
        this.pedidos = pedidos;
    }

    public DetalheDoProcessamentoDaRemessa pedidos(List<Pedidos> pedidos) {
        this.pedidos = pedidos;
        return this;
    }

    public DetalheDoProcessamentoDaRemessa addPedidosItem(Pedidos pedidosItem) {
        this.pedidos.add(pedidosItem);
        return this;
    }

    public DetalheDoProcessamentoDaRemessa numeroRemessa(String numeroRemessa) {
        this.numeroRemessa = numeroRemessa;
        return this;
    }

    /**
     * Peso em quilogramas da remessa. Número fracionário, maior que zero, aceitando no máximo até 10 dígitos antes do ponto e 2 dígitos após o ponto. O peso da remessa deve ser maior ou igual ao somatório dos pesos das suas mercadorias.
     *
     * @return peso
     **/
    @JsonProperty("peso")
    public BigDecimal getPeso() {
        return peso;
    }

    public void setPeso(BigDecimal peso) {
        this.peso = peso;
    }

    /**
     * Get remessaConforme
     *
     * @return remessaConforme
     **/
    @JsonProperty("remessaConforme")
    public RemessaConforme getRemessaConforme() {
        return remessaConforme;
    }

    public void setRemessaConforme(RemessaConforme remessaConforme) {
        this.remessaConforme = remessaConforme;
    }

    public DetalheDoProcessamentoDaRemessa remessaConforme(RemessaConforme remessaConforme) {
        this.remessaConforme = remessaConforme;
        return this;
    }

    /**
     * Get remetente
     * @return remetente
     **/
    @JsonProperty("remetente")
    public Pessoa getRemetente() {
        return remetente;
    }

    public void setRemetente(Pessoa remetente) {
        this.remetente = remetente;
    }

    public DetalheDoProcessamentoDaRemessa remetente(Pessoa remetente) {
        this.remetente = remetente;
        return this;
    }

    /**
     * Lista de seleções para fiscalização.
     * @return selecoes
     **/
    @JsonProperty("selecoes")
    public List<Seleo> getSelecoes() {
        return selecoes;
    }

    public void setSelecoes(List<Seleo> selecoes) {
        this.selecoes = selecoes;
    }

    public DetalheDoProcessamentoDaRemessa selecoes(List<Seleo> selecoes) {
        this.selecoes = selecoes;
        return this;
    }

    public DetalheDoProcessamentoDaRemessa addSelecoesItem(Seleo selecoesItem) {
        this.selecoes.add(selecoesItem);
        return this;
    }

    public DetalheDoProcessamentoDaRemessa peso(BigDecimal peso) {
        this.peso = peso;
        return this;
    }

    /**
     * Código da situação da remessa. O código da situação é composto por 2 dígitos.
     *
     * @return situacao
     **/
    @JsonProperty("situacao")
    public Integer getSituacao() {
        return situacao;
    }

    public void setSituacao(Integer situacao) {
        this.situacao = situacao;
    }

    public DetalheDoProcessamentoDaRemessa situacao(Integer situacao) {
        this.situacao = situacao;
        return this;
    }

    /**
     * Quantidade de volumes que foram recebidos. Máximo de quatro caracteres numéricos (de 1 a 9999).
     *
     * @return totalVolumesRecebidos
     **/
    @JsonProperty("totalVolumesRecebidos")
    public Integer getTotalVolumesRecebidos() {
        return totalVolumesRecebidos;
    }

    public void setTotalVolumesRecebidos(Integer totalVolumesRecebidos) {
        this.totalVolumesRecebidos = totalVolumesRecebidos;
    }

    /**
     * Valor da taxa de câmbio USD x BRL na data de registro da DIR. Número fracionário, aceitando no máximo até 10 dígitos antes do ponto e 5 dígitos após o ponto.
     * @return txCambioDtRegistro
     **/
    @JsonProperty("txCambioDtRegistro")
    public String getTxCambioDtRegistro() {
        return txCambioDtRegistro;
    }

    public void setTxCambioDtRegistro(String txCambioDtRegistro) {
        this.txCambioDtRegistro = txCambioDtRegistro;
    }

    public DetalheDoProcessamentoDaRemessa txCambioDtRegistro(String txCambioDtRegistro) {
        this.txCambioDtRegistro = txCambioDtRegistro;
        return this;
    }

    public DetalheDoProcessamentoDaRemessa totalVolumesRecebidos(Integer totalVolumesRecebidos) {
        this.totalVolumesRecebidos = totalVolumesRecebidos;
        return this;
    }

    /**
     * Valor total do Imposto de Importação em Reais (BRL). Número fracionário, aceitando no máximo até 10 dígitos antes do ponto e 2 dígitos após o ponto.
     *
     * @return valorIIReal
     **/
    @JsonProperty("valorIIReal")
    public BigDecimal getValorIIReal() {
        return valorIIReal;
    }

    public void setValorIIReal(BigDecimal valorIIReal) {
        this.valorIIReal = valorIIReal;
    }

    /**
     * Valor de juros de mora para a remessa. Número fracionário, aceitando no máximo até 9 dígitos antes do ponto e 2 dígitos após o ponto.
     * @return valorJurosMora
     **/
    @JsonProperty("valorJurosMora")
    public BigDecimal getValorJurosMora() {
        return valorJurosMora;
    }

    public void setValorJurosMora(BigDecimal valorJurosMora) {
        this.valorJurosMora = valorJurosMora;
    }

    public DetalheDoProcessamentoDaRemessa valorJurosMora(BigDecimal valorJurosMora) {
        this.valorJurosMora = valorJurosMora;
        return this;
    }

    public DetalheDoProcessamentoDaRemessa valorIIReal(BigDecimal valorIIReal) {
        this.valorIIReal = valorIIReal;
        return this;
    }

    /**
     * Valor de juros de ofício para a remessa. Número fracionário, aceitando no máximo até 9 dígitos antes do ponto e 2 dígitos após o ponto.
     * @return valorJurosOficio
     **/
    @JsonProperty("valorJurosOficio")
    public BigDecimal getValorJurosOficio() {
        return valorJurosOficio;
    }

    public void setValorJurosOficio(BigDecimal valorJurosOficio) {
        this.valorJurosOficio = valorJurosOficio;
    }

    public DetalheDoProcessamentoDaRemessa valorJurosOficio(BigDecimal valorJurosOficio) {
        this.valorJurosOficio = valorJurosOficio;
        return this;
    }

    /**
     * Valor de multa de mora para a remessa. Número fracionário, aceitando no máximo até 9 dígitos antes do ponto e 2 dígitos após o ponto.
     *
     * @return valorMultaMora
     **/
    @JsonProperty("valorMultaMora")
    public BigDecimal getValorMultaMora() {
        return valorMultaMora;
    }

    public void setValorMultaMora(BigDecimal valorMultaMora) {
        this.valorMultaMora = valorMultaMora;
    }

    public DetalheDoProcessamentoDaRemessa valorMultaMora(BigDecimal valorMultaMora) {
        this.valorMultaMora = valorMultaMora;
        return this;
    }

    /**
     * Valor total das multas da remessa em Reais (BRL). Número fracionário, aceitando no máximo até 10 dígitos antes do ponto e 2 dígitos após o ponto.
     *
     * @return valorMultasReal
     **/
    @JsonProperty("valorMultasReal")
    public BigDecimal getValorMultasReal() {
        return valorMultasReal;
    }

    public void setValorMultasReal(BigDecimal valorMultasReal) {
        this.valorMultasReal = valorMultasReal;
    }

    /**
     * Valor total da remessa em Dólares Americanos (USD). Número fracionário, aceitando no máximo até 10 dígitos antes do ponto e 2 dígitos após o ponto.
     * @return valorRemessaDolar
     **/
    @JsonProperty("valorRemessaDolar")
    public BigDecimal getValorRemessaDolar() {
        return valorRemessaDolar;
    }

    public void setValorRemessaDolar(BigDecimal valorRemessaDolar) {
        this.valorRemessaDolar = valorRemessaDolar;
    }

    public DetalheDoProcessamentoDaRemessa valorRemessaDolar(BigDecimal valorRemessaDolar) {
        this.valorRemessaDolar = valorRemessaDolar;
        return this;
    }

    public DetalheDoProcessamentoDaRemessa valorMultasReal(BigDecimal valorMultasReal) {
        this.valorMultasReal = valorMultasReal;
        return this;
    }

    /**
     * Valor total da remessa em Reais (BRL). Número fracionário, aceitando no máximo até 10 dígitos antes do ponto e 2 dígitos após o ponto.
     * @return valorRemessaReal
     **/
    @JsonProperty("valorRemessaReal")
    public BigDecimal getValorRemessaReal() {
        return valorRemessaReal;
    }

    public void setValorRemessaReal(BigDecimal valorRemessaReal) {
        this.valorRemessaReal = valorRemessaReal;
    }

    public DetalheDoProcessamentoDaRemessa valorRemessaReal(BigDecimal valorRemessaReal) {
        this.valorRemessaReal = valorRemessaReal;
        return this;
    }

    /**
     * Valor tributável da remessa em Dólares Americanos (USD). Número fracionário, aceitando no máximo até 10 dígitos antes do ponto e 2 dígitos após o ponto.
     *
     * @return valorTributavelDolar
     **/
    @JsonProperty("valorTributavelDolar")
    public BigDecimal getValorTributavelDolar() {
        return valorTributavelDolar;
    }

    public void setValorTributavelDolar(BigDecimal valorTributavelDolar) {
        this.valorTributavelDolar = valorTributavelDolar;
    }

    public DetalheDoProcessamentoDaRemessa valorTributavelDolar(BigDecimal valorTributavelDolar) {
        this.valorTributavelDolar = valorTributavelDolar;
        return this;
    }

    /**
     * Valor tributável da remessa em Reais (BRL). Número fracionário, aceitando no máximo até 10 dígitos antes do ponto e 2 dígitos após o ponto.
     *
     * @return valorTributavelReal
     **/
    @JsonProperty("valorTributavelReal")
    public BigDecimal getValorTributavelReal() {
        return valorTributavelReal;
    }

    public void setValorTributavelReal(BigDecimal valorTributavelReal) {
        this.valorTributavelReal = valorTributavelReal;
    }

    public DetalheDoProcessamentoDaRemessa valorTributavelReal(BigDecimal valorTributavelReal) {
        this.valorTributavelReal = valorTributavelReal;
        return this;
    }

    /**
     * Quantidade de volumes da remessa. Máximo de 4 caracteres numéricos (de 1 a 9999).
     *
     * @return volumes
     **/
    @JsonProperty("volumes")
    public Integer getVolumes() {
        return volumes;
    }

    public void setVolumes(Integer volumes) {
        this.volumes = volumes;
    }

    public DetalheDoProcessamentoDaRemessa volumes(Integer volumes) {
        this.volumes = volumes;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class DetalheDoProcessamentoDaRemessa {\n" +
                "    descricao: " + toIndentedString(descricao) + "\n" +
                "    destinacaoComercial: " + toIndentedString(destinacaoComercial) + "\n" +
                "    destinatario: " + toIndentedString(destinatario) + "\n" +
                "    dir: " + toIndentedString(dir) + "\n" +
                "    divergencias: " + toIndentedString(divergencias) + "\n" +
                "    documentosAnexados: " + toIndentedString(documentosAnexados) + "\n" +
                "    freteDolar: " + toIndentedString(freteDolar) + "\n" +
                "    freteModoPagto: " + toIndentedString(freteModoPagto) + "\n" +
                "    freteReal: " + toIndentedString(freteReal) + "\n" +
                "    ii: " + toIndentedString(ii) + "\n" +
                "    infoFiscalizacao: " + toIndentedString(infoFiscalizacao) + "\n" +
                "    informacoesComplementares: " + toIndentedString(informacoesComplementares) + "\n" +
                "    master: " + toIndentedString(master) + "\n" +
                "    mercadorias: " + toIndentedString(mercadorias) + "\n" +
                "    multas: " + toIndentedString(multas) + "\n" +
                "    numeroRemessa: " + toIndentedString(numeroRemessa) + "\n" +
                "    ocorrencias: " + toIndentedString(ocorrencias) + "\n" +
                "    pedidos: " + toIndentedString(pedidos) + "\n" +
                "    peso: " + toIndentedString(peso) + "\n" +
                "    remessaConforme: " + toIndentedString(remessaConforme) + "\n" +
                "    remetente: " + toIndentedString(remetente) + "\n" +
                "    selecoes: " + toIndentedString(selecoes) + "\n" +
                "    situacao: " + toIndentedString(situacao) + "\n" +
                "    totalVolumesRecebidos: " + toIndentedString(totalVolumesRecebidos) + "\n" +
                "    txCambioDtRegistro: " + toIndentedString(txCambioDtRegistro) + "\n" +
                "    valorIIReal: " + toIndentedString(valorIIReal) + "\n" +
                "    valorJurosMora: " + toIndentedString(valorJurosMora) + "\n" +
                "    valorJurosOficio: " + toIndentedString(valorJurosOficio) + "\n" +
                "    valorMultaMora: " + toIndentedString(valorMultaMora) + "\n" +
                "    valorMultasReal: " + toIndentedString(valorMultasReal) + "\n" +
                "    valorRemessaDolar: " + toIndentedString(valorRemessaDolar) + "\n" +
                "    valorRemessaReal: " + toIndentedString(valorRemessaReal) + "\n" +
                "    valorTributavelDolar: " + toIndentedString(valorTributavelDolar) + "\n" +
                "    valorTributavelReal: " + toIndentedString(valorTributavelReal) + "\n" +
                "    volumes: " + toIndentedString(volumes) + "\n" +
                "}";
        return sb;
    }
}
