package br.gov.siscomex.portalunico.rcnt.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DadosLocalizaoArmazenamentoLote", propOrder =
        {"box", "estante", "prateleira", "rua", "setor"
        })

@XmlRootElement(name = "DadosLocalizaoArmazenamentoLote")
public class DadosLocalizaoArmazenamentoLote {

    @XmlElement(name = "box")
    @ApiModelProperty(value = "Box<font color=\"red\"><strong><br/>(!)</strong></font>É obrigatório que pelo menos um dos seguintes atributos seja informado: 'setor', 'rua', 'estante', 'prateleira', 'box'.<br/>Tamanho: 100")
    /**
     * Box<font color=\"red\"><strong><br/>(!)</strong></font>É obrigatório que pelo menos um dos seguintes atributos seja informado: 'setor', 'rua', 'estante', 'prateleira', 'box'.<br/>Tamanho: 100
     **/
    private String box = null;

    @XmlElement(name = "estante")
    @ApiModelProperty(value = "Estante<font color=\"red\"><strong><br/>(!)</strong></font>É obrigatório que pelo menos um dos seguintes atributos seja informado: 'setor', 'rua', 'estante', 'prateleira', 'box'.<br/>Tamanho: 20")
    /**
     * Estante<font color=\"red\"><strong><br/>(!)</strong></font>É obrigatório que pelo menos um dos seguintes atributos seja informado: 'setor', 'rua', 'estante', 'prateleira', 'box'.<br/>Tamanho: 20
     **/
    private String estante = null;

    @XmlElement(name = "prateleira")
    @ApiModelProperty(value = "Prateleira<font color=\"red\"><strong><br/>(!)</strong></font>É obrigatório que pelo menos um dos seguintes atributos seja informado: 'setor', 'rua', 'estante', 'prateleira', 'box'.<br/>Tamanho: 20")
    /**
     * Prateleira<font color=\"red\"><strong><br/>(!)</strong></font>É obrigatório que pelo menos um dos seguintes atributos seja informado: 'setor', 'rua', 'estante', 'prateleira', 'box'.<br/>Tamanho: 20
     **/
    private String prateleira = null;

    @XmlElement(name = "rua")
    @ApiModelProperty(value = "Rua<font color=\"red\"><strong><br/>(!)</strong></font>É obrigatório que pelo menos um dos seguintes atributos seja informado: 'setor', 'rua', 'estante', 'prateleira', 'box'.<br/>Tamanho: 100")
    /**
     * Rua<font color=\"red\"><strong><br/>(!)</strong></font>É obrigatório que pelo menos um dos seguintes atributos seja informado: 'setor', 'rua', 'estante', 'prateleira', 'box'.<br/>Tamanho: 100
     **/
    private String rua = null;

    @XmlElement(name = "setor")
    @ApiModelProperty(value = "Setor<font color=\"red\"><strong><br/>(!)</strong></font>É obrigatório que pelo menos um dos seguintes atributos seja informado: 'setor', 'rua', 'estante', 'prateleira', 'box'.<br/>Tamanho: 100")
    /**
     * Setor<font color=\"red\"><strong><br/>(!)</strong></font>É obrigatório que pelo menos um dos seguintes atributos seja informado: 'setor', 'rua', 'estante', 'prateleira', 'box'.<br/>Tamanho: 100
     **/
    private String setor = null;

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
     * Box&lt;font color&#x3D;\&quot;red\&quot;&gt;&lt;strong&gt;&lt;br/&gt;(!)&lt;/strong&gt;&lt;/font&gt;É obrigatório que pelo menos um dos seguintes atributos seja informado: &#39;setor&#39;, &#39;rua&#39;, &#39;estante&#39;, &#39;prateleira&#39;, &#39;box&#39;.&lt;br/&gt;Tamanho: 100
     *
     * @return box
     **/
    @JsonProperty("box")
    public String getBox() {
        return box;
    }

    public void setBox(String box) {
        this.box = box;
    }

    /**
     * Estante&lt;font color&#x3D;\&quot;red\&quot;&gt;&lt;strong&gt;&lt;br/&gt;(!)&lt;/strong&gt;&lt;/font&gt;É obrigatório que pelo menos um dos seguintes atributos seja informado: &#39;setor&#39;, &#39;rua&#39;, &#39;estante&#39;, &#39;prateleira&#39;, &#39;box&#39;.&lt;br/&gt;Tamanho: 20
     *
     * @return estante
     **/
    @JsonProperty("estante")
    public String getEstante() {
        return estante;
    }

    public void setEstante(String estante) {
        this.estante = estante;
    }

    public DadosLocalizaoArmazenamentoLote estante(String estante) {
        this.estante = estante;
        return this;
    }

    public DadosLocalizaoArmazenamentoLote box(String box) {
        this.box = box;
        return this;
    }

    /**
     * Prateleira&lt;font color&#x3D;\&quot;red\&quot;&gt;&lt;strong&gt;&lt;br/&gt;(!)&lt;/strong&gt;&lt;/font&gt;É obrigatório que pelo menos um dos seguintes atributos seja informado: &#39;setor&#39;, &#39;rua&#39;, &#39;estante&#39;, &#39;prateleira&#39;, &#39;box&#39;.&lt;br/&gt;Tamanho: 20
     *
     * @return prateleira
     **/
    @JsonProperty("prateleira")
    public String getPrateleira() {
        return prateleira;
    }

    public void setPrateleira(String prateleira) {
        this.prateleira = prateleira;
    }

    /**
     * Rua&lt;font color&#x3D;\&quot;red\&quot;&gt;&lt;strong&gt;&lt;br/&gt;(!)&lt;/strong&gt;&lt;/font&gt;É obrigatório que pelo menos um dos seguintes atributos seja informado: &#39;setor&#39;, &#39;rua&#39;, &#39;estante&#39;, &#39;prateleira&#39;, &#39;box&#39;.&lt;br/&gt;Tamanho: 100
     *
     * @return rua
     **/
    @JsonProperty("rua")
    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public DadosLocalizaoArmazenamentoLote rua(String rua) {
        this.rua = rua;
        return this;
    }

    public DadosLocalizaoArmazenamentoLote prateleira(String prateleira) {
        this.prateleira = prateleira;
        return this;
    }

    /**
     * Setor&lt;font color&#x3D;\&quot;red\&quot;&gt;&lt;strong&gt;&lt;br/&gt;(!)&lt;/strong&gt;&lt;/font&gt;É obrigatório que pelo menos um dos seguintes atributos seja informado: &#39;setor&#39;, &#39;rua&#39;, &#39;estante&#39;, &#39;prateleira&#39;, &#39;box&#39;.&lt;br/&gt;Tamanho: 100
     *
     * @return setor
     **/
    @JsonProperty("setor")
    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public DadosLocalizaoArmazenamentoLote setor(String setor) {
        this.setor = setor;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class DadosLocalizaoArmazenamentoLote {\n" +
                "    box: " + toIndentedString(box) + "\n" +
                "    estante: " + toIndentedString(estante) + "\n" +
                "    prateleira: " + toIndentedString(prateleira) + "\n" +
                "    rua: " + toIndentedString(rua) + "\n" +
                "    setor: " + toIndentedString(setor) + "\n" +
                "}";
        return sb;
    }
}
