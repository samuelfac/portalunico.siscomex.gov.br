package br.gov.siscomex.portalunico.dimp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DuimpUltimosEventosCover", propOrder =
        {"numero", "versao", "evento", "dataEvento", "ufs"
        })

@XmlRootElement(name = "DuimpUltimosEventosCover")
public class DuimpUltimosEventosCover {

    @XmlElement(name = "numero", required = true)
    @ApiModelProperty(example = "21BR00123456789", required = true, value = "Número da Duimp.<br>Tamanho: 15<br>Formato: 'AABRSSSSSSSSSSD'<br>Lei de formação. O número da Duimp é composto por: <br>* AA = Corresponde ao ano do registro da Declaração. <br>* BR = Corresponde à sigla do país de emissão do documento (BR).<br>* SSSSSSSSSS = 10 caracteres numéricos. Número sequencial da Duimp dentro do ano.<br>* D = 1 caracter numérico. DV para todos os demais caracteres numéricos (Módulo 11)")
    /**
     * Número da Duimp.<br>Tamanho: 15<br>Formato: 'AABRSSSSSSSSSSD'<br>Lei de formação. O número da Duimp é composto por: <br>* AA = Corresponde ao ano do registro da Declaração. <br>* BR = Corresponde à sigla do país de emissão do documento (BR).<br>* SSSSSSSSSS = 10 caracteres numéricos. Número sequencial da Duimp dentro do ano.<br>* D = 1 caracter numérico. DV para todos os demais caracteres numéricos (Módulo 11)
     **/
    private String numero = null;

    @XmlElement(name = "versao", required = true)
    @ApiModelProperty(example = "2", required = true, value = "Versão da Duimp.<br>Valor mínimo: 0<br>Valor máximo: 9999")
    /**
     * Versão da Duimp.<br>Valor mínimo: 0<br>Valor máximo: 9999
     **/
    private Integer versao = null;
    @XmlElement(name = "dataEvento", required = true)
    @ApiModelProperty(example = "2024-12-31T23:59:01-0300", required = true, value = "Data em que o evento foi gerado no histórico<br>Formato: 'yyyy-MM-dd'T'HH:mm:ssZ'")
    /**
     * Data em que o evento foi gerado no histórico<br>Formato: 'yyyy-MM-dd'T'HH:mm:ssZ'
     **/
    private String dataEvento = null;

    @XmlElement(name = "evento", required = true)
    @ApiModelProperty(example = "DESEMBARACO_EFETUADO", required = true, value = "Evento no Histórico da Duimp <br>Tamanho mínimo: 1<br>Tamanho máximo: 150")
    /**
     * Evento no Histórico da Duimp <br>Tamanho mínimo: 1<br>Tamanho máximo: 150
     **/
    private EventoEnum evento = null;

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

    @XmlElement(name = "ufs", required = true)
    @ApiModelProperty(required = true, value = "UFs de interesse da Sefaz")
    @Valid
    /**
     * UFs de interesse da Sefaz
     **/
    private List<UfInteresseSefaz> ufs = new ArrayList<>();

    /**
     * Número da Duimp.&lt;br&gt;Tamanho: 15&lt;br&gt;Formato: &#39;AABRSSSSSSSSSSD&#39;&lt;br&gt;Lei de formação. O número da Duimp é composto por: &lt;br&gt;* AA &#x3D; Corresponde ao ano do registro da Declaração. &lt;br&gt;* BR &#x3D; Corresponde à sigla do país de emissão do documento (BR).&lt;br&gt;* SSSSSSSSSS &#x3D; 10 caracteres numéricos. Número sequencial da Duimp dentro do ano.&lt;br&gt;* D &#x3D; 1 caracter numérico. DV para todos os demais caracteres numéricos (Módulo 11)
     *
     * @return numero
     **/
    @JsonProperty("numero")
    @NotNull
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public DuimpUltimosEventosCover numero(String numero) {
        this.numero = numero;
        return this;
    }

    /**
     * Versão da Duimp.&lt;br&gt;Valor mínimo: 0&lt;br&gt;Valor máximo: 9999
     *
     * @return versao
     **/
    @JsonProperty("versao")
    @NotNull
    public Integer getVersao() {
        return versao;
    }

    public void setVersao(Integer versao) {
        this.versao = versao;
    }

    public DuimpUltimosEventosCover versao(Integer versao) {
        this.versao = versao;
        return this;
    }

    /**
     * Evento no Histórico da Duimp &lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 150
     *
     * @return evento
     **/
    @JsonProperty("evento")
    @NotNull
    public String getEvento() {
        if (evento == null) {
            return null;
        }
        return evento.value();
    }

    public void setEvento(EventoEnum evento) {
        this.evento = evento;
    }

    public DuimpUltimosEventosCover evento(EventoEnum evento) {
        this.evento = evento;
        return this;
    }

    /**
     * Data em que o evento foi gerado no histórico&lt;br&gt;Formato: &#39;yyyy-MM-dd&#39;T&#39;HH:mm:ssZ&#39;
     *
     * @return dataEvento
     **/
    @JsonProperty("dataEvento")
    @NotNull
    public String getDataEvento() {
        return dataEvento;
    }

    public void setDataEvento(String dataEvento) {
        this.dataEvento = dataEvento;
    }

    public DuimpUltimosEventosCover dataEvento(String dataEvento) {
        this.dataEvento = dataEvento;
        return this;
    }

    /**
     * UFs de interesse da Sefaz
     *
     * @return ufs
     **/
    @JsonProperty("ufs")
    @NotNull
    public List<UfInteresseSefaz> getUfs() {
        return ufs;
    }

    public void setUfs(List<UfInteresseSefaz> ufs) {
        this.ufs = ufs;
    }

    public DuimpUltimosEventosCover ufs(List<UfInteresseSefaz> ufs) {
        this.ufs = ufs;
        return this;
    }

    public DuimpUltimosEventosCover addUfsItem(UfInteresseSefaz ufsItem) {
        this.ufs.add(ufsItem);
        return this;
    }


    @Override
    public String toString() {

        String sb = "class DuimpUltimosEventosCover {\n" +
                "    numero: " + toIndentedString(numero) + "\n" +
                "    versao: " + toIndentedString(versao) + "\n" +
                "    evento: " + toIndentedString(evento) + "\n" +
                "    dataEvento: " + toIndentedString(dataEvento) + "\n" +
                "    ufs: " + toIndentedString(ufs) + "\n" +
                "}";
        return sb;
    }

    @XmlType(name = "EventoEnum")
    @XmlEnum(String.class)
    public enum EventoEnum {

        @XmlEnumValue("DESEMBARACO_EFETUADO(419 : Desembaraço efetuado) ")
        @JsonProperty("DESEMBARACO_EFETUADO(419 : Desembaraço efetuado) ")
        DESEMBARACO_EFETUADO_419_DESEMBARA_O_EFETUADO_("DESEMBARACO_EFETUADO(419 : Desembaraço efetuado) "),

        @XmlEnumValue("DESEMBARACO_EFETUADO_DECISAO_JUDICIAL(428 : Desembaraço efetuado por decisão judicial) ")
        @JsonProperty("DESEMBARACO_EFETUADO_DECISAO_JUDICIAL(428 : Desembaraço efetuado por decisão judicial) ")
        DESEMBARACO_EFETUADO_DECISAO_JUDICIAL_428_DESEMBARA_O_EFETUADO_POR_DECIS_O_JUDICIAL_("DESEMBARACO_EFETUADO_DECISAO_JUDICIAL(428 : Desembaraço efetuado por decisão judicial) "),

        @XmlEnumValue("DESEMBARACO_AUTOMATICO_SEM_CONFERENCIA(418 : Declaração desembaraçada sem conferência aduaneira) ")
        @JsonProperty("DESEMBARACO_AUTOMATICO_SEM_CONFERENCIA(418 : Declaração desembaraçada sem conferência aduaneira) ")
        DESEMBARACO_AUTOMATICO_SEM_CONFERENCIA_418_DECLARA_O_DESEMBARA_ADA_SEM_CONFER_NCIA_ADUANEIRA_("DESEMBARACO_AUTOMATICO_SEM_CONFERENCIA(418 : Declaração desembaraçada sem conferência aduaneira) "),

        @XmlEnumValue("DESEMBARACO_AUTOMATICO_SEM_CONFERENCIA_SEM_INSPECAO(427 : Declaração desembaraçada sem conferência aduaneira e conferência do anuente) ")
        @JsonProperty("DESEMBARACO_AUTOMATICO_SEM_CONFERENCIA_SEM_INSPECAO(427 : Declaração desembaraçada sem conferência aduaneira e conferência do anuente) ")
        DESEMBARACO_AUTOMATICO_SEM_CONFERENCIA_SEM_INSPECAO_427_DECLARA_O_DESEMBARA_ADA_SEM_CONFER_NCIA_ADUANEIRA_E_CONFER_NCIA_DO_ANUENTE_("DESEMBARACO_AUTOMATICO_SEM_CONFERENCIA_SEM_INSPECAO(427 : Declaração desembaraçada sem conferência aduaneira e conferência do anuente) "),

        @XmlEnumValue("ENTREGA_CARGA(13 : Carga totalmente entregue) ")
        @JsonProperty("ENTREGA_CARGA(13 : Carga totalmente entregue) ")
        ENTREGA_CARGA_13_CARGA_TOTALMENTE_ENTREGUE_("ENTREGA_CARGA(13 : Carga totalmente entregue) "),

        @XmlEnumValue("RETIFICACAO(4 : Declaração retificada) ")
        @JsonProperty("RETIFICACAO(4 : Declaração retificada) ")
        RETIFICACAO_4_DECLARA_O_RETIFICADA_("RETIFICACAO(4 : Declaração retificada) "),

        @XmlEnumValue("DECLARACAO_CANCELADA(71 : Declaração cancelada) ")
        @JsonProperty("DECLARACAO_CANCELADA(71 : Declaração cancelada) ")
        DECLARACAO_CANCELADA_71_DECLARA_O_CANCELADA_("DECLARACAO_CANCELADA(71 : Declaração cancelada) ");


        private final String value;

        EventoEnum(String v) {
            value = v;
        }

        public static EventoEnum fromValue(String v) {
            for (EventoEnum b : EventoEnum.values()) {
                if (String.valueOf(b.value).equals(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "' to EventoEnum");
        }

        public String value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
    }
}
