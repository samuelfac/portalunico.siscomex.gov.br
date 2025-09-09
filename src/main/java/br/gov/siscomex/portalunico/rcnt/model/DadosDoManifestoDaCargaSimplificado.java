package br.gov.siscomex.portalunico.rcnt.model;

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
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DadosDoManifestoDaCargaSimplificado", propOrder =
        {"listaConhecimentos", "tipo", "numero", "idElemento"
        })

@XmlRootElement(name = "DadosDoManifestoDaCargaSimplificado")
public class DadosDoManifestoDaCargaSimplificado {

    @XmlElement(name = "listaConhecimentos")
    @ApiModelProperty(value = "Lista de conhecimentos de carga.")
    @Valid
    /**
     * Lista de conhecimentos de carga.
     **/
    private List<DadosDoConhecimentoDaCargaSimplificado> listaConhecimentos = null;
    @XmlElement(name = "tipo")
    @ApiModelProperty(example = "MICDTA", value = "Tipo do manifesto conforme tabela de domínio.<br/>Domínio:<br/>MICDTA - MicDTA<br/>TIFDTA - TifDTA<br/>MDFE - MDF-e<br/>MELET - Manifesto Eletrônico")
    /**
     * Tipo do manifesto conforme tabela de domínio.<br/>Domínio:<br/>MICDTA - MicDTA<br/>TIFDTA - TifDTA<br/>MDFE - MDF-e<br/>MELET - Manifesto Eletrônico
     **/
    private TipoEnum tipo = null;
    @XmlElement(name = "numero")
    @ApiModelProperty(example = "1318500002175", value = "Número do Manifesto. No caso de MDF-e informar a chave de acesso.<br/>Tamanho: 100")
    /**
     * Número do Manifesto. No caso de MDF-e informar a chave de acesso.<br/>Tamanho: 100
     **/
    private String numero = null;
    @XmlElement(name = "idElemento", required = true)
    @ApiModelProperty(required = true, value = "Identificação de cada elemento da lista. Este atributo é obrigatório e deve ser único dentro da lista correspondente.<br/>Tamanho: 40")
    /**
     * Identificação de cada elemento da lista. Este atributo é obrigatório e deve ser único dentro da lista correspondente.<br/>Tamanho: 40
     **/
    private String idElemento = null;

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
     * Lista de conhecimentos de carga.
     *
     * @return listaConhecimentos
     **/
    @JsonProperty("listaConhecimentos")
    public List<DadosDoConhecimentoDaCargaSimplificado> getListaConhecimentos() {
        return listaConhecimentos;
    }

    public void setListaConhecimentos(List<DadosDoConhecimentoDaCargaSimplificado> listaConhecimentos) {
        this.listaConhecimentos = listaConhecimentos;
    }

    public DadosDoManifestoDaCargaSimplificado listaConhecimentos(List<DadosDoConhecimentoDaCargaSimplificado> listaConhecimentos) {
        this.listaConhecimentos = listaConhecimentos;
        return this;
    }

    public DadosDoManifestoDaCargaSimplificado addListaConhecimentosItem(DadosDoConhecimentoDaCargaSimplificado listaConhecimentosItem) {
        this.listaConhecimentos.add(listaConhecimentosItem);
        return this;
    }

    /**
     * Tipo do manifesto conforme tabela de domínio.&lt;br/&gt;Domínio:&lt;br/&gt;MICDTA - MicDTA&lt;br/&gt;TIFDTA - TifDTA&lt;br/&gt;MDFE - MDF-e&lt;br/&gt;MELET - Manifesto Eletrônico
     *
     * @return tipo
     **/
    @JsonProperty("tipo")
    public String getTipo() {
        if (tipo == null) {
            return null;
        }
        return tipo.value();
    }

    public void setTipo(TipoEnum tipo) {
        this.tipo = tipo;
    }

    public DadosDoManifestoDaCargaSimplificado tipo(TipoEnum tipo) {
        this.tipo = tipo;
        return this;
    }

    /**
     * Número do Manifesto. No caso de MDF-e informar a chave de acesso.&lt;br/&gt;Tamanho: 100
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

    public DadosDoManifestoDaCargaSimplificado numero(String numero) {
        this.numero = numero;
        return this;
    }

    /**
     * Identificação de cada elemento da lista. Este atributo é obrigatório e deve ser único dentro da lista correspondente.&lt;br/&gt;Tamanho: 40
     *
     * @return idElemento
     **/
    @JsonProperty("idElemento")
    @NotNull
    public String getIdElemento() {
        return idElemento;
    }

    public void setIdElemento(String idElemento) {
        this.idElemento = idElemento;
    }

    public DadosDoManifestoDaCargaSimplificado idElemento(String idElemento) {
        this.idElemento = idElemento;
        return this;
    }


    @Override
    public String toString() {

        String sb = "class DadosDoManifestoDaCargaSimplificado {\n" +
                "    listaConhecimentos: " + toIndentedString(listaConhecimentos) + "\n" +
                "    tipo: " + toIndentedString(tipo) + "\n" +
                "    numero: " + toIndentedString(numero) + "\n" +
                "    idElemento: " + toIndentedString(idElemento) + "\n" +
                "}";
        return sb;
    }

    @XmlType(name = "TipoEnum")
    @XmlEnum(String.class)
    public enum TipoEnum {

        @XmlEnumValue("'MICDTA'")
        @JsonProperty("'MICDTA'")
        MICDTA_("'MICDTA'"),

        @XmlEnumValue("'TIFDTA'")
        @JsonProperty("'TIFDTA'")
        TIFDTA_("'TIFDTA'"),

        @XmlEnumValue("'MDFE'")
        @JsonProperty("'MDFE'")
        MDFE_("'MDFE'"),

        @XmlEnumValue("'MELET'")
        @JsonProperty("'MELET'")
        MELET_("'MELET'");


        private final String value;

        TipoEnum(String v) {
            value = v;
        }

        public static TipoEnum fromValue(String v) {
            for (TipoEnum b : TipoEnum.values()) {
                if (String.valueOf(b.value).equals(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "' to TipoEnum");
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
