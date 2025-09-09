package br.gov.siscomex.portalunico.dimp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SefazAtributoTributoCover", propOrder =
        {"codigo", "valor", "tipoCampoAdicional", "tipoAtributo", "descricao"
        })

@XmlRootElement(name = "SefazAtributoTributoCover")
/**
 * Dados de um atributo de tributo
 **/
@ApiModel(description = "Dados de um atributo de tributo")
public class SefazAtributoTributoCover {

    @XmlElement(name = "codigo")
    @ApiModelProperty(example = "ATT_0001", value = "Código do atributo no cadastro de atributos<br>Tamanho mínimo: 1<br>Tamanho máximo: 12")
    /**
     * Código do atributo no cadastro de atributos<br>Tamanho mínimo: 1<br>Tamanho máximo: 12
     **/
    private String codigo = null;

    @XmlElement(name = "valor")
    @ApiModelProperty(example = "Valor atribuido pelo importador ao atributo representado pelo codigo 'ATT_0001'", value = "Valor do atributo<br>Tamanho mínimo: 0<br>Tamanho máximo: 10000")
    /**
     * Valor do atributo<br>Tamanho mínimo: 0<br>Tamanho máximo: 10000
     **/
    private String valor = null;

    @XmlElement(name = "tipoCampoAdicional")
    @ApiModelProperty(example = "OUTROS", value = "Tipo de campo adicional no sistema Tratamento Tributário<br>Dominio: EX<br>NALADI<br>NCM<br>OUTROS<br>Tamanho mínimo: 1<br>Tamanho máximo: 25")
    /**
     * Tipo de campo adicional no sistema Tratamento Tributário<br>Dominio: EX<br>NALADI<br>NCM<br>OUTROS<br>Tamanho mínimo: 1<br>Tamanho máximo: 25
     **/
    private String tipoCampoAdicional = null;

    @XmlElement(name = "tipoAtributo")
    @ApiModelProperty(example = "texto", value = "Tipo de Atributo.<br>Dominio: Tipos de Atributo existentes no sistema Cadastro de Atributos.")
    /**
     * Tipo de Atributo.<br>Dominio: Tipos de Atributo existentes no sistema Cadastro de Atributos.
     **/
    private String tipoAtributo = null;

    @XmlElement(name = "descricao")
    @ApiModelProperty(example = "Naladi", value = "Descrição do atributo<br>Tamanho mínimo: 1<br>Tamanho máximo: 150")
    /**
     * Descrição do atributo<br>Tamanho mínimo: 1<br>Tamanho máximo: 150
     **/
    private String descricao = null;

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
     * Código do atributo no cadastro de atributos&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 12
     *
     * @return codigo
     **/
    @JsonProperty("codigo")
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public SefazAtributoTributoCover codigo(String codigo) {
        this.codigo = codigo;
        return this;
    }

    /**
     * Valor do atributo&lt;br&gt;Tamanho mínimo: 0&lt;br&gt;Tamanho máximo: 10000
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

    public SefazAtributoTributoCover valor(String valor) {
        this.valor = valor;
        return this;
    }

    /**
     * Tipo de campo adicional no sistema Tratamento Tributário&lt;br&gt;Dominio: EX&lt;br&gt;NALADI&lt;br&gt;NCM&lt;br&gt;OUTROS&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 25
     *
     * @return tipoCampoAdicional
     **/
    @JsonProperty("tipoCampoAdicional")
    public String getTipoCampoAdicional() {
        return tipoCampoAdicional;
    }

    public void setTipoCampoAdicional(String tipoCampoAdicional) {
        this.tipoCampoAdicional = tipoCampoAdicional;
    }

    public SefazAtributoTributoCover tipoCampoAdicional(String tipoCampoAdicional) {
        this.tipoCampoAdicional = tipoCampoAdicional;
        return this;
    }

    /**
     * Tipo de Atributo.&lt;br&gt;Dominio: Tipos de Atributo existentes no sistema Cadastro de Atributos.
     *
     * @return tipoAtributo
     **/
    @JsonProperty("tipoAtributo")
    public String getTipoAtributo() {
        return tipoAtributo;
    }

    public void setTipoAtributo(String tipoAtributo) {
        this.tipoAtributo = tipoAtributo;
    }

    public SefazAtributoTributoCover tipoAtributo(String tipoAtributo) {
        this.tipoAtributo = tipoAtributo;
        return this;
    }

    /**
     * Descrição do atributo&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 150
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

    public SefazAtributoTributoCover descricao(String descricao) {
        this.descricao = descricao;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class SefazAtributoTributoCover {\n" +
                "    codigo: " + toIndentedString(codigo) + "\n" +
                "    valor: " + toIndentedString(valor) + "\n" +
                "    tipoCampoAdicional: " + toIndentedString(tipoCampoAdicional) + "\n" +
                "    tipoAtributo: " + toIndentedString(tipoAtributo) + "\n" +
                "    descricao: " + toIndentedString(descricao) + "\n" +
                "}";
        return sb;
    }
}
