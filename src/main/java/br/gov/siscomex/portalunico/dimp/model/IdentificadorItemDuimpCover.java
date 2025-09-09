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
@XmlType(name = "IdentificadorItemDuimpCover", propOrder =
        {"numero", "numeroItem", "versao"
        })

@XmlRootElement(name = "IdentificadorItemDuimpCover")
/**
 * Dados da identificação da declaração única de importação.
 **/
@ApiModel(description = "Dados da identificação da declaração única de importação.")
public class IdentificadorItemDuimpCover {

    @XmlElement(name = "numero")
    @ApiModelProperty(example = "19BR00000004677", value = "Número da Duimp.<br>Tamanho: 15<br>Formato: 'AABRSSSSSSSSSSD'<br>Lei de formação. O número da Duimp é composto por: <br>* AA = Corresponde ao ano do registro da Declaração. <br>* BR = Corresponde à sigla do país de emissão do documento (BR).<br>* SSSSSSSSSS = 10 caracteres numéricos. Número sequencial da Duimp dentro do ano.<br>* D = 1 caracter numérico. DV para todos os demais caracteres numéricos (Módulo 11)")
    /**
     * Número da Duimp.<br>Tamanho: 15<br>Formato: 'AABRSSSSSSSSSSD'<br>Lei de formação. O número da Duimp é composto por: <br>* AA = Corresponde ao ano do registro da Declaração. <br>* BR = Corresponde à sigla do país de emissão do documento (BR).<br>* SSSSSSSSSS = 10 caracteres numéricos. Número sequencial da Duimp dentro do ano.<br>* D = 1 caracter numérico. DV para todos os demais caracteres numéricos (Módulo 11)
     **/
    private String numero = null;

    @XmlElement(name = "numeroItem")
    @ApiModelProperty(example = "1", value = "Número do item da Duimp.<br>Formato: Inteiro, com até 5 dígitos")
    /**
     * Número do item da Duimp.<br>Formato: Inteiro, com até 5 dígitos
     **/
    private Integer numeroItem = null;

    @XmlElement(name = "versao")
    @ApiModelProperty(example = "1", value = "Versão da Duimp.<br>Valor mínimo: 0<br>Valor máximo: 9999")
    /**
     * Versão da Duimp.<br>Valor mínimo: 0<br>Valor máximo: 9999
     **/
    private Integer versao = null;

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
     * Número da Duimp.&lt;br&gt;Tamanho: 15&lt;br&gt;Formato: &#39;AABRSSSSSSSSSSD&#39;&lt;br&gt;Lei de formação. O número da Duimp é composto por: &lt;br&gt;* AA &#x3D; Corresponde ao ano do registro da Declaração. &lt;br&gt;* BR &#x3D; Corresponde à sigla do país de emissão do documento (BR).&lt;br&gt;* SSSSSSSSSS &#x3D; 10 caracteres numéricos. Número sequencial da Duimp dentro do ano.&lt;br&gt;* D &#x3D; 1 caracter numérico. DV para todos os demais caracteres numéricos (Módulo 11)
     *
     * @return numero
     **/
    @JsonProperty("numero")
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public IdentificadorItemDuimpCover numero(String numero) {
        this.numero = numero;
        return this;
    }

    /**
     * Número do item da Duimp.&lt;br&gt;Formato: Inteiro, com até 5 dígitos
     *
     * @return numeroItem
     **/
    @JsonProperty("numeroItem")
    public Integer getNumeroItem() {
        return numeroItem;
    }

    public void setNumeroItem(Integer numeroItem) {
        this.numeroItem = numeroItem;
    }

    public IdentificadorItemDuimpCover numeroItem(Integer numeroItem) {
        this.numeroItem = numeroItem;
        return this;
    }

    /**
     * Versão da Duimp.&lt;br&gt;Valor mínimo: 0&lt;br&gt;Valor máximo: 9999
     *
     * @return versao
     **/
    @JsonProperty("versao")
    public Integer getVersao() {
        return versao;
    }

    public void setVersao(Integer versao) {
        this.versao = versao;
    }

    public IdentificadorItemDuimpCover versao(Integer versao) {
        this.versao = versao;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class IdentificadorItemDuimpCover {\n" +
                "    numero: " + toIndentedString(numero) + "\n" +
                "    numeroItem: " + toIndentedString(numeroItem) + "\n" +
                "    versao: " + toIndentedString(versao) + "\n" +
                "}";
        return sb;
    }
}
