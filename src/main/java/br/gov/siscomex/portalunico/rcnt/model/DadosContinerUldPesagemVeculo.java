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
@XmlType(name = "DadosContinerUldPesagemVeculo", propOrder =
        {"idElemento", "numeroConteiner", "identificacaoUld", "tipo", "ocrNumero", "tara"
        })

@XmlRootElement(name = "DadosContinerUldPesagemVeculo")
public class DadosContinerUldPesagemVeculo {

    @XmlElement(name = "idElemento", required = true)
    @ApiModelProperty(required = true, value = "Identificação de cada elemento da lista. Este atributo é obrigatório e deve ser único dentro da lista correspondente.<br/>Tamanho: 40")
    /**
     * Identificação de cada elemento da lista. Este atributo é obrigatório e deve ser único dentro da lista correspondente.<br/>Tamanho: 40
     **/
    private String idElemento = null;

    @XmlElement(name = "numeroConteiner")
    @ApiModelProperty(value = "Identificação do número do contêiner.<br/>Tamanho: 200")
    /**
     * Identificação do número do contêiner.<br/>Tamanho: 200
     **/
    private String numeroConteiner = null;

    @XmlElement(name = "identificacaoUld")
    @ApiModelProperty(example = "AZEB123_AA, AKE21001NZ", value = "Identificação da ULD no formato (TTTNNNNNPP) composta pelos seguintes atributos: Tipo de ULD (3 caracteres - TTT), Número da ULD (5 caracteres - NNNNN - Caso o número tenha menos que 5 caracteres, preencher à direita com o caracter especial \"_\") e Código do proprietário da ULD (2 caracteres - PP).<br/>Tamanho: 10")
    /**
     * Identificação da ULD no formato (TTTNNNNNPP) composta pelos seguintes atributos: Tipo de ULD (3 caracteres - TTT), Número da ULD (5 caracteres - NNNNN - Caso o número tenha menos que 5 caracteres, preencher à direita com o caracter especial \"_\") e Código do proprietário da ULD (2 caracteres - PP).<br/>Tamanho: 10
     **/
    private String identificacaoUld = null;

    @XmlElement(name = "tipo")
    @ApiModelProperty(example = "12U0", value = " Conforme tabela de domínio Tipo de Conteiner disponível no <a href=https://portalunico.siscomex.gov.br/tabx/#/tabelas rel=\"noopener noreferrer\" target=\"_blank\">Portal Único Siscomex.</a><font color=\"red\"><strong><br/>(!)</strong></font>É obrigatório informar o atributo 'tipoConteiner' quando o atributo 'numeroConteiner' for informado.")
    /**
     *  Conforme tabela de domínio Tipo de Conteiner disponível no <a href=https://portalunico.siscomex.gov.br/tabx/#/tabelas rel=\"noopener noreferrer\" target=\"_blank\">Portal Único Siscomex.</a><font color=\"red\"><strong><br/>(!)</strong></font>É obrigatório informar o atributo 'tipoConteiner' quando o atributo 'numeroConteiner' for informado.
     **/
    private String tipo = null;

    @XmlElement(name = "ocrNumero")
    @ApiModelProperty(example = "false", value = "Captura automática do número do contêiner ou ULD via OCR (Optical Character Recognition).<font color=\"red\"><strong><br/>(!)</strong></font>É obrigatório informar o atributo 'listaConteineresUld.ocrNumero' quando pelo menos um dos seguintes atributos estiver informado: 'listaConteineresUld.identificacaoUld', 'listaConteineresUld.numeroConteiner'.<br/>Domínio:<br/>true - Sim<br/>false - Não")
    /**
     * Captura automática do número do contêiner ou ULD via OCR (Optical Character Recognition).<font color=\"red\"><strong><br/>(!)</strong></font>É obrigatório informar o atributo 'listaConteineresUld.ocrNumero' quando pelo menos um dos seguintes atributos estiver informado: 'listaConteineresUld.identificacaoUld', 'listaConteineresUld.numeroConteiner'.<br/>Domínio:<br/>true - Sim<br/>false - Não
     **/
    private Boolean ocrNumero = null;

    @XmlElement(name = "tara")
    @ApiModelProperty(example = "15.5", value = "Tara do contêiner ou ULD<font color=\"red\"><strong><br/>(!)</strong></font>É obrigatório informar o atributo 'tara' quando pelo menos um dos seguintes atributos estiver informado: 'numeroConteiner', 'identificacaoULD'.<br/>tara, até 4 casas decimais.")
    @Valid
    /**
     * Tara do contêiner ou ULD<font color=\"red\"><strong><br/>(!)</strong></font>É obrigatório informar o atributo 'tara' quando pelo menos um dos seguintes atributos estiver informado: 'numeroConteiner', 'identificacaoULD'.<br/>tara, até 4 casas decimais.
     **/
    private BigDecimal tara = null;

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

    /**
     * Identificação do número do contêiner.&lt;br/&gt;Tamanho: 200
     *
     * @return numeroConteiner
     **/
    @JsonProperty("numeroConteiner")
    public String getNumeroConteiner() {
        return numeroConteiner;
    }

    public void setNumeroConteiner(String numeroConteiner) {
        this.numeroConteiner = numeroConteiner;
    }

    public DadosContinerUldPesagemVeculo numeroConteiner(String numeroConteiner) {
        this.numeroConteiner = numeroConteiner;
        return this;
    }

    public DadosContinerUldPesagemVeculo idElemento(String idElemento) {
        this.idElemento = idElemento;
        return this;
    }

    /**
     * Identificação da ULD no formato (TTTNNNNNPP) composta pelos seguintes atributos: Tipo de ULD (3 caracteres - TTT), Número da ULD (5 caracteres - NNNNN - Caso o número tenha menos que 5 caracteres, preencher à direita com o caracter especial \&quot;_\&quot;) e Código do proprietário da ULD (2 caracteres - PP).&lt;br/&gt;Tamanho: 10
     *
     * @return identificacaoUld
     **/
    @JsonProperty("identificacaoUld")
    public String getIdentificacaoUld() {
        return identificacaoUld;
    }

    public void setIdentificacaoUld(String identificacaoUld) {
        this.identificacaoUld = identificacaoUld;
    }

    public DadosContinerUldPesagemVeculo identificacaoUld(String identificacaoUld) {
        this.identificacaoUld = identificacaoUld;
        return this;
    }

    /**
     * Conforme tabela de domínio Tipo de Conteiner disponível no &lt;a href&#x3D;https://portalunico.siscomex.gov.br/tabx/#/tabelas rel&#x3D;\&quot;noopener noreferrer\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Portal Único Siscomex.&lt;/a&gt;&lt;font color&#x3D;\&quot;red\&quot;&gt;&lt;strong&gt;&lt;br/&gt;(!)&lt;/strong&gt;&lt;/font&gt;É obrigatório informar o atributo &#39;tipoConteiner&#39; quando o atributo &#39;numeroConteiner&#39; for informado.
     *
     * @return tipo
     **/
    @JsonProperty("tipo")
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Captura automática do número do contêiner ou ULD via OCR (Optical Character Recognition).&lt;font color&#x3D;\&quot;red\&quot;&gt;&lt;strong&gt;&lt;br/&gt;(!)&lt;/strong&gt;&lt;/font&gt;É obrigatório informar o atributo &#39;listaConteineresUld.ocrNumero&#39; quando pelo menos um dos seguintes atributos estiver informado: &#39;listaConteineresUld.identificacaoUld&#39;, &#39;listaConteineresUld.numeroConteiner&#39;.&lt;br/&gt;Domínio:&lt;br/&gt;true - Sim&lt;br/&gt;false - Não
     *
     * @return ocrNumero
     **/
    @JsonProperty("ocrNumero")
    public Boolean isisOcrNumero() {
        return ocrNumero;
    }

    public void setOcrNumero(Boolean ocrNumero) {
        this.ocrNumero = ocrNumero;
    }

    public DadosContinerUldPesagemVeculo ocrNumero(Boolean ocrNumero) {
        this.ocrNumero = ocrNumero;
        return this;
    }

    public DadosContinerUldPesagemVeculo tipo(String tipo) {
        this.tipo = tipo;
        return this;
    }

    /**
     * Tara do contêiner ou ULD&lt;font color&#x3D;\&quot;red\&quot;&gt;&lt;strong&gt;&lt;br/&gt;(!)&lt;/strong&gt;&lt;/font&gt;É obrigatório informar o atributo &#39;tara&#39; quando pelo menos um dos seguintes atributos estiver informado: &#39;numeroConteiner&#39;, &#39;identificacaoULD&#39;.&lt;br/&gt;tara, até 4 casas decimais.
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

    public DadosContinerUldPesagemVeculo tara(BigDecimal tara) {
        this.tara = tara;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class DadosContinerUldPesagemVeculo {\n" +
                "    idElemento: " + toIndentedString(idElemento) + "\n" +
                "    numeroConteiner: " + toIndentedString(numeroConteiner) + "\n" +
                "    identificacaoUld: " + toIndentedString(identificacaoUld) + "\n" +
                "    tipo: " + toIndentedString(tipo) + "\n" +
                "    ocrNumero: " + toIndentedString(ocrNumero) + "\n" +
                "    tara: " + toIndentedString(tara) + "\n" +
                "}";
        return sb;
    }
}
