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
@XmlType(name = "CargaRodoviariaDetalhadaInterveniente", propOrder =
        {"email", "endereco", "identificacaoFiscal", "nacionalidadeBrasileira", "nome", "numeroLicenca", "telefone", "tipo", "tipoIdentificacaoFiscal", "tipoTransporte"
        })

@XmlRootElement(name = "CargaRodoviariaDetalhadaInterveniente")
public class CargaRodoviariaDetalhadaInterveniente {

    @XmlElement(name = "email")
    @ApiModelProperty(example = "nome.interveniente@gmail.com", value = "Email do interveniente")
    /**
     * Email do interveniente
     **/
    private String email = null;

    @XmlElement(name = "endereco")
    @ApiModelProperty(value = "")
    @Valid
    private Endereco endereco = null;

    @XmlElement(name = "identificacaoFiscal")
    @ApiModelProperty(example = "CNPJ", value = "Identificacao fiscal interveniente")
    /**
     * Identificacao fiscal interveniente
     **/
    private String identificacaoFiscal = null;

    @XmlElement(name = "nacionalidadeBrasileira")
    @ApiModelProperty(value = "")
    private Boolean nacionalidadeBrasileira = null;

    @XmlElement(name = "nome")
    @ApiModelProperty(example = "Nome do interveniente", value = "Nome do interveniente")
    /**
     * Nome do interveniente
     **/
    private String nome = null;

    @XmlElement(name = "numeroLicenca")
    @ApiModelProperty(example = "123424", value = "Número da licenca do interveniente")
    /**
     * Número da licenca do interveniente
     **/
    private String numeroLicenca = null;

    @XmlElement(name = "telefone")
    @ApiModelProperty(example = "+552199999999", value = "Email do interveniente")
    /**
     * Email do interveniente
     **/
    private String telefone = null;

    @XmlElement(name = "tipo")
    @ApiModelProperty(example = "Transportador Sucessivo", value = "Descrição do tipo de interveniente")
    /**
     * Descrição do tipo de interveniente
     **/
    private String tipo = null;

    @XmlElement(name = "tipoIdentificacaoFiscal")
    @ApiModelProperty(value = "")
    @Valid
    private TipoIdentificacaoFiscal tipoIdentificacaoFiscal = null;

    @XmlElement(name = "tipoTransporte")
    @ApiModelProperty(value = "")
    @Valid
    private TipoTransporte tipoTransporte = null;

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
     * Email do interveniente
     *
     * @return email
     **/
    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public CargaRodoviariaDetalhadaInterveniente email(String email) {
        this.email = email;
        return this;
    }

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

    /**
     * Identificacao fiscal interveniente
     *
     * @return identificacaoFiscal
     **/
    @JsonProperty("identificacaoFiscal")
    public String getIdentificacaoFiscal() {
        return identificacaoFiscal;
    }

    public void setIdentificacaoFiscal(String identificacaoFiscal) {
        this.identificacaoFiscal = identificacaoFiscal;
    }

    public CargaRodoviariaDetalhadaInterveniente identificacaoFiscal(String identificacaoFiscal) {
        this.identificacaoFiscal = identificacaoFiscal;
        return this;
    }

    public CargaRodoviariaDetalhadaInterveniente endereco(Endereco endereco) {
        this.endereco = endereco;
        return this;
    }

    /**
     * Get nacionalidadeBrasileira
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

    public CargaRodoviariaDetalhadaInterveniente nacionalidadeBrasileira(Boolean nacionalidadeBrasileira) {
        this.nacionalidadeBrasileira = nacionalidadeBrasileira;
        return this;
    }

    /**
     * Nome do interveniente
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

    public CargaRodoviariaDetalhadaInterveniente nome(String nome) {
        this.nome = nome;
        return this;
    }

    /**
     * Número da licenca do interveniente
     *
     * @return numeroLicenca
     **/
    @JsonProperty("numeroLicenca")
    public String getNumeroLicenca() {
        return numeroLicenca;
    }

    public void setNumeroLicenca(String numeroLicenca) {
        this.numeroLicenca = numeroLicenca;
    }

    /**
     * Email do interveniente
     *
     * @return telefone
     **/
    @JsonProperty("telefone")
    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public CargaRodoviariaDetalhadaInterveniente telefone(String telefone) {
        this.telefone = telefone;
        return this;
    }

    /**
     * Descrição do tipo de interveniente
     * @return tipo
     **/
    @JsonProperty("tipo")
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public CargaRodoviariaDetalhadaInterveniente tipo(String tipo) {
        this.tipo = tipo;
        return this;
    }

    /**
     * Get tipoIdentificacaoFiscal
     *
     * @return tipoIdentificacaoFiscal
     **/
    @JsonProperty("tipoIdentificacaoFiscal")
    public TipoIdentificacaoFiscal getTipoIdentificacaoFiscal() {
        return tipoIdentificacaoFiscal;
    }

    public void setTipoIdentificacaoFiscal(TipoIdentificacaoFiscal tipoIdentificacaoFiscal) {
        this.tipoIdentificacaoFiscal = tipoIdentificacaoFiscal;
    }

    public CargaRodoviariaDetalhadaInterveniente tipoIdentificacaoFiscal(TipoIdentificacaoFiscal tipoIdentificacaoFiscal) {
        this.tipoIdentificacaoFiscal = tipoIdentificacaoFiscal;
        return this;
    }

    /**
     * Get tipoTransporte
     * @return tipoTransporte
     **/
    @JsonProperty("tipoTransporte")
    public TipoTransporte getTipoTransporte() {
        return tipoTransporte;
    }

    public void setTipoTransporte(TipoTransporte tipoTransporte) {
        this.tipoTransporte = tipoTransporte;
    }

    public CargaRodoviariaDetalhadaInterveniente tipoTransporte(TipoTransporte tipoTransporte) {
        this.tipoTransporte = tipoTransporte;
        return this;
    }

    public CargaRodoviariaDetalhadaInterveniente numeroLicenca(String numeroLicenca) {
        this.numeroLicenca = numeroLicenca;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class CargaRodoviariaDetalhadaInterveniente {\n" +
                "    email: " + toIndentedString(email) + "\n" +
                "    endereco: " + toIndentedString(endereco) + "\n" +
                "    identificacaoFiscal: " + toIndentedString(identificacaoFiscal) + "\n" +
                "    nacionalidadeBrasileira: " + toIndentedString(nacionalidadeBrasileira) + "\n" +
                "    nome: " + toIndentedString(nome) + "\n" +
                "    numeroLicenca: " + toIndentedString(numeroLicenca) + "\n" +
                "    telefone: " + toIndentedString(telefone) + "\n" +
                "    tipo: " + toIndentedString(tipo) + "\n" +
                "    tipoIdentificacaoFiscal: " + toIndentedString(tipoIdentificacaoFiscal) + "\n" +
                "    tipoTransporte: " + toIndentedString(tipoTransporte) + "\n" +
                "}";
        return sb;
    }
}
