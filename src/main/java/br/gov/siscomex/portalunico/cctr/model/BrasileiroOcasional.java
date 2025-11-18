package br.gov.siscomex.portalunico.cctr.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BrasileiroOcasional", propOrder =
        {"numeroCpf", "numeroCnpj", "dataVencimentoAutorizacao"
        })

@XmlRootElement(name = "BrasileiroOcasional")
/**
 * Dados do transportador brasileiro ocasional
 **/
@ApiModel(description = "Dados do transportador brasileiro ocasional")
public class BrasileiroOcasional {

    @XmlElement(name = "numeroCpf")
    @ApiModelProperty(value = "")
    private String numeroCpf = null;

    @XmlElement(name = "numeroCnpj")
    @ApiModelProperty(value = "")
    private String numeroCnpj = null;

    @XmlElement(name = "dataVencimentoAutorizacao")
    @ApiModelProperty(example = "2030-04-01", value = "Data de vencimento da autorização ocasional<br>Formato: AAAA-MM-DD")
    /**
     * Data de vencimento da autorização ocasional<br>Formato: AAAA-MM-DD
     **/
    private String dataVencimentoAutorizacao = null;

    /**
     * Get numeroCpf
     *
     * @return numeroCpf
     **/
    @JsonProperty("numeroCpf")
    public String getNumeroCpf() {
        return numeroCpf;
    }

    public void setNumeroCpf(String numeroCpf) {
        this.numeroCpf = numeroCpf;
    }

    public BrasileiroOcasional numeroCpf(String numeroCpf) {
        this.numeroCpf = numeroCpf;
        return this;
    }

    /**
     * Get numeroCnpj
     *
     * @return numeroCnpj
     **/
    @JsonProperty("numeroCnpj")
    public String getNumeroCnpj() {
        return numeroCnpj;
    }

    public void setNumeroCnpj(String numeroCnpj) {
        this.numeroCnpj = numeroCnpj;
    }

    public BrasileiroOcasional numeroCnpj(String numeroCnpj) {
        this.numeroCnpj = numeroCnpj;
        return this;
    }

    /**
     * Data de vencimento da autorização ocasional&lt;br&gt;Formato: AAAA-MM-DD
     *
     * @return dataVencimentoAutorizacao
     **/
    @JsonProperty("dataVencimentoAutorizacao")
    public String getDataVencimentoAutorizacao() {
        return dataVencimentoAutorizacao;
    }

    public void setDataVencimentoAutorizacao(String dataVencimentoAutorizacao) {
        this.dataVencimentoAutorizacao = dataVencimentoAutorizacao;
    }

    public BrasileiroOcasional dataVencimentoAutorizacao(String dataVencimentoAutorizacao) {
        this.dataVencimentoAutorizacao = dataVencimentoAutorizacao;
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

    @Override
    public String toString() {

        String sb = "class BrasileiroOcasional {\n" +
                "    numeroCpf: " + toIndentedString(numeroCpf) + "\n" +
                "    numeroCnpj: " + toIndentedString(numeroCnpj) + "\n" +
                "    dataVencimentoAutorizacao: " + toIndentedString(dataVencimentoAutorizacao) + "\n" +
                "}";
        return sb;
    }
}
