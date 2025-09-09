package br.gov.siscomex.portalunico.dimp.model;

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
@XmlType(name = "DeclaracaoVinculadaCover", propOrder =
        {"tipo", "numero", "chaveAcesso", "numeroItem"
        })

@XmlRootElement(name = "DeclaracaoVinculadaCover")
/**
 * Lista de declarações aduaneiras vinculadas.<br>Atenção: para DUIMP com Situação Especial de Despacho, o preenchimento da lista de declarações vinculadas é obrigatória e deve ser feito de acordo com a legislação vigente para a operação desejada
 **/
@ApiModel(description = "Lista de declarações aduaneiras vinculadas.<br>Atenção: para DUIMP com Situação Especial de Despacho, o preenchimento da lista de declarações vinculadas é obrigatória e deve ser feito de acordo com a legislação vigente para a operação desejada")
public class DeclaracaoVinculadaCover {


    @XmlElement(name = "tipo", required = true)
    @ApiModelProperty(example = "DUIMP", required = true, value = "Tipo de declaração vinculada.<br>Domínio:")
    /**
     * Tipo de declaração vinculada.<br>Domínio:
     **/
    private TipoEnum tipo = null;
    @XmlElement(name = "numero", required = true)
    @ApiModelProperty(example = "23BR00001010550", required = true, value = "Número da Declaração.<br>Tamanho mínimo: 1<br>Tamanho máximo: 15")
    /**
     * Número da Declaração.<br>Tamanho mínimo: 1<br>Tamanho máximo: 15
     **/
    private String numero = null;
    @XmlElement(name = "chaveAcesso")
    @ApiModelProperty(example = "23NcT000115501", value = "Chave de acesso da Duimp vinculada. Atributo previsto no json de saída para auxiliar o usuário na utilização da estrutura do json. No entanto, não é preenchido, por se tratar de um dado restrito.<br>Tamanho: 14<br>Formato: 'AALLLSSSSSSSSD'<br>Lei de formação: <br>* AA = Corresponde ao ano (2 caracteres).<br>* LLL = 3 letras aleatórias.<br>* SSSSSSSS = 8 caracteres númericos. Número sequencial da Duimp dentro do ano.<br>* D = (1 caracter númerico. DV para os demais caracteres numéricos (Módulo 11)")
    /**
     * Chave de acesso da Duimp vinculada. Atributo previsto no json de saída para auxiliar o usuário na utilização da estrutura do json. No entanto, não é preenchido, por se tratar de um dado restrito.<br>Tamanho: 14<br>Formato: 'AALLLSSSSSSSSD'<br>Lei de formação: <br>* AA = Corresponde ao ano (2 caracteres).<br>* LLL = 3 letras aleatórias.<br>* SSSSSSSS = 8 caracteres númericos. Número sequencial da Duimp dentro do ano.<br>* D = (1 caracter númerico. DV para os demais caracteres numéricos (Módulo 11)
     **/
    private String chaveAcesso = null;
    @XmlElement(name = "numeroItem", required = true)
    @ApiModelProperty(example = "10001", required = true, value = "Número do item/adição da declaração.<br>Valor mínimo: 1<br>Valor máximo: 99999")
    /**
     * Número do item/adição da declaração.<br>Valor mínimo: 1<br>Valor máximo: 99999
     **/
    private Integer numeroItem = null;

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
     * Tipo de declaração vinculada.&lt;br&gt;Domínio:
     *
     * @return tipo
     **/
    @JsonProperty("tipo")
    @NotNull
    public String getTipo() {
        if (tipo == null) {
            return null;
        }
        return tipo.value();
    }

    public void setTipo(TipoEnum tipo) {
        this.tipo = tipo;
    }

    public DeclaracaoVinculadaCover tipo(TipoEnum tipo) {
        this.tipo = tipo;
        return this;
    }

    /**
     * Número da Declaração.&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 15
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

    public DeclaracaoVinculadaCover numero(String numero) {
        this.numero = numero;
        return this;
    }

    /**
     * Chave de acesso da Duimp vinculada. Atributo previsto no json de saída para auxiliar o usuário na utilização da estrutura do json. No entanto, não é preenchido, por se tratar de um dado restrito.&lt;br&gt;Tamanho: 14&lt;br&gt;Formato: &#39;AALLLSSSSSSSSD&#39;&lt;br&gt;Lei de formação: &lt;br&gt;* AA &#x3D; Corresponde ao ano (2 caracteres).&lt;br&gt;* LLL &#x3D; 3 letras aleatórias.&lt;br&gt;* SSSSSSSS &#x3D; 8 caracteres númericos. Número sequencial da Duimp dentro do ano.&lt;br&gt;* D &#x3D; (1 caracter númerico. DV para os demais caracteres numéricos (Módulo 11)
     *
     * @return chaveAcesso
     **/
    @JsonProperty("chaveAcesso")
    public String getChaveAcesso() {
        return chaveAcesso;
    }

    public void setChaveAcesso(String chaveAcesso) {
        this.chaveAcesso = chaveAcesso;
    }

    public DeclaracaoVinculadaCover chaveAcesso(String chaveAcesso) {
        this.chaveAcesso = chaveAcesso;
        return this;
    }

    /**
     * Número do item/adição da declaração.&lt;br&gt;Valor mínimo: 1&lt;br&gt;Valor máximo: 99999
     *
     * @return numeroItem
     **/
    @JsonProperty("numeroItem")
    @NotNull
    public Integer getNumeroItem() {
        return numeroItem;
    }

    public void setNumeroItem(Integer numeroItem) {
        this.numeroItem = numeroItem;
    }

    public DeclaracaoVinculadaCover numeroItem(Integer numeroItem) {
        this.numeroItem = numeroItem;
        return this;
    }


    @Override
    public String toString() {

        String sb = "class DeclaracaoVinculadaCover {\n" +
                "    tipo: " + toIndentedString(tipo) + "\n" +
                "    numero: " + toIndentedString(numero) + "\n" +
                "    chaveAcesso: " + toIndentedString(chaveAcesso) + "\n" +
                "    numeroItem: " + toIndentedString(numeroItem) + "\n" +
                "}";
        return sb;
    }

    @XmlType(name = "TipoEnum")
    @XmlEnum(String.class)
    public enum TipoEnum {

        @XmlEnumValue("DUIMP")
        @JsonProperty("DUIMP")
        DUIMP("DUIMP"),

        @XmlEnumValue("DUE")
        @JsonProperty("DUE")
        DUE("DUE"),

        @XmlEnumValue("DI")
        @JsonProperty("DI")
        DI("DI"),

        @XmlEnumValue("DE")
        @JsonProperty("DE")
        DE("DE");


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
