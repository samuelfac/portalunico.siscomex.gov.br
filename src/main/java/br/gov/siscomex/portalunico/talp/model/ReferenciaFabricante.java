package br.gov.siscomex.portalunico.talp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReferenciaFabricante", propOrder =
        {"cpfCnpj", "conhecido", "codigoPais", "operadorEstrangeiro"
        })

@XmlRootElement(name = "ReferenciaFabricante")
/**
 * Valor de um campo composto do tipo Fabricante/Produtor
 **/
@ApiModel(description = "Valor de um campo composto do tipo Fabricante/Produtor")
public class ReferenciaFabricante {

    @XmlElement(name = "cpfCnpj")
    @ApiModelProperty(example = "03141554900", value = "CPF / CNPJ do fabricante. Só deve ser informado se for um fabricante nacional (codigoPais = BR).<br>Tamanho: 11 (CPF) ou 14 (CNPJ)")
    /**
     * CPF / CNPJ do fabricante. Só deve ser informado se for um fabricante nacional (codigoPais = BR).<br>Tamanho: 11 (CPF) ou 14 (CNPJ)
     **/
    private String cpfCnpj = null;

    @XmlElement(name = "conhecido", required = true)
    @ApiModelProperty(example = "true", required = true, value = "Indica se é um fabricante conhecido.<br>")
    /**
     * Indica se é um fabricante conhecido.<br>
     **/
    private Boolean conhecido = null;

    @XmlElement(name = "codigoPais", required = true)
    @ApiModelProperty(example = "AR", required = true, value = "Código na Tabela ISO2 do país do fabricante.<br>Tamanho: 2")
    /**
     * Código na Tabela ISO2 do país do fabricante.<br>Tamanho: 2
     **/
    private String codigoPais = null;

    @XmlElement(name = "operadorEstrangeiro")
    @ApiModelProperty(value = "")
    @Valid
    private ReferenciaOperadorEstrangeiro operadorEstrangeiro = null;

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
     * CPF / CNPJ do fabricante. Só deve ser informado se for um fabricante nacional (codigoPais &#x3D; BR).&lt;br&gt;Tamanho: 11 (CPF) ou 14 (CNPJ)
     *
     * @return cpfCnpj
     **/
    @JsonProperty("cpfCnpj")
    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public ReferenciaFabricante cpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
        return this;
    }

    /**
     * Indica se é um fabricante conhecido.&lt;br&gt;
     *
     * @return conhecido
     **/
    @JsonProperty("conhecido")
    @NotNull
    public Boolean isisConhecido() {
        return conhecido;
    }

    public void setConhecido(Boolean conhecido) {
        this.conhecido = conhecido;
    }

    public ReferenciaFabricante conhecido(Boolean conhecido) {
        this.conhecido = conhecido;
        return this;
    }

    /**
     * Código na Tabela ISO2 do país do fabricante.&lt;br&gt;Tamanho: 2
     *
     * @return codigoPais
     **/
    @JsonProperty("codigoPais")
    @NotNull
    public String getCodigoPais() {
        return codigoPais;
    }

    public void setCodigoPais(String codigoPais) {
        this.codigoPais = codigoPais;
    }

    public ReferenciaFabricante codigoPais(String codigoPais) {
        this.codigoPais = codigoPais;
        return this;
    }

    /**
     * Get operadorEstrangeiro
     *
     * @return operadorEstrangeiro
     **/
    @JsonProperty("operadorEstrangeiro")
    public ReferenciaOperadorEstrangeiro getOperadorEstrangeiro() {
        return operadorEstrangeiro;
    }

    public void setOperadorEstrangeiro(ReferenciaOperadorEstrangeiro operadorEstrangeiro) {
        this.operadorEstrangeiro = operadorEstrangeiro;
    }

    public ReferenciaFabricante operadorEstrangeiro(ReferenciaOperadorEstrangeiro operadorEstrangeiro) {
        this.operadorEstrangeiro = operadorEstrangeiro;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class ReferenciaFabricante {\n" +
                "    cpfCnpj: " + toIndentedString(cpfCnpj) + "\n" +
                "    conhecido: " + toIndentedString(conhecido) + "\n" +
                "    codigoPais: " + toIndentedString(codigoPais) + "\n" +
                "    operadorEstrangeiro: " + toIndentedString(operadorEstrangeiro) + "\n" +
                "}";
        return sb;
    }
}
