package br.gov.siscomex.portalunico.ccta.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProprietarioVeiculoTransporteRodoviario", propOrder =
        {"endereco", "licenca", "nacionalidadeBrasileira", "nome", "numeroDocumento", "tipoDocumento"
        })

@XmlRootElement(name = "ProprietarioVeiculoTransporteRodoviario")
public class ProprietarioVeiculoTransporteRodoviario {

    @XmlElement(name = "endereco")
    @ApiModelProperty(value = "")
    @Valid
    private Endereco endereco = null;

    @XmlElement(name = "licenca")
    @ApiModelProperty(example = "123424", value = "Licenca do proprietário do veículo")
    /**
     * Licenca do proprietário do veículo
     **/
    private String licenca = null;

    @XmlElement(name = "nacionalidadeBrasileira")
    @ApiModelProperty(value = "Indicador que informa se o proprietário do veículo da viagem é de nacionalidade brasileira (true/false)")
    /**
     * Indicador que informa se o proprietário do veículo da viagem é de nacionalidade brasileira (true/false)
     **/
    private Boolean nacionalidadeBrasileira = null;

    @XmlElement(name = "nome")
    @ApiModelProperty(example = "Nome e Sobrenome", value = "Nome do proprietário do veículo")
    /**
     * Nome do proprietário do veículo
     **/
    private String nome = null;

    @XmlElement(name = "numeroDocumento")
    @ApiModelProperty(example = "true", value = "Identificação fiscal do proprietário do veículo da viagem<br/>Se proprietarioVeiculoBrasileiro é S, o CPF ou CNPJ preenchido neste campo será validado na tabela de CPF ou CNPJ.<br/> Tamanho: 14")
    /**
     * Identificação fiscal do proprietário do veículo da viagem<br/>Se proprietarioVeiculoBrasileiro é S, o CPF ou CNPJ preenchido neste campo será validado na tabela de CPF ou CNPJ.<br/> Tamanho: 14
     **/
    private String numeroDocumento = null;

    @XmlElement(name = "tipoDocumento")
    @ApiModelProperty(value = "")
    @Valid
    private TipoDocumento tipoDocumento = null;

    /**
     * Get endereco
     *
     * @return endereco
     **/
    @JsonProperty("endereco")
    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public ProprietarioVeiculoTransporteRodoviario endereco(Endereco endereco) {
        this.endereco = endereco;
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
     * Licenca do proprietário do veículo
     *
     * @return licenca
     **/
    @JsonProperty("licenca")
    public String getLicenca() {
        return licenca;
    }

    public void setLicenca(String licenca) {
        this.licenca = licenca;
    }

    /**
     * Indicador que informa se o proprietário do veículo da viagem é de nacionalidade brasileira (true/false)
     *
     * @return nacionalidadeBrasileira
     **/
    @JsonProperty("nacionalidadeBrasileira")
    public Boolean isisNacionalidadeBrasileira() {
        return nacionalidadeBrasileira;
    }

    public void setNacionalidadeBrasileira(Boolean nacionalidadeBrasileira) {
        this.nacionalidadeBrasileira = nacionalidadeBrasileira;
    }

    public ProprietarioVeiculoTransporteRodoviario nacionalidadeBrasileira(Boolean nacionalidadeBrasileira) {
        this.nacionalidadeBrasileira = nacionalidadeBrasileira;
        return this;
    }

    /**
     * Nome do proprietário do veículo
     *
     * @return nome
     **/
    @JsonProperty("nome")
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ProprietarioVeiculoTransporteRodoviario nome(String nome) {
        this.nome = nome;
        return this;
    }

    /**
     * Identificação fiscal do proprietário do veículo da viagem&lt;br/&gt;Se proprietarioVeiculoBrasileiro é S, o CPF ou CNPJ preenchido neste campo será validado na tabela de CPF ou CNPJ.&lt;br/&gt; Tamanho: 14
     *
     * @return numeroDocumento
     **/
    @JsonProperty("numeroDocumento")
    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public ProprietarioVeiculoTransporteRodoviario numeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
        return this;
    }

    public ProprietarioVeiculoTransporteRodoviario licenca(String licenca) {
        this.licenca = licenca;
        return this;
    }

    /**
     * Get tipoDocumento
     *
     * @return tipoDocumento
     **/
    @JsonProperty("tipoDocumento")
    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public ProprietarioVeiculoTransporteRodoviario tipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class ProprietarioVeiculoTransporteRodoviario {\n" +
                "    endereco: " + toIndentedString(endereco) + "\n" +
                "    licenca: " + toIndentedString(licenca) + "\n" +
                "    nacionalidadeBrasileira: " + toIndentedString(nacionalidadeBrasileira) + "\n" +
                "    nome: " + toIndentedString(nome) + "\n" +
                "    numeroDocumento: " + toIndentedString(numeroDocumento) + "\n" +
                "    tipoDocumento: " + toIndentedString(tipoDocumento) + "\n" +
                "}";
        return sb;
    }
}
