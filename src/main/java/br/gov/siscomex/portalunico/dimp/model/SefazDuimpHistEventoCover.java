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
@XmlType(name = "SefazDuimpHistEventoCover", propOrder =
        {"evento", "numeroDuimp", "versaoDuimp", "dataHora"
        })

@XmlRootElement(name = "SefazDuimpHistEventoCover")
/**
 * Dados de um evento no histórico de operações da Duimp
 **/
@ApiModel(description = "Dados de um evento no histórico de operações da Duimp")
public class SefazDuimpHistEventoCover {

    @XmlElement(name = "evento")
    @ApiModelProperty(value = "")
    @Valid
    private TipoDeEventoObjetoCompostoPelosAtributosCdigoEDescrio evento = null;

    @XmlElement(name = "numeroDuimp")
    @ApiModelProperty(example = "19BR00000004677", value = "Número da Duimp<br>Tamanho: 15<br>Formato: 'NNAANNNNNNNNNNN'<br>Lei de formação. O número da Duimp é composto por: <br>* NN = Corresponde ao ano do registro da Declaração. <br>* AA = Corresponde à sigla do país de emissão do documento (BR).<br>* NNNNNNNNNN = 10 caracteres numéricos. Número sequencial da Duimp dentro do ano.<br>* N = 1 caracter numérico. DV para todos os demais caracteres numéricos (Módulo 11)")
    /**
     * Número da Duimp<br>Tamanho: 15<br>Formato: 'NNAANNNNNNNNNNN'<br>Lei de formação. O número da Duimp é composto por: <br>* NN = Corresponde ao ano do registro da Declaração. <br>* AA = Corresponde à sigla do país de emissão do documento (BR).<br>* NNNNNNNNNN = 10 caracteres numéricos. Número sequencial da Duimp dentro do ano.<br>* N = 1 caracter numérico. DV para todos os demais caracteres numéricos (Módulo 11)
     **/
    private String numeroDuimp = null;

    @XmlElement(name = "versaoDuimp")
    @ApiModelProperty(example = "0001", value = "Versão da Duimp em que ocorreu o evento<br>Tamanho: 4<br>Valor mínimo: 0001<br>Valor máximo: 9999")
    /**
     * Versão da Duimp em que ocorreu o evento<br>Tamanho: 4<br>Valor mínimo: 0001<br>Valor máximo: 9999
     **/
    private String versaoDuimp = null;

    @XmlElement(name = "dataHora")
    @ApiModelProperty(value = "Data e hora em que o evento ocorreu.<br>Formato: 'yyyy-MM-dd'T'HH:mm:ss.SSSZ'")
    /**
     * Data e hora em que o evento ocorreu.<br>Formato: 'yyyy-MM-dd'T'HH:mm:ss.SSSZ'
     **/
    private OffsetDateTime dataHora = null;

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
     * Get evento
     *
     * @return evento
     **/
    @JsonProperty("evento")
    public TipoDeEventoObjetoCompostoPelosAtributosCdigoEDescrio getEvento() {
        return evento;
    }

    public void setEvento(TipoDeEventoObjetoCompostoPelosAtributosCdigoEDescrio evento) {
        this.evento = evento;
    }

    public SefazDuimpHistEventoCover evento(TipoDeEventoObjetoCompostoPelosAtributosCdigoEDescrio evento) {
        this.evento = evento;
        return this;
    }

    /**
     * Número da Duimp&lt;br&gt;Tamanho: 15&lt;br&gt;Formato: &#39;NNAANNNNNNNNNNN&#39;&lt;br&gt;Lei de formação. O número da Duimp é composto por: &lt;br&gt;* NN &#x3D; Corresponde ao ano do registro da Declaração. &lt;br&gt;* AA &#x3D; Corresponde à sigla do país de emissão do documento (BR).&lt;br&gt;* NNNNNNNNNN &#x3D; 10 caracteres numéricos. Número sequencial da Duimp dentro do ano.&lt;br&gt;* N &#x3D; 1 caracter numérico. DV para todos os demais caracteres numéricos (Módulo 11)
     *
     * @return numeroDuimp
     **/
    @JsonProperty("numeroDuimp")
    public String getNumeroDuimp() {
        return numeroDuimp;
    }

    public void setNumeroDuimp(String numeroDuimp) {
        this.numeroDuimp = numeroDuimp;
    }

    public SefazDuimpHistEventoCover numeroDuimp(String numeroDuimp) {
        this.numeroDuimp = numeroDuimp;
        return this;
    }

    /**
     * Versão da Duimp em que ocorreu o evento&lt;br&gt;Tamanho: 4&lt;br&gt;Valor mínimo: 0001&lt;br&gt;Valor máximo: 9999
     *
     * @return versaoDuimp
     **/
    @JsonProperty("versaoDuimp")
    public String getVersaoDuimp() {
        return versaoDuimp;
    }

    public void setVersaoDuimp(String versaoDuimp) {
        this.versaoDuimp = versaoDuimp;
    }

    public SefazDuimpHistEventoCover versaoDuimp(String versaoDuimp) {
        this.versaoDuimp = versaoDuimp;
        return this;
    }

    /**
     * Data e hora em que o evento ocorreu.&lt;br&gt;Formato: &#39;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#39;
     *
     * @return dataHora
     **/
    @JsonProperty("dataHora")
    public OffsetDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(OffsetDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public SefazDuimpHistEventoCover dataHora(OffsetDateTime dataHora) {
        this.dataHora = dataHora;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class SefazDuimpHistEventoCover {\n" +
                "    evento: " + toIndentedString(evento) + "\n" +
                "    numeroDuimp: " + toIndentedString(numeroDuimp) + "\n" +
                "    versaoDuimp: " + toIndentedString(versaoDuimp) + "\n" +
                "    dataHora: " + toIndentedString(dataHora) + "\n" +
                "}";
        return sb;
    }
}
