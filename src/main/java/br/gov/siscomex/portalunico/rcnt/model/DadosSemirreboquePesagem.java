package br.gov.siscomex.portalunico.rcnt.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DadosSemirreboquePesagem", propOrder =
        {"idElemento", "ocrPlaca", "placa", "tara"
        })

@XmlRootElement(name = "DadosSemirreboquePesagem")
public class DadosSemirreboquePesagem {

    @XmlElement(name = "idElemento", required = true)
    @ApiModelProperty(required = true, value = "Identificação de cada elemento da lista. Este atributo é obrigatório e deve ser único dentro da lista correspondente.<br/>Tamanho: 40")
    /**
     * Identificação de cada elemento da lista. Este atributo é obrigatório e deve ser único dentro da lista correspondente.<br/>Tamanho: 40
     **/
    private String idElemento = null;

    @XmlElement(name = "ocrPlaca")
    @ApiModelProperty(example = "false", value = "Captura automática da placa. Indica se a placa foi obtida via OCR (Optical Character Recognition).<font color=\"red\"><strong><br/>(!)</strong></font>É obrigatório informar o atributo 'listaSemirreboque.ocrPlaca' quando o atributo 'listaSemirreboque.placa' for informado.<br/>Domínio:<br/>true - Sim<br/>false - Não")
    /**
     * Captura automática da placa. Indica se a placa foi obtida via OCR (Optical Character Recognition).<font color=\"red\"><strong><br/>(!)</strong></font>É obrigatório informar o atributo 'listaSemirreboque.ocrPlaca' quando o atributo 'listaSemirreboque.placa' for informado.<br/>Domínio:<br/>true - Sim<br/>false - Não
     **/
    private Boolean ocrPlaca = null;

    @XmlElement(name = "placa")
    @ApiModelProperty(value = "Placa<br/>Tamanho: 50")
    /**
     * Placa<br/>Tamanho: 50
     **/
    private String placa = null;

    @XmlElement(name = "tara")
    @ApiModelProperty(example = "15.5", value = "Tara do veículo. Para os casos em que a tara é aferida separadamente (cavalo/semireboque). Cadastro de taras comum no modal rodoviário.<font color=\"red\"><strong><br/>(!)</strong></font>É obrigatório informar pelo menos um dos seguintes atributos: 'taraConjunto', 'listaSemirreboque.tara', quando o atributo 'listaSemirreboque.placa' estiver informado.<br/>tara, até 4 casas decimais.")
    @Valid
    /**
     * Tara do veículo. Para os casos em que a tara é aferida separadamente (cavalo/semireboque). Cadastro de taras comum no modal rodoviário.<font color=\"red\"><strong><br/>(!)</strong></font>É obrigatório informar pelo menos um dos seguintes atributos: 'taraConjunto', 'listaSemirreboque.tara', quando o atributo 'listaSemirreboque.placa' estiver informado.<br/>tara, até 4 casas decimais.
     **/
    private BigDecimal tara = null;

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

    public DadosSemirreboquePesagem idElemento(String idElemento) {
        this.idElemento = idElemento;
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
     * Captura automática da placa. Indica se a placa foi obtida via OCR (Optical Character Recognition).&lt;font color&#x3D;\&quot;red\&quot;&gt;&lt;strong&gt;&lt;br/&gt;(!)&lt;/strong&gt;&lt;/font&gt;É obrigatório informar o atributo &#39;listaSemirreboque.ocrPlaca&#39; quando o atributo &#39;listaSemirreboque.placa&#39; for informado.&lt;br/&gt;Domínio:&lt;br/&gt;true - Sim&lt;br/&gt;false - Não
     *
     * @return ocrPlaca
     **/
    @JsonProperty("ocrPlaca")
    public Boolean isisOcrPlaca() {
        return ocrPlaca;
    }

    public void setOcrPlaca(Boolean ocrPlaca) {
        this.ocrPlaca = ocrPlaca;
    }

    /**
     * Placa&lt;br/&gt;Tamanho: 50
     *
     * @return placa
     **/
    @JsonProperty("placa")
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public DadosSemirreboquePesagem placa(String placa) {
        this.placa = placa;
        return this;
    }

    public DadosSemirreboquePesagem ocrPlaca(Boolean ocrPlaca) {
        this.ocrPlaca = ocrPlaca;
        return this;
    }

    /**
     * Tara do veículo. Para os casos em que a tara é aferida separadamente (cavalo/semireboque). Cadastro de taras comum no modal rodoviário.&lt;font color&#x3D;\&quot;red\&quot;&gt;&lt;strong&gt;&lt;br/&gt;(!)&lt;/strong&gt;&lt;/font&gt;É obrigatório informar pelo menos um dos seguintes atributos: &#39;taraConjunto&#39;, &#39;listaSemirreboque.tara&#39;, quando o atributo &#39;listaSemirreboque.placa&#39; estiver informado.&lt;br/&gt;tara, até 4 casas decimais.
     *
     * @return tara
     **/
    @JsonProperty("tara")
    public BigDecimal getTara() {
        return tara;
    }

    public void setTara(BigDecimal tara) {
        this.tara = tara;
    }

    public DadosSemirreboquePesagem tara(BigDecimal tara) {
        this.tara = tara;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class DadosSemirreboquePesagem {\n" +
                "    idElemento: " + toIndentedString(idElemento) + "\n" +
                "    ocrPlaca: " + toIndentedString(ocrPlaca) + "\n" +
                "    placa: " + toIndentedString(placa) + "\n" +
                "    tara: " + toIndentedString(tara) + "\n" +
                "}";
        return sb;
    }
}
