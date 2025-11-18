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
@XmlType(name = "ViagemRodoviariaDetalhadaVeiculo", propOrder =
        {"condutor", "proprietario", "veiculo"
        })

@XmlRootElement(name = "ViagemRodoviariaDetalhadaVeiculo")
public class ViagemRodoviariaDetalhadaVeiculo {

    @XmlElement(name = "condutor")
    @ApiModelProperty(value = "")
    @Valid
    private PessoaVeiculoTransporteRodoviario condutor = null;

    @XmlElement(name = "proprietario")
    @ApiModelProperty(value = "")
    @Valid
    private ProprietarioVeiculoTransporteRodoviario proprietario = null;

    @XmlElement(name = "veiculo")
    @ApiModelProperty(value = "")
    @Valid
    private VeiculoTransporteRodoviario veiculo = null;

    /**
     * Get condutor
     *
     * @return condutor
     **/
    @JsonProperty("condutor")
    public PessoaVeiculoTransporteRodoviario getCondutor() {
        return condutor;
    }

    public void setCondutor(PessoaVeiculoTransporteRodoviario condutor) {
        this.condutor = condutor;
    }

    public ViagemRodoviariaDetalhadaVeiculo condutor(PessoaVeiculoTransporteRodoviario condutor) {
        this.condutor = condutor;
        return this;
    }

    /**
     * Get proprietario
     *
     * @return proprietario
     **/
    @JsonProperty("proprietario")
    public ProprietarioVeiculoTransporteRodoviario getProprietario() {
        return proprietario;
    }

    public void setProprietario(ProprietarioVeiculoTransporteRodoviario proprietario) {
        this.proprietario = proprietario;
    }

    public ViagemRodoviariaDetalhadaVeiculo proprietario(ProprietarioVeiculoTransporteRodoviario proprietario) {
        this.proprietario = proprietario;
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
     * Get veiculo
     *
     * @return veiculo
     **/
    @JsonProperty("veiculo")
    public VeiculoTransporteRodoviario getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(VeiculoTransporteRodoviario veiculo) {
        this.veiculo = veiculo;
    }

    public ViagemRodoviariaDetalhadaVeiculo veiculo(VeiculoTransporteRodoviario veiculo) {
        this.veiculo = veiculo;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class ViagemRodoviariaDetalhadaVeiculo {\n" +
                "    condutor: " + toIndentedString(condutor) + "\n" +
                "    proprietario: " + toIndentedString(proprietario) + "\n" +
                "    veiculo: " + toIndentedString(veiculo) + "\n" +
                "}";
        return sb;
    }
}
