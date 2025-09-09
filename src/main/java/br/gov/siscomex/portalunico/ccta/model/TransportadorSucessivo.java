package br.gov.siscomex.portalunico.ccta.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransportadorSucessivo", propOrder =
        {"identificacaoRepresentanteTransportador", "licencaOriginaria", "nomeTransportadorEstrangeiro", "nacionalidadeBrasileira", "identificacaoTransportadorNacional", "tipoTransporte", "licencaComplementar"
        })

@XmlRootElement(name = "TransportadorSucessivo")
public class TransportadorSucessivo {

    @XmlElement(name = "identificacaoRepresentanteTransportador")
    @ApiModelProperty(example = "00000000000191", value = "CPF/CNPJ do representante do transportador sucessivo estrangeiro<br/>Se campo nacionalidadeBrasileira do transportador sucessivo  igual a \"false\" ( Transportador estrangeiro) é obrigatório o preenchimento desse campo. <br/>O CPF/CNPJ deve estar ativo no cadastro de CPF/CNPJ<br/> Tamanho: 14")
    /**
     * CPF/CNPJ do representante do transportador sucessivo estrangeiro<br/>Se campo nacionalidadeBrasileira do transportador sucessivo  igual a \"false\" ( Transportador estrangeiro) é obrigatório o preenchimento desse campo. <br/>O CPF/CNPJ deve estar ativo no cadastro de CPF/CNPJ<br/> Tamanho: 14
     **/
    private String identificacaoRepresentanteTransportador = null;

    @XmlElement(name = "licencaOriginaria")
    @ApiModelProperty(example = "123424", value = "Licença originária do transportador sucessivo nacional<br/>Se tipoTransporte do transportador sucessivo = \"REG\" ecampo nacionalidadeBrasileira do transportador sucessivo  igual a \"true\" ( Transportador Nacional) é obrigatório o preenchimento desse campo<br/> Tamanho Máximo: 6")
    /**
     * Licença originária do transportador sucessivo nacional<br/>Se tipoTransporte do transportador sucessivo = \"REG\" ecampo nacionalidadeBrasileira do transportador sucessivo  igual a \"true\" ( Transportador Nacional) é obrigatório o preenchimento desse campo<br/> Tamanho Máximo: 6
     **/
    private String licencaOriginaria = null;

    @XmlElement(name = "nomeTransportadorEstrangeiro")
    @ApiModelProperty(value = "Nome do transportador estrangeiro sucessivo<br/>Se campo nacionalidadeBrasileira do transportador sucessivo  igual a \"false\" ( Transportador Estrangeiro) é obrigatório o preenchimento. <br/> Tamanho Máximo: 60")
    /**
     * Nome do transportador estrangeiro sucessivo<br/>Se campo nacionalidadeBrasileira do transportador sucessivo  igual a \"false\" ( Transportador Estrangeiro) é obrigatório o preenchimento. <br/> Tamanho Máximo: 60
     **/
    private String nomeTransportadorEstrangeiro = null;

    @XmlElement(name = "nacionalidadeBrasileira", required = true)
    @ApiModelProperty(required = true, value = "Indica que o transportador sucessivo da carga é brasileiro")
    /**
     * Indica que o transportador sucessivo da carga é brasileiro
     **/
    private Boolean nacionalidadeBrasileira = null;

    @XmlElement(name = "identificacaoTransportadorNacional")
    @ApiModelProperty(example = "00000000000191", value = "Identificação do transportador sucessivo Nacional<br/> Se campo nacionalidadeBrasileira do transportador sucessivo  igual a \"true\" (Transportador Nacional) é obrigatório o preenchimento do CNPJ. Este CNPJ deve estar ativo no cadastro de CNPJ e ser validado no Cadastro de Transportadores.<br/> Tamanho: 14")
    /**
     * Identificação do transportador sucessivo Nacional<br/> Se campo nacionalidadeBrasileira do transportador sucessivo  igual a \"true\" (Transportador Nacional) é obrigatório o preenchimento do CNPJ. Este CNPJ deve estar ativo no cadastro de CNPJ e ser validado no Cadastro de Transportadores.<br/> Tamanho: 14
     **/
    private String identificacaoTransportadorNacional = null;

    @XmlElement(name = "tipoTransporte", required = true)
    @ApiModelProperty(example = "REG", required = true, value = "Tipo de transporte do transportador sucessivo<br/>REG = Regular PRO=próprio OCA=Ocasiona<br/> Tamanho Máximo: 3")
    /**
     * Tipo de transporte do transportador sucessivo<br/>REG = Regular PRO=próprio OCA=Ocasiona<br/> Tamanho Máximo: 3
     **/
    private String tipoTransporte = null;

    @XmlElement(name = "licencaComplementar")
    @ApiModelProperty(example = "123424", value = "Licença complementar do transportador sucessivo estrangeiro<br/>Se tipoTransporte do transportador sucessivo = \"REG\" e campo nacionalidadeBrasileira do transportador sucessivo  igual a \"false\" ( Transportador estrangeiro) é obrigatório<br/> Tamanho Máximo: 6")
    /**
     * Licença complementar do transportador sucessivo estrangeiro<br/>Se tipoTransporte do transportador sucessivo = \"REG\" e campo nacionalidadeBrasileira do transportador sucessivo  igual a \"false\" ( Transportador estrangeiro) é obrigatório<br/> Tamanho Máximo: 6
     **/
    private String licencaComplementar = null;

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
     * CPF/CNPJ do representante do transportador sucessivo estrangeiro&lt;br/&gt;Se campo nacionalidadeBrasileira do transportador sucessivo  igual a \&quot;false\&quot; ( Transportador estrangeiro) é obrigatório o preenchimento desse campo. &lt;br/&gt;O CPF/CNPJ deve estar ativo no cadastro de CPF/CNPJ&lt;br/&gt; Tamanho: 14
     *
     * @return identificacaoRepresentanteTransportador
     **/
    @JsonProperty("identificacaoRepresentanteTransportador")
    public String getIdentificacaoRepresentanteTransportador() {
        return identificacaoRepresentanteTransportador;
    }

    public void setIdentificacaoRepresentanteTransportador(String identificacaoRepresentanteTransportador) {
        this.identificacaoRepresentanteTransportador = identificacaoRepresentanteTransportador;
    }

    public TransportadorSucessivo identificacaoRepresentanteTransportador(String identificacaoRepresentanteTransportador) {
        this.identificacaoRepresentanteTransportador = identificacaoRepresentanteTransportador;
        return this;
    }

    /**
     * Licença originária do transportador sucessivo nacional&lt;br/&gt;Se tipoTransporte do transportador sucessivo &#x3D; \&quot;REG\&quot; ecampo nacionalidadeBrasileira do transportador sucessivo  igual a \&quot;true\&quot; ( Transportador Nacional) é obrigatório o preenchimento desse campo&lt;br/&gt; Tamanho Máximo: 6
     *
     * @return licencaOriginaria
     **/
    @JsonProperty("licencaOriginaria")
    public String getLicencaOriginaria() {
        return licencaOriginaria;
    }

    public void setLicencaOriginaria(String licencaOriginaria) {
        this.licencaOriginaria = licencaOriginaria;
    }

    public TransportadorSucessivo licencaOriginaria(String licencaOriginaria) {
        this.licencaOriginaria = licencaOriginaria;
        return this;
    }

    /**
     * Nome do transportador estrangeiro sucessivo&lt;br/&gt;Se campo nacionalidadeBrasileira do transportador sucessivo  igual a \&quot;false\&quot; ( Transportador Estrangeiro) é obrigatório o preenchimento. &lt;br/&gt; Tamanho Máximo: 60
     *
     * @return nomeTransportadorEstrangeiro
     **/
    @JsonProperty("nomeTransportadorEstrangeiro")
    public String getNomeTransportadorEstrangeiro() {
        return nomeTransportadorEstrangeiro;
    }

    public void setNomeTransportadorEstrangeiro(String nomeTransportadorEstrangeiro) {
        this.nomeTransportadorEstrangeiro = nomeTransportadorEstrangeiro;
    }

    public TransportadorSucessivo nomeTransportadorEstrangeiro(String nomeTransportadorEstrangeiro) {
        this.nomeTransportadorEstrangeiro = nomeTransportadorEstrangeiro;
        return this;
    }

    /**
     * Indica que o transportador sucessivo da carga é brasileiro
     *
     * @return nacionalidadeBrasileira
     **/
    @JsonProperty("nacionalidadeBrasileira")
    @NotNull
    public Boolean isisNacionalidadeBrasileira() {
        return nacionalidadeBrasileira;
    }

    public void setNacionalidadeBrasileira(Boolean nacionalidadeBrasileira) {
        this.nacionalidadeBrasileira = nacionalidadeBrasileira;
    }

    public TransportadorSucessivo nacionalidadeBrasileira(Boolean nacionalidadeBrasileira) {
        this.nacionalidadeBrasileira = nacionalidadeBrasileira;
        return this;
    }

    /**
     * Identificação do transportador sucessivo Nacional&lt;br/&gt; Se campo nacionalidadeBrasileira do transportador sucessivo  igual a \&quot;true\&quot; (Transportador Nacional) é obrigatório o preenchimento do CNPJ. Este CNPJ deve estar ativo no cadastro de CNPJ e ser validado no Cadastro de Transportadores.&lt;br/&gt; Tamanho: 14
     *
     * @return identificacaoTransportadorNacional
     **/
    @JsonProperty("identificacaoTransportadorNacional")
    public String getIdentificacaoTransportadorNacional() {
        return identificacaoTransportadorNacional;
    }

    public void setIdentificacaoTransportadorNacional(String identificacaoTransportadorNacional) {
        this.identificacaoTransportadorNacional = identificacaoTransportadorNacional;
    }

    public TransportadorSucessivo identificacaoTransportadorNacional(String identificacaoTransportadorNacional) {
        this.identificacaoTransportadorNacional = identificacaoTransportadorNacional;
        return this;
    }

    /**
     * Tipo de transporte do transportador sucessivo&lt;br/&gt;REG &#x3D; Regular PRO&#x3D;próprio OCA&#x3D;Ocasiona&lt;br/&gt; Tamanho Máximo: 3
     *
     * @return tipoTransporte
     **/
    @JsonProperty("tipoTransporte")
    @NotNull
    public String getTipoTransporte() {
        return tipoTransporte;
    }

    public void setTipoTransporte(String tipoTransporte) {
        this.tipoTransporte = tipoTransporte;
    }

    public TransportadorSucessivo tipoTransporte(String tipoTransporte) {
        this.tipoTransporte = tipoTransporte;
        return this;
    }

    /**
     * Licença complementar do transportador sucessivo estrangeiro&lt;br/&gt;Se tipoTransporte do transportador sucessivo &#x3D; \&quot;REG\&quot; e campo nacionalidadeBrasileira do transportador sucessivo  igual a \&quot;false\&quot; ( Transportador estrangeiro) é obrigatório&lt;br/&gt; Tamanho Máximo: 6
     *
     * @return licencaComplementar
     **/
    @JsonProperty("licencaComplementar")
    public String getLicencaComplementar() {
        return licencaComplementar;
    }

    public void setLicencaComplementar(String licencaComplementar) {
        this.licencaComplementar = licencaComplementar;
    }

    public TransportadorSucessivo licencaComplementar(String licencaComplementar) {
        this.licencaComplementar = licencaComplementar;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class TransportadorSucessivo {\n" +
                "    identificacaoRepresentanteTransportador: " + toIndentedString(identificacaoRepresentanteTransportador) + "\n" +
                "    licencaOriginaria: " + toIndentedString(licencaOriginaria) + "\n" +
                "    nomeTransportadorEstrangeiro: " + toIndentedString(nomeTransportadorEstrangeiro) + "\n" +
                "    nacionalidadeBrasileira: " + toIndentedString(nacionalidadeBrasileira) + "\n" +
                "    identificacaoTransportadorNacional: " + toIndentedString(identificacaoTransportadorNacional) + "\n" +
                "    tipoTransporte: " + toIndentedString(tipoTransporte) + "\n" +
                "    licencaComplementar: " + toIndentedString(licencaComplementar) + "\n" +
                "}";
        return sb;
    }
}
