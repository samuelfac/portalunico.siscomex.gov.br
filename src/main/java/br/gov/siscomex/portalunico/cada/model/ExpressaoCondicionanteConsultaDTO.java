package br.gov.siscomex.portalunico.cada.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExpressaoCondicionanteConsultaDTO", propOrder =
        {"condicao", "composicao", "valor", "operador"
        })

@XmlRootElement(name = "ExpressaoCondicionanteConsultaDTO")
public class ExpressaoCondicionanteConsultaDTO {

    @XmlElement(name = "condicao")
    @ApiModelProperty(value = "")
    @Valid
    private ExpressaoCondicionanteConsultaDTO condicao = null;

    @XmlElement(name = "composicao")
    @ApiModelProperty(value = "")
    private String composicao = null;

    @XmlElement(name = "valor")
    @ApiModelProperty(value = "")
    private String valor = null;

    @XmlElement(name = "operador")
    @ApiModelProperty(value = "")
    private String operador = null;

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
     * Get condicao
     *
     * @return condicao
     **/
    @JsonProperty("condicao")
    public ExpressaoCondicionanteConsultaDTO getCondicao() {
        return condicao;
    }

    public void setCondicao(ExpressaoCondicionanteConsultaDTO condicao) {
        this.condicao = condicao;
    }

    public ExpressaoCondicionanteConsultaDTO condicao(ExpressaoCondicionanteConsultaDTO condicao) {
        this.condicao = condicao;
        return this;
    }

    /**
     * Get composicao
     *
     * @return composicao
     **/
    @JsonProperty("composicao")
    public String getComposicao() {
        return composicao;
    }

    public void setComposicao(String composicao) {
        this.composicao = composicao;
    }

    public ExpressaoCondicionanteConsultaDTO composicao(String composicao) {
        this.composicao = composicao;
        return this;
    }

    /**
     * Get valor
     *
     * @return valor
     **/
    @JsonProperty("valor")
    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public ExpressaoCondicionanteConsultaDTO valor(String valor) {
        this.valor = valor;
        return this;
    }

    /**
     * Get operador
     *
     * @return operador
     **/
    @JsonProperty("operador")
    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }

    public ExpressaoCondicionanteConsultaDTO operador(String operador) {
        this.operador = operador;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class ExpressaoCondicionanteConsultaDTO {\n" +
                "    condicao: " + toIndentedString(condicao) + "\n" +
                "    composicao: " + toIndentedString(composicao) + "\n" +
                "    valor: " + toIndentedString(valor) + "\n" +
                "    operador: " + toIndentedString(operador) + "\n" +
                "}";
        return sb;
    }
}
