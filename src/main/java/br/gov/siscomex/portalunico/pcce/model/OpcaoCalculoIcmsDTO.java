package br.gov.siscomex.portalunico.pcce.model;

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
@XmlType(name = "OpcaoCalculoIcmsDTO", propOrder =
        {"codigoOpcao", "descricaoOpcao", "opcaoIcms"
        })

@XmlRootElement(name = "OpcaoCalculoIcmsDTO")
/**
 * Dados da opção disponibilizada pela Sefaz para solicitação de cálculo
 **/
@ApiModel(description = "Dados da opção disponibilizada pela Sefaz para solicitação de cálculo")
public class OpcaoCalculoIcmsDTO {

    @XmlElement(name = "codigoOpcao", required = true)
    @ApiModelProperty(example = "9999", required = true, value = "Codigo identificador da opção<br>Tamanho: 4")
    /**
     * Codigo identificador da opção<br>Tamanho: 4
     **/
    private String codigoOpcao = null;

    @XmlElement(name = "descricaoOpcao", required = true)
    @ApiModelProperty(example = "Id eu nisl nunc mi", required = true, value = "Descrição da opção")
    /**
     * Descrição da opção
     **/
    private String descricaoOpcao = null;

    @XmlElement(name = "opcaoIcms", required = true)
    @ApiModelProperty(example = "5", required = true, value = "Identificador único da opção no PCCE")
    /**
     * Identificador único da opção no PCCE
     **/
    private Long opcaoIcms = null;

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
     * Codigo identificador da opção&lt;br&gt;Tamanho: 4
     *
     * @return codigoOpcao
     **/
    @JsonProperty("codigoOpcao")
    @NotNull
    public String getCodigoOpcao() {
        return codigoOpcao;
    }

    public void setCodigoOpcao(String codigoOpcao) {
        this.codigoOpcao = codigoOpcao;
    }

    /**
     * Descrição da opção
     *
     * @return descricaoOpcao
     **/
    @JsonProperty("descricaoOpcao")
    @NotNull
    public String getDescricaoOpcao() {
        return descricaoOpcao;
    }

    public void setDescricaoOpcao(String descricaoOpcao) {
        this.descricaoOpcao = descricaoOpcao;
    }

    public OpcaoCalculoIcmsDTO descricaoOpcao(String descricaoOpcao) {
        this.descricaoOpcao = descricaoOpcao;
        return this;
    }

    /**
     * Identificador único da opção no PCCE
     *
     * @return opcaoIcms
     **/
    @JsonProperty("opcaoIcms")
    @NotNull
    public Long getOpcaoIcms() {
        return opcaoIcms;
    }

    public void setOpcaoIcms(Long opcaoIcms) {
        this.opcaoIcms = opcaoIcms;
    }

    public OpcaoCalculoIcmsDTO opcaoIcms(Long opcaoIcms) {
        this.opcaoIcms = opcaoIcms;
        return this;
    }

    public OpcaoCalculoIcmsDTO codigoOpcao(String codigoOpcao) {
        this.codigoOpcao = codigoOpcao;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class OpcaoCalculoIcmsDTO {\n" +
                "    codigoOpcao: " + toIndentedString(codigoOpcao) + "\n" +
                "    descricaoOpcao: " + toIndentedString(descricaoOpcao) + "\n" +
                "    opcaoIcms: " + toIndentedString(opcaoIcms) + "\n" +
                "}";
        return sb;
    }
}
