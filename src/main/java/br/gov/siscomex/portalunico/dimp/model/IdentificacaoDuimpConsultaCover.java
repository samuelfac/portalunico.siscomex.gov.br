package br.gov.siscomex.portalunico.dimp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.time.OffsetDateTime;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdentificacaoDuimpConsultaCover", propOrder =
        {"numero", "versao", "importador", "dataRegistro", "informacaoComplementar"
        })

@XmlRootElement(name = "IdentificacaoDuimpConsultaCover")
/**
 * Dados da identificação da declaração única de importação.
 **/
@ApiModel(description = "Dados da identificação da declaração única de importação.")
public class IdentificacaoDuimpConsultaCover {

    @XmlElement(name = "numero")
    @ApiModelProperty(example = "19BR00000004677", value = "<br>Tamanho: 15<br>Formato: 'AABRSSSSSSSSSSD'<br>Lei de formação. O número da Duimp é composto por: <br>* AA = Corresponde ao ano do registro da Declaração. <br>* BR = Corresponde à sigla do país de emissão do documento (BR).<br>* SSSSSSSSSS = 10 caracteres numéricos. Número sequencial da Duimp dentro do ano.<br>* D = 1 caracter numérico. DV para todos os demais caracteres numéricos (Módulo 11)")
    /**
     * <br>Tamanho: 15<br>Formato: 'AABRSSSSSSSSSSD'<br>Lei de formação. O número da Duimp é composto por: <br>* AA = Corresponde ao ano do registro da Declaração. <br>* BR = Corresponde à sigla do país de emissão do documento (BR).<br>* SSSSSSSSSS = 10 caracteres numéricos. Número sequencial da Duimp dentro do ano.<br>* D = 1 caracter numérico. DV para todos os demais caracteres numéricos (Módulo 11)
     **/
    private String numero = null;

    @XmlElement(name = "versao")
    @ApiModelProperty(example = "1", value = "Versão da Duimp.<br>Valor mínimo: 0<br>Valor máximo: 9999")
    /**
     * Versão da Duimp.<br>Valor mínimo: 0<br>Valor máximo: 9999
     **/
    private Integer versao = null;

    @XmlElement(name = "importador")
    @ApiModelProperty(value = "")
    @Valid
    private ImportadorCover importador = null;

    @XmlElement(name = "dataRegistro")
    @ApiModelProperty(value = "Data e hora em que a Duimp foi registrada.<br>Formato: 'yyyy-MM-dd'T'HH:mm:ssZ'")
    /**
     * Data e hora em que a Duimp foi registrada.<br>Formato: 'yyyy-MM-dd'T'HH:mm:ssZ'
     **/
    private OffsetDateTime dataRegistro = null;

    @XmlElement(name = "informacaoComplementar")
    @ApiModelProperty(example = "Texto complementando informações sobre a Duimp.", value = "Descrição complementar da Duimp.<br>Tamanho mínimo: 0<br>Tamanho máximo: 7800")
    /**
     * Descrição complementar da Duimp.<br>Tamanho mínimo: 0<br>Tamanho máximo: 7800
     **/
    private String informacaoComplementar = null;

    /**
     * &lt;br&gt;Tamanho: 15&lt;br&gt;Formato: &#39;AABRSSSSSSSSSSD&#39;&lt;br&gt;Lei de formação. O número da Duimp é composto por: &lt;br&gt;* AA &#x3D; Corresponde ao ano do registro da Declaração. &lt;br&gt;* BR &#x3D; Corresponde à sigla do país de emissão do documento (BR).&lt;br&gt;* SSSSSSSSSS &#x3D; 10 caracteres numéricos. Número sequencial da Duimp dentro do ano.&lt;br&gt;* D &#x3D; 1 caracter numérico. DV para todos os demais caracteres numéricos (Módulo 11)
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

    public IdentificacaoDuimpConsultaCover numero(String numero) {
        this.numero = numero;
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

    public IdentificacaoDuimpConsultaCover versao(Integer versao) {
        this.versao = versao;
        return this;
    }

    /**
     * Get importador
     *
     * @return importador
     **/
    @JsonProperty("importador")
    public ImportadorCover getImportador() {
        return importador;
    }

    public void setImportador(ImportadorCover importador) {
        this.importador = importador;
    }

    /**
     * Data e hora em que a Duimp foi registrada.&lt;br&gt;Formato: &#39;yyyy-MM-dd&#39;T&#39;HH:mm:ssZ&#39;
     *
     * @return dataRegistro
     **/
    @JsonProperty("dataRegistro")
    public OffsetDateTime getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(OffsetDateTime dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    public IdentificacaoDuimpConsultaCover dataRegistro(OffsetDateTime dataRegistro) {
        this.dataRegistro = dataRegistro;
        return this;
    }

    /**
     * Descrição complementar da Duimp.&lt;br&gt;Tamanho mínimo: 0&lt;br&gt;Tamanho máximo: 7800
     *
     * @return informacaoComplementar
     **/
    @JsonProperty("informacaoComplementar")
    public String getInformacaoComplementar() {
        return informacaoComplementar;
    }

    public void setInformacaoComplementar(String informacaoComplementar) {
        this.informacaoComplementar = informacaoComplementar;
    }

    public IdentificacaoDuimpConsultaCover informacaoComplementar(String informacaoComplementar) {
        this.informacaoComplementar = informacaoComplementar;
        return this;
    }

    public IdentificacaoDuimpConsultaCover importador(ImportadorCover importador) {
        this.importador = importador;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class IdentificacaoDuimpConsultaCover {\n" +
                "    numero: " + toIndentedString(numero) + "\n" +
                "    versao: " + toIndentedString(versao) + "\n" +
                "    importador: " + toIndentedString(importador) + "\n" +
                "    dataRegistro: " + toIndentedString(dataRegistro) + "\n" +
                "    informacaoComplementar: " + toIndentedString(informacaoComplementar) + "\n" +
                "}";
        return sb;
    }
}
