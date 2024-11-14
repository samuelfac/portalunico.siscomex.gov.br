package br.gov.siscomex.portalunico.cct_ext.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Consignatario", propOrder =
        {"consignadoAOrdem", "nomeConsignatario", "enderecoConsignatario", "paisDestino", "dadosCarga"
        })

@XmlRootElement(name = "Consignatario")
/**
 * Informações do Consignatário
 **/
@ApiModel(description = "Informações do Consignatário")
public class Consignatario {

    @XmlElement(name = "consignadoAOrdem", required = true)
    @ApiModelProperty(example = "N", required = true, value = "Indicador de consignação à ordem<br>Domínio: Domínio: S (Sim), N(Não).")
    /**
     * Indicador de consignação à ordem<br>Domínio: Domínio: S (Sim), N(Não).
     **/
    private String consignadoAOrdem = null;

    @XmlElement(name = "nomeConsignatario", required = true)
    @ApiModelProperty(example = "Nome do Consignatário", required = true, value = "Nome do consignatário<br>Informado e obrigatório apenas se indicador de consignação à ordem igual a Não.")
    /**
     * Nome do consignatário<br>Informado e obrigatório apenas se indicador de consignação à ordem igual a Não.
     **/
    private String nomeConsignatario = null;

    @XmlElement(name = "enderecoConsignatario", required = true)
    @ApiModelProperty(example = "Endereço do consignatário", required = true, value = "Endereço do consignatário<br>Informado e obrigatório apenas se indicador de consignação à ordem igual a Não.")
    /**
     * Endereço do consignatário<br>Informado e obrigatório apenas se indicador de consignação à ordem igual a Não.
     **/
    private String enderecoConsignatario = null;

    @XmlElement(name = "paisDestino", required = true)
    @ApiModelProperty(example = "US", required = true, value = "Código do país de destino da carga<br>Domínio: Tabela de Países - código ISO/ALFA2.")
    /**
     * Código do país de destino da carga<br>Domínio: Tabela de Países - código ISO/ALFA2.
     **/
    private String paisDestino = null;

    @XmlElement(name = "dadosCarga", required = true)
    @ApiModelProperty(required = true, value = "Dados das cargas Manifestadas")
    @Valid
    /**
     * Dados das cargas Manifestadas
     **/
    private List<DadosCarga> dadosCarga = new ArrayList<>();

    /**
     * Indicador de consignação à ordem&lt;br&gt;Domínio: Domínio: S (Sim), N(Não).
     *
     * @return consignadoAOrdem
     **/
    @JsonProperty("consignadoAOrdem")
    @NotNull
    public String getConsignadoAOrdem() {
        return consignadoAOrdem;
    }

    public void setConsignadoAOrdem(String consignadoAOrdem) {
        this.consignadoAOrdem = consignadoAOrdem;
    }

    public Consignatario consignadoAOrdem(String consignadoAOrdem) {
        this.consignadoAOrdem = consignadoAOrdem;
        return this;
    }

    /**
     * Nome do consignatário&lt;br&gt;Informado e obrigatório apenas se indicador de consignação à ordem igual a Não.
     *
     * @return nomeConsignatario
     **/
    @JsonProperty("nomeConsignatario")
    @NotNull
    public String getNomeConsignatario() {
        return nomeConsignatario;
    }

    public void setNomeConsignatario(String nomeConsignatario) {
        this.nomeConsignatario = nomeConsignatario;
    }

    public Consignatario nomeConsignatario(String nomeConsignatario) {
        this.nomeConsignatario = nomeConsignatario;
        return this;
    }

    /**
     * Endereço do consignatário&lt;br&gt;Informado e obrigatório apenas se indicador de consignação à ordem igual a Não.
     *
     * @return enderecoConsignatario
     **/
    @JsonProperty("enderecoConsignatario")
    @NotNull
    public String getEnderecoConsignatario() {
        return enderecoConsignatario;
    }

    public void setEnderecoConsignatario(String enderecoConsignatario) {
        this.enderecoConsignatario = enderecoConsignatario;
    }

    public Consignatario enderecoConsignatario(String enderecoConsignatario) {
        this.enderecoConsignatario = enderecoConsignatario;
        return this;
    }

    /**
     * Código do país de destino da carga&lt;br&gt;Domínio: Tabela de Países - código ISO/ALFA2.
     *
     * @return paisDestino
     **/
    @JsonProperty("paisDestino")
    @NotNull
    public String getPaisDestino() {
        return paisDestino;
    }

    public void setPaisDestino(String paisDestino) {
        this.paisDestino = paisDestino;
    }

    public Consignatario paisDestino(String paisDestino) {
        this.paisDestino = paisDestino;
        return this;
    }

    /**
     * Dados das cargas Manifestadas
     *
     * @return dadosCarga
     **/
    @JsonProperty("dadosCarga")
    @NotNull
    public List<DadosCarga> getDadosCarga() {
        return dadosCarga;
    }

    public void setDadosCarga(List<DadosCarga> dadosCarga) {
        this.dadosCarga = dadosCarga;
    }

    public Consignatario dadosCarga(List<DadosCarga> dadosCarga) {
        this.dadosCarga = dadosCarga;
        return this;
    }

    public Consignatario addDadosCargaItem(DadosCarga dadosCargaItem) {
        this.dadosCarga.add(dadosCargaItem);
        return this;
    }


    @Override
    public String toString() {

        String sb = "class Consignatario {\n" +
                "    consignadoAOrdem: " + toIndentedString(consignadoAOrdem) + "\n" +
                "    nomeConsignatario: " + toIndentedString(nomeConsignatario) + "\n" +
                "    enderecoConsignatario: " + toIndentedString(enderecoConsignatario) + "\n" +
                "    paisDestino: " + toIndentedString(paisDestino) + "\n" +
                "    dadosCarga: " + toIndentedString(dadosCarga) + "\n" +
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

