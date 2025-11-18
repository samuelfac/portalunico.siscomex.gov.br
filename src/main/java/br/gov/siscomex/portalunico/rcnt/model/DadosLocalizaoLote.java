package br.gov.siscomex.portalunico.rcnt.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DadosLocalizaoLote", propOrder =
        {"altura", "fila", "pilha", "quadra"
        })

@XmlRootElement(name = "DadosLocalizaoLote")
public class DadosLocalizaoLote {

    @XmlElement(name = "altura")
    @ApiModelProperty(value = "Altura<font color=\"red\"><strong><br/>(!)</strong></font>É obrigatório que pelo menos um dos seguintes atributos seja informado: 'quadra', 'pilha', 'altura', 'fila'.<br/>Tamanho: 20")
    /**
     * Altura<font color=\"red\"><strong><br/>(!)</strong></font>É obrigatório que pelo menos um dos seguintes atributos seja informado: 'quadra', 'pilha', 'altura', 'fila'.<br/>Tamanho: 20
     **/
    private String altura = null;

    @XmlElement(name = "fila")
    @ApiModelProperty(value = "Fila<font color=\"red\"><strong><br/>(!)</strong></font>É obrigatório que pelo menos um dos seguintes atributos seja informado: 'quadra', 'pilha', 'altura', 'fila'.<br/>Tamanho: 20")
    /**
     * Fila<font color=\"red\"><strong><br/>(!)</strong></font>É obrigatório que pelo menos um dos seguintes atributos seja informado: 'quadra', 'pilha', 'altura', 'fila'.<br/>Tamanho: 20
     **/
    private String fila = null;

    @XmlElement(name = "pilha")
    @ApiModelProperty(value = "Pilha<font color=\"red\"><strong><br/>(!)</strong></font>É obrigatório que pelo menos um dos seguintes atributos seja informado: 'quadra', 'pilha', 'altura', 'fila'.<br/>Tamanho: 20")
    /**
     * Pilha<font color=\"red\"><strong><br/>(!)</strong></font>É obrigatório que pelo menos um dos seguintes atributos seja informado: 'quadra', 'pilha', 'altura', 'fila'.<br/>Tamanho: 20
     **/
    private String pilha = null;

    @XmlElement(name = "quadra")
    @ApiModelProperty(value = "Quadra<font color=\"red\"><strong><br/>(!)</strong></font>É obrigatório que pelo menos um dos seguintes atributos seja informado: 'quadra', 'pilha', 'altura', 'fila'.<br/>Tamanho: 20")
    /**
     * Quadra<font color=\"red\"><strong><br/>(!)</strong></font>É obrigatório que pelo menos um dos seguintes atributos seja informado: 'quadra', 'pilha', 'altura', 'fila'.<br/>Tamanho: 20
     **/
    private String quadra = null;

    /**
     * Altura&lt;font color&#x3D;\&quot;red\&quot;&gt;&lt;strong&gt;&lt;br/&gt;(!)&lt;/strong&gt;&lt;/font&gt;É obrigatório que pelo menos um dos seguintes atributos seja informado: &#39;quadra&#39;, &#39;pilha&#39;, &#39;altura&#39;, &#39;fila&#39;.&lt;br/&gt;Tamanho: 20
     *
     * @return altura
     **/
    @JsonProperty("altura")
    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public DadosLocalizaoLote altura(String altura) {
        this.altura = altura;
        return this;
    }

    /**
     * Fila&lt;font color&#x3D;\&quot;red\&quot;&gt;&lt;strong&gt;&lt;br/&gt;(!)&lt;/strong&gt;&lt;/font&gt;É obrigatório que pelo menos um dos seguintes atributos seja informado: &#39;quadra&#39;, &#39;pilha&#39;, &#39;altura&#39;, &#39;fila&#39;.&lt;br/&gt;Tamanho: 20
     *
     * @return fila
     **/
    @JsonProperty("fila")
    public String getFila() {
        return fila;
    }

    public void setFila(String fila) {
        this.fila = fila;
    }

    public DadosLocalizaoLote fila(String fila) {
        this.fila = fila;
        return this;
    }

    /**
     * Pilha&lt;font color&#x3D;\&quot;red\&quot;&gt;&lt;strong&gt;&lt;br/&gt;(!)&lt;/strong&gt;&lt;/font&gt;É obrigatório que pelo menos um dos seguintes atributos seja informado: &#39;quadra&#39;, &#39;pilha&#39;, &#39;altura&#39;, &#39;fila&#39;.&lt;br/&gt;Tamanho: 20
     *
     * @return pilha
     **/
    @JsonProperty("pilha")
    public String getPilha() {
        return pilha;
    }

    public void setPilha(String pilha) {
        this.pilha = pilha;
    }

    public DadosLocalizaoLote pilha(String pilha) {
        this.pilha = pilha;
        return this;
    }

    /**
     * Quadra&lt;font color&#x3D;\&quot;red\&quot;&gt;&lt;strong&gt;&lt;br/&gt;(!)&lt;/strong&gt;&lt;/font&gt;É obrigatório que pelo menos um dos seguintes atributos seja informado: &#39;quadra&#39;, &#39;pilha&#39;, &#39;altura&#39;, &#39;fila&#39;.&lt;br/&gt;Tamanho: 20
     *
     * @return quadra
     **/
    @JsonProperty("quadra")
    public String getQuadra() {
        return quadra;
    }

    public void setQuadra(String quadra) {
        this.quadra = quadra;
    }

    public DadosLocalizaoLote quadra(String quadra) {
        this.quadra = quadra;
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

    @Override
    public String toString() {

        String sb = "class DadosLocalizaoLote {\n" +
                "    altura: " + toIndentedString(altura) + "\n" +
                "    fila: " + toIndentedString(fila) + "\n" +
                "    pilha: " + toIndentedString(pilha) + "\n" +
                "    quadra: " + toIndentedString(quadra) + "\n" +
                "}";
        return sb;
    }
}
