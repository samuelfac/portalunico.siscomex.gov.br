package br.gov.siscomex.portalunico.ttce.model;

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
@XmlType(name = "AtributoMercadoriaDTO", propOrder =
        {"codigo", "descricaoCodigo", "tipoCodigo", "valor", "descricaoValor"
        })

@XmlRootElement(name = "AtributoMercadoriaDTO")
/**
 * DTO que representa um Atributo de Mercadoria.<br/>No caso de um atributo cujo campo 'valor' esteja em branco, é preciso verificar a descrição informada no campo 'tipoCodigo', para identificar a forma de preenchimento do valor para a DUIMP.
 **/
@ApiModel(description = "DTO que representa um Atributo de Mercadoria.<br/>No caso de um atributo cujo campo 'valor' esteja em branco, é preciso verificar a descrição informada no campo 'tipoCodigo', para identificar a forma de preenchimento do valor para a DUIMP.")
public class AtributoMercadoriaDTO {

    @XmlElement(name = "codigo", required = true)
    @ApiModelProperty(example = "ATT_2980", required = true, value = "Código do Atributo.")
    /**
     * Código do Atributo.
     **/
    private String codigo = null;

    @XmlElement(name = "descricaoCodigo", required = true)
    @ApiModelProperty(example = "EX II", required = true, value = "Nome de apresentação do Atributo.")
    /**
     * Nome de apresentação do Atributo.
     **/
    private String descricaoCodigo = null;

    @XmlElement(name = "tipoCodigo", required = true)
    @ApiModelProperty(example = "Domínio Dinâmico", required = true, value = "Forma de preenchimento do Atributo. Valores possíveis: Domínio Dinâmico, Lista Estática, Valor Inteiro, Valor Real.")
    /**
     * Forma de preenchimento do Atributo. Valores possíveis: Domínio Dinâmico, Lista Estática, Valor Inteiro, Valor Real.
     **/
    private String tipoCodigo = null;

    @XmlElement(name = "valor")
    @ApiModelProperty(example = "0001", value = "Valor atribuido ao Atributo.")
    /**
     * Valor atribuido ao Atributo.
     **/
    private String valor = null;

    @XmlElement(name = "descricaoValor")
    @ApiModelProperty(example = "EX 0001 - Coletor descartável para perfurocortantes.", value = "Descrição do valor do Atributo.")
    /**
     * Descrição do valor do Atributo.
     **/
    private String descricaoValor = null;

    /**
     * Código do Atributo.
     *
     * @return codigo
     **/
    @JsonProperty("codigo")
    @NotNull
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public AtributoMercadoriaDTO codigo(String codigo) {
        this.codigo = codigo;
        return this;
    }

    /**
     * Nome de apresentação do Atributo.
     *
     * @return descricaoCodigo
     **/
    @JsonProperty("descricaoCodigo")
    @NotNull
    public String getDescricaoCodigo() {
        return descricaoCodigo;
    }

    public void setDescricaoCodigo(String descricaoCodigo) {
        this.descricaoCodigo = descricaoCodigo;
    }

    public AtributoMercadoriaDTO descricaoCodigo(String descricaoCodigo) {
        this.descricaoCodigo = descricaoCodigo;
        return this;
    }

    /**
     * Forma de preenchimento do Atributo. Valores possíveis: Domínio Dinâmico, Lista Estática, Valor Inteiro, Valor Real.
     *
     * @return tipoCodigo
     **/
    @JsonProperty("tipoCodigo")
    @NotNull
    public String getTipoCodigo() {
        return tipoCodigo;
    }

    public void setTipoCodigo(String tipoCodigo) {
        this.tipoCodigo = tipoCodigo;
    }

    public AtributoMercadoriaDTO tipoCodigo(String tipoCodigo) {
        this.tipoCodigo = tipoCodigo;
        return this;
    }

    /**
     * Valor atribuido ao Atributo.
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

    public AtributoMercadoriaDTO valor(String valor) {
        this.valor = valor;
        return this;
    }

    /**
     * Descrição do valor do Atributo.
     *
     * @return descricaoValor
     **/
    @JsonProperty("descricaoValor")
    public String getDescricaoValor() {
        return descricaoValor;
    }

    public void setDescricaoValor(String descricaoValor) {
        this.descricaoValor = descricaoValor;
    }

    public AtributoMercadoriaDTO descricaoValor(String descricaoValor) {
        this.descricaoValor = descricaoValor;
        return this;
    }


    @Override
    public String toString() {

        String sb = "class AtributoMercadoriaDTO {\n" +
                "    codigo: " + toIndentedString(codigo) + "\n" +
                "    descricaoCodigo: " + toIndentedString(descricaoCodigo) + "\n" +
                "    tipoCodigo: " + toIndentedString(tipoCodigo) + "\n" +
                "    valor: " + toIndentedString(valor) + "\n" +
                "    descricaoValor: " + toIndentedString(descricaoValor) + "\n" +
                "}";
        return sb;
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

