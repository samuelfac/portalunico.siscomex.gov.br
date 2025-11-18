package br.gov.siscomex.portalunico.remx.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.DecimalMin;
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

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DadosDaRemessaParaRegistroERetificaoDeManifesto", propOrder =
        {"descricao", "destinatario", "frete", "freteModoPagto", "moedaFrete", "moedaValorTotal", "numeroMaster", "numeroRemessa", "peso", "remetente", "valorTotal", "volumes"
        })

@XmlRootElement(name = "DadosDaRemessaParaRegistroERetificaoDeManifesto")
public class DadosDaRemessaParaRegistroERetificaoDeManifesto {

    @XmlElement(name = "descricao", required = true)
    @ApiModelProperty(required = true, value = "Descrição da remessa. Máximo de 4.000 caracteres, que podem ser letras, números, além de quaisquer caracteres referentes a codificação UTF-8.")
    /**
     * Descrição da remessa. Máximo de 4.000 caracteres, que podem ser letras, números, além de quaisquer caracteres referentes a codificação UTF-8.
     **/
    private String descricao = null;

    @XmlElement(name = "destinatario", required = true)
    @ApiModelProperty(required = true, value = "")
    @Valid
    private PessoaParaRegistroERetificaoDeManifesto destinatario = null;

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

    @XmlElement(name = "moedaFrete", required = true)
    @ApiModelProperty(required = true, value = "Código da moeda referente ao valor do frete. Valores de acordo com a tabela de domínio. O código de moeda contido no arquivo deve ter exatamente 3 dígitos.")
    /**
     * Código da moeda referente ao valor do frete. Valores de acordo com a tabela de domínio. O código de moeda contido no arquivo deve ter exatamente 3 dígitos.
     **/
    private String moedaFrete = null;

    @XmlElement(name = "moedaValorTotal", required = true)
    @ApiModelProperty(required = true, value = "Código da moeda do valor total. Valores de acordo com a tabela de domínio. O código de moeda contido na estrutura deve ter exatamente 3 dígitos.")
    /**
     * Código da moeda do valor total. Valores de acordo com a tabela de domínio. O código de moeda contido na estrutura deve ter exatamente 3 dígitos.
     **/
    private String moedaValorTotal = null;

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

    @XmlElement(name = "remetente", required = true)
    @ApiModelProperty(required = true, value = "")
    @Valid
    private PessoaParaRegistroERetificaoDeManifesto remetente = null;

    @XmlElement(name = "valorTotal", required = true)
    @ApiModelProperty(required = true, value = "Valor total da remessa. Número fracionário, aceitando no máximo até 10 dígitos antes do ponto e 2 dígitos após o ponto. Para este campo, é permitido o envio de '0.00' caso o valor total das mercadorias da remessa seja igual a '0.00'.")
    @Valid
    /**
     * Valor total da remessa. Número fracionário, aceitando no máximo até 10 dígitos antes do ponto e 2 dígitos após o ponto. Para este campo, é permitido o envio de '0.00' caso o valor total das mercadorias da remessa seja igual a '0.00'.
     **/
    private BigDecimal valorTotal = null;

    @XmlElement(name = "volumes", required = true)
    @ApiModelProperty(required = true, value = "Quantidade de volumes da remessa manifestada. Máximo de 4 caracteres numéricos (de 0 a 9999).")
    /**
     * Quantidade de volumes da remessa manifestada. Máximo de 4 caracteres numéricos (de 0 a 9999).
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
    @NotNull
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public DadosDaRemessaParaRegistroERetificaoDeManifesto descricao(String descricao) {
        this.descricao = descricao;
        return this;
    }

    /**
     * Get destinatario
     *
     * @return destinatario
     **/
    @JsonProperty("destinatario")
    @NotNull
    public PessoaParaRegistroERetificaoDeManifesto getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(PessoaParaRegistroERetificaoDeManifesto destinatario) {
        this.destinatario = destinatario;
    }

    public DadosDaRemessaParaRegistroERetificaoDeManifesto destinatario(PessoaParaRegistroERetificaoDeManifesto destinatario) {
        this.destinatario = destinatario;
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

    public DadosDaRemessaParaRegistroERetificaoDeManifesto freteModoPagto(String freteModoPagto) {
        this.freteModoPagto = freteModoPagto;
        return this;
    }

    public DadosDaRemessaParaRegistroERetificaoDeManifesto frete(BigDecimal frete) {
        this.frete = frete;
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

    public DadosDaRemessaParaRegistroERetificaoDeManifesto moedaFrete(String moedaFrete) {
        this.moedaFrete = moedaFrete;
        return this;
    }

    /**
     * Código da moeda do valor total. Valores de acordo com a tabela de domínio. O código de moeda contido na estrutura deve ter exatamente 3 dígitos.
     *
     * @return moedaValorTotal
     **/
    @JsonProperty("moedaValorTotal")
    @NotNull
    public String getMoedaValorTotal() {
        return moedaValorTotal;
    }

    public void setMoedaValorTotal(String moedaValorTotal) {
        this.moedaValorTotal = moedaValorTotal;
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

    public DadosDaRemessaParaRegistroERetificaoDeManifesto numeroMaster(String numeroMaster) {
        this.numeroMaster = numeroMaster;
        return this;
    }

    public DadosDaRemessaParaRegistroERetificaoDeManifesto moedaValorTotal(String moedaValorTotal) {
        this.moedaValorTotal = moedaValorTotal;
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

    /**
     * Peso em quilogramas da remessa. Número fracionário, maior que zero, aceitando no máximo até 10 dígitos antes do ponto e 2 dígitos após o ponto. O peso da remessa deve ser maior ou igual ao somatório dos pesos das suas mercadorias.
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

    public DadosDaRemessaParaRegistroERetificaoDeManifesto peso(BigDecimal peso) {
        this.peso = peso;
        return this;
    }

    public DadosDaRemessaParaRegistroERetificaoDeManifesto numeroRemessa(String numeroRemessa) {
        this.numeroRemessa = numeroRemessa;
        return this;
    }

    /**
     * Get remetente
     *
     * @return remetente
     **/
    @JsonProperty("remetente")
    @NotNull
    public PessoaParaRegistroERetificaoDeManifesto getRemetente() {
        return remetente;
    }

    public void setRemetente(PessoaParaRegistroERetificaoDeManifesto remetente) {
        this.remetente = remetente;
    }

    /**
     * Valor total da remessa. Número fracionário, aceitando no máximo até 10 dígitos antes do ponto e 2 dígitos após o ponto. Para este campo, é permitido o envio de &#39;0.00&#39; caso o valor total das mercadorias da remessa seja igual a &#39;0.00&#39;.
     * minimum: 0
     * @return valorTotal
     **/
    @JsonProperty("valorTotal")
    @NotNull
    @DecimalMin("0")
    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public DadosDaRemessaParaRegistroERetificaoDeManifesto valorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
        return this;
    }

    public DadosDaRemessaParaRegistroERetificaoDeManifesto remetente(PessoaParaRegistroERetificaoDeManifesto remetente) {
        this.remetente = remetente;
        return this;
    }

    public DadosDaRemessaParaRegistroERetificaoDeManifesto volumes(Integer volumes) {
        this.volumes = volumes;
        return this;
    }

    /**
     * Quantidade de volumes da remessa manifestada. Máximo de 4 caracteres numéricos (de 0 a 9999).
     * minimum: 0
     * maximum: 9999
     *
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

    @Override
    public String toString() {

        String sb = "class DadosDaRemessaParaRegistroERetificaoDeManifesto {\n" +
                "    descricao: " + toIndentedString(descricao) + "\n" +
                "    destinatario: " + toIndentedString(destinatario) + "\n" +
                "    frete: " + toIndentedString(frete) + "\n" +
                "    freteModoPagto: " + toIndentedString(freteModoPagto) + "\n" +
                "    moedaFrete: " + toIndentedString(moedaFrete) + "\n" +
                "    moedaValorTotal: " + toIndentedString(moedaValorTotal) + "\n" +
                "    numeroMaster: " + toIndentedString(numeroMaster) + "\n" +
                "    numeroRemessa: " + toIndentedString(numeroRemessa) + "\n" +
                "    peso: " + toIndentedString(peso) + "\n" +
                "    remetente: " + toIndentedString(remetente) + "\n" +
                "    valorTotal: " + toIndentedString(valorTotal) + "\n" +
                "    volumes: " + toIndentedString(volumes) + "\n" +
                "}";
        return sb;
    }
}
