package br.gov.siscomex.portalunico.cctr.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Recebedor", propOrder =
        {"cnpj", "cpf", "nomeEstrangeiro", "viaTransporte"
        })

@XmlRootElement(name = "Recebedor")
/**
 * Dados do interveniente que está recebendo a carga.<br>É obrigatório informar apenas um dos dois: CNPJ ou CPF.
 **/
@ApiModel(description = "Dados do interveniente que está recebendo a carga.<br>É obrigatório informar apenas um dos dois: CNPJ ou CPF.")
public class Recebedor {

    @XmlElement(name = "cnpj")
    @ApiModelProperty(example = "15573459000106", value = "CNPJ do recebedor<br>Tamanho: 14<br>Formato: NNNNNNNNNNNNNN<br>Informado apenas quando o recebedor for nacional e pessoa jurídica.")
    /**
     * CNPJ do recebedor<br>Tamanho: 14<br>Formato: NNNNNNNNNNNNNN<br>Informado apenas quando o recebedor for nacional e pessoa jurídica.
     **/
    private String cnpj = null;

    @XmlElement(name = "cpf")
    @ApiModelProperty(example = "15573459106", value = "CPF do recebedor<br>Tamanho: 11<br>Formato: NNNNNNNNNNN<br>Informado apenas quando o recebedor for nacional e pessoa física.")
    /**
     * CPF do recebedor<br>Tamanho: 11<br>Formato: NNNNNNNNNNN<br>Informado apenas quando o recebedor for nacional e pessoa física.
     **/
    private String cpf = null;

    @XmlElement(name = "nomeEstrangeiro")
    @ApiModelProperty(example = "Nome Estrangeiro", value = "Nome do recebedor<br>Tamanho: 60<br>Informado apenas quando o recebedor for estrangeiro.")
    /**
     * Nome do recebedor<br>Tamanho: 60<br>Informado apenas quando o recebedor for estrangeiro.
     **/
    private String nomeEstrangeiro = null;

    @XmlElement(name = "viaTransporte", required = true)
    @ApiModelProperty(example = "1", required = true, value = "Código da via de transporte<br>Tamanho: 2<br>Formato: NN")
    /**
     * Código da via de transporte<br>Tamanho: 2<br>Formato: NN
     **/
    private Integer viaTransporte = null;

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
     * CNPJ do recebedor&lt;br&gt;Tamanho: 14&lt;br&gt;Formato: NNNNNNNNNNNNNN&lt;br&gt;Informado apenas quando o recebedor for nacional e pessoa jurídica.
     *
     * @return cnpj
     **/
    @JsonProperty("cnpj")
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    /**
     * CPF do recebedor&lt;br&gt;Tamanho: 11&lt;br&gt;Formato: NNNNNNNNNNN&lt;br&gt;Informado apenas quando o recebedor for nacional e pessoa física.
     *
     * @return cpf
     **/
    @JsonProperty("cpf")
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Recebedor cpf(String cpf) {
        this.cpf = cpf;
        return this;
    }

    public Recebedor cnpj(String cnpj) {
        this.cnpj = cnpj;
        return this;
    }

    /**
     * Nome do recebedor&lt;br&gt;Tamanho: 60&lt;br&gt;Informado apenas quando o recebedor for estrangeiro.
     *
     * @return nomeEstrangeiro
     **/
    @JsonProperty("nomeEstrangeiro")
    public String getNomeEstrangeiro() {
        return nomeEstrangeiro;
    }

    public void setNomeEstrangeiro(String nomeEstrangeiro) {
        this.nomeEstrangeiro = nomeEstrangeiro;
    }

    /**
     * Código da via de transporte&lt;br&gt;Tamanho: 2&lt;br&gt;Formato: NN
     *
     * @return viaTransporte
     **/
    @JsonProperty("viaTransporte")
    @NotNull
    public Integer getViaTransporte() {
        return viaTransporte;
    }

    public void setViaTransporte(Integer viaTransporte) {
        this.viaTransporte = viaTransporte;
    }

    public Recebedor viaTransporte(Integer viaTransporte) {
        this.viaTransporte = viaTransporte;
        return this;
    }

    public Recebedor nomeEstrangeiro(String nomeEstrangeiro) {
        this.nomeEstrangeiro = nomeEstrangeiro;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class Recebedor {\n" +
                "    cnpj: " + toIndentedString(cnpj) + "\n" +
                "    cpf: " + toIndentedString(cpf) + "\n" +
                "    nomeEstrangeiro: " + toIndentedString(nomeEstrangeiro) + "\n" +
                "    viaTransporte: " + toIndentedString(viaTransporte) + "\n" +
                "}";
        return sb;
    }
}
