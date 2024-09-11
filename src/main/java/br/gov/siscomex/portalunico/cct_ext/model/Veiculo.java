package br.gov.siscomex.portalunico.cct_ext.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Veiculo", propOrder =
        {"placa", "lacres"
        })

@XmlRootElement(name = "Veiculo")
/**
 * Dados do veículo
 **/
@ApiModel(description = "Dados do veículo")
public class Veiculo {

    @XmlElement(name = "placa")
    @ApiModelProperty(example = "TTT1234", value = "Placa do veículo<br>Tamanho: 15")
    /**
     * Placa do veículo<br>Tamanho: 15
     **/
    private String placa = null;

    @XmlElement(name = "lacres")
    @ApiModelProperty(example = "[12345,54321]", value = "Lista com os códigos dos lacres vinculados ao veículo<br>Tamanho de cada lacre: 15")
    /**
     * Lista com os códigos dos lacres vinculados ao veículo<br>Tamanho de cada lacre: 15
     **/
    private List<String> lacres = null;

    /**
     * Placa do veículo&lt;br&gt;Tamanho: 15
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

    public Veiculo placa(String placa) {
        this.placa = placa;
        return this;
    }

    /**
     * Lista com os códigos dos lacres vinculados ao veículo&lt;br&gt;Tamanho de cada lacre: 15
     *
     * @return lacres
     **/
    @JsonProperty("lacres")
    public List<String> getLacres() {
        return lacres;
    }

    public void setLacres(List<String> lacres) {
        this.lacres = lacres;
    }

    public Veiculo lacres(List<String> lacres) {
        this.lacres = lacres;
        return this;
    }

    public Veiculo addLacresItem(String lacresItem) {
        this.lacres.add(lacresItem);
        return this;
    }


    @Override
    public String toString() {

        String sb = "class Veiculo {\n" +
                "    placa: " + toIndentedString(placa) + "\n" +
                "    lacres: " + toIndentedString(lacres) + "\n" +
                "}";
        return sb;
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
}

