package br.gov.siscomex.portalunico.cctr.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VeiculoRodovario", propOrder =
        {"veiculo", "indTtransportadorProprietario", "reboques", "cpjCnpjResponsavel", "nomeResponsavel"
        })

@XmlRootElement(name = "VeiculoRodovario")
/**
 * Informações sobre o veículo Rodoviário
 **/
@ApiModel(description = "Informações sobre o veículo Rodoviário")
public class VeiculoRodovario {

    @XmlElement(name = "veiculo")
    @ApiModelProperty(value = "")
    @Valid
    private Veiculo veiculo = null;

    @XmlElement(name = "indTtransportadorProprietario")
    @ApiModelProperty(example = "N", value = "Indicador para transportador proprietário do veículo")
    /**
     * Indicador para transportador proprietário do veículo
     **/
    private String indTtransportadorProprietario = null;

    @XmlElement(name = "reboques")
    @ApiModelProperty(value = "informações sobre os reboques")
    @Valid
    /**
     * informações sobre os reboques
     **/
    private List<Veiculo> reboques = null;

    @XmlElement(name = "cpjCnpjResponsavel")
    @ApiModelProperty(example = "9999999999", value = "CPF ou CNPJ do responsável pelo veículo<br>Tamanho: 11<br>Formato: NNNNNNNNNNN")
    /**
     * CPF ou CNPJ do responsável pelo veículo<br>Tamanho: 11<br>Formato: NNNNNNNNNNN
     **/
    private String cpjCnpjResponsavel = null;

    @XmlElement(name = "nomeResponsavel")
    @ApiModelProperty(example = "Nome do responsável pelo veículo", value = "Nome do responsável pelo veículo")
    /**
     * Nome do responsável pelo veículo
     **/
    private String nomeResponsavel = null;

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
     * Get veiculo
     *
     * @return veiculo
     **/
    @JsonProperty("veiculo")
    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public VeiculoRodovario veiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
        return this;
    }

    /**
     * Indicador para transportador proprietário do veículo
     *
     * @return indTtransportadorProprietario
     **/
    @JsonProperty("indTtransportadorProprietario")
    public String getIndTtransportadorProprietario() {
        return indTtransportadorProprietario;
    }

    public void setIndTtransportadorProprietario(String indTtransportadorProprietario) {
        this.indTtransportadorProprietario = indTtransportadorProprietario;
    }

    public VeiculoRodovario indTtransportadorProprietario(String indTtransportadorProprietario) {
        this.indTtransportadorProprietario = indTtransportadorProprietario;
        return this;
    }

    /**
     * informações sobre os reboques
     *
     * @return reboques
     **/
    @JsonProperty("reboques")
    public List<Veiculo> getReboques() {
        return reboques;
    }

    public void setReboques(List<Veiculo> reboques) {
        this.reboques = reboques;
    }

    public VeiculoRodovario reboques(List<Veiculo> reboques) {
        this.reboques = reboques;
        return this;
    }

    public VeiculoRodovario addReboquesItem(Veiculo reboquesItem) {
        this.reboques.add(reboquesItem);
        return this;
    }

    /**
     * CPF ou CNPJ do responsável pelo veículo&lt;br&gt;Tamanho: 11&lt;br&gt;Formato: NNNNNNNNNNN
     *
     * @return cpjCnpjResponsavel
     **/
    @JsonProperty("cpjCnpjResponsavel")
    public String getCpjCnpjResponsavel() {
        return cpjCnpjResponsavel;
    }

    public void setCpjCnpjResponsavel(String cpjCnpjResponsavel) {
        this.cpjCnpjResponsavel = cpjCnpjResponsavel;
    }

    public VeiculoRodovario cpjCnpjResponsavel(String cpjCnpjResponsavel) {
        this.cpjCnpjResponsavel = cpjCnpjResponsavel;
        return this;
    }

    /**
     * Nome do responsável pelo veículo
     *
     * @return nomeResponsavel
     **/
    @JsonProperty("nomeResponsavel")
    public String getNomeResponsavel() {
        return nomeResponsavel;
    }

    public void setNomeResponsavel(String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
    }

    public VeiculoRodovario nomeResponsavel(String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class VeiculoRodovario {\n" +
                "    veiculo: " + toIndentedString(veiculo) + "\n" +
                "    indTtransportadorProprietario: " + toIndentedString(indTtransportadorProprietario) + "\n" +
                "    reboques: " + toIndentedString(reboques) + "\n" +
                "    cpjCnpjResponsavel: " + toIndentedString(cpjCnpjResponsavel) + "\n" +
                "    nomeResponsavel: " + toIndentedString(nomeResponsavel) + "\n" +
                "}";
        return sb;
    }
}
