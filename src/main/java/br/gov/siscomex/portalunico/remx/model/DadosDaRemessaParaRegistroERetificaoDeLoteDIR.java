package br.gov.siscomex.portalunico.remx.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DadosDaRemessaParaRegistroERetificaoDeLoteDIR", propOrder =
        {"descricao", "destinacaoComercial", "destinatario", "frete", "freteModoPagto", "infoCompl", "infoFiscalizacao", "mercadorias", "moedaFrete", "numeroMaster", "numeroRemessa", "peso", "remessaConforme", "remetente", "volumes"
        })

@XmlRootElement(name = "DadosDaRemessaParaRegistroERetificaoDeLoteDIR")
public class DadosDaRemessaParaRegistroERetificaoDeLoteDIR {

    @XmlElement(name = "descricao", required = true)
    @ApiModelProperty(required = true, value = "Descrição da remessa. Máximo de 4.000 caracteres, que podem ser letras, números, além de quaisquer caracteres referentes a codificação UTF-8.")
    /**
     * Descrição da remessa. Máximo de 4.000 caracteres, que podem ser letras, números, além de quaisquer caracteres referentes a codificação UTF-8.
     **/
    private String descricao = null;

    @XmlElement(name = "destinacaoComercial", required = true)
    @ApiModelProperty(required = true, value = "Indica se a remessa tem destinação comercial ou não. Sim – 's' e Não – 'n'.")
    /**
     * Indica se a remessa tem destinação comercial ou não. Sim – 's' e Não – 'n'.
     **/
    private String destinacaoComercial = null;

    @XmlElement(name = "destinatario", required = true)
    @ApiModelProperty(required = true, value = "")
    @Valid
    private PessoaParaRegistroERetificaoDeLoteDIR destinatario = null;

    @XmlElement(name = "frete", required = true)
    @ApiModelProperty(required = true, value = "Valor do frete a ser cobrado sobre a remessa. Número fracionário, aceitando no máximo até 9 dígitos antes do ponto e 2 dígitos após o ponto. Para este campo, é permitido o envio de '0.00' caso o valor do frete da remessa seja igual a '0.00'.")
    @Valid
    /**
     * Valor do frete a ser cobrado sobre a remessa. Número fracionário, aceitando no máximo até 9 dígitos antes do ponto e 2 dígitos após o ponto. Para este campo, é permitido o envio de '0.00' caso o valor do frete da remessa seja igual a '0.00'.
     **/
    private BigDecimal frete = null;

    @XmlElement(name = "freteModoPagto", required = true)
    @ApiModelProperty(required = true, value = "Modo de pagamento do frete. Valores pré-definidos: 'PREPAID' ou 'COLLECT'.")
    /**
     * Modo de pagamento do frete. Valores pré-definidos: 'PREPAID' ou 'COLLECT'.
     **/
    private String freteModoPagto = null;

    @XmlElement(name = "infoCompl")
    @ApiModelProperty(value = "Informações complementares referentes à remessa. Máximo de 4.000 caracteres, que podem ser letras, números, além de quaisquer caracteres referentes a codificação UTF-8.")
    /**
     * Informações complementares referentes à remessa. Máximo de 4.000 caracteres, que podem ser letras, números, além de quaisquer caracteres referentes a codificação UTF-8.
     **/
    private String infoCompl = null;

    @XmlElement(name = "infoFiscalizacao")
    @ApiModelProperty(value = "Informações de fiscalização. Máximo de 500 caracteres, que podem ser letras, números, além de quaisquer caracteres referentes a codificação UTF-8.")
    /**
     * Informações de fiscalização. Máximo de 500 caracteres, que podem ser letras, números, além de quaisquer caracteres referentes a codificação UTF-8.
     **/
    private String infoFiscalizacao = null;

    @XmlElement(name = "mercadorias", required = true)
    @ApiModelProperty(required = true, value = "Lista de mercadorias.")
    @Valid
    /**
     * Lista de mercadorias.
     **/
    private List<MercadoriaParaRegistroERetificaoDeLoteDIR> mercadorias = new ArrayList<>();

    @XmlElement(name = "moedaFrete", required = true)
    @ApiModelProperty(required = true, value = "Código da moeda referente ao valor do frete. Valores de acordo com a tabela de domínio. O código de moeda contido no arquivo deve ter exatamente 3 dígitos.")
    /**
     * Código da moeda referente ao valor do frete. Valores de acordo com a tabela de domínio. O código de moeda contido no arquivo deve ter exatamente 3 dígitos.
     **/
    private String moedaFrete = null;

    @XmlElement(name = "numeroMaster", required = true)
    @ApiModelProperty(required = true, value = "Número do Master (11 caracteres numéricos) ou o número da Mala Postal (29 caracteres alfanuméricos).")
    /**
     * Número do Master (11 caracteres numéricos) ou o número da Mala Postal (29 caracteres alfanuméricos).
     **/
    private String numeroMaster = null;

    @XmlElement(name = "numeroRemessa", required = true)
    @ApiModelProperty(required = true, value = "Número da remessa composto por no máximo 18 caracteres alfanuméricos.")
    /**
     * Número da remessa composto por no máximo 18 caracteres alfanuméricos.
     **/
    private String numeroRemessa = null;

    @XmlElement(name = "peso", required = true)
    @ApiModelProperty(required = true, value = "Peso em quilogramas da remessa. Número fracionário, maior que zero, aceitando no máximo até 10 dígitos antes do ponto e 2 dígitos após o ponto. O peso da remessa deve ser maior ou igual ao somatório dos pesos das suas mercadorias.")
    @Valid
    /**
     * Peso em quilogramas da remessa. Número fracionário, maior que zero, aceitando no máximo até 10 dígitos antes do ponto e 2 dígitos após o ponto. O peso da remessa deve ser maior ou igual ao somatório dos pesos das suas mercadorias.
     **/
    private BigDecimal peso = null;

    @XmlElement(name = "remessaConforme")
    @ApiModelProperty(value = "")
    @Valid
    private RemessaConformeParaRegistroERetificaoDeLoteDIR remessaConforme = null;

    @XmlElement(name = "remetente", required = true)
    @ApiModelProperty(required = true, value = "")
    @Valid
    private PessoaParaRegistroERetificaoDeLoteDIR remetente = null;

    @XmlElement(name = "volumes", required = true)
    @ApiModelProperty(required = true, value = "Quantidade de volumes da remessa. Máximo de 4 caracteres numéricos (de 1 a 9999).")
    /**
     * Quantidade de volumes da remessa. Máximo de 4 caracteres numéricos (de 1 a 9999).
     **/
    private Integer volumes = null;

    /**
     * Descrição da remessa. Máximo de 4.000 caracteres, que podem ser letras, números, além de quaisquer caracteres referentes a codificação UTF-8.
     *
     * @return descricao
     **/
    @JsonProperty("descricao")
    @NotNull
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public DadosDaRemessaParaRegistroERetificaoDeLoteDIR descricao(String descricao) {
        this.descricao = descricao;
        return this;
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

    /**
     * Indica se a remessa tem destinação comercial ou não. Sim – &#39;s&#39; e Não – &#39;n&#39;.
     *
     * @return destinacaoComercial
     **/
    @JsonProperty("destinacaoComercial")
    @NotNull
    public String getDestinacaoComercial() {
        return destinacaoComercial;
    }

    public void setDestinacaoComercial(String destinacaoComercial) {
        this.destinacaoComercial = destinacaoComercial;
    }

    /**
     * Get destinatario
     *
     * @return destinatario
     **/
    @JsonProperty("destinatario")
    @NotNull
    public PessoaParaRegistroERetificaoDeLoteDIR getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(PessoaParaRegistroERetificaoDeLoteDIR destinatario) {
        this.destinatario = destinatario;
    }

    public DadosDaRemessaParaRegistroERetificaoDeLoteDIR destinatario(PessoaParaRegistroERetificaoDeLoteDIR destinatario) {
        this.destinatario = destinatario;
        return this;
    }

    public DadosDaRemessaParaRegistroERetificaoDeLoteDIR destinacaoComercial(String destinacaoComercial) {
        this.destinacaoComercial = destinacaoComercial;
        return this;
    }

    /**
     * Valor do frete a ser cobrado sobre a remessa. Número fracionário, aceitando no máximo até 9 dígitos antes do ponto e 2 dígitos após o ponto. Para este campo, é permitido o envio de &#39;0.00&#39; caso o valor do frete da remessa seja igual a &#39;0.00&#39;.
     *
     * @return frete
     **/
    @JsonProperty("frete")
    @NotNull
    public BigDecimal getFrete() {
        return frete;
    }

    public void setFrete(BigDecimal frete) {
        this.frete = frete;
    }

    public DadosDaRemessaParaRegistroERetificaoDeLoteDIR frete(BigDecimal frete) {
        this.frete = frete;
        return this;
    }

    /**
     * Modo de pagamento do frete. Valores pré-definidos: &#39;PREPAID&#39; ou &#39;COLLECT&#39;.
     *
     * @return freteModoPagto
     **/
    @JsonProperty("freteModoPagto")
    @NotNull
    public String getFreteModoPagto() {
        return freteModoPagto;
    }

    public void setFreteModoPagto(String freteModoPagto) {
        this.freteModoPagto = freteModoPagto;
    }

    /**
     * Informações complementares referentes à remessa. Máximo de 4.000 caracteres, que podem ser letras, números, além de quaisquer caracteres referentes a codificação UTF-8.
     *
     * @return infoCompl
     **/
    @JsonProperty("infoCompl")
    @Size(min = 1, max = 4000)
    public String getInfoCompl() {
        return infoCompl;
    }

    public void setInfoCompl(String infoCompl) {
        this.infoCompl = infoCompl;
    }

    public DadosDaRemessaParaRegistroERetificaoDeLoteDIR infoCompl(String infoCompl) {
        this.infoCompl = infoCompl;
        return this;
    }

    public DadosDaRemessaParaRegistroERetificaoDeLoteDIR freteModoPagto(String freteModoPagto) {
        this.freteModoPagto = freteModoPagto;
        return this;
    }

    /**
     * Informações de fiscalização. Máximo de 500 caracteres, que podem ser letras, números, além de quaisquer caracteres referentes a codificação UTF-8.
     *
     * @return infoFiscalizacao
     **/
    @JsonProperty("infoFiscalizacao")
    @Size(min = 1, max = 500)
    public String getInfoFiscalizacao() {
        return infoFiscalizacao;
    }

    public void setInfoFiscalizacao(String infoFiscalizacao) {
        this.infoFiscalizacao = infoFiscalizacao;
    }

    public DadosDaRemessaParaRegistroERetificaoDeLoteDIR infoFiscalizacao(String infoFiscalizacao) {
        this.infoFiscalizacao = infoFiscalizacao;
        return this;
    }

    /**
     * Lista de mercadorias.
     *
     * @return mercadorias
     **/
    @JsonProperty("mercadorias")
    @NotNull
    public List<MercadoriaParaRegistroERetificaoDeLoteDIR> getMercadorias() {
        return mercadorias;
    }

    public void setMercadorias(List<MercadoriaParaRegistroERetificaoDeLoteDIR> mercadorias) {
        this.mercadorias = mercadorias;
    }

    public DadosDaRemessaParaRegistroERetificaoDeLoteDIR mercadorias(List<MercadoriaParaRegistroERetificaoDeLoteDIR> mercadorias) {
        this.mercadorias = mercadorias;
        return this;
    }

    public DadosDaRemessaParaRegistroERetificaoDeLoteDIR addMercadoriasItem(MercadoriaParaRegistroERetificaoDeLoteDIR mercadoriasItem) {
        this.mercadorias.add(mercadoriasItem);
        return this;
    }

    /**
     * Código da moeda referente ao valor do frete. Valores de acordo com a tabela de domínio. O código de moeda contido no arquivo deve ter exatamente 3 dígitos.
     *
     * @return moedaFrete
     **/
    @JsonProperty("moedaFrete")
    @NotNull
    public String getMoedaFrete() {
        return moedaFrete;
    }

    public void setMoedaFrete(String moedaFrete) {
        this.moedaFrete = moedaFrete;
    }

    /**
     * Número do Master (11 caracteres numéricos) ou o número da Mala Postal (29 caracteres alfanuméricos).
     *
     * @return numeroMaster
     **/
    @JsonProperty("numeroMaster")
    @NotNull
    @Size(min = 11, max = 29)
    public String getNumeroMaster() {
        return numeroMaster;
    }

    public void setNumeroMaster(String numeroMaster) {
        this.numeroMaster = numeroMaster;
    }

    public DadosDaRemessaParaRegistroERetificaoDeLoteDIR numeroMaster(String numeroMaster) {
        this.numeroMaster = numeroMaster;
        return this;
    }

    public DadosDaRemessaParaRegistroERetificaoDeLoteDIR moedaFrete(String moedaFrete) {
        this.moedaFrete = moedaFrete;
        return this;
    }

    /**
     * Número da remessa composto por no máximo 18 caracteres alfanuméricos.
     *
     * @return numeroRemessa
     **/
    @JsonProperty("numeroRemessa")
    @NotNull
    @Size(min = 1, max = 18)
    public String getNumeroRemessa() {
        return numeroRemessa;
    }

    public void setNumeroRemessa(String numeroRemessa) {
        this.numeroRemessa = numeroRemessa;
    }

    public DadosDaRemessaParaRegistroERetificaoDeLoteDIR numeroRemessa(String numeroRemessa) {
        this.numeroRemessa = numeroRemessa;
        return this;
    }

    /**
     * Peso em quilogramas da remessa. Número fracionário, maior que zero, aceitando no máximo até 10 dígitos antes do ponto e 2 dígitos após o ponto. O peso da remessa deve ser maior ou igual ao somatório dos pesos das suas mercadorias.
     *
     * @return peso
     **/
    @JsonProperty("peso")
    @NotNull
    public BigDecimal getPeso() {
        return peso;
    }

    public void setPeso(BigDecimal peso) {
        this.peso = peso;
    }

    public DadosDaRemessaParaRegistroERetificaoDeLoteDIR peso(BigDecimal peso) {
        this.peso = peso;
        return this;
    }

    /**
     * Get remessaConforme
     *
     * @return remessaConforme
     **/
    @JsonProperty("remessaConforme")
    public RemessaConformeParaRegistroERetificaoDeLoteDIR getRemessaConforme() {
        return remessaConforme;
    }

    public void setRemessaConforme(RemessaConformeParaRegistroERetificaoDeLoteDIR remessaConforme) {
        this.remessaConforme = remessaConforme;
    }

    public DadosDaRemessaParaRegistroERetificaoDeLoteDIR remessaConforme(RemessaConformeParaRegistroERetificaoDeLoteDIR remessaConforme) {
        this.remessaConforme = remessaConforme;
        return this;
    }

    /**
     * Get remetente
     *
     * @return remetente
     **/
    @JsonProperty("remetente")
    @NotNull
    public PessoaParaRegistroERetificaoDeLoteDIR getRemetente() {
        return remetente;
    }

    public void setRemetente(PessoaParaRegistroERetificaoDeLoteDIR remetente) {
        this.remetente = remetente;
    }

    public DadosDaRemessaParaRegistroERetificaoDeLoteDIR remetente(PessoaParaRegistroERetificaoDeLoteDIR remetente) {
        this.remetente = remetente;
        return this;
    }

    /**
     * Quantidade de volumes da remessa. Máximo de 4 caracteres numéricos (de 1 a 9999).
     * minimum: 0
     * maximum: 9999
     * @return volumes
     **/
    @JsonProperty("volumes")
    @NotNull
    @Min(0)
    @Max(9999)
    public Integer getVolumes() {
        return volumes;
    }

    public void setVolumes(Integer volumes) {
        this.volumes = volumes;
    }

    public DadosDaRemessaParaRegistroERetificaoDeLoteDIR volumes(Integer volumes) {
        this.volumes = volumes;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class DadosDaRemessaParaRegistroERetificaoDeLoteDIR {\n" +
                "    descricao: " + toIndentedString(descricao) + "\n" +
                "    destinacaoComercial: " + toIndentedString(destinacaoComercial) + "\n" +
                "    destinatario: " + toIndentedString(destinatario) + "\n" +
                "    frete: " + toIndentedString(frete) + "\n" +
                "    freteModoPagto: " + toIndentedString(freteModoPagto) + "\n" +
                "    infoCompl: " + toIndentedString(infoCompl) + "\n" +
                "    infoFiscalizacao: " + toIndentedString(infoFiscalizacao) + "\n" +
                "    mercadorias: " + toIndentedString(mercadorias) + "\n" +
                "    moedaFrete: " + toIndentedString(moedaFrete) + "\n" +
                "    numeroMaster: " + toIndentedString(numeroMaster) + "\n" +
                "    numeroRemessa: " + toIndentedString(numeroRemessa) + "\n" +
                "    peso: " + toIndentedString(peso) + "\n" +
                "    remessaConforme: " + toIndentedString(remessaConforme) + "\n" +
                "    remetente: " + toIndentedString(remetente) + "\n" +
                "    volumes: " + toIndentedString(volumes) + "\n" +
                "}";
        return sb;
    }
}
