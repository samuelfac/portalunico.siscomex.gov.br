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
@XmlType(name = "TransportadorRodoviarioNacBrasileira", propOrder =
        {"cnpj", "endereco", "numeroLicencaOriginaria", "tipoTransporte"
        })

@XmlRootElement(name = "TransportadorRodoviarioNacBrasileira")
public class TransportadorRodoviarioNacBrasileira {

    @XmlElement(name = "cnpj")
    @ApiModelProperty(value = "")
    @Valid
    private CnpjCPf cnpj = null;

    @XmlElement(name = "endereco")
    @ApiModelProperty(value = "")
    @Valid
    private Endereco endereco = null;

    @XmlElement(name = "numeroLicencaOriginaria")
    @ApiModelProperty(example = "123424", value = "Licença originária do proprietário do veículo<br/>campo obrigatório se tipoTransporte é REG ou OCA.<br/> Tamanho Máximo: 6")
    /**
     * Licença originária do proprietário do veículo<br/>campo obrigatório se tipoTransporte é REG ou OCA.<br/> Tamanho Máximo: 6
     **/
    private Integer numeroLicencaOriginaria = null;

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
     * Get cnpj
     *
     * @return cnpj
     **/
    @JsonProperty("cnpj")
    public CnpjCPf getCnpj() {
        return cnpj;
    }

    public void setCnpj(CnpjCPf cnpj) {
        this.cnpj = cnpj;
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

    public TransportadorRodoviarioNacBrasileira endereco(Endereco endereco) {
        this.endereco = endereco;
        return this;
    }

    /**
     * Licença originária do proprietário do veículo&lt;br/&gt;campo obrigatório se tipoTransporte é REG ou OCA.&lt;br/&gt; Tamanho Máximo: 6
     *
     * @return numeroLicencaOriginaria
     **/
    @JsonProperty("numeroLicencaOriginaria")
    public Integer getNumeroLicencaOriginaria() {
        return numeroLicencaOriginaria;
    }

    public void setNumeroLicencaOriginaria(Integer numeroLicencaOriginaria) {
        this.numeroLicencaOriginaria = numeroLicencaOriginaria;
    }

    public TransportadorRodoviarioNacBrasileira numeroLicencaOriginaria(Integer numeroLicencaOriginaria) {
        this.numeroLicencaOriginaria = numeroLicencaOriginaria;
        return this;
    }

    /**
     * Get tipoTransporte
     *
     * @return tipoTransporte
     **/
    @JsonProperty("tipoTransporte")
    public TipoTransporte getTipoTransporte() {
        return tipoTransporte;
    }

    public void setTipoTransporte(TipoTransporte tipoTransporte) {
        this.tipoTransporte = tipoTransporte;
    }

    public TransportadorRodoviarioNacBrasileira tipoTransporte(TipoTransporte tipoTransporte) {
        this.tipoTransporte = tipoTransporte;
        return this;
    }

    public TransportadorRodoviarioNacBrasileira cnpj(CnpjCPf cnpj) {
        this.cnpj = cnpj;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class TransportadorRodoviarioNacBrasileira {\n" +
                "    cnpj: " + toIndentedString(cnpj) + "\n" +
                "    endereco: " + toIndentedString(endereco) + "\n" +
                "    numeroLicencaOriginaria: " + toIndentedString(numeroLicencaOriginaria) + "\n" +
                "    tipoTransporte: " + toIndentedString(tipoTransporte) + "\n" +
                "}";
        return sb;
    }
}
