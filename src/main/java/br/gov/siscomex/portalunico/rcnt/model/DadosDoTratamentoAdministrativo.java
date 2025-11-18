package br.gov.siscomex.portalunico.rcnt.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DadosDoTratamentoAdministrativo", propOrder =
        {"idElemento", "numero", "tipo"
        })

@XmlRootElement(name = "DadosDoTratamentoAdministrativo")
/**
 * Informar os tratamentos administrativos vinculados (LI - Licença de Importação) ou LPCO (Licenças, Permissões, Certificados, Outros)
 **/
@ApiModel(description = "Informar os tratamentos administrativos vinculados (LI - Licença de Importação) ou LPCO (Licenças, Permissões, Certificados, Outros)")
public class DadosDoTratamentoAdministrativo {

    @XmlElement(name = "idElemento", required = true)
    @ApiModelProperty(required = true, value = "Identificação de cada elemento da lista. Este atributo é obrigatório e deve ser único dentro da lista correspondente.<br/>Tamanho: 40")
    /**
     * Identificação de cada elemento da lista. Este atributo é obrigatório e deve ser único dentro da lista correspondente.<br/>Tamanho: 40
     **/
    private String idElemento = null;

    @XmlElement(name = "numero")
    @ApiModelProperty(value = "Número de identificação do tratamento administrativo. <br/><br/>Tamanho: 100")
    /**
     * Número de identificação do tratamento administrativo. <br/><br/>Tamanho: 100
     **/
    private String numero = null;
    @XmlElement(name = "tipo")
    @ApiModelProperty(example = "LI", value = "Tipo de tratamento administrativo conforme tabela de domínio.<br/>Domínio:<br/>LI - Licença de Importação<br/>LPCO - Licenças, Permissões, Certificados, Outros ")
    /**
     * Tipo de tratamento administrativo conforme tabela de domínio.<br/>Domínio:<br/>LI - Licença de Importação<br/>LPCO - Licenças, Permissões, Certificados, Outros
     **/
    private TipoEnum tipo = null;

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

    public DadosDoTratamentoAdministrativo idElemento(String idElemento) {
        this.idElemento = idElemento;
        return this;
    }

    /**
     * Número de identificação do tratamento administrativo. &lt;br/&gt;&lt;br/&gt;Tamanho: 100
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

    public DadosDoTratamentoAdministrativo numero(String numero) {
        this.numero = numero;
        return this;
    }

    /**
     * Tipo de tratamento administrativo conforme tabela de domínio.&lt;br/&gt;Domínio:&lt;br/&gt;LI - Licença de Importação&lt;br/&gt;LPCO - Licenças, Permissões, Certificados, Outros
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

    public DadosDoTratamentoAdministrativo tipo(TipoEnum tipo) {
        this.tipo = tipo;
        return this;
    }


    @Override
    public String toString() {

        String sb = "class DadosDoTratamentoAdministrativo {\n" +
                "    idElemento: " + toIndentedString(idElemento) + "\n" +
                "    numero: " + toIndentedString(numero) + "\n" +
                "    tipo: " + toIndentedString(tipo) + "\n" +
                "}";
        return sb;
    }

    @XmlType(name = "TipoEnum")
    @XmlEnum(String.class)
    public enum TipoEnum {

        @XmlEnumValue("'LI'")
        @JsonProperty("'LI'")
        LI_("'LI'"),

        @XmlEnumValue("'LPCO'")
        @JsonProperty("'LPCO'")
        LPCO_("'LPCO'");


        private final String value;

        TipoEnum(String v) {
            value = v;
        }

        public String value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static TipoEnum fromValue(String v) {
            for (TipoEnum b : TipoEnum.values()) {
                if (String.valueOf(b.value).equals(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "' to TipoEnum");
        }
    }
}
