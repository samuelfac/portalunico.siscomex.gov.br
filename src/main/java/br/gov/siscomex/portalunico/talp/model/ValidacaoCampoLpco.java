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
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidacaoCampoLpco", propOrder =
        {"obrigatorio", "permiteMultiplosValores", "mascara", "tamanhoMaximo", "qtdCasasDecimais", "dominios"
        })

@XmlRootElement(name = "ValidacaoCampoLpco")
/**
 * Regras de validação de um campo de um LPCO
 **/
@ApiModel(description = "Regras de validação de um campo de um LPCO")
public class ValidacaoCampoLpco {

    @XmlElement(name = "obrigatorio", required = true)
    @ApiModelProperty(example = "true", required = true, value = "Indica se o campo é obrigatório. Caso seja um atributo condicionado e esteja marcado como obrigatório, ele deverá ser preenchido se a condição for cumprida.")
    /**
     * Indica se o campo é obrigatório. Caso seja um atributo condicionado e esteja marcado como obrigatório, ele deverá ser preenchido se a condição for cumprida.
     **/
    private Boolean obrigatorio = null;

    @XmlElement(name = "permiteMultiplosValores", required = true)
    @ApiModelProperty(example = "true", required = true, value = "Indica se o campo permite mais do que um valor")
    /**
     * Indica se o campo permite mais do que um valor
     **/
    private Boolean permiteMultiplosValores = null;

    @XmlElement(name = "mascara")
    @ApiModelProperty(example = "A9999", value = "Máscara de restrição de entrada de dados do campo. Definições: 9: dígito numérico; A: dígito alfanumérico; *: dígito numérico ou alfanumérico")
    /**
     * Máscara de restrição de entrada de dados do campo. Definições: 9: dígito numérico; A: dígito alfanumérico; *: dígito numérico ou alfanumérico
     **/
    private String mascara = null;

    @XmlElement(name = "tamanhoMaximo")
    @ApiModelProperty(example = "6", value = "Tamanho máximo, em dígitos, do campo")
    /**
     * Tamanho máximo, em dígitos, do campo
     **/
    private Integer tamanhoMaximo = null;

    @XmlElement(name = "qtdCasasDecimais")
    @ApiModelProperty(example = "2", value = "Quantidade de casas decimais, se o campo for um número real")
    /**
     * Quantidade de casas decimais, se o campo for um número real
     **/
    private Integer qtdCasasDecimais = null;

    @XmlElement(name = "dominios")
    @ApiModelProperty(value = "Lista de valores permitidos para campos com domínio definido. Se o campo não tiver um domínio de valores definido, este campo não será informado. Se o campo for do tipo LISTA_TABX_FILTRO, este campo também não será informado, mas ele pode ser recuperado pelo serviço ext/lpco/modelo{codigoModelo}/dominio/{codigoCampo}. O valor do campo deverá ser igual ao id do item de domínio.")
    @Valid
    /**
     * Lista de valores permitidos para campos com domínio definido. Se o campo não tiver um domínio de valores definido, este campo não será informado. Se o campo for do tipo LISTA_TABX_FILTRO, este campo também não será informado, mas ele pode ser recuperado pelo serviço ext/lpco/modelo{codigoModelo}/dominio/{codigoCampo}. O valor do campo deverá ser igual ao id do item de domínio.
     **/
    private List<IdDescricao> dominios = null;

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
     * Indica se o campo é obrigatório. Caso seja um atributo condicionado e esteja marcado como obrigatório, ele deverá ser preenchido se a condição for cumprida.
     *
     * @return obrigatorio
     **/
    @JsonProperty("obrigatorio")
    @NotNull
    public Boolean isisObrigatorio() {
        return obrigatorio;
    }

    public void setObrigatorio(Boolean obrigatorio) {
        this.obrigatorio = obrigatorio;
    }

    /**
     * Indica se o campo permite mais do que um valor
     *
     * @return permiteMultiplosValores
     **/
    @JsonProperty("permiteMultiplosValores")
    @NotNull
    public Boolean isisPermiteMultiplosValores() {
        return permiteMultiplosValores;
    }

    public void setPermiteMultiplosValores(Boolean permiteMultiplosValores) {
        this.permiteMultiplosValores = permiteMultiplosValores;
    }

    public ValidacaoCampoLpco permiteMultiplosValores(Boolean permiteMultiplosValores) {
        this.permiteMultiplosValores = permiteMultiplosValores;
        return this;
    }

    public ValidacaoCampoLpco obrigatorio(Boolean obrigatorio) {
        this.obrigatorio = obrigatorio;
        return this;
    }

    /**
     * Máscara de restrição de entrada de dados do campo. Definições: 9: dígito numérico; A: dígito alfanumérico; *: dígito numérico ou alfanumérico
     *
     * @return mascara
     **/
    @JsonProperty("mascara")
    public String getMascara() {
        return mascara;
    }

    public void setMascara(String mascara) {
        this.mascara = mascara;
    }

    public ValidacaoCampoLpco mascara(String mascara) {
        this.mascara = mascara;
        return this;
    }

    /**
     * Tamanho máximo, em dígitos, do campo
     *
     * @return tamanhoMaximo
     **/
    @JsonProperty("tamanhoMaximo")
    public Integer getTamanhoMaximo() {
        return tamanhoMaximo;
    }

    public void setTamanhoMaximo(Integer tamanhoMaximo) {
        this.tamanhoMaximo = tamanhoMaximo;
    }

    /**
     * Quantidade de casas decimais, se o campo for um número real
     *
     * @return qtdCasasDecimais
     **/
    @JsonProperty("qtdCasasDecimais")
    public Integer getQtdCasasDecimais() {
        return qtdCasasDecimais;
    }

    public void setQtdCasasDecimais(Integer qtdCasasDecimais) {
        this.qtdCasasDecimais = qtdCasasDecimais;
    }

    public ValidacaoCampoLpco qtdCasasDecimais(Integer qtdCasasDecimais) {
        this.qtdCasasDecimais = qtdCasasDecimais;
        return this;
    }

    /**
     * Lista de valores permitidos para campos com domínio definido. Se o campo não tiver um domínio de valores definido, este campo não será informado. Se o campo for do tipo LISTA_TABX_FILTRO, este campo também não será informado, mas ele pode ser recuperado pelo serviço ext/lpco/modelo{codigoModelo}/dominio/{codigoCampo}. O valor do campo deverá ser igual ao id do item de domínio.
     *
     * @return dominios
     **/
    @JsonProperty("dominios")
    public List<IdDescricao> getDominios() {
        return dominios;
    }

    public void setDominios(List<IdDescricao> dominios) {
        this.dominios = dominios;
    }

    public ValidacaoCampoLpco dominios(List<IdDescricao> dominios) {
        this.dominios = dominios;
        return this;
    }

    public ValidacaoCampoLpco addDominiosItem(IdDescricao dominiosItem) {
        this.dominios.add(dominiosItem);
        return this;
    }

    public ValidacaoCampoLpco tamanhoMaximo(Integer tamanhoMaximo) {
        this.tamanhoMaximo = tamanhoMaximo;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class ValidacaoCampoLpco {\n" +
                "    obrigatorio: " + toIndentedString(obrigatorio) + "\n" +
                "    permiteMultiplosValores: " + toIndentedString(permiteMultiplosValores) + "\n" +
                "    mascara: " + toIndentedString(mascara) + "\n" +
                "    tamanhoMaximo: " + toIndentedString(tamanhoMaximo) + "\n" +
                "    qtdCasasDecimais: " + toIndentedString(qtdCasasDecimais) + "\n" +
                "    dominios: " + toIndentedString(dominios) + "\n" +
                "}";
        return sb;
    }
}
